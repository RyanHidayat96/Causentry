package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public enum zzaju implements zzbai {
    ORIENTATION_UNDEFINED(0),
    ORIENTATION_VERTICAL(1),
    ORIENTATION_HORIZONTAL(2);

    private final int zzd;

    zzaju(int i) {
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
