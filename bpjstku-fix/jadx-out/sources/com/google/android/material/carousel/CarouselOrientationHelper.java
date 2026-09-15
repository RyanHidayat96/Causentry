package com.google.android.material.carousel;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
abstract class CarouselOrientationHelper {
    final int orientation;

    abstract void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3);

    abstract int getDecoratedCrossAxisMeasurement(View view);

    abstract float getMaskMargins(RecyclerView.LayoutParams layoutParams);

    abstract RectF getMaskRect(float f, float f2, float f3, float f4);

    abstract int getParentBottom();

    abstract int getParentEnd();

    abstract int getParentLeft();

    abstract int getParentRight();

    abstract int getParentStart();

    abstract int getParentTop();

    abstract void layoutDecoratedWithMargins(View view, int i, int i2);

    abstract void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3);

    abstract void offsetChild(View view, Rect rect, float f, float f2);

    private CarouselOrientationHelper(int i) {
        this.orientation = i;
    }

    static CarouselOrientationHelper createOrientationHelper(CarouselLayoutManager carouselLayoutManager, int i) {
        if (i == 0) {
            return createHorizontalHelper(carouselLayoutManager);
        }
        if (i == 1) {
            return createVerticalHelper(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    private static CarouselOrientationHelper createVerticalHelper(final CarouselLayoutManager carouselLayoutManager) {
        return new CarouselOrientationHelper(1) { // from class: com.google.android.material.carousel.CarouselOrientationHelper.1
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {81, -102, -70, -91, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 59, -6, -10, 13, -20, 14, -12, -7, 11, -72, 63, -7, -14, -1, -1, 11, -72, 48, 12, -10, -62, 60, -1, -14, -2, 4, -65, 73, -3, -26, 12};
            private static final int $$e = 241;
            private static final byte[] $$a = {91, -9, 99, 11, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
            private static final int $$b = 225;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
            private static long TuitionPaymentFragmentbindingInflater1 = -3672561852818458767L;

            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r5, int r6, byte r7, java.lang.Object[] r8) {
                /*
                    int r7 = r7 * 14
                    int r7 = 98 - r7
                    int r0 = 53 - r6
                    int r5 = r5 * 52
                    int r5 = 55 - r5
                    byte[] r1 = com.google.android.material.carousel.CarouselOrientationHelper.AnonymousClass1.$$a
                    byte[] r0 = new byte[r0]
                    int r6 = 52 - r6
                    r2 = 0
                    if (r1 != 0) goto L16
                    r3 = r6
                    r4 = r2
                    goto L2a
                L16:
                    r3 = r2
                L17:
                    int r5 = r5 + 1
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L28
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    r8[r2] = r5
                    return
                L28:
                    r3 = r1[r5]
                L2a:
                    int r3 = -r3
                    int r7 = r7 + r3
                    int r7 = r7 + (-10)
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselOrientationHelper.AnonymousClass1.a(int, int, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(short r6, short r7, short r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = com.google.android.material.carousel.CarouselOrientationHelper.AnonymousClass1.$$d
                    int r7 = r7 * 49
                    int r7 = r7 + 4
                    int r6 = r6 * 49
                    int r1 = r6 + 1
                    int r8 = 99 - r8
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r6
                    r8 = r7
                    r4 = r2
                    goto L2c
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    if (r3 != r6) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L23:
                    int r3 = r3 + 1
                    r4 = r0[r7]
                    r5 = r8
                    r8 = r7
                    r7 = r4
                    r4 = r3
                    r3 = r5
                L2c:
                    int r3 = r3 + r7
                    int r7 = r3 + 3
                    int r8 = r8 + 1
                    r3 = r4
                    r5 = r8
                    r8 = r7
                    r7 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselOrientationHelper.AnonymousClass1.d(short, short, short, java.lang.Object[]):void");
            }

            private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i3 = $10 + 37;
                    $11 = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = getrealtimecapturelatency.b;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - TextUtils.getTrimmedLength("")), (KeyEvent.getMaxKeyCode() >> 16) + 2624, (ViewConfiguration.getScrollBarSize() >> 8) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                            }
                            jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 % 9053247990562531611L);
                            Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 39421), Color.argb(0, 0, 0, 0) + 481, 36 - MotionEvent.axisFromString(""), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        int i5 = getrealtimecapturelatency.b;
                        Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19473 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2624, 13 - View.MeasureSpec.getMode(0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                        Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 39421), 480 - ExpandableListView.getPackedPositionChild(0L), TextUtils.indexOf("", "", 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                }
                char[] cArr2 = new char[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i6 = $10 + 47;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                        Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39422 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 480, View.MeasureSpec.getSize(0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                        int i7 = 6 / 0;
                    } else {
                        cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                        Object[] objArr7 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 39421), 481 - Gravity.getAbsoluteGravity(0, 0), 37 - Color.argb(0, 0, 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                    }
                }
                objArr[0] = new String(cArr2);
                int i8 = $11 + 99;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentLeft() {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                if (i2 % 2 != 0) {
                    carouselLayoutManager.getPaddingLeft();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int paddingLeft = carouselLayoutManager.getPaddingLeft();
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                int i4 = i3 % 2;
                return paddingLeft;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentStart() {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                int i3 = i2 % 2;
                int parentTop = getParentTop();
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                int i5 = i4 % 2;
                return parentTop;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentRight() {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                int width = i2 % 2 == 0 ? carouselLayoutManager.getWidth() + carouselLayoutManager.getPaddingRight() : carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                int i4 = i3 % 2;
                return width;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentEnd() {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                if (i2 % 2 == 0) {
                    getParentBottom();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int parentBottom = getParentBottom();
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 40 / 0;
                }
                return parentBottom;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentBottom() {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                int i3 = i2 % 2;
                int height = carouselLayoutManager.getHeight();
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                if (i4 % 2 != 0) {
                    return height;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getDecoratedCrossAxisMeasurement(View view) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                int decoratedMeasuredWidth = carouselLayoutManager.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                if (i4 % 2 != 0) {
                    return decoratedMeasuredWidth;
                }
                throw null;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void layoutDecoratedWithMargins(View view, int i, int i2) throws Throwable {
                Object[] objArr;
                int i3 = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 31533);
                    int iGreen = 921 - Color.green(0);
                    int iRgb = Color.rgb(0, 0, 0) + 16777244;
                    byte[] bArr = $$a;
                    Object[] objArr2 = new Object[1];
                    a(bArr[7], (byte) 52, bArr[80], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString, iGreen, iRgb, -1048449946, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{24075, 60239, 13464, 16889, 35625, 54388, 25036, 43849, 62557, 442, 19114, 37888, 8599, 27350, 46084, 49514, 2743, 22482, 57664, 10900, 30677, 33062}, 46411 - Color.blue(0), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{24079, 23433, 21781, 20151, 18469, 17860, 32596, 30929, 29303, 27660, 27024, 25403, 7351, 5700, 5085}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1423, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char longPressTimeout = (char) (31533 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    int jumpTapTimeout = 921 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int keyRepeatDelay = 28 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    byte[] bArr2 = $$a;
                    byte b = bArr2[7];
                    Object[] objArr5 = new Object[1];
                    a(b, bArr2[80], b, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(longPressTimeout, jumpTapTimeout, keyRepeatDelay, -778300370, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31533);
                        int iAlpha = 921 - Color.alpha(0);
                        int iResolveSize = 28 - View.resolveSize(0, 0);
                        byte[] bArr3 = $$a;
                        Object[] objArr6 = new Object[1];
                        a(bArr3[80], (byte) (-bArr3[33]), bArr3[7], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarFadeDuration, iAlpha, iResolveSize, -1142834547, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                    int i4 = ~((~new Random().nextInt()) | 1149395868);
                    int i5 = ((((1082130688 | i4) * (-970)) - 1648855677) + ((i4 | 67265180) * 970)) - 1006650144;
                    int i6 = (i5 << 13) ^ i5;
                    int i7 = i6 ^ (i6 >>> 17);
                    ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
                    int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 3 % 5;
                    }
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{24075, 9025, 42116, 10711, 43793, 11354, 45456, 12967, 46115, 14711, 47784, 16307, 33047, 648, 34776, 2312, 35404, 3990, 37060, 4620, 38746, 6315, 40438, 7996, 57459, 26035}, 32069 - (ViewConfiguration.getTapTimeout() >> 16), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{24073, 3084, 64062, 43041, 5699, 50267, 45676, 24750, 52866, 48305, 27320, 55506, 34541, 29948, 8980, 37150, 32565, 11591}, 21011 - TextUtils.getTrimmedLength(""), objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                    }
                    try {
                        Object[] objArr10 = {applicationContext, Integer.valueOf(i), 0, -1006650144};
                        byte[] bArr4 = $$d;
                        byte b2 = (byte) (-bArr4[35]);
                        byte b3 = (byte) (b2 - 1);
                        Object[] objArr11 = new Object[1];
                        d(b2, b3, b3, objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        byte b4 = bArr4[35];
                        byte b5 = (byte) (b4 + 1);
                        byte b6 = (byte) (-b4);
                        Object[] objArr12 = new Object[1];
                        d(b5, b6, b6, objArr12);
                        Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 31533);
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 921;
                            int i10 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29;
                            byte[] bArr5 = $$a;
                            Object[] objArr14 = new Object[1];
                            a(bArr5[80], (byte) (-bArr5[33]), bArr5[7], objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(deadChar, absoluteGravity, i10, -1142834547, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                        try {
                            Object[] objArr15 = new Object[1];
                            c(new char[]{24075, 60239, 13464, 16889, 35625, 54388, 25036, 43849, 62557, 442, 19114, 37888, 8599, 27350, 46084, 49514, 2743, 22482, 57664, 10900, 30677, 33062}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 46411, objArr15);
                            Class<?> cls4 = Class.forName((String) objArr15[0]);
                            Object[] objArr16 = new Object[1];
                            c(new char[]{24079, 23433, 21781, 20151, 18469, 17860, 32596, 30929, 29303, 27660, 27024, 25403, 7351, 5700, 5085}, 1422 - TextUtils.indexOf((CharSequence) "", '0'), objArr16);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cResolveSize = (char) (31533 - View.resolveSize(0, 0));
                                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 921;
                                int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 28;
                                byte[] bArr6 = $$a;
                                byte b7 = bArr6[7];
                                Object[] objArr17 = new Object[1];
                                a(b7, bArr6[80], b7, objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSize, edgeSlop, longPressTimeout2, -778300370, false, (String) objArr17[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0));
                                int gidForName = 920 - Process.getGidForName("");
                                int i11 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 28;
                                byte[] bArr7 = $$a;
                                Object[] objArr18 = new Object[1];
                                a(bArr7[7], (byte) 52, bArr7[80], objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, gidForName, i11, -1048449946, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            objArr = objArr13;
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i12 = ((int[]) objArr[1])[0];
                int i13 = ((int[]) objArr[3])[0];
                if (i13 == i12) {
                    int i14 = ((int[]) objArr[0])[0];
                    Object[] objArr19 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i15 = 1280224160 + (((~((~iMaxMemory) | (-1043806263))) | 338700306) * (-245));
                    int i16 = ~(iMaxMemory | (-1043806263));
                    int i17 = i14 + i15 + (i16 * (-245)) + ((i16 | 730273381) * 245);
                    int i18 = (i17 << 13) ^ i17;
                    int i19 = i18 ^ (i18 >>> 17);
                    ((int[]) objArr19[0])[0] = i19 ^ (i19 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr != null) {
                        int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
                        int i21 = i20 % 2;
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    int[] iArr = new int[i13];
                    int i22 = i13 - 1;
                    iArr[i22] = 1;
                    Toast.makeText((Context) null, iArr[((i13 * i22) % 2) - 1], 1).show();
                    int i23 = ((int[]) objArr[0])[0];
                    int i24 = ((int[]) objArr[3])[0];
                    int i25 = ((int[]) objArr[1])[0];
                    new int[1][0] = i24;
                    new int[1][0] = i25;
                    int i26 = i23 + (-2000704469) + (((~((-306652833) | (~i))) | (~(1467426811 | i))) * (-272)) + (((~((-374810611) | i)) | 68157778) * (-272)) + (((~(374810610 | i)) | 1399269033) * 272);
                    int i27 = (i26 << 13) ^ i26;
                    int i28 = i27 ^ (i27 >>> 17);
                    int[] iArr2 = {i28 ^ (i28 << 5)};
                }
                int parentLeft = getParentLeft();
                carouselLayoutManager.layoutDecoratedWithMargins(view, parentLeft, i, parentLeft + getDecoratedCrossAxisMeasurement(view), i2);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public float getMaskMargins(RecyclerView.LayoutParams layoutParams) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                float f = (i2 % 2 != 0 ? ((ViewGroup.MarginLayoutParams) layoutParams).topMargin : ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                int i4 = i3 % 2;
                return f;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public RectF getMaskRect(float f, float f2, float f3, float f4) {
                int i = 2 % 2;
                RectF rectF = new RectF(0.0f, f3, f2, f - f3);
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                int i3 = i2 % 2;
                return rectF;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0034  */
            /* JADX WARN: Code duplicated, block: B:9:0x0023  */
            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 65 / 0;
                    if (rectF2.top < rectF3.top) {
                        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                        int i5 = i4 % 2;
                        if (rectF2.bottom > rectF3.top) {
                            float f = rectF3.top - rectF2.top;
                            rectF.top += f;
                            rectF3.top += f;
                        }
                    }
                } else if (rectF2.top < rectF3.top) {
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                    int i7 = i6 % 2;
                    if (rectF2.bottom > rectF3.top) {
                        float f2 = rectF3.top - rectF2.top;
                        rectF.top += f2;
                        rectF3.top += f2;
                    }
                }
                if (rectF2.bottom <= rectF3.bottom || rectF2.top >= rectF3.bottom) {
                    return;
                }
                float f3 = rectF2.bottom - rectF3.bottom;
                rectF.bottom = Math.max(rectF.bottom - f3, rectF.top);
                rectF2.bottom = Math.max(rectF2.bottom - f3, rectF2.top);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                if (i2 % 2 == 0) {
                    float f = rectF2.bottom;
                    float f2 = rectF3.top;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (rectF2.bottom <= rectF3.top) {
                    rectF.bottom = ((float) Math.floor(rectF.bottom)) - 1.0f;
                    rectF.top = Math.min(rectF.top, rectF.bottom);
                }
                if (rectF2.top >= rectF3.bottom) {
                    rectF.top = ((float) Math.ceil(rectF.top)) + 1.0f;
                    rectF.bottom = Math.max(rectF.top, rectF.bottom);
                    int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                    int i4 = i3 % 2;
                }
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void offsetChild(View view, Rect rect, float f, float f2) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                int i3 = i2 % 2;
                view.offsetTopAndBottom((int) (f2 - (rect.top + f)));
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentTop() {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
                int i3 = i2 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 55;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 33 / 0;
                }
                return 0;
            }
        };
    }

    private static CarouselOrientationHelper createHorizontalHelper(final CarouselLayoutManager carouselLayoutManager) {
        return new CarouselOrientationHelper(0) { // from class: com.google.android.material.carousel.CarouselOrientationHelper.2
            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentLeft() {
                return 0;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentStart() {
                return carouselLayoutManager.isLayoutRtl() ? getParentRight() : getParentLeft();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentRight() {
                return carouselLayoutManager.getWidth();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentEnd() {
                return carouselLayoutManager.isLayoutRtl() ? getParentLeft() : getParentRight();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentTop() {
                return carouselLayoutManager.getPaddingTop();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentBottom() {
                return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getDecoratedCrossAxisMeasurement(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return carouselLayoutManager.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void layoutDecoratedWithMargins(View view, int i, int i2) {
                int parentTop = getParentTop();
                carouselLayoutManager.layoutDecoratedWithMargins(view, i, parentTop, i2, parentTop + getDecoratedCrossAxisMeasurement(view));
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public float getMaskMargins(RecyclerView.LayoutParams layoutParams) {
                return ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public RectF getMaskRect(float f, float f2, float f3, float f4) {
                return new RectF(f4, 0.0f, f2 - f4, f);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                if (rectF2.left < rectF3.left && rectF2.right > rectF3.left) {
                    float f = rectF3.left - rectF2.left;
                    rectF.left += f;
                    rectF2.left += f;
                }
                if (rectF2.right <= rectF3.right || rectF2.left >= rectF3.right) {
                    return;
                }
                float f2 = rectF2.right - rectF3.right;
                rectF.right = Math.max(rectF.right - f2, rectF.left);
                rectF2.right = Math.max(rectF2.right - f2, rectF2.left);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                if (rectF2.right <= rectF3.left) {
                    rectF.right = ((float) Math.floor(rectF.right)) - 1.0f;
                    rectF.left = Math.min(rectF.left, rectF.right);
                }
                if (rectF2.left >= rectF3.right) {
                    rectF.left = ((float) Math.ceil(rectF.left)) + 1.0f;
                    rectF.right = Math.max(rectF.left, rectF.right);
                }
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void offsetChild(View view, Rect rect, float f, float f2) {
                view.offsetLeftAndRight((int) (f2 - (rect.left + f)));
            }
        };
    }
}
