package com.google.mlkit.vision.common.internal;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleObserver;
import androidx.p002lifecycle.OnLifecycleEvent;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.vision.common.InputImage;
import defpackage.CameraControlInternal2;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class MobileVisionBase<DetectionResultT> implements Closeable, LifecycleObserver {
    public static final /* synthetic */ int zza = 0;
    private static final GmsLogger zzb = new GmsLogger("MobileVisionBase", "");
    private final AtomicBoolean zzc = new AtomicBoolean(false);
    private final MLTask zzd;
    private final CancellationTokenSource zze;
    private final Executor zzf;
    private final Task zzg;

    public MobileVisionBase(MLTask<DetectionResultT, InputImage> mLTask, Executor executor) {
        this.zzd = mLTask;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.zze = cancellationTokenSource;
        this.zzf = executor;
        mLTask.pin();
        this.zzg = mLTask.callAfterLoad(executor, new Callable() { // from class: com.google.mlkit.vision.common.internal.zzb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = MobileVisionBase.zza;
                return null;
            }
        }, cancellationTokenSource.getToken()).addOnFailureListener(new OnFailureListener() { // from class: com.google.mlkit.vision.common.internal.zzc
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                MobileVisionBase.zzb.e("MobileVisionBase", "Error preloading model resource", exc);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void close() {
        synchronized (this) {
            if (this.zzc.getAndSet(true)) {
                return;
            }
            this.zze.cancel();
            this.zzd.unpin(this.zzf);
        }
    }

    public Task<Void> closeWithTask() {
        synchronized (this) {
            if (this.zzc.getAndSet(true)) {
                return Tasks.forResult(null);
            }
            this.zze.cancel();
            return this.zzd.unpinWithTask(this.zzf);
        }
    }

    public Task<DetectionResultT> process(Bitmap bitmap, int i) {
        return processBase(InputImage.fromBitmap(bitmap, i));
    }

    public Task<DetectionResultT> processBase(CameraControlInternal2 cameraControlInternal2) {
        synchronized (this) {
            Preconditions.checkNotNull(cameraControlInternal2, "MlImage can not be null");
            if (this.zzc.get()) {
                return Tasks.forException(new MlKitException("This detector is already closed!", 14));
            }
            int i = cameraControlInternal2.TuitionPaymentFragmentbindingInflater1;
            return Tasks.forException(new MlKitException("MlImage width and height should be at least 32!", 3));
        }
    }

    final /* synthetic */ Object zza(InputImage inputImage) throws Exception {
        zzkl zzklVarZze = zzkl.zze("detectorTaskWithResource#run");
        zzklVarZze.zzb();
        try {
            Object objRun = this.zzd.run(inputImage);
            zzklVarZze.close();
            return objRun;
        } catch (Throwable th) {
            try {
                zzklVarZze.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    final /* synthetic */ Object zzb(CameraControlInternal2 cameraControlInternal2) throws Exception {
        InputImage inputImageZza = CommonConvertUtils.zza(cameraControlInternal2);
        if (inputImageZza != null) {
            return this.zzd.run(inputImageZza);
        }
        throw new MlKitException("Current type of MlImage is not supported.", 13);
    }

    public Task<DetectionResultT> process(Image image, int i) {
        return processBase(InputImage.fromMediaImage(image, i));
    }

    public Task<DetectionResultT> process(Image image, int i, Matrix matrix) {
        return processBase(InputImage.fromMediaImage(image, i, matrix));
    }

    public Task<DetectionResultT> process(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        return processBase(InputImage.fromByteBuffer(byteBuffer, i, i2, i3, i4));
    }

    public Task<DetectionResultT> processBase(final InputImage inputImage) {
        synchronized (this) {
            Preconditions.checkNotNull(inputImage, "InputImage can not be null");
            if (this.zzc.get()) {
                return Tasks.forException(new MlKitException("This detector is already closed!", 14));
            }
            if (inputImage.getWidth() < 32 || inputImage.getHeight() < 32) {
                return Tasks.forException(new MlKitException("InputImage width and height should be at least 32!", 3));
            }
            return this.zzd.callAfterLoad(this.zzf, new Callable() { // from class: com.google.mlkit.vision.common.internal.zza
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zza(inputImage);
                }
            }, this.zze.getToken());
        }
    }

    public Task<Void> getInitTaskBase() {
        Task<Void> task;
        synchronized (this) {
            task = this.zzg;
        }
        return task;
    }
}
