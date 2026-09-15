package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
final class lambdaonCaptureProcessProgressed3androidxcameracoreimagecaptureTakePictureRequest extends TakePictureRequestExternalSyntheticLambda3 {
    private final byte[] TuitionPaymentFragmentbindingInflater1;
    private final Iterable<resume> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* synthetic */ lambdaonCaptureProcessProgressed3androidxcameracoreimagecaptureTakePictureRequest(Iterable iterable, byte[] bArr, byte b) {
        this(iterable, bArr);
    }

    private lambdaonCaptureProcessProgressed3androidxcameracoreimagecaptureTakePictureRequest(Iterable<resume> iterable, byte[] bArr) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iterable;
        this.TuitionPaymentFragmentbindingInflater1 = bArr;
    }

    @Override // defpackage.TakePictureRequestExternalSyntheticLambda3
    public final Iterable<resume> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.TakePictureRequestExternalSyntheticLambda3
    public final byte[] TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendRequest{events=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", extras=");
        sb.append(Arrays.toString(this.TuitionPaymentFragmentbindingInflater1));
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TakePictureRequestExternalSyntheticLambda3)) {
            return false;
        }
        TakePictureRequestExternalSyntheticLambda3 takePictureRequestExternalSyntheticLambda3 = (TakePictureRequestExternalSyntheticLambda3) obj;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.equals(takePictureRequestExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault1())) {
            return Arrays.equals(this.TuitionPaymentFragmentbindingInflater1, takePictureRequestExternalSyntheticLambda3 instanceof lambdaonCaptureProcessProgressed3androidxcameracoreimagecaptureTakePictureRequest ? ((lambdaonCaptureProcessProgressed3androidxcameracoreimagecaptureTakePictureRequest) takePictureRequestExternalSyntheticLambda3).TuitionPaymentFragmentbindingInflater1 : takePictureRequestExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.TuitionPaymentFragmentbindingInflater1);
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends TakePictureRequestExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private Iterable<resume> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // TakePictureRequestExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final TakePictureRequestExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 b(Iterable<resume> iterable) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iterable;
            return this;
        }

        @Override // TakePictureRequestExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final TakePictureRequestExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 b(byte[] bArr) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bArr;
            return this;
        }

        @Override // TakePictureRequestExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final TakePictureRequestExternalSyntheticLambda3 TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            String str;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                str = "";
            } else {
                str = " events";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
            return new lambdaonCaptureProcessProgressed3androidxcameracoreimagecaptureTakePictureRequest(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (byte) 0);
        }
    }
}
