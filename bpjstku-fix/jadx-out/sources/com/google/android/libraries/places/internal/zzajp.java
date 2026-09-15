package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public enum zzajp implements zzbai {
    SIZE_UNDEFINED(0),
    SMALL(1),
    MEDIUM(2),
    LARGE(3);

    private final int zze;

    zzajp(int i) {
        this.zze = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zze);
    }

    @Override // com.google.android.libraries.places.internal.zzbai
    public final int zza() {
        return this.zze;
    }
}
