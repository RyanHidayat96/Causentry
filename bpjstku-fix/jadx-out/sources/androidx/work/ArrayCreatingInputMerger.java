package androidx.work;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/work/ArrayCreatingInputMerger;", "Landroidx/work/InputMerger;", "<init>", "()V", "", "p0", "p1", "Ljava/lang/Class;", "p2", "concatenateArrayAndNonArray", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "concatenateArrays", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "createArrayFor", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "", "Landroidx/work/Data;", "merge", "(Ljava/util/List;)Landroidx/work/Data;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ArrayCreatingInputMerger extends InputMerger {
    @Override // androidx.work.InputMerger
    public final Data merge(List<Data> p0) {
        Class<?> cls;
        Intrinsics.checkNotNullParameter(p0, "");
        Data.Builder builder = new Data.Builder();
        HashMap map = new HashMap();
        Iterator<Data> it = p0.iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, Object> entry : it.next().getKeyValueMap().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null || (cls = value.getClass()) == null) {
                    cls = String.class;
                }
                Object obj = map.get(key);
                if (obj == null) {
                    if (cls.isArray()) {
                        Intrinsics.checkNotNull(value, "");
                    } else {
                        value = createArrayFor(value, cls);
                    }
                } else {
                    Class<?> cls2 = obj.getClass();
                    if (Intrinsics.areEqual(cls2, cls)) {
                        Intrinsics.checkNotNull(value, "");
                        value = concatenateArrays(obj, value);
                    } else if (Intrinsics.areEqual(cls2.getComponentType(), cls)) {
                        value = concatenateArrayAndNonArray(obj, value, cls);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                map.put(key, value);
            }
        }
        builder.putAll(map);
        return builder.build();
    }

    private final Object concatenateArrays(Object p0, Object p1) {
        int length = Array.getLength(p0);
        int length2 = Array.getLength(p1);
        Class<?> componentType = p0.getClass().getComponentType();
        Intrinsics.checkNotNull(componentType);
        Object objNewInstance = Array.newInstance(componentType, length + length2);
        System.arraycopy(p0, 0, objNewInstance, 0, length);
        System.arraycopy(p1, 0, objNewInstance, length, length2);
        Intrinsics.checkNotNullExpressionValue(objNewInstance, "");
        return objNewInstance;
    }

    private final Object concatenateArrayAndNonArray(Object p0, Object p1, Class<?> p2) {
        int length = Array.getLength(p0);
        Object objNewInstance = Array.newInstance(p2, length + 1);
        System.arraycopy(p0, 0, objNewInstance, 0, length);
        Array.set(objNewInstance, length, p1);
        Intrinsics.checkNotNullExpressionValue(objNewInstance, "");
        return objNewInstance;
    }

    private final Object createArrayFor(Object p0, Class<?> p1) {
        Object objNewInstance = Array.newInstance(p1, 1);
        Array.set(objNewInstance, 0, p0);
        Intrinsics.checkNotNullExpressionValue(objNewInstance, "");
        return objNewInstance;
    }
}
