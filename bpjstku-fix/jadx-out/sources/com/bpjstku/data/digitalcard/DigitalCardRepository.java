package com.bpjstku.data.digitalcard;

import com.bpjstku.data.digitalcard.model.request.DigitalCardImageRequest;
import com.bpjstku.data.digitalcard.model.request.DigitalCardRequest;
import com.bpjstku.data.digitalcard.model.request.MembershipInformationRequest;
import com.bpjstku.data.digitalcard.model.response.BPUMembershipInformationItem;
import com.bpjstku.data.digitalcard.model.response.DigitalCardItem;
import com.bpjstku.data.digitalcard.model.response.PMIMembershipInformationItem;
import com.bpjstku.data.digitalcard.model.response.PUMembershipInformationItem;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import java.util.List;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0001\u0010\u0003\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000eH'¢\u0006\u0004\b\u0013\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\u0006\u0010\u0003\u001a\u00020\u000eH'¢\u0006\u0004\b\u0015\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/digitalcard/DigitalCardRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/digitalcard/model/request/DigitalCardRequest;", "p0", "LderiveCodec;", "", "Lcom/bpjstku/data/digitalcard/model/response/DigitalCardItem;", "getDigitalCards", "(Lcom/bpjstku/data/digitalcard/model/request/DigitalCardRequest;)LderiveCodec;", "Lcom/bpjstku/data/digitalcard/model/request/DigitalCardImageRequest;", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "getDigitalCardImage", "(Lcom/bpjstku/data/digitalcard/model/request/DigitalCardImageRequest;)Lretrofit2/Response;", "Lcom/bpjstku/data/digitalcard/model/request/MembershipInformationRequest;", "Lcom/bpjstku/data/digitalcard/model/response/BPUMembershipInformationItem;", "getBPUMembershipInformation", "(Lcom/bpjstku/data/digitalcard/model/request/MembershipInformationRequest;)LderiveCodec;", "Lcom/bpjstku/data/digitalcard/model/response/PUMembershipInformationItem;", "getPUMembershipInformation", "Lcom/bpjstku/data/digitalcard/model/response/PMIMembershipInformationItem;", "getPMIMembershipInformation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface DigitalCardRepository extends getChildrenOutConfigs {
    deriveCodec<BPUMembershipInformationItem> getBPUMembershipInformation(@Body MembershipInformationRequest p0);

    Response<ResponseBody> getDigitalCardImage(@Body DigitalCardImageRequest p0);

    deriveCodec<List<DigitalCardItem>> getDigitalCards(@Body DigitalCardRequest p0);

    deriveCodec<PMIMembershipInformationItem> getPMIMembershipInformation(MembershipInformationRequest p0);

    deriveCodec<PUMembershipInformationItem> getPUMembershipInformation(@Body MembershipInformationRequest p0);
}
