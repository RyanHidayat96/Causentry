package com.bpjstku.data.jp;

import com.bpjstku.data.jp.model.request.CheckEligibilityJpRequest;
import com.bpjstku.data.jp.model.request.GetCountClaimJpRequest;
import com.bpjstku.data.jp.model.request.GetJpBenefitRequest;
import com.bpjstku.data.jp.model.request.JpInstantConfirmationRequest;
import com.bpjstku.data.jp.model.request.JpVerificationLivenessBegin;
import com.bpjstku.data.jp.model.request.JpVerificationLivenessEnd;
import com.bpjstku.data.jp.model.response.CheckEligibilityJpResponse;
import com.bpjstku.data.jp.model.response.GetCountClaimJpResponse;
import com.bpjstku.data.jp.model.response.GetJpBenefitResponse;
import com.bpjstku.data.jp.model.response.JpVerificationResponse;
import com.bpjstku.data.lib.model.BaseItem;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\u0003\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u0006\u0010\u0003\u001a\u00020\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u0006\u0010\u0003\u001a\u00020\u0018H'¢\u0006\u0004\b\u0019\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/jp/JpRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/jp/model/request/GetCountClaimJpRequest;", "p0", "LderiveCodec;", "Lcom/bpjstku/data/jp/model/response/GetCountClaimJpResponse;", "getCountClaimJp", "(Lcom/bpjstku/data/jp/model/request/GetCountClaimJpRequest;)LderiveCodec;", "Lcom/bpjstku/data/jp/model/request/CheckEligibilityJpRequest;", "Lcom/bpjstku/data/jp/model/response/CheckEligibilityJpResponse;", "checkEligibilityJp", "(Lcom/bpjstku/data/jp/model/request/CheckEligibilityJpRequest;)LderiveCodec;", "Lcom/bpjstku/data/jp/model/request/GetJpBenefitRequest;", "Lcom/bpjstku/data/jp/model/response/GetJpBenefitResponse;", "getJpBenefitInformation", "(Lcom/bpjstku/data/jp/model/request/GetJpBenefitRequest;)LderiveCodec;", "Lcom/bpjstku/data/jp/model/request/JpInstantConfirmationRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "insertConfirmationJp", "(Lcom/bpjstku/data/jp/model/request/JpInstantConfirmationRequest;)LderiveCodec;", "Lcom/bpjstku/data/jp/model/request/JpVerificationLivenessBegin;", "Lcom/bpjstku/data/jp/model/response/JpVerificationResponse;", "verificationJpLivenessBegin", "(Lcom/bpjstku/data/jp/model/request/JpVerificationLivenessBegin;)LderiveCodec;", "Lcom/bpjstku/data/jp/model/request/JpVerificationLivenessEnd;", "verificationJpLivenessEnd", "(Lcom/bpjstku/data/jp/model/request/JpVerificationLivenessEnd;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface JpRepository extends getChildrenOutConfigs {
    deriveCodec<CheckEligibilityJpResponse> checkEligibilityJp(CheckEligibilityJpRequest p0);

    deriveCodec<GetCountClaimJpResponse> getCountClaimJp(GetCountClaimJpRequest p0);

    deriveCodec<GetJpBenefitResponse> getJpBenefitInformation(GetJpBenefitRequest p0);

    deriveCodec<BaseItem> insertConfirmationJp(JpInstantConfirmationRequest p0);

    deriveCodec<JpVerificationResponse> verificationJpLivenessBegin(JpVerificationLivenessBegin p0);

    deriveCodec<JpVerificationResponse> verificationJpLivenessEnd(JpVerificationLivenessEnd p0);
}
