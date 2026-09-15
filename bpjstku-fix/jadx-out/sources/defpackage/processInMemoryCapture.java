package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.accompanist.drawablepainter.DrawablePainter$callback$2;
import defpackage.ProcessingNodeExternalSyntheticLambda1;
import defpackage.processInMemoryCapture;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0013\u0010\u0017\u001a\u00020\u0011*\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0015\u0010\u001c\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010 \u001a\u00020\u001d8C@CX\u0083\u008c\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001a\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010!\u001a\u00020#8C@CX\u0083\u008c\u0002ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0017\u0010\u001e\u001a\u00020#8WX\u0096\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"LprocessInMemoryCapture;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/runtime/RememberObserver;", "Landroid/graphics/drawable/Drawable;", "p0", "<init>", "(Landroid/graphics/drawable/Drawable;)V", "", "", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "Landroidx/compose/ui/unit/LayoutDirection;", "applyLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)Z", "", "onAbandoned", "()V", "onForgotten", "onRemembered", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Landroid/graphics/drawable/Drawable$Callback;", "b", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Landroidx/compose/runtime/MutableState;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Landroid/graphics/drawable/Drawable;", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class processInMemoryCapture extends Painter implements RememberObserver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final MutableState TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final MutableState TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final Drawable b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public processInMemoryCapture(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "");
        this.b = drawable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m4031boximpl(ProcessingNodeExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(drawable)), null, 2, null);
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<DrawablePainter$callback$2.AnonymousClass2>() { // from class: com.google.accompanist.drawablepainter.DrawablePainter$callback$2
            /* JADX WARN: Type inference failed for: r0v0, types: [com.google.accompanist.drawablepainter.DrawablePainter$callback$2$2] */
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
            public final AnonymousClass2 invoke() {
                final processInMemoryCapture processinmemorycapture = this.this$0;
                return new Drawable.Callback() { // from class: com.google.accompanist.drawablepainter.DrawablePainter$callback$2.2
                    @Override // android.graphics.drawable.Drawable.Callback
                    public final void invalidateDrawable(Drawable drawable2) {
                        Intrinsics.checkNotNullParameter(drawable2, "");
                        processInMemoryCapture processinmemorycapture2 = processinmemorycapture;
                        processinmemorycapture2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Integer.valueOf(((Number) processinmemorycapture2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).intValue() + 1));
                        processInMemoryCapture processinmemorycapture3 = processinmemorycapture;
                        processinmemorycapture3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setValue(Size.m4031boximpl(ProcessingNodeExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(processinmemorycapture3.b)));
                    }

                    @Override // android.graphics.drawable.Drawable.Callback
                    public final void scheduleDrawable(Drawable drawable2, Runnable runnable, long j) {
                        Intrinsics.checkNotNullParameter(drawable2, "");
                        Intrinsics.checkNotNullParameter(runnable, "");
                        ProcessingNodeExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3().postAtTime(runnable, j);
                    }

                    @Override // android.graphics.drawable.Drawable.Callback
                    public final void unscheduleDrawable(Drawable drawable2, Runnable runnable) {
                        Intrinsics.checkNotNullParameter(drawable2, "");
                        Intrinsics.checkNotNullParameter(runnable, "");
                        ProcessingNodeExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3().removeCallbacks(runnable);
                    }
                };
            }

            {
                super(0);
            }
        });
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        this.b.setCallback((Drawable.Callback) this.TuitionPaymentFragmentbindingInflater1.getValue());
        this.b.setVisible(true, true);
        Object obj = this.b;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        onForgotten();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        Object obj = this.b;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
        this.b.setVisible(false, false);
        this.b.setCallback(null);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float p0) {
        this.b.setAlpha(RangesKt.coerceIn(MathKt.roundToInt(p0 * 255.0f), 0, 255));
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter p0) {
        this.b.setColorFilter(p0 != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(p0) : null);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyLayoutDirection(LayoutDirection p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Drawable drawable = this.b;
        int i = WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return drawable.setLayoutDirection(i2);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "");
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        this.b.setBounds(0, 0, MathKt.roundToInt(Size.m4043getWidthimpl(drawScope.mo4798getSizeNHjbRc())), MathKt.roundToInt(Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc())));
        try {
            canvas.save();
            this.b.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        } finally {
            canvas.restore();
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public final long getIntrinsicSize() {
        return ((Size) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).m4048unboximpl();
    }
}
