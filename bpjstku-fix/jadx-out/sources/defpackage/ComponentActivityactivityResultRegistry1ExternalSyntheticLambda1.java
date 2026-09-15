package defpackage;

import com.bpjstku.data.multibiller.MultiBillerRepository;
import com.bpjstku.data.multibiller.model.request.MultiBillerCheckTransactionRequest;
import com.bpjstku.data.multibiller.model.request.MultiBillerTransactionRequest;
import com.bpjstku.data.multibiller.model.response.MultiBillerCheckTransactionResponse;
import com.bpjstku.data.multibiller.model.response.MultiBillerTransactionResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ComponentActivityactivityResultRegistry1ExternalSyntheticLambda1 implements ComponentActivityactivityResultRegistry1ExternalSyntheticLambda0 {
    private final MultiBillerRepository TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public ComponentActivityactivityResultRegistry1ExternalSyntheticLambda1(MultiBillerRepository multiBillerRepository) {
        Intrinsics.checkNotNullParameter(multiBillerRepository, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = multiBillerRepository;
    }

    @Override // defpackage.ComponentActivityactivityResultRegistry1ExternalSyntheticLambda0
    public final deriveCodec<MultiBillerTransactionResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault2(MultiBillerTransactionRequest multiBillerTransactionRequest) {
        Intrinsics.checkNotNullParameter(multiBillerTransactionRequest, "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.transaction(multiBillerTransactionRequest);
    }

    @Override // defpackage.ComponentActivityactivityResultRegistry1ExternalSyntheticLambda0
    public final deriveCodec<MultiBillerCheckTransactionResponse> b(MultiBillerCheckTransactionRequest multiBillerCheckTransactionRequest) {
        Intrinsics.checkNotNullParameter(multiBillerCheckTransactionRequest, "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.checkTransaction(multiBillerCheckTransactionRequest);
    }
}
