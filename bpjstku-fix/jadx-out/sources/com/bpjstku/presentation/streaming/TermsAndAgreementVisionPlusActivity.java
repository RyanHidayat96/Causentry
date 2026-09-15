package com.bpjstku.presentation.streaming;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityLoginBinding;
import com.bpjstku.databinding.ActivityTermsAndAgreementVisionPlusBinding;
import com.bpjstku.databinding.ActivityVideoListBinding;
import com.bpjstku.presentation.streaming.TermsAndAgreementVisionPlusActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.mlkit.common.MlKitException;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.calculateCameraUseCases;
import defpackage.createExtraPreview;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\f8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/bpjstku/presentation/streaming/TermsAndAgreementVisionPlusActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityTermsAndAgreementVisionPlusBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "onBackPressed", "", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TermsAndAgreementVisionPlusActivity extends BindingBaseActivity<ActivityTermsAndAgreementVisionPlusBinding> {
    private static long TuitionPaymentFragmentbindingInflater1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int asInterface;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int b = R.layout.activity_terms_and_agreement_vision_plus;
    private static final byte[] $$c = {14, 70, 6, -35};
    private static final int $$f = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {83, -90, 68, -23, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f634a = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int g = 1;

    public static /* synthetic */ Object b(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i2);
        int i9 = ~(i3 | i2);
        int i10 = ~i3;
        int i11 = ~i2;
        int i12 = i8 | i9 | (~(i10 | i11 | i4));
        int i13 = i8 | (~(i7 | i3)) | i9;
        int i14 = (~(i2 | i4)) | (~(i10 | i2)) | (~(i7 | i11 | i3));
        int i15 = i4 + i3 + i5 + (1880080305 * i) + (458392769 * i6);
        int i16 = i15 * i15;
        int i17 = ((766573918 * i4) - Integer.MIN_VALUE) + (1582236324 * i3) + (i12 * (-407831203)) + (815662406 * i13) + ((-407831203) * i14) + (1174405120 * i5) + (1711276032 * i) + ((-973078528) * i6) + (68288512 * i16);
        int i18 = ((i4 * 319678698) - 2002258816) + (i3 * 319678284) + (i12 * 207) + (i13 * (-414)) + (i14 * 207) + (i5 * 319678491) + (i * (-161570901)) + (i6 * (-1160779685)) + (i16 * (-1109000192));
        return i17 + ((i18 * i18) * (-1432485888)) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : b(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r0 = com.bpjstku.presentation.streaming.TermsAndAgreementVisionPlusActivity.$$a
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r6
            r3 = r2
            r6 = r5
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L21:
            int r3 = r3 + 1
            r4 = r0[r7]
        L25:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            int r7 = r7 + 1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.streaming.TermsAndAgreementVisionPlusActivity.c(int, short, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.streaming.TermsAndAgreementVisionPlusActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/streaming/TermsAndAgreementVisionPlusActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, TermsAndAgreementVisionPlusActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        int i5 = this.b;
        int i6 = i3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityTermsAndAgreementVisionPlusBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TermsAndAgreementVisionPlusActivity$bindingInflater$1 termsAndAgreementVisionPlusActivity$bindingInflater$1 = TermsAndAgreementVisionPlusActivity$bindingInflater$1.b;
        int i4 = g + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return termsAndAgreementVisionPlusActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        Button button = ((ActivityTermsAndAgreementVisionPlusBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnClose;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: CameraCaptureSessionCompatCameraCaptureSessionCompatImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TermsAndAgreementVisionPlusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = g + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        d_();
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumFlingVelocity = (char) (29944 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
            int defaultSize = View.getDefaultSize(0, 0) + 1755;
            int i3 = 24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            byte b = $$a[7];
            Object[] objArr2 = new Object[1];
            c((byte) 37, b, b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, defaultSize, i3, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
            g = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) (29945 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int iResolveSize = 1755 - View.resolveSize(0, 0);
                int mirror = 'G' - AndroidCharacter.getMirror('0');
                byte b2 = $$a[7];
                Object[] objArr3 = new Object[1];
                c((byte) 52, b2, (short) (b2 | 37), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iResolveSize, mirror, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i6 = ((int[]) objArr4[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{i6}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i8 = ~i7;
            int i9 = (((1541093546 + (((~((-37178872) | i8)) | 175423554) * 519)) + (((~(i8 | (-200118))) | (~(175623671 | i7))) * (-519))) + (((~(i7 | 175423554)) | 37178871) * 519)) - 731464434;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.maintenance_back).substring(0, 3).length() - 3, 15 - ExpandableListView.getPackedPositionChild(0L), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 51648), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(16 - Color.green(0), 16 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_indosat_dompetku).substring(0, 16).codePointAt(6) + 58927), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-848295743};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - Color.blue(0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1726, 29 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = ActivityLoginBinding.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -731464434);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0, 0));
                    int tapTimeout = 1755 - (ViewConfiguration.getTapTimeout() >> 16);
                    int capsMode = 23 - TextUtils.getCapsMode("", 0, 0);
                    byte b3 = $$a[7];
                    Object[] objArr8 = new Object[1];
                    c((byte) 52, b3, (short) (b3 | 37), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, tapTimeout, capsMode, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_indosat_dompetku).substring(0, 16).length() + 16, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.checkout_error_empty_response).substring(19, 26).codePointAt(6) - 92, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_title).substring(18, 19).length() - 1), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 18, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step5).substring(3, 4).length() + 14, (char) ('0' - AndroidCharacter.getMirror('0')), objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c2 = (char) (29945 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int i12 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1755;
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 23;
                        byte b4 = $$a[7];
                        Object[] objArr11 = new Object[1];
                        c((byte) 52, b4, (short) (b4 | 89), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, i12, iKeyCodeFromString, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cResolveOpacity = (char) (29944 - Drawable.resolveOpacity(0, 0));
                        int i13 = 1756 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 23;
                        byte b5 = $$a[7];
                        Object[] objArr12 = new Object[1];
                        c((byte) 37, b5, b5, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveOpacity, i13, iResolveSizeAndState, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i15 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i15 != i14) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr != null) {
                while (i2 < strArr.length) {
                    int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
                    g = i16 % 128;
                    if (i16 % 2 == 0) {
                        arrayList.add(strArr[i2]);
                        i2 += 104;
                    } else {
                        arrayList.add(strArr[i2]);
                        i2++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i15));
        }
        int i17 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
        int i18 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        Object[] objArr13 = {new int[]{i18}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i19 = i17 + 937388421 + (((~((-90178635) | iIdentityHashCode)) | 302781060) * (-756)) + (((~iIdentityHashCode) | (-90178635)) * 756);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr13[3])[0] = i21 ^ (i21 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c3 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
            int i22 = 1032 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 15;
            byte b6 = $$a[7];
            Object[] objArr14 = new Object[1];
            c((byte) 52, b6, (short) (b6 | 141), objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, i22, iNormalizeMetaState, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 21, 21 - ExpandableListView.getPackedPositionChild(0L), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e((ViewConfiguration.getTouchSlop() >> 8) + 54, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
            int keyRepeatDelay = 1031 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int i23 = 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            byte b7 = $$a[7];
            Object[] objArr17 = new Object[1];
            c((byte) 52, b7, (short) (b7 | 37), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf, keyRepeatDelay, i23, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int mode = View.MeasureSpec.getMode(0) + 1031;
                int i24 = 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                byte[] bArr = $$a;
                byte b8 = bArr[7];
                byte b9 = bArr[28];
                Object[] objArr18 = new Object[1];
                c(b8, b9, (short) (b9 | 192), objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(scrollDefaultDelay, mode, i24, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i25 = ((int[]) objArr19[3])[0];
            int i26 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i27 = ~iIdentityHashCode2;
            int i28 = 487702949 + (((~((-546417095) | i27)) | 790697264) * (-328)) + ((iIdentityHashCode2 | 790697264) * 164) + (((~(iIdentityHashCode2 | 546417094)) | 253760560 | (~(i27 | (-9480391)))) * 164) + 1782141853;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr[2])[0] = i30 ^ (i30 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 17 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_now).substring(1, 3).codePointAt(1) + 51634), objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_user_canceled_liveness).substring(3, 4).length() + 15, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_message_invalid_token_no).substring(0, 16).codePointAt(2) - 81, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 59032), objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {-848295743};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 46039), 1134 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 18 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 1782141853, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                int i31 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14;
                byte b10 = $$a[7];
                Object[] objArr24 = new Object[1];
                c((byte) 52, b10, (short) (b10 | 141), objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cAxisFromString, iIndexOf, i31, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf("", "", 0, 0) + 45993), 1117 - TextUtils.getOffsetBefore("", 0), 16 - TextUtils.indexOf((CharSequence) "", '0')), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cAlpha = (char) Color.alpha(0);
                int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 1031;
                int mirror2 = AndroidCharacter.getMirror('0') - '!';
                byte[] bArr2 = $$a;
                byte b11 = bArr2[7];
                byte b12 = bArr2[28];
                Object[] objArr25 = new Object[1];
                c(b11, b12, (short) (b12 | 192), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cAlpha, tapTimeout2, mirror2, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 21, Color.alpha(0) + 22, (char) (TextUtils.lastIndexOf("", '0') + 1), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(54 - (ViewConfiguration.getKeyRepeatDelay() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.activity_bank_transfer_mandiri).substring(15, 17).length() + 13, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c4 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int maximumFlingVelocity2 = 1031 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int trimmedLength = 15 - TextUtils.getTrimmedLength("");
                    byte b13 = $$a[7];
                    Object[] objArr28 = new Object[1];
                    c((byte) 52, b13, (short) (b13 | 37), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c4, maximumFlingVelocity2, trimmedLength, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int i32 = 1030 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int iNormalizeMetaState2 = 15 - KeyEvent.normalizeMetaState(0);
                    byte b14 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c((byte) 52, b14, (short) (b14 | 141), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(longPressTimeout, i32, iNormalizeMetaState2, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i33 = ((int[]) objArr[1])[0];
        int i34 = ((int[]) objArr[3])[0];
        if (i34 != i33) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                while (i2 < strArr3.length) {
                    int i35 = g + 75;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i35 % 128;
                    if (i35 % 2 != 0) {
                        arrayList2.add(strArr3[i2]);
                        i2 += 44;
                    } else {
                        arrayList2.add(strArr3[i2]);
                        i2++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i34));
        }
        int i36 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        g = i36 % 128;
        int i37 = i36 % 2;
        Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i38 = ((int[]) objArr[2])[0];
        int i39 = ((int[]) objArr[3])[0];
        int i40 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 941762469;
        int i41 = ~iCodePointAt;
        int i42 = i38 + (-828271423) + (((~(72541115 | i41)) | 170656772) * 184) + ((iCodePointAt | 71458833) * (-184)) + ((~((-171739055) | i41)) * 184);
        int i43 = i42 ^ (i42 << 13);
        int i44 = i43 ^ (i43 >>> 17);
        ((int[]) objArr30[2])[0] = i44 ^ (i44 << 5);
    }

    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i5 = $10 + 9;
            $11 = i5 % 128;
            if (i5 % i3 == 0) {
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i / i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2187, ExpandableListView.getPackedPositionChild(0L) + 41, 841711447, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 33016), TextUtils.indexOf("", "") + 3011, TextUtils.indexOf((CharSequence) "", '0', 0) + 27, 321985076, false, $$i(b3, b4, (byte) (b4 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36504 - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3375, ((Process.getThreadPriority(0) + 20) >> 6) + 17, -968507904, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i + i7])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2187 - View.MeasureSpec.getSize(0), 40 - TextUtils.getTrimmedLength(""), 841711447, false, $$i(b7, b8, b8), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 33017), 3011 - Color.argb(0, 0, 0, 0), 26 - ExpandableListView.getPackedPositionType(0L), 321985076, false, $$i(b9, b10, (byte) (b10 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (36504 - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 3376, AndroidCharacter.getMirror('0') - 31, -968507904, false, $$i(b11, b12, (byte) (b12 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
            i3 = 2;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i8 = $11 + 43;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                byte b13 = (byte) 0;
                byte b14 = b13;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (MotionEvent.axisFromString("") + 36506), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3376, 17 - Color.green(0), -968507904, false, $$i(b13, b14, (byte) (b14 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00aa, code lost:
    
        if (r1 == (((((-1862256112) | r4) * (-196)) + 1897359960) + ((r4 | 3835297) * 196))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ac, code lost:
    
        r1 = com.bpjstku.presentation.streaming.TermsAndAgreementVisionPlusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        com.bpjstku.presentation.streaming.TermsAndAgreementVisionPlusActivity.g = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bd, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00bf, code lost:
    
        r0 = new int[120642497];
        r0[120642496(0x730dbc0, float:1.3305347E-34)] = 1;
        android.widget.Toast.makeText((android.content.Context) null, r0[-1], 0).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00cd, code lost:
    
        r1 = new int[120642497];
        r1[120642496(0x730dbc0, float:1.3305347E-34)] = 1;
        r2 = (-1412240448) % 2;
        android.widget.Toast.makeText((android.content.Context) null, r1[-1], 1).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00de, code lost:
    
        super.onResume();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e2, code lost:
    
        r1 = 2139684398 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00eb, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003e, code lost:
    
        if (r1 == ((((-1963758952) + (((~((-1736909739) | r5)) | 637927554) * 184)) + ((r4 | (-2005904380)) * (-184))) + ((~((-906922196) | r5)) * 184))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0067, code lost:
    
        if (r1 == (((((~(r4 | 45184240)) | (-875171784)) * 56) + 1052170976) + (((~((~r4) | (-875171784))) | 45184240) * 56))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0069, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r5 = (java.lang.Object[]) null;
        r4 = ~(((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().navigation | (-1858420815));
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.streaming.TermsAndAgreementVisionPlusActivity.onResume():void");
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1944632390
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.reflect.Member[] r1 = defpackage.calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            java.util.Random r4 = new java.util.Random
            r4.<init>()
            int r4 = r4.nextInt()
            int r5 = ~r4
            r6 = 1100907631(0x419e846f, float:19.814665)
            r5 = r5 | r6
            int r5 = ~r5
            r6 = 270625168(0x10216990, float:3.1832974E-29)
            r5 = r5 | r6
            int r5 = r5 * 446
            r6 = -22730376(0xfffffffffea52978, float:-1.0976897E38)
            int r6 = r6 + r5
            r5 = 1371532799(0x51bfedff, float:1.0304146E11)
            r4 = r4 | r5
            int r4 = ~r4
            r5 = 294920(0x48008, float:4.13271E-40)
            r4 = r4 | r5
            int r4 = r4 * 446
            int r6 = r6 + r4
            r4 = 439740640(0x1a35e8e0, float:3.7618038E-23)
            int r6 = r6 + r4
            if (r1 == r6) goto L69
            int r1 = com.bpjstku.presentation.streaming.TermsAndAgreementVisionPlusActivity.g
            r4 = 5
            int r1 = r1 + r4
            int r5 = r1 % 128
            com.bpjstku.presentation.streaming.TermsAndAgreementVisionPlusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r5
            int r1 = r1 % r0
            r1 = -1944632390(0xffffffff8c1743ba, float:-1.1652998E-31)
            int[] r1 = new int[r1]
            r5 = -1944632391(0xffffffff8c1743b9, float:-1.1652996E-31)
            r6 = 1
            r1[r5] = r6
            r5 = 557817706(0x213f9f6a, float:6.49243E-19)
            int r5 = r5 % r0
            r5 = -1
            r1 = r1[r5]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r6)
            r1.show()
            int r1 = com.bpjstku.presentation.streaming.TermsAndAgreementVisionPlusActivity.g
            int r1 = r1 + 57
            int r5 = r1 % 128
            com.bpjstku.presentation.streaming.TermsAndAgreementVisionPlusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r5
            int r1 = r1 % r0
            if (r1 == 0) goto L69
            int r4 = r4 % 3
        L69:
            java.lang.reflect.Member[] r0 = defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1
            r0 = r0[r2]
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            int r0 = r0.getInt(r3)
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)
            java.lang.String r4 = "currentApplication"
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r1 = r1.getMethod(r4, r2)
            r2 = r3
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.lang.Object r1 = r1.invoke(r3, r3)
            android.content.Context r1 = (android.content.Context) r1
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.getLayoutDirection()
            int r2 = ~r1
            r4 = 603983872(0x24001000, float:2.7769128E-17)
            r4 = r4 | r2
            int r4 = r4 * (-192)
            r5 = -458405284(0xffffffffe4ad4a5c, float:-2.557316E22)
            int r5 = r5 + r4
            r4 = -1525590992(0xffffffffa5115430, float:-1.2605269E-16)
            r4 = r4 | r2
            int r4 = ~r4
            r6 = 449481101(0x1aca898d, float:8.376747E-23)
            r4 = r4 | r6
            int r4 = r4 * (-384)
            int r5 = r5 + r4
            r4 = -449481102(0xffffffffe5357672, float:-5.355833E22)
            r4 = r4 | r1
            int r4 = ~r4
            r6 = -1076109891(0xffffffffbfdbddbd, float:-1.7177044)
            r2 = r2 | r6
            int r2 = ~r2
            r2 = r2 | r4
            r4 = 2129574863(0x7eeebbcf, float:1.5866571E38)
            r1 = r1 | r4
            int r1 = ~r1
            r1 = r1 | r2
            int r1 = r1 * 192
            int r5 = r5 + r1
            if (r0 != r5) goto Lc7
            super.onStart()
            return
        Lc7:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.streaming.TermsAndAgreementVisionPlusActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iMyTid = Process.myTid();
        int i5 = ~((-423740206) | iMyTid);
        int i6 = 2087292032 + ((134234628 | i5) * (-280)) + ((i5 | (~(1253727748 | iMyTid))) * 140);
        int i7 = ~((-289505578) | iMyTid);
        int i8 = ~iMyTid;
        if (i4 != i6 + (((~(i8 | 1543233325)) | i7 | (~((-134234629) | i8))) * 140)) {
            int i9 = g + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
            int i10 = i9 % 2;
            int[] iArr = new int[398158159];
            iArr[398158158] = 1;
            int i11 = 520125714 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i12 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i13 = ~((~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_general_network_error).substring(0, 37).length() - 1416170654)) | 1855476623);
        if (i12 != ((1150812674 | i13) * (-970)) + 1551622318 + ((i13 | 704663949) * 970)) {
            int i14 = (-769779738) % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        g = i15 % 128;
        int i16 = i15 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(TermsAndAgreementVisionPlusActivity termsAndAgreementVisionPlusActivity, View view) {
        int i = 2 % 2;
        int i2 = g + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        termsAndAgreementVisionPlusActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = g + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static {
        asInterface = 1;
        g();
        INSTANCE = new Companion(null);
        int i = f634a + 109;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = g + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = g + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        b(runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ActivityVideoListBinding.b(), -637887732, 637887733, new Object[]{this}, ActivityVideoListBinding.b(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_unsuccessful).substring(0, 1).codePointAt(0) - 488170410);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        b(runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ActivityVideoListBinding.b(), 511055758, -511055758, new Object[]{this}, runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 980989619);
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new char[]{31709, 41384, 53053, 62636, 4705, 16301, 25890, 33451, 43040, 54775, 62216, 6308, 17964, 25509, 35126, 46776, 22358, 36133, 58278, 55339, 16051, 4896, 18879, 44596, 33927, 63792, 57248, 13373, 27284, 20278, 42431, 39480, 45565, 27532, 1284, 16020, 55307, 62851, 44812, 18624, 25091, 8065, 14686, 53925, 35853, 43401, 17164, 31899, 5649, 13185, 60716, 34473, 40999, 23969, 45561, 27534, 1281, 16022, 55319, 62863, 44812, 18620, 25097, 8083, 14620, 53890, 35869, 43415, 17181};
        TuitionPaymentFragmentbindingInflater1 = -7771804565567411230L;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        TermsAndAgreementVisionPlusActivity termsAndAgreementVisionPlusActivity = (TermsAndAgreementVisionPlusActivity) objArr[0];
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 90 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r5, short r6, short r7) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 109
            int r5 = r5 * 4
            int r0 = 1 - r5
            int r6 = r6 * 3
            int r6 = 3 - r6
            byte[] r1 = com.bpjstku.presentation.streaming.TermsAndAgreementVisionPlusActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L19
            r4 = r7
            r3 = r2
            r7 = r5
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
        L2b:
            int r7 = r7 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.streaming.TermsAndAgreementVisionPlusActivity.$$i(int, short, short):java.lang.String");
    }
}
