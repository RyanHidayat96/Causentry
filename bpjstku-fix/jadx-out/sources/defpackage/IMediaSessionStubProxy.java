package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public final class IMediaSessionStubProxy extends setShuffleModeEnabledRemoved {
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final RectF TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private processPendingCallbacksLocked f150a;
    private final LongSparseArray<LinearGradient> asBinder;
    private final binderDied<PointF, PointF> asInterface;
    private final binderDied<getAudioAttributes, getAudioAttributes> b;
    private final LongSparseArray<RadialGradient> cancelAll;
    private final String d;
    private final boolean g;
    private final GradientType notify;
    private final binderDied<PointF, PointF> onTransact;
    private static final byte[] $$c = {70, -114, 113, 8};
    private static final int $$f = 166;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {99, -43, -44, -62, -11, 3, 64, -56, -7, 1, 9, -4, 8, 56, -50, -12, 11, -13, 4, 7, 6, 55, -56, -5, -5, 70, -52, -11, 3, 1, -1, 2, 65, -70, 2, 12, -2, 63, -19, -30, -17, 15, 48, 3, -32, -30, 12, -2, -6, -32, 13, -10, 12, -5, 2, 31, -16, -23, 13, 9, -8, -5, 47, -43, 18, -5, -5, 9, -8, -5, 2, 4, 12, 3, -5, 9, -10, 4, -4, 3, 4, -4, 10, 2, -17, 14, 5, -17, 43, -33, 12, 0, -6, 9, 0, 0, 6, -19, 10, -7, 67};
    private static final int $$e = 12;
    private static final byte[] $$a = {1, 115, -83, 116, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 87;
    private static int INotificationSideChannelDefault = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static long cancel = -6377398940819159759L;
    private static int INotificationSideChannel = -1910059499;
    private static char INotificationSideChannelStubProxy = 34097;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r6 = r6 + 84
            byte[] r0 = defpackage.IMediaSessionStubProxy.$$a
            int r8 = r8 * 15
            int r1 = 53 - r8
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2d:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.IMediaSessionStubProxy.c(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 15
            int r7 = r7 + 84
            int r8 = r8 * 7
            int r8 = r8 + 46
            int r9 = r9 + 4
            byte[] r0 = defpackage.IMediaSessionStubProxy.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L27
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
            int r7 = r7 + r9
            int r7 = r7 + 1
            r9 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.IMediaSessionStubProxy.f(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.setShuffleModeEnabledRemoved, defpackage.unregisterCallbackListener
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Canvas canvas, Matrix matrix, int i) throws Throwable {
        Shader radialGradient;
        int i2 = 2 % 2;
        if (this.g) {
            return;
        }
        b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, matrix, false);
        if (this.notify == GradientType.LINEAR) {
            int i3 = RemoteActionCompatParcelizer + 113;
            INotificationSideChannelDefault = i3 % 128;
            if (i3 % 2 != 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                throw null;
            }
            radialGradient = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        } else {
            long jTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
            RadialGradient radialGradient2 = this.cancelAll.get(jTuitionPaymentFragmentbindingInflater1);
            if (radialGradient2 != null) {
                int i4 = INotificationSideChannelDefault + 59;
                RemoteActionCompatParcelizer = i4 % 128;
                int i5 = i4 % 2;
                radialGradient = radialGradient2;
            } else {
                PointF pointFAsInterface = this.onTransact.asInterface();
                PointF pointFAsInterface2 = this.asInterface.asInterface();
                getAudioAttributes getaudioattributesAsInterface = this.b.asInterface();
                int[] iArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(getaudioattributesAsInterface.b);
                float[] fArr = getaudioattributesAsInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                float f = pointFAsInterface.x;
                float f2 = pointFAsInterface.y;
                radialGradient = new RadialGradient(f, f2, (float) Math.hypot(pointFAsInterface2.x - f, pointFAsInterface2.y - f2), iArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, fArr, Shader.TileMode.CLAMP);
                this.cancelAll.put(jTuitionPaymentFragmentbindingInflater1, radialGradient);
            }
        }
        radialGradient.setLocalMatrix(matrix);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setShader(radialGradient);
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(canvas, matrix, i);
    }

    @Override // defpackage.setRepeatMode
    public final String b() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        int i3 = i2 % 128;
        INotificationSideChannelDefault = i3;
        int i4 = i2 % 2;
        String str = this.d;
        int i5 = i3 + 13;
        RemoteActionCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
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
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $11 + 75;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getPressedStateDuration() >> 16) + 1235, 36 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -653973969, false, $$g(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char size = (char) View.MeasureSpec.getSize(0);
                    int iAxisFromString = MotionEvent.axisFromString("") + 2765;
                    int absoluteGravity = 14 - Gravity.getAbsoluteGravity(0, 0);
                    byte b3 = (byte) ($$f & 11);
                    byte b4 = (byte) (b3 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(size, iAxisFromString, absoluteGravity, 1504416861, false, $$g(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.myTid() >> 22) + 43325), 253 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getTapTimeout() >> 16) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 1;
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65199 - TextUtils.lastIndexOf("", '0')), 2891 - ((Process.getThreadPriority(0) + 20) >> 6), 17 - ((Process.getThreadPriority(0) + 20) >> 6), 2012627446, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (cancel ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) INotificationSideChannel) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) INotificationSideChannelStubProxy) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $10 + 49;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 / 3;
                }
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0270  */
    /* JADX WARN: Code duplicated, block: B:28:0x0272  */
    private LinearGradient TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 5;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cAlpha = (char) Color.alpha(0);
            int minimumFlingVelocity = 876 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 10;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[7], bArr[28], bArr[0], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha, minimumFlingVelocity, tapTimeout, -1650998592, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{64569, 61665, 60604, 13379}, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), ViewConfiguration.getScrollBarSize() >> 8, new char[]{61836, 19757, 64547, 37142, 61967, 11317, 34023, 50126, 8293, 65244, 35501, 58694, 58014, 2245, 26455, 17944, 3430, 6713, 17996, 18588, 426, 54671}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{30356, 56149, 65233, 46907}, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 15357), (-774154890) - (Process.myTid() >> 22), new char[]{5673, 14632, 10830, 5766, 10950, 41391, 24493, 39331, 35557, 61336, 31673, 53830, 17195, 8512, 62254}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 876;
            int i4 = 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            byte b = $$a[7];
            byte b2 = b;
            Object[] objArr5 = new Object[1];
            c(b2, (byte) (b2 | 36), b, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, scrollBarFadeDuration, i4, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                int i5 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 875;
                int i6 = 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                c(b4, (byte) (b4 | 88), b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, i5, i6, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i7 = ~((int) Process.getElapsedCpuTime());
            int i8 = 1041223808 + ((~((-32915) | i7)) * (-783)) + (((~(i7 | (-504009919))) | (-544320148)) * 783) + 1292613316;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{63862, 1910, 48462, 21088}, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24765), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, new char[]{34916, 64647, 63821, 33767, 8048, 14472, 17955, 50273, 51905, 22578, 46379, 45189, 52281, 49582, 44551, 6631, 27197, 8280, 570, 12511, 49104, 38383, 6380, 40134, 64444, 729}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{65253, 43233, 46814, 1420}, (char) (36022 - View.getDefaultSize(0, 0)), ViewConfiguration.getKeyRepeatTimeout() >> 16, new char[]{12186, 36976, 38484, 6359, 14206, 15623, 36020, 41834, 33505, 56350, 37043, 43113, 31144, 4293, 5302, 24542, 35679, 50472}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i11 = RemoteActionCompatParcelizer + 83;
                    INotificationSideChannelDefault = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 22 / 0;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                            int i13 = RemoteActionCompatParcelizer + 79;
                            INotificationSideChannelDefault = i13 % 128;
                            int i14 = i13 % 2;
                        } else {
                            applicationContext = null;
                        }
                    } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                        int i15 = RemoteActionCompatParcelizer + 79;
                        INotificationSideChannelDefault = i15 % 128;
                        int i16 = i15 % 2;
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i17 = RemoteActionCompatParcelizer + 79;
                    INotificationSideChannelDefault = i17 % 128;
                    int i18 = i17 % 2;
                }
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{29934, 52659, 40582, 29274}, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23198), (-1) - ImageFormat.getBitsPerPixel(0), new char[]{19969, 47508, 15221, 38060, 36993, 38989, 59077, 3897, 26986, 43571, 58983, 28919, 24108, 53508, 44103, 58448}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{31059, 15785, 642, 46772}, (char) (46082 - TextUtils.indexOf("", "")), ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{34787, 42428, 41244, 49585, 32775, 56907, 23805, 59610, 16369, 6857, 24827, 46099, 50790, 33574, 3302, 6465}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1292613316};
                byte[] bArr2 = $$d;
                Object[] objArr13 = new Object[1];
                f(bArr2[9], bArr2[91], bArr2[30], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                f(bArr2[91], bArr2[9], (byte) (-bArr2[2]), objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iRed = 876 - Color.red(0);
                        int iResolveOpacity = 10 - Drawable.resolveOpacity(0, 0);
                        byte b5 = $$a[7];
                        byte b6 = b5;
                        Object[] objArr15 = new Object[1];
                        c(b6, (byte) (b6 | 88), b5, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iRed, iResolveOpacity, 2012931276, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        e(new char[]{0, 0, 0, 0}, new char[]{64569, 61665, 60604, 13379}, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, new char[]{61836, 19757, 64547, 37142, 61967, 11317, 34023, 50126, 8293, 65244, 35501, 58694, 58014, 2245, 26455, 17944, 3430, 6713, 17996, 18588, 426, 54671}, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        e(new char[]{0, 0, 0, 0}, new char[]{30356, 56149, 65233, 46907}, (char) (15358 - KeyEvent.normalizeMetaState(0)), Color.alpha(0) - 774154890, new char[]{5673, 14632, 10830, 5766, 10950, 41391, 24493, 39331, 35557, 61336, 31673, 53830, 17195, 8512, 62254}, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                            int trimmedLength = 876 - TextUtils.getTrimmedLength("");
                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10;
                            byte b7 = $$a[7];
                            byte b8 = b7;
                            Object[] objArr18 = new Object[1];
                            c(b8, (byte) (b8 | 36), b7, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionGroup, trimmedLength, scrollDefaultDelay, 2012020043, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cArgb = (char) Color.argb(0, 0, 0, 0);
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 876;
                            int i19 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9;
                            byte[] bArr3 = $$a;
                            Object[] objArr19 = new Object[1];
                            c(bArr3[7], bArr3[28], bArr3[0], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cArgb, maxKeyCode, i19, -1650998592, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i20 = ((int[]) objArr[2])[0];
        int i21 = ((int[]) objArr[0])[0];
        if (i21 != i20) {
            throw new RuntimeException(String.valueOf(i21));
        }
        int i22 = RemoteActionCompatParcelizer + 15;
        INotificationSideChannelDefault = i22 % 128;
        int i23 = i22 % 2;
        int i24 = ((int[]) objArr[1])[0];
        Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i25 = ~iIdentityHashCode;
        int i26 = i24 + (-1539426252) + (((~((-236916866) | i25)) | 277227094) * (-328)) + ((iIdentityHashCode | 277227094) * 164) + (((~(iIdentityHashCode | 236916865)) | 276833878 | (~(i25 | (-236523650)))) * 164);
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        ((int[]) objArr20[1])[0] = i28 ^ (i28 << 5);
        long jTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
        LinearGradient linearGradient = this.asBinder.get(jTuitionPaymentFragmentbindingInflater1);
        if (linearGradient != null) {
            int i29 = RemoteActionCompatParcelizer + 41;
            INotificationSideChannelDefault = i29 % 128;
            if (i29 % 2 == 0) {
                return linearGradient;
            }
            throw null;
        }
        PointF pointFAsInterface = this.onTransact.asInterface();
        PointF pointFAsInterface2 = this.asInterface.asInterface();
        getAudioAttributes getaudioattributesAsInterface = this.b.asInterface();
        LinearGradient linearGradient2 = new LinearGradient(pointFAsInterface.x, pointFAsInterface.y, pointFAsInterface2.x, pointFAsInterface2.y, TuitionPaymentFragmentspecialinlinedviewModeldefault2(getaudioattributesAsInterface.b), getaudioattributesAsInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1, Shader.TileMode.CLAMP);
        this.asBinder.put(jTuitionPaymentFragmentbindingInflater1, linearGradient2);
        return linearGradient2;
    }

    private int TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 29;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        int iRound = Math.round(this.onTransact.b() * this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        int iRound2 = Math.round(this.asInterface.b() * this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        int iRound3 = Math.round(this.b.b() * this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        int i4 = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            int i5 = INotificationSideChannelDefault + 49;
            RemoteActionCompatParcelizer = i5 % 128;
            i4 = i5 % 2 == 0 ? (i4 + 45) >> iRound2 : i4 * 31 * iRound2;
        }
        if (iRound3 == 0) {
            return i4;
        }
        int i6 = INotificationSideChannelDefault + 25;
        RemoteActionCompatParcelizer = i6 % 128;
        return i6 % 2 == 0 ? (i4 << 95) / iRound3 : i4 * 31 * iRound3;
    }

    private int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(int[] iArr) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        processPendingCallbacksLocked processpendingcallbackslocked = this.f150a;
        if (processpendingcallbackslocked != null) {
            Integer[] numArr = (Integer[]) processpendingcallbackslocked.asInterface();
            int i4 = 0;
            if (iArr.length == numArr.length) {
                while (i4 < iArr.length) {
                    iArr[i4] = numArr[i4].intValue();
                    i4++;
                }
            } else {
                iArr = new int[numArr.length];
                int i5 = RemoteActionCompatParcelizer + 91;
                INotificationSideChannelDefault = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 3 / 3;
                }
                while (i4 < numArr.length) {
                    int i7 = INotificationSideChannelDefault + 35;
                    RemoteActionCompatParcelizer = i7 % 128;
                    int i8 = i7 % 2;
                    iArr[i4] = numArr[i4].intValue();
                    i4++;
                }
            }
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.setShuffleModeEnabledRemoved, defpackage.getAudioStream
    public final <T> void b(T t, MediaSessionCompatCallbackCallbackHandler<T> mediaSessionCompatCallbackCallbackHandler) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 27;
        INotificationSideChannelDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.b(t, mediaSessionCompatCallbackCallbackHandler);
            Integer[] numArr = registerCallbackListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            obj.hashCode();
            throw null;
        }
        super.b(t, mediaSessionCompatCallbackCallbackHandler);
        if (t == registerCallbackListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            if (this.f150a != null) {
                int i3 = RemoteActionCompatParcelizer + 69;
                INotificationSideChannelDefault = i3 % 128;
                int i4 = i3 % 2;
                fromMediaSession frommediasession = this.TuitionPaymentFragmentbindingInflater1;
                frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(this.f150a);
            }
            if (mediaSessionCompatCallbackCallbackHandler == null) {
                this.f150a = null;
                return;
            }
            processPendingCallbacksLocked processpendingcallbackslocked = new processPendingCallbacksLocked(mediaSessionCompatCallbackCallbackHandler);
            this.f150a = processpendingcallbackslocked;
            processpendingcallbackslocked.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
            fromMediaSession frommediasession2 = this.TuitionPaymentFragmentbindingInflater1;
            processPendingCallbacksLocked processpendingcallbackslocked2 = this.f150a;
            if (processpendingcallbackslocked2 != null) {
                frommediasession2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(processpendingcallbackslocked2);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IMediaSessionStubProxy(prepare prepareVar, fromMediaSession frommediasession, MediaControllerCompatApi21PlaybackInfo mediaControllerCompatApi21PlaybackInfo) {
        Paint.Cap cap;
        int i = ShapeStroke.AnonymousClass4.TuitionPaymentFragmentspecialinlinedviewModeldefault1[mediaControllerCompatApi21PlaybackInfo.b.ordinal()];
        if (i != 1) {
            int i2 = RemoteActionCompatParcelizer + 93;
            INotificationSideChannelDefault = i2 % 128;
            cap = (i2 % 2 == 0 ? i == 2 : i == 4) ? Paint.Cap.ROUND : Paint.Cap.SQUARE;
        } else {
            cap = Paint.Cap.BUTT;
            int i3 = INotificationSideChannelDefault + 33;
            RemoteActionCompatParcelizer = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
        }
        super(prepareVar, frommediasession, cap, mediaControllerCompatApi21PlaybackInfo.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), mediaControllerCompatApi21PlaybackInfo.g, mediaControllerCompatApi21PlaybackInfo.onTransact, mediaControllerCompatApi21PlaybackInfo.cancelAll, mediaControllerCompatApi21PlaybackInfo.d, mediaControllerCompatApi21PlaybackInfo.TuitionPaymentFragmentbindingInflater1);
        this.asBinder = new LongSparseArray<>();
        this.cancelAll = new LongSparseArray<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new RectF();
        this.d = mediaControllerCompatApi21PlaybackInfo.f174a;
        this.notify = mediaControllerCompatApi21PlaybackInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.g = mediaControllerCompatApi21PlaybackInfo.asBinder;
        previous previousVar = prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (int) (((long) (((previousVar.TuitionPaymentFragmentbindingInflater1 - previousVar.onTransact) / previousVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3) * 1000.0f)) / 32.0f);
        binderDied<getAudioAttributes, getAudioAttributes> binderdiedTuitionPaymentFragmentbindingInflater1 = mediaControllerCompatApi21PlaybackInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
        this.b = binderdiedTuitionPaymentFragmentbindingInflater1;
        binderdiedTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater1);
        binderDied<PointF, PointF> binderdiedTuitionPaymentFragmentbindingInflater2 = mediaControllerCompatApi21PlaybackInfo.notify.TuitionPaymentFragmentbindingInflater1();
        this.onTransact = binderdiedTuitionPaymentFragmentbindingInflater2;
        binderdiedTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater2);
        binderDied<PointF, PointF> binderdiedTuitionPaymentFragmentbindingInflater3 = mediaControllerCompatApi21PlaybackInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
        this.asInterface = binderdiedTuitionPaymentFragmentbindingInflater3;
        binderdiedTuitionPaymentFragmentbindingInflater3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater3);
    }

    private static String $$g(int i, int i2, short s) {
        int i3 = 3 - (i2 * 4);
        byte[] bArr = $$c;
        int i4 = s * 3;
        int i5 = i + 102;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5 = i4 + (-i3);
            i3 = i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i3 + 1;
            int i8 = i6 + 1;
            bArr2[i8] = (byte) i5;
            if (i8 == i4) {
                return new String(bArr2, 0);
            }
            i5 += -bArr[i7];
            i3 = i7;
            i6 = i8;
        }
    }
}
