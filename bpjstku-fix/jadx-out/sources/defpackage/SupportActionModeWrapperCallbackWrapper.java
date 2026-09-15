package defpackage;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRightKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class SupportActionModeWrapperCallbackWrapper {
    public static final SupportActionModeWrapperCallbackWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new SupportActionModeWrapperCallbackWrapper();
    private static Function2<Composer, Integer, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = ComposableLambdaKt.composableLambdaInstance(-2066460596, false, TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);

    static final class TuitionPaymentFragmentbindingInflater1 implements Function2<Composer, Integer, Unit> {
        public static final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentbindingInflater1();

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2066460596, iIntValue, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ComposableSingletons$ScholarshipHistoryParticipantKt.lambda-1.<anonymous> (ScholarshipHistoryParticipant.kt:74)");
                }
                IconKt.m2128Iconww6aTOc(KeyboardArrowRightKt.getKeyboardArrowRight(Icons.AutoMirrored.Filled.INSTANCE), "Navigate", SizeKt.m1047size3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(30.0f)), 0L, composer2, 432, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        TuitionPaymentFragmentbindingInflater1() {
        }
    }

    public static Function2<Composer, Integer, Unit> TuitionPaymentFragmentbindingInflater1() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}
