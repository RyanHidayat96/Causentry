package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.datadog.android.core.configuration.UploadFrequency;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0080\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0011\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00108\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00108\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012"}, d2 = {"LgetSupportedEffectTargets;", "", "Lcom/datadog/android/core/configuration/UploadFrequency;", "p0", "", "p1", "<init>", "(Lcom/datadog/android/core/configuration/UploadFrequency;I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "a", "Lcom/datadog/android/core/configuration/UploadFrequency;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "I", "TuitionPaymentFragmentbindingInflater1", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class getSupportedEffectTargets {
    private static char[] asInterface;
    private static int d;
    private static long g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final long b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final long TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final UploadFrequency TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {107, 48, 57, 107};
    private static final int $$f = 247;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {5, -91, 77, 46, -4, -32, -15, -14, -8, -20, -28, 49, -13, -50, -45, 18, -61, -17, -13, 28, -47, -28, -17, 55, -50, -68, 4, -19, -28, -21, -6, -23, -16, 26, -47, -36, 0, -22, -18, -22, -10, 4, -36, -31, -14, -16, -16, -22, -3, 18, -62, -6, -38, 68, -30, -50, -5, -28, -6, -23, -16, 13, -34, -41, -5, -9, -26, -23, 29, -61, 0, -23, -23, -9, -26, -23, 1, -24, -22, -7, -22, -22, -10, 13, -54, -9, -23, -6, -36, -2, -30, 48};
    private static final int $$e = 183;
    private static final byte[] $$a = {68, 104, -93, -37, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 158;
    private static int notify = 0;
    private static int cancelAll = 1;
    private static int asBinder = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.getSupportedEffectTargets.$$a
            int r8 = r8 * 52
            int r1 = 53 - r8
            int r7 = r7 + 84
            int r6 = r6 * 52
            int r6 = 56 - r6
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r3
            int r7 = r7 + 1
            int r6 = r6 + (-11)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getSupportedEffectTargets.c(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 51
            int r6 = r6 + 4
            int r8 = r8 * 14
            int r0 = r8 + 38
            int r7 = r7 * 30
            int r7 = 114 - r7
            byte[] r1 = defpackage.getSupportedEffectTargets.$$d
            byte[] r0 = new byte[r0]
            int r8 = r8 + 37
            r2 = 0
            if (r1 != 0) goto L19
            r7 = r6
            r4 = r8
            r3 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L31:
            int r4 = -r4
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-17)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getSupportedEffectTargets.f(int, short, int, java.lang.Object[]):void");
    }

    public getSupportedEffectTargets(UploadFrequency uploadFrequency, int i) {
        Intrinsics.checkNotNullParameter(uploadFrequency, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = uploadFrequency;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
        this.b = uploadFrequency.getBaseStepMs();
        this.TuitionPaymentFragmentbindingInflater1 = uploadFrequency.getBaseStepMs() * 10;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = uploadFrequency.getBaseStepMs() * 5;
    }

    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i4 = $10 + 15;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i6 = $10 + 5;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(asInterface[i + i8])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.getMode(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2187, 41 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 841711447, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(g), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 33017), 3011 - Color.red(0), 26 - TextUtils.indexOf("", "", 0, 0), 321985076, false, $$g(b3, b4, (byte) (b4 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - KeyEvent.getDeadChar(0, 0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3375, 17 - View.getDefaultSize(0, 0), -968507904, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
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
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i9 = $10 + 109;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b7 = (byte) 0;
                byte b8 = b7;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 36505), MotionEvent.axisFromString("") + 3377, 17 - View.MeasureSpec.getSize(0), -968507904, false, $$g(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    public final int hashCode() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int iMyTid = (Process.myTid() >> 22) + 876;
            int iIndexOf = 9 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            byte b = $$a[5];
            Object[] objArr2 = new Object[1];
            c((byte) (-b), (byte) ($$b & 47), (byte) (-b), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, iMyTid, iIndexOf, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(View.MeasureSpec.makeMeasureSpec(0, 0), KeyEvent.normalizeMetaState(0) + 22, (char) (23789 - (ViewConfiguration.getWindowTouchSlop() >> 8)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22, AndroidCharacter.getMirror('0') - '!', (char) (40571 - View.MeasureSpec.makeMeasureSpec(0, 0)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cGreen = (char) Color.green(0);
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 876;
            int i2 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10;
            byte[] bArr = $$a;
            byte b2 = (byte) (-bArr[5]);
            byte b3 = bArr[7];
            Object[] objArr5 = new Object[1];
            c(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cGreen, iKeyCodeFromString, i2, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = cancelAll + 33;
            notify = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                int doubleTapTimeout = 876 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int fadingEdgeLength = 10 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c(bArr2[7], bArr2[54], (byte) (-bArr2[5]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, doubleTapTimeout, fadingEdgeLength, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i5 = ~((int) Process.getElapsedCpuTime());
            int i6 = ((2012795060 + (((~(i5 | 622413574)) | 44183601) * (-160))) + (((~(i5 | 582103345)) | 622413574) * 160)) - 282458816;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 36, View.MeasureSpec.getSize(0) + 26, (char) (10194 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(63 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 18, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 81, Color.green(0) + 16, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(97 - View.MeasureSpec.getSize(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, (char) (41379 - ExpandableListView.getPackedPositionType(0L)), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), -282458816};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[36];
                Object[] objArr13 = new Object[1];
                f(b4, b4, bArr3[76], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = bArr3[76];
                Object[] objArr14 = new Object[1];
                f(b5, b5, bArr3[36], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i9 = cancelAll + 95;
                    notify = i9 % 128;
                    int i10 = i9 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                        int iNormalizeMetaState = 876 - KeyEvent.normalizeMetaState(0);
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 10;
                        byte[] bArr4 = $$a;
                        Object[] objArr16 = new Object[1];
                        c(bArr4[7], bArr4[54], (byte) (-bArr4[5]), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iNormalizeMetaState, absoluteGravity, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(ViewConfiguration.getDoubleTapTimeout() >> 16, 22 - KeyEvent.keyCodeFromString(""), (char) (23788 - TextUtils.lastIndexOf("", '0', 0)), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22, 15 - View.resolveSizeAndState(0, 0, 0), (char) (View.MeasureSpec.getMode(0) + 40571), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                            int defaultSize = 876 - View.getDefaultSize(0, 0);
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 10;
                            byte[] bArr5 = $$a;
                            byte b6 = (byte) (-bArr5[5]);
                            byte b7 = bArr5[7];
                            Object[] objArr19 = new Object[1];
                            c(b6, b7, b7, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, defaultSize, absoluteGravity2, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 876;
                            int deadChar = 10 - KeyEvent.getDeadChar(0, 0);
                            byte b8 = $$a[5];
                            Object[] objArr20 = new Object[1];
                            c((byte) (-b8), (byte) ($$b & 47), (byte) (-b8), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(minimumFlingVelocity, scrollBarSize, deadChar, 252381699, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i11 = notify + 17;
                        cancelAll = i11 % 128;
                        int i12 = i11 % 2;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i13 = ((int[]) objArr[2])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 != i13) {
            throw new RuntimeException(String.valueOf(i14));
        }
        int i15 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iMyPid = Process.myPid();
        int i16 = 85245128 + (((~((~iMyPid) | 461841347)) | (-535772124)) * (-245));
        int i17 = ~(iMyPid | 461841347);
        int i18 = i15 + i16 + (i17 * (-245)) + ((i17 | 502151576) * 245);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr21[1])[0] = i20 ^ (i20 << 5);
        int i21 = notify + 67;
        cancelAll = i21 % 128;
        return i21 % 2 == 0 ? (iHashCode + 31) << Integer.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) : (iHashCode * 31) + Integer.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    static {
        d = 0;
        b();
        INSTANCE = new Companion(null);
        int i = asBinder + 25;
        d = i % 128;
        int i2 = i % 2;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = cancelAll + 39;
            notify = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(p0 instanceof getSupportedEffectTargets)) {
            int i4 = cancelAll + 19;
            notify = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        getSupportedEffectTargets getsupportedeffecttargets = (getSupportedEffectTargets) p0;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == getsupportedeffecttargets.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == getsupportedeffecttargets.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        int i6 = cancelAll + 5;
        notify = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        UploadFrequency uploadFrequency = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StringBuilder sb = new StringBuilder("getSupportedEffectTargets(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(uploadFrequency);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(i2);
        sb.append(")");
        String string = sb.toString();
        int i3 = notify + 13;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    static void b() {
        asInterface = new char[]{60688, 40436, 3267, 49090, 11954, 55695, 18583, 64306, 27206, 5441, 33905, 14139, 42508, 22253, 49631, 28881, 58284, 37545, 7579, 35951, 16206, 44637, 12162, 24416, 52816, 32086, 60472, 6933, 35329, 14808, 43226, 55237, 18085, 62858, 25738, 37989, 856, 38447, 59083, 30716, 50429, 21901, 41648, 13224, 32781, 4471, 28285, 65296, 19577, 56587, 11714, 47840, 3042, 39048, 59836, 26300, 63302, 17478, 54625, 8718, 45878, '\'', 37081, 45567, 49410, 20536, 58159, 29269, 34149, 5226, 42928, 14004, 18863, 55518, 27628, 64251, 2578, 40242, 11312, 48963, 52841, 45558, 49430, 20540, 58172, 29214, 34151, 5247, 42911, 13987, 18929, 55521, 27644, 64235, 2567, 40227, 11316, 4182, 24752, 61836, 17040, 54247, 9409, 46537, 1579, 38703, 59421, 31074, 51790, 23416, 43967, 15489, 36255};
        g = 7776117586536546679L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, int r8, int r9) {
        /*
            byte[] r0 = defpackage.getSupportedEffectTargets.$$c
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r9 = r9 * 3
            int r9 = r9 + 109
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r5 = r2
            r9 = r8
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2d:
            int r8 = r8 + r3
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getSupportedEffectTargets.$$g(short, int, int):java.lang.String");
    }
}
