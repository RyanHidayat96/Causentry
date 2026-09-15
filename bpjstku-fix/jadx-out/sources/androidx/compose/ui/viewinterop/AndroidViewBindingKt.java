package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewbinding.R;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.ViewKt;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a\u0089\u0001\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032K\u0010\u0004\u001aG\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001aÁ\u0001\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032K\u0010\u0004\u001aG\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u001b\b\u0002\u0010\u0014\u001a\u0015\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011¢\u0006\u0002\b\u00122\u0019\b\u0002\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u00122\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0016\u001a#\u0010\u0017\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00182\u0006\u0010\u0019\u001a\u0002H\u0002H\u0002¢\u0006\u0002\u0010\u001a\u001a\u001b\u0010\u001b\u001a\u0002H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0018H\u0002¢\u0006\u0002\u0010\u001c\u001a$\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\n2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00010\u0011H\u0002¨\u0006!"}, d2 = {"AndroidViewBinding", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/viewbinding/ViewBinding;", "factory", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Lkotlin/ParameterName;", "name", "inflater", "Landroid/view/ViewGroup;", "parent", "", "attachToParent", "modifier", "Landroidx/compose/ui/Modifier;", "update", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "onReset", "onRelease", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "setBinding", "Landroid/view/View;", "binding", "(Landroid/view/View;Landroidx/viewbinding/ViewBinding;)V", "getBinding", "(Landroid/view/View;)Landroidx/viewbinding/ViewBinding;", "forEachFragmentContainerView", "viewGroup", "action", "Landroidx/fragment/app/FragmentContainerView;", "ui-viewbinding_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AndroidViewBindingKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AndroidViewBinding$lambda$1$lambda$0(ViewBinding viewBinding) {
        return Unit.INSTANCE;
    }

    public static final <T extends ViewBinding> void AndroidViewBinding(final Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> function3, Modifier modifier, Function1<? super T, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1985291610);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (!composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$1$lambda$0((ViewBinding) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function1 = (Function1) objRememberedValue;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1985291610, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:77)");
            }
            AndroidViewBinding(function3, modifier, null, null, function1, composerStartRestartGroup, (i3 & 14) | 384 | (i3 & 112) | ((i3 << 6) & 57344), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        final Function1<? super T, Unit> function2 = function1;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AndroidViewBindingKt.AndroidViewBinding$lambda$2(function3, modifier2, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AndroidViewBinding$lambda$4$lambda$3(ViewBinding viewBinding) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AndroidViewBinding$lambda$6$lambda$5(ViewBinding viewBinding) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0158  */
    /* JADX WARN: Code duplicated, block: B:103:0x0160  */
    /* JADX WARN: Code duplicated, block: B:105:0x0170  */
    /* JADX WARN: Code duplicated, block: B:107:0x0178  */
    /* JADX WARN: Code duplicated, block: B:111:0x018c  */
    /* JADX WARN: Code duplicated, block: B:112:0x018f  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:120:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:125:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:128:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:130:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:133:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:135:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x010f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0137  */
    /* JADX WARN: Code duplicated, block: B:94:0x013a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0143  */
    /* JADX WARN: Code duplicated, block: B:99:0x014b  */
    public static final <T extends ViewBinding> void AndroidViewBinding(final Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> function3, Modifier modifier, Function1<? super T, Unit> function1, Function1<? super T, Unit> function2, Function1<? super T, Unit> function4, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super T, Unit> function5;
        int i5;
        int i6;
        final Function1<? super T, Unit> function6;
        int i7;
        int i8;
        final Function1<? super T, Unit> function7;
        int i9;
        boolean z;
        Modifier.Companion companion;
        final Function1<? super T, Unit> function8;
        final Function1<? super T, Unit> function9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Function1<? super T, Unit> function10;
        View view;
        boolean zChanged;
        Object objRememberedValue;
        final Fragment fragment;
        final Context context;
        boolean zChangedInstance;
        boolean z2;
        Object objRememberedValue2;
        boolean zChanged2;
        Object objRememberedValue3;
        Function1 function11;
        boolean z3;
        boolean zChangedInstance2;
        boolean zChangedInstance3;
        Object objRememberedValue4;
        boolean z4;
        Object objRememberedValue5;
        Object objRememberedValue6;
        Object objRememberedValue7;
        Composer composerStartRestartGroup = composer.startRestartGroup(509101952);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    function5 = function1;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        function6 = function2;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            function7 = function4;
                            if (composerStartRestartGroup.changedInstance(function7)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        if ((i3 & 9363) != 9362) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                            composerStartRestartGroup.skipToGroupEnd();
                            companion = modifier2;
                            function8 = function5;
                            function9 = function6;
                        } else {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i4 != 0) {
                                function10 = null;
                            } else {
                                function10 = function5;
                            }
                            if (i6 != 0) {
                                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue7 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return AndroidViewBindingKt.AndroidViewBinding$lambda$4$lambda$3((ViewBinding) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                }
                                function6 = (Function1) objRememberedValue7;
                            }
                            if (i8 != 0) {
                                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return AndroidViewBindingKt.AndroidViewBinding$lambda$6$lambda$5((ViewBinding) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                }
                                function7 = (Function1) objRememberedValue6;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                            }
                            view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                            zChanged = composerStartRestartGroup.changed(view);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                try {
                                    objRememberedValue = ViewKt.findFragment(view);
                                } catch (IllegalStateException unused) {
                                    objRememberedValue = null;
                                }
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            fragment = (Fragment) objRememberedValue;
                            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            zChangedInstance = composerStartRestartGroup.changedInstance(fragment);
                            if ((i3 & 14) == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!(z2 | zChangedInstance) || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            Function1 function12 = (Function1) objRememberedValue2;
                            if (function10 == null) {
                                composerStartRestartGroup.startReplaceGroup(1128086696);
                                function11 = null;
                            } else {
                                composerStartRestartGroup.startReplaceGroup(1128086697);
                                zChanged2 = composerStartRestartGroup.changed(function10);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                function11 = (Function1) objRememberedValue3;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if ((i3 & 7168) == 2048) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(fragment);
                            zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!(z3 | zChangedInstance2 | zChangedInstance3) || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            Function1 function13 = (Function1) objRememberedValue4;
                            z4 = (57344 & i3) == 16384;
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (!z4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            Function1<? super T, Unit> function14 = function6;
                            Function1<? super T, Unit> function15 = function10;
                            AndroidView_androidKt.AndroidView(function12, companion, function11, function13, (Function1) objRememberedValue5, composerStartRestartGroup, i3 & 112, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function15;
                            function9 = function14;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier3 = companion;
                            final Function1<? super T, Unit> function16 = function7;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$21(function3, modifier3, function8, function9, function16, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 24576;
                    function7 = function4;
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                        composerStartRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        function8 = function5;
                        function9 = function6;
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i4 != 0) {
                            function10 = null;
                        } else {
                            function10 = function5;
                        }
                        if (i6 != 0) {
                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AndroidViewBindingKt.AndroidViewBinding$lambda$4$lambda$3((ViewBinding) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            }
                            function6 = (Function1) objRememberedValue7;
                        }
                        if (i8 != 0) {
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AndroidViewBindingKt.AndroidViewBinding$lambda$6$lambda$5((ViewBinding) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            function7 = (Function1) objRememberedValue6;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                        }
                        view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                        zChanged = composerStartRestartGroup.changed(view);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = ViewKt.findFragment(view);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = ViewKt.findFragment(view);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        fragment = (Fragment) objRememberedValue;
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        zChangedInstance = composerStartRestartGroup.changedInstance(fragment);
                        if ((i3 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!(z2 | zChangedInstance)) {
                            objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        Function1 function17 = (Function1) objRememberedValue2;
                        if (function10 == null) {
                            composerStartRestartGroup.startReplaceGroup(1128086696);
                            function11 = null;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(1128086697);
                            zChanged2 = composerStartRestartGroup.changed(function10);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            function11 = (Function1) objRememberedValue3;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        if ((i3 & 7168) == 2048) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(fragment);
                        zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!(z3 | zChangedInstance2 | zChangedInstance3)) {
                            objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        Function1 function18 = (Function1) objRememberedValue4;
                        if ((57344 & i3) == 16384) {
                        }
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (!z4) {
                            objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        Function1<? super T, Unit> function19 = function6;
                        Function1<? super T, Unit> function110 = function10;
                        AndroidView_androidKt.AndroidView(function17, companion, function11, function18, (Function1) objRememberedValue5, composerStartRestartGroup, i3 & 112, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function110;
                        function9 = function19;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier4 = companion;
                        final Function1 function111 = function7;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$21(function3, modifier4, function8, function9, function111, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 3072;
                function6 = function2;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        function7 = function4;
                        if (composerStartRestartGroup.changedInstance(function7)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                        composerStartRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        function8 = function5;
                        function9 = function6;
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i4 != 0) {
                            function10 = null;
                        } else {
                            function10 = function5;
                        }
                        if (i6 != 0) {
                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AndroidViewBindingKt.AndroidViewBinding$lambda$4$lambda$3((ViewBinding) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            }
                            function6 = (Function1) objRememberedValue7;
                        }
                        if (i8 != 0) {
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AndroidViewBindingKt.AndroidViewBinding$lambda$6$lambda$5((ViewBinding) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            function7 = (Function1) objRememberedValue6;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                        }
                        view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                        zChanged = composerStartRestartGroup.changed(view);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = ViewKt.findFragment(view);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = ViewKt.findFragment(view);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        fragment = (Fragment) objRememberedValue;
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        zChangedInstance = composerStartRestartGroup.changedInstance(fragment);
                        if ((i3 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!(z2 | zChangedInstance)) {
                            objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        Function1 function112 = (Function1) objRememberedValue2;
                        if (function10 == null) {
                            composerStartRestartGroup.startReplaceGroup(1128086696);
                            function11 = null;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(1128086697);
                            zChanged2 = composerStartRestartGroup.changed(function10);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            function11 = (Function1) objRememberedValue3;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        if ((i3 & 7168) == 2048) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(fragment);
                        zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!(z3 | zChangedInstance2 | zChangedInstance3)) {
                            objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        Function1 function113 = (Function1) objRememberedValue4;
                        if ((57344 & i3) == 16384) {
                        }
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (!z4) {
                            objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        Function1<? super T, Unit> function114 = function6;
                        Function1<? super T, Unit> function115 = function10;
                        AndroidView_androidKt.AndroidView(function112, companion, function11, function113, (Function1) objRememberedValue5, composerStartRestartGroup, i3 & 112, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function115;
                        function9 = function114;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier5 = companion;
                        final Function1 function116 = function7;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$21(function3, modifier5, function8, function9, function116, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 24576;
                function7 = function4;
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                    composerStartRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    function8 = function5;
                    function9 = function6;
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        function10 = null;
                    } else {
                        function10 = function5;
                    }
                    if (i6 != 0) {
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$4$lambda$3((ViewBinding) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        function6 = (Function1) objRememberedValue7;
                    }
                    if (i8 != 0) {
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$6$lambda$5((ViewBinding) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        function7 = (Function1) objRememberedValue6;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                    }
                    view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    zChanged = composerStartRestartGroup.changed(view);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = ViewKt.findFragment(view);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = ViewKt.findFragment(view);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    fragment = (Fragment) objRememberedValue;
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    zChangedInstance = composerStartRestartGroup.changedInstance(fragment);
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(z2 | zChangedInstance)) {
                        objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Function1 function117 = (Function1) objRememberedValue2;
                    if (function10 == null) {
                        composerStartRestartGroup.startReplaceGroup(1128086696);
                        function11 = null;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1128086697);
                        zChanged2 = composerStartRestartGroup.changed(function10);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        function11 = (Function1) objRememberedValue3;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if ((i3 & 7168) == 2048) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(fragment);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!(z3 | zChangedInstance2 | zChangedInstance3)) {
                        objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    Function1 function118 = (Function1) objRememberedValue4;
                    if ((57344 & i3) == 16384) {
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (!z4) {
                        objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    Function1<? super T, Unit> function119 = function6;
                    Function1<? super T, Unit> function1110 = function10;
                    AndroidView_androidKt.AndroidView(function117, companion, function11, function118, (Function1) objRememberedValue5, composerStartRestartGroup, i3 & 112, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function1110;
                    function9 = function119;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier6 = companion;
                    final Function1 function1111 = function7;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$21(function3, modifier6, function8, function9, function1111, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 384;
            function5 = function1;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    function6 = function2;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        function7 = function4;
                        if (composerStartRestartGroup.changedInstance(function7)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                        composerStartRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        function8 = function5;
                        function9 = function6;
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i4 != 0) {
                            function10 = null;
                        } else {
                            function10 = function5;
                        }
                        if (i6 != 0) {
                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AndroidViewBindingKt.AndroidViewBinding$lambda$4$lambda$3((ViewBinding) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            }
                            function6 = (Function1) objRememberedValue7;
                        }
                        if (i8 != 0) {
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AndroidViewBindingKt.AndroidViewBinding$lambda$6$lambda$5((ViewBinding) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            function7 = (Function1) objRememberedValue6;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                        }
                        view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                        zChanged = composerStartRestartGroup.changed(view);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = ViewKt.findFragment(view);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = ViewKt.findFragment(view);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        fragment = (Fragment) objRememberedValue;
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        zChangedInstance = composerStartRestartGroup.changedInstance(fragment);
                        if ((i3 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!(z2 | zChangedInstance)) {
                            objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        Function1 function1112 = (Function1) objRememberedValue2;
                        if (function10 == null) {
                            composerStartRestartGroup.startReplaceGroup(1128086696);
                            function11 = null;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(1128086697);
                            zChanged2 = composerStartRestartGroup.changed(function10);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            function11 = (Function1) objRememberedValue3;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        if ((i3 & 7168) == 2048) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(fragment);
                        zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!(z3 | zChangedInstance2 | zChangedInstance3)) {
                            objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        Function1 function1113 = (Function1) objRememberedValue4;
                        if ((57344 & i3) == 16384) {
                        }
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (!z4) {
                            objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        Function1<? super T, Unit> function1114 = function6;
                        Function1<? super T, Unit> function1115 = function10;
                        AndroidView_androidKt.AndroidView(function1112, companion, function11, function1113, (Function1) objRememberedValue5, composerStartRestartGroup, i3 & 112, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function1115;
                        function9 = function1114;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier7 = companion;
                        final Function1 function1116 = function7;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$21(function3, modifier7, function8, function9, function1116, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 24576;
                function7 = function4;
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                    composerStartRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    function8 = function5;
                    function9 = function6;
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        function10 = null;
                    } else {
                        function10 = function5;
                    }
                    if (i6 != 0) {
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$4$lambda$3((ViewBinding) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        function6 = (Function1) objRememberedValue7;
                    }
                    if (i8 != 0) {
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$6$lambda$5((ViewBinding) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        function7 = (Function1) objRememberedValue6;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                    }
                    view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    zChanged = composerStartRestartGroup.changed(view);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = ViewKt.findFragment(view);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = ViewKt.findFragment(view);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    fragment = (Fragment) objRememberedValue;
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    zChangedInstance = composerStartRestartGroup.changedInstance(fragment);
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(z2 | zChangedInstance)) {
                        objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Function1 function1117 = (Function1) objRememberedValue2;
                    if (function10 == null) {
                        composerStartRestartGroup.startReplaceGroup(1128086696);
                        function11 = null;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1128086697);
                        zChanged2 = composerStartRestartGroup.changed(function10);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        function11 = (Function1) objRememberedValue3;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if ((i3 & 7168) == 2048) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(fragment);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!(z3 | zChangedInstance2 | zChangedInstance3)) {
                        objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    Function1 function1118 = (Function1) objRememberedValue4;
                    if ((57344 & i3) == 16384) {
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (!z4) {
                        objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    Function1<? super T, Unit> function1119 = function6;
                    Function1<? super T, Unit> function11110 = function10;
                    AndroidView_androidKt.AndroidView(function1117, companion, function11, function1118, (Function1) objRememberedValue5, composerStartRestartGroup, i3 & 112, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function11110;
                    function9 = function1119;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier8 = companion;
                    final Function1 function11111 = function7;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$21(function3, modifier8, function8, function9, function11111, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            function6 = function2;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    function7 = function4;
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                    composerStartRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    function8 = function5;
                    function9 = function6;
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        function10 = null;
                    } else {
                        function10 = function5;
                    }
                    if (i6 != 0) {
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$4$lambda$3((ViewBinding) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        function6 = (Function1) objRememberedValue7;
                    }
                    if (i8 != 0) {
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$6$lambda$5((ViewBinding) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        function7 = (Function1) objRememberedValue6;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                    }
                    view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    zChanged = composerStartRestartGroup.changed(view);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = ViewKt.findFragment(view);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = ViewKt.findFragment(view);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    fragment = (Fragment) objRememberedValue;
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    zChangedInstance = composerStartRestartGroup.changedInstance(fragment);
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(z2 | zChangedInstance)) {
                        objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Function1 function11112 = (Function1) objRememberedValue2;
                    if (function10 == null) {
                        composerStartRestartGroup.startReplaceGroup(1128086696);
                        function11 = null;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1128086697);
                        zChanged2 = composerStartRestartGroup.changed(function10);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        function11 = (Function1) objRememberedValue3;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if ((i3 & 7168) == 2048) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(fragment);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!(z3 | zChangedInstance2 | zChangedInstance3)) {
                        objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    Function1 function11113 = (Function1) objRememberedValue4;
                    if ((57344 & i3) == 16384) {
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (!z4) {
                        objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    Function1<? super T, Unit> function11114 = function6;
                    Function1<? super T, Unit> function11115 = function10;
                    AndroidView_androidKt.AndroidView(function11112, companion, function11, function11113, (Function1) objRememberedValue5, composerStartRestartGroup, i3 & 112, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function11115;
                    function9 = function11114;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier9 = companion;
                    final Function1 function11116 = function7;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$21(function3, modifier9, function8, function9, function11116, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            function7 = function4;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                composerStartRestartGroup.skipToGroupEnd();
                companion = modifier2;
                function8 = function5;
                function9 = function6;
            } else {
                if (i10 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i4 != 0) {
                    function10 = null;
                } else {
                    function10 = function5;
                }
                if (i6 != 0) {
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$4$lambda$3((ViewBinding) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    function6 = (Function1) objRememberedValue7;
                }
                if (i8 != 0) {
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$6$lambda$5((ViewBinding) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    function7 = (Function1) objRememberedValue6;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                }
                view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                zChanged = composerStartRestartGroup.changed(view);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = ViewKt.findFragment(view);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = ViewKt.findFragment(view);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                fragment = (Fragment) objRememberedValue;
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                zChangedInstance = composerStartRestartGroup.changedInstance(fragment);
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!(z2 | zChangedInstance)) {
                    objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function1 function11117 = (Function1) objRememberedValue2;
                if (function10 == null) {
                    composerStartRestartGroup.startReplaceGroup(1128086696);
                    function11 = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1128086697);
                    zChanged2 = composerStartRestartGroup.changed(function10);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2) {
                        objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    function11 = (Function1) objRememberedValue3;
                }
                composerStartRestartGroup.endReplaceGroup();
                if ((i3 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zChangedInstance2 = composerStartRestartGroup.changedInstance(fragment);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!(z3 | zChangedInstance2 | zChangedInstance3)) {
                    objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Function1 function11118 = (Function1) objRememberedValue4;
                if ((57344 & i3) == 16384) {
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!z4) {
                    objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Function1<? super T, Unit> function11119 = function6;
                Function1<? super T, Unit> function111110 = function10;
                AndroidView_androidKt.AndroidView(function11117, companion, function11, function11118, (Function1) objRememberedValue5, composerStartRestartGroup, i3 & 112, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function111110;
                function9 = function11119;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier10 = companion;
                final Function1 function111111 = function7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AndroidViewBindingKt.AndroidViewBinding$lambda$21(function3, modifier10, function8, function9, function111111, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                function5 = function1;
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    function6 = function2;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        function7 = function4;
                        if (composerStartRestartGroup.changedInstance(function7)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                        composerStartRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        function8 = function5;
                        function9 = function6;
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i4 != 0) {
                            function10 = null;
                        } else {
                            function10 = function5;
                        }
                        if (i6 != 0) {
                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AndroidViewBindingKt.AndroidViewBinding$lambda$4$lambda$3((ViewBinding) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            }
                            function6 = (Function1) objRememberedValue7;
                        }
                        if (i8 != 0) {
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AndroidViewBindingKt.AndroidViewBinding$lambda$6$lambda$5((ViewBinding) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            function7 = (Function1) objRememberedValue6;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                        }
                        view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                        zChanged = composerStartRestartGroup.changed(view);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = ViewKt.findFragment(view);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = ViewKt.findFragment(view);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        fragment = (Fragment) objRememberedValue;
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        zChangedInstance = composerStartRestartGroup.changedInstance(fragment);
                        if ((i3 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!(z2 | zChangedInstance)) {
                            objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        Function1 function111112 = (Function1) objRememberedValue2;
                        if (function10 == null) {
                            composerStartRestartGroup.startReplaceGroup(1128086696);
                            function11 = null;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(1128086697);
                            zChanged2 = composerStartRestartGroup.changed(function10);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            function11 = (Function1) objRememberedValue3;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        if ((i3 & 7168) == 2048) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(fragment);
                        zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!(z3 | zChangedInstance2 | zChangedInstance3)) {
                            objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        Function1 function111113 = (Function1) objRememberedValue4;
                        if ((57344 & i3) == 16384) {
                        }
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (!z4) {
                            objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        Function1<? super T, Unit> function111114 = function6;
                        Function1<? super T, Unit> function111115 = function10;
                        AndroidView_androidKt.AndroidView(function111112, companion, function11, function111113, (Function1) objRememberedValue5, composerStartRestartGroup, i3 & 112, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function111115;
                        function9 = function111114;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier11 = companion;
                        final Function1 function111116 = function7;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$21(function3, modifier11, function8, function9, function111116, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 24576;
                function7 = function4;
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                    composerStartRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    function8 = function5;
                    function9 = function6;
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        function10 = null;
                    } else {
                        function10 = function5;
                    }
                    if (i6 != 0) {
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$4$lambda$3((ViewBinding) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        function6 = (Function1) objRememberedValue7;
                    }
                    if (i8 != 0) {
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$6$lambda$5((ViewBinding) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        function7 = (Function1) objRememberedValue6;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                    }
                    view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    zChanged = composerStartRestartGroup.changed(view);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = ViewKt.findFragment(view);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = ViewKt.findFragment(view);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    fragment = (Fragment) objRememberedValue;
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    zChangedInstance = composerStartRestartGroup.changedInstance(fragment);
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(z2 | zChangedInstance)) {
                        objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Function1 function111117 = (Function1) objRememberedValue2;
                    if (function10 == null) {
                        composerStartRestartGroup.startReplaceGroup(1128086696);
                        function11 = null;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1128086697);
                        zChanged2 = composerStartRestartGroup.changed(function10);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        function11 = (Function1) objRememberedValue3;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if ((i3 & 7168) == 2048) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(fragment);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!(z3 | zChangedInstance2 | zChangedInstance3)) {
                        objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    Function1 function111118 = (Function1) objRememberedValue4;
                    if ((57344 & i3) == 16384) {
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (!z4) {
                        objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    Function1<? super T, Unit> function111119 = function6;
                    Function1<? super T, Unit> function1111110 = function10;
                    AndroidView_androidKt.AndroidView(function111117, companion, function11, function111118, (Function1) objRememberedValue5, composerStartRestartGroup, i3 & 112, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function1111110;
                    function9 = function111119;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier12 = companion;
                    final Function1 function1111111 = function7;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$21(function3, modifier12, function8, function9, function1111111, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            function6 = function2;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    function7 = function4;
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                    composerStartRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    function8 = function5;
                    function9 = function6;
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        function10 = null;
                    } else {
                        function10 = function5;
                    }
                    if (i6 != 0) {
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$4$lambda$3((ViewBinding) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        function6 = (Function1) objRememberedValue7;
                    }
                    if (i8 != 0) {
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$6$lambda$5((ViewBinding) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        function7 = (Function1) objRememberedValue6;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                    }
                    view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    zChanged = composerStartRestartGroup.changed(view);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = ViewKt.findFragment(view);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = ViewKt.findFragment(view);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    fragment = (Fragment) objRememberedValue;
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    zChangedInstance = composerStartRestartGroup.changedInstance(fragment);
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(z2 | zChangedInstance)) {
                        objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Function1 function1111112 = (Function1) objRememberedValue2;
                    if (function10 == null) {
                        composerStartRestartGroup.startReplaceGroup(1128086696);
                        function11 = null;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1128086697);
                        zChanged2 = composerStartRestartGroup.changed(function10);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        function11 = (Function1) objRememberedValue3;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if ((i3 & 7168) == 2048) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(fragment);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!(z3 | zChangedInstance2 | zChangedInstance3)) {
                        objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    Function1 function1111113 = (Function1) objRememberedValue4;
                    if ((57344 & i3) == 16384) {
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (!z4) {
                        objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    Function1<? super T, Unit> function1111114 = function6;
                    Function1<? super T, Unit> function1111115 = function10;
                    AndroidView_androidKt.AndroidView(function1111112, companion, function11, function1111113, (Function1) objRememberedValue5, composerStartRestartGroup, i3 & 112, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function1111115;
                    function9 = function1111114;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier13 = companion;
                    final Function1 function1111116 = function7;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$21(function3, modifier13, function8, function9, function1111116, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            function7 = function4;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                composerStartRestartGroup.skipToGroupEnd();
                companion = modifier2;
                function8 = function5;
                function9 = function6;
            } else {
                if (i10 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i4 != 0) {
                    function10 = null;
                } else {
                    function10 = function5;
                }
                if (i6 != 0) {
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$4$lambda$3((ViewBinding) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    function6 = (Function1) objRememberedValue7;
                }
                if (i8 != 0) {
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$6$lambda$5((ViewBinding) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    function7 = (Function1) objRememberedValue6;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                }
                view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                zChanged = composerStartRestartGroup.changed(view);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = ViewKt.findFragment(view);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = ViewKt.findFragment(view);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                fragment = (Fragment) objRememberedValue;
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                zChangedInstance = composerStartRestartGroup.changedInstance(fragment);
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!(z2 | zChangedInstance)) {
                    objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function1 function1111117 = (Function1) objRememberedValue2;
                if (function10 == null) {
                    composerStartRestartGroup.startReplaceGroup(1128086696);
                    function11 = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1128086697);
                    zChanged2 = composerStartRestartGroup.changed(function10);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2) {
                        objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    function11 = (Function1) objRememberedValue3;
                }
                composerStartRestartGroup.endReplaceGroup();
                if ((i3 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zChangedInstance2 = composerStartRestartGroup.changedInstance(fragment);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!(z3 | zChangedInstance2 | zChangedInstance3)) {
                    objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Function1 function1111118 = (Function1) objRememberedValue4;
                if ((57344 & i3) == 16384) {
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!z4) {
                    objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Function1<? super T, Unit> function1111119 = function6;
                Function1<? super T, Unit> function11111110 = function10;
                AndroidView_androidKt.AndroidView(function1111117, companion, function11, function1111118, (Function1) objRememberedValue5, composerStartRestartGroup, i3 & 112, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function11111110;
                function9 = function1111119;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier14 = companion;
                final Function1 function11111111 = function7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AndroidViewBindingKt.AndroidViewBinding$lambda$21(function3, modifier14, function8, function9, function11111111, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        function5 = function1;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                function6 = function2;
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    function7 = function4;
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                    composerStartRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    function8 = function5;
                    function9 = function6;
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        function10 = null;
                    } else {
                        function10 = function5;
                    }
                    if (i6 != 0) {
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$4$lambda$3((ViewBinding) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        function6 = (Function1) objRememberedValue7;
                    }
                    if (i8 != 0) {
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$6$lambda$5((ViewBinding) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        function7 = (Function1) objRememberedValue6;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                    }
                    view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    zChanged = composerStartRestartGroup.changed(view);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = ViewKt.findFragment(view);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = ViewKt.findFragment(view);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    fragment = (Fragment) objRememberedValue;
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    zChangedInstance = composerStartRestartGroup.changedInstance(fragment);
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(z2 | zChangedInstance)) {
                        objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Function1 function11111112 = (Function1) objRememberedValue2;
                    if (function10 == null) {
                        composerStartRestartGroup.startReplaceGroup(1128086696);
                        function11 = null;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1128086697);
                        zChanged2 = composerStartRestartGroup.changed(function10);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        function11 = (Function1) objRememberedValue3;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if ((i3 & 7168) == 2048) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(fragment);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!(z3 | zChangedInstance2 | zChangedInstance3)) {
                        objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    Function1 function11111113 = (Function1) objRememberedValue4;
                    if ((57344 & i3) == 16384) {
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (!z4) {
                        objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    Function1<? super T, Unit> function11111114 = function6;
                    Function1<? super T, Unit> function11111115 = function10;
                    AndroidView_androidKt.AndroidView(function11111112, companion, function11, function11111113, (Function1) objRememberedValue5, composerStartRestartGroup, i3 & 112, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function11111115;
                    function9 = function11111114;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier15 = companion;
                    final Function1 function11111116 = function7;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$21(function3, modifier15, function8, function9, function11111116, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            function7 = function4;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                composerStartRestartGroup.skipToGroupEnd();
                companion = modifier2;
                function8 = function5;
                function9 = function6;
            } else {
                if (i10 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i4 != 0) {
                    function10 = null;
                } else {
                    function10 = function5;
                }
                if (i6 != 0) {
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$4$lambda$3((ViewBinding) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    function6 = (Function1) objRememberedValue7;
                }
                if (i8 != 0) {
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$6$lambda$5((ViewBinding) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    function7 = (Function1) objRememberedValue6;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                }
                view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                zChanged = composerStartRestartGroup.changed(view);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = ViewKt.findFragment(view);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = ViewKt.findFragment(view);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                fragment = (Fragment) objRememberedValue;
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                zChangedInstance = composerStartRestartGroup.changedInstance(fragment);
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!(z2 | zChangedInstance)) {
                    objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function1 function11111117 = (Function1) objRememberedValue2;
                if (function10 == null) {
                    composerStartRestartGroup.startReplaceGroup(1128086696);
                    function11 = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1128086697);
                    zChanged2 = composerStartRestartGroup.changed(function10);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2) {
                        objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    function11 = (Function1) objRememberedValue3;
                }
                composerStartRestartGroup.endReplaceGroup();
                if ((i3 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zChangedInstance2 = composerStartRestartGroup.changedInstance(fragment);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!(z3 | zChangedInstance2 | zChangedInstance3)) {
                    objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Function1 function11111118 = (Function1) objRememberedValue4;
                if ((57344 & i3) == 16384) {
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!z4) {
                    objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Function1<? super T, Unit> function11111119 = function6;
                Function1<? super T, Unit> function111111110 = function10;
                AndroidView_androidKt.AndroidView(function11111117, companion, function11, function11111118, (Function1) objRememberedValue5, composerStartRestartGroup, i3 & 112, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function111111110;
                function9 = function11111119;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier16 = companion;
                final Function1 function111111111 = function7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AndroidViewBindingKt.AndroidViewBinding$lambda$21(function3, modifier16, function8, function9, function111111111, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        function6 = function2;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                function7 = function4;
                if (composerStartRestartGroup.changedInstance(function7)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                composerStartRestartGroup.skipToGroupEnd();
                companion = modifier2;
                function8 = function5;
                function9 = function6;
            } else {
                if (i10 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i4 != 0) {
                    function10 = null;
                } else {
                    function10 = function5;
                }
                if (i6 != 0) {
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$4$lambda$3((ViewBinding) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    function6 = (Function1) objRememberedValue7;
                }
                if (i8 != 0) {
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$6$lambda$5((ViewBinding) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    function7 = (Function1) objRememberedValue6;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                }
                view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                zChanged = composerStartRestartGroup.changed(view);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = ViewKt.findFragment(view);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = ViewKt.findFragment(view);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                fragment = (Fragment) objRememberedValue;
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                zChangedInstance = composerStartRestartGroup.changedInstance(fragment);
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!(z2 | zChangedInstance)) {
                    objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function1 function111111112 = (Function1) objRememberedValue2;
                if (function10 == null) {
                    composerStartRestartGroup.startReplaceGroup(1128086696);
                    function11 = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1128086697);
                    zChanged2 = composerStartRestartGroup.changed(function10);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2) {
                        objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    function11 = (Function1) objRememberedValue3;
                }
                composerStartRestartGroup.endReplaceGroup();
                if ((i3 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zChangedInstance2 = composerStartRestartGroup.changedInstance(fragment);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!(z3 | zChangedInstance2 | zChangedInstance3)) {
                    objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Function1 function111111113 = (Function1) objRememberedValue4;
                if ((57344 & i3) == 16384) {
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!z4) {
                    objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Function1<? super T, Unit> function111111114 = function6;
                Function1<? super T, Unit> function111111115 = function10;
                AndroidView_androidKt.AndroidView(function111111112, companion, function11, function111111113, (Function1) objRememberedValue5, composerStartRestartGroup, i3 & 112, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function111111115;
                function9 = function111111114;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier17 = companion;
                final Function1 function111111116 = function7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AndroidViewBindingKt.AndroidViewBinding$lambda$21(function3, modifier17, function8, function9, function111111116, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 24576;
        function7 = function4;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            composerStartRestartGroup.skipToGroupEnd();
            companion = modifier2;
            function8 = function5;
            function9 = function6;
        } else {
            if (i10 != 0) {
                companion = Modifier.INSTANCE;
            } else {
                companion = modifier2;
            }
            if (i4 != 0) {
                function10 = null;
            } else {
                function10 = function5;
            }
            if (i6 != 0) {
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$4$lambda$3((ViewBinding) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                function6 = (Function1) objRememberedValue7;
            }
            if (i8 != 0) {
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$6$lambda$5((ViewBinding) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                function7 = (Function1) objRememberedValue6;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
            }
            view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            zChanged = composerStartRestartGroup.changed(view);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = ViewKt.findFragment(view);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = ViewKt.findFragment(view);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            fragment = (Fragment) objRememberedValue;
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            zChangedInstance = composerStartRestartGroup.changedInstance(fragment);
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!(z2 | zChangedInstance)) {
                objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AndroidViewBindingKt.AndroidViewBinding$lambda$10$lambda$9(fragment, function3, (Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function111111117 = (Function1) objRememberedValue2;
            if (function10 == null) {
                composerStartRestartGroup.startReplaceGroup(1128086696);
                function11 = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(1128086697);
                zChanged2 = composerStartRestartGroup.changed(function10);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2) {
                    objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AndroidViewBindingKt.AndroidViewBinding$lambda$13$lambda$12$lambda$11(function10, (View) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                function11 = (Function1) objRememberedValue3;
            }
            composerStartRestartGroup.endReplaceGroup();
            if ((i3 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            zChangedInstance2 = composerStartRestartGroup.changedInstance(fragment);
            zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (!(z3 | zChangedInstance2 | zChangedInstance3)) {
                objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17(function6, fragment, context, (View) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function1 function111111118 = (Function1) objRememberedValue4;
            if ((57344 & i3) == 16384) {
            }
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (!z4) {
                objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                objRememberedValue5 = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AndroidViewBindingKt.AndroidViewBinding$lambda$20$lambda$19(function7, (View) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Function1<? super T, Unit> function111111119 = function6;
            Function1<? super T, Unit> function1111111110 = function10;
            AndroidView_androidKt.AndroidView(function111111117, companion, function11, function111111118, (Function1) objRememberedValue5, composerStartRestartGroup, i3 & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function8 = function1111111110;
            function9 = function111111119;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier18 = companion;
            final Function1 function1111111111 = function7;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AndroidViewBindingKt.AndroidViewBinding$lambda$21(function3, modifier18, function8, function9, function1111111111, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View AndroidViewBinding$lambda$10$lambda$9(Fragment fragment, Function3 function3, Context context) {
        LayoutInflater layoutInflaterFrom;
        if (fragment == null || (layoutInflaterFrom = fragment.getLayoutInflater()) == null) {
            layoutInflaterFrom = LayoutInflater.from(context);
        }
        ViewBinding viewBinding = (ViewBinding) function3.invoke(layoutInflaterFrom, new FrameLayout(context), Boolean.FALSE);
        View root = viewBinding.getRoot();
        setBinding(root, viewBinding);
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AndroidViewBinding$lambda$13$lambda$12$lambda$11(Function1 function1, View view) {
        function1.invoke(getBinding(view));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AndroidViewBinding$lambda$18$lambda$17(Function1 function1, Fragment fragment, Context context, View view) {
        FragmentManager childFragmentManager;
        function1.invoke(getBinding(view));
        final FragmentManager supportFragmentManager = null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            if (fragment == null || (childFragmentManager = fragment.getChildFragmentManager()) == null) {
                FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
                if (fragmentActivity != null) {
                    supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                }
            } else {
                supportFragmentManager = childFragmentManager;
            }
            forEachFragmentContainerView(viewGroup, new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidViewBindingKt.AndroidViewBinding$lambda$18$lambda$17$lambda$16$lambda$15(supportFragmentManager, (FragmentContainerView) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AndroidViewBinding$lambda$18$lambda$17$lambda$16$lambda$15(FragmentManager fragmentManager, FragmentContainerView fragmentContainerView) {
        Fragment fragmentFindFragmentById = fragmentManager != null ? fragmentManager.findFragmentById(fragmentContainerView.getId()) : null;
        if (fragmentFindFragmentById != null && !fragmentManager.isStateSaved()) {
            FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            fragmentTransactionBeginTransaction.remove(fragmentFindFragmentById);
            fragmentTransactionBeginTransaction.commitNow();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AndroidViewBinding$lambda$20$lambda$19(Function1 function1, View view) {
        function1.invoke(getBinding(view));
        return Unit.INSTANCE;
    }

    private static final <T extends ViewBinding> void setBinding(View view, T t) {
        view.setTag(R.id.binding_reference, t);
    }

    private static final <T extends ViewBinding> T getBinding(View view) {
        Object tag = view.getTag(R.id.binding_reference);
        Intrinsics.checkNotNull(tag, "");
        return (T) tag;
    }

    private static final void forEachFragmentContainerView(ViewGroup viewGroup, Function1<? super FragmentContainerView, Unit> function1) {
        if (viewGroup instanceof FragmentContainerView) {
            function1.invoke(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                forEachFragmentContainerView((ViewGroup) childAt, function1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AndroidViewBinding$lambda$2(Function3 function3, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        AndroidViewBinding(function3, modifier, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AndroidViewBinding$lambda$21(Function3 function3, Modifier modifier, Function1 function1, Function1 function2, Function1 function4, int i, int i2, Composer composer, int i3) {
        AndroidViewBinding(function3, modifier, function1, function2, function4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }
}
