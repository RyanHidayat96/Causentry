package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentIdCardUploadDialogBinding;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003R\u001a\u0010\u0010\u001a\u00020\u00128\u0015X\u0095D¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000f\u001a\u00020\u00168\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u001a\u0010\u0014\u001a\u00020\u00188\u0015X\u0095D¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"LsetOnItemSelectedAction;", "LMediaSessionCompatMediaSessionImplApi181;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()I", "Lcom/bpjstku/databinding/FragmentIdCardUploadDialogBinding;", "Lcom/bpjstku/databinding/FragmentIdCardUploadDialogBinding;", "", "Z", "d", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setOnItemSelectedAction extends MediaSessionCompatMediaSessionImplApi181 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private FragmentIdCardUploadDialogBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final int b = R.layout.fragment_id_card_upload_dialog;
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentbindingInflater1() {
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final int getB() {
        return this.b;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentIdCardUploadDialogBinding fragmentIdCardUploadDialogBindingInflate = FragmentIdCardUploadDialogBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = fragmentIdCardUploadDialogBindingInflate;
        if (fragmentIdCardUploadDialogBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentIdCardUploadDialogBindingInflate = null;
        }
        FrameLayout root = fragmentIdCardUploadDialogBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void b() {
        FragmentIdCardUploadDialogBinding fragmentIdCardUploadDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        FragmentIdCardUploadDialogBinding fragmentIdCardUploadDialogBinding2 = null;
        if (fragmentIdCardUploadDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentIdCardUploadDialogBinding = null;
        }
        MaterialButton materialButton = fragmentIdCardUploadDialogBinding.btnTakePhoto;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new isBound(new Function1() { // from class: generateUri
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setOnItemSelectedAction.TuitionPaymentFragmentbindingInflater1((View) obj);
            }
        }));
        FragmentIdCardUploadDialogBinding fragmentIdCardUploadDialogBinding3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fragmentIdCardUploadDialogBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentIdCardUploadDialogBinding2 = fragmentIdCardUploadDialogBinding3;
        }
        MaterialButton materialButton2 = fragmentIdCardUploadDialogBinding2.btnTakePhotoFromGallery;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new isBound(new Function1() { // from class: BrowserServiceFileProvider1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setOnItemSelectedAction.TuitionPaymentFragmentspecialinlinedviewModeldefault1((View) obj);
            }
        }));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return Unit.INSTANCE;
    }
}
