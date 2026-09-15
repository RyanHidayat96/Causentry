package kotlin.io.encoding;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\tR\u0014\u0010\u001a\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010&\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010*\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\t"}, d2 = {"Lkotlin/io/encoding/DecodeInputStream;", "Ljava/io/InputStream;", "p0", "Lkotlin/io/encoding/Base64;", "p1", "<init>", "(Ljava/io/InputStream;Lkotlin/io/encoding/Base64;)V", "", "read", "()I", "", "p2", "([BII)I", "", "close", "()V", "p3", "decodeSymbolBufferInto", "([BIII)I", "copyByteBufferInto", "([BII)V", "resetByteBufferIfEmpty", "shiftByteBufferToStartIfNeeded", "handlePaddingSymbol", "(I)I", "readNextSymbol", "input", "Ljava/io/InputStream;", "base64", "Lkotlin/io/encoding/Base64;", "", "isClosed", "Z", "isEOF", "singleByteBuffer", "[B", "symbolBuffer", "byteBuffer", "byteBufferStartIndex", "I", "byteBufferEndIndex", "getByteBufferLength", "byteBufferLength"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class DecodeInputStream extends InputStream {
    private final Base64 base64;
    private final byte[] byteBuffer;
    private int byteBufferEndIndex;
    private int byteBufferStartIndex;
    private final InputStream input;
    private boolean isClosed;
    private boolean isEOF;
    private final byte[] singleByteBuffer;
    private final byte[] symbolBuffer;

    public DecodeInputStream(InputStream inputStream, Base64 base64) {
        Intrinsics.checkNotNullParameter(inputStream, "");
        Intrinsics.checkNotNullParameter(base64, "");
        this.input = inputStream;
        this.base64 = base64;
        this.singleByteBuffer = new byte[1];
        this.symbolBuffer = new byte[1024];
        this.byteBuffer = new byte[1024];
    }

    private final int getByteBufferLength() {
        return this.byteBufferEndIndex - this.byteBufferStartIndex;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.byteBufferStartIndex;
        if (i < this.byteBufferEndIndex) {
            byte b = this.byteBuffer[i];
            this.byteBufferStartIndex = i + 1;
            resetByteBufferIfEmpty();
            return b & UByte.MAX_VALUE;
        }
        int i2 = read(this.singleByteBuffer, 0, 1);
        if (i2 == -1) {
            return -1;
        }
        if (i2 == 1) {
            return this.singleByteBuffer[0] & UByte.MAX_VALUE;
        }
        throw new IllegalStateException("Unreachable".toString());
    }

    @Override // java.io.InputStream
    public final int read(byte[] p0, int p1, int p2) throws IOException {
        int i;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 < 0 || p2 < 0 || (i = p1 + p2) > p0.length) {
            StringBuilder sb = new StringBuilder("offset: ");
            sb.append(p1);
            sb.append(", length: ");
            sb.append(p2);
            sb.append(", buffer size: ");
            sb.append(p0.length);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (this.isClosed) {
            throw new IOException("The input stream is closed.");
        }
        if (this.isEOF) {
            return -1;
        }
        if (p2 == 0) {
            return 0;
        }
        if (getByteBufferLength() >= p2) {
            copyByteBufferInto(p0, p1, p2);
            return p2;
        }
        int byteBufferLength = (((p2 - getByteBufferLength()) + 2) / 3) * 4;
        int iDecodeSymbolBufferInto = p1;
        while (true) {
            z = this.isEOF;
            if (z || byteBufferLength <= 0) {
                break;
            }
            int iMin = Math.min(this.symbolBuffer.length, byteBufferLength);
            int iHandlePaddingSymbol = 0;
            while (true) {
                z2 = this.isEOF;
                if (z2 || iHandlePaddingSymbol >= iMin) {
                    break;
                }
                int nextSymbol = readNextSymbol();
                if (nextSymbol == -1) {
                    this.isEOF = true;
                } else if (nextSymbol == 61) {
                    iHandlePaddingSymbol = handlePaddingSymbol(iHandlePaddingSymbol);
                    this.isEOF = true;
                } else {
                    this.symbolBuffer[iHandlePaddingSymbol] = (byte) nextSymbol;
                    iHandlePaddingSymbol++;
                }
            }
            if (!z2 && iHandlePaddingSymbol != iMin) {
                throw new IllegalStateException("Check failed.");
            }
            byteBufferLength -= iHandlePaddingSymbol;
            iDecodeSymbolBufferInto += decodeSymbolBufferInto(p0, iDecodeSymbolBufferInto, i, iHandlePaddingSymbol);
        }
        if (iDecodeSymbolBufferInto == p1 && z) {
            return -1;
        }
        return iDecodeSymbolBufferInto - p1;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.input.close();
    }

    private final int decodeSymbolBufferInto(byte[] p0, int p1, int p2, int p3) {
        int i = this.byteBufferEndIndex;
        this.byteBufferEndIndex = i + this.base64.decodeIntoByteArray(this.symbolBuffer, this.byteBuffer, i, 0, p3);
        int iMin = Math.min(getByteBufferLength(), p2 - p1);
        copyByteBufferInto(p0, p1, iMin);
        shiftByteBufferToStartIfNeeded();
        return iMin;
    }

    private final void copyByteBufferInto(byte[] p0, int p1, int p2) {
        byte[] bArr = this.byteBuffer;
        int i = this.byteBufferStartIndex;
        ArraysKt.copyInto(bArr, p0, p1, i, i + p2);
        this.byteBufferStartIndex += p2;
        resetByteBufferIfEmpty();
    }

    private final void resetByteBufferIfEmpty() {
        if (this.byteBufferStartIndex == this.byteBufferEndIndex) {
            this.byteBufferStartIndex = 0;
            this.byteBufferEndIndex = 0;
        }
    }

    private final void shiftByteBufferToStartIfNeeded() {
        byte[] bArr = this.byteBuffer;
        int length = bArr.length;
        int i = this.byteBufferEndIndex;
        if ((this.symbolBuffer.length / 4) * 3 > length - i) {
            ArraysKt.copyInto(bArr, bArr, 0, this.byteBufferStartIndex, i);
            this.byteBufferEndIndex -= this.byteBufferStartIndex;
            this.byteBufferStartIndex = 0;
        }
    }

    private final int handlePaddingSymbol(int p0) throws IOException {
        this.symbolBuffer[p0] = Base64.padSymbol;
        if ((p0 & 3) != 2) {
            return p0 + 1;
        }
        int nextSymbol = readNextSymbol();
        if (nextSymbol >= 0) {
            this.symbolBuffer[p0 + 1] = (byte) nextSymbol;
        }
        return p0 + 2;
    }

    private final int readNextSymbol() throws IOException {
        int i;
        if (!this.base64.isMimeScheme$kotlin_stdlib()) {
            return this.input.read();
        }
        do {
            i = this.input.read();
            if (i == -1) {
                break;
            }
        } while (!Base64Kt.isInMimeAlphabet(i));
        return i;
    }
}
