package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentEditPasswordDialogBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u0003R0\u0010\u0013\u001a\u001c\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0012\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u001a\u0010\u0011\u001a\u00020\u001b8\u0015X\u0094D¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001a\u0010\u0017\u001a\u00020\u001e8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Lmessage;", "LMediaSessionCompatMediaSessionImplApi21ExtraSession;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "asInterface", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Function3;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/jvm/functions/Function3;", "Lcom/bpjstku/databinding/FragmentEditPasswordDialogBinding;", "Lcom/bpjstku/databinding/FragmentEditPasswordDialogBinding;", "", "I", "()I", "", "Z", "d", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class message extends MediaSessionCompatMediaSessionImplApi21ExtraSession {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private FragmentEditPasswordDialogBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private Function3<? super String, ? super String, ? super String, Unit> b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentbindingInflater1 = R.layout.fragment_edit_password_dialog;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
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

    /* JADX INFO: renamed from: message$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\u00020\b2\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lmessage$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lkotlin/Function3;", "", "", "p0", "Lmessage;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lkotlin/jvm/functions/Function3;)Lmessage;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static message TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function3<? super String, ? super String, ? super String, Unit> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            message messageVar = new message();
            messageVar.b = p0;
            return messageVar;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final int getTuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentEditPasswordDialogBinding fragmentEditPasswordDialogBindingInflate = FragmentEditPasswordDialogBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = fragmentEditPasswordDialogBindingInflate;
        if (fragmentEditPasswordDialogBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditPasswordDialogBindingInflate = null;
        }
        FrameLayout root = fragmentEditPasswordDialogBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        FragmentEditPasswordDialogBinding fragmentEditPasswordDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fragmentEditPasswordDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditPasswordDialogBinding = null;
        }
        Button button = fragmentEditPasswordDialogBinding.btnSavePassword;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        FragmentEditPasswordDialogBinding fragmentEditPasswordDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fragmentEditPasswordDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditPasswordDialogBinding = null;
        }
        Button button = fragmentEditPasswordDialogBinding.btnSavePassword;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(true);
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi21ExtraSession
    public final void asInterface() {
        FragmentEditPasswordDialogBinding fragmentEditPasswordDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        FragmentEditPasswordDialogBinding fragmentEditPasswordDialogBinding2 = null;
        if (fragmentEditPasswordDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditPasswordDialogBinding = null;
        }
        TextInputLayout textInputLayout = fragmentEditPasswordDialogBinding.tilOldPassword;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentbindingInflater1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        FragmentEditPasswordDialogBinding fragmentEditPasswordDialogBinding3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fragmentEditPasswordDialogBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditPasswordDialogBinding3 = null;
        }
        TextInputLayout textInputLayout2 = fragmentEditPasswordDialogBinding3.tilNewPassword;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string2 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentbindingInflater1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string2), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Minimal harus 8 karakter", 8, null), new accessconfigureInstanceInternal("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[\\\\\\/%§\"&“|`´}{°><:.;#')(@_$\"!?*=^-]).{8,}$", "Harus terdiri dari 1 huruf besar, huruf kecil, angka, dan karakter khusus")})));
        FragmentEditPasswordDialogBinding fragmentEditPasswordDialogBinding4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fragmentEditPasswordDialogBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentEditPasswordDialogBinding2 = fragmentEditPasswordDialogBinding4;
        }
        TextInputLayout textInputLayout3 = fragmentEditPasswordDialogBinding2.tilConfirmedNewPassword;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string3 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = getString(R.string.error_unmatch_password);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentbindingInflater1(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string3), new r8lambda_rcqWHl69wN3lvwkykRzEOONbC0(new Function0() { // from class: DeprecatedSinceApi
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(message.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            }
        }, string4)})));
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void b() {
        FragmentEditPasswordDialogBinding fragmentEditPasswordDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fragmentEditPasswordDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditPasswordDialogBinding = null;
        }
        Button button = fragmentEditPasswordDialogBinding.btnSavePassword;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: DimenRes
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return message.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(message messageVar, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        FragmentActivity activity = messageVar.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_save_new_password", "save_new_password"));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter("save_new_password", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("save_new_password", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("save_new_password", mapMutableMapOf);
        if (messageVar.a()) {
            FragmentEditPasswordDialogBinding fragmentEditPasswordDialogBinding = messageVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (fragmentEditPasswordDialogBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentEditPasswordDialogBinding = null;
            }
            Function3<? super String, ? super String, ? super String, Unit> function3 = messageVar.b;
            if (function3 != null) {
                EditText editText = fragmentEditPasswordDialogBinding.tilOldPassword.getEditText();
                String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
                EditText editText2 = fragmentEditPasswordDialogBinding.tilNewPassword.getEditText();
                String strValueOf2 = String.valueOf(editText2 != null ? editText2.getText() : null);
                EditText editText3 = fragmentEditPasswordDialogBinding.tilConfirmedNewPassword.getEditText();
                function3.invoke(strValueOf, strValueOf2, String.valueOf(editText3 != null ? editText3.getText() : null));
            }
        }
        messageVar.dismiss();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ boolean b(message messageVar) {
        FragmentEditPasswordDialogBinding fragmentEditPasswordDialogBinding = messageVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fragmentEditPasswordDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditPasswordDialogBinding = null;
        }
        EditText editText = fragmentEditPasswordDialogBinding.tilNewPassword.getEditText();
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        FragmentEditPasswordDialogBinding fragmentEditPasswordDialogBinding2 = messageVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fragmentEditPasswordDialogBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditPasswordDialogBinding2 = null;
        }
        EditText editText2 = fragmentEditPasswordDialogBinding2.tilConfirmedNewPassword.getEditText();
        return Intrinsics.areEqual(String.valueOf(editText2 != null ? editText2.getText() : null), strValueOf);
    }
}
