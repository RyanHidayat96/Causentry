package coil.network;

import kotlin.Metadata;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcoil/network/HttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "Lokhttp3/Response;", "p0", "<init>", "(Lokhttp3/Response;)V", "response", "Lokhttp3/Response;", "getResponse", "()Lokhttp3/Response;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpException extends RuntimeException {
    private final Response response;

    public final Response getResponse() {
        return this.response;
    }

    public HttpException(Response response) {
        StringBuilder sb = new StringBuilder("HTTP ");
        sb.append(response.code());
        sb.append(": ");
        sb.append(response.message());
        super(sb.toString());
        this.response = response;
    }
}
