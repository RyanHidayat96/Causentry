package com.google.mlkit.common.sdkinternal.model;

import android.net.Uri;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.MlKitException;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ModelLoader {
    private static final GmsLogger zza = new GmsLogger("ModelLoader", "");
    public final LocalModelLoader localModelLoader;
    protected ModelLoadingState modelLoadingState = ModelLoadingState.NO_MODEL_LOADED;
    public final RemoteModelLoader remoteModelLoader;
    private final ModelLoadingLogger zzb;

    public interface ModelContentHandler {
        void constructModel(MappedByteBuffer mappedByteBuffer) throws MlKitException;
    }

    public interface ModelLoadingLogger {
        void logErrorCodes(List<Integer> list);
    }

    protected enum ModelLoadingState {
        NO_MODEL_LOADED,
        REMOTE_MODEL_LOADED,
        LOCAL_MODEL_LOADED
    }

    public ModelLoader(RemoteModelLoader remoteModelLoader, LocalModelLoader localModelLoader, ModelLoadingLogger modelLoadingLogger) {
        boolean z = true;
        if (remoteModelLoader == null && localModelLoader == null) {
            z = false;
        }
        Preconditions.checkArgument(z, "At least one of RemoteModelLoader or LocalModelLoader must be non-null.");
        Preconditions.checkNotNull(modelLoadingLogger);
        this.remoteModelLoader = remoteModelLoader;
        this.localModelLoader = localModelLoader;
        this.zzb = modelLoadingLogger;
    }

    private final String zza() {
        LocalModelLoader localModelLoader = this.localModelLoader;
        String string = null;
        if (localModelLoader != null) {
            if (localModelLoader.getLocalModel().getAssetFilePath() != null) {
                string = this.localModelLoader.getLocalModel().getAssetFilePath();
            } else if (this.localModelLoader.getLocalModel().getAbsoluteFilePath() != null) {
                string = this.localModelLoader.getLocalModel().getAbsoluteFilePath();
            } else if (this.localModelLoader.getLocalModel().getUri() != null) {
                string = ((Uri) Preconditions.checkNotNull(this.localModelLoader.getLocalModel().getUri())).toString();
            }
        }
        RemoteModelLoader remoteModelLoader = this.remoteModelLoader;
        return String.format("Local model path: %s. Remote model name: %s. ", string, remoteModelLoader == null ? "unspecified" : remoteModelLoader.getRemoteModel().getUniqueModelNameForPersist());
    }

    private final boolean zzb(ModelContentHandler modelContentHandler, List list) throws MlKitException {
        MappedByteBuffer mappedByteBufferLoad;
        synchronized (this) {
            LocalModelLoader localModelLoader = this.localModelLoader;
            if (localModelLoader == null || (mappedByteBufferLoad = localModelLoader.load()) == null) {
                return false;
            }
            try {
                modelContentHandler.constructModel(mappedByteBufferLoad);
                zza.d("ModelLoader", "Local model source is loaded successfully");
                return true;
            } catch (RuntimeException e2) {
                list.add(18);
                throw e2;
            }
        }
    }

    private final boolean zzc(ModelContentHandler modelContentHandler, List list) throws MlKitException {
        synchronized (this) {
            RemoteModelLoader remoteModelLoader = this.remoteModelLoader;
            if (remoteModelLoader != null) {
                try {
                    MappedByteBuffer mappedByteBufferLoad = remoteModelLoader.load();
                    if (mappedByteBufferLoad != null) {
                        try {
                            modelContentHandler.constructModel(mappedByteBufferLoad);
                            zza.d("ModelLoader", "Remote model source is loaded successfully");
                            return true;
                        } catch (RuntimeException e2) {
                            list.add(19);
                            throw e2;
                        }
                    }
                    zza.d("ModelLoader", "Remote model source can NOT be loaded, try local model.");
                    list.add(21);
                } catch (MlKitException e3) {
                    zza.d("ModelLoader", "Remote model source can NOT be loaded, try local model.");
                    list.add(20);
                    throw e3;
                }
            }
            return false;
        }
    }

    public boolean isRemoteModelLoaded() {
        ModelLoadingState modelLoadingState;
        ModelLoadingState modelLoadingState2;
        synchronized (this) {
            modelLoadingState = this.modelLoadingState;
            modelLoadingState2 = ModelLoadingState.REMOTE_MODEL_LOADED;
        }
        return modelLoadingState == modelLoadingState2;
    }

    public void loadWithModelContentHandler(ModelContentHandler modelContentHandler) throws MlKitException {
        Exception exc;
        boolean zZzc;
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            boolean zZzb = false;
            Exception e2 = null;
            try {
                zZzc = zzc(modelContentHandler, arrayList);
                exc = null;
            } catch (Exception e3) {
                exc = e3;
                zZzc = false;
            }
            if (zZzc) {
                this.zzb.logErrorCodes(arrayList);
                this.modelLoadingState = ModelLoadingState.REMOTE_MODEL_LOADED;
                return;
            }
            try {
                zZzb = zzb(modelContentHandler, arrayList);
            } catch (Exception e4) {
                e2 = e4;
            }
            if (zZzb) {
                this.zzb.logErrorCodes(arrayList);
                this.modelLoadingState = ModelLoadingState.LOCAL_MODEL_LOADED;
                return;
            }
            arrayList.add(17);
            this.zzb.logErrorCodes(arrayList);
            this.modelLoadingState = ModelLoadingState.NO_MODEL_LOADED;
            if (exc != null) {
                throw new MlKitException("Remote model load failed with the model options: ".concat(String.valueOf(zza())), 14, exc);
            }
            if (e2 == null) {
                throw new MlKitException("Cannot load any model with the model options: ".concat(String.valueOf(zza())), 14);
            }
            throw new MlKitException("Local model load failed with the model options: ".concat(String.valueOf(zza())), 14, e2);
        }
    }
}
