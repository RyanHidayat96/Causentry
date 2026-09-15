package androidx.FastestIyy;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import androidx.compose.animation.core.AnimationKt;
import androidx.core.os.EnvironmentCompat;
import com.google.firebase.messaging.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXParameters;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class A extends AbstractC0201w {
    public static long d;
    public KeyStore b;
    public PKIXParameters c;

    public A(Context context) {
        super(context);
    }

    public final void a() {
        a0.a(258, new b0() { // from class: androidx.FastestIyy.A$$ExternalSyntheticLambda0
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.b(jSONArray);
            }
        });
        a0.a(262, new b0() { // from class: androidx.FastestIyy.A$$ExternalSyntheticLambda1
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.c(jSONArray);
            }
        });
        a0.a(281, new b0() { // from class: androidx.FastestIyy.A$$ExternalSyntheticLambda2
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.d(jSONArray);
            }
        });
        a0.a(310, new b0() { // from class: androidx.FastestIyy.A$$ExternalSyntheticLambda3
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.e(jSONArray);
            }
        });
        ((i0) i0.a()).a("com.zimperium.zdd.validate_certificate_chain", new B() { // from class: androidx.FastestIyy.A$$ExternalSyntheticLambda4
            @Override // androidx.FastestIyy.B
            public final void a(String str, String str2, j0 j0Var) {
                this.f$0.a(str, str2, j0Var);
            }
        });
    }

    public final Object b(JSONArray jSONArray) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        KeyStore keyStore;
        String strA = AbstractC0201w.a(jSONArray);
        JSONArray jSONArrayOptJSONArray = jSONArray.optJSONArray(1);
        JSONArray jSONArrayOptJSONArray2 = jSONArray.optJSONArray(2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean zA = false;
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            byteArrayOutputStream.write(jSONArrayOptJSONArray.getString(i).getBytes());
        }
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X509");
        if (jSONArrayOptJSONArray2 == null) {
            keyStore = KeyStore.getInstance("AndroidCAStore");
            keyStore.load(null, null);
        } else {
            KeyStore keyStore2 = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore2.load(null, null);
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                keyStore2.setCertificateEntry("root".concat(String.valueOf(i2)), certificateFactory.generateCertificate(new ByteArrayInputStream(jSONArrayOptJSONArray2.getString(i2).getBytes())));
            }
            keyStore = keyStore2;
        }
        PKIXParameters pKIXParameters = new PKIXParameters(keyStore);
        pKIXParameters.setRevocationEnabled(false);
        try {
            zA = a(strA, byteArrayOutputStream.toByteArray(), pKIXParameters, certificateFactory);
        } catch (Exception unused) {
        }
        return Boolean.valueOf(zA);
    }

    public final Object c(JSONArray jSONArray) throws JSONException {
        Certificate[] certificateArr;
        String strA = AbstractC0201w.a(jSONArray);
        try {
            ByteArrayInputStream byteArrayInputStream = strA.contains("BEGIN CERTIFICATE") ? new ByteArrayInputStream(strA.getBytes()) : new ByteArrayInputStream(Base64.decode(strA, 0));
            try {
                certificateArr = (Certificate[]) CertificateFactory.getInstance("X509").generateCertificates(byteArrayInputStream).toArray(new Certificate[0]);
            } catch (Exception unused) {
                certificateArr = (Certificate[]) CertificateFactory.getInstance("X509", "BC").generateCertificates(byteArrayInputStream).toArray(new Certificate[0]);
            }
            String name = ((X509Certificate) certificateArr[0]).getSubjectX500Principal().getName();
            JSONObject jSONObject = new JSONObject();
            for (String str : name.split(",")) {
                if (str.length() != 2) {
                    String[] strArrSplit = str.split("=");
                    jSONObject.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            return jSONObject;
        } catch (Exception unused2) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("CN", EnvironmentCompat.MEDIA_UNKNOWN);
            return jSONObject2;
        }
    }

    public final Object d(JSONArray jSONArray) throws IOException {
        PublicKey publicKey;
        byte[] encoded;
        String strA = AbstractC0201w.a(jSONArray);
        boolean zOptBoolean = jSONArray.optBoolean(1);
        ByteArrayInputStream byteArrayInputStream = strA.contains("BEGIN CERTIFICATE") ? new ByteArrayInputStream(strA.getBytes()) : new ByteArrayInputStream(Base64.decode(strA, 0));
        try {
            publicKey = ((Certificate[]) CertificateFactory.getInstance("X509").generateCertificates(byteArrayInputStream).toArray(new Certificate[0]))[0].getPublicKey();
        } catch (Exception unused) {
            publicKey = ((Certificate[]) CertificateFactory.getInstance("X509", "BC").generateCertificates(byteArrayInputStream).toArray(new Certificate[0]))[0].getPublicKey();
        }
        if (zOptBoolean) {
            return Base64.encodeToString(publicKey.getEncoded(), 2);
        }
        if (publicKey.getAlgorithm().equalsIgnoreCase("RSA")) {
            encoded = ((RSAPublicKey) publicKey).getModulus().toByteArray();
        } else if (publicKey.getAlgorithm().equalsIgnoreCase("DSA")) {
            encoded = ((DSAPublicKey) publicKey).getY().toByteArray();
        } else if (publicKey.getAlgorithm().equalsIgnoreCase("EC")) {
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            byte[] bArrA = a(eCPublicKey.getW().getAffineX().toByteArray());
            byte[] bArrA2 = a(eCPublicKey.getW().getAffineY().toByteArray());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(4);
            byteArrayOutputStream.write(bArrA);
            byteArrayOutputStream.write(bArrA2);
            encoded = byteArrayOutputStream.toByteArray();
        } else {
            encoded = publicKey.getEncoded();
        }
        return Base64.encodeToString(a(encoded), 2);
    }

    public final Object e(JSONArray jSONArray) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
        Date date = new Date();
        Date date2 = new Date(date.getTime() + AnimationKt.MillisToNanos);
        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder("zimperium", 4).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setKeyValidityStart(date).setKeyValidityForOriginationEnd(date2).setKeyValidityForConsumptionEnd(date2).setDigests("NONE", "SHA-256").setAttestationChallenge(date.toString().getBytes(StandardCharsets.UTF_8)).build());
        keyPairGenerator.generateKeyPair();
        Certificate[] certificateChain = keyStore.getCertificateChain("zimperium");
        X509Certificate x509Certificate = (X509Certificate) certificateChain[certificateChain.length - 1];
        int length = certificateChain.length - 1;
        while (length >= 0) {
            X509Certificate x509Certificate2 = (X509Certificate) certificateChain[length];
            x509Certificate2.checkValidity();
            x509Certificate2.verify(x509Certificate.getPublicKey());
            length--;
            x509Certificate = x509Certificate2;
        }
        return Base64.encodeToString(((X509Certificate) certificateChain[0]).getExtensionValue("1.3.6.1.4.1.11129.2.1.17"), 0);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005e A[Catch: Exception -> 0x008c, TryCatch #0 {Exception -> 0x008c, blocks: (B:3:0x0001, B:4:0x001a, B:6:0x0020, B:7:0x0037, B:9:0x0042, B:11:0x0054, B:14:0x0081, B:13:0x005e), top: B:26:0x0001 }] */
    public final void a(String str, String str2, j0 j0Var) {
        String string;
        boolean zA = false;
        try {
            J jA = J.a(str2);
            JSONArray jSONArray = (JSONArray) J.a(jA.f263a, "chain", new JSONArray());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (int i = 0; i < jSONArray.length(); i++) {
                int length = jSONArray.getString(i).getBytes().length;
                byteArrayOutputStream.write(jSONArray.getString(i).getBytes());
            }
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X509");
            string = null;
            if (this.b != null) {
                if (((Boolean) J.a(jA.f263a, "reload", Boolean.FALSE)).booleanValue() || System.nanoTime() > d) {
                    KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
                    this.b = keyStore;
                    keyStore.load(null, null);
                    PKIXParameters pKIXParameters = new PKIXParameters(this.b);
                    this.c = pKIXParameters;
                    pKIXParameters.setRevocationEnabled(false);
                    d = System.nanoTime() + 3600000000000L;
                }
            } else {
                KeyStore keyStore2 = KeyStore.getInstance("AndroidCAStore");
                this.b = keyStore2;
                keyStore2.load(null, null);
                PKIXParameters pKIXParameters2 = new PKIXParameters(this.b);
                this.c = pKIXParameters2;
                pKIXParameters2.setRevocationEnabled(false);
                d = System.nanoTime() + 3600000000000L;
            }
            zA = a(null, byteArrayOutputStream.toByteArray(), this.c, certificateFactory);
        } catch (Exception e2) {
            string = e2.toString();
        }
        J j = new J();
        try {
            j.f263a.put("valid", zA);
        } catch (JSONException unused) {
        }
        if (!TextUtils.isEmpty(string)) {
            j = j.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, string);
        }
        j0Var.a(j.f263a.toString());
    }

    public static byte[] a(byte[] bArr) {
        if (bArr == null) {
            return bArr;
        }
        int i = 0;
        while (i < bArr.length && bArr[i] == 0) {
            i++;
        }
        return i > 0 ? Arrays.copyOfRange(bArr, i, bArr.length) : bArr;
    }

    public static boolean a(String str, byte[] bArr, PKIXParameters pKIXParameters, CertificateFactory certificateFactory) throws CertificateException, CertPathValidatorException, InvalidAlgorithmParameterException {
        int length;
        CertPath certPathGenerateCertPath = certificateFactory.generateCertPath(new ArrayList(certificateFactory.generateCertificates(new ByteArrayInputStream(bArr))));
        CertPathValidator.getInstance("PKIX").validate(certPathGenerateCertPath, pKIXParameters);
        X509Certificate x509Certificate = (X509Certificate) certPathGenerateCertPath.getCertificates().get(0);
        if (str == null) {
            return true;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        ArrayList arrayList = new ArrayList();
        String name = x509Certificate.getSubjectX500Principal().getName();
        int iIndexOf = name.indexOf("CN=");
        int iIndexOf2 = name.indexOf(",", iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = name.length();
        }
        arrayList.add(name.substring(iIndexOf + 3, iIndexOf2));
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null) {
                        arrayList.add(list.get(1).toString());
                    }
                }
            }
        } catch (Exception unused) {
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String strConcat = (String) arrayList.get(i);
            if (lowerCase != null && lowerCase.length() != 0 && !lowerCase.startsWith(".") && !lowerCase.endsWith("..") && strConcat != null && strConcat.length() != 0 && !strConcat.startsWith(".") && !strConcat.endsWith("..")) {
                String strConcat2 = !lowerCase.endsWith(".") ? lowerCase.concat(".") : lowerCase;
                if (!strConcat.endsWith(".")) {
                    strConcat = strConcat.concat(".");
                }
                String lowerCase2 = strConcat.toLowerCase(Locale.US);
                if (!lowerCase2.contains("*")) {
                    if (strConcat2.equals(lowerCase2)) {
                        return true;
                    }
                } else if (lowerCase2.startsWith("*.") && lowerCase2.indexOf(42, 1) == -1 && strConcat2.length() >= lowerCase2.length() && !"*.".equals(lowerCase2)) {
                    String strSubstring = lowerCase2.substring(1);
                    if (strConcat2.endsWith(strSubstring) && ((length = strConcat2.length() - strSubstring.length()) <= 0 || strConcat2.lastIndexOf(46, length - 1) == -1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
