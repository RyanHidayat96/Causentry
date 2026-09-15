package com.bpjstku.data.syariah;

import com.bpjstku.data.syariah.model.request.SyariahEakadPdfRequest;
import com.bpjstku.data.syariah.model.request.SyariahFaqRequest;
import com.bpjstku.data.syariah.model.request.SyariahMembershipCheckRequest;
import com.bpjstku.data.syariah.model.request.SyariahUpdateMembershipRequest;
import com.bpjstku.data.syariah.model.response.SyariahFaqItem;
import com.bpjstku.data.syariah.model.response.SyariahMembershipCheckItem;
import com.bpjstku.domain.general.model.BaseModel;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import java.util.List;
import kotlin.Metadata;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00042\u0006\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0003\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/syariah/SyariahRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/syariah/model/request/SyariahUpdateMembershipRequest;", "p0", "LderiveCodec;", "Lcom/bpjstku/domain/general/model/BaseModel;", "updateMembershipSyariah", "(Lcom/bpjstku/data/syariah/model/request/SyariahUpdateMembershipRequest;)LderiveCodec;", "Lcom/bpjstku/data/syariah/model/request/SyariahFaqRequest;", "", "Lcom/bpjstku/data/syariah/model/response/SyariahFaqItem;", "getFaqSyariahService", "(Lcom/bpjstku/data/syariah/model/request/SyariahFaqRequest;)LderiveCodec;", "Lcom/bpjstku/data/syariah/model/request/SyariahEakadPdfRequest;", "Lokhttp3/ResponseBody;", "getEakadPdf", "(Lcom/bpjstku/data/syariah/model/request/SyariahEakadPdfRequest;)LderiveCodec;", "Lcom/bpjstku/data/syariah/model/request/SyariahMembershipCheckRequest;", "Lcom/bpjstku/data/syariah/model/response/SyariahMembershipCheckItem;", "getEakadStatus", "(Lcom/bpjstku/data/syariah/model/request/SyariahMembershipCheckRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SyariahRepository extends getChildrenOutConfigs {
    deriveCodec<ResponseBody> getEakadPdf(SyariahEakadPdfRequest p0);

    deriveCodec<SyariahMembershipCheckItem> getEakadStatus(SyariahMembershipCheckRequest p0);

    deriveCodec<List<SyariahFaqItem>> getFaqSyariahService(SyariahFaqRequest p0);

    deriveCodec<BaseModel> updateMembershipSyariah(SyariahUpdateMembershipRequest p0);
}
