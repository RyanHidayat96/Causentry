package androidx.camera.lifecycle;

import android.content.Context;
import androidx.arch.core.util.Function;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraX;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.ConcurrentCamera;
import androidx.camera.core.LayoutSettings;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.ViewPort;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigProvider;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.RestrictedCameraInfo;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.tracing.Trace;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 c2\u00020\u0001:\u0001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jk\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00120\u0011\"\u0004\u0018\u00010\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00120\u0011\"\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u001aJ\u001f\u0010\u0018\u001a\u00020\u001c2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u000eH\u0007¢\u0006\u0004\b\u0018\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000eH\u0017¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\"H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u0006H\u0017¢\u0006\u0004\b(\u0010)J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010\u0005\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020/2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020/2\u0006\u0010\u0005\u001a\u00020\u0012H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020/2\u0006\u0010\u0005\u001a\u00020\u0012H\u0002¢\u0006\u0004\b4\u00103J\u0017\u00105\u001a\u00020/2\u0006\u0010\u0005\u001a\u00020\u0012H\u0002¢\u0006\u0004\b5\u00103J\u0017\u00106\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020,H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020*H\u0002¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\b\u0012\u0004\u0012\u00020:0+H\u0007¢\u0006\u0004\b;\u0010<J'\u0010=\u001a\u00020\u001f2\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00120\u0011\"\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u001fH\u0017¢\u0006\u0004\b?\u0010\u0003R0\u0010C\u001a\b\u0012\u0004\u0012\u00020\"0\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\"0\u000e8C@CX\u0082\u000e¢\u0006\f\u001a\u0004\b@\u0010$\"\u0004\bA\u0010BR\u001d\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u000e0\u000e8G¢\u0006\u0006\u001a\u0004\bD\u0010$R$\u0010K\u001a\u00020F2\u0006\u0010\u0005\u001a\u00020F8C@CX\u0082\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0011\u0010L\u001a\u00020/8G¢\u0006\u0006\u001a\u0004\bL\u0010MR \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020P0N8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010S\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u001e\u0010X\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bX\u0010YR \u0010Z\u001a\f\u0012\b\u0012\u0006*\u00020:0:0+8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bZ\u0010YR\u0018\u0010[\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\ba\u0010b"}, d2 = {"Landroidx/camera/lifecycle/ProcessCameraProvider;", "Landroidx/camera/lifecycle/LifecycleCameraProvider;", "<init>", "()V", "Landroidx/lifecycle/LifecycleOwner;", "p0", "Landroidx/camera/core/CameraSelector;", "p1", "p2", "Landroidx/camera/core/LayoutSettings;", "p3", "p4", "Landroidx/camera/core/ViewPort;", "p5", "", "Landroidx/camera/core/CameraEffect;", "p6", "", "Landroidx/camera/core/UseCase;", "p7", "Landroidx/camera/core/Camera;", "bindToLifecycle$camera_lifecycle_release", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/LayoutSettings;Landroidx/camera/core/LayoutSettings;Landroidx/camera/core/ViewPort;Ljava/util/List;[Landroidx/camera/core/UseCase;)Landroidx/camera/core/Camera;", "Landroidx/camera/core/UseCaseGroup;", "bindToLifecycle", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/UseCaseGroup;)Landroidx/camera/core/Camera;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;[Landroidx/camera/core/UseCase;)Landroidx/camera/core/Camera;", "Landroidx/camera/core/ConcurrentCamera$SingleCameraConfig;", "Landroidx/camera/core/ConcurrentCamera;", "(Ljava/util/List;)Landroidx/camera/core/ConcurrentCamera;", "Landroidx/camera/core/CameraXConfig;", "", "configureInstanceInternal", "(Landroidx/camera/core/CameraXConfig;)V", "Landroidx/camera/core/CameraInfo;", "getAvailableCameraInfos", "()Ljava/util/List;", "Landroidx/camera/core/impl/CameraConfig;", "getCameraConfig", "(Landroidx/camera/core/CameraSelector;Landroidx/camera/core/CameraInfo;)Landroidx/camera/core/impl/CameraConfig;", "getCameraInfo", "(Landroidx/camera/core/CameraSelector;)Landroidx/camera/core/CameraInfo;", "Landroid/content/Context;", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/core/CameraX;", "getOrCreateCameraXInstance", "(Landroid/content/Context;)Lcom/google/common/util/concurrent/ListenableFuture;", "", "hasCamera", "(Landroidx/camera/core/CameraSelector;)Z", "isBound", "(Landroidx/camera/core/UseCase;)Z", "isPreview", "isVideoCapture", "setCameraX", "(Landroidx/camera/core/CameraX;)V", "setContext", "(Landroid/content/Context;)V", "Ljava/lang/Void;", "shutdownAsync", "()Lcom/google/common/util/concurrent/ListenableFuture;", "unbind", "([Landroidx/camera/core/UseCase;)V", "unbindAll", "getActiveConcurrentCameraInfos", "setActiveConcurrentCameraInfos", "(Ljava/util/List;)V", "activeConcurrentCameraInfos", "getAvailableConcurrentCameraInfos", "availableConcurrentCameraInfos", "", "getCameraOperatingMode", "()I", "setCameraOperatingMode", "(I)V", "cameraOperatingMode", "isConcurrentCameraModeOn", "()Z", "", "Landroidx/camera/core/internal/CameraUseCaseAdapter$CameraId;", "Landroidx/camera/core/impl/RestrictedCameraInfo;", "mCameraInfoMap", "Ljava/util/Map;", "mCameraX", "Landroidx/camera/core/CameraX;", "Landroidx/camera/core/CameraXConfig$Provider;", "mCameraXConfigProvider", "Landroidx/camera/core/CameraXConfig$Provider;", "mCameraXInitializeFuture", "Lcom/google/common/util/concurrent/ListenableFuture;", "mCameraXShutdownFuture", "mContext", "Landroid/content/Context;", "Landroidx/camera/lifecycle/LifecycleCameraRepository;", "mLifecycleCameraRepository", "Landroidx/camera/lifecycle/LifecycleCameraRepository;", "", "mLock", "Ljava/lang/Object;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProcessCameraProvider implements LifecycleCameraProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ProcessCameraProvider sAppInstance = new ProcessCameraProvider();
    private final Map<CameraUseCaseAdapter.CameraId, RestrictedCameraInfo> mCameraInfoMap;
    private CameraX mCameraX;
    private CameraXConfig.Provider mCameraXConfigProvider;
    private ListenableFuture<CameraX> mCameraXInitializeFuture;
    private ListenableFuture<Void> mCameraXShutdownFuture;
    private Context mContext;
    private final LifecycleCameraRepository mLifecycleCameraRepository;
    private final Object mLock = new Object();

    private ProcessCameraProvider() {
        ListenableFuture<Void> listenableFutureImmediateFuture = Futures.immediateFuture(null);
        Intrinsics.checkNotNullExpressionValue(listenableFutureImmediateFuture, "");
        this.mCameraXShutdownFuture = listenableFutureImmediateFuture;
        this.mLifecycleCameraRepository = new LifecycleCameraRepository();
        this.mCameraInfoMap = new HashMap();
    }

    public final ListenableFuture<Void> shutdownAsync() {
        ListenableFuture<Void> listenableFutureImmediateFuture;
        Threads.runOnMainSync(new Runnable() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ProcessCameraProvider.shutdownAsync$lambda$0(this.f$0);
            }
        });
        CameraX cameraX = this.mCameraX;
        if (cameraX != null) {
            Intrinsics.checkNotNull(cameraX);
            cameraX.getCameraFactory().getCameraCoordinator().shutdown();
        }
        CameraX cameraX2 = this.mCameraX;
        if (cameraX2 != null) {
            Intrinsics.checkNotNull(cameraX2);
            listenableFutureImmediateFuture = cameraX2.shutdown();
        } else {
            listenableFutureImmediateFuture = Futures.immediateFuture(null);
        }
        Intrinsics.checkNotNullExpressionValue(listenableFutureImmediateFuture, "");
        synchronized (this.mLock) {
            this.mCameraXConfigProvider = null;
            this.mCameraXInitializeFuture = null;
            this.mCameraXShutdownFuture = listenableFutureImmediateFuture;
            this.mCameraInfoMap.clear();
            Unit unit = Unit.INSTANCE;
        }
        this.mCameraX = null;
        this.mContext = null;
        return listenableFutureImmediateFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shutdownAsync$lambda$0(ProcessCameraProvider processCameraProvider) {
        Intrinsics.checkNotNullParameter(processCameraProvider, "");
        processCameraProvider.unbindAll();
        processCameraProvider.mLifecycleCameraRepository.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVideoCapture(UseCase p0) {
        return p0.getCurrentConfig().containsOption(UseCaseConfig.OPTION_CAPTURE_TYPE) && p0.getCurrentConfig().getCaptureType() == UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPreview(UseCase p0) {
        return p0 instanceof Preview;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public final boolean isBound(UseCase p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        for (LifecycleCamera lifecycleCamera : this.mLifecycleCameraRepository.getLifecycleCameras()) {
            Intrinsics.checkNotNullExpressionValue(lifecycleCamera, "");
            if (lifecycleCamera.isBound(p0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isConcurrentCameraModeOn() {
        return getCameraOperatingMode() == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListenableFuture<CameraX> getOrCreateCameraXInstance(Context p0) {
        synchronized (this.mLock) {
            ListenableFuture<CameraX> listenableFuture = this.mCameraXInitializeFuture;
            if (listenableFuture != null) {
                Intrinsics.checkNotNull(listenableFuture, "");
                return listenableFuture;
            }
            final CameraX cameraX = new CameraX(p0, this.mCameraXConfigProvider);
            ListenableFuture<CameraX> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$$ExternalSyntheticLambda0
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return ProcessCameraProvider.getOrCreateCameraXInstance$lambda$18$lambda$17(this.f$0, cameraX, completer);
                }
            });
            this.mCameraXInitializeFuture = future;
            Intrinsics.checkNotNull(future, "");
            return future;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getOrCreateCameraXInstance$lambda$18$lambda$17(ProcessCameraProvider processCameraProvider, final CameraX cameraX, final CallbackToFutureAdapter.Completer completer) {
        Intrinsics.checkNotNullParameter(processCameraProvider, "");
        Intrinsics.checkNotNullParameter(cameraX, "");
        Intrinsics.checkNotNullParameter(completer, "");
        synchronized (processCameraProvider.mLock) {
            FutureChain futureChainFrom = FutureChain.from(processCameraProvider.mCameraXShutdownFuture);
            final Function1<Void, ListenableFuture<Void>> function1 = new Function1<Void, ListenableFuture<Void>>() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$future$1
                @Override // kotlin.jvm.functions.Function1
                public final ListenableFuture<Void> invoke(Void r1) {
                    return cameraX.getInitializeFuture();
                }

                {
                    super(1);
                }
            };
            FutureChain futureChainTransformAsync = futureChainFrom.transformAsync(new AsyncFunction() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$$ExternalSyntheticLambda2
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return ProcessCameraProvider.getOrCreateCameraXInstance$lambda$18$lambda$17$lambda$16$lambda$15(function1, obj);
                }
            }, CameraXExecutors.directExecutor());
            Intrinsics.checkNotNullExpressionValue(futureChainTransformAsync, "");
            Futures.addCallback(futureChainTransformAsync, new FutureCallback<Void>() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$1
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public final void onSuccess(Void p0) {
                    completer.set(cameraX);
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public final void onFailure(Throwable p0) {
                    Intrinsics.checkNotNullParameter(p0, "");
                    completer.setException(p0);
                }
            }, CameraXExecutors.directExecutor());
            Unit unit = Unit.INSTANCE;
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ListenableFuture getOrCreateCameraXInstance$lambda$18$lambda$17$lambda$16$lambda$15(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "");
        return (ListenableFuture) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CameraConfig getCameraConfig(CameraSelector p0, CameraInfo p1) {
        CameraConfig cameraConfig = null;
        for (CameraFilter cameraFilter : p0.getCameraFilterSet()) {
            Intrinsics.checkNotNullExpressionValue(cameraFilter, "");
            CameraFilter cameraFilter2 = cameraFilter;
            if (!Intrinsics.areEqual(cameraFilter2.getIdentifier(), CameraFilter.DEFAULT_ID)) {
                CameraConfigProvider configProvider = ExtendedCameraConfigProviderStore.getConfigProvider(cameraFilter2.getIdentifier());
                Context context = this.mContext;
                Intrinsics.checkNotNull(context);
                CameraConfig config = configProvider.getConfig(p1, context);
                if (config == null) {
                    continue;
                } else {
                    if (cameraConfig != null) {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    cameraConfig = config;
                }
            }
        }
        return cameraConfig == null ? CameraConfigs.defaultConfig() : cameraConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCameraX(CameraX p0) {
        this.mCameraX = p0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setContext(Context p0) {
        this.mContext = p0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCameraOperatingMode() {
        CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return 0;
        }
        Intrinsics.checkNotNull(cameraX);
        return cameraX.getCameraFactory().getCameraCoordinator().getCameraOperatingMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCameraOperatingMode(int i) {
        CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return;
        }
        Intrinsics.checkNotNull(cameraX);
        cameraX.getCameraFactory().getCameraCoordinator().setCameraOperatingMode(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CameraInfo> getActiveConcurrentCameraInfos() {
        CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return new ArrayList();
        }
        Intrinsics.checkNotNull(cameraX);
        List<CameraInfo> activeConcurrentCameraInfos = cameraX.getCameraFactory().getCameraCoordinator().getActiveConcurrentCameraInfos();
        Intrinsics.checkNotNullExpressionValue(activeConcurrentCameraInfos, "");
        return activeConcurrentCameraInfos;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setActiveConcurrentCameraInfos(List<? extends CameraInfo> list) {
        CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return;
        }
        Intrinsics.checkNotNull(cameraX);
        cameraX.getCameraFactory().getCameraCoordinator().setActiveConcurrentCameraInfos(list);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;", "", "<init>", "()V", "Landroidx/camera/core/CameraXConfig;", "p0", "", "configureInstance", "(Landroidx/camera/core/CameraXConfig;)V", "Landroid/content/Context;", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "getInstance", "(Landroid/content/Context;)Lcom/google/common/util/concurrent/ListenableFuture;", "sAppInstance", "Landroidx/camera/lifecycle/ProcessCameraProvider;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final ListenableFuture<ProcessCameraProvider> getInstance(final Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Preconditions.checkNotNull(p0);
            ListenableFuture orCreateCameraXInstance = ProcessCameraProvider.sAppInstance.getOrCreateCameraXInstance(p0);
            final Function1<CameraX, ProcessCameraProvider> function1 = new Function1<CameraX, ProcessCameraProvider>() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$Companion$getInstance$1
                @Override // kotlin.jvm.functions.Function1
                public final ProcessCameraProvider invoke(CameraX cameraX) {
                    ProcessCameraProvider processCameraProvider = ProcessCameraProvider.sAppInstance;
                    Intrinsics.checkNotNullExpressionValue(cameraX, "");
                    processCameraProvider.setCameraX(cameraX);
                    ProcessCameraProvider processCameraProvider2 = ProcessCameraProvider.sAppInstance;
                    Context applicationContext = ContextUtil.getApplicationContext(p0);
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                    processCameraProvider2.setContext(applicationContext);
                    return ProcessCameraProvider.sAppInstance;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            };
            ListenableFuture<ProcessCameraProvider> listenableFutureTransform = Futures.transform(orCreateCameraXInstance, new Function() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$Companion$$ExternalSyntheticLambda0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return ProcessCameraProvider.Companion.getInstance$lambda$0(function1, obj);
                }
            }, CameraXExecutors.directExecutor());
            Intrinsics.checkNotNullExpressionValue(listenableFutureTransform, "");
            return listenableFutureTransform;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ProcessCameraProvider getInstance$lambda$0(Function1 function1, Object obj) {
            Intrinsics.checkNotNullParameter(function1, "");
            return (ProcessCameraProvider) function1.invoke(obj);
        }

        @JvmStatic
        public final void configureInstance(CameraXConfig p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Trace.beginSection("CX:configureInstance");
            try {
                ProcessCameraProvider.sAppInstance.configureInstanceInternal(p0);
                Unit unit = Unit.INSTANCE;
            } finally {
                Trace.endSection();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Camera bindToLifecycle(LifecycleOwner p0, CameraSelector p1, UseCase... p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Trace.beginSection("CX:bindToLifecycle");
        try {
            if (getCameraOperatingMode() != 2) {
                setCameraOperatingMode(1);
                LayoutSettings layoutSettings = LayoutSettings.DEFAULT;
                Intrinsics.checkNotNullExpressionValue(layoutSettings, "");
                LayoutSettings layoutSettings2 = LayoutSettings.DEFAULT;
                Intrinsics.checkNotNullExpressionValue(layoutSettings2, "");
                Camera cameraBindToLifecycle$camera_lifecycle_release = bindToLifecycle$camera_lifecycle_release(p0, p1, null, layoutSettings, layoutSettings2, null, CollectionsKt.emptyList(), (UseCase[]) Arrays.copyOf(p2, p2.length));
                Trace.endSection();
                return cameraBindToLifecycle$camera_lifecycle_release;
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final Camera bindToLifecycle(LifecycleOwner p0, CameraSelector p1, UseCaseGroup p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Trace.beginSection("CX:bindToLifecycle-UseCaseGroup");
        try {
            if (getCameraOperatingMode() != 2) {
                setCameraOperatingMode(1);
                LayoutSettings layoutSettings = LayoutSettings.DEFAULT;
                Intrinsics.checkNotNullExpressionValue(layoutSettings, "");
                LayoutSettings layoutSettings2 = LayoutSettings.DEFAULT;
                Intrinsics.checkNotNullExpressionValue(layoutSettings2, "");
                ViewPort viewPort = p2.getViewPort();
                List<CameraEffect> effects = p2.getEffects();
                Intrinsics.checkNotNullExpressionValue(effects, "");
                List<UseCase> useCases = p2.getUseCases();
                Intrinsics.checkNotNullExpressionValue(useCases, "");
                UseCase[] useCaseArr = (UseCase[]) useCases.toArray(new UseCase[0]);
                Camera cameraBindToLifecycle$camera_lifecycle_release = bindToLifecycle$camera_lifecycle_release(p0, p1, null, layoutSettings, layoutSettings2, viewPort, effects, (UseCase[]) Arrays.copyOf(useCaseArr, useCaseArr.length));
                Trace.endSection();
                return cameraBindToLifecycle$camera_lifecycle_release;
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01ee A[Catch: all -> 0x02c8, TryCatch #1 {all -> 0x02c8, blocks: (B:3:0x000d, B:5:0x0014, B:7:0x001a, B:10:0x004e, B:12:0x0054, B:14:0x0062, B:16:0x0078, B:18:0x008e, B:19:0x00ba, B:21:0x00c0, B:22:0x00d5, B:24:0x00db, B:26:0x00ee, B:27:0x00f2, B:28:0x0103, B:64:0x02bf, B:29:0x012f, B:30:0x0136, B:31:0x0137, B:32:0x013c, B:33:0x013d, B:35:0x0150, B:37:0x0156, B:38:0x015e, B:39:0x0174, B:41:0x0186, B:44:0x0191, B:45:0x0198, B:46:0x0199, B:48:0x01b2, B:50:0x01c0, B:52:0x01e5, B:58:0x01fd, B:63:0x02bc, B:54:0x01ee, B:56:0x01f4, B:59:0x0257, B:60:0x025b, B:62:0x0261, B:69:0x02ca, B:70:0x02d1, B:71:0x02d2, B:72:0x02d7, B:73:0x02d8, B:74:0x02df, B:75:0x02e0, B:76:0x02e7, B:77:0x02e8, B:78:0x02ef), top: B:83:0x000d, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01f4 A[Catch: all -> 0x02c8, TryCatch #1 {all -> 0x02c8, blocks: (B:3:0x000d, B:5:0x0014, B:7:0x001a, B:10:0x004e, B:12:0x0054, B:14:0x0062, B:16:0x0078, B:18:0x008e, B:19:0x00ba, B:21:0x00c0, B:22:0x00d5, B:24:0x00db, B:26:0x00ee, B:27:0x00f2, B:28:0x0103, B:64:0x02bf, B:29:0x012f, B:30:0x0136, B:31:0x0137, B:32:0x013c, B:33:0x013d, B:35:0x0150, B:37:0x0156, B:38:0x015e, B:39:0x0174, B:41:0x0186, B:44:0x0191, B:45:0x0198, B:46:0x0199, B:48:0x01b2, B:50:0x01c0, B:52:0x01e5, B:58:0x01fd, B:63:0x02bc, B:54:0x01ee, B:56:0x01f4, B:59:0x0257, B:60:0x025b, B:62:0x0261, B:69:0x02ca, B:70:0x02d1, B:71:0x02d2, B:72:0x02d7, B:73:0x02d8, B:74:0x02df, B:75:0x02e0, B:76:0x02e7, B:77:0x02e8, B:78:0x02ef), top: B:83:0x000d, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0261 A[Catch: all -> 0x02c8, LOOP:2: B:60:0x025b->B:62:0x0261, LOOP_END, TryCatch #1 {all -> 0x02c8, blocks: (B:3:0x000d, B:5:0x0014, B:7:0x001a, B:10:0x004e, B:12:0x0054, B:14:0x0062, B:16:0x0078, B:18:0x008e, B:19:0x00ba, B:21:0x00c0, B:22:0x00d5, B:24:0x00db, B:26:0x00ee, B:27:0x00f2, B:28:0x0103, B:64:0x02bf, B:29:0x012f, B:30:0x0136, B:31:0x0137, B:32:0x013c, B:33:0x013d, B:35:0x0150, B:37:0x0156, B:38:0x015e, B:39:0x0174, B:41:0x0186, B:44:0x0191, B:45:0x0198, B:46:0x0199, B:48:0x01b2, B:50:0x01c0, B:52:0x01e5, B:58:0x01fd, B:63:0x02bc, B:54:0x01ee, B:56:0x01f4, B:59:0x0257, B:60:0x025b, B:62:0x0261, B:69:0x02ca, B:70:0x02d1, B:71:0x02d2, B:72:0x02d7, B:73:0x02d8, B:74:0x02df, B:75:0x02e0, B:76:0x02e7, B:77:0x02e8, B:78:0x02ef), top: B:83:0x000d, inners: #0 }] */
    public final ConcurrentCamera bindToLifecycle(List<ConcurrentCamera.SingleCameraConfig> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Trace.beginSection("CX:bindToLifecycle-Concurrent");
        try {
            if (p0.size() < 2) {
                throw new IllegalArgumentException("Concurrent camera needs two camera configs.");
            }
            if (p0.size() > 2) {
                throw new IllegalArgumentException("Concurrent camera is only supporting two cameras at maximum.");
            }
            ConcurrentCamera.SingleCameraConfig singleCameraConfig = p0.get(0);
            Intrinsics.checkNotNull(singleCameraConfig);
            ConcurrentCamera.SingleCameraConfig singleCameraConfig2 = singleCameraConfig;
            ConcurrentCamera.SingleCameraConfig singleCameraConfig3 = p0.get(1);
            Intrinsics.checkNotNull(singleCameraConfig3);
            ConcurrentCamera.SingleCameraConfig singleCameraConfig4 = singleCameraConfig3;
            ArrayList arrayList = new ArrayList();
            if (Intrinsics.areEqual(singleCameraConfig2.getCameraSelector().getLensFacing(), singleCameraConfig4.getCameraSelector().getLensFacing())) {
                if (getCameraOperatingMode() == 2) {
                    throw new UnsupportedOperationException("Camera is already running, call unbindAll() before binding more cameras.");
                }
                if (!Intrinsics.areEqual(singleCameraConfig2.getLifecycleOwner(), singleCameraConfig4.getLifecycleOwner()) || !Intrinsics.areEqual(singleCameraConfig2.getUseCaseGroup().getViewPort(), singleCameraConfig4.getUseCaseGroup().getViewPort()) || !Intrinsics.areEqual(singleCameraConfig2.getUseCaseGroup().getEffects(), singleCameraConfig4.getUseCaseGroup().getEffects())) {
                    throw new IllegalArgumentException("Two camera configs need to have the same lifecycle owner, view port and effects.");
                }
                LifecycleOwner lifecycleOwner = singleCameraConfig2.getLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(lifecycleOwner, "");
                CameraSelector cameraSelector = singleCameraConfig2.getCameraSelector();
                Intrinsics.checkNotNullExpressionValue(cameraSelector, "");
                ViewPort viewPort = singleCameraConfig2.getUseCaseGroup().getViewPort();
                List<CameraEffect> effects = singleCameraConfig2.getUseCaseGroup().getEffects();
                Intrinsics.checkNotNullExpressionValue(effects, "");
                ArrayList arrayList2 = new ArrayList();
                for (ConcurrentCamera.SingleCameraConfig singleCameraConfig5 : p0) {
                    Intrinsics.checkNotNull(singleCameraConfig5);
                    for (UseCase useCase : singleCameraConfig5.getUseCaseGroup().getUseCases()) {
                        Intrinsics.checkNotNullExpressionValue(useCase, "");
                        UseCase useCase2 = useCase;
                        String physicalCameraId = singleCameraConfig5.getCameraSelector().getPhysicalCameraId();
                        if (physicalCameraId != null) {
                            useCase2.setPhysicalCameraId(physicalCameraId);
                        }
                    }
                    List<UseCase> useCases = singleCameraConfig5.getUseCaseGroup().getUseCases();
                    Intrinsics.checkNotNullExpressionValue(useCases, "");
                    arrayList2.addAll(useCases);
                }
                setCameraOperatingMode(1);
                LayoutSettings layoutSettings = LayoutSettings.DEFAULT;
                Intrinsics.checkNotNullExpressionValue(layoutSettings, "");
                LayoutSettings layoutSettings2 = LayoutSettings.DEFAULT;
                Intrinsics.checkNotNullExpressionValue(layoutSettings2, "");
                UseCase[] useCaseArr = (UseCase[]) arrayList2.toArray(new UseCase[0]);
                arrayList.add(bindToLifecycle$camera_lifecycle_release(lifecycleOwner, cameraSelector, null, layoutSettings, layoutSettings2, viewPort, effects, (UseCase[]) Arrays.copyOf(useCaseArr, useCaseArr.length)));
            } else {
                Context context = this.mContext;
                Intrinsics.checkNotNull(context);
                if (context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
                    if (getCameraOperatingMode() == 1) {
                        throw new UnsupportedOperationException("Camera is already running, call unbindAll() before binding more cameras.");
                    }
                    ArrayList arrayList3 = new ArrayList();
                    try {
                        CameraSelector cameraSelector2 = singleCameraConfig2.getCameraSelector();
                        Intrinsics.checkNotNullExpressionValue(cameraSelector2, "");
                        CameraInfo cameraInfo = getCameraInfo(cameraSelector2);
                        CameraSelector cameraSelector3 = singleCameraConfig4.getCameraSelector();
                        Intrinsics.checkNotNullExpressionValue(cameraSelector3, "");
                        CameraInfo cameraInfo2 = getCameraInfo(cameraSelector3);
                        arrayList3.add(cameraInfo);
                        arrayList3.add(cameraInfo2);
                        if (!getActiveConcurrentCameraInfos().isEmpty() && !Intrinsics.areEqual(arrayList3, getActiveConcurrentCameraInfos())) {
                            throw new UnsupportedOperationException("Cameras are already running, call unbindAll() before binding more cameras.");
                        }
                        setCameraOperatingMode(2);
                        if (Objects.equals(singleCameraConfig2.getUseCaseGroup().getUseCases(), singleCameraConfig4.getUseCaseGroup().getUseCases()) && singleCameraConfig2.getUseCaseGroup().getUseCases().size() == 2) {
                            UseCase useCase3 = singleCameraConfig2.getUseCaseGroup().getUseCases().get(0);
                            UseCase useCase4 = singleCameraConfig2.getUseCaseGroup().getUseCases().get(1);
                            Intrinsics.checkNotNullExpressionValue(useCase3, "");
                            if (isVideoCapture(useCase3)) {
                                Intrinsics.checkNotNullExpressionValue(useCase4, "");
                                if (!isPreview(useCase4)) {
                                    if (isPreview(useCase3)) {
                                        Intrinsics.checkNotNullExpressionValue(useCase4, "");
                                        if (isVideoCapture(useCase4)) {
                                        }
                                    }
                                    for (ConcurrentCamera.SingleCameraConfig singleCameraConfig6 : p0) {
                                        Intrinsics.checkNotNull(singleCameraConfig6);
                                        LifecycleOwner lifecycleOwner2 = singleCameraConfig6.getLifecycleOwner();
                                        Intrinsics.checkNotNullExpressionValue(lifecycleOwner2, "");
                                        CameraSelector cameraSelector4 = singleCameraConfig6.getCameraSelector();
                                        Intrinsics.checkNotNullExpressionValue(cameraSelector4, "");
                                        LayoutSettings layoutSettings3 = LayoutSettings.DEFAULT;
                                        Intrinsics.checkNotNullExpressionValue(layoutSettings3, "");
                                        LayoutSettings layoutSettings4 = LayoutSettings.DEFAULT;
                                        Intrinsics.checkNotNullExpressionValue(layoutSettings4, "");
                                        ViewPort viewPort2 = singleCameraConfig6.getUseCaseGroup().getViewPort();
                                        List<CameraEffect> effects2 = singleCameraConfig6.getUseCaseGroup().getEffects();
                                        Intrinsics.checkNotNullExpressionValue(effects2, "");
                                        List<UseCase> useCases2 = singleCameraConfig6.getUseCaseGroup().getUseCases();
                                        Intrinsics.checkNotNullExpressionValue(useCases2, "");
                                        UseCase[] useCaseArr2 = (UseCase[]) useCases2.toArray(new UseCase[0]);
                                        arrayList.add(bindToLifecycle$camera_lifecycle_release(lifecycleOwner2, cameraSelector4, null, layoutSettings3, layoutSettings4, viewPort2, effects2, (UseCase[]) Arrays.copyOf(useCaseArr2, useCaseArr2.length)));
                                    }
                                }
                                LifecycleOwner lifecycleOwner3 = singleCameraConfig2.getLifecycleOwner();
                                Intrinsics.checkNotNullExpressionValue(lifecycleOwner3, "");
                                CameraSelector cameraSelector5 = singleCameraConfig2.getCameraSelector();
                                Intrinsics.checkNotNullExpressionValue(cameraSelector5, "");
                                CameraSelector cameraSelector6 = singleCameraConfig4.getCameraSelector();
                                LayoutSettings layoutSettings5 = singleCameraConfig2.getLayoutSettings();
                                Intrinsics.checkNotNullExpressionValue(layoutSettings5, "");
                                LayoutSettings layoutSettings6 = singleCameraConfig4.getLayoutSettings();
                                Intrinsics.checkNotNullExpressionValue(layoutSettings6, "");
                                ViewPort viewPort3 = singleCameraConfig2.getUseCaseGroup().getViewPort();
                                List<CameraEffect> effects3 = singleCameraConfig2.getUseCaseGroup().getEffects();
                                Intrinsics.checkNotNullExpressionValue(effects3, "");
                                List<UseCase> useCases3 = singleCameraConfig2.getUseCaseGroup().getUseCases();
                                Intrinsics.checkNotNullExpressionValue(useCases3, "");
                                UseCase[] useCaseArr3 = (UseCase[]) useCases3.toArray(new UseCase[0]);
                                arrayList.add(bindToLifecycle$camera_lifecycle_release(lifecycleOwner3, cameraSelector5, cameraSelector6, layoutSettings5, layoutSettings6, viewPort3, effects3, (UseCase[]) Arrays.copyOf(useCaseArr3, useCaseArr3.length)));
                            } else {
                                if (isPreview(useCase3)) {
                                    Intrinsics.checkNotNullExpressionValue(useCase4, "");
                                    if (isVideoCapture(useCase4)) {
                                        LifecycleOwner lifecycleOwner4 = singleCameraConfig2.getLifecycleOwner();
                                        Intrinsics.checkNotNullExpressionValue(lifecycleOwner4, "");
                                        CameraSelector cameraSelector7 = singleCameraConfig2.getCameraSelector();
                                        Intrinsics.checkNotNullExpressionValue(cameraSelector7, "");
                                        CameraSelector cameraSelector8 = singleCameraConfig4.getCameraSelector();
                                        LayoutSettings layoutSettings7 = singleCameraConfig2.getLayoutSettings();
                                        Intrinsics.checkNotNullExpressionValue(layoutSettings7, "");
                                        LayoutSettings layoutSettings8 = singleCameraConfig4.getLayoutSettings();
                                        Intrinsics.checkNotNullExpressionValue(layoutSettings8, "");
                                        ViewPort viewPort4 = singleCameraConfig2.getUseCaseGroup().getViewPort();
                                        List<CameraEffect> effects4 = singleCameraConfig2.getUseCaseGroup().getEffects();
                                        Intrinsics.checkNotNullExpressionValue(effects4, "");
                                        List<UseCase> useCases4 = singleCameraConfig2.getUseCaseGroup().getUseCases();
                                        Intrinsics.checkNotNullExpressionValue(useCases4, "");
                                        UseCase[] useCaseArr4 = (UseCase[]) useCases4.toArray(new UseCase[0]);
                                        arrayList.add(bindToLifecycle$camera_lifecycle_release(lifecycleOwner4, cameraSelector7, cameraSelector8, layoutSettings7, layoutSettings8, viewPort4, effects4, (UseCase[]) Arrays.copyOf(useCaseArr4, useCaseArr4.length)));
                                    }
                                }
                                while (r0.hasNext()) {
                                    Intrinsics.checkNotNull(singleCameraConfig6);
                                    LifecycleOwner lifecycleOwner5 = singleCameraConfig6.getLifecycleOwner();
                                    Intrinsics.checkNotNullExpressionValue(lifecycleOwner5, "");
                                    CameraSelector cameraSelector9 = singleCameraConfig6.getCameraSelector();
                                    Intrinsics.checkNotNullExpressionValue(cameraSelector9, "");
                                    LayoutSettings layoutSettings9 = LayoutSettings.DEFAULT;
                                    Intrinsics.checkNotNullExpressionValue(layoutSettings9, "");
                                    LayoutSettings layoutSettings10 = LayoutSettings.DEFAULT;
                                    Intrinsics.checkNotNullExpressionValue(layoutSettings10, "");
                                    ViewPort viewPort5 = singleCameraConfig6.getUseCaseGroup().getViewPort();
                                    List<CameraEffect> effects5 = singleCameraConfig6.getUseCaseGroup().getEffects();
                                    Intrinsics.checkNotNullExpressionValue(effects5, "");
                                    List<UseCase> useCases5 = singleCameraConfig6.getUseCaseGroup().getUseCases();
                                    Intrinsics.checkNotNullExpressionValue(useCases5, "");
                                    UseCase[] useCaseArr5 = (UseCase[]) useCases5.toArray(new UseCase[0]);
                                    arrayList.add(bindToLifecycle$camera_lifecycle_release(lifecycleOwner5, cameraSelector9, null, layoutSettings9, layoutSettings10, viewPort5, effects5, (UseCase[]) Arrays.copyOf(useCaseArr5, useCaseArr5.length)));
                                }
                            }
                        } else {
                            while (r0.hasNext()) {
                                Intrinsics.checkNotNull(singleCameraConfig6);
                                LifecycleOwner lifecycleOwner6 = singleCameraConfig6.getLifecycleOwner();
                                Intrinsics.checkNotNullExpressionValue(lifecycleOwner6, "");
                                CameraSelector cameraSelector10 = singleCameraConfig6.getCameraSelector();
                                Intrinsics.checkNotNullExpressionValue(cameraSelector10, "");
                                LayoutSettings layoutSettings11 = LayoutSettings.DEFAULT;
                                Intrinsics.checkNotNullExpressionValue(layoutSettings11, "");
                                LayoutSettings layoutSettings12 = LayoutSettings.DEFAULT;
                                Intrinsics.checkNotNullExpressionValue(layoutSettings12, "");
                                ViewPort viewPort6 = singleCameraConfig6.getUseCaseGroup().getViewPort();
                                List<CameraEffect> effects6 = singleCameraConfig6.getUseCaseGroup().getEffects();
                                Intrinsics.checkNotNullExpressionValue(effects6, "");
                                List<UseCase> useCases6 = singleCameraConfig6.getUseCaseGroup().getUseCases();
                                Intrinsics.checkNotNullExpressionValue(useCases6, "");
                                UseCase[] useCaseArr6 = (UseCase[]) useCases6.toArray(new UseCase[0]);
                                arrayList.add(bindToLifecycle$camera_lifecycle_release(lifecycleOwner6, cameraSelector10, null, layoutSettings11, layoutSettings12, viewPort6, effects6, (UseCase[]) Arrays.copyOf(useCaseArr6, useCaseArr6.length)));
                            }
                        }
                        setActiveConcurrentCameraInfos(arrayList3);
                    } catch (IllegalArgumentException unused) {
                        throw new IllegalArgumentException("Invalid camera selectors in camera configs.");
                    }
                } else {
                    throw new UnsupportedOperationException("Concurrent camera is not supported on the device.");
                }
            }
            ConcurrentCamera concurrentCamera = new ConcurrentCamera(arrayList);
            Trace.endSection();
            return concurrentCamera;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final Camera bindToLifecycle$camera_lifecycle_release(LifecycleOwner p0, CameraSelector p1, CameraSelector p2, LayoutSettings p3, LayoutSettings p4, ViewPort p5, List<? extends CameraEffect> p6, UseCase... p7) {
        CameraInternal cameraInternal;
        RestrictedCameraInfo restrictedCameraInfo;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p6, "");
        Intrinsics.checkNotNullParameter(p7, "");
        Trace.beginSection("CX:bindToLifecycle-internal");
        try {
            Threads.checkMainThread();
            CameraX cameraX = this.mCameraX;
            Intrinsics.checkNotNull(cameraX);
            CameraInternal cameraInternalSelect = p1.select(cameraX.getCameraRepository().getCameras());
            Intrinsics.checkNotNullExpressionValue(cameraInternalSelect, "");
            cameraInternalSelect.setPrimary(true);
            CameraInfo cameraInfo = getCameraInfo(p1);
            Intrinsics.checkNotNull(cameraInfo, "");
            RestrictedCameraInfo restrictedCameraInfo2 = (RestrictedCameraInfo) cameraInfo;
            if (p2 != null) {
                CameraX cameraX2 = this.mCameraX;
                Intrinsics.checkNotNull(cameraX2);
                CameraInternal cameraInternalSelect2 = p2.select(cameraX2.getCameraRepository().getCameras());
                cameraInternalSelect2.setPrimary(false);
                CameraInfo cameraInfo2 = getCameraInfo(p2);
                Intrinsics.checkNotNull(cameraInfo2, "");
                cameraInternal = cameraInternalSelect2;
                restrictedCameraInfo = (RestrictedCameraInfo) cameraInfo2;
            } else {
                cameraInternal = null;
                restrictedCameraInfo = null;
            }
            LifecycleCamera lifecycleCamera = this.mLifecycleCameraRepository.getLifecycleCamera(p0, CameraUseCaseAdapter.generateCameraId(restrictedCameraInfo2, restrictedCameraInfo));
            Collection<LifecycleCamera> lifecycleCameras = this.mLifecycleCameraRepository.getLifecycleCameras();
            for (UseCase useCase : ArraysKt.filterNotNull(p7)) {
                for (LifecycleCamera lifecycleCamera2 : lifecycleCameras) {
                    Intrinsics.checkNotNullExpressionValue(lifecycleCamera2, "");
                    LifecycleCamera lifecycleCamera3 = lifecycleCamera2;
                    if (lifecycleCamera3.isBound(useCase) && !Intrinsics.areEqual(lifecycleCamera3, lifecycleCamera)) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String str = String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{useCase}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        throw new IllegalStateException(str);
                    }
                }
            }
            if (lifecycleCamera == null) {
                LifecycleCameraRepository lifecycleCameraRepository = this.mLifecycleCameraRepository;
                CameraX cameraX3 = this.mCameraX;
                Intrinsics.checkNotNull(cameraX3);
                CameraCoordinator cameraCoordinator = cameraX3.getCameraFactory().getCameraCoordinator();
                CameraX cameraX4 = this.mCameraX;
                Intrinsics.checkNotNull(cameraX4);
                CameraDeviceSurfaceManager cameraDeviceSurfaceManager = cameraX4.getCameraDeviceSurfaceManager();
                CameraX cameraX5 = this.mCameraX;
                Intrinsics.checkNotNull(cameraX5);
                lifecycleCamera = lifecycleCameraRepository.createLifecycleCamera(p0, new CameraUseCaseAdapter(cameraInternalSelect, cameraInternal, restrictedCameraInfo2, restrictedCameraInfo, p3, p4, cameraCoordinator, cameraDeviceSurfaceManager, cameraX5.getDefaultConfigFactory()));
            }
            if (p7.length != 0) {
                LifecycleCameraRepository lifecycleCameraRepository2 = this.mLifecycleCameraRepository;
                Intrinsics.checkNotNull(lifecycleCamera);
                List listListOf = CollectionsKt.listOf(Arrays.copyOf(p7, p7.length));
                CameraX cameraX6 = this.mCameraX;
                Intrinsics.checkNotNull(cameraX6);
                lifecycleCameraRepository2.bindToLifecycleCamera(lifecycleCamera, p5, p6, listListOf, cameraX6.getCameraFactory().getCameraCoordinator());
            } else {
                Intrinsics.checkNotNull(lifecycleCamera);
            }
            Trace.endSection();
            return lifecycleCamera;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public final void unbind(UseCase... p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Trace.beginSection("CX:unbind");
        try {
            Threads.checkMainThread();
            if (getCameraOperatingMode() != 2) {
                this.mLifecycleCameraRepository.unbind(CollectionsKt.listOf(Arrays.copyOf(p0, p0.length)));
                Unit unit = Unit.INSTANCE;
                Trace.endSection();
                return;
            }
            throw new UnsupportedOperationException("Unbind usecase is not supported in concurrent camera mode, call unbindAll() first.");
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public final void unbindAll() {
        Trace.beginSection("CX:unbindAll");
        try {
            Threads.checkMainThread();
            setCameraOperatingMode(0);
            this.mLifecycleCameraRepository.unbindAll();
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public final boolean hasCamera(CameraSelector p0) throws CameraInfoUnavailableException {
        boolean z;
        Intrinsics.checkNotNullParameter(p0, "");
        Trace.beginSection("CX:hasCamera");
        try {
            CameraX cameraX = this.mCameraX;
            Intrinsics.checkNotNull(cameraX);
            p0.select(cameraX.getCameraRepository().getCameras());
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        } finally {
            Trace.endSection();
        }
        return z;
    }

    @Override // androidx.camera.core.CameraProvider
    public final List<CameraInfo> getAvailableCameraInfos() {
        Trace.beginSection("CX:getAvailableCameraInfos");
        try {
            ArrayList arrayList = new ArrayList();
            CameraX cameraX = this.mCameraX;
            Intrinsics.checkNotNull(cameraX);
            LinkedHashSet<CameraInternal> cameras = cameraX.getCameraRepository().getCameras();
            Intrinsics.checkNotNullExpressionValue(cameras, "");
            Iterator<CameraInternal> it = cameras.iterator();
            while (it.hasNext()) {
                CameraInfo cameraInfo = it.next().getCameraInfo();
                Intrinsics.checkNotNullExpressionValue(cameraInfo, "");
                arrayList.add(cameraInfo);
            }
            Trace.endSection();
            return arrayList;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final List<List<CameraInfo>> getAvailableConcurrentCameraInfos() {
        Trace.beginSection("CX:getAvailableConcurrentCameraInfos");
        try {
            Objects.requireNonNull(this.mCameraX);
            CameraX cameraX = this.mCameraX;
            Intrinsics.checkNotNull(cameraX);
            Objects.requireNonNull(cameraX.getCameraFactory().getCameraCoordinator());
            CameraX cameraX2 = this.mCameraX;
            Intrinsics.checkNotNull(cameraX2);
            List<List<CameraSelector>> concurrentCameraSelectors = cameraX2.getCameraFactory().getCameraCoordinator().getConcurrentCameraSelectors();
            Intrinsics.checkNotNullExpressionValue(concurrentCameraSelectors, "");
            ArrayList arrayList = new ArrayList();
            for (List<CameraSelector> list : concurrentCameraSelectors) {
                ArrayList arrayList2 = new ArrayList();
                for (CameraSelector cameraSelector : list) {
                    try {
                        Intrinsics.checkNotNullExpressionValue(cameraSelector, "");
                        arrayList2.add(getCameraInfo(cameraSelector));
                    } catch (IllegalArgumentException unused) {
                    }
                }
                arrayList.add(arrayList2);
            }
            return arrayList;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public final CameraInfo getCameraInfo(CameraSelector p0) {
        Object restrictedCameraInfo;
        Intrinsics.checkNotNullParameter(p0, "");
        Trace.beginSection("CX:getCameraInfo");
        try {
            CameraX cameraX = this.mCameraX;
            Intrinsics.checkNotNull(cameraX);
            CameraInfoInternal cameraInfoInternal = p0.select(cameraX.getCameraRepository().getCameras()).getCameraInfoInternal();
            Intrinsics.checkNotNullExpressionValue(cameraInfoInternal, "");
            CameraConfig cameraConfig = getCameraConfig(p0, cameraInfoInternal);
            CameraUseCaseAdapter.CameraId cameraIdCreate = CameraUseCaseAdapter.CameraId.create(cameraInfoInternal.getCameraId(), cameraConfig.getCompatibilityId());
            Intrinsics.checkNotNullExpressionValue(cameraIdCreate, "");
            synchronized (this.mLock) {
                restrictedCameraInfo = this.mCameraInfoMap.get(cameraIdCreate);
                if (restrictedCameraInfo == null) {
                    restrictedCameraInfo = new RestrictedCameraInfo(cameraInfoInternal, cameraConfig);
                    this.mCameraInfoMap.put(cameraIdCreate, restrictedCameraInfo);
                }
                Unit unit = Unit.INSTANCE;
            }
            RestrictedCameraInfo restrictedCameraInfo2 = (RestrictedCameraInfo) restrictedCameraInfo;
            Trace.endSection();
            return restrictedCameraInfo2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureInstanceInternal(final CameraXConfig p0) {
        Trace.beginSection("CX:configureInstanceInternal");
        try {
            synchronized (this.mLock) {
                Preconditions.checkNotNull(p0);
                Preconditions.checkState(this.mCameraXConfigProvider == null, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
                this.mCameraXConfigProvider = new CameraXConfig.Provider() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$configureInstanceInternal$1$1$1
                    @Override // androidx.camera.core.CameraXConfig.Provider
                    public final CameraXConfig getCameraXConfig() {
                        return p0;
                    }
                };
                Unit unit = Unit.INSTANCE;
            }
            Unit unit2 = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @JvmStatic
    public static final void configureInstance(CameraXConfig cameraXConfig) {
        INSTANCE.configureInstance(cameraXConfig);
    }

    @JvmStatic
    public static final ListenableFuture<ProcessCameraProvider> getInstance(Context context) {
        return INSTANCE.getInstance(context);
    }
}
