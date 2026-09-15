package defpackage;

import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleObserver;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.OnLifecycleEvent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class getBackpressureStrategy implements getImageQueueDepth, LifecycleObserver {
    private final Lifecycle TuitionPaymentFragmentbindingInflater1;
    private final Set<getDefaultConfig> b = new HashSet();

    getBackpressureStrategy(Lifecycle lifecycle) {
        this.TuitionPaymentFragmentbindingInflater1 = lifecycle;
        lifecycle.addObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart(LifecycleOwner lifecycleOwner) {
        Iterator it = getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b).iterator();
        while (it.hasNext()) {
            ((getDefaultConfig) it.next()).onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop(LifecycleOwner lifecycleOwner) {
        Iterator it = getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b).iterator();
        while (it.hasNext()) {
            ((getDefaultConfig) it.next()).onStop();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        Iterator it = getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b).iterator();
        while (it.hasNext()) {
            ((getDefaultConfig) it.next()).onDestroy();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @Override // defpackage.getImageQueueDepth
    public final void TuitionPaymentFragmentbindingInflater1(getDefaultConfig getdefaultconfig) {
        this.b.add(getdefaultconfig);
        if (this.TuitionPaymentFragmentbindingInflater1.getState() == Lifecycle.State.DESTROYED) {
            getdefaultconfig.onDestroy();
        } else if (this.TuitionPaymentFragmentbindingInflater1.getState().isAtLeast(Lifecycle.State.STARTED)) {
            getdefaultconfig.onStart();
        } else {
            getdefaultconfig.onStop();
        }
    }

    @Override // defpackage.getImageQueueDepth
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(getDefaultConfig getdefaultconfig) {
        this.b.remove(getdefaultconfig);
    }
}
