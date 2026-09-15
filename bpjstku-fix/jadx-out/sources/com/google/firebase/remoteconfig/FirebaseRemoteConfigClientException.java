package com.google.firebase.remoteconfig;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda0;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseRemoteConfigClientException extends FirebaseRemoteConfigException {
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;
    private static int d;
    private static final byte[] $$c = {57, -56, 23, -36};
    private static final int $$d = 81;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {51, -99, -8, -59, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 246;
    private static int g = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int asBinder = 1;

    private static void c(int i, short s, short s2, Object[] objArr) {
        int i2 = 98 - (s * 14);
        int i3 = 145 - i;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[53 - s2];
        int i4 = 52 - s2;
        int i5 = -1;
        if (bArr == null) {
            i2 = (i2 + (-i4)) - 11;
            i3++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = (i2 + (-bArr[i3])) - 11;
                i3++;
            }
        }
    }

    public FirebaseRemoteConfigClientException(String str) {
        super(str);
    }

    public FirebaseRemoteConfigClientException(String str, Throwable th) {
        super(str, th);
    }

    public FirebaseRemoteConfigClientException(String str, FirebaseRemoteConfigException.Code code) {
        super(str, code);
    }

    public FirebaseRemoteConfigClientException(String str, Throwable th, FirebaseRemoteConfigException.Code code) {
        super(str, th, code);
    }

    private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
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
            int i4 = $10 + 91;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8327 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getPressedStateDuration() >> 16) + 1235, 35 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -653973969, false, $$e(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 2;
                    byte b5 = (byte) (b4 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.green(0), KeyEvent.normalizeMetaState(0) + 2764, 15 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1504416861, false, $$e(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 43325), ExpandableListView.getPackedPositionGroup(0L) + 253, 21 - MotionEvent.axisFromString(""), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char threadPriority = (char) (65200 - ((Process.getThreadPriority(0) + 20) >> 6));
                    int i6 = 2891 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int iMyTid = 17 - (Process.myTid() >> 22);
                    byte b6 = (byte) ($$d & 7);
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(threadPriority, i6, iMyTid, 2012627446, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) b) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
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
        int i7 = $11 + 33;
        $10 = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0745 A[Catch: Exception -> 0x07c8, TRY_LEAVE, TryCatch #2 {Exception -> 0x07c8, blocks: (B:83:0x05f1, B:72:0x0539, B:74:0x053f, B:75:0x0540, B:76:0x0541, B:85:0x0648, B:87:0x064e, B:88:0x064f, B:89:0x0650, B:91:0x0675, B:94:0x06d6, B:99:0x0733, B:100:0x0736, B:101:0x0739, B:105:0x073d, B:107:0x0743, B:108:0x0744, B:109:0x0745, B:114:0x07a3, B:121:0x07be, B:123:0x07c4, B:124:0x07c5, B:63:0x0495, B:65:0x04a2, B:66:0x04dc, B:77:0x0569, B:79:0x0576, B:80:0x05ae, B:95:0x06e1, B:97:0x06ee, B:98:0x072c, B:110:0x0751, B:112:0x075e, B:113:0x079c), top: B:146:0x03a2, inners: #0, #1, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x075e A[Catch: all -> 0x07bd, TryCatch #8 {all -> 0x07bd, blocks: (B:110:0x0751, B:112:0x075e, B:113:0x079c), top: B:157:0x0751, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:119:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:126:0x07c8 A[PHI: r22
  0x07c8: PHI (r22v1 int) = (r22v0 int), (r22v3 int), (r22v4 int), (r22v4 int) binds: [B:125:0x07c6, B:141:0x07c8, B:115:0x07a7, B:117:0x07b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:129:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:130:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:149:0x039e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x03a4 A[Catch: Exception -> 0x07c6, TRY_LEAVE, TryCatch #4 {Exception -> 0x07c6, blocks: (B:44:0x039e, B:46:0x03a4, B:50:0x03cd, B:56:0x041a, B:62:0x047f, B:68:0x04ed), top: B:149:0x039e }] */
    /* JADX WARN: Code duplicated, block: B:49:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:52:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:55:0x0404  */
    /* JADX WARN: Code duplicated, block: B:58:0x041c  */
    /* JADX WARN: Code duplicated, block: B:61:0x046d  */
    /* JADX WARN: Code duplicated, block: B:65:0x04a2 A[Catch: all -> 0x0536, TryCatch #0 {all -> 0x0536, blocks: (B:63:0x0495, B:65:0x04a2, B:66:0x04dc), top: B:142:0x0495, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0541 A[Catch: Exception -> 0x07c8, TRY_LEAVE, TryCatch #2 {Exception -> 0x07c8, blocks: (B:83:0x05f1, B:72:0x0539, B:74:0x053f, B:75:0x0540, B:76:0x0541, B:85:0x0648, B:87:0x064e, B:88:0x064f, B:89:0x0650, B:91:0x0675, B:94:0x06d6, B:99:0x0733, B:100:0x0736, B:101:0x0739, B:105:0x073d, B:107:0x0743, B:108:0x0744, B:109:0x0745, B:114:0x07a3, B:121:0x07be, B:123:0x07c4, B:124:0x07c5, B:63:0x0495, B:65:0x04a2, B:66:0x04dc, B:77:0x0569, B:79:0x0576, B:80:0x05ae, B:95:0x06e1, B:97:0x06ee, B:98:0x072c, B:110:0x0751, B:112:0x075e, B:113:0x079c), top: B:146:0x03a2, inners: #0, #1, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0576 A[Catch: all -> 0x0647, TryCatch #1 {all -> 0x0647, blocks: (B:77:0x0569, B:79:0x0576, B:80:0x05ae), top: B:144:0x0569, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0650 A[Catch: Exception -> 0x07c8, TRY_LEAVE, TryCatch #2 {Exception -> 0x07c8, blocks: (B:83:0x05f1, B:72:0x0539, B:74:0x053f, B:75:0x0540, B:76:0x0541, B:85:0x0648, B:87:0x064e, B:88:0x064f, B:89:0x0650, B:91:0x0675, B:94:0x06d6, B:99:0x0733, B:100:0x0736, B:101:0x0739, B:105:0x073d, B:107:0x0743, B:108:0x0744, B:109:0x0745, B:114:0x07a3, B:121:0x07be, B:123:0x07c4, B:124:0x07c5, B:63:0x0495, B:65:0x04a2, B:66:0x04dc, B:77:0x0569, B:79:0x0576, B:80:0x05ae, B:95:0x06e1, B:97:0x06ee, B:98:0x072c, B:110:0x0751, B:112:0x075e, B:113:0x079c), top: B:146:0x03a2, inners: #0, #1, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x06d6 A[Catch: Exception -> 0x07c8, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x07c8, blocks: (B:83:0x05f1, B:72:0x0539, B:74:0x053f, B:75:0x0540, B:76:0x0541, B:85:0x0648, B:87:0x064e, B:88:0x064f, B:89:0x0650, B:91:0x0675, B:94:0x06d6, B:99:0x0733, B:100:0x0736, B:101:0x0739, B:105:0x073d, B:107:0x0743, B:108:0x0744, B:109:0x0745, B:114:0x07a3, B:121:0x07be, B:123:0x07c4, B:124:0x07c5, B:63:0x0495, B:65:0x04a2, B:66:0x04dc, B:77:0x0569, B:79:0x0576, B:80:0x05ae, B:95:0x06e1, B:97:0x06ee, B:98:0x072c, B:110:0x0751, B:112:0x075e, B:113:0x079c), top: B:146:0x03a2, inners: #0, #1, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x06ee A[Catch: all -> 0x073c, TryCatch #7 {all -> 0x073c, blocks: (B:95:0x06e1, B:97:0x06ee, B:98:0x072c), top: B:155:0x06e1, outer: #2 }] */
    public static Object[] TuitionPaymentFragmentbindingInflater1(Context context, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        String str;
        char[] cArr;
        char[] cArr2;
        char c;
        int i11;
        char[] cArr3;
        int i12;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i13;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        char[] cArr4;
        char[] cArr5;
        int i14;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        long j;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        int i24 = 2 % 2;
        SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i25 = asBinder;
        int i26 = (i25 ^ 91) + ((i25 & 91) << 1);
        int i27 = i26 % 128;
        TuitionPaymentFragmentbindingInflater1 = i27;
        if (i26 % 2 != 0) {
            throw null;
        }
        if (context != null) {
            int i28 = (i27 ^ 51) + ((i27 & 51) << 1);
            asBinder = i28 % 128;
            if (i28 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            try {
                char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i29 = -View.resolveSize(0, 0);
                int i30 = ~i;
                int i31 = ~((1888457293 ^ i30) | (1888457293 & i30));
                int i32 = ~((1888457293 ^ i29) | (1888457293 & i29));
                int i33 = ((i29 * 50) - 1503236210) + (((i31 ^ i32) | (i32 & i31)) * 98);
                int i34 = ~i29;
                int i35 = ~((i34 & i30) | (i34 ^ i30));
                int i36 = -(-(((i35 & 1888457293) | (1888457293 ^ i35) | (~((i29 ^ i) | (i29 & i)))) * (-49)));
                int i37 = (i33 ^ i36) + ((i36 & i33) << 1);
                int i38 = ~((1888457293 ^ i) | (1888457293 & i));
                int i39 = ~((i29 & (-1888457294)) | (i29 ^ (-1888457294)));
                int i40 = -(-(((i39 & i38) | (i38 ^ i39)) * 49));
                Object[] objArr2 = new Object[1];
                a(new char[]{0, 0, 0, 0}, new char[]{45615, 28781, 48271, 26894}, jumpTapTimeout, (i37 ^ i40) + ((i40 & i37) << 1), new char[]{34486, 2185, 40160, 50424, 62103, 61492, 62521, 25310, 30667, 51432, 26090, 18281, 56275, 35692, 6931, 44492, 13104, 43834, 44989, 43663, 50614, 43482, 54711}, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                char[] cArr6 = {0, 0, 0, 0};
                char[] cArr7 = {14591, 14659, 19974, 40652};
                int threadPriority = Process.getThreadPriority(0);
                int i41 = asBinder;
                int i42 = (i41 ^ 55) + ((i41 & 55) << 1);
                TuitionPaymentFragmentbindingInflater1 = i42 % 128;
                int i43 = i42 % 2;
                int i44 = threadPriority * (-115);
                int i45 = ((-2300) ^ i44) + ((i44 & (-2300)) << 1);
                int i46 = -(-((~((i30 ^ 20) | (i30 & 20) | threadPriority)) * (-116)));
                int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                int i48 = ((20 & i) | (20 ^ i)) * 116;
                int i49 = (i47 & i48) + (i48 | i47);
                int i50 = ~threadPriority;
                int i51 = -(-(((~((i50 & i) | (i50 ^ i))) | (~(((-21) & i50) | ((-21) ^ i50)))) * 116));
                int i52 = (((i49 | i51) << 1) - (i51 ^ i49)) >> 6;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i53 = i52 * 569;
                int i54 = (i53 & 29759838) + (i53 | 29759838);
                int i55 = ~i52;
                int i56 = (i55 ^ (-52303)) | (i55 & (-52303));
                int i57 = ~i56;
                int i58 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i59 = ~((i55 ^ i58) | (i55 & i58));
                int i60 = (i57 ^ i59) | (i57 & i59);
                int i61 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i62 = ~((-52303) | i61);
                int i63 = -(-(((i60 ^ i62) | (i60 & i62)) * (-1136)));
                int i64 = (i54 & i63) + (i63 | i54);
                int i65 = ~i52;
                int i66 = ~((i65 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i65 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                int i67 = asBinder;
                int i68 = (i67 & 117) + (i67 | 117);
                TuitionPaymentFragmentbindingInflater1 = i68 % 128;
                int i69 = i68 % 2;
                int i70 = ~(((-52303) & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | ((-52303) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                int i71 = (i70 & i66) | (i66 ^ i70);
                int i72 = (i58 ^ i52) | (i58 & i52);
                int i73 = -(-((-568) * (i71 | (~((i72 & 52302) | (i72 ^ 52302))))));
                int i74 = (i64 & i73) + (i73 | i64);
                int i75 = ~(i61 | i52);
                int i76 = ~((52302 & i61) | (i61 ^ 52302));
                int i77 = (i75 & i76) | (i75 ^ i76);
                int i78 = ~((i56 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i56 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                int i79 = ((i77 & i78) | (i77 ^ i78)) * 568;
                char c2 = (char) ((i74 & i79) + (i79 | i74));
                Object[] objArr3 = new Object[1];
                a(cArr6, cArr7, c2, ViewConfiguration.getScrollBarFadeDuration() >> 16, new char[]{53342, 17164, 39979, 38709, 55691, 47947, 59334, 47017, 36534, 37271, 57136, 25945, 12750, 9377, 44684, 18335, 40461, 55134}, objArr3);
                String str2 = (String) objArr3[0];
                int i80 = asBinder + 119;
                TuitionPaymentFragmentbindingInflater1 = i80 % 128;
                int i81 = i80 % 2;
                Object objInvoke = cls.getMethod(str2, null).invoke(context, null);
                Object[] objArr4 = new Object[1];
                a(new char[]{0, 0, 0, 0}, new char[]{20590, 56047, 22416, 11744}, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ViewConfiguration.getTouchSlop() >> 8, new char[]{36196, 48710, 50804, 16122, 32640, 61744, 14461, 12200, 1130, 56894, 14419, 50531, 43740, 39248, 51698, 36895, 47035, 20087, 57952, 25756, 9367, 41616, 13854, 55269, 48441, 39558, 37920, 36171, 406, 48961, 62350, 30756, 49146, 26475}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 60617);
                int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                int i82 = TuitionPaymentFragmentbindingInflater1 + 49;
                asBinder = i82 % 128;
                int i83 = i82 % 2;
                int i84 = ((-380) * maxKeyCode) - (-1279286272);
                int i85 = ~maxKeyCode;
                int i86 = ((1071469056 ^ i) | (1071469056 & i) | i85) * (-381);
                int i87 = ((i84 | i86) << 1) - (i84 ^ i86);
                int i88 = ((~(i30 | 1071469056)) | (~(((-1071469057) & i85) | (i85 ^ (-1071469057)))) | (~((maxKeyCode & 1071469056) | (maxKeyCode ^ 1071469056)))) * 381;
                int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
                int i90 = (~((i85 ^ 1071469056) | (1071469056 & i85))) * 381;
                Object[] objArr5 = new Object[1];
                a(new char[]{0, 0, 0, 0}, new char[]{'z', 56658, 51519, 19948}, edgeSlop, ((i89 | i90) << 1) - (i90 ^ i89), new char[]{62206, 42147, 62361, 8003, 50939}, objArr5);
                int i91 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                int i92 = -i91;
                int i93 = ((i91 & i92) | (i91 ^ i92)) >> 31;
                int i94 = (~i93) & i;
                int i95 = i93 & (i ^ 1);
                i4 = (i95 & i94) | (i94 ^ i95);
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
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 16949);
                int deadChar = 2739 - KeyEvent.getDeadChar(0, 0);
                int defaultSize = 13 - View.getDefaultSize(0, 0);
                byte[] bArr = $$a;
                Object[] objArr6 = new Object[1];
                c((short) 141, bArr[5], bArr[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionGroup, deadChar, defaultSize, 1501733736, false, (String) objArr6[0], new Class[0]);
            }
            Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char doubleTapTimeout = (char) (16949 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 2739;
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 13;
                byte[] bArr2 = $$a;
                Object[] objArr7 = new Object[1];
                c((short) 89, bArr2[5], bArr2[7], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(doubleTapTimeout, edgeSlop2, capsMode, 47863026, false, (String) objArr7[0], null);
            }
            if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null))) {
                int i96 = TuitionPaymentFragmentbindingInflater1 + 71;
                asBinder = i96 % 128;
                int i97 = i96 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char c3 = (char) (16949 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    int jumpTapTimeout2 = 2739 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int pressedStateDuration = 13 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte b2 = $$a[5];
                    Object[] objArr8 = new Object[1];
                    c((short) 37, b2, (byte) (b2 | 14), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, jumpTapTimeout2, pressedStateDuration, 631063962, false, (String) objArr8[0], null);
                }
                boolean zContains = set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null));
                i5 = 1;
                if (!zContains) {
                    try {
                        try {
                            if (Build.VERSION.SDK_INT > 33) {
                                cArr4 = new char[]{0, 0, 0, 0};
                                cArr5 = new char[]{40441, 54134, 55945, 31345};
                                i14 = -ExpandableListView.getPackedPositionType(0L);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i98 = TuitionPaymentFragmentbindingInflater1;
                                i15 = (i98 & 119) + (i98 | 119);
                                asBinder = i15 % 128;
                                if (i15 % 2 == 0) {
                                    i16 = (i14 * (-589)) % 0;
                                } else {
                                    i16 = (i14 * (-589)) - (-17225286);
                                }
                                int i99 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i100 = ~((i99 & (-29147)) | ((-29147) ^ i99));
                                int i101 = ~(((-29147) ^ i14) | ((-29147) & i14));
                                int i102 = (i100 & i101) | (i100 ^ i101);
                                int i103 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i104 = (i103 ^ i14) | (i103 & i14);
                                int i105 = ~i104;
                                i17 = (i102 ^ i105) | (i102 & i105);
                                i18 = ((i98 | 95) << 1) - (i98 ^ 95);
                                asBinder = i18 % 128;
                                if (i18 % 2 == 0) {
                                    int i106 = ~i14;
                                    int i107 = (i106 ^ 29146) | (i106 & 29146);
                                    int i108 = ~((i107 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i107 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                    int i109 = -((i108 & i17) | (i17 ^ i108));
                                    i19 = i16 / ((590 ^ i109) + ((i109 & 590) << 1));
                                } else {
                                    int i110 = ~i14;
                                    int i111 = (i110 & 29146) | (i110 ^ 29146);
                                    int i112 = ~((i111 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i111 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                    int i113 = 590 * ((i112 & i17) | (i17 ^ i112));
                                    i19 = ((i16 | i113) << 1) - (i113 ^ i16);
                                }
                                int i114 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i115 = ~((i114 & (-29147)) | ((-29147) ^ i114));
                                int i116 = ~((-29147) | i14);
                                int i117 = (i115 & i116) | (i115 ^ i116);
                                int i118 = ~i104;
                                int i119 = (i98 ^ 103) + ((i98 & 103) << 1);
                                int i120 = i119 % 128;
                                asBinder = i120;
                                int i121 = i119 % 2;
                                i20 = (i19 - (~((-1180) * ((i117 & i118) | (i117 ^ i118))))) - 1;
                                int i122 = ~i14;
                                i21 = ~((i122 & i103) | (i122 ^ i103));
                                i22 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                i23 = (i120 & 59) + (i120 | 59);
                                TuitionPaymentFragmentbindingInflater1 = i23 % 128;
                                if (i23 % 2 != 0) {
                                    int i123 = ~((i22 & 29146) | (i22 ^ 29146));
                                    int i124 = ((i21 & i123) | (i21 ^ i123)) * 590;
                                    char c4 = (char) ((i20 & i124) + (i124 | i20));
                                    Object[] objArr9 = new Object[1];
                                    a(cArr4, cArr5, c4, Color.red(1), new char[]{10380, 42605, 19430, 43944, 59633, 28263, 42218, 11785, 65100, 38019, 18679, 8387, 18435, 60450, 26892, 11584, 27198, 16695, 43971, 13284, 1191, 63462, 39857, 29636, 44491, 28871, 3858, 43222}, objArr9);
                                    try {
                                        Object[] objArr10 = {(String) objArr9[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                                            int i125 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 992;
                                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 8;
                                            short s = $$a[7];
                                            byte b3 = (byte) s;
                                            Object[] objArr11 = new Object[1];
                                            c(s, b3, (byte) (b3 | 52), objArr11);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetBefore, i125, absoluteGravity, 410748506, false, (String) objArr11[0], new Class[]{String.class});
                                        }
                                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr10)).longValue();
                                        long j2 = 646308351;
                                        long j3 = -1;
                                        long j4 = jLongValue ^ j3;
                                        i6 = i4;
                                        long jUptimeMillis = (int) SystemClock.uptimeMillis();
                                        long j5 = TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                                        long j6 = jUptimeMillis ^ j3;
                                        j = (((long) 319) * j2) + (((long) (-317)) * jLongValue) + (((long) (-318)) * (j4 | (((j2 ^ j3) | jUptimeMillis) ^ j3))) + ((((j4 | jUptimeMillis) ^ j3) | (((j6 | j2) | jLongValue) ^ j3)) * j5) + (j5 * (((jUptimeMillis | (jLongValue | j2)) ^ j3) | (((j4 | j6) | j2) ^ j3))) + ((long) (-847226588));
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                } else {
                                    i6 = i4;
                                    int i126 = ~((i22 & 29146) | (i22 ^ 29146));
                                    int i127 = i21 ^ i126;
                                    Object[] objArr12 = new Object[1];
                                    a(cArr4, cArr5, (char) (i20 + (((i21 & i126) | i127) * 590)), Color.red(0), new char[]{10380, 42605, 19430, 43944, 59633, 28263, 42218, 11785, 65100, 38019, 18679, 8387, 18435, 60450, 26892, 11584, 27198, 16695, 43971, 13284, 1191, 63462, 39857, 29636, 44491, 28871, 3858, 43222}, objArr12);
                                    try {
                                        Object[] objArr13 = {(String) objArr12[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char mode = (char) View.MeasureSpec.getMode(0);
                                            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 993;
                                            int iArgb = 8 - Color.argb(0, 0, 0, 0);
                                            short s2 = $$a[7];
                                            byte b4 = (byte) s2;
                                            Object[] objArr14 = new Object[1];
                                            c(s2, b4, (byte) (b4 | 52), objArr14);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mode, fadingEdgeLength, iArgb, 410748506, false, (String) objArr14[0], new Class[]{String.class});
                                        }
                                        long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr13)).longValue();
                                        long j7 = 1223340448;
                                        long j8 = (((long) (-1335)) * j7) + (((long) (-667)) * jLongValue2);
                                        long j9 = -1;
                                        long j10 = jLongValue2 ^ j9;
                                        long j11 = i;
                                        long j12 = j7 | j11;
                                        j = j8 + (((long) (-668)) * (j10 | (j12 ^ j9))) + (((long) 1336) * (j7 | (j9 ^ (j11 | j10)))) + (((long) 668) * (j10 | j12)) + ((long) (-1424258685));
                                    } catch (Throwable th3) {
                                        Throwable cause3 = th3.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th3;
                                    }
                                }
                                int i128 = (int) (j >> 32);
                                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                                int i129 = ~((-1393939140) | iUptimeMillis);
                                int i130 = ~iUptimeMillis;
                                int i131 = i129 | (~(43287271 | i130));
                                int i132 = ~(1393939139 | i130);
                                int i133 = i128 & ((-1706078950) + ((i131 | i132) * (-516)) + (((~(iUptimeMillis | (-34898628))) | (~((-8388645) | i130))) * 516) + ((8388644 | i132) * 516));
                                int iMyPid = Process.myPid();
                                int i134 = ((int) j) & ((((~(529043988 | iMyPid)) | 539050369) * (-283)) + 790172656 + ((~(iMyPid | 1068094357)) * 283));
                                i7 = (i133 & i134) | (i133 ^ i134);
                            } else {
                                i6 = i4;
                                char[] cArr8 = {0, 0, 0, 0};
                                char[] cArr9 = {40807, 2173, 40606, 48164};
                                int iMyTid = Process.myTid() >> 22;
                                int i135 = asBinder + 97;
                                TuitionPaymentFragmentbindingInflater1 = i135 % 128;
                                int i136 = i135 % 2;
                                int i137 = -iMyTid;
                                char c5 = (char) ((9374 & i137) + (i137 | 9374));
                                Object[] objArr15 = new Object[1];
                                a(cArr8, cArr9, c5, (ViewConfiguration.getDoubleTapTimeout() >> 16) - 1643610721, new char[]{23370}, objArr15);
                                str = (String) objArr15[0];
                                cArr = new char[]{0, 0, 0, 0};
                                cArr2 = new char[]{29980, 7391, 18766, 37775};
                                int i138 = -TextUtils.getOffsetBefore("", 0);
                                c = (char) ((i138 & 36681) + (i138 | 36681));
                                int i139 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                i11 = ((i139 | 1310515061) << 1) - (i139 ^ 1310515061);
                                cArr3 = new char[]{2057, 52038, 45015, 23872, 33720, 36116, 21425, 26638, 58242, 6223, 40946, 41551, 30610};
                                int i140 = asBinder;
                                i12 = (i140 ^ 121) + ((i140 & 121) << 1);
                                TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                                if (i12 % 2 != 0) {
                                    Object[] objArr16 = new Object[1];
                                    a(cArr, cArr2, c, i11, cArr3, objArr16);
                                    try {
                                        Object[] objArr17 = {(String) objArr16[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char offsetBefore2 = (char) (33602 - TextUtils.getOffsetBefore("", 0));
                                            int i141 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3085;
                                            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 26;
                                            short s3 = $$a[7];
                                            byte b5 = (byte) s3;
                                            Object[] objArr18 = new Object[1];
                                            c(s3, b5, (byte) (b5 | 52), objArr18);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetBefore2, i141, packedPositionType, 1411172903, false, (String) objArr18[0], new Class[]{String.class});
                                        }
                                        Object obj2 = null;
                                        str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr17));
                                        obj2.hashCode();
                                        throw null;
                                    } catch (Throwable th4) {
                                        Throwable cause4 = th4.getCause();
                                        if (cause4 != null) {
                                            throw cause4;
                                        }
                                        throw th4;
                                    }
                                }
                                Object[] objArr19 = new Object[1];
                                a(cArr, cArr2, c, i11, cArr3, objArr19);
                                try {
                                    objArr = new Object[]{(String) objArr19[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char maximumDrawingCacheSize = (char) (33602 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                        int i142 = 3085 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int defaultSize2 = 26 - View.getDefaultSize(0, 0);
                                        short s4 = $$a[7];
                                        byte b6 = (byte) s4;
                                        Object[] objArr20 = new Object[1];
                                        c(s4, b6, (byte) (b6 | 52), objArr20);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, i142, defaultSize2, 1411172903, false, (String) objArr20[0], new Class[]{String.class});
                                    }
                                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                        int i143 = TuitionPaymentFragmentbindingInflater1;
                                        i13 = ((i143 | 87) << 1) - (i143 ^ 87);
                                        asBinder = i13 % 128;
                                        if (i13 % 2 == 0) {
                                            i7 = 0;
                                        } else {
                                            i7 = 1;
                                        }
                                    } else {
                                        i7 = 0;
                                    }
                                } catch (Throwable th5) {
                                    Throwable cause5 = th5.getCause();
                                    if (cause5 != null) {
                                        throw cause5;
                                    }
                                    throw th5;
                                }
                                i7 = 0;
                            }
                        } catch (Exception unused) {
                            i7 = 0;
                        }
                    } catch (Exception unused2) {
                        i6 = i4;
                    }
                    int i144 = (~(i & 10)) & (i | 10);
                    int i145 = -i7;
                    int i146 = ((i7 & i145) | (i7 ^ i145)) >> 31;
                    int i147 = (~i146) & i;
                    i8 = TuitionPaymentFragmentbindingInflater1 + 53;
                    int i148 = i8 % 128;
                    asBinder = i148;
                    int i149 = i146 & i144;
                    int i150 = (i149 & i147) | (i147 ^ i149);
                    if (i8 % 2 == 0) {
                        i9 = i2 & 88;
                    } else {
                        i9 = i2 & 32;
                    }
                    int i151 = (i9 | (-i9)) >> 31;
                    int i152 = (i148 ^ 77) + ((i148 & 77) << 1);
                    int i153 = i152 % 128;
                    TuitionPaymentFragmentbindingInflater1 = i153;
                    int i154 = i152 % 2;
                    i10 = (i150 & (~i151)) | (i151 & i);
                    int i155 = ((i153 | 13) << 1) - (13 ^ i153);
                    asBinder = i155 % 128;
                    int i156 = i155 % 2;
                }
                int i157 = (~(i & i6)) & (i | i6);
                int i158 = -i157;
                int i159 = ((i157 & i158) | (i157 ^ i158)) >> 31;
                int i160 = i10 & (~i159);
                int i161 = i6 & i159;
                int i162 = (i160 & i161) | (i160 ^ i161);
                int i163 = (~i162) & i;
                int i164 = ~i;
                int i165 = i163 | (i162 & i164);
                int i166 = ((i165 | (-i165)) >> 31) & 16;
                Object[] objArr21 = {new int[]{i}, new int[1], new int[]{i162}, null};
                int i167 = 1609606132 + (((~((-78203095) | i)) | (~(133135359 | i164))) * 920) + (((~((-95242495) | i164)) | 78203094) * 920) + (((~((-78203095) | i164)) | (~((-17039401) | i)) | (~(i | 133135359))) * 920);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i168 = ((i166 * 860) - (~(-(-(i167 * (-858)))))) - 1;
                int i169 = ((i166 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i166 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) * (-859);
                int i170 = (i168 ^ i169) + ((i168 & i169) << 1);
                int i171 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i172 = ~((i171 ^ i166) | (i171 & i166));
                int i173 = ~i166;
                int i174 = ~i167;
                int i175 = (i173 & i174) | (i173 ^ i174);
                int i176 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i175) | (i175 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                int i177 = -(-(((i176 & i172) | (i172 ^ i176)) * 859));
                int i178 = (i170 & i177) + (i177 | i170);
                int i179 = ~i167;
                int i180 = ~((i171 & i179) | (i179 ^ i171));
                int i181 = ~((i179 & i166) | (i179 ^ i166));
                int i182 = i3 + i178 + (((i181 & i180) | (i180 ^ i181)) * 859);
                int i183 = i182 << 13;
                int i184 = ((~i182) & i183) | ((~i183) & i182);
                int i185 = i184 >>> 17;
                int i186 = ((~i184) & i185) | ((~i185) & i184);
                int i187 = i186 << 5;
                ((int[]) objArr21[1])[0] = ((~i186) & i187) | ((~i187) & i186);
                return objArr21;
            }
            i5 = 1;
            if (Build.VERSION.SDK_INT == 30) {
                int i188 = TuitionPaymentFragmentbindingInflater1;
                int i189 = (i188 ^ 121) + ((i188 & 121) << i5);
                asBinder = i189 % 128;
                int i190 = i189 % 2;
                i10 = i;
                i6 = i4;
            } else {
                if (Build.VERSION.SDK_INT > 33) {
                    cArr4 = new char[]{0, 0, 0, 0};
                    cArr5 = new char[]{40441, 54134, 55945, 31345};
                    i14 = -ExpandableListView.getPackedPositionType(0L);
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i910 = TuitionPaymentFragmentbindingInflater1;
                    i15 = (i910 & 119) + (i910 | 119);
                    asBinder = i15 % 128;
                    if (i15 % 2 == 0) {
                        i16 = (i14 * (-589)) % 0;
                    } else {
                        i16 = (i14 * (-589)) - (-17225286);
                    }
                    int i911 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i1010 = ~((i911 & (-29147)) | ((-29147) ^ i911));
                    int i1011 = ~(((-29147) ^ i14) | ((-29147) & i14));
                    int i1012 = (i1010 & i1011) | (i1010 ^ i1011);
                    int i1013 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i1014 = (i1013 ^ i14) | (i1013 & i14);
                    int i1015 = ~i1014;
                    i17 = (i1012 ^ i1015) | (i1012 & i1015);
                    i18 = ((i910 | 95) << 1) - (i910 ^ 95);
                    asBinder = i18 % 128;
                    if (i18 % 2 == 0) {
                        int i1016 = ~i14;
                        int i1017 = (i1016 ^ 29146) | (i1016 & 29146);
                        int i1018 = ~((i1017 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i1017 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        int i1019 = -((i1018 & i17) | (i17 ^ i1018));
                        i19 = i16 / ((590 ^ i1019) + ((i1019 & 590) << 1));
                    } else {
                        int i1110 = ~i14;
                        int i1111 = (i1110 & 29146) | (i1110 ^ 29146);
                        int i1112 = ~((i1111 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i1111 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        int i1113 = 590 * ((i1112 & i17) | (i17 ^ i1112));
                        i19 = ((i16 | i1113) << 1) - (i1113 ^ i16);
                    }
                    int i1114 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i1115 = ~((i1114 & (-29147)) | ((-29147) ^ i1114));
                    int i1116 = ~((-29147) | i14);
                    int i1117 = (i1115 & i1116) | (i1115 ^ i1116);
                    int i1118 = ~i1014;
                    int i1119 = (i910 ^ 103) + ((i910 & 103) << 1);
                    int i1210 = i1119 % 128;
                    asBinder = i1210;
                    int i1211 = i1119 % 2;
                    i20 = (i19 - (~((-1180) * ((i1117 & i1118) | (i1117 ^ i1118))))) - 1;
                    int i1212 = ~i14;
                    i21 = ~((i1212 & i1013) | (i1212 ^ i1013));
                    i22 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    i23 = (i1210 & 59) + (i1210 | 59);
                    TuitionPaymentFragmentbindingInflater1 = i23 % 128;
                    if (i23 % 2 != 0) {
                        int i1213 = ~((i22 & 29146) | (i22 ^ 29146));
                        int i1214 = ((i21 & i1213) | (i21 ^ i1213)) * 590;
                        char c6 = (char) ((i20 & i1214) + (i1214 | i20));
                        Object[] objArr22 = new Object[1];
                        a(cArr4, cArr5, c6, Color.red(1), new char[]{10380, 42605, 19430, 43944, 59633, 28263, 42218, 11785, 65100, 38019, 18679, 8387, 18435, 60450, 26892, 11584, 27198, 16695, 43971, 13284, 1191, 63462, 39857, 29636, 44491, 28871, 3858, 43222}, objArr22);
                        Object[] objArr110 = {(String) objArr22[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char offsetBefore3 = (char) TextUtils.getOffsetBefore("", 0);
                            int i1215 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 992;
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 8;
                            short s5 = $$a[7];
                            byte b7 = (byte) s5;
                            Object[] objArr111 = new Object[1];
                            c(s5, b7, (byte) (b7 | 52), objArr111);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetBefore3, i1215, absoluteGravity2, 410748506, false, (String) objArr111[0], new Class[]{String.class});
                        }
                        long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr110)).longValue();
                        long j13 = 646308351;
                        long j14 = -1;
                        long j15 = jLongValue3 ^ j14;
                        i6 = i4;
                        long jUptimeMillis2 = (int) SystemClock.uptimeMillis();
                        long j16 = TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                        long j17 = jUptimeMillis2 ^ j14;
                        j = (((long) 319) * j13) + (((long) (-317)) * jLongValue3) + (((long) (-318)) * (j15 | (((j13 ^ j14) | jUptimeMillis2) ^ j14))) + ((((j15 | jUptimeMillis2) ^ j14) | (((j17 | j13) | jLongValue3) ^ j14)) * j16) + (j16 * (((jUptimeMillis2 | (jLongValue3 | j13)) ^ j14) | (((j15 | j17) | j13) ^ j14))) + ((long) (-847226588));
                    } else {
                        i6 = i4;
                        int i1216 = ~((i22 & 29146) | (i22 ^ 29146));
                        int i1217 = i21 ^ i1216;
                        Object[] objArr112 = new Object[1];
                        a(cArr4, cArr5, (char) (i20 + (((i21 & i1216) | i1217) * 590)), Color.red(0), new char[]{10380, 42605, 19430, 43944, 59633, 28263, 42218, 11785, 65100, 38019, 18679, 8387, 18435, 60450, 26892, 11584, 27198, 16695, 43971, 13284, 1191, 63462, 39857, 29636, 44491, 28871, 3858, 43222}, objArr112);
                        Object[] objArr113 = {(String) objArr112[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char mode2 = (char) View.MeasureSpec.getMode(0);
                            int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 993;
                            int iArgb2 = 8 - Color.argb(0, 0, 0, 0);
                            short s6 = $$a[7];
                            byte b8 = (byte) s6;
                            Object[] objArr114 = new Object[1];
                            c(s6, b8, (byte) (b8 | 52), objArr114);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mode2, fadingEdgeLength2, iArgb2, 410748506, false, (String) objArr114[0], new Class[]{String.class});
                        }
                        long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr113)).longValue();
                        long j18 = 1223340448;
                        long j19 = (((long) (-1335)) * j18) + (((long) (-667)) * jLongValue4);
                        long j20 = -1;
                        long j110 = jLongValue4 ^ j20;
                        long j111 = i;
                        long j112 = j18 | j111;
                        j = j19 + (((long) (-668)) * (j110 | (j112 ^ j20))) + (((long) 1336) * (j18 | (j20 ^ (j111 | j110)))) + (((long) 668) * (j110 | j112)) + ((long) (-1424258685));
                    }
                    int i1218 = (int) (j >> 32);
                    int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                    int i1219 = ~((-1393939140) | iUptimeMillis2);
                    int i1310 = ~iUptimeMillis2;
                    int i1311 = i1219 | (~(43287271 | i1310));
                    int i1312 = ~(1393939139 | i1310);
                    int i1313 = i1218 & ((-1706078950) + ((i1311 | i1312) * (-516)) + (((~(iUptimeMillis2 | (-34898628))) | (~((-8388645) | i1310))) * 516) + ((8388644 | i1312) * 516));
                    int iMyPid2 = Process.myPid();
                    int i1314 = ((int) j) & ((((~(529043988 | iMyPid2)) | 539050369) * (-283)) + 790172656 + ((~(iMyPid2 | 1068094357)) * 283));
                    i7 = (i1313 & i1314) | (i1313 ^ i1314);
                } else {
                    i6 = i4;
                    char[] cArr10 = {0, 0, 0, 0};
                    char[] cArr11 = {40807, 2173, 40606, 48164};
                    int iMyTid2 = Process.myTid() >> 22;
                    int i1315 = asBinder + 97;
                    TuitionPaymentFragmentbindingInflater1 = i1315 % 128;
                    int i1316 = i1315 % 2;
                    int i1317 = -iMyTid2;
                    char c7 = (char) ((9374 & i1317) + (i1317 | 9374));
                    Object[] objArr115 = new Object[1];
                    a(cArr10, cArr11, c7, (ViewConfiguration.getDoubleTapTimeout() >> 16) - 1643610721, new char[]{23370}, objArr115);
                    str = (String) objArr115[0];
                    cArr = new char[]{0, 0, 0, 0};
                    cArr2 = new char[]{29980, 7391, 18766, 37775};
                    int i1318 = -TextUtils.getOffsetBefore("", 0);
                    c = (char) ((i1318 & 36681) + (i1318 | 36681));
                    int i1319 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    i11 = ((i1319 | 1310515061) << 1) - (i1319 ^ 1310515061);
                    cArr3 = new char[]{2057, 52038, 45015, 23872, 33720, 36116, 21425, 26638, 58242, 6223, 40946, 41551, 30610};
                    int i1410 = asBinder;
                    i12 = (i1410 ^ 121) + ((i1410 & 121) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                    if (i12 % 2 != 0) {
                        Object[] objArr116 = new Object[1];
                        a(cArr, cArr2, c, i11, cArr3, objArr116);
                        Object[] objArr117 = {(String) objArr116[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char offsetBefore4 = (char) (33602 - TextUtils.getOffsetBefore("", 0));
                            int i1411 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3085;
                            int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 26;
                            short s7 = $$a[7];
                            byte b9 = (byte) s7;
                            Object[] objArr118 = new Object[1];
                            c(s7, b9, (byte) (b9 | 52), objArr118);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetBefore4, i1411, packedPositionType2, 1411172903, false, (String) objArr118[0], new Class[]{String.class});
                        }
                        Object obj3 = null;
                        str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr117));
                        obj3.hashCode();
                        throw null;
                    }
                    Object[] objArr119 = new Object[1];
                    a(cArr, cArr2, c, i11, cArr3, objArr119);
                    objArr = new Object[]{(String) objArr119[0]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char maximumDrawingCacheSize2 = (char) (33602 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        int i1412 = 3085 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int defaultSize3 = 26 - View.getDefaultSize(0, 0);
                        short s8 = $$a[7];
                        byte b10 = (byte) s8;
                        Object[] objArr23 = new Object[1];
                        c(s8, b10, (byte) (b10 | 52), objArr23);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize2, i1412, defaultSize3, 1411172903, false, (String) objArr23[0], new Class[]{String.class});
                    }
                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                        int i1413 = TuitionPaymentFragmentbindingInflater1;
                        i13 = ((i1413 | 87) << 1) - (i1413 ^ 87);
                        asBinder = i13 % 128;
                        if (i13 % 2 == 0) {
                            i7 = 0;
                        } else {
                            i7 = 1;
                        }
                    } else {
                        i7 = 0;
                    }
                    i7 = 0;
                }
                int i1414 = (~(i & 10)) & (i | 10);
                int i1415 = -i7;
                int i1416 = ((i7 & i1415) | (i7 ^ i1415)) >> 31;
                int i1417 = (~i1416) & i;
                i8 = TuitionPaymentFragmentbindingInflater1 + 53;
                int i1418 = i8 % 128;
                asBinder = i1418;
                int i1419 = i1416 & i1414;
                int i1510 = (i1419 & i1417) | (i1417 ^ i1419);
                if (i8 % 2 == 0) {
                    i9 = i2 & 88;
                } else {
                    i9 = i2 & 32;
                }
                int i1511 = (i9 | (-i9)) >> 31;
                int i1512 = (i1418 ^ 77) + ((i1418 & 77) << 1);
                int i1513 = i1512 % 128;
                TuitionPaymentFragmentbindingInflater1 = i1513;
                int i1514 = i1512 % 2;
                i10 = (i1510 & (~i1511)) | (i1511 & i);
                int i1515 = ((i1513 | 13) << 1) - (13 ^ i1513);
                asBinder = i1515 % 128;
                int i1516 = i1515 % 2;
            }
            int i1517 = (~(i & i6)) & (i | i6);
            int i1518 = -i1517;
            int i1519 = ((i1517 & i1518) | (i1517 ^ i1518)) >> 31;
            int i1610 = i10 & (~i1519);
            int i1611 = i6 & i1519;
            int i1612 = (i1610 & i1611) | (i1610 ^ i1611);
            int i1613 = (~i1612) & i;
            int i1614 = ~i;
            int i1615 = i1613 | (i1612 & i1614);
            int i1616 = ((i1615 | (-i1615)) >> 31) & 16;
            Object[] objArr24 = {new int[]{i}, new int[1], new int[]{i1612}, null};
            int i1617 = 1609606132 + (((~((-78203095) | i)) | (~(133135359 | i1614))) * 920) + (((~((-95242495) | i1614)) | 78203094) * 920) + (((~((-78203095) | i1614)) | (~((-17039401) | i)) | (~(i | 133135359))) * 920);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i1618 = ((i1616 * 860) - (~(-(-(i1617 * (-858)))))) - 1;
            int i1619 = ((i1616 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i1616 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4)) * (-859);
            int i1710 = (i1618 ^ i1619) + ((i1618 & i1619) << 1);
            int i1711 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i1712 = ~((i1711 ^ i1616) | (i1711 & i1616));
            int i1713 = ~i1616;
            int i1714 = ~i1617;
            int i1715 = (i1713 & i1714) | (i1713 ^ i1714);
            int i1716 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & i1715) | (i1715 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
            int i1717 = -(-(((i1716 & i1712) | (i1712 ^ i1716)) * 859));
            int i1718 = (i1710 & i1717) + (i1717 | i1710);
            int i1719 = ~i1617;
            int i1810 = ~((i1711 & i1719) | (i1719 ^ i1711));
            int i1811 = ~((i1719 & i1616) | (i1719 ^ i1616));
            int i1812 = i3 + i1718 + (((i1811 & i1810) | (i1810 ^ i1811)) * 859);
            int i1813 = i1812 << 13;
            int i1814 = ((~i1812) & i1813) | ((~i1813) & i1812);
            int i1815 = i1814 >>> 17;
            int i1816 = ((~i1814) & i1815) | ((~i1815) & i1814);
            int i1817 = i1816 << 5;
            ((int[]) objArr24[1])[0] = ((~i1816) & i1817) | ((~i1817) & i1816);
            return objArr24;
        } catch (Throwable th6) {
            Throwable cause6 = th6.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th6;
        }
    }

    static {
        d = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1845939226;
        int i = g + 13;
        d = i % 128;
        int i2 = i % 2;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -6377398940819159759L;
        b = -981105359;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 31391;
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
    private static java.lang.String $$e(byte r6, short r7, int r8) {
        /*
            int r7 = r7 * 2
            int r7 = 3 - r7
            int r6 = r6 + 102
            byte[] r0 = com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException.$$c
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r6 = r8
            r5 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r7]
        L27:
            int r6 = r6 + r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException.$$e(byte, short, int):java.lang.String");
    }
}
