package defpackage;

import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraStateType implements CameraInfo, isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1<Object> {
    private CameraState TuitionPaymentFragmentbindingInflater1;
    private final CameraFilter<?> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private volatile getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<?> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private File TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<getSchedulerHandler<File, ?>> f114a;
    private int asBinder = -1;
    private getCameraControl asInterface;
    private final CameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1 b;
    private int d;
    private int g;

    public CameraStateType(CameraFilter<?> cameraFilter, CameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cameraFilter;
        this.b = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.CameraInfo
    public final boolean b() {
        List<getCameraControl> listTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        boolean z = false;
        if (listTuitionPaymentFragmentspecialinlinedviewModeldefault3.isEmpty()) {
            return false;
        }
        CameraFilter<?> cameraFilter = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        List<Class<?>> listTuitionPaymentFragmentbindingInflater1 = cameraFilter.b.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentbindingInflater1(cameraFilter.asBinder.getClass(), cameraFilter.d, cameraFilter.cancelAll);
        if (listTuitionPaymentFragmentbindingInflater1.isEmpty()) {
            if (File.class.equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.cancelAll)) {
                return false;
            }
            StringBuilder sb = new StringBuilder("Failed to find any load path from ");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder.getClass());
            sb.append(" to ");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.cancelAll);
            throw new IllegalStateException(sb.toString());
        }
        while (true) {
            List<getSchedulerHandler<File, ?>> list = this.f114a;
            if (list == null || this.d >= list.size()) {
                int i = this.asBinder + 1;
                this.asBinder = i;
                if (i >= listTuitionPaymentFragmentbindingInflater1.size()) {
                    int i2 = this.g + 1;
                    this.g = i2;
                    if (i2 >= listTuitionPaymentFragmentspecialinlinedviewModeldefault3.size()) {
                        return false;
                    }
                    this.asBinder = 0;
                }
                getCameraControl getcameracontrol = listTuitionPaymentFragmentspecialinlinedviewModeldefault3.get(this.g);
                Class<?> cls = listTuitionPaymentFragmentbindingInflater1.get(this.asBinder);
                this.TuitionPaymentFragmentbindingInflater1 = new CameraState(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getcameracontrol, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onTransact, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.notify, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(cls), cls, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f110a);
                File fileTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = fileTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (fileTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                    this.asInterface = getcameracontrol;
                    this.f114a = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1().b(fileTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    this.d = 0;
                }
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                while (!z && this.d < this.f114a.size()) {
                    List<getSchedulerHandler<File, ?>> list2 = this.f114a;
                    int i3 = this.d;
                    this.d = i3 + 1;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = list2.get(i3).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.notify, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f110a);
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3())) {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.g, this);
                        z = true;
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
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.asInterface, obj, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, DataSource.RESOURCE_DISK_CACHE, this.TuitionPaymentFragmentbindingInflater1);
    }

    @Override // isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Exception exc) {
        this.b.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, exc, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, DataSource.RESOURCE_DISK_CACHE);
    }
}
