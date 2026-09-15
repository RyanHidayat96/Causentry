package defpackage;

import kotlin.collections.ArrayDeque;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AutoValue_AudioMimeInfoBuilder extends CoroutineDispatcher {
    private long TuitionPaymentFragmentbindingInflater1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public ArrayDeque<AudioConfigUtilExternalSyntheticLambda0<?>> b;

    private static long TuitionPaymentFragmentbindingInflater1(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public void TuitionPaymentFragmentbindingInflater1() {
    }

    public long g() {
        return !d() ? Long.MAX_VALUE : 0L;
    }

    protected long TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        ArrayDeque<AudioConfigUtilExternalSyntheticLambda0<?>> arrayDeque = this.b;
        return (arrayDeque == null || arrayDeque.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final boolean d() {
        AudioConfigUtilExternalSyntheticLambda0<?> audioConfigUtilExternalSyntheticLambda0RemoveFirstOrNull;
        ArrayDeque<AudioConfigUtilExternalSyntheticLambda0<?>> arrayDeque = this.b;
        if (arrayDeque == null || (audioConfigUtilExternalSyntheticLambda0RemoveFirstOrNull = arrayDeque.removeFirstOrNull()) == null) {
            return false;
        }
        audioConfigUtilExternalSyntheticLambda0RemoveFirstOrNull.run();
        return true;
    }

    public final boolean asBinder() {
        return this.TuitionPaymentFragmentbindingInflater1 >= TuitionPaymentFragmentbindingInflater1(true);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z) {
        this.TuitionPaymentFragmentbindingInflater1 += TuitionPaymentFragmentbindingInflater1(z);
        if (z) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(boolean z) {
        long jTuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentbindingInflater1 - TuitionPaymentFragmentbindingInflater1(z);
        this.TuitionPaymentFragmentbindingInflater1 = jTuitionPaymentFragmentbindingInflater1;
        if (jTuitionPaymentFragmentbindingInflater1 <= 0) {
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                TuitionPaymentFragmentbindingInflater1();
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i, String str) {
        if (i > 0) {
            AutoValue_AudioMimeInfoBuilder autoValue_AudioMimeInfoBuilder = this;
            return str != null ? new lambdaonOutputBufferAvailable1androidxcameravideointernalencoderEncoderImplMediaCodecCallback(autoValue_AudioMimeInfoBuilder, str) : autoValue_AudioMimeInfoBuilder;
        }
        throw new IllegalArgumentException("Expected positive parallelism level, but got ".concat(String.valueOf(i)).toString());
    }

    protected boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        ArrayDeque<AudioConfigUtilExternalSyntheticLambda0<?>> arrayDeque = this.b;
        if (arrayDeque != null) {
            return arrayDeque.isEmpty();
        }
        return true;
    }
}
