package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Llambdanew0androidxcameracoreMetadataImageReader;", "", "", "p0", "p1", "<init>", "(JJ)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "J", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class lambdanew0androidxcameracoreMetadataImageReader {
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final long b;

    public lambdanew0androidxcameracoreMetadataImageReader(long j, long j2) {
        this.b = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j2;
    }

    public /* synthetic */ lambdanew0androidxcameracoreMetadataImageReader(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? System.currentTimeMillis() : j, (i & 2) != 0 ? System.nanoTime() : j2);
    }

    public lambdanew0androidxcameracoreMetadataImageReader() {
        this(0L, 0L, 3, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof lambdanew0androidxcameracoreMetadataImageReader)) {
            return false;
        }
        lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = (lambdanew0androidxcameracoreMetadataImageReader) p0;
        return this.b == lambdanew0androidxcameracoremetadataimagereader.b && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == lambdanew0androidxcameracoremetadataimagereader.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final int hashCode() {
        return (Long.hashCode(this.b) * 31) + Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public final String toString() {
        long j = this.b;
        long j2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StringBuilder sb = new StringBuilder("lambdanew0androidxcameracoreMetadataImageReader(b=");
        sb.append(j);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }
}
