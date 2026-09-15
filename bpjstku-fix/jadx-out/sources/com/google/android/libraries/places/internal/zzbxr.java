package com.google.android.libraries.places.internal;

import androidx.collection.SieveCacheKt;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
final class zzbxr implements Runnable, zzbza {
    final zzbzb zza;
    boolean zzb;
    final /* synthetic */ zzbxt zzc;
    private final zzbxw zzd;

    zzbxr(zzbxt zzbxtVar, zzbzb zzbzbVar) {
        Objects.requireNonNull(zzbxtVar);
        this.zzc = zzbxtVar;
        this.zzd = new zzbxw(Level.FINE, zzbxt.class);
        this.zzb = true;
        this.zza = zzbzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbjv zzbjvVarZzP;
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName("OkHttpClientTransport");
        while (this.zza.zza(this)) {
            try {
                zzbxt zzbxtVar = this.zzc;
                if (zzbxtVar.zzY() != null) {
                    zzbxtVar.zzY().zza();
                }
            } catch (Throwable th) {
                try {
                    this.zzc.zzu(0, zzbyz.PROTOCOL_ERROR, zzbjv.zzh.zze("error in frame handler").zzd(th));
                } catch (Throwable th2) {
                    try {
                        this.zza.close();
                    } catch (IOException e2) {
                        zzbxt.zzv().logp(Level.INFO, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "run", "Exception closing frame reader", (Throwable) e2);
                    } catch (RuntimeException e3) {
                        if (!"bio == null".equals(e3.getMessage())) {
                            throw e3;
                        }
                    }
                    this.zzc.zzD().zze();
                    Thread.currentThread().setName(name);
                    throw th2;
                }
            }
        }
        zzbxt zzbxtVar2 = this.zzc;
        synchronized (zzbxtVar2.zzG()) {
            zzbjvVarZzP = zzbxtVar2.zzP();
        }
        if (zzbjvVarZzP == null) {
            zzbjvVarZzP = zzbjv.zzi.zze("End of stream or IOException");
        }
        this.zzc.zzu(0, zzbyz.INTERNAL_ERROR, zzbjvVarZzP);
        try {
            this.zza.close();
        } catch (IOException e4) {
            zzbxt.zzv().logp(Level.INFO, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "run", "Exception closing frame reader", (Throwable) e4);
        } catch (RuntimeException e5) {
            if (!"bio == null".equals(e5.getMessage())) {
                throw e5;
            }
        }
        this.zzc.zzD().zze();
        Thread.currentThread().setName(name);
    }

