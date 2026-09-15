package com.bpjstku.data.partners;

import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.lib.model.CodeAndNamePairItem;
import com.bpjstku.data.partners.model.request.GetPartnerRequest;
import com.bpjstku.data.partners.model.response.PartnerItem;
import com.bpjstku.data.partners.model.response.PartnersResponse;
import com.bpjstku.data.partners.remote.PartnersApi;
import com.bpjstku.data.registration.pmi.model.request.CityRequest;
import com.bpjstku.data.registration.pmi.model.response.CityItem;
import com.bpjstku.data.registration.pmi.model.response.ProvinceItem;
import com.bpjstku.domain.general.model.CodeNamePair;
import defpackage.Api23Impl;
import defpackage.VideoEncoderSession1;
import defpackage.deriveCodec;
import defpackage.formatInterval;
import defpackage.mergeChildrenConfigs;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.share;
import defpackage.unbind;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0003\u001a\u00020\bH\u0017¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\t2\u0006\u0010\u0003\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\t2\u0006\u0010\u0003\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Lcom/bpjstku/data/partners/PartnersDataStore;", "Lcom/bpjstku/data/partners/PartnersRepository;", "Lcom/bpjstku/data/partners/remote/PartnersApi;", "p0", "Lcom/bpjstku/data/lib/PreferenceManager;", "p1", "<init>", "(Lcom/bpjstku/data/partners/remote/PartnersApi;Lcom/bpjstku/data/lib/PreferenceManager;)V", "Lcom/bpjstku/data/partners/model/request/GetPartnerRequest;", "LderiveCodec;", "", "Lcom/bpjstku/data/partners/model/response/PartnerItem;", "getPartners", "(Lcom/bpjstku/data/partners/model/request/GetPartnerRequest;)LderiveCodec;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "Lcom/bpjstku/data/lib/model/CodeAndNamePairItem;", "getProvinces", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/pmi/model/request/CityRequest;", "getCities", "(Lcom/bpjstku/data/registration/pmi/model/request/CityRequest;)LderiveCodec;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "getSavedCityFilter", "()Lcom/bpjstku/domain/general/model/CodeNamePair;", "getSavedProvinceFilter", "LVideoEncoderSession1;", "saveCityFilter", "(Lcom/bpjstku/domain/general/model/CodeNamePair;)LVideoEncoderSession1;", "saveProvinceFilter", "preferenceManager", "Lcom/bpjstku/data/lib/PreferenceManager;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;", "webService", "Lcom/bpjstku/data/partners/remote/PartnersApi;", "getWebService", "()Lcom/bpjstku/data/partners/remote/PartnersApi;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PartnersDataStore implements PartnersRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final PreferenceManager preferenceManager;
    private final PartnersApi webService;

    public PartnersDataStore(PartnersApi partnersApi, PreferenceManager preferenceManager) {
        Intrinsics.checkNotNullParameter(partnersApi, "");
        Intrinsics.checkNotNullParameter(preferenceManager, "");
        this.preferenceManager = preferenceManager;
        this.webService = partnersApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7673getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    public final Void getDbService() {
        return this.dbService;
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final PartnersApi m7674getWebService() {
        return this.webService;
    }

    @Override // com.bpjstku.data.partners.PartnersRepository
    public final deriveCodec<List<PartnerItem>> getPartners(GetPartnerRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<PartnersResponse>> partners = m7674getWebService().getPartners(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(partners, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.partners.PartnersDataStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PartnersDataStore.getPartners$lambda$0((PartnersResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.partners.PartnersDataStore$$ExternalSyntheticLambda4
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PartnersDataStore.getPartners$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getPartners$lambda$0(PartnersResponse partnersResponse) {
        Intrinsics.checkNotNullParameter(partnersResponse, "");
        return partnersResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getPartners$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.partners.PartnersRepository
    public final deriveCodec<List<CodeAndNamePairItem>> getProvinces(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ProvinceItem>> provinces = m7674getWebService().getProvinces(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(provinces, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.partners.PartnersDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PartnersDataStore.getProvinces$lambda$2((ProvinceItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.partners.PartnersDataStore$$ExternalSyntheticLambda1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PartnersDataStore.getProvinces$lambda$3(function1, obj);
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

    @Override // com.bpjstku.data.partners.PartnersRepository
    public final deriveCodec<List<CodeAndNamePairItem>> getCities(CityRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<CityItem>> cities = m7674getWebService().getCities(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(cities, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.partners.PartnersDataStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PartnersDataStore.getCities$lambda$4((CityItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.partners.PartnersDataStore$$ExternalSyntheticLambda6
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PartnersDataStore.getCities$lambda$5(function1, obj);
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

    @Override // com.bpjstku.data.partners.PartnersRepository
    public final CodeNamePair getSavedCityFilter() {
        return (CodeNamePair) this.preferenceManager.getObject("PARTNER_CITY", CodeNamePair.class);
    }

    @Override // com.bpjstku.data.partners.PartnersRepository
    public final CodeNamePair getSavedProvinceFilter() {
        return (CodeNamePair) this.preferenceManager.getObject("PARTNER_PROVINCE", CodeNamePair.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveCityFilter$lambda$6(PartnersDataStore partnersDataStore, CodeNamePair codeNamePair) {
        partnersDataStore.preferenceManager.saveObject("PARTNER_CITY", codeNamePair);
    }

    @Override // com.bpjstku.data.partners.PartnersRepository
    public final VideoEncoderSession1 saveCityFilter(final CodeNamePair p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        VideoEncoderSession1 videoEncoderSession1B = VideoEncoderSession1.b(new formatInterval() { // from class: com.bpjstku.data.partners.PartnersDataStore$$ExternalSyntheticLambda2
            @Override // defpackage.formatInterval
            public final void run() {
                PartnersDataStore.saveCityFilter$lambda$6(this.f$0, p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(videoEncoderSession1B, "");
        return videoEncoderSession1B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveProvinceFilter$lambda$7(PartnersDataStore partnersDataStore, CodeNamePair codeNamePair) {
        partnersDataStore.preferenceManager.saveObject("PARTNER_PROVINCE", codeNamePair);
    }

    @Override // com.bpjstku.data.partners.PartnersRepository
    public final VideoEncoderSession1 saveProvinceFilter(final CodeNamePair p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        VideoEncoderSession1 videoEncoderSession1B = VideoEncoderSession1.b(new formatInterval() { // from class: com.bpjstku.data.partners.PartnersDataStore$$ExternalSyntheticLambda7
            @Override // defpackage.formatInterval
            public final void run() {
                PartnersDataStore.saveProvinceFilter$lambda$7(this.f$0, p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(videoEncoderSession1B, "");
        return videoEncoderSession1B;
    }
}
