package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class createSubscriptionCallback {
    private final Drawable TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final boolean b;

    public createSubscriptionCallback(Drawable drawable, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = drawable;
        this.b = z;
    }

    public final Drawable TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createSubscriptionCallback)) {
            return false;
        }
        createSubscriptionCallback createsubscriptioncallback = (createSubscriptionCallback) obj;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, createsubscriptioncallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && this.b == createsubscriptioncallback.b;
    }

    public final int hashCode() {
        return (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode() * 31) + Boolean.hashCode(this.b);
    }
}
