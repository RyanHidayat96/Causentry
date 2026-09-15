package defpackage;

import android.animation.Animator;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public final class setSource extends AudioSpecBuilder<ValueAnimator> {
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private awaitInstance asInterface;
    private static final byte[] $$c = {ByteCompanionObject.MAX_VALUE, 43, -39, -37};
    private static final int $$f = 236;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {83, -44, 103, 46, 15, 1, -60, 55, 17, -3, 12, 4, -6, 13, -68, 69, 5, -10, 17, -11, 12, 9, -16, 22, -8, 9, 2, -61, 69, 5, 0, 1, 5, -62, 25, 36, 18, -16, 11, 6, -25, 37, 0, 1, 5, -43, 37, 20, -8, 16, -10, 14, 8, -82, 82, 0, -8, 1, 9, -5, 14, -69, 3, 72, 8, 1, 0, 8, -6, 2, -61, 72, 8, -1, -2, 1, 20, -77, 67, 4, 4, -2, 23, -6, 11, -77, 16, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, -15, 10, 8, -7, 8, 8, -4, -27, 40, -5, 9, -8, 22, -12, 16, -62};
    private static final int $$e = 175;
    private static final byte[] $$a = {46, 47, -18, 64, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 15;
    private static int cancelAll = 0;
    private static int notify = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f1388a = {47283, 47270, 47280, 47266, 47269, 47275, 47206, 47265, 47233, 47323, 47264, 47279, 47271, 47249, 47272, 47281, 47273, 47268, 47234, 47274, 47326, 47277, 47244, 47276};
    private static int asBinder = 2047719508;
    private static boolean g = true;
    private static boolean d = true;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 84
            byte[] r0 = defpackage.setSource.$$a
            int r8 = r8 * 52
            int r8 = r8 + 4
            int r6 = r6 * 15
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2e:
            int r8 = r8 + r7
            int r7 = r8 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setSource.c(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = defpackage.setSource.$$d
            int r6 = r6 * 15
            int r6 = 99 - r6
            int r7 = r7 * 46
            int r1 = 84 - r7
            int r5 = r5 * 83
            int r5 = 87 - r5
            byte[] r1 = new byte[r1]
            int r7 = 83 - r7
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r6
            r6 = r7
            r3 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r5]
        L2b:
            int r6 = r6 + r4
            int r5 = r5 + 1
            int r6 = r6 + (-3)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setSource.f(short, short, byte, java.lang.Object[]):void");
    }

    static /* synthetic */ void b(setSource setsource, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = notify + 31;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        setsource.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
        Object obj = null;
        if (setsource.TuitionPaymentFragmentbindingInflater1 != null) {
            int i4 = cancelAll + 65;
            notify = i4 % 128;
            if (i4 % 2 == 0) {
                setsource.TuitionPaymentFragmentbindingInflater1.b(setsource.asInterface);
                obj.hashCode();
                throw null;
            }
            setsource.TuitionPaymentFragmentbindingInflater1.b(setsource.asInterface);
        }
        int i5 = notify + 17;
        cancelAll = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // defpackage.AudioSpecBuilder
    public final /* synthetic */ Animator TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: setSource.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                setSource.b(setSource.this, valueAnimator2);
            }
        });
        int i2 = notify + 1;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        return valueAnimator;
    }

    @Override // defpackage.AudioSpecBuilder
    public final /* synthetic */ AudioSpecBuilder b(float f) throws Throwable {
        int i = 2 % 2;
        int i2 = notify + 99;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        setSource setsourceTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(f);
        int i4 = cancelAll + 125;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return setsourceTuitionPaymentFragmentbindingInflater1;
    }

    public setSource(getInstancelambda0.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        super(tuitionPaymentFragmentbindingInflater1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1;
        this.asInterface = new awaitInstance();
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int length;
        char[] cArr3;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr4 = f1388a;
        char c = '0';
        int i3 = 0;
        if (cArr4 != null) {
            int i4 = $10 + 21;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr4.length;
                cArr3 = new char[length];
            } else {
                length = cArr4.length;
                cArr3 = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr4[i5]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 1;
                        byte b2 = (byte) (-b);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", c, i3, i3) + 31340), View.MeasureSpec.getSize(i3) + 2994, 17 - Color.argb(i3, i3, i3, i3), 1182129903, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
                    c = '0';
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = $11 + 41;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr4 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(asBinder)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43325), 254 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i8 = 33601;
        int i9 = 1687675375;
        if (!(!d)) {
            int i10 = $11 + 35;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            } else {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            }
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33601 - TextUtils.lastIndexOf("", '0')), (Process.myPid() >> 22) + 3085, KeyEvent.getDeadChar(0, 0) + 26, -2146875848, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i11 = $11 + 93;
                $10 = i11 % 128;
                int i12 = i11 % 2;
            }
            objArr[0] = new String(cArr2);
            return;
        }
        if (g) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i9);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (i8 - MotionEvent.axisFromString("")), (ViewConfiguration.getWindowTouchSlop() >> 8) + 3085, 26 - View.MeasureSpec.makeMeasureSpec(0, 0), -2146875848, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                i8 = 33601;
                i9 = 1687675375;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i13 = 0;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13;
            if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                objArr[0] = new String(cArr6);
                return;
            } else {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                i13 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            }
        }
    }

    private setSource TuitionPaymentFragmentbindingInflater1(float f) throws Throwable {
        char c;
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 43042);
            int iMyTid = (Process.myTid() >> 22) + 3111;
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 22;
            byte b = $$a[7];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            c(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, iMyTid, iIndexOf, -1272852037, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(null, null, View.MeasureSpec.getSize(0) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(null, null, View.resolveSize(0, 0) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 43042);
            int i2 = 3110 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int mode = 22 - View.MeasureSpec.getMode(0);
            byte[] bArr = $$a;
            byte b3 = bArr[7];
            Object[] objArr5 = new Object[1];
            c(b3, b3, bArr[132], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay, i2, mode, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 43042);
                int i3 = 3111 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iIndexOf2 = TextUtils.indexOf("", "") + 22;
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c(bArr2[132], bArr2[7], bArr2[37], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(doubleTapTimeout, i3, iIndexOf2, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr7[2])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i4};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ((507720596 + (((~((-673454217) | (~iIdentityHashCode))) | (-1031577243)) * (-591))) + ((iIdentityHashCode | (-673454217)) * 591)) - 230207029;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
            objArr = new Object[]{new int[1], new int[]{i5}, iArr, strArr};
            c = 2;
        } else {
            Object[] objArr8 = new Object[1];
            e(null, null, KeyEvent.keyCodeFromString("") + 127, new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(null, null, 128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, -230207029};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[5];
                byte b5 = bArr3[30];
                Object[] objArr11 = new Object[1];
                f(b4, b5, b5, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b6 = bArr3[30];
                byte b7 = bArr3[5];
                Object[] objArr12 = new Object[1];
                f(b6, b7, b7, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cNormalizeMetaState = (char) (43042 - KeyEvent.normalizeMetaState(0));
                    int iCombineMeasuredStates = 3111 - View.combineMeasuredStates(0, 0);
                    int iLastIndexOf = 21 - TextUtils.lastIndexOf("", '0');
                    byte[] bArr4 = $$a;
                    Object[] objArr14 = new Object[1];
                    c(bArr4[132], bArr4[7], bArr4[37], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState, iCombineMeasuredStates, iLastIndexOf, 154975793, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    e(null, null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(null, null, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 43042);
                        int i9 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3111;
                        int iIndexOf3 = 21 - TextUtils.indexOf((CharSequence) "", '0');
                        byte[] bArr5 = $$a;
                        byte b8 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        c(b8, b8, bArr5[132], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetAfter, i9, iIndexOf3, -1269618118, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 43042);
                        int tapTimeout = 3111 - (ViewConfiguration.getTapTimeout() >> 16);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22;
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr18 = new Object[1];
                        c(b9, b10, b10, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(longPressTimeout, tapTimeout, maximumDrawingCacheSize, -1272852037, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i10 = notify + 81;
                    cancelAll = i10 % 128;
                    c = 2;
                    if (i10 % 2 != 0) {
                        int i11 = 2 / 3;
                    }
                    objArr = objArr13;
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[c])[0];
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                int i14 = cancelAll + 53;
                notify = i14 % 128;
                int i15 = i14 % 2;
                for (String str : strArr2) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        Object[] objArr19 = new Object[4];
        objArr19[0] = new int[1];
        objArr19[1] = new int[]{i};
        objArr19[c] = new int[]{i};
        int i16 = ((int[]) objArr[0])[0];
        int i17 = ((int[]) objArr[c])[0];
        int i18 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i19 = i16 + (-685658894) + (((~(iIdentityHashCode2 | 278861682)) | (-1426169777)) * (-668)) + ((278861682 | (~((-1426169777) | iIdentityHashCode2))) * 1336) + ((iIdentityHashCode2 | (-1157662849)) * 668);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr19[0])[0] = i21 ^ (i21 << 5);
        objArr19[3] = strArr3;
        int i22 = cancelAll + 101;
        notify = i22 % 128;
        int i23 = i22 % 2;
        if (this.b != null) {
            long j2 = (long) (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * f);
            if (((ValueAnimator) this.b).getValues() != null && ((ValueAnimator) this.b).getValues().length > 0) {
                int i24 = notify + 61;
                cancelAll = i24 % 128;
                if (i24 % 2 != 0) {
                    ((ValueAnimator) this.b).setCurrentPlayTime(j2);
                    obj.hashCode();
                    throw null;
                }
                ((ValueAnimator) this.b).setCurrentPlayTime(j2);
            }
        }
        return this;
    }

    public final setSource TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2) {
        int i3;
        int i4 = 2 % 2;
        if (this.b != null) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != i) {
                i3 = cancelAll + 77;
                notify = i3 % 128;
            } else if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != i2) {
                i3 = notify + 99;
                cancelAll = i3 % 128;
            }
            int i5 = i3 % 2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2;
            PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", i, i2);
            propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
            ((ValueAnimator) this.b).setValues(propertyValuesHolderOfInt);
            int i6 = notify + 9;
            cancelAll = i6 % 128;
            int i7 = i6 % 2;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r7, byte r8, int r9) {
        /*
            int r7 = r7 + 67
            int r9 = r9 * 4
            int r9 = 1 - r9
            int r8 = r8 + 4
            byte[] r0 = defpackage.setSource.$$c
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r5 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r9) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L27:
            int r7 = r7 + r8
            r8 = r3
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setSource.$$g(int, byte, int):java.lang.String");
    }
}
