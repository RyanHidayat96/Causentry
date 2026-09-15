package defpackage;

import com.bpjstku.data.partners.PartnersRepository;
import com.bpjstku.data.partners.model.request.GetPartnerRequest;
import com.bpjstku.data.partners.model.response.PartnerItem;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.partners.model.Partner;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class addReporter implements reportRunnablelambda0 {
    private final PartnersRepository b;

    public addReporter(PartnersRepository partnersRepository) {
        Intrinsics.checkNotNullParameter(partnersRepository, "");
        this.b = partnersRepository;
    }

    @Override // defpackage.reportRunnablelambda0
    public final deriveCodec<List<Partner>> TuitionPaymentFragmentspecialinlinedviewModeldefault2(GetPartnerRequest getPartnerRequest) {
        Intrinsics.checkNotNullParameter(getPartnerRequest, "");
        deriveCodec<List<PartnerItem>> partners = this.b.getPartners(getPartnerRequest);
        final Function1 function1 = new Function1() { // from class: r8lambdaTKFtFHklx2CcDV3Ota5gM1TFI_Y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addReporter.TuitionPaymentFragmentbindingInflater1((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: addOnReportDrawnListener
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return addReporter.b(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(partners, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.reportRunnablelambda0
    public final CodeNamePair b() {
        return this.b.getSavedCityFilter();
    }

    @Override // defpackage.reportRunnablelambda0
    public final CodeNamePair TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.b.getSavedProvinceFilter();
    }

    @Override // defpackage.reportRunnablelambda0
    public final VideoEncoderSession1 b(CodeNamePair codeNamePair) {
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        return this.b.saveCityFilter(codeNamePair);
    }

    @Override // defpackage.reportRunnablelambda0
    public final VideoEncoderSession1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(CodeNamePair codeNamePair) {
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        return this.b.saveProvinceFilter(codeNamePair);
    }

    public static /* synthetic */ List TuitionPaymentFragmentbindingInflater1(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<PartnerItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (PartnerItem partnerItem : list2) {
            removeReporter removereporter = removeReporter.INSTANCE;
            arrayList.add(removeReporter.TuitionPaymentFragmentspecialinlinedviewModeldefault3(partnerItem));
        }
        return arrayList;
    }

    public static /* synthetic */ List b(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }
}
