package com.google.android.libraries.places.internal;

import defpackage.readBoolean;
import defpackage.readChar;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbrh extends zzbjb {
    final zzbrf zza;
    final zzbjf zzb;
    final /* synthetic */ zzbrx zzc;

    zzbrh(zzbrx zzbrxVar, zzbrf zzbrfVar, zzbjf zzbjfVar) {
        Objects.requireNonNull(zzbrxVar);
        this.zzc = zzbrxVar;
        if (zzbrfVar == null) {
            throw new NullPointerException("helperImpl");
        }
        this.zza = zzbrfVar;
        if (zzbjfVar == null) {
            throw new NullPointerException("resolver");
        }
        this.zzb = zzbjfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(zzbjv zzbjvVar) {
        Logger logger = zzbrx.zza;
        Level level = Level.WARNING;
        zzbrx zzbrxVar = this.zzc;
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{zzbrxVar.zzc(), zzbjvVar});
        zzbrxVar.zzX().zzd();
        if (zzbrxVar.zzaj() != 3) {
            zzbrxVar.zzV().zzb(3, "Failed to resolve name: {0}", zzbjvVar);
            zzbrxVar.zzak(3);
        }
        zzbrf zzbrfVar = this.zza;
        if (zzbrfVar != zzbrxVar.zzE()) {
            return;
        }
        zzbrfVar.zza.zzc().zzb(zzbjvVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjb
    public final zzbjv zza(zzbjd zzbjdVar) throws Throwable {
        zzbsh zzbshVarZzr;
        zzbrx zzbrxVar = this.zzc;
        zzbkd zzbkdVar = zzbrxVar.zze;
        zzbkdVar.zzc();
        if (zzbrxVar.zzD() != this.zzb) {
            return zzbjv.zza;
        }
        zzbjx zzbjxVarZzb = zzbjdVar.zzb();
        if (!zzbjxVarZzb.zzc()) {
            zzb(zzbjxVarZzb.zze());
            return zzbjxVarZzb.zze();
        }
        List list = (List) zzbjxVarZzb.zzd();
        zzbrxVar.zzV().zzb(1, "Resolved address: {0}, config={1}", list, zzbjdVar.zzc());
        if (zzbrxVar.zzaj() != 2) {
            zzbrxVar.zzV().zzb(2, "Address resolved: {0}", list);
            zzbrxVar.zzak(2);
        }
        zzbiz zzbizVarZzd = zzbjdVar.zzd();
        zzbhb zzbhbVar = (zzbhb) zzbjdVar.zzc().zza(zzbhb.zza);
        zzbsh zzbshVarZzr2 = (zzbizVarZzd == null || zzbizVarZzd.zzc() == null) ? null : (zzbsh) zzbizVarZzd.zzc();
        zzbjv zzbjvVarZzd = zzbizVarZzd != null ? zzbizVarZzd.zzd() : null;
        if (zzbrxVar.zzac()) {
            if (zzbshVarZzr2 != null) {
                if (zzbhbVar != null) {
                    zzbrxVar.zzX().zzc(zzbhbVar);
                    if (zzbshVarZzr2.zzb() != null) {
                        zzbrxVar.zzV().zza(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                    }
                } else {
                    zzbrxVar.zzX().zzc(zzbshVarZzr2.zzb());
                }
            } else if (zzbjvVarZzd == null) {
                zzbrxVar.zzX().zzc(null);
                zzbshVarZzr2 = zzbrx.zzr();
            } else {
                if (!zzbrxVar.zzaa()) {
                    zzbrxVar.zzV().zza(2, "Fallback to error due to invalid first service config without default config");
                    zzbjv zzbjvVarZzd2 = zzbizVarZzd.zzd();
                    if (!(!zzbjvVarZzd2.zzj())) {
                        throw new IllegalArgumentException("the error status must not be OK");
                    }
                    zzbkdVar.zzb(new zzbrg(this, zzbjvVarZzd2));
                    zzbkdVar.zza();
                    return zzbizVarZzd.zzd();
                }
                zzbshVarZzr2 = zzbrxVar.zzY();
            }
            if (!zzbshVarZzr2.equals(zzbrxVar.zzY())) {
                zzbrxVar.zzV().zzb(2, "Service config changed{0}", zzbshVarZzr2 == zzbrx.zzr() ? " to empty" : "");
                zzbrxVar.zzZ(zzbshVarZzr2);
                zzbrxVar.zzah().zza = zzbshVarZzr2.zzd();
            }
            try {
                zzbrxVar.zzab(true);
            } catch (RuntimeException e2) {
                zzbrx zzbrxVar2 = this.zzc;
                Logger logger = zzbrx.zza;
                Level level = Level.WARNING;
                String strValueOf = String.valueOf(zzbrxVar2.zzc());
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 51);
                sb.append("[");
                sb.append(strValueOf);
                sb.append("] Unexpected exception from parsing service config");
                logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "onResult2", sb.toString(), (Throwable) e2);
            }
            zzbshVarZzr = zzbshVarZzr2;
        } else {
            if (zzbshVarZzr2 != null) {
                zzbrxVar.zzV().zza(2, "Service config from name resolver discarded by channel settings");
            }
            if (zzbhbVar != null) {
                zzbrxVar.zzV().zza(2, "Config selector from name resolver discarded by channel settings");
            }
            zzbrr zzbrrVarZzX = zzbrxVar.zzX();
            zzbshVarZzr = zzbrx.zzr();
            zzbrrVarZzX.zzc(zzbshVarZzr.zzb());
        }
        zzbez zzbezVarZzc = zzbjdVar.zzc();
        zzbrf zzbrfVar = this.zza;
        if (zzbrfVar != this.zzc.zzE()) {
            return zzbjv.zza;
        }
        zzbex zzbexVarZzc = zzbezVarZzc.zzc();
        zzbexVarZzc.zzb(zzbhb.zza);
        Map mapZza = zzbshVarZzr.zza();
        if (mapZza != null) {
            zzbexVarZzc.zza(zzbia.zza, mapZza);
            zzbexVarZzc.zzc();
        }
        zzbez zzbezVarZzc2 = zzbexVarZzc.zzc();
        zzbhv zzbhvVarZza = zzbhw.zza();
        zzbhvVarZza.zza((List) zzbjxVarZzb.zzd());
        zzbhvVarZza.zzb(zzbezVarZzc2);
        zzbhvVarZza.zzc(zzbshVarZzr.zzc());
        return zzbrfVar.zza.zza(zzbhvVarZza.zzd());
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        readBoolean.TuitionPaymentFragmentbindingInflater1[0] = readChar.TuitionPaymentFragmentbindingInflater1[0];
    }
}
