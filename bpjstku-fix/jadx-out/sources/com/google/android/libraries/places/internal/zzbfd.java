package com.google.android.libraries.places.internal;

import defpackage.CameraStateRegistryCameraRegistration;
import defpackage.registerCamera;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbfd {
    public static final zzbfd zza;
    private final zzbgg zzb;
    private final Executor zzc;
    private final Object[][] zzd;
    private final List zze;
    private final Boolean zzf;
    private final Integer zzg;
    private final Integer zzh;

    static {
        zzbfb zzbfbVar = new zzbfb();
        zzbfbVar.zzc = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        zzbfbVar.zzd = Collections.emptyList();
        zza = new zzbfd(zzbfbVar, null);
    }

    public final zzbfd zza(zzbgg zzbggVar) {
        zzbfb zzbfbVarZzp = zzp(this);
        zzbfbVarZzp.zza = zzbggVar;
        return new zzbfd(zzbfbVarZzp, null);
    }

    public final zzbfd zzc() {
        zzbfb zzbfbVarZzp = zzp(this);
        zzbfbVarZzp.zze = Boolean.TRUE;
        return new zzbfd(zzbfbVarZzp, null);
    }

    public final zzbfd zzd() {
        zzbfb zzbfbVarZzp = zzp(this);
        zzbfbVarZzp.zze = Boolean.FALSE;
        return new zzbfd(zzbfbVarZzp, null);
    }

    public final zzbfd zze(Executor executor) {
        zzbfb zzbfbVarZzp = zzp(this);
        zzbfbVarZzp.zzb = executor;
        return new zzbfd(zzbfbVarZzp, null);
    }

    public final zzbfd zzf(zzbfm zzbfmVar) {
        List list = this.zze;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(zzbfmVar);
        zzbfb zzbfbVarZzp = zzp(this);
        zzbfbVarZzp.zzd = Collections.unmodifiableList(arrayList);
        return new zzbfd(zzbfbVarZzp, null);
    }

    public final Object zzi(zzbfc zzbfcVar) {
        if (zzbfcVar == null) {
            throw new NullPointerException("key");
        }
        int i = 0;
        while (true) {
            Object[][] objArr = this.zzd;
            if (i >= objArr.length) {
                return null;
            }
            if (zzbfcVar.equals(objArr[i][0])) {
                return objArr[i][1];
            }
            i++;
        }
    }

    public final boolean zzk() {
        return Boolean.TRUE.equals(this.zzf);
    }

    public final zzbfd zzl(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("invalid maxsize %s", Integer.valueOf(i)));
        }
        zzbfb zzbfbVarZzp = zzp(this);
        zzbfbVarZzp.zzf = Integer.valueOf(i);
        return new zzbfd(zzbfbVarZzp, null);
    }

    public final zzbfd zzm(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("invalid maxsize %s", Integer.valueOf(i)));
        }
        zzbfb zzbfbVarZzp = zzp(this);
        zzbfbVarZzp.zzg = Integer.valueOf(i);
        return new zzbfd(zzbfbVarZzp, null);
    }

    public final zzbfd zzh(zzbfc zzbfcVar, Object obj) {
        Object[][] objArr;
        int length;
        if (zzbfcVar == null) {
            throw new NullPointerException("key");
        }
        if (obj != null) {
            zzbfb zzbfbVarZzp = zzp(this);
            int i = 0;
            while (true) {
                objArr = this.zzd;
                length = objArr.length;
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (zzbfcVar.equals(objArr[i][0])) {
                    break;
                }
                i++;
            }
            zzbfbVarZzp.zzc = (Object[][]) Array.newInstance((Class<?>) Object.class, (i == -1 ? 1 : 0) + length, 2);
            System.arraycopy(objArr, 0, zzbfbVarZzp.zzc, 0, length);
            if (i == -1) {
                zzbfbVarZzp.zzc[length] = new Object[]{zzbfcVar, obj};
            } else {
                zzbfbVarZzp.zzc[i] = new Object[]{zzbfcVar, obj};
            }
            return new zzbfd(zzbfbVarZzp, null);
        }
        throw new NullPointerException("value");
    }

    public final String toString() {
        byte b = 0;
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), b);
        zzbgg zzbggVar = this.zzb;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = zzbggVar;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "deadline";
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.b = null;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "authority";
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault4;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault4;
        tuitionPaymentFragmentspecialinlinedviewModeldefault4.b = null;
        tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "callCredentials";
        Executor executor = this.zzc;
        Class<?> cls = executor != null ? executor.getClass() : null;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault5 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault5;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault5;
        tuitionPaymentFragmentspecialinlinedviewModeldefault5.b = cls;
        tuitionPaymentFragmentspecialinlinedviewModeldefault5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "executor";
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault6 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault6;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault6;
        tuitionPaymentFragmentspecialinlinedviewModeldefault6.b = null;
        tuitionPaymentFragmentspecialinlinedviewModeldefault6.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "compressorName";
        String strDeepToString = Arrays.deepToString(this.zzd);
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault7 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault7;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault7;
        tuitionPaymentFragmentspecialinlinedviewModeldefault7.b = strDeepToString;
        tuitionPaymentFragmentspecialinlinedviewModeldefault7.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "customOptions";
        String strValueOf = String.valueOf(zzk());
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault8 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(b);
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault8;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault8;
        tuitionPaymentFragmentspecialinlinedviewModeldefault8.b = strValueOf;
        tuitionPaymentFragmentspecialinlinedviewModeldefault8.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "waitForReady";
        Integer num = this.zzg;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault9 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault9;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault9;
        tuitionPaymentFragmentspecialinlinedviewModeldefault9.b = num;
        tuitionPaymentFragmentspecialinlinedviewModeldefault9.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "maxInboundMessageSize";
        Integer num2 = this.zzh;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault10 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault10;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault10;
        tuitionPaymentFragmentspecialinlinedviewModeldefault10.b = num2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault10.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "maxOutboundMessageSize";
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault11 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault11;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault11;
        tuitionPaymentFragmentspecialinlinedviewModeldefault11.b = null;
        tuitionPaymentFragmentspecialinlinedviewModeldefault11.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "onReadyThreshold";
        List list = this.zze;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault12 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault12;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault12;
        tuitionPaymentFragmentspecialinlinedviewModeldefault12.b = list;
        tuitionPaymentFragmentspecialinlinedviewModeldefault12.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "streamTracerFactories";
        return tuitionPaymentFragmentbindingInflater1.toString();
    }

    /* synthetic */ zzbfd(zzbfb zzbfbVar, byte[] bArr) {
        this.zzb = zzbfbVar.zza;
        this.zzc = zzbfbVar.zzb;
        this.zzd = zzbfbVar.zzc;
        this.zze = zzbfbVar.zzd;
        this.zzf = zzbfbVar.zze;
        this.zzg = zzbfbVar.zzf;
        this.zzh = zzbfbVar.zzg;
    }

    private static zzbfb zzp(zzbfd zzbfdVar) {
        zzbfb zzbfbVar = new zzbfb();
        zzbfbVar.zza = zzbfdVar.zzb;
        zzbfbVar.zzb = zzbfdVar.zzc;
        zzbfbVar.zzc = zzbfdVar.zzd;
        zzbfbVar.zzd = zzbfdVar.zze;
        zzbfbVar.zze = zzbfdVar.zzf;
        zzbfbVar.zzf = zzbfdVar.zzg;
        zzbfbVar.zzg = zzbfdVar.zzh;
        return zzbfbVar;
    }

    public final zzbgg zzb() {
        return this.zzb;
    }

    public final List zzg() {
        return this.zze;
    }

    public final Executor zzj() {
        return this.zzc;
    }

    public final Integer zzn() {
        return this.zzg;
    }

    public final Integer zzo() {
        return this.zzh;
    }
}
