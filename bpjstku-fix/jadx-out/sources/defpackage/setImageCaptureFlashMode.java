package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.google.android.gms.internal.identity.zzp;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class setImageCaptureFlashMode<T> {
    public volatile SoftReference<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new SoftReference<>(null);
    private static final byte[] $$c = {94, -56, 58, -24};
    private static final int $$d = 63;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {118, 35, -100, -35, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 177;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 7850011659973011382L;

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r0 = r7 + 1
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r5 = 145 - r5
            byte[] r1 = defpackage.setImageCaptureFlashMode.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L20:
            int r3 = r3 + 1
            r4 = r1[r5]
        L24:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            int r5 = r5 + 1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setImageCaptureFlashMode.c(int, int, byte, java.lang.Object[]):void");
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $10 + 125;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - TextUtils.getOffsetBefore("", 0)), 1356 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 38, 894276454, false, $$e(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (Process.myTid() >> 22)), 468 - (ViewConfiguration.getScrollBarSize() >> 8), 13 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i6 = $11 + 9;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 91 / 0;
        }
    }

    public final T TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function0<? extends T> function0) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(function0, "");
            T t = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get();
            if (t != null) {
                return t;
            }
            T tInvoke = function0.invoke();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new SoftReference<>(tInvoke);
            return tInvoke;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0552  */
    /* JADX WARN: Code duplicated, block: B:111:0x062a  */
    /* JADX WARN: Code duplicated, block: B:113:0x062f  */
    /* JADX WARN: Code duplicated, block: B:38:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:40:0x0205  */
    /* JADX WARN: Code duplicated, block: B:41:0x0218  */
    /* JADX WARN: Code duplicated, block: B:45:0x0223  */
    /* JADX WARN: Code duplicated, block: B:47:0x0233 A[Catch: Exception -> 0x0514, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0514, blocks: (B:42:0x021a, B:47:0x0233), top: B:136:0x021a }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0254 A[Catch: all -> 0x02e2, TryCatch #1 {all -> 0x02e2, blocks: (B:48:0x0247, B:50:0x0254, B:51:0x028c), top: B:125:0x0247, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x02ed A[Catch: Exception -> 0x0516, TRY_LEAVE, TryCatch #5 {Exception -> 0x0516, blocks: (B:70:0x0405, B:55:0x02e5, B:57:0x02eb, B:58:0x02ec, B:59:0x02ed, B:65:0x0362, B:77:0x0412, B:79:0x0418, B:80:0x0419, B:81:0x041a, B:86:0x04f6, B:90:0x050c, B:92:0x0512, B:93:0x0513, B:60:0x0305, B:62:0x0312, B:63:0x0351, B:48:0x0247, B:50:0x0254, B:51:0x028c, B:82:0x04a2, B:84:0x04af, B:85:0x04ef), top: B:133:0x0221, inners: #0, #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0312 A[Catch: all -> 0x0411, TryCatch #0 {all -> 0x0411, blocks: (B:60:0x0305, B:62:0x0312, B:63:0x0351), top: B:123:0x0305, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:75:0x040b  */
    /* JADX WARN: Code duplicated, block: B:81:0x041a A[Catch: Exception -> 0x0516, TRY_LEAVE, TryCatch #5 {Exception -> 0x0516, blocks: (B:70:0x0405, B:55:0x02e5, B:57:0x02eb, B:58:0x02ec, B:59:0x02ed, B:65:0x0362, B:77:0x0412, B:79:0x0418, B:80:0x0419, B:81:0x041a, B:86:0x04f6, B:90:0x050c, B:92:0x0512, B:93:0x0513, B:60:0x0305, B:62:0x0312, B:63:0x0351, B:48:0x0247, B:50:0x0254, B:51:0x028c, B:82:0x04a2, B:84:0x04af, B:85:0x04ef), top: B:133:0x0221, inners: #0, #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x04af A[Catch: all -> 0x050b, TryCatch #6 {all -> 0x050b, blocks: (B:82:0x04a2, B:84:0x04af, B:85:0x04ef), top: B:134:0x04a2, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x0516 A[PHI: r26
  0x0516: PHI (r26v4 ??) = (r26v3 ??), (r26v6 ??), (r26v7 ??) binds: [B:94:0x0514, B:122:0x0516, B:87:0x04fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x0533  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v12 */
    /* JADX WARN: Type inference failed for: r26v13 */
    /* JADX WARN: Type inference failed for: r26v14 */
    /* JADX WARN: Type inference failed for: r26v15 */
    /* JADX WARN: Type inference failed for: r26v16 */
    /* JADX WARN: Type inference failed for: r26v17 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r26v8 */
    /* JADX WARN: Type inference failed for: r26v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        ?? r26;
        int i6;
        int i7;
        ?? r27;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i15;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        long j;
        ?? r28;
        int i16;
        int i17;
        int i18;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Class<?> cls;
        char[] cArr;
        float f;
        int i19;
        int i20;
        int i21 = 2 % 2;
        int i22 = b;
        int i23 = (i22 ^ 121) + ((i22 & 121) << 1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i23 % 128;
        if (i23 % 2 == 0) {
            throw null;
        }
        if (context != 0) {
            int i24 = i22 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24 % 128;
            try {
                if (i24 % 2 == 0) {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{10064, 45308, 13850, 40018, 10033, 64834, 44510, 30032, 4223, 13701, 58526, 48332, 18867, 3267, 15444, 52182, 33525, 17154, 30478, 4940, 64019, 39491, 20180, 23126, 13173, 53908, 39310}, Color.blue(0), objArr2);
                    cls = Class.forName((String) objArr2[0]);
                    cArr = new char[]{48612, 43471, 44076, 9931, 48515, 58490, 14328, 53242, 35540, 11439, 32416, 1554, 54023, 5630, 42616, 29010, 6219, 23089, 60677, 43413, 24706, 33648};
                    f = 2.0f;
                    i19 = 1;
                } else {
                    Object[] objArr3 = new Object[1];
                    a(new char[]{10064, 45308, 13850, 40018, 10033, 64834, 44510, 30032, 4223, 13701, 58526, 48332, 18867, 3267, 15444, 52182, 33525, 17154, 30478, 4940, 64019, 39491, 20180, 23126, 13173, 53908, 39310}, Color.blue(0), objArr3);
                    cls = Class.forName((String) objArr3[0]);
                    cArr = new char[]{48612, 43471, 44076, 9931, 48515, 58490, 14328, 53242, 35540, 11439, 32416, 1554, 54023, 5630, 42616, 29010, 6219, 23089, 60677, 43413, 24706, 33648};
                    f = 0.0f;
                    i19 = 0;
                }
                int i25 = (TypedValue.complexToFraction(i19, f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i19, f, 0.0f) == 0.0f ? 0 : -1));
                Object[] objArr4 = new Object[1];
                a(cArr, i25, objArr4);
                Object objInvoke = cls.getMethod((String) objArr4[0], null).invoke(context, null);
                int i26 = b + 33;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
                int i27 = i26 % 2;
                Object[] objArr5 = new Object[1];
                a(new char[]{148, 4526, 607, 23074, 245, 23568, 39323, 45856, 14267, 38103, 53467, 31420, 28279, 44433, 2065, 3494, 42289, 57936, 17227, 54588, 56804, 15123, 31441, 39955, 5284, 29646, 44499, 43003, 19319, 34975, 58635, 28347, 33339, 49488, 7286, 13948, 47858, 5649}, View.combineMeasuredStates(0, 0), objArr5);
                Class<?> cls2 = Class.forName((String) objArr5[0]);
                char[] cArr2 = {21443, 57533, 65007, 5278, 21413, 44289, 26158, 64905, 25840};
                int scrollBarSize = ViewConfiguration.getScrollBarSize();
                int i28 = b + 109;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i28 % 128;
                if (i28 % 2 == 0) {
                    Object[] objArr6 = new Object[1];
                    a(cArr2, scrollBarSize * 58, objArr6);
                    i20 = cls2.getField((String) objArr6[0]).getInt(objInvoke) & 3;
                } else {
                    Object[] objArr7 = new Object[1];
                    a(cArr2, scrollBarSize >> 8, objArr7);
                    i20 = cls2.getField((String) objArr7[0]).getInt(objInvoke) & 2;
                }
                int i29 = (~(i & 1)) & (i | 1);
                int i30 = -i20;
                int i31 = ((i20 & i30) | (i20 ^ i30)) >> 31;
                int i32 = (~i31) & i;
                int i33 = i31 & i29;
                int i34 = (i33 & i32) | (i32 ^ i33);
                int i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i36 = ((i35 | 45) << 1) - (i35 ^ 45);
                b = i36 % 128;
                int i37 = i36 % 2;
                i4 = i34;
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
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char bitsPerPixel = (char) (16948 - ImageFormat.getBitsPerPixel(0));
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2739;
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 13;
                Object[] objArr8 = new Object[1];
                c((short) 141, $$a[132], (byte) 52, objArr8);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(bitsPerPixel, keyRepeatDelay, jumpTapTimeout, 1501733736, false, (String) objArr8[0], new Class[0]);
            }
            Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char cResolveSize = (char) (View.resolveSize(0, 0) + 16949);
                int iGreen = Color.green(0) + 2739;
                int i38 = 13 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                Object[] objArr9 = new Object[1];
                c((short) 89, $$a[132], (byte) 52, objArr9);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSize, iGreen, i38, 47863026, false, (String) objArr9[0], null);
            }
            Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null);
            int i39 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
            b = i39 % 128;
            int i40 = i39 % 2;
            if (!set.contains(obj)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 16949);
                    int i41 = 2740 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int minimumFlingVelocity = 13 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte b2 = $$a[132];
                    Object[] objArr10 = new Object[1];
                    c((short) 37, b2, (byte) (b2 | 36), objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveOpacity, i41, minimumFlingVelocity, 631063962, false, (String) objArr10[0], null);
                }
                if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null))) {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i42 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        i15 = (i42 ^ 35) + ((i42 & 35) << 1);
                        b = i15 % 128;
                        if (i15 % 2 != 0) {
                            Object[] objArr11 = new Object[1];
                            a(new char[]{50790, 33436, 56649, 61102, 50761, 53033, 18077, 1981, 61705, 2021, 4039, 52855, 43154, 16099, 55045, 47410, 25549, 29032, 39940, 25082, 6915, 43054, 42396, 10425, 53825, 57581, 29387, 4978, 36227, 7138, 14875, 55869}, ViewConfiguration.getDoubleTapTimeout() * 71, objArr11);
                            Object[] objArr12 = {(String) objArr11[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                                int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 993;
                                int mirror = '8' - AndroidCharacter.getMirror('0');
                                short s = $$a[7];
                                byte b3 = (byte) s;
                                Object[] objArr13 = new Object[1];
                                c(s, b3, b3, objArr13);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb, jumpTapTimeout2, mirror, 410748506, false, (String) objArr13[0], new Class[]{String.class});
                            }
                            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr12)).longValue();
                            long j2 = 716288171;
                            r28 = i4;
                            long j3 = i;
                            long j4 = -1;
                            long j5 = j3 ^ j4;
                            long j6 = 521;
                            long j7 = j2 ^ j4;
                            j = (((long) 522) * j2) + (((long) (-520)) * jLongValue) + (((long) (-1042)) * (j2 | ((j5 | jLongValue) ^ j4))) + ((jLongValue | j3) * j6) + (j6 * (((j7 | (jLongValue ^ j4)) ^ j4) | ((j7 | j3) ^ j4) | (j4 ^ ((j5 | j2) | jLongValue)))) + ((long) (-917206408));
                        } else {
                            context = i4;
                            Object[] objArr14 = new Object[1];
                            a(new char[]{50790, 33436, 56649, 61102, 50761, 53033, 18077, 1981, 61705, 2021, 4039, 52855, 43154, 16099, 55045, 47410, 25549, 29032, 39940, 25082, 6915, 43054, 42396, 10425, 53825, 57581, 29387, 4978, 36227, 7138, 14875, 55869}, ViewConfiguration.getDoubleTapTimeout() >> 16, objArr14);
                            Object[] objArr15 = {(String) objArr14[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cBlue = (char) Color.blue(0);
                                int iMyTid = 993 - (Process.myTid() >> 22);
                                int packedPositionType = 8 - ExpandableListView.getPackedPositionType(0L);
                                short s2 = $$a[7];
                                byte b4 = (byte) s2;
                                Object[] objArr16 = new Object[1];
                                c(s2, b4, b4, objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, iMyTid, packedPositionType, 410748506, false, (String) objArr16[0], new Class[]{String.class});
                            }
                            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr15)).longValue();
                            long j8 = 1703237774;
                            long j9 = -1;
                            long j10 = j8 ^ j9;
                            long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                            long j11 = startElapsedRealtime ^ j9;
                            j = (((long) 302) * j8) + (((long) TypedValues.MotionType.TYPE_EASING) * jLongValue2) + (((long) (-602)) * (jLongValue2 | ((j10 | j11) ^ j9))) + (((long) (-301)) * ((((j11 | j8) | jLongValue2) ^ j9) | ((j10 | (jLongValue2 ^ j9)) ^ j9) | ((j10 | startElapsedRealtime) ^ j9))) + (((long) 301) * ((j11 | jLongValue2) ^ j9)) + ((long) (-1904156011));
                            r28 = context;
                        }
                        int i43 = b;
                        int i44 = (i43 ^ 9) + ((i43 & 9) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i44 % 128;
                        int i45 = i44 % 2;
                        int i46 = (~(1809822356 | i)) | (-2147481557);
                        int i47 = ~i;
                        int i48 = ~((-710259329) | i47);
                        i16 = ((int) (j >> 32)) & (1438209180 + ((i46 | i48) * (-470)) + (((~((-337659201) | i)) | i48) * 470));
                        i17 = ((int) j) & (830951248 + (((~(1546947867 | i47)) | (-109721458)) * (-983)) + (((~(i47 | (-109721458))) | 67110161) * 983));
                        i18 = i43 + 47;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18 % 128;
                        if (i18 % 2 == 0) {
                            i7 = (i16 ^ i17) | (i16 & i17);
                            int i49 = 34 / 0;
                            r27 = r28;
                        } else {
                            i7 = (i16 ^ i17) | (i16 & i17);
                            r27 = r28;
                        }
                    } else {
                        context = i4;
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i50 = iLastIndexOf * (-496);
                        int i51 = ((i50 | (-496)) << 1) - (i50 ^ (-496));
                        int i52 = ~iLastIndexOf;
                        int i53 = (~((i52 & (-2)) | (i52 ^ (-2)))) * 497;
                        int i54 = (i51 & i53) + (i53 | i51);
                        int i55 = ~iLastIndexOf;
                        int i56 = i55 | (-2);
                        int i57 = ~((i56 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i56 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        int i58 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i59 = (i58 & (-2)) | ((-2) ^ i58);
                        int i60 = ~((i59 & iLastIndexOf) | (i59 ^ iLastIndexOf));
                        int i61 = ((i57 & i60) | (i57 ^ i60)) * 497;
                        int i62 = (i54 & i61) + (i61 | i54);
                        int i63 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i64 = (~((i55 & 1) | (i55 ^ 1))) | (~((i63 & i55) | (i55 ^ i63)));
                        int i65 = (iLastIndexOf & (-2)) | ((-2) ^ iLastIndexOf);
                        int i66 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & i65) | (i65 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        int i67 = -(-(((i66 & i64) | (i64 ^ i66)) * 497));
                        Object[] objArr17 = new Object[1];
                        a(new char[]{57206, 27503, 33991, 34919, 57159}, (i62 & i67) + (i67 | i62), objArr17);
                        str = (String) objArr17[0];
                        Object[] objArr18 = new Object[1];
                        a(new char[]{41228, 13762, 60039, 29024, 41342, 30845, 28937, 39028, 38441, 45232, 14354, 20919, 53227, 35315, 57541, 9980, 1193}, ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr18);
                        objArr = new Object[]{(String) objArr18[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 33603);
                            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3085;
                            int iLastIndexOf2 = 25 - TextUtils.lastIndexOf("", '0');
                            short s3 = $$a[7];
                            byte b5 = (byte) s3;
                            Object[] objArr19 = new Object[1];
                            c(s3, b5, b5, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, doubleTapTimeout, iLastIndexOf2, 1411172903, false, (String) objArr19[0], new Class[]{String.class});
                        }
                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                            int i68 = b;
                            int i69 = (i68 & 61) + (i68 | 61);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i69 % 128;
                            int i70 = i69 % 2;
                            i7 = 1;
                            r27 = context;
                        } else {
                            i7 = 0;
                            r27 = context;
                        }
                    }
                    i8 = (i & (-11)) | ((~i) & 10);
                    int i71 = -i7;
                    i9 = ((i7 & i71) | (i7 ^ i71)) >> 31;
                    int i72 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    i10 = (i72 & 15) + (i72 | 15);
                    i11 = i10 % 128;
                    b = i11;
                    if (i10 % 2 != 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    int i73 = (~i9) & i;
                    int i74 = i9 & i8;
                    i12 = (i74 & i73) | (i73 ^ i74);
                    int i75 = i2 & 32;
                    int i76 = -i75;
                    i13 = ((i75 & i76) | (i75 ^ i76)) >> 31;
                    i14 = (i11 & 51) + (i11 | 51);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                    if (i14 % 2 == 0) {
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    int i77 = i12 & (~i13);
                    int i78 = i13 & i;
                    i5 = (i77 & i78) | (i77 ^ i78);
                    r26 = r27;
                } else if (Build.VERSION.SDK_INT == 30) {
                    int i79 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i80 = (i79 ^ 99) + ((i79 & 99) << 1);
                    b = i80 % 128;
                    int i81 = i80 % 2;
                    i5 = i;
                    r26 = i4;
                } else {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i410 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        i15 = (i410 ^ 35) + ((i410 & 35) << 1);
                        b = i15 % 128;
                        if (i15 % 2 != 0) {
                            Object[] objArr110 = new Object[1];
                            a(new char[]{50790, 33436, 56649, 61102, 50761, 53033, 18077, 1981, 61705, 2021, 4039, 52855, 43154, 16099, 55045, 47410, 25549, 29032, 39940, 25082, 6915, 43054, 42396, 10425, 53825, 57581, 29387, 4978, 36227, 7138, 14875, 55869}, ViewConfiguration.getDoubleTapTimeout() * 71, objArr110);
                            Object[] objArr111 = {(String) objArr110[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char cRgb2 = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                                int jumpTapTimeout3 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 993;
                                int mirror2 = '8' - AndroidCharacter.getMirror('0');
                                short s4 = $$a[7];
                                byte b6 = (byte) s4;
                                Object[] objArr112 = new Object[1];
                                c(s4, b6, b6, objArr112);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb2, jumpTapTimeout3, mirror2, 410748506, false, (String) objArr112[0], new Class[]{String.class});
                            }
                            long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr111)).longValue();
                            long j12 = 716288171;
                            r28 = i4;
                            long j13 = i;
                            long j14 = -1;
                            long j15 = j13 ^ j14;
                            long j16 = 521;
                            long j17 = j12 ^ j14;
                            j = (((long) 522) * j12) + (((long) (-520)) * jLongValue3) + (((long) (-1042)) * (j12 | ((j15 | jLongValue3) ^ j14))) + ((jLongValue3 | j13) * j16) + (j16 * (((j17 | (jLongValue3 ^ j14)) ^ j14) | ((j17 | j13) ^ j14) | (j14 ^ ((j15 | j12) | jLongValue3)))) + ((long) (-917206408));
                        } else {
                            context = i4;
                            Object[] objArr113 = new Object[1];
                            a(new char[]{50790, 33436, 56649, 61102, 50761, 53033, 18077, 1981, 61705, 2021, 4039, 52855, 43154, 16099, 55045, 47410, 25549, 29032, 39940, 25082, 6915, 43054, 42396, 10425, 53825, 57581, 29387, 4978, 36227, 7138, 14875, 55869}, ViewConfiguration.getDoubleTapTimeout() >> 16, objArr113);
                            Object[] objArr114 = {(String) objArr113[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cBlue2 = (char) Color.blue(0);
                                int iMyTid2 = 993 - (Process.myTid() >> 22);
                                int packedPositionType2 = 8 - ExpandableListView.getPackedPositionType(0L);
                                short s5 = $$a[7];
                                byte b7 = (byte) s5;
                                Object[] objArr115 = new Object[1];
                                c(s5, b7, b7, objArr115);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue2, iMyTid2, packedPositionType2, 410748506, false, (String) objArr115[0], new Class[]{String.class});
                            }
                            long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr114)).longValue();
                            long j18 = 1703237774;
                            long j19 = -1;
                            long j110 = j18 ^ j19;
                            long startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
                            long j111 = startElapsedRealtime2 ^ j19;
                            j = (((long) 302) * j18) + (((long) TypedValues.MotionType.TYPE_EASING) * jLongValue4) + (((long) (-602)) * (jLongValue4 | ((j110 | j111) ^ j19))) + (((long) (-301)) * ((((j111 | j18) | jLongValue4) ^ j19) | ((j110 | (jLongValue4 ^ j19)) ^ j19) | ((j110 | startElapsedRealtime2) ^ j19))) + (((long) 301) * ((j111 | jLongValue4) ^ j19)) + ((long) (-1904156011));
                            r28 = context;
                        }
                        int i411 = b;
                        int i412 = (i411 ^ 9) + ((i411 & 9) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i412 % 128;
                        int i413 = i412 % 2;
                        int i414 = (~(1809822356 | i)) | (-2147481557);
                        int i415 = ~i;
                        int i416 = ~((-710259329) | i415);
                        i16 = ((int) (j >> 32)) & (1438209180 + ((i414 | i416) * (-470)) + (((~((-337659201) | i)) | i416) * 470));
                        i17 = ((int) j) & (830951248 + (((~(1546947867 | i415)) | (-109721458)) * (-983)) + (((~(i415 | (-109721458))) | 67110161) * 983));
                        i18 = i411 + 47;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18 % 128;
                        if (i18 % 2 == 0) {
                            i7 = (i16 ^ i17) | (i16 & i17);
                            int i417 = 34 / 0;
                            r27 = r28;
                        } else {
                            i7 = (i16 ^ i17) | (i16 & i17);
                            r27 = r28;
                        }
                    } else {
                        context = i4;
                        int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i510 = iLastIndexOf3 * (-496);
                        int i511 = ((i510 | (-496)) << 1) - (i510 ^ (-496));
                        int i512 = ~iLastIndexOf3;
                        int i513 = (~((i512 & (-2)) | (i512 ^ (-2)))) * 497;
                        int i514 = (i511 & i513) + (i513 | i511);
                        int i515 = ~iLastIndexOf3;
                        int i516 = i515 | (-2);
                        int i517 = ~((i516 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i516 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                        int i518 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i519 = (i518 & (-2)) | ((-2) ^ i518);
                        int i610 = ~((i519 & iLastIndexOf3) | (i519 ^ iLastIndexOf3));
                        int i611 = ((i517 & i610) | (i517 ^ i610)) * 497;
                        int i612 = (i514 & i611) + (i611 | i514);
                        int i613 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i614 = (~((i515 & 1) | (i515 ^ 1))) | (~((i613 & i515) | (i515 ^ i613)));
                        int i615 = (iLastIndexOf3 & (-2)) | ((-2) ^ iLastIndexOf3);
                        int i616 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & i615) | (i615 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                        int i617 = -(-(((i616 & i614) | (i614 ^ i616)) * 497));
                        Object[] objArr116 = new Object[1];
                        a(new char[]{57206, 27503, 33991, 34919, 57159}, (i612 & i617) + (i617 | i612), objArr116);
                        str = (String) objArr116[0];
                        Object[] objArr117 = new Object[1];
                        a(new char[]{41228, 13762, 60039, 29024, 41342, 30845, 28937, 39028, 38441, 45232, 14354, 20919, 53227, 35315, 57541, 9980, 1193}, ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr117);
                        objArr = new Object[]{(String) objArr117[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0) + 33603);
                            int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3085;
                            int iLastIndexOf4 = 25 - TextUtils.lastIndexOf("", '0');
                            short s6 = $$a[7];
                            byte b8 = (byte) s6;
                            Object[] objArr118 = new Object[1];
                            c(s6, b8, b8, objArr118);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf2, doubleTapTimeout2, iLastIndexOf4, 1411172903, false, (String) objArr118[0], new Class[]{String.class});
                        }
                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                            int i618 = b;
                            int i619 = (i618 & 61) + (i618 | 61);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i619 % 128;
                            int i710 = i619 % 2;
                            i7 = 1;
                            r27 = context;
                        } else {
                            i7 = 0;
                            r27 = context;
                        }
                    }
                    i8 = (i & (-11)) | ((~i) & 10);
                    int i711 = -i7;
                    i9 = ((i7 & i711) | (i7 ^ i711)) >> 31;
                    int i712 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    i10 = (i712 & 15) + (i712 | 15);
                    i11 = i10 % 128;
                    b = i11;
                    if (i10 % 2 != 0) {
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    int i713 = (~i9) & i;
                    int i714 = i9 & i8;
                    i12 = (i714 & i713) | (i713 ^ i714);
                    int i715 = i2 & 32;
                    int i716 = -i715;
                    i13 = ((i715 & i716) | (i715 ^ i716)) >> 31;
                    i14 = (i11 & 51) + (i11 | 51);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                    if (i14 % 2 == 0) {
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                    int i717 = i12 & (~i13);
                    int i718 = i13 & i;
                    i5 = (i717 & i718) | (i717 ^ i718);
                    r26 = r27;
                }
            } else if (Build.VERSION.SDK_INT == 30) {
                int i719 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i82 = (i719 ^ 99) + ((i719 & 99) << 1);
                b = i82 % 128;
                int i83 = i82 % 2;
                i5 = i;
                r26 = i4;
            } else {
                try {
                    try {
                        if (Build.VERSION.SDK_INT > 33) {
                            int i418 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            i15 = (i418 ^ 35) + ((i418 & 35) << 1);
                            b = i15 % 128;
                            if (i15 % 2 != 0) {
                                Object[] objArr119 = new Object[1];
                                a(new char[]{50790, 33436, 56649, 61102, 50761, 53033, 18077, 1981, 61705, 2021, 4039, 52855, 43154, 16099, 55045, 47410, 25549, 29032, 39940, 25082, 6915, 43054, 42396, 10425, 53825, 57581, 29387, 4978, 36227, 7138, 14875, 55869}, ViewConfiguration.getDoubleTapTimeout() * 71, objArr119);
                                try {
                                    Object[] objArr1110 = {(String) objArr119[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char cRgb3 = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                                        int jumpTapTimeout4 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 993;
                                        int mirror3 = '8' - AndroidCharacter.getMirror('0');
                                        short s7 = $$a[7];
                                        byte b9 = (byte) s7;
                                        Object[] objArr1111 = new Object[1];
                                        c(s7, b9, b9, objArr1111);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb3, jumpTapTimeout4, mirror3, 410748506, false, (String) objArr1111[0], new Class[]{String.class});
                                    }
                                    long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr1110)).longValue();
                                    long j112 = 716288171;
                                    r28 = i4;
                                    long j113 = i;
                                    long j114 = -1;
                                    long j115 = j113 ^ j114;
                                    long j116 = 521;
                                    long j117 = j112 ^ j114;
                                    j = (((long) 522) * j112) + (((long) (-520)) * jLongValue5) + (((long) (-1042)) * (j112 | ((j115 | jLongValue5) ^ j114))) + ((jLongValue5 | j113) * j116) + (j116 * (((j117 | (jLongValue5 ^ j114)) ^ j114) | ((j117 | j113) ^ j114) | (j114 ^ ((j115 | j112) | jLongValue5)))) + ((long) (-917206408));
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            } else {
                                context = i4;
                                Object[] objArr1112 = new Object[1];
                                a(new char[]{50790, 33436, 56649, 61102, 50761, 53033, 18077, 1981, 61705, 2021, 4039, 52855, 43154, 16099, 55045, 47410, 25549, 29032, 39940, 25082, 6915, 43054, 42396, 10425, 53825, 57581, 29387, 4978, 36227, 7138, 14875, 55869}, ViewConfiguration.getDoubleTapTimeout() >> 16, objArr1112);
                                try {
                                    Object[] objArr1113 = {(String) objArr1112[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cBlue3 = (char) Color.blue(0);
                                        int iMyTid3 = 993 - (Process.myTid() >> 22);
                                        int packedPositionType3 = 8 - ExpandableListView.getPackedPositionType(0L);
                                        short s8 = $$a[7];
                                        byte b10 = (byte) s8;
                                        Object[] objArr1114 = new Object[1];
                                        c(s8, b10, b10, objArr1114);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue3, iMyTid3, packedPositionType3, 410748506, false, (String) objArr1114[0], new Class[]{String.class});
                                    }
                                    long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr1113)).longValue();
                                    long j118 = 1703237774;
                                    long j119 = -1;
                                    long j1110 = j118 ^ j119;
                                    long startElapsedRealtime3 = (int) Process.getStartElapsedRealtime();
                                    long j1111 = startElapsedRealtime3 ^ j119;
                                    j = (((long) 302) * j118) + (((long) TypedValues.MotionType.TYPE_EASING) * jLongValue6) + (((long) (-602)) * (jLongValue6 | ((j1110 | j1111) ^ j119))) + (((long) (-301)) * ((((j1111 | j118) | jLongValue6) ^ j119) | ((j1110 | (jLongValue6 ^ j119)) ^ j119) | ((j1110 | startElapsedRealtime3) ^ j119))) + (((long) 301) * ((j1111 | jLongValue6) ^ j119)) + ((long) (-1904156011));
                                    r28 = context;
                                } catch (Throwable th3) {
                                    Throwable cause3 = th3.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th3;
                                }
                            }
                            int i419 = b;
                            int i4110 = (i419 ^ 9) + ((i419 & 9) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4110 % 128;
                            int i4111 = i4110 % 2;
                            int i4112 = (~(1809822356 | i)) | (-2147481557);
                            int i4113 = ~i;
                            int i4114 = ~((-710259329) | i4113);
                            i16 = ((int) (j >> 32)) & (1438209180 + ((i4112 | i4114) * (-470)) + (((~((-337659201) | i)) | i4114) * 470));
                            i17 = ((int) j) & (830951248 + (((~(1546947867 | i4113)) | (-109721458)) * (-983)) + (((~(i4113 | (-109721458))) | 67110161) * 983));
                            i18 = i419 + 47;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18 % 128;
                            if (i18 % 2 == 0) {
                                i7 = (i16 ^ i17) | (i16 & i17);
                                int i4115 = 34 / 0;
                                r27 = r28;
                            } else {
                                i7 = (i16 ^ i17) | (i16 & i17);
                                r27 = r28;
                            }
                        } else {
                            context = i4;
                            int iLastIndexOf5 = TextUtils.lastIndexOf("", '0', 0, 0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i5110 = iLastIndexOf5 * (-496);
                            int i5111 = ((i5110 | (-496)) << 1) - (i5110 ^ (-496));
                            int i5112 = ~iLastIndexOf5;
                            int i5113 = (~((i5112 & (-2)) | (i5112 ^ (-2)))) * 497;
                            int i5114 = (i5111 & i5113) + (i5113 | i5111);
                            int i5115 = ~iLastIndexOf5;
                            int i5116 = i5115 | (-2);
                            int i5117 = ~((i5116 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i5116 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            int i5118 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i5119 = (i5118 & (-2)) | ((-2) ^ i5118);
                            int i6110 = ~((i5119 & iLastIndexOf5) | (i5119 ^ iLastIndexOf5));
                            int i6111 = ((i5117 & i6110) | (i5117 ^ i6110)) * 497;
                            int i6112 = (i5114 & i6111) + (i6111 | i5114);
                            int i6113 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i6114 = (~((i5115 & 1) | (i5115 ^ 1))) | (~((i6113 & i5115) | (i5115 ^ i6113)));
                            int i6115 = (iLastIndexOf5 & (-2)) | ((-2) ^ iLastIndexOf5);
                            int i6116 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i6115) | (i6115 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            int i6117 = -(-(((i6116 & i6114) | (i6114 ^ i6116)) * 497));
                            Object[] objArr1115 = new Object[1];
                            a(new char[]{57206, 27503, 33991, 34919, 57159}, (i6112 & i6117) + (i6117 | i6112), objArr1115);
                            str = (String) objArr1115[0];
                            Object[] objArr1116 = new Object[1];
                            a(new char[]{41228, 13762, 60039, 29024, 41342, 30845, 28937, 39028, 38441, 45232, 14354, 20919, 53227, 35315, 57541, 9980, 1193}, ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr1116);
                            try {
                                objArr = new Object[]{(String) objArr1116[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cLastIndexOf3 = (char) (TextUtils.lastIndexOf("", '0', 0) + 33603);
                                    int doubleTapTimeout3 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3085;
                                    int iLastIndexOf6 = 25 - TextUtils.lastIndexOf("", '0');
                                    short s9 = $$a[7];
                                    byte b11 = (byte) s9;
                                    Object[] objArr1117 = new Object[1];
                                    c(s9, b11, b11, objArr1117);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf3, doubleTapTimeout3, iLastIndexOf6, 1411172903, false, (String) objArr1117[0], new Class[]{String.class});
                                }
                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                    int i6118 = b;
                                    int i6119 = (i6118 & 61) + (i6118 | 61);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6119 % 128;
                                    int i7110 = i6119 % 2;
                                    i7 = 1;
                                    r27 = context;
                                } else {
                                    i7 = 0;
                                    r27 = context;
                                }
                            } catch (Throwable th4) {
                                Throwable cause4 = th4.getCause();
                                if (cause4 != null) {
                                    throw cause4;
                                }
                                throw th4;
                            }
                        }
                    } catch (Exception unused) {
                        i7 = 0;
                        r27 = context;
                    }
                } catch (Exception unused2) {
                    context = i4;
                }
                i8 = (i & (-11)) | ((~i) & 10);
                int i7111 = -i7;
                i9 = ((i7 & i7111) | (i7 ^ i7111)) >> 31;
                int i7112 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                i10 = (i7112 & 15) + (i7112 | 15);
                i11 = i10 % 128;
                b = i11;
                if (i10 % 2 != 0) {
                    Object obj6 = null;
                    obj6.hashCode();
                    throw null;
                }
                int i7113 = (~i9) & i;
                int i7114 = i9 & i8;
                i12 = (i7114 & i7113) | (i7113 ^ i7114);
                int i7115 = i2 & 32;
                int i7116 = -i7115;
                i13 = ((i7115 & i7116) | (i7115 ^ i7116)) >> 31;
                i14 = (i11 & 51) + (i11 | 51);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                if (i14 % 2 == 0) {
                    Object obj7 = null;
                    obj7.hashCode();
                    throw null;
                }
                int i7117 = i12 & (~i13);
                int i7118 = i13 & i;
                i5 = (i7117 & i7118) | (i7117 ^ i7118);
                r26 = r27;
            }
            int i84 = (~((i & r26) == true ? 1 : 0)) & ((i | r26) == true ? 1 : 0);
            int i85 = -i84;
            int i86 = ((i84 & i85) | (i84 ^ i85)) >> 31;
            int i87 = i5 & (~i86);
            int i88 = r26 & i86;
            int i89 = (i87 & i88) | (i87 ^ i88);
            Object[] objArr20 = new Object[4];
            int i90 = b;
            int i91 = ((i90 | 3) << 1) - (i90 ^ 3);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i91 % 128;
            if (i91 % 2 == 0) {
                objArr20[0] = new int[1];
                objArr20[0] = new int[1];
                objArr20[3] = new int[1];
                i6 = 2;
            } else {
                objArr20[0] = new int[1];
                objArr20[1] = new int[1];
                i6 = 2;
                objArr20[2] = new int[1];
            }
            int i92 = (i90 & 81) + (i90 | 81);
            int i93 = i92 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i93;
            int i94 = i92 % i6;
            int i95 = (~(i & i89)) & (i | i89);
            int i96 = -i95;
            int i97 = (((i95 & i96) | (i95 ^ i96)) >> 31) & 16;
            int[] iArr = (int[]) objArr20[0];
            int i98 = ((i93 | 25) << 1) - (i93 ^ 25);
            b = i98 % 128;
            if (i98 % 2 != 0) {
                iArr[0] = i;
                ((int[]) objArr20[4])[0] = i89;
                objArr20[3] = null;
            } else {
                iArr[0] = i;
                ((int[]) objArr20[2])[0] = i89;
                objArr20[3] = null;
            }
            int i99 = ((((((~((-423830259) | i)) | 272629776) * (-283)) - 114874492) + ((~(i | (-151200483))) * 283)) - (~(-(-i97)))) - 1;
            int i100 = (i3 ^ i99) + ((i3 & i99) << 1);
            int i101 = (i100 << 13) ^ i100;
            int i102 = i93 + 13;
            b = i102 % 128;
            int i103 = i102 % 2;
            int i104 = i101 >>> 17;
            int i105 = (i101 | i104) & (~(i101 & i104));
            ((int[]) objArr20[1])[0] = i105 ^ (i105 << 5);
            return objArr20;
        } catch (Throwable th5) {
            Throwable cause5 = th5.getCause();
            if (cause5 != null) {
                throw cause5;
            }
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r7, byte r8, short r9) {
        /*
            int r9 = r9 * 2
            int r9 = r9 + 4
            byte[] r0 = defpackage.setImageCaptureFlashMode.$$c
            int r7 = r7 * 3
            int r7 = 107 - r7
            int r8 = r8 * 2
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2a:
            int r9 = -r9
            int r7 = r7 + r9
            int r9 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setImageCaptureFlashMode.$$e(byte, byte, short):java.lang.String");
    }
}
