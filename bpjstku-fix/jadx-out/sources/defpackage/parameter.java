package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentEditEmailDialogBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.midtrans.sdk.corekit.core.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u0003R$\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u001a\u0010\u0010\u001a\u00020\u001b8\u0015X\u0095D¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001a\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\u001e8\u0015X\u0095D¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Lparameter;", "LMediaSessionCompatMediaSessionImplApi21ExtraSession;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "asInterface", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "Lcom/bpjstku/databinding/FragmentEditEmailDialogBinding;", "Lcom/bpjstku/databinding/FragmentEditEmailDialogBinding;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "I", "()I", "", "Z", "d", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class parameter extends MediaSessionCompatMediaSessionImplApi21ExtraSession {
    private Function1<? super String, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private FragmentEditEmailDialogBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int b = R.layout.fragment_edit_email_dialog;
    private final boolean TuitionPaymentFragmentbindingInflater1 = true;

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
        FragmentEditEmailDialogBinding fragmentEditEmailDialogBindingInflate = FragmentEditEmailDialogBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = fragmentEditEmailDialogBindingInflate;
        if (fragmentEditEmailDialogBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditEmailDialogBindingInflate = null;
        }
        ScrollView root = fragmentEditEmailDialogBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getTuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void b() {
        final FragmentEditEmailDialogBinding fragmentEditEmailDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (fragmentEditEmailDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditEmailDialogBinding = null;
        }
        Button button = fragmentEditEmailDialogBinding.btnSaveEmail;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: Dimension
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return parameter.b(fragmentEditEmailDialogBinding, this, (View) obj);
            }
        }));
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        FragmentEditEmailDialogBinding fragmentEditEmailDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (fragmentEditEmailDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditEmailDialogBinding = null;
        }
        Button button = fragmentEditEmailDialogBinding.btnSaveEmail;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        FragmentEditEmailDialogBinding fragmentEditEmailDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (fragmentEditEmailDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditEmailDialogBinding = null;
        }
        Button button = fragmentEditEmailDialogBinding.btnSaveEmail;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(true);
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi21ExtraSession
    public final void asInterface() {
        FragmentEditEmailDialogBinding fragmentEditEmailDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (fragmentEditEmailDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditEmailDialogBinding = null;
        }
        TextInputLayout textInputLayout = fragmentEditEmailDialogBinding.tilEmail;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        accessconfigureInstanceInternal accessconfigureinstanceinternal = new accessconfigureInstanceInternal("^.{1,}$", string);
        String string2 = getString(R.string.error_email_invalid);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentbindingInflater1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new accessconfigureInstanceInternal[]{accessconfigureinstanceinternal, new accessconfigureInstanceInternal(Constants.EMAIL_PATTERN, string2)})));
    }

    public static /* synthetic */ Unit b(FragmentEditEmailDialogBinding fragmentEditEmailDialogBinding, parameter parameterVar, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        EditText editText = fragmentEditEmailDialogBinding.tilEmail.getEditText();
        if (String.valueOf(editText != null ? editText.getText() : null).length() > 0) {
            Function1<? super String, Unit> function1 = parameterVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            parameterVar.dismiss();
        }
        return Unit.INSTANCE;
    }
}
