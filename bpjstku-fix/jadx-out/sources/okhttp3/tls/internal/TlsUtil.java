package okhttp3.tls.internal;

import androidx.autofill.HintConstants;
import java.io.IOException;
import java.net.InetAddress;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.Platform;
import okhttp3.tls.HandshakeCertificates;
import okhttp3.tls.HeldCertificate;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0019\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0012\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u0016\u001a\u00020\u00152\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0005\u001a\u00020\u00048CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0006R\u001a\u0010\u001c\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lokhttp3/tls/internal/TlsUtil;", "", "<init>", "()V", "Lokhttp3/tls/HandshakeCertificates;", "localhost", "()Lokhttp3/tls/HandshakeCertificates;", "", "p0", "Ljava/security/KeyStore;", "newEmptyKeyStore", "(Ljava/lang/String;)Ljava/security/KeyStore;", "Lokhttp3/tls/HeldCertificate;", "p1", "", "Ljava/security/cert/X509Certificate;", "p2", "Ljavax/net/ssl/X509KeyManager;", "newKeyManager", "(Ljava/lang/String;Lokhttp3/tls/HeldCertificate;[Ljava/security/cert/X509Certificate;)Ljavax/net/ssl/X509KeyManager;", "", "Ljavax/net/ssl/X509TrustManager;", "newTrustManager", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljavax/net/ssl/X509TrustManager;", "localhost$delegate", "Lkotlin/Lazy;", "getLocalhost", "", HintConstants.AUTOFILL_HINT_PASSWORD, "[C", "getPassword", "()[C"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TlsUtil {
    public static final TlsUtil INSTANCE = new TlsUtil();

    /* JADX INFO: renamed from: localhost$delegate, reason: from kotlin metadata */
    private static final Lazy localhost;
    private static final char[] password;

    private TlsUtil() {
    }

    static {
        char[] charArray = HintConstants.AUTOFILL_HINT_PASSWORD.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "");
        password = charArray;
        localhost = LazyKt.lazy(new Function0<HandshakeCertificates>() { // from class: okhttp3.tls.internal.TlsUtil.localhost.2
            @Override // kotlin.jvm.functions.Function0
            public final HandshakeCertificates invoke() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
                HeldCertificate.Builder builderCommonName = new HeldCertificate.Builder().commonName("localhost");
                String canonicalHostName = InetAddress.getByName("localhost").getCanonicalHostName();
                Intrinsics.checkNotNullExpressionValue(canonicalHostName, "");
                HeldCertificate heldCertificateBuild = builderCommonName.addSubjectAlternativeName(canonicalHostName).build();
                return new HandshakeCertificates.Builder().heldCertificate(heldCertificateBuild, new X509Certificate[0]).addTrustedCertificate(heldCertificateBuild.certificate()).build();
            }
        });
    }

    public final char[] getPassword() {
        return password;
    }

    private final HandshakeCertificates getLocalhost() {
        return (HandshakeCertificates) localhost.getValue();
    }

    @JvmStatic
    public static final HandshakeCertificates localhost() {
        return INSTANCE.getLocalhost();
    }

    @JvmStatic
    public static final X509TrustManager newTrustManager(String p0, List<? extends X509Certificate> p1, List<String> p2) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        KeyStore keyStoreNewEmptyKeyStore = INSTANCE.newEmptyKeyStore(p0);
        int size = p1.size();
        for (int i = 0; i < size; i++) {
            keyStoreNewEmptyKeyStore.setCertificateEntry(Intrinsics.stringPlus("cert_", Integer.valueOf(i)), p1.get(i));
        }
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStoreNewEmptyKeyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager != null) {
                    X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                    if (p2.isEmpty()) {
                        return x509TrustManager;
                    }
                    return Platform.INSTANCE.isAndroid() ? new InsecureAndroidTrustManager(x509TrustManager, p2) : new InsecureExtendedTrustManager((X509ExtendedTrustManager) x509TrustManager, p2);
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
        }
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "");
        throw new IllegalStateException(Intrinsics.stringPlus("Unexpected trust managers: ", string).toString());
    }

    @JvmStatic
    public static final X509KeyManager newKeyManager(String p0, HeldCertificate p1, X509Certificate... p2) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException {
        Intrinsics.checkNotNullParameter(p2, "");
        KeyStore keyStoreNewEmptyKeyStore = INSTANCE.newEmptyKeyStore(p0);
        if (p1 != null) {
            Certificate[] certificateArr = new Certificate[p2.length + 1];
            certificateArr[0] = p1.certificate();
            ArraysKt.copyInto$default(p2, certificateArr, 1, 0, 0, 12, (Object) null);
            keyStoreNewEmptyKeyStore.setKeyEntry("private", p1.keyPair().getPrivate(), password, certificateArr);
        }
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        keyManagerFactory.init(keyStoreNewEmptyKeyStore, password);
        KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
        Intrinsics.checkNotNull(keyManagers);
        if (keyManagers.length == 1) {
            KeyManager keyManager = keyManagers[0];
            if (keyManager instanceof X509KeyManager) {
                if (keyManager != null) {
                    return (X509KeyManager) keyManager;
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509KeyManager");
            }
        }
        String string = Arrays.toString(keyManagers);
        Intrinsics.checkNotNullExpressionValue(string, "");
        throw new IllegalStateException(Intrinsics.stringPlus("Unexpected key managers:", string).toString());
    }

    private final KeyStore newEmptyKeyStore(String p0) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        if (p0 == null) {
            p0 = KeyStore.getDefaultType();
        }
        KeyStore keyStore = KeyStore.getInstance(p0);
        keyStore.load(null, INSTANCE.getPassword());
        Intrinsics.checkNotNullExpressionValue(keyStore, "");
        return keyStore;
    }
}
