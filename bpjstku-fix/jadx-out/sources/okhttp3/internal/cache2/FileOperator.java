package okhttp3.internal.cache2;

import defpackage.RotationProviderListenerWrapper;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lokhttp3/internal/cache2/FileOperator;", "", "Ljava/nio/channels/FileChannel;", "p0", "<init>", "(Ljava/nio/channels/FileChannel;)V", "", "LRotationProviderListenerWrapper;", "p1", "p2", "", "read", "(JLRotationProviderListenerWrapper;J)V", "write", "fileChannel", "Ljava/nio/channels/FileChannel;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        Intrinsics.checkNotNullParameter(fileChannel, "");
        this.fileChannel = fileChannel;
    }

    public final void read(long p0, RotationProviderListenerWrapper p1, long p2) throws IOException {
        Intrinsics.checkNotNullParameter(p1, "");
        if (p2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (p2 > 0) {
            long jTransferTo = this.fileChannel.transferTo(p0, p2, p1);
            p0 += jTransferTo;
            p2 -= jTransferTo;
        }
    }

    public final void write(long p0, RotationProviderListenerWrapper p1, long p2) throws IOException {
        Intrinsics.checkNotNullParameter(p1, "");
        if (p2 < 0 || p2 > p1.size) {
            throw new IndexOutOfBoundsException();
        }
        while (p2 > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(p1, p0, p2);
            p0 += jTransferFrom;
            p2 -= jTransferFrom;
        }
    }
}
