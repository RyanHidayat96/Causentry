package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentProcessResultDialogBinding;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u0012B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\u001a8\u0015X\u0095D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001dR\u001a\u0010\u0011\u001a\u00020\u001e8\u0015X\u0095D¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010\u0014\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0016\u0010!\u001a\u00020#8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u001b\u001a\u00020#8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b!\u0010%R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0012\u0010%R\u0016\u0010\u001f\u001a\u00020#8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b'\u0010%R\u0018\u0010$\u001a\u0004\u0018\u00010(8\u0006@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b\u0013\u0010)"}, d2 = {"LgetStringOrNull;", "LMediaSessionCompatMediaSessionImplApi181;", "Lkotlin/Function0;", "", "p0", "p1", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentbindingInflater1", "()V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "a", "Lkotlin/jvm/functions/Function0;", "cancel", "Lcom/bpjstku/databinding/FragmentProcessResultDialogBinding;", "Lcom/bpjstku/databinding/FragmentProcessResultDialogBinding;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "asBinder", "I", "()I", "", "asInterface", "Z", "d", "()Z", "", "INotificationSideChannel", "Ljava/lang/String;", "g", "onTransact", "LgetStringOrNull$b;", "LgetStringOrNull$b;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getStringOrNull extends MediaSessionCompatMediaSessionImplApi181 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private String d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private FragmentProcessResultDialogBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private int a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public b INotificationSideChannel;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> b;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String g;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String asBinder;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private String asInterface;

    public interface b {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    public /* synthetic */ getStringOrNull(Function0 function0, Function0 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0, (i & 2) != 0 ? null : function1);
    }

    public getStringOrNull(Function0<Unit> function0, Function0<Unit> function1) {
        this.b = function0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        this.TuitionPaymentFragmentbindingInflater1 = R.layout.fragment_process_result_dialog;
    }

    /* JADX INFO: renamed from: getStringOrNull$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JX\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0007¨\u0006\u0011"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/ProcessResultDialogFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/bpjstku/presentation/membership/registration/ProcessResultDialogFragment;", "image", "", "title", "", "message", "buttonText", "onButtonClickedListener", "Lkotlin/Function0;", "", "secondaryButtonText", "onSecondaryButtonClickedListener", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ getStringOrNull b(int i, String str, String str2, String str3, Function0 function0, int i2) {
            if ((i2 & 16) != 0) {
                function0 = null;
            }
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, str, str2, str3, function0, null, null);
        }

        @JvmStatic
        public static getStringOrNull TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, String str, String str2, String str3, Function0<Unit> function0, String str4, Function0<Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            getStringOrNull getstringornull = new getStringOrNull(function0, function1);
            Bundle bundle = new Bundle();
            bundle.putInt("result_dialog_image", i);
            bundle.putString("result_dialog_title", str);
            bundle.putString("result_dialog_message", str2);
            bundle.putString("result_dialog_button_text", str3);
            bundle.putString("result_dialog_secondary_button_text", str4);
            getstringornull.setArguments(bundle);
            return getstringornull;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final int getB() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentProcessResultDialogBinding fragmentProcessResultDialogBindingInflate = FragmentProcessResultDialogBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = fragmentProcessResultDialogBindingInflate;
        if (fragmentProcessResultDialogBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentProcessResultDialogBindingInflate = null;
        }
        FrameLayout root = fragmentProcessResultDialogBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentbindingInflater1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.a = arguments.getInt("result_dialog_image");
            String string = arguments.getString("result_dialog_title");
            if (string == null) {
                string = "";
            }
            this.d = string;
            String string2 = arguments.getString("result_dialog_message");
            if (string2 == null) {
                string2 = "";
            }
            this.asBinder = string2;
            String string3 = arguments.getString("result_dialog_button_text");
            if (string3 == null) {
                string3 = "";
            }
            this.g = string3;
            String string4 = arguments.getString("result_dialog_secondary_button_text");
            this.asInterface = string4 != null ? string4 : "";
        }
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        FragmentProcessResultDialogBinding fragmentProcessResultDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str = null;
        if (fragmentProcessResultDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentProcessResultDialogBinding = null;
        }
        String str2 = this.d;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str2 = null;
        }
        if (str2.length() == 0) {
            TextView textView = fragmentProcessResultDialogBinding.tvResultTitle;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
        }
        fragmentProcessResultDialogBinding.imgSuccess.setImageResource(this.a);
        TextView textView2 = fragmentProcessResultDialogBinding.tvResultTitle;
        String str3 = this.d;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str3 = null;
        }
        textView2.setText(str3);
        TextView textView3 = fragmentProcessResultDialogBinding.tvResultMessage;
        String str4 = this.asBinder;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str4 = null;
        }
        textView3.setText(str4);
        MaterialButton materialButton = fragmentProcessResultDialogBinding.btnResultDialog;
        String str5 = this.g;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str5 = null;
        }
        materialButton.setText(str5);
        String str6 = this.asInterface;
        if (str6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str6 = null;
        }
        if (str6.length() > 0) {
            MaterialButton materialButton2 = fragmentProcessResultDialogBinding.btnSecondaryResultDialog;
            Intrinsics.checkNotNullExpressionValue(materialButton2, "");
            materialButton2.setVisibility(0);
            MaterialButton materialButton3 = fragmentProcessResultDialogBinding.btnSecondaryResultDialog;
            String str7 = this.asInterface;
            if (str7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                str = str7;
            }
            materialButton3.setText(str);
        }
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void b() {
        FragmentProcessResultDialogBinding fragmentProcessResultDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        FragmentProcessResultDialogBinding fragmentProcessResultDialogBinding2 = null;
        if (fragmentProcessResultDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentProcessResultDialogBinding = null;
        }
        MaterialButton materialButton = fragmentProcessResultDialogBinding.btnResultDialog;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: updateSpinnerState
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getStringOrNull.b(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
        FragmentProcessResultDialogBinding fragmentProcessResultDialogBinding3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (fragmentProcessResultDialogBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentProcessResultDialogBinding2 = fragmentProcessResultDialogBinding3;
        }
        MaterialButton materialButton2 = fragmentProcessResultDialogBinding2.btnSecondaryResultDialog;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: changeCursor
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getStringOrNull.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getStringOrNull getstringornull, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0 = getstringornull.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (function0 != null) {
            function0.invoke();
        }
        b bVar = getstringornull.INotificationSideChannel;
        if (bVar != null) {
            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        getstringornull.dismiss();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(getStringOrNull getstringornull, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0 = getstringornull.b;
        if (function0 != null) {
            function0.invoke();
        }
        b bVar = getstringornull.INotificationSideChannel;
        if (bVar != null) {
            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        getstringornull.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getStringOrNull() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
