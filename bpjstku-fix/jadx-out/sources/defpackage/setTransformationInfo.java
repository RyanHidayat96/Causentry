package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\f"}, d2 = {"LsetTransformationInfo;", "LshouldReuseImplementation;", "", "p0", "", "p1", "LcreateImageAnalysis;", "p2", "<init>", "(Ljava/lang/Object;ZLcreateImageAnalysis;)V", "", "toString", "()Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Z", "TuitionPaymentFragmentbindingInflater1", "LcreateImageAnalysis;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "b"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setTransformationInfo extends shouldReuseImplementation {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final boolean TuitionPaymentFragmentbindingInflater1;

    public /* synthetic */ setTransformationInfo(Object obj, boolean z, createImageAnalysis createimageanalysis, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z, (i & 4) != 0 ? null : createimageanalysis);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private setTransformationInfo(Object obj, boolean z, createImageAnalysis createimageanalysis) {
        super(null);
        Intrinsics.checkNotNullParameter(obj, "");
        this.TuitionPaymentFragmentbindingInflater1 = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = createimageanalysis;
        this.b = obj.toString();
        if (createimageanalysis != null && !createimageanalysis.b()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Override // defpackage.shouldReuseImplementation
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || getClass() != p0.getClass()) {
            return false;
        }
        setTransformationInfo settransformationinfo = (setTransformationInfo) p0;
        return this.TuitionPaymentFragmentbindingInflater1 == settransformationinfo.TuitionPaymentFragmentbindingInflater1 && Intrinsics.areEqual(this.b, settransformationinfo.b);
    }

    public final int hashCode() {
        return (Boolean.hashCode(this.TuitionPaymentFragmentbindingInflater1) * 31) + this.b.hashCode();
    }

    @Override // defpackage.shouldReuseImplementation
    public final String toString() {
        if (this.TuitionPaymentFragmentbindingInflater1) {
            StringBuilder sb = new StringBuilder();
            getPreviewBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sb, this.b);
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        return this.b;
    }
}
