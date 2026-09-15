package defpackage;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
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
public final class CollapsibleActionView {
    public static final CollapsibleActionView b = new CollapsibleActionView();
    private static Function3<RowScope, Composer, Integer, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ComposableLambdaKt.composableLambdaInstance(-1504491421, false, b.b);

    static final class b implements Function3<RowScope, Composer, Integer, Unit> {
        public static final b b = new b();

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((iIntValue & 17) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1504491421, iIntValue, -1, "com.bpjstku.presentation.compose.common.scholarship.ComposableSingletons$ScholarshipConfirmedDialogKt.lambda-1.<anonymous> (ScholarshipConfirmedDialog.kt:84)");
                }
                TextKt.m2654Text4IGK_g("Tutup", (Modifier) null, Color.INSTANCE.m4255getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 390, 0, 131066);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }

        b() {
        }
    }

    public static Function3<RowScope, Composer, Integer, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }
}
