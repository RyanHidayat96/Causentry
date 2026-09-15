package com.bpjstku.presentation.membership.devicebinding;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.databinding.ActivityDeviceUnlinkingOtpBinding;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class DeviceUnlinkingOtpActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityDeviceUnlinkingOtpBinding> {
    public static final DeviceUnlinkingOtpActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;
    private static int g;
    private static final byte[] $$c = {12, -88, 33, 118};
    private static final int $$f = 115;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {91, -17, 90, 37, -4, 20, -5, 16, 10, 2, -29, 34, 8, 16, 13, -4, 4, 10, 3, 20, -42, 41, 24, -4, 13, 6};
    private static final int $$e = 116;
    private static final byte[] $$a = {102, -96, -78, -55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 95;
    private static int asBinder = 0;
    private static int d = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 52
            int r9 = 56 - r9
            byte[] r0 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity$bindingInflater$1.$$a
            int r7 = r7 * 52
            int r7 = r7 + 1
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r5 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2c:
            int r9 = -r9
            int r8 = r8 + r9
            int r8 = r8 + (-11)
            int r9 = r3 + 1
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity$bindingInflater$1.a(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 22
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity$bindingInflater$1.$$d
            int r5 = r5 * 14
            int r5 = r5 + 98
            int r6 = r6 * 22
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r5 = r6
            r4 = r7
            r3 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r7]
        L29:
            int r7 = r7 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-7)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity$bindingInflater$1.e(byte, byte, short, java.lang.Object[]):void");
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i3 = $10 + 91;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - (ViewConfiguration.getPressedStateDuration() >> 16)), 1235 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 34 - MotionEvent.axisFromString(""), -653973969, false, $$g(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2764, TextUtils.getTrimmedLength("") + 14, 1504416861, false, $$g(b4, b5, (byte) (b5 + 2)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (KeyEvent.getMaxKeyCode() >> 16)), TextUtils.indexOf("", "", 0, 0) + 253, 22 - KeyEvent.getDeadChar(0, 0), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 2892 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 17, 2012627446, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) b) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
        int i5 = $10 + 85;
        $11 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final ActivityDeviceUnlinkingOtpBinding TuitionPaymentFragmentbindingInflater1(LayoutInflater layoutInflater) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (37567 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
            int i2 = 625 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 14;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            byte b3 = bArr[5];
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i2, iNormalizeMetaState, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{21665, 29601, 3271, 24413}, (char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.getOffsetBefore("", 0), new char[]{8592, 20661, 12952, 32147, 52970, 61815, 41600, 21032, 61077, 39409, 18268, 54372, 49061, 49807, 47680, 8010, 30546, 5621, 61645, 60699, 12764, 7673}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{14737, 60258, 52192, 18053}, (char) (34251 - View.MeasureSpec.makeMeasureSpec(0, 0)), (-521444807) - ExpandableListView.getPackedPositionType(0L), new char[]{62967, 40135, 61774, 16815, 35264, 44986, 25109, 44481, 45227, 30685, 36025, 58908, 19615, 34473, 25334}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMakeMeasureSpec = (char) (37567 - View.MeasureSpec.makeMeasureSpec(0, 0));
            int i3 = 624 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int gidForName = Process.getGidForName("") + 15;
            byte[] bArr2 = $$a;
            byte b4 = bArr2[5];
            Object[] objArr5 = new Object[1];
            a(b4, bArr2[7], b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec, i3, gidForName, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 37567);
                int iMyPid = 625 - (Process.myPid() >> 22);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 15;
                byte[] bArr3 = $$a;
                byte b5 = bArr3[5];
                byte b6 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b5, b6, b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, iMyPid, packedPositionChild, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr7[2])[0];
            int i5 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int i6 = (int) Runtime.getRuntime().totalMemory();
            int i7 = ~i6;
            int i8 = (-1838244064) + (((~((-890929512) | i7)) | (~((-932808610) | i7))) * (-867)) + (((~((-890929512) | i6)) | 890798369 | (~((-932808610) | i6))) * (-1734)) + (((~(i6 | (-42010241))) | (~(i7 | (-890798370))) | (~((-131143) | i6))) * 867) + 869051563;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
            objArr = new Object[]{new int[]{i5}, new int[1], new int[]{i4}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{13454, 1133, 49125, 5820}, (char) (48320 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ViewConfiguration.getMaximumFlingVelocity() >> 16, new char[]{10546, 45845, 43594, 52487, 18901, 59157, 30675, 26803, 49282, 40862, 41282, 23020, 24650, 36729, 13574, 8464, 38755, 13006, 42540, 30630, 31045, 52538, 31766, 45516, 54083, 8085}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{43189, 59056, 30733, 27088}, (char) (TextUtils.getOffsetBefore("", 0) + 53368), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{10009, 39636, 34553, 60545, 33950, 13538, 60891, 318, 12767, 8589, 44862, 45921, 19402, 16727, 32222, 20048, 4223, 10500}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{14171, 27501, 55867, 7518}, (char) (24283 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), TextUtils.indexOf("", "", 0, 0), new char[]{6703, 51806, 33104, 19419, 35933, 26522, 56781, 35060, 9243, 48867, 45730, 21732, 34827, 45417, 28586, 59708}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{34710, 20039, 53151, 7320}, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 39120), Process.getGidForName("") + 1, new char[]{29458, 26663, 26981, 29321, 40019, 12191, 12548, 29326, 3207, 5699, 5462, 1893, 41170, 49849, 14725, 26521}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{12310, 19650, 57625, 28857}, (char) View.MeasureSpec.getMode(0), ViewConfiguration.getLongPressTimeout() >> 16, new char[]{45240, 25582, 4825, 58865, 48862, 62505, 5661, 26462, 39178, 17064, 38909, 16932, 62123, 35919, 34084, 743, 63190, 31510, 27410, 48092, 52016, 55930, 36576, 32710, 21296, 61558, 55075, 47431, 10789, 4804, 63301, 63398, 30648, 54297, 47265, 58405, 23219, 62319, 14606, 32971, 31532, 30478, 34194, 20805, 53645, 46633, 20756, 31745, 36975, 35458, 19162, 12728, 9604, 33333, 28196, 13167, 7459, 29882, 60864, 57612, 29617, 25028, 64508, 41506}, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{26687, 36335, 16606, 29711}, (char) View.combineMeasuredStates(0, 0), Process.myPid() >> 22, new char[]{21729, 19265, 43594, 52406, 44378, 63976, 31543, 7646, 59273, 3370, 34262, 32376, 51071, 56352, 22318, 54543, 37910, 36821, 3701, 29017, 44493, 44283, 43410, 47127, 45096, 54228, 10811, 8452, 31016, 23377, 55259, 30106, 32528, 38728, 49069, 26850, 6656, 16606, 26857, 1415, 9411, 48082, 56666, 32864, 22491, 42260, 28725, 34037, 41338, 25057, 35625, 52586, 44830, 30950, 17485, 30698, 62462, 3512, 8208, 40731, 55942, 11535, 55614, 61761}, objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, 869051563};
                byte b7 = (byte) ($$d[9] - 1);
                byte b8 = b7;
                Object[] objArr15 = new Object[1];
                e(b7, b8, (byte) (b8 - 1), objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b9 = (byte) 0;
                byte b10 = b9;
                Object[] objArr16 = new Object[1];
                e(b9, b10, (byte) (b10 + 1), objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i11 = ((int[]) objArr17[0])[0];
                int i12 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    int i13 = asBinder + 43;
                    d = i13 % 128;
                    int i14 = i13 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 37568);
                        int maxKeyCode = 625 - (KeyEvent.getMaxKeyCode() >> 16);
                        int keyRepeatDelay = 14 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        byte[] bArr4 = $$a;
                        byte b11 = bArr4[5];
                        byte b12 = bArr4[7];
                        Object[] objArr18 = new Object[1];
                        a(b11, b12, b12, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(bitsPerPixel, maxKeyCode, keyRepeatDelay, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        c(new char[]{0, 0, 0, 0}, new char[]{21665, 29601, 3271, 24413}, (char) TextUtils.indexOf("", "", 0), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, new char[]{8592, 20661, 12952, 32147, 52970, 61815, 41600, 21032, 61077, 39409, 18268, 54372, 49061, 49807, 47680, 8010, 30546, 5621, 61645, 60699, 12764, 7673}, objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        c(new char[]{0, 0, 0, 0}, new char[]{14737, 60258, 52192, 18053}, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 34251), TextUtils.getOffsetBefore("", 0) - 521444807, new char[]{62967, 40135, 61774, 16815, 35264, 44986, 25109, 44481, 45227, 30685, 36025, 58908, 19615, 34473, 25334}, objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 37567);
                            int iKeyCodeFromString = 625 - KeyEvent.keyCodeFromString("");
                            int offsetBefore = 14 - TextUtils.getOffsetBefore("", 0);
                            byte[] bArr5 = $$a;
                            byte b13 = bArr5[5];
                            Object[] objArr21 = new Object[1];
                            a(b13, bArr5[7], b13, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(capsMode, iKeyCodeFromString, offsetBefore, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char gidForName2 = (char) (Process.getGidForName("") + 37568);
                            int capsMode2 = 625 - TextUtils.getCapsMode("", 0, 0);
                            int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 14;
                            byte[] bArr6 = $$a;
                            byte b14 = bArr6[7];
                            byte b15 = bArr6[5];
                            Object[] objArr22 = new Object[1];
                            a(b14, b15, b15, objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(gidForName2, capsMode2, scrollDefaultDelay2, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i15 = asBinder + 97;
                        d = i15 % 128;
                        int i16 = i15 % 2;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr17;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i17 = ((int[]) objArr[0])[0];
        int i18 = ((int[]) objArr[2])[0];
        if (i18 == i17) {
            int i19 = ((int[]) objArr[1])[0];
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[0])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr = {i20};
            int iIdentityHashCode = System.identityHashCode(this);
            int i22 = ~iIdentityHashCode;
            int i23 = i19 + 934652858 + (((~((-692882814) | i22)) | (-1130855308)) * (-865)) + ((~(iIdentityHashCode | 692882813)) * 865) + (((~((-1130855308) | i22)) | (~(i22 | 692882813))) * 865);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr[1])[0] = i25 ^ (i25 << 5);
            Object[] objArr23 = {new int[]{i21}, new int[1], iArr, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i26 = d + 11;
                asBinder = i26 % 128;
                int i27 = i26 % 2;
                for (String str2 : strArr3) {
                    arrayList.add(str2);
                }
            }
            Toast.makeText((Context) null, i18 / (((i18 - 1) * i18) % 2), 0).show();
            int i28 = ((int[]) objArr[1])[0];
            int i29 = ((int[]) objArr[2])[0];
            int i30 = ((int[]) objArr[0])[0];
            String[] strArr4 = (String[]) objArr[3];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i31 = i28 + (-1468259538) + ((~((-1084227783) | iIdentityHashCode2)) * 623) + (((~iIdentityHashCode2) | 134464512) * (-623)) + (((~(iIdentityHashCode2 | 436987425)) | (~((-1386750696) | iIdentityHashCode2)) | 1084227782) * 623);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr[1])[0] = i33 ^ (i33 << 5);
            Object[] objArr24 = {new int[]{i30}, new int[1], new int[]{i29}, strArr4};
            int i34 = d + 19;
            asBinder = i34 % 128;
            if (i34 % 2 != 0) {
                int i35 = 3 / 3;
            }
        }
        return ActivityDeviceUnlinkingOtpBinding.inflate(layoutInflater);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ ActivityDeviceUnlinkingOtpBinding invoke(LayoutInflater layoutInflater) throws Throwable {
        int i = 2 % 2;
        int i2 = d + 65;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ActivityDeviceUnlinkingOtpBinding activityDeviceUnlinkingOtpBindingTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(layoutInflater);
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        return activityDeviceUnlinkingOtpBindingTuitionPaymentFragmentbindingInflater1;
    }

    static {
        g = 1;
        b();
        TuitionPaymentFragmentbindingInflater1 = new DeviceUnlinkingOtpActivity$bindingInflater$1();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        g = i % 128;
        int i2 = i % 2;
    }

    DeviceUnlinkingOtpActivity$bindingInflater$1() {
        super(1, ActivityDeviceUnlinkingOtpBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityDeviceUnlinkingOtpBinding;", 0);
    }

    static void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -6377398940819159759L;
        b = -981105359;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 34318;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, short r7, int r8) {
        /*
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r8 = r8 + 102
            byte[] r0 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity$bindingInflater$1.$$c
            int r7 = r7 * 4
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity$bindingInflater$1.$$g(short, short, int):java.lang.String");
    }
}
