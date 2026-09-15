package androidx.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.insets.ColorProtection;
import androidx.core.view.insets.Protection;
import androidx.core.view.insets.ProtectionLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/activity/EdgeToEdgeApi35;", "Landroidx/activity/EdgeToEdgeApi30;", "<init>", "()V", "Landroidx/activity/SystemBarStyle;", "p0", "p1", "Landroid/view/Window;", "p2", "Landroid/view/View;", "p3", "", "p4", "p5", "", "setUp", "(Landroidx/activity/SystemBarStyle;Landroidx/activity/SystemBarStyle;Landroid/view/Window;Landroid/view/View;ZZ)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class EdgeToEdgeApi35 extends EdgeToEdgeApi30 {
    @Override // androidx.view.EdgeToEdgeApi29, androidx.view.EdgeToEdgeApi26, androidx.view.EdgeToEdgeImpl
    public final void setUp(SystemBarStyle p0, SystemBarStyle p1, Window p2, View p3, boolean p4, boolean p5) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        WindowCompat.setDecorFitsSystemWindows(p2, false);
        p2.setStatusBarColor(0);
        p2.setNavigationBarColor(0);
        int scrimWithEnforcedContrast$activity = p0.getScrimWithEnforcedContrast$activity(p4);
        int scrimWithEnforcedContrast$activity2 = p1.getScrimWithEnforcedContrast$activity(p5);
        ViewGroup viewGroup = p3 instanceof ViewGroup ? (ViewGroup) p3 : null;
        if (viewGroup != null) {
            Iterator<View> it = ViewGroupKt.getChildren(viewGroup).iterator();
            while (true) {
                if (!it.hasNext()) {
                    if (scrimWithEnforcedContrast$activity != 0 || scrimWithEnforcedContrast$activity2 != 0) {
                        List listListOf = CollectionsKt.listOf((Object[]) new ColorProtection[]{new ColorProtection(2, scrimWithEnforcedContrast$activity), new ColorProtection(1, scrimWithEnforcedContrast$activity2), new ColorProtection(4, scrimWithEnforcedContrast$activity2), new ColorProtection(8, scrimWithEnforcedContrast$activity2)});
                        ProtectionLayout protectionLayout = new ProtectionLayout(((ViewGroup) p3).getContext(), (List<Protection>) listListOf);
                        protectionLayout.setTag(listListOf);
                        viewGroup.addView(protectionLayout);
                        break;
                    }
                    break;
                }
                Object tag = it.next().getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof ColorProtection)) {
                        for (Object obj : (Iterable) tag) {
                            if ((obj instanceof ColorProtection ? (ColorProtection) obj : null) != null) {
                                ColorProtection colorProtection = (ColorProtection) obj;
                                int side = colorProtection.getSide();
                                if (side == 1) {
                                    colorProtection.setColor(scrimWithEnforcedContrast$activity2);
                                } else if (side == 2) {
                                    colorProtection.setColor(scrimWithEnforcedContrast$activity);
                                } else if (side == 4) {
                                    colorProtection.setColor(scrimWithEnforcedContrast$activity2);
                                } else if (side == 8) {
                                    colorProtection.setColor(scrimWithEnforcedContrast$activity2);
                                }
                            }
                        }
                        break;
                    }
                }
            }
        }
        p2.setNavigationBarContrastEnforced(p1.getNightMode() == 0);
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(p2, p3);
        windowInsetsControllerCompat.setAppearanceLightStatusBars(!p4);
        windowInsetsControllerCompat.setAppearanceLightNavigationBars(!p5);
    }
}
