package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.AudioTrack;
import android.view.ViewConfiguration;
import androidx.core.view.ViewCompat;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1eSDK implements AFc1dSDK {
    private static final int getMediationNetwork = (int) TimeUnit.SECONDS.toMillis(30);
    private AFe1zSDK AFInAppEventParameterName;
    private AFf1gSDK AFInAppEventType;
    private AFd1uSDK AFKeystoreWrapper;
    private AFc1vSDK AFLogger;
    private AFh1uSDK AFPurchaseDetails;
    private AFa1oSDK afDebugLog;
    private AFa1gSDK afErrorLog;
    private AFa1aSDK afInfoLog;
    private AFe1uSDK afLogForce;
    private AFi1fSDK afRDLog;
    private AFf1dSDK afVerboseLog;
    private AFg1bSDK afWarnLog;
    private AFc1pSDK areAllFieldsValid;
    private PurchaseHandler component1;
    private AFc1jSDK component2;
    private AFf1oSDK component3;
    private AFd1lSDK component4;
    private AFg1qSDK copy;
    private AFh1vSDK copydefault;
    private AFj1fSDK d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AFb1bSDK f370e;
    private AFd1pSDK equals;
    private AFg1vSDK force;
    private ExecutorService getCurrencyIso4217Code;
    private AFc1kSDK getLevel;
    private ScheduledExecutorService getMonetizationNetwork;
    private ExecutorService getRevenue;
    private AFj1lSDK hashCode;
    private AFg1uSDK i;
    private AFj1sSDK registerClient;
    private AFe1lSDK toString;
    private AFi1lSDK unregisterClient;
    private AFi1kSDK v;
    private AFg1xSDK values;
    private AFi1tSDK w;
    private String afErrorLogForExcManagerOnly = null;
    public final AFc1iSDK AFAdRevenueData = new AFc1iSDK();

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFe1uSDK getMediationNetwork() {
        if (this.afLogForce == null) {
            this.afLogForce = new AFe1uSDK(component2(), AFInAppEventType(), getRevenue(), getMonetizationNetwork(), component3(), registerClient(), copydefault());
        }
        return this.afLogForce;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFd1oSDK getCurrencyIso4217Code() {
        return new AFd1oSDK(afLogForce(), getRevenue(), AppsFlyerProperties.getInstance(), AFKeystoreWrapper(), getLevel());
    }

    private AFd1lSDK afLogForce() {
        AFd1lSDK aFd1lSDK;
        synchronized (this) {
            if (this.component4 == null) {
                this.component4 = new AFd1lSDK(new AFd1jSDK(getMediationNetwork), getMonetizationNetwork());
            }
            aFd1lSDK = this.component4;
        }
        return aFd1lSDK;
    }

    private String valueOf() {
        if (this.afErrorLogForExcManagerOnly == null) {
            this.afErrorLogForExcManagerOnly = new AFa1vSDK().getMonetizationNetwork();
        }
        return this.afErrorLogForExcManagerOnly;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final ExecutorService getMonetizationNetwork() {
        ExecutorService executorService;
        synchronized (this) {
            if (this.getRevenue == null) {
                this.getRevenue = new AFc1oSDK(0, 5, 60L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
            }
            executorService = this.getRevenue;
        }
        return executorService;
    }

    private ExecutorService AFLoggerLogLevel() {
        ExecutorService executorService;
        synchronized (this) {
            if (this.getCurrencyIso4217Code == null) {
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "");
                this.getCurrencyIso4217Code = executorServiceNewSingleThreadExecutor;
            }
            executorService = this.getCurrencyIso4217Code;
        }
        return executorService;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final ScheduledExecutorService AFAdRevenueData() {
        ScheduledExecutorService scheduledExecutorService;
        synchronized (this) {
            if (this.getMonetizationNetwork == null) {
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
                Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "");
                this.getMonetizationNetwork = scheduledExecutorServiceNewScheduledThreadPool;
            }
            scheduledExecutorService = this.getMonetizationNetwork;
        }
        return scheduledExecutorService;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFc1pSDK getRevenue() {
        AFc1pSDK aFc1pSDK;
        synchronized (this) {
            if (this.areAllFieldsValid == null) {
                AFc1iSDK aFc1iSDKAFInAppEventType = AFInAppEventType();
                AFc1qSDK aFc1qSDKComponent2 = component2();
                if (this.getLevel == null) {
                    this.getLevel = new AFc1kSDK();
                }
                this.areAllFieldsValid = new AFc1pSDK(aFc1iSDKAFInAppEventType, aFc1qSDKComponent2, this.getLevel, getMonetizationNetwork());
            }
            aFc1pSDK = this.areAllFieldsValid;
        }
        return aFc1pSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFc1qSDK component2() {
        if (this.component2 == null) {
            this.component2 = new AFc1jSDK(new AFc1hSDK(new Function0() { // from class: com.appsflyer.internal.AFc1eSDK$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f$0.m_();
                }
            }));
        }
        return this.component2;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final PurchaseHandler component4() {
        PurchaseHandler purchaseHandler;
        synchronized (this) {
            if (this.component1 == null) {
                this.component1 = new PurchaseHandler(this);
            }
            purchaseHandler = this.component1;
        }
        return purchaseHandler;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFf1oSDK component1() {
        AFf1oSDK aFf1oSDK;
        synchronized (this) {
            if (this.component3 == null) {
                AFf1lSDK aFf1lSDK = new AFf1lSDK(component2());
                this.component3 = new AFf1oSDK(new AFf1pSDK(), getRevenue(), registerClient(), aFf1lSDK, new AFd1oSDK(afLogForce(), getRevenue(), AppsFlyerProperties.getInstance(), AFKeystoreWrapper(), getLevel()), new AFf1iSDK(getRevenue(), aFf1lSDK), copydefault());
            }
            aFf1oSDK = this.component3;
        }
        return aFf1oSDK;
    }

    private AFg1xSDK values() {
        AFg1xSDK aFg1xSDK;
        synchronized (this) {
            if (this.values == null) {
                this.values = new AFg1xSDK(AFInAppEventType(), getRevenue());
            }
            aFg1xSDK = this.values;
        }
        return aFg1xSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFh1vSDK areAllFieldsValid() {
        AFh1vSDK aFh1vSDK;
        synchronized (this) {
            if (this.copydefault == null) {
                this.copydefault = new AFh1vSDK(component2());
            }
            aFh1vSDK = this.copydefault;
        }
        return aFh1vSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFg1qSDK component3() {
        if (this.copy == null) {
            String strValueOf = valueOf();
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            if (this.unregisterClient == null) {
                this.unregisterClient = new AFi1mSDK();
            }
            AFi1lSDK aFi1lSDK = this.unregisterClient;
            if (this.i == null) {
                this.i = new AFg1sSDK();
            }
            AFg1uSDK aFg1uSDK = this.i;
            if (this.hashCode == null) {
                Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                if (context2 != null) {
                    this.hashCode = new AFj1nSDK(context2, AFLoggerLogLevel());
                } else {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
            }
            AFj1lSDK aFj1lSDK = this.hashCode;
            if (this.force == null) {
                this.force = new AFg1tSDK();
            }
            AFg1vSDK aFg1vSDK = this.force;
            AFh1vSDK aFh1vSDKAreAllFieldsValid = areAllFieldsValid();
            AFc1qSDK aFc1qSDKComponent2 = component2();
            AFc1pSDK revenue = getRevenue();
            if (this.w == null) {
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                if (context3 != null) {
                    this.w = new AFi1tSDK(context3);
                } else {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
            }
            AFi1tSDK aFi1tSDK = this.w;
            AFf1gSDK aFf1gSDKRegisterClient = registerClient();
            AFc1iSDK aFc1iSDKAFInAppEventType = AFInAppEventType();
            AFg1xSDK aFg1xSDKValues = values();
            if (this.getLevel == null) {
                this.getLevel = new AFc1kSDK();
            }
            this.copy = new AFg1oSDK(strValueOf, context, aFi1lSDK, aFg1uSDK, aFj1lSDK, aFg1vSDK, aFh1vSDKAreAllFieldsValid, aFc1qSDKComponent2, revenue, aFi1tSDK, aFf1gSDKRegisterClient, aFc1iSDKAFInAppEventType, aFg1xSDKValues, this.getLevel);
        }
        return this.copy;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFj1lSDK equals() {
        if (this.hashCode == null) {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            if (context != null) {
                this.hashCode = new AFj1nSDK(context, AFLoggerLogLevel());
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.hashCode;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFe1lSDK copydefault() {
        AFe1lSDK aFe1lSDK;
        synchronized (this) {
            if (this.toString == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 300L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFc1eSDK.3
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                    /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
                    public boolean offer(Runnable runnable) {
                        if (isEmpty()) {
                            return super.offer(runnable);
                        }
                        return false;
                    }
                }, new AFa1ySDK());
                threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: com.appsflyer.internal.AFc1eSDK$$ExternalSyntheticLambda0
                    @Override // java.util.concurrent.RejectedExecutionHandler
                    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                        AFc1eSDK.getMediationNetwork(runnable, threadPoolExecutor2);
                    }
                });
                this.toString = new AFe1lSDK(threadPoolExecutor);
            }
            aFe1lSDK = this.toString;
        }
        return aFe1lSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFd1pSDK copy() {
        AFd1pSDK aFd1pSDK;
        synchronized (this) {
            if (this.equals == null) {
                this.equals = new AFd1kSDK(this);
            }
            aFd1pSDK = this.equals;
        }
        return aFd1pSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFj1sSDK AFLogger() {
        AFj1sSDK aFj1sSDK;
        synchronized (this) {
            if (this.registerClient == null) {
                this.registerClient = new AFj1sSDK(this);
            }
            aFj1sSDK = this.registerClient;
        }
        return aFj1sSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFf1gSDK registerClient() {
        AFf1gSDK aFf1gSDK;
        synchronized (this) {
            if (this.AFInAppEventType == null) {
                this.AFInAppEventType = new AFf1gSDK(AFInAppEventType(), new AFf1eSDK());
            }
            aFf1gSDK = this.AFInAppEventType;
        }
        return aFf1gSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFc1iSDK AFInAppEventType() {
        AFc1iSDK aFc1iSDK;
        synchronized (this) {
            aFc1iSDK = this.AFAdRevenueData;
        }
        return aFc1iSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFc1vSDK AFInAppEventParameterName() {
        AFc1vSDK aFc1vSDK;
        synchronized (this) {
            if (this.AFLogger == null) {
                this.AFLogger = new AFc1tSDK(AFInAppEventType(), component2());
            }
            aFc1vSDK = this.AFLogger;
        }
        return aFc1vSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFc1dSDK
    /* JADX INFO: renamed from: AFPurchaseDetails, reason: merged with bridge method [inline-methods] */
    public AFd1uSDK afRDLog() {
        AFd1uSDK aFd1uSDK;
        synchronized (this) {
            if (this.AFKeystoreWrapper == null) {
                this.AFKeystoreWrapper = new AFd1uSDK(this);
            }
            aFd1uSDK = this.AFKeystoreWrapper;
        }
        return aFd1uSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFe1zSDK AFKeystoreWrapper() {
        AFe1zSDK aFe1zSDK;
        synchronized (this) {
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = new AFe1zSDK(getRevenue(), component2());
            }
            aFe1zSDK = this.AFInAppEventParameterName;
        }
        return aFe1zSDK;
    }

    private AFj1fSDK getLevel() {
        AFj1fSDK aFj1fSDK;
        synchronized (this) {
            if (this.d == null) {
                this.d = new AFj1fSDK(getRevenue());
            }
            aFj1fSDK = this.d;
        }
        return aFj1fSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFi1lSDK unregisterClient() {
        if (this.unregisterClient == null) {
            this.unregisterClient = new AFi1mSDK();
        }
        return this.unregisterClient;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFa1oSDK d() {
        AFa1oSDK aFa1oSDK;
        synchronized (this) {
            if (this.afDebugLog == null) {
                this.afDebugLog = new AFa1oSDK(this);
            }
            aFa1oSDK = this.afDebugLog;
        }
        return aFa1oSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFa1aSDK e() {
        AFa1aSDK aFa1aSDK;
        synchronized (this) {
            if (this.afInfoLog == null) {
                this.afInfoLog = new AFa1bSDK(AFInAppEventType());
            }
            aFa1aSDK = this.afInfoLog;
        }
        return aFa1aSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFi1tSDK i() {
        if (this.w == null) {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            if (context != null) {
                this.w = new AFi1tSDK(context);
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.w;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFi1kSDK w() {
        if (this.v == null) {
            this.v = new AFi1oSDK();
        }
        return this.v;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFc1kSDK afInfoLog() {
        if (this.getLevel == null) {
            this.getLevel = new AFc1kSDK();
        }
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFb1bSDK afDebugLog() {
        if (this.f370e == null) {
            ExecutorService executorServiceAFLoggerLogLevel = AFLoggerLogLevel();
            ScheduledExecutorService scheduledExecutorServiceAFAdRevenueData = AFAdRevenueData();
            AFa1oSDK aFa1oSDKD = d();
            if (this.v == null) {
                this.v = new AFi1oSDK();
            }
            this.f370e = new AFb1aSDK(executorServiceAFLoggerLogLevel, scheduledExecutorServiceAFAdRevenueData, aFa1oSDKD, this.v);
        }
        return this.f370e;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFg1bSDK v() {
        if (this.afWarnLog == null) {
            this.afWarnLog = new AFg1aSDK(this);
        }
        return this.afWarnLog;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFf1dSDK afErrorLog() {
        if (this.afVerboseLog == null) {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            if (context != null) {
                AFf1bSDK aFf1bSDK = new AFf1bSDK(context, AppsFlyerProperties.getInstance());
                if (this.getLevel == null) {
                    this.getLevel = new AFc1kSDK();
                }
                this.afVerboseLog = new AFf1fSDK(aFf1bSDK, this.getLevel, AppsFlyerProperties.getInstance());
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.afVerboseLog;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFi1fSDK force() {
        try {
            if (this.afRDLog == null) {
                try {
                    Object[] objArr = {getRevenue(), AFInAppEventType(), registerClient()};
                    Object declaredConstructor = AFi1jSDK.f373e.get(-9506129);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFi1jSDK.AFAdRevenueData(ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 37 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getDeclaredConstructor(AFc1pSDK.class, AFc1iSDK.class, AFf1gSDK.class);
                        AFi1jSDK.f373e.put(-9506129, declaredConstructor);
                    }
                    this.afRDLog = (AFi1fSDK) ((Constructor) declaredConstructor).newInstance(objArr);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.PLAY_INTEGRITY_API, th2.getMessage() != null ? th2.getMessage() : "", th2, false, false);
        }
        return this.afRDLog;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFa1gSDK afVerboseLog() {
        if (this.afErrorLog == null) {
            this.afErrorLog = new AFa1lSDK(component2());
        }
        return this.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFh1uSDK afErrorLogForExcManagerOnly() {
        if (AFh1sSDK.getCurrencyIso4217Code() && this.AFPurchaseDetails == null) {
            this.AFPurchaseDetails = new AFh1pSDK(getRevenue(), AFLogger());
        }
        return this.AFPurchaseDetails;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getMediationNetwork(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e2) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e2);
            Thread.currentThread().interrupt();
        }
    }

    static final class AFa1ySDK implements ThreadFactory {
        private static final AtomicInteger getCurrencyIso4217Code = new AtomicInteger();
        private final AtomicInteger getMonetizationNetwork = new AtomicInteger();

        public AFa1ySDK() {
            getCurrencyIso4217Code.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i = getCurrencyIso4217Code.get();
            int iIncrementAndGet = this.getMonetizationNetwork.incrementAndGet();
            StringBuilder sb = new StringBuilder("queue-");
            sb.append(i);
            sb.append("-");
            sb.append(iIncrementAndGet);
            return new Thread(runnable, sb.toString());
        }
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFb1hSDK afWarnLog() {
        if (this.getLevel == null) {
            this.getLevel = new AFc1kSDK();
        }
        return new AFb1cSDK(this.getLevel, AFInAppEventType(), registerClient());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SharedPreferences m_() {
        Context context = this.AFAdRevenueData.getMonetizationNetwork;
        if (context != null) {
            return AFa1tSDK.c_(context);
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }
}
