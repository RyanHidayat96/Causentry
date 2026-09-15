package okhttp3.tls.internal.der;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u0006"}, d2 = {"Lokhttp3/tls/internal/der/ObjectIdentifiers;", "", "<init>", "()V", "", "basicConstraints", "Ljava/lang/String;", "commonName", "ecPublicKey", "organizationalUnitName", "rsaEncryption", "sha256WithRSAEncryption", "sha256withEcdsa", "subjectAlternativeName"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ObjectIdentifiers {
    public static final ObjectIdentifiers INSTANCE = new ObjectIdentifiers();
    public static final String basicConstraints = "2.5.29.19";
    public static final String commonName = "2.5.4.3";
    public static final String ecPublicKey = "1.2.840.10045.2.1";
    public static final String organizationalUnitName = "2.5.4.11";
    public static final String rsaEncryption = "1.2.840.113549.1.1.1";
    public static final String sha256WithRSAEncryption = "1.2.840.113549.1.1.11";
    public static final String sha256withEcdsa = "1.2.840.10045.4.3.2";
    public static final String subjectAlternativeName = "2.5.29.17";

    private ObjectIdentifiers() {
    }
}
