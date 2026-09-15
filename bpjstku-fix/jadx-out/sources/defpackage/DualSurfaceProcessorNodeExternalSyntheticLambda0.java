package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Build;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.app.NotificationCompat;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;
import com.midtrans.raygun.MessageApiKey;
import com.midtrans.raygun.RaygunPostService;
import com.midtrans.raygun.RaygunSettings;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes4.dex */
public final class DualSurfaceProcessorNodeExternalSyntheticLambda0 {
    public static String TuitionPaymentFragmentbindingInflater1;
    public static Intent TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static Context TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static DualSurfaceProcessorNodeExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public static String b;

    public static void b(Throwable th, List list) throws Throwable {
        ObjectInputStream objectInputStream;
        chooseSurfaceAttrib choosesurfaceattribTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
        choosesurfaceattribTuitionPaymentFragmentspecialinlinedviewModeldefault1.b().g = list;
        DualSurfaceProcessorNodeExternalSyntheticLambda1 dualSurfaceProcessorNodeExternalSyntheticLambda1 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (dualSurfaceProcessorNodeExternalSyntheticLambda1 == null || (choosesurfaceattribTuitionPaymentFragmentspecialinlinedviewModeldefault1 = dualSurfaceProcessorNodeExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1(choosesurfaceattribTuitionPaymentFragmentspecialinlinedviewModeldefault1)) != null) {
            Context context = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (context != null) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting()) {
                    for (File file : TuitionPaymentFragmentspecialinlinedviewModeldefault2.getCacheDir().listFiles()) {
                        try {
                            if (TuitionPaymentFragmentspecialinlinedviewModeldefault2(file.getName()).equalsIgnoreCase("raygun")) {
                                try {
                                    objectInputStream = new ObjectInputStream(new FileInputStream(file));
                                    try {
                                        MessageApiKey messageApiKey = (MessageApiKey) objectInputStream.readObject();
                                        b(messageApiKey.apiKey, messageApiKey.message, false);
                                        file.delete();
                                        objectInputStream.close();
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (objectInputStream != null) {
                                            objectInputStream.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    objectInputStream = null;
                                }
                            } else {
                                continue;
                            }
                        } catch (FileNotFoundException e2) {
                            e2.getMessage();
                        } catch (IOException e3) {
                            e3.getMessage();
                        } catch (ClassNotFoundException e4) {
                            e4.getMessage();
                        }
                    }
                }
            }
            b(TuitionPaymentFragmentbindingInflater1, new Gson().toJson(choosesurfaceattribTuitionPaymentFragmentspecialinlinedviewModeldefault1), false);
        }
    }

