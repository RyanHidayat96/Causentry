package defpackage;

import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.Resource;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class getAvailableCameraInfos implements CameraInfoUnavailableException, lambdashutdownInternal4androidxcameracoreCameraX.b, addCameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
    private static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Log.isLoggable("Engine", 2);
    private final lambdashutdownInternal4androidxcameracoreCameraX TuitionPaymentFragmentbindingInflater1;
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final getCameraFilterSet f912a;
    private final fromSelector asBinder;
    private final CameraExecutorExternalSyntheticLambda0 b;
    private final CameraSelectorLensFacing d;
    private final TuitionPaymentFragmentbindingInflater1 g;

    public getAvailableCameraInfos(lambdashutdownInternal4androidxcameracoreCameraX lambdashutdowninternal4androidxcameracorecamerax, traceExecutionState.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, lambdashutdownInternal3androidxcameracoreCameraX lambdashutdowninternal3androidxcameracorecamerax, lambdashutdownInternal3androidxcameracoreCameraX lambdashutdowninternal3androidxcameracorecamerax2, lambdashutdownInternal3androidxcameracoreCameraX lambdashutdowninternal3androidxcameracorecamerax3, lambdashutdownInternal3androidxcameracoreCameraX lambdashutdowninternal3androidxcameracorecamerax4, boolean z) {
        this(lambdashutdowninternal4androidxcameracorecamerax, tuitionPaymentFragmentspecialinlinedviewModeldefault2, lambdashutdowninternal3androidxcameracorecamerax, lambdashutdowninternal3androidxcameracorecamerax2, lambdashutdowninternal3androidxcameracorecamerax3, lambdashutdowninternal3androidxcameracorecamerax4, z, (byte) 0);
    }

    private getAvailableCameraInfos(lambdashutdownInternal4androidxcameracoreCameraX lambdashutdowninternal4androidxcameracorecamerax, traceExecutionState.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, lambdashutdownInternal3androidxcameracoreCameraX lambdashutdowninternal3androidxcameracorecamerax, lambdashutdownInternal3androidxcameracoreCameraX lambdashutdowninternal3androidxcameracorecamerax2, lambdashutdownInternal3androidxcameracoreCameraX lambdashutdowninternal3androidxcameracorecamerax3, lambdashutdownInternal3androidxcameracoreCameraX lambdashutdowninternal3androidxcameracorecamerax4, boolean z, byte b) {
        this.TuitionPaymentFragmentbindingInflater1 = lambdashutdowninternal4androidxcameracorecamerax;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        CameraExecutorExternalSyntheticLambda0 cameraExecutorExternalSyntheticLambda0 = new CameraExecutorExternalSyntheticLambda0(z);
        this.b = cameraExecutorExternalSyntheticLambda0;
        synchronized (this) {
            synchronized (cameraExecutorExternalSyntheticLambda0) {
                cameraExecutorExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = this;
            }
        }
        this.f912a = new getCameraFilterSet();
        this.asBinder = new fromSelector();
        this.g = new TuitionPaymentFragmentbindingInflater1(lambdashutdowninternal3androidxcameracorecamerax, lambdashutdowninternal3androidxcameracorecamerax2, lambdashutdowninternal3androidxcameracorecamerax3, lambdashutdowninternal3androidxcameracorecamerax4, this, this);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
        this.d = new CameraSelectorLensFacing();
        lambdashutdowninternal4androidxcameracorecamerax.TuitionPaymentFragmentbindingInflater1(this);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    public final <R> TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1(setRotationDegrees setrotationdegrees, Object obj, getCameraControl getcameracontrol, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, CameraSelector cameraSelector, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, getTargetRotation gettargetrotation, boolean z3, boolean z4, boolean z5, boolean z6, ImageAnalysisBackpressureStrategy imageAnalysisBackpressureStrategy, Executor executor) {
        addCameraFilter<?> addcamerafilterB;
        boolean z7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        long jTuitionPaymentFragmentbindingInflater1 = z7 ? setTargetResolution.TuitionPaymentFragmentbindingInflater1() : 0L;
        CameraSelectorBuilder cameraSelectorBuilder = new CameraSelectorBuilder(obj, getcameracontrol, i, i2, map, cls, cls2, gettargetrotation);
        synchronized (this) {
            if (z3) {
                try {
                    addcamerafilterB = b(cameraSelectorBuilder);
                    if (addcamerafilterB == null) {
                        addcamerafilterB = TuitionPaymentFragmentspecialinlinedviewModeldefault1(cameraSelectorBuilder);
                        if (addcamerafilterB == null) {
                            addcamerafilterB = null;
                        } else if (z7) {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1("Loaded resource from cache", jTuitionPaymentFragmentbindingInflater1, cameraSelectorBuilder);
                        }
                    } else if (z7) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1("Loaded resource from active resources", jTuitionPaymentFragmentbindingInflater1, cameraSelectorBuilder);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                addcamerafilterB = null;
            }
            if (addcamerafilterB == null) {
                return b(setrotationdegrees, obj, getcameracontrol, i, i2, cls, cls2, priority, cameraSelector, map, z, z2, gettargetrotation, z3, z4, z5, z6, imageAnalysisBackpressureStrategy, executor, cameraSelectorBuilder, jTuitionPaymentFragmentbindingInflater1);
            }
            imageAnalysisBackpressureStrategy.TuitionPaymentFragmentbindingInflater1(addcamerafilterB, DataSource.MEMORY_CACHE);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <R> TuitionPaymentFragmentspecialinlinedviewModeldefault3 b(setRotationDegrees setrotationdegrees, Object obj, getCameraControl getcameracontrol, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, CameraSelector cameraSelector, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, getTargetRotation gettargetrotation, boolean z3, boolean z4, boolean z5, boolean z6, ImageAnalysisBackpressureStrategy imageAnalysisBackpressureStrategy, Executor executor, CameraSelectorBuilder cameraSelectorBuilder, long j) {
        lambdashutdownInternal3androidxcameracoreCameraX lambdashutdowninternal3androidxcameracorecamerax;
        fromSelector fromselector = this.asBinder;
        hasCamera<?> hascamera = (z6 ? fromselector.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : fromselector.TuitionPaymentFragmentbindingInflater1).get(cameraSelectorBuilder);
        if (hascamera != null) {
            hascamera.b(imageAnalysisBackpressureStrategy, executor);
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1("Added to existing load", j, cameraSelectorBuilder);
            }
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageAnalysisBackpressureStrategy, hascamera);
        }
        hasCamera<?> hascameraAcquire = this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault1.acquire();
        if (hascameraAcquire != null) {
            hasCamera<?> hascameraTuitionPaymentFragmentbindingInflater1 = hascameraAcquire.TuitionPaymentFragmentbindingInflater1(cameraSelectorBuilder, z3, z4, z5, z6);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            DecodeJob<R> decodeJob = (DecodeJob) tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.acquire();
            if (decodeJob != null) {
                int i3 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
                tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = i3 + 1;
                CameraFilter<R> cameraFilter = decodeJob.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                DecodeJob.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = decodeJob.f675a;
                cameraFilter.b = setrotationdegrees;
                cameraFilter.asBinder = obj;
                cameraFilter.onTransact = getcameracontrol;
                cameraFilter.notify = i;
                cameraFilter.TuitionPaymentFragmentbindingInflater1 = i2;
                cameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cameraSelector;
                cameraFilter.d = cls;
                cameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
                cameraFilter.cancelAll = cls2;
                cameraFilter.g = priority;
                cameraFilter.f110a = gettargetrotation;
                cameraFilter.cancel = map;
                cameraFilter.asInterface = z;
                cameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z2;
                decodeJob.asInterface = setrotationdegrees;
                decodeJob.INotificationSideChannelStubProxy = getcameracontrol;
                decodeJob.RemoteActionCompatParcelizer = priority;
                decodeJob.cancel = cameraSelectorBuilder;
                decodeJob.getInterfaceDescriptor = i;
                decodeJob.asBinder = i2;
                decodeJob.g = cameraSelector;
                decodeJob.cancelAll = z6;
                decodeJob.onTransact = gettargetrotation;
                decodeJob.TuitionPaymentFragmentbindingInflater1 = hascameraTuitionPaymentFragmentbindingInflater1;
                decodeJob.INotificationSideChannel = i3;
                decodeJob.INotificationSideChannelDefault = DecodeJob.RunReason.INITIALIZE;
                decodeJob.notify = obj;
                fromSelector fromselector2 = this.asBinder;
                (hascameraTuitionPaymentFragmentbindingInflater1.d ? fromselector2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : fromselector2.TuitionPaymentFragmentbindingInflater1).put(cameraSelectorBuilder, hascameraTuitionPaymentFragmentbindingInflater1);
                hascameraTuitionPaymentFragmentbindingInflater1.b(imageAnalysisBackpressureStrategy, executor);
                synchronized (hascameraTuitionPaymentFragmentbindingInflater1) {
                    hascameraTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 = decodeJob;
                    DecodeJob.Stage stageTuitionPaymentFragmentbindingInflater1 = decodeJob.TuitionPaymentFragmentbindingInflater1(DecodeJob.Stage.INITIALIZE);
                    if (stageTuitionPaymentFragmentbindingInflater1 == DecodeJob.Stage.RESOURCE_CACHE || stageTuitionPaymentFragmentbindingInflater1 == DecodeJob.Stage.DATA_CACHE) {
                        lambdashutdowninternal3androidxcameracorecamerax = hascameraTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    } else if (hascameraTuitionPaymentFragmentbindingInflater1.notify) {
                        lambdashutdowninternal3androidxcameracorecamerax = hascameraTuitionPaymentFragmentbindingInflater1.INotificationSideChannel;
                    } else {
                        lambdashutdowninternal3androidxcameracorecamerax = hascameraTuitionPaymentFragmentbindingInflater1.onTransact ? hascameraTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : hascameraTuitionPaymentFragmentbindingInflater1.f1005a;
                    }
                    lambdashutdowninternal3androidxcameracorecamerax.execute(decodeJob);
                }
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1("Started new load", j, cameraSelectorBuilder);
                }
                return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageAnalysisBackpressureStrategy, hascameraTuitionPaymentFragmentbindingInflater1);
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, long j, getCameraControl getcameracontrol) {
        setTargetResolution.TuitionPaymentFragmentbindingInflater1(j);
        Objects.toString(getcameracontrol);
    }

    private addCameraFilter<?> b(getCameraControl getcameracontrol) {
        addCameraFilter<?> addcamerafilterTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getcameracontrol);
        if (addcamerafilterTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            addcamerafilterTuitionPaymentFragmentspecialinlinedviewModeldefault1.b();
        }
        return addcamerafilterTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Resource<?> resource) throws IllegalAccessException {
        if (resource instanceof addCameraFilter) {
            ((addCameraFilter) resource).g();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    @Override // defpackage.CameraInfoUnavailableException
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(hasCamera<?> hascamera, getCameraControl getcameracontrol) {
        synchronized (this) {
            fromSelector fromselector = this.asBinder;
            Map<getCameraControl, hasCamera<?>> map = hascamera.d ? fromselector.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : fromselector.TuitionPaymentFragmentbindingInflater1;
            if (hascamera.equals(map.get(getcameracontrol))) {
                map.remove(getcameracontrol);
            }
        }
    }

    @Override // lambdashutdownInternal4androidxcameracoreCameraX.b
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Resource<?> resource) {
        this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault3(resource, true);
    }

    @Override // addCameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getCameraControl getcameracontrol, addCameraFilter<?> addcamerafilter) {
        CameraExecutorExternalSyntheticLambda0 cameraExecutorExternalSyntheticLambda0 = this.b;
        synchronized (cameraExecutorExternalSyntheticLambda0) {
            CameraExecutorExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1Remove = cameraExecutorExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remove(getcameracontrol);
            if (tuitionPaymentFragmentbindingInflater1Remove != null) {
                tuitionPaymentFragmentbindingInflater1Remove.TuitionPaymentFragmentbindingInflater1 = null;
                tuitionPaymentFragmentbindingInflater1Remove.clear();
            }
        }
        if (addcamerafilter.b) {
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(getcameracontrol, addcamerafilter);
        } else {
            this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault3(addcamerafilter, false);
        }
    }

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        public final hasCamera<?> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public final ImageAnalysisBackpressureStrategy b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(ImageAnalysisBackpressureStrategy imageAnalysisBackpressureStrategy, hasCamera<?> hascamera) {
            this.b = imageAnalysisBackpressureStrategy;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = hascamera;
        }
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements DecodeJob.TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private volatile traceExecutionState TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final traceExecutionState.TuitionPaymentFragmentspecialinlinedviewModeldefault2 b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(traceExecutionState.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            this.b = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        @Override // com.bumptech.glide.load.engine.DecodeJob.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final traceExecutionState TuitionPaymentFragmentbindingInflater1() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                synchronized (this) {
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    }
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new getCameraDeviceSurfaceManager();
                    }
                }
            }
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        final Pools.Pool<DecodeJob<?>> TuitionPaymentFragmentbindingInflater1 = createImageReaderProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(150, new createImageReaderProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1<DecodeJob<?>>() { // from class: getAvailableCameraInfos.TuitionPaymentFragmentspecialinlinedviewModeldefault2.3
            @Override // createImageReaderProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            public final /* synthetic */ DecodeJob<?> TuitionPaymentFragmentbindingInflater1() {
                return new DecodeJob<>(TuitionPaymentFragmentspecialinlinedviewModeldefault2.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, TuitionPaymentFragmentspecialinlinedviewModeldefault2.this.TuitionPaymentFragmentbindingInflater1);
            }
        });
        final DecodeJob.TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(DecodeJob.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
    }

    static class TuitionPaymentFragmentbindingInflater1 {
        final CameraInfoUnavailableException TuitionPaymentFragmentbindingInflater1;
        final Pools.Pool<hasCamera<?>> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = createImageReaderProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(150, new createImageReaderProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1<hasCamera<?>>() { // from class: getAvailableCameraInfos.TuitionPaymentFragmentbindingInflater1.4
            @Override // createImageReaderProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            public final /* synthetic */ hasCamera<?> TuitionPaymentFragmentbindingInflater1() {
                return new hasCamera<>(TuitionPaymentFragmentbindingInflater1.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, TuitionPaymentFragmentbindingInflater1.this.g, TuitionPaymentFragmentbindingInflater1.this.d, TuitionPaymentFragmentbindingInflater1.this.b, TuitionPaymentFragmentbindingInflater1.this.TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentbindingInflater1.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, TuitionPaymentFragmentbindingInflater1.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        });
        final lambdashutdownInternal3androidxcameracoreCameraX TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final addCameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final lambdashutdownInternal3androidxcameracoreCameraX b;
        final lambdashutdownInternal3androidxcameracoreCameraX d;
        final lambdashutdownInternal3androidxcameracoreCameraX g;

        TuitionPaymentFragmentbindingInflater1(lambdashutdownInternal3androidxcameracoreCameraX lambdashutdowninternal3androidxcameracorecamerax, lambdashutdownInternal3androidxcameracoreCameraX lambdashutdowninternal3androidxcameracorecamerax2, lambdashutdownInternal3androidxcameracoreCameraX lambdashutdowninternal3androidxcameracorecamerax3, lambdashutdownInternal3androidxcameracoreCameraX lambdashutdowninternal3androidxcameracorecamerax4, CameraInfoUnavailableException cameraInfoUnavailableException, addCameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdashutdowninternal3androidxcameracorecamerax;
            this.g = lambdashutdowninternal3androidxcameracorecamerax2;
            this.d = lambdashutdowninternal3androidxcameracorecamerax3;
            this.b = lambdashutdowninternal3androidxcameracorecamerax4;
            this.TuitionPaymentFragmentbindingInflater1 = cameraInfoUnavailableException;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
    }

    private addCameraFilter<?> TuitionPaymentFragmentspecialinlinedviewModeldefault1(getCameraControl getcameracontrol) {
        addCameraFilter<?> addcamerafilter;
        Resource<?> resourceTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getcameracontrol);
        if (resourceTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            addcamerafilter = null;
        } else if (resourceTuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof addCameraFilter) {
            addcamerafilter = (addCameraFilter) resourceTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } else {
            addcamerafilter = new addCameraFilter<>(resourceTuitionPaymentFragmentspecialinlinedviewModeldefault1, true, true, getcameracontrol, this);
        }
        if (addcamerafilter != null) {
            addcamerafilter.b();
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getcameracontrol, addcamerafilter);
        }
        return addcamerafilter;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015 A[Catch: all -> 0x0026, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000c, B:9:0x0012, B:11:0x0017, B:13:0x0021, B:10:0x0015), top: B:19:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000c, B:9:0x0012, B:11:0x0017, B:13:0x0021, B:10:0x0015), top: B:19:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0012 A[Catch: all -> 0x0026, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000c, B:9:0x0012, B:11:0x0017, B:13:0x0021, B:10:0x0015), top: B:19:0x0003 }] */
    @Override // defpackage.CameraInfoUnavailableException
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(hasCamera<?> hascamera, getCameraControl getcameracontrol, addCameraFilter<?> addcamerafilter) {
        fromSelector fromselector;
        Map<getCameraControl, hasCamera<?>> map;
        synchronized (this) {
            if (addcamerafilter == null) {
                fromselector = this.asBinder;
                if (hascamera.d) {
                    map = fromselector.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                } else {
                    map = fromselector.TuitionPaymentFragmentbindingInflater1;
                }
                if (hascamera.equals(map.get(getcameracontrol))) {
                    map.remove(getcameracontrol);
                }
            } else {
                if (addcamerafilter.b) {
                    this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getcameracontrol, addcamerafilter);
                }
                fromselector = this.asBinder;
                if (hascamera.d) {
                    map = fromselector.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                } else {
                    map = fromselector.TuitionPaymentFragmentbindingInflater1;
                }
                if (hascamera.equals(map.get(getcameracontrol))) {
                    map.remove(getcameracontrol);
                }
            }
            throw th;
        }
    }
}
