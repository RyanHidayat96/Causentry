package com.google.android.libraries.places.widget.internal.placedetails;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzh extends zzi {
    private final String zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(String str) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzh) && Intrinsics.areEqual(this.zza, ((zzh) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20);
        sb.append("SectionTitle(title=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final String zza() {
        return this.zza;
    }
}
