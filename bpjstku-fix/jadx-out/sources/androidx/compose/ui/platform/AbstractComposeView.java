package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.node.Owner;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH'¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u0014J\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u0014J\u000f\u0010\u001c\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001c\u0010\u0014J\u001f\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u001f\u0010\u001eJ7\u0010#\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0004¢\u0006\u0004\b#\u0010$J7\u0010%\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0010¢\u0006\u0004\b%\u0010$J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020 H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020 H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b-\u0010.J!\u0010-\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010,2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010/J)\u0010-\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010,2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u00100J#\u0010-\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010,2\b\u0010\u0005\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b-\u00102J+\u0010-\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010,2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b-\u00103J+\u00104\u001a\u00020 2\b\u0010\u0003\u001a\u0004\u0018\u00010,2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u000101H\u0014¢\u0006\u0004\b4\u00105J3\u00104\u001a\u00020 2\b\u0010\u0003\u001a\u0004\u0018\u00010,2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u0001012\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b4\u00106J\u000f\u00107\u001a\u00020 H\u0016¢\u0006\u0004\b7\u0010)R\u001e\u00109\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u0001088\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010:R(\u0010<\u001a\u0004\u0018\u00010;2\b\u0010\u0003\u001a\u0004\u0018\u00010;8\u0002@CX\u0083\u000e¢\u0006\f\n\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bA\u0010BR(\u0010C\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\n8\u0002@CX\u0083\u000e¢\u0006\f\n\u0004\bC\u0010D\"\u0004\bE\u0010\rR$\u0010G\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bG\u0010H\u0012\u0004\bI\u0010\u0014R\u0014\u0010K\u001a\u00020 8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010)R0\u0010L\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020 8\u0007@GX\u0087\u000e¢\u0006\u0018\n\u0004\bL\u0010M\u0012\u0004\bP\u0010\u0014\u001a\u0004\bN\u0010)\"\u0004\bO\u0010+R\u0016\u0010Q\u001a\u00020 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bQ\u0010MR\u0018\u0010R\u001a\u00020 *\u00020\n8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010U\u001a\u00020 8G¢\u0006\u0006\u001a\u0004\bT\u0010)R\u0016\u0010V\u001a\u00020 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bV\u0010M"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "p0", "Landroid/util/AttributeSet;", "p1", "", "p2", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/compose/runtime/CompositionContext;", "", "setParentCompositionContext", "(Landroidx/compose/runtime/CompositionContext;)V", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "setViewCompositionStrategy", "(Landroidx/compose/ui/platform/ViewCompositionStrategy;)V", "Content", "(Landroidx/compose/runtime/Composer;I)V", "createComposition", "()V", "checkAddView", "cacheIfAlive", "(Landroidx/compose/runtime/CompositionContext;)Landroidx/compose/runtime/CompositionContext;", "resolveParentCompositionContext", "()Landroidx/compose/runtime/CompositionContext;", "ensureCompositionCreated", "disposeComposition", "onAttachedToWindow", "onMeasure", "(II)V", "internalOnMeasure$ui_release", "", "p3", "p4", "onLayout", "(ZIIII)V", "internalOnLayout$ui_release", "onRtlPropertiesChanged", "(I)V", "isTransitionGroup", "()Z", "setTransitionGroup", "(Z)V", "Landroid/view/View;", "addView", "(Landroid/view/View;)V", "(Landroid/view/View;I)V", "(Landroid/view/View;II)V", "Landroid/view/ViewGroup$LayoutParams;", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "addViewInLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z", "shouldDelayChildPressedState", "Ljava/lang/ref/WeakReference;", "cachedViewTreeCompositionContext", "Ljava/lang/ref/WeakReference;", "Landroid/os/IBinder;", "previousAttachedWindowToken", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "Landroidx/compose/runtime/Composition;", "composition", "Landroidx/compose/runtime/Composition;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "setParentContext", "Lkotlin/Function0;", "disposeViewCompositionStrategy", "Lkotlin/jvm/functions/Function0;", "getDisposeViewCompositionStrategy$annotations", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "showLayoutBounds", "Z", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "creatingComposition", "isAlive", "(Landroidx/compose/runtime/CompositionContext;)Z", "getHasComposition", "hasComposition", "isTransitionGroupSet"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AbstractComposeView extends ViewGroup {
    public static final int $stable = 8;
    private WeakReference<CompositionContext> cachedViewTreeCompositionContext;
    private Composition composition;
    private boolean creatingComposition;
    private Function0<Unit> disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;
    private CompositionContext parentContext;
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public abstract void Content(Composer composer, int i);

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        this.disposeViewCompositionStrategy = ViewCompositionStrategy.INSTANCE.getDefault().installFor(this);
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    private final void setParentContext(CompositionContext compositionContext) {
        if (this.parentContext != compositionContext) {
            this.parentContext = compositionContext;
            if (compositionContext != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            Composition composition = this.composition;
            if (composition != null) {
                composition.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    ensureCompositionCreated();
                }
            }
        }
    }

    public final void setParentCompositionContext(CompositionContext p0) {
        setParentContext(p0);
    }

    public final void setViewCompositionStrategy(ViewCompositionStrategy p0) {
        Function0<Unit> function0 = this.disposeViewCompositionStrategy;
        if (function0 != null) {
            function0.invoke();
        }
        this.disposeViewCompositionStrategy = p0.installFor(this);
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public final void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z);
        }
    }

    public final void createComposition() {
        if (this.parentContext == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
        }
        ensureCompositionCreated();
    }

    private final void checkAddView() {
        if (this.creatingComposition) {
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot add views to ");
        sb.append(getClass().getSimpleName());
        sb.append("; only Compose content is supported");
        throw new UnsupportedOperationException(sb.toString());
    }

    private final boolean isAlive(CompositionContext compositionContext) {
        return !(compositionContext instanceof Recomposer) || ((Recomposer) compositionContext).getCurrentState().TuitionPaymentFragmentspecialinlinedviewModeldefault1().compareTo(Recomposer.State.ShuttingDown) > 0;
    }

    private final CompositionContext cacheIfAlive(CompositionContext compositionContext) {
        CompositionContext compositionContext2 = isAlive(compositionContext) ? compositionContext : null;
        if (compositionContext2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(compositionContext2);
        }
        return compositionContext;
    }

    private final CompositionContext resolveParentCompositionContext() {
        CompositionContext compositionContext;
        CompositionContext compositionContext2 = this.parentContext;
        if (compositionContext2 != null) {
            return compositionContext2;
        }
        AbstractComposeView abstractComposeView = this;
        CompositionContext compositionContextFindViewTreeCompositionContext = WindowRecomposer_androidKt.findViewTreeCompositionContext(abstractComposeView);
        CompositionContext compositionContext3 = null;
        CompositionContext compositionContextCacheIfAlive = compositionContextFindViewTreeCompositionContext != null ? cacheIfAlive(compositionContextFindViewTreeCompositionContext) : null;
        if (compositionContextCacheIfAlive != null) {
            return compositionContextCacheIfAlive;
        }
        WeakReference<CompositionContext> weakReference = this.cachedViewTreeCompositionContext;
        if (weakReference != null && (compositionContext = weakReference.get()) != null && isAlive(compositionContext)) {
            compositionContext3 = compositionContext;
        }
        return compositionContext3 == null ? cacheIfAlive(WindowRecomposer_androidKt.getWindowRecomposer(abstractComposeView)) : compositionContext3;
    }

    private final void ensureCompositionCreated() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = Wrapper_androidKt.setContent(this, resolveParentCompositionContext(), ComposableLambdaKt.composableLambdaInstance(-656146368, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-656146368, i, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:249)");
                        }
                        AbstractComposeView.this.Content(composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    {
                        super(2);
                    }
                }));
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    public final void disposeComposition() {
        Composition composition = this.composition;
        if (composition != null) {
            composition.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            ensureCompositionCreated();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int p0, int p1) {
        ensureCompositionCreated();
        internalOnMeasure$ui_release(p0, p1);
    }

    public void internalOnMeasure$ui_release(int p0, int p1) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(p0, p1);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(p0) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(p0)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(p1) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(p1)));
        int measuredWidth = childAt.getMeasuredWidth();
        int paddingLeft = getPaddingLeft();
        setMeasuredDimension(measuredWidth + paddingLeft + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
        internalOnLayout$ui_release(p0, p1, p2, p3, p4);
    }

    public void internalOnLayout$ui_release(boolean p0, int p1, int p2, int p3, int p4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (p3 - p1) - getPaddingRight(), (p4 - p2) - getPaddingBottom());
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int p0) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(p0);
        }
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean p0) {
        super.setTransitionGroup(p0);
        this.isTransitionGroupSet = true;
    }

    @Override // android.view.ViewGroup
    public void addView(View p0) {
        checkAddView();
        super.addView(p0);
    }

    @Override // android.view.ViewGroup
    public void addView(View p0, int p1) {
        checkAddView();
        super.addView(p0, p1);
    }

    @Override // android.view.ViewGroup
    public void addView(View p0, int p1, int p2) {
        checkAddView();
        super.addView(p0, p1, p2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View p0, ViewGroup.LayoutParams p1) {
        checkAddView();
        super.addView(p0, p1);
    }

    @Override // android.view.ViewGroup
    public void addView(View p0, int p1, ViewGroup.LayoutParams p2) {
        checkAddView();
        super.addView(p0, p1, p2);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View p0, int p1, ViewGroup.LayoutParams p2) {
        checkAddView();
        return super.addViewInLayout(p0, p1, p2);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View p0, int p1, ViewGroup.LayoutParams p2, boolean p3) {
        checkAddView();
        return super.addViewInLayout(p0, p1, p2, p3);
    }

    public AbstractComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }
}
