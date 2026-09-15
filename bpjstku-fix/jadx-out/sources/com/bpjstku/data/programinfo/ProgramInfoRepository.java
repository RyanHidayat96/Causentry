package com.bpjstku.data.programinfo;

import com.bpjstku.data.programinfo.model.request.ProgramInfoRequest;
import com.bpjstku.data.programinfo.model.response.ProgramInfoItem;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import kotlin.Metadata;
import retrofit2.http.Body;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/programinfo/ProgramInfoRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/programinfo/model/request/ProgramInfoRequest;", "p0", "LderiveCodec;", "Lcom/bpjstku/data/programinfo/model/response/ProgramInfoItem;", "getProgramInfo", "(Lcom/bpjstku/data/programinfo/model/request/ProgramInfoRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ProgramInfoRepository extends getChildrenOutConfigs {
    deriveCodec<ProgramInfoItem> getProgramInfo(@Body ProgramInfoRequest p0);
}
