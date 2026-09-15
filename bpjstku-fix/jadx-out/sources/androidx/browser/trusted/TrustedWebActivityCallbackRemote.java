package androidx.browser.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import defpackage.MediaBrowserCompatCustomActionCallback;

/* JADX INFO: loaded from: classes5.dex */
public class TrustedWebActivityCallbackRemote {
    private final MediaBrowserCompatCustomActionCallback mCallbackBinder;

    private TrustedWebActivityCallbackRemote(MediaBrowserCompatCustomActionCallback mediaBrowserCompatCustomActionCallback) {
        this.mCallbackBinder = mediaBrowserCompatCustomActionCallback;
    }

    static TrustedWebActivityCallbackRemote fromBinder(IBinder iBinder) {
        MediaBrowserCompatCustomActionCallback mediaBrowserCompatCustomActionCallbackAsInterface = iBinder == null ? null : MediaBrowserCompatCustomActionCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface(iBinder);
        if (mediaBrowserCompatCustomActionCallbackAsInterface == null) {
            return null;
        }
        return new TrustedWebActivityCallbackRemote(mediaBrowserCompatCustomActionCallbackAsInterface);
    }

    public void runExtraCallback(String str, Bundle bundle) throws RemoteException {
        this.mCallbackBinder.onExtraCallback(str, bundle);
    }
}
