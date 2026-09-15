package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.material3.ExposedDropdownMenuDefaults;
import androidx.compose.material3.ExposedDropdownMenu_androidKt;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.bpjstku.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class setArrowShaftLength {
    /* JADX WARN: Code duplicated, block: B:102:0x0150  */
    /* JADX WARN: Code duplicated, block: B:105:0x0157  */
    /* JADX WARN: Code duplicated, block: B:107:0x015f  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104  */
    /* JADX WARN: Code duplicated, block: B:94:0x011c  */
    /* JADX WARN: Code duplicated, block: B:97:0x013c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x0141  */
    public static final <T> void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final String str, final T t, final List<? extends T> list, final Function1<? super T, Unit> function1, Modifier modifier, final Function1<? super T, String> function2, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        final boolean z2;
        int i6;
        int i7;
        Modifier modifier3;
        Object objRememberedValue;
        final MutableState mutableState;
        boolean z3;
        boolean z4;
        Object objRememberedValue2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-793430842);
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
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(t) : composerStartRestartGroup.changedInstance(t) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i2 & 32) != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i4 = 131072;
                } else {
                    i4 = 65536;
                }
                i3 |= i4;
            }
            i5 = i2 & 64;
            if (i5 != 0) {
                if ((1572864 & i) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i3 |= i6;
                }
                i7 = i3;
                if ((599187 & i7) == 599186 || !composerStartRestartGroup.getSkipping()) {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-793430842, i7, -1, "com.bpjstku.presentation.compose.common.BpjstkuDropdownField (Dropdown.kt:35)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1295153803);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    if (((Boolean) mutableState.getValue()).booleanValue() || !z2) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    composerStartRestartGroup.startReplaceGroup(1295157998);
                    z4 = (3670016 & i7) == 1048576;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: setBarLength
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                boolean z5 = z2;
                                MutableState mutableState2 = mutableState;
                                if (z5) {
                                    mutableState2.setValue(Boolean.valueOf(!((Boolean) mutableState2.getValue()).booleanValue()));
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z5 = z2;
                    ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox(z3, (Function1) objRememberedValue2, modifier3, ComposableLambdaKt.rememberComposableLambda(1076152540, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(t, function2, z2, str, mutableState, list, function1), composerStartRestartGroup, 54), composerStartRestartGroup, ((i7 >> 6) & 896) | 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z2 = z5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: setDirection
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            String str2 = str;
                            Object obj3 = t;
                            List list2 = list;
                            Function1 function3 = function1;
                            Modifier modifier5 = modifier4;
                            Function1 function4 = function2;
                            boolean z6 = z2;
                            int i9 = i;
                            setArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, obj3, list2, function3, modifier5, function4, z6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i9 | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 1572864;
            z2 = z;
            i7 = i3;
            if ((599187 & i7) == 599186) {
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-793430842, i7, -1, "com.bpjstku.presentation.compose.common.BpjstkuDropdownField (Dropdown.kt:35)");
                }
                composerStartRestartGroup.startReplaceGroup(1295153803);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                composerStartRestartGroup.startReplaceGroup(1295157998);
                if ((3670016 & i7) == 1048576) {
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z4) {
                    objRememberedValue2 = new Function1() { // from class: setBarLength
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            boolean z6 = z2;
                            MutableState mutableState2 = mutableState;
                            if (z6) {
                                mutableState2.setValue(Boolean.valueOf(!((Boolean) mutableState2.getValue()).booleanValue()));
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1() { // from class: setBarLength
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            boolean z6 = z2;
                            MutableState mutableState2 = mutableState;
                            if (z6) {
                                mutableState2.setValue(Boolean.valueOf(!((Boolean) mutableState2.getValue()).booleanValue()));
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                boolean z6 = z2;
                ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox(z3, (Function1) objRememberedValue2, modifier3, ComposableLambdaKt.rememberComposableLambda(1076152540, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(t, function2, z2, str, mutableState, list, function1), composerStartRestartGroup, 54), composerStartRestartGroup, ((i7 >> 6) & 896) | 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z2 = z6;
            } else {
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-793430842, i7, -1, "com.bpjstku.presentation.compose.common.BpjstkuDropdownField (Dropdown.kt:35)");
                }
                composerStartRestartGroup.startReplaceGroup(1295153803);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                composerStartRestartGroup.startReplaceGroup(1295157998);
                if ((3670016 & i7) == 1048576) {
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z4) {
                    objRememberedValue2 = new Function1() { // from class: setBarLength
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            boolean z7 = z2;
                            MutableState mutableState2 = mutableState;
                            if (z7) {
                                mutableState2.setValue(Boolean.valueOf(!((Boolean) mutableState2.getValue()).booleanValue()));
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1() { // from class: setBarLength
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            boolean z7 = z2;
                            MutableState mutableState2 = mutableState;
                            if (z7) {
                                mutableState2.setValue(Boolean.valueOf(!((Boolean) mutableState2.getValue()).booleanValue()));
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                boolean z7 = z2;
                ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox(z3, (Function1) objRememberedValue2, modifier3, ComposableLambdaKt.rememberComposableLambda(1076152540, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(t, function2, z2, str, mutableState, list, function1), composerStartRestartGroup, 54), composerStartRestartGroup, ((i7 >> 6) & 896) | 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z2 = z7;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: setDirection
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String str2 = str;
                        Object obj3 = t;
                        List list2 = list;
                        Function1 function3 = function1;
                        Modifier modifier5 = modifier4;
                        Function1 function4 = function2;
                        boolean z8 = z2;
                        int i9 = i;
                        setArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, obj3, list2, function3, modifier5, function4, z8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i9 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        i5 = i2 & 64;
        if (i5 != 0) {
            if ((1572864 & i) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i3 |= i6;
            }
            i7 = i3;
            if ((599187 & i7) == 599186) {
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-793430842, i7, -1, "com.bpjstku.presentation.compose.common.BpjstkuDropdownField (Dropdown.kt:35)");
                }
                composerStartRestartGroup.startReplaceGroup(1295153803);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                composerStartRestartGroup.startReplaceGroup(1295157998);
                if ((3670016 & i7) == 1048576) {
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z4) {
                    objRememberedValue2 = new Function1() { // from class: setBarLength
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            boolean z8 = z2;
                            MutableState mutableState2 = mutableState;
                            if (z8) {
                                mutableState2.setValue(Boolean.valueOf(!((Boolean) mutableState2.getValue()).booleanValue()));
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1() { // from class: setBarLength
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            boolean z8 = z2;
                            MutableState mutableState2 = mutableState;
                            if (z8) {
                                mutableState2.setValue(Boolean.valueOf(!((Boolean) mutableState2.getValue()).booleanValue()));
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                boolean z8 = z2;
                ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox(z3, (Function1) objRememberedValue2, modifier3, ComposableLambdaKt.rememberComposableLambda(1076152540, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(t, function2, z2, str, mutableState, list, function1), composerStartRestartGroup, 54), composerStartRestartGroup, ((i7 >> 6) & 896) | 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z2 = z8;
            } else {
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-793430842, i7, -1, "com.bpjstku.presentation.compose.common.BpjstkuDropdownField (Dropdown.kt:35)");
                }
                composerStartRestartGroup.startReplaceGroup(1295153803);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                composerStartRestartGroup.startReplaceGroup(1295157998);
                if ((3670016 & i7) == 1048576) {
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z4) {
                    objRememberedValue2 = new Function1() { // from class: setBarLength
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            boolean z9 = z2;
                            MutableState mutableState2 = mutableState;
                            if (z9) {
                                mutableState2.setValue(Boolean.valueOf(!((Boolean) mutableState2.getValue()).booleanValue()));
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1() { // from class: setBarLength
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            boolean z9 = z2;
                            MutableState mutableState2 = mutableState;
                            if (z9) {
                                mutableState2.setValue(Boolean.valueOf(!((Boolean) mutableState2.getValue()).booleanValue()));
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                boolean z9 = z2;
                ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox(z3, (Function1) objRememberedValue2, modifier3, ComposableLambdaKt.rememberComposableLambda(1076152540, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(t, function2, z2, str, mutableState, list, function1), composerStartRestartGroup, 54), composerStartRestartGroup, ((i7 >> 6) & 896) | 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z2 = z9;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: setDirection
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String str2 = str;
                        Object obj3 = t;
                        List list2 = list;
                        Function1 function3 = function1;
                        Modifier modifier5 = modifier4;
                        Function1 function4 = function2;
                        boolean z10 = z2;
                        int i9 = i;
                        setArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, obj3, list2, function3, modifier5, function4, z10, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i9 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 1572864;
        z2 = z;
        i7 = i3;
        if ((599187 & i7) == 599186) {
            if (i8 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i5 != 0) {
                z2 = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-793430842, i7, -1, "com.bpjstku.presentation.compose.common.BpjstkuDropdownField (Dropdown.kt:35)");
            }
            composerStartRestartGroup.startReplaceGroup(1295153803);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                z3 = false;
            } else {
                z3 = false;
            }
            composerStartRestartGroup.startReplaceGroup(1295157998);
            if ((3670016 & i7) == 1048576) {
            }
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!z4) {
                objRememberedValue2 = new Function1() { // from class: setBarLength
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean z10 = z2;
                        MutableState mutableState2 = mutableState;
                        if (z10) {
                            mutableState2.setValue(Boolean.valueOf(!((Boolean) mutableState2.getValue()).booleanValue()));
                        }
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new Function1() { // from class: setBarLength
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean z10 = z2;
                        MutableState mutableState2 = mutableState;
                        if (z10) {
                            mutableState2.setValue(Boolean.valueOf(!((Boolean) mutableState2.getValue()).booleanValue()));
                        }
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            boolean z10 = z2;
            ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox(z3, (Function1) objRememberedValue2, modifier3, ComposableLambdaKt.rememberComposableLambda(1076152540, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(t, function2, z2, str, mutableState, list, function1), composerStartRestartGroup, 54), composerStartRestartGroup, ((i7 >> 6) & 896) | 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            z2 = z10;
        } else {
            if (i8 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i5 != 0) {
                z2 = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-793430842, i7, -1, "com.bpjstku.presentation.compose.common.BpjstkuDropdownField (Dropdown.kt:35)");
            }
            composerStartRestartGroup.startReplaceGroup(1295153803);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                z3 = false;
            } else {
                z3 = false;
            }
            composerStartRestartGroup.startReplaceGroup(1295157998);
            if ((3670016 & i7) == 1048576) {
            }
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!z4) {
                objRememberedValue2 = new Function1() { // from class: setBarLength
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean z11 = z2;
                        MutableState mutableState2 = mutableState;
                        if (z11) {
                            mutableState2.setValue(Boolean.valueOf(!((Boolean) mutableState2.getValue()).booleanValue()));
                        }
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new Function1() { // from class: setBarLength
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean z11 = z2;
                        MutableState mutableState2 = mutableState;
                        if (z11) {
                            mutableState2.setValue(Boolean.valueOf(!((Boolean) mutableState2.getValue()).booleanValue()));
                        }
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            boolean z11 = z2;
            ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox(z3, (Function1) objRememberedValue2, modifier3, ComposableLambdaKt.rememberComposableLambda(1076152540, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(t, function2, z2, str, mutableState, list, function1), composerStartRestartGroup, 54), composerStartRestartGroup, ((i7 >> 6) & 896) | 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            z2 = z11;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: setDirection
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    Object obj3 = t;
                    List list2 = list;
                    Function1 function3 = function1;
                    Modifier modifier5 = modifier4;
                    Function1 function4 = function2;
                    boolean z12 = z2;
                    int i9 = i;
                    setArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, obj3, list2, function3, modifier5, function4, z12, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i9 | 1), i2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Function3<ExposedDropdownMenuBoxScope, Composer, Integer, Unit> {
        private /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ Function1<T, String> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ MutableState<Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private /* synthetic */ List<T> asBinder;
        private /* synthetic */ Function1<T, Unit> b;
        private /* synthetic */ T d;

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
        @Override // kotlin.jvm.functions.Function3
        public final /* bridge */ /* synthetic */ Unit invoke(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Composer composer, Integer num) {
            String strInvoke;
            ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope2 = exposedDropdownMenuBoxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(exposedDropdownMenuBoxScope2, "");
            if ((iIntValue & 6) == 0) {
                iIntValue |= (iIntValue & 8) == 0 ? composer2.changed(exposedDropdownMenuBoxScope2) : composer2.changedInstance(exposedDropdownMenuBoxScope2) ? 4 : 2;
            }
            int i = iIntValue;
            if ((i & 19) != 18 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1076152540, i, -1, "com.bpjstku.presentation.compose.common.BpjstkuDropdownField.<anonymous> (Dropdown.kt:43)");
                }
                Object obj = this.d;
                String str = (obj == null || (strInvoke = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(obj)) == null) ? "" : strInvoke;
                TextStyle textStyle = new TextStyle(0L, TextUnitKt.getSp(16), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777181, (DefaultConstructorMarker) null);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(exposedDropdownMenuBoxScope2.menuAnchor(Modifier.INSTANCE), 0.0f, 1, null);
                TextFieldColors textFieldColorsM2256colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 14376960, 25008, 27648, 0, 3072, 2122295055, 4095);
                RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                composer2.startReplaceGroup(235462122);
                Object objRememberedValue = composer2.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: setGapSize
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return setArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b((String) obj2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                boolean z = this.TuitionPaymentFragmentbindingInflater1;
                final String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(925804790, true, new Function2<Composer, Integer, Unit>() { // from class: setArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3.1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                        Composer composer4 = composer3;
                        int iIntValue2 = num2.intValue();
                        if ((iIntValue2 & 3) != 2 || !composer4.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(925804790, iIntValue2, -1, "com.bpjstku.presentation.compose.common.BpjstkuDropdownField.<anonymous>.<anonymous> (Dropdown.kt:49)");
                            }
                            TextKt.m2654Text4IGK_g(str2, (Modifier) null, ColorKt.Color(4288652199L), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 1576320, 0, 130994);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer4.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, composer2, 54);
                final MutableState<Boolean> mutableState = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierFillMaxWidth$default, z, true, textStyle, (Function2<? super Composer, ? super Integer, Unit>) composableLambdaRememberComposableLambda, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-1050036653, true, new Function2<Composer, Integer, Unit>() { // from class: setArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3.3
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                        Composer composer4 = composer3;
                        int iIntValue2 = num2.intValue();
                        if ((iIntValue2 & 3) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                        } else {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1050036653, iIntValue2, -1, "com.bpjstku.presentation.compose.common.BpjstkuDropdownField.<anonymous>.<anonymous> (Dropdown.kt:61)");
                            }
                            ExposedDropdownMenuDefaults.INSTANCE.TrailingIcon(mutableState.getValue().booleanValue(), composer4, ExposedDropdownMenuDefaults.$stable << 3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }, composer2, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_4, textFieldColorsM2256colors0hiis_0, composer2, 806903856, 0, 0, 2096512);
                boolean zBooleanValue = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue().booleanValue();
                composer2.startReplaceGroup(235508316);
                final MutableState<Boolean> mutableState2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                Object objRememberedValue2 = composer2.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: setProgress
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return setArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mutableState2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                exposedDropdownMenuBoxScope2.ExposedDropdownMenu(zBooleanValue, (Function0) objRememberedValue2, null, null, ComposableLambdaKt.rememberComposableLambda(1132693677, true, new AnonymousClass5(this.asBinder, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2), composer2, 54), composer2, (458752 & (i << 15)) | (ExposedDropdownMenuBoxScope.$stable << 15) | 24624, 12);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: setArrowShaftLength$TuitionPaymentFragmentspecialinlinedviewModeldefault3$5, reason: invalid class name */
        static final class AnonymousClass5 implements Function3<ColumnScope, Composer, Integer, Unit> {
            private /* synthetic */ Function1<T, Unit> TuitionPaymentFragmentbindingInflater1;
            private /* synthetic */ MutableState<Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            private /* synthetic */ List<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            private /* synthetic */ Function1<T, String> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
                Composer composer2 = composer;
                int iIntValue = num.intValue();
                Intrinsics.checkNotNullParameter(columnScope, "");
                if ((iIntValue & 17) != 16 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1132693677, iIntValue, -1, "com.bpjstku.presentation.compose.common.BpjstkuDropdownField.<anonymous>.<anonymous> (Dropdown.kt:84)");
                    }
                    Iterable iterable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    final Function1<T, Unit> function1 = this.TuitionPaymentFragmentbindingInflater1;
                    Function1 function2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    final MutableState<Boolean> mutableState = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    for (final Object obj : iterable) {
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1126183456, true, new b(function2, obj), composer2, 54);
                        composer2.startReplaceGroup(1262398902);
                        boolean zChanged = composer2.changed(function1);
                        boolean zChangedInstance = composer2.changedInstance(obj);
                        Object objRememberedValue = composer2.rememberedValue();
                        if ((zChanged | zChangedInstance) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: DrawerArrowDrawableArrowDirection
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return setArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, obj, mutableState);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        AndroidMenu_androidKt.DropdownMenuItem(composableLambdaRememberComposableLambda, (Function0) objRememberedValue, null, null, null, false, null, null, null, composer2, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
                        function2 = function2;
                        mutableState = mutableState;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: setArrowShaftLength$TuitionPaymentFragmentspecialinlinedviewModeldefault3$5$b */
            static final class b implements Function2<Composer, Integer, Unit> {
                private /* synthetic */ T TuitionPaymentFragmentbindingInflater1;
                private /* synthetic */ Function1<T, String> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                private static final byte[] $$c = {55, -47, -47, 67};
                private static final int $$f = 242;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$d = {30, 17, -35, 104, -21, -7, 54, -61, -23, -3, -18, -10, 0, -19, 62, -75, -11, 4, -23, 5, -18, -15, 10, -28, 2, -15, -8, 55, -72, -1, -17, 2, -12, -22, -10, 2, -10, -16, 57, -60, -11, -9, -21, -15, -2, -15, 10, -11, -26, 2, -22, 12, -28, 2, -15, -8, 55, -73, 0, -27, 13, -11, -26, 2, -22, 12, -28, 2, -15, -8, 55, -41, -32, -27, 30, -33, -16, -8, 0, 6, -24, -22, 0, -6, -12, -3, -7, -28, 2, -15, -8, 19, -28, -23, 5, -24, 42, -43, -26, 2, -22, 4, -20, -14, 76, -57, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, 9, -16, -14, 1, -14, -14, -2, 21, -46, -1, -15, 2, -28, 6, -22, 56, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, -8, -6, 2, -7, -15, -1, -20, -6, -14, -7, -6, -14, 0, -8, -27, 4, -5, -27, 33, -43, 2, -10, -16, -1, -10, -10, -4, -29, 0, -17, 56};
                private static final int $$e = 190;
                private static final byte[] $$a = {91, -17, 90, 37, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
                private static final int $$b = 210;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                private static int asBinder = 1;
                private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {33802, 46856, 57877, 7486, 18480, 31555, 46657, 57630, 7276, 20333, 31431, 46519, 57486, 5041, 20137, 31181, 46294, 59381, 4845, 19955, 30988, 46097, 32260, 19712, 6170, 59190, 45606, 33093, 19531, 7016, 58988, 46453, 32911, 20378, 6804, 59813, 46258, 45565, 33535, 55266, 10441, 32199, 20148, 33718, 54505, 10645, 31385, 20334, 32829, 54593, 9814, 31582, 19510, 33082, 53800, 9986, 30738, 19660, 33253, 54000, 10194, 30917, 19901, 45567, 33508, 55284, 10441, 32205, 20147, 33702, 54406, 10628, 31385, 20338, 32890, 54627, 9812, 31582, 19510, 33059, 53807, 45558, 33520, 55280, 10458, 32134, 20145, 33715, 54441, 10643, 31431, 20301, 32874, 54643, 9793, 31567, 19506, 45557, 33525, 55267, 10453, 32220, 20148, 33702, 54462, 10684, 31368, 20333, 32891, 54595, 9818, 31566, 19514};
                private static long b = -8579528205903822191L;

                /* JADX WARN: Code duplicated, block: B:10:0x0027  */
                /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
                    /*
                        int r6 = r6 + 4
                        int r7 = r7 * 15
                        int r0 = 53 - r7
                        int r8 = r8 * 3
                        int r8 = r8 + 84
                        byte[] r1 = setArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass5.b.$$a
                        byte[] r0 = new byte[r0]
                        int r7 = 52 - r7
                        r2 = 0
                        if (r1 != 0) goto L17
                        r8 = r6
                        r3 = r7
                        r4 = r2
                        goto L30
                    L17:
                        r3 = r2
                    L18:
                        byte r4 = (byte) r8
                        r0[r3] = r4
                        int r6 = r6 + 1
                        if (r3 != r7) goto L27
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r0, r2)
                        r9[r2] = r6
                        return
                    L27:
                        int r3 = r3 + 1
                        r4 = r1[r6]
                        r5 = r8
                        r8 = r6
                        r6 = r4
                        r4 = r3
                        r3 = r5
                    L30:
                        int r6 = -r6
                        int r3 = r3 + r6
                        int r6 = r3 + (-11)
                        r3 = r4
                        r5 = r8
                        r8 = r6
                        r6 = r5
                        goto L18
                    */
                    throw new UnsupportedOperationException("Method not decompiled: setArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass5.b.a(short, short, int, java.lang.Object[]):void");
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0026  */
                /* JADX WARN: Code duplicated, block: B:8:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void d(int r6, short r7, int r8, java.lang.Object[] r9) {
                    /*
                        byte[] r0 = setArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass5.b.$$d
                        int r8 = r8 * 15
                        int r8 = 99 - r8
                        int r7 = r7 * 87
                        int r7 = 140 - r7
                        int r6 = r6 * 139
                        int r6 = 143 - r6
                        byte[] r1 = new byte[r7]
                        r2 = 0
                        if (r0 != 0) goto L16
                        r3 = r7
                        r4 = r2
                        goto L2c
                    L16:
                        r3 = r2
                    L17:
                        byte r4 = (byte) r8
                        r1[r3] = r4
                        int r3 = r3 + 1
                        if (r3 != r7) goto L26
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        r9[r2] = r6
                        return
                    L26:
                        r4 = r0[r6]
                        r5 = r3
                        r3 = r8
                        r8 = r4
                        r4 = r5
                    L2c:
                        int r6 = r6 + 1
                        int r8 = -r8
                        int r3 = r3 + r8
                        int r8 = r3 + (-9)
                        r3 = r4
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: setArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass5.b.d(int, short, int, java.lang.Object[]):void");
                }

                private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
                    int i3 = 2 % 2;
                    lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                    long[] jArr = new long[i2];
                    lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    int i4 = $11 + 27;
                    $10 = i4 % 128;
                    int i5 = i4 % 2;
                    while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                        int i6 = $10 + 19;
                        $11 = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            try {
                                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i * i7])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - MotionEvent.axisFromString("")), TextUtils.getCapsMode("", 0, 0) + 2187, TextUtils.indexOf((CharSequence) "", '0', 0) + 41, 841711447, false, $$g(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                                }
                                try {
                                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(b), Integer.valueOf(c)};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        byte b4 = (byte) 0;
                                        byte b5 = b4;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.normalizeMetaState(0) + 33017), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3011, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25, 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                                    }
                                    jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                                    try {
                                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            byte b6 = (byte) 0;
                                            byte b7 = b6;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36504 - TextUtils.indexOf((CharSequence) "", '0')), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3375, View.combineMeasuredStates(0, 0) + 17, -968507904, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                                        }
                                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } catch (Throwable th3) {
                                Throwable cause3 = th3.getCause();
                                if (cause3 == null) {
                                    throw th3;
                                }
                                throw cause3;
                            }
                        } else {
                            int i8 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 2187, 40 - TextUtils.getOffsetAfter("", 0), 841711447, false, $$g(b8, b9, (byte) (b9 + 2)), new Class[]{Integer.TYPE});
                            }
                            Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(b), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                byte b10 = (byte) 0;
                                byte b11 = b10;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33017 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 3011 - ExpandableListView.getPackedPositionGroup(0L), 26 - (ViewConfiguration.getTapTimeout() >> 16), 321985076, false, $$g(b10, b11, b11), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                            Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                byte b12 = (byte) 0;
                                byte b13 = b12;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36504), 3376 - (ViewConfiguration.getLongPressTimeout() >> 16), 18 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -968507904, false, $$g(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                        }
                    }
                    char[] cArr = new char[i2];
                    lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                        cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                        Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            byte b14 = (byte) 0;
                            byte b15 = b14;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (36553 - AndroidCharacter.getMirror('0')), 3376 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 18, -968507904, false, $$g(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                        int i9 = $10 + 111;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                    }
                    objArr[0] = new String(cArr);
                }

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
                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Throwable {
                    Object[] objArr;
                    int i;
                    int i2 = 2 % 2;
                    int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
                    asBinder = i3 % 128;
                    int i4 = i3 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - android.graphics.Color.rgb(0, 0, 0));
                        int iRed = 2267 - android.graphics.Color.red(0);
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 33;
                        byte[] bArr = $$a;
                        byte b2 = bArr[132];
                        byte b3 = bArr[7];
                        Object[] objArr2 = new Object[1];
                        a(b2, b3, b3, objArr2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, iRed, minimumFlingVelocity, -887667012, false, (String) objArr2[0], null);
                    }
                    long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                    Object[] objArr3 = new Object[1];
                    c(Process.getGidForName("") + 1, android.graphics.Color.argb(0, 0, 0, 0) + 22, (char) ((Process.myPid() >> 22) + 13815), objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    c(TextUtils.getCapsMode("", 0, 0) + 22, 15 - Drawable.resolveOpacity(0, 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 53244), objArr4);
                    long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int deadChar = 2267 - KeyEvent.getDeadChar(0, 0);
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 33;
                        byte b4 = $$a[7];
                        Object[] objArr5 = new Object[1];
                        a((byte) 51, b4, b4, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, deadChar, keyRepeatDelay, -874156483, false, (String) objArr5[0], null);
                    }
                    if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                            int iIndexOf = 2267 - TextUtils.indexOf("", "", 0);
                            int i5 = 33 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            byte[] bArr2 = $$a;
                            Object[] objArr6 = new Object[1];
                            a((byte) 103, bArr2[5], bArr2[7], objArr6);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, iIndexOf, i5, -654680577, false, (String) objArr6[0], null);
                        }
                        Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                        objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                        int i6 = ((int[]) objArr7[0])[0];
                        int i7 = ((int[]) objArr7[3])[0];
                        String[] strArr = (String[]) objArr7[1];
                        int i8 = ~((~((int) Process.getElapsedCpuTime())) | 695517858);
                        int i9 = (((692109858 | i8) * (-970)) - 1165382601) + ((i8 | 3408000) * 970) + 1317982284;
                        int i10 = (i9 << 13) ^ i9;
                        int i11 = i10 ^ (i10 >>> 17);
                        ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
                    } else {
                        Object[] objArr8 = new Object[1];
                        c(37 - TextUtils.getTrimmedLength(""), View.resolveSizeAndState(0, 0, 0) + 26, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr8);
                        Class<?> cls2 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        c(62 - MotionEvent.axisFromString(""), MotionEvent.axisFromString("") + 19, (char) View.MeasureSpec.getMode(0), objArr9);
                        Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                        if (applicationContext != null) {
                            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
                            asBinder = i12 % 128;
                            int i13 = i12 % 2;
                            applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                        }
                        Object[] objArr10 = new Object[1];
                        c(81 - (ViewConfiguration.getEdgeSlop() >> 16), 17 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), objArr10);
                        Class<?> cls3 = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        c((ViewConfiguration.getPressedStateDuration() >> 16) + 97, ((Process.getThreadPriority(0) + 20) >> 6) + 16, (char) KeyEvent.getDeadChar(0, 0), objArr11);
                        try {
                            Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1317982284};
                            byte[] bArr3 = $$d;
                            byte b5 = bArr3[130];
                            byte b6 = bArr3[12];
                            Object[] objArr13 = new Object[1];
                            d(b5, b6, b6, objArr13);
                            Class<?> cls4 = Class.forName((String) objArr13[0]);
                            byte b7 = bArr3[12];
                            byte b8 = bArr3[130];
                            Object[] objArr14 = new Object[1];
                            d(b7, b8, b8, objArr14);
                            Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                            if (applicationContext != null) {
                                int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
                                asBinder = i14 % 128;
                                int i15 = i14 % 2;
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                    int iGreen = android.graphics.Color.green(0) + 2267;
                                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33;
                                    byte[] bArr4 = $$a;
                                    Object[] objArr16 = new Object[1];
                                    a((byte) 103, bArr4[5], bArr4[7], objArr16);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSizeAndState, iGreen, scrollBarFadeDuration, -654680577, false, (String) objArr16[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                                try {
                                    Object[] objArr17 = new Object[1];
                                    c(ViewConfiguration.getMinimumFlingVelocity() >> 16, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 13815), objArr17);
                                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                                    Object[] objArr18 = new Object[1];
                                    c(View.resolveSizeAndState(0, 0, 0) + 22, 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 53245), objArr18);
                                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                    Long lValueOf = Long.valueOf(jLongValue2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int scrollBarFadeDuration2 = 2267 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                        int scrollBarFadeDuration3 = 33 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                        byte b9 = $$a[7];
                                        Object[] objArr19 = new Object[1];
                                        a((byte) 51, b9, b9, objArr19);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, scrollBarFadeDuration2, scrollBarFadeDuration3, -874156483, false, (String) objArr19[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                        char defaultSize = (char) View.getDefaultSize(0, 0);
                                        int i16 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2266;
                                        int packedPositionGroup = 33 - ExpandableListView.getPackedPositionGroup(0L);
                                        byte[] bArr5 = $$a;
                                        byte b10 = bArr5[132];
                                        byte b11 = bArr5[7];
                                        Object[] objArr20 = new Object[1];
                                        a(b10, b11, b11, objArr20);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(defaultSize, i16, packedPositionGroup, -887667012, false, (String) objArr20[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                } catch (Exception unused) {
                                    throw new RuntimeException();
                                }
                            }
                            objArr = objArr15;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    int i17 = ((int[]) objArr[3])[0];
                    int i18 = ((int[]) objArr[0])[0];
                    if (i18 == i17) {
                        int i19 = asBinder + 103;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 % 128;
                        int i20 = i19 % 2;
                        Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                        int i21 = ((int[]) objArr[2])[0];
                        int i22 = ((int[]) objArr[0])[0];
                        int i23 = ((int[]) objArr[3])[0];
                        String[] strArr2 = (String[]) objArr[1];
                        int iIdentityHashCode = System.identityHashCode(this);
                        int i24 = (-1808012061) + (((~(384452542 | iIdentityHashCode)) | 424260773) * 672);
                        int i25 = ~iIdentityHashCode;
                        int i26 = i21 + i24 + (((~(iIdentityHashCode | 424260773)) | (~((-384452543) | i25))) * (-672)) + (((~((-424260774) | i25)) | 151105537) * 672);
                        int i27 = (i26 << 13) ^ i26;
                        int i28 = i27 ^ (i27 >>> 17);
                        ((int[]) objArr21[2])[0] = i28 ^ (i28 << 5);
                        i = 2;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr3 = (String[]) objArr[1];
                        if (strArr3 != null) {
                            int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
                            asBinder = i29 % 128;
                            for (int i30 = i29 % 2 == 0 ? 1 : 0; i30 < strArr3.length; i30++) {
                                arrayList.add(strArr3[i30]);
                            }
                        }
                        int[] iArr = new int[i18];
                        int i31 = i18 - 1;
                        iArr[i31] = 1;
                        Toast.makeText((Context) null, iArr[((i18 * i31) % 2) - 1], 1).show();
                        Object[] objArr22 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                        int i32 = ((int[]) objArr[2])[0];
                        int i33 = ((int[]) objArr[0])[0];
                        int i34 = ((int[]) objArr[3])[0];
                        String[] strArr4 = (String[]) objArr[1];
                        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                        int i35 = ~iElapsedRealtime;
                        int i36 = (-1715483333) + (((~((-9702533) | i35)) | (~(228478943 | iElapsedRealtime))) * 520);
                        int i37 = ~((-228478944) | i35);
                        int i38 = ~(iElapsedRealtime | 580234372);
                        int i39 = i32 + i36 + ((i37 | i38) * (-1040)) + ((i38 | (~(i35 | (-580234373))) | 218776411) * 520);
                        int i40 = (i39 << 13) ^ i39;
                        int i41 = i40 ^ (i40 >>> 17);
                        i = 2;
                        ((int[]) objArr22[2])[0] = i41 ^ (i41 << 5);
                    }
                    Composer composer2 = composer;
                    int iIntValue = num.intValue();
                    if ((iIntValue & 3) == i && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        if (!(!ComposerKt.isTraceInProgress())) {
                            int i42 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
                            asBinder = i42 % 128;
                            int i43 = i42 % 2;
                            ComposerKt.traceEventStart(-1126183456, iIntValue, -1, "com.bpjstku.presentation.compose.common.BpjstkuDropdownField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Dropdown.kt:87)");
                        }
                        TextKt.m2654Text4IGK_g(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(this.TuitionPaymentFragmentbindingInflater1), (Modifier) null, 0L, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 1575936, 0, 130998);
                        if (ComposerKt.isTraceInProgress()) {
                            int i44 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
                            asBinder = i44 % 128;
                            if (i44 % 2 == 0) {
                                ComposerKt.traceEventEnd();
                                int i45 = 86 / 0;
                            } else {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                b(Function1<? super T, String> function1, T t) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
                    this.TuitionPaymentFragmentbindingInflater1 = t;
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0024  */
                /* JADX WARN: Code duplicated, block: B:8:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static java.lang.String $$g(short r5, int r6, short r7) {
                    /*
                        int r5 = r5 * 4
                        int r5 = 4 - r5
                        int r7 = r7 * 3
                        int r7 = 115 - r7
                        int r6 = r6 * 2
                        int r0 = 1 - r6
                        byte[] r1 = setArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass5.b.$$c
                        byte[] r0 = new byte[r0]
                        r2 = 0
                        int r6 = 0 - r6
                        if (r1 != 0) goto L18
                        r4 = r6
                        r3 = r2
                        goto L28
                    L18:
                        r3 = r2
                    L19:
                        byte r4 = (byte) r7
                        r0[r3] = r4
                        if (r3 != r6) goto L24
                        java.lang.String r5 = new java.lang.String
                        r5.<init>(r0, r2)
                        return r5
                    L24:
                        int r3 = r3 + 1
                        r4 = r1[r5]
                    L28:
                        int r5 = r5 + 1
                        int r7 = r7 + r4
                        goto L19
                    */
                    throw new UnsupportedOperationException("Method not decompiled: setArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass5.b.$$g(short, int, short):java.lang.String");
                }
            }

            public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj, MutableState mutableState) {
                function1.invoke(obj);
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass5(List<? extends T> list, Function1<? super T, Unit> function1, Function1<? super T, String> function2, MutableState<Boolean> mutableState) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = list;
                this.TuitionPaymentFragmentbindingInflater1 = function1;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function2;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableState;
            }
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(MutableState mutableState) {
            mutableState.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit b(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(T t, Function1<? super T, String> function1, boolean z, String str, MutableState<Boolean> mutableState, List<? extends T> list, Function1<? super T, Unit> function2) {
            this.d = t;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
            this.TuitionPaymentFragmentbindingInflater1 = z;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableState;
            this.asBinder = list;
            this.b = function2;
        }
    }
}
