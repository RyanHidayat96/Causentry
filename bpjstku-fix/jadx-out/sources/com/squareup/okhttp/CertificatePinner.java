package com.squareup.okhttp;

import android.content.Context;
import android.widget.Toast;
import com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedActivationWorkerPasswordFragment$special$$inlined$sharedViewModel$default$1;
import com.squareup.okhttp.internal.Util;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class CertificatePinner {
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final Map<String, Set<ByteString>> hostnameToPins;

    private CertificatePinner(Builder builder) {
        this.hostnameToPins = Util.immutableMap(builder.hostnameToPins);
    }

    public final void check(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        Set<ByteString> setFindMatchingPins = findMatchingPins(str);
        if (setFindMatchingPins != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (setFindMatchingPins.contains(sha1((X509Certificate) list.get(i)))) {
                    return;
                }
            }
            StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                sb.append("\n    ");
                sb.append(pin(x509Certificate));
                sb.append(": ");
                sb.append(x509Certificate.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            for (ByteString byteString : setFindMatchingPins) {
                sb.append("\n    sha1/");
                sb.append(byteString.b());
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    public final void check(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
        int length = str != null ? str.length() : 0;
        if (SalariedActivationWorkerPasswordFragment$special$$inlined$sharedViewModel$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ArrayList()) != 0) {
            int[] iArr = new int[length];
            int i = length - 1;
            iArr[i] = 1;
            Toast.makeText((Context) null, iArr[((length * i) % 2) - 1], 1).show();
        }
        check(str, Arrays.asList(certificateArr));
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder {
        private final Map<String, Set<ByteString>> hostnameToPins = new LinkedHashMap();

        public final Builder add(String str, String... strArr) {
            if (str == null) {
                throw new IllegalArgumentException("hostname == null");
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Set<ByteString> setPut = this.hostnameToPins.put(str, Collections.unmodifiableSet(linkedHashSet));
            if (setPut != null) {
                linkedHashSet.addAll(setPut);
            }
            for (String str2 : strArr) {
                if (!str2.startsWith("sha1/")) {
                    throw new IllegalArgumentException("pins must start with 'sha1/': ".concat(String.valueOf(str2)));
                }
                ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str2.substring(5));
                if (byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    throw new IllegalArgumentException("pins must be base64: ".concat(String.valueOf(str2)));
                }
                linkedHashSet.add(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            return this;
        }

        public final CertificatePinner build() {
            return new CertificatePinner(this);
        }
    }

    final Set<ByteString> findMatchingPins(String str) {
        Set<ByteString> set;
        Set<ByteString> set2 = this.hostnameToPins.get(str);
        int iIndexOf = str.indexOf(46);
        if (iIndexOf != str.lastIndexOf(46)) {
            Map<String, Set<ByteString>> map = this.hostnameToPins;
            StringBuilder sb = new StringBuilder("*.");
            sb.append(str.substring(iIndexOf + 1));
            set = map.get(sb.toString());
        } else {
            set = null;
        }
        if (set2 == null && set == null) {
            return null;
        }
        if (set2 == null || set == null) {
            return set2 != null ? set2 : set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(set2);
        linkedHashSet.addAll(set);
        return linkedHashSet;
    }

    public static String pin(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        StringBuilder sb = new StringBuilder("sha1/");
        sb.append(sha1((X509Certificate) certificate).b());
        return sb.toString();
    }

    private static ByteString sha1(X509Certificate x509Certificate) {
        return Util.sha1(ByteString.TuitionPaymentFragmentbindingInflater1(x509Certificate.getPublicKey().getEncoded()));
    }
}
