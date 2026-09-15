package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.util.Pools;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.CallbackException;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.Resource;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class hasCamera<R> implements DecodeJob.TuitionPaymentFragmentspecialinlinedviewModeldefault2<R>, createImageReaderProxy.TuitionPaymentFragmentbindingInflater1 {
    private static final b cancelAll = new b();
    final lambdashutdownInternal3androidxcameracoreCameraX INotificationSideChannel;
    private boolean INotificationSideChannelDefault;
    private boolean INotificationSideChannelStub;
    private final b INotificationSideChannelStubProxy;
    private final Pools.Pool<hasCamera<?>> IconCompatParcelizer;
    private final addCameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault1 MediaBrowserCompat;
    private volatile boolean RemoteActionCompatParcelizer;
    DecodeJob<R> TuitionPaymentFragmentbindingInflater1;
    final lambdashutdownInternal3androidxcameracoreCameraX TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final lambdashutdownInternal3androidxcameracoreCameraX TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final lambdashutdownInternal3androidxcameracoreCameraX f1005a;
    boolean asBinder;
    addCameraFilter<?> asInterface;
    DataSource b;
    private final CameraInfoUnavailableException cancel;
    private getCameraControl connect;
    boolean d;
    GlideException g;
    private final attach getExtras;
    private boolean getInterfaceDescriptor;
    boolean notify;
    boolean onTransact;
    private Resource<?> read;
    private final AtomicInteger write;

    hasCamera(lambdashutdownInternal3androidxcameracoreCameraX lambdashutdowninternal3androidxcameracorecamerax, lambdashutdownInternal3androidxcameracoreCameraX lambdashutdowninternal3androidxcameracorecamerax2, lambdashutdownInternal3androidxcameracoreCameraX lambdashutdowninternal3androidxcameracorecamerax3, lambdashutdownInternal3androidxcameracoreCameraX lambdashutdowninternal3androidxcameracorecamerax4, CameraInfoUnavailableException cameraInfoUnavailableException, addCameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, Pools.Pool<hasCamera<?>> pool) {
        this(lambdashutdowninternal3androidxcameracorecamerax, lambdashutdowninternal3androidxcameracorecamerax2, lambdashutdowninternal3androidxcameracorecamerax3, lambdashutdowninternal3androidxcameracorecamerax4, cameraInfoUnavailableException, tuitionPaymentFragmentspecialinlinedviewModeldefault1, pool, cancelAll);
    }

    private hasCamera(lambdashutdownInternal3androidxcameracoreCameraX lambdashutdowninternal3androidxcameracorecamerax, lambdashutdownInternal3androidxcameracoreCameraX lambdashutdowninternal3androidxcameracorecamerax2, lambdashutdownInternal3androidxcameracoreCameraX lambdashutdowninternal3androidxcameracorecamerax3, lambdashutdownInternal3androidxcameracoreCameraX lambdashutdowninternal3androidxcameracorecamerax4, CameraInfoUnavailableException cameraInfoUnavailableException, addCameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, Pools.Pool<hasCamera<?>> pool, b bVar) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        this.getExtras = new attach.TuitionPaymentFragmentbindingInflater1();
        this.write = new AtomicInteger();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdashutdowninternal3androidxcameracorecamerax;
        this.f1005a = lambdashutdowninternal3androidxcameracorecamerax2;
        this.INotificationSideChannel = lambdashutdowninternal3androidxcameracorecamerax3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdashutdowninternal3androidxcameracorecamerax4;
        this.cancel = cameraInfoUnavailableException;
        this.MediaBrowserCompat = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.IconCompatParcelizer = pool;
        this.INotificationSideChannelStubProxy = bVar;
    }

    final hasCamera<R> TuitionPaymentFragmentbindingInflater1(getCameraControl getcameracontrol, boolean z, boolean z2, boolean z3, boolean z4) {
        synchronized (this) {
            this.connect = getcameracontrol;
            this.INotificationSideChannelDefault = z;
            this.notify = z2;
            this.onTransact = z3;
            this.d = z4;
        }
        return this;
    }

    final void b(ImageAnalysisBackpressureStrategy imageAnalysisBackpressureStrategy, Executor executor) {
        synchronized (this) {
            this.getExtras.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.add(new TuitionPaymentFragmentbindingInflater1(imageAnalysisBackpressureStrategy, executor));
            if (this.INotificationSideChannelStub) {
                TuitionPaymentFragmentbindingInflater1(1);
                executor.execute(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(imageAnalysisBackpressureStrategy));
            } else if (this.getInterfaceDescriptor) {
                TuitionPaymentFragmentbindingInflater1(1);
                executor.execute(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(imageAnalysisBackpressureStrategy));
            } else if (!(!this.RemoteActionCompatParcelizer)) {
                throw new IllegalArgumentException("Cannot add callbacks to a cancelled EngineJob");
            }
        }
    }

    public final void b(ImageAnalysisBackpressureStrategy imageAnalysisBackpressureStrategy) {
        synchronized (this) {
            this.getExtras.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.remove(new TuitionPaymentFragmentbindingInflater1(imageAnalysisBackpressureStrategy, setTargetAspectRatio.b()));
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.isEmpty()) {
                if (!this.getInterfaceDescriptor && !this.INotificationSideChannelStub && !this.RemoteActionCompatParcelizer) {
                    this.RemoteActionCompatParcelizer = true;
                    DecodeJob<R> decodeJob = this.TuitionPaymentFragmentbindingInflater1;
                    decodeJob.d = true;
                    CameraInfo cameraInfo = decodeJob.b;
                    if (cameraInfo != null) {
                        cameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    }
                    this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, this.connect);
                }
                if ((this.INotificationSideChannelStub || this.getInterfaceDescriptor) && this.write.get() == 0) {
                    b();
                }
            }
        }
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws IllegalAccessException {
        addCameraFilter<?> addcamerafilter;
        synchronized (this) {
            this.getExtras.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            if (this.getInterfaceDescriptor || this.INotificationSideChannelStub || this.RemoteActionCompatParcelizer) {
                int iDecrementAndGet = this.write.decrementAndGet();
                if (!(iDecrementAndGet >= 0)) {
                    throw new IllegalArgumentException("Can't decrement below 0");
                }
                if (iDecrementAndGet == 0) {
                    addcamerafilter = this.asInterface;
                    b();
                } else {
                    addcamerafilter = null;
                }
            } else {
                throw new IllegalArgumentException("Not yet complete!");
            }
        }
        if (addcamerafilter != null) {
            addcamerafilter.g();
        }
    }

    private void b() {
        synchronized (this) {
            if (this.connect == null) {
                throw new IllegalArgumentException();
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.clear();
            this.connect = null;
            this.asInterface = null;
            this.read = null;
            this.getInterfaceDescriptor = false;
            this.RemoteActionCompatParcelizer = false;
            this.INotificationSideChannelStub = false;
            this.asBinder = false;
            DecodeJob<R> decodeJob = this.TuitionPaymentFragmentbindingInflater1;
            if (decodeJob.INotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault3(false)) {
                decodeJob.b();
            }
            this.TuitionPaymentFragmentbindingInflater1 = null;
            this.g = null;
            this.b = null;
            this.IconCompatParcelizer.release(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.DecodeJob.TuitionPaymentFragmentspecialinlinedviewModeldefault2
    public final void TuitionPaymentFragmentbindingInflater1(Resource<R> resource, DataSource dataSource, boolean z) throws IllegalAccessException {
        synchronized (this) {
            this.read = resource;
            this.b = dataSource;
            this.asBinder = z;
        }
        synchronized (this) {
            this.getExtras.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            if (this.RemoteActionCompatParcelizer) {
                this.read.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                b();
                return;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (this.INotificationSideChannelStub) {
                throw new IllegalStateException("Already have resource");
            }
            this.asInterface = new addCameraFilter<>(this.read, this.INotificationSideChannelDefault, true, this.connect, this.MediaBrowserCompat);
            this.INotificationSideChannelStub = true;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ArrayList(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1));
            TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.size() + 1);
            this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, this.connect, this.asInterface);
            for (TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 : tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.execute(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.TuitionPaymentFragmentspecialinlinedviewModeldefault2
    public final void TuitionPaymentFragmentbindingInflater1(GlideException glideException) throws IllegalAccessException {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (ViewConfiguration.getLongPressTimeout() >> 16)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 39, KeyEvent.keyCodeFromString("") + 19, 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - Color.alpha(0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 58, 18 - ExpandableListView.getPackedPositionGroup(0L), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - ((Process.getThreadPriority(0) + 20) >> 6)), 58 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.indexOf((CharSequence) "", '0', 0) + 19, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -958;
        long j3 = (j2 * 348564479912301403L) + (j2 * 5170689017247484836L);
        long j4 = 959;
        long j5 = -1;
        long j6 = j5 ^ 5170689017247484836L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j7 = jIdentityHashCode ^ j5;
        long j8 = j5 ^ 348564479912301403L;
        long j9 = j3 + ((((j6 | j7) ^ j5) | ((j8 | jIdentityHashCode) ^ j5) | ((j7 | 348564479912301403L) ^ j5)) * j4) + (((long) (-959)) * (5176883151208569855L ^ j5)) + (j4 * (((j8 | j7) ^ j5) | ((j6 | jIdentityHashCode) ^ j5) | (j5 ^ (jIdentityHashCode | 348564479912301403L))));
        long j10 = j;
        int i4 = 0;
        while (true) {
            for (int i5 = 0; i5 != 8; i5++) {
                i3 = (((((int) (j10 >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            j10 = j9;
        }
        if (i3 != i) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 46399), 40 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 19 - Color.alpha(0), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
        }
        synchronized (this) {
            this.g = glideException;
        }
        synchronized (this) {
            this.getExtras.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            if (this.RemoteActionCompatParcelizer) {
                b();
                return;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (this.getInterfaceDescriptor) {
                throw new IllegalStateException("Already failed once");
            }
            this.getInterfaceDescriptor = true;
            getCameraControl getcameracontrol = this.connect;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ArrayList(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1));
            TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.size() + 1);
            this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, getcameracontrol, null);
            for (TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 : tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.execute(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Runnable {
        private final ImageAnalysisBackpressureStrategy TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(ImageAnalysisBackpressureStrategy imageAnalysisBackpressureStrategy) {
            this.TuitionPaymentFragmentbindingInflater1 = imageAnalysisBackpressureStrategy;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.TuitionPaymentFragmentbindingInflater1.b()) {
                synchronized (hasCamera.this) {
                    if (hasCamera.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.contains(new TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, setTargetAspectRatio.b()))) {
                        hasCamera hascamera = hasCamera.this;
                        try {
                            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(hascamera.g);
                        } catch (Throwable th) {
                            throw new CallbackException(th);
                        }
                    }
                    hasCamera.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
            }
        }
    }

    class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Runnable {
        private final ImageAnalysisBackpressureStrategy TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageAnalysisBackpressureStrategy imageAnalysisBackpressureStrategy) {
            this.TuitionPaymentFragmentbindingInflater1 = imageAnalysisBackpressureStrategy;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.TuitionPaymentFragmentbindingInflater1.b()) {
                synchronized (hasCamera.this) {
                    if (hasCamera.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.contains(new TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, setTargetAspectRatio.b()))) {
                        hasCamera.this.asInterface.b();
                        hasCamera hascamera = hasCamera.this;
                        ImageAnalysisBackpressureStrategy imageAnalysisBackpressureStrategy = this.TuitionPaymentFragmentbindingInflater1;
                        try {
                            addCameraFilter<?> addcamerafilter = hascamera.asInterface;
                            DataSource dataSource = hascamera.b;
                            boolean z = hascamera.asBinder;
                            imageAnalysisBackpressureStrategy.TuitionPaymentFragmentbindingInflater1(addcamerafilter, dataSource);
                            hasCamera.this.b(this.TuitionPaymentFragmentbindingInflater1);
                        } catch (Throwable th) {
                            throw new CallbackException(th);
                        }
                    }
                    hasCamera.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
            }
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Iterable<TuitionPaymentFragmentbindingInflater1> {
        final List<TuitionPaymentFragmentbindingInflater1> TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            this(new ArrayList(2));
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(List<TuitionPaymentFragmentbindingInflater1> list) {
            this.TuitionPaymentFragmentbindingInflater1 = list;
        }

        @Override // java.lang.Iterable
        public final Iterator<TuitionPaymentFragmentbindingInflater1> iterator() {
            return this.TuitionPaymentFragmentbindingInflater1.iterator();
        }
    }

    static final class TuitionPaymentFragmentbindingInflater1 {
        final ImageAnalysisBackpressureStrategy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final Executor TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentbindingInflater1(ImageAnalysisBackpressureStrategy imageAnalysisBackpressureStrategy, Executor executor) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = imageAnalysisBackpressureStrategy;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof TuitionPaymentFragmentbindingInflater1) {
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals(((TuitionPaymentFragmentbindingInflater1) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            return false;
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }
    }

    @Override // createImageReaderProxy.TuitionPaymentFragmentbindingInflater1
    public final attach e_() {
        return this.getExtras;
    }

    static class b {
        b() {
        }
    }

    private void TuitionPaymentFragmentbindingInflater1(int i) {
        addCameraFilter<?> addcamerafilter;
        synchronized (this) {
            if (this.getInterfaceDescriptor || this.INotificationSideChannelStub || this.RemoteActionCompatParcelizer) {
                if (this.write.getAndAdd(i) == 0 && (addcamerafilter = this.asInterface) != null) {
                    addcamerafilter.b();
                }
            } else {
                throw new IllegalArgumentException("Not yet complete!");
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.TuitionPaymentFragmentspecialinlinedviewModeldefault2
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(DecodeJob<?> decodeJob) {
        lambdashutdownInternal3androidxcameracoreCameraX lambdashutdowninternal3androidxcameracorecamerax;
        if (this.notify) {
            lambdashutdowninternal3androidxcameracorecamerax = this.INotificationSideChannel;
        } else {
            lambdashutdowninternal3androidxcameracorecamerax = this.onTransact ? this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : this.f1005a;
        }
        lambdashutdowninternal3androidxcameracorecamerax.execute(decodeJob);
    }
}
