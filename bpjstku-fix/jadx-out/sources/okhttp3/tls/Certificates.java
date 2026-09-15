package okhttp3.tls;

import RotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
import defpackage.RotationProviderListenerWrapper;
import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u000b\u001a\u00020\n*\u00060\u0006j\u0002`\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Ljava/security/cert/X509Certificate;", "", "certificatePem", "(Ljava/security/cert/X509Certificate;)Ljava/lang/String;", "decodeCertificatePem", "(Ljava/lang/String;)Ljava/security/cert/X509Certificate;", "Ljava/lang/StringBuilder;", "Lkotlin/text/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Lokio/ByteString;", "p0", "", "encodeBase64Lines", "(Ljava/lang/StringBuilder;Lokio/ByteString;)V"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class Certificates {
    public static final X509Certificate decodeCertificatePem(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
            Intrinsics.checkNotNullParameter(str, "");
            Collection<? extends Certificate> collectionGenerateCertificates = certificateFactory.generateCertificates(rotationProviderListenerWrapper.b(str, 0, str.length()).new TuitionPaymentFragmentspecialinlinedviewModeldefault1());
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

    public static final String certificatePem(X509Certificate x509Certificate) throws CertificateEncodingException {
        Intrinsics.checkNotNullParameter(x509Certificate, "");
        StringBuilder sb = new StringBuilder();
        sb.append("-----BEGIN CERTIFICATE-----\n");
        ByteString.Companion companion = ByteString.INSTANCE;
        byte[] encoded = x509Certificate.getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "");
        encodeBase64Lines(sb, ByteString.Companion.b(encoded));
        sb.append("-----END CERTIFICATE-----\n");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final void encodeBase64Lines(StringBuilder sb, ByteString byteString) {
        Intrinsics.checkNotNullParameter(sb, "");
        Intrinsics.checkNotNullParameter(byteString, "");
        String strB = byteString.b();
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, strB.length()), 64);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return;
        }
        while (true) {
            sb.append((CharSequence) strB, first, Math.min(first + 64, strB.length()));
            sb.append('\n');
            if (first == last) {
                return;
            } else {
                first += step;
            }
        }
    }
}
