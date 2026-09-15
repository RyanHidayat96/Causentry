package retrofit2.converter.moshi;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.AutoValue_RecordingStats;
import defpackage.RotationProviderListenerWrapper;
import defpackage.getInProgressTransformationInfo;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes4.dex */
final class MoshiRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] b;
    private final AutoValue_RecordingStats<T> adapter;
    private static final byte[] $$c = {93, -122, -23, -24};
    private static final int $$f = 21;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {30, 17, -35, 104, 9, 2, 7, 6, 10, 9, -40, 58, 3, 5, -10, -14, 32, 24, -10, 14, -50, 23, 51, 6, -1, 10, 5, 21, 4, -10, 26, -4, 13, 6, 12, -25, 21, 19, 13, 9, 0, 0, -28, 40, 24, -6, 1, 9, 40, -5, 18, -4, 13, 6, -23, 24, 31, -5, -1, 16, 13, -39, 51, -10, 13, 13, -1, 16, 13, 6, 4, -4, 5, 13, -1, 18, 4, 12, 5, 4, 12, -2, 6, 25, -6, 3, 25, -35, 41, -4, 8, 14, -1, 8, 8, 2, 27, -2, 15, -59};
    private static final int $$e = 7;
    private static final byte[] $$a = {53, -70, 9, -72, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 233;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 15
            int r0 = r6 + 38
            int r7 = r7 * 52
            int r7 = 108 - r7
            byte[] r1 = retrofit2.converter.moshi.MoshiRequestBodyConverter.$$a
            int r8 = r8 * 2
            int r8 = 84 - r8
            byte[] r0 = new byte[r0]
            int r6 = r6 + 37
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r6
            r8 = r7
            r4 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r8 + 1
            int r8 = r3 + (-11)
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.converter.moshi.MoshiRequestBodyConverter.a(int, byte, byte, java.lang.Object[]):void");
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
    private static void d(short r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = retrofit2.converter.moshi.MoshiRequestBodyConverter.$$d
            int r7 = r7 * 31
            int r7 = 115 - r7
            int r9 = r9 * 44
            int r9 = r9 + 4
            int r8 = r8 * 8
            int r8 = r8 + 45
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2b:
            int r7 = r7 + r9
            int r9 = r3 + 1
            int r7 = r7 + (-7)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.converter.moshi.MoshiRequestBodyConverter.d(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0121 A[PHI: r8
  0x0121: PHI (r8v5 char) = (r8v4 char), (r8v24 char) binds: [B:34:0x011f, B:31:0x0117] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0140 A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:9:0x0038, B:11:0x0046, B:12:0x007b, B:15:0x0092, B:17:0x00a1, B:18:0x00db, B:48:0x01f8, B:50:0x0205, B:52:0x0247, B:36:0x0128, B:38:0x0140, B:39:0x0177), top: B:84:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0187  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a7 A[Catch: all -> 0x0257, TryCatch #1 {all -> 0x0257, blocks: (B:42:0x018e, B:44:0x01a7, B:45:0x01e5), top: B:86:0x018e }] */
    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        char c;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i2 = 2;
        int i3 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = 1;
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr = b;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i10 = $10 + 99;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 0;
            while (i12 < length) {
                int i13 = $11 + 13;
                $10 = i13 % 128;
                if (i13 % i2 != 0) {
                    try {
                        Object[] objArr2 = new Object[i6];
                        objArr2[i4] = Integer.valueOf(cArr[i12]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b2 = (byte) i4;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), 1270 - Gravity.getAbsoluteGravity(i4, i4), 18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 407021364, false, $$g(b2, b3, (byte) (b3 + 5)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr2)).charValue();
                        i2 = 2;
                        i4 = 0;
                        i6 = 1;
                        i12 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i12])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getLongPressTimeout() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1269, 17 - TextUtils.indexOf((CharSequence) "", '0'), 407021364, false, $$g(b4, b5, (byte) (b5 + 5)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr3)).charValue();
                    i12++;
                    i2 = 2;
                    i4 = 0;
                    i6 = 1;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i7];
        System.arraycopy(cArr, i5, cArr3, 0, i7);
        if (bArr != null) {
            char[] cArr4 = new char[i7];
            setvideostabilizationmode.b = 0;
            char c2 = 0;
            while (setvideostabilizationmode.b < i7) {
                int i14 = $10 + 121;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    c = 1;
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i15 = setvideostabilizationmode.b;
                        char c3 = cArr3[setvideostabilizationmode.b];
                        Object[] objArr4 = new Object[2];
                        objArr4[c] = Integer.valueOf(c2);
                        objArr4[0] = Integer.valueOf(c3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 3225, 13 - KeyEvent.normalizeMetaState(0), 2133916302, false, $$g(b6, b7, (byte) (b7 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr4)).charValue();
                    } else {
                        int i16 = setvideostabilizationmode.b;
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b8 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (29943 - ImageFormat.getBitsPerPixel(0)), (Process.myPid() >> 22) + 1755, TextUtils.lastIndexOf("", '0', 0, 0) + 24, 387247676, false, $$g(b8, b8, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                } else {
                    c = 1;
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i17 = setvideostabilizationmode.b;
                        char c4 = cArr3[setvideostabilizationmode.b];
                        Object[] objArr6 = new Object[2];
                        objArr6[c] = Integer.valueOf(c2);
                        objArr6[0] = Integer.valueOf(c4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 3225, 13 - KeyEvent.normalizeMetaState(0), 2133916302, false, $$g(b9, b10, (byte) (b10 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i17] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr6)).charValue();
                    } else {
                        int i18 = setvideostabilizationmode.b;
                        Object[] objArr7 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b11 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (29943 - ImageFormat.getBitsPerPixel(0)), (Process.myPid() >> 22) + 1755, TextUtils.lastIndexOf("", '0', 0, 0) + 24, 387247676, false, $$g(b11, b11, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i18] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr7)).charValue();
                    }
                }
                c2 = cArr4[setvideostabilizationmode.b];
                Object[] objArr8 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (41241 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 1704 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 21, -1434471773, false, $$g(b12, b13, b13), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
            }
            cArr3 = cArr4;
        }
        if (i9 > 0) {
            int i19 = $11 + 37;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            char[] cArr5 = new char[i7];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i7);
            int i21 = i7 - i9;
            System.arraycopy(cArr5, 0, cArr3, i21, i9);
            System.arraycopy(cArr5, i9, cArr3, 0, i21);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i7];
            loop2: while (true) {
                setvideostabilizationmode.b = i;
                while (true) {
                    if (setvideostabilizationmode.b >= i7) {
                        break loop2;
                    }
                    int i22 = $11 + 79;
                    $10 = i22 % 128;
                    if (i22 % 2 != 0) {
                        cArr6[setvideostabilizationmode.b] = cArr3[(i7 << setvideostabilizationmode.b) >> 1];
                        setvideostabilizationmode.b++;
                    } else {
                        cArr6[setvideostabilizationmode.b] = cArr3[(i7 - setvideostabilizationmode.b) - 1];
                        i = setvideostabilizationmode.b + 1;
                    }
                }
            }
            cArr3 = cArr6;
        }
        if (i8 > 0) {
            int i23 = $10 + 77;
            $11 = i23 % 128;
            int i24 = i23 % 2;
            int i25 = 0;
            while (true) {
                setvideostabilizationmode.b = i25;
                if (setvideostabilizationmode.b >= i7) {
                    break;
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i25 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public final /* bridge */ /* synthetic */ RequestBody convert(Object obj) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2267;
            int i4 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 32;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[5], bArr[40], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, jumpTapTimeout, i4, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{0, 22, 41, 0}, true, new byte[]{0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{22, 15, 53, 10}, false, new byte[]{0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int iIndexOf = TextUtils.indexOf("", "") + 2267;
            int i5 = 34 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            byte[] bArr2 = $$a;
            byte b2 = bArr2[5];
            Object[] objArr5 = new Object[1];
            a(b2, b2, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, iIndexOf, i5, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                int i6 = 2268 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int maxKeyCode = 33 - (KeyEvent.getMaxKeyCode() >> 16);
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                a(b3, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAxisFromString, i6, maxKeyCode, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i7 = ((int[]) objArr7[0])[0];
            int i8 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int i9 = ~System.identityHashCode(this);
            int i10 = (((((~((-606721523) | i9)) | 67634288) * (-241)) + 1908287202) + (((~(i9 | (-539087235))) | 134357505) * 241)) - 1692124565;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
            c = 3;
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{37, 26, 0, 25}, true, new byte[]{1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{63, 18, 0, 0}, true, new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new int[]{81, 16, 99, 16}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new int[]{97, 16, 0, 0}, true, new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1692124565};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[40];
                byte b6 = b5;
                Object[] objArr13 = new Object[1];
                d(b5, b6, b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr3[46];
                byte b8 = b7;
                Object[] objArr14 = new Object[1];
                d(b7, b8, b8, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cBlue = (char) Color.blue(0);
                        int i13 = 2267 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int fadingEdgeLength = 33 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr15 = new Object[1];
                        a(b9, b10, b10, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cBlue, i13, fadingEdgeLength, -654680577, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        c(new int[]{0, 22, 41, 0}, true, new byte[]{0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        c(new int[]{22, 15, 53, 10}, false, new byte[]{0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1}, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int iIndexOf2 = 2267 - TextUtils.indexOf("", "", 0);
                            int defaultSize = 33 - View.getDefaultSize(0, 0);
                            byte[] bArr4 = $$a;
                            byte b11 = bArr4[5];
                            Object[] objArr18 = new Object[1];
                            a(b11, b11, bArr4[7], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumDrawingCacheSize, iIndexOf2, defaultSize, -874156483, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "");
                            int minimumFlingVelocity = 2267 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int i14 = 34 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            byte[] bArr5 = $$a;
                            Object[] objArr19 = new Object[1];
                            a(bArr5[5], bArr5[40], bArr5[7], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, minimumFlingVelocity, i14, -887667012, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i15 = ((int[]) objArr[c])[0];
        int i16 = ((int[]) objArr[0])[0];
        if (i16 == i15) {
            Object[] objArr20 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i17 = ((int[]) objArr[2])[0];
            int i18 = ((int[]) objArr[0])[0];
            int i19 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i20 = 1080769723 + ((~(iIdentityHashCode | 96782746)) * 216);
            int i21 = ~iIdentityHashCode;
            int i22 = i17 + i20 + (((-707473986) | i21) * (-216)) + (((~(i21 | 96782746)) | 711930569) * 216);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr20[2])[0] = i24 ^ (i24 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                int i25 = TuitionPaymentFragmentbindingInflater1 + 61;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25 % 128;
                int i26 = 2;
                int i27 = i25 % 2;
                int i28 = 0;
                while (i28 < strArr3.length) {
                    int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
                    TuitionPaymentFragmentbindingInflater1 = i29 % 128;
                    if (i29 % i26 != 0) {
                        arrayList.add(strArr3[i28]);
                        i28 += 2;
                    } else {
                        arrayList.add(strArr3[i28]);
                        i28++;
                    }
                    i26 = 2;
                }
            }
            Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i30 = ((int[]) objArr[2])[0];
            int i31 = ((int[]) objArr[0])[0];
            int i32 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i33 = ~iIdentityHashCode2;
            int i34 = i30 + (-1230061857) + (((~((-254053024) | i33)) | (-554660293) | (~(254053023 | iIdentityHashCode2))) * (-564)) + ((~(iIdentityHashCode2 | (-537620801))) * 1128) + (((~((-554660293) | i33)) | (-791673824)) * 564);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr21[2])[0] = i36 ^ (i36 << 5);
        }
        return convert(obj);
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        MEDIA_TYPE = MediaType.get("application/json; charset=UTF-8");
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    MoshiRequestBodyConverter(AutoValue_RecordingStats<T> autoValue_RecordingStats) {
        this.adapter = autoValue_RecordingStats;
    }

    @Override // retrofit2.Converter
    public final RequestBody convert(T t) throws IOException {
        int i = 2 % 2;
        RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
        this.adapter.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getInProgressTransformationInfo(rotationProviderListenerWrapper), t);
        RequestBody requestBodyCreate = RequestBody.create(MEDIA_TYPE, rotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper.size));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return requestBodyCreate;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        b = new char[]{59713, 59803, 59801, 59805, 59787, 59786, 59801, 59806, 59799, 59796, 59780, 59746, 59762, 59793, 59772, 59769, 59780, 59806, 59794, 59807, 59801, 59803, 59718, 59794, 59803, 59803, 59795, 59792, 59822, 59816, 59819, 59797, 59793, 59798, 59792, 59798, 59821, 59707, 59752, 59744, 59750, 59733, 59757, 59773, 59749, 59748, 59748, 59749, 59744, 59737, 59708, 59716, 59771, 59747, 59724, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59753, 59708, 59749, 59751, 59749, 59745, 59753, 59757, 59745, 59749, 59771, 59731, 59729, 59770, 59746, 59744, 59769, 59768, 59751, 59757, 59843, 59845, 59845, 59809, 59835, 59842, 59841, 59846, 59814, 59816, 59842, 59858, 59869, 59844, 59847, 59705, 59759, 59746, 59730, 59742, 59750, 59745, 59743, 59755, 59773, 59749, 59749, 59770, 59746, 59759, 59757};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r5, int r6, byte r7) {
        /*
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r5 = r5 * 2
            int r0 = r5 + 1
            byte[] r1 = retrofit2.converter.moshi.MoshiRequestBodyConverter.$$c
            int r7 = 105 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r5
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
        L25:
            int r6 = r6 + 1
            int r7 = r7 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.converter.moshi.MoshiRequestBodyConverter.$$g(int, int, byte):java.lang.String");
    }
}
