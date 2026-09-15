package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
public final class TakePictureManagerExternalSyntheticLambda2 implements getCaptureFuture {
    private final TakePictureRequest TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final retryRequest TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Set<ProcessingNodeExternalSyntheticLambda7> b;
    private static final byte[] $$c = {46, 47, -18, 64};
    private static final int $$d = 84;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {117, -15, -81, 1, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 236;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f232a = 0;
    private static int asInterface = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {24658, 49002, 56971, 65108, 7612, 15729, 23693, 31770, 39795, 47753, 55880, 63928, 6447, 14481, 22556, 30583, 38627, 46684, 54703, 62845, 5261, 13320, 21367, 29365, 37459, 45473, 53554, 61598, 4191, 12135, 20210, 28230, 36291, 44342, 52377, 60420, 2849, 10929, 19056, 27072, 35127, 43161, 51220, 59263, 1771, 9796, 17879, 25957, 33970, 42007, 50024, 58098, 587, 8664, 16685, 24754, 32788, 57129, 65274, 7775, 15834, 23931, 31987, 40000, 48004, 55991, 3677, 53564, 45188, 36868, 29675, 21363, 13004, 4624, 62767, 54413, 46110, 38898, 30577, 22212, 13900, 6496, 63647, 55325, 48110, 39778, 31425, 23106, 15676, 45563, 28311, 3892, 12183, 52308, 60618, 36196, 44535, 19087, 27427, 2980, 10319, 51419, 59748, 35281, 42624, 18202, 26557, 45565, 28316, 3876, 12196, 52299, 60627, 36204, 44464, 19087, 27437, 3006, 10322, 51409, 59748, 35308, 42688, 18188, 26559, 1038, 9463, 50548, 58858, 33412, 41751, 17327, 24643, 196, 8559, 49659, 65156, 40753, 49056, 23610, 31965, 40860, 16632, 8519, 471, 57905, 45491, 28311, 3892, 12213, 52235, 60627, 36198, 44535, 19096, 27501, 3004, 10314, 51423, 59758, 35253, 42634, 18201, 26544, 1109, 9425, 50531, 58875, 33418, 41746, 17321, 24588, 194, 8549, 8076, 45550, 28317, 3950, 12210, 52289, 60632, 36221, 44537, 19083, 27427, 2994, 10314, 51409};
    private static long TuitionPaymentFragmentbindingInflater1 = 4020879809746333426L;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = 53 - r6
            int r7 = r7 + 4
            byte[] r1 = defpackage.TakePictureManagerExternalSyntheticLambda2.$$a
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2f
        L14:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            int r8 = r8 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2f:
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.TakePictureManagerExternalSyntheticLambda2.d(int, short, byte, java.lang.Object[]):void");
    }

    public TakePictureManagerExternalSyntheticLambda2(Set<ProcessingNodeExternalSyntheticLambda7> set, retryRequest retryrequest, TakePictureRequest takePictureRequest) {
        this.b = set;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = retryrequest;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = takePictureRequest;
    }

