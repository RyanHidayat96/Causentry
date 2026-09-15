package defpackage;

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

/* JADX INFO: loaded from: classes3.dex */
public interface trackPipAnimationHintView {
    deriveCodec<NearestOfficeResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault2(NearestOfficeRequest nearestOfficeRequest);

    deriveCodec<InsertAntrianResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, InsertAntrianRequest insertAntrianRequest);

    deriveCodec<AntrianOnlineUrlResponse> b(AntrianOnlineUrlRequest antrianOnlineUrlRequest);

    deriveCodec<QuotaBookingResponse> b(QuotaBookingRequest quotaBookingRequest);

    deriveCodec<GetDataAntrianResponse> b(String str, GetDataAntrianRequest getDataAntrianRequest);
}
