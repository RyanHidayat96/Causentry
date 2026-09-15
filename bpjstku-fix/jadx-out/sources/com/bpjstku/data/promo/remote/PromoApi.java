package com.bpjstku.data.promo.remote;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.promo.model.request.DetailMerchantRequest;
import com.bpjstku.data.promo.model.request.DetailVoucherRequest;
import com.bpjstku.data.promo.model.request.FlagDeeplinkRequest;
import com.bpjstku.data.promo.model.request.MerchantRequest;
import com.bpjstku.data.promo.model.request.RedeemRequest;
import com.bpjstku.data.promo.model.request.VoucherRequest;
import com.bpjstku.data.promo.model.response.CategoryMerchantResponse;
import com.bpjstku.data.promo.model.response.DetailMerchantResponse;
import com.bpjstku.data.promo.model.response.ListMerchantResponse;
import com.bpjstku.data.promo.model.response.ProvinceMerchantResponse;
import com.bpjstku.data.promo.model.response.RedeemResponse;
import com.bpjstku.data.promo.model.response.VoucherResponse;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\r\u0010\u000bJ#\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u001eH\u0017¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\b0\u00072\u0006\u0010\u0003\u001a\u00020!H\u0017¢\u0006\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lcom/bpjstku/data/promo/remote/PromoApi;", "LunbindChildren;", "Lcom/bpjstku/data/promo/remote/PromoApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/promo/remote/PromoApiClient;)V", "Lcom/bpjstku/data/lib/model/BaseRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/promo/model/response/CategoryMerchantResponse;", "getCategoryMerchant", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/response/ProvinceMerchantResponse;", "getProvinceMerchant", "Lcom/bpjstku/data/promo/model/request/DetailMerchantRequest;", "Lcom/bpjstku/data/promo/model/response/DetailMerchantResponse;", "getDetailMerchant", "(Lcom/bpjstku/data/promo/model/request/DetailMerchantRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/request/MerchantRequest;", "Lcom/bpjstku/data/promo/model/response/ListMerchantResponse;", "getListMerchant", "(Lcom/bpjstku/data/promo/model/request/MerchantRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/request/VoucherRequest;", "Lcom/bpjstku/data/promo/model/response/VoucherResponse;", "getListVoucher", "(Lcom/bpjstku/data/promo/model/request/VoucherRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/request/RedeemRequest;", "Lcom/bpjstku/data/promo/model/response/RedeemResponse;", "getVoucherCode", "(Lcom/bpjstku/data/promo/model/request/RedeemRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/request/DetailVoucherRequest;", "getDetailVoucher", "(Lcom/bpjstku/data/promo/model/request/DetailVoucherRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/request/FlagDeeplinkRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "updateFlagAksesDeeplink", "(Lcom/bpjstku/data/promo/model/request/FlagDeeplinkRequest;)LderiveCodec;", "apiClient", "Lcom/bpjstku/data/promo/remote/PromoApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PromoApi implements unbindChildren, PromoApiClient {
    public static final int $stable = 8;
    private final PromoApiClient apiClient;

    public PromoApi(PromoApiClient promoApiClient) {
        Intrinsics.checkNotNullParameter(promoApiClient, "");
        this.apiClient = promoApiClient;
    }

    @Override // com.bpjstku.data.promo.remote.PromoApiClient
    public final deriveCodec<Response<CategoryMerchantResponse>> getCategoryMerchant(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getCategoryMerchant(p0);
    }

    @Override // com.bpjstku.data.promo.remote.PromoApiClient
    public final deriveCodec<Response<ProvinceMerchantResponse>> getProvinceMerchant(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getProvinceMerchant(p0);
    }

    @Override // com.bpjstku.data.promo.remote.PromoApiClient
    public final deriveCodec<Response<DetailMerchantResponse>> getDetailMerchant(DetailMerchantRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getDetailMerchant(p0);
    }

    @Override // com.bpjstku.data.promo.remote.PromoApiClient
    public final deriveCodec<Response<ListMerchantResponse>> getListMerchant(MerchantRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getListMerchant(p0);
    }

    @Override // com.bpjstku.data.promo.remote.PromoApiClient
    public final deriveCodec<Response<VoucherResponse>> getListVoucher(VoucherRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getListVoucher(p0);
    }

    @Override // com.bpjstku.data.promo.remote.PromoApiClient
    public final deriveCodec<Response<RedeemResponse>> getVoucherCode(RedeemRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getVoucherCode(p0);
    }

    @Override // com.bpjstku.data.promo.remote.PromoApiClient
    public final deriveCodec<Response<DetailMerchantResponse>> getDetailVoucher(DetailVoucherRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getDetailVoucher(p0);
    }

    @Override // com.bpjstku.data.promo.remote.PromoApiClient
    public final deriveCodec<Response<BaseItem>> updateFlagAksesDeeplink(FlagDeeplinkRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.updateFlagAksesDeeplink(p0);
    }
}
