package okhttp3.internal.http2;

import defpackage.ProcessCameraProviderWrapper;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListenerWrapper;
import defpackage.SurfaceViewImplementationApi24Impl;
import defpackage.cancelPreviousRequest;
import defpackage.tryToComplete;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 n2\u00020\u0001:\u0004nopqB3\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0014¢\u0006\u0004\b,\u0010\u001bJ\u000f\u0010-\u001a\u00020\tH\u0007¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\tH\u0007¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u000eH\u0000¢\u0006\u0004\b0\u0010\u0012J+\u00103\u001a\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u000202012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020$H\u0007¢\u0006\u0004\b5\u0010&R\u001a\u00106\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R$\u0010:\u001a\u0004\u0018\u00010\u00148A@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010\u001bR$\u0010?\u001a\u0004\u0018\u00010\u00158\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\t0G8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0011\u0010N\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0011\u0010P\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bP\u0010OR*\u0010Q\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010\u0010R*\u0010V\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010R\u001a\u0004\bW\u0010T\"\u0004\bX\u0010\u0010R\u001e\u0010%\u001a\u00060YR\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b%\u0010Z\u001a\u0004\b[\u0010\\R\u001e\u0010^\u001a\u00060]R\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001e\u0010c\u001a\u00060bR\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR*\u0010g\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\bg\u0010R\u001a\u0004\bh\u0010T\"\u0004\bi\u0010\u0010R*\u0010j\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\bj\u0010R\u001a\u0004\bk\u0010T\"\u0004\bl\u0010\u0010R\u001e\u00105\u001a\u00060YR\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b5\u0010Z\u001a\u0004\bm\u0010\\"}, d2 = {"Lokhttp3/internal/http2/Http2Stream;", "", "", "p0", "Lokhttp3/internal/http2/Http2Connection;", "p1", "", "p2", "p3", "Lokhttp3/Headers;", "p4", "<init>", "(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V", "", "", "addBytesToWriteWindow", "(J)V", "cancelStreamIfNecessary$okhttp", "()V", "checkOutNotClosed$okhttp", "Lokhttp3/internal/http2/ErrorCode;", "Ljava/io/IOException;", "close", "(Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", "closeInternal", "(Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)Z", "closeLater", "(Lokhttp3/internal/http2/ErrorCode;)V", "enqueueTrailers", "(Lokhttp3/Headers;)V", "LSurfaceViewImplementationApi24Impl;", "getSink", "()LSurfaceViewImplementationApi24Impl;", "LtryToComplete;", "getSource", "()LtryToComplete;", "LcancelPreviousRequest;", "readTimeout", "()LcancelPreviousRequest;", "LRotationProvider1;", "receiveData", "(LRotationProvider1;I)V", "receiveHeaders", "(Lokhttp3/Headers;Z)V", "receiveRstStream", "takeHeaders", "()Lokhttp3/Headers;", "trailers", "waitForIo$okhttp", "", "Lokhttp3/internal/http2/Header;", "writeHeaders", "(Ljava/util/List;ZZ)V", "writeTimeout", "connection", "Lokhttp3/internal/http2/Http2Connection;", "getConnection", "()Lokhttp3/internal/http2/Http2Connection;", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "getErrorCode$okhttp", "()Lokhttp3/internal/http2/ErrorCode;", "setErrorCode$okhttp", "errorException", "Ljava/io/IOException;", "getErrorException$okhttp", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "hasResponseHeaders", "Z", "Ljava/util/ArrayDeque;", "headersQueue", "Ljava/util/ArrayDeque;", "id", "I", "getId", "()I", "isLocallyInitiated", "()Z", "isOpen", "readBytesAcknowledged", "J", "getReadBytesAcknowledged", "()J", "setReadBytesAcknowledged$okhttp", "readBytesTotal", "getReadBytesTotal", "setReadBytesTotal$okhttp", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getReadTimeout$okhttp", "()Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "sink", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "getSink$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "source", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "getSource$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSource;", "writeBytesMaximum", "getWriteBytesMaximum", "setWriteBytesMaximum$okhttp", "writeBytesTotal", "getWriteBytesTotal", "setWriteBytesTotal$okhttp", "getWriteTimeout$okhttp", "Companion", "FramingSink", "FramingSource", "StreamTimeout"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Http2Stream {
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final Http2Connection connection;
    private ErrorCode errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue;
    private final int id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final StreamTimeout readTimeout;
    private final FramingSink sink;
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final StreamTimeout writeTimeout;

    public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
        Intrinsics.checkNotNullParameter(http2Connection, "");
        this.id = i;
        this.connection = http2Connection;
        this.writeBytesMaximum = http2Connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(http2Connection.getOkHttpSettings().getInitialWindowSize(), z2);
        this.sink = new FramingSink(z);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (headers != null) {
            if (isLocallyInitiated()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(headers);
        } else if (!isLocallyInitiated()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final int getId() {
        return this.id;
    }

    public final Http2Connection getConnection() {
        return this.connection;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final void setReadBytesTotal$okhttp(long j) {
        this.readBytesTotal = j;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final void setReadBytesAcknowledged$okhttp(long j) {
        this.readBytesAcknowledged = j;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final void setWriteBytesTotal$okhttp(long j) {
        this.writeBytesTotal = j;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final void setWriteBytesMaximum$okhttp(long j) {
        this.writeBytesMaximum = j;
    }

    /* JADX INFO: renamed from: getSource$okhttp, reason: from getter */
    public final FramingSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: getSink$okhttp, reason: from getter */
    public final FramingSink getSink() {
        return this.sink;
    }

    /* JADX INFO: renamed from: getReadTimeout$okhttp, reason: from getter */
    public final StreamTimeout getReadTimeout() {
        return this.readTimeout;
    }

    /* JADX INFO: renamed from: getWriteTimeout$okhttp, reason: from getter */
    public final StreamTimeout getWriteTimeout() {
        return this.writeTimeout;
    }

    public final ErrorCode getErrorCode$okhttp() {
        ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.errorCode;
        }
        return errorCode;
    }

    public final void setErrorCode$okhttp(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    /* JADX INFO: renamed from: getErrorException$okhttp, reason: from getter */
    public final IOException getErrorException() {
        return this.errorException;
    }

    public final void setErrorException$okhttp(IOException iOException) {
        this.errorException = iOException;
    }

    public final boolean isOpen() {
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            return ((this.source.getFinished() || this.source.getClosed()) && (this.sink.getFinished() || this.sink.getClosed()) && this.hasResponseHeaders) ? false : true;
        }
    }

    public final boolean isLocallyInitiated() {
        return this.connection.getClient() == ((this.id & 1) == 1);
    }

    public final Headers takeHeaders() throws IOException {
        Headers headers;
        synchronized (this) {
            this.readTimeout.enter();
            while (this.headersQueue.isEmpty() && this.errorCode == null) {
                try {
                    waitForIo$okhttp();
                } catch (Throwable th) {
                    this.readTimeout.exitAndThrowIfTimedOut();
                    throw th;
                }
            }
            this.readTimeout.exitAndThrowIfTimedOut();
            if (!this.headersQueue.isEmpty()) {
                Headers headersRemoveFirst = this.headersQueue.removeFirst();
                Intrinsics.checkNotNullExpressionValue(headersRemoveFirst, "");
                headers = headersRemoveFirst;
            } else {
                IOException streamResetException = this.errorException;
                if (streamResetException == null) {
                    ErrorCode errorCode = this.errorCode;
                    Intrinsics.checkNotNull(errorCode);
                    streamResetException = new StreamResetException(errorCode);
                }
                throw streamResetException;
            }
        }
        return headers;
    }

    public final Headers trailers() throws IOException {
        Headers trailers;
        synchronized (this) {
            if (this.source.getFinished() && this.source.getReceiveBuffer().size == 0 && this.source.getReadBuffer().size == 0) {
                trailers = this.source.getTrailers();
                if (trailers == null) {
                    trailers = Util.EMPTY_HEADERS;
                }
            } else {
                ErrorCode errorCode = this.errorCode;
                if (errorCode != null) {
                    Throwable streamResetException = this.errorException;
                    if (streamResetException == null) {
                        Intrinsics.checkNotNull(errorCode);
                        streamResetException = new StreamResetException(errorCode);
                    }
                    throw streamResetException;
                }
                throw new IllegalStateException("too early; can't read the trailers yet");
            }
        }
        return trailers;
    }

    public final void enqueueTrailers(Headers p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this) {
            if (this.sink.getFinished()) {
                throw new IllegalStateException("already finished".toString());
            }
            if (p0.size() == 0) {
                throw new IllegalArgumentException("trailers.size() == 0".toString());
            }
            this.sink.setTrailers(p0);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final cancelPreviousRequest readTimeout() {
        return this.readTimeout;
    }

    public final cancelPreviousRequest writeTimeout() {
        return this.writeTimeout;
    }

    public final tryToComplete getSource() {
        return this.source;
    }

    public final SurfaceViewImplementationApi24Impl getSink() {
        synchronized (this) {
            if (!this.hasResponseHeaders && !isLocallyInitiated()) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        return this.sink;
    }

    public final void close(ErrorCode p0, IOException p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        if (closeInternal(p0, p1)) {
            this.connection.writeSynReset$okhttp(this.id, p0);
        }
    }

    public final void closeLater(ErrorCode p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (closeInternal(p0, null)) {
            this.connection.writeSynResetLater$okhttp(this.id, p0);
        }
    }

    public final void receiveRstStream(ErrorCode p0) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (this.errorCode == null) {
                this.errorCode = p0;
                Intrinsics.checkNotNull(this, "");
                notifyAll();
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R$\u0010(\u001a\u0004\u0018\u00010'8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "LtryToComplete;", "", "p0", "", "p1", "<init>", "(Lokhttp3/internal/http2/Http2Stream;JZ)V", "", "close", "()V", "LRotationProviderListenerWrapper;", "read", "(LRotationProviderListenerWrapper;J)J", "LRotationProvider1;", "receive$okhttp", "(LRotationProvider1;J)V", "LcancelPreviousRequest;", "timeout", "()LcancelPreviousRequest;", "updateConnectionFlowControl", "(J)V", "closed", "Z", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "finished", "getFinished$okhttp", "setFinished$okhttp", "maxByteCount", "J", "readBuffer", "LRotationProviderListenerWrapper;", "getReadBuffer", "()LRotationProviderListenerWrapper;", "receiveBuffer", "getReceiveBuffer", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class FramingSource implements tryToComplete {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private Headers trailers;
        private final RotationProviderListenerWrapper receiveBuffer = new RotationProviderListenerWrapper();
        private final RotationProviderListenerWrapper readBuffer = new RotationProviderListenerWrapper();

        public FramingSource(long j, boolean z) {
            this.maxByteCount = j;
            this.finished = z;
        }

        /* JADX INFO: renamed from: getFinished$okhttp, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        public final void setFinished$okhttp(boolean z) {
            this.finished = z;
        }

        public final RotationProviderListenerWrapper getReceiveBuffer() {
            return this.receiveBuffer;
        }

        public final RotationProviderListenerWrapper getReadBuffer() {
            return this.readBuffer;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        /* JADX INFO: renamed from: getClosed$okhttp, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        public final void setClosed$okhttp(boolean z) {
            this.closed = z;
        }

        @Override // defpackage.tryToComplete
        public final long read(RotationProviderListenerWrapper p0, long p1) throws IOException {
            StreamResetException errorException;
            boolean z;
            long j;
            Intrinsics.checkNotNullParameter(p0, "");
            long j2 = 0;
            if (p1 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(p1)).toString());
            }
            while (true) {
                Http2Stream http2Stream = Http2Stream.this;
                synchronized (http2Stream) {
                    http2Stream.getReadTimeout().enter();
                    try {
                        if (http2Stream.getErrorCode$okhttp() == null || this.finished) {
                            errorException = null;
                        } else {
                            errorException = http2Stream.getErrorException();
                            if (errorException == null) {
                                ErrorCode errorCode$okhttp = http2Stream.getErrorCode$okhttp();
                                Intrinsics.checkNotNull(errorCode$okhttp);
                                errorException = new StreamResetException(errorCode$okhttp);
                            }
                        }
                        if (this.closed) {
                            throw new IOException("stream closed");
                        }
                        z = false;
                        if (this.readBuffer.size > j2) {
                            RotationProviderListenerWrapper rotationProviderListenerWrapper = this.readBuffer;
                            j = rotationProviderListenerWrapper.read(p0, Math.min(p1, rotationProviderListenerWrapper.size));
                            http2Stream.setReadBytesTotal$okhttp(http2Stream.getReadBytesTotal() + j);
                            long readBytesTotal = http2Stream.getReadBytesTotal() - http2Stream.getReadBytesAcknowledged();
                            if (errorException == null && readBytesTotal >= http2Stream.getConnection().getOkHttpSettings().getInitialWindowSize() / 2) {
                                http2Stream.getConnection().writeWindowUpdateLater$okhttp(http2Stream.getId(), readBytesTotal);
                                http2Stream.setReadBytesAcknowledged$okhttp(http2Stream.getReadBytesTotal());
                            }
                        } else {
                            if (!this.finished && errorException == null) {
                                http2Stream.waitForIo$okhttp();
                                z = true;
                            }
                            j = -1;
                        }
                        http2Stream.getReadTimeout().exitAndThrowIfTimedOut();
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        http2Stream.getReadTimeout().exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                if (!z) {
                    if (j != -1) {
                        return j;
                    }
                    if (errorException == null) {
                        return -1L;
                    }
                    throw errorException;
                }
                j2 = 0;
            }
        }

        private final void updateConnectionFlowControl(long p0) {
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(p0);
                return;
            }
            StringBuilder sb = new StringBuilder("Thread ");
            sb.append(Thread.currentThread().getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(http2Stream);
            throw new AssertionError(sb.toString());
        }

        public final void receive$okhttp(RotationProvider1 p0, long p1) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            Intrinsics.checkNotNullParameter(p0, "");
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                long j = p1;
                while (j > 0) {
                    synchronized (Http2Stream.this) {
                        z = this.finished;
                        z2 = true;
                        z3 = this.readBuffer.size + j > this.maxByteCount;
                        Unit unit = Unit.INSTANCE;
                    }
                    if (z3) {
                        p0.g(j);
                        Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                        return;
                    }
                    if (z) {
                        p0.g(j);
                        return;
                    }
                    long j2 = p0.read(this.receiveBuffer, j);
                    if (j2 == -1) {
                        throw new EOFException();
                    }
                    j -= j2;
                    Http2Stream http2Stream2 = Http2Stream.this;
                    synchronized (http2Stream2) {
                        if (this.closed) {
                            RotationProviderListenerWrapper rotationProviderListenerWrapper = this.receiveBuffer;
                            rotationProviderListenerWrapper.g(rotationProviderListenerWrapper.size);
                        } else {
                            if (this.readBuffer.size != 0) {
                                z2 = false;
                            }
                            this.readBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.receiveBuffer);
                            if (z2) {
                                Intrinsics.checkNotNull(http2Stream2, "");
                                http2Stream2.notifyAll();
                            }
                        }
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
                updateConnectionFlowControl(p1);
                return;
            }
            StringBuilder sb = new StringBuilder("Thread ");
            sb.append(Thread.currentThread().getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(http2Stream);
            throw new AssertionError(sb.toString());
        }

        @Override // defpackage.tryToComplete
        /* JADX INFO: renamed from: timeout */
        public final cancelPreviousRequest getTimeout() {
            return Http2Stream.this.getReadTimeout();
        }

        @Override // defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            long j;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.closed = true;
                j = this.readBuffer.size;
                RotationProviderListenerWrapper rotationProviderListenerWrapper = this.readBuffer;
                rotationProviderListenerWrapper.g(rotationProviderListenerWrapper.size);
                Intrinsics.checkNotNull(http2Stream, "");
                http2Stream.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
            if (j > 0) {
                updateConnectionFlowControl(j);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\nR\"\u0010\u0019\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\nR\u0014\u0010\u001c\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "LSurfaceViewImplementationApi24Impl;", "", "p0", "<init>", "(Lokhttp3/internal/http2/Http2Stream;Z)V", "", "close", "()V", "emitFrame", "(Z)V", "flush", "LcancelPreviousRequest;", "timeout", "()LcancelPreviousRequest;", "LRotationProviderListenerWrapper;", "", "p1", "write", "(LRotationProviderListenerWrapper;J)V", "closed", "Z", "getClosed", "()Z", "setClosed", "finished", "getFinished", "setFinished", "sendBuffer", "LRotationProviderListenerWrapper;", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class FramingSink implements SurfaceViewImplementationApi24Impl {
        private boolean closed;
        private boolean finished;
        private final RotationProviderListenerWrapper sendBuffer;
        private Headers trailers;

        public FramingSink(boolean z) {
            this.finished = z;
            this.sendBuffer = new RotationProviderListenerWrapper();
        }

        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final void setFinished(boolean z) {
            this.finished = z;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl
        public final void write(RotationProviderListenerWrapper p0, long p1) throws IOException {
            Intrinsics.checkNotNullParameter(p0, "");
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                this.sendBuffer.write(p0, p1);
                while (this.sendBuffer.size >= 16384) {
                    emitFrame(false);
                }
            } else {
                StringBuilder sb = new StringBuilder("Thread ");
                sb.append(Thread.currentThread().getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(http2Stream);
                throw new AssertionError(sb.toString());
            }
        }

        private final void emitFrame(boolean p0) throws IOException {
            long jMin;
            boolean z;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                http2Stream.getWriteTimeout().enter();
                while (http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum() && !this.finished && !this.closed && http2Stream.getErrorCode$okhttp() == null) {
                    try {
                        http2Stream.waitForIo$okhttp();
                    } catch (Throwable th) {
                        http2Stream.getWriteTimeout().exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                http2Stream.getWriteTimeout().exitAndThrowIfTimedOut();
                http2Stream.checkOutNotClosed$okhttp();
                jMin = Math.min(http2Stream.getWriteBytesMaximum() - http2Stream.getWriteBytesTotal(), this.sendBuffer.size);
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + jMin);
                z = p0 && jMin == this.sendBuffer.size;
                Unit unit = Unit.INSTANCE;
            }
            Http2Stream.this.getWriteTimeout().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z, this.sendBuffer, jMin);
            } finally {
                Http2Stream.this.getWriteTimeout().exitAndThrowIfTimedOut();
            }
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Flushable
        public final void flush() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                Http2Stream http2Stream2 = Http2Stream.this;
                synchronized (http2Stream2) {
                    http2Stream2.checkOutNotClosed$okhttp();
                    Unit unit = Unit.INSTANCE;
                }
                while (this.sendBuffer.size > 0) {
                    emitFrame(false);
                    Http2Stream.this.getConnection().flush();
                }
                return;
            }
            StringBuilder sb = new StringBuilder("Thread ");
            sb.append(Thread.currentThread().getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(http2Stream);
            throw new AssertionError(sb.toString());
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl
        public final cancelPreviousRequest timeout() {
            return Http2Stream.this.getWriteTimeout();
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                Http2Stream http2Stream2 = Http2Stream.this;
                synchronized (http2Stream2) {
                    if (this.closed) {
                        return;
                    }
                    boolean z = http2Stream2.getErrorCode$okhttp() == null;
                    Unit unit = Unit.INSTANCE;
                    if (!Http2Stream.this.getSink().finished) {
                        boolean z2 = this.sendBuffer.size > 0;
                        if (this.trailers != null) {
                            while (this.sendBuffer.size > 0) {
                                emitFrame(false);
                            }
                            Http2Connection connection = Http2Stream.this.getConnection();
                            int id2 = Http2Stream.this.getId();
                            Headers headers = this.trailers;
                            Intrinsics.checkNotNull(headers);
                            connection.writeHeaders$okhttp(id2, z, Util.toHeaderList(headers));
                        } else if (z2) {
                            while (this.sendBuffer.size > 0) {
                                emitFrame(true);
                            }
                        } else if (z) {
                            Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                        }
                    }
                    synchronized (Http2Stream.this) {
                        this.closed = true;
                        Unit unit2 = Unit.INSTANCE;
                    }
                    Http2Stream.this.getConnection().flush();
                    Http2Stream.this.cancelStreamIfNecessary$okhttp();
                    return;
                }
            }
            StringBuilder sb = new StringBuilder("Thread ");
            sb.append(Thread.currentThread().getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(http2Stream);
            throw new AssertionError(sb.toString());
        }
    }

    public final void addBytesToWriteWindow(long p0) {
        this.writeBytesMaximum += p0;
        if (p0 > 0) {
            Intrinsics.checkNotNull(this, "");
            notifyAll();
        }
    }

    public final void checkOutNotClosed$okhttp() throws Throwable {
        if (this.sink.getClosed()) {
            throw new IOException("stream closed");
        }
        if (this.sink.getFinished()) {
            throw new IOException("stream finished");
        }
        ErrorCode errorCode = this.errorCode;
        if (errorCode != null) {
            Throwable streamResetException = this.errorException;
            if (streamResetException == null) {
                Intrinsics.checkNotNull(errorCode);
                streamResetException = new StreamResetException(errorCode);
            }
            throw streamResetException;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0015¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\u0006"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "LProcessCameraProviderWrapper;", "<init>", "(Lokhttp3/internal/http2/Http2Stream;)V", "", "exitAndThrowIfTimedOut", "()V", "Ljava/io/IOException;", "p0", "newTimeoutException", "(Ljava/io/IOException;)Ljava/io/IOException;", "timedOut"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class StreamTimeout extends ProcessCameraProviderWrapper {
        public StreamTimeout() {
        }

        @Override // defpackage.ProcessCameraProviderWrapper
        public final void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
        }

        @Override // defpackage.ProcessCameraProviderWrapper
        public final IOException newTimeoutException(IOException p0) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (p0 != null) {
                socketTimeoutException.initCause(p0);
            }
            return socketTimeoutException;
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }
    }

    public final void writeHeaders(List<Header> p0, boolean p1, boolean p2) throws IOException {
        boolean z;
        Intrinsics.checkNotNullParameter(p0, "");
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            synchronized (this) {
                z = true;
                this.hasResponseHeaders = true;
                if (p1) {
                    this.sink.setFinished(true);
                }
                Unit unit = Unit.INSTANCE;
            }
            if (!p2) {
                synchronized (this.connection) {
                    if (this.connection.getWriteBytesTotal() < this.connection.getWriteBytesMaximum()) {
                        z = false;
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
                p2 = z;
            }
            this.connection.writeHeaders$okhttp(this.id, p1, p0);
            if (p2) {
                this.connection.flush();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Thread ");
        sb.append(Thread.currentThread().getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    private final boolean closeInternal(ErrorCode p0, IOException p1) {
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.errorCode != null) {
                    return false;
                }
                this.errorCode = p0;
                this.errorException = p1;
                Intrinsics.checkNotNull(this, "");
                notifyAll();
                if (this.source.getFinished() && this.sink.getFinished()) {
                    return false;
                }
                Unit unit = Unit.INSTANCE;
                this.connection.removeStream$okhttp(this.id);
                return true;
            }
        }
        StringBuilder sb = new StringBuilder("Thread ");
        sb.append(Thread.currentThread().getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final void receiveData(RotationProvider1 p0, int p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            this.source.receive$okhttp(p0, p1);
            return;
        }
        StringBuilder sb = new StringBuilder("Thread ");
        sb.append(Thread.currentThread().getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final void receiveHeaders(Headers p0, boolean p1) {
        boolean zIsOpen;
        Intrinsics.checkNotNullParameter(p0, "");
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (!this.hasResponseHeaders || !p1) {
                    this.hasResponseHeaders = true;
                    this.headersQueue.add(p0);
                } else {
                    this.source.setTrailers(p0);
                }
                if (p1) {
                    this.source.setFinished$okhttp(true);
                }
                zIsOpen = isOpen();
                Intrinsics.checkNotNull(this, "");
                notifyAll();
                Unit unit = Unit.INSTANCE;
            }
            if (zIsOpen) {
                return;
            }
            this.connection.removeStream$okhttp(this.id);
            return;
        }
        StringBuilder sb = new StringBuilder("Thread ");
        sb.append(Thread.currentThread().getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final void cancelStreamIfNecessary$okhttp() throws IOException {
        boolean z;
        boolean zIsOpen;
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            synchronized (this) {
                z = !this.source.getFinished() && this.source.getClosed() && (this.sink.getFinished() || this.sink.getClosed());
                zIsOpen = isOpen();
                Unit unit = Unit.INSTANCE;
            }
            if (z) {
                close(ErrorCode.CANCEL, null);
                return;
            } else {
                if (zIsOpen) {
                    return;
                }
                this.connection.removeStream$okhttp(this.id);
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Thread ");
        sb.append(Thread.currentThread().getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final void waitForIo$okhttp() throws InterruptedIOException {
        try {
            Intrinsics.checkNotNull(this, "");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
