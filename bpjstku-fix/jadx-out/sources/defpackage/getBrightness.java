package defpackage;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\t"}, d2 = {"LgetBrightness;", "LSurfaceViewImplementationApi24Impl;", "p0", "<init>", "(LSurfaceViewImplementationApi24Impl;)V", "", "close", "()V", "-deprecated_delegate", "()LSurfaceViewImplementationApi24Impl;", "flush", "LcancelPreviousRequest;", "timeout", "()LcancelPreviousRequest;", "", "toString", "()Ljava/lang/String;", "LRotationProviderListenerWrapper;", "", "p1", "write", "(LRotationProviderListenerWrapper;J)V", "delegate", "LSurfaceViewImplementationApi24Impl;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class getBrightness implements SurfaceViewImplementationApi24Impl {
    private final SurfaceViewImplementationApi24Impl delegate;

    public getBrightness(SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24Impl) {
        Intrinsics.checkNotNullParameter(surfaceViewImplementationApi24Impl, "");
        this.delegate = surfaceViewImplementationApi24Impl;
    }

    public final SurfaceViewImplementationApi24Impl delegate() {
        return this.delegate;
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl
    public void write(RotationProviderListenerWrapper p0, long p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        this.delegate.write(p0, p1);
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl
    public cancelPreviousRequest timeout() {
        return this.delegate.timeout();
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        sb.append(this.delegate);
        sb.append(')');
        return sb.toString();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "delegate", imports = {}))
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name and from getter */
    public final SurfaceViewImplementationApi24Impl getDelegate() {
        return this.delegate;
    }
}
