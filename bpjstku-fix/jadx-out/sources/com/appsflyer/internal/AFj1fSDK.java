package com.appsflyer.internal;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\bH\u0002J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\bH\u0002J\b\u0010\u0013\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\bH\u0002J\b\u0010\u0015\u001a\u00020\bH\u0002J\u0010\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\bJ\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u001c\u001a\u00020\bJ\u0006\u0010\u001d\u001a\u00020\bJ\u0006\u0010\u001e\u001a\u00020\bJ\u0006\u0010\u001f\u001a\u00020\bJ\u0006\u0010 \u001a\u00020\bJ\u0006\u0010!\u001a\u00020\bJ\u0006\u0010\"\u001a\u00020\bJ\u0010\u0010#\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\bJ\b\u0010$\u001a\u00020\bH\u0002J\b\u0010%\u001a\u00020\bH\u0002J\b\u0010&\u001a\u00020\bH\u0002J\b\u0010'\u001a\u00020\bH\u0002J\u0016\u0010(\u001a\u00020\b*\u00020\b2\b\b\u0002\u0010)\u001a\u00020*H\u0002J\u0016\u0010+\u001a\u00020\b*\u00020\b2\b\b\u0002\u0010,\u001a\u00020*H\u0002J\f\u0010-\u001a\u00020\b*\u00020\bH\u0002J \u0010.\u001a\u00020/*\u00020/2\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/appsflyer/internal/util/EventUrlResolver;", "", "idProvider", "Lcom/appsflyer/internal/components/IdProvider;", "serverConfigUrlFormatter", "Lcom/appsflyer/internal/util/ServerConfigUrlFormatter;", "(Lcom/appsflyer/internal/components/IdProvider;Lcom/appsflyer/internal/util/ServerConfigUrlFormatter;)V", "getAdRevenueUrl", "", "getAppsTrackingUrl", "getArsBilling4", "getArsBilling5", "getDdlUrl", "getEventsTrackingUrl", "getFirstLaunchUrl", "getLaunchUrl", NotificationCompat.CATEGORY_EVENT, "Lcom/appsflyer/internal/model/event/AFEvent;", "getManualValidatePurchaseUrl", "getPlayIntegrityUrl", "getReferrerTrackingUrl", "getRegisterUrl", "getUrlForArs", "billingVersion", "getUrlForDdlEvent", "devKey", "timestamp", "getUrlForEvent", "getUrlForManualPurchaseValidation", "getUrlForPlayIntegrityReporting", "getUrlForPrivacySandbox", "getUrlForRdMonitor", "getUrlForRegister", "getUrlForValidatePurchase", "getUrlForValidatePurchaseWithWebHandler", "getUrlForViap", "getValidatePurchaseUrl", "getValidatePurchaseWithWebHandlerUrl", "getViapBilling4", "getViapBilling5", "appendBuildNumber", "isAdRevenueEvent", "", "appendConfiguredChannel", "isRegisterEvent", "appendPackageName", "appendSigQueryParam", "Landroid/net/Uri$Builder;", "Companion", "SDK_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFj1fSDK {
    public static final AFa1vSDK AFAdRevenueData = new AFa1vSDK(null);
    public static final String areAllFieldsValid;
    public static final String component1;
    public static final String component2;
    public static final String component3;
    public static final String component4;
    public static final String getCurrencyIso4217Code;
    public static final String getMediationNetwork;
    public static final String getRevenue;
    private static final String toString;
    public final AFk1xSDK getMonetizationNetwork;
    private final AFc1pSDK hashCode;

    private AFj1fSDK(AFc1pSDK aFc1pSDK, AFk1xSDK aFk1xSDK) {
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFk1xSDK, "");
        this.hashCode = aFc1pSDK;
        this.getMonetizationNetwork = aFk1xSDK;
    }

    public /* synthetic */ AFj1fSDK(AFc1pSDK aFc1pSDK, AFk1zSDK aFk1zSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1pSDK, (i & 2) != 0 ? new AFk1zSDK() : aFk1zSDK);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006"}, d2 = {"Lcom/appsflyer/internal/AFj1fSDK$AFa1vSDK;", "", "<init>", "()V", "", "toString", "Ljava/lang/String;", "AFAdRevenueData", "getCurrencyIso4217Code", "getMediationNetwork", "getMonetizationNetwork", "component2", "getRevenue", "component1", "component4", "areAllFieldsValid", "component3"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AFa1vSDK {
        private AFa1vSDK() {
        }

        public /* synthetic */ AFa1vSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String str = AFa1tSDK.getRevenue;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/androidevent?app_id=");
        String string = sb.toString();
        toString = string;
        getRevenue = "https://%sattr.%s/api/v".concat(String.valueOf(string));
        getCurrencyIso4217Code = "https://%sadrevenue.%s/api/v2/generic/v6.17.0/android?app_id=";
        getMediationNetwork = "https://%sconversions.%s/api/v".concat(String.valueOf(string));
        component1 = "https://%slaunches.%s/api/v".concat(String.valueOf(string));
        component2 = "https://%sinapps.%s/api/v".concat(String.valueOf(string));
        areAllFieldsValid = "https://%sregister.%s/api/v".concat(String.valueOf(string));
        component3 = "https://%svalidate.%s/api/v".concat(String.valueOf(string));
        component4 = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
    }

    public final String AFAdRevenueData(String str, String str2) {
        String packageName = this.hashCode.getRevenue.getMonetizationNetwork.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String strComponent2 = this.hashCode.component2();
        String str3 = strComponent2;
        if (str3 != null && !StringsKt.isBlank(str3)) {
            strComponent2 = "-".concat(String.valueOf(StringsKt.trim((CharSequence) str3).toString()));
        }
        if (strComponent2 == null) {
            strComponent2 = "";
        }
        String string = StringsKt.trim((CharSequence) strComponent2).toString();
        Uri.Builder builderBuildUpon = Uri.parse(this.getMonetizationNetwork.AFAdRevenueData("https://%sdlsdk.%s/v1.0/android/")).buildUpon();
        StringBuilder sb = new StringBuilder();
        sb.append(packageName);
        sb.append(string);
        Uri.Builder builderAppendPath = builderBuildUpon.appendPath(sb.toString());
        Intrinsics.checkNotNullExpressionValue(builderAppendPath, "");
        if (str == null || str2 == null) {
            String str4 = str == null ? "devKey" : "timestamp";
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, str4.concat(" is null at attempt to generate ddl event url"), new IllegalStateException(str4.concat(" is null")), true, false, false, true);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            builderAppendPath.appendQueryParameter("af_sig", AFj1cSDK.getRevenue(sb2.toString(), str));
        }
        String string2 = builderAppendPath.appendQueryParameter("sdk_version", AFa1tSDK.getRevenue).build().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    public static String getCurrencyIso4217Code() {
        return "https://privacy-sandbox.appsflyersdk.com/api/trigger";
    }

    public final String getCurrencyIso4217Code(String str) {
        String packageName = this.hashCode.getRevenue.getMonetizationNetwork.getPackageName();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(packageName);
        return sb.toString();
    }

    public static String AFAdRevenueData(String str, boolean z) {
        String str2 = !z ? "&buildnumber=6.17.0" : "";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public final String getRevenue(String str, boolean z) {
        if (z) {
            return str;
        }
        String strComponent2 = this.hashCode.component2();
        String strConcat = strComponent2 != null ? "&channel=".concat(String.valueOf(strComponent2)) : null;
        if (strConcat == null) {
            strConcat = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(strConcat);
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFj1fSDK(AFc1pSDK aFc1pSDK) {
        this(aFc1pSDK, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
    }
}
