package defpackage;

import com.bpjstku.data.jkp.JkpRepository;
import com.bpjstku.data.jkp.model.request.CheckSubmissionJkpRequest;
import com.bpjstku.data.jkp.model.request.JkpClaimTrackRequest;
import com.bpjstku.data.jkp.model.response.JkpClaimTrackItem;
import com.bpjstku.data.jkp.model.response.SubmissionJkpResponse;
import com.bpjstku.data.jkp.model.response.TahapKlaim;
import com.bpjstku.data.jkp.model.response.TitleKlaim;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.domain.jkp.model.ClaimStep;
import com.bpjstku.domain.jkp.model.ClaimTitle;
import com.bpjstku.domain.jkp.model.JkpTrackClaim;
import com.bpjstku.domain.jkp.model.SubmissionJkpCheckItem;
import com.bpjstku.util.enums.TrackingStatusEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ComponentActivityExternalSyntheticLambda2 implements ComponentActivityExternalSyntheticLambda5 {
    private final registerlambda1 TuitionPaymentFragmentbindingInflater1;
    private final PreferenceManager TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final JkpRepository TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public ComponentActivityExternalSyntheticLambda2(JkpRepository jkpRepository, registerlambda1 registerlambda1Var, PreferenceManager preferenceManager) {
        Intrinsics.checkNotNullParameter(jkpRepository, "");
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(preferenceManager, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = jkpRepository;
        this.TuitionPaymentFragmentbindingInflater1 = registerlambda1Var;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = preferenceManager;
    }

    @Override // defpackage.ComponentActivityExternalSyntheticLambda5
    public final deriveCodec<JkpTrackClaim> TuitionPaymentFragmentbindingInflater1(JkpClaimTrackRequest jkpClaimTrackRequest) {
        Intrinsics.checkNotNullParameter(jkpClaimTrackRequest, "");
        deriveCodec<JkpClaimTrackItem> derivecodecPostTrackClaim = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.postTrackClaim(jkpClaimTrackRequest);
        final Function1 function1 = new Function1() { // from class: onStateChanged
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentActivityExternalSyntheticLambda2.b((JkpClaimTrackItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ComponentActivityExternalSyntheticLambda6
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ComponentActivityExternalSyntheticLambda2.b(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostTrackClaim, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ComponentActivityExternalSyntheticLambda5
    public final deriveCodec<SubmissionJkpCheckItem> TuitionPaymentFragmentspecialinlinedviewModeldefault3(CheckSubmissionJkpRequest checkSubmissionJkpRequest) {
        Intrinsics.checkNotNullParameter(checkSubmissionJkpRequest, "");
        deriveCodec<SubmissionJkpResponse> derivecodecCheckSubmissionJkp = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.checkSubmissionJkp(checkSubmissionJkpRequest);
        final Function1 function1 = new Function1() { // from class: ComponentActivityExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentActivityExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault3((SubmissionJkpResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ComponentActivityExternalSyntheticLambda4
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ComponentActivityExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecCheckSubmissionJkp, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ SubmissionJkpCheckItem TuitionPaymentFragmentspecialinlinedviewModeldefault3(SubmissionJkpResponse submissionJkpResponse) {
        Intrinsics.checkNotNullParameter(submissionJkpResponse, "");
        Intrinsics.checkNotNullParameter(submissionJkpResponse, "");
        return new SubmissionJkpCheckItem(submissionJkpResponse.getIsSuccessful(), submissionJkpResponse.getMessage(), submissionJkpResponse.getSubmissionJkpResponseItem().getStatusKelayakan(), submissionJkpResponse.getSubmissionJkpResponseItem().getKodePesan());
    }

    public static /* synthetic */ JkpTrackClaim b(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (JkpTrackClaim) function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    public static /* synthetic */ JkpTrackClaim b(JkpClaimTrackItem jkpClaimTrackItem) {
        TrackingStatusEnum trackingStatusEnum;
        Intrinsics.checkNotNullParameter(jkpClaimTrackItem, "");
        Intrinsics.checkNotNullParameter(jkpClaimTrackItem, "");
        List<TahapKlaim> tahapKlaim = jkpClaimTrackItem.getTahapKlaim();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tahapKlaim, 10));
        for (TahapKlaim tahapKlaim2 : tahapKlaim) {
            String tahap = tahapKlaim2.getTahap();
            String keterangan = tahapKlaim2.getKeterangan();
            int iHashCode = keterangan.hashCode();
            if (iHashCode != -957656138) {
                if (iHashCode != -652198768) {
                    if (iHashCode == 426200729 && keterangan.equals("Dalam Proses")) {
                        trackingStatusEnum = TrackingStatusEnum.IN_PROCESS;
                    } else {
                        trackingStatusEnum = TrackingStatusEnum.UNKNOWN;
                    }
                } else if (keterangan.equals("Selesai")) {
                    trackingStatusEnum = TrackingStatusEnum.FINISHED;
                } else {
                    trackingStatusEnum = TrackingStatusEnum.UNKNOWN;
                }
            } else if (keterangan.equals("Ditolak")) {
                trackingStatusEnum = TrackingStatusEnum.REJECTED;
            } else {
                trackingStatusEnum = TrackingStatusEnum.UNKNOWN;
            }
            arrayList.add(new ClaimStep(trackingStatusEnum, tahap, tahapKlaim2.getTglRekam()));
        }
        TitleKlaim titleKlaim = jkpClaimTrackItem.getTitleKlaim();
        return new JkpTrackClaim(arrayList, new ClaimTitle(titleKlaim.getKodeKlaim(), titleKlaim.getTipeKlaim()));
    }

    public static /* synthetic */ SubmissionJkpCheckItem TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (SubmissionJkpCheckItem) function1.invoke(obj);
    }
}
