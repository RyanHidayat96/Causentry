package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.bpjstku.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class getArrowShaftLength {
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final setArrowHeadLength setarrowheadlength, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(setarrowheadlength, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(744307924);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(setarrowheadlength) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(744307924, i2, -1, "com.bpjstku.presentation.compose.common.DialogManager (DialogManager.kt:6)");
            }
            if (setarrowheadlength instanceof setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                composerStartRestartGroup.startReplaceGroup(1825389186);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            } else if (!(setarrowheadlength instanceof setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                if (!(setarrowheadlength instanceof setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                    if (setarrowheadlength instanceof setArrowHeadLength.TuitionPaymentFragmentbindingInflater1) {
                        composerStartRestartGroup.startReplaceGroup(753438582);
                        setArrowHeadLength.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (setArrowHeadLength.TuitionPaymentFragmentbindingInflater1) setarrowheadlength;
                        String str = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        String str2 = tuitionPaymentFragmentbindingInflater1.b;
                        String str3 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        if (str3.length() == 0) {
                            str3 = "OK";
                        }
                        String str4 = str3;
                        composerStartRestartGroup.startReplaceGroup(1825428429);
                        boolean z = (i2 & 112) == 32;
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: getPaint
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function0.invoke();
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        AllCapsTransformationMethod.TuitionPaymentFragmentbindingInflater1(Integer.valueOf(R.drawable.ic_info_blue), str, str2, str4, (Function0) objRememberedValue, null, null, null, false, function0, composerStartRestartGroup, ((i2 << 24) & 1879048192) | 6, 480);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(setarrowheadlength instanceof setArrowHeadLength.b)) {
                            composerStartRestartGroup.startReplaceGroup(1825389587);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(753844682);
                        setArrowHeadLength.b bVar = (setArrowHeadLength.b) setarrowheadlength;
                        Integer num = bVar.b;
                        String str5 = bVar.TuitionPaymentFragmentbindingInflater1;
                        String str6 = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        String str7 = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        String str8 = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        composerStartRestartGroup.startReplaceGroup(1825442947);
                        int i3 = i2 & 14;
                        boolean z2 = i3 == 4;
                        int i4 = i2 & 112;
                        boolean z3 = i4 == 32;
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if ((z2 | z3) || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: isSpinEnabled
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    setArrowHeadLength setarrowheadlength2 = setarrowheadlength;
                                    Function0 function1 = function0;
                                    ((setArrowHeadLength.b) setarrowheadlength2).g.invoke();
                                    function1.invoke();
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        Function0 function1 = (Function0) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1825447636);
                        boolean z4 = i3 == 4;
                        boolean z5 = i4 == 32;
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if ((z4 | z5) || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: getGapSize
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    setArrowHeadLength setarrowheadlength2 = setarrowheadlength;
                                    Function0 function2 = function0;
                                    Function0<Unit> function3 = ((setArrowHeadLength.b) setarrowheadlength2).asBinder;
                                    if (function3 != null) {
                                        function3.invoke();
                                    }
                                    function2.invoke();
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        AllCapsTransformationMethod.TuitionPaymentFragmentbindingInflater1(num, str5, str6, str7, function1, null, str8, (Function0) objRememberedValue3, false, function0, composerStartRestartGroup, (i2 << 24) & 1879048192, 288);
                        composer2.endReplaceGroup();
                    }
                } else {
                    composerStartRestartGroup.startReplaceGroup(753001482);
                    String str9 = ((setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault2) setarrowheadlength).TuitionPaymentFragmentbindingInflater1;
                    composerStartRestartGroup.startReplaceGroup(1825413151);
                    boolean z6 = (i2 & 112) == 32;
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (z6 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: getBarThickness
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function0.invoke();
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    AllCapsTransformationMethod.TuitionPaymentFragmentbindingInflater1(Integer.valueOf(R.drawable.ic_error_process), "Error", null, "Retry", (Function0) objRememberedValue4, null, null, null, false, function0, composerStartRestartGroup, ((i2 << 24) & 1879048192) | 3126, 480);
                    composer2.endReplaceGroup();
                }
            } else {
                composerStartRestartGroup.startReplaceGroup(752562026);
                String str10 = ((setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3) setarrowheadlength).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                composerStartRestartGroup.startReplaceGroup(1825398789);
                boolean z7 = (i2 & 14) == 4;
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z7 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: getBarLength
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ((setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3) setarrowheadlength).TuitionPaymentFragmentbindingInflater1.invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                AllCapsTransformationMethod.TuitionPaymentFragmentbindingInflater1(Integer.valueOf(R.drawable.ic_success), "Berhasil", str10, "OK", (Function0) objRememberedValue5, null, null, null, false, function0, composerStartRestartGroup, ((i2 << 24) & 1879048192) | 3126, 480);
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getDirection
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength, function0, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
