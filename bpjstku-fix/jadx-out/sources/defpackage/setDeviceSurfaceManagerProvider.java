package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class setDeviceSurfaceManagerProvider implements getSensorToBufferTransform<InputStream> {
    private final CameraUnavailableException TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {89, 92, -72, 43};
    private static final int $$f = 27;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {22, 102, 43, -6, -10, 4, 65, -52, 5, -17, 21, -1, -9, 10, 59, -49, -11, 12, -12, 5, 8, 7, 56, -66, -1, 10, 65, -57, -3, -4, 17, -11, 6, 15, -9, 64, -52, -9, 4, 14, -6, -3, 66, -67, 18, -10, 1, 13, 57, -34, -33, 10, 46, -32, -15, 13, -4, 3, 29, -14, -10, 1, 13, 67, -77, 16, -7, 12, 37, -32, -15, 13, -4, 3, 76, -12, 16, -12, -31, 14, -9, 13, -4, 3, 32, -15, -22, 14, 10, -7, -4, 48, -42, 19, -4, -4, 10, -7, -4, 20, -5, -3, 12, -3, -3, 9, 32, -35, 10, -4, 13, -17, 17, -11, 67};
    private static final int $$e = 106;
    private static final byte[] $$a = {106, -22, 107, 95, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 143;
    private static int asInterface = 0;
    private static int d = 1;
    private static char b = 47823;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 24952;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 29825;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 29135;

    private static void a(byte b2, int i, int i2, Object[] objArr) {
        byte[] bArr = $$a;
        int i3 = 107 - (b2 * 52);
        int i4 = i2 * 15;
        int i5 = 84 - (i * 2);
        byte[] bArr2 = new byte[53 - i4];
        int i6 = 52 - i4;
        int i7 = -1;
        if (bArr == null) {
            i5 = (i6 + (-i5)) - 11;
            i7 = -1;
        }
        while (true) {
            i3++;
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i5;
            if (i8 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i5 = (i5 + (-bArr[i3])) - 11;
                i7 = i8;
            }
        }
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
    private static void e(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.setDeviceSurfaceManagerProvider.$$d
            int r6 = r6 * 15
            int r6 = r6 + 84
            int r8 = r8 * 74
            int r8 = 78 - r8
            int r7 = r7 * 37
            int r7 = 75 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
        L28:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + 2
            int r8 = r8 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setDeviceSurfaceManagerProvider.e(short, short, short, java.lang.Object[]):void");
    }

    @Override // defpackage.getSensorToBufferTransform
    public final /* bridge */ /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(InputStream inputStream, File file, getTargetRotation gettargetrotation) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        d = i2 % 128;
        int i3 = i2 % 2;
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(inputStream, file);
        int i4 = asInterface + 89;
        d = i4 % 128;
        int i5 = i4 % 2;
        return zTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public setDeviceSurfaceManagerProvider(CameraUnavailableException cameraUnavailableException) {
        this.TuitionPaymentFragmentbindingInflater1 = cameraUnavailableException;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i4 = $10 + 73;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            int i6 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i7 = $10 + 59;
            $11 = i7 % 128;
            int i8 = 58224;
            char c = 1;
            if (i7 % 2 == 0) {
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 % 1];
                i2 = 1;
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                i2 = 0;
            }
            while (i2 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i6];
                int i9 = (c3 + i8) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[c] = Integer.valueOf(i9);
                    objArr2[i6] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c4 = (char) (47774 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, i6) + 468;
                        int size = View.MeasureSpec.getSize(i6) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[i6] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c4, iMakeMeasureSpec, size, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i6]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47772 - MotionEvent.axisFromString("")), (ViewConfiguration.getFadingEdgeLength() >> 16) + 468, 13 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i2++;
                    i6 = 0;
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
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Process.getGidForName("") + 1), 2322 - TextUtils.lastIndexOf("", '0', 0), 44 - Color.green(0), -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(InputStream inputStream, File file) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = asInterface + 23;
        d = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char mirror = (char) (AndroidCharacter.getMirror('0') + 42994);
            int i4 = 3110 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 22;
            byte[] bArr = $$a;
            byte b2 = bArr[40];
            byte b3 = bArr[7];
            Object[] objArr3 = new Object[1];
            a(b2, b3, b3, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror, i4, packedPositionType, -1272852037, false, (String) objArr3[0], null);
        }
        FileOutputStream fileOutputStream = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{47772, 33183, 5931, 39372, 65182, 55710, 12191, 25039, 21683, 41897, 21656, 52947, 41838, 34658, 29865, 17815, 29091, 55352, 15542, 4255, 49158, 20547, 3164, 36719}, 22 - (ViewConfiguration.getTapTimeout() >> 16), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{29416, 48887, 52102, 39053, 54658, 51755, 59607, 32506, 21400, 28639, 13858, 9015, 45169, 45238, 29667, 40177, 15630, 64456}, View.getDefaultSize(0, 0) + 15, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cNormalizeMetaState = (char) (43042 - KeyEvent.normalizeMetaState(0));
            int i5 = 3112 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int i6 = 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            byte[] bArr2 = $$a;
            byte b4 = bArr2[5];
            byte b5 = bArr2[7];
            Object[] objArr6 = new Object[1];
            a(b4, b5, b5, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, i5, i6, -1269618118, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i7 = d + 27;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf = (char) (43041 - TextUtils.lastIndexOf("", '0', 0));
                int maximumDrawingCacheSize = 3111 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int maxKeyCode = 22 - (KeyEvent.getMaxKeyCode() >> 16);
                byte[] bArr3 = $$a;
                byte b6 = bArr3[7];
                Object[] objArr7 = new Object[1];
                a(b6, b6, bArr3[5], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, maximumDrawingCacheSize, maxKeyCode, 154975793, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i9 = ((int[]) objArr8[2])[0];
            int i10 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[3];
            int[] iArr = {i9};
            int iIdentityHashCode = System.identityHashCode(this);
            int i11 = (((-1798378488) + (((~((-1160590974) | iIdentityHashCode)) | 544440485) * (-366))) + (((~(iIdentityHashCode | (-1158428249))) | 542277760) * 366)) - 1626160102;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[0])[0] = i13 ^ (i13 << 5);
            objArr = new Object[]{new int[1], new int[]{i10}, iArr, strArr};
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{21441, 45090, 5256, 23750, 28813, 32001, 30024, 52196, 28342, 29981, 35750, 63672, 56257, 31854, 34142, 40301, 2126, 44881}, 16 - (ViewConfiguration.getTouchSlop() >> 8), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{10489, 36370, 4909, 49965, 28857, 19703, 35889, 26387, 8077, 45274, 40010, 52235, 30461, 24195, 58390, 22933, 7541, 48396}, View.MeasureSpec.getMode(0) + 16, objArr10);
            try {
                Object[] objArr11 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue()), 0, -1626160102};
                byte[] bArr4 = $$d;
                byte b7 = bArr4[46];
                byte b8 = b7;
                Object[] objArr12 = new Object[1];
                e(b8, (byte) (b8 - 1), b7, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b9 = bArr4[46];
                byte b10 = (byte) (b9 - 1);
                byte b11 = b9;
                Object[] objArr13 = new Object[1];
                e(b10, b11, (byte) (b11 - 1), objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char pressedStateDuration = (char) (43042 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    int windowTouchSlop = 3111 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22;
                    byte[] bArr5 = $$a;
                    byte b12 = bArr5[7];
                    Object[] objArr14 = new Object[1];
                    a(b12, b12, bArr5[5], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(pressedStateDuration, windowTouchSlop, maximumFlingVelocity, 154975793, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    c(new char[]{47772, 33183, 5931, 39372, 65182, 55710, 12191, 25039, 21683, 41897, 21656, 52947, 41838, 34658, 29865, 17815, 29091, 55352, 15542, 4255, 49158, 20547, 3164, 36719}, View.MeasureSpec.makeMeasureSpec(0, 0) + 22, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(new char[]{29416, 48887, 52102, 39053, 54658, 51755, 59607, 32506, 21400, 28639, 13858, 9015, 45169, 45238, 29667, 40177, 15630, 64456}, 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 43042);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 3111;
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 22;
                        byte[] bArr6 = $$a;
                        byte b13 = bArr6[5];
                        byte b14 = bArr6[7];
                        Object[] objArr17 = new Object[1];
                        a(b13, b14, b14, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iResolveSizeAndState, fadingEdgeLength, -1269618118, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char edgeSlop = (char) (43042 - (ViewConfiguration.getEdgeSlop() >> 16));
                        int packedPositionChild = 3110 - ExpandableListView.getPackedPositionChild(0L);
                        int maximumFlingVelocity2 = 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        byte[] bArr7 = $$a;
                        byte b15 = bArr7[40];
                        byte b16 = bArr7[7];
                        Object[] objArr18 = new Object[1];
                        a(b15, b16, b16, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(edgeSlop, packedPositionChild, maximumFlingVelocity2, -1272852037, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i14 = asInterface + 55;
                    d = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i15 = 2 / 3;
                    }
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
        int i16 = ((int[]) objArr[1])[0];
        int i17 = ((int[]) objArr[2])[0];
        if (i17 == i16) {
            int i18 = ((int[]) objArr[0])[0];
            int i19 = ((int[]) objArr[2])[0];
            int i20 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i21 = i18 + 68472706 + ((~((~iIdentityHashCode2) | (-26095649))) * 433) + (((~((-1678870210) | iIdentityHashCode2)) | (-26161250)) * (-433)) + (((~(iIdentityHashCode2 | (-26161250))) | (-1704965858)) * 433);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr2[0])[0] = i23 ^ (i23 << 5);
            objArr2 = new Object[]{new int[1], new int[]{i20}, new int[]{i19}, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr2 = new int[i17];
            int i24 = i17 - 1;
            iArr2[i24] = 1;
            Toast.makeText((Context) null, iArr2[((i17 * i24) % 2) - 1], 1).show();
            int i25 = ((int[]) objArr[0])[0];
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i28 = i25 + 1615765658 + (((~(startElapsedRealtime | 481163372)) | (-1223868087)) * (-668)) + ((481163372 | (~((-1223868087) | startElapsedRealtime))) * 1336) + ((startElapsedRealtime | (-1079117459)) * 668);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr2[0])[0] = i30 ^ (i30 << 5);
            objArr2 = new Object[]{new int[1], new int[]{i27}, new int[]{i26}, strArr4};
        }
        CameraUnavailableException cameraUnavailableException = this.TuitionPaymentFragmentbindingInflater1;
        int i31 = ((int[]) objArr2[0])[0];
        int i32 = i31 * i31;
        int i33 = -(1238065760 * i31);
        int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
        int i35 = -(i31 * 871564378);
        int i36 = ((i34 ^ i35) + ((i35 & i34) << 1)) - 1839976503;
        int i37 = i36 >> 16;
        int i38 = (((-131071) ^ i37) + ((i37 & (-131071)) << 1)) / 65536;
        int i39 = (i36 - (~((i38 ^ 1) + ((i38 & 1) << 1)))) - 1;
        int i40 = i36 >> 18;
        int i41 = -(i39 ^ (((((i40 | (-32767)) << 1) - (i40 ^ (-32767))) / 16384) - (-1)));
        int i42 = ((i41 | 6) << 1) - (i41 ^ 6);
        int i43 = i42 >> 26;
        int i44 = ((i43 ^ ComposerKt.defaultsKey) + ((i43 & ComposerKt.defaultsKey) << 1)) / 64;
        byte[] bArr8 = (byte[]) cameraUnavailableException.TuitionPaymentFragmentspecialinlinedviewModeldefault2(733741056 / (((-((((i44 | 1) << 1) - (i44 ^ 1)) - (-1))) & i42) * 1866), byte[].class);
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            while (true) {
                try {
                    int i45 = inputStream.read(bArr8);
                    if (i45 == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr8, 0, i45);
                    int i46 = asInterface + 9;
                    d = i46 % 128;
                    if (i46 % 2 == 0) {
                        int i47 = 2 / 2;
                    }
                } catch (IOException unused2) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr8);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        int i48 = asInterface + 25;
                        d = i48 % 128;
                        int i49 = i48 % 2;
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr8);
                    throw th;
                }
            }
            fileOutputStream2.close();
            try {
                fileOutputStream2.close();
            } catch (IOException unused5) {
            }
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr8);
            return true;
        } catch (IOException unused6) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, int r8) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 1
            byte[] r1 = defpackage.setDeviceSurfaceManagerProvider.$$c
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r8 = r8 * 3
            int r8 = r8 + 108
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2c
        L17:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1b:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r0[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            int r3 = r3 + 1
            r4 = r1[r8]
        L2c:
            int r7 = r7 + r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setDeviceSurfaceManagerProvider.$$g(byte, byte, int):java.lang.String");
    }
}
