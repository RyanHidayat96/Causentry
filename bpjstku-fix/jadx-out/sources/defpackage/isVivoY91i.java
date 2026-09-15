package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\t\u0010\b\u001a\u00020\tX\u0082\u0004R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/CompletedExceptionally;", "", "cause", "", "handled", "", "<init>", "(Ljava/lang/Throwable;Z)V", "_handled", "Lkotlinx/atomicfu/AtomicBoolean;", "getHandled", "()Z", "makeHandled", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class isVivoY91i {
    private static final /* synthetic */ AtomicIntegerFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault2 = AtomicIntegerFieldUpdater.newUpdater(isVivoY91i.class, "_handled$volatile");
    public final Throwable TuitionPaymentFragmentbindingInflater1;
    private volatile /* synthetic */ int _handled$volatile;

    public isVivoY91i(Throwable th, boolean z) {
        this.TuitionPaymentFragmentbindingInflater1 = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public /* synthetic */ isVivoY91i(Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? false : z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(resolveAudioMimeInfo.TuitionPaymentFragmentbindingInflater1(this));
        sb.append('[');
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(']');
        return sb.toString();
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(this) != 0;
    }

    public final boolean b() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2.compareAndSet(this, 0, 1);
    }
}
