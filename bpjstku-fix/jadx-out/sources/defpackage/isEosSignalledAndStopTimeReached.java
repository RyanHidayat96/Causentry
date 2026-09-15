package defpackage;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes7.dex */
public final class isEosSignalledAndStopTimeReached {
    private static final byte[] $$c = {48, -119, -71, 110};
    private static final int $$f = 164;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {83, ByteCompanionObject.MIN_VALUE, -37, -48, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 179;
    private static final byte[] $$a = {5, -91, 77, 46, -15, 8, -16, 1, 4, 3, 52, -55, -14, -1, -8, 13, -11, -8, 68, -68, 1, Base64.padSymbol, -36, -19, -4, -10, 8, -8, 0, 22, -22, -15, 11, -8, 0, -15, 0, -17, 34, -19, -4, -10, 8, -8, 0, 26, -39, 6, -11};
    private static final int $$b = 67;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -3427254593662481601L;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.isEosSignalledAndStopTimeReached.$$a
            int r7 = r7 * 32
            int r7 = 36 - r7
            int r6 = r6 * 19
            int r1 = r6 + 14
            int r8 = r8 * 6
            int r8 = 103 - r8
            byte[] r1 = new byte[r1]
            int r6 = r6 + 13
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2f:
            int r7 = -r7
            int r8 = r8 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-2)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isEosSignalledAndStopTimeReached.a(byte, byte, byte, java.lang.Object[]):void");
    }

    private static void b(int i, byte b, short s, Object[] objArr) {
        int i2 = 103 - i;
        byte[] bArr = $$d;
        int i3 = b * 52;
        int i4 = (s * 52) + 4;
        byte[] bArr2 = new byte[53 - i3];
        int i5 = 52 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 = (i2 + i4) - 11;
            i4++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i4;
            i2 = (i2 + bArr[i4]) - 11;
            i4 = i8 + 1;
            i6 = i7;
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
        int i3 = 4;
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i4 = $11 + 25;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - i3;
            int i6 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % i3]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 1356 - TextUtils.getCapsMode("", 0, 0), 39 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 894276454, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 47774), 469 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i7 = $11 + 93;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 4 % 2;
                }
                i3 = 4;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0455  */
    public static int TuitionPaymentFragmentbindingInflater1(List list) throws Throwable {
        Method[] methodArr;
        Class<?> cls;
        String str;
        Class<?>[] clsArr;
        char c;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Method method;
        int i6;
        int i7 = 2 % 2;
        int i8 = TuitionPaymentFragmentbindingInflater1;
        int i9 = 1;
        int i10 = (i8 ^ 49) + ((i8 & 49) << 1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
        int i11 = 28;
        int i12 = 0;
        if (i10 % 2 != 0) {
            methodArr = new Method[4];
            byte[] bArr = $$a;
            byte b = bArr[7];
            byte b2 = b;
            Object[] objArr = new Object[1];
            a(b, b2, b2, objArr);
            cls = Class.forName((String) objArr[0]);
            byte b3 = bArr[28];
            byte b4 = b3;
            Object[] objArr2 = new Object[1];
            a(b3, b4, b4, objArr2);
            str = (String) objArr2[0];
            clsArr = new Class[2];
            c = 1;
        } else {
            methodArr = new Method[2];
            byte[] bArr2 = $$a;
            byte b5 = bArr2[7];
            byte b6 = b5;
            Object[] objArr3 = new Object[1];
            a(b5, b6, b6, objArr3);
            cls = Class.forName((String) objArr3[0]);
            byte b7 = bArr2[28];
            byte b8 = b7;
            Object[] objArr4 = new Object[1];
            a(b7, b8, b8, objArr4);
            str = (String) objArr4[0];
            clsArr = new Class[2];
            c = 0;
        }
        clsArr[0] = String.class;
        clsArr[1] = Integer.TYPE;
        methodArr[c] = cls.getMethod(str, clsArr);
        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
        TuitionPaymentFragmentbindingInflater1 = i13 % 128;
        int i14 = i13 % 2;
        Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
        byte b9 = $$a[28];
        byte b10 = b9;
        Object[] objArr5 = new Object[1];
        a(b9, b10, b10, objArr5);
        methodArr[1] = cls2.getMethod((String) objArr5[0], String.class, Integer.TYPE);
        int i15 = -2001519171;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        int i16 = 16;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char defaultSize = (char) View.getDefaultSize(0, 0);
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2823;
            int jumpTapTimeout = 22 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            byte[] bArr3 = $$d;
            byte b11 = bArr3[54];
            byte b12 = bArr3[7];
            Object[] objArr6 = new Object[1];
            b(b11, b12, b12, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, fadingEdgeLength, jumpTapTimeout, 1814927978, false, (String) objArr6[0], null);
        }
        Class<?>[] clsArr2 = null;
        long j = 0;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) != null) {
            i = i15;
            break;
        }
        Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), KeyEvent.getDeadChar(0, 0) + 2823, 22 - View.MeasureSpec.getSize(0))).getDeclaredMethods();
        int length = declaredMethods.length;
        int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i18 = ((i17 | 115) << 1) - (i17 ^ 115);
        TuitionPaymentFragmentbindingInflater1 = i18 % 128;
        int i19 = i18 % 2;
        int i20 = 0;
        while (true) {
            if (i20 >= length) {
                i = i15;
                break;
            }
            Method method2 = declaredMethods[i20];
            int i21 = TuitionPaymentFragmentbindingInflater1;
            int i22 = ((i21 | 61) << 1) - (i21 ^ 61);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
            int i23 = i22 % 2;
            try {
                char[] cArr = new char[i11];
                // fill-array-data instruction
                cArr[0] = 18383;
                cArr[1] = 18341;
                cArr[2] = 27009;
                cArr[3] = 35001;
                cArr[4] = 45614;
                cArr[5] = 28906;
                cArr[6] = 35773;
                cArr[7] = 12247;
                cArr[8] = 49797;
                cArr[9] = 61032;
                cArr[10] = 64089;
                cArr[11] = 41660;
                cArr[12] = 19808;
                cArr[13] = 25782;
                cArr[14] = 32550;
                cArr[15] = 9483;
                cArr[16] = 55173;
                cArr[17] = 63824;
                cArr[18] = 57493;
                cArr[19] = 49129;
                cArr[20] = 21035;
                cArr[21] = 32382;
                cArr[22] = 27169;
                cArr[23] = 12867;
                cArr[24] = 56655;
                cArr[25] = 62620;
                cArr[26] = 61415;
                cArr[27] = 46374;
                int i24 = -(ExpandableListView.getPackedPositionForGroup(i12) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(i12) == j ? 0 : -1));
                Object[] objArr7 = new Object[i9];
                c(cArr, (i24 ^ 1) + ((i24 & i9) << i9), objArr7);
                Class<?> cls3 = Class.forName((String) objArr7[i12]);
                char[] cArr2 = new char[i16];
                // fill-array-data instruction
                cArr2[0] = 7952;
                cArr2[1] = 8055;
                cArr2[2] = 15048;
                cArr2[3] = 56308;
                cArr2[4] = 18403;
                cArr2[5] = 34085;
                cArr2[6] = 20838;
                cArr2[7] = 62752;
                cArr2[8] = 39451;
                cArr2[9] = 48429;
                cArr2[10] = 3996;
                cArr2[11] = 30831;
                cArr2[12] = 5553;
                cArr2[13] = 14256;
                cArr2[14] = 35563;
                cArr2[15] = 65478;
                int offsetBefore = TextUtils.getOffsetBefore("", i12);
                int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
                TuitionPaymentFragmentbindingInflater1 = i25 % 128;
                int i26 = i25 % 2;
                Object[] objArr8 = new Object[i9];
                c(cArr2, offsetBefore + i9, objArr8);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr8[i12], clsArr2).invoke(method2, clsArr2)).intValue();
                Object[] objArr9 = new Object[i9];
                objArr9[i12] = Integer.valueOf(iIntValue);
                Object[] objArr10 = new Object[i9];
                c(new char[]{58727, 58637, 30470, 38462, 28186, 44254, 1852, 41814, 24621, 61679, 9837, 11837, 61384, 31281, 41746, 43402, 29997, 59351, 15521, 13160, 61571, 24825, 46613, 48840, 32759, 59930, 13274, 14762, 50522, 38909}, (ViewConfiguration.getTapTimeout() >> i16) + i9, objArr10);
                Class<?> cls4 = Class.forName((String) objArr10[i12]);
                char[] cArr3 = {54135, 54046, 2253, 59879, 56915, 7343, 46635, 4673, 22119, 36659, 38451, 40737};
                int i27 = -(Process.myTid() >> 22);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i28 = i27 * 624;
                int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
                int i30 = i29 % 128;
                TuitionPaymentFragmentbindingInflater1 = i30;
                int i31 = i29 % 2;
                int i32 = ((-2) ^ i27) | ((-2) & i27);
                int i33 = (i28 ^ (-622)) + ((i28 & (-622)) << i9) + ((~((i32 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i32 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1))) * 623);
                int i34 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i35 = (i30 ^ 63) + ((i30 & 63) << 1);
                Method[] methodArr2 = declaredMethods;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i35 % 128;
                int i36 = i35 % 2;
                int i37 = ~i27;
                int i38 = ~((i37 & 1) | (i37 ^ 1));
                int i39 = i33 + ((-623) * ((i38 & i34) | (i34 ^ i38)));
                int i40 = ~((-2) | i27);
                int i41 = i30 + 103;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i41 % 128;
                int i42 = i41 % 2;
                int i43 = ~((-2) | iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i44 = (i40 ^ i43) | (i40 & i43);
                int i45 = ~((i27 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i27 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                int i46 = -(-(623 * ((i44 & i45) | (i44 ^ i45))));
                int i47 = (i39 & i46) + (i39 | i46);
                Object[] objArr11 = new Object[1];
                c(cArr3, i47, objArr11);
                if (((Boolean) cls4.getMethod((String) objArr11[0], Integer.TYPE).invoke(null, objArr9)).booleanValue()) {
                    int i48 = TuitionPaymentFragmentbindingInflater1;
                    int i49 = (i48 ^ 11) + ((i48 & 11) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i49 % 128;
                    int i50 = i49 % 2;
                    Class cls5 = Long.TYPE;
                    Object[] objArr12 = new Object[1];
                    c(new char[]{18383, 18341, 27009, 35001, 45614, 28906, 35773, 12247, 49797, 61032, 64089, 41660, 19808, 25782, 32550, 9483, 55173, 63824, 57493, 49129, 21035, 32382, 27169, 12867, 56655, 62620, 61415, 46374}, -TextUtils.indexOf((CharSequence) "", '0', 0), objArr12);
                    Class<?> cls6 = Class.forName((String) objArr12[0]);
                    int i51 = -View.resolveSize(0, 0);
                    int i52 = (i51 & 1) + (i51 | 1);
                    Object[] objArr13 = new Object[1];
                    c(new char[]{58631, 58720, 42838, 18026, 43897, 27071, 2958, 45015, 24582, 8355, 58138, 8851, 61345, 43551, 26234, 42285, 30030}, i52, objArr13);
                    if (cls5.equals(cls6.getMethod((String) objArr13[0], null).invoke(method2, null))) {
                        Object[] objArr14 = new Object[1];
                        c(new char[]{18383, 18341, 27009, 35001, 45614, 28906, 35773, 12247, 49797, 61032, 64089, 41660, 19808, 25782, 32550, 9483, 55173, 63824, 57493, 49129, 21035, 32382, 27169, 12867, 56655, 62620, 61415, 46374}, -MotionEvent.axisFromString(""), objArr14);
                        Class<?> cls7 = Class.forName((String) objArr14[0]);
                        int iMyPid = Process.myPid() >> 22;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i53 = iMyPid * (-575);
                        int i54 = (i53 ^ (-575)) + ((i53 & (-575)) << 1);
                        int i55 = ~iMyPid;
                        int i56 = ~((i55 ^ (-2)) | (i55 & (-2)));
                        int i57 = ~(((-2) & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | ((-2) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                        int i58 = (i54 - (~(-(-(((i57 & i56) | (i56 ^ i57)) * 576))))) - 1;
                        int i59 = ~(i55 | 1);
                        int i60 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i61 = ~(((-2) & i60) | ((-2) ^ i60) | iMyPid);
                        int i62 = ((i59 & i61) | (i59 ^ i61)) * 576;
                        int i63 = (i58 ^ i62) + ((i62 & i58) << 1);
                        int i64 = ~iMyPid;
                        Object[] objArr15 = new Object[1];
                        c(new char[]{32316, 32347, 4376, 61476, 9682, 59156, 45517, 5526, 64313, 38635, 28069, 39119, 29841, 7281, 59597, 8044, 60996, 33240, 30588, 34207, 27615}, (i63 - (~((~((i64 & (-2)) | (i64 ^ (-2)))) * 576))) - 1, objArr15);
                        Object[] objArr16 = (Object[]) cls7.getMethod((String) objArr15[0], null).invoke(method2, null);
                        if (objArr16.length == 2 && Long.TYPE.equals(objArr16[0])) {
                            i6 = 28;
                            Object[] objArr17 = new Object[1];
                            c(new char[]{18383, 18341, 27009, 35001, 45614, 28906, 35773, 12247, 49797, 61032, 64089, 41660, 19808, 25782, 32550, 9483, 55173, 63824, 57493, 49129, 21035, 32382, 27169, 12867, 56655, 62620, 61415, 46374}, -ExpandableListView.getPackedPositionChild(0L), objArr17);
                            Class<?> cls8 = Class.forName((String) objArr17[0]);
                            int i65 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i66 = ((i65 | 85) << 1) - (i65 ^ 85);
                            TuitionPaymentFragmentbindingInflater1 = i66 % 128;
                            int i67 = i66 % 2;
                            if (cls8.equals(objArr16[1])) {
                                int i68 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i69 = (i68 ^ 109) + ((i68 & 109) << 1);
                                TuitionPaymentFragmentbindingInflater1 = i69 % 128;
                                int i70 = i69 % 2;
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char c2 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 2823;
                                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 22;
                                    byte[] bArr4 = $$d;
                                    byte b13 = bArr4[54];
                                    byte b14 = bArr4[7];
                                    Object[] objArr18 = new Object[1];
                                    b(b13, b14, b14, objArr18);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, packedPositionType, longPressTimeout, 1814927978, false, (String) objArr18[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                                    int trimmedLength = 2823 - TextUtils.getTrimmedLength("");
                                    int threadPriority = 22 - ((Process.getThreadPriority(0) + 20) >> 6);
                                    byte[] bArr5 = $$d;
                                    byte b15 = bArr5[54];
                                    byte b16 = bArr5[7];
                                    Object[] objArr19 = new Object[1];
                                    b(b15, b16, b16, objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMakeMeasureSpec, trimmedLength, threadPriority, 1814927978, false, (String) objArr19[0], null);
                                }
                                try {
                                    Object[] objArr20 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        char cMakeMeasureSpec2 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2823;
                                        int mirror = AndroidCharacter.getMirror('0') - 26;
                                        byte[] bArr6 = $$d;
                                        byte b17 = bArr6[7];
                                        byte b18 = (byte) (-bArr6[5]);
                                        Object[] objArr21 = new Object[1];
                                        b(b17, b18, b18, objArr21);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMakeMeasureSpec2, iNormalizeMetaState, mirror, -2137287382, false, (String) objArr21[0], new Class[]{Long.TYPE, Method.class});
                                    }
                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr20)).longValue();
                                    i = -2001519171;
                                    break;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            }
                        } else {
                            i6 = 28;
                        }
                    } else {
                        i6 = 28;
                    }
                } else {
                    i6 = 28;
                }
                i20++;
                int i71 = TuitionPaymentFragmentbindingInflater1;
                int i72 = (i71 ^ 45) + ((i71 & 45) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i72 % 128;
                int i73 = i72 % 2;
                i11 = i6;
                declaredMethods = methodArr2;
                i9 = 1;
                clsArr2 = null;
                i12 = 0;
                i15 = -2001519171;
                i16 = 16;
                j = 0;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int packedPositionType2 = 2823 - ExpandableListView.getPackedPositionType(0L);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 23;
            byte[] bArr7 = $$d;
            byte b19 = bArr7[54];
            byte b20 = bArr7[7];
            Object[] objArr22 = new Object[1];
            b(b19, b20, b20, objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop, packedPositionType2, iLastIndexOf, 1814927978, false, (String) objArr22[0], null);
        }
        Object[] objArr23 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
            int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 2823;
            int i74 = 23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            byte[] bArr8 = $$d;
            byte b21 = (byte) (bArr8[51] - 1);
            byte b22 = (byte) (-bArr8[5]);
            Object[] objArr24 = new Object[1];
            b(b21, b22, b22, objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, touchSlop2, i74, 1025296417, false, (String) objArr24[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr23);
        Object[] objArr25 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37657);
            int iBlue = Color.blue(0) + 2720;
            int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 19;
            byte[] bArr9 = $$d;
            byte b23 = (byte) (bArr9[51] - 1);
            byte b24 = (byte) (-bArr9[5]);
            Object[] objArr26 = new Object[1];
            b(b23, b24, b24, objArr26);
            i2 = 0;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(maximumFlingVelocity, iBlue, packedPositionType3, -1568796068, false, (String) objArr26[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        } else {
            i2 = 0;
        }
        String string = null;
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr25)).longValue();
        long j2 = 171743432;
        long j3 = (((long) 784) * j2) + (((long) (-782)) * jLongValue);
        long j4 = -783;
        long j5 = -1;
        long j6 = j2 ^ j5;
        long j7 = ((long) ((int) Runtime.getRuntime().totalMemory())) ^ j5;
        long j8 = j3 + ((jLongValue ^ j5) * j4) + (j4 * (((j6 | j7) | jLongValue) ^ j5)) + (((long) 783) * (((j7 | jLongValue) ^ j5) | j6)) + ((long) (-1982149277));
        int i75 = ~new Random().nextInt();
        int i76 = ((int) (j8 >> 32)) & ((-1019427974) + (((~(i75 | (-340787593))) | (~(2147463135 | i75))) * (-184)) + ((1621950977 | (~(525512158 | i75)) | (~((-1962738570) | i75))) * 184) + 370418040);
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i77 = ((int) j8) & ((((~(1554537316 | startUptimeMillis)) * TypedValues.CycleType.TYPE_EASING) - 361654647) + (((~((~startUptimeMillis) | 1554537316)) | 1286097504) * TypedValues.CycleType.TYPE_EASING));
        int i78 = (i76 & i77) | (i76 ^ i77);
        int i79 = i78 >>> 24;
        int i80 = i78 & ViewCompat.MEASURED_SIZE_MASK;
        if (i79 != 0) {
            getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            i3 = 1;
        } else {
            i3 = i2;
        }
        if ((i3 ^ 1) != 1) {
            i2 = 1;
        }
        if (i3 != 0) {
            int i81 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i82 = (i81 & 43) + (i81 | 43);
            TuitionPaymentFragmentbindingInflater1 = i82 % 128;
            int i83 = i82 % 2;
            if (i80 < methodArr.length && (method = methodArr[i80]) != null) {
                string = method.toString();
            }
        }
        list.add(string);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i84 = i79 * 471;
        int i85 = TuitionPaymentFragmentbindingInflater1;
        int i86 = i85 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i86 % 128;
        int i87 = i86 % 2 != 0 ? 1416 << i84 : ((i84 & 1416) << 1) + (1416 ^ i84);
        int i88 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i89 = (i88 & (-7)) | ((-7) ^ i88);
        int i90 = i85 + 9;
        int i91 = i90 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i91;
        if (i90 % 2 != 0) {
            int i92 = ~i89;
            int i93 = -(-((-236) - (~(-((i92 & i79) | (i79 ^ i92))))));
            i4 = (i87 & i93) + (i87 | i93);
            i5 = ((-7) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-7) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else {
            int i94 = ~i89;
            int i95 = (-235) * ((i94 & i79) | (i79 ^ i94));
            i4 = ((i87 | i95) << 1) - (i87 ^ i95);
            i5 = (-7) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int i96 = -(-((-470) * ((~i5) | i79)));
        int i97 = (i4 ^ i96) + ((i96 & i4) << 1);
        int i98 = ~((~i79) | 6);
        int i99 = (i79 & (-7)) | ((-7) ^ i79);
        int i100 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i99) | (i99 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
        int i101 = i91 + 7;
        TuitionPaymentFragmentbindingInflater1 = i101 % 128;
        int i102 = i97 + (((i100 & i98) | (i98 ^ i100)) * 235);
        return i101 % 2 == 0 ? (i102 - (~(-(-i2)))) - 1 : i102 * i2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r5, int r6, byte r7) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r5 = r5 * 3
            int r5 = r5 + 1
            int r7 = r7 * 2
            int r7 = r7 + 107
            byte[] r0 = defpackage.isEosSignalledAndStopTimeReached.$$c
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            r4 = r0[r6]
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            int r6 = r6 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isEosSignalledAndStopTimeReached.$$g(int, int, byte):java.lang.String");
    }
}
