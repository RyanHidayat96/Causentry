package com.bpjstku.data.mnc;

import com.bpjstku.data.mnc.model.request.VisionProvisioningRequest;
import com.bpjstku.domain.general.model.BaseModel;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import kotlin.Metadata;
import retrofit2.http.Body;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/mnc/MncRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/mnc/model/request/VisionProvisioningRequest;", "p0", "LderiveCodec;", "Lcom/bpjstku/domain/general/model/BaseModel;", "provisioningVisionPlus", "(Lcom/bpjstku/data/mnc/model/request/VisionProvisioningRequest;)LderiveCodec;", "", "isProvisioned", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MncRepository extends getChildrenOutConfigs {
    boolean isProvisioned();

    deriveCodec<BaseModel> provisioningVisionPlus(@Body VisionProvisioningRequest p0);
}
