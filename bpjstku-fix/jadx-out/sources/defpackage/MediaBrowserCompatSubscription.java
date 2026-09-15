package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowserCompatSubscription {
    private final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final getCallbacks TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final writeToParcel TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {12, 11, -9, -106};
    private static final int $$d = 210;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {19, 78, 114, 113, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 95;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f172a = 0;
    private static int g = 1;
    private static long TuitionPaymentFragmentbindingInflater1 = -6377398940819159759L;
    private static int b = -981105359;
    private static char asInterface = 53772;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r0 = defpackage.MediaBrowserCompatSubscription.$$a
            int r1 = 53 - r7
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-11)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaBrowserCompatSubscription.c(int, int, int, java.lang.Object[]):void");
    }

    public MediaBrowserCompatSubscription(Object obj, getCallbacks getcallbacks, writeToParcel writetoparcel) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = obj;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getcallbacks;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = writetoparcel;
    }

    private static void d(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
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
        int i3 = $10 + 51;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - (Process.myTid() >> 22)), ExpandableListView.getPackedPositionGroup(0L) + 1235, TextUtils.getCapsMode("", 0, 0) + 35, -653973969, false, $$e(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.indexOf("", "") + 2764, 15 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1504416861, false, $$e(b4, b5, (byte) (b5 + 2)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.resolveSizeAndState(0, 0, 0) + 43325), 253 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - KeyEvent.normalizeMetaState(0)), TextUtils.getOffsetAfter("", 0) + 2891, ImageFormat.getBitsPerPixel(0) + 18, 2012627446, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = sessionProcessor.b;
                            cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentbindingInflater1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) b) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) asInterface) ^ (-6377398940819159759L)))));
                            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
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
        int i5 = $11 + 51;
        $10 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Object b() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 101;
        f172a = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = i2 + 21;
        f172a = i5 % 128;
        if (i5 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    public final getCallbacks TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = f172a + 35;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        getCallbacks getcallbacks = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i5 = i3 + 69;
        f172a = i5 % 128;
        int i6 = i5 % 2;
        return getcallbacks;
    }

    public final writeToParcel TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = f172a;
        int i3 = i2 + 51;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        writeToParcel writetoparcel = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = i2 + 53;
        g = i4 % 128;
        int i5 = i4 % 2;
        return writetoparcel;
    }

    /* JADX WARN: Type inference failed for: r2v72, types: [boolean, int] */
    public final boolean equals(Object obj) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = f172a + 25;
        g = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char trimmedLength = (char) TextUtils.getTrimmedLength("");
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 651;
            int absoluteGravity = 44 - Gravity.getAbsoluteGravity(0, 0);
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b2, b2, bArr[80], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength, fadingEdgeLength, absoluteGravity, -459846511, false, (String) objArr2[0], null);
        }
        Object obj2 = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new char[]{0, 0, 0, 0}, new char[]{45469, 14908, 906, 56555}, (char) (ViewConfiguration.getTouchSlop() >> 8), ViewConfiguration.getKeyRepeatDelay() >> 16, new char[]{32606, 31990, 65061, 14311, 17926, 6410, 12898, 44488, 24151, 41703, 29317, 41854, 11172, 59574, 7703, 47619, 3183, 23011, 44481, 43186, 29823, 60883}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new char[]{0, 0, 0, 0}, new char[]{44732, 13220, 53357, 23259}, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 56271), (ViewConfiguration.getTapTimeout() >> 16) + 1832101038, new char[]{42861, 26189, 14911, 28695, 48724, 34410, 11212, 29831, 63241, 35364, 8287, 59680, 26714, 7661, 19015}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 651;
            int iLastIndexOf = 43 - TextUtils.lastIndexOf("", '0', 0);
            byte b3 = (byte) 52;
            Object[] objArr5 = new Object[1];
            c($$a[5], b3, (byte) (b3 - 1), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(edgeSlop, iIndexOf, iLastIndexOf, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char size = (char) View.MeasureSpec.getSize(0);
                int defaultSize = View.getDefaultSize(0, 0) + 651;
                int iAxisFromString = MotionEvent.axisFromString("") + 45;
                byte b4 = $$a[7];
                Object[] objArr6 = new Object[1];
                c(b4, (byte) (b4 | 15), (byte) 51, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size, defaultSize, iAxisFromString, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = (((1745876209 + ((((~(925545299 | iIdentityHashCode)) | 13912232) | (~((-922114490) | iIdentityHashCode))) * (-744))) + (((~iIdentityHashCode) | 17343042) * 744)) + ((iIdentityHashCode | (-13912233)) * 744)) - 2007295474;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[3])[0] = i9 ^ (i9 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (-16775606) - Color.rgb(0, 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 27, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -2007295474, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int iResolveSize = View.resolveSize(0, 0) + 651;
                    int i10 = 45 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte b5 = (byte) 52;
                    Object[] objArr9 = new Object[1];
                    c($$a[5], b5, (byte) (b5 - 1), objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity, iResolveSize, i10, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (-16776521) - Color.rgb(0, 0, 0), TextUtils.getOffsetAfter("", 0) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 63406), 793 - KeyEvent.normalizeMetaState(0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 82), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int iResolveSizeAndState = 651 - View.resolveSizeAndState(0, 0, 0);
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 44;
                    byte b6 = $$a[7];
                    Object[] objArr11 = new Object[1];
                    c(b6, (byte) (b6 | 15), (byte) 51, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatDelay, iResolveSizeAndState, maximumDrawingCacheSize, -1595579076, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                try {
                    Object[] objArr12 = new Object[1];
                    d(new char[]{0, 0, 0, 0}, new char[]{45469, 14908, 906, 56555}, (char) KeyEvent.getDeadChar(0, 0), ExpandableListView.getPackedPositionChild(0L) + 1, new char[]{32606, 31990, 65061, 14311, 17926, 6410, 12898, 44488, 24151, 41703, 29317, 41854, 11172, 59574, 7703, 47619, 3183, 23011, 44481, 43186, 29823, 60883}, objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    d(new char[]{0, 0, 0, 0}, new char[]{44732, 13220, 53357, 23259}, (char) (Color.argb(0, 0, 0, 0) + 56272), 1832101038 - TextUtils.indexOf("", ""), new char[]{42861, 26189, 14911, 28695, 48724, 34410, 11212, 29831, 63241, 35364, 8287, 59680, 26714, 7661, 19015}, objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                        int size2 = 651 - View.MeasureSpec.getSize(0);
                        int i11 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43;
                        byte b7 = (byte) 52;
                        Object[] objArr14 = new Object[1];
                        c($$a[5], b7, (byte) (b7 - 1), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, size2, i11, -873460649, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 652;
                        int scrollBarFadeDuration = 44 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        byte[] bArr2 = $$a;
                        byte b8 = bArr2[7];
                        Object[] objArr15 = new Object[1];
                        c(b8, b8, bArr2[80], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(bitsPerPixel, iLastIndexOf2, scrollBarFadeDuration, -459846511, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr10;
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
        int i12 = ((int[]) objArr[0])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                int i14 = g + 95;
                f172a = i14 % 128;
                while (true) {
                    int i15 = i14 % 2;
                    if (i4 >= strArr.length) {
                        break;
                    }
                    int i16 = f172a + 63;
                    g = i16 % 128;
                    int i17 = i16 % 2;
                    arrayList.add(strArr[i4]);
                    i4++;
                    i14 = f172a + 123;
                    g = i14 % 128;
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
        int i18 = ((int[]) objArr[3])[0];
        int i19 = ((int[]) objArr[2])[0];
        int i20 = ((int[]) objArr[0])[0];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i21 = ~((-269695479) | (~iIdentityHashCode2));
        int i22 = i18 + (((((-534772223) | i21) | (~(269695478 | iIdentityHashCode2))) * (-338)) - 360954133) + (((~(iIdentityHashCode2 | (-265076745))) | i21) * 338);
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        Object obj3 = objArr16[3];
        ((int[]) obj3)[0] = i24 ^ (i24 << 5);
        int i25 = g + 15;
        f172a = i25 % 128;
        if (i25 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            if (obj instanceof MediaBrowserCompatSubscription) {
                MediaBrowserCompatSubscription mediaBrowserCompatSubscription = (MediaBrowserCompatSubscription) obj;
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, mediaBrowserCompatSubscription.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                    int i26 = f172a + 123;
                    g = i26 % 128;
                    if (i26 % 2 == 0) {
                        Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, mediaBrowserCompatSubscription.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        throw null;
                    }
                    if (Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, mediaBrowserCompatSubscription.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                        int i27 = f172a + 73;
                        g = i27 % 128;
                        int i28 = i27 % 2;
                        return true;
                    }
                }
            }
            return false;
        }
        int i29 = ((int[]) obj3)[0];
        int i30 = i29 * i29;
        int i31 = -(1065808179 * i29);
        int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
        int i33 = -(i29 * 1859649617);
        int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
        int i35 = (i34 & 1815245572) + (1815245572 | i34);
        int i36 = i35 >> 21;
        int i37 = ((i36 ^ (-4095)) + ((i36 & (-4095)) << 1)) / 2048;
        int i38 = (i35 - (~(((i37 | 1) << 1) - (i37 ^ 1)))) - 1;
        int i39 = i35 >> 16;
        int i40 = (((-131071) & i39) + (i39 | (-131071))) / 65536;
        int i41 = -(i38 ^ ((i40 & 1) + (i40 | 1)));
        int i42 = (i41 ^ 7) + ((i41 & 7) << 1);
        int i43 = (((i42 >> 23) - 1023) / 512) + 1;
        return 5117 / (((-((i43 & 1) + (i43 | 1))) & i42) * 731);
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f172a + 87;
        g = i2 % 128;
        int i3 = i2 % 2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        int i4 = g + 73;
        f172a = i4 % 128;
        if (i4 % 2 == 0) {
            return iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        throw null;
    }

    private static String $$e(byte b2, int i, byte b3) {
        int i2 = 3 - (i * 3);
        int i3 = b2 * 2;
        byte[] bArr = $$c;
        int i4 = b3 + 102;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i4 = i5 + i4;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            i2++;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i4 += bArr[i2];
        }
    }
}
