package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillValue;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J'\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\rR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/ui/autofill/PlatformAutofillManagerImpl;", "Landroidx/compose/ui/autofill/PlatformAutofillManager;", "Landroid/view/autofill/AutofillManager;", "p0", "<init>", "(Landroid/view/autofill/AutofillManager;)V", "Landroid/view/View;", "", "p1", "Landroid/graphics/Rect;", "p2", "", "notifyViewEntered", "(Landroid/view/View;ILandroid/graphics/Rect;)V", "notifyViewExited", "(Landroid/view/View;I)V", "Landroid/view/autofill/AutofillValue;", "notifyValueChanged", "(Landroid/view/View;ILandroid/view/autofill/AutofillValue;)V", "", "notifyViewVisibilityChanged", "(Landroid/view/View;IZ)V", "commit", "()V", "cancel", "requestAutofill", "platformAndroidManager", "Landroid/view/autofill/AutofillManager;", "getPlatformAndroidManager", "()Landroid/view/autofill/AutofillManager;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlatformAutofillManagerImpl implements PlatformAutofillManager {
    public static final int $stable = 8;
    private final android.view.autofill.AutofillManager platformAndroidManager;

    public PlatformAutofillManagerImpl(android.view.autofill.AutofillManager autofillManager) {
        this.platformAndroidManager = autofillManager;
    }

    public final android.view.autofill.AutofillManager getPlatformAndroidManager() {
        return this.platformAndroidManager;
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public final void notifyViewEntered(View p0, int p1, Rect p2) {
        this.platformAndroidManager.notifyViewEntered(p0, p1, p2);
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public final void notifyViewExited(View p0, int p1) {
        this.platformAndroidManager.notifyViewExited(p0, p1);
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public final void notifyValueChanged(View p0, int p1, AutofillValue p2) {
        this.platformAndroidManager.notifyValueChanged(p0, p1, p2);
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public final void notifyViewVisibilityChanged(View p0, int p1, boolean p2) {
        if (Build.VERSION.SDK_INT >= 27) {
            AutofillApi27Helper.INSTANCE.notifyViewVisibilityChanged(p0, this.platformAndroidManager, p1, p2);
        }
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public final void commit() {
        this.platformAndroidManager.commit();
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public final void cancel() {
        this.platformAndroidManager.cancel();
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public final void requestAutofill(View p0, int p1, Rect p2) {
        this.platformAndroidManager.requestAutofill(p0, p1, p2);
    }
}
