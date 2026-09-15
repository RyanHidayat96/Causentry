package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes3.dex */
public final class D {
    private static final isLenovoTablet b;

    static {
        Function1 function1 = new Function1() { // from class: r8lambdaX1iHHIs4yW7jFUR3OHkx6x3neE
            private static short[] TuitionPaymentFragmentbindingInflater1;
            private static final byte[] $$c = {0, -94, -62, -97};
            private static final int $$f = 240;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {19, 78, 114, 113, -16, -2, 59, -68, 8, -21, 65, -68, -11, 14, -13, 3, -14, Base64.padSymbol, -75, -3, 7, -7, -11, 65, -31, -40, 8, -10, -2, 17, -29, 2, -12, 2, -17, 25, -35, 7, -7, -11, 75, -52, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, 14, -11, -9, 6, -9, -9, 3, 26, -41, 4, -10, 7, -23, 11, -17, Base64.padSymbol, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 62};
            private static final int $$e = 137;
            private static final byte[] $$a = {114, -59, 10, 31, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
            private static final int $$b = 107;
            private static int d = 0;
            private static int asInterface = 1;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1571776757;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1934795547;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -762072031;
            private static byte[] b = {-11, 104, -100, 111, 73, -70, 104, -111, 97, 102, 74, 77, -89, 108, 33, -74, 103, 102, 101, 114, -102, 117, -22, -7, -51, -6, -55, -44, -59, -36, -13, -64, -1, -52, -48, -6, -56, -21, 13, 50, 2, 59, -17, -18, 76, 58, 22, 62, -57, 86, 40, 30, 60, -21, -124, -80, 107, -38, -80, -107, -100, -42, ByteCompanionObject.MIN_VALUE, -118, -80, -127, -116, -124, -70};

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r6, int r7, byte r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = defpackage.r8lambdaX1iHHIs4yW7jFUR3OHkx6x3neE.$$a
                    int r1 = r6 + 1
                    int r7 = r7 * 3
                    int r7 = r7 + 97
                    int r8 = r8 * 10
                    int r8 = 13 - r8
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r6
                    r7 = r8
                    r4 = r2
                    goto L2c
                L15:
                    r3 = r2
                L16:
                    int r8 = r8 + 1
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L27:
                    r3 = r0[r8]
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L2c:
                    int r3 = -r3
                    int r8 = r8 + r3
                    int r8 = r8 + (-5)
                    r3 = r4
                    r5 = r8
                    r8 = r7
                    r7 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.r8lambdaX1iHHIs4yW7jFUR3OHkx6x3neE.a(short, int, byte, java.lang.Object[]):void");
            }

            private static void e(short s, byte b2, byte b3, Object[] objArr) {
                int i = 78 - (b2 * 75);
                int i2 = b3 * 23;
                byte[] bArr = $$d;
                int i3 = (s * 15) + 84;
                byte[] bArr2 = new byte[i2 + 53];
                int i4 = i2 + 52;
                int i5 = -1;
                if (bArr == null) {
                    i3 = (i3 + (-i4)) - 4;
                }
                while (true) {
                    i5++;
                    bArr2[i5] = (byte) i3;
                    i++;
                    if (i5 == i4) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    i3 = (i3 + (-bArr[i])) - 4;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 876;
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 11;
                    byte[] bArr = $$a;
                    byte b2 = bArr[2];
                    byte b3 = bArr[11];
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, (byte) (b3 + 1), objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionGroup, longPressTimeout, modifierMetaStateMask, -1199417970, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(MotionEvent.axisFromString("") - 1581181029, (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 4, (short) (121 - ExpandableListView.getPackedPositionChild(0L)), (byte) (MotionEvent.axisFromString("") + 1), AndroidCharacter.getMirror('0') + 52157, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c((-1581181026) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0') - 3, (short) ((Process.myPid() >> 22) - 39), (byte) (Process.myPid() >> 22), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 788384770, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cResolveSize = (char) View.resolveSize(0, 0);
                    int iLastIndexOf = 875 - TextUtils.lastIndexOf("", '0');
                    int i2 = 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte b4 = $$a[11];
                    byte b5 = b4;
                    Object[] objArr5 = new Object[1];
                    a(b5, (byte) (b5 + 1), b4, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize, iLastIndexOf, i2, 254769921, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i3 = asInterface + 97;
                    d = i3 % 128;
                    int i4 = i3 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "");
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 876;
                        int iIndexOf = 10 - TextUtils.indexOf("", "", 0);
                        byte[] bArr2 = $$a;
                        byte b6 = bArr2[10];
                        byte b7 = bArr2[11];
                        Object[] objArr6 = new Object[1];
                        a(b6, b7, b7, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, tapTimeout, iIndexOf, 1324201839, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i5 = (((((~((-806671397) | iIdentityHashCode)) | (-1052639232)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 1283855520) + ((~((~iIdentityHashCode) | (-806671397))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) - 877950283;
                    int i6 = (i5 << 13) ^ i5;
                    int i7 = i6 ^ (i6 >>> 17);
                    ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(View.MeasureSpec.getSize(0) - 1581181021, AndroidCharacter.getMirror('0') - '4', (short) (29 - KeyEvent.getDeadChar(0, 0)), (byte) (ViewConfiguration.getTouchSlop() >> 8), Gravity.getAbsoluteGravity(0, 0) + 788384786, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 1581181022, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 3, (short) (KeyEvent.keyCodeFromString("") - 97), (byte) ((-1) - MotionEvent.axisFromString("")), 788384802 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr9);
                    try {
                        Object[] objArr10 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), -877950283};
                        byte[] bArr3 = $$d;
                        byte b8 = bArr3[126];
                        byte b9 = b8;
                        Object[] objArr11 = new Object[1];
                        e(b8, b9, b9, objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        byte b10 = bArr3[116];
                        byte b11 = b10;
                        Object[] objArr12 = new Object[1];
                        e(b10, b11, b11, objArr12);
                        Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                            int i8 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 875;
                            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 10;
                            byte[] bArr4 = $$a;
                            byte b12 = bArr4[10];
                            byte b13 = bArr4[11];
                            Object[] objArr14 = new Object[1];
                            a(b12, b13, b13, objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, i8, packedPositionType, 1324201839, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                        try {
                            Object[] objArr15 = new Object[1];
                            c((ViewConfiguration.getWindowTouchSlop() >> 8) - 1581181030, (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 4, (short) (122 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 788384749 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr15);
                            Class<?> cls4 = Class.forName((String) objArr15[0]);
                            Object[] objArr16 = new Object[1];
                            c((-1581181025) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 5, (short) ((-39) - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (byte) Color.green(0), 788384771 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr16);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                                int capsMode = TextUtils.getCapsMode("", 0, 0) + 876;
                                int iArgb = 10 - Color.argb(0, 0, 0, 0);
                                byte b14 = $$a[11];
                                byte b15 = b14;
                                Object[] objArr17 = new Object[1];
                                a(b15, (byte) (b15 + 1), b14, objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(deadChar, capsMode, iArgb, 254769921, false, (String) objArr17[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char c = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                int iResolveSizeAndState = 876 - View.resolveSizeAndState(0, 0, 0);
                                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 11;
                                byte[] bArr5 = $$a;
                                byte b16 = bArr5[2];
                                byte b17 = bArr5[11];
                                Object[] objArr18 = new Object[1];
                                a(b16, b17, (byte) (b17 + 1), objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iResolveSizeAndState, iLastIndexOf2, -1199417970, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
                int i9 = ((int[]) objArr[2])[0];
                int i10 = ((int[]) objArr[0])[0];
                if (i10 == i9) {
                    int i11 = ((int[]) objArr[1])[0];
                    Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i12 = i11 + 1858126516 + (((~(629565087 | iIdentityHashCode2)) | 40441952) * 336) + (((~(iIdentityHashCode2 | 669875316)) | 131723) * (-168)) + (((~((~iIdentityHashCode2) | 669875316)) | 629565087) * 168);
                    int i13 = (i12 << 13) ^ i12;
                    int i14 = i13 ^ (i13 >>> 17);
                    ((int[]) objArr19[1])[0] = i14 ^ (i14 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[3];
                    if (strArr != null) {
                        int i15 = d + 91;
                        int i16 = i15 % 128;
                        asInterface = i16;
                        int i17 = i15 % 2;
                        int i18 = i16 + 117;
                        d = i18 % 128;
                        int i19 = i18 % 2;
                        for (String str : strArr) {
                            int i20 = d + 67;
                            asInterface = i20 % 128;
                            int i21 = i20 % 2;
                            arrayList.add(str);
                        }
                    }
                    Toast.makeText((Context) null, i10 / (((i10 - 1) * i10) % 2), 0).show();
                    int i22 = ((int[]) objArr[1])[0];
                    Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                    int i23 = i22 + (((~(769853900 | iUptimeMillis)) | (-497620590)) * 262) + 1346001206 + (((~((~iUptimeMillis) | 769853900)) | (-497620590)) * 262);
                    int i24 = (i23 << 13) ^ i23;
                    int i25 = i24 ^ (i24 >>> 17);
                    ((int[]) objArr20[1])[0] = i25 ^ (i25 << 5);
                }
                return D.TuitionPaymentFragmentbindingInflater1((isLenovoTablet) obj);
            }

            /* JADX WARN: Code duplicated, block: B:48:0x023d  */
            /* JADX WARN: Code duplicated, block: B:58:0x0262  */
            /* JADX WARN: Code duplicated, block: B:59:0x0286  */
            private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
                boolean z;
                int i4 = 2 % 2;
                SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    long j = 0;
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int i5 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2267;
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 34;
                        byte b3 = $$c[0];
                        byte b4 = (byte) (b3 - 1);
                        byte b5 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i5, bitsPerPixel, 1387473586, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    int i6 = iIntValue == -1 ? 1 : 0;
                    if (i6 != 0) {
                        int i7 = $11 + 15;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        byte[] bArr = b;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            int i9 = 0;
                            while (i9 < length) {
                                Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                    int i10 = (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 3359;
                                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 18;
                                    byte[] bArr3 = $$c;
                                    byte b6 = bArr3[0];
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(jumpTapTimeout, i10, iCombineMeasuredStates, -1054011043, false, $$g((byte) (b6 - 1), (byte) bArr3.length, b6), new Class[]{Integer.TYPE});
                                }
                                bArr2[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                i9++;
                                j = 0;
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            byte[] bArr4 = b;
                            Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char bitsPerPixel2 = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2267;
                                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 33;
                                byte b7 = $$c[0];
                                byte b8 = (byte) (b7 - 1);
                                byte b9 = b7;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(bitsPerPixel2, keyRepeatTimeout, longPressTimeout, 1387473586, false, $$g(b8, b9, b9), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                        } else {
                            iIntValue = (short) (((short) (((long) TuitionPaymentFragmentbindingInflater1[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                        }
                    }
                    if (iIntValue > 0) {
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)) + i6;
                        Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 55905);
                            int iMyPid = 2855 - (Process.myPid() >> 22);
                            int capsMode = 13 - TextUtils.getCapsMode("", 0, 0);
                            byte b10 = $$c[0];
                            byte b11 = (byte) (b10 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iMyPid, capsMode, -1529949196, false, $$g(b11, (byte) (-b11), b10), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        byte[] bArr5 = b;
                        if (bArr5 != null) {
                            int length2 = bArr5.length;
                            byte[] bArr6 = new byte[length2];
                            for (int i11 = 0; i11 < length2; i11++) {
                                bArr6[i11] = (byte) (((long) bArr5[i11]) ^ 3046761265686732006L);
                            }
                            bArr5 = bArr6;
                        }
                        if (bArr5 != null) {
                            int i12 = $11 + 53;
                            $10 = i12 % 128;
                            if (i12 % 2 != 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                        int i13 = $10 + 33;
                        $11 = i13 % 128;
                        while (true) {
                            int i14 = i13 % 2;
                            if (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= iIntValue) {
                                break;
                            }
                            int i15 = $10 + 119;
                            $11 = i15 % 128;
                            if (i15 % 2 == 0) {
                                int i16 = 50 / 0;
                                if (z) {
                                    byte[] bArr7 = b;
                                    int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i17]) ^ 3046761265686732006L)) + s)) ^ b2));
                                } else {
                                    short[] sArr = TuitionPaymentFragmentbindingInflater1;
                                    int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 - 1;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i18]) ^ 3046761265686732006L)) + s)) ^ b2));
                                }
                            } else if (z) {
                                byte[] bArr8 = b;
                                int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr8[i19]) ^ 3046761265686732006L)) + s)) ^ b2));
                            } else {
                                short[] sArr2 = TuitionPaymentFragmentbindingInflater1;
                                int i110 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i110 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr2[i110]) ^ 3046761265686732006L)) + s)) ^ b2));
                            }
                            sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                            i13 = $11 + 9;
                            $10 = i13 % 128;
                        }
                    }
                    objArr[0] = sb.toString();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r6, short r7, byte r8) {
                /*
                    int r7 = r7 + 117
                    byte[] r0 = defpackage.r8lambdaX1iHHIs4yW7jFUR3OHkx6x3neE.$$c
                    int r8 = r8 * 2
                    int r1 = 1 - r8
                    int r6 = r6 + 4
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r8 = 0 - r8
                    if (r0 != 0) goto L15
                    r7 = r6
                    r3 = r8
                    r4 = r2
                    goto L2c
                L15:
                    r3 = r2
                L16:
                    int r6 = r6 + 1
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    if (r3 != r8) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L23:
                    int r3 = r3 + 1
                    r4 = r0[r6]
                    r5 = r7
                    r7 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L2c:
                    int r6 = -r6
                    int r6 = r6 + r3
                    r3 = r4
                    r5 = r7
                    r7 = r6
                    r6 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.r8lambdaX1iHHIs4yW7jFUR3OHkx6x3neE.$$g(byte, short, byte):java.lang.String");
            }
        };
        isLenovoTablet islenovotablet = new isLenovoTablet(false, false);
        function1.invoke(islenovotablet);
        b = islenovotablet;
    }

    public static final isLenovoTablet TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return b;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(isLenovoTablet islenovotablet) {
        Intrinsics.checkNotNullParameter(islenovotablet, "");
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function2 = new Function2() { // from class: B
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return D.TuitionPaymentFragmentspecialinlinedviewModeldefault3((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind = Kind.Factory;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(CaptureSessionExternalSyntheticLambda3.class));
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function2;
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove, new ZoomGestureDetectorgestureDetector1(false, false, 1, null));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove);
        ZoomGestureDetectorZoomEventBegin zoomGestureDetectorZoomEventBegin = zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Boolean bool = Boolean.TRUE;
        Map<String, Object> map = zoomGestureDetectorZoomEventBegin.TuitionPaymentFragmentbindingInflater1;
        if (bool == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
        }
        map.put("isViewModel", bool);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ CaptureSessionExternalSyntheticLambda3 TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new CaptureSessionExternalSyntheticLambda3((ensureViewModelStore) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(ensureViewModelStore.class), null, null), (acquireBuffer) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), null, null), (registerlambda1) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(registerlambda1.class), null, null));
    }
}
