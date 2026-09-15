package androidx.p002lifecycle;

import defpackage.EncoderImpl;
import defpackage.clampVideoBitrateIfNotSupported;
import defpackage.getDataSpace;
import defpackage.lambdaaddSignalEosTimeoutIfNeeded9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/LifecycleCoroutineScope;", "getCoroutineScope", "(Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/LifecycleCoroutineScope;", "coroutineScope", "LclampVideoBitrateIfNotSupported;", "Landroidx/lifecycle/Lifecycle$Event;", "getEventFlow", "(Landroidx/lifecycle/Lifecycle;)LclampVideoBitrateIfNotSupported;", "eventFlow"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LifecycleKt {
    public static final LifecycleCoroutineScope getCoroutineScope(Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        Intrinsics.checkNotNullParameter(lifecycle, "");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.getInternalScopeRef().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, new getDataSpace(null).plus(Dispatchers.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2()));
        } while (!lifecycle.getInternalScopeRef().compareAndSet(null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.register();
        return lifecycleCoroutineScopeImpl;
    }

    public static final clampVideoBitrateIfNotSupported<Lifecycle.Event> getEventFlow(Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "");
        return lambdaaddSignalEosTimeoutIfNeeded9.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new EncoderImpl(new LifecycleKt$eventFlow$1(lifecycle, null), null, 0, null, 14, null), Dispatchers.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }
}
