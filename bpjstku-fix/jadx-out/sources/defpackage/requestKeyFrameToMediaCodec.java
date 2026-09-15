package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes4.dex */
public final class requestKeyFrameToMediaCodec<T> {
    public final CoroutineContext TuitionPaymentFragmentbindingInflater1;
    private BufferOverflow TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final clampVideoBitrateIfNotSupported<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private int b;

    /* JADX WARN: Multi-variable type inference failed */
    public requestKeyFrameToMediaCodec(clampVideoBitrateIfNotSupported<? extends T> clampvideobitrateifnotsupported, int i, BufferOverflow bufferOverflow, CoroutineContext coroutineContext) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = clampvideobitrateifnotsupported;
        this.b = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bufferOverflow;
        this.TuitionPaymentFragmentbindingInflater1 = coroutineContext;
    }
}
