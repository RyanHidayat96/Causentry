package defpackage;

import com.bpjstku.data.queueing.QueueingRepository;
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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class OnBackPressedDispatcherKt implements trackPipAnimationHintView {
    private final QueueingRepository TuitionPaymentFragmentbindingInflater1;
    private final String b;

    public OnBackPressedDispatcherKt(QueueingRepository queueingRepository) {
        Intrinsics.checkNotNullParameter(queueingRepository, "");
        this.TuitionPaymentFragmentbindingInflater1 = queueingRepository;
        this.b = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // defpackage.trackPipAnimationHintView
    public final deriveCodec<NearestOfficeResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault2(NearestOfficeRequest nearestOfficeRequest) {
        Intrinsics.checkNotNullParameter(nearestOfficeRequest, "");
        return this.TuitionPaymentFragmentbindingInflater1.getNearestOffice(nearestOfficeRequest);
    }

    @Override // defpackage.trackPipAnimationHintView
    public final deriveCodec<QuotaBookingResponse> b(QuotaBookingRequest quotaBookingRequest) {
        Intrinsics.checkNotNullParameter(quotaBookingRequest, "");
        return this.TuitionPaymentFragmentbindingInflater1.getQuotaBooking(quotaBookingRequest);
    }

    @Override // defpackage.trackPipAnimationHintView
    public final deriveCodec<InsertAntrianResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, InsertAntrianRequest insertAntrianRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(insertAntrianRequest, "");
        return this.TuitionPaymentFragmentbindingInflater1.insertAntrian(str, insertAntrianRequest);
    }

    @Override // defpackage.trackPipAnimationHintView
    public final deriveCodec<GetDataAntrianResponse> b(String str, GetDataAntrianRequest getDataAntrianRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(getDataAntrianRequest, "");
        return this.TuitionPaymentFragmentbindingInflater1.getDataAntrian(str, getDataAntrianRequest);
    }

    @Override // defpackage.trackPipAnimationHintView
    public final deriveCodec<AntrianOnlineUrlResponse> b(AntrianOnlineUrlRequest antrianOnlineUrlRequest) {
        Intrinsics.checkNotNullParameter(antrianOnlineUrlRequest, "");
        return this.TuitionPaymentFragmentbindingInflater1.getAntrianOnlineUrl(new AntrianOnlineUrlRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, antrianOnlineUrlRequest.getEmail(), this.b), antrianOnlineUrlRequest.getKpj(), antrianOnlineUrlRequest.getJenisAntrian(), antrianOnlineUrlRequest.getKodeSebabKlaim()));
    }
}
