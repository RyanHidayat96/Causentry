package defpackage;

import com.android.volley.toolbox.HttpHeaderParser;
import com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1;
import com.dynatrace.android.callback.CallbackCore;
import com.dynatrace.android.callback.CbConstants;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ZoomState extends AutoValue_CaptureNode_In {
    private static final Map<String, Integer> TuitionPaymentFragmentbindingInflater1;
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final int b;
    public HttpURLConnection TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("ConnStateParms");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sb.toString();
        b = 49;
        HashMap map = new HashMap();
        TuitionPaymentFragmentbindingInflater1 = map;
        map.put("User-Agent", Integer.valueOf(CallbackCore.b().length() + 12));
        map.put("Connection", 22);
        map.put("Accept-Encoding", 21);
    }

    ZoomState(HttpURLConnection httpURLConnection, CbConstants.WrMethod wrMethod, CbConstants.WrStates wrStates) {
        super(wrMethod, wrStates, 0);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = httpURLConnection;
    }

    @Override // defpackage.AutoValue_CaptureNode_In
    public final String TuitionPaymentFragmentbindingInflater1() {
        if (this.d != null) {
            return this.d;
        }
        this.d = "NA";
        HttpURLConnection httpURLConnection = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (httpURLConnection != null) {
            Object[] objArr = {httpURLConnection.getURL().toString()};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            this.d = (String) ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault1(HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -739829131, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 739829131, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        return this.d;
    }

    @Override // defpackage.AutoValue_CaptureNode_In
    final String b() {
        HttpURLConnection httpURLConnection = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (httpURLConnection != null) {
            return httpURLConnection.getURL().getHost();
        }
        return "NA";
    }

    @Override // defpackage.AutoValue_CaptureNode_In
    final String TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        HttpURLConnection httpURLConnection = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (httpURLConnection != null) {
            return httpURLConnection.getRequestMethod();
        }
        return "NA";
    }

    @Override // defpackage.AutoValue_CaptureNode_In
    protected final String TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        HttpURLConnection httpURLConnection = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (httpURLConnection != null) {
            return httpURLConnection.getClass().getSimpleName();
        }
        return "NA";
    }

    final void b(boolean z) {
        if (this.asInterface < 0) {
            try {
                this.asInterface = b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getRequestMethod(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getURL().getFile());
                Map<String, List<String>> requestProperties = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getRequestProperties();
                this.asInterface += b(requestProperties) + 2;
                for (Map.Entry<String, Integer> entry : TuitionPaymentFragmentbindingInflater1.entrySet()) {
                    if (!requestProperties.containsKey(entry.getKey())) {
                        this.asInterface += (long) (entry.getValue().intValue() + 2);
                    }
                }
                if (!requestProperties.containsKey("Host")) {
                    this.asInterface += (long) (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getURL().toURI().getAuthority().length() + 8);
                }
                if (!z || requestProperties.containsKey(HttpHeaderParser.HEADER_CONTENT_TYPE)) {
                    return;
                }
                this.asInterface += (long) b;
            } catch (Exception unused) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.TuitionPaymentFragmentbindingInflater1("can't calculate request size");
                }
                this.asInterface = -1L;
            }
        }
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        if (this.asBinder < 0) {
            try {
                this.asBinder = b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getHeaderFields()) + 2;
            } catch (Exception unused) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.TuitionPaymentFragmentbindingInflater1("can't calculate request size");
                }
                this.asBinder = -1L;
            }
        }
    }

    private static int b(String str, String str2) {
        int length = str.length();
        return (str2 == null || str2.length() <= 0) ? length + 13 : length + 12 + str2.length();
    }

    private static long b(Map<String, List<String>> map) {
        long length;
        long length2 = 0;
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() == null) {
                if (entry.getValue().size() > 0) {
                    length = entry.getValue().get(0).length() + 2;
                    length2 += length;
                }
            } else if (!entry.getKey().startsWith("X-Android")) {
                long length3 = entry.getKey().length() + 4;
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    length2 += ((long) it.next().length()) + length3;
                }
                if ("Content-Length".equalsIgnoreCase(entry.getKey()) && entry.getValue().size() > 0) {
                    try {
                        length = Long.parseLong(entry.getValue().get(0));
                        length2 += length;
                    } catch (NumberFormatException unused) {
                        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            ViewPort.TuitionPaymentFragmentbindingInflater1("invalid content length");
                        }
                    }
                }
            }
        }
        return length2;
    }
}
