package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public abstract class removeObserver<V> extends getPrescribedSize<V> {

    public static abstract class TuitionPaymentFragmentbindingInflater1<V> extends removeObserver<V> implements withValue.d<V> {
        private static final byte[] $$c = {31, -3, -46, 11};
        private static final int $$f = 127;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {84, 10, 24, -102, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -48, -12, 10, 62, -60, 1, 14, 2, -4, 65, -73, 3, 26, -12};
        private static final int $$e = 30;
        private static final byte[] $$a = {93, -77, 2, Base64.padSymbol, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
        private static final int $$b = 209;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {59697, 59768, 59773, 59757, 59723, 59739, 59770, 59717, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59757, 59756, 59746, 59750, 59740, 59731, 59746, 59705, 59746, 59744, 59749, 59771, 59757, 59752, 59728, 59728, 59759, 59751, 59770, 59747, 59757, 59747, 59779, 59421, 59411, 59409, 59412, 59408, 59422, 59891, 59901, 59420, 59412, 59893, 59885, 59402, 59409, 59414, 59413, 59413, 59414, 59438, 59422, 59398, 59415, 59409, 59417, 59418, 59699, 59771, 59749, 59745, 59757, 59753, 59745, 59749, 59751, 59749, 59747, 59751, 59768, 59769, 59744, 59746, 59770, 59729, 59757, 59852, 59846, 59846, 59810, 59812, 59843, 59842, 59847, 59815, 59817, 59843, 59859, 59870, 59845, 59840, 59711, 59756, 59759, 59746, 59730, 59742, 59750, 59745, 59743, 59755, 59773, 59749, 59749, 59770, 59746, 59759};

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 + 4
                int r6 = r6 * 14
                int r6 = r6 + 84
                int r0 = 53 - r8
                byte[] r1 = removeObserver.TuitionPaymentFragmentbindingInflater1.$$a
                byte[] r0 = new byte[r0]
                int r8 = 52 - r8
                r2 = 0
                if (r1 != 0) goto L14
                r3 = r7
                r4 = r2
                goto L30
            L14:
                r3 = r2
            L15:
                r5 = r7
                r7 = r6
                r6 = r5
                int r6 = r6 + 1
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r1[r6]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L30:
                int r6 = -r6
                int r3 = r3 + r6
                int r6 = r3 + (-10)
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: removeObserver.TuitionPaymentFragmentbindingInflater1.a(int, byte, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(int r7, int r8, int r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = removeObserver.TuitionPaymentFragmentbindingInflater1.$$d
                int r8 = r8 * 49
                int r8 = 53 - r8
                int r7 = 99 - r7
                int r9 = r9 * 49
                int r9 = r9 + 1
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r8
                r8 = r9
                r4 = r2
                goto L2b
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r9) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L25:
                r3 = r0[r8]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r6
            L2b:
                int r7 = -r7
                int r3 = r3 + 1
                int r8 = r8 + r7
                int r7 = r8 + 3
                r8 = r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: removeObserver.TuitionPaymentFragmentbindingInflater1.d(int, int, int, java.lang.Object[]):void");
        }

        @Override // defpackage.withValue, java.util.concurrent.Future
        public final V get() throws ExecutionException, InterruptedException {
            V v;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 != 0) {
                v = (V) super.get();
                int i3 = 58 / 0;
            } else {
                v = (V) super.get();
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            return v;
        }

        private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            int i2;
            int length;
            char[] cArr;
            int i3;
            int i4 = 2 % 2;
            setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
            int i5 = 0;
            int i6 = iArr[0];
            int i7 = iArr[1];
            int i8 = iArr[2];
            int i9 = iArr[3];
            char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i10 = -1;
            float f = 0.0f;
            if (cArr2 != null) {
                int i11 = $11 + 7;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                    i3 = 1;
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                    i3 = 0;
                }
                while (i3 < length) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i5] = Integer.valueOf(cArr2[i3]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int i12 = (TypedValue.complexToFraction(i5, f, f) > f ? 1 : (TypedValue.complexToFraction(i5, f, f) == f ? 0 : -1)) + 1270;
                            int i13 = (TypedValue.complexToFloat(i5) > f ? 1 : (TypedValue.complexToFloat(i5) == f ? 0 : -1)) + 18;
                            byte b = (byte) i10;
                            byte b2 = (byte) (b + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatTimeout, i12, i13, 407021364, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i3++;
                        int i14 = $10 + 75;
                        $11 = i14 % 128;
                        if (i14 % 2 == 0) {
                            int i15 = 5 / 2;
                        }
                        i5 = 0;
                        i10 = -1;
                        f = 0.0f;
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
            System.arraycopy(cArr2, i6, cArr3, 0, i7);
            if (bArr != null) {
                char[] cArr4 = new char[i7];
                setvideostabilizationmode.b = 0;
                char c = 0;
                while (setvideostabilizationmode.b < i7) {
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i16 = setvideostabilizationmode.b;
                        Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) (-1);
                            byte b4 = (byte) (b3 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 3225 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 12 - TextUtils.lastIndexOf("", '0'), 2133916302, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i2 = $10 + 121;
                        $11 = i2 % 128;
                    } else {
                        int i17 = setvideostabilizationmode.b;
                        Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) (-1);
                            byte b6 = (byte) (b5 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1754, View.getDefaultSize(0, 0) + 23, 387247676, false, $$g(b5, b6, (byte) (b6 + 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i17] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                        i2 = $11 + 109;
                        $10 = i2 % 128;
                    }
                    int i18 = i2 % 2;
                    c = cArr4[setvideostabilizationmode.b];
                    Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) (-1);
                        byte b8 = (byte) (b7 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41289 - AndroidCharacter.getMirror('0')), 1704 - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.lastIndexOf("", '0') + 22, -1434471773, false, $$g(b7, b8, (byte) (b8 | 6)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i9 > 0) {
                char[] cArr5 = new char[i7];
                i = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i7);
                int i19 = i7 - i9;
                System.arraycopy(cArr5, 0, cArr3, i19, i9);
                System.arraycopy(cArr5, i9, cArr3, 0, i19);
            } else {
                i = 0;
            }
            if (z) {
                char[] cArr6 = new char[i7];
                while (true) {
                    setvideostabilizationmode.b = i;
                    if (setvideostabilizationmode.b >= i7) {
                        break;
                    }
                    int i20 = $11 + 19;
                    $10 = i20 % 128;
                    int i21 = i20 % 2;
                    cArr6[setvideostabilizationmode.b] = cArr3[(i7 - setvideostabilizationmode.b) - 1];
                    i = setvideostabilizationmode.b + 1;
                }
                cArr3 = cArr6;
            }
            if (i8 > 0) {
                int i22 = 0;
                while (true) {
                    setvideostabilizationmode.b = i22;
                    if (setvideostabilizationmode.b >= i7) {
                        break;
                    }
                    cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                    i22 = setvideostabilizationmode.b + 1;
                }
            }
            objArr[0] = new String(cArr3);
        }

        @Override // defpackage.withValue, java.util.concurrent.Future
        public final V get(long j, TimeUnit timeUnit) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 31533);
                int i2 = 921 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iResolveSizeAndState = 28 - View.resolveSizeAndState(0, 0, 0);
                byte[] bArr = $$a;
                byte b = bArr[7];
                byte b2 = bArr[37];
                Object[] objArr2 = new Object[1];
                a(b, b2, (byte) (b2 & 52), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter, i2, iResolveSizeAndState, -1048449946, false, (String) objArr2[0], null);
            }
            long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new int[]{0, 22, 0, 15}, true, new byte[]{0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new int[]{22, 15, 0, 15}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 31533);
                int minimumFlingVelocity = 921 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 29;
                byte[] bArr2 = $$a;
                byte b3 = bArr2[80];
                Object[] objArr5 = new Object[1];
                a(b3, bArr2[37], b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, minimumFlingVelocity, iIndexOf, -778300370, false, (String) objArr5[0], null);
            }
            if (j2 == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i3 = TuitionPaymentFragmentbindingInflater1 + 7;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                int i4 = i3 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cRed = (char) (Color.red(0) + 31533);
                    int packedPositionType = 921 - ExpandableListView.getPackedPositionType(0L);
                    int iCombineMeasuredStates = 28 - View.combineMeasuredStates(0, 0);
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[80];
                    Object[] objArr6 = new Object[1];
                    a(b4, (byte) (b4 | 51), (byte) (-bArr3[33]), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRed, packedPositionType, iCombineMeasuredStates, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i5 = ((((-1534901443) + (((~(iIdentityHashCode | 856199267)) | (-917880377)) * (-465))) + ((856199267 | (~((-917880377) | iIdentityHashCode))) * 930)) + ((iIdentityHashCode | (-78982681)) * 465)) - 601923212;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(new int[]{37, 26, 175, 0}, false, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new int[]{63, 18, 0, 10}, false, new byte[]{0, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i8 = TuitionPaymentFragmentbindingInflater1 + 61;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                    int i9 = i8 % 2;
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                c(new int[]{81, 16, 98, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new int[]{97, 16, 0, 1}, true, new byte[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1}, objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -601923212};
                    byte[] bArr4 = $$d;
                    byte b5 = bArr4[35];
                    byte b6 = (byte) (b5 - 1);
                    byte b7 = b5;
                    Object[] objArr13 = new Object[1];
                    d(b6, b7, b7, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b8 = bArr4[35];
                    byte b9 = (byte) (b8 - 1);
                    Object[] objArr14 = new Object[1];
                    d(b8, b9, b9, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16808749);
                        int iIndexOf2 = 920 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 28;
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[80];
                        Object[] objArr16 = new Object[1];
                        a(b10, (byte) (b10 | 51), (byte) (-bArr5[33]), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRgb, iIndexOf2, threadPriority, -1142834547, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new int[]{0, 22, 0, 15}, true, new byte[]{0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new int[]{22, 15, 0, 15}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cRgb2 = (char) ((-16745683) - Color.rgb(0, 0, 0));
                            int iIndexOf3 = 920 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            int iMyTid = 28 - (Process.myTid() >> 22);
                            byte[] bArr6 = $$a;
                            byte b11 = bArr6[80];
                            Object[] objArr19 = new Object[1];
                            a(b11, bArr6[37], b11, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb2, iIndexOf3, iMyTid, -778300370, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 31532);
                            int iAxisFromString = 920 - MotionEvent.axisFromString("");
                            int iRed = Color.red(0) + 28;
                            byte[] bArr7 = $$a;
                            byte b12 = bArr7[7];
                            byte b13 = bArr7[37];
                            Object[] objArr20 = new Object[1];
                            a(b12, b13, (byte) (b13 & 52), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iAxisFromString, iRed, -1048449946, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr15;
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
            if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr == null) {
                    throw null;
                }
                for (String str : strArr) {
                    int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                    TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                    int i11 = i10 % 2;
                    arrayList.add(str);
                }
                throw null;
            }
            int i12 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i13 = (-769657595) + ((1765387803 | iIdentityHashCode2) * 614);
            int i14 = ~iIdentityHashCode2;
            int i15 = i12 + i13 + (((~((-157482058) | i14)) | 153136137 | (~(1616597586 | i14))) * (-1228)) + (((~(i14 | 1769733723)) | (~((-4345921) | i14))) * 614);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr21[0])[0] = i17 ^ (i17 << 5);
            return (V) super.get(j, timeUnit);
        }

        @Override // defpackage.withValue, java.util.concurrent.Future
        public final boolean isDone() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            boolean zIsDone = super.isDone();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 == 0) {
                return zIsDone;
            }
            throw null;
        }

        @Override // defpackage.withValue, java.util.concurrent.Future
        public final boolean isCancelled() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                return super.isCancelled();
            }
            super.isCancelled();
            throw null;
        }

        @Override // defpackage.withValue, com.google.common.util.concurrent.ListenableFuture
        public final void addListener(Runnable runnable, Executor executor) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            super.addListener(runnable, executor);
            if (i3 == 0) {
                int i4 = 39 / 0;
            }
            int i5 = TuitionPaymentFragmentbindingInflater1 + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // defpackage.withValue, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            boolean zCancel = super.cancel(z);
            int i4 = TuitionPaymentFragmentbindingInflater1 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 0;
            }
            return zCancel;
        }

        private static String $$g(byte b, byte b2, short s) {
            int i = b + 4;
            int i2 = b2 * 2;
            byte[] bArr = $$c;
            int i3 = s + 99;
            byte[] bArr2 = new byte[1 - i2];
            int i4 = 0 - i2;
            int i5 = -1;
            if (bArr == null) {
                i5 = -1;
                i3 = i + i3;
                i = i;
            }
            while (true) {
                int i6 = i5 + 1;
                bArr2[i6] = (byte) i3;
                int i7 = i + 1;
                if (i6 == i4) {
                    return new String(bArr2, 0);
                }
                i5 = i6;
                i3 = bArr[i7] + i3;
                i = i7;
            }
        }
    }

    removeObserver() {
    }

    public static <V> removeObserver<V> TuitionPaymentFragmentbindingInflater1(ListenableFuture<V> listenableFuture) {
        if (listenableFuture instanceof removeObserver) {
            return (removeObserver) listenableFuture;
        }
        return new DeferrableSurface(listenableFuture);
    }
}
