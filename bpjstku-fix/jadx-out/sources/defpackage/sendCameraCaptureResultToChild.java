package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mixpanel.android.util.RemoteService;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes6.dex */
public final class sendCameraCaptureResultToChild implements RemoteService {
    static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // com.mixpanel.android.util.RemoteService
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        new Thread(new Runnable() { // from class: sendCameraCaptureResultToChild.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    InetAddress byName = InetAddress.getByName("api.mixpanel.com");
                    sendCameraCaptureResultToChild.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = byName.isLoopbackAddress() || byName.isAnyLocalAddress();
                } catch (Exception unused) {
                }
            }
        }).start();
    }

    @Override // com.mixpanel.android.util.RemoteService
    public final boolean b(Context context, bindChildren bindchildren) {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3 || b(bindchildren)) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return true;
            }
            return activeNetworkInfo.isConnectedOrConnecting();
        } catch (SecurityException unused) {
            return true;
        }
    }

    private static boolean b(bindChildren bindchildren) {
        if (bindchildren == null) {
            return false;
        }
        try {
            return bindchildren.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00a9 A[EDGE_INSN: B:132:0x00a9->B:26:0x00a9 BREAK  A[LOOP:2: B:23:0x009e->B:25:0x00a5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0045 A[Catch: all -> 0x00d5, IOException -> 0x00d7, EOFException -> 0x0122, LOOP:1: B:14:0x003f->B:16:0x0045, LOOP_END, TryCatch #18 {EOFException -> 0x0122, IOException -> 0x00d7, all -> 0x00d5, blocks: (B:12:0x0022, B:13:0x0028, B:14:0x003f, B:16:0x0045, B:17:0x005d, B:21:0x0091), top: B:117:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a5 A[Catch: all -> 0x00bb, IOException -> 0x00bf, EOFException -> 0x0123, LOOP:2: B:23:0x009e->B:25:0x00a5, LOOP_END, TryCatch #15 {EOFException -> 0x0123, IOException -> 0x00bf, all -> 0x00bb, blocks: (B:22:0x0095, B:23:0x009e, B:25:0x00a5, B:26:0x00a9), top: B:121:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f0 A[Catch: all -> 0x0107, TryCatch #8 {all -> 0x0107, blocks: (B:56:0x00e8, B:58:0x00f0, B:60:0x00f8, B:61:0x0105, B:62:0x0106), top: B:106:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x011b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mixpanel.android.util.RemoteService
    public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, Map<String, Object> map, SSLSocketFactory sSLSocketFactory) throws Throwable {
        HttpURLConnection httpURLConnection;
        InputStream inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        OutputStream outputStreamTuitionPaymentFragmentbindingInflater1;
        BufferedOutputStream bufferedOutputStream;
        Uri.Builder builder;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i;
        HttpURLConnection httpURLConnection2 = null;
        bufferedOutputStream = null;
        bufferedOutputStream = null;
        BufferedOutputStream bufferedOutputStream2 = null;
        int i2 = 0;
        Object[] objArr = false;
        byte[] byteArray = null;
        while (i2 < 3 && objArr == false) {
            try {
                try {
                    try {
                        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(uRLConnectionOpenConnection);
                        httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                        if (sSLSocketFactory != null && (httpURLConnection instanceof HttpsURLConnection)) {
                            try {
                                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
                                httpURLConnection.setConnectTimeout(2000);
                                httpURLConnection.setReadTimeout(30000);
                                builder = new Uri.Builder();
                                for (Map.Entry<String, Object> entry : map.entrySet()) {
                                    builder.appendQueryParameter(entry.getKey(), entry.getValue().toString());
                                }
                                String encodedQuery = builder.build().getEncodedQuery();
                                httpURLConnection.setFixedLengthStreamingMode(encodedQuery.getBytes().length);
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
                                outputStreamTuitionPaymentFragmentbindingInflater1 = ViewPortBuilder.TuitionPaymentFragmentbindingInflater1(httpURLConnection);
                                bufferedOutputStream = new BufferedOutputStream(outputStreamTuitionPaymentFragmentbindingInflater1);
                                bufferedOutputStream.write(encodedQuery.getBytes(Hex.DEFAULT_CHARSET_NAME));
                                bufferedOutputStream.flush();
                                bufferedOutputStream.close();
                                outputStreamTuitionPaymentFragmentbindingInflater1.close();
                                inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(httpURLConnection);
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                bArr = new byte[8192];
                                while (true) {
                                    i = inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3.read(bArr, 0, 8192);
                                    if (i != -1) {
                                        break;
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i);
                                }
                                byteArrayOutputStream.flush();
                                byteArray = byteArrayOutputStream.toByteArray();
                                inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                objArr = true;
                            } catch (EOFException unused) {
                                inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                                outputStreamTuitionPaymentFragmentbindingInflater1 = null;
                                bufferedOutputStream = null;
                                i2++;
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                                if (outputStreamTuitionPaymentFragmentbindingInflater1 != null) {
                                    outputStreamTuitionPaymentFragmentbindingInflater1.close();
                                }
                                if (inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                                    inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                            } catch (IOException e2) {
                                e = e2;
                                inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                                outputStreamTuitionPaymentFragmentbindingInflater1 = null;
                                bufferedOutputStream = null;
                                httpURLConnection2 = httpURLConnection;
                                if (httpURLConnection2 != null) {
                                    if (ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(httpURLConnection2) >= 500 && ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(httpURLConnection2) <= 599) {
                                        throw new RemoteService.ServiceUnavailableException("Service Unavailable", httpURLConnection2.getHeaderField("Retry-After"));
                                    }
                                }
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                                outputStreamTuitionPaymentFragmentbindingInflater1 = null;
                            }
                        } else {
                            httpURLConnection.setConnectTimeout(2000);
                            httpURLConnection.setReadTimeout(30000);
                            builder = new Uri.Builder();
                            while (r9.hasNext()) {
                                builder.appendQueryParameter(entry.getKey(), entry.getValue().toString());
                            }
                            String encodedQuery2 = builder.build().getEncodedQuery();
                            httpURLConnection.setFixedLengthStreamingMode(encodedQuery2.getBytes().length);
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
                            outputStreamTuitionPaymentFragmentbindingInflater1 = ViewPortBuilder.TuitionPaymentFragmentbindingInflater1(httpURLConnection);
                            try {
                                bufferedOutputStream = new BufferedOutputStream(outputStreamTuitionPaymentFragmentbindingInflater1);
                                try {
                                    bufferedOutputStream.write(encodedQuery2.getBytes(Hex.DEFAULT_CHARSET_NAME));
                                    bufferedOutputStream.flush();
                                    bufferedOutputStream.close();
                                    outputStreamTuitionPaymentFragmentbindingInflater1.close();
                                    inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(httpURLConnection);
                                    try {
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        bArr = new byte[8192];
                                        while (true) {
                                            i = inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3.read(bArr, 0, 8192);
                                            if (i != -1) {
                                                break;
                                            }
                                            byteArrayOutputStream.write(bArr, 0, i);
                                        }
                                        byteArrayOutputStream.flush();
                                        byteArray = byteArrayOutputStream.toByteArray();
                                        inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        objArr = true;
                                    } catch (EOFException unused2) {
                                        outputStreamTuitionPaymentFragmentbindingInflater1 = null;
                                        bufferedOutputStream = null;
                                        i2++;
                                        if (bufferedOutputStream != null) {
                                            try {
                                                bufferedOutputStream.close();
                                            } catch (IOException unused3) {
                                            }
                                        }
                                        if (outputStreamTuitionPaymentFragmentbindingInflater1 != null) {
                                            try {
                                                outputStreamTuitionPaymentFragmentbindingInflater1.close();
                                            } catch (IOException unused4) {
                                            }
                                        }
                                        if (inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                                            try {
                                                inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                                            } catch (IOException unused5) {
                                            }
                                        }
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                    } catch (IOException e3) {
                                        e = e3;
                                        outputStreamTuitionPaymentFragmentbindingInflater1 = null;
                                        bufferedOutputStream = null;
                                        httpURLConnection2 = httpURLConnection;
                                        if (httpURLConnection2 != null) {
                                            try {
                                                if (ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(httpURLConnection2) >= 500) {
                                                    throw new RemoteService.ServiceUnavailableException("Service Unavailable", httpURLConnection2.getHeaderField("Retry-After"));
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                httpURLConnection = httpURLConnection2;
                                                bufferedOutputStream2 = bufferedOutputStream;
                                                if (bufferedOutputStream2 != null) {
                                                    try {
                                                        bufferedOutputStream2.close();
                                                    } catch (IOException unused6) {
                                                    }
                                                }
                                                if (outputStreamTuitionPaymentFragmentbindingInflater1 != null) {
                                                    try {
                                                        outputStreamTuitionPaymentFragmentbindingInflater1.close();
                                                    } catch (IOException unused7) {
                                                    }
                                                }
                                                if (inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                                                    try {
                                                        inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                                                    } catch (IOException unused8) {
                                                    }
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                    throw th;
                                                }
                                                throw th;
                                            }
                                        }
                                        throw e;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        outputStreamTuitionPaymentFragmentbindingInflater1 = null;
                                    }
                                } catch (EOFException unused9) {
                                    inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                                    i2++;
                                    if (bufferedOutputStream != null) {
                                        bufferedOutputStream.close();
                                    }
                                    if (outputStreamTuitionPaymentFragmentbindingInflater1 != null) {
                                        outputStreamTuitionPaymentFragmentbindingInflater1.close();
                                    }
                                    if (inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                                        inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                } catch (IOException e4) {
                                    e = e4;
                                    inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                                    httpURLConnection2 = httpURLConnection;
                                    if (httpURLConnection2 != null) {
                                        if (ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(httpURLConnection2) >= 500) {
                                            throw new RemoteService.ServiceUnavailableException("Service Unavailable", httpURLConnection2.getHeaderField("Retry-After"));
                                        }
                                    }
                                    throw e;
                                } catch (Throwable th4) {
                                    th = th4;
                                    inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                                    bufferedOutputStream2 = bufferedOutputStream;
                                }
                            } catch (EOFException unused10) {
                                inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                                bufferedOutputStream = null;
                            } catch (IOException e5) {
                                e = e5;
                                inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                                bufferedOutputStream = null;
                            } catch (Throwable th5) {
                                th = th5;
                                inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                            }
                        }
                    } catch (EOFException unused11) {
                        httpURLConnection = null;
                        inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                        outputStreamTuitionPaymentFragmentbindingInflater1 = null;
                        bufferedOutputStream = null;
                        i2++;
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        if (outputStreamTuitionPaymentFragmentbindingInflater1 != null) {
                            outputStreamTuitionPaymentFragmentbindingInflater1.close();
                        }
                        if (inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                            inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    }
                } catch (EOFException unused12) {
                }
            } catch (IOException e6) {
                e = e6;
                inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                outputStreamTuitionPaymentFragmentbindingInflater1 = null;
                bufferedOutputStream = null;
            } catch (Throwable th6) {
                th = th6;
                httpURLConnection = null;
            }
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.close();
            }
            if (outputStreamTuitionPaymentFragmentbindingInflater1 != null) {
                outputStreamTuitionPaymentFragmentbindingInflater1.close();
            }
            if (inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
                throw th;
            }
            throw th;
        }
        return byteArray;
    }
}
