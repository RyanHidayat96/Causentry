package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public enum zzajw implements zzbai {
    UNDEFINED(0),
    SEARCH_BY_TEXT_REQUEST(1),
    SEARCH_NEARBY_REQUEST(2);

    private final int zzd;

    zzajw(int i) {
        this.zzd = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzd);
    }

    @Override // com.google.android.libraries.places.internal.zzbai
    public final int zza() {
        return this.zzd;
    }
}
