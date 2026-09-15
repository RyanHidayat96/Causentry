package androidx.compose.ui.autofill;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000e"}, d2 = {"Landroidx/compose/ui/autofill/AutofillSemanticCallback;", "Landroid/view/autofill/AutofillManager$AutofillCallback;", "<init>", "()V", "Landroid/view/View;", "p0", "", "p1", "p2", "", "onAutofillEvent", "(Landroid/view/View;II)V", "Landroidx/compose/ui/autofill/AndroidAutofillManager;", "register", "(Landroidx/compose/ui/autofill/AndroidAutofillManager;)V", "unregister"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AutofillSemanticCallback extends android.view.autofill.AutofillManager.AutofillCallback {
    public static final AutofillSemanticCallback INSTANCE = new AutofillSemanticCallback();
    public static final int $stable = 8;

    private AutofillSemanticCallback() {
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public final void onAutofillEvent(View p0, int p1, int p2) {
        super.onAutofillEvent(p0, p1, p2);
    }

    public final void register(AndroidAutofillManager p0) {
        PlatformAutofillManager platformAutofillManager = p0.getPlatformAutofillManager();
        Intrinsics.checkNotNull(platformAutofillManager, "");
        ((PlatformAutofillManagerImpl) platformAutofillManager).getPlatformAndroidManager().registerCallback(this);
    }

    public final void unregister(AndroidAutofillManager p0) {
        PlatformAutofillManager platformAutofillManager = p0.getPlatformAutofillManager();
        Intrinsics.checkNotNull(platformAutofillManager, "");
        ((PlatformAutofillManagerImpl) platformAutofillManager).getPlatformAndroidManager().unregisterCallback(this);
    }
}
