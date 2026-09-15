package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class getStateDrawable {
    public static final void TuitionPaymentFragmentbindingInflater1(final boolean z, final Function0<Unit> function0, final boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-983348031);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                composerStartRestartGroup.startReplaceGroup(-1137624513);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: extractStateSet
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (i5 != 0) {
                z2 = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-983348031, i3, -1, "com.bpjstku.presentation.compose.common.LoadingDialog (LoadingHandler.kt:26)");
            }
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1137621404);
                boolean z3 = (i3 & 896) == 256;
                boolean z4 = (i3 & 112) == 32;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if ((z3 | z4) || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: getStateCount
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean z5 = z2;
                            Function0 function1 = function0;
                            if (z5) {
                                function1.invoke();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                setConstantSize setconstantsize = setConstantSize.b;
                AndroidDialog_androidKt.Dialog((Function0) objRememberedValue2, null, setConstantSize.b(), composerStartRestartGroup, 384, 2);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Function0<Unit> function1 = function0;
        final boolean z5 = z2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: StateListDrawableCompatStateListState
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    boolean z6 = z;
                    Function0 function2 = function1;
                    boolean z7 = z5;
                    int i6 = i;
                    getStateDrawable.TuitionPaymentFragmentbindingInflater1(z6, function2, z7, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i6 | 1), i2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final StateListDrawableCompat TuitionPaymentFragmentbindingInflater1(Composer composer) {
        composer.startReplaceGroup(-590266888);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-590266888, 0, -1, "com.bpjstku.presentation.compose.common.rememberLoadingHandler (LoadingHandler.kt:64)");
        }
        composer.startReplaceGroup(1226056260);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        composer.endReplaceGroup();
        boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
        composer.startReplaceGroup(1226060020);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: getStateListState
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    mutableState.setValue(Boolean.FALSE);
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        TuitionPaymentFragmentbindingInflater1(zBooleanValue, (Function0) objRememberedValue2, false, composer, 48, 4);
        composer.startReplaceGroup(1226062219);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new StateListDrawableCompat(mutableState);
            composer.updateRememberedValue(objRememberedValue3);
        }
        StateListDrawableCompat stateListDrawableCompat = (StateListDrawableCompat) objRememberedValue3;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateListDrawableCompat;
    }
}
