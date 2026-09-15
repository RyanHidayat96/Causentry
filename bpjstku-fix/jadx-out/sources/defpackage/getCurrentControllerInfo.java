package defpackage;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import com.airbnb.lottie.network.FileExtension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class getCurrentControllerInfo {
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final getRemoteControlClient b;

    public getCurrentControllerInfo(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = applicationContext;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        if (str2 == null) {
            this.b = null;
        } else {
            this.b = new getRemoteControlClient(applicationContext);
        }
    }

    public final rateWithExtras<previous> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        try {
            return TuitionPaymentFragmentbindingInflater1();
        } catch (IOException e2) {
            return new rateWithExtras<>((Throwable) e2);
        }
    }

    private rateWithExtras<previous> TuitionPaymentFragmentbindingInflater1() throws IOException {
        FileExtension fileExtension;
        rateWithExtras<previous> ratewithextrasTuitionPaymentFragmentbindingInflater1;
        onSetCaptioningEnabled.TuitionPaymentFragmentbindingInflater1();
        URLConnection uRLConnectionOpenConnection = new URL(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).openConnection();
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(uRLConnectionOpenConnection);
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
        try {
            httpURLConnection.connect();
            if (httpURLConnection.getErrorStream() == null && ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(httpURLConnection) == 200) {
                String contentType = httpURLConnection.getContentType();
                if (contentType == null) {
                    contentType = "application/json";
                }
                if (contentType.contains("application/zip")) {
                    onSetCaptioningEnabled.TuitionPaymentFragmentbindingInflater1();
                    fileExtension = FileExtension.ZIP;
                    getRemoteControlClient getremotecontrolclient = this.b;
                    if (getremotecontrolclient == null) {
                        ratewithextrasTuitionPaymentFragmentbindingInflater1 = prepareFromUri.b(new ZipInputStream(ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(httpURLConnection)), (String) null);
                    } else {
                        ratewithextrasTuitionPaymentFragmentbindingInflater1 = prepareFromUri.b(new ZipInputStream(new FileInputStream(getremotecontrolclient.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(httpURLConnection), fileExtension))), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    }
                } else {
                    onSetCaptioningEnabled.TuitionPaymentFragmentbindingInflater1();
                    fileExtension = FileExtension.JSON;
                    getRemoteControlClient getremotecontrolclient2 = this.b;
                    if (getremotecontrolclient2 == null) {
                        ratewithextrasTuitionPaymentFragmentbindingInflater1 = prepareFromUri.TuitionPaymentFragmentbindingInflater1(ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(httpURLConnection), (String) null);
                    } else {
                        ratewithextrasTuitionPaymentFragmentbindingInflater1 = prepareFromUri.TuitionPaymentFragmentbindingInflater1(new FileInputStream(new File(getremotecontrolclient2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(httpURLConnection), fileExtension).getAbsolutePath())), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    }
                }
                if (this.b != null && ratewithextrasTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    getRemoteControlClient getremotecontrolclient3 = this.b;
                    File file = new File(getremotecontrolclient3.b(), getRemoteControlClient.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, fileExtension, true));
                    File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
                    boolean zRenameTo = file.renameTo(file2);
                    file2.toString();
                    onSetCaptioningEnabled.TuitionPaymentFragmentbindingInflater1();
                    if (!zRenameTo) {
                        StringBuilder sb = new StringBuilder("Unable to rename cache file ");
                        sb.append(file.getAbsolutePath());
                        sb.append(" to ");
                        sb.append(file2.getAbsolutePath());
                        sb.append(".");
                        onSetCaptioningEnabled.b(sb.toString());
                    }
                }
                previous previousVar = ratewithextrasTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                onSetCaptioningEnabled.TuitionPaymentFragmentbindingInflater1();
                return ratewithextrasTuitionPaymentFragmentbindingInflater1;
            }
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(httpURLConnection);
            StringBuilder sb2 = new StringBuilder("Unable to fetch ");
            sb2.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            sb2.append(". Failed with ");
            sb2.append(ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(httpURLConnection));
            sb2.append("\n");
            sb2.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            return new rateWithExtras<>((Throwable) new IllegalArgumentException(sb2.toString()));
        } catch (Exception e2) {
            return new rateWithExtras<>((Throwable) e2);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault2(HttpURLConnection httpURLConnection) throws Exception {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(httpURLConnection);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            sb.append(line);
                            sb.append('\n');
                        } else {
                            try {
                                break;
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Exception e2) {
                        throw e2;
                    }
                } catch (Throwable th) {
                    bufferedReader.close();
                    throw th;
                }
                bufferedReader.close();
            } catch (Exception unused2) {
            }
            throw th;
        }
        bufferedReader.close();
        return sb.toString();
    }
}
