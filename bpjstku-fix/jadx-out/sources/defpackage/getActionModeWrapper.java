package defpackage;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.bpjstku.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class getActionModeWrapper {
    public static final getActionModeWrapper b = new getActionModeWrapper();
    private static Function3<LazyItemScope, Composer, Integer, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ComposableLambdaKt.composableLambdaInstance(1378865299, false, TuitionPaymentFragmentspecialinlinedviewModeldefault2.b);
    private static Function3<LazyItemScope, Composer, Integer, Unit> TuitionPaymentFragmentbindingInflater1 = ComposableLambdaKt.composableLambdaInstance(952387737, false, TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Function3<LazyItemScope, Composer, Integer, Unit> {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault2 b = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(lazyItemScope, "");
            if ((iIntValue & 17) != 16 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1378865299, iIntValue, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ComposableSingletons$ScholarFormScreenKt.lambda-1.<anonymous> (ScholarFormScreen.kt:417)");
                }
                TextKt.m2654Text4IGK_g("Note: Mohon pastikan rekening penerima aktif. Apabila terdapat perubahan data harap melakukan konfirmasi di Kantor Cabang.", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(4284900966L), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 1576374, 0, 130992);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(lazyItemScope, "");
            if ((iIntValue & 17) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(952387737, iIntValue, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ComposableSingletons$ScholarFormScreenKt.lambda-2.<anonymous> (ScholarFormScreen.kt:565)");
                }
                SpacerKt.Spacer(SizeKt.m1033height3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(26.0f)), composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }
    }

    public static Function3<LazyItemScope, Composer, Integer, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static Function3<LazyItemScope, Composer, Integer, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return TuitionPaymentFragmentbindingInflater1;
    }
}
