package com.midtrans.sdk.analytics;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Base64;
import androidx.autofill.HintConstants;
import com.google.gson.GsonBuilder;
import defpackage.createWindowSurface;
import defpackage.deleteFbo;
import java.sql.Timestamp;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes4.dex */
public class MixpanelAnalyticsManager {
    public static final String CARD_MODE_NORMAL = "normal";
    public static final String CARD_MODE_ONE_CLICK = "one click";
    public static final String CARD_MODE_TWO_CLICK = "two click";
    public static final String CORE_FLOW = "Core";
    private static final String EVENT_BUTTON_CLICKED = "Button Clicked";
    private static final String EVENT_PAGE_VIEWED = "Page Viewed";
    private static final String PLATFORM = "Android";
    private static final String TAG = "MixpanelAnalytics";
    public static final String UI_FLOW = "UI";
    public static final String WIDGET = "Widget";
    private Context context;
    private final String deviceId;
    private final String deviceType;
    private List<String> enabledPayments;
    private final String flow;
    private final boolean isLogEnabled;
    private String merchantId;
    private String merchantName;
    private final a mixpanelApi;
    private String orderId;
    private final String sdkVersion;
    private String transactionid;
    private Boolean oneCLick = null;
    private Boolean twoclicks = null;
    private Boolean installmentAvailable = null;
    private Boolean installmentRequired = null;

