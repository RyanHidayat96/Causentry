package com.bpjstku.databinding;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityOldDaySecuritySimulationBinding implements ViewBinding {
    public final MaterialButton btnCalculateSimulation;
    public final MaterialCardView cvSimulationInfo;
    public final MaterialCardView cvStartBalance;
    public final MaterialCardView cvWageAmount;
    public final TextInputEditText edtBeginingBalance;
    public final TextInputEditText edtWageAmount;
    public final AppCompatImageView ivInformation;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final TextInputLayout tilBeginingBalance;
    public final TextInputLayout tilTotalYear;
    public final TextInputLayout tilWageAmount;
    public final TextView tvPrefixStartBalance;
    public final TextView tvPrefixWageAmount;
    public final AppCompatTextView tvTitleInformation;
    private static final byte[] $$c = {88, 99, -94, -58};
    private static final int $$f = 151;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {93, -122, -23, -24, 9, -20, 28, -27, -10, 2, -10, 2, 14, -24, -16, 6, -1, -24, 6, -10, 2, 16, -24, -17, -9, 11, -19, -6};
    private static final int $$e = 124;
    private static final byte[] $$a = {67, -127, -109, 9, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 91;
    private static int b = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {57188, 57186, 60088, 60054, 57187, 60079, 60117, 60052, 60090, 57193, 60063, 57190, 60051, 60056, 60034, 60040, 60045, 57192, 60058, 57191, 57189, 60050, 57184, 60072, 60055, 60053, 60060, 60047, 60048, 60073, 60041, 60043, 60049, 60062, 60083, 60046};
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 57191;

    private static void a(short s, byte b2, int i, Object[] objArr) {
        int i2 = (s * 52) + 4;
        int i3 = (b2 * 14) + 84;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i2++;
            i3 = (i2 + (-i3)) - 10;
        }
        while (true) {
            int i5 = i3;
            int i6 = i2;
            i4++;
            bArr2[i4] = (byte) i5;
            if (i4 == i) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = i6 + 1;
                i3 = (i5 + (-bArr[i6])) - 10;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 24
            int r0 = r6 + 1
            int r8 = r8 * 17
            int r8 = 115 - r8
            byte[] r1 = com.bpjstku.databinding.ActivityOldDaySecuritySimulationBinding.$$d
            int r7 = r7 * 24
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r7 = r7 + 1
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-5)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.databinding.ActivityOldDaySecuritySimulationBinding.d(int, int, short, java.lang.Object[]):void");
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 53;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return getRoot();
        }
        getRoot();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ActivityOldDaySecuritySimulationBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialCardView materialCardView, MaterialCardView materialCardView2, MaterialCardView materialCardView3, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, AppCompatImageView appCompatImageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextView textView, TextView textView2, AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.btnCalculateSimulation = materialButton;
        this.cvSimulationInfo = materialCardView;
        this.cvStartBalance = materialCardView2;
        this.cvWageAmount = materialCardView3;
        this.edtBeginingBalance = textInputEditText;
        this.edtWageAmount = textInputEditText2;
        this.ivInformation = appCompatImageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tilBeginingBalance = textInputLayout;
        this.tilTotalYear = textInputLayout2;
        this.tilWageAmount = textInputLayout3;
        this.tvPrefixStartBalance = textView;
        this.tvPrefixWageAmount = textView2;
        this.tvTitleInformation = appCompatTextView;
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = 1770390596;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 115;
                $10 = i7 % 128;
                if (i7 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getLongPressTimeout() >> 16), 2267 - TextUtils.getCapsMode("", 0, 0), 32 - TextUtils.lastIndexOf("", '0'), -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(obj, objArr2)).charValue();
                        i3 = 2;
                        i5 = 1770390596;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.MeasureSpec.getMode(0), 2267 - KeyEvent.getDeadChar(0, 0), 33 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6++;
                    i3 = 2;
                    i5 = 1770390596;
                    obj = null;
                }
            }
            int i8 = $10 + 93;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 3 / 4;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            byte b7 = (byte) 0;
            byte b8 = b7;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 2266 - Process.getGidForName(""), ((byte) KeyEvent.getModifierMetaStateMask()) + 34, -1927765101, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i10 = $10 + 57;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i12 = $10 + 19;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            int i14 = $11 + 31;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                } else {
                    Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cArgb = (char) (49267 - Color.argb(0, 0, 0, 0));
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3261;
                        int i16 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29;
                        byte b9 = (byte) ($$f & 1);
                        byte b10 = (byte) (b9 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb, keyRepeatTimeout, i16, -127612708, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                        Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cKeyCodeFromString = (char) (22878 - KeyEvent.keyCodeFromString(""));
                            int iResolveSize = 594 - View.resolveSize(0, 0);
                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 17;
                            byte b11 = (byte) ($$f & 11);
                            byte b12 = (byte) (b11 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cKeyCodeFromString, iResolveSize, threadPriority, 1570859318, false, $$g(b11, b12, b12), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                        int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                    } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                        int i18 = $11 + 65;
                        $10 = i18 % 128;
                        int i19 = i18 % 2;
                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                        int i20 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                        int i21 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i20];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i21];
                    } else {
                        int i22 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                        int i23 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i22];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i23];
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
            }
        }
        int i24 = 0;
        while (i24 < i) {
            int i25 = $10 + 79;
            $11 = i25 % 128;
            if (i25 % 2 == 0) {
                cArr4[i24] = (char) (cArr4[i24] ^ 14395);
                i24 += 120;
            } else {
                cArr4[i24] = (char) (cArr4[i24] ^ 13722);
                i24++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0222  */
    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31532);
            int packedPositionType = 921 - ExpandableListView.getPackedPositionType(0L);
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28;
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[7], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, packedPositionType, maximumDrawingCacheSize, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{19, 24, 6, Typography.quote, '\t', 19, 11, 7, '\t', '\r', 11, 18, 15, 16, '!', 3, 4, 3, 25, 6, 16, 25}, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 72), 22 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{30, 27, 19, 30, 21, 3, 11, 28, 30, 21, 25, 28, 27, '\t', 13825}, (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 2), (-16777201) - Color.rgb(0, 0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 31533);
            int capsMode = 921 - TextUtils.getCapsMode("", 0, 0);
            int keyRepeatTimeout = 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            byte b3 = $$a[80];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            a(b3, b4, (byte) (b4 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, capsMode, keyRepeatTimeout, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cGreen = (char) (Color.green(0) + 31533);
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 921;
                int keyRepeatDelay = 28 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                byte[] bArr2 = $$a;
                byte b5 = bArr2[7];
                byte b6 = bArr2[80];
                Object[] objArr6 = new Object[1];
                a(b5, b6, (byte) (b6 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cGreen, tapTimeout, keyRepeatDelay, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i2 = ((int[]) objArr7[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i2}, (String[]) objArr7[4]};
            int iNextInt = new Random().nextInt(1090420124);
            int i3 = ((((~((-28051459) | iNextInt)) | 1142039833) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 326104892) + ((~((~iNextInt) | (-28051459))) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1368624251;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[0])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{19, 24, 6, Typography.quote, '\t', 19, 11, 7, 19, 30, 30, 7, 7, 14, '!', 27, 15, 22, 26, 15, 0, 17, 31, Typography.quote, 22, 6}, (byte) (9 - TextUtils.indexOf("", "", 0)), 25 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{17, 31, 13872, 13872, 31, 27, 26, '\t', 13874, 13874, 27, 18, '\f', 19, '!', 27, '\r', 31}, (byte) ('x' - AndroidCharacter.getMirror('0')), 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i6 = TuitionPaymentFragmentbindingInflater1 + 53;
                    b = i6 % 128;
                    int i7 = i6 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{30, 20, '\f', 22, '\f', 30, 19, 24, 24, '\b', 20, 17, 21, '!', 3, '\t'}, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 117), 16 - TextUtils.getOffsetAfter("", 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{22, '\t', 31, 27, '!', 27, 26, 15, 30, 22, 16, '\r', 1, '\b', '\t', Typography.quote}, (byte) (112 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 17 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i8 = b + 117;
            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1368624251};
                byte[] bArr3 = $$d;
                byte b7 = (byte) (-bArr3[16]);
                byte b8 = (byte) (b7 - 1);
                Object[] objArr13 = new Object[1];
                d(b7, b8, b8, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b9 = bArr3[16];
                byte b10 = (byte) (b9 + 1);
                byte b11 = (byte) (-b9);
                Object[] objArr14 = new Object[1];
                d(b10, b11, b11, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 31533);
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 921;
                    int i10 = 28 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    byte[] bArr4 = $$a;
                    byte b12 = bArr4[7];
                    byte b13 = bArr4[80];
                    Object[] objArr16 = new Object[1];
                    a(b12, b13, (byte) (b13 | 37), objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMakeMeasureSpec, iNormalizeMetaState, i10, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{19, 24, 6, Typography.quote, '\t', 19, 11, 7, '\t', '\r', 11, 18, 15, 16, '!', 3, 4, 3, 25, 6, 16, 25}, (byte) (71 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 22 - (KeyEvent.getMaxKeyCode() >> 16), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{30, 27, 19, 30, 21, 3, 11, 28, 30, 21, 25, 28, 27, '\t', 13825}, (byte) (2 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c2 = (char) (31534 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int doubleTapTimeout = 921 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 29;
                        byte b14 = $$a[80];
                        byte b15 = b14;
                        Object[] objArr19 = new Object[1];
                        a(b14, b15, (byte) (b15 | 52), objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, doubleTapTimeout, modifierMetaStateMask, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c3 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                        int i11 = 922 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int i12 = 29 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        byte[] bArr5 = $$a;
                        byte b16 = bArr5[80];
                        byte b17 = b16;
                        byte b18 = bArr5[7];
                        byte b19 = b16;
                        Object[] objArr20 = new Object[1];
                        a(b17, b18, b19, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, i11, i12, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[0])[0];
            int i16 = ((int[]) objArr[3])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i16}, (String[]) objArr[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i17 = (-1173037765) + (((~(557038941 | elapsedCpuTime)) | 1217040702) * 672);
            int i18 = ~elapsedCpuTime;
            int i19 = i15 + i17 + (((~(elapsedCpuTime | 1217040702)) | (~((-557038942) | i18))) * (-672)) + (((~((-1217040703) | i18)) | 1216872482) * 672);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr21[0])[0] = i21 ^ (i21 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i22 = 0;
                while (i22 < strArr.length) {
                    arrayList.add(strArr[i22]);
                    i22++;
                    int i23 = TuitionPaymentFragmentbindingInflater1 + 115;
                    b = i23 % 128;
                    int i24 = i23 % 2;
                }
            }
            int[] iArr = new int[i14];
            int i25 = i14 - 1;
            iArr[i25] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i25) % 2) - 1], 1).show();
            int i26 = ((int[]) objArr[0])[0];
            int i27 = ((int[]) objArr[3])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i27}, (String[]) objArr[4]};
            int i28 = ~((int) Process.getStartElapsedRealtime());
            int i29 = i26 + 1393938297 + ((~((-554797058) | i28)) * (-783)) + (((~(i28 | 1215067482)) | (-559012162)) * 783);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr22[0])[0] = i31 ^ (i31 << 5);
        }
        return this.rootView;
    }

    public static ActivityOldDaySecuritySimulationBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 15;
        b = i2 % 128;
        int i3 = i2 % 2;
        ActivityOldDaySecuritySimulationBinding activityOldDaySecuritySimulationBindingInflate = inflate(layoutInflater, null, false);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 69;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return activityOldDaySecuritySimulationBindingInflate;
        }
        throw null;
    }

    public static ActivityOldDaySecuritySimulationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.activity_old_day_security_simulation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
            int i2 = b + 121;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
        }
        ActivityOldDaySecuritySimulationBinding activityOldDaySecuritySimulationBindingBind = bind(viewInflate);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 35;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return activityOldDaySecuritySimulationBindingBind;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[PHI: r2
  0x0058: PHI (r2v13 com.google.android.material.card.MaterialCardView) = (r2v12 com.google.android.material.card.MaterialCardView), (r2v32 com.google.android.material.card.MaterialCardView) binds: [B:16:0x0056, B:13:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x0071  */
    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code duplicated, block: B:25:0x008b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0091  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:43:0x0101 A[PHI: r2
  0x0101: PHI (r2v15 int) = (r2v14 int), (r2v16 int), (r2v17 int), (r2v22 int), (r2v23 int), (r2v27 int) binds: [B:18:0x0063, B:20:0x006f, B:22:0x007b, B:28:0x009f, B:30:0x00ac, B:32:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    public static ActivityOldDaySecuritySimulationBinding bind(View view) {
        MaterialCardView materialCardView;
        MaterialCardView materialCardView2;
        int i;
        TextInputEditText textInputEditText;
        TextInputEditText textInputEditText2;
        AppCompatImageView appCompatImageView;
        int i2;
        View viewFindChildViewById;
        LayoutToolbarCenterBinding layoutToolbarCenterBindingBind;
        TextInputLayout textInputLayout;
        TextInputLayout textInputLayout2;
        TextInputLayout textInputLayout3;
        TextView textView;
        TextView textView2;
        AppCompatTextView appCompatTextView;
        int i3 = 2 % 2;
        int i4 = b + 71;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = R.id.btnCalculateSimulation;
        if (i5 == 0) {
            throw null;
        }
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnCalculateSimulation);
        if (materialButton != null) {
            i6 = R.id.cvSimulationInfo;
            MaterialCardView materialCardView3 = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvSimulationInfo);
            if (materialCardView3 != null) {
                i6 = R.id.cvStartBalance;
                MaterialCardView materialCardView4 = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvStartBalance);
                if (materialCardView4 != null) {
                    int i7 = TuitionPaymentFragmentbindingInflater1 + 73;
                    b = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = R.id.cvWageAmount;
                    if (i8 != 0) {
                        materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvWageAmount);
                        int i10 = 99 / 0;
                        if (materialCardView != null) {
                            materialCardView2 = materialCardView;
                            i = R.id.edtBeginingBalance;
                            textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBeginingBalance);
                            if (textInputEditText != null) {
                                i = R.id.edtWageAmount;
                                textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtWageAmount);
                                if (textInputEditText2 != null) {
                                    i = R.id.ivInformation;
                                    appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.ivInformation);
                                    if (appCompatImageView != null) {
                                        int i11 = TuitionPaymentFragmentbindingInflater1 + 125;
                                        b = i11 % 128;
                                        i2 = i11 % 2;
                                        i9 = R.id.layout_toolbar;
                                        if (i2 == 0) {
                                            ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                                            throw null;
                                        }
                                        viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                                        if (viewFindChildViewById != null) {
                                            layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                                            i = R.id.tilBeginingBalance;
                                            textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBeginingBalance);
                                            if (textInputLayout != null) {
                                                i = R.id.tilTotalYear;
                                                textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilTotalYear);
                                                if (textInputLayout2 != null) {
                                                    int i12 = TuitionPaymentFragmentbindingInflater1 + 77;
                                                    b = i12 % 128;
                                                    int i13 = i12 % 2;
                                                    i = R.id.tilWageAmount;
                                                    textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilWageAmount);
                                                    if (textInputLayout3 != null) {
                                                        int i14 = b + 99;
                                                        TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                                                        int i15 = i14 % 2;
                                                        i6 = R.id.tvPrefixStartBalance;
                                                        textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvPrefixStartBalance);
                                                        if (textView != null) {
                                                            i6 = R.id.tvPrefixWageAmount;
                                                            textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPrefixWageAmount);
                                                            if (textView2 != null) {
                                                                i6 = R.id.tvTitleInformation;
                                                                appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformation);
                                                                if (appCompatTextView != null) {
                                                                    return new ActivityOldDaySecuritySimulationBinding((ConstraintLayout) view, materialButton, materialCardView3, materialCardView4, materialCardView2, textInputEditText, textInputEditText2, appCompatImageView, layoutToolbarCenterBindingBind, textInputLayout, textInputLayout2, textInputLayout3, textView, textView2, appCompatTextView);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i6 = i;
                                                    }
                                                } else {
                                                    i6 = i;
                                                }
                                            } else {
                                                i6 = i;
                                            }
                                        }
                                    } else {
                                        i6 = i;
                                    }
                                } else {
                                    i6 = i;
                                }
                            } else {
                                i6 = i;
                            }
                        }
                    } else {
                        materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvWageAmount);
                        if (materialCardView != null) {
                            materialCardView2 = materialCardView;
                            i = R.id.edtBeginingBalance;
                            textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBeginingBalance);
                            if (textInputEditText != null) {
                                i = R.id.edtWageAmount;
                                textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtWageAmount);
                                if (textInputEditText2 != null) {
                                    i = R.id.ivInformation;
                                    appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.ivInformation);
                                    if (appCompatImageView != null) {
                                        int i16 = TuitionPaymentFragmentbindingInflater1 + 125;
                                        b = i16 % 128;
                                        i2 = i16 % 2;
                                        i9 = R.id.layout_toolbar;
                                        if (i2 == 0) {
                                            ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                                            throw null;
                                        }
                                        viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                                        if (viewFindChildViewById != null) {
                                            layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                                            i = R.id.tilBeginingBalance;
                                            textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBeginingBalance);
                                            if (textInputLayout != null) {
                                                i = R.id.tilTotalYear;
                                                textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilTotalYear);
                                                if (textInputLayout2 != null) {
                                                    int i17 = TuitionPaymentFragmentbindingInflater1 + 77;
                                                    b = i17 % 128;
                                                    int i18 = i17 % 2;
                                                    i = R.id.tilWageAmount;
                                                    textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilWageAmount);
                                                    if (textInputLayout3 != null) {
                                                        int i19 = b + 99;
                                                        TuitionPaymentFragmentbindingInflater1 = i19 % 128;
                                                        int i110 = i19 % 2;
                                                        i6 = R.id.tvPrefixStartBalance;
                                                        textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvPrefixStartBalance);
                                                        if (textView != null) {
                                                            i6 = R.id.tvPrefixWageAmount;
                                                            textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPrefixWageAmount);
                                                            if (textView2 != null) {
                                                                i6 = R.id.tvTitleInformation;
                                                                appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformation);
                                                                if (appCompatTextView != null) {
                                                                    return new ActivityOldDaySecuritySimulationBinding((ConstraintLayout) view, materialButton, materialCardView3, materialCardView4, materialCardView2, textInputEditText, textInputEditText2, appCompatImageView, layoutToolbarCenterBindingBind, textInputLayout, textInputLayout2, textInputLayout3, textView, textView2, appCompatTextView);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i6 = i;
                                                    }
                                                } else {
                                                    i6 = i;
                                                }
                                            } else {
                                                i6 = i;
                                            }
                                        }
                                    } else {
                                        i6 = i;
                                    }
                                } else {
                                    i6 = i;
                                }
                            } else {
                                i6 = i;
                            }
                        }
                    }
                    i6 = i9;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, short r8, short r9) {
        /*
            int r7 = r7 + 113
            int r9 = r9 * 4
            int r9 = 1 - r9
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r0 = com.bpjstku.databinding.ActivityOldDaySecuritySimulationBinding.$$c
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r7 = r9
            r5 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L28:
            int r8 = -r8
            int r3 = r3 + 1
            int r7 = r7 + r8
            r8 = r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.databinding.ActivityOldDaySecuritySimulationBinding.$$g(short, short, short):java.lang.String");
    }
}
