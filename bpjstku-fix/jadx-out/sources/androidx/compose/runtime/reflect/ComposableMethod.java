package androidx.compose.runtime.reflect;

import androidx.compose.runtime.Composer;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\tJ<\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\u0018\u00010\u0001H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0\u000b8G¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Landroidx/compose/runtime/reflect/ComposableMethod;", "", "Ljava/lang/reflect/Method;", "p0", "Landroidx/compose/runtime/reflect/ComposableInfo;", "p1", "<init>", "(Ljava/lang/reflect/Method;Landroidx/compose/runtime/reflect/ComposableInfo;)V", "asMethod", "()Ljava/lang/reflect/Method;", "Landroidx/compose/runtime/Composer;", "", "p2", "invoke", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "composableInfo", "Landroidx/compose/runtime/reflect/ComposableInfo;", "getParameterCount", "parameterCount", "Ljava/lang/reflect/Parameter;", "getParameters", "()[Ljava/lang/reflect/Parameter;", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Ljava/lang/Class;", "getParameterTypes", "()[Ljava/lang/Class;", "parameterTypes"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComposableMethod {
    public static final int $stable = 8;
    private final ComposableInfo composableInfo;
    private final Method method;

    public ComposableMethod(Method method, ComposableInfo composableInfo) {
        this.method = method;
        this.composableInfo = composableInfo;
    }

    /* JADX INFO: renamed from: asMethod, reason: from getter */
    public final Method getMethod() {
        return this.method;
    }

    public final int getParameterCount() {
        return this.composableInfo.getRealParamsCount();
    }

    public final Parameter[] getParameters() {
        return (Parameter[]) ArraysKt.copyOfRange(this.method.getParameters(), 0, this.composableInfo.getRealParamsCount());
    }

    public final Class<?>[] getParameterTypes() {
        return (Class[]) ArraysKt.copyOfRange(this.method.getParameterTypes(), 0, this.composableInfo.getRealParamsCount());
    }

    public final Object invoke(Composer p0, Object p1, Object... p2) {
        Object defaultValue;
        ComposableInfo composableInfo = this.composableInfo;
        int realParamsCount = composableInfo.getRealParamsCount();
        int changedParams = composableInfo.getChangedParams();
        int defaultParams = composableInfo.getDefaultParams();
        int length = this.method.getParameterTypes().length;
        int i = realParamsCount + 1;
        int i2 = changedParams + i;
        Object[] objArr = new Integer[defaultParams];
        for (int i3 = 0; i3 < defaultParams; i3++) {
            int i4 = i3 * 31;
            IntRange intRangeUntil = RangesKt.until(i4, Math.min(i4 + 31, realParamsCount));
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                arrayList.add(Integer.valueOf((iNextInt >= p2.length || p2[iNextInt] == null) ? 1 : 0));
            }
            int iIntValue = 0;
            int i5 = 0;
            for (Object obj : arrayList) {
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                iIntValue |= ((Number) obj).intValue() << i5;
                i5++;
            }
            objArr[i3] = Integer.valueOf(iIntValue);
        }
        Object[] objArr2 = new Object[length];
        int i6 = 0;
        while (i6 < length) {
            if (i6 >= 0 && i6 < realParamsCount) {
                defaultValue = (i6 < 0 || i6 >= p2.length) ? ComposableMethodKt.getDefaultValue(this.method.getParameterTypes()[i6]) : p2[i6];
            } else if (i6 == realParamsCount) {
                defaultValue = p0;
            } else if (i6 == i || (realParamsCount + 2 <= i6 && i6 < i2)) {
                defaultValue = 0;
            } else {
                if (i2 > i6 || i6 >= length) {
                    throw new IllegalStateException("Unexpected index".toString());
                }
                defaultValue = objArr[i6 - i2];
            }
            objArr2[i6] = defaultValue;
            i6++;
        }
        return this.method.invoke(p1, Arrays.copyOf(objArr2, length));
    }

    public final boolean equals(Object p0) {
        if (p0 instanceof ComposableMethod) {
            return Intrinsics.areEqual(this.method, ((ComposableMethod) p0).method);
        }
        return false;
    }

    public final int hashCode() {
        return this.method.hashCode();
    }
}
