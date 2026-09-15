package com.koushikdutta.async;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.internal.auth.zzgx;
import com.koushikdutta.async.AsyncServer;
import defpackage.DefaultSurfaceProcessorExternalSyntheticLambda10;
import defpackage.DefaultSurfaceProcessorExternalSyntheticLambda14;
import defpackage.DefaultSurfaceProcessorExternalSyntheticLambda5;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.SessionProcessor;
import defpackage.SurfaceEdgeExternalSyntheticLambda3;
import defpackage.abortCapture;
import defpackage.failAllPendingSnapshots;
import defpackage.getServiceInfo;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.isSmallerByArea;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.lambdaonInputSurface0androidxcameracoreprocessingDefaultSurfaceProcessor;
import defpackage.lambdaonInputSurface1androidxcameracoreprocessingDefaultSurfaceProcessor;
import defpackage.lambdaonInputSurface2androidxcameracoreprocessingDefaultSurfaceProcessor;
import defpackage.lambdaonOutputSurface3androidxcameracoreprocessingDefaultSurfaceProcessor;
import defpackage.lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor;
import defpackage.lambdasafeProcess0androidxcameracoreprocessingInternalImageProcessor;
import defpackage.lambdasnapshot6androidxcameracoreprocessingDefaultSurfaceProcessor;
import defpackage.lambdaupdateTransformation3androidxcameracoreprocessingSurfaceEdge;
import defpackage.setVideoStabilizationMode;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public final class AsyncServer {
    private static int INotificationSideChannel;
    private static ExecutorService TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final Comparator<InetAddress> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final ThreadLocal<AsyncServer> asInterface;
    public static ExecutorService b;
    private static char cancel;
    private static int cancelAll;
    private static long notify;
    public Thread TuitionPaymentFragmentbindingInflater1;
    PriorityQueue<b> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private lambdaonInputSurface1androidxcameracoreprocessingDefaultSurfaceProcessor f838a;
    private String asBinder;
    private int d;
    private boolean g;
    private static final byte[] $$c = {57, -56, 23, -36};
    private static final int $$f = 218;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {49, 89, 41, 48, 4, 21, -45, 58, 5, 1, -22, 28, 23, -15, -11, 23, 25, 2, -45, 59, -15, 14, 9, -5, 7, 16, -1, -12, 28, 23, -15, 20, 39, -6, 17, -5, 12, 5, -24, 23, 30, -6, -2, 15, 12, -40, 50, -11, 12, 12, -2, 15, 12, -12, 13, 11, -4, 11, 11, -1, -24, 43, -2, 12, -5, 25, -9, 19, -59};
    private static final int $$e = 194;
    private static final byte[] $$a = {25, -93, -120, -48, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 16;
    private static int INotificationSideChannelDefault = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int onTransact = 0;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~((~i5) | i7 | i4);
        int i9 = ~i4;
        int i10 = (~(i7 | i5)) | (~(i7 | i9)) | (~(i9 | i5));
        int i11 = (~(i9 | i)) | i5;
        int i12 = i + i5 + i2 + ((-946781377) * i3) + ((-59450693) * i6);
        int i13 = i12 * i12;
        int i14 = (((-143250568) * i) - 346488832) + (357422218 * i5) + (i8 * (-1897147255)) + ((-1897147255) * i10) + (1897147255 * i11) + ((-2040397824) * i2) + ((-1205993472) * i3) + ((-1651113984) * i6) + ((-884408320) * i13);
        int i15 = ((i * 358501064) - 1042343473) + (i5 * 358500518) + (i8 * (-273)) + (i10 * (-273)) + (i11 * 273) + (i2 * 358500791) + (i3 * (-249165559)) + (i6 * 1905372845) + (i13 * 573505536);
        int i16 = i14 + (i15 * i15 * (-553189376));
        if (i16 != 1) {
            return i16 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : b(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.koushikdutta.async.AsyncServer.$$a
            int r8 = r8 * 15
            int r1 = 53 - r8
            int r7 = r7 * 52
            int r7 = 108 - r7
            int r6 = r6 * 2
            int r6 = 84 - r6
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r3 + 1
            int r7 = r7 + (-11)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.koushikdutta.async.AsyncServer.c(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 28
            int r6 = r6 + 4
            int r7 = r7 * 19
            int r7 = r7 + 84
            int r8 = r8 * 9
            int r0 = r8 + 29
            byte[] r1 = com.koushikdutta.async.AsyncServer.$$d
            byte[] r0 = new byte[r0]
            int r8 = r8 + 28
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r7
            r4 = r2
            r7 = r6
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r3 = r3 + r6
            int r6 = r3 + (-6)
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.koushikdutta.async.AsyncServer.f(byte, int, short, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        AsyncServer asyncServer = (AsyncServer) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 23;
        INotificationSideChannelDefault = i3 % 128;
        int i4 = i3 % 2;
        lambdaonInputSurface1androidxcameracoreprocessingDefaultSurfaceProcessor lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor = asyncServer.f838a;
        int i5 = i2 + 39;
        INotificationSideChannelDefault = i5 % 128;
        int i6 = i5 % 2;
        return lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor;
    }

    static /* synthetic */ ThreadLocal TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 27;
        int i3 = i2 % 128;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        ThreadLocal<AsyncServer> threadLocal = asInterface;
        int i5 = i3 + 109;
        INotificationSideChannelDefault = i5 % 128;
        int i6 = i5 % 2;
        return threadLocal;
    }

    static /* synthetic */ Comparator TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 1;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        Comparator<InetAddress> comparator = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i5 = i2 + 7;
        RemoteActionCompatParcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            return comparator;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaonInputSurface1androidxcameracoreprocessingDefaultSurfaceProcessor lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 35;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor);
        SurfaceEdgeExternalSyntheticLambda3.b(lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor);
        int i4 = INotificationSideChannelDefault + 37;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Runnable {
        Runnable TuitionPaymentFragmentbindingInflater1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Handler TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        ThreadQueue b;
        private static final byte[] $$c = {0, -94, -62, -97};
        private static final int $$d = 93;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {39, -79, 42, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
        private static final int $$b = 181;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1147772787253280063L;

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r5, byte r6, short r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = com.koushikdutta.async.AsyncServer.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$a
                int r7 = r7 * 3
                int r7 = 84 - r7
                int r6 = r6 * 4
                int r1 = 53 - r6
                int r5 = r5 + 3
                byte[] r1 = new byte[r1]
                int r6 = 52 - r6
                r2 = 0
                if (r0 != 0) goto L16
                r4 = r6
                r3 = r2
                goto L2a
            L16:
                r3 = r2
            L17:
                int r5 = r5 + 1
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r6) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L26:
                int r3 = r3 + 1
                r4 = r0[r5]
            L2a:
                int r4 = -r4
                int r7 = r7 + r4
                int r7 = r7 + (-11)
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.koushikdutta.async.AsyncServer.TuitionPaymentFragmentspecialinlinedviewModeldefault1.c(byte, byte, short, java.lang.Object[]):void");
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte b) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
            int i = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.blue(0) + 46400), 'X' - AndroidCharacter.getMirror('0'), 20 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
            Object[] objArr = new Object[1];
            a(new char[]{56641, 43696, 24489, 56608, 49785, 46068, 36483, 35443, 32690, 41370, 11303, 28491, 38934, 1820, 18689, 52362, 15084, 64184, 59135, 37464, 22364, 23012, 1147, 30718, 61486, 16232}, -ImageFormat.getBitsPerPixel(0), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(new char[]{58565, 56742, 2189, 58528, 46445, 11445, 55714, 5424, 17962, 54912, 31491, 61558, 41368, 28696, 7783, 21484, 888, 36272, 45514}, -((byte) KeyEvent.getModifierMetaStateMask()), objArr2);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
            long j = -518;
            long j2 = (j * 4341129060307399282L) + (j * (-2243871885565440295L));
            long j3 = 519;
            long j4 = -1;
            long jIdentityHashCode = System.identityHashCode(this);
            long j5 = (j4 ^ 4341129060307399282L) | (jIdentityHashCode ^ j4);
            long j6 = j2 + (((j5 ^ j4) | (-2243871885565440295L)) * j3) + (((long) (-519)) * (((j5 | (-2243871885565440295L)) ^ j4) | (((-216476342416310533L) | jIdentityHashCode) ^ j4))) + (j3 * (((jIdentityHashCode | (-2243871885565440295L)) ^ j4) | 4341129060307399282L));
            int i3 = 0;
            long j7 = jLongValue;
            while (true) {
                int i4 = 8;
                if (i3 != 10) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - View.MeasureSpec.makeMeasureSpec(i, i)), 59 - (TypedValue.complexToFloat(i) > 0.0f ? 1 : (TypedValue.complexToFloat(i) == 0.0f ? 0 : -1)), 18 - KeyEvent.keyCodeFromString(""), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                    int i6 = i;
                    long j8 = j7;
                    while (true) {
                        int i7 = i;
                        while (i7 != i4) {
                            i5 = (((((int) (j8 >> i7)) & 255) + (i5 << 6)) + (i5 << 16)) - i5;
                            i7++;
                            i4 = 8;
                        }
                        if (i6 != 0) {
                            break;
                        }
                        i6++;
                        j8 = j6;
                        i = 0;
                        i4 = 8;
                    }
                    if (i5 == i2) {
                        break;
                    }
                    j7 -= 1024;
                    i3++;
                    i = 0;
                } else {
                    Object[] objArr3 = new Object[1];
                    a(new char[]{11909, 2390, 18650, 12015, 24976, 48043, 39394, 33343, 35895, 633, 15185, 26452, 27610, 42151, 24079, 50431, 51490, 22873, 61853, 39439}, 1 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr3);
                    Class<?> cls2 = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    a(new char[]{43123, 49017, 49290, 43034, 55226, 46023, 4513, 35420, 2715, 46163, 45844, 28463, 60675, 4807, 54911, 52354, 20452, 61293, 31180, 37483}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, objArr4);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr5 = {1251648098};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.alpha(0) + 46038), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1134, 18 - TextUtils.getOffsetBefore("", 0), 807763283, false, null, new Class[]{Integer.TYPE});
                        }
                        Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -575339606, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr5), false};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                            int trimmedLength = 1031 - TextUtils.getTrimmedLength("");
                            int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            byte[] bArr = $$a;
                            byte b = (byte) (-bArr[4]);
                            byte b2 = bArr[6];
                            Object[] objArr7 = new Object[1];
                            c(b, b2, b2, objArr7);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState, trimmedLength, scrollBarFadeDuration, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - TextUtils.indexOf("", "", 0, 0)), 1117 - View.resolveSize(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16), Boolean.TYPE});
                        }
                        Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6);
                        int i8 = ((int[]) objArr8[1])[0];
                        int i9 = ((int[]) objArr8[3])[0];
                        if (i9 == i8) {
                            break;
                        }
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr8[0];
                        if (strArr != null) {
                            for (String str : strArr) {
                                arrayList.add(str);
                            }
                        }
                        Toast.makeText((Context) null, i9 / (((i9 - 1) * i9) % 2), 0).show();
                        break;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            }
            synchronized (this) {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    return;
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
                try {
                    this.TuitionPaymentFragmentbindingInflater1.run();
                    this.b.remove(this);
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.removeCallbacks(this);
                    Object[] objArr9 = null == true ? 1 : 0;
                    Object[] objArr10 = null == true ? 1 : 0;
                } finally {
                    this.b.remove(this);
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.removeCallbacks(this);
                    this.b = null;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null == true ? 1 : 0;
                    this.TuitionPaymentFragmentbindingInflater1 = null == true ? 1 : 0;
                }
            }
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            abortCapture abortcapture = new abortCapture();
            char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
            int i3 = 4;
            abortcapture.b = 4;
            while (abortcapture.b < cArrB.length) {
                int i4 = $11 + 59;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - i3;
                int i6 = abortcapture.b;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % i3]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 64838);
                        int packedPositionChild = 1355 - ExpandableListView.getPackedPositionChild(0L);
                        int iIndexOf = TextUtils.indexOf("", "") + 38;
                        byte b = $$c[0];
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, packedPositionChild, iIndexOf, 894276454, false, $$e(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrB[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 47772), View.combineMeasuredStates(0, 0) + 468, 13 - TextUtils.indexOf("", ""), 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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
            int i7 = $10 + 9;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(short r6, int r7, byte r8) {
            /*
                int r6 = r6 * 2
                int r6 = 4 - r6
                int r8 = r8 * 2
                int r0 = r8 + 1
                byte[] r1 = com.koushikdutta.async.AsyncServer.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$c
                int r7 = r7 * 4
                int r7 = r7 + 107
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L17
                r7 = r6
                r3 = r8
                r4 = r2
                goto L2b
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L25:
                r3 = r1[r6]
                r5 = r7
                r7 = r6
                r6 = r3
                r3 = r5
            L2b:
                int r6 = -r6
                int r6 = r6 + r3
                int r7 = r7 + 1
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.koushikdutta.async.AsyncServer.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$e(short, int, byte):java.lang.String");
        }
    }

    public static void TuitionPaymentFragmentbindingInflater1(Handler handler, Runnable runnable) {
        int i = 2 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1((byte) 0);
        ThreadQueue threadQueueTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ThreadQueue.TuitionPaymentFragmentspecialinlinedviewModeldefault2(handler.getLooper().getThread());
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.b = threadQueueTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = handler;
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1 = runnable;
        threadQueueTuitionPaymentFragmentspecialinlinedviewModeldefault2.add(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
        handler.post(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
        threadQueueTuitionPaymentFragmentspecialinlinedviewModeldefault2.queueSemaphore.release();
        int i2 = RemoteActionCompatParcelizer + 37;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: com.koushikdutta.async.AsyncServer$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private static char[] b;
        private /* synthetic */ Semaphore TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ lambdaonInputSurface1androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private static final byte[] $$c = {91, -17, 90, 37};
        private static final int $$d = 224;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {91, -17, 90, 37};
        private static final int $$b = 36;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int asInterface = 1;

        private static void c(int i, int i2, short s, Object[] objArr) {
            int i3 = i * 4;
            int i4 = s + 97;
            byte[] bArr = $$a;
            int i5 = 4 - (i2 * 3);
            byte[] bArr2 = new byte[1 - i3];
            int i6 = 0 - i3;
            int i7 = -1;
            if (bArr == null) {
                i5++;
                i4 = i6 + i4;
            }
            while (true) {
                i7++;
                bArr2[i7] = (byte) i4;
                if (i7 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    byte b2 = bArr[i5];
                    i5++;
                    i4 += b2;
                }
            }
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(b[i + i4])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2187 - Color.green(0), 40 - (ViewConfiguration.getLongPressTimeout() >> 16), 841711447, false, $$e(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 33017), ExpandableListView.getPackedPositionType(0L) + 3011, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25, 321985076, false, $$e(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 36505), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3376, View.resolveSize(0, 0) + 17, -968507904, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
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
            int i5 = $11 + 53;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i7 = $11 + 109;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - TextUtils.indexOf("", "", 0, 0)), 3376 - Color.argb(0, 0, 0, 0), 18 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -968507904, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr);
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            AsyncServer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:102:0x0c6d  */
        /* JADX WARN: Code duplicated, block: B:142:0x0d91  */
        /* JADX WARN: Code duplicated, block: B:213:0x116d  */
        /* JADX WARN: Code duplicated, block: B:404:0x34cf  */
        /* JADX WARN: Code duplicated, block: B:406:0x34de  */
        /* JADX WARN: Code duplicated, block: B:415:0x3507  */
        /* JADX WARN: Code duplicated, block: B:417:0x350a A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:420:0x3514  */
        /* JADX WARN: Code duplicated, block: B:422:0x351e A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:423:0x3520  */
        /* JADX WARN: Code duplicated, block: B:425:0x3524  */
        /* JADX WARN: Code duplicated, block: B:427:0x3527  */
        /* JADX WARN: Code duplicated, block: B:433:0x3556 A[LOOP:10: B:426:0x3525->B:433:0x3556, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:441:0x3596  */
        /* JADX WARN: Code duplicated, block: B:442:0x3598  */
        /* JADX WARN: Code duplicated, block: B:543:0x34eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:570:0x35da A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:571:0x359e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:572:0x359e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:574:0x35cc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:576:0x3590 A[EDGE_INSN: B:576:0x3590->B:439:0x3590 BREAK  A[LOOP:7: B:516:0x3501->B:438:0x3583], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:582:0x356c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:583:0x3566 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x044c -> B:24:0x0314). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:460:0x35da -> B:400:0x3499). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context r74, int r75, int r76, int r77) {
            /*
                Method dump skipped, instruction units count: 14639
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.koushikdutta.async.AsyncServer.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context, int, int, int):java.lang.Object[]");
        }

        static {
            char[] cArr = new char[2154];
            ByteBuffer.wrap("£Q%\u008a®;0¸¹\u0011\u0003É\u0084q\u000eâ\u0097\u009a\u0018\bâ·k=íÖvqøÿAjÊ\u001aL\u009cÕ;_½ Mªñ3mµþ>\u009f\u0087\r\t»\u0019Ó\u009f\b\u0014¹\u008a:\u0003\u0093¹K>ó´`-\u0018¢\u008aX5Ñ¿WTÌóBlûåp\u008cö\to\u0083å(\u009aÌ\u0010^\u0089ÿ\u000fx\u0084\u0018\u0016ð\u0090+\u001b\u009a\u0085\u0019\f°¶h1Ð»C\";\u00ad©W\u0016Þ\u009cXwÃÐMLôÖ\u007f±ù,¨ó.?¥\u0085;\u001f²³\ba\u008fÓ\u0005H\u009c)\u0013 é\u0019`Ãæ{}ãóPJÈÁºG%Þ\u008fT\u0004+Ã¡n8Ý¾X5(\u008c©\u0002\u000e\u0099\u0095±³7i¼È\"O«ó\u0011(\u0096\u009b\u001cB\u0085l\nþðSyÜ½Æ;\u001c°½.:§\u0086\u001dJ\u009aà\u0010t\u0089G\u0006\u0089ü;u¶óY±³7\u007f¼Ø\"O«½\u0011>\u0096\u0098\u001cC\u0085N\nÊðqyÃÿ*d©ê8S\u008dØè^m±³7h¼Ý\"X«½\u0011c\u0096Ò\u001c\u000f\u0085l\nùðUyÂÿ:d£²\u00984\u0015¿ä!8¨Å\u0012U\u0095þ\u001f4\u0086\u0018\t\u009fó.z¨üEgÓénPÅÛ\u0084]\u001fÄ¾N\u00051Î»T\"ù¤+qì÷a|\u0090âLk±Ñ!V\u008aÜ@ElÊë0Z¹Ü?1¤§*\u001a\u0093±\u0018ð\u009ek\u0007Ê\u008dqòºx á\u008dg\\±³7\u007f¼Å\"_«¨\u0011)\u0096\u0091\u001cC\u0085p\nåð^y\u0083ÿ0d¥ê\u001eS\u0082Øþ^\"ÇÏMC±þ7e¼Û\"B«³\u00114±³7\u007f¼Å\"_«¨\u0011)\u0096\u0091\u001cC\u0085~\nåðRy\u0083ÿ2d©ê\u0011S\u0099ØÊ^AÇ\u0091MB2¹¸!!\u0089§A,\u007f\u0095ã\u001bR\u0080Ø\u0006.\u008f£u\u0010ìüj0á\u008a\u007f\u0010öçLfËÞA\fØ1Wª\u00ad\u001d$Ì¢}9æ·^\u000eÖ\u0085\u0085\u0003\u000e\u009aÞ\u0010\u0013oáål|Ã)\u008f¯C$ùºc3\u0094\u0089\u0015\u000e\u00ad\u0084\u007f\u001dL\u0092Ùhbá¿g\fü\u0099r\"Ë¾@ÅÆ]_õÕFª\u00ad \u0000¹²??´P\r\u009e\u0083s\u0018ÿ\u0014\f\u0092×\u0019f\u0087å\u000eL´\u009d3&¹¾ Ö¯TUöÜvZ\u0090Á\u0007±î7c¼\u0092\"N«©\u0011%\u0096\u0090\u001c\b\u00852\näðSyßÿ(±ò7i¼Ý\"_«¹\u0011b\u0096\u0092\u001c\t\u0085h\u0088T\u000e\u009b\u0085)\u001b¤\u0092X(\u0084¯}%â¼\u00973\u000eÉ¨@2ÆÈ]_Óþjfá\b1ë·p<È¢@+¶\u00913ÎÖH[Ãª]dÔ\u0096n\u001bé c!úGuÀ\u008f*\u0006ù\u0080\u0005\u001b\u009a\u00951,²§Å!W¸ð2aM\u0096Ç\u0011^¶CUÅÇN|Ðû±ì7i¼Î\"_«µ\u0011?\u0096\u0088\u001cB\u0085o\nõðOy\u0082ÿ>d¨êRS\u0088Øù^nÇÉMK2ò¸+!\u008c§\u0019,2\u0095ê\u001b]\u0080Ç\u00069\u008f\u0093u\u001bú\u009ccééSnÎÔI]²Ã(H\u0099Î\u001e·y<þ±ì7i¼Î\"_«µ\u0011?\u0096\u0088\u001cB\u0085o\nõðOy\u0082ÿ>d¨êRS\u0088Øù^nÇÉMK2ò¸+!\u008c§\u0019,2\u0095ê\u001b]\u0080Ç\u00069\u008f\u0093u\u001bú\u009ccééSnÊÔI]²Ã(H\u0093Î\u001eÚ\u0091\\\u0014×³I\"ÀÈzBýõw?î\u0012a\u0088\u009b2\u0012ÿ\u0094C\u000fÕ\u0081/8õ³\u00845\u0013¬´&6Y\u008fÓCJîÌ?G\u0002þ\u0080p(±ì7i¼Î\"_«µ\u0011?\u0096\u0088\u001cB\u0085o\nõðOy\u0082ÿ>d¨êRS\u0088Øù^nÇÉMK2ò¸>!\u0093§B,p\u0095í\u001b_$1¢´)\u0013·\u0082>h\u0084â\u0003U\u0089\u009f\u0010²\u009f(e\u0092ì_jãñu\u007f\u008fÆUM$Ë³R\u0014Ø\u0096§/-ã´N2\u009f¹¬\u00002\u008e\u0082òytüÿ[aÊè RªÕ\u001d_×ÆúI`³Ú:\u0017¼«'=©Ç\u0010\u001d\u009bl\u001dû\u0084\\\u000eÞqgû«b\u0006ä×oäÖwXÊ±ê7n¼Ó\"T«¯\u0011*±³7|¼Î\"C«¿\u0011c\u0096\u0091\u001c\u0003\u0085x\nùðPyÉÿ/±ê7n¼Ó\"T«»\u00119\u0096\u0099\u001c\u001f\u0085h±³7\u007f¼Å\"_«¨\u0011)\u0096\u0091\u001cC\u0085z\nþð]yÁÿ9d»ê\u0013S\u009eØ÷^#ÇËME2²¸(!\u0093§\u001b,o\u0095¡\u001bO\u0080Õ\u0006/\u008f¸u\u0019ú\u0081cÃé\u007fnÙÔ^]ªÃ)H\u008eÎB·v<í¢N±e7¬¼\u000f\"\u0094«n\u0011õ\u0096X\u001c\u0095\u0085¦\n3ð\u0088yLÿ¾d5êÂSMØe^»Ç\u001fM\u009e2c¸õ!\u0004§Ê,¸\u00953\u001b\u0087\u0080\u001b\u0006ø\u008fcu\u0084úMc#é´n\u000eÔ\u0095]}ÃéH\u0004ÎÉ·¥SÒÕ\u001b^¸À#IÙóBtïþ\"g\u0011è\u0084\u0012?\u009bû\u001d\t\u0086\u0082\bu±ú:Ò¼\u0005%ª¯.ÐÒZ@ÃíEbÎ\u000ew\u0088ù/bãäJmÄ\u0097s\u0018é\u0081\u0092\u000b\u001a\u008c®6c¿Î!B±³7\u007f¼Å\"_«¨\u0011)\u0096\u0091\u001cC\u0085p\nåð^y\u009aÿhdãê\u001fS\u0080Øó^yÇØMs2½¸%!\u0098§\u0000,C\u0095å\u001bR\u0080Ø\u00069\u008f¾u\u001aú\u008dcÿéin\u0091ÔO]¬Ã<HÒÎ\u001f·s±³7i¼È\"O«ó\u0011%\u0096\u0092\u001c\u0005\u0085h\n£ðUyÂÿ5d¸êRS\u008fØð^cÇÉMH2¯¸)!\u008e§\u001a,u\u0095ï\u001bY\u0080\u0082\u0006.\u008f¯\u008f\u0088\t:\u0082\u0081\u001c\u0006\u0095â/p¨Û\"V» 4±ÀqFúÍOSÚÚ+`£ç\n±ÿ7d¼Î\"C«±\u0011%\u0096\u0089\u001c\u0001\u0015^\u0093Ó\u0018\"\u0086ì\u000f\u001eµ\u00932(¸©!Ï®HT¢Ýx[\u0089À\nN¥÷?|IXSÞ×UjËíB]øÃ\u007f5±û7i¼Ò\"I«®\u0011%\u0096\u009f\u00955\u0013§\u0098\u001c\u0006\u0087\u008f`5ë²Q8ý¡ª.zÔÄÇ\u009bA\tÊ²T)ÝÎgEàÿjSó\u0004|Ô\u0086j\u000f\u0093\u0089\n\u0012\u0098±î7c¼\u0092\"\\«®\u0011#\u0096\u0098\u001c\u0019\u0085\u007f\nøð\u0012yÁÿ3d¨ê\u0019S\u0080õjsíøRkfíþfVøßq\"Ë§L\fÆ\u0081±Ý7|¼Ì\"\f«\u008e\u00119\u0096\u0092\u001c\u0018\u0085u\náðYy\u008cÿ:d£ê\u000eSÌØß^dÇÎMC2±¸)Ö¸P\u0007Û½E;ÌÖv@ñý{)â*m\u00ad\u0097\u0012\u001eé\u0098[\u0003Ü\u008dp4å¿\u008d9I ¿*&UËß\tFáÀ1KO±Ý7b¼Ø\"^«³\u0011%\u0096\u0098\u001cL\u0085O\nÈðwy\u008cÿ>d¹ê\u0015S\u0080Øè^,ÇÚMC2®¸l!\u0084§T,*\u0095Ó\u001b\n\u0080\u0098±î7c¼\u0092\"D«½\u0011>\u0096\u0098\u001c\u001b\u0085}\nþðY±û7c¼Ð\"H«º\u0011%\u0096\u008f\u001c\u0004±ê7n¼Ó\"T«ä\u0011z±î7m¼Ò\"O«´\u00119±î7c¼\u0092\"\\«®\u0011#\u0096\u0098\u001c\u0019\u0085\u007f\nøð\u0012yÎÿ.d\u00adê\u0012S\u0088±î7c¼\u0092\"G«¹\u0011>\u0096\u0092\u001c\t\u0085p\n¢ðMyÉÿ1d¹frI¨Ï%DÔÚ\u0019SÿéinÏäX}?±¬à\rf\u0080íqs\u00adúJ@ÆÇsMëÔÑ[\u001f¡\u00ad( ®Û5Z»ü\u0002{±ú7y¼Ð\"@«\u0083\u00114\u0096Ä\u001cZ±î7c¼\u0092\"N«©\u0011%\u0096\u0090\u001c\b\u00852\nêðUyÂÿ;d©ê\u000eS\u009cØî^eÇÒMX±û7i¼Ò\"I«®\u0011%\u0096\u009f\u001cC\u0085o\nèðWy\u0083ÿ;d©ê\u0012S\u0089Øî^eÇß±û7i¼Ò\"I«®\u0011%\u0096\u009f\u001c3\u0085d\n´ð\ny\u0083ÿ/d¨ê\u0017S³Øä^4Ç\u008aM\u00032»¸)!\u0092§\t,n\u0095å\u001b_\u0080ó\u0006$\u008fôuJ±û7i¼Ò\"I«®\u0011%\u0096\u009f\u001cC\u0085{\nãðSyËÿ0d©ê#S\u009fØø^gÇ\u0093MK2¹¸\"!\u0099§\u001e,u\u0095ï±û7i¼Ò\"I«®\u0011%\u0096\u009f\u001cC\u0085j\nîðSyÔÿddúê\fSÃØê^nÇÓMT2ä¸z!\u008c²!4¹¿\t!\u0091¨j\u0012ó\u0095\t\u001fÅ\u0086¢\t=ó¹z\u0011üög~éÉPXÛ#]\u0089Ä\u001eNÎ10»¹\"A¤Ó/¨\u00963\u0018\u0094\u0083\u001f\u0005å\u008cIvÞù\u000e`p±î7c¼\u0092\"N«³\u0011#\u0096\u0088\u001c\u0000\u0085s\níðXyÉÿ.±î7c¼\u0092\"N«³\u0011#\u0096\u0088\u001c\u0005\u0085q\níð[yÉÿrd®ê\tS\u0085Øð^hÇ\u0092MJ2µ¸\"!\u009b§\t,n\u0095ü\u001bN\u0080Å\u00062\u008f¸±Ý7b¼Ø\"^«³\u0011%\u0096\u0098\u001cA\u0085d\n´ð\nM¯Ë\"@ÓÞ\u000fWèídjÑàIysö©\f\u0014\u0085\u009e\u0003m\u0098á\u0016\\¯Ô$ó¢$;\u0099±è7i¼Ï\"X«ñ\u0005A\u0083Ö\ba\u0096ì\u001fF¥\u008b\">¨»1\u0086¾IDíÍuK\u009dÐU^¸ç*lGêÈs{±í7i¼Ñ\"Y«ò\u0011$\u0096\u008b\u001cB\u0085q\níðUyÂÿ7d©ê\u0005S\u009f±í7i¼Ñ\"Y«ò\u0011?\u0096\u009a\u001cB\u0085z\níðWyÉÿ\u0003d¯ê\u001dS\u0081Øù^~ÇÝ\u008b³\r7\u0086\u008f\u0018\u0007\u0091¬+a¬Ä&\u001c¿.0±Ê\u0006C\u00adÅf^÷ÐLiÁâ«d&ý\u009bÇùAtÊ\u0085TPÝ®g)à\u0085j\u001eóg|µ\u0086J\u000fÕ\u0089/\u0012©\u009c\u0004%\u0092®ï(5±Ú;^D¦Î.W\u008fR\u009fÔ\u0012_ãÁ?HÂòRuùÿ3f\u001cé\u0098\u0013 \u009a¨\u001c\u0003\u0087Ü\t{°ù;²½\u0013$¬®0ÑÈÌãJnÁ\u009f_NÖµl,ëßa\u0003ødwè\u008d]\u0004Å\u0082\u007f\u0019§\u0097\u0018.\u008f¥ö#dºÃ0QO£Å(\\\u009fÚ\u0015v«ð&{×å\u0019lëÖfQÝÛ\\B:Í½7W¾\u008b8l£à-U\u0094Í\u001f÷\u0099/\u0000\u0090\u008a\u0007õþ\u007flæË`Yë+R Ü\u0017G\u009d±î7c¼\u0092\"_«¥\u0011?\u0096\u0088\u001c\t\u0085q\n¢ð^yÙÿ5d ê\u0018SÂØú^eÇÒMK2¹¸>!\u008c§\u001e,u\u0095â\u001bH±î7c¼\u0092\"_«¥\u0011?\u0096\u0088\u001c\t\u0085q\nÓðYyÔÿ(dâê\u001eS\u0099Øõ^`ÇØM\u00022º¸%!\u0092§\u000b,y\u0095þ\u001bL\u0080Þ\u00065\u008f¢u\bP×ÖZ]«ÃcJ\u0080ð\u001bw¡ý:dWë\u009b\u0011g\u0098à\u001e\f\u0085\u0099\u000b!²û9Ã¿\\&ë¬rÓ\u0080Y\u0007ÀµF'ÍLtÛúq±î7c¼\u0092\"Z«¹\u0011\"\u0096\u0098\u001c\u0003\u0085n\nÓðXyÀÿ7d¡êRS\u008eØé^eÇÐMH2ò¸*!\u0095§\u0002,{\u0095é\u001bN\u0080Ü\u0006.\u008f¥u\u0012ú\u0098<\u008e\u0095Ü\u0013@±¦À`±³7h¼Ù\"Z«ó\u0011=\u0096\u0099\u001c\u0001\u0085i\nÓðLyÅÿ,d©#N¥\u0095.$°§9\u000e\u0083Â\u0004n\u008eò\u0017\u008a\u0098\u0014bµë~mÃöPxòÁtJ\u0003Ì\u0090U/ßµ ~*Ö³d5ÿ¾\u0098\u0007\u0015±³7h¼Ù\"Z«ó\u0011?\u0096\u0093\u001c\u000f\u0085w\néðHy\u0083ÿ;d©ê\u0012S\u0095Øø±³7h¼Ù\"Z«ó\u0011?\u0096\u0093\u001c\u000f\u0085w\néðHy\u0083ÿ-d©ê\u0011S\u0099Øø¬·*{¡Á?[¶÷\f9\u008b\u009d\u0001\u0005\u0098m\u0017×íLdÚâ9y«÷\u001d±³7\u007f¼Å\"_«¨\u0011)\u0096\u0091\u001cC\u0085p\nåð^y\u0083ÿ0d¥ê\u001eS\u008fØÃ^aÇÝM@2°¸#!\u009f§3,x\u0095é\u001b^\u0080Ù\u0006;\u008f\u0093u\rú\u0089cñéyn\u0092Ô_]³ÊÏL\u0014Ç¥Y&Ð\u008fjRíógdþ?q\u0097\u008b0\u0002£Û\u008f]TÖåHfÁÏ{\u0012ü³v$ï\u007f`Ä\u009ai\u0013ý\u0095\u0005bWä\u008co=ñ¾x\u0017ÂÛEwÏëV\u0093Ù\r#¬ªg,Ú·[9ì\u0080n\u000b\u0017\u008d\u0084\u0014<\u009e\u00adáJkÌ±³7\u007f¼Å\"_«¨\u0011)\u0096\u0091\u001cC\u0085p\nåð^y\u0083ÿ0d¥ê\u001eS\u008eØï^xÇÚMC2°¸(!\u0099§\u001e,C\u0095æ\u001bR\u0080Å\u0006r\u008f¿u\u0013±³7h¼Ù\"Z«ó\u0011.\u0096\u008f\u001c\u0018\u0085}\nïð_yÉ±³7h¼Ù\"Z«ó\u0011.\u0096\u008f\u001c\u0018\u0085{\nõðNyÃ<Hº\u00931\"¯¡&\b\u009cÕ\u001bt\u0091ã\b\u008a\u0087\u0012} ô9±³7h¼Ù\"Z«ó\u0011.\u0096\u008f\u001c\u0018\u0085s\nþðUyÉ±³7h¼Ù\"Z«ó\u0011.\u0096\u008f\u001c\u0018\u0085j\náðOyËãõe.î\u009fp\u001cùµChÄÉN^×*X\u00ad¢\u001b+\u0083\u00adj6é±³7h¼Ù\"Z«ó\u0011.\u0096\u008f\u001c\u0018\u0085C\nåðQyÉ±³7h¼Ý\"X«½\u0011c\u0096\u0098\u001c\u0003\u0085k\nâðPyÃÿ=d¨ê\u000fSÃØ²^tÇÞM\u00032¾¸?!\u0088§\u0007\u0095ù\u0013+\u0098\u0098\u0006\u0012\u008f¹5q²ß8H¡2.©Ô\u0001]\u0095Û9@ÄÎEwÒü\u0085z.ã\u0097i\u0014\u0016ó\u009cb\u0005ð\u0083I\b:±¢?\u0013¤\u0094±³7|¼Î\"C«¿\u0011c\u0096\u0095\u001c\u0003\u0085l\nãðNyØÿ/±¬7j¼Ú\"\f«æÆ\u0097@XËêUgÜ\u009bfGá«k-òT}Î\u00877\u000eå\u0088\u0019\u0013\u0098\u009d+±û7~¼Ý\"@«°\u0011#\u0096\u009f\u001cB\u0085{\nãðPyÈÿ:d¥ê\u000fS\u0084Ø²^\u007fÇÓ±ð7e¼Þ\"k«\u0090\u0011\t\u0096¯\u001c3\u0085~\nÿðHy\u0082ÿ/d£±³7i¼È\"O«ó\u0011!\u0096\u0099\u001c\b\u0085u\níðcyÏÿ3d¨ê\u0019S\u008fØï^\"ÇÄMA2°\u009fÖ\u0019H\u0092á\fa\u0085\u0087?\u0010¸µ2'«_$×)Ó¯\t$¨º/3\u0093\u0089A\u000eó\u0084y\u001d\u0012\u0092\u0098h/ªz,¡§\u00149\u0091°t\nª\u008dQ\u0007Ê\u009e¢\u0011+ë\u0099b\näô\u007fañÆH\nÃ{E¡Ü\u0005VÊ)t£õ:E¼Ö7û\u008e=\u0000\u0098\u009b\t±³7|¼Î\"C«¿\u0011c\u0096\u009f\u001c\u001c\u0085i\nåðRyÊÿ3±Û7c¼Ð\"H«º\u0011%\u0096\u008f\u001c\u0004Ã¨EsÎÆPCÙ¦cxä\u008an\u001e÷txô\u0082\b\u000bÇ\u008d5\u0016¸\u0098\u0001!\u009eªë,rµÔ?\u0018@¤Ê\"S\u0095ÕX^7ç¸iDòØt*ýù\u0007\n\u0088\u009e\u0011ä\u009be\u001cÈ¦A/®±%:\u0093¼YÅjNòÐJYÂã.dºî\u0002".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
            b = cArr;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -5548042815281350900L;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(int r5, int r6, int r7) {
            /*
                byte[] r0 = com.koushikdutta.async.AsyncServer.AnonymousClass1.$$c
                int r5 = r5 * 2
                int r1 = 1 - r5
                int r6 = r6 * 3
                int r6 = 3 - r6
                int r7 = r7 * 3
                int r7 = 115 - r7
                byte[] r1 = new byte[r1]
                r2 = 0
                int r5 = 0 - r5
                if (r0 != 0) goto L19
                r4 = r7
                r3 = r2
                r7 = r5
                goto L2b
            L19:
                r3 = r2
            L1a:
                int r6 = r6 + 1
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r5) goto L27
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L27:
                int r3 = r3 + 1
                r4 = r0[r6]
            L2b:
                int r7 = r7 + r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.koushikdutta.async.AsyncServer.AnonymousClass1.$$e(int, int, int):java.lang.String");
        }
    }

    static {
        cancelAll = 1;
        b();
        new AsyncServer();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault2("AsyncServer-worker-");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Comparator<InetAddress>() { // from class: com.koushikdutta.async.AsyncServer.2
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(InetAddress inetAddress, InetAddress inetAddress2) {
                InetAddress inetAddress3 = inetAddress;
                InetAddress inetAddress4 = inetAddress2;
                boolean z = inetAddress3 instanceof Inet4Address;
                if (z && (inetAddress4 instanceof Inet4Address)) {
                    return 0;
                }
                if ((inetAddress3 instanceof Inet6Address) && (inetAddress4 instanceof Inet6Address)) {
                    return 0;
                }
                return (z && (inetAddress4 instanceof Inet6Address)) ? -1 : 1;
            }
        };
        b = TuitionPaymentFragmentspecialinlinedviewModeldefault2("AsyncServer-resolver-");
        asInterface = new ThreadLocal<>();
        int i = onTransact + 93;
        cancelAll = i % 128;
        int i2 = i % 2;
    }

    public AsyncServer() {
        this(null);
    }

    public AsyncServer(String str) {
        this.d = 0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new PriorityQueue<>(1, TuitionPaymentFragmentspecialinlinedviewModeldefault2.b);
        if (str == null) {
            str = "AsyncServer";
            int i = RemoteActionCompatParcelizer + 75;
            INotificationSideChannelDefault = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        }
        this.asBinder = str;
        int i3 = RemoteActionCompatParcelizer + 95;
        INotificationSideChannelDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r4.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getAndSet(true) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void b(defpackage.lambdaonInputSurface1androidxcameracoreprocessingDefaultSurfaceProcessor r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.util.concurrent.Semaphore r1 = r4.TuitionPaymentFragmentbindingInflater1     // Catch: java.lang.Exception -> L52
            boolean r1 = r1.tryAcquire()     // Catch: java.lang.Exception -> L52
            java.nio.channels.Selector r2 = r4.b     // Catch: java.lang.Exception -> L52
            r2.wakeup()     // Catch: java.lang.Exception -> L52
            if (r1 == 0) goto L52
            int r1 = com.koushikdutta.async.AsyncServer.RemoteActionCompatParcelizer
            int r1 = r1 + 111
            int r2 = r1 % 128
            com.koushikdutta.async.AsyncServer.INotificationSideChannelDefault = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L25
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.TuitionPaymentFragmentspecialinlinedviewModeldefault2     // Catch: java.lang.Exception -> L52
            boolean r1 = r1.getAndSet(r2)     // Catch: java.lang.Exception -> L52
            if (r1 == 0) goto L3d
            goto L2e
        L25:
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.TuitionPaymentFragmentspecialinlinedviewModeldefault2     // Catch: java.lang.Exception -> L52
            r3 = 1
            boolean r1 = r1.getAndSet(r3)     // Catch: java.lang.Exception -> L52
            if (r1 == 0) goto L3d
        L2e:
            java.nio.channels.Selector r4 = r4.b     // Catch: java.lang.Exception -> L52
            r4.wakeup()     // Catch: java.lang.Exception -> L52
            int r4 = com.koushikdutta.async.AsyncServer.INotificationSideChannelDefault
            int r4 = r4 + 21
            int r1 = r4 % 128
            com.koushikdutta.async.AsyncServer.RemoteActionCompatParcelizer = r1
            int r4 = r4 % r0
            return
        L3d:
            r4.TuitionPaymentFragmentspecialinlinedviewModeldefault3()     // Catch: java.lang.Throwable -> L4b
            java.nio.channels.Selector r0 = r4.b     // Catch: java.lang.Throwable -> L4b
            r0.wakeup()     // Catch: java.lang.Throwable -> L4b
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.TuitionPaymentFragmentspecialinlinedviewModeldefault2     // Catch: java.lang.Exception -> L52
            r4.set(r2)     // Catch: java.lang.Exception -> L52
            return
        L4b:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.TuitionPaymentFragmentspecialinlinedviewModeldefault2     // Catch: java.lang.Exception -> L52
            r4.set(r2)     // Catch: java.lang.Exception -> L52
            throw r0     // Catch: java.lang.Exception -> L52
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.koushikdutta.async.AsyncServer.b(lambdaonInputSurface1androidxcameracoreprocessingDefaultSurfaceProcessor):void");
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
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
            int i4 = $10 + 65;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 8329), 1235 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.getDefaultSize(0, 0) + 35, -653973969, false, $$g(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int iMyPid = (Process.myPid() >> 22) + 2764;
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 14;
                    byte b4 = (byte) ($$f & 7);
                    byte b5 = (byte) (b4 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iMyPid, iKeyCodeFromString, 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 253, (ViewConfiguration.getTapTimeout() >> 16) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - View.MeasureSpec.makeMeasureSpec(0, 0)), 2890 - TextUtils.lastIndexOf("", '0'), 17 - KeyEvent.getDeadChar(0, 0), 2012627446, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (notify ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) INotificationSideChannel) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) cancel) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $10 + 125;
                $11 = i6 % 128;
                int i7 = i6 % 2;
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
    }

    public final lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentbindingInflater1(Runnable runnable, long j) {
        b bVar;
        synchronized (this) {
            long jMin = 0;
            try {
                if (j > 0) {
                    jMin = SystemClock.elapsedRealtime() + j;
                } else if (j == 0) {
                    int i = this.d;
                    this.d = i + 1;
                    jMin = i;
                } else if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() > 0) {
                    jMin = Math.min(0L, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.peek().TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1);
                }
                PriorityQueue<b> priorityQueue = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                bVar = new b(this, runnable, jMin);
                priorityQueue.add(bVar);
                if (this.f838a == null) {
                    synchronized (this) {
                        try {
                            lambdaonInputSurface1androidxcameracoreprocessingDefaultSurfaceProcessor lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor = this.f838a;
                            if (lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor == null) {
                                try {
                                    final lambdaonInputSurface1androidxcameracoreprocessingDefaultSurfaceProcessor lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor2 = new lambdaonInputSurface1androidxcameracoreprocessingDefaultSurfaceProcessor(SelectorProvider.provider().openSelector());
                                    this.f838a = lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor2;
                                    final PriorityQueue<b> priorityQueue2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    Thread thread = new Thread(this.asBinder) { // from class: com.koushikdutta.async.AsyncServer.10
                                        @Override // java.lang.Thread, java.lang.Runnable
                                        public final void run() {
                                            try {
                                                AsyncServer.TuitionPaymentFragmentspecialinlinedviewModeldefault1().set(AsyncServer.this);
                                                AsyncServer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(AsyncServer.this, lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor2, priorityQueue2);
                                            } finally {
                                                AsyncServer.TuitionPaymentFragmentspecialinlinedviewModeldefault1().remove();
                                            }
                                        }
                                    };
                                    this.TuitionPaymentFragmentbindingInflater1 = thread;
                                    thread.start();
                                } catch (IOException e2) {
                                    throw new RuntimeException("unable to create selector?", e2);
                                }
                            } else {
                                PriorityQueue<b> priorityQueue3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                try {
                                    try {
                                        b(this, lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor, priorityQueue3);
                                    } catch (Exception unused) {
                                    }
                                } catch (AsyncSelectorException unused2) {
                                    lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor.b.close();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (!TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                    final lambdaonInputSurface1androidxcameracoreprocessingDefaultSurfaceProcessor lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor3 = this.f838a;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1.execute(new Runnable() { // from class: isValidZslFrame
                        @Override // java.lang.Runnable
                        public final void run() {
                            AsyncServer.b(lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor3);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public final void TuitionPaymentFragmentbindingInflater1(final Runnable runnable) {
        final Semaphore semaphore;
        if (Thread.currentThread() != this.TuitionPaymentFragmentbindingInflater1) {
            synchronized (this) {
                semaphore = new Semaphore(0);
                TuitionPaymentFragmentbindingInflater1(new Runnable() { // from class: AutoValue_DefaultSurfaceProcessor_PendingSnapshot
                    @Override // java.lang.Runnable
                    public final void run() {
                        AsyncServer.TuitionPaymentFragmentspecialinlinedviewModeldefault2(1888184288, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{runnable, semaphore}, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1888184286, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                    }
                }, 0L);
            }
            try {
                semaphore.acquire();
                return;
            } catch (InterruptedException unused) {
                return;
            }
        }
        TuitionPaymentFragmentbindingInflater1(runnable, 0L);
        b(this, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        Runnable runnable = (Runnable) objArr[0];
        Semaphore semaphore = (Semaphore) objArr[1];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 89;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        runnable.run();
        semaphore.release();
        int i4 = RemoteActionCompatParcelizer + 5;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return null;
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Comparator<b> {
        private static char[] TuitionPaymentFragmentbindingInflater1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public static TuitionPaymentFragmentspecialinlinedviewModeldefault2 b;
        private static final byte[] $$c = {6, 51, 46, 31};
        private static final int $$d = 54;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {123, -2, -101, -104, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
        private static final int $$b = 233;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int asInterface = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r5, short r6, short r7, java.lang.Object[] r8) {
            /*
                int r6 = 93 - r6
                int r5 = r5 * 3
                int r5 = r5 + 84
                byte[] r0 = com.koushikdutta.async.AsyncServer.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$a
                int r7 = r7 * 15
                int r7 = r7 + 38
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L14
                r4 = r7
                r3 = r2
                goto L26
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r5
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L24:
                r4 = r0[r6]
            L26:
                int r4 = -r4
                int r5 = r5 + r4
                int r5 = r5 + (-11)
                int r6 = r6 + 1
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.koushikdutta.async.AsyncServer.TuitionPaymentFragmentspecialinlinedviewModeldefault2.a(byte, short, short, java.lang.Object[]):void");
        }

        private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            int i2 = 2 % 2;
            setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
            int i3 = 0;
            int i4 = iArr[0];
            int i5 = 1;
            int i6 = iArr[1];
            int i7 = iArr[2];
            int i8 = iArr[3];
            char[] cArr = TuitionPaymentFragmentbindingInflater1;
            char c = '0';
            float f = 0.0f;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i9 = 0;
                while (i9 < length) {
                    try {
                        Object[] objArr2 = new Object[i5];
                        objArr2[i3] = Integer.valueOf(cArr[i9]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char c2 = (char) (TypedValue.complexToFloat(i3) > f ? 1 : (TypedValue.complexToFloat(i3) == f ? 0 : -1));
                            int scrollDefaultDelay = 1270 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int iLastIndexOf = 17 - TextUtils.lastIndexOf("", c, i3);
                            byte b2 = (byte) i5;
                            byte b3 = (byte) (b2 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, scrollDefaultDelay, iLastIndexOf, 407021364, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i9++;
                        i3 = 0;
                        i5 = 1;
                        c = '0';
                        f = 0.0f;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i6];
            System.arraycopy(cArr, i4, cArr3, 0, i6);
            if (bArr != null) {
                char[] cArr4 = new char[i6];
                setvideostabilizationmode.b = 0;
                char c3 = 0;
                while (setvideostabilizationmode.b < i6) {
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i10 = setvideostabilizationmode.b;
                        Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), ExpandableListView.getPackedPositionType(0L) + 3225, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 14, 2133916302, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    } else {
                        int i11 = setvideostabilizationmode.b;
                        Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 29945);
                            int i12 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1754;
                            int i13 = 24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            byte b6 = (byte) ($$d & 11);
                            byte b7 = (byte) (b6 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionChild, i12, i13, 387247676, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    }
                    c3 = cArr4[setvideostabilizationmode.b];
                    Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 1705 - ExpandableListView.getPackedPositionGroup(0L), KeyEvent.normalizeMetaState(0) + 21, -1434471773, false, $$e($$c[0], b8, b8), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i8 > 0) {
                char[] cArr5 = new char[i6];
                i = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i6);
                int i14 = i6 - i8;
                System.arraycopy(cArr5, 0, cArr3, i14, i8);
                System.arraycopy(cArr5, i8, cArr3, 0, i14);
            } else {
                i = 0;
            }
            if (z) {
                char[] cArr6 = new char[i6];
                loop2: while (true) {
                    setvideostabilizationmode.b = i;
                    while (true) {
                        if (setvideostabilizationmode.b >= i6) {
                            break loop2;
                        }
                        int i15 = $10 + 21;
                        $11 = i15 % 128;
                        if (i15 % 2 == 0) {
                            cArr6[setvideostabilizationmode.b] = cArr3[i6 - setvideostabilizationmode.b];
                            setvideostabilizationmode.b /= 0;
                        } else {
                            cArr6[setvideostabilizationmode.b] = cArr3[(i6 - setvideostabilizationmode.b) - 1];
                            i = setvideostabilizationmode.b + 1;
                        }
                    }
                }
                cArr3 = cArr6;
            }
            if (i7 > 0) {
                int i16 = 0;
                loop4: while (true) {
                    setvideostabilizationmode.b = i16;
                    while (true) {
                        if (setvideostabilizationmode.b >= i6) {
                            break loop4;
                        }
                        int i17 = $10 + 117;
                        $11 = i17 % 128;
                        if (i17 % 2 == 0) {
                            cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[3]);
                            int i18 = setvideostabilizationmode.b;
                            setvideostabilizationmode.b = 0;
                        }
                    }
                    cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                    i16 = setvideostabilizationmode.b + 1;
                }
            }
            objArr[0] = new String(cArr3);
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(b bVar, b bVar2) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0));
                int minimumFlingVelocity = 1755 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23;
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr2 = new Object[1];
                a(b3, (byte) (b3 | 89), b2, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, minimumFlingVelocity, keyRepeatTimeout, 986134021, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new int[]{0, 22, 63, 0}, true, new byte[]{0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new int[]{22, 15, 0, 8}, false, new byte[]{0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cBlue = (char) (Color.blue(0) + 29944);
                int iIndexOf = 1754 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
                byte[] bArr = $$a;
                byte b4 = bArr[7];
                Object[] objArr5 = new Object[1];
                a(b4, (byte) (b4 | 52), bArr[5], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, iIndexOf, iLastIndexOf, 1596667560, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29944);
                    int i4 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
                    byte[] bArr2 = $$a;
                    byte b5 = bArr2[7];
                    Object[] objArr6 = new Object[1];
                    a(b5, b5, bArr2[5], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, i4, maximumDrawingCacheSize, 1599039318, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
                int i5 = ~(Process.myUid() | (-125316823));
                int i6 = ((796242167 + (((-337919249) | i5) * (-220))) + ((i5 | 56099526) * 220)) - 2073714734;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[3])[0] = i8 ^ (i8 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(new int[]{37, 16, 0, 4}, true, new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new int[]{53, 16, 186, 6}, false, new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1}, objArr9);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr10 = {605377156};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 1726 - KeyEvent.normalizeMetaState(0), 29 - KeyEvent.keyCodeFromString(""), -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = zzgx.TuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), -705290412);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) (29944 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1755;
                        int iGreen = 23 - Color.green(0);
                        byte[] bArr3 = $$a;
                        byte b6 = bArr3[7];
                        Object[] objArr11 = new Object[1];
                        a(b6, b6, bArr3[5], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iResolveSizeAndState, iGreen, 1599039318, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da);
                    try {
                        Object[] objArr12 = new Object[1];
                        c(new int[]{0, 22, 63, 0}, true, new byte[]{0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        c(new int[]{22, 15, 0, 8}, false, new byte[]{0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1}, objArr13);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char keyRepeatTimeout2 = (char) (29944 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1755;
                            int minimumFlingVelocity2 = 23 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            byte[] bArr4 = $$a;
                            byte b7 = bArr4[7];
                            Object[] objArr14 = new Object[1];
                            a(b7, (byte) (b7 | 52), bArr4[5], objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatTimeout2, threadPriority, minimumFlingVelocity2, 1596667560, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char windowTouchSlop = (char) (29944 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                            int i9 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1754;
                            int scrollBarSize = 23 - (ViewConfiguration.getScrollBarSize() >> 8);
                            byte b8 = $$a[7];
                            byte b9 = b8;
                            Object[] objArr15 = new Object[1];
                            a(b9, (byte) (b9 | 89), b8, objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(windowTouchSlop, i9, scrollBarSize, 986134021, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                        objArr = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i10 = ((int[]) objArr[1])[0];
            int i11 = ((int[]) objArr[0])[0];
            if (i11 == i10) {
                int i12 = ((int[]) objArr[3])[0];
                Object[] objArr16 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
                int i13 = ~((~System.identityHashCode(this)) | (-5840342));
                int i14 = i12 + (((-224214496) | i13) * (-970)) + 398341525 + ((i13 | 218374154) * 970);
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr16[3])[0] = i16 ^ (i16 << 5);
                int i17 = asInterface + 79;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
                int i18 = i17 % 2;
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    int i19 = asInterface + 107;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
                    int i20 = i19 % 2;
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
                int i21 = ((int[]) objArr[3])[0];
                Object[] objArr17 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i22 = i21 + (-750631223) + (((~((-827709932) | startUptimeMillis)) | 290721866) * 1504) + ((~(startUptimeMillis | (-536988066))) * (-1504)) + 1804211376;
                int i23 = (i22 << 13) ^ i22;
                int i24 = i23 ^ (i23 >>> 17);
                ((int[]) objArr17[3])[0] = i24 ^ (i24 << 5);
            }
            b bVar3 = bVar;
            b bVar4 = bVar2;
            if (bVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == bVar4.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return 0;
            }
            if (bVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 <= bVar4.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return -1;
            }
            int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
            asInterface = i25 % 128;
            int i26 = i25 % 2;
            return 1;
        }

        static {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            b = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
            int i2 = i % 2;
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            TuitionPaymentFragmentbindingInflater1 = new char[]{59742, 59821, 59811, 59815, 59805, 59804, 59811, 59808, 59833, 59838, 59822, 59764, 59780, 59835, 59782, 59779, 59822, 59808, 59812, 59809, 59811, 59821, 59682, 59728, 59752, 59757, 59771, 59749, 59744, 59746, 59758, 59747, 59757, 59747, 59770, 59751, 59759, 59707, 59744, 59744, 59758, 59744, 59746, 59751, 59768, 59773, 59757, 59723, 59713, 59745, 59756, 59757, 59718, 59805, 59436, 59396, 59416, 59432, 59413, 59434, 59435, 59413, 59432, 59424, 59427, 59427, 59451, 59409, 59397};
        }

        private static String $$e(byte b2, short s, int i) {
            int i2 = b2 + 99;
            byte[] bArr = $$c;
            int i3 = 3 - (i * 3);
            int i4 = s * 2;
            byte[] bArr2 = new byte[1 - i4];
            int i5 = 0 - i4;
            int i6 = -1;
            if (bArr == null) {
                i2 = (-i2) + i5;
                i3 = i3;
                i6 = -1;
            }
            while (true) {
                int i7 = i3 + 1;
                int i8 = i6 + 1;
                bArr2[i8] = (byte) i2;
                if (i8 == i5) {
                    return new String(bArr2, 0);
                }
                i2 = (-bArr[i7]) + i2;
                i3 = i7;
                i6 = i8;
            }
        }
    }

    static class b implements lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor, Runnable {
        private boolean TuitionPaymentFragmentbindingInflater1;
        private AsyncServer TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private Runnable b;

        public b(AsyncServer asyncServer, Runnable runnable, long j) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = asyncServer;
            this.b = runnable;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.b.run();
        }

        @Override // defpackage.lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor
        public final boolean isDone() {
            boolean z;
            synchronized (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                z = (this.TuitionPaymentFragmentbindingInflater1 || this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.contains(this)) ? false : true;
            }
            return z;
        }

        @Override // defpackage.lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor
        public final boolean isCancelled() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        @Override // defpackage.lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            boolean zRemove;
            synchronized (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                zRemove = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.remove(this);
                this.TuitionPaymentFragmentbindingInflater1 = zRemove;
            }
            return zRemove;
        }
    }

    class TuitionPaymentFragmentbindingInflater1 extends DefaultSurfaceProcessorExternalSyntheticLambda5<isSmallerByArea> {
        lambdaonInputSurface0androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentbindingInflater1;
        SocketChannel TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        private TuitionPaymentFragmentbindingInflater1() {
        }

        /* synthetic */ TuitionPaymentFragmentbindingInflater1(AsyncServer asyncServer, byte b) {
            this();
        }

        @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda13
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            try {
                SocketChannel socketChannel = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (socketChannel != null) {
                    socketChannel.close();
                }
            } catch (IOException unused) {
            }
        }
    }

    public final lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor b(InetSocketAddress inetSocketAddress, lambdaonInputSurface0androidxcameracoreprocessingDefaultSurfaceProcessor lambdaoninputsurface0androidxcameracoreprocessingdefaultsurfaceprocessor) {
        int i = 2 % 2;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1(this, (byte) 0);
        TuitionPaymentFragmentbindingInflater1(new Runnable(tuitionPaymentFragmentbindingInflater1, lambdaoninputsurface0androidxcameracoreprocessingdefaultsurfaceprocessor, null, inetSocketAddress) { // from class: com.koushikdutta.async.AsyncServer.4
            private /* synthetic */ InetSocketAddress TuitionPaymentFragmentbindingInflater1;
            private /* synthetic */ lambdasnapshot6androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            private /* synthetic */ TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            private /* synthetic */ lambdaonInputSurface0androidxcameracoreprocessingDefaultSurfaceProcessor b;

            {
                this.TuitionPaymentFragmentbindingInflater1 = inetSocketAddress;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Throwable th;
                SelectionKey selectionKeyRegister;
                SocketChannel socketChannelOpen;
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isCancelled()) {
                    return;
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 = this.b;
                try {
                    TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    socketChannelOpen = SocketChannel.open();
                    tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = socketChannelOpen;
                    try {
                        socketChannelOpen.configureBlocking(false);
                        selectionKeyRegister = socketChannelOpen.register(((lambdaonInputSurface1androidxcameracoreprocessingDefaultSurfaceProcessor) AsyncServer.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-584405848, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{AsyncServer.this}, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 584405848, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).b, 8);
                        try {
                            selectionKeyRegister.attach(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                socketChannelOpen.socket().getLocalPort();
                            }
                            socketChannelOpen.connect(this.TuitionPaymentFragmentbindingInflater1);
                        } catch (Throwable th2) {
                            th = th2;
                            if (selectionKeyRegister != null) {
                                selectionKeyRegister.cancel();
                            }
                            SurfaceEdgeExternalSyntheticLambda3.b(socketChannelOpen);
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(new RuntimeException(th), (Object) null, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        selectionKeyRegister = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    selectionKeyRegister = null;
                    socketChannelOpen = null;
                }
            }
        }, 0L);
        int i2 = RemoteActionCompatParcelizer + 17;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        return tuitionPaymentFragmentbindingInflater1;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        AsyncServer asyncServer = (AsyncServer) objArr[0];
        final InetSocketAddress inetSocketAddress = (InetSocketAddress) objArr[1];
        final lambdaonInputSurface0androidxcameracoreprocessingDefaultSurfaceProcessor lambdaoninputsurface0androidxcameracoreprocessingdefaultsurfaceprocessor = (lambdaonInputSurface0androidxcameracoreprocessingDefaultSurfaceProcessor) objArr[2];
        int i = 2 % 2;
        Object obj = null;
        if (!inetSocketAddress.isUnresolved()) {
            int i2 = RemoteActionCompatParcelizer + 83;
            INotificationSideChannelDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return asyncServer.b(inetSocketAddress, lambdaoninputsurface0androidxcameracoreprocessingdefaultsurfaceprocessor);
            }
            asyncServer.b(inetSocketAddress, lambdaoninputsurface0androidxcameracoreprocessingdefaultsurfaceprocessor);
            obj.hashCode();
            throw null;
        }
        final DefaultSurfaceProcessorExternalSyntheticLambda5 defaultSurfaceProcessorExternalSyntheticLambda5 = new DefaultSurfaceProcessorExternalSyntheticLambda5();
        String hostName = inetSocketAddress.getHostName();
        DefaultSurfaceProcessorExternalSyntheticLambda5 defaultSurfaceProcessorExternalSyntheticLambda6 = new DefaultSurfaceProcessorExternalSyntheticLambda5();
        b.execute(asyncServer.new AnonymousClass5(hostName, defaultSurfaceProcessorExternalSyntheticLambda6));
        DefaultSurfaceProcessorExternalSyntheticLambda10 defaultSurfaceProcessorExternalSyntheticLambda10TuitionPaymentFragmentspecialinlinedviewModeldefault2 = defaultSurfaceProcessorExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new lambdasafeProcess0androidxcameracoreprocessingInternalImageProcessor() { // from class: ZslRingBuffer
            @Override // defpackage.lambdasafeProcess0androidxcameracoreprocessingInternalImageProcessor
            public final Object TuitionPaymentFragmentbindingInflater1(Object obj2) {
                return AsyncServer.b((InetAddress[]) obj2);
            }
        });
        defaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(defaultSurfaceProcessorExternalSyntheticLambda10TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        defaultSurfaceProcessorExternalSyntheticLambda10TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new DefaultSurfaceProcessorExternalSyntheticLambda14<InetAddress>() { // from class: com.koushikdutta.async.AsyncServer.3
            private static short[] g;
            private static final byte[] $$a = {46, 126, -84, 108};
            private static final int $$b = 116;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int cancel = 0;
            private static int cancelAll = 1;
            private static int b = 659439925;
            private static int asBinder = -1934795608;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f839a = 1354982083;
            private static byte[] d = {46, -64, 34, -7, 48, 37, 34, 47, -2, 38, 31, -12, 94, 13, 55, 90, -3, 47, 11, 20, 108, 37, 34, 47, -2, 38, 31, -12, 81, -11, -97, 5, -117, -120, 57, -119, 59, 116, 114, -110, 15, 33, 124, 0, -110, 15, -63, -36, 72, 6, 3, 102, 71, -7, -119, -97, 59, 1, 100, 0, 4, -55, -8, -101, 63, -103, 59, -14, 83, -19, 33, 36, -84, -21, -22, -19, 126, -10, 93, 68, 31, 123, 87, 56, -21, -22, -19, 126, -10, 93, 68, 30, 35, 9, -18, 72, -22, 33, -110, 42, 103, 33, 56, -116, -110, 42, -102, 44, 54, 5, 112, 35, -110, -36, 32, 7, -51, -46, 42, -38, 44, 54, 5, -16, 35, -46, -71, 22, -114, 27, -71, -80, -28, 22, -114, 30, -124, -118, -67, -86, -51, 9, 74, 82, -114, -123, 29, -114, 23, -72, -47, -62, 19, 18, 9, -122, 30, -71, -58, 87, 26, 91, 85, -3, 77, -57, -15, -18, 17, 62, 82, -79, -119, -3, -58, 78, -3, 84, -61, 10, 57, 72, 73, 82, -59, 77, -62, -74, 19, 25, -91, -77, 19, -81, -26, 30, 96, 114, -98, 79, 42, 54, -2, 36, 55, 94, -44, -60, 38, -13, -1, 54, -16, -8, 55, 32, 23, 88, -65, 55, 32, 55, 56, -72, 40, 46, -6, -16, 39, -13, -57, 104, -32, -50, 88, -6, 4, 50, 54, 36, 4, 40, 49, 89, 74, -10, 50, 117, -3, 41, 46, 6, 41, 48, 35, 122, -19, 60, Base64.padSymbol, 50, 33, 57, 34, -85, -92, -77, -126, -9, -62, -56, -116, -32, -56, 43, -75, 39, 36, -87, 89, -73, 64, 66, 34, -69, -111, -122, 85, -68, -69, 42, -127, 64, -97, 47, -68, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26};
            private static char[] asInterface = {47305, 47356, 47302, 47352, 47355, 47297, 47292, 47303, 47350, 47301, 47271, 47346, 47299, 47322, 47359, 47265, 47300, 47351, 47296, 47348, 47349, 47345, 47314, 47285, 47290, 47281};
            private static int notify = 2047719530;
            private static boolean INotificationSideChannel = true;
            private static boolean onTransact = true;

            private static void e(int i3, char[] cArr, int[] iArr, byte[] bArr, Object[] objArr2) throws Throwable {
                int length;
                char[] cArr2;
                int i4;
                int i5 = 2 % 2;
                getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
                char[] cArr3 = asInterface;
                long j = 0;
                if (cArr3 != null) {
                    int i6 = $10 + 47;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        length = cArr3.length;
                        cArr2 = new char[length];
                        i4 = 1;
                    } else {
                        length = cArr3.length;
                        cArr2 = new char[length];
                        i4 = 0;
                    }
                    while (i4 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr3[i4])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = (byte) (b2 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 31339), (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 2993, (ViewConfiguration.getTouchSlop() >> 8) + 17, 1182129903, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                            }
                            cArr2[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr3)).charValue();
                            i4++;
                            j = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    int i7 = $11 + 113;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr3 = cArr2;
                }
                Object[] objArr4 = {Integer.valueOf(notify)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 43325), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 253, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr4)).intValue();
                int i9 = 33602;
                int i10 = 1687675375;
                if (onTransact) {
                    int i11 = $10 + 113;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                    char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i3] - iIntValue);
                        Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i10);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (i9 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3085, TextUtils.lastIndexOf("", '0', 0, 0) + 27, -2146875848, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr5);
                        i9 = 33602;
                        i10 = 1687675375;
                    }
                    objArr2[0] = new String(cArr4);
                    return;
                }
                if (!INotificationSideChannel) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                    char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        int i13 = $10 + 77;
                        $11 = i13 % 128;
                        if (i13 % 2 == 0) {
                            cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 >> 1) + getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i3] << iIntValue);
                            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        } else {
                            cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i3] - iIntValue);
                            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                        }
                    }
                    objArr2[0] = new String(cArr5);
                    return;
                }
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i14 = $10 + 47;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i3] - iIntValue);
                    Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - (ViewConfiguration.getEdgeSlop() >> 16)), TextUtils.indexOf("", "", 0, 0) + 3085, 26 - ExpandableListView.getPackedPositionGroup(0L), -2146875848, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6);
                }
                objArr2[0] = new String(cArr6);
            }

            private static void c(int i3, int i4, short s, byte b2, int i5, Object[] objArr2) throws Throwable {
                int i6;
                boolean z;
                int i7 = 2 % 2;
                SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr3 = {Integer.valueOf(i4), Integer.valueOf(asBinder)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Drawable.resolveOpacity(0, 0), 2266 - ExpandableListView.getPackedPositionChild(0L), 32 - MotionEvent.axisFromString(""), 1387473586, false, $$c(b3, (byte) (b3 | 50), b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    Object obj2 = null;
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr3)).intValue();
                    if (iIntValue == -1) {
                        int i8 = $10 + 59;
                        $11 = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 5 % 5;
                        }
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    if (i6 != 0) {
                        int i10 = $10 + 97;
                        $11 = i10 % 128;
                        if (i10 % 2 == 0) {
                            obj2.hashCode();
                            throw null;
                        }
                        byte[] bArr = d;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            for (int i11 = 0; i11 < length; i11++) {
                                Object[] objArr4 = {Integer.valueOf(bArr[i11])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b4 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getTouchSlop() >> 8) + 3358, 18 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1054011043, false, $$c(b4, (byte) (b4 | 54), b4), new Class[]{Integer.TYPE});
                                }
                                bArr2[i11] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr4)).byteValue();
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            byte[] bArr3 = d;
                            Object[] objArr5 = {Integer.valueOf(i5), Integer.valueOf(b)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b5 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 2267, 33 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1387473586, false, $$c(b5, (byte) (b5 | 50), b5), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) asBinder) ^ 3046761265686732006L)));
                        } else {
                            iIntValue = (short) (((short) (((long) g[i5 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) asBinder) ^ 3046761265686732006L)));
                        }
                    }
                    if (iIntValue > 0) {
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i5 + iIntValue) - 2) + ((int) (((long) b) ^ 3046761265686732006L)) + i6;
                        Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(f839a), sb};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55903 - ExpandableListView.getPackedPositionChild(0L)), (-16774361) - Color.rgb(0, 0, 0), MotionEvent.axisFromString("") + 14, -1529949196, false, $$c(b6, (byte) (b6 | 51), b6), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        byte[] bArr4 = d;
                        if (bArr4 != null) {
                            int i12 = $10 + 1;
                            $11 = i12 % 128;
                            int i13 = i12 % 2;
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            for (int i14 = 0; i14 < length2; i14++) {
                                int i15 = $11 + 49;
                                $10 = i15 % 128;
                                int i16 = i15 % 2;
                                bArr5[i14] = (byte) (((long) bArr4[i14]) ^ 3046761265686732006L);
                            }
                            bArr4 = bArr5;
                        }
                        if (bArr4 != null) {
                            int i17 = $11 + 11;
                            $10 = i17 % 128;
                            int i18 = i17 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                        while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                            if (z) {
                                byte[] bArr6 = d;
                                int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i19]) ^ 3046761265686732006L)) + s)) ^ b2));
                            } else {
                                short[] sArr = g;
                                int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i20]) ^ 3046761265686732006L)) + s)) ^ b2));
                            }
                            sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                        }
                    }
                    objArr2[0] = sb.toString();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda14
            public final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Exception exc, InetAddress inetAddress) {
                int i3 = 2 % 2;
                int i4 = cancelAll;
                int i5 = i4 + 47;
                cancel = i5 % 128;
                Object obj2 = null;
                InetAddress inetAddress2 = inetAddress;
                if (i5 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                if (exc != null) {
                    int i6 = i4 + 85;
                    cancel = i6 % 128;
                    int i7 = i6 % 2;
                    lambdaoninputsurface0androidxcameracoreprocessingdefaultsurfaceprocessor.b(exc, null);
                    defaultSurfaceProcessorExternalSyntheticLambda5.b(exc, (Object) null, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
                    int i8 = cancel + 41;
                    cancelAll = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 58 / 0;
                        return;
                    }
                    return;
                }
                defaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1((TuitionPaymentFragmentbindingInflater1) AsyncServer.this.b(new InetSocketAddress(inetAddress2, inetSocketAddress.getPort()), lambdaoninputsurface0androidxcameracoreprocessingdefaultsurfaceprocessor), null);
            }

            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.content.Context r29, int r30, int r31) {
                /*
                    Method dump skipped, instruction units count: 4095
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.koushikdutta.async.AsyncServer.AnonymousClass3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.content.Context, int, int):java.lang.Object[]");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$c(int r5, short r6, int r7) {
                /*
                    int r6 = r6 + 67
                    int r5 = r5 * 2
                    int r0 = r5 + 1
                    int r7 = r7 * 2
                    int r7 = 3 - r7
                    byte[] r1 = com.koushikdutta.async.AsyncServer.AnonymousClass3.$$a
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L14
                    r3 = r5
                    r4 = r2
                    goto L26
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    int r7 = r7 + 1
                    int r4 = r3 + 1
                    if (r3 != r5) goto L24
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    return r5
                L24:
                    r3 = r1[r7]
                L26:
                    int r6 = r6 + r3
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.koushikdutta.async.AsyncServer.AnonymousClass3.$$c(int, short, int):java.lang.String");
            }
        });
        int i3 = RemoteActionCompatParcelizer + 105;
        INotificationSideChannelDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return defaultSurfaceProcessorExternalSyntheticLambda5;
        }
        obj.hashCode();
        throw null;
    }

    private static ExecutorService TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        int i = 2 % 2;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 4, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new TuitionPaymentFragmentspecialinlinedviewModeldefault3(str));
        int i2 = RemoteActionCompatParcelizer + 103;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 16 / 0;
        }
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: com.koushikdutta.async.AsyncServer$5, reason: invalid class name */
    public class AnonymousClass5 implements Runnable {
        private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final /* synthetic */ DefaultSurfaceProcessorExternalSyntheticLambda5 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public AnonymousClass5(String str, DefaultSurfaceProcessorExternalSyntheticLambda5 defaultSurfaceProcessorExternalSyntheticLambda5) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = defaultSurfaceProcessorExternalSyntheticLambda5;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                final InetAddress[] allByName = InetAddress.getAllByName(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                Arrays.sort(allByName, AsyncServer.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                if (allByName == null || allByName.length == 0) {
                    throw new HostnameResolutionException("no addresses for host");
                }
                AsyncServer.this.TuitionPaymentFragmentbindingInflater1(new Runnable() { // from class: com.koushikdutta.async.AsyncServer.5.5
                    private static long TuitionPaymentFragmentbindingInflater1;
                    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    private static final byte[] $$c = {41, 2, 45, -60};
                    private static final int $$d = 30;
                    private static int $10 = 0;
                    private static int $11 = 1;
                    private static final byte[] $$a = {43, 23, 22, -14};
                    private static final int $$b = 74;
                    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    private static int asInterface = 1;

                    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
                    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static void c(short r7, int r8, int r9, java.lang.Object[] r10) {
                        /*
                            byte[] r0 = com.koushikdutta.async.AsyncServer.AnonymousClass5.RunnableC01595.$$a
                            int r7 = r7 * 4
                            int r7 = 3 - r7
                            int r9 = r9 + 97
                            int r8 = r8 * 4
                            int r8 = r8 + 1
                            byte[] r1 = new byte[r8]
                            r2 = 0
                            if (r0 != 0) goto L15
                            r3 = r9
                            r4 = r2
                            r9 = r7
                            goto L2d
                        L15:
                            r3 = r2
                        L16:
                            int r4 = r3 + 1
                            byte r5 = (byte) r9
                            r1[r3] = r5
                            int r7 = r7 + 1
                            if (r4 != r8) goto L27
                            java.lang.String r7 = new java.lang.String
                            r7.<init>(r1, r2)
                            r10[r2] = r7
                            return
                        L27:
                            r3 = r0[r7]
                            r6 = r9
                            r9 = r7
                            r7 = r3
                            r3 = r6
                        L2d:
                            int r7 = r7 + r3
                            r3 = r4
                            r6 = r9
                            r9 = r7
                            r7 = r6
                            goto L16
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.koushikdutta.async.AsyncServer.AnonymousClass5.RunnableC01595.c(short, int, int, java.lang.Object[]):void");
                    }

                    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
                        int i3 = 2;
                        int i4 = 2 % 2;
                        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                        long[] jArr = new long[i2];
                        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                            int i5 = $11 + 19;
                            $10 = i5 % 128;
                            int i6 = i5 % i3;
                            int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            try {
                                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i7])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.resolveSizeAndState(0, 0, 0), (-16775029) - Color.rgb(0, 0, 0), TextUtils.indexOf("", "", 0, 0) + 40, 841711447, false, $$e(b, b, $$c[1]), new Class[]{Integer.TYPE});
                                }
                                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33017), (ViewConfiguration.getFadingEdgeLength() >> 16) + 3011, TextUtils.getOffsetBefore("", 0) + 26, 321985076, false, $$e(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                                }
                                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - TextUtils.indexOf("", "", 0)), 3376 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 17 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -968507904, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                                i3 = 2;
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
                            int i8 = $11 + 117;
                            $10 = i8 % 128;
                            if (i8 % 2 != 0) {
                                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                                try {
                                    Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        byte b6 = (byte) 0;
                                        byte b7 = b6;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36506 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3375, 17 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -968507904, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                                    }
                                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                                    int i9 = 31 / 0;
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } else {
                                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                                Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    byte b8 = (byte) 0;
                                    byte b9 = b8;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 36506), 3424 - AndroidCharacter.getMirror('0'), 17 - KeyEvent.normalizeMetaState(0), -968507904, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                            }
                        }
                        objArr[0] = new String(cArr);
                        int i10 = $11 + 109;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        int i = 2 % 2;
                        int i2 = asInterface + 125;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                        int i3 = i2 % 2;
                        AnonymousClass5.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b((Exception) null, allByName, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
                        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
                        asInterface = i4 % 128;
                        int i5 = i4 % 2;
                    }

                    /*  JADX ERROR: Type inference failed
                        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 144971. Try increasing type updates limit count.
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                        */
                    public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context r64, int r65, int r66, int r67) {
                        /*
                            Method dump skipped, instruction units count: 14497
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.koushikdutta.async.AsyncServer.AnonymousClass5.RunnableC01595.TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context, int, int, int):java.lang.Object[]");
                    }

                    static {
                        char[] cArr = new char[2154];
                        ByteBuffer.wrap("òÐs\u008eð°q¶ö\u0084wñôîu\u0000ú3{$øDykþk|±ý¸b ãË`èáàf\u0003ç(d\u0019åBjlëfi\u0091î¸ibè<k\u0002ê\u0004m6ìCo\\î²a\u0081à\u0096cöâÙeÙç\u0003f\u001bù\u001fxmûMzhý¦|\u0099ÿ\u0086~àñÚpÑí7liïWnQéch\u0016ë\tjçåÔdÃç£f\u008cá\u008ccVâM}Zü&\u007f\u001e>ð¿¹<\u008c½\u0093:¤»Û8Î¹(6\u0002·\u000e4hµ\u00172D°¡1\u0095®\u0080/é¬Ó-Öª8+$¨\u0004)p¦H'S¥·\"\u008f£\u0091u\u001aôEwköiqNð8s,ò\u0088}íüú\u007f\u0088þ¢\u009fû\u001e¤\u009d\u008a\u001c\u0088\u009b¯\u001aÎ\u0099Ã\u0018*\u0097R\u0016\u0019\u0095t\u0014\\\u0093XëØj\u0091é¹h«ïÂnìíílKã\rb\fáh`\u007fç}e\u0083ä\u0095{\u00adúÓyó2ù³§0\u009d±\u009d6ã·\u00904\u0086µ&:\u000e»\u001e8m¹_>L¼¨¨5)=ªC+\u001a¬|-A®M/ú \u009d!\u009f¢ñ#Ò¤Ô&?§\u00058#¹y:G»I<\u0097½\u0087>\u0090¿ú0\u0095¾Y?Q¼/=vº\u0010;-¸!9\u0096¶ñ7ó´\u009d5¾²¸0S±i.O¯\u0015,+\u00ad%*û«ë(ü©\u0096&ú±³0ú³Ï2Ðµ¼4\u0090·\u008f6 ¹X8H»,:T½\f?ä¾Ø!É ®#×¢\u0095%|K7Ê)I\u0018È\u0004OnÎDJJË\u0003H6É)NEÏiLvÍÙB¯Ã±@ÙÁ\u00adF÷Ä\u0011E.Ú+[cØMY2Þ\u0084_¤Ü±]ÞÒ«SþÑ\u0007V)×&T[Õkj\u007f\u0082t\u0003=\u0080\b\u0001\u0017\u0086{\u0007W\u0084H\u0005ç\u008a\u0091\u000b\u008f\u0088ç\t\u0093\u008eÉ\f/\u008d\u0010\u0012\u0015\u0093]\u0010s\u0091\f\u0016¤\u0097\u008d\u0014\u008d\u0095å\u0080Y\u0001\u0010\u0082%\u0003:\u0084V\u0005z\u0086e\u0007Ê\u0088²\t¢\u008aÆ\u000b¾\u008cæ\u000e\u000e\u008f2\u0010#\u0091C\u0012~\u0093y\u0014¯\u0095\u009f\u0016¿\u0097Ê\u0018ú\u0099þ\u001bU\u009c'\u001d.±³0í³Ó2Õµç4\u009b·\u00876b¹A8F»;:\u001e½\u0013?ù±î0æ³\u00982Áµ½4\u009c·\u008e6k¹\u001a8I»!:\b½\u0014\u00adQ,O¯t.s©\u000e(x«/*É¥ã±³0ù³Ä2Ìµ«4Ú·\u00846f¹X8D»=:\u0002½\u0013?ù¾ß!Ê ¿±ò0ì³Û2Öµ»4\u0093\u0010\u0089\u0091\u0081\u0012ÿ\u0093´\u0014Ý\u0095ý\u0016á\u0097\u001d\u00180\u00992\u001a\u0007\u009bq\u001cf\u009e\u0084\u001f¨\u0080¦\u0001Ê\u0082ý\u0003õ\u0084\u0001\u0005-\u0086'\u0007G±û0ì³Ø2Ú±ì0ì³Ä2Ðµ¡4\u0086·\u00966!¹G8X»=:U½\u0002?é¾\u0094!Ã ©#\u009b¢\u0093%t¤\u0016'B¦\")\n¨J*÷\u00adß,À¯µ.¢\u0091\u008d\u0010g\u0093I\u0012v\u0095$\u0014&\u0097\u0006\u0019ñ\u0098ç\u001bÝ\u009a±\u001d³±ì0ì³Ä2Ðµ¡4\u0086·\u00966!¹G8X»=:U½\u0002?é¾\u0094!Ã ©#\u009b¢\u0093%t¤\u0016'B¦\")\n¨J*÷\u00adß,À¯µ.¢\u0091\u008d\u0010g\u0093I\u0012v\u0095 \u0014&\u0097\u0006\u0019ñ\u0098í\u001bÝ±ì0ì³Ä2Ðµ¡4\u0086·\u00966!¹G8X»=:U½\u0002?é¾\u0094!Ã ©#\u009b¢\u0093%t¤\u0016'W¦=)Q¨\u0007*à\u00ad×±O0O³g2sµ\u00024%·56\u0082¹ä8û»\u009e:ö½¡?J¾7!` \n#8¢0%×¤µ'ô¦\u009e)ò¨«*S\u00ad~±ì0ì³Ä2Ðµ¡4\u0086·\u00966!¹G8X»=:U½\u0002?é¾\u0094!Ã ©#\u009b¢\u0093%t¤\u0016'W¦=)Q¨\t*ò\u00adÝ2{³{0S±G66·\u00114\u0001µ¶:Ð»Ï8ª¹Â>\u0095¼~=\u0003¢T#> \f!\u0004¦ã'\u0081¤À%ªªÆ+\u009e©h.JT\u008bÕ\u008aV¸×ºPÚÑò±³0ù³Ä2Ìµ«4Ú·\u008f6`¹P8T»\":\u001e½\u0013\u0012\\\u0093]\u0010o\u0091m\u0016\u0019\u00976\u00141\u0095Ê\u001aö\u001dÌ\u009c\u0085\u001f°\u009e¯\u0019Ã\u0098ï\u001bð\u009a_\u0015-\u0094,\u0017P\u0096i\u0011z\u0093\u0085\u0012ª\u008dª\fØ\u008f©\u000eî\u0089\u0005\b)\u008b>\nB\u0085w\u0004h\u0086Ã\u0001²\u0080\u00ad\u0003Ü\u0082ö=ð¼\u0005?\u001c¾%9L¸N;aµ\u008f4\u008f·þ6Á±ß0ã±³0ÿ³Ó2Íµ¬4\u009a·\u00906 ¹X8H»,:M½T?¢¾Ò!Ð ã#\u0098¢\u0093%w¤Q'J¦|)\u000f¨\u0016*ø\u00adÓ,Ê¯¢.\u0084\u0091Ä\u0010`\u0093U\u0012G\u00952\u0014,\u0097\u001f\u0019æ\u0098¬\u001bÜ\u009a»½£<ï¿Ã>Ý¹¼8\u008a»\u0080:0µH4X·<6]±D3²²Â-À¬ó/\u0081®\u0081)`¨G+Xª2%\u0000¤\u0007&ä¡Ü \u0095£·\"\u0084\u009d\u0094\u001cc\u009fC\u001eN\u00995\u0018}\u009b\u000b\u0015êÂ\tC@ÀuAjÆ\u0006G*Ä5E\u009aÊâKòÈ\u0096I÷ÎîL\u0018ÍcRqÓ\u0019P6Ñ8Vö×ãTöÕ\u008cZ©Û\u0081YBÞj_eÜ\u000f]5â6cÌàåaöæÁg\u009aä¢j_ë\u0016hfé\u0001±³0ì³Â2Àµç4\u009c·\u008c6f¹@8\u000e»':\u0015½\t?ù¾\u0094!Ä  #\u0096¢\u0093%w¤K'@¦ )\t¨\r*ò\u00adÛ,\u0085¯¢.\u009eæIg~äJeHâ7c\bà\u0004aôîÉoÝ\u009dY\u001cW\u009fm\u001e}\u0099\u0017\u00182\u009b<ªç+ù¨Ü)Ô®½/\u0084¬\u008f-z±î0æ³\u00982Óµº4\u009a·\u00866z¹W8U»`:\u001f½\u0005?û¾Ó!Ä ©±ê0ë³Ù2Ûµð4Ã·\u0092±û0ì³Ø2Æµº4\u009c·\u0081!¡ ¶#\u0082¢\u009c%à¤Æ'Û¦\n)\u0016¨C+\"x\u008dù\u009az®û°|Ìýê~÷ÿ&p:ñor\u000eóRt öÏ±î0æ³\u00982Óµº4\u009a·\u00866z¹W8U»`:\u0016½\u000f?é¾ß!ËM2Ì0O\u0000±ù0ä³Ã2Ïµ©4\u0081·\u008d6}±Ý0ù³Æ2\u0083µ\u009a4\u0080·\u008c6{¹]8L»+:[½\u0006?â¾È!\u0087 \u008f#\u0091¢\u0094%|¤U'@\u0088X\tb\u008aW\u000bT\u008c\"\r\u0019\u008e\u0003\u000fª\u0080â\u0001à\u0082\u0080\u0003Þ\u0084\u0087\u0006}\u0087V\u0018N\u0099=\u001a\\\u009b\u0005\u001cù\u009dÏ\u001e\u0080\u009f¯\u0010Â\u0091×±Ý0ç³Ò2Ñµ§4\u009c·\u00866/¹g8e»\u0005:[½\u0002?ø¾Ó!Ë ¸#Ù¢\u0080%|¤J'\u0005¦*)G¨R*Î\u00ad\u0088,\u009f±î0æ³\u00982Ëµ©4\u0087·\u00866x¹U8S»+±û0æ³Ú2Çµ®4\u009c·\u00916g±ê0ë³Ù2Ûµð4Ã1ë°í3Ý²Å5¥´\u0085±î0æ³\u00982Óµº4\u009a·\u00866z¹W8U»`:\u0019½\u0012?ì¾Ô!Ã³<24±J0\u001a·\u007f6Uµ^4¸»\u008a:Ý¹í8Ì¿ß=*±\u00adm\u001bì\u0013omî%iXèckbê\u0088e¤\"Ä±î0æ³\u00982Áµ½4\u009c·\u008e6k¹\u001a8Q»<:\u0014½\u0004?ø¾Ù!Ó±ú0ü³Ú2Ïµ\u00974\u008d·Ú69±î0æ³\u00982Áµ½4\u009c·\u008e6k¹\u001a8G»':\u0015½\u0007?è¾È!× ¾#\u0090¢\u0088%g±û0ì³Ø2Æµº4\u009c·\u00816 ¹G8E»%:T½\u0007?è¾Ô!Â ¾#\u0090¢\u0085GÝÆÊEþÄàC\u009cÂºA§ÀvOjÎ?M^ÌrK5ÉÏH÷×ÞV\u0092ÕçTöÓ\u001aRyÑfP\u001aß<^0ÜÞ[ûÚÒY\u008eØãgú¶\u00047\u0013´'59²E3c°~1ß¾¬?±¼Þ=ãºó8\u0017¹\u001a&+§W$m¥6\"\u008b£¢ ´¡È.ò¯ò-\re\u0017ä\u0000g4æ*aVàpcmâÌm®ì¯oÍîïi´ëWj&õdtV÷wveñ\u0087pìóÿrÎ±û0æ³Ù2Äµ¤4\u0090·Í6|¹P8J»\u0011:\u001c½\u0010?å¾Õ!É ©#¦¢\u009e%+¤\u000e'\n¦5)\u001a¨\n*ô\u00adÌ,Â¯³.¢\u0091\u0092\u0010/\u0093\n!H @#>¢g%\u0001¤<'0¦Å)ý¨æ+\u008cª¸-´YíØå[\u009bÚÂ]¤Ü\u0099_\u0095ÞeQZÐCS*Ò\u001dUM×ìVÌÉÍH£Ë\u009eJËÍvLRÏHN6Á\u0019@\u0015ÂâEÏÄÁG½Æ\u008a±Ý0ç³Ò2Ñµ§4\u009c·\u00866\"¹L8\u0019»x±î0æ³\u00982Áµ½4\u009c·\u008e6k¹\u001a8E»':\b½\u0010?á¾Û!Þ â#\u0090¢\u0082N°Ï´L\u009dÍ\u008fJ½±õ0ç³ß2×µæ4\u0086·\u00946l¹\u001a8P»+:\u0016½\u0015? ¾Ê!Õ £#\u0089¢\u0095ðÀqÁòösûôËu°ö¸w\føtymú\n{8ü&~Åÿî`ù±í0ì³Û2Öµæ4\u0086·\u00846!¹R8@»%:\u001e½??î¾Û!Ê ©#\u008b¢\u0087±í0ì³Û2Öµæ4\u0086·\u00846!¹X8B»*:$½\u0004?è¾Ô!Ô ¥#\u008d¢\u009f±î0æ³\u00982Èµ\u00ad4\u0087·\u008c6j¹X8\u000f»/:\u0015½\u0004?ÿ¾Õ!Î ¨#×¢\u0097%v¤U'P¦6\u0006¡\u0087©\u0004×\u0085\u008e\u0002è\u0083Õ\u0000Ù\u0081n\u000e\n\u008f\u000b\fl\u008dA\n\u0001\u0088£\t\u0083\u0096\u008c\u0017Ü\u0094Ø\u0015È\u00921\u0013\u00120÷±ÿ2\u0081³Õ4µµ\u00816Õ·t8X¹Q:;»\u0006<W¾ò?Ê Ð!²¢\u0085#\u008d¤z%S¦U'%¨\u0012ôIuAö?wtð\u001dq=ò!sÝüð}òþÇ\u007f¾ø²zCûqddåEf8ç(`Úáøbçã\u0087l¨í±o_èwix±î0æ³\u00982Ðµ±4\u0086·\u00966j¹Y8\u000f»,:\u000e½\t?á¾Þ!\u0089 ª#\u0090¢\u0088%t¤]'W¦\")\r¨\r*ÿ\u00adÊ±î0æ³\u00982Ðµ±4\u0086·\u00966j¹Y8~»+:\u0003½\u0014?£¾Ø!Ò ¥#\u0095¢\u0082%=¤^'L¦<)\u0018¨\u0001*ã\u00adÎ,Ù¯¹.\u0093\u0091\u009e\u0086\u007f\u0007w\u0084\t\u0005D\u0082<\u0003\n\u0080\u0017\u0001ñ\u008e×\u000f\u009e\u008c½\r\u009f\u008a\u0098\bp\u0089O\u0016\u0018\u0097;\u0014\u0001\u0095\u0019\u0012å\u0093Ì\u0010Æ\u0091³\u001e\u009c\u009f\u009c\u001dn\u009a[]\u0016Ü\u001e_`Þ-YUØc[~Ú\u0098U¾Ô\u0086WÒÖïQóÓ\u0018RlÍ=LAÏhNrÉ\u008fHîË»JÃÅéDûÆ\fA4À#CZÂl}|ü\u009b±´ò&s?\u009có\u0018rjwë)h\u0017é\u0011n#ï@lCí¦b\u0085ãº`úáÖfÔä,*í«³(\u008d©\u008b.¹¯Ø,Ó\u00ad2\"\u0001£\u001a d¡\n&\\¤²%\u0097º\u009c;ð¸Æ9Ö¾)?9¼\u001c=i²O3C±«±³0í³Ó2Õµç4\u0086·\u008d6l¹_8D»::T½\u0007?è¾Ô!Þ ¨¬t-*®\u0014/\u0012¨ )AªJ+«¤\u0098%\u0083¦ý'\u0093 Ö\"/£\u0010<\u0015½o±³0ú³Ï2Ðµç4\u0084·\u00876b¹A8~»::\t½\u0001?î¾ß\u0088í\t¤\u008a\u0091\u000b\u008e\u008câ\rÎ\u008eÑ\u000f~\u0080\u0006\u0001\u0016\u0082r\u0003\n\u0084R\u0006º\u0087\u0086\u0018\u009a\u0099Í\u001aÊ\u009bÙ\u001c!\u009d\n\u001e\u0014\u009fo\u0010~\u0091^\u0013ª\u0094\u0082\u0015\u0080\u0096é\u0017ü¨Å),ª\u000f+\u0002¬&-n®Y±³0í³Ó2Õµç4\u0097·\u00916{¹k8F»>:\bêZk\u0004è:i<î\u000eo~ìxm\u0092â\u0082c¼àÎaÿæìî}o#ì\u001dm\u001bê)kHèCi¢æ\u0091g\u008aäôe\u009aâÌ`0á\u0000~\u000fÿm|[ýLz¸û\u0084x\u008f±³0ú³Ï2Ðµ¼4\u0090·\u008f6 ¹X8H»,:T½\f?ä¾Ø!Å ¿#\u008d¢\u0080%|¤T'A¦7)\r¨;*û\u00adÐ,Â¯þ.\u008e\u0091\u0085±³0í³Ó2Õµç4\u0097·\u00916{¹U8B»-:\u001e±³0í³Ó2Õµç4\u0097·\u00916{¹S8X»<:\u0014±³0í³Ó2Õµç4\u0097·\u00916{¹Y8D»):\u0015tÿõ¡v\u009f÷\u0099p«ñÛrÝó7|\u0017ý\u001f~kÿRJ÷Ë©H\u0097É\u0091N£ÏÓLÕÍ?B\u0006Ã\b@yÁXdOå\u0011f/ç)`\u001bákbmã\u0087l¸íºnÓïîhìê\u0012\u0001V\u0080\b\u00036\u00820\u0005\u0002\u0084r\u0007t\u0086\u009e\t\u008e\u0088\u00ad\u000bÆ\u008aûVù×§T\u009dÕ\u009dRãÓ\u0090PÌÑ*^\tß\u0005\\hÝ^ZKØ£Y\u0083ÆÂG¨ÄËEÎÂvC\u0010À\u001cAlÎ^±³0ä³Ø2×µç4\u0082·\u008b6a¹P8N»9:\b½O?Ï¾É!Ó \u009f#\u0091¢\u0087%a¤]'A¦\u0014)\u0010¨\b*õ\u00adÛ,ÙßÒ^\u0098Ý¥\\\u00adÛÊZ»ÙêX\u0001×%V/Õ]TnÓr±¬0ï³Ð2\u0083µò±³0ù³Ä2Ìµ«4Ú·\u00916j¹X8G»a:\u0016½\u0001?ý¾ÉfÍçÍdáåùb\u0092ã¬`·á\u0017neïxl\u0014í)j0èÒiÿöùwÔô¼u¿ÑhPxÓLR|Õ\u001cT(×)VÈÙÎXÊÛ¢ZÍÝ\u008b_z±³0ì³Â2Àµç4\u0098·\u00876k¹]8@»\u0011:\u0018½\u000f?é¾ß!Ä ¿#×¢\u009e%~¤T±þ0å³Ã2Æµ»4\u0081·\u00836l¹_8R±³0ì³Â2Àµç4\u0098·\u008d6z¹Z8U»=±³0í³×2×µ©4Ú·\u00866`¹C8O»\":\u0014½\u0001?é¾É!\u0088 â#\u009d¢\u0096%<¤Y'U¦\")\f¨J*é\u00adÓ,Ç±³0ù³Ä2Ìµ«4Ú·\u00816\u007f¹A8H» :\u001d½\u000fÞy_DÜx]eÚ\f[>Ø3YÅG$ÆzE@Ä@C>ÂMA\u0018ÀñOÐÎÕMöÌ\u009cK\u0085ÉuHK×YV7Õ\u000bT\u0002Ó«RÌÑÇP·ßÇ^ÃÜ)[JÚSY*ØDg\u0010æéeÈäÌc®â¢a\u0096ïpnaí\u0016l.ë3j\u0014éùhþ÷×v¨".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr;
                        TuitionPaymentFragmentbindingInflater1 = 8175239477935222921L;
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static java.lang.String $$e(byte r6, int r7, int r8) {
                        /*
                            int r6 = r6 * 3
                            int r0 = 1 - r6
                            byte[] r1 = com.koushikdutta.async.AsyncServer.AnonymousClass5.RunnableC01595.$$c
                            int r8 = r8 * 3
                            int r8 = 115 - r8
                            int r7 = r7 * 3
                            int r7 = 3 - r7
                            byte[] r0 = new byte[r0]
                            r2 = 0
                            int r6 = 0 - r6
                            if (r1 != 0) goto L19
                            r3 = r6
                            r8 = r7
                            r4 = r2
                            goto L30
                        L19:
                            r3 = r2
                        L1a:
                            byte r4 = (byte) r8
                            r0[r3] = r4
                            int r7 = r7 + 1
                            if (r3 != r6) goto L27
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r0, r2)
                            return r6
                        L27:
                            int r3 = r3 + 1
                            r4 = r1[r7]
                            r5 = r8
                            r8 = r7
                            r7 = r4
                            r4 = r3
                            r3 = r5
                        L30:
                            int r7 = r7 + r3
                            r3 = r4
                            r5 = r8
                            r8 = r7
                            r7 = r5
                            goto L1a
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.koushikdutta.async.AsyncServer.AnonymousClass5.RunnableC01595.$$e(byte, int, int):java.lang.String");
                    }
                }, 0L);
            } catch (Exception e2) {
                AsyncServer.this.TuitionPaymentFragmentbindingInflater1(new Runnable() { // from class: com.koushikdutta.async.AsyncServer.5.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass5.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(e2, (Object) null, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
                    }
                }, 0L);
            }
        }
    }

    public static /* synthetic */ InetAddress b(InetAddress[] inetAddressArr) throws Exception {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 49;
        int i3 = i2 % 128;
        RemoteActionCompatParcelizer = i3;
        InetAddress inetAddress = i2 % 2 == 0 ? inetAddressArr[1] : inetAddressArr[0];
        int i4 = i3 + 59;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return inetAddress;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdaonInputSurface1androidxcameracoreprocessingDefaultSurfaceProcessor lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 35;
        INotificationSideChannelDefault = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor.b.keys().iterator();
                throw null;
            }
            for (SelectionKey selectionKey : lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor.b.keys()) {
                int i3 = INotificationSideChannelDefault + 115;
                RemoteActionCompatParcelizer = i3 % 128;
                int i4 = i3 % 2;
                SurfaceEdgeExternalSyntheticLambda3.b(selectionKey.channel());
                try {
                    selectionKey.cancel();
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
    }

    private static long b(AsyncServer asyncServer, PriorityQueue<b> priorityQueue) {
        b bVar;
        long j = Long.MAX_VALUE;
        while (true) {
            synchronized (asyncServer) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                bVar = null;
                if (priorityQueue.size() > 0) {
                    b bVarRemove = priorityQueue.remove();
                    if (bVarRemove.TuitionPaymentFragmentspecialinlinedviewModeldefault3 <= jElapsedRealtime) {
                        bVar = bVarRemove;
                    } else {
                        j = bVarRemove.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - jElapsedRealtime;
                        priorityQueue.add(bVarRemove);
                    }
                }
            }
            if (bVar != null) {
                bVar.run();
            } else {
                asyncServer.d = 0;
                return j;
            }
        }
    }

    static class AsyncSelectorException extends IOException {
        public AsyncSelectorException(Exception exc) {
            super(exc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void b(AsyncServer asyncServer, lambdaonInputSurface1androidxcameracoreprocessingDefaultSurfaceProcessor lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor, PriorityQueue<b> priorityQueue) throws AsyncSelectorException {
        Object[] objArr;
        SelectionKey selectionKey;
        long jB = b(asyncServer, priorityQueue);
        try {
            synchronized (asyncServer) {
                if (lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor.b.selectNow() != 0) {
                    objArr = false;
                } else if (lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor.b.keys().size() == 0 && jB == Long.MAX_VALUE) {
                    return;
                } else {
                    objArr = true;
                }
                if (objArr != false) {
                    if (jB != Long.MAX_VALUE) {
                        lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jB);
                    } else {
                        lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(0L);
                    }
                }
                Set<SelectionKey> setSelectedKeys = lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor.b.selectedKeys();
                for (SelectionKey selectionKey2 : setSelectedKeys) {
                    try {
                        SocketChannel socketChannel = null;
                        SelectionKey selectionKeyRegister = null;
                        if (selectionKey2.isAcceptable()) {
                            try {
                                SocketChannel socketChannelAccept = ((ServerSocketChannel) selectionKey2.channel()).accept();
                                if (socketChannelAccept != null) {
                                    try {
                                        socketChannelAccept.configureBlocking(false);
                                        selectionKeyRegister = socketChannelAccept.register(lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor.b, 1);
                                        isSmallerByArea issmallerbyarea = new isSmallerByArea();
                                        issmallerbyarea.d = (InetSocketAddress) socketChannelAccept.socket().getRemoteSocketAddress();
                                        issmallerbyarea.b = new lambdaupdateTransformation3androidxcameracoreprocessingSurfaceEdge();
                                        issmallerbyarea.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new lambdaonInputSurface2androidxcameracoreprocessingDefaultSurfaceProcessor(socketChannelAccept);
                                        issmallerbyarea.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = asyncServer;
                                        issmallerbyarea.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = selectionKeyRegister;
                                        selectionKeyRegister.attach(issmallerbyarea);
                                    } catch (IOException unused) {
                                        selectionKey = selectionKeyRegister;
                                        socketChannel = socketChannelAccept;
                                        SurfaceEdgeExternalSyntheticLambda3.b(socketChannel);
                                        if (selectionKey != null) {
                                            selectionKey.cancel();
                                        }
                                    }
                                }
                            } catch (IOException unused2) {
                                selectionKey = null;
                            }
                        } else if (selectionKey2.isReadable()) {
                            ((isSmallerByArea) selectionKey2.attachment()).d();
                        } else if (selectionKey2.isWritable()) {
                            isSmallerByArea issmallerbyarea2 = (isSmallerByArea) selectionKey2.attachment();
                            failAllPendingSnapshots failallpendingsnapshots = issmallerbyarea2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            SelectionKey selectionKey3 = issmallerbyarea2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            selectionKey3.interestOps(selectionKey3.interestOps() & (-5));
                            lambdaonOutputSurface3androidxcameracoreprocessingDefaultSurfaceProcessor lambdaonoutputsurface3androidxcameracoreprocessingdefaultsurfaceprocessor = issmallerbyarea2.TuitionPaymentFragmentbindingInflater1;
                            if (lambdaonoutputsurface3androidxcameracoreprocessingdefaultsurfaceprocessor != null) {
                                lambdaonoutputsurface3androidxcameracoreprocessingdefaultsurfaceprocessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            }
                        } else if (selectionKey2.isConnectable()) {
                            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1) selectionKey2.attachment();
                            SocketChannel socketChannel2 = (SocketChannel) selectionKey2.channel();
                            selectionKey2.interestOps(1);
                            try {
                                socketChannel2.finishConnect();
                                isSmallerByArea issmallerbyarea3 = new isSmallerByArea();
                                issmallerbyarea3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = asyncServer;
                                issmallerbyarea3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = selectionKey2;
                                issmallerbyarea3.d = (InetSocketAddress) socketChannel2.socket().getRemoteSocketAddress();
                                issmallerbyarea3.b = new lambdaupdateTransformation3androidxcameracoreprocessingSurfaceEdge();
                                issmallerbyarea3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new lambdaonInputSurface2androidxcameracoreprocessingDefaultSurfaceProcessor(socketChannel2);
                                selectionKey2.attach(issmallerbyarea3);
                                if (tuitionPaymentFragmentbindingInflater1.b((Exception) null, issmallerbyarea3, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null)) {
                                    tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1.b(null, issmallerbyarea3);
                                }
                            } catch (IOException e2) {
                                selectionKey2.cancel();
                                SurfaceEdgeExternalSyntheticLambda3.b(socketChannel2);
                                if (tuitionPaymentFragmentbindingInflater1.b(e2, (Object) null, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null)) {
                                    tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1.b(e2, null);
                                }
                            }
                        } else {
                            throw new RuntimeException("Unknown key state.");
                        }
                    } catch (CancelledKeyException unused3) {
                    }
                }
                setSelectedKeys.clear();
            }
        } catch (Exception e3) {
            throw new AsyncSelectorException(e3);
        }
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements ThreadFactory {
        private final AtomicInteger TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AtomicInteger(1);
        private final ThreadGroup TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
            ThreadGroup threadGroup;
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = threadGroup;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder();
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAndIncrement());
            Thread thread = new Thread(threadGroup, runnable, sb.toString(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [boolean, int] */
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 107;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iCombineMeasuredStates = 2267 - View.combineMeasuredStates(0, 0);
            int trimmedLength = 33 - TextUtils.getTrimmedLength("");
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b2, bArr[40], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(minimumFlingVelocity, iCombineMeasuredStates, trimmedLength, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{12761, 49204, 50609, 60002}, new char[]{909, 63622, 20614, 11199}, (char) (Color.rgb(0, 0, 0) + 16777216), ViewConfiguration.getTouchSlop() >> 8, new char[]{42069, 13833, 24177, 53002, 39234, 40289, 30263, 48502, 42274, 20150, 39629, 22902, 33666, 8191, 49931, 53882, 36677, 23612, 15769, 15568, 4019, 13666}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{12761, 49204, 50609, 60002}, new char[]{17308, 5728, 32235, 45109}, (char) (13693 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 350855101, new char[]{39143, 13777, 21480, 64088, 21548, 25533, 9037, 48668, 15148, 47355, 54420, 53044, 3216, 1676, 47107}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
            int iRed = Color.red(0) + 2267;
            int fadingEdgeLength = 33 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(b3, bArr2[5], b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, iRed, fadingEdgeLength, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 2267;
                int i4 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 32;
                byte[] bArr3 = $$a;
                byte b4 = bArr3[7];
                Object[] objArr6 = new Object[1];
                c(b4, b4, bArr3[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarSize, touchSlop, i4, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[0])[0];
            int i6 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = (((((~((-235049500) | iIdentityHashCode)) | 565275008) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 721906164) + ((~((~iIdentityHashCode) | (-235049500))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) - 29434268;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
            c = 3;
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{12761, 49204, 50609, 60002}, new char[]{37620, 23924, 5478, 33723}, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 47893), TextUtils.getTrimmedLength(""), new char[]{7440, 7795, 49175, 48520, 65417, 27149, 20293, 9895, 14689, 59459, 39545, 14491, 55585, 64042, 43979, 58468, 39323, 43240, 15703, 63302, 62867, 57390, 59205, 11067, 27485, 58119}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{12761, 49204, 50609, 60002}, new char[]{16158, 12441, 7267, 2608}, (char) (View.combineMeasuredStates(0, 0) + 12316), (-1) - TextUtils.indexOf((CharSequence) "", '0'), new char[]{61297, 11995, 15359, 45692, 18719, 24141, 8228, 20, 43852, 27024, 37630, 42219, 47135, 2956, 64376, 1460, 14529, 48598}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{12761, 49204, 50609, 60002}, new char[]{55297, 50859, 45013, 47193}, (char) (22959 - Color.red(0)), ViewConfiguration.getDoubleTapTimeout() >> 16, new char[]{33728, 16490, 61763, 20584, 25696, 15077, 32432, 25146, 12645, 54120, 27739, 19643, 58977, 28124, 61934, 50527}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{12761, 49204, 50609, 60002}, new char[]{55930, 64760, 62675, 37458}, (char) (21236 - (ViewConfiguration.getPressedStateDuration() >> 16)), Color.blue(0), new char[]{28562, 28501, 23692, 31505, 4577, 9106, 61844, 50794, 37436, 21836, 12004, 2133, 51177, 30122, 12664, 55688}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i10 = INotificationSideChannelDefault + 19;
            RemoteActionCompatParcelizer = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -29434268};
                byte[] bArr4 = $$d;
                byte b5 = bArr4[9];
                byte b6 = (byte) (b5 - 1);
                byte b7 = b5;
                Object[] objArr13 = new Object[1];
                f(b6, b7, (byte) (b7 - 1), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b8 = bArr4[9];
                byte b9 = b8;
                Object[] objArr14 = new Object[1];
                f(b9, (byte) (b9 - 1), b8, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i12 = INotificationSideChannelDefault + 33;
                    RemoteActionCompatParcelizer = i12 % 128;
                    int i13 = i12 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                        int capsMode = 2267 - TextUtils.getCapsMode("", 0, 0);
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 33;
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[7];
                        Object[] objArr16 = new Object[1];
                        c(b10, b10, bArr5[5], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mirror, capsMode, pressedStateDuration, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(new char[]{12761, 49204, 50609, 60002}, new char[]{909, 63622, 20614, 11199}, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (-1) - TextUtils.indexOf((CharSequence) "", '0'), new char[]{42069, 13833, 24177, 53002, 39234, 40289, 30263, 48502, 42274, 20150, 39629, 22902, 33666, 8191, 49931, 53882, 36677, 23612, 15769, 15568, 4019, 13666}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e(new char[]{12761, 49204, 50609, 60002}, new char[]{17308, 5728, 32235, 45109}, (char) (13693 - ExpandableListView.getPackedPositionType(0L)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 350855102, new char[]{39143, 13777, 21480, 64088, 21548, 25533, 9037, 48668, 15148, 47355, 54420, 53044, 3216, 1676, 47107}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char trimmedLength2 = (char) TextUtils.getTrimmedLength("");
                            int packedPositionType = 2267 - ExpandableListView.getPackedPositionType(0L);
                            int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 33;
                            byte[] bArr6 = $$a;
                            byte b11 = bArr6[7];
                            byte b12 = b11;
                            byte b13 = bArr6[5];
                            byte b14 = b11;
                            Object[] objArr19 = new Object[1];
                            c(b12, b13, b14, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength2, packedPositionType, pressedStateDuration2, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char mirror2 = (char) (AndroidCharacter.getMirror('0') - '0');
                            int iRgb = (-16774949) - Color.rgb(0, 0, 0);
                            int i14 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 32;
                            byte[] bArr7 = $$a;
                            byte b15 = bArr7[7];
                            Object[] objArr20 = new Object[1];
                            c(b15, bArr7[40], b15, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror2, iRgb, i14, -887667012, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[c])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[1];
            if (strArr2 == null) {
                throw null;
            }
            for (String str : strArr2) {
                arrayList.add(str);
            }
            throw null;
        }
        Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i15 = ((int[]) objArr[2])[0];
        int i16 = ((int[]) objArr[0])[0];
        int i17 = ((int[]) objArr[3])[0];
        String[] strArr3 = (String[]) objArr[1];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i18 = i15 + (-816760812) + ((~((~iIdentityHashCode2) | (-571166722))) * 433) + (((~((-228895539) | iIdentityHashCode2)) | (-579817778)) * (-433)) + (((~(iIdentityHashCode2 | (-579817778))) | (-800062260)) * 433);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr21[2])[0] = i20 ^ (i20 << 5);
        int i21 = INotificationSideChannelDefault + 45;
        RemoteActionCompatParcelizer = i21 % 128;
        int i22 = i21 % 2;
        if (this.TuitionPaymentFragmentbindingInflater1 == Thread.currentThread()) {
            return true;
        }
        int i23 = ((int[]) objArr21[2])[0];
        int i24 = i23 * i23;
        int i25 = -(1385537757 * i23);
        int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
        int i27 = -(i23 * 1106934557);
        int i28 = ((i26 ^ i27) + ((i27 & i26) << 1)) - (-588491785);
        int i29 = i28 >> 19;
        int i30 = (((i29 | (-16383)) << 1) - (i29 ^ (-16383))) / 8192;
        int i31 = ((i30 | 1) << 1) - (i30 ^ 1);
        int i32 = ((i28 | i31) << 1) - (i31 ^ i28);
        int i33 = i28 >> 25;
        int i34 = ((i33 & (-255)) + (i33 | (-255))) / 128;
        int i35 = (-(((i34 ^ 1) + ((i34 & 1) << 1)) ^ i32)) + 4;
        int i36 = i35 >> 29;
        int i37 = ((i36 ^ (-15)) + ((i36 & (-15)) << 1)) / 8;
        int i38 = ((i37 | 1) << 1) - (i37 ^ 1);
        return 0 / ((i35 & (-((i38 ^ 1) + ((i38 & 1) << 1)))) * 835);
    }

    static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AsyncServer asyncServer, lambdaonInputSurface1androidxcameracoreprocessingDefaultSurfaceProcessor lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor, PriorityQueue priorityQueue) {
        while (true) {
            try {
                b(asyncServer, lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor, priorityQueue);
            } catch (AsyncSelectorException e2) {
                e2.getCause();
                SurfaceEdgeExternalSyntheticLambda3.b(lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor);
            }
            synchronized (asyncServer) {
                if (!lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor.b.isOpen() || (lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor.b.keys().size() <= 0 && priorityQueue.size() <= 0)) {
                    break;
                }
            }
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor);
        SurfaceEdgeExternalSyntheticLambda3.b(lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor);
        if (asyncServer.f838a == lambdaoninputsurface1androidxcameracoreprocessingdefaultsurfaceprocessor) {
            asyncServer.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new PriorityQueue<>(1, TuitionPaymentFragmentspecialinlinedviewModeldefault2.b);
            asyncServer.f838a = null;
            asyncServer.TuitionPaymentFragmentbindingInflater1 = null;
        }
    }

    static /* synthetic */ lambdaonInputSurface1androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentbindingInflater1(AsyncServer asyncServer) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (lambdaonInputSurface1androidxcameracoreprocessingDefaultSurfaceProcessor) TuitionPaymentFragmentspecialinlinedviewModeldefault2(-584405848, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{asyncServer}, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 584405848, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Runnable runnable, Semaphore semaphore) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(1888184288, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{runnable, semaphore}, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1888184286, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault2(InetSocketAddress inetSocketAddress, lambdaonInputSurface0androidxcameracoreprocessingDefaultSurfaceProcessor lambdaoninputsurface0androidxcameracoreprocessingdefaultsurfaceprocessor) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor) TuitionPaymentFragmentspecialinlinedviewModeldefault2(845635290, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this, inetSocketAddress, lambdaoninputsurface0androidxcameracoreprocessingdefaultsurfaceprocessor}, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -845635289, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    static void b() {
        notify = 5556360854052648168L;
        INotificationSideChannel = -981105359;
        cancel = (char) 34097;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, short r6, int r7) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r0 = com.koushikdutta.async.AsyncServer.$$c
            int r5 = r5 + 102
            int r7 = r7 * 4
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r4 = r5
            r5 = r7
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
        L27:
            int r6 = r6 + 1
            int r5 = r5 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.koushikdutta.async.AsyncServer.$$g(byte, short, int):java.lang.String");
    }
}
