package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityTermsConditionActivity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzbe;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class MlKitThreadPool extends zzbe {
    private static final ThreadLocal zza = new ThreadLocal();
    private final ThreadPoolExecutor zzb;

    public MlKitThreadPool() {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.google.mlkit.common.sdkinternal.zzj
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzi
                    private static final byte[] $$c = {94, -1, 37, -59};
                    private static final int $$d = 51;
                    private static int $10 = 0;
                    private static int $11 = 1;
                    private static final byte[] $$a = {41, 2, 45, -60, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
                    private static final int $$b = 34;
                    private static int TuitionPaymentFragmentbindingInflater1 = 0;
                    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
                    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 3304972323390893738L;

                    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
                    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static void c(short r6, int r7, int r8, java.lang.Object[] r9) {
                        /*
                            int r8 = r8 * 14
                            int r8 = r8 + 84
                            int r0 = 53 - r7
                            int r6 = 145 - r6
                            byte[] r1 = com.google.mlkit.common.sdkinternal.zzi.$$a
                            byte[] r0 = new byte[r0]
                            int r7 = 52 - r7
                            r2 = 0
                            if (r1 != 0) goto L15
                            r4 = r8
                            r3 = r2
                            r8 = r6
                            goto L2a
                        L15:
                            r3 = r2
                        L16:
                            byte r4 = (byte) r8
                            r0[r3] = r4
                            if (r3 != r7) goto L23
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r0, r2)
                            r9[r2] = r6
                            return
                        L23:
                            int r3 = r3 + 1
                            r4 = r1[r6]
                            r5 = r8
                            r8 = r6
                            r6 = r5
                        L2a:
                            int r4 = -r4
                            int r6 = r6 + r4
                            int r6 = r6 + (-11)
                            int r8 = r8 + 1
                            r5 = r8
                            r8 = r6
                            r6 = r5
                            goto L16
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.zzi.c(short, int, int, java.lang.Object[]):void");
                    }

                    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                        int i2 = 2 % 2;
                        abortCapture abortcapture = new abortCapture();
                        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-2687588926731523482L), cArr, i);
                        abortcapture.b = 4;
                        int i3 = $11 + 41;
                        $10 = i3 % 128;
                        int i4 = i3 % 2;
                        while (abortcapture.b < cArrB.length) {
                            int i5 = $11 + 11;
                            $10 = i5 % 128;
                            int i6 = i5 % 2;
                            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                            int i7 = abortcapture.b;
                            try {
                                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char maximumFlingVelocity = (char) (64838 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                    int iResolveSize = 1356 - View.resolveSize(0, 0);
                                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 38;
                                    byte b = (byte) ($$c[1] + 1);
                                    byte b2 = b;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, iResolveSize, iMakeMeasureSpec, 894276454, false, $$e(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                                }
                                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                Object[] objArr3 = {abortcapture, abortcapture};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 47774), 468 - TextUtils.getOffsetAfter("", 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
                        int i8 = $11 + 67;
                        $10 = i8 % 128;
                        if (i8 % 2 != 0) {
                            throw null;
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = 2 % 2;
                        int i2 = TuitionPaymentFragmentbindingInflater1 + 45;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                        int i3 = i2 % 2;
                        MlKitThreadPool.zzd(runnable);
                        if (i3 == 0) {
                            int i4 = 45 / 0;
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:109:0x068c  */
                    /* JADX WARN: Code duplicated, block: B:130:0x01f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:37:0x01e2  */
                    /* JADX WARN: Code duplicated, block: B:39:0x01e8  */
                    /* JADX WARN: Code duplicated, block: B:43:0x01fc  */
                    /* JADX WARN: Code duplicated, block: B:45:0x0208 A[Catch: Exception -> 0x04f2, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x04f2, blocks: (B:40:0x01f6, B:45:0x0208, B:51:0x027d), top: B:130:0x01f6 }] */
                    /* JADX WARN: Code duplicated, block: B:48:0x0227 A[Catch: all -> 0x02cd, TryCatch #5 {all -> 0x02cd, blocks: (B:46:0x021a, B:48:0x0227, B:49:0x026d), top: B:128:0x021a, outer: #4 }] */
                    /* JADX WARN: Code duplicated, block: B:59:0x02d7 A[Catch: Exception -> 0x04f3, TRY_LEAVE, TryCatch #4 {Exception -> 0x04f3, blocks: (B:68:0x039f, B:55:0x02cf, B:57:0x02d5, B:58:0x02d6, B:59:0x02d7, B:73:0x0448, B:75:0x044e, B:76:0x044f, B:77:0x0450, B:79:0x047c, B:84:0x04e1, B:88:0x04ea, B:90:0x04f0, B:91:0x04f1, B:60:0x02ec, B:62:0x02f9, B:63:0x033b, B:80:0x0486, B:82:0x0493, B:83:0x04da, B:46:0x021a, B:48:0x0227, B:49:0x026d), top: B:127:0x01fa, inners: #1, #2, #5 }] */
                    /* JADX WARN: Code duplicated, block: B:62:0x02f9 A[Catch: all -> 0x0447, TryCatch #1 {all -> 0x0447, blocks: (B:60:0x02ec, B:62:0x02f9, B:63:0x033b), top: B:121:0x02ec, outer: #4 }] */
                    /* JADX WARN: Code duplicated, block: B:67:0x039a  */
                    /* JADX WARN: Code duplicated, block: B:70:0x03e4  */
                    /* JADX WARN: Code duplicated, block: B:77:0x0450 A[Catch: Exception -> 0x04f3, TRY_LEAVE, TryCatch #4 {Exception -> 0x04f3, blocks: (B:68:0x039f, B:55:0x02cf, B:57:0x02d5, B:58:0x02d6, B:59:0x02d7, B:73:0x0448, B:75:0x044e, B:76:0x044f, B:77:0x0450, B:79:0x047c, B:84:0x04e1, B:88:0x04ea, B:90:0x04f0, B:91:0x04f1, B:60:0x02ec, B:62:0x02f9, B:63:0x033b, B:80:0x0486, B:82:0x0493, B:83:0x04da, B:46:0x021a, B:48:0x0227, B:49:0x026d), top: B:127:0x01fa, inners: #1, #2, #5 }] */
                    /* JADX WARN: Code duplicated, block: B:82:0x0493 A[Catch: all -> 0x04e9, TryCatch #2 {all -> 0x04e9, blocks: (B:80:0x0486, B:82:0x0493, B:83:0x04da), top: B:123:0x0486, outer: #4 }] */
                    /* JADX WARN: Code duplicated, block: B:86:0x04e7  */
                    /* JADX WARN: Code duplicated, block: B:93:0x04f3 A[PHI: r7
  0x04f3: PHI (r7v29 int) = (r7v28 int), (r7v31 int), (r7v32 int) binds: [B:92:0x04f2, B:118:0x04f3, B:85:0x04e5] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Code duplicated, block: B:96:0x0535  */
                    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2, int i3) throws Throwable {
                        int i4;
                        int i5;
                        int i6;
                        Object[] objArr;
                        int i7;
                        int i8;
                        int i9;
                        int i10;
                        int i11;
                        int i12;
                        String str;
                        Object[] objArr2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i13;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                        long j;
                        long j2;
                        int i14;
                        int i15;
                        int i16;
                        int i17;
                        int i18;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                        int i19;
                        int i20 = 2 % 2;
                        int i21 = TuitionPaymentFragmentbindingInflater1;
                        int i22 = (i21 ^ 39) + ((i21 & 39) << 1);
                        int i23 = i22 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i23;
                        int i24 = 0;
                        if (i22 % 2 == 0) {
                            throw null;
                        }
                        if (context != null) {
                            int i25 = (i23 ^ 17) + ((i23 & 17) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i25 % 128;
                            int i26 = i25 % 2;
                            int i27 = ((i23 | 105) << 1) - (i23 ^ 105);
                            TuitionPaymentFragmentbindingInflater1 = i27 % 128;
                            int i28 = i27 % 2;
                            try {
                                Object[] objArr3 = new Object[1];
                                a(new char[]{43749, 58660, 43652, 8582, 40935, 24114, 5659, 4132, 47546, 12977, 843, 16264, 36070, 3687, 12401, 10882, 37648, 6934, 23739, 55784, 58982, 62663, 18897, 50530, 62832, 49632, 30235}, Drawable.resolveOpacity(0, 0), objArr3);
                                Class<?> cls = Class.forName((String) objArr3[0]);
                                char[] cArr = {54188, 9453, 54219, 57412, 16937, 22347, 52165, 6510, 49388, 62305, 56973, 14006, 62895, 53152, 60837, 9190, 59987, 56031, 33096, 53457, 40714, 13582};
                                int scrollBarSize = ViewConfiguration.getScrollBarSize();
                                int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 - (-1);
                                TuitionPaymentFragmentbindingInflater1 = i29 % 128;
                                int i30 = i29 % 2;
                                Object[] objArr4 = new Object[1];
                                a(cArr, scrollBarSize >> 8, objArr4);
                                Object objInvoke = cls.getMethod((String) objArr4[0], null).invoke(context, null);
                                Object[] objArr5 = new Object[1];
                                a(new char[]{12531, 23523, 12434, 40769, 26537, 65348, 61013, 45394, 9132, 35958, 64261, 40702, 5872, 45216, 51263, 35828, 2310, 42449, 42229, 30878, 31811, 18946, 45535, 25633, 28531, 32559, 36429, 20857, 17328, 27758, 39781, 16041, 46796, 4241, 26632, 11166, 43285, 1472}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr5);
                                Class<?> cls2 = Class.forName((String) objArr5[0]);
                                Object[] objArr6 = new Object[1];
                                a(new char[]{20946, 34480, 20916, 16912, 41332, 41259, 10381, 61224, 17041}, ViewConfiguration.getLongPressTimeout() >> 16, objArr6);
                                int i31 = cls2.getField((String) objArr6[0]).getInt(objInvoke) & 2;
                                int i32 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i33 = ((i32 | 25) << 1) - (i32 ^ 25);
                                TuitionPaymentFragmentbindingInflater1 = i33 % 128;
                                int i34 = i33 % 2;
                                int i35 = (i & (-2)) | ((~i) & 1);
                                int i36 = (i31 | (-i31)) >> 31;
                                int i37 = (i32 & 19) + (i32 | 19);
                                TuitionPaymentFragmentbindingInflater1 = i37 % 128;
                                if (i37 % 2 != 0) {
                                    int i38 = (~i36) & i;
                                    int i39 = i36 & i35;
                                    i19 = (i39 & i38) | (i38 ^ i39);
                                    int i40 = 25 / 0;
                                } else {
                                    int i41 = (~i36) & i;
                                    int i42 = i36 & i35;
                                    i19 = (i42 & i41) | (i41 ^ i42);
                                }
                                int i43 = i32 + 17;
                                TuitionPaymentFragmentbindingInflater1 = i43 % 128;
                                int i44 = i43 % 2;
                                i4 = i19;
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
                                char cIndexOf = (char) (16949 - TextUtils.indexOf("", "", 0, 0));
                                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 2739;
                                int defaultSize = 13 - View.getDefaultSize(0, 0);
                                byte b = $$a[7];
                                Object[] objArr7 = new Object[1];
                                c((short) 141, b, b, objArr7);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, offsetAfter, defaultSize, 1501733736, false, (String) objArr7[0], new Class[0]);
                            }
                            Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, null);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 16949);
                                int i45 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2739;
                                int windowTouchSlop = 13 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                byte b2 = $$a[7];
                                Object[] objArr8 = new Object[1];
                                c((short) 89, b2, b2, objArr8);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatDelay, i45, windowTouchSlop, 47863026, false, (String) objArr8[0], null);
                            }
                            if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char cMyPid = (char) (16949 - (Process.myPid() >> 22));
                                    int i46 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2740;
                                    int iIndexOf = 12 - TextUtils.indexOf((CharSequence) "", '0', 0);
                                    Object[] objArr9 = new Object[1];
                                    c((short) ($$b + 3), (byte) 15, $$a[7], objArr9);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyPid, i46, iIndexOf, 631063962, false, (String) objArr9[0], null);
                                }
                                if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null))) {
                                    if (Build.VERSION.SDK_INT > 33) {
                                        i13 = TuitionPaymentFragmentbindingInflater1 + 55;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                                        if (i13 % 2 == 0) {
                                            Object[] objArr10 = new Object[1];
                                            a(new char[]{52128, 64244, 52111, 15965, 41893, 17896, 10825, 3055, 55487, 11617, 16131, 9237, 60852, 4599, 3121, 12608, 62043, 1228, 24736, 49784, 34565, 60186, 30088, 57003, 37943, 56873, 19023, 60368, 47333, 52534, 24431, 33807}, View.MeasureSpec.makeMeasureSpec(0, 1), objArr10);
                                            Object[] objArr11 = {(String) objArr10[0]};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                                                int longPressTimeout = 993 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                                int i47 = 9 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                byte[] bArr = $$a;
                                                short s = bArr[7];
                                                Object[] objArr12 = new Object[1];
                                                c(s, (byte) (s | 52), bArr[5], objArr12);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb, longPressTimeout, i47, 410748506, false, (String) objArr12[0], new Class[]{String.class});
                                            }
                                            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr11)).longValue();
                                            long j3 = 1756866077;
                                            long j4 = (((long) (-589)) * j3) + (((long) 591) * jLongValue);
                                            long j5 = 590;
                                            long j6 = -1;
                                            long j7 = jLongValue ^ j6;
                                            long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                            long j8 = jElapsedRealtime ^ j6;
                                            long j9 = ((j7 | j8) ^ j6) | ((j7 | j3) ^ j6) | ((j8 | j3) ^ j6);
                                            long j10 = j3 ^ j6;
                                            i24 = i4;
                                            j = j4 + (j5 * (j9 | (((j10 | jLongValue) | jElapsedRealtime) ^ j6))) + (((long) (-1180)) * j9) + ((((j10 | j8) ^ j6) | ((j8 | jLongValue) ^ j6)) * j5) + ((long) (-1957784314));
                                        } else {
                                            i24 = i4;
                                            Object[] objArr13 = new Object[1];
                                            a(new char[]{52128, 64244, 52111, 15965, 41893, 17896, 10825, 3055, 55487, 11617, 16131, 9237, 60852, 4599, 3121, 12608, 62043, 1228, 24736, 49784, 34565, 60186, 30088, 57003, 37943, 56873, 19023, 60368, 47333, 52534, 24431, 33807}, View.MeasureSpec.makeMeasureSpec(0, 0), objArr13);
                                            Object[] objArr14 = {(String) objArr13[0]};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                                                int scrollBarSize2 = 993 - (ViewConfiguration.getScrollBarSize() >> 8);
                                                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 8;
                                                byte[] bArr2 = $$a;
                                                short s2 = bArr2[7];
                                                Object[] objArr15 = new Object[1];
                                                c(s2, (byte) (s2 | 52), bArr2[5], objArr15);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf2, scrollBarSize2, edgeSlop, 410748506, false, (String) objArr15[0], new Class[]{String.class});
                                            }
                                            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr14)).longValue();
                                            long j11 = 1175780777;
                                            long j12 = (((long) 714) * j11) + (((long) (-712)) * jLongValue2);
                                            long j13 = -1;
                                            long j14 = j11 ^ j13;
                                            long j15 = i;
                                            long j16 = j15 ^ j13;
                                            long j17 = ((j14 | j16) ^ j13) | ((j14 | jLongValue2) ^ j13);
                                            long j18 = jLongValue2 ^ j13;
                                            long j19 = ((j11 | j18) | j15) ^ j13;
                                            j = j12 + (((long) (-713)) * (j17 | j19)) + (((long) 1426) * j19) + (((long) 713) * ((j18 | j16) ^ j13)) + ((long) (-1376699014));
                                        }
                                        j2 = j;
                                        int i48 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                        i14 = ((i48 | 75) << 1) - (i48 ^ 75);
                                        TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                                        if (i14 % 2 != 0) {
                                            int i49 = (int) (j2 << 25);
                                            int i50 = ~((int) Process.getStartUptimeMillis());
                                            i15 = i49 & (((((~((-1566469304) | i50)) | 1481271475) * (-241)) - 766694931) + (((~(i50 | (-85197829))) | (-1610514368)) * 241));
                                            i16 = (int) j2;
                                            i17 = (-635053948) + (((-1090605065) | i) * (-627)) + (((~((-1019096568) | i)) | 1838644318) * (-627));
                                            i18 = ((~((~i) | 1019096567)) | (~(1838644318 | i))) * 627;
                                        } else {
                                            int i51 = ~i;
                                            i15 = ((int) (j2 >> 32)) & (1972008040 + (((~((-61767844) | i51)) | (~((-1375458568) | i51))) * (-867)) + (((~((-61767844) | i)) | 27951107 | (~((-1375458568) | i))) * (-1734)) + (((~((-27951108) | i51)) | (~((-33816737) | i)) | (~((-1347507461) | i))) * 867));
                                            i16 = (int) j2;
                                            int i52 = ~(401491595 | i51);
                                            i17 = ((92800001 | i52) * (-374)) - 576303569;
                                            i18 = (i52 | 308691594) * 374;
                                        }
                                        int i53 = i16 & (i17 + i18);
                                        i9 = (i15 & i53) | (i15 ^ i53);
                                        int i54 = TuitionPaymentFragmentbindingInflater1 + 43;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i54 % 128;
                                        int i55 = i54 % 2;
                                    } else {
                                        i24 = i4;
                                        Object[] objArr16 = new Object[1];
                                        a(new char[]{18324, 45841, 18341, 12969, 17118}, TextUtils.indexOf("", ""), objArr16);
                                        str = (String) objArr16[0];
                                        char[] cArr2 = {26252, 37554, 26366, 22033, 64383, 19519, 29385, 575, 30169, 17708, 26562, 11724, 16523, 31231, 21733, 14487, 24441};
                                        int iIndexOf2 = TextUtils.indexOf("", "", 0, 0);
                                        int i56 = TuitionPaymentFragmentbindingInflater1 + 89;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i56 % 128;
                                        int i57 = i56 % 2;
                                        Object[] objArr17 = new Object[1];
                                        a(cArr2, iIndexOf2, objArr17);
                                        objArr2 = new Object[]{(String) objArr17[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char cResolveSizeAndState = (char) (33602 - View.resolveSizeAndState(0, 0, 0));
                                            int iAlpha = 3085 - Color.alpha(0);
                                            int i58 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27;
                                            byte[] bArr3 = $$a;
                                            short s3 = bArr3[7];
                                            Object[] objArr18 = new Object[1];
                                            c(s3, (byte) (s3 | 52), bArr3[5], objArr18);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState, iAlpha, i58, 1411172903, false, (String) objArr18[0], new Class[]{String.class});
                                        }
                                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                            i9 = 1;
                                        } else {
                                            i9 = 0;
                                        }
                                    }
                                    int i59 = (~(i & 10)) & (i | 10);
                                    int i60 = -i9;
                                    int i61 = ((i9 & i60) | (i9 ^ i60)) >> 31;
                                    int i62 = (~i61) & i;
                                    int i63 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i64 = (i63 ^ 81) + ((i63 & 81) << 1);
                                    TuitionPaymentFragmentbindingInflater1 = i64 % 128;
                                    int i65 = i64 % 2;
                                    i10 = (i61 & i59) | i62;
                                    int i66 = i2 & 32;
                                    int i67 = i63 + 103;
                                    TuitionPaymentFragmentbindingInflater1 = i67 % 128;
                                    int i68 = i67 % 2;
                                    int i69 = -i66;
                                    i11 = ((i69 & i66) | (i66 ^ i69)) >> 31;
                                    i12 = (i63 ^ 59) + ((i63 & 59) << 1);
                                    TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                                    if (i12 % 2 != 0) {
                                        Object obj = null;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    int i70 = i10 & (~i11);
                                    int i71 = i11 & i;
                                    i5 = (i70 & i71) | (i70 ^ i71);
                                } else if (Build.VERSION.SDK_INT == 30) {
                                    int i72 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
                                    TuitionPaymentFragmentbindingInflater1 = i72 % 128;
                                    int i73 = i72 % 2;
                                    i5 = i;
                                    i24 = i4;
                                } else {
                                    if (Build.VERSION.SDK_INT > 33) {
                                        i13 = TuitionPaymentFragmentbindingInflater1 + 55;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                                        if (i13 % 2 == 0) {
                                            Object[] objArr19 = new Object[1];
                                            a(new char[]{52128, 64244, 52111, 15965, 41893, 17896, 10825, 3055, 55487, 11617, 16131, 9237, 60852, 4599, 3121, 12608, 62043, 1228, 24736, 49784, 34565, 60186, 30088, 57003, 37943, 56873, 19023, 60368, 47333, 52534, 24431, 33807}, View.MeasureSpec.makeMeasureSpec(0, 1), objArr19);
                                            Object[] objArr110 = {(String) objArr19[0]};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char cRgb2 = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                                                int longPressTimeout2 = 993 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                                int i410 = 9 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                byte[] bArr4 = $$a;
                                                short s4 = bArr4[7];
                                                Object[] objArr111 = new Object[1];
                                                c(s4, (byte) (s4 | 52), bArr4[5], objArr111);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb2, longPressTimeout2, i410, 410748506, false, (String) objArr111[0], new Class[]{String.class});
                                            }
                                            long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr110)).longValue();
                                            long j20 = 1756866077;
                                            long j21 = (((long) (-589)) * j20) + (((long) 591) * jLongValue3);
                                            long j22 = 590;
                                            long j23 = -1;
                                            long j24 = jLongValue3 ^ j23;
                                            long jElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                            long j25 = jElapsedRealtime2 ^ j23;
                                            long j26 = ((j24 | j25) ^ j23) | ((j24 | j20) ^ j23) | ((j25 | j20) ^ j23);
                                            long j110 = j20 ^ j23;
                                            i24 = i4;
                                            j = j21 + (j22 * (j26 | (((j110 | jLongValue3) | jElapsedRealtime2) ^ j23))) + (((long) (-1180)) * j26) + ((((j110 | j25) ^ j23) | ((j25 | jLongValue3) ^ j23)) * j22) + ((long) (-1957784314));
                                        } else {
                                            i24 = i4;
                                            Object[] objArr112 = new Object[1];
                                            a(new char[]{52128, 64244, 52111, 15965, 41893, 17896, 10825, 3055, 55487, 11617, 16131, 9237, 60852, 4599, 3121, 12608, 62043, 1228, 24736, 49784, 34565, 60186, 30088, 57003, 37943, 56873, 19023, 60368, 47333, 52534, 24431, 33807}, View.MeasureSpec.makeMeasureSpec(0, 0), objArr112);
                                            Object[] objArr113 = {(String) objArr112[0]};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cIndexOf3 = (char) TextUtils.indexOf("", "", 0, 0);
                                                int scrollBarSize3 = 993 - (ViewConfiguration.getScrollBarSize() >> 8);
                                                int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 8;
                                                byte[] bArr5 = $$a;
                                                short s5 = bArr5[7];
                                                Object[] objArr114 = new Object[1];
                                                c(s5, (byte) (s5 | 52), bArr5[5], objArr114);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf3, scrollBarSize3, edgeSlop2, 410748506, false, (String) objArr114[0], new Class[]{String.class});
                                            }
                                            long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr113)).longValue();
                                            long j111 = 1175780777;
                                            long j112 = (((long) 714) * j111) + (((long) (-712)) * jLongValue4);
                                            long j113 = -1;
                                            long j114 = j111 ^ j113;
                                            long j115 = i;
                                            long j116 = j115 ^ j113;
                                            long j117 = ((j114 | j116) ^ j113) | ((j114 | jLongValue4) ^ j113);
                                            long j118 = jLongValue4 ^ j113;
                                            long j119 = ((j111 | j118) | j115) ^ j113;
                                            j = j112 + (((long) (-713)) * (j117 | j119)) + (((long) 1426) * j119) + (((long) 713) * ((j118 | j116) ^ j113)) + ((long) (-1376699014));
                                        }
                                        j2 = j;
                                        int i411 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                        i14 = ((i411 | 75) << 1) - (i411 ^ 75);
                                        TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                                        if (i14 % 2 != 0) {
                                            int i412 = (int) (j2 << 25);
                                            int i510 = ~((int) Process.getStartUptimeMillis());
                                            i15 = i412 & (((((~((-1566469304) | i510)) | 1481271475) * (-241)) - 766694931) + (((~(i510 | (-85197829))) | (-1610514368)) * 241));
                                            i16 = (int) j2;
                                            i17 = (-635053948) + (((-1090605065) | i) * (-627)) + (((~((-1019096568) | i)) | 1838644318) * (-627));
                                            i18 = ((~((~i) | 1019096567)) | (~(1838644318 | i))) * 627;
                                        } else {
                                            int i511 = ~i;
                                            i15 = ((int) (j2 >> 32)) & (1972008040 + (((~((-61767844) | i511)) | (~((-1375458568) | i511))) * (-867)) + (((~((-61767844) | i)) | 27951107 | (~((-1375458568) | i))) * (-1734)) + (((~((-27951108) | i511)) | (~((-33816737) | i)) | (~((-1347507461) | i))) * 867));
                                            i16 = (int) j2;
                                            int i512 = ~(401491595 | i511);
                                            i17 = ((92800001 | i512) * (-374)) - 576303569;
                                            i18 = (i512 | 308691594) * 374;
                                        }
                                        int i513 = i16 & (i17 + i18);
                                        i9 = (i15 & i513) | (i15 ^ i513);
                                        int i514 = TuitionPaymentFragmentbindingInflater1 + 43;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i514 % 128;
                                        int i515 = i514 % 2;
                                    } else {
                                        i24 = i4;
                                        Object[] objArr115 = new Object[1];
                                        a(new char[]{18324, 45841, 18341, 12969, 17118}, TextUtils.indexOf("", ""), objArr115);
                                        str = (String) objArr115[0];
                                        char[] cArr3 = {26252, 37554, 26366, 22033, 64383, 19519, 29385, 575, 30169, 17708, 26562, 11724, 16523, 31231, 21733, 14487, 24441};
                                        int iIndexOf3 = TextUtils.indexOf("", "", 0, 0);
                                        int i516 = TuitionPaymentFragmentbindingInflater1 + 89;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i516 % 128;
                                        int i517 = i516 % 2;
                                        Object[] objArr116 = new Object[1];
                                        a(cArr3, iIndexOf3, objArr116);
                                        objArr2 = new Object[]{(String) objArr116[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char cResolveSizeAndState2 = (char) (33602 - View.resolveSizeAndState(0, 0, 0));
                                            int iAlpha2 = 3085 - Color.alpha(0);
                                            int i518 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27;
                                            byte[] bArr6 = $$a;
                                            short s6 = bArr6[7];
                                            Object[] objArr117 = new Object[1];
                                            c(s6, (byte) (s6 | 52), bArr6[5], objArr117);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState2, iAlpha2, i518, 1411172903, false, (String) objArr117[0], new Class[]{String.class});
                                        }
                                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                            i9 = 1;
                                        } else {
                                            i9 = 0;
                                        }
                                    }
                                    int i519 = (~(i & 10)) & (i | 10);
                                    int i610 = -i9;
                                    int i611 = ((i9 & i610) | (i9 ^ i610)) >> 31;
                                    int i612 = (~i611) & i;
                                    int i613 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i614 = (i613 ^ 81) + ((i613 & 81) << 1);
                                    TuitionPaymentFragmentbindingInflater1 = i614 % 128;
                                    int i615 = i614 % 2;
                                    i10 = (i611 & i519) | i612;
                                    int i616 = i2 & 32;
                                    int i617 = i613 + 103;
                                    TuitionPaymentFragmentbindingInflater1 = i617 % 128;
                                    int i618 = i617 % 2;
                                    int i619 = -i616;
                                    i11 = ((i619 & i616) | (i616 ^ i619)) >> 31;
                                    i12 = (i613 ^ 59) + ((i613 & 59) << 1);
                                    TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                                    if (i12 % 2 != 0) {
                                        Object obj2 = null;
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    int i74 = i10 & (~i11);
                                    int i75 = i11 & i;
                                    i5 = (i74 & i75) | (i74 ^ i75);
                                }
                            } else if (Build.VERSION.SDK_INT == 30) {
                                int i76 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
                                TuitionPaymentFragmentbindingInflater1 = i76 % 128;
                                int i77 = i76 % 2;
                                i5 = i;
                                i24 = i4;
                            } else {
                                try {
                                    try {
                                        if (Build.VERSION.SDK_INT > 33) {
                                            i13 = TuitionPaymentFragmentbindingInflater1 + 55;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                                            if (i13 % 2 == 0) {
                                                Object[] objArr118 = new Object[1];
                                                a(new char[]{52128, 64244, 52111, 15965, 41893, 17896, 10825, 3055, 55487, 11617, 16131, 9237, 60852, 4599, 3121, 12608, 62043, 1228, 24736, 49784, 34565, 60186, 30088, 57003, 37943, 56873, 19023, 60368, 47333, 52534, 24431, 33807}, View.MeasureSpec.makeMeasureSpec(0, 1), objArr118);
                                                try {
                                                    Object[] objArr119 = {(String) objArr118[0]};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                        char cRgb3 = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                                                        int longPressTimeout3 = 993 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                                        int i413 = 9 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                        byte[] bArr7 = $$a;
                                                        short s7 = bArr7[7];
                                                        Object[] objArr1110 = new Object[1];
                                                        c(s7, (byte) (s7 | 52), bArr7[5], objArr1110);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb3, longPressTimeout3, i413, 410748506, false, (String) objArr1110[0], new Class[]{String.class});
                                                    }
                                                    long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr119)).longValue();
                                                    long j27 = 1756866077;
                                                    long j28 = (((long) (-589)) * j27) + (((long) 591) * jLongValue5);
                                                    long j29 = 590;
                                                    long j210 = -1;
                                                    long j211 = jLongValue5 ^ j210;
                                                    long jElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                                                    long j212 = jElapsedRealtime3 ^ j210;
                                                    long j213 = ((j211 | j212) ^ j210) | ((j211 | j27) ^ j210) | ((j212 | j27) ^ j210);
                                                    long j1110 = j27 ^ j210;
                                                    i24 = i4;
                                                    j = j28 + (j29 * (j213 | (((j1110 | jLongValue5) | jElapsedRealtime3) ^ j210))) + (((long) (-1180)) * j213) + ((((j1110 | j212) ^ j210) | ((j212 | jLongValue5) ^ j210)) * j29) + ((long) (-1957784314));
                                                } catch (Throwable th2) {
                                                    Throwable cause2 = th2.getCause();
                                                    if (cause2 != null) {
                                                        throw cause2;
                                                    }
                                                    throw th2;
                                                }
                                            } else {
                                                i24 = i4;
                                                Object[] objArr1111 = new Object[1];
                                                a(new char[]{52128, 64244, 52111, 15965, 41893, 17896, 10825, 3055, 55487, 11617, 16131, 9237, 60852, 4599, 3121, 12608, 62043, 1228, 24736, 49784, 34565, 60186, 30088, 57003, 37943, 56873, 19023, 60368, 47333, 52534, 24431, 33807}, View.MeasureSpec.makeMeasureSpec(0, 0), objArr1111);
                                                try {
                                                    Object[] objArr1112 = {(String) objArr1111[0]};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                        char cIndexOf4 = (char) TextUtils.indexOf("", "", 0, 0);
                                                        int scrollBarSize4 = 993 - (ViewConfiguration.getScrollBarSize() >> 8);
                                                        int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 8;
                                                        byte[] bArr8 = $$a;
                                                        short s8 = bArr8[7];
                                                        Object[] objArr1113 = new Object[1];
                                                        c(s8, (byte) (s8 | 52), bArr8[5], objArr1113);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf4, scrollBarSize4, edgeSlop3, 410748506, false, (String) objArr1113[0], new Class[]{String.class});
                                                    }
                                                    long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr1112)).longValue();
                                                    long j1111 = 1175780777;
                                                    long j1112 = (((long) 714) * j1111) + (((long) (-712)) * jLongValue6);
                                                    long j1113 = -1;
                                                    long j1114 = j1111 ^ j1113;
                                                    long j1115 = i;
                                                    long j1116 = j1115 ^ j1113;
                                                    long j1117 = ((j1114 | j1116) ^ j1113) | ((j1114 | jLongValue6) ^ j1113);
                                                    long j1118 = jLongValue6 ^ j1113;
                                                    long j1119 = ((j1111 | j1118) | j1115) ^ j1113;
                                                    j = j1112 + (((long) (-713)) * (j1117 | j1119)) + (((long) 1426) * j1119) + (((long) 713) * ((j1118 | j1116) ^ j1113)) + ((long) (-1376699014));
                                                } catch (Throwable th3) {
                                                    Throwable cause3 = th3.getCause();
                                                    if (cause3 != null) {
                                                        throw cause3;
                                                    }
                                                    throw th3;
                                                }
                                            }
                                            j2 = j;
                                            int i414 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                            i14 = ((i414 | 75) << 1) - (i414 ^ 75);
                                            TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                                            if (i14 % 2 != 0) {
                                                int i415 = (int) (j2 << 25);
                                                int i5110 = ~((int) Process.getStartUptimeMillis());
                                                i15 = i415 & (((((~((-1566469304) | i5110)) | 1481271475) * (-241)) - 766694931) + (((~(i5110 | (-85197829))) | (-1610514368)) * 241));
                                                i16 = (int) j2;
                                                i17 = (-635053948) + (((-1090605065) | i) * (-627)) + (((~((-1019096568) | i)) | 1838644318) * (-627));
                                                i18 = ((~((~i) | 1019096567)) | (~(1838644318 | i))) * 627;
                                            } else {
                                                int i5111 = ~i;
                                                i15 = ((int) (j2 >> 32)) & (1972008040 + (((~((-61767844) | i5111)) | (~((-1375458568) | i5111))) * (-867)) + (((~((-61767844) | i)) | 27951107 | (~((-1375458568) | i))) * (-1734)) + (((~((-27951108) | i5111)) | (~((-33816737) | i)) | (~((-1347507461) | i))) * 867));
                                                i16 = (int) j2;
                                                int i5112 = ~(401491595 | i5111);
                                                i17 = ((92800001 | i5112) * (-374)) - 576303569;
                                                i18 = (i5112 | 308691594) * 374;
                                            }
                                            int i5113 = i16 & (i17 + i18);
                                            i9 = (i15 & i5113) | (i15 ^ i5113);
                                            int i5114 = TuitionPaymentFragmentbindingInflater1 + 43;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5114 % 128;
                                            int i5115 = i5114 % 2;
                                        } else {
                                            i24 = i4;
                                            Object[] objArr1114 = new Object[1];
                                            a(new char[]{18324, 45841, 18341, 12969, 17118}, TextUtils.indexOf("", ""), objArr1114);
                                            str = (String) objArr1114[0];
                                            char[] cArr4 = {26252, 37554, 26366, 22033, 64383, 19519, 29385, 575, 30169, 17708, 26562, 11724, 16523, 31231, 21733, 14487, 24441};
                                            int iIndexOf4 = TextUtils.indexOf("", "", 0, 0);
                                            int i5116 = TuitionPaymentFragmentbindingInflater1 + 89;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5116 % 128;
                                            int i5117 = i5116 % 2;
                                            Object[] objArr1115 = new Object[1];
                                            a(cArr4, iIndexOf4, objArr1115);
                                            try {
                                                objArr2 = new Object[]{(String) objArr1115[0]};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char cResolveSizeAndState3 = (char) (33602 - View.resolveSizeAndState(0, 0, 0));
                                                    int iAlpha3 = 3085 - Color.alpha(0);
                                                    int i5118 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27;
                                                    byte[] bArr9 = $$a;
                                                    short s9 = bArr9[7];
                                                    Object[] objArr1116 = new Object[1];
                                                    c(s9, (byte) (s9 | 52), bArr9[5], objArr1116);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState3, iAlpha3, i5118, 1411172903, false, (String) objArr1116[0], new Class[]{String.class});
                                                }
                                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                                    i9 = 1;
                                                } else {
                                                    i9 = 0;
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
                                        i9 = 0;
                                    }
                                } catch (Exception unused2) {
                                    i24 = i4;
                                }
                                int i5119 = (~(i & 10)) & (i | 10);
                                int i6110 = -i9;
                                int i6111 = ((i9 & i6110) | (i9 ^ i6110)) >> 31;
                                int i6112 = (~i6111) & i;
                                int i6113 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i6114 = (i6113 ^ 81) + ((i6113 & 81) << 1);
                                TuitionPaymentFragmentbindingInflater1 = i6114 % 128;
                                int i6115 = i6114 % 2;
                                i10 = (i6111 & i5119) | i6112;
                                int i6116 = i2 & 32;
                                int i6117 = i6113 + 103;
                                TuitionPaymentFragmentbindingInflater1 = i6117 % 128;
                                int i6118 = i6117 % 2;
                                int i6119 = -i6116;
                                i11 = ((i6119 & i6116) | (i6116 ^ i6119)) >> 31;
                                i12 = (i6113 ^ 59) + ((i6113 & 59) << 1);
                                TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                                if (i12 % 2 != 0) {
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                                int i78 = i10 & (~i11);
                                int i79 = i11 & i;
                                i5 = (i78 & i79) | (i78 ^ i79);
                            }
                            int i80 = i ^ i24;
                            int i81 = -i80;
                            int i82 = ((i80 & i81) | (i80 ^ i81)) >> 31;
                            int i83 = TuitionPaymentFragmentbindingInflater1 + 119;
                            int i84 = i83 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i84;
                            if (i83 % 2 == 0) {
                                int i85 = i5 & (~i82);
                                int i86 = i82 & i24;
                                i6 = (i85 & i86) | (i85 ^ i86);
                                objArr = new Object[4];
                                objArr[0] = new int[0];
                                objArr[0] = new int[0];
                                objArr[3] = new int[0];
                                i7 = 1;
                                i8 = 2;
                            } else {
                                int i87 = i5 & (~i82);
                                int i88 = i82 & i24;
                                i6 = (i87 & i88) | (i87 ^ i88);
                                objArr = new Object[4];
                                i7 = 1;
                                objArr[0] = new int[1];
                                objArr[1] = new int[1];
                                i8 = 2;
                                objArr[2] = new int[1];
                            }
                            int i89 = ((i84 | 67) << i7) - (i84 ^ 67);
                            TuitionPaymentFragmentbindingInflater1 = i89 % 128;
                            int i90 = i89 % i8;
                            int i91 = (~(i & i6)) & (i | i6);
                            int i92 = -i91;
                            int i93 = (((i91 & i92) | (i91 ^ i92)) >> 31) & 16;
                            int i94 = i84 + 49;
                            TuitionPaymentFragmentbindingInflater1 = i94 % 128;
                            if (i94 % 2 != 0) {
                                ((int[]) objArr[0])[1] = i;
                                ((int[]) objArr[5])[0] = i6;
                                objArr[4] = null;
                            } else {
                                ((int[]) objArr[0])[0] = i;
                                ((int[]) objArr[2])[0] = i6;
                                objArr[3] = null;
                            }
                            int i95 = ~(773354897 | i);
                            int i96 = (((((-106820277) + (((-800686014) | i95) * (-814))) + ((i95 | ((~((~i) | 733044668)) | 705713552)) * 407)) + ((((~((-773354898) | i)) | 705713552) | (~(i | (-733044669)))) * 407)) - (~(-(-i93)))) - 1;
                            int iB = ClaimOldDaySecurityTermsConditionActivity.b.b();
                            int i97 = i96 * 677;
                            int i98 = -(-(i3 * (-675)));
                            int i99 = (i97 ^ i98) + ((i97 & i98) << 1);
                            int i100 = (i96 ^ iB) | (i96 & iB);
                            int i101 = ~i3;
                            int i102 = i99 + (((i100 & i101) | (i100 ^ i101)) * (-676));
                            int i103 = ~((i101 ^ i96) | (i101 & i96));
                            int i104 = ~iB;
                            int i105 = ~((i104 & i96) | (i104 ^ i96));
                            int i106 = TuitionPaymentFragmentbindingInflater1;
                            int i107 = (i106 ^ 65) + ((i106 & 65) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i107 % 128;
                            int i108 = i107 % 2;
                            int i109 = 676 * ((i103 & i105) | (i103 ^ i105));
                            int i110 = (i102 ^ i109) + ((i102 & i109) << 1);
                            int i111 = ~i96;
                            int i112 = ~((i111 & i101) | (i111 ^ i101));
                            int i113 = ~iB;
                            int i114 = ~((i101 & i113) | (i101 ^ i113));
                            ClaimOldDaySecurityTermsConditionActivity.b.b();
                            int i115 = 676 * ((~(iB | (i3 & i96) | (i96 ^ i3))) | (i114 & i112) | (i112 ^ i114));
                            int i116 = (i110 ^ i115) + ((i110 & i115) << 1);
                            int i117 = i116 << 13;
                            int i118 = ((~i116) & i117) | ((~i117) & i116);
                            int i119 = i118 ^ (i118 >>> 17);
                            ((int[]) objArr[1])[0] = i119 ^ (i119 << 5);
                            int i120 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
                            TuitionPaymentFragmentbindingInflater1 = i120 % 128;
                            if (i120 % 2 != 0) {
                                int i121 = 32 / 0;
                            }
                            return objArr;
                        } catch (Throwable th5) {
                            Throwable cause5 = th5.getCause();
                            if (cause5 != null) {
                                throw cause5;
                            }
                            throw th5;
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static java.lang.String $$e(short r6, byte r7, int r8) {
                        /*
                            int r8 = r8 * 3
                            int r8 = 3 - r8
                            byte[] r0 = com.google.mlkit.common.sdkinternal.zzi.$$c
                            int r6 = r6 * 2
                            int r6 = r6 + 1
                            int r7 = r7 * 2
                            int r7 = 107 - r7
                            byte[] r1 = new byte[r6]
                            r2 = 0
                            if (r0 != 0) goto L16
                            r3 = r8
                            r4 = r2
                            goto L2d
                        L16:
                            r3 = r2
                        L17:
                            int r8 = r8 + 1
                            byte r4 = (byte) r7
                            r1[r3] = r4
                            int r3 = r3 + 1
                            if (r3 != r6) goto L26
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r1, r2)
                            return r6
                        L26:
                            r4 = r0[r8]
                            r5 = r8
                            r8 = r7
                            r7 = r4
                            r4 = r3
                            r3 = r5
                        L2d:
                            int r7 = r7 + r8
                            r8 = r3
                            r3 = r4
                            goto L17
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.zzi.$$e(short, byte, int):java.lang.String");
                    }
                });
            }
        });
        this.zzb = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    static /* synthetic */ void zzd(Runnable runnable) {
        zza.set(new ArrayDeque());
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zze(Deque deque, Runnable runnable) {
        Preconditions.checkNotNull(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbe, java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Deque deque = (Deque) zza.get();
        if (deque == null || deque.size() > 1) {
            this.zzb.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzk
                @Override // java.lang.Runnable
                public final void run() {
                    MlKitThreadPool.zze((Deque) MlKitThreadPool.zza.get(), runnable);
                }
            });
        } else {
            zze(deque, runnable);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbe, com.google.android.gms.internal.mlkit_common.zzag
    public final /* synthetic */ Object zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbe
    public final ExecutorService zzb() {
        return this.zzb;
    }
}
