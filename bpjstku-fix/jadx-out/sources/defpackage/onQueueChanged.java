package defpackage;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class onQueueChanged<T extends View> implements onSessionDestroyed<T> {
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final T b;

    public onQueueChanged(T t, boolean z) {
        this.b = t;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
    }

    @Override // defpackage.onSessionDestroyed
    public final T TuitionPaymentFragmentbindingInflater1() {
        return this.b;
    }

    @Override // defpackage.onSessionDestroyed
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onQueueChanged)) {
            return false;
        }
        onQueueChanged onqueuechanged = (onQueueChanged) obj;
        return Intrinsics.areEqual(TuitionPaymentFragmentbindingInflater1(), onqueuechanged.TuitionPaymentFragmentbindingInflater1()) && TuitionPaymentFragmentspecialinlinedviewModeldefault1() == onqueuechanged.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public final int hashCode() {
        return (TuitionPaymentFragmentbindingInflater1().hashCode() * 31) + Boolean.hashCode(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }
}
