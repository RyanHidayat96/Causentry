package okhttp3.internal.cache;

import defpackage.RotationProviderListenerWrapper;
import defpackage.SurfaceViewImplementationApi24Impl;
import defpackage.getBrightness;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "LgetBrightness;", "LSurfaceViewImplementationApi24Impl;", "p0", "Lkotlin/Function1;", "Ljava/io/IOException;", "", "p1", "<init>", "(LSurfaceViewImplementationApi24Impl;Lkotlin/jvm/functions/Function1;)V", "close", "()V", "flush", "LRotationProviderListenerWrapper;", "", "write", "(LRotationProviderListenerWrapper;J)V", "", "hasErrors", "Z", "onException", "Lkotlin/jvm/functions/Function1;", "getOnException", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class FaultHidingSink extends getBrightness {
    private boolean hasErrors;
    private final Function1<IOException, Unit> onException;

    public final Function1<IOException, Unit> getOnException() {
        return this.onException;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24Impl, Function1<? super IOException, Unit> function1) {
        super(surfaceViewImplementationApi24Impl);
        Intrinsics.checkNotNullParameter(surfaceViewImplementationApi24Impl, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onException = function1;
    }

    @Override // defpackage.getBrightness, defpackage.SurfaceViewImplementationApi24Impl
    public void write(RotationProviderListenerWrapper p0, long p1) throws EOFException {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.hasErrors) {
            p0.g(p1);
            return;
        }
        try {
            super.write(p0, p1);
        } catch (IOException e2) {
            this.hasErrors = true;
            this.onException.invoke(e2);
        }
    }

    @Override // defpackage.getBrightness, defpackage.SurfaceViewImplementationApi24Impl, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e2) {
            this.hasErrors = true;
            this.onException.invoke(e2);
        }
    }

    @Override // defpackage.getBrightness, defpackage.SurfaceViewImplementationApi24Impl, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e2) {
            this.hasErrors = true;
            this.onException.invoke(e2);
        }
    }
}
