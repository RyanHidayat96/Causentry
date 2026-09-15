package defpackage;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaStoreVideoCannotWrite {
    public static final <T> CancellableContinuationImpl<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Continuation<? super T> continuation) {
        CancellableContinuationImpl<T> cancellableContinuationImpl;
        if (!(continuation instanceof EncoderImplByteBufferInputExternalSyntheticLambda4)) {
            return new CancellableContinuationImpl<>(continuation, 1);
        }
        EncoderImplByteBufferInputExternalSyntheticLambda4 encoderImplByteBufferInputExternalSyntheticLambda4 = (EncoderImplByteBufferInputExternalSyntheticLambda4) continuation;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = EncoderImplByteBufferInputExternalSyntheticLambda4.asBinder;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(encoderImplByteBufferInputExternalSyntheticLambda4);
            if (obj == null) {
                EncoderImplByteBufferInputExternalSyntheticLambda4.asBinder.set(encoderImplByteBufferInputExternalSyntheticLambda4, EncoderImplByteBufferInputExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1);
                cancellableContinuationImpl = null;
                break;
            }
            if (!(obj instanceof CancellableContinuationImpl)) {
                if (obj != EncoderImplByteBufferInputExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1 && !(obj instanceof Throwable)) {
                    throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(obj)).toString());
                }
            } else if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(EncoderImplByteBufferInputExternalSyntheticLambda4.asBinder, encoderImplByteBufferInputExternalSyntheticLambda4, obj, EncoderImplByteBufferInputExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1)) {
                cancellableContinuationImpl = (CancellableContinuationImpl) obj;
                break;
            }
        }
        if (cancellableContinuationImpl != null) {
            CancellableContinuationImpl<T> cancellableContinuationImpl2 = cancellableContinuationImpl.a() ? cancellableContinuationImpl : null;
            if (cancellableContinuationImpl2 != null) {
                return cancellableContinuationImpl2;
            }
        }
        return new CancellableContinuationImpl<>(continuation, 2);
    }

    public static final void b(MediaFormatMustNotUseFrameRateToFindEncoderQuirk<?> mediaFormatMustNotUseFrameRateToFindEncoderQuirk, setCompatibleAudioProfile setcompatibleaudioprofile) {
        AudioSettingsAudioProfileResolver audioSettingsAudioProfileResolver = new AudioSettingsAudioProfileResolver(setcompatibleaudioprofile);
        if (!(mediaFormatMustNotUseFrameRateToFindEncoderQuirk instanceof CancellableContinuationImpl)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((CancellableContinuationImpl) mediaFormatMustNotUseFrameRateToFindEncoderQuirk).TuitionPaymentFragmentspecialinlinedviewModeldefault1(audioSettingsAudioProfileResolver);
    }
}
