package androidx.browser.customtabs;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import defpackage.MediaBrowserCompatConnectionCallbackStubApi21;
import defpackage.onConnected;

/* JADX INFO: loaded from: classes5.dex */
public class PostMessageService extends Service {
    private MediaBrowserCompatConnectionCallbackStubApi21.b mBinder = new MediaBrowserCompatConnectionCallbackStubApi21.b() { // from class: androidx.browser.customtabs.PostMessageService.1
        @Override // defpackage.MediaBrowserCompatConnectionCallbackStubApi21
        public void onMessageChannelReady(onConnected onconnected, Bundle bundle) throws RemoteException {
            onconnected.onMessageChannelReady(bundle);
        }

        @Override // defpackage.MediaBrowserCompatConnectionCallbackStubApi21
        public void onPostMessage(onConnected onconnected, String str, Bundle bundle) throws RemoteException {
            onconnected.onPostMessage(str, bundle);
        }
    };

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mBinder;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }
}
