package com.bpjstku.presentation.streaming;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityTermsAndAgreementRctiPlusBinding;
import com.bpjstku.databinding.ActivityVideoListBinding;
import com.bpjstku.presentation.streaming.TermsAndAgreementRctiPlusActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.EncoderImplByteBufferInput;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.calculateCameraUseCases;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.createExtraPreview;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import defpackage.runQueryOnBackgroundThread;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004R\u0014\u0010\r\u001a\u00020\f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/bpjstku/presentation/streaming/TermsAndAgreementRctiPlusActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityTermsAndAgreementRctiPlusBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "onBackPressed", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TermsAndAgreementRctiPlusActivity extends BindingBaseActivity<ActivityTermsAndAgreementRctiPlusBinding> {
    private static char TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int asInterface;
    private static char b;
    private static final byte[] $$c = {29, -5, -24, -13};
    private static final int $$f = 199;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {58, 66, -1, 15, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 134;
    private static int g = 0;
    private static int asBinder = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f633a = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i2);
        int i9 = ~i2;
        int i10 = ~((~i4) | i9);
        int i11 = ~(i9 | i5);
        int i12 = i10 | i11;
        int i13 = (~(i4 | i7)) | i11 | i8;
        int i14 = i2 + i5 + i6 + ((-168536539) * i) + (1787681333 * i3);
        int i15 = i14 * i14;
        int i16 = ((-1349843359) * i2) + 1460535296 + ((-923239215) * i5) + ((-1716058528) * i8) + (i12 * (-1289454384)) + ((-1289454384) * i13) + (366215168 * i6) + (1604583424 * i) + (216268800 * i3) + (1778253824 * i15);
        int i17 = (i2 * (-925914073)) + 175428941 + (i5 * (-925912777)) + (i8 * (-864)) + (i12 * 432) + (i13 * 432) + (i6 * (-925913209)) + (i * 1252505731) + (i3 * 30625011) + (i15 * (-2030960640));
        return i16 + ((i17 * i17) * 899809280) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.presentation.streaming.TermsAndAgreementRctiPlusActivity.$$a
            int r1 = r6 + 1
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2a
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.streaming.TermsAndAgreementRctiPlusActivity.c(int, int, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.streaming.TermsAndAgreementRctiPlusActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/streaming/TermsAndAgreementRctiPlusActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, TermsAndAgreementRctiPlusActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        f633a = i2 % 128;
        int i3 = i2 % 2;
        TermsAndAgreementRctiPlusActivity$bindingInflater$1 termsAndAgreementRctiPlusActivity$bindingInflater$1 = TermsAndAgreementRctiPlusActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
        return termsAndAgreementRctiPlusActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        Button button = ((ActivityTermsAndAgreementRctiPlusBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnCloseRctiPlus;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: CameraAccessExceptionCompatAccessError
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TermsAndAgreementRctiPlusActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        int i2 = asBinder + 93;
        f633a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = f633a + 107;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        d_();
        int i4 = f633a + 97;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int fadingEdgeLength = 1031 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            int iAlpha = Color.alpha(0) + 15;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) 52, bArr[2], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, fadingEdgeLength, iAlpha, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{63013, 17580, 16429, 5192, 63844, 12925, 60288, 43508, 28028, 58620, 21755, 62577, 17220, 42568, 16297, 55368, 46640, 43320, 46425, 58267, 31307, 8535, 47358, 36944}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{6690, 59943, 64276, 49524, 55923, 22113, 51899, 19858, 52545, 54971, 5784, 7889, 43850, 62554, 38733, 40873, 39730, 43891}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int i3 = 1032 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 16;
            byte b2 = (byte) 52;
            Object[] objArr5 = new Object[1];
            c(b2, (short) (b2 - 1), $$a[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, i3, packedPositionChild, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                int packedPositionGroup = 1031 - ExpandableListView.getPackedPositionGroup(0L);
                int scrollBarSize = 15 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte[] bArr2 = $$a;
                byte b3 = bArr2[7];
                Object[] objArr6 = new Object[1];
                c(b3, (short) (b3 | 103), bArr2[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, packedPositionGroup, scrollBarSize, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[3])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~((-1015287120) | iIdentityHashCode);
            int i7 = ~iIdentityHashCode;
            int i8 = (((146415249 + ((i6 | (~((-771006950) | i7))) * (-1808))) + (((~((-268438539) | iIdentityHashCode)) | (~(i7 | (-24158369)))) * TypedValues.Custom.TYPE_BOOLEAN)) + ((((~(iIdentityHashCode | 771006949)) | 746848581) | (~(1015287119 | i7))) * TypedValues.Custom.TYPE_BOOLEAN)) - 212217831;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{46794, 23803, 544, 23015, 33162, 55150, 5516, 38336, 63873, 20271, 16218, 24853, 41258, 21123, 2105, 34157, 12741, 26153}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{10716, 34591, 53960, 10129, 7895, 59925, 45161, 58376, 26614, 31316, 61500, 56615, 21460, 42558, 17199, 34148, 1328, 26254}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_title_text).substring(0, 16).codePointAt(15) - 81, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1524419319};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 46038), 1134 - KeyEvent.normalizeMetaState(0), Color.green(0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -212217831, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1031;
                    int iIndexOf = 14 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    byte[] bArr3 = $$a;
                    Object[] objArr12 = new Object[1];
                    c((byte) 52, bArr3[2], bArr3[7], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, absoluteGravity, iIndexOf, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 45993), 1117 - (ViewConfiguration.getTapTimeout() >> 16), 17 - View.MeasureSpec.makeMeasureSpec(0, 0)), Boolean.TYPE});
                }
                Object[] objArr13 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cBlue = (char) Color.blue(0);
                    int i11 = 1031 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int i12 = 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    byte[] bArr4 = $$a;
                    byte b4 = bArr4[7];
                    Object[] objArr14 = new Object[1];
                    c(b4, (short) (b4 | 103), bArr4[5], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cBlue, i11, i12, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{63013, 17580, 16429, 5192, 63844, 12925, 60288, 43508, 28028, 58620, 21755, 62577, 17220, 42568, 16297, 55368, 46640, 43320, 46425, 58267, 31307, 8535, 47358, 36944}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{6690, 59943, 64276, 49524, 55923, 22113, 51899, 19858, 52545, 54971, 5784, 7889, 43850, 62554, 38733, 40873, 39730, 43891}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_bersama4_permata).substring(16, 17).length() + 14, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                        int iResolveSize = 1031 - View.resolveSize(0, 0);
                        int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        byte b5 = (byte) 52;
                        Object[] objArr17 = new Object[1];
                        c(b5, (short) (b5 - 1), $$a[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(offsetAfter, iResolveSize, scrollBarFadeDuration, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1031;
                        int trimmedLength = 15 - TextUtils.getTrimmedLength("");
                        byte[] bArr5 = $$a;
                        Object[] objArr18 = new Object[1];
                        c((byte) 52, bArr5[2], bArr5[7], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(jumpTapTimeout, packedPositionType, trimmedLength, 1357589585, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr13;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 != i13) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                while (i2 < strArr2.length) {
                    int i15 = asBinder + 119;
                    f633a = i15 % 128;
                    int i16 = i15 % 2;
                    arrayList.add(strArr2[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }
        Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[3])[0];
        int i19 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i20 = ~elapsedCpuTime;
        int i21 = i17 + (((((~((-211632093) | i20)) | (~((-32648078) | elapsedCpuTime))) | (~(i20 | 32648077))) * 959) - 226734668) + (((~(elapsedCpuTime | 32648077)) | (~(i20 | (-32648078))) | (~((-211632093) | elapsedCpuTime))) * 959);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr19[2])[0] = i23 ^ (i23 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char fadingEdgeLength2 = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 29944);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1756;
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 23;
            byte b6 = (byte) 37;
            Object[] objArr20 = new Object[1];
            c(b6, (short) (b6 | 66), $$a[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(fadingEdgeLength2, iLastIndexOf, longPressTimeout, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i24 = f633a + 41;
            asBinder = i24 % 128;
            int i25 = i24 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0));
                int iResolveOpacity = 1755 - Drawable.resolveOpacity(0, 0);
                int iKeyCodeFromString = 23 - KeyEvent.keyCodeFromString("");
                byte b7 = (byte) 52;
                Object[] objArr21 = new Object[1];
                c(b7, (short) (b7 - 1), $$a[7], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cLastIndexOf, iResolveOpacity, iKeyCodeFromString, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i26 = ((int[]) objArr22[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{i26}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cimb_instruction_step3).substring(0, 1).codePointAt(0) - 305514975;
            int i27 = ~iCodePointAt;
            int i28 = ~((-20071539) | i27);
            int i29 = ~((-192530888) | iCodePointAt);
            int i30 = ((((-1774707662) + ((i28 | i29) * 1150)) + (((~(192530887 | i27)) | i29) * (-575))) + (((~(iCodePointAt | (-20071539))) | (~(i27 | 20071538))) * 575)) - 21054232;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i32 ^ (i32 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{46794, 23803, 544, 23015, 33162, 55150, 5516, 38336, 63873, 20271, 16218, 24853, 41258, 21123, 2105, 34157, 12741, 26153}, 15 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{10716, 34591, 53960, 10129, 7895, 59925, 45161, 58376, 26614, 31316, 61500, 56615, 21460, 42558, 17199, 34148, 1328, 26254}, ExpandableListView.getPackedPositionGroup(0L) + 16, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-1524419319};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (Color.red(0) + 42049), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1726, 28 - ExpandableListView.getPackedPositionChild(0L), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = EncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -21054232, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29945);
                int trimmedLength2 = 1755 - TextUtils.getTrimmedLength("");
                int packedPositionChild2 = 22 - ExpandableListView.getPackedPositionChild(0L);
                byte b8 = (byte) 52;
                Object[] objArr26 = new Object[1];
                c(b8, (short) (b8 - 1), $$a[7], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c2, trimmedLength2, packedPositionChild2, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{63013, 17580, 16429, 5192, 63844, 12925, 60288, 43508, 28028, 58620, 21755, 62577, 17220, 42568, 16297, 55368, 46640, 43320, 46425, 58267, 31307, 8535, 47358, 36944}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{6690, 59943, 64276, 49524, 55923, 22113, 51899, 19858, 52545, 54971, 5784, 7889, 43850, 62554, 38733, 40873, 39730, 43891}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c3 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29944);
                    int iResolveSize2 = View.resolveSize(0, 0) + 1755;
                    int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 23;
                    Object[] objArr29 = new Object[1];
                    c((byte) 52, (short) 140, $$a[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c3, iResolveSize2, offsetAfter2, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29944);
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1755;
                    int longPressTimeout2 = 23 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    byte b9 = (byte) 37;
                    Object[] objArr30 = new Object[1];
                    c(b9, (short) (b9 | 66), $$a[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(scrollDefaultDelay, edgeSlop, longPressTimeout2, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i33 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0];
        int i34 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        if (i34 != i33) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
            if (strArr4 != null) {
                int i35 = f633a + 123;
                asBinder = i35 % 128;
                int i36 = i35 % 2;
                while (i2 < strArr4.length) {
                    arrayList2.add(strArr4[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i34));
        }
        int i37 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
        int i38 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        Object[] objArr31 = {new int[]{i38}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
        int i39 = (int) Runtime.getRuntime().totalMemory();
        int i40 = i37 + ((((-1723070573) + (((-288100353) | (~i39)) * (-490))) + (((~(i39 | 781395407)) | (-1069495760)) * 490)) - 1727634212);
        int i41 = (i40 << 13) ^ i40;
        int i42 = i41 ^ (i41 >>> 17);
        ((int[]) objArr31[3])[0] = i42 ^ (i42 << 5);
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i4 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < cArr.length) {
                int i5 = $11 + 83;
                $10 = i5 % 128;
                int i6 = 58224;
                char c = 1;
                if (i5 % 2 != 0) {
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    i2 = 1;
                } else {
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    i2 = 0;
                }
                while (i2 < 16) {
                    char c2 = cArr3[c];
                    char c3 = cArr3[i4];
                    int i7 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)));
                    int i8 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        objArr2[2] = Integer.valueOf(i8);
                        objArr2[c] = Integer.valueOf(i7);
                        objArr2[i4] = Integer.valueOf(c2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cAxisFromString = (char) (47772 - MotionEvent.axisFromString(""));
                            int bitsPerPixel = 467 - ImageFormat.getBitsPerPixel(i4);
                            int trimmedLength = 13 - TextUtils.getTrimmedLength("");
                            Class[] clsArr = new Class[4];
                            clsArr[i4] = Integer.TYPE;
                            clsArr[c] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString, bitsPerPixel, trimmedLength, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[c] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(b)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.blue(0) + 47773), (ViewConfiguration.getLongPressTimeout() >> 16) + 468, TextUtils.getTrimmedLength("") + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i2++;
                        i4 = 0;
                        c = 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
                Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - MotionEvent.axisFromString("")), TextUtils.indexOf((CharSequence) "", '0', 0) + 2324, Process.getGidForName("") + 45, -1312321721, false, $$i(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } else {
                objArr[0] = new String(cArr2, 0, i);
                int i9 = $11 + 111;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x009b  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = f633a + 83;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            if (i3 != (((~((-557849121) | layoutDirection)) | (-1943764984)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 2024125664 + ((~((~layoutDirection) | (-557849121))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) {
                int[] iArr = new int[1233042269];
                iArr[1233042268] = 1;
                int i4 = (-1188150164) % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            }
        } else {
            int i5 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int i6 = ~((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 19545225) | (-1763569525));
            if (i5 != ((((-2143158270) | i6) * (-196)) - 1367163444) + ((i6 | 379588745) * 196)) {
                int[] iArr2 = new int[1233042269];
                iArr2[1233042268] = 1;
                int i7 = (-1188150164) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i8 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i9 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
        if (i8 != (-1120838829) + ((~((-151263257) | i9)) * (-783)) + (((~(i9 | 1887151812)) | (-691904153)) * 783)) {
            throw null;
        }
        super.onResume();
        int i10 = asBinder + 51;
        f633a = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b4, code lost:
    
        if (r0 != (((438568756 + (((~((~r2) | (-360512305))) | (-2076423636)) * (-235))) + (((~((-360512305) | r2)) | (-2076423636)) * (-470))) + (((~(r2 | (-289452305))) | (-2147483636)) * 235))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b6, code lost:
    
        super.onStart();
        r8 = com.bpjstku.presentation.streaming.TermsAndAgreementRctiPlusActivity.asBinder + 17;
        com.bpjstku.presentation.streaming.TermsAndAgreementRctiPlusActivity.f633a = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c2, code lost:
    
        if ((r8 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c4, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00cd, code lost:
    
        throw new java.lang.RuntimeException("1731578775");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d5, code lost:
    
        throw new java.lang.RuntimeException("-1392802517");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0044, code lost:
    
        if (r2 == (((501467944 + (((~(1532540488 | r4)) | 547359025) * 576)) + (((~((~r4) | 2079899513)) | 155193920) * 576)) + 1746185792)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0081, code lost:
    
        if (r2 == ((r6 + ((((~((-1037631462) | r4)) | 760257188) | (~((-1867619005) | r4))) * (-1228))) + (((~(r4 | (-1107361817))) | (~((-277374274) | r4))) * 614))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0083, code lost:
    
        r0 = ((java.lang.reflect.Field) defpackage.checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        r2 = android.os.Process.myPid();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(java.lang.Object[] r8) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.streaming.TermsAndAgreementRctiPlusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(java.lang.Object[]):java.lang.Object");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        f633a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int i4 = ~((int) Runtime.getRuntime().freeMemory());
            if (i3 != 315178524 + (((-479893) | i4) * 494) + (((~(i4 | (-1409808022))) | 1988668715) * 494)) {
                throw null;
            }
        } else {
            int i5 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 2076097209;
            int i7 = ~i6;
            int i8 = (~((-1014028977) | i7)) | 744509568;
            int i9 = ~(i6 | 2113535927);
            if (i5 != 1141952800 + ((i8 | i9) * (-713)) + (i9 * 1426) + ((~(1844016519 | i7)) * 713)) {
                throw null;
            }
        }
        int i10 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i11 = 1300291116 + ((~(startElapsedRealtime | 103463461)) * 216);
        int i12 = ~startElapsedRealtime;
        if (i10 != i11 + ((1853619949 | i12) * (-216)) + (((~(i12 | 103463461)) | (-1819374793)) * 216)) {
            int i13 = 966506302 % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i14 = asBinder + 53;
        f633a = i14 % 128;
        int i15 = i14 % 2;
    }

    public static /* synthetic */ Unit b(TermsAndAgreementRctiPlusActivity termsAndAgreementRctiPlusActivity, View view) {
        int i = 2 % 2;
        int i2 = f633a + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            termsAndAgreementRctiPlusActivity.d_();
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        termsAndAgreementRctiPlusActivity.d_();
        Unit unit2 = Unit.INSTANCE;
        int i4 = asBinder + 55;
        f633a = i4 % 128;
        if (i4 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    static {
        asInterface = 1;
        g();
        INSTANCE = new Companion(null);
        int i = g + 73;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityTermsAndAgreementRctiPlusBinding> TuitionPaymentFragmentbindingInflater1() {
        return (Function1) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, ActivityVideoListBinding.b(), 879719514, ActivityVideoListBinding.b(), runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -879719513, ActivityVideoListBinding.b());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        f633a = i2 % 128;
        if (i2 % 2 != 0) {
            return R.layout.activity_terms_and_agreement_rcti_plus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = f633a + 39;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        f633a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        f633a = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        f633a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -693957261, ActivityVideoListBinding.b(), runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 693957261, runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        f633a = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = asBinder + 91;
        f633a = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 41379;
        b = (char) 3540;
        TuitionPaymentFragmentbindingInflater1 = (char) 50576;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 25631;
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
    private static java.lang.String $$i(byte r5, int r6, int r7) {
        /*
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r0 = com.bpjstku.presentation.streaming.TermsAndAgreementRctiPlusActivity.$$c
            int r5 = r5 * 2
            int r5 = r5 + 108
            int r6 = r6 * 3
            int r6 = 1 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            int r7 = r7 + 1
            r4 = r0[r7]
        L28:
            int r4 = -r4
            int r5 = r5 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.streaming.TermsAndAgreementRctiPlusActivity.$$i(byte, int, int):java.lang.String");
    }
}
