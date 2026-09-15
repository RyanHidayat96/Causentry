package com.google.android.libraries.places.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.CameraStateRegistryCameraRegistrationExternalSyntheticLambda0;
import defpackage.markCameraState;
import defpackage.setContainerClass;
import defpackage.traceState;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbpf {
    public static final zzbil zza;
    public static final zzbil zzb;
    public static final zzbil zzc;
    public static final zzbil zzd;
    public static final zzbil zze;
    static final zzbil zzf;
    public static final zzbil zzg;
    public static final zzbil zzh;
    public static final zzbil zzi;
    public static final long zzj;
    public static final zzbjn zzk;
    public static final zzbfc zzl;
    public static final zzbwd zzm;
    public static final zzbwd zzn;
    public static final CameraStateRegistryCameraRegistrationExternalSyntheticLambda0 zzo;
    private static final Logger zzp = Logger.getLogger(zzbpf.class.getName());
    private static final Set zzq = Collections.unmodifiableSet(EnumSet.of(zzbjs.OK, zzbjs.INVALID_ARGUMENT, zzbjs.NOT_FOUND, zzbjs.ALREADY_EXISTS, zzbjs.FAILED_PRECONDITION, zzbjs.ABORTED, zzbjs.OUT_OF_RANGE, zzbjs.DATA_LOSS));
    private static final zzbfp zzr;

    static {
        Charset.forName("US-ASCII");
        zza = zzbil.zzc("grpc-timeout", new zzbpe());
        zzb = zzbil.zzc("grpc-encoding", zzbip.zza);
        zzc = zzbhh.zza("grpc-accept-encoding", new zzbpc(null));
        zzd = zzbil.zzc("content-encoding", zzbip.zza);
        zze = zzbhh.zza("accept-encoding", new zzbpc(null));
        zzf = zzbil.zzc("content-length", zzbip.zza);
        zzg = zzbil.zzc("content-type", zzbip.zza);
        zzh = zzbil.zzc("te", zzbip.zza);
        zzi = zzbil.zzc("user-agent", zzbip.zza);
        markCameraState markcamerastate = new markCameraState(new markCameraState.AnonymousClass3(traceState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(',')));
        new markCameraState(markcamerastate.TuitionPaymentFragmentspecialinlinedviewModeldefault2, markcamerastate.TuitionPaymentFragmentspecialinlinedviewModeldefault1, traceState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), markcamerastate.b);
        zzj = TimeUnit.SECONDS.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        TimeUnit.SECONDS.toNanos(20L);
        zzk = new zzbtt();
        zzl = zzbfc.zza("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        zzr = new zzboy();
        zzm = new zzboz();
        zzn = new zzbpa();
        zzo = new zzbpb();
    }

    public static String zzc(String str, int i) {
        try {
            return new URI(null, null, str, 443, null, null, null).getAuthority();
        } catch (URISyntaxException e2) {
            StringBuilder sb = new StringBuilder(str.length() + 26);
            sb.append("Invalid host or port: ");
            sb.append(str);
            sb.append(" 443");
            throw new IllegalArgumentException(sb.toString(), e2);
        }
    }

    public static ThreadFactory zzd(String str, boolean z) {
        setContainerClass setcontainerclass = new setContainerClass();
        setcontainerclass.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Boolean.TRUE;
        new Object[]{0};
        setcontainerclass.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        return setContainerClass.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setcontainerclass);
    }

    static zzblu zze(zzbht zzbhtVar, boolean z) {
        zzbhx zzbhxVarZze = zzbhtVar.zze();
        zzblu zzbluVarZza = zzbhxVarZze != null ? ((zzbwm) zzbhxVarZze.zze()).zza() : null;
        if (zzbluVarZza != null) {
            return zzbluVarZza;
        }
        if (!zzbhtVar.zzf().zzj()) {
            if (zzbhtVar.zzg()) {
                return new zzbop(zzi(zzbhtVar.zzf()), zzbls.DROPPED);
            }
            if (!z) {
                return new zzbop(zzi(zzbhtVar.zzf()), zzbls.PROCESSED);
            }
        }
        return null;
    }

    public static zzbfp[] zzf(zzbfd zzbfdVar, zzbip zzbipVar, int i, boolean z) {
        List listZzg = zzbfdVar.zzg();
        int size = listZzg.size();
        zzbfp[] zzbfpVarArr = new zzbfp[size + 1];
        zzbfn zzbfnVarZza = zzbfo.zza();
        zzbfnVarZza.zza(zzbfdVar);
        zzbfnVarZza.zzb(i);
        zzbfnVarZza.zzc(z);
        zzbfo zzbfoVarZzd = zzbfnVarZza.zzd();
        for (int i2 = 0; i2 < listZzg.size(); i2++) {
            zzbfpVarArr[i2] = ((zzbfm) listZzg.get(i2)).zza(zzbfoVarZzd, zzbipVar);
        }
        zzbfpVarArr[size] = zzr;
        return zzbfpVarArr;
    }

    static void zzg(zzbwi zzbwiVar) {
        while (true) {
            InputStream inputStreamZza = zzbwiVar.zza();
            if (inputStreamZza == null) {
                return;
            } else {
                zzh(inputStreamZza);
            }
        }
    }

    public static void zzh(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            zzp.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    public static zzbjv zzi(zzbjv zzbjvVar) {
        if (zzbjvVar == null) {
            throw new IllegalArgumentException();
        }
        if (!zzq.contains(zzbjvVar.zzg())) {
            return zzbjvVar;
        }
        zzbjv zzbjvVar2 = zzbjv.zzh;
        String strValueOf = String.valueOf(zzbjvVar.zzg());
        String strZzh = zzbjvVar.zzh();
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 47 + String.valueOf(strZzh).length());
        sb.append("Inappropriate status code from control plane: ");
        sb.append(strValueOf);
        sb.append(" ");
        sb.append(strZzh);
        return zzbjvVar2.zze(sb.toString()).zzd(zzbjvVar.zzi());
    }

    public static boolean zzj(String str, boolean z) {
        String strTrim = System.getenv(str);
        if (strTrim == null) {
            strTrim = System.getProperty(str);
        }
        if (strTrim != null) {
            strTrim = strTrim.trim();
        }
        if (z) {
            return strTrim == null || strTrim.isEmpty() || Boolean.parseBoolean(strTrim);
        }
        return (strTrim == null || strTrim.isEmpty() || !Boolean.parseBoolean(strTrim)) ? false : true;
    }

    public static URI zzb(String str) {
        if (str == null) {
            throw new NullPointerException("authority");
        }
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e2) {
            throw new IllegalArgumentException("Invalid authority: ".concat(String.valueOf(str)), e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0026  */
    /* JADX WARN: Code duplicated, block: B:24:0x0032  */
    public static zzbjv zza(int i) {
        zzbjs zzbjsVar;
        if ((i >= 100 && i < 200) || i == 400) {
            zzbjsVar = zzbjs.INTERNAL;
        } else if (i == 401) {
            zzbjsVar = zzbjs.UNAUTHENTICATED;
        } else if (i == 403) {
            zzbjsVar = zzbjs.PERMISSION_DENIED;
        } else if (i == 404) {
            zzbjsVar = zzbjs.UNIMPLEMENTED;
        } else if (i == 429) {
            zzbjsVar = zzbjs.UNAVAILABLE;
        } else if (i != 431) {
            switch (i) {
                case TypedValues.PositionType.TYPE_DRAWPATH /* 502 */:
                case TypedValues.PositionType.TYPE_PERCENT_WIDTH /* 503 */:
                case TypedValues.PositionType.TYPE_PERCENT_HEIGHT /* 504 */:
                    zzbjsVar = zzbjs.UNAVAILABLE;
                    break;
                default:
                    zzbjsVar = zzbjs.UNKNOWN;
                    break;
            }
        } else {
            zzbjsVar = zzbjs.INTERNAL;
        }
        zzbjv zzbjvVarZzb = zzbjsVar.zzb();
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 17);
        sb.append("HTTP status code ");
        sb.append(i);
        return zzbjvVarZzb.zze(sb.toString());
    }

    private zzbpf() {
    }
}
