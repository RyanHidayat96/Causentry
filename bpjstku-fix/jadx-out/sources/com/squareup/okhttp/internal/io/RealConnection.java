package com.squareup.okhttp.internal.io;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.squareup.okhttp.Address;
import com.squareup.okhttp.CertificatePinner;
import com.squareup.okhttp.Connection;
import com.squareup.okhttp.ConnectionSpec;
import com.squareup.okhttp.Handshake;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.Route;
import com.squareup.okhttp.internal.ConnectionSpecSelector;
import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.Version;
import com.squareup.okhttp.internal.framed.FramedConnection;
import com.squareup.okhttp.internal.http.Http1xStream;
import com.squareup.okhttp.internal.http.OkHeaders;
import com.squareup.okhttp.internal.http.RouteException;
import com.squareup.okhttp.internal.http.StreamAllocation;
import com.squareup.okhttp.internal.tls.OkHostnameVerifier;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListener;
import defpackage.SessionProcessor;
import defpackage.SurfaceViewImplementation;
import defpackage.initSession;
import defpackage.tryToComplete;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes7.dex */
public final class RealConnection implements Connection {
    public volatile FramedConnection framedConnection;
    private Handshake handshake;
    public boolean noNewStreams;
    private Protocol protocol;
    private Socket rawSocket;
    private final Route route;
    public RotationProviderListener sink;
    public Socket socket;
    public RotationProvider1 source;
    public int streamCount;
    private static final byte[] $$c = {89, 92, -72, 43};
    private static final int $$f = 232;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {53, -70, 9, -72, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 117;
    private static final byte[] $$a = {109, 48, -62, 38, 3, -5, -4, 6};
    private static final int $$b = 243;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int b = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -6377398940819159759L;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -981105359;
    private static char TuitionPaymentFragmentbindingInflater1 = 25541;
    public final List<Reference<StreamAllocation>> allocations = new ArrayList();
    public long idleAtNanos = Long.MAX_VALUE;

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r0 = com.squareup.okhttp.internal.io.RealConnection.$$a
            int r6 = r6 * 4
            int r1 = 5 - r6
            int r8 = r8 * 2
            int r8 = r8 + 99
            byte[] r1 = new byte[r1]
            int r6 = 4 - r6
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L32
        L18:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1c:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2d
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2d:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L32:
            int r7 = r7 + r8
            int r7 = r7 + 2
            r8 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.io.RealConnection.a(int, byte, byte, java.lang.Object[]):void");
    }

