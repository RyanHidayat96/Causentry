package defpackage;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
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
import androidx.compose.ui.text.font.FontFamily;
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
import androidx.profileinstaller.ProfileVerifier;
import com.bpjstku.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class isUiFocusable {
    /* JADX WARN: Code duplicated, block: B:101:0x0126  */
    /* JADX WARN: Code duplicated, block: B:103:0x0129  */
    /* JADX WARN: Code duplicated, block: B:104:0x012c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0131  */
    /* JADX WARN: Code duplicated, block: B:108:0x0134  */
    /* JADX WARN: Code duplicated, block: B:110:0x0138  */
    /* JADX WARN: Code duplicated, block: B:112:0x014a  */
    /* JADX WARN: Code duplicated, block: B:114:0x015a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0162  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:124:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:127:0x031f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0334  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:92:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0114  */
    /* JADX WARN: Code duplicated, block: B:94:0x011a  */
    /* JADX WARN: Code duplicated, block: B:97:0x011e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0121  */
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final String str, final String str2, Modifier modifier, boolean z, boolean z2, boolean z3, Function2<? super Composer, ? super Integer, Unit> function2, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z4;
        int i5;
        int i6;
        boolean z5;
        int i7;
        int i8;
        boolean z6;
        int i9;
        int i10;
        Function2<? super Composer, ? super Integer, Unit> function3;
        int i11;
        int i12;
        int i13;
        Modifier modifier3;
        boolean z7;
        boolean z8;
        Function2<? super Composer, ? super Integer, Unit> function4;
        Function0<Unit> function1;
        long jM4254getUnspecified0d7_KjU;
        Object objRememberedValue;
        Composer composer2;
        final boolean z9;
        final Modifier modifier4;
        final boolean z10;
        final boolean z11;
        final Function2<? super Composer, ? super Integer, Unit> function5;
        final Function0<Unit> function6;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-939140220);
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
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        int i14 = i2 & 4;
        if (i14 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z4 = z;
                    if (composerStartRestartGroup.changed(z4)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        z5 = z2;
                        if (composerStartRestartGroup.changed(z5)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            z6 = z3;
                            if (composerStartRestartGroup.changed(z6)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 64;
                        if (i10 != 0) {
                            i3 |= 1572864;
                            function3 = function2;
                        } else {
                            function3 = function2;
                            if ((i & 1572864) == 0) {
                                if (composerStartRestartGroup.changedInstance(function3)) {
                                    i11 = 1048576;
                                } else {
                                    i11 = 524288;
                                }
                                i3 |= i11;
                            }
                        }
                        i12 = i2 & 128;
                        if (i12 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            if (composerStartRestartGroup.changedInstance(function0)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i3 |= i13;
                        }
                        if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                            if (i14 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                z7 = false;
                            } else {
                                z7 = z4;
                            }
                            if (i6 != 0) {
                                z5 = true;
                            }
                            if (i8 != 0) {
                                z8 = false;
                            } else {
                                z8 = z6;
                            }
                            if (i10 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if (i12 != 0) {
                                composerStartRestartGroup.startReplaceGroup(-315628145);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function1 = (Function0) objRememberedValue2;
                            } else {
                                function1 = function0;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                            }
                            Modifier modifierM590clickableXHw0xAI$default = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                            FontFamily FontFamily = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                            long sp = TextUnitKt.getSp(16);
                            if (z5) {
                                jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                            } else {
                                jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                            }
                            TextStyle textStyle = new TextStyle(jM4254getUnspecified0d7_KjU, sp, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                            TextFieldColors textFieldColorsM2256colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                            RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                            composerStartRestartGroup.startReplaceGroup(-315621203);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Intrinsics.checkNotNullParameter((String) obj, "");
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            int i15 = i3;
                            composerStartRestartGroup.endReplaceGroup();
                            boolean z12 = z5;
                            composer2 = composerStartRestartGroup;
                            Modifier modifier5 = modifier3;
                            OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default, z12, z7, textStyle, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_4, textFieldColorsM2256colors0hiis_0, composer2, (i15 & 14) | 1572912 | ((i15 >> 3) & 7168) | (57344 & (i15 << 3)) | ((i15 << 9) & 1879048192), (i15 >> 6) & 7168, 0, 2088320);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z9 = z12;
                            modifier4 = modifier5;
                            z10 = z7;
                            z11 = z8;
                            function5 = function4;
                            function6 = function1;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function6 = function0;
                            composer2 = composerStartRestartGroup;
                            modifier4 = modifier2;
                            z10 = z4;
                            z9 = z5;
                            function5 = function3;
                            z11 = z6;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ActionModeCallback
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    String str3 = str;
                                    String str4 = str2;
                                    Modifier modifier6 = modifier4;
                                    boolean z13 = z10;
                                    boolean z14 = z9;
                                    boolean z15 = z11;
                                    Function2 function7 = function5;
                                    Function0 function8 = function6;
                                    int i16 = i;
                                    isUiFocusable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3, str4, modifier6, z13, z14, z15, function7, function8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i16 | 1), i2);
                                    return Unit.INSTANCE;
                                }
                            });
                        }
                    }
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    z6 = z3;
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                        function3 = function2;
                    } else {
                        function3 = function2;
                        if ((i & 1572864) == 0) {
                            if (composerStartRestartGroup.changedInstance(function3)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changedInstance(function0)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 4793491) == 4793490) {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z7 = false;
                        } else {
                            z7 = z4;
                        }
                        if (i6 != 0) {
                            z5 = true;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        } else {
                            z8 = z6;
                        }
                        if (i10 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceGroup(-315628145);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function1 = (Function0) objRememberedValue2;
                        } else {
                            function1 = function0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                        }
                        Modifier modifierM590clickableXHw0xAI$default2 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                        FontFamily FontFamily2 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                        long sp2 = TextUnitKt.getSp(16);
                        if (z5) {
                            jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                        } else {
                            jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                        }
                        TextStyle textStyle2 = new TextStyle(jM4254getUnspecified0d7_KjU, sp2, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                        TextFieldColors textFieldColorsM2256colors0hiis_1 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                        RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                        composerStartRestartGroup.startReplaceGroup(-315621203);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Intrinsics.checkNotNullParameter((String) obj, "");
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        int i16 = i3;
                        composerStartRestartGroup.endReplaceGroup();
                        boolean z13 = z5;
                        composer2 = composerStartRestartGroup;
                        Modifier modifier6 = modifier3;
                        OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default2, z13, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_5, textFieldColorsM2256colors0hiis_1, composer2, (i16 & 14) | 1572912 | ((i16 >> 3) & 7168) | (57344 & (i16 << 3)) | ((i16 << 9) & 1879048192), (i16 >> 6) & 7168, 0, 2088320);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z9 = z13;
                        modifier4 = modifier6;
                        z10 = z7;
                        z11 = z8;
                        function5 = function4;
                        function6 = function1;
                    } else {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z7 = false;
                        } else {
                            z7 = z4;
                        }
                        if (i6 != 0) {
                            z5 = true;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        } else {
                            z8 = z6;
                        }
                        if (i10 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceGroup(-315628145);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function1 = (Function0) objRememberedValue2;
                        } else {
                            function1 = function0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                        }
                        Modifier modifierM590clickableXHw0xAI$default3 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                        FontFamily FontFamily3 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                        long sp3 = TextUnitKt.getSp(16);
                        if (z5) {
                            jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                        } else {
                            jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                        }
                        TextStyle textStyle3 = new TextStyle(jM4254getUnspecified0d7_KjU, sp3, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily3, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                        TextFieldColors textFieldColorsM2256colors0hiis_2 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                        RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_6 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                        composerStartRestartGroup.startReplaceGroup(-315621203);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Intrinsics.checkNotNullParameter((String) obj, "");
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        int i17 = i3;
                        composerStartRestartGroup.endReplaceGroup();
                        boolean z14 = z5;
                        composer2 = composerStartRestartGroup;
                        Modifier modifier7 = modifier3;
                        OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default3, z14, z7, textStyle3, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_6, textFieldColorsM2256colors0hiis_2, composer2, (i17 & 14) | 1572912 | ((i17 >> 3) & 7168) | (57344 & (i17 << 3)) | ((i17 << 9) & 1879048192), (i17 >> 6) & 7168, 0, 2088320);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z9 = z14;
                        modifier4 = modifier7;
                        z10 = z7;
                        z11 = z8;
                        function5 = function4;
                        function6 = function1;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ActionModeCallback
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                String str3 = str;
                                String str4 = str2;
                                Modifier modifier8 = modifier4;
                                boolean z15 = z10;
                                boolean z16 = z9;
                                boolean z17 = z11;
                                Function2 function7 = function5;
                                Function0 function8 = function6;
                                int i18 = i;
                                isUiFocusable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3, str4, modifier8, z15, z16, z17, function7, function8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i18 | 1), i2);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }
                i3 |= 24576;
                z5 = z2;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        z6 = z3;
                        if (composerStartRestartGroup.changed(z6)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                        function3 = function2;
                    } else {
                        function3 = function2;
                        if ((i & 1572864) == 0) {
                            if (composerStartRestartGroup.changedInstance(function3)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changedInstance(function0)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 4793491) == 4793490) {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z7 = false;
                        } else {
                            z7 = z4;
                        }
                        if (i6 != 0) {
                            z5 = true;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        } else {
                            z8 = z6;
                        }
                        if (i10 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceGroup(-315628145);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function1 = (Function0) objRememberedValue2;
                        } else {
                            function1 = function0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                        }
                        Modifier modifierM590clickableXHw0xAI$default4 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                        FontFamily FontFamily4 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                        long sp4 = TextUnitKt.getSp(16);
                        if (z5) {
                            jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                        } else {
                            jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                        }
                        TextStyle textStyle4 = new TextStyle(jM4254getUnspecified0d7_KjU, sp4, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily4, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                        TextFieldColors textFieldColorsM2256colors0hiis_3 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                        RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_7 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                        composerStartRestartGroup.startReplaceGroup(-315621203);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Intrinsics.checkNotNullParameter((String) obj, "");
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        int i18 = i3;
                        composerStartRestartGroup.endReplaceGroup();
                        boolean z15 = z5;
                        composer2 = composerStartRestartGroup;
                        Modifier modifier8 = modifier3;
                        OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default4, z15, z7, textStyle4, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_7, textFieldColorsM2256colors0hiis_3, composer2, (i18 & 14) | 1572912 | ((i18 >> 3) & 7168) | (57344 & (i18 << 3)) | ((i18 << 9) & 1879048192), (i18 >> 6) & 7168, 0, 2088320);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z9 = z15;
                        modifier4 = modifier8;
                        z10 = z7;
                        z11 = z8;
                        function5 = function4;
                        function6 = function1;
                    } else {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z7 = false;
                        } else {
                            z7 = z4;
                        }
                        if (i6 != 0) {
                            z5 = true;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        } else {
                            z8 = z6;
                        }
                        if (i10 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceGroup(-315628145);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function1 = (Function0) objRememberedValue2;
                        } else {
                            function1 = function0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                        }
                        Modifier modifierM590clickableXHw0xAI$default5 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                        FontFamily FontFamily5 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                        long sp5 = TextUnitKt.getSp(16);
                        if (z5) {
                            jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                        } else {
                            jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                        }
                        TextStyle textStyle5 = new TextStyle(jM4254getUnspecified0d7_KjU, sp5, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily5, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                        TextFieldColors textFieldColorsM2256colors0hiis_4 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                        RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_8 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                        composerStartRestartGroup.startReplaceGroup(-315621203);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Intrinsics.checkNotNullParameter((String) obj, "");
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        int i19 = i3;
                        composerStartRestartGroup.endReplaceGroup();
                        boolean z16 = z5;
                        composer2 = composerStartRestartGroup;
                        Modifier modifier9 = modifier3;
                        OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default5, z16, z7, textStyle5, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_8, textFieldColorsM2256colors0hiis_4, composer2, (i19 & 14) | 1572912 | ((i19 >> 3) & 7168) | (57344 & (i19 << 3)) | ((i19 << 9) & 1879048192), (i19 >> 6) & 7168, 0, 2088320);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z9 = z16;
                        modifier4 = modifier9;
                        z10 = z7;
                        z11 = z8;
                        function5 = function4;
                        function6 = function1;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ActionModeCallback
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                String str3 = str;
                                String str4 = str2;
                                Modifier modifier10 = modifier4;
                                boolean z17 = z10;
                                boolean z18 = z9;
                                boolean z19 = z11;
                                Function2 function7 = function5;
                                Function0 function8 = function6;
                                int i110 = i;
                                isUiFocusable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3, str4, modifier10, z17, z18, z19, function7, function8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i110 | 1), i2);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z6 = z3;
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                if ((i3 & 4793491) == 4793490) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    } else {
                        z8 = z6;
                    }
                    if (i10 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceGroup(-315628145);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function1 = (Function0) objRememberedValue2;
                    } else {
                        function1 = function0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                    }
                    Modifier modifierM590clickableXHw0xAI$default6 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                    FontFamily FontFamily6 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                    long sp6 = TextUnitKt.getSp(16);
                    if (z5) {
                        jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                    } else {
                        jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                    }
                    TextStyle textStyle6 = new TextStyle(jM4254getUnspecified0d7_KjU, sp6, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily6, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                    TextFieldColors textFieldColorsM2256colors0hiis_5 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                    RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_9 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                    composerStartRestartGroup.startReplaceGroup(-315621203);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Intrinsics.checkNotNullParameter((String) obj, "");
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    int i110 = i3;
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z17 = z5;
                    composer2 = composerStartRestartGroup;
                    Modifier modifier10 = modifier3;
                    OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default6, z17, z7, textStyle6, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_9, textFieldColorsM2256colors0hiis_5, composer2, (i110 & 14) | 1572912 | ((i110 >> 3) & 7168) | (57344 & (i110 << 3)) | ((i110 << 9) & 1879048192), (i110 >> 6) & 7168, 0, 2088320);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z9 = z17;
                    modifier4 = modifier10;
                    z10 = z7;
                    z11 = z8;
                    function5 = function4;
                    function6 = function1;
                } else {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    } else {
                        z8 = z6;
                    }
                    if (i10 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceGroup(-315628145);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function1 = (Function0) objRememberedValue2;
                    } else {
                        function1 = function0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                    }
                    Modifier modifierM590clickableXHw0xAI$default7 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                    FontFamily FontFamily7 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                    long sp7 = TextUnitKt.getSp(16);
                    if (z5) {
                        jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                    } else {
                        jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                    }
                    TextStyle textStyle7 = new TextStyle(jM4254getUnspecified0d7_KjU, sp7, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily7, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                    TextFieldColors textFieldColorsM2256colors0hiis_6 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                    RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_10 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                    composerStartRestartGroup.startReplaceGroup(-315621203);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Intrinsics.checkNotNullParameter((String) obj, "");
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    int i111 = i3;
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z18 = z5;
                    composer2 = composerStartRestartGroup;
                    Modifier modifier11 = modifier3;
                    OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default7, z18, z7, textStyle7, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_10, textFieldColorsM2256colors0hiis_6, composer2, (i111 & 14) | 1572912 | ((i111 >> 3) & 7168) | (57344 & (i111 << 3)) | ((i111 << 9) & 1879048192), (i111 >> 6) & 7168, 0, 2088320);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z9 = z18;
                    modifier4 = modifier11;
                    z10 = z7;
                    z11 = z8;
                    function5 = function4;
                    function6 = function1;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ActionModeCallback
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            String str3 = str;
                            String str4 = str2;
                            Modifier modifier12 = modifier4;
                            boolean z19 = z10;
                            boolean z110 = z9;
                            boolean z111 = z11;
                            Function2 function7 = function5;
                            Function0 function8 = function6;
                            int i112 = i;
                            isUiFocusable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3, str4, modifier12, z19, z110, z111, function7, function8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i112 | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 3072;
            z4 = z;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    z5 = z2;
                    if (composerStartRestartGroup.changed(z5)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        z6 = z3;
                        if (composerStartRestartGroup.changed(z6)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                        function3 = function2;
                    } else {
                        function3 = function2;
                        if ((i & 1572864) == 0) {
                            if (composerStartRestartGroup.changedInstance(function3)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changedInstance(function0)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 4793491) == 4793490) {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z7 = false;
                        } else {
                            z7 = z4;
                        }
                        if (i6 != 0) {
                            z5 = true;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        } else {
                            z8 = z6;
                        }
                        if (i10 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceGroup(-315628145);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function1 = (Function0) objRememberedValue2;
                        } else {
                            function1 = function0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                        }
                        Modifier modifierM590clickableXHw0xAI$default8 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                        FontFamily FontFamily8 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                        long sp8 = TextUnitKt.getSp(16);
                        if (z5) {
                            jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                        } else {
                            jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                        }
                        TextStyle textStyle8 = new TextStyle(jM4254getUnspecified0d7_KjU, sp8, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily8, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                        TextFieldColors textFieldColorsM2256colors0hiis_7 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                        RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_11 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                        composerStartRestartGroup.startReplaceGroup(-315621203);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Intrinsics.checkNotNullParameter((String) obj, "");
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        int i112 = i3;
                        composerStartRestartGroup.endReplaceGroup();
                        boolean z19 = z5;
                        composer2 = composerStartRestartGroup;
                        Modifier modifier12 = modifier3;
                        OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default8, z19, z7, textStyle8, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_11, textFieldColorsM2256colors0hiis_7, composer2, (i112 & 14) | 1572912 | ((i112 >> 3) & 7168) | (57344 & (i112 << 3)) | ((i112 << 9) & 1879048192), (i112 >> 6) & 7168, 0, 2088320);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z9 = z19;
                        modifier4 = modifier12;
                        z10 = z7;
                        z11 = z8;
                        function5 = function4;
                        function6 = function1;
                    } else {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z7 = false;
                        } else {
                            z7 = z4;
                        }
                        if (i6 != 0) {
                            z5 = true;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        } else {
                            z8 = z6;
                        }
                        if (i10 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceGroup(-315628145);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function1 = (Function0) objRememberedValue2;
                        } else {
                            function1 = function0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                        }
                        Modifier modifierM590clickableXHw0xAI$default9 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                        FontFamily FontFamily9 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                        long sp9 = TextUnitKt.getSp(16);
                        if (z5) {
                            jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                        } else {
                            jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                        }
                        TextStyle textStyle9 = new TextStyle(jM4254getUnspecified0d7_KjU, sp9, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily9, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                        TextFieldColors textFieldColorsM2256colors0hiis_8 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                        RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_12 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                        composerStartRestartGroup.startReplaceGroup(-315621203);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Intrinsics.checkNotNullParameter((String) obj, "");
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        int i113 = i3;
                        composerStartRestartGroup.endReplaceGroup();
                        boolean z110 = z5;
                        composer2 = composerStartRestartGroup;
                        Modifier modifier13 = modifier3;
                        OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default9, z110, z7, textStyle9, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_12, textFieldColorsM2256colors0hiis_8, composer2, (i113 & 14) | 1572912 | ((i113 >> 3) & 7168) | (57344 & (i113 << 3)) | ((i113 << 9) & 1879048192), (i113 >> 6) & 7168, 0, 2088320);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z9 = z110;
                        modifier4 = modifier13;
                        z10 = z7;
                        z11 = z8;
                        function5 = function4;
                        function6 = function1;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ActionModeCallback
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                String str3 = str;
                                String str4 = str2;
                                Modifier modifier14 = modifier4;
                                boolean z111 = z10;
                                boolean z112 = z9;
                                boolean z113 = z11;
                                Function2 function7 = function5;
                                Function0 function8 = function6;
                                int i114 = i;
                                isUiFocusable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3, str4, modifier14, z111, z112, z113, function7, function8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i114 | 1), i2);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z6 = z3;
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                if ((i3 & 4793491) == 4793490) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    } else {
                        z8 = z6;
                    }
                    if (i10 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceGroup(-315628145);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function1 = (Function0) objRememberedValue2;
                    } else {
                        function1 = function0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                    }
                    Modifier modifierM590clickableXHw0xAI$default10 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                    FontFamily FontFamily10 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                    long sp10 = TextUnitKt.getSp(16);
                    if (z5) {
                        jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                    } else {
                        jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                    }
                    TextStyle textStyle10 = new TextStyle(jM4254getUnspecified0d7_KjU, sp10, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily10, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                    TextFieldColors textFieldColorsM2256colors0hiis_9 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                    RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_13 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                    composerStartRestartGroup.startReplaceGroup(-315621203);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Intrinsics.checkNotNullParameter((String) obj, "");
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    int i114 = i3;
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z111 = z5;
                    composer2 = composerStartRestartGroup;
                    Modifier modifier14 = modifier3;
                    OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default10, z111, z7, textStyle10, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_13, textFieldColorsM2256colors0hiis_9, composer2, (i114 & 14) | 1572912 | ((i114 >> 3) & 7168) | (57344 & (i114 << 3)) | ((i114 << 9) & 1879048192), (i114 >> 6) & 7168, 0, 2088320);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z9 = z111;
                    modifier4 = modifier14;
                    z10 = z7;
                    z11 = z8;
                    function5 = function4;
                    function6 = function1;
                } else {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    } else {
                        z8 = z6;
                    }
                    if (i10 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceGroup(-315628145);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function1 = (Function0) objRememberedValue2;
                    } else {
                        function1 = function0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                    }
                    Modifier modifierM590clickableXHw0xAI$default11 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                    FontFamily FontFamily11 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                    long sp11 = TextUnitKt.getSp(16);
                    if (z5) {
                        jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                    } else {
                        jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                    }
                    TextStyle textStyle11 = new TextStyle(jM4254getUnspecified0d7_KjU, sp11, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily11, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                    TextFieldColors textFieldColorsM2256colors0hiis_10 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                    RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_14 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                    composerStartRestartGroup.startReplaceGroup(-315621203);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Intrinsics.checkNotNullParameter((String) obj, "");
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    int i115 = i3;
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z112 = z5;
                    composer2 = composerStartRestartGroup;
                    Modifier modifier15 = modifier3;
                    OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default11, z112, z7, textStyle11, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_14, textFieldColorsM2256colors0hiis_10, composer2, (i115 & 14) | 1572912 | ((i115 >> 3) & 7168) | (57344 & (i115 << 3)) | ((i115 << 9) & 1879048192), (i115 >> 6) & 7168, 0, 2088320);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z9 = z112;
                    modifier4 = modifier15;
                    z10 = z7;
                    z11 = z8;
                    function5 = function4;
                    function6 = function1;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ActionModeCallback
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            String str3 = str;
                            String str4 = str2;
                            Modifier modifier16 = modifier4;
                            boolean z113 = z10;
                            boolean z114 = z9;
                            boolean z115 = z11;
                            Function2 function7 = function5;
                            Function0 function8 = function6;
                            int i116 = i;
                            isUiFocusable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3, str4, modifier16, z113, z114, z115, function7, function8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i116 | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 24576;
            z5 = z2;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    z6 = z3;
                    if (composerStartRestartGroup.changed(z6)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                if ((i3 & 4793491) == 4793490) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    } else {
                        z8 = z6;
                    }
                    if (i10 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceGroup(-315628145);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function1 = (Function0) objRememberedValue2;
                    } else {
                        function1 = function0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                    }
                    Modifier modifierM590clickableXHw0xAI$default12 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                    FontFamily FontFamily12 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                    long sp12 = TextUnitKt.getSp(16);
                    if (z5) {
                        jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                    } else {
                        jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                    }
                    TextStyle textStyle12 = new TextStyle(jM4254getUnspecified0d7_KjU, sp12, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily12, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                    TextFieldColors textFieldColorsM2256colors0hiis_11 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                    RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_15 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                    composerStartRestartGroup.startReplaceGroup(-315621203);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Intrinsics.checkNotNullParameter((String) obj, "");
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    int i116 = i3;
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z113 = z5;
                    composer2 = composerStartRestartGroup;
                    Modifier modifier16 = modifier3;
                    OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default12, z113, z7, textStyle12, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_15, textFieldColorsM2256colors0hiis_11, composer2, (i116 & 14) | 1572912 | ((i116 >> 3) & 7168) | (57344 & (i116 << 3)) | ((i116 << 9) & 1879048192), (i116 >> 6) & 7168, 0, 2088320);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z9 = z113;
                    modifier4 = modifier16;
                    z10 = z7;
                    z11 = z8;
                    function5 = function4;
                    function6 = function1;
                } else {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    } else {
                        z8 = z6;
                    }
                    if (i10 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceGroup(-315628145);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function1 = (Function0) objRememberedValue2;
                    } else {
                        function1 = function0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                    }
                    Modifier modifierM590clickableXHw0xAI$default13 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                    FontFamily FontFamily13 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                    long sp13 = TextUnitKt.getSp(16);
                    if (z5) {
                        jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                    } else {
                        jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                    }
                    TextStyle textStyle13 = new TextStyle(jM4254getUnspecified0d7_KjU, sp13, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily13, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                    TextFieldColors textFieldColorsM2256colors0hiis_12 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                    RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_16 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                    composerStartRestartGroup.startReplaceGroup(-315621203);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Intrinsics.checkNotNullParameter((String) obj, "");
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    int i117 = i3;
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z114 = z5;
                    composer2 = composerStartRestartGroup;
                    Modifier modifier17 = modifier3;
                    OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default13, z114, z7, textStyle13, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_16, textFieldColorsM2256colors0hiis_12, composer2, (i117 & 14) | 1572912 | ((i117 >> 3) & 7168) | (57344 & (i117 << 3)) | ((i117 << 9) & 1879048192), (i117 >> 6) & 7168, 0, 2088320);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z9 = z114;
                    modifier4 = modifier17;
                    z10 = z7;
                    z11 = z8;
                    function5 = function4;
                    function6 = function1;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ActionModeCallback
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            String str3 = str;
                            String str4 = str2;
                            Modifier modifier18 = modifier4;
                            boolean z115 = z10;
                            boolean z116 = z9;
                            boolean z117 = z11;
                            Function2 function7 = function5;
                            Function0 function8 = function6;
                            int i118 = i;
                            isUiFocusable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3, str4, modifier18, z115, z116, z117, function7, function8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i118 | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z6 = z3;
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
                function3 = function2;
            } else {
                function3 = function2;
                if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i3 |= i13;
            }
            if ((i3 & 4793491) == 4793490) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z7 = false;
                } else {
                    z7 = z4;
                }
                if (i6 != 0) {
                    z5 = true;
                }
                if (i8 != 0) {
                    z8 = false;
                } else {
                    z8 = z6;
                }
                if (i10 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i12 != 0) {
                    composerStartRestartGroup.startReplaceGroup(-315628145);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function1 = (Function0) objRememberedValue2;
                } else {
                    function1 = function0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                }
                Modifier modifierM590clickableXHw0xAI$default14 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                FontFamily FontFamily14 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                long sp14 = TextUnitKt.getSp(16);
                if (z5) {
                    jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                } else {
                    jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                }
                TextStyle textStyle14 = new TextStyle(jM4254getUnspecified0d7_KjU, sp14, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily14, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                TextFieldColors textFieldColorsM2256colors0hiis_13 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_17 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                composerStartRestartGroup.startReplaceGroup(-315621203);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Intrinsics.checkNotNullParameter((String) obj, "");
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                int i118 = i3;
                composerStartRestartGroup.endReplaceGroup();
                boolean z115 = z5;
                composer2 = composerStartRestartGroup;
                Modifier modifier18 = modifier3;
                OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default14, z115, z7, textStyle14, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_17, textFieldColorsM2256colors0hiis_13, composer2, (i118 & 14) | 1572912 | ((i118 >> 3) & 7168) | (57344 & (i118 << 3)) | ((i118 << 9) & 1879048192), (i118 >> 6) & 7168, 0, 2088320);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z9 = z115;
                modifier4 = modifier18;
                z10 = z7;
                z11 = z8;
                function5 = function4;
                function6 = function1;
            } else {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z7 = false;
                } else {
                    z7 = z4;
                }
                if (i6 != 0) {
                    z5 = true;
                }
                if (i8 != 0) {
                    z8 = false;
                } else {
                    z8 = z6;
                }
                if (i10 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i12 != 0) {
                    composerStartRestartGroup.startReplaceGroup(-315628145);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function1 = (Function0) objRememberedValue2;
                } else {
                    function1 = function0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                }
                Modifier modifierM590clickableXHw0xAI$default15 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                FontFamily FontFamily15 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                long sp15 = TextUnitKt.getSp(16);
                if (z5) {
                    jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                } else {
                    jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                }
                TextStyle textStyle15 = new TextStyle(jM4254getUnspecified0d7_KjU, sp15, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily15, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                TextFieldColors textFieldColorsM2256colors0hiis_14 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_18 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                composerStartRestartGroup.startReplaceGroup(-315621203);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Intrinsics.checkNotNullParameter((String) obj, "");
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                int i119 = i3;
                composerStartRestartGroup.endReplaceGroup();
                boolean z116 = z5;
                composer2 = composerStartRestartGroup;
                Modifier modifier19 = modifier3;
                OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default15, z116, z7, textStyle15, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_18, textFieldColorsM2256colors0hiis_14, composer2, (i119 & 14) | 1572912 | ((i119 >> 3) & 7168) | (57344 & (i119 << 3)) | ((i119 << 9) & 1879048192), (i119 >> 6) & 7168, 0, 2088320);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z9 = z116;
                modifier4 = modifier19;
                z10 = z7;
                z11 = z8;
                function5 = function4;
                function6 = function1;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ActionModeCallback
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String str3 = str;
                        String str4 = str2;
                        Modifier modifier110 = modifier4;
                        boolean z117 = z10;
                        boolean z118 = z9;
                        boolean z119 = z11;
                        Function2 function7 = function5;
                        Function0 function8 = function6;
                        int i1110 = i;
                        isUiFocusable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3, str4, modifier110, z117, z118, z119, function7, function8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i1110 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z4 = z;
                if (composerStartRestartGroup.changed(z4)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    z5 = z2;
                    if (composerStartRestartGroup.changed(z5)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        z6 = z3;
                        if (composerStartRestartGroup.changed(z6)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                        function3 = function2;
                    } else {
                        function3 = function2;
                        if ((i & 1572864) == 0) {
                            if (composerStartRestartGroup.changedInstance(function3)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changedInstance(function0)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 4793491) == 4793490) {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z7 = false;
                        } else {
                            z7 = z4;
                        }
                        if (i6 != 0) {
                            z5 = true;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        } else {
                            z8 = z6;
                        }
                        if (i10 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceGroup(-315628145);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function1 = (Function0) objRememberedValue2;
                        } else {
                            function1 = function0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                        }
                        Modifier modifierM590clickableXHw0xAI$default16 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                        FontFamily FontFamily16 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                        long sp16 = TextUnitKt.getSp(16);
                        if (z5) {
                            jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                        } else {
                            jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                        }
                        TextStyle textStyle16 = new TextStyle(jM4254getUnspecified0d7_KjU, sp16, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily16, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                        TextFieldColors textFieldColorsM2256colors0hiis_15 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                        RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_19 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                        composerStartRestartGroup.startReplaceGroup(-315621203);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Intrinsics.checkNotNullParameter((String) obj, "");
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        int i1110 = i3;
                        composerStartRestartGroup.endReplaceGroup();
                        boolean z117 = z5;
                        composer2 = composerStartRestartGroup;
                        Modifier modifier110 = modifier3;
                        OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default16, z117, z7, textStyle16, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_19, textFieldColorsM2256colors0hiis_15, composer2, (i1110 & 14) | 1572912 | ((i1110 >> 3) & 7168) | (57344 & (i1110 << 3)) | ((i1110 << 9) & 1879048192), (i1110 >> 6) & 7168, 0, 2088320);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z9 = z117;
                        modifier4 = modifier110;
                        z10 = z7;
                        z11 = z8;
                        function5 = function4;
                        function6 = function1;
                    } else {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z7 = false;
                        } else {
                            z7 = z4;
                        }
                        if (i6 != 0) {
                            z5 = true;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        } else {
                            z8 = z6;
                        }
                        if (i10 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceGroup(-315628145);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function1 = (Function0) objRememberedValue2;
                        } else {
                            function1 = function0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                        }
                        Modifier modifierM590clickableXHw0xAI$default17 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                        FontFamily FontFamily17 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                        long sp17 = TextUnitKt.getSp(16);
                        if (z5) {
                            jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                        } else {
                            jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                        }
                        TextStyle textStyle17 = new TextStyle(jM4254getUnspecified0d7_KjU, sp17, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily17, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                        TextFieldColors textFieldColorsM2256colors0hiis_16 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                        RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_110 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                        composerStartRestartGroup.startReplaceGroup(-315621203);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Intrinsics.checkNotNullParameter((String) obj, "");
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        int i1111 = i3;
                        composerStartRestartGroup.endReplaceGroup();
                        boolean z118 = z5;
                        composer2 = composerStartRestartGroup;
                        Modifier modifier111 = modifier3;
                        OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default17, z118, z7, textStyle17, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_110, textFieldColorsM2256colors0hiis_16, composer2, (i1111 & 14) | 1572912 | ((i1111 >> 3) & 7168) | (57344 & (i1111 << 3)) | ((i1111 << 9) & 1879048192), (i1111 >> 6) & 7168, 0, 2088320);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z9 = z118;
                        modifier4 = modifier111;
                        z10 = z7;
                        z11 = z8;
                        function5 = function4;
                        function6 = function1;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ActionModeCallback
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                String str3 = str;
                                String str4 = str2;
                                Modifier modifier112 = modifier4;
                                boolean z119 = z10;
                                boolean z1110 = z9;
                                boolean z1111 = z11;
                                Function2 function7 = function5;
                                Function0 function8 = function6;
                                int i1112 = i;
                                isUiFocusable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3, str4, modifier112, z119, z1110, z1111, function7, function8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i1112 | 1), i2);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z6 = z3;
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                if ((i3 & 4793491) == 4793490) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    } else {
                        z8 = z6;
                    }
                    if (i10 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceGroup(-315628145);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function1 = (Function0) objRememberedValue2;
                    } else {
                        function1 = function0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                    }
                    Modifier modifierM590clickableXHw0xAI$default18 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                    FontFamily FontFamily18 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                    long sp18 = TextUnitKt.getSp(16);
                    if (z5) {
                        jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                    } else {
                        jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                    }
                    TextStyle textStyle18 = new TextStyle(jM4254getUnspecified0d7_KjU, sp18, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily18, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                    TextFieldColors textFieldColorsM2256colors0hiis_17 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                    RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_111 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                    composerStartRestartGroup.startReplaceGroup(-315621203);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Intrinsics.checkNotNullParameter((String) obj, "");
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    int i1112 = i3;
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z119 = z5;
                    composer2 = composerStartRestartGroup;
                    Modifier modifier112 = modifier3;
                    OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default18, z119, z7, textStyle18, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_111, textFieldColorsM2256colors0hiis_17, composer2, (i1112 & 14) | 1572912 | ((i1112 >> 3) & 7168) | (57344 & (i1112 << 3)) | ((i1112 << 9) & 1879048192), (i1112 >> 6) & 7168, 0, 2088320);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z9 = z119;
                    modifier4 = modifier112;
                    z10 = z7;
                    z11 = z8;
                    function5 = function4;
                    function6 = function1;
                } else {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    } else {
                        z8 = z6;
                    }
                    if (i10 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceGroup(-315628145);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function1 = (Function0) objRememberedValue2;
                    } else {
                        function1 = function0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                    }
                    Modifier modifierM590clickableXHw0xAI$default19 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                    FontFamily FontFamily19 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                    long sp19 = TextUnitKt.getSp(16);
                    if (z5) {
                        jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                    } else {
                        jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                    }
                    TextStyle textStyle19 = new TextStyle(jM4254getUnspecified0d7_KjU, sp19, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily19, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                    TextFieldColors textFieldColorsM2256colors0hiis_18 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                    RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_112 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                    composerStartRestartGroup.startReplaceGroup(-315621203);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Intrinsics.checkNotNullParameter((String) obj, "");
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    int i1113 = i3;
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z1110 = z5;
                    composer2 = composerStartRestartGroup;
                    Modifier modifier113 = modifier3;
                    OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default19, z1110, z7, textStyle19, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_112, textFieldColorsM2256colors0hiis_18, composer2, (i1113 & 14) | 1572912 | ((i1113 >> 3) & 7168) | (57344 & (i1113 << 3)) | ((i1113 << 9) & 1879048192), (i1113 >> 6) & 7168, 0, 2088320);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z9 = z1110;
                    modifier4 = modifier113;
                    z10 = z7;
                    z11 = z8;
                    function5 = function4;
                    function6 = function1;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ActionModeCallback
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            String str3 = str;
                            String str4 = str2;
                            Modifier modifier114 = modifier4;
                            boolean z1111 = z10;
                            boolean z1112 = z9;
                            boolean z1113 = z11;
                            Function2 function7 = function5;
                            Function0 function8 = function6;
                            int i1114 = i;
                            isUiFocusable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3, str4, modifier114, z1111, z1112, z1113, function7, function8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i1114 | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 24576;
            z5 = z2;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    z6 = z3;
                    if (composerStartRestartGroup.changed(z6)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                if ((i3 & 4793491) == 4793490) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    } else {
                        z8 = z6;
                    }
                    if (i10 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceGroup(-315628145);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function1 = (Function0) objRememberedValue2;
                    } else {
                        function1 = function0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                    }
                    Modifier modifierM590clickableXHw0xAI$default110 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                    FontFamily FontFamily110 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                    long sp110 = TextUnitKt.getSp(16);
                    if (z5) {
                        jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                    } else {
                        jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                    }
                    TextStyle textStyle110 = new TextStyle(jM4254getUnspecified0d7_KjU, sp110, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily110, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                    TextFieldColors textFieldColorsM2256colors0hiis_19 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                    RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_113 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                    composerStartRestartGroup.startReplaceGroup(-315621203);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Intrinsics.checkNotNullParameter((String) obj, "");
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    int i1114 = i3;
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z1111 = z5;
                    composer2 = composerStartRestartGroup;
                    Modifier modifier114 = modifier3;
                    OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default110, z1111, z7, textStyle110, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_113, textFieldColorsM2256colors0hiis_19, composer2, (i1114 & 14) | 1572912 | ((i1114 >> 3) & 7168) | (57344 & (i1114 << 3)) | ((i1114 << 9) & 1879048192), (i1114 >> 6) & 7168, 0, 2088320);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z9 = z1111;
                    modifier4 = modifier114;
                    z10 = z7;
                    z11 = z8;
                    function5 = function4;
                    function6 = function1;
                } else {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    } else {
                        z8 = z6;
                    }
                    if (i10 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceGroup(-315628145);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function1 = (Function0) objRememberedValue2;
                    } else {
                        function1 = function0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                    }
                    Modifier modifierM590clickableXHw0xAI$default111 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                    FontFamily FontFamily111 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                    long sp111 = TextUnitKt.getSp(16);
                    if (z5) {
                        jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                    } else {
                        jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                    }
                    TextStyle textStyle111 = new TextStyle(jM4254getUnspecified0d7_KjU, sp111, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily111, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                    TextFieldColors textFieldColorsM2256colors0hiis_110 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                    RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_114 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                    composerStartRestartGroup.startReplaceGroup(-315621203);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Intrinsics.checkNotNullParameter((String) obj, "");
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    int i1115 = i3;
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z1112 = z5;
                    composer2 = composerStartRestartGroup;
                    Modifier modifier115 = modifier3;
                    OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default111, z1112, z7, textStyle111, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_114, textFieldColorsM2256colors0hiis_110, composer2, (i1115 & 14) | 1572912 | ((i1115 >> 3) & 7168) | (57344 & (i1115 << 3)) | ((i1115 << 9) & 1879048192), (i1115 >> 6) & 7168, 0, 2088320);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z9 = z1112;
                    modifier4 = modifier115;
                    z10 = z7;
                    z11 = z8;
                    function5 = function4;
                    function6 = function1;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ActionModeCallback
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            String str3 = str;
                            String str4 = str2;
                            Modifier modifier116 = modifier4;
                            boolean z1113 = z10;
                            boolean z1114 = z9;
                            boolean z1115 = z11;
                            Function2 function7 = function5;
                            Function0 function8 = function6;
                            int i1116 = i;
                            isUiFocusable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3, str4, modifier116, z1113, z1114, z1115, function7, function8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i1116 | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z6 = z3;
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
                function3 = function2;
            } else {
                function3 = function2;
                if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i3 |= i13;
            }
            if ((i3 & 4793491) == 4793490) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z7 = false;
                } else {
                    z7 = z4;
                }
                if (i6 != 0) {
                    z5 = true;
                }
                if (i8 != 0) {
                    z8 = false;
                } else {
                    z8 = z6;
                }
                if (i10 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i12 != 0) {
                    composerStartRestartGroup.startReplaceGroup(-315628145);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function1 = (Function0) objRememberedValue2;
                } else {
                    function1 = function0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                }
                Modifier modifierM590clickableXHw0xAI$default112 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                FontFamily FontFamily112 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                long sp112 = TextUnitKt.getSp(16);
                if (z5) {
                    jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                } else {
                    jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                }
                TextStyle textStyle112 = new TextStyle(jM4254getUnspecified0d7_KjU, sp112, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily112, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                TextFieldColors textFieldColorsM2256colors0hiis_111 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_115 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                composerStartRestartGroup.startReplaceGroup(-315621203);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Intrinsics.checkNotNullParameter((String) obj, "");
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                int i1116 = i3;
                composerStartRestartGroup.endReplaceGroup();
                boolean z1113 = z5;
                composer2 = composerStartRestartGroup;
                Modifier modifier116 = modifier3;
                OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default112, z1113, z7, textStyle112, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_115, textFieldColorsM2256colors0hiis_111, composer2, (i1116 & 14) | 1572912 | ((i1116 >> 3) & 7168) | (57344 & (i1116 << 3)) | ((i1116 << 9) & 1879048192), (i1116 >> 6) & 7168, 0, 2088320);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z9 = z1113;
                modifier4 = modifier116;
                z10 = z7;
                z11 = z8;
                function5 = function4;
                function6 = function1;
            } else {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z7 = false;
                } else {
                    z7 = z4;
                }
                if (i6 != 0) {
                    z5 = true;
                }
                if (i8 != 0) {
                    z8 = false;
                } else {
                    z8 = z6;
                }
                if (i10 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i12 != 0) {
                    composerStartRestartGroup.startReplaceGroup(-315628145);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function1 = (Function0) objRememberedValue2;
                } else {
                    function1 = function0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                }
                Modifier modifierM590clickableXHw0xAI$default113 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                FontFamily FontFamily113 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                long sp113 = TextUnitKt.getSp(16);
                if (z5) {
                    jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                } else {
                    jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                }
                TextStyle textStyle113 = new TextStyle(jM4254getUnspecified0d7_KjU, sp113, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily113, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                TextFieldColors textFieldColorsM2256colors0hiis_112 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_116 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                composerStartRestartGroup.startReplaceGroup(-315621203);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Intrinsics.checkNotNullParameter((String) obj, "");
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                int i1117 = i3;
                composerStartRestartGroup.endReplaceGroup();
                boolean z1114 = z5;
                composer2 = composerStartRestartGroup;
                Modifier modifier117 = modifier3;
                OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default113, z1114, z7, textStyle113, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_116, textFieldColorsM2256colors0hiis_112, composer2, (i1117 & 14) | 1572912 | ((i1117 >> 3) & 7168) | (57344 & (i1117 << 3)) | ((i1117 << 9) & 1879048192), (i1117 >> 6) & 7168, 0, 2088320);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z9 = z1114;
                modifier4 = modifier117;
                z10 = z7;
                z11 = z8;
                function5 = function4;
                function6 = function1;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ActionModeCallback
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String str3 = str;
                        String str4 = str2;
                        Modifier modifier118 = modifier4;
                        boolean z1115 = z10;
                        boolean z1116 = z9;
                        boolean z1117 = z11;
                        Function2 function7 = function5;
                        Function0 function8 = function6;
                        int i1118 = i;
                        isUiFocusable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3, str4, modifier118, z1115, z1116, z1117, function7, function8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i1118 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 3072;
        z4 = z;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                z5 = z2;
                if (composerStartRestartGroup.changed(z5)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    z6 = z3;
                    if (composerStartRestartGroup.changed(z6)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                if ((i3 & 4793491) == 4793490) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    } else {
                        z8 = z6;
                    }
                    if (i10 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceGroup(-315628145);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function1 = (Function0) objRememberedValue2;
                    } else {
                        function1 = function0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                    }
                    Modifier modifierM590clickableXHw0xAI$default114 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                    FontFamily FontFamily114 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                    long sp114 = TextUnitKt.getSp(16);
                    if (z5) {
                        jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                    } else {
                        jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                    }
                    TextStyle textStyle114 = new TextStyle(jM4254getUnspecified0d7_KjU, sp114, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily114, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                    TextFieldColors textFieldColorsM2256colors0hiis_113 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                    RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_117 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                    composerStartRestartGroup.startReplaceGroup(-315621203);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Intrinsics.checkNotNullParameter((String) obj, "");
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    int i1118 = i3;
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z1115 = z5;
                    composer2 = composerStartRestartGroup;
                    Modifier modifier118 = modifier3;
                    OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default114, z1115, z7, textStyle114, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_117, textFieldColorsM2256colors0hiis_113, composer2, (i1118 & 14) | 1572912 | ((i1118 >> 3) & 7168) | (57344 & (i1118 << 3)) | ((i1118 << 9) & 1879048192), (i1118 >> 6) & 7168, 0, 2088320);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z9 = z1115;
                    modifier4 = modifier118;
                    z10 = z7;
                    z11 = z8;
                    function5 = function4;
                    function6 = function1;
                } else {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    } else {
                        z8 = z6;
                    }
                    if (i10 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceGroup(-315628145);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function1 = (Function0) objRememberedValue2;
                    } else {
                        function1 = function0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                    }
                    Modifier modifierM590clickableXHw0xAI$default115 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                    FontFamily FontFamily115 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                    long sp115 = TextUnitKt.getSp(16);
                    if (z5) {
                        jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                    } else {
                        jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                    }
                    TextStyle textStyle115 = new TextStyle(jM4254getUnspecified0d7_KjU, sp115, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily115, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                    TextFieldColors textFieldColorsM2256colors0hiis_114 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                    RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_118 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                    composerStartRestartGroup.startReplaceGroup(-315621203);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Intrinsics.checkNotNullParameter((String) obj, "");
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    int i1119 = i3;
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z1116 = z5;
                    composer2 = composerStartRestartGroup;
                    Modifier modifier119 = modifier3;
                    OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default115, z1116, z7, textStyle115, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_118, textFieldColorsM2256colors0hiis_114, composer2, (i1119 & 14) | 1572912 | ((i1119 >> 3) & 7168) | (57344 & (i1119 << 3)) | ((i1119 << 9) & 1879048192), (i1119 >> 6) & 7168, 0, 2088320);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z9 = z1116;
                    modifier4 = modifier119;
                    z10 = z7;
                    z11 = z8;
                    function5 = function4;
                    function6 = function1;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ActionModeCallback
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            String str3 = str;
                            String str4 = str2;
                            Modifier modifier1110 = modifier4;
                            boolean z1117 = z10;
                            boolean z1118 = z9;
                            boolean z1119 = z11;
                            Function2 function7 = function5;
                            Function0 function8 = function6;
                            int i11110 = i;
                            isUiFocusable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3, str4, modifier1110, z1117, z1118, z1119, function7, function8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i11110 | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z6 = z3;
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
                function3 = function2;
            } else {
                function3 = function2;
                if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i3 |= i13;
            }
            if ((i3 & 4793491) == 4793490) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z7 = false;
                } else {
                    z7 = z4;
                }
                if (i6 != 0) {
                    z5 = true;
                }
                if (i8 != 0) {
                    z8 = false;
                } else {
                    z8 = z6;
                }
                if (i10 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i12 != 0) {
                    composerStartRestartGroup.startReplaceGroup(-315628145);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function1 = (Function0) objRememberedValue2;
                } else {
                    function1 = function0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                }
                Modifier modifierM590clickableXHw0xAI$default116 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                FontFamily FontFamily116 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                long sp116 = TextUnitKt.getSp(16);
                if (z5) {
                    jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                } else {
                    jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                }
                TextStyle textStyle116 = new TextStyle(jM4254getUnspecified0d7_KjU, sp116, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily116, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                TextFieldColors textFieldColorsM2256colors0hiis_115 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_119 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                composerStartRestartGroup.startReplaceGroup(-315621203);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Intrinsics.checkNotNullParameter((String) obj, "");
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                int i11110 = i3;
                composerStartRestartGroup.endReplaceGroup();
                boolean z1117 = z5;
                composer2 = composerStartRestartGroup;
                Modifier modifier1110 = modifier3;
                OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default116, z1117, z7, textStyle116, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_119, textFieldColorsM2256colors0hiis_115, composer2, (i11110 & 14) | 1572912 | ((i11110 >> 3) & 7168) | (57344 & (i11110 << 3)) | ((i11110 << 9) & 1879048192), (i11110 >> 6) & 7168, 0, 2088320);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z9 = z1117;
                modifier4 = modifier1110;
                z10 = z7;
                z11 = z8;
                function5 = function4;
                function6 = function1;
            } else {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z7 = false;
                } else {
                    z7 = z4;
                }
                if (i6 != 0) {
                    z5 = true;
                }
                if (i8 != 0) {
                    z8 = false;
                } else {
                    z8 = z6;
                }
                if (i10 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i12 != 0) {
                    composerStartRestartGroup.startReplaceGroup(-315628145);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function1 = (Function0) objRememberedValue2;
                } else {
                    function1 = function0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                }
                Modifier modifierM590clickableXHw0xAI$default117 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                FontFamily FontFamily117 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                long sp117 = TextUnitKt.getSp(16);
                if (z5) {
                    jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                } else {
                    jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                }
                TextStyle textStyle117 = new TextStyle(jM4254getUnspecified0d7_KjU, sp117, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily117, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                TextFieldColors textFieldColorsM2256colors0hiis_116 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_1110 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                composerStartRestartGroup.startReplaceGroup(-315621203);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Intrinsics.checkNotNullParameter((String) obj, "");
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                int i11111 = i3;
                composerStartRestartGroup.endReplaceGroup();
                boolean z1118 = z5;
                composer2 = composerStartRestartGroup;
                Modifier modifier1111 = modifier3;
                OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default117, z1118, z7, textStyle117, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_1110, textFieldColorsM2256colors0hiis_116, composer2, (i11111 & 14) | 1572912 | ((i11111 >> 3) & 7168) | (57344 & (i11111 << 3)) | ((i11111 << 9) & 1879048192), (i11111 >> 6) & 7168, 0, 2088320);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z9 = z1118;
                modifier4 = modifier1111;
                z10 = z7;
                z11 = z8;
                function5 = function4;
                function6 = function1;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ActionModeCallback
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String str3 = str;
                        String str4 = str2;
                        Modifier modifier1112 = modifier4;
                        boolean z1119 = z10;
                        boolean z11110 = z9;
                        boolean z11111 = z11;
                        Function2 function7 = function5;
                        Function0 function8 = function6;
                        int i11112 = i;
                        isUiFocusable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3, str4, modifier1112, z1119, z11110, z11111, function7, function8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i11112 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 24576;
        z5 = z2;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                z6 = z3;
                if (composerStartRestartGroup.changed(z6)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
                function3 = function2;
            } else {
                function3 = function2;
                if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i3 |= i13;
            }
            if ((i3 & 4793491) == 4793490) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z7 = false;
                } else {
                    z7 = z4;
                }
                if (i6 != 0) {
                    z5 = true;
                }
                if (i8 != 0) {
                    z8 = false;
                } else {
                    z8 = z6;
                }
                if (i10 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i12 != 0) {
                    composerStartRestartGroup.startReplaceGroup(-315628145);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function1 = (Function0) objRememberedValue2;
                } else {
                    function1 = function0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                }
                Modifier modifierM590clickableXHw0xAI$default118 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                FontFamily FontFamily118 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                long sp118 = TextUnitKt.getSp(16);
                if (z5) {
                    jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                } else {
                    jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                }
                TextStyle textStyle118 = new TextStyle(jM4254getUnspecified0d7_KjU, sp118, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily118, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                TextFieldColors textFieldColorsM2256colors0hiis_117 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_1111 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                composerStartRestartGroup.startReplaceGroup(-315621203);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Intrinsics.checkNotNullParameter((String) obj, "");
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                int i11112 = i3;
                composerStartRestartGroup.endReplaceGroup();
                boolean z1119 = z5;
                composer2 = composerStartRestartGroup;
                Modifier modifier1112 = modifier3;
                OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default118, z1119, z7, textStyle118, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_1111, textFieldColorsM2256colors0hiis_117, composer2, (i11112 & 14) | 1572912 | ((i11112 >> 3) & 7168) | (57344 & (i11112 << 3)) | ((i11112 << 9) & 1879048192), (i11112 >> 6) & 7168, 0, 2088320);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z9 = z1119;
                modifier4 = modifier1112;
                z10 = z7;
                z11 = z8;
                function5 = function4;
                function6 = function1;
            } else {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z7 = false;
                } else {
                    z7 = z4;
                }
                if (i6 != 0) {
                    z5 = true;
                }
                if (i8 != 0) {
                    z8 = false;
                } else {
                    z8 = z6;
                }
                if (i10 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i12 != 0) {
                    composerStartRestartGroup.startReplaceGroup(-315628145);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function1 = (Function0) objRememberedValue2;
                } else {
                    function1 = function0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
                }
                Modifier modifierM590clickableXHw0xAI$default119 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
                FontFamily FontFamily119 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
                long sp119 = TextUnitKt.getSp(16);
                if (z5) {
                    jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
                } else {
                    jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
                }
                TextStyle textStyle119 = new TextStyle(jM4254getUnspecified0d7_KjU, sp119, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily119, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                TextFieldColors textFieldColorsM2256colors0hiis_118 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
                RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_1112 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
                composerStartRestartGroup.startReplaceGroup(-315621203);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Intrinsics.checkNotNullParameter((String) obj, "");
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                int i11113 = i3;
                composerStartRestartGroup.endReplaceGroup();
                boolean z11110 = z5;
                composer2 = composerStartRestartGroup;
                Modifier modifier1113 = modifier3;
                OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default119, z11110, z7, textStyle119, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_1112, textFieldColorsM2256colors0hiis_118, composer2, (i11113 & 14) | 1572912 | ((i11113 >> 3) & 7168) | (57344 & (i11113 << 3)) | ((i11113 << 9) & 1879048192), (i11113 >> 6) & 7168, 0, 2088320);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z9 = z11110;
                modifier4 = modifier1113;
                z10 = z7;
                z11 = z8;
                function5 = function4;
                function6 = function1;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ActionModeCallback
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String str3 = str;
                        String str4 = str2;
                        Modifier modifier1114 = modifier4;
                        boolean z11111 = z10;
                        boolean z11112 = z9;
                        boolean z11113 = z11;
                        Function2 function7 = function5;
                        Function0 function8 = function6;
                        int i11114 = i;
                        isUiFocusable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3, str4, modifier1114, z11111, z11112, z11113, function7, function8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i11114 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        z6 = z3;
        i10 = i2 & 64;
        if (i10 != 0) {
            i3 |= 1572864;
            function3 = function2;
        } else {
            function3 = function2;
            if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
        }
        i12 = i2 & 128;
        if (i12 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i3 |= i13;
        }
        if ((i3 & 4793491) == 4793490) {
            if (i14 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                z7 = false;
            } else {
                z7 = z4;
            }
            if (i6 != 0) {
                z5 = true;
            }
            if (i8 != 0) {
                z8 = false;
            } else {
                z8 = z6;
            }
            if (i10 != 0) {
                function4 = null;
            } else {
                function4 = function3;
            }
            if (i12 != 0) {
                composerStartRestartGroup.startReplaceGroup(-315628145);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                function1 = (Function0) objRememberedValue2;
            } else {
                function1 = function0;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
            }
            Modifier modifierM590clickableXHw0xAI$default1110 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
            FontFamily FontFamily1110 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
            long sp1110 = TextUnitKt.getSp(16);
            if (z5) {
                jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
            } else {
                jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
            }
            TextStyle textStyle1110 = new TextStyle(jM4254getUnspecified0d7_KjU, sp1110, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily1110, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
            TextFieldColors textFieldColorsM2256colors0hiis_119 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
            RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_1113 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
            composerStartRestartGroup.startReplaceGroup(-315621203);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Intrinsics.checkNotNullParameter((String) obj, "");
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i11114 = i3;
            composerStartRestartGroup.endReplaceGroup();
            boolean z11111 = z5;
            composer2 = composerStartRestartGroup;
            Modifier modifier1114 = modifier3;
            OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default1110, z11111, z7, textStyle1110, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_1113, textFieldColorsM2256colors0hiis_119, composer2, (i11114 & 14) | 1572912 | ((i11114 >> 3) & 7168) | (57344 & (i11114 << 3)) | ((i11114 << 9) & 1879048192), (i11114 >> 6) & 7168, 0, 2088320);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z9 = z11111;
            modifier4 = modifier1114;
            z10 = z7;
            z11 = z8;
            function5 = function4;
            function6 = function1;
        } else {
            if (i14 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                z7 = false;
            } else {
                z7 = z4;
            }
            if (i6 != 0) {
                z5 = true;
            }
            if (i8 != 0) {
                z8 = false;
            } else {
                z8 = z6;
            }
            if (i10 != 0) {
                function4 = null;
            } else {
                function4 = function3;
            }
            if (i12 != 0) {
                composerStartRestartGroup.startReplaceGroup(-315628145);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: hasEmbeddedTabs
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                function1 = (Function0) objRememberedValue2;
            } else {
                function1 = function0;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-939140220, i3, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField (TextField.kt:30)");
            }
            Modifier modifierM590clickableXHw0xAI$default1111 = ClickableKt.m590clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), true, null, null, function1, 6, null);
            FontFamily FontFamily1111 = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
            long sp1111 = TextUnitKt.getSp(16);
            if (z5) {
                jM4254getUnspecified0d7_KjU = ColorKt.Color(4280032286L);
            } else {
                jM4254getUnspecified0d7_KjU = Color.INSTANCE.m4254getUnspecified0d7_KjU();
            }
            TextStyle textStyle1111 = new TextStyle(jM4254getUnspecified0d7_KjU, sp1111, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily1111, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
            TextFieldColors textFieldColorsM2256colors0hiis_1110 = OutlinedTextFieldDefaults.INSTANCE.m2256colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), Color.INSTANCE.m4255getWhite0d7_KjU(), ColorKt.Color(4294112503L), Color.INSTANCE.m4253getTransparent0d7_KjU(), 0L, 0L, null, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4252getRed0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), ColorKt.Color(4288652199L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 14376960, 28080, 224256, 0, 3072, 2088732431, 4095);
            RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_1114 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(4.0f));
            composerStartRestartGroup.startReplaceGroup(-315621203);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: getTitleOptionalHint
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Intrinsics.checkNotNullParameter((String) obj, "");
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i11115 = i3;
            composerStartRestartGroup.endReplaceGroup();
            boolean z11112 = z5;
            composer2 = composerStartRestartGroup;
            Modifier modifier1115 = modifier3;
            OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM590clickableXHw0xAI$default1111, z11112, z7, textStyle1111, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-2041907414, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, str2), composerStartRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z8, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1285RoundedCornerShape0680j_1114, textFieldColorsM2256colors0hiis_1110, composer2, (i11115 & 14) | 1572912 | ((i11115 >> 3) & 7168) | (57344 & (i11115 << 3)) | ((i11115 << 9) & 1879048192), (i11115 >> 6) & 7168, 0, 2088320);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z9 = z11112;
            modifier4 = modifier1115;
            z10 = z7;
            z11 = z8;
            function5 = function4;
            function6 = function1;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ActionModeCallback
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String str3 = str;
                    String str4 = str2;
                    Modifier modifier1116 = modifier4;
                    boolean z11113 = z10;
                    boolean z11114 = z9;
                    boolean z11115 = z11;
                    Function2 function7 = function5;
                    Function0 function8 = function6;
                    int i11116 = i;
                    isUiFocusable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3, str4, modifier1116, z11113, z11114, z11115, function7, function8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i11116 | 1), i2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Function2<Composer, Integer, Unit> {
        private /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ String b;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2041907414, iIntValue, -1, "com.bpjstku.presentation.compose.common.BpjstkuOutlinedTextField.<anonymous> (TextField.kt:40)");
                }
                TextKt.m2654Text4IGK_g(this.b, (Modifier) null, ColorKt.Color(!this.TuitionPaymentFragmentbindingInflater1 ? 4280032286L : 4288652199L), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 1575936, 0, 130994);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z, String str) {
            this.TuitionPaymentFragmentbindingInflater1 = z;
            this.b = str;
        }
    }
}
