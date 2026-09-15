package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class getErrorEdge {
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Pattern TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {8, -36, 87, -65};
    private static final int $$f = 102;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {58, 66, -1, 15, -23, -10, -3, -14, -9, -25, -8, 2, 6, -24, -12, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$e = 9;
    private static final byte[] $$a = {87, -91, 60, 112, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
    private static final int $$b = 152;
    private static int d = 0;
    private static int asBinder = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -6377398940819159759L;
    private static int b = 912606456;
    private static char TuitionPaymentFragmentbindingInflater1 = 34097;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r0 = 11 - r6
            int r7 = r7 * 10
            int r7 = 13 - r7
            int r5 = r5 * 3
            int r5 = r5 + 97
            byte[] r1 = defpackage.getErrorEdge.$$a
            byte[] r0 = new byte[r0]
            int r6 = 10 - r6
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r5
            r5 = r6
            r3 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r7]
        L2b:
            int r5 = r5 + r4
            int r5 = r5 + (-5)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getErrorEdge.a(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 15
            int r8 = 99 - r8
            int r9 = r9 * 41
            int r9 = r9 + 12
            byte[] r0 = defpackage.getErrorEdge.$$d
            int r7 = r7 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2d
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getErrorEdge.e(int, short, byte, java.lang.Object[]):void");
    }

    public getErrorEdge() {
        this("(?:dtSInfo;desc=\"?)(.*?)(?:\"|;|$)");
    }

    private getErrorEdge(String str) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Pattern.compile(str);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 50;
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2;
        int i3 = 2 % 2;
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
        while (true) {
            obj = null;
            if (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >= length3) {
                break;
            }
            int i4 = $11 + 35;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - (ViewConfiguration.getTapTimeout() >> 16)), 1235 - (ViewConfiguration.getScrollBarSize() >> 8), 35 - ExpandableListView.getPackedPositionType(0L), -653973969, false, $$g(b2, b3, (byte) (b3 + 2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2764, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13, 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.MeasureSpec.getSize(0) + 43325), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 254, 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 65200), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2891, 17 - (KeyEvent.getMaxKeyCode() >> 16), 2012627446, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = sessionProcessor.b;
                            cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) b) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))));
                            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                            i2 = 2;
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
        int i6 = $10 + 85;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<String> list) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        char c = 2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int iGreen = Color.green(0) + 876;
            int iAlpha = Color.alpha(0) + 10;
            byte b2 = $$a[11];
            byte b3 = b2;
            Object[] objArr3 = new Object[1];
            a(b2, b3, (byte) (b3 + 1), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, iGreen, iAlpha, -1199417970, false, (String) objArr3[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{1168, 25228, 57385, 64979}, (char) ExpandableListView.getPackedPositionType(0L), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, new char[]{57231, 45364, 60291, 7450, 60097, 9856, 53066, 61819, 31982, 29255, 52439, 44154, 2821, 4110, 56138, 38338, 27591, 28641, 54521, 23190, 12793, 62048}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{31252, 28437, 58525, 26115}, (char) (996 - View.combineMeasuredStates(0, 0)), (-1653664390) - ((Process.getThreadPriority(0) + 20) >> 6), new char[]{16598, 63981, 18928, 61436, 20881, 8745, 26645, 8767, 22809, 46956, 44177, 35875, 47881, 61246, 63619}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 876;
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 10;
            byte[] bArr = $$a;
            byte b4 = bArr[11];
            Object[] objArr6 = new Object[1];
            a((byte) (b4 + 1), bArr[17], b4, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, maximumFlingVelocity, iIndexOf, 254769921, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = asBinder + 49;
            d = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 876;
                int iKeyCodeFromString = 10 - KeyEvent.keyCodeFromString("");
                byte b5 = $$a[11];
                byte b6 = b5;
                Object[] objArr7 = new Object[1];
                a(b6, (byte) (b6 + 3), b5, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cNormalizeMetaState, capsMode, iKeyCodeFromString, 1324201839, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iMyPid = Process.myPid();
            int i4 = ~iMyPid;
            int i5 = ((((-71045592) + (((~(i4 | (-177586800))) | 217897028) * (-1042))) + (((-177586800) | iMyPid) * 521)) + ((((~(iMyPid | (-217897029))) | 73930752) | (~(i4 | (-33620524)))) * 521)) - 1405518281;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{64250, 3487, 21386, 57386}, (char) (TextUtils.indexOf("", "", 0, 0) + 10835), (-1) - TextUtils.lastIndexOf("", '0', 0), new char[]{59017, 35840, 33106, 46478, 58446, 50184, 28925, 39314, 24745, 35164, 46366, 29758, 23144, 2426, 51355, 55638}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{25194, 2245, 34753, 24146}, (char) (21126 - ((byte) KeyEvent.getModifierMetaStateMask())), ViewConfiguration.getLongPressTimeout() >> 16, new char[]{52099, 15697, 39213, 20286, 39270, 43436, 43553, 48245, 59722, 39989, 41976, 5073, 25942, 54561, 48198, 37320}, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            int i8 = asBinder + 107;
            d = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr11 = {Integer.valueOf(iIntValue), -1405518281};
                byte[] bArr2 = $$d;
                byte b7 = bArr2[2];
                byte b8 = bArr2[18];
                Object[] objArr12 = new Object[1];
                e(b7, b8, b8, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b9 = (byte) (-bArr2[5]);
                byte b10 = bArr2[16];
                Object[] objArr13 = new Object[1];
                e(b9, b10, b10, objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                    int iIndexOf2 = 875 - TextUtils.indexOf((CharSequence) "", '0');
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 10;
                    byte b11 = $$a[11];
                    byte b12 = b11;
                    Object[] objArr14 = new Object[1];
                    a(b12, (byte) (b12 + 3), b11, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iIndexOf2, offsetBefore, 1324201839, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{1168, 25228, 57385, 64979}, (char) KeyEvent.getDeadChar(0, 0), Color.blue(0), new char[]{57231, 45364, 60291, 7450, 60097, 9856, 53066, 61819, 31982, 29255, 52439, 44154, 2821, 4110, 56138, 38338, 27591, 28641, 54521, 23190, 12793, 62048}, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{31252, 28437, 58525, 26115}, (char) (MotionEvent.axisFromString("") + 997), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 1653664389, new char[]{16598, 63981, 18928, 61436, 20881, 8745, 26645, 8767, 22809, 46956, 44177, 35875, 47881, 61246, 63619}, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int i10 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 875;
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10;
                        byte[] bArr3 = $$a;
                        byte b13 = bArr3[11];
                        Object[] objArr17 = new Object[1];
                        a((byte) (b13 + 1), bArr3[17], b13, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(longPressTimeout, i10, keyRepeatDelay, 254769921, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                        int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 876;
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 10;
                        byte b14 = $$a[11];
                        byte b15 = b14;
                        Object[] objArr18 = new Object[1];
                        a(b14, b15, (byte) (b15 + 1), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, capsMode2, windowTouchSlop, -1199417970, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    c = 2;
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
        int i11 = ((int[]) objArr[c])[0];
        int i12 = ((int[]) objArr[0])[0];
        if (i12 == i11) {
            int i13 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i14 = i13 + 1953845524 + (((~(486257933 | iIdentityHashCode)) | (-526568163)) * (-948)) + ((~((~iIdentityHashCode) | (-50350819))) * (-948)) + 1898955020;
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr2[1])[0] = i16 ^ (i16 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i12];
            int i17 = i12 - 1;
            iArr[i17] = 1;
            Toast.makeText((Context) null, iArr[((i12 * i17) % 2) - 1], 1).show();
            int i18 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i19 = ~((int) Process.getStartElapsedRealtime());
            int i20 = i18 + ((((-942559356) + (((~(33549182 | i19)) | 6761046) * (-828))) + ((i19 | 33549182) * (-828))) - 2008919748);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr2[1])[0] = i22 ^ (i22 << 5);
        }
        if (list == null) {
            int i23 = d + 61;
            asBinder = i23 % 128;
            int i24 = i23 % 2;
            return null;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            int i25 = asBinder + 35;
            d = i25 % 128;
            if (i25 % 2 != 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.matcher(it.next()).find();
                obj.hashCode();
                throw null;
            }
            Matcher matcher = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.matcher(it.next());
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                if (strGroup == null) {
                    return strGroup;
                }
                int i26 = asBinder + 53;
                d = i26 % 128;
                int i27 = i26 % 2;
                int length = strGroup.length();
                int i28 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (length <= i28) {
                    return strGroup;
                }
                int i29 = ((int[]) objArr2[1])[0];
                int i30 = i29 * i29;
                int i31 = -(1871268702 * i29);
                int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
                int i33 = -(i29 * (-2145267922));
                int i34 = (i32 & i33) + (i33 | i32);
                int i35 = (i34 & 2020749092) + (2020749092 | i34);
                int i36 = i35 >> 20;
                int i37 = ((i36 ^ (-8191)) + ((i36 & (-8191)) << 1)) / 4096;
                int i38 = (i37 & 1) + (i37 | 1);
                int i39 = (i35 ^ i38) + ((i38 & i35) << 1);
                int i40 = i35 >> 17;
                int i41 = (-(i39 ^ (((((-65535) & i40) + (i40 | (-65535))) / 32768) + 1))) + 1;
                return strGroup.substring(0 / ((i41 & (-((((i41 >> 23) - 1023) / 512) + 2))) * 1935), i28);
            }
        }
        return null;
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
    private static java.lang.String $$g(short r5, byte r6, byte r7) {
        /*
            int r7 = 104 - r7
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r5 = r5 * 2
            int r0 = 1 - r5
            byte[] r1 = defpackage.getErrorEdge.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r1[r6]
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            int r6 = r6 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getErrorEdge.$$g(short, byte, byte):java.lang.String");
    }
}
