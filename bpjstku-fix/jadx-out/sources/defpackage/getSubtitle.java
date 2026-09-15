package defpackage;

import java.io.EOFException;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class getSubtitle extends getBrightness {
    private boolean TuitionPaymentFragmentbindingInflater1;
    private final Function1<IOException, Unit> b;

    /* JADX WARN: Multi-variable type inference failed */
    public getSubtitle(SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24Impl, Function1<? super IOException, Unit> function1) {
        super(surfaceViewImplementationApi24Impl);
        this.b = function1;
    }

    @Override // defpackage.getBrightness, defpackage.SurfaceViewImplementationApi24Impl
    public final void write(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws EOFException {
        if (this.TuitionPaymentFragmentbindingInflater1) {
            rotationProviderListenerWrapper.g(j);
            return;
        }
        try {
            super.write(rotationProviderListenerWrapper, j);
        } catch (IOException e2) {
            this.TuitionPaymentFragmentbindingInflater1 = true;
            this.b.invoke(e2);
        }
    }

    @Override // defpackage.getBrightness, defpackage.SurfaceViewImplementationApi24Impl, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e2) {
            this.TuitionPaymentFragmentbindingInflater1 = true;
            this.b.invoke(e2);
        }
    }

    @Override // defpackage.getBrightness, defpackage.SurfaceViewImplementationApi24Impl, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e2) {
            this.TuitionPaymentFragmentbindingInflater1 = true;
            this.b.invoke(e2);
        }
    }
}
