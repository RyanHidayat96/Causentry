package com.google.common.collect;

import defpackage.setVideoStabilization;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class NaturalOrdering extends setVideoStabilization<Comparable<?>> implements Serializable {
    public static final NaturalOrdering b = new NaturalOrdering();
    private static final long serialVersionUID = 0;

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    private Object readResolve() {
        return b;
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    private NaturalOrdering() {
    }
}
