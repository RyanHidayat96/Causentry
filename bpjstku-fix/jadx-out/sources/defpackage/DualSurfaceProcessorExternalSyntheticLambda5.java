package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR$\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0007\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\n\u0010\rR$\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u000e\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"LDualSurfaceProcessorExternalSyntheticLambda5;", "LDualSurfaceProcessorExternalSyntheticLambda2;", "Landroid/content/SharedPreferences;", "p0", "<init>", "(Landroid/content/SharedPreferences;)V", "", "b", "()V", "", "TuitionPaymentFragmentbindingInflater1", "()J", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(J)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Landroid/content/SharedPreferences;"}, k = 1, mv = {1, 4, 0})
public final class DualSurfaceProcessorExternalSyntheticLambda5 implements DualSurfaceProcessorExternalSyntheticLambda2 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static long b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final SharedPreferences TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$d = {55, -47, -47, 67, -11, 3, 64, -56, -7, 1, 9, -4, 8, 56, -55, -2, -8, 14, 4, 2, -17, 15, 56, -67, 14, -7, -1, -4, 16, 3, -11, 2, 9, -2, 3, 58, -20, -43, 2, 9, -2, 3, 19, -26, 13, 4, -18, 16, -32, 13, -10, 12, -5, 2, 31, -16, -23, 13, 9, -8, -5, 47, -43, 18, -5, -5, 9, -8, -5, 2, 4, 12, 3, -5, 9, -10, 4, -4, 3, 4, -4, 10, 2, -17, 14, 5, -17, 43, -33, 12, 0, -6, 9, 0, 0, 6, -19, 10, -7, 66};
    private static final int $$e = 87;
    private static final byte[] $$a = {94, 6, -99, -107, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = DerHeader.TAG_CLASS_PRIVATE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f130a = 0;
    private static int d = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r8 = r8 + 4
            int r0 = r6 + 1
            byte[] r1 = defpackage.DualSurfaceProcessorExternalSyntheticLambda5.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2b:
            int r7 = r7 + r8
            int r7 = r7 + (-10)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DualSurfaceProcessorExternalSyntheticLambda5.c(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = defpackage.DualSurfaceProcessorExternalSyntheticLambda5.$$d
            int r7 = r7 * 15
            int r7 = r7 + 84
            int r5 = r5 * 44
            int r5 = r5 + 4
            int r6 = r6 * 8
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L28:
            r3 = r0[r5]
        L2a:
            int r5 = r5 + 1
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DualSurfaceProcessorExternalSyntheticLambda5.f(int, int, short, java.lang.Object[]):void");
    }

    public DualSurfaceProcessorExternalSyntheticLambda5(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = sharedPreferences;
    }

    @Override // defpackage.DualSurfaceProcessorExternalSyntheticLambda2
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = d + 109;
        f130a = i2 % 128;
        int i3 = i2 % 2;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getLong("com.lyft.kronos.cached_current_time", 0L);
    }

    @Override // defpackage.DualSurfaceProcessorExternalSyntheticLambda2
    public final void TuitionPaymentFragmentbindingInflater1(long j) {
        int i = 2 % 2;
        int i2 = d + 71;
        f130a = i2 % 128;
        if (i2 % 2 == 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.edit().putLong("com.lyft.kronos.cached_current_time", j).apply();
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.edit().putLong("com.lyft.kronos.cached_current_time", j).apply();
            throw null;
        }
    }

    @Override // defpackage.DualSurfaceProcessorExternalSyntheticLambda2
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = f130a + 11;
        d = i2 % 128;
        int i3 = i2 % 2;
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getLong("com.lyft.kronos.cached_elapsed_time", 0L);
        int i4 = d + 59;
        f130a = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    @Override // defpackage.DualSurfaceProcessorExternalSyntheticLambda2
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j) {
        int i = 2 % 2;
        int i2 = f130a + 49;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.edit().putLong("com.lyft.kronos.cached_elapsed_time", j).apply();
        int i4 = d + 45;
        f130a = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
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
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 19473), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2623, 13 - TextUtils.getOffsetBefore("", 0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (b ^ 9053247990562531611L);
                try {
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 39422), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 482, 36 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    int i4 = $10 + 1;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
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
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $11 + 15;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 39422), View.MeasureSpec.getSize(0) + 481, 37 - TextUtils.getOffsetBefore("", 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
        int i8 = $11 + 57;
        $10 = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // defpackage.DualSurfaceProcessorExternalSyntheticLambda2
    public final long TuitionPaymentFragmentbindingInflater1() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = f130a + 79;
        d = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (31533 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
            int longPressTimeout = 921 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int iRed = 28 - Color.red(0);
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr2 = new Object[1];
            c(b2, b2, bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, longPressTimeout, iRed, -1048449946, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{9561, 30485, 33242, 54147, 27739, 48670, 51406, 6851, 46927, 49424, 5000, 44426, 65125, 2092, 23270, 62640, 357, 21256, 60898, 16302, 18535, 39468}, TextUtils.indexOf((CharSequence) "", '0') + 21060, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{9565, 57985, 43763, 29239, 14879, 49780, 35746, 21433, 7157, 8996, 60166, 45931, 30893, 132, 51451}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 51156, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (31534 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            int i5 = 922 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 28;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c((byte) 52, bArr2[37], bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, i5, threadPriority, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char capsMode = (char) (31533 - TextUtils.getCapsMode("", 0, 0));
                int iRed2 = Color.red(0) + 921;
                int trimmedLength = 28 - TextUtils.getTrimmedLength("");
                byte b3 = $$a[37];
                Object[] objArr6 = new Object[1];
                c((byte) 37, b3, (byte) (b3 | 50), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, iRed2, trimmedLength, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ((((~(iIdentityHashCode | 1626946793)) * TypedValues.CycleType.TYPE_EASING) + 1172764675) + (((~((~iIdentityHashCode) | 1626946793)) | 12652704) * TypedValues.CycleType.TYPE_EASING)) - 841395132;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{9561, 40381, 21642, 3979, 50939, 47558, 28894, 11131, 57857, 42251, 7270, 55055, 36477, 18100, 14742, 61588, 44030, 25290, 9674, 39984, 22320, 3607, 49528, 47168, 29521, 11183}, 47340 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{9563, 4754, 19188, 33495, 64033, 12813, 27254, 41568, 39856, 54175, 3042, 17348, 47919, 62218, 11134, 25408, 22695, 37017}, (ViewConfiguration.getScrollBarSize() >> 8) + 14303, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i9 = d + 83;
                f130a = i9 % 128;
                if (i9 % 2 != 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{9554, 20550, 53104, 31236, 61802, 27855, 39907, 5775, 36263, 15105, 46685, 11540, 22591, 55263, 17135, 63876}, 29983 - Gravity.getAbsoluteGravity(0, 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{9553, 33087, 28059, 51327, 46272, 4286, 65310, 23540, 1640, 57890, 20117, 13585, 37343, 31824, 55350, 33936}, TextUtils.getTrimmedLength("") + 42083, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -841395132};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[90];
                byte b5 = bArr3[9];
                Object[] objArr13 = new Object[1];
                f(b4, b5, b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr3[9];
                byte b7 = bArr3[90];
                Object[] objArr14 = new Object[1];
                f(b6, b7, b7, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0'));
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 921;
                    int jumpTapTimeout = 28 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    byte b8 = $$a[37];
                    Object[] objArr16 = new Object[1];
                    c((byte) 37, b8, (byte) (b8 | 50), objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, keyRepeatDelay, jumpTapTimeout, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    e(new char[]{9561, 30485, 33242, 54147, 27739, 48670, 51406, 6851, 46927, 49424, 5000, 44426, 65125, 2092, 23270, 62640, 357, 21256, 60898, 16302, 18535, 39468}, 21059 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(new char[]{9565, 57985, 43763, 29239, 14879, 49780, 35746, 21433, 7157, 8996, 60166, 45931, 30893, 132, 51451}, KeyEvent.normalizeMetaState(0) + 51157, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char packedPositionType = (char) (31533 - ExpandableListView.getPackedPositionType(0L));
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 921;
                        int fadingEdgeLength = 28 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte[] bArr4 = $$a;
                        Object[] objArr19 = new Object[1];
                        c((byte) 52, bArr4[37], bArr4[7], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionType, deadChar, fadingEdgeLength, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c3 = (char) (31533 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        int longPressTimeout2 = 921 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int i10 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28;
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[80];
                        Object[] objArr20 = new Object[1];
                        c(b9, b9, bArr5[7], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, longPressTimeout2, i10, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i11 = d + 119;
                    f130a = i11 % 128;
                    int i12 = i11 % 2;
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 != i13) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i15 = f130a + 115;
                d = i15 % 128;
                while (true) {
                    int i16 = i15 % 2;
                    if (i4 >= strArr.length) {
                        break;
                    }
                    arrayList.add(strArr[i4]);
                    i4++;
                    i15 = d + 77;
                    f130a = i15 % 128;
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }
        int i17 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i18 = i17 + (-546506260) + ((~((-134479875) | startElapsedRealtime)) * 623) + (((~startElapsedRealtime) | 20450881) * (-623)) + (((~(startElapsedRealtime | 830025325)) | (~((-944054319) | startElapsedRealtime)) | 134479874) * 623);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        Object obj2 = objArr21[0];
        ((int[]) obj2)[0] = i20 ^ (i20 << 5);
        int i21 = d + 13;
        f130a = i21 % 128;
        if (i21 % 2 != 0) {
            int i22 = 4 % 5;
        }
        SharedPreferences sharedPreferences = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i23 = ((int[]) obj2)[0];
        int i24 = i23 * i23;
        int i25 = -(165981723 * i23);
        int i26 = ((((i24 | i25) << 1) - (i24 ^ i25)) - (~(-(i23 * 1859520029)))) - 1206930673;
        int i27 = ((i26 >> 18) - 32767) / 16384;
        int i28 = (i27 & 1) + (i27 | 1);
        int i29 = ((i26 | i28) << 1) - (i28 ^ i26);
        int i30 = i26 >> 17;
        int i31 = -(i29 ^ (((((-65535) ^ i30) + ((i30 & (-65535)) << 1)) / 32768) + 1));
        int i32 = ((i31 | 7) << 1) - (i31 ^ 7);
        int i33 = i32 >> 25;
        int i34 = ((i33 & (-255)) + (i33 | (-255))) / 128;
        int i35 = (i34 & 1) + (i34 | 1);
        return sharedPreferences.getLong("com.lyft.kronos.cached_offset", ((long) (274372 / (((-((i35 & 1) + (i35 | 1))) & i32) * 82))) - 478);
    }

    @Override // defpackage.DualSurfaceProcessorExternalSyntheticLambda2
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j) {
        int i = 2 % 2;
        int i2 = d + 111;
        f130a = i2 % 128;
        int i3 = i2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.edit().putLong("com.lyft.kronos.cached_offset", j).apply();
        int i4 = d + 15;
        f130a = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // defpackage.DualSurfaceProcessorExternalSyntheticLambda2
    public final void b() {
        int i = 2 % 2;
        int i2 = d + 83;
        f130a = i2 % 128;
        int i3 = i2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.edit().clear().apply();
        int i4 = f130a + 79;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        INSTANCE = new Companion(null);
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        if (i % 2 == 0) {
            int i2 = 71 / 0;
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        b = 4299986763284253731L;
    }
}
