package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
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
import androidx.exifinterface.media.ExifInterface;
import com.bpjstku.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class computeConstantSize {
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x0137  */
    /* JADX WARN: Code duplicated, block: B:66:0x0144  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final String str, final Function0<Unit> function0, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        Modifier modifier3;
        boolean z3;
        Composer composer2;
        final boolean z4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(2089490103);
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
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i3;
                if ((i6 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2089490103, i6, -1, "com.bpjstku.presentation.compose.common.BpjstkuButton (Buttons.kt:28)");
                    }
                    Modifier modifier5 = modifier3;
                    composer2 = composerStartRestartGroup;
                    int i8 = i6 >> 3;
                    ButtonKt.Button(function0, SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), Dp.m6935constructorimpl(50.0f)), z3, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(10.0f)), ButtonDefaults.INSTANCE.m1797buttonColorsro_MJ88(ColorResources_androidKt.colorResource(R.color.selector_default_button, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.colorWhite, composerStartRestartGroup, 6), 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 12), null, null, PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f)), null, ComposableLambdaKt.rememberComposableLambda(-90629945, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(str), composer2, 54), composer2, (i8 & 896) | (i8 & 14) | 817889280, 352);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z3;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    z4 = z2;
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getConstantPadding
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            String str2 = str;
                            Function0 function1 = function0;
                            Modifier modifier6 = modifier4;
                            boolean z5 = z4;
                            int i9 = i;
                            computeConstantSize.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, function1, modifier6, z5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i9 | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 3072;
            z2 = z;
            i6 = i3;
            if ((i6 & 1171) == 1170) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2089490103, i6, -1, "com.bpjstku.presentation.compose.common.BpjstkuButton (Buttons.kt:28)");
                }
                Modifier modifier6 = modifier3;
                composer2 = composerStartRestartGroup;
                int i9 = i6 >> 3;
                ButtonKt.Button(function0, SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), Dp.m6935constructorimpl(50.0f)), z3, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(10.0f)), ButtonDefaults.INSTANCE.m1797buttonColorsro_MJ88(ColorResources_androidKt.colorResource(R.color.selector_default_button, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.colorWhite, composerStartRestartGroup, 6), 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 12), null, null, PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f)), null, ComposableLambdaKt.rememberComposableLambda(-90629945, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(str), composer2, 54), composer2, (i9 & 896) | (i9 & 14) | 817889280, 352);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z3;
                modifier4 = modifier6;
            } else {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2089490103, i6, -1, "com.bpjstku.presentation.compose.common.BpjstkuButton (Buttons.kt:28)");
                }
                Modifier modifier7 = modifier3;
                composer2 = composerStartRestartGroup;
                int i10 = i6 >> 3;
                ButtonKt.Button(function0, SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), Dp.m6935constructorimpl(50.0f)), z3, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(10.0f)), ButtonDefaults.INSTANCE.m1797buttonColorsro_MJ88(ColorResources_androidKt.colorResource(R.color.selector_default_button, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.colorWhite, composerStartRestartGroup, 6), 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 12), null, null, PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f)), null, ComposableLambdaKt.rememberComposableLambda(-90629945, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(str), composer2, 54), composer2, (i10 & 896) | (i10 & 14) | 817889280, 352);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z3;
                modifier4 = modifier7;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getConstantPadding
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String str2 = str;
                        Function0 function1 = function0;
                        Modifier modifier8 = modifier4;
                        boolean z5 = z4;
                        int i11 = i;
                        computeConstantSize.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, function1, modifier8, z5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i2);
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
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i3;
            if ((i6 & 1171) == 1170) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2089490103, i6, -1, "com.bpjstku.presentation.compose.common.BpjstkuButton (Buttons.kt:28)");
                }
                Modifier modifier8 = modifier3;
                composer2 = composerStartRestartGroup;
                int i11 = i6 >> 3;
                ButtonKt.Button(function0, SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), Dp.m6935constructorimpl(50.0f)), z3, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(10.0f)), ButtonDefaults.INSTANCE.m1797buttonColorsro_MJ88(ColorResources_androidKt.colorResource(R.color.selector_default_button, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.colorWhite, composerStartRestartGroup, 6), 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 12), null, null, PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f)), null, ComposableLambdaKt.rememberComposableLambda(-90629945, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(str), composer2, 54), composer2, (i11 & 896) | (i11 & 14) | 817889280, 352);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z3;
                modifier4 = modifier8;
            } else {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2089490103, i6, -1, "com.bpjstku.presentation.compose.common.BpjstkuButton (Buttons.kt:28)");
                }
                Modifier modifier9 = modifier3;
                composer2 = composerStartRestartGroup;
                int i12 = i6 >> 3;
                ButtonKt.Button(function0, SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), Dp.m6935constructorimpl(50.0f)), z3, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(10.0f)), ButtonDefaults.INSTANCE.m1797buttonColorsro_MJ88(ColorResources_androidKt.colorResource(R.color.selector_default_button, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.colorWhite, composerStartRestartGroup, 6), 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 12), null, null, PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f)), null, ComposableLambdaKt.rememberComposableLambda(-90629945, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(str), composer2, 54), composer2, (i12 & 896) | (i12 & 14) | 817889280, 352);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z3;
                modifier4 = modifier9;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getConstantPadding
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String str2 = str;
                        Function0 function1 = function0;
                        Modifier modifier10 = modifier4;
                        boolean z5 = z4;
                        int i13 = i;
                        computeConstantSize.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, function1, modifier10, z5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i13 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 3072;
        z2 = z;
        i6 = i3;
        if ((i6 & 1171) == 1170) {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2089490103, i6, -1, "com.bpjstku.presentation.compose.common.BpjstkuButton (Buttons.kt:28)");
            }
            Modifier modifier10 = modifier3;
            composer2 = composerStartRestartGroup;
            int i13 = i6 >> 3;
            ButtonKt.Button(function0, SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), Dp.m6935constructorimpl(50.0f)), z3, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(10.0f)), ButtonDefaults.INSTANCE.m1797buttonColorsro_MJ88(ColorResources_androidKt.colorResource(R.color.selector_default_button, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.colorWhite, composerStartRestartGroup, 6), 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 12), null, null, PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f)), null, ComposableLambdaKt.rememberComposableLambda(-90629945, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(str), composer2, 54), composer2, (i13 & 896) | (i13 & 14) | 817889280, 352);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z4 = z3;
            modifier4 = modifier10;
        } else {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2089490103, i6, -1, "com.bpjstku.presentation.compose.common.BpjstkuButton (Buttons.kt:28)");
            }
            Modifier modifier11 = modifier3;
            composer2 = composerStartRestartGroup;
            int i14 = i6 >> 3;
            ButtonKt.Button(function0, SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), Dp.m6935constructorimpl(50.0f)), z3, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(10.0f)), ButtonDefaults.INSTANCE.m1797buttonColorsro_MJ88(ColorResources_androidKt.colorResource(R.color.selector_default_button, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.colorWhite, composerStartRestartGroup, 6), 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 12), null, null, PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f)), null, ComposableLambdaKt.rememberComposableLambda(-90629945, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(str), composer2, 54), composer2, (i14 & 896) | (i14 & 14) | 817889280, 352);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z4 = z3;
            modifier4 = modifier11;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getConstantPadding
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    Function0 function1 = function0;
                    Modifier modifier12 = modifier4;
                    boolean z5 = z4;
                    int i15 = i;
                    computeConstantSize.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, function1, modifier12, z5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i15 | 1), i2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Function3<RowScope, Composer, Integer, Unit> {
        private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((iIntValue & 17) != 16 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-90629945, iIntValue, -1, "com.bpjstku.presentation.compose.common.BpjstkuButton.<anonymous> (Buttons.kt:42)");
                }
                TextKt.m2654Text4IGK_g(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6812boximpl(TextAlign.INSTANCE.m6819getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.poppins_semibold, null, 0, 0, 14, null)), (String) null, TextUnitKt.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777053, (DefaultConstructorMarker) null), composer2, 0, 0, 65022);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x013c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0149  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void b(final String str, final Function0<Unit> function0, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        Modifier modifier3;
        boolean z3;
        Composer composer2;
        final boolean z4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-3067591);
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
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i3;
                if ((i6 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-3067591, i6, -1, "com.bpjstku.presentation.compose.common.OutlinedBpjstkuButton (Buttons.kt:60)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m1033height3ABfNKs(modifier3, Dp.m6935constructorimpl(50.0f)), 0.0f, 1, null);
                    BorderStroke borderStrokeM584BorderStrokecXLIe8U = BorderStrokeKt.m584BorderStrokecXLIe8U(Dp.m6935constructorimpl(1.0f), ColorResources_androidKt.colorResource(R.color.colorDarkMint, composerStartRestartGroup, 6));
                    Modifier modifier5 = modifier3;
                    int i8 = i6 >> 3;
                    composer2 = composerStartRestartGroup;
                    ButtonKt.OutlinedButton(function0, modifierFillMaxWidth$default, z3, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(10.0f)), ButtonDefaults.INSTANCE.m1807outlinedButtonColorsro_MJ88(0L, ColorResources_androidKt.colorResource(R.color.colorDarkMint, composerStartRestartGroup, 6), 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 13), null, borderStrokeM584BorderStrokecXLIe8U, null, null, ComposableLambdaKt.rememberComposableLambda(1731286151, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(str), composerStartRestartGroup, 54), composer2, (i8 & 896) | (i8 & 14) | 805306368, TypedValues.CycleType.TYPE_PATH_ROTATE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z3;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    z4 = z2;
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getConstantWidth
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            String str2 = str;
                            Function0 function1 = function0;
                            Modifier modifier6 = modifier4;
                            boolean z5 = z4;
                            int i9 = i;
                            computeConstantSize.b(str2, function1, modifier6, z5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i9 | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 3072;
            z2 = z;
            i6 = i3;
            if ((i6 & 1171) == 1170) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-3067591, i6, -1, "com.bpjstku.presentation.compose.common.OutlinedBpjstkuButton (Buttons.kt:60)");
                }
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(SizeKt.m1033height3ABfNKs(modifier3, Dp.m6935constructorimpl(50.0f)), 0.0f, 1, null);
                BorderStroke borderStrokeM584BorderStrokecXLIe8U2 = BorderStrokeKt.m584BorderStrokecXLIe8U(Dp.m6935constructorimpl(1.0f), ColorResources_androidKt.colorResource(R.color.colorDarkMint, composerStartRestartGroup, 6));
                Modifier modifier6 = modifier3;
                int i9 = i6 >> 3;
                composer2 = composerStartRestartGroup;
                ButtonKt.OutlinedButton(function0, modifierFillMaxWidth$default2, z3, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(10.0f)), ButtonDefaults.INSTANCE.m1807outlinedButtonColorsro_MJ88(0L, ColorResources_androidKt.colorResource(R.color.colorDarkMint, composerStartRestartGroup, 6), 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 13), null, borderStrokeM584BorderStrokecXLIe8U2, null, null, ComposableLambdaKt.rememberComposableLambda(1731286151, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(str), composerStartRestartGroup, 54), composer2, (i9 & 896) | (i9 & 14) | 805306368, TypedValues.CycleType.TYPE_PATH_ROTATE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z3;
                modifier4 = modifier6;
            } else {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-3067591, i6, -1, "com.bpjstku.presentation.compose.common.OutlinedBpjstkuButton (Buttons.kt:60)");
                }
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(SizeKt.m1033height3ABfNKs(modifier3, Dp.m6935constructorimpl(50.0f)), 0.0f, 1, null);
                BorderStroke borderStrokeM584BorderStrokecXLIe8U3 = BorderStrokeKt.m584BorderStrokecXLIe8U(Dp.m6935constructorimpl(1.0f), ColorResources_androidKt.colorResource(R.color.colorDarkMint, composerStartRestartGroup, 6));
                Modifier modifier7 = modifier3;
                int i10 = i6 >> 3;
                composer2 = composerStartRestartGroup;
                ButtonKt.OutlinedButton(function0, modifierFillMaxWidth$default3, z3, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(10.0f)), ButtonDefaults.INSTANCE.m1807outlinedButtonColorsro_MJ88(0L, ColorResources_androidKt.colorResource(R.color.colorDarkMint, composerStartRestartGroup, 6), 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 13), null, borderStrokeM584BorderStrokecXLIe8U3, null, null, ComposableLambdaKt.rememberComposableLambda(1731286151, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(str), composerStartRestartGroup, 54), composer2, (i10 & 896) | (i10 & 14) | 805306368, TypedValues.CycleType.TYPE_PATH_ROTATE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z3;
                modifier4 = modifier7;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getConstantWidth
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String str2 = str;
                        Function0 function1 = function0;
                        Modifier modifier8 = modifier4;
                        boolean z5 = z4;
                        int i11 = i;
                        computeConstantSize.b(str2, function1, modifier8, z5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i2);
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
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i3;
            if ((i6 & 1171) == 1170) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-3067591, i6, -1, "com.bpjstku.presentation.compose.common.OutlinedBpjstkuButton (Buttons.kt:60)");
                }
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(SizeKt.m1033height3ABfNKs(modifier3, Dp.m6935constructorimpl(50.0f)), 0.0f, 1, null);
                BorderStroke borderStrokeM584BorderStrokecXLIe8U4 = BorderStrokeKt.m584BorderStrokecXLIe8U(Dp.m6935constructorimpl(1.0f), ColorResources_androidKt.colorResource(R.color.colorDarkMint, composerStartRestartGroup, 6));
                Modifier modifier8 = modifier3;
                int i11 = i6 >> 3;
                composer2 = composerStartRestartGroup;
                ButtonKt.OutlinedButton(function0, modifierFillMaxWidth$default4, z3, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(10.0f)), ButtonDefaults.INSTANCE.m1807outlinedButtonColorsro_MJ88(0L, ColorResources_androidKt.colorResource(R.color.colorDarkMint, composerStartRestartGroup, 6), 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 13), null, borderStrokeM584BorderStrokecXLIe8U4, null, null, ComposableLambdaKt.rememberComposableLambda(1731286151, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(str), composerStartRestartGroup, 54), composer2, (i11 & 896) | (i11 & 14) | 805306368, TypedValues.CycleType.TYPE_PATH_ROTATE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z3;
                modifier4 = modifier8;
            } else {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-3067591, i6, -1, "com.bpjstku.presentation.compose.common.OutlinedBpjstkuButton (Buttons.kt:60)");
                }
                Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(SizeKt.m1033height3ABfNKs(modifier3, Dp.m6935constructorimpl(50.0f)), 0.0f, 1, null);
                BorderStroke borderStrokeM584BorderStrokecXLIe8U5 = BorderStrokeKt.m584BorderStrokecXLIe8U(Dp.m6935constructorimpl(1.0f), ColorResources_androidKt.colorResource(R.color.colorDarkMint, composerStartRestartGroup, 6));
                Modifier modifier9 = modifier3;
                int i12 = i6 >> 3;
                composer2 = composerStartRestartGroup;
                ButtonKt.OutlinedButton(function0, modifierFillMaxWidth$default5, z3, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(10.0f)), ButtonDefaults.INSTANCE.m1807outlinedButtonColorsro_MJ88(0L, ColorResources_androidKt.colorResource(R.color.colorDarkMint, composerStartRestartGroup, 6), 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 13), null, borderStrokeM584BorderStrokecXLIe8U5, null, null, ComposableLambdaKt.rememberComposableLambda(1731286151, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(str), composerStartRestartGroup, 54), composer2, (i12 & 896) | (i12 & 14) | 805306368, TypedValues.CycleType.TYPE_PATH_ROTATE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z3;
                modifier4 = modifier9;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getConstantWidth
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String str2 = str;
                        Function0 function1 = function0;
                        Modifier modifier10 = modifier4;
                        boolean z5 = z4;
                        int i13 = i;
                        computeConstantSize.b(str2, function1, modifier10, z5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i13 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 3072;
        z2 = z;
        i6 = i3;
        if ((i6 & 1171) == 1170) {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-3067591, i6, -1, "com.bpjstku.presentation.compose.common.OutlinedBpjstkuButton (Buttons.kt:60)");
            }
            Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(SizeKt.m1033height3ABfNKs(modifier3, Dp.m6935constructorimpl(50.0f)), 0.0f, 1, null);
            BorderStroke borderStrokeM584BorderStrokecXLIe8U6 = BorderStrokeKt.m584BorderStrokecXLIe8U(Dp.m6935constructorimpl(1.0f), ColorResources_androidKt.colorResource(R.color.colorDarkMint, composerStartRestartGroup, 6));
            Modifier modifier10 = modifier3;
            int i13 = i6 >> 3;
            composer2 = composerStartRestartGroup;
            ButtonKt.OutlinedButton(function0, modifierFillMaxWidth$default6, z3, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(10.0f)), ButtonDefaults.INSTANCE.m1807outlinedButtonColorsro_MJ88(0L, ColorResources_androidKt.colorResource(R.color.colorDarkMint, composerStartRestartGroup, 6), 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 13), null, borderStrokeM584BorderStrokecXLIe8U6, null, null, ComposableLambdaKt.rememberComposableLambda(1731286151, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(str), composerStartRestartGroup, 54), composer2, (i13 & 896) | (i13 & 14) | 805306368, TypedValues.CycleType.TYPE_PATH_ROTATE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z4 = z3;
            modifier4 = modifier10;
        } else {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-3067591, i6, -1, "com.bpjstku.presentation.compose.common.OutlinedBpjstkuButton (Buttons.kt:60)");
            }
            Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(SizeKt.m1033height3ABfNKs(modifier3, Dp.m6935constructorimpl(50.0f)), 0.0f, 1, null);
            BorderStroke borderStrokeM584BorderStrokecXLIe8U7 = BorderStrokeKt.m584BorderStrokecXLIe8U(Dp.m6935constructorimpl(1.0f), ColorResources_androidKt.colorResource(R.color.colorDarkMint, composerStartRestartGroup, 6));
            Modifier modifier11 = modifier3;
            int i14 = i6 >> 3;
            composer2 = composerStartRestartGroup;
            ButtonKt.OutlinedButton(function0, modifierFillMaxWidth$default7, z3, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(10.0f)), ButtonDefaults.INSTANCE.m1807outlinedButtonColorsro_MJ88(0L, ColorResources_androidKt.colorResource(R.color.colorDarkMint, composerStartRestartGroup, 6), 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 13), null, borderStrokeM584BorderStrokecXLIe8U7, null, null, ComposableLambdaKt.rememberComposableLambda(1731286151, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(str), composerStartRestartGroup, 54), composer2, (i14 & 896) | (i14 & 14) | 805306368, TypedValues.CycleType.TYPE_PATH_ROTATE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z4 = z3;
            modifier4 = modifier11;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getConstantWidth
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    Function0 function1 = function0;
                    Modifier modifier12 = modifier4;
                    boolean z5 = z4;
                    int i15 = i;
                    computeConstantSize.b(str2, function1, modifier12, z5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i15 | 1), i2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Function3<RowScope, Composer, Integer, Unit> {
        private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private static final byte[] $$c = {60, 80, 13, 34};
        private static final int $$f = 129;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {113, 29, -123, -97, -17, 6, -18, -1, 2, 1, 50, -73, -6, 1, -4, -3, -7, -6, 66, -76, 62, 2, -67, 4, -3, -9, 4, 47, -40, -19, -23, 7, -9, 3, 32, -48, -2, -7, 11, -23, 76, -17, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 62};
        private static final int $$e = 65;
        private static final byte[] $$a = {56, 94, 119, -19, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
        private static final int $$b = 62;
        private static int asInterface = 0;
        private static int d = 1;
        private static char[] TuitionPaymentFragmentbindingInflater1 = {47340, 47391, 47337, 47387, 47390, 47332, 47327, 47386, 47354, 47380, 47385, 47336, 47328, 47306, 47329, 47338, 47330, 47389, 47355, 47308, 47383, 47353, 47333, 47384, 47331, 47334, 47301};
        private static int b = 2047719565;
        private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r7, byte r8, int r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 * 14
                int r8 = r8 + 84
                byte[] r0 = computeConstantSize.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$a
                int r7 = r7 + 4
                int r9 = 53 - r9
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L12
                r3 = r9
                r4 = r2
                goto L29
            L12:
                r3 = r2
            L13:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                int r7 = r7 + 1
                r1[r3] = r5
                if (r4 != r9) goto L24
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L24:
                r3 = r0[r7]
                r6 = r3
                r3 = r8
                r8 = r6
            L29:
                int r8 = -r8
                int r3 = r3 + r8
                int r8 = r3 + (-10)
                r3 = r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: computeConstantSize.TuitionPaymentFragmentspecialinlinedviewModeldefault2.a(short, byte, int, java.lang.Object[]):void");
        }

        private static void e(int i, byte b2, int i2, Object[] objArr) {
            int i3 = 97 - (i2 * 13);
            int i4 = 41 - (b2 * 38);
            int i5 = i * 14;
            byte[] bArr = $$d;
            byte[] bArr2 = new byte[53 - i5];
            int i6 = 52 - i5;
            int i7 = -1;
            if (bArr == null) {
                i7 = -1;
                i3 = (i3 + (-i4)) - 4;
                i4 = i4;
            }
            while (true) {
                int i8 = i7 + 1;
                bArr2[i8] = (byte) i3;
                if (i8 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i9 = i4 + 1;
                i7 = i8;
                i3 = (i3 + (-bArr[i9])) - 4;
                i4 = i9;
            }
        }

        private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
            char[] cArr2;
            int i2 = 2;
            int i3 = 2 % 2;
            getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
            char[] cArr3 = TuitionPaymentFragmentbindingInflater1;
            long j = 0;
            int i4 = 0;
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    int i6 = $10 + 89;
                    $11 = i6 % 128;
                    int i7 = i6 % i2;
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i4] = Integer.valueOf(cArr3[i5]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 31339);
                            int packedPositionGroup = 2994 - ExpandableListView.getPackedPositionGroup(j);
                            int iIndexOf = 17 - TextUtils.indexOf("", "", i4, i4);
                            byte b2 = (byte) ($$f & 7);
                            byte b3 = (byte) (b2 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, packedPositionGroup, iIndexOf, 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr4[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i5++;
                        i2 = 2;
                        j = 0;
                        i4 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr4;
            }
            Object[] objArr3 = {Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43324 - TextUtils.indexOf((CharSequence) "", '0')), 252 - TextUtils.lastIndexOf("", '0', 0), (Process.myTid() >> 22) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            if (!(!TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                int i8 = $11 + 85;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                    cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
                } else {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                    cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                }
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33602), 3085 - TextUtils.getOffsetAfter("", 0), 26 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr2);
                return;
            }
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i9 = $11 + 115;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - KeyEvent.keyCodeFromString("")), MotionEvent.axisFromString("") + 3086, 25 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i11 = 0;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            while (true) {
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11;
                if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    i11 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 31533);
                int iAxisFromString = MotionEvent.axisFromString("") + 922;
                int iKeyCodeFromString = 28 - KeyEvent.keyCodeFromString("");
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                a(bArr[37], bArr[7], (byte) ($$b & 245), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(absoluteGravity, iAxisFromString, iKeyCodeFromString, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(null, null, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(null, null, TextUtils.getCapsMode("", 0, 0) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cMakeMeasureSpec = (char) (31533 - View.MeasureSpec.makeMeasureSpec(0, 0));
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 921;
                int keyRepeatDelay = 28 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                byte[] bArr2 = $$a;
                byte b2 = bArr2[37];
                byte b3 = bArr2[80];
                Object[] objArr5 = new Object[1];
                a(b2, b3, b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec, maximumFlingVelocity, keyRepeatDelay, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char keyRepeatTimeout = (char) (31533 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int jumpTapTimeout = 921 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int edgeSlop = 28 - (ViewConfiguration.getEdgeSlop() >> 16);
                    byte[] bArr3 = $$a;
                    Object[] objArr6 = new Object[1];
                    a((byte) 51, bArr3[80], (byte) (-bArr3[33]), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, jumpTapTimeout, edgeSlop, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i2 = ~((-37748929) | iIdentityHashCode);
                int i3 = ~iIdentityHashCode;
                int i4 = (((1708380563 + ((i2 | (~((-1613365513) | i3))) * 920)) + (((~((-122965204) | i3)) | 37748928) * 920)) + (((~(iIdentityHashCode | (-1613365513))) | ((~((-37748929) | i3)) | (~((-85216276) | iIdentityHashCode)))) * 920)) - 1822849047;
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(null, null, 127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(null, null, 126 - ImageFormat.getBitsPerPixel(0), new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i7 = asInterface + 83;
                    d = i7 % 128;
                    if (i7 % 2 == 0) {
                        boolean z = applicationContext instanceof ContextWrapper;
                        throw null;
                    }
                    if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                        applicationContext = null;
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                        int i8 = asInterface + 103;
                        d = i8 % 128;
                        int i9 = i8 % 2;
                    }
                }
                Object[] objArr10 = new Object[1];
                c(null, null, ExpandableListView.getPackedPositionChild(0L) + 128, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(null, null, 127 - KeyEvent.normalizeMetaState(0), new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1822849047};
                    byte[] bArr4 = $$d;
                    byte b4 = bArr4[9];
                    Object[] objArr13 = new Object[1];
                    e(b4, b4, bArr4[79], objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b5 = bArr4[79];
                    Object[] objArr14 = new Object[1];
                    e(b5, b5, bArr4[9], objArr14);
                    objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31532);
                        int threadPriority = 921 - ((Process.getThreadPriority(0) + 20) >> 6);
                        int i10 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29;
                        byte[] bArr5 = $$a;
                        Object[] objArr15 = new Object[1];
                        a((byte) 51, bArr5[80], (byte) (-bArr5[33]), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, threadPriority, i10, -1142834547, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        c(null, null, View.MeasureSpec.getSize(0) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        c(null, null, 127 - Color.green(0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 31532);
                            int i11 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 922;
                            int i12 = 29 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            byte[] bArr6 = $$a;
                            byte b6 = bArr6[37];
                            byte b7 = bArr6[80];
                            Object[] objArr18 = new Object[1];
                            a(b6, b7, b7, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, i11, i12, -778300370, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char offsetAfter = (char) (31533 - TextUtils.getOffsetAfter("", 0));
                            int i13 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 920;
                            int trimmedLength = 28 - TextUtils.getTrimmedLength("");
                            byte[] bArr7 = $$a;
                            Object[] objArr19 = new Object[1];
                            a(bArr7[37], bArr7[7], (byte) ($$b & 245), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetAfter, i13, trimmedLength, -1048449946, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    int i14 = asInterface + 83;
                    d = i14 % 128;
                    int i15 = i14 % 2;
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                throw null;
            }
            int i16 = ((int[]) objArr[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i17 = ~iIdentityHashCode2;
            int i18 = 819238419 + (((~((-817914021) | i17)) | (~(820045285 | iIdentityHashCode2))) * 520);
            int i19 = ~((-820045286) | i17);
            int i20 = ~(iIdentityHashCode2 | 954034358);
            int i21 = i16 + i18 + ((i19 | i20) * (-1040)) + ((i20 | (~(i17 | (-954034359))) | 2131265) * 520);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr20[0])[0] = i23 ^ (i23 << 5);
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((iIntValue & 17) != 16 || (!composer2.getSkipping())) {
                if (ComposerKt.isTraceInProgress()) {
                    int i24 = asInterface + 35;
                    d = i24 % 128;
                    if (i24 % 2 == 0) {
                        ComposerKt.traceEventStart(1731286151, iIntValue, -1, "com.bpjstku.presentation.compose.common.OutlinedBpjstkuButton.<anonymous> (Buttons.kt:73)");
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    ComposerKt.traceEventStart(1731286151, iIntValue, -1, "com.bpjstku.presentation.compose.common.OutlinedBpjstkuButton.<anonymous> (Buttons.kt:73)");
                }
                TextKt.m2654Text4IGK_g(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6812boximpl(TextAlign.INSTANCE.m6819getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.poppins_semibold, null, 0, 0, 14, null)), (String) null, TextUnitKt.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777053, (DefaultConstructorMarker) null), composer2, 0, 0, 65022);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                int i25 = asInterface + 123;
                d = i25 % 128;
                int i26 = i25 % 2;
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r6, int r7, int r8) {
            /*
                int r8 = r8 * 3
                int r0 = r8 + 1
                int r7 = r7 * 4
                int r7 = 4 - r7
                int r6 = r6 + 67
                byte[] r1 = computeConstantSize.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L14
                r3 = r7
                r4 = r2
                goto L2b
            L14:
                r3 = r2
                r5 = r7
                r7 = r6
                r6 = r5
            L18:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r8) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L23:
                r4 = r1[r6]
                int r3 = r3 + 1
                r5 = r3
                r3 = r6
                r6 = r4
                r4 = r5
            L2b:
                int r7 = r7 + r6
                int r6 = r3 + 1
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: computeConstantSize.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$g(short, int, int):java.lang.String");
        }
    }
}
