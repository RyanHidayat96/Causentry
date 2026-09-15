package defpackage;

import kotlin.Metadata;
import kotlinx.coroutines.flow.SharingCommand;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tJ#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LsignalCodecStop;", "", "LstopMediaCodec;", "", "p0", "LclampVideoBitrateIfNotSupported;", "Lkotlinx/coroutines/flow/SharingCommand;", "b", "(LstopMediaCodec;)LclampVideoBitrateIfNotSupported;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface signalCodecStop {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.TuitionPaymentFragmentbindingInflater1;

    clampVideoBitrateIfNotSupported<SharingCommand> b(stopMediaCodec<Integer> p0);

    /* JADX INFO: renamed from: signalCodecStop$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion TuitionPaymentFragmentbindingInflater1 = new Companion();
        private static final signalCodecStop TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new updateTotalPausedDuration();
        private static final signalCodecStop TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new EncoderImplExternalSyntheticLambda0();

        private Companion() {
        }

        public static signalCodecStop TuitionPaymentFragmentbindingInflater1() {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public static signalCodecStop TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public static /* synthetic */ signalCodecStop TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return new signalSourceStopped(0L, Long.MAX_VALUE);
        }
    }
}
