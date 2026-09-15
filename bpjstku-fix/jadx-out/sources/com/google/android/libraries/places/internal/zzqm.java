package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzqm extends ThreadLocal {
    zzqm() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        zzqy zzqyVar = new zzqy(zzqb.zza(Thread.currentThread()));
        Thread threadCurrentThread = Thread.currentThread();
        synchronized (zzqj.zzd) {
            zzqj.zzd.put(threadCurrentThread, zzqyVar);
        }
        return zzqyVar;
    }
}
