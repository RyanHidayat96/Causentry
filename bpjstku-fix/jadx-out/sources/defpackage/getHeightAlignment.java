package defpackage;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"LgetHeightAlignment;", "LOutputConfig;", "<init>", "()V", "", "p0", "", "p1", "Lkotlinx/coroutines/CoroutineDispatcher;", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/CoroutineDispatcher;", "", "close", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getHeightAlignment extends OutputConfig {
    public static final getHeightAlignment INSTANCE = new getHeightAlignment();

    private getHeightAlignment() {
        super(getSupportedHeights.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getSupportedHeights.b, getSupportedHeights.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getSupportedHeights.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int p0, String p1) {
        if (p0 > 0) {
            if (p0 >= getSupportedHeights.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                getHeightAlignment getheightalignment = this;
                return p1 != null ? new lambdaonOutputBufferAvailable1androidxcameravideointernalencoderEncoderImplMediaCodecCallback(getheightalignment, p1) : getheightalignment;
            }
            return super.limitedParallelism(p0, p1);
        }
        throw new IllegalArgumentException("Expected positive parallelism level, but got ".concat(String.valueOf(p0)).toString());
    }

    @Override // defpackage.OutputConfig, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.Default";
    }
}
