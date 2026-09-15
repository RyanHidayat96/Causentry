package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.channels.spi.AbstractSelectableChannel;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
public abstract class failAllPendingSnapshots implements ReadableByteChannel, ScatteringByteChannel {
    private AbstractSelectableChannel TuitionPaymentFragmentbindingInflater1;

    public abstract int TuitionPaymentFragmentspecialinlinedviewModeldefault2(ByteBuffer[] byteBufferArr) throws IOException;

    public abstract boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    public abstract void b();

    failAllPendingSnapshots(AbstractSelectableChannel abstractSelectableChannel) throws IOException {
        abstractSelectableChannel.configureBlocking(false);
        this.TuitionPaymentFragmentbindingInflater1 = abstractSelectableChannel;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.TuitionPaymentFragmentbindingInflater1.isOpen();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.TuitionPaymentFragmentbindingInflater1.close();
    }
}
