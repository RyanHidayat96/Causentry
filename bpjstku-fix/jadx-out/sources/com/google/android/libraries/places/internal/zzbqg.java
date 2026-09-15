package com.google.android.libraries.places.internal;

import defpackage.CameraStateRegistryCameraRegistration;
import defpackage.CameraStateRegistryCameraRegistrationExternalSyntheticLambda0;
import defpackage.isCameraClosing;
import defpackage.registerCamera;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class zzbqg implements zzbhe, zzbwm {
    private final zzbhf zza;
    private final String zzb;
    private final String zzc;
    private final zzbpz zzd;
    private final zzblw zze;
    private final ScheduledExecutorService zzf;
    private final zzbgy zzg;
    private final zzblh zzh;
    private final zzbfg zzi;
    private final boolean zzj;
    private final List zzk;
    private final zzbkd zzl;
    private final zzbqa zzm;
    private volatile List zzn;
    private final isCameraClosing zzo;
    private zzbkc zzp;
    private zzbkc zzq;
    private zzbsj zzr;
    private zzbmg zzu;
    private volatile zzbsj zzv;
    private zzbjv zzx;
    private volatile zzbez zzy;
    private zzbon zzz;
    private final Collection zzs = new ArrayList();
    private final zzbpk zzt = new zzbpn(this);
    private volatile zzbfz zzw = zzbfz.zza(zzbfy.IDLE);

    zzbqg(zzbho zzbhoVar, String str, String str2, zzbom zzbomVar, zzblw zzblwVar, ScheduledExecutorService scheduledExecutorService, CameraStateRegistryCameraRegistrationExternalSyntheticLambda0 cameraStateRegistryCameraRegistrationExternalSyntheticLambda0, zzbkd zzbkdVar, zzbpz zzbpzVar, zzbgy zzbgyVar, zzblh zzblhVar, zzblj zzbljVar, zzbhf zzbhfVar, zzbfg zzbfgVar, List list) {
        List listZza = zzbhoVar.zza();
        if (listZza == null) {
            throw new NullPointerException("addressGroups");
        }
        if (!(!listZza.isEmpty())) {
            throw new IllegalArgumentException("addressGroups is empty");
        }
        zzL(listZza, "addressGroups contains null entry");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(listZza));
        this.zzn = listUnmodifiableList;
        this.zzm = new zzbqa(listUnmodifiableList);
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzblwVar;
        this.zzf = scheduledExecutorService;
        this.zzo = (isCameraClosing) cameraStateRegistryCameraRegistrationExternalSyntheticLambda0.get();
        this.zzl = zzbkdVar;
        this.zzd = zzbpzVar;
        this.zzg = zzbgyVar;
        this.zzh = zzblhVar;
        if (zzbljVar == null) {
            throw new NullPointerException("channelTracer");
        }
        if (zzbhfVar == null) {
            throw new NullPointerException("logId");
        }
        this.zza = zzbhfVar;
        if (zzbfgVar == null) {
            throw new NullPointerException("channelLogger");
        }
        this.zzi = zzbfgVar;
        this.zzk = list;
        this.zzj = ((Boolean) zzbhoVar.zzc(zzbia.zzc)).booleanValue();
    }

    private final void zzK(zzbfz zzbfzVar) {
        this.zzl.zzc();
        if (this.zzw.zzc() != zzbfzVar.zzc()) {
            boolean z = this.zzw.zzc() != zzbfy.SHUTDOWN;
            zzbfy zzbfyVarZzc = zzbfzVar.zzc();
            if (!z) {
                throw new IllegalStateException(CameraStateRegistryCameraRegistration.b("Cannot transition out of SHUTDOWN to %s", zzbfyVarZzc));
            }
            if (this.zzj && zzbfzVar.zzc() == zzbfy.TRANSIENT_FAILURE) {
                this.zzw = zzbfz.zza(zzbfy.IDLE);
            } else {
                this.zzw = zzbfzVar;
            }
            ((zzbrt) this.zzd).zza.zza(zzbfzVar);
        }
    }

    private static void zzL(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException(String.valueOf(str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzM(zzbjv zzbjvVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(zzbjvVar.zzg());
        if (zzbjvVar.zzh() != null) {
            sb.append("(");
            sb.append(zzbjvVar.zzh());
            sb.append(")");
        }
        if (zzbjvVar.zzi() != null) {
            sb.append("[");
            sb.append(zzbjvVar.zzi());
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbwm
    public final zzblu zza() {
        zzbsj zzbsjVar = this.zzv;
        if (zzbsjVar != null) {
            return zzbsjVar;
        }
        zzbkd zzbkdVar = this.zzl;
        zzbkdVar.zzb(new zzbpp(this));
        zzbkdVar.zza();
        return null;
    }

    public final void zzd(zzbjv zzbjvVar) {
        zzbps zzbpsVar = new zzbps(this, zzbjvVar);
        zzbkd zzbkdVar = this.zzl;
        zzbkdVar.zzb(zzbpsVar);
        zzbkdVar.zza();
    }

    final void zze(zzbjv zzbjvVar) {
        zzd(zzbjvVar);
        zzbpv zzbpvVar = new zzbpv(this, zzbjvVar);
        zzbkd zzbkdVar = this.zzl;
        zzbkdVar.zzb(zzbpvVar);
        zzbkdVar.zza();
    }

    final /* synthetic */ void zzf() {
        zzbgt zzbgtVar;
        this.zzl.zzc();
        if (!(this.zzp == null)) {
            throw new IllegalStateException("Should have no reconnectTask scheduled");
        }
        zzbqa zzbqaVar = this.zzm;
        if (zzbqaVar.zzb()) {
            isCameraClosing iscameraclosing = this.zzo;
            iscameraclosing.TuitionPaymentFragmentbindingInflater1 = 0L;
            iscameraclosing.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
            if (!(!iscameraclosing.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                throw new IllegalStateException("This stopwatch is already running.");
            }
            iscameraclosing.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            iscameraclosing.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iscameraclosing.b.b();
        }
        SocketAddress socketAddressZze = zzbqaVar.zze();
        byte[] bArr = null;
        if (socketAddressZze instanceof zzbgt) {
            zzbgt zzbgtVar2 = (zzbgt) socketAddressZze;
            zzbgtVar = zzbgtVar2;
            socketAddressZze = zzbgtVar2.zzd();
        } else {
            zzbgtVar = null;
        }
        zzbez zzbezVarZzf = zzbqaVar.zzf();
        String str = (String) zzbezVarZzf.zza(zzbgl.zza);
        zzblv zzblvVar = new zzblv();
        if (str == null) {
            str = this.zzb;
        }
        zzblvVar.zzb(str);
        zzblvVar.zzd(zzbezVarZzf);
        zzblvVar.zzf(this.zzc);
        zzblvVar.zzh(zzbgtVar);
        zzbqf zzbqfVar = new zzbqf();
        zzbqfVar.zza = this.zza;
        zzbpy zzbpyVar = new zzbpy(this.zze.zza(socketAddressZze, zzblvVar, zzbqfVar), this.zzh, bArr);
        zzbqfVar.zza = zzbpyVar.zzc();
        this.zzg.zzd(zzbpyVar);
        this.zzu = zzbpyVar;
        this.zzs.add(zzbpyVar);
        zzbpyVar.zzao(new zzbqe(this, zzbpyVar));
        this.zzi.zzb(2, "Started transport {0}", zzbqfVar.zza);
    }

    final /* synthetic */ void zzg(zzbjv zzbjvVar) {
        zzbkd zzbkdVar = this.zzl;
        zzbkdVar.zzc();
        zzK(zzbfz.zzb(zzbjvVar));
        if (this.zzj) {
            return;
        }
        if (this.zzz == null) {
            this.zzz = new zzbon();
        }
        long jZza = this.zzz.zza();
        isCameraClosing iscameraclosing = this.zzo;
        long jConvert = jZza - TimeUnit.NANOSECONDS.convert(iscameraclosing.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? (iscameraclosing.b.b() - iscameraclosing.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + iscameraclosing.TuitionPaymentFragmentbindingInflater1 : iscameraclosing.TuitionPaymentFragmentbindingInflater1, TimeUnit.NANOSECONDS);
        this.zzi.zzb(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", zzM(zzbjvVar), Long.valueOf(jConvert));
        if (!(this.zzp == null)) {
            throw new IllegalStateException("previous reconnectTask is not done");
        }
        this.zzp = zzbkdVar.zzd(new zzbpo(this), jConvert, TimeUnit.NANOSECONDS, this.zzf);
    }

    final /* synthetic */ void zzh(zzbfy zzbfyVar) {
        this.zzl.zzc();
        zzK(zzbfz.zza(zzbfyVar));
    }

    final /* synthetic */ void zzi() {
        zzbpt zzbptVar = new zzbpt(this);
        zzbkd zzbkdVar = this.zzl;
        zzbkdVar.zzb(zzbptVar);
        zzbkdVar.zza();
    }

    final /* synthetic */ void zzj(zzbmg zzbmgVar, boolean z) {
        zzbpu zzbpuVar = new zzbpu(this, zzbmgVar, z);
        zzbkd zzbkdVar = this.zzl;
        zzbkdVar.zzb(zzbpuVar);
        zzbkdVar.zza();
    }

    final /* synthetic */ void zzk() {
        this.zzl.zzc();
        zzbkc zzbkcVar = this.zzp;
        if (zzbkcVar != null) {
            zzbkcVar.zza();
            this.zzp = null;
            this.zzz = null;
        }
    }

    public final void zzb(List list) {
        if (list == null) {
            throw new NullPointerException("newAddressGroups");
        }
        zzL(list, "newAddressGroups contains null entry");
        if (!(!list.isEmpty())) {
            throw new IllegalArgumentException("newAddressGroups is empty");
        }
        zzbpr zzbprVar = new zzbpr(this, Collections.unmodifiableList(new ArrayList(list)));
        zzbkd zzbkdVar = this.zzl;
        zzbkdVar.zzb(zzbprVar);
        zzbkdVar.zza();
    }

    public final String toString() {
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), (byte) 0);
        String strValueOf = String.valueOf(this.zza.zzc());
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3((byte) 0);
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.b = strValueOf;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "logId";
        List list = this.zzn;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = list;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "addressGroups";
        return tuitionPaymentFragmentbindingInflater1.toString();
    }

    final /* synthetic */ zzbmg zzA() {
        return this.zzu;
    }

    final /* synthetic */ void zzB(zzbmg zzbmgVar) {
        this.zzu = null;
    }

    final /* synthetic */ zzbsj zzC() {
        return this.zzv;
    }

    final /* synthetic */ void zzD(zzbsj zzbsjVar) {
        this.zzv = zzbsjVar;
    }

    final /* synthetic */ zzbfz zzE() {
        return this.zzw;
    }

    final /* synthetic */ zzbjv zzF() {
        return this.zzx;
    }

    final /* synthetic */ void zzG(zzbjv zzbjvVar) {
        this.zzx = zzbjvVar;
    }

    final /* synthetic */ void zzH(zzbez zzbezVar) {
        this.zzy = zzbezVar;
    }

    final /* synthetic */ void zzI(zzbon zzbonVar) {
        this.zzz = null;
    }

    @Override // com.google.android.libraries.places.internal.zzbhk
    public final zzbhf zzc() {
        return this.zza;
    }

    final /* synthetic */ zzbpz zzl() {
        return this.zzd;
    }

    final /* synthetic */ ScheduledExecutorService zzm() {
        return this.zzf;
    }

    final /* synthetic */ zzbgy zzn() {
        return this.zzg;
    }

    final /* synthetic */ zzbfg zzo() {
        return this.zzi;
    }

    final /* synthetic */ List zzp() {
        return this.zzk;
    }

    final /* synthetic */ zzbkd zzq() {
        return this.zzl;
    }

    final /* synthetic */ zzbqa zzr() {
        return this.zzm;
    }

    final /* synthetic */ void zzs(List list) {
        this.zzn = list;
    }

    final /* synthetic */ void zzt(zzbkc zzbkcVar) {
        this.zzp = null;
    }

    final /* synthetic */ zzbkc zzu() {
        return this.zzq;
    }

    final /* synthetic */ void zzv(zzbkc zzbkcVar) {
        this.zzq = zzbkcVar;
    }

    final /* synthetic */ zzbsj zzw() {
        return this.zzr;
    }

    final /* synthetic */ void zzx(zzbsj zzbsjVar) {
        this.zzr = zzbsjVar;
    }

    final /* synthetic */ Collection zzy() {
        return this.zzs;
    }

    final /* synthetic */ zzbpk zzz() {
        return this.zzt;
    }
}
