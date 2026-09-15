package defpackage;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes5.dex */
public final class SurfaceRequestResult implements X509TrustManager {
    private X509TrustManager TuitionPaymentFragmentbindingInflater1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private X509Certificate[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private X509TrustManager b;

    public SurfaceRequestResult(KeyStore keyStore, boolean z) throws NoSuchAlgorithmException, KeyStoreException {
        this.TuitionPaymentFragmentbindingInflater1 = null;
        this.b = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
        ArrayList arrayList = new ArrayList();
        SurfaceRequest4 surfaceRequest4 = new SurfaceRequest4(null);
        this.b = surfaceRequest4;
        for (X509Certificate x509Certificate : surfaceRequest4.getAcceptedIssuers()) {
            arrayList.add(x509Certificate);
        }
        if (keyStore != null) {
            SurfaceRequest4 surfaceRequest5 = new SurfaceRequest4(keyStore);
            this.TuitionPaymentFragmentbindingInflater1 = surfaceRequest5;
            for (X509Certificate x509Certificate2 : surfaceRequest5.getAcceptedIssuers()) {
                arrayList.add(x509Certificate2);
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        b(x509CertificateArr, str, false);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        b(x509CertificateArr, str, true);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private void b(X509Certificate[] x509CertificateArr, String str, boolean z) throws CertificateException {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return;
        }
        if (z) {
            try {
                this.b.checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e2) {
                X509TrustManager x509TrustManager = this.TuitionPaymentFragmentbindingInflater1;
                if (x509TrustManager == null) {
                    throw e2;
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                return;
            }
        }
        try {
            this.b.checkClientTrusted(x509CertificateArr, str);
        } catch (CertificateException e3) {
            X509TrustManager x509TrustManager2 = this.TuitionPaymentFragmentbindingInflater1;
            if (x509TrustManager2 == null) {
                throw e3;
            }
            x509TrustManager2.checkClientTrusted(x509CertificateArr, str);
        }
    }
}
