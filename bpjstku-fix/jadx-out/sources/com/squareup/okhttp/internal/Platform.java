package com.squareup.okhttp.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.appsflyer.internal.AFg1xSDK;
import com.google.android.gms.common.ConnectionResult;
import com.squareup.okhttp.Protocol;
import defpackage.RotationProviderListenerWrapper;
import defpackage.abortCapture;
import defpackage.initSession;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public class Platform {
    private static final Platform PLATFORM;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long b;
    private static final byte[] $$c = {23, -73, 107, 5};
    private static final int $$d = 46;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {111, 40, 23, -13, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 43;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.squareup.okhttp.internal.Platform.$$a
            int r7 = r7 * 15
            int r1 = r7 + 38
            int r6 = r6 + 4
            int r8 = r8 * 3
            int r8 = r8 + 84
            byte[] r1 = new byte[r1]
            int r7 = r7 + 37
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2f:
            int r4 = -r4
            int r6 = r6 + 1
            int r8 = r8 + r4
            int r8 = r8 + (-11)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.Platform.a(int, int, short, java.lang.Object[]):void");
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        b();
        PLATFORM = findPlatform();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        int i2 = i % 2;
    }

    public static Platform get() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 91;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        Platform platform = PLATFORM;
        int i5 = i3 + 93;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            return platform;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(b ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $11 + 97;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $11 + 33;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64837 - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.getOffsetBefore("", 0) + 1356, 38 - Color.blue(0), 894276454, false, $$e(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - TextUtils.indexOf("", "", 0)), 468 - View.MeasureSpec.makeMeasureSpec(0, 0), 13 - View.getDefaultSize(0, 0), 896083767, false, "n", new Class[]{Object.class, Object.class});
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
    }

    static class Android extends Platform {
        private static final int MAX_LOG_LENGTH = 4000;
        private final OptionalMethod<Socket> getAlpnSelectedProtocol;
        private final OptionalMethod<Socket> setAlpnProtocols;
        private final OptionalMethod<Socket> setHostname;
        private final OptionalMethod<Socket> setUseSessionTickets;
        private final Method trafficStatsTagSocket;
        private final Method trafficStatsUntagSocket;

        @Override // com.squareup.okhttp.internal.Platform
        public void log(String str) {
        }

        public Android(OptionalMethod<Socket> optionalMethod, OptionalMethod<Socket> optionalMethod2, Method method, Method method2, OptionalMethod<Socket> optionalMethod3, OptionalMethod<Socket> optionalMethod4) {
            this.setUseSessionTickets = optionalMethod;
            this.setHostname = optionalMethod2;
            this.trafficStatsTagSocket = method;
            this.trafficStatsUntagSocket = method2;
            this.getAlpnSelectedProtocol = optionalMethod3;
            this.setAlpnProtocols = optionalMethod4;
        }

        @Override // com.squareup.okhttp.internal.Platform
        public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
            try {
                socket.connect(inetSocketAddress, i);
            } catch (AssertionError e2) {
                if (!Util.isAndroidGetsocknameError(e2)) {
                    throw e2;
                }
                throw new IOException(e2);
            } catch (SecurityException e3) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e3);
                throw iOException;
            }
        }

        @Override // com.squareup.okhttp.internal.Platform
        public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
            if (str != null) {
                this.setUseSessionTickets.invokeOptionalWithoutCheckedException(sSLSocket, Boolean.TRUE);
                this.setHostname.invokeOptionalWithoutCheckedException(sSLSocket, str);
            }
            OptionalMethod<Socket> optionalMethod = this.setAlpnProtocols;
            if (optionalMethod == null || !optionalMethod.isSupported(sSLSocket)) {
                return;
            }
            this.setAlpnProtocols.invokeWithoutCheckedException(sSLSocket, concatLengthPrefixed(list));
        }

        @Override // com.squareup.okhttp.internal.Platform
        public String getSelectedProtocol(SSLSocket sSLSocket) {
            byte[] bArr;
            OptionalMethod<Socket> optionalMethod = this.getAlpnSelectedProtocol;
            if (optionalMethod == null || !optionalMethod.isSupported(sSLSocket) || (bArr = (byte[]) this.getAlpnSelectedProtocol.invokeWithoutCheckedException(sSLSocket, new Object[0])) == null) {
                return null;
            }
            return new String(bArr, Util.UTF_8);
        }

        @Override // com.squareup.okhttp.internal.Platform
        public void tagSocket(Socket socket) throws SocketException {
            Method method = this.trafficStatsTagSocket;
            if (method == null) {
                return;
            }
            try {
                method.invoke(null, socket);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }

        @Override // com.squareup.okhttp.internal.Platform
        public void untagSocket(Socket socket) throws SocketException {
            Method method = this.trafficStatsUntagSocket;
            if (method == null) {
                return;
            }
            try {
                method.invoke(null, socket);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    static class JdkWithJettyBootPlatform extends Platform {
        private final Class<?> clientProviderClass;
        private final Method getMethod;
        private final Method putMethod;
        private final Method removeMethod;
        private final Class<?> serverProviderClass;

        public JdkWithJettyBootPlatform(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
            this.putMethod = method;
            this.getMethod = method2;
            this.removeMethod = method3;
            this.clientProviderClass = cls;
            this.serverProviderClass = cls2;
        }

        @Override // com.squareup.okhttp.internal.Platform
        public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Protocol protocol = list.get(i);
                if (protocol != Protocol.HTTP_1_0) {
                    arrayList.add(protocol.toString());
                }
            }
            try {
                this.putMethod.invoke(null, sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.clientProviderClass, this.serverProviderClass}, new JettyNegoProvider(arrayList)));
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.squareup.okhttp.internal.Platform
        public void afterHandshake(SSLSocket sSLSocket) {
            try {
                this.removeMethod.invoke(null, sSLSocket);
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }

        @Override // com.squareup.okhttp.internal.Platform
        public String getSelectedProtocol(SSLSocket sSLSocket) {
            try {
                JettyNegoProvider jettyNegoProvider = (JettyNegoProvider) Proxy.getInvocationHandler(this.getMethod.invoke(null, sSLSocket));
                if (!jettyNegoProvider.unsupported && jettyNegoProvider.selected == null) {
                    Internal.logger.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
                if (jettyNegoProvider.unsupported) {
                    return null;
                }
                return jettyNegoProvider.selected;
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }
    }

    public String getPrefix() {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        char c;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf("", "") + 29944);
            int i4 = 1756 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int iMyPid = (Process.myPid() >> 22) + 23;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i4, iMyPid, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{1751, 1718, 23450, 63853, 27643, 50870, 50061, 48207, 29616, 18873, 22149, 10011, 60584, 56507, 56791, 43646, 22966, 42931, 24709, 23872, 53914, 10939, 63397, 49266, 20380, 48539}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{34215, 34242, 4656, 489, 63583, 36638, 15116, 12265, 61660, 31, 44545, 46275, 28626, 38147, 9489, 14845, 56022, 60935, 38928}, ViewConfiguration.getJumpTapTimeout() >> 16, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf2 = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0'));
            int iBlue = 1755 - Color.blue(0);
            int iArgb = Color.argb(0, 0, 0, 0) + 23;
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a((byte) 37, bArr[5], bArr[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf2, iBlue, iArgb, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf3 = (char) (29944 - TextUtils.indexOf("", "", 0));
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1755;
                int iResolveOpacity = 23 - Drawable.resolveOpacity(0, 0);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                a((byte) 89, bArr2[5], bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf3, packedPositionType, iResolveOpacity, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~iIdentityHashCode;
            int i6 = (-1460287695) + (((~((-399013554) | i5)) | (~(iIdentityHashCode | (-186411128)))) * 333) + (((~(iIdentityHashCode | (-399013554))) | (~(i5 | (-186411128)))) * 333) + 1352742737;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{46323, 46233, 8490, 56142, 47979, 48137, 57788, 27852, 49621, 13068, 29859, 63435, 24196, 42582, 65417, 31428, 60312, 56580, 17079, 36312}, ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{15008, 15049, 37531, 43559, 1947, 4029, 37062, 53299, 20444, 32952, 1503, 19244, 53496, 5544, 36544, 50725, 26107, 28334, 13279, 12576}, AndroidCharacter.getMirror('0') - '0', objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1412075719};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 42049), 1726 - Color.argb(0, 0, 0, 0), Color.blue(0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), 1352742737, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char mirror = (char) (29992 - AndroidCharacter.getMirror('0'));
                    int iResolveOpacity2 = 1755 - Drawable.resolveOpacity(0, 0);
                    int pressedStateDuration = 23 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte[] bArr3 = $$a;
                    Object[] objArr11 = new Object[1];
                    a((byte) 89, bArr3[5], bArr3[7], objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mirror, iResolveOpacity2, pressedStateDuration, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr12 = new Object[1];
                    c(new char[]{1751, 1718, 23450, 63853, 27643, 50870, 50061, 48207, 29616, 18873, 22149, 10011, 60584, 56507, 56791, 43646, 22966, 42931, 24709, 23872, 53914, 10939, 63397, 49266, 20380, 48539}, ((byte) KeyEvent.getModifierMetaStateMask()) + 1, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(new char[]{34215, 34242, 4656, 489, 63583, 36638, 15116, 12265, 61660, 31, 44545, 46275, 28626, 38147, 9489, 14845, 56022, 60935, 38928}, (-1) - ImageFormat.getBitsPerPixel(0), objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 29945);
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1755;
                        int pressedStateDuration2 = 23 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        byte[] bArr4 = $$a;
                        Object[] objArr14 = new Object[1];
                        a((byte) 37, bArr4[5], bArr4[7], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, maxKeyCode, pressedStateDuration2, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29943);
                        int iMyPid2 = 1755 - (Process.myPid() >> 22);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 24;
                        byte b4 = $$a[7];
                        byte b5 = b4;
                        Object[] objArr15 = new Object[1];
                        a(b4, b5, b5, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, iMyPid2, iLastIndexOf, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    int i9 = TuitionPaymentFragmentbindingInflater1 + 43;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                    int i10 = i9 % 2;
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
        int i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i12 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i12 == i11) {
            int i13 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            objArr = new Object[]{new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i14 = ~iUptimeMillis;
            int i15 = i13 + (-102059159) + ((iUptimeMillis | 571080757) * 988) + (((~(924460727 | i14)) | (-1065238272)) * (-1976)) + (((~(iUptimeMillis | 711858301)) | 571080757 | (~((-711858302) | i14))) * 988);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr[3])[0] = i17 ^ (i17 << 5);
            c = 3;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr != null) {
                for (String str : strArr) {
                    int i18 = TuitionPaymentFragmentbindingInflater1 + 117;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18 % 128;
                    int i19 = i18 % 2;
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i12 / (((i12 - 1) * i12) % 2), 0).show();
            int i20 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            objArr = new Object[]{new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int i21 = ~System.identityHashCode(this);
            int i22 = i20 + 1713591757 + ((~((-134746695) | i21)) * 52) + (((~(917823872 | i21)) | (~(705221446 | i21)) | (-1052570567)) * (-52)) + (((~(i21 | (-917823873))) | 570474752) * 52);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            c = 3;
            ((int[]) objArr[3])[0] = i24 ^ (i24 << 5);
        }
        int i25 = ((int[]) objArr[c])[0];
        int i26 = i25 * i25;
        int i27 = -(158262955 * i25);
        int i28 = (i26 & i27) + (i26 | i27);
        int i29 = -(i25 * 1999758485);
        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
        int i31 = (i30 ^ (-1403542528)) + (((-1403542528) & i30) << 1);
        int i32 = ((i31 >> 20) - 8191) / 4096;
        int i33 = (i31 - (~((i32 & 1) + (i32 | 1)))) - 1;
        int i34 = i31 >> 23;
        int i35 = ((i34 ^ (-1023)) + ((i34 & (-1023)) << 1)) / 512;
        int i36 = -(i33 ^ ((i35 & 1) + (i35 | 1)));
        int i37 = (i36 ^ 7) + ((i36 & 7) << 1);
        int i38 = i37 >> 17;
        int i39 = (((-65535) ^ i38) + ((i38 & (-65535)) << 1)) / 32768;
        int i40 = (i39 & 1) + (i39 | 1);
        return "30/31/11/8/OkHttp".substring(115500 / (((-((i40 ^ 1) + ((i40 & 1) << 1))) & i37) * ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED));
    }

    public void logW(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            System.out.println(str);
            throw null;
        }
        System.out.println(str);
        int i3 = TuitionPaymentFragmentbindingInflater1 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
    }

    static class JettyNegoProvider implements InvocationHandler {
        private final List<String> protocols;
        private String selected;
        private boolean unsupported;

        public JettyNegoProvider(List<String> list) {
            this.protocols = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = Util.EMPTY_STRING_ARRAY;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.unsupported = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.protocols;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.protocols.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.selected = str;
                            return str;
                        }
                    }
                    String str2 = this.protocols.get(0);
                    this.selected = str2;
                    return str2;
                }
            }
            if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
                this.selected = (String) objArr[0];
                return null;
            }
            return method.invoke(this, objArr);
        }
    }

    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        socket.connect(inetSocketAddress, i);
        int i5 = TuitionPaymentFragmentbindingInflater1 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void log(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        System.out.println(str);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Platform findPlatform() {
        Method method;
        Method method2;
        Method method3;
        OptionalMethod optionalMethod;
        OptionalMethod optionalMethod2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        Object obj = null;
        try {
            try {
                try {
                    if (i2 % 2 == 0) {
                        Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
                        obj.hashCode();
                        throw null;
                    }
                    Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
                    int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
                    TuitionPaymentFragmentbindingInflater1 = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 5 / 3;
                    }
                    OptionalMethod optionalMethod3 = new OptionalMethod(null, "setUseSessionTickets", Boolean.TYPE);
                    OptionalMethod optionalMethod4 = new OptionalMethod(null, "setHostname", String.class);
                    try {
                        Class<?> cls = Class.forName("android.net.TrafficStats");
                        Method method4 = cls.getMethod("tagSocket", Socket.class);
                        try {
                            Method method5 = cls.getMethod("untagSocket", Socket.class);
                            try {
                                Class.forName("android.net.Network");
                                OptionalMethod optionalMethod5 = new OptionalMethod(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                                try {
                                    method2 = method5;
                                    optionalMethod2 = optionalMethod5;
                                    optionalMethod = new OptionalMethod(null, "setAlpnProtocols", byte[].class);
                                    method = method4;
                                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                                    method2 = method5;
                                    method = method4;
                                    optionalMethod = 0;
                                    optionalMethod2 = optionalMethod5;
                                }
                            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                                method2 = method5;
                                method = method4;
                                method3 = null;
                                optionalMethod = method3;
                                optionalMethod2 = method3;
                            }
                        } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                            method = method4;
                            method2 = null;
                            method3 = method2;
                            optionalMethod = method3;
                            optionalMethod2 = method3;
                            return new Android(optionalMethod3, optionalMethod4, method, method2, optionalMethod2, optionalMethod);
                        }
                    } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                        method = null;
                        method2 = null;
                    }
                    return new Android(optionalMethod3, optionalMethod4, method, method2, optionalMethod2, optionalMethod);
                } catch (ClassNotFoundException unused5) {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    return new JdkWithJettyBootPlatform(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused6) {
                return new Platform();
            }
        } catch (ClassNotFoundException unused7) {
            Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
        }
    }

    static byte[] concatLengthPrefixed(List<Protocol> list) {
        int i = 2 % 2;
        RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            Protocol protocol = list.get(i2);
            if (protocol != Protocol.HTTP_1_0) {
                rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(protocol.toString().length());
                String string = protocol.toString();
                Intrinsics.checkNotNullParameter(string, "");
                rotationProviderListenerWrapper.b(string, 0, string.length());
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
                TuitionPaymentFragmentbindingInflater1 = i3 % 128;
                int i4 = i3 % 2;
            }
            i2++;
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
        }
        return rotationProviderListenerWrapper.b(rotationProviderListenerWrapper.size);
    }

    public void afterHandshake(SSLSocket sSLSocket) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 3 / 0;
        }
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 11;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 119;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public void tagSocket(Socket socket) throws SocketException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void untagSocket(Socket socket) throws SocketException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 1 / 0;
        }
    }

    static void b() {
        b = -2968215259696761052L;
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
    private static java.lang.String $$e(byte r5, short r6, short r7) {
        /*
            int r6 = r6 * 2
            int r0 = 1 - r6
            int r7 = r7 * 3
            int r7 = r7 + 107
            byte[] r1 = com.squareup.okhttp.internal.Platform.$$c
            int r5 = r5 * 3
            int r5 = 4 - r5
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L19
            r7 = r5
            r3 = r6
            r4 = r2
            goto L29
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L27:
            r3 = r1[r5]
        L29:
            int r5 = r5 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.Platform.$$e(byte, short, short):java.lang.String");
    }
}
