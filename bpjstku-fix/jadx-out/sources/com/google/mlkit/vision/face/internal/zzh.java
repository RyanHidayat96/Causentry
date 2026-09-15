package com.google.mlkit.vision.face.internal;

import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_face.zzdk;
import com.google.android.gms.internal.mlkit_vision_face.zzdl;
import com.google.android.gms.internal.mlkit_vision_face.zzdn;
import com.google.android.gms.internal.mlkit_vision_face.zzjv;
import com.google.android.gms.internal.mlkit_vision_face.zzke;
import com.google.android.gms.internal.mlkit_vision_face.zzkf;
import com.google.android.gms.internal.mlkit_vision_face.zzkj;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zzlj;
import com.google.android.gms.internal.mlkit_vision_face.zzll;
import com.google.android.gms.internal.mlkit_vision_face.zznr;
import com.google.android.gms.internal.mlkit_vision_face.zzoa;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzoe;
import com.google.android.gms.internal.mlkit_vision_face.zzof;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.BitmapInStreamingChecker;
import com.google.mlkit.vision.common.internal.ImageUtils;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class zzh extends MLTask {
    static final AtomicBoolean zza = new AtomicBoolean(true);
    private static final ImageUtils zzb = ImageUtils.getInstance();
    private final FaceDetectorOptions zzc;
    private final zzoc zzd;
    private final zzoe zze;
    private final zzb zzf;
    private boolean zzg;
    private final BitmapInStreamingChecker zzh = new BitmapInStreamingChecker();

    public zzh(zzoc zzocVar, FaceDetectorOptions faceDetectorOptions, zzb zzbVar) {
        Preconditions.checkNotNull(faceDetectorOptions, "FaceDetectorOptions can not be null");
        this.zzc = faceDetectorOptions;
        this.zzd = zzocVar;
        this.zzf = zzbVar;
        this.zze = zzoe.zza(MlKitContext.getInstance().getApplicationContext());
    }

    static void zzf(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Face) it.next()).zzc(-1);
        }
    }

    private final void zzg(final zzks zzksVar, long j, final InputImage inputImage, final int i, final int i2) {
        synchronized (this) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
            this.zzd.zzf(new zzoa() { // from class: com.google.mlkit.vision.face.internal.zzf
                @Override // com.google.android.gms.internal.mlkit_vision_face.zzoa
                public final zznr zza() {
                    return this.zza.zzc(jElapsedRealtime, zzksVar, i, i2, inputImage);
                }
            }, zzkt.ON_DEVICE_FACE_DETECT);
            zzdl zzdlVar = new zzdl();
            zzdlVar.zzc(zzksVar);
            zzdlVar.zzd(Boolean.valueOf(zza.get()));
            zzdlVar.zza(Integer.valueOf(i));
            zzdlVar.zze(Integer.valueOf(i2));
            zzdlVar.zzb(zzj.zza(this.zzc));
            final zzdn zzdnVarZzf = zzdlVar.zzf();
            final zzg zzgVar = new zzg(this);
            final zzoc zzocVar = this.zzd;
            final zzkt zzktVar = zzkt.AGGREGATED_ON_DEVICE_FACE_DETECTION;
            final byte[] bArr = null;
            MLTaskExecutor.workerThreadExecutor().execute(new Runnable(zzktVar, zzdnVarZzf, jElapsedRealtime, zzgVar, bArr) { // from class: com.google.android.gms.internal.mlkit_vision_face.zzny
                public final /* synthetic */ zzkt zzb;
                public final /* synthetic */ Object zzc;
                public final /* synthetic */ long zzd;
                public final /* synthetic */ com.google.mlkit.vision.face.internal.zzg zze;

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzh(this.zzb, this.zzc, this.zzd, this.zze);
                }
            });
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.zze.zzc(true != this.zzg ? 24303 : 24304, zzksVar.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
        }
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final void load() throws MlKitException {
        synchronized (this) {
            this.zzg = this.zzf.zzd();
        }
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final void release() {
        synchronized (this) {
            this.zzf.zzb();
            zza.set(true);
            zzoc zzocVar = this.zzd;
            zzku zzkuVar = new zzku();
            zzkuVar.zze(this.zzg ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
            zzocVar.zzd(zzof.zzf(zzkuVar), zzkt.ON_DEVICE_FACE_CLOSE);
        }
    }

    final /* synthetic */ zznr zzc(long j, zzks zzksVar, int i, int i2, InputImage inputImage) {
        zzkf zzkfVar;
        zzlj zzljVar = new zzlj();
        zzkj zzkjVar = new zzkj();
        zzkjVar.zzc(Long.valueOf(j));
        zzkjVar.zzd(zzksVar);
        zzkjVar.zze(Boolean.valueOf(zza.get()));
        Boolean bool = Boolean.TRUE;
        zzkjVar.zza(bool);
        zzkjVar.zzb(bool);
        zzljVar.zzg(zzkjVar.zzf());
        zzljVar.zze(zzj.zza(this.zzc));
        zzljVar.zzd(Integer.valueOf(i));
        zzljVar.zzh(Integer.valueOf(i2));
        ImageUtils imageUtils = zzb;
        int mobileVisionImageFormat = imageUtils.getMobileVisionImageFormat(inputImage);
        int mobileVisionImageSize = imageUtils.getMobileVisionImageSize(inputImage);
        zzke zzkeVar = new zzke();
        if (mobileVisionImageFormat == -1) {
            zzkfVar = zzkf.BITMAP;
        } else if (mobileVisionImageFormat == 35) {
            zzkfVar = zzkf.YUV_420_888;
        } else if (mobileVisionImageFormat == 842094169) {
            zzkfVar = zzkf.YV12;
        } else if (mobileVisionImageFormat != 16) {
            zzkfVar = mobileVisionImageFormat != 17 ? zzkf.UNKNOWN_FORMAT : zzkf.NV21;
        } else {
            zzkfVar = zzkf.NV16;
        }
        zzkeVar.zza(zzkfVar);
        zzkeVar.zzb(Integer.valueOf(mobileVisionImageSize));
        zzljVar.zzf(zzkeVar.zzd());
        zzll zzllVarZzi = zzljVar.zzi();
        zzku zzkuVar = new zzku();
        zzkuVar.zze(this.zzg ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
        zzkuVar.zzg(zzllVarZzi);
        return zzof.zzf(zzkuVar);
    }

    final /* synthetic */ zznr zzd(zzdn zzdnVar, int i, zzjv zzjvVar) {
        zzku zzkuVar = new zzku();
        zzkuVar.zze(this.zzg ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
        zzdk zzdkVar = new zzdk();
        zzdkVar.zza(Integer.valueOf(i));
        zzdkVar.zzc(zzdnVar);
        zzdkVar.zzb(zzjvVar);
        zzkuVar.zzd(zzdkVar.zze());
        return zzof.zzf(zzkuVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:42:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x010a A[Catch: MlKitException -> 0x0129, all -> 0x0148, TryCatch #1 {, blocks: (B:4:0x0005, B:5:0x000e, B:9:0x0021, B:10:0x002a, B:12:0x002d, B:40:0x0104, B:47:0x0118, B:46:0x0113, B:43:0x010a, B:15:0x003a, B:16:0x0041, B:17:0x004a, B:19:0x0050, B:20:0x005b, B:22:0x0061, B:24:0x006d, B:26:0x0073, B:28:0x0081, B:30:0x00ab, B:32:0x00cf, B:34:0x00de, B:54:0x012e, B:56:0x0136, B:58:0x013b, B:59:0x0147, B:57:0x0139, B:37:0x00f1, B:39:0x00fc), top: B:64:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0111  */
    /* JADX WARN: Code duplicated, block: B:46:0x0113 A[Catch: MlKitException -> 0x0129, all -> 0x0148, TryCatch #1 {, blocks: (B:4:0x0005, B:5:0x000e, B:9:0x0021, B:10:0x002a, B:12:0x002d, B:40:0x0104, B:47:0x0118, B:46:0x0113, B:43:0x010a, B:15:0x003a, B:16:0x0041, B:17:0x004a, B:19:0x0050, B:20:0x005b, B:22:0x0061, B:24:0x006d, B:26:0x0073, B:28:0x0081, B:30:0x00ab, B:32:0x00cf, B:34:0x00de, B:54:0x012e, B:56:0x0136, B:58:0x013b, B:59:0x0147, B:57:0x0139, B:37:0x00f1, B:39:0x00fc), top: B:64:0x0005 }] */
    @Override // com.google.mlkit.common.sdkinternal.MLTask
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final List run(InputImage inputImage) throws MlKitException {
        long j;
        List arrayList;
        Iterator it;
        Iterator it2;
        List list;
        int size;
        int size2;
        synchronized (this) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.zzh.check(inputImage);
            try {
                Pair pairZza = this.zzf.zza(inputImage);
                List list2 = (List) pairZza.first;
                List list3 = (List) pairZza.second;
                if (list2 == null && list3 == null) {
                    throw new MlKitException("No detector is enabled", 13);
                }
                if (list2 == null) {
                    list = (List) Preconditions.checkNotNull(list3);
                } else if (list3 == null) {
                    list = (List) Preconditions.checkNotNull(list2);
                } else {
                    HashSet hashSet = new HashSet();
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        Face face = (Face) it3.next();
                        Iterator it4 = list2.iterator();
                        boolean z = false;
                        while (it4.hasNext()) {
                            Face face2 = (Face) it4.next();
                            if (face.getBoundingBox() == null || face2.getBoundingBox() == null) {
                                it = it3;
                                it2 = it4;
                                j = jElapsedRealtime;
                            } else {
                                Rect boundingBox = face.getBoundingBox();
                                Rect boundingBox2 = face2.getBoundingBox();
                                if (boundingBox.intersect(boundingBox2)) {
                                    it = it3;
                                    it2 = it4;
                                    j = jElapsedRealtime;
                                    double dMin = (Math.min(boundingBox.right, boundingBox2.right) - Math.max(boundingBox.left, boundingBox2.left)) * (Math.min(boundingBox.bottom, boundingBox2.bottom) - Math.max(boundingBox.top, boundingBox2.top));
                                    try {
                                        if (dMin / ((((double) ((boundingBox.right - boundingBox.left) * (boundingBox.bottom - boundingBox.top))) + ((double) ((boundingBox2.right - boundingBox2.left) * (boundingBox2.bottom - boundingBox2.top)))) - dMin) > 0.6d) {
                                            face2.zzb(face.zza());
                                            z = true;
                                        }
                                    } catch (MlKitException e2) {
                                        e = e2;
                                        zzg(e.getErrorCode() == 14 ? zzks.MODEL_NOT_DOWNLOADED : zzks.UNKNOWN_ERROR, j, inputImage, 0, 0);
                                        throw e;
                                    }
                                } else {
                                    it = it3;
                                    it2 = it4;
                                    j = jElapsedRealtime;
                                }
                            }
                            hashSet.add(face2);
                            it3 = it;
                            it4 = it2;
                            jElapsedRealtime = j;
                        }
                        Iterator it5 = it3;
                        long j2 = jElapsedRealtime;
                        if (!z) {
                            hashSet.add(face);
                        }
                        it3 = it5;
                        jElapsedRealtime = j2;
                    }
                    j = jElapsedRealtime;
                    arrayList = new ArrayList(hashSet);
                    zzks zzksVar = zzks.NO_ERROR;
                    if (list3 == null) {
                        size = 0;
                    } else {
                        size = list3.size();
                    }
                    if (list2 == null) {
                        size2 = 0;
                    } else {
                        size2 = list2.size();
                    }
                    zzg(zzksVar, j, inputImage, size, size2);
                    zza.set(false);
                }
                arrayList = list;
                j = jElapsedRealtime;
                zzks zzksVar2 = zzks.NO_ERROR;
                if (list3 == null) {
                    size = 0;
                } else {
                    size = list3.size();
                }
                if (list2 == null) {
                    size2 = 0;
                } else {
                    size2 = list2.size();
                }
                zzg(zzksVar2, j, inputImage, size, size2);
                zza.set(false);
            } catch (MlKitException e3) {
                e = e3;
                j = jElapsedRealtime;
            }
        }
        return arrayList;
    }
}
