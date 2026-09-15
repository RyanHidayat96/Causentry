package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.Constants;
import defpackage.DecorContentParent;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.ref.SoftReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.io.encoding.Base64;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
public abstract class CloudMessagingReceiver extends BroadcastReceiver {
    private static SoftReference zza;
    private static SoftReference zzb;
    private static final byte[] $$c = {83, -44, 103, 46};
    private static final int $$f = 19;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {63, 56, -36, -117, 12, 1, 9, -51, 35, 3, -7, -17, 27, -32, 38, -1, -4, 5, -1, -33, 33, -2, -13, -4, 12, 33, -12, 11, -11, 6, -1, -30, 17, 24, -12, -8, 9, 6, -46, 44, -17, 6, 6, -8, 9, 6, -1, -3, -11, -2, 6, -8, 11, -3, 5, -2, -3, 5, -9, -1, 18, -13, -4, 18, -42, 34, -11, 1, 7, -8, 1, 1, -5, 20, -9, 8, -65, 51, -15, 0, -1, 13, -13, -1, -35, 52, -17, 5, 6, -28, 33, -2, -13, -4, 12, 33, -12, 11, -11, 6, -1, -30, 17, 24, -12, -8, 9, 6, -46, 44, -17, 6, 6, -8, 9, 6, -18, 7, 5, -10, 5, 5, -7, -30, 37, -8, 6, -11, 19, -15, 13, -65, 12, -2, -63, 52, 14, -6, 9, 1, -9, 10, -71, 54, -3, 19, -19, -51, 71, -2, -14, 13, -68, 63, 2, -11, 1, 7, -62, 68, -13, 12, 4, -16, 14, 1, -70, 39, 27, -12, -3, 19, -15, -33, 33, 17, -13, -6, 2, -17, 27, -4, -6, 9, 12, -2, -63, 52, 14, -6, 9, 1, -9, 10, -71, 71, -1, -11, 3, -62, 53, 12, -1, 5, 1, -19, 13, 6, -70, 23, 31, 17, -18, -2, 19, -11, 6, -1, -43, 44, -11, 1, -65, 48, 33, -12, 11, -11, 6, -1, -30, 17, 24, -12, -8, 9, 6, -46, 44, -17, 6, 6, -8, 9, 6, -1, -3, -11, -2, 6, -8, 11, -3, 5, -2, -3, 5, -9, -1, 18, -13, -4, 18, -42, 34, -11, 1, 7, -8, 1, 1, -5, 20, -9, 8, -67, 38, 3, -14, 19, -34, 15, 13, -7, -2, 12, -2, -63, 52, 14, -6, 9, 1, -9, 10, -71, 54, -3, 19, -19, 1, 7, 5, -10, 5, 5, -7, -57, 19, 34, 17, -11, 13, -13, 11, 5, -56, 50, -10, 2, -25, 19, 14, -10, -2, 7, -27, 14, 11, -11, 17, -9, -4, -1, -13, 24, 3, -7, -6, 13, -32, 19, 2, 2, 10, 1, -2, -17, 19, -11, 6, -1, -44, 39, 5, -10, 5, 5, -7, 33, -12, 11, -11, 6, -1, -30, 17, 24, -12, -8, 9, 6, -46, 44, -17, 6, 6, -8, 9, 6, -1, -3, -11, -2, 6, -8, 11, -3, 5, -2, -3, 5, -9, -1, 18, -13, -4, 18, -42, 34, -11, 1, 7, -8, 1, 1, -5, 20, -9, 8, -67, 12, -2, -63, 52, 14, -6, 9, 1, -9, 10, -71, 54, -3, 19, -19, -51, 67, 4, -16, 16, -16, 4, 5, -7, -57, 68, -13, 8, 2, 5, -15, -55, 35, 36, -16, 16, -16, 4, 5, -7, -38, 47, -7};
    private static final int $$h = 62;
    private static final byte[] $$a = {Base64.padSymbol, -108, 49, -100, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
    private static final int $$b = 119;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {2426, 51731, 36787, 17243, 1260, 55692, 40219, 24319, 4676, 55294, 43209, 27690, 8618, 58694, 42747, 31620, 16150, 61598, 46171, 35302, 19072, 3630, 45561, 29334, 14129, 64478, 48247, 24839, 9628, 58884, 43721, 28523, 4108, 54410, 39229, 24031, 7789, 45558, 29339, 14118, 64463, 48170, 24846, 9625, 58936, 43723, 28452, 4147, 54407, 39207, 24006, 7789, 49931, 56548, 8079, 23076, 38609, 53601, 3098, 18589, 35646, 51189, 634, 32002, 47495, 62470, 12492, 29565, 44562, 45486, 29343, 14134, 64463, 48229, 24832, 9630, 58976, 43669, 28524, 4102, 54475, 39217, 24023, 7785, 50003, 34763, 18539, 3206, 12651, 62033, 46837, 31599, 16340, 57449, 42333, 27042, 10863, 61063, 37750, 21596, 6399, 56677, 33243, 16930, 1879, 52213, 35859, 45184, 30071, 13834, 64255, 48916, 25478, 9330, 59671, 44539, 28179, 4829, 55082, 38984, 23727, 272, 50618, 34346, 19220, 4085, 12306, 62644, 47484, 31254, 16052, 58138, 42980, 32205, 48809, 64262, 14250, 28678, 44389, 59816, 10835, 26363, 41822, 56418, 6318, 21763, 37298, 53852, 3936, 19452, 33883, 49332, 64783, 15971, 31431, 46860, 62386, 11356, 26988, 42384, 58965, 8885, 24345, 39011, 54476, 4439, 19946, 36375, 52077, 1986, 16501, 31979, 47382, 64108, 13981, 29556, 44986, 59409, 9588, 25033, 41511, 57015, 6987, 21627, 37061, 52596, 2436, 18969, 34678, 50077, 64638, 14464, 29976, 46631, 62160, 12076, 27602};
    private static long b = -6547465754702482694L;

    public static final class IntentActionKeys {
        public static final String NOTIFICATION_DISMISS = "com.google.firebase.messaging.NOTIFICATION_DISMISS";
        public static final String NOTIFICATION_OPEN = "com.google.firebase.messaging.NOTIFICATION_OPEN";

        private IntentActionKeys() {
        }
    }

    public static final class IntentKeys {
        public static final String PENDING_INTENT = "pending_intent";
        public static final String WRAPPED_INTENT = "wrapped_intent";

        private IntentKeys() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = 103 - r7
            int r5 = r5 + 4
            byte[] r0 = com.google.android.gms.cloudmessaging.CloudMessagingReceiver.$$a
            int r6 = 53 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L10
            r4 = r6
            r3 = r2
            goto L24
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L20:
            int r5 = r5 + 1
            r4 = r0[r5]
        L24:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.CloudMessagingReceiver.c(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.android.gms.cloudmessaging.CloudMessagingReceiver.$$g
            int r6 = 99 - r6
            int r5 = 410 - r5
            int r1 = 93 - r7
            byte[] r1 = new byte[r1]
            int r7 = 92 - r7
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r5 = r5 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r3 = r0[r5]
        L26:
            int r6 = r6 + r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.CloudMessagingReceiver.d(short, byte, int, java.lang.Object[]):void");
    }

    protected Executor getBroadcastExecutor() {
        ExecutorService executorServiceUnconfigurableExecutorService;
        synchronized (CloudMessagingReceiver.class) {
            SoftReference softReference = zza;
            executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
            if (executorServiceUnconfigurableExecutorService == null) {
                com.google.android.gms.internal.cloudmessaging.zze.zza();
                executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new NamedThreadFactory("firebase-iid-executor")));
                zza = new SoftReference(executorServiceUnconfigurableExecutorService);
            }
        }
        return executorServiceUnconfigurableExecutorService;
    }

    protected abstract int onMessageReceive(Context context, CloudMessage cloudMessage);

