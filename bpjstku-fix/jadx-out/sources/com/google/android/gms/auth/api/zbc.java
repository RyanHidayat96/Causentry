package com.google.android.gms.auth.api;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class zbc {
    protected Boolean zba;
    protected String zbb;
    private static final byte[] $$a = {19, 78, 114, 113};
    private static final int $$b = 130;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static char[] b = {59733, 59845, 59899, 59892, 59404, 59393, 59886, 59858, 59881, 59856, 59896, 59406, 59404, 59399, 59395, 59401, 59887, 59864, 59863, 59886, 59899, 59884, 59887, 59882, 59856, 59896, 59406, 59404, 59399, 59395, 59401, 59705, 59751, 59770, 59749, 59730, 59699, 59738, 59770, 59746, 59751, 59770, 59749, 59746, 59715, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59745, 59773, 59708, 59745, 59745, 59728, 59740, 59757, 59759, 59757, 59756, 59753, 59731, 59700, 59718, 59749, 59716, 59738, 59770, 59746, 59751, 59770, 59749, 59746, 59715, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59754, 59830, 59836, 59826, 59837, 59826, 59848, 59849, 59825, 59824, 59687, 59720, 59706, 59705, 59711, 59854, 59848, 59781, 59858, 59871, 59842, 59865, 59870, 59848, 59854, 59864, 59781, 59850, 59869, 59850, 59841, 59858, 59865, 59844, 59871, 59848, 59850, 59821, 59854, 59871, 59850, 59848, 59842, 59853, 59842, 59871, 59865, 59854, 59816, 59781, 59871, 59865, 59735, 59829, 59851, 59849, 59852, 59848, 59830, 59819, 59796, 59851, 59854, 59843, 59848, 59851, 59843, 59811, 59821, 59854, 59823, 59804, 59838, 59828, 59850, 59829, 59850, 59840, 59841, 59849, 59711, 59756, 59756, 59757, 59753, 59745, 59751, 59757, 59757, 59746, 59746, 59744, 59746, 59745, 59751, 59743, 59743, 59744, 59768, 59727, 59790, 59777, 59779, 59787, 59791, 59790, 59790, 59783, 59802, 59778, 59769, 59735, 59737, 59739, 59759, 59754, 59748, 59802, 59778, 59785, 59757, 59770, 59807, 59783, 59776, 59802, 59777, 59785, 59777, 59749, 59758, 59778, 59778};
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 4795158018688481584L;

    public zbc() {
        this.zba = false;
    }

    public zbc(zbd zbdVar) {
        this.zba = false;
        this.zba = Boolean.valueOf(zbdVar.zbb());
        this.zbb = zbdVar.zbc();
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 55;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19471 - TextUtils.lastIndexOf("", '0', 0, 0)), (Process.myPid() >> 22) + 2624, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.getSize(0) + 39422), 481 - KeyEvent.getDeadChar(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $10 + 25;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 39422), 481 - Drawable.resolveOpacity(0, 0), 37 - View.MeasureSpec.getSize(0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = b;
        char c = '0';
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 105;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    try {
                        Object[] objArr2 = new Object[i5];
                        objArr2[i3] = Integer.valueOf(cArr[i9]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", c, i3, i3));
                            int iLastIndexOf = TextUtils.lastIndexOf("", c, i3, i3) + 1271;
                            int iArgb = 18 - Color.argb(i3, i3, i3, i3);
                            byte b2 = (byte) i3;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, iLastIndexOf, iArgb, 407021364, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i9])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1271, (-16777198) - Color.rgb(0, 0, 0), 407021364, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i9++;
                }
                int i11 = $11 + 73;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                i3 = 0;
                i5 = 1;
                c = '0';
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i4, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            setvideostabilizationmode.b = 0;
            char c2 = 0;
            while (setvideostabilizationmode.b < i6) {
                int i13 = $11 + 9;
                $10 = i13 % 128;
                if (i13 % 2 == 0 ? bArr[setvideostabilizationmode.b] != 1 : bArr[setvideostabilizationmode.b] != 0) {
                    int i14 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (29992 - AndroidCharacter.getMirror('0')), 1755 - TextUtils.getOffsetAfter("", 0), 23 - (ViewConfiguration.getFadingEdgeLength() >> 16), 387247676, false, $$c(b6, b7, (byte) (b7 + 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                } else {
                    int i15 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), 3224 - ((byte) KeyEvent.getModifierMetaStateMask()), Gravity.getAbsoluteGravity(0, 0) + 13, 2133916302, false, $$c(b8, b9, b9), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c2 = cArr4[setvideostabilizationmode.b];
                Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (Color.alpha(0) + 41241), 1705 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.blue(0) + 21, -1434471773, false, $$c(b10, b11, (byte) (b11 | 6)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i16 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i16, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i16);
        }
        if (z) {
            int i17 = $10 + 15;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            char[] cArr6 = new char[i6];
            int i19 = 0;
            while (true) {
                setvideostabilizationmode.b = i19;
                if (setvideostabilizationmode.b >= i6) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr3[(i6 - setvideostabilizationmode.b) - 1];
                i19 = setvideostabilizationmode.b + 1;
            }
            int i20 = $11 + 117;
            $10 = i20 % 128;
            i = 2;
            int i21 = i20 % 2;
            cArr3 = cArr6;
        } else {
            i = 2;
        }
        if (i7 > 0) {
            int i22 = $10 + 31;
            $11 = i22 % 128;
            int i23 = i22 % i;
            int i24 = 0;
            while (true) {
                setvideostabilizationmode.b = i24;
                if (setvideostabilizationmode.b >= i6) {
                    break;
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[i]);
                i24 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public final zbc zba(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 111;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.zbb = str;
        int i5 = i2 + 85;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return this;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 2677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.zbc.TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context, int, int):java.lang.Object[]");
    }

    private static String $$c(short s, byte b2, byte b3) {
        int i = b3 + 99;
        byte[] bArr = $$a;
        int i2 = 4 - (s * 3);
        int i3 = b2 * 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i = (-i2) + i;
            i2++;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            int i6 = i;
            i4 = i5;
            i = (-bArr[i2]) + i6;
            i2++;
        }
    }
}
