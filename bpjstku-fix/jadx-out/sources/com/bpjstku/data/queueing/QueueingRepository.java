package com.bpjstku.data.queueing;

import com.bpjstku.data.queueing.model.request.AntrianOnlineUrlRequest;
import com.bpjstku.data.queueing.model.request.GetDataAntrianRequest;
import com.bpjstku.data.queueing.model.request.InsertAntrianRequest;
import com.bpjstku.data.queueing.model.request.NearestOfficeRequest;
import com.bpjstku.data.queueing.model.request.QuotaBookingRequest;
import com.bpjstku.data.queueing.model.response.AntrianOnlineUrlResponse;
import com.bpjstku.data.queueing.model.response.GetDataAntrianResponse;
import com.bpjstku.data.queueing.model.response.InsertAntrianResponse;
import com.bpjstku.data.queueing.model.response.NearestOfficeResponse;
import com.bpjstku.data.queueing.model.response.QuotaBookingResponse;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\u0006\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0017J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\u0006\u0010\u0003\u001a\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/queueing/QueueingRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/queueing/model/request/NearestOfficeRequest;", "p0", "LderiveCodec;", "Lcom/bpjstku/data/queueing/model/response/NearestOfficeResponse;", "getNearestOffice", "(Lcom/bpjstku/data/queueing/model/request/NearestOfficeRequest;)LderiveCodec;", "Lcom/bpjstku/data/queueing/model/request/QuotaBookingRequest;", "Lcom/bpjstku/data/queueing/model/response/QuotaBookingResponse;", "getQuotaBooking", "(Lcom/bpjstku/data/queueing/model/request/QuotaBookingRequest;)LderiveCodec;", "Lcom/bpjstku/data/queueing/model/request/InsertAntrianRequest;", "Lcom/bpjstku/data/queueing/model/response/InsertAntrianResponse;", "insertAntrian", "(Lcom/bpjstku/data/queueing/model/request/InsertAntrianRequest;)LderiveCodec;", "", "p1", "(Ljava/lang/String;Lcom/bpjstku/data/queueing/model/request/InsertAntrianRequest;)LderiveCodec;", "Lcom/bpjstku/data/queueing/model/request/GetDataAntrianRequest;", "Lcom/bpjstku/data/queueing/model/response/GetDataAntrianResponse;", "getDataAntrian", "(Lcom/bpjstku/data/queueing/model/request/GetDataAntrianRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/queueing/model/request/GetDataAntrianRequest;)LderiveCodec;", "Lcom/bpjstku/data/queueing/model/request/AntrianOnlineUrlRequest;", "Lcom/bpjstku/data/queueing/model/response/AntrianOnlineUrlResponse;", "getAntrianOnlineUrl", "(Lcom/bpjstku/data/queueing/model/request/AntrianOnlineUrlRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface QueueingRepository extends getChildrenOutConfigs {
    deriveCodec<AntrianOnlineUrlResponse> getAntrianOnlineUrl(AntrianOnlineUrlRequest p0);

    deriveCodec<GetDataAntrianResponse> getDataAntrian(GetDataAntrianRequest p0);

    deriveCodec<GetDataAntrianResponse> getDataAntrian(String p0, GetDataAntrianRequest p1);

    deriveCodec<NearestOfficeResponse> getNearestOffice(NearestOfficeRequest p0);

    deriveCodec<QuotaBookingResponse> getQuotaBooking(QuotaBookingRequest p0);

    deriveCodec<InsertAntrianResponse> insertAntrian(InsertAntrianRequest p0);

    deriveCodec<InsertAntrianResponse> insertAntrian(String p0, InsertAntrianRequest p1);
}
