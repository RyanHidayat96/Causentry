package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u001e\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "", "p0", "", "measureNanoTime", "(Lkotlin/jvm/functions/Function0;)J"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyLayoutPrefetchState_jvmKt {
    public static final long measureNanoTime(Function0<Unit> function0) {
        long jNanoTime = System.nanoTime();
        function0.invoke();
        return System.nanoTime() - jNanoTime;
    }
}
