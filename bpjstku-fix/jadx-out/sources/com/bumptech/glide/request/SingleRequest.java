package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.Resource;
import defpackage.AutoValue_SurfaceOutput_CameraInputInfo;
import defpackage.ExperimentalMirrorMode;
import defpackage.ImageAnalysisBackpressureStrategy;
import defpackage.ImageAnalysisBuilder;
import defpackage.attach;
import defpackage.getAvailableCameraInfos;
import defpackage.getTargetCoordinateSystem;
import defpackage.getUpdatedCropRect;
import defpackage.setDefaultResolution;
import defpackage.setHighResolutionDisabled;
import defpackage.setMaxResolution;
import defpackage.setRotationDegrees;
import defpackage.setTargetResolution;
import defpackage.updateTransform;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleRequest<R> implements ImageAnalysisBuilder, setHighResolutionDisabled, ImageAnalysisBackpressureStrategy {
    private static final boolean b = Log.isLoggable("GlideRequest", 2);
    private getAvailableCameraInfos.TuitionPaymentFragmentspecialinlinedviewModeldefault3 INotificationSideChannel;
    private final RequestCoordinator INotificationSideChannelDefault;
    private final Object INotificationSideChannelStub;
    private final Priority INotificationSideChannelStubProxy;
    private Resource<R> IconCompatParcelizer;
    private final attach MediaBrowserCompat;
    private Drawable RemoteActionCompatParcelizer;
    private int TuitionPaymentFragmentbindingInflater1;
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final setMaxResolution<? super R> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Executor TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile getAvailableCameraInfos f677a;
    private final setRotationDegrees asBinder;
    private Drawable asInterface;
    private boolean cancel;
    private final int cancelAll;
    private final BaseRequestOptions<?> connect;
    private Drawable d;
    private final setDefaultResolution<R> disconnect;
    private int g;
    private final String getExtras;
    private final List<getTargetCoordinateSystem<R>> getInterfaceDescriptor;
    private Status getItem;
    private final getTargetCoordinateSystem<R> getNotifyChildrenChangedOptions;
    private final Class<R> getRoot;
    private final int notify;
    private final Object onTransact;
    private RuntimeException read;
    private int sendCustomAction;
    private long write;

    enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public static <R> SingleRequest<R> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, setRotationDegrees setrotationdegrees, Object obj, Object obj2, Class<R> cls, BaseRequestOptions<?> baseRequestOptions, int i, int i2, Priority priority, setDefaultResolution<R> setdefaultresolution, getTargetCoordinateSystem<R> gettargetcoordinatesystem, List<getTargetCoordinateSystem<R>> list, RequestCoordinator requestCoordinator, getAvailableCameraInfos getavailablecamerainfos, setMaxResolution<? super R> setmaxresolution, Executor executor) {
        return new SingleRequest<>(context, setrotationdegrees, obj, obj2, cls, baseRequestOptions, i, i2, priority, setdefaultresolution, gettargetcoordinatesystem, list, requestCoordinator, getavailablecamerainfos, setmaxresolution, executor);
    }

    private SingleRequest(Context context, setRotationDegrees setrotationdegrees, Object obj, Object obj2, Class<R> cls, BaseRequestOptions<?> baseRequestOptions, int i, int i2, Priority priority, setDefaultResolution<R> setdefaultresolution, getTargetCoordinateSystem<R> gettargetcoordinatesystem, List<getTargetCoordinateSystem<R>> list, RequestCoordinator requestCoordinator, getAvailableCameraInfos getavailablecamerainfos, setMaxResolution<? super R> setmaxresolution, Executor executor) {
        this.getExtras = b ? String.valueOf(super.hashCode()) : null;
        this.MediaBrowserCompat = new attach.TuitionPaymentFragmentbindingInflater1();
        this.INotificationSideChannelStub = obj;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = context;
        this.asBinder = setrotationdegrees;
        this.onTransact = obj2;
        this.getRoot = cls;
        this.connect = baseRequestOptions;
        this.notify = i;
        this.cancelAll = i2;
        this.INotificationSideChannelStubProxy = priority;
        this.disconnect = setdefaultresolution;
        this.getNotifyChildrenChangedOptions = gettargetcoordinatesystem;
        this.getInterfaceDescriptor = list;
        this.INotificationSideChannelDefault = requestCoordinator;
        this.f677a = getavailablecamerainfos;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = setmaxresolution;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = executor;
        this.getItem = Status.PENDING;
        if (this.read == null && setrotationdegrees.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3.containsKey(AutoValue_SurfaceOutput_CameraInputInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3.class)) {
            this.read = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // defpackage.ImageAnalysisBuilder
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        RequestCoordinator requestCoordinator;
        synchronized (this.INotificationSideChannelStub) {
            if (!this.cancel) {
                this.MediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                this.write = setTargetResolution.TuitionPaymentFragmentbindingInflater1();
                if (this.onTransact == null) {
                    if (getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.notify, this.cancelAll)) {
                        this.sendCustomAction = this.notify;
                        this.g = this.cancelAll;
                    }
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(new GlideException("Received null model"), d() == null ? 5 : 3);
                    return;
                }
                if (this.getItem == Status.RUNNING) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (this.getItem == Status.COMPLETE) {
                    TuitionPaymentFragmentbindingInflater1(this.IconCompatParcelizer, DataSource.MEMORY_CACHE);
                    return;
                }
                List<getTargetCoordinateSystem<R>> list = this.getInterfaceDescriptor;
                if (list != null) {
                    for (getTargetCoordinateSystem<R> gettargetcoordinatesystem : list) {
                        if (gettargetcoordinatesystem instanceof updateTransform) {
                        }
                    }
                }
                this.TuitionPaymentFragmentbindingInflater1 = -1;
                this.getItem = Status.WAITING_FOR_SIZE;
                if (getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.notify, this.cancelAll)) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.notify, this.cancelAll);
                } else {
                    this.disconnect.getSize(this);
                }
                if ((this.getItem == Status.RUNNING || this.getItem == Status.WAITING_FOR_SIZE) && ((requestCoordinator = this.INotificationSideChannelDefault) == null || requestCoordinator.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this))) {
                    this.disconnect.onLoadStarted(asInterface());
                }
                if (b) {
                    setTargetResolution.TuitionPaymentFragmentbindingInflater1(this.write);
                }
                return;
            }
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @Override // defpackage.ImageAnalysisBuilder
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws IllegalAccessException {
        synchronized (this.INotificationSideChannelStub) {
            if (!this.cancel) {
                this.MediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                if (this.getItem == Status.CLEARED) {
                    return;
                }
                if (!this.cancel) {
                    this.MediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    this.disconnect.removeCallback(this);
                    getAvailableCameraInfos.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.INotificationSideChannel;
                    Resource<R> resource = null;
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                        synchronized (getAvailableCameraInfos.this) {
                            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(tuitionPaymentFragmentspecialinlinedviewModeldefault3.b);
                        }
                        this.INotificationSideChannel = null;
                    }
                    Resource<R> resource2 = this.IconCompatParcelizer;
                    if (resource2 != null) {
                        this.IconCompatParcelizer = null;
                        resource = resource2;
                    }
                    RequestCoordinator requestCoordinator = this.INotificationSideChannelDefault;
                    if (requestCoordinator == null || requestCoordinator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this)) {
                        this.disconnect.onLoadCleared(asInterface());
                    }
                    this.getItem = Status.CLEARED;
                    if (resource != null) {
                        getAvailableCameraInfos.TuitionPaymentFragmentspecialinlinedviewModeldefault3(resource);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            }
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @Override // defpackage.ImageAnalysisBuilder
    public final void g() {
        synchronized (this.INotificationSideChannelStub) {
            if (asBinder()) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
        }
    }

    @Override // defpackage.ImageAnalysisBuilder
    public final boolean asBinder() {
        boolean z;
        synchronized (this.INotificationSideChannelStub) {
            z = this.getItem == Status.RUNNING || this.getItem == Status.WAITING_FOR_SIZE;
        }
        return z;
    }

    @Override // defpackage.ImageAnalysisBuilder
    public final boolean a() {
        boolean z;
        synchronized (this.INotificationSideChannelStub) {
            z = this.getItem == Status.COMPLETE;
        }
        return z;
    }

    @Override // defpackage.ImageAnalysisBuilder
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        boolean z;
        synchronized (this.INotificationSideChannelStub) {
            z = this.getItem == Status.CLEARED;
        }
        return z;
    }

    @Override // defpackage.ImageAnalysisBuilder
    public final boolean TuitionPaymentFragmentbindingInflater1() {
        boolean z;
        synchronized (this.INotificationSideChannelStub) {
            z = this.getItem == Status.COMPLETE;
        }
        return z;
    }

    private Drawable asInterface() {
        if (this.RemoteActionCompatParcelizer == null) {
            Drawable drawable = this.connect.notify;
            this.RemoteActionCompatParcelizer = drawable;
            if (drawable == null && this.connect.onTransact > 0) {
                this.RemoteActionCompatParcelizer = TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.connect.onTransact);
            }
        }
        return this.RemoteActionCompatParcelizer;
    }

    private Drawable d() {
        if (this.d == null) {
            Drawable drawable = this.connect.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.d = drawable;
            if (drawable == null && this.connect.b > 0) {
                this.d = TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.connect.b);
            }
        }
        return this.d;
    }

    private Drawable TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        Resources.Theme theme;
        if (this.connect.getInterfaceDescriptor == null) {
            theme = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getTheme();
        } else {
            theme = this.connect.getInterfaceDescriptor;
        }
        Context context = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return ExperimentalMirrorMode.TuitionPaymentFragmentbindingInflater1(context, context, i, theme);
    }

    @Override // defpackage.setHighResolutionDisabled
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2) throws Throwable {
        Object obj;
        int iRound = i;
        this.MediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Object obj2 = this.INotificationSideChannelStub;
        synchronized (obj2) {
            try {
                boolean z = b;
                if (z) {
                    setTargetResolution.TuitionPaymentFragmentbindingInflater1(this.write);
                }
                if (this.getItem == Status.WAITING_FOR_SIZE) {
                    this.getItem = Status.RUNNING;
                    float f = this.connect.cancelAll;
                    if (iRound != Integer.MIN_VALUE) {
                        iRound = Math.round(iRound * f);
                    }
                    this.sendCustomAction = iRound;
                    this.g = i2 == Integer.MIN_VALUE ? i2 : Math.round(f * i2);
                    if (z) {
                        setTargetResolution.TuitionPaymentFragmentbindingInflater1(this.write);
                    }
                    obj = obj2;
                    try {
                        try {
                            this.INotificationSideChannel = this.f677a.TuitionPaymentFragmentbindingInflater1(this.asBinder, this.onTransact, this.connect.INotificationSideChannel, this.sendCustomAction, this.g, this.connect.cancel, this.getRoot, this.INotificationSideChannelStubProxy, this.connect.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.connect.INotificationSideChannelStubProxy, this.connect.f676a, this.connect.asInterface, this.connect.d, this.connect.asBinder, this.connect.INotificationSideChannelStub, this.connect.INotificationSideChannelDefault, this.connect.g, this, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            if (this.getItem != Status.RUNNING) {
                                this.INotificationSideChannel = null;
                            }
                            if (z) {
                                setTargetResolution.TuitionPaymentFragmentbindingInflater1(this.write);
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r7 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
    
        if (r7 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ImageAnalysisBackpressureStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void TuitionPaymentFragmentbindingInflater1(com.bumptech.glide.load.engine.Resource<?> r7, com.bumptech.glide.load.DataSource r8) throws java.lang.Throwable {
        /*
            r6 = this;
            attach r0 = r6.MediaBrowserCompat
            r0.TuitionPaymentFragmentspecialinlinedviewModeldefault3()
            r0 = 0
            java.lang.Object r1 = r6.INotificationSideChannelStub     // Catch: java.lang.Throwable -> Lb5
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lb5
            r6.INotificationSideChannel = r0     // Catch: java.lang.Throwable -> Lad
            r2 = 5
            if (r7 != 0) goto L2d
            com.bumptech.glide.load.engine.GlideException r7 = new com.bumptech.glide.load.engine.GlideException     // Catch: java.lang.Throwable -> Lad
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad
            java.lang.String r3 = "Expected to receive a Resource<R> with an object of "
            r8.<init>(r3)     // Catch: java.lang.Throwable -> Lad
            java.lang.Class<R> r3 = r6.getRoot     // Catch: java.lang.Throwable -> Lad
            r8.append(r3)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r3 = " inside, but instead got null."
            r8.append(r3)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lad
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lad
            r6.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r7, r2)     // Catch: java.lang.Throwable -> Lad
            monitor-exit(r1)
            return
        L2d:
            java.lang.Object r3 = r7.TuitionPaymentFragmentbindingInflater1()     // Catch: java.lang.Throwable -> Lad
            if (r3 == 0) goto L59
            java.lang.Class<R> r4 = r6.getRoot     // Catch: java.lang.Throwable -> Lad
            java.lang.Class r5 = r3.getClass()     // Catch: java.lang.Throwable -> Lad
            boolean r4 = r4.isAssignableFrom(r5)     // Catch: java.lang.Throwable -> Lad
            if (r4 != 0) goto L40
            goto L59
        L40:
            com.bumptech.glide.request.RequestCoordinator r2 = r6.INotificationSideChannelDefault     // Catch: java.lang.Throwable -> Lad
            if (r2 == 0) goto L54
            boolean r2 = r2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r6)     // Catch: java.lang.Throwable -> Lad
            if (r2 != 0) goto L54
            r6.IconCompatParcelizer = r0     // Catch: java.lang.Throwable -> Lab
            com.bumptech.glide.request.SingleRequest$Status r8 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE     // Catch: java.lang.Throwable -> Lab
            r6.getItem = r8     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r1)
            if (r7 == 0) goto La6
            goto La7
        L54:
            r6.TuitionPaymentFragmentbindingInflater1(r7, r3, r8)     // Catch: java.lang.Throwable -> Lad
            monitor-exit(r1)
            return
        L59:
            r6.IconCompatParcelizer = r0     // Catch: java.lang.Throwable -> Lab
            com.bumptech.glide.load.engine.GlideException r8 = new com.bumptech.glide.load.engine.GlideException     // Catch: java.lang.Throwable -> Lab
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lab
            java.lang.String r4 = "Expected to receive an object of "
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Lab
            java.lang.Class<R> r4 = r6.getRoot     // Catch: java.lang.Throwable -> Lab
            r0.append(r4)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r4 = " but instead got "
            r0.append(r4)     // Catch: java.lang.Throwable -> Lab
            if (r3 == 0) goto L75
            java.lang.Class r4 = r3.getClass()     // Catch: java.lang.Throwable -> Lab
            goto L77
        L75:
            java.lang.String r4 = ""
        L77:
            r0.append(r4)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r4 = "{"
            r0.append(r4)     // Catch: java.lang.Throwable -> Lab
            r0.append(r3)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r4 = "} inside Resource{"
            r0.append(r4)     // Catch: java.lang.Throwable -> Lab
            r0.append(r7)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r4 = "}."
            r0.append(r4)     // Catch: java.lang.Throwable -> Lab
            if (r3 == 0) goto L94
            java.lang.String r3 = ""
            goto L96
        L94:
            java.lang.String r3 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L96:
            r0.append(r3)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lab
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Lab
            r6.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r8, r2)     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r1)
            if (r7 != 0) goto La7
        La6:
            return
        La7:
            defpackage.getAvailableCameraInfos.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r7)
            return
        Lab:
            r8 = move-exception
            goto Lb0
        Lad:
            r7 = move-exception
            r8 = r7
            r7 = r0
        Lb0:
            monitor-exit(r1)
            throw r8     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r8 = move-exception
            r0 = r7
            goto Lb6
        Lb5:
            r8 = move-exception
        Lb6:
            if (r0 == 0) goto Lbb
            defpackage.getAvailableCameraInfos.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r0)
        Lbb:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.TuitionPaymentFragmentbindingInflater1(com.bumptech.glide.load.engine.Resource, com.bumptech.glide.load.DataSource):void");
    }

    @Override // defpackage.ImageAnalysisBackpressureStrategy
    public final void TuitionPaymentFragmentbindingInflater1(GlideException glideException) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(glideException, 5);
    }

    @Override // defpackage.ImageAnalysisBackpressureStrategy
    public final Object b() {
        this.MediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return this.INotificationSideChannelStub;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(GlideException glideException, int i) {
        boolean zTuitionPaymentFragmentbindingInflater1;
        RequestCoordinator requestCoordinator;
        this.MediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        synchronized (this.INotificationSideChannelStub) {
            glideException.exception = this.read;
            int i2 = this.asBinder.g;
            if (i2 <= i) {
                Objects.toString(this.onTransact);
                if (i2 <= 4) {
                    ArrayList arrayList = new ArrayList();
                    glideException.TuitionPaymentFragmentspecialinlinedviewModeldefault2(glideException, arrayList);
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        int i4 = i3 + 1;
                        arrayList.get(i3);
                        i3 = i4;
                    }
                }
            }
            this.INotificationSideChannel = null;
            this.getItem = Status.FAILED;
            RequestCoordinator requestCoordinator2 = this.INotificationSideChannelDefault;
            if (requestCoordinator2 != null) {
                requestCoordinator2.b(this);
            }
            boolean z = true;
            this.cancel = true;
            try {
                List<getTargetCoordinateSystem<R>> list = this.getInterfaceDescriptor;
                if (list != null) {
                    zTuitionPaymentFragmentbindingInflater1 = false;
                    for (getTargetCoordinateSystem<R> gettargetcoordinatesystem : list) {
                        RequestCoordinator requestCoordinator3 = this.INotificationSideChannelDefault;
                        if (requestCoordinator3 != null) {
                            requestCoordinator3.b().TuitionPaymentFragmentbindingInflater1();
                        }
                        zTuitionPaymentFragmentbindingInflater1 |= gettargetcoordinatesystem.TuitionPaymentFragmentbindingInflater1();
                    }
                } else {
                    zTuitionPaymentFragmentbindingInflater1 = false;
                }
                getTargetCoordinateSystem<R> gettargetcoordinatesystem2 = this.getNotifyChildrenChangedOptions;
                if (gettargetcoordinatesystem2 == null) {
                    z = false;
                } else {
                    RequestCoordinator requestCoordinator4 = this.INotificationSideChannelDefault;
                    if (requestCoordinator4 != null) {
                        requestCoordinator4.b().TuitionPaymentFragmentbindingInflater1();
                    }
                    if (!gettargetcoordinatesystem2.TuitionPaymentFragmentbindingInflater1()) {
                        z = false;
                    }
                }
                if (!(z | zTuitionPaymentFragmentbindingInflater1) && ((requestCoordinator = this.INotificationSideChannelDefault) == null || requestCoordinator.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this))) {
                    Drawable drawableD = this.onTransact == null ? d() : null;
                    if (drawableD == null) {
                        if (this.asInterface == null) {
                            Drawable drawable = this.connect.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            this.asInterface = drawable;
                            if (drawable == null && this.connect.TuitionPaymentFragmentbindingInflater1 > 0) {
                                this.asInterface = TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.connect.TuitionPaymentFragmentbindingInflater1);
                            }
                        }
                        drawableD = this.asInterface;
                    }
                    if (drawableD == null) {
                        drawableD = asInterface();
                    }
                    this.disconnect.onLoadFailed(drawableD);
                }
                this.cancel = false;
            } catch (Throwable th) {
                this.cancel = false;
                throw th;
            }
        }
    }

    @Override // defpackage.ImageAnalysisBuilder
    public final boolean TuitionPaymentFragmentbindingInflater1(ImageAnalysisBuilder imageAnalysisBuilder) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        BaseRequestOptions<?> baseRequestOptions;
        Priority priority;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        BaseRequestOptions<?> baseRequestOptions2;
        Priority priority2;
        int size2;
        if (!(imageAnalysisBuilder instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.INotificationSideChannelStub) {
            i = this.notify;
            i2 = this.cancelAll;
            obj = this.onTransact;
            cls = this.getRoot;
            baseRequestOptions = this.connect;
            priority = this.INotificationSideChannelStubProxy;
            List<getTargetCoordinateSystem<R>> list = this.getInterfaceDescriptor;
            size = list != null ? list.size() : 0;
        }
        SingleRequest singleRequest = (SingleRequest) imageAnalysisBuilder;
        synchronized (singleRequest.INotificationSideChannelStub) {
            i3 = singleRequest.notify;
            i4 = singleRequest.cancelAll;
            obj2 = singleRequest.onTransact;
            cls2 = singleRequest.getRoot;
            baseRequestOptions2 = singleRequest.connect;
            priority2 = singleRequest.INotificationSideChannelStubProxy;
            List<getTargetCoordinateSystem<R>> list2 = singleRequest.getInterfaceDescriptor;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i == i3 && i2 == i4 && getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault2(obj, obj2) && cls.equals(cls2) && baseRequestOptions.equals(baseRequestOptions2) && priority == priority2 && size == size2;
    }

    public final String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.INotificationSideChannelStub) {
            obj = this.onTransact;
            cls = this.getRoot;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[model=");
        sb.append(obj);
        sb.append(", transcodeClass=");
        sb.append(cls);
        sb.append("]");
        return sb.toString();
    }

    private void TuitionPaymentFragmentbindingInflater1(Resource<R> resource, R r, DataSource dataSource) {
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        RequestCoordinator requestCoordinator = this.INotificationSideChannelDefault;
        if (requestCoordinator != null) {
            requestCoordinator.b().TuitionPaymentFragmentbindingInflater1();
        }
        this.getItem = Status.COMPLETE;
        this.IconCompatParcelizer = resource;
        if (this.asBinder.g <= 3) {
            r.getClass().getSimpleName();
            Objects.toString(dataSource);
            Objects.toString(this.onTransact);
            setTargetResolution.TuitionPaymentFragmentbindingInflater1(this.write);
        }
        RequestCoordinator requestCoordinator2 = this.INotificationSideChannelDefault;
        if (requestCoordinator2 != null) {
            requestCoordinator2.g(this);
        }
        boolean z = true;
        this.cancel = true;
        try {
            List<getTargetCoordinateSystem<R>> list = this.getInterfaceDescriptor;
            if (list != null) {
                Iterator<getTargetCoordinateSystem<R>> it = list.iterator();
                zTuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
                while (it.hasNext()) {
                    zTuitionPaymentFragmentspecialinlinedviewModeldefault2 |= it.next().TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
            } else {
                zTuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
            }
            getTargetCoordinateSystem<R> gettargetcoordinatesystem = this.getNotifyChildrenChangedOptions;
            if (gettargetcoordinatesystem == null || !gettargetcoordinatesystem.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                z = false;
            }
            if (!(z | zTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                this.disconnect.onResourceReady(r, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(dataSource));
            }
        } finally {
            this.cancel = false;
        }
    }
}
