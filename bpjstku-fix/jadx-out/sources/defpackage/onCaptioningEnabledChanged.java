package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class onCaptioningEnabledChanged implements onSessionReady {
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public onCaptioningEnabledChanged(Context context) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = context;
    }

    @Override // defpackage.onSessionReady
    public final Object b(Continuation<? super onQueueTitleChanged> continuation) {
        DisplayMetrics displayMetrics = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getResources().getDisplayMetrics();
        onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = onMetadataChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new onQueueTitleChanged(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onCaptioningEnabledChanged) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((onCaptioningEnabledChanged) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
    }
}
