package com.appsflyer.internal;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import defpackage.initSession;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1lSDK {
    public final List<AFe1qSDK> AFAdRevenueData;
    final List<AFe1sSDK<?>> areAllFieldsValid;
    final Set<AFe1sSDK<?>> component1;
    final NavigableSet<AFe1sSDK<?>> component2;
    final Set<AFe1mSDK> component3;
    final NavigableSet<AFe1sSDK<?>> component4;
    final Timer getCurrencyIso4217Code;
    final ExecutorService getMediationNetwork;
    final Set<AFe1mSDK> getMonetizationNetwork;
    public Executor getRevenue;

    public AFe1lSDK(ExecutorService executorService) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "");
        this.getRevenue = executorServiceNewSingleThreadExecutor;
        this.getCurrencyIso4217Code = new Timer(true);
        this.AFAdRevenueData = new CopyOnWriteArrayList();
        this.getMonetizationNetwork = new CopyOnWriteArraySet();
        this.component3 = Collections.newSetFromMap(new ConcurrentHashMap());
        this.component2 = new ConcurrentSkipListSet();
        this.component4 = new ConcurrentSkipListSet();
        this.areAllFieldsValid = new ArrayList();
        this.component1 = Collections.newSetFromMap(new ConcurrentHashMap());
        this.getMediationNetwork = executorService;
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1lSDK$5, reason: invalid class name */
    public final class AnonymousClass5 implements Runnable {
        private /* synthetic */ AFe1sSDK getMonetizationNetwork;

        public AnonymousClass5(AFe1sSDK aFe1sSDK) {
            this.getMonetizationNetwork = aFe1sSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zAdd;
            synchronized (AFe1lSDK.this.component2) {
                if (AFe1lSDK.this.component1.contains(this.getMonetizationNetwork)) {
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
                    StringBuilder sb = new StringBuilder("tried to add already running task: ");
                    sb.append(this.getMonetizationNetwork);
                    aFLogger.d(aFg1cSDK, sb.toString());
                    return;
                }
                if (!AFe1lSDK.this.component2.contains(this.getMonetizationNetwork) && !AFe1lSDK.this.component4.contains(this.getMonetizationNetwork)) {
                    AFe1lSDK aFe1lSDK = AFe1lSDK.this;
                    AFe1sSDK aFe1sSDK = this.getMonetizationNetwork;
                    for (AFe1mSDK aFe1mSDK : aFe1sSDK.AFAdRevenueData) {
                        if (aFe1lSDK.component3.contains(aFe1mSDK)) {
                            aFe1sSDK.getCurrencyIso4217Code.add(aFe1mSDK);
                        }
                    }
                    if (AFe1lSDK.this.AFAdRevenueData(this.getMonetizationNetwork)) {
                        zAdd = AFe1lSDK.this.component2.add(this.getMonetizationNetwork);
                    } else {
                        zAdd = AFe1lSDK.this.component4.add(this.getMonetizationNetwork);
                        if (zAdd) {
                            AFLogger aFLogger2 = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK2 = AFg1cSDK.QUEUE;
                            StringBuilder sb2 = new StringBuilder("new task was blocked: ");
                            sb2.append(this.getMonetizationNetwork);
                            aFLogger2.d(aFg1cSDK2, sb2.toString());
                            this.getMonetizationNetwork.AFAdRevenueData();
                        }
                    }
                    if (zAdd) {
                        AFe1lSDK.this.component2.addAll(AFe1lSDK.this.areAllFieldsValid);
                        AFe1lSDK.this.areAllFieldsValid.clear();
                    } else {
                        AFLogger aFLogger3 = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK3 = AFg1cSDK.QUEUE;
                        StringBuilder sb3 = new StringBuilder("task not added, it's already in the queue: ");
                        sb3.append(this.getMonetizationNetwork);
                        aFLogger3.d(aFg1cSDK3, sb3.toString());
                    }
                    if (zAdd) {
                        AFe1lSDK.this.component3.add(this.getMonetizationNetwork.getMonetizationNetwork);
                        AFLogger aFLogger4 = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK4 = AFg1cSDK.QUEUE;
                        StringBuilder sb4 = new StringBuilder("new task added: ");
                        sb4.append(this.getMonetizationNetwork);
                        aFLogger4.d(aFg1cSDK4, sb4.toString());
                        for (AFe1qSDK aFe1qSDK : AFe1lSDK.this.AFAdRevenueData) {
                        }
                        AFe1lSDK aFe1lSDK2 = AFe1lSDK.this;
                        aFe1lSDK2.getMediationNetwork.submit(aFe1lSDK2.new AnonymousClass4());
                        AFe1lSDK aFe1lSDK3 = AFe1lSDK.this;
                        synchronized (aFe1lSDK3.component2) {
                            for (int size = (aFe1lSDK3.component2.size() + aFe1lSDK3.component4.size()) - 40; size > 0; size--) {
                                boolean zIsEmpty = aFe1lSDK3.component4.isEmpty();
                                boolean zIsEmpty2 = aFe1lSDK3.component2.isEmpty();
                                if (zIsEmpty2 || zIsEmpty) {
                                    if (!zIsEmpty2) {
                                        aFe1lSDK3.getMediationNetwork(aFe1lSDK3.component2);
                                    } else if (!zIsEmpty) {
                                        aFe1lSDK3.getMediationNetwork(aFe1lSDK3.component4);
                                    }
                                } else if (aFe1lSDK3.component2.first().compareTo(aFe1lSDK3.component4.first()) > 0) {
                                    aFe1lSDK3.getMediationNetwork(aFe1lSDK3.component2);
                                } else {
                                    aFe1lSDK3.getMediationNetwork(aFe1lSDK3.component4);
                                }
                            }
                        }
                        return;
                    }
                    AFLogger aFLogger5 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK5 = AFg1cSDK.QUEUE;
                    StringBuilder sb5 = new StringBuilder("QUEUE: tried to add already pending task: ");
                    sb5.append(this.getMonetizationNetwork);
                    aFLogger5.w(aFg1cSDK5, sb5.toString());
                    return;
                }
                AFLogger aFLogger6 = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK6 = AFg1cSDK.QUEUE;
                StringBuilder sb6 = new StringBuilder("tried to add already scheduled task: ");
                sb6.append(this.getMonetizationNetwork);
                aFLogger6.d(aFg1cSDK6, sb6.toString());
            }
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1lSDK$4, reason: invalid class name */
    final class AnonymousClass4 implements Runnable {
        AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFe1lSDK.this.component2) {
                final AFe1sSDK<?> aFe1sSDKPollFirst = AFe1lSDK.this.component2.pollFirst();
                if (aFe1sSDKPollFirst == null) {
                    return;
                }
                AFe1lSDK.this.component1.add(aFe1sSDKPollFirst);
                long monetizationNetwork = aFe1sSDKPollFirst.getMonetizationNetwork();
                AFe1pSDK aFe1pSDK = new AFe1pSDK(Thread.currentThread());
                if (monetizationNetwork > 0) {
                    AFe1lSDK.this.getCurrencyIso4217Code.schedule(aFe1pSDK, monetizationNetwork);
                }
                final AFe1lSDK aFe1lSDK = AFe1lSDK.this;
                aFe1lSDK.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1lSDK.1
                    @Override // java.lang.Runnable
                    public final void run() throws IllegalAccessException {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 46399), Process.getGidForName("") + 41, (ViewConfiguration.getTouchSlop() >> 8) + 19, 1513912262, false, "b", null);
                        }
                        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 37836), (Process.myTid() >> 22) + 59, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
                        }
                        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), TextUtils.getOffsetAfter("", 0) + 59, 19 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
                        }
                        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
                        long j2 = 69;
                        long j3 = -1;
                        long j4 = j3 ^ 709065395721439944L;
                        long j5 = j3 ^ 4810188101438346295L;
                        long jIdentityHashCode = System.identityHashCode(this);
                        long j6 = (((long) 70) * 709065395721439944L) + (((long) (-68)) * 4810188101438346295L) + (((((j4 | j5) | jIdentityHashCode) ^ j3) | ((5464902368581623551L | jIdentityHashCode) ^ j3)) * j2) + (((long) (-69)) * (((j4 | 4810188101438346295L) ^ j3) | ((j4 | jIdentityHashCode) ^ j3) | ((jIdentityHashCode | 4810188101438346295L) ^ j3))) + (j2 * ((j5 | 709065395721439944L) ^ j3));
                        int i3 = i2;
                        long j7 = j;
                        int i4 = 0;
                        while (true) {
                            for (int i5 = 0; i5 != 8; i5++) {
                                i3 = (((((int) (j7 >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
                            }
                            if (i4 != 0) {
                                break;
                            }
                            i4++;
                            j7 = j6;
                        }
                        if (i3 != i) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 46401), 40 - KeyEvent.normalizeMetaState(0), View.MeasureSpec.getSize(0) + 19, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                            throw null;
                        }
                        Iterator<AFe1qSDK> it = AFe1lSDK.this.AFAdRevenueData.iterator();
                        while (it.hasNext()) {
                            it.next().getMonetizationNetwork(aFe1sSDKPollFirst);
                        }
                    }
                });
                if (!AFe1lSDK.this.component2.isEmpty()) {
                    AFe1lSDK aFe1lSDK2 = AFe1lSDK.this;
                    aFe1lSDK2.getMediationNetwork.submit(aFe1lSDK2.new AnonymousClass4());
                }
                try {
                    AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, "starting task execution: ".concat(String.valueOf(aFe1sSDKPollFirst)));
                    final AFe1rSDK aFe1rSDKCall = aFe1sSDKPollFirst.call();
                    aFe1pSDK.cancel();
                    final AFe1lSDK aFe1lSDK3 = AFe1lSDK.this;
                    aFe1lSDK3.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1lSDK.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
                            StringBuilder sb = new StringBuilder("execution finished for ");
                            sb.append(aFe1sSDKPollFirst);
                            sb.append(", result: ");
                            sb.append(aFe1rSDKCall);
                            aFLogger.d(aFg1cSDK, sb.toString());
                            AFe1lSDK.this.component1.remove(aFe1sSDKPollFirst);
                            Iterator<AFe1qSDK> it = AFe1lSDK.this.AFAdRevenueData.iterator();
                            while (it.hasNext()) {
                                it.next().getCurrencyIso4217Code(aFe1sSDKPollFirst, aFe1rSDKCall);
                            }
                            if (aFe1rSDKCall == AFe1rSDK.SUCCESS) {
                                AFe1lSDK.this.getMonetizationNetwork.add(aFe1sSDKPollFirst.getMonetizationNetwork);
                                AFe1lSDK.this.getCurrencyIso4217Code();
                                return;
                            }
                            if (aFe1sSDKPollFirst.getMediationNetwork()) {
                                if (AFe1lSDK.getCurrencyIso4217Code(aFe1sSDKPollFirst)) {
                                    synchronized (AFe1lSDK.this.component2) {
                                        AFe1lSDK.this.areAllFieldsValid.add(aFe1sSDKPollFirst);
                                        for (AFe1qSDK aFe1qSDK : AFe1lSDK.this.AFAdRevenueData) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFe1lSDK.this.getMonetizationNetwork.add(aFe1sSDKPollFirst.getMonetizationNetwork);
                            AFe1lSDK.this.getCurrencyIso4217Code();
                        }
                    });
                } catch (InterruptedIOException | InterruptedException unused) {
                    AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, "task was interrupted: ".concat(String.valueOf(aFe1sSDKPollFirst)));
                    aFe1sSDKPollFirst.getMediationNetwork = AFe1rSDK.TIMEOUT;
                    final AFe1lSDK aFe1lSDK4 = AFe1lSDK.this;
                    final AFe1rSDK aFe1rSDK = AFe1rSDK.TIMEOUT;
                    aFe1lSDK4.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1lSDK.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
                            StringBuilder sb = new StringBuilder("execution finished for ");
                            sb.append(aFe1sSDKPollFirst);
                            sb.append(", result: ");
                            sb.append(aFe1rSDK);
                            aFLogger.d(aFg1cSDK, sb.toString());
                            AFe1lSDK.this.component1.remove(aFe1sSDKPollFirst);
                            Iterator<AFe1qSDK> it = AFe1lSDK.this.AFAdRevenueData.iterator();
                            while (it.hasNext()) {
                                it.next().getCurrencyIso4217Code(aFe1sSDKPollFirst, aFe1rSDK);
                            }
                            if (aFe1rSDK == AFe1rSDK.SUCCESS) {
                                AFe1lSDK.this.getMonetizationNetwork.add(aFe1sSDKPollFirst.getMonetizationNetwork);
                                AFe1lSDK.this.getCurrencyIso4217Code();
                                return;
                            }
                            if (aFe1sSDKPollFirst.getMediationNetwork()) {
                                if (AFe1lSDK.getCurrencyIso4217Code(aFe1sSDKPollFirst)) {
                                    synchronized (AFe1lSDK.this.component2) {
                                        AFe1lSDK.this.areAllFieldsValid.add(aFe1sSDKPollFirst);
                                        for (AFe1qSDK aFe1qSDK : AFe1lSDK.this.AFAdRevenueData) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFe1lSDK.this.getMonetizationNetwork.add(aFe1sSDKPollFirst.getMonetizationNetwork);
                            AFe1lSDK.this.getCurrencyIso4217Code();
                        }
                    });
                } catch (Throwable unused2) {
                    aFe1pSDK.cancel();
                    final AFe1lSDK aFe1lSDK5 = AFe1lSDK.this;
                    final AFe1rSDK aFe1rSDK2 = AFe1rSDK.FAILURE;
                    aFe1lSDK5.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1lSDK.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
                            StringBuilder sb = new StringBuilder("execution finished for ");
                            sb.append(aFe1sSDKPollFirst);
                            sb.append(", result: ");
                            sb.append(aFe1rSDK2);
                            aFLogger.d(aFg1cSDK, sb.toString());
                            AFe1lSDK.this.component1.remove(aFe1sSDKPollFirst);
                            Iterator<AFe1qSDK> it = AFe1lSDK.this.AFAdRevenueData.iterator();
                            while (it.hasNext()) {
                                it.next().getCurrencyIso4217Code(aFe1sSDKPollFirst, aFe1rSDK2);
                            }
                            if (aFe1rSDK2 == AFe1rSDK.SUCCESS) {
                                AFe1lSDK.this.getMonetizationNetwork.add(aFe1sSDKPollFirst.getMonetizationNetwork);
                                AFe1lSDK.this.getCurrencyIso4217Code();
                                return;
                            }
                            if (aFe1sSDKPollFirst.getMediationNetwork()) {
                                if (AFe1lSDK.getCurrencyIso4217Code(aFe1sSDKPollFirst)) {
                                    synchronized (AFe1lSDK.this.component2) {
                                        AFe1lSDK.this.areAllFieldsValid.add(aFe1sSDKPollFirst);
                                        for (AFe1qSDK aFe1qSDK : AFe1lSDK.this.AFAdRevenueData) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFe1lSDK.this.getMonetizationNetwork.add(aFe1sSDKPollFirst.getMonetizationNetwork);
                            AFe1lSDK.this.getCurrencyIso4217Code();
                        }
                    });
                }
            }
        }
    }

    final void getCurrencyIso4217Code() {
        synchronized (this.component2) {
            Iterator<AFe1sSDK<?>> it = this.component4.iterator();
            boolean z = false;
            while (it.hasNext()) {
                AFe1sSDK<?> next = it.next();
                if (AFAdRevenueData(next)) {
                    it.remove();
                    this.component2.add(next);
                    z = true;
                }
            }
            if (z) {
                this.getMediationNetwork.submit(new AnonymousClass4());
            }
        }
    }

    final void getMediationNetwork(NavigableSet<AFe1sSDK<?>> navigableSet) {
        AFe1sSDK<?> aFe1sSDKPollFirst = navigableSet.pollFirst();
        this.getMonetizationNetwork.add(aFe1sSDKPollFirst.getMonetizationNetwork);
        Iterator<AFe1qSDK> it = this.AFAdRevenueData.iterator();
        while (it.hasNext()) {
            it.next().getMediationNetwork(aFe1sSDKPollFirst);
        }
    }

    final boolean AFAdRevenueData(AFe1sSDK<?> aFe1sSDK) {
        return this.getMonetizationNetwork.containsAll(aFe1sSDK.getCurrencyIso4217Code);
    }

    public static boolean getCurrencyIso4217Code(AFe1sSDK<?> aFe1sSDK) {
        return ((aFe1sSDK instanceof AFf1vSDK) && aFe1sSDK.getMonetizationNetwork == AFe1mSDK.ARS_VALIDATE) ? false : true;
    }
}
