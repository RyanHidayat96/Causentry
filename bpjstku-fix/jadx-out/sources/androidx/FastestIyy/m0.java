package androidx.FastestIyy;

import com.zimperium.api.v5.ZDeviceStatusCallback;
import com.zimperium.api.v5.ZDeviceStatusRegistration;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class m0 implements ZDeviceStatusRegistration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ZDeviceStatusCallback f291a;

    public m0(ZDeviceStatusCallback zDeviceStatusCallback) {
        this.f291a = zDeviceStatusCallback;
    }

    @Override // com.zimperium.api.v5.ZDeviceStatusRegistration
    public final void deregister() {
        if (this.f291a != null) {
            ArrayList arrayList = l0.o;
            synchronized (arrayList) {
                arrayList.remove(this);
            }
            this.f291a = null;
        }
    }

    @Override // com.zimperium.api.v5.ZDeviceStatusRegistration
    public final ZDeviceStatusCallback getCallback() {
        return this.f291a;
    }
}
