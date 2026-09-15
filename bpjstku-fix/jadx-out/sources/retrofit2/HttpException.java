package retrofit2;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class HttpException extends RuntimeException {
    private final int code;
    private final String message;
    private final transient Response<?> response;

    private static String getMessage(Response<?> response) {
        Objects.requireNonNull(response, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        sb.append(response.code());
        sb.append(" ");
        sb.append(response.message());
        return sb.toString();
    }

    public HttpException(Response<?> response) {
        super(getMessage(response));
        this.code = response.code();
        this.message = response.message();
        this.response = response;
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public Response<?> response() {
        return this.response;
    }
}
