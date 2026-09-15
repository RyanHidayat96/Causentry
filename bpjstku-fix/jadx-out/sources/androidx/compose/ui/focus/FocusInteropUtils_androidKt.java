package androidx.compose.ui.focus;

import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0000*\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0015\u001a\u00020\u0014*\u00020\u000e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"", "p0", "Landroidx/compose/ui/focus/FocusDirection;", "toFocusDirection", "(I)Landroidx/compose/ui/focus/FocusDirection;", "toAndroidFocusDirection-3ESFkO8", "(I)Ljava/lang/Integer;", "toAndroidFocusDirection", "Landroidx/compose/ui/input/key/KeyEvent;", "toFocusDirection-ZmokQxo", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/FocusDirection;", "Landroidx/compose/ui/unit/LayoutDirection;", "toLayoutDirection", "(I)Landroidx/compose/ui/unit/LayoutDirection;", "Landroid/view/View;", "Landroidx/compose/ui/geometry/Rect;", "calculateBoundingRectRelativeTo", "(Landroid/view/View;Landroid/view/View;)Landroidx/compose/ui/geometry/Rect;", "Landroid/graphics/Rect;", "p1", "", "requestInteropFocus", "(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FocusInteropUtils_androidKt {
    public static final FocusDirection toFocusDirection(int i) {
        if (i == 1) {
            return FocusDirection.m3850boximpl(FocusDirection.INSTANCE.m3862getPreviousdhqQ8s());
        }
        if (i == 2) {
            return FocusDirection.m3850boximpl(FocusDirection.INSTANCE.m3861getNextdhqQ8s());
        }
        if (i == 17) {
            return FocusDirection.m3850boximpl(FocusDirection.INSTANCE.m3860getLeftdhqQ8s());
        }
        if (i == 33) {
            return FocusDirection.m3850boximpl(FocusDirection.INSTANCE.m3864getUpdhqQ8s());
        }
        if (i == 66) {
            return FocusDirection.m3850boximpl(FocusDirection.INSTANCE.m3863getRightdhqQ8s());
        }
        if (i != 130) {
            return null;
        }
        return FocusDirection.m3850boximpl(FocusDirection.INSTANCE.m3857getDowndhqQ8s());
    }

    /* JADX INFO: renamed from: toAndroidFocusDirection-3ESFkO8, reason: not valid java name */
    public static final Integer m3865toAndroidFocusDirection3ESFkO8(int i) {
        if (FocusDirection.m3853equalsimpl0(i, FocusDirection.INSTANCE.m3864getUpdhqQ8s())) {
            return 33;
        }
        if (FocusDirection.m3853equalsimpl0(i, FocusDirection.INSTANCE.m3857getDowndhqQ8s())) {
            return 130;
        }
        if (FocusDirection.m3853equalsimpl0(i, FocusDirection.INSTANCE.m3860getLeftdhqQ8s())) {
            return 17;
        }
        if (FocusDirection.m3853equalsimpl0(i, FocusDirection.INSTANCE.m3863getRightdhqQ8s())) {
            return 66;
        }
        if (FocusDirection.m3853equalsimpl0(i, FocusDirection.INSTANCE.m3861getNextdhqQ8s())) {
            return 2;
        }
        return FocusDirection.m3853equalsimpl0(i, FocusDirection.INSTANCE.m3862getPreviousdhqQ8s()) ? 1 : null;
    }

    /* JADX INFO: renamed from: toFocusDirection-ZmokQxo, reason: not valid java name */
    public static final FocusDirection m3866toFocusDirectionZmokQxo(KeyEvent keyEvent) {
        long jM5364getKeyZmokQxo = KeyEvent_androidKt.m5364getKeyZmokQxo(keyEvent);
        if (Key.m5056equalsimpl0(jM5364getKeyZmokQxo, Key.INSTANCE.m5216getNavigatePreviousEK5gGoQ())) {
            return FocusDirection.m3850boximpl(FocusDirection.INSTANCE.m3862getPreviousdhqQ8s());
        }
        if (Key.m5056equalsimpl0(jM5364getKeyZmokQxo, Key.INSTANCE.m5214getNavigateNextEK5gGoQ())) {
            return FocusDirection.m3850boximpl(FocusDirection.INSTANCE.m3861getNextdhqQ8s());
        }
        if (Key.m5056equalsimpl0(jM5364getKeyZmokQxo, Key.INSTANCE.m5292getTabEK5gGoQ())) {
            return FocusDirection.m3850boximpl(KeyEvent_androidKt.m5370isShiftPressedZmokQxo(keyEvent) ? FocusDirection.INSTANCE.m3862getPreviousdhqQ8s() : FocusDirection.INSTANCE.m3861getNextdhqQ8s());
        }
        if (Key.m5056equalsimpl0(jM5364getKeyZmokQxo, Key.INSTANCE.m5133getDirectionRightEK5gGoQ())) {
            return FocusDirection.m3850boximpl(FocusDirection.INSTANCE.m3863getRightdhqQ8s());
        }
        if (Key.m5056equalsimpl0(jM5364getKeyZmokQxo, Key.INSTANCE.m5132getDirectionLeftEK5gGoQ())) {
            return FocusDirection.m3850boximpl(FocusDirection.INSTANCE.m3860getLeftdhqQ8s());
        }
        if (Key.m5056equalsimpl0(jM5364getKeyZmokQxo, Key.INSTANCE.m5134getDirectionUpEK5gGoQ()) || Key.m5056equalsimpl0(jM5364getKeyZmokQxo, Key.INSTANCE.m5245getPageUpEK5gGoQ())) {
            return FocusDirection.m3850boximpl(FocusDirection.INSTANCE.m3864getUpdhqQ8s());
        }
        if (Key.m5056equalsimpl0(jM5364getKeyZmokQxo, Key.INSTANCE.m5129getDirectionDownEK5gGoQ()) || Key.m5056equalsimpl0(jM5364getKeyZmokQxo, Key.INSTANCE.m5244getPageDownEK5gGoQ())) {
            return FocusDirection.m3850boximpl(FocusDirection.INSTANCE.m3857getDowndhqQ8s());
        }
        if (Key.m5056equalsimpl0(jM5364getKeyZmokQxo, Key.INSTANCE.m5128getDirectionCenterEK5gGoQ()) || Key.m5056equalsimpl0(jM5364getKeyZmokQxo, Key.INSTANCE.m5142getEnterEK5gGoQ()) || Key.m5056equalsimpl0(jM5364getKeyZmokQxo, Key.INSTANCE.m5234getNumPadEnterEK5gGoQ())) {
            return FocusDirection.m3850boximpl(FocusDirection.INSTANCE.m3858getEnterdhqQ8s());
        }
        if (Key.m5056equalsimpl0(jM5364getKeyZmokQxo, Key.INSTANCE.m5071getBackEK5gGoQ()) || Key.m5056equalsimpl0(jM5364getKeyZmokQxo, Key.INSTANCE.m5145getEscapeEK5gGoQ())) {
            return FocusDirection.m3850boximpl(FocusDirection.INSTANCE.m3859getExitdhqQ8s());
        }
        return null;
    }

    public static final LayoutDirection toLayoutDirection(int i) {
        if (i == 0) {
            return LayoutDirection.Ltr;
        }
        if (i != 1) {
            return null;
        }
        return LayoutDirection.Rtl;
    }

    public static final Rect calculateBoundingRectRelativeTo(View view, View view2) {
        view.getLocationInWindow(FocusInteropUtils.INSTANCE.getTempCoordinates());
        int i = FocusInteropUtils.INSTANCE.getTempCoordinates()[0];
        int i2 = FocusInteropUtils.INSTANCE.getTempCoordinates()[1];
        view2.getLocationInWindow(FocusInteropUtils.INSTANCE.getTempCoordinates());
        float f = i - FocusInteropUtils.INSTANCE.getTempCoordinates()[0];
        float f2 = i2 - FocusInteropUtils.INSTANCE.getTempCoordinates()[1];
        return new Rect(f, f2, view.getWidth() + f, view.getHeight() + f2);
    }

    public static final boolean requestInteropFocus(View view, Integer num, android.graphics.Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return ((AndroidComposeView) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }
}
