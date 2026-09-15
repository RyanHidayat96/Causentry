package com.bpjstku.data.version;

import com.bpjstku.data.version.model.request.VersionRequest;
import com.bpjstku.data.version.model.response.VersionItem;
import com.bpjstku.data.version.remote.VersionApi;
import defpackage.Api23Impl;
import defpackage.deriveCodec;
import defpackage.mergeChildrenConfigs;
import defpackage.setBufferSizeInBytes;
import defpackage.share;
import defpackage.unbind;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/bpjstku/data/version/VersionDataStore;", "Lcom/bpjstku/data/version/VersionRepository;", "Lcom/bpjstku/data/version/remote/VersionApi;", "p0", "<init>", "(Lcom/bpjstku/data/version/remote/VersionApi;)V", "LderiveCodec;", "Lcom/bpjstku/data/version/model/response/VersionItem;", "getVersion", "()LderiveCodec;", "LmergeChildrenConfigs;", "dbService", "LmergeChildrenConfigs;", "getDbService", "()LmergeChildrenConfigs;", "webService", "Lcom/bpjstku/data/version/remote/VersionApi;", "getWebService", "()Lcom/bpjstku/data/version/remote/VersionApi;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VersionDataStore implements VersionRepository {
    public static final int $stable = 8;
    private final mergeChildrenConfigs dbService;
    private final VersionApi webService;

    public VersionDataStore(VersionApi versionApi) {
        Intrinsics.checkNotNullParameter(versionApi, "");
        this.webService = versionApi;
    }

    public final mergeChildrenConfigs getDbService() {
        return this.dbService;
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final VersionApi m7806getWebService() {
        return this.webService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bpjstku.data.version.VersionRepository
    public final deriveCodec<VersionItem> getVersion() {
        deriveCodec<Response<VersionItem>> version = m7806getWebService().getVersion(new VersionRequest(null, 1, 0 == true ? 1 : 0));
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(version, unbindVar);
        VersionDataStore$$ExternalSyntheticLambda1 versionDataStore$$ExternalSyntheticLambda1 = new VersionDataStore$$ExternalSyntheticLambda1(new Function1() { // from class: com.bpjstku.data.version.VersionDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VersionDataStore.getVersion$lambda$0((VersionItem) obj);
            }
        });
        share.b(versionDataStore$$ExternalSyntheticLambda1, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, versionDataStore$$ExternalSyntheticLambda1);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VersionItem getVersion$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VersionItem) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VersionItem getVersion$lambda$0(VersionItem versionItem) {
        Intrinsics.checkNotNullParameter(versionItem, "");
        return versionItem;
    }
}
