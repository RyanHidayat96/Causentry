package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
final class lambdanew0androidxcameracoreimagecaptureRequestWithCallback extends checkNotClosed {
    private final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* synthetic */ lambdanew0androidxcameracoreimagecaptureRequestWithCallback(byte[] bArr, byte[] bArr2, byte b) {
        this(bArr, bArr2);
    }

    private lambdanew0androidxcameracoreimagecaptureRequestWithCallback(byte[] bArr, byte[] bArr2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bArr2;
    }

    @Override // defpackage.checkNotClosed
    public final byte[] b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.checkNotClosed
    public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExperimentIds{clearBlob=");
        sb.append(Arrays.toString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
        sb.append(", encryptedBlob=");
        sb.append(Arrays.toString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof checkNotClosed)) {
            return false;
        }
        checkNotClosed checknotclosed = (checkNotClosed) obj;
        boolean z = checknotclosed instanceof lambdanew0androidxcameracoreimagecaptureRequestWithCallback;
        if (Arrays.equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, z ? ((lambdanew0androidxcameracoreimagecaptureRequestWithCallback) checknotclosed).TuitionPaymentFragmentspecialinlinedviewModeldefault1 : checknotclosed.b())) {
            return Arrays.equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, z ? ((lambdanew0androidxcameracoreimagecaptureRequestWithCallback) checknotclosed).TuitionPaymentFragmentspecialinlinedviewModeldefault2 : checknotclosed.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends checkNotClosed.TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // checkNotClosed.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final checkNotClosed.TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bArr;
            return this;
        }

        @Override // checkNotClosed.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final checkNotClosed.TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte[] bArr) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bArr;
            return this;
        }

        @Override // checkNotClosed.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final checkNotClosed TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return new lambdanew0androidxcameracoreimagecaptureRequestWithCallback(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (byte) 0);
        }
    }
}
