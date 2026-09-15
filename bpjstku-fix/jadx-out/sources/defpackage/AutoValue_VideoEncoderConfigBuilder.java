package defpackage;

import kotlin.Unit;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_VideoEncoderConfigBuilder implements Runnable {
    private final CoroutineDispatcher TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX WARN: Multi-variable type inference failed */
    public AutoValue_VideoEncoderConfigBuilder(CoroutineDispatcher coroutineDispatcher, MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super Unit> mediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = coroutineDispatcher;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mediaFormatMustNotUseFrameRateToFindEncoderQuirk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, Unit.INSTANCE);
    }
}
