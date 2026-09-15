package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentEditPhoneNumberDialogBinding;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0003R$\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0012\u001a\u00020\u001b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\u001d8\u0015X\u0095D¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"LsetDefaultLocales;", "LMediaSessionCompatMediaSessionImplApi21ExtraSession;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "asInterface", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "Lcom/bpjstku/databinding/FragmentEditPhoneNumberDialogBinding;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/bpjstku/databinding/FragmentEditPhoneNumberDialogBinding;", "", "()I", "", "Z", "d", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setDefaultLocales extends MediaSessionCompatMediaSessionImplApi21ExtraSession {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean TuitionPaymentFragmentbindingInflater1 = true;
    private FragmentEditPhoneNumberDialogBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private Function1<? super String, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentbindingInflater1() {
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return R.layout.fragment_edit_phone_number_dialog;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    /* JADX INFO: renamed from: setDefaultLocales$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"LsetDefaultLocales$b;", "", "<init>", "()V", "Lkotlin/Function1;", "", "", "p0", "LsetDefaultLocales;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lkotlin/jvm/functions/Function1;)LsetDefaultLocales;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static setDefaultLocales TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1<? super String, Unit> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            setDefaultLocales setdefaultlocales = new setDefaultLocales();
            setdefaultlocales.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = p0;
            return setdefaultlocales;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentEditPhoneNumberDialogBinding fragmentEditPhoneNumberDialogBindingInflate = FragmentEditPhoneNumberDialogBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = fragmentEditPhoneNumberDialogBindingInflate;
        if (fragmentEditPhoneNumberDialogBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditPhoneNumberDialogBindingInflate = null;
        }
        FrameLayout root = fragmentEditPhoneNumberDialogBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi21ExtraSession
    public final void asInterface() {
        FragmentEditPhoneNumberDialogBinding fragmentEditPhoneNumberDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (fragmentEditPhoneNumberDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditPhoneNumberDialogBinding = null;
        }
        TextInputEditText textInputEditText = fragmentEditPhoneNumberDialogBinding.edtPhoneNumber;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.error_phone_number_length);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentbindingInflater1(new unregisterLifecycle(textInputEditText, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string2, 9, 12)})));
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void b() {
        FragmentEditPhoneNumberDialogBinding fragmentEditPhoneNumberDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (fragmentEditPhoneNumberDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditPhoneNumberDialogBinding = null;
        }
        Button button = fragmentEditPhoneNumberDialogBinding.btnSavePhoneNumber;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new AppCompatDelegateImplApi26Impl(this)));
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getB() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        FragmentEditPhoneNumberDialogBinding fragmentEditPhoneNumberDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (fragmentEditPhoneNumberDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditPhoneNumberDialogBinding = null;
        }
        Button button = fragmentEditPhoneNumberDialogBinding.btnSavePhoneNumber;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        FragmentEditPhoneNumberDialogBinding fragmentEditPhoneNumberDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (fragmentEditPhoneNumberDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditPhoneNumberDialogBinding = null;
        }
        Button button = fragmentEditPhoneNumberDialogBinding.btnSavePhoneNumber;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(true);
    }

    public static /* synthetic */ Unit b(setDefaultLocales setdefaultlocales, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        FragmentEditPhoneNumberDialogBinding fragmentEditPhoneNumberDialogBinding = setdefaultlocales.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (fragmentEditPhoneNumberDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditPhoneNumberDialogBinding = null;
        }
        EditText editText = fragmentEditPhoneNumberDialogBinding.tilPhoneNumber.getEditText();
        String string = StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString();
        if (string.length() > 0) {
            Function1<? super String, Unit> function1 = setdefaultlocales.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (function1 != null) {
                function1.invoke(string);
            }
            setdefaultlocales.dismiss();
        }
        return Unit.INSTANCE;
    }
}
