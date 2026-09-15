package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class setImplementationMode {
    private final Map<createImageAnalysis, Map<TuitionPaymentFragmentspecialinlinedviewModeldefault2<Object>, Object>> b = new ConcurrentHashMap(16);

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> {
    }

    public final <T> T TuitionPaymentFragmentbindingInflater1(createImageAnalysis createimageanalysis, TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> tuitionPaymentFragmentspecialinlinedviewModeldefault2, Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        T t = (T) TuitionPaymentFragmentspecialinlinedviewModeldefault1(createimageanalysis, tuitionPaymentFragmentspecialinlinedviewModeldefault2);
        if (t != null) {
            return t;
        }
        T tInvoke = function0.invoke();
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        Intrinsics.checkNotNullParameter(tInvoke, "");
        Map<createImageAnalysis, Map<TuitionPaymentFragmentspecialinlinedviewModeldefault2<Object>, Object>> map = this.b;
        ConcurrentHashMap concurrentHashMap = map.get(createimageanalysis);
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap(2);
            map.put(createimageanalysis, concurrentHashMap);
        }
        concurrentHashMap.put(tuitionPaymentFragmentspecialinlinedviewModeldefault2, tInvoke);
        return tInvoke;
    }

    public final <T> T TuitionPaymentFragmentspecialinlinedviewModeldefault1(createImageAnalysis createimageanalysis, TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        Map<TuitionPaymentFragmentspecialinlinedviewModeldefault2<Object>, Object> map = this.b.get(createimageanalysis);
        T t = map != null ? (T) map.get(tuitionPaymentFragmentspecialinlinedviewModeldefault2) : null;
        if (t == null) {
            return null;
        }
        return t;
    }
}