    final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Callback<Integer> {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<Integer> call, Throwable th) {
            if (MixpanelAnalyticsManager.this.isLogEnabled) {
                th.getMessage();
            }
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<Integer> call, Response<Integer> response) {
            if (MixpanelAnalyticsManager.this.isLogEnabled) {
                Integer.toString(response.body().intValue());
            }
        }
    }

    public MixpanelAnalyticsManager(String str, String str2, String str3, String str4, String str5, boolean z, Context context) {
        this.sdkVersion = str;
        this.deviceId = str2;
        this.merchantName = str3;
        this.flow = str4;
        this.deviceType = str5;
        this.isLogEnabled = z;
        this.mixpanelApi = (a) new Retrofit.Builder().client(new deleteFbo().TuitionPaymentFragmentbindingInflater1(z)).addConverterFactory(GsonConverterFactory.create()).baseUrl("https://api.mixpanel.com/").build().create(a.class);
        this.context = context;
    }

    private MixpanelProperties initMixpanelProperties() {
        NetworkCapabilities networkCapabilities;
        MixpanelProperties mixpanelProperties = new MixpanelProperties();
        mixpanelProperties.setDeviceId(this.deviceId);
        mixpanelProperties.setVersion(this.sdkVersion);
        mixpanelProperties.setToken("0269722c477a0e085fde32e0248c6003");
        mixpanelProperties.setOsVersion(Build.VERSION.RELEASE);
        mixpanelProperties.setPlatform(PLATFORM);
        mixpanelProperties.setFlow(this.flow);
        mixpanelProperties.setDeviceType(this.deviceType);
        Context context = this.context;
        String str = "UNKNOWN";
        if (context != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            char c = 0;
            if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null) {
                if (networkCapabilities.hasTransport(1)) {
                    c = 2;
                } else if (networkCapabilities.hasTransport(0)) {
                    c = 1;
                } else if (networkCapabilities.hasTransport(4)) {
                    c = 3;
                }
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (c != 2) {
                switch (createWindowSurface.b(telephonyManager)) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        str = "2G";
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        str = "3G";
                        break;
                    case 13:
                        str = "4G";
                        break;
                }
            } else {
                str = "WIFI";
            }
        }
        mixpanelProperties.setNetwork(str);
        mixpanelProperties.setMerchant(this.merchantName);
        mixpanelProperties.setMerchantId(this.merchantId);
        mixpanelProperties.setOrderId(this.orderId);
        mixpanelProperties.setTransactionId(this.transactionid);
        Boolean bool = this.oneCLick;
        if (bool != null) {
            mixpanelProperties.setOneClick(bool);
        }
        Boolean bool2 = this.twoclicks;
        if (bool2 != null) {
            mixpanelProperties.setTwoClicks(bool2);
        }
        List<String> list = this.enabledPayments;
        if (list != null) {
            mixpanelProperties.setEnabledPayments(list);
        }
        Boolean bool3 = this.installmentAvailable;
        if (bool3 != null) {
            mixpanelProperties.setInstallmentAvailable(bool3);
        }
        Boolean bool4 = this.installmentRequired;
        if (bool4 != null) {
            mixpanelProperties.setInstallmentRequired(bool4.booleanValue());
        }
        mixpanelProperties.setTimeStamp(String.valueOf(new Timestamp(System.currentTimeMillis())));
        return mixpanelProperties;
    }

    private void trackEvent(MixpanelEvent mixpanelEvent) {
        if (this.mixpanelApi != null) {
            this.mixpanelApi.a(Base64.encodeToString(new GsonBuilder().create().toJson(mixpanelEvent).getBytes(), 0)).enqueue(new TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        }
    }

    public Context getContext() {
        return this.context;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public List<String> getEnabledPayments() {
        return this.enabledPayments;
    }

    public String getFlow() {
        return this.flow;
    }

    public Boolean getInstallmentAvailable() {
        return this.installmentAvailable;
    }

    public Boolean getInstallmentRequired() {
        return this.installmentRequired;
    }

    public String getMerchantId() {
        return this.merchantId;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public a getMixpanelApi() {
        return this.mixpanelApi;
    }

    public Boolean getOneCLick() {
        return this.oneCLick;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public String getTransactionid() {
        return this.transactionid;
    }

    public Boolean getTwoclicks() {
        return this.twoclicks;
    }

    public boolean isInstallmentAvailable() {
        return this.installmentAvailable.booleanValue();
    }

    public boolean isInstallmentRequired() {
        return this.installmentRequired.booleanValue();
    }

    public boolean isLogEnabled() {
        return this.isLogEnabled;
    }

    public boolean isOneCLick() {
        return this.oneCLick.booleanValue();
    }

    public boolean isTwoclicks() {
        return this.twoclicks.booleanValue();
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setEnabledPayments(List<String> list) {
        this.enabledPayments = list;
    }

    public void setInstallmentAvailable(Boolean bool) {
        this.installmentAvailable = bool;
    }

    public void setInstallmentAvailable(boolean z) {
        this.installmentAvailable = Boolean.valueOf(z);
    }

    public void setInstallmentRequired(Boolean bool) {
        this.installmentRequired = bool;
    }

    public void setInstallmentRequired(boolean z) {
        this.installmentRequired = Boolean.valueOf(z);
    }

    public void setMerchantId(String str) {
        this.merchantId = str;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public void setOneCLick(Boolean bool) {
        this.oneCLick = bool;
    }

    public void setOneCLick(boolean z) {
        this.oneCLick = Boolean.valueOf(z);
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setTransactionid(String str) {
        this.transactionid = str;
    }

    public void setTwoclicks(Boolean bool) {
        this.twoclicks = bool;
    }

    public void setTwoclicks(boolean z) {
        this.twoclicks = Boolean.valueOf(z);
    }

    public void trackButtonClicked(String str, String str2, String str3) {
        MixpanelEvent mixpanelEvent = new MixpanelEvent();
        mixpanelEvent.setEvent(EVENT_BUTTON_CLICKED);
        MixpanelProperties mixpanelPropertiesInitMixpanelProperties = initMixpanelProperties();
        mixpanelPropertiesInitMixpanelProperties.setDistinctId(str);
        mixpanelPropertiesInitMixpanelProperties.setButtonName(str2);
        mixpanelPropertiesInitMixpanelProperties.setPageName(str3);
        mixpanelEvent.setProperties(mixpanelPropertiesInitMixpanelProperties);
        trackEvent(mixpanelEvent);
    }

    public void trackMixpanel(String str, String str2) {
        MixpanelEvent mixpanelEvent = new MixpanelEvent();
        mixpanelEvent.setEvent(str2);
        MixpanelProperties mixpanelPropertiesInitMixpanelProperties = initMixpanelProperties();
        mixpanelPropertiesInitMixpanelProperties.setDistinctId(str);
        mixpanelEvent.setProperties(mixpanelPropertiesInitMixpanelProperties);
        trackEvent(mixpanelEvent);
    }

    public void trackMixpanel(String str, String str2, long j) {
        MixpanelEvent mixpanelEvent = new MixpanelEvent();
        mixpanelEvent.setEvent(str2);
        MixpanelProperties mixpanelPropertiesInitMixpanelProperties = initMixpanelProperties();
        mixpanelPropertiesInitMixpanelProperties.setResponseTime(j);
        mixpanelPropertiesInitMixpanelProperties.setDistinctId(str);
        mixpanelEvent.setProperties(mixpanelPropertiesInitMixpanelProperties);
        trackEvent(mixpanelEvent);
    }

    public void trackMixpanel(String str, String str2, String str3) {
        MixpanelEvent mixpanelEvent = new MixpanelEvent();
        mixpanelEvent.setEvent(str2);
        MixpanelProperties mixpanelPropertiesInitMixpanelProperties = initMixpanelProperties();
        mixpanelPropertiesInitMixpanelProperties.setDistinctId(str);
        mixpanelPropertiesInitMixpanelProperties.setCardPaymentMode(str3);
        mixpanelEvent.setProperties(mixpanelPropertiesInitMixpanelProperties);
        trackEvent(mixpanelEvent);
    }

    public void trackPageViewed(String str, String str2, boolean z) {
        MixpanelEvent mixpanelEvent = new MixpanelEvent();
        mixpanelEvent.setEvent(EVENT_PAGE_VIEWED);
        MixpanelProperties mixpanelPropertiesInitMixpanelProperties = initMixpanelProperties();
        mixpanelPropertiesInitMixpanelProperties.setDistinctId(str);
        mixpanelPropertiesInitMixpanelProperties.setPageName(str2);
        mixpanelPropertiesInitMixpanelProperties.setFirstPage(z);
        mixpanelEvent.setProperties(mixpanelPropertiesInitMixpanelProperties);
        trackEvent(mixpanelEvent);
    }
}
