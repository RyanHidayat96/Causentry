package com.squareup.okhttp;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.animation.core.AnimationKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.RouteDatabase;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.StreamAllocation;
import com.squareup.okhttp.internal.io.RealConnection;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.ref.Reference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public final class ConnectionPool {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long DEFAULT_KEEP_ALIVE_DURATION_MS = 300000;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static boolean b;
    private static int g;
    private static final ConnectionPool systemDefault;
    private Runnable cleanupRunnable;
    private final Deque<RealConnection> connections;
    private final Executor executor;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;
    final RouteDatabase routeDatabase;
    private static final byte[] $$c = {84, 10, 24, -102};
    private static final int $$f = 50;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {109, 7, 114, -90, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -60, 4, 4, 5, -8, 24, -20, 16, -7, 13, -3, 4, 18, -4, 8, 1, 1, 58, -73, 3, 17, 3, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 70};
    private static final int $$e = 248;
    private static final byte[] $$a = {91, -17, 90, 37, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 49;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f868a = 0;
    private static int asBinder = 1;

    private static void c(byte b2, int i, byte b3, Object[] objArr) {
        int i2 = b3 * 15;
        int i3 = (b2 * 52) + 4;
        byte[] bArr = $$a;
        int i4 = 84 - (i * 2);
        byte[] bArr2 = new byte[53 - i2];
        int i5 = 52 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i4 = (i5 + (-i4)) - 11;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b4 = bArr[i3];
            i3++;
            i4 = (i4 + (-b4)) - 11;
            i6 = i7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.squareup.okhttp.ConnectionPool.$$d
            int r5 = r5 * 53
            int r5 = 57 - r5
            int r6 = r6 * 15
            int r6 = 99 - r6
            int r1 = 54 - r7
            byte[] r1 = new byte[r1]
            int r7 = 53 - r7
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r4 = r0[r5]
            int r3 = r3 + 1
        L28:
            int r4 = -r4
            int r5 = r5 + 1
            int r6 = r6 + r4
            int r6 = r6 + 3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.ConnectionPool.e(int, short, byte, java.lang.Object[]):void");
    }

    static {
        long j;
        TuitionPaymentFragmentbindingInflater1 = 0;
        g = 1;
        b();
        String property = System.getProperty("http.keepAlive");
        String property2 = System.getProperty("http.keepAliveDuration");
        String property3 = System.getProperty("http.maxConnections");
        if (property2 != null) {
            int i = TuitionPaymentFragmentbindingInflater1 + 29;
            g = i % 128;
            if (i % 2 == 0) {
                Long.parseLong(property2);
                throw null;
            }
            j = Long.parseLong(property2);
            int i2 = 2 % 2;
        } else {
            int i3 = g + 107;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 / 4;
            } else {
                int i5 = 2 % 2;
            }
            j = 300000;
        }
        if (property != null) {
            int i6 = TuitionPaymentFragmentbindingInflater1 + 89;
            g = i6 % 128;
            if (i6 % 2 == 0) {
                Boolean.parseBoolean(property);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!Boolean.parseBoolean(property)) {
                systemDefault = new ConnectionPool(0, j);
                return;
            }
        }
        if (property3 != null) {
            systemDefault = new ConnectionPool(Integer.parseInt(property3), j);
        } else {
            systemDefault = new ConnectionPool(5, j);
        }
    }

    public ConnectionPool(int i, long j) {
        this(i, j, TimeUnit.MILLISECONDS);
    }

    public ConnectionPool(int i, long j, TimeUnit timeUnit) {
        this.executor = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp ConnectionPool", true));
        this.cleanupRunnable = new Runnable() { // from class: com.squareup.okhttp.ConnectionPool.1
            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    long jCleanup = ConnectionPool.this.cleanup(System.nanoTime());
                    if (jCleanup == -1) {
                        return;
                    }
                    if (jCleanup > 0) {
                        long j2 = jCleanup / AnimationKt.MillisToNanos;
                        synchronized (ConnectionPool.this) {
                            try {
                                ConnectionPool.this.wait(j2, (int) (jCleanup - (AnimationKt.MillisToNanos * j2)));
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
            }
        };
        this.connections = new ArrayDeque();
        this.routeDatabase = new RouteDatabase();
        this.maxIdleConnections = i;
        this.keepAliveDurationNs = timeUnit.toNanos(j);
        if (j <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: ".concat(String.valueOf(j)));
        }
        int i2 = asBinder + 13;
        f868a = i2 % 128;
        int i3 = i2 % 2;
    }

    public static ConnectionPool getDefault() {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        int i3 = i2 % 128;
        f868a = i3;
        int i4 = i2 % 2;
        ConnectionPool connectionPool = systemDefault;
        int i5 = i3 + 13;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return connectionPool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getIdleConnectionCount() {
        int i;
        synchronized (this) {
            Iterator<RealConnection> it = this.connections.iterator();
            i = 0;
            while (it.hasNext()) {
                if (it.next().allocations.isEmpty()) {
                    i++;
                }
            }
        }
        return i;
    }

    public final int getConnectionCount() {
        int size;
        synchronized (this) {
            size = this.connections.size();
        }
        return size;
    }

    @Deprecated
    public final int getSpdyConnectionCount() {
        int multiplexedConnectionCount;
        synchronized (this) {
            multiplexedConnectionCount = getMultiplexedConnectionCount();
        }
        return multiplexedConnectionCount;
    }

    public final int getMultiplexedConnectionCount() {
        int i;
        synchronized (this) {
            Iterator<RealConnection> it = this.connections.iterator();
            i = 0;
            while (it.hasNext()) {
                if (it.next().isMultiplexed()) {
                    i++;
                }
            }
        }
        return i;
    }

    public final int getHttpConnectionCount() {
        int size;
        int multiplexedConnectionCount;
        synchronized (this) {
            size = this.connections.size();
            multiplexedConnectionCount = getMultiplexedConnectionCount();
        }
        return size - multiplexedConnectionCount;
    }

    private static void d(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        float f = 0.0f;
        if (cArr3 != null) {
            int i4 = $10 + 95;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 113;
                $10 = i6 % 128;
                int i7 = i6 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - Gravity.getAbsoluteGravity(0, 0)), 2994 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 18, 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
                    int i8 = $10 + 7;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    i2 = 2;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i10 = $11 + 101;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 / 5;
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        long j = 0;
        char c = '0';
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43324 - TextUtils.lastIndexOf("", '0')), 254 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), Color.green(0) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i12 = $11 + 11;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 >> 1) + getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] << i] + iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf("", c) + 33603), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3085, (Process.myTid() >> 22) + 26, -2146875848, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } else {
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 3085, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 26, -2146875848, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                int i13 = $10 + 49;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                c = '0';
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!b) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i15 = $11 + 51;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 >> getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] + iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >>= 1;
                } else {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                }
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char offsetBefore = (char) (33602 - TextUtils.getOffsetBefore("", 0));
                int i16 = 3086 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int packedPositionChild = ExpandableListView.getPackedPositionChild(j) + 27;
                byte b8 = (byte) 0;
                byte b9 = (byte) (b8 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore, i16, packedPositionChild, -2146875848, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            j = 0;
        }
        objArr[0] = new String(cArr6);
    }

    final RealConnection get(Address address, StreamAllocation streamAllocation) {
        int i = 2 % 2;
        for (RealConnection realConnection : this.connections) {
            int i2 = asBinder + 69;
            f868a = i2 % 128;
            int i3 = i2 % 2;
            if (realConnection.allocations.size() < realConnection.allocationLimit()) {
                int i4 = f868a + 125;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                if (address.equals(realConnection.getRoute().address)) {
                    int i6 = asBinder + 97;
                    f868a = i6 % 128;
                    if (i6 % 2 != 0) {
                        boolean z = realConnection.noNewStreams;
                        throw null;
                    }
                    if (!realConnection.noNewStreams) {
                        streamAllocation.acquire(realConnection);
                        return realConnection;
                    }
                } else {
                    continue;
                }
            }
        }
        int i7 = f868a + 19;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    final void put(RealConnection realConnection) {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        f868a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.connections.isEmpty();
            obj.hashCode();
            throw null;
        }
        if (this.connections.isEmpty()) {
            this.executor.execute(this.cleanupRunnable);
        }
        this.connections.add(realConnection);
        int i3 = f868a + 29;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    final boolean connectionBecameIdle(RealConnection realConnection) {
        int i = 2 % 2;
        int i2 = f868a + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (!realConnection.noNewStreams) {
            int i4 = f868a;
            int i5 = i4 + 93;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            if (this.maxIdleConnections != 0) {
                int i6 = i4 + 81;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                notifyAll();
                return false;
            }
        }
        this.connections.remove(realConnection);
        int i8 = asBinder + 77;
        f868a = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public final void evictAll() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<RealConnection> it = this.connections.iterator();
            while (it.hasNext()) {
                RealConnection next = it.next();
                if (next.allocations.isEmpty()) {
                    next.noNewStreams = true;
                    arrayList.add(next);
                    it.remove();
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Util.closeQuietly(((RealConnection) it2.next()).getSocket());
        }
    }

    final long cleanup(long j) {
        synchronized (this) {
            int i = 0;
            RealConnection realConnection = null;
            long j2 = Long.MIN_VALUE;
            int i2 = 0;
            for (RealConnection realConnection2 : this.connections) {
                if (pruneAndGetAllocationCount(realConnection2, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - realConnection2.idleAtNanos;
                    if (j3 > j2) {
                        realConnection = realConnection2;
                        j2 = j3;
                    }
                }
            }
            long j4 = this.keepAliveDurationNs;
            if (j2 >= j4 || i > this.maxIdleConnections) {
                this.connections.remove(realConnection);
                Util.closeQuietly(realConnection.getSocket());
                return 0L;
            }
            if (i > 0) {
                return j4 - j2;
            }
            if (i2 > 0) {
                return j4;
            }
            return -1L;
        }
    }

    private int pruneAndGetAllocationCount(RealConnection realConnection, long j) throws Throwable {
        Object[] objArr;
        char c;
        Object[] objArr2;
        int i = 2 % 2;
        List<Reference<StreamAllocation>> list = realConnection.allocations;
        int i2 = 0;
        while (true) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2267;
                int maximumFlingVelocity = 33 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr3 = new Object[1];
                c(b2, b3, b3, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, jumpTapTimeout, maximumFlingVelocity, -887667012, false, (String) objArr3[0], null);
            }
            Object obj = null;
            long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr4 = new Object[1];
            d(null, null, 175 - AndroidCharacter.getMirror('0'), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            d(null, null, ((Process.getThreadPriority(0) + 20) >> 6) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr5);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                int minimumFlingVelocity = 2267 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iArgb = 33 - Color.argb(0, 0, 0, 0);
                byte[] bArr = $$a;
                byte b4 = bArr[5];
                byte b5 = bArr[7];
                Object[] objArr6 = new Object[1];
                c(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, minimumFlingVelocity, iArgb, -874156483, false, (String) objArr6[0], null);
            }
            if (j2 == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2267;
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 33;
                    byte[] bArr2 = $$a;
                    Object[] objArr7 = new Object[1];
                    c(bArr2[40], bArr2[7], bArr2[5], objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumDrawingCacheSize, doubleTapTimeout, iKeyCodeFromString, -654680577, false, (String) objArr7[0], null);
                }
                Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i3 = ((int[]) objArr8[0])[0];
                int i4 = ((int[]) objArr8[3])[0];
                String[] strArr = (String[]) objArr8[1];
                int iNextInt = new Random().nextInt(1569980657);
                int i5 = (-490603819) + (((~((-65111904) | iNextInt)) | (-804517728)) * (-502)) + ((~((~iNextInt) | (-60916316))) * (-502)) + (((~(iNextInt | (-743601413))) | (-65111904)) * TypedValues.PositionType.TYPE_DRAWPATH) + 354895791;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr[2])[0] = i7 ^ (i7 << 5);
                c = 3;
            } else {
                Object[] objArr9 = new Object[1];
                d(null, null, 127 - View.resolveSizeAndState(0, 0, 0), new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                d(null, null, 127 - (Process.myPid() >> 22), new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr10);
                Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr11 = new Object[1];
                d(null, null, KeyEvent.keyCodeFromString("") + 127, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                d(null, null, 127 - TextUtils.indexOf("", "", 0, 0), new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr12);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
                int i8 = f868a + 33;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr13 = {applicationContext, Integer.valueOf(iIntValue), 0, 354895791};
                    byte[] bArr3 = $$d;
                    byte b6 = bArr3[50];
                    byte b7 = (byte) (b6 - 1);
                    Object[] objArr14 = new Object[1];
                    e(b6, b7, b7, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    byte b8 = bArr3[50];
                    byte b9 = (byte) (b8 - 1);
                    byte b10 = b8;
                    Object[] objArr15 = new Object[1];
                    e(b9, b10, b10, objArr15);
                    Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                            int i10 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2266;
                            int iIndexOf = TextUtils.indexOf("", "") + 33;
                            byte[] bArr4 = $$a;
                            Object[] objArr17 = new Object[1];
                            c(bArr4[40], bArr4[7], bArr4[5], objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cKeyCodeFromString, i10, iIndexOf, -654680577, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                        try {
                            Object[] objArr18 = new Object[1];
                            d(null, null, 127 - View.resolveSize(0, 0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr18);
                            Class<?> cls5 = Class.forName((String) objArr18[0]);
                            Object[] objArr19 = new Object[1];
                            d(null, null, 127 - Color.blue(0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr19);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                                int iCombineMeasuredStates = 2267 - View.combineMeasuredStates(0, 0);
                                int mirror = AndroidCharacter.getMirror('0') - 15;
                                byte[] bArr5 = $$a;
                                byte b11 = bArr5[5];
                                byte b12 = bArr5[7];
                                Object[] objArr20 = new Object[1];
                                c(b11, b12, b12, objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetAfter, iCombineMeasuredStates, mirror, -874156483, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                int fadingEdgeLength = 2267 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                int i11 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 32;
                                byte b13 = $$a[7];
                                byte b14 = b13;
                                Object[] objArr21 = new Object[1];
                                c(b13, b14, b14, objArr21);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(threadPriority, fadingEdgeLength, i11, -887667012, false, (String) objArr21[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr16;
                    c = 3;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i12 = ((int[]) objArr[c])[0];
            int i13 = ((int[]) objArr[0])[0];
            if (i13 == i12) {
                objArr2 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i14 = ((int[]) objArr[2])[0];
                int i15 = ((int[]) objArr[0])[0];
                int i16 = ((int[]) objArr[3])[0];
                String[] strArr2 = (String[]) objArr[1];
                int iIdentityHashCode = System.identityHashCode(this);
                int i17 = ~iIdentityHashCode;
                int i18 = (~((-934111344) | i17)) | 120154123;
                int i19 = ~(iIdentityHashCode | 939355247);
                int i20 = i14 + 324650742 + ((i18 | i19) * (-713)) + (i19 * 1426) + ((~(125398027 | i17)) * 713);
                int i21 = (i20 << 13) ^ i20;
                int i22 = i21 ^ (i21 >>> 17);
                ((int[]) objArr2[2])[0] = i22 ^ (i22 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr[1];
                if (strArr3 != null) {
                    int i23 = f868a + 19;
                    asBinder = i23 % 128;
                    int i24 = i23 % 2;
                    for (String str : strArr3) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
                objArr2 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i25 = ((int[]) objArr[2])[0];
                int i26 = ((int[]) objArr[0])[0];
                int i27 = ((int[]) objArr[3])[0];
                String[] strArr4 = (String[]) objArr[1];
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i28 = i25 + ((((~((-988112984) | elapsedCpuTime)) | 178350163) * (-566)) - 1324309531) + ((~(elapsedCpuTime | (-809762821))) * 566);
                int i29 = (i28 << 13) ^ i28;
                int i30 = i29 ^ (i29 >>> 17);
                ((int[]) objArr2[2])[0] = i30 ^ (i30 << 5);
            }
            if (i2 >= list.size()) {
                int size = list.size();
                int i31 = f868a + 3;
                asBinder = i31 % 128;
                int i32 = i31 % 2;
                return size;
            }
            int i33 = asBinder + 53;
            f868a = i33 % 128;
            if (i33 % 2 != 0) {
                list.get(i2).get();
                obj.hashCode();
                throw null;
            }
            if (list.get(i2).get() != null) {
                i2++;
            } else {
                Logger logger = Internal.logger;
                int i34 = ((int[]) objArr2[2])[0];
                int i35 = ((i34 * i34) - (~(-(1369705718 * i34)))) - 1;
                int i36 = -(i34 * (-1991947934));
                int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
                int i38 = (i37 & 173264784) + (173264784 | i37);
                int i39 = i38 >> 15;
                int i40 = (((-262143) & i39) + (i39 | (-262143))) / 131072;
                int i41 = (i40 & 1) + (i40 | 1);
                int i42 = ((i38 | i41) << 1) - (i41 ^ i38);
                int i43 = i38 >> 19;
                int i44 = (((i43 | (-16383)) << 1) - (i43 ^ (-16383))) / 8192;
                int i45 = -(((i44 & 1) + (i44 | 1)) ^ i42);
                int i46 = (i45 & 6) + (i45 | 6);
                int i47 = i46 >> 22;
                int i48 = ((i47 & (-2047)) + (i47 | (-2047))) / 1024;
                int i49 = (i48 & 1) + (i48 | 1);
                StringBuilder sb = new StringBuilder("8/A connection to ".substring(15252 / (((-(((i49 | 1) << 1) - (i49 ^ 1))) & i46) * 1271)));
                sb.append(realConnection.getRoute().getAddress().url());
                sb.append(" was leaked. Did you forget to close a response body?");
                logger.warning(sb.toString());
                list.remove(i2);
                realConnection.noNewStreams = true;
                if (list.isEmpty()) {
                    realConnection.idleAtNanos = j - this.keepAliveDurationNs;
                    return 0;
                }
            }
        }
    }

    final void setCleanupRunnableForTest(Runnable runnable) {
        int i = 2 % 2;
        int i2 = f868a + 25;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.cleanupRunnable = runnable;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 1;
        f868a = i5 % 128;
        int i6 = i5 % 2;
    }

    static void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new char[]{47259, 47246, 47256, 47242, 47245, 47251, 47182, 47241, 47209, 47235, 47240, 47255, 47247, 47225, 47248, 47257, 47249, 47244, 47210, 47227, 47238, 47208, 47252, 47239, 47250, 47253, 47220};
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2047719484;
        b = true;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
    }

    private static String $$g(byte b2, byte b3, int i) {
        int i2 = (i * 4) + 4;
        int i3 = b2 * 3;
        int i4 = 68 - b3;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2++;
            i4 += -i3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i4;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            byte b4 = bArr[i2];
            i2++;
            i4 += -b4;
        }
    }
}
