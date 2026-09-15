package defpackage;

import com.bpjstku.data.jp.JpRepository;
import com.bpjstku.data.jp.model.request.CheckEligibilityJpRequest;
import com.bpjstku.data.jp.model.request.GetCountClaimJpRequest;
import com.bpjstku.data.jp.model.request.GetJpBenefitRequest;
import com.bpjstku.data.jp.model.request.JpVerificationLivenessBegin;
import com.bpjstku.data.jp.model.request.JpVerificationLivenessEnd;
import com.bpjstku.data.jp.model.response.CheckEligibilityJpResponse;
import com.bpjstku.data.jp.model.response.GetCountClaimJpResponse;
import com.bpjstku.data.jp.model.response.GetJpBenefitResponse;
import com.bpjstku.data.jp.model.response.JpDataTkItem;
import com.bpjstku.data.jp.model.response.JpVerificationResponse;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.domain.jp.model.CheckEligibleJp;
import com.bpjstku.domain.jp.model.GetCountClaimJp;
import com.bpjstku.domain.jp.model.JpBenefitInformation;
import com.bpjstku.domain.jp.model.JpDataTk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class onContextAvailable implements ComponentActivityReportFullyDrawnExecutorImpl {
    private final String TuitionPaymentFragmentbindingInflater1;
    private final JpRepository TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final registerlambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final PreferenceManager b;

    public onContextAvailable(JpRepository jpRepository, registerlambda1 registerlambda1Var, PreferenceManager preferenceManager) {
        Intrinsics.checkNotNullParameter(jpRepository, "");
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(preferenceManager, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = jpRepository;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = registerlambda1Var;
        this.b = preferenceManager;
        this.TuitionPaymentFragmentbindingInflater1 = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // defpackage.ComponentActivityReportFullyDrawnExecutorImpl
    public final deriveCodec<GetCountClaimJp> TuitionPaymentFragmentspecialinlinedviewModeldefault3(GetCountClaimJpRequest getCountClaimJpRequest) {
        Intrinsics.checkNotNullParameter(getCountClaimJpRequest, "");
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        deriveCodec<GetCountClaimJpResponse> countClaimJp = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getCountClaimJp(new GetCountClaimJpRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getCountClaimJpRequest.getNikPelapor()), getCountClaimJpRequest.getPelaporEmail()));
        final Function1 function1 = new Function1() { // from class: r8lambda0sNsUdVD3QenIrnQ9NJ_gPQ5x8k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onContextAvailable.b((GetCountClaimJpResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ComponentActivityReportFullyDrawnExecutor
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return onContextAvailable.b(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(countClaimJp, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ComponentActivityReportFullyDrawnExecutorImpl
    public final deriveCodec<CheckEligibleJp> b(CheckEligibilityJpRequest checkEligibilityJpRequest) {
        Intrinsics.checkNotNullParameter(checkEligibilityJpRequest, "");
        deriveCodec<CheckEligibilityJpResponse> derivecodecCheckEligibilityJp = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.checkEligibilityJp(checkEligibilityJpRequest);
        final Function1 function1 = new Function1() { // from class: ComponentActivity4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onContextAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault2((CheckEligibilityJpResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: setViewModelStore
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return onContextAvailable.g(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecCheckEligibilityJp, readablems);
        final Function1 function2 = new Function1() { // from class: ComponentActivityCompanion
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onContextAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (CheckEligibleJp) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: setCustom
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        };
        share.b(logtostring, "onSuccess is null");
        currentSystemTimeNs currentsystemtimens = new currentSystemTimeNs(api23Impl, logtostring);
        Intrinsics.checkNotNullExpressionValue(currentsystemtimens, "");
        return currentsystemtimens;
    }

    @Override // defpackage.ComponentActivityReportFullyDrawnExecutorImpl
    public final deriveCodec<activityDestroyed> TuitionPaymentFragmentbindingInflater1(GetJpBenefitRequest getJpBenefitRequest) {
        Intrinsics.checkNotNullParameter(getJpBenefitRequest, "");
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        deriveCodec<GetJpBenefitResponse> jpBenefitInformation = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getJpBenefitInformation(new GetJpBenefitRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getJpBenefitRequest.getKodeKlaim()), getJpBenefitRequest.getEmail()));
        final Function1 function1 = new Function1() { // from class: ComponentActivityExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onContextAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault2((GetJpBenefitResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getCustom
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return onContextAvailable.TuitionPaymentFragmentbindingInflater1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(jpBenefitInformation, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ComponentActivityReportFullyDrawnExecutorImpl
    public final deriveCodec<JpVerificationResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault2(JpVerificationLivenessBegin jpVerificationLivenessBegin) {
        Intrinsics.checkNotNullParameter(jpVerificationLivenessBegin, "");
        String nik = jpVerificationLivenessBegin.getNik();
        String email = jpVerificationLivenessBegin.getEmail();
        String signature = jpVerificationLivenessBegin.getSignature();
        deriveCodec<JpVerificationResponse> derivecodecVerificationJpLivenessBegin = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.verificationJpLivenessBegin(new JpVerificationLivenessBegin(nik, email, signature != null ? Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, signature, this.TuitionPaymentFragmentbindingInflater1) : null));
        final Function1 function1 = new Function1() { // from class: saveState
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onContextAvailable.TuitionPaymentFragmentbindingInflater1((JpVerificationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ComponentActivityExternalSyntheticLambda8
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return onContextAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerificationJpLivenessBegin, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ComponentActivityReportFullyDrawnExecutorImpl
    public final deriveCodec<JpVerificationResponse> b(JpVerificationLivenessEnd jpVerificationLivenessEnd) {
        Intrinsics.checkNotNullParameter(jpVerificationLivenessEnd, "");
        String email = jpVerificationLivenessEnd.getEmail();
        String flData = jpVerificationLivenessEnd.getFlData();
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = flData != null ? Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, flData, this.TuitionPaymentFragmentbindingInflater1) : null;
        String brand = jpVerificationLivenessEnd.getBrand();
        String deviceId = jpVerificationLivenessEnd.getDeviceId();
        String model = jpVerificationLivenessEnd.getModel();
        String sdk = jpVerificationLivenessEnd.getSdk();
        String manufacture = jpVerificationLivenessEnd.getManufacture();
        String file = jpVerificationLivenessEnd.getFile();
        String kodeKlaim = jpVerificationLivenessEnd.getKodeKlaim();
        String nikPekerja = jpVerificationLivenessEnd.getNikPekerja();
        String signature = jpVerificationLivenessEnd.getSignature();
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = signature != null ? Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, signature, this.TuitionPaymentFragmentbindingInflater1) : null;
        String transactionIdSdk = jpVerificationLivenessEnd.getTransactionIdSdk();
        String scoreLiveness = jpVerificationLivenessEnd.getScoreLiveness();
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = scoreLiveness != null ? Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, scoreLiveness, this.TuitionPaymentFragmentbindingInflater1) : null;
        String scoreManipulation = jpVerificationLivenessEnd.getScoreManipulation();
        deriveCodec<JpVerificationResponse> derivecodecVerificationJpLivenessEnd = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.verificationJpLivenessEnd(new JpVerificationLivenessEnd(email, strTuitionPaymentFragmentspecialinlinedviewModeldefault1, brand, deviceId, model, sdk, manufacture, file, kodeKlaim, nikPekerja, strTuitionPaymentFragmentspecialinlinedviewModeldefault2, transactionIdSdk, strTuitionPaymentFragmentspecialinlinedviewModeldefault3, scoreManipulation != null ? Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, scoreManipulation, this.TuitionPaymentFragmentbindingInflater1) : null));
        final Function1 function1 = new Function1() { // from class: ComponentActivityNonConfigurationInstances
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onContextAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1((JpVerificationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: viewCreated
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return onContextAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerificationJpLivenessEnd, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ComponentActivityReportFullyDrawnExecutorImpl
    public final CheckEligibleJp b() {
        return (CheckEligibleJp) this.b.getObject("KEY_JP_SIGNATURE", CheckEligibleJp.class);
    }

    public static /* synthetic */ CheckEligibleJp TuitionPaymentFragmentspecialinlinedviewModeldefault2(CheckEligibilityJpResponse checkEligibilityJpResponse) {
        Intrinsics.checkNotNullParameter(checkEligibilityJpResponse, "");
        Intrinsics.checkNotNullParameter(checkEligibilityJpResponse, "");
        return new CheckEligibleJp(checkEligibilityJpResponse.getStatusEligible(), checkEligibilityJpResponse.getStatusEksisKonfirmasi(), checkEligibilityJpResponse.getKeterangan(), Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(checkEligibilityJpResponse.getSignature(), Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3())));
    }

    public static /* synthetic */ JpVerificationResponse TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (JpVerificationResponse) function1.invoke(obj);
    }

    public static /* synthetic */ JpVerificationResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (JpVerificationResponse) function1.invoke(obj);
    }

    public static /* synthetic */ GetCountClaimJp b(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (GetCountClaimJp) function1.invoke(obj);
    }

    public static /* synthetic */ JpVerificationResponse TuitionPaymentFragmentbindingInflater1(JpVerificationResponse jpVerificationResponse) {
        Intrinsics.checkNotNullParameter(jpVerificationResponse, "");
        return getCurrentRunnable.b(jpVerificationResponse);
    }

    public static /* synthetic */ activityDestroyed TuitionPaymentFragmentspecialinlinedviewModeldefault2(GetJpBenefitResponse getJpBenefitResponse) throws Throwable {
        Intrinsics.checkNotNullParameter(getJpBenefitResponse, "");
        Intrinsics.checkNotNullParameter(getJpBenefitResponse, "");
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getJpBenefitResponse.getData().getDataFound());
        Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getJpBenefitResponse.getData().getKodeKlaim());
        Camera2InteropExtender.Companion companion3 = Camera2InteropExtender.INSTANCE;
        int i = Integer.parseInt(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getJpBenefitResponse.getData().getNoProses()));
        Camera2InteropExtender.Companion companion4 = Camera2InteropExtender.INSTANCE;
        double d = Double.parseDouble(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getJpBenefitResponse.getData().getNomRapel()));
        Camera2InteropExtender.Companion companion5 = Camera2InteropExtender.INSTANCE;
        double d2 = Double.parseDouble(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getJpBenefitResponse.getData().getNomKompensasi()));
        Camera2InteropExtender.Companion companion6 = Camera2InteropExtender.INSTANCE;
        double d3 = Double.parseDouble(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getJpBenefitResponse.getData().getNomBerjalan()));
        Camera2InteropExtender.Companion companion7 = Camera2InteropExtender.INSTANCE;
        double d4 = Double.parseDouble(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getJpBenefitResponse.getData().getNomManfaatNetto()));
        Camera2InteropExtender.Companion companion8 = Camera2InteropExtender.INSTANCE;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getJpBenefitResponse.getData().getBlthProses());
        Camera2InteropExtender.Companion companion9 = Camera2InteropExtender.INSTANCE;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getJpBenefitResponse.getData().getCountRapel());
        Camera2InteropExtender.Companion companion10 = Camera2InteropExtender.INSTANCE;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault5 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getJpBenefitResponse.getData().getStatusLunas());
        Camera2InteropExtender.Companion companion11 = Camera2InteropExtender.INSTANCE;
        double d5 = Double.parseDouble(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getJpBenefitResponse.getData().getCountRapelAll()));
        Camera2InteropExtender.Companion companion12 = Camera2InteropExtender.INSTANCE;
        return new activityDestroyed(new JpBenefitInformation(strTuitionPaymentFragmentspecialinlinedviewModeldefault1, strTuitionPaymentFragmentspecialinlinedviewModeldefault2, i, d, d2, d3, d4, strTuitionPaymentFragmentspecialinlinedviewModeldefault3, strTuitionPaymentFragmentspecialinlinedviewModeldefault4, strTuitionPaymentFragmentspecialinlinedviewModeldefault5, d5, Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getJpBenefitResponse.getData().getTglKonfirmasiBaru())));
    }

    public static /* synthetic */ GetCountClaimJp b(GetCountClaimJpResponse getCountClaimJpResponse) throws Throwable {
        Intrinsics.checkNotNullParameter(getCountClaimJpResponse, "");
        Intrinsics.checkNotNullParameter(getCountClaimJpResponse, "");
        String strIsMoreThanOneClaimJp = getCountClaimJpResponse.isMoreThanOneClaimJp();
        int countClaimJp = getCountClaimJpResponse.getCountClaimJp();
        List<JpDataTkItem> dataTk = getCountClaimJpResponse.getDataTk();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(dataTk, 10));
        for (JpDataTkItem jpDataTkItem : dataTk) {
            Intrinsics.checkNotNullParameter(jpDataTkItem, "");
            Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jpDataTkItem.getKpjPekerjan());
            Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jpDataTkItem.getNikPekerja());
            Camera2InteropExtender.Companion companion3 = Camera2InteropExtender.INSTANCE;
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jpDataTkItem.getNamaLengkapPekerja());
            Camera2InteropExtender.Companion companion4 = Camera2InteropExtender.INSTANCE;
            arrayList.add(new JpDataTk(strTuitionPaymentFragmentspecialinlinedviewModeldefault1, strTuitionPaymentFragmentspecialinlinedviewModeldefault2, strTuitionPaymentFragmentspecialinlinedviewModeldefault3, Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jpDataTkItem.getKodeKlaim())));
        }
        return new GetCountClaimJp(strIsMoreThanOneClaimJp, countClaimJp, arrayList);
    }

    public static /* synthetic */ activityDestroyed TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (activityDestroyed) function1.invoke(obj);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(onContextAvailable oncontextavailable, CheckEligibleJp checkEligibleJp) {
        if (checkEligibleJp != null) {
            oncontextavailable.b.saveObject("KEY_JP_SIGNATURE", checkEligibleJp);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ JpVerificationResponse TuitionPaymentFragmentspecialinlinedviewModeldefault1(JpVerificationResponse jpVerificationResponse) {
        Intrinsics.checkNotNullParameter(jpVerificationResponse, "");
        return getCurrentRunnable.b(jpVerificationResponse);
    }

    public static /* synthetic */ CheckEligibleJp g(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CheckEligibleJp) function1.invoke(obj);
    }
}
