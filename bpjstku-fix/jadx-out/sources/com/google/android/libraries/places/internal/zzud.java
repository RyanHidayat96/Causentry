package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzud {
    private final String zza;

    static {
        new zzud("");
        new zzud("<br>");
        new zzud("<!DOCTYPE html>");
    }

    zzud(String str) {
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzud) {
            return this.zza.equals(((zzud) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 867184553;
    }

    public final String toString() {
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + 10);
        sb.append("SafeHtml{");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public final String zza() {
        return this.zza;
    }
}
