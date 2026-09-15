package okhttp3.tls.internal.der;

import RotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
import defpackage.RotationProviderListenerWrapper;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH×\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 R\u0011\u0010$\u001a\u00020!8G¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010'\u001a\u0004\u0018\u00010\u00018G¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010)\u001a\u0004\u0018\u00010\u00018G¢\u0006\u0006\u001a\u0004\b(\u0010&R\u001a\u0010*\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0011R\u001a\u0010-\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0013R\u0013\u00101\u001a\u0004\u0018\u00010!8G¢\u0006\u0006\u001a\u0004\b0\u0010#R\u001a\u00102\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u000f"}, d2 = {"Lokhttp3/tls/internal/der/Certificate;", "", "Lokhttp3/tls/internal/der/TbsCertificate;", "p0", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "p1", "Lokhttp3/tls/internal/der/BitString;", "p2", "<init>", "(Lokhttp3/tls/internal/der/TbsCertificate;Lokhttp3/tls/internal/der/AlgorithmIdentifier;Lokhttp3/tls/internal/der/BitString;)V", "Ljava/security/PublicKey;", "", "checkSignature", "(Ljava/security/PublicKey;)Z", "component1", "()Lokhttp3/tls/internal/der/TbsCertificate;", "component2", "()Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "component3", "()Lokhttp3/tls/internal/der/BitString;", "copy", "(Lokhttp3/tls/internal/der/TbsCertificate;Lokhttp3/tls/internal/der/AlgorithmIdentifier;Lokhttp3/tls/internal/der/BitString;)Lokhttp3/tls/internal/der/Certificate;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/security/cert/X509Certificate;", "toX509Certificate", "()Ljava/security/cert/X509Certificate;", "Lokhttp3/tls/internal/der/Extension;", "getBasicConstraints", "()Lokhttp3/tls/internal/der/Extension;", "basicConstraints", "getCommonName", "()Ljava/lang/Object;", "commonName", "getOrganizationalUnitName", "organizationalUnitName", "signatureAlgorithm", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "getSignatureAlgorithm", "signatureValue", "Lokhttp3/tls/internal/der/BitString;", "getSignatureValue", "getSubjectAlternativeNames", "subjectAlternativeNames", "tbsCertificate", "Lokhttp3/tls/internal/der/TbsCertificate;", "getTbsCertificate"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class Certificate {
    private final AlgorithmIdentifier signatureAlgorithm;
    private final BitString signatureValue;
    private final TbsCertificate tbsCertificate;

    public Certificate(TbsCertificate tbsCertificate, AlgorithmIdentifier algorithmIdentifier, BitString bitString) {
        Intrinsics.checkNotNullParameter(tbsCertificate, "");
        Intrinsics.checkNotNullParameter(algorithmIdentifier, "");
        Intrinsics.checkNotNullParameter(bitString, "");
        this.tbsCertificate = tbsCertificate;
        this.signatureAlgorithm = algorithmIdentifier;
        this.signatureValue = bitString;
    }

    public final TbsCertificate getTbsCertificate() {
        return this.tbsCertificate;
    }

    public final AlgorithmIdentifier getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    public final BitString getSignatureValue() {
        return this.signatureValue;
    }

    public final Object getCommonName() {
        Object next;
        Iterator it = CollectionsKt.flatten(this.tbsCertificate.getSubject()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((AttributeTypeAndValue) next).getType(), ObjectIdentifiers.commonName));
        AttributeTypeAndValue attributeTypeAndValue = (AttributeTypeAndValue) next;
        if (attributeTypeAndValue == null) {
            return null;
        }
        return attributeTypeAndValue.getValue();
    }

    public final Object getOrganizationalUnitName() {
        Object next;
        Iterator it = CollectionsKt.flatten(this.tbsCertificate.getSubject()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((AttributeTypeAndValue) next).getType(), ObjectIdentifiers.organizationalUnitName));
        AttributeTypeAndValue attributeTypeAndValue = (AttributeTypeAndValue) next;
        if (attributeTypeAndValue == null) {
            return null;
        }
        return attributeTypeAndValue.getValue();
    }

    public final Extension getSubjectAlternativeNames() {
        Object next;
        Iterator<T> it = this.tbsCertificate.getExtensions().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((Extension) next).getId(), ObjectIdentifiers.subjectAlternativeName)) {
                return (Extension) next;
            }
        }
        next = null;
        return (Extension) next;
    }

    public final Extension getBasicConstraints() {
        for (Extension extension : this.tbsCertificate.getExtensions()) {
            if (Intrinsics.areEqual(extension.getId(), ObjectIdentifiers.basicConstraints)) {
                return extension;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final boolean checkSignature(PublicKey p0) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        Intrinsics.checkNotNullParameter(p0, "");
        ByteString der = CertificateAdapters.INSTANCE.getTbsCertificate$okhttp_tls().toDer(this.tbsCertificate);
        Signature signature = Signature.getInstance(this.tbsCertificate.getSignatureAlgorithmName());
        signature.initVerify(p0);
        signature.update(der.asBinder());
        return signature.verify(getSignatureValue().getByteString().asBinder());
    }

    public final X509Certificate toX509Certificate() {
        ByteString der = CertificateAdapters.INSTANCE.getCertificate$okhttp_tls().toDer(this);
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
            Intrinsics.checkNotNullParameter(der, "");
            der.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper, 0, der.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            Collection<? extends java.security.cert.Certificate> collectionGenerateCertificates = certificateFactory.generateCertificates(rotationProviderListenerWrapper.new TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            Intrinsics.checkNotNullExpressionValue(collectionGenerateCertificates, "");
            Object objSingle = CollectionsKt.single(collectionGenerateCertificates);
            if (objSingle != null) {
                return (X509Certificate) objSingle;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException("failed to decode certificate", e2);
        } catch (GeneralSecurityException e3) {
            throw new IllegalArgumentException("failed to decode certificate", e3);
        } catch (NoSuchElementException e4) {
            throw new IllegalArgumentException("failed to decode certificate", e4);
        }
    }

    public static /* synthetic */ Certificate copy$default(Certificate certificate, TbsCertificate tbsCertificate, AlgorithmIdentifier algorithmIdentifier, BitString bitString, int i, Object obj) {
        if ((i & 1) != 0) {
            tbsCertificate = certificate.tbsCertificate;
        }
        if ((i & 2) != 0) {
            algorithmIdentifier = certificate.signatureAlgorithm;
        }
        if ((i & 4) != 0) {
            bitString = certificate.signatureValue;
        }
        return certificate.copy(tbsCertificate, algorithmIdentifier, bitString);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TbsCertificate getTbsCertificate() {
        return this.tbsCertificate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AlgorithmIdentifier getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BitString getSignatureValue() {
        return this.signatureValue;
    }

    public final Certificate copy(TbsCertificate p0, AlgorithmIdentifier p1, BitString p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new Certificate(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Certificate)) {
            return false;
        }
        Certificate certificate = (Certificate) p0;
        return Intrinsics.areEqual(this.tbsCertificate, certificate.tbsCertificate) && Intrinsics.areEqual(this.signatureAlgorithm, certificate.signatureAlgorithm) && Intrinsics.areEqual(this.signatureValue, certificate.signatureValue);
    }

    public final int hashCode() {
        return (((this.tbsCertificate.hashCode() * 31) + this.signatureAlgorithm.hashCode()) * 31) + this.signatureValue.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Certificate(tbsCertificate=");
        sb.append(this.tbsCertificate);
        sb.append(", signatureAlgorithm=");
        sb.append(this.signatureAlgorithm);
        sb.append(", signatureValue=");
        sb.append(this.signatureValue);
        sb.append(')');
        return sb.toString();
    }
}
