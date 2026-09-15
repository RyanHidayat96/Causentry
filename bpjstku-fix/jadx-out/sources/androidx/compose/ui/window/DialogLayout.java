package androidx.compose.ui.window;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00162\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0017¢\u0006\u0002\b\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJX\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001f2\u0006\u0010\u0005\u001a\u00028\u000028\u0010\u0007\u001a4\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b!\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b!\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b!\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b!\u0012\u0004\u0012\u00028\u00000 H\u0082\b¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000bH\u0017¢\u0006\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R<\u00102\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0017¢\u0006\u0002\b\u00182\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00178C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b\u0019\u00101R\u0016\u00103\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0016\u00106\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u00104R$\u00107\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n8\u0015@RX\u0095\u000e¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b8\u00109"}, d2 = {"Landroidx/compose/ui/window/DialogLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/window/DialogWindowProvider;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "Landroid/content/Context;", "p0", "Landroid/view/Window;", "p1", "<init>", "(Landroid/content/Context;Landroid/view/Window;)V", "", "", "updateProperties", "(ZZ)V", "", "internalOnMeasure$ui_release", "(II)V", "p2", "p3", "p4", "internalOnLayout$ui_release", "(ZIIII)V", "Landroidx/compose/runtime/CompositionContext;", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "setContent", "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "Landroid/view/View;", "Landroidx/core/view/WindowInsetsCompat;", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function4;", "Lkotlin/ParameterName;", "insetValue", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Landroid/view/MotionEvent;", "isInsideContent", "(Landroid/view/MotionEvent;)Z", "Content", "(Landroidx/compose/runtime/Composer;I)V", "window", "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "content$delegate", "Landroidx/compose/runtime/MutableState;", "getContent", "()Lkotlin/jvm/functions/Function2;", "(Lkotlin/jvm/functions/Function2;)V", FirebaseAnalytics.Param.CONTENT, "usePlatformDefaultWidth", "Z", "decorFitsSystemWindows", "hasCalledSetLayout", "shouldCreateCompositionOnAttachedToWindow", "getShouldCreateCompositionOnAttachedToWindow", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DialogLayout extends AbstractComposeView implements DialogWindowProvider, OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: content$delegate, reason: from kotlin metadata */
    private final MutableState content;
    private boolean decorFitsSystemWindows;
    private boolean hasCalledSetLayout;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private boolean usePlatformDefaultWidth;
    private final Window window;

    @Override // androidx.compose.ui.window.DialogWindowProvider
    public final Window getWindow() {
        return this.window;
    }

    public DialogLayout(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.window = window;
        this.content = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$AndroidDialog_androidKt.INSTANCE.getLambda$210148896$ui_release(), null, 2, null);
        DialogLayout dialogLayout = this;
        ViewCompat.setOnApplyWindowInsetsListener(dialogLayout, this);
        ViewCompat.setWindowInsetsAnimationCallback(dialogLayout, new WindowInsetsAnimationCompat.Callback() { // from class: androidx.compose.ui.window.DialogLayout.1
            {
                super(1);
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public final WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat p0, WindowInsetsAnimationCompat.BoundsCompat p1) {
                DialogLayout dialogLayout2 = DialogLayout.this;
                if (!dialogLayout2.decorFitsSystemWindows) {
                    View childAt = dialogLayout2.getChildAt(0);
                    int iMax = Math.max(0, childAt.getLeft());
                    int iMax2 = Math.max(0, childAt.getTop());
                    int iMax3 = Math.max(0, dialogLayout2.getWidth() - childAt.getRight());
                    int iMax4 = Math.max(0, dialogLayout2.getHeight() - childAt.getBottom());
                    if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                        return p1.inset(Insets.of(iMax, iMax2, iMax3, iMax4));
                    }
                }
                return p1;
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public final WindowInsetsCompat onProgress(WindowInsetsCompat p0, List<WindowInsetsAnimationCompat> p1) {
                DialogLayout dialogLayout2 = DialogLayout.this;
                if (dialogLayout2.decorFitsSystemWindows) {
                    return p0;
                }
                View childAt = dialogLayout2.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, dialogLayout2.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, dialogLayout2.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? p0 : p0.inset(iMax, iMax2, iMax3, iMax4);
            }
        });
    }

    private final Function2<Composer, Integer, Unit> getContent() {
        return (Function2) this.content.getValue();
    }

    private final void setContent(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.content.setValue(function2);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void updateProperties(boolean p0, boolean p1) {
        boolean z = (this.hasCalledSetLayout && p0 == this.usePlatformDefaultWidth && p1 == this.decorFitsSystemWindows) ? false : true;
        this.usePlatformDefaultWidth = p0;
        this.decorFitsSystemWindows = p1;
        if (z) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            int i = p0 ? -2 : -1;
            if (i == ((ViewGroup.LayoutParams) attributes).width && this.hasCalledSetLayout) {
                return;
            }
            getWindow().setLayout(i, -2);
            this.hasCalledSetLayout = true;
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void internalOnMeasure$ui_release(int p0, int p1) {
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.internalOnMeasure$ui_release(p0, p1);
            return;
        }
        int size = View.MeasureSpec.getSize(p0);
        int size2 = View.MeasureSpec.getSize(p1);
        int mode = View.MeasureSpec.getMode(p1);
        int i = (mode != Integer.MIN_VALUE || this.usePlatformDefaultWidth || this.decorFitsSystemWindows || ((ViewGroup.LayoutParams) getWindow().getAttributes()).height != -2) ? size2 : size2 + 1;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i2 = size - paddingLeft;
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = i - paddingTop;
        int i4 = i3 >= 0 ? i3 : 0;
        int mode2 = View.MeasureSpec.getMode(p0);
        if (mode2 != 0) {
            p0 = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            p1 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        childAt.measure(p0, p1);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingLeft);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingLeft;
        }
        if (mode == Integer.MIN_VALUE) {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingTop);
        } else {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingTop : size2;
        }
        setMeasuredDimension(size, iMin);
        if (this.decorFitsSystemWindows || childAt.getMeasuredHeight() + paddingTop <= size2 || ((ViewGroup.LayoutParams) getWindow().getAttributes()).height != -2) {
            return;
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        if (this.usePlatformDefaultWidth) {
            return;
        }
        getWindow().setLayout(-1, -1);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void internalOnLayout$ui_release(boolean p0, int p1, int p2, int p3, int p4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft2 = getPaddingLeft() + ((((p3 - p1) - measuredWidth) - (paddingLeft + paddingRight)) / 2);
        int paddingTop2 = getPaddingTop() + ((((p4 - p2) - measuredHeight) - (paddingTop + paddingBottom)) / 2);
        childAt.layout(paddingLeft2, paddingTop2, measuredWidth + paddingLeft2, measuredHeight + paddingTop2);
    }

    public final void setContent(CompositionContext p0, Function2<? super Composer, ? super Integer, Unit> p1) {
        setParentCompositionContext(p0);
        setContent(p1);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        createComposition();
    }

    private final <T> T insetValue(T p0, Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> p1) {
        if (this.decorFitsSystemWindows) {
            return p0;
        }
        View childAt = getChildAt(0);
        int iMax = Math.max(0, childAt.getLeft());
        int iMax2 = Math.max(0, childAt.getTop());
        int iMax3 = Math.max(0, getWidth() - childAt.getRight());
        int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
        return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? p0 : p1.invoke(Integer.valueOf(iMax), Integer.valueOf(iMax2), Integer.valueOf(iMax3), Integer.valueOf(iMax4));
    }

    public final boolean isInsideContent(MotionEvent p0) {
        View childAt;
        int iRoundToInt;
        float x = p0.getX();
        if (!Float.isInfinite(x) && !Float.isNaN(x)) {
            float y = p0.getY();
            if (Float.isInfinite(y) || Float.isNaN(y) || (childAt = getChildAt(0)) == null) {
                return false;
            }
            int left = getLeft() + childAt.getLeft();
            int width = childAt.getWidth();
            int top = getTop() + childAt.getTop();
            int height = childAt.getHeight();
            int iRoundToInt2 = MathKt.roundToInt(p0.getX());
            if (left <= iRoundToInt2 && iRoundToInt2 <= width + left && top <= (iRoundToInt = MathKt.roundToInt(p0.getY())) && iRoundToInt <= height + top) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1735448596);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1735448596, i2, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:432)");
            }
            getContent().invoke(composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.DialogLayout.Content.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    DialogLayout.this.Content(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View p0, WindowInsetsCompat p1) {
        if (!this.decorFitsSystemWindows) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return p1.inset(iMax, iMax2, iMax3, iMax4);
            }
        }
        return p1;
    }
}
