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
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.internal.BackHandlerDispatcherCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"BackHandler", "", "enabled", "", "onBack", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "activity-compose"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BackHandlerKt {
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
    public static final void BackHandler(boolean z, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        final boolean z3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-361453782);
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
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (!composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composerStartRestartGroup.skipToGroupEnd();
            z3 = z2;
        } else {
            boolean z4 = i4 != 0 ? true : z2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-361453782, i3, -1, "androidx.activity.compose.BackHandler (BackHandler.kt:107)");
            }
            Object current = LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalNavigationEventDispatcherOwner.$stable);
            if (current != null) {
                composerStartRestartGroup.startReplaceGroup(535271790);
            } else {
                composerStartRestartGroup.startReplaceGroup(535274673);
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
            boolean z5 = z4;
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            boolean zChanged2 = composerStartRestartGroup.changed(backHandlerDispatcherCompat2);
            boolean zChanged3 = composerStartRestartGroup.changed(currentCompositeKeyHashCode);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if ((zChanged2 | zChanged3) || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ComposeBackHandler(new BackHandlerInfo(current, currentCompositeKeyHashCode));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final ComposeBackHandler composeBackHandler = (ComposeBackHandler) objRememberedValue2;
            if (ActivityFlags.isOnBackPressedLifecycleOrderMaintained) {
                composerStartRestartGroup.startReplaceGroup(-585307852);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(composeBackHandler);
                boolean z6 = (i3 & 112) == 32;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if ((zChangedInstance | z6) || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: androidx.activity.compose.BackHandlerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BackHandlerKt.BackHandler$lambda$2$0(composeBackHandler, function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(composeBackHandler);
                int i5 = i3 & 14;
                boolean z7 = i5 == 4;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if ((zChangedInstance2 || z7) || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    z3 = z5;
                    objRememberedValue4 = new Function1() { // from class: androidx.activity.compose.BackHandlerKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BackHandlerKt.BackHandler$lambda$3$0(composeBackHandler, z3, (LifecycleStartStopEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    z3 = z5;
                }
                LifecycleEffectKt.LifecycleStartEffect(Boolean.valueOf(z3), composeBackHandler, null, (Function1) objRememberedValue4, composerStartRestartGroup, i5, 4);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(backHandlerDispatcherCompat2);
                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(composeBackHandler);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if ((zChangedInstance3 | zChangedInstance4) || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: androidx.activity.compose.BackHandlerKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BackHandlerKt.BackHandler$lambda$4$0(backHandlerDispatcherCompat2, composeBackHandler, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                EffectsKt.DisposableEffect(backHandlerDispatcherCompat2, composeBackHandler, (Function1) objRememberedValue5, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                z3 = z5;
                composerStartRestartGroup.startReplaceGroup(-584634160);
                boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(composeBackHandler);
                boolean z8 = (i3 & 14) == 4;
                boolean z9 = (i3 & 112) == 32;
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if ((zChangedInstance5 | z8 | z9) || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: androidx.activity.compose.BackHandlerKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BackHandlerKt.BackHandler$lambda$5$0(composeBackHandler, z3, function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                EffectsKt.SideEffect((Function0) objRememberedValue6, composerStartRestartGroup, 0);
                boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(backHandlerDispatcherCompat2);
                boolean zChangedInstance7 = composerStartRestartGroup.changedInstance(composeBackHandler);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if ((zChangedInstance6 | zChangedInstance7) || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function1() { // from class: androidx.activity.compose.BackHandlerKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BackHandlerKt.BackHandler$lambda$6$0(backHandlerDispatcherCompat2, composeBackHandler, (LifecycleStartStopEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                LifecycleEffectKt.LifecycleStartEffect(backHandlerDispatcherCompat2, composeBackHandler, null, (Function1) objRememberedValue7, composerStartRestartGroup, 0, 4);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.activity.compose.BackHandlerKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BackHandlerKt.BackHandler$lambda$7(z3, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BackHandler$lambda$2$0(ComposeBackHandler composeBackHandler, Function0 function0) {
        composeBackHandler.setCurrentOnBackCompleted(function0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleStopOrDisposeEffectResult BackHandler$lambda$3$0(final ComposeBackHandler composeBackHandler, boolean z, final LifecycleStartStopEffectScope lifecycleStartStopEffectScope) {
        composeBackHandler.setBackEnabled(z);
        return new LifecycleStopOrDisposeEffectResult() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$lambda$3$0$$inlined$onStopOrDispose$1
            @Override // androidx.p002lifecycle.p003compose.LifecycleStopOrDisposeEffectResult
            public final void runStopOrDisposeEffect() {
                LifecycleStartStopEffectScope lifecycleStartStopEffectScope2 = lifecycleStartStopEffectScope;
                composeBackHandler.setBackEnabled(false);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult BackHandler$lambda$4$0(final BackHandlerDispatcherCompat backHandlerDispatcherCompat, final ComposeBackHandler composeBackHandler, DisposableEffectScope disposableEffectScope) {
        backHandlerDispatcherCompat.addHandler(composeBackHandler);
        return new DisposableEffectResult() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$lambda$4$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() throws Exception {
                backHandlerDispatcherCompat.removeHandler(composeBackHandler);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BackHandler$lambda$5$0(ComposeBackHandler composeBackHandler, boolean z, Function0 function0) {
        composeBackHandler.setBackEnabled(z);
        composeBackHandler.setCurrentOnBackCompleted(function0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleStopOrDisposeEffectResult BackHandler$lambda$6$0(final BackHandlerDispatcherCompat backHandlerDispatcherCompat, final ComposeBackHandler composeBackHandler, final LifecycleStartStopEffectScope lifecycleStartStopEffectScope) {
        backHandlerDispatcherCompat.addHandler(composeBackHandler);
        return new LifecycleStopOrDisposeEffectResult() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$lambda$6$0$$inlined$onStopOrDispose$1
            @Override // androidx.p002lifecycle.p003compose.LifecycleStopOrDisposeEffectResult
            public final void runStopOrDisposeEffect() throws Exception {
                LifecycleStartStopEffectScope lifecycleStartStopEffectScope2 = lifecycleStartStopEffectScope;
                backHandlerDispatcherCompat.removeHandler(composeBackHandler);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BackHandler$lambda$7(boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        BackHandler(z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }
}