    private final int zzb(Context context, Intent intent) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(IntentKeys.PENDING_INTENT);
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                int i4 = i3 % 2;
            } catch (PendingIntent.CanceledException unused) {
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                extras.remove(IntentKeys.PENDING_INTENT);
                throw null;
            }
            extras.remove(IntentKeys.PENDING_INTENT);
        } else {
            extras = new Bundle();
        }
        if (!Objects.equals(intent.getAction(), IntentActionKeys.NOTIFICATION_DISMISS)) {
            return 500;
        }
        onNotificationDismissed(context, extras);
        return -1;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i4 = $10 + 93;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 4;
        }
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i6 = $11 + 27;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i - i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char gidForName = (char) ((-1) - Process.getGidForName(""));
                        int i8 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2186;
                        int offsetAfter = 40 - TextUtils.getOffsetAfter("", 0);
                        byte b2 = (byte) ($$f & 14);
                        byte b3 = (byte) (b2 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName, i8, offsetAfter, 841711447, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(b), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.blue(0) + 33017), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3010, 25 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 321985076, false, $$i(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cBlue = (char) (Color.blue(0) + 36505);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3376;
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 17;
                        byte b6 = (byte) ($$f & 5);
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue, scrollBarFadeDuration, packedPositionType, -968507904, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i9 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i + i9])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i10 = 2187 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 41;
                    byte b8 = (byte) ($$f & 14);
                    byte b9 = (byte) (b8 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, i10, bitsPerPixel, 841711447, false, $$i(b8, b9, b9), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i9), Long.valueOf(b), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (View.resolveSize(0, 0) + 33017), (KeyEvent.getMaxKeyCode() >> 16) + 3011, 26 - TextUtils.getCapsMode("", 0, 0), 321985076, false, $$i(b10, b11, b11), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i9] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36504);
                    int i11 = 3376 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 17;
                    byte b12 = (byte) ($$f & 5);
                    byte b13 = (byte) (b12 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, i11, offsetAfter2, -968507904, false, $$i(b12, b13, b13), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char c4 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 36506);
                int scrollDefaultDelay = 3376 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int i12 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17;
                byte b14 = (byte) ($$f & 5);
                byte b15 = (byte) (b14 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c4, scrollDefaultDelay, i12, -968507904, false, $$i(b14, b15, b15), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
            int i13 = $11 + 85;
            $10 = i13 % 128;
            int i14 = i13 % 2;
        }
        objArr[0] = new String(cArr);
    }

    final /* synthetic */ void zza(Intent intent, final Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        Executor executorUnconfigurableExecutorService;
        int iZzb;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra(IntentKeys.WRAPPED_INTENT);
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 == null) {
                if (intent.getExtras() == null) {
                    iZzb = 500;
                } else {
                    final CloudMessage cloudMessage = new CloudMessage(intent);
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    synchronized (CloudMessagingReceiver.class) {
                        SoftReference softReference = zzb;
                        executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                        if (executorUnconfigurableExecutorService == null) {
                            com.google.android.gms.internal.cloudmessaging.zze.zza();
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("pscm-ack-executor"));
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                            executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                            zzb = new SoftReference(executorUnconfigurableExecutorService);
                        }
                    }
                    executorUnconfigurableExecutorService.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzg
                        @Override // java.lang.Runnable
                        public final void run() {
                            Task taskZzc;
                            CloudMessage cloudMessage2 = cloudMessage;
                            if (TextUtils.isEmpty(cloudMessage2.getMessageId())) {
                                taskZzc = Tasks.forResult(null);
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putString(Constants.MessagePayloadKeys.MSGID, cloudMessage2.getMessageId());
                                Integer numZza = cloudMessage2.zza();
                                if (numZza != null) {
                                    bundle.putInt(Constants.MessagePayloadKeys.PRODUCT_ID, numZza.intValue());
                                }
                                Context context2 = context;
                                bundle.putBoolean("supports_message_handled", true);
                                taskZzc = zzv.zzb(context2).zzc(2, bundle);
                            }
                            final CountDownLatch countDownLatch2 = countDownLatch;
                            taskZzc.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.cloudmessaging.zze
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzf
                                @Override // com.google.android.gms.tasks.OnCompleteListener
                                public final void onComplete(Task task) {
                                    countDownLatch2.countDown();
                                }
                            });
                        }
                    });
                    int iOnMessageReceive = onMessageReceive(context, cloudMessage);
                    try {
                        countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                    }
                    iZzb = iOnMessageReceive;
                }
            } else {
                iZzb = zzb(context, intent2);
            }
            if (z && pendingResult != null) {
                pendingResult.setResultCode(iZzb);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0239  */
    /* JADX WARN: Code duplicated, block: B:343:0x217b  */
    /* JADX WARN: Code duplicated, block: B:74:0x06a0  */
    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) throws Throwable {
        Context applicationContext;
        String str;
        Object[] objArr;
        int i;
        Object obj;
        Context applicationContext2;
        String str2;
        Object[] objArr2;
        int i2;
        String str3;
        Object[] objArr3;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        Object[] objArr4;
        Object[] objArr5;
        int i3;
        Object[] objArr6;
        Context applicationContext3;
        Object[] objArr7;
        Object[] objArr8;
        int i4;
        Object[] objArr9;
        Object[] objArr10;
        int i5 = 2 % 2;
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
        Object[] objArr11 = new Object[1];
        a(ExpandableListView.getPackedPositionType(0L), 21 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (View.getDefaultSize(0, 0) + 47239), objArr11);
        String str4 = (String) objArr11[0];
        Object[] objArr12 = new Object[1];
        a(22 - TextUtils.indexOf("", ""), 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), objArr12);
        String str5 = (String) objArr12[0];
        Object[] objArr13 = new Object[1];
        a(((byte) KeyEvent.getModifierMetaStateMask()) + 38, 16 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (Process.getGidForName("") + 1), objArr13);
        String str6 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        a(53 - TextUtils.getOffsetAfter("", 0), View.MeasureSpec.getSize(0) + 16, (char) (TextUtils.lastIndexOf("", '0', 0) + 27922), objArr14);
        String str7 = (String) objArr14[0];
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31532);
            int iIndexOf = 920 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28;
            short s = $$a[80];
            Object[] objArr15 = new Object[1];
            c(s, (byte) (s & 52), (byte) ($$b & 13), objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iIndexOf, minimumFlingVelocity, -1048449946, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        long jLongValue = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char minimumFlingVelocity2 = (char) (31533 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 922;
            int touchSlop = 28 - (ViewConfiguration.getTouchSlop() >> 8);
            byte[] bArr = $$a;
            Object[] objArr16 = new Object[1];
            c(bArr[80], bArr[7], bArr[10], objArr16);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity2, iLastIndexOf, touchSlop, -778300370, false, (String) objArr16[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 31533);
                int iBlue = Color.blue(0) + 921;
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 29;
                Object[] objArr17 = new Object[1];
                c((short) ($$b & 187), (byte) 15, $$a[10], objArr17);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, iBlue, iIndexOf2, -1142834547, false, (String) objArr17[0], null);
            }
            Object[] objArr18 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr18[1])[0]}, (Object[]) objArr18[2], new int[]{((int[]) objArr18[3])[0]}, (String[]) objArr18[4]};
            int i8 = (int) Runtime.getRuntime().totalMemory();
            int i9 = ~i8;
            int i10 = (((811682351 + ((((~((-1346905643) | i9)) | (-427174002)) | (~(1346905642 | i8))) * (-564))) + ((~(i8 | (-154536018))) * 1128)) + (((~((-427174002) | i9)) | (-1501441660)) * 564)) - 999792966;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
            str = str5;
        } else {
            if (context == null) {
                applicationContext = context;
            } else if (context instanceof ContextWrapper) {
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                int i14 = i13 % 2;
                if (((ContextWrapper) context).getBaseContext() != null) {
                    applicationContext = context.getApplicationContext();
                } else {
                    applicationContext = null;
                }
            } else {
                applicationContext = context.getApplicationContext();
            }
            try {
                Object[] objArr19 = {applicationContext, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), 0, -999792966};
                byte[] bArr2 = $$g;
                Object[] objArr20 = new Object[1];
                d((short) 407, bArr2[79], bArr2[148], objArr20);
                Class<?> cls = Class.forName((String) objArr20[0]);
                Object[] objArr21 = new Object[1];
                d((short) 386, bArr2[281], (byte) ($$h & 232), objArr21);
                Object[] objArr22 = (Object[]) cls.getMethod((String) objArr21[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr19);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char packedPositionChild = (char) (31532 - ExpandableListView.getPackedPositionChild(0L));
                    int i15 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 920;
                    int doubleTapTimeout = 28 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    Object[] objArr23 = new Object[1];
                    c((short) ($$b & 187), (byte) 15, $$a[10], objArr23);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionChild, i15, doubleTapTimeout, -1142834547, false, (String) objArr23[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr22);
                try {
                    str = str5;
                    long jLongValue2 = ((Long) Class.forName(str4).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c2 = (char) (31534 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int iNormalizeMetaState = 921 - KeyEvent.normalizeMetaState(0);
                        int iIndexOf3 = 27 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        byte[] bArr3 = $$a;
                        Object[] objArr24 = new Object[1];
                        c(bArr3[80], bArr3[7], bArr3[10], objArr24);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iNormalizeMetaState, iIndexOf3, -778300370, false, (String) objArr24[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cGreen = (char) (Color.green(0) + 31533);
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 921;
                        int i16 = 28 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        short s2 = $$a[80];
                        Object[] objArr25 = new Object[1];
                        c(s2, (byte) (s2 & 52), (byte) ($$b & 13), objArr25);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cGreen, offsetBefore, i16, -1048449946, false, (String) objArr25[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr22;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i17 = ((int[]) objArr[1])[0];
        int i18 = ((int[]) objArr[3])[0];
        if (i18 == i17) {
            int i19 = ((int[]) objArr[0])[0];
            Object[] objArr26 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i20 = (~System.identityHashCode(this)) | 646420033;
            int i21 = i19 + 2131584202 + (i20 * 495) + (((~i20) | 33984576) * 495);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            i = 0;
            ((int[]) objArr26[0])[0] = i23 ^ (i23 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str8 : strArr) {
                    arrayList.add(str8);
                }
            }
            int[] iArr = new int[i18];
            int i24 = i18 - 1;
            iArr[i24] = 1;
            Toast.makeText((Context) null, iArr[((i18 * i24) % 2) - 1], 1).show();
            int i25 = ((int[]) objArr[0])[0];
            Object[] objArr27 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i26 = i25 + 413785123 + (((~(608909722 | iIdentityHashCode)) | (-1702575516) | (~(1165169921 | iIdentityHashCode))) * (-744)) + (((~iIdentityHashCode) | 71504128) * 744) + ((iIdentityHashCode | 1702575515) * 744);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            i = 0;
            ((int[]) objArr27[0])[0] = i28 ^ (i28 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cArgb = (char) Color.argb(i, i, i, i);
            int iGreen = 2267 - Color.green(i);
            int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(i) + 33;
            byte[] bArr4 = $$a;
            Object[] objArr28 = new Object[1];
            c(bArr4[80], bArr4[7], bArr4[10], objArr28);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cArgb, iGreen, iNormalizeMetaState2, -887667012, false, (String) objArr28[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        long jLongValue3 = ((Long) Class.forName(str4).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
            int i29 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2267;
            int scrollBarSize = 33 - (ViewConfiguration.getScrollBarSize() >> 8);
            byte[] bArr5 = $$a;
            Object[] objArr29 = new Object[1];
            c((short) 88, bArr5[7], bArr5[10], objArr29);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(offsetAfter, i29, scrollBarSize, -874156483, false, (String) objArr29[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i30 % 128;
            int i31 = i30 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c3 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int i32 = 2268 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 33;
                Object[] objArr30 = new Object[1];
                c((short) ($$b & 187), (byte) 15, $$a[10], objArr30);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c3, i32, iMakeMeasureSpec, -654680577, false, (String) objArr30[0], null);
            }
            Object[] objArr31 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr2 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i33 = ((int[]) objArr31[0])[0];
            int i34 = ((int[]) objArr31[3])[0];
            String[] strArr2 = (String[]) objArr31[1];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i35 = (-787723625) + (((~((-591532739) | iIdentityHashCode2)) | (-217180578)) * (-948)) + ((~((~iIdentityHashCode2) | (-4194433))) * (-948)) + 409464508;
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr2[2])[0] = i37 ^ (i37 << 5);
            str2 = str;
        } else {
            if (context == null) {
                obj = null;
                applicationContext2 = context;
            } else if (context instanceof ContextWrapper) {
                int i38 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i38 % 128;
                if (i38 % 2 == 0) {
                    ((ContextWrapper) context).getBaseContext();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (((ContextWrapper) context).getBaseContext() != null) {
                    obj = null;
                    applicationContext2 = context.getApplicationContext();
                } else {
                    obj = null;
                    applicationContext2 = null;
                }
            } else {
                obj = null;
                applicationContext2 = context.getApplicationContext();
            }
            Object[] objArr32 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(obj, this)).intValue()), 0, -1139568936};
            byte[] bArr6 = $$g;
            Object[] objArr33 = new Object[1];
            d((short) 334, bArr6[20], (byte) 74, objArr33);
            Class<?> cls2 = Class.forName((String) objArr33[0]);
            Object[] objArr34 = new Object[1];
            d((short) TypedValues.AttributesType.TYPE_PATH_ROTATE, bArr6[281], (byte) (-bArr6[442]), objArr34);
            Object[] objArr35 = (Object[]) cls2.getMethod((String) objArr34[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr32);
            if (applicationContext2 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                    int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 2267;
                    int tapTimeout2 = 33 - (ViewConfiguration.getTapTimeout() >> 16);
                    Object[] objArr36 = new Object[1];
                    c((short) ($$b & 187), (byte) 15, $$a[10], objArr36);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cIndexOf, scrollBarSize2, tapTimeout2, -654680577, false, (String) objArr36[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, objArr35);
                try {
                    str2 = str;
                    long jLongValue4 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue4);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                        int scrollDefaultDelay = 2267 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int scrollBarSize3 = (ViewConfiguration.getScrollBarSize() >> 8) + 33;
                        byte[] bArr7 = $$a;
                        Object[] objArr37 = new Object[1];
                        c((short) 88, bArr7[7], bArr7[10], objArr37);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cAxisFromString, scrollDefaultDelay, scrollBarSize3, -874156483, false, (String) objArr37[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                        char c4 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int iRgb = Color.rgb(0, 0, 0) + 16779483;
                        int trimmedLength = 33 - TextUtils.getTrimmedLength("");
                        byte[] bArr8 = $$a;
                        Object[] objArr38 = new Object[1];
                        c(bArr8[80], bArr8[7], bArr8[10], objArr38);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c4, iRgb, trimmedLength, -887667012, false, (String) objArr38[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } else {
                str2 = str;
                objArr35 = objArr35;
            }
            objArr2 = objArr35;
        }
        int i39 = ((int[]) objArr2[3])[0];
        int i40 = ((int[]) objArr2[0])[0];
        if (i40 == i39) {
            Object[] objArr39 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i41 = ((int[]) objArr2[2])[0];
            int i42 = ((int[]) objArr2[0])[0];
            int i43 = ((int[]) objArr2[3])[0];
            String[] strArr3 = (String[]) objArr2[1];
            int i44 = ~((~System.identityHashCode(this)) | 836480439);
            int i45 = i41 + (((25403667 | i44) * (-374)) - 975251827) + ((i44 | 811076772) * 374);
            int i46 = (i45 << 13) ^ i45;
            int i47 = i46 ^ (i46 >>> 17);
            i2 = 0;
            ((int[]) objArr39[2])[0] = i47 ^ (i47 << 5);
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArr2[1];
            if (strArr4 != null) {
                for (String str9 : strArr4) {
                    arrayList2.add(str9);
                }
            }
            int[] iArr2 = new int[i40];
            int i48 = i40 - 1;
            iArr2[i48] = 1;
            Toast.makeText((Context) null, iArr2[((i40 * i48) % 2) - 1], 1).show();
            Object[] objArr40 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i49 = ((int[]) objArr2[2])[0];
            int i50 = ((int[]) objArr2[0])[0];
            int i51 = ((int[]) objArr2[3])[0];
            String[] strArr5 = (String[]) objArr2[1];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i52 = ~iIdentityHashCode3;
            int i53 = i49 + (-381578064) + (((~((-515486389) | i52)) | 293226927) * 226) + (((~(i52 | (-243380753))) | (~((-293226928) | iIdentityHashCode3)) | 21121291) * (-113)) + ((~(iIdentityHashCode3 | (-515486389))) * 113);
            int i54 = (i53 << 13) ^ i53;
            int i55 = i54 ^ (i54 >>> 17);
            i2 = 0;
            ((int[]) objArr40[2])[0] = i55 ^ (i55 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
            char mirror = (char) (AndroidCharacter.getMirror('0') + 37519);
            int threadPriority = ((Process.getThreadPriority(i2) + 20) >> 6) + 625;
            int iResolveOpacity = 14 - Drawable.resolveOpacity(i2, i2);
            short s3 = $$a[80];
            Object[] objArr41 = new Object[1];
            c(s3, (byte) (s3 & 52), (byte) ($$b & 13), objArr41);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(mirror, threadPriority, iResolveOpacity, -477065106, false, (String) objArr41[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).getLong(null);
        long jLongValue5 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
            char tapTimeout3 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 37567);
            int i56 = 626 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int iNormalizeMetaState3 = 14 - KeyEvent.normalizeMetaState(0);
            byte[] bArr9 = $$a;
            Object[] objArr42 = new Object[1];
            c((short) 88, bArr9[7], bArr9[10], objArr42);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(tapTimeout3, i56, iNormalizeMetaState3, -976899241, false, (String) objArr42[0], null);
        }
        if (j3 == ((jLongValue5 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                char bitsPerPixel = (char) (37566 - ImageFormat.getBitsPerPixel(0));
                int scrollDefaultDelay2 = 625 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 14;
                byte[] bArr10 = $$a;
                Object[] objArr43 = new Object[1];
                c(bArr10[80], bArr10[7], bArr10[10], objArr43);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(bitsPerPixel, scrollDefaultDelay2, fadingEdgeLength, -973632554, false, (String) objArr43[0], null);
            }
            Object[] objArr44 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).get(null);
            int i57 = ((int[]) objArr44[2])[0];
            int i58 = ((int[]) objArr44[0])[0];
            String[] strArr6 = (String[]) objArr44[3];
            int[] iArr3 = {i57};
            int iMyUid = Process.myUid();
            int i59 = 723513704 + ((~((~iMyUid) | 1585184743)) * (-116)) + ((507231139 | iMyUid) * 116) + (((~(iMyUid | (-1316506982))) | 238553377) * 116) + 1898335551;
            int i60 = (i59 << 13) ^ i59;
            int i61 = i60 ^ (i60 >>> 17);
            ((int[]) objArr3[1])[0] = i61 ^ (i61 << 5);
            objArr3 = new Object[]{new int[]{i58}, new int[1], iArr3, strArr6};
            str3 = str2;
        } else {
            Context applicationContext4 = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            int iIntValue = ((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue();
            Object[] objArr45 = new Object[1];
            a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 68, 63 - TextUtils.lastIndexOf("", '0', 0), (char) Color.blue(0), objArr45);
            String str10 = (String) objArr45[0];
            Object[] objArr46 = new Object[1];
            a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 132, 64 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (52274 - Color.alpha(0)), objArr46);
            Object[] objArr47 = {applicationContext4, new String[]{str10, (String) objArr46[0]}, Integer.valueOf(iIntValue), 17, 1898335551};
            byte[] bArr11 = $$g;
            byte b2 = bArr11[79];
            Object[] objArr48 = new Object[1];
            d((short) 279, b2, (byte) (b2 | 40), objArr48);
            Class<?> cls3 = Class.forName((String) objArr48[0]);
            Object[] objArr49 = new Object[1];
            d((short) 227, bArr11[5], (byte) 92, objArr49);
            Object[] objArr50 = (Object[]) cls3.getMethod((String) objArr49[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr47);
            int i62 = ((int[]) objArr50[0])[0];
            int i63 = ((int[]) objArr50[2])[0];
            if (applicationContext4 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                    char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 37567);
                    int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0') + 626;
                    int iArgb = Color.argb(0, 0, 0, 0) + 14;
                    byte[] bArr12 = $$a;
                    Object[] objArr51 = new Object[1];
                    c(bArr12[80], bArr12[7], bArr12[10], objArr51);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cMakeMeasureSpec, iIndexOf4, iArgb, -973632554, false, (String) objArr51[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, objArr50);
                try {
                    str3 = str2;
                    long jLongValue6 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue6);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                        char cLastIndexOf = (char) (37566 - TextUtils.lastIndexOf("", '0', 0, 0));
                        int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 625;
                        int i64 = 15 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        byte[] bArr13 = $$a;
                        Object[] objArr52 = new Object[1];
                        c((short) 88, bArr13[7], bArr13[10], objArr52);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cLastIndexOf, scrollDefaultDelay3, i64, -976899241, false, (String) objArr52[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue6 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                        char cMyPid = (char) (37567 - (Process.myPid() >> 22));
                        int scrollDefaultDelay4 = 625 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int iIndexOf5 = 14 - TextUtils.indexOf("", "", 0);
                        short s4 = $$a[80];
                        Object[] objArr53 = new Object[1];
                        c(s4, (byte) (s4 & 52), (byte) ($$b & 13), objArr53);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(cMyPid, scrollDefaultDelay4, iIndexOf5, -477065106, false, (String) objArr53[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).set(null, lValueOf6);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            } else {
                objArr50 = objArr50;
                str3 = str2;
            }
            objArr3 = objArr50;
        }
        int i65 = ((int[]) objArr3[0])[0];
        int i66 = ((int[]) objArr3[2])[0];
        if (i66 != i65) {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr7 = (String[]) objArr3[3];
            if (strArr7 != null) {
                for (String str11 : strArr7) {
                    arrayList3.add(str11);
                }
            }
            throw new RuntimeException(String.valueOf(i66));
        }
        int i67 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i67 % 128;
        int i68 = i67 % 2;
        int i69 = ((int[]) objArr3[1])[0];
        int i70 = ((int[]) objArr3[2])[0];
        int i71 = ((int[]) objArr3[0])[0];
        String[] strArr8 = (String[]) objArr3[3];
        int[] iArr4 = {i70};
        int iIdentityHashCode4 = System.identityHashCode(this);
        int i72 = 185094292 + (((~((-640210880) | iIdentityHashCode4)) | 539018934 | (~(1183527241 | iIdentityHashCode4))) * (-754));
        int i73 = ~((-539018935) | iIdentityHashCode4);
        int i74 = ~iIdentityHashCode4;
        int i75 = i69 + i72 + ((i73 | (~(1722546175 | i74))) * (-754)) + ((i74 | (-640210880)) * 754);
        int i76 = i75 ^ (i75 << 13);
        int i77 = i76 ^ (i76 >>> 17);
        ((int[]) objArr[1])[0] = i77 ^ (i77 << 5);
        Object[] objArr54 = {new int[]{i71}, new int[1], iArr4, strArr8};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
            char cResolveSize = (char) (View.resolveSize(0, 0) + 29944);
            int fadingEdgeLength2 = 1755 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            int threadPriority2 = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
            Object[] objArr55 = new Object[1];
            c((short) ($$b & 187), (byte) 15, $$a[10], objArr55);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cResolveSize, fadingEdgeLength2, threadPriority2, 986134021, false, (String) objArr55[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).getLong(null);
        long jLongValue7 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
            char cIndexOf2 = (char) (29944 - TextUtils.indexOf("", "", 0, 0));
            int iResolveSizeAndState = 1755 - View.resolveSizeAndState(0, 0, 0);
            int defaultSize = View.getDefaultSize(0, 0) + 23;
            byte[] bArr14 = $$a;
            Object[] objArr56 = new Object[1];
            c((short) 140, bArr14[7], bArr14[10], objArr56);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(cIndexOf2, iResolveSizeAndState, defaultSize, 1596667560, false, (String) objArr56[0], null);
        }
        if (j4 == ((jLongValue7 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                char fadingEdgeLength3 = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 29944);
                int iLastIndexOf2 = 1754 - TextUtils.lastIndexOf("", '0', 0, 0);
                int iIndexOf6 = 23 - TextUtils.indexOf("", "", 0);
                byte[] bArr15 = $$a;
                Object[] objArr57 = new Object[1];
                c(bArr15[80], bArr15[7], bArr15[10], objArr57);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(fadingEdgeLength3, iLastIndexOf2, iIndexOf6, 1599039318, false, (String) objArr57[0], null);
            }
            Object[] objArr58 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr58[0])[0]}, new int[]{((int[]) objArr58[1])[0]}, (Object[]) objArr58[2], new int[1], (String[]) objArr58[4]};
            int iNextInt = new Random().nextInt();
            int i78 = (-1326748655) + (((~(iNextInt | 535534637)) | 322932211) * (-668)) + ((535534637 | (~(322932211 | iNextInt))) * 1336) + ((iNextInt | 536845823) * 668) + 139715430;
            int i79 = (i78 << 13) ^ i78;
            int i80 = i79 ^ (i79 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i80 ^ (i80 << 5);
        } else {
            int iIntValue2 = ((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr59 = {709255321};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b((char) (42049 - (ViewConfiguration.getFadingEdgeLength() >> 16)), View.MeasureSpec.makeMeasureSpec(0, 0) + 1726, 29 - Color.alpha(0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = DecorContentParent.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).newInstance(objArr59), 139715430);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                    char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29944);
                    int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0) + 1756;
                    int mirror2 = 'G' - AndroidCharacter.getMirror('0');
                    byte[] bArr16 = $$a;
                    Object[] objArr60 = new Object[1];
                    c(bArr16[80], bArr16[7], bArr16[10], objArr60);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(edgeSlop, iLastIndexOf3, mirror2, 1599039318, false, (String) objArr60[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    long jLongValue8 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf7 = Long.valueOf(jLongValue8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                        char doubleTapTimeout2 = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29944);
                        int mode = View.MeasureSpec.getMode(0) + 1755;
                        int iMyPid = (Process.myPid() >> 22) + 23;
                        byte[] bArr17 = $$a;
                        Object[] objArr61 = new Object[1];
                        c((short) 140, bArr17[7], bArr17[10], objArr61);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(doubleTapTimeout2, mode, iMyPid, 1596667560, false, (String) objArr61[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, lValueOf7);
                    Long lValueOf8 = Long.valueOf(jLongValue8 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 29945);
                        int i81 = 1756 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int i82 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23;
                        Object[] objArr62 = new Object[1];
                        c((short) ($$b & 187), (byte) 15, $$a[10], objArr62);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(gidForName, i81, i82, 986134021, false, (String) objArr62[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf8);
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i83 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0];
        int i84 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        if (i84 != i83) {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr9 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
            if (strArr9 != null) {
                for (String str12 : strArr9) {
                    arrayList4.add(str12);
                }
            }
            throw new RuntimeException(String.valueOf(i84));
        }
        int i85 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
        Object[] objArr63 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
        int iIdentityHashCode5 = System.identityHashCode(this);
        int i86 = i85 + ((((-1987310087) + (((~(703997911 | iIdentityHashCode5)) | 369102848) * 576)) + (((~((~iIdentityHashCode5) | 1073100759)) | 547497489) * 576)) - 2145124352);
        int i87 = (i86 << 13) ^ i86;
        int i88 = i87 ^ (i87 >>> 17);
        ((int[]) objArr63[3])[0] = i88 ^ (i88 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
            char cAlpha = (char) Color.alpha(0);
            int edgeSlop2 = 1031 - (ViewConfiguration.getEdgeSlop() >> 16);
            int i89 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14;
            byte[] bArr18 = $$a;
            Object[] objArr64 = new Object[1];
            c((short) 88, bArr18[7], bArr18[10], objArr64);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cAlpha, edgeSlop2, i89, 1357589585, false, (String) objArr64[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).getLong(null);
        long jLongValue9 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
            char c5 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int iIndexOf7 = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int doubleTapTimeout3 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 15;
            byte[] bArr19 = $$a;
            Object[] objArr65 = new Object[1];
            c(bArr19[80], bArr19[7], bArr19[10], objArr65);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(c5, iIndexOf7, doubleTapTimeout3, 1344079056, false, (String) objArr65[0], null);
        }
        if (j5 == ((jLongValue9 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                int edgeSlop3 = 1031 - (ViewConfiguration.getEdgeSlop() >> 16);
                int iRed = Color.red(0) + 15;
                short s5 = $$a[80];
                Object[] objArr66 = new Object[1];
                c(s5, (byte) (s5 & 52), (byte) ($$b & 13), objArr66);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(packedPositionType, edgeSlop3, iRed, 632103528, false, (String) objArr66[0], null);
            }
            Object[] objArr67 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).get(null);
            objArr4 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i90 = ((int[]) objArr67[3])[0];
            int i91 = ((int[]) objArr67[1])[0];
            String[] strArr10 = (String[]) objArr67[0];
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i92 = (-1410750159) + (((-223281686) | iIdentityHashCode6) * 376) + (((~((~iIdentityHashCode6) | 10827435)) | (-233780928)) * (-376)) + (((~(iIdentityHashCode6 | (-10827436))) | 233452734) * 376) + 592935877;
            int i93 = (i92 << 13) ^ i92;
            int i94 = i93 ^ (i93 >>> 17);
            ((int[]) objArr4[2])[0] = i94 ^ (i94 << 5);
        } else {
            int iIntValue3 = ((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue();
            Object[] objArr68 = {709255321};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b((char) (46038 - View.resolveSize(0, 0)), View.combineMeasuredStates(0, 0) + 1134, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr69 = {Integer.valueOf(iIntValue3), 0, 592935877, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).newInstance(objArr68), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                char cIndexOf3 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                int i95 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1031;
                int deadChar = KeyEvent.getDeadChar(0, 0) + 15;
                byte[] bArr20 = $$a;
                Object[] objArr70 = new Object[1];
                c((short) 88, bArr20[7], bArr20[10], objArr70);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cIndexOf3, i95, deadChar, 1298546779, false, (String) objArr70[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 45993), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1118, 17 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), Boolean.TYPE});
            }
            objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).invoke(null, objArr69);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                char c6 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                int iRgb2 = (-16776185) - Color.rgb(0, 0, 0);
                int i96 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15;
                short s6 = $$a[80];
                Object[] objArr71 = new Object[1];
                c(s6, (byte) (s6 & 52), (byte) ($$b & 13), objArr71);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(c6, iRgb2, i96, 632103528, false, (String) objArr71[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, objArr4);
            try {
                long jLongValue10 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf9 = Long.valueOf(jLongValue10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                    char cArgb2 = (char) Color.argb(0, 0, 0, 0);
                    int i97 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1030;
                    int packedPositionType2 = 15 - ExpandableListView.getPackedPositionType(0L);
                    byte[] bArr21 = $$a;
                    Object[] objArr72 = new Object[1];
                    c(bArr21[80], bArr21[7], bArr21[10], objArr72);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(cArgb2, i97, packedPositionType2, 1344079056, false, (String) objArr72[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, lValueOf9);
                Long lValueOf10 = Long.valueOf(jLongValue10 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                    char cIndexOf4 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                    int defaultSize2 = 1031 - View.getDefaultSize(0, 0);
                    int edgeSlop4 = 15 - (ViewConfiguration.getEdgeSlop() >> 16);
                    byte[] bArr22 = $$a;
                    Object[] objArr73 = new Object[1];
                    c((short) 88, bArr22[7], bArr22[10], objArr73);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(cIndexOf4, defaultSize2, edgeSlop4, 1357589585, false, (String) objArr73[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, lValueOf10);
            } catch (Exception unused5) {
                throw new RuntimeException();
            }
        }
        int i98 = ((int[]) objArr4[1])[0];
        int i99 = ((int[]) objArr4[3])[0];
        if (i99 == i98) {
            Object[] objArr74 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i100 = ((int[]) objArr4[2])[0];
            int i101 = ((int[]) objArr4[3])[0];
            int i102 = ((int[]) objArr4[1])[0];
            String[] strArr11 = (String[]) objArr4[0];
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i103 = ~iIdentityHashCode7;
            int i104 = i100 + (((((~(352142391 | i103)) | (~((-596422562) | iIdentityHashCode7))) | (~(i103 | 596422561))) * 959) - 284362072) + (((~(iIdentityHashCode7 | 596422561)) | (~(i103 | (-596422562))) | (~(352142391 | iIdentityHashCode7))) * 959);
            int i105 = (i104 << 13) ^ i104;
            int i106 = i105 ^ (i105 >>> 17);
            ((int[]) objArr74[2])[0] = i106 ^ (i106 << 5);
        } else {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr12 = (String[]) objArr4[0];
            if (strArr12 != null) {
                for (String str13 : strArr12) {
                    arrayList5.add(str13);
                }
            }
            int[] iArr5 = new int[i99];
            int i107 = i99 - 1;
            iArr5[i107] = 1;
            Toast.makeText((Context) null, iArr5[((i99 * i107) % 2) - 1], 1).show();
            Object[] objArr75 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i108 = ((int[]) objArr4[2])[0];
            int i109 = ((int[]) objArr4[3])[0];
            int i110 = ((int[]) objArr4[1])[0];
            String[] strArr13 = (String[]) objArr4[0];
            int iMyPid2 = Process.myPid();
            int i111 = ~iMyPid2;
            int i112 = i108 + (-1589575152) + (((~(537063362 | i111)) | 781343532) * 226) + (((~(i111 | 781385710)) | (~((-781343533) | iMyPid2)) | 537021184) * (-113)) + ((~(iMyPid2 | 537063362)) * 113);
            int i113 = (i112 << 13) ^ i112;
            int i114 = i113 ^ (i113 >>> 17);
            ((int[]) objArr75[2])[0] = i114 ^ (i114 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
            char doubleTapTimeout4 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int iMyTid = 876 - (Process.myTid() >> 22);
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 10;
            Object[] objArr76 = new Object[1];
            c((short) ($$b & 187), (byte) 15, $$a[10], objArr76);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(doubleTapTimeout4, iMyTid, capsMode, -1650998592, false, (String) objArr76[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).getLong(null);
        long jLongValue11 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
            char size = (char) View.MeasureSpec.getSize(0);
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
            int i115 = 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            byte[] bArr23 = $$a;
            Object[] objArr77 = new Object[1];
            c(bArr23[80], bArr23[7], bArr23[10], objArr77);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(size, windowTouchSlop, i115, 2012020043, false, (String) objArr77[0], null);
        }
        if (j6 == ((jLongValue11 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                char size2 = (char) View.MeasureSpec.getSize(0);
                int i116 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                int iBlue2 = Color.blue(0) + 10;
                byte[] bArr24 = $$a;
                Object[] objArr78 = new Object[1];
                c((short) 88, bArr24[7], bArr24[10], objArr78);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(size2, i116, iBlue2, 2012931276, false, (String) objArr78[0], null);
            }
            Object[] objArr79 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).get(null);
            objArr5 = new Object[]{new int[]{((int[]) objArr79[0])[0]}, new int[1], new int[]{((int[]) objArr79[2])[0]}, (String[]) objArr79[3]};
            int iIdentityHashCode8 = System.identityHashCode(this);
            int i117 = (~((-481971955) | iIdentityHashCode8)) | 78137058;
            int i118 = (((1521273620 + (i117 * 992)) + ((i117 | (~((~iIdentityHashCode8) | (-37826830)))) * (-496))) + ((iIdentityHashCode8 | (-441661726)) * 496)) - 1145921502;
            int i119 = (i118 << 13) ^ i118;
            int i120 = i119 ^ (i119 >>> 17);
            ((int[]) objArr5[1])[0] = i120 ^ (i120 << 5);
        } else {
            Context applicationContext5 = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            Object[] objArr80 = {applicationContext5, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), 0, -1145921502};
            byte[] bArr25 = $$g;
            byte b3 = bArr25[79];
            Object[] objArr81 = new Object[1];
            d((short) 227, b3, b3, objArr81);
            Class<?> cls4 = Class.forName((String) objArr81[0]);
            Object[] objArr82 = new Object[1];
            d((short) 386, bArr25[281], (byte) ($$h & 232), objArr82);
            objArr5 = (Object[]) cls4.getMethod((String) objArr82[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr80);
            if (applicationContext5 != null) {
                int i121 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i121 % 128;
                try {
                    if (i121 % 2 != 0) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                            char c7 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
                            int i122 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9;
                            byte[] bArr26 = $$a;
                            Object[] objArr83 = new Object[1];
                            c((short) 88, bArr26[7], bArr26[10], objArr83);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(c7, windowTouchSlop2, i122, 2012931276, false, (String) objArr83[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, objArr5);
                        long jLongValue12 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[1])).longValue();
                        Long lValueOf11 = Long.valueOf(jLongValue12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                            char c8 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i123 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 10;
                            byte[] bArr27 = $$a;
                            Object[] objArr84 = new Object[1];
                            c(bArr27[80], bArr27[7], bArr27[10], objArr84);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(c8, i123, jumpTapTimeout, 2012020043, false, (String) objArr84[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, lValueOf11);
                        Long lValueOf12 = Long.valueOf(jLongValue12 >>> 112);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                            char cArgb3 = (char) Color.argb(0, 0, 0, 0);
                            int iRgb3 = Color.rgb(0, 0, 0) + 16778092;
                            int i124 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
                            Object[] objArr85 = new Object[1];
                            c((short) ($$b & 187), (byte) 15, $$a[10], objArr85);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cArgb3, iRgb3, i124, -1650998592, false, (String) objArr85[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, lValueOf12);
                    } else {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                            char c9 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i125 = 876 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int maxKeyCode = 10 - (KeyEvent.getMaxKeyCode() >> 16);
                            byte[] bArr28 = $$a;
                            Object[] objArr86 = new Object[1];
                            c((short) 88, bArr28[7], bArr28[10], objArr86);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(c9, i125, maxKeyCode, 2012931276, false, (String) objArr86[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, objArr5);
                        long jLongValue13 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf13 = Long.valueOf(jLongValue13);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                            char c10 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                            int iRed2 = Color.red(0) + 876;
                            int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 10;
                            byte[] bArr29 = $$a;
                            Object[] objArr87 = new Object[1];
                            c(bArr29[80], bArr29[7], bArr29[10], objArr87);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(c10, iRed2, iResolveOpacity2, 2012020043, false, (String) objArr87[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, lValueOf13);
                        Long lValueOf14 = Long.valueOf(jLongValue13 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                            char packedPositionChild2 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                            int fadingEdgeLength4 = 876 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int i126 = 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            Object[] objArr88 = new Object[1];
                            c((short) ($$b & 187), (byte) 15, $$a[10], objArr88);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(packedPositionChild2, fadingEdgeLength4, i126, -1650998592, false, (String) objArr88[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf14);
                    }
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            }
        }
        int i127 = ((int[]) objArr5[2])[0];
        int i128 = ((int[]) objArr5[0])[0];
        if (i128 == i127) {
            int i129 = ((int[]) objArr5[1])[0];
            Object[] objArr89 = {new int[]{((int[]) objArr5[0])[0]}, new int[1], new int[]{((int[]) objArr5[2])[0]}, (String[]) objArr5[3]};
            int i130 = ~System.identityHashCode(this);
            int i131 = i129 + (-703634500) + (((~((-986469327) | i130)) | 946159097) * (-933)) + (((~(i130 | 946159097)) | (-988643328)) * 933) + 2028342933;
            int i132 = (i131 << 13) ^ i131;
            int i133 = i132 ^ (i132 >>> 17);
            ((int[]) objArr89[1])[0] = i133 ^ (i133 << 5);
            i3 = 0;
        } else {
            int[] iArr6 = new int[i128];
            int i134 = i128 - 1;
            iArr6[i134] = 1;
            Toast.makeText((Context) null, iArr6[((i128 * i134) % 2) - 1], 1).show();
            int i135 = ((int[]) objArr5[1])[0];
            Object[] objArr90 = {new int[]{((int[]) objArr5[0])[0]}, new int[1], new int[]{((int[]) objArr5[2])[0]}, (String[]) objArr5[3]};
            int iIdentityHashCode9 = System.identityHashCode(this);
            int i136 = ~(593076480 | iIdentityHashCode9);
            int i137 = i135 + 969794784 + (((-603695916) | i136) * (-814)) + ((i136 | (~((~iIdentityHashCode9) | 552766251)) | 542146816) * 407) + (((~(iIdentityHashCode9 | (-552766252))) | (~((-593076481) | iIdentityHashCode9)) | 542146816) * 407);
            int i138 = (i137 << 13) ^ i137;
            int i139 = i138 ^ (i138 >>> 17);
            i3 = 0;
            ((int[]) objArr90[1])[0] = i139 ^ (i139 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
            char fadingEdgeLength5 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
            int maxKeyCode2 = 876 - (KeyEvent.getMaxKeyCode() >> 16);
            int i140 = (TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
            Object[] objArr91 = new Object[1];
            c((short) DerHeader.TAG_CLASS_PRIVATE, (byte) 42, $$a[19], objArr91);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(fadingEdgeLength5, maxKeyCode2, i140, -1199417970, false, (String) objArr91[0], null);
        }
        long j7 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).getLong(null);
        long jLongValue14 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
            char cIndexOf5 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
            int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 876;
            int i141 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
            Object[] objArr92 = new Object[1];
            c((short) 202, (byte) ($$b & 188), (byte) (-$$a[14]), objArr92);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(cIndexOf5, offsetBefore2, i141, 254769921, false, (String) objArr92[0], null);
        }
        if (j7 == ((jLongValue14 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                char cMakeMeasureSpec2 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int gidForName2 = Process.getGidForName("") + 877;
                int iIndexOf8 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 11;
                byte[] bArr30 = $$a;
                Object[] objArr93 = new Object[1];
                c((short) 202, (byte) (-bArr30[44]), bArr30[19], objArr93);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(cMakeMeasureSpec2, gidForName2, iIndexOf8, 1324201839, false, (String) objArr93[0], null);
            }
            Object[] objArr94 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).get(null);
            objArr6 = new Object[]{new int[]{((int[]) objArr94[0])[0]}, new int[1], new int[]{((int[]) objArr94[2])[0]}, (String[]) objArr94[3]};
            int iNextInt2 = new Random().nextInt(1475775956);
            int i142 = (((((~(381632431 | iNextInt2)) | 268837252) * 449) - 1303103364) + (((~((~iNextInt2) | 381632431)) | 268837252) * 449)) - 917476480;
            int i143 = (i142 << 13) ^ i142;
            int i144 = i143 ^ (i143 >>> 17);
            ((int[]) objArr6[1])[0] = i144 ^ (i144 << 5);
        } else {
            Object[] objArr95 = {Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), -917476480};
            Object[] objArr96 = new Object[1];
            d((short) 135, (byte) 29, (byte) 83, objArr96);
            Class<?> cls5 = Class.forName((String) objArr96[0]);
            short s7 = (short) TypedValues.AttributesType.TYPE_PATH_ROTATE;
            byte[] bArr31 = $$g;
            Object[] objArr97 = new Object[1];
            d(s7, bArr31[281], (byte) (-bArr31[442]), objArr97);
            objArr6 = (Object[]) cls5.getMethod((String) objArr97[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr95);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
                int i145 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 876;
                int i146 = 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                byte[] bArr32 = $$a;
                Object[] objArr98 = new Object[1];
                c((short) 202, (byte) (-bArr32[44]), bArr32[19], objArr98);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(capsMode2, i145, i146, 1324201839, false, (String) objArr98[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, objArr6);
            try {
                long jLongValue15 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf15 = Long.valueOf(jLongValue15);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    int iIndexOf9 = 875 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int i147 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9;
                    Object[] objArr99 = new Object[1];
                    c((short) 202, (byte) ($$b & 188), (byte) (-$$a[14]), objArr99);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(cCombineMeasuredStates, iIndexOf9, i147, 254769921, false, (String) objArr99[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, lValueOf15);
                Long lValueOf16 = Long.valueOf(jLongValue15 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int touchSlop2 = 876 - (ViewConfiguration.getTouchSlop() >> 8);
                    int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', 0) + 11;
                    Object[] objArr100 = new Object[1];
                    c((short) DerHeader.TAG_CLASS_PRIVATE, (byte) 42, $$a[19], objArr100);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(keyRepeatDelay, touchSlop2, iLastIndexOf4, -1199417970, false, (String) objArr100[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, lValueOf16);
            } catch (Exception unused7) {
                throw new RuntimeException();
            }
        }
        int i148 = ((int[]) objArr6[2])[0];
        int i149 = ((int[]) objArr6[0])[0];
        if (i149 == i148) {
            int i150 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i150 % 128;
            int i151 = i150 % 2;
            int i152 = ((int[]) objArr6[1])[0];
            Object[] objArr101 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            int iIdentityHashCode10 = System.identityHashCode(this);
            int i153 = 126634092 + (((~((-155352709) | iIdentityHashCode10)) | 115042479) * (-318));
            int i154 = ~(115042479 | iIdentityHashCode10);
            int i155 = ~iIdentityHashCode10;
            int i156 = i152 + i153 + ((i154 | (~((-110690348) | i155))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode10 | (-110690348))) | (~(266043055 | i155))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i157 = i156 ^ (i156 << 13);
            int i158 = i157 ^ (i157 >>> 17);
            ((int[]) objArr101[1])[0] = i158 ^ (i158 << 5);
        } else {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr14 = (String[]) objArr6[3];
            if (strArr14 != null) {
                for (String str14 : strArr14) {
                    arrayList6.add(str14);
                }
            }
            Toast.makeText((Context) null, i149 / (((i149 - 1) * i149) % 2), 0).show();
            int i159 = ((int[]) objArr6[1])[0];
            Object[] objArr102 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i160 = i159 + 470796244 + (((~(954767253 | iElapsedRealtime)) | 10490517) * (-502)) + ((~((~iElapsedRealtime) | 1005567999)) * (-502)) + (((~(iElapsedRealtime | (-995077483))) | 954767253) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i161 = i160 ^ (i160 << 13);
            int i162 = i161 ^ (i161 >>> 17);
            ((int[]) objArr102[1])[0] = i162 ^ (i162 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
            char maxKeyCode3 = (char) (KeyEvent.getMaxKeyCode() >> 16);
            int iAxisFromString = 875 - MotionEvent.axisFromString("");
            int mirror3 = AndroidCharacter.getMirror('0') - '&';
            short s8 = $$a[80];
            Object[] objArr103 = new Object[1];
            c(s8, (byte) (s8 & 52), (byte) ($$b & 13), objArr103);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(maxKeyCode3, iAxisFromString, mirror3, 252381699, false, (String) objArr103[0], null);
        }
        long j8 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).getLong(null);
        long jLongValue16 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
            char c11 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int i163 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 875;
            int iAlpha = Color.alpha(0) + 10;
            byte[] bArr33 = $$a;
            Object[] objArr104 = new Object[1];
            c((short) 140, bArr33[7], bArr33[10], objArr104);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(c11, i163, iAlpha, 2009631821, false, (String) objArr104[0], null);
        }
        if (j8 == ((jLongValue16 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                char cAlpha2 = (char) Color.alpha(0);
                int mode2 = View.MeasureSpec.getMode(0) + 876;
                int iIndexOf10 = TextUtils.indexOf("", "", 0) + 10;
                short s9 = (short) 209;
                Object[] objArr105 = new Object[1];
                c(s9, (byte) (s9 >>> 2), $$a[7], objArr105);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(cAlpha2, mode2, iIndexOf10, 256017550, false, (String) objArr105[0], null);
            }
            Object[] objArr106 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).get(null);
            objArr7 = new Object[]{new int[]{((int[]) objArr106[0])[0]}, new int[1], new int[]{((int[]) objArr106[2])[0]}, (String[]) objArr106[3]};
            int i164 = (int) Runtime.getRuntime().totalMemory();
            int i165 = ~i164;
            int i166 = ((((-2009014412) + ((i164 | 513958490) * (-859))) + (((~(i164 | (-41951835))) | (~(513958490 | i165))) * 859)) + (((~(473648261 | i165)) | (-515600096)) * 859)) - 743522080;
            int i167 = (i166 << 13) ^ i166;
            int i168 = i167 ^ (i167 >>> 17);
            ((int[]) objArr7[1])[0] = i168 ^ (i168 << 5);
        } else {
            if (context == null) {
                applicationContext3 = context;
            } else if (context instanceof ContextWrapper) {
                int i169 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i169 % 128;
                int i170 = i169 % 2;
                if (((ContextWrapper) context).getBaseContext() != null) {
                    applicationContext3 = context.getApplicationContext();
                } else {
                    applicationContext3 = null;
                }
            } else {
                applicationContext3 = context.getApplicationContext();
            }
            Object[] objArr107 = {applicationContext3, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), -743522080};
            int i171 = $$h;
            byte[] bArr34 = $$g;
            Object[] objArr108 = new Object[1];
            d((short) (i171 | 64), bArr34[79], bArr34[60], objArr108);
            Class<?> cls6 = Class.forName((String) objArr108[0]);
            Object[] objArr109 = new Object[1];
            d(bArr34[85], bArr34[281], (byte) (i171 & 232), objArr109);
            Object[] objArr110 = (Object[]) cls6.getMethod((String) objArr109[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr107);
            if (applicationContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                    char c12 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 876;
                    int keyRepeatTimeout = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    short s10 = (short) 209;
                    Object[] objArr111 = new Object[1];
                    c(s10, (byte) (s10 >>> 2), $$a[7], objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(c12, maximumFlingVelocity, keyRepeatTimeout, 256017550, false, (String) objArr111[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).set(null, objArr110);
                try {
                    long jLongValue17 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue17);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                        char capsMode3 = (char) TextUtils.getCapsMode("", 0, 0);
                        int iResolveSize = View.resolveSize(0, 0) + 876;
                        int maxKeyCode4 = 10 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte[] bArr35 = $$a;
                        Object[] objArr112 = new Object[1];
                        c((short) 140, bArr35[7], bArr35[10], objArr112);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(capsMode3, iResolveSize, maxKeyCode4, 2009631821, false, (String) objArr112[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue17 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                        char threadPriority3 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                        int iAlpha2 = Color.alpha(0) + 876;
                        int i172 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                        short s11 = $$a[80];
                        Object[] objArr113 = new Object[1];
                        c(s11, (byte) (s11 & 52), (byte) ($$b & 13), objArr113);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(threadPriority3, iAlpha2, i172, 252381699, false, (String) objArr113[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, lValueOf18);
                } catch (Exception unused8) {
                    throw new RuntimeException();
                }
            } else {
                objArr110 = objArr110;
            }
            objArr7 = objArr110;
        }
        if (((int[]) objArr7[0])[0] != ((int[]) objArr7[2])[0]) {
            throw null;
        }
        int i173 = ((int[]) objArr7[1])[0];
        Object[] objArr114 = {new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
        int i174 = ~((int) Process.getElapsedCpuTime());
        int i175 = i173 + (-879003676) + ((~((-682572) | i174)) * 52) + (((~(318079008 | i174)) | (~(277768779 | i174)) | (-318761580)) * (-52)) + (((~(i174 | (-318079009))) | 277086208) * 52);
        int i176 = (i175 << 13) ^ i175;
        int i177 = i176 ^ (i176 >>> 17);
        ((int[]) objArr114[1])[0] = i177 ^ (i177 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
            char cCombineMeasuredStates2 = (char) View.combineMeasuredStates(0, 0);
            int i178 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 650;
            int i179 = 44 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            byte[] bArr36 = $$a;
            Object[] objArr115 = new Object[1];
            c((short) 140, bArr36[7], bArr36[10], objArr115);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(cCombineMeasuredStates2, i178, i179, -459846511, false, (String) objArr115[0], null);
        }
        long j9 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).getLong(null);
        long jLongValue18 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
            char cBlue = (char) Color.blue(0);
            int iMyTid2 = (Process.myTid() >> 22) + 651;
            int bitsPerPixel2 = 43 - ImageFormat.getBitsPerPixel(0);
            short s12 = $$a[80];
            Object[] objArr116 = new Object[1];
            c(s12, (byte) (s12 & 52), (byte) ($$b & 13), objArr116);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(cBlue, iMyTid2, bitsPerPixel2, -873460649, false, (String) objArr116[0], null);
        }
        if (j9 == ((jLongValue18 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                int scrollDefaultDelay5 = 651 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int gidForName3 = Process.getGidForName("") + 45;
                Object[] objArr117 = new Object[1];
                c((short) ($$b & 187), (byte) 15, $$a[10], objArr117);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(cResolveSizeAndState, scrollDefaultDelay5, gidForName3, -1595579076, false, (String) objArr117[0], null);
            }
            Object[] objArr118 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).get(null);
            objArr8 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i180 = ((int[]) objArr118[2])[0];
            int i181 = ((int[]) objArr118[0])[0];
            int iIdentityHashCode11 = System.identityHashCode(this);
            int i182 = ~iIdentityHashCode11;
            int i183 = (~(265112921 | i182)) | (-533590012) | (~(268543731 | i182));
            int i184 = ((((-1321381853) + (((~(iIdentityHashCode11 | (-66642))) | i183) * 590)) + (i183 * (-1180))) + (((~((-268543732) | i182)) | (~(i182 | (-265112922)))) * 590)) - 511435845;
            int i185 = (i184 << 13) ^ i184;
            int i186 = i185 ^ (i185 >>> 17);
            ((int[]) objArr8[3])[0] = i186 ^ (i186 << 5);
            i4 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 1610 - Color.red(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 26, 2145681644, false, null, new Class[0]);
            }
            Object[] objArr119 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).newInstance(null), -511435845, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                char maxKeyCode5 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int iAlpha3 = Color.alpha(0) + 651;
                int longPressTimeout = 44 - (ViewConfiguration.getLongPressTimeout() >> 16);
                short s13 = $$a[80];
                Object[] objArr120 = new Object[1];
                c(s13, (byte) (s13 & 52), (byte) ($$b & 13), objArr120);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(maxKeyCode5, iAlpha3, longPressTimeout, 2075921419, false, (String) objArr120[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.resolveSizeAndState(0, 0, 0), View.getDefaultSize(0, 0) + 695, (ViewConfiguration.getJumpTapTimeout() >> 16) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 63406), 793 - View.resolveSize(0, 0), 83 - TextUtils.getCapsMode("", 0, 0)), Integer.TYPE, Integer.TYPE});
            }
            objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).invoke(null, objArr119);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                char offsetAfter2 = (char) TextUtils.getOffsetAfter("", 0);
                int scrollDefaultDelay6 = 651 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int i187 = 44 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                Object[] objArr121 = new Object[1];
                c((short) ($$b & 187), (byte) 15, $$a[10], objArr121);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(offsetAfter2, scrollDefaultDelay6, i187, -1595579076, false, (String) objArr121[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, objArr8);
            try {
                long jLongValue19 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf19 = Long.valueOf(jLongValue19);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                    char c13 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int iAxisFromString2 = 650 - MotionEvent.axisFromString("");
                    int i188 = 44 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    short s14 = $$a[80];
                    Object[] objArr122 = new Object[1];
                    c(s14, (byte) (s14 & 52), (byte) ($$b & 13), objArr122);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(c13, iAxisFromString2, i188, -873460649, false, (String) objArr122[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf19);
                Long lValueOf20 = Long.valueOf(jLongValue19 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                    char minimumFlingVelocity3 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int defaultSize3 = 651 - View.getDefaultSize(0, 0);
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 44;
                    byte[] bArr37 = $$a;
                    Object[] objArr123 = new Object[1];
                    c((short) 140, bArr37[7], bArr37[10], objArr123);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(minimumFlingVelocity3, defaultSize3, iMakeMeasureSpec2, -459846511, false, (String) objArr123[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf20);
                i4 = 0;
            } catch (Exception unused9) {
                throw new RuntimeException();
            }
        }
        int i189 = ((int[]) objArr8[i4])[i4];
        int i190 = ((int[]) objArr8[2])[i4];
        if (i190 == i189) {
            Object[] objArr124 = new Object[4];
            int[] iArr7 = new int[1];
            objArr124[i4] = iArr7;
            int[] iArr8 = new int[1];
            objArr124[2] = iArr8;
            objArr124[3] = new int[1];
            int i191 = ((int[]) objArr8[3])[i4];
            int i192 = ((int[]) objArr8[2])[i4];
            int i193 = ((int[]) objArr8[i4])[i4];
            iArr8[i4] = i192;
            iArr7[i4] = i193;
            objArr124[1] = new String[i4];
            int iIdentityHashCode12 = System.identityHashCode(this);
            int i194 = ~iIdentityHashCode12;
            int i195 = 1933025243 + (((~((-1021861856) | i194)) | 1007163737) * (-1188));
            int i196 = (~(iIdentityHashCode12 | 1021861855)) | 1007163737;
            int i197 = ~(1025292665 | i194);
            int i198 = i191 + i195 + ((i196 | i197) * 594) + (((~(1021861855 | i194)) | (-1039990784) | i197) * 594);
            int i199 = (i198 << 13) ^ i198;
            int i200 = i199 ^ (i199 >>> 17);
            ((int[]) objArr124[3])[0] = i200 ^ (i200 << 5);
        } else {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr15 = (String[]) objArr8[1];
            if (strArr15 != null) {
                int i201 = 0;
                while (i201 < strArr15.length) {
                    int i202 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i202 % 128;
                    if (i202 % 2 == 0) {
                        arrayList7.add(strArr15[i201]);
                        i201 += 6;
                    } else {
                        arrayList7.add(strArr15[i201]);
                        i201++;
                    }
                }
            }
            int[] iArr9 = new int[i190];
            int i203 = i190 - 1;
            iArr9[i203] = 1;
            Toast.makeText((Context) null, iArr9[((i190 * i203) % 2) - 1], 1).show();
            Object[] objArr125 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i204 = ((int[]) objArr8[3])[0];
            int i205 = ((int[]) objArr8[2])[0];
            int i206 = ((int[]) objArr8[0])[0];
            int iMyPid3 = Process.myPid();
            int i207 = ~iMyPid3;
            int i208 = 1647935857 + (((~((-5546411) | i207)) | (~((-422070294) | iMyPid3))) * 520);
            int i209 = ~(422070293 | i207);
            int i210 = ~(iMyPid3 | 425501103);
            int i211 = i204 + i208 + ((i209 | i210) * (-1040)) + ((i210 | (~(i207 | (-425501104))) | (-427616704)) * 520);
            int i212 = (i211 << 13) ^ i211;
            int i213 = i212 ^ (i212 >>> 17);
            ((int[]) objArr125[3])[0] = i213 ^ (i213 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
            char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43042);
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0) + 3111;
            int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22;
            byte[] bArr38 = $$a;
            Object[] objArr126 = new Object[1];
            c((short) 88, bArr38[7], bArr38[10], objArr126);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(maximumDrawingCacheSize, iMakeMeasureSpec3, keyRepeatTimeout2, -1272852037, false, (String) objArr126[0], null);
        }
        long j10 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).getLong(null);
        long jLongValue20 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
            char cBlue2 = (char) (Color.blue(0) + 43042);
            int iResolveSizeAndState2 = 3111 - View.resolveSizeAndState(0, 0, 0);
            int i214 = 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            byte[] bArr39 = $$a;
            Object[] objArr127 = new Object[1];
            c(bArr39[80], bArr39[7], bArr39[10], objArr127);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(cBlue2, iResolveSizeAndState2, i214, -1269618118, false, (String) objArr127[0], null);
        }
        if (j10 == ((jLongValue20 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 43043);
                int iAxisFromString3 = 3110 - MotionEvent.axisFromString("");
                int iNormalizeMetaState4 = 22 - KeyEvent.normalizeMetaState(0);
                Object[] objArr128 = new Object[1];
                c((short) ($$b & 187), (byte) 15, $$a[10], objArr128);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(modifierMetaStateMask, iAxisFromString3, iNormalizeMetaState4, 154975793, false, (String) objArr128[0], null);
            }
            Object[] objArr129 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).get(null);
            int i215 = ((int[]) objArr129[2])[0];
            int i216 = ((int[]) objArr129[1])[0];
            String[] strArr16 = (String[]) objArr129[3];
            int[] iArr10 = {i216};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i217 = (((-682539204) + (((~((-673234985) | iFreeMemory)) | (~(1031796474 | iFreeMemory))) * 69)) + (((~(iFreeMemory | 745325160)) | ((~((-959706299) | iFreeMemory)) | 286471314)) * (-69))) - 2017917513;
            int i218 = (i217 << 13) ^ i217;
            int i219 = i218 ^ (i218 >>> 17);
            ((int[]) objArr9[0])[0] = i219 ^ (i219 << 5);
            objArr9 = new Object[]{new int[1], iArr10, new int[]{i215}, strArr16};
        } else {
            Object[] objArr130 = {null, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), 0, 1597794935};
            byte[] bArr40 = $$g;
            short s15 = bArr40[79];
            byte b4 = (byte) s15;
            Object[] objArr131 = new Object[1];
            d(s15, b4, (byte) (b4 | 49), objArr131);
            Class<?> cls7 = Class.forName((String) objArr131[0]);
            Object[] objArr132 = new Object[1];
            d((short) 227, bArr40[5], (byte) 92, objArr132);
            objArr9 = (Object[]) cls7.getMethod((String) objArr132[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr130);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                char packedPositionChild3 = (char) (43041 - ExpandableListView.getPackedPositionChild(0L));
                int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3111;
                int deadChar2 = 22 - KeyEvent.getDeadChar(0, 0);
                Object[] objArr133 = new Object[1];
                c((short) ($$b & 187), (byte) 15, $$a[10], objArr133);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(packedPositionChild3, keyRepeatDelay2, deadChar2, 154975793, false, (String) objArr133[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArr9);
            try {
                long jLongValue21 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf21 = Long.valueOf(jLongValue21);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                    char cGreen2 = (char) (43042 - Color.green(0));
                    int iRgb4 = (-16774105) - Color.rgb(0, 0, 0);
                    int i220 = 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    byte[] bArr41 = $$a;
                    Object[] objArr134 = new Object[1];
                    c(bArr41[80], bArr41[7], bArr41[10], objArr134);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(cGreen2, iRgb4, i220, -1269618118, false, (String) objArr134[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                Long lValueOf22 = Long.valueOf(jLongValue21 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                    char c14 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43041);
                    int touchSlop3 = 3111 - (ViewConfiguration.getTouchSlop() >> 8);
                    int iIndexOf11 = TextUtils.indexOf("", "", 0, 0) + 22;
                    byte[] bArr42 = $$a;
                    Object[] objArr135 = new Object[1];
                    c((short) 88, bArr42[7], bArr42[10], objArr135);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(c14, touchSlop3, iIndexOf11, -1272852037, false, (String) objArr135[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
            } catch (Exception unused10) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr9[2])[0] != ((int[]) objArr9[1])[0]) {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr17 = (String[]) objArr9[3];
            if (strArr17 != null) {
                int i221 = 0;
                while (i221 < strArr17.length) {
                    int i222 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i222 % 128;
                    if (i222 % 2 != 0) {
                        arrayList8.add(strArr17[i221]);
                        i221 += 55;
                    } else {
                        arrayList8.add(strArr17[i221]);
                        i221++;
                    }
                }
            }
            throw null;
        }
        int i223 = ((int[]) objArr9[0])[0];
        int i224 = ((int[]) objArr9[2])[0];
        int i225 = ((int[]) objArr9[1])[0];
        String[] strArr18 = (String[]) objArr9[3];
        int[] iArr11 = {i225};
        int iIdentityHashCode13 = System.identityHashCode(this);
        int i226 = ~iIdentityHashCode13;
        int i227 = i223 + 1382379122 + ((iIdentityHashCode13 | 2011714) * 988) + (((~(146780786 | i226)) | 1413481600) * (-1976)) + (((~(iIdentityHashCode13 | (-1558250673))) | 2011714 | (~(1558250672 | i226))) * 988);
        int i228 = (i227 << 13) ^ i227;
        int i229 = i228 ^ (i228 >>> 17);
        ((int[]) objArr[0])[0] = i229 ^ (i229 << 5);
        Object[] objArr136 = {new int[1], iArr11, new int[]{i224}, strArr18};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
            char bitsPerPixel3 = (char) (ImageFormat.getBitsPerPixel(0) + 53894);
            int i230 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1319;
            int packedPositionType3 = 36 - ExpandableListView.getPackedPositionType(0L);
            short s16 = $$a[80];
            Object[] objArr137 = new Object[1];
            c(s16, (byte) (s16 & 52), (byte) ($$b & 13), objArr137);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(bitsPerPixel3, i230, packedPositionType3, -1433084963, false, (String) objArr137[0], null);
        }
        long j11 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).getLong(null);
        long jLongValue22 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
            char bitsPerPixel4 = (char) (ImageFormat.getBitsPerPixel(0) + 53894);
            int iResolveOpacity3 = Drawable.resolveOpacity(0, 0) + 1320;
            int deadChar3 = 36 - KeyEvent.getDeadChar(0, 0);
            Object[] objArr138 = new Object[1];
            c((short) ($$b & 187), (byte) 15, $$a[10], objArr138);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(bitsPerPixel4, iResolveOpacity3, deadChar3, -1273706634, false, (String) objArr138[0], null);
        }
        if (j11 == ((jLongValue22 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault73 == null) {
                char cLastIndexOf2 = (char) (53892 - TextUtils.lastIndexOf("", '0', 0, 0));
                int iIndexOf12 = TextUtils.indexOf((CharSequence) "", '0', 0) + 1321;
                int i231 = 37 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                byte[] bArr43 = $$a;
                Object[] objArr139 = new Object[1];
                c(bArr43[80], bArr43[7], bArr43[10], objArr139);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.b(cLastIndexOf2, iIndexOf12, i231, -1920778747, false, (String) objArr139[0], null);
            }
            Object[] objArr140 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault73).get(null);
            objArr10 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i232 = ((int[]) objArr140[0])[0];
            int i233 = ((int[]) objArr140[3])[0];
            String[] strArr19 = (String[]) objArr140[2];
            int iNextInt3 = new Random().nextInt();
            int i234 = ~iNextInt3;
            int i235 = 326153952 + ((1065344478 | i234) * (-369)) + (((~((-389733727) | i234)) | 980894098) * (-369)) + (((~(iNextInt3 | 389733726)) | 675610752 | (~(i234 | (-84450381)))) * 369) + 1237187998;
            int i236 = (i235 << 13) ^ i235;
            int i237 = i236 ^ (i236 >>> 17);
            ((int[]) objArr10[1])[0] = i237 ^ (i237 << 5);
        } else {
            Context applicationContext6 = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            int iIntValue4 = ((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue();
            Object[] objArr141 = {709255321};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault74 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault74 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault74 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 47977), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1300, 21 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr142 = {applicationContext6, "com.bpjstku", 1237187998, Integer.valueOf(iIntValue4), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault74).newInstance(objArr141), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault75 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault75 == null) {
                char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 53893);
                int capsMode4 = TextUtils.getCapsMode("", 0, 0) + 1320;
                int iCombineMeasuredStates = 36 - View.combineMeasuredStates(0, 0);
                byte[] bArr44 = $$a;
                Object[] objArr143 = new Object[1];
                c(bArr44[80], bArr44[7], bArr44[10], objArr143);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault75 = initSession.b(pressedStateDuration, capsMode4, iCombineMeasuredStates, 819724799, false, (String) objArr143[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57878 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 1393 - Process.getGidForName(""), 75 - View.resolveSizeAndState(0, 0, 0)), Boolean.TYPE});
            }
            objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault75).invoke(null, objArr142);
            if (applicationContext6 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault76 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault76 == null) {
                    char cKeyCodeFromString = (char) (53893 - KeyEvent.keyCodeFromString(""));
                    int offsetAfter3 = TextUtils.getOffsetAfter("", 0) + 1320;
                    int maximumFlingVelocity2 = 36 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte[] bArr45 = $$a;
                    Object[] objArr144 = new Object[1];
                    c(bArr45[80], bArr45[7], bArr45[10], objArr144);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault76 = initSession.b(cKeyCodeFromString, offsetAfter3, maximumFlingVelocity2, -1920778747, false, (String) objArr144[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault76).set(null, objArr10);
                try {
                    long jLongValue23 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf23 = Long.valueOf(jLongValue23);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault77 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault77 == null) {
                        char doubleTapTimeout5 = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 53893);
                        int iLastIndexOf5 = 1319 - TextUtils.lastIndexOf("", '0');
                        int iAxisFromString4 = 35 - MotionEvent.axisFromString("");
                        Object[] objArr145 = new Object[1];
                        c((short) ($$b & 187), (byte) 15, $$a[10], objArr145);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault77 = initSession.b(doubleTapTimeout5, iLastIndexOf5, iAxisFromString4, -1273706634, false, (String) objArr145[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault77).set(null, lValueOf23);
                    Long lValueOf24 = Long.valueOf(jLongValue23 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault78 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault78 == null) {
                        char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 53893);
                        int iRed3 = Color.red(0) + 1320;
                        int i238 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 36;
                        short s17 = $$a[80];
                        Object[] objArr146 = new Object[1];
                        c(s17, (byte) (s17 & 52), (byte) ($$b & 13), objArr146);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault78 = initSession.b(cResolveOpacity, iRed3, i238, -1433084963, false, (String) objArr146[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault78).set(null, lValueOf24);
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
        }
        int i239 = ((int[]) objArr10[3])[0];
        int i240 = ((int[]) objArr10[0])[0];
        if (i240 == i239) {
            Object[] objArr147 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i241 = ((int[]) objArr10[1])[0];
            int i242 = ((int[]) objArr10[0])[0];
            int i243 = ((int[]) objArr10[3])[0];
            String[] strArr20 = (String[]) objArr10[2];
            int iIdentityHashCode14 = System.identityHashCode(this);
            int i244 = i241 + (((~(iIdentityHashCode14 | 397542342)) * TypedValues.CycleType.TYPE_EASING) - 1447337436) + (((~((~iIdentityHashCode14) | 397542342)) | 301990658) * TypedValues.CycleType.TYPE_EASING);
            int i245 = (i244 << 13) ^ i244;
            int i246 = i245 ^ (i245 >>> 17);
            ((int[]) objArr147[1])[0] = i246 ^ (i246 << 5);
        } else {
            int[] iArr12 = new int[i240];
            int i247 = i240 - 1;
            iArr12[i247] = 1;
            Toast.makeText((Context) null, iArr12[((i240 * i247) % 2) - 1], 1).show();
            Object[] objArr148 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i248 = ((int[]) objArr10[1])[0];
            int i249 = ((int[]) objArr10[0])[0];
            int i250 = ((int[]) objArr10[3])[0];
            String[] strArr21 = (String[]) objArr10[2];
            int iNextInt4 = new Random().nextInt();
            int i251 = 1920558472 + (((~((-366688975) | iNextInt4)) | 67705548 | (~(1003938850 | iNextInt4))) * (-754));
            int i252 = ~((-67705549) | iNextInt4);
            int i253 = ~iNextInt4;
            int i254 = i248 + i251 + ((i252 | (~(1071644398 | i253))) * (-754)) + ((i253 | (-366688975)) * 754);
            int i255 = (i254 << 13) ^ i254;
            int i256 = i255 ^ (i255 >>> 17);
            ((int[]) objArr148[1])[0] = i256 ^ (i256 << 5);
        }
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        getBroadcastExecutor().execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(intent, context, zIsOrderedBroadcast, pendingResultGoAsync);
            }
        });
    }

    protected void onNotificationDismissed(Context context, Bundle bundle) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r5, byte r6, byte r7) {
        /*
            byte[] r0 = com.google.android.gms.cloudmessaging.CloudMessagingReceiver.$$c
            int r6 = r6 * 4
            int r1 = 1 - r6
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r5 = r5 * 3
            int r5 = 115 - r5
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r5 = r6
            r3 = r7
            r4 = r2
            goto L29
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L27:
            r3 = r0[r7]
        L29:
            int r7 = r7 + 1
            int r5 = r5 + r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.CloudMessagingReceiver.$$i(short, byte, byte):java.lang.String");
    }
}
