package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillValue;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\ba\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH&¢\u0006\u0004\b\u0015\u0010\u0014J'\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0016\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/autofill/PlatformAutofillManager;", "", "Landroid/view/View;", "p0", "", "p1", "Landroid/graphics/Rect;", "p2", "", "notifyViewEntered", "(Landroid/view/View;ILandroid/graphics/Rect;)V", "notifyViewExited", "(Landroid/view/View;I)V", "Landroid/view/autofill/AutofillValue;", "notifyValueChanged", "(Landroid/view/View;ILandroid/view/autofill/AutofillValue;)V", "", "notifyViewVisibilityChanged", "(Landroid/view/View;IZ)V", "commit", "()V", "cancel", "requestAutofill"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PlatformAutofillManager {
    void cancel();

    void commit();

    void notifyValueChanged(View p0, int p1, AutofillValue p2);

    void notifyViewEntered(View p0, int p1, Rect p2);

    void notifyViewExited(View p0, int p1);

    void notifyViewVisibilityChanged(View p0, int p1, boolean p2);

    void requestAutofill(View p0, int p1, Rect p2);
}
