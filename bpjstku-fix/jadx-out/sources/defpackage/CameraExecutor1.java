package defpackage;

import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraExecutor1 implements CameraInfo, isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1<Object> {
    private File TuitionPaymentFragmentbindingInflater1;
    private final CameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private volatile getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<?> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final CameraFilter<?> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private getCameraControl f109a;
    private int asBinder;
    private List<getSchedulerHandler<File, ?>> asInterface;
    private final List<getCameraControl> b;
    private int d;

    public CameraExecutor1(CameraFilter<?> cameraFilter, CameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        this(cameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), cameraFilter, tuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    CameraExecutor1(List<getCameraControl> list, CameraFilter<?> cameraFilter, CameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        this.d = -1;
        this.b = list;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cameraFilter;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.CameraInfo
    public final boolean b() {
        while (true) {
            List<getSchedulerHandler<File, ?>> list = this.asInterface;
            boolean z = false;
            if (list == null || this.asBinder >= list.size()) {
                int i = this.d + 1;
                this.d = i;
                if (i >= this.b.size()) {
                    return false;
                }
                getCameraControl getcameracontrol = this.b.get(this.d);
                File fileTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault3(new CameraInfoImplementationType(getcameracontrol, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onTransact));
                this.TuitionPaymentFragmentbindingInflater1 = fileTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (fileTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                    this.f109a = getcameracontrol;
                    this.asInterface = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1().b(fileTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    this.asBinder = 0;
                }
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                while (!z && this.asBinder < this.asInterface.size()) {
                    List<getSchedulerHandler<File, ?>> list2 = this.asInterface;
                    int i2 = this.asBinder;
                    this.asBinder = i2 + 1;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = list2.get(i2).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f110a);
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                        CameraFilter<?> cameraFilter = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if (cameraFilter.b.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), cameraFilter.d, cameraFilter.cancelAll) != null) {
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.g, this);
                            z = true;
                        }
                    }
                }
                return z;
            }
        }
    }

    @Override // defpackage.CameraInfo
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<?> tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
    }

    @Override // isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.f109a, obj, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, DataSource.DATA_DISK_CACHE, this.f109a);
    }

    @Override // isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Exception exc) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(this.f109a, exc, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, DataSource.DATA_DISK_CACHE);
    }
}
