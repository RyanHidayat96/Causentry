package com.google.android.libraries.places.internal;

import defpackage.CameraStateRegistryCameraRegistration;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbxj extends zzbpi implements zzbyd {
    final /* synthetic */ zzbxk zza;
    private final int zzb;
    private final Object zzc;
    private List zzd;
    private final zzcbj zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private final zzbwz zzk;
    private final zzbyh zzl;
    private final zzbxt zzm;
    private boolean zzn;
    private final zzcbb zzo;
    private zzbye zzp;
    private int zzq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbxj(zzbxk zzbxkVar, int i, zzbwg zzbwgVar, Object obj, zzbwz zzbwzVar, zzbyh zzbyhVar, zzbxt zzbxtVar, int i2, String str, zzbfd zzbfdVar) {
        super(i, zzbwgVar, zzbxkVar.zzo(), zzbfdVar);
        Objects.requireNonNull(zzbxkVar);
        this.zza = zzbxkVar;
        this.zze = new zzcbj();
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzn = true;
        this.zzq = -1;
        if (obj == null) {
            throw new NullPointerException("lock");
        }
        this.zzc = obj;
        this.zzk = zzbwzVar;
        this.zzl = zzbyhVar;
        this.zzm = zzbxtVar;
        this.zzi = i2;
        this.zzj = i2;
        this.zzb = i2;
        this.zzo = zzcba.zza(str);
    }

    private final void zzP(zzbjv zzbjvVar, boolean z, zzbip zzbipVar) throws EOFException {
        if (this.zzh) {
            return;
        }
        this.zzh = true;
        if (!this.zzn) {
            this.zzm.zzn(this.zzq, zzbjvVar, zzbls.PROCESSED, z, zzbyz.CANCEL, zzbipVar);
            return;
        }
        this.zzm.zzj(this.zza);
        this.zzd = null;
        zzcbj zzcbjVar = this.zze;
        zzcbjVar.zzt(zzcbjVar.zzb());
        this.zzn = false;
        if (zzbipVar == null) {
            zzbipVar = new zzbip();
        }
        zzg(zzbjvVar, zzbls.PROCESSED, true, zzbipVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbsk
    public final void zzD(int i) {
        int i2 = this.zzj - i;
        this.zzj = i2;
        int i3 = this.zzb;
        if (i2 <= i3 * 0.5f) {
            int i4 = i3 - i2;
            this.zzi += i4;
            this.zzj = i2 + i4;
            this.zzk.zzk(this.zzq, i4);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbsk
    public final void zzE(Throwable th) throws EOFException {
        zzP(zzbjv.zzb(th), true, new zzbip());
    }

    public final void zzF(int i) {
        if (!(this.zzq == -1)) {
            throw new IllegalStateException(CameraStateRegistryCameraRegistration.b("the stream has been started with id %s", Integer.valueOf(i)));
        }
        this.zzq = i;
        zzbyh zzbyhVar = this.zzl;
        this.zzp = zzbyhVar.zze(this, i);
        zzbxk zzbxkVar = this.zza;
        zzbxj zzbxjVarZzJ = zzbxkVar.zzJ();
        super.zzr();
        zzbxjVarZzJ.zzu().zza();
        if (this.zzn) {
            this.zzk.zzf(false, false, this.zzq, 0, this.zzd);
            zzbxkVar.zzH().zzb();
            this.zzd = null;
            zzcbj zzcbjVar = this.zze;
            if (zzcbjVar.zzb() > 0) {
                zzbyhVar.zzc(this.zzf, this.zzp, zzcbjVar, this.zzg);
            }
            this.zzn = false;
        }
    }

    public final void zzG(List list, boolean z) {
        if (z) {
            zzC(zzbyi.zzb(list));
        } else {
            zzA(zzbyi.zza(list));
        }
    }

    public final void zzH(zzcbj zzcbjVar, boolean z, int i) {
        int iZzb = this.zzi - (((int) zzcbjVar.zzb()) + i);
        this.zzi = iZzb;
        this.zzj -= i;
        if (iZzb >= 0) {
            super.zzB(new zzbxz(zzcbjVar), z);
        } else {
            this.zzk.zzb(this.zzq, zzbyz.FLOW_CONTROL_ERROR);
            this.zzm.zzn(this.zzq, zzbjv.zzh.zze("Received data size exceeded our receiving window size"), zzbls.PROCESSED, false, null, null);
        }
    }

    final zzbye zzK() {
        zzbye zzbyeVar;
        synchronized (this.zzc) {
            zzbyeVar = this.zzp;
        }
        return zzbyeVar;
    }

    final /* synthetic */ void zzM(zzcbj zzcbjVar, boolean z, boolean z2) {
        if (this.zzh) {
            return;
        }
        if (this.zzn) {
            this.zze.zzc(zzcbjVar, (int) zzcbjVar.zzb());
            this.zzf |= z;
            this.zzg |= z2;
        } else {
            if (!(this.zzq != -1)) {
                throw new IllegalStateException("streamId should be set");
            }
            this.zzl.zzc(z, this.zzp, zzcbjVar, z2);
        }
    }

    final /* synthetic */ void zzN(zzbip zzbipVar, String str) throws Throwable {
        zzbxt zzbxtVar = this.zzm;
        boolean zZzh = zzbxtVar.zzh();
        if (zzbipVar == null) {
            throw new NullPointerException("headers");
        }
        if (str == null) {
            throw new NullPointerException("defaultPath");
        }
        zzbxk zzbxkVar = this.zza;
        String strZzI = zzbxkVar.zzI();
        if (strZzI == null) {
            throw new NullPointerException("authority");
        }
        zzbipVar.zzd(zzbpf.zzg);
        zzbipVar.zzd(zzbpf.zzh);
        zzbil zzbilVar = zzbpf.zzi;
        zzbipVar.zzd(zzbilVar);
        ArrayList arrayList = new ArrayList(zzbhh.zzd(zzbipVar) + 7);
        if (zZzh) {
            arrayList.add(zzbxb.zzb);
        } else {
            arrayList.add(zzbxb.zza);
        }
        arrayList.add(zzbxb.zzc);
        String strZzG = zzbxkVar.zzG();
        arrayList.add(new zzbzd(zzbzd.zze, zzcbm.zza(strZzI)));
        arrayList.add(new zzbzd(zzbzd.zzc, zzcbm.zza(str)));
        arrayList.add(new zzbzd(zzbilVar.zzd(), strZzG));
        arrayList.add(zzbxb.zze);
        arrayList.add(zzbxb.zzf);
        byte[][] bArrZza = zzbwl.zza(zzbipVar);
        for (int i = 0; i < bArrZza.length; i += 2) {
            zzcbn zzcbnVarZzb = zzcbm.zzb(bArrZza[i]);
            if (zzcbnVarZzb.zza().length != 0 && zzcbnVarZzb.zza()[0] != 58) {
                arrayList.add(new zzbzd(zzcbnVarZzb, zzcbm.zzb(bArrZza[i + 1])));
            }
        }
        this.zzd = arrayList;
        zzbxtVar.zzi(zzbxkVar, zzbxkVar.zzI());
    }

    @Override // com.google.android.libraries.places.internal.zzbkl, com.google.android.libraries.places.internal.zzbsk
    public final void zzb(boolean z) {
        if (zzc()) {
            this.zzm.zzn(this.zzq, null, zzbls.PROCESSED, false, null, null);
        } else {
            this.zzm.zzn(this.zzq, null, zzbls.PROCESSED, false, zzbyz.CANCEL, null);
        }
        super.zzb(z);
    }

    @Override // com.google.android.libraries.places.internal.zzbks
    public final void zzy(Runnable runnable) {
        synchronized (this.zzc) {
            runnable.run();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbpi
    protected final void zzz(zzbjv zzbjvVar, boolean z, zzbip zzbipVar) throws EOFException {
        zzP(zzbjvVar, false, zzbipVar);
    }

    final zzcbb zzI() {
        return this.zzo;
    }

    final int zzJ() {
        return this.zzq;
    }

    final /* synthetic */ void zzL(zzbjv zzbjvVar, boolean z, zzbip zzbipVar) throws EOFException {
        zzP(zzbjvVar, true, null);
    }

    final /* synthetic */ Object zzO() {
        return this.zzc;
    }
}
