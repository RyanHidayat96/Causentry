package defpackage;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class getExitFadeDuration {
    public static final getExitFadeDuration TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new getExitFadeDuration();
    private static Function3<RowScope, Composer, Integer, Unit> TuitionPaymentFragmentbindingInflater1 = ComposableLambdaKt.composableLambdaInstance(-1817126193, false, TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1);

    static final class TuitionPaymentFragmentbindingInflater1 implements Function3<RowScope, Composer, Integer, Unit> {
        public static final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1();

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((iIntValue & 17) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1817126193, iIntValue, -1, "com.bpjstku.presentation.compose.common.ComposableSingletons$CustomBottomDialogKt.lambda-1.<anonymous> (CustomBottomDialog.kt:288)");
                }
                TextKt.m2654Text4IGK_g("Batal", (Modifier) null, ColorKt.Color(4294927175L), 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196998, 0, 131034);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }

        TuitionPaymentFragmentbindingInflater1() {
        }
    }

    public static Function3<RowScope, Composer, Integer, Unit> b() {
        return TuitionPaymentFragmentbindingInflater1;
    }
}
