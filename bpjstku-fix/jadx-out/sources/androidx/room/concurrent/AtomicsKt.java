package androidx.room.concurrent;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a/\u0010\u0007\u001a\u00020\u0006*\u00060\u0000j\u0002`\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0081\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/room/concurrent/TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "Lkotlin/Function1;", "", "", "p0", "", "loop", "(Ljava/util/concurrent/atomic/AtomicInteger;Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AtomicsKt {
    public static final Void loop(AtomicInteger atomicInteger, Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(atomicInteger, "");
        Intrinsics.checkNotNullParameter(function1, "");
        while (true) {
            function1.invoke(Integer.valueOf(atomicInteger.get()));
        }
    }
}
