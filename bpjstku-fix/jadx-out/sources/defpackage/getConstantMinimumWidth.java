package defpackage;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.bpjstku.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class getConstantMinimumWidth {
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:68:0x011a  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final String str, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function1;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function4;
        int i5;
        Function0<Unit> function5;
        Function2<? super Composer, ? super Integer, Unit> function2TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final Function2<? super Composer, ? super Integer, Unit> function6;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function3, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-921056379);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                function1 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function4 = function2;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceGroup(330897940);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: getConstantMinimumHeight
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function5 = (Function0) objRememberedValue;
                    } else {
                        function5 = function1;
                    }
                    if (i4 != 0) {
                        invalidateCache invalidatecache = invalidateCache.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        function2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = invalidateCache.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    } else {
                        function2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-921056379, i3, -1, "com.bpjstku.presentation.compose.common.CommonScreenWithBackground (CommonScreen.kt:26)");
                    }
                    Function0<Unit> function7 = function5;
                    Function2<? super Composer, ? super Integer, Unit> function8 = function2TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    ScaffoldKt.m2309ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-1654058423, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, function5, function2TuitionPaymentFragmentspecialinlinedviewModeldefault1), composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-646634860, true, new b(function3), composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 509);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function1 = function7;
                    function6 = function8;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function6 = function4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Function0<Unit> function9 = function1;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getConstantHeight
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            String str2 = str;
                            Function3 function10 = function3;
                            Function0 function11 = function9;
                            Function2 function12 = function6;
                            int i7 = i;
                            getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str2, function10, function11, function12, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i7 | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 3072;
            function4 = function2;
            if ((i3 & 1171) == 1170) {
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceGroup(330897940);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: getConstantMinimumHeight
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function5 = (Function0) objRememberedValue;
                } else {
                    function5 = function1;
                }
                if (i4 != 0) {
                    invalidateCache invalidatecache2 = invalidateCache.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    function2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = invalidateCache.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                } else {
                    function2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-921056379, i3, -1, "com.bpjstku.presentation.compose.common.CommonScreenWithBackground (CommonScreen.kt:26)");
                }
                Function0<Unit> function10 = function5;
                Function2<? super Composer, ? super Integer, Unit> function11 = function2TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                ScaffoldKt.m2309ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-1654058423, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, function5, function2TuitionPaymentFragmentspecialinlinedviewModeldefault1), composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-646634860, true, new b(function3), composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 509);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function1 = function10;
                function6 = function11;
            } else {
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceGroup(330897940);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: getConstantMinimumHeight
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function5 = (Function0) objRememberedValue;
                } else {
                    function5 = function1;
                }
                if (i4 != 0) {
                    invalidateCache invalidatecache3 = invalidateCache.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    function2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = invalidateCache.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                } else {
                    function2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-921056379, i3, -1, "com.bpjstku.presentation.compose.common.CommonScreenWithBackground (CommonScreen.kt:26)");
                }
                Function0<Unit> function12 = function5;
                Function2<? super Composer, ? super Integer, Unit> function13 = function2TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                ScaffoldKt.m2309ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-1654058423, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, function5, function2TuitionPaymentFragmentspecialinlinedviewModeldefault1), composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-646634860, true, new b(function3), composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 509);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function1 = function12;
                function6 = function13;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Function0 function14 = function1;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getConstantHeight
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String str2 = str;
                        Function3 function15 = function3;
                        Function0 function16 = function14;
                        Function2 function17 = function6;
                        int i7 = i;
                        getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str2, function15, function16, function17, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i7 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 384;
        function1 = function0;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                function4 = function2;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i3 & 1171) == 1170) {
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceGroup(330897940);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: getConstantMinimumHeight
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function5 = (Function0) objRememberedValue;
                } else {
                    function5 = function1;
                }
                if (i4 != 0) {
                    invalidateCache invalidatecache4 = invalidateCache.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    function2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = invalidateCache.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                } else {
                    function2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-921056379, i3, -1, "com.bpjstku.presentation.compose.common.CommonScreenWithBackground (CommonScreen.kt:26)");
                }
                Function0<Unit> function15 = function5;
                Function2<? super Composer, ? super Integer, Unit> function16 = function2TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                ScaffoldKt.m2309ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-1654058423, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, function5, function2TuitionPaymentFragmentspecialinlinedviewModeldefault1), composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-646634860, true, new b(function3), composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 509);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function1 = function15;
                function6 = function16;
            } else {
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceGroup(330897940);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: getConstantMinimumHeight
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function5 = (Function0) objRememberedValue;
                } else {
                    function5 = function1;
                }
                if (i4 != 0) {
                    invalidateCache invalidatecache5 = invalidateCache.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    function2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = invalidateCache.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                } else {
                    function2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-921056379, i3, -1, "com.bpjstku.presentation.compose.common.CommonScreenWithBackground (CommonScreen.kt:26)");
                }
                Function0<Unit> function17 = function5;
                Function2<? super Composer, ? super Integer, Unit> function18 = function2TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                ScaffoldKt.m2309ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-1654058423, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, function5, function2TuitionPaymentFragmentspecialinlinedviewModeldefault1), composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-646634860, true, new b(function3), composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 509);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function1 = function17;
                function6 = function18;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Function0 function19 = function1;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getConstantHeight
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String str2 = str;
                        Function3 function110 = function3;
                        Function0 function111 = function19;
                        Function2 function112 = function6;
                        int i7 = i;
                        getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str2, function110, function111, function112, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i7 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 3072;
        function4 = function2;
        if ((i3 & 1171) == 1170) {
            if (i6 != 0) {
                composerStartRestartGroup.startReplaceGroup(330897940);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: getConstantMinimumHeight
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                function5 = (Function0) objRememberedValue;
            } else {
                function5 = function1;
            }
            if (i4 != 0) {
                invalidateCache invalidatecache6 = invalidateCache.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                function2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = invalidateCache.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            } else {
                function2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-921056379, i3, -1, "com.bpjstku.presentation.compose.common.CommonScreenWithBackground (CommonScreen.kt:26)");
            }
            Function0<Unit> function110 = function5;
            Function2<? super Composer, ? super Integer, Unit> function111 = function2TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            ScaffoldKt.m2309ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-1654058423, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, function5, function2TuitionPaymentFragmentspecialinlinedviewModeldefault1), composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-646634860, true, new b(function3), composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function1 = function110;
            function6 = function111;
        } else {
            if (i6 != 0) {
                composerStartRestartGroup.startReplaceGroup(330897940);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: getConstantMinimumHeight
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                function5 = (Function0) objRememberedValue;
            } else {
                function5 = function1;
            }
            if (i4 != 0) {
                invalidateCache invalidatecache7 = invalidateCache.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                function2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = invalidateCache.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            } else {
                function2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-921056379, i3, -1, "com.bpjstku.presentation.compose.common.CommonScreenWithBackground (CommonScreen.kt:26)");
            }
            Function0<Unit> function112 = function5;
            Function2<? super Composer, ? super Integer, Unit> function113 = function2TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            ScaffoldKt.m2309ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-1654058423, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, function5, function2TuitionPaymentFragmentspecialinlinedviewModeldefault1), composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-646634860, true, new b(function3), composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function1 = function112;
            function6 = function113;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function0 function114 = function1;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getConstantHeight
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    Function3 function115 = function3;
                    Function0 function116 = function114;
                    Function2 function117 = function6;
                    int i7 = i;
                    getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str2, function115, function116, function117, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i7 | 1), i2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Function2<Composer, Integer, Unit> {
        private /* synthetic */ Function0<Unit> TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private /* synthetic */ Function2<Composer, Integer, Unit> b;

        @Override // kotlin.jvm.functions.Function2
        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1654058423, iIntValue, -1, "com.bpjstku.presentation.compose.common.CommonScreenWithBackground.<anonymous> (CommonScreen.kt:29)");
                }
                String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                final Function0<Unit> function0 = this.TuitionPaymentFragmentbindingInflater1;
                Function2<Composer, Integer, Unit> function2 = this.b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composer2);
                Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3543setimpl(composerM3536constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer2.startReplaceGroup(1485502629);
                boolean zChanged = composer2.changed(function0);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: getEnterFadeDuration
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(function0);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                addChild.b(str, (Function0) objRememberedValue, composer2, 0);
                function2.invoke(composer2, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            this.TuitionPaymentFragmentbindingInflater1 = function0;
            this.b = function2;
        }
    }

    static final class b implements Function3<PaddingValues, Composer, Integer, Unit> {
        private /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // kotlin.jvm.functions.Function3
        public final /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            PaddingValues paddingValues2 = paddingValues;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(paddingValues2, "");
            if ((iIntValue & 6) == 0) {
                iIntValue |= composer2.changed(paddingValues2) ? 4 : 2;
            }
            if ((iIntValue & 19) != 18 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-646634860, iIntValue, -1, "com.bpjstku.presentation.compose.common.CommonScreenWithBackground.<anonymous> (CommonScreen.kt:37)");
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Function3<PaddingValues, Composer, Integer, Unit> function3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composer2);
                Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3543setimpl(composerM3536constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.img_background_infoprogram, composer2, 6), (String) null, BoxScopeInstance.INSTANCE.align(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), Alignment.INSTANCE.getTopStart()), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer2, 24624, 104);
                function3.invoke(paddingValues2, composer2, Integer.valueOf(iIntValue & 14));
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function3;
        }
    }
}
