package kotlin.time;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a2\u0010\u0004\u001a\u00020\u0003*\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0004\u0010\u0007\u001a2\u0010\u0004\u001a\u00020\u0003*\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0004\u0010\t\u001a:\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\f\u0010\r\u001a>\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n*\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\f\u0010\u000e\u001a>\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n*\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\f\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function0;", "", "p0", "Lkotlin/time/Duration;", "measureTime", "(Lkotlin/jvm/functions/Function0;)J", "Lkotlin/time/TimeSource;", "(Lkotlin/time/TimeSource;Lkotlin/jvm/functions/Function0;)J", "Lkotlin/time/TimeSource$Monotonic;", "(Lkotlin/time/TimeSource$Monotonic;Lkotlin/jvm/functions/Function0;)J", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/time/TimedValue;", "measureTimedValue", "(Lkotlin/jvm/functions/Function0;)Lkotlin/time/TimedValue;", "(Lkotlin/time/TimeSource;Lkotlin/jvm/functions/Function0;)Lkotlin/time/TimedValue;", "(Lkotlin/time/TimeSource$Monotonic;Lkotlin/jvm/functions/Function0;)Lkotlin/time/TimedValue;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MeasureTimeKt {
    public static final long measureTime(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        long jM9489markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m9489markNowz9LOYto();
        function0.invoke();
        return TimeSource.Monotonic.ValueTimeMark.m9494elapsedNowUwyO8pc(jM9489markNowz9LOYto);
    }

    public static final long measureTime(TimeSource timeSource, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(timeSource, "");
        Intrinsics.checkNotNullParameter(function0, "");
        TimeMark timeMarkMarkNow = timeSource.markNow();
        function0.invoke();
        return timeMarkMarkNow.mo9364elapsedNowUwyO8pc();
    }

    public static final long measureTime(TimeSource.Monotonic monotonic, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(monotonic, "");
        Intrinsics.checkNotNullParameter(function0, "");
        long jM9489markNowz9LOYto = monotonic.m9489markNowz9LOYto();
        function0.invoke();
        return TimeSource.Monotonic.ValueTimeMark.m9494elapsedNowUwyO8pc(jM9489markNowz9LOYto);
    }

    public static final <T> TimedValue<T> measureTimedValue(Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        return new TimedValue<>(function0.invoke(), TimeSource.Monotonic.ValueTimeMark.m9494elapsedNowUwyO8pc(TimeSource.Monotonic.INSTANCE.m9489markNowz9LOYto()), null);
    }

    public static final <T> TimedValue<T> measureTimedValue(TimeSource timeSource, Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(timeSource, "");
        Intrinsics.checkNotNullParameter(function0, "");
        return new TimedValue<>(function0.invoke(), timeSource.markNow().mo9364elapsedNowUwyO8pc(), null);
    }

    public static final <T> TimedValue<T> measureTimedValue(TimeSource.Monotonic monotonic, Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(monotonic, "");
        Intrinsics.checkNotNullParameter(function0, "");
        return new TimedValue<>(function0.invoke(), TimeSource.Monotonic.ValueTimeMark.m9494elapsedNowUwyO8pc(monotonic.m9489markNowz9LOYto()), null);
    }
}
