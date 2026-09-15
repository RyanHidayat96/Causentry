package defpackage;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H$¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0004¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"LsendExtras;", "LLifecycleCameraRepository;", "LProcessCameraProvider;", "<init>", "()V", "", "INotificationSideChannelDefault", "b_", "LunregisterLifecycle;", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(LunregisterLifecycle;)V", "", "RemoteActionCompatParcelizer", "()Z", "Lr8lambda4cDi3AAzKeyJxm5RcPVvEasZ0OY;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lr8lambda4cDi3AAzKeyJxm5RcPVvEasZ0OY;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class sendExtras extends LifecycleCameraRepository implements ProcessCameraProvider {
    private r8lambda4cDi3AAzKeyJxm5RcPVvEasZ0OY TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new LifecycleCameraRepositoryLifecycleCameraRepositoryObserver(new ArrayList());

    protected abstract void INotificationSideChannelDefault();

    @Override // defpackage.LifecycleCameraRepository
    public final void b_() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
        INotificationSideChannelDefault();
    }

    protected final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(unregisterLifecycle p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(p0);
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }
}
