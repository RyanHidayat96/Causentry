package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\rR\u001b\u0010\u0012\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\rR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013"}, d2 = {"Lcom/appsflyer/internal/AFf1iSDK;", "", "Lcom/appsflyer/internal/AFc1pSDK;", "p0", "Lcom/appsflyer/internal/AFf1lSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1pSDK;Lcom/appsflyer/internal/AFf1lSDK;)V", "", "AFAdRevenueData", "()J", "", "getMediationNetwork", "()Z", "Lcom/appsflyer/internal/AFc1pSDK;", "getMonetizationNetwork", "getRevenue", "Lkotlin/Lazy;", "getCurrencyIso4217Code", "Lcom/appsflyer/internal/AFf1lSDK;", "AFa1tSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFf1iSDK {
    private static final long getMonetizationNetwork = TimeUnit.HOURS.toSeconds(24);

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    private final AFf1lSDK getMediationNetwork;
    private final Lazy getCurrencyIso4217Code;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    private final AFc1pSDK getMonetizationNetwork;
    private final Lazy getRevenue;

    public AFf1iSDK(AFc1pSDK aFc1pSDK, AFf1lSDK aFf1lSDK) {
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFf1lSDK, "");
        this.getMonetizationNetwork = aFc1pSDK;
        this.getMediationNetwork = aFf1lSDK;
        this.getRevenue = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFf1iSDK.4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFf1iSDK.this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.sandbox")));
            }

            {
                super(0);
            }
        });
        this.getCurrencyIso4217Code = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFf1iSDK.5
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFf1iSDK.this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.staging")));
            }

            {
                super(0);
            }
        });
    }

    public final boolean getMonetizationNetwork() {
        return ((Boolean) this.getRevenue.getValue()).booleanValue();
    }

    public final boolean getRevenue() {
        return ((Boolean) this.getCurrencyIso4217Code.getValue()).booleanValue();
    }

    public final long AFAdRevenueData() {
        Object objM8024constructorimpl;
        String currencyIso4217Code = this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.cache.max-age-fallback");
        if (currencyIso4217Code != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                AFf1iSDK aFf1iSDK = this;
                objM8024constructorimpl = Result.m8024constructorimpl(Long.valueOf(Long.parseLong(currencyIso4217Code)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8024constructorimpl = Result.m8024constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM8027exceptionOrNullimpl = Result.m8027exceptionOrNullimpl(objM8024constructorimpl);
            if (thM8027exceptionOrNullimpl != null) {
                AFLogger.afErrorLog("Can't read maxAgeFallback from Manifest: ".concat(String.valueOf(thM8027exceptionOrNullimpl.getMessage())), thM8027exceptionOrNullimpl);
                objM8024constructorimpl = Long.valueOf(getMonetizationNetwork);
            }
            return ((Number) objM8024constructorimpl).longValue();
        }
        return getMonetizationNetwork;
    }

    public final boolean getMediationNetwork() {
        AFi1xSDK aFi1xSDK;
        AFi1wSDK aFi1wSDK = this.getMediationNetwork.getCurrencyIso4217Code;
        if (aFi1wSDK == null) {
            AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFh1cSDK aFh1cSDK = aFi1wSDK.getMonetizationNetwork;
        return ((aFh1cSDK == null || (aFi1xSDK = aFh1cSDK.AFAdRevenueData) == null) ? false : aFi1xSDK.getCurrencyIso4217Code()) || System.currentTimeMillis() - this.getMediationNetwork.getMediationNetwork > TimeUnit.SECONDS.toMillis(this.getMediationNetwork.getRevenue);
    }
}
