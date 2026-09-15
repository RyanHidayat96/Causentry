package com.google.mlkit.common.sdkinternal.model;

import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.mlkit_common.zzmq;
import com.google.android.gms.internal.mlkit_common.zzmt;
import com.google.android.gms.internal.mlkit_common.zznb;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class RemoteModelLoader {
    private static final GmsLogger zza = new GmsLogger("RemoteModelLoader", "");
    private static final Map zzb = new HashMap();
    private final MlKitContext zzc;
    private final RemoteModel zzd;
    private final RemoteModelDownloadManager zze;
    private final RemoteModelFileManager zzf;
    private final RemoteModelLoaderHelper zzg;
    private final zzmq zzh;
    private boolean zzi;

    private RemoteModelLoader(MlKitContext mlKitContext, RemoteModel remoteModel, ModelValidator modelValidator, RemoteModelLoaderHelper remoteModelLoaderHelper, RemoteModelFileMover remoteModelFileMover) {
        RemoteModelFileManager remoteModelFileManager = new RemoteModelFileManager(mlKitContext, remoteModel, modelValidator, new ModelFileHelper(mlKitContext), remoteModelFileMover);
        this.zzf = remoteModelFileManager;
        this.zzi = true;
        this.zze = RemoteModelDownloadManager.getInstance(mlKitContext, remoteModel, new ModelFileHelper(mlKitContext), remoteModelFileManager, (ModelInfoRetrieverInterop) mlKitContext.get(ModelInfoRetrieverInterop.class));
        this.zzg = remoteModelLoaderHelper;
        this.zzc = mlKitContext;
        this.zzd = remoteModel;
        this.zzh = zznb.zzb("common");
    }

    public static RemoteModelLoader getInstance(MlKitContext mlKitContext, RemoteModel remoteModel, ModelValidator modelValidator, RemoteModelLoaderHelper remoteModelLoaderHelper, RemoteModelFileMover remoteModelFileMover) {
        RemoteModelLoader remoteModelLoader;
        synchronized (RemoteModelLoader.class) {
            String uniqueModelNameForPersist = remoteModel.getUniqueModelNameForPersist();
            Map map = zzb;
            if (!map.containsKey(uniqueModelNameForPersist)) {
                map.put(uniqueModelNameForPersist, new RemoteModelLoader(mlKitContext, remoteModel, modelValidator, remoteModelLoaderHelper, remoteModelFileMover));
            }
            remoteModelLoader = (RemoteModelLoader) map.get(uniqueModelNameForPersist);
        }
        return remoteModelLoader;
    }

    private final MappedByteBuffer zza(String str) throws MlKitException {
        return this.zzg.loadModelAtPath(str);
    }

    private final MappedByteBuffer zzb(File file) throws MlKitException {
        try {
            return zza(file.getAbsolutePath());
        } catch (Exception e2) {
            this.zzf.zzc(file);
            throw new MlKitException("Failed to load newly downloaded model.", 14, e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b5 A[Catch: all -> 0x00f6, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x001e, B:8:0x0026, B:24:0x00b5, B:26:0x00c4, B:28:0x00cc, B:31:0x00d2, B:32:0x00f0, B:33:0x00f1, B:9:0x002d, B:11:0x0047, B:13:0x004f, B:15:0x006d, B:17:0x0075, B:18:0x0087, B:20:0x008f, B:21:0x00a6), top: B:40:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00c4 A[Catch: all -> 0x00f6, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x001e, B:8:0x0026, B:24:0x00b5, B:26:0x00c4, B:28:0x00cc, B:31:0x00d2, B:32:0x00f0, B:33:0x00f1, B:9:0x002d, B:11:0x0047, B:13:0x004f, B:15:0x006d, B:17:0x0075, B:18:0x0087, B:20:0x008f, B:21:0x00a6), top: B:40:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1 A[Catch: all -> 0x00f6, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x001e, B:8:0x0026, B:24:0x00b5, B:26:0x00c4, B:28:0x00cc, B:31:0x00d2, B:32:0x00f0, B:33:0x00f1, B:9:0x002d, B:11:0x0047, B:13:0x004f, B:15:0x006d, B:17:0x0075, B:18:0x0087, B:20:0x008f, B:21:0x00a6), top: B:40:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public MappedByteBuffer load() throws MlKitException {
        MappedByteBuffer mappedByteBufferZza;
        MappedByteBuffer mappedByteBufferZzb;
        String strZzb;
        synchronized (this) {
            GmsLogger gmsLogger = zza;
            gmsLogger.d("RemoteModelLoader", "Try to load newly downloaded model file.");
            boolean z = this.zzi;
            Long downloadingId = this.zze.getDownloadingId();
            String downloadingModelHash = this.zze.getDownloadingModelHash();
            mappedByteBufferZza = null;
            if (downloadingId == null || downloadingModelHash == null) {
                gmsLogger.d("RemoteModelLoader", "No new model is downloading.");
                this.zze.removeOrCancelDownload();
            } else {
                Integer downloadingModelStatusCode = this.zze.getDownloadingModelStatusCode();
                if (downloadingModelStatusCode == null) {
                    this.zze.removeOrCancelDownload();
                } else {
                    Objects.toString(downloadingModelStatusCode);
                    gmsLogger.d("RemoteModelLoader", "Download Status code: ".concat(downloadingModelStatusCode.toString()));
                    if (downloadingModelStatusCode.intValue() == 8) {
                        File fileZzi = this.zze.zzi(downloadingModelHash);
                        if (fileZzi != null) {
                            mappedByteBufferZzb = zzb(fileZzi);
                            gmsLogger.d("RemoteModelLoader", "Moved the downloaded model to private folder successfully: ".concat(String.valueOf(fileZzi.getParent())));
                            this.zze.updateLatestModelHashAndType(downloadingModelHash);
                            if (z && this.zzf.zzd(fileZzi)) {
                                gmsLogger.d("RemoteModelLoader", "All old models are deleted.");
                                mappedByteBufferZzb = zzb(this.zzf.zza(fileZzi));
                            }
                        }
                        if (mappedByteBufferZzb == null) {
                            gmsLogger.d("RemoteModelLoader", "Loading existing model file.");
                            strZzb = this.zzf.zzb();
                            if (strZzb == null) {
                                gmsLogger.d("RemoteModelLoader", "No existing model file");
                            } else {
                                try {
                                    mappedByteBufferZza = zza(strZzb);
                                } catch (Exception e2) {
                                    this.zzf.zzc(new File(strZzb));
                                    SharedPrefManager.getInstance(this.zzc).clearLatestModelHash(this.zzd);
                                    throw new MlKitException("Failed to load an already downloaded model.", 14, e2);
                                }
                            }
                        } else {
                            this.zzi = false;
                            mappedByteBufferZza = mappedByteBufferZzb;
                        }
                    } else if (downloadingModelStatusCode.intValue() == 16) {
                        this.zzh.zze(zzmt.zzg(), this.zzd, false, this.zze.getFailureReason(downloadingId));
                        this.zze.removeOrCancelDownload();
                    }
                }
            }
            mappedByteBufferZzb = null;
            if (mappedByteBufferZzb == null) {
                gmsLogger.d("RemoteModelLoader", "Loading existing model file.");
                strZzb = this.zzf.zzb();
                if (strZzb == null) {
                    gmsLogger.d("RemoteModelLoader", "No existing model file");
                } else {
                    mappedByteBufferZza = zza(strZzb);
                }
            } else {
                this.zzi = false;
                mappedByteBufferZza = mappedByteBufferZzb;
            }
        }
        return mappedByteBufferZza;
    }

    public RemoteModel getRemoteModel() {
        return this.zzd;
    }
}
