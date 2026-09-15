package defpackage;

import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.bpjstku.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class onActionViewExpanded {
    public static final onActionViewExpanded b = new onActionViewExpanded();
    private static Function2<Composer, Integer, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ComposableLambdaKt.composableLambdaInstance(802726237, false, TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Function2<Composer, Integer, Unit> {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(802726237, iIntValue, -1, "com.bpjstku.presentation.compose.common.scholarship.ComposableSingletons$ScholarProveKt.lambda-1.<anonymous> (ScholarProve.kt:152)");
                }
                IconKt.m2127Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_edit_email, composer2, 6), "Edit", (Modifier) null, ColorKt.Color(4281896508L), composer2, 3120, 4);
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

    public static Function2<Composer, Integer, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }
}
