package defpackage;

import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class getPostviewImageFormat {
    final addEffect TuitionPaymentFragmentbindingInflater1;
    final getEdge TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final getPostviewSurface TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final String b;
    private static final byte[] $$c = {43, 23, 22, -14};
    private static final int $$d = 165;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {32, 1, 70, -122, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 73;
    private static int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f964a = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {59858, 59824, 59899, 59862, 59863, 59862, 59883, 59856, 59705, 59759, 59749, 59732, 59740, 59745, 59747, 59705, 59747, 59756, 59754, 59751, 59768, 59771, 59750, 59733, 59722, 59713, 59745, 59756, 59757, 59718, 59724, 59744, 59744, 59758, 59765, 59405, 59892, 59892, 59398, 59404, 59394, 59398, 59405, 59403, 59893, 59406, 59892, 59888, 59400, 59676, 59713, 59802, 59778, 59777, 59777, 59778, 59789, 59750, 59737, 59745, 59776, 59784, 59753, 59759, 59786, 59788, 59776, 59789, 59791, 59785, 59766, 59766, 59765, 59789, 59779, 59762, 59706, 59751, 59768, 59769, 59744, 59746, 59770, 59729, 59731, 59771, 59749, 59745, 59757, 59753, 59745, 59749, 59751, 59749};

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 52
            int r0 = r5 + 1
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r1 = defpackage.getPostviewImageFormat.$$a
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
        L28:
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getPostviewImageFormat.d(short, short, short, java.lang.Object[]):void");
    }

    public getPostviewImageFormat(addEffect addeffect, getPostviewSurface getpostviewsurface, getEdge getedge, String str) {
        Intrinsics.checkNotNullParameter(addeffect, "");
        Intrinsics.checkNotNullParameter(getpostviewsurface, "");
        Intrinsics.checkNotNullParameter(getedge, "");
        this.TuitionPaymentFragmentbindingInflater1 = addeffect;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getpostviewsurface;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getedge;
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00cc A[PHI: r5
  0x00cc: PHI (r5v6 char) = (r5v5 char), (r5v26 char) binds: [B:30:0x00ca, B:27:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00eb A[Catch: all -> 0x009c, TryCatch #0 {all -> 0x009c, blocks: (B:11:0x0040, B:13:0x0051, B:14:0x0086, B:38:0x013a, B:40:0x0153, B:41:0x0194, B:44:0x01a7, B:46:0x01b4, B:47:0x01f0, B:32:0x00d3, B:34:0x00eb, B:35:0x0123), top: B:74:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0133  */
    /* JADX WARN: Code duplicated, block: B:40:0x0153 A[Catch: all -> 0x009c, TryCatch #0 {all -> 0x009c, blocks: (B:11:0x0040, B:13:0x0051, B:14:0x0086, B:38:0x013a, B:40:0x0153, B:41:0x0194, B:44:0x01a7, B:46:0x01b4, B:47:0x01f0, B:32:0x00d3, B:34:0x00eb, B:35:0x0123), top: B:74:0x0040 }] */
    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        char c;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int length;
        char[] cArr;
        int i2 = 2;
        int i3 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = 1;
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (cArr2 != null) {
            int i10 = $11 + 73;
            int i11 = i10 % 128;
            $10 = i11;
            if (i10 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i12 = i11 + 15;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 0;
            while (i14 < length) {
                int i15 = $11 + 103;
                $10 = i15 % 128;
                int i16 = i15 % i2;
                try {
                    Object[] objArr2 = new Object[i6];
                    objArr2[i4] = Integer.valueOf(cArr2[i14]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", i4, i4);
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1270;
                        int iArgb = 18 - Color.argb(i4, i4, i4, i4);
                        byte b = (byte) i4;
                        byte b2 = (byte) (b + 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, scrollBarSize, iArgb, 407021364, false, $$e(b, b2, (byte) (b2 - 5)), new Class[]{Integer.TYPE});
                    }
                    cArr[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr2)).charValue();
                    i14++;
                    i2 = 2;
                    i4 = 0;
                    i6 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i7];
        System.arraycopy(cArr2, i5, cArr3, 0, i7);
        if (bArr != null) {
            char[] cArr4 = new char[i7];
            setvideostabilizationmode.b = 0;
            char c2 = 0;
            while (setvideostabilizationmode.b < i7) {
                int i17 = $10 + 57;
                $11 = i17 % 128;
                if (i17 % 2 == 0) {
                    c = 1;
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i18 = setvideostabilizationmode.b;
                        char c3 = cArr3[setvideostabilizationmode.b];
                        Object[] objArr3 = new Object[2];
                        objArr3[c] = Integer.valueOf(c2);
                        objArr3[0] = Integer.valueOf(c3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b3 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), View.combineMeasuredStates(0, 0) + 3225, View.resolveSize(0, 0) + 13, 2133916302, false, $$e(b3, (byte) (b3 | 6), b3), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i18] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr3)).charValue();
                    } else {
                        int i19 = setvideostabilizationmode.b;
                        Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cResolveSize = (char) (View.resolveSize(0, 0) + 29944);
                            int i20 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1755;
                            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 23;
                            byte length2 = (byte) $$c.length;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize, i20, pressedStateDuration, 387247676, false, $$e((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i19] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr4)).charValue();
                    }
                } else {
                    c = 1;
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i110 = setvideostabilizationmode.b;
                        char c4 = cArr3[setvideostabilizationmode.b];
                        Object[] objArr5 = new Object[2];
                        objArr5[c] = Integer.valueOf(c2);
                        objArr5[0] = Integer.valueOf(c4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b4 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), View.combineMeasuredStates(0, 0) + 3225, View.resolveSize(0, 0) + 13, 2133916302, false, $$e(b4, (byte) (b4 | 6), b4), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i110] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr5)).charValue();
                    } else {
                        int i111 = setvideostabilizationmode.b;
                        Object[] objArr6 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cResolveSize2 = (char) (View.resolveSize(0, 0) + 29944);
                            int i21 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1755;
                            int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 23;
                            byte length3 = (byte) $$c.length;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize2, i21, pressedStateDuration2, 387247676, false, $$e((byte) 0, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i111] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).charValue();
                    }
                }
                c2 = cArr4[setvideostabilizationmode.b];
                Object[] objArr7 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41242 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Color.alpha(0) + 1705, ExpandableListView.getPackedPositionChild(0L) + 22, -1434471773, false, $$e(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr7);
                int i22 = $10 + 59;
                $11 = i22 % 128;
                if (i22 % 2 == 0) {
                    int i23 = 2 / 2;
                }
            }
            cArr3 = cArr4;
        }
        if (i9 > 0) {
            char[] cArr5 = new char[i7];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i7);
            int i24 = i7 - i9;
            System.arraycopy(cArr5, 0, cArr3, i24, i9);
            System.arraycopy(cArr5, i9, cArr3, 0, i24);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i7];
            setvideostabilizationmode.b = i;
            int i25 = $10 + 21;
            $11 = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = 3 / 5;
            }
            while (setvideostabilizationmode.b < i7) {
                cArr6[setvideostabilizationmode.b] = cArr3[(i7 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
            }
            cArr3 = cArr6;
        }
        if (i8 > 0) {
            int i27 = 0;
            while (true) {
                setvideostabilizationmode.b = i27;
                if (setvideostabilizationmode.b >= i7) {
                    break;
                }
                int i28 = $10 + 21;
                $11 = i28 % 128;
                int i29 = i28 % 2;
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i27 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x07b1, code lost:
    
        r8 = ~r8;
        r5 = (r5 + ((-756) * ((r4 & r8) | (r4 ^ r8)))) + (((~r35) | ((r7 ^ 16) | (r7 & 16))) * 756);
        r1 = (r37 & r5) + (r37 | r5);
        r2 = r1 << 13;
        r1 = ((~r1) & r2) | ((~r2) & r1);
        r2 = r1 >>> 17;
        r1 = (r1 | r2) & (~(r1 & r2));
        r2 = r1 << 5;
        ((int[]) r6[0])[0] = (r1 | r2) & (~(r1 & r2));
        r6[3] = r0;
        r0 = (r3 ^ 49) + ((r3 & 49) << 1);
        defpackage.getPostviewImageFormat.f964a = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x07f5, code lost:
    
        if ((r0 % 2) == 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x07f7, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x07f9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0802, code lost:
    
        r5 = new java.lang.Object[1];
        c(new int[]{50, 26, 27, 20}, true, new byte[]{0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0}, r5);
        r0 = java.lang.Class.forName((java.lang.String) r5[0]);
        r7 = new java.lang.Object[1];
        c(new int[]{76, 18, 0, 0}, false, new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0840, code lost:
    
        if (r0.getMethod((java.lang.String) r7[0], new java.lang.Class[0]).invoke(null, null) != null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0844, code lost:
    
        r0 = defpackage.getPostviewImageFormat.f964a;
        r3 = (r0 & 93) + (r0 | 93);
        defpackage.getPostviewImageFormat.g = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x06e2, code lost:
    
        if (r3 != r35) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x06ee, code lost:
    
        if (r3 != r35) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x06f0, code lost:
    
        r7 = r7 + 101;
        r4 = r7 % 128;
        defpackage.getPostviewImageFormat.f964a = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x06f9, code lost:
    
        if ((r7 % 2) != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x06fb, code lost:
    
        r0 = r0[1];
        r6 = new java.lang.Object[5];
        r7 = 0;
        r6[0] = new int[0];
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0707, code lost:
    
        r7 = 0;
        r0 = r0[0];
        r6 = new java.lang.Object[4];
        r6[0] = new int[1];
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0712, code lost:
    
        r6[r8] = new int[r8];
        r8 = new int[1];
        r6[2] = r8;
        r8[r7] = r35;
        r7 = r6[1];
        r8 = (r4 ^ 17) + ((r4 & 17) << 1);
        defpackage.getPostviewImageFormat.g = r8 % 128;
        r7 = (int[]) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0732, code lost:
    
        if ((r8 % 2) == 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0734, code lost:
    
        r7[0] = r3;
        r7 = (2063810419 + (((~((-329616136) | r10)) | (~(r35 | 1375415323))) * 333)) + (((~((-329616136) | r35)) | (~(r10 | 1375415323))) * 333);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0753, code lost:
    
        r7[0] = r3;
        r3 = android.os.Process.myTid();
        r7 = (1844634430 + (((~((-2361124) | (~r3))) | (-1702670336)) * (-591))) + ((r3 | (-2361124)) * 591);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0771, code lost:
    
        r3 = -(-(r7 * (-755)));
        r5 = ((-12080) & r3) + (r3 | (-12080));
        r3 = defpackage.getPostviewImageFormat.g;
        r4 = r3 + 49;
        defpackage.getPostviewImageFormat.f964a = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0789, code lost:
    
        if ((r4 % 2) != 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x078b, code lost:
    
        r4 = ~r7;
        r5 = r5 >>> (1512 >> (~(((-17) ^ r4) | ((-17) & r4))));
        r4 = ~((r4 & (-17)) | ((-17) ^ r4));
        r8 = r7 | 16;
        r8 = (r8 & r35) | (r8 ^ r35);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x07a0, code lost:
    
        r5 = r5 + ((~((~r7) | (-17))) * 1512);
        r4 = ~r7;
        r4 = ~((r4 & (-17)) | ((-17) ^ r4));
        r8 = ((r7 ^ 16) | (r7 & 16)) | r35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(java.lang.Class r34, int r35, int r36, int r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getPostviewImageFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(java.lang.Class, int, int, int):java.lang.Object[]");
    }

    private static String $$e(short s, int i, byte b) {
        byte[] bArr = $$c;
        int i2 = s * 3;
        int i3 = 105 - i;
        int i4 = 3 - (b * 3);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3 += i4;
            i4 = i4;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            int i8 = i4 + 1;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i3 = bArr[i8] + i3;
            i4 = i8;
            i6 = i7;
        }
    }
}
