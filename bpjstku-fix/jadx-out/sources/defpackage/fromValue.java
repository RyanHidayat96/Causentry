package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
final class fromValue {
    private static final byte[] $$c = {94, 6, -99, -107};
    private static final int $$f = 118;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {83, -44, 103, 46, -32, 0, 34, -51, -6, -13, -5, -4, -4, 28, -43, -10, -3, 32, -58, -3, 8, -20, -3, 6, -18, 18, -45, 4, -13, 5, -4, -22, 4, -1, 16, -28, -19, 4, -9, -4, 41, -40, 5, -18, 4, -13, -6, 23, -24, -31, 5, 1, -16, -13, 39, -51, 10, -13, -13, 1, -16, -13, -6, -4, 4, -5, -13, 1, -18, -4, -12, -5, -4, -12, 2, -6, -25, 6, -3, -25, 35, -41, 4, -8, -14, 1, -8, -8, -2, -27, 2, -15, 58};
    private static final int $$e = 119;
    private static final byte[] $$a = {111, 40, 23, -13, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 247;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -6377398940819159759L;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -981105359;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 42460;
    private final List<int[]> b = new ArrayList();
    private final List<String> TuitionPaymentFragmentbindingInflater1 = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = 103 - r7
            int r6 = r6 * 52
            int r6 = 55 - r6
            byte[] r0 = defpackage.fromValue.$$a
            int r8 = r8 * 52
            int r8 = 53 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            int r6 = r6 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r6]
        L28:
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fromValue.a(int, byte, int, java.lang.Object[]):void");
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
    private static void d(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 6
            int r7 = 90 - r7
            int r9 = r9 * 15
            int r9 = 53 - r9
            byte[] r0 = defpackage.fromValue.$$d
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            int r8 = r8 + 1
            r1[r3] = r5
            if (r4 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2b:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-7)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fromValue.d(byte, byte, short, java.lang.Object[]):void");
    }

