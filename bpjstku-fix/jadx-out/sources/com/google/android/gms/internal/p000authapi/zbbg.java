package com.google.android.gms.internal.p000authapi;

/* JADX INFO: loaded from: classes6.dex */
final class zbbg extends zbbe {
    private final zbbi zba;

    zbbg(zbbi zbbiVar, int i) {
        super(zbbiVar.size(), i);
        this.zba = zbbiVar;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbe
    protected final Object zba(int i) {
        return this.zba.get(i);
    }
}
