package defpackage;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class isClosed implements SingleCloseImageProxy<Activity> {
    @Override // defpackage.SingleCloseImageProxy
    public final /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        return true;
    }

    @Override // defpackage.SingleCloseImageProxy
    public final /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null);
    }

    public final int hashCode() {
        return getClass().hashCode();
    }
}
