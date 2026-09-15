package okhttp3.internal.ws;

import defpackage.RotationProviderListener;
import defpackage.RotationProviderListenerWrapper;
import defpackage.closeSurface;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.tls.internal.der.DerHeader;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001bR\u0014\u0010+\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001bR\u001a\u0010,\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00104\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u0010$R\u0016\u00105\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u0010\u001b"}, d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "", "p0", "LRotationProviderListener;", "p1", "Ljava/util/Random;", "p2", "p3", "p4", "", "p5", "<init>", "(ZLRotationProviderListener;Ljava/util/Random;ZZJ)V", "", "close", "()V", "", "Lokio/ByteString;", "writeClose", "(ILokio/ByteString;)V", "writeControlFrame", "writeMessageFrame", "writePing", "(Lokio/ByteString;)V", "writePong", "isClient", "Z", "LRotationProviderListenerWrapper$TuitionPaymentFragmentbindingInflater1;", "maskCursor", "LRotationProviderListenerWrapper$TuitionPaymentFragmentbindingInflater1;", "", "maskKey", "[B", "LRotationProviderListenerWrapper;", "messageBuffer", "LRotationProviderListenerWrapper;", "Lokhttp3/internal/ws/MessageDeflater;", "messageDeflater", "Lokhttp3/internal/ws/MessageDeflater;", "minimumDeflateSize", "J", "noContextTakeover", "perMessageDeflate", "random", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "sink", "LRotationProviderListener;", "getSink", "()LRotationProviderListener;", "sinkBuffer", "writerClosed"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final RotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1 maskCursor;
    private final byte[] maskKey;
    private final RotationProviderListenerWrapper messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final RotationProviderListener sink;
    private final RotationProviderListenerWrapper sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, RotationProviderListener rotationProviderListener, Random random, boolean z2, boolean z3, long j) {
        Intrinsics.checkNotNullParameter(rotationProviderListener, "");
        Intrinsics.checkNotNullParameter(random, "");
        this.isClient = z;
        this.sink = rotationProviderListener;
        this.random = random;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.minimumDeflateSize = j;
        this.messageBuffer = new RotationProviderListenerWrapper();
        this.sinkBuffer = rotationProviderListener.asInterface();
        this.maskKey = z ? new byte[4] : null;
        this.maskCursor = z ? new RotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1() : null;
    }

    public final RotationProviderListener getSink() {
        return this.sink;
    }

    public final Random getRandom() {
        return this.random;
    }

    public final void writePing(ByteString p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        writeControlFrame(9, p0);
    }

    public final void writePong(ByteString p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        writeControlFrame(10, p0);
    }

    public final void writeClose(int p0, ByteString p1) throws IOException {
        ByteString byteStringTuitionPaymentFragmentbindingInflater1 = ByteString.EMPTY;
        if (p0 != 0 || p1 != null) {
            if (p0 != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(p0);
            }
            RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
            rotationProviderListenerWrapper.a(p0);
            if (p1 != null) {
                Intrinsics.checkNotNullParameter(p1, "");
                p1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper, 0, p1.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
            byteStringTuitionPaymentFragmentbindingInflater1 = rotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper.size);
        }
        try {
            writeControlFrame(8, byteStringTuitionPaymentFragmentbindingInflater1);
        } finally {
            this.writerClosed = true;
        }
    }

    private final void writeControlFrame(int p0, ByteString p1) throws IOException {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = p1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        this.sinkBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0 | 128);
        if (this.isClient) {
            this.sinkBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault3 | 128);
            Random random = this.random;
            byte[] bArr = this.maskKey;
            Intrinsics.checkNotNull(bArr);
            random.nextBytes(bArr);
            RotationProviderListenerWrapper rotationProviderListenerWrapper = this.sinkBuffer;
            byte[] bArr2 = this.maskKey;
            Intrinsics.checkNotNullParameter(bArr2, "");
            rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr2, 0, bArr2.length);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 > 0) {
                long j = this.sinkBuffer.size;
                RotationProviderListenerWrapper rotationProviderListenerWrapper2 = this.sinkBuffer;
                Intrinsics.checkNotNullParameter(p1, "");
                p1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper2, 0, p1.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                RotationProviderListenerWrapper rotationProviderListenerWrapper3 = this.sinkBuffer;
                RotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.maskCursor;
                Intrinsics.checkNotNull(tuitionPaymentFragmentbindingInflater1);
                Intrinsics.checkNotNullParameter(tuitionPaymentFragmentbindingInflater1, "");
                closeSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(rotationProviderListenerWrapper3, tuitionPaymentFragmentbindingInflater1);
                this.maskCursor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            RotationProviderListenerWrapper rotationProviderListenerWrapper4 = this.sinkBuffer;
            Intrinsics.checkNotNullParameter(p1, "");
            p1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper4, 0, p1.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
        this.sink.flush();
    }

    public final void writeMessageFrame(int p0, ByteString p1) throws IOException {
        Intrinsics.checkNotNullParameter(p1, "");
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        RotationProviderListenerWrapper rotationProviderListenerWrapper = this.messageBuffer;
        Intrinsics.checkNotNullParameter(p1, "");
        p1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper, 0, p1.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int i = p0 | 128;
        if (this.perMessageDeflate && p1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() >= this.minimumDeflateSize) {
            MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater;
            }
            messageDeflater.deflate(this.messageBuffer);
            i = p0 | DerHeader.TAG_CLASS_PRIVATE;
        }
        long j = this.messageBuffer.size;
        this.sinkBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
        int i2 = this.isClient ? 128 : 0;
        if (j <= 125) {
            this.sinkBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i2 | ((int) j));
        } else if (j <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            this.sinkBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i2 | 126);
            this.sinkBuffer.a((int) j);
        } else {
            this.sinkBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i2 | 127);
            this.sinkBuffer.cancelAll(j);
        }
        if (this.isClient) {
            Random random = this.random;
            byte[] bArr = this.maskKey;
            Intrinsics.checkNotNull(bArr);
            random.nextBytes(bArr);
            RotationProviderListenerWrapper rotationProviderListenerWrapper2 = this.sinkBuffer;
            byte[] bArr2 = this.maskKey;
            Intrinsics.checkNotNullParameter(bArr2, "");
            rotationProviderListenerWrapper2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr2, 0, bArr2.length);
            if (j > 0) {
                RotationProviderListenerWrapper rotationProviderListenerWrapper3 = this.messageBuffer;
                RotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.maskCursor;
                Intrinsics.checkNotNull(tuitionPaymentFragmentbindingInflater1);
                Intrinsics.checkNotNullParameter(tuitionPaymentFragmentbindingInflater1, "");
                closeSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(rotationProviderListenerWrapper3, tuitionPaymentFragmentbindingInflater1);
                this.maskCursor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, j);
        this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }
}
