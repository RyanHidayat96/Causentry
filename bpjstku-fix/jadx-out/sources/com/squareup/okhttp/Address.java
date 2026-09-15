package com.squareup.okhttp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.squareup.okhttp.internal.Util;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes6.dex */
public final class Address {
    final Authenticator authenticator;
    final CertificatePinner certificatePinner;
    final List<ConnectionSpec> connectionSpecs;
    final Dns dns;
    final HostnameVerifier hostnameVerifier;
    final List<Protocol> protocols;
    final Proxy proxy;
    final ProxySelector proxySelector;
    final SocketFactory socketFactory;
    final SSLSocketFactory sslSocketFactory;
    final HttpUrl url;
    private static final byte[] $$c = {119, -102, -34, -3};
    private static final int $$f = 79;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {58, -103, 118, 14, -10, 4, 65, -52, 5, -17, 21, -1, -9, 10, 59, -49, -11, 12, -12, 5, 8, 7, 56, -66, -1, 10, 65, -57, -3, -4, 17, -11, 6, 15, -9, 64, -52, -9, 4, 14, -6, -3, 66, -67, 18, -10, 1, 13, 57, -34, -33, 10, 46, -32, -15, 13, -4, 3, 29, -14, -10, 1, 13, 67, -77, 16, -7, 12, 37, -32, -15, 13, -4, 3, 76, -12, 16, -12, -31, 14, -9, 13, -4, 3, 32, -15, -22, 14, 10, -7, -4, 48, -42, 19, -4, -4, 10, -7, -4, 20, -5, -3, 12, -3, -3, 9, 32, -35, 10, -4, 13, -17, 17, -11, 67};
    private static final int $$e = 69;
    private static final byte[] $$a = {36, -74, -79, -21, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 229;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static char[] b = {59702, 59763, 59774, 59749, 59744, 59729, 59730, 59748, 59744, 59746, 59747, 59746, 59744, 59750, 59769, 59749, 59747, 59712, 59739, 59768, 59737, 59721, 59705, 59759, 59751, 59770, 59747, 59757, 59747, 59758, 59746, 59744, 59749, 59771, 59757, 59752, 59728, 59731, 59808, 59834, 59834, 59782, 59800, 59815, 59814, 59835, 59803, 59789, 59815, 59831, 59826, 59833, 59812, 59698, 59750, 59742, 59730, 59746, 59759, 59756, 59757, 59759, 59746, 59770, 59749, 59749, 59773, 59755, 59743};

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.squareup.okhttp.Address.$$a
            int r6 = r6 * 52
            int r6 = 108 - r6
            int r8 = r8 * 4
            int r8 = 84 - r8
            int r7 = r7 * 15
            int r1 = r7 + 38
            byte[] r1 = new byte[r1]
            int r7 = r7 + 37
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r8 = r8 + 1
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.Address.a(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 37
            int r0 = 75 - r8
            byte[] r1 = com.squareup.okhttp.Address.$$d
            int r7 = r7 + 4
            int r6 = r6 * 15
            int r6 = r6 + 84
            byte[] r0 = new byte[r0]
            int r8 = 74 - r8
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L32
        L16:
            r3 = r2
        L17:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L32:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + 2
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.Address.d(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r14 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r14 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        r3.connectionSpecs = com.squareup.okhttp.internal.Util.immutableList(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (r15 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        r3.proxySelector = r15;
        r3.proxy = r12;
        r3.sslSocketFactory = r8;
        r3.hostnameVerifier = r9;
        r3.certificatePinner = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        throw new java.lang.IllegalArgumentException("proxySelector == null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        throw new java.lang.IllegalArgumentException("connectionSpecs == null");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Address(java.lang.String r4, int r5, com.squareup.okhttp.Dns r6, javax.net.SocketFactory r7, javax.net.ssl.SSLSocketFactory r8, javax.net.ssl.HostnameVerifier r9, com.squareup.okhttp.CertificatePinner r10, com.squareup.okhttp.Authenticator r11, java.net.Proxy r12, java.util.List<com.squareup.okhttp.Protocol> r13, java.util.List<com.squareup.okhttp.ConnectionSpec> r14, java.net.ProxySelector r15) {
        /*
            r3 = this;
            r3.<init>()
            com.squareup.okhttp.HttpUrl$Builder r0 = new com.squareup.okhttp.HttpUrl$Builder
            r0.<init>()
            r1 = 2
            if (r8 == 0) goto L10
            int r2 = r1 % r1
            java.lang.String r2 = "https"
            goto L12
        L10:
            java.lang.String r2 = "http"
        L12:
            com.squareup.okhttp.HttpUrl$Builder r0 = r0.scheme(r2)
            com.squareup.okhttp.HttpUrl$Builder r4 = r0.host(r4)
            com.squareup.okhttp.HttpUrl$Builder r4 = r4.port(r5)
            com.squareup.okhttp.HttpUrl r4 = r4.build()
            r3.url = r4
            if (r6 == 0) goto L9b
            int r4 = com.squareup.okhttp.Address.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r4 = r4 + 5
            int r5 = r4 % 128
            com.squareup.okhttp.Address.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r5
            int r4 = r4 % r1
            r3.dns = r6
            if (r7 == 0) goto L93
            r3.socketFactory = r7
            if (r11 == 0) goto L8b
            int r4 = r5 + 101
            int r6 = r4 % 128
            com.squareup.okhttp.Address.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r6
            int r4 = r4 % r1
            r3.authenticator = r11
            if (r13 == 0) goto L83
            int r5 = r5 + 93
            int r4 = r5 % 128
            com.squareup.okhttp.Address.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r4
            int r5 = r5 % r1
            if (r5 == 0) goto L58
            java.util.List r4 = com.squareup.okhttp.internal.Util.immutableList(r13)
            r3.protocols = r4
            r4 = 78
            int r4 = r4 / 0
            if (r14 == 0) goto L7b
            goto L60
        L58:
            java.util.List r4 = com.squareup.okhttp.internal.Util.immutableList(r13)
            r3.protocols = r4
            if (r14 == 0) goto L7b
        L60:
            java.util.List r4 = com.squareup.okhttp.internal.Util.immutableList(r14)
            r3.connectionSpecs = r4
            if (r15 == 0) goto L73
            r3.proxySelector = r15
            r3.proxy = r12
            r3.sslSocketFactory = r8
            r3.hostnameVerifier = r9
            r3.certificatePinner = r10
            return
        L73:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "proxySelector == null"
            r4.<init>(r5)
            throw r4
        L7b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "connectionSpecs == null"
            r4.<init>(r5)
            throw r4
        L83:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "protocols == null"
            r4.<init>(r5)
            throw r4
        L8b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "authenticator == null"
            r4.<init>(r5)
            throw r4
        L93:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "socketFactory == null"
            r4.<init>(r5)
            throw r4
        L9b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "dns == null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.Address.<init>(java.lang.String, int, com.squareup.okhttp.Dns, javax.net.SocketFactory, javax.net.ssl.SSLSocketFactory, javax.net.ssl.HostnameVerifier, com.squareup.okhttp.CertificatePinner, com.squareup.okhttp.Authenticator, java.net.Proxy, java.util.List, java.util.List, java.net.ProxySelector):void");
    }

    public final HttpUrl url() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        HttpUrl httpUrl = this.url;
        int i5 = i3 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return httpUrl;
        }
        throw null;
    }

    @Deprecated
    public final String getUriHost() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        String strHost = this.url.host();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return strHost;
    }

    @Deprecated
    public final int getUriPort() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int iPort = this.url.port();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return iPort;
        }
        throw null;
    }

    public final Dns getDns() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.dns;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c6 A[PHI: r9
  0x00c6: PHI (r9v5 char) = (r9v4 char), (r9v32 char) binds: [B:29:0x00c4, B:26:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e5 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:7:0x0021, B:9:0x0032, B:10:0x006d, B:37:0x0137, B:39:0x0150, B:40:0x0189, B:43:0x019c, B:45:0x01a9, B:46:0x01e2, B:31:0x00cd, B:33:0x00e5, B:34:0x0120), top: B:76:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0130  */
    /* JADX WARN: Code duplicated, block: B:39:0x0150 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:7:0x0021, B:9:0x0032, B:10:0x006d, B:37:0x0137, B:39:0x0150, B:40:0x0189, B:43:0x019c, B:45:0x01a9, B:46:0x01e2, B:31:0x00cd, B:33:0x00e5, B:34:0x0120), top: B:76:0x0021 }] */
    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char[] cArr2;
        char c;
        char c2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr3 = b;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[i4];
                    objArr2[i2] = Integer.valueOf(cArr3[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c3 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2) + 1270;
                        int iRed = 18 - Color.red(i2);
                        byte b2 = (byte) ($$f & 21);
                        byte b3 = (byte) (b2 - 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, iMakeMeasureSpec, iRed, 407021364, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 0;
                    i4 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        char[] cArr5 = new char[i5];
        System.arraycopy(cArr3, i3, cArr5, 0, i5);
        if (bArr != null) {
            int i9 = $10 + 75;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr2 = new char[i5];
                setvideostabilizationmode.b = 1;
                c = 1;
            } else {
                cArr2 = new char[i5];
                setvideostabilizationmode.b = 0;
                c = 0;
            }
            while (setvideostabilizationmode.b < i5) {
                int i10 = $10 + 115;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    c2 = 1;
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i11 = setvideostabilizationmode.b;
                        char c4 = cArr5[setvideostabilizationmode.b];
                        Object[] objArr3 = new Object[2];
                        objArr3[c2] = Integer.valueOf(c);
                        objArr3[0] = Integer.valueOf(c4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b4 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), 3225 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 13, 2133916302, false, $$g((byte) ($$f & 22), b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr3)).charValue();
                    } else {
                        int i12 = setvideostabilizationmode.b;
                        Object[] objArr4 = {Integer.valueOf(cArr5[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char bitsPerPixel = (char) (29943 - ImageFormat.getBitsPerPixel(0));
                            int iResolveSizeAndState = 1755 - View.resolveSizeAndState(0, 0, 0);
                            int doubleTapTimeout = 23 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            byte length2 = (byte) $$c.length;
                            byte b5 = (byte) (length2 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(bitsPerPixel, iResolveSizeAndState, doubleTapTimeout, 387247676, false, $$g(length2, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr4)).charValue();
                    }
                } else {
                    c2 = 1;
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i13 = setvideostabilizationmode.b;
                        char c5 = cArr5[setvideostabilizationmode.b];
                        Object[] objArr5 = new Object[2];
                        objArr5[c2] = Integer.valueOf(c);
                        objArr5[0] = Integer.valueOf(c5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b6 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), 3225 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 13, 2133916302, false, $$g((byte) ($$f & 22), b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr5)).charValue();
                    } else {
                        int i14 = setvideostabilizationmode.b;
                        Object[] objArr6 = {Integer.valueOf(cArr5[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char bitsPerPixel2 = (char) (29943 - ImageFormat.getBitsPerPixel(0));
                            int iResolveSizeAndState2 = 1755 - View.resolveSizeAndState(0, 0, 0);
                            int doubleTapTimeout2 = 23 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            byte length3 = (byte) $$c.length;
                            byte b7 = (byte) (length3 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(bitsPerPixel2, iResolveSizeAndState2, doubleTapTimeout2, 387247676, false, $$g(length3, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).charValue();
                    }
                }
                c = cArr2[setvideostabilizationmode.b];
                Object[] objArr7 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 41240), KeyEvent.keyCodeFromString("") + 1705, Process.getGidForName("") + 22, -1434471773, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr7);
            }
            cArr5 = cArr2;
        }
        if (i7 > 0) {
            char[] cArr6 = new char[i5];
            System.arraycopy(cArr5, 0, cArr6, 0, i5);
            int i15 = i5 - i7;
            System.arraycopy(cArr6, 0, cArr5, i15, i7);
            System.arraycopy(cArr6, i7, cArr5, 0, i15);
        }
        if (z) {
            int i16 = $10 + 21;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                cArr = new char[i5];
                setvideostabilizationmode.b = 0;
            } else {
                cArr = new char[i5];
                setvideostabilizationmode.b = 0;
            }
            while (setvideostabilizationmode.b < i5) {
                cArr[setvideostabilizationmode.b] = cArr5[(i5 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
            }
            cArr5 = cArr;
        }
        if (i6 > 0) {
            int i17 = $11 + 117;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            int i19 = 0;
            loop3: while (true) {
                setvideostabilizationmode.b = i19;
                while (true) {
                    if (setvideostabilizationmode.b >= i5) {
                        break loop3;
                    }
                    int i20 = $11 + 29;
                    $10 = i20 % 128;
                    if (i20 % 2 != 0) {
                        cArr5[setvideostabilizationmode.b] = (char) (cArr5[setvideostabilizationmode.b] + iArr[4]);
                        setvideostabilizationmode.b++;
                    }
                }
                cArr5[setvideostabilizationmode.b] = (char) (cArr5[setvideostabilizationmode.b] - iArr[2]);
                i19 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr5);
    }

    public final SocketFactory getSocketFactory() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 43042);
            int i2 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3110;
            int iMyPid = (Process.myPid() >> 22) + 22;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[40], bArr[5], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, i2, iMyPid, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{0, 22, 2, 10}, false, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{22, 15, 0, 7}, true, new byte[]{0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 43042);
            int iRed = Color.red(0) + 3111;
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 22;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[5];
            Object[] objArr5 = new Object[1];
            a(b2, b2, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iRed, packedPositionType, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43041);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 3112;
                int i3 = 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                a(b3, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, packedPositionChild, i3, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr7[2])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int i6 = (int) Runtime.getRuntime().totalMemory();
            int i7 = (((~((-813686853) | i6)) | 6234112) * (-566)) + 938571554 + ((~(i6 | (-807452741))) * 566) + 24848518;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{new int[1], new int[]{i5}, new int[]{i4}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{37, 16, 70, 16}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{53, 16, 0, 6}, false, new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1}, objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, 24848518};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[46];
                byte b6 = bArr3[11];
                Object[] objArr11 = new Object[1];
                d(b5, b6, (byte) (b6 + 1), objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = bArr3[46];
                byte b8 = (byte) (b7 - 1);
                Object[] objArr12 = new Object[1];
                d(b8, (byte) (b8 | 73), b7, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c3 = (char) (43043 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int iMyPid2 = (Process.myPid() >> 22) + 3111;
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22;
                    byte b9 = $$a[7];
                    byte b10 = b9;
                    Object[] objArr13 = new Object[1];
                    a(b9, b10, b10, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, iMyPid2, maximumDrawingCacheSize, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(new int[]{0, 22, 2, 10}, false, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1}, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(new int[]{22, 15, 0, 7}, true, new byte[]{0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1}, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cRed = (char) (Color.red(0) + 43042);
                        int iArgb = 3111 - Color.argb(0, 0, 0, 0);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23;
                        byte[] bArr4 = $$a;
                        byte b11 = bArr4[5];
                        Object[] objArr16 = new Object[1];
                        a(b11, b11, bArr4[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRed, iArgb, iIndexOf, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char longPressTimeout = (char) (43042 - (ViewConfiguration.getLongPressTimeout() >> 16));
                        int i10 = 3111 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int pressedStateDuration = 22 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        byte[] bArr5 = $$a;
                        Object[] objArr17 = new Object[1];
                        a(bArr5[40], bArr5[5], bArr5[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(longPressTimeout, i10, pressedStateDuration, -1272852037, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i11 = ((int[]) objArr[1])[0];
        int i12 = ((int[]) objArr[2])[0];
        if (i12 == i11) {
            int i13 = ((int[]) objArr[0])[0];
            int i14 = ((int[]) objArr[2])[0];
            int i15 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr = {i14};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i16 = ~elapsedCpuTime;
            int i17 = (~((-676791403) | i16)) | 675348520;
            int i18 = ~(elapsedCpuTime | 1029682938);
            int i19 = i13 + ((i17 | i18) * (-252)) + 94166658 + ((i18 | (~(i16 | (-1442883)))) * 252);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr[0])[0] = i21 ^ (i21 << 5);
            Object[] objArr18 = {new int[1], new int[]{i15}, iArr, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
                int i23 = 2;
                int i24 = i22 % 2;
                int i25 = 0;
                while (i25 < strArr3.length) {
                    int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i26 % 128;
                    int i27 = i26 % i23;
                    arrayList.add(strArr3[i25]);
                    i25++;
                    i23 = 2;
                }
            }
            int[] iArr2 = new int[i12];
            int i28 = i12 - 1;
            iArr2[i28] = 1;
            Toast.makeText((Context) null, iArr2[((i12 * i28) % 2) - 1], 1).show();
            int i29 = ((int[]) objArr[0])[0];
            int i30 = ((int[]) objArr[2])[0];
            int i31 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr3 = {i31};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i32 = ~iMaxMemory;
            int i33 = (-1052331074) + (((~(1119415596 | i32)) | 541524178) * (-1188));
            int i34 = (~(iMaxMemory | (-1119415597))) | 541524178;
            int i35 = ~(585615862 | i32);
            int i36 = i29 + i33 + ((i34 | i35) * 594) + (((~((-1119415597) | i32)) | 1075323912 | i35) * 594);
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArr[0])[0] = i38 ^ (i38 << 5);
            Object[] objArr19 = {new int[1], iArr3, new int[]{i30}, strArr4};
        }
        return this.socketFactory;
    }

    public final Authenticator getAuthenticator() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        Authenticator authenticator = this.authenticator;
        int i5 = i3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return authenticator;
    }

    public final List<Protocol> getProtocols() {
        List<Protocol> list;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            list = this.protocols;
            int i4 = 1 / 0;
        } else {
            list = this.protocols;
        }
        int i5 = i2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final List<ConnectionSpec> getConnectionSpecs() {
        List<ConnectionSpec> list;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            list = this.connectionSpecs;
            int i4 = 60 / 0;
        } else {
            list = this.connectionSpecs;
        }
        int i5 = i2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ProxySelector getProxySelector() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        ProxySelector proxySelector = this.proxySelector;
        int i4 = i2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return proxySelector;
    }

    public final Proxy getProxy() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        Proxy proxy = this.proxy;
        int i5 = i3 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return proxy;
        }
        throw null;
    }

    public final SSLSocketFactory getSslSocketFactory() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactory;
        int i5 = i3 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return sSLSocketFactory;
    }

    public final HostnameVerifier getHostnameVerifier() {
        HostnameVerifier hostnameVerifier;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            hostnameVerifier = this.hostnameVerifier;
            int i4 = 58 / 0;
        } else {
            hostnameVerifier = this.hostnameVerifier;
        }
        int i5 = i2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return hostnameVerifier;
    }

    public final CertificatePinner getCertificatePinner() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        CertificatePinner certificatePinner = this.certificatePinner;
        int i5 = i2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return certificatePinner;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        if (!this.url.equals(address.url)) {
            return false;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.dns.equals(address.dns);
            throw null;
        }
        if (!this.dns.equals(address.dns) || !this.authenticator.equals(address.authenticator)) {
            return false;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            this.protocols.equals(address.protocols);
            obj2.hashCode();
            throw null;
        }
        if (!this.protocols.equals(address.protocols)) {
            return false;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        if (!this.connectionSpecs.equals(address.connectionSpecs) || !this.proxySelector.equals(address.proxySelector)) {
            return false;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        int i7 = i6 % 2;
        if (!Util.equal(this.proxy, address.proxy) || !Util.equal(this.sslSocketFactory, address.sslSocketFactory)) {
            return false;
        }
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
        int i9 = i8 % 2;
        return Util.equal(this.hostnameVerifier, address.hostnameVerifier) && Util.equal(this.certificatePinner, address.certificatePinner);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.url.hashCode();
        int iHashCode4 = this.dns.hashCode();
        int iHashCode5 = this.authenticator.hashCode();
        int iHashCode6 = this.protocols.hashCode();
        int iHashCode7 = this.connectionSpecs.hashCode();
        int iHashCode8 = this.proxySelector.hashCode();
        Proxy proxy = this.proxy;
        int iHashCode9 = 0;
        int iHashCode10 = proxy != null ? proxy.hashCode() : 0;
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactory;
        Object obj = null;
        if (sSLSocketFactory != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 == 0) {
                sSLSocketFactory.hashCode();
                throw null;
            }
            iHashCode = sSLSocketFactory.hashCode();
        } else {
            iHashCode = 0;
        }
        HostnameVerifier hostnameVerifier = this.hostnameVerifier;
        if (hostnameVerifier != null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            if (i3 % 2 != 0) {
                hostnameVerifier.hashCode();
                obj.hashCode();
                throw null;
            }
            iHashCode2 = hostnameVerifier.hashCode();
        } else {
            iHashCode2 = 0;
        }
        CertificatePinner certificatePinner = this.certificatePinner;
        if (certificatePinner != null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode9 = certificatePinner.hashCode();
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
        }
        return ((((((((((((((((((iHashCode3 + 527) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode10) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode9;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, int r8, int r9) {
        /*
            int r7 = 105 - r7
            int r8 = r8 * 3
            int r8 = 1 - r8
            int r9 = r9 * 2
            int r9 = 3 - r9
            byte[] r0 = com.squareup.okhttp.Address.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2a:
            int r7 = r7 + r9
            r9 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.Address.$$g(short, int, int):java.lang.String");
    }
}
