package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0012\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"LgetRetryDelayInMillis;", "", "", "p0", "", "p1", "p2", "p3", "<init>", "(IDDD)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "D", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "b", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class getRetryDelayInMillis {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final getRetryDelayInMillis asInterface = new getRetryDelayInMillis(0, Double.MAX_VALUE, -1.7976931348623157E308d, 0.0d);
    public final double TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final double TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final double TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public getRetryDelayInMillis(int i, double d, double d2, double d3) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        this.TuitionPaymentFragmentbindingInflater1 = d;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = d2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = d3;
    }

    /* JADX INFO: renamed from: getRetryDelayInMillis$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"LgetRetryDelayInMillis$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "LgetRetryDelayInMillis;", "asInterface", "LgetRetryDelayInMillis;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()LgetRetryDelayInMillis;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static getRetryDelayInMillis TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return getRetryDelayInMillis.asInterface;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getRetryDelayInMillis)) {
            return false;
        }
        getRetryDelayInMillis getretrydelayinmillis = (getRetryDelayInMillis) p0;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == getretrydelayinmillis.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && Double.compare(this.TuitionPaymentFragmentbindingInflater1, getretrydelayinmillis.TuitionPaymentFragmentbindingInflater1) == 0 && Double.compare(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getretrydelayinmillis.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == 0 && Double.compare(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getretrydelayinmillis.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == 0;
    }

    public final int hashCode() {
        return (((((Integer.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) * 31) + Double.hashCode(this.TuitionPaymentFragmentbindingInflater1)) * 31) + Double.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) * 31) + Double.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public final String toString() {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        double d = this.TuitionPaymentFragmentbindingInflater1;
        double d2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        double d3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StringBuilder sb = new StringBuilder("getRetryDelayInMillis(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(i);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(d);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(d2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(d3);
        sb.append(")");
        return sb.toString();
    }
}
