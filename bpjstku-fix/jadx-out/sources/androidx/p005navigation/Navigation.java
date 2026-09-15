package androidx.p005navigation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.core.app.ActivityCompat;
import defpackage.ViewPortBuilder;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\t\u0010\fJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0010\u0010\u0013J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\fJ\u0019\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\f"}, d2 = {"Landroidx/navigation/Navigation;", "", "<init>", "()V", "Landroid/app/Activity;", "p0", "", "p1", "Landroidx/navigation/NavController;", "findNavController", "(Landroid/app/Activity;I)Landroidx/navigation/NavController;", "Landroid/view/View;", "(Landroid/view/View;)Landroidx/navigation/NavController;", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "Landroid/view/View$OnClickListener;", "createNavigateOnClickListener", "(ILandroid/os/Bundle;)Landroid/view/View$OnClickListener;", "Landroidx/navigation/NavDirections;", "(Landroidx/navigation/NavDirections;)Landroid/view/View$OnClickListener;", "", "setViewNavController", "(Landroid/view/View;Landroidx/navigation/NavController;)V", "findViewNavController", "getViewNavController"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Navigation {
    public static final Navigation INSTANCE = new Navigation();

    private Navigation() {
    }

    @JvmStatic
    public static final NavController findNavController(Activity p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        View viewRequireViewById = ActivityCompat.requireViewById(p0, p1);
        Intrinsics.checkNotNullExpressionValue(viewRequireViewById, "");
        NavController navControllerFindViewNavController = INSTANCE.findViewNavController(viewRequireViewById);
        if (navControllerFindViewNavController != null) {
            return navControllerFindViewNavController;
        }
        StringBuilder sb = new StringBuilder("Activity ");
        sb.append(p0);
        sb.append(" does not have a NavController set on ");
        sb.append(p1);
        throw new IllegalStateException(sb.toString());
    }

    @JvmStatic
    public static final NavController findNavController(View p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        NavController navControllerFindViewNavController = INSTANCE.findViewNavController(p0);
        if (navControllerFindViewNavController != null) {
            return navControllerFindViewNavController;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(p0);
        sb.append(" does not have a NavController set");
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ View.OnClickListener createNavigateOnClickListener$default(int i, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        return createNavigateOnClickListener(i, bundle);
    }

    @JvmStatic
    public static final View.OnClickListener createNavigateOnClickListener(final int p0, final Bundle p1) {
        return new View.OnClickListener() { // from class: androidx.navigation.Navigation$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Navigation.m7294x54c2312e(p0, p1, view);
            }
        };
    }

    private static final void createNavigateOnClickListener$lambda$0(int i, Bundle bundle, View view) {
        Intrinsics.checkNotNull(view);
        findNavController(view).navigate(i, bundle);
    }

    @JvmStatic
    public static final View.OnClickListener createNavigateOnClickListener(final NavDirections p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new View.OnClickListener() { // from class: androidx.navigation.Navigation$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Navigation.m7295xe87b8eb4(p0, view);
            }
        };
    }

    private static final void createNavigateOnClickListener$lambda$1(NavDirections navDirections, View view) {
        Intrinsics.checkNotNull(view);
        findNavController(view).navigate(navDirections);
    }

    @JvmStatic
    public static final void setViewNavController(View p0, NavController p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.setTag(R.id.nav_controller_view_tag, p1);
    }

    private final NavController findViewNavController(View p0) {
        return (NavController) SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.generateSequence(p0, (Function1<? super View, ? extends View>) new Function1() { // from class: androidx.navigation.Navigation$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Navigation.findViewNavController$lambda$2((View) obj);
            }
        }), new Function1() { // from class: androidx.navigation.Navigation$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Navigation.findViewNavController$lambda$3((View) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View findViewNavController$lambda$2(View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavController findViewNavController$lambda$3(View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return INSTANCE.getViewNavController(view);
    }

    private final NavController getViewNavController(View p0) {
        Object tag = p0.getTag(R.id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (NavController) ((WeakReference) tag).get();
        }
        if (tag instanceof NavController) {
            return (NavController) tag;
        }
        return null;
    }

    @JvmStatic
    public static final View.OnClickListener createNavigateOnClickListener(int i) {
        return createNavigateOnClickListener$default(i, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$createNavigateOnClickListener$-ILandroid-os-Bundle--Landroid-view-View$OnClickListener-, reason: not valid java name */
    public static /* synthetic */ void m7294x54c2312e(int i, Bundle bundle, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            createNavigateOnClickListener$lambda$0(i, bundle, view);
        } finally {
            ViewPortBuilder.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$createNavigateOnClickListener$-Landroidx-navigation-NavDirections--Landroid-view-View$OnClickListener-, reason: not valid java name */
    public static /* synthetic */ void m7295xe87b8eb4(NavDirections navDirections, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            createNavigateOnClickListener$lambda$1(navDirections, view);
        } finally {
            ViewPortBuilder.b();
        }
    }
}
