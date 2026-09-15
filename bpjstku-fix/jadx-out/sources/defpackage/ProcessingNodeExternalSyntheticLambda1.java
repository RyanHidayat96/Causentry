package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ProcessingNodeExternalSyntheticLambda1 {
    private static final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Handler>() { // from class: com.google.accompanist.drawablepainter.DrawablePainterKt$MAIN_HANDLER$2
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    public static final Painter b(Drawable drawable, Composer composer) {
        processInMemoryCapture processinmemorycapture;
        composer.startReplaceableGroup(1756822313);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1756822313, 0, -1, "com.google.accompanist.drawablepainter.rememberDrawablePainter (DrawablePainter.kt:151)");
        }
        composer.startReplaceableGroup(-1791785024);
        boolean zChanged = composer.changed(drawable);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            if (drawable == null) {
                objRememberedValue = ProcessingNodeExternalSyntheticLambda4.INSTANCE;
            } else {
                if (drawable instanceof ColorDrawable) {
                    processinmemorycapture = new ColorPainter(ColorKt.Color(((ColorDrawable) drawable).getColor()), null);
                } else {
                    Drawable drawableMutate = drawable.mutate();
                    Intrinsics.checkNotNullExpressionValue(drawableMutate, "");
                    processinmemorycapture = new processInMemoryCapture(drawableMutate);
                }
                objRememberedValue = processinmemorycapture;
            }
            composer.updateRememberedValue(objRememberedValue);
        }
        Painter painter = (Painter) objRememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return painter;
    }

    public static final /* synthetic */ long TuitionPaymentFragmentspecialinlinedviewModeldefault3(Drawable drawable) {
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            return SizeKt.Size(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        return Size.INSTANCE.m4051getUnspecifiedNHjbRc();
    }

    public static final /* synthetic */ Handler TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return (Handler) TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
    }
}
