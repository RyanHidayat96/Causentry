package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class isVideoCaptureEnabled extends CameraControllerExternalSyntheticLambda7<int[]> {
    int TuitionPaymentFragmentbindingInflater1;
    int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {80, -8, 43, 65};
    private static final int $$f = 227;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {55, -64, 35, -71, 15, 1, -60, 60, 11, 3, -5, 8, -4, -52, 54, 16, -7, 17, 0, -3, -2, -51, 60, 9, 9, -66, 66, -9, 18, 6, -66, 66, 5, -8, 4, 10, -59, 37, 34, 0, 16, -15, 11, 2, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, -15, 10, 8, -7, 8, 8, -4, -27, 40, -5, 9, -8, 22, -12, 16, -62};
    private static final int $$e = 145;
    private static final byte[] $$a = {83, -44, 103, 46, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 23;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static char[] b = {59700, 59761, 59767, 59787, 59745, 59744, 59767, 59764, 59789, 59778, 59762, 59736, 59752, 59791, 59754, 59735, 59762, 59764, 59784, 59765, 59767, 59761, 59705, 59747, 59757, 59747, 59770, 59751, 59759, 59728, 59728, 59752, 59757, 59771, 59749, 59744, 59746, 59707, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59724, 59747, 59771, 59716, 59708, 59737, 59744, 59749, 59748, 59748, 59749, 59773, 59757, 59733, 59750, 59744, 59752, 59753, 59706, 59757, 59745, 59749, 59771, 59731, 59729, 59770, 59746, 59744, 59769, 59768, 59751, 59747, 59749, 59751, 59749, 59745, 59696, 59744, 59724, 59718, 59757, 59756, 59745, 59713, 59723, 59757, 59773, 59768, 59751, 59746, 59744, 59758, 59714, 59802, 59805, 59789, 59785, 59793, 59804, 59786, 59782, 59816, 59792, 59792, 59797, 59805, 59802, 59800};

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 1
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r7 = r7 * 52
            int r7 = 56 - r7
            byte[] r1 = defpackage.isVideoCaptureEnabled.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L22:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r7 = r7 + r6
            int r6 = r7 + (-10)
            int r7 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isVideoCaptureEnabled.a(byte, int, short, java.lang.Object[]):void");
    }

    private static void d(int i, short s, short s2, Object[] objArr) {
        int i2 = s * 3;
        byte[] bArr = $$d;
        int i3 = (s2 * 40) + 4;
        int i4 = (i * 15) + 84;
        byte[] bArr2 = new byte[41 - i2];
        int i5 = 40 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i4 = (i5 + i4) - 3;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3++;
                i4 = (i4 + bArr[i3]) - 3;
            }
        }
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int[] iArrTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return iArrTuitionPaymentFragmentbindingInflater1;
    }

    public isVideoCaptureEnabled(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iArr;
        this.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final int b() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        int i5 = this.TuitionPaymentFragmentbindingInflater1;
        int i6 = i3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 85 / 0;
        }
        return i5;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d A[PHI: r1
  0x001d: PHI (r1v5 int[]) = (r1v4 int[]), (r1v8 int[]) binds: [B:8:0x001b, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        int[] iArr;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i4 = 51 / 0;
            if (iArr.length < i) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, RangesKt.coerceAtLeast(i, iArr.length * 2));
                Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iArrCopyOf;
            }
        } else {
            iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (iArr.length < i) {
                int[] iArrCopyOf2 = Arrays.copyOf(iArr, RangesKt.coerceAtLeast(i, iArr.length * 2));
                Intrinsics.checkNotNullExpressionValue(iArrCopyOf2, "");
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iArrCopyOf2;
            }
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0254  */
    /* JADX WARN: Code duplicated, block: B:76:0x0272  */
    /* JADX WARN: Code duplicated, block: B:89:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0260 -> B:75:0x026f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int[] r24, boolean r25, byte[] r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isVideoCaptureEnabled.c(int[], boolean, byte[], java.lang.Object[]):void");
    }

    private int[] TuitionPaymentFragmentbindingInflater1() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cAlpha = (char) (Color.alpha(0) + 31533);
            int iIndexOf = 920 - TextUtils.indexOf((CharSequence) "", '0', 0);
            int deadChar = KeyEvent.getDeadChar(0, 0) + 28;
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr3 = new Object[1];
            a(b2, bArr[37], b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha, iIndexOf, deadChar, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new int[]{0, 22, 19, 0}, true, new byte[]{0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new int[]{22, 15, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31532);
            int i2 = 920 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28;
            byte b3 = $$a[37];
            Object[] objArr6 = new Object[1];
            a(b3, b3, (byte) 52, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i2, maximumDrawingCacheSize, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char touchSlop = (char) (31533 - (ViewConfiguration.getTouchSlop() >> 8));
                int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0');
                int i5 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 28;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[37];
                byte b5 = bArr2[80];
                Object[] objArr7 = new Object[1];
                a(b4, b5, (byte) (b5 | 37), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(touchSlop, iLastIndexOf, i5, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iNextInt = new Random().nextInt();
            int i6 = ~iNextInt;
            int i7 = (-720528378) + ((1467874967 | i6) * (-369)) + (((~((-323835541) | i6)) | 1450244103) * (-369)) + (((~(iNextInt | 323835540)) | 1144039427 | (~(i6 | (-17630865)))) * 369) + 1704088285;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(new int[]{37, 26, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new int[]{63, 18, 0, 13}, true, new byte[]{1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            c(new int[]{81, 16, 0, 14}, false, new byte[]{0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1}, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            c(new int[]{97, 16, 45, 0}, true, new byte[]{0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, objArr12);
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, 1704088285};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[5];
                byte b7 = bArr3[18];
                Object[] objArr14 = new Object[1];
                d(b6, b7, b7, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b8 = bArr3[18];
                byte b9 = bArr3[5];
                Object[] objArr15 = new Object[1];
                d(b8, b9, b9, objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char jumpTapTimeout = (char) (31533 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    int size = 921 - View.MeasureSpec.getSize(0);
                    int iAlpha = Color.alpha(0) + 28;
                    byte[] bArr4 = $$a;
                    byte b10 = bArr4[37];
                    byte b11 = bArr4[80];
                    Object[] objArr17 = new Object[1];
                    a(b10, b11, (byte) (b11 | 37), objArr17);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout, size, iAlpha, -1142834547, false, (String) objArr17[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                try {
                    Object[] objArr18 = new Object[1];
                    c(new int[]{0, 22, 19, 0}, true, new byte[]{0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr18);
                    Class<?> cls5 = Class.forName((String) objArr18[0]);
                    Object[] objArr19 = new Object[1];
                    c(new int[]{22, 15, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr19);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 31533);
                        int pressedStateDuration = 921 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28;
                        byte b12 = $$a[37];
                        Object[] objArr20 = new Object[1];
                        a(b12, b12, (byte) 52, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveOpacity, pressedStateDuration, maximumFlingVelocity, -778300370, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 31534);
                        int iGreen = 921 - Color.green(0);
                        int iIndexOf2 = 28 - TextUtils.indexOf("", "", 0, 0);
                        byte[] bArr5 = $$a;
                        byte b13 = bArr5[80];
                        Object[] objArr21 = new Object[1];
                        a(b13, bArr5[37], b13, objArr21);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, iGreen, iIndexOf2, -1048449946, false, (String) objArr21[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr16;
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
        int i10 = ((int[]) objArr[1])[0];
        int i11 = ((int[]) objArr[3])[0];
        if (i11 == i10) {
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
            int i13 = i12 % 2;
            int i14 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iMyTid = Process.myTid();
            int i15 = (-1100517967) + (((~((-565124633) | iMyTid)) | (-1208955012)) * (-318));
            int i16 = ~((-1208955012) | iMyTid);
            int i17 = ~iMyTid;
            int i18 = i14 + i15 + ((i16 | (~(1773092507 | i17))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iMyTid | 1773092507)) | (~((-1207967876) | i17))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr2[0])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 % 128;
                int i22 = i21 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
            int i23 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iMyPid = Process.myPid();
            int i24 = ~iMyPid;
            int i25 = i23 + 450306798 + ((~((-1594038414) | i24)) * 979) + ((iMyPid | 180041230) * (-979)) + (((~(iMyPid | (-1594038414))) | (~(i24 | 180041230))) * 979);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr2[0])[0] = i27 ^ (i27 << 5);
        }
        int[] iArrCopyOf = Arrays.copyOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentbindingInflater1);
        int i28 = ((int[]) objArr2[0])[0];
        int i29 = i28 * i28;
        int i30 = -(596993044 * i28);
        int i31 = (((i29 & i30) + (i29 | i30)) - (~(-(i28 * 1870354564)))) - 1;
        int i32 = ((i31 | (-1417943408)) << 1) - ((-1417943408) ^ i31);
        int i33 = i32 >> 20;
        int i34 = ((i33 ^ (-8191)) + ((i33 & (-8191)) << 1)) / 4096;
        int i35 = (i32 - (~(((i34 | 1) << 1) - (i34 ^ 1)))) - 1;
        int i36 = ((i32 >> 23) - 1023) / 512;
        int i37 = -(i35 ^ ((i36 ^ 1) + ((i36 & 1) << 1)));
        int i38 = (i37 & 5) + (i37 | 5);
        int i39 = i38 >> 22;
        int i40 = (((i39 | (-2047)) << 1) - (i39 ^ (-2047))) / 1024;
        int i41 = ((i40 | 1) << 1) - (i40 ^ 1);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "13/7/3/copyOf(...)".substring(29225 / (((-((i41 & 1) + (i41 | 1))) & i38) * 835)));
        return iArrCopyOf;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, short r6, byte r7) {
        /*
            byte[] r0 = defpackage.isVideoCaptureEnabled.$$c
            int r5 = 105 - r5
            int r7 = r7 * 2
            int r1 = 1 - r7
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r3 = r6
            r5 = r7
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r3 = r0[r6]
        L27:
            int r6 = r6 + 1
            int r5 = r5 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isVideoCaptureEnabled.$$g(byte, short, byte):java.lang.String");
    }
}
