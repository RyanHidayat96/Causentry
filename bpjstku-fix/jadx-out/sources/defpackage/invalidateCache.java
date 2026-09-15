package defpackage;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class invalidateCache {
    public static final invalidateCache TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new invalidateCache();
    private static Function2<Composer, Integer, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = ComposableLambdaKt.composableLambdaInstance(1102176657, false, TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    private static Function3<PaddingValues, Composer, Integer, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ComposableLambdaKt.composableLambdaInstance(-614865125, false, b.TuitionPaymentFragmentbindingInflater1);

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Function2<Composer, Integer, Unit> {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1102176657, iIntValue, -1, "com.bpjstku.presentation.compose.common.ComposableSingletons$CommonScreenKt.lambda-1.<anonymous> (CommonScreen.kt:25)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }
    }

    static {
        ComposableLambdaKt.composableLambdaInstance(1869986591, false, TuitionPaymentFragmentspecialinlinedviewModeldefault1.b);
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Function2<Composer, Integer, Unit> {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault1 b = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1869986591, iIntValue, -1, "com.bpjstku.presentation.compose.common.ComposableSingletons$CommonScreenKt.lambda-3.<anonymous> (CommonScreen.kt:65)");
                }
                invalidateCache invalidatecache = invalidateCache.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Penerima Beasiswa", invalidateCache.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), null, null, composer2, 54, 12);
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

    static final class b implements Function3<PaddingValues, Composer, Integer, Unit> {
        public static final b TuitionPaymentFragmentbindingInflater1 = new b();

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(paddingValues, "");
            if ((iIntValue & 17) != 16 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-614865125, iIntValue, -1, "com.bpjstku.presentation.compose.common.ComposableSingletons$CommonScreenKt.lambda-2.<anonymous> (CommonScreen.kt:68)");
                }
                TextKt.m2654Text4IGK_g("Preview content inside CommonScreenWithBackground", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyLarge(), composer2, 6, 0, 65534);
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

    public static Function2<Composer, Integer, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static Function3<PaddingValues, Composer, Integer, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }
}
