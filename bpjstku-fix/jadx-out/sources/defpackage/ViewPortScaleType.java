package defpackage;

import com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicHttpRequest;

/* JADX INFO: loaded from: classes6.dex */
final class ViewPortScaleType {
    private static final String TuitionPaymentFragmentbindingInflater1;
    String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private URI TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    ViewPortScaleType() {
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("CbURIDesc");
        TuitionPaymentFragmentbindingInflater1 = sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    static ViewPortScaleType H_(HttpRequest httpRequest, HttpHost httpHost) {
        RequestLine requestLine;
        String uri;
        int iIndexOf;
        ViewPortScaleType viewPortScaleType = new ViewPortScaleType();
        String strSubstring = null;
        String string = httpHost == null ? null : httpHost.toString();
        if (httpRequest instanceof HttpUriRequest) {
            URI uri2 = ((HttpUriRequest) httpRequest).getURI();
            if (uri2 != null) {
                if (uri2.getRawPath() == null) {
                    if (uri2.getHost() != null) {
                        strSubstring = "/";
                    }
                } else if (!uri2.getRawPath().startsWith("/")) {
                    if (uri2.getRawPath().length() == 0) {
                        strSubstring = "/";
                    }
                } else {
                    strSubstring = uri2.getRawPath();
                    if (uri2.getQuery() != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(strSubstring);
                        sb.append("?");
                        sb.append(uri2.getRawQuery());
                        strSubstring = sb.toString();
                    }
                    if (uri2.getFragment() != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(strSubstring);
                        sb2.append("#");
                        sb2.append(uri2.getRawFragment());
                        strSubstring = sb2.toString();
                    }
                }
            }
        } else if (((httpRequest instanceof HttpEntityEnclosingRequest) || (httpRequest instanceof BasicHttpRequest)) && (requestLine = httpRequest.getRequestLine()) != null && (uri = requestLine.getUri()) != null) {
            if (uri.startsWith("/")) {
                strSubstring = uri;
            } else {
                int iIndexOf2 = uri.indexOf("://");
                if (iIndexOf2 >= 0 && (iIndexOf = uri.indexOf("/", iIndexOf2 + 3)) >= 0) {
                    strSubstring = uri.substring(iIndexOf);
                }
            }
        }
        if (string != null && strSubstring != null) {
            try {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(strSubstring);
                viewPortScaleType.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new URI(sb3.toString());
                viewPortScaleType.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = httpHost.getHostName();
                viewPortScaleType.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (String) ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault1(HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -739829131, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 739829131, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{viewPortScaleType.TuitionPaymentFragmentspecialinlinedviewModeldefault2.toString()}, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                return viewPortScaleType;
            } catch (URISyntaxException e2) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.TuitionPaymentFragmentbindingInflater1(e2.toString());
                }
            }
        }
        if (string == null) {
            viewPortScaleType.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "-";
            string = "-";
        } else {
            viewPortScaleType.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = httpHost.getHostName();
        }
        if (strSubstring == null) {
            strSubstring = "-";
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(string);
        sb4.append(" ");
        sb4.append(strSubstring);
        viewPortScaleType.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (String) ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault1(HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -739829131, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 739829131, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{sb4.toString()}, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        return viewPortScaleType;
    }
}
