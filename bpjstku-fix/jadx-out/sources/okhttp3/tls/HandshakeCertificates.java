package okhttp3.tls;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.getVirtualChildCount;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okhttp3.tls.internal.TlsUtil;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0011"}, d2 = {"Lokhttp3/tls/HandshakeCertificates;", "", "Ljavax/net/ssl/X509KeyManager;", "p0", "Ljavax/net/ssl/X509TrustManager;", "p1", "<init>", "(Ljavax/net/ssl/X509KeyManager;Ljavax/net/ssl/X509TrustManager;)V", "-deprecated_keyManager", "()Ljavax/net/ssl/X509KeyManager;", "Ljavax/net/ssl/SSLContext;", "sslContext", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "-deprecated_trustManager", "()Ljavax/net/ssl/X509TrustManager;", "keyManager", "Ljavax/net/ssl/X509KeyManager;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "Builder"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HandshakeCertificates {
    private final X509KeyManager keyManager;
    private final X509TrustManager trustManager;
    private static final byte[] $$c = {58, -51, 54, -115};
    private static final int $$f = 172;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {119, -102, -34, -3, -3, -29, 16, -6, 15, -17, 3, -39, 39, -5, -8, 6, -8, -3};
    private static final int $$e = 242;
    private static final byte[] $$a = {68, 104, -93, -37, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 236;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {59726, 59788, 59777, 59802, 59807, 59791, 59733, 59747, 59779, 59790, 59791, 59744, 59758, 59778, 59778, 59784, 59711, 59757, 59759, 59746, 59770, 59749, 59749, 59773, 59755, 59743, 59745, 59750, 59742, 59730, 59746, 59759, 59707, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59717, 59770, 59739, 59723, 59757, 59773, 59768, 59751, 59746, 59731, 59740, 59750, 59746, 59756, 59705, 59752, 59757, 59771, 59749, 59744, 59746, 59758, 59747, 59757, 59747, 59770, 59751, 59759, 59728, 59705, 59746, 59756, 59753, 59753, 59752, 59744, 59750, 59733, 59757, 59773, 59749, 59748, 59748, 59749, 59744, 59737, 59708, 59716, 59771, 59747, 59724, 59714, 59757, 59751, 59771, 59809, 59809, 59814, 59792, 59821, 59820, 59818, 59815, 59794, 59792, 59818, 59823, 59811, 59811, 59762, 59815, 59821, 59798};

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 52
            int r5 = 56 - r5
            int r7 = r7 + 1
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r0 = okhttp3.tls.HandshakeCertificates.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r4 = r0[r5]
        L26:
            int r6 = r6 + r4
            int r6 = r6 + (-10)
            int r5 = r5 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.tls.HandshakeCertificates.b(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 14
            int r7 = r7 + 1
            int r8 = r8 + 4
            byte[] r0 = okhttp3.tls.HandshakeCertificates.$$d
            int r9 = r9 * 13
            int r9 = r9 + 98
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2d
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2d:
            int r3 = r3 + r8
            int r8 = r3 + 2
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.tls.HandshakeCertificates.c(int, short, byte, java.lang.Object[]):void");
    }

    private HandshakeCertificates(X509KeyManager x509KeyManager, X509TrustManager x509TrustManager) {
        this.keyManager = x509KeyManager;
        this.trustManager = x509TrustManager;
    }

    public final X509KeyManager keyManager() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 117;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        X509KeyManager x509KeyManager = this.keyManager;
        int i5 = i3 + 91;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
        return x509KeyManager;
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00102\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0011\"\u00020\nH\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018"}, d2 = {"Lokhttp3/tls/HandshakeCertificates$Builder;", "", "<init>", "()V", "", "p0", "addInsecureHost", "(Ljava/lang/String;)Lokhttp3/tls/HandshakeCertificates$Builder;", "addPlatformTrustedCertificates", "()Lokhttp3/tls/HandshakeCertificates$Builder;", "Ljava/security/cert/X509Certificate;", "addTrustedCertificate", "(Ljava/security/cert/X509Certificate;)Lokhttp3/tls/HandshakeCertificates$Builder;", "Lokhttp3/tls/HandshakeCertificates;", "build", "()Lokhttp3/tls/HandshakeCertificates;", "Lokhttp3/tls/HeldCertificate;", "", "p1", "heldCertificate", "(Lokhttp3/tls/HeldCertificate;[Ljava/security/cert/X509Certificate;)Lokhttp3/tls/HandshakeCertificates$Builder;", "Lokhttp3/tls/HeldCertificate;", "", "insecureHosts", "Ljava/util/List;", "intermediates", "[Ljava/security/cert/X509Certificate;", "trustedCertificates"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {
        private HeldCertificate heldCertificate;
        private X509Certificate[] intermediates;
        private final List<X509Certificate> trustedCertificates = new ArrayList();
        private final List<String> insecureHosts = new ArrayList();

        public final Builder heldCertificate(HeldCertificate p0, X509Certificate... p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.heldCertificate = p0;
            this.intermediates = (X509Certificate[]) Arrays.copyOf(p1, p1.length);
            return this;
        }

        public final Builder addTrustedCertificate(X509Certificate p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.trustedCertificates.add(p0);
            return this;
        }

        public final Builder addPlatformTrustedCertificates() throws NoSuchAlgorithmException, KeyStoreException {
            X509TrustManager x509TrustManagerPlatformTrustManager = Platform.INSTANCE.get().platformTrustManager();
            List<X509Certificate> list = this.trustedCertificates;
            X509Certificate[] acceptedIssuers = x509TrustManagerPlatformTrustManager.getAcceptedIssuers();
            Collections.addAll(list, Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
            return this;
        }

        public final Builder addInsecureHost(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.insecureHosts.add(p0);
            return this;
        }

        public final HandshakeCertificates build() throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException {
            List immutableList = Util.toImmutableList(this.insecureHosts);
            HeldCertificate heldCertificate = this.heldCertificate;
            X509Certificate[] x509CertificateArr = this.intermediates;
            if (x509CertificateArr == null) {
                x509CertificateArr = new X509Certificate[0];
            }
            return new HandshakeCertificates(TlsUtil.newKeyManager(null, heldCertificate, (X509Certificate[]) Arrays.copyOf(x509CertificateArr, x509CertificateArr.length)), TlsUtil.newTrustManager(null, this.trustedCertificates, immutableList), null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00dd A[PHI: r9
  0x00dd: PHI (r9v5 char) = (r9v4 char), (r9v29 char) binds: [B:36:0x00db, B:33:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00fc A[Catch: all -> 0x014f, TryCatch #1 {all -> 0x014f, blocks: (B:46:0x0159, B:48:0x0172, B:50:0x01b3, B:53:0x01c6, B:55:0x01d3, B:56:0x0214, B:38:0x00e4, B:40:0x00fc, B:41:0x013d), top: B:88:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0152  */
    /* JADX WARN: Code duplicated, block: B:48:0x0172 A[Catch: all -> 0x014f, TryCatch #1 {all -> 0x014f, blocks: (B:46:0x0159, B:48:0x0172, B:50:0x01b3, B:53:0x01c6, B:55:0x01d3, B:56:0x0214, B:38:0x00e4, B:40:0x00fc, B:41:0x013d), top: B:88:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01b1  */
    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        char c;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int length;
        char[] cArr;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        long j = 0;
        if (cArr2 != null) {
            int i9 = $11 + 67;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i10 = 0;
            while (i10 < length) {
                int i11 = $11 + 49;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                try {
                    Object[] objArr2 = new Object[i5];
                    objArr2[i3] = Integer.valueOf(cArr2[i10]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cResolveSize = (char) View.resolveSize(i3, i3);
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1270;
                        int packedPositionChild = 17 - ExpandableListView.getPackedPositionChild(j);
                        byte b = (byte) i3;
                        byte b2 = (byte) (b - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize, scrollDefaultDelay, packedPositionChild, 407021364, false, $$g(b, b2, (byte) (-b2)), new Class[]{Integer.TYPE});
                    }
                    cArr[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr2)).charValue();
                    i10++;
                    i3 = 0;
                    i5 = 1;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr2, i4, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            setvideostabilizationmode.b = 0;
            int i13 = $11 + 109;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 4 % 5;
            }
            char c2 = 0;
            while (setvideostabilizationmode.b < i6) {
                int i15 = $11 + 107;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    c = 1;
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i16 = setvideostabilizationmode.b;
                        char c3 = cArr3[setvideostabilizationmode.b];
                        Object[] objArr3 = new Object[2];
                        objArr3[c] = Integer.valueOf(c2);
                        objArr3[0] = Integer.valueOf(c3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 3226 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 13, 2133916302, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr3)).charValue();
                    } else {
                        int i17 = setvideostabilizationmode.b;
                        try {
                            Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = (byte) (b5 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29945), 1755 - View.MeasureSpec.makeMeasureSpec(0, 0), Gravity.getAbsoluteGravity(0, 0) + 23, 387247676, false, $$g(b5, b6, (byte) (b6 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i17] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr4)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                } else {
                    c = 1;
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i18 = setvideostabilizationmode.b;
                        char c4 = cArr3[setvideostabilizationmode.b];
                        Object[] objArr5 = new Object[2];
                        objArr5[c] = Integer.valueOf(c2);
                        objArr5[0] = Integer.valueOf(c4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = (byte) (b7 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 3226 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 13, 2133916302, false, $$g(b7, b8, (byte) (b8 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i18] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr5)).charValue();
                    } else {
                        int i19 = setvideostabilizationmode.b;
                        Object[] objArr6 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = (byte) (b9 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29945), 1755 - View.MeasureSpec.makeMeasureSpec(0, 0), Gravity.getAbsoluteGravity(0, 0) + 23, 387247676, false, $$g(b9, b10, (byte) (b10 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i19] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).charValue();
                    }
                }
                c2 = cArr4[setvideostabilizationmode.b];
                Object[] objArr7 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b11 = (byte) 0;
                    byte b12 = (byte) (b11 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - (ViewConfiguration.getPressedStateDuration() >> 16)), 1704 - TextUtils.lastIndexOf("", '0', 0, 0), 21 - TextUtils.indexOf("", "", 0), -1434471773, false, $$g(b11, b12, (byte) (b12 & 6)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr7);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            int i20 = $10 + 13;
            $11 = i20 % 128;
            if (i20 % 2 == 0) {
                char[] cArr5 = new char[i6];
                i = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i6);
                System.arraycopy(cArr5, 1, cArr3, i6 >>> i8, i8);
                System.arraycopy(cArr5, i8, cArr3, 1, i6 + i8);
            } else {
                i = 0;
                char[] cArr6 = new char[i6];
                System.arraycopy(cArr3, 0, cArr6, 0, i6);
                int i21 = i6 - i8;
                System.arraycopy(cArr6, 0, cArr3, i21, i8);
                System.arraycopy(cArr6, i8, cArr3, 0, i21);
            }
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i6];
            loop2: while (true) {
                setvideostabilizationmode.b = i;
                while (true) {
                    if (setvideostabilizationmode.b >= i6) {
                        break loop2;
                    }
                    int i22 = $11 + 35;
                    $10 = i22 % 128;
                    if (i22 % 2 != 0) {
                        cArr7[setvideostabilizationmode.b] = cArr3[i6 >>> setvideostabilizationmode.b];
                        setvideostabilizationmode.b >>= 1;
                    } else {
                        cArr7[setvideostabilizationmode.b] = cArr3[(i6 - setvideostabilizationmode.b) - 1];
                        i = setvideostabilizationmode.b + 1;
                    }
                }
            }
            cArr3 = cArr7;
        }
        if (i7 > 0) {
            int i23 = 0;
            while (true) {
                setvideostabilizationmode.b = i23;
                if (setvideostabilizationmode.b >= i6) {
                    break;
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i23 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x01ee  */
    public final X509TrustManager trustManager() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0'));
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 921;
            int iIndexOf = 27 - TextUtils.indexOf((CharSequence) "", '0');
            byte[] bArr = $$a;
            byte b = bArr[37];
            Object[] objArr2 = new Object[1];
            b(b, b, bArr[80], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, scrollBarFadeDuration, iIndexOf, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        a(new int[]{32, 22, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        a(new int[]{54, 15, 0, 7}, false, new byte[]{1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 31534);
            int offsetBefore = 921 - TextUtils.getOffsetBefore("", 0);
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 28;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[37];
            byte b3 = bArr2[80];
            Object[] objArr5 = new Object[1];
            b(b2, b3, (byte) (b3 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf2, offsetBefore, iKeyCodeFromString, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (31534 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int tapTimeout = 921 - (ViewConfiguration.getTapTimeout() >> 16);
                int i4 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27;
                byte[] bArr3 = $$a;
                byte b4 = bArr3[80];
                Object[] objArr6 = new Object[1];
                b(b4, b4, (byte) (-bArr3[3]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, tapTimeout, i4, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i5 = (~((int) Process.getElapsedCpuTime())) | 782930419;
            int i6 = ((784902954 + (i5 * 495)) + (((~i5) | 704811168) * 495)) - 372774081;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            a(new int[]{69, 26, 0, 3}, true, new byte[]{0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a(new int[]{95, 18, 56, 4}, true, null, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
                    TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                    int i10 = i9 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            a(new int[]{0, 16, 30, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a(new int[]{16, 16, 0, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -372774081};
                byte b5 = (byte) 1;
                byte b6 = (byte) (-b5);
                Object[] objArr13 = new Object[1];
                c(b5, b6, (byte) (-b6), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = (byte) 0;
                Object[] objArr14 = new Object[1];
                c(b7, (byte) (b7 | 13), b7, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char capsMode = (char) (31533 - TextUtils.getCapsMode("", 0, 0));
                    int iIndexOf2 = 921 - TextUtils.indexOf("", "", 0, 0);
                    int pressedStateDuration = 28 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte[] bArr4 = $$a;
                    byte b8 = bArr4[80];
                    Object[] objArr16 = new Object[1];
                    b(b8, b8, (byte) (-bArr4[3]), objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode, iIndexOf2, pressedStateDuration, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    a(new int[]{32, 22, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    a(new int[]{54, 15, 0, 7}, false, new byte[]{1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollBarFadeDuration2 = (char) (31533 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        int iNormalizeMetaState = 921 - KeyEvent.normalizeMetaState(0);
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 28;
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[37];
                        byte b10 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        b(b9, b10, (byte) (b10 | 52), objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration2, iNormalizeMetaState, iResolveOpacity, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cResolveOpacity = (char) (31533 - Drawable.resolveOpacity(0, 0));
                        int fadingEdgeLength = 921 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int iGreen = Color.green(0) + 28;
                        byte[] bArr6 = $$a;
                        byte b11 = bArr6[37];
                        byte b12 = bArr6[80];
                        Object[] objArr20 = new Object[1];
                        b(b11, b11, b12, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveOpacity, fadingEdgeLength, iGreen, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        int i12 = ((int[]) objArr[3])[0];
        if (i12 == i11) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
            int i14 = i13 % 2;
            int i15 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i16 = i15 + (((~((-1660822632) | iIdentityHashCode)) | 1681788499) * 398) + 1914162319 + (((~((~iIdentityHashCode) | (-1660822632))) | 1681788499) * 398);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr21[0])[0] = i18 ^ (i18 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i19 = TuitionPaymentFragmentbindingInflater1 + 83;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
                int i20 = i19 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i12];
            int i21 = i12 - 1;
            iArr[i21] = 1;
            Toast.makeText((Context) null, iArr[((i12 * i21) % 2) - 1], 1).show();
            int i22 = ((int[]) objArr[0])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i23 = ~(636746328 | iIdentityHashCode2);
            int i24 = i22 + (-2103164592) + ((1107821571 | i23) * (-814)) + ((i23 | (~((~iIdentityHashCode2) | (-1137333316))) | 607234584) * 407) + (((~(iIdentityHashCode2 | 1137333315)) | (~((-636746329) | iIdentityHashCode2)) | 607234584) * 407);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr22[0])[0] = i26 ^ (i26 << 5);
        }
        return this.trustManager;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "keyManager", imports = {}))
    /* JADX INFO: renamed from: -deprecated_keyManager, reason: not valid java name */
    public final X509KeyManager m9651deprecated_keyManager() {
        X509KeyManager x509KeyManager;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 69;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            x509KeyManager = this.keyManager;
            int i4 = 30 / 0;
        } else {
            x509KeyManager = this.keyManager;
        }
        int i5 = i2 + 23;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return x509KeyManager;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "trustManager", imports = {}))
    /* JADX INFO: renamed from: -deprecated_trustManager, reason: not valid java name */
    public final X509TrustManager m9652deprecated_trustManager() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 9;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        X509TrustManager x509TrustManager = this.trustManager;
        int i5 = i3 + 115;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return x509TrustManager;
    }

    public final SSLSocketFactory sslSocketFactory() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        SSLSocketFactory socketFactory = sslContext().getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "");
        int i4 = TuitionPaymentFragmentbindingInflater1 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return socketFactory;
    }

    public final SSLContext sslContext() throws Throwable {
        int i = 2 % 2;
        SSLContext sSLContextNewSSLContext = Platform.INSTANCE.get().newSSLContext();
        Object[] objArr = new Object[1];
        a(new int[]{0, 16, 30, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(new int[]{16, 16, 0, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr2);
        if (getVirtualChildCount.TuitionPaymentFragmentbindingInflater1(new ArrayList()) != 0) {
            throw null;
        }
        sSLContextNewSSLContext.init(new KeyManager[]{keyManager()}, new TrustManager[]{trustManager()}, new SecureRandom());
        int i2 = TuitionPaymentFragmentbindingInflater1 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 / 0;
        }
        return sSLContextNewSSLContext;
    }

    public /* synthetic */ HandshakeCertificates(X509KeyManager x509KeyManager, X509TrustManager x509TrustManager, DefaultConstructorMarker defaultConstructorMarker) {
        this(x509KeyManager, x509TrustManager);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, byte r7, byte r8) {
        /*
            byte[] r0 = okhttp3.tls.HandshakeCertificates.$$c
            int r8 = r8 + 99
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L20:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L28:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.tls.HandshakeCertificates.$$g(short, byte, byte):java.lang.String");
    }
}
