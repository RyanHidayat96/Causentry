package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.datadog.android.rum.internal.domain.scope.RumViewScope$onStopView$1;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
class TopicsSyncTask implements Runnable {
    private static final Object TOPIC_SYNC_TASK_LOCK = new Object();
    private static Boolean hasAccessNetworkStatePermission;
    private static Boolean hasWakeLockPermission;
    private final Context context;
    private final Metadata metadata;
    private final long nextDelaySeconds;
    private final PowerManager.WakeLock syncWakeLock;
    private final TopicsSubscriber topicsSubscriber;

    TopicsSyncTask(TopicsSubscriber topicsSubscriber, Context context, Metadata metadata, long j) {
        this.topicsSubscriber = topicsSubscriber;
        this.context = context;
        this.nextDelaySeconds = j;
        this.metadata = metadata;
        this.syncWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, Constants.FCM_WAKE_LOCK);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (hasWakeLockPermission(this.context)) {
            this.syncWakeLock.acquire(Constants.WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);
        }
        try {
            try {
                try {
                    this.topicsSubscriber.setSyncScheduledOrRunning(true);
                    if (!this.metadata.isGmscorePresent()) {
                        this.topicsSubscriber.setSyncScheduledOrRunning(false);
                        if (!hasWakeLockPermission(this.context)) {
                            return;
                        }
                    } else if (!hasAccessNetworkStatePermission(this.context) || isDeviceConnected()) {
                        if (this.topicsSubscriber.syncTopics()) {
                            this.topicsSubscriber.setSyncScheduledOrRunning(false);
                        } else {
                            this.topicsSubscriber.syncWithDelaySecondsInternal(this.nextDelaySeconds);
                        }
                        if (!hasWakeLockPermission(this.context)) {
                            return;
                        }
                    } else {
                        new ConnectivityChangeReceiver(this).registerReceiver();
                        if (!hasWakeLockPermission(this.context)) {
                            return;
                        }
                    }
                    this.syncWakeLock.release();
                } catch (IOException e2) {
                    e2.getMessage();
                    this.topicsSubscriber.setSyncScheduledOrRunning(false);
                    if (hasWakeLockPermission(this.context)) {
                        this.syncWakeLock.release();
                    }
                }
            } catch (RuntimeException unused) {
            }
        } catch (Throwable th) {
            if (hasWakeLockPermission(this.context)) {
                try {
                    this.syncWakeLock.release();
                } catch (RuntimeException unused2) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDeviceConnected() {
        boolean z;
        synchronized (this) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
        return z;
    }

    class ConnectivityChangeReceiver extends BroadcastReceiver {
        private TopicsSyncTask task;
        private static final byte[] $$c = {83, -4, -55, -17};
        private static final int $$f = 83;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {99, -43, -44, -62, -17, 6, -18, -1, 2, 1, 50, -73, -6, 1, -4, -3, -7, -6, 66, -76, 62, 2, -67, 4, -3, -9, 4, 47, -73, 10, -18, -4, 6, -10, -3, 60, -35, -28, -3, -9, 4, 26, -48, -3, -10, -2, -1, -1, -4, 3, -17, 43, -48, -2, -7, 11, -23, 76, -35, -34, -15, -4, 6, -3, -6, -12, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 62, -3, 23, -22, 0, -21, 11, -9, 33, -45, -1, 2, -12, 2, -3, -55, 11, -4, -3, -17, 9, -3, 31, -56, 13, -9, -10, 24, -37, -2, 9, 0, -16, 36, -55, 0, 11, -17, 0, 9, -15, 21, -42, 7, -10, 8, -1, -19, 7, 2, 19, -25, -16, 7, -6, -1, 44, 9, -52, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 62, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, 14, -11, -9, 6, -9, -9, 3, 26, -41, 4, -10, 7, -23, 11, -17, Base64.padSymbol, -5, 7, -13, 24, -19, -26, 33, -23, -18, 0, -10, -1, 11, -6, 27, -34, -48, -3, -10, 11, -23, 0, 28, -24, -1, -12, 4, 10, -31, 13, -19, -4, 7, -17, 7, -17, 8, -13, -7, 1, 32, -31, -5, -13, -10, 7, -1, -7, 0, -17, 45, -38, -21, 7, -10, -3, 10, -19, 44, -41, -14, -1, 0, 7, -28, 40, -38, 7, -5};
        private static final int $$e = 104;
        private static final byte[] $$a = {114, -115, 48, 84, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
        private static final int $$b = 28;
        private static int b = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -8335760386589549955L;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -981105359;
        private static char TuitionPaymentFragmentbindingInflater1 = 34097;

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r7, short r8, int r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 + 1
                int r9 = r9 + 4
                int r7 = r7 + 84
                byte[] r0 = com.google.firebase.messaging.TopicsSyncTask.ConnectivityChangeReceiver.$$a
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L10
                r3 = r9
                r5 = r2
                goto L29
            L10:
                r3 = r2
            L11:
                r6 = r9
                r9 = r7
                r7 = r6
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r8) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L23:
                r3 = r0[r7]
                r6 = r9
                r9 = r7
                r7 = r3
                r3 = r6
            L29:
                int r9 = r9 + 1
                int r3 = r3 + r7
                int r7 = r3 + (-11)
                r3 = r5
                goto L11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.TopicsSyncTask.ConnectivityChangeReceiver.c(int, short, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0021  */
        /* JADX WARN: Code duplicated, block: B:8:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(byte r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r0 = r8 + 1
                int r6 = r6 + 66
                byte[] r1 = com.google.firebase.messaging.TopicsSyncTask.ConnectivityChangeReceiver.$$d
                int r7 = 321 - r7
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L11
                r3 = r7
                r7 = r8
                r4 = r2
                goto L27
            L11:
                r3 = r2
            L12:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L21
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L21:
                r3 = r1[r7]
                r5 = r7
                r7 = r6
                r6 = r3
                r3 = r5
            L27:
                int r6 = -r6
                int r7 = r7 + r6
                int r6 = r3 + 1
                int r7 = r7 + (-4)
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.TopicsSyncTask.ConnectivityChangeReceiver.d(byte, int, int, java.lang.Object[]):void");
        }

        private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
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
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 8329), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1235, 35 - (Process.myTid() >> 22), -653973969, false, $$g(b2, b3, (byte) (b3 - 2)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getTrimmedLength(""), 2765 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 14 - (ViewConfiguration.getTouchSlop() >> 8), 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.MeasureSpec.getSize(0) + 43325), Color.argb(0, 0, 0, 0) + 253, 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 65200), 2891 - Color.green(0), View.resolveSizeAndState(0, 0, 0) + 17, 2012627446, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = sessionProcessor.b;
                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))));
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                    int i3 = $10 + 75;
                    $11 = i3 % 128;
                    int i4 = i3 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
            int i5 = $10 + 93;
            $11 = i5 % 128;
            int i6 = i5 % 2;
        }

        public ConnectivityChangeReceiver(TopicsSyncTask topicsSyncTask) {
            this.task = topicsSyncTask;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) throws Throwable {
            Object[] objArr;
            int i;
            String str;
            Object[] objArr2;
            Object[] objArr3;
            Object[] objArr4;
            int i2;
            String str2;
            Object[] objArr5;
            Object[] objArr6;
            Context context2;
            Object[] objArr7;
            Object[] objArr8;
            int i3;
            String str3;
            Object[] objArr9;
            Object[] objArr10;
            Object[] objArr11;
            Object[] objArr12;
            Object[] objArr13;
            int i4;
            Object[] objArr14;
            Object[] objArr15;
            Object[] objArr16 = new Object[1];
            a(new char[]{8012, 7435, 33636, 11055}, new char[]{62338, 14373, 28455, 47140}, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), Process.myTid() >> 22, new char[]{29375, 8094, 25690, 62217, 3079, 18228, 52389, 38213, 61872, 48798, 59955, 55069, 39693, 39165, 47903, 63138, 15516, 6999, 33817, 63426, 33468, 37139}, objArr16);
            Boolean bool = false;
            Integer num = 0;
            String str4 = (String) objArr16[0];
            Object[] objArr17 = new Object[1];
            a(new char[]{8012, 7435, 33636, 11055}, new char[]{11091, 47646, 54621, 53959}, (char) (51157 - View.resolveSizeAndState(0, 0, 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 1572478507, new char[]{64081, 29546, 43869, 57654, 25886, 37356, 2520, 9090, 31880, 53921, 36913, 22662, 16557, 6393, 39034}, objArr17);
            String str5 = (String) objArr17[0];
            Object[] objArr18 = new Object[1];
            a(new char[]{8012, 7435, 33636, 11055}, new char[]{55875, 213, 37101, 13468}, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 40080), Color.red(0), new char[]{20140, 28217, 33361, 8966, 30084, 10054, 2357, 48171, 10605, 61655, 2772, 37702, 26760, 31595, 53373, 31686}, objArr18);
            String str6 = (String) objArr18[0];
            Object[] objArr19 = new Object[1];
            a(new char[]{8012, 7435, 33636, 11055}, new char[]{52781, 35036, 50294, 42199}, (char) (55236 - Drawable.resolveOpacity(0, 0)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, new char[]{8183, 50319, 4305, 1178, 30232, 63188, 3752, 43777, 20107, 53298, 33701, 56490, 53855, 65521, 34916, 33830}, objArr19);
            String str7 = (String) objArr19[0];
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 43042);
                int iIndexOf = 3111 - TextUtils.indexOf("", "");
                int i5 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23;
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr20 = new Object[1];
                c(b3, (byte) (b3 | 52), b2, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString, iIndexOf, i5, -1272852037, false, (String) objArr20[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 43043);
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 3112;
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22;
                    byte b4 = $$a[7];
                    Object[] objArr21 = new Object[1];
                    c(b4, (byte) (b4 | 37), (short) 52, objArr21);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild, bitsPerPixel, keyRepeatDelay, 154975793, false, (String) objArr21[0], null);
                }
                Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
                int i6 = ((int[]) objArr22[2])[0];
                int i7 = ((int[]) objArr22[1])[0];
                String[] strArr = (String[]) objArr22[3];
                int iIdentityHashCode = System.identityHashCode(this);
                int i8 = ~iIdentityHashCode;
                int i9 = (((633481850 + (((~(895065886 | i8)) | 809965572) * (-328))) + ((iIdentityHashCode | 809965572) * 164)) + ((((~(iIdentityHashCode | (-895065887))) | 809572356) | (~(i8 | 895459102))) * 164)) - 1679937790;
                int i10 = i9 ^ (i9 << 13);
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
                objArr = new Object[]{new int[1], new int[]{i7}, new int[]{i6}, strArr};
                num = num;
                str5 = str5;
                i = 1;
            } else {
                try {
                    Object[] objArr23 = {null, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), num, -1679937790};
                    byte[] bArr = $$d;
                    Object[] objArr24 = new Object[1];
                    d(bArr[139], (short) TypedValues.AttributesType.TYPE_EASING, bArr[20], objArr24);
                    Class<?> cls = Class.forName((String) objArr24[0]);
                    byte b5 = (byte) (-bArr[6]);
                    Object[] objArr25 = new Object[1];
                    d(b5, (short) (b5 | 237), (byte) (-bArr[175]), objArr25);
                    Object[] objArr26 = (Object[]) cls.getMethod((String) objArr25[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr23);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16820258);
                        int i12 = 3112 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 23;
                        byte b6 = $$a[7];
                        Object[] objArr27 = new Object[1];
                        c(b6, (byte) (b6 | 37), (short) 52, objArr27);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb, i12, modifierMetaStateMask, 154975793, false, (String) objArr27[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr26);
                    try {
                        long jLongValue = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cGreen = (char) (Color.green(0) + 43042);
                            int iAxisFromString = MotionEvent.axisFromString("") + 3112;
                            int keyRepeatDelay2 = 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            byte b7 = $$a[7];
                            Object[] objArr28 = new Object[1];
                            c(b7, (byte) (b7 | 52), (short) 89, objArr28);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cGreen, iAxisFromString, keyRepeatDelay2, -1269618118, false, (String) objArr28[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cIndexOf = (char) (43042 - TextUtils.indexOf("", ""));
                            int iIndexOf2 = TextUtils.indexOf("", "") + 3111;
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22;
                            byte b8 = $$a[7];
                            byte b9 = b8;
                            Object[] objArr29 = new Object[1];
                            c(b9, (byte) (b9 | 52), b8, objArr29);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, iIndexOf2, minimumFlingVelocity, -1272852037, false, (String) objArr29[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                        objArr = objArr26;
                        i = 1;
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
            int i13 = ((int[]) objArr[i])[0];
            int i14 = ((int[]) objArr[2])[0];
            if (i14 != i13) {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr[3];
                if (strArr2 != null) {
                    for (String str8 : strArr2) {
                        arrayList.add(str8);
                    }
                }
                throw new RuntimeException(String.valueOf(i14));
            }
            Object[] objArr30 = new Object[4];
            objArr30[0] = new int[i];
            int[] iArr = new int[i];
            objArr30[i] = iArr;
            int[] iArr2 = new int[i];
            objArr30[2] = iArr2;
            int i15 = ((int[]) objArr[0])[0];
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[i])[0];
            String[] strArr3 = (String[]) objArr[3];
            iArr2[0] = i16;
            iArr[0] = i17;
            int i18 = ~((~((int) SystemClock.elapsedRealtime())) | 893895580);
            int i19 = i15 + ((84344856 | i18) * (-374)) + 1060976474 + ((i18 | 809550724) * 374);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr30[0])[0] = i21 ^ (i21 << 5);
            objArr30[3] = strArr3;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char c = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 53893);
                int i22 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1319;
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 36;
                byte b10 = (byte) ($$b >>> 1);
                byte b11 = $$a[7];
                Object[] objArr31 = new Object[1];
                c(b10, b11, (short) (b11 | 141), objArr31);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, i22, iNormalizeMetaState, -1433084963, false, (String) objArr31[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char cNormalizeMetaState = (char) (53893 - KeyEvent.normalizeMetaState(0));
                    int size = 1320 - View.MeasureSpec.getSize(0);
                    int mode = View.MeasureSpec.getMode(0) + 36;
                    byte b12 = $$a[7];
                    Object[] objArr32 = new Object[1];
                    c(b12, (byte) (b12 | 52), (short) 89, objArr32);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cNormalizeMetaState, size, mode, -1920778747, false, (String) objArr32[0], null);
                }
                Object[] objArr33 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null);
                objArr2 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                int i23 = ((int[]) objArr33[0])[0];
                int i24 = ((int[]) objArr33[3])[0];
                String[] strArr4 = (String[]) objArr33[2];
                int iMyUid = Process.myUid();
                int i25 = (-1470251968) + (((~((-250515565) | iMyUid)) | 204214376 | (~(1120112260 | iMyUid))) * (-754));
                int i26 = ~((-204214377) | iMyUid);
                int i27 = ~iMyUid;
                int i28 = ((i25 + ((i26 | (~(1324326636 | i27))) * (-754))) + ((i27 | (-250515565)) * 754)) - 1837113635;
                int i29 = (i28 << 13) ^ i28;
                int i30 = i29 ^ (i29 >>> 17);
                ((int[]) objArr2[1])[0] = i30 ^ (i30 << 5);
                bool = bool;
                objArr30 = objArr30;
                str = str5;
            } else {
                Context applicationContext = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
                int iIntValue = ((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr34 = {-1241589036};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 47977), TextUtils.getOffsetBefore("", 0) + 1300, 20 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -420973425, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr35 = {applicationContext, "com.bpjstku", -1837113635, Integer.valueOf(iIntValue), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).newInstance(objArr34), bool};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                        char c2 = (char) (53893 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        int iIndexOf3 = 1320 - TextUtils.indexOf("", "", 0);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 37;
                        byte b13 = $$a[7];
                        Object[] objArr36 = new Object[1];
                        c(b13, (byte) (b13 | 52), (short) 89, objArr36);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, iIndexOf3, iLastIndexOf, 819724799, false, (String) objArr36[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getTouchSlop() >> 8) + 57878), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1394, 75 - (ViewConfiguration.getTouchSlop() >> 8)), Boolean.TYPE});
                    }
                    Object[] objArr37 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr35);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                            char tapTimeout = (char) (53893 - (ViewConfiguration.getTapTimeout() >> 16));
                            int i31 = 1320 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 36;
                            byte b14 = $$a[7];
                            Object[] objArr38 = new Object[1];
                            c(b14, (byte) (b14 | 52), (short) 89, objArr38);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(tapTimeout, i31, longPressTimeout, -1920778747, false, (String) objArr38[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, objArr37);
                        try {
                            str = str5;
                            long jLongValue2 = ((Long) Class.forName(str4).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf3 = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 53894);
                                int iKeyCodeFromString = 1320 - KeyEvent.keyCodeFromString("");
                                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 36;
                                byte b15 = $$a[7];
                                Object[] objArr39 = new Object[1];
                                c(b15, (byte) (b15 | 37), (short) 52, objArr39);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf2, iKeyCodeFromString, edgeSlop, -1273706634, false, (String) objArr39[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf3);
                            Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                                char deadChar = (char) (53893 - KeyEvent.getDeadChar(0, 0));
                                int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 1320;
                                int i32 = 36 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                byte b16 = (byte) ($$b >>> 1);
                                byte b17 = $$a[7];
                                Object[] objArr40 = new Object[1];
                                c(b16, b17, (short) (b17 | 141), objArr40);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(deadChar, longPressTimeout2, i32, -1433084963, false, (String) objArr40[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf4);
                        } catch (Exception unused2) {
                            throw new RuntimeException();
                        }
                    } else {
                        bool = bool;
                        objArr30 = objArr30;
                        str = str5;
                        objArr37 = objArr37;
                    }
                    objArr2 = objArr37;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i33 = ((int[]) objArr2[3])[0];
            int i34 = ((int[]) objArr2[0])[0];
            if (i34 != i33) {
                throw new RuntimeException(String.valueOf(i34));
            }
            Object[] objArr41 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i35 = ((int[]) objArr2[1])[0];
            int i36 = ((int[]) objArr2[0])[0];
            int i37 = ((int[]) objArr2[3])[0];
            String[] strArr5 = (String[]) objArr2[2];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i38 = ~iMaxMemory;
            int i39 = i35 + (-1641990632) + (((~(iMaxMemory | 517981667)) | (~((-315769090) | i38)) | (-1054858736)) * (-68)) + ((~((-536877069) | i38)) * (-68)) + (((~((-517981668) | i38)) | (-852646158)) * 68);
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr41[1])[0] = i41 ^ (i41 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 31534);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 921;
                int iIndexOf4 = 28 - TextUtils.indexOf("", "");
                byte b18 = (byte) ($$b >>> 1);
                byte b19 = $$a[7];
                Object[] objArr42 = new Object[1];
                c(b18, b19, (short) (b19 | 141), objArr42);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cLastIndexOf, iMakeMeasureSpec, iIndexOf4, -1048449946, false, (String) objArr42[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c3 = (char) (31533 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int iGreen = Color.green(0) + 921;
                    int tapTimeout2 = 28 - (ViewConfiguration.getTapTimeout() >> 16);
                    byte b20 = $$a[7];
                    Object[] objArr43 = new Object[1];
                    c(b20, (byte) (b20 | 37), (short) 52, objArr43);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, iGreen, tapTimeout2, -1142834547, false, (String) objArr43[0], null);
                }
                Object[] objArr44 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).get(null);
                objArr3 = new Object[]{new int[1], new int[]{((int[]) objArr44[1])[0]}, (Object[]) objArr44[2], new int[]{((int[]) objArr44[3])[0]}, (String[]) objArr44[4]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i42 = (((1038931033 + (((~((~iIdentityHashCode2) | (-65803))) | (~(930987995 | iIdentityHashCode2))) * (-302))) + ((~((-65803) | iIdentityHashCode2)) * (-604))) + (((~(iIdentityHashCode2 | 930922193)) | 87830545) * 302)) - 455139813;
                int i43 = (i42 << 13) ^ i42;
                int i44 = i43 ^ (i43 >>> 17);
                ((int[]) objArr3[0])[0] = i44 ^ (i44 << 5);
                objArr41 = objArr41;
            } else {
                Object[] objArr45 = {context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), num, -455139813};
                byte[] bArr2 = $$d;
                Object[] objArr46 = new Object[1];
                d(bArr2[315], (short) 203, bArr2[249], objArr46);
                Class<?> cls2 = Class.forName((String) objArr46[0]);
                byte b21 = bArr2[305];
                Object[] objArr47 = new Object[1];
                d(b21, (short) (b21 | 157), bArr2[103], objArr47);
                Object[] objArr48 = (Object[]) cls2.getMethod((String) objArr47[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr45);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cLastIndexOf2 = (char) (31532 - TextUtils.lastIndexOf("", '0', 0));
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 921;
                    int edgeSlop2 = 28 - (ViewConfiguration.getEdgeSlop() >> 16);
                    byte b22 = $$a[7];
                    Object[] objArr49 = new Object[1];
                    c(b22, (byte) (b22 | 37), (short) 52, objArr49);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cLastIndexOf2, pressedStateDuration, edgeSlop2, -1142834547, false, (String) objArr49[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, objArr48);
                try {
                    long jLongValue3 = ((Long) Class.forName(str4).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                        char c4 = (char) (31533 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 921;
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28;
                        byte b23 = $$a[7];
                        Object[] objArr50 = new Object[1];
                        c(b23, (byte) (b23 | 52), (short) 89, objArr50);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(c4, fadingEdgeLength, maximumDrawingCacheSize, -778300370, false, (String) objArr50[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                        char longPressTimeout3 = (char) (31533 - (ViewConfiguration.getLongPressTimeout() >> 16));
                        int jumpTapTimeout = 921 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int i45 = 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        byte b24 = (byte) ($$b >>> 1);
                        byte b25 = $$a[7];
                        Object[] objArr51 = new Object[1];
                        c(b24, b25, (short) (b25 | 141), objArr51);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(longPressTimeout3, jumpTapTimeout, i45, -1048449946, false, (String) objArr51[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf6);
                    objArr3 = objArr48;
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            }
            int i46 = ((int[]) objArr3[1])[0];
            int i47 = ((int[]) objArr3[3])[0];
            if (i47 == i46) {
                int i48 = ((int[]) objArr3[0])[0];
                objArr4 = new Object[]{new int[1], new int[]{((int[]) objArr3[1])[0]}, (Object[]) objArr3[2], new int[]{((int[]) objArr3[3])[0]}, (String[]) objArr3[4]};
                int iIdentityHashCode3 = System.identityHashCode(this);
                int i49 = ~iIdentityHashCode3;
                int i50 = (~((-744811302) | i49)) | 2394113 | (~(1029268342 | i49));
                int i51 = i48 + 1448149997 + (((~(iIdentityHashCode3 | (-286851155))) | i50) * 590) + (i50 * (-1180)) + (((~((-1029268343) | i49)) | (~(i49 | 744811301))) * 590);
                int i52 = (i51 << 13) ^ i51;
                int i53 = i52 ^ (i52 >>> 17);
                i2 = 0;
                ((int[]) objArr4[0])[0] = i53 ^ (i53 << 5);
            } else {
                ArrayList arrayList2 = new ArrayList();
                String[] strArr6 = (String[]) objArr3[4];
                if (strArr6 != null) {
                    for (String str9 : strArr6) {
                        arrayList2.add(str9);
                    }
                }
                int[] iArr3 = new int[i47];
                int i54 = i47 - 1;
                iArr3[i54] = 1;
                Toast.makeText((Context) null, iArr3[((i47 * i54) % 2) - 1], 1).show();
                int i55 = ((int[]) objArr3[0])[0];
                objArr4 = new Object[]{new int[1], new int[]{((int[]) objArr3[1])[0]}, (Object[]) objArr3[2], new int[]{((int[]) objArr3[3])[0]}, (String[]) objArr3[4]};
                int iIdentityHashCode4 = System.identityHashCode(this);
                int i56 = ~iIdentityHashCode4;
                int i57 = i55 + 2075531307 + (((~(i56 | 308839972)) | (~((-1465239672) | i56)) | 1159022675) * 464) + (((-306216997) | iIdentityHashCode4) * (-464)) + (((~(iIdentityHashCode4 | 308839972)) | 1159022675) * 464);
                int i58 = (i57 << 13) ^ i57;
                int i59 = i58 ^ (i58 >>> 17);
                i2 = 0;
                ((int[]) objArr4[0])[0] = i59 ^ (i59 << 5);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                char c5 = (char) (ExpandableListView.getPackedPositionForGroup(i2) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i2) == 0L ? 0 : -1));
                int mode2 = View.MeasureSpec.getMode(i2) + 876;
                int i60 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10;
                byte b26 = $$a[7];
                Object[] objArr52 = new Object[1];
                c(b26, (byte) (b26 | 37), (short) 52, objArr52);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(c5, mode2, i60, -1650998592, false, (String) objArr52[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null);
            long jLongValue4 = ((Long) Class.forName(str4).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char cIndexOf3 = (char) TextUtils.indexOf("", "", 0, 0);
                int i61 = 877 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int edgeSlop3 = 10 - (ViewConfiguration.getEdgeSlop() >> 16);
                byte b27 = $$a[7];
                Object[] objArr53 = new Object[1];
                c(b27, (byte) (b27 | 52), (short) 89, objArr53);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cIndexOf3, i61, edgeSlop3, 2012020043, false, (String) objArr53[0], null);
            }
            if (j == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                    char mode3 = (char) View.MeasureSpec.getMode(0);
                    int iIndexOf5 = 875 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int i62 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9;
                    byte b28 = $$a[7];
                    byte b29 = b28;
                    Object[] objArr54 = new Object[1];
                    c(b29, (byte) (b29 | 52), b28, objArr54);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(mode3, iIndexOf5, i62, 2012931276, false, (String) objArr54[0], null);
                }
                Object[] objArr55 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).get(null);
                objArr5 = new Object[]{new int[]{((int[]) objArr55[0])[0]}, new int[1], new int[]{((int[]) objArr55[2])[0]}, (String[]) objArr55[3]};
                int iIdentityHashCode5 = System.identityHashCode(this);
                int i63 = ~iIdentityHashCode5;
                int i64 = 2070192700 + (((~(574842590 | i63)) | (~((-615152820) | iIdentityHashCode5))) * (-370)) + (((~(iIdentityHashCode5 | 574842590)) | (~(i63 | (-615152820))) | 37814860) * (-370)) + 1604503947;
                int i65 = (i64 << 13) ^ i64;
                int i66 = i65 ^ (i65 >>> 17);
                ((int[]) objArr5[1])[0] = i66 ^ (i66 << 5);
                str2 = str;
            } else {
                Context applicationContext2 = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
                Object[] objArr56 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), num, 497907635};
                byte[] bArr3 = $$d;
                byte b30 = bArr3[103];
                Object[] objArr57 = new Object[1];
                d(b30, (short) (b30 | 189), (byte) ($$e & 496), objArr57);
                Class<?> cls3 = Class.forName((String) objArr57[0]);
                Object[] objArr58 = new Object[1];
                d((byte) (-bArr3[6]), (short) 93, (byte) (-bArr3[66]), objArr58);
                Object[] objArr59 = (Object[]) cls3.getMethod((String) objArr58[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr56);
                if (applicationContext2 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int iIndexOf6 = TextUtils.indexOf((CharSequence) "", '0') + 877;
                        int iCombineMeasuredStates = 10 - View.combineMeasuredStates(0, 0);
                        byte b31 = $$a[7];
                        byte b32 = b31;
                        Object[] objArr60 = new Object[1];
                        c(b32, (byte) (b32 | 52), b31, objArr60);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(windowTouchSlop, iIndexOf6, iCombineMeasuredStates, 2012931276, false, (String) objArr60[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, objArr59);
                    try {
                        str2 = str;
                        long jLongValue5 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf7 = Long.valueOf(jLongValue5);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                            char cIndexOf4 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                            int i67 = 877 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int iRed = 10 - Color.red(0);
                            byte b33 = $$a[7];
                            Object[] objArr61 = new Object[1];
                            c(b33, (byte) (b33 | 52), (short) 89, objArr61);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(cIndexOf4, i67, iRed, 2012020043, false, (String) objArr61[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, lValueOf7);
                        Long lValueOf8 = Long.valueOf(jLongValue5 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                            char tapTimeout3 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                            int iResolveOpacity = 876 - Drawable.resolveOpacity(0, 0);
                            int iResolveSizeAndState = 10 - View.resolveSizeAndState(0, 0, 0);
                            byte b34 = $$a[7];
                            Object[] objArr62 = new Object[1];
                            c(b34, (byte) (b34 | 37), (short) 52, objArr62);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(tapTimeout3, iResolveOpacity, iResolveSizeAndState, -1650998592, false, (String) objArr62[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, lValueOf8);
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                } else {
                    str2 = str;
                    objArr59 = objArr59;
                }
                objArr5 = objArr59;
            }
            int i68 = ((int[]) objArr5[2])[0];
            int i69 = ((int[]) objArr5[0])[0];
            if (i69 != i68) {
                throw new RuntimeException(String.valueOf(i69));
            }
            int i70 = ((int[]) objArr5[1])[0];
            Object[] objArr63 = {new int[]{((int[]) objArr5[0])[0]}, new int[1], new int[]{((int[]) objArr5[2])[0]}, (String[]) objArr5[3]};
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i71 = ~iIdentityHashCode6;
            int i72 = i70 + (-219778240) + (((~(767770532 | i71)) | 808080761) * 226) + (((~(i71 | 1038843901)) | (~((-808080762) | iIdentityHashCode6)) | 537007392) * (-113)) + ((~(iIdentityHashCode6 | 767770532)) * 113);
            int i73 = (i72 << 13) ^ i72;
            int i74 = i73 ^ (i73 >>> 17);
            ((int[]) objArr63[1])[0] = i74 ^ (i74 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                char mode4 = (char) View.MeasureSpec.getMode(0);
                int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 876;
                int i75 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
                byte[] bArr4 = $$a;
                Object[] objArr64 = new Object[1];
                c(bArr4[153], bArr4[9], (short) 141, objArr64);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(mode4, iCombineMeasuredStates2, i75, -1199417970, false, (String) objArr64[0], null);
            }
            long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).getLong(null);
            long jLongValue6 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 876;
                int bitsPerPixel2 = 9 - ImageFormat.getBitsPerPixel(0);
                byte[] bArr5 = $$a;
                byte b35 = bArr5[33];
                byte b36 = bArr5[7];
                Object[] objArr65 = new Object[1];
                c(b35, b36, (short) (b36 | 151), objArr65);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(maxKeyCode, maxKeyCode2, bitsPerPixel2, 254769921, false, (String) objArr65[0], null);
            }
            if (j2 == ((jLongValue6 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                    char c6 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int i76 = 877 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int i77 = 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte[] bArr6 = $$a;
                    byte b37 = bArr6[153];
                    byte b38 = bArr6[41];
                    Object[] objArr66 = new Object[1];
                    c(b37, b38, (short) (b38 | 144), objArr66);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(c6, i76, i77, 1324201839, false, (String) objArr66[0], null);
                }
                Object[] objArr67 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).get(null);
                objArr6 = new Object[]{new int[]{((int[]) objArr67[0])[0]}, new int[1], new int[]{((int[]) objArr67[2])[0]}, (String[]) objArr67[3]};
                int iIdentityHashCode7 = System.identityHashCode(this);
                int i78 = ~iIdentityHashCode7;
                int i79 = (~((-873331210) | i78)) | 67705353;
                int i80 = ~(iIdentityHashCode7 | (-27395125));
                int i81 = (-331340934) + ((i79 | i80) * (-502)) + ((i80 | (~(i78 | (-805625857)))) * TypedValues.PositionType.TYPE_DRAWPATH) + 80187507;
                int i82 = (i81 << 13) ^ i81;
                int i83 = i82 ^ (i82 >>> 17);
                ((int[]) objArr6[1])[0] = i83 ^ (i83 << 5);
            } else {
                Object[] objArr68 = {Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), 80187507};
                byte[] bArr7 = $$d;
                Object[] objArr69 = new Object[1];
                d(bArr7[315], (short) (-bArr7[140]), (byte) (-bArr7[149]), objArr69);
                Class<?> cls4 = Class.forName((String) objArr69[0]);
                Object[] objArr70 = new Object[1];
                d((byte) (-bArr7[6]), (short) 93, (byte) (-bArr7[66]), objArr70);
                objArr6 = (Object[]) cls4.getMethod((String) objArr70[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr68);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                    char cGreen2 = (char) Color.green(0);
                    int iRed2 = Color.red(0) + 876;
                    int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 10;
                    byte[] bArr8 = $$a;
                    byte b39 = bArr8[153];
                    byte b40 = bArr8[41];
                    Object[] objArr71 = new Object[1];
                    c(b39, b40, (short) (b40 | 144), objArr71);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(cGreen2, iRed2, windowTouchSlop2, 1324201839, false, (String) objArr71[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).set(null, objArr6);
                try {
                    long jLongValue7 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue7);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int i84 = 877 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int packedPositionGroup = 10 - ExpandableListView.getPackedPositionGroup(0L);
                        byte[] bArr9 = $$a;
                        byte b41 = bArr9[33];
                        byte b42 = bArr9[7];
                        Object[] objArr72 = new Object[1];
                        c(b41, b42, (short) (b42 | 151), objArr72);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(touchSlop, i84, packedPositionGroup, 254769921, false, (String) objArr72[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue7 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int iIndexOf7 = TextUtils.indexOf("", "") + 876;
                        int tapTimeout4 = (ViewConfiguration.getTapTimeout() >> 16) + 10;
                        byte[] bArr10 = $$a;
                        Object[] objArr73 = new Object[1];
                        c(bArr10[153], bArr10[9], (short) 141, objArr73);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(trimmedLength, iIndexOf7, tapTimeout4, -1199417970, false, (String) objArr73[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, lValueOf10);
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            }
            if (((int[]) objArr6[0])[0] != ((int[]) objArr6[2])[0]) {
                ArrayList arrayList3 = new ArrayList();
                String[] strArr7 = (String[]) objArr6[3];
                if (strArr7 != null) {
                    for (String str10 : strArr7) {
                        arrayList3.add(str10);
                    }
                }
                throw null;
            }
            int i85 = ((int[]) objArr6[1])[0];
            Object[] objArr74 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i86 = ~startElapsedRealtime;
            int i87 = (-345834476) + (((~((-2695175) | i86)) | (~(36302926 | startElapsedRealtime))) * 520);
            int i88 = ~((-36302927) | i86);
            int i89 = ~(startElapsedRealtime | 4007302);
            int i90 = i85 + i87 + ((i88 | i89) * (-1040)) + ((i89 | (~(i86 | (-4007303))) | 33607752) * 520);
            int i91 = (i90 << 13) ^ i90;
            int i92 = i91 ^ (i91 >>> 17);
            ((int[]) objArr74[1])[0] = i92 ^ (i92 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                char longPressTimeout4 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 877;
                int i93 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11;
                byte b43 = (byte) ($$b >>> 1);
                byte b44 = $$a[7];
                Object[] objArr75 = new Object[1];
                c(b43, b44, (short) (b44 | 141), objArr75);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(longPressTimeout4, iLastIndexOf2, i93, 252381699, false, (String) objArr75[0], null);
            }
            long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).getLong(null);
            long jLongValue8 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 876;
                int iCombineMeasuredStates3 = 10 - View.combineMeasuredStates(0, 0);
                byte b45 = $$a[7];
                Object[] objArr76 = new Object[1];
                c(b45, (byte) (b45 | 52), (short) ($$b | 130), objArr76);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(maximumFlingVelocity, absoluteGravity, iCombineMeasuredStates3, 2009631821, false, (String) objArr76[0], null);
            }
            if (j3 == ((jLongValue8 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                    char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                    int i94 = 877 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int fadingEdgeLength2 = 10 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte[] bArr11 = $$a;
                    byte b46 = bArr11[54];
                    byte b47 = bArr11[7];
                    Object[] objArr77 = new Object[1];
                    c(b46, b47, (short) (b47 | 210), objArr77);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(capsMode, i94, fadingEdgeLength2, 256017550, false, (String) objArr77[0], null);
                }
                Object[] objArr78 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).get(null);
                objArr7 = new Object[]{new int[]{((int[]) objArr78[0])[0]}, new int[1], new int[]{((int[]) objArr78[2])[0]}, (String[]) objArr78[3]};
                int iNextInt = new Random().nextInt(1036324640);
                int i95 = (((((~(796392132 | iNextInt)) | (-514386526)) * 262) - 654920538) + (((~((~iNextInt) | 796392132)) | (-514386526)) * 262)) - 1078868446;
                int i96 = (i95 << 13) ^ i95;
                int i97 = i96 ^ (i96 >>> 17);
                ((int[]) objArr7[1])[0] = i97 ^ (i97 << 5);
                context2 = context;
            } else {
                context2 = context;
                Context applicationContext3 = context2 != null ? ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context.getApplicationContext() : context2;
                Object[] objArr79 = {applicationContext3, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), -1078868446};
                byte[] bArr12 = $$d;
                Object[] objArr80 = new Object[1];
                d(bArr12[9], bArr12[330], (byte) (-bArr12[6]), objArr80);
                Class<?> cls5 = Class.forName((String) objArr80[0]);
                byte b48 = bArr12[305];
                Object[] objArr81 = new Object[1];
                d(b48, (short) (b48 | 157), bArr12[103], objArr81);
                Object[] objArr82 = (Object[]) cls5.getMethod((String) objArr81[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr79);
                if (applicationContext3 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                        char cLastIndexOf3 = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                        int i98 = 877 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int i99 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10;
                        byte[] bArr13 = $$a;
                        byte b49 = bArr13[54];
                        byte b50 = bArr13[7];
                        Object[] objArr83 = new Object[1];
                        c(b49, b50, (short) (b50 | 210), objArr83);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(cLastIndexOf3, i98, i99, 256017550, false, (String) objArr83[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, objArr82);
                    try {
                        long jLongValue9 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf11 = Long.valueOf(jLongValue9);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                            char cLastIndexOf4 = (char) (TextUtils.lastIndexOf("", '0') + 1);
                            int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 876;
                            int i100 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10;
                            byte b51 = $$a[7];
                            Object[] objArr84 = new Object[1];
                            c(b51, (byte) (b51 | 52), (short) ($$b | 130), objArr84);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(cLastIndexOf4, iResolveOpacity2, i100, 2009631821, false, (String) objArr84[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, lValueOf11);
                        Long lValueOf12 = Long.valueOf(jLongValue9 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                            int tapTimeout5 = (ViewConfiguration.getTapTimeout() >> 16) + 876;
                            int i101 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9;
                            byte b52 = (byte) ($$b >>> 1);
                            byte b53 = $$a[7];
                            Object[] objArr85 = new Object[1];
                            c(b52, b53, (short) (b53 | 141), objArr85);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(cCombineMeasuredStates, tapTimeout5, i101, 252381699, false, (String) objArr85[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, lValueOf12);
                    } catch (Exception unused6) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr82 = objArr82;
                }
                objArr7 = objArr82;
            }
            int i102 = ((int[]) objArr7[2])[0];
            int i103 = ((int[]) objArr7[0])[0];
            if (i103 != i102) {
                throw new RuntimeException(String.valueOf(i103));
            }
            int i104 = ((int[]) objArr7[1])[0];
            Object[] objArr86 = {new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i105 = ~iElapsedRealtime;
            int i106 = i104 + 176688404 + ((~(426521324 | i105)) * (-560)) + ((~(iElapsedRealtime | 527253503)) * (-560)) + (((~((-386211096) | i105)) | 285478916) * 560);
            int i107 = (i106 << 13) ^ i106;
            int i108 = i107 ^ (i107 >>> 17);
            ((int[]) objArr86[1])[0] = i108 ^ (i108 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                char tapTimeout6 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int size2 = 651 - View.MeasureSpec.getSize(0);
                int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 44;
                byte b54 = $$a[7];
                Object[] objArr87 = new Object[1];
                c(b54, (byte) (b54 | 52), (short) ($$b | 130), objArr87);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(tapTimeout6, size2, packedPositionGroup2, -459846511, false, (String) objArr87[0], null);
            }
            long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).getLong(null);
            long jLongValue10 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                int iIndexOf8 = 650 - TextUtils.indexOf((CharSequence) "", '0', 0);
                int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 44;
                byte b55 = (byte) ($$b >>> 1);
                byte b56 = $$a[7];
                Object[] objArr88 = new Object[1];
                c(b55, b56, (short) (b56 | 141), objArr88);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(packedPositionChild2, iIndexOf8, iResolveSizeAndState2, -873460649, false, (String) objArr88[0], null);
            }
            if (j4 == ((jLongValue10 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                    char cLastIndexOf5 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                    int iResolveSizeAndState3 = View.resolveSizeAndState(0, 0, 0) + 651;
                    int iLastIndexOf3 = 43 - TextUtils.lastIndexOf("", '0', 0);
                    byte b57 = $$a[7];
                    Object[] objArr89 = new Object[1];
                    c(b57, (byte) (b57 | 37), (short) 52, objArr89);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(cLastIndexOf5, iResolveSizeAndState3, iLastIndexOf3, -1595579076, false, (String) objArr89[0], null);
                }
                Object[] objArr90 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).get(null);
                objArr8 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i109 = ((int[]) objArr90[2])[0];
                int i110 = ((int[]) objArr90[0])[0];
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i111 = ~((-1044586527) | elapsedCpuTime);
                int i112 = (-50431299) + ((1040318468 | i111) * (-280)) + ((i111 | (~(1041155716 | elapsedCpuTime))) * 140);
                int i113 = ~((-4268059) | elapsedCpuTime);
                int i114 = ~elapsedCpuTime;
                int i115 = i112 + (((~(i114 | 1045423774)) | i113 | (~((-1040318469) | i114))) * 140) + 897257518;
                int i116 = (i115 << 13) ^ i115;
                int i117 = i116 ^ (i116 >>> 17);
                ((int[]) objArr8[3])[0] = i117 ^ (i117 << 5);
                i3 = 0;
            } else {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), KeyEvent.normalizeMetaState(0) + 1610, (Process.myPid() >> 22) + 26, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr91 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).newInstance(null), 897257518, num};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                    char cIndexOf5 = (char) TextUtils.indexOf("", "");
                    int iMyTid = 651 - (Process.myTid() >> 22);
                    int iKeyCodeFromString2 = 44 - KeyEvent.keyCodeFromString("");
                    byte b58 = (byte) ($$b >>> 1);
                    byte b59 = $$a[7];
                    Object[] objArr92 = new Object[1];
                    c(b58, b59, (short) (b59 | 141), objArr92);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(cIndexOf5, iMyTid, iKeyCodeFromString2, 2075921419, false, (String) objArr92[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Gravity.getAbsoluteGravity(0, 0), Gravity.getAbsoluteGravity(0, 0) + 695, 98 - View.resolveSizeAndState(0, 0, 0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 63406), TextUtils.indexOf("", "") + 793, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 83), Integer.TYPE, Integer.TYPE});
                }
                objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).invoke(null, objArr91);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                    char trimmedLength2 = (char) TextUtils.getTrimmedLength("");
                    int iIndexOf9 = TextUtils.indexOf((CharSequence) "", '0', 0) + 652;
                    int keyRepeatDelay3 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44;
                    byte b60 = $$a[7];
                    Object[] objArr93 = new Object[1];
                    c(b60, (byte) (b60 | 37), (short) 52, objArr93);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(trimmedLength2, iIndexOf9, keyRepeatDelay3, -1595579076, false, (String) objArr93[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, objArr8);
                try {
                    long jLongValue11 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf13 = Long.valueOf(jLongValue11);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                        char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int defaultSize = 651 - View.getDefaultSize(0, 0);
                        int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0) + 45;
                        byte b61 = (byte) ($$b >>> 1);
                        byte b62 = $$a[7];
                        Object[] objArr94 = new Object[1];
                        c(b61, b62, (short) (b62 | 141), objArr94);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(keyRepeatTimeout, defaultSize, bitsPerPixel3, -873460649, false, (String) objArr94[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf13);
                    Long lValueOf14 = Long.valueOf(jLongValue11 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                        char cMyTid = (char) (Process.myTid() >> 22);
                        int longPressTimeout5 = 651 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int threadPriority = 44 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte b63 = $$a[7];
                        Object[] objArr95 = new Object[1];
                        c(b63, (byte) (b63 | 52), (short) ($$b | 130), objArr95);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(cMyTid, longPressTimeout5, threadPriority, -459846511, false, (String) objArr95[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, lValueOf14);
                    i3 = 0;
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            }
            int i118 = ((int[]) objArr8[i3])[i3];
            int i119 = ((int[]) objArr8[2])[i3];
            if (i119 != i118) {
                int i120 = i3;
                ArrayList arrayList4 = new ArrayList();
                String[] strArr8 = (String[]) objArr8[1];
                if (strArr8 != null) {
                    for (int i121 = i120; i121 < strArr8.length; i121++) {
                        arrayList4.add(strArr8[i121]);
                    }
                }
                throw new RuntimeException(String.valueOf(i119));
            }
            Object[] objArr96 = new Object[4];
            int[] iArr4 = new int[1];
            objArr96[i3] = iArr4;
            int[] iArr5 = new int[1];
            objArr96[2] = iArr5;
            objArr96[3] = new int[1];
            int i122 = ((int[]) objArr8[3])[i3];
            int i123 = ((int[]) objArr8[2])[i3];
            int i124 = ((int[]) objArr8[i3])[i3];
            iArr5[i3] = i123;
            iArr4[i3] = i124;
            objArr96[1] = new String[i3];
            int i125 = ~System.identityHashCode(this);
            int i126 = i122 + (-916201771) + ((~((-30673161) | i125)) * 52) + (((~(506131175 | i125)) | (~(502700365 | i125)) | (-536804336)) * (-52)) + (((~(i125 | (-506131176))) | 472027205) * 52);
            int i127 = (i126 << 13) ^ i126;
            int i128 = i127 ^ (i127 >>> 17);
            ((int[]) objArr96[3])[0] = i128 ^ (i128 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 37567);
                int deadChar2 = KeyEvent.getDeadChar(0, 0) + 625;
                int iIndexOf10 = TextUtils.indexOf((CharSequence) "", '0') + 15;
                byte b64 = (byte) ($$b >>> 1);
                byte b65 = $$a[7];
                Object[] objArr97 = new Object[1];
                c(b64, b65, (short) (b65 | 141), objArr97);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(offsetAfter, deadChar2, iIndexOf10, -477065106, false, (String) objArr97[0], null);
            }
            long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null);
            long jLongValue12 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                char cCombineMeasuredStates2 = (char) (View.combineMeasuredStates(0, 0) + 37567);
                int longPressTimeout6 = (ViewConfiguration.getLongPressTimeout() >> 16) + 625;
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 14;
                byte b66 = $$a[7];
                byte b67 = b66;
                Object[] objArr98 = new Object[1];
                c(b67, (byte) (b67 | 52), b66, objArr98);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(cCombineMeasuredStates2, longPressTimeout6, iMakeMeasureSpec2, -976899241, false, (String) objArr98[0], null);
            }
            if (j5 == ((jLongValue12 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                    char tapTimeout7 = (char) (37567 - (ViewConfiguration.getTapTimeout() >> 16));
                    int iResolveOpacity3 = Drawable.resolveOpacity(0, 0) + 625;
                    int keyRepeatDelay4 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14;
                    byte b68 = $$a[7];
                    Object[] objArr99 = new Object[1];
                    c(b68, (byte) (b68 | 52), (short) 89, objArr99);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(tapTimeout7, iResolveOpacity3, keyRepeatDelay4, -973632554, false, (String) objArr99[0], null);
                }
                Object[] objArr100 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).get(null);
                int i129 = ((int[]) objArr100[2])[0];
                int i130 = ((int[]) objArr100[0])[0];
                String[] strArr9 = (String[]) objArr100[3];
                int[] iArr6 = {i129};
                int iIdentityHashCode8 = System.identityHashCode(this);
                int i131 = (-677398776) + (((~((-1231565916) | iIdentityHashCode8)) | 21500937) * 576) + (((~((~iIdentityHashCode8) | (-1210064979))) | 570671268) * 576) + 1636858310;
                int i132 = (i131 << 13) ^ i131;
                int i133 = i132 ^ (i132 >>> 17);
                ((int[]) objArr9[1])[0] = i133 ^ (i133 << 5);
                objArr9 = new Object[]{new int[]{i130}, new int[1], iArr6, strArr9};
                str3 = str7;
            } else {
                Context applicationContext4 = context2 != null ? ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context.getApplicationContext() : context2;
                str3 = str7;
                int iIntValue2 = ((Integer) Class.forName(str6).getMethod(str3, Object.class).invoke(null, this)).intValue();
                Object[] objArr101 = new Object[1];
                a(new char[]{8012, 7435, 33636, 11055}, new char[]{23230, 22021, 21996, 55958}, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), Color.argb(0, 0, 0, 0), new char[]{59627, 21552, 36656, 54367, 15020, 33113, 53729, 38914, 24069, 35194, 612, 57201, 11300, 26937, 13943, 45290, 38100, 1523, 55448, 36122, 10836, 32793, 22322, 33954, 26690, 48923, 9420, 37811, 21894, 47223, 2393, 452, 30265, 16677, 64305, 45488, 65486, 36963, 64716, 24606, 46578, 30871, 12678, 30655, 14786, 8204, 28657, 36587, 25008, 20637, 59098, 9104, 18916, 59540, 63031, 41541, 12070, 36870, 17427, 33615, 48836, 62967, 38339, 49643}, objArr101);
                String str11 = (String) objArr101[0];
                Object[] objArr102 = new Object[1];
                a(new char[]{8012, 7435, 33636, 11055}, new char[]{24966, 5551, 10978, 50095}, (char) KeyEvent.getDeadChar(0, 0), TextUtils.getOffsetAfter("", 0), new char[]{47303, 44922, 64220, 35884, 25359, 50049, 50661, 64771, 36934, 28828, 48269, 11783, 51296, 2845, 10596, 11882, 47132, 62501, 37458, 41719, 35091, 5954, 53412, 12199, 22710, 14211, 3704, 37081, 46251, 55020, 21474, 53363, 54024, 6566, 50139, 1175, 15222, 41904, 33363, 27156, 2376, 33069, 46392, 7249, 46018, 14082, 11629, 28798, 12931, 47257, 539, 10896, 54967, 31071, 30871, 35850, 50534, 21023, 45195, 25056, 50403, 63876, 45940, 51314}, objArr102);
                Object[] objArr103 = {applicationContext4, new String[]{str11, (String) objArr102[0]}, Integer.valueOf(iIntValue2), 17, 2137220486};
                byte[] bArr14 = $$d;
                byte b69 = (byte) (bArr14[27] - 1);
                short s = (short) (-bArr14[101]);
                Object[] objArr104 = new Object[1];
                d(b69, s, (byte) s, objArr104);
                Class<?> cls6 = Class.forName((String) objArr104[0]);
                byte b70 = bArr14[305];
                Object[] objArr105 = new Object[1];
                d(b70, (short) (b70 | 157), bArr14[103], objArr105);
                Object[] objArr106 = (Object[]) cls6.getMethod((String) objArr105[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr103);
                int i134 = ((int[]) objArr106[0])[0];
                int i135 = ((int[]) objArr106[2])[0];
                if (applicationContext4 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                        char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 37567);
                        int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 625;
                        int iArgb = 14 - Color.argb(0, 0, 0, 0);
                        byte b71 = $$a[7];
                        Object[] objArr107 = new Object[1];
                        c(b71, (byte) (b71 | 52), (short) 89, objArr107);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(cMakeMeasureSpec, pressedStateDuration2, iArgb, -973632554, false, (String) objArr107[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, objArr106);
                    try {
                        long jLongValue13 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf15 = Long.valueOf(jLongValue13);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                            char cCombineMeasuredStates3 = (char) (View.combineMeasuredStates(0, 0) + 37567);
                            int edgeSlop4 = (ViewConfiguration.getEdgeSlop() >> 16) + 625;
                            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 14;
                            byte b72 = $$a[7];
                            byte b73 = b72;
                            Object[] objArr108 = new Object[1];
                            c(b73, (byte) (b73 | 52), b72, objArr108);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(cCombineMeasuredStates3, edgeSlop4, packedPositionType, -976899241, false, (String) objArr108[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, lValueOf15);
                        Long lValueOf16 = Long.valueOf(jLongValue13 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                            char maximumDrawingCacheSize2 = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 37567);
                            int longPressTimeout7 = (ViewConfiguration.getLongPressTimeout() >> 16) + 625;
                            int i136 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13;
                            byte b74 = (byte) ($$b >>> 1);
                            byte b75 = $$a[7];
                            Object[] objArr109 = new Object[1];
                            c(b74, b75, (short) (b75 | 141), objArr109);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(maximumDrawingCacheSize2, longPressTimeout7, i136, -477065106, false, (String) objArr109[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, lValueOf16);
                    } catch (Exception unused8) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr106 = objArr106;
                }
                objArr9 = objArr106;
            }
            int i137 = ((int[]) objArr9[0])[0];
            int i138 = ((int[]) objArr9[2])[0];
            if (i138 == i137) {
                int i139 = ((int[]) objArr9[1])[0];
                int i140 = ((int[]) objArr9[2])[0];
                int i141 = ((int[]) objArr9[0])[0];
                String[] strArr10 = (String[]) objArr9[3];
                int[] iArr7 = {i140};
                int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                int i142 = ~elapsedCpuTime2;
                int i143 = i139 + 921964650 + (((~((-1155469204) | i142)) | (~((-668268918) | elapsedCpuTime2))) * 210) + (((~(elapsedCpuTime2 | (-1074464387))) | (~(i142 | (-587264101)))) * 210);
                int i144 = (i143 << 13) ^ i143;
                int i145 = i144 ^ (i144 >>> 17);
                ((int[]) objArr10[1])[0] = i145 ^ (i145 << 5);
                objArr10 = new Object[]{new int[]{i141}, new int[1], iArr7, strArr10};
            } else {
                ArrayList arrayList5 = new ArrayList();
                String[] strArr11 = (String[]) objArr9[3];
                if (strArr11 != null) {
                    for (String str12 : strArr11) {
                        arrayList5.add(str12);
                    }
                }
                Toast.makeText((Context) null, i138 / (((i138 - 1) * i138) % 2), 0).show();
                int i146 = ((int[]) objArr9[1])[0];
                int i147 = ((int[]) objArr9[2])[0];
                int i148 = ((int[]) objArr9[0])[0];
                String[] strArr12 = (String[]) objArr9[3];
                int[] iArr8 = {i147};
                int iIdentityHashCode9 = System.identityHashCode(this);
                int i149 = ~iIdentityHashCode9;
                int i150 = i146 + 266699752 + ((~(748363207 | i149)) * (-560)) + ((~(iIdentityHashCode9 | (-1073799681))) * (-560)) + (((~(1075374913 | i149)) | 746787974) * 560);
                int i151 = i150 ^ (i150 << 13);
                int i152 = i151 ^ (i151 >>> 17);
                ((int[]) objArr10[1])[0] = i152 ^ (i152 << 5);
                objArr10 = new Object[]{new int[]{i148}, new int[1], iArr8, strArr12};
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int fadingEdgeLength3 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2267;
                int maxKeyCode3 = (KeyEvent.getMaxKeyCode() >> 16) + 33;
                byte b76 = $$a[7];
                Object[] objArr110 = new Object[1];
                c(b76, (byte) (b76 | 52), (short) 89, objArr110);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(doubleTapTimeout, fadingEdgeLength3, maxKeyCode3, -887667012, false, (String) objArr110[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                    char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 2267;
                    int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 33;
                    byte b77 = $$a[7];
                    Object[] objArr111 = new Object[1];
                    c(b77, (byte) (b77 | 37), (short) 52, objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(minimumFlingVelocity2, absoluteGravity2, iNormalizeMetaState2, -654680577, false, (String) objArr111[0], null);
                }
                Object[] objArr112 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).get(null);
                objArr11 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i153 = ((int[]) objArr112[0])[0];
                int i154 = ((int[]) objArr112[3])[0];
                String[] strArr13 = (String[]) objArr112[1];
                int iIdentityHashCode10 = System.identityHashCode(this);
                int i155 = ~iIdentityHashCode10;
                int i156 = ((((-1423784170) + ((523499475 | i155) * (-369))) + (((~((-285279697) | i155)) | 523433619) * (-369))) + ((((~(iIdentityHashCode10 | 285279696)) | 238219779) | (~(i155 | (-65857)))) * 369)) - 1776298745;
                int i157 = (i156 << 13) ^ i156;
                int i158 = i157 ^ (i157 >>> 17);
                ((int[]) objArr11[2])[0] = i158 ^ (i158 << 5);
            } else {
                Context applicationContext5 = context2 != null ? ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context.getApplicationContext() : context2;
                Object[] objArr113 = {applicationContext5, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str3, Object.class).invoke(null, this)).intValue()), num, -1776298745};
                byte[] bArr15 = $$d;
                Object[] objArr114 = new Object[1];
                d((byte) (bArr15[10] - 1), bArr15[103], bArr15[81], objArr114);
                Class<?> cls7 = Class.forName((String) objArr114[0]);
                byte b78 = (byte) (-bArr15[6]);
                Object[] objArr115 = new Object[1];
                d(b78, (short) (b78 | 237), (byte) (-bArr15[175]), objArr115);
                Object[] objArr116 = (Object[]) cls7.getMethod((String) objArr115[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr113);
                if (applicationContext5 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                        char jumpTapTimeout2 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int edgeSlop5 = (ViewConfiguration.getEdgeSlop() >> 16) + 2267;
                        int iResolveSizeAndState4 = 33 - View.resolveSizeAndState(0, 0, 0);
                        byte b79 = $$a[7];
                        Object[] objArr117 = new Object[1];
                        c(b79, (byte) (b79 | 37), (short) 52, objArr117);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(jumpTapTimeout2, edgeSlop5, iResolveSizeAndState4, -654680577, false, (String) objArr117[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).set(null, objArr116);
                    try {
                        long jLongValue14 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf17 = Long.valueOf(jLongValue14);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                            char fadingEdgeLength4 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int i159 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2267;
                            int iArgb2 = 33 - Color.argb(0, 0, 0, 0);
                            byte b80 = $$a[7];
                            byte b81 = b80;
                            Object[] objArr118 = new Object[1];
                            c(b81, (byte) (b81 | 52), b80, objArr118);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(fadingEdgeLength4, i159, iArgb2, -874156483, false, (String) objArr118[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).set(null, lValueOf17);
                        Long lValueOf18 = Long.valueOf(jLongValue14 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                            char defaultSize2 = (char) View.getDefaultSize(0, 0);
                            int bitsPerPixel4 = 2266 - ImageFormat.getBitsPerPixel(0);
                            int deadChar3 = KeyEvent.getDeadChar(0, 0) + 33;
                            byte b82 = $$a[7];
                            Object[] objArr119 = new Object[1];
                            c(b82, (byte) (b82 | 52), (short) 89, objArr119);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(defaultSize2, bitsPerPixel4, deadChar3, -887667012, false, (String) objArr119[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, lValueOf18);
                    } catch (Exception unused9) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr116 = objArr116;
                }
                objArr11 = objArr116;
            }
            int i160 = ((int[]) objArr11[3])[0];
            int i161 = ((int[]) objArr11[0])[0];
            if (i161 != i160) {
                ArrayList arrayList6 = new ArrayList();
                String[] strArr14 = (String[]) objArr11[1];
                if (strArr14 != null) {
                    for (String str13 : strArr14) {
                        arrayList6.add(str13);
                    }
                }
                throw new RuntimeException(String.valueOf(i161));
            }
            Object[] objArr120 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i162 = ((int[]) objArr11[2])[0];
            int i163 = ((int[]) objArr11[0])[0];
            int i164 = ((int[]) objArr11[3])[0];
            String[] strArr15 = (String[]) objArr11[1];
            int i165 = ~((~((int) SystemClock.uptimeMillis())) | 1018767009);
            int i166 = i162 + ((209789473 | i165) * (-374)) + 50677145 + ((i165 | 808977536) * 374);
            int i167 = (i166 << 13) ^ i166;
            int i168 = i167 ^ (i167 >>> 17);
            ((int[]) objArr120[2])[0] = i168 ^ (i168 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                char scrollBarSize = (char) (29944 - (ViewConfiguration.getScrollBarSize() >> 8));
                int iMyTid2 = (Process.myTid() >> 22) + 1755;
                int iResolveSize = 23 - View.resolveSize(0, 0);
                byte b83 = $$a[7];
                Object[] objArr121 = new Object[1];
                c(b83, (byte) (b83 | 37), (short) 52, objArr121);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(scrollBarSize, iMyTid2, iResolveSize, 986134021, false, (String) objArr121[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                    char packedPositionGroup3 = (char) (29944 - ExpandableListView.getPackedPositionGroup(0L));
                    int iKeyCodeFromString3 = 1755 - KeyEvent.keyCodeFromString("");
                    int i169 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22;
                    byte b84 = $$a[7];
                    Object[] objArr122 = new Object[1];
                    c(b84, (byte) (b84 | 52), (short) 89, objArr122);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(packedPositionGroup3, iKeyCodeFromString3, i169, 1599039318, false, (String) objArr122[0], null);
                }
                Object[] objArr123 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).get(null);
                objArr12 = new Object[]{new int[]{((int[]) objArr123[0])[0]}, new int[]{((int[]) objArr123[1])[0]}, (Object[]) objArr123[2], new int[1], (String[]) objArr123[4]};
                int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
                int i170 = 1878469249 + ((232026698 | iMaxMemory2) * 376) + (((~((~iMaxMemory2) | 794840162)) | 9712136) * (-376)) + (((~(iMaxMemory2 | (-794840163))) | (-582237737)) * 376) + 1228843217;
                int i171 = (i170 << 13) ^ i170;
                int i172 = i171 ^ (i171 >>> 17);
                ((int[]) objArr12[3])[0] = i172 ^ (i172 << 5);
                objArr10 = objArr10;
            } else {
                int iIntValue3 = ((Integer) Class.forName(str6).getMethod(str3, Object.class).invoke(null, this)).intValue();
                Object[] objArr124 = {-1241589036};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b((char) (42049 - View.MeasureSpec.makeMeasureSpec(0, 0)), Color.rgb(0, 0, 0) + 16778942, 29 - TextUtils.indexOf("", "", 0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = RumViewScope$onStopView$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue3, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).newInstance(objArr124), 1228843217);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                    char c7 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                    int iIndexOf11 = 1754 - TextUtils.indexOf((CharSequence) "", '0');
                    int packedPositionChild3 = ExpandableListView.getPackedPositionChild(0L) + 24;
                    byte b85 = $$a[7];
                    Object[] objArr125 = new Object[1];
                    c(b85, (byte) (b85 | 52), (short) 89, objArr125);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(c7, iIndexOf11, packedPositionChild3, 1599039318, false, (String) objArr125[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    long jLongValue15 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf19 = Long.valueOf(jLongValue15);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                        char longPressTimeout8 = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29944);
                        int i173 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1755;
                        int longPressTimeout9 = (ViewConfiguration.getLongPressTimeout() >> 16) + 23;
                        byte b86 = $$a[7];
                        Object[] objArr126 = new Object[1];
                        c(b86, (byte) (b86 | 52), (short) ($$b | 130), objArr126);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(longPressTimeout8, i173, longPressTimeout9, 1596667560, false, (String) objArr126[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).set(null, lValueOf19);
                    Long lValueOf20 = Long.valueOf(jLongValue15 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                        char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 29944);
                        int iArgb3 = 1755 - Color.argb(0, 0, 0, 0);
                        int i174 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22;
                        byte b87 = $$a[7];
                        Object[] objArr127 = new Object[1];
                        c(b87, (byte) (b87 | 37), (short) 52, objArr127);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(offsetBefore, iArgb3, i174, 986134021, false, (String) objArr127[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, lValueOf20);
                    objArr12 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
                } catch (Exception unused10) {
                    throw new RuntimeException();
                }
            }
            int i175 = ((int[]) objArr12[1])[0];
            int i176 = ((int[]) objArr12[0])[0];
            if (i176 == i175) {
                int i177 = ((int[]) objArr12[3])[0];
                objArr13 = new Object[]{new int[]{((int[]) objArr12[0])[0]}, new int[]{((int[]) objArr12[1])[0]}, (Object[]) objArr12[2], new int[1], (String[]) objArr12[4]};
                int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                int i178 = i177 + 1324188022 + (((~(elapsedCpuTime3 | (-150337510))) | (-362939936)) * (-465)) + (((-150337510) | (~((-362939936) | elapsedCpuTime3))) * 930) + ((elapsedCpuTime3 | (-10487302)) * 465);
                int i179 = (i178 << 13) ^ i178;
                int i180 = i179 ^ (i179 >>> 17);
                i4 = 0;
                ((int[]) objArr13[3])[0] = i180 ^ (i180 << 5);
            } else {
                ArrayList arrayList7 = new ArrayList();
                String[] strArr16 = (String[]) objArr12[4];
                if (strArr16 != null) {
                    for (String str14 : strArr16) {
                        arrayList7.add(str14);
                    }
                }
                Toast.makeText((Context) null, i176 / (((i176 - 1) * i176) % 2), 0).show();
                int i181 = ((int[]) objArr12[3])[0];
                objArr13 = new Object[]{new int[]{((int[]) objArr12[0])[0]}, new int[]{((int[]) objArr12[1])[0]}, (Object[]) objArr12[2], new int[1], (String[]) objArr12[4]};
                int i182 = ~(((int) Runtime.getRuntime().totalMemory()) | 203708339);
                int i183 = i181 + 167333775 + (((-8894087) | i182) * (-220)) + ((i182 | (-212334520)) * 220) + 1852490950;
                int i184 = (i183 << 13) ^ i183;
                int i185 = i184 ^ (i184 >>> 17);
                i4 = 0;
                ((int[]) objArr13[3])[0] = i185 ^ (i185 << 5);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(i4);
                int iArgb4 = 1031 - Color.argb(i4, i4, i4, i4);
                int i186 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                byte b88 = $$a[7];
                byte b89 = b88;
                Object[] objArr128 = new Object[1];
                c(b89, (byte) (b89 | 52), b88, objArr128);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(cNormalizeMetaState2, iArgb4, i186, 1357589585, false, (String) objArr128[0], null);
            }
            long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).getLong(null);
            long jLongValue16 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int iIndexOf12 = TextUtils.indexOf((CharSequence) "", '0') + 1032;
                int iAxisFromString2 = MotionEvent.axisFromString("") + 16;
                byte b90 = $$a[7];
                Object[] objArr129 = new Object[1];
                c(b90, (byte) (b90 | 52), (short) 89, objArr129);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(scrollDefaultDelay, iIndexOf12, iAxisFromString2, 1344079056, false, (String) objArr129[0], null);
            }
            if (j6 == ((jLongValue16 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                    char cRed = (char) Color.red(0);
                    int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
                    int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15;
                    byte b91 = (byte) ($$b >>> 1);
                    byte b92 = $$a[7];
                    Object[] objArr130 = new Object[1];
                    c(b91, b92, (short) (b92 | 141), objArr130);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(cRed, doubleTapTimeout2, scrollDefaultDelay2, 632103528, false, (String) objArr130[0], null);
                }
                Object[] objArr131 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).get(null);
                objArr14 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i187 = ((int[]) objArr131[3])[0];
                int i188 = ((int[]) objArr131[1])[0];
                String[] strArr17 = (String[]) objArr131[0];
                int elapsedCpuTime4 = (int) Process.getElapsedCpuTime();
                int i189 = 1431975130 + (((~((~elapsedCpuTime4) | 147158468)) | (-534115823)) * (-245));
                int i190 = ~(elapsedCpuTime4 | 147158468);
                int i191 = ((i189 + (i190 * (-245))) + ((i190 | 391438638) * 245)) - 620345904;
                int i192 = (i191 << 13) ^ i191;
                int i193 = i192 ^ (i192 >>> 17);
                ((int[]) objArr14[2])[0] = i193 ^ (i193 << 5);
            } else {
                int iIntValue4 = ((Integer) Class.forName(str6).getMethod(str3, Object.class).invoke(null, this)).intValue();
                Object[] objArr132 = {-1241589036};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b((char) (Color.green(0) + 46038), 1134 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr133 = {Integer.valueOf(iIntValue4), num, -620345904, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).newInstance(objArr132), bool};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                    char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
                    int iResolveSize2 = 1031 - View.resolveSize(0, 0);
                    int i194 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                    byte b93 = $$a[7];
                    byte b94 = b93;
                    Object[] objArr134 = new Object[1];
                    c(b94, (byte) (b94 | 52), b93, objArr134);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(packedPositionType2, iResolveSize2, i194, 1298546779, false, (String) objArr134[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), ExpandableListView.getPackedPositionType(0L) + 1117, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17), Boolean.TYPE});
                }
                objArr14 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).invoke(null, objArr133);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                    char c8 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iLastIndexOf4 = 1030 - TextUtils.lastIndexOf("", '0', 0, 0);
                    int doubleTapTimeout3 = 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte b95 = (byte) ($$b >>> 1);
                    byte b96 = $$a[7];
                    Object[] objArr135 = new Object[1];
                    c(b95, b96, (short) (b96 | 141), objArr135);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(c8, iLastIndexOf4, doubleTapTimeout3, 632103528, false, (String) objArr135[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArr14);
                try {
                    long jLongValue17 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf21 = Long.valueOf(jLongValue17);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                        char cLastIndexOf6 = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                        int iNormalizeMetaState3 = KeyEvent.normalizeMetaState(0) + 1031;
                        int longPressTimeout10 = 15 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte b97 = $$a[7];
                        Object[] objArr136 = new Object[1];
                        c(b97, (byte) (b97 | 52), (short) 89, objArr136);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(cLastIndexOf6, iNormalizeMetaState3, longPressTimeout10, 1344079056, false, (String) objArr136[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                    Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                        char bitsPerPixel5 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                        int iIndexOf13 = TextUtils.indexOf((CharSequence) "", '0') + 1032;
                        int i195 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte b98 = $$a[7];
                        byte b99 = b98;
                        Object[] objArr137 = new Object[1];
                        c(b99, (byte) (b99 | 52), b98, objArr137);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(bitsPerPixel5, iIndexOf13, i195, 1357589585, false, (String) objArr137[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
            int i196 = ((int[]) objArr14[1])[0];
            int i197 = ((int[]) objArr14[3])[0];
            if (i197 == i196) {
                objArr15 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i198 = ((int[]) objArr14[2])[0];
                int i199 = ((int[]) objArr14[3])[0];
                int i200 = ((int[]) objArr14[1])[0];
                String[] strArr18 = (String[]) objArr14[0];
                int iIdentityHashCode11 = System.identityHashCode(this);
                int i201 = ~((-1004303703) | (~iIdentityHashCode11));
                int i202 = i198 + (((((-1071480319) | i201) | (~(1004303702 | iIdentityHashCode11))) * (-338)) - 1138814789) + (((~(iIdentityHashCode11 | (-67176617))) | i201) * 338);
                int i203 = (i202 << 13) ^ i202;
                int i204 = i203 ^ (i203 >>> 17);
                ((int[]) objArr15[2])[0] = i204 ^ (i204 << 5);
            } else {
                ArrayList arrayList8 = new ArrayList();
                String[] strArr19 = (String[]) objArr14[0];
                if (strArr19 != null) {
                    for (String str15 : strArr19) {
                        arrayList8.add(str15);
                    }
                }
                Toast.makeText((Context) null, i197 / (((i197 - 1) * i197) % 2), 0).show();
                objArr15 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i205 = ((int[]) objArr14[2])[0];
                int i206 = ((int[]) objArr14[3])[0];
                int i207 = ((int[]) objArr14[1])[0];
                String[] strArr20 = (String[]) objArr14[0];
                int iIdentityHashCode12 = System.identityHashCode(this);
                int i208 = 462464089 + (((~((-945767730) | iIdentityHashCode12)) | 269485104 | (~(701487559 | iIdentityHashCode12))) * (-880));
                int i209 = (~((-945767730) | (~iIdentityHashCode12))) | (-701487560);
                int i210 = ~(iIdentityHashCode12 | 945767729);
                int i211 = i205 + i208 + ((i209 | i210) * (-880)) + (i210 * 880);
                int i212 = (i211 << 13) ^ i211;
                int i213 = i212 ^ (i212 >>> 17);
                ((int[]) objArr15[2])[0] = i213 ^ (i213 << 5);
            }
            synchronized (this) {
                TopicsSyncTask topicsSyncTask = this.task;
                if (topicsSyncTask == null) {
                    return;
                }
                if (topicsSyncTask.isDeviceConnected()) {
                    if (TopicsSyncTask.isLoggable()) {
                        int i214 = ((int[]) objArr30[0])[0];
                        int i215 = i214 * i214;
                        int i216 = -(1756608191 * i214);
                        int i217 = ((i215 | i216) << 1) - (i215 ^ i216);
                        int i218 = -(i214 * (-1694258125));
                        int i219 = ((i217 | i218) << 1) - (i218 ^ i217);
                        int i220 = (i219 ^ 302943025) + ((302943025 & i219) << 1);
                        int i221 = ((i220 >> 18) - 32767) / 16384;
                        int i222 = (i221 ^ 1) + ((i221 & 1) << 1);
                        int i223 = ((i220 | i222) << 1) - (i222 ^ i220);
                        int i224 = ((i220 >> 27) - 63) / 32;
                        int i225 = -(i223 ^ ((i224 ^ 1) + ((i224 & 1) << 1)));
                        int i226 = ((i225 | 4) << 1) - (i225 ^ 4);
                        int i227 = i226 >> 24;
                        int i228 = (((i227 & (-511)) + (i227 | (-511))) / 256) + 1;
                        int i229 = 642312 / (((-(((i228 | 1) << 1) - (i228 ^ 1))) & i226) * 198);
                        int i230 = ((int[]) objArr74[1])[0];
                        int i231 = ((i230 * i230) - (~(-(1257590582 * i230)))) - 1;
                        int i232 = -(i230 * 2000432644);
                        int i233 = ((i231 | i232) << 1) - (i232 ^ i231);
                        int i234 = (i233 & 1163750473) + (1163750473 | i233);
                        int i235 = i234 >> 27;
                        int i236 = ((i235 ^ (-63)) + ((i235 & (-63)) << 1)) / 32;
                        int i237 = ((i236 | 1) << 1) - (i236 ^ 1);
                        int i238 = (i234 & i237) + (i237 | i234);
                        int i239 = i234 >> 28;
                        int i240 = -(i238 ^ ((((i239 & (-31)) + (i239 | (-31))) / 16) + 1));
                        int i241 = ((i240 | 4) << 1) - (i240 ^ 4);
                        int i242 = ((i241 >> 18) - 32767) / 16384;
                        int i243 = 1499092 / (((-(((i242 & 1) + (i242 | 1)) + 1)) & i241) * 1447);
                        int i244 = ((int[]) objArr86[1])[0];
                        int i245 = ((i244 * i244) - (~(-(941468197 * i244)))) - 1;
                        int i246 = -(i244 * 2067264101);
                        int i247 = ((i245 ^ i246) + ((i246 & i245) << 1)) - 1814618471;
                        int i248 = i247 >> 20;
                        int i249 = ((i248 & (-8191)) + (i248 | (-8191))) / 4096;
                        int i250 = (i249 & 1) + (i249 | 1);
                        int i251 = ((i247 | i250) << 1) - (i250 ^ i247);
                        int i252 = i247 >> 16;
                        int i253 = ((((-131071) | i252) << 1) - (i252 ^ (-131071))) / 65536;
                        int i254 = (-(i251 ^ ((i253 ^ 1) + ((i253 & 1) << 1)))) + 9;
                        int i255 = i254 >> 15;
                        int i256 = (((-262143) & i255) + (i255 | (-262143))) / 131072;
                        int i257 = (i256 ^ 1) + ((i256 & 1) << 1);
                        int i258 = 747936 / ((i254 & (-(((i257 | 1) << 1) - (i257 ^ 1)))) * 1696);
                        int i259 = ((int[]) objArr120[2])[0];
                        int i260 = ((((i259 * i259) - (~(-(644672537 * i259)))) - 1) - (~(-(i259 * (-994362617))))) - (-1073656063);
                        int i261 = ((i260 >> 16) - 131071) / 65536;
                        int i262 = (i260 - (~((i261 & 1) + (i261 | 1)))) - 1;
                        int i263 = i260 >> 24;
                        int i264 = (((i263 | (-511)) << 1) - (i263 ^ (-511))) / 256;
                        int i265 = -((((i264 | 1) << 1) - (i264 ^ 1)) ^ i262);
                        int i266 = ((i265 | 6) << 1) - (i265 ^ 6);
                        int i267 = i266 >> 25;
                        int i268 = (((i267 | (-255)) << 1) - (i267 ^ (-255))) / 128;
                        int i269 = (i268 ^ 1) + ((i268 & 1) << 1);
                        int i270 = 5452866 / (((-((i269 ^ 1) + ((i269 & 1) << 1))) & i266) * 1257);
                        int i271 = ((int[]) objArr13[3])[0];
                        int i272 = i271 * i271;
                        int i273 = -(1127792348 * i271);
                        int i274 = ((i272 | i273) << 1) - (i272 ^ i273);
                        int i275 = -(i271 * (-1292649624));
                        int i276 = (i274 & i275) + (i275 | i274);
                        int i277 = (i276 ^ 1014052996) + ((1014052996 & i276) << 1);
                        int i278 = i277 >> 23;
                        int i279 = ((i278 ^ (-1023)) + ((i278 & (-1023)) << 1)) / 512;
                        int i280 = ((i279 | 1) << 1) - (i279 ^ 1);
                        int i281 = ((i277 | i280) << 1) - (i280 ^ i277);
                        int i282 = i277 >> 17;
                        int i283 = ((((-65535) | i282) << 1) - (i282 ^ (-65535))) / 32768;
                        int i284 = (-(((i283 ^ 1) + ((i283 & 1) << 1)) ^ i281)) + 1;
                        int i285 = i284 >> 19;
                        int i286 = ((i285 ^ (-16383)) + ((i285 & (-16383)) << 1)) / 8192;
                        int i287 = (i286 ^ 1) + ((i286 & 1) << 1);
                        int i288 = (-2041242) / ((i284 & (-((i287 ^ 1) + ((i287 & 1) << 1)))) * 1113);
                        int i289 = ((int[]) objArr96[3])[0];
                        int i290 = i289 * i289;
                        int i291 = -(12446908 * i289);
                        int i292 = ((i290 | i291) << 1) - (i290 ^ i291);
                        int i293 = -(i289 * (-1277903964));
                        int i294 = (i292 ^ i293) + ((i293 & i292) << 1);
                        int i295 = (i294 & (-552630016)) + ((-552630016) | i294);
                        int i296 = ((i295 >> 28) - 31) / 16;
                        int i297 = ((i295 >> 29) - 15) / 8;
                        int i298 = -(((i295 - (~((i296 ^ 1) + ((i296 & 1) << 1)))) - 1) ^ ((i297 & 1) + (i297 | 1)));
                        int i299 = ((i298 | 5) << 1) - (i298 ^ 5);
                        int i300 = i299 >> 16;
                        int i301 = (((-131071) ^ i300) + ((i300 & (-131071)) << 1)) / 65536;
                        int i302 = ((i301 | 1) << 1) - (i301 ^ 1);
                        int i303 = 369460 / (((-((i302 & 1) + (i302 | 1))) & i299) * 196);
                        int i304 = ((int[]) objArr10[1])[0];
                        int i305 = i304 * i304;
                        int i306 = -(1610187239 * i304);
                        int i307 = (i305 ^ i306) + ((i305 & i306) << 1);
                        int i308 = -(i304 * 667446607);
                        int i309 = (i307 & i308) + (i308 | i307);
                        int i310 = (i309 ^ 1622964185) + ((1622964185 & i309) << 1);
                        int i311 = i310 >> 23;
                        int i312 = ((((i311 | (-1023)) << 1) - (i311 ^ (-1023))) / 512) + 1;
                        int i313 = ((i310 | i312) << 1) - (i312 ^ i310);
                        int i314 = i310 >> 22;
                        int i315 = -(i313 ^ ((((i314 & (-2047)) + (i314 | (-2047))) / 1024) + 1));
                        int i316 = (i315 ^ 4) + ((i315 & 4) << 1);
                        int i317 = i316 >> 17;
                        int i318 = ((((-65535) ^ i317) + ((i317 & (-65535)) << 1)) / 32768) + 1;
                        int i319 = 4504356 / (((-((i318 ^ 1) + ((i318 & 1) << 1))) & i316) * 1611);
                        int i320 = ((int[]) objArr15[2])[0];
                        int i321 = i320 * i320;
                        int i322 = -(708810552 * i320);
                        int i323 = (i321 ^ i322) + ((i321 & i322) << 1);
                        int i324 = -(i320 * 29671862);
                        int i325 = (i323 & i324) + (i324 | i323);
                        int i326 = (i325 ^ 764747601) + ((764747601 & i325) << 1);
                        int i327 = i326 >> 28;
                        int i328 = (((i327 | (-31)) << 1) - (i327 ^ (-31))) / 16;
                        int i329 = (i326 - (~(((i328 | 1) << 1) - (i328 ^ 1)))) - 1;
                        int i330 = ((i326 >> 18) - 32767) / 16384;
                        int i331 = -(i329 ^ (((i330 | 1) << 1) - (i330 ^ 1)));
                        int i332 = (i331 & 1) + (i331 | 1);
                        int i333 = ((i332 >> 26) + ComposerKt.defaultsKey) / 64;
                        int i334 = (i333 & 1) + (i333 | 1);
                        int i335 = (-1209324) / (((-((i334 ^ 1) + ((i334 & 1) << 1))) & i332) * 1126);
                    }
                    TopicsSubscriber topicsSubscriber = this.task.topicsSubscriber;
                    TopicsSyncTask topicsSyncTask2 = this.task;
                    int i336 = ((int[]) objArr41[1])[0];
                    int i337 = i336 * i336;
                    int i338 = -(153409040 * i336);
                    int i339 = ((i337 | i338) << 1) - (i337 ^ i338);
                    int i340 = -(i336 * 1931477600);
                    int i341 = ((i339 | i340) << 1) - (i339 ^ i340);
                    int i342 = (i341 & 211766336) + (211766336 | i341);
                    int i343 = i342 >> 17;
                    int i344 = (((-65535) & i343) + (i343 | (-65535))) / 32768;
                    int i345 = (i342 - (~((i344 & 1) + (i344 | 1)))) - 1;
                    int i346 = i342 >> 21;
                    int i347 = -(i345 ^ (((((i346 | (-4095)) << 1) - (i346 ^ (-4095))) / 2048) + 1));
                    int i348 = (i347 & 5) + (i347 | 5);
                    int i349 = i348 >> 16;
                    int i350 = (((-131071) & i349) + (i349 | (-131071))) / 65536;
                    int i351 = ((i350 | 1) << 1) - (i350 ^ 1);
                    int i352 = 1733760 / (((-(((i351 | 1) << 1) - (i351 ^ 1))) & i348) * 1548);
                    int i353 = ((int[]) objArr4[0])[0];
                    int i354 = i353 * i353;
                    int i355 = -(1469500606 * i353);
                    int i356 = (((i354 & i355) + (i354 | i355)) - (~(-(i353 * (-682872240))))) - 1;
                    int i357 = ((i356 | 380975409) << 1) - (380975409 ^ i356);
                    int i358 = i357 >> 15;
                    int i359 = (i357 - (~((((((-262143) | i358) << 1) - (i358 ^ (-262143))) / 131072) + 1))) - 1;
                    int i360 = i357 >> 21;
                    int i361 = (((i360 | (-4095)) << 1) - (i360 ^ (-4095))) / 2048;
                    int i362 = -(i359 ^ ((i361 ^ 1) + ((i361 & 1) << 1)));
                    int i363 = (i362 & 7) + (i362 | 7);
                    int i364 = ((i363 >> 28) - 31) / 16;
                    int i365 = (i364 ^ 1) + ((i364 & 1) << 1);
                    int i366 = i352 + (110250 / (((-((i365 ^ 1) + ((i365 & 1) << 1))) & i363) * 875));
                    int i367 = ((int[]) objArr63[1])[0];
                    int i368 = i367 * i367;
                    int i369 = -(1050293612 * i367);
                    int i370 = (((i368 & i369) + (i368 | i369)) - (~(-(i367 * (-273114762))))) - 1;
                    int i371 = (i370 & (-1711398943)) + ((-1711398943) | i370);
                    int i372 = i371 >> 22;
                    int i373 = (((i372 | (-2047)) << 1) - (i372 ^ (-2047))) / 1024;
                    int i374 = ((i373 | 1) << 1) - (i373 ^ 1);
                    int i375 = ((i371 | i374) << 1) - (i374 ^ i371);
                    int i376 = i371 >> 19;
                    int i377 = ((i376 ^ (-16383)) + ((i376 & (-16383)) << 1)) / 8192;
                    int i378 = (-(i375 ^ ((i377 ^ 1) + ((i377 & 1) << 1)))) + 9;
                    int i379 = ((i378 >> 17) - 65535) / 32768;
                    int i380 = (i379 ^ 1) + ((i379 & 1) << 1);
                    topicsSubscriber.scheduleSyncTaskWithDelaySeconds(topicsSyncTask2, ((long) (i366 + (791775 / ((i378 & (-((i380 & 1) + (i380 | 1)))) * 1275)))) - 311);
                    context.unregisterReceiver(this);
                    this.task = null;
                }
            }
        }

        public void registerReceiver() {
            int i = 2 % 2;
            TopicsSyncTask.isLoggable();
            TopicsSyncTask.this.context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            int i2 = b + 53;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
        }

        private static String $$g(byte b2, int i, byte b3) {
            byte[] bArr = $$c;
            int i2 = b3 * 2;
            int i3 = 4 - (b2 * 4);
            int i4 = 104 - i;
            byte[] bArr2 = new byte[i2 + 1];
            int i5 = -1;
            if (bArr == null) {
                i3++;
                i4 += -i2;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i4;
                if (i5 == i2) {
                    return new String(bArr2, 0);
                }
                i3++;
                i4 += -bArr[i3];
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isLoggable() {
        return Log.isLoggable(Constants.TAG, 3);
    }

    private static boolean hasWakeLockPermission(Context context) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        synchronized (TOPIC_SYNC_TASK_LOCK) {
            Boolean bool = hasWakeLockPermission;
            if (bool == null) {
                zBooleanValue = hasPermission(context, "android.permission.WAKE_LOCK", bool);
            } else {
                zBooleanValue = bool.booleanValue();
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            hasWakeLockPermission = boolValueOf;
            zBooleanValue2 = boolValueOf.booleanValue();
        }
        return zBooleanValue2;
    }

    private static boolean hasAccessNetworkStatePermission(Context context) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        synchronized (TOPIC_SYNC_TASK_LOCK) {
            Boolean bool = hasAccessNetworkStatePermission;
            if (bool == null) {
                zBooleanValue = hasPermission(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                zBooleanValue = bool.booleanValue();
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            hasAccessNetworkStatePermission = boolValueOf;
            zBooleanValue2 = boolValueOf.booleanValue();
        }
        return zBooleanValue2;
    }

    private static boolean hasPermission(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable(Constants.TAG, 3)) {
            createPermissionMissingLog(str);
        }
        return z;
    }

    private static String createPermissionMissingLog(String str) {
        StringBuilder sb = new StringBuilder("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb.toString();
    }
}
