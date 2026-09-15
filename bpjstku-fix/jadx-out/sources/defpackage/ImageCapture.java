package defpackage;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"LImageCapture;", "", "", "p0", "p1", "<init>", "([B[B)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "[B", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class ImageCapture {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final b b = new b(null);
    private static final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new byte[0];

    public ImageCapture(byte[] bArr, byte[] bArr2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bArr2;
    }

    public /* synthetic */ ImageCapture(byte[] bArr, byte[] bArr2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i & 2) != 0 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2 : bArr2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), p0 != null ? p0.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(p0, "");
        ImageCapture imageCapture = (ImageCapture) p0;
        return Arrays.equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, imageCapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Arrays.equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, imageCapture.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) * 31) + Arrays.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"LImageCapture$b;", "", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "[B", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String toString() {
        String string = Arrays.toString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        String string2 = Arrays.toString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        StringBuilder sb = new StringBuilder("ImageCapture(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(string);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(string2);
        sb.append(")");
        return sb.toString();
    }
}
