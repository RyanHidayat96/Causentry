package defpackage;

import com.dynatrace.android.callback.CbConstants;
import java.net.URI;
import java.util.ArrayList;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes6.dex */
public final class CameraCoordinatorConcurrentCameraModeListener {
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("HttpClientCallback");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = sb.toString();
    }

    public static void L_(HttpRequestBase httpRequestBase) {
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get()) {
            CameraCoordinatorCameraOperatingMode.N_(httpRequestBase);
        }
    }

    static HttpHost I_(HttpUriRequest httpUriRequest) {
        URI uri;
        if (httpUriRequest == null || (uri = httpUriRequest.getURI()) == null || !uri.isAbsolute()) {
            return null;
        }
        return new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme());
    }

    public static HttpResponse J_(HttpClient httpClient, HttpUriRequest httpUriRequest) throws Exception {
        return K_(httpClient, httpUriRequest, new BasicHttpContext());
    }

    private static HttpResponse K_(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws Exception {
        int statusCode;
        if (!SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get()) {
            return httpClient.execute(httpUriRequest, httpContext);
        }
        getImageReaderProxyProvider getimagereaderproxyprovider = new getImageReaderProxyProvider(I_(httpUriRequest), httpUriRequest, httpContext);
        try {
            try {
                CameraCoordinatorCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(getimagereaderproxyprovider);
            } catch (Exception unused) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.TuitionPaymentFragmentbindingInflater1(getimagereaderproxyprovider.toString());
                }
            }
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest, httpContext);
            if (httpResponseExecute != null) {
                try {
                    StatusLine statusLine = httpResponseExecute.getStatusLine();
                    if (statusLine != null) {
                        statusCode = statusLine.getStatusCode();
                        try {
                            getimagereaderproxyprovider.f79a = statusLine.getReasonPhrase();
                        } catch (Exception e2) {
                            e = e2;
                            if (getimagereaderproxyprovider.f79a == null) {
                                getimagereaderproxyprovider.f79a = e.getMessage();
                            }
                        }
                    } else {
                        statusCode = 0;
                    }
                    try {
                        getimagereaderproxyprovider.asInterface = getImageReaderProxyProvider.O_(getimagereaderproxyprovider.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        getimagereaderproxyprovider.asBinder = getImageReaderProxyProvider.P_(httpResponseExecute);
                    } catch (Exception e3) {
                        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            ViewPort.TuitionPaymentFragmentbindingInflater1(e3.getMessage());
                        }
                        getimagereaderproxyprovider.asInterface = -1L;
                        getimagereaderproxyprovider.asBinder = -1L;
                    }
                    Header[] headers = httpResponseExecute.getHeaders("Server-Timing");
                    ArrayList arrayList = new ArrayList();
                    for (Header header : headers) {
                        arrayList.add(header.getValue());
                    }
                    getimagereaderproxyprovider.INotificationSideChannel = new getErrorEdge().TuitionPaymentFragmentspecialinlinedviewModeldefault1(arrayList);
                } catch (Exception e4) {
                    e = e4;
                    statusCode = 0;
                }
                getimagereaderproxyprovider.g = statusCode;
            }
            getimagereaderproxyprovider.onTransact = CbConstants.WrStates.POST_EXEC_OK;
            try {
                CameraCoordinatorCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(getimagereaderproxyprovider);
            } catch (Exception unused2) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.TuitionPaymentFragmentbindingInflater1(getimagereaderproxyprovider.toString());
                }
            }
            return httpResponseExecute;
        } catch (Exception e5) {
            getimagereaderproxyprovider.g = 0;
            getimagereaderproxyprovider.f79a = e5.toString();
            getimagereaderproxyprovider.onTransact = CbConstants.WrStates.POST_EXEC_ERR;
            try {
                CameraCoordinatorCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(getimagereaderproxyprovider);
            } catch (Exception unused3) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.TuitionPaymentFragmentbindingInflater1(getimagereaderproxyprovider.toString());
                }
            }
            throw e5;
        }
    }
}
