package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class updateSelectorStateCompat implements logToString {
    private /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {57, -50, -56, -93};
    private static final int $$f = 239;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {93, -122, -23, -24, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 233;
    private static final byte[] $$a = {42, -104, -68, 105, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 36, 19, 4, 10, -8, 8, 0, -22, 22, 15, -11, 8, 0, 15, 0, 17, -34, 19, 4, 10, -8, 8, 0, -26, 39, -6, 11};
    private static final int $$b = 41;
    private static int g = 0;
    private static int asBinder = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {47411, 47420, 47399, 47343, 47409, 47407, 47414, 47403, 47416, 47415, 47418, 47401, 47376, 47413, 47406, 47417, 47412, 47402, 47375, 47371, 47400, 47369, 47396, 47405, 47373, 47408};
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2047719645;
    private static boolean b = true;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;

    public /* synthetic */ updateSelectorStateCompat(Function1 function1) {
        this.TuitionPaymentFragmentbindingInflater1 = function1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 32
            int r5 = r5 + 4
            int r7 = r7 * 19
            int r0 = r7 + 14
            byte[] r1 = defpackage.updateSelectorStateCompat.$$a
            int r6 = r6 * 6
            int r6 = r6 + 97
            byte[] r0 = new byte[r0]
            int r7 = r7 + 13
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r5
            r4 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L28:
            r3 = r1[r5]
        L2a:
            int r5 = r5 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-2)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.updateSelectorStateCompat.a(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = r6 + 4
            int r7 = r7 * 52
            int r0 = 53 - r7
            int r8 = 103 - r8
            byte[] r1 = defpackage.updateSelectorStateCompat.$$d
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L17:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r1[r8]
        L2c:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            int r8 = r8 + 1
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.updateSelectorStateCompat.c(int, short, byte, java.lang.Object[]):void");
    }

    @Override // defpackage.logToString
    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        g = i2 % 128;
        int i3 = i2 % 2;
        this.TuitionPaymentFragmentbindingInflater1.invoke(obj);
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
    }

    private static void d(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        char c = '0';
        int i4 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 101;
                $11 = i6 % 128;
                if (i6 % i2 == 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i4] = Integer.valueOf(cArr2[i5]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char gidForName = (char) (31338 - Process.getGidForName(""));
                            int deadChar = KeyEvent.getDeadChar(i4, i4) + 2994;
                            int mirror = AndroidCharacter.getMirror(c) - 31;
                            byte b2 = (byte) ($$f & 1);
                            byte b3 = (byte) (-b2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName, deadChar, mirror, 1182129903, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf("", "") + 31339);
                            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 2995;
                            int mode = View.MeasureSpec.getMode(0) + 17;
                            byte b4 = (byte) ($$f & 1);
                            byte b5 = (byte) (-b4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, bitsPerPixel, mode, 1182129903, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i5++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = 2;
                c = '0';
                i4 = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 252 - TextUtils.lastIndexOf("", '0'), 22 - (ViewConfiguration.getLongPressTimeout() >> 16), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i7 = $10 + 107;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.alpha(0) + 33602), 3084 - ((byte) KeyEvent.getModifierMetaStateMask()), 26 - (ViewConfiguration.getFadingEdgeLength() >> 16), -2146875848, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (b) {
            int i9 = $11 + 23;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33602 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 3085 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.resolveSize(0, 0) + 26, -2146875848, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
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
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                i11 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0913  */
    /* JADX WARN: Code duplicated, block: B:128:0x0540 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0648 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x0549  */
    /* JADX WARN: Code duplicated, block: B:71:0x059a  */
    /* JADX WARN: Code duplicated, block: B:75:0x05f0 A[Catch: all -> 0x0923, TryCatch #0 {all -> 0x0923, blocks: (B:73:0x05d9, B:75:0x05f0, B:76:0x062e, B:88:0x06bf, B:90:0x06cc, B:91:0x0709, B:93:0x0728, B:94:0x076e), top: B:123:0x05d9 }] */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(List list) throws Throwable {
        long j;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        String string;
        Method[] declaredMethods;
        int length;
        Class<?> cls;
        int iIndexOf;
        int i5;
        Class<?> cls2;
        int i6;
        int iB;
        int i7;
        int i8;
        int i9;
        int i10;
        Object[] objArr;
        Method method;
        int i11;
        byte[] bArr;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i12 = 2;
        int i13 = 2 % 2;
        int i14 = asBinder + 123;
        g = i14 % 128;
        int i15 = i14 % 2;
        byte[] bArr2 = $$a;
        byte b2 = bArr2[28];
        int i16 = 1;
        Object[] objArr3 = new Object[1];
        a(b2, b2, bArr2[13], objArr3);
        Class<?> cls3 = Class.forName((String) objArr3[0]);
        byte b3 = bArr2[13];
        Object[] objArr4 = new Object[1];
        a(b3, b3, bArr2[28], objArr4);
        Method method2 = cls3.getMethod((String) objArr4[0], String.class, Integer.TYPE);
        Class<?> cls4 = Class.forName("android.app.ApplicationPackageManager");
        byte b4 = bArr2[13];
        Object[] objArr5 = new Object[1];
        a(b4, b4, bArr2[28], objArr5);
        Method[] methodArr = {method2, cls4.getMethod((String) objArr5[0], String.class, Integer.TYPE)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        char c = '0';
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 2823;
            int iLastIndexOf = 21 - TextUtils.lastIndexOf("", '0', 0, 0);
            byte[] bArr3 = $$d;
            byte b5 = bArr3[7];
            Object[] objArr6 = new Object[1];
            c(b5, b5, bArr3[10], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(fadingEdgeLength, pressedStateDuration, iLastIndexOf, 1814927978, false, (String) objArr6[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            int i17 = g + 73;
            asBinder = i17 % 128;
            if (i17 % 2 == 0) {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getOffsetAfter("", 0), TextUtils.getTrimmedLength("") + 2823, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22)).getDeclaredMethods();
                length = declaredMethods.length;
            } else {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 2823 - TextUtils.indexOf("", "", 0, 0), 22 - (ViewConfiguration.getTapTimeout() >> 16))).getDeclaredMethods();
                length = declaredMethods.length;
            }
            int i18 = 0;
            while (i18 < length) {
                Method method3 = declaredMethods[i18];
                int i19 = g;
                int i20 = (i19 & 39) + (i19 | 39);
                asBinder = i20 % 128;
                int i21 = i20 % i12;
                try {
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", c);
                    int iB2 = setAspectRatio.AnonymousClass6.b();
                    int i22 = iLastIndexOf2 * 522;
                    int i23 = (i22 ^ (-66560)) + ((i22 & (-66560)) << i16);
                    int i24 = g;
                    int i25 = (i24 ^ 17) + ((i24 & 17) << 1);
                    asBinder = i25 % 128;
                    int i26 = i25 % i12;
                    int i27 = ~iB2;
                    int i28 = ~((i27 ^ 128) | (i27 & 128));
                    int i29 = -(-((-1042) * ((i28 & iLastIndexOf2) | (iLastIndexOf2 ^ i28))));
                    int i30 = (i23 & i29) + (i23 | i29);
                    int i31 = (128 | iB2) * 521;
                    int i32 = (i30 ^ i31) + ((i31 & i30) << i16);
                    int i33 = ~iLastIndexOf2;
                    int i34 = ~(i33 | (-129));
                    int i35 = (i24 & 59) + (i24 | 59);
                    asBinder = i35 % 128;
                    if (i35 % i12 == 0) {
                        int i36 = i27 | iLastIndexOf2;
                        Object[] objArr7 = new Object[i16];
                        d(null, null, i32 / (520 - (~(((~(i33 | iB2)) | i34) | (~((i36 & 128) | (i36 ^ 128)))))), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr7);
                        cls = Class.forName((String) objArr7[0]);
                        iIndexOf = TextUtils.indexOf("", "");
                        i5 = 63;
                    } else {
                        int i37 = ~((i33 & iB2) | (i33 ^ iB2));
                        int i38 = (i37 & i34) | (i34 ^ i37);
                        int i39 = (i27 & iLastIndexOf2) | (i27 ^ iLastIndexOf2);
                        int i40 = ~((i39 & 128) | (i39 ^ 128));
                        Object[] objArr8 = new Object[i16];
                        d(null, null, (i32 - (~(((i38 & i40) | (i38 ^ i40)) * 521))) - 1, new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr8);
                        cls = Class.forName((String) objArr8[0]);
                        iIndexOf = TextUtils.indexOf("", "");
                        i5 = 127;
                    }
                    int i41 = -iIndexOf;
                    Object[] objArr9 = new Object[i16];
                    d(null, null, ((i5 | i41) << i16) - (i41 ^ i5), new byte[]{-110, -120, -119, -111, -118, -111, -112, -113, -115, -116, -119, -121}, objArr9);
                    Object[] objArr10 = new Object[i16];
                    objArr10[0] = Integer.valueOf(((Integer) cls.getMethod((String) objArr9[0], null).invoke(method3, null)).intValue());
                    int i42 = asBinder;
                    int i43 = (i42 & 35) + (i42 | 35);
                    g = i43 % 128;
                    if (i43 % i12 != 0) {
                        Object[] objArr11 = new Object[i16];
                        d(null, null, 127 << ExpandableListView.getPackedPositionGroup(0L), new byte[]{-120, -119, -111, -118, -111, -112, -113, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr11);
                        cls2 = Class.forName((String) objArr11[0]);
                        i6 = -(Process.myTid() >> 102);
                        iB = setAspectRatio.AnonymousClass6.b();
                        i7 = 253 << i6;
                        i8 = 120;
                    } else {
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                        Object[] objArr12 = new Object[i16];
                        d(null, null, (packedPositionGroup & 127) + (127 | packedPositionGroup), new byte[]{-120, -119, -111, -118, -111, -112, -113, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr12);
                        cls2 = Class.forName((String) objArr12[0]);
                        i6 = -(Process.myTid() >> 22);
                        iB = setAspectRatio.AnonymousClass6.b();
                        i7 = i6 * 253;
                        i8 = 127;
                    }
                    int i44 = -(-(253 * i8));
                    int i45 = (i7 & i44) + (i7 | i44);
                    int i46 = ~i6;
                    int i47 = ~i8;
                    int i48 = ~((i46 ^ i47) | (i46 & i47));
                    int i49 = ~i8;
                    int i50 = ~iB;
                    int i51 = (~(i49 | i50)) | i48;
                    int i52 = (i6 ^ i8) | (i6 & i8);
                    int i53 = (i52 ^ iB) | (i52 & iB);
                    int i54 = g;
                    Method[] methodArr2 = declaredMethods;
                    int i55 = (i54 & 65) + (i54 | 65);
                    int i56 = length;
                    asBinder = i55 % 128;
                    if (i55 % 2 == 0) {
                        int i57 = ~i53;
                        i9 = (i45 << ((-252) % ((i57 & i51) | (i51 ^ i57)))) % ((i6 | i8) - 252);
                        i10 = ~((~iB) | i47 | i6);
                    } else {
                        int i58 = ~i53;
                        int i59 = ((i58 & i51) | (i51 ^ i58)) * (-252);
                        i9 = (i45 ^ i59) + ((i45 & i59) << 1) + (i52 * (-252));
                        int i60 = (i47 ^ i50) | (i50 & i47);
                        i10 = ~((i60 & i6) | (i60 ^ i6));
                        i53 = i52 | iB;
                    }
                    int i61 = ~i53;
                    Object[] objArr13 = new Object[1];
                    d(null, null, (i9 - (~(-(-(252 * ((i61 & i10) | (i10 ^ i61))))))) - 1, new byte[]{-119, -125, -111, -116, -126, -109, -110, -111}, objArr13);
                    if (((Boolean) cls2.getMethod((String) objArr13[0], Integer.TYPE).invoke(null, objArr10)).booleanValue()) {
                        int i62 = asBinder;
                        int i63 = (i62 & 63) + (i62 | 63);
                        g = i63 % 128;
                        int i64 = i63 % 2;
                        Class cls5 = Long.TYPE;
                        Object[] objArr14 = new Object[1];
                        d(null, null, (ViewConfiguration.getTouchSlop() >> 8) + 127, new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr14);
                        Class<?> cls6 = Class.forName((String) objArr14[0]);
                        int i65 = asBinder + 123;
                        g = i65 % 128;
                        if (i65 % 2 != 0) {
                            Object[] objArr15 = new Object[1];
                            d(null, null, 'O' >> AndroidCharacter.getMirror('0'), new byte[]{-119, -104, -105, -106, -122, -120, -107, -116, -119, -108, -116, -119, -121}, objArr15);
                            method = cls6.getMethod((String) objArr15[0], null);
                            objArr = null;
                        } else {
                            Object[] objArr16 = new Object[1];
                            objArr = null;
                            d(null, null, AndroidCharacter.getMirror('0') + 'O', new byte[]{-119, -104, -105, -106, -122, -120, -107, -116, -119, -108, -116, -119, -121}, objArr16);
                            method = cls6.getMethod((String) objArr16[0], null);
                        }
                        if (cls5.equals(method.invoke(method3, objArr))) {
                            int i66 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            int iB3 = setAspectRatio.AnonymousClass6.b();
                            int i67 = asBinder;
                            int i68 = (i67 & 49) + (i67 | 49);
                            g = i68 % 128;
                            int i69 = i68 % 2;
                            int i70 = ~(i66 | iB3);
                            int i71 = (((i66 * 673) - 171904) - (~(-(-(((i70 & 128) | (128 ^ i70)) * 672))))) - 1;
                            int i72 = ~i66;
                            int i73 = ~iB3;
                            int i74 = ~((i72 & i73) | (i72 ^ i73));
                            int i75 = ~((iB3 & 128) | (iB3 ^ 128));
                            int i76 = -(-(((i75 & i74) | (i74 ^ i75)) * (-672)));
                            int i77 = (i71 & i76) + (i76 | i71);
                            int i78 = ~(((-129) ^ i73) | (i73 & (-129)));
                            int i79 = ~((i66 & (-129)) | ((-129) ^ i66));
                            Object[] objArr17 = new Object[1];
                            d(null, null, i77 + (((i79 & i78) | (i78 ^ i79)) * 672), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr17);
                            Class<?> cls7 = Class.forName((String) objArr17[0]);
                            int i80 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                            int iB4 = setAspectRatio.AnonymousClass6.b();
                            int i81 = i80 * (-433);
                            int i82 = (i81 & (-27432)) + (i81 | (-27432));
                            int i83 = ~i80;
                            int i84 = ~iB4;
                            int i85 = ~((i83 ^ i84) | (i83 & i84));
                            int i86 = ~(((-128) ^ iB4) | ((-128) & iB4));
                            int i87 = ((i85 & i86) | (i85 ^ i86)) * 217;
                            int i88 = ((i82 | i87) << 1) - (i82 ^ i87);
                            int i89 = ~((i83 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i83 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                            int i90 = g;
                            int i91 = i90 + 95;
                            asBinder = i91 % 128;
                            if (i91 % 2 == 0) {
                                int i92 = i88 % (((~((i83 & iB4) | (i83 ^ iB4))) | i89) * 217);
                                int i93 = -(217 << (i80 | (~((~iB4) | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT))));
                                i11 = (i92 & i93) + (i93 | i92);
                                bArr = new byte[17];
                            } else {
                                int i94 = ~((iB4 & i83) | (i83 ^ iB4));
                                int i95 = ((i94 & i89) | (i89 ^ i94)) * 217;
                                int i96 = (i88 & i95) + (i95 | i88);
                                int i97 = ~((-128) | i84);
                                i11 = i96 + (((i80 & i97) | (i80 ^ i97)) * 217);
                                bArr = new byte[17];
                            }
                            // fill-array-data instruction
                            bArr[0] = -110;
                            bArr[1] = -119;
                            bArr[2] = -104;
                            bArr[3] = -105;
                            bArr[4] = -106;
                            bArr[5] = -120;
                            bArr[6] = -119;
                            bArr[7] = -116;
                            bArr[8] = -119;
                            bArr[9] = -102;
                            bArr[10] = -126;
                            bArr[11] = -120;
                            bArr[12] = -126;
                            bArr[13] = -103;
                            bArr[14] = -116;
                            bArr[15] = -119;
                            bArr[16] = -121;
                            int i98 = ((i90 | 29) << 1) - (i90 ^ 29);
                            asBinder = i98 % 128;
                            int i99 = i98 % 2;
                            Object[] objArr18 = new Object[1];
                            d(null, null, i11, bArr, objArr18);
                            Object[] objArr19 = (Object[]) cls7.getMethod((String) objArr18[0], null).invoke(method3, null);
                            if (objArr19.length == 2) {
                                int i100 = asBinder + 29;
                                g = i100 % 128;
                                if (i100 % 2 != 0) {
                                    if (!Long.TYPE.equals(objArr19[1])) {
                                        continue;
                                    } else {
                                        int i101 = g + 57;
                                        asBinder = i101 % 128;
                                        int i102 = i101 % 2;
                                        byte modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
                                        int iB5 = setAspectRatio.AnonymousClass6.b();
                                        int i103 = modifierMetaStateMask * (-244);
                                        int i104 = ((i103 | 31488) << 1) - (i103 ^ 31488);
                                        int i105 = ~iB5;
                                        int i106 = ~((i105 & (-129)) | ((-129) ^ i105));
                                        int i107 = ~(((-129) ^ modifierMetaStateMask) | ((-129) & modifierMetaStateMask));
                                        int i108 = ((i106 & i107) | (i106 ^ i107)) * (-245);
                                        int i109 = (i104 ^ i108) + ((i108 & i104) << 1);
                                        int i110 = -(-((~(((-129) ^ iB5) | ((-129) & iB5))) * (-245)));
                                        int i111 = ((i109 | i110) << 1) - (i110 ^ i109);
                                        int i112 = ~(((-129) & iB5) | ((-129) ^ iB5));
                                        int i113 = ((i112 & modifierMetaStateMask) | (modifierMetaStateMask ^ i112)) * 245;
                                        objArr2 = new Object[1];
                                        d(null, null, (i111 ^ i113) + ((i113 & i111) << 1), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr2);
                                        if (Class.forName((String) objArr2[0]).equals(objArr19[1])) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char c2 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                                int gidForName = Process.getGidForName("") + 2824;
                                                int i114 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23;
                                                byte[] bArr4 = $$d;
                                                byte b6 = bArr4[7];
                                                Object[] objArr20 = new Object[1];
                                                c(b6, b6, bArr4[10], objArr20);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, gidForName, i114, 1814927978, false, (String) objArr20[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method3);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                                                int mirror = AndroidCharacter.getMirror('0') + 2775;
                                                int offsetAfter = 22 - TextUtils.getOffsetAfter("", 0);
                                                byte[] bArr5 = $$d;
                                                byte b7 = bArr5[7];
                                                Object[] objArr21 = new Object[1];
                                                c(b7, b7, bArr5[10], objArr21);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, mirror, offsetAfter, 1814927978, false, (String) objArr21[0], null);
                                            }
                                            try {
                                                Object[] objArr22 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
                                                    int iLastIndexOf3 = 2822 - TextUtils.lastIndexOf("", '0', 0);
                                                    int defaultSize = 22 - View.getDefaultSize(0, 0);
                                                    byte[] bArr6 = $$d;
                                                    byte b8 = bArr6[5];
                                                    Object[] objArr23 = new Object[1];
                                                    c(b8, b8, bArr6[7], objArr23);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionGroup2, iLastIndexOf3, defaultSize, -2137287382, false, (String) objArr23[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr22)).longValue();
                                                int i115 = g;
                                                int i116 = (i115 & 71) + (i115 | 71);
                                                asBinder = i116 % 128;
                                                int i117 = i116 % 2;
                                                break;
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                } else if (Long.TYPE.equals(objArr19[0])) {
                                    int i1010 = g + 57;
                                    asBinder = i1010 % 128;
                                    int i1011 = i1010 % 2;
                                    byte modifierMetaStateMask2 = (byte) KeyEvent.getModifierMetaStateMask();
                                    int iB6 = setAspectRatio.AnonymousClass6.b();
                                    int i1012 = modifierMetaStateMask2 * (-244);
                                    int i1013 = ((i1012 | 31488) << 1) - (i1012 ^ 31488);
                                    int i1014 = ~iB6;
                                    int i1015 = ~((i1014 & (-129)) | ((-129) ^ i1014));
                                    int i1016 = ~(((-129) ^ modifierMetaStateMask2) | ((-129) & modifierMetaStateMask2));
                                    int i1017 = ((i1015 & i1016) | (i1015 ^ i1016)) * (-245);
                                    int i1018 = (i1013 ^ i1017) + ((i1017 & i1013) << 1);
                                    int i118 = -(-((~(((-129) ^ iB6) | ((-129) & iB6))) * (-245)));
                                    int i119 = ((i1018 | i118) << 1) - (i118 ^ i1018);
                                    int i1110 = ~(((-129) & iB6) | ((-129) ^ iB6));
                                    int i1111 = ((i1110 & modifierMetaStateMask2) | (modifierMetaStateMask2 ^ i1110)) * 245;
                                    objArr2 = new Object[1];
                                    d(null, null, (i119 ^ i1111) + ((i1111 & i119) << 1), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr2);
                                    if (Class.forName((String) objArr2[0]).equals(objArr19[1])) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char c3 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                            int gidForName2 = Process.getGidForName("") + 2824;
                                            int i1112 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23;
                                            byte[] bArr7 = $$d;
                                            byte b9 = bArr7[7];
                                            Object[] objArr24 = new Object[1];
                                            c(b9, b9, bArr7[10], objArr24);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, gidForName2, i1112, 1814927978, false, (String) objArr24[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method3);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                                            int mirror2 = AndroidCharacter.getMirror('0') + 2775;
                                            int offsetAfter2 = 22 - TextUtils.getOffsetAfter("", 0);
                                            byte[] bArr8 = $$d;
                                            byte b10 = bArr8[7];
                                            Object[] objArr25 = new Object[1];
                                            c(b10, b10, bArr8[10], objArr25);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf2, mirror2, offsetAfter2, 1814927978, false, (String) objArr25[0], null);
                                        }
                                        Object[] objArr26 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char packedPositionGroup3 = (char) ExpandableListView.getPackedPositionGroup(0L);
                                            int iLastIndexOf4 = 2822 - TextUtils.lastIndexOf("", '0', 0);
                                            int defaultSize2 = 22 - View.getDefaultSize(0, 0);
                                            byte[] bArr9 = $$d;
                                            byte b11 = bArr9[5];
                                            Object[] objArr27 = new Object[1];
                                            c(b11, b11, bArr9[7], objArr27);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionGroup3, iLastIndexOf4, defaultSize2, -2137287382, false, (String) objArr27[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr26)).longValue();
                                        int i1113 = g;
                                        int i1114 = (i1113 & 71) + (i1113 | 71);
                                        asBinder = i1114 % 128;
                                        int i1115 = i1114 % 2;
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
                    i18 = (i18 & (-102)) + (i18 | (-102)) + 103;
                    int i120 = asBinder;
                    int i121 = (i120 & 101) + (i120 | 101);
                    g = i121 % 128;
                    int i122 = i121 % 2;
                    length = i56;
                    declaredMethods = methodArr2;
                    i12 = 2;
                    c = '0';
                    i16 = 1;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char c4 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int defaultSize3 = 2823 - View.getDefaultSize(0, 0);
            int iLastIndexOf5 = TextUtils.lastIndexOf("", '0', 0) + 23;
            byte[] bArr10 = $$d;
            byte b12 = bArr10[7];
            Object[] objArr28 = new Object[1];
            c(b12, b12, bArr10[10], objArr28);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c4, defaultSize3, iLastIndexOf5, 1814927978, false, (String) objArr28[0], null);
        }
        Object[] objArr29 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 2823;
            int i123 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21;
            byte b13 = $$d[5];
            byte b14 = b13;
            Object[] objArr30 = new Object[1];
            c(b13, b14, (byte) (b14 + 4), objArr30);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(jumpTapTimeout, longPressTimeout, i123, 1025296417, false, (String) objArr30[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr29);
        Object[] objArr31 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char mode = (char) (View.MeasureSpec.getMode(0) + 37657);
            int iIndexOf2 = 2719 - TextUtils.indexOf((CharSequence) "", '0');
            int iIndexOf3 = 18 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            byte b15 = $$d[5];
            byte b16 = b15;
            Object[] objArr32 = new Object[1];
            c(b15, b16, (byte) (b16 + 4), objArr32);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(mode, iIndexOf2, iIndexOf3, -1568796068, false, (String) objArr32[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr31)).longValue();
        int i124 = asBinder;
        int i125 = (i124 & 71) + (i124 | 71);
        g = i125 % 128;
        if (i125 % 2 != 0) {
            long j2 = -1510319033;
            long j3 = -712;
            long j4 = -1;
            long j5 = jLongValue ^ j4;
            long jNextInt = new Random().nextInt();
            long j6 = jNextInt ^ j4;
            long j7 = (j6 | j2) ^ j4;
            j = (((long) (-711)) * j2) + (((long) 713) * jLongValue) + ((((j5 | j2) ^ j4) | j7) * j3) + (j3 * ((((j5 | j6) | j2) ^ j4) | ((jNextInt | (jLongValue | j2)) ^ j4))) + (((long) 712) * (j5 | j7)) + ((long) (-300086812));
            i = (int) (j << 116);
            int iNextInt = new Random().nextInt();
            int i126 = ~iNextInt;
            int i127 = (~(993981557 | i126)) | 1140851082 | (~((-1863759328) | i126));
            i2 = (-789964810) + (((~(iNextInt | (-271073313))) | i127) * 590) + (i127 * (-1180)) + (((~(1863759327 | i126)) | (~(i126 | (-993981558)))) * 590);
        } else {
            long j8 = -1586958941;
            long j9 = -518;
            long j10 = (j9 * j8) + (j9 * jLongValue);
            long j11 = 519;
            long j12 = -1;
            long startUptimeMillis = (int) Process.getStartUptimeMillis();
            long j13 = (j8 ^ j12) | (startUptimeMillis ^ j12);
            j = j10 + ((jLongValue | (j13 ^ j12)) * j11) + (((long) (-519)) * (((j13 | jLongValue) ^ j12) | (((j8 | jLongValue) | startUptimeMillis) ^ j12))) + (j11 * (((jLongValue | startUptimeMillis) ^ j12) | j8)) + ((long) (-223446904));
            i = (int) (j >> 32);
            int i128 = (int) Runtime.getRuntime().totalMemory();
            int i129 = ~((-157153714) | (~i128));
            i2 = (((~(i128 | 1298004985)) | i129) * 338) + ((1140851272 | i129 | (~(157153713 | i128))) * (-338)) + 497899706;
        }
        int i130 = i & i2;
        int iMyPid = Process.myPid();
        int i131 = ((int) j) & (405138792 + ((~(1515427787 | iMyPid)) * (-301)) + (((~((-1481872331) | iMyPid)) | (~((~iMyPid) | 1375868555))) * (-301)) + (((~(iMyPid | (-1375868556))) | (-1481872331)) * 301));
        int i132 = (i130 & i131) | (i130 ^ i131);
        int i133 = i132 >>> 24;
        int i134 = i132 & ViewCompat.MEASURED_SIZE_MASK;
        if (i133 != 0) {
            int i135 = g;
            int i136 = i135 + 51;
            asBinder = i136 % 128;
            z = i136 % 2 != 0;
            int i137 = (i135 & 107) + (i135 | 107);
            asBinder = i137 % 128;
            i3 = 2;
            int i138 = i137 % 2;
        } else {
            i3 = 2;
            z = false;
        }
        if (z) {
            int i139 = asBinder + 59;
            g = i139 % 128;
            int i140 = i139 % i3;
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (!z || i134 >= i3) {
            string = null;
        } else {
            int i141 = g + 61;
            int i142 = i141 % 128;
            asBinder = i142;
            int i143 = i141 % i3;
            Method method4 = methodArr[i134];
            if (method4 != null) {
                int i144 = (i142 & 9) + (i142 | 9);
                g = i144 % 128;
                int i145 = i144 % 2;
                string = method4.toString();
                int i146 = g;
                int i147 = ((i146 | 21) << 1) - (i146 ^ 21);
                asBinder = i147 % 128;
                int i148 = i147 % 2;
            } else {
                string = null;
            }
        }
        list.add(string);
        return ((i133 ^ 6) + ((i133 & 6) << 1)) * i4;
    }

    private static String $$g(int i, byte b2, byte b3) {
        int i2 = b2 + 4;
        int i3 = b3 * 4;
        int i4 = i + 67;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i4 += -i5;
        }
        while (true) {
            i2++;
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i4 += -bArr[i2];
        }
    }
}
