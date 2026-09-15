package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ResultMetadataType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class DynamicRanges {
    public final String TuitionPaymentFragmentbindingInflater1;
    public final BarcodeFormat TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public Map<ResultMetadataType, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final long asBinder;
    private final int asInterface;
    public DeferrableSurfaces1[] b;
    private static final byte[] $$c = {114, -59, 10, 31};
    private static final int $$f = 177;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {109, 48, -62, 38, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -73, 3, 27, -5, 6, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 70};
    private static final int $$e = 5;
    private static final byte[] $$a = {117, -15, -81, 1, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 198;
    private static int g = 0;
    private static int d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f131a = {59706, 59746, 59750, 59740, 59731, 59746, 59751, 59768, 59773, 59757, 59723, 59739, 59770, 59717, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59757, 59784, 59395, 59400, 59888, 59897, 59897, 59889, 59894, 59404, 59406, 59401, 59403, 59895, 59892, 59894, 59697, 59773, 59757, 59733, 59750, 59744, 59752, 59753, 59753, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59724, 59747, 59771, 59716, 59708, 59737, 59744, 59749, 59748, 59748, 59764, 59892, 59894, 59890, 59902, 59898, 59890, 59894, 59888, 59894, 59900, 59888, 59401, 59402, 59889, 59891, 59403, 59874, 59714, 59800, 59783, 59778, 59776, 59790, 59776, 59776, 59756, 59750, 59789, 59788, 59777, 59745, 59755, 59789, 59705, 59759, 59757, 59756, 59759, 59746, 59730, 59742, 59750, 59745, 59743, 59755, 59773, 59749, 59749, 59770, 59667, 59711, 59709, 59712, 59752, 59758, 59718, 59718, 59757, 59716, 59708, 59717, 59759, 59754, 59754, 59752, 59758, 59712, 59713, 59713, 59719, 59759, 59753, 59712, 59709, 59699, 59718, 59713, 59710, 59709, 59713, 59719, 59711, 59715, 59712, 59711, 59719, 59758, 59716, 59709, 59711, 59718, 59752, 59719, 59711, 59706, 59710, 59710, 59714, 59718, 59698, 59709, 59719, 59712, 59705, 59714, 59719, 59717, 59752, 59719, 59708, 59709, 59718, 59718, 59704, 59717, 59704, 59715, 59713, 59704, 59719, 59759, 59713, 59705, 59704, 59712, 59718, 59698, 59717, 59717, 59709, 59704, 59704, 59710, 59709, 59717, 59758, 59712, 59705, 59714, 59752, 59719, 59705, 59704, 59712, 59718, 59699, 59699, 59698, 59709, 59709, 59718, 59712, 59712, 59719, 59717, 59717, 59709, 59711, 59711, 59711, 59705, 59704, 59718, 59719, 59712, 59752, 59714, 59712, 59758, 59717, 59719, 59712, 59705, 59704, 59718, 59753, 59753};

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 14
            int r9 = 98 - r9
            int r8 = r8 * 52
            int r8 = r8 + 1
            int r7 = r7 * 52
            int r7 = 55 - r7
            byte[] r0 = defpackage.DynamicRanges.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r3
            r3 = r9
            r9 = r6
        L2d:
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DynamicRanges.c(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 49
            int r6 = 52 - r6
            int r7 = r7 * 15
            int r7 = r7 + 84
            int r8 = r8 * 3
            int r0 = 53 - r8
            byte[] r1 = defpackage.DynamicRanges.$$d
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2b:
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L30:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + 3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DynamicRanges.f(byte, int, byte, java.lang.Object[]):void");
    }

    public DynamicRanges(String str, byte[] bArr, DeferrableSurfaces1[] deferrableSurfaces1Arr, BarcodeFormat barcodeFormat) {
        this(str, bArr, deferrableSurfaces1Arr, barcodeFormat, System.currentTimeMillis());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private DynamicRanges(String str, byte[] bArr, DeferrableSurfaces1[] deferrableSurfaces1Arr, BarcodeFormat barcodeFormat, long j) {
        int i;
        if (bArr == null) {
            int i2 = g + 57;
            d = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            i = 0;
        } else {
            int length = bArr.length * 8;
            int i5 = d + 37;
            g = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = length;
        }
        this(str, bArr, i, deferrableSurfaces1Arr, barcodeFormat, j);
    }

    public DynamicRanges(String str, byte[] bArr, int i, DeferrableSurfaces1[] deferrableSurfaces1Arr, BarcodeFormat barcodeFormat, long j) {
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bArr;
        this.asInterface = i;
        this.b = deferrableSurfaces1Arr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = barcodeFormat;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        this.asBinder = j;
    }

    private static void e(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = f131a;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = $11 + 101;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = new Object[i5];
                    objArr2[i3] = Integer.valueOf(cArr[i11]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int trimmedLength = TextUtils.getTrimmedLength("") + 1270;
                        int iRgb = Color.rgb(i3, i3, i3) + 16777234;
                        byte b = (byte) i3;
                        byte b2 = (byte) (b + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, trimmedLength, iRgb, 407021364, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i11++;
                    i3 = 0;
                    i5 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i12 = $11 + 63;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i4, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i6) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i14 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 3225 - Drawable.resolveOpacity(0, 0), KeyEvent.getDeadChar(0, 0) + 13, 2133916302, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i15 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 29944), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1755, 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 387247676, false, $$g(b5, b6, (byte) (b6 - 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    int i16 = $11 + 73;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 41241), 1705 - TextUtils.getOffsetBefore("", 0), 21 - Color.green(0), -1434471773, false, $$g(b7, (byte) (b7 | 6), b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            int i18 = $11 + 7;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                char[] cArr5 = new char[i6];
                i = 0;
                System.arraycopy(cArr3, 0, cArr5, 1, i6);
                System.arraycopy(cArr5, 0, cArr3, i6 >> i8, i8);
                System.arraycopy(cArr5, i8, cArr3, 1, i6 * i8);
            } else {
                i = 0;
                char[] cArr6 = new char[i6];
                System.arraycopy(cArr3, 0, cArr6, 0, i6);
                int i19 = i6 - i8;
                System.arraycopy(cArr6, 0, cArr3, i19, i8);
                System.arraycopy(cArr6, i8, cArr3, 0, i19);
            }
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i6];
            setvideostabilizationmode.b = i;
            while (setvideostabilizationmode.b < i6) {
                int i20 = $11 + 103;
                $10 = i20 % 128;
                if (i20 % 2 != 0) {
                    cArr7[setvideostabilizationmode.b] = cArr3[(i6 << setvideostabilizationmode.b) / 0];
                    setvideostabilizationmode.b >>= 1;
                } else {
                    cArr7[setvideostabilizationmode.b] = cArr3[(i6 - setvideostabilizationmode.b) - 1];
                    setvideostabilizationmode.b++;
                }
            }
            cArr3 = cArr7;
        }
        if (i7 > 0) {
            int i21 = $10 + 97;
            $11 = i21 % 128;
            if (i21 % 2 == 0) {
                setvideostabilizationmode.b = 1;
            } else {
                setvideostabilizationmode.b = 0;
            }
            while (setvideostabilizationmode.b < i6) {
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                setvideostabilizationmode.b++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public final void b(ResultMetadataType resultMetadataType, Object obj) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new EnumMap(ResultMetadataType.class);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char minimumFlingVelocity = (char) (37567 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 625;
            int iLastIndexOf = 13 - TextUtils.lastIndexOf("", '0');
            byte[] bArr = $$a;
            byte b = bArr[3];
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(minimumFlingVelocity, keyRepeatDelay, iLastIndexOf, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{0, 22, 0, 21}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{22, 15, 151, 12}, false, new byte[]{1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 37567);
            int packedPositionChild = 624 - ExpandableListView.getPackedPositionChild(0L);
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 14;
            byte b3 = $$a[3];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            c(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, packedPositionChild, edgeSlop, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = g + 121;
            d = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (37568 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int deadChar = 625 - KeyEvent.getDeadChar(0, 0);
                int offsetAfter = 14 - TextUtils.getOffsetAfter("", 0);
                byte[] bArr2 = $$a;
                byte b5 = bArr2[7];
                byte b6 = bArr2[3];
                Object[] objArr6 = new Object[1];
                c(b5, b6, b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, deadChar, offsetAfter, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr7[2])[0];
            int i5 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            int i7 = (-1751955009) + (((~((-343285884) | i6)) | (~(iIdentityHashCode | 1480452237))) * 333) + (((~(iIdentityHashCode | (-343285884))) | (~(i6 | 1480452237))) * 333) + 2040673146;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{new int[]{i5}, new int[1], new int[]{i4}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e(new int[]{37, 26, 0, 8}, false, new byte[]{0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new int[]{63, 18, 143, 10}, false, new byte[]{1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = d + 11;
                g = i10 % 128;
                if (i10 % 2 != 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    throw null;
                }
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    int i11 = g + 105;
                    d = i11 % 128;
                    int i12 = i11 % 2;
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            e(new int[]{81, 16, 32, 4}, false, new byte[]{1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new int[]{97, 16, 0, 3}, true, new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            e(new int[]{113, 64, 0, 18}, true, new byte[]{1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1}, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            e(new int[]{177, 64, 0, 0}, true, new byte[]{0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0}, objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, 2040673146};
                byte b7 = $$d[35];
                byte b8 = b7;
                Object[] objArr15 = new Object[1];
                f(b7, b8, b8, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b9 = (byte) ($$e - 5);
                byte b10 = b9;
                Object[] objArr16 = new Object[1];
                f(b9, b10, b10, objArr16);
                objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i13 = ((int[]) objArr[0])[0];
                int i14 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cMyTid = (char) (37567 - (Process.myTid() >> 22));
                        int i15 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 625;
                        int deadChar2 = 14 - KeyEvent.getDeadChar(0, 0);
                        byte[] bArr3 = $$a;
                        byte b11 = bArr3[7];
                        byte b12 = bArr3[3];
                        Object[] objArr17 = new Object[1];
                        c(b11, b12, b12, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyTid, i15, deadChar2, -973632554, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr18 = new Object[1];
                        e(new int[]{0, 22, 0, 21}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0}, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        e(new int[]{22, 15, 151, 12}, false, new byte[]{1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1}, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c2 = (char) (37568 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                            int iIndexOf = 624 - TextUtils.indexOf((CharSequence) "", '0');
                            int i16 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14;
                            byte b13 = $$a[3];
                            byte b14 = b13;
                            Object[] objArr20 = new Object[1];
                            c(b13, b14, b14, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iIndexOf, i16, -976899241, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c3 = (char) (37568 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                            int iLastIndexOf2 = 624 - TextUtils.lastIndexOf("", '0', 0, 0);
                            int edgeSlop2 = 14 - (ViewConfiguration.getEdgeSlop() >> 16);
                            byte[] bArr4 = $$a;
                            byte b15 = bArr4[3];
                            byte b16 = bArr4[7];
                            Object[] objArr21 = new Object[1];
                            c(b15, b16, b16, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, iLastIndexOf2, edgeSlop2, -477065106, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i17 = ((int[]) objArr[0])[0];
        int i18 = ((int[]) objArr[2])[0];
        if (i18 == i17) {
            int i19 = ((int[]) objArr[1])[0];
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[0])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr = {i20};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i22 = ~startElapsedRealtime;
            int i23 = i19 + 1502861862 + (((~((-1071897398) | i22)) | (~(1072955383 | startElapsedRealtime))) * (-831)) + ((~((-321114661) | startElapsedRealtime)) * (-1662)) + (((~(startElapsedRealtime | 1071897397)) | (~(i22 | (-751840724))) | (~(751840723 | startElapsedRealtime))) * 831);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr[1])[0] = i25 ^ (i25 << 5);
            Object[] objArr22 = {new int[]{i21}, new int[1], iArr, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i26 = 0;
                while (i26 < strArr3.length) {
                    int i27 = g + 75;
                    d = i27 % 128;
                    if (i27 % 2 == 0) {
                        arrayList.add(strArr3[i26]);
                        i26 += 70;
                    } else {
                        arrayList.add(strArr3[i26]);
                        i26++;
                    }
                }
            }
            Toast.makeText((Context) null, i18 / (((i18 - 1) * i18) % 2), 0).show();
            int i28 = ((int[]) objArr[1])[0];
            int i29 = ((int[]) objArr[2])[0];
            int i30 = ((int[]) objArr[0])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr2 = {i29};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i31 = ~iIdentityHashCode2;
            int i32 = i28 + 686393502 + (((~((-932657267) | i31)) | (~((-891080855) | iIdentityHashCode2))) * 217) + (((~(iIdentityHashCode2 | (-932657267))) | 890507282) * 217) + (((~((-891080855) | i31)) | 932657266) * 217);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr[1])[0] = i34 ^ (i34 << 5);
            Object[] objArr23 = {new int[]{i30}, new int[1], iArr2, strArr4};
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.put(resultMetadataType, obj);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 75;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.TuitionPaymentFragmentbindingInflater1;
        int i5 = i2 + 101;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, int r8) {
        /*
            byte[] r0 = defpackage.DynamicRanges.$$c
            int r8 = r8 * 2
            int r1 = 1 - r8
            int r7 = r7 + 99
            int r6 = r6 * 2
            int r6 = 3 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2d
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2d:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DynamicRanges.$$g(short, int, int):java.lang.String");
    }
}
