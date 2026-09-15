package okhttp3;

import kotlin.Metadata;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0016J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0014H&¢\u0006\u0004\b\u0012\u0010\u0015"}, d2 = {"Lokhttp3/WebSocket;", "", "", "cancel", "()V", "", "p0", "", "p1", "", "close", "(ILjava/lang/String;)Z", "", "queueSize", "()J", "Lokhttp3/Request;", "request", "()Lokhttp3/Request;", "send", "(Ljava/lang/String;)Z", "Lokio/ByteString;", "(Lokio/ByteString;)Z", "Factory"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface WebSocket {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lokhttp3/WebSocket$Factory;", "", "Lokhttp3/Request;", "p0", "Lokhttp3/WebSocketListener;", "p1", "Lokhttp3/WebSocket;", "newWebSocket", "(Lokhttp3/Request;Lokhttp3/WebSocketListener;)Lokhttp3/WebSocket;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Factory {
        WebSocket newWebSocket(Request p0, WebSocketListener p1);
    }

    void cancel();

    boolean close(int p0, String p1);

    long queueSize();

    Request request();

    boolean send(String p0);

    boolean send(ByteString p0);
}
