package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002*+B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\r\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\r\u0010\u0015J\u000f\u0010\u0013\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0013\u0010\u0017J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0018J\u000f\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u001a*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u000b\u0010\u001bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000e\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0013\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\tR\u001b\u0010%\u001a\u00020\u00078CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b\u001c\u0010\tR\u0014\u0010\u001c\u001a\u00020&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0015\u0010\"\u001a\u00020\u00148BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b)\u0010$"}, d2 = {"Lcom/appsflyer/internal/AFe1eSDK;", "Lcom/appsflyer/internal/AFe1sSDK;", "Lcom/appsflyer/internal/AFh1oSDK;", "Lcom/appsflyer/internal/AFc1dSDK;", "p0", "<init>", "(Lcom/appsflyer/internal/AFc1dSDK;)V", "", "equals", "()Z", "", "AFAdRevenueData", "(I)Z", "getMonetizationNetwork", "getMediationNetwork", "Landroid/content/Context;", "Lcom/appsflyer/internal/AFe1eSDK$AFa1ySDK;", "p1", "(Landroid/content/Context;Lcom/appsflyer/internal/AFe1eSDK$AFa1ySDK;)Z", "getCurrencyIso4217Code", "", "()J", "Lcom/appsflyer/internal/AFe1rSDK;", "()Lcom/appsflyer/internal/AFe1rSDK;", "(Landroid/content/Context;)I", "", "", "(Lcom/appsflyer/internal/AFh1oSDK;Ljava/lang/String;)V", "component1", "Lcom/appsflyer/internal/AFh1oSDK;", "Lcom/appsflyer/internal/AFc1iSDK;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFc1iSDK;", "Lcom/appsflyer/internal/AFc1pSDK;", "component3", "Lcom/appsflyer/internal/AFc1pSDK;", "Lkotlin/Lazy;", "getRevenue", "Lcom/appsflyer/internal/AFc1kSDK;", "component2", "Lcom/appsflyer/internal/AFc1kSDK;", "component4", "AFa1tSDK", "AFa1ySDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFe1eSDK extends AFe1sSDK<AFh1oSDK> {

    /* JADX INFO: renamed from: areAllFieldsValid, reason: from kotlin metadata */
    private final AFc1iSDK getMediationNetwork;

    /* JADX INFO: renamed from: component1, reason: from kotlin metadata */
    private final AFh1oSDK getMonetizationNetwork;

    /* JADX INFO: renamed from: component2, reason: from kotlin metadata */
    private final AFc1kSDK component1;

    /* JADX INFO: renamed from: component3, reason: from kotlin metadata */
    private final AFc1pSDK AFAdRevenueData;

    /* JADX INFO: renamed from: component4, reason: from kotlin metadata */
    private final Lazy component3;

    /* JADX INFO: renamed from: equals, reason: from kotlin metadata */
    private final Lazy getRevenue;

    @Override // com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1eSDK(AFc1dSDK aFc1dSDK) {
        super(AFe1mSDK.FETCH_ADVERTISING_ID, new AFe1mSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        AFc1iSDK aFc1iSDKAFInAppEventType = aFc1dSDK.AFInAppEventType();
        Intrinsics.checkNotNullExpressionValue(aFc1iSDKAFInAppEventType, "");
        this.getMediationNetwork = aFc1iSDKAFInAppEventType;
        AFc1pSDK revenue = aFc1dSDK.getRevenue();
        Intrinsics.checkNotNullExpressionValue(revenue, "");
        this.AFAdRevenueData = revenue;
        AFc1kSDK aFc1kSDKAfInfoLog = aFc1dSDK.afInfoLog();
        Intrinsics.checkNotNullExpressionValue(aFc1kSDKAfInfoLog, "");
        this.component1 = aFc1kSDKAfInfoLog;
        this.getMonetizationNetwork = new AFh1oSDK(null, null, null, null, null, null, null, null, 255, null);
        this.component3 = LazyKt.lazy(new Function0<Long>() { // from class: com.appsflyer.internal.AFe1eSDK.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                Long longOrNull;
                String currencyIso4217Code = AFe1eSDK.this.AFAdRevenueData.getCurrencyIso4217Code("com.appsflyer.fetch_ids.timeout");
                return Long.valueOf((currencyIso4217Code == null || (longOrNull = StringsKt.toLongOrNull(currencyIso4217Code)) == null) ? 1000L : longOrNull.longValue());
            }

            {
                super(0);
            }
        });
        this.getRevenue = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFe1eSDK.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFe1eSDK.this.AFAdRevenueData.getCurrencyIso4217Code("com.appsflyer.enable_instant_plays")));
            }

            {
                super(0);
            }
        });
    }

    private final boolean component1() {
        return ((Boolean) this.getRevenue.getValue()).booleanValue();
    }

    private static boolean component3() {
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, th instanceof ClassNotFoundException ? "CloudDevSdk not found" : "Unexpected exception while checking if running in cloud environment: ".concat(String.valueOf(th.getMessage())), th, true, false, false, false, 112, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final AFe1rSDK getCurrencyIso4217Code() {
        AFe1rSDK aFe1rSDK;
        if (this.component1.getMonetizationNetwork()) {
            AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFe1rSDK.FAILURE;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (CollectionsKt.listOf((Object[]) new Boolean[]{Boolean.valueOf(equals()), Boolean.FALSE, Boolean.FALSE}).contains(Boolean.TRUE)) {
            aFe1rSDK = AFe1rSDK.SUCCESS;
        } else {
            aFe1rSDK = AFe1rSDK.FAILURE;
        }
        AFc1kSDK aFc1kSDK = this.component1;
        AFd1hSDK aFd1hSDK = new AFd1hSDK(System.currentTimeMillis() - jCurrentTimeMillis);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
        long j = aFd1hSDK.getRevenue;
        StringBuilder sb = new StringBuilder("QUEUE: FetchAdvertisingIdTask: took ");
        sb.append(j);
        sb.append("ms");
        AFg1gSDK.v$default(aFLogger, aFg1cSDK, sb.toString(), false, 4, null);
        aFc1kSDK.getRevenue(aFd1hSDK);
        return aFe1rSDK;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004a A[LOOP:0: B:3:0x0003->B:15:0x004a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x004d A[EDGE_INSN: B:19:0x004d->B:16:0x004d BREAK  A[LOOP:0: B:3:0x0003->B:15:0x004a], SYNTHETIC] */
    private final boolean equals() {
        boolean z = false;
        for (int i = 2; i > 0; i--) {
            if (component1() && getMediationNetwork(i)) {
                AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using Samsung Cloud dev SDK", false, 4, null);
            } else {
                if (AFAdRevenueData(i)) {
                    AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using GMS", false, 4, null);
                } else {
                    AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Failed to fetch GAID", false, 4, null);
                    z = false;
                }
                if (!z) {
                    break;
                }
            }
            z = true;
            if (!z) {
                break;
                break;
            }
        }
        this.component1.component3 = this.getMonetizationNetwork;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0050  */
    private final boolean AFAdRevenueData(int p0) throws Throwable {
        boolean z;
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Trying to fetch GAID...", false, 4, null);
        AFa1ySDK aFa1ySDK = new AFa1ySDK(null, null, false, null, 15, null);
        Context context = this.getMediationNetwork.getMonetizationNetwork;
        Intrinsics.checkNotNull(context);
        int currencyIso4217Code = getCurrencyIso4217Code(context);
        Context context2 = this.getMediationNetwork.getMonetizationNetwork;
        Intrinsics.checkNotNull(context2);
        if (!getCurrencyIso4217Code(context2, aFa1ySDK)) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                Context context3 = this.getMediationNetwork.getMonetizationNetwork;
                Intrinsics.checkNotNull(context3);
                if (AFAdRevenueData(context3, aFa1ySDK)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            String string = aFa1ySDK.getGaidError().toString();
            String str = string;
            if (str != null && !StringsKt.isBlank(str)) {
                String string2 = StringsKt.trim((CharSequence) str).toString();
                StringBuilder sb = new StringBuilder();
                sb.append(currencyIso4217Code);
                sb.append(": ");
                sb.append(string2);
                string = sb.toString();
            }
            AFAdRevenueData(this.getMonetizationNetwork, string);
            if (!z) {
                return false;
            }
        }
        AFh1oSDK aFh1oSDK = this.getMonetizationNetwork;
        aFh1oSDK.getRevenue = aFa1ySDK.getAdvertisingId();
        aFh1oSDK.component3 = aFa1ySDK.isLimitAdTrackingEnabled();
        Boolean boolIsLimitAdTrackingEnabled = aFa1ySDK.isLimitAdTrackingEnabled();
        aFh1oSDK.getMonetizationNetwork = boolIsLimitAdTrackingEnabled != null ? Boolean.valueOf(!boolIsLimitAdTrackingEnabled.booleanValue()) : null;
        aFh1oSDK.getCurrencyIso4217Code = Boolean.valueOf(aFa1ySDK.getAdvertisingIdWithGps());
        aFh1oSDK.AFAdRevenueData = Boolean.FALSE;
        aFh1oSDK.component4 = Boolean.valueOf(p0 != 2);
        return true;
    }

    private static int getCurrencyIso4217Code(Context p0) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(p0);
        } catch (Throwable th) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th, false, false, false, false, 96, null);
            return -1;
        }
    }

    private final boolean AFAdRevenueData(Context p0, AFa1ySDK p1) throws IllegalStateException {
        try {
            AFb1vSDK.AFa1vSDK aFa1vSDKAFAdRevenueData = AFb1vSDK.AFAdRevenueData(p0);
            p1.setAdvertisingId(aFa1vSDKAFAdRevenueData.AFAdRevenueData);
            p1.setLimitAdTrackingEnabled(Boolean.valueOf(aFa1vSDKAFAdRevenueData.getCurrencyIso4217Code()));
            String advertisingId = p1.getAdvertisingId();
            if (advertisingId == null || advertisingId.length() == 0) {
                p1.getGaidError().append("emptyOrNull (bypass) |");
            }
            if (Unit.INSTANCE != null) {
                return true;
            }
            AFe1eSDK aFe1eSDK = this;
            p1.getGaidError().append("gpsAdInfo-null (bypass) |");
            throw new IllegalStateException("GpsAdInfo is null (bypass)".toString());
        } catch (Throwable th) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Failed to fetch GAID: ".concat(String.valueOf(th.getMessage())), th, true, false, false, false, 64, null);
            StringBuilder gaidError = p1.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th.toString();
            }
            AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, localizedMessage, false, 4, null);
            return false;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0014\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00060\u0007j\u0002`\bHÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001b\u0010\rR$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00060\u0007j\u0002`\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0013R$\u0010)\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b)\u0010\u000f\"\u0004\b+\u0010,"}, d2 = {"Lcom/appsflyer/internal/AFe1eSDK$AFa1ySDK;", "", "", "p0", "", "p1", "p2", "Ljava/lang/StringBuilder;", "Lkotlin/text/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "component4", "()Ljava/lang/StringBuilder;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)Lcom/appsflyer/internal/AFe1eSDK$AFa1ySDK;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "advertisingId", "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "advertisingIdWithGps", "Z", "getAdvertisingIdWithGps", "setAdvertisingIdWithGps", "(Z)V", "gaidError", "Ljava/lang/StringBuilder;", "getGaidError", "isLimitAdTrackingEnabled", "Ljava/lang/Boolean;", "setLimitAdTrackingEnabled", "(Ljava/lang/Boolean;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final /* data */ class AFa1ySDK {
        private String advertisingId;
        private boolean advertisingIdWithGps;
        private final StringBuilder gaidError;
        private Boolean isLimitAdTrackingEnabled;
        private static final byte[] $$c = {5, -91, 77, 46};
        private static final int $$d = 110;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {58, 66, -1, 15, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 79;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;
        private static char[] b = {57187, 57189, 60056, 60043, 60117, 60063, 57191, 60072, 60073, 57186, 60041, 60050, 60052, 60040, 60048, 60055, 60062, 60058, 57188, 60034, 57184, 60054, 60088, 60053, 60047};
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 57188;

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r5, short r6, int r7, java.lang.Object[] r8) {
            /*
                int r0 = 53 - r7
                byte[] r1 = com.appsflyer.internal.AFe1eSDK.AFa1ySDK.$$a
                int r6 = r6 + 4
                int r5 = r5 * 14
                int r5 = r5 + 84
                byte[] r0 = new byte[r0]
                int r7 = 52 - r7
                r2 = 0
                if (r1 != 0) goto L14
                r4 = r7
                r3 = r2
                goto L28
            L14:
                r3 = r2
            L15:
                int r6 = r6 + 1
                byte r4 = (byte) r5
                r0[r3] = r4
                if (r3 != r7) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L24:
                int r3 = r3 + 1
                r4 = r1[r6]
            L28:
                int r5 = r5 + r4
                int r5 = r5 + (-11)
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1eSDK.AFa1ySDK.a(byte, short, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:38:0x0114  */
        /* JADX WARN: Code duplicated, block: B:39:0x012c  */
        /* JADX WARN: Code duplicated, block: B:42:0x0179 A[Catch: all -> 0x0319, TryCatch #2 {all -> 0x0319, blocks: (B:40:0x012e, B:42:0x0179, B:44:0x01ec, B:48:0x0201, B:50:0x0237, B:51:0x029b), top: B:77:0x012e }] */
        /* JADX WARN: Code duplicated, block: B:43:0x01ea  */
        /* JADX WARN: Code duplicated, block: B:47:0x01ff  */
        /* JADX WARN: Code duplicated, block: B:50:0x0237 A[Catch: all -> 0x0319, TryCatch #2 {all -> 0x0319, blocks: (B:40:0x012e, B:42:0x0179, B:44:0x01ec, B:48:0x0201, B:50:0x0237, B:51:0x029b), top: B:77:0x012e }] */
        /* JADX WARN: Code duplicated, block: B:53:0x02bc  */
        /* JADX WARN: Code duplicated, block: B:55:0x02c3  */
        /* JADX WARN: Code duplicated, block: B:56:0x02f5  */
        private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            Object[] objArr2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i3 = 2 % 2;
            deInitSession deinitsession = new deInitSession();
            char[] cArr2 = b;
            float f = 0.0f;
            int i4 = 1770390596;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Drawable.resolveOpacity(0, 0), (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 2266, TextUtils.getCapsMode("", 0, 0) + 33, -1927765101, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                        i5++;
                        f = 0.0f;
                        i4 = 1770390596;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            try {
                Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                long j = 0;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), 2266 - TextUtils.lastIndexOf("", '0'), 34 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1927765101, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b2);
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        int i6 = $11 + 91;
                        $10 = i6 % 128;
                        if (i6 % 2 != 0) {
                            deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >> 1];
                            if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                obj = obj2;
                            } else {
                                try {
                                    objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        byte b7 = (byte) 0;
                                        byte b8 = (byte) (b7 + 1);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionType(j) + 49267), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3261, ((byte) KeyEvent.getModifierMetaStateMask()) + 31, -127612708, false, $$e(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                    }
                                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            byte b9 = (byte) 0;
                                            byte b10 = (byte) (b9 + 3);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-16754338) - Color.rgb(0, 0, 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 594, 17 - (KeyEvent.getMaxKeyCode() >> 16), 1570859318, false, $$e(b9, b10, (byte) (b10 - 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                        }
                                        obj = null;
                                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                                        int i7 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i7];
                                    } else {
                                        obj = null;
                                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                            int i8 = $10 + 111;
                                            $11 = i8 % 128;
                                            int i9 = i8 % 2;
                                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                            int i10 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                            int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i10];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                                        } else {
                                            int i12 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                            int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i12];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                                        }
                                    }
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            }
                        } else {
                            deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                            if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                obj = obj2;
                            } else {
                                objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b11 = (byte) 0;
                                    byte b12 = (byte) (b11 + 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionType(j) + 49267), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3261, ((byte) KeyEvent.getModifierMetaStateMask()) + 31, -127612708, false, $$e(b11, b12, (byte) (b12 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                    Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        byte b13 = (byte) 0;
                                        byte b14 = (byte) (b13 + 3);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-16754338) - Color.rgb(0, 0, 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 594, 17 - (KeyEvent.getMaxKeyCode() >> 16), 1570859318, false, $$e(b13, b14, (byte) (b14 - 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                                    int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                                } else {
                                    obj = null;
                                    if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                        int i15 = $10 + 111;
                                        $11 = i15 % 128;
                                        int i16 = i15 % 2;
                                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                        int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                        int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i17];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i18];
                                    } else {
                                        int i19 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                        int i110 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i19];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i110];
                                    }
                                }
                            }
                        }
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                        obj2 = obj;
                        j = 0;
                    }
                }
                for (int i20 = 0; i20 < i; i20++) {
                    cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }

        public AFa1ySDK(String str, Boolean bool, boolean z, StringBuilder sb) {
            Intrinsics.checkNotNullParameter(sb, "");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z;
            this.gaidError = sb;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ AFa1ySDK(String str, Boolean bool, boolean z, StringBuilder sb, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
                str = null;
            }
            if ((i & 2) != 0) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                int i5 = 2 % 2;
                bool = null;
            }
            if ((i & 4) != 0) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
                TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
                z = false;
            }
            this(str, bool, z, (i & 8) != 0 ? new StringBuilder() : sb);
        }

        public final String getAdvertisingId() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
            int i3 = i2 % 128;
            TuitionPaymentFragmentbindingInflater1 = i3;
            int i4 = i2 % 2;
            String str = this.advertisingId;
            int i5 = i3 + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final void setAdvertisingId(String str) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 119;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
            int i4 = i2 % 2;
            this.advertisingId = str;
            int i5 = i3 + 125;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
        }

        public final Boolean isLimitAdTrackingEnabled() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            int i4 = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cAlpha = (char) Color.alpha(0);
                int i5 = 652 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int touchSlop = 44 - (ViewConfiguration.getTouchSlop() >> 8);
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                Object[] objArr2 = new Object[1];
                a(b2, bArr[2], b2, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha, i5, touchSlop, -459846511, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{18, 22, '\n', 15, '\r', '\f', '\t', 0, '\r', 14, 2, '\t', 18, 14, 21, 19, 22, 23, 17, '\n', 4, '\f'}, (byte) (30 - TextUtils.indexOf("", "", 0, 0)), 22 - View.MeasureSpec.getMode(0), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{17, 16, 18, 2, 11, 18, 6, '\t', 17, 18, 19, 20, 16, 1, 13869}, (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46), (ViewConfiguration.getPressedStateDuration() >> 16) + 15, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int windowTouchSlop = 651 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int keyRepeatDelay = 44 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                byte b3 = $$a[80];
                byte b4 = (byte) (b3 | 50);
                Object[] objArr5 = new Object[1];
                a(b3, b4, (byte) (b4 + 1), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, windowTouchSlop, keyRepeatDelay, -873460649, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char touchSlop2 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                    int iRgb = (-16776565) - Color.rgb(0, 0, 0);
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 44;
                    byte[] bArr2 = $$a;
                    byte b5 = bArr2[7];
                    Object[] objArr6 = new Object[1];
                    a(b5, (byte) (b5 | 51), bArr2[3], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(touchSlop2, iRgb, iIndexOf, -1595579076, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i6 = ((int[]) objArr7[2])[0];
                int i7 = ((int[]) objArr7[0])[0];
                int iIdentityHashCode = System.identityHashCode(this);
                int i8 = ~(268237822 | iIdentityHashCode);
                int i9 = (((225728941 + ((237519460 | i8) * (-476))) + (i8 * 952)) + ((~((~iIdentityHashCode) | 268237822)) * 476)) - 882120414;
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArr[3])[0] = i11 ^ (i11 << 5);
            } else {
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1610 - View.resolveSize(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 26, 2145681644, false, null, new Class[0]);
                    }
                    Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -882120414, 0};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int iIndexOf2 = 650 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 44;
                        byte b6 = $$a[80];
                        byte b7 = (byte) (b6 | 50);
                        Object[] objArr9 = new Object[1];
                        a(b6, b7, (byte) (b7 + 1), objArr9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity, iIndexOf2, maxKeyCode, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 695, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 97), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.lastIndexOf("", '0') + 63407), KeyEvent.normalizeMetaState(0) + 793, 82 - ((byte) KeyEvent.getModifierMetaStateMask())), Integer.TYPE, Integer.TYPE});
                    }
                    objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int i12 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 650;
                        int iAxisFromString = 43 - MotionEvent.axisFromString("");
                        byte[] bArr3 = $$a;
                        byte b8 = bArr3[7];
                        Object[] objArr10 = new Object[1];
                        a(b8, (byte) (b8 | 51), bArr3[3], objArr10);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatTimeout, i12, iAxisFromString, -1595579076, false, (String) objArr10[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                    try {
                        Object[] objArr11 = new Object[1];
                        c(new char[]{18, 22, '\n', 15, '\r', '\f', '\t', 0, '\r', 14, 2, '\t', 18, 14, 21, 19, 22, 23, 17, '\n', 4, '\f'}, (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 30), View.MeasureSpec.getMode(0) + 22, objArr11);
                        Class<?> cls2 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        c(new char[]{17, 16, 18, 2, 11, 18, 6, '\t', 17, 18, 19, 20, 16, 1, 13869}, (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 47), TextUtils.getTrimmedLength("") + 15, objArr12);
                        long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                            int longPressTimeout = 651 - (ViewConfiguration.getLongPressTimeout() >> 16);
                            int defaultSize = 44 - View.getDefaultSize(0, 0);
                            byte b9 = $$a[80];
                            byte b10 = (byte) (b9 | 50);
                            Object[] objArr13 = new Object[1];
                            a(b9, b10, (byte) (b10 + 1), objArr13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(offsetAfter, longPressTimeout, defaultSize, -873460649, false, (String) objArr13[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                            int iAxisFromString2 = MotionEvent.axisFromString("") + 652;
                            int modifierMetaStateMask = 43 - ((byte) KeyEvent.getModifierMetaStateMask());
                            byte[] bArr4 = $$a;
                            byte b11 = bArr4[7];
                            Object[] objArr14 = new Object[1];
                            a(b11, bArr4[2], b11, objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionGroup, iAxisFromString2, modifierMetaStateMask, -459846511, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i13 = ((int[]) objArr[0])[0];
            int i14 = ((int[]) objArr[2])[0];
            if (i14 == i13) {
                Object[] objArr15 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i15 = ((int[]) objArr[3])[0];
                int i16 = ((int[]) objArr[2])[0];
                int i17 = ((int[]) objArr[0])[0];
                int i18 = (int) Runtime.getRuntime().totalMemory();
                int i19 = i15 + 765021110 + ((~((~i18) | (-234913813))) * 433) + (((~(240422940 | i18)) | (-243853751)) * (-433)) + (((~(i18 | (-243853751))) | 5509128) * 433);
                int i20 = (i19 << 13) ^ i19;
                int i21 = i20 ^ (i20 >>> 17);
                ((int[]) objArr15[3])[0] = i21 ^ (i21 << 5);
                int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
                TuitionPaymentFragmentbindingInflater1 = i22 % 128;
                if (i22 % 2 != 0) {
                    return this.isLimitAdTrackingEnabled;
                }
                int i23 = 22 / 0;
                return this.isLimitAdTrackingEnabled;
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                while (i4 < strArr.length) {
                    arrayList.add(strArr[i4]);
                    i4++;
                    int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
                    TuitionPaymentFragmentbindingInflater1 = i24 % 128;
                    int i25 = i24 % 2;
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }

        public final void setLimitAdTrackingEnabled(Boolean bool) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 75;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
            int i4 = i2 % 2;
            this.isLimitAdTrackingEnabled = bool;
            int i5 = i3 + 67;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean getAdvertisingIdWithGps() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
            int i3 = i2 % 128;
            TuitionPaymentFragmentbindingInflater1 = i3;
            int i4 = i2 % 2;
            boolean z = this.advertisingIdWithGps;
            int i5 = i3 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setAdvertisingIdWithGps(boolean z) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1;
            int i3 = i2 + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            this.advertisingIdWithGps = z;
            if (i4 != 0) {
                throw null;
            }
            int i5 = i2 + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
        }

        public final StringBuilder getGaidError() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.gaidError;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public AFa1ySDK() {
            this(null, null, false, null, 15, null);
        }

        public static /* synthetic */ AFa1ySDK copy$default(AFa1ySDK aFa1ySDK, String str, Boolean bool, boolean z, StringBuilder sb, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentbindingInflater1 + 3;
            int i4 = i3 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4;
            if (i3 % 2 == 0 && (i & 1) != 0) {
                int i5 = i4 + 63;
                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                int i6 = i5 % 2;
                str = aFa1ySDK.advertisingId;
            }
            if ((i & 2) != 0) {
                bool = aFa1ySDK.isLimitAdTrackingEnabled;
            }
            if ((i & 4) != 0) {
                z = aFa1ySDK.advertisingIdWithGps;
            }
            if ((i & 8) != 0) {
                sb = aFa1ySDK.gaidError;
                int i7 = i4 + 85;
                TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                int i8 = i7 % 2;
            }
            return aFa1ySDK.copy(str, bool, z, sb);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3 = i2 + 7;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.advertisingId;
            int i5 = i2 + 113;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final Boolean component2() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 87;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
            int i4 = i2 % 2;
            Boolean bool = this.isLimitAdTrackingEnabled;
            int i5 = i3 + 51;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            return bool;
        }

        public final boolean component3() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1;
            int i3 = i2 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.advertisingIdWithGps;
            int i5 = i2 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public final StringBuilder component4() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1;
            int i3 = i2 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            StringBuilder sb = this.gaidError;
            int i5 = i2 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            if (i5 % 2 == 0) {
                return sb;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AFa1ySDK copy(String p0, Boolean p1, boolean p2, StringBuilder p3) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(p3, "");
            AFa1ySDK aFa1ySDK = new AFa1ySDK(p0, p1, p2, p3);
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            return aFa1ySDK;
        }

        public final boolean equals(Object p0) {
            int i = 2 % 2;
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof AFa1ySDK)) {
                int i2 = TuitionPaymentFragmentbindingInflater1 + 25;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            AFa1ySDK aFa1ySDK = (AFa1ySDK) p0;
            if (!Intrinsics.areEqual(this.advertisingId, aFa1ySDK.advertisingId)) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                return i4 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.isLimitAdTrackingEnabled, aFa1ySDK.isLimitAdTrackingEnabled)) {
                int i5 = TuitionPaymentFragmentbindingInflater1 + 55;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (this.advertisingIdWithGps == aFa1ySDK.advertisingIdWithGps) {
                return Intrinsics.areEqual(this.gaidError, aFa1ySDK.gaidError);
            }
            int i7 = TuitionPaymentFragmentbindingInflater1 + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v7, types: [int] */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v7, types: [int] */
        public final int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            String str = this.advertisingId;
            if (str == null) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 3 / 5;
                }
            }
            Boolean bool = this.isLimitAdTrackingEnabled;
            int iHashCode2 = bool != null ? bool.hashCode() : 0;
            boolean z = this.advertisingIdWithGps;
            ?? r3 = z;
            if (z) {
                int i6 = TuitionPaymentFragmentbindingInflater1 + 95;
                int i7 = i6 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7;
                int i8 = i6 % 2;
                int i9 = i7 + 61;
                TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                int i10 = i9 % 2;
                r3 = 1;
            }
            return (((((iHashCode * 31) + iHashCode2) * 31) + r3) * 31) + this.gaidError.hashCode();
        }

        public final String toString() {
            int i = 2 % 2;
            String str = this.advertisingId;
            Boolean bool = this.isLimitAdTrackingEnabled;
            boolean z = this.advertisingIdWithGps;
            StringBuilder sb = this.gaidError;
            StringBuilder sb2 = new StringBuilder("FetchGaidData(advertisingId=");
            sb2.append(str);
            sb2.append(", isLimitAdTrackingEnabled=");
            sb2.append(bool);
            sb2.append(", advertisingIdWithGps=");
            sb2.append(z);
            sb2.append(", gaidError=");
            sb2.append((Object) sb);
            sb2.append(")");
            String string = sb2.toString();
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 49 / 0;
            }
            return string;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(int r5, short r6, byte r7) {
            /*
                int r6 = r6 + 113
                int r7 = r7 * 4
                int r7 = 4 - r7
                byte[] r0 = com.appsflyer.internal.AFe1eSDK.AFa1ySDK.$$c
                int r5 = r5 * 2
                int r1 = 1 - r5
                byte[] r1 = new byte[r1]
                r2 = 0
                int r5 = 0 - r5
                if (r0 != 0) goto L17
                r3 = r6
                r4 = r2
                r6 = r5
                goto L27
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r5) goto L25
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L25:
                r3 = r0[r7]
            L27:
                int r7 = r7 + 1
                int r6 = r6 + r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1eSDK.AFa1ySDK.$$e(int, short, byte):java.lang.String");
        }
    }

    private final boolean getCurrencyIso4217Code(Context p0, AFa1ySDK p1) throws IllegalStateException {
        Unit unit;
        try {
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(p0);
            if (advertisingIdInfo != null) {
                p1.setAdvertisingId(advertisingIdInfo.getId());
                p1.setLimitAdTrackingEnabled(Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                p1.setAdvertisingIdWithGps(true);
                String advertisingId = p1.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    p1.getGaidError().append("emptyOrNull |");
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                return true;
            }
            AFe1eSDK aFe1eSDK = this;
            p1.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null".toString());
        } catch (Throwable th) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Google Play Services is missing ".concat(String.valueOf(th.getMessage())), th, false, false, false, false, 88, null);
            StringBuilder gaidError = p1.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }

    private final boolean getMediationNetwork(int p0) {
        return getMonetizationNetwork(p0);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00c4  */
    private final boolean getMonetizationNetwork(int p0) {
        String string;
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Trying to fetch GAID using Samsung Cloud Dev...", false, 4, null);
        if (component3()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.getMediationNetwork.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            if (cloudDevSdk.isCloudEnvironment(context)) {
                AFa1ySDK aFa1ySDK = new AFa1ySDK(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.getMediationNetwork.getMonetizationNetwork;
                    Intrinsics.checkNotNull(context2);
                    cloudDevSdk2.request(context2, CollectionsKt.listOf("gaid"), new AFa1zSDK(aFa1ySDK, countDownLatch));
                    countDownLatch.await(((Number) this.component3.getValue()).longValue(), TimeUnit.MILLISECONDS);
                    if (aFa1ySDK.getGaidError().length() > 0) {
                        AFAdRevenueData(this.getMonetizationNetwork, aFa1ySDK.getGaidError().toString());
                    }
                } catch (Throwable th) {
                    if (th instanceof InterruptedException) {
                        string = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                    } else if (th instanceof ClassNotFoundException) {
                        string = "CloudDevSdk not found";
                    } else {
                        try {
                            String message = th.getMessage();
                            StringBuilder sb = new StringBuilder("Unexpected exception while fetching GAID using Samsung Cloud Dev ");
                            sb.append(message);
                            string = sb.toString();
                        } catch (Throwable th2) {
                            if (aFa1ySDK.getGaidError().length() > 0) {
                                AFAdRevenueData(this.getMonetizationNetwork, aFa1ySDK.getGaidError().toString());
                            }
                            throw th2;
                        }
                    }
                    AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, string, th, true, false, false, false, 112, null);
                    StringBuilder gaidError = aFa1ySDK.getGaidError();
                    gaidError.append(th.getClass().getSimpleName());
                    gaidError.append(" |");
                    if (aFa1ySDK.getGaidError().length() > 0) {
                        AFAdRevenueData(this.getMonetizationNetwork, aFa1ySDK.getGaidError().toString());
                    }
                }
                String advertisingId = aFa1ySDK.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    return false;
                }
                AFh1oSDK aFh1oSDK = this.getMonetizationNetwork;
                aFh1oSDK.getRevenue = aFa1ySDK.getAdvertisingId();
                aFh1oSDK.component3 = Boolean.FALSE;
                aFh1oSDK.getMonetizationNetwork = Boolean.TRUE;
                aFh1oSDK.getCurrencyIso4217Code = Boolean.FALSE;
                aFh1oSDK.AFAdRevenueData = Boolean.TRUE;
                aFh1oSDK.component4 = Boolean.valueOf(p0 != 2);
                return true;
            }
        }
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
        return false;
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\t"}, d2 = {"com/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask$fetchGaidUsingSamsungSdk$1", "Lcom/samsung/android/game/cloudgame/dev/sdk/CloudDevCallback;", "onError", "", "reason", "", "onSuccess", "kinds", "", "SDK_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AFa1zSDK implements CloudDevCallback {
        final /* synthetic */ AFa1ySDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        AFa1zSDK(AFa1ySDK aFa1ySDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1ySDK;
            this.$latch = countDownLatch;
        }

        public final void onError(String reason) {
            Intrinsics.checkNotNullParameter(reason, "");
            AFg1gSDK.w$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Could not fetch GAID using CloudDevSdk: ".concat(String.valueOf(reason)), false, 4, null);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "");
            AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final long getMonetizationNetwork() {
        return ((Number) this.component3.getValue()).longValue();
    }

    private static void AFAdRevenueData(AFh1oSDK aFh1oSDK, String str) {
        if (str == null) {
            return;
        }
        String str2 = aFh1oSDK.getMediationNetwork;
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" | ");
            sb.append(str);
            String string = sb.toString();
            if (string != null) {
                str = string;
            }
        }
        aFh1oSDK.getMediationNetwork = str;
    }
}
