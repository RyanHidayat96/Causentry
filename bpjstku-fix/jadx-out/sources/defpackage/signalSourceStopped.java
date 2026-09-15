package defpackage;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.flow.SharingCommand;
import kotlinx.coroutines.flow.StartedWhileSubscribed$command$1;
import kotlinx.coroutines.flow.StartedWhileSubscribed$command$2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017"}, d2 = {"LsignalSourceStopped;", "LsignalCodecStop;", "", "p0", "p1", "<init>", "(JJ)V", "LstopMediaCodec;", "", "LclampVideoBitrateIfNotSupported;", "Lkotlinx/coroutines/flow/SharingCommand;", "b", "(LstopMediaCodec;)LclampVideoBitrateIfNotSupported;", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "J", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class signalSourceStopped implements signalCodecStop {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final long TuitionPaymentFragmentbindingInflater1 = 0;
    private final long b = Long.MAX_VALUE;

    public signalSourceStopped(long j, long j2) {
    }

    @Override // defpackage.signalCodecStop
    public final clampVideoBitrateIfNotSupported<SharingCommand> b(stopMediaCodec<Integer> p0) {
        return acquireInputBuffer.b(new lambdaacquireInputBuffer14androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdarequestKeyFrame8androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentbindingInflater1(p0, new StartedWhileSubscribed$command$1(this, null)), new StartedWhileSubscribed$command$2(null)));
    }

    public final String toString() {
        List listCreateListBuilder = CollectionsKt.createListBuilder(2);
        if (this.TuitionPaymentFragmentbindingInflater1 > 0) {
            StringBuilder sb = new StringBuilder("stopTimeout=");
            sb.append(this.TuitionPaymentFragmentbindingInflater1);
            sb.append("ms");
            listCreateListBuilder.add(sb.toString());
        }
        if (this.b < Long.MAX_VALUE) {
            StringBuilder sb2 = new StringBuilder("replayExpiration=");
            sb2.append(this.b);
            sb2.append("ms");
            listCreateListBuilder.add(sb2.toString());
        }
        List listBuild = CollectionsKt.build(listCreateListBuilder);
        StringBuilder sb3 = new StringBuilder("SharingStarted.WhileSubscribed(");
        sb3.append(CollectionsKt.joinToString$default(listBuild, null, null, null, 0, null, null, 63, null));
        sb3.append(')');
        return sb3.toString();
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof signalSourceStopped)) {
            return false;
        }
        signalSourceStopped signalsourcestopped = (signalSourceStopped) p0;
        return this.TuitionPaymentFragmentbindingInflater1 == signalsourcestopped.TuitionPaymentFragmentbindingInflater1 && this.b == signalsourcestopped.b;
    }

    public final int hashCode() {
        return (Long.hashCode(this.TuitionPaymentFragmentbindingInflater1) * 31) + Long.hashCode(this.b);
    }
}
