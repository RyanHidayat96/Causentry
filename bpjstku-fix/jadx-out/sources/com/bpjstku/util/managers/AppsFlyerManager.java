package com.bpjstku.util.managers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0003\u0016\u0010\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015"}, d2 = {"Lcom/bpjstku/util/managers/AppsFlyerManager;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "", "p2", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/bpjstku/util/managers/AppsFlyerManager$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "b", "Lcom/bpjstku/util/managers/AppsFlyerManager$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "TuitionPaymentFragmentbindingInflater1", "Z", "Lcom/bpjstku/util/managers/AppsFlyerManager$b;", "Lcom/bpjstku/util/managers/AppsFlyerManager$b;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "DeepLinkSource"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppsFlyerManager {
    private static volatile AppsFlyerManager TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public boolean TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final b TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        void TuitionPaymentFragmentbindingInflater1(Uri uri, DeepLinkSource deepLinkSource);

        void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str);

        void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Map<String, ? extends Object> map);
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeepLinkResult.Status.values().length];
            try {
                iArr[DeepLinkResult.Status.FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeepLinkResult.Status.NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeepLinkResult.Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.bpjstku.util.managers.AppsFlyerManager$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/util/managers/AppsFlyerManager$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/bpjstku/util/managers/AppsFlyerManager;", "b", "()Lcom/bpjstku/util/managers/AppsFlyerManager;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/util/managers/AppsFlyerManager;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final AppsFlyerManager b() {
            AppsFlyerManager appsFlyerManager;
            AppsFlyerManager appsFlyerManager2 = AppsFlyerManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (appsFlyerManager2 != null) {
                return appsFlyerManager2;
            }
            synchronized (this) {
                appsFlyerManager = AppsFlyerManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (appsFlyerManager == null) {
                    appsFlyerManager = new AppsFlyerManager(null);
                    Companion companion = AppsFlyerManager.INSTANCE;
                    AppsFlyerManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = appsFlyerManager;
                }
            }
            return appsFlyerManager;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AppsFlyerManager() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new b();
    }

    public static final /* synthetic */ void b(AppsFlyerManager appsFlyerManager, Map map) {
        Objects.toString(map);
        try {
            Object obj = map.get("path");
            Uri uriBuild = null;
            String str = obj instanceof String ? (String) obj : null;
            Object obj2 = map.get("videoId");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = map.get("type");
            String str3 = obj3 instanceof String ? (String) obj3 : null;
            if (str != null) {
                Uri.Builder builderPath = new Uri.Builder().scheme("https").authority("bpjsketenagakerjaan.onelink.me").path(str);
                if (str2 != null) {
                    builderPath.appendQueryParameter("videoId", str2);
                }
                if (str3 != null) {
                    builderPath.appendQueryParameter("type", str3);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str4 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (!CollectionsKt.listOf((Object[]) new String[]{"path", "videoId", "type", "af_status", "is_first_launch", "timestamp"}).contains(str4)) {
                        builderPath.appendQueryParameter(str4, value.toString());
                    }
                }
                uriBuild = builderPath.build();
                Intrinsics.checkNotNullExpressionValue(uriBuild, "");
            }
            if (uriBuild != null) {
                Objects.toString(uriBuild);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = appsFlyerManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(uriBuild, DeepLinkSource.DEFERRED);
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = appsFlyerManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Error handling deferred deep link: ".concat(String.valueOf(e2.getMessage())));
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.bpjstku.util.managers.AppsFlyerManager$DeepLinkSource[], still in use, count: 1, list:
  (r0v1 com.bpjstku.util.managers.AppsFlyerManager$DeepLinkSource[]) from 0x003c: INVOKE (r0v1 com.bpjstku.util.managers.AppsFlyerManager$DeepLinkSource[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/bpjstku/util/managers/AppsFlyerManager$DeepLinkSource;", "", "<init>", "(Ljava/lang/String;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "a", "b"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeepLinkSource {
        DIRECT,
        DEFERRED,
        APP_OPEN,
        ATTRIBUTION,
        FALLBACK_URI_SCHEME;

        private DeepLinkSource() {
            super(str, i);
        }

        static {
            EnumEntriesKt.enumEntries(new DeepLinkSource[]{r0, r1, r2, ATTRIBUTION, r3});
        }

        public static DeepLinkSource valueOf(String str) {
            return (DeepLinkSource) Enum.valueOf(DeepLinkSource.class, str);
        }

        public static DeepLinkSource[] values() {
            return (DeepLinkSource[]) TuitionPaymentFragmentspecialinlinedviewModeldefault3.clone();
        }
    }

    public static final class b implements AppsFlyerConversionListener {
        b() {
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public final void onConversionDataSuccess(Map<String, Object> map) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Objects.toString(map);
            if (map != null) {
                AppsFlyerManager appsFlyerManager = AppsFlyerManager.this;
                Object obj = map.get("af_status");
                String str = obj instanceof String ? (String) obj : null;
                Object obj2 = map.get("is_first_launch");
                Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                Objects.toString(bool);
                if (Intrinsics.areEqual(str, "Non-organic") && Intrinsics.areEqual(bool, Boolean.TRUE)) {
                    AppsFlyerManager.b(appsFlyerManager, map);
                } else {
                    if (!Intrinsics.areEqual(str, "Non-organic") || (tuitionPaymentFragmentspecialinlinedviewModeldefault1 = appsFlyerManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) {
                        return;
                    }
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(map);
                }
            }
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public final void onConversionDataFail(String str) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = AppsFlyerManager.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Conversion data failed: ".concat(String.valueOf(str)));
            }
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public final void onAppOpenAttribution(Map<String, String> map) {
            Objects.toString(map);
            if (map != null) {
                AppsFlyerManager.TuitionPaymentFragmentspecialinlinedviewModeldefault3(AppsFlyerManager.this, map);
            }
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public final void onAttributionFailure(String str) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = AppsFlyerManager.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Attribution failed: ".concat(String.valueOf(str)));
            }
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, String p1, Map<String, ? extends Object> p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        if (this.TuitionPaymentFragmentbindingInflater1) {
            Map<String, Object> mutableMap = MapsKt.toMutableMap(p2);
            mutableMap.put("timestamp", Long.valueOf(System.currentTimeMillis()));
            AppsFlyerLib.getInstance().logEvent(p0, p1, mutableMap, new TuitionPaymentFragmentbindingInflater1(p1));
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements AppsFlyerRequestListener {
        private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        @Override // com.appsflyer.attribution.AppsFlyerRequestListener
        public final void onError(int i, String str) {
            Intrinsics.checkNotNullParameter(str, "");
        }

        @Override // com.appsflyer.attribution.AppsFlyerRequestListener
        public final void onSuccess() {
        }

        TuitionPaymentFragmentbindingInflater1(String str) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(AppsFlyerManager appsFlyerManager, Context context, DeepLinkResult deepLinkResult) {
        Intrinsics.checkNotNullParameter(deepLinkResult, "");
        Objects.toString(deepLinkResult.getStatus());
        Objects.toString(deepLinkResult.getError());
        Objects.toString(deepLinkResult.getDeepLink());
        int i = WhenMappings.$EnumSwitchMapping$0[deepLinkResult.getStatus().ordinal()];
        Uri uri = null;
        if (i == 1) {
            DeepLink deepLink = deepLinkResult.getDeepLink();
            Objects.toString(deepLink);
            String stringValue = deepLink != null ? deepLink.getStringValue("deep_link_value") : null;
            uri = stringValue != null ? Uri.parse(stringValue) : null;
            if (uri == null) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = appsFlyerManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2("af_dp missing or invalid in deep link");
                    return;
                }
                return;
            }
            Objects.toString(uri);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = appsFlyerManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(uri, DeepLinkSource.DIRECT);
                return;
            }
            return;
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Objects.toString(deepLinkResult.getDeepLink());
        Activity activity = context instanceof Activity ? (Activity) context : null;
        Intent intent = activity != null ? activity.getIntent() : null;
        Uri data = intent != null ? intent.getData() : null;
        if (data != null && Intrinsics.areEqual(data.getScheme(), "bpjstku")) {
            uri = data;
        }
        if (uri != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = appsFlyerManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(uri, DeepLinkSource.FALLBACK_URI_SCHEME);
                return;
            }
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = appsFlyerManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault4 != null) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Deep link not found or error occurred");
        }
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AppsFlyerManager appsFlyerManager, Map map) {
        Objects.toString(map);
        try {
            String str = (String) map.get("deep_link_value");
            Uri uri = str != null ? Uri.parse(str) : null;
            if (uri != null) {
                Objects.toString(uri);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = appsFlyerManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(uri, DeepLinkSource.APP_OPEN);
                    return;
                }
                return;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = appsFlyerManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2("af_dp missing or invalid in deep link");
            }
        } catch (Exception e2) {
            e2.getMessage();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = appsFlyerManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Error handling app open attribution: ".concat(String.valueOf(e2.getMessage())));
            }
        }
    }

    public /* synthetic */ AppsFlyerManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
