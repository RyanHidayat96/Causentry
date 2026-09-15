package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class Image2Bitmap implements Application.ActivityLifecycleCallbacks {
    private final ImageCaptureControl TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Set<Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new HashSet();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public Image2Bitmap(ImageCaptureControl imageCaptureControl) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = imageCaptureControl;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remove(Integer.valueOf(System.identityHashCode(activity)));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int iIdentityHashCode = System.identityHashCode(activity);
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.contains(Integer.valueOf(iIdentityHashCode))) {
            return;
        }
        ImageCaptureControl imageCaptureControl = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Window window = activity.getWindow();
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new CaptureNodeIn1();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<createRequests> it = imageCaptureControl.TuitionPaymentFragmentbindingInflater1.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        window.setCallback(new extractExif(callback, new processYuvImage(arrayList, arrayList2)));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(Integer.valueOf(iIdentityHashCode));
    }
}
