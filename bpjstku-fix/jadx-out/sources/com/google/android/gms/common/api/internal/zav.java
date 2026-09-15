package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes6.dex */
final class zav implements Runnable {
    final /* synthetic */ zaaa zaa;

    @Override // java.lang.Runnable
    public final void run() {
        zaaa.zaj(this.zaa).lock();
        try {
            zaaa.zap(this.zaa);
        } finally {
            zaaa.zaj(this.zaa).unlock();
        }
    }

    zav(zaaa zaaaVar) {
        this.zaa = zaaaVar;
    }
}
