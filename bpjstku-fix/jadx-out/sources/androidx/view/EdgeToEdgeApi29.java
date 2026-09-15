package androidx.view;

import android.view.View;
import android.view.Window;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/activity/EdgeToEdgeApi29;", "Landroidx/activity/EdgeToEdgeApi28;", "<init>", "()V", "Landroidx/activity/SystemBarStyle;", "p0", "p1", "Landroid/view/Window;", "p2", "Landroid/view/View;", "p3", "", "p4", "p5", "", "setUp", "(Landroidx/activity/SystemBarStyle;Landroidx/activity/SystemBarStyle;Landroid/view/Window;Landroid/view/View;ZZ)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
class EdgeToEdgeApi29 extends EdgeToEdgeApi28 {
    @Override // androidx.view.EdgeToEdgeApi26, androidx.view.EdgeToEdgeImpl
    public void setUp(SystemBarStyle p0, SystemBarStyle p1, Window p2, View p3, boolean p4, boolean p5) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        WindowCompat.setDecorFitsSystemWindows(p2, false);
        p2.setStatusBarColor(p0.getScrimWithEnforcedContrast$activity(p4));
        p2.setNavigationBarColor(p1.getScrimWithEnforcedContrast$activity(p5));
        p2.setStatusBarContrastEnforced(false);
        p2.setNavigationBarContrastEnforced(p1.getNightMode() == 0);
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(p2, p3);
        windowInsetsControllerCompat.setAppearanceLightStatusBars(!p4);
        windowInsetsControllerCompat.setAppearanceLightNavigationBars(true ^ p5);
    }
}
