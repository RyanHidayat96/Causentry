package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class setSpinEnabled {
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final Function0<Unit> function0, final Function0<Unit> function1, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(868244383);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(868244383, i2, -1, "com.bpjstku.presentation.compose.common.LivenessPermissionHandler (LivenessPermissionHandler.kt:8)");
            }
            String[] strArr = {"android.permission.CAMERA"};
            composerStartRestartGroup.startReplaceGroup(242219110);
            boolean z = (i2 & 14) == 4;
            boolean z2 = (i2 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: setVerticalMirror
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Function0 function2 = function0;
                        Function0 function3 = function1;
                        CompatibilityApi21Impl compatibilityApi21Impl = (CompatibilityApi21Impl) obj;
                        Intrinsics.checkNotNullParameter(compatibilityApi21Impl, "");
                        if (Intrinsics.areEqual(compatibilityApi21Impl, CompatibilityApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE)) {
                            function2.invoke();
                        } else {
                            if (!Intrinsics.areEqual(compatibilityApi21Impl, CompatibilityApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INSTANCE)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            function3.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            indexOfStateSet.b(strArr, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getStateDrawableIndex
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    setSpinEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function0, function1, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
