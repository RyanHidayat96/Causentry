package kotlin.io.encoding;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ'\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ'\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\"\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001e"}, d2 = {"Lkotlin/io/encoding/EncodeOutputStream;", "Ljava/io/OutputStream;", "p0", "Lkotlin/io/encoding/Base64;", "p1", "<init>", "(Ljava/io/OutputStream;Lkotlin/io/encoding/Base64;)V", "", "", "write", "(I)V", "", "p2", "([BII)V", "flush", "()V", "close", "copyIntoByteBuffer", "([BII)I", "encodeByteBufferIntoOutput", "encodeIntoOutput", "checkOpen", "output", "Ljava/io/OutputStream;", "base64", "Lkotlin/io/encoding/Base64;", "", "isClosed", "Z", "lineLength", "I", "symbolBuffer", "[B", "byteBuffer", "byteBufferLength"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class EncodeOutputStream extends OutputStream {
    private final Base64 base64;
    private final byte[] byteBuffer;
    private int byteBufferLength;
    private boolean isClosed;
    private int lineLength;
    private final OutputStream output;
    private final byte[] symbolBuffer;

    public EncodeOutputStream(OutputStream outputStream, Base64 base64) {
        Intrinsics.checkNotNullParameter(outputStream, "");
        Intrinsics.checkNotNullParameter(base64, "");
        this.output = outputStream;
        this.base64 = base64;
        this.lineLength = base64.isMimeScheme$kotlin_stdlib() ? 76 : -1;
        this.symbolBuffer = new byte[1024];
        this.byteBuffer = new byte[3];
    }

    @Override // java.io.OutputStream
    public final void write(int p0) throws IOException {
        checkOpen();
        byte[] bArr = this.byteBuffer;
        int i = this.byteBufferLength;
        int i2 = i + 1;
        this.byteBufferLength = i2;
        bArr[i] = (byte) p0;
        if (i2 == 3) {
            encodeByteBufferIntoOutput();
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] p0, int p1, int p2) throws IOException {
        int i;
        Intrinsics.checkNotNullParameter(p0, "");
        checkOpen();
        if (p1 < 0 || p2 < 0 || (i = p1 + p2) > p0.length) {
            StringBuilder sb = new StringBuilder("offset: ");
            sb.append(p1);
            sb.append(", length: ");
            sb.append(p2);
            sb.append(", source size: ");
            sb.append(p0.length);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (p2 != 0) {
            int i2 = this.byteBufferLength;
            if (i2 >= 3) {
                throw new IllegalStateException("Check failed.");
            }
            if (i2 != 0) {
                p1 += copyIntoByteBuffer(p0, p1, i);
                if (this.byteBufferLength != 0) {
                    return;
                }
            }
            while (p1 + 3 <= i) {
                int iMin = Math.min((this.base64.isMimeScheme$kotlin_stdlib() ? this.lineLength : this.symbolBuffer.length) / 4, (i - p1) / 3);
                int i3 = (iMin * 3) + p1;
                if (encodeIntoOutput(p0, p1, i3) != iMin * 4) {
                    throw new IllegalStateException("Check failed.");
                }
                p1 = i3;
            }
            ArraysKt.copyInto(p0, this.byteBuffer, 0, p1, i);
            this.byteBufferLength = i - p1;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        checkOpen();
        this.output.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        if (this.byteBufferLength != 0) {
            encodeByteBufferIntoOutput();
        }
        this.output.close();
    }

    private final int copyIntoByteBuffer(byte[] p0, int p1, int p2) {
        int iMin = Math.min(3 - this.byteBufferLength, p2 - p1);
        ArraysKt.copyInto(p0, this.byteBuffer, this.byteBufferLength, p1, p1 + iMin);
        int i = this.byteBufferLength + iMin;
        this.byteBufferLength = i;
        if (i == 3) {
            encodeByteBufferIntoOutput();
        }
        return iMin;
    }

    private final void encodeByteBufferIntoOutput() {
        if (encodeIntoOutput(this.byteBuffer, 0, this.byteBufferLength) != 4) {
            throw new IllegalStateException("Check failed.");
        }
        this.byteBufferLength = 0;
    }

    private final int encodeIntoOutput(byte[] p0, int p1, int p2) throws Throwable {
        int iEncodeIntoByteArray = this.base64.encodeIntoByteArray(p0, this.symbolBuffer, 0, p1, p2);
        if (this.lineLength == 0) {
            this.output.write(Base64.INSTANCE.getMimeLineSeparatorSymbols$kotlin_stdlib());
            this.lineLength = 76;
            if (iEncodeIntoByteArray > 76) {
                throw new IllegalStateException("Check failed.");
            }
        }
        this.output.write(this.symbolBuffer, 0, iEncodeIntoByteArray);
        this.lineLength -= iEncodeIntoByteArray;
        return iEncodeIntoByteArray;
    }

    private final void checkOpen() throws IOException {
        if (this.isClosed) {
            throw new IOException("The output stream is closed.");
        }
    }
}
