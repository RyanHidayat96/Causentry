package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzug {
    public static final zzug zza = new zzug("about:invalid#zGuavaz");
    private final String zzb;

    zzug(String str) {
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzug) {
            return this.zzb.equals(((zzug) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() ^ 18288376;
    }

    public final String toString() {
        String str = this.zzb;
        StringBuilder sb = new StringBuilder(str.length() + 9);
        sb.append("SafeUrl{");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public final String zza() {
        return this.zzb;
    }
}
