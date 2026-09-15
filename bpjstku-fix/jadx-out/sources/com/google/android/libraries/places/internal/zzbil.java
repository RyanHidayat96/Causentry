package com.google.android.libraries.places.internal;

import defpackage.CameraStateRegistryCameraRegistration;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbil {
    public static final /* synthetic */ int zza = 0;
    private static final BitSet zzb;
    private final String zzc;
    private final String zzd;
    private final byte[] zze;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            bitSet.set(c);
        }
        for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        zzb = bitSet;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0059 A[SYNTHETIC] */
    /* synthetic */ zzbil(String str, boolean z, Object obj, byte[] bArr) {
        if (str == null) {
            throw new NullPointerException("name");
        }
        this.zzc = str;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (lowerCase == null) {
            throw new NullPointerException("name");
        }
        if (!(!lowerCase.isEmpty())) {
            throw new IllegalArgumentException("token must have at least 1 tchar");
        }
        if (lowerCase.equals("connection")) {
            zzbip.zzc.logp(Level.WARNING, "io.grpc.Metadata$Key", "validateName", "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        int i = 0;
        while (i < lowerCase.length()) {
            char cCharAt = lowerCase.charAt(i);
            if (z && cCharAt == ':') {
                if (i == 0) {
                    i = 0;
                } else {
                    cCharAt = ':';
                    if (zzb.get(cCharAt)) {
                        throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Invalid character '%s' in key name '%s'", Character.valueOf(cCharAt), lowerCase));
                    }
                }
            } else if (zzb.get(cCharAt)) {
                throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Invalid character '%s' in key name '%s'", Character.valueOf(cCharAt), lowerCase));
            }
            i++;
        }
        this.zzd = lowerCase;
        this.zze = lowerCase.getBytes(StandardCharsets.US_ASCII);
    }

    public static zzbil zzc(String str, zzbik zzbikVar) {
        return new zzbij(str, false, zzbikVar, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zzd.equals(((zzbil) obj).zzd);
    }

    public final int hashCode() {
        return this.zzd.hashCode();
    }

    public final String toString() {
        String str = this.zzd;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append("Key{name='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    abstract byte[] zza(Object obj);

    abstract Object zzb(byte[] bArr);

    public final String zzd() {
        return this.zzd;
    }

    final byte[] zze() {
        return this.zze;
    }
}
