package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentShowDialogUnlinkEwalletBinding;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0011B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0012\u001a\u00020\u00188\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u001a\u0010\u000f\u001a\u00020\u001a8\u0015X\u0095D¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001a\u0010\u0011\u001a\u00020\u001d8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\u0014\u001a\u00020!8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001f\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0013\u0010%"}, d2 = {"LonItemVisibleChanged;", "LMediaSessionCompatMediaSessionImplApi181;", "Lkotlin/Function0;", "", "p0", "p1", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentbindingInflater1", "()V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "asInterface", "Lkotlin/jvm/functions/Function0;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "a", "Lcom/bpjstku/databinding/FragmentShowDialogUnlinkEwalletBinding;", "Lcom/bpjstku/databinding/FragmentShowDialogUnlinkEwalletBinding;", "", "I", "()I", "", "Z", "d", "()Z", "", "asBinder", "Ljava/lang/String;", "LonItemVisibleChanged$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "LonItemVisibleChanged$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "g"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class onItemVisibleChanged extends MediaSessionCompatMediaSessionImplApi181 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private FragmentShowDialogUnlinkEwalletBinding b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public TuitionPaymentFragmentspecialinlinedviewModeldefault1 g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private String asBinder;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String asInterface;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    public /* synthetic */ onItemVisibleChanged(Function0 function0, Function0 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0, (i & 2) != 0 ? null : function1);
    }

    public onItemVisibleChanged(Function0<Unit> function0, Function0<Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        this.TuitionPaymentFragmentbindingInflater1 = R.layout.fragment_show_dialog_unlink_ewallet;
    }

    /* JADX INFO: renamed from: onItemVisibleChanged$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"LonItemVisibleChanged$b;", "", "<init>", "()V", "", "p0", "p1", "Lkotlin/Function0;", "", "p2", "p3", "LonItemVisibleChanged;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)LonItemVisibleChanged;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static onItemVisibleChanged TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0, String p1, Function0<Unit> p2, Function0<Unit> p3) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            onItemVisibleChanged onitemvisiblechanged = new onItemVisibleChanged(p2, p3);
            Bundle bundle = new Bundle();
            bundle.putString("unlink_account_ewallet", p0);
            bundle.putString("unlink_account_ewallet_message", p1);
            onitemvisiblechanged.setArguments(bundle);
            return onitemvisiblechanged;
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
        FragmentShowDialogUnlinkEwalletBinding fragmentShowDialogUnlinkEwalletBindingInflate = FragmentShowDialogUnlinkEwalletBinding.inflate(p0, p1, false);
        this.b = fragmentShowDialogUnlinkEwalletBindingInflate;
        if (fragmentShowDialogUnlinkEwalletBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentShowDialogUnlinkEwalletBindingInflate = null;
        }
        FrameLayout root = fragmentShowDialogUnlinkEwalletBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentbindingInflater1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("unlink_account_ewallet");
            if (string == null) {
                string = "";
            }
            this.asBinder = string;
            String string2 = arguments.getString("unlink_account_ewallet_message");
            this.asInterface = string2 != null ? string2 : "";
        }
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        FragmentShowDialogUnlinkEwalletBinding fragmentShowDialogUnlinkEwalletBinding = this.b;
        String str = null;
        if (fragmentShowDialogUnlinkEwalletBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentShowDialogUnlinkEwalletBinding = null;
        }
        AppCompatTextView appCompatTextView = fragmentShowDialogUnlinkEwalletBinding.tvTitle;
        String str2 = this.asBinder;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str2 = null;
        }
        appCompatTextView.setText(str2.toString());
        FragmentShowDialogUnlinkEwalletBinding fragmentShowDialogUnlinkEwalletBinding2 = this.b;
        if (fragmentShowDialogUnlinkEwalletBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentShowDialogUnlinkEwalletBinding2 = null;
        }
        AppCompatTextView appCompatTextView2 = fragmentShowDialogUnlinkEwalletBinding2.tvMessage;
        String str3 = this.asInterface;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            str = str3;
        }
        appCompatTextView2.setText(str.toString());
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void b() {
        FragmentShowDialogUnlinkEwalletBinding fragmentShowDialogUnlinkEwalletBinding = this.b;
        FragmentShowDialogUnlinkEwalletBinding fragmentShowDialogUnlinkEwalletBinding2 = null;
        if (fragmentShowDialogUnlinkEwalletBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentShowDialogUnlinkEwalletBinding = null;
        }
        MaterialButton materialButton = fragmentShowDialogUnlinkEwalletBinding.btnDeleteAccount;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: onItemsChanged
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onItemVisibleChanged.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        FragmentShowDialogUnlinkEwalletBinding fragmentShowDialogUnlinkEwalletBinding3 = this.b;
        if (fragmentShowDialogUnlinkEwalletBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentShowDialogUnlinkEwalletBinding2 = fragmentShowDialogUnlinkEwalletBinding3;
        }
        MaterialButton materialButton2 = fragmentShowDialogUnlinkEwalletBinding2.btnCancel;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new performIdentifierAction(this)));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(onItemVisibleChanged onitemvisiblechanged, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0 = onitemvisiblechanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (function0 != null) {
            function0.invoke();
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = onitemvisiblechanged.g;
        onitemvisiblechanged.dismiss();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(onItemVisibleChanged onitemvisiblechanged, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0 = onitemvisiblechanged.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (function0 != null) {
            function0.invoke();
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = onitemvisiblechanged.g;
        onitemvisiblechanged.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public onItemVisibleChanged() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
