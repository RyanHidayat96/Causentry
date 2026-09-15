package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class createPlaneProxy {
    private static final Object TuitionPaymentFragmentbindingInflater1 = new Object();

    public static final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return TuitionPaymentFragmentbindingInflater1;
    }

    public static final <K, V> Map<K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return MapsKt.toMap(iterable, new LinkedHashMap());
    }
}
