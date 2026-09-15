package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class CameraMode {
    private static final Map cancelAll = new HashMap();
    ServiceConnection INotificationSideChannel;
    final CameraInfoInternal TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f111a;
    final Intent asInterface;
    final Context b;
    public IInterface notify;
    final List TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList();
    public final Set TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new HashSet();
    public final Object g = new Object();
    final IBinder.DeathRecipient d = new IBinder.DeathRecipient() { // from class: CameraInternalState
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            CameraMode cameraMode = this.TuitionPaymentFragmentbindingInflater1;
            CameraInfoInternal cameraInfoInternal = cameraMode.TuitionPaymentFragmentbindingInflater1;
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 4)) {
                CameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "reportBinderDeath", objArr);
            }
            if (((CameraInfoInternalExternalSyntheticLambda0) cameraMode.asBinder.get()) != null) {
                CameraInfoInternal cameraInfoInternal2 = cameraMode.TuitionPaymentFragmentbindingInflater1;
                Object[] objArr2 = new Object[0];
                if (Log.isLoggable("PlayCore", 4)) {
                    CameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cameraInfoInternal2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "calling onBinderDied", objArr2);
                }
            } else {
                CameraInfoInternal cameraInfoInternal3 = cameraMode.TuitionPaymentFragmentbindingInflater1;
                Object[] objArr3 = {cameraMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3};
                if (Log.isLoggable("PlayCore", 4)) {
                    CameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cameraInfoInternal3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "%s : Binder has died.", objArr3);
                }
                for (CameraFilters cameraFilters : cameraMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    RemoteException remoteException = new RemoteException(String.valueOf(cameraMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource = cameraFilters.TuitionPaymentFragmentbindingInflater1;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(remoteException);
                    }
                }
                cameraMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2.clear();
            }
            synchronized (cameraMode.g) {
                cameraMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        }
    };
    final AtomicInteger onTransact = new AtomicInteger(0);
    final String TuitionPaymentFragmentspecialinlinedviewModeldefault3 = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    final WeakReference asBinder = new WeakReference(null);

    public CameraMode(Context context, CameraInfoInternal cameraInfoInternal, Intent intent) {
        this.b = context;
        this.TuitionPaymentFragmentbindingInflater1 = cameraInfoInternal;
        this.asInterface = intent;
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        Iterator it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3).concat(" : Binder has died.")));
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.clear();
    }

    public final Handler b() {
        Handler handler;
        Map map = cancelAll;
        synchronized (map) {
            if (!map.containsKey(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                HandlerThread handlerThread = new HandlerThread(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, 10);
                handlerThread.start();
                map.put(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return handler;
    }
}
