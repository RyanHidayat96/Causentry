package defpackage;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.material.internal.ViewUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class isSamsungJ4<T> {
    private static int $10 = 0;
    private static int $11 = 1;
    public final long TuitionPaymentFragmentbindingInflater1;
    public final T TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private TimeUnit b;
    private static final byte[] $$a = {5, -91, 77, 46, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 159;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int asInterface = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -6481732533761555153L;

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = 55 - r6
            byte[] r0 = defpackage.isSamsungJ4.$$a
            int r7 = 53 - r7
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2c
        L15:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            int r8 = r8 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r0[r8]
        L2c:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isSamsungJ4.a(int, byte, int, java.lang.Object[]):void");
    }

    public isSamsungJ4(T t, long j, TimeUnit timeUnit) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = t;
        this.TuitionPaymentFragmentbindingInflater1 = j;
        this.b = (TimeUnit) share.b(timeUnit, "unit is null");
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $11 + 1;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - TextUtils.getTrimmedLength("")), ExpandableListView.getPackedPositionType(0L) + 2624, 13 - ((Process.getThreadPriority(0) + 20) >> 6), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 % 9053247990562531611L);
                    try {
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - View.MeasureSpec.getSize(0)), TextUtils.getTrimmedLength("") + 481, View.resolveSizeAndState(0, 0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 19472), 2624 - View.MeasureSpec.makeMeasureSpec(0, 0), 13 - ((Process.getThreadPriority(0) + 20) >> 6), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 9053247990562531611L);
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 39422), Color.green(0) + 481, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i6 = $11 + 9;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 39422), TextUtils.lastIndexOf("", '0') + 482, 37 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (!(!(obj instanceof isSamsungJ4))) {
            isSamsungJ4 issamsungj4 = (isSamsungJ4) obj;
            if (share.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, issamsungj4.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                if (this.TuitionPaymentFragmentbindingInflater1 == issamsungj4.TuitionPaymentFragmentbindingInflater1 && share.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, issamsungj4.b)) {
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
                    asInterface = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                }
            }
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 45 / 0;
        }
        return false;
    }

    public final int hashCode() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = asInterface + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        T t = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode = t != null ? t.hashCode() : 0;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyTid = (char) (Process.myTid() >> 22);
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 651;
            int i4 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45;
            byte[] bArr = $$a;
            byte b = bArr[5];
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, scrollBarFadeDuration, i4, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{27733, 19637, 11662, 3723, 61415, 51446, 43466, 35475, 27427, 17440, 9548, 1570, 59257, 49252, 41298, 33360, 25257, 17320, 15510, 7654, 65275, 57284}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 8431, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{27729, 20007, 10411, 2873, 58811, 49194, 41642, 40223, 32681, 23074, 13486, 5941, 61865, 44074, 36515}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8830, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
            int trimmedLength = TextUtils.getTrimmedLength("") + 651;
            int i5 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b3, (byte) (b3 | 52), bArr2[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, trimmedLength, i5, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 651;
                int iRgb = (-16777172) - Color.rgb(0, 0, 0);
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                a(b5, (byte) (b5 | 15), b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, iNormalizeMetaState, iRgb, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[0])[0];
            int i8 = ~System.identityHashCode(this);
            int i9 = (-1516603922) + (((~(574159277 | i8)) | (-577590088)) * (-983)) + (((~(i8 | (-577590088))) | 573067525) * 983) + 178143123;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[3])[0] = i11 ^ (i11 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.getDefaultSize(0, 0), 1609 - MotionEvent.axisFromString(""), 26 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 178143123, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 651;
                    int iLastIndexOf = 43 - TextUtils.lastIndexOf("", '0', 0, 0);
                    byte[] bArr3 = $$a;
                    byte b6 = bArr3[7];
                    Object[] objArr9 = new Object[1];
                    a(b6, (byte) (b6 | 52), bArr3[5], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, deadChar, iLastIndexOf, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 695, 98 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getTapTimeout() >> 16) + 63406), (-16776423) - Color.rgb(0, 0, 0), 83 - KeyEvent.keyCodeFromString("")), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c3 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int iIndexOf = TextUtils.indexOf("", "", 0) + 651;
                    int i12 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43;
                    byte b7 = $$a[7];
                    byte b8 = b7;
                    Object[] objArr10 = new Object[1];
                    a(b8, (byte) (b8 | 15), b7, objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, iIndexOf, i12, -1595579076, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    c(new char[]{27733, 19637, 11662, 3723, 61415, 51446, 43466, 35475, 27427, 17440, 9548, 1570, 59257, 49252, 41298, 33360, 25257, 17320, 15510, 7654, 65275, 57284}, 8431 - KeyEvent.normalizeMetaState(0), objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c(new char[]{27729, 20007, 10411, 2873, 58811, 49194, 41642, 40223, 32681, 23074, 13486, 5941, 61865, 44074, 36515}, 8832 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                        int iGreen = 651 - Color.green(0);
                        int windowTouchSlop = 44 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[7];
                        Object[] objArr13 = new Object[1];
                        a(b9, (byte) (b9 | 52), bArr4[5], objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cResolveOpacity, iGreen, windowTouchSlop, -873460649, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        int maximumDrawingCacheSize = 651 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int i13 = 45 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[5];
                        byte b11 = bArr5[7];
                        Object[] objArr14 = new Object[1];
                        a(b10, b11, b11, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cNormalizeMetaState, maximumDrawingCacheSize, i13, -459846511, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        int i14 = ((int[]) objArr[0])[0];
        int i15 = ((int[]) objArr[2])[0];
        if (i15 == i14) {
            Object[] objArr15 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i16 = ((int[]) objArr[3])[0];
            int i17 = ((int[]) objArr[2])[0];
            int i18 = ((int[]) objArr[0])[0];
            int iMyUid = Process.myUid();
            int i19 = ~iMyUid;
            int i20 = i16 + (-1256605363) + ((iMyUid | 234881024) * 988) + (((~(243559114 | i19)) | (-248806395)) * (-1976)) + (((~(iMyUid | 240128304)) | 234881024 | (~((-240128305) | i19))) * 988);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            Object obj = objArr15[3];
            ((int[]) obj)[0] = i22 ^ (i22 << 5);
            long j2 = this.TuitionPaymentFragmentbindingInflater1;
            int i23 = ((int[]) obj)[0];
            int i24 = i23 * i23;
            int i25 = -(378774252 * i23);
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            int i27 = -(i23 * 214618450);
            int i28 = ((i26 ^ i27) + ((i27 & i26) << 1)) - 1584132159;
            int i29 = (i28 - (~((((i28 >> 23) - 1023) / 512) + 1))) - 1;
            int i30 = i28 >> 19;
            int i31 = ((i30 ^ (-16383)) + ((i30 & (-16383)) << 1)) / 8192;
            int i32 = (-(i29 ^ ((i31 ^ 1) + ((i31 & 1) << 1)))) + 1;
            int i33 = ((i32 >> 18) - 32767) / 16384;
            int i34 = (i33 & 1) + (i33 | 1);
            return (((iHashCode * 31) + ((int) (j2 ^ (j2 >>> (23808 / ((i32 & (-(((i34 | 1) << 1) - (i34 ^ 1)))) * ViewUtils.EDGE_TO_EDGE_FLAGS)))))) * 31) + this.b.hashCode();
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[1];
        if (strArr != null) {
            for (String str : strArr) {
                int i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
                asInterface = i35 % 128;
                int i36 = i35 % 2;
                arrayList.add(str);
            }
        }
        throw new RuntimeException(String.valueOf(i15));
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Timed[time=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(", unit=");
        sb.append(this.b);
        sb.append(", value=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("]");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }
}
