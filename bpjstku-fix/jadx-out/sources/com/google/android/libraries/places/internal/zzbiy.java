package com.google.android.libraries.places.internal;

import defpackage.registerCamera;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbiy {
    private final int zza;
    private final zzbjn zzb;
    private final zzbkd zzc;
    private final zzbje zzd;
    private final ScheduledExecutorService zze;
    private final zzbfg zzf;
    private final Executor zzg;
    private final zzbiw zzh;
    private final zzbjj zzi;

    /* synthetic */ zzbiy(zzbix zzbixVar, byte[] bArr) {
        Integer numZzk = zzbixVar.zzk();
        if (numZzk == null) {
            throw new NullPointerException("defaultPort not set");
        }
        this.zza = numZzk.intValue();
        zzbjn zzbjnVarZzl = zzbixVar.zzl();
        if (zzbjnVarZzl == null) {
            throw new NullPointerException("proxyDetector not set");
        }
        this.zzb = zzbjnVarZzl;
        zzbkd zzbkdVarZzm = zzbixVar.zzm();
        if (zzbkdVarZzm == null) {
            throw new NullPointerException("syncContext not set");
        }
        this.zzc = zzbkdVarZzm;
        zzbje zzbjeVarZzn = zzbixVar.zzn();
        if (zzbjeVarZzn == null) {
            throw new NullPointerException("serviceConfigParser not set");
        }
        this.zzd = zzbjeVarZzn;
        this.zze = zzbixVar.zzo();
        this.zzf = zzbixVar.zzp();
        this.zzg = zzbixVar.zzq();
        this.zzh = zzbixVar.zzr();
        this.zzi = zzbixVar.zzs();
    }

    public final ScheduledExecutorService zzd() {
        ScheduledExecutorService scheduledExecutorService = this.zze;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        throw new IllegalStateException("ScheduledExecutorService not set in Builder");
    }

    public final String toString() {
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), (byte) 0);
        String strValueOf = String.valueOf(this.zza);
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3((byte) 0);
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.b = strValueOf;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "defaultPort";
        zzbjn zzbjnVar = this.zzb;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = zzbjnVar;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "proxyDetector";
        zzbkd zzbkdVar = this.zzc;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault4;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault4;
        tuitionPaymentFragmentspecialinlinedviewModeldefault4.b = zzbkdVar;
        tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "syncContext";
        zzbje zzbjeVar = this.zzd;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault5 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault5;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault5;
        tuitionPaymentFragmentspecialinlinedviewModeldefault5.b = zzbjeVar;
        tuitionPaymentFragmentspecialinlinedviewModeldefault5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "serviceConfigParser";
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault6 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault6;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault6;
        tuitionPaymentFragmentspecialinlinedviewModeldefault6.b = null;
        tuitionPaymentFragmentspecialinlinedviewModeldefault6.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "customArgs";
        ScheduledExecutorService scheduledExecutorService = this.zze;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault7 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault7;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault7;
        tuitionPaymentFragmentspecialinlinedviewModeldefault7.b = scheduledExecutorService;
        tuitionPaymentFragmentspecialinlinedviewModeldefault7.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "scheduledExecutorService";
        zzbfg zzbfgVar = this.zzf;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault8 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault8;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault8;
        tuitionPaymentFragmentspecialinlinedviewModeldefault8.b = zzbfgVar;
        tuitionPaymentFragmentspecialinlinedviewModeldefault8.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "channelLogger";
        Executor executor = this.zzg;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault9 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault9;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault9;
        tuitionPaymentFragmentspecialinlinedviewModeldefault9.b = executor;
        tuitionPaymentFragmentspecialinlinedviewModeldefault9.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "executor";
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault10 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault10;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault10;
        tuitionPaymentFragmentspecialinlinedviewModeldefault10.b = null;
        tuitionPaymentFragmentspecialinlinedviewModeldefault10.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "overrideAuthority";
        zzbiw zzbiwVar = this.zzh;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault11 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault11;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault11;
        tuitionPaymentFragmentspecialinlinedviewModeldefault11.b = zzbiwVar;
        tuitionPaymentFragmentspecialinlinedviewModeldefault11.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "metricRecorder";
        zzbjj zzbjjVar = this.zzi;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault12 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault12;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault12;
        tuitionPaymentFragmentspecialinlinedviewModeldefault12.b = zzbjjVar;
        tuitionPaymentFragmentspecialinlinedviewModeldefault12.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "nameResolverRegistry";
        return tuitionPaymentFragmentbindingInflater1.toString();
    }

    public static zzbix zzg() {
        return new zzbix();
    }

    public final int zza() {
        return this.zza;
    }

    public final zzbjn zzb() {
        return this.zzb;
    }

    public final zzbkd zzc() {
        return this.zzc;
    }

    public final zzbje zze() {
        return this.zzd;
    }

    public final Executor zzf() {
        return this.zzg;
    }
}
