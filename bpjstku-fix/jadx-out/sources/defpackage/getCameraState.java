package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentProcessResultSmallDialogBinding;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003R\u0014\u0010\u000e\u001a\u00020\u00128UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u000f\u001a\u00020\u00158\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010\u0011\u001a\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0016\u0010\u0010\u001a\u00020\u001b8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001b8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0006@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b\u0013\u0010!"}, d2 = {"LgetCameraState;", "LMediaSessionCompatMediaSessionImplApi181;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()I", "Lcom/bpjstku/databinding/FragmentProcessResultSmallDialogBinding;", "Lcom/bpjstku/databinding/FragmentProcessResultSmallDialogBinding;", "", "d", "()Z", "I", "", "a", "Ljava/lang/String;", "asInterface", "asBinder", "LgetCameraState$TuitionPaymentFragmentbindingInflater1;", "LgetCameraState$TuitionPaymentFragmentbindingInflater1;", "g"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getCameraState extends MediaSessionCompatMediaSessionImplApi181 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private FragmentProcessResultSmallDialogBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public TuitionPaymentFragmentbindingInflater1 g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String b;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String asBinder;

    public interface TuitionPaymentFragmentbindingInflater1 {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getB() {
        return R.layout.fragment_process_result_small_dialog;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: d */
    public final boolean getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return false;
    }

    /* JADX INFO: renamed from: getCameraState$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"LgetCameraState$b;", "", "<init>", "()V", "", "p0", "", "p1", "p2", "p3", "LgetCameraState;", "b", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)LgetCameraState;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static getCameraState b(int p0, String p1, String p2, String p3) {
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intrinsics.checkNotNullParameter(p3, "");
            getCameraState getcamerastate = new getCameraState();
            Bundle bundle = new Bundle();
            bundle.putInt("result_dialog_image", p0);
            bundle.putString("result_dialog_title", p1);
            bundle.putString("result_dialog_message", p2);
            bundle.putString("result_dialog_button_text", p3);
            getcamerastate.setArguments(bundle);
            return getcamerastate;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentProcessResultSmallDialogBinding fragmentProcessResultSmallDialogBindingInflate = FragmentProcessResultSmallDialogBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = fragmentProcessResultSmallDialogBindingInflate;
        if (fragmentProcessResultSmallDialogBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentProcessResultSmallDialogBindingInflate = null;
        }
        FrameLayout root = fragmentProcessResultSmallDialogBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentbindingInflater1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = arguments.getInt("result_dialog_image");
            String string = arguments.getString("result_dialog_title");
            if (string == null) {
                string = "";
            }
            this.b = string;
            String string2 = arguments.getString("result_dialog_message");
            if (string2 == null) {
                string2 = "";
            }
            this.asBinder = string2;
            String string3 = arguments.getString("result_dialog_button_text");
            this.a = string3 != null ? string3 : "";
        }
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        FragmentProcessResultSmallDialogBinding fragmentProcessResultSmallDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str = null;
        if (fragmentProcessResultSmallDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentProcessResultSmallDialogBinding = null;
        }
        fragmentProcessResultSmallDialogBinding.imgSuccess.setImageResource(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        TextView textView = fragmentProcessResultSmallDialogBinding.tvResultMessage;
        String str2 = this.asBinder;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str2 = null;
        }
        textView.setText(str2);
        MaterialButton materialButton = fragmentProcessResultSmallDialogBinding.btnResultDialog;
        String str3 = this.a;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str3 = null;
        }
        materialButton.setText(str3);
        TextView textView2 = fragmentProcessResultSmallDialogBinding.tvResultTitle;
        String str4 = this.b;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str4 = null;
        }
        textView2.setText(str4);
        String str5 = this.b;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            str = str5;
        }
        if (str.length() == 0) {
            TextView textView3 = fragmentProcessResultSmallDialogBinding.tvResultTitle;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(8);
        }
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void b() {
        FragmentProcessResultSmallDialogBinding fragmentProcessResultSmallDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fragmentProcessResultSmallDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentProcessResultSmallDialogBinding = null;
        }
        MaterialButton materialButton = fragmentProcessResultSmallDialogBinding.btnResultDialog;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: isUseCaseAttached
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getCameraState.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getCameraState getcamerastate, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcamerastate.g;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        getcamerastate.dismiss();
        return Unit.INSTANCE;
    }
}
