package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.widget.RemoteViews;
import defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal;
import defpackage.onConnected;
import defpackage.onProgressUpdate;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomTabsSession {
    private static final String TAG = "CustomTabsSession";
    static final String TARGET_ORIGIN_KEY = "target_origin";
    private final onConnected mCallback;
    private final ComponentName mComponentName;
    private final PendingIntent mId;
    private final Object mLock = new Object();
    private final MediaBrowserCompatConnectionCallbackConnectionCallbackInternal mService;

    /* JADX INFO: loaded from: classes5.dex */
    static class MockSession extends MediaBrowserCompatConnectionCallbackConnectionCallbackInternal.b {
        @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
        public Bundle extraCommand(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
        public boolean isEngagementSignalsApiAvailable(onConnected onconnected, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
        public boolean mayLaunchUrl(onConnected onconnected, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
            return false;
        }

        @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
        public boolean newSession(onConnected onconnected) throws RemoteException {
            return false;
        }

        @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
        public boolean newSessionWithExtras(onConnected onconnected, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
        public int postMessage(onConnected onconnected, String str, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
        public boolean receiveFile(onConnected onconnected, Uri uri, int i, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
        public boolean requestPostMessageChannel(onConnected onconnected, Uri uri) throws RemoteException {
            return false;
        }

        @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
        public boolean requestPostMessageChannelWithExtras(onConnected onconnected, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
        public boolean setEngagementSignalsCallback(onConnected onconnected, IBinder iBinder, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
        public boolean updateVisuals(onConnected onconnected, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
        public boolean validateRelationship(onConnected onconnected, int i, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
        public boolean warmup(long j) throws RemoteException {
            return false;
        }
    }

    public static CustomTabsSession createMockSessionForTesting(ComponentName componentName) {
        return new CustomTabsSession(new MockSession(), new CustomTabsSessionToken.MockCallback(), componentName, null);
    }

    CustomTabsSession(MediaBrowserCompatConnectionCallbackConnectionCallbackInternal mediaBrowserCompatConnectionCallbackConnectionCallbackInternal, onConnected onconnected, ComponentName componentName, PendingIntent pendingIntent) {
        this.mService = mediaBrowserCompatConnectionCallbackConnectionCallbackInternal;
        this.mCallback = onconnected;
        this.mComponentName = componentName;
        this.mId = pendingIntent;
    }

    public final boolean mayLaunchUrl(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.mService.mayLaunchUrl(this.mCallback, uri, createBundleWithId(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final boolean setActionButton(Bitmap bitmap, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final boolean setSecondaryToolbarViews(RemoteViews remoteViews, int[] iArr, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.EXTRA_REMOTEVIEWS, remoteViews);
        bundle.putIntArray(CustomTabsIntent.EXTRA_REMOTEVIEWS_VIEW_IDS, iArr);
        bundle.putParcelable(CustomTabsIntent.EXTRA_REMOTEVIEWS_PENDINGINTENT, pendingIntent);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final boolean setSecondaryToolbarSwipeUpGesture(PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE, pendingIntent);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Deprecated
    public final boolean setToolbarItem(int i, Bitmap bitmap, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(CustomTabsIntent.KEY_ID, i);
        bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        addIdToBundle(bundle2);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final boolean requestPostMessageChannel(Uri uri) {
        return requestPostMessageChannel(uri, null, new Bundle());
    }

    public final boolean requestPostMessageChannel(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle bundleCreatePostMessageExtraBundle = createPostMessageExtraBundle(uri2);
            if (bundleCreatePostMessageExtraBundle != null) {
                bundle.putAll(bundleCreatePostMessageExtraBundle);
                return this.mService.requestPostMessageChannelWithExtras(this.mCallback, uri, bundle);
            }
            return this.mService.requestPostMessageChannel(this.mCallback, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final int postMessage(String str, Bundle bundle) {
        int iPostMessage;
        Bundle bundleCreateBundleWithId = createBundleWithId(bundle);
        synchronized (this.mLock) {
            try {
                iPostMessage = this.mService.postMessage(this.mCallback, str, bundleCreateBundleWithId);
            } catch (RemoteException unused) {
                return -2;
            }
        }
        return iPostMessage;
    }

    public final boolean validateRelationship(int i, Uri uri, Bundle bundle) {
        if (i <= 0 || i > 2) {
            return false;
        }
        try {
            return this.mService.validateRelationship(this.mCallback, i, uri, createBundleWithId(bundle));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final boolean receiveFile(Uri uri, int i, Bundle bundle) {
        try {
            return this.mService.receiveFile(this.mCallback, uri, i, createBundleWithId(bundle));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final boolean isEngagementSignalsApiAvailable(Bundle bundle) throws RemoteException {
        try {
            return this.mService.isEngagementSignalsApiAvailable(this.mCallback, createBundleWithId(bundle));
        } catch (SecurityException e2) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e2);
        }
    }

    public final boolean setEngagementSignalsCallback(EngagementSignalsCallback engagementSignalsCallback, Bundle bundle) throws RemoteException {
        try {
            return this.mService.setEngagementSignalsCallback(this.mCallback, createEngagementSignalsCallbackWrapper(engagementSignalsCallback).asBinder(), createBundleWithId(bundle));
        } catch (SecurityException e2) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e2);
        }
    }

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsSession$1, reason: invalid class name */
    class AnonymousClass1 extends onProgressUpdate.TuitionPaymentFragmentbindingInflater1 {
        private final Handler mHandler = new Handler(Looper.getMainLooper());
        final /* synthetic */ EngagementSignalsCallback val$callback;

        AnonymousClass1(EngagementSignalsCallback engagementSignalsCallback) {
            this.val$callback = engagementSignalsCallback;
        }

        @Override // defpackage.onProgressUpdate
        public void onVerticalScrollEvent(final boolean z, final Bundle bundle) {
            Handler handler = this.mHandler;
            final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    engagementSignalsCallback.onVerticalScrollEvent(z, bundle);
                }
            });
        }

        @Override // defpackage.onProgressUpdate
        public void onGreatestScrollPercentageIncreased(final int i, final Bundle bundle) {
            Handler handler = this.mHandler;
            final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    engagementSignalsCallback.onGreatestScrollPercentageIncreased(i, bundle);
                }
            });
        }

        @Override // defpackage.onProgressUpdate
        public void onSessionEnded(final boolean z, final Bundle bundle) {
            Handler handler = this.mHandler;
            final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    engagementSignalsCallback.onSessionEnded(z, bundle);
                }
            });
        }
    }

    private onProgressUpdate.TuitionPaymentFragmentbindingInflater1 createEngagementSignalsCallbackWrapper(EngagementSignalsCallback engagementSignalsCallback) {
        return new AnonymousClass1(engagementSignalsCallback);
    }

    public final boolean setEngagementSignalsCallback(Executor executor, EngagementSignalsCallback engagementSignalsCallback, Bundle bundle) throws RemoteException {
        try {
            return this.mService.setEngagementSignalsCallback(this.mCallback, createEngagementSignalsCallbackWrapper(engagementSignalsCallback, executor).asBinder(), createBundleWithId(bundle));
        } catch (SecurityException e2) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e2);
        }
    }

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsSession$2, reason: invalid class name */
    class AnonymousClass2 extends onProgressUpdate.TuitionPaymentFragmentbindingInflater1 {
        private final Executor mExecutor;
        final /* synthetic */ EngagementSignalsCallback val$callback;
        final /* synthetic */ Executor val$executor;

        AnonymousClass2(Executor executor, EngagementSignalsCallback engagementSignalsCallback) {
            this.val$executor = executor;
            this.val$callback = engagementSignalsCallback;
            this.mExecutor = executor;
        }

        @Override // defpackage.onProgressUpdate
        public void onVerticalScrollEvent(final boolean z, final Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.mExecutor;
                final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
                executor.execute(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        engagementSignalsCallback.onVerticalScrollEvent(z, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // defpackage.onProgressUpdate
        public void onGreatestScrollPercentageIncreased(final int i, final Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.mExecutor;
                final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
                executor.execute(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$2$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        engagementSignalsCallback.onGreatestScrollPercentageIncreased(i, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // defpackage.onProgressUpdate
        public void onSessionEnded(final boolean z, final Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.mExecutor;
                final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
                executor.execute(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$2$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        engagementSignalsCallback.onSessionEnded(z, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    private onProgressUpdate.TuitionPaymentFragmentbindingInflater1 createEngagementSignalsCallbackWrapper(EngagementSignalsCallback engagementSignalsCallback, Executor executor) {
        return new AnonymousClass2(executor, engagementSignalsCallback);
    }

    private Bundle createPostMessageExtraBundle(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable(TARGET_ORIGIN_KEY, uri);
        }
        if (this.mId != null) {
            addIdToBundle(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    private Bundle createBundleWithId(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        addIdToBundle(bundle2);
        return bundle2;
    }

    private void addIdToBundle(Bundle bundle) {
        PendingIntent pendingIntent = this.mId;
        if (pendingIntent != null) {
            bundle.putParcelable(CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
        }
    }

    final IBinder getBinder() {
        return this.mCallback.asBinder();
    }

    final ComponentName getComponentName() {
        return this.mComponentName;
    }

    final PendingIntent getId() {
        return this.mId;
    }

    public static class PendingSession {
        private final CustomTabsCallback mCallback;
        private final PendingIntent mId;

        PendingSession(CustomTabsCallback customTabsCallback, PendingIntent pendingIntent) {
            this.mCallback = customTabsCallback;
            this.mId = pendingIntent;
        }

        PendingIntent getId() {
            return this.mId;
        }

        CustomTabsCallback getCallback() {
            return this.mCallback;
        }
    }
}
