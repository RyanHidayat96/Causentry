package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
final class notifyOnImageCloseListeners implements getImageQueueDepth {
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Set<getDefaultConfig> b = Collections.newSetFromMap(new WeakHashMap());

    notifyOnImageCloseListeners() {
    }

    @Override // defpackage.getImageQueueDepth
    public final void TuitionPaymentFragmentbindingInflater1(getDefaultConfig getdefaultconfig) {
        this.b.add(getdefaultconfig);
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getdefaultconfig.onDestroy();
        } else if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            getdefaultconfig.onStart();
        } else {
            getdefaultconfig.onStop();
        }
    }

    @Override // defpackage.getImageQueueDepth
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(getDefaultConfig getdefaultconfig) {
        this.b.remove(getdefaultconfig);
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        Iterator it = getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b).iterator();
        while (it.hasNext()) {
            ((getDefaultConfig) it.next()).onStart();
        }
    }

    final void b() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
        Iterator it = getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b).iterator();
        while (it.hasNext()) {
            ((getDefaultConfig) it.next()).onStop();
        }
    }

    final void TuitionPaymentFragmentbindingInflater1() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        Iterator it = getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b).iterator();
        while (it.hasNext()) {
            ((getDefaultConfig) it.next()).onDestroy();
        }
    }
}
