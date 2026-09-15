package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class dynamicRangeToVideoProfileHdrFormats extends EncoderImplMediaCodecCallbackExternalSyntheticLambda1<dynamicRangeToVideoProfileHdrFormats> {
    final /* synthetic */ AtomicReferenceArray TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public dynamicRangeToVideoProfileHdrFormats(long j, dynamicRangeToVideoProfileHdrFormats dynamicrangetovideoprofilehdrformats, int i) {
        super(j, dynamicrangetovideoprofilehdrformats, i);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AtomicReferenceArray(dynamicRangeToCodecProfileLevelForMime.TuitionPaymentFragmentbindingInflater1);
    }

    @Override // defpackage.EncoderImplMediaCodecCallbackExternalSyntheticLambda1
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return dynamicRangeToCodecProfileLevelForMime.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.EncoderImplMediaCodecCallbackExternalSyntheticLambda1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, CoroutineContext coroutineContext) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i, dynamicRangeToCodecProfileLevelForMime.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.incrementAndGet(this) == TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
            asInterface();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SemaphoreSegment[id=");
        sb.append(this.f136a);
        sb.append(", hashCode=");
        sb.append(hashCode());
        sb.append(']');
        return sb.toString();
    }
}
