package com.google.firebase.crashlytics.internal.concurrency;

import android.content.Context;
import android.os.Looper;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\t"}, d2 = {"Lcom/google/firebase/crashlytics/internal/concurrency/CrashlyticsWorkers;", "", "Ljava/util/concurrent/ExecutorService;", "p0", "p1", "<init>", "(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V", "Lcom/google/firebase/crashlytics/internal/concurrency/CrashlyticsWorker;", "common", "Lcom/google/firebase/crashlytics/internal/concurrency/CrashlyticsWorker;", "diskWrite", "dataCollect", "network", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CrashlyticsWorkers {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean enforcement;
    public final CrashlyticsWorker common;
    public final CrashlyticsWorker dataCollect;
    public final CrashlyticsWorker diskWrite;
    public final CrashlyticsWorker network;

    public CrashlyticsWorkers(ExecutorService executorService, ExecutorService executorService2) {
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(executorService2, "");
        this.common = new CrashlyticsWorker(executorService);
        this.diskWrite = new CrashlyticsWorker(executorService);
        this.dataCollect = new CrashlyticsWorker(executorService);
        this.network = new CrashlyticsWorker(executorService2);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ+\u0010\u0011\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0006*\u00020\u000f0\u000f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u0016\u001a\u00020\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/google/firebase/crashlytics/internal/concurrency/CrashlyticsWorkers$Companion;", "", "<init>", "()V", "", "checkNotMainThread", "checkBlockingThread", "checkBackgroundThread", "", "isNotMainThread", "()Z", "isBlockingThread", "isBackgroundThread", "Lkotlin/Function0;", "p0", "", "p1", "checkThread", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getThreadName", "()Ljava/lang/String;", "threadName", "enforcement", "Z", "getEnforcement", "setEnforcement", "(Z)V", "getEnforcement$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static int TuitionPaymentFragmentbindingInflater1;
        public static int b;

        @JvmStatic
        public static /* synthetic */ void getEnforcement$annotations() {
        }

        private Companion() {
        }

        private final String getThreadName() {
            return Thread.currentThread().getName();
        }

        public final boolean getEnforcement() {
            return CrashlyticsWorkers.enforcement;
        }

        public final void setEnforcement(boolean z) {
            CrashlyticsWorkers.enforcement = z;
        }

        @JvmStatic
        public final void checkNotMainThread() {
            checkThread(new CrashlyticsWorkers$Companion$checkNotMainThread$1(this), new Function0() { // from class: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CrashlyticsWorkers.Companion.checkNotMainThread$lambda$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String checkNotMainThread$lambda$0() {
            StringBuilder sb = new StringBuilder("Must not be called on a main thread, was called on ");
            sb.append(CrashlyticsWorkers.INSTANCE.getThreadName());
            sb.append('.');
            return sb.toString();
        }

        @JvmStatic
        public final void checkBlockingThread() {
            checkThread(new CrashlyticsWorkers$Companion$checkBlockingThread$1(this), new Function0() { // from class: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CrashlyticsWorkers.Companion.checkBlockingThread$lambda$1();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String checkBlockingThread$lambda$1() {
            StringBuilder sb = new StringBuilder("Must be called on a blocking thread, was called on ");
            sb.append(CrashlyticsWorkers.INSTANCE.getThreadName());
            sb.append('.');
            return sb.toString();
        }

        @JvmStatic
        public final void checkBackgroundThread() {
            checkThread(new CrashlyticsWorkers$Companion$checkBackgroundThread$1(this), new Function0() { // from class: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CrashlyticsWorkers.Companion.checkBackgroundThread$lambda$2();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String checkBackgroundThread$lambda$2() {
            StringBuilder sb = new StringBuilder("Must be called on a background thread, was called on ");
            sb.append(CrashlyticsWorkers.INSTANCE.getThreadName());
            sb.append('.');
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isNotMainThread() {
            return !Looper.getMainLooper().isCurrentThread();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isBlockingThread() {
            String threadName = getThreadName();
            Intrinsics.checkNotNullExpressionValue(threadName, "");
            return StringsKt.contains$default((CharSequence) threadName, (CharSequence) "Firebase Blocking Thread #", false, 2, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isBackgroundThread() {
            String threadName = getThreadName();
            Intrinsics.checkNotNullExpressionValue(threadName, "");
            return StringsKt.contains$default((CharSequence) threadName, (CharSequence) "Firebase Background Thread #", false, 2, (Object) null);
        }

        private final void checkThread(Function0<Boolean> p0, Function0<String> p1) {
            if (p0.invoke().booleanValue()) {
                return;
            }
            Logger.getLogger().d(p1.invoke());
            getEnforcement();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            int i = b;
            int i2 = i % 5821943;
            b = i + 1;
            if (i2 != 0) {
                return TuitionPaymentFragmentbindingInflater1;
            }
            int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            TuitionPaymentFragmentbindingInflater1 = i3;
            return i3;
        }
    }

    @JvmStatic
    public static final void checkBackgroundThread() {
        INSTANCE.checkBackgroundThread();
    }

    @JvmStatic
    public static final void checkBlockingThread() {
        INSTANCE.checkBlockingThread();
    }

    @JvmStatic
    public static final void checkNotMainThread() {
        INSTANCE.checkNotMainThread();
    }

    public static final boolean getEnforcement() {
        return INSTANCE.getEnforcement();
    }

    public static final void setEnforcement(boolean z) {
        INSTANCE.setEnforcement(z);
    }
}
