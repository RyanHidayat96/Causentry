package defpackage;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class surfaceCreated extends RotationProviderListenerWrapperExternalSyntheticLambda0 {
    private final long TuitionPaymentFragmentbindingInflater1;
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public surfaceCreated(tryToComplete trytocomplete, long j, boolean z) {
        super(trytocomplete);
        Intrinsics.checkNotNullParameter(trytocomplete, "");
        this.TuitionPaymentFragmentbindingInflater1 = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
    }

    @Override // defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0, defpackage.tryToComplete
    public final long read(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IOException {
        Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
        long j2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        long j3 = this.TuitionPaymentFragmentbindingInflater1;
        if (j2 > j3) {
            j = 0;
        } else if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long j5 = super.read(rotationProviderListenerWrapper, j);
        if (j5 != -1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 += j5;
        }
        long j6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        long j7 = this.TuitionPaymentFragmentbindingInflater1;
        if ((j6 >= j7 || j5 != -1) && j6 <= j7) {
            return j5;
        }
        if (j5 > 0 && j6 > j7) {
            long j8 = rotationProviderListenerWrapper.size - (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - this.TuitionPaymentFragmentbindingInflater1);
            RotationProviderListenerWrapper rotationProviderListenerWrapper2 = new RotationProviderListenerWrapper();
            rotationProviderListenerWrapper2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper);
            rotationProviderListenerWrapper.write(rotationProviderListenerWrapper2, j8);
            rotationProviderListenerWrapper2.g(rotationProviderListenerWrapper2.size);
        }
        StringBuilder sb = new StringBuilder("expected ");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(" bytes but got ");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        throw new IOException(sb.toString());
    }
}
