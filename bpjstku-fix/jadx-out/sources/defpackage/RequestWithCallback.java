package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.browser.trusted.sharing.ShareTarget;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes6.dex */
public final class RequestWithCallback implements TakePictureRequestExternalSyntheticLambda4 {
    private final Context TuitionPaymentFragmentbindingInflater1;
    private final DataEncoder TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private URL TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final CameraConfigs asBinder;
    private final ConnectivityManager b;
    private final CameraConfigs g;

    private static URL TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException("Invalid url: ".concat(String.valueOf(str)), e2);
        }
    }

    private RequestWithCallback(Context context, CameraConfigs cameraConfigs, CameraConfigs cameraConfigs2, byte b) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new JsonDataEncoderBuilder().configureWith(abortSilentlyAndRetry.TuitionPaymentFragmentspecialinlinedviewModeldefault3).ignoreNullValues(true).build();
        this.TuitionPaymentFragmentbindingInflater1 = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(isInMemoryCapture.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        this.g = cameraConfigs2;
        this.asBinder = cameraConfigs;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 130000;
    }

    public RequestWithCallback(Context context, CameraConfigs cameraConfigs, CameraConfigs cameraConfigs2) {
        this(context, cameraConfigs, cameraConfigs2, (byte) 0);
    }

    private static int TuitionPaymentFragmentbindingInflater1(Context context) {
        if (AutoValue_CrashlyticsReport_Session_Event.b(new ArrayList()) != 0) {
            throw null;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            if (Build.VERSION.SDK_INT >= 26) {
                return -1;
            }
            sdkVersion.TuitionPaymentFragmentspecialinlinedviewModeldefault3("TRuntime.", "CctTransportBackend");
            return -1;
        }
    }

    @Override // defpackage.TakePictureRequestExternalSyntheticLambda4
    public final resume TuitionPaymentFragmentspecialinlinedviewModeldefault1(resume resumeVar) {
        int type;
        int subtype;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = resumeVar.cancelAll().TuitionPaymentFragmentspecialinlinedviewModeldefault1("sdk-version", Build.VERSION.SDK_INT).TuitionPaymentFragmentspecialinlinedviewModeldefault2("model", Build.MODEL).TuitionPaymentFragmentspecialinlinedviewModeldefault2("hardware", Build.HARDWARE).TuitionPaymentFragmentspecialinlinedviewModeldefault2("device", Build.DEVICE).TuitionPaymentFragmentspecialinlinedviewModeldefault2("product", Build.PRODUCT).TuitionPaymentFragmentspecialinlinedviewModeldefault2("os-uild", Build.ID).TuitionPaymentFragmentspecialinlinedviewModeldefault2("manufacturer", Build.MANUFACTURER).TuitionPaymentFragmentspecialinlinedviewModeldefault2("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2("tz-offset", TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
        if (activeNetworkInfo != null) {
            type = activeNetworkInfo.getType();
        } else {
            type = NetworkConnectionInfo.NetworkType.NONE.value;
        }
        resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault1("net-type", type);
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = NetworkConnectionInfo.MobileSubtype.COMBINED.value;
            } else if (NetworkConnectionInfo.MobileSubtype.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(subtype) == null) {
                subtype = 0;
            }
        } else {
            subtype = NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.value;
        }
        resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault5 = tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1("mobile-subtype", subtype).TuitionPaymentFragmentspecialinlinedviewModeldefault2("country", Locale.getDefault().getCountry()).TuitionPaymentFragmentspecialinlinedviewModeldefault2("locale", Locale.getDefault().getLanguage());
        String simOperator = ((TelephonyManager) this.TuitionPaymentFragmentbindingInflater1.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault5.TuitionPaymentFragmentspecialinlinedviewModeldefault2("mcc_mnc", simOperator).TuitionPaymentFragmentspecialinlinedviewModeldefault2("application_build", Integer.toString(TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1))).b();
    }

    private createBitmap TuitionPaymentFragmentspecialinlinedviewModeldefault2(TakePictureRequestExternalSyntheticLambda3 takePictureRequestExternalSyntheticLambda3) {
        TakePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        HashMap map = new HashMap();
        for (resume resumeVar : takePictureRequestExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            String strA = resumeVar.a();
            if (!map.containsKey(strA)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(resumeVar);
                map.put(strA, arrayList);
            } else {
                ((List) map.get(strA)).add(resumeVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            resume resumeVar2 = (resume) ((List) entry.getValue()).get(0);
            RgbaImageProxy2.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new getCompleteFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault2().b(QosTier.DEFAULT).TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1()).TuitionPaymentFragmentbindingInflater1(this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault1()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new abortAndSendErrorToApp.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClientInfo.ClientType.ANDROID_FIREBASE).TuitionPaymentFragmentspecialinlinedviewModeldefault1(new checkOnImageCaptured.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(Integer.valueOf(resumeVar2.TuitionPaymentFragmentbindingInflater1("sdk-version"))).a(resumeVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2("model")).TuitionPaymentFragmentbindingInflater1(resumeVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2("hardware")).TuitionPaymentFragmentspecialinlinedviewModeldefault3(resumeVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2("device")).notify(resumeVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2("product")).asInterface(resumeVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2("os-uild")).d(resumeVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2("manufacturer")).b(resumeVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2("fingerprint")).TuitionPaymentFragmentspecialinlinedviewModeldefault2(resumeVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2("country")).asBinder(resumeVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2("locale")).g(resumeVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2("mcc_mnc")).TuitionPaymentFragmentspecialinlinedviewModeldefault1(resumeVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2("application_build")).TuitionPaymentFragmentspecialinlinedviewModeldefault2()).TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            try {
                tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer.valueOf(Integer.parseInt((String) entry.getKey())));
            } catch (NumberFormatException unused) {
                tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (resume resumeVar3 : (List) entry.getValue()) {
                issueNextRequest issuenextrequestTuitionPaymentFragmentspecialinlinedviewModeldefault1 = resumeVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                ProcessingNodeExternalSyntheticLambda7 processingNodeExternalSyntheticLambda7 = issuenextrequestTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (!processingNodeExternalSyntheticLambda7.equals(new ProcessingNodeExternalSyntheticLambda7("proto"))) {
                    if (processingNodeExternalSyntheticLambda7.equals(new ProcessingNodeExternalSyntheticLambda7("json"))) {
                        tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new RequestWithCallbackExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(new String(issuenextrequestTuitionPaymentFragmentspecialinlinedviewModeldefault1.b, Charset.forName(Hex.DEFAULT_CHARSET_NAME)));
                    } else if (Log.isLoggable(Build.VERSION.SDK_INT < 26 ? sdkVersion.TuitionPaymentFragmentspecialinlinedviewModeldefault3("TRuntime.", "CctTransportBackend") : "TRuntime.".concat("CctTransportBackend"), 5)) {
                        new Object[]{processingNodeExternalSyntheticLambda7};
                    }
                } else {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new RequestWithCallbackExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(issuenextrequestTuitionPaymentFragmentspecialinlinedviewModeldefault1.b);
                }
                tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(resumeVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault2()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(resumeVar3.g()).TuitionPaymentFragmentbindingInflater1(resumeVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault3("tz-offset")).TuitionPaymentFragmentspecialinlinedviewModeldefault1(new createImageInfo.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentbindingInflater1(NetworkConnectionInfo.NetworkType.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(resumeVar3.TuitionPaymentFragmentbindingInflater1("net-type"))).TuitionPaymentFragmentspecialinlinedviewModeldefault3(NetworkConnectionInfo.MobileSubtype.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(resumeVar3.TuitionPaymentFragmentbindingInflater1("mobile-subtype"))).TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                if (resumeVar3.TuitionPaymentFragmentbindingInflater1() != null) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(resumeVar3.TuitionPaymentFragmentbindingInflater1());
                }
                if (resumeVar3.asInterface() != null) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(new markComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault2(new setCaptureRequestFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(new lambdanew1androidxcameracoreimagecaptureRequestWithCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(resumeVar3.asInterface()).TuitionPaymentFragmentspecialinlinedviewModeldefault2()).b()).b(ComplianceData.ProductIdOrigin.EVENT_OVERRIDE).TuitionPaymentFragmentbindingInflater1());
                }
                if (resumeVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault3() != null || resumeVar3.d() != null) {
                    lambdanew0androidxcameracoreimagecaptureRequestWithCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new lambdanew0androidxcameracoreimagecaptureRequestWithCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    if (resumeVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault3() != null) {
                        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(resumeVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                    }
                    if (resumeVar3.d() != null) {
                        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(resumeVar3.d());
                    }
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                }
                arrayList3.add(tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.b());
            }
            tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(arrayList3);
            arrayList2.add(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1());
        }
        return new abort(arrayList2);
    }

    final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) throws Exception {
        URL url = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (Log.isLoggable(Build.VERSION.SDK_INT < 26 ? sdkVersion.TuitionPaymentFragmentspecialinlinedviewModeldefault3("TRuntime.", "CctTransportBackend") : "TRuntime.".concat("CctTransportBackend"), 4)) {
            new Object[]{url};
        }
        URLConnection uRLConnectionOpenConnection = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.openConnection();
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(uRLConnectionOpenConnection);
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty(HttpHeaderParser.HEADER_CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        try {
            OutputStream outputStreamTuitionPaymentFragmentbindingInflater1 = ViewPortBuilder.TuitionPaymentFragmentbindingInflater1(httpURLConnection);
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStreamTuitionPaymentFragmentbindingInflater1);
                try {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.encode(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStreamTuitionPaymentFragmentbindingInflater1 != null) {
                        outputStreamTuitionPaymentFragmentbindingInflater1.close();
                    }
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(httpURLConnection);
                    Integer numValueOf = Integer.valueOf(iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    if (Log.isLoggable(Build.VERSION.SDK_INT < 26 ? sdkVersion.TuitionPaymentFragmentspecialinlinedviewModeldefault3("TRuntime.", "CctTransportBackend") : "TRuntime.".concat("CctTransportBackend"), 4)) {
                        new Object[]{numValueOf};
                    }
                    String headerField = httpURLConnection.getHeaderField(HttpHeaderParser.HEADER_CONTENT_TYPE);
                    if (Log.isLoggable(Build.VERSION.SDK_INT < 26 ? sdkVersion.TuitionPaymentFragmentspecialinlinedviewModeldefault3("TRuntime.", "CctTransportBackend") : "TRuntime.".concat("CctTransportBackend"), 3)) {
                        new Object[]{headerField};
                    }
                    String headerField2 = httpURLConnection.getHeaderField("Content-Encoding");
                    if (Log.isLoggable(Build.VERSION.SDK_INT < 26 ? sdkVersion.TuitionPaymentFragmentspecialinlinedviewModeldefault3("TRuntime.", "CctTransportBackend") : "TRuntime.".concat("CctTransportBackend"), 3)) {
                        new Object[]{headerField2};
                    }
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 302 || iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 301 || iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 307) {
                        return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 != 200) {
                        return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, null, 0L);
                    }
                    InputStream inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(httpURLConnection);
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3) : inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        try {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, null, TakePictureCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new BufferedReader(new InputStreamReader(gZIPInputStream))).TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                                inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                            }
                            return tuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            throw th3;
                        }
                        try {
                            inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStreamTuitionPaymentFragmentbindingInflater1 == null) {
                    throw th7;
                }
                try {
                    outputStreamTuitionPaymentFragmentbindingInflater1.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (EncodingException | IOException unused) {
            if (Build.VERSION.SDK_INT < 26) {
                sdkVersion.TuitionPaymentFragmentspecialinlinedviewModeldefault3("TRuntime.", "CctTransportBackend");
            }
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(400, null, 0L);
        } catch (ConnectException | UnknownHostException unused2) {
            if (Build.VERSION.SDK_INT < 26) {
                sdkVersion.TuitionPaymentFragmentspecialinlinedviewModeldefault3("TRuntime.", "CctTransportBackend");
            }
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(500, null, 0L);
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final URL TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final long b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, URL url, long j) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = url;
            this.b = j;
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        final createBitmap TuitionPaymentFragmentbindingInflater1;
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final URL TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(URL url, createBitmap createbitmap, String str) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = url;
            this.TuitionPaymentFragmentbindingInflater1 = createbitmap;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        }
    }

    @Override // defpackage.TakePictureRequestExternalSyntheticLambda4
    public final BackendResponse TuitionPaymentFragmentspecialinlinedviewModeldefault3(TakePictureRequestExternalSyntheticLambda3 takePictureRequestExternalSyntheticLambda3) throws Throwable {
        Object objTuitionPaymentFragmentbindingInflater1;
        createBitmap createbitmapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(takePictureRequestExternalSyntheticLambda3);
        URL urlTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str = null;
        if (takePictureRequestExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1() != null) {
            try {
                String str2 = new String(takePictureRequestExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1(), Charset.forName(Hex.DEFAULT_CHARSET_NAME));
                if (!str2.startsWith("1$")) {
                    throw new IllegalArgumentException("Version marker missing from extras");
                }
                String[] strArrSplit = str2.substring(2).split(Pattern.quote("\\"), 2);
                if (strArrSplit.length != 2) {
                    throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
                }
                String str3 = strArrSplit[0];
                if (str3.isEmpty()) {
                    throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
                }
                String str4 = strArrSplit[1];
                if (str4.isEmpty()) {
                    str4 = null;
                }
                isInMemoryCapture isinmemorycapture = new isInMemoryCapture(str3, str4);
                str = isinmemorycapture.b != null ? isinmemorycapture.b : null;
                if (isinmemorycapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                    urlTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(isinmemorycapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            } catch (IllegalArgumentException unused) {
                return new incrementRetryCounter(BackendResponse.Status.FATAL_ERROR, -1L);
            }
        }
        try {
            Object tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(urlTuitionPaymentFragmentspecialinlinedviewModeldefault2, createbitmapTuitionPaymentFragmentspecialinlinedviewModeldefault2, str);
            AutoValue_DeviceProperties autoValue_DeviceProperties = new AutoValue_DeviceProperties() { // from class: onImageCaptured
                @Override // defpackage.AutoValue_DeviceProperties
                public final Object TuitionPaymentFragmentbindingInflater1(Object obj) {
                    return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3((RequestWithCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3) obj);
                }
            };
            AutoValue_EncoderProfilesProxy_AudioProfileProxy autoValue_EncoderProfilesProxy_AudioProfileProxy = new AutoValue_EncoderProfilesProxy_AudioProfileProxy() { // from class: onCaptureFailure
                @Override // defpackage.AutoValue_EncoderProfilesProxy_AudioProfileProxy
                public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj, Object obj2) {
                    RequestWithCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = (RequestWithCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3) obj;
                    RequestWithCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (RequestWithCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1) obj2;
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        return null;
                    }
                    URL url = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (Log.isLoggable(Build.VERSION.SDK_INT < 26 ? sdkVersion.TuitionPaymentFragmentspecialinlinedviewModeldefault3("TRuntime.", "CctTransportBackend") : "TRuntime.".concat("CctTransportBackend"), 3)) {
                        new Object[]{url};
                    }
                    return new RequestWithCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            };
            int i = 5;
            do {
                objTuitionPaymentFragmentbindingInflater1 = autoValue_DeviceProperties.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
                tuitionPaymentFragmentspecialinlinedviewModeldefault3 = autoValue_EncoderProfilesProxy_AudioProfileProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentspecialinlinedviewModeldefault3, objTuitionPaymentFragmentbindingInflater1);
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    break;
                }
                i--;
            } while (i > 0);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TuitionPaymentFragmentspecialinlinedviewModeldefault1) objTuitionPaymentFragmentbindingInflater1;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != 200) {
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < 500 && tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != 404) {
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != 400) {
                        return new incrementRetryCounter(BackendResponse.Status.FATAL_ERROR, -1L);
                    }
                    return new incrementRetryCounter(BackendResponse.Status.INVALID_PAYLOAD, -1L);
                }
                return new incrementRetryCounter(BackendResponse.Status.TRANSIENT_ERROR, -1L);
            }
            return new incrementRetryCounter(BackendResponse.Status.OK, tuitionPaymentFragmentspecialinlinedviewModeldefault1.b);
        } catch (IOException unused2) {
            if (Build.VERSION.SDK_INT < 26) {
                sdkVersion.TuitionPaymentFragmentspecialinlinedviewModeldefault3("TRuntime.", "CctTransportBackend");
            }
            return new incrementRetryCounter(BackendResponse.Status.TRANSIENT_ERROR, -1L);
        }
    }
}
