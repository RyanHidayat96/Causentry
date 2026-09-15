package com.bpjstku.databinding;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.mukesh.OtpView;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import defpackage.setSurfaceOccupancyPriority;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityAsikVerifyOtpFromEmailBinding implements ViewBinding {
    public final MaterialButton btnChangeEmailAsik;
    public final MaterialButton btnVerificationOtpEmail;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final OtpView otpVerifyEmailAsik;
    private final ConstraintLayout rootView;
    public final TextView tvEmailAsik;
    public final TextView tvResendCode;
    public final TextView tvVerificationCode;
    public final TextView tvVerificationInstruction;
    private static final byte[] $$c = {41, 2, 45, -60};
    private static final int $$d = 215;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {12, -88, 33, 118};
    private static final int $$b = 86;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {-1802818817, -1696831775, 1453402818, 1988024850, -235535330, -962830386, 420766598, -771252226, 914170370, 635459498, -1941026688, 355234183, -1845227791, 409219594, -110833621, -1716589777, -1015797877, -211415842};

    private static void b(int i, short s, int i2, Object[] objArr) {
        int i3 = s + 4;
        byte[] bArr = $$a;
        int i4 = i * 3;
        int i5 = (i2 * 4) + 98;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i7 = -1;
            i5 = i3 + i6;
            i3 = i3;
        }
        while (true) {
            int i8 = i7 + 1;
            int i9 = i3 + 1;
            bArr2[i8] = (byte) i5;
            if (i8 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i7 = i8;
                i5 = bArr[i9] + i5;
                i3 = i9;
            }
        }
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ActivityAsikVerifyOtpFromEmailBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, LayoutToolbarCenterBinding layoutToolbarCenterBinding, OtpView otpView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.btnChangeEmailAsik = materialButton;
        this.btnVerificationOtpEmail = materialButton2;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.otpVerifyEmailAsik = otpView;
        this.tvEmailAsik = textView;
        this.tvResendCode = textView2;
        this.tvVerificationCode = textView3;
        this.tvVerificationInstruction = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.rootView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ActivityAsikVerifyOtpFromEmailBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 != 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f A[PHI: r4
  0x001f: PHI (r4v2 android.view.View) = (r4v1 android.view.View), (r4v5 android.view.View) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    public static ActivityAsikVerifyOtpFromEmailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            viewInflate = layoutInflater.inflate(R.layout.activity_asik_verify_otp_from_email, viewGroup, false);
            if (z) {
                viewGroup.addView(viewInflate);
                i = TuitionPaymentFragmentbindingInflater1 + 91;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
                if (i % 2 == 0) {
                    int i4 = 5 / 3;
                }
            }
        } else {
            viewInflate = layoutInflater.inflate(R.layout.activity_asik_verify_otp_from_email, viewGroup, false);
            if (z) {
                viewGroup.addView(viewInflate);
                i = TuitionPaymentFragmentbindingInflater1 + 91;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
                if (i % 2 == 0) {
                    int i5 = 5 / 3;
                }
            }
        }
        return bind(viewInflate);
    }

    public static ActivityAsikVerifyOtpFromEmailBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.btnChangeEmailAsik;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnChangeEmailAsik);
        if (materialButton != null) {
            i2 = R.id.btnVerificationOtpEmail;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnVerificationOtpEmail);
            if (materialButton2 != null) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
                TuitionPaymentFragmentbindingInflater1 = i3 % 128;
                int i4 = i3 % 2;
                i2 = R.id.layout_toolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                if (viewFindChildViewById != null) {
                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                    i2 = R.id.otpVerifyEmailAsik;
                    OtpView otpView = (OtpView) ViewBindings.findChildViewById(view, R.id.otpVerifyEmailAsik);
                    if (otpView != null) {
                        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
                        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                        int i6 = i5 % 2;
                        i2 = R.id.tvEmailAsik;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvEmailAsik);
                        if (textView != null) {
                            int i7 = TuitionPaymentFragmentbindingInflater1 + 63;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                            int i8 = i7 % 2;
                            i2 = R.id.tvResendCode;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvResendCode);
                            if (textView2 != null) {
                                i2 = R.id.tvVerificationCode;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvVerificationCode);
                                if (textView3 != null) {
                                    i2 = R.id.tvVerificationInstruction;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvVerificationInstruction);
                                    if (textView4 != null) {
                                        ActivityAsikVerifyOtpFromEmailBinding activityAsikVerifyOtpFromEmailBinding = new ActivityAsikVerifyOtpFromEmailBinding((ConstraintLayout) view, materialButton, materialButton2, layoutToolbarCenterBindingBind, otpView, textView, textView2, textView3, textView4);
                                        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
                                        TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                                        int i10 = i9 % 2;
                                        return activityAsikVerifyOtpFromEmailBinding;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $11 + 43;
            int i8 = i7 % 128;
            $10 = i8;
            if (i7 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            int i9 = i8 + 5;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 5 % 3;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr3[i2]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) i6;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 1), 3292 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Color.rgb(i6, i6, i6) + 16777247, 1948206109, false, $$e(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i2++;
                    i4 = -1870535734;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (iArr5 != null) {
            int i11 = $10 + 47;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                Object[] objArr3 = new Object[i5];
                objArr3[0] = Integer.valueOf(iArr5[i13]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + i5), 3291 - (Process.myPid() >> 22), 31 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1948206109, false, $$e(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                }
                iArr6[i13] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i13++;
                iArr5 = iArr5;
                i5 = 1;
            }
            iArr5 = iArr6;
        }
        char c = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[c] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i14 = 17;
            for (int i15 = 1; i14 > i15; i15 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i14];
                try {
                    Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int fadingEdgeLength = 2559 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int mode = 29 - View.MeasureSpec.getMode(0);
                        byte b5 = (byte) ($$d & 1);
                        byte b6 = (byte) (b5 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, fadingEdgeLength, mode, 683220507, false, $$e(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i14--;
                    int i16 = $10 + 51;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (28879 - (ViewConfiguration.getPressedStateDuration() >> 16)), 348 - ExpandableListView.getPackedPositionGroup(0L), Process.getGidForName("") + 26, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            c = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:54:0x03d9 A[Catch: Exception -> 0x05ec, TRY_LEAVE, TryCatch #5 {Exception -> 0x05ec, blocks: (B:52:0x0369, B:54:0x03d9, B:60:0x042e, B:62:0x0436, B:64:0x0497, B:67:0x049f, B:72:0x04e2, B:77:0x04fb, B:91:0x05c7, B:92:0x05cd, B:95:0x05dc, B:97:0x05e0, B:102:0x05e5, B:103:0x05eb, B:56:0x03f2, B:59:0x0420, B:94:0x05cf, B:68:0x04a9, B:71:0x04d4, B:75:0x04ed), top: B:123:0x0369, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0420 A[Catch: all -> 0x05e4, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x05e4, blocks: (B:56:0x03f2, B:59:0x0420, B:94:0x05cf), top: B:122:0x03f2, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0436 A[Catch: Exception -> 0x05ec, TRY_LEAVE, TryCatch #5 {Exception -> 0x05ec, blocks: (B:52:0x0369, B:54:0x03d9, B:60:0x042e, B:62:0x0436, B:64:0x0497, B:67:0x049f, B:72:0x04e2, B:77:0x04fb, B:91:0x05c7, B:92:0x05cd, B:95:0x05dc, B:97:0x05e0, B:102:0x05e5, B:103:0x05eb, B:56:0x03f2, B:59:0x0420, B:94:0x05cf, B:68:0x04a9, B:71:0x04d4, B:75:0x04ed), top: B:123:0x0369, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x049d  */
    /* JADX WARN: Code duplicated, block: B:67:0x049f A[Catch: Exception -> 0x05ec, TRY_LEAVE, TryCatch #5 {Exception -> 0x05ec, blocks: (B:52:0x0369, B:54:0x03d9, B:60:0x042e, B:62:0x0436, B:64:0x0497, B:67:0x049f, B:72:0x04e2, B:77:0x04fb, B:91:0x05c7, B:92:0x05cd, B:95:0x05dc, B:97:0x05e0, B:102:0x05e5, B:103:0x05eb, B:56:0x03f2, B:59:0x0420, B:94:0x05cf, B:68:0x04a9, B:71:0x04d4, B:75:0x04ed), top: B:123:0x0369, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x04d4 A[Catch: all -> 0x05c6, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x05c6, blocks: (B:68:0x04a9, B:71:0x04d4, B:75:0x04ed), top: B:124:0x04a9, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:79:0x0500  */
    /* JADX WARN: Code duplicated, block: B:81:0x050c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0566  */
    /* JADX WARN: Code duplicated, block: B:84:0x056e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0585  */
    /* JADX WARN: Code duplicated, block: B:88:0x058d  */
    /* JADX WARN: Code duplicated, block: B:93:0x05ce  */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2) throws Throwable {
        int i3;
        int i4;
        int i5;
        String line;
        Object[] objArr;
        char c;
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line2;
        int[] iArr;
        int i6;
        int i7;
        boolean zEquals;
        File file2;
        FileReader fileReader2;
        BufferedReader bufferedReader2;
        String line3;
        int[] iArr2;
        int scrollBarFadeDuration;
        int i8;
        boolean zEquals2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 2 % 2;
        try {
            String[] strArr = new String[2];
            int[] iArr3 = {1538095823, -599954164, -1308105671, 1225092058, 2126223053, -1610581162, -1540856054, 1761318277, 307459904, -1902562955, -1035076942, -306325411};
            int threadPriority = (Process.getThreadPriority(0) - (-20)) >> 6;
            int i17 = threadPriority * (-589);
            int i18 = (i17 ^ 11229) + ((i17 & 11229) << 1);
            int i19 = ~i;
            int i20 = ~(((-20) ^ i19) | ((-20) & i19));
            int i21 = TuitionPaymentFragmentbindingInflater1;
            int i22 = (i21 ^ 1) + ((i21 & 1) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
            int i23 = (-20) ^ threadPriority;
            if (i22 % 2 == 0) {
                int i24 = ~(i23 | ((-20) & threadPriority));
                int i25 = (i24 & i20) | (i20 ^ i24);
                int i26 = ~(i19 | threadPriority);
                int i27 = (i25 & i26) | (i25 ^ i26);
                int i28 = ~threadPriority;
                int i29 = (i28 & 19) | (i28 ^ 19);
                int i30 = ~((i29 & i) | (i29 ^ i));
                i15 = i18 * (590 - ((i27 & i30) | (i27 ^ i30)));
            } else {
                int i31 = ~(i23 | ((-20) & threadPriority));
                int i32 = (i31 & i20) | (i20 ^ i31);
                int i33 = ~(i19 | threadPriority);
                i15 = (i18 - (~(-(-((((i32 & i33) | (i32 ^ i33)) | (~(((~threadPriority) | 19) | i))) * 590))))) - 1;
            }
            int i34 = ~i;
            int i35 = (~(((-20) & threadPriority) | ((-20) ^ threadPriority))) | (~(((-20) ^ i34) | ((-20) & i34)));
            int i36 = ~((i19 ^ threadPriority) | (i19 & threadPriority));
            int i37 = (i15 - (~((-1180) * ((i35 & i36) | (i35 ^ i36))))) - 1;
            int i38 = ~threadPriority;
            int i39 = ~((i38 & i19) | (i38 ^ i19));
            int i40 = ~(i34 | 19);
            int i41 = i37 + (((i40 & i39) | (i39 ^ i40)) * 590);
            Object[] objArr2 = new Object[1];
            a(iArr3, i41, objArr2);
            strArr[0] = (String) objArr2[0];
            int[] iArr4 = {306180367, -1680591974, 120022771, 67553581, 1861372364, 275667970, -611931847, -526423334, 340368077, -141418559, 1342169054, -2108600417};
            int i42 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i43 = i42 * 495;
            int i44 = TuitionPaymentFragmentbindingInflater1;
            int i45 = (i44 ^ 91) + ((i44 & 91) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i45 % 128;
            int i46 = i45 % 2;
            int i47 = ((((i43 | (-8874)) << 1) - (i43 ^ (-8874))) - (~(-(-(((i42 ^ (-19)) | (i42 & (-19))) * (-988)))))) - 1;
            int i48 = ~i42;
            int i49 = (i48 & 18) | (18 ^ i48);
            int i50 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i51 = -(-(((i49 & i50) | (i49 ^ i50)) * 494));
            int i52 = (i47 ^ i51) + ((i51 & i47) << 1);
            int i53 = ~i42;
            int i54 = ~((i53 & (-19)) | (i53 ^ (-19)));
            int i55 = ~((i50 & 18) | (i50 ^ 18));
            int i56 = (i55 & i54) | (i54 ^ i55);
            int i57 = ~(i42 | 18);
            int i58 = (i52 - (~(((i57 & i56) | (i56 ^ i57)) * 494))) - 1;
            Object[] objArr3 = new Object[1];
            a(iArr4, i58, objArr3);
            strArr[1] = (String) objArr3[0];
            int i59 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
            TuitionPaymentFragmentbindingInflater1 = i59 % 128;
            int i60 = i59 % 2;
            int i61 = 0;
            while (true) {
                if (i61 >= 2) {
                    int i62 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i63 = (i62 ^ 123) + ((i62 & 123) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i63 % 128;
                    int i64 = i63 % 2;
                    i3 = i;
                    break;
                }
                String str = strArr[i61];
                int i65 = -View.MeasureSpec.getMode(0);
                int i66 = (i65 ^ 16) + ((i65 & 16) << 1);
                Object[] objArr4 = new Object[1];
                a(new int[]{864505127, 978658808, 1665294004, 1614007117, -702628353, 1400900503, 934904500, 1156309155, 367058486, 2081606049}, i66, objArr4);
                Class<?> cls = Class.forName((String) objArr4[0]);
                if (((Boolean) cls.getMethod(str, new Class[0]).invoke(cls, null)).booleanValue()) {
                    int i67 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
                    TuitionPaymentFragmentbindingInflater1 = i67 % 128;
                    int i68 = i67 % 2;
                    i3 = (~(i & 1)) & (i | 1);
                    break;
                }
                int i69 = (i61 & (-37)) + (i61 | (-37));
                i61 = (i69 & 38) + (i69 | 38);
                int i70 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
                TuitionPaymentFragmentbindingInflater1 = i70 % 128;
                int i71 = i70 % 2;
            }
        } catch (Exception unused) {
            i3 = (i & (-3)) | ((~i) & 2);
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char size = (char) (View.MeasureSpec.getSize(0) + 2419);
                int offsetAfter = 2845 - TextUtils.getOffsetAfter("", 0);
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 5;
                byte b = (byte) 0;
                byte b2 = (byte) (b - 1);
                Object[] objArr5 = new Object[1];
                b(b, b2, (byte) (b2 + 1), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, offsetAfter, touchSlop, -501222268, false, (String) objArr5[0], new Class[0]);
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
            long j = -525448572;
            long j2 = (((long) 450) * j) + (((long) (-448)) * jLongValue);
            long j3 = 449;
            long j4 = -1;
            long j5 = ((j ^ j4) | jLongValue) ^ j4;
            long j6 = jLongValue ^ j4;
            long jUptimeMillis = (int) SystemClock.uptimeMillis();
            long j7 = j2 + ((j5 | (((j6 | j) | jUptimeMillis) ^ j4)) * j3) + (((long) (-1347)) * j5) + (j3 * (j5 | ((((jUptimeMillis ^ j4) | j6) | j) ^ j4))) + ((long) (-633738114));
            int i72 = (int) Runtime.getRuntime().totalMemory();
            int i73 = (~(1321282088 | i72)) | (-1607838253);
            int i74 = ~((~i72) | (-1249902633));
            int i75 = ((int) (j7 >> 32)) & (1667491596 + ((i73 | i74) * (-470)) + (((~(i72 | (-286556165))) | i74) * 470));
            int i76 = ~((-8827489) | i);
            int i77 = ~i;
            int i78 = ((int) j7) & ((-2038855459) + ((i76 | (~(i77 | (-541065237)))) * 920) + (((~(1987119134 | i77)) | 8827488) * 920) + (((~((-8827489) | i77)) | (~(1995946622 | i)) | (~((-541065237) | i))) * 920));
            int i79 = (i75 & i78) | (i75 ^ i78);
            int i80 = i ^ 10;
            int i81 = TuitionPaymentFragmentbindingInflater1 + 63;
            int i82 = i81 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i82;
            int i83 = i81 % 2;
            int i84 = (i79 & (-2)) | ((~i79) & 1);
            int i85 = (i84 | (-i84)) >> 31;
            int i86 = i82 + 43;
            TuitionPaymentFragmentbindingInflater1 = i86 % 128;
            if (i86 % 2 != 0) {
                int i87 = i80 & (~i85);
                int i88 = i85 & i;
                i4 = (i88 & i87) | (i87 ^ i88);
                int i89 = 43 / 0;
            } else {
                int i90 = i80 & (~i85);
                int i91 = i85 & i;
                i4 = (i91 & i90) | (i90 ^ i91);
            }
            int i92 = (i82 & 83) + (i82 | 83);
            TuitionPaymentFragmentbindingInflater1 = i92 % 128;
            if (i92 % 2 != 0) {
                i5 = i ^ i3;
                int i93 = 80 / 0;
            } else {
                i5 = (~(i & i3)) & (i | i3);
            }
            int i94 = (i5 | (-i5)) >> 31;
            int i95 = (i4 & (~i94)) | (i3 & i94);
            try {
                try {
                    Object[] objArr6 = new Object[1];
                    a(new int[]{-1913322587, 669501872, 1768289961, 1086419628, 794912561, -1118898433, 1874787841, 2026992848, -874511458, -324246735, -1588478389, -367361172, 1208059477, 1058732262, -357536039, 602763065, -1725675018, -1109594267, -148998279, 1935193217, -1874272792, -358844328}, View.MeasureSpec.makeMeasureSpec(0, 0) + 40, objArr6);
                    File file3 = new File((String) objArr6[0]);
                    int i96 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
                    TuitionPaymentFragmentbindingInflater1 = i96 % 128;
                    int i97 = i96 % 2;
                    if (file3.canRead()) {
                        FileReader fileReader3 = new FileReader(file3);
                        BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                        try {
                            line = bufferedReader3.readLine();
                            int[] iArr5 = {-614999327, 1904727044, -1727245753, -29437475};
                            int i98 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i99 = (i98 & 83) + (i98 | 83);
                            TuitionPaymentFragmentbindingInflater1 = i99 % 128;
                            int i100 = i99 % 2;
                            Object[] objArr7 = new Object[1];
                            a(iArr5, View.resolveSize(0, 0) + 3, objArr7);
                            if (!(!line.equals((String) objArr7[0]))) {
                                fileReader3.close();
                                bufferedReader3.close();
                                int i101 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i102 = (i101 & 123) + (i101 | 123);
                                TuitionPaymentFragmentbindingInflater1 = i102 % 128;
                                int i103 = i102 % 2;
                            } else {
                                fileReader3.close();
                                bufferedReader3.close();
                            }
                            int i104 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int i105 = ~(((-32) & i) | ((-32) ^ i));
                            int i106 = ~i;
                            int i107 = i105 | (~((i106 & i104) | (i106 ^ i104)));
                            int i108 = (i77 ^ 31) | (i77 & 31);
                            int i109 = ~i108;
                            int i110 = (i104 * (-515)) + 16027 + (((i107 & i109) | (i107 ^ i109)) * (-516));
                            int i111 = ~i104;
                            int i112 = (i111 ^ (-32)) | (i111 & (-32));
                            int i113 = (i110 - (~(-(-(((~(((i111 & i77) | (i111 ^ i77)) | 31)) | (~((i112 & i) | (i112 ^ i)))) * 516))))) - 1;
                            int i114 = ~((~i104) | 31);
                            int i115 = ~i108;
                            int i116 = -(-(((i114 & i115) | (i114 ^ i115)) * 516));
                            int i117 = ((i113 | i116) << 1) - (i116 ^ i113);
                            Object[] objArr8 = new Object[1];
                            a(new int[]{1387320250, -1355176530, -630050469, 1060683520, 906529211, -686343620, -1689407442, 1139435084, -769240251, -919621977, 1152612394, 1829560242, 1321147381, 1921381513, 1212183977, 1635842768, -1390387478, 293092921}, i117, objArr8);
                            file = new File((String) objArr8[0]);
                            if (file.canRead()) {
                                fileReader = new FileReader(file);
                                bufferedReader = new BufferedReader(fileReader);
                                int i118 = TuitionPaymentFragmentbindingInflater1;
                                int i119 = ((i118 | 93) << 1) - (i118 ^ 93);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i119 % 128;
                                int i120 = i119 % 2;
                                try {
                                    line2 = bufferedReader.readLine();
                                    iArr = new int[]{-620172186, 280851153, -1030493636, -1350174552};
                                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
                                    i6 = (iNormalizeMetaState & 1) + (iNormalizeMetaState | 1);
                                    int i121 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    i7 = (i121 ^ 121) + ((i121 & 121) << 1);
                                    TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        Object[] objArr9 = new Object[1];
                                        a(iArr, i6, objArr9);
                                        line2.equals((String) objArr9[0]);
                                        fileReader.close();
                                        throw null;
                                    }
                                    Object[] objArr10 = new Object[1];
                                    a(iArr, i6, objArr10);
                                    zEquals = line2.equals((String) objArr10[0]);
                                    fileReader.close();
                                    bufferedReader.close();
                                    if (zEquals) {
                                        int i122 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                        int i123 = (i122 * (-1335)) - 24012;
                                        int i124 = ~((i122 ^ i) | (i122 & i));
                                        int i125 = ((i124 & (-37)) | ((-37) ^ i124)) * (-668);
                                        int i126 = (i123 ^ i125) + ((i123 & i125) << 1);
                                        int i127 = ((~(((-37) ^ i) | ((-37) & i))) | i122) * 1336;
                                        int i128 = (i126 ^ i127) + ((i127 & i126) << 1);
                                        int i129 = i122 | i;
                                        int i130 = ((i129 & (-37)) | (i129 ^ (-37))) * 668;
                                        Object[] objArr11 = new Object[1];
                                        a(new int[]{2044343603, 1192473224, 198559920, 1069110791, 347954798, -1689085304, 915699763, 805815396, 266601516, 1870132773, 1163565869, 1553896575, -1449143659, 1032328472, 1073283900, -266899801, 1224956473, 1472586818, -633138094, -365053529}, (i128 & i130) + (i130 | i128), objArr11);
                                        file2 = new File((String) objArr11[0]);
                                        int i131 = TuitionPaymentFragmentbindingInflater1;
                                        int i132 = (i131 ^ 59) + ((i131 & 59) << 1);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i132 % 128;
                                        int i133 = i132 % 2;
                                        if (!file2.canRead()) {
                                            fileReader2 = new FileReader(file2);
                                            bufferedReader2 = new BufferedReader(fileReader2);
                                            try {
                                                line3 = bufferedReader2.readLine();
                                                iArr2 = new int[]{-620172186, 280851153, -1030493636, -1350174552};
                                                scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                                int i134 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                i8 = (i134 ^ 45) + ((i134 & 45) << 1);
                                                TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                                                if (i8 % 2 != 0) {
                                                    Object[] objArr12 = new Object[1];
                                                    a(iArr2, scrollBarFadeDuration, objArr12);
                                                    zEquals2 = line3.equals((String) objArr12[0]);
                                                } else {
                                                    Object[] objArr13 = new Object[1];
                                                    a(iArr2, 0 - (~(-(-scrollBarFadeDuration))), objArr13);
                                                    zEquals2 = line3.equals((String) objArr13[0]);
                                                }
                                                fileReader2.close();
                                                bufferedReader2.close();
                                                if (zEquals2) {
                                                    int i135 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
                                                    TuitionPaymentFragmentbindingInflater1 = i135 % 128;
                                                    int i136 = i135 % 2;
                                                    if (line != null) {
                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                        int i137 = ~((1844145969 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (1844145969 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                                        int i138 = 1919865384 + (((i137 & 1159922688) | (1159922688 ^ i137)) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
                                                        int i139 = (i138 ^ 1174605792) + ((1174605792 & i138) << 1);
                                                        int i140 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                        int i141 = (i140 & 1701522689) | (1701522689 ^ i140);
                                                        int i142 = -(-((~((i141 & 1302545968) | (i141 ^ 1302545968))) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                                                        i9 = (i139 & i142) + (i142 | i139);
                                                        i10 = (-50823684) + ((((-811534279) ^ i77) | ((-811534279) & i77)) * 495);
                                                        i11 = ~(((-811534279) & i77) | (i77 ^ (-811534279)));
                                                        if (i9 > i10 + (((i11 & (-2044680152)) | ((-2044680152) ^ i11)) * 495)) {
                                                            objArr = new Object[2];
                                                            objArr[0] = new int[0];
                                                        } else {
                                                            objArr = new Object[2];
                                                            objArr[0] = new int[1];
                                                        }
                                                        int i143 = TuitionPaymentFragmentbindingInflater1;
                                                        i12 = (i143 & 119) + (i143 | 119);
                                                        int i144 = i12 % 128;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i144;
                                                        if (i12 % 2 == 0) {
                                                            i14 = (~(i & 110)) & (i | 110);
                                                            i13 = 1;
                                                        } else {
                                                            i13 = 1;
                                                            i14 = (~(i & 20)) & (i | 20);
                                                        }
                                                        String[] strArr2 = new String[i13];
                                                        strArr2[0] = line;
                                                        int i145 = (i144 ^ 123) + ((i144 & 123) << i13);
                                                        TuitionPaymentFragmentbindingInflater1 = i145 % 128;
                                                        int i146 = i145 % 2;
                                                        int[] iArr6 = (int[]) objArr[0];
                                                        int i147 = ((i144 | 51) << 1) - (i144 ^ 51);
                                                        TuitionPaymentFragmentbindingInflater1 = i147 % 128;
                                                        int i148 = i147 % 2;
                                                        iArr6[0] = i14;
                                                        objArr[1] = strArr2;
                                                        int i149 = i144 + 45;
                                                        TuitionPaymentFragmentbindingInflater1 = i149 % 128;
                                                        int i150 = i149 % 2;
                                                        c = 0;
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                fileReader2.close();
                                                bufferedReader2.close();
                                                throw th;
                                            }
                                        }
                                        int i151 = -(-(((1989683701 ^ i) | (1989683701 & i)) * (-859)));
                                        int i152 = (891710852 & i151) + (i151 | 891710852);
                                        int i153 = ~((1989683701 & i77) | (i77 ^ 1989683701));
                                        int i154 = ~((-41945173) | i);
                                        int i155 = (i152 - (~(-(-(((i153 & i154) | (i153 ^ i154)) * 859))))) - 1;
                                        int i156 = ~i;
                                        int i157 = ~((i156 & (-176180821)) | ((-176180821) ^ i156));
                                        int i158 = -(-(((i157 & 134235648) | (i157 ^ 134235648)) * 859));
                                        int i159 = (i155 & i158) + (i158 | i155);
                                        int i160 = ~(((-1052519400) & i) | ((-1052519400) ^ i));
                                        int i161 = ((619835970 - (~(-(-(((i160 & 213133892) | (213133892 ^ i160)) * 104))))) - (~((~(((i77 ^ 234122836) | (i77 & 234122836)) | 1052519399)) * (-104)))) - 1;
                                        int i162 = -(-(((234122836 & i) | (234122836 ^ i)) * 104));
                                        int i163 = (i161 ^ i162) + ((i162 & i161) << 1);
                                        c = 0;
                                        objArr = new Object[]{new int[]{i}, new String[0]};
                                    } else {
                                        int i1510 = -(-(((1989683701 ^ i) | (1989683701 & i)) * (-859)));
                                        int i1511 = (891710852 & i1510) + (i1510 | 891710852);
                                        int i1512 = ~((1989683701 & i77) | (i77 ^ 1989683701));
                                        int i1513 = ~((-41945173) | i);
                                        int i1514 = (i1511 - (~(-(-(((i1512 & i1513) | (i1512 ^ i1513)) * 859))))) - 1;
                                        int i1515 = ~i;
                                        int i1516 = ~((i1515 & (-176180821)) | ((-176180821) ^ i1515));
                                        int i1517 = -(-(((i1516 & 134235648) | (i1516 ^ 134235648)) * 859));
                                        int i1518 = (i1514 & i1517) + (i1517 | i1514);
                                        int i164 = ~(((-1052519400) & i) | ((-1052519400) ^ i));
                                        int i165 = ((619835970 - (~(-(-(((i164 & 213133892) | (213133892 ^ i164)) * 104))))) - (~((~(((i77 ^ 234122836) | (i77 & 234122836)) | 1052519399)) * (-104)))) - 1;
                                        int i166 = -(-(((234122836 & i) | (234122836 ^ i)) * 104));
                                        int i167 = (i165 ^ i166) + ((i166 & i165) << 1);
                                        c = 0;
                                        objArr = new Object[]{new int[]{i}, new String[0]};
                                    }
                                } catch (Throwable th2) {
                                    fileReader.close();
                                    bufferedReader.close();
                                    throw th2;
                                }
                            } else {
                                int i1519 = -(-(((1989683701 ^ i) | (1989683701 & i)) * (-859)));
                                int i15110 = (891710852 & i1519) + (i1519 | 891710852);
                                int i15111 = ~((1989683701 & i77) | (i77 ^ 1989683701));
                                int i15112 = ~((-41945173) | i);
                                int i15113 = (i15110 - (~(-(-(((i15111 & i15112) | (i15111 ^ i15112)) * 859))))) - 1;
                                int i15114 = ~i;
                                int i15115 = ~((i15114 & (-176180821)) | ((-176180821) ^ i15114));
                                int i15116 = -(-(((i15115 & 134235648) | (i15115 ^ 134235648)) * 859));
                                int i15117 = (i15113 & i15116) + (i15116 | i15113);
                                int i168 = ~(((-1052519400) & i) | ((-1052519400) ^ i));
                                int i169 = ((619835970 - (~(-(-(((i168 & 213133892) | (213133892 ^ i168)) * 104))))) - (~((~(((i77 ^ 234122836) | (i77 & 234122836)) | 1052519399)) * (-104)))) - 1;
                                int i1610 = -(-(((234122836 & i) | (234122836 ^ i)) * 104));
                                int i1611 = (i169 ^ i1610) + ((i1610 & i169) << 1);
                                c = 0;
                                objArr = new Object[]{new int[]{i}, new String[0]};
                            }
                            int i170 = ((int[]) objArr[c])[c];
                            int i171 = ((~i95) & i) | (i95 & i77);
                            int i172 = -i171;
                            int i173 = ((i171 & i172) | (i171 ^ i172)) >> 31;
                            int i174 = (~i173) & i170;
                            int i175 = i95 & i173;
                            int i176 = (i175 & i174) | (i174 ^ i175);
                            String[] strArr3 = (String[]) objArr[1];
                            Object[] objArr14 = new Object[2];
                            int i177 = (i170 | i) & (~(i & i170));
                            int i178 = -i177;
                            int i179 = (((i177 & i178) | (i177 ^ i178)) >> 31) & 1;
                            int i180 = -i179;
                            int i181 = (~(((i180 & i179) | (i179 ^ i180)) >> 31)) & 1;
                            objArr14[i179] = null;
                            objArr14[i181] = strArr3;
                            String[] strArr4 = (String[]) objArr14[0];
                            int i182 = ((~i176) & i) | (i176 & i77);
                            int i183 = -i182;
                            int i184 = (((i182 & i183) | (i182 ^ i183)) >> 31) & 16;
                            Object[] objArr15 = {new int[]{i}, new int[1], new int[]{i176}, strArr4};
                            int iNextInt = new Random().nextInt();
                            int i185 = 755061956 + (((~((-966657066) | iNextInt)) | 939786280) * (-140)) + ((~((-26870786) | iNextInt)) * 70) + (((~(iNextInt | 1006967294)) | (-94051800)) * 70);
                            int i186 = (((i184 * 51) + (i185 * (-49))) - (~((i184 | i) * (-50)))) - 1;
                            int i187 = ~i184;
                            int i188 = ~i185;
                            int i189 = (i187 & i188) | (i187 ^ i188);
                            int i190 = ~((i189 & i) | (i189 ^ i));
                            int i191 = ~i185;
                            int i192 = ~i;
                            int i193 = (i191 & i192) | (i191 ^ i192);
                            int i194 = ~((i193 & i184) | (i193 ^ i184));
                            int i195 = (i186 - (~(((i190 & i194) | (i190 ^ i194)) * 50))) - 1;
                            int i196 = ~(i188 | i77);
                            int i197 = ~(i188 | i184);
                            int i198 = (i196 & i197) | (i196 ^ i197);
                            int i199 = TuitionPaymentFragmentbindingInflater1;
                            int i200 = i199 + 111;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i200 % 128;
                            int i201 = i200 % 2;
                            int i202 = ~((i184 & i77) | (i77 ^ i184));
                            int i203 = 50 * ((i198 & i202) | (i198 ^ i202));
                            int i204 = (i195 ^ i203) + ((i195 & i203) << 1);
                            int i205 = i204 * (-244);
                            int i206 = -(-(i2 * 246));
                            int i207 = (i205 & i206) + (i205 | i206);
                            int i208 = ~i2;
                            int i209 = ~(i208 | i77);
                            int i210 = ~((i208 ^ i204) | (i208 & i204));
                            int i211 = (i207 - (~(((i209 & i210) | (i209 ^ i210)) * (-245)))) - 1;
                            int i212 = (i199 & 31) + (i199 | 31);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i212 % 128;
                            int i213 = i212 % 2;
                            int i214 = (i208 & i) | (i208 ^ i);
                            int i215 = i211 + ((-245) * (~i214));
                            int i216 = ~i214;
                            int i217 = ((i216 & i204) | (i204 ^ i216)) * 245;
                            int i218 = (i215 ^ i217) + ((i217 & i215) << 1);
                            int i219 = i218 << 13;
                            int i220 = (i219 & (~i218)) | ((~i219) & i218);
                            int i221 = i220 >>> 17;
                            int i222 = (i220 | i221) & (~(i220 & i221));
                            int i223 = i222 << 5;
                            ((int[]) objArr15[1])[0] = ((~i222) & i223) | ((~i223) & i222);
                            return objArr15;
                        } catch (Throwable th3) {
                            fileReader3.close();
                            bufferedReader3.close();
                            throw th3;
                        }
                    }
                } catch (Exception unused2) {
                }
                int i1010 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int i1011 = ~(((-32) & i) | ((-32) ^ i));
                int i1012 = ~i;
                int i1013 = i1011 | (~((i1012 & i1010) | (i1012 ^ i1010)));
                int i1014 = (i77 ^ 31) | (i77 & 31);
                int i1015 = ~i1014;
                int i1110 = (i1010 * (-515)) + 16027 + (((i1013 & i1015) | (i1013 ^ i1015)) * (-516));
                int i1111 = ~i1010;
                int i1112 = (i1111 ^ (-32)) | (i1111 & (-32));
                int i1113 = (i1110 - (~(-(-(((~(((i1111 & i77) | (i1111 ^ i77)) | 31)) | (~((i1112 & i) | (i1112 ^ i)))) * 516))))) - 1;
                int i1114 = ~((~i1010) | 31);
                int i1115 = ~i1014;
                int i1116 = -(-(((i1114 & i1115) | (i1114 ^ i1115)) * 516));
                int i1117 = ((i1113 | i1116) << 1) - (i1116 ^ i1113);
                Object[] objArr16 = new Object[1];
                a(new int[]{1387320250, -1355176530, -630050469, 1060683520, 906529211, -686343620, -1689407442, 1139435084, -769240251, -919621977, 1152612394, 1829560242, 1321147381, 1921381513, 1212183977, 1635842768, -1390387478, 293092921}, i1117, objArr16);
                file = new File((String) objArr16[0]);
                if (file.canRead()) {
                    fileReader = new FileReader(file);
                    bufferedReader = new BufferedReader(fileReader);
                    int i1118 = TuitionPaymentFragmentbindingInflater1;
                    int i1119 = ((i1118 | 93) << 1) - (i1118 ^ 93);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1119 % 128;
                    int i1210 = i1119 % 2;
                    line2 = bufferedReader.readLine();
                    iArr = new int[]{-620172186, 280851153, -1030493636, -1350174552};
                    int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0);
                    i6 = (iNormalizeMetaState2 & 1) + (iNormalizeMetaState2 | 1);
                    int i1211 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    i7 = (i1211 ^ 121) + ((i1211 & 121) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                    if (i7 % 2 == 0) {
                        Object[] objArr17 = new Object[1];
                        a(iArr, i6, objArr17);
                        line2.equals((String) objArr17[0]);
                        fileReader.close();
                        throw null;
                    }
                    Object[] objArr18 = new Object[1];
                    a(iArr, i6, objArr18);
                    zEquals = line2.equals((String) objArr18[0]);
                    fileReader.close();
                    bufferedReader.close();
                    if (zEquals) {
                        int i1212 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int i1213 = (i1212 * (-1335)) - 24012;
                        int i1214 = ~((i1212 ^ i) | (i1212 & i));
                        int i1215 = ((i1214 & (-37)) | ((-37) ^ i1214)) * (-668);
                        int i1216 = (i1213 ^ i1215) + ((i1213 & i1215) << 1);
                        int i1217 = ((~(((-37) ^ i) | ((-37) & i))) | i1212) * 1336;
                        int i1218 = (i1216 ^ i1217) + ((i1217 & i1216) << 1);
                        int i1219 = i1212 | i;
                        int i1310 = ((i1219 & (-37)) | (i1219 ^ (-37))) * 668;
                        Object[] objArr19 = new Object[1];
                        a(new int[]{2044343603, 1192473224, 198559920, 1069110791, 347954798, -1689085304, 915699763, 805815396, 266601516, 1870132773, 1163565869, 1553896575, -1449143659, 1032328472, 1073283900, -266899801, 1224956473, 1472586818, -633138094, -365053529}, (i1218 & i1310) + (i1310 | i1218), objArr19);
                        file2 = new File((String) objArr19[0]);
                        int i1311 = TuitionPaymentFragmentbindingInflater1;
                        int i1312 = (i1311 ^ 59) + ((i1311 & 59) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1312 % 128;
                        int i1313 = i1312 % 2;
                        if (!file2.canRead()) {
                            fileReader2 = new FileReader(file2);
                            bufferedReader2 = new BufferedReader(fileReader2);
                            line3 = bufferedReader2.readLine();
                            iArr2 = new int[]{-620172186, 280851153, -1030493636, -1350174552};
                            scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                            int i1314 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            i8 = (i1314 ^ 45) + ((i1314 & 45) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                            if (i8 % 2 != 0) {
                                Object[] objArr110 = new Object[1];
                                a(iArr2, scrollBarFadeDuration, objArr110);
                                zEquals2 = line3.equals((String) objArr110[0]);
                            } else {
                                Object[] objArr111 = new Object[1];
                                a(iArr2, 0 - (~(-(-scrollBarFadeDuration))), objArr111);
                                zEquals2 = line3.equals((String) objArr111[0]);
                            }
                            fileReader2.close();
                            bufferedReader2.close();
                            if (zEquals2) {
                                int i1315 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
                                TuitionPaymentFragmentbindingInflater1 = i1315 % 128;
                                int i1316 = i1315 % 2;
                                if (line != null) {
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i1317 = ~((1844145969 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (1844145969 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                    int i1318 = 1919865384 + (((i1317 & 1159922688) | (1159922688 ^ i1317)) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
                                    int i1319 = (i1318 ^ 1174605792) + ((1174605792 & i1318) << 1);
                                    int i1410 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i1411 = (i1410 & 1701522689) | (1701522689 ^ i1410);
                                    int i1412 = -(-((~((i1411 & 1302545968) | (i1411 ^ 1302545968))) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                                    i9 = (i1319 & i1412) + (i1412 | i1319);
                                    i10 = (-50823684) + ((((-811534279) ^ i77) | ((-811534279) & i77)) * 495);
                                    i11 = ~(((-811534279) & i77) | (i77 ^ (-811534279)));
                                    if (i9 > i10 + (((i11 & (-2044680152)) | ((-2044680152) ^ i11)) * 495)) {
                                        objArr = new Object[2];
                                        objArr[0] = new int[0];
                                    } else {
                                        objArr = new Object[2];
                                        objArr[0] = new int[1];
                                    }
                                    int i1413 = TuitionPaymentFragmentbindingInflater1;
                                    i12 = (i1413 & 119) + (i1413 | 119);
                                    int i1414 = i12 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1414;
                                    if (i12 % 2 == 0) {
                                        i14 = (~(i & 110)) & (i | 110);
                                        i13 = 1;
                                    } else {
                                        i13 = 1;
                                        i14 = (~(i & 20)) & (i | 20);
                                    }
                                    String[] strArr5 = new String[i13];
                                    strArr5[0] = line;
                                    int i1415 = (i1414 ^ 123) + ((i1414 & 123) << i13);
                                    TuitionPaymentFragmentbindingInflater1 = i1415 % 128;
                                    int i1416 = i1415 % 2;
                                    int[] iArr7 = (int[]) objArr[0];
                                    int i1417 = ((i1414 | 51) << 1) - (i1414 ^ 51);
                                    TuitionPaymentFragmentbindingInflater1 = i1417 % 128;
                                    int i1418 = i1417 % 2;
                                    iArr7[0] = i14;
                                    objArr[1] = strArr5;
                                    int i1419 = i1414 + 45;
                                    TuitionPaymentFragmentbindingInflater1 = i1419 % 128;
                                    int i1520 = i1419 % 2;
                                    c = 0;
                                }
                            }
                        }
                    }
                    int i15118 = -(-(((1989683701 ^ i) | (1989683701 & i)) * (-859)));
                    int i15119 = (891710852 & i15118) + (i15118 | 891710852);
                    int i151110 = ~((1989683701 & i77) | (i77 ^ 1989683701));
                    int i151111 = ~((-41945173) | i);
                    int i151112 = (i15119 - (~(-(-(((i151110 & i151111) | (i151110 ^ i151111)) * 859))))) - 1;
                    int i151113 = ~i;
                    int i151114 = ~((i151113 & (-176180821)) | ((-176180821) ^ i151113));
                    int i151115 = -(-(((i151114 & 134235648) | (i151114 ^ 134235648)) * 859));
                    int i151116 = (i151112 & i151115) + (i151115 | i151112);
                    int i1612 = ~(((-1052519400) & i) | ((-1052519400) ^ i));
                    int i1613 = ((619835970 - (~(-(-(((i1612 & 213133892) | (213133892 ^ i1612)) * 104))))) - (~((~(((i77 ^ 234122836) | (i77 & 234122836)) | 1052519399)) * (-104)))) - 1;
                    int i1614 = -(-(((234122836 & i) | (234122836 ^ i)) * 104));
                    int i1615 = (i1613 ^ i1614) + ((i1614 & i1613) << 1);
                    c = 0;
                    objArr = new Object[]{new int[]{i}, new String[0]};
                } else {
                    int i151117 = -(-(((1989683701 ^ i) | (1989683701 & i)) * (-859)));
                    int i151118 = (891710852 & i151117) + (i151117 | 891710852);
                    int i151119 = ~((1989683701 & i77) | (i77 ^ 1989683701));
                    int i1511110 = ~((-41945173) | i);
                    int i1511111 = (i151118 - (~(-(-(((i151119 & i1511110) | (i151119 ^ i1511110)) * 859))))) - 1;
                    int i1511112 = ~i;
                    int i1511113 = ~((i1511112 & (-176180821)) | ((-176180821) ^ i1511112));
                    int i1511114 = -(-(((i1511113 & 134235648) | (i1511113 ^ 134235648)) * 859));
                    int i1511115 = (i1511111 & i1511114) + (i1511114 | i1511111);
                    int i1616 = ~(((-1052519400) & i) | ((-1052519400) ^ i));
                    int i1617 = ((619835970 - (~(-(-(((i1616 & 213133892) | (213133892 ^ i1616)) * 104))))) - (~((~(((i77 ^ 234122836) | (i77 & 234122836)) | 1052519399)) * (-104)))) - 1;
                    int i1618 = -(-(((234122836 & i) | (234122836 ^ i)) * 104));
                    int i1619 = (i1617 ^ i1618) + ((i1618 & i1617) << 1);
                    c = 0;
                    objArr = new Object[]{new int[]{i}, new String[0]};
                }
            } catch (Exception unused3) {
            }
            line = null;
            int i1710 = ((int[]) objArr[c])[c];
            int i1711 = ((~i95) & i) | (i95 & i77);
            int i1712 = -i1711;
            int i1713 = ((i1711 & i1712) | (i1711 ^ i1712)) >> 31;
            int i1714 = (~i1713) & i1710;
            int i1715 = i95 & i1713;
            int i1716 = (i1715 & i1714) | (i1714 ^ i1715);
            String[] strArr6 = (String[]) objArr[1];
            Object[] objArr112 = new Object[2];
            int i1717 = (i1710 | i) & (~(i & i1710));
            int i1718 = -i1717;
            int i1719 = (((i1717 & i1718) | (i1717 ^ i1718)) >> 31) & 1;
            int i1810 = -i1719;
            int i1811 = (~(((i1810 & i1719) | (i1719 ^ i1810)) >> 31)) & 1;
            objArr112[i1719] = null;
            objArr112[i1811] = strArr6;
            String[] strArr7 = (String[]) objArr112[0];
            int i1812 = ((~i1716) & i) | (i1716 & i77);
            int i1813 = -i1812;
            int i1814 = (((i1812 & i1813) | (i1812 ^ i1813)) >> 31) & 16;
            Object[] objArr113 = {new int[]{i}, new int[1], new int[]{i1716}, strArr7};
            int iNextInt2 = new Random().nextInt();
            int i1815 = 755061956 + (((~((-966657066) | iNextInt2)) | 939786280) * (-140)) + ((~((-26870786) | iNextInt2)) * 70) + (((~(iNextInt2 | 1006967294)) | (-94051800)) * 70);
            int i1816 = (((i1814 * 51) + (i1815 * (-49))) - (~((i1814 | i) * (-50)))) - 1;
            int i1817 = ~i1814;
            int i1818 = ~i1815;
            int i1819 = (i1817 & i1818) | (i1817 ^ i1818);
            int i1910 = ~((i1819 & i) | (i1819 ^ i));
            int i1911 = ~i1815;
            int i1912 = ~i;
            int i1913 = (i1911 & i1912) | (i1911 ^ i1912);
            int i1914 = ~((i1913 & i1814) | (i1913 ^ i1814));
            int i1915 = (i1816 - (~(((i1910 & i1914) | (i1910 ^ i1914)) * 50))) - 1;
            int i1916 = ~(i1818 | i77);
            int i1917 = ~(i1818 | i1814);
            int i1918 = (i1916 & i1917) | (i1916 ^ i1917);
            int i1919 = TuitionPaymentFragmentbindingInflater1;
            int i2010 = i1919 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2010 % 128;
            int i2011 = i2010 % 2;
            int i2012 = ~((i1814 & i77) | (i77 ^ i1814));
            int i2013 = 50 * ((i1918 & i2012) | (i1918 ^ i2012));
            int i2014 = (i1915 ^ i2013) + ((i1915 & i2013) << 1);
            int i2015 = i2014 * (-244);
            int i2016 = -(-(i2 * 246));
            int i2017 = (i2015 & i2016) + (i2015 | i2016);
            int i2018 = ~i2;
            int i2019 = ~(i2018 | i77);
            int i2110 = ~((i2018 ^ i2014) | (i2018 & i2014));
            int i2111 = (i2017 - (~(((i2019 & i2110) | (i2019 ^ i2110)) * (-245)))) - 1;
            int i2112 = (i1919 & 31) + (i1919 | 31);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2112 % 128;
            int i2113 = i2112 % 2;
            int i2114 = (i2018 & i) | (i2018 ^ i);
            int i2115 = i2111 + ((-245) * (~i2114));
            int i2116 = ~i2114;
            int i2117 = ((i2116 & i2014) | (i2014 ^ i2116)) * 245;
            int i2118 = (i2115 ^ i2117) + ((i2117 & i2115) << 1);
            int i2119 = i2118 << 13;
            int i224 = (i2119 & (~i2118)) | ((~i2119) & i2118);
            int i225 = i224 >>> 17;
            int i226 = (i224 | i225) & (~(i224 & i225));
            int i227 = i226 << 5;
            ((int[]) objArr113[1])[0] = ((~i226) & i227) | ((~i227) & i226);
            return objArr113;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r6, byte r7, short r8) {
        /*
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r6 = r6 * 56
            int r6 = r6 + 66
            byte[] r1 = com.bpjstku.databinding.ActivityAsikVerifyOtpFromEmailBinding.$$c
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.databinding.ActivityAsikVerifyOtpFromEmailBinding.$$e(int, byte, short):java.lang.String");
    }
}