    @Override // defpackage.getCaptureFuture
    public final <T> getStageIds<T> b(String str, Class<T> cls, ProcessingNodeExternalSyntheticLambda7 processingNodeExternalSyntheticLambda7, ProcessingRequest<T, byte[]> processingRequest) throws Throwable {
        int i = 2 % 2;
        int i2 = f232a + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (!this.b.contains(processingNodeExternalSyntheticLambda7)) {
            Object[] objArr = {processingNodeExternalSyntheticLambda7, this.b};
            Object[] objArr2 = new Object[1];
            c((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, (ViewConfiguration.getTapTimeout() >> 16) + 66, (char) (View.resolveSize(0, 0) + 53739), objArr2);
            throw new IllegalArgumentException(String.format((String) objArr2[0], objArr));
        }
        TakePictureManagerExternalSyntheticLambda0 takePictureManagerExternalSyntheticLambda0 = new TakePictureManagerExternalSyntheticLambda0(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, str, processingNodeExternalSyntheticLambda7, processingRequest, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        int i4 = asInterface + 43;
        f232a = i4 % 128;
        int i5 = i4 % 2;
        return takePictureManagerExternalSyntheticLambda0;
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $10 + 53;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2187 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 40, 841711447, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - (ViewConfiguration.getEdgeSlop() >> 16)), 3011 - TextUtils.indexOf("", "", 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 26, 321985076, false, $$e(b3, b4, (byte) (b4 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (KeyEvent.getMaxKeyCode() >> 16) + 3376, TextUtils.getOffsetAfter("", 0) + 17, -968507904, false, $$e(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i7 = $11 + 29;
                $10 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i9 = $10 + 117;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 36505), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3375, (ViewConfiguration.getPressedStateDuration() >> 16) + 17, -968507904, false, $$e(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                obj.hashCode();
                throw null;
            }
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                byte b9 = (byte) 0;
                byte b10 = b9;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (36505 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 3375 - TextUtils.lastIndexOf("", '0', 0), View.resolveSize(0, 0) + 17, -968507904, false, $$e(b9, b10, (byte) (b10 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            int i10 = $11 + 85;
            $10 = i10 % 128;
            int i11 = i10 % 2;
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0314 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:23:0x0201  */
    /* JADX WARN: Code duplicated, block: B:39:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:41:0x0302  */
    /* JADX WARN: Code duplicated, block: B:43:0x030d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0312  */
    /* JADX WARN: Code duplicated, block: B:49:0x031b  */
    /* JADX WARN: Code duplicated, block: B:53:0x03d6 A[Catch: all -> 0x04b4, TryCatch #3 {all -> 0x04b4, blocks: (B:51:0x03c9, B:53:0x03d6, B:54:0x0419), top: B:109:0x03c9, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x04bf A[Catch: Exception -> 0x0730, TRY_LEAVE, TryCatch #0 {Exception -> 0x0730, blocks: (B:56:0x048d, B:58:0x04b5, B:60:0x04bd, B:61:0x04be, B:62:0x04bf, B:64:0x055c, B:66:0x05d3, B:68:0x06aa, B:73:0x070d, B:80:0x0726, B:82:0x072c, B:83:0x072d, B:51:0x03c9, B:53:0x03d6, B:54:0x0419, B:69:0x06b4, B:71:0x06c1, B:72:0x0706), top: B:104:0x0319, inners: #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x06c1 A[Catch: all -> 0x0725, TryCatch #4 {all -> 0x0725, blocks: (B:69:0x06b4, B:71:0x06c1, B:72:0x0706), top: B:111:0x06b4, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0713  */
    /* JADX WARN: Code duplicated, block: B:78:0x0723  */
    /* JADX WARN: Code duplicated, block: B:85:0x0730 A[PHI: r28
  0x0730: PHI (r28v4 ??) = (r28v3 ??), (r28v6 ??), (r28v7 ??), (r28v7 ??) binds: [B:84:0x072e, B:103:0x0730, B:74:0x0711, B:76:0x0720] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0032  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v10 */
    /* JADX WARN: Type inference failed for: r28v11 */
    /* JADX WARN: Type inference failed for: r28v12 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r28v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        int i6;
        int i7;
        ?? r28;
        int i8;
        int i9;
        int i10;
        ?? r29;
        String str;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i11;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i12 = 2 % 2;
        int i13 = f232a;
        int i14 = ((i13 | 23) << 1) - (i13 ^ 23);
        asInterface = i14 % 128;
        int i15 = i14 % 2;
        int i16 = (i13 ^ 61) + ((i13 & 61) << 1);
        asInterface = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 51 / 0;
            if (context != 0) {
                i4 = i13 + 15;
                asInterface = i4 % 128;
                if (i4 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                try {
                    int defaultSize = View.getDefaultSize(0, 0);
                    int i18 = (defaultSize * (-743)) - 49038;
                    int i19 = (defaultSize ^ 66) | (defaultSize & 66);
                    int i20 = ~i19;
                    int i21 = ~((defaultSize ^ i) | (defaultSize & i));
                    int i22 = ((i20 ^ i21) | (i20 & i21) | (~((i ^ 66) | (i & 66)))) * (-744);
                    int i23 = asInterface + 55;
                    f232a = i23 % 128;
                    int i24 = i23 % 2;
                    int i25 = -(-i22);
                    int i26 = (i18 & i25) + (i18 | i25);
                    int i27 = ~i;
                    int i28 = ~defaultSize;
                    int i29 = -(-(((~((i28 & (-67)) | (i28 ^ (-67)))) | i27) * 744));
                    int i30 = (((i26 | i29) << 1) - (i29 ^ i26)) + ((i19 | i) * 744);
                    int i31 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    Object[] objArr2 = new Object[1];
                    c(i30, (i31 ^ 23) + ((i31 & 23) << 1), (char) (49055 - (~(-(-KeyEvent.getDeadChar(0, 0))))), objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    int i32 = asInterface;
                    int i33 = ((i32 | 23) << 1) - (i32 ^ 23);
                    f232a = i33 % 128;
                    int i34 = i33 % 2;
                    int i35 = 88 - (~(-KeyEvent.keyCodeFromString("")));
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
                    int i36 = ((packedPositionChild | 19) << 1) - (packedPositionChild ^ 19);
                    int i37 = -(-TextUtils.lastIndexOf("", '0'));
                    Object[] objArr3 = new Object[1];
                    c(i35, i36, (char) (((i37 | 1) << 1) - (i37 ^ 1)), objArr3);
                    Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(context, null);
                    int i38 = 106 - (~(-(ViewConfiguration.getTouchSlop() >> 8)));
                    int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                    Object[] objArr4 = new Object[1];
                    c(i38, (minimumFlingVelocity ^ 34) + ((minimumFlingVelocity & 34) << 1), (char) Drawable.resolveOpacity(0, 0), objArr4);
                    Class<?> cls2 = Class.forName((String) objArr4[0]);
                    int i39 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i40 = ~i39;
                    int i41 = ~(i40 | (-142));
                    int i42 = ~i39;
                    int i43 = f232a + 87;
                    asInterface = i43 % 128;
                    int i44 = i43 % 2;
                    int i45 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i46 = ~((i42 & i45) | (i42 ^ i45));
                    int i47 = ((i39 * 483) - (-34122)) + ((-241) * ((i46 & i41) | (i41 ^ i46)));
                    int i48 = (i39 | 141) * (-482);
                    int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                    int i50 = ~((i39 & (-142)) | ((-142) ^ i39));
                    int i51 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i52 = ~((i51 & i40) | (i40 ^ i51) | 141);
                    int i53 = -(-(((i50 & i52) | (i50 ^ i52)) * 241));
                    int i54 = (i49 ^ i53) + ((i53 & i49) << 1);
                    int i55 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 4;
                    int i56 = f232a;
                    int i57 = (i56 ^ 91) + ((i56 & 91) << 1);
                    asInterface = i57 % 128;
                    int i58 = i57 % 2;
                    int offsetBefore = TextUtils.getOffsetBefore("", 0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i59 = (offsetBefore * 465) - 5499514;
                    int i60 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i61 = ~(((-11879) ^ i60) | ((-11879) & i60));
                    int i62 = ~((-11879) | offsetBefore);
                    int i63 = (i61 ^ i62) | (i62 & i61);
                    int i64 = ~((i60 & offsetBefore) | (i60 ^ offsetBefore));
                    int i65 = 464 * ((i64 & i63) | (i63 ^ i64));
                    int i66 = (i59 & i65) + (i59 | i65);
                    int i67 = ~offsetBefore;
                    int i68 = (i67 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ i67);
                    int i69 = i66 + (((i68 & (-11879)) | (i68 ^ (-11879))) * (-464));
                    int i70 = ~(((-11879) ^ offsetBefore) | ((-11879) & offsetBefore));
                    int i71 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & offsetBefore) | (offsetBefore ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    Object[] objArr5 = new Object[1];
                    c(i54, i55, (char) ((i69 - (~(((i71 & i70) | (i70 ^ i71)) * 464))) - 1), objArr5);
                    int i72 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                    int i73 = -i72;
                    int i74 = ((i72 & i73) | (i72 ^ i73)) >> 31;
                    i5 = (i74 & (~(i & 1)) & (i | 1)) | ((~i74) & i);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                i5 = i;
            }
        } else if (context != 0) {
            i4 = i13 + 15;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int defaultSize2 = View.getDefaultSize(0, 0);
            int i110 = (defaultSize2 * (-743)) - 49038;
            int i111 = (defaultSize2 ^ 66) | (defaultSize2 & 66);
            int i210 = ~i111;
            int i211 = ~((defaultSize2 ^ i) | (defaultSize2 & i));
            int i212 = ((i210 ^ i211) | (i210 & i211) | (~((i ^ 66) | (i & 66)))) * (-744);
            int i213 = asInterface + 55;
            f232a = i213 % 128;
            int i214 = i213 % 2;
            int i215 = -(-i212);
            int i216 = (i110 & i215) + (i110 | i215);
            int i217 = ~i;
            int i218 = ~defaultSize2;
            int i219 = -(-(((~((i218 & (-67)) | (i218 ^ (-67)))) | i217) * 744));
            int i310 = (((i216 | i219) << 1) - (i219 ^ i216)) + ((i111 | i) * 744);
            int i311 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            Object[] objArr6 = new Object[1];
            c(i310, (i311 ^ 23) + ((i311 & 23) << 1), (char) (49055 - (~(-(-KeyEvent.getDeadChar(0, 0))))), objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            int i312 = asInterface;
            int i313 = ((i312 | 23) << 1) - (i312 ^ 23);
            f232a = i313 % 128;
            int i314 = i313 % 2;
            int i315 = 88 - (~(-KeyEvent.keyCodeFromString("")));
            int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L);
            int i316 = ((packedPositionChild2 | 19) << 1) - (packedPositionChild2 ^ 19);
            int i317 = -(-TextUtils.lastIndexOf("", '0'));
            Object[] objArr7 = new Object[1];
            c(i315, i316, (char) (((i317 | 1) << 1) - (i317 ^ 1)), objArr7);
            Object objInvoke2 = cls3.getMethod((String) objArr7[0], null).invoke(context, null);
            int i318 = 106 - (~(-(ViewConfiguration.getTouchSlop() >> 8)));
            int minimumFlingVelocity2 = ViewConfiguration.getMinimumFlingVelocity() >> 16;
            Object[] objArr8 = new Object[1];
            c(i318, (minimumFlingVelocity2 ^ 34) + ((minimumFlingVelocity2 & 34) << 1), (char) Drawable.resolveOpacity(0, 0), objArr8);
            Class<?> cls4 = Class.forName((String) objArr8[0]);
            int i319 = -View.MeasureSpec.makeMeasureSpec(0, 0);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int i410 = ~i319;
            int i411 = ~(i410 | (-142));
            int i412 = ~i319;
            int i413 = f232a + 87;
            asInterface = i413 % 128;
            int i414 = i413 % 2;
            int i415 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i416 = ~((i412 & i415) | (i412 ^ i415));
            int i417 = ((i319 * 483) - (-34122)) + ((-241) * ((i416 & i411) | (i411 ^ i416)));
            int i418 = (i319 | 141) * (-482);
            int i419 = ((i417 | i418) << 1) - (i418 ^ i417);
            int i510 = ~((i319 & (-142)) | ((-142) ^ i319));
            int i511 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i512 = ~((i511 & i410) | (i410 ^ i511) | 141);
            int i513 = -(-(((i510 & i512) | (i510 ^ i512)) * 241));
            int i514 = (i419 ^ i513) + ((i513 & i419) << 1);
            int i515 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 4;
            int i516 = f232a;
            int i517 = (i516 ^ 91) + ((i516 & 91) << 1);
            asInterface = i517 % 128;
            int i518 = i517 % 2;
            int offsetBefore2 = TextUtils.getOffsetBefore("", 0);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int i519 = (offsetBefore2 * 465) - 5499514;
            int i610 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            int i611 = ~(((-11879) ^ i610) | ((-11879) & i610));
            int i612 = ~((-11879) | offsetBefore2);
            int i613 = (i611 ^ i612) | (i612 & i611);
            int i614 = ~((i610 & offsetBefore2) | (i610 ^ offsetBefore2));
            int i615 = 464 * ((i614 & i613) | (i613 ^ i614));
            int i616 = (i519 & i615) + (i519 | i615);
            int i617 = ~offsetBefore2;
            int i618 = (i617 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 ^ i617);
            int i619 = i616 + (((i618 & (-11879)) | (i618 ^ (-11879))) * (-464));
            int i75 = ~(((-11879) ^ offsetBefore2) | ((-11879) & offsetBefore2));
            int i76 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & offsetBefore2) | (offsetBefore2 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
            Object[] objArr9 = new Object[1];
            c(i514, i515, (char) ((i619 - (~(((i76 & i75) | (i75 ^ i76)) * 464))) - 1), objArr9);
            int i77 = cls4.getField((String) objArr9[0]).getInt(objInvoke2) & 2;
            int i78 = -i77;
            int i79 = ((i77 & i78) | (i77 ^ i78)) >> 31;
            i5 = (i79 & (~(i & 1)) & (i | 1)) | ((~i79) & i);
        } else {
            i5 = i;
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 16949);
                int mode = View.MeasureSpec.getMode(0) + 2739;
                int iMyTid = (Process.myTid() >> 22) + 13;
                byte[] bArr = $$a;
                byte b = bArr[7];
                Object[] objArr10 = new Object[1];
                d(b, bArr[5], b, objArr10);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, mode, iMyTid, 1501733736, false, (String) objArr10[0], new Class[0]);
            }
            Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char c = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 16949);
                int iArgb = Color.argb(0, 0, 0, 0) + 2739;
                int i80 = 13 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr11 = new Object[1];
                d(b3, (short) (b3 | 51), b2, objArr11);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iArgb, i80, 47863026, false, (String) objArr11[0], null);
            }
            if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null))) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cBlue = (char) (16949 - Color.blue(0));
                    int i81 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2738;
                    int trimmedLength = 13 - TextUtils.getTrimmedLength("");
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[7];
                    Object[] objArr12 = new Object[1];
                    d((byte) (-bArr2[1]), (short) 103, b4, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cBlue, i81, trimmedLength, 631063962, false, (String) objArr12[0], null);
                }
                if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i82 = asInterface;
                        int i83 = (i82 & 59) + (i82 | 59);
                        f232a = i83 % 128;
                        int i84 = i83 % 2;
                        int i85 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i86 = i85 * (-1965);
                        int i87 = (i86 ^ 143664) + ((i86 & 143664) << 1);
                        int i88 = -(-(((i85 ^ (-147)) | (i85 & (-147))) * 983));
                        int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
                        int i90 = ~i85;
                        int i91 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                        int i92 = -(-(((~((i91 & (-147)) | ((-147) ^ i91))) | i90) * (-983)));
                        int i93 = ((i89 | i92) << 1) - (i89 ^ i92);
                        int i94 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                        int i95 = ~((i94 & i90) | (i90 ^ i94));
                        int i96 = ~i85;
                        int i97 = ~((i96 & 146) | (i96 ^ 146));
                        int i98 = -(-(((i97 & i95) | (i95 ^ i97)) * 983));
                        int i99 = ((i93 | i98) << 1) - (i98 ^ i93);
                        int i100 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i101 = i100 * (-1939);
                        int i102 = (i101 ^ 28159) + ((i101 & 28159) << 1);
                        int i103 = ((~(((-30) & i100) | ((-30) ^ i100))) | (~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | 29))) * (-970);
                        int i104 = (i102 & i103) + (i103 | i102);
                        int i105 = ~i100;
                        int i106 = (~(i105 | 29)) * 1940;
                        int i107 = ((i104 | i106) << 1) - (i106 ^ i104);
                        int i108 = ~(i105 | (-30));
                        int i109 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                        int i112 = ~((i109 & 29) | (i109 ^ 29));
                        Object[] objArr13 = new Object[1];
                        c(i99, i107 + (((i108 & i112) | (i108 ^ i112)) * 970), (char) TextUtils.getCapsMode("", 0, 0), objArr13);
                        Object[] objArr14 = {(String) objArr13[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                            int fadingEdgeLength = 993 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 8;
                            Object[] objArr15 = new Object[1];
                            d((byte) 52, (short) ($$b & 927), $$a[3], objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(capsMode, fadingEdgeLength, tapTimeout, 410748506, false, (String) objArr15[0], new Class[]{String.class});
                        }
                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr14)).longValue();
                        long j = 66129815;
                        long j2 = -115;
                        r29 = i5;
                        long j3 = i;
                        long j4 = -1;
                        long j5 = (j2 * j) + (j2 * jLongValue) + (((long) (-116)) * ((((j3 ^ j4) | j) | jLongValue) ^ j4));
                        long j6 = 116;
                        long j7 = jLongValue ^ j4;
                        long j8 = j5 + ((j | j3) * j6) + (j6 * (((j3 | j7) ^ j4) | (((j ^ j4) | j7) ^ j4))) + ((long) (-267048052));
                        int i113 = ~i;
                        int i114 = ((int) (j8 >> 32)) & ((-1019427974) + (((~(i113 | (-1075914793))) | (~((-352584067) | i113))) * (-184)) + (((-2143119872) | (~(1790535805 | i113)) | (~(1067205079 | i113))) * 184) + 1653719600);
                        int i115 = (int) j8;
                        int i116 = ~((int) Runtime.getRuntime().freeMemory());
                        int i117 = i115 & ((-913720739) + ((2079849343 | i116) * 184) + (((~(i116 | 463983485)) | 1794505306) * 184));
                        i10 = (i114 & i117) | (i114 ^ i117);
                    } else {
                        context = i5;
                        int doubleTapTimeout = 174 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int i118 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                        int iAlpha = Color.alpha(0);
                        int i119 = iAlpha * 193;
                        int i120 = (i119 ^ 8603361) + ((i119 & 8603361) << 1);
                        int i121 = ~i;
                        int i122 = ~iAlpha;
                        int i123 = asInterface;
                        int i124 = i123 + 35;
                        f232a = i124 % 128;
                        int i125 = i124 % 2;
                        int i126 = ~((i122 & 44577) | (i122 ^ 44577));
                        int i127 = ((i126 & i121) | (i121 ^ i126)) * (-192);
                        int i128 = ((i120 | i127) << 1) - (i120 ^ i127);
                        int i129 = ~iAlpha;
                        int i130 = ~((i129 ^ (-44578)) | (i129 & (-44578)));
                        int i131 = ~i;
                        int i132 = ~(((-44578) ^ i131) | ((-44578) & i131));
                        int i133 = ((i130 ^ i132) | (i130 & i132)) * (-384);
                        int i134 = (i128 ^ i133) + ((i128 & i133) << 1);
                        int i135 = (i122 ^ (-44578)) | (i122 & (-44578));
                        int i136 = ~((i135 & i) | (i135 ^ i));
                        int i137 = ((-44578) ^ i121) | ((-44578) & i121);
                        int i138 = ~((i137 & iAlpha) | (i137 ^ iAlpha));
                        int i139 = (i136 & i138) | (i136 ^ i138);
                        int i140 = i123 + 101;
                        f232a = i140 % 128;
                        int i141 = i140 % 2;
                        int i142 = (iAlpha & 44577) | (iAlpha ^ 44577);
                        int i143 = ~((i142 & i) | (i142 ^ i));
                        Object[] objArr16 = new Object[1];
                        c(doubleTapTimeout, i118, (char) (i134 + (DerHeader.TAG_CLASS_PRIVATE * ((i143 & i139) | (i139 ^ i143)))), objArr16);
                        str = (String) objArr16[0];
                        int i144 = -TextUtils.lastIndexOf("", '0', 0, 0);
                        int i145 = i144 * 765;
                        int i146 = ((i145 | (-265698)) << 1) - (i145 ^ (-265698));
                        int i147 = asInterface;
                        int i148 = (i147 ^ 17) + ((i147 & 17) << 1);
                        f232a = i148 % 128;
                        int i149 = i148 % 2;
                        int i150 = (i121 ^ i144) | (i121 & i144);
                        int i151 = ~i150;
                        int i152 = (i146 - (~(((174 ^ i151) | (i151 & 174)) * 764))) - 1;
                        int i153 = ~i144;
                        int i154 = ~((i153 ^ 174) | (i153 & 174));
                        int i155 = ~((i121 & 174) | (i121 ^ 174));
                        int i156 = -(-(((i155 & i154) | (i154 ^ i155)) * (-1528)));
                        int i157 = (i152 & i156) + (i156 | i152);
                        int i158 = ~i144;
                        int i159 = ~((i158 & 174) | (i158 ^ 174));
                        int i160 = ~((i144 & (-175)) | ((-175) ^ i144));
                        int i161 = (i160 & i159) | (i159 ^ i160);
                        int i162 = ~i150;
                        int i163 = i157 + (((i161 & i162) | (i161 ^ i162)) * 764);
                        int i164 = i147 - (-1);
                        f232a = i164 % 128;
                        int i165 = i164 % 2;
                        int threadPriority = Process.getThreadPriority(0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i166 = -(-(threadPriority * (-139)));
                        int i167 = ~(((-21) ^ threadPriority) | ((-21) & threadPriority));
                        int i168 = ~(((-21) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | ((-21) & iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                        int i169 = (((2820 ^ i166) + ((i166 & 2820) << 1)) - (~(((i167 ^ i168) | (i167 & i168)) * (-280)))) - 1;
                        int i170 = ~(((-21) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | ((-21) & iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                        int i171 = ~threadPriority;
                        int i172 = ~((i171 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i171 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                        int i173 = -(-(((i170 ^ i172) | (i172 & i170)) * 140));
                        int i174 = ((i169 | i173) << 1) - (i173 ^ i169);
                        int i175 = ((-21) ^ i171) | ((-21) & i171);
                        int i176 = ~((i175 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i175 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                        int i177 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                        int i178 = ((-21) & i177) | ((-21) ^ i177);
                        int i179 = ~((i178 & threadPriority) | (i178 ^ threadPriority));
                        int i180 = (i176 & i179) | (i176 ^ i179);
                        int i181 = ~threadPriority;
                        int i182 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                        int i183 = (i182 & i181) | (i181 ^ i182);
                        int i184 = ~((i183 & 20) | (i183 ^ 20));
                        int i185 = -(-(((i180 & i184) | (i180 ^ i184)) * 140));
                        int i186 = 13 - ((((i174 | i185) << 1) - (i185 ^ i174)) >> 6);
                        int i187 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int i188 = ~i187;
                        int i189 = ~i188;
                        int i190 = (i131 & i189) | (i131 ^ i189);
                        int i191 = ~(i188 | i187);
                        int i192 = (((i187 * (-721)) + 721) - (~(-(-(((i190 & i191) | (i190 ^ i191)) * 1444))))) - 1;
                        int i193 = f232a;
                        int i194 = ((i193 | 55) << 1) - (i193 ^ 55);
                        asInterface = i194 % 128;
                        int i195 = i194 % 2;
                        int i196 = ~((i187 ^ i) | (i187 & i));
                        int i197 = (i191 & i196) | (i191 ^ i196);
                        int i198 = ~(((-1) ^ i) | i);
                        int i199 = i192 + ((-1444) * ((i198 & i197) | (i197 ^ i198)));
                        int i200 = ~((i188 ^ (-1)) | i188);
                        int i201 = ~i187;
                        char c2 = (char) ((i199 - (~(-(-(((i201 & i200) | (i200 ^ i201)) * 722))))) - 1);
                        Object[] objArr17 = new Object[1];
                        c(i163, i186, c2, objArr17);
                        objArr = new Object[]{(String) objArr17[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cIndexOf = (char) (33602 - TextUtils.indexOf("", ""));
                            int iArgb2 = Color.argb(0, 0, 0, 0) + 3085;
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 26;
                            Object[] objArr18 = new Object[1];
                            d((byte) 52, (short) ($$b & 927), $$a[3], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iArgb2, iNormalizeMetaState, 1411172903, false, (String) objArr18[0], new Class[]{String.class});
                        }
                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                            int i202 = f232a;
                            i11 = (i202 & 9) + (i202 | 9);
                            asInterface = i11 % 128;
                            if (i11 % 2 == 0) {
                                i10 = 0;
                                r29 = context;
                            } else {
                                i10 = 1;
                                r29 = context;
                            }
                        } else {
                            i10 = 0;
                            r29 = context;
                        }
                    }
                    int i203 = -i10;
                    int i204 = ((i10 & i203) | (i10 ^ i203)) >> 31;
                    int i205 = (i204 & ((i & (-11)) | ((~i) & 10))) | ((~i204) & i);
                    int i206 = i2 & 32;
                    int i207 = asInterface + 45;
                    f232a = i207 % 128;
                    int i208 = i207 % 2;
                    int i209 = (i206 | (-i206)) >> 31;
                    i7 = (i205 & (~i209)) | (i209 & i);
                    r28 = r29;
                } else if (Build.VERSION.SDK_INT == 30) {
                    i6 = asInterface + 101;
                    f232a = i6 % 128;
                    if (i6 % 2 == 0) {
                        throw null;
                    }
                    i7 = i;
                    r28 = i5;
                } else {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i810 = asInterface;
                        int i811 = (i810 & 59) + (i810 | 59);
                        f232a = i811 % 128;
                        int i812 = i811 % 2;
                        int i813 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i814 = i813 * (-1965);
                        int i815 = (i814 ^ 143664) + ((i814 & 143664) << 1);
                        int i816 = -(-(((i813 ^ (-147)) | (i813 & (-147))) * 983));
                        int i817 = ((i815 | i816) << 1) - (i816 ^ i815);
                        int i910 = ~i813;
                        int i911 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                        int i912 = -(-(((~((i911 & (-147)) | ((-147) ^ i911))) | i910) * (-983)));
                        int i913 = ((i817 | i912) << 1) - (i817 ^ i912);
                        int i914 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                        int i915 = ~((i914 & i910) | (i910 ^ i914));
                        int i916 = ~i813;
                        int i917 = ~((i916 & 146) | (i916 ^ 146));
                        int i918 = -(-(((i917 & i915) | (i915 ^ i917)) * 983));
                        int i919 = ((i913 | i918) << 1) - (i918 ^ i913);
                        int i1010 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i1011 = i1010 * (-1939);
                        int i1012 = (i1011 ^ 28159) + ((i1011 & 28159) << 1);
                        int i1013 = ((~(((-30) & i1010) | ((-30) ^ i1010))) | (~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | 29))) * (-970);
                        int i1014 = (i1012 & i1013) + (i1013 | i1012);
                        int i1015 = ~i1010;
                        int i1016 = (~(i1015 | 29)) * 1940;
                        int i1017 = ((i1014 | i1016) << 1) - (i1016 ^ i1014);
                        int i1018 = ~(i1015 | (-30));
                        int i1019 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                        int i1110 = ~((i1019 & 29) | (i1019 ^ 29));
                        Object[] objArr19 = new Object[1];
                        c(i919, i1017 + (((i1018 & i1110) | (i1018 ^ i1110)) * 970), (char) TextUtils.getCapsMode("", 0, 0), objArr19);
                        Object[] objArr110 = {(String) objArr19[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
                            int fadingEdgeLength2 = 993 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 8;
                            Object[] objArr111 = new Object[1];
                            d((byte) 52, (short) ($$b & 927), $$a[3], objArr111);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(capsMode2, fadingEdgeLength2, tapTimeout2, 410748506, false, (String) objArr111[0], new Class[]{String.class});
                        }
                        long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr110)).longValue();
                        long j9 = 66129815;
                        long j10 = -115;
                        r29 = i5;
                        long j11 = i;
                        long j12 = -1;
                        long j13 = (j10 * j9) + (j10 * jLongValue2) + (((long) (-116)) * ((((j11 ^ j12) | j9) | jLongValue2) ^ j12));
                        long j14 = 116;
                        long j15 = jLongValue2 ^ j12;
                        long j16 = j13 + ((j9 | j11) * j14) + (j14 * (((j11 | j15) ^ j12) | (((j9 ^ j12) | j15) ^ j12))) + ((long) (-267048052));
                        int i1111 = ~i;
                        int i1112 = ((int) (j16 >> 32)) & ((-1019427974) + (((~(i1111 | (-1075914793))) | (~((-352584067) | i1111))) * (-184)) + (((-2143119872) | (~(1790535805 | i1111)) | (~(1067205079 | i1111))) * 184) + 1653719600);
                        int i1113 = (int) j16;
                        int i1114 = ~((int) Runtime.getRuntime().freeMemory());
                        int i1115 = i1113 & ((-913720739) + ((2079849343 | i1114) * 184) + (((~(i1114 | 463983485)) | 1794505306) * 184));
                        i10 = (i1112 & i1115) | (i1112 ^ i1115);
                    } else {
                        context = i5;
                        int doubleTapTimeout2 = 174 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int i1116 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                        int iAlpha2 = Color.alpha(0);
                        int i1117 = iAlpha2 * 193;
                        int i1210 = (i1117 ^ 8603361) + ((i1117 & 8603361) << 1);
                        int i1211 = ~i;
                        int i1212 = ~iAlpha2;
                        int i1213 = asInterface;
                        int i1214 = i1213 + 35;
                        f232a = i1214 % 128;
                        int i1215 = i1214 % 2;
                        int i1216 = ~((i1212 & 44577) | (i1212 ^ 44577));
                        int i1217 = ((i1216 & i1211) | (i1211 ^ i1216)) * (-192);
                        int i1218 = ((i1210 | i1217) << 1) - (i1210 ^ i1217);
                        int i1219 = ~iAlpha2;
                        int i1310 = ~((i1219 ^ (-44578)) | (i1219 & (-44578)));
                        int i1311 = ~i;
                        int i1312 = ~(((-44578) ^ i1311) | ((-44578) & i1311));
                        int i1313 = ((i1310 ^ i1312) | (i1310 & i1312)) * (-384);
                        int i1314 = (i1218 ^ i1313) + ((i1218 & i1313) << 1);
                        int i1315 = (i1212 ^ (-44578)) | (i1212 & (-44578));
                        int i1316 = ~((i1315 & i) | (i1315 ^ i));
                        int i1317 = ((-44578) ^ i1211) | ((-44578) & i1211);
                        int i1318 = ~((i1317 & iAlpha2) | (i1317 ^ iAlpha2));
                        int i1319 = (i1316 & i1318) | (i1316 ^ i1318);
                        int i1410 = i1213 + 101;
                        f232a = i1410 % 128;
                        int i1411 = i1410 % 2;
                        int i1412 = (iAlpha2 & 44577) | (iAlpha2 ^ 44577);
                        int i1413 = ~((i1412 & i) | (i1412 ^ i));
                        Object[] objArr112 = new Object[1];
                        c(doubleTapTimeout2, i1116, (char) (i1314 + (DerHeader.TAG_CLASS_PRIVATE * ((i1413 & i1319) | (i1319 ^ i1413)))), objArr112);
                        str = (String) objArr112[0];
                        int i1414 = -TextUtils.lastIndexOf("", '0', 0, 0);
                        int i1415 = i1414 * 765;
                        int i1416 = ((i1415 | (-265698)) << 1) - (i1415 ^ (-265698));
                        int i1417 = asInterface;
                        int i1418 = (i1417 ^ 17) + ((i1417 & 17) << 1);
                        f232a = i1418 % 128;
                        int i1419 = i1418 % 2;
                        int i1510 = (i1211 ^ i1414) | (i1211 & i1414);
                        int i1511 = ~i1510;
                        int i1512 = (i1416 - (~(((174 ^ i1511) | (i1511 & 174)) * 764))) - 1;
                        int i1513 = ~i1414;
                        int i1514 = ~((i1513 ^ 174) | (i1513 & 174));
                        int i1515 = ~((i1211 & 174) | (i1211 ^ 174));
                        int i1516 = -(-(((i1515 & i1514) | (i1514 ^ i1515)) * (-1528)));
                        int i1517 = (i1512 & i1516) + (i1516 | i1512);
                        int i1518 = ~i1414;
                        int i1519 = ~((i1518 & 174) | (i1518 ^ 174));
                        int i1610 = ~((i1414 & (-175)) | ((-175) ^ i1414));
                        int i1611 = (i1610 & i1519) | (i1519 ^ i1610);
                        int i1612 = ~i1510;
                        int i1613 = i1517 + (((i1611 & i1612) | (i1611 ^ i1612)) * 764);
                        int i1614 = i1417 - (-1);
                        f232a = i1614 % 128;
                        int i1615 = i1614 % 2;
                        int threadPriority2 = Process.getThreadPriority(0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i1616 = -(-(threadPriority2 * (-139)));
                        int i1617 = ~(((-21) ^ threadPriority2) | ((-21) & threadPriority2));
                        int i1618 = ~(((-21) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | ((-21) & iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                        int i1619 = (((2820 ^ i1616) + ((i1616 & 2820) << 1)) - (~(((i1617 ^ i1618) | (i1617 & i1618)) * (-280)))) - 1;
                        int i1710 = ~(((-21) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | ((-21) & iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                        int i1711 = ~threadPriority2;
                        int i1712 = ~((i1711 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (i1711 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                        int i1713 = -(-(((i1710 ^ i1712) | (i1712 & i1710)) * 140));
                        int i1714 = ((i1619 | i1713) << 1) - (i1713 ^ i1619);
                        int i1715 = ((-21) ^ i1711) | ((-21) & i1711);
                        int i1716 = ~((i1715 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (i1715 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                        int i1717 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                        int i1718 = ((-21) & i1717) | ((-21) ^ i1717);
                        int i1719 = ~((i1718 & threadPriority2) | (i1718 ^ threadPriority2));
                        int i1810 = (i1716 & i1719) | (i1716 ^ i1719);
                        int i1811 = ~threadPriority2;
                        int i1812 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                        int i1813 = (i1812 & i1811) | (i1811 ^ i1812);
                        int i1814 = ~((i1813 & 20) | (i1813 ^ 20));
                        int i1815 = -(-(((i1810 & i1814) | (i1810 ^ i1814)) * 140));
                        int i1816 = 13 - ((((i1714 | i1815) << 1) - (i1815 ^ i1714)) >> 6);
                        int i1817 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int i1818 = ~i1817;
                        int i1819 = ~i1818;
                        int i1910 = (i1311 & i1819) | (i1311 ^ i1819);
                        int i1911 = ~(i1818 | i1817);
                        int i1912 = (((i1817 * (-721)) + 721) - (~(-(-(((i1910 & i1911) | (i1910 ^ i1911)) * 1444))))) - 1;
                        int i1913 = f232a;
                        int i1914 = ((i1913 | 55) << 1) - (i1913 ^ 55);
                        asInterface = i1914 % 128;
                        int i1915 = i1914 % 2;
                        int i1916 = ~((i1817 ^ i) | (i1817 & i));
                        int i1917 = (i1911 & i1916) | (i1911 ^ i1916);
                        int i1918 = ~(((-1) ^ i) | i);
                        int i1919 = i1912 + ((-1444) * ((i1918 & i1917) | (i1917 ^ i1918)));
                        int i2010 = ~((i1818 ^ (-1)) | i1818);
                        int i2011 = ~i1817;
                        char c3 = (char) ((i1919 - (~(-(-(((i2011 & i2010) | (i2010 ^ i2011)) * 722))))) - 1);
                        Object[] objArr113 = new Object[1];
                        c(i1613, i1816, c3, objArr113);
                        objArr = new Object[]{(String) objArr113[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cIndexOf2 = (char) (33602 - TextUtils.indexOf("", ""));
                            int iArgb3 = Color.argb(0, 0, 0, 0) + 3085;
                            int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 26;
                            Object[] objArr114 = new Object[1];
                            d((byte) 52, (short) ($$b & 927), $$a[3], objArr114);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf2, iArgb3, iNormalizeMetaState2, 1411172903, false, (String) objArr114[0], new Class[]{String.class});
                        }
                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                            int i2012 = f232a;
                            i11 = (i2012 & 9) + (i2012 | 9);
                            asInterface = i11 % 128;
                            if (i11 % 2 == 0) {
                                i10 = 0;
                                r29 = context;
                            } else {
                                i10 = 1;
                                r29 = context;
                            }
                        } else {
                            i10 = 0;
                            r29 = context;
                        }
                    }
                    int i2013 = -i10;
                    int i2014 = ((i10 & i2013) | (i10 ^ i2013)) >> 31;
                    int i2015 = (i2014 & ((i & (-11)) | ((~i) & 10))) | ((~i2014) & i);
                    int i2016 = i2 & 32;
                    int i2017 = asInterface + 45;
                    f232a = i2017 % 128;
                    int i2018 = i2017 % 2;
                    int i2019 = (i2016 | (-i2016)) >> 31;
                    i7 = (i2015 & (~i2019)) | (i2019 & i);
                    r28 = r29;
                }
            } else if (Build.VERSION.SDK_INT == 30) {
                i6 = asInterface + 101;
                f232a = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
                i7 = i;
                r28 = i5;
            } else {
                try {
                    try {
                        if (Build.VERSION.SDK_INT > 33) {
                            int i818 = asInterface;
                            int i819 = (i818 & 59) + (i818 | 59);
                            f232a = i819 % 128;
                            int i8110 = i819 % 2;
                            int i8111 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i8112 = i8111 * (-1965);
                            int i8113 = (i8112 ^ 143664) + ((i8112 & 143664) << 1);
                            int i8114 = -(-(((i8111 ^ (-147)) | (i8111 & (-147))) * 983));
                            int i8115 = ((i8113 | i8114) << 1) - (i8114 ^ i8113);
                            int i9110 = ~i8111;
                            int i9111 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                            int i9112 = -(-(((~((i9111 & (-147)) | ((-147) ^ i9111))) | i9110) * (-983)));
                            int i9113 = ((i8115 | i9112) << 1) - (i8115 ^ i9112);
                            int i9114 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                            int i9115 = ~((i9114 & i9110) | (i9110 ^ i9114));
                            int i9116 = ~i8111;
                            int i9117 = ~((i9116 & 146) | (i9116 ^ 146));
                            int i9118 = -(-(((i9117 & i9115) | (i9115 ^ i9117)) * 983));
                            int i9119 = ((i9113 | i9118) << 1) - (i9118 ^ i9113);
                            int i10110 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i10111 = i10110 * (-1939);
                            int i10112 = (i10111 ^ 28159) + ((i10111 & 28159) << 1);
                            int i10113 = ((~(((-30) & i10110) | ((-30) ^ i10110))) | (~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault13) | 29))) * (-970);
                            int i10114 = (i10112 & i10113) + (i10113 | i10112);
                            int i10115 = ~i10110;
                            int i10116 = (~(i10115 | 29)) * 1940;
                            int i10117 = ((i10114 | i10116) << 1) - (i10116 ^ i10114);
                            int i10118 = ~(i10115 | (-30));
                            int i10119 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                            int i1118 = ~((i10119 & 29) | (i10119 ^ 29));
                            Object[] objArr115 = new Object[1];
                            c(i9119, i10117 + (((i10118 & i1118) | (i10118 ^ i1118)) * 970), (char) TextUtils.getCapsMode("", 0, 0), objArr115);
                            try {
                                Object[] objArr116 = {(String) objArr115[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char capsMode3 = (char) TextUtils.getCapsMode("", 0, 0);
                                    int fadingEdgeLength3 = 993 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                    int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 8;
                                    Object[] objArr117 = new Object[1];
                                    d((byte) 52, (short) ($$b & 927), $$a[3], objArr117);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(capsMode3, fadingEdgeLength3, tapTimeout3, 410748506, false, (String) objArr117[0], new Class[]{String.class});
                                }
                                long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr116)).longValue();
                                long j17 = 66129815;
                                long j18 = -115;
                                r29 = i5;
                                long j19 = i;
                                long j110 = -1;
                                long j111 = (j18 * j17) + (j18 * jLongValue3) + (((long) (-116)) * ((((j19 ^ j110) | j17) | jLongValue3) ^ j110));
                                long j112 = 116;
                                long j113 = jLongValue3 ^ j110;
                                long j114 = j111 + ((j17 | j19) * j112) + (j112 * (((j19 | j113) ^ j110) | (((j17 ^ j110) | j113) ^ j110))) + ((long) (-267048052));
                                int i1119 = ~i;
                                int i11110 = ((int) (j114 >> 32)) & ((-1019427974) + (((~(i1119 | (-1075914793))) | (~((-352584067) | i1119))) * (-184)) + (((-2143119872) | (~(1790535805 | i1119)) | (~(1067205079 | i1119))) * 184) + 1653719600);
                                int i11111 = (int) j114;
                                int i11112 = ~((int) Runtime.getRuntime().freeMemory());
                                int i11113 = i11111 & ((-913720739) + ((2079849343 | i11112) * 184) + (((~(i11112 | 463983485)) | 1794505306) * 184));
                                i10 = (i11110 & i11113) | (i11110 ^ i11113);
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        } else {
                            context = i5;
                            int doubleTapTimeout3 = 174 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int i11114 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                            int iAlpha3 = Color.alpha(0);
                            int i11115 = iAlpha3 * 193;
                            int i12110 = (i11115 ^ 8603361) + ((i11115 & 8603361) << 1);
                            int i12111 = ~i;
                            int i12112 = ~iAlpha3;
                            int i12113 = asInterface;
                            int i12114 = i12113 + 35;
                            f232a = i12114 % 128;
                            int i12115 = i12114 % 2;
                            int i12116 = ~((i12112 & 44577) | (i12112 ^ 44577));
                            int i12117 = ((i12116 & i12111) | (i12111 ^ i12116)) * (-192);
                            int i12118 = ((i12110 | i12117) << 1) - (i12110 ^ i12117);
                            int i12119 = ~iAlpha3;
                            int i13110 = ~((i12119 ^ (-44578)) | (i12119 & (-44578)));
                            int i13111 = ~i;
                            int i13112 = ~(((-44578) ^ i13111) | ((-44578) & i13111));
                            int i13113 = ((i13110 ^ i13112) | (i13110 & i13112)) * (-384);
                            int i13114 = (i12118 ^ i13113) + ((i12118 & i13113) << 1);
                            int i13115 = (i12112 ^ (-44578)) | (i12112 & (-44578));
                            int i13116 = ~((i13115 & i) | (i13115 ^ i));
                            int i13117 = ((-44578) ^ i12111) | ((-44578) & i12111);
                            int i13118 = ~((i13117 & iAlpha3) | (i13117 ^ iAlpha3));
                            int i13119 = (i13116 & i13118) | (i13116 ^ i13118);
                            int i14110 = i12113 + 101;
                            f232a = i14110 % 128;
                            int i14111 = i14110 % 2;
                            int i14112 = (iAlpha3 & 44577) | (iAlpha3 ^ 44577);
                            int i14113 = ~((i14112 & i) | (i14112 ^ i));
                            Object[] objArr118 = new Object[1];
                            c(doubleTapTimeout3, i11114, (char) (i13114 + (DerHeader.TAG_CLASS_PRIVATE * ((i14113 & i13119) | (i13119 ^ i14113)))), objArr118);
                            str = (String) objArr118[0];
                            int i14114 = -TextUtils.lastIndexOf("", '0', 0, 0);
                            int i14115 = i14114 * 765;
                            int i14116 = ((i14115 | (-265698)) << 1) - (i14115 ^ (-265698));
                            int i14117 = asInterface;
                            int i14118 = (i14117 ^ 17) + ((i14117 & 17) << 1);
                            f232a = i14118 % 128;
                            int i14119 = i14118 % 2;
                            int i15110 = (i12111 ^ i14114) | (i12111 & i14114);
                            int i15111 = ~i15110;
                            int i15112 = (i14116 - (~(((174 ^ i15111) | (i15111 & 174)) * 764))) - 1;
                            int i15113 = ~i14114;
                            int i15114 = ~((i15113 ^ 174) | (i15113 & 174));
                            int i15115 = ~((i12111 & 174) | (i12111 ^ 174));
                            int i15116 = -(-(((i15115 & i15114) | (i15114 ^ i15115)) * (-1528)));
                            int i15117 = (i15112 & i15116) + (i15116 | i15112);
                            int i15118 = ~i14114;
                            int i15119 = ~((i15118 & 174) | (i15118 ^ 174));
                            int i16110 = ~((i14114 & (-175)) | ((-175) ^ i14114));
                            int i16111 = (i16110 & i15119) | (i15119 ^ i16110);
                            int i16112 = ~i15110;
                            int i16113 = i15117 + (((i16111 & i16112) | (i16111 ^ i16112)) * 764);
                            int i16114 = i14117 - (-1);
                            f232a = i16114 % 128;
                            int i16115 = i16114 % 2;
                            int threadPriority3 = Process.getThreadPriority(0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault14 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i16116 = -(-(threadPriority3 * (-139)));
                            int i16117 = ~(((-21) ^ threadPriority3) | ((-21) & threadPriority3));
                            int i16118 = ~(((-21) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault14) | ((-21) & iTuitionPaymentFragmentspecialinlinedviewModeldefault14));
                            int i16119 = (((2820 ^ i16116) + ((i16116 & 2820) << 1)) - (~(((i16117 ^ i16118) | (i16117 & i16118)) * (-280)))) - 1;
                            int i17110 = ~(((-21) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault14) | ((-21) & iTuitionPaymentFragmentspecialinlinedviewModeldefault14));
                            int i17111 = ~threadPriority3;
                            int i17112 = ~((i17111 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault14) | (i17111 & iTuitionPaymentFragmentspecialinlinedviewModeldefault14));
                            int i17113 = -(-(((i17110 ^ i17112) | (i17112 & i17110)) * 140));
                            int i17114 = ((i16119 | i17113) << 1) - (i17113 ^ i16119);
                            int i17115 = ((-21) ^ i17111) | ((-21) & i17111);
                            int i17116 = ~((i17115 & iTuitionPaymentFragmentspecialinlinedviewModeldefault14) | (i17115 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault14));
                            int i17117 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                            int i17118 = ((-21) & i17117) | ((-21) ^ i17117);
                            int i17119 = ~((i17118 & threadPriority3) | (i17118 ^ threadPriority3));
                            int i18110 = (i17116 & i17119) | (i17116 ^ i17119);
                            int i18111 = ~threadPriority3;
                            int i18112 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                            int i18113 = (i18112 & i18111) | (i18111 ^ i18112);
                            int i18114 = ~((i18113 & 20) | (i18113 ^ 20));
                            int i18115 = -(-(((i18110 & i18114) | (i18110 ^ i18114)) * 140));
                            int i18116 = 13 - ((((i17114 | i18115) << 1) - (i18115 ^ i17114)) >> 6);
                            int i18117 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int i18118 = ~i18117;
                            int i18119 = ~i18118;
                            int i19110 = (i13111 & i18119) | (i13111 ^ i18119);
                            int i19111 = ~(i18118 | i18117);
                            int i19112 = (((i18117 * (-721)) + 721) - (~(-(-(((i19110 & i19111) | (i19110 ^ i19111)) * 1444))))) - 1;
                            int i19113 = f232a;
                            int i19114 = ((i19113 | 55) << 1) - (i19113 ^ 55);
                            asInterface = i19114 % 128;
                            int i19115 = i19114 % 2;
                            int i19116 = ~((i18117 ^ i) | (i18117 & i));
                            int i19117 = (i19111 & i19116) | (i19111 ^ i19116);
                            int i19118 = ~(((-1) ^ i) | i);
                            int i19119 = i19112 + ((-1444) * ((i19118 & i19117) | (i19117 ^ i19118)));
                            int i20110 = ~((i18118 ^ (-1)) | i18118);
                            int i20111 = ~i18117;
                            char c4 = (char) ((i19119 - (~(-(-(((i20111 & i20110) | (i20110 ^ i20111)) * 722))))) - 1);
                            Object[] objArr119 = new Object[1];
                            c(i16113, i18116, c4, objArr119);
                            try {
                                objArr = new Object[]{(String) objArr119[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cIndexOf3 = (char) (33602 - TextUtils.indexOf("", ""));
                                    int iArgb4 = Color.argb(0, 0, 0, 0) + 3085;
                                    int iNormalizeMetaState3 = KeyEvent.normalizeMetaState(0) + 26;
                                    Object[] objArr1110 = new Object[1];
                                    d((byte) 52, (short) ($$b & 927), $$a[3], objArr1110);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf3, iArgb4, iNormalizeMetaState3, 1411172903, false, (String) objArr1110[0], new Class[]{String.class});
                                }
                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                    int i20112 = f232a;
                                    i11 = (i20112 & 9) + (i20112 | 9);
                                    asInterface = i11 % 128;
                                    if (i11 % 2 == 0) {
                                        i10 = 0;
                                        r29 = context;
                                    } else {
                                        i10 = 1;
                                        r29 = context;
                                    }
                                } else {
                                    i10 = 0;
                                    r29 = context;
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
                    context = i5;
                }
                int i20113 = -i10;
                int i20114 = ((i10 & i20113) | (i10 ^ i20113)) >> 31;
                int i20115 = (i20114 & ((i & (-11)) | ((~i) & 10))) | ((~i20114) & i);
                int i20116 = i2 & 32;
                int i20117 = asInterface + 45;
                f232a = i20117 % 128;
                int i20118 = i20117 % 2;
                int i20119 = (i20116 | (-i20116)) >> 31;
                i7 = (i20115 & (~i20119)) | (i20119 & i);
                r28 = r29;
            }
            ?? r3 = i ^ r28;
            int i220 = -(r3 == true ? 1 : 0);
            int i221 = (((r3 == true ? 1 : 0) & i220) | ((r3 == true ? 1 : 0) ^ i220)) >> 31;
            int i222 = i7 & (~i221);
            int i223 = r28 & i221;
            int i224 = (i222 & i223) | (i222 ^ i223);
            Object[] objArr20 = new Object[4];
            int[] iArr = new int[1];
            objArr20[0] = iArr;
            objArr20[1] = new int[1];
            int[] iArr2 = new int[1];
            objArr20[2] = iArr2;
            int i225 = f232a;
            int i226 = (i225 ^ 103) + ((i225 & 103) << 1);
            asInterface = i226 % 128;
            if (i226 % 2 == 0) {
                int i227 = ((~i224) & i) | ((~i) & i224);
                int i228 = -i227;
                int i229 = ((i227 & i228) | (i227 ^ i228)) % 3;
                i8 = (i229 & 29) | ((~i229) & 1);
            } else {
                int i230 = i ^ i224;
                int i231 = -i230;
                i8 = (((i230 & i231) | (i230 ^ i231)) >> 31) & 16;
            }
            int i232 = (i225 ^ 63) + ((i225 & 63) << 1);
            int i233 = i232 % 128;
            asInterface = i233;
            int i234 = i232 % 2;
            iArr[0] = i;
            iArr2[0] = i224;
            int i235 = ((i233 | 97) << 1) - (i233 ^ 97);
            f232a = i235 % 128;
            if (i235 % 2 != 0) {
                objArr20[4] = null;
                int i236 = ~i;
                i9 = (((((~(727019671 | i236)) | (~(i | 767329900))) * 959) - 1397526129) + (((~(i236 | 767329900)) | (~(i | 727019671))) * 959)) / i8;
            } else {
                objArr20[3] = null;
                int iMyUid = Process.myUid();
                i9 = 114271668 + (((~(392905649 | iMyUid)) | 273484 | (~((-352595421) | iMyUid))) * (-744)) + (((~iMyUid) | 40583713) * 744) + ((iMyUid | (-273485)) * 744) + i8;
            }
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault15 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int i237 = ((-751) * i9) + (i3 * (-751));
            int i238 = ~i9;
            int i239 = ~i3;
            int i240 = ~((i239 & i238) | (i238 ^ i239));
            int i241 = ~(i238 | iTuitionPaymentFragmentspecialinlinedviewModeldefault15);
            int i242 = ((i240 & i241) | (i240 ^ i241)) * 1504;
            int i243 = (i237 ^ i242) + ((i237 & i242) << 1);
            int i244 = (i238 ^ i3) | (i238 & i3);
            int i245 = (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault15 & i244) | (i244 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault15))) * (-1504);
            int i246 = (i243 ^ i245) + ((i245 & i243) << 1);
            int i247 = ~((i238 ^ i3) | (i238 & i3));
            int i248 = ~i3;
            int i249 = ~((i248 & i9) | (i248 ^ i9));
            int i250 = ((i247 & i249) | (i247 ^ i249)) * 752;
            int i251 = (i246 & i250) + (i250 | i246);
            int i252 = (i251 << 13) ^ i251;
            int i253 = i252 >>> 17;
            int i254 = ((~i252) & i253) | ((~i253) & i252);
            int i255 = i254 << 5;
            ((int[]) objArr20[1])[0] = ((~i254) & i255) | ((~i255) & i254);
            return objArr20;
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
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
    private static java.lang.String $$e(int r6, byte r7, int r8) {
        /*
            byte[] r0 = defpackage.TakePictureManagerExternalSyntheticLambda2.$$c
            int r6 = r6 * 3
            int r1 = r6 + 1
            int r8 = r8 * 3
            int r8 = r8 + 109
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r8 = r8 + 1
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.TakePictureManagerExternalSyntheticLambda2.$$e(int, byte, int):java.lang.String");
    }
}