    fromValue() {
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i5 = $11 + 65;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8327);
                    int maximumFlingVelocity = 1235 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 35;
                    byte b = (byte) i4;
                    byte b2 = (byte) (b + 2);
                    String str$$g = $$g(b, b2, (byte) (b2 - 2));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, maximumFlingVelocity, longPressTimeout, -653973969, false, str$$g, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) i4;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - MotionEvent.axisFromString("")), 2764 - TextUtils.indexOf("", "", i4), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14, 1504416861, false, $$g(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 43325), 253 - TextUtils.getCapsMode("", 0, 0), 'F' - AndroidCharacter.getMirror('0'), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - Color.red(0)), (ViewConfiguration.getTouchSlop() >> 8) + 2891, 17 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2012627446, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
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
        objArr[0] = new String(cArr6);
        int i7 = $11 + 3;
        $10 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    final String TuitionPaymentFragmentbindingInflater1(String str) throws Throwable {
        Object[] objArr;
        char c;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
            int deadChar = KeyEvent.getDeadChar(0, 0) + 876;
            int iNormalizeMetaState = 10 - KeyEvent.normalizeMetaState(0);
            byte b = $$a[5];
            byte b2 = (byte) (-b);
            Object[] objArr2 = new Object[1];
            a(b2, (byte) (b2 + 4), (byte) (-b), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, deadChar, iNormalizeMetaState, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{32923, 29483, 14787, 720}, (char) (ViewConfiguration.getScrollBarSize() >> 8), ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{33122, 7171, 46205, 51525, 19080, 41736, 50902, 59802, 9623, 2555, 61964, 55244, 50146, 40903, 7030, 19785, 56110, 31331, 34337, 21268, 2200, 25872}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{665, 27417, 13825, 6306}, (char) (TextUtils.lastIndexOf("", '0', 0) + 41527), 23795969 - TextUtils.indexOf((CharSequence) "", '0'), new char[]{42884, 63072, 32368, 14353, 11989, 50454, 36025, 52055, 34447, 39732, 62873, 39909, 2314, 15894, 15762}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int i = 877 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int i2 = 10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a((byte) (-bArr[5]), bArr[54], bArr[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, i, i2, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                int iBlue = Color.blue(0) + 876;
                int iBlue2 = 10 - Color.blue(0);
                byte[] bArr2 = $$a;
                byte b3 = bArr2[7];
                Object[] objArr6 = new Object[1];
                a(b3, b3, (byte) (-bArr2[5]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(jumpTapTimeout, iBlue, iBlue2, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iMyTid = Process.myTid();
            int i3 = (((990690120 + (((~((-40575590) | iMyTid)) | (~((~iMyTid) | (-265361)))) * (-318))) + (((~(309043815 | iMyTid)) | (-309309176)) * (-318))) + (((~(iMyTid | (-309043816))) | 268733586) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) - 1824808115;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
            c = 2;
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{17067, 53527, 3284, 48954}, (char) (14860 - TextUtils.indexOf("", "", 0, 0)), (-1) - TextUtils.lastIndexOf("", '0'), new char[]{2834, 20958, 57778, 55762, 47703, 6204, 42125, 53481, 42075, 59120, 35998, 13055, 47360, 24338, 64747, 49028, 31948, 35846, 41359, 13246, 54437, 6330, 33251, 11345, 35291, 24780}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{12810, 62825, 23229, 13110}, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13913), ViewConfiguration.getTouchSlop() >> 8, new char[]{2569, 1292, 54806, 57853, 51631, 51470, 36528, 50544, 38662, 26570, 8930, 30419, 2031, 17673, 53539, 50019, 10573, 30336}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{999, 23227, 21995, 2118}, (char) (18005 - TextUtils.getCapsMode("", 0, 0)), ExpandableListView.getPackedPositionChild(0L) + 1, new char[]{42624, 55402, 9553, 57947, 11007, 1240, 28423, 10443, 64130, 879, 22665, 56939, 16071, 36486, 25543, 64840}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{58075, 17779, 22947, 48595}, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 54105), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, new char[]{19927, 20595, 25385, 24457, 29898, 33377, 34630, 29490, 24736, 5334, 1076, 21070, 11004, 10642, 18245, 13305}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), -1824808115};
                byte[] bArr3 = $$d;
                Object[] objArr13 = new Object[1];
                d(bArr3[5], bArr3[33], bArr3[51], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                d(bArr3[51], (byte) ($$e & 172), bArr3[5], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iRed = Color.red(0) + 876;
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10;
                        byte[] bArr4 = $$a;
                        byte b4 = bArr4[7];
                        Object[] objArr15 = new Object[1];
                        a(b4, b4, (byte) (-bArr4[5]), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, iRed, keyRepeatTimeout, 256017550, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        c(new char[]{0, 0, 0, 0}, new char[]{32923, 29483, 14787, 720}, (char) ((Process.getThreadPriority(0) + 20) >> 6), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{33122, 7171, 46205, 51525, 19080, 41736, 50902, 59802, 9623, 2555, 61964, 55244, 50146, 40903, 7030, 19785, 56110, 31331, 34337, 21268, 2200, 25872}, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        c(new char[]{0, 0, 0, 0}, new char[]{665, 27417, 13825, 6306}, (char) (View.combineMeasuredStates(0, 0) + 41526), ImageFormat.getBitsPerPixel(0) + 23795971, new char[]{42884, 63072, 32368, 14353, 11989, 50454, 36025, 52055, 34447, 39732, 62873, 39909, 2314, 15894, 15762}, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c4 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int maximumFlingVelocity = 876 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 10;
                            byte[] bArr5 = $$a;
                            byte b5 = (byte) (-bArr5[5]);
                            byte b6 = bArr5[54];
                            byte b7 = bArr5[7];
                            Object[] objArr18 = new Object[1];
                            a(b5, b6, b7, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c4, maximumFlingVelocity, touchSlop, 2009631821, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c5 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                            int fadingEdgeLength = 876 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10;
                            byte b8 = $$a[5];
                            byte b9 = (byte) (-b8);
                            Object[] objArr19 = new Object[1];
                            a(b9, (byte) (b9 + 4), (byte) (-b8), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c5, fadingEdgeLength, scrollBarFadeDuration, 252381699, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                c = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i6 = ((int[]) objArr[c])[0];
        int i7 = ((int[]) objArr[0])[0];
        if (i7 != i6) {
            throw new RuntimeException(String.valueOf(i7));
        }
        int i8 = ((int[]) objArr[1])[0];
        Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i9 = (-1822499260) + (((-107608792) | iIdentityHashCode) * 614);
        int i10 = ~iIdentityHashCode;
        int i11 = i8 + i9 + (((~((-770607199) | i10)) | 696647688 | (~((-730296970) | i10))) * (-1228)) + (((~(i10 | (-33649282))) | (~((-73959511) | i10))) * 614);
        int i12 = (i11 << 13) ^ i11;
        int i13 = i12 ^ (i12 >>> 17);
        ((int[]) objArr20[1])[0] = i13 ^ (i13 << 5);
        synchronized (this) {
            if (this.b.isEmpty()) {
                this.b.add(new int[]{0, 19});
                this.TuitionPaymentFragmentbindingInflater1.add("US/CA");
                this.b.add(new int[]{30, 39});
                this.TuitionPaymentFragmentbindingInflater1.add("US");
                int[] iArr = new int[2];
                iArr[0] = 60;
                int i14 = ((int[]) objArr20[1])[0];
                int i15 = ((i14 * i14) - (~(-(72778956 * i14)))) - 1;
                int i16 = -(i14 * 264593286);
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                int i18 = (i17 ^ (-1321497967)) + (((-1321497967) & i17) << 1);
                int i19 = i18 >> 18;
                int i20 = (((i19 | (-32767)) << 1) - (i19 ^ (-32767))) / 16384;
                int i21 = (i18 - (~(((i20 | 1) << 1) - (i20 ^ 1)))) - 1;
                int i22 = i18 >> 25;
                int i23 = ((i22 & (-255)) + (i22 | (-255))) / 128;
                int i24 = -(i21 ^ ((i23 ^ 1) + ((i23 & 1) << 1)));
                int i25 = (i24 ^ 8) + ((i24 & 8) << 1);
                int i26 = i25 >> 16;
                int i27 = (((-131071) ^ i26) + ((i26 & (-131071)) << 1)) / 65536;
                int i28 = ((i27 | 1) << 1) - (i27 ^ 1);
                iArr[4840 / (((-(((i28 | 1) << 1) - (i28 ^ 1))) & i25) * TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO)] = 139;
                this.b.add(iArr);
                this.TuitionPaymentFragmentbindingInflater1.add("US/CA");
                this.b.add(new int[]{300, 379});
                this.TuitionPaymentFragmentbindingInflater1.add("FR");
                this.b.add(new int[]{380});
                this.TuitionPaymentFragmentbindingInflater1.add("BG");
                this.b.add(new int[]{383});
                this.TuitionPaymentFragmentbindingInflater1.add("SI");
                this.b.add(new int[]{385});
                this.TuitionPaymentFragmentbindingInflater1.add("HR");
                this.b.add(new int[]{387});
                this.TuitionPaymentFragmentbindingInflater1.add("BA");
                this.b.add(new int[]{400, 440});
                this.TuitionPaymentFragmentbindingInflater1.add("DE");
                this.b.add(new int[]{450, 459});
                this.TuitionPaymentFragmentbindingInflater1.add("JP");
                this.b.add(new int[]{460, 469});
                this.TuitionPaymentFragmentbindingInflater1.add("RU");
                this.b.add(new int[]{471});
                this.TuitionPaymentFragmentbindingInflater1.add("TW");
                this.b.add(new int[]{474});
                this.TuitionPaymentFragmentbindingInflater1.add("EE");
                this.b.add(new int[]{475});
                this.TuitionPaymentFragmentbindingInflater1.add("LV");
                this.b.add(new int[]{476});
                this.TuitionPaymentFragmentbindingInflater1.add("AZ");
                this.b.add(new int[]{477});
                this.TuitionPaymentFragmentbindingInflater1.add("LT");
                this.b.add(new int[]{478});
                this.TuitionPaymentFragmentbindingInflater1.add("UZ");
                this.b.add(new int[]{479});
                this.TuitionPaymentFragmentbindingInflater1.add("LK");
                this.b.add(new int[]{480});
                this.TuitionPaymentFragmentbindingInflater1.add("PH");
                this.b.add(new int[]{481});
                this.TuitionPaymentFragmentbindingInflater1.add("BY");
                this.b.add(new int[]{482});
                this.TuitionPaymentFragmentbindingInflater1.add("UA");
                this.b.add(new int[]{484});
                this.TuitionPaymentFragmentbindingInflater1.add("MD");
                this.b.add(new int[]{485});
                this.TuitionPaymentFragmentbindingInflater1.add("AM");
                this.b.add(new int[]{486});
                this.TuitionPaymentFragmentbindingInflater1.add("GE");
                this.b.add(new int[]{487});
                this.TuitionPaymentFragmentbindingInflater1.add("KZ");
                this.b.add(new int[]{489});
                this.TuitionPaymentFragmentbindingInflater1.add("HK");
                this.b.add(new int[]{490, 499});
                this.TuitionPaymentFragmentbindingInflater1.add("JP");
                this.b.add(new int[]{500, 509});
                this.TuitionPaymentFragmentbindingInflater1.add("GB");
                this.b.add(new int[]{520});
                this.TuitionPaymentFragmentbindingInflater1.add("GR");
                this.b.add(new int[]{528});
                this.TuitionPaymentFragmentbindingInflater1.add("LB");
                this.b.add(new int[]{529});
                this.TuitionPaymentFragmentbindingInflater1.add("CY");
                this.b.add(new int[]{531});
                this.TuitionPaymentFragmentbindingInflater1.add("MK");
                this.b.add(new int[]{535});
                this.TuitionPaymentFragmentbindingInflater1.add("MT");
                this.b.add(new int[]{539});
                this.TuitionPaymentFragmentbindingInflater1.add("IE");
                this.b.add(new int[]{540, 549});
                this.TuitionPaymentFragmentbindingInflater1.add("BE/LU");
                this.b.add(new int[]{560});
                this.TuitionPaymentFragmentbindingInflater1.add("PT");
                this.b.add(new int[]{569});
                this.TuitionPaymentFragmentbindingInflater1.add("IS");
                this.b.add(new int[]{570, 579});
                this.TuitionPaymentFragmentbindingInflater1.add("DK");
                this.b.add(new int[]{590});
                this.TuitionPaymentFragmentbindingInflater1.add("PL");
                this.b.add(new int[]{594});
                this.TuitionPaymentFragmentbindingInflater1.add("RO");
                this.b.add(new int[]{599});
                this.TuitionPaymentFragmentbindingInflater1.add("HU");
                this.b.add(new int[]{600, 601});
                this.TuitionPaymentFragmentbindingInflater1.add("ZA");
                this.b.add(new int[]{TypedValues.MotionType.TYPE_EASING});
                this.TuitionPaymentFragmentbindingInflater1.add("GH");
                this.b.add(new int[]{TypedValues.MotionType.TYPE_DRAW_PATH});
                this.TuitionPaymentFragmentbindingInflater1.add("BH");
                this.b.add(new int[]{TypedValues.MotionType.TYPE_POLAR_RELATIVETO});
                this.TuitionPaymentFragmentbindingInflater1.add("MU");
                this.b.add(new int[]{TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE});
                this.TuitionPaymentFragmentbindingInflater1.add("MA");
                this.b.add(new int[]{613});
                this.TuitionPaymentFragmentbindingInflater1.add("DZ");
                this.b.add(new int[]{616});
                this.TuitionPaymentFragmentbindingInflater1.add("KE");
                this.b.add(new int[]{618});
                this.TuitionPaymentFragmentbindingInflater1.add("CI");
                this.b.add(new int[]{619});
                this.TuitionPaymentFragmentbindingInflater1.add("TN");
                this.b.add(new int[]{621});
                this.TuitionPaymentFragmentbindingInflater1.add("SY");
                this.b.add(new int[]{622});
                this.TuitionPaymentFragmentbindingInflater1.add("EG");
                this.b.add(new int[]{624});
                this.TuitionPaymentFragmentbindingInflater1.add("LY");
                this.b.add(new int[]{625});
                this.TuitionPaymentFragmentbindingInflater1.add("JO");
                this.b.add(new int[]{626});
                this.TuitionPaymentFragmentbindingInflater1.add("IR");
                this.b.add(new int[]{627});
                this.TuitionPaymentFragmentbindingInflater1.add("KW");
                this.b.add(new int[]{628});
                this.TuitionPaymentFragmentbindingInflater1.add("SA");
                this.b.add(new int[]{629});
                this.TuitionPaymentFragmentbindingInflater1.add("AE");
                this.b.add(new int[]{640, 649});
                this.TuitionPaymentFragmentbindingInflater1.add("FI");
                this.b.add(new int[]{690, 695});
                this.TuitionPaymentFragmentbindingInflater1.add("CN");
                this.b.add(new int[]{TypedValues.TransitionType.TYPE_DURATION, 709});
                this.TuitionPaymentFragmentbindingInflater1.add("NO");
                this.b.add(new int[]{729});
                this.TuitionPaymentFragmentbindingInflater1.add("IL");
                this.b.add(new int[]{730, 739});
                this.TuitionPaymentFragmentbindingInflater1.add("SE");
                this.b.add(new int[]{740});
                this.TuitionPaymentFragmentbindingInflater1.add("GT");
                this.b.add(new int[]{741});
                this.TuitionPaymentFragmentbindingInflater1.add("SV");
                this.b.add(new int[]{742});
                this.TuitionPaymentFragmentbindingInflater1.add("HN");
                this.b.add(new int[]{743});
                this.TuitionPaymentFragmentbindingInflater1.add("NI");
                this.b.add(new int[]{744});
                this.TuitionPaymentFragmentbindingInflater1.add("CR");
                this.b.add(new int[]{745});
                this.TuitionPaymentFragmentbindingInflater1.add("PA");
                this.b.add(new int[]{746});
                this.TuitionPaymentFragmentbindingInflater1.add("DO");
                this.b.add(new int[]{750});
                this.TuitionPaymentFragmentbindingInflater1.add("MX");
                this.b.add(new int[]{754, 755});
                this.TuitionPaymentFragmentbindingInflater1.add("CA");
                this.b.add(new int[]{759});
                this.TuitionPaymentFragmentbindingInflater1.add("VE");
                this.b.add(new int[]{760, 769});
                this.TuitionPaymentFragmentbindingInflater1.add("CH");
                this.b.add(new int[]{770});
                this.TuitionPaymentFragmentbindingInflater1.add("CO");
                this.b.add(new int[]{773});
                this.TuitionPaymentFragmentbindingInflater1.add("UY");
                this.b.add(new int[]{775});
                this.TuitionPaymentFragmentbindingInflater1.add("PE");
                this.b.add(new int[]{777});
                this.TuitionPaymentFragmentbindingInflater1.add("BO");
                this.b.add(new int[]{779});
                this.TuitionPaymentFragmentbindingInflater1.add("AR");
                this.b.add(new int[]{780});
                this.TuitionPaymentFragmentbindingInflater1.add("CL");
                this.b.add(new int[]{784});
                this.TuitionPaymentFragmentbindingInflater1.add("PY");
                this.b.add(new int[]{785});
                this.TuitionPaymentFragmentbindingInflater1.add("PE");
                this.b.add(new int[]{786});
                this.TuitionPaymentFragmentbindingInflater1.add("EC");
                this.b.add(new int[]{789, 790});
                this.TuitionPaymentFragmentbindingInflater1.add("BR");
                this.b.add(new int[]{800, 839});
                this.TuitionPaymentFragmentbindingInflater1.add("IT");
                this.b.add(new int[]{840, 849});
                this.TuitionPaymentFragmentbindingInflater1.add("ES");
                this.b.add(new int[]{850});
                this.TuitionPaymentFragmentbindingInflater1.add("CU");
                this.b.add(new int[]{858});
                this.TuitionPaymentFragmentbindingInflater1.add("SK");
                this.b.add(new int[]{859});
                this.TuitionPaymentFragmentbindingInflater1.add("CZ");
                this.b.add(new int[]{860});
                this.TuitionPaymentFragmentbindingInflater1.add("YU");
                this.b.add(new int[]{865});
                this.TuitionPaymentFragmentbindingInflater1.add("MN");
                this.b.add(new int[]{867});
                this.TuitionPaymentFragmentbindingInflater1.add("KP");
                this.b.add(new int[]{868, 869});
                this.TuitionPaymentFragmentbindingInflater1.add("TR");
                this.b.add(new int[]{870, 879});
                this.TuitionPaymentFragmentbindingInflater1.add("NL");
                this.b.add(new int[]{880});
                this.TuitionPaymentFragmentbindingInflater1.add("KR");
                this.b.add(new int[]{885});
                this.TuitionPaymentFragmentbindingInflater1.add("TH");
                this.b.add(new int[]{888});
                this.TuitionPaymentFragmentbindingInflater1.add("SG");
                this.b.add(new int[]{890});
                this.TuitionPaymentFragmentbindingInflater1.add("IN");
                this.b.add(new int[]{893});
                this.TuitionPaymentFragmentbindingInflater1.add("VN");
                this.b.add(new int[]{896});
                this.TuitionPaymentFragmentbindingInflater1.add("PK");
                this.b.add(new int[]{899});
                this.TuitionPaymentFragmentbindingInflater1.add("ID");
                this.b.add(new int[]{900, 919});
                this.TuitionPaymentFragmentbindingInflater1.add("AT");
                this.b.add(new int[]{930, 939});
                this.TuitionPaymentFragmentbindingInflater1.add("AU");
                this.b.add(new int[]{940, 949});
                this.TuitionPaymentFragmentbindingInflater1.add("AZ");
                this.b.add(new int[]{955});
                this.TuitionPaymentFragmentbindingInflater1.add("MY");
                this.b.add(new int[]{958});
                this.TuitionPaymentFragmentbindingInflater1.add("MO");
            }
        }
        int i29 = Integer.parseInt(str.substring(0, 3));
        int size = this.b.size();
        for (int i30 = 0; i30 < size; i30++) {
            int[] iArr2 = this.b.get(i30);
            int i31 = iArr2[0];
            if (i29 < i31) {
                return null;
            }
            if (iArr2.length != 1) {
                i31 = iArr2[1];
            }
            if (i29 <= i31) {
                return this.TuitionPaymentFragmentbindingInflater1.get(i30);
            }
        }
        return null;
    }

    private static String $$g(short s, int i, byte b) {
        int i2 = 4 - (s * 3);
        byte[] bArr = $$c;
        int i3 = 104 - i;
        int i4 = b * 3;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3 = (-i3) + i5;
            i2++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i3 = (-bArr[i2]) + i3;
            i2++;
            i6 = i7;
        }
    }
}
