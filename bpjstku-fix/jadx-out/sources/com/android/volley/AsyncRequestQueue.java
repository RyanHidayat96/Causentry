package com.android.volley;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
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
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.internal.fido.zzah;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.abortCapture;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.ByteCompanionObject;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
public class AsyncRequestQueue extends RequestQueue {
    private static final int DEFAULT_BLOCKING_THREAD_POOL_SIZE = 4;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static long b;
    private final AsyncCache mAsyncCache;
    private ExecutorService mBlockingExecutor;
    private final Object mCacheInitializationLock;
    private ExecutorFactory mExecutorFactory;
    private volatile boolean mIsCacheInitialized;
    private final AsyncNetwork mNetwork;
    private ExecutorService mNonBlockingExecutor;
    private ScheduledExecutorService mNonBlockingScheduledExecutor;
    private final List<Request<?>> mRequestsAwaitingCacheInitialization;
    private final WaitingRequestManager mWaitingRequestManager;
    private static final byte[] $$c = {42, -104, -68, 105};
    private static final int $$d = 130;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {86, -48, ByteCompanionObject.MIN_VALUE, 88};
    private static final int $$b = 193;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;

    public static abstract class ExecutorFactory {
        public abstract ExecutorService createBlockingExecutor(BlockingQueue<Runnable> blockingQueue);

        public abstract ExecutorService createNonBlockingExecutor(BlockingQueue<Runnable> blockingQueue);

        public abstract ScheduledExecutorService createNonBlockingScheduledExecutor();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.android.volley.AsyncRequestQueue.$$a
            int r6 = r6 + 97
            int r8 = r8 * 3
            int r1 = r8 + 1
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2a:
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.AsyncRequestQueue.c(short, int, short, java.lang.Object[]):void");
    }

