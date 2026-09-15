package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.zxing.FormatException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class SessionConfigBuilder {
    private static final SessionConfigBuilder[] TuitionPaymentFragmentbindingInflater1;
    private static char asBinder;
    private static final int[] asInterface;
    private static int d;
    private static char[] g;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final b[] b;
    private static final byte[] $$c = {53, -70, 9, -72};
    private static final int $$d = 41;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {91, -9, 99, 11, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 125;
    private static int INotificationSideChannel = 0;
    private static int notify = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f211a = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 15
            int r7 = r7 + 38
            byte[] r0 = defpackage.SessionConfigBuilder.$$a
            int r9 = r9 * 3
            int r9 = 84 - r9
            int r8 = 93 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r9 = r8
            r5 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            int r9 = r9 + 1
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.SessionConfigBuilder.c(byte, int, int, java.lang.Object[]):void");
    }

    static {
        d = 0;
        b();
        asInterface = new int[]{31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
        TuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
        int i = f211a + 59;
        d = i % 128;
        int i2 = i % 2;
    }

    private SessionConfigBuilder(int i, int[] iArr, b... bVarArr) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iArr;
        this.b = bVarArr;
        int i2 = 0;
        int i3 = bVarArr[0].b;
        TuitionPaymentFragmentbindingInflater1[] tuitionPaymentFragmentbindingInflater1Arr = bVarArr[0].TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int length = tuitionPaymentFragmentbindingInflater1Arr.length;
        int i4 = 2 % 2;
        int i5 = 0;
        while (i2 < length) {
            int i6 = INotificationSideChannel + 115;
            notify = i6 % 128;
            if (i6 % 2 == 0) {
                TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentbindingInflater1Arr[i2];
                i5 <<= tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >> (tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + i3);
                i2 += 117;
            } else {
                TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = tuitionPaymentFragmentbindingInflater1Arr[i2];
                i5 += tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * (tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + i3);
                i2++;
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5;
        int i7 = notify + 35;
        INotificationSideChannel = i7 % 128;
        int i8 = i7 % 2;
    }

    public static final class b {
        final TuitionPaymentFragmentbindingInflater1[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public final int b;

        b(int i, TuitionPaymentFragmentbindingInflater1... tuitionPaymentFragmentbindingInflater1Arr) {
            this.b = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentbindingInflater1Arr;
        }

        public final int b() {
            int i = 0;
            for (TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                i += tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            return i;
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 {
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentbindingInflater1(int i, int i2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2;
        }
    }

    private static void e(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = g;
        int i4 = 1770390596;
        Object obj2 = null;
        int i5 = -1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) i5;
                        byte b4 = (byte) (b3 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 2267 - (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.alpha(0) + 33, -1927765101, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    i4 = 1770390596;
                    i5 = -1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $11 + 49;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(asBinder)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) (-1);
            byte b6 = (byte) (b5 + 1);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.MeasureSpec.getSize(0), (ViewConfiguration.getEdgeSlop() >> 16) + 2267, View.combineMeasuredStates(0, 0) + 33, -1927765101, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i9 = $10 + 49;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i11 = $11 + 19;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i12 = $10 + 27;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i14 = $11 + 97;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b + b2);
                        int i15 = deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        cArr4[0] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + b2);
                    } else {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    }
                    obj = obj2;
                } else {
                    try {
                        Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b7 = (byte) (-1);
                            byte b8 = (byte) (b7 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-16727949) - Color.rgb(0, 0, 0)), 3261 - (ViewConfiguration.getTouchSlop() >> 8), 30 - TextUtils.getOffsetAfter("", 0), -127612708, false, $$e(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b9 = (byte) (-1);
                                byte b10 = (byte) (b9 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 22878), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 594, 17 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1570859318, false, $$e(b9, b10, (byte) (b10 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                            int i17 = $10 + 53;
                            $11 = i17 % 128;
                            int i18 = i17 % 2;
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i19 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i20 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i19];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i20];
                                int i21 = $11 + 101;
                                $10 = i21 % 128;
                                int i22 = i21 % 2;
                            } else {
                                int i23 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i24 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i23];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i24];
                            }
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        for (int i25 = 0; i25 < i; i25++) {
            cArr4[i25] = (char) (cArr4[i25] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cRgb = (char) ((-16747272) - Color.rgb(0, 0, 0));
            int touchSlop = 1755 - (ViewConfiguration.getTouchSlop() >> 8);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 23;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            c(b3, (byte) (b3 | 89), b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, touchSlop, iCombineMeasuredStates, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{1, '\b', 5, 23, 16, 24, 5, 3, 15, 14, 4, '\n', 20, '\f', 21, 16, 23, 19, 4, 16, '\t', 14}, (byte) (View.combineMeasuredStates(0, 0) + 5), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{16, 6, '\b', 18, 11, '\f', 7, 3, '\r', 1, 6, 21, 22, 20, 13897}, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 73), 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 29945);
            int i2 = 1756 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int bitsPerPixel = 22 - ImageFormat.getBitsPerPixel(0);
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            c(bArr[28], (byte) ($$b & 182), bArr[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, i2, bitsPerPixel, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cKeyCodeFromString = (char) (29944 - KeyEvent.keyCodeFromString(""));
                int mirror = AndroidCharacter.getMirror('0') + 1707;
                int iArgb = Color.argb(0, 0, 0, 0) + 23;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[28];
                byte b5 = bArr2[7];
                Object[] objArr6 = new Object[1];
                c(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, mirror, iArgb, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = ~iIdentityHashCode;
            int i4 = (((1189776958 + (((~(197029985 | i3)) | 409632411) * (-90))) + (((~(197029985 | iIdentityHashCode)) | 60031072) * (-45))) + ((((~(iIdentityHashCode | (-409632412))) | 197029985) | (~(i3 | 409632411))) * 45)) - 2032369838;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[3])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{18, 2, '\b', 2, 1, 2, 1, '\b', 20, 5, '\f', 24, 11, 15, 14, 21}, (byte) (55 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{23, 6, 16, 11, 21, 1, 17, 21, '\b', 0, '\r', 20, 19, 15, 6, '\r'}, (byte) (27 - View.MeasureSpec.makeMeasureSpec(0, 0)), 15 - TextUtils.lastIndexOf("", '0', 0), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1851494345};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 42048), 1726 - TextUtils.getCapsMode("", 0, 0), TextUtils.indexOf("", "", 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = DecorContentParent.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), -2032369838);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29944);
                    int iAxisFromString = 1754 - MotionEvent.axisFromString("");
                    int i7 = 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    byte[] bArr3 = $$a;
                    byte b6 = bArr3[28];
                    byte b7 = bArr3[7];
                    Object[] objArr11 = new Object[1];
                    c(b6, b7, b7, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMakeMeasureSpec, iAxisFromString, i7, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    Object[] objArr12 = new Object[1];
                    e(new char[]{1, '\b', 5, 23, 16, 24, 5, 3, 15, 14, 4, '\n', 20, '\f', 21, 16, 23, 19, 4, 16, '\t', 14}, (byte) (Color.argb(0, 0, 0, 0) + 5), KeyEvent.keyCodeFromString("") + 22, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    e(new char[]{16, 6, '\b', 18, 11, '\f', 7, 3, '\r', 1, 6, 21, 22, 20, 13897}, (byte) (TextUtils.getOffsetAfter("", 0) + 74), 14 - ImageFormat.getBitsPerPixel(0), objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29943);
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 1755;
                        int i8 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                        byte[] bArr4 = $$a;
                        Object[] objArr14 = new Object[1];
                        c(bArr4[28], (byte) ($$b & 182), bArr4[7], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iIndexOf, i8, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29945);
                        int i9 = 1756 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int iArgb2 = 23 - Color.argb(0, 0, 0, 0);
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr15 = new Object[1];
                        c(b9, (byte) (b9 | 89), b8, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, i9, iArgb2, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    objArr = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
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
        int i10 = ((int[]) objArr[1])[0];
        int i11 = ((int[]) objArr[0])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArr[3])[0];
            Object[] objArr16 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i13 = ~elapsedCpuTime;
            int i14 = i12 + (-718558363) + (((~((-597958157) | i13)) | 810560582) * (-328)) + ((elapsedCpuTime | 810560582) * 164) + (((~(elapsedCpuTime | 597958156)) | 273686594 | (~(i13 | (-61084169)))) * 164);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr16[3])[0] = i16 ^ (i16 << 5);
            int i17 = INotificationSideChannel + 35;
            notify = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 4 / 4;
            }
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i19 = notify + 67;
                INotificationSideChannel = i19 % 128;
                for (int i20 = i19 % 2 != 0 ? 1 : 0; i20 < strArr.length; i20++) {
                    arrayList.add(strArr[i20]);
                }
            }
            Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
            int i21 = ((int[]) objArr[3])[0];
            Object[] objArr17 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i22 = ~iIdentityHashCode2;
            int i23 = ~(455870754 | i22);
            int i24 = i21 + 641781665 + (((-528481259) | i23) * (-712)) + (((~(iIdentityHashCode2 | (-72610505))) | (~(i22 | 528481258))) * (-712)) + ((243268328 | i23) * 712);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr17[3])[0] = i26 ^ (i26 << 5);
        }
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static SessionConfigBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) throws FormatException {
        int i2 = 2 % 2;
        if (i % 4 != 1) {
            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        try {
            int i3 = (i - 17) / 4;
            if (i3 > 0) {
                int i4 = notify;
                int i5 = i4 + 57;
                INotificationSideChannel = i5 % 128;
                int i6 = i5 % 2;
                if (i3 <= 40) {
                    int i7 = i4 + 119;
                    INotificationSideChannel = i7 % 128;
                    int i8 = i7 % 2;
                    SessionConfigBuilder sessionConfigBuilder = TuitionPaymentFragmentbindingInflater1[i3 - 1];
                    int i9 = i4 + 101;
                    INotificationSideChannel = i9 % 128;
                    int i10 = i9 % 2;
                    return sessionConfigBuilder;
                }
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException unused) {
            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
    }

    public static SessionConfigBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        int i2 = 2 % 2;
        int i3 = notify;
        int i4 = i3 + 97;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        if (i <= 0 || i > 40) {
            throw new IllegalArgumentException();
        }
        int i6 = i3 + 107;
        INotificationSideChannel = i6 % 128;
        int i7 = i6 % 2;
        return TuitionPaymentFragmentbindingInflater1[i - 1];
    }

    static SessionConfigBuilder b(int i) {
        int i2 = 2 % 2;
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        while (true) {
            int[] iArr = asInterface;
            if (i3 >= iArr.length) {
                if (i4 > 3) {
                    return null;
                }
                if (i5 > 0) {
                    int i6 = INotificationSideChannel + 57;
                    notify = i6 % 128;
                    int i7 = i6 % 2;
                    if (i5 <= 40) {
                        return TuitionPaymentFragmentbindingInflater1[i5 - 1];
                    }
                }
                throw new IllegalArgumentException();
            }
            int i8 = iArr[i3];
            if (i8 == i) {
                int i9 = i3 + 7;
                if (i9 > 0 && i9 <= 40) {
                    int i10 = INotificationSideChannel + 103;
                    notify = i10 % 128;
                    return i10 % 2 == 0 ? TuitionPaymentFragmentbindingInflater1[i9] : TuitionPaymentFragmentbindingInflater1[i3 + 6];
                }
                throw new IllegalArgumentException();
            }
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = addAllDeviceStateCallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, i8);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 < i4) {
                int i11 = notify + 121;
                INotificationSideChannel = i11 % 128;
                int i12 = i11 % 2;
                i5 = i3 + 7;
                i4 = iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            i3++;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 13;
        notify = i2 % 128;
        int i3 = i2 % 2;
        String strValueOf = String.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i4 = INotificationSideChannel + 41;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return strValueOf;
    }

    private static SessionConfigBuilder[] TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        SessionConfigBuilder[] sessionConfigBuilderArr = {new SessionConfigBuilder(1, new int[0], new b(7, new TuitionPaymentFragmentbindingInflater1(1, 19)), new b(10, new TuitionPaymentFragmentbindingInflater1(1, 16)), new b(13, new TuitionPaymentFragmentbindingInflater1(1, 13)), new b(17, new TuitionPaymentFragmentbindingInflater1(1, 9))), new SessionConfigBuilder(2, new int[]{6, 18}, new b(10, new TuitionPaymentFragmentbindingInflater1(1, 34)), new b(16, new TuitionPaymentFragmentbindingInflater1(1, 28)), new b(22, new TuitionPaymentFragmentbindingInflater1(1, 22)), new b(28, new TuitionPaymentFragmentbindingInflater1(1, 16))), new SessionConfigBuilder(3, new int[]{6, 22}, new b(15, new TuitionPaymentFragmentbindingInflater1(1, 55)), new b(26, new TuitionPaymentFragmentbindingInflater1(1, 44)), new b(18, new TuitionPaymentFragmentbindingInflater1(2, 17)), new b(22, new TuitionPaymentFragmentbindingInflater1(2, 13))), new SessionConfigBuilder(4, new int[]{6, 26}, new b(20, new TuitionPaymentFragmentbindingInflater1(1, 80)), new b(18, new TuitionPaymentFragmentbindingInflater1(2, 32)), new b(26, new TuitionPaymentFragmentbindingInflater1(2, 24)), new b(16, new TuitionPaymentFragmentbindingInflater1(4, 9))), new SessionConfigBuilder(5, new int[]{6, 30}, new b(26, new TuitionPaymentFragmentbindingInflater1(1, 108)), new b(24, new TuitionPaymentFragmentbindingInflater1(2, 43)), new b(18, new TuitionPaymentFragmentbindingInflater1(2, 15), new TuitionPaymentFragmentbindingInflater1(2, 16)), new b(22, new TuitionPaymentFragmentbindingInflater1(2, 11), new TuitionPaymentFragmentbindingInflater1(2, 12))), new SessionConfigBuilder(6, new int[]{6, 34}, new b(18, new TuitionPaymentFragmentbindingInflater1(2, 68)), new b(16, new TuitionPaymentFragmentbindingInflater1(4, 27)), new b(24, new TuitionPaymentFragmentbindingInflater1(4, 19)), new b(28, new TuitionPaymentFragmentbindingInflater1(4, 15))), new SessionConfigBuilder(7, new int[]{6, 22, 38}, new b(20, new TuitionPaymentFragmentbindingInflater1(2, 78)), new b(18, new TuitionPaymentFragmentbindingInflater1(4, 31)), new b(18, new TuitionPaymentFragmentbindingInflater1(2, 14), new TuitionPaymentFragmentbindingInflater1(4, 15)), new b(26, new TuitionPaymentFragmentbindingInflater1(4, 13), new TuitionPaymentFragmentbindingInflater1(1, 14))), new SessionConfigBuilder(8, new int[]{6, 24, 42}, new b(24, new TuitionPaymentFragmentbindingInflater1(2, 97)), new b(22, new TuitionPaymentFragmentbindingInflater1(2, 38), new TuitionPaymentFragmentbindingInflater1(2, 39)), new b(22, new TuitionPaymentFragmentbindingInflater1(4, 18), new TuitionPaymentFragmentbindingInflater1(2, 19)), new b(26, new TuitionPaymentFragmentbindingInflater1(4, 14), new TuitionPaymentFragmentbindingInflater1(2, 15))), new SessionConfigBuilder(9, new int[]{6, 26, 46}, new b(30, new TuitionPaymentFragmentbindingInflater1(2, 116)), new b(22, new TuitionPaymentFragmentbindingInflater1(3, 36), new TuitionPaymentFragmentbindingInflater1(2, 37)), new b(20, new TuitionPaymentFragmentbindingInflater1(4, 16), new TuitionPaymentFragmentbindingInflater1(4, 17)), new b(24, new TuitionPaymentFragmentbindingInflater1(4, 12), new TuitionPaymentFragmentbindingInflater1(4, 13))), new SessionConfigBuilder(10, new int[]{6, 28, 50}, new b(18, new TuitionPaymentFragmentbindingInflater1(2, 68), new TuitionPaymentFragmentbindingInflater1(2, 69)), new b(26, new TuitionPaymentFragmentbindingInflater1(4, 43), new TuitionPaymentFragmentbindingInflater1(1, 44)), new b(24, new TuitionPaymentFragmentbindingInflater1(6, 19), new TuitionPaymentFragmentbindingInflater1(2, 20)), new b(28, new TuitionPaymentFragmentbindingInflater1(6, 15), new TuitionPaymentFragmentbindingInflater1(2, 16))), new SessionConfigBuilder(11, new int[]{6, 30, 54}, new b(20, new TuitionPaymentFragmentbindingInflater1(4, 81)), new b(30, new TuitionPaymentFragmentbindingInflater1(1, 50), new TuitionPaymentFragmentbindingInflater1(4, 51)), new b(28, new TuitionPaymentFragmentbindingInflater1(4, 22), new TuitionPaymentFragmentbindingInflater1(4, 23)), new b(24, new TuitionPaymentFragmentbindingInflater1(3, 12), new TuitionPaymentFragmentbindingInflater1(8, 13))), new SessionConfigBuilder(12, new int[]{6, 32, 58}, new b(24, new TuitionPaymentFragmentbindingInflater1(2, 92), new TuitionPaymentFragmentbindingInflater1(2, 93)), new b(22, new TuitionPaymentFragmentbindingInflater1(6, 36), new TuitionPaymentFragmentbindingInflater1(2, 37)), new b(26, new TuitionPaymentFragmentbindingInflater1(4, 20), new TuitionPaymentFragmentbindingInflater1(6, 21)), new b(28, new TuitionPaymentFragmentbindingInflater1(7, 14), new TuitionPaymentFragmentbindingInflater1(4, 15))), new SessionConfigBuilder(13, new int[]{6, 34, 62}, new b(26, new TuitionPaymentFragmentbindingInflater1(4, 107)), new b(22, new TuitionPaymentFragmentbindingInflater1(8, 37), new TuitionPaymentFragmentbindingInflater1(1, 38)), new b(24, new TuitionPaymentFragmentbindingInflater1(8, 20), new TuitionPaymentFragmentbindingInflater1(4, 21)), new b(22, new TuitionPaymentFragmentbindingInflater1(12, 11), new TuitionPaymentFragmentbindingInflater1(4, 12))), new SessionConfigBuilder(14, new int[]{6, 26, 46, 66}, new b(30, new TuitionPaymentFragmentbindingInflater1(3, 115), new TuitionPaymentFragmentbindingInflater1(1, 116)), new b(24, new TuitionPaymentFragmentbindingInflater1(4, 40), new TuitionPaymentFragmentbindingInflater1(5, 41)), new b(20, new TuitionPaymentFragmentbindingInflater1(11, 16), new TuitionPaymentFragmentbindingInflater1(5, 17)), new b(24, new TuitionPaymentFragmentbindingInflater1(11, 12), new TuitionPaymentFragmentbindingInflater1(5, 13))), new SessionConfigBuilder(15, new int[]{6, 26, 48, 70}, new b(22, new TuitionPaymentFragmentbindingInflater1(5, 87), new TuitionPaymentFragmentbindingInflater1(1, 88)), new b(24, new TuitionPaymentFragmentbindingInflater1(5, 41), new TuitionPaymentFragmentbindingInflater1(5, 42)), new b(30, new TuitionPaymentFragmentbindingInflater1(5, 24), new TuitionPaymentFragmentbindingInflater1(7, 25)), new b(24, new TuitionPaymentFragmentbindingInflater1(11, 12), new TuitionPaymentFragmentbindingInflater1(7, 13))), new SessionConfigBuilder(16, new int[]{6, 26, 50, 74}, new b(24, new TuitionPaymentFragmentbindingInflater1(5, 98), new TuitionPaymentFragmentbindingInflater1(1, 99)), new b(28, new TuitionPaymentFragmentbindingInflater1(7, 45), new TuitionPaymentFragmentbindingInflater1(3, 46)), new b(24, new TuitionPaymentFragmentbindingInflater1(15, 19), new TuitionPaymentFragmentbindingInflater1(2, 20)), new b(30, new TuitionPaymentFragmentbindingInflater1(3, 15), new TuitionPaymentFragmentbindingInflater1(13, 16))), new SessionConfigBuilder(17, new int[]{6, 30, 54, 78}, new b(28, new TuitionPaymentFragmentbindingInflater1(1, 107), new TuitionPaymentFragmentbindingInflater1(5, 108)), new b(28, new TuitionPaymentFragmentbindingInflater1(10, 46), new TuitionPaymentFragmentbindingInflater1(1, 47)), new b(28, new TuitionPaymentFragmentbindingInflater1(1, 22), new TuitionPaymentFragmentbindingInflater1(15, 23)), new b(28, new TuitionPaymentFragmentbindingInflater1(2, 14), new TuitionPaymentFragmentbindingInflater1(17, 15))), new SessionConfigBuilder(18, new int[]{6, 30, 56, 82}, new b(30, new TuitionPaymentFragmentbindingInflater1(5, 120), new TuitionPaymentFragmentbindingInflater1(1, 121)), new b(26, new TuitionPaymentFragmentbindingInflater1(9, 43), new TuitionPaymentFragmentbindingInflater1(4, 44)), new b(28, new TuitionPaymentFragmentbindingInflater1(17, 22), new TuitionPaymentFragmentbindingInflater1(1, 23)), new b(28, new TuitionPaymentFragmentbindingInflater1(2, 14), new TuitionPaymentFragmentbindingInflater1(19, 15))), new SessionConfigBuilder(19, new int[]{6, 30, 58, 86}, new b(28, new TuitionPaymentFragmentbindingInflater1(3, 113), new TuitionPaymentFragmentbindingInflater1(4, 114)), new b(26, new TuitionPaymentFragmentbindingInflater1(3, 44), new TuitionPaymentFragmentbindingInflater1(11, 45)), new b(26, new TuitionPaymentFragmentbindingInflater1(17, 21), new TuitionPaymentFragmentbindingInflater1(4, 22)), new b(26, new TuitionPaymentFragmentbindingInflater1(9, 13), new TuitionPaymentFragmentbindingInflater1(16, 14))), new SessionConfigBuilder(20, new int[]{6, 34, 62, 90}, new b(28, new TuitionPaymentFragmentbindingInflater1(3, 107), new TuitionPaymentFragmentbindingInflater1(5, 108)), new b(26, new TuitionPaymentFragmentbindingInflater1(3, 41), new TuitionPaymentFragmentbindingInflater1(13, 42)), new b(30, new TuitionPaymentFragmentbindingInflater1(15, 24), new TuitionPaymentFragmentbindingInflater1(5, 25)), new b(28, new TuitionPaymentFragmentbindingInflater1(15, 15), new TuitionPaymentFragmentbindingInflater1(10, 16))), new SessionConfigBuilder(21, new int[]{6, 28, 50, 72, 94}, new b(28, new TuitionPaymentFragmentbindingInflater1(4, 116), new TuitionPaymentFragmentbindingInflater1(4, 117)), new b(26, new TuitionPaymentFragmentbindingInflater1(17, 42)), new b(28, new TuitionPaymentFragmentbindingInflater1(17, 22), new TuitionPaymentFragmentbindingInflater1(6, 23)), new b(30, new TuitionPaymentFragmentbindingInflater1(19, 16), new TuitionPaymentFragmentbindingInflater1(6, 17))), new SessionConfigBuilder(22, new int[]{6, 26, 50, 74, 98}, new b(28, new TuitionPaymentFragmentbindingInflater1(2, 111), new TuitionPaymentFragmentbindingInflater1(7, 112)), new b(28, new TuitionPaymentFragmentbindingInflater1(17, 46)), new b(30, new TuitionPaymentFragmentbindingInflater1(7, 24), new TuitionPaymentFragmentbindingInflater1(16, 25)), new b(24, new TuitionPaymentFragmentbindingInflater1(34, 13))), new SessionConfigBuilder(23, new int[]{6, 30, 54, 78, 102}, new b(30, new TuitionPaymentFragmentbindingInflater1(4, 121), new TuitionPaymentFragmentbindingInflater1(5, 122)), new b(28, new TuitionPaymentFragmentbindingInflater1(4, 47), new TuitionPaymentFragmentbindingInflater1(14, 48)), new b(30, new TuitionPaymentFragmentbindingInflater1(11, 24), new TuitionPaymentFragmentbindingInflater1(14, 25)), new b(30, new TuitionPaymentFragmentbindingInflater1(16, 15), new TuitionPaymentFragmentbindingInflater1(14, 16))), new SessionConfigBuilder(24, new int[]{6, 28, 54, 80, 106}, new b(30, new TuitionPaymentFragmentbindingInflater1(6, 117), new TuitionPaymentFragmentbindingInflater1(4, 118)), new b(28, new TuitionPaymentFragmentbindingInflater1(6, 45), new TuitionPaymentFragmentbindingInflater1(14, 46)), new b(30, new TuitionPaymentFragmentbindingInflater1(11, 24), new TuitionPaymentFragmentbindingInflater1(16, 25)), new b(30, new TuitionPaymentFragmentbindingInflater1(30, 16), new TuitionPaymentFragmentbindingInflater1(2, 17))), new SessionConfigBuilder(25, new int[]{6, 32, 58, 84, 110}, new b(26, new TuitionPaymentFragmentbindingInflater1(8, 106), new TuitionPaymentFragmentbindingInflater1(4, 107)), new b(28, new TuitionPaymentFragmentbindingInflater1(8, 47), new TuitionPaymentFragmentbindingInflater1(13, 48)), new b(30, new TuitionPaymentFragmentbindingInflater1(7, 24), new TuitionPaymentFragmentbindingInflater1(22, 25)), new b(30, new TuitionPaymentFragmentbindingInflater1(22, 15), new TuitionPaymentFragmentbindingInflater1(13, 16))), new SessionConfigBuilder(26, new int[]{6, 30, 58, 86, 114}, new b(28, new TuitionPaymentFragmentbindingInflater1(10, 114), new TuitionPaymentFragmentbindingInflater1(2, 115)), new b(28, new TuitionPaymentFragmentbindingInflater1(19, 46), new TuitionPaymentFragmentbindingInflater1(4, 47)), new b(28, new TuitionPaymentFragmentbindingInflater1(28, 22), new TuitionPaymentFragmentbindingInflater1(6, 23)), new b(30, new TuitionPaymentFragmentbindingInflater1(33, 16), new TuitionPaymentFragmentbindingInflater1(4, 17))), new SessionConfigBuilder(27, new int[]{6, 34, 62, 90, 118}, new b(30, new TuitionPaymentFragmentbindingInflater1(8, 122), new TuitionPaymentFragmentbindingInflater1(4, 123)), new b(28, new TuitionPaymentFragmentbindingInflater1(22, 45), new TuitionPaymentFragmentbindingInflater1(3, 46)), new b(30, new TuitionPaymentFragmentbindingInflater1(8, 23), new TuitionPaymentFragmentbindingInflater1(26, 24)), new b(30, new TuitionPaymentFragmentbindingInflater1(12, 15), new TuitionPaymentFragmentbindingInflater1(28, 16))), new SessionConfigBuilder(28, new int[]{6, 26, 50, 74, 98, 122}, new b(30, new TuitionPaymentFragmentbindingInflater1(3, 117), new TuitionPaymentFragmentbindingInflater1(10, 118)), new b(28, new TuitionPaymentFragmentbindingInflater1(3, 45), new TuitionPaymentFragmentbindingInflater1(23, 46)), new b(30, new TuitionPaymentFragmentbindingInflater1(4, 24), new TuitionPaymentFragmentbindingInflater1(31, 25)), new b(30, new TuitionPaymentFragmentbindingInflater1(11, 15), new TuitionPaymentFragmentbindingInflater1(31, 16))), new SessionConfigBuilder(29, new int[]{6, 30, 54, 78, 102, 126}, new b(30, new TuitionPaymentFragmentbindingInflater1(7, 116), new TuitionPaymentFragmentbindingInflater1(7, 117)), new b(28, new TuitionPaymentFragmentbindingInflater1(21, 45), new TuitionPaymentFragmentbindingInflater1(7, 46)), new b(30, new TuitionPaymentFragmentbindingInflater1(1, 23), new TuitionPaymentFragmentbindingInflater1(37, 24)), new b(30, new TuitionPaymentFragmentbindingInflater1(19, 15), new TuitionPaymentFragmentbindingInflater1(26, 16))), new SessionConfigBuilder(30, new int[]{6, 26, 52, 78, 104, 130}, new b(30, new TuitionPaymentFragmentbindingInflater1(5, 115), new TuitionPaymentFragmentbindingInflater1(10, 116)), new b(28, new TuitionPaymentFragmentbindingInflater1(19, 47), new TuitionPaymentFragmentbindingInflater1(10, 48)), new b(30, new TuitionPaymentFragmentbindingInflater1(15, 24), new TuitionPaymentFragmentbindingInflater1(25, 25)), new b(30, new TuitionPaymentFragmentbindingInflater1(23, 15), new TuitionPaymentFragmentbindingInflater1(25, 16))), new SessionConfigBuilder(31, new int[]{6, 30, 56, 82, 108, 134}, new b(30, new TuitionPaymentFragmentbindingInflater1(13, 115), new TuitionPaymentFragmentbindingInflater1(3, 116)), new b(28, new TuitionPaymentFragmentbindingInflater1(2, 46), new TuitionPaymentFragmentbindingInflater1(29, 47)), new b(30, new TuitionPaymentFragmentbindingInflater1(42, 24), new TuitionPaymentFragmentbindingInflater1(1, 25)), new b(30, new TuitionPaymentFragmentbindingInflater1(23, 15), new TuitionPaymentFragmentbindingInflater1(28, 16))), new SessionConfigBuilder(32, new int[]{6, 34, 60, 86, 112, 138}, new b(30, new TuitionPaymentFragmentbindingInflater1(17, 115)), new b(28, new TuitionPaymentFragmentbindingInflater1(10, 46), new TuitionPaymentFragmentbindingInflater1(23, 47)), new b(30, new TuitionPaymentFragmentbindingInflater1(10, 24), new TuitionPaymentFragmentbindingInflater1(35, 25)), new b(30, new TuitionPaymentFragmentbindingInflater1(19, 15), new TuitionPaymentFragmentbindingInflater1(35, 16))), new SessionConfigBuilder(33, new int[]{6, 30, 58, 86, 114, 142}, new b(30, new TuitionPaymentFragmentbindingInflater1(17, 115), new TuitionPaymentFragmentbindingInflater1(1, 116)), new b(28, new TuitionPaymentFragmentbindingInflater1(14, 46), new TuitionPaymentFragmentbindingInflater1(21, 47)), new b(30, new TuitionPaymentFragmentbindingInflater1(29, 24), new TuitionPaymentFragmentbindingInflater1(19, 25)), new b(30, new TuitionPaymentFragmentbindingInflater1(11, 15), new TuitionPaymentFragmentbindingInflater1(46, 16))), new SessionConfigBuilder(34, new int[]{6, 34, 62, 90, 118, 146}, new b(30, new TuitionPaymentFragmentbindingInflater1(13, 115), new TuitionPaymentFragmentbindingInflater1(6, 116)), new b(28, new TuitionPaymentFragmentbindingInflater1(14, 46), new TuitionPaymentFragmentbindingInflater1(23, 47)), new b(30, new TuitionPaymentFragmentbindingInflater1(44, 24), new TuitionPaymentFragmentbindingInflater1(7, 25)), new b(30, new TuitionPaymentFragmentbindingInflater1(59, 16), new TuitionPaymentFragmentbindingInflater1(1, 17))), new SessionConfigBuilder(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new b(30, new TuitionPaymentFragmentbindingInflater1(12, 121), new TuitionPaymentFragmentbindingInflater1(7, 122)), new b(28, new TuitionPaymentFragmentbindingInflater1(12, 47), new TuitionPaymentFragmentbindingInflater1(26, 48)), new b(30, new TuitionPaymentFragmentbindingInflater1(39, 24), new TuitionPaymentFragmentbindingInflater1(14, 25)), new b(30, new TuitionPaymentFragmentbindingInflater1(22, 15), new TuitionPaymentFragmentbindingInflater1(41, 16))), new SessionConfigBuilder(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new b(30, new TuitionPaymentFragmentbindingInflater1(6, 121), new TuitionPaymentFragmentbindingInflater1(14, 122)), new b(28, new TuitionPaymentFragmentbindingInflater1(6, 47), new TuitionPaymentFragmentbindingInflater1(34, 48)), new b(30, new TuitionPaymentFragmentbindingInflater1(46, 24), new TuitionPaymentFragmentbindingInflater1(10, 25)), new b(30, new TuitionPaymentFragmentbindingInflater1(2, 15), new TuitionPaymentFragmentbindingInflater1(64, 16))), new SessionConfigBuilder(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new b(30, new TuitionPaymentFragmentbindingInflater1(17, 122), new TuitionPaymentFragmentbindingInflater1(4, 123)), new b(28, new TuitionPaymentFragmentbindingInflater1(29, 46), new TuitionPaymentFragmentbindingInflater1(14, 47)), new b(30, new TuitionPaymentFragmentbindingInflater1(49, 24), new TuitionPaymentFragmentbindingInflater1(10, 25)), new b(30, new TuitionPaymentFragmentbindingInflater1(24, 15), new TuitionPaymentFragmentbindingInflater1(46, 16))), new SessionConfigBuilder(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new b(30, new TuitionPaymentFragmentbindingInflater1(4, 122), new TuitionPaymentFragmentbindingInflater1(18, 123)), new b(28, new TuitionPaymentFragmentbindingInflater1(13, 46), new TuitionPaymentFragmentbindingInflater1(32, 47)), new b(30, new TuitionPaymentFragmentbindingInflater1(48, 24), new TuitionPaymentFragmentbindingInflater1(14, 25)), new b(30, new TuitionPaymentFragmentbindingInflater1(42, 15), new TuitionPaymentFragmentbindingInflater1(32, 16))), new SessionConfigBuilder(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new b(30, new TuitionPaymentFragmentbindingInflater1(20, 117), new TuitionPaymentFragmentbindingInflater1(4, 118)), new b(28, new TuitionPaymentFragmentbindingInflater1(40, 47), new TuitionPaymentFragmentbindingInflater1(7, 48)), new b(30, new TuitionPaymentFragmentbindingInflater1(43, 24), new TuitionPaymentFragmentbindingInflater1(22, 25)), new b(30, new TuitionPaymentFragmentbindingInflater1(10, 15), new TuitionPaymentFragmentbindingInflater1(67, 16))), new SessionConfigBuilder(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new b(30, new TuitionPaymentFragmentbindingInflater1(19, 118), new TuitionPaymentFragmentbindingInflater1(6, 119)), new b(28, new TuitionPaymentFragmentbindingInflater1(18, 47), new TuitionPaymentFragmentbindingInflater1(31, 48)), new b(30, new TuitionPaymentFragmentbindingInflater1(34, 24), new TuitionPaymentFragmentbindingInflater1(34, 25)), new b(30, new TuitionPaymentFragmentbindingInflater1(20, 15), new TuitionPaymentFragmentbindingInflater1(61, 16)))};
        int i2 = notify + 109;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        return sessionConfigBuilderArr;
    }

    static void b() {
        g = new char[]{60117, 60055, 60073, 60058, 60056, 60083, 60053, 60045, 60063, 60048, 60040, 60062, 60116, 60043, 60072, 60060, 60047, 60049, 60088, 60052, 60041, 60050, 60034, 60051, 60054};
        asBinder = (char) 57188;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r6, short r7, short r8) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r0 = r7 + 1
            byte[] r1 = defpackage.SessionConfigBuilder.$$c
            int r8 = r8 + 113
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r8 = r6
            r4 = r7
            r3 = r2
            goto L28
        L13:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r1[r8]
        L28:
            int r4 = -r4
            int r6 = r6 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.SessionConfigBuilder.$$e(byte, short, short):java.lang.String");
    }
}
