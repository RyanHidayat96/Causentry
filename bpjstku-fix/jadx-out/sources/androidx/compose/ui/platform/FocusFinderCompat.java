package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMapKt;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.TwoDimensionalFocusSearchKt;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 .2\u00020\u0001:\u0002./B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ+\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000eJM\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\b2\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0013j\b\u0012\u0004\u0012\u00020\u0006`\u0014H\u0002¢\u0006\u0004\b\n\u0010\u0016JC\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0013j\b\u0012\u0004\u0012\u00020\u0006`\u00142\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001bJK\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\f2\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0013j\b\u0012\u0004\u0012\u00020\u0006`\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ;\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0013j\b\u0012\u0004\u0012\u00020\u0006`\u00142\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010 J;\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0013j\b\u0012\u0004\u0012\u00020\u0006`\u00142\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010 J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010*\u001a\u00020)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0013j\b\u0012\u0004\u0012\u00020\u0006`\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-"}, d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "p0", "Landroid/view/View;", "p1", "", "p2", "findNextFocus", "(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;", "Landroid/graphics/Rect;", "findNextFocusFromRect", "(Landroid/view/ViewGroup;Landroid/graphics/Rect;I)Landroid/view/View;", "getEffectiveRoot", "(Landroid/view/ViewGroup;Landroid/view/View;)Landroid/view/ViewGroup;", "findNextUserSpecifiedFocus", "p3", "Ljava/util/ArrayList;", "Lkotlin/collections/b;", "p4", "(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;ILjava/util/ArrayList;)Landroid/view/View;", "findNextFocusInRelativeDirection", "(Ljava/util/ArrayList;Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;", "", "setFocusBottomRight", "(Landroid/view/ViewGroup;Landroid/graphics/Rect;)V", "setFocusTopLeft", "findNextFocusInAbsoluteDirection", "(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;Ljava/util/ArrayList;I)Landroid/view/View;", "getNextFocusable", "(Landroid/view/View;Ljava/util/ArrayList;I)Landroid/view/View;", "getPreviousFocusable", "", "isValidId", "(I)Z", "cachedFocusedRect", "Landroid/graphics/Rect;", "bestCandidateRect", "otherRect", "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;", "userSpecifiedFocusComparator", "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;", "tmpList", "Ljava/util/ArrayList;", "Companion", "UserSpecifiedFocusComparator"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FocusFinderCompat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final FocusFinderCompat$Companion$FocusFinderThreadLocal$1 FocusFinderThreadLocal = new ThreadLocal<FocusFinderCompat>() { // from class: androidx.compose.ui.platform.FocusFinderCompat$Companion$FocusFinderThreadLocal$1
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public final FocusFinderCompat initialValue() {
            return new FocusFinderCompat();
        }
    };
    private final Rect cachedFocusedRect = new Rect();
    private final Rect bestCandidateRect = new Rect();
    private final Rect otherRect = new Rect();
    private final UserSpecifiedFocusComparator userSpecifiedFocusComparator = new UserSpecifiedFocusComparator(new UserSpecifiedFocusComparator.NextFocusGetter() { // from class: androidx.compose.ui.platform.FocusFinderCompat$$ExternalSyntheticLambda0
        @Override // androidx.compose.ui.platform.FocusFinderCompat.UserSpecifiedFocusComparator.NextFocusGetter
        public final View get(View view, View view2) {
            return FocusFinderCompat.userSpecifiedFocusComparator$lambda$0(this.f$0, view, view2);
        }
    });
    private final ArrayList<View> tmpList = new ArrayList<>();

    private final boolean isValidId(int p0) {
        return (p0 == 0 || p0 == -1) ? false : true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1;", "FocusFinderThreadLocal", "Landroidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1;", "Landroidx/compose/ui/platform/FocusFinderCompat;", "getInstance", "()Landroidx/compose/ui/platform/FocusFinderCompat;", "instance"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final FocusFinderCompat getInstance() {
            FocusFinderCompat focusFinderCompat = FocusFinderCompat.FocusFinderThreadLocal.get();
            Intrinsics.checkNotNull(focusFinderCompat);
            return focusFinderCompat;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View userSpecifiedFocusComparator$lambda$0(FocusFinderCompat focusFinderCompat, View view, View view2) {
        if (focusFinderCompat.isValidId(view2.getNextFocusForwardId())) {
            return FocusFinderCompat_androidKt.findUserSetNextFocus(view2, view, 2);
        }
        return null;
    }

    public final View findNextFocus(ViewGroup p0, View p1, int p2) {
        ViewGroup effectiveRoot = getEffectiveRoot(p0, p1);
        View viewFindNextUserSpecifiedFocus = findNextUserSpecifiedFocus(effectiveRoot, p1, p2);
        if (viewFindNextUserSpecifiedFocus != null) {
            return viewFindNextUserSpecifiedFocus;
        }
        ArrayList<View> arrayList = this.tmpList;
        try {
            arrayList.clear();
            FocusFinderCompat_androidKt.addFocusableViews(effectiveRoot, (ArrayList<View>) arrayList, p2);
            if (!arrayList.isEmpty()) {
                viewFindNextUserSpecifiedFocus = findNextFocus(effectiveRoot, p1, null, p2, arrayList);
            }
            return viewFindNextUserSpecifiedFocus;
        } finally {
            arrayList.clear();
        }
    }

    public final View findNextFocusFromRect(ViewGroup p0, Rect p1, int p2) {
        this.cachedFocusedRect.set(p1);
        return findNextFocus(p0, this.cachedFocusedRect, p2);
    }

    private final ViewGroup getEffectiveRoot(ViewGroup p0, View p1) {
        if (p1 != null && p1 != p0) {
            ViewParent parent = p1.getParent();
            ViewGroup viewGroup = null;
            while (parent instanceof ViewGroup) {
                if (parent != p0) {
                    ViewGroup viewGroup2 = (ViewGroup) parent;
                    if (viewGroup2.getTouchscreenBlocksFocus() && p1.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                        viewGroup = viewGroup2;
                    }
                    parent = viewGroup2.getParent();
                } else if (viewGroup != null) {
                    return viewGroup;
                }
            }
        }
        return p0;
    }

    private final View findNextUserSpecifiedFocus(ViewGroup p0, View p1, int p2) {
        ViewGroup viewGroup = p0;
        View viewFindUserSetNextFocus = FocusFinderCompat_androidKt.findUserSetNextFocus(p1, viewGroup, p2);
        boolean z = true;
        View viewFindUserSetNextFocus2 = viewFindUserSetNextFocus;
        while (viewFindUserSetNextFocus != null) {
            if (viewFindUserSetNextFocus.isFocusable() && viewFindUserSetNextFocus.getVisibility() == 0 && (!viewFindUserSetNextFocus.isInTouchMode() || viewFindUserSetNextFocus.isFocusableInTouchMode())) {
                return viewFindUserSetNextFocus;
            }
            viewFindUserSetNextFocus = FocusFinderCompat_androidKt.findUserSetNextFocus(viewFindUserSetNextFocus, viewGroup, p2);
            if (!z) {
                viewFindUserSetNextFocus2 = viewFindUserSetNextFocus2 != null ? FocusFinderCompat_androidKt.findUserSetNextFocus(viewFindUserSetNextFocus2, viewGroup, p2) : null;
                if (viewFindUserSetNextFocus2 == viewFindUserSetNextFocus) {
                    break;
                }
            }
            z = !z;
        }
        return null;
    }

    private final View findNextFocus(ViewGroup p0, Rect p1, int p2) {
        ViewGroup effectiveRoot = getEffectiveRoot(p0, null);
        ArrayList<View> arrayList = this.tmpList;
        try {
            arrayList.clear();
            FocusFinderCompat_androidKt.addFocusableViews(effectiveRoot, (ArrayList<View>) arrayList, p2);
            if (arrayList.isEmpty()) {
                return null;
            }
            return findNextFocus(effectiveRoot, null, p1, p2, arrayList);
        } finally {
            arrayList.clear();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    private final View findNextFocus(ViewGroup p0, View p1, Rect p2, int p3, ArrayList<View> p4) {
        Rect rect = this.cachedFocusedRect;
        if (p1 != null) {
            p1.getFocusedRect(rect);
            p0.offsetDescendantRectToMyCoords(p1, rect);
        } else if (p2 != null) {
            rect.set(p2);
        } else if (p3 != 1) {
            if (p3 != 2) {
                if (p3 == 17 || p3 == 33) {
                    setFocusBottomRight(p0, rect);
                } else if (p3 == 66 || p3 == 130) {
                    setFocusTopLeft(p0, rect);
                }
            } else if (p0.getLayoutDirection() != 1) {
                setFocusTopLeft(p0, rect);
            } else {
                setFocusBottomRight(p0, rect);
            }
        } else if (p0.getLayoutDirection() == 1) {
            setFocusTopLeft(p0, rect);
        } else {
            setFocusBottomRight(p0, rect);
        }
        if (p3 == 1 || p3 == 2) {
            return findNextFocusInRelativeDirection(p4, p0, p1, p3);
        }
        if (p3 == 17 || p3 == 33 || p3 == 66 || p3 == 130) {
            return findNextFocusInAbsoluteDirection(p0, p1, rect, p4, p3);
        }
        throw new IllegalArgumentException("Unknown direction: ".concat(String.valueOf(p3)));
    }

    private final View findNextFocusInRelativeDirection(ArrayList<View> p0, ViewGroup p1, View p2, int p3) {
        try {
            this.userSpecifiedFocusComparator.setFocusables(p0, p1);
            Collections.sort(p0, this.userSpecifiedFocusComparator);
            this.userSpecifiedFocusComparator.recycle();
            int size = p0.size();
            View previousFocusable = null;
            if (size < 2) {
                return null;
            }
            if (p3 == 1) {
                previousFocusable = getPreviousFocusable(p2, p0, size);
            } else if (p3 == 2) {
                previousFocusable = getNextFocusable(p2, p0, size);
            } else if (p3 == 17 || p3 == 33 || p3 == 66 || p3 == 130) {
                previousFocusable = findNextFocusInAbsoluteDirection(p1, p2, this.cachedFocusedRect, p0, p3);
            }
            return previousFocusable == null ? p0.get(size - 1) : previousFocusable;
        } catch (Throwable th) {
            this.userSpecifiedFocusComparator.recycle();
            throw th;
        }
    }

    private final void setFocusBottomRight(ViewGroup p0, Rect p1) {
        int scrollY = p0.getScrollY() + p0.getHeight();
        int scrollX = p0.getScrollX() + p0.getWidth();
        p1.set(scrollX, scrollY, scrollX, scrollY);
    }

    private final void setFocusTopLeft(ViewGroup p0, Rect p1) {
        int scrollY = p0.getScrollY();
        int scrollX = p0.getScrollX();
        p1.set(scrollX, scrollY, scrollX, scrollY);
    }

    private final View findNextFocusInAbsoluteDirection(ViewGroup p0, View p1, Rect p2, ArrayList<View> p3, int p4) {
        this.bestCandidateRect.set(p2);
        if (p4 == 17) {
            this.bestCandidateRect.offset(p2.width() + 1, 0);
        } else if (p4 == 33) {
            this.bestCandidateRect.offset(0, p2.height() + 1);
        } else if (p4 == 66) {
            this.bestCandidateRect.offset((-p2.width()) - 1, 0);
        } else if (p4 == 130) {
            this.bestCandidateRect.offset(0, (-p2.height()) - 1);
        }
        ArrayList<View> arrayList = p3;
        int size = arrayList.size();
        View view = null;
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            if (!Intrinsics.areEqual(view2, p1) && !Intrinsics.areEqual(view2, p0)) {
                view2.getFocusedRect(this.otherRect);
                p0.offsetDescendantRectToMyCoords(view2, this.otherRect);
                androidx.compose.ui.geometry.Rect composeRect = RectHelper_androidKt.toComposeRect(this.otherRect);
                androidx.compose.ui.geometry.Rect composeRect2 = RectHelper_androidKt.toComposeRect(this.bestCandidateRect);
                androidx.compose.ui.geometry.Rect composeRect3 = RectHelper_androidKt.toComposeRect(p2);
                FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(p4);
                if (TwoDimensionalFocusSearchKt.m3922isBetterCandidateI7lrPNg(composeRect, composeRect2, composeRect3, focusDirection != null ? focusDirection.getValue() : FocusDirection.INSTANCE.m3861getNextdhqQ8s())) {
                    this.bestCandidateRect.set(this.otherRect);
                    view = view2;
                }
            }
        }
        return view;
    }

    private final View getNextFocusable(View p0, ArrayList<View> p1, int p2) {
        int iLastIndexOf;
        int i;
        if (p2 < 2) {
            return null;
        }
        if (p0 != null && (iLastIndexOf = p1.lastIndexOf(p0)) >= 0 && (i = iLastIndexOf + 1) < p2) {
            return p1.get(i);
        }
        return p1.get(0);
    }

    private final View getPreviousFocusable(View p0, ArrayList<View> p1, int p2) {
        int iIndexOf;
        if (p2 < 2) {
            return null;
        }
        if (p0 != null && (iIndexOf = p1.indexOf(p0)) > 0) {
            return p1.get(iIndexOf - 1);
        }
        return p1.get(p2 - 1);
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u0003:\u0001#B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000e\u001a\u00020\b2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000bj\b\u0012\u0004\u0012\u00020\u0002`\f2\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;", "Ljava/util/Comparator;", "Landroid/view/View;", "Lkotlin/cancelAll;", "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;", "p0", "<init>", "(Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;)V", "", "recycle", "()V", "Ljava/util/ArrayList;", "Lkotlin/collections/b;", "p1", "setFocusables", "(Ljava/util/ArrayList;Landroid/view/View;)V", "setHeadOfChain", "(Landroid/view/View;)V", "", "compare", "(Landroid/view/View;Landroid/view/View;)I", "mNextFocusGetter", "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;", "Landroidx/collection/MutableScatterMap;", "nextFoci", "Landroidx/collection/MutableScatterMap;", "Landroidx/collection/MutableScatterSet;", "isConnectedTo", "Landroidx/collection/MutableScatterSet;", "headsOfChains", "Landroidx/collection/MutableObjectIntMap;", "originalOrdinal", "Landroidx/collection/MutableObjectIntMap;", "root", "Landroid/view/View;", "NextFocusGetter"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class UserSpecifiedFocusComparator implements Comparator<View> {
        private final NextFocusGetter mNextFocusGetter;
        private View root;
        private final MutableScatterMap<View, View> nextFoci = ScatterMapKt.mutableScatterMapOf();
        private final MutableScatterSet<View> isConnectedTo = ScatterSetKt.mutableScatterSetOf();
        private final MutableScatterMap<View, View> headsOfChains = ScatterMapKt.mutableScatterMapOf();
        private final MutableObjectIntMap<View> originalOrdinal = ObjectIntMapKt.mutableObjectIntMapOf();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;", "", "Landroid/view/View;", "p0", "p1", "get", "(Landroid/view/View;Landroid/view/View;)Landroid/view/View;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface NextFocusGetter {
            View get(View p0, View p1);
        }

        public UserSpecifiedFocusComparator(NextFocusGetter nextFocusGetter) {
            this.mNextFocusGetter = nextFocusGetter;
        }

        public final void recycle() {
            this.root = null;
            this.headsOfChains.clear();
            this.isConnectedTo.clear();
            this.originalOrdinal.clear();
            this.nextFoci.clear();
        }

        public final void setFocusables(ArrayList<View> p0, View p1) {
            this.root = p1;
            ArrayList<View> arrayList = p0;
            ArrayList<View> arrayList2 = arrayList;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                this.originalOrdinal.set(arrayList.get(i), i);
            }
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i2 = size2 - 1;
                    View view = arrayList.get(size2);
                    View view2 = this.mNextFocusGetter.get(p1, view);
                    if (view2 != null && this.originalOrdinal.containsKey(view2)) {
                        this.nextFoci.set(view, view2);
                        this.isConnectedTo.add(view2);
                    }
                    if (i2 < 0) {
                        break;
                    } else {
                        size2 = i2;
                    }
                }
            }
            int size3 = arrayList2.size() - 1;
            if (size3 < 0) {
                return;
            }
            while (true) {
                int i3 = size3 - 1;
                View view3 = arrayList.get(size3);
                if (this.nextFoci.get(view3) != null && !this.isConnectedTo.contains(view3)) {
                    setHeadOfChain(view3);
                }
                if (i3 < 0) {
                    return;
                } else {
                    size3 = i3;
                }
            }
        }

        public final void setHeadOfChain(View p0) {
            View view = p0;
            while (p0 != null) {
                View view2 = this.headsOfChains.get(p0);
                if (view2 != null) {
                    if (view2 == view) {
                        return;
                    }
                    p0 = view;
                    view = view2;
                }
                this.headsOfChains.set(p0, view);
                p0 = this.nextFoci.get(p0);
            }
        }

        @Override // java.util.Comparator
        public final int compare(View p0, View p1) {
            if (p0 == p1) {
                return 0;
            }
            if (p0 == null) {
                return -1;
            }
            if (p1 == null) {
                return 1;
            }
            View view = this.headsOfChains.get(p0);
            View view2 = this.headsOfChains.get(p1);
            if (view == view2 && view != null) {
                if (p0 == view) {
                    return -1;
                }
                return (p1 == view || this.nextFoci.get(p0) == null) ? 1 : -1;
            }
            if (view != null) {
                p0 = view;
            }
            if (view2 != null) {
                p1 = view2;
            }
            if (view == null && view2 == null) {
                return 0;
            }
            return this.originalOrdinal.get(p0) < this.originalOrdinal.get(p1) ? -1 : 1;
        }
    }
}
