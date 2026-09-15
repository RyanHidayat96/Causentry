package com.bpjstku.data.vocation;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.lib.model.CodeAndNamePairItem;
import com.bpjstku.data.registration.general.model.response.VerificationItem;
import com.bpjstku.data.registration.pmi.model.request.CityRequest;
import com.bpjstku.data.registration.pmi.model.response.CityItem;
import com.bpjstku.data.registration.pmi.model.response.ProvinceItem;
import com.bpjstku.data.vocation.model.request.AccountNameSimilarityRequest;
import com.bpjstku.data.vocation.model.request.BlkProfileRequest;
import com.bpjstku.data.vocation.model.request.SaveSurveyRequest;
import com.bpjstku.data.vocation.model.request.TrainingFieldRequest;
import com.bpjstku.data.vocation.model.request.VocationEligibilityRequest;
import com.bpjstku.data.vocation.model.request.VocationPhoneVerificationRequest;
import com.bpjstku.data.vocation.model.request.VocationProfileRequest;
import com.bpjstku.data.vocation.model.request.VocationRegisterRequest;
import com.bpjstku.data.vocation.model.request.VocationTrainingRequest;
import com.bpjstku.data.vocation.model.response.AccountSimilarityItem;
import com.bpjstku.data.vocation.model.response.BankItem;
import com.bpjstku.data.vocation.model.response.BankResponse;
import com.bpjstku.data.vocation.model.response.BlkProfileResponse;
import com.bpjstku.data.vocation.model.response.ExpertiseFieldItem;
import com.bpjstku.data.vocation.model.response.ExpertiseFieldResponse;
import com.bpjstku.data.vocation.model.response.SurveyItem;
import com.bpjstku.data.vocation.model.response.SurveyResponse;
import com.bpjstku.data.vocation.model.response.TrainingItem;
import com.bpjstku.data.vocation.model.response.VocationProfileItem;
import com.bpjstku.data.vocation.model.response.VocationProfileResponse;
import com.bpjstku.data.vocation.model.response.VocationTrainingResponse;
import com.bpjstku.data.vocation.remote.VocationApi;
import com.datadog.android.core.internal.persistence.file.FileExtKt$readLinesSafe$1;
import defpackage.Api23Impl;
import defpackage.abortCapture;
import defpackage.deriveCodec;
import defpackage.initSession;
import defpackage.mergeChildrenConfigs;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.share;
import defpackage.unbind;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\u0006\u0010\u0003\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\f0\u00072\u0006\u0010\u0003\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\u0006\u0010\u0003\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\f0\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b \u0010\u000fJ#\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\f0\u00072\u0006\u0010\u0003\u001a\u00020!H\u0017¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00072\u0006\u0010\u0003\u001a\u00020%H\u0017¢\u0006\u0004\b'\u0010(J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020)H\u0017¢\u0006\u0004\b*\u0010+J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00072\u0006\u0010\u0003\u001a\u00020,H\u0017¢\u0006\u0004\b.\u0010/J#\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\f0\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b1\u0010\u000fJ\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u000202H\u0017¢\u0006\u0004\b3\u00104R\u001a\u00105\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001c\u0010:\u001a\u0004\u0018\u0001098\u0017X\u0097\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010="}, d2 = {"Lcom/bpjstku/data/vocation/VocationDataStore;", "Lcom/bpjstku/data/vocation/VocationRepository;", "Lcom/bpjstku/data/vocation/remote/VocationApi;", "p0", "<init>", "(Lcom/bpjstku/data/vocation/remote/VocationApi;)V", "Lcom/bpjstku/data/vocation/model/request/VocationEligibilityRequest;", "LderiveCodec;", "Lcom/bpjstku/data/lib/model/BaseItem;", "checkEligibility", "(Lcom/bpjstku/data/vocation/model/request/VocationEligibilityRequest;)LderiveCodec;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "Lcom/bpjstku/data/lib/model/CodeAndNamePairItem;", "getProvinces", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/pmi/model/request/CityRequest;", "getCities", "(Lcom/bpjstku/data/registration/pmi/model/request/CityRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/VocationProfileRequest;", "Lcom/bpjstku/data/vocation/model/response/VocationProfileItem;", "getProfile", "(Lcom/bpjstku/data/vocation/model/request/VocationProfileRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/VocationTrainingRequest;", "Lcom/bpjstku/data/vocation/model/response/TrainingItem;", "getVocationTrainings", "(Lcom/bpjstku/data/vocation/model/request/VocationTrainingRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/AccountNameSimilarityRequest;", "Lcom/bpjstku/data/vocation/model/response/AccountSimilarityItem;", "checkAccountNameSimilarity", "(Lcom/bpjstku/data/vocation/model/request/AccountNameSimilarityRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/response/BankItem;", "getBankList", "Lcom/bpjstku/data/vocation/model/request/TrainingFieldRequest;", "Lcom/bpjstku/data/vocation/model/response/ExpertiseFieldItem;", "getExpertiseField", "(Lcom/bpjstku/data/vocation/model/request/TrainingFieldRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/BlkProfileRequest;", "Lcom/bpjstku/data/vocation/model/response/BlkProfileResponse;", "getBlkProfile", "(Lcom/bpjstku/data/vocation/model/request/BlkProfileRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/VocationRegisterRequest;", "register", "(Lcom/bpjstku/data/vocation/model/request/VocationRegisterRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/VocationPhoneVerificationRequest;", "Lcom/bpjstku/data/registration/general/model/response/VerificationItem;", "verifyPhoneNumber", "(Lcom/bpjstku/data/vocation/model/request/VocationPhoneVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/response/SurveyItem;", "getSurveys", "Lcom/bpjstku/data/vocation/model/request/SaveSurveyRequest;", "saveSurvey", "(Lcom/bpjstku/data/vocation/model/request/SaveSurveyRequest;)LderiveCodec;", "webService", "Lcom/bpjstku/data/vocation/remote/VocationApi;", "getWebService", "()Lcom/bpjstku/data/vocation/remote/VocationApi;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VocationDataStore implements VocationRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final VocationApi webService;

    public VocationDataStore(VocationApi vocationApi) {
        Intrinsics.checkNotNullParameter(vocationApi, "");
        this.webService = vocationApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7815getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final VocationApi m7816getWebService() {
        return this.webService;
    }

    public final Void getDbService() {
        return this.dbService;
    }

    @Override // com.bpjstku.data.vocation.VocationRepository
    public final deriveCodec<BaseItem> checkEligibility(VocationEligibilityRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecCheckEligibility = m7816getWebService().checkEligibility(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckEligibility, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VocationDataStore.checkEligibility$lambda$0((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda23
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return VocationDataStore.checkEligibility$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem checkEligibility$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.vocation.VocationRepository
    public final deriveCodec<List<CodeAndNamePairItem>> getProvinces(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ProvinceItem>> provinces = m7816getWebService().getProvinces(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(provinces, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VocationDataStore.getProvinces$lambda$2((ProvinceItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda6
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return VocationDataStore.getProvinces$lambda$3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getProvinces$lambda$2(ProvinceItem provinceItem) {
        Intrinsics.checkNotNullParameter(provinceItem, "");
        return provinceItem.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getProvinces$lambda$3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.vocation.VocationRepository
    public final deriveCodec<List<CodeAndNamePairItem>> getCities(CityRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<CityItem>> cities = m7816getWebService().getCities(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(cities, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VocationDataStore.getCities$lambda$4((CityItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda21
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return VocationDataStore.getCities$lambda$5(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getCities$lambda$4(CityItem cityItem) {
        Intrinsics.checkNotNullParameter(cityItem, "");
        return cityItem.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getCities$lambda$5(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.vocation.VocationRepository
    public final deriveCodec<VocationProfileItem> getProfile(VocationProfileRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VocationProfileResponse>> profile = m7816getWebService().getProfile(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(profile, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VocationDataStore.getProfile$lambda$6((VocationProfileResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda4
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return VocationDataStore.getProfile$lambda$7(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VocationProfileItem getProfile$lambda$6(VocationProfileResponse vocationProfileResponse) {
        Intrinsics.checkNotNullParameter(vocationProfileResponse, "");
        return vocationProfileResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VocationProfileItem getProfile$lambda$7(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VocationProfileItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.vocation.VocationRepository
    public final deriveCodec<List<TrainingItem>> getVocationTrainings(VocationTrainingRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VocationTrainingResponse>> vocationTrainings = m7816getWebService().getVocationTrainings(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(vocationTrainings, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VocationDataStore.getVocationTrainings$lambda$8((VocationTrainingResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda13
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return VocationDataStore.getVocationTrainings$lambda$9(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getVocationTrainings$lambda$8(VocationTrainingResponse vocationTrainingResponse) {
        Intrinsics.checkNotNullParameter(vocationTrainingResponse, "");
        return vocationTrainingResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getVocationTrainings$lambda$9(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.vocation.VocationRepository
    public final deriveCodec<AccountSimilarityItem> checkAccountNameSimilarity(AccountNameSimilarityRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<AccountSimilarityItem>> derivecodecCheckAccountNameSimilarity = m7816getWebService().checkAccountNameSimilarity(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckAccountNameSimilarity, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VocationDataStore.checkAccountNameSimilarity$lambda$10((AccountSimilarityItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return VocationDataStore.checkAccountNameSimilarity$lambda$11(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountSimilarityItem checkAccountNameSimilarity$lambda$11(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AccountSimilarityItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.vocation.VocationRepository
    public final deriveCodec<List<BankItem>> getBankList(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BankResponse>> bankList = m7816getWebService().getBankList(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(bankList, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VocationDataStore.getBankList$lambda$12((BankResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda10
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return VocationDataStore.getBankList$lambda$13(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getBankList$lambda$12(BankResponse bankResponse) {
        Intrinsics.checkNotNullParameter(bankResponse, "");
        return bankResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getBankList$lambda$13(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.vocation.VocationRepository
    public final deriveCodec<List<ExpertiseFieldItem>> getExpertiseField(TrainingFieldRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ExpertiseFieldResponse>> expertiseField = m7816getWebService().getExpertiseField(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(expertiseField, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VocationDataStore.getExpertiseField$lambda$14((ExpertiseFieldResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda25
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return VocationDataStore.getExpertiseField$lambda$15(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getExpertiseField$lambda$14(ExpertiseFieldResponse expertiseFieldResponse) {
        Intrinsics.checkNotNullParameter(expertiseFieldResponse, "");
        return expertiseFieldResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getExpertiseField$lambda$15(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.vocation.VocationRepository
    public final deriveCodec<BlkProfileResponse> getBlkProfile(BlkProfileRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BlkProfileResponse>> blkProfile = m7816getWebService().getBlkProfile(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(blkProfile, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VocationDataStore.getBlkProfile$lambda$16((BlkProfileResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda8
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return VocationDataStore.getBlkProfile$lambda$17(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BlkProfileResponse getBlkProfile$lambda$17(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BlkProfileResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.vocation.VocationRepository
    public final deriveCodec<BaseItem> register(VocationRegisterRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecRegister = m7816getWebService().register(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecRegister, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VocationDataStore.register$lambda$18((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda11
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return VocationDataStore.register$lambda$19(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem register$lambda$19(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.vocation.VocationRepository
    public final deriveCodec<VerificationItem> verifyPhoneNumber(VocationPhoneVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VerificationItem>> derivecodecVerifyPhoneNumber = m7816getWebService().verifyPhoneNumber(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyPhoneNumber, unbindVar);
        final VocationDataStore$$ExternalSyntheticLambda16 vocationDataStore$$ExternalSyntheticLambda16 = new VocationDataStore$$ExternalSyntheticLambda16();
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda17
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return VocationDataStore.verifyPhoneNumber$lambda$21(vocationDataStore$$ExternalSyntheticLambda16, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationItem verifyPhoneNumber$lambda$21(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerificationItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.vocation.VocationRepository
    public final deriveCodec<List<SurveyItem>> getSurveys(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<SurveyResponse>> surveys = m7816getWebService().getSurveys(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(surveys, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda14
            private static final byte[] $$c = {58, -51, 54, -115};
            private static final int $$d = 97;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {55, -64, 35, -71, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 94;
            private static int b = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static long TuitionPaymentFragmentbindingInflater1 = 24751860922907904L;

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(int r7, byte r8, int r9, java.lang.Object[] r10) {
                /*
                    int r7 = 144 - r7
                    int r9 = r9 + 1
                    int r8 = r8 * 14
                    int r8 = 98 - r8
                    byte[] r0 = com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda14.$$a
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r8 = r7
                    r3 = r9
                    r5 = r2
                    goto L2b
                L13:
                    r3 = r2
                L14:
                    int r7 = r7 + 1
                    byte r4 = (byte) r8
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r9) goto L25
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L25:
                    r3 = r0[r7]
                    r6 = r8
                    r8 = r7
                    r7 = r3
                    r3 = r6
                L2b:
                    int r7 = -r7
                    int r3 = r3 + r7
                    int r7 = r3 + (-11)
                    r3 = r5
                    r6 = r8
                    r8 = r7
                    r7 = r6
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda14.c(int, byte, int, java.lang.Object[]):void");
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = b + 51;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                SurveyResponse surveyResponse = (SurveyResponse) obj;
                if (i2 % 2 != 0) {
                    return VocationDataStore.getSurveys$lambda$22(surveyResponse);
                }
                VocationDataStore.getSurveys$lambda$22(surveyResponse);
                throw null;
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                abortCapture abortcapture = new abortCapture();
                char[] cArrB = abortCapture.b(TuitionPaymentFragmentbindingInflater1 ^ (-2687588926731523482L), cArr, i);
                abortcapture.b = 4;
                while (abortcapture.b < cArrB.length) {
                    int i3 = $10 + 113;
                    $11 = i3 % 128;
                    int i4 = i3 % 2;
                    abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                    int i5 = abortcapture.b;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentbindingInflater1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - ExpandableListView.getPackedPositionType(0L)), 1356 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 38, 894276454, false, $$e(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        try {
                            Object[] objArr3 = {abortcapture, abortcapture};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - View.resolveSize(0, 0)), 468 - TextUtils.getOffsetBefore("", 0), TextUtils.indexOf((CharSequence) "", '0') + 14, 896083767, false, "n", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new String(cArrB, 4, cArrB.length - 4);
                int i6 = $11 + 9;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            }

            /* JADX WARN: Code duplicated, block: B:104:0x0493 A[Catch: all -> 0x04df, TryCatch #7 {all -> 0x04df, blocks: (B:102:0x0486, B:104:0x0493, B:105:0x04ce), top: B:151:0x0486, outer: #0 }] */
            /* JADX WARN: Code duplicated, block: B:108:0x04dd  */
            /* JADX WARN: Code duplicated, block: B:115:0x04e9 A[PHI: r15
  0x04e9: PHI (r15v5 int) = (r15v4 int), (r15v7 int), (r15v8 int), (r15v8 int) binds: [B:114:0x04e8, B:137:0x04e9, B:107:0x04db, B:92:0x0477] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:147:0x041f A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:151:0x0486 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:42:0x01f7  */
            /* JADX WARN: Code duplicated, block: B:44:0x01fd  */
            /* JADX WARN: Code duplicated, block: B:46:0x020b  */
            /* JADX WARN: Code duplicated, block: B:47:0x020f  */
            /* JADX WARN: Code duplicated, block: B:49:0x0213  */
            /* JADX WARN: Code duplicated, block: B:53:0x021d  */
            /* JADX WARN: Code duplicated, block: B:55:0x022c A[Catch: Exception -> 0x04e8, TRY_ENTER, TryCatch #1 {Exception -> 0x04e8, blocks: (B:50:0x0215, B:55:0x022c, B:61:0x0271, B:67:0x02b5, B:68:0x02bc, B:69:0x02bf, B:56:0x023d), top: B:139:0x0215 }] */
            /* JADX WARN: Code duplicated, block: B:56:0x023d A[Catch: Exception -> 0x04e8, TRY_LEAVE, TryCatch #1 {Exception -> 0x04e8, blocks: (B:50:0x0215, B:55:0x022c, B:61:0x0271, B:67:0x02b5, B:68:0x02bc, B:69:0x02bf, B:56:0x023d), top: B:139:0x0215 }] */
            /* JADX WARN: Code duplicated, block: B:60:0x0263  */
            /* JADX WARN: Code duplicated, block: B:63:0x0273  */
            /* JADX WARN: Code duplicated, block: B:66:0x02b2  */
            /* JADX WARN: Code duplicated, block: B:69:0x02bf A[Catch: Exception -> 0x04e8, TRY_LEAVE, TryCatch #1 {Exception -> 0x04e8, blocks: (B:50:0x0215, B:55:0x022c, B:61:0x0271, B:67:0x02b5, B:68:0x02bc, B:69:0x02bf, B:56:0x023d), top: B:139:0x0215 }] */
            /* JADX WARN: Code duplicated, block: B:73:0x02dc A[Catch: all -> 0x03da, TryCatch #3 {all -> 0x03da, blocks: (B:71:0x02cf, B:73:0x02dc, B:74:0x0317), top: B:143:0x02cf, outer: #0 }] */
            /* JADX WARN: Code duplicated, block: B:82:0x03e4 A[Catch: Exception -> 0x04e9, TRY_LEAVE, TryCatch #0 {Exception -> 0x04e9, blocks: (B:76:0x03ab, B:78:0x03db, B:80:0x03e2, B:81:0x03e3, B:82:0x03e4, B:89:0x046f, B:91:0x0476, B:106:0x04d5, B:98:0x047e, B:100:0x0484, B:101:0x0485, B:110:0x04e0, B:112:0x04e6, B:113:0x04e7, B:71:0x02cf, B:73:0x02dc, B:74:0x0317, B:85:0x041f, B:87:0x042c, B:88:0x0468, B:102:0x0486, B:104:0x0493, B:105:0x04ce), top: B:138:0x021b, inners: #3, #5, #7 }] */
            /* JADX WARN: Code duplicated, block: B:87:0x042c A[Catch: all -> 0x047d, TryCatch #5 {all -> 0x047d, blocks: (B:85:0x041f, B:87:0x042c, B:88:0x0468), top: B:147:0x041f, outer: #0 }] */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2, int i3) throws Throwable {
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                String str;
                String str2;
                int i11;
                Object[] objArr;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                boolean zEquals;
                int i12;
                char[] cArr;
                int iLastIndexOf;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                int i18;
                Object obj;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                Method method;
                int i19;
                int i20;
                int i21 = 2 % 2;
                int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i23 = i22 + 63;
                b = i23 % 128;
                Object obj2 = null;
                if (i23 % 2 != 0) {
                    throw null;
                }
                if (context != null) {
                    int i24 = ((i22 | 121) << 1) - (i22 ^ 121);
                    b = i24 % 128;
                    int i25 = i24 % 2;
                    try {
                        Object[] objArr2 = new Object[1];
                        a(new char[]{33909, 33812, 26548, 28860, 15463, 4815, 21298, 5490, 55682, 1067, 45159, 46742, 16166, 41541, 54773, 5220, 40152, 16636, 31623, 19366, 62038, 64789, 39205, 43412, 22504, 39834, 16087}, ViewConfiguration.getScrollBarSize() >> 8, objArr2);
                        Class<?> cls = Class.forName((String) objArr2[0]);
                        char[] cArr2 = {39506, 39477, 34510, 37325, 9791, 2183, 10150, 25045, 51130, 58691, 43575, 49782, 8449, 17210, 53175, 24798, 33525, 41357, 25058, 16193, 60500, 7268};
                        int i26 = b;
                        int i27 = ((i26 | 3) << 1) - (i26 ^ 3);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i27 % 128;
                        if (i27 % 2 == 0) {
                            Object[] objArr3 = new Object[1];
                            a(cArr2, ViewConfiguration.getScrollDefaultDelay() / 98, objArr3);
                            method = cls.getMethod((String) objArr3[0], null);
                        } else {
                            Object[] objArr4 = new Object[1];
                            a(cArr2, ViewConfiguration.getScrollDefaultDelay() >> 16, objArr4);
                            method = cls.getMethod((String) objArr4[0], null);
                        }
                        Object objInvoke = method.invoke(context, null);
                        int threadPriority = Process.getThreadPriority(0);
                        Object[] objArr5 = new Object[1];
                        a(new char[]{12203, 12234, 39954, 35610, 28714, 24194, 58839, 41879, 29276, 65421, 64554, 's', 38136, 23011, 39352, 41601, 14086, 47962, 14282, 64835, 22971, 1713, 54568, 8004, 64547, 24628, 29314, 47572, 7768, 50061, 4098, 54332, 41196, 11770, 52631, 30371, 49933, 36691}, ((threadPriority & 20) + (threadPriority | 20)) >> 6, objArr5);
                        Class<?> cls2 = Class.forName((String) objArr5[0]);
                        Object[] objArr6 = new Object[1];
                        a(new char[]{30206, 30104, 42007, 45853, 17768, 27589, 10232, 25005, 10261}, ((byte) KeyEvent.getModifierMetaStateMask()) + 1, objArr6);
                        int i28 = cls2.getField((String) objArr6[0]).getInt(objInvoke);
                        int i29 = b;
                        int i30 = (i29 ^ 13) + ((i29 & 13) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i30 % 128;
                        if (i30 % 2 == 0) {
                            int i31 = i28 & 4;
                            i19 = i ^ 1;
                            int i32 = -i31;
                            int i33 = (i31 & i32) | (i31 ^ i32);
                            i20 = (i33 & (-12)) + (i33 | (-12));
                        } else {
                            int i34 = i28 & 2;
                            i19 = (~(i & 1)) & (i | 1);
                            int i35 = -i34;
                            i20 = ((i34 & i35) | (i34 ^ i35)) >> 31;
                        }
                        i4 = ((~i20) & i) | (i19 & i20);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    i4 = i;
                }
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16794165);
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 2740;
                        int doubleTapTimeout = 13 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        i5 = 0;
                        Object[] objArr7 = new Object[1];
                        c((short) 141, $$a[5], (byte) 52, objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRgb, modifierMetaStateMask, doubleTapTimeout, 1501733736, false, (String) objArr7[0], new Class[0]);
                    }
                    Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, null);
                    int i36 = b + 7;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i36 % 128;
                    int i37 = i36 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 16949);
                        int i38 = 2740 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int absoluteGravity = 13 - Gravity.getAbsoluteGravity(0, 0);
                        i5 = (byte) 52;
                        Object[] objArr8 = new Object[1];
                        c((short) ($$b - 5), $$a[5], i5, objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates, i38, absoluteGravity, 47863026, false, (String) objArr8[0], null);
                    }
                    if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16949);
                            int i39 = 2739 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i40 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 14;
                            byte b2 = $$a[5];
                            Object[] objArr9 = new Object[1];
                            c((short) 37, b2, (byte) (b2 | 36), objArr9);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatTimeout, i39, i40, 631063962, false, (String) objArr9[0], null);
                        }
                        if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null))) {
                            try {
                                try {
                                    if (Build.VERSION.SDK_INT > 33) {
                                        int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        i12 = ((i41 | 117) << 1) - (i41 ^ 117);
                                        b = i12 % 128;
                                        if (i12 % 2 != 0) {
                                            cArr = new char[]{34135, 34168, 62240, 58403, 3842, 8634, 12574, 30543, 55520, 37044, 33544, 54508, 15891, 13978, 59026, 30273, 40436, 54377, 18619, 10705, 62290, 27015, 43611, 52154, 22216, 3868, 3492, 27913, 46242, 44283, 28460, 238};
                                            iLastIndexOf = TextUtils.lastIndexOf("", '7');
                                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                            i13 = 0;
                                        } else {
                                            cArr = new char[]{34135, 34168, 62240, 58403, 3842, 8634, 12574, 30543, 55520, 37044, 33544, 54508, 15891, 13978, 59026, 30273, 40436, 54377, 18619, 10705, 62290, 27015, 43611, 52154, 22216, 3868, 3492, 27913, 46242, 44283, 28460, 238};
                                            iLastIndexOf = TextUtils.lastIndexOf("", '0');
                                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                            i13 = 1;
                                        }
                                        int i42 = iLastIndexOf * 673;
                                        int i43 = -(-(i13 * (-1343)));
                                        i14 = (i42 ^ i43) + ((i42 & i43) << 1);
                                        i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
                                        int i44 = i15 % 128;
                                        b = i44;
                                        if (i15 % 2 != 0) {
                                            int i45 = ~((iLastIndexOf ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (iLastIndexOf & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                            i16 = i14 / (((i13 ^ i45) | (i45 & i13)) * 672);
                                        } else {
                                            int i46 = -(-(((~(iLastIndexOf | iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) | i13) * 672));
                                            i16 = (i14 ^ i46) + ((i46 & i14) << 1);
                                        }
                                        int i47 = ~iLastIndexOf;
                                        int i48 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i49 = ~((i47 ^ i48) | (i47 & i48));
                                        int i50 = ~((i13 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i13));
                                        i5 = i16 + ((-672) * ((i49 ^ i50) | (i50 & i49)));
                                        int i51 = ~i13;
                                        int i52 = i44 + 1;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i52 % 128;
                                        i17 = i52 % 2;
                                        int i53 = ~((i48 & i51) | (i51 ^ i48));
                                        int i54 = ~i13;
                                        int i55 = ~((iLastIndexOf & i54) | (i54 ^ iLastIndexOf));
                                        i18 = (i53 & i55) | (i53 ^ i55);
                                        if (i17 == 0) {
                                            i5 *= 672 << i18;
                                            Object[] objArr10 = new Object[1];
                                            a(cArr, i5, objArr10);
                                            obj = objArr10[0];
                                        } else {
                                            int i56 = -(-(i18 * 672));
                                            int i57 = ((i5 | i56) << 1) - (i56 ^ i5);
                                            Object[] objArr11 = new Object[1];
                                            a(cArr, i57, objArr11);
                                            obj = objArr11[0];
                                        }
                                        try {
                                            Object[] objArr12 = {(String) obj};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char cResolveSize = (char) View.resolveSize(0, 0);
                                                int iIndexOf = 993 - TextUtils.indexOf("", "", 0);
                                                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 8;
                                                short s = $$a[7];
                                                byte b3 = (byte) s;
                                                Object[] objArr13 = new Object[1];
                                                c(s, b3, b3, objArr13);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize, iIndexOf, minimumFlingVelocity, 410748506, false, (String) objArr13[0], new Class[]{String.class});
                                            }
                                            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr12)).longValue();
                                            long j = 294212117;
                                            i5 = i4;
                                            long j2 = i;
                                            long j3 = -1;
                                            long j4 = jLongValue ^ j3;
                                            long j5 = 676;
                                            long j6 = j2 ^ j3;
                                            long j7 = (((long) 677) * j) + (((long) (-675)) * jLongValue) + (((long) (-676)) * (j | j2 | j4)) + ((((j4 | j) ^ j3) | ((j6 | j) ^ j3)) * j5) + (j5 * ((((j ^ j3) | j4) ^ j3) | ((j4 | j6) ^ j3) | ((j2 | (jLongValue | j)) ^ j3))) + ((long) (-495130354));
                                            int i58 = ~(100172734 | i);
                                            int i59 = (((~((-100172735) | i)) | 4719122 | (~(1337053676 | i))) * 407) + 220999098 + ((1241600064 | i58) * (-814)) + ((i58 | (~((~i) | (-1337053677))) | 4719122) * 407);
                                            int i60 = b;
                                            int i61 = ((i60 | 59) << 1) - (i60 ^ 59);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i61 % 128;
                                            int i62 = i61 % 2;
                                            int i63 = ((int) (j7 >> 32)) & i59;
                                            int i64 = (int) j7;
                                            int iUptimeMillis = (int) SystemClock.uptimeMillis();
                                            int i65 = i64 & (1009785902 + (((~((~iUptimeMillis) | 1642066592)) | 204840182) * (-235)) + (((~(1642066592 | iUptimeMillis)) | 204840182) * (-470)) + (((~(iUptimeMillis | 1845493494)) | 1413280) * 235));
                                            i10 = (i63 & i65) | (i63 ^ i65);
                                        } catch (Throwable th2) {
                                            Throwable cause2 = th2.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th2;
                                        }
                                    } else {
                                        i5 = i4;
                                        Object[] objArr14 = new Object[1];
                                        a(new char[]{13995, 13978, 33801, 23944, 12127}, Process.myPid() >> 22, objArr14);
                                        str = (String) objArr14[0];
                                        Object[] objArr15 = new Object[1];
                                        a(new char[]{56038, 55956, 52115, 56474, 53115, 57753, 57304, 39310, 34587, 43014, 17258, 14883, 25009, 3693, 9957, 39040, 49739}, ViewConfiguration.getKeyRepeatDelay() >> 16, objArr15);
                                        str2 = (String) objArr15[0];
                                        i11 = b + 51;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                                        if (i11 % 2 == 0) {
                                            try {
                                                Object[] objArr16 = {str2};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char cIndexOf = (char) (33601 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                                    int iGreen = 3085 - Color.green(0);
                                                    int maximumDrawingCacheSize = 26 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                    short s2 = $$a[7];
                                                    byte b4 = (byte) s2;
                                                    Object[] objArr17 = new Object[1];
                                                    c(s2, b4, b4, objArr17);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iGreen, maximumDrawingCacheSize, 1411172903, false, (String) objArr17[0], new Class[]{String.class});
                                                }
                                                zEquals = str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr16));
                                                int i66 = 35 / 0;
                                                if (zEquals) {
                                                    i10 = 1;
                                                } else {
                                                    i10 = 0;
                                                }
                                            } catch (Throwable th3) {
                                                Throwable cause3 = th3.getCause();
                                                if (cause3 != null) {
                                                    throw cause3;
                                                }
                                                throw th3;
                                            }
                                        } else {
                                            try {
                                                objArr = new Object[]{str2};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 33602);
                                                    int iRed = 3085 - Color.red(0);
                                                    int defaultSize = 26 - View.getDefaultSize(0, 0);
                                                    short s3 = $$a[7];
                                                    byte b5 = (byte) s3;
                                                    Object[] objArr18 = new Object[1];
                                                    c(s3, b5, b5, objArr18);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, iRed, defaultSize, 1411172903, false, (String) objArr18[0], new Class[]{String.class});
                                                }
                                                if (!(!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr)))) {
                                                    i10 = 1;
                                                } else {
                                                    i10 = 0;
                                                }
                                            } catch (Throwable th4) {
                                                Throwable cause4 = th4.getCause();
                                                if (cause4 != null) {
                                                    throw cause4;
                                                }
                                                throw th4;
                                            }
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            } catch (Exception unused2) {
                                i5 = i4;
                            }
                            int i67 = (i10 | (-i10)) >> 31;
                            int i68 = (~i67) & i;
                            int i69 = i67 & (i ^ 10);
                            int i70 = (i69 & i68) | (i68 ^ i69);
                            int i71 = i2 & 32;
                            int i72 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
                            int i73 = i72 % 128;
                            b = i73;
                            int i74 = i72 % 2;
                            int i75 = -i71;
                            int i76 = ((i71 & i75) | (i71 ^ i75)) >> 31;
                            i7 = (i70 & (~i76)) | (i76 & i);
                            int i77 = ((i73 | 67) << 1) - (i73 ^ 67);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i77 % 128;
                            int i78 = i77 % 2;
                        } else if (Build.VERSION.SDK_INT == 30) {
                            int i79 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i6 = (i79 & 113) + (i79 | 113);
                            b = i6 % 128;
                            if (i6 % 2 == 0) {
                                obj2.hashCode();
                                throw null;
                            }
                            i7 = i;
                            i5 = i4;
                        } else {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i410 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i12 = ((i410 | 117) << 1) - (i410 ^ 117);
                                b = i12 % 128;
                                if (i12 % 2 != 0) {
                                    cArr = new char[]{34135, 34168, 62240, 58403, 3842, 8634, 12574, 30543, 55520, 37044, 33544, 54508, 15891, 13978, 59026, 30273, 40436, 54377, 18619, 10705, 62290, 27015, 43611, 52154, 22216, 3868, 3492, 27913, 46242, 44283, 28460, 238};
                                    iLastIndexOf = TextUtils.lastIndexOf("", '7');
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    i13 = 0;
                                } else {
                                    cArr = new char[]{34135, 34168, 62240, 58403, 3842, 8634, 12574, 30543, 55520, 37044, 33544, 54508, 15891, 13978, 59026, 30273, 40436, 54377, 18619, 10705, 62290, 27015, 43611, 52154, 22216, 3868, 3492, 27913, 46242, 44283, 28460, 238};
                                    iLastIndexOf = TextUtils.lastIndexOf("", '0');
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    i13 = 1;
                                }
                                int i411 = iLastIndexOf * 673;
                                int i412 = -(-(i13 * (-1343)));
                                i14 = (i411 ^ i412) + ((i411 & i412) << 1);
                                i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
                                int i413 = i15 % 128;
                                b = i413;
                                if (i15 % 2 != 0) {
                                    int i414 = ~((iLastIndexOf ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (iLastIndexOf & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                    i16 = i14 / (((i13 ^ i414) | (i414 & i13)) * 672);
                                } else {
                                    int i415 = -(-(((~(iLastIndexOf | iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) | i13) * 672));
                                    i16 = (i14 ^ i415) + ((i415 & i14) << 1);
                                }
                                int i416 = ~iLastIndexOf;
                                int i417 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i418 = ~((i416 ^ i417) | (i416 & i417));
                                int i510 = ~((i13 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i13));
                                i5 = i16 + ((-672) * ((i418 ^ i510) | (i510 & i418)));
                                int i511 = ~i13;
                                int i512 = i413 + 1;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i512 % 128;
                                i17 = i512 % 2;
                                int i513 = ~((i417 & i511) | (i511 ^ i417));
                                int i514 = ~i13;
                                int i515 = ~((iLastIndexOf & i514) | (i514 ^ iLastIndexOf));
                                i18 = (i513 & i515) | (i513 ^ i515);
                                if (i17 == 0) {
                                    i5 *= 672 << i18;
                                    Object[] objArr19 = new Object[1];
                                    a(cArr, i5, objArr19);
                                    obj = objArr19[0];
                                } else {
                                    int i516 = -(-(i18 * 672));
                                    int i517 = ((i5 | i516) << 1) - (i516 ^ i5);
                                    Object[] objArr110 = new Object[1];
                                    a(cArr, i517, objArr110);
                                    obj = objArr110[0];
                                }
                                Object[] objArr111 = {(String) obj};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char cResolveSize2 = (char) View.resolveSize(0, 0);
                                    int iIndexOf2 = 993 - TextUtils.indexOf("", "", 0);
                                    int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 8;
                                    short s4 = $$a[7];
                                    byte b6 = (byte) s4;
                                    Object[] objArr112 = new Object[1];
                                    c(s4, b6, b6, objArr112);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize2, iIndexOf2, minimumFlingVelocity2, 410748506, false, (String) objArr112[0], new Class[]{String.class});
                                }
                                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr111)).longValue();
                                long j8 = 294212117;
                                i5 = i4;
                                long j9 = i;
                                long j10 = -1;
                                long j11 = jLongValue2 ^ j10;
                                long j12 = 676;
                                long j13 = j9 ^ j10;
                                long j14 = (((long) 677) * j8) + (((long) (-675)) * jLongValue2) + (((long) (-676)) * (j8 | j9 | j11)) + ((((j11 | j8) ^ j10) | ((j13 | j8) ^ j10)) * j12) + (j12 * ((((j8 ^ j10) | j11) ^ j10) | ((j11 | j13) ^ j10) | ((j9 | (jLongValue2 | j8)) ^ j10))) + ((long) (-495130354));
                                int i518 = ~(100172734 | i);
                                int i519 = (((~((-100172735) | i)) | 4719122 | (~(1337053676 | i))) * 407) + 220999098 + ((1241600064 | i518) * (-814)) + ((i518 | (~((~i) | (-1337053677))) | 4719122) * 407);
                                int i610 = b;
                                int i611 = ((i610 | 59) << 1) - (i610 ^ 59);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i611 % 128;
                                int i612 = i611 % 2;
                                int i613 = ((int) (j14 >> 32)) & i519;
                                int i614 = (int) j14;
                                int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                                int i615 = i614 & (1009785902 + (((~((~iUptimeMillis2) | 1642066592)) | 204840182) * (-235)) + (((~(1642066592 | iUptimeMillis2)) | 204840182) * (-470)) + (((~(iUptimeMillis2 | 1845493494)) | 1413280) * 235));
                                i10 = (i613 & i615) | (i613 ^ i615);
                            } else {
                                i5 = i4;
                                Object[] objArr113 = new Object[1];
                                a(new char[]{13995, 13978, 33801, 23944, 12127}, Process.myPid() >> 22, objArr113);
                                str = (String) objArr113[0];
                                Object[] objArr114 = new Object[1];
                                a(new char[]{56038, 55956, 52115, 56474, 53115, 57753, 57304, 39310, 34587, 43014, 17258, 14883, 25009, 3693, 9957, 39040, 49739}, ViewConfiguration.getKeyRepeatDelay() >> 16, objArr114);
                                str2 = (String) objArr114[0];
                                i11 = b + 51;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                                if (i11 % 2 == 0) {
                                    Object[] objArr115 = {str2};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cIndexOf2 = (char) (33601 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                        int iGreen2 = 3085 - Color.green(0);
                                        int maximumDrawingCacheSize2 = 26 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                        short s5 = $$a[7];
                                        byte b7 = (byte) s5;
                                        Object[] objArr116 = new Object[1];
                                        c(s5, b7, b7, objArr116);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf2, iGreen2, maximumDrawingCacheSize2, 1411172903, false, (String) objArr116[0], new Class[]{String.class});
                                    }
                                    zEquals = str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr115));
                                    int i616 = 35 / 0;
                                    if (zEquals) {
                                        i10 = 1;
                                    } else {
                                        i10 = 0;
                                    }
                                } else {
                                    objArr = new Object[]{str2};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char keyRepeatDelay2 = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 33602);
                                        int iRed2 = 3085 - Color.red(0);
                                        int defaultSize2 = 26 - View.getDefaultSize(0, 0);
                                        short s6 = $$a[7];
                                        byte b8 = (byte) s6;
                                        Object[] objArr117 = new Object[1];
                                        c(s6, b8, b8, objArr117);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay2, iRed2, defaultSize2, 1411172903, false, (String) objArr117[0], new Class[]{String.class});
                                    }
                                    if (!(!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr)))) {
                                        i10 = 1;
                                    } else {
                                        i10 = 0;
                                    }
                                }
                            }
                            int i617 = (i10 | (-i10)) >> 31;
                            int i618 = (~i617) & i;
                            int i619 = i617 & (i ^ 10);
                            int i710 = (i619 & i618) | (i618 ^ i619);
                            int i711 = i2 & 32;
                            int i712 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
                            int i713 = i712 % 128;
                            b = i713;
                            int i714 = i712 % 2;
                            int i715 = -i711;
                            int i716 = ((i711 & i715) | (i711 ^ i715)) >> 31;
                            i7 = (i710 & (~i716)) | (i716 & i);
                            int i717 = ((i713 | 67) << 1) - (i713 ^ 67);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i717 % 128;
                            int i718 = i717 % 2;
                        }
                    } else if (Build.VERSION.SDK_INT == 30) {
                        int i719 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        i6 = (i719 & 113) + (i719 | 113);
                        b = i6 % 128;
                        if (i6 % 2 == 0) {
                            obj2.hashCode();
                            throw null;
                        }
                        i7 = i;
                        i5 = i4;
                    } else {
                        if (Build.VERSION.SDK_INT > 33) {
                            int i419 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i12 = ((i419 | 117) << 1) - (i419 ^ 117);
                            b = i12 % 128;
                            if (i12 % 2 != 0) {
                                cArr = new char[]{34135, 34168, 62240, 58403, 3842, 8634, 12574, 30543, 55520, 37044, 33544, 54508, 15891, 13978, 59026, 30273, 40436, 54377, 18619, 10705, 62290, 27015, 43611, 52154, 22216, 3868, 3492, 27913, 46242, 44283, 28460, 238};
                                iLastIndexOf = TextUtils.lastIndexOf("", '7');
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                i13 = 0;
                            } else {
                                cArr = new char[]{34135, 34168, 62240, 58403, 3842, 8634, 12574, 30543, 55520, 37044, 33544, 54508, 15891, 13978, 59026, 30273, 40436, 54377, 18619, 10705, 62290, 27015, 43611, 52154, 22216, 3868, 3492, 27913, 46242, 44283, 28460, 238};
                                iLastIndexOf = TextUtils.lastIndexOf("", '0');
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                i13 = 1;
                            }
                            int i4110 = iLastIndexOf * 673;
                            int i4111 = -(-(i13 * (-1343)));
                            i14 = (i4110 ^ i4111) + ((i4110 & i4111) << 1);
                            i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
                            int i4112 = i15 % 128;
                            b = i4112;
                            if (i15 % 2 != 0) {
                                int i4113 = ~((iLastIndexOf ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (iLastIndexOf & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                i16 = i14 / (((i13 ^ i4113) | (i4113 & i13)) * 672);
                            } else {
                                int i4114 = -(-(((~(iLastIndexOf | iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) | i13) * 672));
                                i16 = (i14 ^ i4114) + ((i4114 & i14) << 1);
                            }
                            int i4115 = ~iLastIndexOf;
                            int i4116 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i4117 = ~((i4115 ^ i4116) | (i4115 & i4116));
                            int i5110 = ~((i13 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i13));
                            i5 = i16 + ((-672) * ((i4117 ^ i5110) | (i5110 & i4117)));
                            int i5111 = ~i13;
                            int i5112 = i4112 + 1;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5112 % 128;
                            i17 = i5112 % 2;
                            int i5113 = ~((i4116 & i5111) | (i5111 ^ i4116));
                            int i5114 = ~i13;
                            int i5115 = ~((iLastIndexOf & i5114) | (i5114 ^ iLastIndexOf));
                            i18 = (i5113 & i5115) | (i5113 ^ i5115);
                            if (i17 == 0) {
                                i5 *= 672 << i18;
                                Object[] objArr118 = new Object[1];
                                a(cArr, i5, objArr118);
                                obj = objArr118[0];
                            } else {
                                int i5116 = -(-(i18 * 672));
                                int i5117 = ((i5 | i5116) << 1) - (i5116 ^ i5);
                                Object[] objArr119 = new Object[1];
                                a(cArr, i5117, objArr119);
                                obj = objArr119[0];
                            }
                            Object[] objArr1110 = {(String) obj};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char cResolveSize3 = (char) View.resolveSize(0, 0);
                                int iIndexOf3 = 993 - TextUtils.indexOf("", "", 0);
                                int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 8;
                                short s7 = $$a[7];
                                byte b9 = (byte) s7;
                                Object[] objArr1111 = new Object[1];
                                c(s7, b9, b9, objArr1111);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize3, iIndexOf3, minimumFlingVelocity3, 410748506, false, (String) objArr1111[0], new Class[]{String.class});
                            }
                            long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr1110)).longValue();
                            long j15 = 294212117;
                            i5 = i4;
                            long j16 = i;
                            long j17 = -1;
                            long j18 = jLongValue3 ^ j17;
                            long j19 = 676;
                            long j110 = j16 ^ j17;
                            long j111 = (((long) 677) * j15) + (((long) (-675)) * jLongValue3) + (((long) (-676)) * (j15 | j16 | j18)) + ((((j18 | j15) ^ j17) | ((j110 | j15) ^ j17)) * j19) + (j19 * ((((j15 ^ j17) | j18) ^ j17) | ((j18 | j110) ^ j17) | ((j16 | (jLongValue3 | j15)) ^ j17))) + ((long) (-495130354));
                            int i5118 = ~(100172734 | i);
                            int i5119 = (((~((-100172735) | i)) | 4719122 | (~(1337053676 | i))) * 407) + 220999098 + ((1241600064 | i5118) * (-814)) + ((i5118 | (~((~i) | (-1337053677))) | 4719122) * 407);
                            int i6110 = b;
                            int i6111 = ((i6110 | 59) << 1) - (i6110 ^ 59);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6111 % 128;
                            int i6112 = i6111 % 2;
                            int i6113 = ((int) (j111 >> 32)) & i5119;
                            int i6114 = (int) j111;
                            int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
                            int i6115 = i6114 & (1009785902 + (((~((~iUptimeMillis3) | 1642066592)) | 204840182) * (-235)) + (((~(1642066592 | iUptimeMillis3)) | 204840182) * (-470)) + (((~(iUptimeMillis3 | 1845493494)) | 1413280) * 235));
                            i10 = (i6113 & i6115) | (i6113 ^ i6115);
                        } else {
                            i5 = i4;
                            Object[] objArr1112 = new Object[1];
                            a(new char[]{13995, 13978, 33801, 23944, 12127}, Process.myPid() >> 22, objArr1112);
                            str = (String) objArr1112[0];
                            Object[] objArr1113 = new Object[1];
                            a(new char[]{56038, 55956, 52115, 56474, 53115, 57753, 57304, 39310, 34587, 43014, 17258, 14883, 25009, 3693, 9957, 39040, 49739}, ViewConfiguration.getKeyRepeatDelay() >> 16, objArr1113);
                            str2 = (String) objArr1113[0];
                            i11 = b + 51;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                            if (i11 % 2 == 0) {
                                Object[] objArr1114 = {str2};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char cIndexOf3 = (char) (33601 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                    int iGreen3 = 3085 - Color.green(0);
                                    int maximumDrawingCacheSize3 = 26 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                    short s8 = $$a[7];
                                    byte b10 = (byte) s8;
                                    Object[] objArr1115 = new Object[1];
                                    c(s8, b10, b10, objArr1115);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf3, iGreen3, maximumDrawingCacheSize3, 1411172903, false, (String) objArr1115[0], new Class[]{String.class});
                                }
                                zEquals = str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr1114));
                                int i6116 = 35 / 0;
                                if (zEquals) {
                                    i10 = 1;
                                } else {
                                    i10 = 0;
                                }
                            } else {
                                objArr = new Object[]{str2};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char keyRepeatDelay3 = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 33602);
                                    int iRed3 = 3085 - Color.red(0);
                                    int defaultSize3 = 26 - View.getDefaultSize(0, 0);
                                    short s9 = $$a[7];
                                    byte b11 = (byte) s9;
                                    Object[] objArr1116 = new Object[1];
                                    c(s9, b11, b11, objArr1116);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay3, iRed3, defaultSize3, 1411172903, false, (String) objArr1116[0], new Class[]{String.class});
                                }
                                if (!(!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr)))) {
                                    i10 = 1;
                                } else {
                                    i10 = 0;
                                }
                            }
                        }
                        int i6117 = (i10 | (-i10)) >> 31;
                        int i6118 = (~i6117) & i;
                        int i6119 = i6117 & (i ^ 10);
                        int i7110 = (i6119 & i6118) | (i6118 ^ i6119);
                        int i7111 = i2 & 32;
                        int i7112 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
                        int i7113 = i7112 % 128;
                        b = i7113;
                        int i7114 = i7112 % 2;
                        int i7115 = -i7111;
                        int i7116 = ((i7111 & i7115) | (i7111 ^ i7115)) >> 31;
                        i7 = (i7110 & (~i7116)) | (i7116 & i);
                        int i7117 = ((i7113 | 67) << 1) - (i7113 ^ 67);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7117 % 128;
                        int i7118 = i7117 % 2;
                    }
                    int i80 = (~(i & i5)) & (i | i5);
                    int i81 = -i80;
                    int i82 = ((i80 & i81) | (i80 ^ i81)) >> 31;
                    int i83 = i7 & (~i82);
                    int i84 = i82 & i5;
                    int i85 = (i83 & i84) | (i83 ^ i84);
                    Object[] objArr20 = new Object[4];
                    int[] iArr = new int[1];
                    objArr20[0] = iArr;
                    objArr20[1] = new int[1];
                    int i86 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i87 = ((i86 | 81) << 1) - (i86 ^ 81);
                    int i88 = i87 % 128;
                    b = i88;
                    if (i87 % 2 != 0) {
                        objArr20[3] = new int[0];
                        int i89 = ((~i85) & i) | ((~i) & i85);
                        int i90 = (i89 | (-i89)) % 56;
                        int i91 = (~i90) & 1;
                        int i92 = i90 & 19;
                        i8 = (i92 & i91) | (i91 ^ i92);
                    } else {
                        objArr20[2] = new int[1];
                        int i93 = ((~i85) & i) | ((~i) & i85);
                        int i94 = -i93;
                        i8 = (((i93 & i94) | (i93 ^ i94)) >> 31) & 16;
                    }
                    iArr[0] = i;
                    int i95 = ((i88 | 47) << 1) - (i88 ^ 47);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i95 % 128;
                    if (i95 % 2 == 0) {
                        ((int[]) objArr20[2])[1] = i85;
                        objArr20[3] = null;
                        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                        int i96 = ~iMaxMemory;
                        i9 = 530029244 + (((-1081345) | iMaxMemory) * (-676)) + (((~(36401087 | i96)) | 1081344) * 676) + (((~(iMaxMemory | 37482431)) | (~(i96 | (-3909142))) | 2827797) * 676);
                    } else {
                        ((int[]) objArr20[2])[0] = i85;
                        objArr20[3] = null;
                        i9 = 784945474 + (((~(i | (-771594210))) | (-811904439)) * (-465)) + (((-771594210) | (~((-811904439) | i))) * 930) + (((-543458721) | i) * 465);
                    }
                    int i97 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i98 = ((i97 | 31) << 1) - (i97 ^ 31);
                    b = i98 % 128;
                    int i99 = i98 % 2;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i100 = i8 * 217;
                    int i101 = i9 * (-215);
                    int i102 = ((i100 | i101) << 1) - (i100 ^ i101);
                    int i103 = (~((i8 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i8 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4))) * 216;
                    int i104 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
                    int i105 = i104 % 128;
                    b = i105;
                    int i106 = i104 % 2;
                    int i107 = -(-i103);
                    int i108 = ((i102 | i107) << 1) - (i107 ^ i102);
                    int i109 = ~i9;
                    int i110 = -(-(((i109 & i8) | (i8 ^ i109) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault4)) * (-216)));
                    int i111 = ((i108 | i110) << 1) - (i110 ^ i108);
                    int i112 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i113 = ~((i112 & i8) | (i112 ^ i8));
                    int i114 = ((i113 & i9) | (i9 ^ i113)) * 216;
                    int i115 = i105 + 17;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i115 % 128;
                    if (i115 % 2 == 0) {
                        int i116 = i3 >> (i111 % i114);
                        int i117 = i116 ^ (i116 % 91);
                        int i118 = i117 / 2;
                        int i119 = ((~i117) & i118) | ((~i118) & i117);
                        int i120 = ((i119 | (-4)) << 1) - (i119 ^ (-4));
                        ((int[]) objArr20[0])[0] = ((~i119) & i120) | ((~i120) & i119);
                    } else {
                        int i121 = (i111 & i114) + (i114 | i111);
                        int i122 = (i3 & i121) + (i3 | i121);
                        int i123 = i122 << 13;
                        int i124 = (i122 | i123) & (~(i122 & i123));
                        int i125 = i124 >>> 17;
                        int i126 = (i124 | i125) & (~(i124 & i125));
                        int i127 = i126 << 5;
                        ((int[]) objArr20[1])[0] = (i126 | i127) & (~(i126 & i127));
                    }
                    return objArr20;
                } catch (Throwable th5) {
                    Throwable cause5 = th5.getCause();
                    if (cause5 != null) {
                        throw cause5;
                    }
                    throw th5;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(byte r5, byte r6, short r7) {
                /*
                    int r5 = r5 * 3
                    int r0 = 1 - r5
                    int r7 = r7 * 4
                    int r7 = r7 + 107
                    byte[] r1 = com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda14.$$c
                    int r6 = r6 * 4
                    int r6 = 4 - r6
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r5 = 0 - r5
                    if (r1 != 0) goto L19
                    r7 = r5
                    r3 = r6
                    r4 = r2
                    goto L29
                L19:
                    r3 = r2
                L1a:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r5) goto L27
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    return r5
                L27:
                    r3 = r1[r6]
                L29:
                    int r6 = r6 + 1
                    int r7 = r7 + r3
                    r3 = r4
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda14.$$e(byte, byte, short):java.lang.String");
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda15
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return VocationDataStore.getSurveys$lambda$23(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getSurveys$lambda$22(SurveyResponse surveyResponse) {
        Intrinsics.checkNotNullParameter(surveyResponse, "");
        return surveyResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getSurveys$lambda$23(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.vocation.VocationRepository
    public final deriveCodec<BaseItem> saveSurvey(SaveSurveyRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecSaveSurvey = m7816getWebService().saveSurvey(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecSaveSurvey, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VocationDataStore.saveSurvey$lambda$24((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.vocation.VocationDataStore$$ExternalSyntheticLambda19
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return VocationDataStore.saveSurvey$lambda$25(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem saveSurvey$lambda$25(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountSimilarityItem checkAccountNameSimilarity$lambda$10(AccountSimilarityItem accountSimilarityItem) {
        Intrinsics.checkNotNullParameter(accountSimilarityItem, "");
        return accountSimilarityItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem checkEligibility$lambda$0(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BlkProfileResponse getBlkProfile$lambda$16(BlkProfileResponse blkProfileResponse) {
        Intrinsics.checkNotNullParameter(blkProfileResponse, "");
        return blkProfileResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem register$lambda$18(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem saveSurvey$lambda$24(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationItem verifyPhoneNumber$lambda$20(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return verificationItem;
    }
}
