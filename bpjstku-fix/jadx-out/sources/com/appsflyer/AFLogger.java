package com.appsflyer;

import com.appsflyer.internal.AFg1cSDK;
import com.appsflyer.internal.AFg1gSDK;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u00011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ7\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0010\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0012J+\u0010\u0010\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0013J3\u0010\u0010\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0014J#\u0010\u0015\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0012J+\u0010\u0015\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\bJ\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0016\u0010\u000bJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\bJ\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\bJ\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001a\u0010\u000bJ'\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJG\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#J'\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010\u001dJ!\u0010&\u001a\u00020\u00062\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010%\"\u00020\u0001¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020\u00062\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010%\"\u00020\u0001¢\u0006\u0004\b(\u0010'J'\u0010)\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010\u001dJ'\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010\u001dR\u0019\u0010.\u001a\u0006*\u00020+0+8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010/8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b0\u0010-"}, d2 = {"Lcom/appsflyer/AFLogger;", "Lcom/appsflyer/internal/AFg1gSDK;", "<init>", "()V", "", "p0", "", "afDebugLog", "(Ljava/lang/String;)V", "", "p1", "(Ljava/lang/String;Z)V", "", "p2", "p3", "p4", "afErrorLog", "(Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V", "afErrorLogForExcManagerOnly", "afInfoLog", "afLogForce", "afRDLog", "afVerboseLog", "afWarnLog", "Lcom/appsflyer/internal/AFg1cSDK;", "d", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Z)V", "p5", "p6", "e", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;)V", "i", "", "registerClient", "([Lcom/appsflyer/internal/AFg1gSDK;)V", "unregisterClient", "v", "w", "Ljava/util/concurrent/ExecutorService;", "getRevenue", "Lkotlin/Lazy;", "getCurrencyIso4217Code", "", "getMediationNetwork", "LogLevel"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFLogger extends AFg1gSDK {
    public static final AFLogger INSTANCE = new AFLogger();

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    private static final Lazy getRevenue = LazyKt.lazy(new Function0<Set<AFg1gSDK>>() { // from class: com.appsflyer.AFLogger.8
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final Set<AFg1gSDK> invoke() {
            return Collections.synchronizedSet(new LinkedHashSet());
        }
    });

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    private static final Lazy getCurrencyIso4217Code = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.appsflyer.AFLogger.3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    });

    private AFLogger() {
    }

    public final void registerClient(final AFg1gSDK... p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new Runnable() { // from class: com.appsflyer.AFLogger$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.getMediationNetwork(p0);
            }
        });
    }

    public final void unregisterClient(final AFg1gSDK... p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new Runnable() { // from class: com.appsflyer.AFLogger$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.getCurrencyIso4217Code(p0);
            }
        });
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void d(final AFg1cSDK p0, final String p1, final boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1gSDK, Unit>() { // from class: com.appsflyer.AFLogger.1
            public final void getRevenue(AFg1gSDK aFg1gSDK) {
                Intrinsics.checkNotNullParameter(aFg1gSDK, "");
                aFg1gSDK.d(p0, p1, p2);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
                getRevenue(aFg1gSDK);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void e(final AFg1cSDK p0, final String p1, final Throwable p2, final boolean p3, final boolean p4, final boolean p5, final boolean p6) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1gSDK, Unit>() { // from class: com.appsflyer.AFLogger.2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
                getRevenue(aFg1gSDK);
                return Unit.INSTANCE;
            }

            public final void getRevenue(AFg1gSDK aFg1gSDK) {
                Intrinsics.checkNotNullParameter(aFg1gSDK, "");
                aFg1gSDK.e(p0, p1, p2, p3, p4, p5, p6);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void i(final AFg1cSDK p0, final String p1, final boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1gSDK, Unit>() { // from class: com.appsflyer.AFLogger.5
            public final void AFAdRevenueData(AFg1gSDK aFg1gSDK) {
                Intrinsics.checkNotNullParameter(aFg1gSDK, "");
                aFg1gSDK.i(p0, p1, p2);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
                AFAdRevenueData(aFg1gSDK);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void w(final AFg1cSDK p0, final String p1, final boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1gSDK, Unit>() { // from class: com.appsflyer.AFLogger.9
            public final void getCurrencyIso4217Code(AFg1gSDK aFg1gSDK) {
                Intrinsics.checkNotNullParameter(aFg1gSDK, "");
                aFg1gSDK.w(p0, p1, p2);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
                getCurrencyIso4217Code(aFg1gSDK);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void v(final AFg1cSDK p0, final String p1, final boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1gSDK, Unit>() { // from class: com.appsflyer.AFLogger.6
            public final void getMonetizationNetwork(AFg1gSDK aFg1gSDK) {
                Intrinsics.checkNotNullParameter(aFg1gSDK, "");
                aFg1gSDK.v(p0, p1, p2);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
                getMonetizationNetwork(aFg1gSDK);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void force(final AFg1cSDK p0, final String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1gSDK, Unit>() { // from class: com.appsflyer.AFLogger.4
            public final void getMediationNetwork(AFg1gSDK aFg1gSDK) {
                Intrinsics.checkNotNullParameter(aFg1gSDK, "");
                aFg1gSDK.force(p0, p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
                getMediationNetwork(aFg1gSDK);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }));
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.i()", imports = {}))
    @JvmStatic
    public static final void afInfoLog(String p0, boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        INSTANCE.i(AFg1cSDK.OTHER, p0, p1);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.d()", imports = {}))
    @JvmStatic
    public static final void afDebugLog(String p0, boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        INSTANCE.d(AFg1cSDK.OTHER, p0, p1);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(String p0, Throwable p1, boolean p2, boolean p3, boolean p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        AFg1gSDK.e$default(INSTANCE, AFg1cSDK.OTHER, p0, p1, p2, p3, p4, false, 64, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.w()", imports = {}))
    @JvmStatic
    public static final void afWarnLog(String p0, boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        INSTANCE.w(AFg1cSDK.OTHER, p0, p1);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.v()", imports = {}))
    @JvmStatic
    public static final void afVerboseLog(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        INSTANCE.v(AFg1cSDK.OTHER, p0, false);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.v()", imports = {}))
    @JvmStatic
    public static final void afRDLog(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        INSTANCE.v(AFg1cSDK.OTHER, p0, true);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.force()", imports = {}))
    @JvmStatic
    public static final void afLogForce(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        INSTANCE.force(AFg1cSDK.OTHER, p0);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.d()", imports = {}))
    @JvmStatic
    public static final void afDebugLog(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        INSTANCE.d(AFg1cSDK.OTHER, p0, true);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.i()", imports = {}))
    @JvmStatic
    public static final void afInfoLog(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        INSTANCE.i(AFg1cSDK.OTHER, p0, true);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(String p0, Throwable p1) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        String str = p0;
        if (str == null || StringsKt.isBlank(str)) {
            p0 = "null";
        }
        String str2 = p0;
        if (p1 == null) {
            p1 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFg1cSDK, str2, p1, false, false, false, false, 120, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLogForExcManagerOnly(String p0, Throwable p1) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        String str = p0;
        if (str == null || StringsKt.isBlank(str)) {
            p0 = "null";
        }
        String str2 = p0;
        if (p1 == null) {
            p1 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFg1cSDK, str2, p1, false, false, true, false, 64, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLogForExcManagerOnly(String p0, Throwable p1, boolean p2) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        String str = p0;
        if (str == null || StringsKt.isBlank(str)) {
            p0 = "null";
        }
        String str2 = p0;
        if (p1 == null) {
            p1 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFg1cSDK, str2, p1, false, false, !p2, false, 64, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(String p0, Throwable p1, boolean p2) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        String str = p0;
        if (str == null || StringsKt.isBlank(str)) {
            p0 = "null";
        }
        String str2 = p0;
        if (p1 == null) {
            p1 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFg1cSDK, str2, p1, false, p2, false, false, 104, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(String p0, Throwable p1, boolean p2, boolean p3) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        String str = p0;
        if (str == null || StringsKt.isBlank(str)) {
            p0 = "null";
        }
        String str2 = p0;
        if (p1 == null) {
            p1 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFg1cSDK, str2, p1, false, p2, p3, false, 72, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.w()", imports = {}))
    @JvmStatic
    public static final void afWarnLog(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        AFg1gSDK.w$default(INSTANCE, AFg1cSDK.OTHER, p0, false, 4, null);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/appsflyer/AFLogger$LogLevel;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", FirebaseAnalytics.Param.LEVEL, "I", "getLevel", "()I", "NONE", "ERROR", "WARNING", "INFO", "DEBUG", "VERBOSE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private final int level;

        LogLevel(int i) {
            this.level = i;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFg1gSDK[] aFg1gSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1gSDKArr, "");
        Lazy lazy = getRevenue;
        Object value = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = lazy.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            CollectionsKt.addAll((Set) value2, aFg1gSDKArr);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFg1gSDK[] aFg1gSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1gSDKArr, "");
        Lazy lazy = getRevenue;
        Object value = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = lazy.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            ((Set) value2).removeAll(ArraysKt.toSet(aFg1gSDKArr));
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Lazy lazy = getRevenue;
        Object value = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = lazy.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            Iterator it = ((Set) value2).iterator();
            while (it.hasNext()) {
                function1.invoke((AFg1gSDK) it.next());
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
