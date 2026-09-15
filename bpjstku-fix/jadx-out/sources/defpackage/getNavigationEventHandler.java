package defpackage;

import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.syariah.SyariahRepository;
import com.bpjstku.data.syariah.model.request.SyariahEakadPdfRequest;
import com.bpjstku.data.syariah.model.request.SyariahFaqRequest;
import com.bpjstku.data.syariah.model.request.SyariahMembershipCheckRequest;
import com.bpjstku.data.syariah.model.request.SyariahUpdateMembershipRequest;
import com.bpjstku.data.syariah.model.response.SyariahFaqItem;
import com.bpjstku.data.syariah.model.response.SyariahMembershipCheckItem;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.syariah.model.FaqSyariah;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class getNavigationEventHandler implements ContextAware {
    private final SyariahRepository TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final PreferenceManager TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public getNavigationEventHandler(SyariahRepository syariahRepository, PreferenceManager preferenceManager) {
        Intrinsics.checkNotNullParameter(syariahRepository, "");
        Intrinsics.checkNotNullParameter(preferenceManager, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = syariahRepository;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = preferenceManager;
    }

    @Override // defpackage.ContextAware
    public final deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault2(SyariahUpdateMembershipRequest syariahUpdateMembershipRequest) {
        Intrinsics.checkNotNullParameter(syariahUpdateMembershipRequest, "");
        deriveCodec<BaseModel> derivecodecUpdateMembershipSyariah = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.updateMembershipSyariah(syariahUpdateMembershipRequest);
        final Function1 function1 = new Function1() { // from class: BackHandlerCompatnavigationEventHandler1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getNavigationEventHandler.b((BaseModel) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: addHandler
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getNavigationEventHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecUpdateMembershipSyariah, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ContextAware
    public final deriveCodec<List<FaqSyariah>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(SyariahFaqRequest syariahFaqRequest) {
        Intrinsics.checkNotNullParameter(syariahFaqRequest, "");
        deriveCodec<List<SyariahFaqItem>> faqSyariahService = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getFaqSyariahService(syariahFaqRequest);
        final Function1 function1 = new Function1() { // from class: BackHandlerCompat
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getNavigationEventHandler.b((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getInfo
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getNavigationEventHandler.b(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(faqSyariahService, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ContextAware
    public final deriveCodec<InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault2(SyariahEakadPdfRequest syariahEakadPdfRequest) {
        Intrinsics.checkNotNullParameter(syariahEakadPdfRequest, "");
        deriveCodec<ResponseBody> eakadPdf = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getEakadPdf(syariahEakadPdfRequest);
        final Function1 function1 = new Function1() { // from class: BackHandlerCompatonBackPressedCallback1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getNavigationEventHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault1((ResponseBody) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getOnBackPressedCallback
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getNavigationEventHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(eakadPdf, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ContextAware
    public final deriveCodec<SyariahMembershipCheckItem> TuitionPaymentFragmentbindingInflater1(SyariahMembershipCheckRequest syariahMembershipCheckRequest) {
        Intrinsics.checkNotNullParameter(syariahMembershipCheckRequest, "");
        deriveCodec<SyariahMembershipCheckItem> eakadStatus = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getEakadStatus(syariahMembershipCheckRequest);
        final Function1 function1 = new Function1() { // from class: ReportDrawnKtReportDrawnWhenlambda10inlinedonDispose2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getNavigationEventHandler.b((SyariahMembershipCheckItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: BackHandlerDispatcherCompat
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getNavigationEventHandler.TuitionPaymentFragmentbindingInflater1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(eakadStatus, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ BaseModel b(BaseModel baseModel) {
        Intrinsics.checkNotNullParameter(baseModel, "");
        return baseModel;
    }

    public static /* synthetic */ SyariahMembershipCheckItem b(SyariahMembershipCheckItem syariahMembershipCheckItem) {
        Intrinsics.checkNotNullParameter(syariahMembershipCheckItem, "");
        return syariahMembershipCheckItem;
    }

    public static /* synthetic */ List b(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault1(ResponseBody responseBody) {
        Intrinsics.checkNotNullParameter(responseBody, "");
        return responseBody.byteStream();
    }

    public static /* synthetic */ SyariahMembershipCheckItem TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (SyariahMembershipCheckItem) function1.invoke(obj);
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
    }

    public static /* synthetic */ List b(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<SyariahFaqItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (SyariahFaqItem syariahFaqItem : list2) {
            Intrinsics.checkNotNullParameter(syariahFaqItem, "");
            String question = syariahFaqItem.getQuestion();
            if (question == null) {
                question = "";
            }
            String answer = syariahFaqItem.getAnswer();
            if (answer == null) {
                answer = "";
            }
            arrayList.add(new FaqSyariah(question, answer));
        }
        return arrayList;
    }

    public static /* synthetic */ InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InputStream) function1.invoke(obj);
    }
}
