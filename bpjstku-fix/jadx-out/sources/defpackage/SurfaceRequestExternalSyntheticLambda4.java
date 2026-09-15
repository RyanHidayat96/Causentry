package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.android.volley.toolbox.HttpHeaderParser;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes4.dex */
public final class SurfaceRequestExternalSyntheticLambda4 {
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("CommHandler");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = sb.toString();
        b = 10000;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 30000;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x018f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0194 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v18 */
    final SurfaceRequestExternalSyntheticLambda7 TuitionPaymentFragmentbindingInflater1(String str, String str2, boolean z) throws Exception {
        ?? r7;
        HttpURLConnection httpURLConnection;
        ?? bufferedInputStream;
        ?? r15;
        BufferedInputStream bufferedInputStream2;
        byte[] bArrB;
        InputStream errorStream;
        HttpURLConnection httpURLConnection2 = null;
        String str3 = null;
        ?? r1 = 0;
        try {
            URL url = new URL(str);
            if (!SurfaceRequest3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                httpURLConnection = (HttpURLConnection) url.openConnection();
            } else {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
                int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
                if (InputBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ArrayList()) != 0) {
                    Toast.makeText((Context) null, iIntValue / (((iIntValue - 1) * iIntValue) % 2), 0).show();
                }
                if (SurfaceRequest3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null || SurfaceRequest3.b) {
                    SSLContext sSLContext = SSLContext.getInstance("TLS");
                    sSLContext.init(SurfaceRequest3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, new TrustManager[]{new SurfaceRequestResult(SurfaceRequest3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, SurfaceRequest3.b)}, new SecureRandom());
                    httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
                    httpURLConnection = httpsURLConnection;
                } else {
                    httpURLConnection = httpsURLConnection;
                }
            }
            try {
                httpURLConnection.setConnectTimeout(b);
                httpURLConnection.setReadTimeout(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                if (!z) {
                    httpURLConnection.setRequestProperty("Connection", "close");
                }
                String str4 = "Accept-Encoding";
                httpURLConnection.addRequestProperty("Accept-Encoding", "identity, gzip");
                if (str2 != null) {
                    httpURLConnection.setRequestProperty(HttpHeaderParser.HEADER_CONTENT_TYPE, "text/plain; charset=utf-8");
                    httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setDoOutput(true);
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("aPOST url[%s] data[%s]", str, str2));
                    }
                    String strB = onStateAttached.b(str2.replace("__tsNow__", String.valueOf(SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1())), SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(httpURLConnection.getOutputStream());
                    gZIPOutputStream.write(strB.getBytes("utf-8"));
                    gZIPOutputStream.close();
                    r15 = "utf-8";
                } else if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    r15 = str4;
                    ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Send status request ... %s", str));
                    r15 = str4;
                }
                try {
                    r15 = str4;
                    int responseCode = httpURLConnection.getResponseCode();
                    String responseMessage = httpURLConnection.getResponseMessage();
                    try {
                        bufferedInputStream2 = new BufferedInputStream(httpURLConnection.getInputStream());
                        try {
                            bArrB = ViewPort.b(bufferedInputStream2);
                            r15 = bufferedInputStream2;
                        } catch (IOException unused) {
                            if (!SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 || (errorStream = httpURLConnection.getErrorStream()) == null) {
                                bArrB = null;
                                r15 = bufferedInputStream2;
                            } else {
                                bufferedInputStream = new BufferedInputStream(errorStream);
                                try {
                                    bArrB = ViewPort.b((InputStream) bufferedInputStream);
                                    r15 = bufferedInputStream;
                                } catch (Throwable th) {
                                    th = th;
                                    httpURLConnection2 = httpURLConnection;
                                    r7 = bufferedInputStream;
                                    if (httpURLConnection2 != null) {
                                        httpURLConnection2.disconnect();
                                    }
                                    if (r7 != 0) {
                                        try {
                                            r7.close();
                                        } catch (IOException unused2) {
                                            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                                ViewPort.a("execution of Http-Request fails");
                                            }
                                        }
                                    }
                                    throw th;
                                }
                            }
                        }
                    } catch (IOException unused3) {
                        bufferedInputStream2 = null;
                    }
                    if (bArrB != null) {
                        if (bArrB.length >= 2 && bArrB[0] == 31 && bArrB[1] == -117) {
                            bArrB = ViewPort.b(new GZIPInputStream(new ByteArrayInputStream(bArrB)));
                        }
                        str3 = new String(bArrB);
                    }
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Response code: %s, msg: %s, body: %s", Integer.valueOf(responseCode), responseMessage, str3));
                    }
                    SurfaceRequestExternalSyntheticLambda7 surfaceRequestExternalSyntheticLambda7 = new SurfaceRequestExternalSyntheticLambda7(responseCode, responseMessage, str3, httpURLConnection.getHeaderFields());
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (r15 != 0) {
                        try {
                            r15.close();
                        } catch (IOException unused4) {
                            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                ViewPort.a("execution of Http-Request fails");
                            }
                        }
                    }
                    return surfaceRequestExternalSyntheticLambda7;
                } catch (Throwable th2) {
                    th = th2;
                    r1 = r15;
                    bufferedInputStream = r1;
                    httpURLConnection2 = httpURLConnection;
                    r7 = bufferedInputStream;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    if (r7 != 0) {
                        r7.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            r7 = 0;
        }
    }
}
