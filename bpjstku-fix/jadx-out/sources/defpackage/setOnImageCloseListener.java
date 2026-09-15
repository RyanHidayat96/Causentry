package defpackage;

import androidx.p005navigation.NavDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class setOnImageCloseListener implements SingleCloseImageProxy<NavDestination> {
    @Override // defpackage.SingleCloseImageProxy
    public final /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "");
        return true;
    }

    @Override // defpackage.SingleCloseImageProxy
    public final /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3(NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "");
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
