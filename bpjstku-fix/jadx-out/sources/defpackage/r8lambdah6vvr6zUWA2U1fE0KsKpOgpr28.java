package defpackage;

import com.bpjstku.data.danasiaga.DanaSiagaRepository;
import com.bpjstku.data.danasiaga.model.request.CheckEligiblePinangRequest;
import com.bpjstku.data.danasiaga.model.request.EligibleIctMenuRequest;
import com.bpjstku.data.danasiaga.model.response.CheckEligiblePinangResponse;
import com.bpjstku.data.danasiaga.model.response.EligibleIctMenuResponse;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 implements _init_lambda2 {
    private final DanaSiagaRepository TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28(DanaSiagaRepository danaSiagaRepository) {
        Intrinsics.checkNotNullParameter(danaSiagaRepository, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = danaSiagaRepository;
    }

    @Override // defpackage._init_lambda2
    public final deriveCodec<CheckEligiblePinangResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault2(CheckEligiblePinangRequest checkEligiblePinangRequest) {
        Intrinsics.checkNotNullParameter(checkEligiblePinangRequest, "");
        deriveCodec<CheckEligiblePinangResponse> derivecodecCheckEligiblePinang = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.checkEligiblePinang(checkEligiblePinangRequest);
        final Function1 function1 = new Function1() { // from class: r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.TuitionPaymentFragmentspecialinlinedviewModeldefault2((CheckEligiblePinangResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecCheckEligiblePinang, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage._init_lambda2
    public final deriveCodec<EligibleIctMenuResponse> b(EligibleIctMenuRequest eligibleIctMenuRequest) {
        Intrinsics.checkNotNullParameter(eligibleIctMenuRequest, "");
        deriveCodec<EligibleIctMenuResponse> derivecodecIctEligibleMenu = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.ictEligibleMenu(eligibleIctMenuRequest);
        final Function1 function1 = new Function1() { // from class: r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.TuitionPaymentFragmentbindingInflater1((EligibleIctMenuResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecIctEligibleMenu, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ CheckEligiblePinangResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CheckEligiblePinangResponse) function1.invoke(obj);
    }

    public static /* synthetic */ EligibleIctMenuResponse TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (EligibleIctMenuResponse) function1.invoke(obj);
    }

    public static /* synthetic */ EligibleIctMenuResponse TuitionPaymentFragmentbindingInflater1(EligibleIctMenuResponse eligibleIctMenuResponse) {
        Intrinsics.checkNotNullParameter(eligibleIctMenuResponse, "");
        return eligibleIctMenuResponse;
    }

    public static /* synthetic */ CheckEligiblePinangResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(CheckEligiblePinangResponse checkEligiblePinangResponse) {
        Intrinsics.checkNotNullParameter(checkEligiblePinangResponse, "");
        return checkEligiblePinangResponse;
    }
}
