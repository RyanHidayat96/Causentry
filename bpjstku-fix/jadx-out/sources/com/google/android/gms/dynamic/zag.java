package com.google.android.gms.dynamic;

/* JADX INFO: loaded from: classes3.dex */
public final class zag implements zah {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final /* synthetic */ DeferredLifecycleHelper zaa;

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return 5;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(LifecycleDelegate lifecycleDelegate) {
        this.zaa.zaa.onResume();
    }

    zag(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zaa = deferredLifecycleHelper;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = TuitionPaymentFragmentbindingInflater1;
        int i2 = i % 6950162;
        TuitionPaymentFragmentbindingInflater1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iFreeMemory;
        return iFreeMemory;
    }
}
