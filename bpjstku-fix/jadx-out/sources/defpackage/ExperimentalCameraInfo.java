package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ExperimentalCameraInfo {
    private static final Paint TuitionPaymentFragmentbindingInflater1;
    private static final Lock TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final Paint b = new Paint(6);
    private static final Paint TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Paint(7);

    /* JADX INFO: loaded from: classes4.dex */
    interface TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        void TuitionPaymentFragmentbindingInflater1(Canvas canvas, Paint paint, RectF rectF);
    }

    public static boolean TuitionPaymentFragmentbindingInflater1(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079")).contains(Build.MODEL) ? new ReentrantLock() : new b();
        Paint paint = new Paint(7);
        TuitionPaymentFragmentbindingInflater1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    static final class b implements Lock {
        private static final byte[] $$c = {88, ByteCompanionObject.MAX_VALUE, -112, -47};
        private static final int $$f = 139;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {49, -45, -112, 57, 4, -21, -13, 7, -23, -10, 40, -50, -12, -13, 5, 56, -57, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, -8, -6, 2, -7, -15, -1, -20, -6, -14, -7, -6, -14, 0, -8, -27, 4, -5, -27, 33, -43, 2, -10, -16, -1, -10, -10, -4, -29, 0, -17, 57, 5, -23};
        private static final int $$e = 55;
        private static final byte[] $$a = {80, -8, 43, 65, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
        private static final int $$b = 235;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 3481548179252906982L;

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 4
                int r8 = 84 - r8
                int r6 = r6 * 15
                int r6 = r6 + 38
                int r7 = 92 - r7
                byte[] r0 = ExperimentalCameraInfo.b.$$a
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r6
                r4 = r2
                goto L28
            L14:
                r3 = r2
            L15:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r6) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L24:
                int r7 = r7 + 1
                r3 = r0[r7]
            L28:
                int r8 = r8 + r3
                int r8 = r8 + (-11)
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: ExperimentalCameraInfo.b.a(int, byte, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = ExperimentalCameraInfo.b.$$d
                int r6 = r6 * 67
                int r6 = r6 + 4
                int r7 = r7 * 67
                int r7 = r7 + 1
                int r8 = r8 * 16
                int r8 = 114 - r8
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r8 = r6
                r3 = r7
                r4 = r2
                goto L2e
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                r4 = r0[r6]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2e:
                int r6 = -r6
                int r3 = r3 + r6
                int r6 = r8 + 1
                int r8 = r3 + (-9)
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: ExperimentalCameraInfo.b.c(byte, byte, short, java.lang.Object[]):void");
        }

        private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            abortCapture abortcapture = new abortCapture();
            char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
            abortcapture.b = 4;
            int i3 = $11 + 95;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            while (true) {
                obj = null;
                if (abortcapture.b >= cArrB.length) {
                    break;
                }
                abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                int i5 = abortcapture.b;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 64838), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1356, 37 - Process.getGidForName(""), 894276454, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47772 - ImageFormat.getBitsPerPixel(0)), TextUtils.indexOf("", "") + 468, TextUtils.lastIndexOf("", '0') + 14, 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrB, 4, cArrB.length - 4);
            int i6 = $10 + 23;
            $11 = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        b() {
        }

        @Override // java.util.concurrent.locks.Lock
        public final Condition newCondition() {
            int i = 2 % 2;
            throw new UnsupportedOperationException("Should not be called");
        }

        /* JADX WARN: Code duplicated, block: B:23:0x01ff  */
        /* JADX WARN: Type inference failed for: r1v48, types: [boolean, int] */
        @Override // java.util.concurrent.locks.Lock
        public final boolean tryLock() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 876;
                int packedPositionGroup = 10 - ExpandableListView.getPackedPositionGroup(0L);
                byte b = $$a[7];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b2, (byte) (b2 | 89), b, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, scrollDefaultDelay, packedPositionGroup, -1650998592, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            b(new char[]{15343, 23449, 8631, 62033, 15246, 47735, 58067, 22179, 48512, 15472, 26835, 55551, 14208, 46698, 61081, 17026, 43414, 10346, 29891, 50356, 9090, 41562, 64219, 20158, 42380, 9330}, Process.myPid() >> 22, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(new char[]{43487, 15661, 38016, 7192, 43450, 56513, 22497, 47336, 12204, 23240, 56804, 14026, 42426, 53452, 23532, 44268, 15286, 20160, 49637}, ViewConfiguration.getPressedStateDuration() >> 16, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cRed = (char) Color.red(0);
                int i2 = 877 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int iIndexOf = 9 - TextUtils.indexOf((CharSequence) "", '0', 0);
                byte[] bArr = $$a;
                Object[] objArr5 = new Object[1];
                a(bArr[28], (byte) 52, bArr[7], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRed, i2, iIndexOf, 2012020043, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                int i4 = i3 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int iRgb = (-16776340) - Color.rgb(0, 0, 0);
                    int threadPriority = 10 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte[] bArr2 = $$a;
                    byte b3 = bArr2[28];
                    byte b4 = bArr2[7];
                    Object[] objArr6 = new Object[1];
                    a(b3, b4, b4, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iRgb, threadPriority, 2012931276, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int i5 = (int) Runtime.getRuntime().totalMemory();
                int i6 = ~i5;
                int i7 = (-578068204) + (((~(i6 | 977525644)) | (~(937215415 | i6)) | (-1071636416)) * 464) + (((-134421001) | i5) * (-464)) + (((~(i5 | 977525644)) | (-1071636416)) * 464) + 2014130623;
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                b(new char[]{15850, 13438, 4117, 2721, 15755, 54672, 54129, 44627, 48005, 21399, 22897, 8207, 12683, 55694, 57189, 47631, 44971, 18333, 17761, 15432, 9628, 52631, 52065, 46680, 41918, 19350, 29031, 18500, 6539, 12698}, Gravity.getAbsoluteGravity(0, 0), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                b(new char[]{1413, 64543, 45113, 44369, 1510, 7658, 29515, 2467, 33760, 39921, 63821, 34704, 2549, 4591, 32597, 7608, 38886, 36862, 58701, 39864, 7658, 1521}, TextUtils.getOffsetAfter("", 0), objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if (!(!(applicationContext instanceof ContextWrapper))) {
                        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
                        int i11 = i10 % 2;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                    }
                }
                Object[] objArr10 = new Object[1];
                b(new char[]{10754, 7905, 43359, 3407, 10856, 65280, 27177, 43438, 44076, 30989, 57406, 10145, 9829, 62287, 26124, 48566, 47217, 27925, 64570, 15266}, (-1) - TextUtils.lastIndexOf("", '0', 0, 0), objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                b(new char[]{9300, 48485, 14163, 13402, 9277, 23681, 62518, 37044, 41504, 55948, 32295, 7843, 10268, 20612, 63520, 33970, 46615, 52874, 25143, 703}, TextUtils.getTrimmedLength(""), objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
                int i13 = i12 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 2014130623};
                    byte[] bArr3 = $$d;
                    byte b5 = bArr3[50];
                    Object[] objArr13 = new Object[1];
                    c(b5, (byte) (-bArr3[27]), b5, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b6 = bArr3[27];
                    Object[] objArr14 = new Object[1];
                    c((byte) (-b6), bArr3[50], (byte) (-b6), objArr14);
                    objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                            int iLastIndexOf = 875 - TextUtils.lastIndexOf("", '0');
                            int deadChar = KeyEvent.getDeadChar(0, 0) + 10;
                            byte[] bArr4 = $$a;
                            byte b7 = bArr4[28];
                            byte b8 = bArr4[7];
                            Object[] objArr15 = new Object[1];
                            a(b7, b8, b8, objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(threadPriority2, iLastIndexOf, deadChar, 2012931276, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr16 = new Object[1];
                            b(new char[]{15343, 23449, 8631, 62033, 15246, 47735, 58067, 22179, 48512, 15472, 26835, 55551, 14208, 46698, 61081, 17026, 43414, 10346, 29891, 50356, 9090, 41562, 64219, 20158, 42380, 9330}, KeyEvent.keyCodeFromString(""), objArr16);
                            Class<?> cls5 = Class.forName((String) objArr16[0]);
                            Object[] objArr17 = new Object[1];
                            b(new char[]{43487, 15661, 38016, 7192, 43450, 56513, 22497, 47336, 12204, 23240, 56804, 14026, 42426, 53452, 23532, 44268, 15286, 20160, 49637}, TextUtils.getOffsetAfter("", 0), objArr17);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                int i14 = 877 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                int i15 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
                                byte[] bArr5 = $$a;
                                Object[] objArr18 = new Object[1];
                                a(bArr5[28], (byte) 52, bArr5[7], objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, i14, i15, 2012020043, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char mode = (char) View.MeasureSpec.getMode(0);
                                int trimmedLength = 876 - TextUtils.getTrimmedLength("");
                                int iRgb2 = Color.rgb(0, 0, 0) + 16777226;
                                byte b9 = $$a[7];
                                byte b10 = b9;
                                Object[] objArr19 = new Object[1];
                                a(b10, (byte) (b10 | 89), b9, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode, trimmedLength, iRgb2, -1650998592, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[0])[0];
            if (i17 != i16) {
                throw new RuntimeException(String.valueOf(i17));
            }
            int i18 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i19 = ~(((int) Runtime.getRuntime().maxMemory()) | (-850979146));
            int i20 = i18 + (((-935329632) | i19) * (-196)) + 2046470012 + ((i19 | 84350486) * 196);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            Object obj = objArr20[1];
            ((int[]) obj)[0] = i22 ^ (i22 << 5);
            int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i23 % 128;
            int i24 = i23 % 2;
            int i25 = ((int[]) obj)[0];
            int i26 = ((i25 * i25) - (~(-(1648036997 * i25)))) - 1;
            int i27 = -(i25 * 897927971);
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            int i29 = (i28 & (-226433136)) + ((-226433136) | i28);
            int i30 = i29 >> 16;
            int i31 = ((i30 & (-131071)) + (i30 | (-131071))) / 65536;
            int i32 = (i31 & 1) + (i31 | 1);
            int i33 = (i29 & i32) + (i32 | i29);
            int i34 = i29 >> 26;
            int i35 = (((i34 | ComposerKt.defaultsKey) << 1) - (i34 ^ ComposerKt.defaultsKey)) / 64;
            int i36 = (-(((i35 ^ 1) + ((i35 & 1) << 1)) ^ i33)) + 2;
            int i37 = i36 >> 16;
            int i38 = ((i37 & (-131071)) + (i37 | (-131071))) / 65536;
            int i39 = (i38 ^ 1) + ((i38 & 1) << 1);
            return 116 / ((i36 & (-((i39 & 1) + (i39 | 1)))) * 58);
        }

        @Override // java.util.concurrent.locks.Lock
        public final void lock() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // java.util.concurrent.locks.Lock
        public final void lockInterruptibly() throws InterruptedException {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // java.util.concurrent.locks.Lock
        public final boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = i2 + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // java.util.concurrent.locks.Lock
        public final void unlock() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r6, byte r7, int r8) {
            /*
                int r8 = r8 * 4
                int r8 = 1 - r8
                byte[] r0 = ExperimentalCameraInfo.b.$$c
                int r7 = r7 * 3
                int r7 = 107 - r7
                int r6 = r6 * 2
                int r6 = r6 + 4
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r7 = r6
                r3 = r8
                r5 = r2
                goto L27
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r8) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L25:
                r3 = r0[r6]
            L27:
                int r3 = -r3
                int r6 = r6 + 1
                int r7 = r7 + r3
                r3 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: ExperimentalCameraInfo.b.$$g(short, byte, int):java.lang.String");
        }
    }

    public static Lock TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault3(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1 = bitmapPool.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1.setHasAlpha(bitmap.hasAlpha());
        TuitionPaymentFragmentbindingInflater1(bitmap, bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1, matrix);
        return bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault1(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        float fMin = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            return bitmap;
        }
        Bitmap bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1 = bitmapPool.TuitionPaymentFragmentspecialinlinedviewModeldefault1((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1.setHasAlpha(bitmap.hasAlpha());
        if (Log.isLoggable("TransformationUtils", 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1.getWidth();
            bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        TuitionPaymentFragmentbindingInflater1(bitmap, bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1, matrix);
        return bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault2(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        return (bitmap.getWidth() > i || bitmap.getHeight() > i2) ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(bitmapPool, bitmap, i, i2) : bitmap;
    }

    public static Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault2(BitmapPool bitmapPool, Bitmap bitmap, int i) {
        if (!TuitionPaymentFragmentbindingInflater1(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1 = bitmapPool.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Math.round(rectF.width()), Math.round(rectF.height()), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1.setHasAlpha(bitmap.hasAlpha());
        TuitionPaymentFragmentbindingInflater1(bitmap, bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1, matrix);
        return bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static Bitmap TuitionPaymentFragmentbindingInflater1(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        Bitmap.Config config;
        int iMin = Math.min(i, i2);
        float f = iMin;
        float f2 = f / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f / width, f / height);
        float f3 = width * fMax;
        float f4 = fMax * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap bitmapTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(bitmapPool, bitmap);
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            config = Bitmap.Config.RGBA_F16;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1 = bitmapPool.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iMin, iMin, config);
        bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1.setHasAlpha(true);
        Lock lock = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            canvas.drawCircle(f2, f2, f2, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            canvas.drawBitmap(bitmapTuitionPaymentFragmentbindingInflater1, (Rect) null, rectF, TuitionPaymentFragmentbindingInflater1);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapTuitionPaymentFragmentbindingInflater1.equals(bitmap)) {
                bitmapPool.TuitionPaymentFragmentbindingInflater1(bitmapTuitionPaymentFragmentbindingInflater1);
            }
            return bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } catch (Throwable th) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3.unlock();
            throw th;
        }
    }

    public static Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault1(BitmapPool bitmapPool, Bitmap bitmap, final int i) {
        if (i > 0) {
            return TuitionPaymentFragmentbindingInflater1(bitmapPool, bitmap, new TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: ExperimentalCameraInfo.2
                private static final byte[] $$c = {77, -106, 83, 4};
                private static final int $$f = 200;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$d = {84, 10, 24, -102, -6, 19, -29, 31, -13, -33, 31, 19, -13, -34, 46, 7, -6, -9, -63, 63};
                private static final int $$e = 245;
                private static final byte[] $$a = {49, -45, -112, 57, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
                private static final int $$b = ModuleDescriptor.MODULE_VERSION;
                private static int b = 0;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
                private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 8687720723096434156L;

                /* JADX WARN: Code duplicated, block: B:10:0x0027  */
                /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void a(byte r5, int r6, byte r7, java.lang.Object[] r8) {
                    /*
                        int r5 = r5 * 52
                        int r0 = r5 + 1
                        byte[] r1 = defpackage.ExperimentalCameraInfo.AnonymousClass2.$$a
                        int r7 = 103 - r7
                        int r6 = r6 * 52
                        int r6 = 55 - r6
                        byte[] r0 = new byte[r0]
                        r2 = 0
                        if (r1 != 0) goto L15
                        r3 = r7
                        r4 = r2
                        r7 = r5
                        goto L29
                    L15:
                        r3 = r2
                    L16:
                        int r6 = r6 + 1
                        byte r4 = (byte) r7
                        r0[r3] = r4
                        int r4 = r3 + 1
                        if (r3 != r5) goto L27
                        java.lang.String r5 = new java.lang.String
                        r5.<init>(r0, r2)
                        r8[r2] = r5
                        return
                    L27:
                        r3 = r1[r6]
                    L29:
                        int r7 = r7 + r3
                        int r7 = r7 + (-11)
                        r3 = r4
                        goto L16
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ExperimentalCameraInfo.AnonymousClass2.a(byte, int, byte, java.lang.Object[]):void");
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0024  */
                /* JADX WARN: Code duplicated, block: B:8:0x001c  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void d(int r5, byte r6, int r7, java.lang.Object[] r8) {
                    /*
                        int r5 = r5 * 6
                        int r5 = r5 + 98
                        int r7 = r7 + 4
                        byte[] r0 = defpackage.ExperimentalCameraInfo.AnonymousClass2.$$d
                        int r6 = r6 * 16
                        int r1 = r6 + 1
                        byte[] r1 = new byte[r1]
                        r2 = 0
                        if (r0 != 0) goto L14
                        r4 = r6
                        r3 = r2
                        goto L28
                    L14:
                        r3 = r2
                    L15:
                        int r7 = r7 + 1
                        byte r4 = (byte) r5
                        r1[r3] = r4
                        if (r3 != r6) goto L24
                        java.lang.String r5 = new java.lang.String
                        r5.<init>(r1, r2)
                        r8[r2] = r5
                        return
                    L24:
                        int r3 = r3 + 1
                        r4 = r0[r7]
                    L28:
                        int r5 = r5 + r4
                        int r5 = r5 + (-1)
                        goto L15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ExperimentalCameraInfo.AnonymousClass2.d(int, byte, int, java.lang.Object[]):void");
                }

                private static void c(char[] cArr, int i2, Object[] objArr) throws Throwable {
                    int i3 = 2 % 2;
                    abortCapture abortcapture = new abortCapture();
                    char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i2);
                    abortcapture.b = 4;
                    while (abortcapture.b < cArrB.length) {
                        int i4 = $10 + 63;
                        $11 = i4 % 128;
                        int i5 = i4 % 2;
                        abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                        int i6 = abortcapture.b;
                        try {
                            Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 64838), 1356 - KeyEvent.keyCodeFromString(""), 38 - View.combineMeasuredStates(0, 0), 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                            }
                            cArrB[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            Object[] objArr3 = {abortcapture, abortcapture};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 47773), 467 - TextUtils.indexOf((CharSequence) "", '0'), 13 - TextUtils.getTrimmedLength(""), 896083767, false, "n", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    objArr[0] = new String(cArrB, 4, cArrB.length - 4);
                    int i7 = $10 + 1;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        throw null;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:28:0x0204  */
                @Override // ExperimentalCameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                public final void TuitionPaymentFragmentbindingInflater1(Canvas canvas, Paint paint, RectF rectF) throws Throwable {
                    Object[] objArr;
                    char c = 2;
                    int i2 = 2 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 876;
                        int gidForName = 9 - Process.getGidForName("");
                        byte[] bArr = $$a;
                        byte b2 = bArr[7];
                        byte b3 = (byte) (-bArr[5]);
                        Object[] objArr2 = new Object[1];
                        a(b2, b3, (byte) (b3 + 4), objArr2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, iResolveSizeAndState, gidForName, 252381699, false, (String) objArr2[0], null);
                    }
                    Object obj = null;
                    long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                    Object[] objArr3 = new Object[1];
                    c(new char[]{13295, 13198, 23134, 50618, 17411, 27392, 31603, 46572, 19880, 18309, 63835, 14312, 53200, 49655, 32585, 45501, 18926, 16431, 65019, 12915, 52002, 49719, 29659, 48209, 17732, 19559}, ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    c(new char[]{45736, 45773, 53872, 19862, 25485, 47005, 23800, 26995, 52467, 53159, 57045, 60169, 20125, 18891, 22661, 27911, 51385, 51231, 55908}, 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr4);
                    long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                        int i3 = 877 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int maxKeyCode = 10 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte[] bArr2 = $$a;
                        byte b4 = (byte) (-bArr2[5]);
                        Object[] objArr5 = new Object[1];
                        a(b4, b4, bArr2[54], objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, i3, maxKeyCode, 2009631821, false, (String) objArr5[0], null);
                    }
                    if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                        int i4 = b + 9;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                        int i5 = i4 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char c3 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                            int iIndexOf = 875 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            int iRed = 10 - Color.red(0);
                            byte b5 = $$a[7];
                            byte b6 = b5;
                            Object[] objArr6 = new Object[1];
                            a(b5, b6, b6, objArr6);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, iIndexOf, iRed, 256017550, false, (String) objArr6[0], null);
                        }
                        Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                        objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                        int i6 = (~System.identityHashCode(this)) | 637260657;
                        int i7 = 1996602932 + (i6 * 495) + (((~i6) | 74138209) * 495) + 927863990;
                        int i8 = (i7 << 13) ^ i7;
                        int i9 = i8 ^ (i8 >>> 17);
                        ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
                    } else {
                        Object[] objArr8 = new Object[1];
                        c(new char[]{14599, 14694, 57563, 32575, 26812, 48660, 22476, 24824, 18240, 64768, 54756, 58108, 50486, 31601, 21416, 25812, 17214, 64186, 53572, 59243, 49617, 30872, 24444, 26963, 20379, 63201, 56594, 60183, 52630, 29893}, Process.getGidForName("") + 1, objArr8);
                        Class<?> cls2 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        c(new char[]{4648, 4683, 9698, 47645, 29810, 59147, 19220, 14823, 27749, 14398, 51514, 48012, 60936, 48712, 20346, 15756, 26675, 16257, 52618, 48756, 60135, 48550}, (-1) - MotionEvent.axisFromString(""), objArr9);
                        Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                        if (applicationContext != null) {
                            int i10 = b + 57;
                            int i11 = i10 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11;
                            if (i10 % 2 == 0) {
                                boolean z = applicationContext instanceof ContextWrapper;
                                throw null;
                            }
                            if (applicationContext instanceof ContextWrapper) {
                                int i12 = i11 + 35;
                                b = i12 % 128;
                                if (i12 % 2 != 0) {
                                    ((ContextWrapper) applicationContext).getBaseContext();
                                    obj.hashCode();
                                    throw null;
                                }
                                if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                    applicationContext = applicationContext.getApplicationContext();
                                } else {
                                    int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
                                    b = i13 % 128;
                                    int i14 = i13 % 2;
                                    applicationContext = null;
                                }
                            } else {
                                applicationContext = applicationContext.getApplicationContext();
                            }
                        }
                        Object[] objArr10 = new Object[1];
                        c(new char[]{50363, 50385, 57286, 16429, 29293, 59803, 19727, 14180, 47805, 49688, 53040, 46387, 14476, 17458, 18778, 13068, 48816, 50608, 52100, 45280}, KeyEvent.getMaxKeyCode() >> 16, objArr10);
                        Class<?> cls3 = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        c(new char[]{37215, 37174, 41376, 15950, 59460, 2607, 55093, 54495, 61187, 48251, 21772, 22160, 27975, 14875, 54099, 53417, 60260, 48077, 20908, 21340}, ExpandableListView.getPackedPositionGroup(0L), objArr11);
                        int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                        int i15 = b + 49;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                        int i16 = i15 % 2;
                        try {
                            Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 927863990};
                            byte b7 = (byte) ($$e & 3);
                            byte b8 = b7;
                            Object[] objArr13 = new Object[1];
                            d(b7, b8, (byte) (-b8), objArr13);
                            Class<?> cls4 = Class.forName((String) objArr13[0]);
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            Object[] objArr14 = new Object[1];
                            d(b9, b10, (byte) (b10 | 15), objArr14);
                            objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                            if (applicationContext != null) {
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char defaultSize = (char) View.getDefaultSize(0, 0);
                                    int iRed2 = Color.red(0) + 876;
                                    int i17 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10;
                                    byte b11 = $$a[7];
                                    byte b12 = b11;
                                    Object[] objArr15 = new Object[1];
                                    a(b11, b12, b12, objArr15);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(defaultSize, iRed2, i17, 256017550, false, (String) objArr15[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                                try {
                                    Object[] objArr16 = new Object[1];
                                    c(new char[]{13295, 13198, 23134, 50618, 17411, 27392, 31603, 46572, 19880, 18309, 63835, 14312, 53200, 49655, 32585, 45501, 18926, 16431, 65019, 12915, 52002, 49719, 29659, 48209, 17732, 19559}, View.getDefaultSize(0, 0), objArr16);
                                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                                    Object[] objArr17 = new Object[1];
                                    c(new char[]{45736, 45773, 53872, 19862, 25485, 47005, 23800, 26995, 52467, 53159, 57045, 60169, 20125, 18891, 22661, 27911, 51385, 51231, 55908}, Color.green(0), objArr17);
                                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                    Long lValueOf = Long.valueOf(jLongValue2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                                        int keyRepeatDelay = 876 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                        int edgeSlop = 10 - (ViewConfiguration.getEdgeSlop() >> 16);
                                        byte[] bArr3 = $$a;
                                        byte b13 = (byte) (-bArr3[5]);
                                        Object[] objArr18 = new Object[1];
                                        a(b13, b13, bArr3[54], objArr18);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(deadChar, keyRepeatDelay, edgeSlop, 2009631821, false, (String) objArr18[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                        char c4 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                        int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 876;
                                        int mirror = AndroidCharacter.getMirror('0') - '&';
                                        byte[] bArr4 = $$a;
                                        byte b14 = bArr4[7];
                                        byte b15 = (byte) (-bArr4[5]);
                                        Object[] objArr19 = new Object[1];
                                        a(b14, b15, (byte) (b15 + 4), objArr19);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c4, edgeSlop2, mirror, 252381699, false, (String) objArr19[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                } catch (Exception unused) {
                                    throw new RuntimeException();
                                }
                            }
                            c = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    int i18 = ((int[]) objArr[c])[0];
                    int i19 = ((int[]) objArr[0])[0];
                    if (i19 == i18) {
                        int i20 = ((int[]) objArr[1])[0];
                        Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                        int i21 = ~System.identityHashCode(this);
                        int i22 = i20 + (((1213162868 + (((~(i21 | 1055604407)) | (~((-1010967681) | i21))) * (-184))) + (((42473478 | (~((-1053441159) | i21))) | (~(1013130929 | i21))) * 184)) - 398038000);
                        int i23 = (i22 << 13) ^ i22;
                        int i24 = i23 ^ (i23 >>> 17);
                        ((int[]) objArr20[1])[0] = i24 ^ (i24 << 5);
                        int i25 = b + 49;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i25 % 128;
                        int i26 = i25 % 2;
                    } else {
                        Toast.makeText((Context) null, i19 / (((i19 - 1) * i19) % 2), 0).show();
                        int i27 = ((int[]) objArr[1])[0];
                        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                        int i28 = (int) Runtime.getRuntime().totalMemory();
                        int i29 = i27 + (-758182276) + (((~((~i28) | 627201044)) | 42543593) * 446) + (((~(i28 | 669744637)) | 624967680) * 446) + 1794573294;
                        int i30 = (i29 << 13) ^ i29;
                        int i31 = i30 ^ (i30 >>> 17);
                        ((int[]) objArr21[1])[0] = i31 ^ (i31 << 5);
                    }
                    float f = i;
                    canvas.drawRoundRect(rectF, f, f, paint);
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0022  */
                /* JADX WARN: Code duplicated, block: B:8:0x001c  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static java.lang.String $$g(short r5, byte r6, int r7) {
                    /*
                        int r5 = r5 * 4
                        int r5 = r5 + 107
                        int r6 = r6 * 3
                        int r0 = r6 + 1
                        byte[] r1 = defpackage.ExperimentalCameraInfo.AnonymousClass2.$$c
                        int r7 = r7 * 3
                        int r7 = 4 - r7
                        byte[] r0 = new byte[r0]
                        r2 = 0
                        if (r1 != 0) goto L16
                        r4 = r6
                        r3 = r2
                        goto L26
                    L16:
                        r3 = r2
                    L17:
                        byte r4 = (byte) r5
                        r0[r3] = r4
                        if (r3 != r6) goto L22
                        java.lang.String r5 = new java.lang.String
                        r5.<init>(r0, r2)
                        return r5
                    L22:
                        int r3 = r3 + 1
                        r4 = r1[r7]
                    L26:
                        int r7 = r7 + 1
                        int r5 = r5 + r4
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ExperimentalCameraInfo.AnonymousClass2.$$g(short, byte, int):java.lang.String");
                }
            });
        }
        throw new IllegalArgumentException("roundingRadius must be greater than 0.");
    }

    private static void TuitionPaymentFragmentbindingInflater1(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, b);
            canvas.setBitmap(null);
        } finally {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3.unlock();
        }
    }

    private static Bitmap TuitionPaymentFragmentbindingInflater1(BitmapPool bitmapPool, Bitmap bitmap) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            config = Bitmap.Config.RGBA_F16;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        if (config.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1 = bitmapPool.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bitmap.getWidth(), bitmap.getHeight(), config);
        new Canvas(bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    private static Bitmap TuitionPaymentFragmentbindingInflater1(BitmapPool bitmapPool, Bitmap bitmap, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            config = Bitmap.Config.RGBA_F16;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(bitmapPool, bitmap);
        Bitmap bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1 = bitmapPool.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bitmapTuitionPaymentFragmentbindingInflater1.getWidth(), bitmapTuitionPaymentFragmentbindingInflater1.getHeight(), config);
        bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapTuitionPaymentFragmentbindingInflater1, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1.getWidth(), bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1.getHeight());
        Lock lock = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(canvas, paint, rectF);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapTuitionPaymentFragmentbindingInflater1.equals(bitmap)) {
                bitmapPool.TuitionPaymentFragmentbindingInflater1(bitmapTuitionPaymentFragmentbindingInflater1);
            }
            return bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } catch (Throwable th) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3.unlock();
            throw th;
        }
    }
}