    private static void c(byte b2, short s, int i, Object[] objArr) {
        int i2 = 56 - (i * 52);
        int i3 = b2 * 52;
        byte[] bArr = $$d;
        int i4 = s + 84;
        byte[] bArr2 = new byte[53 - i3];
        int i5 = 52 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2++;
            i4 = (i5 + i2) - 11;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b3 = bArr[i2];
                i2++;
                i4 = (i4 + b3) - 11;
            }
        }
    }

    public RealConnection(Route route) {
        this.route = route;
    }

    public final void connect(int i, int i2, int i3, List<ConnectionSpec> list, boolean z) throws RouteException {
        Socket socketCreateSocket;
        int i4 = 2 % 2;
        if (this.protocol != null) {
            throw new IllegalStateException("already connected");
        }
        ConnectionSpecSelector connectionSpecSelector = new ConnectionSpecSelector(list);
        Proxy proxy = this.route.getProxy();
        Address address = this.route.getAddress();
        if (this.route.getAddress().getSslSocketFactory() == null) {
            int i5 = b + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            if (!list.contains(ConnectionSpec.CLEARTEXT)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not supported: ".concat(String.valueOf(list))));
            }
        }
        RouteException routeException = null;
        while (this.protocol == null) {
            try {
                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
                    socketCreateSocket = address.getSocketFactory().createSocket();
                    int i7 = b + 33;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    socketCreateSocket = new Socket(proxy);
                }
                this.rawSocket = socketCreateSocket;
                connectSocket(i, i2, i3, connectionSpecSelector);
            } catch (IOException e2) {
                Util.closeQuietly(this.socket);
                Util.closeQuietly(this.rawSocket);
                this.socket = null;
                this.rawSocket = null;
                this.source = null;
                this.sink = null;
                this.handshake = null;
                this.protocol = null;
                if (routeException == null) {
                    routeException = new RouteException(e2);
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
                    b = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    routeException.addConnectException(e2);
                }
                if (!z) {
                    throw routeException;
                }
                int i11 = b + 77;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 91 / 0;
                    if (!connectionSpecSelector.connectionFailed(e2)) {
                        throw routeException;
                    }
                } else if (!connectionSpecSelector.connectionFailed(e2)) {
                    throw routeException;
                }
            }
        }
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
        int i5 = $11 + 37;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 % 4;
        }
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i7 = $10 + 105;
            $11 = i7 % 128;
            int i8 = i7 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cLastIndexOf = (char) (8327 - TextUtils.lastIndexOf("", '0', i4, i4));
                    int threadPriority = ((Process.getThreadPriority(i4) + 20) >> 6) + 1235;
                    int mode = 35 - View.MeasureSpec.getMode(i4);
                    byte b2 = (byte) i4;
                    byte b3 = b2;
                    String str$$g = $$g(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, threadPriority, mode, -653973969, false, str$$g, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 2;
                    byte b5 = (byte) (b4 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), Color.green(i4) + 2764, TextUtils.indexOf((CharSequence) "", '0', i4) + 15, 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.rgb(0, 0, 0) + 16820541), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 254, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 65200), TextUtils.getTrimmedLength("") + 2891, (ViewConfiguration.getLongPressTimeout() >> 16) + 17, 2012627446, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
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
        int i9 = $11 + 93;
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 73 / 0;
        }
    }

    private void connectSocket(int i, int i2, int i3, ConnectionSpecSelector connectionSpecSelector) throws Throwable {
        int i4 = 2 % 2;
        this.rawSocket.setSoTimeout(i2);
        try {
            Platform.get().connectSocket(this.rawSocket, this.route.getSocketAddress(), i);
            this.source = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.rawSocket));
            this.sink = SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.rawSocket));
            if (this.route.getAddress().getSslSocketFactory() != null) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
                b = i5 % 128;
                int i6 = i5 % 2;
                connectTls(i2, i3, connectionSpecSelector);
            } else {
                this.protocol = Protocol.HTTP_1_1;
                this.socket = this.rawSocket;
            }
            if (this.protocol != Protocol.SPDY_3) {
                int i7 = b + 13;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                int i8 = i7 % 2;
                if (this.protocol != Protocol.HTTP_2) {
                    return;
                }
            }
            this.socket.setSoTimeout(0);
            FramedConnection framedConnectionBuild = new FramedConnection.Builder(true).socket(this.socket, this.route.getAddress().url().host(), this.source, this.sink).protocol(this.protocol).build();
            framedConnectionBuild.sendConnectionPreface();
            this.framedConnection = framedConnectionBuild;
        } catch (ConnectException unused) {
            StringBuilder sb = new StringBuilder("Failed to connect to ");
            sb.append(this.route.getSocketAddress());
            throw new ConnectException(sb.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0678  */
    /* JADX WARN: Code duplicated, block: B:172:0x07ad A[Catch: all -> 0x07b4, TryCatch #12 {all -> 0x07b4, blocks: (B:170:0x07a7, B:172:0x07ad, B:173:0x07b2, B:174:0x07b3), top: B:188:0x07a7 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x07b3 A[Catch: all -> 0x07b4, TRY_LEAVE, TryCatch #12 {all -> 0x07b4, blocks: (B:170:0x07a7, B:172:0x07ad, B:173:0x07b2, B:174:0x07b3), top: B:188:0x07a7 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x07b9  */
    private void connectTls(int i, int i2, ConnectionSpecSelector connectionSpecSelector) throws Throwable {
        Throwable th;
        SSLSocket sSLSocket;
        AssertionError assertionError;
        SSLSocket sSLSocket2;
        ConnectionSpec connectionSpec;
        Address address;
        String string;
        SSLSocket sSLSocket3;
        String selectedProtocol;
        Method method;
        int i3 = 2 % 2;
        int i4 = b + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            this.route.requiresTunnel();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.route.requiresTunnel()) {
            createTunnel(i, i2);
        }
        Address address2 = this.route.getAddress();
        try {
            sSLSocket2 = (SSLSocket) address2.getSslSocketFactory().createSocket(this.rawSocket, address2.getUriHost(), address2.getUriPort(), true);
            try {
                ConnectionSpec connectionSpecConfigureSecureSocket = connectionSpecSelector.configureSecureSocket(sSLSocket2);
                if (connectionSpecConfigureSecureSocket.supportsTlsExtensions()) {
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
                    b = i5 % 128;
                    int i6 = i5 % 2;
                    Platform.get().configureTlsExtensions(sSLSocket2, address2.getUriHost(), address2.getProtocols());
                }
                ArrayList arrayList = new ArrayList();
                byte b2 = (byte) 0;
                byte b3 = b2;
                Object[] objArr = new Object[1];
                a(b2, b3, b3, objArr);
                Method[] methodArr = {CertificatePinner.class.getMethod((String) objArr[0], String.class, List.class)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cBlue = (char) Color.blue(0);
                    int i7 = 2823 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int gidForName = 21 - Process.getGidForName("");
                    byte[] bArr = $$d;
                    byte b4 = bArr[7];
                    Object[] objArr2 = new Object[1];
                    c(b4, b4, (byte) (-bArr[5]), objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, i7, gidForName, 1814927978, false, (String) objArr2[0], null);
                }
                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) != null) {
                    address = address2;
                    connectionSpec = connectionSpecConfigureSecureSocket;
                    break;
                }
                try {
                    Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getTouchSlop() >> 8), 2823 - ExpandableListView.getPackedPositionType(0L), ExpandableListView.getPackedPositionChild(0L) + 23)).getDeclaredMethods();
                    int length = declaredMethods.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            address = address2;
                            connectionSpec = connectionSpecConfigureSecureSocket;
                            break;
                        }
                        Method method2 = declaredMethods[i8];
                        try {
                            Method[] methodArr2 = declaredMethods;
                            int i9 = length;
                            Object[] objArr3 = new Object[1];
                            d(new char[]{0, 0, 0, 0}, new char[]{39063, 13354, 18175, 40968}, (char) (Process.myTid() >> 22), ViewConfiguration.getKeyRepeatTimeout() >> 16, new char[]{6193, 57129, 63312, 48534, 8017, 60304, 58680, 44750, 20211, 41083, 60595, 38325, 7550, 15445, 14631, 43090, 35885, 56627, 21676, 43449, 63290, 41100, 10502, 3581}, objArr3);
                            Class<?> cls = Class.forName((String) objArr3[0]);
                            connectionSpec = connectionSpecConfigureSecureSocket;
                            Object[] objArr4 = new Object[1];
                            d(new char[]{0, 0, 0, 0}, new char[]{45657, 45779, 64970, 37154}, (char) KeyEvent.keyCodeFromString(""), ViewConfiguration.getKeyRepeatTimeout() >> 16, new char[]{58683, 53780, 41162, 17139, 12393, 36070, 45908, 30128, 23170, 45680, 10096, 44086}, objArr4);
                            Object[] objArr5 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr4[0], null).invoke(method2, null)).intValue())};
                            Object[] objArr6 = new Object[1];
                            d(new char[]{0, 0, 0, 0}, new char[]{63205, 32534, 18774, 35041}, (char) (57673 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), ViewConfiguration.getMaximumFlingVelocity() >> 16, new char[]{35495, 22505, 15139, 13506, 13786, 15778, 51765, 18278, 58289, 11908, 64924, 65186, 29720, 9115, 53430, 20779, 38233, 46665, 15844, 53990, 41390, 43437, 25750, 16484, 11469, 6455}, objArr6);
                            Class<?> cls2 = Class.forName((String) objArr6[0]);
                            address = address2;
                            Object[] objArr7 = new Object[1];
                            d(new char[]{0, 0, 0, 0}, new char[]{7938, 49515, 53656, 56140}, (char) View.resolveSizeAndState(0, 0, 0), ViewConfiguration.getTapTimeout() >> 16, new char[]{59274, 24994, 28372, 19464, 8289, 31158, 9081, 43493}, objArr7);
                            if (((Boolean) cls2.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).booleanValue()) {
                                Class cls3 = Long.TYPE;
                                Object[] objArr8 = new Object[1];
                                d(new char[]{0, 0, 0, 0}, new char[]{39063, 13354, 18175, 40968}, (char) (ViewConfiguration.getScrollBarSize() >> 8), Color.red(0), new char[]{6193, 57129, 63312, 48534, 8017, 60304, 58680, 44750, 20211, 41083, 60595, 38325, 7550, 15445, 14631, 43090, 35885, 56627, 21676, 43449, 63290, 41100, 10502, 3581}, objArr8);
                                Class<?> cls4 = Class.forName((String) objArr8[0]);
                                Object[] objArr9 = new Object[1];
                                d(new char[]{0, 0, 0, 0}, new char[]{16173, 45278, 52116, 55164}, (char) (31947 - KeyEvent.getDeadChar(0, 0)), View.resolveSizeAndState(0, 0, 0) - 1800348097, new char[]{23466, 56855, 8736, 42756, 37183, 49122, 36313, 56168, 16037, 40070, 54659, 954, 26347}, objArr9);
                                if (cls3.equals(cls4.getMethod((String) objArr9[0], null).invoke(method2, null))) {
                                    Object[] objArr10 = new Object[1];
                                    d(new char[]{0, 0, 0, 0}, new char[]{39063, 13354, 18175, 40968}, (char) View.MeasureSpec.getSize(0), AndroidCharacter.getMirror('0') - '0', new char[]{6193, 57129, 63312, 48534, 8017, 60304, 58680, 44750, 20211, 41083, 60595, 38325, 7550, 15445, 14631, 43090, 35885, 56627, 21676, 43449, 63290, 41100, 10502, 3581}, objArr10);
                                    Class<?> cls5 = Class.forName((String) objArr10[0]);
                                    Object[] objArr11 = new Object[1];
                                    d(new char[]{0, 0, 0, 0}, new char[]{25798, 35353, 7420, 47926}, (char) (13852 - (KeyEvent.getMaxKeyCode() >> 16)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 58058397, new char[]{62142, 53015, 26653, 14493, 57746, 4124, 31263, 36302, 22891, 22580, 57127, 51629, 45828, 53649, 9951, 27416, 35088}, objArr11);
                                    Object[] objArr12 = (Object[]) cls5.getMethod((String) objArr11[0], null).invoke(method2, null);
                                    if (objArr12.length == 2 && Long.TYPE.equals(objArr12[0])) {
                                        try {
                                            Object[] objArr13 = new Object[1];
                                            d(new char[]{0, 0, 0, 0}, new char[]{39063, 13354, 18175, 40968}, (char) ((-1) - MotionEvent.axisFromString("")), Process.myPid() >> 22, new char[]{6193, 57129, 63312, 48534, 8017, 60304, 58680, 44750, 20211, 41083, 60595, 38325, 7550, 15445, 14631, 43090, 35885, 56627, 21676, 43449, 63290, 41100, 10502, 3581}, objArr13);
                                            if (Class.forName((String) objArr13[0]).equals(objArr12[1])) {
                                                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                                                b = i10 % 128;
                                                int i11 = i10 % 2;
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                                                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 2823;
                                                    int packedPositionGroup = 22 - ExpandableListView.getPackedPositionGroup(0L);
                                                    byte[] bArr2 = $$d;
                                                    byte b5 = bArr2[7];
                                                    Object[] objArr14 = new Object[1];
                                                    c(b5, b5, (byte) (-bArr2[5]), objArr14);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, iResolveOpacity, packedPositionGroup, 1814927978, false, (String) objArr14[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                                                    int iIndexOf = 2822 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                                    int modifierMetaStateMask = 21 - ((byte) KeyEvent.getModifierMetaStateMask());
                                                    byte[] bArr3 = $$d;
                                                    byte b6 = bArr3[7];
                                                    Object[] objArr15 = new Object[1];
                                                    c(b6, b6, (byte) (-bArr3[5]), objArr15);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, iIndexOf, modifierMetaStateMask, 1814927978, false, (String) objArr15[0], null);
                                                }
                                                try {
                                                    Object[] objArr16 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                        char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                                        int iAlpha = Color.alpha(0) + 2823;
                                                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 22;
                                                        byte[] bArr4 = $$d;
                                                        Object[] objArr17 = new Object[1];
                                                        c((byte) (-bArr4[5]), bArr4[54], bArr4[7], objArr17);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(tapTimeout, iAlpha, offsetBefore, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr16)).longValue();
                                                    break;
                                                } catch (Throwable th2) {
                                                    Throwable cause = th2.getCause();
                                                    if (cause == null) {
                                                        throw th2;
                                                    }
                                                    throw cause;
                                                }
                                            }
                                        } catch (AssertionError e2) {
                                            assertionError = e2;
                                            sSLSocket = sSLSocket2;
                                            try {
                                                if (Util.isAndroidGetsocknameError(assertionError)) {
                                                    throw assertionError;
                                                }
                                                throw new IOException(assertionError);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                sSLSocket2 = sSLSocket;
                                                if (sSLSocket2 != null) {
                                                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                                                    b = i12 % 128;
                                                    int i13 = i12 % 2;
                                                    Platform.get().afterHandshake(sSLSocket2);
                                                }
                                                Util.closeQuietly((Socket) sSLSocket2);
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            if (sSLSocket2 != null) {
                                                int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                                                b = i14 % 128;
                                                int i15 = i14 % 2;
                                                Platform.get().afterHandshake(sSLSocket2);
                                            }
                                            Util.closeQuietly((Socket) sSLSocket2);
                                            throw th;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i8++;
                            declaredMethods = methodArr2;
                            length = i9;
                            connectionSpecConfigureSecureSocket = connectionSpec;
                            address2 = address;
                        } catch (Throwable th5) {
                            Throwable cause2 = th5.getCause();
                            if (cause2 == null) {
                                throw th5;
                            }
                            throw cause2;
                        }
                    }
                } catch (AssertionError e3) {
                    e = e3;
                    assertionError = e;
                    sSLSocket = sSLSocket2;
                    if (Util.isAndroidGetsocknameError(assertionError)) {
                        throw assertionError;
                    }
                    throw new IOException(assertionError);
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2823;
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22;
                    byte[] bArr5 = $$d;
                    byte b7 = bArr5[7];
                    Object[] objArr18 = new Object[1];
                    c(b7, b7, (byte) (-bArr5[5]), objArr18);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cKeyCodeFromString, doubleTapTimeout, scrollDefaultDelay, 1814927978, false, (String) objArr18[0], null);
                }
                try {
                    try {
                        Object[] objArr19 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                            int iAlpha2 = Color.alpha(0) + 2823;
                            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 22;
                            byte[] bArr6 = $$d;
                            Object[] objArr20 = new Object[1];
                            c((byte) (-bArr6[5]), (byte) 14, bArr6[7], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iAlpha2, packedPositionType, 1025296417, false, (String) objArr20[0], new Class[]{Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr19);
                        try {
                            Object[] objArr21 = {0, methodArr, null};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char mirror = (char) (AndroidCharacter.getMirror('0') + 37609);
                                int mode = View.MeasureSpec.getMode(0) + 2720;
                                int jumpTapTimeout = 19 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                byte[] bArr7 = $$d;
                                Object[] objArr22 = new Object[1];
                                c((byte) (-bArr7[5]), (byte) 14, bArr7[7], objArr22);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(mirror, mode, jumpTapTimeout, -1568796068, false, (String) objArr22[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                            }
                            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr21)).longValue();
                            long j = -110413842;
                            long j2 = 886;
                            long j3 = -1;
                            long j4 = jLongValue ^ j3;
                            long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                            long j5 = (((j ^ j3) | j4) ^ j3) | ((j4 | startElapsedRealtime) ^ j3);
                            long j6 = startElapsedRealtime ^ j3;
                            long j7 = j6 | j;
                            long j8 = (((long) 1773) * j) + (((long) (-885)) * jLongValue) + ((j5 | ((j7 | jLongValue) ^ j3)) * j2) + (((long) (-1772)) * (((jLongValue | j6) ^ j3) | j)) + (j2 * (j7 ^ j3)) + ((long) (-1699992003));
                            int i16 = (int) (j8 >> 32);
                            try {
                                int iIdentityHashCode = System.identityHashCode(this);
                                int i17 = (i16 & ((-1423390982) + (((~((-36701614) | (~iIdentityHashCode))) | (-1400524798)) * (-591)) + ((iIdentityHashCode | (-36701614)) * 591))) | (((int) j8) & ((-1587633331) + (((~(809086720 | i)) | (-2050752342) | (~(2048654165 | i))) * (-744)) + (((~i) | 806988544) * 744) + ((2050752341 | i) * 744)));
                                int i18 = i17 >>> 24;
                                int i19 = i17 & ViewCompat.MEASURED_SIZE_MASK;
                                int i20 = i18 != 0 ? 1 : 0;
                                if (i20 != 0) {
                                    int i21 = b + 63;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
                                    int i22 = i21 % 2;
                                    if (i19 >= 1 || (method = methodArr[i19]) == null) {
                                        string = null;
                                    } else {
                                        string = method.toString();
                                    }
                                } else {
                                    string = null;
                                }
                                arrayList.add(string);
                                if ((i18 + 6) * i20 != 0) {
                                    throw new RuntimeException(String.valueOf(i));
                                }
                                sSLSocket2.startHandshake();
                                Handshake handshake = Handshake.get(sSLSocket2.getSession());
                                if (!address.getHostnameVerifier().verify(address.getUriHost(), sSLSocket2.getSession())) {
                                    X509Certificate x509Certificate = (X509Certificate) handshake.peerCertificates().get(0);
                                    StringBuilder sb = new StringBuilder("Hostname ");
                                    sb.append(address.getUriHost());
                                    sb.append(" not verified:\n    certificate: ");
                                    sb.append(CertificatePinner.pin(x509Certificate));
                                    sb.append("\n    DN: ");
                                    sb.append(x509Certificate.getSubjectDN().getName());
                                    sb.append("\n    subjectAltNames: ");
                                    sb.append(OkHostnameVerifier.allSubjectAltNames(x509Certificate));
                                    throw new SSLPeerUnverifiedException(sb.toString());
                                }
                                address.getCertificatePinner().check(address.getUriHost(), handshake.peerCertificates());
                                if (connectionSpec.supportsTlsExtensions()) {
                                    int i23 = b + 27;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i23 % 128;
                                    int i24 = i23 % 2;
                                    try {
                                        sSLSocket3 = sSLSocket2;
                                        selectedProtocol = Platform.get().getSelectedProtocol(sSLSocket3);
                                    } catch (AssertionError e4) {
                                        e = e4;
                                        sSLSocket2 = sSLSocket2;
                                        assertionError = e;
                                        sSLSocket = sSLSocket2;
                                        if (Util.isAndroidGetsocknameError(assertionError)) {
                                            throw assertionError;
                                        }
                                        throw new IOException(assertionError);
                                    } catch (Throwable th6) {
                                        th = th6;
                                        sSLSocket2 = sSLSocket2;
                                        th = th;
                                        if (sSLSocket2 != null) {
                                            int i110 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                                            b = i110 % 128;
                                            int i111 = i110 % 2;
                                            Platform.get().afterHandshake(sSLSocket2);
                                        }
                                        Util.closeQuietly((Socket) sSLSocket2);
                                        throw th;
                                    }
                                } else {
                                    sSLSocket3 = sSLSocket2;
                                    selectedProtocol = null;
                                }
                                this.socket = sSLSocket3;
                                this.source = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sSLSocket3));
                                this.sink = SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.socket));
                                this.handshake = handshake;
                                this.protocol = selectedProtocol != null ? Protocol.get(selectedProtocol) : Protocol.HTTP_1_1;
                                if (sSLSocket3 != null) {
                                    Platform.get().afterHandshake(sSLSocket3);
                                }
                            } catch (AssertionError e5) {
                                e = e5;
                                sSLSocket2 = sSLSocket2;
                                assertionError = e;
                                sSLSocket = sSLSocket2;
                                if (Util.isAndroidGetsocknameError(assertionError)) {
                                    throw assertionError;
                                }
                                throw new IOException(assertionError);
                            } catch (Throwable th7) {
                                th = th7;
                                sSLSocket2 = sSLSocket2;
                                th = th;
                                if (sSLSocket2 != null) {
                                    int i112 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                                    b = i112 % 128;
                                    int i113 = i112 % 2;
                                    Platform.get().afterHandshake(sSLSocket2);
                                }
                                Util.closeQuietly((Socket) sSLSocket2);
                                throw th;
                            }
                        } catch (Throwable th8) {
                            Throwable cause3 = th8.getCause();
                            if (cause3 == null) {
                                throw th8;
                            }
                            throw cause3;
                        }
                    } catch (Throwable th9) {
                        Throwable cause4 = th9.getCause();
                        if (cause4 == null) {
                            throw th9;
                        }
                        throw cause4;
                    }
                } catch (AssertionError e6) {
                    e = e6;
                } catch (Throwable th10) {
                    th = th10;
                }
            } catch (AssertionError e7) {
                e = e7;
            } catch (Throwable th11) {
                th = th11;
            }
        } catch (AssertionError e8) {
            assertionError = e8;
            sSLSocket = null;
        } catch (Throwable th12) {
            th = th12;
            sSLSocket = null;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                int i114 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                b = i114 % 128;
                int i115 = i114 % 2;
                Platform.get().afterHandshake(sSLSocket2);
            }
            Util.closeQuietly((Socket) sSLSocket2);
            throw th;
        }
    }

    private void createTunnel(int i, int i2) throws IOException {
        int i3 = 2 % 2;
        Request requestCreateTunnelRequest = createTunnelRequest();
        HttpUrl httpUrl = requestCreateTunnelRequest.httpUrl();
        StringBuilder sb = new StringBuilder("CONNECT ");
        sb.append(httpUrl.host());
        sb.append(":");
        sb.append(httpUrl.port());
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        do {
            Http1xStream http1xStream = new Http1xStream(null, this.source, this.sink);
            this.source.timeout().timeout(i, TimeUnit.MILLISECONDS);
            this.sink.timeout().timeout(i2, TimeUnit.MILLISECONDS);
            http1xStream.writeRequest(requestCreateTunnelRequest.headers(), string);
            http1xStream.finishRequest();
            Response responseBuild = http1xStream.readResponse().request(requestCreateTunnelRequest).build();
            long jContentLength = OkHeaders.contentLength(responseBuild);
            if (jContentLength == -1) {
                jContentLength = 0;
            }
            tryToComplete trytocompleteNewFixedLengthSource = http1xStream.newFixedLengthSource(jContentLength);
            Util.skipAll(trytocompleteNewFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            trytocompleteNewFixedLengthSource.close();
            int iCode = responseBuild.code();
            if (iCode == 200) {
                if (this.source.TuitionPaymentFragmentspecialinlinedviewModeldefault2().size == 0) {
                    int i4 = b + 13;
                    int i5 = i4 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5;
                    int i6 = i4 % 2;
                    int i7 = i5 + 11;
                    b = i7 % 128;
                    int i8 = i7 % 2;
                    if (this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2().size == 0) {
                        return;
                    }
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iCode == 407) {
                requestCreateTunnelRequest = OkHeaders.processAuthHeader(this.route.getAddress().getAuthenticator(), responseBuild, this.route.getProxy());
            } else {
                StringBuilder sb2 = new StringBuilder("Unexpected response code for CONNECT: ");
                sb2.append(responseBuild.code());
                throw new IOException(sb2.toString());
            }
        } while (requestCreateTunnelRequest != null);
        throw new IOException("Failed to authenticate with proxy");
    }

    private Request createTunnelRequest() throws IOException {
        int i = 2 % 2;
        Request requestBuild = new Request.Builder().url(this.route.getAddress().url()).header("Host", Util.hostHeader(this.route.getAddress().url())).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Version.userAgent()).build();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        b = i2 % 128;
        int i3 = i2 % 2;
        return requestBuild;
    }

    final boolean isConnected() {
        int i = 2 % 2;
        int i2 = b + 25;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.protocol != null) {
            return true;
        }
        int i4 = i3 + 87;
        b = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override // com.squareup.okhttp.Connection
    public final Route getRoute() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        Route route = this.route;
        int i5 = i2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return route;
    }

    public final void cancel() {
        int i = 2 % 2;
        int i2 = b + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Util.closeQuietly(this.rawSocket);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.squareup.okhttp.Connection
    public final Socket getSocket() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        Socket socket = this.socket;
        int i5 = i2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return socket;
        }
        throw null;
    }

    public final int allocationLimit() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FramedConnection framedConnection = this.framedConnection;
        if (framedConnection == null) {
            return 1;
        }
        int iMaxConcurrentStreams = framedConnection.maxConcurrentStreams();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
        b = i3 % 128;
        int i4 = i3 % 2;
        return iMaxConcurrentStreams;
    }

    public final boolean isHealthy(boolean z) {
        int i = 2 % 2;
        if (!this.socket.isClosed() && !this.socket.isInputShutdown()) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
            b = i2 % 128;
            int i3 = i2 % 2;
            if (!this.socket.isOutputShutdown()) {
                if (this.framedConnection != null) {
                    int i4 = b + 33;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                    return i4 % 2 == 0;
                }
                if (z) {
                    try {
                        int soTimeout = this.socket.getSoTimeout();
                        try {
                            this.socket.setSoTimeout(1);
                            if (!(!this.source.d())) {
                                this.socket.setSoTimeout(soTimeout);
                                return false;
                            }
                            this.socket.setSoTimeout(soTimeout);
                            return true;
                        } catch (Throwable th) {
                            this.socket.setSoTimeout(soTimeout);
                            throw th;
                        }
                    } catch (SocketTimeoutException unused) {
                    } catch (IOException unused2) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.squareup.okhttp.Connection
    public final Handshake getHandshake() {
        int i = 2 % 2;
        int i2 = b + 35;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Handshake handshake = this.handshake;
        int i4 = i3 + 23;
        b = i4 % 128;
        int i5 = i4 % 2;
        return handshake;
    }

    public final boolean isMultiplexed() {
        int i = 2 % 2;
        if (this.framedConnection != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
            b = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        b = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override // com.squareup.okhttp.Connection
    public final Protocol getProtocol() {
        int i = 2 % 2;
        int i2 = b + 47;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        Protocol protocol = this.protocol;
        if (protocol != null) {
            int i4 = i3 + 53;
            b = i4 % 128;
            int i5 = i4 % 2;
            return protocol;
        }
        Protocol protocol2 = Protocol.HTTP_1_1;
        int i6 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        if (i6 % 2 == 0) {
            return protocol2;
        }
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        String strCipherSuite;
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.route.getAddress().url().host());
        sb.append(":");
        sb.append(this.route.getAddress().url().port());
        sb.append(", proxy=");
        sb.append(this.route.getProxy());
        sb.append(" hostAddress=");
        sb.append(this.route.getSocketAddress());
        sb.append(" cipherSuite=");
        Handshake handshake = this.handshake;
        if (handshake != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
            b = i2 % 128;
            int i3 = i2 % 2;
            strCipherSuite = handshake.cipherSuite();
            if (i3 == 0) {
                int i4 = 94 / 0;
            }
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
            b = i5 % 128;
            int i6 = i5 % 2;
        } else {
            strCipherSuite = "none";
        }
        sb.append(strCipherSuite);
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, byte r8) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r0 = com.squareup.okhttp.internal.io.RealConnection.$$c
            int r7 = r7 * 3
            int r1 = 1 - r7
            int r6 = r6 + 102
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2d
        L16:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L2d:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.io.RealConnection.$$g(byte, byte, byte):java.lang.String");
    }
}
