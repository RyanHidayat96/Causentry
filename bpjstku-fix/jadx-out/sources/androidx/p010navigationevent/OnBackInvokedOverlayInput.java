package androidx.p010navigationevent;

import android.window.OnBackInvokedDispatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/navigationevent/OnBackInvokedOverlayInput;", "Landroidx/navigationevent/OnBackInvokedInput;", "Landroid/window/OnBackInvokedDispatcher;", "p0", "<init>", "(Landroid/window/OnBackInvokedDispatcher;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OnBackInvokedOverlayInput extends OnBackInvokedInput {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBackInvokedOverlayInput(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        super(onBackInvokedDispatcher, 1000000, null);
        Intrinsics.checkNotNullParameter(onBackInvokedDispatcher, "");
    }
}
