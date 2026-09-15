package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes.dex */
public final class getPackageName {
    public static final <K, V> Map<K, V> TuitionPaymentFragmentbindingInflater1(Map<K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return MapsKt.emptyMap();
        }
        if (size == 1) {
            Map.Entry entry = (Map.Entry) CollectionsKt.first(map.entrySet());
            return Collections.singletonMap(entry.getKey(), entry.getValue());
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static final <T> List<T> TuitionPaymentFragmentbindingInflater1(List<? extends T> list) {
        int size = list.size();
        if (size == 0) {
            return CollectionsKt.emptyList();
        }
        if (size == 1) {
            return Collections.singletonList(CollectionsKt.first((List) list));
        }
        return Collections.unmodifiableList(new ArrayList(list));
    }
}
