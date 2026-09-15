package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes4.dex */
public final class setIoExecutor implements setJpegQuality {
    public Map<String, ? extends Set<? extends Object>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public setIoExecutor(Map<String, ? extends Set<? extends Object>> map) {
        Intrinsics.checkNotNullParameter(map, "");
        Set<Map.Entry<String, ? extends Set<? extends Object>>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            Pair pair = TuplesKt.to(lowerCase, entry.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = linkedHashMap;
    }

    @Override // defpackage.setJpegQuality
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        HttpUrl httpUrl = HttpUrl.INSTANCE.parse(str);
        if (httpUrl == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(httpUrl, "");
        String strHost = httpUrl.host();
        Set<String> setKeySet = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.keySet();
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            for (String str2 : setKeySet) {
                if (Intrinsics.areEqual(str2, "*") || Intrinsics.areEqual(strHost, str2) || StringsKt.endsWith$default(strHost, ".".concat(String.valueOf(str2)), false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }
}
