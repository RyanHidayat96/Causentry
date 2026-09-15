package com.squareup.picasso;

/* JADX INFO: loaded from: classes4.dex */
public enum MemoryPolicy {
    NO_CACHE(1),
    NO_STORE(2);

    final int index;

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        return (i & NO_CACHE.index) == 0;
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        return (i & NO_STORE.index) == 0;
    }

    MemoryPolicy(int i) {
        this.index = i;
    }
}
