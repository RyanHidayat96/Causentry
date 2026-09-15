package com.google.android.libraries.places.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbkl extends zzbkp {
    private final zzbwg zza;
    private boolean zzb;
    private zzblt zzc;
    private zzbgj zzd;
    private boolean zze;
    private Runnable zzf;
    private volatile boolean zzg;
    private boolean zzh;
    private boolean zzi;

    protected zzbkl(int i, zzbwg zzbwgVar, zzbwp zzbwpVar, zzbfd zzbfdVar) {
        super(i, zzbwgVar, zzbwpVar);
        this.zzd = zzbgj.zza();
        this.zze = false;
        if (zzbwgVar == null) {
            throw new NullPointerException("statsTraceCtx");
        }
        this.zza = zzbwgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final void zzk(zzbjv zzbjvVar, zzbls zzblsVar, zzbip zzbipVar) {
        if (this.zzb) {
            return;
        }
        this.zzb = true;
        this.zza.zze(zzbjvVar);
        if (zzu() != null) {
            zzu().zzb(zzbjvVar.zzj());
        }
        this.zzc.zzc(zzbjvVar, zzblsVar, zzbipVar);
    }

    public final void zza(zzblt zzbltVar) {
        if (!(this.zzc == null)) {
            throw new IllegalStateException("Already called setListener");
        }
        if (zzbltVar == null) {
            throw new NullPointerException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
        this.zzc = zzbltVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbsk
    public void zzb(boolean z) {
        if (!this.zzh) {
            throw new IllegalStateException("status should have been reported on deframer closed");
        }
        this.zze = true;
        if (this.zzi && z) {
            zzg(zzbjv.zzh.zze("Encountered end-of-stream mid-frame"), zzbls.PROCESSED, true, new zzbip());
        }
        Runnable runnable = this.zzf;
        if (runnable != null) {
            runnable.run();
            this.zzf = null;
        }
    }

    protected final void zzd(zzbip zzbipVar) throws Throwable {
        if (!(!this.zzh)) {
            throw new IllegalStateException("Received headers on closed stream");
        }
        this.zza.zzc(zzbipVar);
        String str = (String) zzbipVar.zzb(zzbpf.zzb);
        if (str != null) {
            zzbgh zzbghVarZzc = this.zzd.zzc(str);
            if (zzbghVarZzc == null) {
                zzE(new zzbjy(zzbjv.zzh.zze(String.format("Can't find decompressor for %s", str)), null));
                return;
            } else if (zzbghVarZzc != zzbfs.zza) {
                zzq(zzbghVarZzc);
            }
        }
        this.zzc.zza(zzbipVar);
    }

    protected final void zze(zzbtu zzbtuVar) throws Throwable {
        boolean z;
        if (zzbtuVar == null) {
            throw new NullPointerException(TypedValues.AttributesType.S_FRAME);
        }
        try {
            if (this.zzh) {
                zzbkm.zzb.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                zzbtuVar.close();
                return;
            } else {
                try {
                    zzp(zzbtuVar);
                    return;
                } catch (Throwable th) {
                    th = th;
                    z = false;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            z = true;
        }
        if (z) {
            zzbtuVar.close();
        }
        throw th;
    }

    final /* synthetic */ void zzi(zzbgj zzbgjVar) {
        if (!(this.zzc == null)) {
            throw new IllegalStateException("Already called start");
        }
        if (zzbgjVar == null) {
            throw new NullPointerException("decompressorRegistry");
        }
        this.zzd = zzbgjVar;
    }

    protected final void zzf(zzbip zzbipVar, zzbjv zzbjvVar) {
        if (zzbjvVar == null) {
            throw new NullPointerException(NotificationCompat.CATEGORY_STATUS);
        }
        if (zzbipVar == null) {
            throw new NullPointerException("trailers");
        }
        if (this.zzh) {
            zzbkm.zzb.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundTrailersReceived", "Received trailers on closed stream:\n {1}\n {2}", new Object[]{zzbjvVar, zzbipVar});
        } else {
            this.zza.zzd(zzbipVar);
            zzg(zzbjvVar, zzbls.PROCESSED, false, zzbipVar);
        }
    }

    public final void zzg(zzbjv zzbjvVar, zzbls zzblsVar, boolean z, zzbip zzbipVar) {
        if (zzbjvVar == null) {
            throw new NullPointerException(NotificationCompat.CATEGORY_STATUS);
        }
        if (zzbipVar == null) {
            throw new NullPointerException("trailers");
        }
        if (this.zzh) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        this.zzh = true;
        this.zzi = zzbjvVar.zzj();
        zzs();
        if (this.zze) {
            this.zzf = null;
            zzk(zzbjvVar, zzblsVar, zzbipVar);
        } else {
            this.zzf = new zzbkk(this, zzbjvVar, zzblsVar, zzbipVar);
            zzo(z);
        }
    }

    protected final boolean zzc() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.internal.zzbkp
    protected final /* synthetic */ zzbwj zzh() {
        return this.zzc;
    }

    final /* synthetic */ void zzj() {
        this.zzg = true;
    }
}
