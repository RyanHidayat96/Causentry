package androidx.view.compose;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.p002lifecycle.p003compose.LifecycleEffectKt;
import androidx.p002lifecycle.p003compose.LifecycleStartStopEffectScope;
import androidx.p002lifecycle.p003compose.LifecycleStopOrDisposeEffectResult;
import androidx.p010navigationevent.NavigationEventDispatcher;
import androidx.p010navigationevent.NavigationEventDispatcherOwner;
import androidx.p010navigationevent.p011compose.LocalNavigationEventDispatcherOwner;
import androidx.view.ActivityFlags;
import androidx.view.BackEventCompat;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.internal.BackHandlerDispatcherCompat;
import defpackage.clampVideoBitrateIfNotSupported;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001aZ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032A\u0010\u0004\u001a=\b\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b0\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0005H\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"PredictiveBackHandler", "", "enabled", "", "onBack", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/BackEventCompat;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ParameterName;", "name", "progress", "Lkotlin/coroutines/Continuation;", "", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "activity-compose"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class PredictiveBackHandlerKt {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void PredictiveBackHandler(boolean z, final Function2<clampVideoBitrateIfNotSupported<BackEventCompat>, ? super Continuation<Unit>, ? extends Object> function2, Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        final boolean z3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-642000585);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (!composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composerStartRestartGroup.skipToGroupEnd();
            z3 = z2;
        } else {
            z3 = i4 != 0 ? true : z2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-642000585, i3, -1, "androidx.activity.compose.PredictiveBackHandler (PredictiveBackHandler.kt:118)");
            }
            Object current = LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalNavigationEventDispatcherOwner.$stable);
            if (current != null) {
                composerStartRestartGroup.startReplaceGroup(1512737723);
            } else {
                composerStartRestartGroup.startReplaceGroup(1512740606);
                current = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (current == null) {
                throw new IllegalStateException("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.".toString());
            }
            boolean zChanged = composerStartRestartGroup.changed(current);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                NavigationEventDispatcherOwner navigationEventDispatcherOwner = current instanceof NavigationEventDispatcherOwner ? (NavigationEventDispatcherOwner) current : null;
                NavigationEventDispatcher navigationEventDispatcher = navigationEventDispatcherOwner != null ? navigationEventDispatcherOwner.getNavigationEventDispatcher() : null;
                OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = current instanceof OnBackPressedDispatcherOwner ? (OnBackPressedDispatcherOwner) current : null;
                BackHandlerDispatcherCompat backHandlerDispatcherCompat = new BackHandlerDispatcherCompat(navigationEventDispatcher, onBackPressedDispatcherOwner != null ? onBackPressedDispatcherOwner.getOnBackPressedDispatcher() : null);
                composerStartRestartGroup.updateRememberedValue(backHandlerDispatcherCompat);
                objRememberedValue = backHandlerDispatcherCompat;
            }
            final BackHandlerDispatcherCompat backHandlerDispatcherCompat2 = (BackHandlerDispatcherCompat) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            boolean zChanged2 = composerStartRestartGroup.changed(backHandlerDispatcherCompat2);
            boolean zChanged3 = composerStartRestartGroup.changed(currentCompositeKeyHashCode);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if ((zChanged2 | zChanged3) || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new ComposePredictiveBackHandler(coroutineScope, new PredictiveBackHandlerInfo(current, currentCompositeKeyHashCode));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final ComposePredictiveBackHandler composePredictiveBackHandler = (ComposePredictiveBackHandler) objRememberedValue3;
            if (ActivityFlags.isOnBackPressedLifecycleOrderMaintained) {
                composerStartRestartGroup.startReplaceGroup(-348514256);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(composePredictiveBackHandler);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(function2);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if ((zChangedInstance | zChangedInstance2) || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PredictiveBackHandlerKt.PredictiveBackHandler$lambda$2$0(composePredictiveBackHandler, function2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(composePredictiveBackHandler);
                int i5 = i3 & 14;
                boolean z4 = i5 == 4;
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if ((zChangedInstance3 | z4) || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PredictiveBackHandlerKt.PredictiveBackHandler$lambda$3$0(composePredictiveBackHandler, z3, (LifecycleStartStopEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                LifecycleEffectKt.LifecycleStartEffect(Boolean.valueOf(z3), composePredictiveBackHandler, null, (Function1) objRememberedValue5, composerStartRestartGroup, i5, 4);
                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(backHandlerDispatcherCompat2);
                boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(composePredictiveBackHandler);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if ((zChangedInstance4 | zChangedInstance5) || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function1() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PredictiveBackHandlerKt.PredictiveBackHandler$lambda$4$0(backHandlerDispatcherCompat2, composePredictiveBackHandler, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                EffectsKt.DisposableEffect(backHandlerDispatcherCompat2, composePredictiveBackHandler, (Function1) objRememberedValue6, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-347849492);
                boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(composePredictiveBackHandler);
                boolean z5 = (i3 & 14) == 4;
                boolean zChangedInstance7 = composerStartRestartGroup.changedInstance(function2);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if ((zChangedInstance6 | z5 | zChangedInstance7) || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PredictiveBackHandlerKt.PredictiveBackHandler$lambda$5$0(composePredictiveBackHandler, z3, function2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                EffectsKt.SideEffect((Function0) objRememberedValue7, composerStartRestartGroup, 0);
                boolean zChangedInstance8 = composerStartRestartGroup.changedInstance(backHandlerDispatcherCompat2);
                boolean zChangedInstance9 = composerStartRestartGroup.changedInstance(composePredictiveBackHandler);
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if ((zChangedInstance8 | zChangedInstance9) || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new Function1() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PredictiveBackHandlerKt.PredictiveBackHandler$lambda$6$0(backHandlerDispatcherCompat2, composePredictiveBackHandler, (LifecycleStartStopEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                LifecycleEffectKt.LifecycleStartEffect(backHandlerDispatcherCompat2, composePredictiveBackHandler, null, (Function1) objRememberedValue8, composerStartRestartGroup, 0, 4);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PredictiveBackHandlerKt.PredictiveBackHandler$lambda$7(z3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PredictiveBackHandler$lambda$2$0(ComposePredictiveBackHandler composePredictiveBackHandler, Function2 function2) {
        composePredictiveBackHandler.setCurrentOnBack(function2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleStopOrDisposeEffectResult PredictiveBackHandler$lambda$3$0(final ComposePredictiveBackHandler composePredictiveBackHandler, boolean z, final LifecycleStartStopEffectScope lifecycleStartStopEffectScope) {
        composePredictiveBackHandler.setBackEnabled(z);
        return new LifecycleStopOrDisposeEffectResult() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$lambda$3$0$$inlined$onStopOrDispose$1
            @Override // androidx.p002lifecycle.p003compose.LifecycleStopOrDisposeEffectResult
            public final void runStopOrDisposeEffect() {
                LifecycleStartStopEffectScope lifecycleStartStopEffectScope2 = lifecycleStartStopEffectScope;
                composePredictiveBackHandler.setBackEnabled(false);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult PredictiveBackHandler$lambda$4$0(final BackHandlerDispatcherCompat backHandlerDispatcherCompat, final ComposePredictiveBackHandler composePredictiveBackHandler, DisposableEffectScope disposableEffectScope) {
        backHandlerDispatcherCompat.addHandler(composePredictiveBackHandler);
        return new DisposableEffectResult() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$lambda$4$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() throws Exception {
                backHandlerDispatcherCompat.removeHandler(composePredictiveBackHandler);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PredictiveBackHandler$lambda$5$0(ComposePredictiveBackHandler composePredictiveBackHandler, boolean z, Function2 function2) {
        composePredictiveBackHandler.setBackEnabled(z);
        composePredictiveBackHandler.setCurrentOnBack(function2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleStopOrDisposeEffectResult PredictiveBackHandler$lambda$6$0(final BackHandlerDispatcherCompat backHandlerDispatcherCompat, final ComposePredictiveBackHandler composePredictiveBackHandler, final LifecycleStartStopEffectScope lifecycleStartStopEffectScope) {
        backHandlerDispatcherCompat.addHandler(composePredictiveBackHandler);
        return new LifecycleStopOrDisposeEffectResult() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$lambda$6$0$$inlined$onStopOrDispose$1
            @Override // androidx.p002lifecycle.p003compose.LifecycleStopOrDisposeEffectResult
            public final void runStopOrDisposeEffect() throws Exception {
                LifecycleStartStopEffectScope lifecycleStartStopEffectScope2 = lifecycleStartStopEffectScope;
                backHandlerDispatcherCompat.removeHandler(composePredictiveBackHandler);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PredictiveBackHandler$lambda$7(boolean z, Function2 function2, int i, int i2, Composer composer, int i3) {
        PredictiveBackHandler(z, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }
}
