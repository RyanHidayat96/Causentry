package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbhq extends zzbhy {
    private final zzbht zza;

    public zzbhq(zzbht zzbhtVar) {
        if (zzbhtVar == null) {
            throw new NullPointerException("result");
        }
        this.zza = zzbhtVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbhq) {
            return this.zza.equals(((zzbhq) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 19);
        sb.append("FixedResultPicker(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbhy
    public final zzbht zza(zzbhu zzbhuVar) {
        return this.zza;
    }
}
