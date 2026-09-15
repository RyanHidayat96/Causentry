package com.koushikdutta.async.util;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class TaggedList<T> extends ArrayList<T> {
    public Object tag;

    public final <V> V TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        V v;
        synchronized (this) {
            v = (V) this.tag;
        }
        return v;
    }
}
