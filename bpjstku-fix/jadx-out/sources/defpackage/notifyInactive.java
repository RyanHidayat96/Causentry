package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class notifyInactive extends Thread {
    public static AtomicBoolean TuitionPaymentFragmentbindingInflater1;
    public static volatile notifyInactive TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static final String b;
    private static int g;
    public BlockingQueue<TuitionPaymentFragmentbindingInflater1> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new LinkedBlockingQueue();
    private static final byte[] $$c = {94, -56, 58, -24};
    private static final int $$f = 117;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {81, -102, -70, -91, -6, -23, 29, -41, 3, -17, -3, -13, -1, 29, -50, -11, 4, -16, -2, -21, 70, -70, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 58};
    private static final int $$e = 43;
    private static final byte[] $$a = {19, 78, 114, 113, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 27;
    private static int asInterface = 0;
    private static int asBinder = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1282a = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 52
            int r0 = 53 - r8
            int r6 = r6 + 84
            byte[] r1 = defpackage.notifyInactive.$$a
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + (-11)
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.notifyInactive.c(byte, short, byte, java.lang.Object[]):void");
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
    private static void e(short r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            int r9 = r9 * 34
            int r9 = r9 + 19
            byte[] r0 = defpackage.notifyInactive.$$d
            int r8 = r8 * 19
            int r8 = 103 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r5 = r2
            goto L2e
        L14:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L18:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2e:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-8)
            r8 = r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.notifyInactive.e(short, byte, int, java.lang.Object[]):void");
    }

    static {
        g = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("DatabaseWriteQueue");
        b = sb.toString();
        TuitionPaymentFragmentbindingInflater1 = new AtomicBoolean(false);
        int i = f1282a + 95;
        g = i % 128;
        int i2 = i % 2;
    }

    private notifyInactive() {
        setName(b);
    }

    public static notifyInactive TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            synchronized (notifyInactive.class) {
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new notifyInactive();
                }
            }
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i4 = asBinder + 115;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Database write queue running ...");
            }
        } else if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i6 = asBinder + 115;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Database write queue running ...");
        }
        while (TuitionPaymentFragmentbindingInflater1.get()) {
            try {
                int i8 = asInterface + 81;
                asBinder = i8 % 128;
                if (i8 % 2 == 0) {
                    Thread.sleep(250L);
                    b();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Thread.sleep(250L);
                b();
            } catch (Exception e2) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.a(e2.toString());
                    return;
                }
                return;
            }
        }
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $11 + 51;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64886 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1356, 38 - Color.alpha(0), 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 47773), 468 - ExpandableListView.getPackedPositionGroup(0L), ExpandableListView.getPackedPositionType(0L) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $11 + 53;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    public final void b() {
        Object[] objArr;
        char c;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
            int maximumFlingVelocity = 876 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int iResolveSizeAndState = 10 - View.resolveSizeAndState(0, 0, 0);
            byte b2 = $$a[5];
            Object[] objArr2 = new Object[1];
            c((byte) 14, (byte) (-b2), b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, maximumFlingVelocity, iResolveSizeAndState, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new char[]{42839, 42806, 60741, 41789, 1972, 39932, 3567, 59359, 40800, 9530, 20252, 12123, 55176, 7560, 38670, 22350, 3622, 21584, 57020, 40640, 18010, 35848, 58908, 50722, 48780, 50328}, KeyEvent.normalizeMetaState(0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new char[]{18880, 18853, 12592, 32586, 5254, 35019, 13568, 57138, 29163, 63809, 23595, 6088, 14613, 49645, 33915, 28550, 57505, 34873, 52634}, (-1) - ExpandableListView.getPackedPositionChild(0L), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c3 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
            int i = 876 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int windowTouchSlop = 10 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            byte[] bArr = $$a;
            byte b3 = bArr[7];
            Object[] objArr5 = new Object[1];
            c(b3, (byte) (-bArr[5]), b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, i, windowTouchSlop, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int touchSlop = 876 - (ViewConfiguration.getTouchSlop() >> 8);
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[0];
                Object[] objArr6 = new Object[1];
                c(b4, (byte) (b4 | 32), bArr2[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarSize, touchSlop, maximumDrawingCacheSize, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i2 = ~iIdentityHashCode;
            int i3 = 733989564 + (((~(iIdentityHashCode | (-79687395))) | (~((-50331670) | i2)) | 10021440) * (-68)) + ((~((-69665955) | i2)) * (-68)) + (((~(79687394 | i2)) | (-119997624)) * 68) + 1622540199;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
            c = 2;
        } else {
            Object[] objArr8 = new Object[1];
            d(new char[]{59888, 59793, 32571, 12611, 47219, 9275, 16491, 43611, 53703, 46916, 61659, 25311, 39201, 36853, 10391, 6839, 16569, 50750, 24955, 54088, 2278, 7772, 22979, 35760, 61468, 22245, 37293, 17396, 48001, 37121}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new char[]{49780, 49687, 63089, 47122, 51260, 21602, 53807, 14367, 64073, 15890, 32914, 61684, 45748, 1700, 22738, 34996, 27423, 20333, 4386, 16652, 9083, 38666}, ViewConfiguration.getScrollBarSize() >> 8, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            d(new char[]{27558, 27596, 62715, 47756, 19859, 53705, 65522, 5585, 21456, 15502, 1324, 56582, 7025, 1124, 56646, 42361, 49885, 19942, 38040, 27861}, View.MeasureSpec.makeMeasureSpec(0, 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(new char[]{12632, 12593, 26808, 9930, 33809, 6232, 5044, 63896, 2420, 41165, 52392, 12631, 16800, 39021, 5367, 18734, 38931, 53691, 23816, 32923}, ViewConfiguration.getPressedStateDuration() >> 16, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 1622540199};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[12];
                byte b6 = bArr3[32];
                Object[] objArr13 = new Object[1];
                e(b5, b6, b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = (byte) (-bArr3[9]);
                byte b8 = bArr3[55];
                Object[] objArr14 = new Object[1];
                e(b7, b8, b8, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cArgb = (char) Color.argb(0, 0, 0, 0);
                        int iLastIndexOf = 875 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 10;
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[0];
                        Object[] objArr16 = new Object[1];
                        c(b9, (byte) (b9 | 32), bArr4[5], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb, iLastIndexOf, iIndexOf, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        d(new char[]{42839, 42806, 60741, 41789, 1972, 39932, 3567, 59359, 40800, 9530, 20252, 12123, 55176, 7560, 38670, 22350, 3622, 21584, 57020, 40640, 18010, 35848, 58908, 50722, 48780, 50328}, ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        d(new char[]{18880, 18853, 12592, 32586, 5254, 35019, 13568, 57138, 29163, 63809, 23595, 6088, 14613, 49645, 33915, 28550, 57505, 34873, 52634}, TextUtils.getCapsMode("", 0, 0), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                            int gidForName = 875 - Process.getGidForName("");
                            int i6 = 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            byte[] bArr5 = $$a;
                            byte b10 = bArr5[7];
                            Object[] objArr19 = new Object[1];
                            c(b10, (byte) (-bArr5[5]), b10, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionType, gidForName, i6, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c4 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 876;
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                            byte b11 = $$a[5];
                            Object[] objArr20 = new Object[1];
                            c((byte) 14, (byte) (-b11), b11, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c4, maxKeyCode, minimumFlingVelocity, 252381699, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
                c = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i7 = ((int[]) objArr[c])[0];
        int i8 = ((int[]) objArr[0])[0];
        if (i8 == i7) {
            int i9 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i10 = ~startUptimeMillis;
            int i11 = i9 + 1108970148 + (((~(154046867 | i10)) | (-194357097) | (~((-154046868) | startUptimeMillis))) * (-564)) + ((~(startUptimeMillis | (-151290113))) * 1128) + (((~((-194357097) | i10)) | 2756755) * 564);
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr21[1])[0] = i13 ^ (i13 << 5);
        } else {
            Toast.makeText((Context) null, i8 / (((i8 - 1) * i8) % 2), 0).show();
            int i14 = ((int[]) objArr[1])[0];
            Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i15 = i14 + 2063533684 + ((245053019 | startElapsedRealtime) * 376) + (((~((~startElapsedRealtime) | 161572664)) | 102371395) * (-376)) + (((~(startElapsedRealtime | (-161572665))) | (-121262436)) * 376);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr22[1])[0] = i17 ^ (i17 << 5);
        }
        synchronized (this) {
            LinkedList<TuitionPaymentFragmentbindingInflater1> linkedList = new LinkedList<>();
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1Poll = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.poll();
            while (tuitionPaymentFragmentbindingInflater1Poll != null) {
                linkedList.add(tuitionPaymentFragmentbindingInflater1Poll);
                tuitionPaymentFragmentbindingInflater1Poll = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.poll();
            }
            if (!linkedList.isEmpty()) {
                getDeferrableSurface.TuitionPaymentFragmentbindingInflater1.b(linkedList, lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().onTransact);
            }
        }
    }

    public static class TuitionPaymentFragmentbindingInflater1 {
        public String TuitionPaymentFragmentbindingInflater1;
        public long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1283a;
        public String b;
        public mergeConfigs g;

        public TuitionPaymentFragmentbindingInflater1(String str, String str2, mergeConfigs mergeconfigs, int i, long j, int i2, String str3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            this.TuitionPaymentFragmentbindingInflater1 = str2;
            this.g = mergeconfigs;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j;
            this.f1283a = i2;
            this.b = str3;
        }
    }

    @Override // java.lang.Thread
    public final void start() {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            TuitionPaymentFragmentbindingInflater1.get();
            throw null;
        }
        if (!TuitionPaymentFragmentbindingInflater1.get()) {
            int i3 = asInterface + 77;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            TuitionPaymentFragmentbindingInflater1.set(true);
            super.start();
        }
        int i5 = asBinder + 65;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 4755858270053442672L;
    }

    private static String $$g(byte b2, byte b3, int i) {
        int i2 = b2 * 3;
        byte[] bArr = $$c;
        int i3 = 3 - (i * 3);
        int i4 = 107 - (b3 * 2);
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 += -i3;
            i3 = i3;
            i5 = -1;
        }
        while (true) {
            int i6 = i3 + 1;
            int i7 = i5 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i2) {
                return new String(bArr2, 0);
            }
            i4 += -bArr[i6];
            i3 = i6;
            i5 = i7;
        }
    }
}
