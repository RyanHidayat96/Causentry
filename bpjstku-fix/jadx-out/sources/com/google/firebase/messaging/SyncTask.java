package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
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
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.material.timepicker.ClockHandView$$ExternalSyntheticLambda0;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
class SyncTask implements Runnable {
    private final FirebaseMessaging firebaseMessaging;
    private final long nextDelaySeconds;
    ExecutorService processorExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
    private final PowerManager.WakeLock syncWakeLock;

    public SyncTask(FirebaseMessaging firebaseMessaging, long j) {
        this.firebaseMessaging = firebaseMessaging;
        this.nextDelaySeconds = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getContext().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.syncWakeLock = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
            this.syncWakeLock.acquire();
        }
        try {
            this.firebaseMessaging.setSyncScheduledOrRunning(true);
            if (!this.firebaseMessaging.isGmsCorePresent()) {
                this.firebaseMessaging.setSyncScheduledOrRunning(false);
            } else if (!ServiceStarter.getInstance().hasAccessNetworkStatePermission(getContext()) || isDeviceConnected()) {
                if (maybeRefreshToken()) {
                    this.firebaseMessaging.setSyncScheduledOrRunning(false);
                } else {
                    this.firebaseMessaging.syncWithDelaySecondsInternal(this.nextDelaySeconds);
                }
            } else {
                new ConnectivityChangeReceiver(this).registerReceiver();
            }
        } catch (IOException e2) {
            e2.getMessage();
            this.firebaseMessaging.setSyncScheduledOrRunning(false);
        } finally {
            if (ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                this.syncWakeLock.release();
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class ConnectivityChangeReceiver extends BroadcastReceiver {
        private static final byte[] $$a;
        private static final int $$b;
        private static final byte[] $$d;
        private static final int $$e;
        private static long TuitionPaymentFragmentbindingInflater1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private static char[] b;
        private Context receiverContext;
        private SyncTask task;
        private static final byte[] $$c = {25, -93, -120, -48};
        private static final int $$f = 33;
        private static int $10 = 0;
        private static int $11 = 1;

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 + 84
                byte[] r0 = com.google.firebase.messaging.SyncTask.ConnectivityChangeReceiver.$$a
                int r1 = 53 - r8
                int r7 = r7 + 4
                byte[] r1 = new byte[r1]
                int r8 = 52 - r8
                r2 = 0
                if (r0 != 0) goto L13
                r6 = r7
                r4 = r8
                r3 = r2
                goto L2a
            L13:
                r3 = r2
            L14:
                byte r4 = (byte) r6
                int r7 = r7 + 1
                r1[r3] = r4
                if (r3 != r8) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L23:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r7
                r7 = r6
                r6 = r5
            L2a:
                int r4 = -r4
                int r7 = r7 + r4
                int r7 = r7 + (-11)
                r5 = r7
                r7 = r6
                r6 = r5
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.SyncTask.ConnectivityChangeReceiver.c(int, short, int, java.lang.Object[]):void");
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
        private static void d(short r5, int r6, int r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 + 4
                int r0 = 74 - r5
                byte[] r1 = com.google.firebase.messaging.SyncTask.ConnectivityChangeReceiver.$$d
                int r6 = 105 - r6
                byte[] r0 = new byte[r0]
                int r5 = 73 - r5
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
                if (r3 != r5) goto L20
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L20:
                int r3 = r3 + 1
                r4 = r1[r7]
            L24:
                int r7 = r7 + 1
                int r6 = r6 + r4
                int r6 = r6 + (-2)
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.SyncTask.ConnectivityChangeReceiver.d(short, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:47:0x01c6  */
        /* JADX WARN: Code duplicated, block: B:48:0x01c7  */
        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            float f;
            Throwable cause;
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (true) {
                f = 0.0f;
                if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                    break;
                }
                int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(b[i + i4])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2187 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 41, 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 2;
                            byte b5 = (byte) (b4 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33016 - ExpandableListView.getPackedPositionChild(0L)), 3012 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 26 - Color.green(0), 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 36505);
                                int i5 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3376;
                                int iLastIndexOf = 16 - TextUtils.lastIndexOf("", '0');
                                byte b6 = (byte) ($$f & 7);
                                byte b7 = (byte) (b6 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, i5, iLastIndexOf, -968507904, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        } catch (Throwable th) {
                            cause = th.getCause();
                            if (cause != null) {
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            char[] cArr = new char[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i6 = $11 + 43;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char jumpTapTimeout = (char) (36505 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        int i7 = 3376 - (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1));
                        int defaultSize = 17 - View.getDefaultSize(0, 0);
                        byte b8 = (byte) ($$f & 7);
                        byte b9 = (byte) (b8 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout, i7, defaultSize, -968507904, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    int i8 = 27 / 0;
                } else {
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    try {
                        Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 36506);
                            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 3376;
                            int deadChar = 17 - KeyEvent.getDeadChar(0, 0);
                            byte b10 = (byte) ($$f & 7);
                            byte b11 = (byte) (b10 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, tapTimeout, deadChar, -968507904, false, $$g(b10, b11, b11), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    } catch (Throwable th4) {
                        Throwable cause4 = th4.getCause();
                        if (cause4 == null) {
                            throw th4;
                        }
                        throw cause4;
                    }
                }
                f = 0.0f;
            }
            objArr[0] = new String(cArr);
            int i9 = $11 + 7;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 65 / 0;
            }
        }

        public ConnectivityChangeReceiver(SyncTask syncTask) {
            this.task = syncTask;
        }

        public void registerReceiver() {
            int i = 2 % 2;
            SyncTask.isDebugLogEnabled();
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            SyncTask syncTask = this.task;
            if (syncTask != null) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                Context context = syncTask.getContext();
                this.receiverContext = context;
                context.registerReceiver(this, intentFilter);
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:259:0x199a  */
        /* JADX WARN: Code duplicated, block: B:535:0x31b9  */
        /* JADX WARN: Code duplicated, block: B:536:0x31ba  */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) throws Throwable {
            Object[] objArr;
            int i;
            Throwable cause;
            Object[] objArr2;
            int i2;
            Object[] objArr3;
            Object[] objArr4;
            Context context2;
            Object obj;
            Context applicationContext;
            Object[] objArr5;
            Object[] objArr6;
            int i3;
            String str;
            Object[] objArr7;
            Object[] objArr8;
            Object obj2;
            Context applicationContext2;
            Object[] objArr9;
            Object[] objArr10;
            int i4;
            String str2;
            Object[] objArr11;
            Object[] objArr12;
            Object[] objArr13;
            int i5;
            Object[] objArr14;
            Object[] objArr15;
            int i6;
            int i7 = 2 % 2;
            Object[] objArr16 = new Object[1];
            a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 32, (Process.myTid() >> 22) + 22, (char) KeyEvent.keyCodeFromString(""), objArr16);
            String str3 = (String) objArr16[0];
            Object[] objArr17 = new Object[1];
            a(54 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 15 - (ViewConfiguration.getTapTimeout() >> 16), (char) TextUtils.getOffsetBefore("", 0), objArr17);
            String str4 = (String) objArr17[0];
            Object[] objArr18 = new Object[1];
            a(Process.myPid() >> 22, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 16, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr18);
            String str5 = (String) objArr18[0];
            Object[] objArr19 = new Object[1];
            a(17 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 17, (char) (47779 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr19);
            String str6 = (String) objArr19[0];
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) (31534 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int iIndexOf = 921 - TextUtils.indexOf("", "", 0, 0);
                int maximumDrawingCacheSize = 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                short s = $$a[28];
                Object[] objArr20 = new Object[1];
                c((byte) 14, s, (byte) (s & 52), objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iIndexOf, maximumDrawingCacheSize, -1048449946, false, (String) objArr20[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char offsetBefore = (char) (31533 - TextUtils.getOffsetBefore("", 0));
                    int i8 = 922 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int maxKeyCode = 28 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte[] bArr = $$a;
                    byte b2 = bArr[7];
                    short s2 = bArr[28];
                    Object[] objArr21 = new Object[1];
                    c(b2, s2, (byte) (s2 & 15), objArr21);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetBefore, i8, maxKeyCode, -1142834547, false, (String) objArr21[0], null);
                }
                Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[]{((int[]) objArr22[3])[0]}, (String[]) objArr22[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i9 = (-1880409900) + ((~(1073565167 | iIdentityHashCode)) * (-301)) + (((~((-802489773) | iIdentityHashCode)) | (~((~iIdentityHashCode) | 971589871))) * (-301)) + (((~(iIdentityHashCode | (-971589872))) | (-802489773)) * 301) + 751538091;
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
                i = 1;
            } else {
                try {
                    Object[] objArr23 = {context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, 751538091};
                    byte[] bArr2 = $$d;
                    Object[] objArr24 = new Object[1];
                    d(bArr2[38], bArr2[113], bArr2[5], objArr24);
                    Class<?> cls = Class.forName((String) objArr24[0]);
                    Object[] objArr25 = new Object[1];
                    d(bArr2[37], bArr2[11], (short) (-bArr2[275]), objArr25);
                    Object[] objArr26 = (Object[]) cls.getMethod((String) objArr25[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr23);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 31533);
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 921;
                        int tapTimeout = 28 - (ViewConfiguration.getTapTimeout() >> 16);
                        byte[] bArr3 = $$a;
                        byte b3 = bArr3[7];
                        short s3 = bArr3[28];
                        Object[] objArr27 = new Object[1];
                        c(b3, s3, (byte) (s3 & 15), objArr27);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(jumpTapTimeout, threadPriority, tapTimeout, -1142834547, false, (String) objArr27[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr26);
                    try {
                        long jLongValue = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cAlpha = (char) (31533 - Color.alpha(0));
                            int i12 = 920 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int i13 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                            byte b4 = $$a[7];
                            byte b5 = b4;
                            Object[] objArr28 = new Object[1];
                            c(b5, (short) (b5 | 36), b4, objArr28);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAlpha, i12, i13, -778300370, false, (String) objArr28[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cResolveSize = (char) (31533 - View.resolveSize(0, 0));
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 921;
                            int i14 = 28 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            short s4 = $$a[28];
                            Object[] objArr29 = new Object[1];
                            c((byte) 14, s4, (byte) (s4 & 52), objArr29);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSize, longPressTimeout, i14, -1048449946, false, (String) objArr29[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                        objArr = objArr26;
                        i = 1;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    th = th;
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i15 = ((int[]) objArr[i])[0];
            int i16 = ((int[]) objArr[3])[0];
            if (i16 == i15) {
                objArr2 = new Object[5];
                objArr2[0] = new int[i];
                int[] iArr = new int[i];
                objArr2[i] = iArr;
                int[] iArr2 = new int[i];
                objArr2[3] = iArr2;
                int i17 = ((int[]) objArr[0])[0];
                int i18 = ((int[]) objArr[3])[0];
                int i19 = ((int[]) objArr[i])[0];
                String[] strArr = (String[]) objArr[4];
                Object[] objArr30 = (Object[]) objArr[2];
                iArr2[0] = i18;
                iArr[0] = i19;
                objArr2[4] = strArr;
                objArr2[2] = objArr30;
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i20 = i17 + 450788725 + (((~((-3845) | iFreeMemory)) | (~((~iFreeMemory) | 1774075799))) * (-318)) + (((~(146280212 | iFreeMemory)) | 1627795587) * (-318)) + (((~(iFreeMemory | (-146280213))) | (-1627799432)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
                int i21 = (i20 << 13) ^ i20;
                int i22 = i21 ^ (i21 >>> 17);
                i2 = 0;
                ((int[]) objArr2[0])[0] = i22 ^ (i22 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr[4];
                if (strArr2 != null) {
                    for (String str7 : strArr2) {
                        arrayList.add(str7);
                    }
                }
                Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
                int i23 = ((int[]) objArr[0])[0];
                objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int i24 = ~System.identityHashCode(this);
                int i25 = ~(468604528 | i24);
                int i26 = i23 + 1404503091 + ((i25 | 1305475115) * 764) + (((~(i24 | 1305475115)) | 304088656) * (-1528)) + ((1445047899 | i25) * 764);
                int i27 = (i26 << 13) ^ i26;
                int i28 = i27 ^ (i27 >>> 17);
                i2 = 0;
                ((int[]) objArr2[0])[0] = i28 ^ (i28 << 5);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', i2) + 29945);
                int keyRepeatDelay = 1755 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int iIndexOf2 = 22 - TextUtils.indexOf((CharSequence) "", '0', i2);
                byte[] bArr4 = $$a;
                byte b6 = bArr4[7];
                short s5 = bArr4[28];
                Object[] objArr31 = new Object[1];
                c(b6, s5, (byte) (s5 & 15), objArr31);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, keyRepeatDelay, iIndexOf2, 986134021, false, (String) objArr31[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null) != -1) {
                int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i29 % 128;
                int i30 = i29 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 29944);
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1755;
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 23;
                    byte b7 = $$a[7];
                    byte b8 = b7;
                    Object[] objArr32 = new Object[1];
                    c(b8, (short) (b8 | 36), b7, objArr32);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(capsMode, pressedStateDuration, fadingEdgeLength, 1599039318, false, (String) objArr32[0], null);
                }
                Object[] objArr33 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null);
                objArr3 = new Object[]{new int[]{((int[]) objArr33[0])[0]}, new int[]{((int[]) objArr33[1])[0]}, (Object[]) objArr33[2], new int[1], (String[]) objArr33[4]};
                int i31 = (int) Runtime.getRuntime().totalMemory();
                int i32 = ((((-319580316) + ((~((-358093319) | i31)) * (-301))) + (((~(358325127 | i31)) | (~((~i31) | 570927553))) * (-301))) + (((~(i31 | (-570927554))) | 358325127) * 301)) - 2080907784;
                int i33 = (i32 << 13) ^ i32;
                int i34 = i33 ^ (i33 >>> 17);
                ((int[]) objArr3[3])[0] = i34 ^ (i34 << 5);
                int i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i35 % 128;
                int i36 = i35 % 2;
                objArr2 = objArr2;
            } else {
                int iIntValue = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr34 = {-1857213408};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 42049), 1726 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113 = ClockHandView$$ExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).newInstance(objArr34), -2080907784, false, true);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                        char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0'));
                        int longPressTimeout2 = 1755 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int longPressTimeout3 = (ViewConfiguration.getLongPressTimeout() >> 16) + 23;
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr35 = new Object[1];
                        c(b10, (short) (b10 | 36), b9, objArr35);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cLastIndexOf, longPressTimeout2, longPressTimeout3, 1599039318, false, (String) objArr35[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                    try {
                        long jLongValue2 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf3 = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                            char scrollBarSize = (char) (29944 - (ViewConfiguration.getScrollBarSize() >> 8));
                            int iIndexOf3 = TextUtils.indexOf("", "", 0, 0) + 1755;
                            int i37 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22;
                            byte b11 = $$a[7];
                            byte b12 = b11;
                            Object[] objArr36 = new Object[1];
                            c(b12, (short) (b12 | 88), b11, objArr36);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(scrollBarSize, iIndexOf3, i37, 1596667560, false, (String) objArr36[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf3);
                        Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                            char c2 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 23;
                            byte[] bArr5 = $$a;
                            byte b13 = bArr5[7];
                            short s6 = bArr5[28];
                            Object[] objArr37 = new Object[1];
                            c(b13, s6, (byte) (s6 & 15), objArr37);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c2, scrollDefaultDelay, iKeyCodeFromString, 986134021, false, (String) objArr37[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf4);
                        objArr3 = objArrTuitionPaymentFragmentbindingInflater1$7879113;
                    } catch (Exception unused2) {
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
            int i38 = ((int[]) objArr3[1])[0];
            int i39 = ((int[]) objArr3[0])[0];
            if (i39 != i38) {
                int i40 = 0;
                ArrayList arrayList2 = new ArrayList();
                String[] strArr3 = (String[]) objArr3[4];
                if (strArr3 != null) {
                    int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i41 % 128;
                    int i42 = i41 % 2;
                    while (i40 < strArr3.length) {
                        int i43 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i43 % 128;
                        if (i43 % 2 == 0) {
                            arrayList2.add(strArr3[i40]);
                            i40 += 5;
                        } else {
                            arrayList2.add(strArr3[i40]);
                            i40++;
                        }
                    }
                }
                throw new RuntimeException(String.valueOf(i39));
            }
            int i44 = ((int[]) objArr3[3])[0];
            Object[] objArr38 = {new int[]{((int[]) objArr3[0])[0]}, new int[]{((int[]) objArr3[1])[0]}, (Object[]) objArr3[2], new int[1], (String[]) objArr3[4]};
            int iMyTid = Process.myTid();
            int i45 = i44 + 950188177 + (((~(882922733 | iMyTid)) | 55837202 | (~((-670320308) | iMyTid))) * (-744)) + (((~iMyTid) | 268439628) * 744) + ((iMyTid | (-55837203)) * 744);
            int i46 = (i45 << 13) ^ i45;
            int i47 = i46 ^ (i46 >>> 17);
            ((int[]) objArr38[3])[0] = i47 ^ (i47 << 5);
            int i48 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i48 % 128;
            int i49 = i48 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c3 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int iKeyCodeFromString2 = 1031 - KeyEvent.keyCodeFromString("");
                int keyRepeatTimeout = 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                byte b14 = $$a[7];
                byte b15 = b14;
                Object[] objArr39 = new Object[1];
                c(b15, (short) (b15 | 140), b14, objArr39);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, iKeyCodeFromString2, keyRepeatTimeout, 1357589585, false, (String) objArr39[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null);
            long jLongValue3 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char mode = (char) View.MeasureSpec.getMode(0);
                int minimumFlingVelocity = 1031 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15;
                byte b16 = $$a[7];
                byte b17 = b16;
                Object[] objArr40 = new Object[1];
                c(b17, (short) (b17 | 36), b16, objArr40);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(mode, minimumFlingVelocity, scrollBarFadeDuration, 1344079056, false, (String) objArr40[0], null);
            }
            if (j == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char longPressTimeout4 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iLastIndexOf = 1030 - TextUtils.lastIndexOf("", '0', 0, 0);
                    int iAlpha = Color.alpha(0) + 15;
                    short s7 = $$a[28];
                    Object[] objArr41 = new Object[1];
                    c((byte) 14, s7, (byte) (s7 & 52), objArr41);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(longPressTimeout4, iLastIndexOf, iAlpha, 632103528, false, (String) objArr41[0], null);
                }
                Object[] objArr42 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).get(null);
                objArr4 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i50 = ((int[]) objArr42[3])[0];
                int i51 = ((int[]) objArr42[1])[0];
                String[] strArr4 = (String[]) objArr42[0];
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i52 = 462464089 + (((~((-338092483) | iIdentityHashCode2)) | 270565762 | (~(93812312 | iIdentityHashCode2))) * (-880));
                int i53 = (~((-338092483) | (~iIdentityHashCode2))) | (-93812313);
                int i54 = ~(iIdentityHashCode2 | 338092482);
                int i55 = ((i52 + ((i53 | i54) * (-880))) + (i54 * 880)) - 1734071370;
                int i56 = (i55 << 13) ^ i55;
                int i57 = i56 ^ (i56 >>> 17);
                ((int[]) objArr4[2])[0] = i57 ^ (i57 << 5);
            } else {
                int iIntValue2 = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
                Object[] objArr43 = {-1857213408};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 46038), TextUtils.getOffsetAfter("", 0) + 1134, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr44 = {Integer.valueOf(iIntValue2), 0, -1734071370, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).newInstance(objArr43), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                    char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int iArgb = Color.argb(0, 0, 0, 0) + 1031;
                    int mirror = '?' - AndroidCharacter.getMirror('0');
                    byte b18 = $$a[7];
                    byte b19 = b18;
                    Object[] objArr45 = new Object[1];
                    c(b19, (short) (b19 | 140), b18, objArr45);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(scrollDefaultDelay2, iArgb, mirror, 1298546779, false, (String) objArr45[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getScrollBarSize() >> 8) + 1117, ((byte) KeyEvent.getModifierMetaStateMask()) + 18), Boolean.TYPE});
                }
                objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr44);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                    char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                    int iMyPid = (Process.myPid() >> 22) + 1031;
                    int modifierMetaStateMask = 14 - ((byte) KeyEvent.getModifierMetaStateMask());
                    short s8 = $$a[28];
                    Object[] objArr46 = new Object[1];
                    c((byte) 14, s8, (byte) (s8 & 52), objArr46);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cLastIndexOf2, iMyPid, modifierMetaStateMask, 632103528, false, (String) objArr46[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, objArr4);
                try {
                    long jLongValue4 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue4);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                        char c4 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int longPressTimeout5 = (ViewConfiguration.getLongPressTimeout() >> 16) + 1031;
                        int size = 15 - View.MeasureSpec.getSize(0);
                        byte b20 = $$a[7];
                        byte b21 = b20;
                        Object[] objArr47 = new Object[1];
                        c(b21, (short) (b21 | 36), b20, objArr47);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(c4, longPressTimeout5, size, 1344079056, false, (String) objArr47[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                        char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int i58 = 1032 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 15;
                        byte b22 = $$a[7];
                        byte b23 = b22;
                        Object[] objArr48 = new Object[1];
                        c(b23, (short) (b23 | 140), b22, objArr48);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(tapTimeout2, i58, iResolveOpacity, 1357589585, false, (String) objArr48[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, lValueOf6);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            }
            int i59 = ((int[]) objArr4[1])[0];
            int i60 = ((int[]) objArr4[3])[0];
            if (i60 != i59) {
                ArrayList arrayList3 = new ArrayList();
                String[] strArr5 = (String[]) objArr4[0];
                if (strArr5 != null) {
                    for (String str8 : strArr5) {
                        arrayList3.add(str8);
                    }
                }
                throw new RuntimeException(String.valueOf(i60));
            }
            Object[] objArr49 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i61 = ((int[]) objArr4[2])[0];
            int i62 = ((int[]) objArr4[3])[0];
            int i63 = ((int[]) objArr4[1])[0];
            String[] strArr6 = (String[]) objArr4[0];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i64 = ~iIdentityHashCode3;
            int i65 = i61 + (-1016454471) + ((~(736832497 | i64)) * (-560)) + ((~(iIdentityHashCode3 | 1073474551)) * (-560)) + (((~((-492552328) | i64)) | 155910273) * 560);
            int i66 = (i65 << 13) ^ i65;
            int i67 = i66 ^ (i66 >>> 17);
            ((int[]) objArr49[2])[0] = i67 ^ (i67 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char fadingEdgeLength2 = (char) (53893 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                int iRgb = Color.rgb(0, 0, 0) + 16778536;
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 37;
                short s9 = $$a[28];
                Object[] objArr50 = new Object[1];
                c((byte) 14, s9, (byte) (s9 & 52), objArr50);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(fadingEdgeLength2, iRgb, iLastIndexOf2, -1433084963, false, (String) objArr50[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                    char maxKeyCode2 = (char) (53893 - (KeyEvent.getMaxKeyCode() >> 16));
                    int iLastIndexOf3 = 1319 - TextUtils.lastIndexOf("", '0');
                    int i68 = 37 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte b24 = $$a[7];
                    byte b25 = b24;
                    Object[] objArr51 = new Object[1];
                    c(b25, (short) (b25 | 36), b24, objArr51);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(maxKeyCode2, iLastIndexOf3, i68, -1920778747, false, (String) objArr51[0], null);
                }
                Object[] objArr52 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).get(null);
                objArr5 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                int i69 = ((int[]) objArr52[0])[0];
                int i70 = ((int[]) objArr52[3])[0];
                String[] strArr7 = (String[]) objArr52[2];
                int iIdentityHashCode4 = System.identityHashCode(this);
                int i71 = ~iIdentityHashCode4;
                int i72 = ((((-1479843780) + (((~((-958227685) | i71)) | (~((-412400141) | iIdentityHashCode4))) * 217)) + (((~(iIdentityHashCode4 | (-958227685))) | 403972100) * 217)) + (((~((-412400141) | i71)) | 958227684) * 217)) - 74454419;
                int i73 = (i72 << 13) ^ i72;
                int i74 = i73 ^ (i73 >>> 17);
                ((int[]) objArr5[1])[0] = i74 ^ (i74 << 5);
                context2 = context;
                objArr49 = objArr49;
            } else {
                context2 = context;
                if (context2 != null) {
                    int i75 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i75 % 128;
                    if (i75 % 2 == 0) {
                        boolean z = context2 instanceof ContextWrapper;
                        throw null;
                    }
                    if ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) {
                        obj = null;
                        applicationContext = null;
                    } else {
                        applicationContext = context.getApplicationContext();
                        obj = null;
                    }
                } else {
                    obj = null;
                    applicationContext = context2;
                }
                int iIntValue3 = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(obj, this)).intValue();
                Object[] objArr53 = {-1857213408};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b((char) (View.MeasureSpec.getMode(0) + 47977), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1300, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr54 = {applicationContext, "com.bpjstku", -74454419, Integer.valueOf(iIntValue3), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).newInstance(objArr53), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                    char c5 = (char) (53894 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 1320;
                    int gidForName = 35 - Process.getGidForName("");
                    byte b26 = $$a[7];
                    byte b27 = b26;
                    Object[] objArr55 = new Object[1];
                    c(b27, (short) (b27 | 36), b26, objArr55);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(c5, threadPriority2, gidForName, 819724799, false, (String) objArr55[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 57878), 1442 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 75), Boolean.TYPE});
                }
                Object[] objArr56 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).invoke(null, objArr54);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                        char cResolveOpacity = (char) (53893 - Drawable.resolveOpacity(0, 0));
                        int iNormalizeMetaState = 1320 - KeyEvent.normalizeMetaState(0);
                        int keyRepeatDelay2 = 36 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        byte b28 = $$a[7];
                        byte b29 = b28;
                        Object[] objArr57 = new Object[1];
                        c(b29, (short) (b29 | 36), b28, objArr57);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(cResolveOpacity, iNormalizeMetaState, keyRepeatDelay2, -1920778747, false, (String) objArr57[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, objArr56);
                    try {
                        long jLongValue5 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf7 = Long.valueOf(jLongValue5);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                            char pressedStateDuration2 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 53893);
                            int iIndexOf4 = 1320 - TextUtils.indexOf("", "", 0);
                            int i76 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37;
                            byte[] bArr6 = $$a;
                            byte b30 = bArr6[7];
                            short s10 = bArr6[28];
                            Object[] objArr58 = new Object[1];
                            c(b30, s10, (byte) (s10 & 15), objArr58);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(pressedStateDuration2, iIndexOf4, i76, -1273706634, false, (String) objArr58[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf7);
                        Long lValueOf8 = Long.valueOf(jLongValue5 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                            char fadingEdgeLength3 = (char) (53893 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                            int maxKeyCode3 = (KeyEvent.getMaxKeyCode() >> 16) + 1320;
                            int iBlue = 36 - Color.blue(0);
                            short s11 = $$a[28];
                            Object[] objArr59 = new Object[1];
                            c((byte) 14, s11, (byte) (s11 & 52), objArr59);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(fadingEdgeLength3, maxKeyCode3, iBlue, -1433084963, false, (String) objArr59[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, lValueOf8);
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr56 = objArr56;
                    objArr49 = objArr49;
                }
                objArr5 = objArr56;
            }
            int i77 = ((int[]) objArr5[3])[0];
            int i78 = ((int[]) objArr5[0])[0];
            if (i78 == i77) {
                objArr6 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                int i79 = ((int[]) objArr5[1])[0];
                int i80 = ((int[]) objArr5[0])[0];
                int i81 = ((int[]) objArr5[3])[0];
                String[] strArr8 = (String[]) objArr5[2];
                int iIdentityHashCode5 = System.identityHashCode(this);
                int i82 = ~iIdentityHashCode5;
                int i83 = i79 + (-989760) + (((~((-106144619) | i82)) | (~((-1264483207) | i82))) * (-867)) + (((~((-106144619) | iIdentityHashCode5)) | 38937346 | (~((-1264483207) | iIdentityHashCode5))) * (-1734)) + (((~(iIdentityHashCode5 | (-1225545861))) | (~(i82 | (-38937347))) | (~((-67207273) | iIdentityHashCode5))) * 867);
                int i84 = (i83 << 13) ^ i83;
                int i85 = i84 ^ (i84 >>> 17);
                ((int[]) objArr6[1])[0] = i85 ^ (i85 << 5);
                i3 = 0;
            } else {
                Toast.makeText((Context) null, i78 / (((i78 - 1) * i78) % 2), 0).show();
                objArr6 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                int i86 = ((int[]) objArr5[1])[0];
                int i87 = ((int[]) objArr5[0])[0];
                int i88 = ((int[]) objArr5[3])[0];
                String[] strArr9 = (String[]) objArr5[2];
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i89 = i86 + 1662743508 + (((~(iUptimeMillis | 885721585)) | (-484906240)) * (-668)) + ((885721585 | (~((-484906240) | iUptimeMillis))) * 1336) + ((iUptimeMillis | (-136582159)) * 668);
                int i90 = i89 ^ (i89 << 13);
                int i91 = i90 ^ (i90 >>> 17);
                i3 = 0;
                ((int[]) objArr6[1])[0] = i91 ^ (i91 << 5);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                char scrollBarFadeDuration2 = (char) (37567 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3) + 625;
                int trimmedLength = TextUtils.getTrimmedLength("") + 14;
                short s12 = $$a[28];
                Object[] objArr60 = new Object[1];
                c((byte) 14, s12, (byte) (s12 & 52), objArr60);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(scrollBarFadeDuration2, iMakeMeasureSpec, trimmedLength, -477065106, false, (String) objArr60[0], null);
            }
            long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).getLong(null);
            long jLongValue6 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                char cAlpha2 = (char) (Color.alpha(0) + 37567);
                int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 626;
                int packedPositionChild = 13 - ExpandableListView.getPackedPositionChild(0L);
                byte b31 = $$a[7];
                byte b32 = b31;
                Object[] objArr61 = new Object[1];
                c(b32, (short) (b32 | 140), b31, objArr61);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(cAlpha2, iIndexOf5, packedPositionChild, -976899241, false, (String) objArr61[0], null);
            }
            if (j2 == ((jLongValue6 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).getLong(null) << 52) >>> 52)) >> 12)) {
                int i92 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i92 % 128;
                int i93 = i92 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                    char cResolveOpacity2 = (char) (Drawable.resolveOpacity(0, 0) + 37567);
                    int packedPositionType = 625 - ExpandableListView.getPackedPositionType(0L);
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 14;
                    byte b33 = $$a[7];
                    byte b34 = b33;
                    Object[] objArr62 = new Object[1];
                    c(b34, (short) (b34 | 36), b33, objArr62);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(cResolveOpacity2, packedPositionType, maximumFlingVelocity, -973632554, false, (String) objArr62[0], null);
                }
                Object[] objArr63 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).get(null);
                int i94 = ((int[]) objArr63[2])[0];
                int i95 = ((int[]) objArr63[0])[0];
                String[] strArr10 = (String[]) objArr63[3];
                int[] iArr3 = {i94};
                int iIdentityHashCode6 = System.identityHashCode(this);
                int i96 = (((((~((-1540330184) | iIdentityHashCode6)) | 1261167750) * 398) - 1620764846) + (((~((~iIdentityHashCode6) | (-1540330184))) | 1261167750) * 398)) - 2047073326;
                int i97 = (i96 << 13) ^ i96;
                int i98 = i97 ^ (i97 >>> 17);
                ((int[]) objArr7[1])[0] = i98 ^ (i98 << 5);
                objArr7 = new Object[]{new int[]{i95}, new int[1], iArr3, strArr10};
                str = str4;
            } else {
                Context applicationContext3 = context2 != null ? ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context.getApplicationContext() : context2;
                int iIntValue4 = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
                Object[] objArr64 = new Object[1];
                a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 69, TextUtils.indexOf((CharSequence) "", '0', 0) + 65, (char) (19472 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr64);
                String str9 = (String) objArr64[0];
                Object[] objArr65 = new Object[1];
                a(132 - TextUtils.lastIndexOf("", '0', 0, 0), 64 - TextUtils.getCapsMode("", 0, 0), (char) (Color.argb(0, 0, 0, 0) + 33678), objArr65);
                try {
                    Object[] objArr66 = {applicationContext3, new String[]{str9, (String) objArr65[0]}, Integer.valueOf(iIntValue4), 17, -2047073326};
                    byte[] bArr7 = $$d;
                    Object[] objArr67 = new Object[1];
                    d((byte) (-bArr7[56]), bArr7[113], (short) (-bArr7[275]), objArr67);
                    Class<?> cls2 = Class.forName((String) objArr67[0]);
                    byte b35 = bArr7[24];
                    Object[] objArr68 = new Object[1];
                    d(b35, b35, (short) 120, objArr68);
                    Object[] objArr69 = (Object[]) cls2.getMethod((String) objArr68[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr66);
                    int i99 = ((int[]) objArr69[0])[0];
                    int i100 = ((int[]) objArr69[2])[0];
                    if (applicationContext3 != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                            char c6 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 37566);
                            int i101 = 626 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            int i102 = 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            byte b36 = $$a[7];
                            byte b37 = b36;
                            Object[] objArr70 = new Object[1];
                            c(b37, (short) (b37 | 36), b36, objArr70);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(c6, i101, i102, -973632554, false, (String) objArr70[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, objArr69);
                        try {
                            str = str4;
                            long jLongValue7 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf9 = Long.valueOf(jLongValue7);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                                char fadingEdgeLength4 = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 37567);
                                int iIndexOf6 = 625 - TextUtils.indexOf("", "", 0, 0);
                                int keyRepeatDelay3 = 14 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                byte b38 = $$a[7];
                                byte b39 = b38;
                                Object[] objArr71 = new Object[1];
                                c(b39, (short) (b39 | 140), b38, objArr71);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(fadingEdgeLength4, iIndexOf6, keyRepeatDelay3, -976899241, false, (String) objArr71[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, lValueOf9);
                            Long lValueOf10 = Long.valueOf(jLongValue7 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                                char c7 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 37566);
                                int i103 = 625 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                int iLastIndexOf4 = 13 - TextUtils.lastIndexOf("", '0', 0, 0);
                                short s13 = $$a[28];
                                Object[] objArr72 = new Object[1];
                                c((byte) 14, s13, (byte) (s13 & 52), objArr72);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(c7, i103, iLastIndexOf4, -477065106, false, (String) objArr72[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, lValueOf10);
                        } catch (Exception unused5) {
                            throw new RuntimeException();
                        }
                    } else {
                        objArr69 = objArr69;
                        str = str4;
                    }
                    objArr7 = objArr69;
                } catch (Throwable th3) {
                    th = th3;
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i104 = ((int[]) objArr7[0])[0];
            int i105 = ((int[]) objArr7[2])[0];
            if (i105 != i104) {
                ArrayList arrayList4 = new ArrayList();
                String[] strArr11 = (String[]) objArr7[3];
                if (strArr11 != null) {
                    for (String str10 : strArr11) {
                        arrayList4.add(str10);
                    }
                }
                throw new RuntimeException(String.valueOf(i105));
            }
            int i106 = ((int[]) objArr7[1])[0];
            int i107 = ((int[]) objArr7[2])[0];
            int i108 = ((int[]) objArr7[0])[0];
            String[] strArr12 = (String[]) objArr7[3];
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i109 = ~((-221514762) | iIdentityHashCode7);
            int i110 = ~iIdentityHashCode7;
            int i111 = i106 + (-978086840) + ((i109 | (~((-1379946711) | i110))) * 920) + (((~((-222276650) | i110)) | 221514761) * 920) + (((~(iIdentityHashCode7 | (-1379946711))) | (~((-221514762) | i110)) | (~((-761889) | iIdentityHashCode7))) * 920);
            int i112 = (i111 << 13) ^ i111;
            int i113 = i112 ^ (i112 >>> 17);
            ((int[]) objArr[1])[0] = i113 ^ (i113 << 5);
            Object[] objArr73 = {new int[]{i108}, new int[1], new int[]{i107}, strArr12};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                char c8 = (char) (43043 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int i114 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3110;
                int deadChar = 22 - KeyEvent.getDeadChar(0, 0);
                byte b40 = $$a[7];
                byte b41 = b40;
                Object[] objArr74 = new Object[1];
                c(b41, (short) (b41 | 140), b40, objArr74);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(c8, i114, deadChar, -1272852037, false, (String) objArr74[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                    char packedPositionGroup = (char) (43042 - ExpandableListView.getPackedPositionGroup(0L));
                    int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 3112;
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 22;
                    byte[] bArr8 = $$a;
                    byte b42 = bArr8[7];
                    short s14 = bArr8[28];
                    Object[] objArr75 = new Object[1];
                    c(b42, s14, (byte) (s14 & 15), objArr75);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(packedPositionGroup, modifierMetaStateMask2, iCombineMeasuredStates, 154975793, false, (String) objArr75[0], null);
                }
                Object[] objArr76 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).get(null);
                int i115 = ((int[]) objArr76[2])[0];
                int i116 = ((int[]) objArr76[1])[0];
                String[] strArr13 = (String[]) objArr76[3];
                int[] iArr4 = {i115};
                int[] iArr5 = {i116};
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i117 = (-343802979) + (((~(startElapsedRealtime | 1559855187)) | (-145176272)) * (-465)) + ((1559855187 | (~((-145176272) | startElapsedRealtime))) * 930) + ((startElapsedRealtime | (-407181)) * 465) + 533207129;
                int i118 = (i117 << 13) ^ i117;
                int i119 = i118 ^ (i118 >>> 17);
                ((int[]) objArr8[0])[0] = i119 ^ (i119 << 5);
                objArr8 = new Object[]{new int[1], iArr5, iArr4, strArr13};
                objArr73 = objArr73;
            } else {
                Object[] objArr77 = {null, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, 533207129};
                byte[] bArr9 = $$d;
                Object[] objArr78 = new Object[1];
                d((byte) (bArr9[435] - 1), bArr9[113], (short) 172, objArr78);
                Class<?> cls3 = Class.forName((String) objArr78[0]);
                Object[] objArr79 = new Object[1];
                d(bArr9[37], bArr9[11], (short) (-bArr9[275]), objArr79);
                Object[] objArr80 = (Object[]) cls3.getMethod((String) objArr79[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr77);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                    char offsetAfter = (char) (43042 - TextUtils.getOffsetAfter("", 0));
                    int i120 = 3111 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int i121 = 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte[] bArr10 = $$a;
                    byte b43 = bArr10[7];
                    short s15 = bArr10[28];
                    Object[] objArr81 = new Object[1];
                    c(b43, s15, (byte) (s15 & 15), objArr81);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(offsetAfter, i120, i121, 154975793, false, (String) objArr81[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, objArr80);
                try {
                    long jLongValue8 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                        char c9 = (char) (43043 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int iAxisFromString = 3110 - MotionEvent.axisFromString("");
                        int iKeyCodeFromString3 = 22 - KeyEvent.keyCodeFromString("");
                        byte b44 = $$a[7];
                        byte b45 = b44;
                        Object[] objArr82 = new Object[1];
                        c(b45, (short) (b45 | 36), b44, objArr82);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(c9, iAxisFromString, iKeyCodeFromString3, -1269618118, false, (String) objArr82[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue8 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                        char absoluteGravity = (char) (43042 - Gravity.getAbsoluteGravity(0, 0));
                        int threadPriority3 = ((Process.getThreadPriority(0) + 20) >> 6) + 3111;
                        int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 22;
                        byte b46 = $$a[7];
                        byte b47 = b46;
                        Object[] objArr83 = new Object[1];
                        c(b47, (short) (b47 | 140), b46, objArr83);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(absoluteGravity, threadPriority3, absoluteGravity2, -1272852037, false, (String) objArr83[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, lValueOf12);
                    objArr8 = objArr80;
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            }
            int i122 = ((int[]) objArr8[1])[0];
            int i123 = ((int[]) objArr8[2])[0];
            if (i123 != i122) {
                ArrayList arrayList5 = new ArrayList();
                String[] strArr14 = (String[]) objArr8[3];
                if (strArr14 != null) {
                    for (String str11 : strArr14) {
                        arrayList5.add(str11);
                    }
                }
                throw new RuntimeException(String.valueOf(i123));
            }
            int i124 = ((int[]) objArr8[0])[0];
            int i125 = ((int[]) objArr8[2])[0];
            int i126 = ((int[]) objArr8[1])[0];
            String[] strArr15 = (String[]) objArr8[3];
            int[] iArr6 = {i126};
            int i127 = ~((~new Random().nextInt(787157247)) | 85812998);
            int i128 = i124 + (((85731074 | i127) * (-374)) - 621924810) + ((i127 | 81924) * 374);
            int i129 = (i128 << 13) ^ i128;
            int i130 = i129 ^ (i129 >>> 17);
            ((int[]) objArr[0])[0] = i130 ^ (i130 << 5);
            Object[] objArr84 = {new int[1], iArr6, new int[]{i125}, strArr15};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                char trimmedLength2 = (char) TextUtils.getTrimmedLength("");
                int iGreen = 2267 - Color.green(0);
                int iAxisFromString2 = 32 - MotionEvent.axisFromString("");
                byte b48 = $$a[7];
                byte b49 = b48;
                Object[] objArr85 = new Object[1];
                c(b49, (short) (b49 | 36), b48, objArr85);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(trimmedLength2, iGreen, iAxisFromString2, -887667012, false, (String) objArr85[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                    char longPressTimeout6 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int edgeSlop = 2267 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 33;
                    byte[] bArr11 = $$a;
                    byte b50 = bArr11[7];
                    short s16 = bArr11[28];
                    Object[] objArr86 = new Object[1];
                    c(b50, s16, (byte) (s16 & 15), objArr86);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(longPressTimeout6, edgeSlop, offsetBefore2, -654680577, false, (String) objArr86[0], null);
                }
                Object[] objArr87 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).get(null);
                objArr9 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i131 = ((int[]) objArr87[0])[0];
                int i132 = ((int[]) objArr87[3])[0];
                String[] strArr16 = (String[]) objArr87[1];
                int iIdentityHashCode8 = System.identityHashCode(this);
                int i133 = (((-1753310829) + (((~((-778319025) | iIdentityHashCode8)) | 4457648) * 1504)) + ((~(iIdentityHashCode8 | (-773861377))) * (-1504))) - 34752885;
                int i134 = (i133 << 13) ^ i133;
                int i135 = i134 ^ (i134 >>> 17);
                ((int[]) objArr9[2])[0] = i135 ^ (i135 << 5);
                objArr84 = objArr84;
            } else {
                if (context2 == null) {
                    obj2 = null;
                    applicationContext2 = context2;
                } else if (context2 instanceof ContextWrapper) {
                    int i136 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i136 % 128;
                    if (i136 % 2 == 0) {
                        ((ContextWrapper) context2).getBaseContext();
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    if (((ContextWrapper) context2).getBaseContext() != null) {
                        obj2 = null;
                        applicationContext2 = context.getApplicationContext();
                    } else {
                        obj2 = null;
                        applicationContext2 = null;
                    }
                } else {
                    obj2 = null;
                    applicationContext2 = context.getApplicationContext();
                }
                Object[] objArr88 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(obj2, this)).intValue()), 0, -187441733};
                byte[] bArr12 = $$d;
                Object[] objArr89 = new Object[1];
                d((byte) (-bArr12[130]), bArr12[243], (short) ($$e | 149), objArr89);
                Class<?> cls4 = Class.forName((String) objArr89[0]);
                byte b51 = bArr12[24];
                Object[] objArr90 = new Object[1];
                d(b51, b51, (short) 120, objArr90);
                Object[] objArr91 = (Object[]) cls4.getMethod((String) objArr90[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr88);
                if (applicationContext2 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                        char mirror2 = (char) (AndroidCharacter.getMirror('0') - '0');
                        int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 2267;
                        int iRgb2 = Color.rgb(0, 0, 0) + 16777249;
                        byte[] bArr13 = $$a;
                        byte b52 = bArr13[7];
                        short s17 = bArr13[28];
                        Object[] objArr92 = new Object[1];
                        c(b52, s17, (byte) (s17 & 15), objArr92);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(mirror2, iNormalizeMetaState2, iRgb2, -654680577, false, (String) objArr92[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, objArr91);
                    try {
                        long jLongValue9 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf13 = Long.valueOf(jLongValue9);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                            char c10 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                            int iIndexOf7 = TextUtils.indexOf("", "", 0) + 2267;
                            int i137 = 33 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            byte b53 = $$a[7];
                            byte b54 = b53;
                            Object[] objArr93 = new Object[1];
                            c(b54, (short) (b54 | 140), b53, objArr93);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(c10, iIndexOf7, i137, -874156483, false, (String) objArr93[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, lValueOf13);
                        Long lValueOf14 = Long.valueOf(jLongValue9 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                            char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
                            int iArgb2 = Color.argb(0, 0, 0, 0) + 2267;
                            int iIndexOf8 = 32 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            byte b55 = $$a[7];
                            byte b56 = b55;
                            Object[] objArr94 = new Object[1];
                            c(b56, (short) (b56 | 36), b55, objArr94);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(capsMode2, iArgb2, iIndexOf8, -887667012, false, (String) objArr94[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf14);
                    } catch (Exception unused7) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr91 = objArr91;
                    objArr84 = objArr84;
                }
                objArr9 = objArr91;
            }
            int i138 = ((int[]) objArr9[3])[0];
            int i139 = ((int[]) objArr9[0])[0];
            if (i139 == i138) {
                objArr10 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i140 = ((int[]) objArr9[2])[0];
                int i141 = ((int[]) objArr9[0])[0];
                int i142 = ((int[]) objArr9[3])[0];
                String[] strArr17 = (String[]) objArr9[1];
                int iIdentityHashCode9 = System.identityHashCode(this);
                int i143 = ~iIdentityHashCode9;
                int i144 = i140 + (-1423784170) + (((-263329) | i143) * (-369)) + (((~((-867703621) | i143)) | (-58990305)) * (-369)) + (((~(iIdentityHashCode9 | 867703620)) | (-867966949) | (~(i143 | (-58726977)))) * 369);
                int i145 = (i144 << 13) ^ i144;
                int i146 = i145 ^ (i145 >>> 17);
                i4 = 0;
                ((int[]) objArr10[2])[0] = i146 ^ (i146 << 5);
            } else {
                ArrayList arrayList6 = new ArrayList();
                String[] strArr18 = (String[]) objArr9[1];
                if (strArr18 != null) {
                    for (String str12 : strArr18) {
                        arrayList6.add(str12);
                    }
                }
                int[] iArr7 = new int[i139];
                int i147 = i139 - 1;
                iArr7[i147] = 1;
                Toast.makeText((Context) null, iArr7[((i139 * i147) % 2) - 1], 1).show();
                objArr10 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i148 = ((int[]) objArr9[2])[0];
                int i149 = ((int[]) objArr9[0])[0];
                int i150 = ((int[]) objArr9[3])[0];
                String[] strArr19 = (String[]) objArr9[1];
                int iMyPid2 = Process.myPid();
                int i151 = ~iMyPid2;
                int i152 = ~(958910389 | i151);
                int i153 = i148 + 1398182123 + (((-972546038) | i152) * (-712)) + (((~(iMyPid2 | (-13635649))) | (~(i151 | 972546037))) * (-712)) + ((150197073 | i152) * 712);
                int i154 = (i153 << 13) ^ i153;
                int i155 = i154 ^ (i154 >>> 17);
                i4 = 0;
                ((int[]) objArr10[2])[0] = i155 ^ (i155 << 5);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                char defaultSize = (char) View.getDefaultSize(i4, i4);
                int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 877;
                int iResolveSizeAndState = 10 - View.resolveSizeAndState(i4, i4, i4);
                byte[] bArr14 = $$a;
                byte b57 = bArr14[7];
                short s18 = bArr14[28];
                Object[] objArr95 = new Object[1];
                c(b57, s18, (byte) (s18 & 15), objArr95);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(defaultSize, packedPositionChild2, iResolveSizeAndState, -1650998592, false, (String) objArr95[0], null);
            }
            long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).getLong(null);
            long jLongValue10 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                int longPressTimeout7 = (ViewConfiguration.getLongPressTimeout() >> 16) + 876;
                int packedPositionChild3 = 9 - ExpandableListView.getPackedPositionChild(0L);
                byte b58 = $$a[7];
                byte b59 = b58;
                Object[] objArr96 = new Object[1];
                c(b59, (short) (b59 | 36), b58, objArr96);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(cAxisFromString, longPressTimeout7, packedPositionChild3, 2012020043, false, (String) objArr96[0], null);
            }
            if (j3 == ((jLongValue10 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                    char mode2 = (char) View.MeasureSpec.getMode(0);
                    int iResolveSize = View.resolveSize(0, 0) + 876;
                    int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                    byte b60 = $$a[7];
                    byte b61 = b60;
                    Object[] objArr97 = new Object[1];
                    c(b61, (short) (b61 | 140), b60, objArr97);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(mode2, iResolveSize, minimumFlingVelocity2, 2012931276, false, (String) objArr97[0], null);
                }
                Object[] objArr98 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).get(null);
                objArr11 = new Object[]{new int[]{((int[]) objArr98[0])[0]}, new int[1], new int[]{((int[]) objArr98[2])[0]}, (String[]) objArr98[3]};
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i156 = ~((-205244616) | elapsedCpuTime);
                int i157 = ~elapsedCpuTime;
                int i158 = (-325321052) + ((i156 | (~((-164934387) | i157))) * (-1808)) + (((~((-69945350) | elapsedCpuTime)) | (~(i157 | (-29635121)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(elapsedCpuTime | 164934386)) | 135299266 | (~(205244615 | i157))) * TypedValues.Custom.TYPE_BOOLEAN) + 299112649;
                int i159 = (i158 << 13) ^ i158;
                int i160 = i159 ^ (i159 >>> 17);
                ((int[]) objArr11[1])[0] = i160 ^ (i160 << 5);
                str2 = str;
            } else {
                Context applicationContext4 = context2 != null ? ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context.getApplicationContext() : context2;
                Object[] objArr99 = {applicationContext4, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, 299112649};
                byte[] bArr15 = $$d;
                byte b62 = bArr15[5];
                byte b63 = b62;
                Object[] objArr100 = new Object[1];
                d(b62, b63, (short) (b63 | 260), objArr100);
                Class<?> cls5 = Class.forName((String) objArr100[0]);
                Object[] objArr101 = new Object[1];
                d(bArr15[164], bArr15[24], (short) 333, objArr101);
                Object[] objArr102 = (Object[]) cls5.getMethod((String) objArr101[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr99);
                if (applicationContext4 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                        char mode3 = (char) View.MeasureSpec.getMode(0);
                        int iIndexOf9 = 875 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        int mode4 = View.MeasureSpec.getMode(0) + 10;
                        byte b64 = $$a[7];
                        byte b65 = b64;
                        Object[] objArr103 = new Object[1];
                        c(b65, (short) (b65 | 140), b64, objArr103);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(mode3, iIndexOf9, mode4, 2012931276, false, (String) objArr103[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, objArr102);
                    try {
                        str2 = str;
                        long jLongValue11 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf15 = Long.valueOf(jLongValue11);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                            char cIndexOf2 = (char) TextUtils.indexOf("", "", 0);
                            int i161 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 875;
                            int pressedStateDuration3 = 10 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            byte b66 = $$a[7];
                            byte b67 = b66;
                            Object[] objArr104 = new Object[1];
                            c(b67, (short) (b67 | 36), b66, objArr104);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(cIndexOf2, i161, pressedStateDuration3, 2012020043, false, (String) objArr104[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, lValueOf15);
                        Long lValueOf16 = Long.valueOf(jLongValue11 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                            char cIndexOf3 = (char) TextUtils.indexOf("", "", 0, 0);
                            int i162 = 877 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10;
                            byte[] bArr16 = $$a;
                            byte b68 = bArr16[7];
                            short s19 = bArr16[28];
                            Object[] objArr105 = new Object[1];
                            c(b68, s19, (byte) (s19 & 15), objArr105);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(cIndexOf3, i162, maximumDrawingCacheSize2, -1650998592, false, (String) objArr105[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, lValueOf16);
                    } catch (Exception unused8) {
                        throw new RuntimeException();
                    }
                } else {
                    str2 = str;
                    objArr102 = objArr102;
                }
                objArr11 = objArr102;
            }
            if (((int[]) objArr11[0])[0] != ((int[]) objArr11[2])[0]) {
                throw null;
            }
            int i163 = ((int[]) objArr11[1])[0];
            Object[] objArr106 = {new int[]{((int[]) objArr11[0])[0]}, new int[1], new int[]{((int[]) objArr11[2])[0]}, (String[]) objArr11[3]};
            int iIdentityHashCode10 = System.identityHashCode(this);
            int i164 = i163 + (-843707604) + ((~(1056959487 | iIdentityHashCode10)) * 623) + (((~iIdentityHashCode10) | 940884008) * (-623)) + (((~(iIdentityHashCode10 | 1019076862)) | (~(978766633 | iIdentityHashCode10)) | (-1056959488)) * 623);
            int i165 = (i164 << 13) ^ i164;
            int i166 = i165 ^ (i165 >>> 17);
            ((int[]) objArr106[1])[0] = i166 ^ (i166 << 5);
            int i167 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i167 % 128;
            int i168 = i167 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                char cMyPid = (char) (Process.myPid() >> 22);
                int iKeyCodeFromString4 = KeyEvent.keyCodeFromString("") + 876;
                int iRgb3 = Color.rgb(0, 0, 0) + 16777226;
                Object[] objArr107 = new Object[1];
                c((byte) (-$$a[205]), (short) ($$b & 976), (byte) 42, objArr107);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(cMyPid, iKeyCodeFromString4, iRgb3, -1199417970, false, (String) objArr107[0], null);
            }
            long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).getLong(null);
            long jLongValue12 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                char cResolveSize2 = (char) View.resolveSize(0, 0);
                int tapTimeout3 = 876 - (ViewConfiguration.getTapTimeout() >> 16);
                int i169 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                Object[] objArr108 = new Object[1];
                c((byte) (-$$a[27]), (short) 202, (byte) 52, objArr108);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(cResolveSize2, tapTimeout3, i169, 254769921, false, (String) objArr108[0], null);
            }
            if (j4 == ((jLongValue12 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                    char cIndexOf4 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                    int i170 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 876;
                    int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 10;
                    byte[] bArr17 = $$a;
                    Object[] objArr109 = new Object[1];
                    c((byte) (-bArr17[205]), (short) 202, (byte) (-bArr17[81]), objArr109);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(cIndexOf4, i170, packedPositionType2, 1324201839, false, (String) objArr109[0], null);
                }
                Object[] objArr110 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).get(null);
                objArr12 = new Object[]{new int[]{((int[]) objArr110[0])[0]}, new int[1], new int[]{((int[]) objArr110[2])[0]}, (String[]) objArr110[3]};
                int iIdentityHashCode11 = System.identityHashCode(this);
                int i171 = (((143013812 + (((~(252505946 | iIdentityHashCode11)) | 275775525) * 104)) + ((~((~iIdentityHashCode11) | (-235465297))) * (-104))) + ((iIdentityHashCode11 | 292816175) * 104)) - 748435841;
                int i172 = (i171 << 13) ^ i171;
                int i173 = i172 ^ (i172 >>> 17);
                ((int[]) objArr12[1])[0] = i173 ^ (i173 << 5);
            } else {
                Object[] objArr111 = {Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), -748435841};
                byte[] bArr18 = $$d;
                Object[] objArr112 = new Object[1];
                d(bArr18[243], bArr18[113], (short) ($$e | 304), objArr112);
                Class<?> cls6 = Class.forName((String) objArr112[0]);
                byte b69 = bArr18[24];
                Object[] objArr113 = new Object[1];
                d(b69, b69, (short) 120, objArr113);
                objArr12 = (Object[]) cls6.getMethod((String) objArr113[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr111);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                    char cIndexOf5 = (char) TextUtils.indexOf("", "", 0);
                    int i174 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 876;
                    int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10;
                    byte[] bArr19 = $$a;
                    Object[] objArr114 = new Object[1];
                    c((byte) (-bArr19[205]), (short) 202, (byte) (-bArr19[81]), objArr114);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(cIndexOf5, i174, keyRepeatTimeout2, 1324201839, false, (String) objArr114[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).set(null, objArr12);
                try {
                    long jLongValue13 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue13);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                        char cAxisFromString2 = (char) (MotionEvent.axisFromString("") + 1);
                        int iIndexOf10 = 875 - TextUtils.indexOf((CharSequence) "", '0');
                        int iIndexOf11 = 10 - TextUtils.indexOf("", "");
                        Object[] objArr115 = new Object[1];
                        c((byte) (-$$a[27]), (short) 202, (byte) 52, objArr115);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(cAxisFromString2, iIndexOf10, iIndexOf11, 254769921, false, (String) objArr115[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue13 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                        char absoluteGravity3 = (char) Gravity.getAbsoluteGravity(0, 0);
                        int iLastIndexOf5 = 875 - TextUtils.lastIndexOf("", '0', 0);
                        int gidForName2 = Process.getGidForName("") + 11;
                        Object[] objArr116 = new Object[1];
                        c((byte) (-$$a[205]), (short) ($$b & 976), (byte) 42, objArr116);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(absoluteGravity3, iLastIndexOf5, gidForName2, -1199417970, false, (String) objArr116[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, lValueOf18);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            }
            int i175 = ((int[]) objArr12[2])[0];
            int i176 = ((int[]) objArr12[0])[0];
            if (i176 == i175) {
                int i177 = ((int[]) objArr12[1])[0];
                objArr13 = new Object[]{new int[]{((int[]) objArr12[0])[0]}, new int[1], new int[]{((int[]) objArr12[2])[0]}, (String[]) objArr12[3]};
                int iMyPid3 = Process.myPid();
                int i178 = i177 + (-454980592) + (((-268623953) | iMyPid3) * (-627)) + (((~(270263419 | iMyPid3)) | 310573648) * (-627)) + (((~(iMyPid3 | 310573648)) | (~((~iMyPid3) | (-270263420)))) * 627);
                int i179 = (i178 << 13) ^ i178;
                int i180 = i179 ^ (i179 >>> 17);
                i5 = 0;
                ((int[]) objArr13[1])[0] = i180 ^ (i180 << 5);
            } else {
                ArrayList arrayList7 = new ArrayList();
                String[] strArr20 = (String[]) objArr12[3];
                if (strArr20 != null) {
                    for (String str13 : strArr20) {
                        arrayList7.add(str13);
                    }
                }
                Toast.makeText((Context) null, i176 / (((i176 - 1) * i176) % 2), 0).show();
                int i181 = ((int[]) objArr12[1])[0];
                objArr13 = new Object[]{new int[]{((int[]) objArr12[0])[0]}, new int[1], new int[]{((int[]) objArr12[2])[0]}, (String[]) objArr12[3]};
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i182 = ~iMaxMemory;
                int i183 = i181 + (-1271699041) + (((~(211377740 | i182)) | (-261717614)) * 98) + (((~(i182 | (-251687970))) | 211377740 | (~(251687969 | iMaxMemory))) * (-49)) + (((~(iMaxMemory | 211377740)) | 10029644) * 49);
                int i184 = i183 ^ (i183 << 13);
                int i185 = i184 ^ (i184 >>> 17);
                i5 = 0;
                ((int[]) objArr13[1])[0] = i185 ^ (i185 << 5);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                char cIndexOf6 = (char) TextUtils.indexOf("", "", i5, i5);
                int tapTimeout4 = (ViewConfiguration.getTapTimeout() >> 16) + 876;
                int i186 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                short s20 = $$a[28];
                Object[] objArr117 = new Object[1];
                c((byte) 14, s20, (byte) (s20 & 52), objArr117);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(cIndexOf6, tapTimeout4, i186, 252381699, false, (String) objArr117[0], null);
            }
            long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).getLong(null);
            long jLongValue14 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                char c11 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i187 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 877;
                int packedPositionGroup2 = 10 - ExpandableListView.getPackedPositionGroup(0L);
                byte b70 = $$a[7];
                byte b71 = b70;
                Object[] objArr118 = new Object[1];
                c(b71, (short) (b71 | 88), b70, objArr118);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(c11, i187, packedPositionGroup2, 2009631821, false, (String) objArr118[0], null);
            }
            if (j5 == ((jLongValue14 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                    char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int i188 = 877 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 10;
                    short s21 = (short) 209;
                    Object[] objArr119 = new Object[1];
                    c($$a[10], s21, (byte) (s21 >>> 2), objArr119);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(scrollBarSize2, i188, edgeSlop2, 256017550, false, (String) objArr119[0], null);
                }
                Object[] objArr120 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).get(null);
                objArr14 = new Object[]{new int[]{((int[]) objArr120[0])[0]}, new int[1], new int[]{((int[]) objArr120[2])[0]}, (String[]) objArr120[3]};
                int iIdentityHashCode12 = System.identityHashCode(this);
                int i189 = ~iIdentityHashCode12;
                int i190 = ((((-1479418840) + ((iIdentityHashCode12 | 604012930) * 988)) + (((~(654427051 | i189)) | (-664530944)) * (-1976))) + ((((~(iIdentityHashCode12 | 614116822)) | 604012930) | (~((-614116823) | i189))) * 988)) - 140210989;
                int i191 = (i190 << 13) ^ i190;
                int i192 = i191 ^ (i191 >>> 17);
                ((int[]) objArr14[1])[0] = i192 ^ (i192 << 5);
            } else {
                Context applicationContext5 = context;
                if (applicationContext5 != null) {
                    applicationContext5 = ((applicationContext5 instanceof ContextWrapper) && ((ContextWrapper) applicationContext5).getBaseContext() == null) ? null : context.getApplicationContext();
                }
                Object[] objArr121 = {applicationContext5, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), -140210989};
                byte[] bArr20 = $$d;
                Object[] objArr122 = new Object[1];
                d(bArr20[67], bArr20[113], (short) TypedValues.CycleType.TYPE_ALPHA, objArr122);
                Class<?> cls7 = Class.forName((String) objArr122[0]);
                byte b72 = bArr20[24];
                Object[] objArr123 = new Object[1];
                d(b72, b72, (short) 465, objArr123);
                objArr14 = (Object[]) cls7.getMethod((String) objArr123[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr121);
                if (applicationContext5 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                        char cIndexOf7 = (char) TextUtils.indexOf("", "", 0);
                        int fadingEdgeLength5 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 876;
                        int i193 = 10 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        short s22 = (short) 209;
                        Object[] objArr124 = new Object[1];
                        c($$a[10], s22, (byte) (s22 >>> 2), objArr124);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(cIndexOf7, fadingEdgeLength5, i193, 256017550, false, (String) objArr124[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).set(null, objArr14);
                    try {
                        long jLongValue15 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf19 = Long.valueOf(jLongValue15);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                            char tapTimeout5 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                            int i194 = 877 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int iAxisFromString3 = MotionEvent.axisFromString("") + 11;
                            byte b73 = $$a[7];
                            byte b74 = b73;
                            Object[] objArr125 = new Object[1];
                            c(b74, (short) (b74 | 88), b73, objArr125);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(tapTimeout5, i194, iAxisFromString3, 2009631821, false, (String) objArr125[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).set(null, lValueOf19);
                        Long lValueOf20 = Long.valueOf(jLongValue15 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                            char cBlue = (char) Color.blue(0);
                            int maximumDrawingCacheSize3 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 876;
                            int i195 = 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            short s23 = $$a[28];
                            Object[] objArr126 = new Object[1];
                            c((byte) 14, s23, (byte) (s23 & 52), objArr126);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(cBlue, maximumDrawingCacheSize3, i195, 252381699, false, (String) objArr126[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, lValueOf20);
                    } catch (Exception unused10) {
                        throw new RuntimeException();
                    }
                }
            }
            if (((int[]) objArr14[0])[0] != ((int[]) objArr14[2])[0]) {
                throw null;
            }
            int i196 = ((int[]) objArr14[1])[0];
            Object[] objArr127 = {new int[]{((int[]) objArr14[0])[0]}, new int[1], new int[]{((int[]) objArr14[2])[0]}, (String[]) objArr14[3]};
            int iMyUid = Process.myUid();
            int i197 = ~iMyUid;
            int i198 = i196 + 400299292 + (((~(516387818 | i197)) | (~((-556698048) | iMyUid))) * 1900) + (((~(i197 | 556698047)) | (~(iMyUid | (-516387819)))) * (-950)) + (((~(iMyUid | 556698047)) | (~(i197 | (-516387819)))) * 950);
            int i199 = (i198 << 13) ^ i198;
            int i200 = i199 ^ (i199 >>> 17);
            ((int[]) objArr127[1])[0] = i200 ^ (i200 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                char absoluteGravity4 = (char) Gravity.getAbsoluteGravity(0, 0);
                int capsMode3 = 651 - TextUtils.getCapsMode("", 0, 0);
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44;
                byte b75 = $$a[7];
                byte b76 = b75;
                Object[] objArr128 = new Object[1];
                c(b76, (short) (b76 | 88), b75, objArr128);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(absoluteGravity4, capsMode3, doubleTapTimeout, -459846511, false, (String) objArr128[0], null);
            }
            long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).getLong(null);
            long jLongValue16 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                char jumpTapTimeout2 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i201 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651;
                int iArgb3 = Color.argb(0, 0, 0, 0) + 44;
                short s24 = $$a[28];
                Object[] objArr129 = new Object[1];
                c((byte) 14, s24, (byte) (s24 & 52), objArr129);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(jumpTapTimeout2, i201, iArgb3, -873460649, false, (String) objArr129[0], null);
            }
            if (j6 == ((jLongValue16 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                    char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 651;
                    int i202 = 45 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte[] bArr21 = $$a;
                    byte b77 = bArr21[7];
                    short s25 = bArr21[28];
                    Object[] objArr130 = new Object[1];
                    c(b77, s25, (byte) (s25 & 15), objArr130);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(doubleTapTimeout2, edgeSlop3, i202, -1595579076, false, (String) objArr130[0], null);
                }
                Object[] objArr131 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).get(null);
                objArr15 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i203 = ((int[]) objArr131[2])[0];
                int i204 = ((int[]) objArr131[0])[0];
                int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                int i205 = 2027202547 + (((~iUptimeMillis2) | 4234308) * 1324) + (((~(iUptimeMillis2 | (-513565356))) | (~(516996165 | iUptimeMillis2))) * (-1324)) + 1925627898;
                int i206 = (i205 << 13) ^ i205;
                int i207 = i206 ^ (i206 >>> 17);
                ((int[]) objArr15[3])[0] = i207 ^ (i207 << 5);
                i6 = 0;
            } else {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b((char) Color.red(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1609, 26 - KeyEvent.getDeadChar(0, 0), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr132 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).newInstance(null), 965688836, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                    char cRed = (char) Color.red(0);
                    int iBlue2 = 651 - Color.blue(0);
                    int mirror3 = '\\' - AndroidCharacter.getMirror('0');
                    short s26 = $$a[28];
                    Object[] objArr133 = new Object[1];
                    c((byte) 14, s26, (byte) (s26 & 52), objArr133);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(cRed, iBlue2, mirror3, 2075921419, false, (String) objArr133[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 695, 98 - KeyEvent.normalizeMetaState(0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63407 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 793 - ((Process.getThreadPriority(0) + 20) >> 6), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 82), Integer.TYPE, Integer.TYPE});
                }
                objArr15 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).invoke(null, objArr132);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                    char c12 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int i208 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 650;
                    int iAlpha2 = 44 - Color.alpha(0);
                    byte[] bArr22 = $$a;
                    byte b78 = bArr22[7];
                    short s27 = bArr22[28];
                    Object[] objArr134 = new Object[1];
                    c(b78, s27, (byte) (s27 & 15), objArr134);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(c12, i208, iAlpha2, -1595579076, false, (String) objArr134[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArr15);
                try {
                    long jLongValue17 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf21 = Long.valueOf(jLongValue17);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                        char capsMode4 = (char) TextUtils.getCapsMode("", 0, 0);
                        int iAlpha3 = Color.alpha(0) + 651;
                        int iNormalizeMetaState3 = 44 - KeyEvent.normalizeMetaState(0);
                        short s28 = $$a[28];
                        Object[] objArr135 = new Object[1];
                        c((byte) 14, s28, (byte) (s28 & 52), objArr135);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(capsMode4, iAlpha3, iNormalizeMetaState3, -873460649, false, (String) objArr135[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                    Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                        char c13 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int iIndexOf12 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 652;
                        int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 44;
                        byte b79 = $$a[7];
                        byte b80 = b79;
                        Object[] objArr136 = new Object[1];
                        c(b80, (short) (b80 | 88), b79, objArr136);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(c13, iIndexOf12, iResolveOpacity2, -459846511, false, (String) objArr136[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
                    i6 = 0;
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
            if (((int[]) objArr15[2])[i6] != ((int[]) objArr15[i6])[i6]) {
                ArrayList arrayList8 = new ArrayList();
                String[] strArr21 = (String[]) objArr15[1];
                if (strArr21 != null) {
                    for (String str14 : strArr21) {
                        arrayList8.add(str14);
                    }
                }
                throw null;
            }
            Object[] objArr137 = new Object[4];
            int[] iArr8 = new int[1];
            objArr137[i6] = iArr8;
            int[] iArr9 = new int[1];
            objArr137[2] = iArr9;
            objArr137[3] = new int[1];
            int i209 = ((int[]) objArr15[3])[i6];
            int i210 = ((int[]) objArr15[2])[i6];
            int i211 = ((int[]) objArr15[i6])[i6];
            iArr9[i6] = i210;
            iArr8[i6] = i211;
            objArr137[1] = new String[i6];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i212 = i209 + 1733340937 + (((~((-4194369) | (~iElapsedRealtime))) | (~((-763559) | iElapsedRealtime))) * (-272)) + (((~((-770725953) | iElapsedRealtime)) | 766531584) * (-272)) + (((~(iElapsedRealtime | 770725952)) | (-767295143)) * 272);
            int i213 = (i212 << 13) ^ i212;
            int i214 = i213 ^ (i213 >>> 17);
            ((int[]) objArr137[3])[0] = i214 ^ (i214 << 5);
            int i215 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i215 % 128;
            if (i215 % 2 == 0) {
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            SyncTask syncTask = this.task;
            if (syncTask == null || !syncTask.isDeviceConnected()) {
                return;
            }
            if (SyncTask.isDebugLogEnabled()) {
                int i216 = ((int[]) objArr38[3])[0];
                int i217 = ((i216 * i216) - (~(-(1686518956 * i216)))) - 1;
                int i218 = -(i216 * 377896620);
                int i219 = ((i217 | i218) << 1) - (i217 ^ i218);
                int i220 = ((i219 | (-1762956400)) << 1) - ((-1762956400) ^ i219);
                int i221 = ((i220 >> 18) - 32767) / 16384;
                int i222 = (i221 & 1) + (i221 | 1);
                int i223 = ((i220 | i222) << 1) - (i222 ^ i220);
                int i224 = i220 >> 28;
                int i225 = (((i224 | (-31)) << 1) - (i224 ^ (-31))) / 16;
                int i226 = (-(i223 ^ ((i225 & 1) + (i225 | 1)))) + 9;
                int i227 = ((i226 >> 26) + ComposerKt.defaultsKey) / 64;
                int i228 = 1644300 / ((i226 & (-(((i227 & 1) + (i227 | 1)) + 1))) * 1450);
                int i229 = ((int[]) objArr49[2])[0];
                int i230 = ((((i229 * i229) - (~(-(1005507798 * i229)))) - 1) - (~(-(i229 * (-1749581796))))) - 1;
                int i231 = (i230 ^ 1283583281) + ((i230 & 1283583281) << 1);
                int i232 = i231 >> 16;
                int i233 = ((((-131071) | i232) << 1) - (i232 ^ (-131071))) / 65536;
                int i234 = (i231 - (~(((i233 | 1) << 1) - (i233 ^ 1)))) - 1;
                int i235 = i231 >> 22;
                int i236 = (((i235 | (-2047)) << 1) - (i235 ^ (-2047))) / 1024;
                int i237 = -(i234 ^ ((i236 & 1) + (i236 | 1)));
                int i238 = (i237 ^ 3) + ((i237 & 3) << 1);
                int i239 = (((i238 >> 17) - 65535) / 32768) + 1;
                int i240 = 1867536 / (((-((i239 & 1) + (i239 | 1))) & i238) * 1048);
                int i241 = ((int[]) objArr73[1])[0];
                int i242 = i241 * i241;
                int i243 = -(696968805 * i241);
                int i244 = ((i242 | i243) << 1) - (i242 ^ i243);
                int i245 = -(i241 * (-726370495));
                int i246 = ((i244 | i245) << 1) - (i245 ^ i244);
                int i247 = (i246 ^ 679313897) + ((679313897 & i246) << 1);
                int i248 = i247 >> 20;
                int i249 = ((i248 & (-8191)) + (i248 | (-8191))) / 4096;
                int i250 = (i247 - (~(((i249 | 1) << 1) - (i249 ^ 1)))) - 1;
                int i251 = i247 >> 29;
                int i252 = ((i251 ^ (-15)) + ((i251 & (-15)) << 1)) / 8;
                int i253 = -(i250 ^ ((i252 & 1) + (i252 | 1)));
                int i254 = ((i253 | 6) << 1) - (i253 ^ 6);
                int i255 = ((i254 >> 27) - 63) / 32;
                int i256 = 3525984 / (((-(((i255 & 1) + (i255 | 1)) + 1)) & i254) * 1166);
                int i257 = ((int[]) objArr10[2])[0];
                int i258 = ((((i257 * i257) - (~(-(965170495 * i257)))) - 1) - (~(-(i257 * (-1076129757))))) - 1;
                int i259 = (i258 ^ 1143217761) + ((1143217761 & i258) << 1);
                int i260 = i259 >> 27;
                int i261 = ((i260 ^ (-63)) + ((i260 & (-63)) << 1)) / 32;
                int i262 = (i261 ^ 1) + ((i261 & 1) << 1);
                int i263 = -(((((i259 >> 28) - 31) / 16) + 1) ^ ((i259 ^ i262) + ((i262 & i259) << 1)));
                int i264 = (i263 & 4) + (i263 | 4);
                int i265 = i264 >> 29;
                int i266 = ((i265 & (-15)) + (i265 | (-15))) / 8;
                int i267 = (i266 & 1) + (i266 | 1);
                int i268 = 780696 / (((-((i267 ^ 1) + ((i267 & 1) << 1))) & i264) * 1549);
                int i269 = ((int[]) objArr13[1])[0];
                int i270 = i269 * i269;
                int i271 = -(649698563 * i269);
                int i272 = (i270 & i271) + (i270 | i271);
                int i273 = -(i269 * 922445265);
                int i274 = (((i272 | i273) << 1) - (i273 ^ i272)) - 1040973852;
                int i275 = (i274 - (~((((i274 >> 24) - 511) / 256) + 1))) - 1;
                int i276 = i274 >> 20;
                int i277 = -(i275 ^ (((((i276 | (-8191)) << 1) - (i276 ^ (-8191))) / 4096) + 1));
                int i278 = ((i277 | 7) << 1) - (i277 ^ 7);
                int i279 = i278 >> 15;
                int i280 = (((-262143) ^ i279) + ((i279 & (-262143)) << 1)) / 131072;
                int i281 = (i280 & 1) + (i280 | 1);
                int i282 = 7649866 / (((-(((i281 | 1) << 1) - (i281 ^ 1))) & i278) * 1154);
                int i283 = ((int[]) objArr127[1])[0];
                int i284 = i283 * i283;
                int i285 = -(892471272 * i283);
                int i286 = (i284 & i285) + (i284 | i285);
                int i287 = -(i283 * 1147713388);
                int i288 = (i286 ^ i287) + ((i287 & i286) << 1);
                int i289 = ((i288 | 168008932) << 1) - (168008932 ^ i288);
                int i290 = i289 >> 20;
                int i291 = -(((i289 - (~((((i290 ^ (-8191)) + ((i290 & (-8191)) << 1)) / 4096) + 1))) - 1) ^ ((((i289 >> 24) - 511) / 256) + 1));
                int i292 = ((i291 | 1) << 1) - (i291 ^ 1);
                int i293 = i292 >> 20;
                int i294 = 1242150 / (((-((((i293 ^ (-8191)) + ((i293 & (-8191)) << 1)) / 4096) + 2)) & i292) * 1690);
                int i295 = ((int[]) objArr137[3])[0];
                int i296 = i295 * i295;
                int i297 = -(752005057 * i295);
                int i298 = (i296 & i297) + (i296 | i297);
                int i299 = -(i295 * (-1665957029));
                int i300 = ((i298 ^ i299) + ((i299 & i298) << 1)) - 522122556;
                int i301 = i300 >> 28;
                int i302 = (((i301 | (-31)) << 1) - (i301 ^ (-31))) / 16;
                int i303 = (i302 ^ 1) + ((i302 & 1) << 1);
                int i304 = ((i300 | i303) << 1) - (i303 ^ i300);
                int i305 = i300 >> 27;
                int i306 = -(i304 ^ (((((i305 | (-63)) << 1) - (i305 ^ (-63))) / 32) + 1));
                int i307 = (i306 & 5) + (i306 | 5);
                int i308 = i307 >> 28;
                int i309 = ((i308 & (-31)) + (i308 | (-31))) / 16;
                int i310 = ((i309 | 1) << 1) - (i309 ^ 1);
                int i311 = (-28852080) / (((-(((i310 | 1) << 1) - (i310 ^ 1))) & i307) * 1912);
                int i312 = ((int[]) objArr106[1])[0];
                int i313 = i312 * i312;
                int i314 = -(523121540 * i312);
                int i315 = (i313 ^ i314) + ((i313 & i314) << 1);
                int i316 = -(i312 * (-1947124360));
                int i317 = (i315 & i316) + (i316 | i315);
                int i318 = ((i317 | 1303993860) << 1) - (1303993860 ^ i317);
                int i319 = i318 >> 21;
                int i320 = (((i319 & (-4095)) + (i319 | (-4095))) / 2048) + 1;
                int i321 = -(((i318 & i320) + (i320 | i318)) ^ ((((i318 >> 25) - 255) / 128) + 1));
                int i322 = ((i321 | 3) << 1) - (i321 ^ 3);
                int i323 = i322 >> 22;
                int i324 = (((i323 & (-2047)) + (i323 | (-2047))) / 1024) + 1;
                int i325 = 27936 / (((-((i324 & 1) + (i324 | 1))) & i322) * 776);
            }
            FirebaseMessaging firebaseMessaging = this.task.firebaseMessaging;
            SyncTask syncTask2 = this.task;
            int i326 = ((int[]) objArr2[0])[0];
            int i327 = i326 * i326;
            int i328 = -(890015090 * i326);
            int i329 = ((i327 | i328) << 1) - (i327 ^ i328);
            int i330 = -(i326 * 1950209034);
            int i331 = ((i329 | i330) << 1) - (i330 ^ i329);
            int i332 = (i331 ^ (-1909207804)) + (((-1909207804) & i331) << 1);
            int i333 = i332 >> 23;
            int i334 = ((i333 ^ (-1023)) + ((i333 & (-1023)) << 1)) / 512;
            int i335 = ((i334 | 1) << 1) - (i334 ^ 1);
            int i336 = (i332 & i335) + (i335 | i332);
            int i337 = i332 >> 18;
            int i338 = (((i337 | (-32767)) << 1) - (i337 ^ (-32767))) / 16384;
            int i339 = -((((i338 | 1) << 1) - (i338 ^ 1)) ^ i336);
            int i340 = ((i339 | 9) << 1) - (i339 ^ 9);
            int i341 = i340 >> 26;
            int i342 = ((i341 ^ ComposerKt.defaultsKey) + ((i341 & ComposerKt.defaultsKey) << 1)) / 64;
            int i343 = (i342 & 1) + (i342 | 1);
            int i344 = 7289856 / (((-((i343 ^ 1) + ((i343 & 1) << 1))) & i340) * 1792);
            int i345 = ((int[]) objArr6[1])[0];
            int i346 = ((((i345 * i345) - (~(-(1631646971 * i345)))) - 1) - (~(-(i345 * (-1832894177))))) - 1;
            int i347 = (i346 & (-1041711447)) + ((-1041711447) | i346);
            int i348 = i347 >> 19;
            int i349 = ((i348 & (-16383)) + (i348 | (-16383))) / 8192;
            int i350 = (i349 ^ 1) + ((i349 & 1) << 1);
            int i351 = (i347 & i350) + (i350 | i347);
            int i352 = i347 >> 29;
            int i353 = -(i351 ^ ((((i352 & (-15)) + (i352 | (-15))) / 8) + 1));
            int i354 = (i353 ^ 1) + ((i353 & 1) << 1);
            int i355 = i354 >> 15;
            int i356 = (((-262143) & i355) + (i355 | (-262143))) / 131072;
            int i357 = (i356 ^ 1) + ((i356 & 1) << 1);
            int i358 = i344 + (63597 / (((-((i357 ^ 1) + ((i357 & 1) << 1))) & i354) * 731));
            int i359 = ((int[]) objArr84[0])[0];
            int i360 = ((i359 * i359) - (~(-(418669625 * i359)))) - 1;
            int i361 = -(i359 * 2110391049);
            int i362 = (i360 & i361) + (i361 | i360);
            int i363 = ((i362 | (-1310225599)) << 1) - ((-1310225599) ^ i362);
            int i364 = i363 >> 29;
            int i365 = ((i364 & (-15)) + (i364 | (-15))) / 8;
            int i366 = (i363 - (~((i365 ^ 1) + ((i365 & 1) << 1)))) - 1;
            int i367 = i363 >> 26;
            int i368 = (-(i366 ^ ((((i367 ^ ComposerKt.defaultsKey) + ((i367 & ComposerKt.defaultsKey) << 1)) / 64) + 1))) + 2;
            int i369 = ((i368 >> 23) - 1023) / 512;
            int i370 = (i369 ^ 1) + ((i369 & 1) << 1);
            firebaseMessaging.enqueueTaskWithDelaySeconds(syncTask2, ((long) (i358 + (3624 / ((i368 & (-((i370 ^ 1) + ((i370 & 1) << 1)))) * 4)))) - 992);
            Context context3 = this.receiverContext;
            if (context3 != null) {
                context3.unregisterReceiver(this);
            }
            this.task = null;
        }

        static {
            byte[] bArr = new byte[521];
            System.arraycopy("1Ó\u00909\u000e\u0000Ã;\n\u0002ú\u0007ûË5\u000fø\u0010ÿüýÌAö\u0015ó\u000fùú\rÄ7\u000eÿ\u0005\u0005¾I\u0001÷\u0005ÿ\r÷þ\u0010½%&î\u000f\b÷\u0013í\u000fç ±!1õþ\u0015óß/\u000bï\u0010á\u0015\u0010\u0004ù\n\u000e\u0000Ã;\n\u0002ú\u0007ûË5\u000fø\u0010ÿüýÌ;\b\b½=\u0007\bó\u000fþõ\rÄA\u0001\u0001\u0000\rí\u0006\u000e\u0000\u0002\u0004\u0001ÂN\u0002ê\u0012#ö\r÷\b\u0001ä\u0013\u001aöú\u000b\bÔ.ñ\b\bú\u000b\b\u0001ÿ÷\u0000\bú\rÿ\u0007\u0000ÿ\u0007ù\u0001\u0014õþ\u0014Ø$÷\u0003\tú\u0003\u0003ý\u0016ù\nÀ\u000e\u0000Ã6\u0010ü\u000b\u0003ù\f»8ÿ\u0015ïÏE\u0006ò\u0012ò\u0006\u0007ûÉFõ\n\u0004\u0007óË%&ò\u0012ò\u0006\u0007ûÜ1û$\u0013÷\b\u0001Ö!\u0013ß)ñ\u000fü÷\u001aÕ\u0017\u001aø\b\u0001Ü#æ(ü\u0003ó\nê\u0016å\u0017\u001aø\b\u0001Ô(÷\bñ\u0015þ\u0014\bÁFõþ\u0004\u0013÷\u000fñ\u0015¸=\u0007\bó\u000fþõ\rÄC\u0003÷\u000fñ\u0015ý\u0005\u0003½Cõ\u0013ô\u000f\u0006í\u0003\fûË#\u0015\u0013ô\u000f\u0006í\u0003\fûà \u0004\u0007ÿÁ! \u0004\u0007ÿá'\fÿ\u0001\u0006ð\u0003\fû#ö\r÷\b\u0001ä\u0013\u001aöú\u000b\bÔ.ñ\b\bú\u000b\bð\t\u0007ø\u0007\u0007ûä'ú\b÷\u0015ó\u000fÁ\u000e\u0000ÃAþý\u0012\u0000ñ\u000f\u0007½Gó\tÅIö\u0004\u0000\r¼\u00165ö\u0005úá.\u0001ú\u0005\u0000\u000e\u0000Ã6\u0010ü\u000b\u0003ù\f»8ÿ\u0015ïÏD\u0004ÿ\u0000\u0004Á$$ÿ\u0000\u0004×\u001f\u0015ïô#ý\u0005õÁ\u0002#5þó\u000fþõ\ré(÷\böÿ\u0011÷üë\u0017\u000e÷\u0004ÿÕ#ö\r÷\b\u0001ä\u0013\u001aöú\u000b\bÔ.ñ\b\bú\u000b\b\u0001ÿ÷\u0000\bú\rÿ\u0007\u0000ÿ\u0007ù\u0001\u0014õþ\u0014Ø$÷\u0003\tú\u0003\u0003ý\u0016ù\n¿".getBytes("ISO-8859-1"), 0, bArr, 0, 521);
            $$d = bArr;
            $$e = 66;
            $$a = new byte[]{99, -43, -44, -62, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
            $$b = 227;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            b = new char[]{45558, 15336, 42432, 12226, 39398, 921, 36227, 30561, 57683, 27407, 54557, 24322, 51475, 45817, 15583, 42698, 2903, 33103, 8049, 38255, 8990, 47422, 14132, 52692, 23518, 53730, 28575, 58801, 29569, 2112, 34428, 7264, 45565, 15335, 42450, 12241, 39335, 924, 36230, 30497, 57691, 27474, 54624, 24360, 51481, 45822, 15566, 42690, 4257, 39610, 1162, 36476, 30811, 57934, 45561, 15333, 42455, 12243, 39355, 912, 36230, 30557, 57681, 27456, 54562, 24335, 51465, 45792, 15583, 64958, 30716, 59840, 25554, 54713, 20359, 49556, 15145, 44317, 10071, 39224, 4958, 34069, 65272, 28875, 60034, 23787, 55000, 18624, 49766, 13341, 44546, 8309, 39437, 3089, 33206, 64460, 28042, 59379, 22921, 54222, 17726, 48917, 12632, 43892, 7530, 38729, 2228, 33450, 62686, 28322, 57572, 23242, 52275, 18038, 47192, 12921, 42082, 7709, 37817, 1454, 32706, 61948, 27629, 56784, 22381, 51501, 17177, 46458, 12089, 41218, 6891, 36008, 1733, 12913, 47206, 9820, 44059, 6774, 32846, 3598, 62646, 25311, 59593, 22256, 56471, 19083, 12593, 48978, 9501, 37744, 6468, 34654, 3502, 64387, 24988, 61370, 21959, 50056, 20011, 13394, 41500, 10349, 38474, 7261, 35489, 28811, 65221, 25837, 54012, 22738, 51070, 19821, 15123, 41320, 12074, 38150, 931, 35257, 30615, 64999, 27642, 53723, 23668, 51761, 45060, 15924, 42111, 4687, 39075, 1769, 36057, 31458, 57585, 28319, 54563, 17202, 51551};
            TuitionPaymentFragmentbindingInflater1 = 3081855408932404105L;
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
        private static java.lang.String $$g(short r6, int r7, short r8) {
            /*
                int r7 = r7 * 4
                int r7 = 3 - r7
                int r8 = r8 * 4
                int r8 = r8 + 1
                byte[] r0 = com.google.firebase.messaging.SyncTask.ConnectivityChangeReceiver.$$c
                int r6 = r6 * 3
                int r6 = r6 + 109
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r6
                r6 = r8
                r5 = r2
                goto L29
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r6
                int r5 = r3 + 1
                r1[r3] = r4
                int r7 = r7 + 1
                if (r5 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L27:
                r3 = r0[r7]
            L29:
                int r6 = r6 + r3
                r3 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.SyncTask.ConnectivityChangeReceiver.$$g(short, int, short):java.lang.String");
        }
    }

    boolean maybeRefreshToken() throws IOException {
        try {
            return this.firebaseMessaging.blockingGetToken() != null;
        } catch (IOException e2) {
            if (GmsRpc.isErrorMessageForRetryableError(e2.getMessage())) {
                e2.getMessage();
                return false;
            }
            if (e2.getMessage() == null) {
                return false;
            }
            throw e2;
        } catch (SecurityException unused) {
            return false;
        }
    }

    Context getContext() {
        return this.firebaseMessaging.getApplicationContext();
    }

    boolean isDeviceConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getContext().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    static boolean isDebugLogEnabled() {
        return Log.isLoggable(Constants.TAG, 3);
    }
}