    @Override // com.google.android.libraries.places.internal.zzbza
    public final void zza(boolean z, int i, zzcbl zzcblVar, int i2, int i3) throws IOException {
        this.zzd.zza(1, i, zzcblVar.zze(), i2, z);
        zzbxt zzbxtVar = this.zzc;
        zzbxk zzbxkVarZzp = zzbxtVar.zzp(i);
        if (zzbxkVarZzp != null) {
            long j = i2;
            zzcblVar.zzg(j);
            zzcbj zzcbjVar = new zzcbj();
            zzcbjVar.zzc(zzcblVar.zze(), j);
            zzbxkVarZzp.zzy().zzI();
            synchronized (this.zzc.zzG()) {
                zzbxkVarZzp.zzy().zzH(zzcbjVar, z, i3 - i2);
            }
        } else {
            if (!zzbxtVar.zzo(i)) {
                zzbxt zzbxtVar2 = this.zzc;
                zzbyz zzbyzVar = zzbyz.PROTOCOL_ERROR;
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 34);
                sb.append("Received data for unknown stream: ");
                sb.append(i);
                zzbxtVar2.zzt(zzbyzVar, sb.toString());
                return;
            }
            synchronized (zzbxtVar.zzG()) {
                zzbxtVar.zzE().zzb(i, zzbyz.STREAM_CLOSED);
            }
            zzcblVar.zzt(i2);
        }
        zzbxt zzbxtVar3 = this.zzc;
        zzbxtVar3.zzK(zzbxtVar3.zzJ() + i3);
        if (zzbxtVar3.zzJ() >= zzbxtVar3.zzB() * 0.5f) {
            synchronized (zzbxtVar3.zzG()) {
                zzbxtVar3.zzE().zzk(0, zzbxtVar3.zzJ());
            }
            this.zzc.zzK(0);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbza
    public final void zzb(int i, zzbyz zzbyzVar) {
        boolean z = true;
        this.zzd.zzc(1, i, zzbyzVar);
        zzbjv zzbjvVarZzf = zzbxt.zzq(zzbyzVar).zzf("Rst Stream");
        if (zzbjvVarZzf.zzg() != zzbjs.CANCELLED && zzbjvVarZzf.zzg() != zzbjs.DEADLINE_EXCEEDED) {
            z = false;
        }
        boolean z2 = z;
        zzbxt zzbxtVar = this.zzc;
        synchronized (zzbxtVar.zzG()) {
            zzbxk zzbxkVar = (zzbxk) zzbxtVar.zzH().get(Integer.valueOf(i));
            if (zzbxkVar != null) {
                zzbxkVar.zzy().zzI();
                zzbxtVar.zzn(i, zzbjvVarZzf, zzbyzVar == zzbyz.REFUSED_STREAM ? zzbls.REFUSED : zzbls.PROCESSED, z2, null, null);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbza
    public final void zzc(boolean z, zzbzo zzbzoVar) {
        boolean zZza;
        this.zzd.zze(1, zzbzoVar);
        zzbxt zzbxtVar = this.zzc;
        synchronized (zzbxtVar.zzG()) {
            if (zzbzoVar.zzb(4)) {
                zzbxtVar.zzW(zzbzoVar.zzc(4));
            }
            if (zzbzoVar.zzb(7)) {
                zZza = zzbxtVar.zzF().zza(zzbzoVar.zzc(7));
            } else {
                zZza = false;
            }
            if (this.zzb) {
                zzbsi zzbsiVarZzD = zzbxtVar.zzD();
                zzbez zzbezVarZzN = zzbxtVar.zzN();
                zzbsiVarZzD.zza(zzbezVarZzN);
                zzbxtVar.zzO(zzbezVarZzN);
                zzbxtVar.zzD().zzb();
                this.zzb = false;
            }
            zzbxtVar.zzE().zza(zzbzoVar);
            if (zZza) {
                zzbxtVar.zzF().zzf();
            }
            zzbxtVar.zzr();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbza
    public final void zzd(boolean z, int i, int i2) {
        zzbpj zzbpjVar;
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        this.zzd.zzf(1, j);
        if (!z) {
            zzbxt zzbxtVar = this.zzc;
            synchronized (zzbxtVar.zzG()) {
                zzbxtVar.zzE().zzc(true, i, i2);
            }
            return;
        }
        zzbxt zzbxtVar2 = this.zzc;
        synchronized (zzbxtVar2.zzG()) {
            zzbpjVar = null;
            if (zzbxtVar2.zzQ() == null) {
                zzbxt.zzv().logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "ping", "Received unexpected ping ack. No ping outstanding");
            } else if (zzbxtVar2.zzQ().zza() == j) {
                zzbpj zzbpjVarZzQ = zzbxtVar2.zzQ();
                zzbxtVar2.zzR(null);
                zzbpjVar = zzbpjVarZzQ;
            } else {
                zzbxt.zzv().logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "ping", String.format(Locale.US, "Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(zzbxtVar2.zzQ().zza()), Long.valueOf(j)));
            }
        }
        if (zzbpjVar != null) {
            zzbpjVar.zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbza
    public final void zze(int i, zzbyz zzbyzVar, zzcbn zzcbnVar) {
        this.zzd.zzi(1, i, zzbyzVar, zzcbnVar);
        if (zzbyzVar == zzbyz.ENHANCE_YOUR_CALM) {
            String strZze = zzcbnVar.zze();
            zzbxt.zzv().logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "goAway", String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, strZze));
            if ("too_many_pings".equals(strZze)) {
                this.zzc.zzZ().run();
            }
        }
        zzbjv zzbjvVarZzf = zzbpd.zza(zzbyzVar.zzs).zzf("Received Goaway");
        if (zzcbnVar.zzj() > 0) {
            zzbjvVarZzf = zzbjvVarZzf.zzf(zzcbnVar.zze());
        }
        this.zzc.zzu(i, null, zzbjvVarZzf);
    }

    @Override // com.google.android.libraries.places.internal.zzbza
    public final void zzf(int i, int i2, List list) throws IOException {
        this.zzd.zzh(1, i, i2, list);
        zzbxt zzbxtVar = this.zzc;
        synchronized (zzbxtVar.zzG()) {
            zzbxtVar.zzE().zzb(i, zzbyz.PROTOCOL_ERROR);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.libraries.places.internal.zzbza
    public final void zzg(int i, long j) {
        boolean z = true;
        this.zzd.zzj(1, i, j);
        zzbxt zzbxtVar = this.zzc;
        synchronized (zzbxtVar.zzG()) {
            try {
                if (i == 0) {
                    zzbxtVar.zzF().zzb(null, (int) j);
                    return;
                }
                zzbxk zzbxkVar = (zzbxk) zzbxtVar.zzH().get(Integer.valueOf(i));
                if (zzbxkVar == null) {
                    if (zzbxtVar.zzo(i)) {
                    }
                    if (z) {
                        zzbxt zzbxtVar2 = this.zzc;
                        zzbyz zzbyzVar = zzbyz.PROTOCOL_ERROR;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 43);
                        sb.append("Received window_update for unknown stream: ");
                        sb.append(i);
                        zzbxtVar2.zzt(zzbyzVar, sb.toString());
                    }
                }
                zzbxtVar.zzF().zzb(zzbxkVar.zzy().zzK(), (int) j);
                z = false;
                if (z) {
                    zzbxt zzbxtVar3 = this.zzc;
                    zzbyz zzbyzVar2 = zzbyz.PROTOCOL_ERROR;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 43);
                    sb2.append("Received window_update for unknown stream: ");
                    sb2.append(i);
                    zzbxtVar3.zzt(zzbyzVar2, sb2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbza
    public final void zzh(boolean z, boolean z2, int i, int i2, List list, int i3) {
        boolean z3 = true;
        this.zzd.zzb(1, i, list, z2);
        zzbxt zzbxtVar = this.zzc;
        zzbjv zzbjvVarZze = null;
        if (zzbxtVar.zzaa() != Integer.MAX_VALUE) {
            long jZzj = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                zzbzd zzbzdVar = (zzbzd) list.get(i4);
                jZzj += (long) (zzbzdVar.zzf.zzj() + 32 + zzbzdVar.zzg.zzj());
            }
            int iMin = (int) Math.min(jZzj, SieveCacheKt.NodeLinkMask);
            if (iMin > zzbxtVar.zzaa()) {
                zzbjvVarZze = zzbjv.zzf.zze(String.format(Locale.US, "Response %s metadata larger than %d: %d", true != z2 ? "header" : "trailer", Integer.valueOf(zzbxtVar.zzaa()), Integer.valueOf(iMin)));
            }
        }
        synchronized (zzbxtVar.zzG()) {
            zzbxk zzbxkVar = (zzbxk) zzbxtVar.zzH().get(Integer.valueOf(i));
            if (zzbxkVar == null) {
                if (zzbxtVar.zzo(i)) {
                    zzbxtVar.zzE().zzb(i, zzbyz.STREAM_CLOSED);
                }
            } else if (zzbjvVarZze == null) {
                zzbxkVar.zzy().zzI();
                zzbxkVar.zzy().zzG(list, z2);
            } else {
                if (!z2) {
                    zzbxtVar.zzE().zzb(i, zzbyz.CANCEL);
                }
                zzbxkVar.zzy().zzg(zzbjvVarZze, zzbls.PROCESSED, false, new zzbip());
            }
            z3 = false;
        }
        if (z3) {
            zzbxt zzbxtVar2 = this.zzc;
            zzbyz zzbyzVar = zzbyz.PROTOCOL_ERROR;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 36);
            sb.append("Received header for unknown stream: ");
            sb.append(i);
            zzbxtVar2.zzt(zzbyzVar, sb.toString());
        }
    }
}
