package okhttp3.internal.ws;

import defpackage.RotationProviderListenerWrapper;
import defpackage.setBrightness;
import defpackage.tryToComplete;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "", "p0", "<init>", "(Z)V", "", "close", "()V", "LRotationProviderListenerWrapper;", "inflate", "(LRotationProviderListenerWrapper;)V", "deflatedBytes", "LRotationProviderListenerWrapper;", "Ljava/util/zip/Inflater;", "inflater", "Ljava/util/zip/Inflater;", "LsetBrightness;", "inflaterSource", "LsetBrightness;", "noContextTakeover", "Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MessageInflater implements Closeable {
    private final RotationProviderListenerWrapper deflatedBytes;
    private final Inflater inflater;
    private final setBrightness inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z) {
        this.noContextTakeover = z;
        RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
        this.deflatedBytes = rotationProviderListenerWrapper;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new setBrightness((tryToComplete) rotationProviderListenerWrapper, inflater);
    }

    public final void inflate(RotationProviderListenerWrapper p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.deflatedBytes.size != 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.noContextTakeover) {
            this.inflater.reset();
        }
        this.deflatedBytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
        this.deflatedBytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(65535);
        long bytesRead = this.inflater.getBytesRead();
        long j = this.deflatedBytes.size;
        do {
            this.inflaterSource.TuitionPaymentFragmentbindingInflater1(p0, Long.MAX_VALUE);
        } while (this.inflater.getBytesRead() < bytesRead + j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.inflaterSource.close();
    }
}
