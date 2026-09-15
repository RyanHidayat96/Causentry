package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a8\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\"\u0010\u0004\u001a\u001e\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "", "p0", "forEachOneBit", "(ILkotlin/jvm/functions/Function2;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ForEachOneBitKt {
    public static final void forEachOneBit(int i, Function2<? super Integer, ? super Integer, Unit> function2) {
        int i2 = 0;
        while (i != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i);
            function2.invoke(Integer.valueOf(iLowestOneBit), Integer.valueOf(i2));
            i2++;
            i ^= iLowestOneBit;
        }
    }
}
