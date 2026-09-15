package androidx.view;

import android.view.View;
import android.view.Window;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bb\u0018\u00002\u00020\u0001J?\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0005H&¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/activity/EdgeToEdgeImpl;", "", "Landroidx/activity/SystemBarStyle;", "p0", "p1", "Landroid/view/Window;", "p2", "Landroid/view/View;", "p3", "", "p4", "p5", "", "setUp", "(Landroidx/activity/SystemBarStyle;Landroidx/activity/SystemBarStyle;Landroid/view/Window;Landroid/view/View;ZZ)V", "adjustLayoutInDisplayCutoutMode", "(Landroid/view/Window;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
interface EdgeToEdgeImpl {
    void adjustLayoutInDisplayCutoutMode(Window p0);

    void setUp(SystemBarStyle p0, SystemBarStyle p1, Window p2, View p3, boolean p4, boolean p5);
}
