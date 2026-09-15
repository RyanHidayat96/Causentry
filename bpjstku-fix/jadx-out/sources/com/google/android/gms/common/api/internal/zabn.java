package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes4.dex */
final class zabn implements Runnable {
    final /* synthetic */ int zaa;
    final /* synthetic */ zabq zab;

    @Override // java.lang.Runnable
    public final void run() {
        this.zab.zaI(this.zaa);
    }

    zabn(zabq zabqVar, int i) {
        this.zab = zabqVar;
        this.zaa = i;
    }
}
