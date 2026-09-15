package okhttp3.internal.http2;

import androidx.collection.SieveCacheKt;
import com.google.firebase.messaging.Constants;
import defpackage.RotationProviderListener;
import defpackage.RotationProviderListenerWrapper;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\rJ/\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\rJ-\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010 \u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#J%\u0010$\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b$\u0010%J+\u0010&\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b&\u0010'J\u001d\u0010(\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u001a¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b*\u0010\u000bJ\u001d\u0010,\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020+H\u0002¢\u0006\u0004\b.\u0010-R\u0014\u0010/\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u00102\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00105\u001a\u0002048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<"}, d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "LRotationProviderListener;", "p0", "", "p1", "<init>", "(LRotationProviderListener;Z)V", "Lokhttp3/internal/http2/Settings;", "", "applyAndAckSettings", "(Lokhttp3/internal/http2/Settings;)V", "close", "()V", "connectionPreface", "", "LRotationProviderListenerWrapper;", "p2", "p3", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(ZILRotationProviderListenerWrapper;I)V", "dataFrame", "(IILRotationProviderListenerWrapper;I)V", "flush", "frameHeader", "(IIII)V", "Lokhttp3/internal/http2/ErrorCode;", "", "goAway", "(ILokhttp3/internal/http2/ErrorCode;[B)V", "", "Lokhttp3/internal/http2/Header;", "headers", "(ZILjava/util/List;)V", "maxDataLength", "()I", "ping", "(ZII)V", "pushPromise", "(IILjava/util/List;)V", "rstStream", "(ILokhttp3/internal/http2/ErrorCode;)V", "settings", "", "windowUpdate", "(IJ)V", "writeContinuationFrames", "client", "Z", "closed", "hpackBuffer", "LRotationProviderListenerWrapper;", "Lokhttp3/internal/http2/Hpack$Writer;", "hpackWriter", "Lokhttp3/internal/http2/Hpack$Writer;", "getHpackWriter", "()Lokhttp3/internal/http2/Hpack$Writer;", "maxFrameSize", "I", "sink", "LRotationProviderListener;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Http2Writer implements Closeable {
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final RotationProviderListenerWrapper hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final RotationProviderListener sink;

    public Http2Writer(RotationProviderListener rotationProviderListener, boolean z) {
        Intrinsics.checkNotNullParameter(rotationProviderListener, "");
        this.sink = rotationProviderListener;
        this.client = z;
        RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
        this.hpackBuffer = rotationProviderListenerWrapper;
        this.maxFrameSize = 16384;
        this.hpackWriter = new Hpack.Writer(0, false, rotationProviderListenerWrapper, 3, null);
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final void connectionPreface() throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (this.client) {
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    StringBuilder sb = new StringBuilder(">> CONNECTION ");
                    sb.append(Http2.CONNECTION_PREFACE.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                    logger2.fine(Util.format(sb.toString(), new Object[0]));
                }
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Http2.CONNECTION_PREFACE);
                this.sink.flush();
            }
        }
    }

    public final void applyAndAckSettings(Settings p0) throws IOException {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (this.closed) {
                throw new IOException("closed");
            }
            this.maxFrameSize = p0.getMaxFrameSize(this.maxFrameSize);
            if (p0.getHeaderTableSize() != -1) {
                this.hpackWriter.resizeHeaderTable(p0.getHeaderTableSize());
            }
            frameHeader(0, 0, 4, 1);
            this.sink.flush();
        }
    }

    public final void pushPromise(int p0, int p1, List<Header> p2) throws IOException {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(p2, "");
            if (this.closed) {
                throw new IOException("closed");
            }
            this.hpackWriter.writeHeaders(p2);
            long j = this.hpackBuffer.size;
            int iMin = (int) Math.min(((long) this.maxFrameSize) - 4, j);
            long j2 = iMin;
            frameHeader(p0, iMin + 4, 5, j == j2 ? 4 : 0);
            this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p1 & Integer.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j2);
            if (j > j2) {
                writeContinuationFrames(p0, j - j2);
            }
        }
    }

    public final void flush() throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.sink.flush();
        }
    }

    public final void rstStream(int p0, ErrorCode p1) throws IOException {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(p1, "");
            if (this.closed) {
                throw new IOException("closed");
            }
            if (p1.getHttpCode() == -1) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            frameHeader(p0, 4, 3, 0);
            this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p1.getHttpCode());
            this.sink.flush();
        }
    }

    /* JADX INFO: renamed from: maxDataLength, reason: from getter */
    public final int getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final void data(boolean p0, int p1, RotationProviderListenerWrapper p2, int p3) throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            dataFrame(p1, p0 ? 1 : 0, p2, p3);
        }
    }

    public final void dataFrame(int p0, int p1, RotationProviderListenerWrapper p2, int p3) throws IOException {
        frameHeader(p0, p3, 0, p1);
        if (p3 > 0) {
            RotationProviderListener rotationProviderListener = this.sink;
            Intrinsics.checkNotNull(p2);
            rotationProviderListener.write(p2, p3);
        }
    }

    public final void settings(Settings p0) throws IOException {
        int i;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (this.closed) {
                throw new IOException("closed");
            }
            int i2 = 0;
            frameHeader(0, p0.size() * 6, 4, 0);
            while (i2 < 10) {
                if (p0.isSet(i2)) {
                    if (i2 != 4) {
                        i = i2 != 7 ? i2 : 4;
                    } else {
                        i = 3;
                    }
                    this.sink.a(i);
                    this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0.get(i2));
                }
                i2++;
            }
            this.sink.flush();
        }
    }

    public final void ping(boolean p0, int p1, int p2) throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            frameHeader(0, 8, 6, p0 ? 1 : 0);
            this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p1);
            this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p2);
            this.sink.flush();
        }
    }

    public final void goAway(int p0, ErrorCode p1, byte[] p2) throws IOException {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            if (this.closed) {
                throw new IOException("closed");
            }
            if (p1.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
            frameHeader(0, p2.length + 8, 7, 0);
            this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
            this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p1.getHttpCode());
            if (p2.length != 0) {
                this.sink.b(p2);
            }
            this.sink.flush();
        }
    }

    public final void windowUpdate(int p0, long p1) throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (p1 == 0 || p1 > SieveCacheKt.NodeLinkMask) {
                StringBuilder sb = new StringBuilder("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ");
                sb.append(p1);
                throw new IllegalArgumentException(sb.toString().toString());
            }
            frameHeader(p0, 4, 8, 0);
            this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2((int) p1);
            this.sink.flush();
        }
    }

    public final void frameHeader(int p0, int p1, int p2, int p3) throws IOException {
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.INSTANCE.frameLog(false, p0, p1, p2, p3));
        }
        if (p1 > this.maxFrameSize) {
            StringBuilder sb = new StringBuilder("FRAME_SIZE_ERROR length > ");
            sb.append(this.maxFrameSize);
            sb.append(": ");
            sb.append(p1);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if ((Integer.MIN_VALUE & p0) != 0) {
            throw new IllegalArgumentException("reserved bit set: ".concat(String.valueOf(p0)).toString());
        }
        Util.writeMedium(this.sink, p1);
        this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p2 & 255);
        this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p3 & 255);
        this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0 & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            this.closed = true;
            this.sink.close();
        }
    }

    private final void writeContinuationFrames(int p0, long p1) throws IOException {
        while (p1 > 0) {
            long jMin = Math.min(this.maxFrameSize, p1);
            p1 -= jMin;
            frameHeader(p0, (int) jMin, 9, p1 == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, jMin);
        }
    }

    public final void headers(boolean p0, int p1, List<Header> p2) throws IOException {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(p2, "");
            if (this.closed) {
                throw new IOException("closed");
            }
            this.hpackWriter.writeHeaders(p2);
            long j = this.hpackBuffer.size;
            long jMin = Math.min(this.maxFrameSize, j);
            int i = j == jMin ? 4 : 0;
            if (p0) {
                i |= 1;
            }
            frameHeader(p1, (int) jMin, 1, i);
            this.sink.write(this.hpackBuffer, jMin);
            if (j > jMin) {
                writeContinuationFrames(p1, j - jMin);
            }
        }
    }
}
