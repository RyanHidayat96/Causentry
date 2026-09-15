package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentSimpleDialogBinding;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003R\u0014\u0010\u0011\u001a\u00020\u00128UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0010\u001a\u00020\u00158\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010\u000f\u001a\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0013\u001a\u00020\u001a8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0016\u0010\u000e\u001a\u00020\u001a8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0006@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u001d"}, d2 = {"LlambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl;", "LMediaSessionCompatMediaSessionImplApi181;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()I", "Lcom/bpjstku/databinding/FragmentSimpleDialogBinding;", "Lcom/bpjstku/databinding/FragmentSimpleDialogBinding;", "", "d", "()Z", "", "Ljava/lang/String;", "LlambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl$b;", "LlambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl$b;", "a"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl extends MediaSessionCompatMediaSessionImplApi181 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private FragmentSimpleDialogBinding b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public b a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public interface b {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getB() {
        return R.layout.fragment_simple_dialog;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: d */
    public final boolean getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return false;
    }

    /* JADX INFO: renamed from: lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"LlambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "", "p0", "p1", "LlambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl;", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;Ljava/lang/String;)LlambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl TuitionPaymentFragmentbindingInflater1(String p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimpl = new lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl();
            Bundle bundle = new Bundle();
            bundle.putString("result_dialog_message", p0);
            bundle.putString("result_dialog_button_text", p1);
            lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimpl.setArguments(bundle);
            return lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimpl;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentSimpleDialogBinding fragmentSimpleDialogBindingInflate = FragmentSimpleDialogBinding.inflate(p0, p1, false);
        this.b = fragmentSimpleDialogBindingInflate;
        if (fragmentSimpleDialogBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentSimpleDialogBindingInflate = null;
        }
        FrameLayout root = fragmentSimpleDialogBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentbindingInflater1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("result_dialog_message");
            if (string == null) {
                string = "";
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = string;
            String string2 = arguments.getString("result_dialog_button_text");
            this.TuitionPaymentFragmentbindingInflater1 = string2 != null ? string2 : "";
        }
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        FragmentSimpleDialogBinding fragmentSimpleDialogBinding = this.b;
        String str = null;
        if (fragmentSimpleDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentSimpleDialogBinding = null;
        }
        TextView textView = fragmentSimpleDialogBinding.tvResultMessage;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str2 = null;
        }
        textView.setText(str2);
        FragmentSimpleDialogBinding fragmentSimpleDialogBinding2 = this.b;
        if (fragmentSimpleDialogBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentSimpleDialogBinding2 = null;
        }
        MaterialButton materialButton = fragmentSimpleDialogBinding2.btnResultDialog;
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            str = str3;
        }
        materialButton.setText(str);
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void b() {
        FragmentSimpleDialogBinding fragmentSimpleDialogBinding = this.b;
        if (fragmentSimpleDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentSimpleDialogBinding = null;
        }
        MaterialButton materialButton = fragmentSimpleDialogBinding.btnResultDialog;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new isBound(new Function1() { // from class: lambdadetachUseCases16androidxcameracamera2internalCamera2CameraImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimpl, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        b bVar = lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimpl.a;
        if (bVar != null) {
            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimpl.dismiss();
        return Unit.INSTANCE;
    }
}
