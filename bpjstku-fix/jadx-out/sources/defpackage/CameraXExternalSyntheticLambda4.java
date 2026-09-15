package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraXExternalSyntheticLambda4<Data> implements getSchedulerHandler<byte[], Data> {
    private final TuitionPaymentFragmentbindingInflater1<Data> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public interface TuitionPaymentFragmentbindingInflater1<Data> {
        Data TuitionPaymentFragmentbindingInflater1(byte[] bArr);

        Class<Data> TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    @Override // defpackage.getSchedulerHandler
    public final /* synthetic */ getSchedulerHandler.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1(byte[] bArr, int i, int i2, getTargetRotation gettargetrotation) {
        byte[] bArr2 = bArr;
        return new getSchedulerHandler.TuitionPaymentFragmentbindingInflater1(new setResolutionSelector(bArr2), new TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
    }

    @Override // defpackage.getSchedulerHandler
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(byte[] bArr) {
        return true;
    }

    public CameraXExternalSyntheticLambda4(TuitionPaymentFragmentbindingInflater1<Data> tuitionPaymentFragmentbindingInflater1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentbindingInflater1;
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault2<Data> implements isUseCasesCombinationSupportedByFramework<Data> {
        private final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final TuitionPaymentFragmentbindingInflater1<Data> b;
        private static final byte[] $$c = {117, 50, 102, 124};
        private static final int $$f = 31;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {94, -1, 37, -59, 6, 23, -41, 38, 23, 12, 9, 5, -5, -16, 42, -3, 9, -57, 56, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, -10, 15, 13, -2, 13, 13, 1, -22, 45, 0, 14, -3, 27, -7, 21, -57, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -57};
        private static final int $$e = 237;
        private static final byte[] $$a = {115, 98, 19, 9, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 225;
        private static int asBinder = 0;
        private static int g = 1;
        private static char TuitionPaymentFragmentbindingInflater1 = 55756;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 50651;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 23540;
        private static char asInterface = 51079;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 4
                int r8 = 84 - r8
                byte[] r0 = CameraXExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$a
                int r7 = r7 + 4
                int r6 = r6 * 15
                int r6 = 53 - r6
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r8
                r4 = r2
                r8 = r7
                goto L2e
            L15:
                r3 = r2
            L16:
                int r7 = r7 + 1
                byte r4 = (byte) r8
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                r4 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2e:
                int r3 = r3 + r7
                int r7 = r3 + (-11)
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: CameraXExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2.a(int, int, int, java.lang.Object[]):void");
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
        private static void d(int r7, int r8, byte r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 19
                int r9 = 103 - r9
                byte[] r0 = CameraXExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$d
                int r8 = r8 * 52
                int r8 = 55 - r8
                int r7 = r7 * 4
                int r7 = 53 - r7
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r9
                r5 = r2
                r9 = r8
                goto L2f
            L17:
                r3 = r2
            L18:
                int r8 = r8 + 1
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L29
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L29:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L2f:
                int r3 = r3 + r8
                int r8 = r3 + (-8)
                r3 = r5
                r6 = r9
                r9 = r8
                r8 = r6
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: CameraXExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2.d(int, int, byte, java.lang.Object[]):void");
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte[] bArr, TuitionPaymentFragmentbindingInflater1<Data> tuitionPaymentFragmentbindingInflater1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bArr;
            this.b = tuitionPaymentFragmentbindingInflater1;
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Priority priority, isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1<? super Data> tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i = 2 % 2;
            int i2 = asBinder + 29;
            g = i2 % 128;
            int i3 = i2 % 2;
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            int i4 = asBinder + 115;
            g = i4 % 128;
            int i5 = i4 % 2;
        }

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
            char[] cArr2 = new char[cArr.length - 2];
            oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
            char[] cArr3 = new char[2];
            while (true) {
                int i4 = 0;
                if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                    objArr[0] = new String(cArr2, 0, i);
                    int i5 = $11 + 121;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                int i7 = $10 + 29;
                $11 = i7 % 128;
                int i8 = 58224;
                if (i7 % i2 == 0) {
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                } else {
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                }
                int i9 = 0;
                while (i9 < 16) {
                    int i10 = $11 + 111;
                    $10 = i10 % 128;
                    int i11 = i10 % i2;
                    char c = cArr3[1];
                    char c2 = cArr3[i4];
                    int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)));
                    int i13 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(asInterface);
                        objArr2[i2] = Integer.valueOf(i13);
                        objArr2[1] = Integer.valueOf(i12);
                        objArr2[i4] = Integer.valueOf(c);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cBlue = (char) (Color.blue(i4) + 47773);
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', i4, i4) + 469;
                            int iIndexOf = 12 - TextUtils.indexOf((CharSequence) "", '0', i4, i4);
                            Class[] clsArr = new Class[4];
                            clsArr[i4] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[i2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, iLastIndexOf, iIndexOf, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        onCaptureSessionEnd oncapturesessionend2 = oncapturesessionend;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 47774), (ViewConfiguration.getWindowTouchSlop() >> 8) + 468, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i8 -= 40503;
                        i9++;
                        oncapturesessionend = oncapturesessionend2;
                        i2 = 2;
                        i4 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                onCaptureSessionEnd oncapturesessionend3 = oncapturesessionend;
                cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                Object[] objArr4 = {oncapturesessionend3, oncapturesessionend3};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 2323 - Color.red(0), ExpandableListView.getPackedPositionChild(0L) + 45, -1312321721, false, $$g(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                oncapturesessionend = oncapturesessionend3;
                i2 = 2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0204  */
        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final Class<Data> TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws Throwable {
            Object[] objArr;
            char c;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                int capsMode = 2267 - TextUtils.getCapsMode("", 0, 0);
                int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 33;
                byte[] bArr = $$a;
                byte b = bArr[7];
                Object[] objArr2 = new Object[1];
                a(b, bArr[5], b, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(pressedStateDuration, capsMode, capsMode2, -887667012, false, (String) objArr2[0], null);
            }
            Object obj = null;
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{59200, 30661, 13975, 40397, 2581, 17106, 59777, 56271, 46827, 24498, 10710, 223, 30262, 34573, 39121, 46017, 28573, 8965, 52484, 15625, 4055, 59621, 61787, 65355}, (ViewConfiguration.getTouchSlop() >> 8) + 22, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{11029, 23044, 16132, 5933, 5797, 37238, 23178, 64579, 14036, 53253, 48380, 17659, 9739, 36533, 41502, 21929, 12107, 36246}, Color.blue(0) + 15, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2267;
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 34;
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr5 = new Object[1];
                a(b3, (byte) (b3 | 51), b2, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(deadChar, scrollBarFadeDuration, iLastIndexOf, -874156483, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i2 = asBinder + 65;
                g = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char mode = (char) View.MeasureSpec.getMode(0);
                    int i4 = 2267 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int tapTimeout = 33 - (ViewConfiguration.getTapTimeout() >> 16);
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[132];
                    Object[] objArr6 = new Object[1];
                    a(b4, (byte) (b4 | 102), bArr2[7], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mode, i4, tapTimeout, -654680577, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i5 = ((int[]) objArr7[0])[0];
                int i6 = ((int[]) objArr7[3])[0];
                String[] strArr = (String[]) objArr7[1];
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i7 = ~startElapsedRealtime;
                int i8 = 1605221168 + (((~(i7 | 609005668)) | (-804256768) | (~((-4456549) | startElapsedRealtime))) * 717) + (((~(startElapsedRealtime | 609005668)) | (~(i7 | (-4456549))) | (-804256768)) * 717) + 1831975807;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
                c = 3;
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{42296, 11120, 54282, 41382, 16782, 2621, 14884, 36030, 15013, 25138, 33149, 14684, 26938, 58600, 64661, 58997, 15966, 55614, 26353, 57977, 18866, 42695, 16704, 4091, 13518, 52185, 31092, 62715}, 25 - TextUtils.lastIndexOf("", '0', 0), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{60446, 29068, 50729, 58988, 61983, 29411, 56372, 6978, 39939, 30280, 8855, 49840, 49239, 39866, 18061, 51342, 59161, 65427, 48032, 2174}, 18 - TextUtils.indexOf("", "", 0), objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if (applicationContext instanceof ContextWrapper) {
                        int i11 = asBinder + 93;
                        g = i11 % 128;
                        if (i11 % 2 == 0) {
                            ((ContextWrapper) applicationContext).getBaseContext();
                            obj.hashCode();
                            throw null;
                        }
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            int i12 = g + 43;
                            asBinder = i12 % 128;
                            int i13 = i12 % 2;
                            applicationContext = null;
                        }
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                    }
                }
                Object[] objArr10 = new Object[1];
                c(new char[]{43113, 47771, 46714, 7492, 65045, 18278, 49895, 57475, 32117, 32386, 55024, 48608, 26033, 22334, 26727, 15061, 38249, 62271}, 15 - TextUtils.lastIndexOf("", '0'), objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new char[]{28763, 43003, 22914, 48215, 8264, 26833, 34746, 1742, 48004, 49852, 41429, 25249, 44142, 53752, 42984, 52147, 19622, 58692}, View.MeasureSpec.makeMeasureSpec(0, 0) + 16, objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1831975807};
                    byte[] bArr3 = $$d;
                    byte b5 = bArr3[29];
                    Object[] objArr13 = new Object[1];
                    d(b5, bArr3[46], b5, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b6 = bArr3[29];
                    Object[] objArr14 = new Object[1];
                    d(b6, b6, bArr3[46], objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                            int i14 = 2267 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int iIndexOf = 32 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            byte[] bArr4 = $$a;
                            byte b7 = bArr4[132];
                            Object[] objArr16 = new Object[1];
                            a(b7, (byte) (b7 | 102), bArr4[7], objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarSize, i14, iIndexOf, -654680577, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            c(new char[]{59200, 30661, 13975, 40397, 2581, 17106, 59777, 56271, 46827, 24498, 10710, 223, 30262, 34573, 39121, 46017, 28573, 8965, 52484, 15625, 4055, 59621, 61787, 65355}, View.getDefaultSize(0, 0) + 22, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(new char[]{11029, 23044, 16132, 5933, 5797, 37238, 23178, 64579, 14036, 53253, 48380, 17659, 9739, 36533, 41502, 21929, 12107, 36246}, 15 - (Process.myPid() >> 22), objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                int tapTimeout2 = 2267 - (ViewConfiguration.getTapTimeout() >> 16);
                                int i15 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32;
                                byte b8 = $$a[7];
                                byte b9 = b8;
                                Object[] objArr19 = new Object[1];
                                a(b9, (byte) (b9 | 51), b8, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(threadPriority, tapTimeout2, i15, -874156483, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                                int capsMode3 = 2267 - TextUtils.getCapsMode("", 0, 0);
                                int iResolveSize = View.resolveSize(0, 0) + 33;
                                byte[] bArr5 = $$a;
                                byte b10 = bArr5[7];
                                Object[] objArr20 = new Object[1];
                                a(b10, bArr5[5], b10, objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, capsMode3, iResolveSize, -887667012, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            int i16 = g + 111;
                            asBinder = i16 % 128;
                            int i17 = i16 % 2;
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr15;
                    c = 3;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            if (((int[]) objArr[0])[0] != ((int[]) objArr[c])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr[1];
                if (strArr2 != null) {
                    for (String str : strArr2) {
                        arrayList.add(str);
                    }
                }
                throw null;
            }
            int i18 = asBinder + 39;
            g = i18 % 128;
            int i19 = i18 % 2;
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[0])[0];
            int i22 = ((int[]) objArr[3])[0];
            String[] strArr3 = (String[]) objArr[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i23 = (-488140621) + (((~((-597655488) | iIdentityHashCode)) | 9731236 | (~((-211057829) | iIdentityHashCode))) * (-880));
            int i24 = (~((-597655488) | (~iIdentityHashCode))) | 211057828;
            int i25 = ~(iIdentityHashCode | 597655487);
            int i26 = i20 + i23 + ((i24 | i25) * (-880)) + (i25 * 880);
            int i27 = i26 ^ (i26 << 13);
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr21[2])[0] = i28 ^ (i28 << 5);
            int i29 = g + 31;
            asBinder = i29 % 128;
            int i30 = i29 % 2;
            return this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final DataSource TuitionPaymentFragmentbindingInflater1() {
            DataSource dataSource;
            int i = 2 % 2;
            int i2 = g + 71;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                dataSource = DataSource.LOCAL;
                int i3 = 68 / 0;
            } else {
                dataSource = DataSource.LOCAL;
            }
            int i4 = asBinder + 51;
            g = i4 % 128;
            if (i4 % 2 != 0) {
                return dataSource;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            int i = 2 % 2;
            int i2 = asBinder + 53;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void b() {
            int i = 2 % 2;
            int i2 = asBinder + 49;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        private static String $$g(int i, byte b, byte b2) {
            int i2 = 4 - (b2 * 4);
            byte[] bArr = $$c;
            int i3 = i * 3;
            int i4 = 108 - (b * 3);
            byte[] bArr2 = new byte[1 - i3];
            int i5 = 0 - i3;
            int i6 = -1;
            if (bArr == null) {
                i4 += -i2;
                i2++;
                i6 = -1;
            }
            while (true) {
                int i7 = i6 + 1;
                bArr2[i7] = (byte) i4;
                if (i7 == i5) {
                    return new String(bArr2, 0);
                }
                int i8 = i2;
                i4 += -bArr[i2];
                i2 = i8 + 1;
                i6 = i7;
            }
        }
    }

    public static class b implements getDeviceSurfaceManagerProvider<byte[], ByteBuffer> {
        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<byte[], ByteBuffer> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) {
            return new CameraXExternalSyntheticLambda4(new TuitionPaymentFragmentbindingInflater1<ByteBuffer>() { // from class: CameraXExternalSyntheticLambda4.b.1
                @Override // CameraXExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1
                public final Class<ByteBuffer> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
                    return ByteBuffer.class;
                }

                @Override // CameraXExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1
                public final /* synthetic */ ByteBuffer TuitionPaymentFragmentbindingInflater1(byte[] bArr) {
                    return ByteBuffer.wrap(bArr);
                }
            });
        }
    }

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements getDeviceSurfaceManagerProvider<byte[], InputStream> {
        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<byte[], InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) {
            return new CameraXExternalSyntheticLambda4(new TuitionPaymentFragmentbindingInflater1<InputStream>() { // from class: CameraXExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3.5
                @Override // CameraXExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1
                public final Class<InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
                    return InputStream.class;
                }

                @Override // CameraXExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1
                public final /* synthetic */ InputStream TuitionPaymentFragmentbindingInflater1(byte[] bArr) {
                    return new ByteArrayInputStream(bArr);
                }
            });
        }
    }
}
