package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013"}, d2 = {"LonQueueTitleChanged;", "", "LonEvent;", "p0", "p1", "<init>", "(LonEvent;LonEvent;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "LonEvent;", "b", "()LonEvent;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class onQueueTitleChanged {
    public static final onQueueTitleChanged TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new onQueueTitleChanged(onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE, onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final onEvent TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final onEvent TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public onQueueTitleChanged(onEvent onevent, onEvent onevent2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = onevent;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = onevent2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final onEvent getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from getter */
    public final onEvent getTuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof onQueueTitleChanged)) {
            return false;
        }
        onQueueTitleChanged onqueuetitlechanged = (onQueueTitleChanged) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, onqueuetitlechanged.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, onqueuetitlechanged.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final int hashCode() {
        return (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("onQueueTitleChanged(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(')');
        return sb.toString();
    }
}
