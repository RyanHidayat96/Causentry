package com.datadog.android.core.internal.thread;

import androidx.exifinterface.media.ExifInterface;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.configuration.BackPressureMitigation;
import defpackage.lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\r\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/datadog/android/core/internal/thread/BackPressuredBlockingQueue;", "", ExifInterface.LONGITUDE_EAST, "Ljava/util/concurrent/LinkedBlockingQueue;", "Lcom/datadog/android/api/InternalLogger;", "p0", "", "p1", "Llambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy;", "p2", "<init>", "(Lcom/datadog/android/api/InternalLogger;Ljava/lang/String;Llambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy;)V", "", "offer", "(Ljava/lang/Object;)Z", "", "Ljava/util/concurrent/TimeUnit;", "(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Z", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/Object;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()V", "backPressureStrategy", "Llambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy;", "executorContext", "Ljava/lang/String;", "logger", "Lcom/datadog/android/api/InternalLogger;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class BackPressuredBlockingQueue<E> extends LinkedBlockingQueue<E> {
    private final lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy backPressureStrategy;
    private final String executorContext;
    private final InternalLogger logger;

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BackPressureMitigation.values().length];
            try {
                iArr[BackPressureMitigation.DROP_OLDEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BackPressureMitigation.IGNORE_NEWEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
    public final boolean offer(E p0) throws InterruptedException {
        Intrinsics.checkNotNullParameter(p0, "");
        Function1<E, Boolean> function1 = new Function1<E, Boolean>(this) { // from class: com.datadog.android.core.internal.thread.BackPressuredBlockingQueue.offer.1
            final /* synthetic */ BackPressuredBlockingQueue<E> this$0;

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(E e2) {
                Intrinsics.checkNotNullParameter(e2, "");
                return Boolean.valueOf(BackPressuredBlockingQueue.super.offer(e2));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }
        };
        int iRemainingCapacity = remainingCapacity();
        if (iRemainingCapacity == 0) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.backPressureStrategy.b.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0);
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
            E eTake = take();
            Intrinsics.checkNotNullExpressionValue(eTake, "");
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(eTake);
        } else if (iRemainingCapacity == 1) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        return function1.invoke(p0).booleanValue();
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.concurrent.BlockingQueue
    public final boolean offer(E p0, long p1, TimeUnit p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (!super.offer(p0, p1, p2)) {
            return offer(p0);
        }
        if (remainingCapacity() != 0) {
            return true;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return true;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        this.backPressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3.invoke();
        this.logger.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.WARN, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>(this) { // from class: com.datadog.android.core.internal.thread.BackPressuredBlockingQueue$onThresholdReached$1
            final /* synthetic */ BackPressuredBlockingQueue<E> this$0;

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "BackPressuredBlockingQueue reached capacity:".concat(String.valueOf(((BackPressuredBlockingQueue) this.this$0).backPressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }
        }, null, false, MapsKt.mapOf(TuplesKt.to("backpressure.capacity", Integer.valueOf(this.backPressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2)), TuplesKt.to("executor.context", this.executorContext)));
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final E p0) {
        this.backPressureStrategy.TuitionPaymentFragmentbindingInflater1.invoke(p0);
        this.logger.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.thread.BackPressuredBlockingQueue$onItemDropped$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Dropped item in BackPressuredBlockingQueue queue: ".concat(String.valueOf(p0));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, null, false, MapsKt.mapOf(TuplesKt.to("backpressure.capacity", Integer.valueOf(this.backPressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2)), TuplesKt.to("executor.context", this.executorContext)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackPressuredBlockingQueue(InternalLogger internalLogger, String str, lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy) {
        super(lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        Intrinsics.checkNotNullParameter(internalLogger, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy, "");
        this.logger = internalLogger;
        this.executorContext = str;
        this.backPressureStrategy = lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy;
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return super.size();
    }
}
