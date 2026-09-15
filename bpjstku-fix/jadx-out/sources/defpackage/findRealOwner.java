package defpackage;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class findRealOwner {
    public static final findRealOwner TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new findRealOwner();
    private static Function2<Composer, Integer, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ComposableLambdaKt.composableLambdaInstance(-701502112, false, TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1);

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Function2<Composer, Integer, Unit> {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-701502112, iIntValue, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ComposableSingletons$SubmissionConfirmationScreenKt.lambda-1.<anonymous> (SubmissionConfirmationScreen.kt:120)");
                }
                getTabContainerHeight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(1, 1, PaddingKt.m1004paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6935constructorimpl(16.0f), 0.0f, 2, null), composer2, 438, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }
    }

    public static Function2<Composer, Integer, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }
}
