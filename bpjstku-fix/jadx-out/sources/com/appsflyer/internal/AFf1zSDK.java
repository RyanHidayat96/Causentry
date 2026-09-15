package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import com.appsflyer.AFLogger;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0019\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0015\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0017\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010%\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010,"}, d2 = {"Lcom/appsflyer/internal/AFf1zSDK;", "Lcom/appsflyer/internal/AFe1sSDK;", "", "Lcom/appsflyer/internal/AFe1tSDK;", "p0", "Ljava/util/concurrent/Executor;", "p1", "Lcom/appsflyer/internal/AFc1pSDK;", "p2", "Lcom/appsflyer/internal/AFc1iSDK;", "p3", "Lcom/appsflyer/internal/AFg1qSDK;", "p4", "Lcom/appsflyer/internal/AFf1gSDK;", "p5", "Lkotlin/Function1;", "Lcom/appsflyer/internal/AFe1rSDK;", "p6", "<init>", "(Lcom/appsflyer/internal/AFe1tSDK;Ljava/util/concurrent/Executor;Lcom/appsflyer/internal/AFc1pSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFg1qSDK;Lcom/appsflyer/internal/AFf1gSDK;Lkotlin/jvm/functions/Function1;)V", "", "getMonetizationNetwork", "()J", "getCurrencyIso4217Code", "()Lcom/appsflyer/internal/AFe1rSDK;", "getRevenue", "()V", "", "getMediationNetwork", "()Z", "component1", "Ljava/util/concurrent/Executor;", "AFAdRevenueData", "component2", "Lcom/appsflyer/internal/AFc1iSDK;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFe1tSDK;", "component4", "Lcom/appsflyer/internal/AFg1qSDK;", "component3", "Lcom/appsflyer/internal/AFc1pSDK;", "copydefault", "Lkotlin/jvm/functions/Function1;", "equals", "Lcom/appsflyer/internal/AFf1gSDK;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFf1zSDK extends AFe1sSDK<Unit> {

    /* JADX INFO: renamed from: areAllFieldsValid, reason: from kotlin metadata */
    public AFe1tSDK getMediationNetwork;

    /* JADX INFO: renamed from: component1, reason: from kotlin metadata */
    public Executor AFAdRevenueData;

    /* JADX INFO: renamed from: component2, reason: from kotlin metadata */
    public AFc1iSDK getRevenue;

    /* JADX INFO: renamed from: component3, reason: from kotlin metadata */
    public AFc1pSDK getCurrencyIso4217Code;

    /* JADX INFO: renamed from: component4, reason: from kotlin metadata */
    public AFg1qSDK getMonetizationNetwork;

    /* JADX INFO: renamed from: copydefault, reason: from kotlin metadata */
    public Function1<AFe1rSDK, Unit> component1;

    /* JADX INFO: renamed from: equals, reason: from kotlin metadata */
    public AFf1gSDK component4;

    @Override // com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final long getMonetizationNetwork() {
        return DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFf1zSDK(AFe1tSDK aFe1tSDK, Executor executor, AFc1pSDK aFc1pSDK, AFc1iSDK aFc1iSDK, AFg1qSDK aFg1qSDK, AFf1gSDK aFf1gSDK, Function1<? super AFe1rSDK, Unit> function1) {
        super(AFe1mSDK.REGISTER_TRIGGER, new AFe1mSDK[]{AFe1mSDK.RC_CDN, AFe1mSDK.FETCH_ADVERTISING_ID}, null);
        Intrinsics.checkNotNullParameter(aFe1tSDK, "");
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(aFf1gSDK, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.getMediationNetwork = aFe1tSDK;
        this.AFAdRevenueData = executor;
        this.getCurrencyIso4217Code = aFc1pSDK;
        this.getRevenue = aFc1iSDK;
        this.getMonetizationNetwork = aFg1qSDK;
        this.component4 = aFf1gSDK;
        this.component1 = function1;
        if (aFe1tSDK instanceof AFe1tSDK.AFa1tSDK) {
            this.getCurrencyIso4217Code.add(AFe1mSDK.CONVERSION);
        }
        if (this.getMediationNetwork instanceof AFe1tSDK.AFa1uSDK) {
            this.AFAdRevenueData.add(AFe1mSDK.CONVERSION);
        }
        if (this.getMediationNetwork instanceof AFe1tSDK.AFa1vSDK) {
            this.AFAdRevenueData.add(AFe1mSDK.INAPP);
        }
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final void getRevenue() {
        super.getRevenue();
        AFe1rSDK aFe1rSDK = this.getMediationNetwork;
        if (aFe1rSDK != null) {
            this.component1.invoke(aFe1rSDK);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.appsflyer.internal.AFe1rSDK] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, com.appsflyer.internal.AFe1rSDK] */
    @Override // com.appsflyer.internal.AFe1sSDK
    public final AFe1rSDK getCurrencyIso4217Code() {
        MeasurementManager measurementManager;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = AFe1rSDK.FAILURE;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.getRevenue.getMonetizationNetwork;
            if (context != null && (measurementManager = (MeasurementManager) context.getSystemService(MeasurementManager.class)) != null) {
                new AFj1fSDK(this.getCurrencyIso4217Code, null, 2, null);
                Uri.Builder builderBuildUpon = Uri.parse(AFj1fSDK.getCurrencyIso4217Code()).buildUpon();
                String strAFAdRevenueData = this.getCurrencyIso4217Code.AFAdRevenueData();
                if (strAFAdRevenueData == null) {
                    strAFAdRevenueData = "";
                }
                AFc1pSDK aFc1pSDK = this.getCurrencyIso4217Code;
                Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("event_name", this.getMediationNetwork.AFAdRevenueData), TuplesKt.to("app_id", this.getCurrencyIso4217Code.getRevenue.getMonetizationNetwork.getPackageName()), TuplesKt.to("app_version", AFj1iSDK.getMediationNetwork(aFc1pSDK.getRevenue.getMonetizationNetwork, aFc1pSDK.getRevenue.getMonetizationNetwork.getPackageName())), TuplesKt.to("sdk_version", AFc1pSDK.getMonetizationNetwork()), TuplesKt.to("api_version", AFc1pSDK.getMediationNetwork()), TuplesKt.to("timestamp", String.valueOf(this.getMonetizationNetwork.AFAdRevenueData())), TuplesKt.to("request_id", AFc1pSDK.getRevenue()), TuplesKt.to("gaid", strAFAdRevenueData));
                String revenue = AFb1iSDK.getRevenue(this.getCurrencyIso4217Code.getMonetizationNetwork);
                if (revenue != null) {
                    mapMutableMapOf.put("appsflyer_id", revenue);
                }
                Long currencyIso4217Code = this.getMonetizationNetwork.getCurrencyIso4217Code();
                if (currencyIso4217Code != null) {
                    mapMutableMapOf.put("install_time", String.valueOf(currencyIso4217Code.longValue()));
                }
                AFe1tSDK aFe1tSDK = this.getMediationNetwork;
                if (aFe1tSDK instanceof AFe1tSDK.AFa1vSDK) {
                    Float f = ((AFe1tSDK.AFa1vSDK) aFe1tSDK).getRevenue;
                    if (f != null) {
                        mapMutableMapOf.put("event_revenue", String.valueOf(f.floatValue()));
                    }
                    Integer num = ((AFe1tSDK.AFa1vSDK) this.getMediationNetwork).getCurrencyIso4217Code;
                    if (num != null) {
                        mapMutableMapOf.put("event_count", String.valueOf(num.intValue()));
                    }
                }
                for (Map.Entry entry : mapMutableMapOf.entrySet()) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri uriBuild = builderBuildUpon.build();
                Intrinsics.checkNotNullExpressionValue(uriBuild, "");
                measurementManager.registerTrigger(uriBuild, this.AFAdRevenueData, new AFa1vSDK(objectRef, countDownLatch, this));
            }
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            objectRef.element = AFe1rSDK.TIMEOUT;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PRIVACY_SANDBOX, "Error occurred: ".concat(String.valueOf(th.getMessage())), th, false, false, false, true);
        }
        return (AFe1rSDK) objectRef.element;
    }

    public static final class AFa1vSDK implements OutcomeReceiver<Object, Exception> {
        private /* synthetic */ CountDownLatch AFAdRevenueData;
        private /* synthetic */ Ref.ObjectRef<AFe1rSDK> getCurrencyIso4217Code;
        private /* synthetic */ AFf1zSDK getMonetizationNetwork;

        AFa1vSDK(Ref.ObjectRef<AFe1rSDK> objectRef, CountDownLatch countDownLatch, AFf1zSDK aFf1zSDK) {
            this.getCurrencyIso4217Code = objectRef;
            this.AFAdRevenueData = countDownLatch;
            this.getMonetizationNetwork = aFf1zSDK;
        }

        @Override // android.os.OutcomeReceiver
        public final /* synthetic */ void onError(Throwable th) {
            Exception exc = (Exception) th;
            Intrinsics.checkNotNullParameter(exc, "");
            AFf1zSDK.getMediationNetwork(exc);
            this.AFAdRevenueData.countDown();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, com.appsflyer.internal.AFe1rSDK] */
        @Override // android.os.OutcomeReceiver
        public final void onResult(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.getCurrencyIso4217Code.element = AFe1rSDK.SUCCESS;
            AFLogger.INSTANCE.d(AFg1cSDK.PRIVACY_SANDBOX, "Privacy Sandbox trigger has been registered successfully. ", true);
            this.AFAdRevenueData.countDown();
        }
    }

    public static final /* synthetic */ void getMediationNetwork(Throwable th) {
        AFLogger.INSTANCE.e(AFg1cSDK.PRIVACY_SANDBOX, "Error occurred: ".concat(String.valueOf(th.getMessage())), th, false, false, false, true);
    }
}
