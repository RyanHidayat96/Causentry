package defpackage;

import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"LlambdaselectSampleRateOrNearestSupported0;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class lambdaselectSampleRateOrNearestSupported0 extends AbstractCoroutineContextElement {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentbindingInflater1;

    public lambdaselectSampleRateOrNearestSupported0(String str) {
        super(INSTANCE);
        this.TuitionPaymentFragmentbindingInflater1 = str;
    }

    /* JADX INFO: renamed from: lambdaselectSampleRateOrNearestSupported0$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LlambdaselectSampleRateOrNearestSupported0$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "Lkotlin/coroutines/CoroutineContext$Key;", "LlambdaselectSampleRateOrNearestSupported0;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements CoroutineContext.Key<lambdaselectSampleRateOrNearestSupported0> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoroutineName(");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof lambdaselectSampleRateOrNearestSupported0) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, ((lambdaselectSampleRateOrNearestSupported0) p0).TuitionPaymentFragmentbindingInflater1);
    }

    public final int hashCode() {
        return this.TuitionPaymentFragmentbindingInflater1.hashCode();
    }
}
