package androidx.compose.ui.autofill;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/ui/autofill/AutofillApi27Helper;", "", "<init>", "()V", "Landroid/view/View;", "p0", "Landroid/view/autofill/AutofillManager;", "p1", "", "p2", "", "p3", "", "notifyViewVisibilityChanged", "(Landroid/view/View;Landroid/view/autofill/AutofillManager;IZ)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AutofillApi27Helper {
    public static final int $stable = 0;
    public static final AutofillApi27Helper INSTANCE = new AutofillApi27Helper();

    private AutofillApi27Helper() {
    }

    public final void notifyViewVisibilityChanged(View p0, android.view.autofill.AutofillManager p1, int p2, boolean p3) {
        p1.notifyViewVisibilityChanged(p0, p2, p3);
    }
}
