package defpackage;

import android.os.Process;
import com.bumptech.glide.load.engine.Resource;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
final class CameraExecutorExternalSyntheticLambda0 {
    final ReferenceQueue<addCameraFilter<?>> TuitionPaymentFragmentbindingInflater1;
    addCameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    volatile TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final Map<getCameraControl, TuitionPaymentFragmentbindingInflater1> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Executor asInterface;
    volatile boolean b;
    private final boolean d;

    interface TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
    }

    CameraExecutorExternalSyntheticLambda0(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: CameraExecutorExternalSyntheticLambda0.5
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return new Thread(new Runnable() { // from class: CameraExecutorExternalSyntheticLambda0.5.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        Process.setThreadPriority(10);
                        runnable.run();
                    }
                }, "glide-active-resources");
            }
        }));
    }

    private CameraExecutorExternalSyntheticLambda0(boolean z, Executor executor) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new HashMap();
        this.TuitionPaymentFragmentbindingInflater1 = new ReferenceQueue<>();
        this.d = z;
        this.asInterface = executor;
        executor.execute(new Runnable() { // from class: CameraExecutorExternalSyntheticLambda0.4
            @Override // java.lang.Runnable
            public final void run() {
                CameraExecutorExternalSyntheticLambda0 cameraExecutorExternalSyntheticLambda0 = CameraExecutorExternalSyntheticLambda0.this;
                while (true) {
                    boolean z2 = cameraExecutorExternalSyntheticLambda0.b;
                    try {
                        cameraExecutorExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1((TuitionPaymentFragmentbindingInflater1) cameraExecutorExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1.remove());
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = cameraExecutorExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(getCameraControl getcameracontrol, addCameraFilter<?> addcamerafilter) {
        synchronized (this) {
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1Put = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.put(getcameracontrol, new TuitionPaymentFragmentbindingInflater1(getcameracontrol, addcamerafilter, this.TuitionPaymentFragmentbindingInflater1, this.d));
            if (tuitionPaymentFragmentbindingInflater1Put != null) {
                tuitionPaymentFragmentbindingInflater1Put.TuitionPaymentFragmentbindingInflater1 = null;
                tuitionPaymentFragmentbindingInflater1Put.clear();
            }
        }
    }

    final addCameraFilter<?> TuitionPaymentFragmentspecialinlinedviewModeldefault1(getCameraControl getcameracontrol) {
        synchronized (this) {
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(getcameracontrol);
            if (tuitionPaymentFragmentbindingInflater1 == null) {
                return null;
            }
            addCameraFilter<?> addcamerafilter = tuitionPaymentFragmentbindingInflater1.get();
            if (addcamerafilter == null) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater1);
            }
            return addcamerafilter;
        }
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        synchronized (this) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remove(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            if (!tuitionPaymentFragmentbindingInflater1.b || tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 == null) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3, new addCameraFilter<>(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1, true, false, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
        }
    }

    static final class TuitionPaymentFragmentbindingInflater1 extends WeakReference<addCameraFilter<?>> {
        Resource<?> TuitionPaymentFragmentbindingInflater1;
        final getCameraControl TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final boolean b;

        TuitionPaymentFragmentbindingInflater1(getCameraControl getcameracontrol, addCameraFilter<?> addcamerafilter, ReferenceQueue<? super addCameraFilter<?>> referenceQueue, boolean z) {
            Resource<?> resource;
            super(addcamerafilter, referenceQueue);
            if (getcameracontrol == null) {
                throw new NullPointerException("Argument must not be null");
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getcameracontrol;
            if (addcamerafilter.b && z) {
                resource = addcamerafilter.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (resource == null) {
                    throw new NullPointerException("Argument must not be null");
                }
            } else {
                resource = null;
            }
            this.TuitionPaymentFragmentbindingInflater1 = resource;
            this.b = addcamerafilter.b;
        }
    }
}
