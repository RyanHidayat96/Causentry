package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0081\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a=\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\n\u0010\u0001\u001a\u00060\u0000j\u0002`\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0080\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t*\f\b\u0000\u0010\n\"\u00020\u00002\u00020\u0000"}, d2 = {"", "p0", "makeSynchronizedObject", "(Ljava/lang/Object;)Ljava/lang/Object;", "R", "Landroidx/compose/ui/platform/SynchronizedObject;", "Lkotlin/Function0;", "p1", "synchronized", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "SynchronizedObject"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class Synchronization_androidKt {
    public static final Object makeSynchronizedObject(Object obj) {
        return obj == null ? new Object() : obj;
    }

    public static /* synthetic */ Object makeSynchronizedObject$default(Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return obj == null ? new Object() : obj;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <R> R m6121synchronized(Object obj, Function0<? extends R> function0) {
        R rInvoke;
        synchronized (obj) {
            rInvoke = function0.invoke();
        }
        return rInvoke;
    }
}
