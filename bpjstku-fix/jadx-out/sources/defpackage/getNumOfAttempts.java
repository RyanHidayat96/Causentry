package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.volley.ExecutorDelivery;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class getNumOfAttempts implements SafeCloseImageReaderProxy {
    private double TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Double.NaN;
    private final Map<shouldRetry, getRetryDelayInMillis> b = new LinkedHashMap();
    private static final byte[] $$c = {23, -73, 107, 5};
    private static final int $$d = 98;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {14, 116, 92, -78, -57, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, -8, -6, 2, -7, -15, -1, -20, -6, -14, -7, -6, -14, 0, -8, -27, 4, -5, -27, 33, -43, 2, -10, -16, -1, -10, -10, -4, -29, 0, -17, 58};
    private static final int $$b = 10;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f957a = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 7310934652931882061L;
    private static int[] TuitionPaymentFragmentbindingInflater1 = {43642944, -2137666784, -94994891, -1916512906, 420705394, -428030674, 969074875, -1671760648, 2077610275, 1105362360, -21538510, 1816464163, -1818916158, 754498540, 386224463, -1044926726, -2096231418, 1756351295};

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r7 = 36 - r7
            int r8 = r8 * 4
            int r0 = 54 - r8
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r1 = defpackage.getNumOfAttempts.$$a
            byte[] r0 = new byte[r0]
            int r8 = 53 - r8
            r2 = 0
            if (r1 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r6 = -r6
            int r7 = r7 + 1
            int r3 = r3 + r6
            int r6 = r3 + (-9)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getNumOfAttempts.e(int, int, short, java.lang.Object[]):void");
    }

    @Override // defpackage.getImageReaderProxy
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(double d) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = d;
        synchronized (this.b) {
            Iterator<shouldRetry> it = this.b.keySet().iterator();
            while (it.hasNext()) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(it.next(), d);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.SafeCloseImageReaderProxy
    public final void b(shouldRetry shouldretry) {
        Intrinsics.checkNotNullParameter(shouldretry, "");
        double d = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        synchronized (this.b) {
            Map<shouldRetry, getRetryDelayInMillis> map = this.b;
            getRetryDelayInMillis.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRetryDelayInMillis.INSTANCE;
            map.put(shouldretry, getRetryDelayInMillis.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            Unit unit = Unit.INSTANCE;
        }
        if (Double.isNaN(d)) {
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(shouldretry, d);
    }

    @Override // defpackage.SafeCloseImageReaderProxy
    public final void TuitionPaymentFragmentbindingInflater1(shouldRetry shouldretry) {
        Intrinsics.checkNotNullParameter(shouldretry, "");
        synchronized (this.b) {
            this.b.remove(shouldretry);
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(shouldRetry shouldretry, double d) {
        getRetryDelayInMillis getretrydelayinmillisTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.b.get(shouldretry);
        if (getretrydelayinmillisTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            getRetryDelayInMillis.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRetryDelayInMillis.INSTANCE;
            getretrydelayinmillisTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getRetryDelayInMillis.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        int i = getretrydelayinmillisTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        getRetryDelayInMillis getretrydelayinmillis = new getRetryDelayInMillis(i, Math.min(d, getretrydelayinmillisTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1), Math.max(d, getretrydelayinmillisTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1), ((((double) getretrydelayinmillisTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) * getretrydelayinmillisTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) + d) / ((double) i));
        shouldretry.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getretrydelayinmillis);
        synchronized (this.b) {
            this.b.put(shouldretry, getretrydelayinmillis);
            Unit unit = Unit.INSTANCE;
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 19473), View.MeasureSpec.getSize(0) + 2624, 13 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (Process.myTid() >> 22)), 481 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 37 - View.MeasureSpec.getSize(0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i4 = $10 + 81;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - KeyEvent.normalizeMetaState(0)), 481 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 37 - ((Process.getThreadPriority(0) + 20) >> 6), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
        int i6 = $10 + 93;
        $11 = i6 % 128;
        int i7 = i6 % 2;
    }

    private static void d(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentbindingInflater1;
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 61;
                $10 = i8 % 128;
                if (i8 % i2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i6] = Integer.valueOf(iArr2[i7]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) i6;
                            byte b2 = (byte) (b + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ImageFormat.getBitsPerPixel(i6) + 1), 3291 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 31, 1948206109, false, $$e(b, b2, (byte) (-b2)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.resolveSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3292, TextUtils.getCapsMode("", 0, 0) + 31, 1948206109, false, $$e(b3, b4, (byte) (-b4)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i7++;
                }
                i2 = 2;
                i4 = -1870535734;
                i6 = 0;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentbindingInflater1;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                try {
                    Object[] objArr4 = new Object[i5];
                    objArr4[0] = Integer.valueOf(iArr5[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 3291 - KeyEvent.keyCodeFromString(""), Drawable.resolveOpacity(0, 0) + 31, 1948206109, false, $$e(b5, b6, (byte) (-b6)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    i9++;
                    iArr5 = iArr5;
                    i5 = 1;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i10 = $10 + 123;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i12 = 17;
            for (int i13 = 1; i12 > i13; i13 = 1) {
                int i14 = $10 + 9;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i12];
                    Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 2559 - (ViewConfiguration.getJumpTapTimeout() >> 16), (Process.myPid() >> 22) + 29, 683220507, false, $$e(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i12 += 127;
                } else {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i12];
                    Object[] objArr6 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 2559 - TextUtils.getCapsMode("", 0, 0), Color.argb(0, 0, 0, 0) + 29, 683220507, false, $$e(b9, b10, (byte) (b10 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                    i12--;
                }
            }
            int i15 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i16 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr7 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (View.getDefaultSize(0, 0) + 28879), 348 - View.combineMeasuredStates(0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    public static Object[] b(Context context, int i, int i2) {
        ?? NewInstance;
        char[] cArr;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        ?? r5;
        int i8;
        Object objInvoke;
        int i9;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i10;
        int i11;
        String str;
        Object[] objArr;
        Method method;
        int i12 = 2 % 2;
        if (context != null) {
            int i13 = f957a;
            int i14 = (i13 ^ 103) + ((i13 & 103) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
            try {
                if (i14 % 2 != 0) {
                    cArr = new char[]{38165, 62767, 21765, 46514, 5604, 29729, 54382, 13496, 38023, 62685, 22352, 46927, 6055, 30719, 54817, 13832, 38410, 63166, 22197, 45314, 4468, 29105, 53662, 12744, 36887, 61549, 20716, 45272, 4975, 29496, 54135};
                    i3 = -TextUtils.lastIndexOf("", '\'');
                    i4 = 21583;
                } else {
                    cArr = new char[]{38165, 62767, 21765, 46514, 5604, 29729, 54382, 13496, 38023, 62685, 22352, 46927, 6055, 30719, 54817, 13832, 38410, 63166, 22197, 45314, 4468, 29105, 53662, 12744, 36887, 61549, 20716, 45272, 4975, 29496, 54135};
                    i3 = -TextUtils.lastIndexOf("", '0');
                    i4 = 24630;
                }
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i15 = i3 * 866;
                int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i17 = ((i16 | 29) << 1) - (i16 ^ 29);
                int i18 = i17 % 128;
                f957a = i18;
                if (i17 % 2 == 0) {
                    int i19 = -(-i4);
                    i5 = i15 >> ((i19 & (-864)) + (i19 | (-864)));
                } else {
                    i5 = i15 + (i4 * (-864));
                }
                int i20 = ~i4;
                int i21 = ~i3;
                int i22 = (i18 ^ 99) + ((i18 & 99) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
                int i23 = i22 % 2;
                int i24 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i25 = ~((i21 ^ i24) | (i21 & i24));
                int i26 = -(-((-865) * ((i20 & i25) | (i20 ^ i25))));
                int i27 = ((i5 | i26) << 1) - (i5 ^ i26);
                int i28 = (~((i3 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i3 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2))) * 865;
                int i29 = (i27 & i28) + (i28 | i27);
                int i30 = ~i4;
                int i31 = ~((i30 & i24) | (i30 ^ i24));
                int i32 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | i3);
                int i33 = ((i31 & i32) | (i31 ^ i32)) * 865;
                int i34 = (i29 & i33) + (i33 | i29);
                Object[] objArr2 = new Object[1];
                c(cArr, i34, objArr2);
                NewInstance = (String) objArr2[0];
                int i35 = f957a;
                int i36 = (i35 ^ 37) + ((i35 & 37) << 1);
                int i37 = i36 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i37;
                if (i36 % 2 != 0) {
                    int i38 = 4 / 4;
                }
                int i39 = i37 + 31;
                f957a = i39 % 128;
                try {
                    try {
                        if (i39 % 2 == 0) {
                            ?? r6 = new Object[0];
                            r6[0] = NewInstance;
                            iArr = new int[]{-1768222565, 917999171, -1245447822, 94198658, 2128957441, -134612288, -1978067305, -618173085, 1125507377, -2131906972, 527727501, 1048688781, -216672342, -1852144578, -128392797, 106607210, -566516106, 41635010, -1052832295, -1546539170, -1282186968, 1550060726};
                            i6 = -Drawable.resolveOpacity(1, 1);
                            i7 = 13;
                            r5 = r6;
                        } else {
                            Object[] objArr3 = {NewInstance};
                            iArr = new int[]{-1768222565, 917999171, -1245447822, 94198658, 2128957441, -134612288, -1978067305, -618173085, 1125507377, -2131906972, 527727501, 1048688781, -216672342, -1852144578, -128392797, 106607210, -566516106, 41635010, -1052832295, -1546539170, -1282186968, 1550060726};
                            i6 = -Drawable.resolveOpacity(0, 0);
                            i7 = 38;
                            r5 = objArr3;
                        }
                        int i40 = f957a + 57;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i40 % 128;
                        int i41 = ((i40 % 2 != 0 ? 370 - i6 : i6 * 370) - (~(-(-(370 * i7))))) - 1;
                        int i42 = ~i;
                        int i43 = (i41 - (~(((i6 | i7) | i42) * (-369)))) - 1;
                        int i44 = ~i6;
                        int i45 = ~i;
                        int i46 = ~(i44 | i45);
                        int i47 = (i43 - (~(-(-(((i7 ^ i46) | (i46 & i7)) * (-369)))))) - 1;
                        int i48 = ~i7;
                        int i49 = ~((i48 ^ i6) | (i48 & i6));
                        int i50 = ~((i6 ^ i) | (i6 & i));
                        int i51 = (i49 ^ i50) | (i49 & i50);
                        int i52 = (i44 ^ i42) | (i44 & i42);
                        int i53 = ~((i52 & i7) | (i52 ^ i7));
                        int i54 = ((i51 & i53) | (i51 ^ i53)) * 369;
                        int i55 = (i47 & i54) + (i54 | i47);
                        Object[] objArr4 = new Object[1];
                        d(iArr, i55, objArr4);
                        NewInstance = Class.forName((String) objArr4[0]).getDeclaredConstructor(String.class).newInstance(r5);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0');
                        int i56 = (iLastIndexOf ^ 16128) + ((iLastIndexOf & 16128) << 1);
                        Object[] objArr5 = new Object[1];
                        c(new char[]{38165, 43924, 59645, 10744, 28294, 45026, 60561, 11758, 25280, 41925, 57554, 8652, 26315, 42945, 58504, 9700, 31464, 48004, 63737, 14805, 32478, 49103, 64723, 15830, 29402, 45969, 61684, 12758, 30416, 47040, 62675}, i56, objArr5);
                        String str2 = (String) objArr5[0];
                        int i57 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
                        f957a = i57 % 128;
                        int i58 = i57 % 2;
                        try {
                            int i59 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int i60 = (i59 & 38) + (i59 | 38);
                            Object[] objArr6 = new Object[1];
                            d(new int[]{-1768222565, 917999171, -1245447822, 94198658, 2128957441, -134612288, -1978067305, -618173085, 1125507377, -2131906972, 527727501, 1048688781, -216672342, -1852144578, -128392797, 106607210, -566516106, 41635010, -1052832295, -1546539170, -1282186968, 1550060726}, i60, objArr6);
                            Object objNewInstance = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(str2);
                            int i61 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i62 = (i61 & 121) + (i61 | 121);
                            f957a = i62 % 128;
                            int i63 = i62 % 2;
                            try {
                                int i64 = -ExpandableListView.getPackedPositionChild(0L);
                                int i65 = ((i64 | 22) << 1) - (i64 ^ 22);
                                Object[] objArr7 = new Object[1];
                                d(new int[]{-359895542, -159932798, 1246644376, -1769905769, 1988984075, -499335932, 60085372, -887031032, 2128353540, -1120217805, 1609116631, -1288679319, -2138583975, 864249202}, i65, objArr7);
                                Class<?> cls = Class.forName((String) objArr7[0]);
                                int i66 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i67 = ((i66 | 79) << 1) - (i66 ^ 79);
                                f957a = i67 % 128;
                                int i68 = i67 % 2;
                                char[] cArr2 = {38193, 47492, 52300, 4899, 10219, 19110, 39287, 44086, 61577, 1884, 10813, 32490, 36268, 53372, 59187, 2954, 24148};
                                int i69 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                int i70 = i69 * 628;
                                int i71 = f957a;
                                int i72 = ((i71 | 117) << 1) - (i71 ^ 117);
                                int i73 = i72 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i73;
                                int i74 = i72 % 2;
                                int i75 = ((i70 | 7188088) << 1) - (7188088 ^ i70);
                                int i76 = (11446 & i) | (11446 ^ i);
                                int i77 = ~i69;
                                int i78 = i75 + (((i76 ^ i77) | (i76 & i77)) * (-627));
                                int i79 = i73 + 41;
                                f957a = i79 % 128;
                                int i80 = i79 % 2;
                                int i81 = ~(((-11447) & i) | ((-11447) ^ i));
                                int i82 = (-627) * ((i81 & i69) | (i69 ^ i81));
                                int i83 = ((i78 | i82) << 1) - (i78 ^ i82);
                                int i84 = ~((i42 ^ 11446) | (i42 & 11446));
                                int i85 = ~((i69 ^ i) | (i69 & i));
                                int i86 = ((i84 & i85) | (i84 ^ i85)) * 627;
                                int i87 = ((i83 | i86) << 1) - (i83 ^ i86);
                                Object[] objArr8 = new Object[1];
                                c(cArr2, i87, objArr8);
                                String str3 = (String) objArr8[0];
                                int i88 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i89 = (i88 ^ 5) + ((i88 & 5) << 1);
                                f957a = i89 % 128;
                                int i90 = i89 % 2;
                                Object objInvoke2 = cls.getMethod(str3, null).invoke(context, null);
                                int i91 = f957a;
                                int i92 = (i91 ^ 97) + ((i91 & 97) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i92 % 128;
                                int i93 = i92 % 2;
                                try {
                                    int[] iArr2 = {-359895542, -159932798, 1246644376, -1769905769, 1988984075, -499335932, 60085372, -887031032, 2128353540, -1120217805, 1609116631, -1288679319, -2138583975, 864249202};
                                    int iIndexOf = TextUtils.indexOf("", "", 0, 0);
                                    int i94 = (iIndexOf * (-721)) - 16583;
                                    int i95 = ~iIndexOf;
                                    int i96 = ~((i95 ^ (-24)) | (i95 & (-24)));
                                    int i97 = (i42 ^ i96) | (i96 & i42);
                                    int i98 = iIndexOf | 23;
                                    int i99 = f957a;
                                    int i100 = (i99 ^ 33) + ((i99 & 33) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i100 % 128;
                                    try {
                                        if (i100 % 2 != 0) {
                                            int i101 = ~i98;
                                            int i102 = i94 - (1443 - (~(-((i101 & i97) | (i97 ^ i101)))));
                                            int i103 = ~((iIndexOf ^ 23) | (iIndexOf & 23));
                                            int i104 = ~(iIndexOf | i);
                                            int i105 = (i103 & i104) | (i103 ^ i104);
                                            int i106 = ~((i ^ 23) | (i & 23));
                                            i8 = i102 % ((-1444) >>> ((i105 & i106) | (i105 ^ i106)));
                                        } else {
                                            int i107 = -(-(((~i98) | i97) * 1444));
                                            int i108 = (i94 & i107) + (i107 | i94);
                                            int i109 = (~i98) | (~(iIndexOf | i));
                                            int i110 = ~(i | 23);
                                            int i111 = ((i109 & i110) | (i109 ^ i110)) * (-1444);
                                            i8 = (i108 ^ i111) + ((i111 & i108) << 1);
                                        }
                                        int i112 = ((~(i95 | 23)) | (~(((-24) & iIndexOf) | ((-24) ^ iIndexOf)))) * 722;
                                        int i113 = (i8 ^ i112) + ((i112 & i8) << 1);
                                        Object[] objArr9 = new Object[1];
                                        d(iArr2, i113, objArr9);
                                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                                        char[] cArr3 = {38193, 24934, 32136, 18937, 17507, 20636, 11459, 15204, 14233, 974, 7754, 60048, 59079, 64866};
                                        int iIndexOf2 = TextUtils.indexOf("", "", 0);
                                        int i114 = (iIndexOf2 * 303) - 18827249;
                                        int i115 = ~iIndexOf2;
                                        int i116 = (i115 ^ i45) | (i115 & i45);
                                        int i117 = ~((i116 & 62549) | (i116 ^ 62549));
                                        int i118 = (iIndexOf2 ^ 62549) | (iIndexOf2 & 62549);
                                        int i119 = ~((i118 ^ i) | (i118 & i));
                                        int i120 = ((i117 ^ i119) | (i117 & i119)) * (-302);
                                        int i121 = ((i114 | i120) << 1) - (i114 ^ i120);
                                        int i122 = (i115 ^ 62549) | (i115 & 62549);
                                        int i123 = (~((i122 & i) | (i122 ^ i))) * (-604);
                                        int i124 = ((i121 | i123) << 1) - (i123 ^ i121);
                                        int i125 = ~(((-62550) & iIndexOf2) | ((-62550) ^ iIndexOf2));
                                        int i126 = f957a + 43;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i126 % 128;
                                        if (i126 % 2 != 0) {
                                            int i127 = ~((i ^ 62549) | (i & 62549));
                                            int i128 = -(-((i125 & i127) | (i125 ^ i127)));
                                            int i129 = i124 * ((i128 ^ 302) + ((i128 & 302) << 1));
                                            Object[] objArr10 = new Object[1];
                                            c(cArr3, i129, objArr10);
                                            objInvoke = cls2.getMethod((String) objArr10[0], null).invoke(context, null);
                                            i9 = 0;
                                        } else {
                                            int i130 = ~(i | 62549);
                                            int i131 = ((i125 & i130) | (i125 ^ i130)) * 302;
                                            int i132 = ((i124 | i131) << 1) - (i131 ^ i124);
                                            Object[] objArr11 = new Object[1];
                                            c(cArr3, i132, objArr11);
                                            objInvoke = cls2.getMethod((String) objArr11[0], null).invoke(context, null);
                                            i9 = 64;
                                        }
                                        try {
                                            Object[] objArr12 = {objInvoke, Integer.valueOf(i9)};
                                            int threadPriority = Process.getThreadPriority(0);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i133 = threadPriority * (-103);
                                            int i134 = ((-2060) & i133) + (i133 | (-2060));
                                            int i135 = ~threadPriority;
                                            int i136 = ~((i135 & (-21)) | ((-21) ^ i135));
                                            int i137 = ~threadPriority;
                                            int i138 = ~((i137 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i137 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                            int i139 = (i134 - (~(-(-(((i136 & i138) | (i136 ^ i138)) * 104))))) - 1;
                                            int i140 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | 20;
                                            int i141 = (i139 - (~(-(-((~((threadPriority & i140) | (i140 ^ threadPriority))) * (-104)))))) - 1;
                                            int i142 = -(-(((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 20) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 20)) * 104));
                                            Object[] objArr13 = new Object[1];
                                            d(new int[]{76986954, 2081717253, -197307209, 938419603, -1102558482, 1279014375, 816815969, -403974742, 865579466, -987652122, -1374323435, -2064829881, 2009968282, -1926732259, 1333695491, 1395729344, -720164783, 1596823892, 1918432979, -488230825}, 32 - (~(-(-(((i141 & i142) + (i142 | i141)) >> 6)))), objArr13);
                                            Class<?> cls3 = Class.forName((String) objArr13[0]);
                                            int i143 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i144 = ~i143;
                                            int i145 = ~((i144 ^ (-15)) | (i144 & (-15)));
                                            int i146 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                            int i147 = ~(((-15) ^ i146) | ((-15) & i146));
                                            int i148 = (((i143 * (-445)) - 6230) - (~(((i145 ^ i147) | (i147 & i145)) * 446))) - 1;
                                            int i149 = -(-(((~(i144 | 14)) | (~(iTuitionPaymentFragmentspecialinlinedviewModeldefault4 | ((-15) ^ i143) | ((-15) & i143)))) * 446));
                                            int i150 = (i148 & i149) + (i149 | i148);
                                            int i151 = ~i143;
                                            int i152 = -(-((~((i151 & (-15)) | (i151 ^ (-15)))) * 446));
                                            int i153 = ((i150 | i152) << 1) - (i152 ^ i150);
                                            Object[] objArr14 = new Object[1];
                                            d(new int[]{-984919184, 1844950479, -1392237414, -2018654910, 176332665, 1980905694, -581181098, 2009452132, 2066698120, 559723005}, i153, objArr14);
                                            Object objInvoke3 = cls3.getMethod((String) objArr14[0], String.class, Integer.TYPE).invoke(objInvoke2, objArr12);
                                            try {
                                                int iBlue = Color.blue(0);
                                                int i154 = iBlue * 860;
                                                int i155 = ((i154 | (-30049734)) << 1) - (i154 ^ (-30049734));
                                                int i156 = ((iBlue ^ i) | (iBlue & i)) * (-859);
                                                int i157 = (i155 & i156) + (i156 | i155);
                                                int i158 = ~(i42 | iBlue);
                                                int i159 = ~iBlue;
                                                int i160 = (i159 & (-35024)) | (i159 ^ (-35024));
                                                int i161 = ~((i160 & i) | (i160 ^ i));
                                                int i162 = ((i157 + (((i158 & i161) | (i158 ^ i161)) * 859)) - (~(-(-(((~(((-35024) & iBlue) | ((-35024) ^ iBlue))) | (~(((-35024) ^ i42) | ((-35024) & i42)))) * 859))))) - 1;
                                                Object[] objArr15 = new Object[1];
                                                c(new char[]{38199, 7671, 33964, 3913, 46597, 14644, 41448, 10449, 54093, 23166, 52526, 30151, 64647, 26555, 61040, 37209, 6614, 32900, 3062, 45659, 9499, 44494, 21751, 57262, 18009, 51460, 28697, 63725, 25492, 59978}, i162, objArr15);
                                                Class<?> cls4 = Class.forName((String) objArr15[0]);
                                                int i163 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                int i164 = (i163 ^ 21248) + ((i163 & 21248) << 1);
                                                Object[] objArr16 = new Object[1];
                                                c(new char[]{38181, 51136, 12495, 28101, 57035, 3033, 25817, 53725, 715, 32722}, i164, objArr16);
                                                Object[] objArr17 = (Object[]) cls4.getField((String) objArr16[0]).get(objInvoke3);
                                                int length = objArr17.length;
                                                int i165 = 0;
                                                while (true) {
                                                    if (i165 < length) {
                                                        Object obj = objArr17[i165];
                                                        Object[] objArr18 = new Object[1];
                                                        d(new int[]{-699783458, 1344361742, -1945903123, -1293645712, 2032292715, -369512882}, Drawable.resolveOpacity(0, 0) + 5, objArr18);
                                                        try {
                                                            Object[] objArr19 = {(String) objArr18[0]};
                                                            int[] iArr3 = {1571964847, 1775610242, -1725924291, -671916682, 2022399601, 2033963527, -1521378938, 892675823, 2040439062, -1655336382, 1461477759, 1477771693, 1621276250, -254527724, -2098284828, 882275479, 1870900755, 2116834671, 1714582823, -14221249, -106770962, 1632569633};
                                                            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0);
                                                            int i166 = f957a;
                                                            int i167 = (i166 & 71) + (i166 | 71);
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i167 % 128;
                                                            int i168 = iLastIndexOf2 * 866;
                                                            int i169 = i167 % 2 != 0 ? i168 >> 67108850 : i168 - 32832;
                                                            int i170 = ~iLastIndexOf2;
                                                            int i171 = ~((i170 & i42) | (i170 ^ i42));
                                                            int i172 = (i169 - (~(-(-((-865) * (((-39) ^ i171) | (i171 & (-39)))))))) - 1;
                                                            int i173 = -(-((~((iLastIndexOf2 ^ i) | (iLastIndexOf2 & i))) * 865));
                                                            int i174 = (i172 & i173) + (i172 | i173);
                                                            int i175 = ~((-39) | i42);
                                                            int i176 = ~((i42 ^ iLastIndexOf2) | (iLastIndexOf2 & i42));
                                                            int i177 = -(-(((i175 & i176) | (i175 ^ i176)) * 865));
                                                            Object[] objArr20 = new Object[1];
                                                            d(iArr3, (i174 & i177) + (i177 | i174), objArr20);
                                                            Class<?> cls5 = Class.forName((String) objArr20[0]);
                                                            int[] iArr4 = {-1529407381, -1402848236, 592366351, -1392085077, 1552153983, -1549458433, -1932511422, -378890836};
                                                            int iIndexOf3 = TextUtils.indexOf("", "", 0, 0);
                                                            int i178 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
                                                            f957a = i178 % 128;
                                                            if (i178 % 2 == 0) {
                                                                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                i10 = (-711) / iIndexOf3;
                                                                i11 = ~(((-12) ^ iIndexOf3) | ((-12) & iIndexOf3));
                                                            } else {
                                                                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                i10 = (iIndexOf3 * (-711)) + 7843;
                                                                i11 = ~((-12) | iIndexOf3);
                                                            }
                                                            int i179 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                            int i180 = length;
                                                            int i181 = (i179 ^ iIndexOf3) | (i179 & iIndexOf3);
                                                            int i182 = i165;
                                                            int i183 = ~i181;
                                                            int i184 = (i10 - (~((-712) * ((i11 ^ i183) | (i183 & i11))))) - 1;
                                                            int i185 = (i179 & (-12)) | ((-12) ^ i179);
                                                            int i186 = ~((i185 & iIndexOf3) | (i185 ^ iIndexOf3));
                                                            int i187 = ~((iIndexOf3 ^ 11) | (iIndexOf3 & 11) | iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                                            int i188 = ((i184 - (~(((i186 & i187) | (i186 ^ i187)) * (-712)))) - 1) + (((~i181) | (-12)) * 712);
                                                            Object[] objArr21 = new Object[1];
                                                            d(iArr4, i188, objArr21);
                                                            Object objInvoke4 = cls5.getMethod((String) objArr21[0], String.class).invoke(null, objArr19);
                                                            try {
                                                                int i189 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                                Object[] objArr22 = new Object[1];
                                                                c(new char[]{38199, 60055, 27244, 59945, 27525, 60244, 27432, 59569, 26701, 59422, 27118, 59815, 26887, 61147, 28336, 60985, 28630, 61348, 28470, 60664, 27795, 60522, 27698, 60814, 27978, 60724, 25314, 57926}, (i189 & 32688) + (i189 | 32688), objArr22);
                                                                Class<?> cls6 = Class.forName((String) objArr22[0]);
                                                                Object[] objArr23 = new Object[1];
                                                                c(new char[]{38178, 48426, 50482, 60694, 13678, 23916, 25957, 36257, 54716, 64924, 1425}, Color.alpha(0) + 10259, objArr23);
                                                                try {
                                                                    Object[] objArr24 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr23[0], null).invoke(obj, null))};
                                                                    int[] iArr5 = {1571964847, 1775610242, -1725924291, -671916682, 2022399601, 2033963527, -1521378938, 892675823, 2040439062, -1655336382, 1461477759, 1477771693, 1621276250, -254527724, -2098284828, 882275479, 1870900755, 2116834671, 1714582823, -14221249, -106770962, 1632569633};
                                                                    int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
                                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                    int i190 = pressedStateDuration * (-500);
                                                                    int i191 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                    int i192 = (i191 ^ 99) + ((i191 & 99) << 1);
                                                                    f957a = i192 % 128;
                                                                    int i193 = i192 % 2;
                                                                    int i194 = ((i190 | (-18500)) << 1) - (i190 ^ (-18500));
                                                                    int i195 = ~(((-38) & pressedStateDuration) | ((-38) ^ pressedStateDuration));
                                                                    int i196 = ~pressedStateDuration;
                                                                    int i197 = ~((i196 ^ 37) | (i196 & 37) | iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
                                                                    int i198 = -(-(((i195 & i197) | (i195 ^ i197)) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                                                                    int i199 = (i194 & i198) + (i198 | i194);
                                                                    int i200 = -(-((~((i196 ^ (-38)) | (i196 & (-38)))) * 1002));
                                                                    int i201 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                                                    int i202 = (i199 ^ i200) + ((i200 & i199) << 1) + ((~((i196 & i201) | (i196 ^ i201) | 37)) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
                                                                    Object[] objArr25 = new Object[1];
                                                                    d(iArr5, i202, objArr25);
                                                                    Class<?> cls7 = Class.forName((String) objArr25[0]);
                                                                    char[] cArr4 = {38193, 57838, 31874, 52132, 18000, 56678, 10252, 42808, 13309, 36598, 1414, 36957, 61283, 31241, 61737, 19910, 55527, 22415, 41657};
                                                                    int i203 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                    int i204 = (i203 & 55) + (i203 | 55);
                                                                    f957a = i204 % 128;
                                                                    int i205 = i204 % 2;
                                                                    int i206 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                                                    Object[] objArr26 = new Object[1];
                                                                    c(cArr4, (i206 & 29917) + (i206 | 29917), objArr26);
                                                                    Object objInvoke5 = cls7.getMethod((String) objArr26[0], InputStream.class).invoke(objInvoke4, objArr24);
                                                                    int i207 = f957a + 1;
                                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i207 % 128;
                                                                    if (i207 % 2 != 0) {
                                                                        try {
                                                                            Object[] objArr27 = new Object[1];
                                                                            d(new int[]{1860932987, -593168089, -658603204, -990635285, -334006795, -272038798, 1138638171, 1128621696, 1178336494, -96649136, 283399158, 1662267312, 894898911, -1451575425, -1169842761, -1405302464, 862400572, -1969124974, -1699277122, 1477971315}, 66 - (~ExpandableListView.getPackedPositionChild(1L)), objArr27);
                                                                            str = (String) objArr27[0];
                                                                        } catch (Throwable th) {
                                                                            Throwable cause = th.getCause();
                                                                            if (cause != null) {
                                                                                throw cause;
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    } else {
                                                                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
                                                                        int i208 = ((packedPositionChild | 35) << 1) - (packedPositionChild ^ 35);
                                                                        Object[] objArr28 = new Object[1];
                                                                        d(new int[]{1860932987, -593168089, -658603204, -990635285, -334006795, -272038798, 1138638171, 1128621696, 1178336494, -96649136, 283399158, 1662267312, 894898911, -1451575425, -1169842761, -1405302464, 862400572, -1969124974, -1699277122, 1477971315}, i208, objArr28);
                                                                        str = (String) objArr28[0];
                                                                    }
                                                                    int i209 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                    int i210 = (i209 & 19) + (i209 | 19);
                                                                    f957a = i210 % 128;
                                                                    int i211 = i210 % 2;
                                                                    Class<?> cls8 = Class.forName(str);
                                                                    int[] iArr6 = {-1044093922, -1664704666, -388945085, -813296211, 1712068922, 1854879899, 36761050, 1939784743, 1398307567, 149874099, 1547243486, -503046980, -415997040, -250065124};
                                                                    int iAlpha = Color.alpha(0);
                                                                    int i212 = ((-1763825235) - (~(((~((i45 ^ (-299602292)) | (i45 & (-299602292)))) | 281153649) * 529))) + (((~((-299602292) | i)) | 1591890549) * 529);
                                                                    int i213 = (-1725339403) - (~((~(1724672235 | i42)) * (-560)));
                                                                    int i214 = (~((2012184063 & i) | (2012184063 ^ i))) * (-560);
                                                                    int i215 = ((i213 | i214) << 1) - (i214 ^ i213);
                                                                    int i216 = ~((-1936422389) | i45);
                                                                    int i217 = ((i216 & 1648910560) | (1648910560 ^ i216)) * 560;
                                                                    if (i212 > (i215 & i217) + (i217 | i215)) {
                                                                        Object[] objArr29 = new Object[1];
                                                                        d(iArr6, 23 >> iAlpha, objArr29);
                                                                        objArr = null;
                                                                        method = cls8.getMethod((String) objArr29[0], null);
                                                                    } else {
                                                                        Object[] objArr30 = new Object[1];
                                                                        d(iArr6, 23 - iAlpha, objArr30);
                                                                        objArr = null;
                                                                        method = cls8.getMethod((String) objArr30[0], null);
                                                                    }
                                                                    if (!NewInstance.equals(method.invoke(objInvoke5, objArr))) {
                                                                        int i218 = f957a;
                                                                        int i219 = (i218 & 119) + (i218 | 119);
                                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i219 % 128;
                                                                        if (i219 % 2 != 0) {
                                                                            throw null;
                                                                        }
                                                                        int i220 = ((i218 | 87) << 1) - (i218 ^ 87);
                                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i220 % 128;
                                                                        int i221 = i220 % 2;
                                                                        try {
                                                                            Object[] objArr31 = new Object[1];
                                                                            d(new int[]{1860932987, -593168089, -658603204, -990635285, -334006795, -272038798, 1138638171, 1128621696, 1178336494, -96649136, 283399158, 1662267312, 894898911, -1451575425, -1169842761, -1405302464, 862400572, -1969124974, -1699277122, 1477971315}, 33 - (~(-(-Color.alpha(0)))), objArr31);
                                                                            Class<?> cls9 = Class.forName((String) objArr31[0]);
                                                                            int i222 = -TextUtils.lastIndexOf("", '0');
                                                                            int i223 = i222 * 881;
                                                                            int i224 = (i223 & 19382) + (i223 | 19382);
                                                                            int i225 = ~i222;
                                                                            int i226 = ~((i225 ^ (-23)) | (i225 & (-23)));
                                                                            int i227 = ~i222;
                                                                            int i228 = ~((i227 ^ i) | (i227 & i));
                                                                            int i229 = (i226 ^ i228) | (i226 & i228);
                                                                            int i230 = ~(((-23) ^ i) | ((-23) & i));
                                                                            int i231 = ((i229 ^ i230) | (i229 & i230)) * (-880);
                                                                            int i232 = ((i224 | i231) << 1) - (i231 ^ i224);
                                                                            int i233 = ~((i225 ^ i42) | (i225 & i42));
                                                                            int i234 = (i233 & 22) | (i233 ^ 22);
                                                                            int i235 = (i222 & i) | (i222 ^ i);
                                                                            int i236 = ~i235;
                                                                            int i237 = ((i234 ^ i236) | (i234 & i236)) * (-880);
                                                                            int i238 = (i232 & i237) + (i237 | i232);
                                                                            int i239 = (~i235) * 880;
                                                                            Object[] objArr32 = new Object[1];
                                                                            d(new int[]{-1044093922, -1664704666, -388945085, -813296211, 1712068922, 1854879899, 36761050, 1939784743, 1398307567, 149874099, 1547243486, -503046980, -415997040, -250065124}, (i238 & i239) + (i239 | i238), objArr32);
                                                                            if (!objNewInstance.equals(cls9.getMethod((String) objArr32[0], null).invoke(objInvoke5, null))) {
                                                                                int i240 = (i182 & (-107)) + (i182 | (-107));
                                                                                i165 = (i240 & 108) + (i240 | 108);
                                                                                objArr17 = objArr17;
                                                                                length = i180;
                                                                            }
                                                                        } catch (Throwable th2) {
                                                                            Throwable cause2 = th2.getCause();
                                                                            if (cause2 != null) {
                                                                                throw cause2;
                                                                            }
                                                                            throw th2;
                                                                        }
                                                                    }
                                                                    int i241 = i ^ 1;
                                                                    Object[] objArr33 = new Object[4];
                                                                    int[] iArr7 = new int[1];
                                                                    objArr33[0] = iArr7;
                                                                    int[] iArr8 = new int[1];
                                                                    objArr33[1] = iArr8;
                                                                    int[] iArr9 = new int[1];
                                                                    objArr33[2] = iArr9;
                                                                    int i242 = f957a + 39;
                                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i242 % 128;
                                                                    if (i242 % 2 != 0) {
                                                                        iArr7[1] = i;
                                                                        ((int[]) objArr33[3])[0] = i241;
                                                                    } else {
                                                                        iArr7[0] = i;
                                                                        iArr9[0] = i241;
                                                                    }
                                                                    objArr33[3] = null;
                                                                    int i243 = (~((-6204938) | i42)) | 534025;
                                                                    int i244 = ~(39776203 | i);
                                                                    int i245 = ((i243 | i244) * (-252)) + 174884528 + ((i244 | (~((-5670913) | i42))) * 252) + 16;
                                                                    int i246 = i245 * 624;
                                                                    int i247 = i2 * (-622);
                                                                    int i248 = (i246 ^ i247) + ((i246 & i247) << 1);
                                                                    int i249 = ~i2;
                                                                    int i250 = (i249 & i245) | (i249 ^ i245);
                                                                    int i251 = (~((i250 & i) | (i250 ^ i))) * 623;
                                                                    int i252 = (i248 & i251) + (i251 | i248);
                                                                    int i253 = ~((~i245) | i2);
                                                                    int i254 = (i252 - (~(((i253 & i42) | (i42 ^ i253)) * (-623)))) - 1;
                                                                    int i255 = ~i2;
                                                                    int i256 = ~((i255 ^ i245) | (i255 & i245));
                                                                    int i257 = ~((i255 & i) | (i255 ^ i));
                                                                    int i258 = (i257 & i256) | (i256 ^ i257);
                                                                    int i259 = ~((i245 & i) | (i245 ^ i));
                                                                    int i260 = -(-(((i259 & i258) | (i258 ^ i259)) * 623));
                                                                    int i261 = (i254 & i260) + (i260 | i254);
                                                                    int i262 = i261 << 13;
                                                                    int i263 = (i262 & (~i261)) | ((~i262) & i261);
                                                                    int i264 = i263 >>> 17;
                                                                    int i265 = ((~i263) & i264) | ((~i264) & i263);
                                                                    int i266 = i265 << 5;
                                                                    iArr8[0] = (i265 | i266) & (~(i265 & i266));
                                                                    return objArr33;
                                                                } catch (Throwable th3) {
                                                                    Throwable cause3 = th3.getCause();
                                                                    if (cause3 != null) {
                                                                        throw cause3;
                                                                    }
                                                                    throw th3;
                                                                }
                                                            } catch (Throwable th4) {
                                                                Throwable cause4 = th4.getCause();
                                                                if (cause4 != null) {
                                                                    throw cause4;
                                                                }
                                                                throw th4;
                                                            }
                                                        } catch (Throwable th5) {
                                                            Throwable cause5 = th5.getCause();
                                                            if (cause5 != null) {
                                                                throw cause5;
                                                            }
                                                            throw th5;
                                                        }
                                                    }
                                                    NewInstance = i2;
                                                }
                                            } catch (Throwable unused) {
                                            }
                                        } catch (Throwable th6) {
                                            Throwable cause6 = th6.getCause();
                                            if (cause6 != null) {
                                                throw cause6;
                                            }
                                            throw th6;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        Throwable cause7 = th.getCause();
                                        if (cause7 != null) {
                                            throw cause7;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                            } catch (Throwable th9) {
                                Throwable cause8 = th9.getCause();
                                if (cause8 != null) {
                                    throw cause8;
                                }
                                throw th9;
                            }
                        } catch (Throwable th10) {
                            Throwable cause9 = th10.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th10;
                        }
                    } catch (Throwable th11) {
                        Throwable cause10 = th11.getCause();
                        if (cause10 != null) {
                            throw cause10;
                        }
                        throw th11;
                    }
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                NewInstance = i2;
            }
        } else {
            NewInstance = i2;
        }
        int[] iArr10 = new int[1];
        Object[] objArr34 = {new int[]{i}, iArr10, new int[]{i}, null};
        int i267 = 114271668 + (((~(583525980 | i)) | 2101379 | (~((-543215752) | i))) * (-744));
        int i268 = ~i;
        int i269 = i267 + ((42411608 | i268) * 744) + (((-2101380) | i) * 744);
        int i270 = i269 * (-317);
        int i271 = (i270 << 1) - i270;
        int i272 = ~i269;
        int i273 = ~(((-1) ^ i) | i);
        int i274 = -(-(((i273 & i272) | (i272 ^ i273)) * (-318)));
        int i275 = (i271 & i274) + (i271 | i274);
        int i276 = ((~((i272 ^ i) | (i272 & i))) | (~((i268 ^ i269) | (i268 & i269)))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
        int i277 = ~(i268 | i272);
        int i278 = ~(i | i269);
        int i279 = (i275 ^ i276) + ((i276 & i275) << 1) + (((i278 & i277) | (i277 ^ i278)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
        int i280 = (NewInstance ^ i279) + ((NewInstance & i279) << 1);
        int i281 = i280 ^ (i280 << 13);
        int i282 = i281 >>> 17;
        int i283 = ((~i281) & i282) | ((~i282) & i281);
        int i284 = i283 << 5;
        iArr10[0] = (i283 | i284) & (~(i283 & i284));
        return objArr34;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
        int i = 2 % 2;
        int i2 = f957a + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            Member[] memberArr = setUseCaseActive.TuitionPaymentFragmentbindingInflater1;
            Object[] objArr = new Object[1];
            d(new int[]{-658514278, 1695857339, -391874323, -1432084070, -1115108513, -1387049412, 1763869421, 2073280663, 794305209, -1741573551, -1278983920, -519866310, 221132022, 1787125217, -339565226, -978732664, -864240923, -517735572, 347197509, 1462280171, -2086034686, -665944840, 357373944, 2069476955, -2050298295, 1627022474, 1768047674, -18199372, -118006018, 387859561, -626490891, -656345419, -716648570, 597569503, 320190314, -1566060375, 1889085966, -49460317, -435058381, -1547553970, 1978919151, -1270569388, 2046555903, 523925845, -170672018, -68704718, 496367751, 1550313021, -1059627663, 1428787990, 1022504743, -2135579672, -1303266825, -674324068, 2140841001, 1580030386, 94669420, -59683373, -479166162, 1666852194, 497054353, -788868139, -928314018, -1778819252}, 82 / KeyEvent.getDeadChar(1, 1), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b = $$a[38];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            e(b, b2, b2, objArr2);
            memberArr[1] = cls.getDeclaredField((String) objArr2[0]);
        } else {
            Member[] memberArr2 = setUseCaseActive.TuitionPaymentFragmentbindingInflater1;
            Object[] objArr3 = new Object[1];
            d(new int[]{-658514278, 1695857339, -391874323, -1432084070, -1115108513, -1387049412, 1763869421, 2073280663, 794305209, -1741573551, -1278983920, -519866310, 221132022, 1787125217, -339565226, -978732664, -864240923, -517735572, 347197509, 1462280171, -2086034686, -665944840, 357373944, 2069476955, -2050298295, 1627022474, 1768047674, -18199372, -118006018, 387859561, -626490891, -656345419, -716648570, 597569503, 320190314, -1566060375, 1889085966, -49460317, -435058381, -1547553970, 1978919151, -1270569388, 2046555903, 523925845, -170672018, -68704718, 496367751, 1550313021, -1059627663, 1428787990, 1022504743, -2135579672, -1303266825, -674324068, 2140841001, 1580030386, 94669420, -59683373, -479166162, 1666852194, 497054353, -788868139, -928314018, -1778819252}, 122 - KeyEvent.getDeadChar(0, 0), objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            byte b3 = $$a[38];
            byte b4 = b3;
            Object[] objArr4 = new Object[1];
            e(b3, b4, b4, objArr4);
            memberArr2[0] = cls2.getDeclaredField((String) objArr4[0]);
        }
        int i3 = f957a + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 75 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r6, int r7, int r8) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 56
            int r7 = 122 - r7
            byte[] r0 = defpackage.getNumOfAttempts.$$c
            int r6 = r6 * 3
            int r6 = r6 + 1
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r8 = r8 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getNumOfAttempts.$$e(byte, int, int):java.lang.String");
    }
}
