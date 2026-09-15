package okhttp3.tls.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\u00020\n2\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\n2\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\r\u0010\fJ5\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lokhttp3/tls/internal/InsecureAndroidTrustManager;", "Ljavax/net/ssl/X509TrustManager;", "p0", "", "", "p1", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/util/List;)V", "", "Ljava/security/cert/X509Certificate;", "", "checkClientTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)Ljava/lang/Void;", "checkServerTrusted", "p2", "Ljava/security/cert/Certificate;", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "Ljava/lang/reflect/Method;", "checkServerTrustedMethod", "Ljava/lang/reflect/Method;", "delegate", "Ljavax/net/ssl/X509TrustManager;", "insecureHosts", "Ljava/util/List;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class InsecureAndroidTrustManager implements X509TrustManager {
    private final Method checkServerTrustedMethod;
    private final X509TrustManager delegate;
    private final List<String> insecureHosts;

    public InsecureAndroidTrustManager(X509TrustManager x509TrustManager, List<String> list) {
        Method method;
        Intrinsics.checkNotNullParameter(x509TrustManager, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.delegate = x509TrustManager;
        this.insecureHosts = list;
        try {
            method = x509TrustManager.getClass().getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class);
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        this.checkServerTrustedMethod = method;
    }

    public final List<Certificate> checkServerTrusted(X509Certificate[] p0, String p1, String p2) throws Throwable {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        if (this.insecureHosts.contains(p2)) {
            return CollectionsKt.emptyList();
        }
        try {
            Method method = this.checkServerTrustedMethod;
            if (method == null) {
                throw new CertificateException("Failed to call checkServerTrusted");
            }
            Object objInvoke = method.invoke(this.delegate, p0, p1, p2);
            if (objInvoke != null) {
                return (List) objInvoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<java.security.cert.Certificate>");
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            Intrinsics.checkNotNullExpressionValue(targetException, "");
            throw targetException;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] acceptedIssuers = this.delegate.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "");
        return acceptedIssuers;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final Void checkClientTrusted(X509Certificate[] p0, String p1) throws CertificateException {
        Intrinsics.checkNotNullParameter(p0, "");
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final Void checkServerTrusted(X509Certificate[] p0, String p1) throws CertificateException {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        throw new CertificateException("Unsupported operation");
    }
}
