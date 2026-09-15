package com.bpjstku.data.bsu;

import com.bpjstku.data.bsu.model.request.CheckEligibleBsuRequest;
import com.bpjstku.data.bsu.model.request.UpdateRekeningBsuRequest;
import com.bpjstku.data.bsu.model.response.CheckEligibleBsuResponse;
import com.bpjstku.data.bsu.remote.UpdateRekeningBsuResponse;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/bsu/BsuRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/bsu/model/request/CheckEligibleBsuRequest;", "p0", "LderiveCodec;", "Lcom/bpjstku/data/bsu/model/response/CheckEligibleBsuResponse;", "checkEligibleBsu", "(Lcom/bpjstku/data/bsu/model/request/CheckEligibleBsuRequest;)LderiveCodec;", "Lcom/bpjstku/data/bsu/model/request/UpdateRekeningBsuRequest;", "Lcom/bpjstku/data/bsu/remote/UpdateRekeningBsuResponse;", "updateRekeningBsu", "(Lcom/bpjstku/data/bsu/model/request/UpdateRekeningBsuRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface BsuRepository extends getChildrenOutConfigs {
    deriveCodec<CheckEligibleBsuResponse> checkEligibleBsu(CheckEligibleBsuRequest p0);

    deriveCodec<UpdateRekeningBsuResponse> updateRekeningBsu(UpdateRekeningBsuRequest p0);
}
