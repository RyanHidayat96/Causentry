package defpackage;

import java.io.IOException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.text.Typography;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SurfaceProcessorNodeExternalSyntheticLambda1 implements X509HostnameVerifier {
    private static final Pattern TuitionPaymentFragmentbindingInflater1 = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    private static final String[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    static {
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = strArr;
        Arrays.sort(strArr);
    }

    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
    public final void verify(String str, SSLSocket sSLSocket) throws IOException {
        if (str == null) {
            throw new NullPointerException("host to verify is null");
        }
        verify(str, (X509Certificate) sSLSocket.getSession().getPeerCertificates()[0]);
    }

    @Override // org.apache.http.conn.ssl.X509HostnameVerifier, javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    public static void b(String str, String[] strArr, String[] strArr2) throws SSLException {
        String str2;
        LinkedList linkedList = new LinkedList();
        boolean zEquals = false;
        if (strArr != null && strArr.length > 0 && (str2 = strArr[0]) != null) {
            linkedList.add(str2);
        }
        if (strArr2 != null) {
            for (String str3 : strArr2) {
                if (str3 != null) {
                    linkedList.add(str3);
                }
            }
        }
        if (linkedList.isEmpty()) {
            StringBuilder sb = new StringBuilder("Certificate for <");
            sb.append(str);
            sb.append("> doesn't contain CN or DNS subjectAlt");
            throw new SSLException(sb.toString());
        }
        StringBuffer stringBuffer = new StringBuffer();
        String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ENGLISH);
            stringBuffer.append(" <");
            stringBuffer.append(lowerCase2);
            stringBuffer.append(Typography.greater);
            if (it.hasNext()) {
                stringBuffer.append(" OR");
            }
            if (!lowerCase2.startsWith("*.") || lowerCase2.indexOf(46, 2) == -1) {
                zEquals = lowerCase.equals(lowerCase2);
            } else {
                int length = lowerCase2.length();
                if (length >= 7 && length <= 9) {
                    int i = length - 3;
                    if (lowerCase2.charAt(i) == '.') {
                        if (Arrays.binarySearch(TuitionPaymentFragmentspecialinlinedviewModeldefault3, lowerCase2.substring(2, i)) >= 0) {
                            zEquals = lowerCase.equals(lowerCase2);
                        } else if (!TuitionPaymentFragmentbindingInflater1.matcher(str).matches()) {
                            zEquals = lowerCase.endsWith(lowerCase2.substring(1));
                        } else {
                            zEquals = lowerCase.equals(lowerCase2);
                        }
                    } else if (!TuitionPaymentFragmentbindingInflater1.matcher(str).matches()) {
                        zEquals = lowerCase.endsWith(lowerCase2.substring(1));
                    } else {
                        zEquals = lowerCase.equals(lowerCase2);
                    }
                } else if (!TuitionPaymentFragmentbindingInflater1.matcher(str).matches()) {
                    zEquals = lowerCase.endsWith(lowerCase2.substring(1));
                } else {
                    zEquals = lowerCase.equals(lowerCase2);
                }
            }
            if (zEquals) {
                break;
            }
        }
        if (zEquals) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("hostname in certificate didn't match: <");
        sb2.append(str);
        sb2.append("> !=");
        sb2.append((Object) stringBuffer);
        throw new SSLException(sb2.toString());
    }

    private static String[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(X509Certificate x509Certificate) {
        Collection<List<?>> subjectAlternativeNames;
        LinkedList linkedList = new LinkedList();
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException e2) {
            Logger.getLogger(SurfaceProcessorNodeExternalSyntheticLambda1.class.getName()).log(Level.FINE, "Error parsing certificate.", (Throwable) e2);
            subjectAlternativeNames = null;
        }
        if (subjectAlternativeNames != null) {
            for (List<?> list : subjectAlternativeNames) {
                if (((Integer) list.get(0)).intValue() == 2) {
                    linkedList.add((String) list.get(1));
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
    public final void verify(String str, X509Certificate x509Certificate) throws SSLException {
        String[] strArr;
        String str2;
        char[] cArr;
        char c;
        int i;
        int i2;
        char c2;
        SurfaceProcessorNodeIn surfaceProcessorNodeIn = new SurfaceProcessorNodeIn(x509Certificate.getSubjectX500Principal());
        surfaceProcessorNodeIn.g = 0;
        surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        surfaceProcessorNodeIn.b = 0;
        surfaceProcessorNodeIn.TuitionPaymentFragmentbindingInflater1 = 0;
        surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault2.toCharArray();
        List listEmptyList = Collections.emptyList();
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (strTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            while (true) {
                int i3 = surfaceProcessorNodeIn.g;
                if (i3 >= surfaceProcessorNodeIn.asBinder) {
                    break;
                }
                char c3 = surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3];
                if (c3 != '\"') {
                    if (c3 != '#') {
                        if (c3 == '+' || c3 == ',' || c3 == ';') {
                            str2 = "";
                        } else {
                            int i4 = surfaceProcessorNodeIn.g;
                            surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4;
                            surfaceProcessorNodeIn.b = i4;
                            while (true) {
                                int i5 = surfaceProcessorNodeIn.g;
                                if (i5 >= surfaceProcessorNodeIn.asBinder) {
                                    char[] cArr2 = surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i6 = surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    str2 = new String(cArr2, i6, surfaceProcessorNodeIn.b - i6);
                                    break;
                                }
                                char[] cArr3 = surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                char c4 = cArr3[i5];
                                if (c4 != ' ') {
                                    if (c4 != ';') {
                                        if (c4 == '\\') {
                                            int i7 = surfaceProcessorNodeIn.b;
                                            surfaceProcessorNodeIn.b = i7 + 1;
                                            cArr3[i7] = surfaceProcessorNodeIn.TuitionPaymentFragmentbindingInflater1();
                                            surfaceProcessorNodeIn.g++;
                                        } else if (c4 != '+' && c4 != ',') {
                                            int i8 = surfaceProcessorNodeIn.b;
                                            surfaceProcessorNodeIn.b = i8 + 1;
                                            cArr3[i8] = c4;
                                            surfaceProcessorNodeIn.g = i5 + 1;
                                        }
                                    }
                                    char[] cArr4 = surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i9 = surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    str2 = new String(cArr4, i9, surfaceProcessorNodeIn.b - i9);
                                    break;
                                }
                                int i10 = surfaceProcessorNodeIn.b;
                                surfaceProcessorNodeIn.TuitionPaymentFragmentbindingInflater1 = i10;
                                surfaceProcessorNodeIn.g = i5 + 1;
                                surfaceProcessorNodeIn.b = i10 + 1;
                                cArr3[i10] = ' ';
                                while (true) {
                                    i = surfaceProcessorNodeIn.g;
                                    i2 = surfaceProcessorNodeIn.asBinder;
                                    if (i >= i2) {
                                        break;
                                    }
                                    char[] cArr5 = surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    if (cArr5[i] != ' ') {
                                        break;
                                    }
                                    int i11 = surfaceProcessorNodeIn.b;
                                    surfaceProcessorNodeIn.b = i11 + 1;
                                    cArr5[i11] = ' ';
                                    surfaceProcessorNodeIn.g = i + 1;
                                }
                                if (i == i2 || (c2 = surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i]) == ',' || c2 == '+' || c2 == ';') {
                                    char[] cArr6 = surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i12 = surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    str2 = new String(cArr6, i12, surfaceProcessorNodeIn.TuitionPaymentFragmentbindingInflater1 - i12);
                                    break;
                                }
                            }
                        }
                    } else {
                        int i13 = surfaceProcessorNodeIn.g;
                        if (i13 + 4 >= surfaceProcessorNodeIn.asBinder) {
                            StringBuilder sb = new StringBuilder("Unexpected end of DN: ");
                            sb.append(surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            throw new IllegalStateException(sb.toString());
                        }
                        surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13;
                        surfaceProcessorNodeIn.g = i13 + 1;
                        while (true) {
                            int i14 = surfaceProcessorNodeIn.g;
                            if (i14 == surfaceProcessorNodeIn.asBinder || (c = (cArr = surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault3)[i14]) == '+' || c == ',' || c == ';') {
                                surfaceProcessorNodeIn.b = i14;
                                break;
                            }
                            if (c == ' ') {
                                surfaceProcessorNodeIn.b = i14;
                                surfaceProcessorNodeIn.g = i14 + 1;
                                while (true) {
                                    int i15 = surfaceProcessorNodeIn.g;
                                    if (i15 >= surfaceProcessorNodeIn.asBinder || surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i15] != ' ') {
                                        break;
                                    } else {
                                        surfaceProcessorNodeIn.g = i15 + 1;
                                    }
                                }
                            } else {
                                if (c >= 'A' && c <= 'F') {
                                    cArr[i14] = (char) (c + ' ');
                                }
                                surfaceProcessorNodeIn.g = i14 + 1;
                            }
                        }
                        int i16 = surfaceProcessorNodeIn.b;
                        int i17 = surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i18 = i16 - i17;
                        if (i18 < 5 || (i18 & 1) == 0) {
                            StringBuilder sb2 = new StringBuilder("Unexpected end of DN: ");
                            sb2.append(surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            throw new IllegalStateException(sb2.toString());
                        }
                        int i19 = i18 / 2;
                        byte[] bArr = new byte[i19];
                        int i20 = i17 + 1;
                        for (int i21 = 0; i21 < i19; i21++) {
                            bArr[i21] = (byte) surfaceProcessorNodeIn.b(i20);
                            i20 += 2;
                        }
                        str2 = new String(surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault3, surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault1, i18);
                    }
                } else {
                    int i22 = surfaceProcessorNodeIn.g + 1;
                    surfaceProcessorNodeIn.g = i22;
                    surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22;
                    surfaceProcessorNodeIn.b = i22;
                    while (true) {
                        int i23 = surfaceProcessorNodeIn.g;
                        if (i23 == surfaceProcessorNodeIn.asBinder) {
                            StringBuilder sb3 = new StringBuilder("Unexpected end of DN: ");
                            sb3.append(surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            throw new IllegalStateException(sb3.toString());
                        }
                        char[] cArr7 = surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        char c5 = cArr7[i23];
                        if (c5 == '\"') {
                            surfaceProcessorNodeIn.g = i23 + 1;
                            while (true) {
                                int i24 = surfaceProcessorNodeIn.g;
                                if (i24 >= surfaceProcessorNodeIn.asBinder || surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i24] != ' ') {
                                    break;
                                } else {
                                    surfaceProcessorNodeIn.g = i24 + 1;
                                }
                            }
                            char[] cArr8 = surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i25 = surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            str2 = new String(cArr8, i25, surfaceProcessorNodeIn.b - i25);
                            break;
                        }
                        if (c5 == '\\') {
                            cArr7[surfaceProcessorNodeIn.b] = surfaceProcessorNodeIn.TuitionPaymentFragmentbindingInflater1();
                        } else {
                            cArr7[surfaceProcessorNodeIn.b] = c5;
                        }
                        surfaceProcessorNodeIn.g++;
                        surfaceProcessorNodeIn.b++;
                    }
                }
                if ("cn".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                    if (listEmptyList.isEmpty()) {
                        listEmptyList = new ArrayList();
                    }
                    listEmptyList.add(str2);
                }
                int i26 = surfaceProcessorNodeIn.g;
                if (i26 >= surfaceProcessorNodeIn.asBinder) {
                    break;
                }
                char c6 = surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i26];
                if (c6 != ',' && c6 != ';' && c6 != '+') {
                    StringBuilder sb4 = new StringBuilder("Malformed DN: ");
                    sb4.append(surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    throw new IllegalStateException(sb4.toString());
                }
                surfaceProcessorNodeIn.g = i26 + 1;
                strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                if (strTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    StringBuilder sb5 = new StringBuilder("Malformed DN: ");
                    sb5.append(surfaceProcessorNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    throw new IllegalStateException(sb5.toString());
                }
            }
        }
        if (listEmptyList.isEmpty()) {
            strArr = null;
        } else {
            strArr = new String[listEmptyList.size()];
            listEmptyList.toArray(strArr);
        }
        verify(str, strArr, TuitionPaymentFragmentspecialinlinedviewModeldefault3(x509Certificate));
    }
}
