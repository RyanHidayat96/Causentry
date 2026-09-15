package defpackage;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes5.dex */
public final class SurfaceRequest4 implements X509TrustManager {
    private X509Certificate[] TuitionPaymentFragmentbindingInflater1;
    private X509TrustManager TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public SurfaceRequest4(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        X509TrustManager x509TrustManager = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        this.TuitionPaymentFragmentbindingInflater1 = null;
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        for (TrustManager trustManager : trustManagers) {
            if (trustManager instanceof X509TrustManager) {
                x509TrustManager = (X509TrustManager) trustManager;
                break;
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = x509TrustManager;
        if (x509TrustManager == null) {
            throw new NoSuchAlgorithmException("no trust manager found");
        }
        this.TuitionPaymentFragmentbindingInflater1 = x509TrustManager.getAcceptedIssuers();
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        X509Certificate x509Certificate;
        if (x509CertificateArr != null && x509CertificateArr.length == 1 && (x509Certificate = x509CertificateArr[0]) != null) {
            x509Certificate.checkValidity();
            X509Certificate[] acceptedIssuers = getAcceptedIssuers();
            if (acceptedIssuers != null) {
                for (X509Certificate x509Certificate2 : acceptedIssuers) {
                    if (x509CertificateArr[0].equals(x509Certificate2)) {
                        return;
                    }
                }
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.checkServerTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }
}
