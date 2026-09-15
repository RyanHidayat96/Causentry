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
import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\bJ%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001bH'¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001eH'¢\u0006\u0004\b \u0010!ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/promo/remote/PromoApiClient;", "", "Lcom/bpjstku/data/lib/model/BaseRequest;", "p0", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/promo/model/response/CategoryMerchantResponse;", "getCategoryMerchant", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/response/ProvinceMerchantResponse;", "getProvinceMerchant", "Lcom/bpjstku/data/promo/model/request/DetailMerchantRequest;", "Lcom/bpjstku/data/promo/model/response/DetailMerchantResponse;", "getDetailMerchant", "(Lcom/bpjstku/data/promo/model/request/DetailMerchantRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/request/MerchantRequest;", "Lcom/bpjstku/data/promo/model/response/ListMerchantResponse;", "getListMerchant", "(Lcom/bpjstku/data/promo/model/request/MerchantRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/request/VoucherRequest;", "Lcom/bpjstku/data/promo/model/response/VoucherResponse;", "getListVoucher", "(Lcom/bpjstku/data/promo/model/request/VoucherRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/request/RedeemRequest;", "Lcom/bpjstku/data/promo/model/response/RedeemResponse;", "getVoucherCode", "(Lcom/bpjstku/data/promo/model/request/RedeemRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/request/DetailVoucherRequest;", "getDetailVoucher", "(Lcom/bpjstku/data/promo/model/request/DetailVoucherRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/request/FlagDeeplinkRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "updateFlagAksesDeeplink", "(Lcom/bpjstku/data/promo/model/request/FlagDeeplinkRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PromoApiClient {
    @POST("comarketing/getJenisProduk")
    deriveCodec<Response<CategoryMerchantResponse>> getCategoryMerchant(@Body BaseRequest p0);

    @POST("comarketing/getDetailPromoComar")
    deriveCodec<Response<DetailMerchantResponse>> getDetailMerchant(@Body DetailMerchantRequest p0);

    @POST("comarketing/getDetailVoucherComar")
    deriveCodec<Response<DetailMerchantResponse>> getDetailVoucher(@Body DetailVoucherRequest p0);

    @POST("comarketing/getListPromoComar")
    deriveCodec<Response<ListMerchantResponse>> getListMerchant(@Body MerchantRequest p0);

    @POST("comarketing/voucher")
    deriveCodec<Response<VoucherResponse>> getListVoucher(@Body VoucherRequest p0);

    @POST("comarketing/province")
    deriveCodec<Response<ProvinceMerchantResponse>> getProvinceMerchant(@Body BaseRequest p0);

    @POST("comarketing/voucher-code")
    deriveCodec<Response<RedeemResponse>> getVoucherCode(@Body RedeemRequest p0);

    @POST("comarketing/updateFlagAksesDeeplink")
    deriveCodec<Response<BaseItem>> updateFlagAksesDeeplink(@Body FlagDeeplinkRequest p0);
}
