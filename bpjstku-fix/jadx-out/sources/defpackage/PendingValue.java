package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0011¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00068\u0011@RX\u0091\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"LPendingValue;", "LCameraControllerExternalSyntheticLambda7;", "Lkotlin/UByteArray;", "p0", "<init>", "([BLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(I)V", "TuitionPaymentFragmentbindingInflater1", "()[B", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "[B", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "I", "b", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PendingValue extends CameraControllerExternalSyntheticLambda7<UByteArray> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$d = {1, -81, 2, 79, 17, 3, -58, 62, 13, 5, -3, 10, -2, -50, 56, 18, -5, 19, 2, -1, 0, -49, 68, -7, 24, -10, 18, -4, -3, 16, -57, 58, 17, 2, 8, 8, -63, 76, 4, -6, 8, 2, 16, -6, 1, 19, -64, 40, 41, -15, 18, 11, -6, 22, -16, 18, -22, 35, -76, 36, 52, -8, 1, 24, -10, -30, 50, 14, -14, 19, -28, 24, 19, 7, -4, 13};
    private static final int $$e = 94;
    private static final byte[] $$a = {114, -115, 48, 84, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 109;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int b = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 8374769349515774451L;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 52
            int r8 = 55 - r8
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r0 = r6 + 1
            byte[] r1 = defpackage.PendingValue.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2c:
            int r7 = r7 + r8
            int r7 = r7 + (-10)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.PendingValue.a(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 72
            int r0 = r7 + 1
            int r6 = r6 + 98
            byte[] r1 = defpackage.PendingValue.$$d
            int r8 = r8 * 72
            int r8 = 76 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r8 = r8 + r6
            int r6 = r3 + 1
            int r8 = r8 + (-5)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.PendingValue.d(byte, int, int, java.lang.Object[]):void");
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
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.alpha(0) + 19472), 2624 - Color.argb(0, 0, 0, 0), 12 - ImageFormat.getBitsPerPixel(0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 9053247990562531611L);
                try {
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 39423), (Process.myPid() >> 22) + 481, (ViewConfiguration.getTapTimeout() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    int i4 = $11 + 79;
                    $10 = i4 % 128;
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
        int i6 = $11 + 125;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - View.MeasureSpec.getSize(0)), (ViewConfiguration.getScrollBarSize() >> 8) + 481, MotionEvent.axisFromString("") + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final /* synthetic */ UByteArray TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = b + 43;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            UByteArray.m8098boximpl(TuitionPaymentFragmentbindingInflater1());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        UByteArray uByteArrayM8098boximpl = UByteArray.m8098boximpl(TuitionPaymentFragmentbindingInflater1());
        int i3 = TuitionPaymentFragmentbindingInflater1 + 77;
        b = i3 % 128;
        int i4 = i3 % 2;
        return uByteArrayM8098boximpl;
    }

    private PendingValue(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = UByteArray.m8106getSizeimpl(bArr);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    /* JADX INFO: renamed from: b */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 105;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i6 = i2 + 35;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int p0) {
        int i = 2 % 2;
        int i2 = b + 15;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            UByteArray.m8106getSizeimpl(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            throw null;
        }
        if (UByteArray.m8106getSizeimpl(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) < p0) {
            byte[] bArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, RangesKt.coerceAtLeast(p0, UByteArray.m8106getSizeimpl(bArr) * 2));
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = UByteArray.m8100constructorimpl(bArrCopyOf);
            int i3 = TuitionPaymentFragmentbindingInflater1 + 101;
            b = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = TuitionPaymentFragmentbindingInflater1 + 31;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    private byte[] TuitionPaymentFragmentbindingInflater1() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31532);
            int iAxisFromString = MotionEvent.axisFromString("") + 922;
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 28;
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr3 = new Object[1];
            a(b2, b2, bArr[37], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iAxisFromString, offsetBefore, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{8329, 6007, 20334, 34633, 65347, 14132, 28458, 42833, 40719, 55266, 4012, 18400, 49117, 63398, 12210, 26514, 24469, 38826, 52854, 1636, 32351, 46662}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 14321, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{8333, 21113, 50547, 30831, 60271, 7804, 37218, 1105, 46949, 10860, 23910, 53315, 17245, 63068, 26971}, 29437 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 31534);
            int keyRepeatTimeout = 921 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int i2 = 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            byte b3 = $$a[37];
            Object[] objArr6 = new Object[1];
            a((byte) 52, b3, b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAxisFromString, keyRepeatTimeout, i2, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 31533);
                int maxKeyCode = 921 - (KeyEvent.getMaxKeyCode() >> 16);
                int iIndexOf = TextUtils.indexOf("", "", 0) + 28;
                byte b4 = (byte) ($$b & 183);
                byte[] bArr2 = $$a;
                Object[] objArr7 = new Object[1];
                a(b4, bArr2[37], bArr2[80], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatDelay, maxKeyCode, iIndexOf, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = ((((-284069727) + (((~(1515307645 | iIdentityHashCode)) | 86772738) * (-140))) + ((~(1602080383 | iIdentityHashCode)) * 70)) + (((~(iIdentityHashCode | 258771998)) | 1430081123) * 70)) - 465592608;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[0])[0] = i5 ^ (i5 << 5);
            int i6 = TuitionPaymentFragmentbindingInflater1 + 19;
            b = i6 % 128;
            int i7 = i6 % 2;
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{8329, 713, 25618, 18039, 43451, 35594, 60758, 53487, 13041, 5215, 30606, 22947, 47901, 40584, 49358, 8736, 1134, 26558, 18706, 43852, 36496, 61691, 53840, 13716, 6113, 31035}, 8783 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{8331, 51968, 63392, 57933, 36601, 47767, 42290, 20962, 31856, 26653, 5286, 16190, 11223, 54896, 49674, 61106, 39255, 34283}, 60317 - (ViewConfiguration.getScrollBarSize() >> 8), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            c(new char[]{8322, 22642, 53608, 19064, 49962, 31843, 62827, 28251, 59223, 24597, 39285, 4696, 35679, 1059, 48439, 13872}, 30971 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            c(new char[]{8321, 27139, 46483, 65323, 2720, 21578, 40902, 10616, 29912, 49038, 51469, 5285, 24095, 59844, 13150, 32492}, View.resolveSize(0, 0) + 19087, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            int i8 = b + 87;
            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(iIntValue), 0, -465592608};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[0];
                byte b6 = b5;
                Object[] objArr14 = new Object[1];
                d(b5, b6, b6, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b7 = bArr3[20];
                byte b8 = b7;
                Object[] objArr15 = new Object[1];
                d(b7, b8, b8, objArr15);
                objArr = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char keyRepeatTimeout2 = (char) (31533 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 921;
                    int iIndexOf2 = 27 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    byte b9 = (byte) ($$b & 183);
                    byte[] bArr4 = $$a;
                    Object[] objArr16 = new Object[1];
                    a(b9, bArr4[37], bArr4[80], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatTimeout2, longPressTimeout, iIndexOf2, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{8329, 6007, 20334, 34633, 65347, 14132, 28458, 42833, 40719, 55266, 4012, 18400, 49117, 63398, 12210, 26514, 24469, 38826, 52854, 1636, 32351, 46662}, 14320 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{8333, 21113, 50547, 30831, 60271, 7804, 37218, 1105, 46949, 10860, 23910, 53315, 17245, 63068, 26971}, TextUtils.indexOf((CharSequence) "", '0', 0) + 29438, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char packedPositionChild = (char) (31532 - ExpandableListView.getPackedPositionChild(0L));
                        int i10 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 920;
                        int iIndexOf3 = 28 - TextUtils.indexOf("", "", 0);
                        byte b10 = $$a[37];
                        Object[] objArr19 = new Object[1];
                        a((byte) 52, b10, b10, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionChild, i10, iIndexOf3, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cKeyCodeFromString = (char) (31533 - KeyEvent.keyCodeFromString(""));
                        int i11 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 921;
                        int scrollDefaultDelay = 28 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[80];
                        Object[] objArr20 = new Object[1];
                        a(b11, b11, bArr5[37], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, i11, scrollDefaultDelay, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i12 = TuitionPaymentFragmentbindingInflater1 + 31;
                    b = i12 % 128;
                    int i13 = i12 % 2;
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 == i14) {
            int i16 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i17 = ~iUptimeMillis;
            int i18 = i16 + 694868803 + (((~(849093863 | i17)) | 86116624) * 184) + ((iUptimeMillis | 10224707) * (-184)) + ((~((-924985781) | i17)) * 184);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr2[0])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i21 = TuitionPaymentFragmentbindingInflater1 + 55;
                b = i21 % 128;
                for (int i22 = i21 % 2 == 0 ? 1 : 0; i22 < strArr.length; i22++) {
                    arrayList.add(strArr[i22]);
                }
            }
            Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
            int i23 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i24 = i23 + (-1661188943) + (((~((-1730633703) | startElapsedRealtime)) | (-1740111864)) * (-502)) + ((~((~startElapsedRealtime) | (-1696665923))) * (-502)) + (((~(startElapsedRealtime | (-43445942))) | (-1730633703)) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr2[0])[0] = i26 ^ (i26 << 5);
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i27 = ((int[]) objArr2[0])[0];
        int i28 = i27 * i27;
        int i29 = -(629850323 * i27);
        int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
        int i31 = -(i27 * (-844052271));
        int i32 = (i30 & i31) + (i31 | i30);
        int i33 = ((i32 | (-2065286076)) << 1) - ((-2065286076) ^ i32);
        int i34 = i33 >> 15;
        int i35 = (((-262143) ^ i34) + ((i34 & (-262143)) << 1)) / 131072;
        int i36 = (i33 - (~((i35 ^ 1) + ((i35 & 1) << 1)))) - 1;
        int i37 = i33 >> 21;
        int i38 = ((i37 ^ (-4095)) + ((i37 & (-4095)) << 1)) / 2048;
        int i39 = (-(i36 ^ ((i38 & 1) + (i38 | 1)))) + 5;
        int i40 = i39 >> 25;
        int i41 = (((i40 & (-255)) + (i40 | (-255))) / 128) + 1;
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "16/1/18/4/copyOf(...)".substring(11250 / ((i39 & (-(((i41 | 1) << 1) - (i41 ^ 1)))) * 225)));
        byte[] bArrM8100constructorimpl = UByteArray.m8100constructorimpl(bArrCopyOf);
        int i42 = TuitionPaymentFragmentbindingInflater1 + 119;
        b = i42 % 128;
        int i43 = i42 % 2;
        return bArrM8100constructorimpl;
    }

    public /* synthetic */ PendingValue(byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr);
    }
}
