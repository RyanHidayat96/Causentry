package defpackage;

import android.graphics.ImageFormat;
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
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
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
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.bpjstku.R;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class AllCapsTransformationMethod {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Function2<Composer, Integer, Unit> {
        private /* synthetic */ Modifier TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ Integer TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Function0<Unit> f61a;
        private /* synthetic */ String asBinder;
        private /* synthetic */ Function0<Unit> b;
        private /* synthetic */ Function0<Unit> d;
        private /* synthetic */ String g;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-603985450, iIntValue, -1, "com.bpjstku.presentation.compose.common.ProcessResultDialog.<anonymous> (ProcessResultDialog.kt:82)");
                }
                SurfaceKt.m2506SurfaceT9BRK9s(PaddingKt.m1002padding3ABfNKs(SizeKt.fillMaxWidth$default(this.TuitionPaymentFragmentbindingInflater1, 0.0f, 1, null), Dp.m6935constructorimpl(16.0f)), RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(16.0f)), Color.INSTANCE.m4255getWhite0d7_KjU(), 0L, Dp.m6935constructorimpl(8.0f), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(407447601, true, new AnonymousClass3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.g, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.b, this.f61a, this.asBinder, this.d, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2), composer2, 54), composer2, 12607872, 104);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: AllCapsTransformationMethod$TuitionPaymentFragmentspecialinlinedviewModeldefault3$3, reason: invalid class name */
        public static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
            private /* synthetic */ Integer TuitionPaymentFragmentbindingInflater1;
            private /* synthetic */ Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            private /* synthetic */ Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            private /* synthetic */ String asBinder;
            private /* synthetic */ String b;
            private /* synthetic */ Function0<Unit> d;
            private /* synthetic */ String g;

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
                Function0<Unit> function0;
                Composer composer2;
                Composer composer3;
                Composer composer4 = composer;
                int iIntValue = num.intValue();
                if ((iIntValue & 3) != 2 || !composer4.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(407447601, iIntValue, -1, "com.bpjstku.presentation.compose.common.ProcessResultDialog.<anonymous>.<anonymous> (ProcessResultDialog.kt:90)");
                    }
                    Modifier modifierM1002padding3ABfNKs = PaddingKt.m1002padding3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(20.0f));
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Integer num2 = this.TuitionPaymentFragmentbindingInflater1;
                    String str = this.asBinder;
                    String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    Function0<Unit> function1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    final Function0<Unit> function2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    String str3 = this.g;
                    final Function0<Unit> function3 = this.d;
                    String str4 = this.b;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer4, 48);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM1002padding3ABfNKs);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    if (!(composer4.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composer4);
                    Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3543setimpl(composerM3536constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer4.startReplaceGroup(1569852761);
                    if (num2 != null) {
                        ImageKt.Image(PainterResources_androidKt.painterResource(num2.intValue(), composer4, 0), (String) null, SizeKt.m1047size3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(72.0f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 432, 120);
                    }
                    composer4.endReplaceGroup();
                    composer4.startReplaceGroup(1569862103);
                    if (str.length() > 0) {
                        SpacerKt.Spacer(SizeKt.m1033height3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(16.0f)), composer4, 6);
                        composer2 = composer4;
                        function0 = function1;
                        TextKt.m2654Text4IGK_g(str, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorKt.Color(4281545523L), TextUnitKt.getSp(20), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m6819getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744440, (DefaultConstructorMarker) null), composer2, 48, 0, 65532);
                    } else {
                        function0 = function1;
                        composer2 = composer4;
                    }
                    composer2.endReplaceGroup();
                    Composer composer5 = composer2;
                    composer5.startReplaceGroup(1569881313);
                    String str5 = str2;
                    if (str5.length() > 0) {
                        SpacerKt.Spacer(SizeKt.m1033height3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(16.0f)), composer5, 6);
                        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                        int i = 0;
                        while (i < str2.length()) {
                            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str5, "<b>", i, false, 4, (Object) null);
                            if (iIndexOf$default == -1) {
                                String strSubstring = str2.substring(i);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                                builder.append(strSubstring);
                                break;
                            }
                            String strSubstring2 = str2.substring(i, iIndexOf$default);
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                            builder.append(strSubstring2);
                            int i2 = iIndexOf$default + 3;
                            int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str5, "</b>", i2, false, 4, (Object) null);
                            if (iIndexOf$default2 == -1) {
                                String strSubstring3 = str2.substring(iIndexOf$default);
                                Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                                builder.append(strSubstring3);
                                break;
                            }
                            String strSubstring4 = str2.substring(i2, iIndexOf$default2);
                            Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
                            builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null));
                            builder.append(strSubstring4);
                            builder.pop();
                            i = iIndexOf$default2 + 4;
                        }
                        composer3 = composer5;
                        TextKt.m2655TextIbK3jfQ(builder.toAnnotatedString(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, new TextStyle(Color.INSTANCE.m4248getGray0d7_KjU(), TextUnitKt.getSp(18), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m6819getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744444, (DefaultConstructorMarker) null), composer3, 48, 0, 131068);
                    } else {
                        composer3 = composer5;
                    }
                    composer3.endReplaceGroup();
                    Composer composer6 = composer3;
                    SpacerKt.Spacer(SizeKt.m1033height3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(32.0f)), composer6, 6);
                    composer6.startReplaceGroup(1569901750);
                    final Function0<Unit> function4 = function0;
                    boolean zChanged = composer6.changed(function4);
                    boolean zChanged2 = composer6.changed(function2);
                    Object objRememberedValue = composer6.rememberedValue();
                    if ((zChanged | zChanged2) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: getStackedTabMaxWidth
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AllCapsTransformationMethod.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function4, function2);
                            }
                        };
                        composer6.updateRememberedValue(objRememberedValue);
                    }
                    composer6.endReplaceGroup();
                    ButtonKt.Button((Function0) objRememberedValue, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(12.0f)), ButtonDefaults.INSTANCE.m1797buttonColorsro_MJ88(ColorResources_androidKt.colorResource(R.color.selector_default_button, composer6, 6), ColorResources_androidKt.colorResource(R.color.colorWhite, composer6, 6), 0L, 0L, composer6, ButtonDefaults.$stable << 12, 12), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1000936693, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(str4), composer6, 54), composer6, 805306416, 484);
                    composer6.startReplaceGroup(1569922100);
                    String str6 = str3;
                    if (str6 != null && str6.length() != 0) {
                        SpacerKt.Spacer(SizeKt.m1033height3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(12.0f)), composer6, 6);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        BorderStroke borderStrokeM584BorderStrokecXLIe8U = BorderStrokeKt.m584BorderStrokecXLIe8U(Dp.m6935constructorimpl(1.0f), ColorResources_androidKt.colorResource(R.color.colorDarkMint, composer6, 6));
                        RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(12.0f));
                        ButtonColors buttonColorsM1807outlinedButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1807outlinedButtonColorsro_MJ88(0L, ColorResources_androidKt.colorResource(R.color.colorDarkMint, composer6, 6), 0L, 0L, composer6, ButtonDefaults.$stable << 12, 13);
                        composer6.startReplaceGroup(1569927059);
                        boolean zChanged3 = composer6.changed(function3);
                        boolean zChanged4 = composer6.changed(function2);
                        Object objRememberedValue2 = composer6.rememberedValue();
                        if ((zChanged3 | zChanged4) || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: getEmbeddedMenuWidthLimit
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AllCapsTransformationMethod.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function3, function2);
                                }
                            };
                            composer6.updateRememberedValue(objRememberedValue2);
                        }
                        composer6.endReplaceGroup();
                        ButtonKt.OutlinedButton((Function0) objRememberedValue2, modifierFillMaxWidth$default, false, roundedCornerShapeM1285RoundedCornerShape0680j_4, buttonColorsM1807outlinedButtonColorsro_MJ88, null, borderStrokeM584BorderStrokecXLIe8U, null, null, ComposableLambdaKt.rememberComposableLambda(-690227626, true, new b(str3), composer6, 54), composer6, 805306416, TypedValues.CycleType.TYPE_EASING);
                    }
                    composer6.endReplaceGroup();
                    composer6.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: AllCapsTransformationMethod$TuitionPaymentFragmentspecialinlinedviewModeldefault3$3$b */
            public static final class b implements Function3<RowScope, Composer, Integer, Unit> {
                private /* synthetic */ String b;
                private static final byte[] $$c = {12, -88, 33, 118};
                private static final int $$f = 177;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$d = {68, 104, -93, -37, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
                private static final int $$e = 120;
                private static final byte[] $$a = {60, 80, 13, 34, -15, 8, -16, 1, 4, 3, 52, -55, -14, -1, -8, 13, -11, -8, 68, -68, 1, Base64.padSymbol, -36, -19, -4, -10, 8, -8, 0, 22, -22, -15, 11, -8, 0, -15, 0, -17, 34, -19, -4, -10, 8, -8, 0, 26, -39, 6, -11};
                private static final int $$b = 164;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
                private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {45558, 6787, 59158, 45959, 7242, 59526, 46345, 384, 59915, 46812, 770, 61331, 47122, 1174, 53533, 48541, 1544, 53996, 48909, 2979, 54320, 41122, 3367, 55722, 28299, 50679, 14436, 27867, 50043, 14334, 27249, 57080, 13685, 27111, 56434, 12533, 23645, 63272, 2749, 24108, 61921, 1325, 22690, 60459, 1952, 23415, 61097, 568, 21945, 59709, 15542, 20534, 60323, 16199, 21158, 58882, 14731, 19720, 57477, 13324, 20354, 58123, 45557, 6801, 59182, 45959, 7184, 59523, 46366, 395, 45563, 6791, 59156, 46004, 7169, 59550, 46365, 412, 59906, 46758, 777, 61318, 47121, 50993, 27725, 37342, 50556, 27343, 40530, 50115, 30537, 40131, 49228, 30175, 39246, 52970, 29257, 42946, 52049, 28869};
                private static long TuitionPaymentFragmentbindingInflater1 = 1874559452578519778L;

                /* JADX WARN: Code duplicated, block: B:10:0x0028  */
                /* JADX WARN: Code duplicated, block: B:8:0x0020  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void a(int r5, short r6, short r7, java.lang.Object[] r8) {
                    /*
                        int r5 = r5 * 6
                        int r5 = r5 + 97
                        int r7 = r7 * 19
                        int r0 = r7 + 14
                        int r6 = r6 * 32
                        int r6 = 35 - r6
                        byte[] r1 = AllCapsTransformationMethod.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass3.b.$$a
                        byte[] r0 = new byte[r0]
                        int r7 = r7 + 13
                        r2 = 0
                        if (r1 != 0) goto L18
                        r4 = r7
                        r3 = r2
                        goto L2c
                    L18:
                        r3 = r2
                    L19:
                        int r6 = r6 + 1
                        byte r4 = (byte) r5
                        r0[r3] = r4
                        if (r3 != r7) goto L28
                        java.lang.String r5 = new java.lang.String
                        r5.<init>(r0, r2)
                        r8[r2] = r5
                        return
                    L28:
                        int r3 = r3 + 1
                        r4 = r1[r6]
                    L2c:
                        int r4 = -r4
                        int r5 = r5 + r4
                        int r5 = r5 + (-2)
                        goto L19
                    */
                    throw new UnsupportedOperationException("Method not decompiled: AllCapsTransformationMethod.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass3.b.a(int, short, short, java.lang.Object[]):void");
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0026  */
                /* JADX WARN: Code duplicated, block: B:8:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void c(int r6, byte r7, short r8, java.lang.Object[] r9) {
                    /*
                        int r6 = r6 * 52
                        int r6 = r6 + 1
                        int r8 = r8 * 52
                        int r8 = 55 - r8
                        byte[] r0 = AllCapsTransformationMethod.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass3.b.$$d
                        int r7 = r7 + 84
                        byte[] r1 = new byte[r6]
                        r2 = 0
                        if (r0 != 0) goto L14
                        r3 = r6
                        r4 = r2
                        goto L28
                    L14:
                        r3 = r2
                    L15:
                        int r4 = r3 + 1
                        int r8 = r8 + 1
                        byte r5 = (byte) r7
                        r1[r3] = r5
                        if (r4 != r6) goto L26
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        r9[r2] = r6
                        return
                    L26:
                        r3 = r0[r8]
                    L28:
                        int r3 = -r3
                        int r7 = r7 + r3
                        int r7 = r7 + (-11)
                        r3 = r4
                        goto L15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: AllCapsTransformationMethod.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass3.b.c(int, byte, short, java.lang.Object[]):void");
                }

                private static void d(int i, int i2, char c, Object[] objArr) throws Throwable {
                    int i3 = 2 % 2;
                    lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                    long[] jArr = new long[i2];
                    lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    int i4 = $10 + 7;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                        int i6 = $11 + 47;
                        $10 = i6 % 128;
                        int i7 = i6 % 2;
                        int i8 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        try {
                            Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b = (byte) 0;
                                byte b2 = (byte) (b + 2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 2187 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 41, 841711447, false, $$g(b, b2, (byte) (b2 - 3)), new Class[]{Integer.TYPE});
                            }
                            Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33018 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 3011, (Process.myTid() >> 22) + 26, 321985076, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                            Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = (byte) (b5 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 36505), android.graphics.Color.blue(0) + 3376, 18 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -968507904, false, $$g(b5, b6, (byte) (-b6)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    char[] cArr = new char[i2];
                    lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                        cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                        Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = (byte) (b7 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 3376 - View.resolveSize(0, 0), 17 - (KeyEvent.getMaxKeyCode() >> 16), -968507904, false, $$g(b7, b8, (byte) (-b8)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        int i9 = $10 + 71;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                    }
                    objArr[0] = new String(cArr);
                }

                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
                    int i = 2 % 2;
                    Composer composer2 = composer;
                    int iIntValue = num.intValue();
                    Intrinsics.checkNotNullParameter(rowScope, "");
                    if ((iIntValue & 17) == 16 && composer2.getSkipping()) {
                        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                        int i3 = i2 % 2;
                        composer2.skipToGroupEnd();
                        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 5 / 4;
                        }
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                            if (i6 % 2 == 0) {
                                ComposerKt.traceEventStart(-690227626, iIntValue, -1, "com.bpjstku.presentation.compose.common.ProcessResultDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProcessResultDialog.kt:165)");
                                throw null;
                            }
                            ComposerKt.traceEventStart(-690227626, iIntValue, -1, "com.bpjstku.presentation.compose.common.ProcessResultDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProcessResultDialog.kt:165)");
                        }
                        TextKt.m2654Text4IGK_g(this.b, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (!(!ComposerKt.isTraceInProgress())) {
                            ComposerKt.traceEventEnd();
                            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                            int i8 = i7 % 2;
                        }
                    }
                    return Unit.INSTANCE;
                }

                b(String str) {
                    this.b = str;
                }

                /* JADX WARN: Code duplicated, block: B:116:0x0b10  */
                /* JADX WARN: Code duplicated, block: B:117:0x0b14  */
                /* JADX WARN: Code duplicated, block: B:119:0x0b25  */
                /* JADX WARN: Code duplicated, block: B:120:0x0b28  */
                /* JADX WARN: Code duplicated, block: B:128:0x0b47  */
                /* JADX WARN: Code duplicated, block: B:131:0x0b62  */
                /* JADX WARN: Code duplicated, block: B:134:0x0b7f  */
                /* JADX WARN: Code duplicated, block: B:136:0x0ba2  */
                /* JADX WARN: Code duplicated, block: B:137:0x0ba7  */
                /* JADX WARN: Code duplicated, block: B:140:0x0bc9  */
                /* JADX WARN: Code duplicated, block: B:142:0x0bd2  */
                /* JADX WARN: Code duplicated, block: B:144:0x0be1  */
                /* JADX WARN: Code duplicated, block: B:156:0x0923 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:157:0x0724 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:163:0x0928 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:43:0x0653  */
                /* JADX WARN: Code duplicated, block: B:49:0x0683  */
                /* JADX WARN: Code duplicated, block: B:51:0x069b  */
                /* JADX WARN: Code duplicated, block: B:52:0x06ad  */
                /* JADX WARN: Code duplicated, block: B:55:0x06e2  */
                /* JADX WARN: Code duplicated, block: B:61:0x0730  */
                /* JADX WARN: Code duplicated, block: B:63:0x0739  */
                /* JADX WARN: Code duplicated, block: B:66:0x0780  */
                /* JADX WARN: Code duplicated, block: B:70:0x07d7 A[Catch: all -> 0x0be6, TryCatch #0 {all -> 0x0be6, blocks: (B:68:0x07c0, B:70:0x07d7, B:71:0x081d, B:84:0x091c, B:99:0x0992, B:101:0x099f, B:102:0x09d8, B:104:0x09f7, B:105:0x0a42, B:80:0x08bc, B:82:0x08d3, B:83:0x0913), top: B:151:0x00b1 }] */
                /* JADX WARN: Code duplicated, block: B:73:0x0828  */
                /* JADX WARN: Code duplicated, block: B:75:0x0831  */
                /* JADX WARN: Code duplicated, block: B:78:0x0879  */
                /* JADX WARN: Code duplicated, block: B:82:0x08d3 A[Catch: all -> 0x0be6, TryCatch #0 {all -> 0x0be6, blocks: (B:68:0x07c0, B:70:0x07d7, B:71:0x081d, B:84:0x091c, B:99:0x0992, B:101:0x099f, B:102:0x09d8, B:104:0x09f7, B:105:0x0a42, B:80:0x08bc, B:82:0x08d3, B:83:0x0913), top: B:151:0x00b1 }] */
                public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(List list) throws Throwable {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    String string;
                    int i8;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i9;
                    int i10;
                    int i11;
                    int i12;
                    int i13;
                    int i14;
                    int i15;
                    int i16;
                    int i17;
                    int i18;
                    Object[] objArr;
                    int scrollDefaultDelay;
                    int i19;
                    int i20;
                    int i21;
                    int i22;
                    int packedPositionGroup;
                    int packedPositionGroup2;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i23;
                    int i24;
                    int i25;
                    int i26;
                    int i27;
                    int i28;
                    int i29;
                    Class<?> cls;
                    int i30;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                    Long l;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                    int i31 = 2;
                    int i32 = 2 % 2;
                    int i33 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i33 % 128;
                    int i34 = i33 % 2;
                    byte[] bArr = $$a;
                    byte b = bArr[28];
                    byte b2 = bArr[7];
                    int i35 = 1;
                    Object[] objArr2 = new Object[1];
                    a(b, b2, b2, objArr2);
                    int i36 = 0;
                    Class<?> cls2 = Class.forName((String) objArr2[0]);
                    byte b3 = bArr[7];
                    byte b4 = bArr[28];
                    Object[] objArr3 = new Object[1];
                    a(b3, b4, b4, objArr3);
                    Method method = cls2.getMethod((String) objArr3[0], String.class, Integer.TYPE);
                    Class<?> cls3 = Class.forName("android.app.ApplicationPackageManager");
                    byte b5 = bArr[7];
                    byte b6 = bArr[28];
                    Object[] objArr4 = new Object[1];
                    a(b5, b6, b6, objArr4);
                    Method[] methodArr = {method, cls3.getMethod((String) objArr4[0], String.class, Integer.TYPE)};
                    int i37 = -2001519171;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                    int i38 = 16;
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2823;
                        int iIndexOf = 22 - TextUtils.indexOf("", "", 0);
                        byte[] bArr2 = $$d;
                        byte b7 = bArr2[5];
                        Object[] objArr5 = new Object[1];
                        c(b7, bArr2[7], b7, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollDefaultDelay2, minimumFlingVelocity, iIndexOf, 1814927978, false, (String) objArr5[0], null);
                    }
                    long j = 0;
                    try {
                        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null) != null) {
                            i = i37;
                            break;
                        }
                        Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - TextUtils.lastIndexOf("", '0')), 2824 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i39 = 0;
                        while (true) {
                            if (i39 >= length) {
                                i = i37;
                                break;
                            }
                            int i40 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i41 = ((i40 | 51) << 1) - (i40 ^ 51);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i41 % 128;
                            int i42 = i41 % i31;
                            Method method2 = declaredMethods[i39];
                            int i43 = i40 + 35;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i43 % 128;
                            int i44 = i43 % i31;
                            try {
                                Object[] objArr6 = new Object[i35];
                                d(View.resolveSizeAndState(i36, i36, i36), 24 - android.graphics.Color.green(i36), (char) TextUtils.indexOf("", "", i36, i36), objArr6);
                                Class<?> cls4 = Class.forName((String) objArr6[i36]);
                                int tapTimeout = ViewConfiguration.getTapTimeout() >> i38;
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i45 = tapTimeout * (-432);
                                int i46 = (i45 & 10416) + (i45 | 10416);
                                int i47 = ~tapTimeout;
                                int i48 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                int i49 = (i47 ^ i48) | (i48 & i47);
                                int i50 = i46 + ((~((i49 ^ 24) | (i49 & 24))) * 433);
                                int i51 = ~tapTimeout;
                                int i52 = ~((-25) | iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
                                int i53 = i50 + (((i51 ^ i52) | (i51 & i52)) * (-433));
                                int i54 = ~((i47 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & i47));
                                int i55 = ~((tapTimeout & 24) | (tapTimeout ^ 24));
                                int i56 = i53 + (((i54 & i55) | (i54 ^ i55)) * 433);
                                int i57 = 13 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1));
                                long jUptimeMillis = SystemClock.uptimeMillis();
                                int i58 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i59 = (i58 & 25) + (i58 | 25);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i59 % 128;
                                int i60 = (jUptimeMillis > j ? 1 : (jUptimeMillis == j ? 0 : -1));
                                if (i59 % i31 != 0) {
                                    Object[] objArr7 = new Object[1];
                                    d(i56, i57, (char) (57201 % i60), objArr7);
                                    objArr = new Object[0];
                                    objArr[0] = Integer.valueOf(((Integer) cls4.getMethod((String) objArr7[0], null).invoke(method2, null)).intValue());
                                    scrollDefaultDelay = 71 << (ViewConfiguration.getScrollDefaultDelay() * 41);
                                    i19 = 89;
                                } else {
                                    int i61 = -i60;
                                    Object[] objArr8 = new Object[1];
                                    d(i56, i57, (char) ((i61 ^ 57201) + ((i61 & 57201) << 1)), objArr8);
                                    objArr = new Object[]{Integer.valueOf(((Integer) cls4.getMethod((String) objArr8[0], null).invoke(method2, null)).intValue())};
                                    int i62 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                    scrollDefaultDelay = ((i62 & 36) << 1) + (i62 ^ 36);
                                    i19 = 27;
                                }
                                int i63 = (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1));
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i64 = i63 * (-751);
                                int i65 = -(-(i19 * (-751)));
                                int i66 = (i64 ^ i65) + ((i64 & i65) << 1);
                                int i67 = ~i63;
                                int i68 = ~i19;
                                int i69 = ~(i67 | i68);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i70 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                int i71 = (((-1615548937) ^ i70) | ((-1615548937) & i70)) * 184;
                                int i72 = ((-1062623806) ^ i71) + (((-1062623806) & i71) << 1);
                                int i73 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                int i74 = ~((i73 ^ 129245430) | (i73 & 129245430));
                                int i75 = (9437348 ^ i74) | (i74 & 9437348);
                                int i76 = ((i75 ^ (-1744794367)) | (i75 & (-1744794367))) * 184;
                                int i77 = ((i72 | i76) << 1) - (i72 ^ i76);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i78 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                int i79 = (((-1207966780) ^ i78) | ((-1207966780) & i78)) * 184;
                                int i80 = ((-1628011401) ^ i79) + (((-1628011401) & i79) << 1);
                                int i81 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | 637526916);
                                int i82 = (630661632 ^ i81) | (i81 & 630661632);
                                int i83 = ((i82 ^ (-1845493696)) | (i82 & (-1845493696))) * 184;
                                if (i77 <= (i80 & i83) + (i80 | i83)) {
                                    int i84 = i66 % ((i69 | (~((i67 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i67 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6)))) * 1504);
                                    int i85 = ~i63;
                                    int i86 = (i85 & i19) | (i85 ^ i19);
                                    int i87 = -((-1504) % (~((i86 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & i86))));
                                    i20 = (i84 ^ i87) + ((i84 & i87) << 1);
                                    i21 = ~i86;
                                    i22 = i68;
                                } else {
                                    int i88 = ~i63;
                                    int i89 = -(-((i69 | (~((i88 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i88 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6)))) * 1504));
                                    i20 = (((i66 ^ i89) + ((i66 & i89) << 1)) - (~((~(((i88 ^ i19) | (i88 & i19)) | iTuitionPaymentFragmentspecialinlinedviewModeldefault6)) * (-1504)))) - 1;
                                    i21 = ~((i67 ^ i19) | (i67 & i19));
                                    i22 = ~i19;
                                }
                                int i90 = 752 * (i21 | (~((i22 ^ i63) | (i63 & i22))));
                                int i91 = ((i20 | i90) << 1) - (i90 ^ i20);
                                int iResolveOpacity = Drawable.resolveOpacity(0, 0);
                                Object[] objArr9 = new Object[1];
                                d(scrollDefaultDelay, i91, (char) ((iResolveOpacity & 60843) + (iResolveOpacity | 60843)), objArr9);
                                Class<?> cls5 = Class.forName((String) objArr9[0]);
                                Object[] objArr10 = new Object[1];
                                d(61 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8, (char) ((-2) - (~(-TextUtils.indexOf((CharSequence) "", '0', 0)))), objArr10);
                                if (!(!((Boolean) cls5.getMethod((String) objArr10[0], Integer.TYPE).invoke(null, objArr)).booleanValue())) {
                                    Class cls6 = Long.TYPE;
                                    int i92 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i93 = i92 * (-716);
                                    int i94 = (i93 ^ (-1435)) + ((i93 & (-1435)) << 1);
                                    int i95 = ~i92;
                                    int i96 = i94 + (((i95 ^ (-1)) | i95) * (-1434));
                                    int i97 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                    int i98 = ~((~i97) | i97);
                                    int i99 = ~i92;
                                    int i100 = ~((i99 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i99 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                                    int i101 = -(-(((i98 & i100) | (i98 ^ i100)) * 717));
                                    int i102 = (i96 ^ i101) + ((i96 & i101) << 1);
                                    int i103 = ~((i95 ^ i97) | (i97 & i95));
                                    int i104 = ~(i92 | i95);
                                    int i105 = (i104 & i103) | (i103 ^ i104);
                                    int i106 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i107 = ((i106 | 41) << 1) - (i106 ^ 41);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i107 % 128;
                                    int i108 = i107 % 2;
                                    int i109 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault9 | ((-1) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                                    int i110 = (i102 - (~(717 * ((i105 & i109) | (i105 ^ i109))))) - 1;
                                    int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i111 = pressedStateDuration * 483;
                                    int i112 = (i111 ^ 5808) + ((i111 & 5808) << 1);
                                    int i113 = ~pressedStateDuration;
                                    int i114 = ~((i113 ^ (-25)) | (i113 & (-25)));
                                    int i115 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i116 = (i115 & 83) + (i115 | 83);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i116 % 128;
                                    int i117 = i116 % 2;
                                    int i118 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                    int i119 = ~(i113 | i118);
                                    int i120 = (-241) * ((i119 & i114) | (i114 ^ i119));
                                    int i121 = (i112 & i120) + (i112 | i120);
                                    int i122 = -(-(((pressedStateDuration ^ 24) | (pressedStateDuration & 24)) * (-482)));
                                    int i123 = (i121 ^ i122) + ((i121 & i122) << 1);
                                    int i124 = ~(((-25) ^ pressedStateDuration) | ((-25) & pressedStateDuration));
                                    int i125 = ~pressedStateDuration;
                                    int i126 = (i125 & i118) | (i125 ^ i118);
                                    int i127 = ~((i126 & 24) | (i126 ^ 24));
                                    int i128 = -(-(((i127 & i124) | (i124 ^ i127)) * 241));
                                    Object[] objArr11 = new Object[1];
                                    d(i110, (i123 ^ i128) + ((i128 & i123) << 1), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr11);
                                    Class<?> cls7 = Class.forName((String) objArr11[0]);
                                    int packedPositionType = ExpandableListView.getPackedPositionType(0L);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i129 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                    int i130 = (((packedPositionType * (-115)) - 8050) - (~((~(((i129 & packedPositionType) | (i129 ^ packedPositionType)) | 70)) * (-116)))) - 1;
                                    int i131 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i131 % 128;
                                    int i132 = i131 % 2;
                                    int i133 = i130 + (116 * (packedPositionType | iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                                    int i134 = ~((~packedPositionType) | (-71));
                                    int i135 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault11 | (-71));
                                    int i136 = -(-(((i135 & i134) | (i134 ^ i135)) * 116));
                                    int i137 = ((i133 | i136) << 1) - (i136 ^ i133);
                                    int i138 = 11 - (~(-TextUtils.lastIndexOf("", '0', 0, 0)));
                                    int threadPriority = Process.getThreadPriority(0);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i139 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i140 = (i139 ^ 91) + ((i139 & 91) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i140 % 128;
                                    int i141 = i140 % 2;
                                    int i142 = (-6741) - (~(threadPriority * 339));
                                    int i143 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                    int i144 = ~(((-21) ^ i143) | (i143 & (-21)));
                                    int i145 = ~threadPriority;
                                    int i146 = ~((i145 ^ 20) | (i145 & 20));
                                    int i147 = (i144 ^ i146) | (i144 & i146);
                                    int i148 = ~((20 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | (20 & iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
                                    int i149 = ((i147 ^ i148) | (i147 & i148)) * (-338);
                                    int i150 = ((i142 | i149) << 1) - (i142 ^ i149);
                                    int i151 = -(-((~(((-21) & threadPriority) | ((-21) ^ threadPriority))) * 338));
                                    int i152 = ((i150 | i151) << 1) - (i151 ^ i150);
                                    int i153 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                    int i154 = (threadPriority & 20) | (threadPriority ^ 20);
                                    char c = (char) ((i152 + (((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault12 & i154) | (i154 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12))) | (~(((-21) ^ i153) | (i153 & (-21))))) * 338)) >> 6);
                                    Object[] objArr12 = new Object[1];
                                    d(i137, i138, c, objArr12);
                                    if (cls6.equals(cls7.getMethod((String) objArr12[0], null).invoke(method2, null))) {
                                        int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                        int i155 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                        int i156 = ~(((-25) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault13) | ((-25) & iTuitionPaymentFragmentspecialinlinedviewModeldefault13));
                                        int i157 = ~((i155 ^ 24) | (i155 & 24));
                                        int i158 = (i155 * (-501)) + 12072 + (((i156 & i157) | (i156 ^ i157)) * (-502));
                                        int i159 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                                        int i160 = ((-25) & i159) | ((-25) ^ i159);
                                        int i161 = -(-((~((i160 & i155) | (i160 ^ i155))) * (-502)));
                                        int i162 = ((i158 | i161) << 1) - (i158 ^ i161);
                                        int i163 = ~i155;
                                        int i164 = ~((i163 & iTuitionPaymentFragmentspecialinlinedviewModeldefault13) | (i163 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault13));
                                        int i165 = (((-25) & i164) | ((-25) ^ i164)) * TypedValues.PositionType.TYPE_DRAWPATH;
                                        int i166 = ((i162 | i165) << 1) - (i165 ^ i162);
                                        int gidForName = Process.getGidForName("");
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault14 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                        int i167 = gidForName * 595;
                                        int i168 = ((i167 | (-1187)) << 1) - (i167 ^ (-1187));
                                        int i169 = ~((~gidForName) | 1);
                                        int i170 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                                        int i171 = ~((i170 ^ 1) | (i170 & 1));
                                        int i172 = i168 + (((i169 ^ i171) | (i169 & i171)) * (-1188));
                                        int i173 = ~gidForName;
                                        int i174 = ~((i173 & 1) | (i173 ^ 1));
                                        int i175 = ~((-2) | iTuitionPaymentFragmentspecialinlinedviewModeldefault14);
                                        int i176 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                                        int i177 = -(-(((i174 ^ i175) | (i174 & i175) | (~((i176 ^ gidForName) | (i176 & gidForName)))) * 594));
                                        int i178 = (i172 ^ i177) + ((i177 & i172) << 1);
                                        int i179 = ~((i176 & (-2)) | ((-2) ^ i176));
                                        int i180 = ~(((-2) ^ gidForName) | ((-2) & gidForName));
                                        int i181 = (i179 & i180) | (i179 ^ i180);
                                        int i182 = ~((gidForName & i170) | (i170 ^ gidForName));
                                        int i183 = -(-(((i182 & i181) | (i181 ^ i182)) * 594));
                                        Object[] objArr13 = new Object[1];
                                        d(maximumFlingVelocity, i166, (char) (((i178 | i183) << 1) - (i183 ^ i178)), objArr13);
                                        Class<?> cls8 = Class.forName((String) objArr13[0]);
                                        int capsMode = 83 - TextUtils.getCapsMode("", 0, 0);
                                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault15 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                        int i184 = iNormalizeMetaState * 69;
                                        int i185 = ((i184 | (-1139)) << 1) - (i184 ^ (-1139));
                                        int i186 = ~iNormalizeMetaState;
                                        int i187 = i186 | (-18);
                                        int i188 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault15;
                                        int i189 = ~((i187 & i188) | (i187 ^ i188));
                                        int i190 = ~((iNormalizeMetaState & 17) | (iNormalizeMetaState ^ 17));
                                        int i191 = -(-(((i190 & i189) | (i189 ^ i190) | (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault15 ^ 17) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault15 & 17)))) * (-68)));
                                        int i192 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault15;
                                        int i193 = (((i185 ^ i191) + ((i191 & i185) << 1)) - (~(-(-((~(((i192 & i186) | (i186 ^ i192)) | 17)) * (-68)))))) - 1;
                                        int i194 = ~(((-18) & i188) | ((-18) ^ i188));
                                        int i195 = -(-(((i194 & i186) | (i186 ^ i194)) * 68));
                                        int i196 = (i193 ^ i195) + ((i195 & i193) << 1);
                                        int i197 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                        Object[] objArr14 = new Object[1];
                                        d(capsMode, i196, (char) ((i197 ^ 30409) + ((i197 & 30409) << 1)), objArr14);
                                        Object[] objArr15 = (Object[]) cls8.getMethod((String) objArr14[0], null).invoke(method2, null);
                                        if (objArr15.length == 2) {
                                            int i198 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            int i199 = ((i198 | 9) << 1) - (i198 ^ 9);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i199 % 128;
                                            if (i199 % 2 == 0) {
                                                if (Long.TYPE.equals(objArr15[0])) {
                                                    packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                                                    packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L);
                                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                                    i23 = (packedPositionGroup2 * (-167)) - 4008;
                                                    int i200 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                    i24 = ((i200 | 47) << 1) - (i200 ^ 47);
                                                    i25 = i24 % 128;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25;
                                                    if (i24 % 2 == 0) {
                                                        Object obj = null;
                                                        obj.hashCode();
                                                        throw null;
                                                    }
                                                    int i201 = ~packedPositionGroup2;
                                                    i26 = ~((i201 & (-25)) | (i201 ^ (-25)));
                                                    i27 = ((i25 | 113) << 1) - (i25 ^ 113);
                                                    int i202 = i27 % 128;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i202;
                                                    if (i27 % 2 == 0) {
                                                        int i203 = ~(((-25) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-25) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                                        int i204 = -((i203 & i26) | (i26 ^ i203));
                                                        i28 = i23 * ((336 ^ i204) + ((i204 & 336) << 1));
                                                    } else {
                                                        int i205 = ~(((-25) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-25) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                                        int i206 = 336 * ((i205 & i26) | (i26 ^ i205));
                                                        i28 = (i23 | i206) + (i23 & i206);
                                                    }
                                                    int i207 = ~(packedPositionGroup2 | 24);
                                                    int i208 = ~(packedPositionGroup2 | iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                                                    int i209 = (i28 - (~(-(-((-168) * ((i207 & i208) | (i207 ^ i208))))))) - 1;
                                                    int i210 = (i202 ^ 21) + ((i202 & 21) << 1);
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i210 % 128;
                                                    i29 = i210 % 2;
                                                    int i211 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                                    int i212 = (i211 & packedPositionGroup2) | (i211 ^ packedPositionGroup2);
                                                    if (i29 != 0) {
                                                        int i213 = 28 / 0;
                                                    }
                                                    int i214 = ~i212;
                                                    int i215 = 168 * ((i214 & (-25)) | ((-25) ^ i214));
                                                    Object[] objArr16 = new Object[1];
                                                    d(packedPositionGroup, (i209 ^ i215) + ((i209 & i215) << 1), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr16);
                                                    cls = Class.forName((String) objArr16[0]);
                                                    int i216 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                    int i217 = ((i216 | 21) << 1) - (i216 ^ 21);
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i217 % 128;
                                                    int i218 = i217 % 2;
                                                    if (!cls.equals(objArr15[1])) {
                                                        i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i30 % 128;
                                                        if (i30 % 2 != 0) {
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                                                                int iAlpha = 2823 - android.graphics.Color.alpha(0);
                                                                int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L) + 22;
                                                                byte[] bArr3 = $$d;
                                                                byte b8 = bArr3[5];
                                                                Object[] objArr17 = new Object[1];
                                                                c(b8, bArr3[7], b8, objArr17);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, iAlpha, packedPositionGroup3, 1814927978, false, (String) objArr17[0], null);
                                                            }
                                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, method2);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                                char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                                                int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 2823;
                                                                int mirror = AndroidCharacter.getMirror('0') - 26;
                                                                byte[] bArr4 = $$d;
                                                                byte b9 = bArr4[5];
                                                                Object[] objArr18 = new Object[1];
                                                                c(b9, bArr4[7], b9, objArr18);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(threadPriority2, iNormalizeMetaState2, mirror, 1814927978, false, (String) objArr18[0], null);
                                                            }
                                                            Object[] objArr19 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                                char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                                int i219 = 2823 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                int iRgb = android.graphics.Color.rgb(0, 0, 0) + 16777238;
                                                                byte[] bArr5 = $$d;
                                                                byte b10 = bArr5[7];
                                                                Object[] objArr20 = new Object[1];
                                                                c(b10, bArr5[10], b10, objArr20);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(windowTouchSlop, i219, iRgb, -2137287382, false, (String) objArr20[0], new Class[]{Long.TYPE, Method.class});
                                                            }
                                                            l = (Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr19);
                                                        } else {
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                                                                int iResolveSizeAndState = 2823 - View.resolveSizeAndState(0, 0, 0);
                                                                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 22;
                                                                byte[] bArr6 = $$d;
                                                                byte b11 = bArr6[5];
                                                                Object[] objArr21 = new Object[1];
                                                                c(b11, bArr6[7], b11, objArr21);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iResolveSizeAndState, maxKeyCode, 1814927978, false, (String) objArr21[0], null);
                                                            }
                                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                                char cMyTid = (char) (Process.myTid() >> 22);
                                                                int jumpTapTimeout = 2823 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                                                int i220 = 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                byte[] bArr7 = $$d;
                                                                byte b12 = bArr7[5];
                                                                Object[] objArr22 = new Object[1];
                                                                c(b12, bArr7[7], b12, objArr22);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, jumpTapTimeout, i220, 1814927978, false, (String) objArr22[0], null);
                                                            }
                                                            Object[] objArr23 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                                char defaultSize = (char) View.getDefaultSize(0, 0);
                                                                int iKeyCodeFromString = 2823 - KeyEvent.keyCodeFromString("");
                                                                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 22;
                                                                byte[] bArr8 = $$d;
                                                                byte b13 = bArr8[7];
                                                                Object[] objArr24 = new Object[1];
                                                                c(b13, bArr8[10], b13, objArr24);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize, iKeyCodeFromString, fadingEdgeLength, -2137287382, false, (String) objArr24[0], new Class[]{Long.TYPE, Method.class});
                                                            }
                                                            l = (Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr23);
                                                        }
                                                        l.longValue();
                                                        i = -2001519171;
                                                        break;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            } else if (Long.TYPE.equals(objArr15[0])) {
                                                packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                                                packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L);
                                                iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                                i23 = (packedPositionGroup2 * (-167)) - 4008;
                                                int i2010 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                i24 = ((i2010 | 47) << 1) - (i2010 ^ 47);
                                                i25 = i24 % 128;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25;
                                                if (i24 % 2 == 0) {
                                                    Object obj2 = null;
                                                    obj2.hashCode();
                                                    throw null;
                                                }
                                                int i2011 = ~packedPositionGroup2;
                                                i26 = ~((i2011 & (-25)) | (i2011 ^ (-25)));
                                                i27 = ((i25 | 113) << 1) - (i25 ^ 113);
                                                int i2012 = i27 % 128;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2012;
                                                if (i27 % 2 == 0) {
                                                    int i2013 = ~(((-25) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-25) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                                    int i2014 = -((i2013 & i26) | (i26 ^ i2013));
                                                    i28 = i23 * ((336 ^ i2014) + ((i2014 & 336) << 1));
                                                } else {
                                                    int i2015 = ~(((-25) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-25) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                                    int i2016 = 336 * ((i2015 & i26) | (i26 ^ i2015));
                                                    i28 = (i23 | i2016) + (i23 & i2016);
                                                }
                                                int i2017 = ~(packedPositionGroup2 | 24);
                                                int i2018 = ~(packedPositionGroup2 | iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                                                int i2019 = (i28 - (~(-(-((-168) * ((i2017 & i2018) | (i2017 ^ i2018))))))) - 1;
                                                int i2110 = (i2012 ^ 21) + ((i2012 & 21) << 1);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2110 % 128;
                                                i29 = i2110 % 2;
                                                int i2111 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                                int i2112 = (i2111 & packedPositionGroup2) | (i2111 ^ packedPositionGroup2);
                                                if (i29 != 0) {
                                                    int i2113 = 28 / 0;
                                                }
                                                int i2114 = ~i2112;
                                                int i2115 = 168 * ((i2114 & (-25)) | ((-25) ^ i2114));
                                                Object[] objArr110 = new Object[1];
                                                d(packedPositionGroup, (i2019 ^ i2115) + ((i2019 & i2115) << 1), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr110);
                                                cls = Class.forName((String) objArr110[0]);
                                                int i2116 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                int i2117 = ((i2116 | 21) << 1) - (i2116 ^ 21);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2117 % 128;
                                                int i2118 = i2117 % 2;
                                                if (!cls.equals(objArr15[1])) {
                                                    i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i30 % 128;
                                                    if (i30 % 2 != 0) {
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                            char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                                                            int iAlpha2 = 2823 - android.graphics.Color.alpha(0);
                                                            int packedPositionGroup4 = ExpandableListView.getPackedPositionGroup(0L) + 22;
                                                            byte[] bArr9 = $$d;
                                                            byte b14 = bArr9[5];
                                                            Object[] objArr111 = new Object[1];
                                                            c(b14, bArr9[7], b14, objArr111);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf2, iAlpha2, packedPositionGroup4, 1814927978, false, (String) objArr111[0], null);
                                                        }
                                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, method2);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                            char threadPriority3 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                                            int iNormalizeMetaState3 = KeyEvent.normalizeMetaState(0) + 2823;
                                                            int mirror2 = AndroidCharacter.getMirror('0') - 26;
                                                            byte[] bArr10 = $$d;
                                                            byte b15 = bArr10[5];
                                                            Object[] objArr112 = new Object[1];
                                                            c(b15, bArr10[7], b15, objArr112);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(threadPriority3, iNormalizeMetaState3, mirror2, 1814927978, false, (String) objArr112[0], null);
                                                        }
                                                        Object[] objArr113 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                            char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                            int i2119 = 2823 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                            int iRgb2 = android.graphics.Color.rgb(0, 0, 0) + 16777238;
                                                            byte[] bArr11 = $$d;
                                                            byte b16 = bArr11[7];
                                                            Object[] objArr25 = new Object[1];
                                                            c(b16, bArr11[10], b16, objArr25);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(windowTouchSlop2, i2119, iRgb2, -2137287382, false, (String) objArr25[0], new Class[]{Long.TYPE, Method.class});
                                                        }
                                                        l = (Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr113);
                                                    } else {
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                            char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                                                            int iResolveSizeAndState2 = 2823 - View.resolveSizeAndState(0, 0, 0);
                                                            int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 22;
                                                            byte[] bArr12 = $$d;
                                                            byte b17 = bArr12[5];
                                                            Object[] objArr26 = new Object[1];
                                                            c(b17, bArr12[7], b17, objArr26);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf2, iResolveSizeAndState2, maxKeyCode2, 1814927978, false, (String) objArr26[0], null);
                                                        }
                                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                            char cMyTid2 = (char) (Process.myTid() >> 22);
                                                            int jumpTapTimeout2 = 2823 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                                            int i221 = 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                            byte[] bArr13 = $$d;
                                                            byte b18 = bArr13[5];
                                                            Object[] objArr27 = new Object[1];
                                                            c(b18, bArr13[7], b18, objArr27);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid2, jumpTapTimeout2, i221, 1814927978, false, (String) objArr27[0], null);
                                                        }
                                                        Object[] objArr28 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                            char defaultSize2 = (char) View.getDefaultSize(0, 0);
                                                            int iKeyCodeFromString2 = 2823 - KeyEvent.keyCodeFromString("");
                                                            int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 22;
                                                            byte[] bArr14 = $$d;
                                                            byte b19 = bArr14[7];
                                                            Object[] objArr29 = new Object[1];
                                                            c(b19, bArr14[10], b19, objArr29);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize2, iKeyCodeFromString2, fadingEdgeLength2, -2137287382, false, (String) objArr29[0], new Class[]{Long.TYPE, Method.class});
                                                        }
                                                        l = (Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr28);
                                                    }
                                                    l.longValue();
                                                    i = -2001519171;
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                i39 = (i39 & 1) + (i39 | 1);
                                i31 = 2;
                                i37 = -2001519171;
                                i36 = 0;
                                i35 = 1;
                                i38 = 16;
                                j = 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        }
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                            char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                            int i222 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2823;
                            int scrollBarSize = 22 - (ViewConfiguration.getScrollBarSize() >> 8);
                            byte[] bArr15 = $$d;
                            byte b20 = bArr15[5];
                            Object[] objArr30 = new Object[1];
                            c(b20, bArr15[7], b20, objArr30);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, i222, scrollBarSize, 1814927978, false, (String) objArr30[0], null);
                        }
                        Object[] objArr31 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                            char cIndexOf3 = (char) TextUtils.indexOf("", "");
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 2824;
                            int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 22;
                            byte b21 = $$d[7];
                            byte b22 = b21;
                            Object[] objArr32 = new Object[1];
                            c(b22, (byte) (b22 | 14), b21, objArr32);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf3, packedPositionChild, pressedStateDuration2, 1025296417, false, (String) objArr32[0], new Class[]{Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr31);
                        Object[] objArr33 = {0, methodArr, null};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                            char c3 = (char) (37658 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 2720;
                            int iMyTid = (Process.myTid() >> 22) + 19;
                            byte b23 = $$d[7];
                            byte b24 = b23;
                            Object[] objArr34 = new Object[1];
                            c(b24, (byte) (b24 | 14), b23, objArr34);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c3, iMakeMeasureSpec, iMyTid, -1568796068, false, (String) objArr34[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                        }
                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr33)).longValue();
                        long j2 = -1403844110;
                        long j3 = 988;
                        long j4 = -1;
                        long j5 = jLongValue ^ j4;
                        long jUptimeMillis2 = (int) SystemClock.uptimeMillis();
                        long j6 = jUptimeMillis2 ^ j4;
                        long j7 = (((long) 989) * j2) + (((long) (-987)) * jLongValue) + (((((j5 | j6) | j2) ^ j4) | (((j2 | jLongValue) | jUptimeMillis2) ^ j4)) * j3) + (((long) (-988)) * (j2 | j5)) + (j3 * ((((j2 ^ j4) | j5) ^ j4) | ((j5 | jUptimeMillis2) ^ j4) | ((jLongValue | (j6 | j2)) ^ j4))) + ((long) (-406561735));
                        int iMyPid = Process.myPid();
                        int i223 = ((int) (j7 >> 32)) & ((-28224580) + ((~((~iMyPid) | (-71434321))) * 433) + (((~((-826031023) | iMyPid)) | (-611195389)) * (-433)) + (((~(iMyPid | (-611195389))) | (-897465343)) * 433));
                        int startUptimeMillis = (int) Process.getStartUptimeMillis();
                        int i224 = ((int) j7) & ((-1520785380) + (((~((~startUptimeMillis) | 790833090)) | (-2134091732)) * 529) + (((~(startUptimeMillis | 790833090)) | (-2066907796)) * 529));
                        int i225 = (i223 & i224) | (i223 ^ i224);
                        int i226 = i225 >>> 24;
                        int i227 = i225 & ViewCompat.MEASURED_SIZE_MASK;
                        int i228 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if (i226 != 0) {
                            int i229 = i228 + 13;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i229 % 128;
                            if (i229 % 2 != 0) {
                                i2 = 1;
                            }
                            if ((i2 ^ 1) != 0) {
                                i5 = 2;
                                i7 = 0;
                                i3 = 1;
                            } else {
                                int i230 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                i3 = 1;
                                i4 = (i230 ^ 89) + ((i230 & 89) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                                i5 = 2;
                                if (i4 % 2 != 0) {
                                    i6 = 0;
                                } else {
                                    i6 = 1;
                                }
                                i7 = i6;
                            }
                            if ((i2 ^ i3) != i3 || i227 >= i5) {
                                string = null;
                            } else {
                                int i231 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i232 = ((i231 | 23) << i3) - (i231 ^ 23);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i232 % 128;
                                int i233 = i232 % i5;
                                Method method3 = methodArr[i227];
                                if (method3 != null) {
                                    string = method3.toString();
                                } else {
                                    string = null;
                                }
                            }
                            list.add(string);
                            int i234 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i235 = (i234 ^ 79) + ((i234 & 79) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i235 % 128;
                            i8 = i235 % 2;
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            if (i8 != 0) {
                                int i236 = 16 / 0;
                            }
                            i9 = 5759 - (~(-(-(i226 * (-1917)))));
                            i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i11 = ((i10 | 21) << 1) - (i10 ^ 21);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                            if (i11 % 2 != 0) {
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            int i237 = ~((~i226) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            int i238 = ~((6 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (6 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            i12 = i9 + (959 * ((i237 & i238) | (i237 ^ i238)));
                            int i239 = (i10 ^ 41) + ((i10 & 41) << 1);
                            int i240 = i239 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i240;
                            i13 = i239 % 2;
                            i14 = ~i226;
                            if (i13 == 0) {
                                i15 = i12 / ((-959) >>> i14);
                            } else {
                                int i241 = i14 * (-959);
                                i15 = (i12 | i241) + (i12 & i241);
                            }
                            i16 = ~((i14 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i14 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            int i242 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i17 = ~((i242 & 6) | (i242 ^ 6));
                            i18 = (i240 ^ 15) + ((i240 & 15) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                            if (i18 % 2 != 0) {
                                return (i15 >> (959 % ((i17 & i16) | (i16 ^ i17)))) << i7;
                            }
                            int i243 = -(-(959 * ((i17 & i16) | (i16 ^ i17))));
                            return (((i15 | i243) << 1) - (i243 ^ i15)) * i7;
                        }
                        int i244 = (i228 & 9) + (i228 | 9);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i244 % 128;
                        int i245 = i244 % 2;
                        i2 = 0;
                        if ((i2 ^ 1) != 0) {
                            i5 = 2;
                            i7 = 0;
                            i3 = 1;
                        } else {
                            int i2310 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            i3 = 1;
                            i4 = (i2310 ^ 89) + ((i2310 & 89) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                            i5 = 2;
                            if (i4 % 2 != 0) {
                                i6 = 0;
                            } else {
                                i6 = 1;
                            }
                            i7 = i6;
                        }
                        if ((i2 ^ i3) != i3) {
                            string = null;
                        } else {
                            string = null;
                        }
                        list.add(string);
                        int i2311 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i2312 = (i2311 ^ 79) + ((i2311 & 79) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2312 % 128;
                        i8 = i2312 % 2;
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        if (i8 != 0) {
                            int i2313 = 16 / 0;
                        }
                        i9 = 5759 - (~(-(-(i226 * (-1917)))));
                        i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        i11 = ((i10 | 21) << 1) - (i10 ^ 21);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                        if (i11 % 2 != 0) {
                            Object obj4 = null;
                            obj4.hashCode();
                            throw null;
                        }
                        int i2314 = ~((~i226) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i2315 = ~((6 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (6 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        i12 = i9 + (959 * ((i2314 & i2315) | (i2314 ^ i2315)));
                        int i2316 = (i10 ^ 41) + ((i10 & 41) << 1);
                        int i246 = i2316 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i246;
                        i13 = i2316 % 2;
                        i14 = ~i226;
                        if (i13 == 0) {
                            i15 = i12 / ((-959) >>> i14);
                        } else {
                            int i247 = i14 * (-959);
                            i15 = (i12 | i247) + (i12 & i247);
                        }
                        i16 = ~((i14 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i14 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i248 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        i17 = ~((i248 & 6) | (i248 ^ 6));
                        i18 = (i246 ^ 15) + ((i246 & 15) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                        if (i18 % 2 != 0) {
                            return (i15 >> (959 % ((i17 & i16) | (i16 ^ i17)))) << i7;
                        }
                        int i249 = -(-(959 * ((i17 & i16) | (i16 ^ i17))));
                        return (((i15 | i249) << 1) - (i249 ^ i15)) * i7;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0023  */
                /* JADX WARN: Code duplicated, block: B:8:0x001d  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static java.lang.String $$g(int r7, int r8, byte r9) {
                    /*
                        byte[] r0 = AllCapsTransformationMethod.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass3.b.$$c
                        int r9 = r9 + 4
                        int r8 = r8 * 3
                        int r8 = 115 - r8
                        int r7 = r7 * 3
                        int r7 = r7 + 1
                        byte[] r1 = new byte[r7]
                        r2 = 0
                        if (r0 != 0) goto L15
                        r8 = r7
                        r3 = r9
                        r5 = r2
                        goto L2a
                    L15:
                        r3 = r2
                    L16:
                        byte r4 = (byte) r8
                        int r5 = r3 + 1
                        r1[r3] = r4
                        if (r5 != r7) goto L23
                        java.lang.String r7 = new java.lang.String
                        r7.<init>(r1, r2)
                        return r7
                    L23:
                        int r9 = r9 + 1
                        r3 = r0[r9]
                        r6 = r3
                        r3 = r9
                        r9 = r6
                    L2a:
                        int r8 = r8 + r9
                        r9 = r3
                        r3 = r5
                        goto L16
                    */
                    throw new UnsupportedOperationException("Method not decompiled: AllCapsTransformationMethod.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass3.b.$$g(int, int, byte):java.lang.String");
                }
            }

            /* JADX INFO: renamed from: AllCapsTransformationMethod$TuitionPaymentFragmentspecialinlinedviewModeldefault3$3$TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
            static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Function3<RowScope, Composer, Integer, Unit> {
                private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
                    Composer composer2 = composer;
                    int iIntValue = num.intValue();
                    Intrinsics.checkNotNullParameter(rowScope, "");
                    if ((iIntValue & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1000936693, iIntValue, -1, "com.bpjstku.presentation.compose.common.ProcessResultDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProcessResultDialog.kt:146)");
                        }
                        TextKt.m2654Text4IGK_g(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    return Unit.INSTANCE;
                }

                TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
                }
            }

            public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function0 function0, Function0 function1) {
                if (function0 != null) {
                    function0.invoke();
                }
                function1.invoke();
                return Unit.INSTANCE;
            }

            public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function0 function0, Function0 function1) {
                function0.invoke();
                function1.invoke();
                return Unit.INSTANCE;
            }

            AnonymousClass3(Integer num, String str, String str2, Function0<Unit> function0, Function0<Unit> function1, String str3, Function0<Unit> function2, String str4) {
                this.TuitionPaymentFragmentbindingInflater1 = num;
                this.asBinder = str;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function0;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
                this.g = str3;
                this.d = function2;
                this.b = str4;
            }
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Modifier modifier, Integer num, String str, String str2, Function0<Unit> function0, Function0<Unit> function1, String str3, Function0<Unit> function2, String str4) {
            this.TuitionPaymentFragmentbindingInflater1 = modifier;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = num;
            this.g = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
            this.b = function0;
            this.f61a = function1;
            this.asBinder = str3;
            this.d = function2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0124  */
    /* JADX WARN: Code duplicated, block: B:104:0x0127  */
    /* JADX WARN: Code duplicated, block: B:108:0x0135  */
    /* JADX WARN: Code duplicated, block: B:111:0x014b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x014d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0154  */
    /* JADX WARN: Code duplicated, block: B:115:0x0158  */
    /* JADX WARN: Code duplicated, block: B:116:0x015c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0160  */
    /* JADX WARN: Code duplicated, block: B:119:0x0164  */
    /* JADX WARN: Code duplicated, block: B:122:0x0169  */
    /* JADX WARN: Code duplicated, block: B:123:0x016b  */
    /* JADX WARN: Code duplicated, block: B:125:0x016f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0181  */
    /* JADX WARN: Code duplicated, block: B:129:0x0190  */
    /* JADX WARN: Code duplicated, block: B:132:0x0198  */
    /* JADX WARN: Code duplicated, block: B:135:0x01af  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:147:0x021a  */
    /* JADX WARN: Code duplicated, block: B:151:0x022d  */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0106  */
    /* JADX WARN: Code duplicated, block: B:94:0x0109  */
    /* JADX WARN: Code duplicated, block: B:98:0x0113  */
    /* JADX WARN: Code duplicated, block: B:99:0x0118  */
    public static final void TuitionPaymentFragmentbindingInflater1(final Integer num, final String str, final String str2, final String str3, final Function0<Unit> function0, Modifier modifier, String str4, Function0<Unit> function1, boolean z, Function0<Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Modifier modifier2;
        String str5;
        Function0<Unit> function3;
        final boolean z2;
        final Function0<Unit> function4;
        boolean z3;
        boolean z4;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        final String str6;
        final Function0<Unit> function5;
        final Function0<Unit> function6;
        final boolean z5;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(1947896447);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(num) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        int i12 = i2 & 32;
        if (i12 == 0) {
            if ((196608 & i) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    if (composerStartRestartGroup.changed(str4)) {
                        i5 = 1048576;
                    } else {
                        i5 = 524288;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    if ((12582912 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i7 = 8388608;
                        } else {
                            i7 = 4194304;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 256;
                    if (i8 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(z)) {
                            i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i9 = 33554432;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 512;
                    if (i10 != 0) {
                        i3 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i11 = 536870912;
                        } else {
                            i11 = 268435456;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 306783379) != 306783378 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        str6 = str4;
                        function5 = function1;
                        function6 = function2;
                        composer2 = composerStartRestartGroup;
                        z5 = z;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if (i8 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceGroup(200649007);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: ActionBarPolicy
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function4 = (Function0) objRememberedValue2;
                        } else {
                            function4 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1947896447, i3, -1, "com.bpjstku.presentation.compose.common.ProcessResultDialog (ProcessResultDialog.kt:80)");
                        }
                        composerStartRestartGroup.startReplaceGroup(200650229);
                        if ((234881024 & i3) == 67108864) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = (i3 & 1879048192) == 536870912;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!(z3 | z4) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: onFocusChanged
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    boolean z6 = z2;
                                    Function0 function7 = function4;
                                    if (z6) {
                                        function7.invoke();
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Function0<Unit> function7 = function4;
                        boolean z6 = z2;
                        composer2 = composerStartRestartGroup;
                        AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(-603985450, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(modifier2, num, str, str2, function0, function4, str5, function3, str3), composer2, 54), composer2, 384, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        str6 = str5;
                        function5 = function3;
                        function6 = function7;
                        z5 = z6;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getTransformation
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Integer num2 = num;
                                String str7 = str;
                                String str8 = str2;
                                String str9 = str3;
                                Function0 function8 = function0;
                                Modifier modifier4 = modifier3;
                                String str10 = str6;
                                Function0 function9 = function5;
                                boolean z7 = z5;
                                Function0 function10 = function6;
                                int i13 = i;
                                AllCapsTransformationMethod.TuitionPaymentFragmentbindingInflater1(num2, str7, str8, str9, function8, modifier4, str10, function9, z7, function10, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i13 | 1), i2);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }
                i3 |= 12582912;
                i8 = i2 & 256;
                if (i8 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i9 = 33554432;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 512;
                if (i10 != 0) {
                    i3 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i3 |= i11;
                }
                if ((i3 & 306783379) != 306783378) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i8 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceGroup(200649007);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: ActionBarPolicy
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function4 = (Function0) objRememberedValue2;
                    } else {
                        function4 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1947896447, i3, -1, "com.bpjstku.presentation.compose.common.ProcessResultDialog (ProcessResultDialog.kt:80)");
                    }
                    composerStartRestartGroup.startReplaceGroup(200650229);
                    if ((234881024 & i3) == 67108864) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i3 & 1879048192) == 536870912) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(z3 | z4)) {
                        objRememberedValue = new Function0() { // from class: onFocusChanged
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                boolean z7 = z2;
                                Function0 function8 = function4;
                                if (z7) {
                                    function8.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new Function0() { // from class: onFocusChanged
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                boolean z7 = z2;
                                Function0 function8 = function4;
                                if (z7) {
                                    function8.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function0<Unit> function8 = function4;
                    boolean z7 = z2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(-603985450, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(modifier2, num, str, str2, function0, function4, str5, function3, str3), composer2, 54), composer2, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    str6 = str5;
                    function5 = function3;
                    function6 = function8;
                    z5 = z7;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i8 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceGroup(200649007);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: ActionBarPolicy
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function4 = (Function0) objRememberedValue2;
                    } else {
                        function4 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1947896447, i3, -1, "com.bpjstku.presentation.compose.common.ProcessResultDialog (ProcessResultDialog.kt:80)");
                    }
                    composerStartRestartGroup.startReplaceGroup(200650229);
                    if ((234881024 & i3) == 67108864) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i3 & 1879048192) == 536870912) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(z3 | z4)) {
                        objRememberedValue = new Function0() { // from class: onFocusChanged
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                boolean z8 = z2;
                                Function0 function9 = function4;
                                if (z8) {
                                    function9.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new Function0() { // from class: onFocusChanged
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                boolean z8 = z2;
                                Function0 function9 = function4;
                                if (z8) {
                                    function9.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function0<Unit> function9 = function4;
                    boolean z8 = z2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(-603985450, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(modifier2, num, str, str2, function0, function4, str5, function3, str3), composer2, 54), composer2, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    str6 = str5;
                    function5 = function3;
                    function6 = function9;
                    z5 = z8;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getTransformation
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Integer num2 = num;
                            String str7 = str;
                            String str8 = str2;
                            String str9 = str3;
                            Function0 function10 = function0;
                            Modifier modifier4 = modifier3;
                            String str10 = str6;
                            Function0 function11 = function5;
                            boolean z9 = z5;
                            Function0 function12 = function6;
                            int i13 = i;
                            AllCapsTransformationMethod.TuitionPaymentFragmentbindingInflater1(num2, str7, str8, str9, function10, modifier4, str10, function11, z9, function12, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i13 | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 1572864;
            i6 = i2 & 128;
            if (i6 != 0) {
                if ((12582912 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i9 = 33554432;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 512;
                if (i10 != 0) {
                    i3 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i3 |= i11;
                }
                if ((i3 & 306783379) != 306783378) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i8 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceGroup(200649007);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: ActionBarPolicy
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function4 = (Function0) objRememberedValue2;
                    } else {
                        function4 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1947896447, i3, -1, "com.bpjstku.presentation.compose.common.ProcessResultDialog (ProcessResultDialog.kt:80)");
                    }
                    composerStartRestartGroup.startReplaceGroup(200650229);
                    if ((234881024 & i3) == 67108864) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i3 & 1879048192) == 536870912) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(z3 | z4)) {
                        objRememberedValue = new Function0() { // from class: onFocusChanged
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                boolean z9 = z2;
                                Function0 function10 = function4;
                                if (z9) {
                                    function10.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new Function0() { // from class: onFocusChanged
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                boolean z9 = z2;
                                Function0 function10 = function4;
                                if (z9) {
                                    function10.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function0<Unit> function10 = function4;
                    boolean z9 = z2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(-603985450, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(modifier2, num, str, str2, function0, function4, str5, function3, str3), composer2, 54), composer2, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    str6 = str5;
                    function5 = function3;
                    function6 = function10;
                    z5 = z9;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i8 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceGroup(200649007);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: ActionBarPolicy
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function4 = (Function0) objRememberedValue2;
                    } else {
                        function4 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1947896447, i3, -1, "com.bpjstku.presentation.compose.common.ProcessResultDialog (ProcessResultDialog.kt:80)");
                    }
                    composerStartRestartGroup.startReplaceGroup(200650229);
                    if ((234881024 & i3) == 67108864) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i3 & 1879048192) == 536870912) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(z3 | z4)) {
                        objRememberedValue = new Function0() { // from class: onFocusChanged
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                boolean z10 = z2;
                                Function0 function11 = function4;
                                if (z10) {
                                    function11.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new Function0() { // from class: onFocusChanged
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                boolean z10 = z2;
                                Function0 function11 = function4;
                                if (z10) {
                                    function11.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function0<Unit> function11 = function4;
                    boolean z10 = z2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(-603985450, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(modifier2, num, str, str2, function0, function4, str5, function3, str3), composer2, 54), composer2, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    str6 = str5;
                    function5 = function3;
                    function6 = function11;
                    z5 = z10;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getTransformation
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Integer num2 = num;
                            String str7 = str;
                            String str8 = str2;
                            String str9 = str3;
                            Function0 function12 = function0;
                            Modifier modifier4 = modifier3;
                            String str10 = str6;
                            Function0 function13 = function5;
                            boolean z11 = z5;
                            Function0 function14 = function6;
                            int i13 = i;
                            AllCapsTransformationMethod.TuitionPaymentFragmentbindingInflater1(num2, str7, str8, str9, function12, modifier4, str10, function13, z11, function14, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i13 | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 12582912;
            i8 = i2 & 256;
            if (i8 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i9 = 33554432;
                }
                i3 |= i9;
            }
            i10 = i2 & 512;
            if (i10 != 0) {
                i3 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i11 = 536870912;
                } else {
                    i11 = 268435456;
                }
                i3 |= i11;
            }
            if ((i3 & 306783379) != 306783378) {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i6 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i8 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if (i10 != 0) {
                    composerStartRestartGroup.startReplaceGroup(200649007);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: ActionBarPolicy
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function4 = (Function0) objRememberedValue2;
                } else {
                    function4 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1947896447, i3, -1, "com.bpjstku.presentation.compose.common.ProcessResultDialog (ProcessResultDialog.kt:80)");
                }
                composerStartRestartGroup.startReplaceGroup(200650229);
                if ((234881024 & i3) == 67108864) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i3 & 1879048192) == 536870912) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(z3 | z4)) {
                    objRememberedValue = new Function0() { // from class: onFocusChanged
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean z11 = z2;
                            Function0 function12 = function4;
                            if (z11) {
                                function12.invoke();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function0() { // from class: onFocusChanged
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean z11 = z2;
                            Function0 function12 = function4;
                            if (z11) {
                                function12.invoke();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function0<Unit> function12 = function4;
                boolean z11 = z2;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(-603985450, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(modifier2, num, str, str2, function0, function4, str5, function3, str3), composer2, 54), composer2, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                str6 = str5;
                function5 = function3;
                function6 = function12;
                z5 = z11;
            } else {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i6 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i8 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if (i10 != 0) {
                    composerStartRestartGroup.startReplaceGroup(200649007);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: ActionBarPolicy
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function4 = (Function0) objRememberedValue2;
                } else {
                    function4 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1947896447, i3, -1, "com.bpjstku.presentation.compose.common.ProcessResultDialog (ProcessResultDialog.kt:80)");
                }
                composerStartRestartGroup.startReplaceGroup(200650229);
                if ((234881024 & i3) == 67108864) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i3 & 1879048192) == 536870912) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(z3 | z4)) {
                    objRememberedValue = new Function0() { // from class: onFocusChanged
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean z12 = z2;
                            Function0 function13 = function4;
                            if (z12) {
                                function13.invoke();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function0() { // from class: onFocusChanged
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean z12 = z2;
                            Function0 function13 = function4;
                            if (z12) {
                                function13.invoke();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function0<Unit> function13 = function4;
                boolean z12 = z2;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(-603985450, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(modifier2, num, str, str2, function0, function4, str5, function3, str3), composer2, 54), composer2, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                str6 = str5;
                function5 = function3;
                function6 = function13;
                z5 = z12;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getTransformation
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Integer num2 = num;
                        String str7 = str;
                        String str8 = str2;
                        String str9 = str3;
                        Function0 function14 = function0;
                        Modifier modifier4 = modifier3;
                        String str10 = str6;
                        Function0 function15 = function5;
                        boolean z13 = z5;
                        Function0 function16 = function6;
                        int i13 = i;
                        AllCapsTransformationMethod.TuitionPaymentFragmentbindingInflater1(num2, str7, str8, str9, function14, modifier4, str10, function15, z13, function16, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i13 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i4 = i2 & 64;
        if (i4 != 0) {
            if ((1572864 & i) == 0) {
                if (composerStartRestartGroup.changed(str4)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            i6 = i2 & 128;
            if (i6 != 0) {
                if ((12582912 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i9 = 33554432;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 512;
                if (i10 != 0) {
                    i3 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i3 |= i11;
                }
                if ((i3 & 306783379) != 306783378) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i8 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceGroup(200649007);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: ActionBarPolicy
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function4 = (Function0) objRememberedValue2;
                    } else {
                        function4 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1947896447, i3, -1, "com.bpjstku.presentation.compose.common.ProcessResultDialog (ProcessResultDialog.kt:80)");
                    }
                    composerStartRestartGroup.startReplaceGroup(200650229);
                    if ((234881024 & i3) == 67108864) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i3 & 1879048192) == 536870912) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(z3 | z4)) {
                        objRememberedValue = new Function0() { // from class: onFocusChanged
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                boolean z13 = z2;
                                Function0 function14 = function4;
                                if (z13) {
                                    function14.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new Function0() { // from class: onFocusChanged
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                boolean z13 = z2;
                                Function0 function14 = function4;
                                if (z13) {
                                    function14.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function0<Unit> function14 = function4;
                    boolean z13 = z2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(-603985450, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(modifier2, num, str, str2, function0, function4, str5, function3, str3), composer2, 54), composer2, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    str6 = str5;
                    function5 = function3;
                    function6 = function14;
                    z5 = z13;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i8 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceGroup(200649007);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: ActionBarPolicy
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function4 = (Function0) objRememberedValue2;
                    } else {
                        function4 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1947896447, i3, -1, "com.bpjstku.presentation.compose.common.ProcessResultDialog (ProcessResultDialog.kt:80)");
                    }
                    composerStartRestartGroup.startReplaceGroup(200650229);
                    if ((234881024 & i3) == 67108864) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i3 & 1879048192) == 536870912) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(z3 | z4)) {
                        objRememberedValue = new Function0() { // from class: onFocusChanged
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                boolean z14 = z2;
                                Function0 function15 = function4;
                                if (z14) {
                                    function15.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new Function0() { // from class: onFocusChanged
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                boolean z14 = z2;
                                Function0 function15 = function4;
                                if (z14) {
                                    function15.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function0<Unit> function15 = function4;
                    boolean z14 = z2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(-603985450, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(modifier2, num, str, str2, function0, function4, str5, function3, str3), composer2, 54), composer2, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    str6 = str5;
                    function5 = function3;
                    function6 = function15;
                    z5 = z14;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getTransformation
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Integer num2 = num;
                            String str7 = str;
                            String str8 = str2;
                            String str9 = str3;
                            Function0 function16 = function0;
                            Modifier modifier4 = modifier3;
                            String str10 = str6;
                            Function0 function17 = function5;
                            boolean z15 = z5;
                            Function0 function18 = function6;
                            int i13 = i;
                            AllCapsTransformationMethod.TuitionPaymentFragmentbindingInflater1(num2, str7, str8, str9, function16, modifier4, str10, function17, z15, function18, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i13 | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 12582912;
            i8 = i2 & 256;
            if (i8 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i9 = 33554432;
                }
                i3 |= i9;
            }
            i10 = i2 & 512;
            if (i10 != 0) {
                i3 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i11 = 536870912;
                } else {
                    i11 = 268435456;
                }
                i3 |= i11;
            }
            if ((i3 & 306783379) != 306783378) {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i6 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i8 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if (i10 != 0) {
                    composerStartRestartGroup.startReplaceGroup(200649007);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: ActionBarPolicy
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function4 = (Function0) objRememberedValue2;
                } else {
                    function4 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1947896447, i3, -1, "com.bpjstku.presentation.compose.common.ProcessResultDialog (ProcessResultDialog.kt:80)");
                }
                composerStartRestartGroup.startReplaceGroup(200650229);
                if ((234881024 & i3) == 67108864) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i3 & 1879048192) == 536870912) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(z3 | z4)) {
                    objRememberedValue = new Function0() { // from class: onFocusChanged
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean z15 = z2;
                            Function0 function16 = function4;
                            if (z15) {
                                function16.invoke();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function0() { // from class: onFocusChanged
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean z15 = z2;
                            Function0 function16 = function4;
                            if (z15) {
                                function16.invoke();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function0<Unit> function16 = function4;
                boolean z15 = z2;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(-603985450, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(modifier2, num, str, str2, function0, function4, str5, function3, str3), composer2, 54), composer2, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                str6 = str5;
                function5 = function3;
                function6 = function16;
                z5 = z15;
            } else {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i6 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i8 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if (i10 != 0) {
                    composerStartRestartGroup.startReplaceGroup(200649007);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: ActionBarPolicy
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function4 = (Function0) objRememberedValue2;
                } else {
                    function4 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1947896447, i3, -1, "com.bpjstku.presentation.compose.common.ProcessResultDialog (ProcessResultDialog.kt:80)");
                }
                composerStartRestartGroup.startReplaceGroup(200650229);
                if ((234881024 & i3) == 67108864) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i3 & 1879048192) == 536870912) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(z3 | z4)) {
                    objRememberedValue = new Function0() { // from class: onFocusChanged
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean z16 = z2;
                            Function0 function17 = function4;
                            if (z16) {
                                function17.invoke();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function0() { // from class: onFocusChanged
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean z16 = z2;
                            Function0 function17 = function4;
                            if (z16) {
                                function17.invoke();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function0<Unit> function17 = function4;
                boolean z16 = z2;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(-603985450, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(modifier2, num, str, str2, function0, function4, str5, function3, str3), composer2, 54), composer2, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                str6 = str5;
                function5 = function3;
                function6 = function17;
                z5 = z16;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getTransformation
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Integer num2 = num;
                        String str7 = str;
                        String str8 = str2;
                        String str9 = str3;
                        Function0 function18 = function0;
                        Modifier modifier4 = modifier3;
                        String str10 = str6;
                        Function0 function19 = function5;
                        boolean z17 = z5;
                        Function0 function110 = function6;
                        int i13 = i;
                        AllCapsTransformationMethod.TuitionPaymentFragmentbindingInflater1(num2, str7, str8, str9, function18, modifier4, str10, function19, z17, function110, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i13 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 1572864;
        i6 = i2 & 128;
        if (i6 != 0) {
            if ((12582912 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i3 |= i7;
            }
            i8 = i2 & 256;
            if (i8 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i9 = 33554432;
                }
                i3 |= i9;
            }
            i10 = i2 & 512;
            if (i10 != 0) {
                i3 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i11 = 536870912;
                } else {
                    i11 = 268435456;
                }
                i3 |= i11;
            }
            if ((i3 & 306783379) != 306783378) {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i6 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i8 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if (i10 != 0) {
                    composerStartRestartGroup.startReplaceGroup(200649007);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: ActionBarPolicy
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function4 = (Function0) objRememberedValue2;
                } else {
                    function4 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1947896447, i3, -1, "com.bpjstku.presentation.compose.common.ProcessResultDialog (ProcessResultDialog.kt:80)");
                }
                composerStartRestartGroup.startReplaceGroup(200650229);
                if ((234881024 & i3) == 67108864) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i3 & 1879048192) == 536870912) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(z3 | z4)) {
                    objRememberedValue = new Function0() { // from class: onFocusChanged
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean z17 = z2;
                            Function0 function18 = function4;
                            if (z17) {
                                function18.invoke();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function0() { // from class: onFocusChanged
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean z17 = z2;
                            Function0 function18 = function4;
                            if (z17) {
                                function18.invoke();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function0<Unit> function18 = function4;
                boolean z17 = z2;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(-603985450, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(modifier2, num, str, str2, function0, function4, str5, function3, str3), composer2, 54), composer2, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                str6 = str5;
                function5 = function3;
                function6 = function18;
                z5 = z17;
            } else {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i6 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i8 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if (i10 != 0) {
                    composerStartRestartGroup.startReplaceGroup(200649007);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: ActionBarPolicy
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function4 = (Function0) objRememberedValue2;
                } else {
                    function4 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1947896447, i3, -1, "com.bpjstku.presentation.compose.common.ProcessResultDialog (ProcessResultDialog.kt:80)");
                }
                composerStartRestartGroup.startReplaceGroup(200650229);
                if ((234881024 & i3) == 67108864) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i3 & 1879048192) == 536870912) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(z3 | z4)) {
                    objRememberedValue = new Function0() { // from class: onFocusChanged
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean z18 = z2;
                            Function0 function19 = function4;
                            if (z18) {
                                function19.invoke();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function0() { // from class: onFocusChanged
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean z18 = z2;
                            Function0 function19 = function4;
                            if (z18) {
                                function19.invoke();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function0<Unit> function19 = function4;
                boolean z18 = z2;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(-603985450, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(modifier2, num, str, str2, function0, function4, str5, function3, str3), composer2, 54), composer2, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                str6 = str5;
                function5 = function3;
                function6 = function19;
                z5 = z18;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getTransformation
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Integer num2 = num;
                        String str7 = str;
                        String str8 = str2;
                        String str9 = str3;
                        Function0 function110 = function0;
                        Modifier modifier4 = modifier3;
                        String str10 = str6;
                        Function0 function111 = function5;
                        boolean z19 = z5;
                        Function0 function112 = function6;
                        int i13 = i;
                        AllCapsTransformationMethod.TuitionPaymentFragmentbindingInflater1(num2, str7, str8, str9, function110, modifier4, str10, function111, z19, function112, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i13 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 12582912;
        i8 = i2 & 256;
        if (i8 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (composerStartRestartGroup.changed(z)) {
                i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i9 = 33554432;
            }
            i3 |= i9;
        }
        i10 = i2 & 512;
        if (i10 != 0) {
            i3 |= 805306368;
        } else if ((i & 805306368) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i11 = 536870912;
            } else {
                i11 = 268435456;
            }
            i3 |= i11;
        }
        if ((i3 & 306783379) != 306783378) {
            if (i12 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i4 != 0) {
                str5 = null;
            } else {
                str5 = str4;
            }
            if (i6 != 0) {
                function3 = null;
            } else {
                function3 = function1;
            }
            if (i8 != 0) {
                z2 = false;
            } else {
                z2 = z;
            }
            if (i10 != 0) {
                composerStartRestartGroup.startReplaceGroup(200649007);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: ActionBarPolicy
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                function4 = (Function0) objRememberedValue2;
            } else {
                function4 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1947896447, i3, -1, "com.bpjstku.presentation.compose.common.ProcessResultDialog (ProcessResultDialog.kt:80)");
            }
            composerStartRestartGroup.startReplaceGroup(200650229);
            if ((234881024 & i3) == 67108864) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i3 & 1879048192) == 536870912) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(z3 | z4)) {
                objRememberedValue = new Function0() { // from class: onFocusChanged
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean z19 = z2;
                        Function0 function110 = function4;
                        if (z19) {
                            function110.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new Function0() { // from class: onFocusChanged
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean z19 = z2;
                        Function0 function110 = function4;
                        if (z19) {
                            function110.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0<Unit> function110 = function4;
            boolean z19 = z2;
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(-603985450, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(modifier2, num, str, str2, function0, function4, str5, function3, str3), composer2, 54), composer2, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            str6 = str5;
            function5 = function3;
            function6 = function110;
            z5 = z19;
        } else {
            if (i12 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i4 != 0) {
                str5 = null;
            } else {
                str5 = str4;
            }
            if (i6 != 0) {
                function3 = null;
            } else {
                function3 = function1;
            }
            if (i8 != 0) {
                z2 = false;
            } else {
                z2 = z;
            }
            if (i10 != 0) {
                composerStartRestartGroup.startReplaceGroup(200649007);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: ActionBarPolicy
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                function4 = (Function0) objRememberedValue2;
            } else {
                function4 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1947896447, i3, -1, "com.bpjstku.presentation.compose.common.ProcessResultDialog (ProcessResultDialog.kt:80)");
            }
            composerStartRestartGroup.startReplaceGroup(200650229);
            if ((234881024 & i3) == 67108864) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i3 & 1879048192) == 536870912) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(z3 | z4)) {
                objRememberedValue = new Function0() { // from class: onFocusChanged
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean z110 = z2;
                        Function0 function111 = function4;
                        if (z110) {
                            function111.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new Function0() { // from class: onFocusChanged
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean z110 = z2;
                        Function0 function111 = function4;
                        if (z110) {
                            function111.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0<Unit> function111 = function4;
            boolean z110 = z2;
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(-603985450, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(modifier2, num, str, str2, function0, function4, str5, function3, str3), composer2, 54), composer2, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            str6 = str5;
            function5 = function3;
            function6 = function111;
            z5 = z110;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getTransformation
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Integer num2 = num;
                    String str7 = str;
                    String str8 = str2;
                    String str9 = str3;
                    Function0 function112 = function0;
                    Modifier modifier4 = modifier3;
                    String str10 = str6;
                    Function0 function113 = function5;
                    boolean z111 = z5;
                    Function0 function114 = function6;
                    int i13 = i;
                    AllCapsTransformationMethod.TuitionPaymentFragmentbindingInflater1(num2, str7, str8, str9, function112, modifier4, str10, function113, z111, function114, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i13 | 1), i2);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
