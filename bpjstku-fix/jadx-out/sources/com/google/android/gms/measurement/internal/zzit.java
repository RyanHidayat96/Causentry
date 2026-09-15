package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.SieveCacheKt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzrb;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
final class zzit implements Callable {
    final /* synthetic */ zzbg zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzjd zzc;

    zzit(zzjd zzjdVar, zzbg zzbgVar, String str) {
        this.zza = zzbgVar;
        this.zzb = str;
        Objects.requireNonNull(zzjdVar);
        this.zzc = zzjdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.measurement.internal.zzbg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.gms.measurement.internal.zzol] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        byte[] bArr;
        zzpg zzpgVar;
        zzpn zzpnVar;
        boolean z;
        Object obj;
        zzbc zzbcVarZza;
        long j;
        byte[] bArr2;
        zzjd zzjdVar = this.zzc;
        zzjdVar.zzL().zzZ();
        zzlp zzlpVarZzn = zzjdVar.zzL().zzn();
        zzlpVarZzn.zzg();
        zzic zzicVar = zzlpVarZzn.zzu;
        zzic.zzL();
        ?? r4 = this.zza;
        Preconditions.checkNotNull(r4);
        String str = this.zzb;
        Preconditions.checkNotEmpty(str);
        String str2 = r4.zza;
        if (!"_iap".equals(str2) && !"_iapx".equals(str2)) {
            zzlpVarZzn.zzu.zzaV().zzj().zzc("Generating a payload for this event is not available. package_name, event_name", str, str2);
            return null;
        }
        zzpg zzpgVar2 = zzlpVarZzn.zzg;
        com.google.android.gms.internal.measurement.zzhz zzhzVarZzh = com.google.android.gms.internal.measurement.zzib.zzh();
        zzpgVar2.zzj().zzb();
        try {
            zzh zzhVarZzu = zzpgVar2.zzj().zzu(str);
            if (zzhVarZzu != null) {
                if (zzhVarZzu.zzD()) {
                    com.google.android.gms.internal.measurement.zzic zzicVarZzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                    zzicVarZzaE.zza(1);
                    zzicVarZzaE.zzC("android");
                    if (!TextUtils.isEmpty(zzhVarZzu.zzc())) {
                        zzicVarZzaE.zzL(zzhVarZzu.zzc());
                    }
                    if (!TextUtils.isEmpty(zzhVarZzu.zzv())) {
                        zzicVarZzaE.zzJ((String) Preconditions.checkNotNull(zzhVarZzu.zzv()));
                    }
                    if (!TextUtils.isEmpty(zzhVarZzu.zzr())) {
                        zzicVarZzaE.zzM((String) Preconditions.checkNotNull(zzhVarZzu.zzr()));
                    }
                    if (zzhVarZzu.zzt() != SieveCacheKt.NodeMetaAndPreviousMask) {
                        zzicVarZzaE.zzaj((int) zzhVarZzu.zzt());
                    }
                    zzicVarZzaE.zzN(zzhVarZzu.zzx());
                    zzicVarZzaE.zzar(zzhVarZzu.zzB());
                    String strZzf = zzhVarZzu.zzf();
                    if (!TextUtils.isEmpty(strZzf)) {
                        zzicVarZzaE.zzad(strZzf);
                    }
                    zzicVarZzaE.zzay(zzhVarZzu.zzak());
                    zzjl zzjlVarZzB = zzlpVarZzn.zzg.zzB(str);
                    zzicVarZzaE.zzY(zzhVarZzu.zzz());
                    if (zzicVar.zzB() && zzlpVarZzn.zzu.zzc().zzC(zzicVarZzaE.zzK()) && zzjlVarZzB.zzo(zzjk.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzicVarZzaE.zzam(null);
                    }
                    zzicVarZzaE.zzat(zzjlVarZzB.zzk());
                    if (zzjlVarZzB.zzo(zzjk.AD_STORAGE) && zzhVarZzu.zzac()) {
                        Pair pairZzc = zzpgVar2.zzq().zzc(zzhVarZzu.zzc(), zzjlVarZzB);
                        if (zzhVarZzu.zzac() && !TextUtils.isEmpty((CharSequence) pairZzc.first)) {
                            try {
                                zzicVarZzaE.zzQ(zzlp.zzc((String) pairZzc.first, Long.toString(r4.zzd)));
                                if (pairZzc.second != null) {
                                    zzicVarZzaE.zzT(((Boolean) pairZzc.second).booleanValue());
                                }
                            } catch (SecurityException e2) {
                                zzlpVarZzn.zzu.zzaV().zzj().zzb("Resettable device id encryption failed", e2.getMessage());
                                bArr = new byte[0];
                                zzpgVar = zzlpVarZzn.zzg;
                                byte[] bArr3 = bArr;
                                zzpgVar.zzj().zzd();
                                return bArr3;
                            }
                        }
                    }
                    zzic zzicVar2 = zzlpVarZzn.zzu;
                    zzicVar2.zzu().zzw();
                    zzicVarZzaE.zzF(Build.MODEL);
                    zzicVar2.zzu().zzw();
                    zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                    zzicVarZzaE.zzI((int) zzicVar2.zzu().zzb());
                    zzicVarZzaE.zzH(zzicVar2.zzu().zzc());
                    try {
                        try {
                            if (zzjlVarZzB.zzo(zzjk.ANALYTICS_STORAGE) && zzhVarZzu.zzd() != null) {
                                zzicVarZzaE.zzW(zzlp.zzc((String) Preconditions.checkNotNull(zzhVarZzu.zzd()), Long.toString(r4.zzd)));
                            }
                            if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                            }
                            String strZzc = zzhVarZzu.zzc();
                            zzpg zzpgVar3 = zzlpVarZzn.zzg;
                            List listZzn = zzpgVar3.zzj().zzn(strZzc);
                            Iterator it = listZzn.iterator();
                            do {
                                if (!it.hasNext()) {
                                    zzpnVar = null;
                                    break;
                                }
                                zzpnVar = (zzpn) it.next();
                            } while (!"_lte".equals(zzpnVar.zzc));
                            if (zzpnVar == null || zzpnVar.zze == null) {
                                zzpn zzpnVar2 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzaZ().currentTimeMillis(), 0L);
                                listZzn.add(zzpnVar2);
                                zzpgVar3.zzj().zzl(zzpnVar2);
                            }
                            com.google.android.gms.internal.measurement.zziu[] zziuVarArr = new com.google.android.gms.internal.measurement.zziu[listZzn.size()];
                            for (int i = 0; i < listZzn.size(); i++) {
                                com.google.android.gms.internal.measurement.zzit zzitVarZzm = com.google.android.gms.internal.measurement.zziu.zzm();
                                zzitVarZzm.zzb(((zzpn) listZzn.get(i)).zzc);
                                zzitVarZzm.zza(((zzpn) listZzn.get(i)).zzd);
                                zzpgVar3.zzp().zzc(zzitVarZzm, ((zzpn) listZzn.get(i)).zze);
                                zziuVarArr[i] = (com.google.android.gms.internal.measurement.zziu) zzitVarZzm.zzbc();
                            }
                            zzicVarZzaE.zzq(Arrays.asList(zziuVarArr));
                            zzpg zzpgVar4 = zzlpVarZzn.zzg;
                            zzpgVar4.zzI(zzhVarZzu, zzicVarZzaE);
                            zzpgVar4.zzJ(zzhVarZzu, zzicVarZzaE);
                            zzgv zzgvVarZza = zzgv.zza(r4);
                            zzic zzicVar3 = zzlpVarZzn.zzu;
                            zzpp zzppVarZzk = zzicVar3.zzk();
                            Bundle bundle = zzgvVarZza.zzd;
                            zzppVarZzk.zzI(bundle, zzpgVar3.zzj().zzU(str));
                            zzicVar3.zzk().zzG(zzgvVarZza, zzicVar3.zzc().zzd(str));
                            try {
                                bundle.putLong("_c", 1L);
                                zzicVar3.zzaV().zzj().zza("Marking in-app purchase as real-time");
                                bundle.putLong("_r", 1L);
                                String str3 = r4.zzc;
                                bundle.putString("_o", str3);
                                if (zzicVar3.zzk().zzaa(zzicVarZzaE.zzK(), zzhVarZzu.zzay())) {
                                    zzicVar3.zzk().zzM(bundle, "_dbg", 1L);
                                    zzicVar3.zzk().zzM(bundle, "_r", 1L);
                                }
                                zzav zzavVarZzj = zzpgVar3.zzj();
                                String str4 = r4.zza;
                                zzbc zzbcVarZzf = zzavVarZzj.zzf(str, str4);
                                if (zzbcVarZzf == null) {
                                    z = true;
                                    obj = null;
                                    zzbcVarZza = new zzbc(str, str4, 0L, 0L, 0L, r4.zzd, 0L, null, null, null, null);
                                    j = 0;
                                } else {
                                    z = true;
                                    obj = null;
                                    long j2 = zzbcVarZzf.zzf;
                                    zzbcVarZza = zzbcVarZzf.zza(r4.zzd);
                                    j = j2;
                                }
                                zzpgVar3.zzj().zzh(zzbcVarZza);
                                try {
                                    zzbb zzbbVar = new zzbb(zzlpVarZzn.zzu, str3, str, str4, r4.zzd, j, bundle);
                                    com.google.android.gms.internal.measurement.zzhr zzhrVarZzk = com.google.android.gms.internal.measurement.zzhs.zzk();
                                    zzhrVarZzk.zzo(zzbbVar.zzd);
                                    zzhrVarZzk.zzl(zzbbVar.zzb);
                                    zzhrVarZzk.zzq(zzbbVar.zze);
                                    zzbe zzbeVar = zzbbVar.zzf;
                                    zzbd zzbdVar = new zzbd(zzbeVar);
                                    while (zzbdVar.hasNext()) {
                                        String next = zzbdVar.next();
                                        String str5 = next;
                                        com.google.android.gms.internal.measurement.zzhv zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                                        zzhvVarZzn.zzb(next);
                                        Object objZza = zzbeVar.zza(next);
                                        if (objZza != null) {
                                            zzpgVar3.zzp().zzd(zzhvVarZzn, objZza);
                                            zzhrVarZzk.zzg(zzhvVarZzn);
                                        }
                                    }
                                    zzicVarZzaE.zzg(zzhrVarZzk);
                                    com.google.android.gms.internal.measurement.zzie zzieVarZza = com.google.android.gms.internal.measurement.zzig.zza();
                                    com.google.android.gms.internal.measurement.zzht zzhtVarZza = com.google.android.gms.internal.measurement.zzhu.zza();
                                    zzhtVarZza.zzb(zzbcVarZza.zzc);
                                    zzhtVarZza.zza(str4);
                                    zzieVarZza.zza(zzhtVarZza);
                                    zzicVarZzaE.zzap(zzieVarZza);
                                    zzicVarZzaE.zzaf(zzpgVar3.zzm().zzb(zzhVarZzu.zzc(), Collections.emptyList(), zzicVarZzaE.zzk(), Long.valueOf(zzhrVarZzk.zzn()), Long.valueOf(zzhrVarZzk.zzn()), false));
                                    if (zzhrVarZzk.zzm()) {
                                        zzicVarZzaE.zzv(zzhrVarZzk.zzn());
                                        zzicVarZzaE.zzx(zzhrVarZzk.zzn());
                                    }
                                    long jZzp = zzhVarZzu.zzp();
                                    if (jZzp != 0) {
                                        zzicVarZzaE.zzA(jZzp);
                                    }
                                    long jZzn = zzhVarZzu.zzn();
                                    if (jZzn != 0) {
                                        zzicVarZzaE.zzy(jZzn);
                                    } else if (jZzp != 0) {
                                        zzicVarZzaE.zzy(jZzp);
                                    }
                                    String strZzh = zzhVarZzu.zzh();
                                    zzrb.zza();
                                    if (zzicVar3.zzc().zzp(str, zzfy.zzaM) && strZzh != null) {
                                        zzicVarZzaE.zzau(strZzh);
                                    }
                                    zzhVarZzu.zzL();
                                    zzicVarZzaE.zzZ((int) zzhVarZzu.zzG());
                                    zzicVar3.zzc().zzi();
                                    zzicVarZzaE.zzO(133005L);
                                    zzicVarZzaE.zzs(zzicVar3.zzaZ().currentTimeMillis());
                                    zzicVarZzaE.zzae(z);
                                    zzpgVar4.zzS(zzicVarZzaE.zzK(), zzicVarZzaE);
                                    zzhzVarZzh.zze(zzicVarZzaE);
                                    zzhVarZzu.zzo(zzicVarZzaE.zzu());
                                    zzhVarZzu.zzq(zzicVarZzaE.zzw());
                                    zzpgVar3.zzj().zzv(zzhVarZzu, false, false);
                                    zzpgVar3.zzj().zzc();
                                    zzpgVar3.zzj().zzd();
                                    try {
                                        return zzpgVar3.zzp().zzv(((com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc()).zzcc());
                                    } catch (IOException e3) {
                                        zzlpVarZzn.zzu.zzaV().zzb().zzc("Data loss. Failed to bundle and serialize. appId", zzgu.zzl(str), e3);
                                        return obj;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    r4 = zzlpVarZzn;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r4 = zzlpVarZzn;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (SecurityException e4) {
                        zzlpVarZzn.zzu.zzaV().zzj().zzb("app instance id encryption failed", e4.getMessage());
                        bArr = new byte[0];
                        zzpgVar = zzlpVarZzn.zzg;
                        byte[] bArr4 = bArr;
                        zzpgVar.zzj().zzd();
                        return bArr4;
                    }
                } else {
                    zzlpVarZzn.zzu.zzaV().zzj().zzb("Log and bundle disabled. package_name", str);
                    bArr2 = new byte[0];
                }
                r4.zzg.zzj().zzd();
                throw th;
            }
            zzlpVarZzn.zzu.zzaV().zzj().zzb("Log and bundle not available. package_name", str);
            bArr2 = new byte[0];
            zzpgVar2.zzj().zzd();
            return bArr2;
        } catch (Throwable th4) {
            th = th4;
            r4 = zzlpVarZzn;
        }
    }
}
