package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.koushikdutta.ion.ResponseServedFrom;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public final class transformSingleOutput<T> {
    private static int $10 = 0;
    private static int $11 = 1;
    ResponseServedFrom TuitionPaymentFragmentbindingInflater1;
    private T TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    Exception TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Node TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private SurfaceEdgeSettableSurfaceExternalSyntheticLambda2 b;
    private static final byte[] $$a = {68, 104, -93, -37, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 134;
    private static int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1415a = 1;
    private static long asBinder = -3012299494983906187L;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r0 = defpackage.transformSingleOutput.$$a
            int r6 = r6 * 2
            int r1 = 53 - r6
            int r8 = r8 * 2
            int r8 = 84 - r8
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r6
            r8 = r7
            r4 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.transformSingleOutput.d(short, byte, short, java.lang.Object[]):void");
    }

    public transformSingleOutput(Node node, ResponseServedFrom responseServedFrom, SurfaceEdgeSettableSurfaceExternalSyntheticLambda2 surfaceEdgeSettableSurfaceExternalSyntheticLambda2, Exception exc, T t) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = node;
        this.TuitionPaymentFragmentbindingInflater1 = responseServedFrom;
        this.b = surfaceEdgeSettableSurfaceExternalSyntheticLambda2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = exc;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = t;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ef  */
    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (true) {
            obj = null;
            if (getrealtimecapturelatency.b >= cArr.length) {
                break;
            }
            int i3 = $10 + 73;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2624, (Process.myTid() >> 22) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() & (asBinder % 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - Drawable.resolveOpacity(0, 0)), View.MeasureSpec.getMode(0) + 481, 36 - TextUtils.indexOf((CharSequence) "", '0', 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 19471), Color.blue(0) + 2624, 13 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (asBinder ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - (ViewConfiguration.getScrollBarSize() >> 8)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 480, (ViewConfiguration.getWindowTouchSlop() >> 8) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39421 - TextUtils.indexOf((CharSequence) "", '0', 0)), 529 - AndroidCharacter.getMirror('0'), 37 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
        int i6 = $11 + 25;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final T TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
        int iIntValue;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.blue(0) + 46400), 40 - Color.argb(0, 0, 0, 0), 19 - View.MeasureSpec.getMode(0), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        c(new char[]{58639, 57807, 60564, 60273, 63037, 64780, 63952, 50409, 50041, 52826, 54614, 53720, 56483, 56222, 42568, 44330, 43507, 46226, 45964, 48732, 34081, 33278}, 1231 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        c(new char[]{58635, 11757, 29905, 49107, 50849, 2464, 20624, 39861, 41587, 62824, 15444, 18271, 36403, 53536, 6169}, TextUtils.getTrimmedLength("") + 51439, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = 220;
        long j2 = -1;
        long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
        long j3 = jElapsedRealtime ^ j2;
        long j4 = (((long) 221) * 4354804278233889833L) + (((long) (-219)) * (-2257547103491930846L)) + (((((j2 ^ 4354804278233889833L) | (j2 ^ (-2257547103491930846L))) ^ j2) | ((j3 | (-220711566801109717L)) ^ j2)) * j) + (((long) (-440)) * (((j3 | (-2257547103491930846L)) ^ j2) | 4354804278233889833L)) + (j * ((-220711566801109717L) | jElapsedRealtime));
        int i3 = g + 57;
        f1415a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        try {
            while (i5 != 10) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - Gravity.getAbsoluteGravity(0, 0)), ImageFormat.getBitsPerPixel(0) + 60, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 17, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                long j5 = jLongValue;
                int i7 = 0;
                while (true) {
                    for (int i8 = 0; i8 != 8; i8++) {
                        i6 = (((((int) (j5 >> i8)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                    }
                    if (i7 != 0) {
                        break;
                    }
                    int i9 = g;
                    int i10 = i9 + 83;
                    f1415a = i10 % 128;
                    int i11 = i10 % 2;
                    i7++;
                    int i12 = i9 + 101;
                    f1415a = i12 % 128;
                    int i13 = i12 % 2;
                    j5 = j4;
                }
                if (i6 == i2) {
                    return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                }
                int i14 = f1415a + 25;
                g = i14 % 128;
                if (i14 % 2 != 0) {
                    jLongValue -= 1024;
                    i5 += 94;
                } else {
                    jLongValue -= 1024;
                    i5++;
                }
            }
            Object[] objArr3 = {-172673186};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46038 - (ViewConfiguration.getTapTimeout() >> 16)), 1134 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 18 - Color.blue(0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr4 = {Integer.valueOf(iIntValue), 0, -1770104641, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr3), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int mode = View.MeasureSpec.getMode(0) + 1031;
                int iArgb = 15 - Color.argb(0, 0, 0, 0);
                byte b = $$a[7];
                byte b2 = b;
                Object[] objArr5 = new Object[1];
                d(b, b2, b2, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(windowTouchSlop, mode, iArgb, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 45993), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1117, 17 - (Process.myPid() >> 22)), Boolean.TYPE});
            }
            Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4);
            int i15 = ((int[]) objArr6[1])[0];
            int i16 = ((int[]) objArr6[3])[0];
            if (i16 != i15) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr6[0];
                if (strArr != null) {
                    int i17 = 0;
                    while (i17 < strArr.length) {
                        int i18 = g + 53;
                        f1415a = i18 % 128;
                        int i19 = i18 % 2;
                        arrayList.add(strArr[i17]);
                        i17++;
                        int i20 = f1415a + 95;
                        g = i20 % 128;
                        if (i20 % 2 != 0) {
                            int i21 = 4 / 2;
                        }
                    }
                }
                Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
            }
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        Object[] objArr7 = new Object[1];
        c(new char[]{58628, 54318, 34650, 30316, 8644, 4263, 50121, 45799, 27649, 24425, 3703, 63868, 43153, 39863, 19141, 1516}, View.combineMeasuredStates(0, 0) + 12577, objArr7);
        Class<?> cls2 = Class.forName((String) objArr7[0]);
        Object[] objArr8 = new Object[1];
        c(new char[]{58631, 32173, 54341, 11509, 34694, 7748, 30448, 51590, Typography.lowDoubleQuote, 47312, 5019, 27179, 49913, 9594, 48168, 5314}, 39079 - View.getDefaultSize(0, 0), objArr8);
        iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
    }
}
