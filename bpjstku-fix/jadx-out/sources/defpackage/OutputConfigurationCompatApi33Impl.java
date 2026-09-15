package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentRevampResultDialogBinding;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\n\u0017B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\f\u0010\tJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0016\u0010\f\u001a\u00020\u001a8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\u001a8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001a8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0016\u0010\u0016\u001a\u00020 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0014\u0010%\u001a\u00020\u00188UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010$R\u0016\u0010\u001f\u001a\u00020&8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\f\u0010'R\u0014\u0010)\u001a\u00020 8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010("}, d2 = {"LOutputConfigurationCompatApi33Impl;", "LMediaSessionCompatMediaSessionImplApi181;", "Lkotlin/Function0;", "", "p0", "p1", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "TuitionPaymentFragmentbindingInflater1", "()V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "a", "Lkotlin/jvm/functions/Function0;", "asInterface", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "I", "", "cancel", "Ljava/lang/String;", "asBinder", "d", "notify", "", "Z", "LOutputConfigurationCompatApi33Impl$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "LOutputConfigurationCompatApi33Impl$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "()I", "g", "Lcom/bpjstku/databinding/FragmentRevampResultDialogBinding;", "Lcom/bpjstku/databinding/FragmentRevampResultDialogBinding;", "()Z", "INotificationSideChannel"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OutputConfigurationCompatApi33Impl extends MediaSessionCompatMediaSessionImplApi181 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private FragmentRevampResultDialogBinding notify;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String b;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean asInterface;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault2 a;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private String asBinder;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentbindingInflater1() {
        return R.layout.fragment_revamp_result_dialog;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: d */
    public final boolean getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return false;
    }

    public /* synthetic */ OutputConfigurationCompatApi33Impl(Function0 function0, Function0 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0, (i & 2) != 0 ? null : function1);
    }

    public OutputConfigurationCompatApi33Impl(Function0<Unit> function0, Function0<Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentbindingInflater1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.TuitionPaymentFragmentbindingInflater1 = arguments.getInt("result_dialog_image");
            String string = arguments.getString("result_dialog_title");
            if (string == null) {
                string = "";
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = string;
            String string2 = arguments.getString("result_dialog_message");
            if (string2 == null) {
                string2 = "";
            }
            this.b = string2;
            String string3 = arguments.getString("result_dialog_button_text");
            if (string3 == null) {
                string3 = "";
            }
            this.d = string3;
            String string4 = arguments.getString("result_dialog_secondary_button_text");
            this.asBinder = string4 != null ? string4 : "";
            this.asInterface = arguments.getBoolean("isStateIcon");
        }
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        FragmentRevampResultDialogBinding fragmentRevampResultDialogBinding = this.notify;
        String str = null;
        if (fragmentRevampResultDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentRevampResultDialogBinding = null;
        }
        TextView textView = fragmentRevampResultDialogBinding.tvResultTitle;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str2 = null;
        }
        textView.setVisibility(str2.length() > 0 ? 0 : 8);
        TextView textView2 = fragmentRevampResultDialogBinding.tvResultMessage;
        String str3 = this.b;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str3 = null;
        }
        textView2.setVisibility(str3.length() > 0 ? 0 : 8);
        MaterialButton materialButton = fragmentRevampResultDialogBinding.btnRevampContinue;
        String str4 = this.d;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str4 = null;
        }
        materialButton.setVisibility(str4.length() > 0 ? 0 : 8);
        MaterialButton materialButton2 = fragmentRevampResultDialogBinding.btnRevampCancel;
        String str5 = this.asBinder;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str5 = null;
        }
        materialButton2.setVisibility(str5.length() > 0 ? 0 : 8);
        FragmentRevampResultDialogBinding fragmentRevampResultDialogBinding2 = this.notify;
        if (fragmentRevampResultDialogBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentRevampResultDialogBinding2 = null;
        }
        if (this.asInterface) {
            fragmentRevampResultDialogBinding2.imgState.setVisibility(0);
            fragmentRevampResultDialogBinding2.imgDialog.setVisibility(8);
            fragmentRevampResultDialogBinding2.imgState.setImageResource(this.TuitionPaymentFragmentbindingInflater1);
            ViewGroup.LayoutParams layoutParams = fragmentRevampResultDialogBinding2.tvResultTitle.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.topToBottom = R.id.imgState;
            fragmentRevampResultDialogBinding2.tvResultTitle.setLayoutParams(layoutParams2);
        } else {
            fragmentRevampResultDialogBinding2.imgState.setVisibility(8);
            fragmentRevampResultDialogBinding2.imgDialog.setVisibility(0);
            fragmentRevampResultDialogBinding2.imgDialog.setImageResource(this.TuitionPaymentFragmentbindingInflater1);
        }
        TextView textView3 = fragmentRevampResultDialogBinding.tvResultTitle;
        String str6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (str6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str6 = null;
        }
        textView3.setText(str6);
        TextView textView4 = fragmentRevampResultDialogBinding.tvResultMessage;
        String str7 = this.b;
        if (str7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str7 = null;
        }
        textView4.setText(str7);
        MaterialButton materialButton3 = fragmentRevampResultDialogBinding.btnRevampContinue;
        String str8 = this.d;
        if (str8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str8 = null;
        }
        materialButton3.setText(str8);
        MaterialButton materialButton4 = fragmentRevampResultDialogBinding.btnRevampCancel;
        String str9 = this.asBinder;
        if (str9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            str = str9;
        }
        materialButton4.setText(str);
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void b() {
        FragmentRevampResultDialogBinding fragmentRevampResultDialogBinding = this.notify;
        if (fragmentRevampResultDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentRevampResultDialogBinding = null;
        }
        fragmentRevampResultDialogBinding.btnRevampContinue.setOnClickListener(new View.OnClickListener() { // from class: getSurfaceSize
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OutputConfigurationCompatApi33Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
        fragmentRevampResultDialogBinding.btnRevampCancel.setOnClickListener(new View.OnClickListener() { // from class: getOutputConfigurations
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OutputConfigurationCompatApi33Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
            }
        });
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentRevampResultDialogBinding fragmentRevampResultDialogBindingInflate = FragmentRevampResultDialogBinding.inflate(p0, p1, false);
        this.notify = fragmentRevampResultDialogBindingInflate;
        if (fragmentRevampResultDialogBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentRevampResultDialogBindingInflate = null;
        }
        FrameLayout root = fragmentRevampResultDialogBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    /* JADX INFO: renamed from: OutputConfigurationCompatApi33Impl$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0013"}, d2 = {"Lcom/bpjstku/presentation/util/RevampResultDialogFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/bpjstku/presentation/util/RevampResultDialogFragment;", "image", "", "title", "", "message", "firstButtonText", "onFirstListener", "Lkotlin/Function0;", "", "secondButtonText", "onSecondListener", "isStateIcon", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static OutputConfigurationCompatApi33Impl b(int i, String str, String str2, String str3, Function0<Unit> function0, String str4, Function0<Unit> function1, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33Impl = new OutputConfigurationCompatApi33Impl(function0, function1);
            Bundle bundle = new Bundle();
            bundle.putInt("result_dialog_image", i);
            bundle.putString("result_dialog_title", str);
            bundle.putString("result_dialog_message", str2);
            bundle.putString("result_dialog_button_text", str3);
            bundle.putString("result_dialog_secondary_button_text", str4);
            bundle.putBoolean("isStateIcon", z);
            outputConfigurationCompatApi33Impl.setArguments(bundle);
            return outputConfigurationCompatApi33Impl;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33Impl, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Function0<Unit> function0 = outputConfigurationCompatApi33Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (function0 != null) {
                function0.invoke();
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = outputConfigurationCompatApi33Impl.a;
            outputConfigurationCompatApi33Impl.dismiss();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33Impl, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Function0<Unit> function0 = outputConfigurationCompatApi33Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (function0 != null) {
                function0.invoke();
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = outputConfigurationCompatApi33Impl.a;
            outputConfigurationCompatApi33Impl.dismiss();
        } finally {
            ViewPortBuilder.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OutputConfigurationCompatApi33Impl() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
