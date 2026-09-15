package com.google.firebase.crashlytics.internal.network;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.gson.internal.bind.TypeAdapters;
import defpackage.ViewPortBuilder;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import javax.net.ssl.HttpsURLConnection;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes6.dex */
public class HttpGetRequest {
    private static final int DEFAULT_TIMEOUT_MS = 10000;
    private static final String METHOD_GET = "GET";
    private static final int READ_BUFFER_SIZE = 8192;
    private static char[] TuitionPaymentFragmentbindingInflater1;
    private static long b;
    private final Map<String, String> headers = new HashMap();
    private final Map<String, String> queryParams;
    private final String url;
    private static final byte[] $$c = {114, -115, 48, 84};
    private static final int $$d = 39;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {108, -26, -110, 50};
    private static final int $$b = 9;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.firebase.crashlytics.internal.network.HttpGetRequest.$$a
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r9 = r9 * 2
            int r9 = 3 - r9
            int r8 = r8 + 97
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r8 = r9
            r4 = r2
            goto L2c
        L15:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r8]
        L2c:
            int r3 = -r3
            int r9 = r9 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.network.HttpGetRequest.c(int, byte, byte, java.lang.Object[]):void");
    }

    public HttpGetRequest(String str, Map<String, String> map) {
        this.url = str;
        this.queryParams = map;
    }

    public HttpGetRequest header(String str, String str2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.headers.put(str, str2);
        if (i3 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public HttpGetRequest header(Map.Entry<String, String> entry) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        HttpGetRequest httpGetRequestHeader = header(entry.getKey(), entry.getValue());
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        return httpGetRequestHeader;
    }

    public HttpResponse execute() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        int i = 2 % 2;
        CrashlyticsWorkers.checkBlockingThread();
        InputStream inputStream = null;
        String stream = null;
        inputStream = null;
        try {
            String strCreateUrlWithParams = createUrlWithParams(this.url, this.queryParams);
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("GET Request URL: ");
            sb.append(strCreateUrlWithParams);
            logger.v(sb.toString());
            URLConnection uRLConnectionOpenConnection = new URL(strCreateUrlWithParams).openConnection();
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(uRLConnectionOpenConnection);
            httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
            try {
                httpsURLConnection.setReadTimeout(DEFAULT_TIMEOUT_MS);
                httpsURLConnection.setConnectTimeout(DEFAULT_TIMEOUT_MS);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry<String, String> entry : this.headers.entrySet()) {
                    int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                    int i3 = i2 % 2;
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2((HttpURLConnection) httpsURLConnection);
                InputStream inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3((HttpURLConnection) httpsURLConnection);
                if (inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                    try {
                        if (i4 % 2 == 0) {
                            readStream(inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            throw null;
                        }
                        stream = readStream(inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                    inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                }
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                return new HttpResponse(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, stream);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $10 + 91;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i / i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - MotionEvent.axisFromString("")), 2187 - View.resolveSize(0, 0), 40 - ExpandableListView.getPackedPositionType(0L), 841711447, false, $$e(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(b), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.rgb(0, 0, 0) + 16810233), MotionEvent.axisFromString("") + 3012, 26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 321985076, false, $$e(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (b6 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36504 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 3376, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16, -968507904, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i + i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) (-1);
                        byte b9 = (byte) (b8 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 2187 - Color.red(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 40, 841711447, false, $$e(b8, b9, (byte) (b9 + 2)), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(b), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b10 = (byte) (-1);
                            byte b11 = (byte) (b10 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (View.MeasureSpec.getSize(0) + 33017), 3011 - Color.alpha(0), 26 - (Process.myTid() >> 22), 321985076, false, $$e(b10, b11, b11), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                        try {
                            Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                byte b12 = (byte) (-1);
                                byte b13 = (byte) (b12 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (AndroidCharacter.getMirror('0') + 36457), 3375 - TextUtils.lastIndexOf("", '0', 0, 0), Color.red(0) + 17, -968507904, false, $$e(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                byte b14 = (byte) (-1);
                byte b15 = (byte) (b14 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 36505), Color.alpha(0) + 3376, 'A' - AndroidCharacter.getMirror('0'), -968507904, false, $$e(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
        int i7 = $10 + 125;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 67 / 0;
        }
    }

    private String createUrlWithParams(String str, Map<String, String> map) throws UnsupportedEncodingException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        String strCreateParamsString = createParamsString(map);
        if (strCreateParamsString.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("?");
            sb.append(strCreateParamsString);
            return sb.toString();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            if (!str.endsWith("&")) {
                strCreateParamsString = "&".concat(String.valueOf(strCreateParamsString));
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(strCreateParamsString);
            return sb2.toString();
        }
        str.endsWith("&");
        throw null;
    }

    private String createParamsString(Map<String, String> map) throws UnsupportedEncodingException {
        String strEncode;
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        sb.append(next.getKey());
        sb.append("=");
        if (next.getValue() != null) {
            strEncode = URLEncoder.encode(next.getValue(), Hex.DEFAULT_CHARSET_NAME);
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
        } else {
            strEncode = "";
        }
        sb.append(strEncode);
        while (it.hasNext()) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 != 0) {
                Map.Entry<String, String> next2 = it.next();
                sb.append("&");
                sb.append(next2.getKey());
                sb.append("=");
                next2.getValue();
                throw null;
            }
            Map.Entry<String, String> next3 = it.next();
            sb.append("&");
            sb.append(next3.getKey());
            sb.append("=");
            sb.append(next3.getValue() != null ? URLEncoder.encode(next3.getValue(), Hex.DEFAULT_CHARSET_NAME) : "");
        }
        String string = sb.toString();
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
        return string;
    }

    private String readStream(InputStream inputStream) throws IOException {
        int i = 2 % 2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Hex.DEFAULT_CHARSET_NAME));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        while (true) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = bufferedReader.read(cArr);
            if (i4 == -1) {
                return sb.toString();
            }
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 != 0) {
                sb.append(cArr, 1, i4);
            } else {
                sb.append(cArr, 0, i4);
            }
            i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0c7b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0c7e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0c91 A[Catch: all -> 0x0cfd, IOException -> 0x0d09, TRY_ENTER, TryCatch #23 {IOException -> 0x0d09, all -> 0x0cfd, blocks: (B:98:0x0c71, B:99:0x0c74, B:105:0x0c91, B:107:0x0c97, B:110:0x0ca6, B:114:0x0cad), top: B:542:0x0c71 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0c97 A[Catch: all -> 0x0cfd, IOException -> 0x0d09, TryCatch #23 {IOException -> 0x0d09, all -> 0x0cfd, blocks: (B:98:0x0c71, B:99:0x0c74, B:105:0x0c91, B:107:0x0c97, B:110:0x0ca6, B:114:0x0cad), top: B:542:0x0c71 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0ca4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0ca6 A[Catch: all -> 0x0cfd, IOException -> 0x0d09, TryCatch #23 {IOException -> 0x0d09, all -> 0x0cfd, blocks: (B:98:0x0c71, B:99:0x0c74, B:105:0x0c91, B:107:0x0c97, B:110:0x0ca6, B:114:0x0cad), top: B:542:0x0c71 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0caa  */
    /* JADX WARN: Code duplicated, block: B:114:0x0cad A[Catch: all -> 0x0cfd, IOException -> 0x0d09, TRY_LEAVE, TryCatch #23 {IOException -> 0x0d09, all -> 0x0cfd, blocks: (B:98:0x0c71, B:99:0x0c74, B:105:0x0c91, B:107:0x0c97, B:110:0x0ca6, B:114:0x0cad), top: B:542:0x0c71 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0cd2 A[LOOP:21: B:113:0x0cab->B:117:0x0cd2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x0cf0  */
    /* JADX WARN: Code duplicated, block: B:126:0x0cf2  */
    /* JADX WARN: Code duplicated, block: B:130:0x0cfa  */
    /* JADX WARN: Code duplicated, block: B:141:0x0d0e  */
    /* JADX WARN: Code duplicated, block: B:145:0x0d50 A[Catch: all -> 0x024b, TryCatch #6 {all -> 0x024b, blocks: (B:6:0x0143, B:8:0x0150, B:9:0x0187, B:21:0x02cb, B:23:0x02d8, B:24:0x0316, B:31:0x0412, B:33:0x041f, B:35:0x0461, B:60:0x0648, B:62:0x064e, B:63:0x068a, B:65:0x07ea, B:67:0x07f7, B:68:0x0840, B:73:0x09cd, B:75:0x09da, B:76:0x0a1a, B:83:0x0b51, B:85:0x0b5e, B:87:0x0ba3, B:143:0x0d43, B:145:0x0d50, B:146:0x0d8d, B:157:0x0f00, B:159:0x0f0d, B:160:0x0f46, B:164:0x0f55, B:166:0x0f62, B:167:0x0fa1, B:302:0x135a, B:304:0x1367, B:305:0x13a5, B:321:0x151d, B:323:0x152a, B:324:0x1565, B:331:0x1644, B:333:0x164a, B:334:0x1682, B:337:0x1717, B:339:0x1729, B:340:0x175f, B:346:0x1865, B:348:0x1872, B:350:0x18bc, B:352:0x18c5, B:354:0x18dd, B:355:0x1922, B:406:0x2909, B:408:0x2916, B:409:0x2957, B:426:0x2e9f, B:428:0x2eac, B:430:0x2ef3, B:436:0x2fd3, B:438:0x2fe0, B:439:0x301d, B:461:0x3417, B:463:0x3424, B:465:0x3473, B:494:0x36f9, B:496:0x3706, B:497:0x373d, B:412:0x2964, B:414:0x297c, B:415:0x29c2, B:365:0x2630, B:367:0x263d, B:369:0x268b, B:376:0x26a7, B:378:0x26b4, B:380:0x26ff, B:41:0x053a, B:43:0x0547, B:44:0x0589, B:50:0x05d4, B:52:0x05e1, B:53:0x0621), top: B:527:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0dd1  */
    /* JADX WARN: Code duplicated, block: B:150:0x0dd7  */
    /* JADX WARN: Code duplicated, block: B:154:0x0eed  */
    /* JADX WARN: Code duplicated, block: B:159:0x0f0d A[Catch: all -> 0x024b, TryCatch #6 {all -> 0x024b, blocks: (B:6:0x0143, B:8:0x0150, B:9:0x0187, B:21:0x02cb, B:23:0x02d8, B:24:0x0316, B:31:0x0412, B:33:0x041f, B:35:0x0461, B:60:0x0648, B:62:0x064e, B:63:0x068a, B:65:0x07ea, B:67:0x07f7, B:68:0x0840, B:73:0x09cd, B:75:0x09da, B:76:0x0a1a, B:83:0x0b51, B:85:0x0b5e, B:87:0x0ba3, B:143:0x0d43, B:145:0x0d50, B:146:0x0d8d, B:157:0x0f00, B:159:0x0f0d, B:160:0x0f46, B:164:0x0f55, B:166:0x0f62, B:167:0x0fa1, B:302:0x135a, B:304:0x1367, B:305:0x13a5, B:321:0x151d, B:323:0x152a, B:324:0x1565, B:331:0x1644, B:333:0x164a, B:334:0x1682, B:337:0x1717, B:339:0x1729, B:340:0x175f, B:346:0x1865, B:348:0x1872, B:350:0x18bc, B:352:0x18c5, B:354:0x18dd, B:355:0x1922, B:406:0x2909, B:408:0x2916, B:409:0x2957, B:426:0x2e9f, B:428:0x2eac, B:430:0x2ef3, B:436:0x2fd3, B:438:0x2fe0, B:439:0x301d, B:461:0x3417, B:463:0x3424, B:465:0x3473, B:494:0x36f9, B:496:0x3706, B:497:0x373d, B:412:0x2964, B:414:0x297c, B:415:0x29c2, B:365:0x2630, B:367:0x263d, B:369:0x268b, B:376:0x26a7, B:378:0x26b4, B:380:0x26ff, B:41:0x053a, B:43:0x0547, B:44:0x0589, B:50:0x05d4, B:52:0x05e1, B:53:0x0621), top: B:527:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0f53  */
    /* JADX WARN: Code duplicated, block: B:166:0x0f62 A[Catch: all -> 0x024b, TryCatch #6 {all -> 0x024b, blocks: (B:6:0x0143, B:8:0x0150, B:9:0x0187, B:21:0x02cb, B:23:0x02d8, B:24:0x0316, B:31:0x0412, B:33:0x041f, B:35:0x0461, B:60:0x0648, B:62:0x064e, B:63:0x068a, B:65:0x07ea, B:67:0x07f7, B:68:0x0840, B:73:0x09cd, B:75:0x09da, B:76:0x0a1a, B:83:0x0b51, B:85:0x0b5e, B:87:0x0ba3, B:143:0x0d43, B:145:0x0d50, B:146:0x0d8d, B:157:0x0f00, B:159:0x0f0d, B:160:0x0f46, B:164:0x0f55, B:166:0x0f62, B:167:0x0fa1, B:302:0x135a, B:304:0x1367, B:305:0x13a5, B:321:0x151d, B:323:0x152a, B:324:0x1565, B:331:0x1644, B:333:0x164a, B:334:0x1682, B:337:0x1717, B:339:0x1729, B:340:0x175f, B:346:0x1865, B:348:0x1872, B:350:0x18bc, B:352:0x18c5, B:354:0x18dd, B:355:0x1922, B:406:0x2909, B:408:0x2916, B:409:0x2957, B:426:0x2e9f, B:428:0x2eac, B:430:0x2ef3, B:436:0x2fd3, B:438:0x2fe0, B:439:0x301d, B:461:0x3417, B:463:0x3424, B:465:0x3473, B:494:0x36f9, B:496:0x3706, B:497:0x373d, B:412:0x2964, B:414:0x297c, B:415:0x29c2, B:365:0x2630, B:367:0x263d, B:369:0x268b, B:376:0x26a7, B:378:0x26b4, B:380:0x26ff, B:41:0x053a, B:43:0x0547, B:44:0x0589, B:50:0x05d4, B:52:0x05e1, B:53:0x0621), top: B:527:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x1055  */
    /* JADX WARN: Code duplicated, block: B:184:0x1058  */
    /* JADX WARN: Code duplicated, block: B:186:0x1064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x1066 A[Catch: all -> 0x113a, IOException -> 0x1146, TRY_ENTER, TRY_LEAVE, TryCatch #20 {IOException -> 0x1146, all -> 0x113a, blocks: (B:179:0x104b, B:180:0x104e, B:187:0x1066, B:202:0x10a6, B:214:0x1109), top: B:548:0x104b }] */
    /* JADX WARN: Code duplicated, block: B:189:0x106c  */
    /* JADX WARN: Code duplicated, block: B:191:0x1081  */
    /* JADX WARN: Code duplicated, block: B:192:0x1086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:193:0x1088  */
    /* JADX WARN: Code duplicated, block: B:195:0x108c  */
    /* JADX WARN: Code duplicated, block: B:197:0x109e  */
    /* JADX WARN: Code duplicated, block: B:198:0x10a0  */
    /* JADX WARN: Code duplicated, block: B:201:0x10a4  */
    /* JADX WARN: Code duplicated, block: B:205:0x10cb A[LOOP:13: B:200:0x10a2->B:205:0x10cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:217:0x1114  */
    /* JADX WARN: Code duplicated, block: B:218:0x1116  */
    /* JADX WARN: Code duplicated, block: B:221:0x111c  */
    /* JADX WARN: Code duplicated, block: B:223:0x112b  */
    /* JADX WARN: Code duplicated, block: B:225:0x1133  */
    /* JADX WARN: Code duplicated, block: B:239:0x1185  */
    /* JADX WARN: Code duplicated, block: B:240:0x1197  */
    /* JADX WARN: Code duplicated, block: B:249:0x11e1  */
    /* JADX WARN: Code duplicated, block: B:254:0x11ec  */
    /* JADX WARN: Code duplicated, block: B:256:0x11fd  */
    /* JADX WARN: Code duplicated, block: B:257:0x1200  */
    /* JADX WARN: Code duplicated, block: B:258:0x1203 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:259:0x1205  */
    /* JADX WARN: Code duplicated, block: B:261:0x1209  */
    /* JADX WARN: Code duplicated, block: B:263:0x120c A[Catch: all -> 0x1274, IOException -> 0x1280, TRY_ENTER, TRY_LEAVE, TryCatch #22 {IOException -> 0x1280, all -> 0x1274, blocks: (B:246:0x11d7, B:247:0x11da, B:252:0x11e6, B:263:0x120c), top: B:544:0x11d7 }] */
    /* JADX WARN: Code duplicated, block: B:266:0x1228 A[LOOP:17: B:262:0x120a->B:266:0x1228, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:273:0x124e  */
    /* JADX WARN: Code duplicated, block: B:274:0x1250  */
    /* JADX WARN: Code duplicated, block: B:279:0x1267  */
    /* JADX WARN: Code duplicated, block: B:280:0x126e  */
    /* JADX WARN: Code duplicated, block: B:291:0x1285  */
    /* JADX WARN: Code duplicated, block: B:294:0x12a2  */
    /* JADX WARN: Code duplicated, block: B:295:0x12a5  */
    /* JADX WARN: Code duplicated, block: B:298:0x12b4  */
    /* JADX WARN: Code duplicated, block: B:301:0x1358  */
    /* JADX WARN: Code duplicated, block: B:304:0x1367 A[Catch: all -> 0x024b, TryCatch #6 {all -> 0x024b, blocks: (B:6:0x0143, B:8:0x0150, B:9:0x0187, B:21:0x02cb, B:23:0x02d8, B:24:0x0316, B:31:0x0412, B:33:0x041f, B:35:0x0461, B:60:0x0648, B:62:0x064e, B:63:0x068a, B:65:0x07ea, B:67:0x07f7, B:68:0x0840, B:73:0x09cd, B:75:0x09da, B:76:0x0a1a, B:83:0x0b51, B:85:0x0b5e, B:87:0x0ba3, B:143:0x0d43, B:145:0x0d50, B:146:0x0d8d, B:157:0x0f00, B:159:0x0f0d, B:160:0x0f46, B:164:0x0f55, B:166:0x0f62, B:167:0x0fa1, B:302:0x135a, B:304:0x1367, B:305:0x13a5, B:321:0x151d, B:323:0x152a, B:324:0x1565, B:331:0x1644, B:333:0x164a, B:334:0x1682, B:337:0x1717, B:339:0x1729, B:340:0x175f, B:346:0x1865, B:348:0x1872, B:350:0x18bc, B:352:0x18c5, B:354:0x18dd, B:355:0x1922, B:406:0x2909, B:408:0x2916, B:409:0x2957, B:426:0x2e9f, B:428:0x2eac, B:430:0x2ef3, B:436:0x2fd3, B:438:0x2fe0, B:439:0x301d, B:461:0x3417, B:463:0x3424, B:465:0x3473, B:494:0x36f9, B:496:0x3706, B:497:0x373d, B:412:0x2964, B:414:0x297c, B:415:0x29c2, B:365:0x2630, B:367:0x263d, B:369:0x268b, B:376:0x26a7, B:378:0x26b4, B:380:0x26ff, B:41:0x053a, B:43:0x0547, B:44:0x0589, B:50:0x05d4, B:52:0x05e1, B:53:0x0621), top: B:527:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:309:0x146d A[LOOP:4: B:299:0x1355->B:309:0x146d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:312:0x1493  */
    /* JADX WARN: Code duplicated, block: B:315:0x14a8  */
    /* JADX WARN: Code duplicated, block: B:317:0x14bc  */
    /* JADX WARN: Code duplicated, block: B:320:0x151b  */
    /* JADX WARN: Code duplicated, block: B:323:0x152a A[Catch: all -> 0x024b, TryCatch #6 {all -> 0x024b, blocks: (B:6:0x0143, B:8:0x0150, B:9:0x0187, B:21:0x02cb, B:23:0x02d8, B:24:0x0316, B:31:0x0412, B:33:0x041f, B:35:0x0461, B:60:0x0648, B:62:0x064e, B:63:0x068a, B:65:0x07ea, B:67:0x07f7, B:68:0x0840, B:73:0x09cd, B:75:0x09da, B:76:0x0a1a, B:83:0x0b51, B:85:0x0b5e, B:87:0x0ba3, B:143:0x0d43, B:145:0x0d50, B:146:0x0d8d, B:157:0x0f00, B:159:0x0f0d, B:160:0x0f46, B:164:0x0f55, B:166:0x0f62, B:167:0x0fa1, B:302:0x135a, B:304:0x1367, B:305:0x13a5, B:321:0x151d, B:323:0x152a, B:324:0x1565, B:331:0x1644, B:333:0x164a, B:334:0x1682, B:337:0x1717, B:339:0x1729, B:340:0x175f, B:346:0x1865, B:348:0x1872, B:350:0x18bc, B:352:0x18c5, B:354:0x18dd, B:355:0x1922, B:406:0x2909, B:408:0x2916, B:409:0x2957, B:426:0x2e9f, B:428:0x2eac, B:430:0x2ef3, B:436:0x2fd3, B:438:0x2fe0, B:439:0x301d, B:461:0x3417, B:463:0x3424, B:465:0x3473, B:494:0x36f9, B:496:0x3706, B:497:0x373d, B:412:0x2964, B:414:0x297c, B:415:0x29c2, B:365:0x2630, B:367:0x263d, B:369:0x268b, B:376:0x26a7, B:378:0x26b4, B:380:0x26ff, B:41:0x053a, B:43:0x0547, B:44:0x0589, B:50:0x05d4, B:52:0x05e1, B:53:0x0621), top: B:527:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:328:0x1618 A[LOOP:5: B:319:0x1519->B:328:0x1618, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:333:0x164a A[Catch: all -> 0x024b, TryCatch #6 {all -> 0x024b, blocks: (B:6:0x0143, B:8:0x0150, B:9:0x0187, B:21:0x02cb, B:23:0x02d8, B:24:0x0316, B:31:0x0412, B:33:0x041f, B:35:0x0461, B:60:0x0648, B:62:0x064e, B:63:0x068a, B:65:0x07ea, B:67:0x07f7, B:68:0x0840, B:73:0x09cd, B:75:0x09da, B:76:0x0a1a, B:83:0x0b51, B:85:0x0b5e, B:87:0x0ba3, B:143:0x0d43, B:145:0x0d50, B:146:0x0d8d, B:157:0x0f00, B:159:0x0f0d, B:160:0x0f46, B:164:0x0f55, B:166:0x0f62, B:167:0x0fa1, B:302:0x135a, B:304:0x1367, B:305:0x13a5, B:321:0x151d, B:323:0x152a, B:324:0x1565, B:331:0x1644, B:333:0x164a, B:334:0x1682, B:337:0x1717, B:339:0x1729, B:340:0x175f, B:346:0x1865, B:348:0x1872, B:350:0x18bc, B:352:0x18c5, B:354:0x18dd, B:355:0x1922, B:406:0x2909, B:408:0x2916, B:409:0x2957, B:426:0x2e9f, B:428:0x2eac, B:430:0x2ef3, B:436:0x2fd3, B:438:0x2fe0, B:439:0x301d, B:461:0x3417, B:463:0x3424, B:465:0x3473, B:494:0x36f9, B:496:0x3706, B:497:0x373d, B:412:0x2964, B:414:0x297c, B:415:0x29c2, B:365:0x2630, B:367:0x263d, B:369:0x268b, B:376:0x26a7, B:378:0x26b4, B:380:0x26ff, B:41:0x053a, B:43:0x0547, B:44:0x0589, B:50:0x05d4, B:52:0x05e1, B:53:0x0621), top: B:527:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:337:0x1717 A[Catch: all -> 0x024b, TRY_ENTER, TryCatch #6 {all -> 0x024b, blocks: (B:6:0x0143, B:8:0x0150, B:9:0x0187, B:21:0x02cb, B:23:0x02d8, B:24:0x0316, B:31:0x0412, B:33:0x041f, B:35:0x0461, B:60:0x0648, B:62:0x064e, B:63:0x068a, B:65:0x07ea, B:67:0x07f7, B:68:0x0840, B:73:0x09cd, B:75:0x09da, B:76:0x0a1a, B:83:0x0b51, B:85:0x0b5e, B:87:0x0ba3, B:143:0x0d43, B:145:0x0d50, B:146:0x0d8d, B:157:0x0f00, B:159:0x0f0d, B:160:0x0f46, B:164:0x0f55, B:166:0x0f62, B:167:0x0fa1, B:302:0x135a, B:304:0x1367, B:305:0x13a5, B:321:0x151d, B:323:0x152a, B:324:0x1565, B:331:0x1644, B:333:0x164a, B:334:0x1682, B:337:0x1717, B:339:0x1729, B:340:0x175f, B:346:0x1865, B:348:0x1872, B:350:0x18bc, B:352:0x18c5, B:354:0x18dd, B:355:0x1922, B:406:0x2909, B:408:0x2916, B:409:0x2957, B:426:0x2e9f, B:428:0x2eac, B:430:0x2ef3, B:436:0x2fd3, B:438:0x2fe0, B:439:0x301d, B:461:0x3417, B:463:0x3424, B:465:0x3473, B:494:0x36f9, B:496:0x3706, B:497:0x373d, B:412:0x2964, B:414:0x297c, B:415:0x29c2, B:365:0x2630, B:367:0x263d, B:369:0x268b, B:376:0x26a7, B:378:0x26b4, B:380:0x26ff, B:41:0x053a, B:43:0x0547, B:44:0x0589, B:50:0x05d4, B:52:0x05e1, B:53:0x0621), top: B:527:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:339:0x1729 A[Catch: all -> 0x024b, TryCatch #6 {all -> 0x024b, blocks: (B:6:0x0143, B:8:0x0150, B:9:0x0187, B:21:0x02cb, B:23:0x02d8, B:24:0x0316, B:31:0x0412, B:33:0x041f, B:35:0x0461, B:60:0x0648, B:62:0x064e, B:63:0x068a, B:65:0x07ea, B:67:0x07f7, B:68:0x0840, B:73:0x09cd, B:75:0x09da, B:76:0x0a1a, B:83:0x0b51, B:85:0x0b5e, B:87:0x0ba3, B:143:0x0d43, B:145:0x0d50, B:146:0x0d8d, B:157:0x0f00, B:159:0x0f0d, B:160:0x0f46, B:164:0x0f55, B:166:0x0f62, B:167:0x0fa1, B:302:0x135a, B:304:0x1367, B:305:0x13a5, B:321:0x151d, B:323:0x152a, B:324:0x1565, B:331:0x1644, B:333:0x164a, B:334:0x1682, B:337:0x1717, B:339:0x1729, B:340:0x175f, B:346:0x1865, B:348:0x1872, B:350:0x18bc, B:352:0x18c5, B:354:0x18dd, B:355:0x1922, B:406:0x2909, B:408:0x2916, B:409:0x2957, B:426:0x2e9f, B:428:0x2eac, B:430:0x2ef3, B:436:0x2fd3, B:438:0x2fe0, B:439:0x301d, B:461:0x3417, B:463:0x3424, B:465:0x3473, B:494:0x36f9, B:496:0x3706, B:497:0x373d, B:412:0x2964, B:414:0x297c, B:415:0x29c2, B:365:0x2630, B:367:0x263d, B:369:0x268b, B:376:0x26a7, B:378:0x26b4, B:380:0x26ff, B:41:0x053a, B:43:0x0547, B:44:0x0589, B:50:0x05d4, B:52:0x05e1, B:53:0x0621), top: B:527:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:343:0x1811  */
    /* JADX WARN: Code duplicated, block: B:344:0x1817  */
    /* JADX WARN: Code duplicated, block: B:348:0x1872 A[Catch: all -> 0x024b, TryCatch #6 {all -> 0x024b, blocks: (B:6:0x0143, B:8:0x0150, B:9:0x0187, B:21:0x02cb, B:23:0x02d8, B:24:0x0316, B:31:0x0412, B:33:0x041f, B:35:0x0461, B:60:0x0648, B:62:0x064e, B:63:0x068a, B:65:0x07ea, B:67:0x07f7, B:68:0x0840, B:73:0x09cd, B:75:0x09da, B:76:0x0a1a, B:83:0x0b51, B:85:0x0b5e, B:87:0x0ba3, B:143:0x0d43, B:145:0x0d50, B:146:0x0d8d, B:157:0x0f00, B:159:0x0f0d, B:160:0x0f46, B:164:0x0f55, B:166:0x0f62, B:167:0x0fa1, B:302:0x135a, B:304:0x1367, B:305:0x13a5, B:321:0x151d, B:323:0x152a, B:324:0x1565, B:331:0x1644, B:333:0x164a, B:334:0x1682, B:337:0x1717, B:339:0x1729, B:340:0x175f, B:346:0x1865, B:348:0x1872, B:350:0x18bc, B:352:0x18c5, B:354:0x18dd, B:355:0x1922, B:406:0x2909, B:408:0x2916, B:409:0x2957, B:426:0x2e9f, B:428:0x2eac, B:430:0x2ef3, B:436:0x2fd3, B:438:0x2fe0, B:439:0x301d, B:461:0x3417, B:463:0x3424, B:465:0x3473, B:494:0x36f9, B:496:0x3706, B:497:0x373d, B:412:0x2964, B:414:0x297c, B:415:0x29c2, B:365:0x2630, B:367:0x263d, B:369:0x268b, B:376:0x26a7, B:378:0x26b4, B:380:0x26ff, B:41:0x053a, B:43:0x0547, B:44:0x0589, B:50:0x05d4, B:52:0x05e1, B:53:0x0621), top: B:527:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:349:0x18ba  */
    /* JADX WARN: Code duplicated, block: B:352:0x18c5 A[Catch: all -> 0x024b, TryCatch #6 {all -> 0x024b, blocks: (B:6:0x0143, B:8:0x0150, B:9:0x0187, B:21:0x02cb, B:23:0x02d8, B:24:0x0316, B:31:0x0412, B:33:0x041f, B:35:0x0461, B:60:0x0648, B:62:0x064e, B:63:0x068a, B:65:0x07ea, B:67:0x07f7, B:68:0x0840, B:73:0x09cd, B:75:0x09da, B:76:0x0a1a, B:83:0x0b51, B:85:0x0b5e, B:87:0x0ba3, B:143:0x0d43, B:145:0x0d50, B:146:0x0d8d, B:157:0x0f00, B:159:0x0f0d, B:160:0x0f46, B:164:0x0f55, B:166:0x0f62, B:167:0x0fa1, B:302:0x135a, B:304:0x1367, B:305:0x13a5, B:321:0x151d, B:323:0x152a, B:324:0x1565, B:331:0x1644, B:333:0x164a, B:334:0x1682, B:337:0x1717, B:339:0x1729, B:340:0x175f, B:346:0x1865, B:348:0x1872, B:350:0x18bc, B:352:0x18c5, B:354:0x18dd, B:355:0x1922, B:406:0x2909, B:408:0x2916, B:409:0x2957, B:426:0x2e9f, B:428:0x2eac, B:430:0x2ef3, B:436:0x2fd3, B:438:0x2fe0, B:439:0x301d, B:461:0x3417, B:463:0x3424, B:465:0x3473, B:494:0x36f9, B:496:0x3706, B:497:0x373d, B:412:0x2964, B:414:0x297c, B:415:0x29c2, B:365:0x2630, B:367:0x263d, B:369:0x268b, B:376:0x26a7, B:378:0x26b4, B:380:0x26ff, B:41:0x053a, B:43:0x0547, B:44:0x0589, B:50:0x05d4, B:52:0x05e1, B:53:0x0621), top: B:527:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:354:0x18dd A[Catch: all -> 0x024b, TryCatch #6 {all -> 0x024b, blocks: (B:6:0x0143, B:8:0x0150, B:9:0x0187, B:21:0x02cb, B:23:0x02d8, B:24:0x0316, B:31:0x0412, B:33:0x041f, B:35:0x0461, B:60:0x0648, B:62:0x064e, B:63:0x068a, B:65:0x07ea, B:67:0x07f7, B:68:0x0840, B:73:0x09cd, B:75:0x09da, B:76:0x0a1a, B:83:0x0b51, B:85:0x0b5e, B:87:0x0ba3, B:143:0x0d43, B:145:0x0d50, B:146:0x0d8d, B:157:0x0f00, B:159:0x0f0d, B:160:0x0f46, B:164:0x0f55, B:166:0x0f62, B:167:0x0fa1, B:302:0x135a, B:304:0x1367, B:305:0x13a5, B:321:0x151d, B:323:0x152a, B:324:0x1565, B:331:0x1644, B:333:0x164a, B:334:0x1682, B:337:0x1717, B:339:0x1729, B:340:0x175f, B:346:0x1865, B:348:0x1872, B:350:0x18bc, B:352:0x18c5, B:354:0x18dd, B:355:0x1922, B:406:0x2909, B:408:0x2916, B:409:0x2957, B:426:0x2e9f, B:428:0x2eac, B:430:0x2ef3, B:436:0x2fd3, B:438:0x2fe0, B:439:0x301d, B:461:0x3417, B:463:0x3424, B:465:0x3473, B:494:0x36f9, B:496:0x3706, B:497:0x373d, B:412:0x2964, B:414:0x297c, B:415:0x29c2, B:365:0x2630, B:367:0x263d, B:369:0x268b, B:376:0x26a7, B:378:0x26b4, B:380:0x26ff, B:41:0x053a, B:43:0x0547, B:44:0x0589, B:50:0x05d4, B:52:0x05e1, B:53:0x0621), top: B:527:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:358:0x19b0  */
    /* JADX WARN: Code duplicated, block: B:360:0x19b4  */
    /* JADX WARN: Code duplicated, block: B:364:0x2629  */
    /* JADX WARN: Code duplicated, block: B:367:0x263d A[Catch: all -> 0x024b, TryCatch #6 {all -> 0x024b, blocks: (B:6:0x0143, B:8:0x0150, B:9:0x0187, B:21:0x02cb, B:23:0x02d8, B:24:0x0316, B:31:0x0412, B:33:0x041f, B:35:0x0461, B:60:0x0648, B:62:0x064e, B:63:0x068a, B:65:0x07ea, B:67:0x07f7, B:68:0x0840, B:73:0x09cd, B:75:0x09da, B:76:0x0a1a, B:83:0x0b51, B:85:0x0b5e, B:87:0x0ba3, B:143:0x0d43, B:145:0x0d50, B:146:0x0d8d, B:157:0x0f00, B:159:0x0f0d, B:160:0x0f46, B:164:0x0f55, B:166:0x0f62, B:167:0x0fa1, B:302:0x135a, B:304:0x1367, B:305:0x13a5, B:321:0x151d, B:323:0x152a, B:324:0x1565, B:331:0x1644, B:333:0x164a, B:334:0x1682, B:337:0x1717, B:339:0x1729, B:340:0x175f, B:346:0x1865, B:348:0x1872, B:350:0x18bc, B:352:0x18c5, B:354:0x18dd, B:355:0x1922, B:406:0x2909, B:408:0x2916, B:409:0x2957, B:426:0x2e9f, B:428:0x2eac, B:430:0x2ef3, B:436:0x2fd3, B:438:0x2fe0, B:439:0x301d, B:461:0x3417, B:463:0x3424, B:465:0x3473, B:494:0x36f9, B:496:0x3706, B:497:0x373d, B:412:0x2964, B:414:0x297c, B:415:0x29c2, B:365:0x2630, B:367:0x263d, B:369:0x268b, B:376:0x26a7, B:378:0x26b4, B:380:0x26ff, B:41:0x053a, B:43:0x0547, B:44:0x0589, B:50:0x05d4, B:52:0x05e1, B:53:0x0621), top: B:527:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:368:0x2685  */
    /* JADX WARN: Code duplicated, block: B:390:0x281a  */
    /* JADX WARN: Code duplicated, block: B:394:0x2860  */
    /* JADX WARN: Code duplicated, block: B:395:0x2875  */
    /* JADX WARN: Code duplicated, block: B:398:0x289e  */
    /* JADX WARN: Code duplicated, block: B:399:0x28a8  */
    /* JADX WARN: Code duplicated, block: B:403:0x28ce  */
    /* JADX WARN: Code duplicated, block: B:404:0x28d8  */
    /* JADX WARN: Code duplicated, block: B:408:0x2916 A[Catch: all -> 0x024b, TryCatch #6 {all -> 0x024b, blocks: (B:6:0x0143, B:8:0x0150, B:9:0x0187, B:21:0x02cb, B:23:0x02d8, B:24:0x0316, B:31:0x0412, B:33:0x041f, B:35:0x0461, B:60:0x0648, B:62:0x064e, B:63:0x068a, B:65:0x07ea, B:67:0x07f7, B:68:0x0840, B:73:0x09cd, B:75:0x09da, B:76:0x0a1a, B:83:0x0b51, B:85:0x0b5e, B:87:0x0ba3, B:143:0x0d43, B:145:0x0d50, B:146:0x0d8d, B:157:0x0f00, B:159:0x0f0d, B:160:0x0f46, B:164:0x0f55, B:166:0x0f62, B:167:0x0fa1, B:302:0x135a, B:304:0x1367, B:305:0x13a5, B:321:0x151d, B:323:0x152a, B:324:0x1565, B:331:0x1644, B:333:0x164a, B:334:0x1682, B:337:0x1717, B:339:0x1729, B:340:0x175f, B:346:0x1865, B:348:0x1872, B:350:0x18bc, B:352:0x18c5, B:354:0x18dd, B:355:0x1922, B:406:0x2909, B:408:0x2916, B:409:0x2957, B:426:0x2e9f, B:428:0x2eac, B:430:0x2ef3, B:436:0x2fd3, B:438:0x2fe0, B:439:0x301d, B:461:0x3417, B:463:0x3424, B:465:0x3473, B:494:0x36f9, B:496:0x3706, B:497:0x373d, B:412:0x2964, B:414:0x297c, B:415:0x29c2, B:365:0x2630, B:367:0x263d, B:369:0x268b, B:376:0x26a7, B:378:0x26b4, B:380:0x26ff, B:41:0x053a, B:43:0x0547, B:44:0x0589, B:50:0x05d4, B:52:0x05e1, B:53:0x0621), top: B:527:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:411:0x2960  */
    /* JADX WARN: Code duplicated, block: B:412:0x2964 A[Catch: all -> 0x024b, TryCatch #6 {all -> 0x024b, blocks: (B:6:0x0143, B:8:0x0150, B:9:0x0187, B:21:0x02cb, B:23:0x02d8, B:24:0x0316, B:31:0x0412, B:33:0x041f, B:35:0x0461, B:60:0x0648, B:62:0x064e, B:63:0x068a, B:65:0x07ea, B:67:0x07f7, B:68:0x0840, B:73:0x09cd, B:75:0x09da, B:76:0x0a1a, B:83:0x0b51, B:85:0x0b5e, B:87:0x0ba3, B:143:0x0d43, B:145:0x0d50, B:146:0x0d8d, B:157:0x0f00, B:159:0x0f0d, B:160:0x0f46, B:164:0x0f55, B:166:0x0f62, B:167:0x0fa1, B:302:0x135a, B:304:0x1367, B:305:0x13a5, B:321:0x151d, B:323:0x152a, B:324:0x1565, B:331:0x1644, B:333:0x164a, B:334:0x1682, B:337:0x1717, B:339:0x1729, B:340:0x175f, B:346:0x1865, B:348:0x1872, B:350:0x18bc, B:352:0x18c5, B:354:0x18dd, B:355:0x1922, B:406:0x2909, B:408:0x2916, B:409:0x2957, B:426:0x2e9f, B:428:0x2eac, B:430:0x2ef3, B:436:0x2fd3, B:438:0x2fe0, B:439:0x301d, B:461:0x3417, B:463:0x3424, B:465:0x3473, B:494:0x36f9, B:496:0x3706, B:497:0x373d, B:412:0x2964, B:414:0x297c, B:415:0x29c2, B:365:0x2630, B:367:0x263d, B:369:0x268b, B:376:0x26a7, B:378:0x26b4, B:380:0x26ff, B:41:0x053a, B:43:0x0547, B:44:0x0589, B:50:0x05d4, B:52:0x05e1, B:53:0x0621), top: B:527:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:414:0x297c A[Catch: all -> 0x024b, TryCatch #6 {all -> 0x024b, blocks: (B:6:0x0143, B:8:0x0150, B:9:0x0187, B:21:0x02cb, B:23:0x02d8, B:24:0x0316, B:31:0x0412, B:33:0x041f, B:35:0x0461, B:60:0x0648, B:62:0x064e, B:63:0x068a, B:65:0x07ea, B:67:0x07f7, B:68:0x0840, B:73:0x09cd, B:75:0x09da, B:76:0x0a1a, B:83:0x0b51, B:85:0x0b5e, B:87:0x0ba3, B:143:0x0d43, B:145:0x0d50, B:146:0x0d8d, B:157:0x0f00, B:159:0x0f0d, B:160:0x0f46, B:164:0x0f55, B:166:0x0f62, B:167:0x0fa1, B:302:0x135a, B:304:0x1367, B:305:0x13a5, B:321:0x151d, B:323:0x152a, B:324:0x1565, B:331:0x1644, B:333:0x164a, B:334:0x1682, B:337:0x1717, B:339:0x1729, B:340:0x175f, B:346:0x1865, B:348:0x1872, B:350:0x18bc, B:352:0x18c5, B:354:0x18dd, B:355:0x1922, B:406:0x2909, B:408:0x2916, B:409:0x2957, B:426:0x2e9f, B:428:0x2eac, B:430:0x2ef3, B:436:0x2fd3, B:438:0x2fe0, B:439:0x301d, B:461:0x3417, B:463:0x3424, B:465:0x3473, B:494:0x36f9, B:496:0x3706, B:497:0x373d, B:412:0x2964, B:414:0x297c, B:415:0x29c2, B:365:0x2630, B:367:0x263d, B:369:0x268b, B:376:0x26a7, B:378:0x26b4, B:380:0x26ff, B:41:0x053a, B:43:0x0547, B:44:0x0589, B:50:0x05d4, B:52:0x05e1, B:53:0x0621), top: B:527:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:419:0x2a71  */
    /* JADX WARN: Code duplicated, block: B:454:0x318f  */
    /* JADX WARN: Code duplicated, block: B:458:0x33fd  */
    /* JADX WARN: Code duplicated, block: B:460:0x340d  */
    /* JADX WARN: Code duplicated, block: B:463:0x3424 A[Catch: all -> 0x024b, TryCatch #6 {all -> 0x024b, blocks: (B:6:0x0143, B:8:0x0150, B:9:0x0187, B:21:0x02cb, B:23:0x02d8, B:24:0x0316, B:31:0x0412, B:33:0x041f, B:35:0x0461, B:60:0x0648, B:62:0x064e, B:63:0x068a, B:65:0x07ea, B:67:0x07f7, B:68:0x0840, B:73:0x09cd, B:75:0x09da, B:76:0x0a1a, B:83:0x0b51, B:85:0x0b5e, B:87:0x0ba3, B:143:0x0d43, B:145:0x0d50, B:146:0x0d8d, B:157:0x0f00, B:159:0x0f0d, B:160:0x0f46, B:164:0x0f55, B:166:0x0f62, B:167:0x0fa1, B:302:0x135a, B:304:0x1367, B:305:0x13a5, B:321:0x151d, B:323:0x152a, B:324:0x1565, B:331:0x1644, B:333:0x164a, B:334:0x1682, B:337:0x1717, B:339:0x1729, B:340:0x175f, B:346:0x1865, B:348:0x1872, B:350:0x18bc, B:352:0x18c5, B:354:0x18dd, B:355:0x1922, B:406:0x2909, B:408:0x2916, B:409:0x2957, B:426:0x2e9f, B:428:0x2eac, B:430:0x2ef3, B:436:0x2fd3, B:438:0x2fe0, B:439:0x301d, B:461:0x3417, B:463:0x3424, B:465:0x3473, B:494:0x36f9, B:496:0x3706, B:497:0x373d, B:412:0x2964, B:414:0x297c, B:415:0x29c2, B:365:0x2630, B:367:0x263d, B:369:0x268b, B:376:0x26a7, B:378:0x26b4, B:380:0x26ff, B:41:0x053a, B:43:0x0547, B:44:0x0589, B:50:0x05d4, B:52:0x05e1, B:53:0x0621), top: B:527:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:464:0x346d  */
    /* JADX WARN: Code duplicated, block: B:470:0x351b A[EDGE_INSN: B:470:0x351b->B:475:0x355d BREAK  A[LOOP:7: B:456:0x33fa->B:473:0x3545, LOOP_LABEL: LOOP:7: B:456:0x33fa->B:473:0x3545]] */
    /* JADX WARN: Code duplicated, block: B:471:0x3528 A[EDGE_INSN: B:471:0x3528->B:475:0x355d BREAK  A[LOOP:7: B:456:0x33fa->B:473:0x3545, LOOP_LABEL: LOOP:7: B:456:0x33fa->B:473:0x3545]] */
    /* JADX WARN: Code duplicated, block: B:472:0x3531 A[LOOP:8: B:459:0x340b->B:472:0x3531, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:479:0x35d6 A[Catch: all -> 0x36aa, TryCatch #5 {all -> 0x36aa, blocks: (B:477:0x35c9, B:479:0x35d6, B:480:0x3613), top: B:525:0x35c9, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:484:0x36a2 A[Catch: Exception -> 0x36b3, TryCatch #2 {Exception -> 0x36b3, blocks: (B:476:0x356d, B:482:0x3681, B:484:0x36a2, B:487:0x36ab, B:489:0x36b1, B:490:0x36b2, B:477:0x35c9, B:479:0x35d6, B:480:0x3613), top: B:520:0x356d, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:485:0x36a8  */
    /* JADX WARN: Code duplicated, block: B:496:0x3706 A[Catch: all -> 0x024b, TryCatch #6 {all -> 0x024b, blocks: (B:6:0x0143, B:8:0x0150, B:9:0x0187, B:21:0x02cb, B:23:0x02d8, B:24:0x0316, B:31:0x0412, B:33:0x041f, B:35:0x0461, B:60:0x0648, B:62:0x064e, B:63:0x068a, B:65:0x07ea, B:67:0x07f7, B:68:0x0840, B:73:0x09cd, B:75:0x09da, B:76:0x0a1a, B:83:0x0b51, B:85:0x0b5e, B:87:0x0ba3, B:143:0x0d43, B:145:0x0d50, B:146:0x0d8d, B:157:0x0f00, B:159:0x0f0d, B:160:0x0f46, B:164:0x0f55, B:166:0x0f62, B:167:0x0fa1, B:302:0x135a, B:304:0x1367, B:305:0x13a5, B:321:0x151d, B:323:0x152a, B:324:0x1565, B:331:0x1644, B:333:0x164a, B:334:0x1682, B:337:0x1717, B:339:0x1729, B:340:0x175f, B:346:0x1865, B:348:0x1872, B:350:0x18bc, B:352:0x18c5, B:354:0x18dd, B:355:0x1922, B:406:0x2909, B:408:0x2916, B:409:0x2957, B:426:0x2e9f, B:428:0x2eac, B:430:0x2ef3, B:436:0x2fd3, B:438:0x2fe0, B:439:0x301d, B:461:0x3417, B:463:0x3424, B:465:0x3473, B:494:0x36f9, B:496:0x3706, B:497:0x373d, B:412:0x2964, B:414:0x297c, B:415:0x29c2, B:365:0x2630, B:367:0x263d, B:369:0x268b, B:376:0x26a7, B:378:0x26b4, B:380:0x26ff, B:41:0x053a, B:43:0x0547, B:44:0x0589, B:50:0x05d4, B:52:0x05e1, B:53:0x0621), top: B:527:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:499:0x3809  */
    /* JADX WARN: Code duplicated, block: B:540:0x0c56 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:0x103f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:0x11cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x0ac7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x0ab1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:0x0fc3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:560:0x0efe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:0x1461 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x147d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:0x1609 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:0x162b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:0x355c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x350a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:0x1112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x1108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:0x110a A[EDGE_INSN: B:581:0x110a->B:215:0x110a BREAK  A[LOOP:11: B:183:0x1056->B:212:0x1100], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:0x10ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:0x10e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:0x10e6 A[EDGE_INSN: B:588:0x10e6->B:209:0x10e6 BREAK  A[LOOP:13: B:200:0x10a2->B:205:0x10cb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:0x10de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x10c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:0x124c A[EDGE_INSN: B:591:0x124c->B:272:0x124c BREAK  A[LOOP:14: B:247:0x11da->B:271:0x1245], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x1231 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:0x122d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:0x0ced A[EDGE_INSN: B:600:0x0ced->B:123:0x0ced BREAK  A[LOOP:18: B:99:0x0c74->B:122:0x0ce6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:0x0ce6 A[EDGE_INSN: B:602:0x0ce6->B:122:0x0ce6 BREAK  A[LOOP:19: B:102:0x0c7c->B:121:0x0ce1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:0x0cd7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:0x0cdb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x064e A[Catch: all -> 0x024b, TryCatch #6 {all -> 0x024b, blocks: (B:6:0x0143, B:8:0x0150, B:9:0x0187, B:21:0x02cb, B:23:0x02d8, B:24:0x0316, B:31:0x0412, B:33:0x041f, B:35:0x0461, B:60:0x0648, B:62:0x064e, B:63:0x068a, B:65:0x07ea, B:67:0x07f7, B:68:0x0840, B:73:0x09cd, B:75:0x09da, B:76:0x0a1a, B:83:0x0b51, B:85:0x0b5e, B:87:0x0ba3, B:143:0x0d43, B:145:0x0d50, B:146:0x0d8d, B:157:0x0f00, B:159:0x0f0d, B:160:0x0f46, B:164:0x0f55, B:166:0x0f62, B:167:0x0fa1, B:302:0x135a, B:304:0x1367, B:305:0x13a5, B:321:0x151d, B:323:0x152a, B:324:0x1565, B:331:0x1644, B:333:0x164a, B:334:0x1682, B:337:0x1717, B:339:0x1729, B:340:0x175f, B:346:0x1865, B:348:0x1872, B:350:0x18bc, B:352:0x18c5, B:354:0x18dd, B:355:0x1922, B:406:0x2909, B:408:0x2916, B:409:0x2957, B:426:0x2e9f, B:428:0x2eac, B:430:0x2ef3, B:436:0x2fd3, B:438:0x2fe0, B:439:0x301d, B:461:0x3417, B:463:0x3424, B:465:0x3473, B:494:0x36f9, B:496:0x3706, B:497:0x373d, B:412:0x2964, B:414:0x297c, B:415:0x29c2, B:365:0x2630, B:367:0x263d, B:369:0x268b, B:376:0x26a7, B:378:0x26b4, B:380:0x26ff, B:41:0x053a, B:43:0x0547, B:44:0x0589, B:50:0x05d4, B:52:0x05e1, B:53:0x0621), top: B:527:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x07f7 A[Catch: all -> 0x024b, TryCatch #6 {all -> 0x024b, blocks: (B:6:0x0143, B:8:0x0150, B:9:0x0187, B:21:0x02cb, B:23:0x02d8, B:24:0x0316, B:31:0x0412, B:33:0x041f, B:35:0x0461, B:60:0x0648, B:62:0x064e, B:63:0x068a, B:65:0x07ea, B:67:0x07f7, B:68:0x0840, B:73:0x09cd, B:75:0x09da, B:76:0x0a1a, B:83:0x0b51, B:85:0x0b5e, B:87:0x0ba3, B:143:0x0d43, B:145:0x0d50, B:146:0x0d8d, B:157:0x0f00, B:159:0x0f0d, B:160:0x0f46, B:164:0x0f55, B:166:0x0f62, B:167:0x0fa1, B:302:0x135a, B:304:0x1367, B:305:0x13a5, B:321:0x151d, B:323:0x152a, B:324:0x1565, B:331:0x1644, B:333:0x164a, B:334:0x1682, B:337:0x1717, B:339:0x1729, B:340:0x175f, B:346:0x1865, B:348:0x1872, B:350:0x18bc, B:352:0x18c5, B:354:0x18dd, B:355:0x1922, B:406:0x2909, B:408:0x2916, B:409:0x2957, B:426:0x2e9f, B:428:0x2eac, B:430:0x2ef3, B:436:0x2fd3, B:438:0x2fe0, B:439:0x301d, B:461:0x3417, B:463:0x3424, B:465:0x3473, B:494:0x36f9, B:496:0x3706, B:497:0x373d, B:412:0x2964, B:414:0x297c, B:415:0x29c2, B:365:0x2630, B:367:0x263d, B:369:0x268b, B:376:0x26a7, B:378:0x26b4, B:380:0x26ff, B:41:0x053a, B:43:0x0547, B:44:0x0589, B:50:0x05d4, B:52:0x05e1, B:53:0x0621), top: B:527:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x09cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x09da A[Catch: all -> 0x024b, TryCatch #6 {all -> 0x024b, blocks: (B:6:0x0143, B:8:0x0150, B:9:0x0187, B:21:0x02cb, B:23:0x02d8, B:24:0x0316, B:31:0x0412, B:33:0x041f, B:35:0x0461, B:60:0x0648, B:62:0x064e, B:63:0x068a, B:65:0x07ea, B:67:0x07f7, B:68:0x0840, B:73:0x09cd, B:75:0x09da, B:76:0x0a1a, B:83:0x0b51, B:85:0x0b5e, B:87:0x0ba3, B:143:0x0d43, B:145:0x0d50, B:146:0x0d8d, B:157:0x0f00, B:159:0x0f0d, B:160:0x0f46, B:164:0x0f55, B:166:0x0f62, B:167:0x0fa1, B:302:0x135a, B:304:0x1367, B:305:0x13a5, B:321:0x151d, B:323:0x152a, B:324:0x1565, B:331:0x1644, B:333:0x164a, B:334:0x1682, B:337:0x1717, B:339:0x1729, B:340:0x175f, B:346:0x1865, B:348:0x1872, B:350:0x18bc, B:352:0x18c5, B:354:0x18dd, B:355:0x1922, B:406:0x2909, B:408:0x2916, B:409:0x2957, B:426:0x2e9f, B:428:0x2eac, B:430:0x2ef3, B:436:0x2fd3, B:438:0x2fe0, B:439:0x301d, B:461:0x3417, B:463:0x3424, B:465:0x3473, B:494:0x36f9, B:496:0x3706, B:497:0x373d, B:412:0x2964, B:414:0x297c, B:415:0x29c2, B:365:0x2630, B:367:0x263d, B:369:0x268b, B:376:0x26a7, B:378:0x26b4, B:380:0x26ff, B:41:0x053a, B:43:0x0547, B:44:0x0589, B:50:0x05d4, B:52:0x05e1, B:53:0x0621), top: B:527:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0ab6 A[LOOP:2: B:70:0x09c8->B:80:0x0ab6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x0b5e A[Catch: all -> 0x024b, TryCatch #6 {all -> 0x024b, blocks: (B:6:0x0143, B:8:0x0150, B:9:0x0187, B:21:0x02cb, B:23:0x02d8, B:24:0x0316, B:31:0x0412, B:33:0x041f, B:35:0x0461, B:60:0x0648, B:62:0x064e, B:63:0x068a, B:65:0x07ea, B:67:0x07f7, B:68:0x0840, B:73:0x09cd, B:75:0x09da, B:76:0x0a1a, B:83:0x0b51, B:85:0x0b5e, B:87:0x0ba3, B:143:0x0d43, B:145:0x0d50, B:146:0x0d8d, B:157:0x0f00, B:159:0x0f0d, B:160:0x0f46, B:164:0x0f55, B:166:0x0f62, B:167:0x0fa1, B:302:0x135a, B:304:0x1367, B:305:0x13a5, B:321:0x151d, B:323:0x152a, B:324:0x1565, B:331:0x1644, B:333:0x164a, B:334:0x1682, B:337:0x1717, B:339:0x1729, B:340:0x175f, B:346:0x1865, B:348:0x1872, B:350:0x18bc, B:352:0x18c5, B:354:0x18dd, B:355:0x1922, B:406:0x2909, B:408:0x2916, B:409:0x2957, B:426:0x2e9f, B:428:0x2eac, B:430:0x2ef3, B:436:0x2fd3, B:438:0x2fe0, B:439:0x301d, B:461:0x3417, B:463:0x3424, B:465:0x3473, B:494:0x36f9, B:496:0x3706, B:497:0x373d, B:412:0x2964, B:414:0x297c, B:415:0x29c2, B:365:0x2630, B:367:0x263d, B:369:0x268b, B:376:0x26a7, B:378:0x26b4, B:380:0x26ff, B:41:0x053a, B:43:0x0547, B:44:0x0589, B:50:0x05d4, B:52:0x05e1, B:53:0x0621), top: B:527:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0ba1  */
    /* JADX WARN: Code duplicated, block: B:89:0x0bae  */
    /* JADX WARN: Code duplicated, block: B:91:0x0be0  */
    /* JADX WARN: Code duplicated, block: B:92:0x0bed  */
    public static Object[] b(Context context, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        String str;
        int i6;
        String str2;
        int i7;
        int i8;
        int i9;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        long j;
        long j2;
        String str3;
        String[] strArr;
        int i10;
        String str4;
        int i11;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        String str5;
        String str6;
        int i12;
        String str7;
        byte[] bytes;
        int length;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        int i13;
        int i14;
        byte[] bArr;
        int i15;
        int i16;
        boolean z;
        boolean z2;
        int i17;
        int i18;
        byte[] bArr2;
        int i19;
        byte[] bArr3;
        int i20;
        int i21;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        String lowerCase;
        Object[] objArr;
        int i22;
        String[] strArr2;
        int i23;
        int i24;
        String str8;
        byte[] bytes2;
        int length2;
        BufferedInputStream bufferedInputStream3;
        BufferedInputStream bufferedInputStream4;
        String str9;
        int i25;
        int i26;
        int i27;
        int i28;
        byte[] bytes3;
        int length3;
        BufferedInputStream bufferedInputStream5;
        BufferedInputStream bufferedInputStream6;
        int i29;
        int i30;
        byte[] bArr4;
        int i31;
        int i32;
        boolean z3;
        int i33;
        int i34;
        byte[] bArr5;
        int i35;
        byte[] bArr6;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        byte[] bArr7;
        int i44;
        int i45;
        boolean z4;
        int i46;
        int i47;
        int i48;
        int i49;
        byte[] bArr8;
        int i50;
        int i51;
        boolean z5;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        String[] strArr3;
        long globalActionKeyTimeout;
        int i60;
        int i61;
        int i62;
        int i63;
        int i64;
        int i65;
        int i66;
        int i67;
        int i68;
        int i69;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        String str10;
        int i70;
        int i71;
        int i72;
        String[] strArr4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        int i73;
        int i74;
        int i75;
        int i76;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9;
        String str11;
        Object objInvoke;
        char c;
        String[][] strArr5;
        StringBuilder sb;
        int i77;
        int i78;
        int i79;
        int i80;
        Object[] objArr2;
        int i81;
        int i82;
        int i83;
        int i84;
        Object obj;
        String[] strArr6;
        String str12;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10;
        String str13;
        char c2;
        int iIndexOf;
        int i85;
        int i86;
        int i87;
        int iNormalizeMetaState;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11;
        Object objInvoke2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12;
        int i88;
        String str14;
        long j3;
        String[][] strArr7;
        String str15;
        char c3;
        int i89;
        int i90;
        int i91;
        int i92;
        int i93;
        int i94;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14;
        int i95;
        int i96;
        String str16;
        String[] strArr8;
        int length4;
        int i97;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15;
        int i98;
        int i99;
        int i100;
        int i101;
        int i102;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16;
        int i103;
        int i104;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17;
        int i105;
        int i106;
        int i107;
        String[] strArr9;
        int i108;
        int i109;
        int i110;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18;
        String[] strArr10;
        int i111;
        int i112;
        long j4;
        int i113;
        int i114;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20;
        String str17;
        Object[] objArr3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21;
        long j5;
        int i115;
        int iMyUid;
        int i116;
        int i117 = 2 % 2;
        String str18 = "";
        int i118 = -TextUtils.indexOf((CharSequence) "", '0');
        int i119 = 1;
        int i120 = (i118 ^ 907) + ((i118 & 907) << 1);
        int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 16;
        int i121 = (keyRepeatDelay & 8) + (keyRepeatDelay | 8);
        int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity() >> 16;
        int i122 = (maximumFlingVelocity * (-813)) + 10117584;
        int i123 = (maximumFlingVelocity ^ i) | (maximumFlingVelocity & i);
        int i124 = ((~(((-24799) & maximumFlingVelocity) | ((-24799) ^ maximumFlingVelocity))) | (~i123)) * (-814);
        int i125 = (i122 ^ i124) + ((i122 & i124) << 1);
        int i126 = ~i;
        int i127 = ~(((-24799) & i126) | ((-24799) ^ i126));
        int i128 = ~maximumFlingVelocity;
        int i129 = (i128 ^ 24798) | (i128 & 24798);
        int i130 = ~i129;
        int i131 = (i127 & i130) | (i127 ^ i130);
        int i132 = ~i123;
        int i133 = i125 + (((i131 & i132) | (i131 ^ i132)) * 407);
        int i134 = ~i129;
        int i135 = ~((i128 & i) | (i128 ^ i));
        int i136 = (i135 & i134) | (i134 ^ i135);
        int i137 = ~((i ^ 24798) | (i & 24798));
        int i138 = ((i136 & i137) | (i136 ^ i137)) * 407;
        Object[] objArr4 = new Object[1];
        a(i120, i121, (char) (((i133 | i138) << 1) - (i138 ^ i133)), objArr4);
        int i139 = 0;
        String str19 = (String) objArr4[0];
        new ArrayList();
        int iMyPid = Process.myPid() >> 22;
        int i140 = -(-Color.argb(0, 0, 0, 0));
        int i141 = -1;
        Object[] objArr5 = new Object[1];
        a(iMyPid, (i140 ^ 27) + ((i140 & 27) << 1), (char) ((-2) - ((-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))) ^ (-1))), objArr5);
        String str20 = (String) objArr5[0];
        int iRgb = Color.rgb(0, 0, 0);
        int i142 = (iRgb & 16777243) + (iRgb | 16777243);
        int i143 = -(Process.myTid() >> 22);
        int i144 = ((i143 | 25) << 1) - (i143 ^ 25);
        int i145 = -TextUtils.getTrimmedLength("");
        Object[] objArr6 = new Object[1];
        a(i142, i144, (char) ((i145 ^ 41781) + ((i145 & 41781) << 1)), objArr6);
        String str21 = (String) objArr6[0];
        int keyRepeatDelay2 = 52 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
        int i146 = -(ViewConfiguration.getScrollBarSize() >> 8);
        int i147 = (i146 & 18) + (i146 | 18);
        int threadPriority = Process.getThreadPriority(0);
        Object[] objArr7 = new Object[1];
        a(keyRepeatDelay2, i147, (char) ((((threadPriority & 20) + (threadPriority | 20)) >> 6) + 40041), objArr7);
        String str22 = (String) objArr7[0];
        int i148 = -(-TextUtils.indexOf("", "", 0, 0));
        int i149 = (i148 ^ 70) + ((i148 & 70) << 1);
        int iResolveSize = View.resolveSize(0, 0);
        Object[] objArr8 = new Object[1];
        a(i149, (iResolveSize ^ 28) + ((iResolveSize & 28) << 1), (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr8);
        String[] strArr11 = {str20, str21, str22, (String) objArr8[0]};
        int i150 = 0;
        while (true) {
            if (i150 >= 4) {
                i4 = i126;
                i5 = i;
                break;
            }
            try {
                Object[] objArr9 = {strArr11[i150]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                    char cResolveSize = (char) View.resolveSize(i139, i139);
                    int i151 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 992;
                    int iRed = 8 - Color.red(i139);
                    byte b2 = (byte) i139;
                    Object[] objArr10 = new Object[i119];
                    c(b2, (byte) (b2 | 6), b2, objArr10);
                    String str23 = (String) objArr10[i139];
                    Class[] clsArr = new Class[i119];
                    clsArr[i139] = String.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(cResolveSize, i151, iRed, -545305915, false, str23, clsArr);
                }
                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).invoke(null, objArr9)).longValue();
                long j6 = -55506959;
                long j7 = -445;
                long j8 = 446;
                i4 = i126;
                long j9 = i141;
                long j10 = j6 ^ j9;
                long j11 = jLongValue ^ j9;
                long j12 = (j10 | j11) ^ j9;
                long j13 = i;
                long j14 = (j7 * j6) + (j7 * jLongValue) + ((j12 | ((j11 | (j13 ^ j9)) ^ j9)) * j8) + (((j9 ^ ((j11 | j6) | j13)) | ((j10 | jLongValue) ^ j9)) * j8) + (j8 * j12) + ((long) 675966243);
                int iNextInt = new Random().nextInt(486326119);
                int i152 = ~iNextInt;
                int i153 = ((int) (j14 >> 32)) & (1481675182 + ((iNextInt | 2181280) * 988) + (((~((-2140811615) | i152)) | 1426063624) * (-1976)) + (((~(iNextInt | 716929270)) | 2181280 | (~((-716929271) | i152))) * 988));
                int i154 = (((~((-86412873) | i)) | (-1609985467)) * 262) - 775031575;
                int i155 = ~i;
                int i156 = ((int) j14) & (i154 + (((~((-86412873) | i155)) | (-1609985467)) * 262));
                if (((i156 & i153) | (i153 ^ i156)) != 0) {
                    int i157 = ((i150 | 190) << 1) - (i150 ^ 190);
                    i5 = (i157 & i155) | ((~i157) & i);
                    break;
                }
                int i158 = (i150 ^ 110) + ((i150 & 110) << 1);
                i150 = ((i158 | (-109)) << 1) - (i158 ^ (-109));
                i126 = i4;
                i139 = 0;
                i119 = 1;
                i141 = -1;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int iIndexOf2 = 97 - TextUtils.indexOf((CharSequence) "", '0', 0);
        int mode = View.MeasureSpec.getMode(0);
        Object[] objArr11 = new Object[1];
        a(iIndexOf2, ((mode | 12) << 1) - (mode ^ 12), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr11);
        String str24 = (String) objArr11[0];
        int touchSlop = ViewConfiguration.getTouchSlop() >> 8;
        Object[] objArr12 = new Object[1];
        a((touchSlop ^ 110) + ((touchSlop & 110) << 1), TextUtils.lastIndexOf("", '0', 0, 0) + 14, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr12);
        String str25 = (String) objArr12[0];
        int i159 = -ExpandableListView.getPackedPositionChild(0L);
        int i160 = -View.combineMeasuredStates(0, 0);
        Object[] objArr13 = new Object[1];
        a((i159 & 122) + (i159 | 122), ((i160 | 18) << 1) - (i160 ^ 18), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr13);
        String[] strArr12 = {str24, str25, (String) objArr13[0]};
        int i161 = 0;
        while (true) {
            if (i161 >= 3) {
                str = str18;
                i6 = i;
                break;
            }
            Object[] objArr14 = {strArr12[i161]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                int deadChar = KeyEvent.getDeadChar(0, 0) + 993;
                int i162 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7;
                byte b3 = (byte) 0;
                byte b4 = (byte) (b3 + 1);
                Object[] objArr15 = new Object[1];
                c(b3, b4, (byte) (b4 - 1), objArr15);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(fadingEdgeLength, deadChar, i162, 410748506, false, (String) objArr15[0], new Class[]{String.class});
            }
            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).invoke(null, objArr14)).longValue();
            long j15 = 1616481360;
            long j16 = -167;
            str = str18;
            String[] strArr13 = strArr12;
            long j17 = -1;
            long j18 = jLongValue2 ^ j17;
            long j19 = i;
            long j20 = (j16 * j15) + (j16 * jLongValue2) + (((long) 336) * ((((j15 ^ j17) | j18) ^ j17) | ((j18 | j19) ^ j17))) + (((long) (-168)) * (((j15 | jLongValue2) ^ j17) | ((j15 | j19) ^ j17))) + (((long) 168) * (j18 | (j17 ^ ((j19 ^ j17) | j15)))) + ((long) (-1817399597));
            int i163 = ~i;
            int i164 = ((int) (j20 >> 32)) & ((-1453938172) + (((~((-614898785) | i163)) | 822327626) * 519) + (((~(i163 | (-77857825))) | (~(900185450 | i))) * (-519)) + (((~(822327626 | i)) | 614898784) * 519));
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i165 = ((int) j20) & ((-372837567) + (((~((-1747609601) | elapsedCpuTime)) | 310383190) * (-756)) + (((~elapsedCpuTime) | (-1747609601)) * 756));
            if (((i165 & i164) | (i164 ^ i165)) != 0) {
                i6 = i ^ (i161 + 270);
                break;
            }
            int i166 = (i161 ^ (-102)) + ((i161 & (-102)) << 1);
            i161 = (i166 & 103) + (i166 | 103);
            strArr12 = strArr13;
            str18 = str;
        }
        int i167 = (~(i & i5)) & (i | i5);
        int i168 = -i167;
        int i169 = ((i167 & i168) | (i167 ^ i168)) >> 31;
        int i170 = i6 & (~i169);
        int i171 = i5 & i169;
        int i172 = (i171 & i170) | (i170 ^ i171);
        int i173 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
        Object[] objArr16 = new Object[1];
        a(((i173 | 141) << 1) - (i173 ^ 141), 13 - (~Color.green(0)), (char) (25389 - View.MeasureSpec.makeMeasureSpec(0, 0)), objArr16);
        Object[] objArr17 = {(String) objArr16[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
            char c4 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            str2 = str;
            int offsetAfter = TextUtils.getOffsetAfter(str2, 0) + 993;
            int iIndexOf3 = TextUtils.indexOf((CharSequence) str2, '0', 0, 0) + 9;
            byte b5 = (byte) 0;
            Object[] objArr18 = new Object[1];
            c(b5, (byte) (b5 | 6), b5, objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(c4, offsetAfter, iIndexOf3, -545305915, false, (String) objArr18[0], new Class[]{String.class});
        } else {
            str2 = str;
        }
        long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).invoke(null, objArr17)).longValue();
        long j21 = 203365893;
        long j22 = -518;
        long j23 = (j22 * j21) + (j22 * jLongValue3);
        long j24 = 519;
        int i174 = i4;
        long j25 = -1;
        long jMyUid = Process.myUid();
        long j26 = (j21 ^ j25) | (jMyUid ^ j25);
        long j27 = j23 + ((jLongValue3 | (j26 ^ j25)) * j24) + (((long) (-519)) * (((j26 | jLongValue3) ^ j25) | (((j21 | jLongValue3) | jMyUid) ^ j25))) + (j24 * (((jLongValue3 | jMyUid) ^ j25) | j21)) + ((long) 417093391);
        int i175 = i;
        int i176 = ((int) (j27 >> 32)) & ((((~((-1075335056) | i175)) | 1074284932) * (-283)) + 517184150 + ((~((-1050124) | i175)) * 283));
        int i177 = ~((-148422328) | i175);
        int i178 = ~i175;
        int i179 = ((int) j27) & ((-1779010565) + ((i177 | (~((-1443037249) | i178))) * (-406)) + ((~((-142611490) | i178)) * (-406)) + (((~(1585648737 | i175)) | (~(148422327 | i178))) * 406));
        if (((i176 & i179) | (i176 ^ i179)) == 0) {
            int i180 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int i181 = ((i180 | ModuleDescriptor.MODULE_VERSION) << 1) - (i180 ^ ModuleDescriptor.MODULE_VERSION);
            int i182 = -KeyEvent.keyCodeFromString(str2);
            int i183 = (i182 & 24) + (i182 | 24);
            int i184 = -(ViewConfiguration.getTouchSlop() >> 8);
            Object[] objArr19 = new Object[1];
            a(i181, i183, (char) ((i184 ^ 13543) + ((i184 & 13543) << 1)), objArr19);
            Object[] objArr20 = {(String) objArr19[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                char tapTimeout = (char) (33602 - (ViewConfiguration.getTapTimeout() >> 16));
                int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 3085;
                int bitsPerPixel = 25 - ImageFormat.getBitsPerPixel(0);
                byte b6 = (byte) 0;
                byte b7 = (byte) (b6 + 1);
                Object[] objArr21 = new Object[1];
                c(b6, b7, (byte) (b7 - 1), objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(tapTimeout, tapTimeout2, bitsPerPixel, 1411172903, false, (String) objArr21[0], new Class[]{String.class});
            }
            String str26 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).invoke(null, objArr20);
            if (str26 == null || str26.isEmpty()) {
                int i185 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int i186 = (i185 & 179) + (i185 | 179);
                int i187 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int i188 = (i187 & 24) + (i187 | 24);
                int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                Object[] objArr22 = new Object[1];
                a(i186, i188, (char) (((windowTouchSlop | 10653) << 1) - (windowTouchSlop ^ 10653)), objArr22);
                Object[] objArr23 = {(String) objArr22[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                    char cIndexOf = (char) (33601 - TextUtils.indexOf((CharSequence) str2, '0'));
                    int iAxisFromString = 3084 - MotionEvent.axisFromString(str2);
                    int iBlue = 26 - Color.blue(0);
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 1);
                    Object[] objArr24 = new Object[1];
                    c(b8, b9, (byte) (b9 - 1), objArr24);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(cIndexOf, iAxisFromString, iBlue, 1411172903, false, (String) objArr24[0], new Class[]{String.class});
                }
                String str27 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).invoke(null, objArr23);
                if (str27 == null || str27.isEmpty()) {
                    i7 = i175;
                } else {
                    i8 = ~(i175 & 267);
                    i9 = i175 | 267;
                }
            } else {
                i7 = (i175 & (-268)) | (i178 & 267);
            }
            int i189 = i175 ^ i172;
            int i190 = (i189 | (-i189)) >> 31;
            int i191 = (i7 & (~i190)) | (i172 & i190);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2061288340);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char packedPositionGroup = (char) (56827 - ExpandableListView.getPackedPositionGroup(0L));
                int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 2814;
                int longPressTimeout = 9 - (ViewConfiguration.getLongPressTimeout() >> 16);
                byte b10 = (byte) 0;
                byte b11 = (byte) (b10 + 1);
                Object[] objArr25 = new Object[1];
                c(b10, b11, (byte) (b11 - 1), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionGroup, packedPositionGroup2, longPressTimeout, -1639816125, false, (String) objArr25[0], new Class[0]);
            }
            long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
            long j28 = 292548684;
            long j29 = 371;
            long j30 = (j29 * j28) + (j29 * jLongValue4);
            long j31 = -370;
            long j32 = jLongValue4 ^ j25;
            long jMyPid = Process.myPid();
            long j33 = jMyPid ^ j25;
            long j34 = j28 ^ j25;
            long j35 = (jLongValue4 | j28) ^ j25;
            long j36 = j30 + ((((j32 | j33) ^ j25) | ((j34 | jMyPid) ^ j25)) * j31) + (j31 * (((j34 | j33) ^ j25) | ((j32 | jMyPid) ^ j25) | j35)) + (((long) 370) * j35) + ((long) 1820807822);
            int iNextInt2 = new Random().nextInt();
            int i192 = ((int) (j36 >> 32)) & (384374654 + (((~((~iNextInt2) | 1768592690)) | (-1777046835)) * 446) + (((~(iNextInt2 | (-8454145))) | 687898640) * 446) + 2006061350);
            int iMyUid2 = Process.myUid();
            int i193 = ~iMyUid2;
            int i194 = ((int) j36) & ((-410051941) + (((~(73114299 | i193)) | (~(1364112110 | iMyUid2))) * 210) + (((~(iMyUid2 | (-1359220805))) | (~(i193 | (-68222994)))) * 210));
            int i195 = (i194 & i192) | (i192 ^ i194);
            int i196 = i195 + 199;
            int i197 = (i195 | (-i195)) >> 31;
            int i198 = (i197 & ((i196 & i178) | ((~i196) & i175))) | ((~i197) & i175);
            int i199 = ((~i191) & i175) | (i191 & i178);
            int i200 = -i199;
            int i201 = ((i199 & i200) | (i199 ^ i200)) >> 31;
            int i202 = i198 & (~i201);
            int i203 = i191 & i201;
            int i204 = (i203 & i202) | (i202 ^ i203);
            int i205 = -Color.alpha(0);
            int i206 = (i205 ^ 203) + ((i205 & 203) << 1);
            int i207 = -Color.rgb(0, 0, 0);
            int i208 = (i207 ^ (-16777196)) + ((i207 & (-16777196)) << 1);
            int iLastIndexOf = TextUtils.lastIndexOf(str2, '0');
            int i209 = iLastIndexOf * (-300);
            int i210 = (i209 & 286296) + (i209 | 286296);
            int i211 = (iLastIndexOf ^ 948) | (iLastIndexOf & 948);
            int i212 = (~((i211 & i175) | (i211 ^ i175))) * (-301);
            int i213 = (i210 ^ i212) + ((i212 & i210) << 1);
            int i214 = ~(((-949) ^ i175) | ((-949) & i175));
            int i215 = ~(i178 | iLastIndexOf);
            int i216 = ((i214 & i215) | (i214 ^ i215)) * (-301);
            int i217 = (i213 ^ i216) + ((i213 & i216) << 1);
            int i218 = ~iLastIndexOf;
            int i219 = ~((i218 & i175) | (i218 ^ i175));
            Object[] objArr26 = new Object[1];
            a(i206, i208, (char) ((i217 - (~((((-949) & i219) | ((-949) ^ i219)) * 301))) - 1), objArr26);
            String str28 = (String) objArr26[0];
            int i220 = 222 - (~(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
            int i221 = -TextUtils.indexOf((CharSequence) str2, '0');
            Object[] objArr27 = new Object[1];
            a(i220, ((i221 | 5) << 1) - (i221 ^ 5), (char) ((-2) - (~(-TextUtils.lastIndexOf(str2, '0', 0, 0)))), objArr27);
            Object[] objArr28 = {str28, (String) objArr27[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                int i222 = 2386 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int i223 = 32 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte b12 = (byte) 0;
                byte b13 = (byte) (b12 + 1);
                Object[] objArr29 = new Object[1];
                c(b12, b13, (byte) (b13 - 1), objArr29);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, i222, i223, -1207062455, false, (String) objArr29[0], new Class[]{String.class, String.class});
            }
            long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr28)).longValue();
            long j37 = 863045910;
            long j38 = -112;
            long j39 = jLongValue5 ^ j25;
            j = i175;
            j2 = j ^ j25;
            long j40 = j39 | j2;
            long j41 = j37 ^ j25;
            long j42 = (j38 * j37) + (j38 * jLongValue5) + (((long) 226) * (j37 | (j40 ^ j25))) + (((long) (-113)) * (((j41 | jLongValue5) ^ j25) | ((j41 | j) ^ j25) | ((j40 | j37) ^ j25))) + (((long) 113) * ((j39 | j) ^ j25)) + ((long) 1113997418);
            int iNextInt3 = new Random().nextInt(1495965564);
            int i224 = ~iNextInt3;
            int i225 = ((int) (j42 >> 32)) & ((-885166806) + (((~(i224 | 1701842197)) | (-264615787)) * (-1042)) + ((1701842197 | iNextInt3) * 521) + (((~(iNextInt3 | 264615786)) | 1613760533 | (~(i224 | (-176534123)))) * 521));
            int iMyPid2 = Process.myPid();
            int i226 = ~iMyPid2;
            int i227 = (~(599180760 | i226)) | 272697857;
            int i228 = ~(iMyPid2 | (-33832969));
            int i229 = ((int) j42) & (1369714902 + ((i227 | i228) * (-713)) + (i228 * 1426) + ((~(838045649 | i226)) * 713));
            int i230 = (i225 & i229) | (i225 ^ i229);
            int i231 = (~(i175 & 262)) & (i175 | 262);
            int i232 = -i230;
            int i233 = ((i230 & i232) | (i230 ^ i232)) >> 31;
            int i234 = (~i233) & i175;
            int i235 = i233 & i231;
            int i236 = (i235 & i234) | (i234 ^ i235);
            int i237 = i175 ^ i204;
            int i238 = -i237;
            int i239 = ((i237 & i238) | (i237 ^ i238)) >> 31;
            int i240 = i236 & (~i239);
            int i241 = i204 & i239;
            int i242 = (i241 & i240) | (i240 ^ i241);
            int i243 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
            int i244 = (i243 ^ 229) + ((i243 & 229) << 1);
            int packedPositionType = ExpandableListView.getPackedPositionType(0L);
            int i245 = (packedPositionType & 31) + (packedPositionType | 31);
            int threadPriority2 = Process.getThreadPriority(0);
            char c5 = (char) (14461 - (~(-(((threadPriority2 ^ 20) + ((threadPriority2 & 20) << 1)) >> 6))));
            Object[] objArr30 = new Object[1];
            a(i244, i245, c5, objArr30);
            String str29 = (String) objArr30[0];
            int i246 = 261 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int i247 = -View.getDefaultSize(0, 0);
            Object[] objArr31 = new Object[1];
            a(i246, ((i247 | 23) << 1) - (i247 ^ 23), (char) Drawable.resolveOpacity(0, 0), objArr31);
            String str30 = (String) objArr31[0];
            int i248 = -(-(KeyEvent.getMaxKeyCode() >> 16));
            int i249 = (i248 & 283) + (i248 | 283);
            str3 = str2;
            int i250 = -(-TextUtils.lastIndexOf(str3, '0', 0, 0));
            Object[] objArr32 = new Object[1];
            a(i249, ((i250 | 29) << 1) - (i250 ^ 29), (char) KeyEvent.getDeadChar(0, 0), objArr32);
            String str31 = (String) objArr32[0];
            int i251 = 312 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int i252 = -TextUtils.indexOf((CharSequence) str3, '0', 0, 0);
            Object[] objArr33 = new Object[1];
            a(i251, (i252 & 13) + (i252 | 13), (char) (35212 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr33);
            strArr = new String[]{str29, str30, str31, (String) objArr33[0]};
            i10 = 0;
            while (true) {
                if (i10 < 4) {
                    str4 = str3;
                    i11 = i175;
                    break;
                }
                Object[] objArr34 = {strArr[i10]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                    char c6 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    int minimumFlingVelocity = 993 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int offsetAfter2 = TextUtils.getOffsetAfter(str3, 0) + 8;
                    byte b14 = (byte) 0;
                    Object[] objArr35 = new Object[1];
                    c(b14, (byte) (b14 | 6), b14, objArr35);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(c6, minimumFlingVelocity, offsetAfter2, -545305915, false, (String) objArr35[0], new Class[]{String.class});
                }
                long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).invoke(null, objArr34)).longValue();
                long j43 = -1261978586;
                str4 = str3;
                long j44 = jLongValue6 ^ j25;
                long startUptimeMillis = (int) Process.getStartUptimeMillis();
                long j45 = j43 | startUptimeMillis;
                j5 = (((long) (-1335)) * j43) + (((long) (-667)) * jLongValue6) + (((long) (-668)) * (j44 | (j45 ^ j25))) + (((long) 1336) * (j43 | ((j44 | startUptimeMillis) ^ j25))) + (((long) 668) * (j45 | j44)) + ((long) 1882437870);
                i115 = ((int) (j5 >> 32)) & ((-494336726) + ((~(2097028225 | i178)) * (-560)) + ((~(2147475159 | i175)) * (-560)) + (((~((-659801815) | i178)) | 609354880) * 560));
                iMyUid = Process.myUid();
                i116 = ~iMyUid;
                if ((i115 | (((int) j5) & ((-255904448) + ((~(1897151897 | i116)) * 979) + ((459925487 | iMyUid) * (-979)) + (((~(iMyUid | 1897151897)) | (~(i116 | 459925487))) * 979)))) != 0) {
                    i11 = i175 ^ (i10 + 252);
                    break;
                }
                int i253 = (i10 ^ 64) + ((i10 & 64) << 1);
                i10 = (i253 ^ (-63)) + ((i253 & (-63)) << 1);
                str3 = str4;
            }
            int i254 = (~(i175 & i242)) & (i175 | i242);
            int i255 = -i254;
            int i256 = ((i254 & i255) | (i254 ^ i255)) >> 31;
            int i257 = i11 & (~i256);
            int i258 = i242 & i256;
            int i259 = (i258 & i257) | (i257 ^ i258);
            int i260 = -(ViewConfiguration.getTapTimeout() >> 16);
            int i261 = ((i260 | 325) << 1) - (i260 ^ 325);
            int i262 = -KeyEvent.getDeadChar(0, 0);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i263 = (i262 * (-51)) + 689;
            int i264 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i265 = (i264 ^ i262) | (i264 & i262);
            int i266 = -(-((~((i265 & 13) | (i265 ^ 13))) * 52));
            int i267 = (i263 & i266) + (i263 | i266);
            int i268 = (~(((-14) & i262) | ((-14) ^ i262))) | (~((i264 & (-14)) | ((-14) ^ i264)));
            int i269 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i270 = i267 + ((i268 | (~(i269 | i262))) * (-52));
            int i271 = ~i262;
            int i272 = ~((i269 & i271) | (i271 ^ i269));
            int i273 = ~(i271 | 13);
            int i274 = -(-(((i273 & i272) | (i272 ^ i273)) * 52));
            int threadPriority3 = Process.getThreadPriority(0);
            Object[] objArr36 = new Object[1];
            a(i261, (i270 ^ i274) + ((i274 & i270) << 1), (char) (((threadPriority3 ^ 20) + ((threadPriority3 & 20) << 1)) >> 6), objArr36);
            Object[] objArr37 = {(String) objArr36[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveOpacity = (char) (33602 - Drawable.resolveOpacity(0, 0));
                int touchSlop2 = 3085 - (ViewConfiguration.getTouchSlop() >> 8);
                str5 = str4;
                int iIndexOf4 = 26 - TextUtils.indexOf(str5, str5, 0, 0);
                byte b15 = (byte) 0;
                byte b16 = (byte) (b15 + 1);
                Object[] objArr38 = new Object[1];
                c(b15, b16, (byte) (b16 - 1), objArr38);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, touchSlop2, iIndexOf4, 1411172903, false, (String) objArr38[0], new Class[]{String.class});
            } else {
                str5 = str4;
            }
            str6 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr37);
            if (str6 != null) {
                int i275 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                int i276 = ((i275 | 338) << 1) - (i275 ^ 338);
                int i277 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                objArr3 = new Object[1];
                a(i276, (i277 & 8) + (i277 | 8), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr3);
                if (str6.contains((String) objArr3[0])) {
                    int i278 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i278 % 128;
                    int i279 = i278 % 2;
                    i12 = i175 ^ ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
                } else {
                    i12 = i175;
                }
            } else {
                i12 = i175;
            }
            int i280 = (~(i175 & i259)) & (i175 | i259);
            int i281 = -i280;
            int i282 = ((i280 & i281) | (i280 ^ i281)) >> 31;
            int i283 = (i259 & i282) | (i12 & (~i282));
            int iIndexOf5 = TextUtils.indexOf(str5, str5) + 347;
            int i284 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
            Object[] objArr39 = new Object[1];
            a(iIndexOf5, (i284 ^ 17) + ((i284 & 17) << 1), (char) Color.blue(0), objArr39);
            str7 = (String) objArr39[0];
            int i285 = -TextUtils.getTrimmedLength(str5);
            int i286 = ((i285 | 364) << 1) - (i285 ^ 364);
            int i287 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            Object[] objArr40 = new Object[1];
            a(i286, ((i287 | 5) << 1) - (i287 ^ 5), (char) (TextUtils.getOffsetAfter(str5, 0) + 37281), objArr40);
            bytes = ((String) objArr40[0]).getBytes();
            length = bytes.length;
            if (length == 0) {
                i13 = i175 ^ 251;
            } else {
                try {
                    bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str7));
                    int i288 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i289 = (i288 ^ 3) + ((i288 & 3) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i289 % 128;
                    int i290 = i289 % 2;
                    i14 = 4096;
                    try {
                        bArr = new byte[4096];
                        i15 = 0;
                        while (true) {
                            i16 = bufferedInputStream2.read(bArr, 0, i14);
                            if (i16 > 0) {
                                break;
                            }
                            i17 = 0;
                            while (i15 < length) {
                                int i291 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i292 = ((i291 | 25) << 1) - (i291 ^ 25);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i292 % 128;
                                int i293 = i292 % 2;
                                if (i17 < i16) {
                                    break;
                                }
                                if (bArr[i17] == bytes[i15]) {
                                    int i294 = (i15 & (-57)) + (i15 | (-57));
                                    i15 = (i294 & 58) + (i294 | 58);
                                } else {
                                    if (i15 != 0) {
                                        i18 = i15 - 1;
                                        while (true) {
                                            if (i18 > 0) {
                                                bArr2 = bArr;
                                                i15 = 0;
                                                break;
                                            }
                                            i19 = 0;
                                            while (true) {
                                                if (i19 < i18) {
                                                    bArr2 = bArr;
                                                    i15 = i18;
                                                    break;
                                                }
                                                bArr3 = bArr;
                                                int i295 = -i18;
                                                i20 = (i15 & i295) + (i295 | i15);
                                                i21 = -(-i19);
                                                if (bytes[i19] != bytes[(i20 & i21) + (i20 | i21)]) {
                                                    break;
                                                }
                                                i19++;
                                                bArr = bArr3;
                                            }
                                            int i296 = ((i18 | (-32)) << 1) - (i18 ^ (-32));
                                            i18 = (i296 & 31) + (i296 | 31);
                                            bArr = bArr3;
                                        }
                                    }
                                    bArr = bArr2;
                                }
                                bArr2 = bArr;
                                i17++;
                                bArr = bArr2;
                            }
                            bArr = bArr;
                            i14 = 4096;
                        }
                        if (i15 == length) {
                            z = false;
                        } else {
                            z = true;
                        }
                        z2 = !z;
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException unused) {
                        }
                        if (z2) {
                            i13 = i175 ^ 251;
                        } else {
                            i13 = i175;
                        }
                    } catch (IOException unused2) {
                        if (bufferedInputStream2 != null) {
                            try {
                                bufferedInputStream2.close();
                            } catch (IOException unused3) {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused5) {
                    bufferedInputStream2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = null;
                }
            }
            int i297 = ((~i283) & i175) | (i283 & i178);
            int i298 = -i297;
            int i299 = ((i297 & i298) | (i297 ^ i298)) >> 31;
            int i300 = i13 & (~i299);
            int i301 = i283 & i299;
            int i302 = (i301 & i300) | (i300 ^ i301);
            Object[] objArr41 = new Object[1];
            a(370 - TextUtils.indexOf(str5, str5, 0), 23 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (4994 - MotionEvent.axisFromString(str5)), objArr41);
            Object[] objArr42 = {(String) objArr41[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) str5, '0') + 33603);
                int modifierMetaStateMask = 3084 - ((byte) KeyEvent.getModifierMetaStateMask());
                int fadingEdgeLength2 = 26 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                byte b17 = (byte) 0;
                byte b18 = (byte) (b17 + 1);
                Object[] objArr43 = new Object[1];
                c(b17, b18, (byte) (b18 - 1), objArr43);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, modifierMetaStateMask, fadingEdgeLength2, 1411172903, false, (String) objArr43[0], new Class[]{String.class});
            }
            lowerCase = ((String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr42)).toLowerCase();
            int i303 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int i304 = (i303 & 392) + (i303 | 392);
            int i305 = 4 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))));
            int i306 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
            objArr = new Object[1];
            a(i304, i305, (char) ((i306 ^ 46132) + ((i306 & 46132) << 1)), objArr);
            if (lowerCase.contains((String) objArr[0])) {
                i22 = (i175 & (-265)) | (i178 & 264);
            } else {
                i22 = i175;
            }
            int i307 = (~(i175 & i302)) & (i175 | i302);
            int i308 = -i307;
            int i309 = ((i307 & i308) | (i307 ^ i308)) >> 31;
            int i310 = i22 & (~i309);
            int i311 = i302 & i309;
            int i312 = (i311 & i310) | (i310 ^ i311);
            Object[] objArr44 = new Object[1];
            a(396 - (~(-Drawable.resolveOpacity(0, 0))), 42 - (KeyEvent.getMaxKeyCode() >> 16), (char) (Color.argb(0, 0, 0, 0) + 61575), objArr44);
            String str32 = (String) objArr44[0];
            int i313 = -(-KeyEvent.getDeadChar(0, 0));
            int i314 = (i313 ^ 439) + ((i313 & 439) << 1);
            int i315 = -(-TextUtils.indexOf(str5, str5));
            int i316 = ((i315 | 40) << 1) - (i315 ^ 40);
            int i317 = -(-AndroidCharacter.getMirror('0'));
            Object[] objArr45 = new Object[1];
            a(i314, i316, (char) ((i317 ^ (-48)) + ((i317 & (-48)) << 1)), objArr45);
            String str33 = (String) objArr45[0];
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int i318 = (iMakeMeasureSpec ^ 479) + ((iMakeMeasureSpec & 479) << 1);
            int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
            Object[] objArr46 = new Object[1];
            a(i318, (scrollBarSize & 27) + (scrollBarSize | 27), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), objArr46);
            String str34 = (String) objArr46[0];
            int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + TypedValues.PositionType.TYPE_PERCENT_X;
            int i319 = -TextUtils.indexOf((CharSequence) str5, '0', 0, 0);
            Object[] objArr47 = new Object[1];
            a(tapTimeout3, (i319 & 26) + (i319 | 26), (char) View.resolveSizeAndState(0, 0, 0), objArr47);
            String str35 = (String) objArr47[0];
            int iIndexOf6 = TextUtils.indexOf(str5, str5, 0);
            int i320 = (iIndexOf6 & 533) + (iIndexOf6 | 533);
            int i321 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            Object[] objArr48 = new Object[1];
            a(i320, (i321 ^ 28) + ((i321 & 28) << 1), (char) ExpandableListView.getPackedPositionGroup(0L), objArr48);
            String str36 = (String) objArr48[0];
            int defaultSize = 560 - View.getDefaultSize(0, 0);
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
            int i322 = ((packedPositionChild | 28) << 1) - (packedPositionChild ^ 28);
            int i323 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            Object[] objArr49 = new Object[1];
            a(defaultSize, i322, (char) ((i323 & 59150) + (i323 | 59150)), objArr49);
            strArr2 = new String[]{str32, str33, str34, str35, str36, (String) objArr49[0]};
            i23 = 0;
            while (true) {
                if (i23 < 6) {
                    i24 = i175;
                    break;
                }
                int i324 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                i114 = ((i324 | 89) << 1) - (i324 ^ 89);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i114 % 128;
                if (i114 % 2 == 0) {
                    Object[] objArr50 = {strArr2[i23]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                        char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 33603);
                        int iCombineMeasuredStates = 3085 - View.combineMeasuredStates(0, 0);
                        int iResolveSizeAndState = 26 - View.resolveSizeAndState(0, 0, 0);
                        byte b19 = (byte) 0;
                        byte b20 = (byte) (b19 + 1);
                        Object[] objArr51 = new Object[1];
                        c(b19, b20, (byte) (b20 - 1), objArr51);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(packedPositionChild2, iCombineMeasuredStates, iResolveSizeAndState, 1411172903, false, (String) objArr51[0], new Class[]{String.class});
                    }
                    str17 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).invoke(null, objArr50);
                    if (str17 == null && !str17.isEmpty()) {
                        i24 = (~(i175 & 265)) & (i175 | 265);
                        break;
                    }
                    i23 = ((i23 | 1) << 1) - (i23 ^ 1);
                } else {
                    Object[] objArr52 = {strArr2[i23]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                        char tapTimeout4 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 33602);
                        int defaultSize2 = 3085 - View.getDefaultSize(0, 0);
                        int iIndexOf7 = 25 - TextUtils.indexOf((CharSequence) str5, '0', 0);
                        byte b21 = (byte) 0;
                        byte b22 = (byte) (b21 + 1);
                        Object[] objArr53 = new Object[1];
                        c(b21, b22, (byte) (b22 - 1), objArr53);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(tapTimeout4, defaultSize2, iIndexOf7, 1411172903, false, (String) objArr53[0], new Class[]{String.class});
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
            int i325 = (~(i175 & i312)) & (i175 | i312);
            int i326 = (i325 | (-i325)) >> 31;
            int i327 = i24 & (~i326);
            int i328 = i312 & i326;
            int i329 = (i328 & i327) | (i327 ^ i328);
            int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
            int i330 = (doubleTapTimeout & 347) + (doubleTapTimeout | 347);
            int i331 = -(Process.myTid() >> 22);
            Object[] objArr54 = new Object[1];
            a(i330, (i331 & 17) + (i331 | 17), (char) Color.red(0), objArr54);
            str8 = (String) objArr54[0];
            int i332 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
            int i333 = (i332 ^ 587) + ((i332 & 587) << 1);
            int i334 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int i335 = ((i334 | 7) << 1) - (i334 ^ 7);
            int i336 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            Object[] objArr55 = new Object[1];
            a(i333, i335, (char) ((i336 ^ 55086) + ((i336 & 55086) << 1)), objArr55);
            bytes2 = ((String) objArr55[0]).getBytes();
            length2 = bytes2.length;
            if (length2 == 0) {
                int i337 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                i113 = (i337 & 57) + (i337 | 57);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i113 % 128;
                if (i113 % 2 != 0) {
                    i41 = ~(i175 & 21883);
                    i42 = i175 | 21883;
                    i29 = i41 & i42;
                } else {
                    i39 = i175 & (-261);
                    i40 = i178 & 260;
                    i29 = i39 | i40;
                }
            } else {
                try {
                    bufferedInputStream4 = new BufferedInputStream(new FileInputStream(str8));
                    i43 = 4096;
                    try {
                        bArr7 = new byte[4096];
                        i44 = 0;
                        while (true) {
                            i45 = bufferedInputStream4.read(bArr7, 0, i43);
                            if (i45 > 0) {
                                i46 = 0;
                                while (i44 < length2) {
                                    i47 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    i48 = i47 + 23;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i48 % 128;
                                    if (i48 % 2 == 0) {
                                        throw null;
                                    }
                                    if (i46 < i45) {
                                        break;
                                    }
                                    if (bArr7[i46] == bytes2[i44]) {
                                        i44 = ((i44 | 1) << 1) - (i44 ^ 1);
                                        i55 = (i47 & 29) + (i47 | 29);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i55 % 128;
                                        if (i55 % 2 != 0) {
                                            int i338 = 3 / 4;
                                        }
                                    } else {
                                        if (i44 != 0) {
                                            i49 = i44 - 1;
                                            while (true) {
                                                if (i49 > 0) {
                                                    bArr8 = bArr7;
                                                    i50 = i45;
                                                    i44 = 0;
                                                    break;
                                                }
                                                int i339 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                i51 = (i339 ^ 107) + ((i339 & 107) << 1);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i51 % 128;
                                                if (i51 % 2 == 0) {
                                                    z5 = false;
                                                } else {
                                                    z5 = true;
                                                }
                                                i52 = 0;
                                                while (true) {
                                                    if (i52 < i49) {
                                                        bArr8 = bArr7;
                                                        i50 = i45;
                                                        if (z5) {
                                                            break;
                                                        }
                                                        i44 = i49;
                                                        break;
                                                    }
                                                    bArr8 = bArr7;
                                                    i50 = i45;
                                                    int i340 = -i49;
                                                    i53 = (i44 & i340) + (i340 | i44);
                                                    i54 = -(-i52);
                                                    if (bytes2[i52] != bytes2[((i53 | i54) << 1) - (i53 ^ i54)]) {
                                                        int i341 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i341 % 128;
                                                        int i342 = i341 % 2;
                                                        break;
                                                    }
                                                    int i343 = (i52 ^ (-43)) + ((i52 & (-43)) << 1);
                                                    i52 = ((i343 & 44) << 1) + (i343 ^ 44);
                                                    bArr7 = bArr8;
                                                    i45 = i50;
                                                }
                                                i49--;
                                                bArr7 = bArr8;
                                                i45 = i50;
                                            }
                                        }
                                        bArr7 = bArr8;
                                        i45 = i50;
                                    }
                                    bArr8 = bArr7;
                                    i50 = i45;
                                    i46 = (i46 ^ (-77)) + ((i46 & (-77)) << 1) + 78;
                                    bArr7 = bArr8;
                                    i45 = i50;
                                }
                                bArr7 = bArr7;
                                i43 = 4096;
                            } else {
                                if (i44 == length2) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                try {
                                    bufferedInputStream4.close();
                                } catch (IOException unused6) {
                                }
                                if (z4) {
                                    int i3310 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    i113 = (i3310 & 57) + (i3310 | 57);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i113 % 128;
                                    if (i113 % 2 != 0) {
                                        i41 = ~(i175 & 21883);
                                        i42 = i175 | 21883;
                                        i29 = i41 & i42;
                                    } else {
                                        i39 = i175 & (-261);
                                        i40 = i178 & 260;
                                        i29 = i39 | i40;
                                    }
                                } else {
                                    int i344 = -ExpandableListView.getPackedPositionChild(0L);
                                    int i345 = (i344 ^ 592) + ((i344 & 592) << 1);
                                    int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                    int i346 = ((keyRepeatTimeout | 13) << 1) - (keyRepeatTimeout ^ 13);
                                    int i347 = -Process.getGidForName(str5);
                                    Object[] objArr56 = new Object[1];
                                    a(i345, i346, (char) ((i347 ^ 11524) + ((i347 & 11524) << 1)), objArr56);
                                    str9 = (String) objArr56[0];
                                    i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i25 % 128;
                                    if (i25 % 2 == 0) {
                                        int keyRepeatTimeout2 = ViewConfiguration.getKeyRepeatTimeout();
                                        i27 = 15021 >>> ((keyRepeatTimeout2 ^ 42) + ((keyRepeatTimeout2 & 42) << 1));
                                        i28 = 21;
                                        i26 = 1;
                                    } else {
                                        int i348 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                        i26 = 1;
                                        i27 = ((i348 & TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO) << 1) + (i348 ^ TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO);
                                        i28 = 8;
                                    }
                                    int iIndexOf8 = i28 - TextUtils.indexOf((CharSequence) str5, '0');
                                    int i349 = -ExpandableListView.getPackedPositionChild(0L);
                                    Object[] objArr57 = new Object[i26];
                                    a(i27, iIndexOf8, (char) ((i349 ^ (-1)) + (i349 << i26)), objArr57);
                                    bytes3 = ((String) objArr57[0]).getBytes();
                                    length3 = bytes3.length;
                                    if (length3 != 0) {
                                        try {
                                            bufferedInputStream6 = new BufferedInputStream(new FileInputStream(str9));
                                            i30 = 4096;
                                            try {
                                                bArr4 = new byte[4096];
                                                i31 = 0;
                                                while (true) {
                                                    i32 = bufferedInputStream6.read(bArr4, 0, i30);
                                                    if (i32 > 0) {
                                                        break;
                                                    }
                                                    i33 = 0;
                                                    while (i31 < length3 && i33 < i32) {
                                                        if (bArr4[i33] == bytes3[i31]) {
                                                            int i350 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                            i37 = ((i350 | 41) << 1) - (i350 ^ 41);
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i37 % 128;
                                                            if (i37 % 2 != 0) {
                                                                i31 += 31;
                                                            } else {
                                                                i31++;
                                                            }
                                                        } else {
                                                            if (i31 != 0) {
                                                                i34 = i31 - 1;
                                                                while (true) {
                                                                    if (i34 > 0) {
                                                                        bArr5 = bArr4;
                                                                        i31 = 0;
                                                                        break;
                                                                    }
                                                                    i35 = 0;
                                                                    while (true) {
                                                                        if (i35 < i34) {
                                                                            bArr5 = bArr4;
                                                                            i31 = i34;
                                                                            break;
                                                                        }
                                                                        bArr6 = bArr4;
                                                                        i36 = -i34;
                                                                        if (bytes3[i35] != bytes3[((((i31 | i36) << 1) - (i36 ^ i31)) - (~i35)) - 1]) {
                                                                            break;
                                                                        }
                                                                        i35++;
                                                                        bArr4 = bArr6;
                                                                    }
                                                                    i34--;
                                                                    bArr4 = bArr6;
                                                                }
                                                            }
                                                            bArr4 = bArr5;
                                                        }
                                                        bArr5 = bArr4;
                                                        i33 = ((i33 ^ 53) + ((i33 & 53) << 1)) - 52;
                                                        bArr4 = bArr5;
                                                    }
                                                    bArr4 = bArr4;
                                                    i30 = 4096;
                                                }
                                                if (i31 == length3) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                try {
                                                    bufferedInputStream6.close();
                                                } catch (IOException unused7) {
                                                }
                                                if (z3) {
                                                    i29 = i175;
                                                }
                                            } catch (IOException unused8) {
                                                if (bufferedInputStream6 != null) {
                                                    try {
                                                        bufferedInputStream6.close();
                                                    } catch (IOException unused9) {
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                bufferedInputStream5 = bufferedInputStream6;
                                                if (bufferedInputStream5 != null) {
                                                    try {
                                                        bufferedInputStream5.close();
                                                    } catch (IOException unused10) {
                                                    }
                                                }
                                                throw th;
                                            }
                                        } catch (IOException unused11) {
                                            bufferedInputStream6 = null;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            bufferedInputStream5 = null;
                                        }
                                    }
                                    int i351 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    i38 = (i351 ^ 91) + ((i351 & 91) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i38 % 128;
                                    if (i38 % 2 != 0) {
                                        i41 = ~(i175 & 22671);
                                        i42 = i175 | 22671;
                                        i29 = i41 & i42;
                                    } else {
                                        i39 = i175 & (-262);
                                        i40 = i178 & 261;
                                        i29 = i39 | i40;
                                    }
                                }
                            }
                        }
                    } catch (IOException unused12) {
                        if (bufferedInputStream4 != null) {
                            try {
                                bufferedInputStream4.close();
                            } catch (IOException unused13) {
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        bufferedInputStream3 = bufferedInputStream4;
                        if (bufferedInputStream3 != null) {
                            try {
                                bufferedInputStream3.close();
                            } catch (IOException unused14) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused15) {
                    bufferedInputStream4 = null;
                } catch (Throwable th7) {
                    th = th7;
                    bufferedInputStream3 = null;
                }
            }
            int i352 = (~(i175 & i329)) & (i175 | i329);
            int i353 = -i352;
            i56 = (i352 & i353) | (i352 ^ i353);
            int i354 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            i57 = ((i354 | 75) << 1) - (i354 ^ 75);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i57 % 128;
            if (i57 % 2 != 0) {
                i58 = i56 * 31;
            } else {
                i58 = i56 >> 31;
            }
            int i355 = i29 & (~i58);
            int i356 = i329 & i58;
            i59 = (i356 & i355) | (i355 ^ i356);
            if ((i2 & 8) == 0) {
                int i357 = -(-TextUtils.getOffsetBefore(str5, 0));
                Object[] objArr58 = new Object[1];
                a((i357 ^ 615) + ((i357 & 615) << 1), 43 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) TextUtils.indexOf(str5, str5, 0), objArr58);
                int i358 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i359 = (i358 & 97) + (i358 | 97);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i359 % 128;
                int i360 = i359 % 2;
                int i361 = 658 - (~ExpandableListView.getPackedPositionChild(0L));
                int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                int i362 = (maxKeyCode & 41) + (maxKeyCode | 41);
                int i363 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                Object[] objArr59 = new Object[1];
                a(i361, i362, (char) ((i363 ^ 1) + ((i363 & 1) << 1)), objArr59);
                int i364 = 697 - (~(-ExpandableListView.getPackedPositionChild(0L)));
                int i365 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 - (-1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i365 % 128;
                int i366 = i365 % 2;
                int i367 = -Color.rgb(0, 0, 0);
                int i368 = (((-16777178) | i367) << 1) - (i367 ^ (-16777178));
                char mirror = AndroidCharacter.getMirror('0');
                char c7 = (char) ((mirror & 49683) + (49683 | mirror));
                Object[] objArr60 = new Object[1];
                a(i364, i368, c7, objArr60);
                strArr9 = new String[]{(String) objArr58[0], (String) objArr59[0], (String) objArr60[0]};
                i108 = 0;
                while (true) {
                    if (i108 < 3) {
                        i109 = i59;
                        i110 = i175;
                        break;
                    }
                    Object[] objArr61 = {strArr9[i108]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                        char gidForName = (char) (Process.getGidForName(str5) + 1);
                        int i369 = 993 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int offsetBefore = 8 - TextUtils.getOffsetBefore(str5, 0);
                        byte b23 = (byte) 0;
                        byte b24 = b23;
                        Object[] objArr62 = new Object[1];
                        c(b23, b24, b24, objArr62);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(gidForName, i369, offsetBefore, 349342683, false, (String) objArr62[0], new Class[]{String.class});
                    }
                    long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr61)).longValue();
                    long j46 = 39594472;
                    strArr10 = strArr9;
                    long j47 = 614;
                    i111 = i108;
                    long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    long j48 = j46 ^ j25;
                    long j49 = (j48 | jLongValue7) ^ j25;
                    long j50 = jLongValue7 ^ j25;
                    i112 = i59;
                    long j51 = jElapsedRealtime ^ j25;
                    j4 = (((long) 615) * j46) + (((long) (-613)) * jLongValue7) + ((jElapsedRealtime | j49 | ((j50 | j46) ^ j25)) * j47) + (((long) (-1228)) * (((j48 | j51) ^ j25) | j49 | ((j51 | jLongValue7) ^ j25))) + (j47 * ((((j48 | j50) | j51) ^ j25) | (((j51 | j46) | jLongValue7) ^ j25))) + ((long) (-886673077));
                    i175 = i;
                    if (((((int) (j4 >> 32)) & ((-802173004) + (((-744506531) | i178) * (-369)) + (((~(2103461026 | i178)) | (-754279859)) * (-369)) + (((~((-2103461027) | i175)) | 1358954496 | (~((-9773329) | i178))) * 369))) | (((int) j4) & (2055568080 + (((~(211988933 | i178)) | (-1225237477)) * 226) + (((~(1225237476 | i175)) | 77598721 | (~((-1090847265) | i178))) * (-113)) + ((~(211988933 | i175)) * 113)))) != 0) {
                        int i370 = i111 + 280;
                        i110 = ((~i370) & i175) | (i370 & i178);
                        i109 = i112;
                        break;
                    }
                    i108 = (i111 ^ 1) + ((i111 & 1) << 1);
                    strArr9 = strArr10;
                    i59 = i112;
                }
                int i371 = ((~i109) & i175) | (i109 & i178);
                int i372 = -i371;
                int i373 = ((i371 & i372) | (i371 ^ i372)) >> 31;
                int i374 = i110 & (~i373);
                int i375 = i109 & i373;
                i59 = (i374 & i375) | (i374 ^ i375);
            }
            strArr3 = new String[2];
            globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
            i60 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i60 % 128;
            if (i60 % 2 != 0) {
                i61 = 736 >> (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1));
                i63 = 3 / (ExpandableListView.getPackedPositionForGroup(1) > 1L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 1L ? 0 : -1));
                i62 = 0;
            } else {
                int i376 = (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1));
                i61 = ((i376 | 736) << 1) - (736 ^ i376);
                i62 = 0;
                int i377 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                i63 = (i377 | 41) + (i377 & 41);
            }
            Object[] objArr63 = new Object[1];
            a(i61, i63, (char) (34266 - (~TextUtils.indexOf((CharSequence) str5, '0', i62))), objArr63);
            strArr3[i62] = (String) objArr63[i62];
            int keyRepeatTimeout3 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
            int i378 = (keyRepeatTimeout3 ^ 778) + ((keyRepeatTimeout3 & 778) << 1);
            int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
            Object[] objArr64 = new Object[1];
            a(i378, ((jumpTapTimeout | 30) << 1) - (jumpTapTimeout ^ 30), (char) ((-2) - (~(-MotionEvent.axisFromString(str5)))), objArr64);
            strArr3[1] = (String) objArr64[0];
            i64 = 0;
            i65 = 2;
            while (true) {
                if (i64 < i65) {
                    i66 = i59;
                    i67 = i175;
                    i68 = i67;
                    break;
                }
                Object[] objArr65 = {strArr3[i64]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cAxisFromString = (char) (MotionEvent.axisFromString(str5) + 1);
                    int iIndexOf9 = TextUtils.indexOf(str5, str5, 0, 0) + 993;
                    int i379 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9;
                    byte b25 = (byte) 0;
                    Object[] objArr66 = new Object[1];
                    c(b25, (byte) (b25 | 6), b25, objArr66);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cAxisFromString, iIndexOf9, i379, -545305915, false, (String) objArr66[0], new Class[]{String.class});
                }
                long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).invoke(null, objArr65)).longValue();
                long j52 = 567565049;
                i66 = i59;
                long j53 = 140;
                i105 = i64;
                long jElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                long j54 = (j52 ^ j25) | jLongValue8;
                long j55 = jElapsedRealtime2 ^ j25;
                long j56 = (((long) 141) * j52) + (((long) (-279)) * jLongValue8) + ((jLongValue8 | jElapsedRealtime2) * j53) + (((long) (-280)) * ((j54 ^ j25) | ((j55 | jLongValue8) ^ j25))) + (((((jLongValue8 ^ j25) | j52) ^ j25) | ((j55 | j52) ^ j25) | ((j54 | jElapsedRealtime2) ^ j25)) * j53) + ((long) 52894235);
                i67 = i;
                i106 = ((int) (j56 >> 32)) & ((-798338826) + (((~(1311962920 | i67)) | 1545777964) * (-964)) + (((~(1311962920 | i178)) | 268435460) * (-964)));
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i380 = ~iFreeMemory;
                i107 = ((int) j56) & (1545287780 + ((~(1343104127 | i380)) * 979) + (((-94122283) | iFreeMemory) * (-979)) + (((~(iFreeMemory | 1343104127)) | (~(i380 | (-94122283)))) * 979));
                if (((i106 & i107) | (i106 ^ i107)) != 0) {
                    int i381 = (i105 ^ 288) + ((i105 & 288) << 1);
                    i68 = (~(i67 & i381)) & (i381 | i67);
                    break;
                }
                int i382 = i105 + 104;
                i175 = i67;
                i65 = 2;
                i64 = ((i382 | (-103)) << 1) - (i382 ^ (-103));
                i59 = i66;
            }
            int i383 = (~(i67 & i66)) & (i67 | i66);
            int i384 = (i383 | (-i383)) >> 31;
            int i385 = i68 & (~i384);
            int i386 = i66 & i384;
            i69 = (i385 & i386) | (i385 ^ i386);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-555308653);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char c8 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                int scrollBarSize2 = 3526 - (ViewConfiguration.getScrollBarSize() >> 8);
                int i387 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22;
                byte b26 = (byte) 0;
                byte b27 = (byte) (b26 + 1);
                Object[] objArr67 = new Object[1];
                c(b26, b27, (byte) (b27 - 1), objArr67);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c8, scrollBarSize2, i387, 980946500, false, (String) objArr67[0], new Class[0]);
            }
            long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, null)).longValue();
            long j57 = -137689566;
            long j58 = (((long) 450) * j57) + (((long) (-448)) * jLongValue9);
            long j59 = 449;
            long j60 = ((j57 ^ j25) | jLongValue9) ^ j25;
            long j61 = jLongValue9 ^ j25;
            str10 = str5;
            long j62 = j58 + ((j60 | (((j61 | j57) | j) ^ j25)) * j59) + (((long) (-1347)) * j60) + (j59 * (j60 | (((j61 | j2) | j57) ^ j25))) + ((long) (-42633072));
            int i388 = (~((int) Process.getElapsedCpuTime())) | 337900826;
            i70 = ((int) (j62 >> 32)) & (1360173225 + (i388 * 495) + (((~i388) | 155664) * 495));
            int i389 = (int) Runtime.getRuntime().totalMemory();
            i71 = ((int) j62) & ((-635053948) + (((-69207050) | i389) * (-627)) + (((~(618669257 | i389)) | (-818557153)) * (-627)) + (((~(i389 | (-818557153))) | (~((~i389) | (-618669258)))) * 627));
            if (((i70 & i71) | (i70 ^ i71)) != 1) {
                Object[] objArr68 = {1};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1331892133);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char mode2 = (char) View.MeasureSpec.getMode(0);
                    int iRgb2 = 16779889 + Color.rgb(0, 0, 0);
                    int doubleTapTimeout2 = 16 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte b28 = (byte) 0;
                    byte b29 = (byte) (b28 + 1);
                    Object[] objArr69 = new Object[1];
                    c(b28, b29, (byte) (b29 - 1), objArr69);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode2, iRgb2, doubleTapTimeout2, -1409439630, false, (String) objArr69[0], new Class[]{Integer.TYPE});
                }
                long jLongValue10 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr68)).longValue();
                long j63 = 444746919;
                long j64 = j63 ^ j25;
                long jNextInt = new Random().nextInt();
                long j65 = (((long) 303) * j63) + (((long) (-301)) * jLongValue10) + (((long) (-302)) * ((((j64 | (jNextInt ^ j25)) | jLongValue10) ^ j25) | (((j63 | jLongValue10) | jNextInt) ^ j25))) + (((long) (-604)) * (((j64 | jLongValue10) | jNextInt) ^ j25)) + (((long) 302) * (((jNextInt | jLongValue10) ^ j25) | (((jLongValue10 ^ j25) | j63) ^ j25))) + ((long) 1422951761);
                int i390 = ~((int) Process.getStartUptimeMillis());
                i73 = ((int) (j65 >> 32)) & ((((~(1531524390 | i390)) | (-1598911791)) * (-241)) + 1351484523 + (((~(i390 | (-67387401))) | 272695296) * 241));
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                i74 = ((int) j65) & ((-1547799566) + (((~(1402582425 | iUptimeMillis)) | (~((-34643985) | iUptimeMillis))) * 69) + (((~(iUptimeMillis | (-1402516882))) | (~(34709528 | iUptimeMillis)) | 1367872897) * (-69)) + 4522536);
                if (((i73 & i74) | (i73 ^ i74)) != 0) {
                    i75 = (i67 & (-221)) | (i178 & 220);
                } else {
                    i75 = i67;
                }
                int i391 = i67 ^ i69;
                int i392 = -i391;
                int i393 = ((i391 & i392) | (i391 ^ i392)) >> 31;
                int i394 = i75 & (~i393);
                int i395 = i69 & i393;
                i76 = (i395 & i394) | (i394 ^ i395);
                int i396 = 368 - (~(-(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))));
                int i397 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                int i398 = ((i397 | 23) << 1) - (i397 ^ 23);
                int mode3 = View.MeasureSpec.getMode(0);
                int i399 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i400 = ((i399 | 65) << 1) - (i399 ^ 65);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i400 % 128;
                int i401 = i400 % 2;
                Object[] objArr70 = new Object[1];
                a(i396, i398, (char) (4994 - (~(-mode3))), objArr70);
                Object[] objArr71 = {(String) objArr70[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    str11 = str10;
                    char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) str11, '0') + 33603);
                    int i402 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3085;
                    int fadingEdgeLength3 = 26 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte b30 = (byte) 0;
                    byte b31 = (byte) (b30 + 1);
                    Object[] objArr72 = new Object[1];
                    c(b30, b31, (byte) (b31 - 1), objArr72);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf3, i402, fadingEdgeLength3, 1411172903, false, (String) objArr72[0], new Class[]{String.class});
                } else {
                    str11 = str10;
                }
                objInvoke = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr71);
                try {
                    try {
                        if (objInvoke != null) {
                            Object[] objArr73 = {objInvoke, 42};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                                char fadingEdgeLength4 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                int mode4 = 3393 - View.MeasureSpec.getMode(0);
                                int i403 = 9 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                byte b32 = (byte) 0;
                                byte b33 = (byte) (b32 + 1);
                                Object[] objArr74 = new Object[1];
                                c(b32, b33, (byte) (b33 - 1), objArr74);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(fadingEdgeLength4, mode4, i403, 1203525406, false, (String) objArr74[0], new Class[]{String.class, Integer.TYPE});
                            }
                            strArr6 = null;
                            long jLongValue11 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr73)).longValue();
                            long j66 = 2012469106;
                            long j67 = 829;
                            long j68 = (j67 * j66) + (j67 * jLongValue11);
                            long j69 = -828;
                            long j70 = j68 + (((((j66 ^ j25) | (jLongValue11 ^ j25)) ^ j25) | (((j2 | j66) | jLongValue11) ^ j25)) * j69);
                            long j71 = jLongValue11 | j66;
                            long j72 = j70 + (j69 * (j71 | j2)) + (((long) 828) * (j71 ^ j25)) + ((long) (-2014538983));
                            int i404 = ~(1281706427 | i67);
                            i103 = ((int) (j72 >> 32)) & (((763683666 + (((-155519984) | i404) * (-220))) + ((i404 | (-1298484224)) * 220)) - 1277394920);
                            int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                            int i405 = ~startUptimeMillis2;
                            i104 = ((int) j72) & (((((~(i405 | (-1453361954))) | ((~((-16135544) | i405)) | 10486049)) * (-397)) - 2030266515) + ((startUptimeMillis2 | (-1448525399)) * 397));
                            if (((i103 & i104) | (i103 ^ i104)) == 1986687685) {
                                str12 = str11;
                            }
                            iIndexOf = TextUtils.indexOf(str12, str12, 0);
                            int i406 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            i85 = (i406 & 107) + (i406 | 107);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i85 % 128;
                            if (i85 % 2 == 0) {
                                i87 = 889 / iIndexOf;
                                iNormalizeMetaState = KeyEvent.normalizeMetaState(0) * 120;
                                i86 = 1;
                            } else {
                                int i407 = -(-iIndexOf);
                                i86 = 1;
                                i87 = ((i407 | 889) << 1) - (889 ^ i407);
                                int i408 = -(-KeyEvent.normalizeMetaState(0));
                                iNormalizeMetaState = ((i408 & 16) << 1) + (i408 ^ 16);
                            }
                            int i409 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
                            Object[] objArr75 = new Object[i86];
                            a(i87, iNormalizeMetaState, (char) (((51869 | i409) << i86) - (i409 ^ 51869)), objArr75);
                            Object[] objArr76 = {(String) objArr75[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                char offsetBefore2 = (char) (33602 - TextUtils.getOffsetBefore(str12, 0));
                                int fadingEdgeLength5 = 3085 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                int iLastIndexOf2 = TextUtils.lastIndexOf(str12, '0', 0) + 27;
                                byte b34 = (byte) 0;
                                byte b35 = (byte) (b34 + 1);
                                Object[] objArr77 = new Object[1];
                                c(b34, b35, (byte) (b35 - 1), objArr77);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(offsetBefore2, fadingEdgeLength5, iLastIndexOf2, 1411172903, false, (String) objArr77[0], new Class[]{String.class});
                            }
                            objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr76);
                            if (objInvoke2 == null) {
                                i72 = i67;
                                i88 = 0;
                            } else {
                                Object[] objArr78 = {objInvoke2, 42};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                    char c9 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int windowTouchSlop2 = 3393 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                    int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L) + 9;
                                    byte b36 = (byte) 0;
                                    byte b37 = (byte) (b36 + 1);
                                    Object[] objArr79 = new Object[1];
                                    c(b36, b37, (byte) (b37 - 1), objArr79);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c9, windowTouchSlop2, packedPositionGroup3, 1203525406, false, (String) objArr79[0], new Class[]{String.class, Integer.TYPE});
                                }
                                long jLongValue12 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr78)).longValue();
                                long j73 = 159255616;
                                long j74 = 46;
                                long j75 = jLongValue12 ^ j25;
                                long jNextInt2 = new Random().nextInt();
                                long j76 = jNextInt2 ^ j25;
                                long j77 = (j74 * j73) + (j74 * jLongValue12) + (((long) (-90)) * (j73 | ((j75 | j76) ^ j25))) + (((long) (-45)) * (((j75 | jNextInt2) ^ j25) | ((jLongValue12 | j73) ^ j25))) + (((long) 45) * (j75 | ((jNextInt2 | (j73 ^ j25)) ^ j25) | ((j76 | j73) ^ j25))) + ((long) (-161325493));
                                i72 = i;
                                int i410 = ((int) (j77 >> 32)) & (1522584826 + (((~(1135418171 | i178)) | (-1722322714)) * (-602)) + (((~(1135418171 | i72)) | (-1739431740) | (~((-1118309146) | i178))) * (-301)) + ((~(i178 | (-1722322714))) * 301));
                                int i411 = ~((int) SystemClock.uptimeMillis());
                                int i412 = ((int) j77) & ((((~((-1349774508) | i411)) | 1348578474) * (-241)) + 1689859423 + (((~(i411 | (-1196034))) | 159387904) * 241));
                                i88 = (i412 & i410) | (i410 ^ i412);
                            }
                            if (i88 != 1986687685 || i88 == -1514516938) {
                                str14 = str12;
                                j3 = j25;
                                strArr6 = strArr6;
                            } else {
                                int i413 = 1606 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                                int i414 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                Object[] objArr80 = new Object[1];
                                a(i413, ((i414 | 15) << 1) - (i414 ^ 15), (char) (Color.rgb(0, 0, 0) + 16777216), objArr80);
                                String str37 = (String) objArr80[0];
                                int i415 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i416 = i415 * 141;
                                int i417 = (i416 ^ (-225319)) + ((i416 & (-225319)) << 1);
                                int i418 = ~i415;
                                int i419 = ~(i418 | 1621);
                                int i420 = ~i415;
                                int i421 = ~((i420 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i420 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                int i422 = -(-(((i419 & i421) | (i419 ^ i421)) * (-280)));
                                int i423 = ((i417 | i422) << 1) - (i422 ^ i417);
                                int i424 = ~(i418 | iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                                int i425 = ~(((-1622) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-1622) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                int i426 = -(-(((i424 & i425) | (i424 ^ i425)) * 140));
                                int i427 = ((i423 | i426) << 1) - (i426 ^ i423);
                                int i428 = (i420 ^ (-1622)) | (i420 & (-1622));
                                int i429 = ~((i428 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i428 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                int i430 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                int i431 = (i420 ^ i430) | (i420 & i430);
                                int i432 = ~((i431 & 1621) | (i431 ^ 1621));
                                int i433 = (i429 & i432) | (i429 ^ i432);
                                int i434 = ~(i415 | i430 | (-1622));
                                int i435 = (i427 - (~(-(-(((i434 & i433) | (i433 ^ i434)) * 140))))) - 1;
                                int tapTimeout5 = ViewConfiguration.getTapTimeout() >> 16;
                                Object[] objArr81 = new Object[1];
                                a(i435, ((tapTimeout5 | 26) << 1) - (tapTimeout5 ^ 26), (char) TextUtils.getOffsetAfter(str12, 0), objArr81);
                                String str38 = (String) objArr81[0];
                                Object[] objArr82 = new Object[1];
                                a((ViewConfiguration.getPressedStateDuration() >> 16) + 1648, Process.getGidForName(str12) + 18, (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr82);
                                String str39 = (String) objArr82[0];
                                int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i436 = 609 - (~(-(-(maximumDrawingCacheSize * 306))));
                                int i437 = (i436 ^ 509490) + ((i436 & 509490) << 1);
                                int i438 = ~((maximumDrawingCacheSize ^ 1665) | (maximumDrawingCacheSize & 1665));
                                int i439 = ~((maximumDrawingCacheSize ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (maximumDrawingCacheSize & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                int i440 = i437 + (((i438 & i439) | (i438 ^ i439)) * 305);
                                int i441 = -(-(((~(maximumDrawingCacheSize | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) | (-1666)) * 305));
                                int i442 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                int i443 = (i442 & 18) + (i442 | 18);
                                int i444 = -(-Gravity.getAbsoluteGravity(0, 0));
                                Object[] objArr83 = new Object[1];
                                a((i440 ^ i441) + ((i441 & i440) << 1), i443, (char) (((i444 | 36572) << 1) - (i444 ^ 36572)), objArr83);
                                String str40 = (String) objArr83[0];
                                int i445 = -TextUtils.lastIndexOf(str12, '0', 0);
                                int i446 = -((Process.getThreadPriority(0) + 20) >> 6);
                                Object[] objArr84 = new Object[1];
                                a((i445 ^ 1681) + ((i445 & 1681) << 1), ((i446 | 15) << 1) - (i446 ^ 15), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr84);
                                String str41 = (String) objArr84[0];
                                int i447 = -(Process.myPid() >> 22);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i448 = (i447 * 673) - 2279071;
                                int i449 = ~((i447 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i447 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                int i450 = -(-(((i449 & 1697) | (i449 ^ 1697)) * 672));
                                int i451 = (i448 ^ i450) + ((i448 & i450) << 1);
                                int i452 = ~i447;
                                int i453 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                int i454 = ~((i452 & i453) | (i452 ^ i453));
                                int i455 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & 1697) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 ^ 1697));
                                int i456 = -(-(((i455 & i454) | (i454 ^ i455)) * (-672)));
                                int i457 = (i451 & i456) + (i456 | i451);
                                int i458 = ~(((-1698) & i453) | ((-1698) ^ i453));
                                int i459 = ~((i447 & (-1698)) | ((-1698) ^ i447));
                                int i460 = -(-(((i459 & i458) | (i458 ^ i459)) * 672));
                                Object[] objArr85 = new Object[1];
                                a((i457 ^ i460) + ((i460 & i457) << 1), ImageFormat.getBitsPerPixel(0) + 38, (char) TextUtils.indexOf(str12, str12), objArr85);
                                String str42 = (String) objArr85[0];
                                int i461 = -ExpandableListView.getPackedPositionType(0L);
                                Object[] objArr86 = new Object[1];
                                a((i461 ^ 1734) + ((i461 & 1734) << 1), TextUtils.indexOf(str12, str12, 0) + 12, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr86);
                                String str43 = (String) objArr86[0];
                                Object[] objArr87 = new Object[1];
                                a(1745 - (~(-(-(ViewConfiguration.getScrollBarSize() >> 8)))), TextUtils.indexOf((CharSequence) str12, '0') + 14, (char) (22437 - (~(ViewConfiguration.getMaximumFlingVelocity() >> 16))), objArr87);
                                String str44 = (String) objArr87[0];
                                int i462 = -MotionEvent.axisFromString(str12);
                                int i463 = (i462 & 1758) + (i462 | 1758);
                                int defaultSize3 = View.getDefaultSize(0, 0) + 22;
                                int i464 = -View.resolveSizeAndState(0, 0, 0);
                                Object[] objArr88 = new Object[1];
                                a(i463, defaultSize3, (char) ((i464 ^ 44005) + ((i464 & 44005) << 1)), objArr88);
                                String str45 = (String) objArr88[0];
                                int deadChar2 = KeyEvent.getDeadChar(0, 0);
                                int i465 = (deadChar2 ^ 1781) + ((deadChar2 & 1781) << 1);
                                int i466 = 30 - (~TextUtils.getTrimmedLength(str12));
                                int i467 = -KeyEvent.normalizeMetaState(0);
                                Object[] objArr89 = new Object[1];
                                a(i465, i466, (char) (((i467 | 45013) << 1) - (i467 ^ 45013)), objArr89);
                                String str46 = (String) objArr89[0];
                                int i468 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                Object[] objArr90 = new Object[1];
                                a(((i468 | 1811) << 1) - (i468 ^ 1811), 11 - (~(ViewConfiguration.getScrollBarSize() >> 8)), (char) Gravity.getAbsoluteGravity(0, 0), objArr90);
                                String str47 = (String) objArr90[0];
                                int iKeyCodeFromString = KeyEvent.keyCodeFromString(str12) + 1824;
                                int i469 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                                Object[] objArr91 = new Object[1];
                                a(iKeyCodeFromString, (i469 ^ 12) + ((i469 & 12) << 1), (char) (63671 - TextUtils.indexOf((CharSequence) str12, '0')), objArr91);
                                String str48 = (String) objArr91[0];
                                int maximumDrawingCacheSize2 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                int i470 = (maximumDrawingCacheSize2 ^ 1836) + ((maximumDrawingCacheSize2 & 1836) << 1);
                                int i471 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                Object[] objArr92 = new Object[1];
                                a(i470, (i471 ^ 12) + ((i471 & 12) << 1), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr92);
                                String str49 = (String) objArr92[0];
                                int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1848;
                                int i472 = -(-(ViewConfiguration.getTapTimeout() >> 16));
                                Object[] objArr93 = new Object[1];
                                a(minimumFlingVelocity2, ((i472 | 12) << 1) - (i472 ^ 12), (char) (ExpandableListView.getPackedPositionChild(0L) + 57669), objArr93);
                                String str50 = (String) objArr93[0];
                                int i473 = -TextUtils.lastIndexOf(str12, '0', 0);
                                int i474 = (i473 ^ 1859) + ((i473 & 1859) << 1);
                                int i475 = -Color.argb(0, 0, 0, 0);
                                int i476 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                Object[] objArr94 = new Object[1];
                                a(i474, (i475 ^ 12) + ((i475 & 12) << 1), (char) ((i476 & 2937) + (i476 | 2937)), objArr94);
                                String str51 = (String) objArr94[0];
                                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1872;
                                int i477 = -TextUtils.indexOf((CharSequence) str12, '0', 0);
                                Object[] objArr95 = new Object[1];
                                a(scrollDefaultDelay, (i477 ^ 13) + ((i477 & 13) << 1), (char) (27123 - (~(-(Process.myPid() >> 22)))), objArr95);
                                String str52 = (String) objArr95[0];
                                Object[] objArr96 = new Object[1];
                                a(1885 - (~(-(KeyEvent.getMaxKeyCode() >> 16))), 11 - (~(-TextUtils.indexOf(str12, str12, 0))), (char) (62260 - (~(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))), objArr96);
                                String str53 = (String) objArr96[0];
                                int iIndexOf10 = TextUtils.indexOf((CharSequence) str12, '0', 0, 0);
                                int i478 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                Object[] objArr97 = new Object[1];
                                a((iIndexOf10 & 1899) + (iIndexOf10 | 1899), ((i478 | 24) << 1) - (i478 ^ 24), (char) (49562 - (~(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))), objArr97);
                                String str54 = (String) objArr97[0];
                                int i479 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int i480 = (i479 ^ 1922) + ((i479 & 1922) << 1);
                                int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0);
                                Object[] objArr98 = new Object[1];
                                a(i480, (iResolveSizeAndState2 & 28) + (iResolveSizeAndState2 | 28), (char) View.resolveSizeAndState(0, 0, 0), objArr98);
                                String[] strArr14 = {str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, (String) objArr98[0]};
                                int i481 = 0;
                                while (true) {
                                    if (i481 >= 19) {
                                        str14 = str12;
                                        j3 = j25;
                                        strArr6 = strArr6;
                                        i481 = -1;
                                        break;
                                    }
                                    String str55 = strArr14[i481];
                                    Object[] objArr99 = {str55};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                                        char c10 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                        int capsMode = 993 - TextUtils.getCapsMode(str12, 0, 0);
                                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 8;
                                        byte b38 = (byte) 0;
                                        byte b39 = b38;
                                        Object[] objArr100 = new Object[1];
                                        c(b38, b39, b39, objArr100);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(c10, capsMode, pressedStateDuration, 349342683, false, (String) objArr100[0], new Class[]{String.class});
                                    }
                                    long jLongValue13 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).invoke(null, objArr99)).longValue();
                                    long j78 = -758033134;
                                    str14 = str12;
                                    j3 = j25;
                                    long j79 = j78 ^ j3;
                                    long j80 = (((long) 236) * j78) + (((long) 471) * jLongValue13) + (((long) (-235)) * (jLongValue13 | ((j79 | j2) ^ j3))) + (((long) (-470)) * (jLongValue13 | ((j79 | j) ^ j3))) + (((long) 235) * ((((j79 | jLongValue13) | j) ^ j3) | (((jLongValue13 ^ j3) | j78) ^ j3))) + ((long) (-89045471));
                                    int i482 = ((int) (j80 >> 32)) & (979836882 + (((-660350225) | i72) * (-50)) + (((~((-1476549292) | i72)) | (~((-621027345) | i178))) * 50) + (((~((-660350225) | i178)) | (~((-2097576636) | i178)) | 621027344) * 50));
                                    int i483 = ((int) j80) & ((-501357939) + (((~((-1579574521) | i178)) | 1277576280) * 168) + ((~((-1277576281) | i72)) * 168) + (((~((-1278166366) | i178)) | 590085 | (~((-301998241) | i72))) * 168));
                                    if (((i482 & i483) | (i482 ^ i483)) != 0) {
                                        break;
                                    }
                                    int i484 = 1871 - (~(-Gravity.getAbsoluteGravity(0, 0)));
                                    int i485 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14;
                                    int i486 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                    Object[] objArr101 = new Object[1];
                                    a(i484, i485, (char) (((i486 | 27124) << 1) - (i486 ^ 27124)), objArr101);
                                    if (str55.equals((String) objArr101[0])) {
                                        Object[] objArr102 = {str55};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                                            char mode5 = (char) View.MeasureSpec.getMode(0);
                                            int i487 = 994 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                            int threadPriority4 = 8 - ((Process.getThreadPriority(0) + 20) >> 6);
                                            byte b40 = (byte) 0;
                                            byte b41 = b40;
                                            Object[] objArr103 = new Object[1];
                                            c(b40, b41, b41, objArr103);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(mode5, i487, threadPriority4, 349342683, false, (String) objArr103[0], new Class[]{String.class});
                                        }
                                        long jLongValue14 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).invoke(null, objArr102)).longValue();
                                        long j81 = -265963629;
                                        long j82 = (((long) (-244)) * j81) + (((long) 246) * jLongValue14);
                                        long j83 = -245;
                                        long j84 = jLongValue14 ^ j3;
                                        long jNextInt3 = new Random().nextInt(215367604);
                                        long j85 = j82 + ((((j84 | (jNextInt3 ^ j3)) ^ j3) | ((j84 | j81) ^ j3)) * j83);
                                        long j86 = (j84 | jNextInt3) ^ j3;
                                        long j87 = j85 + (j83 * j86) + (((long) 245) * (j86 | j81)) + ((long) (-581114976));
                                        int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                                        int i488 = ((int) (j87 >> 32)) & ((-2005432166) + (((~(1516992021 | iUptimeMillis2)) | (-1609266752)) * 104) + ((~((~iUptimeMillis2) | (-1248474134))) * (-104)) + ((iUptimeMillis2 | (-1340748864)) * 104));
                                        int iNextInt4 = new Random().nextInt(1328078129);
                                        int i489 = ((int) j87) & (1636024061 + (((~((-485700650) | iNextInt4)) | (-951525761)) * 191) + (((~((~iNextInt4) | (-485700650))) | 71308329) * 191));
                                        if (((i488 & i489) | (i488 ^ i489)) != 0) {
                                            int i490 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                            int i491 = ((i490 | 7) << 1) - (i490 ^ 7);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i491 % 128;
                                            if (i491 % 2 == 0) {
                                                break;
                                            }
                                            throw null;
                                        }
                                    }
                                    int i492 = (i481 & (-24)) + (i481 | (-24));
                                    i481 = ((i492 | 25) << 1) - (i492 ^ 25);
                                    strArr6 = strArr6;
                                    strArr14 = strArr14;
                                    j25 = j3;
                                    str12 = str14;
                                }
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i493 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i493 % 128;
                                if (i493 % 2 != 0) {
                                    i102 = 125 * (TypedValues.PositionType.TYPE_PERCENT_WIDTH >> i481) * ((-502) / ((i481 ^ 130) | (i481 & 130)));
                                } else {
                                    int i494 = i481 * TypedValues.PositionType.TYPE_PERCENT_WIDTH;
                                    i102 = ((((65390 | i494) << 1) - (i494 ^ 65390)) - (~(-(-(((i481 ^ 130) | (i481 & 130)) * (-502)))))) - 1;
                                }
                                int i495 = ~i481;
                                int i496 = i481 | 130;
                                int i497 = -(-((-502) * ((~((-131) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault7))) | (~(((-131) ^ i495) | ((-131) & i495))) | (~((i496 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i496 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7))))));
                                int i498 = (i102 ^ i497) + ((i102 & i497) << 1);
                                int i499 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                int i500 = (i499 & (-131)) | ((-131) ^ i499);
                                int i501 = ~((i500 & i481) | (i500 ^ i481));
                                int i502 = (i481 ^ 130) | (i481 & 130);
                                int i503 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault7 & i502) | (i502 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                int i504 = -(-(((i503 & i501) | (i501 ^ i503)) * TypedValues.PositionType.TYPE_DRAWPATH));
                                int i505 = ((i498 | i504) << 1) - (i504 ^ i498);
                                int i506 = (i495 | (-i495)) >> 31;
                                int i507 = ((~(i72 & i505)) & (i505 | i72) & i506) | ((~i506) & i72);
                                int i508 = ((~i76) & i72) | (i76 & i178);
                                int i509 = -i508;
                                int i510 = ((i508 & i509) | (i508 ^ i509)) >> 31;
                                int i511 = i507 & (~i510);
                                int i512 = i76 & i510;
                                i76 = (i512 & i511) | (i511 ^ i512);
                            }
                            str15 = str14;
                            int i513 = 1949 - (~TextUtils.getOffsetAfter(str15, 0));
                            int iAxisFromString2 = MotionEvent.axisFromString(str15);
                            int i514 = (iAxisFromString2 & 14) + (iAxisFromString2 | 14);
                            int iIndexOf11 = TextUtils.indexOf((CharSequence) str15, '0', 0, 0);
                            char c11 = (char) ((iIndexOf11 ^ 1) + ((iIndexOf11 & 1) << 1));
                            Object[] objArr104 = new Object[1];
                            a(i513, i514, c11, objArr104);
                            String str56 = (String) objArr104[0];
                            int i515 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int iIndexOf12 = TextUtils.indexOf((CharSequence) str15, '0', 0);
                            Object[] objArr105 = new Object[1];
                            a((i515 ^ 1964) + ((i515 & 1964) << 1), (iIndexOf12 ^ 6) + ((iIndexOf12 & 6) << 1), (char) View.resolveSize(0, 0), objArr105);
                            int i516 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            Object[] objArr106 = new Object[1];
                            a((i516 & 1968) + (i516 | 1968), 14 - (~(-(ViewConfiguration.getEdgeSlop() >> 16))), (char) ((-2) - ((-ExpandableListView.getPackedPositionChild(0L)) ^ (-1))), objArr106);
                            int i517 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                            int i518 = (i517 & 1983) + (i517 | 1983);
                            TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int iBlue2 = Color.blue(0);
                            int i519 = iBlue2 * (-958);
                            int i520 = ((i519 | (-18202)) << 1) - (i519 ^ (-18202));
                            int i521 = ~(((-20) ^ i178) | ((-20) & i178));
                            int i522 = ~iBlue2;
                            int i523 = ~((i522 ^ i72) | (i522 & i72));
                            int i524 = (i521 & i523) | (i521 ^ i523);
                            int i525 = ~((i174 ^ iBlue2) | (i174 & iBlue2));
                            int i526 = ((i524 & i525) | (i524 ^ i525)) * 959;
                            int i527 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i528 = (i527 ^ 95) + ((i527 & 95) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i528 % 128;
                            int i529 = i528 % 2;
                            int i530 = -(-i526);
                            int i531 = (i520 & i530) + (i520 | i530);
                            int i532 = (~((iBlue2 ^ 19) | (iBlue2 & 19))) * (-959);
                            int i533 = (i531 ^ i532) + ((i532 & i531) << 1);
                            int i534 = ~((i522 ^ i178) | (i522 & i178));
                            int i535 = ~(((-20) & i72) | ((-20) ^ i72));
                            int i536 = (i535 & i534) | (i534 ^ i535);
                            int i537 = ~((iBlue2 & i72) | (iBlue2 ^ i72));
                            Object[] objArr107 = new Object[1];
                            a(i518, i533 + (((i536 & i537) | (i536 ^ i537)) * 959), (char) (52828 - (~(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))))), objArr107);
                            int iRgb3 = Color.rgb(0, 0, 0);
                            int i538 = ((iRgb3 | 16779218) << 1) - (16779218 ^ iRgb3);
                            int i539 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                            int i540 = (i539 ^ 14) + ((i539 & 14) << 1);
                            int i541 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            Object[] objArr108 = new Object[1];
                            a(i538, i540, (char) ((i541 & 52591) + (i541 | 52591)), objArr108);
                            String[] strArr15 = {(String) objArr106[0], (String) objArr107[0], (String) objArr108[0]};
                            int mode6 = View.MeasureSpec.getMode(0) + 2016;
                            int i542 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                            Object[] objArr109 = new Object[1];
                            a(mode6, (i542 & 20) + (i542 | 20), (char) TextUtils.getOffsetAfter(str15, 0), objArr109);
                            String str57 = (String) objArr109[0];
                            int i543 = -MotionEvent.axisFromString(str15);
                            int i544 = (i543 & 2036) + (i543 | 2036);
                            int i545 = -(ViewConfiguration.getEdgeSlop() >> 16);
                            int i546 = (i545 ^ 10) + ((i545 & 10) << 1);
                            int i547 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            Object[] objArr110 = new Object[1];
                            a(i544, i546, (char) ((i547 ^ 62405) + ((i547 & 62405) << 1)), objArr110);
                            Object[] objArr111 = new Object[1];
                            a(2047 - View.getDefaultSize(0, 0), 11 - (~(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (char) View.combineMeasuredStates(0, 0), objArr111);
                            String str58 = (String) objArr111[0];
                            int i548 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int i549 = (i548 ^ 587) + ((i548 & 587) << 1);
                            int maximumDrawingCacheSize3 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                            Object[] objArr112 = new Object[1];
                            a(i549, (maximumDrawingCacheSize3 ^ 6) + ((maximumDrawingCacheSize3 & 6) << 1), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 55086), objArr112);
                            int i550 = -Color.rgb(0, 0, 0);
                            int i551 = (i550 & (-16775158)) + (i550 | (-16775158));
                            int i552 = -(Process.myPid() >> 22);
                            Object[] objArr113 = new Object[1];
                            a(i551, (i552 ^ 28) + ((i552 & 28) << 1), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr113);
                            c3 = 0;
                            String str59 = (String) objArr113[0];
                            int i553 = 2036 - (~(-View.resolveSizeAndState(0, 0, 0)));
                            int i554 = -TextUtils.lastIndexOf(str15, '0', 0);
                            int i555 = (i554 ^ 9) + ((i554 & 9) << 1);
                            int iRgb4 = Color.rgb(0, 0, 0);
                            Object[] objArr114 = new Object[1];
                            a(i553, i555, (char) ((iRgb4 ^ 16839620) + ((iRgb4 & 16839620) << 1)), objArr114);
                            strArr7 = new String[][]{new String[]{str56, (String) objArr105[0]}, strArr15, new String[]{str57, (String) objArr110[0]}, new String[]{str58, (String) objArr112[0]}, new String[]{str59, (String) objArr114[0]}};
                            i89 = 0;
                            i90 = -1;
                            loop7: while (true) {
                                if (i89 < 5) {
                                    i91 = i72;
                                    break;
                                }
                                String[] strArr16 = strArr7[i89];
                                str16 = strArr16[c3];
                                strArr8 = (String[]) Arrays.copyOfRange(strArr16, 1, strArr16.length);
                                length4 = strArr8.length;
                                i97 = 0;
                                while (i97 < length4) {
                                    int i556 = i90 - 116;
                                    i90 = (i556 & 117) + (i556 | 117);
                                    Object[] objArr115 = {str16, strArr8[i97]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                                        char size = (char) View.MeasureSpec.getSize(0);
                                        int modifierMetaStateMask2 = 2384 - ((byte) KeyEvent.getModifierMetaStateMask());
                                        int offsetAfter3 = TextUtils.getOffsetAfter(str15, 0) + 32;
                                        byte b42 = (byte) 0;
                                        byte b43 = (byte) (b42 + 1);
                                        Object[] objArr116 = new Object[1];
                                        c(b42, b43, (byte) (b43 - 1), objArr116);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(size, modifierMetaStateMask2, offsetAfter3, -1207062455, false, (String) objArr116[0], new Class[]{String.class, String.class});
                                    }
                                    long jLongValue15 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr115)).longValue();
                                    long j88 = 1133421988;
                                    i98 = i89;
                                    long j89 = j88 ^ j3;
                                    long j90 = (j2 | j88) ^ j3;
                                    long j91 = (((long) 375) * j88) + (((long) (-747)) * jLongValue15) + (((long) (-374)) * (((j89 | jLongValue15) ^ j3) | j90));
                                    long j92 = jLongValue15 ^ j3;
                                    long j93 = j91 + (((long) 748) * ((j88 | j92) ^ j3)) + (((long) 374) * (((j89 | j92) ^ j3) | j90)) + ((long) 843621340);
                                    int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
                                    i99 = ((int) (j93 >> 32)) & (635876210 + (((~(475706740 | iUptimeMillis3)) | 207271008) * (-502)) + ((~((~iUptimeMillis3) | 2120204159)) * (-502)) + (((~(iUptimeMillis3 | (-1912933152))) | 475706740) * TypedValues.PositionType.TYPE_DRAWPATH));
                                    i100 = ((int) j93) & (1719511565 + ((~((-1337655339) | i72)) * 216) + (((-1242562561) | i178) * (-216)) + (((~((-1337655339) | i178)) | (-99571072)) * 216));
                                    if (((i100 & i99) | (i99 ^ i100)) != 0) {
                                        int i557 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                        i101 = ((i557 | 25) << 1) - (i557 ^ 25);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i101 % 128;
                                        if (i101 % 2 != 0) {
                                            i91 = ((i90 ^ 170) + ((i90 & 170) << 1)) ^ i72;
                                            break loop7;
                                        }
                                        int i558 = (i90 ^ 24261) + ((i90 & 24261) << 1);
                                        i91 = (i558 | i72) & (~(i72 & i558));
                                        break loop7;
                                    }
                                    int i559 = i97 + 22;
                                    i97 = ((i559 | (-21)) << 1) - (i559 ^ (-21));
                                    strArr8 = strArr8;
                                    strArr7 = strArr7;
                                    length4 = length4;
                                    i89 = i98;
                                }
                                String[][] strArr17 = strArr7;
                                int i560 = i89;
                                int i561 = ((i560 | (-107)) << 1) - (i560 ^ (-107));
                                i89 = (i561 ^ 108) + ((i561 & 108) << 1);
                                strArr7 = strArr17;
                                c3 = 0;
                            }
                            int i562 = ((~i76) & i72) | (i76 & i178);
                            int i563 = -i562;
                            int i564 = ((i562 & i563) | (i562 ^ i563)) >> 31;
                            int i565 = (i91 & (~i564)) | (i76 & i564);
                            int scrollBarSize3 = 2086 - (ViewConfiguration.getScrollBarSize() >> 8);
                            int i566 = -ExpandableListView.getPackedPositionGroup(0L);
                            int i567 = ((i566 | 13) << 1) - (i566 ^ 13);
                            int i568 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            Object[] objArr117 = new Object[1];
                            a(scrollBarSize3, i567, (char) ((i568 ^ 1) + ((i568 & 1) << 1)), objArr117);
                            String str60 = (String) objArr117[0];
                            int iRgb5 = Color.rgb(0, 0, 0);
                            int i569 = (iRgb5 ^ 16779315) + ((iRgb5 & 16779315) << 1);
                            int i570 = -Gravity.getAbsoluteGravity(0, 0);
                            int iLastIndexOf3 = TextUtils.lastIndexOf(str15, '0', 0, 0);
                            Object[] objArr118 = new Object[1];
                            a(i569, (i570 ^ 8) + ((i570 & 8) << 1), (char) (((iLastIndexOf3 | 5430) << 1) - (iLastIndexOf3 ^ 5430)), objArr118);
                            Object[] objArr119 = {str60, (String) objArr118[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                                char longPressTimeout2 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                int iBlue3 = 2385 - Color.blue(0);
                                int modifierMetaStateMask3 = ((byte) KeyEvent.getModifierMetaStateMask()) + 33;
                                byte b44 = (byte) 0;
                                byte b45 = (byte) (b44 + 1);
                                Object[] objArr120 = new Object[1];
                                c(b44, b45, (byte) (b45 - 1), objArr120);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(longPressTimeout2, iBlue3, modifierMetaStateMask3, -1207062455, false, (String) objArr120[0], new Class[]{String.class, String.class});
                            }
                            long jLongValue16 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr119)).longValue();
                            long j94 = 637099123;
                            long j95 = (((long) (-665)) * j94) + (((long) 334) * jLongValue16);
                            long j96 = j94 ^ j3;
                            long j97 = 333;
                            long j98 = j95 + (((long) (-333)) * j96) + ((((j96 | j2) ^ j3) | ((jLongValue16 | j) ^ j3)) * j97) + (j97 * (((j2 | jLongValue16) ^ j3) | ((j96 | j) ^ j3))) + ((long) 1339944205);
                            i95 = ((int) (j98 >> 32)) & ((-2055567968) + (((~(318146393 | i178)) | 1755372804) * 226) + (((~((-1755372805) | i72)) | 10519808 | (~(2062999389 | i178))) * (-113)) + ((~(318146393 | i72)) * 113));
                            int i571 = (int) j98;
                            int i572 = ~(Process.myUid() | 1357820570);
                            i96 = i571 & (((159925537 | i572) * (-658)) + 132491861 + ((i572 | 151012641) * 658));
                            if (((i95 & i96) | (i95 ^ i96)) != 0) {
                                i92 = ~(i72 & 150);
                                i93 = i72 | 150;
                                i94 = i92 & i93;
                            } else {
                                i94 = i72;
                            }
                            int i573 = (~(i72 & i565)) & (i72 | i565);
                            int i574 = -i573;
                            int i575 = ((i573 & i574) | (i573 ^ i574)) >> 31;
                            int i576 = (i94 & (~i575)) | (i565 & i575);
                            int i577 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int i578 = (i577 & 2108) + (i577 | 2108);
                            int i579 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            Object[] objArr121 = new Object[1];
                            a(i578, ((i579 | 47) << 1) - (i579 ^ 47), (char) (0 - (~(-(-MotionEvent.axisFromString(str15))))), objArr121);
                            Object[] objArr122 = {(String) objArr121[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                char cIndexOf4 = (char) (TextUtils.indexOf((CharSequence) str15, '0', 0, 0) + 1);
                                int iRed2 = 993 - Color.red(0);
                                int doubleTapTimeout3 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8;
                                byte b46 = (byte) 0;
                                byte b47 = b46;
                                Object[] objArr123 = new Object[1];
                                c(b46, b47, b47, objArr123);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf4, iRed2, doubleTapTimeout3, 349342683, false, (String) objArr123[0], new Class[]{String.class});
                            }
                            long jLongValue17 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr122)).longValue();
                            long j99 = 503960024;
                            long j100 = 569;
                            long j101 = j99 ^ j3;
                            long j102 = jLongValue17 ^ j3;
                            long j103 = j101 | j102;
                            long j104 = (j100 * j99) + (j100 * jLongValue17) + (((long) (-1136)) * ((j103 ^ j3) | ((j101 | j2) ^ j3) | ((j102 | j2) ^ j3)));
                            long j105 = j2 | j99;
                            long j106 = j104 + (((long) (-568)) * (((j101 | j) ^ j3) | ((j102 | j) ^ j3) | ((j105 | jLongValue17) ^ j3))) + (((long) 568) * (((j2 | jLongValue17) ^ j3) | (j105 ^ j3) | ((j103 | j) ^ j3))) + ((long) (-1351038629));
                            int i580 = ((int) (j106 >> 32)) & ((-2072279902) + ((~((-43537027) | i178)) * (-116)) + (((-43537347) | i72) * 116) + (((~((-1480763758) | i72)) | 1480763437) * 116));
                            int i581 = (~((-1287144799) | i72)) | (~(1570596087 | i178));
                            int i582 = ~(1287144798 | i178);
                            int i583 = ((int) j106) & ((-1669203471) + ((i581 | i582) * (-516)) + (((~((-1285047383) | i72)) | (~((-285548706) | i178))) * 516) + ((285548705 | i582) * 516));
                            int i584 = ((i580 & i583) | (i580 ^ i583)) * 263;
                            int i585 = i72 ^ i576;
                            int i586 = -i585;
                            int i587 = ((i585 & i586) | (i585 ^ i586)) >> 31;
                            int i588 = ((i584 & i178) | ((~i584) & i72)) & (~i587);
                            int i589 = i576 & i587;
                            i69 = (i589 & i588) | (i588 ^ i589);
                            strArr4 = strArr6;
                        }
                        Object[] objArr1110 = {str60, (String) objArr118[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                            char longPressTimeout3 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                            int iBlue4 = 2385 - Color.blue(0);
                            int modifierMetaStateMask4 = ((byte) KeyEvent.getModifierMetaStateMask()) + 33;
                            byte b48 = (byte) 0;
                            byte b49 = (byte) (b48 + 1);
                            Object[] objArr124 = new Object[1];
                            c(b48, b49, (byte) (b49 - 1), objArr124);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(longPressTimeout3, iBlue4, modifierMetaStateMask4, -1207062455, false, (String) objArr124[0], new Class[]{String.class, String.class});
                        }
                        long jLongValue18 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr1110)).longValue();
                        long j910 = 637099123;
                        long j911 = (((long) (-665)) * j910) + (((long) 334) * jLongValue18);
                        long j912 = j910 ^ j3;
                        long j913 = 333;
                        long j914 = j911 + (((long) (-333)) * j912) + ((((j912 | j2) ^ j3) | ((jLongValue18 | j) ^ j3)) * j913) + (j913 * (((j2 | jLongValue18) ^ j3) | ((j912 | j) ^ j3))) + ((long) 1339944205);
                        i95 = ((int) (j914 >> 32)) & ((-2055567968) + (((~(318146393 | i178)) | 1755372804) * 226) + (((~((-1755372805) | i72)) | 10519808 | (~(2062999389 | i178))) * (-113)) + ((~(318146393 | i72)) * 113));
                        int i5710 = (int) j914;
                        int i5711 = ~(Process.myUid() | 1357820570);
                        i96 = i5710 & (((159925537 | i5711) * (-658)) + 132491861 + ((i5711 | 151012641) * 658));
                        if (((i95 & i96) | (i95 ^ i96)) != 0) {
                            i92 = ~(i72 & 150);
                            i93 = i72 | 150;
                            i94 = i92 & i93;
                        } else {
                            i94 = i72;
                        }
                        int i5712 = (~(i72 & i565)) & (i72 | i565);
                        int i5713 = -i5712;
                        int i5714 = ((i5712 & i5713) | (i5712 ^ i5713)) >> 31;
                        int i5715 = (i94 & (~i5714)) | (i565 & i5714);
                        int i5716 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int i5717 = (i5716 & 2108) + (i5716 | 2108);
                        int i5718 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        Object[] objArr125 = new Object[1];
                        a(i5717, ((i5718 | 47) << 1) - (i5718 ^ 47), (char) (0 - (~(-(-MotionEvent.axisFromString(str15))))), objArr125);
                        Object[] objArr126 = {(String) objArr125[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                            char cIndexOf5 = (char) (TextUtils.indexOf((CharSequence) str15, '0', 0, 0) + 1);
                            int iRed3 = 993 - Color.red(0);
                            int doubleTapTimeout4 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8;
                            byte b410 = (byte) 0;
                            byte b411 = b410;
                            Object[] objArr127 = new Object[1];
                            c(b410, b411, b411, objArr127);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf5, iRed3, doubleTapTimeout4, 349342683, false, (String) objArr127[0], new Class[]{String.class});
                        }
                        long jLongValue19 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr126)).longValue();
                        long j915 = 503960024;
                        long j107 = 569;
                        long j108 = j915 ^ j3;
                        long j109 = jLongValue19 ^ j3;
                        long j1010 = j108 | j109;
                        long j1011 = (j107 * j915) + (j107 * jLongValue19) + (((long) (-1136)) * ((j1010 ^ j3) | ((j108 | j2) ^ j3) | ((j109 | j2) ^ j3)));
                        long j1012 = j2 | j915;
                        long j1013 = j1011 + (((long) (-568)) * (((j108 | j) ^ j3) | ((j109 | j) ^ j3) | ((j1012 | jLongValue19) ^ j3))) + (((long) 568) * (((j2 | jLongValue19) ^ j3) | (j1012 ^ j3) | ((j1010 | j) ^ j3))) + ((long) (-1351038629));
                        int i5810 = ((int) (j1013 >> 32)) & ((-2072279902) + ((~((-43537027) | i178)) * (-116)) + (((-43537347) | i72) * 116) + (((~((-1480763758) | i72)) | 1480763437) * 116));
                        int i5811 = (~((-1287144799) | i72)) | (~(1570596087 | i178));
                        int i5812 = ~(1287144798 | i178);
                        int i5813 = ((int) j1013) & ((-1669203471) + ((i5811 | i5812) * (-516)) + (((~((-1285047383) | i72)) | (~((-285548706) | i178))) * 516) + ((285548705 | i5812) * 516));
                        int i5814 = ((i5810 & i5813) | (i5810 ^ i5813)) * 263;
                        int i5815 = i72 ^ i5715;
                        int i5816 = -i5815;
                        int i5817 = ((i5815 & i5816) | (i5815 ^ i5816)) >> 31;
                        int i5818 = ((i5814 & i178) | ((~i5814) & i72)) & (~i5817);
                        int i5819 = i5715 & i5817;
                        i69 = (i5819 & i5818) | (i5818 ^ i5819);
                        strArr4 = strArr6;
                    } catch (Throwable th8) {
                        Throwable cause2 = th8.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th8;
                    }
                    int scrollBarSize4 = 2086 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int i5610 = -ExpandableListView.getPackedPositionGroup(0L);
                    int i5611 = ((i5610 | 13) << 1) - (i5610 ^ 13);
                    int i5612 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    Object[] objArr1111 = new Object[1];
                    a(scrollBarSize4, i5611, (char) ((i5612 ^ 1) + ((i5612 & 1) << 1)), objArr1111);
                    String str61 = (String) objArr1111[0];
                    int iRgb6 = Color.rgb(0, 0, 0);
                    int i5613 = (iRgb6 ^ 16779315) + ((iRgb6 & 16779315) << 1);
                    int i5719 = -Gravity.getAbsoluteGravity(0, 0);
                    int iLastIndexOf4 = TextUtils.lastIndexOf(str15, '0', 0, 0);
                    Object[] objArr1112 = new Object[1];
                    a(i5613, (i5719 ^ 8) + ((i5719 & 8) << 1), (char) (((iLastIndexOf4 | 5430) << 1) - (iLastIndexOf4 ^ 5430)), objArr1112);
                } catch (Exception unused16) {
                    i92 = ~(i72 & 151);
                    i93 = i72 | 151;
                }
                int i590 = -ExpandableListView.getPackedPositionType(0L);
                Object[] objArr128 = new Object[1];
                a(((i590 | 370) << 1) - (i590 ^ 370), 22 - (~(-TextUtils.getCapsMode(str11, 0, 0))), (char) (ExpandableListView.getPackedPositionChild(0L) + 4996), objArr128);
                String str62 = (String) objArr128[0];
                int i591 = -TextUtils.lastIndexOf(str11, '0', 0, 0);
                int i592 = ((i591 | 807) << 1) - (i591 ^ 807);
                int i593 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int i594 = (i593 ^ 11) + ((i593 & 11) << 1);
                int i595 = -TextUtils.lastIndexOf(str11, '0');
                Object[] objArr129 = new Object[1];
                a(i592, i594, (char) ((i595 ^ (-1)) + (i595 << 1)), objArr129);
                String str63 = (String) objArr129[0];
                int i596 = 819 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int iMyPid3 = Process.myPid() >> 22;
                Object[] objArr130 = new Object[1];
                a(i596, (iMyPid3 ^ 7) + ((iMyPid3 & 7) << 1), (char) TextUtils.getTrimmedLength(str11), objArr130);
                String str64 = (String) objArr130[0];
                int i597 = -(ViewConfiguration.getTouchSlop() >> 8);
                int i598 = (i597 ^ 825) + ((i597 & 825) << 1);
                int scrollDefaultDelay2 = 8 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int i599 = -(-Drawable.resolveOpacity(0, 0));
                Object[] objArr131 = new Object[1];
                a(i598, scrollDefaultDelay2, (char) ((51482 ^ i599) + ((i599 & 51482) << 1)), objArr131);
                String[] strArr18 = {str62, str63, str64, (String) objArr131[0]};
                int i600 = -TextUtils.indexOf(str11, str11, 0);
                Object[] objArr132 = new Object[1];
                a(((i600 | 833) << 1) - (i600 ^ 833), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16, (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr132);
                String str65 = (String) objArr132[0];
                int i601 = -(-(Process.myTid() >> 22));
                int i602 = (i601 & 850) + (i601 | 850);
                int i603 = -(-View.getDefaultSize(0, 0));
                int i604 = ((i603 | 7) << 1) - (i603 ^ 7);
                int i605 = -View.MeasureSpec.getSize(0);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i606 = i605 * 491;
                int i607 = ((-18819654) ^ i606) + ((i606 & (-18819654)) << 1);
                int i608 = ~i605;
                int i609 = ((-38487) ^ i608) | (i608 & (-38487));
                int i610 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                int i611 = -(-(((i609 ^ i610) | (i610 & i609)) * (-490)));
                char c12 = (char) ((i607 & i611) + (i611 | i607) + (((~((i605 & (-38487)) | ((-38487) ^ i605))) | (~(((-38487) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & (-38487))))) * 490) + (i608 * 490));
                Object[] objArr133 = new Object[1];
                a(i602, i604, c12, objArr133);
                String str66 = (String) objArr133[0];
                int i612 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                Object[] objArr134 = new Object[1];
                a((i612 & 857) + (i612 | 857), 7 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr134);
                String str67 = (String) objArr134[0];
                int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0);
                int i613 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                Object[] objArr135 = new Object[1];
                a((iNormalizeMetaState2 ^ 864) + ((iNormalizeMetaState2 & 864) << 1), (i613 & 11) + (i613 | 11), (char) (43342 - (~(-(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))))), objArr135);
                String str68 = (String) objArr135[0];
                int i614 = -(-TextUtils.indexOf(str11, str11, 0, 0));
                int i615 = (i614 ^ 875) + ((i614 & 875) << 1);
                int i616 = -Drawable.resolveOpacity(0, 0);
                Object[] objArr136 = new Object[1];
                a(i615, (i616 ^ 14) + ((i616 & 14) << 1), (char) TextUtils.getOffsetAfter(str11, 0), objArr136);
                String[] strArr19 = {str65, str66, str67, str68, (String) objArr136[0]};
                int i617 = 888 - (~(-Color.argb(0, 0, 0, 0)));
                int iRed4 = Color.red(0);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i618 = iRed4 * (-721);
                int i619 = (i618 ^ (-11536)) + ((i618 & (-11536)) << 1);
                int i620 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                int i621 = ~iRed4;
                int i622 = ~((i621 ^ (-17)) | (i621 & (-17)));
                int i623 = (i620 & i622) | (i620 ^ i622);
                int i624 = ~((iRed4 ^ 16) | (iRed4 & 16));
                int i625 = (i619 - (~(-(-(((i623 & i624) | (i623 ^ i624)) * 1444))))) - 1;
                int i626 = (~(iRed4 | 16)) | (~((iRed4 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (iRed4 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9)));
                int i627 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault9 & 16) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault9 ^ 16));
                int i628 = i625 + (((i627 & i626) | (i626 ^ i627)) * (-1444));
                int i629 = ~(i621 | 16);
                int i630 = ~((iRed4 & (-17)) | ((-17) ^ iRed4));
                int i631 = -(-(((i629 & i630) | (i629 ^ i630)) * 722));
                Object[] objArr137 = new Object[1];
                a(i617, (i628 ^ i631) + ((i631 & i628) << 1), (char) (51868 - (~View.MeasureSpec.getMode(0))), objArr137);
                String str69 = (String) objArr137[0];
                int i632 = -(-Color.green(0));
                int i633 = ((i632 | TypedValues.Custom.TYPE_DIMENSION) << 1) - (i632 ^ TypedValues.Custom.TYPE_DIMENSION);
                int i634 = -TextUtils.indexOf((CharSequence) str11, '0');
                Object[] objArr138 = new Object[1];
                a(i633, (i634 ^ 2) + ((i634 & 2) << 1), (char) ((-2) - ((-((byte) KeyEvent.getModifierMetaStateMask())) ^ (-1))), objArr138);
                String str70 = (String) objArr138[0];
                Object[] objArr139 = new Object[1];
                a(915 - (~(-(-(ViewConfiguration.getTouchSlop() >> 8)))), 21 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), (char) View.combineMeasuredStates(0, 0), objArr139);
                String str71 = (String) objArr139[0];
                Object[] objArr140 = new Object[1];
                a(938 - (~(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 24 - (~KeyEvent.getDeadChar(0, 0)), (char) (32344 - (~(-(-(ViewConfiguration.getScrollDefaultDelay() >> 16))))), objArr140);
                String str72 = (String) objArr140[0];
                int i635 = -(-KeyEvent.normalizeMetaState(0));
                Object[] objArr141 = new Object[1];
                a((i635 ^ 963) + ((i635 & 963) << 1), (ViewConfiguration.getEdgeSlop() >> 16) + 28, (char) View.MeasureSpec.getMode(0), objArr141);
                String[] strArr20 = {str69, str70, str19, str71, str72, (String) objArr141[0]};
                int i636 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                int i637 = (i636 ^ 991) + ((i636 & 991) << 1);
                int i638 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                Object[] objArr142 = new Object[1];
                a(i637, ((i638 | 10) << 1) - (i638 ^ 10), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr142);
                String str73 = (String) objArr142[0];
                int i639 = -(-ExpandableListView.getPackedPositionType(0L));
                int i640 = (i639 ^ 1002) + ((i639 & 1002) << 1);
                int i641 = 7 - (~(ViewConfiguration.getWindowTouchSlop() >> 8));
                int i642 = -AndroidCharacter.getMirror('0');
                Object[] objArr143 = new Object[1];
                a(i640, i641, (char) ((64735 & i642) + (i642 | 64735)), objArr143);
                String str74 = (String) objArr143[0];
                int i643 = -(ViewConfiguration.getTapTimeout() >> 16);
                int i644 = i643 * TypedValues.PositionType.TYPE_PERCENT_WIDTH;
                int i645 = (508030 & i644) + (i644 | 508030);
                int i646 = (i643 ^ PointerIconCompat.TYPE_ALIAS) | (i643 & PointerIconCompat.TYPE_ALIAS);
                int i647 = i645 + (i646 * (-502));
                int i648 = ~i643;
                int i649 = ~((i648 & (-1011)) | (i648 ^ (-1011)));
                int i650 = ~(i648 | i178);
                int i651 = (i649 & i650) | (i649 ^ i650);
                int i652 = ~(i646 | i67);
                int i653 = -(-(((i651 & i652) | (i651 ^ i652)) * (-502)));
                int i654 = ((i647 | i653) << 1) - (i653 ^ i647);
                int i655 = (~i643) | i178;
                int i656 = -(-(((~((i655 & PointerIconCompat.TYPE_ALIAS) | (i655 ^ PointerIconCompat.TYPE_ALIAS))) | (~((i646 ^ i67) | (i646 & i67)))) * TypedValues.PositionType.TYPE_DRAWPATH));
                int i657 = (i654 ^ i656) + ((i656 & i654) << 1);
                int i658 = -(-TextUtils.getCapsMode(str11, 0, 0));
                Object[] objArr144 = new Object[1];
                a(i657, (i658 ^ 6) + ((i658 & 6) << 1), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 58397), objArr144);
                String str75 = (String) objArr144[0];
                int i659 = -(-View.resolveSizeAndState(0, 0, 0));
                int i660 = (i659 ^ PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW) + ((i659 & PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW) << 1);
                int i661 = -ExpandableListView.getPackedPositionType(0L);
                Object[] objArr145 = new Object[1];
                a(i660, (i661 ^ 6) + ((i661 & 6) << 1), (char) (ExpandableListView.getPackedPositionGroup(0L) + 61094), objArr145);
                String[] strArr21 = {str73, str74, str75, (String) objArr145[0]};
                int i662 = -(-KeyEvent.getDeadChar(0, 0));
                Object[] objArr146 = new Object[1];
                a(((i662 | 1022) << 1) - (i662 ^ 1022), 15 - (~(-(-TextUtils.getOffsetBefore(str11, 0)))), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 30599), objArr146);
                String str76 = (String) objArr146[0];
                int i663 = -Color.green(0);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i664 = ~i663;
                int i665 = ~((i664 ^ 857) | (i664 & 857));
                int i666 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                int i667 = ~((i666 & 857) | (i666 ^ 857));
                int i668 = ((i663 * 595) - 1017259) + (((i667 & i665) | (i665 ^ i667)) * (-1188));
                int i669 = ~(i664 | 857);
                int i670 = ~((-858) | iTuitionPaymentFragmentspecialinlinedviewModeldefault10);
                int i671 = (i669 & i670) | (i669 ^ i670);
                int i672 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                int i673 = ~((i672 & i663) | (i672 ^ i663));
                int i674 = (i668 - (~(-(-(((i671 & i673) | (i671 ^ i673)) * 594))))) - 1;
                int i675 = ~(((-858) ^ i666) | ((-858) & i666));
                int i676 = ~((-858) | i663);
                int i677 = (i675 & i676) | (i675 ^ i676);
                int i678 = ~((i663 & i666) | (i666 ^ i663));
                int i679 = -(-(((i678 & i677) | (i677 ^ i678)) * 594));
                Object[] objArr147 = new Object[1];
                a((i674 ^ i679) + ((i679 & i674) << 1), 6 - TextUtils.indexOf((CharSequence) str11, '0', 0, 0), (char) ExpandableListView.getPackedPositionType(0L), objArr147);
                String str77 = (String) objArr147[0];
                Object[] objArr148 = new Object[1];
                a(16778040 - (~(-(-Color.rgb(0, 0, 0)))), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9, (char) (51481 - (~(-(-Color.blue(0))))), objArr148);
                String[] strArr22 = {str76, str77, (String) objArr148[0]};
                int i680 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                int i681 = ((i680 | 1038) << 1) - (i680 ^ 1038);
                int i682 = -(-TextUtils.indexOf(str11, str11));
                int i683 = ((i682 | 14) << 1) - (i682 ^ 14);
                int i684 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                Object[] objArr149 = new Object[1];
                a(i681, i683, (char) ((i684 ^ 19413) + ((i684 & 19413) << 1)), objArr149);
                String str78 = (String) objArr149[0];
                int i685 = -Color.green(0);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i686 = ~i685;
                int i687 = ~((i686 & (-1053)) | (i686 ^ (-1053)));
                int i688 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                int i689 = ~(i688 | i685 | 1052);
                int i690 = (i685 * 829) + 872108 + (((i687 & i689) | (i687 ^ i689)) * (-828));
                int i691 = -(-((i688 | i685 | 1052) * (-828)));
                int i692 = (i690 ^ i691) + ((i691 & i690) << 1) + ((~((i685 & 1052) | (i685 ^ 1052))) * 828);
                int i693 = -ExpandableListView.getPackedPositionType(0L);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i694 = i693 * 465;
                int i695 = (i694 ^ (-463)) + ((i694 & (-463)) << 1);
                int i696 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                int i697 = (~((-2) | i696)) | (~((-2) | i693));
                int i698 = ~((i696 & i693) | (i696 ^ i693));
                int i699 = ((i698 & i697) | (i697 ^ i698)) * 464;
                int i700 = ((i695 | i699) << 1) - (i699 ^ i695);
                int i701 = ~i693;
                int i702 = (i701 & iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault12 ^ i701);
                int i703 = -(-(((i702 & (-2)) | (i702 ^ (-2))) * (-464)));
                int i704 = (i700 ^ i703) + ((i703 & i700) << 1);
                int i705 = ~(((-2) ^ i693) | ((-2) & i693));
                int i706 = ~((i693 & iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | (i693 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
                int i707 = (i704 - (~(((i706 & i705) | (i705 ^ i706)) * 464))) - 1;
                int iMyTid = Process.myTid() >> 22;
                Object[] objArr150 = new Object[1];
                a(i692, i707, (char) ((54582 ^ iMyTid) + ((iMyTid & 54582) << 1)), objArr150);
                String[] strArr23 = {str78, (String) objArr150[0]};
                int i708 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                int i709 = (i708 & 1053) + (i708 | 1053);
                int i710 = -ExpandableListView.getPackedPositionGroup(0L);
                int i711 = (i710 ^ 9) + ((i710 & 9) << 1);
                int i712 = -(ViewConfiguration.getTouchSlop() >> 8);
                Object[] objArr151 = new Object[1];
                a(i709, i711, (char) ((46742 ^ i712) + ((i712 & 46742) << 1)), objArr151);
                String str79 = (String) objArr151[0];
                int i713 = -Color.alpha(0);
                int i714 = ((i713 | 1062) << 1) - (i713 ^ 1062);
                int i715 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int i716 = -TextUtils.indexOf(str11, str11, 0, 0);
                Object[] objArr152 = new Object[1];
                a(i714, (i715 & 1) + (i715 | 1), (char) ((34977 & i716) + (i716 | 34977)), objArr152);
                String[] strArr24 = {str79, (String) objArr152[0]};
                int i717 = -(ViewConfiguration.getEdgeSlop() >> 16);
                int iMakeMeasureSpec2 = 16 - View.MeasureSpec.makeMeasureSpec(0, 0);
                int i718 = -View.MeasureSpec.getSize(0);
                Object[] objArr153 = new Object[1];
                a(((i717 | 1063) << 1) - (i717 ^ 1063), iMakeMeasureSpec2, (char) ((i718 & 32709) + (i718 | 32709)), objArr153);
                String str80 = (String) objArr153[0];
                int i719 = -TextUtils.getOffsetAfter(str11, 0);
                Object[] objArr154 = new Object[1];
                a((i719 ^ TypedValues.Custom.TYPE_DIMENSION) + ((i719 & TypedValues.Custom.TYPE_DIMENSION) << 1), 2 - TextUtils.indexOf((CharSequence) str11, '0', 0, 0), (char) ((-2) - ((-TextUtils.indexOf((CharSequence) str11, '0', 0)) ^ (-1))), objArr154);
                String str81 = (String) objArr154[0];
                int i720 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                int i721 = i720 * 628;
                int i722 = ((533800 | i721) << 1) - (i721 ^ 533800);
                int i723 = i67 | 850;
                int i724 = ~i720;
                int i725 = -(-(((i723 & i724) | (i723 ^ i724)) * (-627)));
                int i726 = (((i722 | i725) << 1) - (i725 ^ i722)) + (((~(((-851) ^ i67) | ((-851) & i67))) | i720) * (-627));
                int i727 = ((~((i720 & i67) | (i720 ^ i67))) | (~(i178 | 850))) * 627;
                int i728 = ((i726 | i727) << 1) - (i727 ^ i726);
                int maximumDrawingCacheSize4 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                int i729 = (maximumDrawingCacheSize4 ^ 7) + ((maximumDrawingCacheSize4 & 7) << 1);
                int i730 = -(-KeyEvent.normalizeMetaState(0));
                Object[] objArr155 = new Object[1];
                a(i728, i729, (char) ((38486 ^ i730) + ((i730 & 38486) << 1)), objArr155);
                String str82 = (String) objArr155[0];
                int i731 = 1078 - (~(-(-(ViewConfiguration.getScrollBarFadeDuration() >> 16))));
                int windowTouchSlop3 = ViewConfiguration.getWindowTouchSlop() >> 8;
                int i732 = -(-TextUtils.indexOf((CharSequence) str11, '0', 0, 0));
                Object[] objArr156 = new Object[1];
                a(i731, ((windowTouchSlop3 | 8) << 1) - (windowTouchSlop3 ^ 8), (char) (((i732 | 1) << 1) - (i732 ^ 1)), objArr156);
                String str83 = (String) objArr156[0];
                int iResolveSizeAndState3 = View.resolveSizeAndState(0, 0, 0) + 864;
                int trimmedLength = TextUtils.getTrimmedLength(str11);
                int i733 = (trimmedLength ^ 11) + ((trimmedLength & 11) << 1);
                int iArgb = Color.argb(0, 0, 0, 0);
                Object[] objArr157 = new Object[1];
                a(iResolveSizeAndState3, i733, (char) ((iArgb ^ 43344) + ((iArgb & 43344) << 1)), objArr157);
                String str84 = (String) objArr157[0];
                int i734 = -KeyEvent.normalizeMetaState(0);
                Object[] objArr158 = new Object[1];
                a(((i734 | 875) << 1) - (i734 ^ 875), 14 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) View.combineMeasuredStates(0, 0), objArr158);
                String[] strArr25 = {str80, str81, str82, str83, str84, (String) objArr158[0]};
                int i735 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                Object[] objArr159 = new Object[1];
                a((i735 ^ 1087) + ((i735 & 1087) << 1), 19 - (~(-View.resolveSizeAndState(0, 0, 0))), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr159);
                String str85 = (String) objArr159[0];
                int i736 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i737 = (i736 ^ 1107) + ((i736 & 1107) << 1);
                int i738 = -(-TextUtils.getOffsetBefore(str11, 0));
                Object[] objArr160 = new Object[1];
                a(i737, (i738 ^ 19) + ((i738 & 19) << 1), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr160);
                String str86 = (String) objArr160[0];
                int i739 = -AndroidCharacter.getMirror('0');
                Object[] objArr161 = new Object[1];
                a((i739 ^ 1174) + ((i739 & 1174) << 1), 29 - (~(-TextUtils.indexOf((CharSequence) str11, '0', 0, 0))), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 50472), objArr161);
                String str87 = (String) objArr161[0];
                int i740 = -KeyEvent.keyCodeFromString(str11);
                int i741 = -TextUtils.getOffsetBefore(str11, 0);
                Object[] objArr162 = new Object[1];
                a((i740 & 1157) + (i740 | 1157), (i741 ^ 26) + ((i741 & 26) << 1), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr162);
                String str88 = (String) objArr162[0];
                Object[] objArr163 = new Object[1];
                a(1181 - (~(-TextUtils.lastIndexOf(str11, '0', 0))), 21 - (~(-TextUtils.indexOf((CharSequence) str11, '0', 0))), (char) KeyEvent.getDeadChar(0, 0), objArr163);
                String str89 = (String) objArr163[0];
                int i742 = -KeyEvent.getDeadChar(0, 0);
                int i743 = ((i742 | 1206) << 1) - (i742 ^ 1206);
                int i744 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int i745 = (i744 & 32) + (i744 | 32);
                int i746 = -ExpandableListView.getPackedPositionType(0L);
                Object[] objArr164 = new Object[1];
                a(i743, i745, (char) ((i746 ^ 14605) + ((i746 & 14605) << 1)), objArr164);
                String[] strArr26 = {str85, str86, str87, str88, str89, (String) objArr164[0], str19};
                int i747 = 1239 - (~TextUtils.indexOf((CharSequence) str11, '0', 0, 0));
                int i748 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                Object[] objArr165 = new Object[1];
                a(i747, (i748 ^ 13) + ((i748 & 13) << 1), (char) KeyEvent.normalizeMetaState(0), objArr165);
                String str90 = (String) objArr165[0];
                int iResolveSize2 = 818 - View.resolveSize(0, 0);
                int keyRepeatTimeout4 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                Object[] objArr166 = new Object[1];
                a(iResolveSize2, (keyRepeatTimeout4 ^ 7) + ((keyRepeatTimeout4 & 7) << 1), (char) TextUtils.indexOf(str11, str11, 0), objArr166);
                String[] strArr27 = {str90, (String) objArr166[0]};
                int i749 = -View.combineMeasuredStates(0, 0);
                int i750 = (i749 ^ 1252) + ((i749 & 1252) << 1);
                int i751 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                Object[] objArr167 = new Object[1];
                a(i750, ((i751 | 31) << 1) - (i751 ^ 31), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 19034), objArr167);
                String str91 = (String) objArr167[0];
                int i752 = -ExpandableListView.getPackedPositionChild(0L);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i753 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                int i754 = ~((i753 & (-1282)) | ((-1282) ^ i753));
                int i755 = ~((-1282) | i752);
                int i756 = ((((i752 * (-244)) + 315126) + (((i754 & i755) | (i754 ^ i755)) * (-245))) - (~(-(-((~(((-1282) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault13) | ((-1282) & iTuitionPaymentFragmentspecialinlinedviewModeldefault13))) * (-245)))))) - 1;
                int i757 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault13 | (-1282));
                int i758 = ((i752 & i757) | (i752 ^ i757)) * 245;
                int i759 = (i756 ^ i758) + ((i758 & i756) << 1);
                int i760 = -(-TextUtils.indexOf(str11, str11, 0));
                int i761 = (i760 ^ 11) + ((i760 & 11) << 1);
                int i762 = -(-TextUtils.lastIndexOf(str11, '0'));
                Object[] objArr168 = new Object[1];
                a(i759, i761, (char) ((i762 & 16159) + (i762 | 16159)), objArr168);
                String[] strArr28 = {str91, (String) objArr168[0]};
                int packedPositionType2 = 1293 - ExpandableListView.getPackedPositionType(0L);
                int i763 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                int i764 = ((i763 | 19) << 1) - (i763 ^ 19);
                int i765 = -(-(ViewConfiguration.getMaximumFlingVelocity() >> 16));
                Object[] objArr169 = new Object[1];
                a(packedPositionType2, i764, (char) ((39426 & i765) + (i765 | 39426)), objArr169);
                String str92 = (String) objArr169[0];
                int i766 = -View.MeasureSpec.getSize(0);
                int i767 = (i766 & 1312) + (i766 | 1312);
                int i768 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                Object[] objArr170 = new Object[1];
                a(i767, ((i768 | 6) << 1) - (i768 ^ 6), (char) (54225 - ImageFormat.getBitsPerPixel(0)), objArr170);
                String[] strArr29 = {str92, (String) objArr170[0]};
                int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 1317;
                int i769 = -Color.green(0);
                int i770 = (i769 & 19) + (i769 | 19);
                int i771 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                Object[] objArr171 = new Object[1];
                a(pressedStateDuration2, i770, (char) ((i771 & 23413) + (i771 | 23413)), objArr171);
                String[] strArr30 = {(String) objArr171[0]};
                int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0);
                int i772 = (iCombineMeasuredStates2 ^ 1336) + ((iCombineMeasuredStates2 & 1336) << 1);
                int i773 = -MotionEvent.axisFromString(str11);
                int i774 = (i773 ^ 15) + ((i773 & 15) << 1);
                int i775 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                Object[] objArr172 = new Object[1];
                a(i772, i774, (char) (((i775 | 3279) << 1) - (i775 ^ 3279)), objArr172);
                String[] strArr31 = {(String) objArr172[0]};
                int i776 = 1351 - (~(-View.resolveSizeAndState(0, 0, 0)));
                int keyRepeatTimeout5 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                int i777 = (keyRepeatTimeout5 ^ 19) + ((keyRepeatTimeout5 & 19) << 1);
                int i778 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                Object[] objArr173 = new Object[1];
                a(i776, i777, (char) (((i778 | 11193) << 1) - (i778 ^ 11193)), objArr173);
                String[] strArr32 = {(String) objArr173[0]};
                int i779 = -Process.getGidForName(str11);
                int i780 = (i779 & 1370) + (i779 | 1370);
                int scrollDefaultDelay3 = ViewConfiguration.getScrollDefaultDelay() >> 16;
                int i781 = (scrollDefaultDelay3 * TypedValues.Custom.TYPE_DIMENSION) - 17157;
                int i782 = ~scrollDefaultDelay3;
                int i783 = i781 + (((~((i782 & i67) | (i782 ^ i67))) | (~((i178 ^ 19) | (i178 & 19)))) * (-1808));
                int i784 = ~scrollDefaultDelay3;
                int i785 = (i784 ^ (-20)) | (i784 & (-20));
                int i786 = (scrollDefaultDelay3 & i178) | (i178 ^ scrollDefaultDelay3);
                int i787 = -(-(((~((i785 & i67) | (i785 ^ i67))) | (~((i786 ^ 19) | (i786 & 19)))) * TypedValues.Custom.TYPE_BOOLEAN));
                int i788 = ((i783 | i787) << 1) - (i783 ^ i787);
                int i789 = ~((i784 ^ 19) | (i784 & 19));
                int i790 = ~(((-20) ^ i67) | ((-20) & i67));
                int i791 = (i789 & i790) | (i789 ^ i790);
                int i792 = ~i786;
                int i793 = -(-(((i792 & i791) | (i791 ^ i792)) * TypedValues.Custom.TYPE_BOOLEAN));
                Object[] objArr174 = new Object[1];
                a(i780, (i788 ^ i793) + ((i793 & i788) << 1), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14834), objArr174);
                String[] strArr33 = {(String) objArr174[0]};
                int i794 = -Drawable.resolveOpacity(0, 0);
                int i795 = (i794 & 1390) + (i794 | 1390);
                int i796 = -(ViewConfiguration.getTouchSlop() >> 8);
                Object[] objArr175 = new Object[1];
                a(i795, (i796 ^ 23) + ((i796 & 23) << 1), (char) (63421 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr175);
                String[] strArr34 = {(String) objArr175[0]};
                int jumpTapTimeout2 = ViewConfiguration.getJumpTapTimeout() >> 16;
                int i797 = (jumpTapTimeout2 ^ 1413) + ((jumpTapTimeout2 & 1413) << 1);
                int i798 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                int i799 = (i798 & 21) + (i798 | 21);
                int i800 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault14 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i801 = (i800 * (-129)) - (-1629116);
                int i802 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                int i803 = (i802 & (-12437)) | ((-12437) ^ i802);
                int i804 = -(-((~((i803 & i800) | (i803 ^ i800))) * 130));
                int i805 = (((i801 | i804) << 1) - (i801 ^ i804)) + ((~(((-12437) ^ i800) | ((-12437) & i800))) * (-260));
                int i806 = ~i800;
                int i807 = i800 | (-12437);
                char c13 = (char) (i805 + (((~((i807 & iTuitionPaymentFragmentspecialinlinedviewModeldefault14) | (i807 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault14))) | (~((i806 & 12436) | (i806 ^ 12436)))) * 130));
                Object[] objArr176 = new Object[1];
                a(i797, i799, c13, objArr176);
                String[] strArr35 = {(String) objArr176[0]};
                Object[] objArr177 = new Object[1];
                a(1433 - (~KeyEvent.getDeadChar(0, 0)), 24 - TextUtils.indexOf(str11, str11, 0, 0), (char) TextUtils.getOffsetAfter(str11, 0), objArr177);
                String[] strArr36 = {(String) objArr177[0], str19};
                int iIndexOf13 = TextUtils.indexOf(str11, str11, 0, 0);
                int i808 = ((iIndexOf13 | 1458) << 1) - (iIndexOf13 ^ 1458);
                int i809 = -(-View.MeasureSpec.getMode(0));
                Object[] objArr178 = new Object[1];
                a(i808, (i809 ^ 28) + ((i809 & 28) << 1), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr178);
                String[] strArr37 = {(String) objArr178[0], str19};
                int i810 = 1485 - (~TextUtils.getOffsetBefore(str11, 0));
                int i811 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int i812 = (i811 ^ 28) + ((i811 & 28) << 1);
                int i813 = -AndroidCharacter.getMirror('0');
                Object[] objArr179 = new Object[1];
                a(i810, i812, (char) ((i813 & 284) + (i813 | 284)), objArr179);
                String[] strArr38 = {(String) objArr179[0], str19};
                int i814 = -Color.red(0);
                int i815 = (i814 ^ 1513) + ((i814 & 1513) << 1);
                int i816 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                Object[] objArr180 = new Object[1];
                a(i815, ((i816 | 30) << 1) - (i816 ^ 30), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr180);
                String[] strArr39 = {(String) objArr180[0], str19};
                int i817 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i818 = ((i817 | 1544) << 1) - (i817 ^ 1544);
                int i819 = -(Process.myPid() >> 22);
                Object[] objArr181 = new Object[1];
                a(i818, (i819 ^ 27) + ((i819 & 27) << 1), (char) TextUtils.indexOf(str11, str11), objArr181);
                c = 0;
                String[] strArr40 = {(String) objArr181[0], str19};
                int iRgb7 = Color.rgb(0, 0, 0);
                int i820 = (16778787 & iRgb7) + (iRgb7 | 16778787);
                int iGreen = Color.green(0);
                Object[] objArr182 = new Object[1];
                a(i820, (iGreen ^ 32) + ((iGreen & 32) << 1), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr182);
                strArr5 = new String[][]{strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, new String[]{(String) objArr182[0], str19}};
                int i821 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i822 = ((i821 | 1603) << 1) - (i821 ^ 1603);
                int offsetAfter4 = 1 - TextUtils.getOffsetAfter(str11, 0);
                int offsetBefore3 = TextUtils.getOffsetBefore(str11, 0);
                Object[] objArr183 = new Object[1];
                a(i822, offsetAfter4, (char) ((offsetBefore3 & 3306) + (offsetBefore3 | 3306)), objArr183);
                sb = new StringBuilder((String) objArr183[0]);
                i77 = 0;
                i78 = 0;
                i79 = i67;
                while (i77 < 24) {
                    TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    String[] strArr41 = strArr5[i77];
                    Object[] objArr184 = {strArr41[c]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char packedPositionChild3 = (char) (ExpandableListView.getPackedPositionChild(0L) + 33603);
                        int iKeyCodeFromString2 = 3085 - KeyEvent.keyCodeFromString(str11);
                        int jumpTapTimeout3 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 26;
                        byte b50 = (byte) 0;
                        byte b51 = (byte) (b50 + 1);
                        Object[] objArr185 = new Object[1];
                        c(b50, b51, (byte) (b51 - 1), objArr185);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionChild3, iKeyCodeFromString2, jumpTapTimeout3, 1411172903, false, (String) objArr185[0], new Class[]{String.class});
                    }
                    str13 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr184);
                    String[] strArr42 = (String[]) Arrays.copyOfRange(strArr41, 1, strArr41.length);
                    if (str13 != null || str13.isEmpty()) {
                        i79 = i79;
                    } else {
                        if (strArr41.length != 1) {
                            Object[] objArr186 = {str13, strArr42};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1514294371);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                                char c14 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                int iRed5 = Color.red(0) + 3358;
                                int pressedStateDuration3 = 18 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                byte b52 = (byte) 0;
                                byte b53 = (byte) (b52 + 1);
                                Object[] objArr187 = new Object[1];
                                c(b52, b53, (byte) (b53 - 1), objArr187);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(c14, iRed5, pressedStateDuration3, -1092817996, false, (String) objArr187[0], new Class[]{String.class, String[].class});
                            }
                            long jLongValue20 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).invoke(null, objArr186)).longValue();
                            long j110 = 1812163888;
                            long j111 = 628;
                            long j112 = (j111 * j110) + (j111 * jLongValue20);
                            long j113 = -627;
                            long j114 = j112 + ((jLongValue20 | j | (j110 ^ j25)) * j113) + (j113 * (j110 | (((jLongValue20 ^ j25) | j) ^ j25))) + (((long) 627) * (((j2 | jLongValue20) ^ j25) | ((j110 | j) ^ j25))) + ((long) 330818450);
                            int i823 = ~((-1496904855) | i67);
                            int i824 = ((int) (j114 >> 32)) & ((((262440 | i823) * (-196)) - 1419288954) + ((i823 | (-1497167295)) * 196));
                            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                            int i825 = ~startElapsedRealtime;
                            int i826 = (-1995643587) + (((~(1424341735 | i825)) | (~((-281393863) | startElapsedRealtime))) * 520);
                            int i827 = ~(281393862 | i825);
                            int i828 = ~(startElapsedRealtime | (-1155832548));
                            int i829 = ((int) j114) & (i826 + ((i827 | i828) * (-1040)) + ((i828 | (~(i825 | 1155832547)) | 1142947873) * 520));
                            if (((i829 & i824) | (i824 ^ i829)) == 0) {
                                i79 = i79;
                            }
                        } else {
                            str13 = str13;
                        }
                        int i830 = (i77 & 10) + (i77 | 10);
                        i79 = ((~i830) & i67) | (i830 & i178);
                        int i831 = ((i78 & 20) + (i78 | 20)) - 19;
                        if (i831 > 1) {
                            int i832 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            int i833 = (i832 ^ 1603) + ((i832 & 1603) << 1);
                            c2 = 0;
                            int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 3;
                            int i834 = -(-View.MeasureSpec.getMode(0));
                            Object[] objArr188 = new Object[1];
                            a(i833, bitsPerPixel2, (char) ((i834 ^ 32958) + ((i834 & 32958) << 1)), objArr188);
                            sb.append((String) objArr188[0]);
                        } else {
                            c2 = 0;
                        }
                        sb.append(strArr41[c2]);
                        int i835 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                        Object[] objArr189 = new Object[1];
                        a((i835 ^ 1606) + ((i835 & 1606) << 1), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (40829 - (~(-(ViewConfiguration.getMaximumFlingVelocity() >> 16)))), objArr189);
                        sb.append((String) objArr189[0]);
                        sb.append(str13);
                        i78 = i831;
                    }
                    i77++;
                    str11 = str11;
                    strArr5 = strArr5;
                    c = 0;
                }
                String str93 = str11;
                i80 = i79;
                int i836 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                int i837 = (i836 & 1607) + (i836 | 1607);
                int i838 = -Process.getGidForName(str93);
                int i839 = -(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                Object[] objArr190 = new Object[1];
                a(i837, i838, (char) (((i839 | 64725) << 1) - (i839 ^ 64725)), objArr190);
                sb.append((String) objArr190[0]);
                objArr2 = new Object[2];
                if (i78 > 2) {
                    objArr2[0] = new int[1];
                    String[] strArr43 = {sb.toString()};
                    ((int[]) objArr2[0])[0] = i80;
                    objArr2[1] = strArr43;
                } else {
                    objArr2[0] = new int[]{i67};
                    objArr2[1] = new String[0];
                }
                int i840 = i67 ^ i76;
                i81 = (i840 | (-i840)) >> 31;
                i82 = ((int[]) objArr2[0])[0] & (~i81);
                int i841 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                i83 = (i841 & 121) + (i841 | 121);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i83 % 128;
                if (i83 % 2 != 0) {
                    int i842 = i76 & i81;
                    i84 = (i842 & i82) | (i82 ^ i842);
                    obj = objArr2[1];
                } else {
                    int i843 = i76 & i81;
                    i84 = (i843 & i82) | (i82 ^ i843);
                    obj = objArr2[1];
                }
                strArr6 = (String[]) obj;
                i76 = i84;
                str12 = str93;
                iIndexOf = TextUtils.indexOf(str12, str12, 0);
                int i4010 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                i85 = (i4010 & 107) + (i4010 | 107);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i85 % 128;
                if (i85 % 2 == 0) {
                    i87 = 889 / iIndexOf;
                    iNormalizeMetaState = KeyEvent.normalizeMetaState(0) * 120;
                    i86 = 1;
                } else {
                    int i4011 = -(-iIndexOf);
                    i86 = 1;
                    i87 = ((i4011 | 889) << 1) - (889 ^ i4011);
                    int i4012 = -(-KeyEvent.normalizeMetaState(0));
                    iNormalizeMetaState = ((i4012 & 16) << 1) + (i4012 ^ 16);
                }
                int i4013 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
                Object[] objArr710 = new Object[i86];
                a(i87, iNormalizeMetaState, (char) (((51869 | i4013) << i86) - (i4013 ^ 51869)), objArr710);
                Object[] objArr711 = {(String) objArr710[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char offsetBefore4 = (char) (33602 - TextUtils.getOffsetBefore(str12, 0));
                    int fadingEdgeLength6 = 3085 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iLastIndexOf5 = TextUtils.lastIndexOf(str12, '0', 0) + 27;
                    byte b310 = (byte) 0;
                    byte b311 = (byte) (b310 + 1);
                    Object[] objArr712 = new Object[1];
                    c(b310, b311, (byte) (b311 - 1), objArr712);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(offsetBefore4, fadingEdgeLength6, iLastIndexOf5, 1411172903, false, (String) objArr712[0], new Class[]{String.class});
                }
                objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr711);
                if (objInvoke2 == null) {
                    i72 = i67;
                    i88 = 0;
                } else {
                    Object[] objArr713 = {objInvoke2, 42};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        char c15 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int windowTouchSlop4 = 3393 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int packedPositionGroup4 = ExpandableListView.getPackedPositionGroup(0L) + 9;
                        byte b312 = (byte) 0;
                        byte b313 = (byte) (b312 + 1);
                        Object[] objArr714 = new Object[1];
                        c(b312, b313, (byte) (b313 - 1), objArr714);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c15, windowTouchSlop4, packedPositionGroup4, 1203525406, false, (String) objArr714[0], new Class[]{String.class, Integer.TYPE});
                    }
                    long jLongValue110 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr713)).longValue();
                    long j710 = 159255616;
                    long j711 = 46;
                    long j712 = jLongValue110 ^ j25;
                    long jNextInt4 = new Random().nextInt();
                    long j713 = jNextInt4 ^ j25;
                    long j714 = (j711 * j710) + (j711 * jLongValue110) + (((long) (-90)) * (j710 | ((j712 | j713) ^ j25))) + (((long) (-45)) * (((j712 | jNextInt4) ^ j25) | ((jLongValue110 | j710) ^ j25))) + (((long) 45) * (j712 | ((jNextInt4 | (j710 ^ j25)) ^ j25) | ((j713 | j710) ^ j25))) + ((long) (-161325493));
                    i72 = i;
                    int i4110 = ((int) (j714 >> 32)) & (1522584826 + (((~(1135418171 | i178)) | (-1722322714)) * (-602)) + (((~(1135418171 | i72)) | (-1739431740) | (~((-1118309146) | i178))) * (-301)) + ((~(i178 | (-1722322714))) * 301));
                    int i4111 = ~((int) SystemClock.uptimeMillis());
                    int i4112 = ((int) j714) & ((((~((-1349774508) | i4111)) | 1348578474) * (-241)) + 1689859423 + (((~(i4111 | (-1196034))) | 159387904) * 241));
                    i88 = (i4112 & i4110) | (i4110 ^ i4112);
                }
                if (i88 != 1986687685) {
                    str14 = str12;
                    j3 = j25;
                    strArr6 = strArr6;
                } else {
                    str14 = str12;
                    j3 = j25;
                    strArr6 = strArr6;
                }
                str15 = str14;
                int i5110 = 1949 - (~TextUtils.getOffsetAfter(str15, 0));
                int iAxisFromString3 = MotionEvent.axisFromString(str15);
                int i5111 = (iAxisFromString3 & 14) + (iAxisFromString3 | 14);
                int iIndexOf14 = TextUtils.indexOf((CharSequence) str15, '0', 0, 0);
                char c16 = (char) ((iIndexOf14 ^ 1) + ((iIndexOf14 & 1) << 1));
                Object[] objArr1010 = new Object[1];
                a(i5110, i5111, c16, objArr1010);
                String str510 = (String) objArr1010[0];
                int i5112 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int iIndexOf15 = TextUtils.indexOf((CharSequence) str15, '0', 0);
                Object[] objArr1011 = new Object[1];
                a((i5112 ^ 1964) + ((i5112 & 1964) << 1), (iIndexOf15 ^ 6) + ((iIndexOf15 & 6) << 1), (char) View.resolveSize(0, 0), objArr1011);
                int i5113 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                Object[] objArr1012 = new Object[1];
                a((i5113 & 1968) + (i5113 | 1968), 14 - (~(-(ViewConfiguration.getEdgeSlop() >> 16))), (char) ((-2) - ((-ExpandableListView.getPackedPositionChild(0L)) ^ (-1))), objArr1012);
                int i5114 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                int i5115 = (i5114 & 1983) + (i5114 | 1983);
                TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int iBlue5 = Color.blue(0);
                int i5116 = iBlue5 * (-958);
                int i5210 = ((i5116 | (-18202)) << 1) - (i5116 ^ (-18202));
                int i5211 = ~(((-20) ^ i178) | ((-20) & i178));
                int i5212 = ~iBlue5;
                int i5213 = ~((i5212 ^ i72) | (i5212 & i72));
                int i5214 = (i5211 & i5213) | (i5211 ^ i5213);
                int i5215 = ~((i174 ^ iBlue5) | (i174 & iBlue5));
                int i5216 = ((i5214 & i5215) | (i5214 ^ i5215)) * 959;
                int i5217 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i5218 = (i5217 ^ 95) + ((i5217 & 95) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5218 % 128;
                int i5219 = i5218 % 2;
                int i5310 = -(-i5216);
                int i5311 = (i5210 & i5310) + (i5210 | i5310);
                int i5312 = (~((iBlue5 ^ 19) | (iBlue5 & 19))) * (-959);
                int i5313 = (i5311 ^ i5312) + ((i5312 & i5311) << 1);
                int i5314 = ~((i5212 ^ i178) | (i5212 & i178));
                int i5315 = ~(((-20) & i72) | ((-20) ^ i72));
                int i5316 = (i5315 & i5314) | (i5314 ^ i5315);
                int i5317 = ~((iBlue5 & i72) | (iBlue5 ^ i72));
                Object[] objArr1013 = new Object[1];
                a(i5115, i5313 + (((i5316 & i5317) | (i5316 ^ i5317)) * 959), (char) (52828 - (~(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))))), objArr1013);
                int iRgb8 = Color.rgb(0, 0, 0);
                int i5318 = ((iRgb8 | 16779218) << 1) - (16779218 ^ iRgb8);
                int i5319 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                int i5410 = (i5319 ^ 14) + ((i5319 & 14) << 1);
                int i5411 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                Object[] objArr1014 = new Object[1];
                a(i5318, i5410, (char) ((i5411 & 52591) + (i5411 | 52591)), objArr1014);
                String[] strArr110 = {(String) objArr1012[0], (String) objArr1013[0], (String) objArr1014[0]};
                int mode7 = View.MeasureSpec.getMode(0) + 2016;
                int i5412 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                Object[] objArr1015 = new Object[1];
                a(mode7, (i5412 & 20) + (i5412 | 20), (char) TextUtils.getOffsetAfter(str15, 0), objArr1015);
                String str511 = (String) objArr1015[0];
                int i5413 = -MotionEvent.axisFromString(str15);
                int i5414 = (i5413 & 2036) + (i5413 | 2036);
                int i5415 = -(ViewConfiguration.getEdgeSlop() >> 16);
                int i5416 = (i5415 ^ 10) + ((i5415 & 10) << 1);
                int i5417 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                Object[] objArr1113 = new Object[1];
                a(i5414, i5416, (char) ((i5417 ^ 62405) + ((i5417 & 62405) << 1)), objArr1113);
                Object[] objArr1114 = new Object[1];
                a(2047 - View.getDefaultSize(0, 0), 11 - (~(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (char) View.combineMeasuredStates(0, 0), objArr1114);
                String str512 = (String) objArr1114[0];
                int i5418 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i5419 = (i5418 ^ 587) + ((i5418 & 587) << 1);
                int maximumDrawingCacheSize5 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                Object[] objArr1115 = new Object[1];
                a(i5419, (maximumDrawingCacheSize5 ^ 6) + ((maximumDrawingCacheSize5 & 6) << 1), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 55086), objArr1115);
                int i5510 = -Color.rgb(0, 0, 0);
                int i5511 = (i5510 & (-16775158)) + (i5510 | (-16775158));
                int i5512 = -(Process.myPid() >> 22);
                Object[] objArr1116 = new Object[1];
                a(i5511, (i5512 ^ 28) + ((i5512 & 28) << 1), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr1116);
                c3 = 0;
                String str513 = (String) objArr1116[0];
                int i5513 = 2036 - (~(-View.resolveSizeAndState(0, 0, 0)));
                int i5514 = -TextUtils.lastIndexOf(str15, '0', 0);
                int i5515 = (i5514 ^ 9) + ((i5514 & 9) << 1);
                int iRgb9 = Color.rgb(0, 0, 0);
                Object[] objArr1117 = new Object[1];
                a(i5513, i5515, (char) ((iRgb9 ^ 16839620) + ((iRgb9 & 16839620) << 1)), objArr1117);
                strArr7 = new String[][]{new String[]{str510, (String) objArr1011[0]}, strArr110, new String[]{str511, (String) objArr1113[0]}, new String[]{str512, (String) objArr1115[0]}, new String[]{str513, (String) objArr1117[0]}};
                i89 = 0;
                i90 = -1;
                loop7: while (true) {
                    if (i89 < 5) {
                        i91 = i72;
                        break;
                    }
                    String[] strArr111 = strArr7[i89];
                    str16 = strArr111[c3];
                    strArr8 = (String[]) Arrays.copyOfRange(strArr111, 1, strArr111.length);
                    length4 = strArr8.length;
                    i97 = 0;
                    while (i97 < length4) {
                        int i5516 = i90 - 116;
                        i90 = (i5516 & 117) + (i5516 | 117);
                        Object[] objArr1118 = {str16, strArr8[i97]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                            char size2 = (char) View.MeasureSpec.getSize(0);
                            int modifierMetaStateMask5 = 2384 - ((byte) KeyEvent.getModifierMetaStateMask());
                            int offsetAfter5 = TextUtils.getOffsetAfter(str15, 0) + 32;
                            byte b412 = (byte) 0;
                            byte b413 = (byte) (b412 + 1);
                            Object[] objArr1119 = new Object[1];
                            c(b412, b413, (byte) (b413 - 1), objArr1119);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(size2, modifierMetaStateMask5, offsetAfter5, -1207062455, false, (String) objArr1119[0], new Class[]{String.class, String.class});
                        }
                        long jLongValue111 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr1118)).longValue();
                        long j810 = 1133421988;
                        i98 = i89;
                        long j811 = j810 ^ j3;
                        long j916 = (j2 | j810) ^ j3;
                        long j917 = (((long) 375) * j810) + (((long) (-747)) * jLongValue111) + (((long) (-374)) * (((j811 | jLongValue111) ^ j3) | j916));
                        long j918 = jLongValue111 ^ j3;
                        long j919 = j917 + (((long) 748) * ((j810 | j918) ^ j3)) + (((long) 374) * (((j811 | j918) ^ j3) | j916)) + ((long) 843621340);
                        int iUptimeMillis4 = (int) SystemClock.uptimeMillis();
                        i99 = ((int) (j919 >> 32)) & (635876210 + (((~(475706740 | iUptimeMillis4)) | 207271008) * (-502)) + ((~((~iUptimeMillis4) | 2120204159)) * (-502)) + (((~(iUptimeMillis4 | (-1912933152))) | 475706740) * TypedValues.PositionType.TYPE_DRAWPATH));
                        i100 = ((int) j919) & (1719511565 + ((~((-1337655339) | i72)) * 216) + (((-1242562561) | i178) * (-216)) + (((~((-1337655339) | i178)) | (-99571072)) * 216));
                        if (((i100 & i99) | (i99 ^ i100)) != 0) {
                            int i5517 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            i101 = ((i5517 | 25) << 1) - (i5517 ^ 25);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i101 % 128;
                            if (i101 % 2 != 0) {
                                i91 = ((i90 ^ 170) + ((i90 & 170) << 1)) ^ i72;
                                break loop7;
                            }
                            int i5518 = (i90 ^ 24261) + ((i90 & 24261) << 1);
                            i91 = (i5518 | i72) & (~(i72 & i5518));
                            break loop7;
                        }
                        int i5519 = i97 + 22;
                        i97 = ((i5519 | (-21)) << 1) - (i5519 ^ (-21));
                        strArr8 = strArr8;
                        strArr7 = strArr7;
                        length4 = length4;
                        i89 = i98;
                    }
                    String[][] strArr112 = strArr7;
                    int i5614 = i89;
                    int i5615 = ((i5614 | (-107)) << 1) - (i5614 ^ (-107));
                    i89 = (i5615 ^ 108) + ((i5615 & 108) << 1);
                    strArr7 = strArr112;
                    c3 = 0;
                }
                int i5616 = ((~i76) & i72) | (i76 & i178);
                int i5617 = -i5616;
                int i5618 = ((i5616 & i5617) | (i5616 ^ i5617)) >> 31;
                int i5619 = (i91 & (~i5618)) | (i76 & i5618);
            } else {
                i72 = i67;
                strArr4 = null;
            }
            int i844 = (~(i72 & i69)) & (i72 | i69);
            int i845 = -i844;
            Object[] objArr191 = {new int[1], new int[]{i69}, null, new int[]{i72}, strArr4};
            int iMyTid2 = Process.myTid();
            int i846 = ~iMyTid2;
            int i847 = ~(399194926 | i846);
            int i848 = 680508883 + ((1076887617 | i847) * (-712)) + (((~(iMyTid2 | 1476082543)) | (~(i846 | (-1076887618)))) * (-712)) + (((-1374884718) | i847) * 712);
            int i849 = -(-((((i844 & i845) | (i844 ^ i845)) >> 31) & 16));
            int i850 = (i3 - (~((i848 ^ i849) + ((i849 & i848) << 1)))) - 1;
            int i851 = i850 << 13;
            int i852 = ((~i850) & i851) | ((~i851) & i850);
            int i853 = i852 >>> 17;
            int i854 = (i852 | i853) & (~(i852 & i853));
            ((int[]) objArr191[0])[0] = i854 ^ (i854 << 5);
            return objArr191;
        }
        i8 = ~(i175 & 266);
        i9 = i175 | 266;
        i7 = i8 & i9;
        int i1810 = i175 ^ i172;
        int i1910 = (i1810 | (-i1810)) >> 31;
        int i1911 = (i7 & (~i1910)) | (i172 & i1910);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2061288340);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionGroup5 = (char) (56827 - ExpandableListView.getPackedPositionGroup(0L));
            int packedPositionGroup6 = ExpandableListView.getPackedPositionGroup(0L) + 2814;
            int longPressTimeout4 = 9 - (ViewConfiguration.getLongPressTimeout() >> 16);
            byte b110 = (byte) 0;
            byte b111 = (byte) (b110 + 1);
            Object[] objArr210 = new Object[1];
            c(b110, b111, (byte) (b111 - 1), objArr210);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionGroup5, packedPositionGroup6, longPressTimeout4, -1639816125, false, (String) objArr210[0], new Class[0]);
        }
        long jLongValue21 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
        long j210 = 292548684;
        long j211 = 371;
        long j310 = (j211 * j210) + (j211 * jLongValue21);
        long j311 = -370;
        long j312 = jLongValue21 ^ j25;
        long jMyPid2 = Process.myPid();
        long j313 = jMyPid2 ^ j25;
        long j314 = j210 ^ j25;
        long j315 = (jLongValue21 | j210) ^ j25;
        long j316 = j310 + ((((j312 | j313) ^ j25) | ((j314 | jMyPid2) ^ j25)) * j311) + (j311 * (((j314 | j313) ^ j25) | ((j312 | jMyPid2) ^ j25) | j315)) + (((long) 370) * j315) + ((long) 1820807822);
        int iNextInt5 = new Random().nextInt();
        int i1912 = ((int) (j316 >> 32)) & (384374654 + (((~((~iNextInt5) | 1768592690)) | (-1777046835)) * 446) + (((~(iNextInt5 | (-8454145))) | 687898640) * 446) + 2006061350);
        int iMyUid3 = Process.myUid();
        int i1913 = ~iMyUid3;
        int i1914 = ((int) j316) & ((-410051941) + (((~(73114299 | i1913)) | (~(1364112110 | iMyUid3))) * 210) + (((~(iMyUid3 | (-1359220805))) | (~(i1913 | (-68222994)))) * 210));
        int i1915 = (i1914 & i1912) | (i1912 ^ i1914);
        int i1916 = i1915 + 199;
        int i1917 = (i1915 | (-i1915)) >> 31;
        int i1918 = (i1917 & ((i1916 & i178) | ((~i1916) & i175))) | ((~i1917) & i175);
        int i1919 = ((~i1911) & i175) | (i1911 & i178);
        int i2010 = -i1919;
        int i2011 = ((i1919 & i2010) | (i1919 ^ i2010)) >> 31;
        int i2012 = i1918 & (~i2011);
        int i2013 = i1911 & i2011;
        int i2014 = (i2013 & i2012) | (i2012 ^ i2013);
        int i2015 = -Color.alpha(0);
        int i2016 = (i2015 ^ 203) + ((i2015 & 203) << 1);
        int i2017 = -Color.rgb(0, 0, 0);
        int i2018 = (i2017 ^ (-16777196)) + ((i2017 & (-16777196)) << 1);
        int iLastIndexOf6 = TextUtils.lastIndexOf(str2, '0');
        int i2019 = iLastIndexOf6 * (-300);
        int i2110 = (i2019 & 286296) + (i2019 | 286296);
        int i2111 = (iLastIndexOf6 ^ 948) | (iLastIndexOf6 & 948);
        int i2112 = (~((i2111 & i175) | (i2111 ^ i175))) * (-301);
        int i2113 = (i2110 ^ i2112) + ((i2112 & i2110) << 1);
        int i2114 = ~(((-949) ^ i175) | ((-949) & i175));
        int i2115 = ~(i178 | iLastIndexOf6);
        int i2116 = ((i2114 & i2115) | (i2114 ^ i2115)) * (-301);
        int i2117 = (i2113 ^ i2116) + ((i2113 & i2116) << 1);
        int i2118 = ~iLastIndexOf6;
        int i2119 = ~((i2118 & i175) | (i2118 ^ i175));
        Object[] objArr211 = new Object[1];
        a(i2016, i2018, (char) ((i2117 - (~((((-949) & i2119) | ((-949) ^ i2119)) * 301))) - 1), objArr211);
        String str210 = (String) objArr211[0];
        int i2210 = 222 - (~(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
        int i2211 = -TextUtils.indexOf((CharSequence) str2, '0');
        Object[] objArr212 = new Object[1];
        a(i2210, ((i2211 | 5) << 1) - (i2211 ^ 5), (char) ((-2) - (~(-TextUtils.lastIndexOf(str2, '0', 0, 0)))), objArr212);
        Object[] objArr213 = {str210, (String) objArr212[0]};
        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRgb2 = (char) (Color.rgb(0, 0, 0) + 16777216);
            int i2212 = 2386 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int i2213 = 32 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte b112 = (byte) 0;
            byte b113 = (byte) (b112 + 1);
            Object[] objArr214 = new Object[1];
            c(b112, b113, (byte) (b113 - 1), objArr214);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb2, i2212, i2213, -1207062455, false, (String) objArr214[0], new Class[]{String.class, String.class});
        }
        long jLongValue22 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr213)).longValue();
        long j317 = 863045910;
        long j318 = -112;
        long j319 = jLongValue22 ^ j25;
        j = i175;
        j2 = j ^ j25;
        long j410 = j319 | j2;
        long j411 = j317 ^ j25;
        long j412 = (j318 * j317) + (j318 * jLongValue22) + (((long) 226) * (j317 | (j410 ^ j25))) + (((long) (-113)) * (((j411 | jLongValue22) ^ j25) | ((j411 | j) ^ j25) | ((j410 | j317) ^ j25))) + (((long) 113) * ((j319 | j) ^ j25)) + ((long) 1113997418);
        int iNextInt6 = new Random().nextInt(1495965564);
        int i2214 = ~iNextInt6;
        int i2215 = ((int) (j412 >> 32)) & ((-885166806) + (((~(i2214 | 1701842197)) | (-264615787)) * (-1042)) + ((1701842197 | iNextInt6) * 521) + (((~(iNextInt6 | 264615786)) | 1613760533 | (~(i2214 | (-176534123)))) * 521));
        int iMyPid4 = Process.myPid();
        int i2216 = ~iMyPid4;
        int i2217 = (~(599180760 | i2216)) | 272697857;
        int i2218 = ~(iMyPid4 | (-33832969));
        int i2219 = ((int) j412) & (1369714902 + ((i2217 | i2218) * (-713)) + (i2218 * 1426) + ((~(838045649 | i2216)) * 713));
        int i2310 = (i2215 & i2219) | (i2215 ^ i2219);
        int i2311 = (~(i175 & 262)) & (i175 | 262);
        int i2312 = -i2310;
        int i2313 = ((i2310 & i2312) | (i2310 ^ i2312)) >> 31;
        int i2314 = (~i2313) & i175;
        int i2315 = i2313 & i2311;
        int i2316 = (i2315 & i2314) | (i2314 ^ i2315);
        int i2317 = i175 ^ i2014;
        int i2318 = -i2317;
        int i2319 = ((i2317 & i2318) | (i2317 ^ i2318)) >> 31;
        int i2410 = i2316 & (~i2319);
        int i2411 = i2014 & i2319;
        int i2412 = (i2411 & i2410) | (i2410 ^ i2411);
        int i2413 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
        int i2414 = (i2413 ^ 229) + ((i2413 & 229) << 1);
        int packedPositionType3 = ExpandableListView.getPackedPositionType(0L);
        int i2415 = (packedPositionType3 & 31) + (packedPositionType3 | 31);
        int threadPriority5 = Process.getThreadPriority(0);
        char c17 = (char) (14461 - (~(-(((threadPriority5 ^ 20) + ((threadPriority5 & 20) << 1)) >> 6))));
        Object[] objArr310 = new Object[1];
        a(i2414, i2415, c17, objArr310);
        String str211 = (String) objArr310[0];
        int i2416 = 261 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
        int i2417 = -View.getDefaultSize(0, 0);
        Object[] objArr311 = new Object[1];
        a(i2416, ((i2417 | 23) << 1) - (i2417 ^ 23), (char) Drawable.resolveOpacity(0, 0), objArr311);
        String str310 = (String) objArr311[0];
        int i2418 = -(-(KeyEvent.getMaxKeyCode() >> 16));
        int i2419 = (i2418 & 283) + (i2418 | 283);
        str3 = str2;
        int i2510 = -(-TextUtils.lastIndexOf(str3, '0', 0, 0));
        Object[] objArr312 = new Object[1];
        a(i2419, ((i2510 | 29) << 1) - (i2510 ^ 29), (char) KeyEvent.getDeadChar(0, 0), objArr312);
        String str311 = (String) objArr312[0];
        int i2511 = 312 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        int i2512 = -TextUtils.indexOf((CharSequence) str3, '0', 0, 0);
        Object[] objArr313 = new Object[1];
        a(i2511, (i2512 & 13) + (i2512 | 13), (char) (35212 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr313);
        strArr = new String[]{str211, str310, str311, (String) objArr313[0]};
        i10 = 0;
        while (true) {
            if (i10 < 4) {
                str4 = str3;
                i11 = i175;
                break;
            }
            Object[] objArr314 = {strArr[i10]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char c18 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int minimumFlingVelocity3 = 993 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int offsetAfter6 = TextUtils.getOffsetAfter(str3, 0) + 8;
                byte b114 = (byte) 0;
                Object[] objArr315 = new Object[1];
                c(b114, (byte) (b114 | 6), b114, objArr315);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(c18, minimumFlingVelocity3, offsetAfter6, -545305915, false, (String) objArr315[0], new Class[]{String.class});
            }
            long jLongValue23 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).invoke(null, objArr314)).longValue();
            long j413 = -1261978586;
            str4 = str3;
            long j414 = jLongValue23 ^ j25;
            long startUptimeMillis3 = (int) Process.getStartUptimeMillis();
            long j415 = j413 | startUptimeMillis3;
            j5 = (((long) (-1335)) * j413) + (((long) (-667)) * jLongValue23) + (((long) (-668)) * (j414 | (j415 ^ j25))) + (((long) 1336) * (j413 | ((j414 | startUptimeMillis3) ^ j25))) + (((long) 668) * (j415 | j414)) + ((long) 1882437870);
            i115 = ((int) (j5 >> 32)) & ((-494336726) + ((~(2097028225 | i178)) * (-560)) + ((~(2147475159 | i175)) * (-560)) + (((~((-659801815) | i178)) | 609354880) * 560));
            iMyUid = Process.myUid();
            i116 = ~iMyUid;
            if ((i115 | (((int) j5) & ((-255904448) + ((~(1897151897 | i116)) * 979) + ((459925487 | iMyUid) * (-979)) + (((~(iMyUid | 1897151897)) | (~(i116 | 459925487))) * 979)))) != 0) {
                i11 = i175 ^ (i10 + 252);
                break;
            }
            int i2513 = (i10 ^ 64) + ((i10 & 64) << 1);
            i10 = (i2513 ^ (-63)) + ((i2513 & (-63)) << 1);
            str3 = str4;
        }
        int i2514 = (~(i175 & i2412)) & (i175 | i2412);
        int i2515 = -i2514;
        int i2516 = ((i2514 & i2515) | (i2514 ^ i2515)) >> 31;
        int i2517 = i11 & (~i2516);
        int i2518 = i2412 & i2516;
        int i2519 = (i2518 & i2517) | (i2517 ^ i2518);
        int i2610 = -(ViewConfiguration.getTapTimeout() >> 16);
        int i2611 = ((i2610 | 325) << 1) - (i2610 ^ 325);
        int i2612 = -KeyEvent.getDeadChar(0, 0);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault15 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i2613 = (i2612 * (-51)) + 689;
        int i2614 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault15;
        int i2615 = (i2614 ^ i2612) | (i2614 & i2612);
        int i2616 = -(-((~((i2615 & 13) | (i2615 ^ 13))) * 52));
        int i2617 = (i2613 & i2616) + (i2613 | i2616);
        int i2618 = (~(((-14) & i2612) | ((-14) ^ i2612))) | (~((i2614 & (-14)) | ((-14) ^ i2614)));
        int i2619 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault15;
        int i2710 = i2617 + ((i2618 | (~(i2619 | i2612))) * (-52));
        int i2711 = ~i2612;
        int i2712 = ~((i2619 & i2711) | (i2711 ^ i2619));
        int i2713 = ~(i2711 | 13);
        int i2714 = -(-(((i2713 & i2712) | (i2712 ^ i2713)) * 52));
        int threadPriority6 = Process.getThreadPriority(0);
        Object[] objArr316 = new Object[1];
        a(i2611, (i2710 ^ i2714) + ((i2714 & i2710) << 1), (char) (((threadPriority6 ^ 20) + ((threadPriority6 & 20) << 1)) >> 6), objArr316);
        Object[] objArr317 = {(String) objArr316[0]};
        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            char cResolveOpacity2 = (char) (33602 - Drawable.resolveOpacity(0, 0));
            int touchSlop3 = 3085 - (ViewConfiguration.getTouchSlop() >> 8);
            str5 = str4;
            int iIndexOf16 = 26 - TextUtils.indexOf(str5, str5, 0, 0);
            byte b115 = (byte) 0;
            byte b116 = (byte) (b115 + 1);
            Object[] objArr318 = new Object[1];
            c(b115, b116, (byte) (b116 - 1), objArr318);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity2, touchSlop3, iIndexOf16, 1411172903, false, (String) objArr318[0], new Class[]{String.class});
        } else {
            str5 = str4;
        }
        str6 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr317);
        if (str6 != null) {
            int i2715 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
            int i2716 = ((i2715 | 338) << 1) - (i2715 ^ 338);
            int i2717 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            objArr3 = new Object[1];
            a(i2716, (i2717 & 8) + (i2717 | 8), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr3);
            if (str6.contains((String) objArr3[0])) {
                int i2718 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2718 % 128;
                int i2719 = i2718 % 2;
                i12 = i175 ^ ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
            } else {
                i12 = i175;
            }
        } else {
            i12 = i175;
        }
        int i2810 = (~(i175 & i2519)) & (i175 | i2519);
        int i2811 = -i2810;
        int i2812 = ((i2810 & i2811) | (i2810 ^ i2811)) >> 31;
        int i2813 = (i2519 & i2812) | (i12 & (~i2812));
        int iIndexOf17 = TextUtils.indexOf(str5, str5) + 347;
        int i2814 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
        Object[] objArr319 = new Object[1];
        a(iIndexOf17, (i2814 ^ 17) + ((i2814 & 17) << 1), (char) Color.blue(0), objArr319);
        str7 = (String) objArr319[0];
        int i2815 = -TextUtils.getTrimmedLength(str5);
        int i2816 = ((i2815 | 364) << 1) - (i2815 ^ 364);
        int i2817 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
        Object[] objArr410 = new Object[1];
        a(i2816, ((i2817 | 5) << 1) - (i2817 ^ 5), (char) (TextUtils.getOffsetAfter(str5, 0) + 37281), objArr410);
        bytes = ((String) objArr410[0]).getBytes();
        length = bytes.length;
        if (length == 0) {
            i13 = i175 ^ 251;
        } else {
            bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str7));
            int i2818 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i2819 = (i2818 ^ 3) + ((i2818 & 3) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2819 % 128;
            int i2910 = i2819 % 2;
            i14 = 4096;
            bArr = new byte[4096];
            i15 = 0;
            while (true) {
                i16 = bufferedInputStream2.read(bArr, 0, i14);
                if (i16 > 0) {
                    break;
                    break;
                }
                i17 = 0;
                while (i15 < length) {
                    int i2911 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i2912 = ((i2911 | 25) << 1) - (i2911 ^ 25);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2912 % 128;
                    int i2913 = i2912 % 2;
                    if (i17 < i16) {
                        break;
                        break;
                    }
                    if (bArr[i17] == bytes[i15]) {
                        int i2914 = (i15 & (-57)) + (i15 | (-57));
                        i15 = (i2914 & 58) + (i2914 | 58);
                    } else {
                        if (i15 != 0) {
                            i18 = i15 - 1;
                            while (true) {
                                if (i18 > 0) {
                                    bArr2 = bArr;
                                    i15 = 0;
                                    break;
                                    break;
                                }
                                i19 = 0;
                                while (true) {
                                    if (i19 < i18) {
                                        bArr2 = bArr;
                                        i15 = i18;
                                        break;
                                        break;
                                    }
                                    bArr3 = bArr;
                                    int i2915 = -i18;
                                    i20 = (i15 & i2915) + (i2915 | i15);
                                    i21 = -(-i19);
                                    if (bytes[i19] != bytes[(i20 & i21) + (i20 | i21)]) {
                                        break;
                                    }
                                    i19++;
                                    bArr = bArr3;
                                }
                                int i2916 = ((i18 | (-32)) << 1) - (i18 ^ (-32));
                                i18 = (i2916 & 31) + (i2916 | 31);
                                bArr = bArr3;
                            }
                        }
                        bArr = bArr2;
                    }
                    bArr2 = bArr;
                    i17++;
                    bArr = bArr2;
                }
                bArr = bArr;
                i14 = 4096;
            }
            if (i15 == length) {
                z = false;
            } else {
                z = true;
            }
            z2 = !z;
            bufferedInputStream2.close();
            if (z2) {
                i13 = i175 ^ 251;
            } else {
                i13 = i175;
            }
        }
        int i2917 = ((~i2813) & i175) | (i2813 & i178);
        int i2918 = -i2917;
        int i2919 = ((i2917 & i2918) | (i2917 ^ i2918)) >> 31;
        int i3010 = i13 & (~i2919);
        int i3011 = i2813 & i2919;
        int i3012 = (i3011 & i3010) | (i3010 ^ i3011);
        Object[] objArr411 = new Object[1];
        a(370 - TextUtils.indexOf(str5, str5, 0), 23 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (4994 - MotionEvent.axisFromString(str5)), objArr411);
        Object[] objArr412 = {(String) objArr411[0]};
        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char cIndexOf6 = (char) (TextUtils.indexOf((CharSequence) str5, '0') + 33603);
            int modifierMetaStateMask6 = 3084 - ((byte) KeyEvent.getModifierMetaStateMask());
            int fadingEdgeLength7 = 26 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            byte b117 = (byte) 0;
            byte b118 = (byte) (b117 + 1);
            Object[] objArr413 = new Object[1];
            c(b117, b118, (byte) (b118 - 1), objArr413);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf6, modifierMetaStateMask6, fadingEdgeLength7, 1411172903, false, (String) objArr413[0], new Class[]{String.class});
        }
        lowerCase = ((String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr412)).toLowerCase();
        int i3013 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
        int i3014 = (i3013 & 392) + (i3013 | 392);
        int i3015 = 4 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))));
        int i3016 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
        objArr = new Object[1];
        a(i3014, i3015, (char) ((i3016 ^ 46132) + ((i3016 & 46132) << 1)), objArr);
        if (lowerCase.contains((String) objArr[0])) {
            i22 = (i175 & (-265)) | (i178 & 264);
        } else {
            i22 = i175;
        }
        int i3017 = (~(i175 & i3012)) & (i175 | i3012);
        int i3018 = -i3017;
        int i3019 = ((i3017 & i3018) | (i3017 ^ i3018)) >> 31;
        int i3110 = i22 & (~i3019);
        int i3111 = i3012 & i3019;
        int i3112 = (i3111 & i3110) | (i3110 ^ i3111);
        Object[] objArr414 = new Object[1];
        a(396 - (~(-Drawable.resolveOpacity(0, 0))), 42 - (KeyEvent.getMaxKeyCode() >> 16), (char) (Color.argb(0, 0, 0, 0) + 61575), objArr414);
        String str312 = (String) objArr414[0];
        int i3113 = -(-KeyEvent.getDeadChar(0, 0));
        int i3114 = (i3113 ^ 439) + ((i3113 & 439) << 1);
        int i3115 = -(-TextUtils.indexOf(str5, str5));
        int i3116 = ((i3115 | 40) << 1) - (i3115 ^ 40);
        int i3117 = -(-AndroidCharacter.getMirror('0'));
        Object[] objArr415 = new Object[1];
        a(i3114, i3116, (char) ((i3117 ^ (-48)) + ((i3117 & (-48)) << 1)), objArr415);
        String str313 = (String) objArr415[0];
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int i3118 = (iMakeMeasureSpec3 ^ 479) + ((iMakeMeasureSpec3 & 479) << 1);
        int scrollBarSize5 = ViewConfiguration.getScrollBarSize() >> 8;
        Object[] objArr416 = new Object[1];
        a(i3118, (scrollBarSize5 & 27) + (scrollBarSize5 | 27), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), objArr416);
        String str314 = (String) objArr416[0];
        int tapTimeout6 = (ViewConfiguration.getTapTimeout() >> 16) + TypedValues.PositionType.TYPE_PERCENT_X;
        int i3119 = -TextUtils.indexOf((CharSequence) str5, '0', 0, 0);
        Object[] objArr417 = new Object[1];
        a(tapTimeout6, (i3119 & 26) + (i3119 | 26), (char) View.resolveSizeAndState(0, 0, 0), objArr417);
        String str315 = (String) objArr417[0];
        int iIndexOf18 = TextUtils.indexOf(str5, str5, 0);
        int i3210 = (iIndexOf18 & 533) + (iIndexOf18 | 533);
        int i3211 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
        Object[] objArr418 = new Object[1];
        a(i3210, (i3211 ^ 28) + ((i3211 & 28) << 1), (char) ExpandableListView.getPackedPositionGroup(0L), objArr418);
        String str316 = (String) objArr418[0];
        int defaultSize4 = 560 - View.getDefaultSize(0, 0);
        int packedPositionChild4 = ExpandableListView.getPackedPositionChild(0L);
        int i3212 = ((packedPositionChild4 | 28) << 1) - (packedPositionChild4 ^ 28);
        int i3213 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
        Object[] objArr419 = new Object[1];
        a(defaultSize4, i3212, (char) ((i3213 & 59150) + (i3213 | 59150)), objArr419);
        strArr2 = new String[]{str312, str313, str314, str315, str316, (String) objArr419[0]};
        i23 = 0;
        while (true) {
            if (i23 < 6) {
                i24 = i175;
                break;
            }
            int i3214 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            i114 = ((i3214 | 89) << 1) - (i3214 ^ 89);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i114 % 128;
            if (i114 % 2 == 0) {
                Object[] objArr510 = {strArr2[i23]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                    char tapTimeout7 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 33602);
                    int defaultSize5 = 3085 - View.getDefaultSize(0, 0);
                    int iIndexOf19 = 25 - TextUtils.indexOf((CharSequence) str5, '0', 0);
                    byte b210 = (byte) 0;
                    byte b211 = (byte) (b210 + 1);
                    Object[] objArr511 = new Object[1];
                    c(b210, b211, (byte) (b211 - 1), objArr511);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(tapTimeout7, defaultSize5, iIndexOf19, 1411172903, false, (String) objArr511[0], new Class[]{String.class});
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object[] objArr512 = {strArr2[i23]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                char packedPositionChild5 = (char) (ExpandableListView.getPackedPositionChild(0L) + 33603);
                int iCombineMeasuredStates3 = 3085 - View.combineMeasuredStates(0, 0);
                int iResolveSizeAndState4 = 26 - View.resolveSizeAndState(0, 0, 0);
                byte b119 = (byte) 0;
                byte b212 = (byte) (b119 + 1);
                Object[] objArr513 = new Object[1];
                c(b119, b212, (byte) (b212 - 1), objArr513);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(packedPositionChild5, iCombineMeasuredStates3, iResolveSizeAndState4, 1411172903, false, (String) objArr513[0], new Class[]{String.class});
            }
            str17 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).invoke(null, objArr512);
            if (str17 == null) {
            }
            i23 = ((i23 | 1) << 1) - (i23 ^ 1);
        }
        int i3215 = (~(i175 & i3112)) & (i175 | i3112);
        int i3216 = (i3215 | (-i3215)) >> 31;
        int i3217 = i24 & (~i3216);
        int i3218 = i3112 & i3216;
        int i3219 = (i3218 & i3217) | (i3217 ^ i3218);
        int doubleTapTimeout5 = ViewConfiguration.getDoubleTapTimeout() >> 16;
        int i3311 = (doubleTapTimeout5 & 347) + (doubleTapTimeout5 | 347);
        int i3312 = -(Process.myTid() >> 22);
        Object[] objArr514 = new Object[1];
        a(i3311, (i3312 & 17) + (i3312 | 17), (char) Color.red(0), objArr514);
        str8 = (String) objArr514[0];
        int i3313 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
        int i3314 = (i3313 ^ 587) + ((i3313 & 587) << 1);
        int i3315 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
        int i3316 = ((i3315 | 7) << 1) - (i3315 ^ 7);
        int i3317 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
        Object[] objArr515 = new Object[1];
        a(i3314, i3316, (char) ((i3317 ^ 55086) + ((i3317 & 55086) << 1)), objArr515);
        bytes2 = ((String) objArr515[0]).getBytes();
        length2 = bytes2.length;
        if (length2 == 0) {
            int i3318 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            i113 = (i3318 & 57) + (i3318 | 57);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i113 % 128;
            if (i113 % 2 != 0) {
                i41 = ~(i175 & 21883);
                i42 = i175 | 21883;
                i29 = i41 & i42;
            } else {
                i39 = i175 & (-261);
                i40 = i178 & 260;
                i29 = i39 | i40;
            }
        } else {
            bufferedInputStream4 = new BufferedInputStream(new FileInputStream(str8));
            i43 = 4096;
            bArr7 = new byte[4096];
            i44 = 0;
            while (true) {
                i45 = bufferedInputStream4.read(bArr7, 0, i43);
                if (i45 > 0) {
                    i46 = 0;
                    while (i44 < length2) {
                        i47 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        i48 = i47 + 23;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i48 % 128;
                        if (i48 % 2 == 0) {
                            throw null;
                        }
                        if (i46 < i45) {
                            break;
                            break;
                        }
                        if (bArr7[i46] == bytes2[i44]) {
                            i44 = ((i44 | 1) << 1) - (i44 ^ 1);
                            i55 = (i47 & 29) + (i47 | 29);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i55 % 128;
                            if (i55 % 2 != 0) {
                                int i3319 = 3 / 4;
                            }
                        } else {
                            if (i44 != 0) {
                                i49 = i44 - 1;
                                while (true) {
                                    if (i49 > 0) {
                                        bArr8 = bArr7;
                                        i50 = i45;
                                        i44 = 0;
                                        break;
                                        break;
                                    }
                                    int i3320 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    i51 = (i3320 ^ 107) + ((i3320 & 107) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i51 % 128;
                                    if (i51 % 2 == 0) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    i52 = 0;
                                    while (true) {
                                        if (i52 < i49) {
                                            bArr8 = bArr7;
                                            i50 = i45;
                                            if (z5) {
                                                break;
                                                break;
                                            }
                                            i44 = i49;
                                            break;
                                            break;
                                        }
                                        bArr8 = bArr7;
                                        i50 = i45;
                                        int i3410 = -i49;
                                        i53 = (i44 & i3410) + (i3410 | i44);
                                        i54 = -(-i52);
                                        if (bytes2[i52] != bytes2[((i53 | i54) << 1) - (i53 ^ i54)]) {
                                            int i3411 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3411 % 128;
                                            int i3412 = i3411 % 2;
                                            break;
                                            break;
                                        }
                                        int i3413 = (i52 ^ (-43)) + ((i52 & (-43)) << 1);
                                        i52 = ((i3413 & 44) << 1) + (i3413 ^ 44);
                                        bArr7 = bArr8;
                                        i45 = i50;
                                    }
                                    i49--;
                                    bArr7 = bArr8;
                                    i45 = i50;
                                }
                            }
                            bArr7 = bArr8;
                            i45 = i50;
                        }
                        bArr8 = bArr7;
                        i50 = i45;
                        i46 = (i46 ^ (-77)) + ((i46 & (-77)) << 1) + 78;
                        bArr7 = bArr8;
                        i45 = i50;
                    }
                    bArr7 = bArr7;
                    i43 = 4096;
                } else {
                    if (i44 == length2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    bufferedInputStream4.close();
                    if (z4) {
                        int i33110 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        i113 = (i33110 & 57) + (i33110 | 57);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i113 % 128;
                        if (i113 % 2 != 0) {
                            i41 = ~(i175 & 21883);
                            i42 = i175 | 21883;
                            i29 = i41 & i42;
                        } else {
                            i39 = i175 & (-261);
                            i40 = i178 & 260;
                            i29 = i39 | i40;
                        }
                    }
                }
                int i3414 = -ExpandableListView.getPackedPositionChild(0L);
                int i3415 = (i3414 ^ 592) + ((i3414 & 592) << 1);
                int keyRepeatTimeout6 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                int i3416 = ((keyRepeatTimeout6 | 13) << 1) - (keyRepeatTimeout6 ^ 13);
                int i3417 = -Process.getGidForName(str5);
                Object[] objArr516 = new Object[1];
                a(i3415, i3416, (char) ((i3417 ^ 11524) + ((i3417 & 11524) << 1)), objArr516);
                str9 = (String) objArr516[0];
                i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i25 % 128;
                if (i25 % 2 == 0) {
                    int keyRepeatTimeout7 = ViewConfiguration.getKeyRepeatTimeout();
                    i27 = 15021 >>> ((keyRepeatTimeout7 ^ 42) + ((keyRepeatTimeout7 & 42) << 1));
                    i28 = 21;
                    i26 = 1;
                } else {
                    int i3418 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    i26 = 1;
                    i27 = ((i3418 & TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO) << 1) + (i3418 ^ TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO);
                    i28 = 8;
                }
                int iIndexOf20 = i28 - TextUtils.indexOf((CharSequence) str5, '0');
                int i3419 = -ExpandableListView.getPackedPositionChild(0L);
                Object[] objArr517 = new Object[i26];
                a(i27, iIndexOf20, (char) ((i3419 ^ (-1)) + (i3419 << i26)), objArr517);
                bytes3 = ((String) objArr517[0]).getBytes();
                length3 = bytes3.length;
                if (length3 != 0) {
                    bufferedInputStream6 = new BufferedInputStream(new FileInputStream(str9));
                    i30 = 4096;
                    bArr4 = new byte[4096];
                    i31 = 0;
                    while (true) {
                        i32 = bufferedInputStream6.read(bArr4, 0, i30);
                        if (i32 > 0) {
                            break;
                            break;
                        }
                        i33 = 0;
                        while (i31 < length3) {
                            if (bArr4[i33] == bytes3[i31]) {
                                int i3510 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                i37 = ((i3510 | 41) << 1) - (i3510 ^ 41);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i37 % 128;
                                if (i37 % 2 != 0) {
                                    i31 += 31;
                                } else {
                                    i31++;
                                }
                            } else {
                                if (i31 != 0) {
                                    i34 = i31 - 1;
                                    while (true) {
                                        if (i34 > 0) {
                                            bArr5 = bArr4;
                                            i31 = 0;
                                            break;
                                            break;
                                        }
                                        i35 = 0;
                                        while (true) {
                                            if (i35 < i34) {
                                                bArr5 = bArr4;
                                                i31 = i34;
                                                break;
                                                break;
                                            }
                                            bArr6 = bArr4;
                                            i36 = -i34;
                                            if (bytes3[i35] != bytes3[((((i31 | i36) << 1) - (i36 ^ i31)) - (~i35)) - 1]) {
                                                break;
                                            }
                                            i35++;
                                            bArr4 = bArr6;
                                        }
                                        i34--;
                                        bArr4 = bArr6;
                                    }
                                }
                                bArr4 = bArr5;
                            }
                            bArr5 = bArr4;
                            i33 = ((i33 ^ 53) + ((i33 & 53) << 1)) - 52;
                            bArr4 = bArr5;
                        }
                        bArr4 = bArr4;
                        i30 = 4096;
                    }
                    if (i31 == length3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    bufferedInputStream6.close();
                    if (z3) {
                        i29 = i175;
                    }
                }
                int i3511 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                i38 = (i3511 ^ 91) + ((i3511 & 91) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i38 % 128;
                if (i38 % 2 != 0) {
                    i41 = ~(i175 & 22671);
                    i42 = i175 | 22671;
                    i29 = i41 & i42;
                } else {
                    i39 = i175 & (-262);
                    i40 = i178 & 261;
                    i29 = i39 | i40;
                }
            }
        }
        int i3512 = (~(i175 & i3219)) & (i175 | i3219);
        int i3513 = -i3512;
        i56 = (i3512 & i3513) | (i3512 ^ i3513);
        int i3514 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        i57 = ((i3514 | 75) << 1) - (i3514 ^ 75);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i57 % 128;
        if (i57 % 2 != 0) {
            i58 = i56 * 31;
        } else {
            i58 = i56 >> 31;
        }
        int i3515 = i29 & (~i58);
        int i3516 = i3219 & i58;
        i59 = (i3516 & i3515) | (i3515 ^ i3516);
        if ((i2 & 8) == 0) {
            int i3517 = -(-TextUtils.getOffsetBefore(str5, 0));
            Object[] objArr518 = new Object[1];
            a((i3517 ^ 615) + ((i3517 & 615) << 1), 43 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) TextUtils.indexOf(str5, str5, 0), objArr518);
            int i3518 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3519 = (i3518 & 97) + (i3518 | 97);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3519 % 128;
            int i3610 = i3519 % 2;
            int i3611 = 658 - (~ExpandableListView.getPackedPositionChild(0L));
            int maxKeyCode2 = KeyEvent.getMaxKeyCode() >> 16;
            int i3612 = (maxKeyCode2 & 41) + (maxKeyCode2 | 41);
            int i3613 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            Object[] objArr519 = new Object[1];
            a(i3611, i3612, (char) ((i3613 ^ 1) + ((i3613 & 1) << 1)), objArr519);
            int i3614 = 697 - (~(-ExpandableListView.getPackedPositionChild(0L)));
            int i3615 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 - (-1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3615 % 128;
            int i3616 = i3615 % 2;
            int i3617 = -Color.rgb(0, 0, 0);
            int i3618 = (((-16777178) | i3617) << 1) - (i3617 ^ (-16777178));
            char mirror2 = AndroidCharacter.getMirror('0');
            char c19 = (char) ((mirror2 & 49683) + (49683 | mirror2));
            Object[] objArr610 = new Object[1];
            a(i3614, i3618, c19, objArr610);
            strArr9 = new String[]{(String) objArr518[0], (String) objArr519[0], (String) objArr610[0]};
            i108 = 0;
            while (true) {
                if (i108 < 3) {
                    i109 = i59;
                    i110 = i175;
                    break;
                }
                Object[] objArr611 = {strArr9[i108]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                    char gidForName2 = (char) (Process.getGidForName(str5) + 1);
                    int i3619 = 993 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int offsetBefore5 = 8 - TextUtils.getOffsetBefore(str5, 0);
                    byte b213 = (byte) 0;
                    byte b214 = b213;
                    Object[] objArr612 = new Object[1];
                    c(b213, b214, b214, objArr612);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(gidForName2, i3619, offsetBefore5, 349342683, false, (String) objArr612[0], new Class[]{String.class});
                }
                long jLongValue24 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr611)).longValue();
                long j416 = 39594472;
                strArr10 = strArr9;
                long j417 = 614;
                i111 = i108;
                long jElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                long j418 = j416 ^ j25;
                long j419 = (j418 | jLongValue24) ^ j25;
                long j510 = jLongValue24 ^ j25;
                i112 = i59;
                long j511 = jElapsedRealtime3 ^ j25;
                j4 = (((long) 615) * j416) + (((long) (-613)) * jLongValue24) + ((jElapsedRealtime3 | j419 | ((j510 | j416) ^ j25)) * j417) + (((long) (-1228)) * (((j418 | j511) ^ j25) | j419 | ((j511 | jLongValue24) ^ j25))) + (j417 * ((((j418 | j510) | j511) ^ j25) | (((j511 | j416) | jLongValue24) ^ j25))) + ((long) (-886673077));
                i175 = i;
                if (((((int) (j4 >> 32)) & ((-802173004) + (((-744506531) | i178) * (-369)) + (((~(2103461026 | i178)) | (-754279859)) * (-369)) + (((~((-2103461027) | i175)) | 1358954496 | (~((-9773329) | i178))) * 369))) | (((int) j4) & (2055568080 + (((~(211988933 | i178)) | (-1225237477)) * 226) + (((~(1225237476 | i175)) | 77598721 | (~((-1090847265) | i178))) * (-113)) + ((~(211988933 | i175)) * 113)))) != 0) {
                    int i3710 = i111 + 280;
                    i110 = ((~i3710) & i175) | (i3710 & i178);
                    i109 = i112;
                    break;
                }
                i108 = (i111 ^ 1) + ((i111 & 1) << 1);
                strArr9 = strArr10;
                i59 = i112;
            }
            int i3711 = ((~i109) & i175) | (i109 & i178);
            int i3712 = -i3711;
            int i3713 = ((i3711 & i3712) | (i3711 ^ i3712)) >> 31;
            int i3714 = i110 & (~i3713);
            int i3715 = i109 & i3713;
            i59 = (i3714 & i3715) | (i3714 ^ i3715);
        }
        strArr3 = new String[2];
        globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
        i60 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i60 % 128;
        if (i60 % 2 != 0) {
            i61 = 736 >> (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1));
            i63 = 3 / (ExpandableListView.getPackedPositionForGroup(1) > 1L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 1L ? 0 : -1));
            i62 = 0;
        } else {
            int i3716 = (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1));
            i61 = ((i3716 | 736) << 1) - (736 ^ i3716);
            i62 = 0;
            int i3717 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            i63 = (i3717 | 41) + (i3717 & 41);
        }
        Object[] objArr613 = new Object[1];
        a(i61, i63, (char) (34266 - (~TextUtils.indexOf((CharSequence) str5, '0', i62))), objArr613);
        strArr3[i62] = (String) objArr613[i62];
        int keyRepeatTimeout8 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
        int i3718 = (keyRepeatTimeout8 ^ 778) + ((keyRepeatTimeout8 & 778) << 1);
        int jumpTapTimeout4 = ViewConfiguration.getJumpTapTimeout() >> 16;
        Object[] objArr614 = new Object[1];
        a(i3718, ((jumpTapTimeout4 | 30) << 1) - (jumpTapTimeout4 ^ 30), (char) ((-2) - (~(-MotionEvent.axisFromString(str5)))), objArr614);
        strArr3[1] = (String) objArr614[0];
        i64 = 0;
        i65 = 2;
        while (true) {
            if (i64 < i65) {
                i66 = i59;
                i67 = i175;
                i68 = i67;
                break;
            }
            Object[] objArr615 = {strArr3[i64]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                char cAxisFromString2 = (char) (MotionEvent.axisFromString(str5) + 1);
                int iIndexOf21 = TextUtils.indexOf(str5, str5, 0, 0) + 993;
                int i3719 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9;
                byte b215 = (byte) 0;
                Object[] objArr616 = new Object[1];
                c(b215, (byte) (b215 | 6), b215, objArr616);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cAxisFromString2, iIndexOf21, i3719, -545305915, false, (String) objArr616[0], new Class[]{String.class});
            }
            long jLongValue25 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).invoke(null, objArr615)).longValue();
            long j512 = 567565049;
            i66 = i59;
            long j513 = 140;
            i105 = i64;
            long jElapsedRealtime4 = (int) SystemClock.elapsedRealtime();
            long j514 = (j512 ^ j25) | jLongValue25;
            long j515 = jElapsedRealtime4 ^ j25;
            long j516 = (((long) 141) * j512) + (((long) (-279)) * jLongValue25) + ((jLongValue25 | jElapsedRealtime4) * j513) + (((long) (-280)) * ((j514 ^ j25) | ((j515 | jLongValue25) ^ j25))) + (((((jLongValue25 ^ j25) | j512) ^ j25) | ((j515 | j512) ^ j25) | ((j514 | jElapsedRealtime4) ^ j25)) * j513) + ((long) 52894235);
            i67 = i;
            i106 = ((int) (j516 >> 32)) & ((-798338826) + (((~(1311962920 | i67)) | 1545777964) * (-964)) + (((~(1311962920 | i178)) | 268435460) * (-964)));
            int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
            int i3810 = ~iFreeMemory2;
            i107 = ((int) j516) & (1545287780 + ((~(1343104127 | i3810)) * 979) + (((-94122283) | iFreeMemory2) * (-979)) + (((~(iFreeMemory2 | 1343104127)) | (~(i3810 | (-94122283)))) * 979));
            if (((i106 & i107) | (i106 ^ i107)) != 0) {
                int i3811 = (i105 ^ 288) + ((i105 & 288) << 1);
                i68 = (~(i67 & i3811)) & (i3811 | i67);
                break;
            }
            int i3812 = i105 + 104;
            i175 = i67;
            i65 = 2;
            i64 = ((i3812 | (-103)) << 1) - (i3812 ^ (-103));
            i59 = i66;
        }
        int i3813 = (~(i67 & i66)) & (i67 | i66);
        int i3814 = (i3813 | (-i3813)) >> 31;
        int i3815 = i68 & (~i3814);
        int i3816 = i66 & i3814;
        i69 = (i3815 & i3816) | (i3815 ^ i3816);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-555308653);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char c20 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
            int scrollBarSize6 = 3526 - (ViewConfiguration.getScrollBarSize() >> 8);
            int i3817 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22;
            byte b216 = (byte) 0;
            byte b217 = (byte) (b216 + 1);
            Object[] objArr617 = new Object[1];
            c(b216, b217, (byte) (b217 - 1), objArr617);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c20, scrollBarSize6, i3817, 980946500, false, (String) objArr617[0], new Class[0]);
        }
        long jLongValue26 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, null)).longValue();
        long j517 = -137689566;
        long j518 = (((long) 450) * j517) + (((long) (-448)) * jLongValue26);
        long j519 = 449;
        long j610 = ((j517 ^ j25) | jLongValue26) ^ j25;
        long j611 = jLongValue26 ^ j25;
        str10 = str5;
        long j612 = j518 + ((j610 | (((j611 | j517) | j) ^ j25)) * j519) + (((long) (-1347)) * j610) + (j519 * (j610 | (((j611 | j2) | j517) ^ j25))) + ((long) (-42633072));
        int i3818 = (~((int) Process.getElapsedCpuTime())) | 337900826;
        i70 = ((int) (j612 >> 32)) & (1360173225 + (i3818 * 495) + (((~i3818) | 155664) * 495));
        int i3819 = (int) Runtime.getRuntime().totalMemory();
        i71 = ((int) j612) & ((-635053948) + (((-69207050) | i3819) * (-627)) + (((~(618669257 | i3819)) | (-818557153)) * (-627)) + (((~(i3819 | (-818557153))) | (~((~i3819) | (-618669258)))) * 627));
        if (((i70 & i71) | (i70 ^ i71)) != 1) {
            Object[] objArr618 = {1};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1331892133);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char mode8 = (char) View.MeasureSpec.getMode(0);
                int iRgb10 = 16779889 + Color.rgb(0, 0, 0);
                int doubleTapTimeout6 = 16 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte b218 = (byte) 0;
                byte b219 = (byte) (b218 + 1);
                Object[] objArr619 = new Object[1];
                c(b218, b219, (byte) (b219 - 1), objArr619);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode8, iRgb10, doubleTapTimeout6, -1409439630, false, (String) objArr619[0], new Class[]{Integer.TYPE});
            }
            long jLongValue112 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr618)).longValue();
            long j613 = 444746919;
            long j614 = j613 ^ j25;
            long jNextInt5 = new Random().nextInt();
            long j615 = (((long) 303) * j613) + (((long) (-301)) * jLongValue112) + (((long) (-302)) * ((((j614 | (jNextInt5 ^ j25)) | jLongValue112) ^ j25) | (((j613 | jLongValue112) | jNextInt5) ^ j25))) + (((long) (-604)) * (((j614 | jLongValue112) | jNextInt5) ^ j25)) + (((long) 302) * (((jNextInt5 | jLongValue112) ^ j25) | (((jLongValue112 ^ j25) | j613) ^ j25))) + ((long) 1422951761);
            int i3910 = ~((int) Process.getStartUptimeMillis());
            i73 = ((int) (j615 >> 32)) & ((((~(1531524390 | i3910)) | (-1598911791)) * (-241)) + 1351484523 + (((~(i3910 | (-67387401))) | 272695296) * 241));
            int iUptimeMillis5 = (int) SystemClock.uptimeMillis();
            i74 = ((int) j615) & ((-1547799566) + (((~(1402582425 | iUptimeMillis5)) | (~((-34643985) | iUptimeMillis5))) * 69) + (((~(iUptimeMillis5 | (-1402516882))) | (~(34709528 | iUptimeMillis5)) | 1367872897) * (-69)) + 4522536);
            if (((i73 & i74) | (i73 ^ i74)) != 0) {
                i75 = (i67 & (-221)) | (i178 & 220);
            } else {
                i75 = i67;
            }
            int i3911 = i67 ^ i69;
            int i3912 = -i3911;
            int i3913 = ((i3911 & i3912) | (i3911 ^ i3912)) >> 31;
            int i3914 = i75 & (~i3913);
            int i3915 = i69 & i3913;
            i76 = (i3915 & i3914) | (i3914 ^ i3915);
            int i3916 = 368 - (~(-(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))));
            int i3917 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
            int i3918 = ((i3917 | 23) << 1) - (i3917 ^ 23);
            int mode9 = View.MeasureSpec.getMode(0);
            int i3919 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i4014 = ((i3919 | 65) << 1) - (i3919 ^ 65);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4014 % 128;
            int i4015 = i4014 % 2;
            Object[] objArr715 = new Object[1];
            a(i3916, i3918, (char) (4994 - (~(-mode9))), objArr715);
            Object[] objArr716 = {(String) objArr715[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                str11 = str10;
                char cIndexOf7 = (char) (TextUtils.indexOf((CharSequence) str11, '0') + 33603);
                int i4016 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3085;
                int fadingEdgeLength8 = 26 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                byte b314 = (byte) 0;
                byte b315 = (byte) (b314 + 1);
                Object[] objArr717 = new Object[1];
                c(b314, b315, (byte) (b315 - 1), objArr717);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf7, i4016, fadingEdgeLength8, 1411172903, false, (String) objArr717[0], new Class[]{String.class});
            } else {
                str11 = str10;
            }
            objInvoke = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr716);
            if (objInvoke != null) {
                Object[] objArr718 = {objInvoke, 42};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char fadingEdgeLength9 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int mode10 = 3393 - View.MeasureSpec.getMode(0);
                    int i4017 = 9 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte b316 = (byte) 0;
                    byte b317 = (byte) (b316 + 1);
                    Object[] objArr719 = new Object[1];
                    c(b316, b317, (byte) (b317 - 1), objArr719);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(fadingEdgeLength9, mode10, i4017, 1203525406, false, (String) objArr719[0], new Class[]{String.class, Integer.TYPE});
                }
                strArr6 = null;
                long jLongValue113 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr718)).longValue();
                long j616 = 2012469106;
                long j617 = 829;
                long j618 = (j617 * j616) + (j617 * jLongValue113);
                long j619 = -828;
                long j715 = j618 + (((((j616 ^ j25) | (jLongValue113 ^ j25)) ^ j25) | (((j2 | j616) | jLongValue113) ^ j25)) * j619);
                long j716 = jLongValue113 | j616;
                long j717 = j715 + (j619 * (j716 | j2)) + (((long) 828) * (j716 ^ j25)) + ((long) (-2014538983));
                int i4018 = ~(1281706427 | i67);
                i103 = ((int) (j717 >> 32)) & (((763683666 + (((-155519984) | i4018) * (-220))) + ((i4018 | (-1298484224)) * 220)) - 1277394920);
                int startUptimeMillis4 = (int) Process.getStartUptimeMillis();
                int i4019 = ~startUptimeMillis4;
                i104 = ((int) j717) & (((((~(i4019 | (-1453361954))) | ((~((-16135544) | i4019)) | 10486049)) * (-397)) - 2030266515) + ((startUptimeMillis4 | (-1448525399)) * 397));
                if (((i103 & i104) | (i103 ^ i104)) == 1986687685) {
                    str12 = str11;
                }
                iIndexOf = TextUtils.indexOf(str12, str12, 0);
                int i40110 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                i85 = (i40110 & 107) + (i40110 | 107);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i85 % 128;
                if (i85 % 2 == 0) {
                    i87 = 889 / iIndexOf;
                    iNormalizeMetaState = KeyEvent.normalizeMetaState(0) * 120;
                    i86 = 1;
                } else {
                    int i40111 = -(-iIndexOf);
                    i86 = 1;
                    i87 = ((i40111 | 889) << 1) - (889 ^ i40111);
                    int i40112 = -(-KeyEvent.normalizeMetaState(0));
                    iNormalizeMetaState = ((i40112 & 16) << 1) + (i40112 ^ 16);
                }
                int i40113 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
                Object[] objArr7110 = new Object[i86];
                a(i87, iNormalizeMetaState, (char) (((51869 | i40113) << i86) - (i40113 ^ 51869)), objArr7110);
                Object[] objArr7111 = {(String) objArr7110[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char offsetBefore6 = (char) (33602 - TextUtils.getOffsetBefore(str12, 0));
                    int fadingEdgeLength10 = 3085 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iLastIndexOf7 = TextUtils.lastIndexOf(str12, '0', 0) + 27;
                    byte b318 = (byte) 0;
                    byte b319 = (byte) (b318 + 1);
                    Object[] objArr7112 = new Object[1];
                    c(b318, b319, (byte) (b319 - 1), objArr7112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(offsetBefore6, fadingEdgeLength10, iLastIndexOf7, 1411172903, false, (String) objArr7112[0], new Class[]{String.class});
                }
                objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr7111);
                if (objInvoke2 == null) {
                    i72 = i67;
                    i88 = 0;
                } else {
                    Object[] objArr7113 = {objInvoke2, 42};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        char c110 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int windowTouchSlop5 = 3393 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int packedPositionGroup7 = ExpandableListView.getPackedPositionGroup(0L) + 9;
                        byte b3110 = (byte) 0;
                        byte b3111 = (byte) (b3110 + 1);
                        Object[] objArr7114 = new Object[1];
                        c(b3110, b3111, (byte) (b3111 - 1), objArr7114);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c110, windowTouchSlop5, packedPositionGroup7, 1203525406, false, (String) objArr7114[0], new Class[]{String.class, Integer.TYPE});
                    }
                    long jLongValue114 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr7113)).longValue();
                    long j718 = 159255616;
                    long j719 = 46;
                    long j7110 = jLongValue114 ^ j25;
                    long jNextInt6 = new Random().nextInt();
                    long j7111 = jNextInt6 ^ j25;
                    long j7112 = (j719 * j718) + (j719 * jLongValue114) + (((long) (-90)) * (j718 | ((j7110 | j7111) ^ j25))) + (((long) (-45)) * (((j7110 | jNextInt6) ^ j25) | ((jLongValue114 | j718) ^ j25))) + (((long) 45) * (j7110 | ((jNextInt6 | (j718 ^ j25)) ^ j25) | ((j7111 | j718) ^ j25))) + ((long) (-161325493));
                    i72 = i;
                    int i4113 = ((int) (j7112 >> 32)) & (1522584826 + (((~(1135418171 | i178)) | (-1722322714)) * (-602)) + (((~(1135418171 | i72)) | (-1739431740) | (~((-1118309146) | i178))) * (-301)) + ((~(i178 | (-1722322714))) * 301));
                    int i4114 = ~((int) SystemClock.uptimeMillis());
                    int i4115 = ((int) j7112) & ((((~((-1349774508) | i4114)) | 1348578474) * (-241)) + 1689859423 + (((~(i4114 | (-1196034))) | 159387904) * 241));
                    i88 = (i4115 & i4113) | (i4113 ^ i4115);
                }
                if (i88 != 1986687685) {
                    str14 = str12;
                    j3 = j25;
                    strArr6 = strArr6;
                } else {
                    str14 = str12;
                    j3 = j25;
                    strArr6 = strArr6;
                }
                str15 = str14;
                int i5117 = 1949 - (~TextUtils.getOffsetAfter(str15, 0));
                int iAxisFromString4 = MotionEvent.axisFromString(str15);
                int i5118 = (iAxisFromString4 & 14) + (iAxisFromString4 | 14);
                int iIndexOf110 = TextUtils.indexOf((CharSequence) str15, '0', 0, 0);
                char c111 = (char) ((iIndexOf110 ^ 1) + ((iIndexOf110 & 1) << 1));
                Object[] objArr1016 = new Object[1];
                a(i5117, i5118, c111, objArr1016);
                String str514 = (String) objArr1016[0];
                int i5119 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int iIndexOf111 = TextUtils.indexOf((CharSequence) str15, '0', 0);
                Object[] objArr1017 = new Object[1];
                a((i5119 ^ 1964) + ((i5119 & 1964) << 1), (iIndexOf111 ^ 6) + ((iIndexOf111 & 6) << 1), (char) View.resolveSize(0, 0), objArr1017);
                int i51110 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                Object[] objArr1018 = new Object[1];
                a((i51110 & 1968) + (i51110 | 1968), 14 - (~(-(ViewConfiguration.getEdgeSlop() >> 16))), (char) ((-2) - ((-ExpandableListView.getPackedPositionChild(0L)) ^ (-1))), objArr1018);
                int i51111 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                int i51112 = (i51111 & 1983) + (i51111 | 1983);
                TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int iBlue6 = Color.blue(0);
                int i51113 = iBlue6 * (-958);
                int i52110 = ((i51113 | (-18202)) << 1) - (i51113 ^ (-18202));
                int i52111 = ~(((-20) ^ i178) | ((-20) & i178));
                int i52112 = ~iBlue6;
                int i52113 = ~((i52112 ^ i72) | (i52112 & i72));
                int i52114 = (i52111 & i52113) | (i52111 ^ i52113);
                int i52115 = ~((i174 ^ iBlue6) | (i174 & iBlue6));
                int i52116 = ((i52114 & i52115) | (i52114 ^ i52115)) * 959;
                int i52117 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i52118 = (i52117 ^ 95) + ((i52117 & 95) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i52118 % 128;
                int i52119 = i52118 % 2;
                int i53110 = -(-i52116);
                int i53111 = (i52110 & i53110) + (i52110 | i53110);
                int i53112 = (~((iBlue6 ^ 19) | (iBlue6 & 19))) * (-959);
                int i53113 = (i53111 ^ i53112) + ((i53112 & i53111) << 1);
                int i53114 = ~((i52112 ^ i178) | (i52112 & i178));
                int i53115 = ~(((-20) & i72) | ((-20) ^ i72));
                int i53116 = (i53115 & i53114) | (i53114 ^ i53115);
                int i53117 = ~((iBlue6 & i72) | (iBlue6 ^ i72));
                Object[] objArr1019 = new Object[1];
                a(i51112, i53113 + (((i53116 & i53117) | (i53116 ^ i53117)) * 959), (char) (52828 - (~(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))))), objArr1019);
                int iRgb11 = Color.rgb(0, 0, 0);
                int i53118 = ((iRgb11 | 16779218) << 1) - (16779218 ^ iRgb11);
                int i53119 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                int i54110 = (i53119 ^ 14) + ((i53119 & 14) << 1);
                int i54111 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                Object[] objArr10110 = new Object[1];
                a(i53118, i54110, (char) ((i54111 & 52591) + (i54111 | 52591)), objArr10110);
                String[] strArr113 = {(String) objArr1018[0], (String) objArr1019[0], (String) objArr10110[0]};
                int mode11 = View.MeasureSpec.getMode(0) + 2016;
                int i54112 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                Object[] objArr10111 = new Object[1];
                a(mode11, (i54112 & 20) + (i54112 | 20), (char) TextUtils.getOffsetAfter(str15, 0), objArr10111);
                String str515 = (String) objArr10111[0];
                int i54113 = -MotionEvent.axisFromString(str15);
                int i54114 = (i54113 & 2036) + (i54113 | 2036);
                int i54115 = -(ViewConfiguration.getEdgeSlop() >> 16);
                int i54116 = (i54115 ^ 10) + ((i54115 & 10) << 1);
                int i54117 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                Object[] objArr11110 = new Object[1];
                a(i54114, i54116, (char) ((i54117 ^ 62405) + ((i54117 & 62405) << 1)), objArr11110);
                Object[] objArr11111 = new Object[1];
                a(2047 - View.getDefaultSize(0, 0), 11 - (~(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (char) View.combineMeasuredStates(0, 0), objArr11111);
                String str516 = (String) objArr11111[0];
                int i54118 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i54119 = (i54118 ^ 587) + ((i54118 & 587) << 1);
                int maximumDrawingCacheSize6 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                Object[] objArr11112 = new Object[1];
                a(i54119, (maximumDrawingCacheSize6 ^ 6) + ((maximumDrawingCacheSize6 & 6) << 1), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 55086), objArr11112);
                int i55110 = -Color.rgb(0, 0, 0);
                int i55111 = (i55110 & (-16775158)) + (i55110 | (-16775158));
                int i55112 = -(Process.myPid() >> 22);
                Object[] objArr11113 = new Object[1];
                a(i55111, (i55112 ^ 28) + ((i55112 & 28) << 1), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr11113);
                c3 = 0;
                String str517 = (String) objArr11113[0];
                int i55113 = 2036 - (~(-View.resolveSizeAndState(0, 0, 0)));
                int i55114 = -TextUtils.lastIndexOf(str15, '0', 0);
                int i55115 = (i55114 ^ 9) + ((i55114 & 9) << 1);
                int iRgb12 = Color.rgb(0, 0, 0);
                Object[] objArr11114 = new Object[1];
                a(i55113, i55115, (char) ((iRgb12 ^ 16839620) + ((iRgb12 & 16839620) << 1)), objArr11114);
                strArr7 = new String[][]{new String[]{str514, (String) objArr1017[0]}, strArr113, new String[]{str515, (String) objArr11110[0]}, new String[]{str516, (String) objArr11112[0]}, new String[]{str517, (String) objArr11114[0]}};
                i89 = 0;
                i90 = -1;
                loop7: while (true) {
                    if (i89 < 5) {
                        i91 = i72;
                        break;
                    }
                    String[] strArr114 = strArr7[i89];
                    str16 = strArr114[c3];
                    strArr8 = (String[]) Arrays.copyOfRange(strArr114, 1, strArr114.length);
                    length4 = strArr8.length;
                    i97 = 0;
                    while (i97 < length4) {
                        int i55116 = i90 - 116;
                        i90 = (i55116 & 117) + (i55116 | 117);
                        Object[] objArr11115 = {str16, strArr8[i97]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                            char size3 = (char) View.MeasureSpec.getSize(0);
                            int modifierMetaStateMask7 = 2384 - ((byte) KeyEvent.getModifierMetaStateMask());
                            int offsetAfter7 = TextUtils.getOffsetAfter(str15, 0) + 32;
                            byte b414 = (byte) 0;
                            byte b415 = (byte) (b414 + 1);
                            Object[] objArr11116 = new Object[1];
                            c(b414, b415, (byte) (b415 - 1), objArr11116);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(size3, modifierMetaStateMask7, offsetAfter7, -1207062455, false, (String) objArr11116[0], new Class[]{String.class, String.class});
                        }
                        long jLongValue115 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr11115)).longValue();
                        long j812 = 1133421988;
                        i98 = i89;
                        long j813 = j812 ^ j3;
                        long j9110 = (j2 | j812) ^ j3;
                        long j9111 = (((long) 375) * j812) + (((long) (-747)) * jLongValue115) + (((long) (-374)) * (((j813 | jLongValue115) ^ j3) | j9110));
                        long j9112 = jLongValue115 ^ j3;
                        long j9113 = j9111 + (((long) 748) * ((j812 | j9112) ^ j3)) + (((long) 374) * (((j813 | j9112) ^ j3) | j9110)) + ((long) 843621340);
                        int iUptimeMillis6 = (int) SystemClock.uptimeMillis();
                        i99 = ((int) (j9113 >> 32)) & (635876210 + (((~(475706740 | iUptimeMillis6)) | 207271008) * (-502)) + ((~((~iUptimeMillis6) | 2120204159)) * (-502)) + (((~(iUptimeMillis6 | (-1912933152))) | 475706740) * TypedValues.PositionType.TYPE_DRAWPATH));
                        i100 = ((int) j9113) & (1719511565 + ((~((-1337655339) | i72)) * 216) + (((-1242562561) | i178) * (-216)) + (((~((-1337655339) | i178)) | (-99571072)) * 216));
                        if (((i100 & i99) | (i99 ^ i100)) != 0) {
                            int i55117 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            i101 = ((i55117 | 25) << 1) - (i55117 ^ 25);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i101 % 128;
                            if (i101 % 2 != 0) {
                                i91 = ((i90 ^ 170) + ((i90 & 170) << 1)) ^ i72;
                                break loop7;
                            }
                            int i55118 = (i90 ^ 24261) + ((i90 & 24261) << 1);
                            i91 = (i55118 | i72) & (~(i72 & i55118));
                            break loop7;
                        }
                        int i55119 = i97 + 22;
                        i97 = ((i55119 | (-21)) << 1) - (i55119 ^ (-21));
                        strArr8 = strArr8;
                        strArr7 = strArr7;
                        length4 = length4;
                        i89 = i98;
                    }
                    String[][] strArr115 = strArr7;
                    int i56110 = i89;
                    int i56111 = ((i56110 | (-107)) << 1) - (i56110 ^ (-107));
                    i89 = (i56111 ^ 108) + ((i56111 & 108) << 1);
                    strArr7 = strArr115;
                    c3 = 0;
                }
                int i56112 = ((~i76) & i72) | (i76 & i178);
                int i56113 = -i56112;
                int i56114 = ((i56112 & i56113) | (i56112 ^ i56113)) >> 31;
                int i56115 = (i91 & (~i56114)) | (i76 & i56114);
                int scrollBarSize7 = 2086 - (ViewConfiguration.getScrollBarSize() >> 8);
                int i56116 = -ExpandableListView.getPackedPositionGroup(0L);
                int i56117 = ((i56116 | 13) << 1) - (i56116 ^ 13);
                int i56118 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                Object[] objArr11117 = new Object[1];
                a(scrollBarSize7, i56117, (char) ((i56118 ^ 1) + ((i56118 & 1) << 1)), objArr11117);
                String str610 = (String) objArr11117[0];
                int iRgb13 = Color.rgb(0, 0, 0);
                int i56119 = (iRgb13 ^ 16779315) + ((iRgb13 & 16779315) << 1);
                int i57110 = -Gravity.getAbsoluteGravity(0, 0);
                int iLastIndexOf8 = TextUtils.lastIndexOf(str15, '0', 0, 0);
                Object[] objArr11118 = new Object[1];
                a(i56119, (i57110 ^ 8) + ((i57110 & 8) << 1), (char) (((iLastIndexOf8 | 5430) << 1) - (iLastIndexOf8 ^ 5430)), objArr11118);
                Object[] objArr11119 = {str610, (String) objArr11118[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char longPressTimeout5 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iBlue7 = 2385 - Color.blue(0);
                    int modifierMetaStateMask8 = ((byte) KeyEvent.getModifierMetaStateMask()) + 33;
                    byte b416 = (byte) 0;
                    byte b417 = (byte) (b416 + 1);
                    Object[] objArr1210 = new Object[1];
                    c(b416, b417, (byte) (b417 - 1), objArr1210);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(longPressTimeout5, iBlue7, modifierMetaStateMask8, -1207062455, false, (String) objArr1210[0], new Class[]{String.class, String.class});
                }
                long jLongValue116 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr11119)).longValue();
                long j9114 = 637099123;
                long j9115 = (((long) (-665)) * j9114) + (((long) 334) * jLongValue116);
                long j9116 = j9114 ^ j3;
                long j9117 = 333;
                long j9118 = j9115 + (((long) (-333)) * j9116) + ((((j9116 | j2) ^ j3) | ((jLongValue116 | j) ^ j3)) * j9117) + (j9117 * (((j2 | jLongValue116) ^ j3) | ((j9116 | j) ^ j3))) + ((long) 1339944205);
                i95 = ((int) (j9118 >> 32)) & ((-2055567968) + (((~(318146393 | i178)) | 1755372804) * 226) + (((~((-1755372805) | i72)) | 10519808 | (~(2062999389 | i178))) * (-113)) + ((~(318146393 | i72)) * 113));
                int i57111 = (int) j9118;
                int i57112 = ~(Process.myUid() | 1357820570);
                i96 = i57111 & (((159925537 | i57112) * (-658)) + 132491861 + ((i57112 | 151012641) * 658));
                if (((i95 & i96) | (i95 ^ i96)) != 0) {
                    i92 = ~(i72 & 150);
                    i93 = i72 | 150;
                    i94 = i92 & i93;
                } else {
                    i94 = i72;
                }
                int i57113 = (~(i72 & i56115)) & (i72 | i56115);
                int i57114 = -i57113;
                int i57115 = ((i57113 & i57114) | (i57113 ^ i57114)) >> 31;
                int i57116 = (i94 & (~i57115)) | (i56115 & i57115);
                int i57117 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int i57118 = (i57117 & 2108) + (i57117 | 2108);
                int i57119 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                Object[] objArr1211 = new Object[1];
                a(i57118, ((i57119 | 47) << 1) - (i57119 ^ 47), (char) (0 - (~(-(-MotionEvent.axisFromString(str15))))), objArr1211);
                Object[] objArr1212 = {(String) objArr1211[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    char cIndexOf8 = (char) (TextUtils.indexOf((CharSequence) str15, '0', 0, 0) + 1);
                    int iRed6 = 993 - Color.red(0);
                    int doubleTapTimeout7 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8;
                    byte b418 = (byte) 0;
                    byte b419 = b418;
                    Object[] objArr1213 = new Object[1];
                    c(b418, b419, b419, objArr1213);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf8, iRed6, doubleTapTimeout7, 349342683, false, (String) objArr1213[0], new Class[]{String.class});
                }
                long jLongValue117 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr1212)).longValue();
                long j9119 = 503960024;
                long j1014 = 569;
                long j1015 = j9119 ^ j3;
                long j1016 = jLongValue117 ^ j3;
                long j1017 = j1015 | j1016;
                long j1018 = (j1014 * j9119) + (j1014 * jLongValue117) + (((long) (-1136)) * ((j1017 ^ j3) | ((j1015 | j2) ^ j3) | ((j1016 | j2) ^ j3)));
                long j1019 = j2 | j9119;
                long j10110 = j1018 + (((long) (-568)) * (((j1015 | j) ^ j3) | ((j1016 | j) ^ j3) | ((j1019 | jLongValue117) ^ j3))) + (((long) 568) * (((j2 | jLongValue117) ^ j3) | (j1019 ^ j3) | ((j1017 | j) ^ j3))) + ((long) (-1351038629));
                int i58110 = ((int) (j10110 >> 32)) & ((-2072279902) + ((~((-43537027) | i178)) * (-116)) + (((-43537347) | i72) * 116) + (((~((-1480763758) | i72)) | 1480763437) * 116));
                int i58111 = (~((-1287144799) | i72)) | (~(1570596087 | i178));
                int i58112 = ~(1287144798 | i178);
                int i58113 = ((int) j10110) & ((-1669203471) + ((i58111 | i58112) * (-516)) + (((~((-1285047383) | i72)) | (~((-285548706) | i178))) * 516) + ((285548705 | i58112) * 516));
                int i58114 = ((i58110 & i58113) | (i58110 ^ i58113)) * 263;
                int i58115 = i72 ^ i57116;
                int i58116 = -i58115;
                int i58117 = ((i58115 & i58116) | (i58115 ^ i58116)) >> 31;
                int i58118 = ((i58114 & i178) | ((~i58114) & i72)) & (~i58117);
                int i58119 = i57116 & i58117;
                i69 = (i58119 & i58118) | (i58118 ^ i58119);
                strArr4 = strArr6;
            }
            int i5910 = -ExpandableListView.getPackedPositionType(0L);
            Object[] objArr1214 = new Object[1];
            a(((i5910 | 370) << 1) - (i5910 ^ 370), 22 - (~(-TextUtils.getCapsMode(str11, 0, 0))), (char) (ExpandableListView.getPackedPositionChild(0L) + 4996), objArr1214);
            String str611 = (String) objArr1214[0];
            int i5911 = -TextUtils.lastIndexOf(str11, '0', 0, 0);
            int i5912 = ((i5911 | 807) << 1) - (i5911 ^ 807);
            int i5913 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int i5914 = (i5913 ^ 11) + ((i5913 & 11) << 1);
            int i5915 = -TextUtils.lastIndexOf(str11, '0');
            Object[] objArr1215 = new Object[1];
            a(i5912, i5914, (char) ((i5915 ^ (-1)) + (i5915 << 1)), objArr1215);
            String str612 = (String) objArr1215[0];
            int i5916 = 819 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int iMyPid5 = Process.myPid() >> 22;
            Object[] objArr1310 = new Object[1];
            a(i5916, (iMyPid5 ^ 7) + ((iMyPid5 & 7) << 1), (char) TextUtils.getTrimmedLength(str11), objArr1310);
            String str613 = (String) objArr1310[0];
            int i5917 = -(ViewConfiguration.getTouchSlop() >> 8);
            int i5918 = (i5917 ^ 825) + ((i5917 & 825) << 1);
            int scrollDefaultDelay4 = 8 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int i5919 = -(-Drawable.resolveOpacity(0, 0));
            Object[] objArr1311 = new Object[1];
            a(i5918, scrollDefaultDelay4, (char) ((51482 ^ i5919) + ((i5919 & 51482) << 1)), objArr1311);
            String[] strArr116 = {str611, str612, str613, (String) objArr1311[0]};
            int i6010 = -TextUtils.indexOf(str11, str11, 0);
            Object[] objArr1312 = new Object[1];
            a(((i6010 | 833) << 1) - (i6010 ^ 833), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16, (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr1312);
            String str614 = (String) objArr1312[0];
            int i6011 = -(-(Process.myTid() >> 22));
            int i6012 = (i6011 & 850) + (i6011 | 850);
            int i6013 = -(-View.getDefaultSize(0, 0));
            int i6014 = ((i6013 | 7) << 1) - (i6013 ^ 7);
            int i6015 = -View.MeasureSpec.getSize(0);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault16 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i6016 = i6015 * 491;
            int i6017 = ((-18819654) ^ i6016) + ((i6016 & (-18819654)) << 1);
            int i6018 = ~i6015;
            int i6019 = ((-38487) ^ i6018) | (i6018 & (-38487));
            int i6110 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault16;
            int i6111 = -(-(((i6019 ^ i6110) | (i6110 & i6019)) * (-490)));
            char c112 = (char) ((i6017 & i6111) + (i6111 | i6017) + (((~((i6015 & (-38487)) | ((-38487) ^ i6015))) | (~(((-38487) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault16) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault16 & (-38487))))) * 490) + (i6018 * 490));
            Object[] objArr1313 = new Object[1];
            a(i6012, i6014, c112, objArr1313);
            String str615 = (String) objArr1313[0];
            int i6112 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
            Object[] objArr1314 = new Object[1];
            a((i6112 & 857) + (i6112 | 857), 7 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr1314);
            String str616 = (String) objArr1314[0];
            int iNormalizeMetaState3 = KeyEvent.normalizeMetaState(0);
            int i6113 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
            Object[] objArr1315 = new Object[1];
            a((iNormalizeMetaState3 ^ 864) + ((iNormalizeMetaState3 & 864) << 1), (i6113 & 11) + (i6113 | 11), (char) (43342 - (~(-(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))))), objArr1315);
            String str617 = (String) objArr1315[0];
            int i6114 = -(-TextUtils.indexOf(str11, str11, 0, 0));
            int i6115 = (i6114 ^ 875) + ((i6114 & 875) << 1);
            int i6116 = -Drawable.resolveOpacity(0, 0);
            Object[] objArr1316 = new Object[1];
            a(i6115, (i6116 ^ 14) + ((i6116 & 14) << 1), (char) TextUtils.getOffsetAfter(str11, 0), objArr1316);
            String[] strArr117 = {str614, str615, str616, str617, (String) objArr1316[0]};
            int i6117 = 888 - (~(-Color.argb(0, 0, 0, 0)));
            int iRed7 = Color.red(0);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault17 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i6118 = iRed7 * (-721);
            int i6119 = (i6118 ^ (-11536)) + ((i6118 & (-11536)) << 1);
            int i6210 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault17;
            int i6211 = ~iRed7;
            int i6212 = ~((i6211 ^ (-17)) | (i6211 & (-17)));
            int i6213 = (i6210 & i6212) | (i6210 ^ i6212);
            int i6214 = ~((iRed7 ^ 16) | (iRed7 & 16));
            int i6215 = (i6119 - (~(-(-(((i6213 & i6214) | (i6213 ^ i6214)) * 1444))))) - 1;
            int i6216 = (~(iRed7 | 16)) | (~((iRed7 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault17) | (iRed7 & iTuitionPaymentFragmentspecialinlinedviewModeldefault17)));
            int i6217 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault17 & 16) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault17 ^ 16));
            int i6218 = i6215 + (((i6217 & i6216) | (i6216 ^ i6217)) * (-1444));
            int i6219 = ~(i6211 | 16);
            int i6310 = ~((iRed7 & (-17)) | ((-17) ^ iRed7));
            int i6311 = -(-(((i6219 & i6310) | (i6219 ^ i6310)) * 722));
            Object[] objArr1317 = new Object[1];
            a(i6117, (i6218 ^ i6311) + ((i6311 & i6218) << 1), (char) (51868 - (~View.MeasureSpec.getMode(0))), objArr1317);
            String str618 = (String) objArr1317[0];
            int i6312 = -(-Color.green(0));
            int i6313 = ((i6312 | TypedValues.Custom.TYPE_DIMENSION) << 1) - (i6312 ^ TypedValues.Custom.TYPE_DIMENSION);
            int i6314 = -TextUtils.indexOf((CharSequence) str11, '0');
            Object[] objArr1318 = new Object[1];
            a(i6313, (i6314 ^ 2) + ((i6314 & 2) << 1), (char) ((-2) - ((-((byte) KeyEvent.getModifierMetaStateMask())) ^ (-1))), objArr1318);
            String str710 = (String) objArr1318[0];
            Object[] objArr1319 = new Object[1];
            a(915 - (~(-(-(ViewConfiguration.getTouchSlop() >> 8)))), 21 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), (char) View.combineMeasuredStates(0, 0), objArr1319);
            String str711 = (String) objArr1319[0];
            Object[] objArr1410 = new Object[1];
            a(938 - (~(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 24 - (~KeyEvent.getDeadChar(0, 0)), (char) (32344 - (~(-(-(ViewConfiguration.getScrollDefaultDelay() >> 16))))), objArr1410);
            String str712 = (String) objArr1410[0];
            int i6315 = -(-KeyEvent.normalizeMetaState(0));
            Object[] objArr1411 = new Object[1];
            a((i6315 ^ 963) + ((i6315 & 963) << 1), (ViewConfiguration.getEdgeSlop() >> 16) + 28, (char) View.MeasureSpec.getMode(0), objArr1411);
            String[] strArr210 = {str618, str710, str19, str711, str712, (String) objArr1411[0]};
            int i6316 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
            int i6317 = (i6316 ^ 991) + ((i6316 & 991) << 1);
            int i6318 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            Object[] objArr1412 = new Object[1];
            a(i6317, ((i6318 | 10) << 1) - (i6318 ^ 10), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr1412);
            String str713 = (String) objArr1412[0];
            int i6319 = -(-ExpandableListView.getPackedPositionType(0L));
            int i6410 = (i6319 ^ 1002) + ((i6319 & 1002) << 1);
            int i6411 = 7 - (~(ViewConfiguration.getWindowTouchSlop() >> 8));
            int i6412 = -AndroidCharacter.getMirror('0');
            Object[] objArr1413 = new Object[1];
            a(i6410, i6411, (char) ((64735 & i6412) + (i6412 | 64735)), objArr1413);
            String str714 = (String) objArr1413[0];
            int i6413 = -(ViewConfiguration.getTapTimeout() >> 16);
            int i6414 = i6413 * TypedValues.PositionType.TYPE_PERCENT_WIDTH;
            int i6415 = (508030 & i6414) + (i6414 | 508030);
            int i6416 = (i6413 ^ PointerIconCompat.TYPE_ALIAS) | (i6413 & PointerIconCompat.TYPE_ALIAS);
            int i6417 = i6415 + (i6416 * (-502));
            int i6418 = ~i6413;
            int i6419 = ~((i6418 & (-1011)) | (i6418 ^ (-1011)));
            int i6510 = ~(i6418 | i178);
            int i6511 = (i6419 & i6510) | (i6419 ^ i6510);
            int i6512 = ~(i6416 | i67);
            int i6513 = -(-(((i6511 & i6512) | (i6511 ^ i6512)) * (-502)));
            int i6514 = ((i6417 | i6513) << 1) - (i6513 ^ i6417);
            int i6515 = (~i6413) | i178;
            int i6516 = -(-(((~((i6515 & PointerIconCompat.TYPE_ALIAS) | (i6515 ^ PointerIconCompat.TYPE_ALIAS))) | (~((i6416 ^ i67) | (i6416 & i67)))) * TypedValues.PositionType.TYPE_DRAWPATH));
            int i6517 = (i6514 ^ i6516) + ((i6516 & i6514) << 1);
            int i6518 = -(-TextUtils.getCapsMode(str11, 0, 0));
            Object[] objArr1414 = new Object[1];
            a(i6517, (i6518 ^ 6) + ((i6518 & 6) << 1), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 58397), objArr1414);
            String str715 = (String) objArr1414[0];
            int i6519 = -(-View.resolveSizeAndState(0, 0, 0));
            int i6610 = (i6519 ^ PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW) + ((i6519 & PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW) << 1);
            int i6611 = -ExpandableListView.getPackedPositionType(0L);
            Object[] objArr1415 = new Object[1];
            a(i6610, (i6611 ^ 6) + ((i6611 & 6) << 1), (char) (ExpandableListView.getPackedPositionGroup(0L) + 61094), objArr1415);
            String[] strArr211 = {str713, str714, str715, (String) objArr1415[0]};
            int i6612 = -(-KeyEvent.getDeadChar(0, 0));
            Object[] objArr1416 = new Object[1];
            a(((i6612 | 1022) << 1) - (i6612 ^ 1022), 15 - (~(-(-TextUtils.getOffsetBefore(str11, 0)))), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 30599), objArr1416);
            String str716 = (String) objArr1416[0];
            int i6613 = -Color.green(0);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault18 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i6614 = ~i6613;
            int i6615 = ~((i6614 ^ 857) | (i6614 & 857));
            int i6616 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault18;
            int i6617 = ~((i6616 & 857) | (i6616 ^ 857));
            int i6618 = ((i6613 * 595) - 1017259) + (((i6617 & i6615) | (i6615 ^ i6617)) * (-1188));
            int i6619 = ~(i6614 | 857);
            int i6710 = ~((-858) | iTuitionPaymentFragmentspecialinlinedviewModeldefault18);
            int i6711 = (i6619 & i6710) | (i6619 ^ i6710);
            int i6712 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault18;
            int i6713 = ~((i6712 & i6613) | (i6712 ^ i6613));
            int i6714 = (i6618 - (~(-(-(((i6711 & i6713) | (i6711 ^ i6713)) * 594))))) - 1;
            int i6715 = ~(((-858) ^ i6616) | ((-858) & i6616));
            int i6716 = ~((-858) | i6613);
            int i6717 = (i6715 & i6716) | (i6715 ^ i6716);
            int i6718 = ~((i6613 & i6616) | (i6616 ^ i6613));
            int i6719 = -(-(((i6718 & i6717) | (i6717 ^ i6718)) * 594));
            Object[] objArr1417 = new Object[1];
            a((i6714 ^ i6719) + ((i6719 & i6714) << 1), 6 - TextUtils.indexOf((CharSequence) str11, '0', 0, 0), (char) ExpandableListView.getPackedPositionType(0L), objArr1417);
            String str717 = (String) objArr1417[0];
            Object[] objArr1418 = new Object[1];
            a(16778040 - (~(-(-Color.rgb(0, 0, 0)))), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9, (char) (51481 - (~(-(-Color.blue(0))))), objArr1418);
            String[] strArr212 = {str716, str717, (String) objArr1418[0]};
            int i6810 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
            int i6811 = ((i6810 | 1038) << 1) - (i6810 ^ 1038);
            int i6812 = -(-TextUtils.indexOf(str11, str11));
            int i6813 = ((i6812 | 14) << 1) - (i6812 ^ 14);
            int i6814 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
            Object[] objArr1419 = new Object[1];
            a(i6811, i6813, (char) ((i6814 ^ 19413) + ((i6814 & 19413) << 1)), objArr1419);
            String str718 = (String) objArr1419[0];
            int i6815 = -Color.green(0);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault19 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i6816 = ~i6815;
            int i6817 = ~((i6816 & (-1053)) | (i6816 ^ (-1053)));
            int i6818 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault19;
            int i6819 = ~(i6818 | i6815 | 1052);
            int i6910 = (i6815 * 829) + 872108 + (((i6817 & i6819) | (i6817 ^ i6819)) * (-828));
            int i6911 = -(-((i6818 | i6815 | 1052) * (-828)));
            int i6912 = (i6910 ^ i6911) + ((i6911 & i6910) << 1) + ((~((i6815 & 1052) | (i6815 ^ 1052))) * 828);
            int i6913 = -ExpandableListView.getPackedPositionType(0L);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault110 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i6914 = i6913 * 465;
            int i6915 = (i6914 ^ (-463)) + ((i6914 & (-463)) << 1);
            int i6916 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault110;
            int i6917 = (~((-2) | i6916)) | (~((-2) | i6913));
            int i6918 = ~((i6916 & i6913) | (i6916 ^ i6913));
            int i6919 = ((i6918 & i6917) | (i6917 ^ i6918)) * 464;
            int i7010 = ((i6915 | i6919) << 1) - (i6919 ^ i6915);
            int i7011 = ~i6913;
            int i7012 = (i7011 & iTuitionPaymentFragmentspecialinlinedviewModeldefault110) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault110 ^ i7011);
            int i7013 = -(-(((i7012 & (-2)) | (i7012 ^ (-2))) * (-464)));
            int i7014 = (i7010 ^ i7013) + ((i7013 & i7010) << 1);
            int i7015 = ~(((-2) ^ i6913) | ((-2) & i6913));
            int i7016 = ~((i6913 & iTuitionPaymentFragmentspecialinlinedviewModeldefault110) | (i6913 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault110));
            int i7017 = (i7014 - (~(((i7016 & i7015) | (i7015 ^ i7016)) * 464))) - 1;
            int iMyTid3 = Process.myTid() >> 22;
            Object[] objArr1510 = new Object[1];
            a(i6912, i7017, (char) ((54582 ^ iMyTid3) + ((iMyTid3 & 54582) << 1)), objArr1510);
            String[] strArr213 = {str718, (String) objArr1510[0]};
            int i7018 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
            int i7019 = (i7018 & 1053) + (i7018 | 1053);
            int i7110 = -ExpandableListView.getPackedPositionGroup(0L);
            int i7111 = (i7110 ^ 9) + ((i7110 & 9) << 1);
            int i7112 = -(ViewConfiguration.getTouchSlop() >> 8);
            Object[] objArr1511 = new Object[1];
            a(i7019, i7111, (char) ((46742 ^ i7112) + ((i7112 & 46742) << 1)), objArr1511);
            String str719 = (String) objArr1511[0];
            int i7113 = -Color.alpha(0);
            int i7114 = ((i7113 | 1062) << 1) - (i7113 ^ 1062);
            int i7115 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int i7116 = -TextUtils.indexOf(str11, str11, 0, 0);
            Object[] objArr1512 = new Object[1];
            a(i7114, (i7115 & 1) + (i7115 | 1), (char) ((34977 & i7116) + (i7116 | 34977)), objArr1512);
            String[] strArr214 = {str719, (String) objArr1512[0]};
            int i7117 = -(ViewConfiguration.getEdgeSlop() >> 16);
            int iMakeMeasureSpec4 = 16 - View.MeasureSpec.makeMeasureSpec(0, 0);
            int i7118 = -View.MeasureSpec.getSize(0);
            Object[] objArr1513 = new Object[1];
            a(((i7117 | 1063) << 1) - (i7117 ^ 1063), iMakeMeasureSpec4, (char) ((i7118 & 32709) + (i7118 | 32709)), objArr1513);
            String str810 = (String) objArr1513[0];
            int i7119 = -TextUtils.getOffsetAfter(str11, 0);
            Object[] objArr1514 = new Object[1];
            a((i7119 ^ TypedValues.Custom.TYPE_DIMENSION) + ((i7119 & TypedValues.Custom.TYPE_DIMENSION) << 1), 2 - TextUtils.indexOf((CharSequence) str11, '0', 0, 0), (char) ((-2) - ((-TextUtils.indexOf((CharSequence) str11, '0', 0)) ^ (-1))), objArr1514);
            String str811 = (String) objArr1514[0];
            int i7210 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
            int i7211 = i7210 * 628;
            int i7212 = ((533800 | i7211) << 1) - (i7211 ^ 533800);
            int i7213 = i67 | 850;
            int i7214 = ~i7210;
            int i7215 = -(-(((i7213 & i7214) | (i7213 ^ i7214)) * (-627)));
            int i7216 = (((i7212 | i7215) << 1) - (i7215 ^ i7212)) + (((~(((-851) ^ i67) | ((-851) & i67))) | i7210) * (-627));
            int i7217 = ((~((i7210 & i67) | (i7210 ^ i67))) | (~(i178 | 850))) * 627;
            int i7218 = ((i7216 | i7217) << 1) - (i7217 ^ i7216);
            int maximumDrawingCacheSize7 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
            int i7219 = (maximumDrawingCacheSize7 ^ 7) + ((maximumDrawingCacheSize7 & 7) << 1);
            int i7310 = -(-KeyEvent.normalizeMetaState(0));
            Object[] objArr1515 = new Object[1];
            a(i7218, i7219, (char) ((38486 ^ i7310) + ((i7310 & 38486) << 1)), objArr1515);
            String str812 = (String) objArr1515[0];
            int i7311 = 1078 - (~(-(-(ViewConfiguration.getScrollBarFadeDuration() >> 16))));
            int windowTouchSlop6 = ViewConfiguration.getWindowTouchSlop() >> 8;
            int i7312 = -(-TextUtils.indexOf((CharSequence) str11, '0', 0, 0));
            Object[] objArr1516 = new Object[1];
            a(i7311, ((windowTouchSlop6 | 8) << 1) - (windowTouchSlop6 ^ 8), (char) (((i7312 | 1) << 1) - (i7312 ^ 1)), objArr1516);
            String str813 = (String) objArr1516[0];
            int iResolveSizeAndState5 = View.resolveSizeAndState(0, 0, 0) + 864;
            int trimmedLength2 = TextUtils.getTrimmedLength(str11);
            int i7313 = (trimmedLength2 ^ 11) + ((trimmedLength2 & 11) << 1);
            int iArgb2 = Color.argb(0, 0, 0, 0);
            Object[] objArr1517 = new Object[1];
            a(iResolveSizeAndState5, i7313, (char) ((iArgb2 ^ 43344) + ((iArgb2 & 43344) << 1)), objArr1517);
            String str814 = (String) objArr1517[0];
            int i7314 = -KeyEvent.normalizeMetaState(0);
            Object[] objArr1518 = new Object[1];
            a(((i7314 | 875) << 1) - (i7314 ^ 875), 14 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) View.combineMeasuredStates(0, 0), objArr1518);
            String[] strArr215 = {str810, str811, str812, str813, str814, (String) objArr1518[0]};
            int i7315 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
            Object[] objArr1519 = new Object[1];
            a((i7315 ^ 1087) + ((i7315 & 1087) << 1), 19 - (~(-View.resolveSizeAndState(0, 0, 0))), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr1519);
            String str815 = (String) objArr1519[0];
            int i7316 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i7317 = (i7316 ^ 1107) + ((i7316 & 1107) << 1);
            int i7318 = -(-TextUtils.getOffsetBefore(str11, 0));
            Object[] objArr1610 = new Object[1];
            a(i7317, (i7318 ^ 19) + ((i7318 & 19) << 1), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr1610);
            String str816 = (String) objArr1610[0];
            int i7319 = -AndroidCharacter.getMirror('0');
            Object[] objArr1611 = new Object[1];
            a((i7319 ^ 1174) + ((i7319 & 1174) << 1), 29 - (~(-TextUtils.indexOf((CharSequence) str11, '0', 0, 0))), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 50472), objArr1611);
            String str817 = (String) objArr1611[0];
            int i7410 = -KeyEvent.keyCodeFromString(str11);
            int i7411 = -TextUtils.getOffsetBefore(str11, 0);
            Object[] objArr1612 = new Object[1];
            a((i7410 & 1157) + (i7410 | 1157), (i7411 ^ 26) + ((i7411 & 26) << 1), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr1612);
            String str818 = (String) objArr1612[0];
            Object[] objArr1613 = new Object[1];
            a(1181 - (~(-TextUtils.lastIndexOf(str11, '0', 0))), 21 - (~(-TextUtils.indexOf((CharSequence) str11, '0', 0))), (char) KeyEvent.getDeadChar(0, 0), objArr1613);
            String str819 = (String) objArr1613[0];
            int i7412 = -KeyEvent.getDeadChar(0, 0);
            int i7413 = ((i7412 | 1206) << 1) - (i7412 ^ 1206);
            int i7414 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int i7415 = (i7414 & 32) + (i7414 | 32);
            int i7416 = -ExpandableListView.getPackedPositionType(0L);
            Object[] objArr1614 = new Object[1];
            a(i7413, i7415, (char) ((i7416 ^ 14605) + ((i7416 & 14605) << 1)), objArr1614);
            String[] strArr216 = {str815, str816, str817, str818, str819, (String) objArr1614[0], str19};
            int i7417 = 1239 - (~TextUtils.indexOf((CharSequence) str11, '0', 0, 0));
            int i7418 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            Object[] objArr1615 = new Object[1];
            a(i7417, (i7418 ^ 13) + ((i7418 & 13) << 1), (char) KeyEvent.normalizeMetaState(0), objArr1615);
            String str94 = (String) objArr1615[0];
            int iResolveSize3 = 818 - View.resolveSize(0, 0);
            int keyRepeatTimeout9 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
            Object[] objArr1616 = new Object[1];
            a(iResolveSize3, (keyRepeatTimeout9 ^ 7) + ((keyRepeatTimeout9 & 7) << 1), (char) TextUtils.indexOf(str11, str11, 0), objArr1616);
            String[] strArr217 = {str94, (String) objArr1616[0]};
            int i7419 = -View.combineMeasuredStates(0, 0);
            int i7510 = (i7419 ^ 1252) + ((i7419 & 1252) << 1);
            int i7511 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            Object[] objArr1617 = new Object[1];
            a(i7510, ((i7511 | 31) << 1) - (i7511 ^ 31), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 19034), objArr1617);
            String str95 = (String) objArr1617[0];
            int i7512 = -ExpandableListView.getPackedPositionChild(0L);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault111 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i7513 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault111;
            int i7514 = ~((i7513 & (-1282)) | ((-1282) ^ i7513));
            int i7515 = ~((-1282) | i7512);
            int i7516 = ((((i7512 * (-244)) + 315126) + (((i7514 & i7515) | (i7514 ^ i7515)) * (-245))) - (~(-(-((~(((-1282) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault111) | ((-1282) & iTuitionPaymentFragmentspecialinlinedviewModeldefault111))) * (-245)))))) - 1;
            int i7517 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault111 | (-1282));
            int i7518 = ((i7512 & i7517) | (i7512 ^ i7517)) * 245;
            int i7519 = (i7516 ^ i7518) + ((i7518 & i7516) << 1);
            int i7610 = -(-TextUtils.indexOf(str11, str11, 0));
            int i7611 = (i7610 ^ 11) + ((i7610 & 11) << 1);
            int i7612 = -(-TextUtils.lastIndexOf(str11, '0'));
            Object[] objArr1618 = new Object[1];
            a(i7519, i7611, (char) ((i7612 & 16159) + (i7612 | 16159)), objArr1618);
            String[] strArr218 = {str95, (String) objArr1618[0]};
            int packedPositionType4 = 1293 - ExpandableListView.getPackedPositionType(0L);
            int i7613 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
            int i7614 = ((i7613 | 19) << 1) - (i7613 ^ 19);
            int i7615 = -(-(ViewConfiguration.getMaximumFlingVelocity() >> 16));
            Object[] objArr1619 = new Object[1];
            a(packedPositionType4, i7614, (char) ((39426 & i7615) + (i7615 | 39426)), objArr1619);
            String str96 = (String) objArr1619[0];
            int i7616 = -View.MeasureSpec.getSize(0);
            int i7617 = (i7616 & 1312) + (i7616 | 1312);
            int i7618 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            Object[] objArr1710 = new Object[1];
            a(i7617, ((i7618 | 6) << 1) - (i7618 ^ 6), (char) (54225 - ImageFormat.getBitsPerPixel(0)), objArr1710);
            String[] strArr219 = {str96, (String) objArr1710[0]};
            int pressedStateDuration4 = (ViewConfiguration.getPressedStateDuration() >> 16) + 1317;
            int i7619 = -Color.green(0);
            int i7710 = (i7619 & 19) + (i7619 | 19);
            int i7711 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            Object[] objArr1711 = new Object[1];
            a(pressedStateDuration4, i7710, (char) ((i7711 & 23413) + (i7711 | 23413)), objArr1711);
            String[] strArr310 = {(String) objArr1711[0]};
            int iCombineMeasuredStates4 = View.combineMeasuredStates(0, 0);
            int i7712 = (iCombineMeasuredStates4 ^ 1336) + ((iCombineMeasuredStates4 & 1336) << 1);
            int i7713 = -MotionEvent.axisFromString(str11);
            int i7714 = (i7713 ^ 15) + ((i7713 & 15) << 1);
            int i7715 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
            Object[] objArr1712 = new Object[1];
            a(i7712, i7714, (char) (((i7715 | 3279) << 1) - (i7715 ^ 3279)), objArr1712);
            String[] strArr311 = {(String) objArr1712[0]};
            int i7716 = 1351 - (~(-View.resolveSizeAndState(0, 0, 0)));
            int keyRepeatTimeout10 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
            int i7717 = (keyRepeatTimeout10 ^ 19) + ((keyRepeatTimeout10 & 19) << 1);
            int i7718 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            Object[] objArr1713 = new Object[1];
            a(i7716, i7717, (char) (((i7718 | 11193) << 1) - (i7718 ^ 11193)), objArr1713);
            String[] strArr312 = {(String) objArr1713[0]};
            int i7719 = -Process.getGidForName(str11);
            int i7810 = (i7719 & 1370) + (i7719 | 1370);
            int scrollDefaultDelay5 = ViewConfiguration.getScrollDefaultDelay() >> 16;
            int i7811 = (scrollDefaultDelay5 * TypedValues.Custom.TYPE_DIMENSION) - 17157;
            int i7812 = ~scrollDefaultDelay5;
            int i7813 = i7811 + (((~((i7812 & i67) | (i7812 ^ i67))) | (~((i178 ^ 19) | (i178 & 19)))) * (-1808));
            int i7814 = ~scrollDefaultDelay5;
            int i7815 = (i7814 ^ (-20)) | (i7814 & (-20));
            int i7816 = (scrollDefaultDelay5 & i178) | (i178 ^ scrollDefaultDelay5);
            int i7817 = -(-(((~((i7815 & i67) | (i7815 ^ i67))) | (~((i7816 ^ 19) | (i7816 & 19)))) * TypedValues.Custom.TYPE_BOOLEAN));
            int i7818 = ((i7813 | i7817) << 1) - (i7813 ^ i7817);
            int i7819 = ~((i7814 ^ 19) | (i7814 & 19));
            int i7910 = ~(((-20) ^ i67) | ((-20) & i67));
            int i7911 = (i7819 & i7910) | (i7819 ^ i7910);
            int i7912 = ~i7816;
            int i7913 = -(-(((i7912 & i7911) | (i7911 ^ i7912)) * TypedValues.Custom.TYPE_BOOLEAN));
            Object[] objArr1714 = new Object[1];
            a(i7810, (i7818 ^ i7913) + ((i7913 & i7818) << 1), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14834), objArr1714);
            String[] strArr313 = {(String) objArr1714[0]};
            int i7914 = -Drawable.resolveOpacity(0, 0);
            int i7915 = (i7914 & 1390) + (i7914 | 1390);
            int i7916 = -(ViewConfiguration.getTouchSlop() >> 8);
            Object[] objArr1715 = new Object[1];
            a(i7915, (i7916 ^ 23) + ((i7916 & 23) << 1), (char) (63421 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr1715);
            String[] strArr314 = {(String) objArr1715[0]};
            int jumpTapTimeout5 = ViewConfiguration.getJumpTapTimeout() >> 16;
            int i7917 = (jumpTapTimeout5 ^ 1413) + ((jumpTapTimeout5 & 1413) << 1);
            int i7918 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
            int i7919 = (i7918 & 21) + (i7918 | 21);
            int i8010 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault112 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i8011 = (i8010 * (-129)) - (-1629116);
            int i8012 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault112;
            int i8013 = (i8012 & (-12437)) | ((-12437) ^ i8012);
            int i8014 = -(-((~((i8013 & i8010) | (i8013 ^ i8010))) * 130));
            int i8015 = (((i8011 | i8014) << 1) - (i8011 ^ i8014)) + ((~(((-12437) ^ i8010) | ((-12437) & i8010))) * (-260));
            int i8016 = ~i8010;
            int i8017 = i8010 | (-12437);
            char c113 = (char) (i8015 + (((~((i8017 & iTuitionPaymentFragmentspecialinlinedviewModeldefault112) | (i8017 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault112))) | (~((i8016 & 12436) | (i8016 ^ 12436)))) * 130));
            Object[] objArr1716 = new Object[1];
            a(i7917, i7919, c113, objArr1716);
            String[] strArr315 = {(String) objArr1716[0]};
            Object[] objArr1717 = new Object[1];
            a(1433 - (~KeyEvent.getDeadChar(0, 0)), 24 - TextUtils.indexOf(str11, str11, 0, 0), (char) TextUtils.getOffsetAfter(str11, 0), objArr1717);
            String[] strArr316 = {(String) objArr1717[0], str19};
            int iIndexOf112 = TextUtils.indexOf(str11, str11, 0, 0);
            int i8018 = ((iIndexOf112 | 1458) << 1) - (iIndexOf112 ^ 1458);
            int i8019 = -(-View.MeasureSpec.getMode(0));
            Object[] objArr1718 = new Object[1];
            a(i8018, (i8019 ^ 28) + ((i8019 & 28) << 1), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr1718);
            String[] strArr317 = {(String) objArr1718[0], str19};
            int i8110 = 1485 - (~TextUtils.getOffsetBefore(str11, 0));
            int i8111 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int i8112 = (i8111 ^ 28) + ((i8111 & 28) << 1);
            int i8113 = -AndroidCharacter.getMirror('0');
            Object[] objArr1719 = new Object[1];
            a(i8110, i8112, (char) ((i8113 & 284) + (i8113 | 284)), objArr1719);
            String[] strArr318 = {(String) objArr1719[0], str19};
            int i8114 = -Color.red(0);
            int i8115 = (i8114 ^ 1513) + ((i8114 & 1513) << 1);
            int i8116 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            Object[] objArr1810 = new Object[1];
            a(i8115, ((i8116 | 30) << 1) - (i8116 ^ 30), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr1810);
            String[] strArr319 = {(String) objArr1810[0], str19};
            int i8117 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i8118 = ((i8117 | 1544) << 1) - (i8117 ^ 1544);
            int i8119 = -(Process.myPid() >> 22);
            Object[] objArr1811 = new Object[1];
            a(i8118, (i8119 ^ 27) + ((i8119 & 27) << 1), (char) TextUtils.indexOf(str11, str11), objArr1811);
            c = 0;
            String[] strArr44 = {(String) objArr1811[0], str19};
            int iRgb14 = Color.rgb(0, 0, 0);
            int i8210 = (16778787 & iRgb14) + (iRgb14 | 16778787);
            int iGreen2 = Color.green(0);
            Object[] objArr1812 = new Object[1];
            a(i8210, (iGreen2 ^ 32) + ((iGreen2 & 32) << 1), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr1812);
            strArr5 = new String[][]{strArr116, strArr117, strArr210, strArr211, strArr212, strArr213, strArr214, strArr215, strArr216, strArr217, strArr218, strArr219, strArr310, strArr311, strArr312, strArr313, strArr314, strArr315, strArr316, strArr317, strArr318, strArr319, strArr44, new String[]{(String) objArr1812[0], str19}};
            int i8211 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i8212 = ((i8211 | 1603) << 1) - (i8211 ^ 1603);
            int offsetAfter8 = 1 - TextUtils.getOffsetAfter(str11, 0);
            int offsetBefore7 = TextUtils.getOffsetBefore(str11, 0);
            Object[] objArr1813 = new Object[1];
            a(i8212, offsetAfter8, (char) ((offsetBefore7 & 3306) + (offsetBefore7 | 3306)), objArr1813);
            sb = new StringBuilder((String) objArr1813[0]);
            i77 = 0;
            i78 = 0;
            i79 = i67;
            while (i77 < 24) {
                TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                String[] strArr45 = strArr5[i77];
                Object[] objArr1814 = {strArr45[c]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char packedPositionChild6 = (char) (ExpandableListView.getPackedPositionChild(0L) + 33603);
                    int iKeyCodeFromString3 = 3085 - KeyEvent.keyCodeFromString(str11);
                    int jumpTapTimeout6 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 26;
                    byte b54 = (byte) 0;
                    byte b55 = (byte) (b54 + 1);
                    Object[] objArr1815 = new Object[1];
                    c(b54, b55, (byte) (b55 - 1), objArr1815);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionChild6, iKeyCodeFromString3, jumpTapTimeout6, 1411172903, false, (String) objArr1815[0], new Class[]{String.class});
                }
                str13 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr1814);
                String[] strArr46 = (String[]) Arrays.copyOfRange(strArr45, 1, strArr45.length);
                if (str13 != null) {
                    i79 = i79;
                } else {
                    i79 = i79;
                }
                i77++;
                str11 = str11;
                strArr5 = strArr5;
                c = 0;
            }
            String str97 = str11;
            i80 = i79;
            int i8310 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            int i8311 = (i8310 & 1607) + (i8310 | 1607);
            int i8312 = -Process.getGidForName(str97);
            int i8313 = -(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            Object[] objArr192 = new Object[1];
            a(i8311, i8312, (char) (((i8313 | 64725) << 1) - (i8313 ^ 64725)), objArr192);
            sb.append((String) objArr192[0]);
            objArr2 = new Object[2];
            if (i78 > 2) {
                objArr2[0] = new int[1];
                String[] strArr47 = {sb.toString()};
                ((int[]) objArr2[0])[0] = i80;
                objArr2[1] = strArr47;
            } else {
                objArr2[0] = new int[]{i67};
                objArr2[1] = new String[0];
            }
            int i8410 = i67 ^ i76;
            i81 = (i8410 | (-i8410)) >> 31;
            i82 = ((int[]) objArr2[0])[0] & (~i81);
            int i8411 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            i83 = (i8411 & 121) + (i8411 | 121);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i83 % 128;
            if (i83 % 2 != 0) {
                int i8412 = i76 & i81;
                i84 = (i8412 & i82) | (i82 ^ i8412);
                obj = objArr2[1];
            } else {
                int i8413 = i76 & i81;
                i84 = (i8413 & i82) | (i82 ^ i8413);
                obj = objArr2[1];
            }
            strArr6 = (String[]) obj;
            i76 = i84;
            str12 = str97;
            iIndexOf = TextUtils.indexOf(str12, str12, 0);
            int i40114 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            i85 = (i40114 & 107) + (i40114 | 107);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i85 % 128;
            if (i85 % 2 == 0) {
                i87 = 889 / iIndexOf;
                iNormalizeMetaState = KeyEvent.normalizeMetaState(0) * 120;
                i86 = 1;
            } else {
                int i40115 = -(-iIndexOf);
                i86 = 1;
                i87 = ((i40115 | 889) << 1) - (889 ^ i40115);
                int i40116 = -(-KeyEvent.normalizeMetaState(0));
                iNormalizeMetaState = ((i40116 & 16) << 1) + (i40116 ^ 16);
            }
            int i40117 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
            Object[] objArr7115 = new Object[i86];
            a(i87, iNormalizeMetaState, (char) (((51869 | i40117) << i86) - (i40117 ^ 51869)), objArr7115);
            Object[] objArr7116 = {(String) objArr7115[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char offsetBefore8 = (char) (33602 - TextUtils.getOffsetBefore(str12, 0));
                int fadingEdgeLength11 = 3085 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int iLastIndexOf9 = TextUtils.lastIndexOf(str12, '0', 0) + 27;
                byte b3112 = (byte) 0;
                byte b3113 = (byte) (b3112 + 1);
                Object[] objArr7117 = new Object[1];
                c(b3112, b3113, (byte) (b3113 - 1), objArr7117);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(offsetBefore8, fadingEdgeLength11, iLastIndexOf9, 1411172903, false, (String) objArr7117[0], new Class[]{String.class});
            }
            objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr7116);
            if (objInvoke2 == null) {
                i72 = i67;
                i88 = 0;
            } else {
                Object[] objArr7118 = {objInvoke2, 42};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char c114 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int windowTouchSlop7 = 3393 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int packedPositionGroup8 = ExpandableListView.getPackedPositionGroup(0L) + 9;
                    byte b3114 = (byte) 0;
                    byte b3115 = (byte) (b3114 + 1);
                    Object[] objArr7119 = new Object[1];
                    c(b3114, b3115, (byte) (b3115 - 1), objArr7119);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c114, windowTouchSlop7, packedPositionGroup8, 1203525406, false, (String) objArr7119[0], new Class[]{String.class, Integer.TYPE});
                }
                long jLongValue118 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr7118)).longValue();
                long j7113 = 159255616;
                long j7114 = 46;
                long j7115 = jLongValue118 ^ j25;
                long jNextInt7 = new Random().nextInt();
                long j7116 = jNextInt7 ^ j25;
                long j7117 = (j7114 * j7113) + (j7114 * jLongValue118) + (((long) (-90)) * (j7113 | ((j7115 | j7116) ^ j25))) + (((long) (-45)) * (((j7115 | jNextInt7) ^ j25) | ((jLongValue118 | j7113) ^ j25))) + (((long) 45) * (j7115 | ((jNextInt7 | (j7113 ^ j25)) ^ j25) | ((j7116 | j7113) ^ j25))) + ((long) (-161325493));
                i72 = i;
                int i4116 = ((int) (j7117 >> 32)) & (1522584826 + (((~(1135418171 | i178)) | (-1722322714)) * (-602)) + (((~(1135418171 | i72)) | (-1739431740) | (~((-1118309146) | i178))) * (-301)) + ((~(i178 | (-1722322714))) * 301));
                int i4117 = ~((int) SystemClock.uptimeMillis());
                int i4118 = ((int) j7117) & ((((~((-1349774508) | i4117)) | 1348578474) * (-241)) + 1689859423 + (((~(i4117 | (-1196034))) | 159387904) * 241));
                i88 = (i4118 & i4116) | (i4116 ^ i4118);
            }
            if (i88 != 1986687685) {
                str14 = str12;
                j3 = j25;
                strArr6 = strArr6;
            } else {
                str14 = str12;
                j3 = j25;
                strArr6 = strArr6;
            }
            str15 = str14;
            int i51114 = 1949 - (~TextUtils.getOffsetAfter(str15, 0));
            int iAxisFromString5 = MotionEvent.axisFromString(str15);
            int i51115 = (iAxisFromString5 & 14) + (iAxisFromString5 | 14);
            int iIndexOf113 = TextUtils.indexOf((CharSequence) str15, '0', 0, 0);
            char c115 = (char) ((iIndexOf113 ^ 1) + ((iIndexOf113 & 1) << 1));
            Object[] objArr10112 = new Object[1];
            a(i51114, i51115, c115, objArr10112);
            String str518 = (String) objArr10112[0];
            int i51116 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int iIndexOf114 = TextUtils.indexOf((CharSequence) str15, '0', 0);
            Object[] objArr10113 = new Object[1];
            a((i51116 ^ 1964) + ((i51116 & 1964) << 1), (iIndexOf114 ^ 6) + ((iIndexOf114 & 6) << 1), (char) View.resolveSize(0, 0), objArr10113);
            int i51117 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
            Object[] objArr10114 = new Object[1];
            a((i51117 & 1968) + (i51117 | 1968), 14 - (~(-(ViewConfiguration.getEdgeSlop() >> 16))), (char) ((-2) - ((-ExpandableListView.getPackedPositionChild(0L)) ^ (-1))), objArr10114);
            int i51118 = -(ViewConfiguration.getLongPressTimeout() >> 16);
            int i51119 = (i51118 & 1983) + (i51118 | 1983);
            TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int iBlue8 = Color.blue(0);
            int i511110 = iBlue8 * (-958);
            int i521110 = ((i511110 | (-18202)) << 1) - (i511110 ^ (-18202));
            int i521111 = ~(((-20) ^ i178) | ((-20) & i178));
            int i521112 = ~iBlue8;
            int i521113 = ~((i521112 ^ i72) | (i521112 & i72));
            int i521114 = (i521111 & i521113) | (i521111 ^ i521113);
            int i521115 = ~((i174 ^ iBlue8) | (i174 & iBlue8));
            int i521116 = ((i521114 & i521115) | (i521114 ^ i521115)) * 959;
            int i521117 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i521118 = (i521117 ^ 95) + ((i521117 & 95) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i521118 % 128;
            int i521119 = i521118 % 2;
            int i531110 = -(-i521116);
            int i531111 = (i521110 & i531110) + (i521110 | i531110);
            int i531112 = (~((iBlue8 ^ 19) | (iBlue8 & 19))) * (-959);
            int i531113 = (i531111 ^ i531112) + ((i531112 & i531111) << 1);
            int i531114 = ~((i521112 ^ i178) | (i521112 & i178));
            int i531115 = ~(((-20) & i72) | ((-20) ^ i72));
            int i531116 = (i531115 & i531114) | (i531114 ^ i531115);
            int i531117 = ~((iBlue8 & i72) | (iBlue8 ^ i72));
            Object[] objArr10115 = new Object[1];
            a(i51119, i531113 + (((i531116 & i531117) | (i531116 ^ i531117)) * 959), (char) (52828 - (~(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))))), objArr10115);
            int iRgb15 = Color.rgb(0, 0, 0);
            int i531118 = ((iRgb15 | 16779218) << 1) - (16779218 ^ iRgb15);
            int i531119 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
            int i541110 = (i531119 ^ 14) + ((i531119 & 14) << 1);
            int i541111 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            Object[] objArr10116 = new Object[1];
            a(i531118, i541110, (char) ((i541111 & 52591) + (i541111 | 52591)), objArr10116);
            String[] strArr118 = {(String) objArr10114[0], (String) objArr10115[0], (String) objArr10116[0]};
            int mode12 = View.MeasureSpec.getMode(0) + 2016;
            int i541112 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            Object[] objArr10117 = new Object[1];
            a(mode12, (i541112 & 20) + (i541112 | 20), (char) TextUtils.getOffsetAfter(str15, 0), objArr10117);
            String str519 = (String) objArr10117[0];
            int i541113 = -MotionEvent.axisFromString(str15);
            int i541114 = (i541113 & 2036) + (i541113 | 2036);
            int i541115 = -(ViewConfiguration.getEdgeSlop() >> 16);
            int i541116 = (i541115 ^ 10) + ((i541115 & 10) << 1);
            int i541117 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            Object[] objArr111110 = new Object[1];
            a(i541114, i541116, (char) ((i541117 ^ 62405) + ((i541117 & 62405) << 1)), objArr111110);
            Object[] objArr111111 = new Object[1];
            a(2047 - View.getDefaultSize(0, 0), 11 - (~(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (char) View.combineMeasuredStates(0, 0), objArr111111);
            String str5110 = (String) objArr111111[0];
            int i541118 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i541119 = (i541118 ^ 587) + ((i541118 & 587) << 1);
            int maximumDrawingCacheSize8 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
            Object[] objArr111112 = new Object[1];
            a(i541119, (maximumDrawingCacheSize8 ^ 6) + ((maximumDrawingCacheSize8 & 6) << 1), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 55086), objArr111112);
            int i551110 = -Color.rgb(0, 0, 0);
            int i551111 = (i551110 & (-16775158)) + (i551110 | (-16775158));
            int i551112 = -(Process.myPid() >> 22);
            Object[] objArr111113 = new Object[1];
            a(i551111, (i551112 ^ 28) + ((i551112 & 28) << 1), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr111113);
            c3 = 0;
            String str5111 = (String) objArr111113[0];
            int i551113 = 2036 - (~(-View.resolveSizeAndState(0, 0, 0)));
            int i551114 = -TextUtils.lastIndexOf(str15, '0', 0);
            int i551115 = (i551114 ^ 9) + ((i551114 & 9) << 1);
            int iRgb16 = Color.rgb(0, 0, 0);
            Object[] objArr111114 = new Object[1];
            a(i551113, i551115, (char) ((iRgb16 ^ 16839620) + ((iRgb16 & 16839620) << 1)), objArr111114);
            strArr7 = new String[][]{new String[]{str518, (String) objArr10113[0]}, strArr118, new String[]{str519, (String) objArr111110[0]}, new String[]{str5110, (String) objArr111112[0]}, new String[]{str5111, (String) objArr111114[0]}};
            i89 = 0;
            i90 = -1;
            loop7: while (true) {
                if (i89 < 5) {
                    i91 = i72;
                    break;
                }
                String[] strArr119 = strArr7[i89];
                str16 = strArr119[c3];
                strArr8 = (String[]) Arrays.copyOfRange(strArr119, 1, strArr119.length);
                length4 = strArr8.length;
                i97 = 0;
                while (i97 < length4) {
                    int i551116 = i90 - 116;
                    i90 = (i551116 & 117) + (i551116 | 117);
                    Object[] objArr111115 = {str16, strArr8[i97]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                        char size4 = (char) View.MeasureSpec.getSize(0);
                        int modifierMetaStateMask9 = 2384 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int offsetAfter9 = TextUtils.getOffsetAfter(str15, 0) + 32;
                        byte b4110 = (byte) 0;
                        byte b4111 = (byte) (b4110 + 1);
                        Object[] objArr111116 = new Object[1];
                        c(b4110, b4111, (byte) (b4111 - 1), objArr111116);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(size4, modifierMetaStateMask9, offsetAfter9, -1207062455, false, (String) objArr111116[0], new Class[]{String.class, String.class});
                    }
                    long jLongValue119 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr111115)).longValue();
                    long j814 = 1133421988;
                    i98 = i89;
                    long j815 = j814 ^ j3;
                    long j91110 = (j2 | j814) ^ j3;
                    long j91111 = (((long) 375) * j814) + (((long) (-747)) * jLongValue119) + (((long) (-374)) * (((j815 | jLongValue119) ^ j3) | j91110));
                    long j91112 = jLongValue119 ^ j3;
                    long j91113 = j91111 + (((long) 748) * ((j814 | j91112) ^ j3)) + (((long) 374) * (((j815 | j91112) ^ j3) | j91110)) + ((long) 843621340);
                    int iUptimeMillis7 = (int) SystemClock.uptimeMillis();
                    i99 = ((int) (j91113 >> 32)) & (635876210 + (((~(475706740 | iUptimeMillis7)) | 207271008) * (-502)) + ((~((~iUptimeMillis7) | 2120204159)) * (-502)) + (((~(iUptimeMillis7 | (-1912933152))) | 475706740) * TypedValues.PositionType.TYPE_DRAWPATH));
                    i100 = ((int) j91113) & (1719511565 + ((~((-1337655339) | i72)) * 216) + (((-1242562561) | i178) * (-216)) + (((~((-1337655339) | i178)) | (-99571072)) * 216));
                    if (((i100 & i99) | (i99 ^ i100)) != 0) {
                        int i551117 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        i101 = ((i551117 | 25) << 1) - (i551117 ^ 25);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i101 % 128;
                        if (i101 % 2 != 0) {
                            i91 = ((i90 ^ 170) + ((i90 & 170) << 1)) ^ i72;
                            break loop7;
                        }
                        int i551118 = (i90 ^ 24261) + ((i90 & 24261) << 1);
                        i91 = (i551118 | i72) & (~(i72 & i551118));
                        break loop7;
                    }
                    int i551119 = i97 + 22;
                    i97 = ((i551119 | (-21)) << 1) - (i551119 ^ (-21));
                    strArr8 = strArr8;
                    strArr7 = strArr7;
                    length4 = length4;
                    i89 = i98;
                }
                String[][] strArr1110 = strArr7;
                int i561110 = i89;
                int i561111 = ((i561110 | (-107)) << 1) - (i561110 ^ (-107));
                i89 = (i561111 ^ 108) + ((i561111 & 108) << 1);
                strArr7 = strArr1110;
                c3 = 0;
            }
            int i561112 = ((~i76) & i72) | (i76 & i178);
            int i561113 = -i561112;
            int i561114 = ((i561112 & i561113) | (i561112 ^ i561113)) >> 31;
            int i561115 = (i91 & (~i561114)) | (i76 & i561114);
            int scrollBarSize8 = 2086 - (ViewConfiguration.getScrollBarSize() >> 8);
            int i561116 = -ExpandableListView.getPackedPositionGroup(0L);
            int i561117 = ((i561116 | 13) << 1) - (i561116 ^ 13);
            int i561118 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            Object[] objArr111117 = new Object[1];
            a(scrollBarSize8, i561117, (char) ((i561118 ^ 1) + ((i561118 & 1) << 1)), objArr111117);
            String str619 = (String) objArr111117[0];
            int iRgb17 = Color.rgb(0, 0, 0);
            int i561119 = (iRgb17 ^ 16779315) + ((iRgb17 & 16779315) << 1);
            int i571110 = -Gravity.getAbsoluteGravity(0, 0);
            int iLastIndexOf10 = TextUtils.lastIndexOf(str15, '0', 0, 0);
            Object[] objArr111118 = new Object[1];
            a(i561119, (i571110 ^ 8) + ((i571110 & 8) << 1), (char) (((iLastIndexOf10 | 5430) << 1) - (iLastIndexOf10 ^ 5430)), objArr111118);
            Object[] objArr111119 = {str619, (String) objArr111118[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char longPressTimeout6 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                int iBlue9 = 2385 - Color.blue(0);
                int modifierMetaStateMask10 = ((byte) KeyEvent.getModifierMetaStateMask()) + 33;
                byte b4112 = (byte) 0;
                byte b4113 = (byte) (b4112 + 1);
                Object[] objArr1216 = new Object[1];
                c(b4112, b4113, (byte) (b4113 - 1), objArr1216);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(longPressTimeout6, iBlue9, modifierMetaStateMask10, -1207062455, false, (String) objArr1216[0], new Class[]{String.class, String.class});
            }
            long jLongValue1110 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr111119)).longValue();
            long j91114 = 637099123;
            long j91115 = (((long) (-665)) * j91114) + (((long) 334) * jLongValue1110);
            long j91116 = j91114 ^ j3;
            long j91117 = 333;
            long j91118 = j91115 + (((long) (-333)) * j91116) + ((((j91116 | j2) ^ j3) | ((jLongValue1110 | j) ^ j3)) * j91117) + (j91117 * (((j2 | jLongValue1110) ^ j3) | ((j91116 | j) ^ j3))) + ((long) 1339944205);
            i95 = ((int) (j91118 >> 32)) & ((-2055567968) + (((~(318146393 | i178)) | 1755372804) * 226) + (((~((-1755372805) | i72)) | 10519808 | (~(2062999389 | i178))) * (-113)) + ((~(318146393 | i72)) * 113));
            int i571111 = (int) j91118;
            int i571112 = ~(Process.myUid() | 1357820570);
            i96 = i571111 & (((159925537 | i571112) * (-658)) + 132491861 + ((i571112 | 151012641) * 658));
            if (((i95 & i96) | (i95 ^ i96)) != 0) {
                i92 = ~(i72 & 150);
                i93 = i72 | 150;
                i94 = i92 & i93;
            } else {
                i94 = i72;
            }
            int i571113 = (~(i72 & i561115)) & (i72 | i561115);
            int i571114 = -i571113;
            int i571115 = ((i571113 & i571114) | (i571113 ^ i571114)) >> 31;
            int i571116 = (i94 & (~i571115)) | (i561115 & i571115);
            int i571117 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int i571118 = (i571117 & 2108) + (i571117 | 2108);
            int i571119 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            Object[] objArr1217 = new Object[1];
            a(i571118, ((i571119 | 47) << 1) - (i571119 ^ 47), (char) (0 - (~(-(-MotionEvent.axisFromString(str15))))), objArr1217);
            Object[] objArr1218 = {(String) objArr1217[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cIndexOf9 = (char) (TextUtils.indexOf((CharSequence) str15, '0', 0, 0) + 1);
                int iRed8 = 993 - Color.red(0);
                int doubleTapTimeout8 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8;
                byte b4114 = (byte) 0;
                byte b4115 = b4114;
                Object[] objArr1219 = new Object[1];
                c(b4114, b4115, b4115, objArr1219);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf9, iRed8, doubleTapTimeout8, 349342683, false, (String) objArr1219[0], new Class[]{String.class});
            }
            long jLongValue1111 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr1218)).longValue();
            long j91119 = 503960024;
            long j10111 = 569;
            long j10112 = j91119 ^ j3;
            long j10113 = jLongValue1111 ^ j3;
            long j10114 = j10112 | j10113;
            long j10115 = (j10111 * j91119) + (j10111 * jLongValue1111) + (((long) (-1136)) * ((j10114 ^ j3) | ((j10112 | j2) ^ j3) | ((j10113 | j2) ^ j3)));
            long j10116 = j2 | j91119;
            long j10117 = j10115 + (((long) (-568)) * (((j10112 | j) ^ j3) | ((j10113 | j) ^ j3) | ((j10116 | jLongValue1111) ^ j3))) + (((long) 568) * (((j2 | jLongValue1111) ^ j3) | (j10116 ^ j3) | ((j10114 | j) ^ j3))) + ((long) (-1351038629));
            int i581110 = ((int) (j10117 >> 32)) & ((-2072279902) + ((~((-43537027) | i178)) * (-116)) + (((-43537347) | i72) * 116) + (((~((-1480763758) | i72)) | 1480763437) * 116));
            int i581111 = (~((-1287144799) | i72)) | (~(1570596087 | i178));
            int i581112 = ~(1287144798 | i178);
            int i581113 = ((int) j10117) & ((-1669203471) + ((i581111 | i581112) * (-516)) + (((~((-1285047383) | i72)) | (~((-285548706) | i178))) * 516) + ((285548705 | i581112) * 516));
            int i581114 = ((i581110 & i581113) | (i581110 ^ i581113)) * 263;
            int i581115 = i72 ^ i571116;
            int i581116 = -i581115;
            int i581117 = ((i581115 & i581116) | (i581115 ^ i581116)) >> 31;
            int i581118 = ((i581114 & i178) | ((~i581114) & i72)) & (~i581117);
            int i581119 = i571116 & i581117;
            i69 = (i581119 & i581118) | (i581118 ^ i581119);
            strArr4 = strArr6;
        } else {
            i72 = i67;
            strArr4 = null;
        }
        int i8414 = (~(i72 & i69)) & (i72 | i69);
        int i8415 = -i8414;
        Object[] objArr193 = {new int[1], new int[]{i69}, null, new int[]{i72}, strArr4};
        int iMyTid4 = Process.myTid();
        int i8416 = ~iMyTid4;
        int i8417 = ~(399194926 | i8416);
        int i8418 = 680508883 + ((1076887617 | i8417) * (-712)) + (((~(iMyTid4 | 1476082543)) | (~(i8416 | (-1076887618)))) * (-712)) + (((-1374884718) | i8417) * 712);
        int i8419 = -(-((((i8414 & i8415) | (i8414 ^ i8415)) >> 31) & 16));
        int i855 = (i3 - (~((i8418 ^ i8419) + ((i8419 & i8418) << 1)))) - 1;
        int i856 = i855 << 13;
        int i857 = ((~i855) & i856) | ((~i856) & i855);
        int i858 = i857 >>> 17;
        int i859 = (i857 | i858) & (~(i857 & i858));
        ((int[]) objArr193[0])[0] = i859 ^ (i859 << 5);
        return objArr193;
    }

    static {
        char[] cArr = new char[2154];
        ByteBuffer.wrap("±³Ð!rK\u0094a6×XÆúå\u001d\u001f¿0Á[c\u008f\u0085¼'ØIÆè#\nO¬hÎ\u0087P»òô\u0015\u001b·\u000eÙI{\u0093\u009d¥?ÎAó\u0012\u0086s\u0014Ñ~7T\u0095âûóYÐ¾*\u001c\u0005bnÀº&\u0089\u0084íêóK\u0007©w\u000fIm¥ó´QÖ¶-\u0014\u0016zlØ¢>\u0095-ÚLHî\"\b\bª¾Ä¯f\u008c\u0081v#Y]2ÿæ\u0019Õ»±Õ¯tX\u0096;0\u000bRÿ±³Ð6rW\u0094d6×XÌúå\u001d\u0017¿!ÁQc\u0083\u0085à'×Iöè.\nO¬jÎ\u009cP\u00adòï\u00157·3Ù[{\u0097\u009d°?ÈAäà\u0006±³Ð rZ\u0094t6×XÅúí\u001d]¿$ÁOc\u0089\u0085¿±³Ð rZ\u0094t6×XÒúã\u001d\u001e¿zÁMc\u0094\u0085 'À±³Ð6rJ\u0094t6\u0099XÓúî\u001d\\¿\u0006Á{c«\u0085 'ÆIüè\u0006\nJ¬xÎ\u0094Ò\u009e³\f\u0011b÷NU´;£\u0099\u0089~=Ü\t¢e\u0000¢æ\u008cDû*Û\u0085\täÍFç \u0092\u0002pl)Î\u0019)º\u008bÁõ¿We±Z\u00138}\u0017ÜÁ>\u0093\u0098\u0085úwdMÆ?!ë\u0083Øí®O5\u0098sù·[\u009d½è\u001f\nqSÓc4À\u0096»èÅJ\u001f¬ \u000eB`mÁ»#é\u0085ÿç\ry7ÛE<\u0091\u009e¢ðÔRL²\u0000Ó\u0085qä\u0097×5?[wùT\u001eï¼\u008bÂç`7\u0086S$oJCë\u0093\tö¯ÝÍhS\u001eñ[±þÐ,rI\u0094y6\u0097XÙ\u0089ÍèHJ)¬\u001a\u000eò`ºÂ\u0099%\"\u0087Hù*[ö½\u009e\u001f q\u0082ÐQ2 \u0094$öÆh\u008dÊ\u0097-s\u008fBá1C°¥Ù\u0007¼y\u0086Øu:,\u009c\u0018þà±³Ð6rW\u0094d6\u008cXÄúç\u001d\\¿6ÁTc\u0088\u0085à'ÞIüè/\n^¬ZÎ¸Póò÷\u0015\u001a·>ÙJ±³Ð6rW\u0094d6\u008cXÄúç\u001d\\¿8ÁTc\u0084\u0085à'ÜIðè \nE¬iÎ\u0098P«òÑ\u0015%·!ÙH{\u008c\u009d´?\u0083Aåà\u00108?Y\u00adûÇ\u001dí¿[ÑCsc\u0094\u00926\u00adHÖê\u001f\f&®OÀa±îÐ*r\u0000\u0094u6\u008dXÈúæ\u001d\u0017¿zÁUc\u0089\u0085¼'Ä±òÐ rO\u0094d6\u009dX\u008fúä\u001d\u0016¿ ±³Ð5r\\\u0094x6\u009bX\u008eúì\u001d\u001a¿8ÁXc\u0095\u0085¶'ÃIíè'\nF¬\u007f SA\u0081ãâ\u0005Ã§*Éf¢mÃ©a\u0083\u0087ä%\tKMém\u000e\u0085¬´ÒÊpK\u0096!4RZtû´\u0019Î¿îÝ\u0015C)áq\u0006\u0099¤·ÊË\u0005Ïd\u0014Æt ZAk §\u0082ÛdãÆ\u0016¨U\nyíÚO 1Ã\u0093\u0012uf×U¹z\u0018ëúÈ\\î>\u0010 ,\u0002gåÁG±)Í\u008b\u0011mmÏL±p\u0010\u0093òÂTÑ6\u0012\u0098,zNÝ½¿»!Õ\u0083ñe\"ÇH©f\b\u0096ê¨±ìÐ r\\\u0094d6\u0091XÒúþ\u001d]¿'ÁDc\u0095\u0085á'ÒIýèl\nO¬iÎ\u0097P«òà\u0015F·6ÙJ{\u0096\u009dê?ËA÷à\u0014\u0002E¤VÆ\u0095h«\u008aÉ-:O8ÑRsv\u0095¥7ÅYá±ìÐ r\\\u0094d6\u0091XÒúþ\u001d]¿'ÁDc\u0095\u0085á'ÒIýèl\nO¬iÎ\u0097P«òà\u0015F·#ÙU{Í\u009d§?ÜAÿ±ìÐ r\\\u0094d6\u0091XÒúþ\u001d]¿'ÁDc\u0095\u0085á'ÒIýèl\nO¬iÎ\u0097P«òà\u0015F·#ÙU{Í\u009d¨?ÌAõ±ìÐ r\\\u0094d6\u0091XÒúþ\u001d]¿'ÁDc\u0095\u0085á'ÒIýèl\nO¬iÎ\u0097P«òà\u0015F·#ÙU{Í\u009d©?ÎAõVá7-\u0095QsiÑ\u009c¿ß\u001dóúPX*&I\u0084\u0098bìÀß®ð\u000faíBKd)\u009a·¦\u0015íòKP.>X\u009cÀz¤ØÎ¦øfÄ\u0007\t¥oCAá¥\u008fé\u009c¶ý0_Y¹}\u001b\u009eu\u008b×â0\u0019\u00925ìMN\u008f¨¯\nÆ±êÐ'rA\u0094o6\u009fXÔúï\u001d\u0000¿ ±³Ð6rW\u0094d6\u008cXÄúç\u001d\\¿2ÁOc\u0087\u0085¢'ÕIîè-\nY¬gÎÚP©òî\u0015\u0006·5ÙU{\u0094\u009d·?\u0080Aåà\u0006\u0002S¤}Æ\u0097h¶\u008aã-\u0016O+ÑEsn\u0095¤7ØY½ø\u001e\u001a<¼t±³Ð3rK\u0094y6\u009cXÎúø\u001d\\¿8ÁTc\u0084\u0085ù'\u0084I¶è*\n\\¬#Î\u0094P«òã\u0015\u0001·>Ù\u0014{\u0093\u009d¶?ÄAûà\u001e\u0002R¤pÆÜh¬\u008aÕ-\u000bO*ÑXso\u0095²7\u0084Yàø\u001bsð\u0012p°\bV:ôß\u009a\u008d8»ß\u001f}{\u0003\u0017¡ÇGºåÇ\u008bõ*iÈ\u001fn`\fÞ\u0092ê0§×Du\u007f\u001b\t¹Ï_ôý\u008b\u0083§\"\u0012À\u0014f#\u0004ßªüH\u0090ïQ\u008d~\u0013Z±(Wí4iUì÷\u008d\u0011¾³VÝ\u001e\u007f=\u0098\u0086:âD\u008eæ^\u0000#¢^Ìlmû\u008f\u009d)¹KZÕ`w\u0002\u0090Ó2â\\\u0084þU\u0018Aº\u001eÄ\"eÑ\u0087\u009f!¡CNí`\u000f\u0005¨ÚÊ¹T\u008eö²\u0010k²^Ü:}Á±³Ð rZ\u0094t6×XÈúä\u001d\u001a¿ Á\u0012c\u008f\u0085¡'ÙIíèl\nH¬`Î\u009aP«òã\u0015\u001b·4ÙH{\u0095\u009d\u00ad?ÎAóàQ\u0002R¤j±ÛÐ r@\u0094n6\u0095XÎúþ\u001d\u001a¿;ÁS±éÐ+rE\u0094y6\u0097XÖúäxå\u00197»F]bÿ\u008f\u0091Ò3åÔ\u0004±îÐ*r\u0000\u0094g6\u008aXÎúî\u001d\u0006¿7ÁIcÈ\u0085«'ÕIïè+\nH¬i'¼Fqä\u0017\u00029 \u0096ÎÁl¬±ûÐ r@\u0094r6\u008aXÈúé\u0018«ypÛ\u0010=\"\u009fÚñ\u0098S¹´|\u0016|hUÊ\u0080±ûÐ r@\u0094r6\u008aXÈúé\u001d,¿,Á\u0005cÐ\u0085\u0090'\u0086I\u00ad{s\u001a·¸\u009d^úü\u0017\u0092S0s×\u009buª\u000bÔ©UO?íB\u0083`\"ºÀÚ±ïÐ!rEÑ'°ö\u0012\u0085ô¥VG8\u000b\u009a;}ß±ÝÐ5r^\u009476ªXÔúä\u001d\u0007¿=ÁPc\u0083\u0085ï'ÖIöè0\n\u000b¬OÎ\u009dP¬òè\u0015\u0005·4Ï\u0084®r\f\u0013ê<HÎ&\u0091\u0084·c\nÁ^¿ \u001dôû¶Y\u008b7µ\u0096rt\u001eÒ!°\u008c.á\u008c±kCÉ(§\u001b\u0005\u0082ã«±ÝÐ+rJ\u0094e6\u0097XÈúî\u001dS¿\u0007Áyc\u00ad\u0085ï'ÒIìè+\nG¬xÎÕP¸òè\u0015\u001a·qÙB{Û\u009dò?òA àK±îÐ*r\u0000\u0094\u007f6\u0099XÓúî\u001d\u0004¿5ÁOc\u0083MT,\u0085\u008eíhÜÊ1¤g\u0006Vá´Uô49\u0096_pqÒÞ¼\u0089_H>\u0082\u009cæzÒØ6¶rÆi§\u00ad\u0005\u0087ãàA\r/I\u008dij\u0081È°¶Î\u0014Oò*PE>\u007f\u009f«}Èú;\u009bÿ9Õß©}H\u0013\u0006±1VÃôí\u008aÆ(BÎ\u007fl\b\u00029d\u009b\u0007xf¼Ä\u0096\"ò\u0080\u000bîTLi«\u0097\t§9\rÎ+¯ï\rÅë°IH'\r\u0085#bÒÀ¿¾\u0088\u001cQúeX\u00116)\u0097äu\u009a±úÐ0rB\u0094{6§XÙú²\u001dE±îÐ*r\u0000\u0094u6\u008dXÈúæ\u001d\u0017¿zÁ[c\u008f\u0085¡'×Iüè0\n[¬~Î\u009cP°òó±ûÐ r@\u0094r6\u008aXÈúé\u001d\\¿'ÁYc\u008d\u0085à'×Iüè,\nN¬~Î\u009cP½tÓ\u0015\b·hQZó¢\u009dà?ÁØ\u0004z\u0004\u0004-¦ø@Èâë\u008cÕ-\u0001Ï\\i\\\u000bå\u0095À7\u0080Ð'r\u001c\u001c|¾®X\u009eúì\u0084Ý%\bÇpa\u0019\u0003ì±ûÐ r@\u0094r6\u008aXÈúé\u001d\\¿3ÁRc\u0089\u0085¨'ÜIüè\u001d\nX¬hÎ\u009ePñòà\u0015\r·?Ù_{\u0091\u009d\u00ad?Î±ûÐ r@\u0094r6\u008aXÈúé\u001d\\¿\"Á_c\u0089\u0085·'\u0088I¯è2\n\u0004¬zÎ\u0097P±òÿ\u0015P·gÙJ\u0088öé'KL\u00ad}\u000f\u0099aÉÃ¨$\r\u0086=ø[Z´¼¥\u001eÍpüÑ 3H\u0095d÷§i«Ë²,S\u008esàPB\u008b¤§\u0006ÅxéÙ\u001b;N\u009d[ÿ\u0087Qî³\u0087±îÐ*r\u0000\u0094u6\u0097XÎúþ\u001d\u001f¿;Á\\c\u0082\u0085ª'Âû´\u009ap8ZÞ/|Í\u0012\u0094°¤W@õc\u008b\u0006)ÛÏðmÄ\u0003¡¢m@\u0018æ:\u0084Ë\u001aª¸»_[ýe\u0093\u00071Ü×ìu\u0087\u000b¾ªLH\u0014î'\u008eÃï5MT«{\t\u0089gÖÅð\"@\u00802þ\u001b\\Î+ìJ(è\u0002\u000ew¬\u008fÂÊ`ä\u0087\u0015%x[[ù\u008d\u001f¾½ÂÓ÷r!\u0090P6 T\u009eÊ¸b:\u0003ò¡\u008fG±å\u0007ê\u0081\u008b_)3Ï\u0017m¢\u0003¦¡\u0088Fdä\u000e\u009a88÷ÞÖ|±\u0012À³FQ-÷\u0017\u0095ñ\u000bÙ½\"Üï~\u008c\u0098\u00ad:\u0019T\u0006ö2\u0011\u0092³öÍ\u0093o@\u0089n+\u0014E3äô\u0006\u0097\u009aTû\u0099Yú¿Û\u001doskÑU6ä\u0094\u008bêåH4®\u0013\fVbCÃ\u009a!ÿ\u0087Ðå>{\u0006\u0088\u001eéÓK°\u00ad\u0091\u000f%a!Ã\u001f$®\u0086Ëø\u00adZq¼c\u001e'p\u000fÑß3«\u0095\u0096÷riTFS'\u0097\u0085½cÁÁ ¯n\rYê«H\u00856®\u0094:r\u001cÐi¾V\u001f\u0090ýÿ[Õ9f§\u0012\u0005_â¸@\u0099.ã\u0081{à¿B\u0095¤à\u0006\u0002h[Êk-È\u008f°ñÍS\u001eµ/\u0017\u000bymØ¡:Ú\u009cÆþ\u000e`*Â\u007f%\u0098±îÐ*r\u0000\u0094x6\u009cXÌú¤\u001d\u0011¿!ÁTc\u008a\u0085«'\u009eIÿè+\nE¬kÎ\u0090P¬ò÷\u0015\u001a·8ÙT{\u0097±îÐ*r\u0000\u0094g6\u008aXÎúî\u001d\u0006¿7ÁIcÈ\u0085\u00ad'ÅIðè.\nO¬\"Î\u0093P·òé\u0015\u000f·4ÙH{\u0093\u009d¶?ÄAøà\u000b±\u0002ÐÆrì\u0094\u00886mX>ú\u0012\u001dú¿ÕÁÿch\u0085V'5I\u0019èÊ\né¬\u0086ÎpP\\ò\f\u0015á·ÏÙ¦{}\u009dA?/A\u000e±îÐ*r\u0000\u0094d6\u0081XÒúþ\u001d\u0016¿9Ábc\u0083\u0085·'ÄI·è \n^¬eÎ\u0099Pºò©\u0015\u000e·8ÙT{\u0084\u009d¡?ßAæà\r\u0002I¤gÆ\u0086±îÐ*r\u0000\u0094a6\u009dXÏúî\u001d\u001c¿&Á\u0013c\u0084\u0085º'ÙIõè&\n\u0005¬jÎ\u009cP°òà\u0015\r·#ÙJ{\u0091\u009d\u00ad?ÃAâ±îÐ*r\u0000\u0094a6\u009dXÏúî\u001d\u001c¿&Ábc\u0082\u0085£'ÛIôèl\nI¬yÎ\u009cP²òã\u0015F·7ÙS{\u008d\u009d£?ÈAäà\u000f\u0002R¤`Æ\u009ch¯½^1\u000ePÛ.ØMc±³Ð!rK\u0094a6×XÐúï\u001d\u001e¿!Ábc\u0096\u0085¦'ÀIü±³Ð!rK\u0094a6×XÒúå\u001d\u0010¿?ÁXc\u0092\u0085à'ÒIøè1\nN¬nÎ\u0094P°òã\u00157·6Ù_{\u008d\u009d½?É±³Ð!rK\u0094a6×XÒúå\u001d\u0010¿?ÁXc\u0092\u0085à'×Iüè,\nR¬h?o^ýü\u0097\u001a½¸\u000bÖ\u000et9\u0093Ì1ãO\u0084íN\u000b<©\u001dÇ fó\u0084\u0082\"´±³Ð6rW\u0094d6×XÐúï\u001d\u001e¿!Ábc\u0092\u0085½'ÑIúè'±³Ð6rW\u0094d6\u008cXÄúç\u001d\\¿8ÁTc\u0084\u0085à'ÜIðè \nH¬SÎ\u0098P¿òë\u0015\u0004·>ÙY{¼\u009d ?ÈAôà\n\u0002G¤VÆ\u0083h¾\u008aÑ-\u0010O`ÑDsw±³Ð!rK\u0094a6×XÃúù\u001d\u0007¿\u000bÁZc\u0096\u0085¼æ\u0015\u0087\u0087%íÃÇaq\u000fe\u00ad_J¡è\u00ad\u0096ï4)Ò\u0004ps\u001aV{ÄÙ®?\u0084\u009d2ó7Q\u0000¶õ\u0014Új½Èw.\u0005\u008c7â\u000fCÓ¡¨\u0007\u0086e|û_Y\u0007¾ÿ\u001cÐ\u001ef\u007fãÝ\u0082;±\u0099Y÷\u0011U2²\u0089\u0010ín\u0081ÌQ*5\u0088\tæ%Gõ¥\u009c\u0003ªaTÿm]=ºÑ\u0018àv\u008aÔD2N\u0090\u0012î-OÃ\u00adÛ\u000b¯iH±³Ð!rK\u0094a6×XÃúù\u001d\u0007¿5Á^c\u0085\u0085ªI\u000b(\u0099\u008aólÙÎo {\u0002Aå¿G\u008b9ü\u009b,}\u0018±³Ð!rK\u0094a6×XÃúù\u001d\u0007¿9ÁXc\u0081\u0085¡P÷1e\u0093\u000fu%×\u0093¹\u0087\u001b½üC^\u007f \u000b\u0082ËdîºËÛYy3\u009f\u0019=¯S»ñ\u0081\u0016\u007f´ZÊ(hí\u008eÐØG¹Õ\u001b¿ý\u0095_#17\u0093\rtóÖÐ¨®\nsìRN4 \u000eB\u0086#\u0014\u0081~gTÅâ«ö\tÌî2L>2a\u0090¾v\u009fp(\u0011º³ÔUø÷\u0002\u0099\u0015;uÜ\u0087~¸\u0000È¢\u0011D;æJ\u0088f)ªË\u009fm¹\u000f\u0016\u0091'33Ô\u0091v¹\u0018Õº\u0013±³Ð(r@\u0094c6×XÖúã\u001d\u001d¿0ÁRc\u0091\u0085¼'\u009fIÛè1\n_¬_Î\u009dP¿òõ\u0015\r·5Ù|{\u008c\u009d¨?ÉAóà\r±³Ð5r\\\u0094x6\u009bX\u008eúã\u001d\u001c¿$ÁRc\u0094\u0085»'Ã±¬Ð#rH\u009476Â±³Ð5r\\\u0094x6\u009bX\u008eúù\u001d\u0016¿8Á[cÉ\u0085¢'ÑIéè1\u007f§\u001ek¼\u0013Z'øÈ\u0096\u00924µÓ\u0001qo\u000f\u000e\u00adÖK÷é\u008a\u0087¬&mÄ\u001fb~\u0000Ú\u009eí|\u009e\u001dB¿\"Y>ûÚ\u0095\u008a7·ÐBrX\f ®üH\u008fê\u00ad\u0084\u0098±³Ð rZ\u0094t6×XÌúï\u001d\u0017¿=Á\\c¹\u0085¬'ßIýè'\nH¬\u007fÎÛP¦òê\u0015\u0004B:#í\u0081\u009fg¶ÅO«\u0011\t/îÔLû2\u008a±³Ð rZ\u0094t6×XÌúå\u001d\u0006¿:ÁIc\u0095±³Ð!rO\u0094c6\u0099X\u008eúî\u001d\u001c¿#ÁSc\u008a\u0085 'ÑIýè1\n\u0004¬\"Î\u0091P®ò¨\u0015\t·!ÙJ{\u0090\u009dê?ÕAûà\u0013±³Ð5r\\\u0094x6\u009bX\u008eúé\u001d\u0003¿!ÁTc\u0088\u0085©'ß¤îÅ\u001fgw\u0081F#«MýïÌ\b.±³Ð!rO\u0094c6\u0099X\u008eúç\u001d\u001a¿'Á^cÉ\u0085¿'ÂIöè$\nB¬`Î\u0090P\u00adò¨\u0015\u000b·$ÙH{Ì\u009dô?\u0082Aõà\u0010\u0002M¤'Æ\u009fh²\u008aß-\u0017O!ÑAsq\u0095³7ÞY½ø\u0019\u001a8¼kÞ\u009a`¹\u0082Ô%\u0007".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
        TuitionPaymentFragmentbindingInflater1 = cArr;
        b = -7321515224035372987L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, short r7, short r8) {
        /*
            byte[] r0 = com.google.firebase.crashlytics.internal.network.HttpGetRequest.$$c
            int r6 = r6 + 4
            int r8 = r8 * 3
            int r8 = 115 - r8
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.network.HttpGetRequest.$$e(short, short, short):java.lang.String");
    }
}
