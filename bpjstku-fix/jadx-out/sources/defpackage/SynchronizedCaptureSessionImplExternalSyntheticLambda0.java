package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity;
import com.rtchagas.pingplacepicker.ui.PlacePickerActivity;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SynchronizedCaptureSessionImplExternalSyntheticLambda0 implements Function1 {
    private /* synthetic */ ScholarConfirmActivity TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {25, -93, -120, -48};
    private static final int $$f = 194;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {64, 73, -26, 82, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 84;
    private static final byte[] $$a = {81, -102, -70, -91, -7, 23, -19, 25, -72, 55, 17, 9, -7, 6, -3, -63, 71, -1, -9, 0, -51, 39, 20, 0, 17, -11, 17, -39, 28, 22, -36, 31, -9, 0};
    private static final int $$b = 132;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722264;

    public /* synthetic */ SynchronizedCaptureSessionImplExternalSyntheticLambda0(ScholarConfirmActivity scholarConfirmActivity) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = scholarConfirmActivity;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 31
            byte[] r1 = defpackage.SynchronizedCaptureSessionImplExternalSyntheticLambda0.$$a
            int r8 = r8 * 2
            int r8 = r8 + 106
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            int r7 = r7 + 30
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r3 = r3 + r6
            int r6 = r3 + (-2)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.SynchronizedCaptureSessionImplExternalSyntheticLambda0.a(short, byte, short, java.lang.Object[]):void");
    }

    private static void c(int i, byte b2, short s, Object[] objArr) {
        int i2 = 103 - i;
        byte[] bArr = $$d;
        int i3 = s * 52;
        int i4 = (b2 * 52) + 4;
        byte[] bArr2 = new byte[53 - i3];
        int i5 = 52 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 = (i5 + i2) - 11;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = (i2 + bArr[i4]) - 11;
                i4++;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        b = i2 % 128;
        int i3 = i2 % 2;
        ScholarConfirmActivity scholarConfirmActivity = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) obj;
        if (i3 == 0) {
            return ScholarConfirmActivity.g(scholarConfirmActivity, virtualCameraAdapter1);
        }
        ScholarConfirmActivity.g(scholarConfirmActivity, virtualCameraAdapter1);
        throw null;
    }

    private static void d(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 1;
                    byte b3 = (byte) (-b2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), Color.red(0) + 3291, 31 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1199271174, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.getDefaultSize(0, 0), View.resolveSizeAndState(0, 0, 0) + 651, Color.green(0) + 44, -450685997, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            int i6 = $11 + 63;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            int i8 = $10 + 81;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getOffsetBefore("", 0), 651 - KeyEvent.normalizeMetaState(0), 44 - TextUtils.getOffsetAfter("", 0), -450685997, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0b7f A[PHI: r0
  0x0b7f: PHI (r0v34 java.lang.reflect.Constructor) = (r0v33 java.lang.reflect.Constructor), (r0v36 java.lang.reflect.Constructor) binds: [B:112:0x0b7d, B:109:0x0b78] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:114:0x0b93  */
    /* JADX WARN: Code duplicated, block: B:130:0x082c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0857 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0950 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0950 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0789  */
    /* JADX WARN: Code duplicated, block: B:56:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:60:0x0805  */
    /* JADX WARN: Code duplicated, block: B:64:0x082e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0860  */
    /* JADX WARN: Code duplicated, block: B:71:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:75:0x0902 A[Catch: all -> 0x0bb4, TryCatch #0 {all -> 0x0bb4, blocks: (B:73:0x08eb, B:75:0x0902, B:76:0x0943, B:88:0x09be, B:90:0x09cb, B:91:0x0a0b, B:93:0x0a2a, B:94:0x0a73), top: B:125:0x08eb }] */
    public static int b(List list) throws Throwable {
        int i;
        int i2;
        int i3;
        String string;
        Constructor constructor;
        Method[] declaredMethods;
        int length;
        int i4;
        int i5;
        int i6;
        int i7;
        String str;
        int i8;
        int i9;
        int maxKeyCode;
        int i10;
        int doubleTapTimeout;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int iLastIndexOf;
        int i17;
        Object[] objArr;
        int i18;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object[] objArr2;
        int i19 = 2;
        int i20 = 2 % 2;
        int i21 = b + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i21 % 128;
        int i22 = i21 % 2;
        byte b2 = $$a[19];
        byte b3 = b2;
        int i23 = 1;
        Object[] objArr3 = new Object[1];
        a(b2, b3, b3, objArr3);
        int i24 = 0;
        Constructor[] constructorArr = {Class.forName((String) objArr3[0]).getDeclaredConstructor(byte[].class, String.class)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
            int trimmedLength = TextUtils.getTrimmedLength("") + 2823;
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 22;
            byte[] bArr = $$d;
            byte b4 = bArr[54];
            byte b5 = bArr[7];
            Object[] objArr4 = new Object[1];
            c(b4, b5, b5, objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask, trimmedLength, iResolveOpacity, 1814927978, false, (String) objArr4[0], null);
        }
        int i25 = 16;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
            b = i26 % 128;
            int i27 = 8;
            if (i26 % 2 != 0) {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) KeyEvent.keyCodeFromString(""), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2823, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22)).getDeclaredMethods();
                length = declaredMethods.length;
                i4 = 1;
            } else {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 2823, KeyEvent.normalizeMetaState(0) + 22)).getDeclaredMethods();
                length = declaredMethods.length;
                i4 = 0;
            }
            while (true) {
                if (i4 < length) {
                    Method method = declaredMethods[i4];
                    int i28 = b;
                    int i29 = (i28 ^ 45) + ((i28 & 45) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i29 % 128;
                    int i30 = i29 % i19;
                    try {
                        int i31 = -(ViewConfiguration.getKeyRepeatDelay() >> i25);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i32 = (i31 * (-559)) - (-131274);
                        int i33 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i34 = -(-((~((i33 ^ i31) | (i33 & i31))) * (-560)));
                        int i35 = (i32 & i34) + (i32 | i34);
                        int i36 = (-235) | i31;
                        int i37 = (~((i36 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i36 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1))) * (-560);
                        int i38 = (i35 ^ i37) + ((i37 & i35) << i23);
                        int i39 = ((~((~i31) | 234)) | (~((i33 ^ 234) | (i33 & 234)))) * 560;
                        int i40 = ((i38 | i39) << i23) - (i39 ^ i38);
                        int i41 = -(ViewConfiguration.getScrollBarFadeDuration() >> i25);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i42 = i41 * (-494);
                        int i43 = (i42 & (-11856)) + (i42 | (-11856));
                        int i44 = -(-((~((i41 ^ 24) | (i41 & 24))) * (-495)));
                        int i45 = (i43 ^ i44) + ((i44 & i43) << i23);
                        int i46 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i47 = ((i46 & i41) | (i41 ^ i46)) * 495;
                        int i48 = (i45 ^ i47) + ((i47 & i45) << i23);
                        int i49 = ~((~i41) | (-25));
                        int i50 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i51 = ((~((i41 & i50) | (i50 ^ i41))) | i49) * 495;
                        int i52 = (i48 ^ i51) + ((i51 & i48) << i23);
                        int i53 = -(ViewConfiguration.getTouchSlop() >> i27);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i54 = (i53 * (-183)) + 2035;
                        int i55 = ~i53;
                        int i56 = ~((i55 ^ 11) | (i55 & 11));
                        int i57 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i58 = (i56 | (~((i57 ^ 11) | (i57 & 11)))) * 184;
                        int i59 = (((i54 & i58) + (i54 | i58)) - (~(((~((i53 & (-12)) | ((-12) ^ i53))) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3) * (-184)))) - i23;
                        int i60 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i61 = i55 ^ i60;
                        Object[] objArr5 = new Object[i23];
                        d(false, i40, i52, (i59 - (~(-(-((~((i60 & i55) | i61)) * 184))))) - 1, new char[]{'\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4, '\n', 1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6}, objArr5);
                        Class<?> cls = Class.forName((String) objArr5[i24]);
                        int i62 = -KeyEvent.normalizeMetaState(i24);
                        int i63 = (i62 & 242) + (i62 | 242);
                        int i64 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i65 = (i64 * (-55)) - 715;
                        int i66 = ~((i64 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i64 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i67 = -(-(((i66 ^ 13) | (i66 & 13)) * 56));
                        int i68 = ((i65 | i67) << 1) - (i67 ^ i65);
                        int i69 = (~(i64 | 13)) * (-56);
                        int i70 = ((i68 | i69) << i23) - (i68 ^ i69);
                        int i71 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                        int i72 = ~((i71 & 13) | (i71 ^ 13));
                        int i73 = -(-(((i72 & i64) | (i64 ^ i72)) * 56));
                        int i74 = ((i70 | i73) << i23) - (i73 ^ i70);
                        int i75 = -ExpandableListView.getPackedPositionType(0L);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i76 = i75 * (-520);
                        int i77 = (i76 ^ 4698) + ((i76 & 4698) << i23);
                        int i78 = ~i75;
                        int i79 = (i78 ^ 9) | (i78 & 9);
                        int i80 = -(-((~((i79 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i79 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) * 521));
                        int i81 = (i77 ^ i80) + ((i80 & i77) << i23);
                        int i82 = -(-((~((-10) | i75)) * (-1042)));
                        int i83 = (i81 ^ i82) + ((i81 & i82) << i23);
                        int i84 = ~(((-10) & i75) | ((-10) ^ i75));
                        int i85 = ~i75;
                        int i86 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                        int i87 = ((~((i85 & i86) | (i85 ^ i86) | 9)) | i84) * 521;
                        Object[] objArr6 = new Object[i23];
                        d(true, i63, i74, (i83 & i87) + (i83 | i87), new char[]{1, 65534, 1, 65532, 7, 65509, '\f', 65533, 65535, 11, '\n', 65533}, objArr6);
                        Object[] objArr7 = new Object[i23];
                        objArr7[i24] = Integer.valueOf(((Integer) cls.getMethod((String) objArr6[i24], null).invoke(method, null)).intValue());
                        int i88 = 234 - (~(KeyEvent.getMaxKeyCode() >> i25));
                        int iMyPid = Process.myPid() >> 22;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i89 = iMyPid * (-445);
                        int i90 = ((i89 | (-11570)) << i23) - (i89 ^ (-11570));
                        int i91 = ~iMyPid;
                        int i92 = ~((i91 ^ (-27)) | (i91 & (-27)));
                        int i93 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                        int i94 = ~(((-27) ^ i93) | ((-27) & i93));
                        int i95 = (i90 - (~(((i92 ^ i94) | (i92 & i94)) * 446))) - i23;
                        int i96 = ~((i91 & 26) | (i91 ^ 26));
                        int i97 = ((-27) & iMyPid) | ((-27) ^ iMyPid);
                        int i98 = ~((i97 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i97 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                        int i99 = -(-(((i96 & i98) | (i96 ^ i98)) * 446));
                        int i100 = ((i95 | i99) << i23) - (i95 ^ i99);
                        int i101 = ~iMyPid;
                        int i102 = i100 + ((~((i101 & (-27)) | (i101 ^ (-27)))) * 446);
                        int i103 = -(ExpandableListView.getPackedPositionForGroup(i24) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i24) == 0L ? 0 : -1));
                        Object[] objArr8 = new Object[i23];
                        d(true, i88, i102, (i103 ^ 18) + ((i103 & 18) << i23), new char[]{65485, 19, 2, 4, 11, 5, 4, 17, 65485, 6, '\r', 0, 11, 65485, 0, 21, 0, '\t', 17, 4, '\b', 5, '\b', 3, 14, 65516}, objArr8);
                        Class<?> cls2 = Class.forName((String) objArr8[i24]);
                        int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                        int i104 = (windowTouchSlop & 242) + (windowTouchSlop | 242);
                        int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i105 = ~scrollDefaultDelay;
                        int i106 = (i105 & (-9)) | (i105 ^ (-9));
                        int i107 = ~((i106 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i106 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                        int i108 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                        int i109 = ((-9) ^ i108) | ((-9) & i108);
                        int i110 = ~((i109 ^ scrollDefaultDelay) | (i109 & scrollDefaultDelay));
                        int i111 = ((scrollDefaultDelay * 51) - 392) + (((scrollDefaultDelay ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (scrollDefaultDelay & iTuitionPaymentFragmentspecialinlinedviewModeldefault7)) * (-50)) + (((i107 ^ i110) | (i107 & i110)) * 50);
                        int i112 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (-9));
                        int i113 = ~((-9) | scrollDefaultDelay);
                        int i114 = -(-(((~(scrollDefaultDelay | i108)) | (i112 & i113) | (i112 ^ i113)) * 50));
                        int i115 = (i111 ^ i114) + ((i114 & i111) << i23);
                        int i116 = -(-AndroidCharacter.getMirror('0'));
                        Object[] objArr9 = new Object[i23];
                        d(false, i104, i115, (i116 & (-40)) + (i116 | (-40)), new char[]{1, 11, 65510, 65529, '\f', 1, 14, 65533}, objArr9);
                        String str2 = (String) objArr9[i24];
                        Class<?>[] clsArr = new Class[i23];
                        clsArr[i24] = Integer.TYPE;
                        if (((Boolean) cls2.getMethod(str2, clsArr).invoke(null, objArr7)).booleanValue()) {
                            Class cls3 = Long.TYPE;
                            int deadChar = 234 - KeyEvent.getDeadChar(i24, i24);
                            int iCombineMeasuredStates = View.combineMeasuredStates(i24, i24);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i117 = iCombineMeasuredStates * (-380);
                            int i118 = (i117 ^ 9168) + ((i117 & 9168) << i23);
                            int i119 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 ^ 24) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & 24);
                            int i120 = ~iCombineMeasuredStates;
                            int i121 = -(-(((i119 ^ i120) | (i119 & i120)) * (-381)));
                            int i122 = (i118 ^ i121) + ((i121 & i118) << i23);
                            int i123 = ~((~iCombineMeasuredStates) | (-25));
                            int i124 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                            int i125 = ~((i124 & 24) | (i124 ^ 24));
                            int i126 = (i125 & i123) | (i123 ^ i125);
                            int i127 = ~(iCombineMeasuredStates | 24);
                            int i128 = ((i122 - (~(-(-(((i127 & i126) | (i126 ^ i127)) * 381))))) - 1) + ((~((i120 & 24) | (i120 ^ 24))) * 381);
                            int iBlue = Color.blue(i24);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i129 = (iBlue * 165) - 1793;
                            int i130 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | 11);
                            int i131 = ((iBlue ^ i130) | (i130 & iBlue)) * (-328);
                            int i132 = (((i129 ^ i131) + ((i129 & i131) << i23)) - (~(-(-(((iBlue ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (iBlue & iTuitionPaymentFragmentspecialinlinedviewModeldefault9)) * 164))))) - 1;
                            int i133 = ~iBlue;
                            int i134 = (~((i133 & (-12)) | (i133 ^ (-12)))) | (~(((-12) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | ((-12) & iTuitionPaymentFragmentspecialinlinedviewModeldefault9)));
                            int i135 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                            int i136 = (iBlue & i135) | (i135 ^ iBlue);
                            int i137 = ~((i136 & 11) | (i136 ^ 11));
                            int i138 = ((i137 & i134) | (i134 ^ i137)) * 164;
                            Object[] objArr10 = new Object[i23];
                            d(false, deadChar, i128, ((i132 | i138) << i23) - (i132 ^ i138), new char[]{'\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4, '\n', 1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6}, objArr10);
                            Class<?> cls4 = Class.forName((String) objArr10[i24]);
                            int i139 = -TextUtils.indexOf("", "", i24);
                            int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i140 = jumpTapTimeout * (-183);
                            int i141 = (i140 ^ 2405) + ((i140 & 2405) << i23);
                            int i142 = ~jumpTapTimeout;
                            int i143 = ~((i142 ^ 13) | (i142 & 13));
                            int i144 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                            int i145 = (i141 - (~((i143 | (~((i144 ^ 13) | (i144 & 13)))) * 184))) - i23;
                            int i146 = ~((-14) | jumpTapTimeout);
                            int i147 = -(-(((i146 & iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault10 ^ i146)) * (-184)));
                            int i148 = ((i145 | i147) << i23) - (i147 ^ i145);
                            int i149 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                            int i150 = i142 ^ i149;
                            Object[] objArr11 = new Object[i23];
                            d(true, ((i139 | 244) << i23) - (i139 ^ 244), i148 + ((~((i149 & i142) | i150)) * 184), MotionEvent.axisFromString("") + 7, new char[]{'\n', 65531, 65512, '\n', 65531, 65533, 65531, 6, 15, 65514, 4, '\b', 11}, objArr11);
                            if (cls3.equals(cls4.getMethod((String) objArr11[0], null).invoke(method, null)) != i23) {
                                continue;
                            } else {
                                int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                int i151 = ((minimumFlingVelocity | 234) << i23) - (minimumFlingVelocity ^ 234);
                                int i152 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i153 = i152 * 829;
                                int i154 = (i153 ^ 19067) + ((i153 & 19067) << i23);
                                int i155 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i156 = (i155 ^ 89) + ((i155 & 89) << i23);
                                b = i156 % 128;
                                if (i156 % 2 != 0) {
                                    int i157 = ~((~i152) | (-24));
                                    int i158 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                    int i159 = (i158 ^ i152) | (i158 & i152);
                                    int i160 = ~((i159 & 23) | (i159 ^ 23));
                                    int i161 = (i157 & i160) | (i157 ^ i160);
                                    int i162 = i154 * ((i161 & (-828)) + (i161 | (-828)));
                                    int i163 = (i152 ^ 23) | (i152 & 23);
                                    i5 = i162 + ((-828) % ((i158 & i163) | (i163 ^ i158)));
                                } else {
                                    int i164 = ~i152;
                                    int i165 = ~((i164 & (-24)) | (i164 ^ (-24)));
                                    int i166 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                    int i167 = (i166 ^ i152) | (i166 & i152);
                                    int i168 = ~((i167 & 23) | (i167 ^ 23));
                                    int i169 = i154 + (((i165 & i168) | (i165 ^ i168)) * (-828));
                                    int i170 = (i152 ^ 23) | (i152 & 23);
                                    int i171 = -(-(((i166 & i170) | (i170 ^ i166)) * (-828)));
                                    i5 = (i169 & i171) + (i171 | i169);
                                }
                                int i172 = -(-(828 * (~((i152 & 23) | (i152 ^ 23)))));
                                int i173 = (i5 ^ i172) + ((i172 & i5) << i23);
                                int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i174 = (fadingEdgeLength * (-1529)) - 8404;
                                int i175 = ~fadingEdgeLength;
                                int i176 = (i175 ^ (-12)) | (i175 & (-12));
                                int i177 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i178 = i177 + 49;
                                b = i178 % 128;
                                int i179 = i178 % 2;
                                int i180 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                if (i179 != 0) {
                                    int i181 = ~(i180 | i176);
                                    int i182 = ~fadingEdgeLength;
                                    int i183 = ~((i182 ^ 11) | (i182 & 11) | iTuitionPaymentFragmentspecialinlinedviewModeldefault12);
                                    int i184 = (i181 ^ i183) | (i181 & i183);
                                    int i185 = ((-12) ^ fadingEdgeLength) | ((-12) & fadingEdgeLength);
                                    int i186 = ~((i185 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | (i185 & iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
                                    int i187 = -((i184 ^ i186) | (i184 & i186));
                                    i6 = i174 * ((i187 & 765) + (i187 | 765));
                                    i7 = i182 | (-12);
                                } else {
                                    int i188 = ~((i180 & i176) | (i176 ^ i180));
                                    int i189 = ~fadingEdgeLength;
                                    int i190 = (i189 ^ 11) | (i189 & 11);
                                    int i191 = ~((i190 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | (i190 & iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
                                    int i192 = (i188 ^ i191) | (i188 & i191);
                                    int i193 = (-12) | fadingEdgeLength;
                                    int i194 = ~((i193 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | (i193 & iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
                                    int i195 = ((i192 ^ i194) | (i192 & i194)) * 765;
                                    i6 = (i174 ^ i195) + ((i195 & i174) << 1);
                                    i7 = (i189 ^ (-12)) | (i189 & (-12));
                                }
                                int i196 = ~i7;
                                int i197 = (i177 ^ 1) + ((i177 & 1) << 1);
                                b = i197 % 128;
                                if (i197 % 2 != 0) {
                                    int i198 = ~fadingEdgeLength;
                                    int i199 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                    int i200 = ~(i198 | i199);
                                    int i201 = i6 >>> (1530 % ((i196 ^ i200) | (i196 & i200)));
                                    int i202 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault12 & i175) | (i175 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
                                    int i203 = ((-12) ^ i199) | ((-12) & i199);
                                    int i204 = ~((fadingEdgeLength & i203) | (i203 ^ fadingEdgeLength));
                                    int i205 = i202 ^ i204;
                                    Object[] objArr12 = new Object[1];
                                    d(false, i151, i173, i201 >>> (765 / ((i204 & i202) | i205)), new char[]{'\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4, '\n', 1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6}, objArr12);
                                    str = (String) objArr12[0];
                                } else {
                                    int i206 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                    int i207 = ~((i206 & i175) | (i175 ^ i206));
                                    int i208 = -(-(1530 * ((i196 & i207) | (i196 ^ i207))));
                                    int i209 = (i6 & i208) + (i208 | i6);
                                    int i210 = ~(i175 | iTuitionPaymentFragmentspecialinlinedviewModeldefault12);
                                    int i211 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                    int i212 = (i211 & (-12)) | ((-12) ^ i211);
                                    int i213 = ~((fadingEdgeLength & i212) | (i212 ^ fadingEdgeLength));
                                    Object[] objArr13 = new Object[1];
                                    d(false, i151, i173, i209 + (((i213 & i210) | (i210 ^ i213)) * 765), new char[]{'\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4, '\n', 1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6}, objArr13);
                                    str = (String) objArr13[0];
                                }
                                Class<?> cls5 = Class.forName(str);
                                int i214 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i215 = i214 * (-665);
                                int i216 = (i215 ^ 81162) + ((i215 & 81162) << 1);
                                int i217 = ~i214;
                                int i218 = -(-(i217 * (-333)));
                                int i219 = (i216 ^ i218) + ((i216 & i218) << 1);
                                int i220 = ~i214;
                                int i221 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i222 = (i221 & 49) + (i221 | 49);
                                b = i222 % 128;
                                if (i222 % 2 != 0) {
                                    int i223 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                                    int i224 = ~(i220 | i223);
                                    int i225 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault13 ^ 243) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault13 & 243));
                                    int i226 = (i219 / (333 >> ((i224 & i225) | (i224 ^ i225)))) >>> (333 % ((~((i217 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault13) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault13 & i217))) | (~((i223 ^ 243) | (i223 & 243)))));
                                    maxKeyCode = KeyEvent.getMaxKeyCode();
                                    i8 = 44;
                                    i9 = i226;
                                    i10 = 111;
                                } else {
                                    int i227 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                                    int i228 = ~(i220 | i227);
                                    int i229 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault13 ^ 243) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault13 & 243));
                                    int i230 = ((i228 & i229) | (i228 ^ i229)) * 333;
                                    int i231 = (i219 ^ i230) + ((i230 & i219) << 1);
                                    int i232 = ~((i217 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault13) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault13 & i217));
                                    int i233 = ~((i227 ^ 243) | (i227 & 243));
                                    int i234 = -(-(((i232 & i233) | (i232 ^ i233)) * 333));
                                    i8 = 17;
                                    i9 = ((i231 | i234) << 1) - (i234 ^ i231);
                                    maxKeyCode = KeyEvent.getMaxKeyCode();
                                    i10 = 16;
                                }
                                Object[] objArr14 = new Object[1];
                                d(false, i9, i8 - (maxKeyCode >> i10), TextUtils.lastIndexOf("", '0', 0, 0) + 17, new char[]{65533, '\f', 65512, 65529, '\n', 65529, 5, 65533, '\f', 65533, '\n', 65516, 17, '\b', 65533, 11, 65535}, objArr14);
                                Object[] objArr15 = (Object[]) cls5.getMethod((String) objArr14[0], null).invoke(method, null);
                                if (objArr15.length == 2) {
                                    int i235 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
                                    b = i235 % 128;
                                    if (i235 % 2 != 0) {
                                        if (Long.TYPE.equals(objArr15[0])) {
                                            doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault14 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            i11 = (((doubleTapTimeout * (-419)) - (-98514)) - (~((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault14 ^ 234) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault14 & 234))) * TypedValues.CycleType.TYPE_EASING))) - 1;
                                            i12 = b + 59;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
                                            if (i12 % 2 == 0) {
                                                i14 = ~doubleTapTimeout;
                                                i13 = i11 >> ((-420) >>> (i14 | 234));
                                            } else {
                                                int i236 = ~doubleTapTimeout;
                                                int i237 = ((i236 & 234) | (i236 ^ 234)) * (-420);
                                                i13 = ((i11 & i237) << 1) + (i11 ^ i237);
                                                i14 = ~doubleTapTimeout;
                                            }
                                            int i238 = ~((i14 & (-235)) | (i14 ^ (-235)));
                                            int i239 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                                            int i240 = ~((i239 & 234) | (i239 ^ 234));
                                            int i241 = -(-(TypedValues.CycleType.TYPE_EASING * ((i238 & i240) | (i238 ^ i240))));
                                            i15 = ((i13 | i241) << 1) - (i241 ^ i13);
                                            int mode = View.MeasureSpec.getMode(0);
                                            i16 = ((mode | 24) << 1) - (mode ^ 24);
                                            iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
                                            i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
                                            b = i17 % 128;
                                            if (i17 % 2 != 0) {
                                                objArr2 = new Object[1];
                                                d(false, i15, i16, 12 << iLastIndexOf, new char[]{'\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4, '\n', 1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6}, objArr2);
                                                if (!Class.forName((String) objArr2[0]).equals(objArr15[1])) {
                                                    i18 = 0;
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                        char cIndexOf = (char) TextUtils.indexOf("", "", i18);
                                                        int i242 = 2824 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                        int packedPositionType = 22 - ExpandableListView.getPackedPositionType(0L);
                                                        byte[] bArr2 = $$d;
                                                        byte b6 = bArr2[54];
                                                        byte b7 = bArr2[7];
                                                        Object[] objArr16 = new Object[1];
                                                        c(b6, b7, b7, objArr16);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i242, packedPositionType, 1814927978, false, (String) objArr16[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                        char c = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                                        int iIndexOf = TextUtils.indexOf("", "") + 2823;
                                                        int threadPriority = 22 - ((Process.getThreadPriority(0) + 20) >> 6);
                                                        byte[] bArr3 = $$d;
                                                        byte b8 = bArr3[54];
                                                        byte b9 = bArr3[7];
                                                        Object[] objArr17 = new Object[1];
                                                        c(b8, b9, b9, objArr17);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iIndexOf, threadPriority, 1814927978, false, (String) objArr17[0], null);
                                                    }
                                                    try {
                                                        Object[] objArr18 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                                                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 2823;
                                                            int iMyPid2 = 22 - (Process.myPid() >> 22);
                                                            byte[] bArr4 = $$d;
                                                            byte b10 = bArr4[7];
                                                            byte b11 = (byte) (-bArr4[5]);
                                                            Object[] objArr19 = new Object[1];
                                                            c(b10, b11, b11, objArr19);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(bitsPerPixel, absoluteGravity, iMyPid2, -2137287382, false, (String) objArr19[0], new Class[]{Long.TYPE, Method.class});
                                                        }
                                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr18)).longValue();
                                                    } catch (Throwable th) {
                                                        Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                }
                                            } else {
                                                int i243 = -(-iLastIndexOf);
                                                objArr = new Object[1];
                                                d(false, i15, i16, (i243 & 12) + (i243 | 12), new char[]{'\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4, '\n', 1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6}, objArr);
                                                i18 = 0;
                                                if (Class.forName((String) objArr[0]).equals(objArr15[1])) {
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                        char cIndexOf2 = (char) TextUtils.indexOf("", "", i18);
                                                        int i244 = 2824 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                        int packedPositionType2 = 22 - ExpandableListView.getPackedPositionType(0L);
                                                        byte[] bArr5 = $$d;
                                                        byte b12 = bArr5[54];
                                                        byte b13 = bArr5[7];
                                                        Object[] objArr110 = new Object[1];
                                                        c(b12, b13, b13, objArr110);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf2, i244, packedPositionType2, 1814927978, false, (String) objArr110[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                        char c2 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                                        int iIndexOf2 = TextUtils.indexOf("", "") + 2823;
                                                        int threadPriority2 = 22 - ((Process.getThreadPriority(0) + 20) >> 6);
                                                        byte[] bArr6 = $$d;
                                                        byte b14 = bArr6[54];
                                                        byte b15 = bArr6[7];
                                                        Object[] objArr111 = new Object[1];
                                                        c(b14, b15, b15, objArr111);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iIndexOf2, threadPriority2, 1814927978, false, (String) objArr111[0], null);
                                                    }
                                                    Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                        char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                                                        int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 2823;
                                                        int iMyPid3 = 22 - (Process.myPid() >> 22);
                                                        byte[] bArr7 = $$d;
                                                        byte b16 = bArr7[7];
                                                        byte b17 = (byte) (-bArr7[5]);
                                                        Object[] objArr113 = new Object[1];
                                                        c(b16, b17, b17, objArr113);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(bitsPerPixel2, absoluteGravity2, iMyPid3, -2137287382, false, (String) objArr113[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr112)).longValue();
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else if (!Long.TYPE.equals(objArr15[0])) {
                                        continue;
                                    } else {
                                        doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault15 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        i11 = (((doubleTapTimeout * (-419)) - (-98514)) - (~((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault15 ^ 234) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault15 & 234))) * TypedValues.CycleType.TYPE_EASING))) - 1;
                                        i12 = b + 59;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
                                        if (i12 % 2 == 0) {
                                            i14 = ~doubleTapTimeout;
                                            i13 = i11 >> ((-420) >>> (i14 | 234));
                                        } else {
                                            int i2310 = ~doubleTapTimeout;
                                            int i2311 = ((i2310 & 234) | (i2310 ^ 234)) * (-420);
                                            i13 = ((i11 & i2311) << 1) + (i11 ^ i2311);
                                            i14 = ~doubleTapTimeout;
                                        }
                                        int i2312 = ~((i14 & (-235)) | (i14 ^ (-235)));
                                        int i2313 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault15;
                                        int i245 = ~((i2313 & 234) | (i2313 ^ 234));
                                        int i246 = -(-(TypedValues.CycleType.TYPE_EASING * ((i2312 & i245) | (i2312 ^ i245))));
                                        i15 = ((i13 | i246) << 1) - (i246 ^ i13);
                                        int mode2 = View.MeasureSpec.getMode(0);
                                        i16 = ((mode2 | 24) << 1) - (mode2 ^ 24);
                                        iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
                                        i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
                                        b = i17 % 128;
                                        if (i17 % 2 != 0) {
                                            objArr2 = new Object[1];
                                            d(false, i15, i16, 12 << iLastIndexOf, new char[]{'\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4, '\n', 1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6}, objArr2);
                                            if (!Class.forName((String) objArr2[0]).equals(objArr15[1])) {
                                                i18 = 0;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char cIndexOf3 = (char) TextUtils.indexOf("", "", i18);
                                                    int i247 = 2824 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                    int packedPositionType3 = 22 - ExpandableListView.getPackedPositionType(0L);
                                                    byte[] bArr8 = $$d;
                                                    byte b18 = bArr8[54];
                                                    byte b19 = bArr8[7];
                                                    Object[] objArr114 = new Object[1];
                                                    c(b18, b19, b19, objArr114);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf3, i247, packedPositionType3, 1814927978, false, (String) objArr114[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char c3 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                                    int iIndexOf3 = TextUtils.indexOf("", "") + 2823;
                                                    int threadPriority3 = 22 - ((Process.getThreadPriority(0) + 20) >> 6);
                                                    byte[] bArr9 = $$d;
                                                    byte b110 = bArr9[54];
                                                    byte b111 = bArr9[7];
                                                    Object[] objArr115 = new Object[1];
                                                    c(b110, b111, b111, objArr115);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, iIndexOf3, threadPriority3, 1814927978, false, (String) objArr115[0], null);
                                                }
                                                Object[] objArr116 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char bitsPerPixel3 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                                                    int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0) + 2823;
                                                    int iMyPid4 = 22 - (Process.myPid() >> 22);
                                                    byte[] bArr10 = $$d;
                                                    byte b112 = bArr10[7];
                                                    byte b113 = (byte) (-bArr10[5]);
                                                    Object[] objArr117 = new Object[1];
                                                    c(b112, b113, b113, objArr117);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(bitsPerPixel3, absoluteGravity3, iMyPid4, -2137287382, false, (String) objArr117[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr116)).longValue();
                                            }
                                        } else {
                                            int i248 = -(-iLastIndexOf);
                                            objArr = new Object[1];
                                            d(false, i15, i16, (i248 & 12) + (i248 | 12), new char[]{'\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4, '\n', 1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6}, objArr);
                                            i18 = 0;
                                            if (Class.forName((String) objArr[0]).equals(objArr15[1])) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char cIndexOf4 = (char) TextUtils.indexOf("", "", i18);
                                                    int i249 = 2824 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                    int packedPositionType4 = 22 - ExpandableListView.getPackedPositionType(0L);
                                                    byte[] bArr11 = $$d;
                                                    byte b114 = bArr11[54];
                                                    byte b115 = bArr11[7];
                                                    Object[] objArr118 = new Object[1];
                                                    c(b114, b115, b115, objArr118);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf4, i249, packedPositionType4, 1814927978, false, (String) objArr118[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char c4 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                                    int iIndexOf4 = TextUtils.indexOf("", "") + 2823;
                                                    int threadPriority4 = 22 - ((Process.getThreadPriority(0) + 20) >> 6);
                                                    byte[] bArr12 = $$d;
                                                    byte b116 = bArr12[54];
                                                    byte b117 = bArr12[7];
                                                    Object[] objArr119 = new Object[1];
                                                    c(b116, b117, b117, objArr119);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c4, iIndexOf4, threadPriority4, 1814927978, false, (String) objArr119[0], null);
                                                }
                                                Object[] objArr1110 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char bitsPerPixel4 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                                                    int absoluteGravity4 = Gravity.getAbsoluteGravity(0, 0) + 2823;
                                                    int iMyPid5 = 22 - (Process.myPid() >> 22);
                                                    byte[] bArr13 = $$d;
                                                    byte b118 = bArr13[7];
                                                    byte b119 = (byte) (-bArr13[5]);
                                                    Object[] objArr1111 = new Object[1];
                                                    c(b118, b119, b119, objArr1111);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(bitsPerPixel4, absoluteGravity4, iMyPid5, -2137287382, false, (String) objArr1111[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr1110)).longValue();
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        i4++;
                        int i250 = b + 109;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i250 % 128;
                        int i251 = i250 % 2;
                        i19 = 2;
                        i24 = 0;
                        i23 = 1;
                        i25 = 16;
                        i27 = 8;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char jumpTapTimeout2 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 2823;
            int i252 = 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte[] bArr14 = $$d;
            byte b20 = bArr14[54];
            byte b21 = bArr14[7];
            Object[] objArr20 = new Object[1];
            c(b20, b21, b21, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(jumpTapTimeout2, packedPositionGroup, i252, 1814927978, false, (String) objArr20[0], null);
        }
        Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
            int offsetBefore = 2823 - TextUtils.getOffsetBefore("", 0);
            int iMyTid = (Process.myTid() >> 22) + 22;
            byte[] bArr15 = $$d;
            byte b22 = (byte) (bArr15[51] - 1);
            byte b23 = (byte) (-bArr15[5]);
            Object[] objArr22 = new Object[1];
            c(b22, b23, b23, objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionChild, offsetBefore, iMyTid, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
        Object[] objArr23 = {0, constructorArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-687574488);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char deadChar2 = (char) (37657 - KeyEvent.getDeadChar(0, 0));
            int iAxisFromString = MotionEvent.axisFromString("") + 2721;
            int i253 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19;
            byte[] bArr16 = $$d;
            byte b24 = bArr16[14];
            byte b25 = (byte) (-bArr16[5]);
            Object[] objArr24 = new Object[1];
            c(b24, b25, b25, objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(deadChar2, iAxisFromString, i253, 865785343, false, (String) objArr24[0], new Class[]{Integer.TYPE, Constructor[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
        long j = -17664567;
        long j2 = -1;
        long j3 = j ^ j2;
        long j4 = jLongValue ^ j2;
        long jMyPid = Process.myPid();
        long j5 = (((long) 592) * j) + (((long) (-590)) * jLongValue) + (((long) (-1182)) * ((j3 | jLongValue) ^ j2)) + (((long) (-591)) * ((((j3 | j4) | (jMyPid ^ j2)) ^ j2) | ((jLongValue | j) ^ j2))) + (((long) 591) * (jMyPid | j3 | j4)) + ((long) (-1006391055));
        int i254 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        b = i254 % 128;
        int i255 = i254 % 2;
        int iMyPid6 = Process.myPid();
        int i256 = ~iMyPid6;
        int i257 = ((int) (j5 >> 32)) & (954944926 + (((~(508564660 | i256)) | 554319938) * (-108)) + (((~(i256 | 928661750)) | (~((-928661751) | iMyPid6)) | 134222848) * 54) + ((iMyPid6 | 134222848) * 54));
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i258 = (-1901715685) + (((~((-845562633) | iFreeMemory)) | (~((~iFreeMemory) | 2012178253))) * (-318)) + (((~(862340940 | iFreeMemory)) | 1149837313) * (-318)) + (((~(iFreeMemory | (-862340941))) | (-1995399946)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
        int i259 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i260 = i259 + 45;
        b = i260 % 128;
        int i261 = i260 % 2;
        int i262 = ((int) j5) & i258;
        int i263 = (i257 & i262) | (i257 ^ i262);
        int i264 = i263 >>> 24;
        int i265 = i263 & ViewCompat.MEASURED_SIZE_MASK;
        if (i264 != 0) {
            i2 = 2;
            i = 1;
            i3 = 1;
        } else {
            i = 1;
            int i266 = (i259 ^ 95) + ((i259 & 95) << 1);
            b = i266 % 128;
            i2 = 2;
            if (i266 % 2 != 0) {
                int i267 = 2 % 5;
            }
            i3 = 0;
        }
        if (i3 != i) {
            string = null;
        } else {
            int i268 = i259 + 7;
            int i269 = i268 % 128;
            b = i269;
            int i270 = i268 % i2;
            if (i265 < i) {
                int i271 = ((i269 | 11) << i) - (i269 ^ 11);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i271 % 128;
                if (i271 % i2 == 0) {
                    constructor = constructorArr[i265];
                    int i272 = 77 / 0;
                    if (constructor != null) {
                        string = constructor.toString();
                        int i273 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i274 = (i273 ^ 117) + ((i273 & 117) << 1);
                        b = i274 % 128;
                        int i275 = i274 % 2;
                    } else {
                        string = null;
                    }
                } else {
                    constructor = constructorArr[i265];
                    if (constructor != null) {
                        string = constructor.toString();
                        int i276 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i277 = (i276 ^ 117) + ((i276 & 117) << 1);
                        b = i277 % 128;
                        int i278 = i277 % 2;
                    } else {
                        string = null;
                    }
                }
            } else {
                string = null;
            }
        }
        list.add(string);
        int i279 = i264 + 6;
        int i280 = b;
        int i281 = (i280 & 67) + (i280 | 67);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i281 % 128;
        return i281 % 2 == 0 ? (i279 ^ i3) + ((i279 & i3) << 1) : i279 * i3;
    }

    private static String $$g(short s, short s2, byte b2) {
        int i = s + 119;
        int i2 = s2 + 4;
        byte[] bArr = $$c;
        int i3 = b2 * 3;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            int i5 = i2 + i3;
            i2 = i2;
            i = i5;
        }
        while (true) {
            int i6 = i2 + 1;
            i4++;
            bArr2[i4] = (byte) i;
            if (i4 == i3) {
                return new String(bArr2, 0);
            }
            i2 = i6;
            i += bArr[i6];
        }
    }
}
