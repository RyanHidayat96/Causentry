package com.bpjstku.data.about.local;

import com.bpjstku.data.about.model.response.AboutItem;
import defpackage.Api23Impl;
import defpackage.appendBackupVideoProfile;
import defpackage.deriveCodec;
import defpackage.isSamsungJ2;
import defpackage.readableMs;
import defpackage.setChildrenEdges;
import defpackage.share;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\u0007H'¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0004J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007H\u0017¢\u0006\u0004\b\u0012\u0010\fJ\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007H\u0017¢\u0006\u0004\b\u0013\u0010\fJ)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\b\u0018\u0010\u0017"}, d2 = {"Lcom/bpjstku/data/about/local/AboutDao;", "LsetChildrenEdges;", "Lcom/bpjstku/data/about/model/response/AboutItem;", "<init>", "()V", "", "p0", "LderiveCodec;", "get", "(Ljava/lang/Integer;)LderiveCodec;", "", "getList", "()LderiveCodec;", "", "remove", "(Ljava/lang/Integer;)V", "removeAll", "", "isCached", "isCacheExpired", "", "p1", "isItemCached", "(Ljava/lang/Integer;Ljava/lang/String;)LderiveCodec;", "isItemCacheExpired"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AboutDao implements setChildrenEdges<AboutItem> {
    public static final int $stable = 0;

    public abstract deriveCodec<AboutItem> get(Integer p0);

    public abstract deriveCodec<List<AboutItem>> getList();

    public abstract void remove(Integer p0);

    public abstract void removeAll();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean isCached$lambda$0(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return Boolean.valueOf(!list.isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean isCached$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Boolean) function1.invoke(obj);
    }

    public deriveCodec<Boolean> isCached() {
        deriveCodec<List<AboutItem>> list = getList();
        appendBackupVideoProfile appendbackupvideoprofileB = isSamsungJ2.b();
        share.b(appendbackupvideoprofileB, "scheduler is null");
        SingleSubscribeOn singleSubscribeOn = new SingleSubscribeOn(list, appendbackupvideoprofileB);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.about.local.AboutDao$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AboutDao.isCached$lambda$0((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.about.local.AboutDao$$ExternalSyntheticLambda1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AboutDao.isCached$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(singleSubscribeOn, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public deriveCodec<Boolean> isCacheExpired() {
        deriveCodec<Boolean> derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault2 = deriveCodec.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        return derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public deriveCodec<Boolean> isItemCached(Integer p0, String p1) {
        deriveCodec<Boolean> derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault2 = deriveCodec.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        return derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public deriveCodec<Boolean> isItemCacheExpired(Integer p0, String p1) {
        deriveCodec<Boolean> derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault2 = deriveCodec.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        return derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }
}
