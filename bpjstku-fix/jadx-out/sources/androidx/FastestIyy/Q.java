package androidx.FastestIyy;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import com.android.volley.toolbox.HttpHeaderParser;
import defpackage.ViewPortBuilder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import javax.net.ssl.HttpsURLConnection;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes5.dex */
public final class Q extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f266a;
    public final String b;
    public final ArrayList c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S f267e;

    public Q(Context context, S s, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.f266a = context;
        this.f267e = s;
        this.b = str;
        arrayList.add(str2);
        StringBuilder sb = new StringBuilder("===");
        sb.append(System.currentTimeMillis());
        sb.append("===");
        this.d = sb.toString();
    }

    public final void a(String str) throws Throwable {
        int i = 0;
        while (i < 2 && !isCancelled()) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f266a.getSystemService("connectivity")).getActiveNetworkInfo();
            long j = 3600;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) {
                HttpsURLConnection httpsURLConnection = null;
                try {
                    try {
                        ApplicationInfo applicationInfo = this.f266a.getPackageManager().getApplicationInfo(str, 0);
                        URLConnection uRLConnectionOpenConnection = new URL(this.b).openConnection();
                        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(uRLConnectionOpenConnection);
                        HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) uRLConnectionOpenConnection;
                        try {
                            try {
                                httpsURLConnection2.setUseCaches(false);
                                httpsURLConnection2.setDoOutput(true);
                                httpsURLConnection2.setDoInput(true);
                                httpsURLConnection2.setRequestProperty("Accept", "*/*");
                                httpsURLConnection2.setRequestProperty("Connection", "Keep-Alive");
                                httpsURLConnection2.setRequestProperty("Cache-Control", "no-cache");
                                StringBuilder sb = new StringBuilder();
                                sb.append("multipart/form-data; boundary=");
                                sb.append(this.d);
                                httpsURLConnection2.setRequestProperty(HttpHeaderParser.HEADER_CONTENT_TYPE, sb.toString());
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Token ");
                                sb2.append((String) D.a("com.zimperium.zdd.auth_token", ""));
                                httpsURLConnection2.setRequestProperty("Authorization", sb2.toString());
                                OutputStream outputStreamTuitionPaymentFragmentbindingInflater1 = ViewPortBuilder.TuitionPaymentFragmentbindingInflater1((URLConnection) httpsURLConnection2);
                                PrintWriter printWriter = new PrintWriter((Writer) new OutputStreamWriter(outputStreamTuitionPaymentFragmentbindingInflater1, Hex.DEFAULT_CHARSET_NAME), true);
                                a(printWriter, outputStreamTuitionPaymentFragmentbindingInflater1, new File(applicationInfo.publicSourceDir));
                                printWriter.append("\r\n").flush();
                                printWriter.append("--").append((CharSequence) this.d).append("--").append("\r\n");
                                printWriter.close();
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2((HttpURLConnection) httpsURLConnection2);
                                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 200 || iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 201) {
                                    a(httpsURLConnection2);
                                    httpsURLConnection2.disconnect();
                                    return;
                                } else {
                                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 != 503 && iTuitionPaymentFragmentspecialinlinedviewModeldefault2 != 429) {
                                        httpsURLConnection2.disconnect();
                                        return;
                                    }
                                    try {
                                        j = Long.parseLong(httpsURLConnection2.getHeaderField("Retry-After"));
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        Thread.sleep(j);
                                    } catch (Exception unused2) {
                                    }
                                    i++;
                                    httpsURLConnection2.disconnect();
                                }
                            } catch (Throwable th) {
                                th = th;
                                httpsURLConnection = httpsURLConnection2;
                                if (httpsURLConnection != null) {
                                    httpsURLConnection.disconnect();
                                }
                                throw th;
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                            httpsURLConnection = httpsURLConnection2;
                            if (httpsURLConnection != null) {
                                httpsURLConnection.disconnect();
                                return;
                            }
                            return;
                        } catch (IOException unused4) {
                            httpsURLConnection = httpsURLConnection2;
                            try {
                                Thread.sleep(3600L);
                            } catch (Exception unused5) {
                            }
                            i++;
                            if (httpsURLConnection != null) {
                                httpsURLConnection.disconnect();
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (PackageManager.NameNotFoundException unused6) {
                } catch (IOException unused7) {
                }
            } else {
                try {
                    Thread.sleep(3600L);
                } catch (Exception unused8) {
                }
                i++;
            }
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        for (String str : this.c) {
            try {
                a(str);
            } catch (Throwable unused) {
            }
            S s = this.f267e;
            if (s != null) {
                s.f268a.a(this.f266a, str);
            }
        }
        S s2 = this.f267e;
        if (s2 != null) {
            Context context = this.f266a;
            T t = s2.f268a;
            t.b = null;
            try {
                t.c(context);
            } catch (Exception unused2) {
                T t2 = s2.f268a;
                T.e(context);
            }
        }
        return null;
    }

    public final void a(PrintWriter printWriter, OutputStream outputStream, File file) throws IOException {
        file.getAbsolutePath();
        String name = file.getName();
        printWriter.append("--").append((CharSequence) this.d).append("\r\n");
        printWriter.append("Content-Disposition: form-data; name=\"").append("filedata").append("\"; filename=\"").append((CharSequence) name).append((CharSequence) "\"").append((CharSequence) "\r\n");
        printWriter.append("Content-Type: ").append((CharSequence) URLConnection.guessContentTypeFromName(name)).append("\r\n");
        printWriter.append("Content-Transfer-Encoding: binary").append("\r\n");
        printWriter.append("\r\n");
        printWriter.flush();
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[4096];
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i != -1) {
                outputStream.write(bArr, 0, i);
            } else {
                outputStream.flush();
                fileInputStream.close();
                printWriter.flush();
                return;
            }
        }
    }

    public static void a(HttpsURLConnection httpsURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2((URLConnection) httpsURLConnection)));
        while (bufferedReader.readLine() != null) {
        }
        bufferedReader.close();
    }
}
