package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bpjstku.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H$¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H$¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H$¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H$¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H$¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\n8%X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\fR\u0018\u0010\u0007\u001a\u0006*\u00020\u001b0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001c"}, d2 = {"LunregisterMediaButtonEventReceiver;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "", "getTheme", "()I", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/Integer;)V", "", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class unregisterMediaButtonEventReceiver extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3 = "BpjstkuBaseBottomSheetDialogFragment";

    protected abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    protected abstract int TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    protected abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    protected abstract void b();

    protected abstract void d();

    protected abstract void g();

    @Override // androidx.fragment.app.DialogFragment
    public int getTheme() {
        return R.style.BpjstkuBottomSheetDialogTheme;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        return p0.inflate(TuitionPaymentFragmentspecialinlinedviewModeldefault2(), p1, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View p0, Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.onViewCreated(p0, p1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        g();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        d();
        b();
    }

    public final void TuitionPaymentFragmentbindingInflater1() {
        BottomSheetBehavior<FrameLayout> behavior;
        BottomSheetBehavior<FrameLayout> behavior2;
        Dialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog == null || (behavior2 = bottomSheetDialog.getBehavior()) == null || behavior2.getState() != 3) {
            Dialog dialog2 = getDialog();
            BottomSheetDialog bottomSheetDialog2 = dialog2 instanceof BottomSheetDialog ? (BottomSheetDialog) dialog2 : null;
            if (bottomSheetDialog2 == null || (behavior = bottomSheetDialog2.getBehavior()) == null) {
                return;
            }
            behavior.setState(3);
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer p0) {
        BottomSheetBehavior<FrameLayout> behavior;
        BottomSheetBehavior<FrameLayout> behavior2;
        BottomSheetBehavior<FrameLayout> behavior3;
        Dialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog == null || (behavior3 = bottomSheetDialog.getBehavior()) == null || behavior3.getState() != 3) {
            Dialog dialog2 = getDialog();
            BottomSheetDialog bottomSheetDialog2 = dialog2 instanceof BottomSheetDialog ? (BottomSheetDialog) dialog2 : null;
            if (bottomSheetDialog2 != null && (behavior2 = bottomSheetDialog2.getBehavior()) != null) {
                behavior2.setState(3);
            }
            Dialog dialog3 = getDialog();
            BottomSheetDialog bottomSheetDialog3 = dialog3 instanceof BottomSheetDialog ? (BottomSheetDialog) dialog3 : null;
            if (bottomSheetDialog3 == null || (behavior = bottomSheetDialog3.getBehavior()) == null) {
                return;
            }
            behavior.setPeekHeight(p0 != null ? p0.intValue() : 0);
        }
    }
}
