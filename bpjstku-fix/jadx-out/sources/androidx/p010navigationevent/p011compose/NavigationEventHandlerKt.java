package androidx.p010navigationevent.p011compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.p010navigationevent.NavigationEventDispatcher;
import androidx.p010navigationevent.NavigationEventDispatcherOwner;
import androidx.p010navigationevent.NavigationEventInfo;
import androidx.p010navigationevent.NavigationEventTransitionState;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001aq\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\r\u001aE\u0010\u000e\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\u000f\u001aE\u0010\u0010\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0011"}, d2 = {"NavigationEventHandler", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/navigationevent/compose/NavigationEventState;", "Landroidx/navigationevent/NavigationEventInfo;", "isForwardEnabled", "", "onForwardCancelled", "Lkotlin/Function0;", "onForwardCompleted", "isBackEnabled", "onBackCancelled", "onBackCompleted", "(Landroidx/navigationevent/compose/NavigationEventState;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "NavigationBackHandler", "(Landroidx/navigationevent/compose/NavigationEventState;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "NavigationForwardHandler", "navigationevent-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NavigationEventHandlerKt {
    /* JADX WARN: Code duplicated, block: B:101:0x013c  */
    /* JADX WARN: Code duplicated, block: B:103:0x013f  */
    /* JADX WARN: Code duplicated, block: B:105:0x014b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0158  */
    /* JADX WARN: Code duplicated, block: B:110:0x0160  */
    /* JADX WARN: Code duplicated, block: B:113:0x0172  */
    /* JADX WARN: Code duplicated, block: B:115:0x017b  */
    /* JADX WARN: Code duplicated, block: B:116:0x017e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0185  */
    /* JADX WARN: Code duplicated, block: B:121:0x018d  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:125:0x01af  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:132:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:136:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:137:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:140:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:141:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:144:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:145:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:149:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:152:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:156:0x0213  */
    /* JADX WARN: Code duplicated, block: B:159:0x023d  */
    /* JADX WARN: Code duplicated, block: B:160:0x0240  */
    /* JADX WARN: Code duplicated, block: B:163:0x0251  */
    /* JADX WARN: Code duplicated, block: B:165:0x0259  */
    /* JADX WARN: Code duplicated, block: B:168:0x026c  */
    /* JADX WARN: Code duplicated, block: B:170:0x027b  */
    /* JADX WARN: Code duplicated, block: B:172:0x0287  */
    /* JADX WARN: Code duplicated, block: B:175:0x0298  */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x0103  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:92:0x0113  */
    /* JADX WARN: Code duplicated, block: B:95:0x0120  */
    /* JADX WARN: Code duplicated, block: B:97:0x0124  */
    /* JADX WARN: Code duplicated, block: B:99:0x0130  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void NavigationEventHandler(final NavigationEventState<? extends NavigationEventInfo> navigationEventState, boolean z, Function0<Unit> function0, Function0<Unit> function1, boolean z2, Function0<Unit> function2, Function0<Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        Function0<Unit> function4;
        int i5;
        int i6;
        Function0<Unit> function5;
        int i7;
        int i8;
        boolean z4;
        int i9;
        int i10;
        final Function0<Unit> function6;
        int i11;
        int i12;
        Function0<Unit> function7;
        int i13;
        boolean z5;
        final boolean z6;
        final boolean z7;
        final Function0<Unit> function8;
        final Function0<Unit> function9;
        final Function0<Unit> function10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        boolean z8;
        Function0<Unit> function11;
        Function0<Unit> function12;
        Function0<Unit> function13;
        NavigationEventDispatcherOwner current;
        final NavigationEventDispatcher navigationEventDispatcher;
        int i14;
        boolean z9;
        Object objRememberedValue;
        final ComposeNavigationEventHandler composeNavigationEventHandler;
        boolean zChangedInstance;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objRememberedValue2;
        final ComposeNavigationEventHandler composeNavigationEventHandler2;
        boolean z17;
        boolean zChangedInstance2;
        boolean zChangedInstance3;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Object objRememberedValue5;
        Object objRememberedValue6;
        Object objRememberedValue7;
        Composer composerStartRestartGroup = composer.startRestartGroup(898330592);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(navigationEventState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 == 0) {
            if ((i & 48) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    function4 = function0;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        function5 = function1;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            z4 = z2;
                            if (composerStartRestartGroup.changed(z4)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 32;
                        if (i10 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            function6 = function2;
                        } else {
                            function6 = function2;
                            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                if (composerStartRestartGroup.changedInstance(function6)) {
                                    i11 = 131072;
                                } else {
                                    i11 = 65536;
                                }
                                i3 |= i11;
                            }
                        }
                        i12 = i2 & 64;
                        if (i12 != 0) {
                            i3 |= 1572864;
                            function7 = function3;
                        } else {
                            function7 = function3;
                            if ((i & 1572864) == 0) {
                                if (composerStartRestartGroup.changedInstance(function7)) {
                                    i13 = 1048576;
                                } else {
                                    i13 = 524288;
                                }
                                i3 |= i13;
                            }
                        }
                        if ((i3 & 599187) != 599186) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (composerStartRestartGroup.shouldExecute(z5, i3 & 1)) {
                            composerStartRestartGroup.skipToGroupEnd();
                            z6 = z3;
                            z7 = z4;
                            function8 = function5;
                            Function0<Unit> function14 = function4;
                            function9 = function7;
                            function10 = function14;
                        } else {
                            if (i15 != 0) {
                                z8 = true;
                            } else {
                                z8 = z3;
                            }
                            if (i4 != 0) {
                                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue7 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda14
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                }
                                function11 = (Function0) objRememberedValue7;
                            } else {
                                function11 = function4;
                            }
                            if (i6 != 0) {
                                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda15
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                }
                                function5 = (Function0) objRememberedValue6;
                            }
                            if (i8 != 0) {
                                z4 = true;
                            }
                            if (i10 != 0) {
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                function12 = (Function0) objRememberedValue5;
                            } else {
                                function12 = function6;
                            }
                            if (i12 != 0) {
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                function13 = (Function0) objRememberedValue4;
                            } else {
                                function13 = function7;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(898330592, i3, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                            }
                            current = LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current != null) {
                                throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner".toString());
                            }
                            navigationEventDispatcher = current.getNavigationEventDispatcher();
                            i14 = i3 & 14;
                            if (i14 == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                ComposeNavigationEventHandler composeNavigationEventHandler3 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                                    }
                                });
                                composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler3);
                                objRememberedValue = composeNavigationEventHandler3;
                            }
                            composeNavigationEventHandler = (ComposeNavigationEventHandler) objRememberedValue;
                            zChangedInstance = composerStartRestartGroup.changedInstance(composeNavigationEventHandler);
                            if ((i3 & 112) == 32) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if ((i3 & 896) == 256) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if ((i3 & 7168) == 2048) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if ((57344 & i3) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if ((458752 & i3) == 131072) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((i3 & 3670016) == 1048576) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (i14 == 4) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if ((!(zChangedInstance | z10 | z11 | z12 | z13 | z14 | z15) && !z16) || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                final boolean z18 = z8;
                                final Function0<Unit> function15 = function11;
                                final Function0<Unit> function16 = function5;
                                final boolean z19 = z4;
                                final Function0<Unit> function17 = function12;
                                final Function0<Unit> function18 = function13;
                                composeNavigationEventHandler2 = composeNavigationEventHandler;
                                Function0 function19 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z18, function15, function16, z19, function17, function18, navigationEventState);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(function19);
                                objRememberedValue2 = function19;
                            } else {
                                composeNavigationEventHandler2 = composeNavigationEventHandler;
                            }
                            EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
                            if (r27 == 4) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(composeNavigationEventHandler2);
                            zChangedInstance3 = composerStartRestartGroup.changedInstance(r26);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!(zChangedInstance2 | z17 | zChangedInstance3) || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            EffectsKt.DisposableEffect(navigationEventState, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, i14);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function5;
                            z7 = z4;
                            function6 = function12;
                            z6 = z8;
                            function9 = function13;
                            function10 = function11;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$17(navigationEventState, z6, function10, function8, z7, function6, function9, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 24576;
                    z4 = z2;
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function6 = function2;
                    } else {
                        function6 = function2;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                    }
                    i12 = i2 & 64;
                    if (i12 != 0) {
                        i3 |= 1572864;
                        function7 = function3;
                    } else {
                        function7 = function3;
                        if ((i & 1572864) == 0) {
                            if (composerStartRestartGroup.changedInstance(function7)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i3 |= i13;
                        }
                    }
                    if ((i3 & 599187) != 599186) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z5, i3 & 1)) {
                        composerStartRestartGroup.skipToGroupEnd();
                        z6 = z3;
                        z7 = z4;
                        function8 = function5;
                        Function0<Unit> function110 = function4;
                        function9 = function7;
                        function10 = function110;
                    } else {
                        if (i15 != 0) {
                            z8 = true;
                        } else {
                            z8 = z3;
                        }
                        if (i4 != 0) {
                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda14
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            }
                            function11 = (Function0) objRememberedValue7;
                        } else {
                            function11 = function4;
                        }
                        if (i6 != 0) {
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda15
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            function5 = (Function0) objRememberedValue6;
                        }
                        if (i8 != 0) {
                            z4 = true;
                        }
                        if (i10 != 0) {
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            function12 = (Function0) objRememberedValue5;
                        } else {
                            function12 = function6;
                        }
                        if (i12 != 0) {
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            function13 = (Function0) objRememberedValue4;
                        } else {
                            function13 = function7;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(898330592, i3, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                        }
                        current = LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current != null) {
                            throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner".toString());
                        }
                        navigationEventDispatcher = current.getNavigationEventDispatcher();
                        i14 = i3 & 14;
                        if (i14 == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z9) {
                            ComposeNavigationEventHandler composeNavigationEventHandler4 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler4);
                            objRememberedValue = composeNavigationEventHandler4;
                        } else {
                            ComposeNavigationEventHandler composeNavigationEventHandler5 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler5);
                            objRememberedValue = composeNavigationEventHandler5;
                        }
                        composeNavigationEventHandler = (ComposeNavigationEventHandler) objRememberedValue;
                        zChangedInstance = composerStartRestartGroup.changedInstance(composeNavigationEventHandler);
                        if ((i3 & 112) == 32) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((i3 & 896) == 256) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((i3 & 7168) == 2048) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((57344 & i3) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((458752 & i3) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i3 & 3670016) == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i14 == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!(zChangedInstance | z10 | z11 | z12 | z13 | z14 | z15 | z16)) {
                            final boolean z110 = z8;
                            final Function0 function111 = function11;
                            final Function0 function112 = function5;
                            final boolean z111 = z4;
                            final Function0 function113 = function12;
                            final Function0 function114 = function13;
                            composeNavigationEventHandler2 = composeNavigationEventHandler;
                            Function0 function115 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z110, function111, function112, z111, function113, function114, navigationEventState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function115);
                            objRememberedValue2 = function115;
                        } else {
                            final boolean z112 = z8;
                            final Function0 function116 = function11;
                            final Function0 function117 = function5;
                            final boolean z113 = z4;
                            final Function0 function118 = function12;
                            final Function0 function119 = function13;
                            composeNavigationEventHandler2 = composeNavigationEventHandler;
                            Function0 function1110 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z112, function116, function117, z113, function118, function119, navigationEventState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function1110);
                            objRememberedValue2 = function1110;
                        }
                        EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
                        if (r27 == 4) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(composeNavigationEventHandler2);
                        zChangedInstance3 = composerStartRestartGroup.changedInstance(r26);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!(zChangedInstance2 | z17 | zChangedInstance3)) {
                            objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        EffectsKt.DisposableEffect(navigationEventState, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, i14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function5;
                        z7 = z4;
                        function6 = function12;
                        z6 = z8;
                        function9 = function13;
                        function10 = function11;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$17(navigationEventState, z6, function10, function8, z7, function6, function9, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 3072;
                function5 = function1;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        z4 = z2;
                        if (composerStartRestartGroup.changed(z4)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function6 = function2;
                    } else {
                        function6 = function2;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                    }
                    i12 = i2 & 64;
                    if (i12 != 0) {
                        i3 |= 1572864;
                        function7 = function3;
                    } else {
                        function7 = function3;
                        if ((i & 1572864) == 0) {
                            if (composerStartRestartGroup.changedInstance(function7)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i3 |= i13;
                        }
                    }
                    if ((i3 & 599187) != 599186) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z5, i3 & 1)) {
                        composerStartRestartGroup.skipToGroupEnd();
                        z6 = z3;
                        z7 = z4;
                        function8 = function5;
                        Function0<Unit> function1111 = function4;
                        function9 = function7;
                        function10 = function1111;
                    } else {
                        if (i15 != 0) {
                            z8 = true;
                        } else {
                            z8 = z3;
                        }
                        if (i4 != 0) {
                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda14
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            }
                            function11 = (Function0) objRememberedValue7;
                        } else {
                            function11 = function4;
                        }
                        if (i6 != 0) {
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda15
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            function5 = (Function0) objRememberedValue6;
                        }
                        if (i8 != 0) {
                            z4 = true;
                        }
                        if (i10 != 0) {
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            function12 = (Function0) objRememberedValue5;
                        } else {
                            function12 = function6;
                        }
                        if (i12 != 0) {
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            function13 = (Function0) objRememberedValue4;
                        } else {
                            function13 = function7;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(898330592, i3, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                        }
                        current = LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current != null) {
                            throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner".toString());
                        }
                        navigationEventDispatcher = current.getNavigationEventDispatcher();
                        i14 = i3 & 14;
                        if (i14 == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z9) {
                            ComposeNavigationEventHandler composeNavigationEventHandler6 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler6);
                            objRememberedValue = composeNavigationEventHandler6;
                        } else {
                            ComposeNavigationEventHandler composeNavigationEventHandler7 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler7);
                            objRememberedValue = composeNavigationEventHandler7;
                        }
                        composeNavigationEventHandler = (ComposeNavigationEventHandler) objRememberedValue;
                        zChangedInstance = composerStartRestartGroup.changedInstance(composeNavigationEventHandler);
                        if ((i3 & 112) == 32) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((i3 & 896) == 256) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((i3 & 7168) == 2048) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((57344 & i3) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((458752 & i3) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i3 & 3670016) == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i14 == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!(zChangedInstance | z10 | z11 | z12 | z13 | z14 | z15 | z16)) {
                            final boolean z114 = z8;
                            final Function0 function1112 = function11;
                            final Function0 function1113 = function5;
                            final boolean z115 = z4;
                            final Function0 function1114 = function12;
                            final Function0 function1115 = function13;
                            composeNavigationEventHandler2 = composeNavigationEventHandler;
                            Function0 function1116 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z114, function1112, function1113, z115, function1114, function1115, navigationEventState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function1116);
                            objRememberedValue2 = function1116;
                        } else {
                            final boolean z116 = z8;
                            final Function0 function1117 = function11;
                            final Function0 function1118 = function5;
                            final boolean z117 = z4;
                            final Function0 function1119 = function12;
                            final Function0 function11110 = function13;
                            composeNavigationEventHandler2 = composeNavigationEventHandler;
                            Function0 function11111 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z116, function1117, function1118, z117, function1119, function11110, navigationEventState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function11111);
                            objRememberedValue2 = function11111;
                        }
                        EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
                        if (r27 == 4) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(composeNavigationEventHandler2);
                        zChangedInstance3 = composerStartRestartGroup.changedInstance(r26);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!(zChangedInstance2 | z17 | zChangedInstance3)) {
                            objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        EffectsKt.DisposableEffect(navigationEventState, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, i14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function5;
                        z7 = z4;
                        function6 = function12;
                        z6 = z8;
                        function9 = function13;
                        function10 = function11;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$17(navigationEventState, z6, function10, function8, z7, function6, function9, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 24576;
                z4 = z2;
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function6 = function2;
                } else {
                    function6 = function2;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                    function7 = function3;
                } else {
                    function7 = function3;
                    if ((i & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function7)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                }
                if ((i3 & 599187) != 599186) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z5, i3 & 1)) {
                    composerStartRestartGroup.skipToGroupEnd();
                    z6 = z3;
                    z7 = z4;
                    function8 = function5;
                    Function0<Unit> function11112 = function4;
                    function9 = function7;
                    function10 = function11112;
                } else {
                    if (i15 != 0) {
                        z8 = true;
                    } else {
                        z8 = z3;
                    }
                    if (i4 != 0) {
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        function11 = (Function0) objRememberedValue7;
                    } else {
                        function11 = function4;
                    }
                    if (i6 != 0) {
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        function5 = (Function0) objRememberedValue6;
                    }
                    if (i8 != 0) {
                        z4 = true;
                    }
                    if (i10 != 0) {
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        function12 = (Function0) objRememberedValue5;
                    } else {
                        function12 = function6;
                    }
                    if (i12 != 0) {
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        function13 = (Function0) objRememberedValue4;
                    } else {
                        function13 = function7;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(898330592, i3, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                    }
                    current = LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                    if (current != null) {
                        throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner".toString());
                    }
                    navigationEventDispatcher = current.getNavigationEventDispatcher();
                    i14 = i3 & 14;
                    if (i14 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z9) {
                        ComposeNavigationEventHandler composeNavigationEventHandler8 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler8);
                        objRememberedValue = composeNavigationEventHandler8;
                    } else {
                        ComposeNavigationEventHandler composeNavigationEventHandler9 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler9);
                        objRememberedValue = composeNavigationEventHandler9;
                    }
                    composeNavigationEventHandler = (ComposeNavigationEventHandler) objRememberedValue;
                    zChangedInstance = composerStartRestartGroup.changedInstance(composeNavigationEventHandler);
                    if ((i3 & 112) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i3 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i3 & 7168) == 2048) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if ((57344 & i3) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((458752 & i3) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i3 & 3670016) == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (i14 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(zChangedInstance | z10 | z11 | z12 | z13 | z14 | z15 | z16)) {
                        final boolean z118 = z8;
                        final Function0 function11113 = function11;
                        final Function0 function11114 = function5;
                        final boolean z119 = z4;
                        final Function0 function11115 = function12;
                        final Function0 function11116 = function13;
                        composeNavigationEventHandler2 = composeNavigationEventHandler;
                        Function0 function11117 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z118, function11113, function11114, z119, function11115, function11116, navigationEventState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function11117);
                        objRememberedValue2 = function11117;
                    } else {
                        final boolean z1110 = z8;
                        final Function0 function11118 = function11;
                        final Function0 function11119 = function5;
                        final boolean z1111 = z4;
                        final Function0 function111110 = function12;
                        final Function0 function111111 = function13;
                        composeNavigationEventHandler2 = composeNavigationEventHandler;
                        Function0 function111112 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z1110, function11118, function11119, z1111, function111110, function111111, navigationEventState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function111112);
                        objRememberedValue2 = function111112;
                    }
                    EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
                    if (r27 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(composeNavigationEventHandler2);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(r26);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!(zChangedInstance2 | z17 | zChangedInstance3)) {
                        objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    EffectsKt.DisposableEffect(navigationEventState, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, i14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function5;
                    z7 = z4;
                    function6 = function12;
                    z6 = z8;
                    function9 = function13;
                    function10 = function11;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$17(navigationEventState, z6, function10, function8, z7, function6, function9, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 384;
            function4 = function0;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    function5 = function1;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        z4 = z2;
                        if (composerStartRestartGroup.changed(z4)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function6 = function2;
                    } else {
                        function6 = function2;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                    }
                    i12 = i2 & 64;
                    if (i12 != 0) {
                        i3 |= 1572864;
                        function7 = function3;
                    } else {
                        function7 = function3;
                        if ((i & 1572864) == 0) {
                            if (composerStartRestartGroup.changedInstance(function7)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i3 |= i13;
                        }
                    }
                    if ((i3 & 599187) != 599186) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z5, i3 & 1)) {
                        composerStartRestartGroup.skipToGroupEnd();
                        z6 = z3;
                        z7 = z4;
                        function8 = function5;
                        Function0<Unit> function111113 = function4;
                        function9 = function7;
                        function10 = function111113;
                    } else {
                        if (i15 != 0) {
                            z8 = true;
                        } else {
                            z8 = z3;
                        }
                        if (i4 != 0) {
                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda14
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            }
                            function11 = (Function0) objRememberedValue7;
                        } else {
                            function11 = function4;
                        }
                        if (i6 != 0) {
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda15
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            function5 = (Function0) objRememberedValue6;
                        }
                        if (i8 != 0) {
                            z4 = true;
                        }
                        if (i10 != 0) {
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            function12 = (Function0) objRememberedValue5;
                        } else {
                            function12 = function6;
                        }
                        if (i12 != 0) {
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            function13 = (Function0) objRememberedValue4;
                        } else {
                            function13 = function7;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(898330592, i3, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                        }
                        current = LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current != null) {
                            throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner".toString());
                        }
                        navigationEventDispatcher = current.getNavigationEventDispatcher();
                        i14 = i3 & 14;
                        if (i14 == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z9) {
                            ComposeNavigationEventHandler composeNavigationEventHandler10 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler10);
                            objRememberedValue = composeNavigationEventHandler10;
                        } else {
                            ComposeNavigationEventHandler composeNavigationEventHandler11 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler11);
                            objRememberedValue = composeNavigationEventHandler11;
                        }
                        composeNavigationEventHandler = (ComposeNavigationEventHandler) objRememberedValue;
                        zChangedInstance = composerStartRestartGroup.changedInstance(composeNavigationEventHandler);
                        if ((i3 & 112) == 32) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((i3 & 896) == 256) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((i3 & 7168) == 2048) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((57344 & i3) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((458752 & i3) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i3 & 3670016) == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i14 == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!(zChangedInstance | z10 | z11 | z12 | z13 | z14 | z15 | z16)) {
                            final boolean z1112 = z8;
                            final Function0 function111114 = function11;
                            final Function0 function111115 = function5;
                            final boolean z1113 = z4;
                            final Function0 function111116 = function12;
                            final Function0 function111117 = function13;
                            composeNavigationEventHandler2 = composeNavigationEventHandler;
                            Function0 function111118 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z1112, function111114, function111115, z1113, function111116, function111117, navigationEventState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function111118);
                            objRememberedValue2 = function111118;
                        } else {
                            final boolean z1114 = z8;
                            final Function0 function111119 = function11;
                            final Function0 function1111110 = function5;
                            final boolean z1115 = z4;
                            final Function0 function1111111 = function12;
                            final Function0 function1111112 = function13;
                            composeNavigationEventHandler2 = composeNavigationEventHandler;
                            Function0 function1111113 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z1114, function111119, function1111110, z1115, function1111111, function1111112, navigationEventState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function1111113);
                            objRememberedValue2 = function1111113;
                        }
                        EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
                        if (r27 == 4) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(composeNavigationEventHandler2);
                        zChangedInstance3 = composerStartRestartGroup.changedInstance(r26);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!(zChangedInstance2 | z17 | zChangedInstance3)) {
                            objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        EffectsKt.DisposableEffect(navigationEventState, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, i14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function5;
                        z7 = z4;
                        function6 = function12;
                        z6 = z8;
                        function9 = function13;
                        function10 = function11;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$17(navigationEventState, z6, function10, function8, z7, function6, function9, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 24576;
                z4 = z2;
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function6 = function2;
                } else {
                    function6 = function2;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                    function7 = function3;
                } else {
                    function7 = function3;
                    if ((i & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function7)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                }
                if ((i3 & 599187) != 599186) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z5, i3 & 1)) {
                    composerStartRestartGroup.skipToGroupEnd();
                    z6 = z3;
                    z7 = z4;
                    function8 = function5;
                    Function0<Unit> function1111114 = function4;
                    function9 = function7;
                    function10 = function1111114;
                } else {
                    if (i15 != 0) {
                        z8 = true;
                    } else {
                        z8 = z3;
                    }
                    if (i4 != 0) {
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        function11 = (Function0) objRememberedValue7;
                    } else {
                        function11 = function4;
                    }
                    if (i6 != 0) {
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        function5 = (Function0) objRememberedValue6;
                    }
                    if (i8 != 0) {
                        z4 = true;
                    }
                    if (i10 != 0) {
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        function12 = (Function0) objRememberedValue5;
                    } else {
                        function12 = function6;
                    }
                    if (i12 != 0) {
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        function13 = (Function0) objRememberedValue4;
                    } else {
                        function13 = function7;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(898330592, i3, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                    }
                    current = LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                    if (current != null) {
                        throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner".toString());
                    }
                    navigationEventDispatcher = current.getNavigationEventDispatcher();
                    i14 = i3 & 14;
                    if (i14 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z9) {
                        ComposeNavigationEventHandler composeNavigationEventHandler12 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler12);
                        objRememberedValue = composeNavigationEventHandler12;
                    } else {
                        ComposeNavigationEventHandler composeNavigationEventHandler13 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler13);
                        objRememberedValue = composeNavigationEventHandler13;
                    }
                    composeNavigationEventHandler = (ComposeNavigationEventHandler) objRememberedValue;
                    zChangedInstance = composerStartRestartGroup.changedInstance(composeNavigationEventHandler);
                    if ((i3 & 112) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i3 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i3 & 7168) == 2048) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if ((57344 & i3) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((458752 & i3) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i3 & 3670016) == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (i14 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(zChangedInstance | z10 | z11 | z12 | z13 | z14 | z15 | z16)) {
                        final boolean z1116 = z8;
                        final Function0 function1111115 = function11;
                        final Function0 function1111116 = function5;
                        final boolean z1117 = z4;
                        final Function0 function1111117 = function12;
                        final Function0 function1111118 = function13;
                        composeNavigationEventHandler2 = composeNavigationEventHandler;
                        Function0 function1111119 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z1116, function1111115, function1111116, z1117, function1111117, function1111118, navigationEventState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function1111119);
                        objRememberedValue2 = function1111119;
                    } else {
                        final boolean z1118 = z8;
                        final Function0 function11111110 = function11;
                        final Function0 function11111111 = function5;
                        final boolean z1119 = z4;
                        final Function0 function11111112 = function12;
                        final Function0 function11111113 = function13;
                        composeNavigationEventHandler2 = composeNavigationEventHandler;
                        Function0 function11111114 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z1118, function11111110, function11111111, z1119, function11111112, function11111113, navigationEventState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function11111114);
                        objRememberedValue2 = function11111114;
                    }
                    EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
                    if (r27 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(composeNavigationEventHandler2);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(r26);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!(zChangedInstance2 | z17 | zChangedInstance3)) {
                        objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    EffectsKt.DisposableEffect(navigationEventState, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, i14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function5;
                    z7 = z4;
                    function6 = function12;
                    z6 = z8;
                    function9 = function13;
                    function10 = function11;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$17(navigationEventState, z6, function10, function8, z7, function6, function9, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            function5 = function1;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    z4 = z2;
                    if (composerStartRestartGroup.changed(z4)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function6 = function2;
                } else {
                    function6 = function2;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                    function7 = function3;
                } else {
                    function7 = function3;
                    if ((i & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function7)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                }
                if ((i3 & 599187) != 599186) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z5, i3 & 1)) {
                    composerStartRestartGroup.skipToGroupEnd();
                    z6 = z3;
                    z7 = z4;
                    function8 = function5;
                    Function0<Unit> function11111115 = function4;
                    function9 = function7;
                    function10 = function11111115;
                } else {
                    if (i15 != 0) {
                        z8 = true;
                    } else {
                        z8 = z3;
                    }
                    if (i4 != 0) {
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        function11 = (Function0) objRememberedValue7;
                    } else {
                        function11 = function4;
                    }
                    if (i6 != 0) {
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        function5 = (Function0) objRememberedValue6;
                    }
                    if (i8 != 0) {
                        z4 = true;
                    }
                    if (i10 != 0) {
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        function12 = (Function0) objRememberedValue5;
                    } else {
                        function12 = function6;
                    }
                    if (i12 != 0) {
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        function13 = (Function0) objRememberedValue4;
                    } else {
                        function13 = function7;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(898330592, i3, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                    }
                    current = LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                    if (current != null) {
                        throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner".toString());
                    }
                    navigationEventDispatcher = current.getNavigationEventDispatcher();
                    i14 = i3 & 14;
                    if (i14 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z9) {
                        ComposeNavigationEventHandler composeNavigationEventHandler14 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler14);
                        objRememberedValue = composeNavigationEventHandler14;
                    } else {
                        ComposeNavigationEventHandler composeNavigationEventHandler15 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler15);
                        objRememberedValue = composeNavigationEventHandler15;
                    }
                    composeNavigationEventHandler = (ComposeNavigationEventHandler) objRememberedValue;
                    zChangedInstance = composerStartRestartGroup.changedInstance(composeNavigationEventHandler);
                    if ((i3 & 112) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i3 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i3 & 7168) == 2048) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if ((57344 & i3) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((458752 & i3) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i3 & 3670016) == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (i14 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(zChangedInstance | z10 | z11 | z12 | z13 | z14 | z15 | z16)) {
                        final boolean z11110 = z8;
                        final Function0 function11111116 = function11;
                        final Function0 function11111117 = function5;
                        final boolean z11111 = z4;
                        final Function0 function11111118 = function12;
                        final Function0 function11111119 = function13;
                        composeNavigationEventHandler2 = composeNavigationEventHandler;
                        Function0 function111111110 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z11110, function11111116, function11111117, z11111, function11111118, function11111119, navigationEventState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function111111110);
                        objRememberedValue2 = function111111110;
                    } else {
                        final boolean z11112 = z8;
                        final Function0 function111111111 = function11;
                        final Function0 function111111112 = function5;
                        final boolean z11113 = z4;
                        final Function0 function111111113 = function12;
                        final Function0 function111111114 = function13;
                        composeNavigationEventHandler2 = composeNavigationEventHandler;
                        Function0 function111111115 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z11112, function111111111, function111111112, z11113, function111111113, function111111114, navigationEventState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function111111115);
                        objRememberedValue2 = function111111115;
                    }
                    EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
                    if (r27 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(composeNavigationEventHandler2);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(r26);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!(zChangedInstance2 | z17 | zChangedInstance3)) {
                        objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    EffectsKt.DisposableEffect(navigationEventState, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, i14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function5;
                    z7 = z4;
                    function6 = function12;
                    z6 = z8;
                    function9 = function13;
                    function10 = function11;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$17(navigationEventState, z6, function10, function8, z7, function6, function9, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            z4 = z2;
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function6 = function2;
            } else {
                function6 = function2;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
            }
            i12 = i2 & 64;
            if (i12 != 0) {
                i3 |= 1572864;
                function7 = function3;
            } else {
                function7 = function3;
                if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
            }
            if ((i3 & 599187) != 599186) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z5, i3 & 1)) {
                composerStartRestartGroup.skipToGroupEnd();
                z6 = z3;
                z7 = z4;
                function8 = function5;
                Function0<Unit> function111111116 = function4;
                function9 = function7;
                function10 = function111111116;
            } else {
                if (i15 != 0) {
                    z8 = true;
                } else {
                    z8 = z3;
                }
                if (i4 != 0) {
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    function11 = (Function0) objRememberedValue7;
                } else {
                    function11 = function4;
                }
                if (i6 != 0) {
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    function5 = (Function0) objRememberedValue6;
                }
                if (i8 != 0) {
                    z4 = true;
                }
                if (i10 != 0) {
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    function12 = (Function0) objRememberedValue5;
                } else {
                    function12 = function6;
                }
                if (i12 != 0) {
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    function13 = (Function0) objRememberedValue4;
                } else {
                    function13 = function7;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(898330592, i3, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                }
                current = LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current != null) {
                    throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner".toString());
                }
                navigationEventDispatcher = current.getNavigationEventDispatcher();
                i14 = i3 & 14;
                if (i14 == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z9) {
                    ComposeNavigationEventHandler composeNavigationEventHandler16 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler16);
                    objRememberedValue = composeNavigationEventHandler16;
                } else {
                    ComposeNavigationEventHandler composeNavigationEventHandler17 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler17);
                    objRememberedValue = composeNavigationEventHandler17;
                }
                composeNavigationEventHandler = (ComposeNavigationEventHandler) objRememberedValue;
                zChangedInstance = composerStartRestartGroup.changedInstance(composeNavigationEventHandler);
                if ((i3 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i3 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i3 & 7168) == 2048) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((57344 & i3) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((458752 & i3) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i3 & 3670016) == 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (i14 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!(zChangedInstance | z10 | z11 | z12 | z13 | z14 | z15 | z16)) {
                    final boolean z11114 = z8;
                    final Function0 function111111117 = function11;
                    final Function0 function111111118 = function5;
                    final boolean z11115 = z4;
                    final Function0 function111111119 = function12;
                    final Function0 function1111111110 = function13;
                    composeNavigationEventHandler2 = composeNavigationEventHandler;
                    Function0 function1111111111 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z11114, function111111117, function111111118, z11115, function111111119, function1111111110, navigationEventState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function1111111111);
                    objRememberedValue2 = function1111111111;
                } else {
                    final boolean z11116 = z8;
                    final Function0 function1111111112 = function11;
                    final Function0 function1111111113 = function5;
                    final boolean z11117 = z4;
                    final Function0 function1111111114 = function12;
                    final Function0 function1111111115 = function13;
                    composeNavigationEventHandler2 = composeNavigationEventHandler;
                    Function0 function1111111116 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z11116, function1111111112, function1111111113, z11117, function1111111114, function1111111115, navigationEventState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function1111111116);
                    objRememberedValue2 = function1111111116;
                }
                EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
                if (r27 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zChangedInstance2 = composerStartRestartGroup.changedInstance(composeNavigationEventHandler2);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(r26);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!(zChangedInstance2 | z17 | zChangedInstance3)) {
                    objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                EffectsKt.DisposableEffect(navigationEventState, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, i14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function5;
                z7 = z4;
                function6 = function12;
                z6 = z8;
                function9 = function13;
                function10 = function11;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NavigationEventHandlerKt.NavigationEventHandler$lambda$17(navigationEventState, z6, function10, function8, z7, function6, function9, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        z3 = z;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                function4 = function0;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    function5 = function1;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        z4 = z2;
                        if (composerStartRestartGroup.changed(z4)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function6 = function2;
                    } else {
                        function6 = function2;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                    }
                    i12 = i2 & 64;
                    if (i12 != 0) {
                        i3 |= 1572864;
                        function7 = function3;
                    } else {
                        function7 = function3;
                        if ((i & 1572864) == 0) {
                            if (composerStartRestartGroup.changedInstance(function7)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i3 |= i13;
                        }
                    }
                    if ((i3 & 599187) != 599186) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z5, i3 & 1)) {
                        composerStartRestartGroup.skipToGroupEnd();
                        z6 = z3;
                        z7 = z4;
                        function8 = function5;
                        Function0<Unit> function1111111117 = function4;
                        function9 = function7;
                        function10 = function1111111117;
                    } else {
                        if (i15 != 0) {
                            z8 = true;
                        } else {
                            z8 = z3;
                        }
                        if (i4 != 0) {
                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda14
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            }
                            function11 = (Function0) objRememberedValue7;
                        } else {
                            function11 = function4;
                        }
                        if (i6 != 0) {
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda15
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            function5 = (Function0) objRememberedValue6;
                        }
                        if (i8 != 0) {
                            z4 = true;
                        }
                        if (i10 != 0) {
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            function12 = (Function0) objRememberedValue5;
                        } else {
                            function12 = function6;
                        }
                        if (i12 != 0) {
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            function13 = (Function0) objRememberedValue4;
                        } else {
                            function13 = function7;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(898330592, i3, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                        }
                        current = LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current != null) {
                            throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner".toString());
                        }
                        navigationEventDispatcher = current.getNavigationEventDispatcher();
                        i14 = i3 & 14;
                        if (i14 == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z9) {
                            ComposeNavigationEventHandler composeNavigationEventHandler18 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler18);
                            objRememberedValue = composeNavigationEventHandler18;
                        } else {
                            ComposeNavigationEventHandler composeNavigationEventHandler19 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler19);
                            objRememberedValue = composeNavigationEventHandler19;
                        }
                        composeNavigationEventHandler = (ComposeNavigationEventHandler) objRememberedValue;
                        zChangedInstance = composerStartRestartGroup.changedInstance(composeNavigationEventHandler);
                        if ((i3 & 112) == 32) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((i3 & 896) == 256) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((i3 & 7168) == 2048) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((57344 & i3) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((458752 & i3) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i3 & 3670016) == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i14 == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!(zChangedInstance | z10 | z11 | z12 | z13 | z14 | z15 | z16)) {
                            final boolean z11118 = z8;
                            final Function0 function1111111118 = function11;
                            final Function0 function1111111119 = function5;
                            final boolean z11119 = z4;
                            final Function0 function11111111110 = function12;
                            final Function0 function11111111111 = function13;
                            composeNavigationEventHandler2 = composeNavigationEventHandler;
                            Function0 function11111111112 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z11118, function1111111118, function1111111119, z11119, function11111111110, function11111111111, navigationEventState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function11111111112);
                            objRememberedValue2 = function11111111112;
                        } else {
                            final boolean z111110 = z8;
                            final Function0 function11111111113 = function11;
                            final Function0 function11111111114 = function5;
                            final boolean z111111 = z4;
                            final Function0 function11111111115 = function12;
                            final Function0 function11111111116 = function13;
                            composeNavigationEventHandler2 = composeNavigationEventHandler;
                            Function0 function11111111117 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z111110, function11111111113, function11111111114, z111111, function11111111115, function11111111116, navigationEventState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function11111111117);
                            objRememberedValue2 = function11111111117;
                        }
                        EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
                        if (r27 == 4) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(composeNavigationEventHandler2);
                        zChangedInstance3 = composerStartRestartGroup.changedInstance(r26);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!(zChangedInstance2 | z17 | zChangedInstance3)) {
                            objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        EffectsKt.DisposableEffect(navigationEventState, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, i14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function5;
                        z7 = z4;
                        function6 = function12;
                        z6 = z8;
                        function9 = function13;
                        function10 = function11;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$17(navigationEventState, z6, function10, function8, z7, function6, function9, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 24576;
                z4 = z2;
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function6 = function2;
                } else {
                    function6 = function2;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                    function7 = function3;
                } else {
                    function7 = function3;
                    if ((i & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function7)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                }
                if ((i3 & 599187) != 599186) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z5, i3 & 1)) {
                    composerStartRestartGroup.skipToGroupEnd();
                    z6 = z3;
                    z7 = z4;
                    function8 = function5;
                    Function0<Unit> function11111111118 = function4;
                    function9 = function7;
                    function10 = function11111111118;
                } else {
                    if (i15 != 0) {
                        z8 = true;
                    } else {
                        z8 = z3;
                    }
                    if (i4 != 0) {
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        function11 = (Function0) objRememberedValue7;
                    } else {
                        function11 = function4;
                    }
                    if (i6 != 0) {
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        function5 = (Function0) objRememberedValue6;
                    }
                    if (i8 != 0) {
                        z4 = true;
                    }
                    if (i10 != 0) {
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        function12 = (Function0) objRememberedValue5;
                    } else {
                        function12 = function6;
                    }
                    if (i12 != 0) {
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        function13 = (Function0) objRememberedValue4;
                    } else {
                        function13 = function7;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(898330592, i3, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                    }
                    current = LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                    if (current != null) {
                        throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner".toString());
                    }
                    navigationEventDispatcher = current.getNavigationEventDispatcher();
                    i14 = i3 & 14;
                    if (i14 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z9) {
                        ComposeNavigationEventHandler composeNavigationEventHandler110 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler110);
                        objRememberedValue = composeNavigationEventHandler110;
                    } else {
                        ComposeNavigationEventHandler composeNavigationEventHandler111 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler111);
                        objRememberedValue = composeNavigationEventHandler111;
                    }
                    composeNavigationEventHandler = (ComposeNavigationEventHandler) objRememberedValue;
                    zChangedInstance = composerStartRestartGroup.changedInstance(composeNavigationEventHandler);
                    if ((i3 & 112) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i3 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i3 & 7168) == 2048) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if ((57344 & i3) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((458752 & i3) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i3 & 3670016) == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (i14 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(zChangedInstance | z10 | z11 | z12 | z13 | z14 | z15 | z16)) {
                        final boolean z111112 = z8;
                        final Function0 function11111111119 = function11;
                        final Function0 function111111111110 = function5;
                        final boolean z111113 = z4;
                        final Function0 function111111111111 = function12;
                        final Function0 function111111111112 = function13;
                        composeNavigationEventHandler2 = composeNavigationEventHandler;
                        Function0 function111111111113 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z111112, function11111111119, function111111111110, z111113, function111111111111, function111111111112, navigationEventState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function111111111113);
                        objRememberedValue2 = function111111111113;
                    } else {
                        final boolean z111114 = z8;
                        final Function0 function111111111114 = function11;
                        final Function0 function111111111115 = function5;
                        final boolean z111115 = z4;
                        final Function0 function111111111116 = function12;
                        final Function0 function111111111117 = function13;
                        composeNavigationEventHandler2 = composeNavigationEventHandler;
                        Function0 function111111111118 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z111114, function111111111114, function111111111115, z111115, function111111111116, function111111111117, navigationEventState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function111111111118);
                        objRememberedValue2 = function111111111118;
                    }
                    EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
                    if (r27 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(composeNavigationEventHandler2);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(r26);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!(zChangedInstance2 | z17 | zChangedInstance3)) {
                        objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    EffectsKt.DisposableEffect(navigationEventState, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, i14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function5;
                    z7 = z4;
                    function6 = function12;
                    z6 = z8;
                    function9 = function13;
                    function10 = function11;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$17(navigationEventState, z6, function10, function8, z7, function6, function9, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            function5 = function1;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    z4 = z2;
                    if (composerStartRestartGroup.changed(z4)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function6 = function2;
                } else {
                    function6 = function2;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                    function7 = function3;
                } else {
                    function7 = function3;
                    if ((i & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function7)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                }
                if ((i3 & 599187) != 599186) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z5, i3 & 1)) {
                    composerStartRestartGroup.skipToGroupEnd();
                    z6 = z3;
                    z7 = z4;
                    function8 = function5;
                    Function0<Unit> function111111111119 = function4;
                    function9 = function7;
                    function10 = function111111111119;
                } else {
                    if (i15 != 0) {
                        z8 = true;
                    } else {
                        z8 = z3;
                    }
                    if (i4 != 0) {
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        function11 = (Function0) objRememberedValue7;
                    } else {
                        function11 = function4;
                    }
                    if (i6 != 0) {
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        function5 = (Function0) objRememberedValue6;
                    }
                    if (i8 != 0) {
                        z4 = true;
                    }
                    if (i10 != 0) {
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        function12 = (Function0) objRememberedValue5;
                    } else {
                        function12 = function6;
                    }
                    if (i12 != 0) {
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        function13 = (Function0) objRememberedValue4;
                    } else {
                        function13 = function7;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(898330592, i3, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                    }
                    current = LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                    if (current != null) {
                        throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner".toString());
                    }
                    navigationEventDispatcher = current.getNavigationEventDispatcher();
                    i14 = i3 & 14;
                    if (i14 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z9) {
                        ComposeNavigationEventHandler composeNavigationEventHandler112 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler112);
                        objRememberedValue = composeNavigationEventHandler112;
                    } else {
                        ComposeNavigationEventHandler composeNavigationEventHandler113 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler113);
                        objRememberedValue = composeNavigationEventHandler113;
                    }
                    composeNavigationEventHandler = (ComposeNavigationEventHandler) objRememberedValue;
                    zChangedInstance = composerStartRestartGroup.changedInstance(composeNavigationEventHandler);
                    if ((i3 & 112) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i3 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i3 & 7168) == 2048) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if ((57344 & i3) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((458752 & i3) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i3 & 3670016) == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (i14 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(zChangedInstance | z10 | z11 | z12 | z13 | z14 | z15 | z16)) {
                        final boolean z111116 = z8;
                        final Function0 function1111111111110 = function11;
                        final Function0 function1111111111111 = function5;
                        final boolean z111117 = z4;
                        final Function0 function1111111111112 = function12;
                        final Function0 function1111111111113 = function13;
                        composeNavigationEventHandler2 = composeNavigationEventHandler;
                        Function0 function1111111111114 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z111116, function1111111111110, function1111111111111, z111117, function1111111111112, function1111111111113, navigationEventState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function1111111111114);
                        objRememberedValue2 = function1111111111114;
                    } else {
                        final boolean z111118 = z8;
                        final Function0 function1111111111115 = function11;
                        final Function0 function1111111111116 = function5;
                        final boolean z111119 = z4;
                        final Function0 function1111111111117 = function12;
                        final Function0 function1111111111118 = function13;
                        composeNavigationEventHandler2 = composeNavigationEventHandler;
                        Function0 function1111111111119 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z111118, function1111111111115, function1111111111116, z111119, function1111111111117, function1111111111118, navigationEventState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function1111111111119);
                        objRememberedValue2 = function1111111111119;
                    }
                    EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
                    if (r27 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(composeNavigationEventHandler2);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(r26);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!(zChangedInstance2 | z17 | zChangedInstance3)) {
                        objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    EffectsKt.DisposableEffect(navigationEventState, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, i14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function5;
                    z7 = z4;
                    function6 = function12;
                    z6 = z8;
                    function9 = function13;
                    function10 = function11;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$17(navigationEventState, z6, function10, function8, z7, function6, function9, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            z4 = z2;
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function6 = function2;
            } else {
                function6 = function2;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
            }
            i12 = i2 & 64;
            if (i12 != 0) {
                i3 |= 1572864;
                function7 = function3;
            } else {
                function7 = function3;
                if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
            }
            if ((i3 & 599187) != 599186) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z5, i3 & 1)) {
                composerStartRestartGroup.skipToGroupEnd();
                z6 = z3;
                z7 = z4;
                function8 = function5;
                Function0<Unit> function1111111111120 = function4;
                function9 = function7;
                function10 = function1111111111120;
            } else {
                if (i15 != 0) {
                    z8 = true;
                } else {
                    z8 = z3;
                }
                if (i4 != 0) {
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    function11 = (Function0) objRememberedValue7;
                } else {
                    function11 = function4;
                }
                if (i6 != 0) {
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    function5 = (Function0) objRememberedValue6;
                }
                if (i8 != 0) {
                    z4 = true;
                }
                if (i10 != 0) {
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    function12 = (Function0) objRememberedValue5;
                } else {
                    function12 = function6;
                }
                if (i12 != 0) {
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    function13 = (Function0) objRememberedValue4;
                } else {
                    function13 = function7;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(898330592, i3, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                }
                current = LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current != null) {
                    throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner".toString());
                }
                navigationEventDispatcher = current.getNavigationEventDispatcher();
                i14 = i3 & 14;
                if (i14 == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z9) {
                    ComposeNavigationEventHandler composeNavigationEventHandler114 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler114);
                    objRememberedValue = composeNavigationEventHandler114;
                } else {
                    ComposeNavigationEventHandler composeNavigationEventHandler115 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler115);
                    objRememberedValue = composeNavigationEventHandler115;
                }
                composeNavigationEventHandler = (ComposeNavigationEventHandler) objRememberedValue;
                zChangedInstance = composerStartRestartGroup.changedInstance(composeNavigationEventHandler);
                if ((i3 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i3 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i3 & 7168) == 2048) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((57344 & i3) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((458752 & i3) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i3 & 3670016) == 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (i14 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!(zChangedInstance | z10 | z11 | z12 | z13 | z14 | z15 | z16)) {
                    final boolean z1111110 = z8;
                    final Function0 function11111111111110 = function11;
                    final Function0 function11111111111111 = function5;
                    final boolean z1111111 = z4;
                    final Function0 function11111111111112 = function12;
                    final Function0 function11111111111113 = function13;
                    composeNavigationEventHandler2 = composeNavigationEventHandler;
                    Function0 function11111111111114 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z1111110, function11111111111110, function11111111111111, z1111111, function11111111111112, function11111111111113, navigationEventState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function11111111111114);
                    objRememberedValue2 = function11111111111114;
                } else {
                    final boolean z1111112 = z8;
                    final Function0 function11111111111115 = function11;
                    final Function0 function11111111111116 = function5;
                    final boolean z1111113 = z4;
                    final Function0 function11111111111117 = function12;
                    final Function0 function11111111111118 = function13;
                    composeNavigationEventHandler2 = composeNavigationEventHandler;
                    Function0 function11111111111119 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z1111112, function11111111111115, function11111111111116, z1111113, function11111111111117, function11111111111118, navigationEventState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function11111111111119);
                    objRememberedValue2 = function11111111111119;
                }
                EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
                if (r27 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zChangedInstance2 = composerStartRestartGroup.changedInstance(composeNavigationEventHandler2);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(r26);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!(zChangedInstance2 | z17 | zChangedInstance3)) {
                    objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                EffectsKt.DisposableEffect(navigationEventState, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, i14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function5;
                z7 = z4;
                function6 = function12;
                z6 = z8;
                function9 = function13;
                function10 = function11;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NavigationEventHandlerKt.NavigationEventHandler$lambda$17(navigationEventState, z6, function10, function8, z7, function6, function9, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        function4 = function0;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                function5 = function1;
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    z4 = z2;
                    if (composerStartRestartGroup.changed(z4)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function6 = function2;
                } else {
                    function6 = function2;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                    function7 = function3;
                } else {
                    function7 = function3;
                    if ((i & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function7)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                }
                if ((i3 & 599187) != 599186) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z5, i3 & 1)) {
                    composerStartRestartGroup.skipToGroupEnd();
                    z6 = z3;
                    z7 = z4;
                    function8 = function5;
                    Function0<Unit> function1111111111121 = function4;
                    function9 = function7;
                    function10 = function1111111111121;
                } else {
                    if (i15 != 0) {
                        z8 = true;
                    } else {
                        z8 = z3;
                    }
                    if (i4 != 0) {
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        function11 = (Function0) objRememberedValue7;
                    } else {
                        function11 = function4;
                    }
                    if (i6 != 0) {
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        function5 = (Function0) objRememberedValue6;
                    }
                    if (i8 != 0) {
                        z4 = true;
                    }
                    if (i10 != 0) {
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        function12 = (Function0) objRememberedValue5;
                    } else {
                        function12 = function6;
                    }
                    if (i12 != 0) {
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        function13 = (Function0) objRememberedValue4;
                    } else {
                        function13 = function7;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(898330592, i3, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                    }
                    current = LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                    if (current != null) {
                        throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner".toString());
                    }
                    navigationEventDispatcher = current.getNavigationEventDispatcher();
                    i14 = i3 & 14;
                    if (i14 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z9) {
                        ComposeNavigationEventHandler composeNavigationEventHandler116 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler116);
                        objRememberedValue = composeNavigationEventHandler116;
                    } else {
                        ComposeNavigationEventHandler composeNavigationEventHandler117 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler117);
                        objRememberedValue = composeNavigationEventHandler117;
                    }
                    composeNavigationEventHandler = (ComposeNavigationEventHandler) objRememberedValue;
                    zChangedInstance = composerStartRestartGroup.changedInstance(composeNavigationEventHandler);
                    if ((i3 & 112) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i3 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i3 & 7168) == 2048) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if ((57344 & i3) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((458752 & i3) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i3 & 3670016) == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (i14 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(zChangedInstance | z10 | z11 | z12 | z13 | z14 | z15 | z16)) {
                        final boolean z1111114 = z8;
                        final Function0 function111111111111110 = function11;
                        final Function0 function111111111111111 = function5;
                        final boolean z1111115 = z4;
                        final Function0 function111111111111112 = function12;
                        final Function0 function111111111111113 = function13;
                        composeNavigationEventHandler2 = composeNavigationEventHandler;
                        Function0 function111111111111114 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z1111114, function111111111111110, function111111111111111, z1111115, function111111111111112, function111111111111113, navigationEventState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function111111111111114);
                        objRememberedValue2 = function111111111111114;
                    } else {
                        final boolean z1111116 = z8;
                        final Function0 function111111111111115 = function11;
                        final Function0 function111111111111116 = function5;
                        final boolean z1111117 = z4;
                        final Function0 function111111111111117 = function12;
                        final Function0 function111111111111118 = function13;
                        composeNavigationEventHandler2 = composeNavigationEventHandler;
                        Function0 function111111111111119 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z1111116, function111111111111115, function111111111111116, z1111117, function111111111111117, function111111111111118, navigationEventState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function111111111111119);
                        objRememberedValue2 = function111111111111119;
                    }
                    EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
                    if (r27 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(composeNavigationEventHandler2);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(r26);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!(zChangedInstance2 | z17 | zChangedInstance3)) {
                        objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    EffectsKt.DisposableEffect(navigationEventState, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, i14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function5;
                    z7 = z4;
                    function6 = function12;
                    z6 = z8;
                    function9 = function13;
                    function10 = function11;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$17(navigationEventState, z6, function10, function8, z7, function6, function9, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            z4 = z2;
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function6 = function2;
            } else {
                function6 = function2;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
            }
            i12 = i2 & 64;
            if (i12 != 0) {
                i3 |= 1572864;
                function7 = function3;
            } else {
                function7 = function3;
                if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
            }
            if ((i3 & 599187) != 599186) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z5, i3 & 1)) {
                composerStartRestartGroup.skipToGroupEnd();
                z6 = z3;
                z7 = z4;
                function8 = function5;
                Function0<Unit> function1111111111122 = function4;
                function9 = function7;
                function10 = function1111111111122;
            } else {
                if (i15 != 0) {
                    z8 = true;
                } else {
                    z8 = z3;
                }
                if (i4 != 0) {
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    function11 = (Function0) objRememberedValue7;
                } else {
                    function11 = function4;
                }
                if (i6 != 0) {
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    function5 = (Function0) objRememberedValue6;
                }
                if (i8 != 0) {
                    z4 = true;
                }
                if (i10 != 0) {
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    function12 = (Function0) objRememberedValue5;
                } else {
                    function12 = function6;
                }
                if (i12 != 0) {
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    function13 = (Function0) objRememberedValue4;
                } else {
                    function13 = function7;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(898330592, i3, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                }
                current = LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current != null) {
                    throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner".toString());
                }
                navigationEventDispatcher = current.getNavigationEventDispatcher();
                i14 = i3 & 14;
                if (i14 == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z9) {
                    ComposeNavigationEventHandler composeNavigationEventHandler118 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler118);
                    objRememberedValue = composeNavigationEventHandler118;
                } else {
                    ComposeNavigationEventHandler composeNavigationEventHandler119 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler119);
                    objRememberedValue = composeNavigationEventHandler119;
                }
                composeNavigationEventHandler = (ComposeNavigationEventHandler) objRememberedValue;
                zChangedInstance = composerStartRestartGroup.changedInstance(composeNavigationEventHandler);
                if ((i3 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i3 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i3 & 7168) == 2048) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((57344 & i3) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((458752 & i3) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i3 & 3670016) == 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (i14 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!(zChangedInstance | z10 | z11 | z12 | z13 | z14 | z15 | z16)) {
                    final boolean z1111118 = z8;
                    final Function0 function1111111111111110 = function11;
                    final Function0 function1111111111111111 = function5;
                    final boolean z1111119 = z4;
                    final Function0 function1111111111111112 = function12;
                    final Function0 function1111111111111113 = function13;
                    composeNavigationEventHandler2 = composeNavigationEventHandler;
                    Function0 function1111111111111114 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z1111118, function1111111111111110, function1111111111111111, z1111119, function1111111111111112, function1111111111111113, navigationEventState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function1111111111111114);
                    objRememberedValue2 = function1111111111111114;
                } else {
                    final boolean z11111110 = z8;
                    final Function0 function1111111111111115 = function11;
                    final Function0 function1111111111111116 = function5;
                    final boolean z11111111 = z4;
                    final Function0 function1111111111111117 = function12;
                    final Function0 function1111111111111118 = function13;
                    composeNavigationEventHandler2 = composeNavigationEventHandler;
                    Function0 function1111111111111119 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z11111110, function1111111111111115, function1111111111111116, z11111111, function1111111111111117, function1111111111111118, navigationEventState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function1111111111111119);
                    objRememberedValue2 = function1111111111111119;
                }
                EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
                if (r27 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zChangedInstance2 = composerStartRestartGroup.changedInstance(composeNavigationEventHandler2);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(r26);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!(zChangedInstance2 | z17 | zChangedInstance3)) {
                    objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                EffectsKt.DisposableEffect(navigationEventState, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, i14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function5;
                z7 = z4;
                function6 = function12;
                z6 = z8;
                function9 = function13;
                function10 = function11;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NavigationEventHandlerKt.NavigationEventHandler$lambda$17(navigationEventState, z6, function10, function8, z7, function6, function9, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        function5 = function1;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                z4 = z2;
                if (composerStartRestartGroup.changed(z4)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function6 = function2;
            } else {
                function6 = function2;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
            }
            i12 = i2 & 64;
            if (i12 != 0) {
                i3 |= 1572864;
                function7 = function3;
            } else {
                function7 = function3;
                if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
            }
            if ((i3 & 599187) != 599186) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z5, i3 & 1)) {
                composerStartRestartGroup.skipToGroupEnd();
                z6 = z3;
                z7 = z4;
                function8 = function5;
                Function0<Unit> function1111111111123 = function4;
                function9 = function7;
                function10 = function1111111111123;
            } else {
                if (i15 != 0) {
                    z8 = true;
                } else {
                    z8 = z3;
                }
                if (i4 != 0) {
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    function11 = (Function0) objRememberedValue7;
                } else {
                    function11 = function4;
                }
                if (i6 != 0) {
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    function5 = (Function0) objRememberedValue6;
                }
                if (i8 != 0) {
                    z4 = true;
                }
                if (i10 != 0) {
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    function12 = (Function0) objRememberedValue5;
                } else {
                    function12 = function6;
                }
                if (i12 != 0) {
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    function13 = (Function0) objRememberedValue4;
                } else {
                    function13 = function7;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(898330592, i3, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                }
                current = LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current != null) {
                    throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner".toString());
                }
                navigationEventDispatcher = current.getNavigationEventDispatcher();
                i14 = i3 & 14;
                if (i14 == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z9) {
                    ComposeNavigationEventHandler composeNavigationEventHandler1110 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler1110);
                    objRememberedValue = composeNavigationEventHandler1110;
                } else {
                    ComposeNavigationEventHandler composeNavigationEventHandler1111 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler1111);
                    objRememberedValue = composeNavigationEventHandler1111;
                }
                composeNavigationEventHandler = (ComposeNavigationEventHandler) objRememberedValue;
                zChangedInstance = composerStartRestartGroup.changedInstance(composeNavigationEventHandler);
                if ((i3 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i3 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i3 & 7168) == 2048) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((57344 & i3) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((458752 & i3) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i3 & 3670016) == 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (i14 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!(zChangedInstance | z10 | z11 | z12 | z13 | z14 | z15 | z16)) {
                    final boolean z11111112 = z8;
                    final Function0 function11111111111111110 = function11;
                    final Function0 function11111111111111111 = function5;
                    final boolean z11111113 = z4;
                    final Function0 function11111111111111112 = function12;
                    final Function0 function11111111111111113 = function13;
                    composeNavigationEventHandler2 = composeNavigationEventHandler;
                    Function0 function11111111111111114 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z11111112, function11111111111111110, function11111111111111111, z11111113, function11111111111111112, function11111111111111113, navigationEventState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function11111111111111114);
                    objRememberedValue2 = function11111111111111114;
                } else {
                    final boolean z11111114 = z8;
                    final Function0 function11111111111111115 = function11;
                    final Function0 function11111111111111116 = function5;
                    final boolean z11111115 = z4;
                    final Function0 function11111111111111117 = function12;
                    final Function0 function11111111111111118 = function13;
                    composeNavigationEventHandler2 = composeNavigationEventHandler;
                    Function0 function11111111111111119 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z11111114, function11111111111111115, function11111111111111116, z11111115, function11111111111111117, function11111111111111118, navigationEventState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function11111111111111119);
                    objRememberedValue2 = function11111111111111119;
                }
                EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
                if (r27 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zChangedInstance2 = composerStartRestartGroup.changedInstance(composeNavigationEventHandler2);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(r26);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!(zChangedInstance2 | z17 | zChangedInstance3)) {
                    objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                EffectsKt.DisposableEffect(navigationEventState, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, i14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function5;
                z7 = z4;
                function6 = function12;
                z6 = z8;
                function9 = function13;
                function10 = function11;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NavigationEventHandlerKt.NavigationEventHandler$lambda$17(navigationEventState, z6, function10, function8, z7, function6, function9, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 24576;
        z4 = z2;
        i10 = i2 & 32;
        if (i10 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function6 = function2;
        } else {
            function6 = function2;
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
        }
        i12 = i2 & 64;
        if (i12 != 0) {
            i3 |= 1572864;
            function7 = function3;
        } else {
            function7 = function3;
            if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changedInstance(function7)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i3 |= i13;
            }
        }
        if ((i3 & 599187) != 599186) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z5, i3 & 1)) {
            composerStartRestartGroup.skipToGroupEnd();
            z6 = z3;
            z7 = z4;
            function8 = function5;
            Function0<Unit> function1111111111124 = function4;
            function9 = function7;
            function10 = function1111111111124;
        } else {
            if (i15 != 0) {
                z8 = true;
            } else {
                z8 = z3;
            }
            if (i4 != 0) {
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                function11 = (Function0) objRememberedValue7;
            } else {
                function11 = function4;
            }
            if (i6 != 0) {
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                function5 = (Function0) objRememberedValue6;
            }
            if (i8 != 0) {
                z4 = true;
            }
            if (i10 != 0) {
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                function12 = (Function0) objRememberedValue5;
            } else {
                function12 = function6;
            }
            if (i12 != 0) {
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                function13 = (Function0) objRememberedValue4;
            } else {
                function13 = function7;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(898330592, i3, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
            }
            current = LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current != null) {
                throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner".toString());
            }
            navigationEventDispatcher = current.getNavigationEventDispatcher();
            i14 = i3 & 14;
            if (i14 == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z9) {
                ComposeNavigationEventHandler composeNavigationEventHandler1112 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler1112);
                objRememberedValue = composeNavigationEventHandler1112;
            } else {
                ComposeNavigationEventHandler composeNavigationEventHandler1113 = new ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9(navigationEventState, (NavigationEventTransitionState) obj);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(composeNavigationEventHandler1113);
                objRememberedValue = composeNavigationEventHandler1113;
            }
            composeNavigationEventHandler = (ComposeNavigationEventHandler) objRememberedValue;
            zChangedInstance = composerStartRestartGroup.changedInstance(composeNavigationEventHandler);
            if ((i3 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i3 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i3 & 7168) == 2048) {
                z12 = true;
            } else {
                z12 = false;
            }
            if ((57344 & i3) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((458752 & i3) == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((i3 & 3670016) == 1048576) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (i14 == 4) {
                z16 = true;
            } else {
                z16 = false;
            }
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!(zChangedInstance | z10 | z11 | z12 | z13 | z14 | z15 | z16)) {
                final boolean z11111116 = z8;
                final Function0 function111111111111111110 = function11;
                final Function0 function111111111111111111 = function5;
                final boolean z11111117 = z4;
                final Function0 function111111111111111112 = function12;
                final Function0 function111111111111111113 = function13;
                composeNavigationEventHandler2 = composeNavigationEventHandler;
                Function0 function111111111111111114 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z11111116, function111111111111111110, function111111111111111111, z11111117, function111111111111111112, function111111111111111113, navigationEventState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function111111111111111114);
                objRememberedValue2 = function111111111111111114;
            } else {
                final boolean z11111118 = z8;
                final Function0 function111111111111111115 = function11;
                final Function0 function111111111111111116 = function5;
                final boolean z11111119 = z4;
                final Function0 function111111111111111117 = function12;
                final Function0 function111111111111111118 = function13;
                composeNavigationEventHandler2 = composeNavigationEventHandler;
                Function0 function111111111111111119 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NavigationEventHandlerKt.NavigationEventHandler$lambda$12$lambda$11(composeNavigationEventHandler, z11111118, function111111111111111115, function111111111111111116, z11111119, function111111111111111117, function111111111111111118, navigationEventState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function111111111111111119);
                objRememberedValue2 = function111111111111111119;
            }
            EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
            if (r27 == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            zChangedInstance2 = composerStartRestartGroup.changedInstance(composeNavigationEventHandler2);
            zChangedInstance3 = composerStartRestartGroup.changedInstance(r26);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (!(zChangedInstance2 | z17 | zChangedInstance3)) {
                objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NavigationEventHandlerKt.NavigationEventHandler$lambda$16$lambda$15(navigationEventState, composeNavigationEventHandler2, navigationEventDispatcher, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.DisposableEffect(navigationEventState, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, i14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function8 = function5;
            z7 = z4;
            function6 = function12;
            z6 = z8;
            function9 = function13;
            function10 = function11;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NavigationEventHandlerKt.NavigationEventHandler$lambda$17(navigationEventState, z6, function10, function8, z7, function6, function9, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationEventHandler$lambda$10$lambda$9(NavigationEventState navigationEventState, NavigationEventTransitionState navigationEventTransitionState) {
        navigationEventState.setTransitionState$navigationevent_compose(navigationEventTransitionState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationEventHandler$lambda$12$lambda$11(ComposeNavigationEventHandler composeNavigationEventHandler, boolean z, Function0 function0, Function0 function1, boolean z2, Function0 function2, Function0 function3, NavigationEventState navigationEventState) {
        composeNavigationEventHandler.setForwardEnabled(z);
        composeNavigationEventHandler.setCurrentOnForwardCancelled(function0);
        composeNavigationEventHandler.setCurrentOnForwardCompleted(function1);
        composeNavigationEventHandler.setBackEnabled(z2);
        composeNavigationEventHandler.setCurrentOnBackCancelled(function2);
        composeNavigationEventHandler.setCurrentOnBackCompleted(function3);
        composeNavigationEventHandler.setInfo(navigationEventState.getCurrentInfo(), navigationEventState.getBackInfo(), navigationEventState.getForwardInfo());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult NavigationEventHandler$lambda$16$lambda$15(final NavigationEventState navigationEventState, final ComposeNavigationEventHandler composeNavigationEventHandler, NavigationEventDispatcher navigationEventDispatcher, DisposableEffectScope disposableEffectScope) {
        if (navigationEventState.getSourceHandler$navigationevent_compose() != null) {
            StringBuilder sb = new StringBuilder("NavigationEventState '");
            sb.append(navigationEventState);
            sb.append("' is already registered with a NavigationEventHandler '");
            sb.append(composeNavigationEventHandler);
            sb.append("'.");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        ComposeNavigationEventHandler composeNavigationEventHandler2 = composeNavigationEventHandler;
        navigationEventState.setSourceHandler$navigationevent_compose(composeNavigationEventHandler2);
        NavigationEventDispatcher.addHandler$default(navigationEventDispatcher, composeNavigationEventHandler2, 0, 2, null);
        return new DisposableEffectResult() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$NavigationEventHandler$lambda$16$lambda$15$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                composeNavigationEventHandler.remove();
                navigationEventState.setSourceHandler$navigationevent_compose(null);
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:67:0x0105  */
    /* JADX WARN: Code duplicated, block: B:70:0x0110  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void NavigationBackHandler(final NavigationEventState<? extends NavigationEventInfo> navigationEventState, boolean z, Function0<Unit> function0, final Function0<Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        Function0<Unit> function2;
        int i5;
        boolean z3;
        boolean z4;
        final Function0<Unit> function3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function0<Unit> function4;
        Object objRememberedValue;
        Object objRememberedValue2;
        Object objRememberedValue3;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1220469155);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(navigationEventState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    function2 = function0;
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                if ((i3 & 1171) != 1170) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    composerStartRestartGroup.skipToGroupEnd();
                    z4 = z2;
                    function3 = function2;
                } else {
                    if (i7 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i4 != 0) {
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        function4 = (Function0) objRememberedValue3;
                    } else {
                        function4 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1220469155, i3, -1, "androidx.navigationevent.compose.NavigationBackHandler (NavigationEventHandler.kt:146)");
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function5 = (Function0) objRememberedValue;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function6 = (Function0) objRememberedValue2;
                    int i8 = i3 << 9;
                    NavigationEventHandler(navigationEventState, false, function5, function6, z4, function4, function1, composerStartRestartGroup, (i3 & 14) | 3504 | (57344 & i8) | (458752 & i8) | (i8 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function3 = function4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final boolean z5 = z4;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return NavigationEventHandlerKt.NavigationBackHandler$lambda$24(navigationEventState, z5, function3, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 384;
            function2 = function0;
            if ((i & 3072) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                composerStartRestartGroup.skipToGroupEnd();
                z4 = z2;
                function3 = function2;
            } else {
                if (i7 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i4 != 0) {
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    function4 = (Function0) objRememberedValue3;
                } else {
                    function4 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1220469155, i3, -1, "androidx.navigationevent.compose.NavigationBackHandler (NavigationEventHandler.kt:146)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function7 = (Function0) objRememberedValue;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function8 = (Function0) objRememberedValue2;
                int i9 = i3 << 9;
                NavigationEventHandler(navigationEventState, false, function7, function8, z4, function4, function1, composerStartRestartGroup, (i3 & 14) | 3504 | (57344 & i9) | (458752 & i9) | (i9 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final boolean z6 = z4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NavigationEventHandlerKt.NavigationBackHandler$lambda$24(navigationEventState, z6, function3, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        z2 = z;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                function2 = function0;
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                composerStartRestartGroup.skipToGroupEnd();
                z4 = z2;
                function3 = function2;
            } else {
                if (i7 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i4 != 0) {
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    function4 = (Function0) objRememberedValue3;
                } else {
                    function4 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1220469155, i3, -1, "androidx.navigationevent.compose.NavigationBackHandler (NavigationEventHandler.kt:146)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function9 = (Function0) objRememberedValue;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function10 = (Function0) objRememberedValue2;
                int i10 = i3 << 9;
                NavigationEventHandler(navigationEventState, false, function9, function10, z4, function4, function1, composerStartRestartGroup, (i3 & 14) | 3504 | (57344 & i10) | (458752 & i10) | (i10 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final boolean z7 = z4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NavigationEventHandlerKt.NavigationBackHandler$lambda$24(navigationEventState, z7, function3, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        function2 = function0;
        if ((i & 3072) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
            composerStartRestartGroup.skipToGroupEnd();
            z4 = z2;
            function3 = function2;
        } else {
            if (i7 != 0) {
                z4 = true;
            } else {
                z4 = z2;
            }
            if (i4 != 0) {
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                function4 = (Function0) objRememberedValue3;
            } else {
                function4 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1220469155, i3, -1, "androidx.navigationevent.compose.NavigationBackHandler (NavigationEventHandler.kt:146)");
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function11 = (Function0) objRememberedValue;
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function12 = (Function0) objRememberedValue2;
            int i11 = i3 << 9;
            NavigationEventHandler(navigationEventState, false, function11, function12, z4, function4, function1, composerStartRestartGroup, (i3 & 14) | 3504 | (57344 & i11) | (458752 & i11) | (i11 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function3 = function4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z8 = z4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NavigationEventHandlerKt.NavigationBackHandler$lambda$24(navigationEventState, z8, function3, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:67:0x0101  */
    /* JADX WARN: Code duplicated, block: B:70:0x010c  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void NavigationForwardHandler(final NavigationEventState<? extends NavigationEventInfo> navigationEventState, boolean z, Function0<Unit> function0, final Function0<Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        Function0<Unit> function2;
        int i5;
        boolean z3;
        boolean z4;
        final Function0<Unit> function3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function0<Unit> function4;
        Object objRememberedValue;
        Object objRememberedValue2;
        Object objRememberedValue3;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1737636087);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(navigationEventState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    function2 = function0;
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                if ((i3 & 1171) != 1170) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    composerStartRestartGroup.skipToGroupEnd();
                    z4 = z2;
                    function3 = function2;
                } else {
                    if (i7 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i4 != 0) {
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        function4 = (Function0) objRememberedValue3;
                    } else {
                        function4 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1737636087, i3, -1, "androidx.navigationevent.compose.NavigationForwardHandler (NavigationEventHandler.kt:181)");
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function5 = (Function0) objRememberedValue;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    NavigationEventHandler(navigationEventState, z4, function4, function1, false, function5, (Function0) objRememberedValue2, composerStartRestartGroup, (i3 & 14) | 1794048 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function3 = function4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final boolean z5 = z4;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return NavigationEventHandlerKt.NavigationForwardHandler$lambda$31(navigationEventState, z5, function3, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 384;
            function2 = function0;
            if ((i & 3072) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                composerStartRestartGroup.skipToGroupEnd();
                z4 = z2;
                function3 = function2;
            } else {
                if (i7 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i4 != 0) {
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    function4 = (Function0) objRememberedValue3;
                } else {
                    function4 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1737636087, i3, -1, "androidx.navigationevent.compose.NavigationForwardHandler (NavigationEventHandler.kt:181)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function6 = (Function0) objRememberedValue;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                NavigationEventHandler(navigationEventState, z4, function4, function1, false, function6, (Function0) objRememberedValue2, composerStartRestartGroup, (i3 & 14) | 1794048 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final boolean z6 = z4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NavigationEventHandlerKt.NavigationForwardHandler$lambda$31(navigationEventState, z6, function3, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        z2 = z;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                function2 = function0;
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                composerStartRestartGroup.skipToGroupEnd();
                z4 = z2;
                function3 = function2;
            } else {
                if (i7 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i4 != 0) {
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    function4 = (Function0) objRememberedValue3;
                } else {
                    function4 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1737636087, i3, -1, "androidx.navigationevent.compose.NavigationForwardHandler (NavigationEventHandler.kt:181)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function7 = (Function0) objRememberedValue;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                NavigationEventHandler(navigationEventState, z4, function4, function1, false, function7, (Function0) objRememberedValue2, composerStartRestartGroup, (i3 & 14) | 1794048 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final boolean z7 = z4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NavigationEventHandlerKt.NavigationForwardHandler$lambda$31(navigationEventState, z7, function3, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        function2 = function0;
        if ((i & 3072) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
            composerStartRestartGroup.skipToGroupEnd();
            z4 = z2;
            function3 = function2;
        } else {
            if (i7 != 0) {
                z4 = true;
            } else {
                z4 = z2;
            }
            if (i4 != 0) {
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                function4 = (Function0) objRememberedValue3;
            } else {
                function4 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1737636087, i3, -1, "androidx.navigationevent.compose.NavigationForwardHandler (NavigationEventHandler.kt:181)");
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function8 = (Function0) objRememberedValue;
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            NavigationEventHandler(navigationEventState, z4, function4, function1, false, function8, (Function0) objRememberedValue2, composerStartRestartGroup, (i3 & 14) | 1794048 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function3 = function4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z8 = z4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NavigationEventHandlerKt.NavigationForwardHandler$lambda$31(navigationEventState, z8, function3, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationBackHandler$lambda$24(NavigationEventState navigationEventState, boolean z, Function0 function0, Function0 function1, int i, int i2, Composer composer, int i3) {
        NavigationBackHandler(navigationEventState, z, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationEventHandler$lambda$17(NavigationEventState navigationEventState, boolean z, Function0 function0, Function0 function1, boolean z2, Function0 function2, Function0 function3, int i, int i2, Composer composer, int i3) {
        NavigationEventHandler(navigationEventState, z, function0, function1, z2, function2, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationForwardHandler$lambda$31(NavigationEventState navigationEventState, boolean z, Function0 function0, Function0 function1, int i, int i2, Composer composer, int i3) {
        NavigationForwardHandler(navigationEventState, z, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }
}
