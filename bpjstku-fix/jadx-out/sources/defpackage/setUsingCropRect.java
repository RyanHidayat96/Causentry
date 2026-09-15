package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes4.dex */
public final class setUsingCropRect {
    private static final Map<KClass<?>, String> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ConcurrentHashMap();

    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault3(KClass<?> kClass) {
        Map<KClass<?>, String> map = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str = map.get(kClass);
        if (str != null) {
            return str;
        }
        String name = JvmClassMappingKt.getJavaClass((KClass) kClass).getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "");
        map.put(kClass, name);
        return name;
    }
}