    static /* synthetic */ void access$000(AsyncRequestQueue asyncRequestQueue) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        asyncRequestQueue.onCacheInitializationComplete();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ AsyncCache access$100(AsyncRequestQueue asyncRequestQueue) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        AsyncCache asyncCache = asyncRequestQueue.mAsyncCache;
        int i5 = i3 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return asyncCache;
        }
        throw null;
    }

    static /* synthetic */ ExecutorService access$200(AsyncRequestQueue asyncRequestQueue) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        ExecutorService executorService = asyncRequestQueue.mNonBlockingExecutor;
        int i5 = i3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return executorService;
    }

    static /* synthetic */ void access$300(AsyncRequestQueue asyncRequestQueue, Cache.Entry entry, Request request) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        asyncRequestQueue.handleEntry(entry, request);
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
    }

    static /* synthetic */ WaitingRequestManager access$400(AsyncRequestQueue asyncRequestQueue) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        WaitingRequestManager waitingRequestManager = asyncRequestQueue.mWaitingRequestManager;
        int i5 = i3 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return waitingRequestManager;
        }
        throw null;
    }

    static /* synthetic */ ExecutorService access$500(AsyncRequestQueue asyncRequestQueue) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        ExecutorService executorService = asyncRequestQueue.mBlockingExecutor;
        int i5 = i3 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
        return executorService;
    }

    static /* synthetic */ AsyncNetwork access$600(AsyncRequestQueue asyncRequestQueue) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        AsyncNetwork asyncNetwork = asyncRequestQueue.mNetwork;
        if (i3 != 0) {
            return asyncNetwork;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void access$700(AsyncRequestQueue asyncRequestQueue, Request request, Response response, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        asyncRequestQueue.finishRequest(request, response, z);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static class ThrowingCache implements Cache {
        private static short[] b;
        private static final byte[] $$a = {41, 2, 45, -60};
        private static final int $$b = 82;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asBinder = 0;
        private static int d = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 341840698;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1934795585;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1523200729;
        private static byte[] TuitionPaymentFragmentbindingInflater1 = {32, 109, -117, 105, -110, 91, 118, 105, 108, -99, 117, -68, 103, 125, -114, 36, 113, -98, 108, ByteCompanionObject.MIN_VALUE, -121, 47, 118, 105, 108, -99, 117, -68, 103, 122, 102, 83, -26, 50, 3, 9, -28, 60, -20, 54, 48, 1, -62, 55, -28, 35, -103, 54, 77, 10, 48, 104, 56, 102, 108, -111, 76, 33, 53, -84, -12, 104, -103, 49, 104, 51, 98, 125, 36, 55, 52, 53, 96, 56, 101, 87, 101, 38, 84, 104, 70, 38, 106, 85, 93, 74, -119, -5, -105, -90, 42, -40, -36, 20, -82, -35, -76, 62, 14, -84, 17, 21, -36, 18, 10, -35, -94, -3, -86, 85, -35, -94, -35, -54, 74, -38, -92, 8, 18, -83, 17, 13, -102, -30, 4, -86, 8, 84, -109, 10, 98, 2, -98, -102, 122, 42, 100, 23, 37, 113, 107, 79, 81, 113, 69, 106, 82, 35, -113, 107, 14, -74, 66, 71, ByteCompanionObject.MAX_VALUE, 66, 109, 120, 51, -122, 105, 118, 107, 122, 114, 123, 84, 114, -7, -102, -117, -74, -53, -43, -127, -83, -43, 92, -30, 68, -29, -17, 116, -18, -26, 119, 126, 87, 3, -30, 68, 16, 126, 24, 122, -29};
        private static long asInterface = 4627239421682621901L;

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            abortCapture abortcapture = new abortCapture();
            char[] cArrB = abortCapture.b(asInterface ^ (-2687588926731523482L), cArr, i);
            abortcapture.b = 4;
            while (abortcapture.b < cArrB.length) {
                int i3 = $10 + 49;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                int i5 = abortcapture.b;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(asInterface)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.rgb(0, 0, 0) + 16842054), (ViewConfiguration.getPressedStateDuration() >> 16) + 1356, 37 - ((byte) KeyEvent.getModifierMetaStateMask()), 894276454, false, $$c((byte) 14, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 47774), (ViewConfiguration.getFadingEdgeLength() >> 16) + 468, ExpandableListView.getPackedPositionChild(0L) + 14, 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    int i6 = $11 + 109;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
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

        private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
            boolean z;
            long j;
            int i4 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                    int iResolveOpacity = 2267 - Drawable.resolveOpacity(0, 0);
                    int i5 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 32;
                    byte length = (byte) $$a.length;
                    byte b3 = (byte) (length - 4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel, iResolveOpacity, i5, 1387473586, false, $$c(length, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i6 = $11 + 67;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    byte[] bArr = TuitionPaymentFragmentbindingInflater1;
                    if (bArr != null) {
                        int length2 = bArr.length;
                        byte[] bArr2 = new byte[length2];
                        for (int i8 = 0; i8 < length2; i8++) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), Color.green(0) + 3358, ExpandableListView.getPackedPositionGroup(0L) + 18, -1054011043, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = TuitionPaymentFragmentbindingInflater1;
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char gidForName = (char) ((-1) - Process.getGidForName(""));
                            int defaultSize = 2267 - View.getDefaultSize(0, 0);
                            int i9 = 34 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            byte length3 = (byte) $$a.length;
                            byte b6 = (byte) (length3 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(gidForName, defaultSize, i9, 1387473586, false, $$c(length3, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                        j = 3046761265686732006L;
                    } else {
                        j = 3046761265686732006L;
                        iIntValue = (short) (((short) (((long) b[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                    }
                } else {
                    j = 3046761265686732006L;
                }
                if (iIntValue > 0) {
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ j)) + (!z ? 0 : 1);
                    try {
                        Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 55904);
                            int i10 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2854;
                            int keyRepeatDelay2 = 13 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            byte b7 = (byte) ($$a[1] + 1);
                            byte b8 = (byte) (b7 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatDelay, i10, keyRepeatDelay2, -1529949196, false, $$c(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        byte[] bArr4 = TuitionPaymentFragmentbindingInflater1;
                        if (bArr4 != null) {
                            int i11 = $11 + 77;
                            $10 = i11 % 128;
                            int i12 = i11 % 2;
                            int length4 = bArr4.length;
                            byte[] bArr5 = new byte[length4];
                            for (int i13 = 0; i13 < length4; i13++) {
                                int i14 = $11 + 97;
                                $10 = i14 % 128;
                                int i15 = i14 % 2;
                                bArr5[i13] = (byte) (((long) bArr4[i13]) ^ 3046761265686732006L);
                            }
                            bArr4 = bArr5;
                        }
                        boolean z2 = bArr4 != null;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                        while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                            if (z2) {
                                int i16 = $10 + 47;
                                $11 = i16 % 128;
                                int i17 = i16 % 2;
                                byte[] bArr6 = TuitionPaymentFragmentbindingInflater1;
                                int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i18]) ^ 3046761265686732006L)) + s)) ^ b2));
                            } else {
                                short[] sArr = b;
                                int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i19]) ^ 3046761265686732006L)) + s)) ^ b2));
                            }
                            sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        private ThrowingCache() {
        }

        @Override // com.android.volley.Cache
        public Cache.Entry get(String str) {
            int i = 2 % 2;
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.Cache
        public void put(String str, Cache.Entry entry) {
            int i = 2 % 2;
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.Cache
        public void initialize() {
            int i = 2 % 2;
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.Cache
        public void invalidate(String str, boolean z) {
            int i = 2 % 2;
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.Cache
        public void remove(String str) {
            int i = 2 % 2;
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.Cache
        public void clear() {
            int i = 2 % 2;
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v35, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v36 */
        /* JADX WARN: Type inference failed for: r5v39, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v45 */
        /* JADX WARN: Type inference failed for: r5v55 */
        /* JADX WARN: Type inference failed for: r5v56 */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, int i, int i2) {
            ?? NewInstance;
            int i3;
            int longPressTimeout;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int bitsPerPixel;
            Method method;
            int i9;
            char c;
            int i10 = 2 % 2;
            int i11 = asBinder + 29;
            d = i11 % 128;
            int i12 = i11 % 2;
            if (context != null) {
                try {
                    int i13 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    int i14 = (i13 ^ (-697864574)) + ((i13 & (-697864574)) << 1);
                    int iRed = Color.red(0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i15 = iRed * 371;
                    int i16 = ((i15 | (-33390)) << 1) - (i15 ^ (-33390));
                    int i17 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i18 = ~((89 & i17) | (89 ^ i17));
                    int i19 = ~iRed;
                    int i20 = d;
                    int i21 = (i20 & 123) + (i20 | 123);
                    int i22 = i21 % 128;
                    asBinder = i22;
                    int i23 = i21 % 2;
                    int i24 = ~((i19 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i19 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    int i25 = (i16 - (~(-(-((-370) * ((i24 & i18) | (i18 ^ i24))))))) - 1;
                    int i26 = ~iRed;
                    int i27 = (i22 & 39) + (i22 | 39);
                    d = i27 % 128;
                    int i28 = i27 % 2;
                    int i29 = ~(i26 | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    int i30 = ~((89 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (89 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    int i31 = (i29 & i30) | (i29 ^ i30);
                    int i32 = (iRed ^ (-90)) | (iRed & (-90));
                    int i33 = ~i32;
                    int i34 = ((i25 + (((i31 & i33) | (i31 ^ i33)) * (-370))) - (~((~i32) * 370))) - 1;
                    int i35 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                    short s = (short) ((i35 ^ (-9)) + ((i35 & (-9)) << 1));
                    int iResolveSize = View.resolveSize(0, 0);
                    Object[] objArr = new Object[1];
                    a(i14, i34, s, (byte) ((iResolveSize & 124) + (iResolveSize | 124)), 1731375139 - (~(KeyEvent.getMaxKeyCode() >> 16)), objArr);
                    NewInstance = (String) objArr[0];
                    try {
                        try {
                            Object[] objArr2 = {NewInstance};
                            Object[] objArr3 = new Object[1];
                            c(new char[]{52943, 1732, 52901, 44737, 28942, 64031, 16865, 40319, 4123, 20669, 24752, 49111, 29684, 13234, 541, 56879, 21183, 5394, 9653, 63867, 46090, 62699, 50351, 7040, 38891, 55286, 58947, 14962, 63209, 43311, 35242, 25894, 55371, 35019, 43193, 34755, 15297, 27564, 18974, 42510, 6818, 19743}, 1 - View.resolveSizeAndState(0, 0, 0), objArr3);
                            Class<?> cls = Class.forName((String) objArr3[0]);
                            int i36 = ~i;
                            int i37 = ~i;
                            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(String.class);
                            int i38 = d;
                            int i39 = (i38 & 91) + (i38 | 91);
                            asBinder = i39 % 128;
                            int i40 = i39 % 2;
                            NewInstance = declaredConstructor.newInstance(objArr2);
                            char[] cArr = {38872, 29558, 38811, 4681, 1248, 32117, 64842, 6695, 18776, 9582, 56438, 14489, 10990, 17937, 48789, 22851, 2997, 24765, 39231, 32307, 60710, 33040, 30734, 40106, 52960, 41475, 23188, 48449, 44980, 56549, 13651, 57881, 33038, 64860, 5156};
                            int i41 = d;
                            int i42 = (i41 ^ 91) + ((i41 & 91) << 1);
                            asBinder = i42 % 128;
                            int i43 = i42 % 2;
                            int i44 = -TextUtils.indexOf("", "");
                            int i45 = ((i44 | 1) << 1) - (i44 ^ 1);
                            Object[] objArr4 = new Object[1];
                            c(cArr, i45, objArr4);
                            try {
                                Object[] objArr5 = {(String) objArr4[0]};
                                int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i46 = doubleTapTimeout * 471;
                                int i47 = ((i46 | 471) << 1) - (i46 ^ 471);
                                int i48 = -(-(((doubleTapTimeout ^ 1) | (doubleTapTimeout & 1)) * (-470)));
                                int i49 = (i47 & i48) + (i47 | i48);
                                int i50 = ~doubleTapTimeout;
                                int i51 = ~((i50 & (-2)) | (i50 ^ (-2)));
                                int i52 = ~((-2) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                int i53 = (i51 ^ i52) | (i51 & i52);
                                int i54 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i55 = ~((i54 ^ doubleTapTimeout) | (i54 & doubleTapTimeout) | 1);
                                int i56 = i49 + (((i53 ^ i55) | (i53 & i55)) * (-470));
                                int i57 = (-2) | doubleTapTimeout;
                                int i58 = ~((i57 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i57 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                int i59 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i60 = (doubleTapTimeout & i59) | (i59 ^ doubleTapTimeout);
                                int i61 = -(-((i58 | (~((i60 & 1) | (i60 ^ 1)))) * 470));
                                int i62 = (i56 ^ i61) + ((i56 & i61) << 1);
                                Object[] objArr6 = new Object[1];
                                c(new char[]{52943, 1732, 52901, 44737, 28942, 64031, 16865, 40319, 4123, 20669, 24752, 49111, 29684, 13234, 541, 56879, 21183, 5394, 9653, 63867, 46090, 62699, 50351, 7040, 38891, 55286, 58947, 14962, 63209, 43311, 35242, 25894, 55371, 35019, 43193, 34755, 15297, 27564, 18974, 42510, 6818, 19743}, i62, objArr6);
                                Object objNewInstance = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                                try {
                                    char[] cArr2 = {46314, 5415, 46219, 35452, 25314, 12550, 25934, 22133, 27177, 17177, 17434, 29829, 2513, 8267, 9916, 5419, 10379, 1766, 338, 12845, 52761, 59155, 57364, 53443, 60883, 50264, 49850};
                                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
                                    int i63 = asBinder + 125;
                                    d = i63 % 128;
                                    if (i63 % 2 == 0) {
                                        int i64 = -iNormalizeMetaState;
                                        i3 = (i64 & (-494)) + (i64 | (-494));
                                    } else {
                                        i3 = iNormalizeMetaState * (-494);
                                    }
                                    int i65 = (i3 - 494) + ((~(iNormalizeMetaState | 1)) * (-495));
                                    int i66 = (iNormalizeMetaState | i37) * 495;
                                    int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                                    int i68 = ~iNormalizeMetaState;
                                    int i69 = ~((i68 & (-2)) | (i68 ^ (-2)));
                                    int i70 = ~((iNormalizeMetaState & i37) | (i37 ^ iNormalizeMetaState));
                                    int i71 = -(-(((i70 & i69) | (i69 ^ i70)) * 495));
                                    int i72 = (i67 & i71) + (i67 | i71);
                                    Object[] objArr7 = new Object[1];
                                    c(cArr2, i72, objArr7);
                                    Class<?> cls2 = Class.forName((String) objArr7[0]);
                                    int i73 = asBinder + 125;
                                    d = i73 % 128;
                                    int i74 = i73 % 2;
                                    Object[] objArr8 = new Object[1];
                                    c(new char[]{26794, 8240, 26829, 55027, 22526, 59179, 14801, 32890, 46695, 30212, 6298, 41703, 54677, 5462, 31248, 49939, 62656, 13310, 24014, 58443, 4712}, 1 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr8);
                                    Object objInvoke = cls2.getMethod((String) objArr8[0], null).invoke(context, null);
                                    int i75 = asBinder;
                                    int i76 = ((i75 | 1) << 1) - (i75 ^ 1);
                                    d = i76 % 128;
                                    int i77 = i76 % 2;
                                    try {
                                        char[] cArr3 = {46314, 5415, 46219, 35452, 25314, 12550, 25934, 22133, 27177, 17177, 17434, 29829, 2513, 8267, 9916, 5419, 10379, 1766, 338, 12845, 52761, 59155, 57364, 53443, 60883, 50264, 49850};
                                        int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0);
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i78 = (iNormalizeMetaState2 * 193) + 193;
                                        int i79 = ((~((~iNormalizeMetaState2) | 1)) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) * (-192);
                                        int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
                                        int i81 = ~iNormalizeMetaState2;
                                        int i82 = ~((i81 ^ (-2)) | (i81 & (-2)));
                                        int i83 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i84 = ~(((-2) ^ i83) | ((-2) & i83));
                                        int i85 = ((i82 ^ i84) | (i84 & i82)) * (-384);
                                        int i86 = d;
                                        int i87 = ((i86 | 123) << 1) - (i86 ^ 123);
                                        Object obj = objNewInstance;
                                        asBinder = i87 % 128;
                                        int i88 = i87 % 2;
                                        int i89 = ((i80 | i85) << 1) - (i85 ^ i80);
                                        int i90 = ~((i81 ^ (-2)) | (i81 & (-2)) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                        int i91 = ((-2) ^ i83) | ((-2) & i83);
                                        int i92 = i90 | (~((i91 & iNormalizeMetaState2) | (i91 ^ iNormalizeMetaState2)));
                                        int i93 = (iNormalizeMetaState2 ^ 1) | (iNormalizeMetaState2 & 1);
                                        int i94 = ~((i93 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i93 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                        int i95 = ((i92 & i94) | (i92 ^ i94)) * DerHeader.TAG_CLASS_PRIVATE;
                                        int i96 = (i89 ^ i95) + ((i95 & i89) << 1);
                                        try {
                                            Object[] objArr9 = new Object[1];
                                            c(cArr3, i96, objArr9);
                                            Class<?> cls3 = Class.forName((String) objArr9[0]);
                                            int i97 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                            int i98 = (i97 & (-697864538)) + (i97 | (-697864538));
                                            long j = 0;
                                            int i99 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                            int i100 = (i99 ^ (-89)) + ((i99 & (-89)) << 1);
                                            int i101 = -KeyEvent.keyCodeFromString("");
                                            int i102 = (i101 * 319) - (-34553);
                                            int i103 = -(-(((~((~i101) | i)) | 108) * (-318)));
                                            int i104 = (i102 ^ i103) + ((i102 & i103) << 1);
                                            int i105 = ~((108 ^ i) | (108 & i));
                                            int i106 = (i36 ^ i101) | (i36 & i101);
                                            int i107 = ~((i106 ^ (-109)) | (i106 & (-109)));
                                            int i108 = (i104 - (~(-(-(((i105 ^ i107) | (i105 & i107)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))))) - 1;
                                            int i109 = (108 ^ i36) | (108 & i36);
                                            int i110 = ~((i109 & i101) | (i109 ^ i101));
                                            int i111 = (i101 & (-109)) | (i101 ^ (-109));
                                            int i112 = ~((i111 & i) | (i111 ^ i));
                                            int i113 = -(-(((i112 & i110) | (i110 ^ i112)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                                            short s2 = (short) ((i108 ^ i113) + ((i113 & i108) << 1));
                                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
                                            int i114 = asBinder;
                                            int i115 = ((i114 | 17) << 1) - (i114 ^ 17);
                                            d = i115 % 128;
                                            int i116 = i115 % 2;
                                            Object[] objArr10 = new Object[1];
                                            a(i98, i100, s2, (byte) (106 - iLastIndexOf), 1731375172 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr10);
                                            try {
                                                Object[] objArr11 = {cls3.getMethod((String) objArr10[0], null).invoke(context, null), 64};
                                                Object[] objArr12 = new Object[1];
                                                c(new char[]{28696, 12103, 28793, 53760, 22658, 5742, 15666, 28957, 44763, 31097, 7270, 21485, 52515, 6699, 32448, 12867, 60537, 15494, 22830, 5445, 2776, 56689, 47144, 63375, 10533, 65059, 39641, 54866, 18551, 32913, 62739, 35078, 26306, 41337, 54381, 27582, 34058}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr12);
                                                Class<?> cls4 = Class.forName((String) objArr12[0]);
                                                int i117 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                int i118 = i117 * (-575);
                                                int i119 = ((i118 | (-575)) << 1) - (i118 ^ (-575));
                                                int i120 = ~i117;
                                                int i121 = -(-(((~((i120 ^ (-2)) | (i120 & (-2)))) | (~(((-2) ^ i) | ((-2) & i)))) * 576));
                                                int i122 = (i119 ^ i121) + ((i121 & i119) << 1);
                                                int i123 = ~(i120 | 1);
                                                int i124 = ((-2) ^ i37) | ((-2) & i37);
                                                int i125 = ~((i124 & i117) | (i124 ^ i117));
                                                int i126 = -(-(((i123 & i125) | (i123 ^ i125)) * 576));
                                                int i127 = (i122 & i126) + (i126 | i122);
                                                int i128 = ~i117;
                                                Object[] objArr13 = new Object[1];
                                                c(new char[]{18767, 21142, 18728, 8344, 9560, 22655, 53178, 16174, 38786, 1186, 61169, 7603, 62576, 26608, 35967, 31816, 54573, 16726}, i127 + ((~((i128 & (-2)) | (i128 ^ (-2)))) * 576), objArr13);
                                                String str = (String) objArr13[0];
                                                int i129 = asBinder;
                                                int i130 = (i129 & 83) + (i129 | 83);
                                                d = i130 % 128;
                                                int i131 = i130 % 2;
                                                Object objInvoke2 = cls4.getMethod(str, String.class, Integer.TYPE).invoke(objInvoke, objArr11);
                                                try {
                                                    int i132 = -View.MeasureSpec.getSize(0);
                                                    int i133 = (i132 ^ (-697864544)) + ((i132 & (-697864544)) << 1);
                                                    int i134 = (-92) - (~(-(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))));
                                                    short s3 = (short) ((-46) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                                    int i135 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                    Object[] objArr14 = new Object[1];
                                                    a(i133, i134, s3, (byte) ((i135 ^ 89) + ((i135 & 89) << 1)), TextUtils.indexOf((CharSequence) "", '0') + 1731375186, objArr14);
                                                    Class<?> cls5 = Class.forName((String) objArr14[0]);
                                                    int i136 = -(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                                    int i137 = ((i136 | (-697864527)) << 1) - (i136 ^ (-697864527));
                                                    int i138 = -MotionEvent.axisFromString("");
                                                    int i139 = (i138 ^ (-91)) + ((i138 & (-91)) << 1);
                                                    int i140 = asBinder;
                                                    int i141 = ((i140 | 27) << 1) - (i140 ^ 27);
                                                    d = i141 % 128;
                                                    if (i141 % 2 == 0) {
                                                        longPressTimeout = ViewConfiguration.getLongPressTimeout() + ComposerKt.defaultsKey;
                                                        i4 = (((-419) % longPressTimeout) >> 25) % (TypedValues.CycleType.TYPE_EASING << (~(i | (-33))));
                                                    } else {
                                                        longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
                                                        int i142 = longPressTimeout * (-419);
                                                        int i143 = (i142 ^ (-13893)) + ((i142 & (-13893)) << 1);
                                                        int i144 = (~((i ^ (-33)) | (i & (-33)))) * TypedValues.CycleType.TYPE_EASING;
                                                        i4 = ((i143 | i144) << 1) - (i144 ^ i143);
                                                    }
                                                    int i145 = ~longPressTimeout;
                                                    int i146 = (i4 - (~(-(-((-420) * ((i145 & (-33)) | ((-33) ^ i145))))))) - 1;
                                                    int i147 = ~longPressTimeout;
                                                    int i148 = ~((i147 & 32) | (i147 ^ 32));
                                                    int i149 = ~(i36 | (-33));
                                                    short s4 = (short) (i146 + (((i148 & i149) | (i148 ^ i149)) * TypedValues.CycleType.TYPE_EASING));
                                                    int i150 = -((Process.getThreadPriority(0) + 20) >> 6);
                                                    Object[] objArr15 = new Object[1];
                                                    a(i137, i139, s4, (byte) (((i150 | 108) << 1) - (i150 ^ 108)), TextUtils.getOffsetAfter("", 0) + 1731375215, objArr15);
                                                    Object[] objArr16 = (Object[]) cls5.getField((String) objArr15[0]).get(objInvoke2);
                                                    int length = objArr16.length;
                                                    int i151 = 0;
                                                    while (true) {
                                                        if (i151 < length) {
                                                            int i152 = d;
                                                            int i153 = (i152 & 73) + (i152 | 73);
                                                            asBinder = i153 % 128;
                                                            int i154 = i153 % 2;
                                                            Object obj2 = objArr16[i151];
                                                            int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                                                            int i155 = (((maxKeyCode * (-665)) - 1158526718) - (~(-(-((~maxKeyCode) * (-333)))))) - 1;
                                                            int i156 = ~maxKeyCode;
                                                            int i157 = ~((i156 ^ i37) | (i156 & i37));
                                                            int i158 = ~((i ^ (-697864553)) | (i & (-697864553)));
                                                            int i159 = -(-(((i157 ^ i158) | (i157 & i158)) * 333));
                                                            int i160 = ((i155 | i159) << 1) - (i155 ^ i159);
                                                            int i161 = asBinder;
                                                            int i162 = ((i161 | 93) << 1) - (i161 ^ 93);
                                                            d = i162 % 128;
                                                            int i163 = i162 % 2;
                                                            int i164 = ~(i156 | i);
                                                            int i165 = i36 ^ (-697864553);
                                                            if (i163 == 0) {
                                                                i8 = i160 >> ((i164 | (~(i165 | (i36 & (-697864553))))) * 333);
                                                                bitsPerPixel = ImageFormat.getBitsPerPixel(1) * 102;
                                                                i5 = 0;
                                                                i7 = 48;
                                                                i6 = 1;
                                                            } else {
                                                                int i166 = ((i164 | (~(i165 | (i36 & (-697864553))))) * 333) + i160;
                                                                i5 = 0;
                                                                int i167 = -ImageFormat.getBitsPerPixel(0);
                                                                i6 = 1;
                                                                i7 = 56;
                                                                i8 = i166;
                                                                bitsPerPixel = ((i167 | (-91)) << 1) - (i167 ^ (-91));
                                                            }
                                                            short s5 = (short) ((i7 - (~KeyEvent.getDeadChar(i5, i5))) - i6);
                                                            byte b2 = (byte) ((-83) - (~(-(-View.getDefaultSize(i5, i5)))));
                                                            int i168 = -Process.getGidForName("");
                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                            int i169 = i168 * (-494);
                                                            int i170 = ((i169 | (-600868752)) << 1) - (i169 ^ (-600868752));
                                                            int i171 = -(-((~((i168 ^ 1731375224) | (1731375224 & i168))) * (-495)));
                                                            int i172 = ((i170 | i171) << 1) - (i170 ^ i171);
                                                            int i173 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                                            int i174 = (i173 & i168) | (i168 ^ i173);
                                                            int i175 = i174 * 495;
                                                            int i176 = (i172 & i175) + (i172 | i175);
                                                            int i177 = ~i168;
                                                            int i178 = ~((i177 ^ (-1731375225)) | (i177 & (-1731375225)));
                                                            int i179 = ~i174;
                                                            int i180 = -(-(((i178 & i179) | (i178 ^ i179)) * 495));
                                                            Object[] objArr17 = new Object[1];
                                                            a(i8, bitsPerPixel, s5, b2, (i176 & i180) + (i176 | i180), objArr17);
                                                            try {
                                                                Object[] objArr18 = {(String) objArr17[0]};
                                                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) - 697864534;
                                                                int i181 = (-89) - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1));
                                                                int i182 = -Color.green(0);
                                                                int i183 = d;
                                                                int i184 = ((i183 | 1) << 1) - (i183 ^ 1);
                                                                asBinder = i184 % 128;
                                                                int i185 = i184 % 2;
                                                                int i186 = 989 * i182;
                                                                int i187 = (i186 & 23688) + (i186 | 23688);
                                                                int i188 = 23 | i36;
                                                                int i189 = ~((i188 ^ i182) | (i188 & i182));
                                                                int i190 = (i182 ^ (-24)) | (i182 & (-24));
                                                                int i191 = ~((i190 ^ i) | (i190 & i));
                                                                int i192 = i187 + (((i189 ^ i191) | (i189 & i191)) * 988);
                                                                zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                int i193 = -(-((-988) * ((i182 ^ 23) | (i182 & 23))));
                                                                int i194 = (i192 & i193) + (i193 | i192);
                                                                int i195 = ~i182;
                                                                int i196 = (~((i195 & 23) | (i195 ^ 23))) | (~((23 ^ i) | (23 & i)));
                                                                int i197 = ~((i182 & i36) | (i36 ^ i182) | (-24));
                                                                int i198 = -(-(((i197 & i196) | (i196 ^ i197)) * 988));
                                                                short s6 = (short) ((i194 & i198) + (i198 | i194));
                                                                int iRed2 = Color.red(0);
                                                                int i199 = d;
                                                                int i200 = ((i199 | 3) << 1) - (i199 ^ 3);
                                                                asBinder = i200 % 128;
                                                                int i201 = i200 % 2;
                                                                int i202 = -iRed2;
                                                                byte b3 = (byte) (((33 | i202) << 1) - (i202 ^ 33));
                                                                int iAxisFromString = MotionEvent.axisFromString("");
                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                int i203 = iAxisFromString * (-129);
                                                                int i204 = (i203 ^ (-823111427)) + ((i203 & (-823111427)) << 1);
                                                                int i205 = -(-((~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (-1731375232) | iAxisFromString)) * 130));
                                                                int i206 = (i204 & i205) + (i204 | i205);
                                                                int i207 = -(-((~(((-1731375232) ^ iAxisFromString) | ((-1731375232) & iAxisFromString))) * (-260)));
                                                                int i208 = (i206 ^ i207) + ((i206 & i207) << 1);
                                                                int i209 = ~iAxisFromString;
                                                                int i210 = ~((i209 ^ 1731375231) | (i209 & 1731375231));
                                                                int i211 = ((-1731375232) ^ iAxisFromString) | ((-1731375232) & iAxisFromString);
                                                                int i212 = ~((i211 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i211 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                                                int i213 = -(-(((i212 & i210) | (i210 ^ i212)) * 130));
                                                                int i214 = (i208 ^ i213) + ((i213 & i208) << 1);
                                                                Object[] objArr19 = new Object[1];
                                                                a(iIndexOf, i181, s6, b3, i214, objArr19);
                                                                Class<?> cls6 = Class.forName((String) objArr19[0]);
                                                                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                int i215 = packedPositionChild * (-947);
                                                                int i216 = (i215 & (-848482029)) + (i215 | (-848482029));
                                                                int i217 = ~packedPositionChild;
                                                                int i218 = ~((697864536 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (697864536 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                                                int i219 = ((i217 ^ i218) | (i217 & i218)) * (-948);
                                                                int i220 = ((i216 | i219) << 1) - (i219 ^ i216);
                                                                int i221 = ~packedPositionChild;
                                                                int i222 = (i221 ^ 697864536) | (i221 & 697864536);
                                                                int i223 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                                int i224 = -(-((~((i223 & i222) | (i222 ^ i223))) * (-948)));
                                                                int i225 = (i220 & i224) + (i224 | i220);
                                                                int i226 = ((packedPositionChild & 697864536) | (packedPositionChild ^ 697864536)) * 948;
                                                                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) - 90;
                                                                int i227 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                                int defaultSize = View.getDefaultSize(0, 0);
                                                                int i228 = -ExpandableListView.getPackedPositionType(0L);
                                                                Object[] objArr20 = new Object[1];
                                                                a((i225 & i226) + (i226 | i225), edgeSlop, (short) ((i227 & 75) + (i227 | 75)), (byte) (((defaultSize | (-62)) << 1) - (defaultSize ^ (-62))), (i228 & 1731375267) + (i228 | 1731375267), objArr20);
                                                                Object objInvoke3 = cls6.getMethod((String) objArr20[0], String.class).invoke(null, objArr18);
                                                                int i229 = d + 89;
                                                                asBinder = i229 % 128;
                                                                int i230 = i229 % 2;
                                                                try {
                                                                    int i231 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                                                    int i232 = i231 * 165;
                                                                    int i233 = (i232 & 2082770976) + (i232 | 2082770976);
                                                                    int i234 = -(-(((~((i36 ^ (-697864544)) | (i36 & (-697864544)))) | i231) * (-328)));
                                                                    int i235 = ((i233 | i234) << 1) - (i234 ^ i233);
                                                                    int i236 = ((i231 ^ i) | (i231 & i)) * 164;
                                                                    int i237 = (i235 & i236) + (i236 | i235);
                                                                    int i238 = ~i231;
                                                                    int i239 = ~((i238 ^ 697864543) | (i238 & 697864543));
                                                                    int i240 = ~(697864543 | i);
                                                                    int i241 = (i239 ^ i240) | (i239 & i240);
                                                                    int i242 = (i231 & i36) | (i36 ^ i231);
                                                                    int i243 = ~((i242 & (-697864544)) | (i242 ^ (-697864544)));
                                                                    int i244 = i237 + (((i243 & i241) | (i241 ^ i243)) * 164);
                                                                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0');
                                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                    int i245 = ~(88 | iTuitionPaymentFragmentspecialinlinedviewModeldefault7);
                                                                    int i246 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                                    Object[] objArr21 = objArr16;
                                                                    int i247 = (~((i246 ^ iLastIndexOf2) | (i246 & iLastIndexOf2))) | i245;
                                                                    int i248 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                                    int i249 = ~((i248 ^ (-89)) | (i248 & (-89)));
                                                                    int i250 = ((iLastIndexOf2 * (-515)) - 46013) + (((i247 ^ i249) | (i247 & i249)) * (-516));
                                                                    int i251 = ~iLastIndexOf2;
                                                                    int i252 = i251 | 88;
                                                                    int i253 = ~((i252 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i252 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                                                    int i254 = (i251 ^ i246) | (i251 & i246);
                                                                    int i255 = ~((i254 & (-89)) | (i254 ^ (-89)));
                                                                    int i256 = ((i250 + (((i253 & i255) | (i253 ^ i255)) * 516)) - (~(-(-(((~((i251 & (-89)) | (i251 ^ (-89)))) | (~(i246 | (-89)))) * 516))))) - 1;
                                                                    int i257 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
                                                                    int i258 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                                                    int i259 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                                    int i260 = ((i259 | 1731375278) << 1) - (i259 ^ 1731375278);
                                                                    Object[] objArr22 = new Object[1];
                                                                    a(i244, i256, (short) ((i257 ^ 101) + ((i257 & 101) << 1)), (byte) ((i258 & 15) + (i258 | 15)), i260, objArr22);
                                                                    Class<?> cls7 = Class.forName((String) objArr22[0]);
                                                                    int i261 = (-697864525) - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                                                                    int edgeSlop2 = ViewConfiguration.getEdgeSlop() >> 16;
                                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                    int i262 = edgeSlop2 * (-661);
                                                                    int i263 = ((i262 | 59490) << 1) - (i262 ^ 59490);
                                                                    int i264 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                                                    int i265 = ~edgeSlop2;
                                                                    int i266 = (i264 | (~((i265 ^ 89) | (i265 & 89)))) * 1324;
                                                                    int i267 = (i263 ^ i266) + ((i266 & i263) << 1);
                                                                    int i268 = ~((edgeSlop2 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (edgeSlop2 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                                                                    int i269 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & (-90)) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 ^ (-90)));
                                                                    int i270 = i267 + (((i269 & i268) | (i268 ^ i269)) * (-1324));
                                                                    int i271 = ~edgeSlop2;
                                                                    int i272 = -(-(((~(89 | edgeSlop2)) | (~((i271 & (-90)) | (i271 ^ (-90))))) * 662));
                                                                    int i273 = (i270 ^ i272) + ((i272 & i270) << 1);
                                                                    short sCombineMeasuredStates = (short) ((-86) - View.combineMeasuredStates(0, 0));
                                                                    int i274 = -KeyEvent.keyCodeFromString("");
                                                                    int i275 = -Color.green(0);
                                                                    int i276 = (i275 ^ 1731375306) + ((i275 & 1731375306) << 1);
                                                                    Object[] objArr23 = new Object[1];
                                                                    a(i261, i273, sCombineMeasuredStates, (byte) ((i274 & 38) + (i274 | 38)), i276, objArr23);
                                                                    try {
                                                                        Object[] objArr24 = {new ByteArrayInputStream((byte[]) cls7.getMethod((String) objArr23[0], null).invoke(obj2, null))};
                                                                        int bitsPerPixel2 = (-697864536) - ImageFormat.getBitsPerPixel(0);
                                                                        int i277 = (-91) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("");
                                                                        int i278 = iKeyCodeFromString * (-830);
                                                                        int i279 = ((i278 | (-19968)) << 1) - (i278 ^ (-19968));
                                                                        int i280 = ~((23 ^ i37) | (23 & i37));
                                                                        int i281 = (iKeyCodeFromString ^ (-24)) | (iKeyCodeFromString & (-24));
                                                                        int i282 = ~((i281 & i) | (i281 ^ i));
                                                                        int i283 = -(-(((i280 & i282) | (i280 ^ i282)) * (-831)));
                                                                        int i284 = ((i279 | i283) << 1) - (i283 ^ i279);
                                                                        int i285 = -(-((~((23 ^ iKeyCodeFromString) | (23 & iKeyCodeFromString) | i)) * (-1662)));
                                                                        int i286 = (i284 & i285) + (i285 | i284);
                                                                        int i287 = ~iKeyCodeFromString;
                                                                        int i288 = (~((iKeyCodeFromString & i) | (iKeyCodeFromString ^ i))) | (~((i287 & i36) | (i287 ^ i36)));
                                                                        int i289 = ~((i ^ (-24)) | (i & (-24)));
                                                                        int i290 = -(-(((i288 & i289) | (i288 ^ i289)) * 831));
                                                                        short s7 = (short) ((i286 ^ i290) + ((i290 & i286) << 1));
                                                                        byte bMyPid = (byte) ((Process.myPid() >> 22) + 33);
                                                                        int i291 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                                                        int i292 = d;
                                                                        int i293 = ((i292 | 113) << 1) - (i292 ^ 113);
                                                                        asBinder = i293 % 128;
                                                                        int i294 = i293 % 2;
                                                                        int i295 = i291 * 303;
                                                                        int i296 = (i295 ^ (-1452901414)) + ((i295 & (-1452901414)) << 1);
                                                                        int i297 = (~i291) | i36;
                                                                        int i298 = ~((i297 & 1731375230) | (i297 ^ 1731375230));
                                                                        int i299 = i291 | 1731375230;
                                                                        int i300 = ~((i299 ^ i) | (i299 & i));
                                                                        int i301 = -(-(((i298 ^ i300) | (i298 & i300)) * (-302)));
                                                                        int i302 = (i296 ^ i301) + ((i301 & i296) << 1);
                                                                        int i303 = ~i291;
                                                                        int i304 = (i303 & 1731375230) | (i303 ^ 1731375230);
                                                                        int i305 = (i302 - (~(-(-((~((i304 & i) | (i304 ^ i))) * (-604)))))) - 1;
                                                                        int i306 = ((~((i291 & (-1731375231)) | ((-1731375231) ^ i291))) | (~(i | 1731375230))) * 302;
                                                                        int i307 = (i305 ^ i306) + ((i306 & i305) << 1);
                                                                        Object[] objArr25 = new Object[1];
                                                                        a(bitsPerPixel2, i277, s7, bMyPid, i307, objArr25);
                                                                        Class<?> cls8 = Class.forName((String) objArr25[0]);
                                                                        int iMyTid = (Process.myTid() >> 22) - 697864538;
                                                                        int i308 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                        int i309 = (i308 ^ (-89)) + ((i308 & (-89)) << 1);
                                                                        int threadPriority = Process.getThreadPriority(0);
                                                                        int i310 = -(((threadPriority & 20) + (threadPriority | 20)) >> 6);
                                                                        short s8 = (short) ((i310 & 51) + (i310 | 51));
                                                                        int i311 = -TextUtils.getCapsMode("", 0, 0);
                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                        int i312 = ~i311;
                                                                        int i313 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                                                        int i314 = ~((i312 & i313) | (i312 ^ i313));
                                                                        int i315 = (((i311 * 934) + 54056) - (~(-(-(((57 ^ i314) | (i314 & 57)) * (-933)))))) - 1;
                                                                        int i316 = -(-(((~(i313 | 57)) | (~((57 & i311) | (57 ^ i311)))) * 933));
                                                                        int i317 = (i315 & i316) + (i316 | i315);
                                                                        int i318 = asBinder;
                                                                        int i319 = (i318 ^ 39) + ((i318 & 39) << 1);
                                                                        d = i319 % 128;
                                                                        if (i319 % 2 == 0) {
                                                                            int i320 = -(~((i311 & (-58)) | (i311 ^ (-58))));
                                                                            Object[] objArr26 = new Object[1];
                                                                            a(iMyTid, i309, s8, (byte) (i317 * ((i320 & 933) + (i320 | 933))), 1731375318 % ((byte) KeyEvent.getModifierMetaStateMask()), objArr26);
                                                                            method = cls8.getMethod((String) objArr26[0], InputStream.class);
                                                                        } else {
                                                                            int i321 = (~(i311 | (-58))) * 933;
                                                                            int i322 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                                                                            Object[] objArr27 = new Object[1];
                                                                            a(iMyTid, i309, s8, (byte) ((i317 ^ i321) + ((i321 & i317) << 1)), (i322 & 1731375318) + (i322 | 1731375318), objArr27);
                                                                            method = cls8.getMethod((String) objArr27[0], InputStream.class);
                                                                        }
                                                                        Object objInvoke4 = method.invoke(objInvoke3, objArr24);
                                                                        try {
                                                                            int i323 = -(Process.myTid() >> 22);
                                                                            int i324 = ((i323 | 1) << 1) - (i323 ^ 1);
                                                                            Object[] objArr28 = new Object[1];
                                                                            c(new char[]{36074, 29369, 35968, 60750, 1395, 33296, 622, 58736, 21096, 9373, 9001, 51166, 12743, 18376, 16777, 42557, 4247, 24888, 26231, 33136, 63016, 32918, 34662, 25593, 54659, 41870, 42437, 16910, 46215, 56696, 51812, 7536, 39480, 64655, 60199, 65476, 31230, 8151}, i324, objArr28);
                                                                            Class<?> cls9 = Class.forName((String) objArr28[0]);
                                                                            int i325 = asBinder + 73;
                                                                            d = i325 % 128;
                                                                            int i326 = i325 % 2;
                                                                            Object[] objArr29 = new Object[1];
                                                                            c(new char[]{10661, 27701, 10690, 18697, 7163, 4361, 42539, 30299, 63356, 14848, 34657, 21697, 38046, 22850, 58879, 13669, 46481, 32682, 49667, 4734, 21372, 40448, 9068, 61649, 28809, 48467, 471}, 0 - (~(ViewConfiguration.getTouchSlop() >> 8)), objArr29);
                                                                            if (!NewInstance.equals(cls9.getMethod((String) objArr29[0], null).invoke(objInvoke4, null))) {
                                                                                try {
                                                                                    Object[] objArr30 = new Object[1];
                                                                                    c(new char[]{36074, 29369, 35968, 60750, 1395, 33296, 622, 58736, 21096, 9373, 9001, 51166, 12743, 18376, 16777, 42557, 4247, 24888, 26231, 33136, 63016, 32918, 34662, 25593, 54659, 41870, 42437, 16910, 46215, 56696, 51812, 7536, 39480, 64655, 60199, 65476, 31230, 8151}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr30);
                                                                                    Class<?> cls10 = Class.forName((String) objArr30[0]);
                                                                                    Object[] objArr31 = new Object[1];
                                                                                    c(new char[]{10661, 27701, 10690, 18697, 7163, 4361, 42539, 30299, 63356, 14848, 34657, 21697, 38046, 22850, 58879, 13669, 46481, 32682, 49667, 4734, 21372, 40448, 9068, 61649, 28809, 48467, 471}, -MotionEvent.axisFromString(""), objArr31);
                                                                                    Object objInvoke5 = cls10.getMethod((String) objArr31[0], null).invoke(objInvoke4, null);
                                                                                    int i327 = d;
                                                                                    int i328 = (i327 & 1) + (i327 | 1);
                                                                                    asBinder = i328 % 128;
                                                                                    Object obj3 = obj;
                                                                                    if (i328 % 2 != 0) {
                                                                                        int i329 = 15 / 0;
                                                                                        if (!obj3.equals(objInvoke5)) {
                                                                                            i9 = 1;
                                                                                            i151 = ((i151 & 1) << i9) + (i151 ^ 1);
                                                                                            objArr16 = objArr21;
                                                                                            obj = obj3;
                                                                                            j = 0;
                                                                                        }
                                                                                    } else {
                                                                                        i9 = 1;
                                                                                        if (!obj3.equals(objInvoke5)) {
                                                                                            i151 = ((i151 & 1) << i9) + (i151 ^ 1);
                                                                                            objArr16 = objArr21;
                                                                                            obj = obj3;
                                                                                            j = 0;
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
                                                                            Object[] objArr32 = {new int[]{i}, new int[1], new int[]{(i & (-2)) | (i36 & 1)}, null};
                                                                            int i330 = (-454980592) + (((-84021505) | i) * (-627)) + (((~(86211915 | i)) | 126522144) * (-627)) + (((~((-86211916) | i36)) | (~(126522144 | i))) * 627) + 16;
                                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                            int i331 = i330 * 495;
                                                                            int i332 = i2 * (-493);
                                                                            int i333 = (i331 & i332) + (i331 | i332);
                                                                            int i334 = ~i2;
                                                                            int i335 = i333 + ((i330 | i334) * (-988));
                                                                            int i336 = ~i330;
                                                                            int i337 = (i2 ^ i336) | (i2 & i336);
                                                                            int i338 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                                                            int i339 = ((i337 & i338) | (i337 ^ i338)) * 494;
                                                                            int i340 = ((i335 | i339) << 1) - (i335 ^ i339);
                                                                            int i341 = (~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | i2)) | (~((i334 & i336) | (i336 ^ i334)));
                                                                            int i342 = ~((i330 & i2) | (i330 ^ i2));
                                                                            int i343 = ((i341 & i342) | (i341 ^ i342)) * 494;
                                                                            int i344 = (i340 ^ i343) + ((i343 & i340) << 1);
                                                                            int i345 = (i344 << 13) ^ i344;
                                                                            int i346 = i345 >>> 17;
                                                                            int i347 = ((~i345) & i346) | ((~i346) & i345);
                                                                            int i348 = i347 << 5;
                                                                            ((int[]) objArr32[1])[0] = (i347 | i348) & (~(i347 & i348));
                                                                            return objArr32;
                                                                        } catch (Throwable th2) {
                                                                            Throwable cause2 = th2.getCause();
                                                                            if (cause2 != null) {
                                                                                throw cause2;
                                                                            }
                                                                            throw th2;
                                                                        }
                                                                    } catch (Throwable th3) {
                                                                        Throwable cause3 = th3.getCause();
                                                                        if (cause3 != null) {
                                                                            throw cause3;
                                                                        }
                                                                        throw th3;
                                                                    }
                                                                } catch (Throwable th4) {
                                                                    Throwable cause4 = th4.getCause();
                                                                    if (cause4 != null) {
                                                                        throw cause4;
                                                                    }
                                                                    throw th4;
                                                                }
                                                            } catch (Throwable th5) {
                                                                Throwable cause5 = th5.getCause();
                                                                if (cause5 != null) {
                                                                    throw cause5;
                                                                }
                                                                throw th5;
                                                            }
                                                        }
                                                        NewInstance = i2;
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                            } catch (Throwable th6) {
                                                Throwable cause6 = th6.getCause();
                                                if (cause6 != null) {
                                                    throw cause6;
                                                }
                                                throw th6;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            Throwable cause7 = th.getCause();
                                            if (cause7 != null) {
                                                throw cause7;
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                } catch (Throwable th9) {
                                    Throwable cause8 = th9.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th9;
                                }
                            } catch (Throwable th10) {
                                Throwable cause9 = th10.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th10;
                            }
                        } catch (Throwable th11) {
                            Throwable cause10 = th11.getCause();
                            if (cause10 != null) {
                                throw cause10;
                            }
                            throw th11;
                        }
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    NewInstance = i2;
                }
            } else {
                NewInstance = i2;
            }
            Object[] objArr33 = new Object[4];
            int[] iArr = new int[1];
            objArr33[0] = iArr;
            objArr33[1] = new int[1];
            int[] iArr2 = new int[1];
            objArr33[2] = iArr2;
            int i349 = d + 23;
            asBinder = i349 % 128;
            if (i349 % 2 != 0) {
                c = 0;
                iArr[0] = i;
            } else {
                c = 0;
                iArr[0] = i;
            }
            iArr2[c] = i;
            objArr33[3] = null;
            int iMyTid2 = Process.myTid();
            int i350 = ~iMyTid2;
            int i351 = 1858126516 + (((~(358902417 | i350)) | 42696806) * 168) + ((~((-42696807) | iMyTid2)) * 168) + (((~(iMyTid2 | 401599223)) | (~(i350 | (-399212647))) | 356515840) * 168);
            int i352 = -(-((i351 << 1) - i351));
            int i353 = (NewInstance ^ i352) + ((i352 & NewInstance) << 1);
            int i354 = (i353 << 13) ^ i353;
            int i355 = i354 >>> 17;
            int i356 = ((~i354) & i355) | ((~i355) & i354);
            int i357 = asBinder + 7;
            d = i357 % 128;
            int i358 = i357 % 2;
            ((int[]) objArr33[1])[0] = i356 ^ (i356 << 5);
            return objArr33;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$c(int r6, byte r7, short r8) {
            /*
                int r7 = r7 * 2
                int r7 = r7 + 4
                byte[] r0 = com.android.volley.AsyncRequestQueue.ThrowingCache.$$a
                int r8 = r8 * 2
                int r8 = r8 + 1
                int r6 = 121 - r6
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r6
                r6 = r8
                r4 = r2
                goto L25
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r6
                r1[r3] = r5
                if (r4 != r8) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L23:
                r3 = r0[r7]
            L25:
                int r7 = r7 + 1
                int r6 = r6 + r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.volley.AsyncRequestQueue.ThrowingCache.$$c(int, byte, short):java.lang.String");
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $11 + 55;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 2187, 'X' - AndroidCharacter.getMirror('0'), 841711447, false, $$e(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(b), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33017), 3011 - Color.green(0), 27 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 321985076, false, $$e(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 36506), 3377 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 16 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -968507904, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
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
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) (-1);
                byte b9 = (byte) (b8 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 36505), (Process.myPid() >> 22) + 3376, (ViewConfiguration.getWindowTouchSlop() >> 8) + 17, -968507904, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            int i7 = $11 + 87;
            $10 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr);
        int i9 = $11 + 97;
        $10 = i9 % 128;
        int i10 = i9 % 2;
    }

    private AsyncRequestQueue(Cache cache, AsyncNetwork asyncNetwork, AsyncCache asyncCache, ResponseDelivery responseDelivery, ExecutorFactory executorFactory) {
        super(cache, asyncNetwork, 0, responseDelivery);
        this.mWaitingRequestManager = new WaitingRequestManager(this);
        this.mRequestsAwaitingCacheInitialization = new ArrayList();
        this.mIsCacheInitialized = false;
        this.mCacheInitializationLock = new Object[0];
        this.mAsyncCache = asyncCache;
        this.mNetwork = asyncNetwork;
        this.mExecutorFactory = executorFactory;
    }

    @Override // com.android.volley.RequestQueue
    public void start() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        stop();
        this.mNonBlockingExecutor = this.mExecutorFactory.createNonBlockingExecutor(getBlockingQueue());
        this.mBlockingExecutor = this.mExecutorFactory.createBlockingExecutor(getBlockingQueue());
        this.mNonBlockingScheduledExecutor = this.mExecutorFactory.createNonBlockingScheduledExecutor();
        this.mNetwork.setBlockingExecutor(this.mBlockingExecutor);
        this.mNetwork.setNonBlockingExecutor(this.mNonBlockingExecutor);
        this.mNetwork.setNonBlockingScheduledExecutor(this.mNonBlockingScheduledExecutor);
        if (this.mAsyncCache != null) {
            this.mNonBlockingExecutor.execute(new Runnable() { // from class: com.android.volley.AsyncRequestQueue.1
                @Override // java.lang.Runnable
                public void run() {
                    AsyncRequestQueue.access$100(AsyncRequestQueue.this).initialize(new AsyncCache.OnWriteCompleteCallback() { // from class: com.android.volley.AsyncRequestQueue.1.1
                        @Override // com.android.volley.AsyncCache.OnWriteCompleteCallback
                        public void onWriteComplete() {
                            AsyncRequestQueue.access$000(AsyncRequestQueue.this);
                        }
                    });
                }
            });
            return;
        }
        this.mBlockingExecutor.execute(new Runnable() { // from class: com.android.volley.AsyncRequestQueue.2
            @Override // java.lang.Runnable
            public void run() {
                AsyncRequestQueue.this.getCache().initialize();
                AsyncRequestQueue.access$200(AsyncRequestQueue.this).execute(new Runnable() { // from class: com.android.volley.AsyncRequestQueue.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AsyncRequestQueue.access$000(AsyncRequestQueue.this);
                    }
                });
            }
        });
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.android.volley.RequestQueue
    public void stop() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        ExecutorService executorService = this.mNonBlockingExecutor;
        if (executorService != null) {
            executorService.shutdownNow();
            this.mNonBlockingExecutor = null;
        }
        ExecutorService executorService2 = this.mBlockingExecutor;
        if (executorService2 != null) {
            executorService2.shutdownNow();
            this.mBlockingExecutor = null;
        }
        ScheduledExecutorService scheduledExecutorService = this.mNonBlockingScheduledExecutor;
        if (scheduledExecutorService != null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 != 0) {
                scheduledExecutorService.shutdownNow();
                this.mNonBlockingScheduledExecutor = null;
            } else {
                scheduledExecutorService.shutdownNow();
                this.mNonBlockingScheduledExecutor = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    @Override // com.android.volley.RequestQueue
    <T> void beginRequest(Request<T> request) {
        if (!this.mIsCacheInitialized) {
            synchronized (this.mCacheInitializationLock) {
                if (!this.mIsCacheInitialized) {
                    this.mRequestsAwaitingCacheInitialization.add(request);
                    return;
                }
            }
        }
        if (request.shouldCache()) {
            if (this.mAsyncCache != null) {
                this.mNonBlockingExecutor.execute(new CacheTask(request));
                return;
            } else {
                this.mBlockingExecutor.execute(new CacheTask(request));
                return;
            }
        }
        sendRequestOverNetwork(request);
    }

    private void onCacheInitializationComplete() {
        ArrayList arrayList;
        synchronized (this.mCacheInitializationLock) {
            arrayList = new ArrayList(this.mRequestsAwaitingCacheInitialization);
            this.mRequestsAwaitingCacheInitialization.clear();
            this.mIsCacheInitialized = true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            beginRequest((Request) it.next());
        }
    }

    @Override // com.android.volley.RequestQueue
    <T> void sendRequestOverNetwork(Request<T> request) {
        int i = 2 % 2;
        this.mNonBlockingExecutor.execute(new NetworkTask(request));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
    }

    class CacheTask<T> extends RequestTask<T> {
        CacheTask(Request<T> request) {
            super(request);
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            if (this.mRequest.isCanceled()) {
                this.mRequest.finish("cache-discard-canceled");
                return;
            }
            this.mRequest.addMarker("cache-queue-take");
            if (AsyncRequestQueue.access$100(AsyncRequestQueue.this) != null) {
                AsyncRequestQueue.access$100(AsyncRequestQueue.this).get(this.mRequest.getCacheKey(), new AsyncCache.OnGetCompleteCallback() { // from class: com.android.volley.AsyncRequestQueue.CacheTask.1
                    @Override // com.android.volley.AsyncCache.OnGetCompleteCallback
                    public void onGetComplete(Cache.Entry entry) throws Throwable {
                        AsyncRequestQueue.access$300(AsyncRequestQueue.this, entry, CacheTask.this.mRequest);
                    }
                });
            } else {
                AsyncRequestQueue.access$300(AsyncRequestQueue.this, AsyncRequestQueue.this.getCache().get(this.mRequest.getCacheKey()), this.mRequest);
            }
        }
    }

    private void handleEntry(Cache.Entry entry, Request<?> request) throws Throwable {
        int i = 2 % 2;
        if (entry == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 == 0) {
                request.addMarker("cache-miss");
                this.mWaitingRequestManager.maybeAddToWaitingRequests(request);
                throw null;
            }
            request.addMarker("cache-miss");
            if (this.mWaitingRequestManager.maybeAddToWaitingRequests(request)) {
                return;
            }
            sendRequestOverNetwork(request);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!entry.isExpired(jCurrentTimeMillis)) {
            this.mBlockingExecutor.execute(new CacheParseTask(request, entry, jCurrentTimeMillis));
            return;
        }
        Object[] objArr = new Object[1];
        a(ExpandableListView.getPackedPositionGroup(0L), View.getDefaultSize(0, 0) + 17, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), objArr);
        request.addMarker((String) objArr[0]);
        request.setCacheEntry(entry);
        if (this.mWaitingRequestManager.maybeAddToWaitingRequests(request)) {
            return;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            sendRequestOverNetwork(request);
        } else {
            sendRequestOverNetwork(request);
            int i4 = 12 / 0;
        }
    }

    class CacheParseTask<T> extends RequestTask<T> {
        Cache.Entry entry;
        long startTimeMillis;

        CacheParseTask(Request<T> request, Cache.Entry entry, long j) {
            super(request);
            this.entry = entry;
            this.startTimeMillis = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.mRequest.addMarker("cache-hit");
            Response<T> networkResponse = this.mRequest.parseNetworkResponse(new NetworkResponse(200, this.entry.data, false, 0L, this.entry.allResponseHeaders));
            this.mRequest.addMarker("cache-hit-parsed");
            if (!this.entry.refreshNeeded(this.startTimeMillis)) {
                AsyncRequestQueue.this.getResponseDelivery().postResponse(this.mRequest, networkResponse);
                return;
            }
            this.mRequest.addMarker("cache-hit-refresh-needed");
            this.mRequest.setCacheEntry(this.entry);
            networkResponse.intermediate = true;
            if (!AsyncRequestQueue.access$400(AsyncRequestQueue.this).maybeAddToWaitingRequests(this.mRequest)) {
                AsyncRequestQueue.this.getResponseDelivery().postResponse(this.mRequest, networkResponse, new Runnable() { // from class: com.android.volley.AsyncRequestQueue.CacheParseTask.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AsyncRequestQueue.this.sendRequestOverNetwork(CacheParseTask.this.mRequest);
                    }
                });
            } else {
                AsyncRequestQueue.this.getResponseDelivery().postResponse(this.mRequest, networkResponse);
            }
        }
    }

    class ParseErrorTask<T> extends RequestTask<T> {
        VolleyError volleyError;

        ParseErrorTask(Request<T> request, VolleyError volleyError) {
            super(request);
            this.volleyError = volleyError;
        }

        @Override // java.lang.Runnable
        public void run() {
            AsyncRequestQueue.this.getResponseDelivery().postError(this.mRequest, this.mRequest.parseNetworkError(this.volleyError));
            this.mRequest.notifyListenerResponseNotUsable();
        }
    }

    class NetworkTask<T> extends RequestTask<T> {
        NetworkTask(Request<T> request) {
            super(request);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mRequest.isCanceled()) {
                this.mRequest.finish("network-discard-cancelled");
                this.mRequest.notifyListenerResponseNotUsable();
            } else {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.mRequest.addMarker("network-queue-take");
                AsyncRequestQueue.access$600(AsyncRequestQueue.this).performRequest(this.mRequest, new AsyncNetwork.OnRequestComplete() { // from class: com.android.volley.AsyncRequestQueue.NetworkTask.1
                    @Override // com.android.volley.AsyncNetwork.OnRequestComplete
                    public void onSuccess(NetworkResponse networkResponse) {
                        NetworkTask.this.mRequest.addMarker("network-http-complete");
                        if (networkResponse.notModified && NetworkTask.this.mRequest.hasHadResponseDelivered()) {
                            NetworkTask.this.mRequest.finish("not-modified");
                            NetworkTask.this.mRequest.notifyListenerResponseNotUsable();
                        } else {
                            AsyncRequestQueue.access$500(AsyncRequestQueue.this).execute(AsyncRequestQueue.this.new NetworkParseTask(NetworkTask.this.mRequest, networkResponse));
                        }
                    }

                    @Override // com.android.volley.AsyncNetwork.OnRequestComplete
                    public void onError(VolleyError volleyError) {
                        volleyError.setNetworkTimeMs(SystemClock.elapsedRealtime() - jElapsedRealtime);
                        AsyncRequestQueue.access$500(AsyncRequestQueue.this).execute(AsyncRequestQueue.this.new ParseErrorTask(NetworkTask.this.mRequest, volleyError));
                    }
                });
            }
        }
    }

    class NetworkParseTask<T> extends RequestTask<T> {
        NetworkResponse networkResponse;

        NetworkParseTask(Request<T> request, NetworkResponse networkResponse) {
            super(request);
            this.networkResponse = networkResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            Response<T> networkResponse = this.mRequest.parseNetworkResponse(this.networkResponse);
            this.mRequest.addMarker("network-parse-complete");
            if (this.mRequest.shouldCache() && networkResponse.cacheEntry != null) {
                if (AsyncRequestQueue.access$100(AsyncRequestQueue.this) != null) {
                    AsyncRequestQueue.access$200(AsyncRequestQueue.this).execute(AsyncRequestQueue.this.new CachePutTask(this.mRequest, networkResponse));
                    return;
                } else {
                    AsyncRequestQueue.access$500(AsyncRequestQueue.this).execute(AsyncRequestQueue.this.new CachePutTask(this.mRequest, networkResponse));
                    return;
                }
            }
            AsyncRequestQueue.access$700(AsyncRequestQueue.this, this.mRequest, networkResponse, false);
        }
    }

    class CachePutTask<T> extends RequestTask<T> {
        Response<?> response;

        CachePutTask(Request<T> request, Response<?> response) {
            super(request);
            this.response = response;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AsyncRequestQueue.access$100(AsyncRequestQueue.this) != null) {
                AsyncRequestQueue.access$100(AsyncRequestQueue.this).put(this.mRequest.getCacheKey(), this.response.cacheEntry, new AsyncCache.OnWriteCompleteCallback() { // from class: com.android.volley.AsyncRequestQueue.CachePutTask.1
                    @Override // com.android.volley.AsyncCache.OnWriteCompleteCallback
                    public void onWriteComplete() {
                        AsyncRequestQueue.access$700(AsyncRequestQueue.this, CachePutTask.this.mRequest, CachePutTask.this.response, true);
                    }
                });
            } else {
                AsyncRequestQueue.this.getCache().put(this.mRequest.getCacheKey(), this.response.cacheEntry);
                AsyncRequestQueue.access$700(AsyncRequestQueue.this, this.mRequest, this.response, true);
            }
        }
    }

    private void finishRequest(Request<?> request, Response<?> response, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        if (z) {
            int i5 = i2 + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            request.addMarker("network-cache-written");
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            int i8 = i7 % 2;
        }
        request.markDelivered();
        getResponseDelivery().postResponse(request, response);
        request.notifyListenerResponseReceived(response);
    }

    private static PriorityBlockingQueue<Runnable> getBlockingQueue() {
        int i = 2 % 2;
        PriorityBlockingQueue<Runnable> priorityBlockingQueue = new PriorityBlockingQueue<>(11, new Comparator<Runnable>() { // from class: com.android.volley.AsyncRequestQueue.3
            @Override // java.util.Comparator
            public int compare(Runnable runnable, Runnable runnable2) {
                if (!(runnable instanceof RequestTask)) {
                    return runnable2 instanceof RequestTask ? -1 : 0;
                }
                if (runnable2 instanceof RequestTask) {
                    return ((RequestTask) runnable).compareTo((RequestTask) runnable2);
                }
                return 1;
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return priorityBlockingQueue;
        }
        throw null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 149461. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context r62, int r63, int r64, int r65) {
        /*
            Method dump skipped, instruction units count: 14946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.AsyncRequestQueue.TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context, int, int, int):java.lang.Object[]");
    }

    static {
        char[] cArr = new char[2171];
        ByteBuffer.wrap("±ÿÄÊ[\u0091îQe%û¢\u000e¾\u0085t\u0018P¯^%ß¸¹ÏxB>ØìoÀâ\u0088k\u007f\u001e\u0003\u0081[4\u0083¿£!$Ôu_½Â\u008cuÙÿ\u001fb~\u0015¬\u0098Ä\u00023µ\r8D£\u0085VëØ6Coö\u008cy\u0099ìÑ\u0096\u0019\u0019l\u008c£±³ÄÏ[\u0097îOeoûè\u000e¹\u0085q\u0018@¯\u0015%Ó¸²Ï`B\bØîoÌâ\u009cy^\u008c\u001d\u0002í\u0099 ,m£E6\u0019LÐ±³ÄÏ[\u0097îOeoûè\u000e¹\u0085q\u0018@¯\u0015%Ó¸²Ï`B\bØíoÜâ\u0082yX\r\u009cx÷ç¤ReÙ@GÍ²\u00969V¤~\u00130\u0099ð\u0004Ás@þ\u0017dÝÓî^¥Å}0\u001e¾Î% \u0090R\u001fh\u008a6ðï\u007f\u0089êWQ\u0007ßaª\u001c5T\u0080\u0088\u000b½\u00959`cëáv\u0086ÁÓK\u0007Öc±³ÄÎ[\u0086îZeoûü\u000e¿\u0085p\u0018\n¯\u0003%È¸®Ïxº\u0086ÏíP£åon\u0014ðÈ\u0005\u0087\u008e\u0007\u0013C¤\u0000.Â³\u009bÄKI\u0007Óïdñé\u00adro±³ÄÏ[\u0093îMe!û \u000eø\u0085~\u0018T¯\u0006%Ó¸¯ÏnB8w_\u0002u\u009dm(ê£\u009e=QÈ\u0013C\u0082Þçi§ão~\u0002\tÖ\u0084\u008f\u001eK©K$3¿ïJ\u0087Äg_\u0005êÀeäðíºÞÏôPìåkn\u001fðÐ\u0005\u0092\u008e\u0003\u0013f¤&.î³\u0083ÄWI\u000eÓÊdÊé²rn\u0087\u0006\tæ\u0092\u0084'A¨e=oxf\r\r\u0092^'\u009f¬á2?ÇnLçÑ\u009dfÏì\rq;\u0006±\u008bë\u0011)¦\u001e+[°ÀEäË3A'4\u001b«L\u001e\u008e\u0095ö\u000b.±³ÄØ[\u008bîJe4ûê\u000e»\u00852\u0018F¯\u001a%Ô¸îÏfB2ØóoÐâºyv\u008co\u0002ç\u0099µ,r£S6@L×Ã¬Vdí%cêöÈ\r\u0082¼\u0010É{V(ãéh\u0097öI\u0003\u0018\u0088\u0091\u0015å¢¹(wµMÂÅO\u0091ÕPbsï\u0019tÕ\u0081Ì\u000fZ\u0094\u0001!Ó®õ±³ÄØ[\u008bîJe4ûê\u000e»\u00852\u0018H¯\u001a%Ø¸îÏdB>ØüoËâ\u0089yV\u008c7\u0002ß\u0099\u009d,o£T6\u0002LÄÃíVyí>±³ÄÏ[\u0097îOeoûá\u000e³\u0085p\u0018Q¯\u0014%Ï¸¤Ï{B#±îÄÄ[Üî[e5ûæ\u000eº\u0085y\u0018\n¯\u001b%Õ¸²Ï|(L]pÂ-wôü\u009bb\u001f\u0097\u0006\u001cÆ\u0081î¢/×GH\u001cýÊv¿è<\u001d,\u0096è\u000bÔ¼\u008a6U«$ÜçQ¿Ëg|Tñ\u0003n6\u001b\n\u0084[1\u0088º÷$-±îÄÄ[ÜîIe2ûà\u000e²\u0085h\u0018G¯\u0007%\u0094¸¬ÏiB9ØëoÃâ\u008dyX\u008c6\u0002ü\u0099¢,z£T%ÝPèÏºzfq0\u0004\u0012\u009b\\.\u0096¥õ; Î~EïØ\u008boÖå\u0015x3\u000f¶\u0082ï\u0018l¯\u001d\"U¹\u0085LëÂ2Y\"ì¤c\u008aöÄ\u008cF\u0003y\u0096·-æ£!6$ÍU@\u0099×Õm\bà|w \n\u0092\u0081×\u0017\u000fªS!½´ýü°\u0089\u0092\u0016Ü£\u0016(u¶ CþÈoU\u000bâVh\u0095õ³\u00826\u000fo\u0095ì\"\u009d¯Õ4\u0005ÁkO²Ô¢a$î\n{D\u0001Æ\u008eù\u001b7 f.¡»¤@ÕÍ\u0019ZUà\u0088møú \u0087\u0012\fW\u009a\u0085'ÓÞ%«\u00074I\u0081\u0083\nà\u00945akêúw\u009eÀÃJ\u0000×& £-ú·y\u0000\b\u008d@\u0016\u0090ãþm'ö7C¤Ì\u0080Y\u008a#\u001e¬{9ª±ìÄÎ[\u0080îJe)ûü\u000e¢\u00853\u0018W¯\n%É¸ïÏjB3Ø°oÁâ\u0089yY\u008c7\u0002î\u0099þ,m£I6CLØÃ¢Vi±ìÄÎ[\u0080îJe)ûü\u000e¢\u00853\u0018W¯\n%É¸ïÏjB3Ø°oÁâ\u0089yY\u008c7\u0002î\u0099þ,m£I6CLÙÃ Vi±ìÄÎ[\u0080îJe)ûü\u000e¢\u00853\u0018W¯\n%É¸ïÏjB3Ø°oÁâ\u0089yY\u008c7\u0002î\u0099þ,m£I6CLÙÃ\u00adVi±êÄÉ[\u009dîAe3ûé¡,ÔDK\u001fþÉu¼ë?\u001e$\u0095í\bß¿\u00995I¨;ßäÍM¸n':\u0092æ\u0019\u0080\u0087]r\u0014ùÉd÷\u0082Ò÷¹hêÝ+VUÈ\u008b=Ú¶S+#\u009c`\u0016º\u008bÍü\fqAë\u0090\\¶ÑæJu¿T1\u0081ªß\u001f\u001a\u0090(\u0005{\u007f¦ð\u008fe\u0018ÞIP\u008aÅ²>ê³9$B\u009e\u0099\u0013Ö\u0084\nù7rkä¥Y²Ò\u000fGS¹\u0089±³ÄÝ[\u0097îWe$ûà\u000e¤\u00852\u0018H¯\u001a%Ø¸÷Ï<BxØöoÒâÃyZ\u008c7\u0002í\u0099¹,p£\b6\u001dLÆÃªVgí0cêöÞ\rÀ\u0080B\u0017\u0015\u00adå ¶·vÊWA\u001c×\u0098j\u008eákµ\u0093Àý_·êwa\u0004ÿÀ\n\u0084\u0081\u0012\u001ch«:!ø¼×Ë\u001cFXÜÖkòæã}s\u0088\u0015\u0006Ê\u009d\u009f(R§v2\"HçÇ\u0086RXé_gÏòî\t \u0084q\u00133©Ü$\u0081³\u0017ÎsE CX63©`\u001c¡\u0097ß\t\u0001üPwÙê£]ñ×3J\u001c=×°\u0093*\u0016\u009d\"\u0010h\u008b¥~Íð=kZÞ\u009dQ©Äê¾\u00001A¤\u008f\u001fÎ\u0091\u0016\u0004>ÿcr¿åô_\u0005Ò\u0014E\u00918»³ô%s\u0098e\u0013\u0080±³ÄÎ[\u0086îZeoûæ\u000e¸\u0085t\u0018P¯\\%Ó¸¯ÏaB#Ø°oÆâ\u0080yT\u008c7\u0002í\u0099£,z£T6\u001bLÝÃ Voí\u007fcêöÄ±ÛÄÎ[\u009cî@e-ûà\u000e¢\u0085t\u0018K¯\u001dûô\u008eØ\u0011\u0084¤J/2±åD¥±ÿÄÃ[\u0080îVe-ûæ\u000e£\u0085pE÷0Ý¯Å\u001aP\u0091+\u000fùú«qqì^[\u001eÑ\u008dL¼;t¶8,î\u009bß\u0016\u0090ç\u009c\u0092¿\rë¸73\u000e\u00adÏXÐ±ûÄÎ[\u009cî\\e2ûæ\u000eµ\u0007´r\u0081íÓX\u0013Ó}M©¸ú3\r®\u0013\u0019\u0004\u0093Ãé¨\u009c\u009d\u0003Ï¶\u000f=a£µVæÝ\u0011@\u000f÷\u0018}ßàÍ\u0097m\u001a0éí\u009cÇ\u0003ß¶J=1£ãV±Ýk@D÷\u0004}\u0097à¯\u0097d\u001a0\u0080ø7ÊPC%cº5S¥&\u009a¹Û\f\t\u0087}\u0019§ìåg3à¢\u0095¤\ný¿f4mª\u0085_ÇÔ\u0016I2þat é\u009e\u009e\u0011\u0013G\u0089\u0093>ú³Ð(,ÝOS\u0099ÈÂ}\u0005±ÝÄÅ[\u0096îKe/ûæ\u000e²\u0085=\u0018w¯7%ñ¸áÏjB\"Ø÷oÉâ\u0098y\u001b\u008c$\u0002æ\u0099¢,?£^6UL\u0082±ÝÄÅ[\u0096îKe/ûæ\u000e²\u0085=\u0018w¯7%ñ¸áÏjB\"Ø÷oÉâ\u0098y\u001b\u008c$\u0002æ\u0099¢,?£^6UL\u0082Ã\u009cV<íeâØ\u0097ò\bê½g6\u0017¨Ë]\u0084Ö\\Ksü7vé±ûÄÄ[\u009eî]e&ûæ\u000e¥\u0085u±êÄÉ[\u009dîAexû¹¢~×ZH\fýÊv¸èjPó%ÙºÁ\u000fT\u0084/\u001aýï¯duùZN\u001aÄ\u0089Y¾.g£+9í\u008eÜ\u00077r\u001dí\u0005X\u008bÓüM$¸a3¡®\u0091\u0019\u0084\u0093\u0012\u000e}y¼ôûêÕ±îÄÄ[ÜîJe%ûì\u000e£\u0085o\u0018Aã\u0006d\u009d\u0011·\u008e¯;(°F.\u0095ÛÉP\nÍyzpð»mÝ\u001a\u001f\u0097Q\r\u008eº¢±úÄÞ[\u009eîUe\u001fû÷\u000eî\u0085+Xü-Ö²Î\u0007I\u008c'\u0012ôç¨lkñ\u0018F\u0007ÌÁQ½&}« 1þ\u0086Ç\u000b\u008c\u0090@e>ëï±ûÄÎ[\u009cî\\e2ûæ\u000eµ\u00852\u0018W¯\u0017%Ñ¸îÏoB2ØðoÀâ\u009eyR\u008c!\u0084oñZn\bÛÈP¦Îr;!°Ö-È\u009aß\u0010\u0018\u008dzúïw§íaZn×\u0000L\u0097¹à72¬#\u0019î\u0096Ü\u0003\u009cyRö>cýØ\u009aVtÃ\u000b8LIë<Þ£\u008c\u0016L\u009d\"\u0003öö¥}\"àSW\fÝÅ@¶7tº\" Ñ\u0097Æ\u001a\u0098\u0081@t}úþa¥Ôa[SÎ\u000f´Í;°±ûÄÎ[\u009cî\\e2ûæ\u000eµ\u00852\u0018R¯\u0011%Õ¸¹Ï0BaØîo\u008aâ\u009ayY\u008c-\u0002ñ\u0099è,)£V±ûÄÄ[\u009dî^e,ûê\u000eù\u0085n\u0018@¯\u0018%å¸¦ÏxB?ØñoËâ\u0089yd\u008c:\u0002±\u0099æ,0£A6\bLÚÃ¦Vxí8cûöø\r\u0096\u0080\r\u0017JÜ¾©\u00946\u008c\u0083\u000b\b\u007f\u0096°còè!u\u001bÂBH\u008eÕô¢*±îÄÄ[Üî[e/ûà\u000e¢\u0085t\u0018I¯\u0012%Ý¸¤Ï&B5ØëoÌâ\u0080y_\u008cl\u0002ï\u0099¹,q£A6\bLÆÃ³Vxí8cööÓ1cD{Û(nõå\u0091{X\u008e\f\u0005\u008e\u0098â/õ¥2±îÄÄ[Üî[e5ûæ\u000eº\u0085y\u0018\n¯\u0017%Ó¸²ÏxB;ØÿoÜâÂyR\u008c&±èÄÎ[\u0081îMem±õÄÅ[\u009bîMenûü\u000e \u0085~\u0018\n¯\u0002%ß¸¬Ï}BzØîo×â\u0083yK\u008c1¤\u008bÑ¨Nùû*p\bî\u0081\u001bÇ\u0090U\r/ºt0µ\u00adÉÚ\u0005WTÍ\u0081z°\u007f!\n\u0002\u0095S \u0080«¢50À|KÿÖ\u008eaÞë\u001dvh\u0001\u009b\u008cø\u00163¡\u0004,E·\u0085Bï½MÈnW?âìiÎ÷\\\u0002\u0010\u0089\u0093\u0014è£°)~´>ÃÌN\u0092ÔPcvî%uï\u0080\u009b\u0085AðkosÚýQ\u008aÏR:\u0017±×,ç\u009bò\u0011t\u008c\u0000ûÃv\u008aì^[cÖ'Mº¸\u009c6C\u00ad\u0012\u0018Å\u0097í±îÄÄ[Üî[e/ûà\u000e¢\u00853\u0018U¯\u0016%×¸´Ï&B6ØèoÁâ³yU\u008c#\u0002ä\u0099µ±îÄÄ[ÜîVe$ûâ\u000eø\u0085\u007f\u0018Q¯\u001a%Ö¸¥Ï&B1Ø÷oËâ\u008by^\u008c0\u0002ù\u0099¢,v£H6\u0019?\u0086J¬Õ´`!ëZu\u0088\u0080Ú\u000b\u0000\u0096/!o«ü6ËA\u0015ÌVV\u009aá©lª÷5\u0002C\u008c\u008f\u0017ß¢\u0012-<¸uÂ®MÂØ\fcM±îÄÄ[ÜîJe9ûü\u000e¢\u0085x\u0018I¯]%Ø¸´ÏaB;Øúo\u008bâ\u008ayR\u008c,\u0002î\u0099µ,m£V6\u001fLÝÃ\u00adV~±îÄÄ[ÜîJe9ûü\u000e¢\u0085x\u0018I¯,%ß¸¹Ï|ByØüoÐâ\u0085yW\u008c&\u0002§\u0099¶,v£H6\nLÑÃ±Vzí#cñöÉ\r\u009a±îÄÄ[ÜîOe%ûá\u000e²\u0085r\u0018V¯]%Ø¸´ÏaB;Øúo\u008bâ\u008ayR\u008c,\u0002î\u0099µ,m£V6\u001fLÝÃ\u00adV~±îÄÄ[ÜîOe%ûá\u000e²\u0085r\u0018V¯,%Þ¸\u00adÏcB:Ø°oÇâ\u0099yR\u008c.\u0002í\u0099þ,y£O6\u0003LÓÃ¦Vxí!cêöÎ\r\u0080\u0080A±´'¢R\u0099+Æ±µ±³ÄÏ[\u0097îOeoûþ\u000e³\u0085p\u0018Q¯,%Ê¸¨ÏxB2±³ÄÏ[\u0097îOeoûü\u000e¹\u0085~\u0018O¯\u0016%Î¸îÏjB6ØíoÀâ\u008eyZ\u008c,\u0002í\u0099\u008f,x£C6\u0003LÍÃ§ÇG²;-c\u0098»\u0013\u009b\u008d\bxMó\u008an»ÙâS:Î\u001a¹\u009b4Æ®\u0004\u0019(\u0094|xy\r\u0005\u0092]'\u0085¬¥26ÇsL´Ñ\u0085fÜì\u0004q$\u0006³\u008bø\u00119¦\u001a+B\u008f\u0084úïe¼Ð}[XÅÉ0\u0084»G&f\u0091\u001b\u001bù\u0086\u0084ñ^|\u0003æÌ±³ÄØ[\u008bîJe4ûê\u000e»\u00852\u0018H¯\u001a%Ø¸îÏdB>ØüoÆâ³yV\u008c#\u0002å\u0099¼,p£E62LÐÃ¦Vhí$cÿöø\r\u009f\u0080P\u0017\u0011\u00adþ ü·jÊO±³ÄÏ[\u0097îOeoûí\u000e¥\u0085i\u0018{¯\u0014%Ê¸²N_;#¤{\u0011£\u009a\u0083\u0004\u0001ñIz\u0085ç\u0097PëÚ?G@0\u0081P\u0007%{º#\u000fû\u0084Û\u001aHï\rdÊùûN¢ÄzYZ.Þ£\u00909^\u008ew\u00037\u0098ãm\u0092ãXx\u0016ÍÏÚ\u000e¯e06\u0085÷\u000e\u0089\u0090We\u0006î\u008fsõÄ§NeÓS¤Ù)\u0083³A\u0004z\u0089\"\u0012òç\u0099i[ò\u0001GÆÈþ]¢'V¨\u0014=Ù\u0086\u0085\b\u000b\u009dif<±³ÄÏ[\u0097îOeoûí\u000e¥\u0085i\u0018E¯\u0010%Ù¸¤·qÂ\r]Uè\u008dc\u00adý/\bg\u0083«\u001e\u0081©È#\n¾lÓ\u0083¦ÿ9§\u008c\u007f\u0007_\u0099Ýl\u0095çYzyÍ&GíÚ\u009fgÉ\u0012µ\u008dí85³\u0015-\u0097ØßS\u0013Î1y{ó©nÞ±³ÄÏ[\u0097îOeoûí\u000e¥\u0085i\u0018R¯\u001e%É¸¦ÔQ¡->u\u008b\u00ad\u0000\u008d\u009e\u000fkGà\u008b}¶Êö@9ÝJª\u009a'Ö±³ÄÏ[\u0097îOeoûí\u000e¥\u0085i\u0018{¯\u001a%×¸¤6\u0083CÿÜ£i}â\u0011|\u0090\u0089\u0082\u0002B\u009fc(-¢æ?\u009eHYÅ\u0003_Ýèºeòþs\u000b\u0010\u0085\u0096\u001e\u0082«\\$b±6T÷!\u0082¾Ø\u000b\t\u0080+\u001e¼ëû`7ý\u0004JXÀ\u0089]ö*c§Q=©\u008a\u0095\u0007û\u009c\u0017igç¿|ñÉ?F$ÓF©\u009c&ã³+\bg\u0086\u009fó÷l¬ÙzR\u000fÌ\u008c9\u0093²^/x\u00980\u0012ä\u008f\u0099øW±¬ÄÍ[\u0094î\u0019ez¥ªÐÂO\u0099úOq:ï¹\u001a¼\u0091a\fQ»\f1\u008c¬µÛpV>ÌôR\u0092'°¸ú\r<\u0086E\u0018\u0089íÜfZû*LuÆ¿[Ì,\u0007¡W;\u0084\u008c¤\u0001«\u009a!oD±ðÄÂ[\u0090î~e\fûÊ\u000e\u0085\u0085B\u0018F¯\u0000%Î¸ïÏ{B8ùq\u008c\f\u0013D¦\u0098-\u00ad³ FqÍ»P\u008fçÐm'ð`\u0087¥\nñ\u00909'\u0004ª]1×ÄøJ&Ñ~±þÄÇ[\u0087î\\e3ûû\u000e·\u0085~\u0018O¯\u0000·\u0096Âë]£è\u007fcJýÇ\b\u009c\u0083M\u001eo©\"#ì±³ÄÏ[\u0093îMe!û \u000e²\u0085r\u0018S¯\u001d%Ö¸®ÏiB3Øío\u008aâÂy_\u008c2\u0002¦\u0099±,o£V6\u001eL\u009aÃ»Vgí=\u0016bc\nüQI\u0087Âò\\q©d\"¼¿\u0080\bË\u0082\u0005\u001fvh¶¾\u0012Ë\rTWá\u0094jïô/\u0001l\u008a¼±³ÄÏ[\u0093îMe!û \u000e»\u0085t\u0018W¯\u0010%\u0095¸±ÏzB8ØøoÌâ\u0080y^\u008c1\u0002¦\u0099³,j£T6BL\u0084ÃìVií>cõö\u0089\r\u0083\u0080\\\u0017\u001f\u00adù ½·oÊIA\u001d×ÂjÓáit6\u008a÷\u0001Ô\u0094\u0081+Z¾\u001b".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2171);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cArr;
        b = 6483436031781225643L;
    }

    private static String $$e(short s, byte b2, int i) {
        int i2 = s + 4;
        byte[] bArr = $$c;
        int i3 = b2 * 4;
        int i4 = 115 - (i * 3);
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 += -i3;
        }
        while (true) {
            i5++;
            i2++;
            bArr2[i5] = (byte) i4;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            i4 += -bArr[i2];
        }
    }

    public static class Builder {
        private final AsyncNetwork mNetwork;
        private AsyncCache mAsyncCache = null;
        private Cache mCache = null;
        private ExecutorFactory mExecutorFactory = null;
        private ResponseDelivery mResponseDelivery = null;

        public Builder(AsyncNetwork asyncNetwork) {
            if (asyncNetwork == null) {
                throw new IllegalArgumentException("Network cannot be null");
            }
            this.mNetwork = asyncNetwork;
        }

        public Builder setExecutorFactory(ExecutorFactory executorFactory) {
            this.mExecutorFactory = executorFactory;
            return this;
        }

        public Builder setResponseDelivery(ResponseDelivery responseDelivery) {
            this.mResponseDelivery = responseDelivery;
            return this;
        }

        public Builder setAsyncCache(AsyncCache asyncCache) {
            this.mAsyncCache = asyncCache;
            return this;
        }

        public Builder setCache(Cache cache) {
            this.mCache = cache;
            return this;
        }

        private ExecutorFactory getDefaultExecutorFactory() {
            return new ExecutorFactory() { // from class: com.android.volley.AsyncRequestQueue.Builder.1
                @Override // com.android.volley.AsyncRequestQueue.ExecutorFactory
                public ExecutorService createNonBlockingExecutor(BlockingQueue<Runnable> blockingQueue) {
                    return getNewThreadPoolExecutor(1, "Non-BlockingExecutor", blockingQueue);
                }

                @Override // com.android.volley.AsyncRequestQueue.ExecutorFactory
                public ExecutorService createBlockingExecutor(BlockingQueue<Runnable> blockingQueue) {
                    return getNewThreadPoolExecutor(4, "BlockingExecutor", blockingQueue);
                }

                @Override // com.android.volley.AsyncRequestQueue.ExecutorFactory
                public ScheduledExecutorService createNonBlockingScheduledExecutor() {
                    return new ScheduledThreadPoolExecutor(0, getThreadFactory("ScheduledExecutor"));
                }

                private ThreadPoolExecutor getNewThreadPoolExecutor(int i, String str, BlockingQueue<Runnable> blockingQueue) {
                    return new ThreadPoolExecutor(0, i, 60L, TimeUnit.SECONDS, blockingQueue, getThreadFactory(str));
                }

                private ThreadFactory getThreadFactory(final String str) {
                    return new ThreadFactory() { // from class: com.android.volley.AsyncRequestQueue.Builder.1.1
                        @Override // java.util.concurrent.ThreadFactory
                        public Thread newThread(Runnable runnable) {
                            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                            StringBuilder sb = new StringBuilder("Volley-");
                            sb.append(str);
                            threadNewThread.setName(sb.toString());
                            return threadNewThread;
                        }
                    };
                }
            };
        }

        public AsyncRequestQueue build() {
            Cache cache = this.mCache;
            if (cache == null && this.mAsyncCache == null) {
                throw new IllegalArgumentException("You must set one of the cache objects");
            }
            if (cache == null) {
                this.mCache = new ThrowingCache();
            }
            if (this.mResponseDelivery == null) {
                this.mResponseDelivery = new ExecutorDelivery(new Handler(Looper.getMainLooper()));
            }
            if (this.mExecutorFactory == null) {
                this.mExecutorFactory = getDefaultExecutorFactory();
            }
            return new AsyncRequestQueue(this.mCache, this.mNetwork, this.mAsyncCache, this.mResponseDelivery, this.mExecutorFactory);
        }
    }
}
