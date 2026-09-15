package okhttp3.internal.http;

import defpackage.RotationProviderListener;
import defpackage.SurfaceViewImplementation;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "", "p0", "<init>", "(Z)V", "Lokhttp3/Interceptor$Chain;", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "", "shouldIgnoreAndWaitForRealResponse", "(I)Z", "forWebSocket", "Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    private final boolean shouldIgnoreAndWaitForRealResponse(int p0) {
        if (p0 == 100) {
            return true;
        }
        return 102 <= p0 && p0 < 200;
    }

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5 A[Catch: IOException -> 0x019f, TryCatch #2 {IOException -> 0x019f, blocks: (B:43:0x00ac, B:45:0x00b5, B:46:0x00b9, B:48:0x00e3, B:50:0x00ec, B:51:0x00ef, B:52:0x0113, B:56:0x011e, B:58:0x013d, B:60:0x014b, B:67:0x0161, B:69:0x0167, B:73:0x0174, B:75:0x018b, B:76:0x0193, B:77:0x019d, B:62:0x0156, B:57:0x012d), top: B:90:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e3 A[Catch: IOException -> 0x019f, TryCatch #2 {IOException -> 0x019f, blocks: (B:43:0x00ac, B:45:0x00b5, B:46:0x00b9, B:48:0x00e3, B:50:0x00ec, B:51:0x00ef, B:52:0x0113, B:56:0x011e, B:58:0x013d, B:60:0x014b, B:67:0x0161, B:69:0x0167, B:73:0x0174, B:75:0x018b, B:76:0x0193, B:77:0x019d, B:62:0x0156, B:57:0x012d), top: B:90:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ec A[Catch: IOException -> 0x019f, TryCatch #2 {IOException -> 0x019f, blocks: (B:43:0x00ac, B:45:0x00b5, B:46:0x00b9, B:48:0x00e3, B:50:0x00ec, B:51:0x00ef, B:52:0x0113, B:56:0x011e, B:58:0x013d, B:60:0x014b, B:67:0x0161, B:69:0x0167, B:73:0x0174, B:75:0x018b, B:76:0x0193, B:77:0x019d, B:62:0x0156, B:57:0x012d), top: B:90:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:57:0x012d A[Catch: IOException -> 0x019f, TryCatch #2 {IOException -> 0x019f, blocks: (B:43:0x00ac, B:45:0x00b5, B:46:0x00b9, B:48:0x00e3, B:50:0x00ec, B:51:0x00ef, B:52:0x0113, B:56:0x011e, B:58:0x013d, B:60:0x014b, B:67:0x0161, B:69:0x0167, B:73:0x0174, B:75:0x018b, B:76:0x0193, B:77:0x019d, B:62:0x0156, B:57:0x012d), top: B:90:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0156 A[Catch: IOException -> 0x019f, TryCatch #2 {IOException -> 0x019f, blocks: (B:43:0x00ac, B:45:0x00b5, B:46:0x00b9, B:48:0x00e3, B:50:0x00ec, B:51:0x00ef, B:52:0x0113, B:56:0x011e, B:58:0x013d, B:60:0x014b, B:67:0x0161, B:69:0x0167, B:73:0x0174, B:75:0x018b, B:76:0x0193, B:77:0x019d, B:62:0x0156, B:57:0x012d), top: B:90:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0161 A[Catch: IOException -> 0x019f, TryCatch #2 {IOException -> 0x019f, blocks: (B:43:0x00ac, B:45:0x00b5, B:46:0x00b9, B:48:0x00e3, B:50:0x00ec, B:51:0x00ef, B:52:0x0113, B:56:0x011e, B:58:0x013d, B:60:0x014b, B:67:0x0161, B:69:0x0167, B:73:0x0174, B:75:0x018b, B:76:0x0193, B:77:0x019d, B:62:0x0156, B:57:0x012d), top: B:90:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0167 A[Catch: IOException -> 0x019f, TryCatch #2 {IOException -> 0x019f, blocks: (B:43:0x00ac, B:45:0x00b5, B:46:0x00b9, B:48:0x00e3, B:50:0x00ec, B:51:0x00ef, B:52:0x0113, B:56:0x011e, B:58:0x013d, B:60:0x014b, B:67:0x0161, B:69:0x0167, B:73:0x0174, B:75:0x018b, B:76:0x0193, B:77:0x019d, B:62:0x0156, B:57:0x012d), top: B:90:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:70:0x016c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0174 A[Catch: IOException -> 0x019f, TryCatch #2 {IOException -> 0x019f, blocks: (B:43:0x00ac, B:45:0x00b5, B:46:0x00b9, B:48:0x00e3, B:50:0x00ec, B:51:0x00ef, B:52:0x0113, B:56:0x011e, B:58:0x013d, B:60:0x014b, B:67:0x0161, B:69:0x0167, B:73:0x0174, B:75:0x018b, B:76:0x0193, B:77:0x019d, B:62:0x0156, B:57:0x012d), top: B:90:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:75:0x018b A[Catch: IOException -> 0x019f, TryCatch #2 {IOException -> 0x019f, blocks: (B:43:0x00ac, B:45:0x00b5, B:46:0x00b9, B:48:0x00e3, B:50:0x00ec, B:51:0x00ef, B:52:0x0113, B:56:0x011e, B:58:0x013d, B:60:0x014b, B:67:0x0161, B:69:0x0167, B:73:0x0174, B:75:0x018b, B:76:0x0193, B:77:0x019d, B:62:0x0156, B:57:0x012d), top: B:90:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01ad A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:90:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain p0) throws Throwable {
        Response.Builder responseHeaders;
        boolean z;
        Response responseBuild;
        int iCode;
        Response responseBuild2;
        ResponseBody responseBodyBody;
        long contentLength;
        Intrinsics.checkNotNullParameter(p0, "");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) p0;
        Exchange exchange$okhttp = realInterceptorChain.getExchange$okhttp();
        Intrinsics.checkNotNull(exchange$okhttp);
        Request request$okhttp = realInterceptorChain.getRequest$okhttp();
        RequestBody requestBodyBody = request$okhttp.body();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            exchange$okhttp.writeRequestHeaders(request$okhttp);
            if (HttpMethod.permitsRequestBody(request$okhttp.method()) && requestBodyBody != null) {
                if (StringsKt.equals("100-continue", request$okhttp.header("Expect"), true)) {
                    exchange$okhttp.flushRequest();
                    responseHeaders = exchange$okhttp.readResponseHeaders(true);
                    try {
                        exchange$okhttp.responseHeadersStart();
                        z = false;
                    } catch (IOException e2) {
                        e = e2;
                        z = true;
                        if (!(e instanceof ConnectionShutdownException) || !exchange$okhttp.getHasFailure$okhttp()) {
                            throw e;
                        }
                        if (responseHeaders == null) {
                            try {
                                responseHeaders = exchange$okhttp.readResponseHeaders(false);
                                Intrinsics.checkNotNull(responseHeaders);
                                if (z) {
                                    exchange$okhttp.responseHeadersStart();
                                    z = false;
                                }
                            } catch (IOException e3) {
                                if (e != null) {
                                    ExceptionsKt.addSuppressed(e, e3);
                                    throw e;
                                }
                                throw e3;
                            }
                        }
                        responseBuild = responseHeaders.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
                        iCode = responseBuild.code();
                        if (shouldIgnoreAndWaitForRealResponse(iCode)) {
                            Response.Builder responseHeaders2 = exchange$okhttp.readResponseHeaders(false);
                            Intrinsics.checkNotNull(responseHeaders2);
                            if (z) {
                                exchange$okhttp.responseHeadersStart();
                            }
                            responseBuild = responseHeaders2.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
                            iCode = responseBuild.code();
                        }
                        exchange$okhttp.responseHeadersEnd(responseBuild);
                        if (!this.forWebSocket) {
                            responseBuild2 = responseBuild.newBuilder().body(exchange$okhttp.openResponseBody(responseBuild)).build();
                        } else {
                            responseBuild2 = responseBuild.newBuilder().body(exchange$okhttp.openResponseBody(responseBuild)).build();
                        }
                        if (!StringsKt.equals("close", responseBuild2.request().header("Connection"), true)) {
                            exchange$okhttp.noNewExchangesOnConnection();
                        } else {
                            exchange$okhttp.noNewExchangesOnConnection();
                        }
                        if (iCode != 204) {
                            responseBodyBody = responseBuild2.body();
                            if (responseBodyBody != null) {
                                contentLength = responseBodyBody.getContentLength();
                            } else {
                                contentLength = -1;
                            }
                            if (contentLength > 0) {
                                StringBuilder sb = new StringBuilder("HTTP ");
                                sb.append(iCode);
                                sb.append(" had non-zero Content-Length: ");
                                ResponseBody responseBodyBody2 = responseBuild2.body();
                                sb.append(responseBodyBody2 != null ? Long.valueOf(responseBodyBody2.getContentLength()) : null);
                                throw new ProtocolException(sb.toString());
                            }
                        } else {
                            responseBodyBody = responseBuild2.body();
                            if (responseBodyBody != null) {
                                contentLength = responseBodyBody.getContentLength();
                            } else {
                                contentLength = -1;
                            }
                            if (contentLength > 0) {
                                StringBuilder sb2 = new StringBuilder("HTTP ");
                                sb2.append(iCode);
                                sb2.append(" had non-zero Content-Length: ");
                                ResponseBody responseBodyBody3 = responseBuild2.body();
                                sb2.append(responseBodyBody3 != null ? Long.valueOf(responseBodyBody3.getContentLength()) : null);
                                throw new ProtocolException(sb2.toString());
                            }
                        }
                        return responseBuild2;
                    }
                } else {
                    responseHeaders = null;
                    z = true;
                }
                if (responseHeaders == null) {
                    try {
                        if (requestBodyBody.isDuplex()) {
                            exchange$okhttp.flushRequest();
                            requestBodyBody.writeTo(SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(exchange$okhttp.createRequestBody(request$okhttp, true)));
                        } else {
                            RotationProviderListener rotationProviderListenerTuitionPaymentFragmentbindingInflater1 = SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(exchange$okhttp.createRequestBody(request$okhttp, false));
                            requestBodyBody.writeTo(rotationProviderListenerTuitionPaymentFragmentbindingInflater1);
                            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.close();
                        }
                    } catch (IOException e4) {
                        e = e4;
                        if (!(e instanceof ConnectionShutdownException)) {
                            throw e;
                        }
                        throw e;
                    }
                } else {
                    try {
                        exchange$okhttp.noRequestBody();
                        if (!exchange$okhttp.getConnection$okhttp().isMultiplexed$okhttp()) {
                            exchange$okhttp.noNewExchangesOnConnection();
                        }
                        z = false;
                    } catch (IOException e5) {
                        e = e5;
                        z = false;
                        if (!(e instanceof ConnectionShutdownException)) {
                            throw e;
                        }
                        throw e;
                    }
                }
            } else {
                exchange$okhttp.noRequestBody();
                responseHeaders = null;
                z = true;
            }
            if (requestBodyBody == null || !requestBodyBody.isDuplex()) {
                exchange$okhttp.finishRequest();
            }
            e = null;
        } catch (IOException e6) {
            e = e6;
            responseHeaders = null;
        }
        if (responseHeaders == null) {
            responseHeaders = exchange$okhttp.readResponseHeaders(false);
            Intrinsics.checkNotNull(responseHeaders);
            if (z) {
                exchange$okhttp.responseHeadersStart();
                z = false;
            }
        }
        responseBuild = responseHeaders.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        iCode = responseBuild.code();
        if (shouldIgnoreAndWaitForRealResponse(iCode)) {
            Response.Builder responseHeaders3 = exchange$okhttp.readResponseHeaders(false);
            Intrinsics.checkNotNull(responseHeaders3);
            if (z) {
                exchange$okhttp.responseHeadersStart();
            }
            responseBuild = responseHeaders3.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            iCode = responseBuild.code();
        }
        exchange$okhttp.responseHeadersEnd(responseBuild);
        if (!this.forWebSocket && iCode == 101) {
            responseBuild2 = responseBuild.newBuilder().body(Util.EMPTY_RESPONSE).build();
        } else {
            responseBuild2 = responseBuild.newBuilder().body(exchange$okhttp.openResponseBody(responseBuild)).build();
        }
        if (!StringsKt.equals("close", responseBuild2.request().header("Connection"), true) || StringsKt.equals("close", Response.header$default(responseBuild2, "Connection", null, 2, null), true)) {
            exchange$okhttp.noNewExchangesOnConnection();
        }
        if (iCode != 204 || iCode == 205) {
            responseBodyBody = responseBuild2.body();
            if (responseBodyBody != null) {
                contentLength = responseBodyBody.getContentLength();
            } else {
                contentLength = -1;
            }
            if (contentLength > 0) {
                StringBuilder sb3 = new StringBuilder("HTTP ");
                sb3.append(iCode);
                sb3.append(" had non-zero Content-Length: ");
                ResponseBody responseBodyBody4 = responseBuild2.body();
                sb3.append(responseBodyBody4 != null ? Long.valueOf(responseBodyBody4.getContentLength()) : null);
                throw new ProtocolException(sb3.toString());
            }
        }
        return responseBuild2;
    }
}
