package kotlin.time;

import kotlin.Metadata;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\b\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u0012\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlin/time/Instant;", "systemClockNow", "()Lkotlin/time/Instant;", "p0", "", "serializedInstant", "(Lkotlin/time/Instant;)Ljava/lang/Object;", "Lkotlin/time/Clock;", "systemClock", "Lkotlin/time/Clock;", "getSystemClock$annotations", "()V"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class InstantJvmKt {
    private static final Clock systemClock = PlatformImplementationsKt.IMPLEMENTATIONS.getSystemClock();

    private static /* synthetic */ void getSystemClock$annotations() {
    }

    public static final Instant systemClockNow() {
        return systemClock.now();
    }

    public static final Object serializedInstant(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "");
        return new InstantSerialized(instant.getEpochSeconds(), instant.getNanosecondsOfSecond());
    }
}
