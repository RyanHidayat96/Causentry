package defpackage;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class OutputConfigurationCompatApi28Impl {
    public static HashMap<String, Uri> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static String b;
    private final Context TuitionPaymentFragmentbindingInflater1;

    public OutputConfigurationCompatApi28Impl(Context context) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new HashMap<>();
        this.TuitionPaymentFragmentbindingInflater1 = context;
    }

    @JavascriptInterface
    public final void downloadFile(String str) throws IOException {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(str));
            intent.addFlags(1);
            this.TuitionPaymentFragmentbindingInflater1.startActivity(intent);
        } catch (Exception e2) {
            LifecycleCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault2("======filedownloaderror").TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2);
        }
    }

    public static String TuitionPaymentFragmentbindingInflater1(String str, String str2) {
        if (str.startsWith("blob")) {
            b = str2;
            StringBuilder sb = new StringBuilder("javascript: var xhr = new XMLHttpRequest();xhr.open('GET', '");
            sb.append(str);
            sb.append("', true);xhr.setRequestHeader('Content-type','");
            sb.append(str2);
            sb.append(";charset=UTF-8');xhr.responseType = 'blob';xhr.onload = function(e) {    if (this.status == 200) {        var blobFile = this.response;        var reader = new FileReader();        reader.readAsDataURL(blobFile);        reader.onloadend = function() {            base64data = reader.result;            Android.getBase64FromBlobData(base64data);        }    }};xhr.send();");
            return sb.toString();
        }
        return "javascript: console.log('It is not a Blob URL');";
    }

    @JavascriptInterface
    public final void getBase64FromBlobData(String str) throws IOException {
        String strReplaceAll = DateFormat.getDateTimeInstance().format(new Date()).replaceFirst(", ", "_").replaceAll(" ", "_").replaceAll(":", "-");
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(b);
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
        sb.append("/");
        sb.append(strReplaceAll);
        sb.append("_.");
        sb.append(extensionFromMimeType);
        File file = new File(sb.toString());
        StringBuilder sb2 = new StringBuilder("^data:");
        sb2.append(b);
        sb2.append(";base64,");
        byte[] bArrDecode = Base64.decode(str.replaceFirst(sb2.toString(), ""), 0);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArrDecode);
            fileOutputStream.flush();
        } catch (Exception e2) {
            Toast.makeText(this.TuitionPaymentFragmentbindingInflater1, "FAILED TO DOWNLOAD THE FILE!", 0).show();
            e2.printStackTrace();
        }
        if (file.exists()) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            Context context = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.TuitionPaymentFragmentbindingInflater1.getApplicationContext().getPackageName());
            sb3.append(".provider");
            intent.setDataAndType(FileProvider.getUriForFile(context, sb3.toString(), file), MimeTypeMap.getSingleton().getMimeTypeFromExtension(extensionFromMimeType));
            intent.addFlags(1);
            PendingIntent activity = PendingIntent.getActivity(this.TuitionPaymentFragmentbindingInflater1, 1, intent, 335544320);
            final NotificationManager notificationManager = (NotificationManager) this.TuitionPaymentFragmentbindingInflater1.getSystemService("notification");
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("JMOCHANNEL", "name", 2);
                Notification notificationBuild = new Notification.Builder(this.TuitionPaymentFragmentbindingInflater1, "JMOCHANNEL").setContentText("You have got something new!").setContentTitle("File downloaded").setContentIntent(activity).setChannelId("JMOCHANNEL").setSmallIcon(R.drawable.stat_sys_download_done).build();
                if (notificationManager != null) {
                    notificationManager.createNotificationChannel(notificationChannel);
                    notificationManager.notify(1, notificationBuild);
                }
            } else {
                NotificationCompat.Builder contentText = new NotificationCompat.Builder(this.TuitionPaymentFragmentbindingInflater1, "JMOCHANNEL").setDefaults(-1).setWhen(System.currentTimeMillis()).setSmallIcon(R.drawable.sym_action_chat).setContentTitle("JMO").setContentText("BPJS Ketenagakerjaan");
                if (notificationManager != null) {
                    notificationManager.notify(1, contentText.build());
                    new Handler().postDelayed(new Runnable() { // from class: OutputConfigurationCompatApi28Impl.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            notificationManager.cancel(1);
                        }
                    }, 1000L);
                }
            }
        }
        Toast.makeText(this.TuitionPaymentFragmentbindingInflater1, "FILE DOWNLOADED!", 0).show();
    }
}
