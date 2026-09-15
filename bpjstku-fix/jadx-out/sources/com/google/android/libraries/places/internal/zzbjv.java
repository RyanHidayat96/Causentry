package com.google.android.libraries.places.internal;

import defpackage.notifyOnConfigureAvailableListener;
import defpackage.registerCamera;
import defpackage.tryOpenCamera;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbjv {
    public static final zzbjv zza;
    public static final zzbjv zzb;
    public static final zzbjv zzc;
    public static final zzbjv zzd;
    public static final zzbjv zze;
    public static final zzbjv zzf;
    public static final zzbjv zzg;
    public static final zzbjv zzh;
    public static final zzbjv zzi;
    static final zzbil zzj;
    static final zzbil zzk;
    private static final List zzl;
    private static final zzbio zzm;
    private final zzbjs zzn;
    private final String zzo;
    private final Throwable zzp;

    static {
        TreeMap treeMap = new TreeMap();
        zzbjs[] zzbjsVarArrValues = zzbjs.values();
        int length = zzbjsVarArrValues.length;
        boolean z = false;
        int i = 0;
        while (true) {
            byte[] bArr = null;
            if (i >= length) {
                zzl = Collections.unmodifiableList(new ArrayList(treeMap.values()));
                zza = zzbjs.OK.zzb();
                zzb = zzbjs.CANCELLED.zzb();
                zzc = zzbjs.UNKNOWN.zzb();
                zzbjs.INVALID_ARGUMENT.zzb();
                zzd = zzbjs.DEADLINE_EXCEEDED.zzb();
                zzbjs.NOT_FOUND.zzb();
                zzbjs.ALREADY_EXISTS.zzb();
                zze = zzbjs.PERMISSION_DENIED.zzb();
                zzbjs.UNAUTHENTICATED.zzb();
                zzf = zzbjs.RESOURCE_EXHAUSTED.zzb();
                zzg = zzbjs.FAILED_PRECONDITION.zzb();
                zzbjs.ABORTED.zzb();
                zzbjs.OUT_OF_RANGE.zzb();
                zzbjs.UNIMPLEMENTED.zzb();
                zzh = zzbjs.INTERNAL.zzb();
                zzi = zzbjs.UNAVAILABLE.zzb();
                zzbjs.DATA_LOSS.zzb();
                zzj = new zzbin("grpc-status", z, new zzbjt(bArr), bArr);
                zzbju zzbjuVar = new zzbju(null);
                zzm = zzbjuVar;
                zzk = new zzbin("grpc-message", z, zzbjuVar, bArr);
                return;
            }
            zzbjs zzbjsVar = zzbjsVarArrValues[i];
            zzbjv zzbjvVar = (zzbjv) treeMap.put(Integer.valueOf(zzbjsVar.zza()), new zzbjv(zzbjsVar, null, null));
            if (zzbjvVar != null) {
                String strName = zzbjvVar.zzn.name();
                String strName2 = zzbjsVar.name();
                StringBuilder sb = new StringBuilder(String.valueOf(strName).length() + 34 + String.valueOf(strName2).length());
                sb.append("Code value duplication between ");
                sb.append(strName);
                sb.append(" & ");
                sb.append(strName2);
                throw new IllegalStateException(sb.toString());
            }
            i++;
        }
    }

    private zzbjv(zzbjs zzbjsVar, String str, Throwable th) {
        if (zzbjsVar == null) {
            throw new NullPointerException("code");
        }
        this.zzn = zzbjsVar;
        this.zzo = str;
        this.zzp = th;
    }

    public static zzbjv zza(int i) {
        if (i >= 0) {
            List list = zzl;
            if (i < list.size()) {
                return (zzbjv) list.get(i);
            }
        }
        zzbjv zzbjvVar = zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 13);
        sb.append("Unknown code ");
        sb.append(i);
        return zzbjvVar.zze(sb.toString());
    }

    public static zzbjv zzb(Throwable th) {
        if (th == null) {
            throw new NullPointerException("t");
        }
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof zzbjw) {
                return ((zzbjw) cause).zza();
            }
            if (cause instanceof zzbjy) {
                return ((zzbjy) cause).zza();
            }
        }
        return zzc.zzd(th);
    }

    static String zzc(zzbjv zzbjvVar) {
        String str = zzbjvVar.zzo;
        zzbjs zzbjsVar = zzbjvVar.zzn;
        if (str == null) {
            return zzbjsVar.toString();
        }
        String strValueOf = String.valueOf(zzbjsVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 2 + str.length());
        sb.append(strValueOf);
        sb.append(": ");
        sb.append(str);
        return sb.toString();
    }

    static /* synthetic */ zzbjv zzk(byte[] bArr) {
        int i;
        byte b;
        int length = bArr.length;
        char c = 0;
        if (length == 1) {
            if (bArr[0] == 48) {
                return zza;
            }
            length = 1;
        }
        if (length != 1) {
            if (length == 2 && (b = bArr[0]) >= 48 && b <= 57) {
                i = (b - 48) * 10;
                c = 1;
            }
            return zzc.zze("Unknown code ".concat(new String(bArr, StandardCharsets.US_ASCII)));
        }
        i = 0;
        byte b2 = bArr[c];
        if (b2 >= 48 && b2 <= 57) {
            int i2 = i + (b2 - 48);
            List list = zzl;
            if (i2 < list.size()) {
                return (zzbjv) list.get(i2);
            }
        }
        return zzc.zze("Unknown code ".concat(new String(bArr, StandardCharsets.US_ASCII)));
    }

    public final zzbjv zzd(Throwable th) {
        return tryOpenCamera.b(this.zzp, th) ? this : new zzbjv(this.zzn, this.zzo, th);
    }

    public final zzbjv zze(String str) {
        return tryOpenCamera.b(this.zzo, str) ? this : new zzbjv(this.zzn, str, this.zzp);
    }

    public final zzbjv zzf(String str) {
        String str2 = this.zzo;
        if (str2 == null) {
            return new zzbjv(this.zzn, str, this.zzp);
        }
        zzbjs zzbjsVar = this.zzn;
        StringBuilder sb = new StringBuilder(str2.length() + 1 + str.length());
        sb.append(str2);
        sb.append("\n");
        sb.append(str);
        return new zzbjv(zzbjsVar, sb.toString(), this.zzp);
    }

    public final boolean zzj() {
        return zzbjs.OK == this.zzn;
    }

    public final String toString() {
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), (byte) 0);
        String strName = this.zzn.name();
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = strName;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "code";
        String str = this.zzo;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.b = str;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "description";
        Throwable th = this.zzp;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = th;
        if (th != null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = notifyOnConfigureAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
        }
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault4;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault4;
        tuitionPaymentFragmentspecialinlinedviewModeldefault4.b = objTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "cause";
        return tuitionPaymentFragmentbindingInflater1.toString();
    }

    public final zzbjs zzg() {
        return this.zzn;
    }

    public final String zzh() {
        return this.zzo;
    }

    public final Throwable zzi() {
        return this.zzp;
    }
}
