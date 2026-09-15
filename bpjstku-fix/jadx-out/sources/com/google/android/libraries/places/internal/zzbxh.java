package com.google.android.libraries.places.internal;

import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbxh extends zzbgm {
    static final zzbyl zza;
    static final zzbsu zzb;
    public static final /* synthetic */ int zzc = 0;
    private static final zzbwd zzf;
    private final zzbsc zzd;
    private SSLSocketFactory zzi;
    private final zzbwn zze = zzbwp.zze();
    private final zzbsu zzg = zzb;
    private final zzbsu zzh = zzbwf.zzc(zzbpf.zzn);
    private final zzbyl zzj = zza;
    private int zzl = 1;
    private final long zzk = zzbpf.zzj;

    static {
        Logger.getLogger(zzbxh.class.getName());
        zzbyk zzbykVar = new zzbyk(zzbyl.zza);
        zzbykVar.zza(zzbyj.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, zzbyj.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, zzbyj.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, zzbyj.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, zzbyj.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, zzbyj.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        zzbykVar.zzc(zzbyx.TLS_1_2);
        zzbykVar.zze(true);
        zza = zzbykVar.zzf();
        TimeUnit.DAYS.toNanos(1000L);
        zzbxc zzbxcVar = new zzbxc();
        zzf = zzbxcVar;
        zzb = zzbwf.zzc(zzbxcVar);
        EnumSet.of(zzbkf.MTLS, zzbkf.CUSTOM_MANAGERS);
    }

    private zzbxh(String str) {
        this.zzd = new zzbsc(str, null, null, new zzbxe(this, null), new zzbxd(this, null));
    }

    public static zzbxh zze(String str, int i) {
        return new zzbxh(zzbpf.zzc(str, 443));
    }

    public final zzbxh zzf() {
        this.zzl = 1;
        return this;
    }

    final zzbxg zzg() {
        long j = this.zzk;
        zzbyl zzbylVar = this.zzj;
        zzbwn zzbwnVar = this.zze;
        return new zzbxg(this.zzg, this.zzh, null, zzi(), null, zzbylVar, 4194304, false, Long.MAX_VALUE, j, 65535, false, Integer.MAX_VALUE, zzbwnVar, false, null, null);
    }

    final int zzh() {
        int i = this.zzl;
        if (i == 0) {
            throw null;
        }
        if (i - 1 == 0) {
            return 443;
        }
        throw new AssertionError("TLS not handled");
    }

    final SSLSocketFactory zzi() {
        int i = this.zzl;
        if (i == 0) {
            throw null;
        }
        if (i - 1 != 0) {
            throw new RuntimeException("Unknown negotiation type: TLS");
        }
        try {
            if (this.zzi == null) {
                this.zzi = SSLContext.getInstance("Default", zzbyv.zze().zzf()).getSocketFactory();
            }
            return this.zzi;
        } catch (GeneralSecurityException e2) {
            throw new RuntimeException("TLS Provider failure", e2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbgm
    protected final zzbih zza() {
        return this.zzd;
    }
}
