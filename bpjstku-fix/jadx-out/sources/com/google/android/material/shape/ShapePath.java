package com.google.android.material.shape;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
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
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.shadow.ShadowRenderer;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class ShapePath {
    protected static final float ANGLE_LEFT = 180.0f;
    private static final float ANGLE_UP = 270.0f;
    private boolean containsIncompatibleShadowOp;

    @Deprecated
    public float currentShadowAngle;

    @Deprecated
    public float endShadowAngle;

    @Deprecated
    public float endX;

    @Deprecated
    public float endY;
    private final List<PathOperation> operations = new ArrayList();
    private final List<ShadowCompatOperation> shadowCompatOperations = new ArrayList();

    @Deprecated
    public float startX;

    @Deprecated
    public float startY;

    public static abstract class PathOperation {
        protected final Matrix matrix = new Matrix();

        public abstract void applyToPath(Matrix matrix, Path path);
    }

    public ShapePath() {
        reset(0.0f, 0.0f);
    }

    public ShapePath(float f, float f2) {
        reset(f, f2);
    }

    public void reset(float f, float f2) {
        reset(f, f2, 270.0f, 0.0f);
    }

    public void reset(float f, float f2, float f3, float f4) {
        setStartX(f);
        setStartY(f2);
        setEndX(f);
        setEndY(f2);
        setCurrentShadowAngle(f3);
        setEndShadowAngle((f3 + f4) % 360.0f);
        this.operations.clear();
        this.shadowCompatOperations.clear();
        this.containsIncompatibleShadowOp = false;
    }

    public void lineTo(float f, float f2) {
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.x = f;
        pathLineOperation.y = f2;
        this.operations.add(pathLineOperation);
        LineShadowOperation lineShadowOperation = new LineShadowOperation(pathLineOperation, getEndX(), getEndY());
        addShadowCompatOperation(lineShadowOperation, lineShadowOperation.getAngle() + 270.0f, lineShadowOperation.getAngle() + 270.0f);
        setEndX(f);
        setEndY(f2);
    }

    public void lineTo(float f, float f2, float f3, float f4) {
        if ((Math.abs(f - getEndX()) < 0.001f && Math.abs(f2 - getEndY()) < 0.001f) || (Math.abs(f - f3) < 0.001f && Math.abs(f2 - f4) < 0.001f)) {
            lineTo(f3, f4);
            return;
        }
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.x = f;
        pathLineOperation.y = f2;
        this.operations.add(pathLineOperation);
        PathLineOperation pathLineOperation2 = new PathLineOperation();
        pathLineOperation2.x = f3;
        pathLineOperation2.y = f4;
        this.operations.add(pathLineOperation2);
        InnerCornerShadowOperation innerCornerShadowOperation = new InnerCornerShadowOperation(pathLineOperation, pathLineOperation2, getEndX(), getEndY());
        if (innerCornerShadowOperation.getSweepAngle() > 0.0f) {
            lineTo(f, f2);
            lineTo(f3, f4);
        } else {
            addShadowCompatOperation(innerCornerShadowOperation, innerCornerShadowOperation.getStartAngle() + 270.0f, innerCornerShadowOperation.getEndAngle() + 270.0f);
            setEndX(f3);
            setEndY(f4);
        }
    }

    static class ArcShadowOperation extends ShadowCompatOperation {
        private final PathArcOperation operation;
        private static final byte[] $$c = {31, -3, -46, 11};
        private static final int $$f = 29;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {5, -91, 77, 46, -43, 5, -13, -5, 27, -37, -22, -11, -8, -4, 6, 25, -58, -3, 34, -48, -7, 12, -17, -1, 14, -32, -1, -24, -8, -4, 6, 42, -4, -40, 5, -18, 4, -13, -6, 23, -24, -31, 5, 1, -16, -13, 39, -51, 10, -13, -13, 1, -16, -13, 11, -14, -12, 3, -12, -12, 0, 23, -44, 1, -13, 4, -26, 8, -20, 58};
        private static final int $$e = 206;
        private static final byte[] $$a = {113, 29, -123, -97, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
        private static final int $$b = 5;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int g = 1;
        private static char[] TuitionPaymentFragmentbindingInflater1 = {47418, 47405, 47415, 47401, 47404, 47410, 47341, 47400, 47368, 47394, 47399, 47414, 47406, 47384, 47407, 47416, 47408, 47403, 47369};
        private static int b = 2047719643;
        private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 3
                int r6 = r6 + 97
                int r0 = r7 + 1
                int r8 = r8 + 4
                byte[] r1 = com.google.android.material.shape.ShapePath.ArcShadowOperation.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L13
                r3 = r7
                r6 = r8
                r4 = r2
                goto L2a
            L13:
                r3 = r2
            L14:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L23:
                int r8 = r8 + 1
                r3 = r1[r8]
                r5 = r8
                r8 = r6
                r6 = r5
            L2a:
                int r3 = -r3
                int r8 = r8 + r3
                int r8 = r8 + (-5)
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.shape.ShapePath.ArcShadowOperation.a(int, byte, byte, java.lang.Object[]):void");
        }

        private static void d(int i, int i2, int i3, Object[] objArr) {
            int i4 = (i * 29) + 4;
            int i5 = i2 * 8;
            int i6 = 84 - (i3 * 11);
            byte[] bArr = $$d;
            byte[] bArr2 = new byte[38 - i5];
            int i7 = 37 - i5;
            int i8 = -1;
            if (bArr == null) {
                i4++;
                i6 = (i7 + (-i6)) - 7;
                i8 = -1;
            }
            while (true) {
                int i9 = i8 + 1;
                bArr2[i9] = (byte) i6;
                if (i9 == i7) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i4++;
                i6 = (i6 + (-bArr[i4])) - 7;
                i8 = i9;
            }
        }

        private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
            char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
            char c = '0';
            int i3 = 0;
            if (cArr2 != null) {
                int i4 = $10 + 67;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i3] = Integer.valueOf(cArr2[i6]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cAxisFromString = (char) (31338 - MotionEvent.axisFromString(""));
                            int absoluteGravity = 2994 - Gravity.getAbsoluteGravity(i3, i3);
                            int iIndexOf = TextUtils.indexOf("", c) + 18;
                            byte b2 = (byte) i3;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString, absoluteGravity, iIndexOf, 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i6++;
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
                cArr2 = cArr3;
            }
            try {
                Object[] objArr3 = {Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                long j = 0;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - KeyEvent.normalizeMetaState(0)), 254 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 21 - TextUtils.lastIndexOf("", '0'), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                int i7 = 33602;
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                    char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    int i8 = $11 + 7;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        int i10 = $11 + 119;
                        $10 = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i11 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i12 = getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1;
                            int i13 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            cArr4[i11] = (char) (cArr2[bArr[0] / i] + iIntValue);
                            Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char trimmedLength = (char) (i7 - TextUtils.getTrimmedLength(""));
                                int iRed = Color.red(0) + 3085;
                                int i14 = (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 25;
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, iRed, i14, -2146875848, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        } else {
                            cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                            Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), Color.green(0) + 3085, 26 - (ViewConfiguration.getTapTimeout() >> 16), -2146875848, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        }
                        i7 = 33602;
                        j = 0;
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    int i15 = $10 + 75;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33602 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getScrollBarSize() >> 8) + 3085, 26 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -2146875848, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                int i17 = 0;
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                while (true) {
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17;
                    if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        objArr[0] = new String(cArr6);
                        return;
                    } else {
                        cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        i17 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                    }
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        public ArcShadowOperation(PathArcOperation pathArcOperation) {
            this.operation = pathArcOperation;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) throws Throwable {
            Object[] objArr;
            int i2 = 2 % 2;
            float startAngle = this.operation.getStartAngle();
            float sweepAngle = this.operation.getSweepAngle();
            RectF rectF = new RectF(this.operation.getLeft(), this.operation.getTop(), this.operation.getRight(), this.operation.getBottom());
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                int iRed = Color.red(0) + 876;
                int i3 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9;
                byte[] bArr = $$a;
                byte b2 = bArr[11];
                Object[] objArr2 = new Object[1];
                a(b2, bArr[8], (byte) (b2 - 1), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, iRed, i3, -1199417970, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(null, null, (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(null, null, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 876;
                int iResolveSizeAndState = 10 - View.resolveSizeAndState(0, 0, 0);
                byte b3 = (byte) ($$b - 4);
                byte b4 = $$a[11];
                Object[] objArr5 = new Object[1];
                a(b3, b4, (byte) (b4 | 9), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType2, iNormalizeMetaState, iResolveSizeAndState, 254769921, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
                g = i4 % 128;
                int i5 = i4 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 877;
                    int tapTimeout = 10 - (ViewConfiguration.getTapTimeout() >> 16);
                    byte[] bArr2 = $$a;
                    byte b5 = bArr2[11];
                    byte b6 = bArr2[10];
                    Object[] objArr6 = new Object[1];
                    a(b5, b6, (byte) (b6 + 2), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(modifierMetaStateMask, iLastIndexOf, tapTimeout, 1324201839, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int i6 = ~new Random().nextInt(1991947237);
                int i7 = ((1797220020 + (((~(i6 | 757379314)) | 43584269) * (-160))) + (((~(i6 | 717069085)) | 757379314) * 160)) - 1065755606;
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            } else {
                try {
                    Object[] objArr8 = {Integer.valueOf(i), -1065755606};
                    byte[] bArr3 = $$d;
                    byte b7 = bArr3[60];
                    byte b8 = bArr3[43];
                    Object[] objArr9 = new Object[1];
                    d(b7, b8, b8, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    byte b9 = bArr3[43];
                    byte b10 = bArr3[60];
                    Object[] objArr10 = new Object[1];
                    d(b9, b10, b10, objArr10);
                    objArr = (Object[]) cls2.getMethod((String) objArr10[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 877;
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 11;
                        byte[] bArr4 = $$a;
                        byte b11 = bArr4[11];
                        byte b12 = bArr4[10];
                        Object[] objArr11 = new Object[1];
                        a(b11, b12, (byte) (b12 + 2), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iLastIndexOf2, bitsPerPixel, 1324201839, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr12 = new Object[1];
                        c(null, null, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        c(null, null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr13);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            int i10 = 876 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 10;
                            byte b13 = (byte) ($$b - 4);
                            byte b14 = $$a[11];
                            Object[] objArr14 = new Object[1];
                            a(b13, b14, (byte) (b14 | 9), objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(edgeSlop, i10, offsetAfter, 254769921, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cRed = (char) Color.red(0);
                            int i11 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 877;
                            int maximumDrawingCacheSize = 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            byte[] bArr5 = $$a;
                            byte b15 = bArr5[11];
                            Object[] objArr15 = new Object[1];
                            a(b15, bArr5[8], (byte) (b15 - 1), objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed, i11, maximumDrawingCacheSize, -1199417970, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
            int i12 = ((int[]) objArr[2])[0];
            int i13 = ((int[]) objArr[0])[0];
            if (i13 == i12) {
                int i14 = ((int[]) objArr[1])[0];
                Object[] objArr16 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int i15 = ~(System.identityHashCode(this) | 1044464020);
                int i16 = i14 + ((((-94071340) | i15) * (-658)) - 1158994884) + ((i15 | (-1071344576)) * 658);
                int i17 = (i16 << 13) ^ i16;
                int i18 = i17 ^ (i17 >>> 17);
                ((int[]) objArr16[1])[0] = i18 ^ (i18 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[3];
                if (strArr != null) {
                    int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
                    int i20 = i19 % 128;
                    g = i20;
                    int i21 = i19 % 2;
                    int i22 = i20 + 33;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
                    int i23 = i22 % 2;
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
                int i24 = ((int[]) objArr[1])[0];
                Object[] objArr17 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int i25 = ~Process.myPid();
                int i26 = i24 + (((~((-886064201) | i25)) | 76562440) * (-241)) + 251944984 + (((~(i25 | (-809501761))) | (-922316412)) * 241);
                int i27 = (i26 << 13) ^ i26;
                int i28 = i27 ^ (i27 >>> 17);
                ((int[]) objArr17[1])[0] = i28 ^ (i28 << 5);
            }
            shadowRenderer.drawCornerShadow(canvas, matrix, rectF, i, startAngle, sweepAngle);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r6, short r7, byte r8) {
            /*
                byte[] r0 = com.google.android.material.shape.ShapePath.ArcShadowOperation.$$c
                int r7 = r7 * 2
                int r7 = r7 + 4
                int r6 = r6 * 3
                int r6 = r6 + 1
                int r8 = 68 - r8
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r7
                r5 = r2
                goto L24
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r6) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L22:
                r3 = r0[r7]
            L24:
                int r7 = r7 + 1
                int r8 = r8 + r3
                r3 = r5
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.shape.ShapePath.ArcShadowOperation.$$g(byte, short, byte):java.lang.String");
        }
    }

    public void quadToPoint(float f, float f2, float f3, float f4) {
        PathQuadOperation pathQuadOperation = new PathQuadOperation();
        pathQuadOperation.setControlX(f);
        pathQuadOperation.setControlY(f2);
        pathQuadOperation.setEndX(f3);
        pathQuadOperation.setEndY(f4);
        this.operations.add(pathQuadOperation);
        this.containsIncompatibleShadowOp = true;
        setEndX(f3);
        setEndY(f4);
    }

    public void cubicToPoint(float f, float f2, float f3, float f4, float f5, float f6) {
        this.operations.add(new PathCubicOperation(f, f2, f3, f4, f5, f6));
        this.containsIncompatibleShadowOp = true;
        setEndX(f5);
        setEndY(f6);
    }

    public void addArc(float f, float f2, float f3, float f4, float f5, float f6) {
        PathArcOperation pathArcOperation = new PathArcOperation(f, f2, f3, f4);
        pathArcOperation.setStartAngle(f5);
        pathArcOperation.setSweepAngle(f6);
        this.operations.add(pathArcOperation);
        ArcShadowOperation arcShadowOperation = new ArcShadowOperation(pathArcOperation);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        addShadowCompatOperation(arcShadowOperation, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = f7;
        setEndX(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        setEndY(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    public void applyToPath(Matrix matrix, Path path) {
        int size = this.operations.size();
        for (int i = 0; i < size; i++) {
            this.operations.get(i).applyToPath(matrix, path);
        }
    }

    ShadowCompatOperation createShadowCompatOperation(Matrix matrix) {
        addConnectingShadowIfNecessary(getEndShadowAngle());
        final Matrix matrix2 = new Matrix(matrix);
        final ArrayList arrayList = new ArrayList(this.shadowCompatOperations);
        return new ShadowCompatOperation() { // from class: com.google.android.material.shape.ShapePath.1
            @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
            public void draw(Matrix matrix3, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ShadowCompatOperation) it.next()).draw(matrix2, shadowRenderer, i, canvas);
                }
            }
        };
    }

    private void addShadowCompatOperation(ShadowCompatOperation shadowCompatOperation, float f, float f2) {
        addConnectingShadowIfNecessary(f);
        this.shadowCompatOperations.add(shadowCompatOperation);
        setCurrentShadowAngle(f2);
    }

    boolean containsIncompatibleShadowOp() {
        return this.containsIncompatibleShadowOp;
    }

    private void addConnectingShadowIfNecessary(float f) {
        if (getCurrentShadowAngle() != f) {
            float currentShadowAngle = ((f - getCurrentShadowAngle()) + 360.0f) % 360.0f;
            if (currentShadowAngle > 180.0f) {
                return;
            }
            PathArcOperation pathArcOperation = new PathArcOperation(getEndX(), getEndY(), getEndX(), getEndY());
            pathArcOperation.setStartAngle(getCurrentShadowAngle());
            pathArcOperation.setSweepAngle(currentShadowAngle);
            this.shadowCompatOperations.add(new ArcShadowOperation(pathArcOperation));
            setCurrentShadowAngle(f);
        }
    }

    float getStartX() {
        return this.startX;
    }

    float getStartY() {
        return this.startY;
    }

    float getEndX() {
        return this.endX;
    }

    float getEndY() {
        return this.endY;
    }

    private float getCurrentShadowAngle() {
        return this.currentShadowAngle;
    }

    private float getEndShadowAngle() {
        return this.endShadowAngle;
    }

    private void setStartX(float f) {
        this.startX = f;
    }

    private void setStartY(float f) {
        this.startY = f;
    }

    private void setEndX(float f) {
        this.endX = f;
    }

    private void setEndY(float f) {
        this.endY = f;
    }

    private void setCurrentShadowAngle(float f) {
        this.currentShadowAngle = f;
    }

    private void setEndShadowAngle(float f) {
        this.endShadowAngle = f;
    }

    static abstract class ShadowCompatOperation {
        static final Matrix IDENTITY_MATRIX = new Matrix();
        final Matrix renderMatrix = new Matrix();

        public abstract void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas);

        ShadowCompatOperation() {
        }

        public final void draw(ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            draw(IDENTITY_MATRIX, shadowRenderer, i, canvas);
        }
    }

    static class LineShadowOperation extends ShadowCompatOperation {
        private final PathLineOperation operation;
        private final float startX;
        private final float startY;

        public LineShadowOperation(PathLineOperation pathLineOperation, float f, float f2) {
            this.operation = pathLineOperation;
            this.startX = f;
            this.startY = f2;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.operation.y - this.startY, this.operation.x - this.startX), 0.0f);
            this.renderMatrix.set(matrix);
            this.renderMatrix.preTranslate(this.startX, this.startY);
            this.renderMatrix.preRotate(getAngle());
            shadowRenderer.drawEdgeShadow(canvas, this.renderMatrix, rectF, i);
        }

        float getAngle() {
            return (float) Math.toDegrees(Math.atan((this.operation.y - this.startY) / (this.operation.x - this.startX)));
        }
    }

    static class InnerCornerShadowOperation extends ShadowCompatOperation {
        private final PathLineOperation operation1;
        private final PathLineOperation operation2;
        private final float startX;
        private final float startY;

        public InnerCornerShadowOperation(PathLineOperation pathLineOperation, PathLineOperation pathLineOperation2, float f, float f2) {
            this.operation1 = pathLineOperation;
            this.operation2 = pathLineOperation2;
            this.startX = f;
            this.startY = f2;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            float sweepAngle = getSweepAngle();
            if (sweepAngle <= 0.0f) {
                double dHypot = Math.hypot(this.operation1.x - this.startX, this.operation1.y - this.startY);
                double dHypot2 = Math.hypot(this.operation2.x - this.operation1.x, this.operation2.y - this.operation1.y);
                float fMin = (float) Math.min(i, Math.min(dHypot, dHypot2));
                double d = fMin;
                double dTan = Math.tan(Math.toRadians((-sweepAngle) / 2.0f)) * d;
                if (dHypot > dTan) {
                    RectF rectF = new RectF(0.0f, 0.0f, (float) (dHypot - dTan), 0.0f);
                    this.renderMatrix.set(matrix);
                    this.renderMatrix.preTranslate(this.startX, this.startY);
                    this.renderMatrix.preRotate(getStartAngle());
                    shadowRenderer.drawEdgeShadow(canvas, this.renderMatrix, rectF, i);
                }
                float f = 2.0f * fMin;
                RectF rectF2 = new RectF(0.0f, 0.0f, f, f);
                this.renderMatrix.set(matrix);
                this.renderMatrix.preTranslate(this.operation1.x, this.operation1.y);
                this.renderMatrix.preRotate(getStartAngle());
                this.renderMatrix.preTranslate((float) ((-dTan) - d), (-2.0f) * fMin);
                shadowRenderer.drawInnerCornerShadow(canvas, this.renderMatrix, rectF2, (int) fMin, 450.0f, sweepAngle, new float[]{(float) (d + dTan), f});
                if (dHypot2 > dTan) {
                    RectF rectF3 = new RectF(0.0f, 0.0f, (float) (dHypot2 - dTan), 0.0f);
                    this.renderMatrix.set(matrix);
                    this.renderMatrix.preTranslate(this.operation1.x, this.operation1.y);
                    this.renderMatrix.preRotate(getEndAngle());
                    this.renderMatrix.preTranslate((float) dTan, 0.0f);
                    shadowRenderer.drawEdgeShadow(canvas, this.renderMatrix, rectF3, i);
                }
            }
        }

        float getStartAngle() {
            return (float) Math.toDegrees(Math.atan((this.operation1.y - this.startY) / (this.operation1.x - this.startX)));
        }

        float getEndAngle() {
            return (float) Math.toDegrees(Math.atan((this.operation2.y - this.operation1.y) / (this.operation2.x - this.operation1.x)));
        }

        float getSweepAngle() {
            float endAngle = ((getEndAngle() - getStartAngle()) + 360.0f) % 360.0f;
            return endAngle <= 180.0f ? endAngle : endAngle - 360.0f;
        }
    }

    public static class PathLineOperation extends PathOperation {
        private float x;
        private float y;

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.x, this.y);
            path.transform(matrix);
        }
    }

    public static class PathQuadOperation extends PathOperation {

        @Deprecated
        public float controlX;

        @Deprecated
        public float controlY;

        @Deprecated
        public float endX;

        @Deprecated
        public float endY;

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(getControlX(), getControlY(), getEndX(), getEndY());
            path.transform(matrix);
        }

        private float getEndX() {
            return this.endX;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndX(float f) {
            this.endX = f;
        }

        private float getControlY() {
            return this.controlY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControlY(float f) {
            this.controlY = f;
        }

        private float getEndY() {
            return this.endY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndY(float f) {
            this.endY = f;
        }

        private float getControlX() {
            return this.controlX;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControlX(float f) {
            this.controlX = f;
        }
    }

    public static class PathArcOperation extends PathOperation {
        private static final RectF rectF = new RectF();

        @Deprecated
        public float bottom;

        @Deprecated
        public float left;

        @Deprecated
        public float right;

        @Deprecated
        public float startAngle;

        @Deprecated
        public float sweepAngle;

        @Deprecated
        public float top;

        public PathArcOperation(float f, float f2, float f3, float f4) {
            setLeft(f);
            setTop(f2);
            setRight(f3);
            setBottom(f4);
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF2 = rectF;
            rectF2.set(getLeft(), getTop(), getRight(), getBottom());
            path.arcTo(rectF2, getStartAngle(), getSweepAngle(), false);
            path.transform(matrix);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getLeft() {
            return this.left;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getTop() {
            return this.top;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getRight() {
            return this.right;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getBottom() {
            return this.bottom;
        }

        private void setLeft(float f) {
            this.left = f;
        }

        private void setTop(float f) {
            this.top = f;
        }

        private void setRight(float f) {
            this.right = f;
        }

        private void setBottom(float f) {
            this.bottom = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getStartAngle() {
            return this.startAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getSweepAngle() {
            return this.sweepAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartAngle(float f) {
            this.startAngle = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSweepAngle(float f) {
            this.sweepAngle = f;
        }
    }

    public static class PathCubicOperation extends PathOperation {
        private float controlX1;
        private float controlX2;
        private float controlY1;
        private float controlY2;
        private float endX;
        private float endY;

        public PathCubicOperation(float f, float f2, float f3, float f4, float f5, float f6) {
            setControlX1(f);
            setControlY1(f2);
            setControlX2(f3);
            setControlY2(f4);
            setEndX(f5);
            setEndY(f6);
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.controlX1, this.controlY1, this.controlX2, this.controlY2, this.endX, this.endY);
            path.transform(matrix);
        }

        private float getControlX1() {
            return this.controlX1;
        }

        private void setControlX1(float f) {
            this.controlX1 = f;
        }

        private float getControlY1() {
            return this.controlY1;
        }

        private void setControlY1(float f) {
            this.controlY1 = f;
        }

        private float getControlX2() {
            return this.controlX2;
        }

        private void setControlX2(float f) {
            this.controlX2 = f;
        }

        private float getControlY2() {
            return this.controlY1;
        }

        private void setControlY2(float f) {
            this.controlY2 = f;
        }

        private float getEndX() {
            return this.endX;
        }

        private void setEndX(float f) {
            this.endX = f;
        }

        private float getEndY() {
            return this.endY;
        }

        private void setEndY(float f) {
            this.endY = f;
        }
    }
}
