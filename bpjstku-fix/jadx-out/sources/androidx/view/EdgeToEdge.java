package androidx.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.ViewGroupKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\b\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\" \u0010\u000e\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000b\"\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/activity/SystemBarStyle;", "p0", "p1", "", "enable", "(Landroidx/activity/ComponentActivity;Landroidx/activity/SystemBarStyle;Landroidx/activity/SystemBarStyle;)V", "", "DefaultLightScrim", "I", "getDefaultLightScrim", "()I", "getDefaultLightScrim$annotations", "()V", "DefaultDarkScrim", "getDefaultDarkScrim", "getDefaultDarkScrim$annotations", "Landroidx/activity/EdgeToEdgeImpl;", "Impl", "Landroidx/activity/EdgeToEdgeImpl;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class EdgeToEdge {
    private static EdgeToEdgeImpl Impl;
    private static final int DefaultLightScrim = Color.argb(230, 255, 255, 255);
    private static final int DefaultDarkScrim = Color.argb(128, 27, 27, 27);

    public static /* synthetic */ void getDefaultDarkScrim$annotations() {
    }

    public static /* synthetic */ void getDefaultLightScrim$annotations() {
    }

    public static final int getDefaultLightScrim() {
        return DefaultLightScrim;
    }

    public static final int getDefaultDarkScrim() {
        return DefaultDarkScrim;
    }

    public static /* synthetic */ void enable$default(ComponentActivity componentActivity, SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            systemBarStyle = SystemBarStyle.Companion.auto$default(SystemBarStyle.INSTANCE, 0, 0, null, 4, null);
        }
        if ((i & 2) != 0) {
            systemBarStyle2 = SystemBarStyle.Companion.auto$default(SystemBarStyle.INSTANCE, DefaultLightScrim, DefaultDarkScrim, null, 4, null);
        }
        enable(componentActivity, systemBarStyle, systemBarStyle2);
    }

    public static final void enable(final ComponentActivity componentActivity, final SystemBarStyle systemBarStyle, final SystemBarStyle systemBarStyle2) {
        EdgeToEdgeApi23 edgeToEdgeApi23;
        Intrinsics.checkNotNullParameter(componentActivity, "");
        Intrinsics.checkNotNullParameter(systemBarStyle, "");
        Intrinsics.checkNotNullParameter(systemBarStyle2, "");
        final View decorView = componentActivity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "");
        EdgeToEdgeImpl edgeToEdgeImpl = Impl;
        if (edgeToEdgeImpl == null) {
            if (Build.VERSION.SDK_INT >= 35) {
                edgeToEdgeApi23 = new EdgeToEdgeApi35();
            } else if (Build.VERSION.SDK_INT >= 30) {
                edgeToEdgeApi23 = new EdgeToEdgeApi30();
            } else if (Build.VERSION.SDK_INT >= 29) {
                edgeToEdgeApi23 = new EdgeToEdgeApi29();
            } else if (Build.VERSION.SDK_INT >= 28) {
                edgeToEdgeApi23 = new EdgeToEdgeApi28();
            } else if (Build.VERSION.SDK_INT >= 26) {
                edgeToEdgeApi23 = new EdgeToEdgeApi26();
            } else {
                edgeToEdgeApi23 = new EdgeToEdgeApi23();
            }
            edgeToEdgeImpl = edgeToEdgeApi23;
            Impl = edgeToEdgeImpl;
        }
        final EdgeToEdgeImpl edgeToEdgeImpl2 = edgeToEdgeImpl;
        final Runnable runnable = new Runnable() { // from class: androidx.activity.EdgeToEdge$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                EdgeToEdge.enableEdgeToEdge$lambda$1(edgeToEdgeImpl2, systemBarStyle, systemBarStyle2, componentActivity, decorView);
            }
        };
        ViewGroup viewGroup = (ViewGroup) decorView;
        Iterator<View> it = ViewGroupKt.getChildren(viewGroup).iterator();
        while (it.hasNext()) {
            if (it.next().getTag() instanceof EdgeToEdgeImpl) {
                runnable.run();
                Window window = componentActivity.getWindow();
                Intrinsics.checkNotNullExpressionValue(window, "");
                edgeToEdgeImpl2.adjustLayoutInDisplayCutoutMode(window);
            }
        }
        final Context context = viewGroup.getContext();
        View view = new View(context) { // from class: androidx.activity.EdgeToEdge$enableEdgeToEdge$1$2
            @Override // android.view.View
            protected final void onConfigurationChanged(Configuration p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                runnable.run();
            }
        };
        view.setTag(edgeToEdgeImpl2);
        view.setVisibility(8);
        view.setWillNotDraw(true);
        viewGroup.addView(view);
        runnable.run();
        Window window2 = componentActivity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window2, "");
        edgeToEdgeImpl2.adjustLayoutInDisplayCutoutMode(window2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableEdgeToEdge$lambda$1(EdgeToEdgeImpl edgeToEdgeImpl, SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, ComponentActivity componentActivity, View view) {
        Window window = componentActivity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "");
        Function1<Resources, Boolean> detectDarkMode$activity = systemBarStyle.getDetectDarkMode$activity();
        Resources resources = view.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        boolean zBooleanValue = detectDarkMode$activity.invoke(resources).booleanValue();
        Function1<Resources, Boolean> detectDarkMode$activity2 = systemBarStyle2.getDetectDarkMode$activity();
        Resources resources2 = view.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        edgeToEdgeImpl.setUp(systemBarStyle, systemBarStyle2, window, view, zBooleanValue, detectDarkMode$activity2.invoke(resources2).booleanValue());
    }

    public static final void enable(ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        enable$default(componentActivity, null, null, 3, null);
    }

    public static final void enable(ComponentActivity componentActivity, SystemBarStyle systemBarStyle) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        Intrinsics.checkNotNullParameter(systemBarStyle, "");
        enable$default(componentActivity, systemBarStyle, null, 2, null);
    }
}
