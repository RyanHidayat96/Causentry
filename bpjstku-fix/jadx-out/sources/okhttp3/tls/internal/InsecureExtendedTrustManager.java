package okhttp3.tls.internal;

import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\r\u001a\u00020\f2\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\r\u001a\u00020\f2\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u000fH\u0017¢\u0006\u0004\b\r\u0010\u0010J)\u0010\r\u001a\u00020\f2\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\r\u0010\u0011J'\u0010\u0012\u001a\u00020\f2\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0012\u0010\u0011J/\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0014J/\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0015J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lokhttp3/tls/internal/InsecureExtendedTrustManager;", "Ljavax/net/ssl/X509ExtendedTrustManager;", "p0", "", "", "p1", "<init>", "(Ljavax/net/ssl/X509ExtendedTrustManager;Ljava/util/List;)V", "", "Ljava/security/cert/X509Certificate;", "Ljava/net/Socket;", "p2", "", "checkClientTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/net/Socket;)Ljava/lang/Void;", "Ljavax/net/ssl/SSLEngine;", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLEngine;)Ljava/lang/Void;", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)Ljava/lang/Void;", "checkServerTrusted", "", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/net/Socket;)V", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLEngine;)V", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "delegate", "Ljavax/net/ssl/X509ExtendedTrustManager;", "insecureHosts", "Ljava/util/List;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class InsecureExtendedTrustManager extends X509ExtendedTrustManager {
    private final X509ExtendedTrustManager delegate;
    private final List<String> insecureHosts;

    public InsecureExtendedTrustManager(X509ExtendedTrustManager x509ExtendedTrustManager, List<String> list) {
        Intrinsics.checkNotNullParameter(x509ExtendedTrustManager, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.delegate = x509ExtendedTrustManager;
        this.insecureHosts = list;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] acceptedIssuers = this.delegate.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "");
        return acceptedIssuers;
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] p0, String p1, Socket p2) throws CertificateException {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        if (this.insecureHosts.contains(Util.peerName(p2))) {
            return;
        }
        this.delegate.checkServerTrusted(p0, p1, p2);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] p0, String p1, SSLEngine p2) throws CertificateException {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        if (this.insecureHosts.contains(p2.getPeerHost())) {
            return;
        }
        this.delegate.checkServerTrusted(p0, p1, p2);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final Void checkServerTrusted(X509Certificate[] p0, String p1) throws CertificateException {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final Void checkClientTrusted(X509Certificate[] p0, String p1) throws CertificateException {
        Intrinsics.checkNotNullParameter(p0, "");
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final Void checkClientTrusted(X509Certificate[] p0, String p1, SSLEngine p2) throws CertificateException {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final Void checkClientTrusted(X509Certificate[] p0, String p1, Socket p2) throws CertificateException {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        throw new CertificateException("Unsupported operation");
    }
}
