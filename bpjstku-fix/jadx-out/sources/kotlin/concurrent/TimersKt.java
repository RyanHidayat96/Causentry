package kotlin.concurrent;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\t\u001a:\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a:\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\n2\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000b\u001aB\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0019\b\u0004\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\r\u001aB\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00012\u0019\b\u0004\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000e\u001aB\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0019\b\u0004\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\r\u001aB\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00012\u0019\b\u0004\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a!\u0010\u0012\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aV\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0007\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\u0019\b\u0004\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0016\u001aT\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0007\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00012\u0019\b\u0004\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0017\u001aV\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0007\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\u0019\b\u0004\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016\u001aT\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0007\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00012\u0019\b\u0004\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017\u001a.\u0010\u0019\u001a\u00020\u00042\u0019\b\u0004\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Ljava/util/Timer;", "", "p0", "Lkotlin/Function1;", "Ljava/util/TimerTask;", "", "Lkotlin/ExtensionFunctionType;", "p1", "schedule", "(Ljava/util/Timer;JLkotlin/jvm/functions/Function1;)Ljava/util/TimerTask;", "Ljava/util/Date;", "(Ljava/util/Timer;Ljava/util/Date;Lkotlin/jvm/functions/Function1;)Ljava/util/TimerTask;", "p2", "(Ljava/util/Timer;JJLkotlin/jvm/functions/Function1;)Ljava/util/TimerTask;", "(Ljava/util/Timer;Ljava/util/Date;JLkotlin/jvm/functions/Function1;)Ljava/util/TimerTask;", "scheduleAtFixedRate", "", "", "timer", "(Ljava/lang/String;Z)Ljava/util/Timer;", "p3", "p4", "(Ljava/lang/String;ZJJLkotlin/jvm/functions/Function1;)Ljava/util/Timer;", "(Ljava/lang/String;ZLjava/util/Date;JLkotlin/jvm/functions/Function1;)Ljava/util/Timer;", "fixedRateTimer", "timerTask", "(Lkotlin/jvm/functions/Function1;)Ljava/util/TimerTask;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TimersKt {
    private static final TimerTask schedule(Timer timer, long j, Function1<? super TimerTask, Unit> function1) {
        Intrinsics.checkNotNullParameter(timer, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(function1);
        timer.schedule(anonymousClass1, j);
        return anonymousClass1;
    }

    private static final TimerTask schedule(Timer timer, Date date, Function1<? super TimerTask, Unit> function1) {
        Intrinsics.checkNotNullParameter(timer, "");
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(function1);
        timer.schedule(anonymousClass1, date);
        return anonymousClass1;
    }

    private static final TimerTask schedule(Timer timer, long j, long j2, Function1<? super TimerTask, Unit> function1) {
        Intrinsics.checkNotNullParameter(timer, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(function1);
        timer.schedule(anonymousClass1, j, j2);
        return anonymousClass1;
    }

    private static final TimerTask schedule(Timer timer, Date date, long j, Function1<? super TimerTask, Unit> function1) {
        Intrinsics.checkNotNullParameter(timer, "");
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(function1);
        timer.schedule(anonymousClass1, date, j);
        return anonymousClass1;
    }

    private static final TimerTask scheduleAtFixedRate(Timer timer, long j, long j2, Function1<? super TimerTask, Unit> function1) {
        Intrinsics.checkNotNullParameter(timer, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(function1);
        timer.scheduleAtFixedRate(anonymousClass1, j, j2);
        return anonymousClass1;
    }

    private static final TimerTask scheduleAtFixedRate(Timer timer, Date date, long j, Function1<? super TimerTask, Unit> function1) {
        Intrinsics.checkNotNullParameter(timer, "");
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(function1);
        timer.scheduleAtFixedRate(anonymousClass1, date, j);
        return anonymousClass1;
    }

    public static final Timer timer(String str, boolean z) {
        return str == null ? new Timer(z) : new Timer(str, z);
    }

    static /* synthetic */ Timer timer$default(String str, boolean z, long j, long j2, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Timer timer = timer(str, z);
        timer.schedule(new AnonymousClass1(function1), j, j2);
        return timer;
    }

    private static final Timer timer(String str, boolean z, long j, long j2, Function1<? super TimerTask, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Timer timer = timer(str, z);
        timer.schedule(new AnonymousClass1(function1), j, j2);
        return timer;
    }

    static /* synthetic */ Timer timer$default(String str, boolean z, Date date, long j, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Timer timer = timer(str, z);
        timer.schedule(new AnonymousClass1(function1), date, j);
        return timer;
    }

    private static final Timer timer(String str, boolean z, Date date, long j, Function1<? super TimerTask, Unit> function1) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Timer timer = timer(str, z);
        timer.schedule(new AnonymousClass1(function1), date, j);
        return timer;
    }

    static /* synthetic */ Timer fixedRateTimer$default(String str, boolean z, long j, long j2, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Timer timer = timer(str, z);
        timer.scheduleAtFixedRate(new AnonymousClass1(function1), j, j2);
        return timer;
    }

    private static final Timer fixedRateTimer(String str, boolean z, long j, long j2, Function1<? super TimerTask, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Timer timer = timer(str, z);
        timer.scheduleAtFixedRate(new AnonymousClass1(function1), j, j2);
        return timer;
    }

    static /* synthetic */ Timer fixedRateTimer$default(String str, boolean z, Date date, long j, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Timer timer = timer(str, z);
        timer.scheduleAtFixedRate(new AnonymousClass1(function1), date, j);
        return timer;
    }

    private static final Timer fixedRateTimer(String str, boolean z, Date date, long j, Function1<? super TimerTask, Unit> function1) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Timer timer = timer(str, z);
        timer.scheduleAtFixedRate(new AnonymousClass1(function1), date, j);
        return timer;
    }

    /* JADX INFO: renamed from: kotlin.concurrent.TimersKt$timerTask$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/concurrent/TimersKt$timerTask$1;", "Ljava/util/TimerTask;", "", "run", "()V"}, k = 1, mv = {2, 1, 0}, xi = 176)
    public static final class AnonymousClass1 extends TimerTask {
        final /* synthetic */ Function1<TimerTask, Unit> $action;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super TimerTask, Unit> function1) {
            this.$action = function1;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            this.$action.invoke(this);
        }
    }

    private static final TimerTask timerTask(Function1<? super TimerTask, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return new AnonymousClass1(function1);
    }
}
