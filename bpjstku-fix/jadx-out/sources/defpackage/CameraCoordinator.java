package defpackage;

import com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1;
import com.dynatrace.android.callback.CbConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
final class CameraCoordinator extends AutoValue_CaptureNode_In {
    private static final String b;
    Request TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("OkRequestStateParms");
        b = sb.toString();
    }

    CameraCoordinator(Request request, CbConstants.WrMethod wrMethod, CbConstants.WrStates wrStates) {
        super(wrMethod, wrStates, 0);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = request;
    }

    @Override // defpackage.AutoValue_CaptureNode_In
    final String TuitionPaymentFragmentbindingInflater1() {
        Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.url().toString()};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (String) ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault1(HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -739829131, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 739829131, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // defpackage.AutoValue_CaptureNode_In
    final String b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.url().host();
    }

    @Override // defpackage.AutoValue_CaptureNode_In
    final String TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.method();
    }

    @Override // defpackage.AutoValue_CaptureNode_In
    protected final String TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        Request request = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (request != null) {
            return request.getClass().getSimpleName();
        }
        return "NA";
    }

    final void TuitionPaymentFragmentbindingInflater1(Response response) {
        Response responseNetworkResponse = response.networkResponse();
        if (responseNetworkResponse != null) {
            try {
                Request request = responseNetworkResponse.request();
                long length = responseNetworkResponse.protocol().toString().length();
                this.asInterface = ((long) (request.method().length() + request.url().url().getFile().length())) + length + 4 + b(request.headers().toMultimap()) + 2;
                this.asBinder = length + ((long) String.valueOf(responseNetworkResponse.code()).length()) + ((long) responseNetworkResponse.message().length()) + 4 + b(responseNetworkResponse.headers().toMultimap()) + 2;
            } catch (Exception e2) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.TuitionPaymentFragmentbindingInflater1(e2.getMessage());
                }
                this.asInterface = -1L;
                this.asBinder = -1L;
            }
        }
    }

    private static long b(Map<String, List<String>> map) {
        long length = 0;
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            long length2 = entry.getKey().length() + 4;
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                length += ((long) it.next().length()) + length2;
            }
            if ("Content-Length".equalsIgnoreCase(entry.getKey()) && entry.getValue().size() > 0) {
                try {
                    length += Long.parseLong(entry.getValue().get(0));
                } catch (NumberFormatException unused) {
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        ViewPort.TuitionPaymentFragmentbindingInflater1("invalid content length");
                    }
                }
            }
        }
        return length;
    }
}
