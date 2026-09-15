package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class onRepeatModeChanged implements onSessionReady {
    private final onQueueTitleChanged TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public onRepeatModeChanged(onQueueTitleChanged onqueuetitlechanged) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = onqueuetitlechanged;
    }

    @Override // defpackage.onSessionReady
    public final Object b(Continuation<? super onQueueTitleChanged> continuation) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onRepeatModeChanged) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((onRepeatModeChanged) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
    }
}
