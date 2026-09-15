package com.bpjstku.data.mnc;

import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.mnc.model.request.VisionProvisioningRequest;
import com.bpjstku.data.mnc.remote.MncApi;
import com.bpjstku.domain.general.model.BaseModel;
import defpackage.Api23Impl;
import defpackage.deriveCodec;
import defpackage.mergeChildrenConfigs;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.share;
import defpackage.unbind;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/bpjstku/data/mnc/MncDataStore;", "Lcom/bpjstku/data/mnc/MncRepository;", "Lcom/bpjstku/data/mnc/remote/MncApi;", "p0", "Lcom/bpjstku/data/lib/PreferenceManager;", "p1", "<init>", "(Lcom/bpjstku/data/mnc/remote/MncApi;Lcom/bpjstku/data/lib/PreferenceManager;)V", "Lcom/bpjstku/data/mnc/model/request/VisionProvisioningRequest;", "LderiveCodec;", "Lcom/bpjstku/domain/general/model/BaseModel;", "provisioningVisionPlus", "(Lcom/bpjstku/data/mnc/model/request/VisionProvisioningRequest;)LderiveCodec;", "", "isProvisioned", "()Z", "preferenceManager", "Lcom/bpjstku/data/lib/PreferenceManager;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;", "webService", "Lcom/bpjstku/data/mnc/remote/MncApi;", "getWebService", "()Lcom/bpjstku/data/mnc/remote/MncApi;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MncDataStore implements MncRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final PreferenceManager preferenceManager;
    private final MncApi webService;

    public MncDataStore(MncApi mncApi, PreferenceManager preferenceManager) {
        Intrinsics.checkNotNullParameter(mncApi, "");
        Intrinsics.checkNotNullParameter(preferenceManager, "");
        this.preferenceManager = preferenceManager;
        this.webService = mncApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7648getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    public final Void getDbService() {
        return this.dbService;
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final MncApi m7649getWebService() {
        return this.webService;
    }

    @Override // com.bpjstku.data.mnc.MncRepository
    public final deriveCodec<BaseModel> provisioningVisionPlus(VisionProvisioningRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseModel>> derivecodecProvisioningVisionPlus = m7649getWebService().provisioningVisionPlus(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecProvisioningVisionPlus, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.mnc.MncDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MncDataStore.provisioningVisionPlus$lambda$0((BaseModel) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.mnc.MncDataStore$$ExternalSyntheticLambda1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return MncDataStore.provisioningVisionPlus$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseModel provisioningVisionPlus$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.mnc.MncRepository
    public final boolean isProvisioned() {
        return PreferenceManager.getString$default(this.preferenceManager, "USER_PROVISIONING_VISION", null, 2, null).length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseModel provisioningVisionPlus$lambda$0(BaseModel baseModel) {
        Intrinsics.checkNotNullParameter(baseModel, "");
        return baseModel;
    }
}
