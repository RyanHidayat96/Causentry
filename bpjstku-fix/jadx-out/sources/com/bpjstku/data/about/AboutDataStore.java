package com.bpjstku.data.about;

import com.bpjstku.data.about.model.response.AboutItem;
import com.bpjstku.data.about.remote.AboutApi;
import defpackage.Api23Impl;
import defpackage.deriveCodec;
import defpackage.lambdasubmitStillCaptureRequests2;
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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/bpjstku/data/about/AboutDataStore;", "Lcom/bpjstku/data/about/AboutRepository;", "Lcom/bpjstku/data/about/remote/AboutApi;", "p0", "<init>", "(Lcom/bpjstku/data/about/remote/AboutApi;)V", "LderiveCodec;", "Lcom/bpjstku/data/about/model/response/AboutItem;", "getAboutEvent", "()LderiveCodec;", "webService", "Lcom/bpjstku/data/about/remote/AboutApi;", "getWebService", "()Lcom/bpjstku/data/about/remote/AboutApi;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AboutDataStore implements AboutRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final AboutApi webService;

    public AboutDataStore(AboutApi aboutApi) {
        Intrinsics.checkNotNullParameter(aboutApi, "");
        this.webService = aboutApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7547getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final AboutApi m7548getWebService() {
        return this.webService;
    }

    public final Void getDbService() {
        return this.dbService;
    }

    @Override // com.bpjstku.data.about.AboutRepository
    public final deriveCodec<AboutItem> getAboutEvent() {
        deriveCodec<Response<lambdasubmitStillCaptureRequests2<AboutItem>>> aboutEvent = m7548getWebService().getAboutEvent();
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(aboutEvent, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.about.AboutDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AboutDataStore.getAboutEvent$lambda$0((lambdasubmitStillCaptureRequests2) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.about.AboutDataStore$$ExternalSyntheticLambda1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AboutDataStore.getAboutEvent$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AboutItem getAboutEvent$lambda$0(lambdasubmitStillCaptureRequests2 lambdasubmitstillcapturerequests2) {
        Intrinsics.checkNotNullParameter(lambdasubmitstillcapturerequests2, "");
        return (AboutItem) lambdasubmitstillcapturerequests2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AboutItem getAboutEvent$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AboutItem) function1.invoke(obj);
    }
}
