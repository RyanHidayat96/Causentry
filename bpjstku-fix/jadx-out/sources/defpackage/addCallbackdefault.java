package defpackage;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.promo.model.request.DetailMerchantRequest;
import com.bpjstku.data.promo.model.request.DetailVoucherRequest;
import com.bpjstku.data.promo.model.request.FlagDeeplinkRequest;
import com.bpjstku.data.promo.model.request.MerchantRequest;
import com.bpjstku.data.promo.model.request.RedeemRequest;
import com.bpjstku.data.promo.model.request.VoucherRequest;
import com.bpjstku.data.promo.model.response.RedeemResponse;
import com.bpjstku.domain.promo.model.CategoryMerchant;
import com.bpjstku.domain.promo.model.DetailMerchant;
import com.bpjstku.domain.promo.model.ListMerchant;
import com.bpjstku.domain.promo.model.VoucherItem;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface addCallbackdefault {
    deriveCodec<BaseItem> TuitionPaymentFragmentbindingInflater1(FlagDeeplinkRequest flagDeeplinkRequest);

    deriveCodec<RedeemResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(RedeemRequest redeemRequest);

    deriveCodec<DetailMerchant> TuitionPaymentFragmentspecialinlinedviewModeldefault2(DetailVoucherRequest detailVoucherRequest);

    deriveCodec<List<VoucherItem>> TuitionPaymentFragmentspecialinlinedviewModeldefault2(VoucherRequest voucherRequest);

    deriveCodec<List<CategoryMerchant>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(BaseRequest baseRequest);

    deriveCodec<List<ListMerchant>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(MerchantRequest merchantRequest);

    deriveCodec<DetailMerchant> b(DetailMerchantRequest detailMerchantRequest);
}
