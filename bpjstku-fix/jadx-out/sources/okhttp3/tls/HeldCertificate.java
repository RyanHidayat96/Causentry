package okhttp3.tls;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.math.BigInteger;
import java.net.InetAddress;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import okhttp3.internal.Util;
import okhttp3.tls.internal.der.AlgorithmIdentifier;
import okhttp3.tls.internal.der.AttributeTypeAndValue;
import okhttp3.tls.internal.der.BasicConstraints;
import okhttp3.tls.internal.der.BasicDerAdapter;
import okhttp3.tls.internal.der.BitString;
import okhttp3.tls.internal.der.Certificate;
import okhttp3.tls.internal.der.CertificateAdapters;
import okhttp3.tls.internal.der.Extension;
import okhttp3.tls.internal.der.ObjectIdentifiers;
import okhttp3.tls.internal.der.PrivateKeyInfo;
import okhttp3.tls.internal.der.SubjectPublicKeyInfo;
import okhttp3.tls.internal.der.TbsCertificate;
import okhttp3.tls.internal.der.Validity;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0013\u0010\fR\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000e"}, d2 = {"Lokhttp3/tls/HeldCertificate;", "", "Ljava/security/KeyPair;", "p0", "Ljava/security/cert/X509Certificate;", "p1", "<init>", "(Ljava/security/KeyPair;Ljava/security/cert/X509Certificate;)V", "-deprecated_certificate", "()Ljava/security/cert/X509Certificate;", "", "certificatePem", "()Ljava/lang/String;", "-deprecated_keyPair", "()Ljava/security/KeyPair;", "Lokio/ByteString;", "pkcs1Bytes", "()Lokio/ByteString;", "privateKeyPkcs1Pem", "privateKeyPkcs8Pem", "certificate", "Ljava/security/cert/X509Certificate;", "keyPair", "Ljava/security/KeyPair;", "Companion", "Builder"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HeldCertificate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Regex PEM_REGEX = new Regex("-----BEGIN ([!-,.-~ ]*)-----([^-]*)-----END \\1-----");
    private final X509Certificate certificate;
    private final KeyPair keyPair;

    public HeldCertificate(KeyPair keyPair, X509Certificate x509Certificate) {
        Intrinsics.checkNotNullParameter(keyPair, "");
        Intrinsics.checkNotNullParameter(x509Certificate, "");
        this.keyPair = keyPair;
        this.certificate = x509Certificate;
    }

    public final KeyPair keyPair() {
        return this.keyPair;
    }

    public final X509Certificate certificate() {
        return this.certificate;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "certificate", imports = {}))
    /* JADX INFO: renamed from: -deprecated_certificate, reason: not valid java name and from getter */
    public final X509Certificate getCertificate() {
        return this.certificate;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "keyPair", imports = {}))
    /* JADX INFO: renamed from: -deprecated_keyPair, reason: not valid java name and from getter */
    public final KeyPair getKeyPair() {
        return this.keyPair;
    }

    public final String certificatePem() {
        return Certificates.certificatePem(this.certificate);
    }

    public final String privateKeyPkcs8Pem() {
        StringBuilder sb = new StringBuilder();
        sb.append("-----BEGIN PRIVATE KEY-----\n");
        ByteString.Companion companion = ByteString.INSTANCE;
        byte[] encoded = keyPair().getPrivate().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "");
        Certificates.encodeBase64Lines(sb, ByteString.Companion.b(encoded));
        sb.append("-----END PRIVATE KEY-----\n");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final String privateKeyPkcs1Pem() {
        if (!(this.keyPair.getPrivate() instanceof RSAPrivateKey)) {
            throw new IllegalStateException("PKCS1 only supports RSA keys".toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("-----BEGIN RSA PRIVATE KEY-----\n");
        Certificates.encodeBase64Lines(sb, pkcs1Bytes());
        sb.append("-----END RSA PRIVATE KEY-----\n");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private final ByteString pkcs1Bytes() {
        BasicDerAdapter<PrivateKeyInfo> privateKeyInfo$okhttp_tls = CertificateAdapters.INSTANCE.getPrivateKeyInfo$okhttp_tls();
        ByteString.Companion companion = ByteString.INSTANCE;
        byte[] encoded = this.keyPair.getPrivate().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "");
        return privateKeyInfo$okhttp_tls.fromDer(ByteString.Companion.b(encoded)).getPrivateKey();
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 B2\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0007J\u001f\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020 H\u0007¢\u0006\u0004\b\u001d\u0010!J\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\"\u0010\u0007J\u000f\u0010#\u001a\u00020\u0000H\u0007¢\u0006\u0004\b#\u0010\u0015J\u0017\u0010%\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020$H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010%\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000fH\u0007¢\u0006\u0004\b%\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u001aH\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b+\u0010,J\u001b\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0-H\u0002¢\u0006\u0004\b/\u0010\u0019J\u000f\u00101\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0007¢\u0006\u0004\b3\u00104R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u00109R\u0016\u0010:\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u0016\u0010=\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u0010>R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u00107R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010@R\u0018\u0010+\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010A"}, d2 = {"Lokhttp3/tls/HeldCertificate$Builder;", "", "<init>", "()V", "", "p0", "addSubjectAlternativeName", "(Ljava/lang/String;)Lokhttp3/tls/HeldCertificate$Builder;", "Lokhttp3/tls/HeldCertificate;", "build", "()Lokhttp3/tls/HeldCertificate;", "", "certificateAuthority", "(I)Lokhttp3/tls/HeldCertificate$Builder;", "commonName", "", "Ljava/util/concurrent/TimeUnit;", "p1", TypedValues.TransitionType.S_DURATION, "(JLjava/util/concurrent/TimeUnit;)Lokhttp3/tls/HeldCertificate$Builder;", "ecdsa256", "()Lokhttp3/tls/HeldCertificate$Builder;", "", "Lokhttp3/tls/internal/der/Extension;", "extensions", "()Ljava/util/List;", "Ljava/security/KeyPair;", "generateKeyPair", "()Ljava/security/KeyPair;", "keyPair", "(Ljava/security/KeyPair;)Lokhttp3/tls/HeldCertificate$Builder;", "Ljava/security/PublicKey;", "Ljava/security/PrivateKey;", "(Ljava/security/PublicKey;Ljava/security/PrivateKey;)Lokhttp3/tls/HeldCertificate$Builder;", "organizationalUnit", "rsa2048", "Ljava/math/BigInteger;", "serialNumber", "(Ljava/math/BigInteger;)Lokhttp3/tls/HeldCertificate$Builder;", "(J)Lokhttp3/tls/HeldCertificate$Builder;", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "signatureAlgorithm", "(Ljava/security/KeyPair;)Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "signedBy", "(Lokhttp3/tls/HeldCertificate;)Lokhttp3/tls/HeldCertificate$Builder;", "", "Lokhttp3/tls/internal/der/AttributeTypeAndValue;", "subject", "Lokhttp3/tls/internal/der/Validity;", "validity", "()Lokhttp3/tls/internal/der/Validity;", "validityInterval", "(JJ)Lokhttp3/tls/HeldCertificate$Builder;", "altNames", "Ljava/util/List;", "Ljava/lang/String;", "keyAlgorithm", "Ljava/security/KeyPair;", "keySize", "I", "maxIntermediateCas", "notAfter", "J", "notBefore", "Ljava/math/BigInteger;", "Lokhttp3/tls/HeldCertificate;", "Companion"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {
        private static final long DEFAULT_DURATION_MILLIS = 86400000;
        private String commonName;
        private String keyAlgorithm;
        private KeyPair keyPair;
        private int keySize;
        private String organizationalUnit;
        private BigInteger serialNumber;
        private HeldCertificate signedBy;
        private long notBefore = -1;
        private long notAfter = -1;
        private final List<String> altNames = new ArrayList();
        private int maxIntermediateCas = -1;

        public Builder() {
            ecdsa256();
        }

        public final Builder validityInterval(long p0, long p1) {
            if (p0 <= p1) {
                if ((p0 == -1) == (p1 == -1)) {
                    this.notBefore = p0;
                    this.notAfter = p1;
                    return this;
                }
            }
            StringBuilder sb = new StringBuilder("invalid interval: ");
            sb.append(p0);
            sb.append("..");
            sb.append(p1);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public final Builder duration(long p0, TimeUnit p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            long jCurrentTimeMillis = System.currentTimeMillis();
            validityInterval(jCurrentTimeMillis, p1.toMillis(p0) + jCurrentTimeMillis);
            return this;
        }

        public final Builder addSubjectAlternativeName(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.altNames.add(p0);
            return this;
        }

        public final Builder commonName(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.commonName = p0;
            return this;
        }

        public final Builder organizationalUnit(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.organizationalUnit = p0;
            return this;
        }

        public final Builder serialNumber(BigInteger p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.serialNumber = p0;
            return this;
        }

        public final Builder serialNumber(long p0) {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(p0);
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
            serialNumber(bigIntegerValueOf);
            return this;
        }

        public final Builder keyPair(KeyPair p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.keyPair = p0;
            return this;
        }

        public final Builder keyPair(PublicKey p0, PrivateKey p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            keyPair(new KeyPair(p0, p1));
            return this;
        }

        public final Builder signedBy(HeldCertificate p0) {
            this.signedBy = p0;
            return this;
        }

        public final Builder certificateAuthority(int p0) {
            if (p0 < 0) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("maxIntermediateCas < 0: ", Integer.valueOf(p0)).toString());
            }
            this.maxIntermediateCas = p0;
            return this;
        }

        public final Builder ecdsa256() {
            this.keyAlgorithm = "EC";
            this.keySize = 256;
            return this;
        }

        public final Builder rsa2048() {
            this.keyAlgorithm = "RSA";
            this.keySize = 2048;
            return this;
        }

        public final HeldCertificate build() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
            KeyPair keyPair;
            List<List<AttributeTypeAndValue>> listFromDer;
            KeyPair keyPairGenerateKeyPair = this.keyPair;
            if (keyPairGenerateKeyPair == null) {
                keyPairGenerateKeyPair = generateKeyPair();
            }
            BasicDerAdapter<SubjectPublicKeyInfo> subjectPublicKeyInfo$okhttp_tls = CertificateAdapters.INSTANCE.getSubjectPublicKeyInfo$okhttp_tls();
            ByteString.Companion companion = ByteString.INSTANCE;
            byte[] encoded = keyPairGenerateKeyPair.getPublic().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "");
            SubjectPublicKeyInfo subjectPublicKeyInfoFromDer = subjectPublicKeyInfo$okhttp_tls.fromDer(ByteString.Companion.b(encoded));
            List<List<AttributeTypeAndValue>> listSubject = subject();
            HeldCertificate heldCertificate = this.signedBy;
            if (heldCertificate != null) {
                Intrinsics.checkNotNull(heldCertificate);
                keyPair = heldCertificate.keyPair();
                BasicDerAdapter<List<List<AttributeTypeAndValue>>> rdnSequence$okhttp_tls = CertificateAdapters.INSTANCE.getRdnSequence$okhttp_tls();
                ByteString.Companion companion2 = ByteString.INSTANCE;
                HeldCertificate heldCertificate2 = this.signedBy;
                Intrinsics.checkNotNull(heldCertificate2);
                byte[] encoded2 = heldCertificate2.certificate().getSubjectX500Principal().getEncoded();
                Intrinsics.checkNotNullExpressionValue(encoded2, "");
                listFromDer = rdnSequence$okhttp_tls.fromDer(ByteString.Companion.b(encoded2));
            } else {
                keyPair = keyPairGenerateKeyPair;
                listFromDer = listSubject;
            }
            AlgorithmIdentifier algorithmIdentifierSignatureAlgorithm = signatureAlgorithm(keyPair);
            BigInteger bigInteger = this.serialNumber;
            if (bigInteger == null) {
                bigInteger = BigInteger.ONE;
            }
            BigInteger bigInteger2 = bigInteger;
            Intrinsics.checkNotNullExpressionValue(bigInteger2, "");
            TbsCertificate tbsCertificate = new TbsCertificate(2L, bigInteger2, algorithmIdentifierSignatureAlgorithm, listFromDer, validity(), listSubject, subjectPublicKeyInfoFromDer, null, null, extensions());
            Signature signature = Signature.getInstance(tbsCertificate.getSignatureAlgorithmName());
            signature.initSign(keyPair.getPrivate());
            signature.update(CertificateAdapters.INSTANCE.getTbsCertificate$okhttp_tls().toDer(tbsCertificate).asBinder());
            ByteString.Companion companion3 = ByteString.INSTANCE;
            byte[] bArrSign = signature.sign();
            Intrinsics.checkNotNullExpressionValue(bArrSign, "");
            return new HeldCertificate(keyPairGenerateKeyPair, new Certificate(tbsCertificate, algorithmIdentifierSignatureAlgorithm, new BitString(ByteString.Companion.b(bArrSign), 0)).toX509Certificate());
        }

        private final List<List<AttributeTypeAndValue>> subject() {
            ArrayList arrayList = new ArrayList();
            String str = this.organizationalUnit;
            if (str != null) {
                arrayList.add(CollectionsKt.listOf(new AttributeTypeAndValue(ObjectIdentifiers.organizationalUnitName, str)));
            }
            ArrayList arrayList2 = arrayList;
            String string = this.commonName;
            if (string == null) {
                string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
            }
            arrayList2.add(CollectionsKt.listOf(new AttributeTypeAndValue(ObjectIdentifiers.commonName, string)));
            return arrayList;
        }

        private final Validity validity() {
            long jCurrentTimeMillis = this.notBefore;
            if (jCurrentTimeMillis == -1) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            long j = this.notAfter;
            if (j == -1) {
                j = jCurrentTimeMillis + 86400000;
            }
            return new Validity(jCurrentTimeMillis, j);
        }

        private final List<Extension> extensions() {
            Pair pair;
            ArrayList arrayList = new ArrayList();
            int i = this.maxIntermediateCas;
            if (i != -1) {
                arrayList.add(new Extension(ObjectIdentifiers.basicConstraints, true, new BasicConstraints(true, Long.valueOf(i))));
            }
            if (!this.altNames.isEmpty()) {
                List<String> list = this.altNames;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (String str : list) {
                    if (Util.canParseAsIpAddress(str)) {
                        BasicDerAdapter<ByteString> generalNameIpAddress$okhttp_tls = CertificateAdapters.INSTANCE.getGeneralNameIpAddress$okhttp_tls();
                        ByteString.Companion companion = ByteString.INSTANCE;
                        byte[] address = InetAddress.getByName(str).getAddress();
                        Intrinsics.checkNotNullExpressionValue(address, "");
                        pair = TuplesKt.to(generalNameIpAddress$okhttp_tls, ByteString.Companion.b(address));
                    } else {
                        pair = TuplesKt.to(CertificateAdapters.INSTANCE.getGeneralNameDnsName$okhttp_tls(), str);
                    }
                    arrayList2.add(pair);
                }
                arrayList.add(new Extension(ObjectIdentifiers.subjectAlternativeName, true, arrayList2));
            }
            return arrayList;
        }

        private final AlgorithmIdentifier signatureAlgorithm(KeyPair p0) {
            return p0.getPrivate() instanceof RSAPrivateKey ? new AlgorithmIdentifier(ObjectIdentifiers.sha256WithRSAEncryption, null) : new AlgorithmIdentifier(ObjectIdentifiers.sha256withEcdsa, ByteString.EMPTY);
        }

        private final KeyPair generateKeyPair() throws NoSuchAlgorithmException {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(this.keyAlgorithm);
            keyPairGenerator.initialize(this.keySize, new SecureRandom());
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            Intrinsics.checkNotNullExpressionValue(keyPairGenerateKeyPair, "");
            return keyPairGenerateKeyPair;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lokhttp3/tls/HeldCertificate$Companion;", "", "<init>", "()V", "", "p0", "Lokhttp3/tls/HeldCertificate;", "decode", "(Ljava/lang/String;)Lokhttp3/tls/HeldCertificate;", "p1", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/tls/HeldCertificate;", "Lokio/ByteString;", "Ljava/security/PrivateKey;", "decodePkcs8", "(Lokio/ByteString;Ljava/lang/String;)Ljava/security/PrivateKey;", "Lkotlin/text/Regex;", "PEM_REGEX", "Lkotlin/text/Regex;"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public static int b;

        private Companion() {
        }

        @JvmStatic
        public final HeldCertificate decode(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            String value = null;
            String value2 = null;
            for (MatchResult matchResult : Regex.findAll$default(HeldCertificate.PEM_REGEX, p0, 0, 2, null)) {
                MatchGroup matchGroup = matchResult.getGroups().get(1);
                Intrinsics.checkNotNull(matchGroup);
                String value3 = matchGroup.getValue();
                if (Intrinsics.areEqual(value3, "CERTIFICATE")) {
                    if (value != null) {
                        throw new IllegalArgumentException("string includes multiple certificates".toString());
                    }
                    MatchGroup matchGroup2 = matchResult.getGroups().get(0);
                    Intrinsics.checkNotNull(matchGroup2);
                    value = matchGroup2.getValue();
                } else {
                    if (!Intrinsics.areEqual(value3, "PRIVATE KEY")) {
                        throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected type: ", value3));
                    }
                    if (value2 != null) {
                        throw new IllegalArgumentException("string includes multiple private keys".toString());
                    }
                    MatchGroup matchGroup3 = matchResult.getGroups().get(2);
                    Intrinsics.checkNotNull(matchGroup3);
                    value2 = matchGroup3.getValue();
                }
            }
            if (value == null) {
                throw new IllegalArgumentException("string does not include a certificate".toString());
            }
            if (value2 == null) {
                throw new IllegalArgumentException("string does not include a private key".toString());
            }
            return decode(value, value2);
        }

        private final HeldCertificate decode(String p0, String p1) {
            String str;
            X509Certificate x509CertificateDecodeCertificatePem = Certificates.decodeCertificatePem(p0);
            ByteString.Companion companion = ByteString.INSTANCE;
            ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p1);
            if (byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                throw new IllegalArgumentException("failed to decode private key");
            }
            PublicKey publicKey = x509CertificateDecodeCertificatePem.getPublicKey();
            if (publicKey instanceof ECPublicKey) {
                str = "EC";
            } else {
                if (!(publicKey instanceof RSAPublicKey)) {
                    throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected key type: ", x509CertificateDecodeCertificatePem.getPublicKey()));
                }
                str = "RSA";
            }
            return new HeldCertificate(new KeyPair(x509CertificateDecodeCertificatePem.getPublicKey(), decodePkcs8(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3, str)), x509CertificateDecodeCertificatePem);
        }

        private final PrivateKey decodePkcs8(ByteString p0, String p1) {
            try {
                PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance(p1).generatePrivate(new PKCS8EncodedKeySpec(p0.asBinder()));
                Intrinsics.checkNotNullExpressionValue(privateKeyGeneratePrivate, "");
                return privateKeyGeneratePrivate;
            } catch (GeneralSecurityException e2) {
                throw new IllegalArgumentException("failed to decode private key", e2);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static int TuitionPaymentFragmentbindingInflater1() {
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i2 = i % 7911187;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
            if (i2 != 0) {
                return b;
            }
            int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            b = i3;
            return i3;
        }
    }

    @JvmStatic
    public static final HeldCertificate decode(String str) {
        return INSTANCE.decode(str);
    }
}
