package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdasnapshot7 implements lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor {
    private checkReadyToRelease asBinder;
    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 asInterface = new TuitionPaymentFragmentspecialinlinedviewModeldefault3() { // from class: lambdasnapshot7.2
        @Override // lambdasnapshot7.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final TuitionPaymentFragmentspecialinlinedviewModeldefault3 b(checkReadyToRelease checkreadytorelease, AutoValue_Packet autoValue_Packet) {
            lambdasnapshot7.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(null);
            return null;
        }
    };
    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3() { // from class: lambdasnapshot7.4
        @Override // lambdasnapshot7.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final TuitionPaymentFragmentspecialinlinedviewModeldefault3 b(checkReadyToRelease checkreadytorelease, AutoValue_Packet autoValue_Packet) {
            ArrayList arrayList = lambdasnapshot7.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            byte b2 = autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1).get();
            autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2--;
            arrayList.add(Byte.valueOf(b2));
            return null;
        }
    };
    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 notify = new TuitionPaymentFragmentspecialinlinedviewModeldefault3() { // from class: lambdasnapshot7.3
        @Override // lambdasnapshot7.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final TuitionPaymentFragmentspecialinlinedviewModeldefault3 b(checkReadyToRelease checkreadytorelease, AutoValue_Packet autoValue_Packet) {
            ArrayList arrayList = lambdasnapshot7.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            short s = autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2).getShort();
            autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 -= 2;
            arrayList.add(Short.valueOf(s));
            return null;
        }
    };
    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 d = new TuitionPaymentFragmentspecialinlinedviewModeldefault3() { // from class: lambdasnapshot7.1
        @Override // lambdasnapshot7.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final TuitionPaymentFragmentspecialinlinedviewModeldefault3 b(checkReadyToRelease checkreadytorelease, AutoValue_Packet autoValue_Packet) {
            ArrayList arrayList = lambdasnapshot7.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i = autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(4).getInt();
            autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 -= 4;
            arrayList.add(Integer.valueOf(i));
            return null;
        }
    };
    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 g = new TuitionPaymentFragmentspecialinlinedviewModeldefault3() { // from class: lambdasnapshot7.5
        private static final byte[] $$c = {1, -81, 2, 79};
        private static final int $$d = 169;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {101, 89, 94, -73, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 113;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;
        private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {-2118999916, 1399345994, 815278558, -1231591769, 56076509, -1454870145, -1003215175, 639126815, -1822411107, -1641778696, 1913671219, 79161547, -427095912, -336259773, -2081020422, -1697100534, -586106631, 1173935047};

        private static void c(int i, byte b2, int i2, Object[] objArr) {
            byte[] bArr = $$a;
            int i3 = 98 - (i * 14);
            int i4 = i2 + 4;
            byte[] bArr2 = new byte[b2 + 1];
            int i5 = -1;
            if (bArr == null) {
                i4++;
                i3 = (b2 + i3) - 11;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i3;
                if (i5 == b2) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    byte b3 = bArr[i4];
                    i4++;
                    i3 = (i3 + b3) - 11;
                }
            }
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int i2;
            int i3 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i4 = -1870535734;
            long j = 0;
            float f = 0.0f;
            int i5 = 1;
            int i6 = 0;
            if (iArr3 != null) {
                int i7 = $11 + 99;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i2 = 1;
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i2 = 0;
                }
                while (i2 < length) {
                    int i8 = $11 + 99;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i2])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char c = (char) (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1));
                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(j) + 3291;
                            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 31;
                            byte b2 = $$c[0];
                            byte b3 = (byte) (b2 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, packedPositionGroup, pressedStateDuration, 1948206109, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        iArr2[i2] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        i2++;
                        i4 = -1870535734;
                        j = 0;
                        f = 0.0f;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i10 = 0;
                while (i10 < length3) {
                    int i11 = $10 + 77;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    try {
                        Object[] objArr3 = new Object[i5];
                        objArr3[i6] = Integer.valueOf(iArr5[i10]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
                            int offsetBefore = TextUtils.getOffsetBefore("", i6) + 3291;
                            int windowTouchSlop = 31 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            byte b4 = $$c[i6];
                            byte b5 = (byte) (b4 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionGroup2, offsetBefore, windowTouchSlop, 1948206109, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        iArr6[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i10++;
                        iArr5 = iArr5;
                        i5 = 1;
                        i6 = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                iArr5 = iArr6;
            }
            int i13 = i6;
            System.arraycopy(iArr5, i13, iArr4, i13, length2);
            sessionConfigValidatingBuilder.b = 2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                cArr[i13] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                int i14 = 17;
                for (int i15 = 1; i14 > i15; i15 = 1) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i14];
                    Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                        int iResolveSizeAndState = 2559 - View.resolveSizeAndState(0, 0, 0);
                        int i16 = 30 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        byte b6 = (byte) ($$c[0] - 1);
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iResolveSizeAndState, i16, 683220507, false, $$e(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i14--;
                    int i17 = $11 + 33;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                }
                int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i20 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr5 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (28878 - TextUtils.lastIndexOf("", '0', 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 348, 25 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
                cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                sessionConfigValidatingBuilder.b += 2;
                i13 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
            int i21 = $11 + 85;
            $10 = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = 60 / 0;
            }
        }

        @Override // lambdasnapshot7.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final TuitionPaymentFragmentspecialinlinedviewModeldefault3 b(checkReadyToRelease checkreadytorelease, AutoValue_Packet autoValue_Packet) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            ArrayList arrayList = lambdasnapshot7.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            long j = autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(8).getLong();
            autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 -= 8;
            arrayList.add(Long.valueOf(j));
            int i4 = TuitionPaymentFragmentbindingInflater1 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0205 A[PHI: r20
  0x0205: PHI (r20v2 int) = (r20v1 int), (r20v15 int) binds: [B:27:0x01af, B:32:0x0202] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:36:0x020b  */
        /* JADX WARN: Code duplicated, block: B:39:0x0216 A[Catch: Exception -> 0x0459, TRY_LEAVE, TryCatch #3 {Exception -> 0x0459, blocks: (B:37:0x0210, B:39:0x0216, B:45:0x0276), top: B:99:0x0210 }] */
        /* JADX WARN: Code duplicated, block: B:42:0x022f  */
        /* JADX WARN: Code duplicated, block: B:43:0x0235  */
        /* JADX WARN: Code duplicated, block: B:48:0x028c A[Catch: all -> 0x035b, TryCatch #5 {all -> 0x035b, blocks: (B:46:0x027f, B:48:0x028c, B:49:0x02d0), top: B:103:0x027f, outer: #2 }] */
        /* JADX WARN: Code duplicated, block: B:57:0x0366 A[Catch: Exception -> 0x045b, TRY_LEAVE, TryCatch #2 {Exception -> 0x045b, blocks: (B:51:0x0317, B:53:0x035c, B:55:0x0364, B:56:0x0365, B:57:0x0366, B:59:0x03dc, B:64:0x0438, B:71:0x0451, B:73:0x0457, B:74:0x0458, B:60:0x03e6, B:62:0x03f3, B:63:0x0431, B:46:0x027f, B:48:0x028c, B:49:0x02d0), top: B:98:0x0214, inners: #0, #5 }] */
        /* JADX WARN: Code duplicated, block: B:62:0x03f3 A[Catch: all -> 0x0450, TryCatch #0 {all -> 0x0450, blocks: (B:60:0x03e6, B:62:0x03f3, B:63:0x0431), top: B:94:0x03e6, outer: #2 }] */
        /* JADX WARN: Code duplicated, block: B:66:0x043e  */
        /* JADX WARN: Code duplicated, block: B:69:0x044e  */
        /* JADX WARN: Code duplicated, block: B:76:0x045b A[PHI: r20
  0x045b: PHI (r20v7 int) = (r20v6 int), (r20v9 int), (r20v10 int), (r20v10 int) binds: [B:75:0x0459, B:93:0x045b, B:65:0x043c, B:67:0x044b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:99:0x0210 A[EXC_TOP_SPLITTER, PHI: r20
  0x0210: PHI (r20v5 int) = (r20v2 int), (r20v15 int) binds: [B:35:0x0209, B:32:0x0202] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2, int i3) throws Throwable {
            int i4;
            int iRgb;
            int i5;
            int i6;
            String str;
            Object[] objArr;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i7;
            int iResolveSizeAndState;
            int i8;
            int i9;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i10 = 2 % 2;
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i12 = (i11 ^ 81) + ((i11 & 81) << 1);
            int i13 = i12 % 128;
            TuitionPaymentFragmentbindingInflater1 = i13;
            int i14 = i12 % 2;
            int i15 = i13 + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
            int i16 = i15 % 2;
            if (context != null) {
                try {
                    Object[] objArr2 = new Object[1];
                    a(new int[]{-1328199129, 198868075, -487373563, 1146720064, 2141337243, -1386970969, -350469703, 466978403, -1899305124, -287074476, 1407723242, -1974204030, -1902831915, -1532974935}, 23 - KeyEvent.getDeadChar(0, 0), objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    int[] iArr = {-1504309782, 103596380, 871037420, 1618803364, -788940371, -91677860, -2111172393, -1818276634, 900422297, 1762980318, 776946732, -969825758};
                    int iRed = Color.red(0);
                    int i17 = TuitionPaymentFragmentbindingInflater1;
                    int i18 = ((i17 | 111) << 1) - (i17 ^ 111);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                    int i19 = i18 % 2;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i20 = iRed * (-500);
                    int i21 = (i20 ^ (-9000)) + ((i20 & (-9000)) << 1);
                    int i22 = ~((-19) | iRed);
                    int i23 = ~iRed;
                    int i24 = (i23 ^ 18) | (i23 & 18);
                    int i25 = i21 + (((~((i24 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i24 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2))) | i22) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
                    int i26 = TuitionPaymentFragmentbindingInflater1 + 27;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i26 % 128;
                    int i27 = i26 % 2;
                    int i28 = 1002 * (~(i23 | (-19)));
                    int i29 = (((i25 | i28) << 1) - (i28 ^ i25)) + ((~((~iRed) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | 18)) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
                    Object[] objArr3 = new Object[1];
                    a(iArr, i29, objArr3);
                    String str2 = (String) objArr3[0];
                    int i30 = TuitionPaymentFragmentbindingInflater1 + 65;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i30 % 128;
                    int i31 = i30 % 2;
                    Object objInvoke = cls.getMethod(str2, null).invoke(context, null);
                    int i32 = -Color.rgb(0, 0, 0);
                    int i33 = (i32 & (-16777182)) + (i32 | (-16777182));
                    Object[] objArr4 = new Object[1];
                    a(new int[]{-1397190001, -224768905, -312952530, 393152557, 1874328999, -1828138249, -1129261661, -886024046, 248792165, -1729257913, 1797541973, -1076055690, 931758223, 359096887, 1447961662, 832647776, -570011929, 1734807301, 295742717, -687686624}, i33, objArr4);
                    Class<?> cls2 = Class.forName((String) objArr4[0]);
                    Object[] objArr5 = new Object[1];
                    a(new int[]{-985424221, -1170582761, -1039923584, 1785837966, 1473717265, -968032503}, Color.green(0) + 5, objArr5);
                    int i34 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                    int i35 = (~(i & 1)) & (i | 1);
                    int i36 = -i34;
                    int i37 = ((i34 & i36) | (i34 ^ i36)) >> 31;
                    int i38 = (~i37) & i;
                    int i39 = i37 & i35;
                    i4 = (i39 & i38) | (i38 ^ i39);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                i4 = i;
            }
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 16950);
                    int iResolveSize = View.resolveSize(0, 0) + 2739;
                    int i40 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13;
                    byte[] bArr = $$a;
                    short s = bArr[7];
                    Object[] objArr6 = new Object[1];
                    c(bArr[132], (byte) 52, s, objArr6);
                    iRgb = iResolveSize;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionChild, iRgb, i40, 1501733736, false, (String) objArr6[0], new Class[0]);
                }
                Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 16950);
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2739;
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 14;
                    byte b2 = (byte) 52;
                    Object[] objArr7 = new Object[1];
                    c($$a[132], b2, b2, objArr7);
                    iRgb = keyRepeatDelay;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask, iRgb, iLastIndexOf, 47863026, false, (String) objArr7[0], null);
                }
                if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null))) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16948);
                        int absoluteGravity = 2739 - Gravity.getAbsoluteGravity(0, 0);
                        int tapTimeout = 13 - (ViewConfiguration.getTapTimeout() >> 16);
                        byte b3 = $$a[132];
                        Object[] objArr8 = new Object[1];
                        c(b3, (byte) (b3 | 36), (short) 104, objArr8);
                        iRgb = absoluteGravity;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iRgb, tapTimeout, 631063962, false, (String) objArr8[0], null);
                    }
                    if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                        if (Build.VERSION.SDK_INT > 33) {
                            int[] iArr2 = {1118647732, 1904810124, -1852885675, -18340329, 2140268180, 1364416802, 1735583951, -968482880, 1663677871, -1296174683, -474624239, -1575301399, 843261072, -1716972790, 1112297725, 338002669};
                            iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i8 = i41 + 113;
                            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                            if (i8 % 2 == 0) {
                                i9 = (367 << iResolveSizeAndState) * 395;
                            } else {
                                int i42 = iResolveSizeAndState * 367;
                                i9 = (i42 | 10276) + (i42 & 10276);
                            }
                            int i43 = (-366) * (iResolveSizeAndState | 28);
                            int i44 = ((i9 | i43) << 1) - (i9 ^ i43);
                            int i45 = (i41 ^ 75) + ((i41 & 75) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i45 % 128;
                            int i46 = i45 % 2;
                            int i47 = ~((-29) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            int i48 = i44 + ((-366) * ((i47 & iResolveSizeAndState) | (iResolveSizeAndState ^ i47)));
                            int i49 = ~((~iResolveSizeAndState) | 28);
                            int i50 = (iResolveSizeAndState & (-29)) | ((-29) ^ iResolveSizeAndState);
                            int i51 = ~((i50 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i50 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            int i52 = ((i51 & i49) | (i49 ^ i51)) * 366;
                            int i53 = (i48 & i52) + (i52 | i48);
                            Object[] objArr9 = new Object[1];
                            a(iArr2, i53, objArr9);
                            Object[] objArr10 = {(String) objArr9[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                                iRgb = (-16776223) - Color.rgb(0, 0, 0);
                                int i54 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7;
                                byte b4 = $$a[7];
                                byte b5 = b4;
                                Object[] objArr11 = new Object[1];
                                c(b4, b5, (short) (b5 | 141), objArr11);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iRgb, i54, 410748506, false, (String) objArr11[0], new Class[]{String.class});
                            }
                            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr10)).longValue();
                            long j = 1489155190;
                            long j2 = (((long) 784) * j) + (((long) (-782)) * jLongValue);
                            long j3 = -783;
                            iRgb = i4;
                            long j4 = -1;
                            long j5 = j ^ j4;
                            long j6 = ((long) i) ^ j4;
                            long j7 = j2 + ((jLongValue ^ j4) * j3) + (j3 * (((j5 | j6) | jLongValue) ^ j4)) + (((long) 783) * ((j4 ^ (j6 | jLongValue)) | j5)) + ((long) (-1690073427));
                            int i55 = (int) (j7 >> 32);
                            int iMyUid = Process.myUid();
                            int i56 = ~iMyUid;
                            int i57 = (~((-1964044152) | i56)) | 352356676;
                            int i58 = ~(iMyUid | 2138505215);
                            int i59 = i55 & ((-694705138) + ((i57 | i58) * (-713)) + (i58 * 1426) + ((~(526817740 | i56)) * 713));
                            int i60 = ((int) j7) & ((((~((-325207400) | i)) * TypedValues.CycleType.TYPE_EASING) - 1215304711) + (((~((-325207400) | (~i))) | (-1399477608)) * TypedValues.CycleType.TYPE_EASING));
                            i6 = (i59 & i60) | (i59 ^ i60);
                        } else {
                            iRgb = i4;
                            Object[] objArr12 = new Object[1];
                            a(new int[]{1499568684, 907371328, 37889824, -1217522922}, 0 - (~(ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr12);
                            str = (String) objArr12[0];
                            int[] iArr3 = {-494263075, 1627828977, -591065227, -136598865, -358091050, -114649404, -538919335, 1988336222, 808894243, 1862538481};
                            int iArgb = Color.argb(0, 0, 0, 0);
                            int i61 = (iArgb * (-433)) - 2808;
                            int i62 = ~iArgb;
                            int i63 = ~i;
                            int i64 = ~(i62 | i63);
                            int i65 = ~(((-14) ^ i) | ((-14) & i));
                            int i66 = ((i64 & i65) | (i64 ^ i65)) * 217;
                            int i67 = (i61 ^ i66) + ((i61 & i66) << 1);
                            int i68 = ~iArgb;
                            int i69 = ~((i68 & (-14)) | (i68 ^ (-14)));
                            int i70 = ~(i62 | i);
                            int i71 = i67 + (((i69 & i70) | (i69 ^ i70)) * 217);
                            int i72 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i73 = (i72 & 53) + (i72 | 53);
                            TuitionPaymentFragmentbindingInflater1 = i73 % 128;
                            int i74 = i73 % 2;
                            int i75 = ~((-14) | i63);
                            int i76 = i71 + (217 * ((i75 & iArgb) | (iArgb ^ i75)));
                            Object[] objArr13 = new Object[1];
                            a(iArr3, i76, objArr13);
                            objArr = new Object[]{(String) objArr13[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 33603);
                                int maxKeyCode = 3085 - (KeyEvent.getMaxKeyCode() >> 16);
                                int absoluteGravity2 = 26 - Gravity.getAbsoluteGravity(0, 0);
                                byte b6 = $$a[7];
                                byte b7 = b6;
                                Object[] objArr14 = new Object[1];
                                c(b6, b7, (short) (b7 | 141), objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, maxKeyCode, absoluteGravity2, 1411172903, false, (String) objArr14[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                int i77 = TuitionPaymentFragmentbindingInflater1;
                                i7 = (i77 & 99) + (i77 | 99);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                                if (i7 % 2 != 0) {
                                    i6 = 0;
                                } else {
                                    i6 = 1;
                                }
                            } else {
                                i6 = 0;
                            }
                        }
                        int i78 = (~(i & 10)) & (i | 10);
                        int i79 = -i6;
                        int i80 = ((i6 & i79) | (i6 ^ i79)) >> 31;
                        int i81 = (~i80) & i;
                        int i82 = i80 & i78;
                        int i83 = (i82 & i81) | (i81 ^ i82);
                        int i84 = i2 & 32;
                        int i85 = -i84;
                        int i86 = ((i84 & i85) | (i84 ^ i85)) >> 31;
                        i5 = (i83 & (~i86)) | (i86 & i);
                    } else if (Build.VERSION.SDK_INT == 30) {
                        i5 = i;
                        iRgb = i4;
                    } else {
                        if (Build.VERSION.SDK_INT > 33) {
                            int[] iArr4 = {1118647732, 1904810124, -1852885675, -18340329, 2140268180, 1364416802, 1735583951, -968482880, 1663677871, -1296174683, -474624239, -1575301399, 843261072, -1716972790, 1112297725, 338002669};
                            iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i410 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i8 = i410 + 113;
                            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                            if (i8 % 2 == 0) {
                                i9 = (367 << iResolveSizeAndState) * 395;
                            } else {
                                int i411 = iResolveSizeAndState * 367;
                                i9 = (i411 | 10276) + (i411 & 10276);
                            }
                            int i412 = (-366) * (iResolveSizeAndState | 28);
                            int i413 = ((i9 | i412) << 1) - (i9 ^ i412);
                            int i414 = (i410 ^ 75) + ((i410 & 75) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i414 % 128;
                            int i415 = i414 % 2;
                            int i416 = ~((-29) | iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                            int i417 = i413 + ((-366) * ((i416 & iResolveSizeAndState) | (iResolveSizeAndState ^ i416)));
                            int i418 = ~((~iResolveSizeAndState) | 28);
                            int i510 = (iResolveSizeAndState & (-29)) | ((-29) ^ iResolveSizeAndState);
                            int i511 = ~((i510 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i510 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                            int i512 = ((i511 & i418) | (i418 ^ i511)) * 366;
                            int i513 = (i417 & i512) + (i512 | i417);
                            Object[] objArr15 = new Object[1];
                            a(iArr4, i513, objArr15);
                            Object[] objArr16 = {(String) objArr15[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                                iRgb = (-16776223) - Color.rgb(0, 0, 0);
                                int i514 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7;
                                byte b8 = $$a[7];
                                byte b9 = b8;
                                Object[] objArr17 = new Object[1];
                                c(b8, b9, (short) (b9 | 141), objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, iRgb, i514, 410748506, false, (String) objArr17[0], new Class[]{String.class});
                            }
                            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr16)).longValue();
                            long j8 = 1489155190;
                            long j9 = (((long) 784) * j8) + (((long) (-782)) * jLongValue2);
                            long j10 = -783;
                            iRgb = i4;
                            long j11 = -1;
                            long j12 = j8 ^ j11;
                            long j13 = ((long) i) ^ j11;
                            long j14 = j9 + ((jLongValue2 ^ j11) * j10) + (j10 * (((j12 | j13) | jLongValue2) ^ j11)) + (((long) 783) * ((j11 ^ (j13 | jLongValue2)) | j12)) + ((long) (-1690073427));
                            int i515 = (int) (j14 >> 32);
                            int iMyUid2 = Process.myUid();
                            int i516 = ~iMyUid2;
                            int i517 = (~((-1964044152) | i516)) | 352356676;
                            int i518 = ~(iMyUid2 | 2138505215);
                            int i519 = i515 & ((-694705138) + ((i517 | i518) * (-713)) + (i518 * 1426) + ((~(526817740 | i516)) * 713));
                            int i610 = ((int) j14) & ((((~((-325207400) | i)) * TypedValues.CycleType.TYPE_EASING) - 1215304711) + (((~((-325207400) | (~i))) | (-1399477608)) * TypedValues.CycleType.TYPE_EASING));
                            i6 = (i519 & i610) | (i519 ^ i610);
                        } else {
                            iRgb = i4;
                            Object[] objArr18 = new Object[1];
                            a(new int[]{1499568684, 907371328, 37889824, -1217522922}, 0 - (~(ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr18);
                            str = (String) objArr18[0];
                            int[] iArr5 = {-494263075, 1627828977, -591065227, -136598865, -358091050, -114649404, -538919335, 1988336222, 808894243, 1862538481};
                            int iArgb2 = Color.argb(0, 0, 0, 0);
                            int i611 = (iArgb2 * (-433)) - 2808;
                            int i612 = ~iArgb2;
                            int i613 = ~i;
                            int i614 = ~(i612 | i613);
                            int i615 = ~(((-14) ^ i) | ((-14) & i));
                            int i616 = ((i614 & i615) | (i614 ^ i615)) * 217;
                            int i617 = (i611 ^ i616) + ((i611 & i616) << 1);
                            int i618 = ~iArgb2;
                            int i619 = ~((i618 & (-14)) | (i618 ^ (-14)));
                            int i710 = ~(i612 | i);
                            int i711 = i617 + (((i619 & i710) | (i619 ^ i710)) * 217);
                            int i712 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i713 = (i712 & 53) + (i712 | 53);
                            TuitionPaymentFragmentbindingInflater1 = i713 % 128;
                            int i714 = i713 % 2;
                            int i715 = ~((-14) | i613);
                            int i716 = i711 + (217 * ((i715 & iArgb2) | (iArgb2 ^ i715)));
                            Object[] objArr19 = new Object[1];
                            a(iArr5, i716, objArr19);
                            objArr = new Object[]{(String) objArr19[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 33603);
                                int maxKeyCode2 = 3085 - (KeyEvent.getMaxKeyCode() >> 16);
                                int absoluteGravity3 = 26 - Gravity.getAbsoluteGravity(0, 0);
                                byte b10 = $$a[7];
                                byte b11 = b10;
                                Object[] objArr110 = new Object[1];
                                c(b10, b11, (short) (b11 | 141), objArr110);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf2, maxKeyCode2, absoluteGravity3, 1411172903, false, (String) objArr110[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                int i717 = TuitionPaymentFragmentbindingInflater1;
                                i7 = (i717 & 99) + (i717 | 99);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                                if (i7 % 2 != 0) {
                                    i6 = 0;
                                } else {
                                    i6 = 1;
                                }
                            } else {
                                i6 = 0;
                            }
                        }
                        int i718 = (~(i & 10)) & (i | 10);
                        int i719 = -i6;
                        int i87 = ((i6 & i719) | (i6 ^ i719)) >> 31;
                        int i88 = (~i87) & i;
                        int i89 = i87 & i718;
                        int i810 = (i89 & i88) | (i88 ^ i89);
                        int i811 = i2 & 32;
                        int i812 = -i811;
                        int i813 = ((i811 & i812) | (i811 ^ i812)) >> 31;
                        i5 = (i810 & (~i813)) | (i813 & i);
                    }
                } else if (Build.VERSION.SDK_INT == 30) {
                    i5 = i;
                    iRgb = i4;
                } else {
                    try {
                        try {
                            if (Build.VERSION.SDK_INT > 33) {
                                int[] iArr6 = {1118647732, 1904810124, -1852885675, -18340329, 2140268180, 1364416802, 1735583951, -968482880, 1663677871, -1296174683, -474624239, -1575301399, 843261072, -1716972790, 1112297725, 338002669};
                                iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i419 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i8 = i419 + 113;
                                TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                                if (i8 % 2 == 0) {
                                    i9 = (367 << iResolveSizeAndState) * 395;
                                } else {
                                    int i4110 = iResolveSizeAndState * 367;
                                    i9 = (i4110 | 10276) + (i4110 & 10276);
                                }
                                int i4111 = (-366) * (iResolveSizeAndState | 28);
                                int i4112 = ((i9 | i4111) << 1) - (i9 ^ i4111);
                                int i4113 = (i419 ^ 75) + ((i419 & 75) << 1);
                                TuitionPaymentFragmentbindingInflater1 = i4113 % 128;
                                int i4114 = i4113 % 2;
                                int i4115 = ~((-29) | iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
                                int i4116 = i4112 + ((-366) * ((i4115 & iResolveSizeAndState) | (iResolveSizeAndState ^ i4115)));
                                int i4117 = ~((~iResolveSizeAndState) | 28);
                                int i5110 = (iResolveSizeAndState & (-29)) | ((-29) ^ iResolveSizeAndState);
                                int i5111 = ~((i5110 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i5110 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                int i5112 = ((i5111 & i4117) | (i4117 ^ i5111)) * 366;
                                int i5113 = (i4116 & i5112) + (i5112 | i4116);
                                Object[] objArr111 = new Object[1];
                                a(iArr6, i5113, objArr111);
                                try {
                                    Object[] objArr112 = {(String) objArr111[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char c4 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                                        iRgb = (-16776223) - Color.rgb(0, 0, 0);
                                        int i5114 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7;
                                        byte b12 = $$a[7];
                                        byte b13 = b12;
                                        Object[] objArr113 = new Object[1];
                                        c(b12, b13, (short) (b13 | 141), objArr113);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c4, iRgb, i5114, 410748506, false, (String) objArr113[0], new Class[]{String.class});
                                    }
                                    long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr112)).longValue();
                                    long j15 = 1489155190;
                                    long j16 = (((long) 784) * j15) + (((long) (-782)) * jLongValue3);
                                    long j17 = -783;
                                    iRgb = i4;
                                    long j18 = -1;
                                    long j19 = j15 ^ j18;
                                    long j110 = ((long) i) ^ j18;
                                    long j111 = j16 + ((jLongValue3 ^ j18) * j17) + (j17 * (((j19 | j110) | jLongValue3) ^ j18)) + (((long) 783) * ((j18 ^ (j110 | jLongValue3)) | j19)) + ((long) (-1690073427));
                                    int i5115 = (int) (j111 >> 32);
                                    int iMyUid3 = Process.myUid();
                                    int i5116 = ~iMyUid3;
                                    int i5117 = (~((-1964044152) | i5116)) | 352356676;
                                    int i5118 = ~(iMyUid3 | 2138505215);
                                    int i5119 = i5115 & ((-694705138) + ((i5117 | i5118) * (-713)) + (i5118 * 1426) + ((~(526817740 | i5116)) * 713));
                                    int i6110 = ((int) j111) & ((((~((-325207400) | i)) * TypedValues.CycleType.TYPE_EASING) - 1215304711) + (((~((-325207400) | (~i))) | (-1399477608)) * TypedValues.CycleType.TYPE_EASING));
                                    i6 = (i5119 & i6110) | (i5119 ^ i6110);
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            } else {
                                iRgb = i4;
                                Object[] objArr114 = new Object[1];
                                a(new int[]{1499568684, 907371328, 37889824, -1217522922}, 0 - (~(ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr114);
                                str = (String) objArr114[0];
                                int[] iArr7 = {-494263075, 1627828977, -591065227, -136598865, -358091050, -114649404, -538919335, 1988336222, 808894243, 1862538481};
                                int iArgb3 = Color.argb(0, 0, 0, 0);
                                int i6111 = (iArgb3 * (-433)) - 2808;
                                int i6112 = ~iArgb3;
                                int i6113 = ~i;
                                int i6114 = ~(i6112 | i6113);
                                int i6115 = ~(((-14) ^ i) | ((-14) & i));
                                int i6116 = ((i6114 & i6115) | (i6114 ^ i6115)) * 217;
                                int i6117 = (i6111 ^ i6116) + ((i6111 & i6116) << 1);
                                int i6118 = ~iArgb3;
                                int i6119 = ~((i6118 & (-14)) | (i6118 ^ (-14)));
                                int i7110 = ~(i6112 | i);
                                int i7111 = i6117 + (((i6119 & i7110) | (i6119 ^ i7110)) * 217);
                                int i7112 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i7113 = (i7112 & 53) + (i7112 | 53);
                                TuitionPaymentFragmentbindingInflater1 = i7113 % 128;
                                int i7114 = i7113 % 2;
                                int i7115 = ~((-14) | i6113);
                                int i7116 = i7111 + (217 * ((i7115 & iArgb3) | (iArgb3 ^ i7115)));
                                Object[] objArr115 = new Object[1];
                                a(iArr7, i7116, objArr115);
                                try {
                                    objArr = new Object[]{(String) objArr115[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 33603);
                                        int maxKeyCode3 = 3085 - (KeyEvent.getMaxKeyCode() >> 16);
                                        int absoluteGravity4 = 26 - Gravity.getAbsoluteGravity(0, 0);
                                        byte b14 = $$a[7];
                                        byte b15 = b14;
                                        Object[] objArr116 = new Object[1];
                                        c(b14, b15, (short) (b15 | 141), objArr116);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf3, maxKeyCode3, absoluteGravity4, 1411172903, false, (String) objArr116[0], new Class[]{String.class});
                                    }
                                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                        int i7117 = TuitionPaymentFragmentbindingInflater1;
                                        i7 = (i7117 & 99) + (i7117 | 99);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                                        if (i7 % 2 != 0) {
                                            i6 = 0;
                                        } else {
                                            i6 = 1;
                                        }
                                    } else {
                                        i6 = 0;
                                    }
                                } catch (Throwable th3) {
                                    Throwable cause3 = th3.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th3;
                                }
                            }
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        iRgb = i4;
                    }
                    int i7118 = (~(i & 10)) & (i | 10);
                    int i7119 = -i6;
                    int i814 = ((i6 & i7119) | (i6 ^ i7119)) >> 31;
                    int i815 = (~i814) & i;
                    int i816 = i814 & i7118;
                    int i817 = (i816 & i815) | (i815 ^ i816);
                    int i818 = i2 & 32;
                    int i819 = -i818;
                    int i8110 = ((i818 & i819) | (i818 ^ i819)) >> 31;
                    i5 = (i817 & (~i8110)) | (i8110 & i);
                }
                int i90 = (~(i & iRgb)) & (i | iRgb);
                int i91 = -i90;
                int i92 = ((i90 & i91) | (i90 ^ i91)) >> 31;
                int i93 = (i5 & (~i92)) | (iRgb & i92);
                Object[] objArr20 = new Object[4];
                int[] iArr8 = new int[1];
                objArr20[0] = iArr8;
                int[] iArr9 = new int[1];
                objArr20[1] = iArr9;
                int[] iArr10 = new int[1];
                objArr20[2] = iArr10;
                int i94 = ((~i) & i93) | ((~i93) & i);
                int i95 = -i94;
                int i96 = (((i94 & i95) | (i94 ^ i95)) >> 31) & 16;
                int i97 = TuitionPaymentFragmentbindingInflater1;
                int i98 = (i97 & 93) + (i97 | 93);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i98 % 128;
                if (i98 % 2 != 0) {
                    iArr9[0] = i;
                    ((int[]) objArr20[4])[0] = i93;
                    objArr20[5] = null;
                } else {
                    iArr8[0] = i;
                    iArr10[0] = i93;
                    objArr20[3] = null;
                }
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i99 = ((((~((-430385251) | iFreeMemory)) | 285212672) * (-566)) - 1738074668) + ((~(iFreeMemory | (-145172579))) * 566);
                int i100 = ((i99 | i96) << 1) - (i99 ^ i96);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i101 = i100 * 465;
                int i102 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i103 = ((i102 | 61) << 1) - (i102 ^ 61);
                TuitionPaymentFragmentbindingInflater1 = i103 % 128;
                int i104 = i103 % 2;
                int i105 = (-463) * i3;
                int i106 = (i101 ^ i105) + ((i101 & i105) << 1);
                int i107 = ~i3;
                int i108 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | i107);
                int i109 = ~i3;
                int i110 = ~((i109 ^ i100) | (i109 & i100));
                int i111 = (i108 & i110) | (i108 ^ i110);
                int i112 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | i100);
                int i113 = ((i111 & i112) | (i111 ^ i112)) * 464;
                int i114 = i102 + 9;
                TuitionPaymentFragmentbindingInflater1 = i114 % 128;
                int i115 = i114 % 2;
                int i116 = (i106 ^ i113) + ((i113 & i106) << 1);
                int i117 = ~i100;
                int i118 = (i117 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 ^ i117);
                int i119 = (i116 - (~(-(-(((i109 & i118) | (i118 ^ i109)) * (-464)))))) - 1;
                int i120 = ~(i107 | i100);
                int i121 = ~((i100 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i100 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                int i122 = (i121 & i120) | (i120 ^ i121);
                int i123 = ((i102 | 123) << 1) - (i102 ^ 123);
                int i124 = i123 % 128;
                TuitionPaymentFragmentbindingInflater1 = i124;
                if (i123 % 2 == 0) {
                    int i125 = i119 * (464 << i122);
                    int i126 = (~(i125 & i125)) & (i125 | i125);
                    int i127 = i126 ^ (i126 << 69);
                    int i128 = i127 >> 3;
                    ((int[]) objArr20[1])[0] = ((~i127) & i128) | ((~i128) & i127);
                } else {
                    int i129 = i119 + (i122 * 464);
                    int i130 = i129 << 13;
                    int i131 = (i130 | i129) & (~(i129 & i130));
                    int i132 = i131 >>> 17;
                    int i133 = ((~i131) & i132) | ((~i132) & i131);
                    int i134 = i133 << 5;
                    ((int[]) objArr20[1])[0] = (i133 | i134) & (~(i133 & i134));
                }
                int i135 = i124 + 99;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i135 % 128;
                int i136 = i135 % 2;
                return objArr20;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th4;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(int r6, byte r7, short r8) {
            /*
                int r6 = r6 * 56
                int r6 = 122 - r6
                int r7 = r7 * 2
                int r0 = 1 - r7
                byte[] r1 = defpackage.lambdasnapshot7.AnonymousClass5.$$c
                int r8 = r8 * 2
                int r8 = 4 - r8
                byte[] r0 = new byte[r0]
                r2 = 0
                int r7 = 0 - r7
                if (r1 != 0) goto L19
                r3 = r8
                r4 = r2
                r8 = r7
                goto L2e
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L25:
                r4 = r1[r8]
                int r3 = r3 + 1
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2e:
                int r6 = -r6
                int r6 = r6 + r8
                int r8 = r3 + 1
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdasnapshot7.AnonymousClass5.$$e(int, byte, short):java.lang.String");
        }
    };
    private b<byte[]> b = new b<byte[]>() { // from class: lambdasnapshot7.6
        @Override // lambdasnapshot7.b
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr) {
            lambdasnapshot7.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(bArr);
        }
    };
    private b<AutoValue_Packet> TuitionPaymentFragmentbindingInflater1 = new b<AutoValue_Packet>() { // from class: lambdasnapshot7.8
        @Override // lambdasnapshot7.b
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AutoValue_Packet autoValue_Packet) {
            lambdasnapshot7.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(autoValue_Packet);
        }
    };
    private b<byte[]> cancelAll = new b<byte[]>() { // from class: lambdasnapshot7.7
        @Override // lambdasnapshot7.b
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr) {
            lambdasnapshot7.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(new String(bArr));
        }
    };
    public LinkedList<TuitionPaymentFragmentspecialinlinedviewModeldefault3> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new LinkedList<>();
    private ArrayList<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ArrayList<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteOrder f1265a = ByteOrder.BIG_ENDIAN;
    private AutoValue_Packet onTransact = new AutoValue_Packet();

    public interface b<T> {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault3(T t);
    }

    static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        int b;

        public abstract TuitionPaymentFragmentspecialinlinedviewModeldefault3 b(checkReadyToRelease checkreadytorelease, AutoValue_Packet autoValue_Packet);

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
            this.b = i;
        }
    }

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        private b<byte[]> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, b<byte[]> bVar) {
            super(i);
            if (i <= 0) {
                throw new IllegalArgumentException("length should be > 0");
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bVar;
        }

        @Override // lambdasnapshot7.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final TuitionPaymentFragmentspecialinlinedviewModeldefault3 b(checkReadyToRelease checkreadytorelease, AutoValue_Packet autoValue_Packet) {
            int i = this.b;
            byte[] bArr = new byte[i];
            if (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < i) {
                throw new IllegalArgumentException("length");
            }
            int i2 = 0;
            int i3 = i;
            while (i3 > 0) {
                ByteBuffer byteBufferPeek = autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.peek();
                int iMin = Math.min(byteBufferPeek.remaining(), i3);
                byteBufferPeek.get(bArr, i2, iMin);
                i3 -= iMin;
                i2 += iMin;
                if (byteBufferPeek.remaining() == 0) {
                    autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove();
                    AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(byteBufferPeek);
                }
            }
            autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 -= i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr);
            return null;
        }
    }

    public static class TuitionPaymentFragmentbindingInflater1 extends TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        private lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private byte TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentbindingInflater1(byte b, lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessor) {
            super(1);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (byte) 0;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessor;
        }

        @Override // lambdasnapshot7.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final TuitionPaymentFragmentspecialinlinedviewModeldefault3 b(checkReadyToRelease checkreadytorelease, AutoValue_Packet autoValue_Packet) {
            AutoValue_Packet autoValue_Packet2 = new AutoValue_Packet();
            boolean z = true;
            while (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 0) {
                ByteBuffer byteBufferRemove = autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove();
                autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 -= byteBufferRemove.remaining();
                byteBufferRemove.mark();
                int i = 0;
                while (byteBufferRemove.remaining() > 0) {
                    z = byteBufferRemove.get() == this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (z) {
                        break;
                    }
                    i++;
                }
                byteBufferRemove.reset();
                if (z) {
                    autoValue_Packet.TuitionPaymentFragmentbindingInflater1(byteBufferRemove);
                    autoValue_Packet.TuitionPaymentFragmentbindingInflater1(autoValue_Packet2, i);
                    autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1).get();
                    autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2--;
                    break;
                }
                autoValue_Packet2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteBufferRemove);
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(checkreadytorelease, autoValue_Packet2);
            if (z) {
                return null;
            }
            return this;
        }
    }

    public lambdasnapshot7(checkReadyToRelease checkreadytorelease) {
        this.asBinder = checkreadytorelease;
        checkreadytorelease.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
    }

    @Override // defpackage.lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor
    public final void TuitionPaymentFragmentbindingInflater1(checkReadyToRelease checkreadytorelease, AutoValue_Packet autoValue_Packet) {
        autoValue_Packet.TuitionPaymentFragmentbindingInflater1(this.onTransact, autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        while (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size() > 0 && this.onTransact.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.peek().b) {
            this.onTransact.b = this.f1265a;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3B = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.poll().b(checkreadytorelease, this.onTransact);
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3B != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.addFirst(tuitionPaymentFragmentspecialinlinedviewModeldefault3B);
            }
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size() == 0) {
            AutoValue_Packet autoValue_Packet2 = this.onTransact;
            autoValue_Packet2.TuitionPaymentFragmentbindingInflater1(autoValue_Packet, autoValue_Packet2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }

    static {
        new Hashtable();
    }
}
