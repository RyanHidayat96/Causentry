package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ConnectionSpec;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lokhttp3/internal/connection/ConnectionSpecSelector;", "", "", "Lokhttp3/ConnectionSpec;", "p0", "<init>", "(Ljava/util/List;)V", "Ljavax/net/ssl/SSLSocket;", "configureSecureSocket", "(Ljavax/net/ssl/SSLSocket;)Lokhttp3/ConnectionSpec;", "Ljava/io/IOException;", "", "connectionFailed", "(Ljava/io/IOException;)Z", "isFallbackPossible", "(Ljavax/net/ssl/SSLSocket;)Z", "connectionSpecs", "Ljava/util/List;", "isFallback", "Z", "", "nextModeIndex", "I"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConnectionSpecSelector {
    private final List<ConnectionSpec> connectionSpecs;
    private boolean isFallback;
    private boolean isFallbackPossible;
    private int nextModeIndex;

    public ConnectionSpecSelector(List<ConnectionSpec> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.connectionSpecs = list;
    }

    public final ConnectionSpec configureSecureSocket(SSLSocket p0) throws IOException {
        ConnectionSpec connectionSpec;
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this.nextModeIndex;
        int size = this.connectionSpecs.size();
        while (true) {
            if (i >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = this.connectionSpecs.get(i);
            if (connectionSpec.isCompatible(p0)) {
                this.nextModeIndex = i + 1;
                break;
            }
            i++;
        }
        if (connectionSpec == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.isFallback);
            sb.append(", modes=");
            sb.append(this.connectionSpecs);
            sb.append(", supported protocols=");
            String[] enabledProtocols = p0.getEnabledProtocols();
            Intrinsics.checkNotNull(enabledProtocols);
            String string = Arrays.toString(enabledProtocols);
            Intrinsics.checkNotNullExpressionValue(string, "");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        this.isFallbackPossible = isFallbackPossible(p0);
        connectionSpec.apply$okhttp(p0, this.isFallback);
        return connectionSpec;
    }

    public final boolean connectionFailed(IOException p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.isFallback = true;
        if (!this.isFallbackPossible || (p0 instanceof ProtocolException) || (p0 instanceof InterruptedIOException)) {
            return false;
        }
        return (((p0 instanceof SSLHandshakeException) && (p0.getCause() instanceof CertificateException)) || (p0 instanceof SSLPeerUnverifiedException) || !(p0 instanceof SSLException)) ? false : true;
    }

    private final boolean isFallbackPossible(SSLSocket p0) {
        int size = this.connectionSpecs.size();
        for (int i = this.nextModeIndex; i < size; i++) {
            if (this.connectionSpecs.get(i).isCompatible(p0)) {
                return true;
            }
        }
        return false;
    }
}
