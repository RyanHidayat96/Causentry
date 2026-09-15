package com.squareup.okhttp;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.squareup.okhttp.internal.Util;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes6.dex */
public final class ConnectionSpec {
    private static final CipherSuite[] APPROVED_CIPHER_SUITES;
    public static final ConnectionSpec CLEARTEXT;
    public static final ConnectionSpec COMPATIBLE_TLS;
    public static final ConnectionSpec MODERN_TLS;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int b;
    private final String[] cipherSuites;
    private final boolean supportsTlsExtensions;
    private final boolean tls;
    private final String[] tlsVersions;
    private static final byte[] $$c = {27, 65, -33, 120};
    private static final int $$d = 213;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {68, 104, -93, -37, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 221;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int asInterface = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.squareup.okhttp.ConnectionSpec.$$a
            int r8 = r8 * 4
            int r8 = 84 - r8
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.ConnectionSpec.c(short, byte, int, java.lang.Object[]):void");
    }

    static /* synthetic */ boolean access$400(ConnectionSpec connectionSpec) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean z = connectionSpec.tls;
        if (i3 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ String[] access$500(ConnectionSpec connectionSpec) {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String[] strArr = connectionSpec.cipherSuites;
        int i5 = i3 + 73;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return strArr;
    }

    static /* synthetic */ String[] access$600(ConnectionSpec connectionSpec) {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String[] strArr = connectionSpec.tlsVersions;
        int i5 = i3 + 43;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return strArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ boolean access$700(ConnectionSpec connectionSpec) {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        boolean z = connectionSpec.supportsTlsExtensions;
        if (i4 != 0) {
            int i5 = 91 / 0;
        }
        int i6 = i3 + 119;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        throw null;
    }

    static {
        b = 1;
        b();
        CipherSuite[] cipherSuiteArr = {CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        APPROVED_CIPHER_SUITES = cipherSuiteArr;
        ConnectionSpec connectionSpecBuild = new Builder(true).cipherSuites(cipherSuiteArr).tlsVersions(TlsVersion.TLS_1_2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).supportsTlsExtensions(true).build();
        MODERN_TLS = connectionSpecBuild;
        COMPATIBLE_TLS = new Builder(connectionSpecBuild).tlsVersions(TlsVersion.TLS_1_0).supportsTlsExtensions(true).build();
        CLEARTEXT = new Builder(false).build();
        int i = TuitionPaymentFragmentbindingInflater1 + 89;
        b = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private ConnectionSpec(Builder builder) {
        this.tls = builder.tls;
        this.cipherSuites = builder.cipherSuites;
        this.tlsVersions = builder.tlsVersions;
        this.supportsTlsExtensions = builder.supportsTlsExtensions;
    }

    public final boolean isTls() {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.tls;
        int i4 = i3 + 99;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:54:0x02d5  */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        char c2;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            c2 = '0';
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i4 = $11 + 99;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i * i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2186, 39 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 841711447, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - TextUtils.getTrimmedLength("")), 3011 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 26 - (Process.myTid() >> 22), 321985076, false, $$e(b4, b5, (byte) (b5 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36506 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), KeyEvent.keyCodeFromString("") + 3376, 16 - Process.getGidForName(""), -968507904, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Process.myPid() >> 22), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2187, ((byte) KeyEvent.getModifierMetaStateMask()) + 41, 841711447, false, $$e(b8, b9, b9), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 33016), TextUtils.lastIndexOf("", '0', 0, 0) + 3012, 26 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 321985076, false, $$e(b10, b11, (byte) (b11 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 36505), ExpandableListView.getPackedPositionGroup(0L) + 3376, 17 - (Process.myTid() >> 22), -968507904, false, $$e(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
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
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                byte b14 = (byte) 0;
                byte b15 = b14;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 36505), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3376, 16 - TextUtils.lastIndexOf("", c2, 0, 0), -968507904, false, $$e(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
            int i7 = $11 + 15;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            c2 = '0';
        }
        objArr[0] = new String(cArr);
    }

    public static final class Builder {
        private String[] cipherSuites;
        private boolean supportsTlsExtensions;
        private boolean tls;
        private String[] tlsVersions;

        Builder(boolean z) {
            this.tls = z;
        }

        public Builder(ConnectionSpec connectionSpec) {
            this.tls = ConnectionSpec.access$400(connectionSpec);
            this.cipherSuites = ConnectionSpec.access$500(connectionSpec);
            this.tlsVersions = ConnectionSpec.access$600(connectionSpec);
            this.supportsTlsExtensions = ConnectionSpec.access$700(connectionSpec);
        }

        public final Builder allEnabledCipherSuites() {
            if (!this.tls) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            this.cipherSuites = null;
            return this;
        }

        public final Builder cipherSuites(CipherSuite... cipherSuiteArr) {
            if (!this.tls) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[cipherSuiteArr.length];
            for (int i = 0; i < cipherSuiteArr.length; i++) {
                strArr[i] = cipherSuiteArr[i].javaName;
            }
            return cipherSuites(strArr);
        }

        public final Builder cipherSuites(String... strArr) {
            if (!this.tls) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.cipherSuites = (String[]) strArr.clone();
            return this;
        }

        public final Builder allEnabledTlsVersions() {
            if (!this.tls) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            this.tlsVersions = null;
            return this;
        }

        public final Builder tlsVersions(TlsVersion... tlsVersionArr) {
            if (!this.tls) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[tlsVersionArr.length];
            for (int i = 0; i < tlsVersionArr.length; i++) {
                strArr[i] = tlsVersionArr[i].javaName;
            }
            return tlsVersions(strArr);
        }

        public final Builder tlsVersions(String... strArr) {
            if (!this.tls) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.tlsVersions = (String[]) strArr.clone();
            return this;
        }

        public final Builder supportsTlsExtensions(boolean z) {
            if (!this.tls) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.supportsTlsExtensions = z;
            return this;
        }

        public final ConnectionSpec build() {
            return new ConnectionSpec(this);
        }
    }

    public final List<CipherSuite> cipherSuites() throws Throwable {
        int i;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        int i3 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46401 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 40 - View.resolveSize(0, 0), 18 - TextUtils.indexOf((CharSequence) "", '0'), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        a(Gravity.getAbsoluteGravity(0, 0), 21 - TextUtils.indexOf((CharSequence) "", '0'), (char) (14915 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(Color.rgb(0, 0, 0) + 16777238, 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (Process.getGidForName("") + 1), objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = 371;
        long j2 = (j * 1656991998304111662L) + (j * 440265176437847325L);
        long j3 = -370;
        long j4 = -1;
        long j5 = j4 ^ 440265176437847325L;
        long jUptimeMillis = (int) SystemClock.uptimeMillis();
        long j6 = jUptimeMillis ^ j4;
        long j7 = 1656991998304111662L ^ j4;
        long j8 = j2 + ((((j5 | j6) ^ j4) | ((j7 | jUptimeMillis) ^ j4)) * j3);
        long j9 = ((j5 | jUptimeMillis) ^ j4) | ((j6 | j7) ^ j4);
        long j10 = j4 ^ 1657029965815610687L;
        long j11 = j8 + (j3 * (j9 | j10)) + (((long) 370) * j10);
        int i5 = asInterface + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        long j12 = jLongValue;
        while (true) {
            if (i7 == 10) {
                Object[] objArr3 = new Object[1];
                a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36, 16 - TextUtils.getOffsetAfter("", 0), (char) (41128 - (ViewConfiguration.getPressedStateDuration() >> 16)), objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a(52 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 16, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 9793), objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {-2135461726};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46038 - TextUtils.indexOf("", "", 0)), 1134 - (ViewConfiguration.getPressedStateDuration() >> 16), View.MeasureSpec.getMode(0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -318468176, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1031;
                        int i8 = 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        byte[] bArr = $$a;
                        byte b2 = bArr[7];
                        Object[] objArr7 = new Object[1];
                        c(b2, (byte) (-bArr[5]), b2, objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, iNormalizeMetaState, i8, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45994 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 1118 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr6);
                    i = 0;
                    int i9 = ((int[]) objArr8[1])[0];
                    int i10 = ((int[]) objArr8[3])[0];
                    if (i10 == i9) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr8[0];
                    if (strArr != null) {
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    throw new RuntimeException(String.valueOf(i10));
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (37836 - (ViewConfiguration.getEdgeSlop() >> 16)), View.combineMeasuredStates(i3, i3) + 59, 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i11 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
            int i12 = i3;
            long j13 = j12;
            while (true) {
                for (int i13 = i3; i13 != 8; i13++) {
                    i11 = (((((int) (j13 >> i13)) & 255) + (i11 << 6)) + (i11 << 16)) - i11;
                }
                if (i12 != 0) {
                    break;
                }
                int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
                asInterface = i14 % 128;
                int i15 = i14 % 2;
                i12++;
                j13 = j11;
                i3 = 0;
            }
            if (i11 == i4) {
                i = 0;
                break;
            }
            int i16 = asInterface + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 % 128;
            int i17 = i16 % 2;
            j12 -= 1024;
            i7++;
            i3 = 0;
        }
        String[] strArr2 = this.cipherSuites;
        if (strArr2 == null) {
            return null;
        }
        CipherSuite[] cipherSuiteArr = new CipherSuite[strArr2.length];
        int i18 = i;
        while (true) {
            String[] strArr3 = this.cipherSuites;
            if (i18 >= strArr3.length) {
                return Util.immutableList(cipherSuiteArr);
            }
            cipherSuiteArr[i18] = CipherSuite.forJavaName(strArr3[i18]);
            i18++;
        }
    }

    public final List<TlsVersion> tlsVersions() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String[] strArr = this.tlsVersions;
        int i4 = 0;
        if (strArr == null) {
            int i5 = i2 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 9 / 0;
            }
            return null;
        }
        TlsVersion[] tlsVersionArr = new TlsVersion[strArr.length];
        while (true) {
            String[] strArr2 = this.tlsVersions;
            if (i4 >= strArr2.length) {
                return Util.immutableList(tlsVersionArr);
            }
            int i7 = asInterface + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
            tlsVersionArr[i4] = TlsVersion.forJavaName(strArr2[i4]);
            i4++;
        }
    }

    public final boolean supportsTlsExtensions() {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        boolean z = this.supportsTlsExtensions;
        int i5 = i3 + 25;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final void apply(SSLSocket sSLSocket, boolean z) {
        int i = 2 % 2;
        ConnectionSpec connectionSpecSupportedSpec = supportedSpec(sSLSocket, z);
        String[] strArr = connectionSpecSupportedSpec.tlsVersions;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = connectionSpecSupportedSpec.cipherSuites;
        if (strArr2 != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            sSLSocket.setEnabledCipherSuites(strArr2);
            if (i3 == 0) {
                int i4 = 24 / 0;
            }
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    private ConnectionSpec supportedSpec(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        int i = 2 % 2;
        String[] strArr = this.cipherSuites;
        String[] enabledCipherSuites = strArr != null ? (String[]) Util.intersect(String.class, strArr, sSLSocket.getEnabledCipherSuites()) : sSLSocket.getEnabledCipherSuites();
        String[] strArr2 = this.tlsVersions;
        if (strArr2 != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            enabledProtocols = (String[]) Util.intersect(String.class, strArr2, sSLSocket.getEnabledProtocols());
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        if (z && Util.contains(sSLSocket.getSupportedCipherSuites(), "TLS_FALLBACK_SCSV")) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            enabledCipherSuites = Util.concat(enabledCipherSuites, "TLS_FALLBACK_SCSV");
        }
        return new Builder(this).cipherSuites(enabledCipherSuites).tlsVersions(enabledProtocols).build();
    }

    public final boolean isCompatible(SSLSocket sSLSocket) {
        int i = 2 % 2;
        if (this.tls) {
            String[] strArr = this.tlsVersions;
            if (strArr != null && !nonEmptyIntersection(strArr, sSLSocket.getEnabledProtocols())) {
                return false;
            }
            String[] strArr2 = this.cipherSuites;
            if (strArr2 != null) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                if (i3 == 0) {
                    nonEmptyIntersection(strArr2, enabledCipherSuites);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (!nonEmptyIntersection(strArr2, enabledCipherSuites)) {
                    return false;
                }
            }
            return true;
        }
        int i4 = asInterface + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        return i4 % 2 != 0;
    }

    private static boolean nonEmptyIntersection(String[] strArr, String[] strArr2) {
        int i = 2 % 2;
        if (strArr != null && strArr2 != null && strArr.length != 0) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 125;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            if (strArr2.length != 0) {
                int i5 = i2 + 89;
                asInterface = i5 % 128;
                int length = i5 % 2 == 0 ? strArr.length : strArr.length;
                int i6 = 0;
                while (i6 < length) {
                    if (Util.contains(strArr2, strArr[i6])) {
                        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
                        asInterface = i7 % 128;
                        int i8 = i7 % 2;
                        return true;
                    }
                    i6++;
                    int i9 = asInterface + 27;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (!(obj instanceof ConnectionSpec)) {
            int i2 = asInterface + 43;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 113;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (obj == this) {
            return true;
        }
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        boolean z = this.tls;
        if (z != connectionSpec.tls) {
            return false;
        }
        if (!(!z)) {
            if (!Arrays.equals(this.cipherSuites, connectionSpec.cipherSuites)) {
                return false;
            }
            if (!Arrays.equals(this.tlsVersions, connectionSpec.tlsVersions)) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (this.supportsTlsExtensions != connectionSpec.supportsTlsExtensions) {
                return false;
            }
        }
        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        asInterface = i9 % 128;
        if (i9 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        if (!this.tls) {
            return 17;
        }
        int i5 = i3 + 85;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        int iHashCode = ((((Arrays.hashCode(this.cipherSuites) + 527) * 31) + Arrays.hashCode(this.tlsVersions)) * 31) + (!this.supportsTlsExtensions ? 1 : 0);
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        return iHashCode;
    }

    public final String toString() {
        String string;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (!this.tls) {
            return "ConnectionSpec()";
        }
        if (this.cipherSuites != null) {
            string = cipherSuites().toString();
            int i4 = asInterface + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            string = "[all enabled]";
        }
        String string2 = this.tlsVersions != null ? tlsVersions().toString() : "[all enabled]";
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(string);
        sb.append(", tlsVersions=");
        sb.append(string2);
        sb.append(", supportsTlsExtensions=");
        sb.append(this.supportsTlsExtensions);
        sb.append(")");
        return sb.toString();
    }

    static void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new char[]{35774, 17266, 6717, 53732, 43196, 24697, 16169, 63140, 52648, 34167, 23663, 11245, 57986, 47691, 28929, 18647, 1922, 57199, 38405, 28105, 9344, 64587, 45561, 31027, 8315, 60325, 37603, 23094, 1386, 52379, 63457, 48934, 26222, 4489, 55505, 32790, 19283, 4446, 55702, 32964, 19228, 12822, 64151, 42439, 27663, 22347, 8129, 50937, 45356, 30819, 8359, 60411, 53812, 38836, 24442, 1598, 52730, 46245, 31867, 9019, 60145, 53645, 39271, 16432, 14292, 65210, 42581, 27923, 21717};
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1648108671691159903L;
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
    private static java.lang.String $$e(short r6, byte r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r7 = 1 - r7
            int r8 = r8 * 3
            int r8 = r8 + 109
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r0 = com.squareup.okhttp.ConnectionSpec.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r5 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r6]
        L26:
            int r6 = r6 + 1
            int r8 = r8 + r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.ConnectionSpec.$$e(short, byte, byte):java.lang.String");
    }
}
