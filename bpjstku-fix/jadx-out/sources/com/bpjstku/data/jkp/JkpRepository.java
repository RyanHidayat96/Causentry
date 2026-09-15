package com.bpjstku.data.jkp;

import com.bpjstku.data.jkp.model.request.CheckSubmissionJkpRequest;
import com.bpjstku.data.jkp.model.request.JkpClaimTrackRequest;
import com.bpjstku.data.jkp.model.response.JkpClaimTrackItem;
import com.bpjstku.data.jkp.model.response.SubmissionJkpResponse;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/jkp/JkpRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/jkp/model/request/JkpClaimTrackRequest;", "p0", "LderiveCodec;", "Lcom/bpjstku/data/jkp/model/response/JkpClaimTrackItem;", "postTrackClaim", "(Lcom/bpjstku/data/jkp/model/request/JkpClaimTrackRequest;)LderiveCodec;", "Lcom/bpjstku/data/jkp/model/request/CheckSubmissionJkpRequest;", "Lcom/bpjstku/data/jkp/model/response/SubmissionJkpResponse;", "checkSubmissionJkp", "(Lcom/bpjstku/data/jkp/model/request/CheckSubmissionJkpRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface JkpRepository extends getChildrenOutConfigs {
    deriveCodec<SubmissionJkpResponse> checkSubmissionJkp(CheckSubmissionJkpRequest p0);

    deriveCodec<JkpClaimTrackItem> postTrackClaim(JkpClaimTrackRequest p0);
}
