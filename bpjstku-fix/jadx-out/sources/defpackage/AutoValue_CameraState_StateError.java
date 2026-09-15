package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0005R\u0018\u0010\u0013\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00028\u00008EX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R.\u0010\u001a\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00028\u00000\u00188%X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"LAutoValue_CameraState_StateError;", "Landroidx/viewbinding/ViewBinding;", "B", "LLifecycleCameraRepository;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Landroidx/viewbinding/ViewBinding;", "asInterface", "()Landroidx/viewbinding/ViewBinding;", "b", "Lkotlin/Function3;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AutoValue_CameraState_StateError<B extends ViewBinding> extends LifecycleCameraRepository {
    private B TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    protected abstract Function3<LayoutInflater, ViewGroup, Boolean, B> TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    public final B asInterface() {
        B b = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("Accessing binding outside of the view lifecycle is not allowed".toString());
    }

    @Override // defpackage.LifecycleCameraRepository, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        B bInvoke = TuitionPaymentFragmentspecialinlinedviewModeldefault3().invoke(p0, p1, Boolean.FALSE);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bInvoke;
        if (bInvoke != null) {
            return bInvoke.getRoot();
        }
        throw new IllegalStateException("Accessing binding outside of the view lifecycle is not allowed".toString());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View p0, Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.onViewCreated(p0, p1);
        Intrinsics.checkNotNullParameter(p0, "");
        ViewCompat.setOnApplyWindowInsetsListener(p0, new OnApplyWindowInsetsListener() { // from class: imageCaptureFormat
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return AutoValue_CameraState_StateError.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view, windowInsetsCompat);
            }
        });
        if (Build.VERSION.SDK_INT >= 35) {
            p0.requestApplyInsets();
        }
    }

    @Override // defpackage.LifecycleCameraRepository, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
    }

    public static /* synthetic */ WindowInsetsCompat TuitionPaymentFragmentspecialinlinedviewModeldefault3(View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets2, "");
        int i = insets.left;
        int i2 = insets.top;
        int i3 = insets.right;
        int i4 = insets.bottom;
        int i5 = insets2.bottom;
        view.setPadding(i, i2, i3, 0);
        return windowInsetsCompat;
    }
}
