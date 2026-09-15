package com.google.mlkit.common.sdkinternal.model;

import android.app.DownloadManager;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.ParcelFileDescriptor;
import android.util.LongSparseArray;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zziy;
import com.google.android.gms.internal.mlkit_common.zzje;
import com.google.android.gms.internal.mlkit_common.zzmh;
import com.google.android.gms.internal.mlkit_common.zzmq;
import com.google.android.gms.internal.mlkit_common.zzmt;
import com.google.android.gms.internal.mlkit_common.zznb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelInfo;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class RemoteModelDownloadManager {
    private static final GmsLogger zza = new GmsLogger("ModelDownloadManager", "");
    private static final Map zzb = new HashMap();
    private final LongSparseArray zzc = new LongSparseArray();
    private final LongSparseArray zzd = new LongSparseArray();
    private final MlKitContext zze;
    private final DownloadManager zzf;
    private final RemoteModel zzg;
    private final ModelType zzh;
    private final zzmq zzi;
    private final SharedPrefManager zzj;
    private final ModelFileHelper zzk;
    private final ModelInfoRetrieverInterop zzl;
    private final RemoteModelFileManager zzm;
    private DownloadConditions zzn;

    RemoteModelDownloadManager(MlKitContext mlKitContext, RemoteModel remoteModel, ModelFileHelper modelFileHelper, RemoteModelFileManager remoteModelFileManager, ModelInfoRetrieverInterop modelInfoRetrieverInterop, zzmq zzmqVar) {
        this.zze = mlKitContext;
        this.zzh = remoteModel.getModelType();
        this.zzg = remoteModel;
        DownloadManager downloadManager = (DownloadManager) mlKitContext.getApplicationContext().getSystemService("download");
        this.zzf = downloadManager;
        this.zzi = zzmqVar;
        if (downloadManager == null) {
            zza.d("ModelDownloadManager", "Download manager service is not available in the service.");
        }
        this.zzk = modelFileHelper;
        this.zzj = SharedPrefManager.getInstance(mlKitContext);
        this.zzl = modelInfoRetrieverInterop;
        this.zzm = remoteModelFileManager;
    }

    public static RemoteModelDownloadManager getInstance(MlKitContext mlKitContext, RemoteModel remoteModel, ModelFileHelper modelFileHelper, RemoteModelFileManager remoteModelFileManager, ModelInfoRetrieverInterop modelInfoRetrieverInterop) {
        RemoteModelDownloadManager remoteModelDownloadManager;
        synchronized (RemoteModelDownloadManager.class) {
            Map map = zzb;
            if (!map.containsKey(remoteModel)) {
                map.put(remoteModel, new RemoteModelDownloadManager(mlKitContext, remoteModel, modelFileHelper, remoteModelFileManager, modelInfoRetrieverInterop, zznb.zzb("common")));
            }
            remoteModelDownloadManager = (RemoteModelDownloadManager) map.get(remoteModel);
        }
        return remoteModelDownloadManager;
    }

    private final Task zzj(long j) {
        this.zze.getApplicationContext().registerReceiver(zzm(j), new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), null, MLTaskExecutor.getInstance().getHandler());
        return zzk(j).getTask();
    }

    private final TaskCompletionSource zzk(long j) {
        synchronized (this) {
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.zzd.get(j);
            if (taskCompletionSource != null) {
                return taskCompletionSource;
            }
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            this.zzd.put(j, taskCompletionSource2);
            return taskCompletionSource2;
        }
    }

    private final zzd zzm(long j) {
        synchronized (this) {
            zzd zzdVar = (zzd) this.zzc.get(j);
            if (zzdVar != null) {
                return zzdVar;
            }
            zzd zzdVar2 = new zzd(this, j, zzk(j), null);
            this.zzc.put(j, zzdVar2);
            return zzdVar2;
        }
    }

    private final Long zzn(DownloadManager.Request request, ModelInfo modelInfo) {
        synchronized (this) {
            DownloadManager downloadManager = this.zzf;
            if (downloadManager == null) {
                return null;
            }
            long jEnqueue = downloadManager.enqueue(request);
            GmsLogger gmsLogger = zza;
            StringBuilder sb = new StringBuilder("Schedule a new downloading task: ");
            sb.append(jEnqueue);
            gmsLogger.d("ModelDownloadManager", sb.toString());
            this.zzj.setDownloadingModelInfo(jEnqueue, modelInfo);
            this.zzi.zzf(zzmt.zzg(), this.zzg, zziy.NO_ERROR, false, modelInfo.getModelType(), zzje.SCHEDULED);
            return Long.valueOf(jEnqueue);
        }
    }

    private final Long zzo(ModelInfo modelInfo, DownloadConditions downloadConditions) throws MlKitException {
        synchronized (this) {
            Preconditions.checkNotNull(downloadConditions, "DownloadConditions can not be null");
            String downloadingModelHash = this.zzj.getDownloadingModelHash(this.zzg);
            Integer downloadingModelStatusCode = getDownloadingModelStatusCode();
            if (downloadingModelHash != null && downloadingModelHash.equals(modelInfo.getModelHash()) && downloadingModelStatusCode != null) {
                Integer downloadingModelStatusCode2 = getDownloadingModelStatusCode();
                if (downloadingModelStatusCode2 == null || (downloadingModelStatusCode2.intValue() != 8 && downloadingModelStatusCode2.intValue() != 16)) {
                    this.zzi.zzf(zzmt.zzg(), this.zzg, zziy.NO_ERROR, false, this.zzg.getModelType(), zzje.DOWNLOADING);
                }
                zza.d("ModelDownloadManager", "New model is already in downloading, do nothing.");
                return null;
            }
            GmsLogger gmsLogger = zza;
            gmsLogger.d("ModelDownloadManager", "Need to download a new model.");
            removeOrCancelDownload();
            DownloadManager.Request request = new DownloadManager.Request(modelInfo.getModelUri());
            if (this.zzk.modelExistsLocally(modelInfo.getModelNameForPersist(), modelInfo.getModelType())) {
                gmsLogger.d("ModelDownloadManager", "Model update is enabled and have a previous downloaded model, use download condition");
                this.zzi.zzf(zzmt.zzg(), this.zzg, zziy.NO_ERROR, false, modelInfo.getModelType(), zzje.UPDATE_AVAILABLE);
            }
            request.setRequiresCharging(downloadConditions.isChargingRequired());
            if (downloadConditions.isWifiRequired()) {
                request.setAllowedNetworkTypes(2);
            }
            return zzn(request, modelInfo);
        }
    }

    public Task<Void> ensureModelDownloaded() {
        MlKitException mlKitException;
        ModelInfo modelInfoZzg;
        this.zzi.zzf(zzmt.zzg(), this.zzg, zziy.NO_ERROR, false, ModelType.UNKNOWN, zzje.EXPLICITLY_REQUESTED);
        Long lZzo = null;
        try {
            modelInfoZzg = zzg();
            mlKitException = null;
        } catch (MlKitException e2) {
            mlKitException = e2;
            modelInfoZzg = null;
        }
        try {
            Integer downloadingModelStatusCode = getDownloadingModelStatusCode();
            Long downloadingId = getDownloadingId();
            if (!modelExistsLocally() && (downloadingModelStatusCode == null || downloadingModelStatusCode.intValue() != 8)) {
                if (downloadingModelStatusCode != null && downloadingModelStatusCode.intValue() == 16) {
                    MlKitException mlKitExceptionZzl = zzl(downloadingId);
                    removeOrCancelDownload();
                    return Tasks.forException(mlKitExceptionZzl);
                }
                if (downloadingModelStatusCode == null || (!(downloadingModelStatusCode.intValue() == 4 || downloadingModelStatusCode.intValue() == 2 || downloadingModelStatusCode.intValue() == 1) || downloadingId == null || getDownloadingModelHash() == null)) {
                    if (modelInfoZzg != null) {
                        lZzo = zzo(modelInfoZzg, this.zzn);
                    }
                    return lZzo == null ? Tasks.forException(new MlKitException("Failed to schedule the download task", 13, mlKitException)) : zzj(lZzo.longValue());
                }
                zzmq zzmqVar = this.zzi;
                zzmh zzmhVarZzg = zzmt.zzg();
                RemoteModel remoteModel = this.zzg;
                zzmqVar.zzf(zzmhVarZzg, remoteModel, zziy.NO_ERROR, false, remoteModel.getModelType(), zzje.DOWNLOADING);
                return zzj(downloadingId.longValue());
            }
            if (modelInfoZzg != null) {
                Long lZzo2 = zzo(modelInfoZzg, this.zzn);
                if (lZzo2 != null) {
                    return zzj(lZzo2.longValue());
                }
                zza.i("ModelDownloadManager", "Didn't schedule download for the updated model");
            }
            return Tasks.forResult(null);
        } catch (MlKitException e3) {
            return Tasks.forException(new MlKitException("Failed to ensure the model is downloaded.", 13, e3));
        }
    }

    public ParcelFileDescriptor getDownloadedFile() {
        synchronized (this) {
            try {
                Long downloadingId = getDownloadingId();
                DownloadManager downloadManager = this.zzf;
                ParcelFileDescriptor parcelFileDescriptorOpenDownloadedFile = null;
                if (downloadManager == null || downloadingId == null) {
                    return null;
                }
                try {
                    parcelFileDescriptorOpenDownloadedFile = downloadManager.openDownloadedFile(downloadingId.longValue());
                } catch (FileNotFoundException unused) {
                    zza.e("ModelDownloadManager", "Downloaded file is not found");
                }
                return parcelFileDescriptorOpenDownloadedFile;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Long getDownloadingId() {
        Long downloadingModelId;
        synchronized (this) {
            downloadingModelId = this.zzj.getDownloadingModelId(this.zzg);
        }
        return downloadingModelId;
    }

    public String getDownloadingModelHash() {
        String downloadingModelHash;
        synchronized (this) {
            downloadingModelHash = this.zzj.getDownloadingModelHash(this.zzg);
        }
        return downloadingModelHash;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:16:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0041 A[Catch: all -> 0x008e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:3:0x0001, B:6:0x000c, B:17:0x0041, B:33:0x006c, B:40:0x008b, B:39:0x0076, B:8:0x0025, B:10:0x002b, B:20:0x0046, B:22:0x004d, B:24:0x0054, B:26:0x005a, B:28:0x0062), top: B:53:0x0001, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0046 A[Catch: all -> 0x003a, TRY_ENTER, TryCatch #2 {all -> 0x003a, blocks: (B:8:0x0025, B:10:0x002b, B:20:0x0046, B:22:0x004d, B:24:0x0054, B:26:0x005a, B:28:0x0062), top: B:51:0x0025, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    public Integer getDownloadingModelStatusCode() {
        Integer numValueOf;
        synchronized (this) {
            Long downloadingId = getDownloadingId();
            DownloadManager downloadManager = this.zzf;
            if (downloadManager == null || downloadingId == null) {
                return null;
            }
            Cursor cursorQuery = downloadManager.query(new DownloadManager.Query().setFilterById(downloadingId.longValue()));
            if (cursorQuery == null) {
                numValueOf = null;
                if (numValueOf == null) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                if (numValueOf.intValue() != 2) {
                }
                cursorQuery.close();
                return num;
            }
            try {
                if (cursorQuery.moveToFirst()) {
                    numValueOf = Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex(NotificationCompat.CATEGORY_STATUS)));
                } else {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                Integer num = (numValueOf.intValue() != 2 || numValueOf.intValue() == 4 || numValueOf.intValue() == 1 || numValueOf.intValue() == 8 || numValueOf.intValue() == 16) ? numValueOf : null;
                cursorQuery.close();
                return num;
            } catch (Throwable th) {
                try {
                    cursorQuery.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
            throw th;
        }
    }

    public boolean isModelDownloadedAndValid() throws MlKitException {
        try {
            if (modelExistsLocally()) {
                return true;
            }
        } catch (MlKitException unused) {
            zza.d("ModelDownloadManager", "Failed to check if the model exist locally.");
        }
        Long downloadingId = getDownloadingId();
        String downloadingModelHash = getDownloadingModelHash();
        if (downloadingId == null || downloadingModelHash == null) {
            zza.d("ModelDownloadManager", "No new model is downloading.");
            removeOrCancelDownload();
            return false;
        }
        Integer downloadingModelStatusCode = getDownloadingModelStatusCode();
        GmsLogger gmsLogger = zza;
        Objects.toString(downloadingModelStatusCode);
        gmsLogger.d("ModelDownloadManager", "Download Status code: ".concat(String.valueOf(downloadingModelStatusCode)));
        if (downloadingModelStatusCode != null) {
            return com.google.android.gms.common.internal.Objects.equal(downloadingModelStatusCode, 8) && zzi(downloadingModelHash) != null;
        }
        removeOrCancelDownload();
        return false;
    }

    public boolean modelExistsLocally() throws MlKitException {
        return this.zzk.modelExistsLocally(this.zzg.getUniqueModelNameForPersist(), this.zzh);
    }

    public void removeOrCancelDownload() throws MlKitException {
        synchronized (this) {
            Long downloadingId = getDownloadingId();
            if (this.zzf == null || downloadingId == null) {
                return;
            }
            GmsLogger gmsLogger = zza;
            Objects.toString(downloadingId);
            gmsLogger.d("ModelDownloadManager", "Cancel or remove existing downloading task: ".concat(downloadingId.toString()));
            if (this.zzf.remove(downloadingId.longValue()) > 0 || getDownloadingModelStatusCode() == null) {
                this.zzk.deleteTempFilesInPrivateFolder(this.zzg.getUniqueModelNameForPersist(), this.zzg.getModelType());
                this.zzj.clearDownloadingModelInfo(this.zzg);
            }
        }
    }

    public void setDownloadConditions(DownloadConditions downloadConditions) {
        Preconditions.checkNotNull(downloadConditions, "DownloadConditions can not be null");
        this.zzn = downloadConditions;
    }

    public void updateLatestModelHashAndType(String str) throws MlKitException {
        synchronized (this) {
            this.zzj.setLatestModelHash(this.zzg, str);
            removeOrCancelDownload();
        }
    }

    final ModelInfo zzg() throws MlKitException {
        boolean z;
        synchronized (this) {
            boolean zModelExistsLocally = modelExistsLocally();
            if (zModelExistsLocally) {
                this.zzi.zzf(zzmt.zzg(), this.zzg, zziy.NO_ERROR, false, this.zzg.getModelType(), zzje.LIVE);
            }
            ModelInfoRetrieverInterop modelInfoRetrieverInterop = this.zzl;
            if (modelInfoRetrieverInterop == null) {
                throw new MlKitException("Please include com.google.mlkit:linkfirebase sdk as your dependency when you try to download from Firebase.", 14);
            }
            ModelInfo modelInfoRetrieveRemoteModelInfo = modelInfoRetrieverInterop.retrieveRemoteModelInfo(this.zzg);
            if (modelInfoRetrieveRemoteModelInfo == null) {
                return null;
            }
            MlKitContext mlKitContext = this.zze;
            RemoteModel remoteModel = this.zzg;
            String modelHash = modelInfoRetrieveRemoteModelInfo.getModelHash();
            SharedPrefManager sharedPrefManager = SharedPrefManager.getInstance(mlKitContext);
            boolean zEquals = modelHash.equals(sharedPrefManager.getIncompatibleModelHash(remoteModel));
            boolean z2 = false;
            if (zEquals && CommonUtils.getAppVersion(mlKitContext.getApplicationContext()).equals(sharedPrefManager.getPreviousAppVersion())) {
                zza.e("ModelDownloadManager", "The model is incompatible with TFLite and the app is not upgraded, do not download");
                z = false;
            } else {
                z = true;
            }
            if (!zModelExistsLocally) {
                this.zzj.clearLatestModelHash(this.zzg);
            }
            boolean zEquals2 = modelInfoRetrieveRemoteModelInfo.getModelHash().equals(SharedPrefManager.getInstance(this.zze).getLatestModelHash(this.zzg));
            if (!z) {
                z2 = !zEquals2;
            } else if (!zModelExistsLocally || !zEquals2) {
                return modelInfoRetrieveRemoteModelInfo;
            }
            if (zModelExistsLocally && (z2 ^ z)) {
                return null;
            }
            String modelName = this.zzg.getModelName();
            StringBuilder sb = new StringBuilder("The model ");
            sb.append(modelName);
            sb.append(" is incompatible with TFLite runtime");
            throw new MlKitException(sb.toString(), 100);
        }
    }

    public final File zzi(String str) throws MlKitException {
        GmsLogger gmsLogger = zza;
        gmsLogger.d("ModelDownloadManager", "Model downloaded successfully");
        this.zzi.zzf(zzmt.zzg(), this.zzg, zziy.NO_ERROR, true, this.zzh, zzje.SUCCEEDED);
        ParcelFileDescriptor downloadedFile = getDownloadedFile();
        if (downloadedFile == null) {
            removeOrCancelDownload();
            return null;
        }
        gmsLogger.d("ModelDownloadManager", "moving downloaded model from external storage to private folder.");
        try {
            return this.zzm.moveModelToPrivateFolder(downloadedFile, str, this.zzg);
        } finally {
            removeOrCancelDownload();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MlKitException zzl(Long l) {
        DownloadManager downloadManager = this.zzf;
        Cursor cursorQuery = null;
        if (downloadManager != null && l != null) {
            cursorQuery = downloadManager.query(new DownloadManager.Query().setFilterById(l.longValue()));
        }
        int i = 13;
        String string = "Model downloading failed";
        if (cursorQuery != null && cursorQuery.moveToFirst()) {
            int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("reason"));
            if (i2 == 1006) {
                string = "Model downloading failed due to insufficient space on the device.";
                i = 101;
            } else {
                StringBuilder sb = new StringBuilder("Model downloading failed due to error code: ");
                sb.append(i2);
                sb.append(" from Android DownloadManager");
                string = sb.toString();
            }
        }
        return new MlKitException(string, i);
    }

    public int getFailureReason(Long l) {
        int columnIndex;
        DownloadManager downloadManager = this.zzf;
        Cursor cursorQuery = null;
        if (downloadManager != null && l != null) {
            cursorQuery = downloadManager.query(new DownloadManager.Query().setFilterById(l.longValue()));
        }
        if (cursorQuery == null || !cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("reason")) == -1) {
            return 0;
        }
        return cursorQuery.getInt(columnIndex);
    }
}
