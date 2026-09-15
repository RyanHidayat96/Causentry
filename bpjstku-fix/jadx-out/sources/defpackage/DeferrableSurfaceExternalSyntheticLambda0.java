package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.TrustedListenableFutureTask;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class DeferrableSurfaceExternalSyntheticLambda0 {

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends fetchData {
        private final ExecutorService TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private static final byte[] $$h = {12, 11, -9, -106};
        private static final int $$i = 26;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {14, 70, 6, -35, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
        private static final int $$e = 109;
        private static int b = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        private static long TuitionPaymentFragmentbindingInflater1 = -3552193437914614267L;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(int r5, int r6, short r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 4
                int r5 = 3 - r5
                int r7 = r7 * 3
                int r7 = r7 + 84
                byte[] r0 = DeferrableSurfaceExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$d
                int r6 = r6 * 3
                int r1 = 53 - r6
                byte[] r1 = new byte[r1]
                int r6 = 52 - r6
                r2 = 0
                if (r0 != 0) goto L19
                r4 = r7
                r3 = r2
                r7 = r6
                goto L2d
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r6) goto L27
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L27:
                int r3 = r3 + 1
                int r5 = r5 + 1
                r4 = r0[r5]
            L2d:
                int r7 = r7 + r4
                int r7 = r7 + (-11)
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: DeferrableSurfaceExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2.e(int, int, short, java.lang.Object[]):void");
        }

        private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            abortCapture abortcapture = new abortCapture();
            char[] cArrB = abortCapture.b(TuitionPaymentFragmentbindingInflater1 ^ (-2687588926731523482L), cArr, i);
            int i3 = 4;
            abortcapture.b = 4;
            int i4 = $11 + 13;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            while (abortcapture.b < cArrB.length) {
                int i6 = $10 + 121;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - i3;
                int i8 = abortcapture.b;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % i3]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1356, 37 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 894276454, false, $$j(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrB[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 469, 13 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    int i9 = $11 + 121;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
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

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(ExecutorService executorService) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = executorService;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            int i = 2 % 2;
            int i2 = b + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.awaitTermination(j, timeUnit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean zAwaitTermination = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.awaitTermination(j, timeUnit);
            int i3 = b + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            return zAwaitTermination;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            int i = 2 % 2;
            int i2 = b + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            ExecutorService executorService = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (i3 != 0) {
                return executorService.isShutdown();
            }
            executorService.isShutdown();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() throws Throwable {
            int iIntValue;
            int i;
            int i2 = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
            int i3 = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.resolveSizeAndState(0, 0, 0) + 46400), (-16777176) - Color.rgb(0, 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
            Object[] objArr = new Object[1];
            d(new char[]{1746, 6902, 1715, 50939, 55164, 28638, 63375, 25300, 30513, 22384, 17896, 61716, 58789, 42494, 62510, 36765, 21007, 11138, 25280, 7719, 49295, 47142, 4420, 44217, 12557, 3714}, -TextUtils.lastIndexOf("", '0', 0), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            d(new char[]{17666, 16487, 17767, 40040, 42753, 8102, 21711, 49558, 13565, 3565, 13712, 21032, 42623, 65405, 33812, 11514, 4559, 28941, 4777}, 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
            long j = -1;
            long j2 = j ^ 1469756359580671137L;
            long j3 = (int) Runtime.getRuntime().totalMemory();
            long j4 = j3 ^ j;
            long j5 = j ^ 627500815161287850L;
            long j6 = (j3 | (j5 | 1469756359580671137L)) ^ j;
            long j7 = (((long) 714) * 1469756359580671137L) + (((long) (-712)) * 627500815161287850L) + (((long) (-713)) * (((j2 | j4) ^ j) | ((j2 | 627500815161287850L) ^ j) | j6)) + (((long) 1426) * j6) + (((long) 713) * ((j5 | j4) ^ j));
            int i5 = 0;
            try {
                while (i5 != 10) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 59 - (KeyEvent.getMaxKeyCode() >> 16), 18 - (CdmaCellLocation.convertQuartSecToDecDegrees(i3) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i3) == 0.0d ? 0 : -1)), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    int i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                    int i7 = b + 97;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = i3;
                    long j8 = jLongValue;
                    while (true) {
                        int i10 = i3;
                        while (i10 != 8) {
                            int i11 = b + 95;
                            int i12 = i11 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12;
                            if (i11 % 2 == 0) {
                                i = (((((int) (j8 << i10)) & 8131) << (i6 * 11)) + (i6 / 42)) - i6;
                                i10 += 32;
                            } else {
                                i = (((((int) (j8 >> i10)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                                i10++;
                            }
                            i6 = i;
                            int i13 = i12 + 21;
                            b = i13 % 128;
                            if (i13 % 2 != 0) {
                                int i14 = 5 / 4;
                            }
                        }
                        if (i9 != 0) {
                            break;
                        }
                        int i15 = b + 79;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                        int i16 = i15 % 2;
                        i9++;
                        j8 = j7;
                        i3 = 0;
                    }
                    if (i6 == i4) {
                        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isTerminated();
                    }
                    int i17 = b + 27;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
                    int i18 = i17 % 2;
                    jLongValue -= 1024;
                    i5++;
                    i3 = 0;
                }
                Object[] objArr3 = {-706912423};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46038 - ExpandableListView.getPackedPositionGroup(0L)), 1133 - TextUtils.lastIndexOf("", '0', 0), 18 - ((Process.getThreadPriority(0) + 20) >> 6), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr4 = {Integer.valueOf(iIntValue), 0, 1197547005, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr3), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char size = (char) View.MeasureSpec.getSize(0);
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1031;
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15;
                    byte b2 = $$d[7];
                    byte b3 = b2;
                    Object[] objArr5 = new Object[1];
                    e(b2, b3, b3, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(size, iNormalizeMetaState, maximumFlingVelocity, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (AndroidCharacter.getMirror('0') + 45945), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1117, 17 - Drawable.resolveOpacity(0, 0)), Boolean.TYPE});
                }
                Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4);
                int i19 = ((int[]) objArr6[1])[0];
                int i20 = ((int[]) objArr6[3])[0];
                if (i20 != i19) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr6[0];
                    if (strArr != null) {
                        int i21 = b + 119;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 % 128;
                        int i22 = i21 % 2 != 0 ? 0 : 1;
                        while (i22 < strArr.length) {
                            int i23 = b + 21;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 % 128;
                            if (i23 % 2 == 0) {
                                arrayList.add(strArr[i22]);
                                i22 += 67;
                            } else {
                                arrayList.add(strArr[i22]);
                                i22++;
                            }
                            int i24 = b + 65;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i24 % 128;
                            int i25 = i24 % 2;
                        }
                    }
                    throw new RuntimeException(String.valueOf(i20));
                }
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isTerminated();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
            Object[] objArr7 = new Object[1];
            d(new char[]{16670, 57559, 16756, 15573, 46699, 3803, 54981, 17293, 12476, 44372, 9448, 53278, 41569, 24450, 38230, 44797, 5577, 53668, 980, 16229}, 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            d(new char[]{17844, 9841, 17885, 64118, 49584, 30995, 1027, 37188, 13388, 27639, 21301, 719, 42724, 39275, 58046, 31786, 4435, 5913, 29725, 60843}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr8);
            iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
            b = i2 % 128;
            int i3 = i2 % 2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.shutdown();
            int i4 = b + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            int i = 2 % 2;
            int i2 = b + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.shutdownNow();
                throw null;
            }
            List<Runnable> listShutdownNow = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.shutdownNow();
            int i3 = b + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            return listShutdownNow;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            int i = 2 % 2;
            int i2 = b + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.execute(runnable);
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String toString() {
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("[");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            sb.append("]");
            String string = sb.toString();
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 37 / 0;
            }
            return string;
        }

        private static String $$j(short s, short s2, int i) {
            int i2 = s + 4;
            byte[] bArr = $$h;
            int i3 = s2 * 2;
            int i4 = (i * 4) + 107;
            byte[] bArr2 = new byte[1 - i3];
            int i5 = 0 - i3;
            int i6 = -1;
            if (bArr == null) {
                i4 = (-i4) + i5;
                i6 = -1;
            }
            while (true) {
                int i7 = i6 + 1;
                bArr2[i7] = (byte) i4;
                if (i7 == i5) {
                    return new String(bArr2, 0);
                }
                i2++;
                i4 = (-bArr[i2]) + i4;
                i6 = i7;
            }
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements DeferrableSurfaceExternalSyntheticLambda2 {
        private ScheduledExecutorService TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = scheduledExecutorService;
        }

        @Override // defpackage.DeferrableSurfaceExternalSyntheticLambda2
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1 */
        public final lambdanew1androidxcameracoreimplDeferrableSurface<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            TrustedListenableFutureTask trustedListenableFutureTaskTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TrustedListenableFutureTask.TuitionPaymentFragmentspecialinlinedviewModeldefault2(runnable, null);
            return new b(trustedListenableFutureTaskTuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.schedule(trustedListenableFutureTaskTuitionPaymentFragmentspecialinlinedviewModeldefault2, j, timeUnit));
        }

        @Override // defpackage.DeferrableSurfaceExternalSyntheticLambda2
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
        public final <V> lambdanew1androidxcameracoreimplDeferrableSurface<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
            TrustedListenableFutureTask trustedListenableFutureTaskTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TrustedListenableFutureTask.TuitionPaymentFragmentspecialinlinedviewModeldefault3(callable);
            return new b(trustedListenableFutureTaskTuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.schedule(trustedListenableFutureTaskTuitionPaymentFragmentspecialinlinedviewModeldefault3, j, timeUnit));
        }

        @Override // defpackage.DeferrableSurfaceExternalSyntheticLambda2, java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
        public final lambdanew1androidxcameracoreimplDeferrableSurface<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(runnable);
            return new b(tuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.scheduleAtFixedRate(tuitionPaymentFragmentspecialinlinedviewModeldefault1, j, j2, timeUnit));
        }

        @Override // defpackage.DeferrableSurfaceExternalSyntheticLambda2, java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: b */
        public final lambdanew1androidxcameracoreimplDeferrableSurface<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(runnable);
            return new b(tuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.scheduleWithFixedDelay(tuitionPaymentFragmentspecialinlinedviewModeldefault1, j, j2, timeUnit));
        }

        static final class b<V> extends ConvergenceUtils.TuitionPaymentFragmentspecialinlinedviewModeldefault3<V> implements lambdanew1androidxcameracoreimplDeferrableSurface<V> {
            private final ScheduledFuture<?> TuitionPaymentFragmentbindingInflater1;

            @Override // java.lang.Comparable
            public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
                return this.TuitionPaymentFragmentbindingInflater1.compareTo(delayed);
            }

            public b(ListenableFuture<V> listenableFuture, ScheduledFuture<?> scheduledFuture) {
                super(listenableFuture);
                this.TuitionPaymentFragmentbindingInflater1 = scheduledFuture;
            }

            @Override // defpackage.printGlobalDebugCounts, java.util.concurrent.Future
            public final boolean cancel(boolean z) {
                boolean zCancel = super.cancel(z);
                if (zCancel) {
                    this.TuitionPaymentFragmentbindingInflater1.cancel(z);
                }
                return zCancel;
            }

            @Override // java.util.concurrent.Delayed
            public final long getDelay(TimeUnit timeUnit) {
                return this.TuitionPaymentFragmentbindingInflater1.getDelay(timeUnit);
            }
        }

        static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends withValue.asBinder<Void> implements Runnable {
            private final Runnable TuitionPaymentFragmentspecialinlinedviewModeldefault2;

            public TuitionPaymentFragmentspecialinlinedviewModeldefault1(Runnable runnable) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.run();
                } catch (Throwable th) {
                    setException(th);
                    throw th;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // defpackage.withValue
            public final String pendingToString() {
                StringBuilder sb = new StringBuilder("task=[");
                sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                sb.append("]");
                return sb.toString();
            }
        }

        @Override // defpackage.DeferrableSurfaceExternalSyntheticLambda2, java.util.concurrent.ScheduledExecutorService
        public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            TrustedListenableFutureTask trustedListenableFutureTaskTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TrustedListenableFutureTask.TuitionPaymentFragmentspecialinlinedviewModeldefault2(runnable, null);
            return new b(trustedListenableFutureTaskTuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.schedule(trustedListenableFutureTaskTuitionPaymentFragmentspecialinlinedviewModeldefault2, j, timeUnit));
        }

        @Override // defpackage.DeferrableSurfaceExternalSyntheticLambda2, java.util.concurrent.ScheduledExecutorService
        public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
            TrustedListenableFutureTask trustedListenableFutureTaskTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TrustedListenableFutureTask.TuitionPaymentFragmentspecialinlinedviewModeldefault3(callable);
            return new b(trustedListenableFutureTaskTuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.schedule(trustedListenableFutureTaskTuitionPaymentFragmentspecialinlinedviewModeldefault3, j, timeUnit));
        }
    }

    /* JADX INFO: renamed from: DeferrableSurfaceExternalSyntheticLambda0$5, reason: invalid class name */
    public class AnonymousClass5 implements Executor {
        private /* synthetic */ withValue TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ Executor b;

        AnonymousClass5(Executor executor, withValue withvalue) {
            this.b = executor;
            this.TuitionPaymentFragmentbindingInflater1 = withvalue;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            try {
                this.b.execute(runnable);
            } catch (RejectedExecutionException e2) {
                this.TuitionPaymentFragmentbindingInflater1.setException(e2);
            }
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            Futures1.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0] = FuturesExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0];
        }
    }
}
