package defpackage;

import androidx.collection.SieveCacheKt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public final class setOutputImageRotationEnabled {
    private static final AtomicReference<byte[]> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AtomicReference<>();

    public static ByteBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault2(File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel = null;
        try {
            long length = file.length();
            if (length > SieveCacheKt.NodeLinkMask) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                channel = randomAccessFile.getChannel();
                MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused) {
                    }
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return mappedByteBufferLoad;
            } catch (Throwable th) {
                th = th;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                        throw th;
                    } catch (IOException unused4) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    public static InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault2(ByteBuffer byteBuffer) {
        return new b(byteBuffer);
    }

    public static ByteBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault1(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = TuitionPaymentFragmentspecialinlinedviewModeldefault3.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i = inputStream.read(andSet);
            if (i >= 0) {
                byteArrayOutputStream.write(andSet, 0, i);
            } else {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return (ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0);
            }
        }
    }

    public static ByteBuffer TuitionPaymentFragmentbindingInflater1(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        final int TuitionPaymentFragmentbindingInflater1;
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte[] bArr, int i, int i2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bArr;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            this.TuitionPaymentFragmentbindingInflater1 = i2;
        }
    }

    static class b extends InputStream {
        private final ByteBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1;

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        b(ByteBuffer byteBuffer) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = byteBuffer;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remaining();
        }

        @Override // java.io.InputStream
        public final int read() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hasRemaining()) {
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get() & UByte.MAX_VALUE;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            synchronized (this) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.position();
            }
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i2, available());
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(bArr, i, iMin);
            return iMin;
        }

        @Override // java.io.InputStream
        public final void reset() throws IOException {
            synchronized (this) {
                int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (i == -1) {
                    throw new IOException("Cannot reset to unset mark position");
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.position(i);
            }
        }

        @Override // java.io.InputStream
        public final long skip(long j) {
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j, available());
            ByteBuffer byteBuffer = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }
    }

    public static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(ByteBuffer byteBuffer) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) ? null : new TuitionPaymentFragmentspecialinlinedviewModeldefault2(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault2 != null && tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0 && tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 == tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    channel.write(byteBuffer);
                    channel.force(false);
                    channel.close();
                    randomAccessFile.close();
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused) {
                        }
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                } catch (Throwable th) {
                    th = th;
                    fileChannel = channel;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                            throw th;
                        } catch (IOException unused4) {
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }
}
