package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001>B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u0010J\u0019\u0010!\u001a\u00028\u0000\"\n\b\u0000\u0010 *\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0014H\u0017¢\u0006\u0004\b#\u0010\u0016J\u000f\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010\u0010J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b)\u0010\u0010J\u001f\u0010*\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010+J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u001bH\u0001¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b5\u0010\u0010R\u0018\u00106\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\r088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\r088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010:"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "p1", "", "p2", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/fragment/app/FragmentManager;", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/FragmentManager;)V", "Landroid/view/View;", "", "addDisappearingFragmentView", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "Landroid/view/WindowInsets;", "dispatchApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "Landroid/graphics/Canvas;", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "", "", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "endViewTransition", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", "onApplyWindowInsets", "removeAllViewsInLayout", "()V", "removeView", "removeViewAt", "(I)V", "removeViewInLayout", "removeViews", "(II)V", "removeViewsInLayout", "setDrawDisappearingViewsLast", "(Z)V", "Landroid/animation/LayoutTransition;", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "startViewTransition", "applyWindowInsetsListener", "Landroid/view/View$OnApplyWindowInsetsListener;", "", "disappearingFragmentChildren", "Ljava/util/List;", "drawDisappearingViewsFirst", "Z", "transitioningFragmentViews", "Api20Impl"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FragmentContainerView extends FrameLayout {
    private View.OnApplyWindowInsetsListener applyWindowInsetsListener;
    private final List<View> disappearingFragmentChildren;
    private boolean drawDisappearingViewsFirst;
    private final List<View> transitioningFragmentViews;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        String str;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = R.styleable.FragmentContainerView;
            Intrinsics.checkNotNullExpressionValue(iArr, "");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute != null) {
                str = "class";
            } else {
                classAttribute = typedArrayObtainStyledAttributes.getString(R.styleable.FragmentContainerView_android_name);
                str = "android:name";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            StringBuilder sb = new StringBuilder("FragmentContainerView must be within a FragmentActivity to use ");
            sb.append(str);
            sb.append("=\"");
            sb.append(classAttribute);
            sb.append(Typography.quote);
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = R.styleable.FragmentContainerView;
        Intrinsics.checkNotNullExpressionValue(iArr, "");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(R.styleable.FragmentContainerView_android_name) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.FragmentContainerView_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment fragmentFindFragmentById = fragmentManager.findFragmentById(id2);
        if (classAttribute != null && fragmentFindFragmentById == null) {
            if (id2 == -1) {
                String strConcat = string != null ? " with tag ".concat(String.valueOf(string)) : "";
                StringBuilder sb = new StringBuilder("FragmentContainerView must have an android:id to add Fragment ");
                sb.append(classAttribute);
                sb.append(strConcat);
                throw new IllegalStateException(sb.toString());
            }
            Fragment fragmentInstantiate = fragmentManager.getFragmentFactory().instantiate(context.getClassLoader(), classAttribute);
            Intrinsics.checkNotNullExpressionValue(fragmentInstantiate, "");
            fragmentInstantiate.mFragmentId = id2;
            fragmentInstantiate.mContainerId = id2;
            fragmentInstantiate.mTag = string;
            fragmentInstantiate.mFragmentManager = fragmentManager;
            fragmentInstantiate.mHost = fragmentManager.getHost();
            fragmentInstantiate.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.beginTransaction().setReorderingAllowed(true).add(this, fragmentInstantiate, string).commitNowAllowingStateLoss();
        }
        fragmentManager.onContainerAvailable(this);
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition p0) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.applyWindowInsetsListener = p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets p0) {
        WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets;
        Intrinsics.checkNotNullParameter(p0, "");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(p0);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "");
        if (this.applyWindowInsetsListener != null) {
            Api20Impl api20Impl = Api20Impl.INSTANCE;
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.applyWindowInsetsListener;
            Intrinsics.checkNotNull(onApplyWindowInsetsListener);
            windowInsetsCompatOnApplyWindowInsets = WindowInsetsCompat.toWindowInsetsCompat(api20Impl.onApplyWindowInsets(onApplyWindowInsetsListener, this, p0));
        } else {
            windowInsetsCompatOnApplyWindowInsets = ViewCompat.onApplyWindowInsets(this, windowInsetsCompat);
        }
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatOnApplyWindowInsets, "");
        if (!windowInsetsCompatOnApplyWindowInsets.isConsumed()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewCompat.dispatchApplyWindowInsets(getChildAt(i), windowInsetsCompatOnApplyWindowInsets);
            }
        }
        return p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.drawDisappearingViewsFirst) {
            Iterator<T> it = this.disappearingFragmentChildren.iterator();
            while (it.hasNext()) {
                super.drawChild(p0, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(p0);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas p0, View p1, long p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (this.drawDisappearingViewsFirst && !this.disappearingFragmentChildren.isEmpty() && this.disappearingFragmentChildren.contains(p1)) {
            return false;
        }
        return super.drawChild(p0, p1, p2);
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0.getParent() == this) {
            this.transitioningFragmentViews.add(p0);
        }
        super.startViewTransition(p0);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.transitioningFragmentViews.remove(p0);
        if (this.disappearingFragmentChildren.remove(p0)) {
            this.drawDisappearingViewsFirst = true;
        }
        super.endViewTransition(p0);
    }

    public final void setDrawDisappearingViewsLast(boolean p0) {
        this.drawDisappearingViewsFirst = p0;
    }

    @Override // android.view.ViewGroup
    public final void addView(View p0, int p1, ViewGroup.LayoutParams p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (FragmentManager.getViewFragment(p0) == null) {
            StringBuilder sb = new StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
            sb.append(p0);
            sb.append(" is not associated with a Fragment.");
            throw new IllegalStateException(sb.toString().toString());
        }
        super.addView(p0, p1, p2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int p0) {
        View childAt = getChildAt(p0);
        Intrinsics.checkNotNullExpressionValue(childAt, "");
        addDisappearingFragmentView(childAt);
        super.removeViewAt(p0);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        addDisappearingFragmentView(p0);
        super.removeViewInLayout(p0);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        addDisappearingFragmentView(p0);
        super.removeView(p0);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int p0, int p1) {
        for (int i = p0; i < p0 + p1; i++) {
            View childAt = getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "");
            addDisappearingFragmentView(childAt);
        }
        super.removeViews(p0, p1);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int p0, int p1) {
        for (int i = p0; i < p0 + p1; i++) {
            View childAt = getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "");
            addDisappearingFragmentView(childAt);
        }
        super.removeViewsInLayout(p0, p1);
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            Intrinsics.checkNotNullExpressionValue(childAt, "");
            addDisappearingFragmentView(childAt);
        }
        super.removeAllViewsInLayout();
    }

    private final void addDisappearingFragmentView(View p0) {
        if (this.transitioningFragmentViews.contains(p0)) {
            this.disappearingFragmentChildren.add(p0);
        }
    }

    public final <F extends Fragment> F getFragment() {
        return (F) FragmentManager.findFragmentManager(this).findFragmentById(getId());
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/fragment/app/FragmentContainerView$Api20Impl;", "", "<init>", "()V", "Landroid/view/View$OnApplyWindowInsetsListener;", "p0", "Landroid/view/View;", "p1", "Landroid/view/WindowInsets;", "p2", "onApplyWindowInsets", "(Landroid/view/View$OnApplyWindowInsetsListener;Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api20Impl {
        public static final Api20Impl INSTANCE = new Api20Impl();

        private Api20Impl() {
        }

        public final WindowInsets onApplyWindowInsets(View.OnApplyWindowInsetsListener p0, View p1, WindowInsets p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            WindowInsets windowInsetsOnApplyWindowInsets = p0.onApplyWindowInsets(p1, p2);
            Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "");
            return windowInsetsOnApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return p0;
    }
}
