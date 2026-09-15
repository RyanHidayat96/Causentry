package defpackage;

import android.util.Base64;
import com.bpjstku.di.ApiModuleKt;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LlambdasetOnImageAvailableListener1androidxcameracoreAndroidImageReaderProxy;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Ljava/security/KeyStore;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()Ljava/security/KeyStore;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lambdasetOnImageAvailableListener1androidxcameracoreAndroidImageReaderProxy {
    public static final lambdasetOnImageAvailableListener1androidxcameracoreAndroidImageReaderProxy INSTANCE = new lambdasetOnImageAvailableListener1androidxcameracoreAndroidImageReaderProxy();

    private lambdasetOnImageAvailableListener1androidxcameracoreAndroidImageReaderProxy() {
    }

    public static KeyStore TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        byte[] bArrDecode = Base64.decode(ApiModuleKt.getCertificatePublicKey(), 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
        byte[] bytes = new String(bArrDecode, Charsets.UTF_8).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        keyStore.setCertificateEntry("ca", certificateFactory != null ? certificateFactory.generateCertificate(new ByteArrayInputStream(bytes)) : null);
        Intrinsics.checkNotNull(keyStore);
        return keyStore;
    }
}
