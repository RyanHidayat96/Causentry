package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import java.util.HashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\r\u0010\tJ-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0006\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0004R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8%X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001b"}, d2 = {"LbindToLifecycleCamera;", "Landroidx/fragment/app/Fragment;", "LgetLifecycleCamera;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onActivityCreated", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "onAttach", "(Landroid/content/Context;)V", "onCreate", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDetach", "Lcom/nbs/nucleosnucleo/presentation/BaseActivity;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/nbs/nucleosnucleo/presentation/BaseActivity;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "()I", "b"}, k = 1, mv = {2, 3, 0})
public abstract class bindToLifecycleCamera extends Fragment implements getLifecycleCamera {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private BaseActivity TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private HashMap TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    protected abstract int TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle p0) {
        super.onCreate(p0);
        setHasOptionsMenu(false);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        return p0.inflate(TuitionPaymentFragmentspecialinlinedviewModeldefault3(), p1, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle p0) {
        super.onActivityCreated(p0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context p0) {
        super.onAttach(p0);
        if (p0 instanceof BaseActivity) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (BaseActivity) p0;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        super.onDetach();
    }
}
