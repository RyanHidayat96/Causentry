package defpackage;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DecodeJob;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraFilter<Transcode> {
    private boolean INotificationSideChannelDefault;
    private boolean INotificationSideChannelStubProxy;
    int TuitionPaymentFragmentbindingInflater1;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    DecodeJob.TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    CameraSelector TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    getTargetRotation f110a;
    Object asBinder;
    boolean asInterface;
    public setRotationDegrees b;
    Map<Class<?>, Transformation<?>> cancel;
    public Class<Transcode> cancelAll;
    public Class<?> d;
    Priority g;
    int notify;
    getCameraControl onTransact;
    private final List<getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<?>> getInterfaceDescriptor = new ArrayList();
    private final List<getCameraControl> INotificationSideChannel = new ArrayList();

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        this.b = null;
        this.asBinder = null;
        this.onTransact = null;
        this.d = null;
        this.cancelAll = null;
        this.f110a = null;
        this.g = null;
        this.cancel = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        this.getInterfaceDescriptor.clear();
        this.INotificationSideChannelDefault = false;
        this.INotificationSideChannel.clear();
        this.INotificationSideChannelStubProxy = false;
    }

    public final <Z> Transformation<Z> TuitionPaymentFragmentbindingInflater1(Class<Z> cls) {
        Transformation<Z> transformation = (Transformation) this.cancel.get(cls);
        if (transformation == null) {
            for (Map.Entry<Class<?>, Transformation<?>> entry : this.cancel.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    transformation = (Transformation) entry.getValue();
                    break;
                }
            }
        }
        if (transformation != null) {
            return transformation;
        }
        if (this.cancel.isEmpty() && this.asInterface) {
            StringBuilder sb = new StringBuilder("Missing transformation for ");
            sb.append(cls);
            sb.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
            throw new IllegalArgumentException(sb.toString());
        }
        return createCaptureBundle.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    public final List<getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<?>> b() {
        if (!this.INotificationSideChannelDefault) {
            this.INotificationSideChannelDefault = true;
            this.getInterfaceDescriptor.clear();
            List listB = this.b.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1().b(this.asBinder);
            int size = listB.size();
            for (int i = 0; i < size; i++) {
                getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<?> TuitionPaymentFragmentbindingInflater1 = ((getSchedulerHandler) listB.get(i)).TuitionPaymentFragmentbindingInflater1(this.asBinder, this.notify, this.TuitionPaymentFragmentbindingInflater1, this.f110a);
                if (TuitionPaymentFragmentbindingInflater1 != null) {
                    this.getInterfaceDescriptor.add(TuitionPaymentFragmentbindingInflater1);
                }
            }
        }
        return this.getInterfaceDescriptor;
    }

    public final List<getCameraControl> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        if (!this.INotificationSideChannelStubProxy) {
            this.INotificationSideChannelStubProxy = true;
            this.INotificationSideChannel.clear();
            List<getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<?>> listB = b();
            int size = listB.size();
            for (int i = 0; i < size; i++) {
                getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<?> tuitionPaymentFragmentbindingInflater1 = listB.get(i);
                if (!this.INotificationSideChannel.contains(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                    this.INotificationSideChannel.add(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
                for (int i2 = 0; i2 < tuitionPaymentFragmentbindingInflater1.b.size(); i2++) {
                    if (!this.INotificationSideChannel.contains(tuitionPaymentFragmentbindingInflater1.b.get(i2))) {
                        this.INotificationSideChannel.add(tuitionPaymentFragmentbindingInflater1.b.get(i2));
                    }
                }
            }
        }
        return this.INotificationSideChannel;
    }

    final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Class<?> cls) {
        return this.b.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(cls, this.d, this.cancelAll) != null;
    }
}
