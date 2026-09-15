package com.bpjstku.data.point;

import com.bpjstku.data.point.model.request.PointRequest;
import com.bpjstku.data.point.model.response.PointResponse;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/point/PointRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/point/model/request/PointRequest;", "p0", "LderiveCodec;", "Lcom/bpjstku/data/point/model/response/PointResponse;", "getPointKey", "(Lcom/bpjstku/data/point/model/request/PointRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PointRepository extends getChildrenOutConfigs {
    deriveCodec<PointResponse> getPointKey(PointRequest p0);
}
