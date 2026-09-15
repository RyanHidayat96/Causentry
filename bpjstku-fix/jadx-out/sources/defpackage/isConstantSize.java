package defpackage;

import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.PainterResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class isConstantSize {
    public static final isConstantSize TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new isConstantSize();
    private static Function2<Composer, Integer, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ComposableLambdaKt.composableLambdaInstance(404208871, false, TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1);

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Function2<Composer, Integer, Unit> {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(404208871, iIntValue, -1, "com.bpjstku.presentation.compose.common.ComposableSingletons$AppBarKt.lambda-1.<anonymous> (AppBar.kt:29)");
                }
                IconKt.m2127Iconww6aTOc(PainterResources_androidKt.painterResource(2131231099, composer2, 6), "Back", (Modifier) null, Color.INSTANCE.m4254getUnspecified0d7_KjU(), composer2, 3120, 4);
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

    public static Function2<Composer, Integer, Unit> b() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }
}
