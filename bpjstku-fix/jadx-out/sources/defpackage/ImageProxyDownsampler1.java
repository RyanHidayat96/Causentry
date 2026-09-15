package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageProxyDownsampler1 {
    public static final String TuitionPaymentFragmentbindingInflater1(Thread.State state) {
        Intrinsics.checkNotNullParameter(state, "");
        switch (ImageProxyDownsampler1$TuitionPaymentFragmentspecialinlinedviewModeldefault3$WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                return "new";
            case 2:
                return "blocked";
            case 3:
                return "runnable";
            case 4:
                return "terminated";
            case 5:
                return "timed_waiting";
            case 6:
                return "waiting";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
