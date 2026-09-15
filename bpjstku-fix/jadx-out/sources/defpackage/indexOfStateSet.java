package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.view.compose.ActivityResultRegistryKt;
import androidx.view.compose.ManagedActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import com.bpjstku.presentation.compose.common.PermissionHandlerKt$PermissionHandler$1$1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class indexOfStateSet {
    public static final void b(final String[] strArr, final Function1<? super CompatibilityApi21Impl, Unit> function1, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(1977572055);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(strArr) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1977572055, i2, -1, "com.bpjstku.presentation.compose.common.PermissionHandler (PermissionHandler.kt:10)");
            }
            ActivityResultContracts.RequestMultiplePermissions requestMultiplePermissions = new ActivityResultContracts.RequestMultiplePermissions();
            composerStartRestartGroup.startReplaceGroup(-247671639);
            boolean z = (i2 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: Compatibility
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Function1 function2 = function1;
                        Map map = (Map) obj;
                        Intrinsics.checkNotNullParameter(map, "");
                        Collection collectionValues = map.values();
                        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                            function2.invoke(CompatibilityApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                        } else {
                            Iterator it = collectionValues.iterator();
                            while (it.hasNext()) {
                                if (!((Boolean) it.next()).booleanValue()) {
                                    function2.invoke(CompatibilityApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INSTANCE);
                                }
                            }
                            function2.invoke(CompatibilityApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                        }
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestMultiplePermissions, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-247664128);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(strArr);
            PermissionHandlerKt$PermissionHandler$1$1 permissionHandlerKt$PermissionHandler$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance | zChangedInstance2) || permissionHandlerKt$PermissionHandler$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                permissionHandlerKt$PermissionHandler$1$1RememberedValue = new PermissionHandlerKt$PermissionHandler$1$1(managedActivityResultLauncherRememberLauncherForActivityResult, strArr, null);
                composerStartRestartGroup.updateRememberedValue(permissionHandlerKt$PermissionHandler$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) permissionHandlerKt$PermissionHandler$1$1RememberedValue, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getStateSet
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    indexOfStateSet.b(strArr, function1, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
