package defpackage;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import com.bpjstku.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class growArray {
    public static final growArray b = new growArray();
    private static Function3<RowScope, Composer, Integer, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = ComposableLambdaKt.composableLambdaInstance(1370398895, false, TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    private static Function3<RowScope, Composer, Integer, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ComposableLambdaKt.composableLambdaInstance(1181285954, false, b.b);

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Function3<RowScope, Composer, Integer, Unit> {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((iIntValue & 17) != 16 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1370398895, iIntValue, -1, "com.bpjstku.presentation.compose.common.ComposableSingletons$BiometricVerificationGuideKt.lambda-1.<anonymous> (BiometricVerificationGuide.kt:141)");
                }
                TextKt.m2654Text4IGK_g("Buka Kamera", (Modifier) null, 0L, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.poppins_semibold, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 1575942, 0, 130998);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }
    }

    static final class b implements Function3<RowScope, Composer, Integer, Unit> {
        public static final b b = new b();

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((iIntValue & 17) != 16 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1181285954, iIntValue, -1, "com.bpjstku.presentation.compose.common.ComposableSingletons$BiometricVerificationGuideKt.lambda-2.<anonymous> (BiometricVerificationGuide.kt:158)");
                }
                TextKt.m2654Text4IGK_g("Batalkan", (Modifier) null, 0L, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.poppins_regular, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 1575942, 0, 130998);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        b() {
        }
    }

    public static Function3<RowScope, Composer, Integer, Unit> TuitionPaymentFragmentbindingInflater1() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static Function3<RowScope, Composer, Integer, Unit> b() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }
}
