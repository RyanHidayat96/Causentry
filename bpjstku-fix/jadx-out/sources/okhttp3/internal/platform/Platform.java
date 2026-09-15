package okhttp3.internal.platform;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.RotationProviderListenerWrapper;
import defpackage.SessionProcessor;
import defpackage.accessgetActiveChannelp;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.Util;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 62\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0011\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u00140\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010%J-\u0010'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u001a2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b'\u0010(J!\u0010)\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0017¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020.2\u0006\u0010\u0005\u001a\u00020\tH\u0017¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\tH\u0017¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0010H\u0017¢\u0006\u0004\b3\u0010\u001eJ\u0019\u00104\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020.H\u0016¢\u0006\u0004\b4\u00105"}, d2 = {"Lokhttp3/internal/platform/Platform;", "", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "p0", "", "afterHandshake", "(Ljavax/net/ssl/SSLSocket;)V", "Ljavax/net/ssl/X509TrustManager;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "buildCertificateChainCleaner", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/CertificateChainCleaner;", "Lokhttp3/internal/tls/TrustRootIndex;", "buildTrustRootIndex", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/TrustRootIndex;", "", "p1", "", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "p2", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/Socket;", "Ljava/net/InetSocketAddress;", "", "connectSocket", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "getPrefix", "()Ljava/lang/String;", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "getStackTraceForCloseable", "(Ljava/lang/String;)Ljava/lang/Object;", "", "isCleartextTrafficPermitted", "(Ljava/lang/String;)Z", "", "log", "(Ljava/lang/String;ILjava/lang/Throwable;)V", "logCloseableLeak", "(Ljava/lang/String;Ljava/lang/Object;)V", "Ljavax/net/ssl/SSLContext;", "newSSLContext", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/SSLSocketFactory;", "newSslSocketFactory", "(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;", "platformTrustManager", "()Ljavax/net/ssl/X509TrustManager;", "toString", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class Platform {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final int INFO = 4;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    public static final int WARN = 5;
    private static final Logger logger;
    private static volatile Platform platform;
    private static final byte[] $$l = {107, 48, 57, 107};
    private static final int $$m = 215;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {117, 50, 102, 124, 15, 1, -60, 60, 11, 3, -5, 8, -4, -52, 54, 16, -7, 17, 0, -3, -2, -51, 60, 9, 9, -66, 66, -9, 18, 6, -66, 66, 5, -8, 4, 10, -59, 37, 34, 0, 16, -15, 11, 2, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, -15, 10, 8, -7, 8, 8, -4, -27, 40, -5, 9, -8, 22, -12, 16, -62};
    private static final int $$k = 133;
    private static final byte[] $$d = {70, -114, 113, 8, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$e = 201;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int b = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = 55 - r6
            byte[] r0 = okhttp3.internal.platform.Platform.$$d
            int r1 = 53 - r7
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2e
        L17:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            int r8 = r8 + 1
            r4 = r0[r8]
            int r3 = r3 + 1
        L2e:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-10)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.Platform.e(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void g(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 3
            int r0 = r5 + 38
            byte[] r1 = okhttp3.internal.platform.Platform.$$j
            int r7 = r7 * 40
            int r7 = 44 - r7
            int r6 = r6 * 15
            int r6 = 99 - r6
            byte[] r0 = new byte[r0]
            int r5 = r5 + 37
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r6
            r3 = r2
            r6 = r5
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            r4 = r1[r7]
            int r3 = r3 + 1
        L2b:
            int r6 = r6 + r4
            int r6 = r6 + (-3)
            int r7 = r7 + 1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.Platform.g(short, int, byte, java.lang.Object[]):void");
    }

    public static final /* synthetic */ Platform access$getPlatform$cp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Platform platform2 = platform;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return platform2;
        }
        throw null;
    }

    public static final /* synthetic */ void access$setPlatform$cp(Platform platform2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        b = i2 % 128;
        int i3 = i2 % 2;
        platform = platform2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getPrefix() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return "OkHttp";
        }
        throw null;
    }

    public SSLContext newSSLContext() throws NoSuchAlgorithmException {
        int i = 2 % 2;
        int i2 = b + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "");
        int i4 = b + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return sSLContext;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v8 javax.net.ssl.TrustManager, still in use, count: 2, list:
          (r3v8 javax.net.ssl.TrustManager) from 0x0032: INSTANCE_OF (r3v8 javax.net.ssl.TrustManager) A[WRAPPED] javax.net.ssl.X509TrustManager
          (r3v8 javax.net.ssl.TrustManager) from 0x003f: PHI (r3 I:??) = (r3v5 javax.net.ssl.TrustManager), (r3v8 javax.net.ssl.TrustManager) binds: [B:10:0x003d, B:7:0x0035] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public javax.net.ssl.X509TrustManager platformTrustManager() throws java.security.NoSuchAlgorithmException, java.security.KeyStoreException {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = okhttp3.internal.platform.Platform.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r1 = r1 + 35
            int r2 = r1 % 128
            okhttp3.internal.platform.Platform.b = r2
            int r1 = r1 % r0
            java.lang.String r1 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()
            javax.net.ssl.TrustManagerFactory r1 = javax.net.ssl.TrustManagerFactory.getInstance(r1)
            r2 = 0
            r1.init(r2)
            javax.net.ssl.TrustManager[] r1 = r1.getTrustManagers()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r3 = r1.length
            java.lang.String r4 = ""
            r5 = 1
            if (r3 != r5) goto L54
            int r3 = okhttp3.internal.platform.Platform.b
            int r3 = r3 + 29
            int r6 = r3 % 128
            okhttp3.internal.platform.Platform.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r6
            int r3 = r3 % r0
            if (r3 == 0) goto L38
            r3 = r1[r5]
            boolean r6 = r3 instanceof javax.net.ssl.X509TrustManager
            r6 = r6 ^ r5
            if (r6 == r5) goto L54
            goto L3f
        L38:
            r3 = 0
            r3 = r1[r3]
            boolean r6 = r3 instanceof javax.net.ssl.X509TrustManager
            if (r6 != r5) goto L54
        L3f:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
            javax.net.ssl.X509TrustManager r3 = (javax.net.ssl.X509TrustManager) r3
            int r1 = okhttp3.internal.platform.Platform.b
            int r1 = r1 + 97
            int r4 = r1 % 128
            okhttp3.internal.platform.Platform.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L50
            return r3
        L50:
            r2.hashCode()
            throw r2
        L54:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected default trust managers: "
            r0.<init>(r2)
            java.lang.String r1 = java.util.Arrays.toString(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.Platform.platformTrustManager():javax.net.ssl.X509TrustManager");
    }

    public X509TrustManager trustManager(SSLSocketFactory p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            Class<?> cls = Class.forName("sun.security.ssl.SSLContextImpl");
            Intrinsics.checkNotNullExpressionValue(cls, "");
            Object fieldOrNull = Util.readFieldOrNull(p0, cls, "context");
            if (fieldOrNull == null) {
                int i2 = b + 83;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                int i3 = i2 % 2;
                return null;
            }
            X509TrustManager x509TrustManager = (X509TrustManager) Util.readFieldOrNull(fieldOrNull, X509TrustManager.class, "trustManager");
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
            b = i4 % 128;
            int i5 = i4 % 2;
            return x509TrustManager;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (RuntimeException e2) {
            if (!Intrinsics.areEqual(e2.getClass().getName(), "java.lang.reflect.InaccessibleObjectException")) {
                throw e2;
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0006\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001a8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001cR\u0018\u0010!\u001a\u0006*\u00020 0 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lokhttp3/internal/platform/Platform$Companion;", "", "<init>", "()V", "", "Lokhttp3/Protocol;", "p0", "", "alpnProtocolNames", "(Ljava/util/List;)Ljava/util/List;", "", "concatLengthPrefixed", "(Ljava/util/List;)[B", "Lokhttp3/internal/platform/Platform;", "findAndroidPlatform", "()Lokhttp3/internal/platform/Platform;", "findJvmPlatform", "findPlatform", "get", "", "resetForTests", "(Lokhttp3/internal/platform/Platform;)V", "", "INFO", "I", "WARN", "", "isAndroid", "()Z", "isBouncyCastlePreferred", "isConscryptPreferred", "isOpenJSSEPreferred", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "platform", "Lokhttp3/internal/platform/Platform;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private static final byte[] $$c = {25, 5, -88, -44};
        private static final int $$f = 197;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {6, -86, -9, -124, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -73, 3, 27, -21, 21, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 69};
        private static final int $$e = 31;
        private static final byte[] $$a = {6, -86, -9, -124, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
        private static final int $$b = 110;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int b = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -4162122915476369056L;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -981105359;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 34097;

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r5, short r6, int r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 + 84
                byte[] r0 = okhttp3.internal.platform.Platform.Companion.$$a
                int r6 = r6 * 52
                int r6 = 56 - r6
                int r7 = r7 * 52
                int r1 = 53 - r7
                byte[] r1 = new byte[r1]
                int r7 = 52 - r7
                r2 = 0
                if (r0 != 0) goto L17
                r4 = r6
                r5 = r7
                r3 = r2
                goto L29
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r5
                r1[r3] = r4
                if (r3 != r7) goto L25
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L25:
                int r3 = r3 + 1
                r4 = r0[r6]
            L29:
                int r6 = r6 + 1
                int r5 = r5 + r4
                int r5 = r5 + (-11)
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.Platform.Companion.a(byte, short, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(short r7, byte r8, byte r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = okhttp3.internal.platform.Platform.Companion.$$d
                int r8 = r8 * 15
                int r8 = r8 + 84
                int r9 = r9 + 4
                int r7 = r7 * 3
                int r7 = 53 - r7
                byte[] r1 = new byte[r7]
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
                byte r5 = (byte) r8
                r1[r3] = r5
                int r9 = r9 + 1
                if (r4 != r7) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r9]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L2d:
                int r8 = -r8
                int r9 = r9 + r8
                int r8 = r9 + 3
                r9 = r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.Platform.Companion.d(short, byte, byte, java.lang.Object[]):void");
        }

        private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
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
                int i4 = $11 + 15;
                $10 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - (ViewConfiguration.getScrollBarSize() >> 8)), (ViewConfiguration.getTapTimeout() >> 16) + 1235, View.MeasureSpec.getSize(0) + 35, -653973969, false, $$g(b2, b3, b3), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 2;
                        byte b5 = (byte) (b4 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 2764 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (Process.myTid() >> 22) + 14, 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 43325), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 252, 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 65200);
                        int i6 = 2892 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 17;
                        byte b6 = (byte) ($$f & 3);
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatDelay, i6, iCombineMeasuredStates, 2012627446, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = sessionProcessor.b;
                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))));
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                    int i7 = $11 + 75;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
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

        private Companion() {
        }

        public static final /* synthetic */ Platform access$findPlatform(Companion companion) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 99;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                return companion.findPlatform();
            }
            companion.findPlatform();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @JvmStatic
        public final Platform get() {
            int i = 2 % 2;
            int i2 = b + 105;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 == 0) {
                return Platform.access$getPlatform$cp();
            }
            Platform.access$getPlatform$cp();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ void resetForTests$default(Companion companion, Platform platform, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = b + 105;
                TuitionPaymentFragmentbindingInflater1 = i3 % 128;
                if (i3 % 2 != 0) {
                    companion.findPlatform();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                platform = companion.findPlatform();
            }
            companion.resetForTests(platform);
            int i4 = TuitionPaymentFragmentbindingInflater1 + 1;
            b = i4 % 128;
            int i5 = i4 % 2;
        }

        public final void resetForTests(Platform p0) {
            int i = 2 % 2;
            int i2 = b + 27;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(p0, "");
                Platform.access$setPlatform$cp(p0);
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(p0, "");
            Platform.access$setPlatform$cp(p0);
            int i3 = TuitionPaymentFragmentbindingInflater1 + 73;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public final boolean isAndroid() {
            int i = 2 % 2;
            int i2 = b + 31;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            boolean zAreEqual = Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name"));
            int i4 = b + 109;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 63 / 0;
            }
            return zAreEqual;
        }

        public final List<String> alpnProtocolNames(List<? extends Protocol> p0) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            ArrayList arrayList = new ArrayList();
            int i2 = b + 17;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            for (Object obj : p0) {
                int i4 = TuitionPaymentFragmentbindingInflater1 + 69;
                b = i4 % 128;
                int i5 = i4 % 2;
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((Protocol) it.next()).toString());
                int i6 = TuitionPaymentFragmentbindingInflater1 + 57;
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 / 5;
                }
            }
            return arrayList3;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x028e  */
        private final boolean isConscryptPreferred() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            String name = Security.getProviders()[0].getName();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cBlue = (char) Color.blue(0);
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 877;
                int i2 = 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                byte b2 = (byte) ($$b & 31);
                byte b3 = (byte) (-$$a[5]);
                Object[] objArr2 = new Object[1];
                a(b2, b3, b3, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, modifierMetaStateMask, i2, 252381699, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{5201, 23041, 50737, 24899}, new char[]{24050, 53487, 59823, 27991}, (char) (Process.myPid() >> 22), View.MeasureSpec.getMode(0), new char[]{36836, 17415, 27478, 21136, 58872, 14391, 59476, 27614, 2659, 16352, 64571, 2812, 56708, 12791, 912, 24888, 11006, 23353, 25799, 64891, 32701, 21202}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{5201, 23041, 50737, 24899}, new char[]{17259, 58625, Typography.lowSingleQuote, 54418}, (char) (37407 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 451215682, new char[]{56191, 46719, 10048, 51466, 41990, 24959, 6450, 7829, 21607, 18211, 15025, 589, 24883, 13374, 49260}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char size = (char) View.MeasureSpec.getSize(0);
                int iArgb = Color.argb(0, 0, 0, 0) + 876;
                int iIndexOf = 10 - TextUtils.indexOf("", "", 0);
                byte[] bArr = $$a;
                byte b4 = bArr[7];
                Object[] objArr5 = new Object[1];
                a(b4, (byte) (-bArr[5]), b4, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(size, iArgb, iIndexOf, 2009631821, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i3 = TuitionPaymentFragmentbindingInflater1 + 69;
                b = i3 % 128;
                int i4 = i3 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                    int i5 = 877 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int i6 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9;
                    byte[] bArr2 = $$a;
                    Object[] objArr6 = new Object[1];
                    a(bArr2[54], bArr2[7], (byte) (-bArr2[5]), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(edgeSlop, i5, i6, 256017550, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int iMyUid = Process.myUid();
                int i7 = ~((-291905539) | iMyUid);
                int i8 = (-1178982380) + ((6684672 | i7) * (-280)) + ((i7 | (~(251595309 | iMyUid))) * 140);
                int i9 = ~((-285220867) | iMyUid);
                int i10 = ~iMyUid;
                int i11 = i8 + (((~(i10 | 536816175)) | i9 | (~((-6684673) | i10))) * 140) + 899829094;
                int i12 = (i11 << 13) ^ i11;
                int i13 = i12 ^ (i12 >>> 17);
                ((int[]) objArr[1])[0] = i13 ^ (i13 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{5201, 23041, 50737, 24899}, new char[]{53962, 22639, 33325, 14777}, (char) (TextUtils.indexOf((CharSequence) "", '0') + 47491), View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{4993, 38773, 40439, 15176, 51754, 29825, 33380, 18370, 63459, 51769, 27407, 43501, 9199, 52749, 54052, 65436, 49004, 13605, 51380, 53264, 39559, 15209, 2989, 52202, 12229, 14623}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{5201, 23041, 50737, 24899}, new char[]{3415, 11593, 41166, 8931}, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 58273), ExpandableListView.getPackedPositionGroup(0L), new char[]{1395, 56288, 19322, 21668, 14221, 3306, 31159, 54109, 50979, 63013, 5862, 32159, 48060, 20431, 38610, 7022, 65248, 37110}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if (applicationContext instanceof ContextWrapper) {
                        int i14 = TuitionPaymentFragmentbindingInflater1 + 25;
                        b = i14 % 128;
                        int i15 = i14 % 2;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            int i16 = TuitionPaymentFragmentbindingInflater1 + 15;
                            b = i16 % 128;
                            int i17 = i16 % 2;
                            applicationContext = null;
                        }
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                    }
                }
                Object[] objArr10 = new Object[1];
                c(new char[]{5201, 23041, 50737, 24899}, new char[]{43106, 24273, 44297, 41663}, (char) (49069 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{49053, 28660, 675, 60075, 29594, 61210, 38544, 24670, 31447, 58795, 26761, 17544, 25423, 46663, 62863, 45758}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new char[]{5201, 23041, 50737, 24899}, new char[]{63816, 49842, 49728, 852}, (char) (Color.blue(0) + 21698), ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{9177, 18476, 54057, 1816, 1590, 3996, 60878, 28816, 42317, 8661, 32774, 9948, 21093, 42826, 55203, 15825}, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i18 = b + 89;
                TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                int i19 = i18 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 899829094};
                    byte[] bArr3 = $$d;
                    byte b5 = bArr3[35];
                    byte b6 = b5;
                    Object[] objArr13 = new Object[1];
                    d(b5, b6, (byte) (-b6), objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b7 = (byte) (bArr3[35] - 1);
                    Object[] objArr14 = new Object[1];
                    d(b7, b7, (byte) (-bArr3[14]), objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                            int i20 = 877 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int iRed = 10 - Color.red(0);
                            byte[] bArr4 = $$a;
                            Object[] objArr16 = new Object[1];
                            a(bArr4[54], bArr4[7], (byte) (-bArr4[5]), objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAxisFromString, i20, iRed, 256017550, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            c(new char[]{5201, 23041, 50737, 24899}, new char[]{24050, 53487, 59823, 27991}, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), ViewConfiguration.getKeyRepeatDelay() >> 16, new char[]{36836, 17415, 27478, 21136, 58872, 14391, 59476, 27614, 2659, 16352, 64571, 2812, 56708, 12791, 912, 24888, 11006, 23353, 25799, 64891, 32701, 21202}, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(new char[]{5201, 23041, 50737, 24899}, new char[]{17259, 58625, Typography.lowSingleQuote, 54418}, (char) (37408 - View.resolveSizeAndState(0, 0, 0)), Gravity.getAbsoluteGravity(0, 0) + 451215683, new char[]{56191, 46719, 10048, 51466, 41990, 24959, 6450, 7829, 21607, 18211, 15025, 589, 24883, 13374, 49260}, objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char trimmedLength = (char) TextUtils.getTrimmedLength("");
                                int iLastIndexOf = 875 - TextUtils.lastIndexOf("", '0');
                                int i21 = 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                byte[] bArr5 = $$a;
                                byte b8 = bArr5[7];
                                Object[] objArr19 = new Object[1];
                                a(b8, (byte) (-bArr5[5]), b8, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, iLastIndexOf, i21, 2009631821, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int iLastIndexOf2 = 875 - TextUtils.lastIndexOf("", '0', 0, 0);
                                int iNormalizeMetaState = 10 - KeyEvent.normalizeMetaState(0);
                                byte b9 = (byte) ($$b & 31);
                                byte b10 = (byte) (-$$a[5]);
                                Object[] objArr20 = new Object[1];
                                a(b9, b10, b10, objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(minimumFlingVelocity, iLastIndexOf2, iNormalizeMetaState, 252381699, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr15;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i22 = ((int[]) objArr[2])[0];
            int i23 = ((int[]) objArr[0])[0];
            if (i23 != i22) {
                throw new RuntimeException(String.valueOf(i23));
            }
            int i24 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i25 = ~((-76030690) | iUptimeMillis);
            int i26 = ~iUptimeMillis;
            int i27 = i24 + 1609606132 + ((i25 | (~(921567231 | i26))) * 920) + (((~((-885846772) | i26)) | 76030689) * 920) + (((~(iUptimeMillis | 921567231)) | (~((-76030690) | i26)) | (~((-809816083) | iUptimeMillis))) * 920);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            Object obj = objArr21[1];
            ((int[]) obj)[0] = i29 ^ (i29 << 5);
            int i30 = ((int[]) obj)[0];
            int i31 = ((i30 * i30) - (~(-(420037554 * i30)))) - 1;
            int i32 = -(i30 * 906475278);
            int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
            int i34 = ((i33 | (-1285102592)) << 1) - ((-1285102592) ^ i33);
            int i35 = i34 >> 28;
            int i36 = ((((i35 | (-31)) << 1) - (i35 ^ (-31))) / 16) + 1;
            int i37 = (i34 ^ i36) + ((i36 & i34) << 1);
            int i38 = i34 >> 27;
            int i39 = -(i37 ^ ((((i38 & (-63)) + (i38 | (-63))) / 32) + 1));
            int i40 = (i39 & 7) + (i39 | 7);
            int i41 = ((i40 >> 23) - 1023) / 512;
            int i42 = (i41 ^ 1) + ((i41 & 1) << 1);
            return Intrinsics.areEqual("21|24|7|30|Conscrypt".substring(97944 / (((-((i42 & 1) + (i42 | 1))) & i40) * 1272)), name);
        }

        private final boolean isOpenJSSEPreferred() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 79;
            b = i2 % 128;
            return Intrinsics.areEqual("OpenJSSE", i2 % 2 == 0 ? Security.getProviders()[1].getName() : Security.getProviders()[0].getName());
        }

        private final boolean isBouncyCastlePreferred() {
            int i = 2 % 2;
            int i2 = b + 53;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            boolean zAreEqual = Intrinsics.areEqual("BC", i2 % 2 != 0 ? Security.getProviders()[1].getName() : Security.getProviders()[0].getName());
            int i3 = TuitionPaymentFragmentbindingInflater1 + 83;
            b = i3 % 128;
            int i4 = i3 % 2;
            return zAreEqual;
        }

        private final Platform findPlatform() {
            int i = 2 % 2;
            int i2 = b + 47;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            if (!isAndroid()) {
                Platform platformFindJvmPlatform = findJvmPlatform();
                int i4 = TuitionPaymentFragmentbindingInflater1 + 59;
                b = i4 % 128;
                int i5 = i4 % 2;
                return platformFindJvmPlatform;
            }
            int i6 = b + 3;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            if (i6 % 2 == 0) {
                return findAndroidPlatform();
            }
            findAndroidPlatform();
            throw null;
        }

        private final Platform findAndroidPlatform() {
            int i = 2 % 2;
            int i2 = b + 105;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            AndroidLog.INSTANCE.enable();
            Platform platformBuildIfSupported = Android10Platform.INSTANCE.buildIfSupported();
            if (platformBuildIfSupported == null) {
                platformBuildIfSupported = AndroidPlatform.Companion.buildIfSupported();
                Intrinsics.checkNotNull(platformBuildIfSupported);
                int i4 = TuitionPaymentFragmentbindingInflater1 + 97;
                b = i4 % 128;
                int i5 = i4 % 2;
            }
            int i6 = b + 59;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            if (i6 % 2 == 0) {
                return platformBuildIfSupported;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0026  */
        /* JADX WARN: Code duplicated, block: B:9:0x001e  */
        private final Platform findJvmPlatform() {
            ConscryptPlatform conscryptPlatformBuildIfSupported;
            BouncyCastlePlatform bouncyCastlePlatformBuildIfSupported;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 79;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 1 / 0;
                if (isConscryptPreferred()) {
                    conscryptPlatformBuildIfSupported = ConscryptPlatform.INSTANCE.buildIfSupported();
                    if (conscryptPlatformBuildIfSupported != null) {
                        return conscryptPlatformBuildIfSupported;
                    }
                }
            } else if (isConscryptPreferred()) {
                conscryptPlatformBuildIfSupported = ConscryptPlatform.INSTANCE.buildIfSupported();
                if (conscryptPlatformBuildIfSupported != null) {
                    return conscryptPlatformBuildIfSupported;
                }
            }
            if (isBouncyCastlePreferred() && (bouncyCastlePlatformBuildIfSupported = BouncyCastlePlatform.INSTANCE.buildIfSupported()) != null) {
                return bouncyCastlePlatformBuildIfSupported;
            }
            if (isOpenJSSEPreferred()) {
                int i4 = TuitionPaymentFragmentbindingInflater1 + 71;
                b = i4 % 128;
                int i5 = i4 % 2;
                OpenJSSEPlatform openJSSEPlatformBuildIfSupported = OpenJSSEPlatform.INSTANCE.buildIfSupported();
                if (openJSSEPlatformBuildIfSupported != null) {
                    return openJSSEPlatformBuildIfSupported;
                }
            }
            Jdk9Platform jdk9PlatformBuildIfSupported = Jdk9Platform.INSTANCE.buildIfSupported();
            if (jdk9PlatformBuildIfSupported != null) {
                return jdk9PlatformBuildIfSupported;
            }
            Platform platformBuildIfSupported = Jdk8WithJettyBootPlatform.Companion.buildIfSupported();
            if (platformBuildIfSupported == null) {
                return new Platform();
            }
            int i6 = TuitionPaymentFragmentbindingInflater1 + 19;
            b = i6 % 128;
            int i7 = i6 % 2;
            return platformBuildIfSupported;
        }

        public final byte[] concatLengthPrefixed(List<? extends Protocol> p0) throws EOFException {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
            Iterator<String> it = alpnProtocolNames(p0).iterator();
            int i2 = b + 79;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            while (!(!it.hasNext())) {
                String next = it.next();
                rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(next.length());
                Intrinsics.checkNotNullParameter(next, "");
                rotationProviderListenerWrapper.b(next, 0, next.length());
                int i4 = b + 97;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i5 = i4 % 2;
            }
            byte[] bArrB = rotationProviderListenerWrapper.b(rotationProviderListenerWrapper.size);
            int i6 = TuitionPaymentFragmentbindingInflater1 + 95;
            b = i6 % 128;
            int i7 = i6 % 2;
            return bArrB;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0021  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r6, short r7, short r8) {
            /*
                int r6 = r6 + 102
                int r7 = r7 * 3
                int r7 = 4 - r7
                byte[] r0 = okhttp3.internal.platform.Platform.Companion.$$c
                int r8 = r8 * 2
                int r1 = r8 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r7
                r7 = r8
                r4 = r2
                goto L2a
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r8) goto L21
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L21:
                r4 = r0[r7]
                int r3 = r3 + 1
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2a:
                int r6 = -r6
                int r6 = r6 + r7
                int r7 = r3 + 1
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.Platform.Companion.$$g(int, short, short):java.lang.String");
        }
    }

    public void connectSocket(Socket p0, InetSocketAddress p1, int p2) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        p0.connect(p1, p2);
        int i4 = b + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x016e  */
    /* JADX WARN: Code duplicated, block: B:36:0x016f  */
    private static void f(char[] cArr, boolean z, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        int i6 = $11 + 89;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i) {
                break;
            }
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i2 + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i8 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), View.resolveSize(0, 0) + 3291, 30 - TextUtils.lastIndexOf("", '0', 0, 0), 1199271174, false, $$n(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), Color.argb(0, 0, 0, 0) + 651, 44 - View.MeasureSpec.getMode(0), -450685997, false, $$n(b4, b5, (byte) (-b5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            int i9 = $11 + 53;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 651, 43 - MotionEvent.axisFromString(""), -450685997, false, $$n(b6, b7, (byte) (-b7)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i11 = $11 + 59;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 3 % 5;
                }
                i4 = 29209604;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public static /* synthetic */ void log$default(Platform platform2, String str, int i, Throwable th, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = b + 75;
        int i5 = i4 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5;
        int i6 = i4 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i2 & 2) != 0) {
            int i7 = i5 + 67;
            b = i7 % 128;
            i = i7 % 2 == 0 ? 5 : 4;
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        platform2.log(str, i, th);
    }

    public void log(String p0, int p1, Throwable p2) {
        Level level;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == 5) {
            int i4 = b + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 != 0) {
                Level level2 = Level.WARNING;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        logger.log(level, p0, p2);
        int i5 = b + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 25 / 0;
        }
    }

    public Object getStackTraceForCloseable(String p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        if (logger.isLoggable(Level.FINE)) {
            return new Throwable(p0);
        }
        int i4 = b + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
        return null;
    }

    public void logCloseableLeak(String p0, Object p1) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(p0);
            sb.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            p0 = sb.toString();
        }
        log(p0, 5, (Throwable) p1);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
    }

    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        BasicCertificateChainCleaner basicCertificateChainCleaner = new BasicCertificateChainCleaner(buildTrustRootIndex(p0));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 39 / 0;
        }
        return basicCertificateChainCleaner;
    }

    public TrustRootIndex buildTrustRootIndex(X509TrustManager p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        X509Certificate[] acceptedIssuers = p0.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "");
        BasicTrustRootIndex basicTrustRootIndex = new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        b = i2 % 128;
        int i3 = i2 % 2;
        return basicTrustRootIndex;
    }

    public SSLSocketFactory newSslSocketFactory(X509TrustManager p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            if (accessgetActiveChannelp.b(new ArrayList()) != 0) {
                throw new NullPointerException();
            }
            SSLContext sSLContextNewSSLContext = newSSLContext();
            sSLContextNewSSLContext.init(null, new TrustManager[]{p0}, null);
            SSLSocketFactory socketFactory = sSLContextNewSSLContext.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "");
            int i2 = b + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 21 / 0;
            }
            return socketFactory;
        } catch (GeneralSecurityException e2) {
            throw new AssertionError("No System TLS: ".concat(String.valueOf(e2)), e2);
        }
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = b + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return simpleName;
        }
        throw null;
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 1;
        b();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion companion = new Companion(defaultConstructorMarker);
        INSTANCE = companion;
        platform = Companion.access$findPlatform(companion);
        logger = Logger.getLogger(OkHttpClient.class.getName());
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x025e  */
    public void configureTlsExtensions(SSLSocket p0, String p1, List<Protocol> p2) {
        int length;
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = b + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 31533);
            int i4 = 922 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int jumpTapTimeout = 28 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            e(bArr[7], (byte) 52, bArr[80], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(pressedStateDuration, i4, jumpTapTimeout, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        f(new char[]{17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2}, true, 21 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.indexOf("", "", 0, 0) + 260, 15 - TextUtils.indexOf("", "", 0, 0), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        f(new char[]{'\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f'}, true, 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 264, 3 - ExpandableListView.getPackedPositionChild(0L), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRgb = (char) ((-16745683) - Color.rgb(0, 0, 0));
            int iResolveOpacity = 921 - Drawable.resolveOpacity(0, 0);
            int i5 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 28;
            byte[] bArr2 = $$d;
            byte b2 = bArr2[7];
            Object[] objArr6 = new Object[1];
            e(b2, bArr2[80], b2, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, iResolveOpacity, i5, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mode = (char) (31533 - View.MeasureSpec.getMode(0));
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 921;
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 28;
                byte[] bArr3 = $$d;
                byte b3 = bArr3[80];
                byte b4 = (byte) (-bArr3[33]);
                byte b5 = bArr3[7];
                Object[] objArr7 = new Object[1];
                e(b3, b4, b5, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mode, offsetAfter, packedPositionGroup, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~((-33707777) | iIdentityHashCode);
            int i7 = ~iIdentityHashCode;
            int i8 = ((97688240 + ((i6 | (~((-1082728593) | i7))) * 497)) + (((~(iIdentityHashCode | (-1082728593))) | ((~((-657643276) | i7)) | 623935499)) * 497)) - 896250031;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            f(new char[]{65534, 65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, '\r', '\r'}, true, (ViewConfiguration.getEdgeSlop() >> 16) + 26, ExpandableListView.getPackedPositionGroup(0L) + 260, (KeyEvent.getMaxKeyCode() >> 16) + 9, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            f(new char[]{65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b'}, false, (Process.myTid() >> 22) + 18, 267 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 14 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
                    b = i11 % 128;
                    int i12 = i11 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            if (p1 != null) {
                int i13 = b + 75;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                int i14 = i13 % 2;
                length = p1.length();
                int i15 = b + 31;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                if (i15 % 2 != 0) {
                    int i16 = 5 % 4;
                }
            } else {
                length = 0;
            }
            try {
                Object[] objArr11 = {applicationContext, Integer.valueOf(length), 0, -896250031};
                byte[] bArr4 = $$j;
                byte b6 = bArr4[5];
                Object[] objArr12 = new Object[1];
                g(b6, bArr4[18], b6, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b7 = bArr4[18];
                Object[] objArr13 = new Object[1];
                g(b7, bArr4[5], b7, objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char bitsPerPixel = (char) (31532 - ImageFormat.getBitsPerPixel(0));
                    int defaultSize = 921 - View.getDefaultSize(0, 0);
                    int doubleTapTimeout = 28 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte[] bArr5 = $$d;
                    Object[] objArr14 = new Object[1];
                    e(bArr5[80], (byte) (-bArr5[33]), bArr5[7], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(bitsPerPixel, defaultSize, doubleTapTimeout, -1142834547, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    f(new char[]{17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2}, true, TextUtils.getOffsetBefore("", 0) + 22, 259 - ((byte) KeyEvent.getModifierMetaStateMask()), View.MeasureSpec.makeMeasureSpec(0, 0) + 15, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    f(new char[]{'\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f'}, true, Color.rgb(0, 0, 0) + 16777231, 263 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 5 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char deadChar = (char) (31533 - KeyEvent.getDeadChar(0, 0));
                        int keyRepeatTimeout = 921 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int iResolveOpacity2 = 28 - Drawable.resolveOpacity(0, 0);
                        byte[] bArr6 = $$d;
                        byte b8 = bArr6[7];
                        Object[] objArr17 = new Object[1];
                        e(b8, bArr6[80], b8, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(deadChar, keyRepeatTimeout, iResolveOpacity2, -778300370, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char bitsPerPixel2 = (char) (31532 - ImageFormat.getBitsPerPixel(0));
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 921;
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 28;
                        byte[] bArr7 = $$d;
                        byte b9 = bArr7[80];
                        Object[] objArr18 = new Object[1];
                        e(bArr7[7], (byte) 52, b9, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(bitsPerPixel2, minimumFlingVelocity, iResolveSizeAndState, -1048449946, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i17 = ((int[]) objArr[1])[0];
        int i18 = ((int[]) objArr[3])[0];
        if (i18 == i17) {
            int i19 = b + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
            int i20 = i19 % 2;
            int i21 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i22 = 1538539001 + ((iFreeMemory | 970583761) * (-50));
            int i23 = ~((-700468929) | iFreeMemory);
            int i24 = ~iFreeMemory;
            int i25 = i21 + i22 + ((i23 | (~((-103026955) | i24))) * 50) + (((~(i24 | 970583761)) | (~((-803495883) | i24)) | 103026954) * 50);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr2[0])[0] = i27 ^ (i27 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i28 = b + 35;
                int i29 = i28 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i29;
                int i30 = i29 + 39;
                b = i30 % 128;
                int i31 = i30 % 2;
                for (int i32 = i28 % 2 != 0 ? 1 : 0; i32 < strArr.length; i32++) {
                    arrayList.add(strArr[i32]);
                }
            }
            int[] iArr = new int[i18];
            int i33 = i18 - 1;
            iArr[i33] = 1;
            Toast.makeText((Context) null, iArr[((i18 * i33) % 2) - 1], 1).show();
            int i34 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i35 = ~iIdentityHashCode2;
            int i36 = i34 + 1716306577 + (((~((-777495272) | i35)) | (~(iIdentityHashCode2 | 996584372))) * 333) + (((~(iIdentityHashCode2 | (-777495272))) | (~(i35 | 996584372))) * 333);
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArr2[0])[0] = i38 ^ (i38 << 5);
        }
        Intrinsics.checkNotNullParameter(p0, "sslSocket");
        int i39 = ((int[]) objArr2[0])[0];
        int i40 = i39 * i39;
        int i41 = -(1187497606 * i39);
        int i42 = (i40 ^ i41) + ((i40 & i41) << 1);
        int i43 = -(i39 * 329550368);
        int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
        int i45 = ((i44 | 928910057) << 1) - (928910057 ^ i44);
        int i46 = ((i45 >> 27) - 63) / 32;
        int i47 = (i46 & 1) + (i46 | 1);
        int i48 = (-((((i45 | i47) << 1) - (i47 ^ i45)) ^ ((((i45 >> 18) - 32767) / 16384) + 1))) + 5;
        int i49 = i48 >> 27;
        int i50 = (((i49 | (-63)) << 1) - (i49 ^ (-63))) / 32;
        int i51 = (i50 & 1) + (i50 | 1);
        Intrinsics.checkNotNullParameter(p2, "24|protocols".substring(15345 / ((i48 & (-((i51 ^ 1) + ((i51 & 1) << 1)))) * 1023)));
    }

    @JvmStatic
    public static final Platform get() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        b = i2 % 128;
        int i3 = i2 % 2;
        Platform platform2 = INSTANCE.get();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return platform2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void afterHandshake(SSLSocket p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        int i4 = b + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getSelectedProtocol(SSLSocket p0) {
        int i = 2 % 2;
        int i2 = b + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
        return null;
    }

    public boolean isCleartextTrafficPermitted(String p0) {
        int i = 2 % 2;
        int i2 = b + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        return i3 == 0;
    }

    static void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722301;
    }

    private static String $$n(byte b2, byte b3, int i) {
        int i2 = b3 + 4;
        int i3 = b2 * 3;
        int i4 = 120 - i;
        byte[] bArr = $$l;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 += -i3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i4;
            i2++;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            i4 += -bArr[i2];
        }
    }
}
