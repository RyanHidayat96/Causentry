package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import defpackage.SessionProcessor;
import defpackage.ViewPortBuilder;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes6.dex */
public class TimePickerTextInputPresenter implements TimePickerView.OnSelectionChange, TimePickerPresenter {
    private final TimePickerTextInputKeyController controller;
    private final EditText hourEditText;
    private final ChipTextInputComboView hourTextInput;
    private final EditText minuteEditText;
    private final ChipTextInputComboView minuteTextInput;
    private final TimeModel time;
    private final LinearLayout timePickerView;
    private MaterialButtonToggleGroup toggle;
    private final TextWatcher minuteTextWatcher = new TextWatcherAdapter() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.1
        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    TimePickerTextInputPresenter.this.time.setMinute(0);
                } else {
                    TimePickerTextInputPresenter.this.time.setMinute(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    };
    private final TextWatcher hourTextWatcher = new AnonymousClass2();

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerTextInputPresenter$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes4.dex */
    public class AnonymousClass2 extends TextWatcherAdapter {
        private static final byte[] $$c = {33, -59, 107, -108};
        private static final int $$f = 39;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {29, -5, -24, -13, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
        private static final int $$e = 245;
        private static final byte[] $$a = {117, 50, 102, 124, 6, -24, 18, -26, 71, -67, 6, -18, 67, -72, -3, 4, 59, -40, -3, 4, 6, -47, -2, -9, 12, -22, 1, -8, 2, -14, 6, -24, 18, 48, -72, 11, -1, -21, 0, 6, -14, -8, 72, -40, -21, -1, -21, 0, 10, 16, -18, -16, 7, -14, -1};
        private static final int $$b = 240;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        private static long b = -1111578287646253895L;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -981105359;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 34097;

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r5, short r6, int r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 + 4
                int r6 = r6 * 2
                int r0 = 26 - r6
                int r7 = r7 + 105
                byte[] r1 = com.google.android.material.timepicker.TimePickerTextInputPresenter.AnonymousClass2.$$a
                byte[] r0 = new byte[r0]
                int r6 = 25 - r6
                r2 = 0
                if (r1 != 0) goto L14
                r4 = r6
                r3 = r2
                goto L26
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L22:
                int r3 = r3 + 1
                r4 = r1[r5]
            L26:
                int r5 = r5 + 1
                int r4 = -r4
                int r7 = r7 + r4
                int r7 = r7 + (-3)
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.TimePickerTextInputPresenter.AnonymousClass2.a(short, short, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.google.android.material.timepicker.TimePickerTextInputPresenter.AnonymousClass2.$$d
                int r8 = r8 * 52
                int r8 = 55 - r8
                int r7 = 103 - r7
                int r6 = r6 * 52
                int r1 = r6 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L2b
            L14:
                r3 = r2
            L15:
                int r8 = r8 + 1
                byte r4 = (byte) r7
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                r3 = r0[r8]
                r5 = r3
                r3 = r8
                r8 = r5
            L2b:
                int r8 = -r8
                int r7 = r7 + r8
                int r7 = r7 + (-11)
                r8 = r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.TimePickerTextInputPresenter.AnonymousClass2.c(byte, byte, short, java.lang.Object[]):void");
        }

        AnonymousClass2() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            try {
                if (!TextUtils.isEmpty(editable)) {
                    TimePickerTextInputPresenter.this.time.setHour(Integer.parseInt(editable.toString()));
                } else {
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
                    TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                    int i5 = i4 % 2;
                    TimePickerTextInputPresenter.this.time.setHour(0);
                }
            } catch (NumberFormatException unused) {
            }
        }

        private static void d(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            SessionProcessor sessionProcessor = new SessionProcessor();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr.length;
            char[] cArr5 = new char[length2];
            int i5 = 0;
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr3.length;
            char[] cArr6 = new char[length3];
            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            int i6 = $11 + 5;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                int i8 = $10 + 37;
                $11 = i8 % 128;
                int i9 = i8 % i3;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cResolveOpacity = (char) (Drawable.resolveOpacity(i5, i5) + 8328);
                        int keyRepeatTimeout = 1235 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 35;
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        String str$$g = $$g(b2, b3, b3);
                        Class[] clsArr = new Class[1];
                        clsArr[i5] = Object.class;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, keyRepeatTimeout, fadingEdgeLength, -653973969, false, str$$g, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int iBlue = Color.blue(i5) + 2764;
                        int iBlue2 = 14 - Color.blue(i5);
                        byte b4 = (byte) i5;
                        byte b5 = (byte) (b4 + 2);
                        String str$$g2 = $$g(b4, b5, (byte) (b5 - 2));
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i5] = Object.class;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode, iBlue, iBlue2, 1504416861, false, str$$g2, clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    int i10 = cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                    objArr4[1] = Integer.valueOf(i10);
                    objArr4[i5] = sessionProcessor;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char threadPriority = (char) (((Process.getThreadPriority(i5) + 20) >> 6) + 43325);
                        int absoluteGravity = 253 - Gravity.getAbsoluteGravity(i5, i5);
                        int iMyTid = 22 - (Process.myTid() >> 22);
                        Class[] clsArr3 = new Class[3];
                        clsArr3[i5] = Object.class;
                        clsArr3[1] = Integer.TYPE;
                        clsArr3[2] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority, absoluteGravity, iMyTid, -721491957, false, "j", clsArr3);
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    int i11 = cArr4[iIntValue2] * 32718;
                    Object[] objArr5 = new Object[2];
                    objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                    objArr5[i5] = Integer.valueOf(i11);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char maxKeyCode2 = (char) (65200 - (KeyEvent.getMaxKeyCode() >> 16));
                        int offsetBefore = 2891 - TextUtils.getOffsetBefore("", i5);
                        int iMakeMeasureSpec = 17 - View.MeasureSpec.makeMeasureSpec(i5, i5);
                        byte b6 = (byte) i5;
                        byte b7 = (byte) (b6 + 1);
                        String str$$g3 = $$g(b6, b7, (byte) (b7 - 1));
                        i2 = 2;
                        Class[] clsArr4 = new Class[2];
                        clsArr4[i5] = Integer.TYPE;
                        clsArr4[1] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maxKeyCode2, offsetBefore, iMakeMeasureSpec, 2012627446, false, str$$g3, clsArr4);
                    } else {
                        i2 = 2;
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = sessionProcessor.b;
                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) ((((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))) ^ (((long) (cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (b ^ (-6377398940819159759L)))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))));
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                    i3 = i2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }

        public static int b(List list) throws Throwable {
            int i;
            boolean z;
            int i2;
            Method method;
            String string;
            Method method2;
            char[] cArr;
            int i3;
            int i4 = 2;
            int i5 = 2 % 2;
            int i6 = TuitionPaymentFragmentbindingInflater1 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            int i7 = i6 % 2;
            byte[] bArr = $$a;
            byte b2 = bArr[38];
            byte b3 = bArr[26];
            Object[] objArr = new Object[1];
            a(b2, b3, b3, objArr);
            int i8 = 0;
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((byte) 23, bArr[35], bArr[38], objArr2);
            String str = (String) objArr2[0];
            Object[] objArr3 = new Object[1];
            a((byte) (-bArr[7]), bArr[38], bArr[26], objArr3);
            Method[] methodArr = {cls.getMethod(str, KeyManager[].class, TrustManager[].class, Class.forName((String) objArr3[0]))};
            int i9 = -2001519171;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int offsetAfter = 2823 - TextUtils.getOffsetAfter("", 0);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 23;
                byte[] bArr2 = $$d;
                byte b4 = bArr2[5];
                Object[] objArr4 = new Object[1];
                c(b4, bArr2[10], b4, objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, offsetAfter, iLastIndexOf, 1814927978, false, (String) objArr4[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) != null) {
                i = i9;
                break;
            }
            int i10 = TuitionPaymentFragmentbindingInflater1;
            int i11 = (i10 ^ 93) + ((i10 & 93) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
            int i12 = i11 % 2;
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.indexOf("", ""), (ViewConfiguration.getTouchSlop() >> 8) + 2823, 22 - (KeyEvent.getMaxKeyCode() >> 16))).getDeclaredMethods();
            int length = declaredMethods.length;
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i14 = (i13 ^ 77) + ((i13 & 77) << 1);
            TuitionPaymentFragmentbindingInflater1 = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 0;
            while (true) {
                if (i16 >= length) {
                    i = i9;
                    break;
                }
                int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i18 = (i17 & 103) + (i17 | 103);
                TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                if (i18 % i4 != 0) {
                    method2 = declaredMethods[i16];
                    int i19 = 7 / i8;
                } else {
                    method2 = declaredMethods[i16];
                }
                try {
                    Object[] objArr5 = new Object[1];
                    d(new char[]{22920, 5451, 3100, 22508}, new char[]{16918, 21477, 42951, 22573}, (char) TextUtils.indexOf("", "", i8), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{7468, 10948, 30237, 33302, 55263, 1544, 30318, 21121, 47183, 53211, 8844, 12019, 13702, 51423, 6992, 7833, 65423, 38688, 11821, 10265, 28006, 31302, 1968, 18912}, objArr5);
                    Class<?> cls2 = Class.forName((String) objArr5[i8]);
                    char[] cArr2 = {22920, 5451, 3100, 22508};
                    int i20 = TuitionPaymentFragmentbindingInflater1;
                    int i21 = ((i20 | 75) << 1) - (i20 ^ 75);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i21 % 128;
                    int i22 = i21 % i4;
                    Object[] objArr6 = new Object[1];
                    d(cArr2, new char[]{50842, 8264, 35999, 12869}, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ExpandableListView.getPackedPositionForGroup(i8) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i8) == 0L ? 0 : -1)), new char[]{64705, 33480, 60336, 18012, 16261, 33102, 34989, 54546, 30120, 58159, 28840, 428}, objArr6);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr6[i8], null).invoke(method2, null)).intValue();
                    Object[] objArr7 = new Object[1];
                    objArr7[i8] = Integer.valueOf(iIntValue);
                    char[] cArr3 = {22920, 5451, 3100, 22508};
                    char[] cArr4 = {61392, 54696, 9120, 12210};
                    int iAxisFromString = MotionEvent.axisFromString("");
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = CrashlyticsReport.Session.Application.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i23 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i24 = ~(((-45605) ^ i23) | ((-45605) & i23));
                    int i25 = ~(((-45605) ^ iAxisFromString) | ((-45605) & iAxisFromString));
                    int i26 = (iAxisFromString * (-244)) + 11218584 + (((i24 ^ i25) | (i25 & i24)) * (-245));
                    int i27 = -(-((~(((-45605) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-45605) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) * (-245)));
                    int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                    int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i30 = ((i29 | 21) << 1) - (i29 ^ 21);
                    TuitionPaymentFragmentbindingInflater1 = i30 % 128;
                    int i31 = i30 % 2;
                    int i32 = ~(((-45605) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-45605) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    Object[] objArr8 = new Object[1];
                    d(cArr3, cArr4, (char) ((i28 - (~(-(-(((iAxisFromString & i32) | (iAxisFromString ^ i32)) * 245))))) - 1), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, new char[]{14447, 40512, 4750, 21565, 45010, 50072, 61124, 10221, 32288, 54805, 13341, 28936, 44122, 2628, 34432, 60811, 45333, 40781, 4296, 49079, 15002, 36308, 33604, 45298, 45951, 45156}, objArr8);
                    Class<?> cls3 = Class.forName((String) objArr8[i8]);
                    Object[] objArr9 = new Object[1];
                    d(new char[]{22920, 5451, 3100, 22508}, new char[]{52198, 50189, 62233, 58365}, (char) (TypedValue.complexToFraction(i8, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i8, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.getDefaultSize(i8, i8), new char[]{50970, 20690, 48513, 32208, 27154, 62105, 55928, 16005}, objArr9);
                    String str2 = (String) objArr9[i8];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i8] = Integer.TYPE;
                    if (((Boolean) cls3.getMethod(str2, clsArr).invoke(null, objArr7)).booleanValue()) {
                        int i33 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i34 = (i33 ^ 55) + ((i33 & 55) << 1);
                        TuitionPaymentFragmentbindingInflater1 = i34 % 128;
                        int i35 = i34 % 2;
                        Class cls4 = Long.TYPE;
                        Object[] objArr10 = new Object[1];
                        d(new char[]{22920, 5451, 3100, 22508}, new char[]{16918, 21477, 42951, 22573}, (char) ((-(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))) - 1), ViewConfiguration.getTapTimeout() >> 16, new char[]{7468, 10948, 30237, 33302, 55263, 1544, 30318, 21121, 47183, 53211, 8844, 12019, 13702, 51423, 6992, 7833, 65423, 38688, 11821, 10265, 28006, 31302, 1968, 18912}, objArr10);
                        Class<?> cls5 = Class.forName((String) objArr10[i8]);
                        char[] cArr5 = {22920, 5451, 3100, 22508};
                        int i36 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i37 = (i36 & 99) + (i36 | 99);
                        TuitionPaymentFragmentbindingInflater1 = i37 % 128;
                        if (i37 % 2 != 0) {
                            cArr = new char[]{51441, 15916, 37530, 58142};
                            i3 = (Process.getElapsedCpuTime() > 1L ? 1 : (Process.getElapsedCpuTime() == 1L ? 0 : -1)) * 3855;
                        } else {
                            cArr = new char[]{51441, 15916, 37530, 58142};
                            i3 = 7824 - (~(-(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))));
                        }
                        char[] cArr6 = cArr;
                        Object[] objArr11 = new Object[1];
                        d(cArr5, cArr6, (char) i3, (-1707201336) + TextUtils.getCapsMode("", i8, i8), new char[]{7545, 12856, 19417, 33313, 46726, 31215, 30047, 25674, 58361, 36855, 31646, 49373, 27839}, objArr11);
                        Method method3 = cls5.getMethod((String) objArr11[i8], null);
                        int i38 = TuitionPaymentFragmentbindingInflater1;
                        int i39 = ((i38 | 99) << 1) - (i38 ^ 99);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i39 % 128;
                        int i40 = i39 % 2;
                        if (cls4.equals(method3.invoke(method2, null))) {
                            Object[] objArr12 = new Object[1];
                            d(new char[]{22920, 5451, 3100, 22508}, new char[]{16918, 21477, 42951, 22573}, (char) Color.red(i8), ViewConfiguration.getMaximumFlingVelocity() >> 16, new char[]{7468, 10948, 30237, 33302, 55263, 1544, 30318, 21121, 47183, 53211, 8844, 12019, 13702, 51423, 6992, 7833, 65423, 38688, 11821, 10265, 28006, 31302, 1968, 18912}, objArr12);
                            Class<?> cls6 = Class.forName((String) objArr12[i8]);
                            int trimmedLength = TextUtils.getTrimmedLength("");
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = CrashlyticsReport.Session.Application.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i41 = trimmedLength * 284;
                            int i42 = (i41 ^ (-2099490)) + ((i41 & (-2099490)) << 1);
                            int i43 = ~trimmedLength;
                            int i44 = ~((i43 & 7445) | (i43 ^ 7445));
                            int i45 = ~(i43 | iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                            int i46 = ((i44 & i45) | (i44 ^ i45)) * (-283);
                            int i47 = (((i42 & i46) + (i46 | i42)) - (~((~((-7446) | trimmedLength)) * 283))) - 1;
                            int i48 = ~trimmedLength;
                            int i49 = ((-7446) & i48) | (i48 ^ (-7446));
                            int i50 = -(-((~((i49 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i49 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4))) * 283));
                            char c = (char) ((i47 ^ i50) + ((i50 & i47) << 1));
                            int i51 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = CrashlyticsReport.Session.Application.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i52 = (i51 * (-501)) - (-2114519465);
                            int i53 = ~(2053623456 | iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
                            int i54 = ~((i51 ^ (-2053623457)) | ((-2053623457) & i51));
                            int i55 = -(-(((i53 ^ i54) | (i53 & i54)) * (-502)));
                            int i56 = (i52 ^ i55) + ((i52 & i55) << 1);
                            int i57 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                            int i58 = (2053623456 ^ i57) | (i57 & 2053623456);
                            int i59 = i56 + ((~((i58 ^ i51) | (i58 & i51))) * (-502));
                            int i60 = ~i51;
                            int i61 = ~((i60 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i60 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                            Object[] objArr13 = new Object[1];
                            d(new char[]{22920, 5451, 3100, 22508}, new char[]{24549, 38961, 5509, 26141}, c, i59 + (((i61 & 2053623456) | (2053623456 ^ i61)) * TypedValues.PositionType.TYPE_DRAWPATH), new char[]{5609, 7310, 8659, 49435, 31205, 12604, 16699, 20557, 20490, 6812, 4029, 64461, 42088, 3481, 6680, 17781, 42804}, objArr13);
                            Object[] objArr14 = (Object[]) cls6.getMethod((String) objArr13[0], null).invoke(method2, null);
                            if (objArr14.length == 2) {
                                int i62 = TuitionPaymentFragmentbindingInflater1;
                                int i63 = ((i62 | 41) << 1) - (i62 ^ 41);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i63 % 128;
                                int i64 = i63 % 2;
                                if (Long.TYPE.equals(objArr14[0])) {
                                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                    int i65 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i66 = ((i65 | 93) << 1) - (i65 ^ 93);
                                    TuitionPaymentFragmentbindingInflater1 = i66 % 128;
                                    int i67 = i66 % 2;
                                    Object[] objArr15 = new Object[1];
                                    d(new char[]{22920, 5451, 3100, 22508}, new char[]{16918, 21477, 42951, 22573}, cResolveSizeAndState, KeyEvent.getDeadChar(0, 0), new char[]{7468, 10948, 30237, 33302, 55263, 1544, 30318, 21121, 47183, 53211, 8844, 12019, 13702, 51423, 6992, 7833, 65423, 38688, 11821, 10265, 28006, 31302, 1968, 18912}, objArr15);
                                    if (Class.forName((String) objArr15[0]).equals(objArr14[1])) {
                                        int i68 = TuitionPaymentFragmentbindingInflater1;
                                        int i69 = ((i68 | 65) << 1) - (i68 ^ 65);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i69 % 128;
                                        int i70 = i69 % 2;
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char cGreen = (char) Color.green(0);
                                            int keyRepeatDelay = 2823 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22;
                                            byte[] bArr3 = $$d;
                                            byte b5 = bArr3[5];
                                            Object[] objArr16 = new Object[1];
                                            c(b5, bArr3[10], b5, objArr16);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cGreen, keyRepeatDelay, keyRepeatTimeout, 1814927978, false, (String) objArr16[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                                            int maximumDrawingCacheSize = 2823 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                            int i71 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21;
                                            byte[] bArr4 = $$d;
                                            byte b6 = bArr4[5];
                                            Object[] objArr17 = new Object[1];
                                            c(b6, bArr4[10], b6, objArr17);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionChild, maximumDrawingCacheSize, i71, 1814927978, false, (String) objArr17[0], null);
                                        }
                                        try {
                                            Object[] objArr18 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                                int iBlue = Color.blue(0) + 2823;
                                                int i72 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22;
                                                byte b7 = $$d[7];
                                                byte b8 = b7;
                                                Object[] objArr19 = new Object[1];
                                                c(b7, b8, b8, objArr19);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarSize2, iBlue, i72, -2137287382, false, (String) objArr19[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr18)).longValue();
                                            i = -2001519171;
                                            break;
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
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
                    i16++;
                    i4 = 2;
                    i8 = 0;
                    i9 = -2001519171;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int scrollBarSize3 = (ViewConfiguration.getScrollBarSize() >> 8) + 2823;
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 22;
                byte[] bArr5 = $$d;
                byte b9 = bArr5[5];
                Object[] objArr20 = new Object[1];
                c(b9, bArr5[10], b9, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, scrollBarSize3, maxKeyCode, 1814927978, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "");
                int fadingEdgeLength = 2823 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int offsetAfter2 = 22 - TextUtils.getOffsetAfter("", 0);
                byte[] bArr6 = $$d;
                byte b10 = bArr6[7];
                Object[] objArr22 = new Object[1];
                c(b10, (byte) (-bArr6[1]), b10, objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, fadingEdgeLength, offsetAfter2, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
            Object[] objArr23 = {0, methodArr, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 37657);
                int iIndexOf = TextUtils.indexOf("", "", 0) + 2720;
                int iArgb = 19 - Color.argb(0, 0, 0, 0);
                byte[] bArr7 = $$d;
                byte b11 = bArr7[7];
                Object[] objArr24 = new Object[1];
                c(b11, (byte) (-bArr7[1]), b11, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollDefaultDelay, iIndexOf, iArgb, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
            long j = -771890053;
            long j2 = (((long) 980) * j) + (((long) (-978)) * jLongValue);
            long j3 = 979;
            long j4 = -1;
            long j5 = jLongValue ^ j4;
            long elapsedCpuTime = (int) Process.getElapsedCpuTime();
            long j6 = elapsedCpuTime ^ j4;
            long j7 = j2 + (((j5 | j6) ^ j4) * j3) + (((long) (-979)) * (j | elapsedCpuTime)) + (j3 * (((j5 | elapsedCpuTime) ^ j4) | ((j6 | j) ^ j4))) + ((long) (-1038515792));
            int i73 = TuitionPaymentFragmentbindingInflater1 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i73 % 128;
            int i74 = i73 % 2;
            int iNextInt = new Random().nextInt(1507528351);
            int i75 = ~iNextInt;
            int i76 = ((int) (j7 >> 32)) & ((-29423816) + (((~(i75 | 1942508154)) | 202747013 | (~((-1639973425) | iNextInt))) * 717) + (((~(iNextInt | 1942508154)) | (~(i75 | (-1639973425))) | 202747013) * 717));
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i77 = ~(1586219938 | (~startElapsedRealtime));
            int i78 = i76 | (((int) j7) & (((((142688672 | i77) | (~((-1586219939) | startElapsedRealtime))) * (-338)) - 453095531) + (((~(startElapsedRealtime | (-1443531267))) | i77) * 338)));
            int i79 = i78 >>> 24;
            int i80 = i78 & ViewCompat.MEASURED_SIZE_MASK;
            if (i79 != 0) {
                int i81 = TuitionPaymentFragmentbindingInflater1;
                int i82 = (i81 ^ 97) + ((i81 & 97) << 1);
                int i83 = i82 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i83;
                int i84 = i82 % 2;
                int i85 = (i83 & 15) + (i83 | 15);
                TuitionPaymentFragmentbindingInflater1 = i85 % 128;
                int i86 = i85 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i87 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i88 = (i87 & 87) + (i87 | 87);
                TuitionPaymentFragmentbindingInflater1 = i88 % 128;
                int i89 = i88 % 2;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (z && i80 < 1 && (method = methodArr[i80]) != null) {
                int i90 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
                TuitionPaymentFragmentbindingInflater1 = i90 % 128;
                if (i90 % 2 != 0) {
                    method.toString();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                string = method.toString();
                int i91 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
                TuitionPaymentFragmentbindingInflater1 = i91 % 128;
                int i92 = i91 % 2;
            } else {
                string = null;
            }
            list.add(string);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = CrashlyticsReport.Session.Application.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i93 = i79 * (-949);
            int i94 = ((-5694) & i93) + (i93 | (-5694));
            int i95 = ~i79;
            int i96 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
            int i97 = ~(i95 | i96);
            int i98 = ~(((-7) & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | ((-7) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
            int i99 = ((i97 & i98) | (i97 ^ i98)) * 1900;
            int i100 = (i94 & i99) + (i99 | i94);
            int i101 = ~((i96 ^ 6) | (i96 & 6));
            int i102 = ~((i79 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i79 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
            int i103 = i100 + (((i101 & i102) | (i101 ^ i102)) * (-950));
            int i104 = ~((i96 ^ i79) | (i79 & i96));
            int i105 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & 6) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 ^ 6));
            int i106 = -(-(((i105 & i104) | (i104 ^ i105)) * 950));
            return ((i103 & i106) + (i106 | i103)) * i2;
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
        private static java.lang.String $$g(byte r6, int r7, byte r8) {
            /*
                int r7 = r7 + 102
                byte[] r0 = com.google.android.material.timepicker.TimePickerTextInputPresenter.AnonymousClass2.$$c
                int r6 = r6 * 4
                int r6 = 4 - r6
                int r8 = r8 * 3
                int r1 = r8 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L15
                r4 = r7
                r3 = r2
                r7 = r6
                goto L28
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r8) goto L21
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L21:
                int r3 = r3 + 1
                r4 = r0[r6]
                r5 = r7
                r7 = r6
                r6 = r5
            L28:
                int r4 = -r4
                int r6 = r6 + r4
                int r7 = r7 + 1
                r5 = r7
                r7 = r6
                r6 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.TimePickerTextInputPresenter.AnonymousClass2.$$g(byte, int, byte):java.lang.String");
        }
    }

    public TimePickerTextInputPresenter(LinearLayout linearLayout, final TimeModel timeModel) {
        this.timePickerView = linearLayout;
        this.time = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_minute_text_input);
        this.minuteTextInput = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_hour_text_input);
        this.hourTextInput = chipTextInputComboView2;
        TextView textView = (TextView) chipTextInputComboView.findViewById(R.id.material_label);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(R.id.material_label);
        textView.setText(resources.getString(R.string.material_timepicker_minute));
        textView2.setText(resources.getString(R.string.material_timepicker_hour));
        chipTextInputComboView.setTag(R.id.selection_type, 12);
        chipTextInputComboView2.setTag(R.id.selection_type, 10);
        if (timeModel.format == 0) {
            setupPeriodToggle();
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    TimePickerTextInputPresenter.this.onSelectionChanged(((Integer) view.getTag(R.id.selection_type)).intValue());
                } finally {
                    ViewPortBuilder.b();
                }
            }
        };
        chipTextInputComboView2.setOnClickListener(onClickListener);
        chipTextInputComboView.setOnClickListener(onClickListener);
        chipTextInputComboView2.addInputFilter(timeModel.getHourInputValidator());
        chipTextInputComboView.addInputFilter(timeModel.getMinuteInputValidator());
        this.hourEditText = chipTextInputComboView2.getTextInput().getEditText();
        this.minuteEditText = chipTextInputComboView.getTextInput().getEditText();
        this.controller = new TimePickerTextInputKeyController(chipTextInputComboView2, chipTextInputComboView, timeModel);
        chipTextInputComboView2.setChipDelegate(new ClickActionDelegate(linearLayout.getContext(), R.string.material_hour_selection) { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.4
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(timeModel.getHourContentDescriptionResId(), String.valueOf(timeModel.getHourForDisplay())));
            }
        });
        chipTextInputComboView.setChipDelegate(new ClickActionDelegate(linearLayout.getContext(), R.string.material_minute_selection) { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.5
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(timeModel.minute)));
            }
        });
        initialize();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void initialize() {
        addTextWatchers();
        setTime(this.time);
        this.controller.bind();
    }

    private void addTextWatchers() {
        this.hourEditText.addTextChangedListener(this.hourTextWatcher);
        this.minuteEditText.addTextChangedListener(this.minuteTextWatcher);
    }

    private void removeTextWatchers() {
        this.hourEditText.removeTextChangedListener(this.hourTextWatcher);
        this.minuteEditText.removeTextChangedListener(this.minuteTextWatcher);
    }

    private void setTime(TimeModel timeModel) {
        removeTextWatchers();
        Locale locale = this.timePickerView.getResources().getConfiguration().locale;
        String str = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(timeModel.minute));
        String str2 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(timeModel.getHourForDisplay()));
        this.minuteTextInput.setText(str);
        this.hourTextInput.setText(str2);
        addTextWatchers();
        updateSelection();
    }

    private void setupPeriodToggle() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.timePickerView.findViewById(R.id.material_clock_period_toggle);
        this.toggle = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter$$ExternalSyntheticLambda0
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
            public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup2, int i, boolean z) {
                this.f$0.m7912xf2085e95(materialButtonToggleGroup2, i, z);
            }
        });
        this.toggle.setVisibility(0);
        updateSelection();
    }

    /* JADX INFO: renamed from: lambda$setupPeriodToggle$0$com-google-android-material-timepicker-TimePickerTextInputPresenter, reason: not valid java name */
    /* synthetic */ void m7912xf2085e95(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        if (z) {
            this.time.setPeriod(i == R.id.material_clock_period_pm_button ? 1 : 0);
        }
    }

    private void updateSelection() {
        int i;
        MaterialButtonToggleGroup materialButtonToggleGroup = this.toggle;
        if (materialButtonToggleGroup == null) {
            return;
        }
        if (this.time.period == 0) {
            i = R.id.material_clock_period_am_button;
        } else {
            i = R.id.material_clock_period_pm_button;
        }
        materialButtonToggleGroup.check(i);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnSelectionChange
    public void onSelectionChanged(int i) {
        this.time.selection = i;
        this.minuteTextInput.setChecked(i == 12);
        this.hourTextInput.setChecked(i == 10);
        updateSelection();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void show() {
        this.timePickerView.setVisibility(0);
        onSelectionChanged(this.time.selection);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void hide() {
        View focusedChild = this.timePickerView.getFocusedChild();
        if (focusedChild != null) {
            ViewUtils.hideKeyboard(focusedChild, false);
        }
        this.timePickerView.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void invalidate() {
        setTime(this.time);
    }

    private static void setCursorDrawableColor(EditText editText, int i) {
        try {
            Context context = editText.getContext();
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable drawable = AppCompatResources.getDrawable(context, i2);
            drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, new Drawable[]{drawable, drawable});
        } catch (Throwable unused) {
        }
    }

    public void resetChecked() {
        this.minuteTextInput.setChecked(this.time.selection == 12);
        this.hourTextInput.setChecked(this.time.selection == 10);
    }

    public void clearCheck() {
        this.minuteTextInput.setChecked(false);
        this.hourTextInput.setChecked(false);
    }
}
