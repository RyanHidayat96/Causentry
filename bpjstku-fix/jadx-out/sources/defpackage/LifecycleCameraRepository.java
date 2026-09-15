package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H$¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H$¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H$¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H$¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H$¢\u0006\u0004\b\f\u0010\u0004J\u0019\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J-\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000e\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u0004R\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010$\u001a\u00020!8%X¤\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#"}, d2 = {"LLifecycleCameraRepository;", "Landroidx/fragment/app/Fragment;", "LgetLifecycleCamera;", "<init>", "()V", "", "write", "g", "cancelAll", "b_", "INotificationSideChannel", "cancel", "onTransact", "Landroid/os/Bundle;", "p0", "onActivityCreated", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "onAttach", "(Landroid/content/Context;)V", "onCreate", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDetach", "IconCompatParcelizer", "Lcom/nbs/nucleosnucleo/presentation/BaseActivity;", "Lcom/nbs/nucleosnucleo/presentation/BaseActivity;", "TuitionPaymentFragmentbindingInflater1", "", "asBinder", "()I", "b"}, k = 1, mv = {2, 3, 0})
public abstract class LifecycleCameraRepository extends Fragment implements getLifecycleCamera {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public BaseActivity TuitionPaymentFragmentbindingInflater1;

    public interface b {
    }

    protected abstract void INotificationSideChannel();

    /* JADX INFO: renamed from: asBinder */
    protected abstract int getAsBinder();

    @Deprecated(message = "Soon will be removed")
    protected void b_() {
    }

    protected abstract void cancel();

    protected abstract void cancelAll();

    protected abstract void g();

    protected abstract void onTransact();

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle p0) {
        super.onCreate(p0);
        setHasOptionsMenu(false);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        return p0.inflate(getAsBinder(), p1, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle p0) {
        super.onActivityCreated(p0);
        b_();
        cancelAll();
        onTransact();
        g();
        cancel();
        INotificationSideChannel();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context p0) {
        super.onAttach(p0);
        if (p0 instanceof BaseActivity) {
            this.TuitionPaymentFragmentbindingInflater1 = (BaseActivity) p0;
        }
    }

    public final void IconCompatParcelizer() {
        BaseActivity baseActivity = this.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity == null || baseActivity == null) {
            return;
        }
        baseActivity.MediaBrowserCompat();
    }

    public final void write() {
        BaseActivity baseActivity = this.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity == null || baseActivity == null) {
            return;
        }
        baseActivity.IconCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        this.TuitionPaymentFragmentbindingInflater1 = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }
}
