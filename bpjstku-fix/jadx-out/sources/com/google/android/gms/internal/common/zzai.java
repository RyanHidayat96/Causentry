package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes6.dex */
final class zzai extends zzad {
    private final zzak zza;

    zzai(zzak zzakVar, int i) {
        super(zzakVar.size(), i);
        this.zza = zzakVar;
    }

    @Override // com.google.android.gms.internal.common.zzad
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
