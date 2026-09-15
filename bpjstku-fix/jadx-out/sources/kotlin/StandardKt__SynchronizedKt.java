package kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"R", "", "p0", "Lkotlin/Function0;", "p1", "synchronized", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/StandardKt")
class StandardKt__SynchronizedKt extends StandardKt__StandardKt {
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    private static final <R> R m8034synchronized(Object obj, Function0<? extends R> function0) {
        R rInvoke;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(function0, "");
        synchronized (obj) {
            rInvoke = function0.invoke();
        }
        return rInvoke;
    }
}
