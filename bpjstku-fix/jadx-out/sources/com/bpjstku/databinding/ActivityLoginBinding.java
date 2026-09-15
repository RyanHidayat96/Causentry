package com.bpjstku.databinding;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityLoginBinding implements ViewBinding {
    public final MaterialButton btnBsu;
    public final MaterialButton btnLogin;
    public final MaterialButton btnRegister;
    public final ConstraintLayout constraintLayout;
    public final TextInputEditText edtEmail;
    public final TextInputEditText edtPassword;
    public final Guideline guidelineEnd;
    public final Guideline guidelineLogoTop;
    public final Guideline guidelineStart;
    public final ImageView imgLogo;
    public final LayoutBottomSheetRegisterParticipantBinding layoutBottomSheetRegisterParticipant;
    private final CoordinatorLayout rootView;
    public final TextInputLayout tilEmail;
    public final TextInputLayout tilPassword;
    public final MaterialButton tvForgotAccount;
    public final MaterialButton tvForgotPassword;
    public final TextView tvLogin;
    public final TextView tvLoginInstruction;
    private static final byte[] $$c = {91, -17, 90, 37};
    private static final int $$f = 54;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {17, 104, 102, -28};
    private static final int $$e = 58;
    private static final byte[] $$a = {14, 70, 6, -35, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1, -1, -21, 15, 0};
    private static final int $$b = 214;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -83722433;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {59704, 59744, 59750, 59747, 59758, 59756, 59749, 59750, 59698, 59744, 59744, 59768, 59775, 59744, 59753, 59752, 59750, 59770, 59756, 59756, 59718, 59738, 59744, 59751, 59751, 59746, 59771, 59770, 59716, 59717, 59771, 59729, 59808, 59816, 59823, 59818, 59821, 59810, 59835, 59676, 59739, 59745, 59757, 59744, 59744, 59749, 59739, 59715, 59759, 59752, 59744, 59749, 59738, 59817, 59823, 59823, 59796, 59698, 59744, 59745, 59744, 59744, 59750, 59771, 59768, 59746, 59745, 59768, 59739, 59738, 59768, 59749, 59749, 59815, 59815, 59776, 59420, 59397, 59398, 59420, 59398, 59396, 59423, 59417, 59417, 59404, 59394, 59418, 59398, 59392, 59393, 59395, 59393, 59398, 59422, 59698, 59768, 59768, 59746, 59753, 59759, 59725, 59783, 59741, 59808, 59818, 59793, 59799, 59817, 59819, 59817, 59821, 59722, 59794, 59827, 59851, 59829, 59831, 59836, 59835, 59813, 59838, 59828, 59768, 59887, 59879, 59890, 59901, 59873, 59872, 59899, 59897, 59900, 59903, 59902, 59896, 59877, 59766, 59407, 59397, 59397, 59872, 59874, 59392, 59393, 59400, 59880, 59872, 59405, 59401, 59400, 59887, 59872, 59398, 59705, 59751, 59768, 59773, 59773, 59738, 59717, 59761, 59421, 59440, 59440, 59443, 59450, 59429, 59416, 59398, 59425, 59451, 59711, 59776, 59835, 59835, 59814, 59821, 59816, 59779, 59782, 59820, 59796, 59822, 59711, 59744, 59717, 59737, 59750, 59746, 59746, 59746, 59771, 59739, 59715, 59724, 59776, 59790, 59777, 59770, 59738, 59814, 59815, 59821, 59814, 59809, 59822, 59811, 59815, 59814, 59811, 59711, 59744, 59744, 59749, 59738, 59739, 59775, 59751, 59715, 59739, 59775, 59745, 59754, 59753, 59752, 59746, 59749, 59749, 59751, 59870, 59870, 59871, 59869, 59862, 59856, 59688, 59746, 59780, 59780, 59746, 59746, 59778, 59779, 59777, 59785, 59762, 59760, 59767, 59766, 59790, 59783, 59777, 59784, 59791, 59776, 59788, 59788, 59783, 59676, 59684, 59717, 59744, 59758, 59745, 59676, 59738, 59773, 59773, 59768, 59751, 59746, 59717, 59715, 59758, 59744, 59717, 59685, 59714, 59749, 59773, 59738, 59698, 59773, 59773, 59738, 59684, 59717, 59744, 59758, 59750, 59736, 59714, 59744, 59738, 59717, 59746, 59751, 59686, 59726, 59685, 59704, 59712, 59727, 59724, 59810, 59842, 59867, 59866, 59812, 59709, 59776, 59808, 59812, 59813, 59813, 59835, 59801, 59439, 59408, 59416, 59410, 59409, 59891, 59903, 59396, 59411, 59894};

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 4
            int r7 = r7 * 2
            int r0 = r7 + 1
            int r6 = 98 - r6
            byte[] r1 = com.bpjstku.databinding.ActivityLoginBinding.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L20:
            int r3 = r3 + 1
            int r5 = r5 + 1
            r4 = r1[r5]
        L26:
            int r6 = r6 + r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.databinding.ActivityLoginBinding.a(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 4
            byte[] r0 = com.bpjstku.databinding.ActivityLoginBinding.$$a
            int r8 = r8 * 11
            int r8 = r8 + 5
            int r7 = r7 * 9
            int r7 = 115 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2c:
            int r7 = r7 + r9
            int r7 = r7 + 2
            r9 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.databinding.ActivityLoginBinding.e(short, short, short, java.lang.Object[]):void");
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
        b = i2 % 128;
        int i3 = i2 % 2;
        CoordinatorLayout root = getRoot();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
        b = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ActivityLoginBinding(CoordinatorLayout coordinatorLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, ConstraintLayout constraintLayout, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, Guideline guideline, Guideline guideline2, Guideline guideline3, ImageView imageView, LayoutBottomSheetRegisterParticipantBinding layoutBottomSheetRegisterParticipantBinding, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, MaterialButton materialButton4, MaterialButton materialButton5, TextView textView, TextView textView2) {
        this.rootView = coordinatorLayout;
        this.btnBsu = materialButton;
        this.btnLogin = materialButton2;
        this.btnRegister = materialButton3;
        this.constraintLayout = constraintLayout;
        this.edtEmail = textInputEditText;
        this.edtPassword = textInputEditText2;
        this.guidelineEnd = guideline;
        this.guidelineLogoTop = guideline2;
        this.guidelineStart = guideline3;
        this.imgLogo = imageView;
        this.layoutBottomSheetRegisterParticipant = layoutBottomSheetRegisterParticipantBinding;
        this.tilEmail = textInputLayout;
        this.tilPassword = textInputLayout2;
        this.tvForgotAccount = materialButton4;
        this.tvForgotPassword = materialButton5;
        this.tvLogin = textView;
        this.tvLoginInstruction = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final CoordinatorLayout getRoot() {
        int i = 2 % 2;
        int i2 = b + 27;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        CoordinatorLayout coordinatorLayout = this.rootView;
        int i5 = i3 + 93;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 23 / 0;
        }
        return coordinatorLayout;
    }

    public static ActivityLoginBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = b + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityLoginBinding activityLoginBindingInflate = inflate(layoutInflater, null, false);
        int i4 = b + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return activityLoginBindingInflate;
    }

    public static ActivityLoginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = b + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.activity_login, viewGroup, false);
        if (z) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                viewGroup.addView(viewInflate);
                int i5 = 34 / 0;
            } else {
                viewGroup.addView(viewInflate);
            }
            int i6 = b + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
        }
        return bind(viewInflate);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x016d  */
    /* JADX WARN: Code duplicated, block: B:33:0x016e  */
    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            int i6 = $10 + 79;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i8 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.myPid() >> 22), 3290 - TextUtils.lastIndexOf("", '0', 0), 'O' - AndroidCharacter.getMirror('0'), 1199271174, false, $$g((byte) 21, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.green(0) + 651, 44 - (ViewConfiguration.getTapTimeout() >> 16), -450685997, false, $$g((byte) ($$f & 93), b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            int i9 = $11 + 91;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i11 = $10 + 67;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b4 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.alpha(0), 650 - Process.getGidForName(""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 43, -450685997, false, $$g((byte) ($$f & 93), b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i4 = 29209604;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void d(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i;
        byte b2;
        char[] cArr;
        char c;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = new Object[i5];
                    objArr2[i3] = Integer.valueOf(cArr2[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char threadPriority = (char) ((Process.getThreadPriority(i3) + 20) >> 6);
                        int iIndexOf = TextUtils.indexOf("", "", i3) + 1270;
                        int i10 = (CdmaCellLocation.convertQuartSecToDecDegrees(i3) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i3) == 0.0d ? 0 : -1)) + 18;
                        byte b3 = (byte) i5;
                        byte b4 = (byte) (b3 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, iIndexOf, i10, 407021364, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i9++;
                    i3 = 0;
                    i5 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i6];
        System.arraycopy(cArr2, i4, cArr4, 0, i6);
        if (bArr != null) {
            int i11 = $10 + 7;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                cArr = new char[i6];
                b2 = 1;
                setvideostabilizationmode.b = 1;
                c = 1;
            } else {
                b2 = 1;
                cArr = new char[i6];
                setvideostabilizationmode.b = 0;
                c = 0;
            }
            while (setvideostabilizationmode.b < i6) {
                if (bArr[setvideostabilizationmode.b] == b2) {
                    int i12 = setvideostabilizationmode.b;
                    char c2 = cArr4[setvideostabilizationmode.b];
                    Object[] objArr3 = new Object[2];
                    objArr3[b2] = Integer.valueOf(c);
                    objArr3[0] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 3226, AndroidCharacter.getMirror('0') - '#', 2133916302, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char absoluteGravity = (char) (29944 - Gravity.getAbsoluteGravity(0, 0));
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1755;
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23;
                        byte b7 = (byte) ($$f & 11);
                        byte b8 = (byte) (b7 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(absoluteGravity, offsetBefore, keyRepeatDelay, 387247676, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    int i14 = $10 + 69;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                }
                c = cArr[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b9 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-16735975) - Color.rgb(0, 0, 0)), (ViewConfiguration.getScrollBarSize() >> 8) + 1705, 21 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1434471773, false, $$g((byte) ($$f & 15), b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                b2 = 1;
            }
            cArr4 = cArr;
        }
        if (i8 > 0) {
            int i16 = $10 + 41;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            char[] cArr5 = new char[i6];
            i = 0;
            System.arraycopy(cArr4, 0, cArr5, 0, i6);
            int i18 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr4, i18, i8);
            System.arraycopy(cArr5, i8, cArr4, 0, i18);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i6];
            loop2: while (true) {
                setvideostabilizationmode.b = i;
                while (true) {
                    if (setvideostabilizationmode.b >= i6) {
                        break loop2;
                    }
                    int i19 = $11 + 113;
                    $10 = i19 % 128;
                    if (i19 % 2 != 0) {
                        cArr6[setvideostabilizationmode.b] = cArr4[i6 >> setvideostabilizationmode.b];
                        setvideostabilizationmode.b = setvideostabilizationmode.b;
                    } else {
                        cArr6[setvideostabilizationmode.b] = cArr4[(i6 - setvideostabilizationmode.b) - 1];
                        i = setvideostabilizationmode.b + 1;
                    }
                }
            }
            cArr4 = cArr6;
        }
        if (i7 > 0) {
            int i20 = 0;
            loop4: while (true) {
                setvideostabilizationmode.b = i20;
                while (true) {
                    if (setvideostabilizationmode.b >= i6) {
                        break loop4;
                    }
                    int i21 = $10 + 19;
                    $11 = i21 % 128;
                    if (i21 % 2 == 0) {
                        cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] + iArr[3]);
                        setvideostabilizationmode.b = setvideostabilizationmode.b;
                    }
                }
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                i20 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x0071  */
    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:45:0x0107  */
    /* JADX WARN: Code duplicated, block: B:47:0x011a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0124 A[PHI: r4
  0x0124: PHI (r4v1 int) = (r4v0 int), (r4v3 int) binds: [B:36:0x00d3, B:40:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0126  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028 A[PHI: r2
  0x0028: PHI (r2v6 com.google.android.material.button.MaterialButton) = (r2v5 com.google.android.material.button.MaterialButton), (r2v32 com.google.android.material.button.MaterialButton) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    public static ActivityLoginBinding bind(View view) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        MaterialButton materialButton3;
        MaterialButton materialButton4;
        ConstraintLayout constraintLayout;
        TextInputEditText textInputEditText;
        TextInputEditText textInputEditText2;
        Guideline guideline;
        Guideline guideline2;
        Guideline guideline3;
        ImageView imageView;
        View viewFindChildViewById;
        LayoutBottomSheetRegisterParticipantBinding layoutBottomSheetRegisterParticipantBindingBind;
        TextInputLayout textInputLayout;
        TextInputLayout textInputLayout2;
        int i;
        Object obj;
        int i2;
        MaterialButton materialButton5;
        int i3;
        MaterialButton materialButton6;
        TextView textView;
        TextView textView2;
        int i4 = 2 % 2;
        int i5 = b + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = R.id.btnBsu;
        if (i6 == 0) {
            materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnBsu);
            int i8 = 47 / 0;
            if (materialButton != null) {
                materialButton2 = materialButton;
                i7 = R.id.btnLogin;
                materialButton3 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnLogin);
                if (materialButton3 != null) {
                    i7 = R.id.btnRegister;
                    materialButton4 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnRegister);
                    if (materialButton4 != null) {
                        i7 = R.id.constraintLayout;
                        constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.constraintLayout);
                        if (constraintLayout != null) {
                            i7 = R.id.edtEmail;
                            textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtEmail);
                            if (textInputEditText != null) {
                                i7 = R.id.edtPassword;
                                textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtPassword);
                                if (textInputEditText2 != null) {
                                    i7 = R.id.guidelineEnd;
                                    guideline = (Guideline) ViewBindings.findChildViewById(view, R.id.guidelineEnd);
                                    if (guideline != null) {
                                        i7 = R.id.guidelineLogoTop;
                                        guideline2 = (Guideline) ViewBindings.findChildViewById(view, R.id.guidelineLogoTop);
                                        if (guideline2 != null) {
                                            i7 = R.id.guidelineStart;
                                            guideline3 = (Guideline) ViewBindings.findChildViewById(view, R.id.guidelineStart);
                                            if (guideline3 != null) {
                                                i7 = R.id.imgLogo;
                                                imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgLogo);
                                                if (imageView != null) {
                                                    i7 = R.id.layoutBottomSheetRegisterParticipant;
                                                    viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layoutBottomSheetRegisterParticipant);
                                                    if (viewFindChildViewById != null) {
                                                        layoutBottomSheetRegisterParticipantBindingBind = LayoutBottomSheetRegisterParticipantBinding.bind(viewFindChildViewById);
                                                        i7 = R.id.tilEmail;
                                                        textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEmail);
                                                        if (textInputLayout != null) {
                                                            i7 = R.id.tilPassword;
                                                            textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPassword);
                                                            if (textInputLayout2 != null) {
                                                                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
                                                                b = i9 % 128;
                                                                i = i9 % 2;
                                                                obj = null;
                                                                i2 = R.id.tvForgotAccount;
                                                                if (i == 0) {
                                                                    throw null;
                                                                }
                                                                materialButton5 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.tvForgotAccount);
                                                                if (materialButton5 != null) {
                                                                    int i10 = b + 125;
                                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                                                                    i3 = i10 % 2;
                                                                    i2 = R.id.tvForgotPassword;
                                                                    if (i3 != 0) {
                                                                        obj.hashCode();
                                                                        throw null;
                                                                    }
                                                                    materialButton6 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.tvForgotPassword);
                                                                    if (materialButton6 != null) {
                                                                        i7 = R.id.tvLogin;
                                                                        textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvLogin);
                                                                        if (textView != null) {
                                                                            i7 = R.id.tvLoginInstruction;
                                                                            textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLoginInstruction);
                                                                            if (textView2 != null) {
                                                                                ActivityLoginBinding activityLoginBinding = new ActivityLoginBinding((CoordinatorLayout) view, materialButton2, materialButton3, materialButton4, constraintLayout, textInputEditText, textInputEditText2, guideline, guideline2, guideline3, imageView, layoutBottomSheetRegisterParticipantBindingBind, textInputLayout, textInputLayout2, materialButton5, materialButton6, textView, textView2);
                                                                                int i11 = b + 73;
                                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                                                                                int i12 = i11 % 2;
                                                                                return activityLoginBinding;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i7 = i2;
                                                                    }
                                                                } else {
                                                                    i7 = i2;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnBsu);
            if (materialButton != null) {
                materialButton2 = materialButton;
                i7 = R.id.btnLogin;
                materialButton3 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnLogin);
                if (materialButton3 != null) {
                    i7 = R.id.btnRegister;
                    materialButton4 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnRegister);
                    if (materialButton4 != null) {
                        i7 = R.id.constraintLayout;
                        constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.constraintLayout);
                        if (constraintLayout != null) {
                            i7 = R.id.edtEmail;
                            textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtEmail);
                            if (textInputEditText != null) {
                                i7 = R.id.edtPassword;
                                textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtPassword);
                                if (textInputEditText2 != null) {
                                    i7 = R.id.guidelineEnd;
                                    guideline = (Guideline) ViewBindings.findChildViewById(view, R.id.guidelineEnd);
                                    if (guideline != null) {
                                        i7 = R.id.guidelineLogoTop;
                                        guideline2 = (Guideline) ViewBindings.findChildViewById(view, R.id.guidelineLogoTop);
                                        if (guideline2 != null) {
                                            i7 = R.id.guidelineStart;
                                            guideline3 = (Guideline) ViewBindings.findChildViewById(view, R.id.guidelineStart);
                                            if (guideline3 != null) {
                                                i7 = R.id.imgLogo;
                                                imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgLogo);
                                                if (imageView != null) {
                                                    i7 = R.id.layoutBottomSheetRegisterParticipant;
                                                    viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layoutBottomSheetRegisterParticipant);
                                                    if (viewFindChildViewById != null) {
                                                        layoutBottomSheetRegisterParticipantBindingBind = LayoutBottomSheetRegisterParticipantBinding.bind(viewFindChildViewById);
                                                        i7 = R.id.tilEmail;
                                                        textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEmail);
                                                        if (textInputLayout != null) {
                                                            i7 = R.id.tilPassword;
                                                            textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPassword);
                                                            if (textInputLayout2 != null) {
                                                                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
                                                                b = i13 % 128;
                                                                i = i13 % 2;
                                                                obj = null;
                                                                i2 = R.id.tvForgotAccount;
                                                                if (i == 0) {
                                                                    throw null;
                                                                }
                                                                materialButton5 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.tvForgotAccount);
                                                                if (materialButton5 != null) {
                                                                    int i14 = b + 125;
                                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
                                                                    i3 = i14 % 2;
                                                                    i2 = R.id.tvForgotPassword;
                                                                    if (i3 != 0) {
                                                                        obj.hashCode();
                                                                        throw null;
                                                                    }
                                                                    materialButton6 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.tvForgotPassword);
                                                                    if (materialButton6 != null) {
                                                                        i7 = R.id.tvLogin;
                                                                        textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvLogin);
                                                                        if (textView != null) {
                                                                            i7 = R.id.tvLoginInstruction;
                                                                            textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLoginInstruction);
                                                                            if (textView2 != null) {
                                                                                ActivityLoginBinding activityLoginBinding2 = new ActivityLoginBinding((CoordinatorLayout) view, materialButton2, materialButton3, materialButton4, constraintLayout, textInputEditText, textInputEditText2, guideline, guideline2, guideline3, imageView, layoutBottomSheetRegisterParticipantBindingBind, textInputLayout, textInputLayout2, materialButton5, materialButton6, textView, textView2);
                                                                                int i15 = b + 73;
                                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                                                                                int i16 = i15 % 2;
                                                                                return activityLoginBinding2;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i7 = i2;
                                                                    }
                                                                } else {
                                                                    i7 = i2;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(int r65, java.lang.Object r66, int r67) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 17088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.databinding.ActivityLoginBinding.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(int, java.lang.Object, int):java.lang.Object[]");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, byte r7, int r8) {
        /*
            int r6 = r6 + 99
            int r8 = r8 * 3
            int r0 = r8 + 1
            byte[] r1 = com.bpjstku.databinding.ActivityLoginBinding.$$c
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            int r6 = r6 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.databinding.ActivityLoginBinding.$$g(short, byte, int):java.lang.String");
    }
}
