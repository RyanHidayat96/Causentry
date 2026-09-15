package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
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
import com.midtrans.sdk.uikit.scancard.ScannerModel;
import com.scottyab.rootbeer.RootBeerNative;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

/* JADX INFO: loaded from: classes6.dex */
public final class getCollectionUri {
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
    private final Context b;
    private static final byte[] $$c = {70, -114, 113, 8};
    private static final int $$f = 87;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {41, 2, 45, -60, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 199;
    private static final byte[] $$a = {14, 70, 6, -35, -19, 19, 2};
    private static final int $$b = 227;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {59803, 59438, 59436, 59425, 59427, 59422, 59890, 59398, 59436, 59435, 59439, 59438, 59434, 59436, 59399, 59405, 59437, 59432, 59433, 59394, 59400, 59436, 59436, 59434, 59730, 59833, 59808, 59820, 59820, 59820, 59821, 59810, 59797, 59819, 59815, 59821, 59734, 59832, 59814, 59834, 59835, 59815, 59832, 59794, 59790, 59821, 59834, 59813, 59812, 59812, 59812, 59832, 59837, 59814, 59832, 59832, 59780, 59806, 59813, 59812, 59833, 59801, 59705, 59750, 59748, 59749, 59745, 59740, 59755, 59749, 59724, 59780, 59780, 59800, 59798, 59780, 59777, 59794, 59799, 59798, 59806, 59791, 59783, 59750, 59864, 59846, 59871, 59864, 59866, 59856, 59846, 59841, 59865, 59864, 59864, 59867, 59845, 59867, 59867, 59828};

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 3
            int r6 = 3 - r6
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r5 = r5 * 3
            int r5 = 101 - r5
            byte[] r0 = defpackage.getCollectionUri.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L28:
            r4 = r0[r6]
        L2a:
            int r4 = -r4
            int r5 = r5 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getCollectionUri.a(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = 103 - r6
            int r5 = r5 * 52
            int r0 = r5 + 1
            byte[] r1 = defpackage.getCollectionUri.$$d
            int r7 = r7 * 52
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r5
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            r3 = r1[r7]
        L26:
            int r7 = r7 + 1
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getCollectionUri.c(short, short, short, java.lang.Object[]):void");
    }

    public getCollectionUri(Context context) {
        this.b = context;
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        int i = 2 % 2;
        String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternalBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int length = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            String str2 = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[i2];
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            String string = sb.toString();
            if (new File(str2, str).exists()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" binary detected!");
                String string2 = sb2.toString();
                setContentResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                String.valueOf(string2);
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
                TuitionPaymentFragmentbindingInflater1 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 4 % 4;
                }
                z = true;
            }
            i2++;
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
        }
        return z;
    }

    private static void d(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c;
        int length;
        char[] cArr2;
        int i;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        char c2 = 0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (cArr3 != null) {
            int i7 = $10 + 29;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i = 0;
            }
            while (i < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[c2] = Integer.valueOf(cArr3[i]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int fadingEdgeLength = 1270 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 18;
                        byte b = (byte) ($$f & 13);
                        byte b2 = (byte) (b - 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, fadingEdgeLength, packedPositionGroup, 407021364, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr2[i] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i++;
                    c2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr3, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i8 = $11 + 19;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr = new char[i4];
                c = 0;
                setvideostabilizationmode.b = 0;
            } else {
                cArr = new char[i4];
                setvideostabilizationmode.b = 0;
                c = 0;
            }
            while (setvideostabilizationmode.b < i4) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i9 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", ""), 3224 - TextUtils.lastIndexOf("", '0'), 13 - (ViewConfiguration.getScrollBarSize() >> 8), 2133916302, false, $$g((byte) ($$f & 14), b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i10 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 29944);
                        int iGreen = Color.green(0) + 1755;
                        int i11 = 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte length2 = (byte) $$c.length;
                        byte b4 = (byte) (length2 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(absoluteGravity, iGreen, i11, 387247676, false, $$g(length2, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    int i12 = $10 + 53;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                }
                c = cArr[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 41241), View.resolveSizeAndState(0, 0, 0) + 1705, 20 - TextUtils.lastIndexOf("", '0'), -1434471773, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr4, 0, cArr5, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr4, i14, i6);
            System.arraycopy(cArr5, i6, cArr4, 0, i14);
        }
        if (z) {
            int i15 = $10 + 17;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr6 = new char[i4];
            int i17 = 0;
            loop2: while (true) {
                setvideostabilizationmode.b = i17;
                while (true) {
                    if (setvideostabilizationmode.b >= i4) {
                        break loop2;
                    }
                    int i18 = $11 + 25;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        cArr6[setvideostabilizationmode.b] = cArr4[(setvideostabilizationmode.b + i4) >>> 1];
                        setvideostabilizationmode.b--;
                    } else {
                        cArr6[setvideostabilizationmode.b] = cArr4[(i4 - setvideostabilizationmode.b) - 1];
                        i17 = setvideostabilizationmode.b + 1;
                    }
                }
            }
            cArr4 = cArr6;
        }
        if (i5 > 0) {
            int i19 = 0;
            while (true) {
                setvideostabilizationmode.b = i19;
                if (setvideostabilizationmode.b >= i4) {
                    break;
                }
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                i19 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x034f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0223  */
    /* JADX WARN: Code duplicated, block: B:35:0x024e  */
    /* JADX WARN: Code duplicated, block: B:38:0x029f  */
    /* JADX WARN: Code duplicated, block: B:42:0x02fa A[Catch: all -> 0x0582, TryCatch #0 {all -> 0x0582, blocks: (B:40:0x02e5, B:42:0x02fa, B:43:0x0342, B:55:0x03b5, B:57:0x03c2, B:58:0x0401, B:60:0x041e, B:61:0x046a), top: B:96:0x02e5 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x053f  */
    public final String[] TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws Throwable {
        int i;
        int i2;
        String string;
        Method method;
        Method[] declaredMethods;
        int length;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i3 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Class<?>[] clsArr = null;
        int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        byte b = (byte) 0;
        byte b2 = b;
        Object[] objArr2 = new Object[1];
        a(b, b2, b2, objArr2);
        Method[] methodArr = {Runtime.class.getMethod((String) objArr2[0], String.class)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
            int iAxisFromString = MotionEvent.axisFromString("") + 2824;
            int iMyTid = 22 - (Process.myTid() >> 22);
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            c(bArr[5], bArr[10], bArr[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetAfter, iAxisFromString, iMyTid, 1814927978, false, (String) objArr3[0], null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
        int i4 = 16;
        int i5 = 24;
        if (obj == null) {
            int i6 = TuitionPaymentFragmentbindingInflater1 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            if (i6 % 2 != 0) {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), Color.argb(0, 0, 0, 0) + 2823, ((byte) KeyEvent.getModifierMetaStateMask()) + 23)).getDeclaredMethods();
                length = declaredMethods.length;
            } else {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2823 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getEdgeSlop() >> 16) + 22)).getDeclaredMethods();
                length = declaredMethods.length;
            }
            int i7 = 0;
            while (i7 < length) {
                Method method2 = declaredMethods[i7];
                try {
                    byte[] bArr2 = new byte[i5];
                    // fill-array-data instruction
                    bArr2[0] = 0;
                    bArr2[1] = 1;
                    bArr2[2] = 1;
                    bArr2[3] = 0;
                    bArr2[4] = 1;
                    bArr2[5] = 0;
                    bArr2[6] = 1;
                    bArr2[7] = 0;
                    bArr2[8] = 1;
                    bArr2[9] = 0;
                    bArr2[10] = 1;
                    bArr2[11] = 0;
                    bArr2[12] = 1;
                    bArr2[13] = 1;
                    bArr2[14] = 0;
                    bArr2[15] = 1;
                    bArr2[16] = 1;
                    bArr2[17] = 1;
                    bArr2[18] = 1;
                    bArr2[19] = 0;
                    bArr2[20] = 1;
                    bArr2[21] = 1;
                    bArr2[22] = 1;
                    bArr2[23] = 1;
                    Object[] objArr4 = new Object[1];
                    d(new int[]{0, i5, 188, 0}, true, bArr2, objArr4);
                    Class<?> cls = Class.forName((String) objArr4[0]);
                    Object[] objArr5 = new Object[1];
                    d(new int[]{i5, 12, 64, 0}, true, new byte[]{1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0}, objArr5);
                    Object[] objArr6 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr5[0], clsArr).invoke(method2, clsArr)).intValue())};
                    Object[] objArr7 = new Object[1];
                    d(new int[]{36, 26, 72, i4}, false, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr7);
                    Class<?> cls2 = Class.forName((String) objArr7[0]);
                    Object[] objArr8 = new Object[1];
                    d(new int[]{62, 8, 0, 0}, true, new byte[]{1, 1, 1, 1, 1, 1, 1, 0}, objArr8);
                    if (((Boolean) cls2.getMethod((String) objArr8[0], Integer.TYPE).invoke(clsArr, objArr6)).booleanValue()) {
                        Class cls3 = Long.TYPE;
                        Object[] objArr9 = new Object[1];
                        d(new int[]{0, 24, 188, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr9);
                        Class<?> cls4 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        d(new int[]{70, 13, 41, 2}, true, new byte[]{0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0}, objArr10);
                        if (cls3.equals(cls4.getMethod((String) objArr10[0], null).invoke(method2, null))) {
                            Object[] objArr11 = new Object[1];
                            d(new int[]{0, 24, 188, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr11);
                            Class<?> cls5 = Class.forName((String) objArr11[0]);
                            Object[] objArr12 = new Object[1];
                            d(new int[]{83, 17, 103, 3}, true, new byte[]{1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1}, objArr12);
                            Object[] objArr13 = (Object[]) cls5.getMethod((String) objArr12[0], null).invoke(method2, null);
                            if (objArr13.length == 2) {
                                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
                                TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                                if (i8 % 2 == 0) {
                                    if (Long.TYPE.equals(objArr13[0])) {
                                        objArr = new Object[1];
                                        d(new int[]{0, 24, 188, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr);
                                        if (Class.forName((String) objArr[0]).equals(objArr13[1])) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                                                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2823;
                                                int offsetBefore = 22 - TextUtils.getOffsetBefore("", 0);
                                                byte[] bArr3 = $$d;
                                                Object[] objArr14 = new Object[1];
                                                c(bArr3[5], bArr3[10], bArr3[7], objArr14);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, minimumFlingVelocity, offsetBefore, 1814927978, false, (String) objArr14[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                int trimmedLength = 2823 - TextUtils.getTrimmedLength("");
                                                int size = 22 - View.MeasureSpec.getSize(0);
                                                byte[] bArr4 = $$d;
                                                Object[] objArr15 = new Object[1];
                                                c(bArr4[5], bArr4[10], bArr4[7], objArr15);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, trimmedLength, size, 1814927978, false, (String) objArr15[0], null);
                                            }
                                            try {
                                                Object[] objArr16 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                                                    int iIndexOf = 2822 - TextUtils.indexOf((CharSequence) "", '0', 0);
                                                    int iArgb = 22 - Color.argb(0, 0, 0, 0);
                                                    byte[] bArr5 = $$d;
                                                    byte b3 = bArr5[7];
                                                    Object[] objArr17 = new Object[1];
                                                    c(b3, b3, bArr5[5], objArr17);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iIndexOf, iArgb, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr16)).longValue();
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
                                } else if (Long.TYPE.equals(objArr13[0])) {
                                    objArr = new Object[1];
                                    d(new int[]{0, 24, 188, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr);
                                    if (Class.forName((String) objArr[0]).equals(objArr13[1])) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                                            int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2823;
                                            int offsetBefore2 = 22 - TextUtils.getOffsetBefore("", 0);
                                            byte[] bArr6 = $$d;
                                            Object[] objArr18 = new Object[1];
                                            c(bArr6[5], bArr6[10], bArr6[7], objArr18);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf2, minimumFlingVelocity2, offsetBefore2, 1814927978, false, (String) objArr18[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                            int trimmedLength2 = 2823 - TextUtils.getTrimmedLength("");
                                            int size2 = 22 - View.MeasureSpec.getSize(0);
                                            byte[] bArr7 = $$d;
                                            Object[] objArr19 = new Object[1];
                                            c(bArr7[5], bArr7[10], bArr7[7], objArr19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, trimmedLength2, size2, 1814927978, false, (String) objArr19[0], null);
                                        }
                                        Object[] objArr110 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char c4 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                                            int iIndexOf2 = 2822 - TextUtils.indexOf((CharSequence) "", '0', 0);
                                            int iArgb2 = 22 - Color.argb(0, 0, 0, 0);
                                            byte[] bArr8 = $$d;
                                            byte b4 = bArr8[7];
                                            Object[] objArr111 = new Object[1];
                                            c(b4, b4, bArr8[5], objArr111);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c4, iIndexOf2, iArgb2, -2137287382, false, (String) objArr111[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr110)).longValue();
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
                    i7++;
                    clsArr = null;
                    i5 = 24;
                    i4 = 16;
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
            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
            int i9 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2823;
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22;
            byte[] bArr9 = $$d;
            Object[] objArr20 = new Object[1];
            c(bArr9[5], bArr9[10], bArr9[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionType, i9, scrollDefaultDelay, 1814927978, false, (String) objArr20[0], null);
        }
        Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char mode = (char) View.MeasureSpec.getMode(0);
            int i10 = 2824 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int maximumDrawingCacheSize = 22 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte[] bArr10 = $$d;
            byte b5 = bArr10[7];
            Object[] objArr22 = new Object[1];
            c(b5, (byte) (b5 + 5), bArr10[5], objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode, i10, maximumDrawingCacheSize, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
        Object[] objArr23 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c5 = (char) (37658 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int bitsPerPixel = 2719 - ImageFormat.getBitsPerPixel(0);
            int iMyPid = 19 - (Process.myPid() >> 22);
            byte[] bArr11 = $$d;
            byte b6 = bArr11[7];
            Object[] objArr24 = new Object[1];
            c(b6, (byte) (b6 + 5), bArr11[5], objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c5, bitsPerPixel, iMyPid, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
        long j = -546485902;
        long j2 = (((long) (-1335)) * j) + (((long) (-667)) * jLongValue);
        long j3 = -1;
        long j4 = jLongValue ^ j3;
        long jMyPid = Process.myPid();
        long j5 = j | jMyPid;
        long j6 = j2 + (((long) (-668)) * (j4 | (j5 ^ j3))) + (((long) 1336) * (j | ((j4 | jMyPid) ^ j3))) + (((long) 668) * (j5 | j4)) + ((long) (-1263919943));
        int iIdentityHashCode = System.identityHashCode(this);
        int i11 = ((int) (j6 >> 32)) & ((-1153123274) + (((~iIdentityHashCode) | (-1380291921)) * 1444) + (((~(iIdentityHashCode | 1370715501)) | (~(66510909 | iIdentityHashCode)) | (-1408759166)) * (-1444)) + 138353568);
        int iNextInt = new Random().nextInt();
        int i12 = i11 | (((int) j6) & ((-501357939) + (((~((-1943173774) | iNextInt)) | 847391368) * 336) + (((~(914567112 | iNextInt)) | (-2010349518)) * (-168)) + (((~((~iNextInt) | 914567112)) | (-1943173774)) * 168)));
        int i13 = i12 >>> 24;
        int i14 = i12 & ViewCompat.MEASURED_SIZE_MASK;
        boolean z = i13 != 0;
        if (z) {
            int i15 = TuitionPaymentFragmentbindingInflater1 + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
            i = 2;
            int i16 = i15 % 2;
            i2 = 1;
        } else {
            i = 2;
            i2 = 0;
        }
        if (z) {
            int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
            TuitionPaymentFragmentbindingInflater1 = i17 % 128;
            int i18 = i17 % i;
            if (i14 >= 1 || (method = methodArr[i14]) == null) {
                string = null;
            } else {
                string = method.toString();
            }
        } else {
            string = null;
        }
        arrayList.add(string);
        if ((i13 + 6) * i2 != 0) {
            throw new RuntimeException(String.valueOf(iIntValue));
        }
        try {
            InputStream inputStream = Runtime.getRuntime().exec("getprop").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0524  */
    /* JADX WARN: Code duplicated, block: B:76:0x053f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x0541 A[Catch: NoSuchElementException -> 0x0557, IOException | NoSuchElementException -> 0x0559, TRY_LEAVE, TryCatch #4 {IOException | NoSuchElementException -> 0x0559, blocks: (B:74:0x052f, B:78:0x0541), top: B:96:0x052f }] */
    /* JADX WARN: Code duplicated, block: B:85:0x055f  */
    /* JADX WARN: Code duplicated, block: B:96:0x052f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final String[] TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String string;
        InputStream inputStream;
        Method method;
        int i6 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        byte b = (byte) 0;
        byte b2 = b;
        Object[] objArr = new Object[1];
        a(b, b2, b2, objArr);
        Method[] methodArr = {Runtime.class.getMethod((String) objArr[0], String.class)};
        int i7 = -2001519171;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char mode = (char) View.MeasureSpec.getMode(0);
            int deadChar = 2823 - KeyEvent.getDeadChar(0, 0);
            int i8 = 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            c(bArr[5], bArr[10], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mode, deadChar, i8, 1814927978, false, (String) objArr2[0], null);
        }
        int i9 = 8;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) != null) {
            i = i7;
            break;
        }
        Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) KeyEvent.getDeadChar(0, 0), 2823 - View.resolveSize(0, 0), 22 - Color.red(0))).getDeclaredMethods();
        int length = declaredMethods.length;
        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        TuitionPaymentFragmentbindingInflater1 = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                i = i7;
                break;
            }
            Method method2 = declaredMethods[i12];
            try {
                Object[] objArr3 = new Object[1];
                d(new int[]{0, 24, 188, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                d(new int[]{24, 12, 64, 0}, true, new byte[]{1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0}, objArr4);
                Object[] objArr5 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr4[0], null).invoke(method2, null)).intValue())};
                Object[] objArr6 = new Object[1];
                d(new int[]{36, 26, 72, 16}, false, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr6);
                Class<?> cls2 = Class.forName((String) objArr6[0]);
                int[] iArr = {62, i9, 0, 0};
                byte[] bArr2 = new byte[i9];
                // fill-array-data instruction
                bArr2[0] = 1;
                bArr2[1] = 1;
                bArr2[2] = 1;
                bArr2[3] = 1;
                bArr2[4] = 1;
                bArr2[5] = 1;
                bArr2[6] = 1;
                bArr2[7] = 0;
                Object[] objArr7 = new Object[1];
                d(iArr, true, bArr2, objArr7);
                if (((Boolean) cls2.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).booleanValue()) {
                    int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
                    TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                    int i14 = i13 % 2;
                    Class cls3 = Long.TYPE;
                    Object[] objArr8 = new Object[1];
                    d(new int[]{0, 24, 188, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr8);
                    Class<?> cls4 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    d(new int[]{70, 13, 41, 2}, true, new byte[]{0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0}, objArr9);
                    if (cls3.equals(cls4.getMethod((String) objArr9[0], null).invoke(method2, null))) {
                        Object[] objArr10 = new Object[1];
                        d(new int[]{0, 24, 188, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr10);
                        Class<?> cls5 = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        d(new int[]{83, 17, 103, 3}, true, new byte[]{1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1}, objArr11);
                        Object[] objArr12 = (Object[]) cls5.getMethod((String) objArr11[0], null).invoke(method2, null);
                        if (objArr12.length == 2 && Long.TYPE.equals(objArr12[0])) {
                            Object[] objArr13 = new Object[1];
                            d(new int[]{0, 24, 188, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr13);
                            if (Class.forName((String) objArr13[0]).equals(objArr12[1])) {
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                    int deadChar2 = KeyEvent.getDeadChar(0, 0) + 2823;
                                    int gidForName = Process.getGidForName("") + 23;
                                    byte[] bArr3 = $$d;
                                    Object[] objArr14 = new Object[1];
                                    c(bArr3[5], bArr3[10], bArr3[7], objArr14);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay, deadChar2, gidForName, 1814927978, false, (String) objArr14[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                    int i15 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2822;
                                    int size = 22 - View.MeasureSpec.getSize(0);
                                    byte[] bArr4 = $$d;
                                    Object[] objArr15 = new Object[1];
                                    c(bArr4[5], bArr4[10], bArr4[7], objArr15);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, i15, size, 1814927978, false, (String) objArr15[0], null);
                                }
                                try {
                                    Object[] objArr16 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        char defaultSize = (char) View.getDefaultSize(0, 0);
                                        int i16 = 2823 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 22;
                                        byte[] bArr5 = $$d;
                                        byte b3 = bArr5[7];
                                        Object[] objArr17 = new Object[1];
                                        c(b3, b3, bArr5[5], objArr17);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(defaultSize, i16, edgeSlop, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
                                    }
                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr16)).longValue();
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
                        }
                    } else {
                        continue;
                    }
                }
                i12++;
                i7 = -2001519171;
                i9 = 8;
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
            char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int iIndexOf = 2823 - TextUtils.indexOf("", "", 0);
            int i17 = 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            byte[] bArr6 = $$d;
            Object[] objArr18 = new Object[1];
            c(bArr6[5], bArr6[10], bArr6[7], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iIndexOf, i17, 1814927978, false, (String) objArr18[0], null);
        }
        Object[] objArr19 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
            int i18 = 2823 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int iLastIndexOf = 21 - TextUtils.lastIndexOf("", '0', 0);
            byte[] bArr7 = $$d;
            byte b4 = bArr7[7];
            Object[] objArr20 = new Object[1];
            c(b4, (byte) (b4 + 5), bArr7[5], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAxisFromString, i18, iLastIndexOf, 1025296417, false, (String) objArr20[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr19);
        Object[] objArr21 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c2 = (char) (37658 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int touchSlop = 2720 - (ViewConfiguration.getTouchSlop() >> 8);
            int offsetBefore = 19 - TextUtils.getOffsetBefore("", 0);
            byte[] bArr8 = $$d;
            byte b5 = bArr8[7];
            Object[] objArr22 = new Object[1];
            c(b5, (byte) (b5 + 5), bArr8[5], objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, touchSlop, offsetBefore, -1568796068, false, (String) objArr22[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr21)).longValue();
        long j = -1634171279;
        long j2 = 764;
        long j3 = -1;
        long jIdentityHashCode = ((long) System.identityHashCode(this)) ^ j3;
        long j4 = (jIdentityHashCode | j) ^ j3;
        long j5 = ((j ^ j3) | jLongValue) ^ j3;
        long j6 = (((long) 765) * j) + (((long) (-1527)) * jLongValue) + ((jLongValue | j4) * j2) + (((long) (-1528)) * (j5 | ((jIdentityHashCode | jLongValue) ^ j3))) + (j2 * (j5 | (((jLongValue ^ j3) | j) ^ j3) | j4)) + ((long) (-176234566));
        int iIdentityHashCode = System.identityHashCode(this);
        int i19 = ~iIdentityHashCode;
        int i20 = ((int) (j6 >> 32)) & (635053406 + (((~((-84238318) | i19)) | (~((-1352988094) | iIdentityHashCode))) * (-370)) + (((~(iIdentityHashCode | (-84238318))) | (~(i19 | (-1352988094))) | (-1436942334)) * (-370)) + 907281124);
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i21 = ~iIdentityHashCode2;
        int i22 = (-659150259) + (((~(180881299 | i21)) | (-1794793408)) * (-1188));
        int i23 = (~(iIdentityHashCode2 | (-180881300))) | (-1794793408);
        int i24 = ~((-1618107710) | i21);
        int i25 = i20 | (((int) j6) & (i22 + ((i23 | i24) * 594) + (((~((-180881300) | i21)) | 4195601 | i24) * 594)));
        int i26 = i25 >>> 24;
        int i27 = i25 & ViewCompat.MEASURED_SIZE_MASK;
        if (i26 != 0) {
            int i28 = TuitionPaymentFragmentbindingInflater1 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 % 128;
            i2 = 2;
            int i29 = i28 % 2;
            i3 = 1;
        } else {
            i2 = 2;
            i3 = 0;
        }
        if (i3 != 0) {
            int i30 = TuitionPaymentFragmentbindingInflater1 + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i30 % 128;
            if (i30 % i2 == 0) {
                i4 = 1;
                i5 = 1;
            }
            if ((i3 ^ i4) != i4 || i27 >= i4 || (method = methodArr[i27]) == null) {
                string = null;
            } else {
                string = method.toString();
            }
            arrayList.add(string);
            if ((i26 + 6) * i5 == 0) {
                throw null;
            }
            try {
                inputStream = Runtime.getRuntime().exec("mount").getInputStream();
                if (inputStream == null) {
                    return null;
                }
                return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
            } catch (IOException | NoSuchElementException e2) {
                e2.printStackTrace();
                return null;
            }
        }
        int i31 = TuitionPaymentFragmentbindingInflater1 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i31 % 128;
        int i32 = i31 % i2;
        i4 = 1;
        i5 = 0;
        if ((i3 ^ i4) != i4) {
            string = null;
        } else {
            string = null;
        }
        arrayList.add(string);
        if ((i26 + 6) * i5 == 0) {
            throw null;
        }
        inputStream = Runtime.getRuntime().exec("mount").getInputStream();
        if (inputStream == null) {
            return null;
        }
        return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<String> list) {
        int i = 2 % 2;
        PackageManager packageManager = this.b.getPackageManager();
        boolean z = false;
        for (String str : list) {
            try {
                int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
                if (ScannerModel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ArrayList()) != 0) {
                    throw new RuntimeException(String.valueOf(iIntValue));
                }
                packageManager.getPackageInfo(str, 0);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" ROOT management app detected!");
                setContentResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sb.toString());
                int i2 = TuitionPaymentFragmentbindingInflater1 + 31;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return z;
    }

    public final boolean b() throws Throwable {
        boolean z;
        int i;
        String string;
        Process processExec;
        Method method;
        int i2 = 2;
        int i3 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Class<?>[] clsArr = null;
        int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        byte b = (byte) 0;
        byte b2 = b;
        Object[] objArr = new Object[1];
        a(b, b2, b2, objArr);
        Method[] methodArr = {Runtime.class.getMethod((String) objArr[0], String[].class)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        int i4 = 16;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSize = (char) View.resolveSize(0, 0);
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 2823;
            int fadingEdgeLength = 22 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            c(bArr[5], bArr[10], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSize, touchSlop, fadingEdgeLength, 1814927978, false, (String) objArr2[0], null);
        }
        try {
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
                Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) KeyEvent.keyCodeFromString(""), 2823 - (ViewConfiguration.getWindowTouchSlop() >> 8), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22)).getDeclaredMethods();
                int length = declaredMethods.length;
                int i5 = 0;
                while (i5 < length) {
                    int i6 = TuitionPaymentFragmentbindingInflater1 + 95;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                    int i7 = i6 % i2;
                    Method method2 = declaredMethods[i5];
                    try {
                        Object[] objArr3 = new Object[1];
                        d(new int[]{0, 24, 188, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr3);
                        Class<?> cls = Class.forName((String) objArr3[0]);
                        Object[] objArr4 = new Object[1];
                        d(new int[]{24, 12, 64, 0}, true, new byte[]{1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0}, objArr4);
                        Object[] objArr5 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr4[0], clsArr).invoke(method2, clsArr)).intValue())};
                        Object[] objArr6 = new Object[1];
                        d(new int[]{36, 26, 72, i4}, false, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr6);
                        Class<?> cls2 = Class.forName((String) objArr6[0]);
                        Object[] objArr7 = new Object[1];
                        d(new int[]{62, 8, 0, 0}, true, new byte[]{1, 1, 1, 1, 1, 1, 1, 0}, objArr7);
                        if (((Boolean) cls2.getMethod((String) objArr7[0], Integer.TYPE).invoke(clsArr, objArr5)).booleanValue()) {
                            Class cls3 = Long.TYPE;
                            Object[] objArr8 = new Object[1];
                            d(new int[]{0, 24, 188, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr8);
                            Class<?> cls4 = Class.forName((String) objArr8[0]);
                            Object[] objArr9 = new Object[1];
                            d(new int[]{70, 13, 41, 2}, true, new byte[]{0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0}, objArr9);
                            if (cls3.equals(cls4.getMethod((String) objArr9[0], null).invoke(method2, null))) {
                                Object[] objArr10 = new Object[1];
                                d(new int[]{0, 24, 188, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr10);
                                Class<?> cls5 = Class.forName((String) objArr10[0]);
                                Object[] objArr11 = new Object[1];
                                d(new int[]{83, 17, 103, 3}, true, new byte[]{1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1}, objArr11);
                                Object[] objArr12 = (Object[]) cls5.getMethod((String) objArr11[0], null).invoke(method2, null);
                                if (objArr12.length == 2 && Long.TYPE.equals(objArr12[0])) {
                                    int i8 = TuitionPaymentFragmentbindingInflater1 + 65;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                                    int i9 = i8 % 2;
                                    Object[] objArr13 = new Object[1];
                                    d(new int[]{0, 24, 188, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr13);
                                    if (Class.forName((String) objArr13[0]).equals(objArr12[1])) {
                                        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
                                        TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                                        if (i10 % 2 != 0) {
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cMyPid = (char) (Process.myPid() >> 22);
                                                int i11 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2822;
                                                int i12 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21;
                                                byte[] bArr2 = $$d;
                                                Object[] objArr14 = new Object[1];
                                                c(bArr2[5], bArr2[10], bArr2[7], objArr14);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, i11, i12, 1814927978, false, (String) objArr14[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 2823;
                                                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 22;
                                                byte[] bArr3 = $$d;
                                                Object[] objArr15 = new Object[1];
                                                c(bArr3[5], bArr3[10], bArr3[7], objArr15);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, absoluteGravity, threadPriority, 1814927978, false, (String) objArr15[0], null);
                                            }
                                            Object[] objArr16 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                int defaultSize = View.getDefaultSize(0, 0) + 2823;
                                                int i13 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21;
                                                byte[] bArr4 = $$d;
                                                byte b3 = bArr4[7];
                                                Object[] objArr17 = new Object[1];
                                                c(b3, b3, bArr4[5], objArr17);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(doubleTapTimeout, defaultSize, i13, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr16)).longValue();
                                            break;
                                        }
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                            char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2823;
                                            int modifierMetaStateMask = 21 - ((byte) KeyEvent.getModifierMetaStateMask());
                                            byte[] bArr5 = $$d;
                                            Object[] objArr18 = new Object[1];
                                            c(bArr5[5], bArr5[10], bArr5[7], objArr18);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, maximumFlingVelocity, modifierMetaStateMask, 1814927978, false, (String) objArr18[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, method2);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 2824;
                                            int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 23;
                                            byte[] bArr6 = $$d;
                                            Object[] objArr19 = new Object[1];
                                            c(bArr6[5], bArr6[10], bArr6[7], objArr19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatDelay, bitsPerPixel, bitsPerPixel2, 1814927978, false, (String) objArr19[0], null);
                                        }
                                        Object[] objArr20 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                            char size = (char) View.MeasureSpec.getSize(0);
                                            int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 2823;
                                            int iLastIndexOf = 21 - TextUtils.lastIndexOf("", '0', 0, 0);
                                            byte[] bArr7 = $$d;
                                            byte b4 = bArr7[7];
                                            Object[] objArr21 = new Object[1];
                                            c(b4, b4, bArr7[5], objArr21);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(size, absoluteGravity2, iLastIndexOf, -2137287382, false, (String) objArr21[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr20)).longValue();
                                        break;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        i5++;
                        i2 = 2;
                        clsArr = null;
                        i4 = 16;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int i14 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2823;
                int scrollBarSize = 22 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte[] bArr8 = $$d;
                Object[] objArr22 = new Object[1];
                c(bArr8[5], bArr8[10], bArr8[7], objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(keyRepeatDelay2, i14, scrollBarSize, 1814927978, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c3 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int iIndexOf = TextUtils.indexOf("", "") + 2823;
                int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 22;
                byte[] bArr9 = $$d;
                byte b5 = bArr9[7];
                Object[] objArr24 = new Object[1];
                c(b5, (byte) (b5 + 5), bArr9[5], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c3, iIndexOf, fadingEdgeLength2, 1025296417, false, (String) objArr24[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr23);
            Object[] objArr25 = {0, methodArr, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char defaultSize2 = (char) (37657 - View.getDefaultSize(0, 0));
                int i15 = 2720 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int iMyPid = (Process.myPid() >> 22) + 19;
                byte[] bArr10 = $$d;
                byte b6 = bArr10[7];
                Object[] objArr26 = new Object[1];
                c(b6, (byte) (b6 + 5), bArr10[5], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(defaultSize2, i15, iMyPid, -1568796068, false, (String) objArr26[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr25)).longValue();
            long j = -441265548;
            long j2 = 868;
            long j3 = -1;
            long j4 = j ^ j3;
            long jNextInt = new Random().nextInt();
            long j5 = jNextInt ^ j3;
            long j6 = jLongValue ^ j3;
            long j7 = j4 | j6;
            long j8 = (j2 * j) + (j2 * jLongValue) + (((long) (-867)) * (((j4 | j5) ^ j3) | ((j6 | j5) ^ j3))) + (((long) (-1734)) * ((j7 ^ j3) | ((j4 | jNextInt) ^ j3) | ((j6 | jNextInt) ^ j3))) + (((long) 867) * (((j7 | j5) ^ j3) | (((j4 | jLongValue) | jNextInt) ^ j3) | (j3 ^ ((j6 | j) | jNextInt)))) + ((long) (-1369140297));
            int iIdentityHashCode = System.identityHashCode(this);
            int i16 = ((int) (j8 >> 32)) & ((-2072279902) + ((~((~iIdentityHashCode) | (-847269030))) * (-116)) + (((-915492262) | iIdentityHashCode) * 116) + (((~(iIdentityHashCode | 1942248623)) | (-2010471856)) * 116));
            int i17 = (int) j8;
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i18 = i16 | (i17 & (((((~((-1073746086) | iIdentityHashCode2)) | 21120256) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 209449364) + ((~((~iIdentityHashCode2) | (-1073746086))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)));
            int i19 = i18 >>> 24;
            int i20 = i18 & ViewCompat.MEASURED_SIZE_MASK;
            if (i19 != 0) {
                int i21 = TuitionPaymentFragmentbindingInflater1 + 87;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 % 128;
                int i22 = i21 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 1;
            } else {
                int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
                TuitionPaymentFragmentbindingInflater1 = i23 % 128;
                int i24 = i23 % 2;
                i = 0;
            }
            if (!z || i20 >= 1 || (method = methodArr[i20]) == null) {
                string = null;
            } else {
                int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
                TuitionPaymentFragmentbindingInflater1 = i25 % 128;
                int i26 = i25 % 2;
                string = method.toString();
            }
            arrayList.add(string);
            if ((i19 + 6) * i != 0) {
                throw new RuntimeException(String.valueOf(iIntValue));
            }
            try {
                processExec = Runtime.getRuntime().exec(new String[]{"which", "su"});
                try {
                    boolean z2 = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null;
                    if (processExec != null) {
                        processExec.destroy();
                    }
                    return z2;
                } catch (Throwable unused) {
                    if (processExec != null) {
                        processExec.destroy();
                    }
                    return false;
                }
            } catch (Throwable unused2) {
                processExec = null;
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    public final boolean TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        new RootBeerNative();
        if (!RootBeerNative.b()) {
            setContentResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault3("We could not load the native library to test for root");
            return false;
        }
        String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternalBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int length = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[i2]);
            sb.append("su");
            strArr[i2] = sb.toString();
        }
        RootBeerNative rootBeerNative = new RootBeerNative();
        try {
            rootBeerNative.setLogDebugMessages(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            if (rootBeerNative.checkForRoot(strArr) > 0) {
                int i3 = TuitionPaymentFragmentbindingInflater1 + 43;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
        } catch (UnsatisfiedLinkError unused) {
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    private static String $$g(int i, byte b, byte b2) {
        int i2 = 3 - (b * 2);
        int i3 = 105 - i;
        int i4 = b2 * 3;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = i4 + (-i2);
            i2 = i2;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i2 + 1;
            i3 += -bArr[i7];
            i2 = i7;
            i5 = i6;
        }
    }
}
