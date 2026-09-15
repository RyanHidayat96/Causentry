package com.google.android.libraries.places.widget.internal.placedetails;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzf extends zzi {
    private final String zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(String str) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzf) && Intrinsics.areEqual(this.zza, ((zzf) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append("Feature(name=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final String zza() {
        return this.zza;
    }
}
