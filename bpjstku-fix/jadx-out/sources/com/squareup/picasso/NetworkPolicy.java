package com.squareup.picasso;

/* JADX INFO: loaded from: classes4.dex */
public enum NetworkPolicy {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);

    public final int index;

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        return (i & NO_CACHE.index) == 0;
    }

    public static boolean b(int i) {
        return (i & NO_STORE.index) == 0;
    }

    public static boolean TuitionPaymentFragmentbindingInflater1(int i) {
        return (i & OFFLINE.index) != 0;
    }

    NetworkPolicy(int i) {
        this.index = i;
    }
}
