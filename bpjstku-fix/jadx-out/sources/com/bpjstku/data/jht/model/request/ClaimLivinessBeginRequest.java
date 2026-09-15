package com.bpjstku.data.jht.model.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/bpjstku/data/jht/model/request/ClaimLivinessBeginRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jht/model/request/ClaimLivinessBeginRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", "nik", "getNik"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ClaimLivinessBeginRequest extends BaseRequest {
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static long b;

    @SerializedName("email")
    private final String email;

    @SerializedName("nik")
    private final String nik;
    private static final byte[] $$c = {21, 65, -9, -121};
    private static final int $$f = 48;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {14, 70, 6, -35, -7, 22, -27, 26, 18, -4, 3, 26, -4, 12, 0, -30, 58, 4, 8, 8, -27, 26, 19, 11, -9, 21, 8, 6, 40, -5, 18, -4, 13, 6, -23, 24, 31, -5, -1, 16, 13, -39, 51, -10, 13, 13, -1, 16, 13, -11, 14, 12, -3, 12, 12, 0, -23, 44, -1, 13, -4, 26, -8, 20, -58};
    private static final int $$e = 167;
    private static final byte[] $$a = {104, 27, -72, 120, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 196;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f387a = 0;
    private static int g = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 52
            int r5 = 55 - r5
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r7 = r7 * 52
            int r0 = r7 + 1
            byte[] r1 = com.bpjstku.data.jht.model.request.ClaimLivinessBeginRequest.$$a
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L16
            r3 = r2
            r2 = r5
            goto L31
        L16:
            r4 = r6
            r6 = r5
            r5 = r4
        L19:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r0[r2] = r3
            if (r2 != r7) goto L29
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L29:
            int r6 = r6 + 1
            r3 = r1[r6]
            r4 = r2
            r2 = r6
            r6 = r3
            r3 = r4
        L31:
            int r6 = -r6
            int r5 = r5 + r6
            int r5 = r5 + (-11)
            r6 = r2
            r2 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.model.request.ClaimLivinessBeginRequest.c(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 13
            int r6 = 38 - r6
            int r7 = r7 * 31
            int r7 = r7 + 84
            int r5 = r5 * 24
            int r5 = 28 - r5
            byte[] r0 = com.bpjstku.data.jht.model.request.ClaimLivinessBeginRequest.$$d
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r4 = r0[r5]
        L28:
            int r7 = r7 + r4
            int r7 = r7 + (-7)
            int r5 = r5 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.model.request.ClaimLivinessBeginRequest.e(int, int, int, java.lang.Object[]):void");
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = f387a + 29;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        String str = this.email;
        int i5 = i3 + 31;
        f387a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getNik() {
        int i = 2 % 2;
        int i2 = f387a;
        int i3 = i2 + 5;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.nik;
        int i4 = i2 + 39;
        g = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public ClaimLivinessBeginRequest(String str, String str2) {
        this.email = str;
        this.nik = str2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0276  */
    public final ClaimLivinessBeginRequest copy(String p0, String p1) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionChild = (char) (37566 - ExpandableListView.getPackedPositionChild(0L));
            int iIndexOf = TextUtils.indexOf("", "") + 625;
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 14;
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            byte b3 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, iIndexOf, maximumFlingVelocity, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new char[]{0, 0, 0, 0}, new char[]{24889, 52112, 55674, 65084}, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{38283, 1166, 1440, 5100, 25243, 8201, 27408, 29321, 25928, 43140, 39910, 14175, 48037, 11826, 16981, 21982, 29609, 61946, 39869, 4726, 47650, 43971}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new char[]{0, 0, 0, 0}, new char[]{39778, 56595, 2535, 34469}, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42249), (-404941925) - (ViewConfiguration.getTapTimeout() >> 16), new char[]{42806, 9472, 37392, 30501, 57873, 26384, 2165, 58145, 16819, 31218, 65226, 48609, 55452, 49662, 5330}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char doubleTapTimeout = (char) (37567 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 626;
            int i2 = 15 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            byte b4 = $$a[5];
            byte b5 = b4;
            Object[] objArr5 = new Object[1];
            c(b4, b5, b5, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, iLastIndexOf, i2, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cNormalizeMetaState = (char) (37567 - KeyEvent.normalizeMetaState(0));
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 625;
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 14;
                byte[] bArr2 = $$a;
                byte b6 = bArr2[7];
                byte b7 = bArr2[5];
                Object[] objArr6 = new Object[1];
                c(b6, b7, b7, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cNormalizeMetaState, scrollBarFadeDuration, packedPositionType, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i3 = ((int[]) objArr7[2])[0];
            int i4 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i4};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~iIdentityHashCode;
            int i6 = (((473238928 + ((1810613896 | i5) * (-369))) + (((~((-166445705) | i5)) | 1657292416) * (-369))) + ((((~(iIdentityHashCode | 166445704)) | 1644168192) | (~(i5 | (-153321481)))) * 369)) - 1727546521;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
            objArr = new Object[]{iArr, new int[1], new int[]{i3}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            d(new char[]{0, 0, 0, 0}, new char[]{42606, 42138, 15603, 9677}, (char) (View.resolveSize(0, 0) + 52540), View.MeasureSpec.getMode(0), new char[]{6524, 6171, 51810, 8502, 55183, 50248, 14585, 25078, 2457, 36500, 208, 18298, 13794, 4888, 52850, 31554, 59206, 46177, 55741, 23315, 32564, 8711, 22044, 47843, 27595, 65027}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new char[]{0, 0, 0, 0}, new char[]{59032, 57377, 58129, 5456}, (char) (20707 - View.combineMeasuredStates(0, 0)), Gravity.getAbsoluteGravity(0, 0), new char[]{4602, 4846, 54747, 61315, 31226, 12601, 665, 12698, 57622, 29, 44579, 52469, 41376, 54492, 30216, 15475, 34438, 14855}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    applicationContext = applicationContext.getApplicationContext();
                } else {
                    int i9 = f387a + 73;
                    g = i9 % 128;
                    int i10 = i9 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                }
            }
            int length = p0 != null ? p0.length() : 0;
            Object[] objArr10 = new Object[1];
            d(new char[]{0, 0, 0, 0}, new char[]{29750, 53519, 20863, 9959}, (char) View.MeasureSpec.getMode(0), View.combineMeasuredStates(0, 0), new char[]{41415, '4', 53518, 4221, 33778, 62022, 8377, 43246, 23251, 16248, 16971, 21405, 62452, 61439, 49385, 56208, 65240, 22269, 22083, 48465, 28420, 46407, 48413, 53394, 5854, 44381, 1640, 56710, 52087, 27416, 38729, 45829, 52727, 10305, 37805, 32135, 54008, 21738, 49744, 14845, 14138, 37318, 37372, 42732, 45674, 15874, 11507, 713, 18492, 60035, 42554, 45370, 45749, 64807, 12102, 47407, 61523, 64244, 44902, 53706, 8170, 25722, 672, 39101}, objArr10);
            String str = (String) objArr10[0];
            Object[] objArr11 = new Object[1];
            d(new char[]{0, 0, 0, 0}, new char[]{25746, 35380, 24558, 22943}, (char) View.MeasureSpec.getMode(0), KeyEvent.keyCodeFromString(""), new char[]{43871, 21881, 33652, 31121, 28867, 59001, 62957, 49146, 19683, 30921, 39040, 20172, 15925, 51903, 43725, 13952, 46960, 54346, 62578, 45803, 11012, 8319, 27732, 59364, 23578, 13415, 14770, 63597, 39975, 35413, 21758, 23643, 42794, 25900, 46986, 3669, 34212, 2951, 40530, 6397, 60883, 48742, 10763, 8201, 47416, 52866, 9731, 2069, 48501, 36344, 52066, 17626, 9349, 30218, 27564, 55682, 12438, 15553, 27507, 59640, 22181, 9866, 36334, 54856}, objArr11);
            String[] strArr2 = {str, (String) objArr11[0]};
            int i11 = g + 109;
            f387a = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr12 = {applicationContext, strArr2, Integer.valueOf(length), 17, -1727546521};
                byte[] bArr3 = $$d;
                byte b8 = (byte) (-bArr3[38]);
                byte b9 = b8;
                Object[] objArr13 = new Object[1];
                e(b8, b9, b9, objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                byte b10 = bArr3[14];
                byte b11 = b10;
                Object[] objArr14 = new Object[1];
                e(b10, b11, b11, objArr14);
                objArr = (Object[]) cls3.getMethod((String) objArr14[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                int i13 = ((int[]) objArr[0])[0];
                int i14 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cResolveOpacity = (char) (37567 - Drawable.resolveOpacity(0, 0));
                        int i15 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 625;
                        int mirror = '>' - AndroidCharacter.getMirror('0');
                        byte[] bArr4 = $$a;
                        byte b12 = bArr4[7];
                        byte b13 = bArr4[5];
                        Object[] objArr15 = new Object[1];
                        c(b12, b13, b13, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveOpacity, i15, mirror, -973632554, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        d(new char[]{0, 0, 0, 0}, new char[]{24889, 52112, 55674, 65084}, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), KeyEvent.getDeadChar(0, 0), new char[]{38283, 1166, 1440, 5100, 25243, 8201, 27408, 29321, 25928, 43140, 39910, 14175, 48037, 11826, 16981, 21982, 29609, 61946, 39869, 4726, 47650, 43971}, objArr16);
                        Class<?> cls4 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        d(new char[]{0, 0, 0, 0}, new char[]{39778, 56595, 2535, 34469}, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 42250), (-404941925) - KeyEvent.getDeadChar(0, 0), new char[]{42806, 9472, 37392, 30501, 57873, 26384, 2165, 58145, 16819, 31218, 65226, 48609, 55452, 49662, 5330}, objArr17);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char keyRepeatTimeout = (char) (37567 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                            int iResolveSize = 625 - View.resolveSize(0, 0);
                            int offsetAfter = 14 - TextUtils.getOffsetAfter("", 0);
                            byte b14 = $$a[5];
                            byte b15 = b14;
                            Object[] objArr18 = new Object[1];
                            c(b14, b15, b15, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout, iResolveSize, offsetAfter, -976899241, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char offsetAfter2 = (char) (37567 - TextUtils.getOffsetAfter("", 0));
                            int keyRepeatTimeout2 = 625 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 15;
                            byte[] bArr5 = $$a;
                            byte b16 = bArr5[5];
                            byte b17 = bArr5[7];
                            Object[] objArr19 = new Object[1];
                            c(b16, b17, b17, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetAfter2, keyRepeatTimeout2, iLastIndexOf2, -477065106, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i16 = g + 83;
                        f387a = i16 % 128;
                        int i17 = i16 % 2;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i18 = ((int[]) objArr[0])[0];
        int i19 = ((int[]) objArr[2])[0];
        if (i19 != i18) {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i20 = g + 19;
                f387a = i20 % 128;
                for (int i21 = i20 % 2 == 0 ? 0 : 1; i21 < strArr3.length; i21++) {
                    arrayList.add(strArr3[i21]);
                }
            }
            throw new RuntimeException(String.valueOf(i19));
        }
        int i22 = f387a + 25;
        g = i22 % 128;
        int i23 = i22 % 2;
        int i24 = ((int[]) objArr[1])[0];
        int i25 = ((int[]) objArr[2])[0];
        int i26 = ((int[]) objArr[0])[0];
        String[] strArr4 = (String[]) objArr[3];
        int[] iArr2 = {i25};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i27 = ~iIdentityHashCode2;
        int i28 = i24 + (-1997990248) + (((~((-1027871008) | i27)) | (~((-795867114) | iIdentityHashCode2))) * (-370)) + (((~(iIdentityHashCode2 | (-1027871008))) | (~(i27 | (-795867114))) | (-1064302592)) * (-370)) + 1345032192;
        int i29 = (i28 << 13) ^ i28;
        int i30 = i29 ^ (i29 >>> 17);
        ((int[]) objArr[1])[0] = i30 ^ (i30 << 5);
        Object[] objArr20 = {new int[]{i26}, new int[1], iArr2, strArr4};
        return new ClaimLivinessBeginRequest(p0, p1);
    }

    private static void d(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i5 = $11 + 21;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cBlue = (char) (8328 - Color.blue(i4));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1236;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i4, i4) + 36;
                    byte b2 = (byte) i2;
                    byte b3 = (byte) (b2 - 2);
                    String str$$g = $$g(b2, b3, (byte) (b3 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, iLastIndexOf, iIndexOf, -653973969, false, str$$g, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) i4;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 2764 - (ViewConfiguration.getLongPressTimeout() >> 16), 14 - View.resolveSize(i4, i4), 1504416861, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 43326), 252 - MotionEvent.axisFromString(""), 22 - TextUtils.indexOf("", ""), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - View.resolveSize(0, 0)), TextUtils.indexOf("", "") + 2891, 17 - TextUtils.indexOf("", ""), 2012627446, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) ((((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))) ^ (((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (b ^ (-6377398940819159759L)))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i7 = $10 + 113;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 5 / 3;
                }
                i2 = 2;
                i4 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
        int i9 = $10 + 23;
        $11 = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i = TuitionPaymentFragmentbindingInflater1 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ ClaimLivinessBeginRequest copy$default(ClaimLivinessBeginRequest claimLivinessBeginRequest, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = f387a + 125;
            int i4 = i3 % 128;
            g = i4;
            int i5 = i3 % 2;
            str = claimLivinessBeginRequest.email;
            int i6 = i4 + 61;
            f387a = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 2) != 0) {
            int i8 = g + 103;
            f387a = i8 % 128;
            if (i8 % 2 != 0) {
                String str3 = claimLivinessBeginRequest.nik;
                throw null;
            }
            str2 = claimLivinessBeginRequest.nik;
        }
        return claimLivinessBeginRequest.copy(str, str2);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = f387a + 47;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 == 0) {
            str = this.email;
            int i4 = 35 / 0;
        } else {
            str = this.email;
        }
        int i5 = i3 + 99;
        f387a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 39;
        f387a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.nik;
        int i5 = i2 + 3;
        f387a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r6 instanceof com.bpjstku.data.jht.model.request.ClaimLivinessBeginRequest) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = (com.bpjstku.data.jht.model.request.ClaimLivinessBeginRequest) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.email, r6.email) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.nik, r6.nik)) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 65;
        com.bpjstku.data.jht.model.request.ClaimLivinessBeginRequest.g = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.data.jht.model.request.ClaimLivinessBeginRequest.f387a
            int r2 = r1 + 31
            int r3 = r2 % 128
            com.bpjstku.data.jht.model.request.ClaimLivinessBeginRequest.g = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            r2 = 86
            int r2 = r2 / r4
            if (r5 != r6) goto L20
            goto L18
        L16:
            if (r5 != r6) goto L20
        L18:
            int r1 = r1 + 65
            int r6 = r1 % 128
            com.bpjstku.data.jht.model.request.ClaimLivinessBeginRequest.g = r6
            int r1 = r1 % r0
            return r3
        L20:
            boolean r0 = r6 instanceof com.bpjstku.data.jht.model.request.ClaimLivinessBeginRequest
            if (r0 != 0) goto L25
            return r4
        L25:
            com.bpjstku.data.jht.model.request.ClaimLivinessBeginRequest r6 = (com.bpjstku.data.jht.model.request.ClaimLivinessBeginRequest) r6
            java.lang.String r0 = r5.email
            java.lang.String r1 = r6.email
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L32
            return r4
        L32:
            java.lang.String r0 = r5.nik
            java.lang.String r6 = r6.nik
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            r6 = r6 ^ r3
            if (r6 == 0) goto L3e
            return r4
        L3e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.model.request.ClaimLivinessBeginRequest.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.email;
        int iHashCode2 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = g + 41;
            f387a = i2 % 128;
            int i3 = i2 % 2;
        }
        String str2 = this.nik;
        if (str2 != null) {
            int i4 = f387a + 91;
            g = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = str2.hashCode();
        }
        int i6 = (iHashCode * 31) + iHashCode2;
        int i7 = g + 49;
        f387a = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.email;
        String str2 = this.nik;
        StringBuilder sb = new StringBuilder("ClaimLivinessBeginRequest(email=");
        sb.append(str);
        sb.append(", nik=");
        sb.append(str2);
        sb.append(")");
        String string = sb.toString();
        int i2 = f387a + 3;
        g = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        b = -6377398940819159759L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -981105359;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 41916;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, short r8, byte r9) {
        /*
            int r8 = r8 * 2
            int r8 = 1 - r8
            int r7 = 104 - r7
            int r9 = r9 + 4
            byte[] r0 = com.bpjstku.data.jht.model.request.ClaimLivinessBeginRequest.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r8
            r3 = r9
            r5 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L21:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L28:
            int r7 = r7 + r9
            r9 = r3
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.model.request.ClaimLivinessBeginRequest.$$g(short, short, byte):java.lang.String");
    }
}
