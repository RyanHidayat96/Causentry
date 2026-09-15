package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class onSuggestedStreamSpecImplementationOptionsUpdated implements getDefaultConfig {
    public final Set<setDefaultResolution<?>> b = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.getDefaultConfig
    public final void onStart() {
        Iterator it = getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b).iterator();
        while (it.hasNext()) {
            ((setDefaultResolution) it.next()).onStart();
        }
    }

    @Override // defpackage.getDefaultConfig
    public final void onStop() {
        Iterator it = getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b).iterator();
        while (it.hasNext()) {
            ((setDefaultResolution) it.next()).onStop();
        }
    }

    @Override // defpackage.getDefaultConfig
    public final void onDestroy() {
        Iterator it = getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b).iterator();
        while (it.hasNext()) {
            ((setDefaultResolution) it.next()).onDestroy();
        }
    }
}
