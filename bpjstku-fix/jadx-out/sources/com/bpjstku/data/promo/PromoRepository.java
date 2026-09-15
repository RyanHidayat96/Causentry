package com.bpjstku.data.promo;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.promo.model.request.DetailMerchantRequest;
import com.bpjstku.data.promo.model.request.DetailVoucherRequest;
import com.bpjstku.data.promo.model.request.FlagDeeplinkRequest;
import com.bpjstku.data.promo.model.request.MerchantRequest;
import com.bpjstku.data.promo.model.request.RedeemRequest;
import com.bpjstku.data.promo.model.request.VoucherRequest;
import com.bpjstku.data.promo.model.response.CategoryItem;
import com.bpjstku.data.promo.model.response.DetailMerchantItem;
import com.bpjstku.data.promo.model.response.ListMerchantItem;
import com.bpjstku.data.promo.model.response.ProvinceItem;
import com.bpjstku.data.promo.model.response.RedeemResponse;
import com.bpjstku.data.promo.model.response.VoucherList;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u0006\u0010\u0003\u001a\u00020\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0003\u001a\u00020\u001bH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\u0006\u0010\u0003\u001a\u00020\u001eH'¢\u0006\u0004\b \u0010!ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/promo/PromoRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "p0", "LderiveCodec;", "", "Lcom/bpjstku/data/promo/model/response/CategoryItem;", "getCategoryMerchant", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/response/ProvinceItem;", "getProvinceMerchant", "Lcom/bpjstku/data/promo/model/request/DetailMerchantRequest;", "Lcom/bpjstku/data/promo/model/response/DetailMerchantItem;", "getDetailMerchant", "(Lcom/bpjstku/data/promo/model/request/DetailMerchantRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/request/MerchantRequest;", "Lcom/bpjstku/data/promo/model/response/ListMerchantItem;", "getListMerchant", "(Lcom/bpjstku/data/promo/model/request/MerchantRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/request/VoucherRequest;", "Lcom/bpjstku/data/promo/model/response/VoucherList;", "getListVoucher", "(Lcom/bpjstku/data/promo/model/request/VoucherRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/request/RedeemRequest;", "Lcom/bpjstku/data/promo/model/response/RedeemResponse;", "getVoucherCode", "(Lcom/bpjstku/data/promo/model/request/RedeemRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/request/DetailVoucherRequest;", "getDetailVoucher", "(Lcom/bpjstku/data/promo/model/request/DetailVoucherRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/request/FlagDeeplinkRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "updateFlagAksesDeeplink", "(Lcom/bpjstku/data/promo/model/request/FlagDeeplinkRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PromoRepository extends getChildrenOutConfigs {
    deriveCodec<List<CategoryItem>> getCategoryMerchant(BaseRequest p0);

    deriveCodec<DetailMerchantItem> getDetailMerchant(DetailMerchantRequest p0);

    deriveCodec<DetailMerchantItem> getDetailVoucher(DetailVoucherRequest p0);

    deriveCodec<List<ListMerchantItem>> getListMerchant(MerchantRequest p0);

    deriveCodec<List<VoucherList>> getListVoucher(VoucherRequest p0);

    deriveCodec<List<ProvinceItem>> getProvinceMerchant(BaseRequest p0);

    deriveCodec<RedeemResponse> getVoucherCode(RedeemRequest p0);

    deriveCodec<BaseItem> updateFlagAksesDeeplink(FlagDeeplinkRequest p0);
}