    private static void b(String str, String str2, boolean z) {
        System.out.println(str2);
        Intent intent = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (intent == null) {
            intent = new Intent(TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Class<?>) RaygunPostService.class);
            intent.setAction("main.java.com.mindscapehq.android.raygun4android.RaygunClient.RaygunPostService");
            intent.setPackage("main.java.com.mindscapehq.android.raygun4android.RaygunClient");
            intent.setComponent(new ComponentName(TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Class<?>) RaygunPostService.class));
        }
        intent.putExtra(NotificationCompat.CATEGORY_MESSAGE, str2);
        intent.putExtra("apikey", str);
        intent.putExtra("isPulse", "False");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = intent;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2.startService(intent);
    }

    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        if (str == null) {
            return null;
        }
        int iMax = Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
        int iLastIndexOf = str.lastIndexOf(".");
        if (iMax > iLastIndexOf) {
            iLastIndexOf = -1;
        }
        if (iLastIndexOf == -1) {
            return "";
        }
        return str.substring(iLastIndexOf + 1);
    }

    public static class TuitionPaymentFragmentbindingInflater1 implements Thread.UncaughtExceptionHandler {
        private Map TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private Thread.UncaughtExceptionHandler TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentbindingInflater1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) throws Throwable {
            ArrayList arrayList = new ArrayList();
            arrayList.add("UnhandledException");
            arrayList.add(th.getClass().getSimpleName());
            DualSurfaceProcessorNodeExternalSyntheticLambda0.b(th, arrayList);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.uncaughtException(thread, th);
        }
    }

    private static chooseSurfaceAttrib TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) throws Throwable {
        try {
            lambdarelease1androidxcameracoreprocessingconcurrentDualSurfaceProcessorNode lambdarelease1androidxcameracoreprocessingconcurrentdualsurfaceprocessornode = new lambdarelease1androidxcameracoreprocessingconcurrentDualSurfaceProcessorNode();
            Context context = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            lambdarelease1androidxcameracoreprocessingconcurrentdualsurfaceprocessornode.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b().TuitionPaymentFragmentbindingInflater1 = new checkEglErrorOrThrow(context);
            chooseSurfaceAttrib choosesurfaceattribTuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdarelease1androidxcameracoreprocessingconcurrentdualsurfaceprocessornode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Build.MODEL).TuitionPaymentFragmentspecialinlinedviewModeldefault2(th).TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault1(null).b(b).b(TuitionPaymentFragmentspecialinlinedviewModeldefault2).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (b != null) {
                choosesurfaceattribTuitionPaymentFragmentspecialinlinedviewModeldefault2.b().notify = b;
            }
            choosesurfaceattribTuitionPaymentFragmentspecialinlinedviewModeldefault2.b().f352a = new createPBufferSurface(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            return choosesurfaceattribTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        } catch (Exception e2) {
            e2.toString();
            return null;
        }
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, String str2) {
        Boolean bool;
        try {
            if (str.length() == 0) {
                bool = Boolean.FALSE;
            } else {
                bool = Boolean.TRUE;
            }
            if (!bool.booleanValue()) {
                return -1;
            }
            URLConnection uRLConnectionOpenConnection = new URL(RaygunSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2()).openConnection();
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(uRLConnectionOpenConnection);
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
                httpURLConnection.setRequestProperty("X-ApiKey", str);
                httpURLConnection.setRequestProperty(HttpHeaderParser.HEADER_CONTENT_TYPE, "application/json; charset=UTF-8");
                OutputStream outputStreamTuitionPaymentFragmentbindingInflater1 = ViewPortBuilder.TuitionPaymentFragmentbindingInflater1(httpURLConnection);
                outputStreamTuitionPaymentFragmentbindingInflater1.write(str2.toString().getBytes(Hex.DEFAULT_CHARSET_NAME));
                outputStreamTuitionPaymentFragmentbindingInflater1.close();
                return ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(httpURLConnection);
            } finally {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
            e2.printStackTrace();
            return -1;
        }
    }

    public static int TuitionPaymentFragmentbindingInflater1(String str, String str2) {
        Boolean bool;
        try {
            if (str.length() == 0) {
                bool = Boolean.FALSE;
            } else {
                bool = Boolean.TRUE;
            }
            if (!bool.booleanValue()) {
                return -1;
            }
            URLConnection uRLConnectionOpenConnection = new URL(RaygunSettings.b()).openConnection();
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(uRLConnectionOpenConnection);
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
                httpURLConnection.setRequestProperty("X-ApiKey", str);
                httpURLConnection.setRequestProperty(HttpHeaderParser.HEADER_CONTENT_TYPE, "application/json; charset=UTF-8");
                OutputStream outputStreamTuitionPaymentFragmentbindingInflater1 = ViewPortBuilder.TuitionPaymentFragmentbindingInflater1(httpURLConnection);
                outputStreamTuitionPaymentFragmentbindingInflater1.write(str2.getBytes(Hex.DEFAULT_CHARSET_NAME));
                outputStreamTuitionPaymentFragmentbindingInflater1.close();
                return ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(httpURLConnection);
            } finally {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
            e2.printStackTrace();
            return -1;
        }
    }
}
