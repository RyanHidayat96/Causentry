package androidx.room.concurrent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/room/concurrent/CloseBarrier;", "Lkotlin/Function0;", "", "p0", "ifNotClosed", "(Landroidx/room/concurrent/CloseBarrier;Lkotlin/jvm/functions/Function0;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CloseBarrierKt {
    public static final void ifNotClosed(CloseBarrier closeBarrier, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(closeBarrier, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (closeBarrier.block$room_runtime_release()) {
            try {
                function0.invoke();
            } finally {
                closeBarrier.unblock$room_runtime_release();
            }
        }
    }
}
