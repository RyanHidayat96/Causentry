package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Transformation;
import defpackage.CameraEffect;
import defpackage.CameraExecutor1;
import defpackage.CameraFilter;
import defpackage.CameraInfo;
import defpackage.CameraInfoImplementationType;
import defpackage.CameraProvider;
import defpackage.CameraSelector;
import defpackage.CameraSelectorBuilder;
import defpackage.CameraState;
import defpackage.CameraStateErrorType;
import defpackage.CameraStateStateError;
import defpackage.CameraStateType;
import defpackage.attach;
import defpackage.createImageReaderProxy;
import defpackage.decreaseMinLogLevelReference;
import defpackage.getCameraControl;
import defpackage.getLayoutSettings;
import defpackage.getOutputOption;
import defpackage.getSchedulerHandler;
import defpackage.getTargetRotation;
import defpackage.isMirroring;
import defpackage.isUseCasesCombinationSupportedByFramework;
import defpackage.mustPlayShutterSound;
import defpackage.requireLensFacing;
import defpackage.setRotationDegrees;
import defpackage.setTargetResolution;
import defpackage.traceExecutionState;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class DecodeJob<R> implements CameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1, Runnable, Comparable<DecodeJob<?>>, createImageReaderProxy.TuitionPaymentFragmentbindingInflater1 {
    public int INotificationSideChannel;
    public RunReason INotificationSideChannelDefault;
    public getCameraControl INotificationSideChannelStubProxy;
    private Object IconCompatParcelizer;
    private DataSource MediaBrowserCompat;
    public Priority RemoteActionCompatParcelizer;
    public TuitionPaymentFragmentspecialinlinedviewModeldefault2<R> TuitionPaymentFragmentbindingInflater1;
    getCameraControl TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TuitionPaymentFragmentspecialinlinedviewModeldefault1 f675a;
    public int asBinder;
    public setRotationDegrees asInterface;
    public volatile CameraInfo b;
    public CameraSelectorBuilder cancel;
    public boolean cancelAll;
    private Thread connect;
    public volatile boolean d;
    private Stage disconnect;
    public CameraSelector g;
    private final Pools.Pool<DecodeJob<?>> getExtras;
    public int getInterfaceDescriptor;
    private boolean getItem;
    private long getNotifyChildrenChangedOptions;
    private volatile boolean getRoot;
    public Object notify;
    public getTargetRotation onTransact;
    private isUseCasesCombinationSupportedByFramework<?> read;
    private getCameraControl write;
    public final CameraFilter<R> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new CameraFilter<>();
    private final List<Throwable> search = new ArrayList();
    private final attach isConnected = new attach.TuitionPaymentFragmentbindingInflater1();
    final b<?> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new b<>();
    public final TuitionPaymentFragmentspecialinlinedviewModeldefault3 INotificationSideChannelStub = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    public enum RunReason {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    public enum Stage {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        traceExecutionState TuitionPaymentFragmentbindingInflater1();
    }

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault2<R> {
        void TuitionPaymentFragmentbindingInflater1(GlideException glideException);

        void TuitionPaymentFragmentbindingInflater1(Resource<R> resource, DataSource dataSource, boolean z);

        void TuitionPaymentFragmentspecialinlinedviewModeldefault3(DecodeJob<?> decodeJob);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(DecodeJob<?> decodeJob) {
        DecodeJob<?> decodeJob2 = decodeJob;
        int iOrdinal = this.RemoteActionCompatParcelizer.ordinal() - decodeJob2.RemoteActionCompatParcelizer.ordinal();
        return iOrdinal == 0 ? this.INotificationSideChannel - decodeJob2.INotificationSideChannel : iOrdinal;
    }

    public DecodeJob(TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, Pools.Pool<DecodeJob<?>> pool) {
        this.f675a = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.getExtras = pool;
    }

    public final void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.INotificationSideChannelStub;
        synchronized (tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 = false;
        }
        b<?> bVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        bVar.TuitionPaymentFragmentbindingInflater1 = null;
        bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        bVar.b = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        this.getRoot = false;
        this.asInterface = null;
        this.INotificationSideChannelStubProxy = null;
        this.onTransact = null;
        this.RemoteActionCompatParcelizer = null;
        this.cancel = null;
        this.TuitionPaymentFragmentbindingInflater1 = null;
        this.disconnect = null;
        this.b = null;
        this.connect = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        this.IconCompatParcelizer = null;
        this.MediaBrowserCompat = null;
        this.read = null;
        this.getNotifyChildrenChangedOptions = 0L;
        this.d = false;
        this.notify = null;
        this.search.clear();
        this.getExtras.release(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        isUseCasesCombinationSupportedByFramework<?> isusecasescombinationsupportedbyframework = this.read;
        try {
            try {
                if (this.d) {
                    d();
                    if (isusecasescombinationsupportedbyframework != null) {
                        isusecasescombinationsupportedbyframework.b();
                        return;
                    }
                    return;
                }
                int i = AnonymousClass3.TuitionPaymentFragmentspecialinlinedviewModeldefault1[this.INotificationSideChannelDefault.ordinal()];
                if (i == 1) {
                    this.disconnect = TuitionPaymentFragmentbindingInflater1(Stage.INITIALIZE);
                    this.b = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    asInterface();
                } else if (i == 2) {
                    asInterface();
                } else if (i == 3) {
                    TuitionPaymentFragmentbindingInflater1();
                } else {
                    StringBuilder sb = new StringBuilder("Unrecognized run reason: ");
                    sb.append(this.INotificationSideChannelDefault);
                    throw new IllegalStateException(sb.toString());
                }
                if (isusecasescombinationsupportedbyframework != null) {
                    isusecasescombinationsupportedbyframework.b();
                }
            } catch (Throwable th) {
                if (isusecasescombinationsupportedbyframework != null) {
                    isusecasescombinationsupportedbyframework.b();
                }
                throw th;
            }
        } catch (CallbackException e2) {
            throw e2;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Objects.toString(this.disconnect);
            }
            if (this.disconnect != Stage.ENCODE) {
                this.search.add(th2);
                d();
            }
            if (!this.d) {
                throw th2;
            }
            throw th2;
        }
    }

    private CameraInfo TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = AnonymousClass3.TuitionPaymentFragmentspecialinlinedviewModeldefault2[this.disconnect.ordinal()];
        if (i == 1) {
            return new CameraStateType(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this);
        }
        if (i == 2) {
            return new CameraExecutor1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this);
        }
        if (i == 3) {
            return new decreaseMinLogLevelReference(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this);
        }
        if (i == 4) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Unrecognized stage: ");
        sb.append(this.disconnect);
        throw new IllegalStateException(sb.toString());
    }

    private void asInterface() {
        this.connect = Thread.currentThread();
        this.getNotifyChildrenChangedOptions = setTargetResolution.TuitionPaymentFragmentbindingInflater1();
        boolean zB = false;
        while (!this.d && this.b != null && !(zB = this.b.b())) {
            this.disconnect = TuitionPaymentFragmentbindingInflater1(this.disconnect);
            this.b = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            if (this.disconnect == Stage.SOURCE) {
                this.INotificationSideChannelDefault = RunReason.SWITCH_TO_SOURCE_SERVICE;
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
                return;
            }
        }
        if ((this.disconnect == Stage.FINISHED || this.d) && !zB) {
            d();
        }
    }

    private void d() {
        a();
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(new GlideException("Failed to load resource", new ArrayList(this.search)));
        if (this.INotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            b();
        }
    }

    private void a() {
        Throwable th;
        this.isConnected.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (this.getRoot) {
            if (this.search.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.search;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.getRoot = true;
    }

    public final Stage TuitionPaymentFragmentbindingInflater1(Stage stage) {
        while (true) {
            int i = AnonymousClass3.TuitionPaymentFragmentspecialinlinedviewModeldefault2[stage.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return this.cancelAll ? Stage.FINISHED : Stage.SOURCE;
                }
                if (i == 3 || i == 4) {
                    return Stage.FINISHED;
                }
                if (i == 5) {
                    if (this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                        return Stage.RESOURCE_CACHE;
                    }
                    stage = Stage.RESOURCE_CACHE;
                } else {
                    throw new IllegalArgumentException("Unrecognized stage: ".concat(String.valueOf(stage)));
                }
            } else {
                if (this.g.b()) {
                    return Stage.DATA_CACHE;
                }
                stage = Stage.DATA_CACHE;
            }
        }
    }

    @Override // CameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.INotificationSideChannelDefault = RunReason.SWITCH_TO_SOURCE_SERVICE;
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
    }

    @Override // CameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getCameraControl getcameracontrol, Object obj, isUseCasesCombinationSupportedByFramework<?> isusecasescombinationsupportedbyframework, DataSource dataSource, getCameraControl getcameracontrol2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getcameracontrol;
        this.IconCompatParcelizer = obj;
        this.read = isusecasescombinationsupportedbyframework;
        this.MediaBrowserCompat = dataSource;
        this.write = getcameracontrol2;
        this.getItem = getcameracontrol != this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3().get(0);
        if (Thread.currentThread() == this.connect) {
            TuitionPaymentFragmentbindingInflater1();
        } else {
            this.INotificationSideChannelDefault = RunReason.DECODE_DATA;
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        }
    }

    @Override // CameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1
    public final void TuitionPaymentFragmentbindingInflater1(getCameraControl getcameracontrol, Exception exc, isUseCasesCombinationSupportedByFramework<?> isusecasescombinationsupportedbyframework, DataSource dataSource) {
        isusecasescombinationsupportedbyframework.b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        Class<?> clsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isusecasescombinationsupportedbyframework.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        glideException.key = getcameracontrol;
        glideException.dataSource = dataSource;
        glideException.dataClass = clsTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.search.add(glideException);
        if (Thread.currentThread() == this.connect) {
            asInterface();
        } else {
            this.INotificationSideChannelDefault = RunReason.SWITCH_TO_SOURCE_SERVICE;
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        }
    }

    private void TuitionPaymentFragmentbindingInflater1() {
        Resource<R> resourceTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.getNotifyChildrenChangedOptions;
            StringBuilder sb = new StringBuilder("data: ");
            sb.append(this.IconCompatParcelizer);
            sb.append(", cache key: ");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            sb.append(", fetcher: ");
            sb.append(this.read);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1("Retrieved data", j, sb.toString());
        }
        CameraStateErrorType cameraStateErrorTypeB = null;
        try {
            resourceTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.read, this.IconCompatParcelizer, this.MediaBrowserCompat);
        } catch (GlideException e2) {
            getCameraControl getcameracontrol = this.write;
            DataSource dataSource = this.MediaBrowserCompat;
            e2.key = getcameracontrol;
            e2.dataSource = dataSource;
            e2.dataClass = null;
            this.search.add(e2);
            resourceTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        }
        if (resourceTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            DataSource dataSource2 = this.MediaBrowserCompat;
            boolean z = this.getItem;
            if (resourceTuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof requireLensFacing) {
                ((requireLensFacing) resourceTuitionPaymentFragmentspecialinlinedviewModeldefault1).b();
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b != null) {
                cameraStateErrorTypeB = CameraStateErrorType.b(resourceTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                resourceTuitionPaymentFragmentspecialinlinedviewModeldefault1 = cameraStateErrorTypeB;
            }
            a();
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(resourceTuitionPaymentFragmentspecialinlinedviewModeldefault1, dataSource2, z);
            this.disconnect = Stage.ENCODE;
            try {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b != null) {
                    b<?> bVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    try {
                        this.f675a.TuitionPaymentFragmentbindingInflater1().b(bVar.TuitionPaymentFragmentbindingInflater1, new mustPlayShutterSound(bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3, bVar.b, this.onTransact));
                        bVar.b.b();
                    } catch (Throwable th) {
                        bVar.b.b();
                        throw th;
                    }
                }
                if (cameraStateErrorTypeB != null) {
                    cameraStateErrorTypeB.b();
                }
                if (this.INotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                    b();
                    return;
                }
                return;
            } catch (Throwable th2) {
                if (cameraStateErrorTypeB != null) {
                    cameraStateErrorTypeB.b();
                }
                throw th2;
            }
        }
        asInterface();
    }

    private <Data> Resource<R> TuitionPaymentFragmentspecialinlinedviewModeldefault1(isUseCasesCombinationSupportedByFramework<?> isusecasescombinationsupportedbyframework, Data data, DataSource dataSource) throws GlideException {
        if (data != null) {
            try {
                long jTuitionPaymentFragmentbindingInflater1 = setTargetResolution.TuitionPaymentFragmentbindingInflater1();
                CameraFilter<R> cameraFilter = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Resource<R> resourceTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(data, dataSource, cameraFilter.b.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(data.getClass(), cameraFilter.d, cameraFilter.cancelAll));
                if (Log.isLoggable("DecodeJob", 2)) {
                    StringBuilder sb = new StringBuilder("Decoded result ");
                    sb.append(resourceTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), jTuitionPaymentFragmentbindingInflater1, (String) null);
                }
                return resourceTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } finally {
                isusecasescombinationsupportedbyframework.b();
            }
        }
        isusecasescombinationsupportedbyframework.b();
        return null;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, long j, String str2) {
        setTargetResolution.TuitionPaymentFragmentbindingInflater1(j);
        Objects.toString(this.cancel);
        if (str2 != null) {
            ", ".concat(String.valueOf(str2));
        }
        Thread.currentThread().getName();
    }

    @Override // createImageReaderProxy.TuitionPaymentFragmentbindingInflater1
    public final attach e_() {
        return this.isConnected;
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] TuitionPaymentFragmentbindingInflater1;
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            TuitionPaymentFragmentbindingInflater1 = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Stage.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iArr2;
            try {
                iArr2[Stage.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[Stage.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[Stage.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[Stage.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[Stage.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[RunReason.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iArr3;
            try {
                iArr3[RunReason.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[RunReason.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[RunReason.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    final class TuitionPaymentFragmentbindingInflater1<Z> implements CameraProvider.TuitionPaymentFragmentbindingInflater1<Z> {
        private final DataSource TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentbindingInflater1(DataSource dataSource) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = dataSource;
        }

        @Override // CameraProvider.TuitionPaymentFragmentbindingInflater1
        public final Resource<Z> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Resource<Z> resource) {
            Resource<Z> resourceTransform;
            Transformation<Z> transformation;
            EncodeStrategy encodeStrategyTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            getCameraControl cameraInfoImplementationType;
            DecodeJob decodeJob = DecodeJob.this;
            DataSource dataSource = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Class<?> cls = resource.TuitionPaymentFragmentbindingInflater1().getClass();
            CameraEffect<Z> cameraEffectB = null;
            if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
                Transformation<Z> transformationTuitionPaymentFragmentbindingInflater1 = decodeJob.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(cls);
                transformation = transformationTuitionPaymentFragmentbindingInflater1;
                resourceTransform = transformationTuitionPaymentFragmentbindingInflater1.transform(decodeJob.asInterface, resource, decodeJob.getInterfaceDescriptor, decodeJob.asBinder);
            } else {
                resourceTransform = resource;
                transformation = null;
            }
            if (!resource.equals(resourceTransform)) {
                resource.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
            if (decodeJob.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(resourceTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) == null) {
                encodeStrategyTuitionPaymentFragmentspecialinlinedviewModeldefault3 = EncodeStrategy.NONE;
            } else {
                cameraEffectB = decodeJob.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(resourceTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                if (cameraEffectB != null) {
                    encodeStrategyTuitionPaymentFragmentspecialinlinedviewModeldefault3 = cameraEffectB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(decodeJob.onTransact);
                } else {
                    throw new Registry.NoResultEncoderAvailableException(resourceTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                }
            }
            CameraEffect<Z> cameraEffect = cameraEffectB;
            CameraFilter<R> cameraFilter = decodeJob.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            getCameraControl getcameracontrol = decodeJob.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            List<getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<?>> listB = cameraFilter.b();
            int size = listB.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                if (listB.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault2.equals(getcameracontrol)) {
                    z = true;
                    break;
                }
            }
            if (!decodeJob.g.TuitionPaymentFragmentspecialinlinedviewModeldefault1(!z, dataSource, encodeStrategyTuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                return resourceTransform;
            }
            if (cameraEffect == null) {
                throw new Registry.NoResultEncoderAvailableException(resourceTransform.TuitionPaymentFragmentbindingInflater1().getClass());
            }
            int i2 = AnonymousClass3.TuitionPaymentFragmentbindingInflater1[encodeStrategyTuitionPaymentFragmentspecialinlinedviewModeldefault3.ordinal()];
            if (i2 == 1) {
                cameraInfoImplementationType = new CameraInfoImplementationType(decodeJob.TuitionPaymentFragmentspecialinlinedviewModeldefault2, decodeJob.INotificationSideChannelStubProxy);
            } else if (i2 == 2) {
                cameraInfoImplementationType = new CameraState(decodeJob.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1, decodeJob.TuitionPaymentFragmentspecialinlinedviewModeldefault2, decodeJob.INotificationSideChannelStubProxy, decodeJob.getInterfaceDescriptor, decodeJob.asBinder, transformation, cls, decodeJob.onTransact);
            } else {
                throw new IllegalArgumentException("Unknown strategy: ".concat(String.valueOf(encodeStrategyTuitionPaymentFragmentspecialinlinedviewModeldefault3)));
            }
            CameraStateErrorType<Z> cameraStateErrorTypeB = CameraStateErrorType.b(resourceTransform);
            b<?> bVar = decodeJob.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            bVar.TuitionPaymentFragmentbindingInflater1 = cameraInfoImplementationType;
            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cameraEffect;
            bVar.b = cameraStateErrorTypeB;
            return cameraStateErrorTypeB;
        }
    }

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        boolean TuitionPaymentFragmentbindingInflater1;
        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(boolean z) {
            boolean z2;
            synchronized (this) {
                z2 = true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                if (!this.TuitionPaymentFragmentbindingInflater1 && !this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    z2 = false;
                }
            }
            return z2;
        }

        final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            boolean z;
            synchronized (this) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            return z;
        }

        final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            boolean z;
            synchronized (this) {
                this.TuitionPaymentFragmentbindingInflater1 = true;
                z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            return z;
        }
    }

    static class b<Z> {
        getCameraControl TuitionPaymentFragmentbindingInflater1;
        CameraEffect<Z> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        CameraStateErrorType<Z> b;

        b() {
        }
    }

    private <Data, ResourceType> Resource<R> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Data data, DataSource dataSource, CameraStateStateError<Data, ResourceType, R> cameraStateStateError) throws GlideException {
        getTargetRotation gettargetrotation = this.onTransact;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = dataSource == DataSource.RESOURCE_DISK_CACHE || this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            isMirroring<Boolean> ismirroring = getLayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Boolean bool = (Boolean) (gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.containsKey(ismirroring) ? gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(ismirroring) : ismirroring.b);
            if (bool == null || (bool.booleanValue() && !z)) {
                gettargetrotation = new getTargetRotation();
                gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.putAll((SimpleArrayMap<? extends isMirroring<?>, ? extends Object>) this.onTransact.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.put(getLayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1, Boolean.valueOf(z));
            }
        }
        getTargetRotation gettargetrotation2 = gettargetrotation;
        getOutputOption<Data> getoutputoptionB = this.asInterface.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(data);
        try {
            return cameraStateStateError.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getoutputoptionB, gettargetrotation2, this.getInterfaceDescriptor, this.asBinder, new TuitionPaymentFragmentbindingInflater1(dataSource));
        } finally {
            getoutputoptionB.TuitionPaymentFragmentbindingInflater1();
        }
    }
}
