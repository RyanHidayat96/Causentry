package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentShowRateAppBinding;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0012B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u00188\u0015X\u0095D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0016\u0010\u0011\u001a\u00020\u001c8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u001a\u0010\u0013\u001a\u00020\u001e8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010\u0014\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0016\u0010\u0017\u001a\u00020\"8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b \u0010#R\u0018\u0010 \u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000f\u0010'"}, d2 = {"LgetZoomControl;", "LMediaSessionCompatMediaSessionImplApi181;", "Lkotlin/Function0;", "", "p0", "p1", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentbindingInflater1", "()V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "a", "Lkotlin/jvm/functions/Function0;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "", "asBinder", "I", "()I", "Lcom/bpjstku/databinding/FragmentShowRateAppBinding;", "Lcom/bpjstku/databinding/FragmentShowRateAppBinding;", "", "Z", "d", "()Z", "", "Ljava/lang/String;", "notify", "g", "LgetZoomControl$b;", "LgetZoomControl$b;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getZoomControl extends MediaSessionCompatMediaSessionImplApi181 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public b d;
    private FragmentShowRateAppBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private String a;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Function0<Unit> b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String g;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private String asInterface;

    public interface b {
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    public /* synthetic */ getZoomControl(Function0 function0, Function0 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0, (i & 2) != 0 ? null : function1);
    }

    public getZoomControl(Function0<Unit> function0, Function0<Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function0;
        this.b = function1;
        this.TuitionPaymentFragmentbindingInflater1 = R.layout.fragment_show_rate_app;
        this.a = "";
    }

    /* JADX INFO: renamed from: getZoomControl$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"LgetZoomControl$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "", "p0", "p1", "Lkotlin/Function0;", "", "p2", "p3", "LgetZoomControl;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)LgetZoomControl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static getZoomControl TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0, String p1, Function0<Unit> p2, Function0<Unit> p3) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getZoomControl getzoomcontrol = new getZoomControl(p2, p3);
            Bundle bundle = new Bundle();
            bundle.putString("title_rate_app", p0);
            bundle.putString("content_rate_app", p1);
            getzoomcontrol.setArguments(bundle);
            return getzoomcontrol;
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
        FragmentShowRateAppBinding fragmentShowRateAppBindingInflate = FragmentShowRateAppBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = fragmentShowRateAppBindingInflate;
        if (fragmentShowRateAppBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentShowRateAppBindingInflate = null;
        }
        FrameLayout root = fragmentShowRateAppBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getTuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentbindingInflater1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("title_rate_app");
            if (string == null) {
                string = "";
            }
            this.asInterface = string;
            String string2 = arguments.getString("content_rate_app");
            this.g = string2 != null ? string2 : "";
        }
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        FragmentShowRateAppBinding fragmentShowRateAppBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str = null;
        if (fragmentShowRateAppBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentShowRateAppBinding = null;
        }
        AppCompatTextView appCompatTextView = fragmentShowRateAppBinding.tvTitle;
        String str2 = this.asInterface;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str2 = null;
        }
        appCompatTextView.setText(str2.toString());
        AppCompatTextView appCompatTextView2 = fragmentShowRateAppBinding.tvMessage;
        String str3 = this.g;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            str = str3;
        }
        appCompatTextView2.setText(str.toString());
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void b() {
        FragmentShowRateAppBinding fragmentShowRateAppBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fragmentShowRateAppBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentShowRateAppBinding = null;
        }
        MaterialButton materialButton = fragmentShowRateAppBinding.btnNo;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: isTorchOn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getZoomControl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        MaterialButton materialButton2 = fragmentShowRateAppBinding.btnYes;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: lambdaaddSessionCameraCaptureCallback8androidxcameracamera2internalCamera2CameraControlImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getZoomControl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(getZoomControl getzoomcontrol, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0 = getzoomcontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (function0 != null) {
            function0.invoke();
        }
        b bVar = getzoomcontrol.d;
        getzoomcontrol.dismiss();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(getZoomControl getzoomcontrol, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0 = getzoomcontrol.b;
        if (function0 != null) {
            function0.invoke();
        }
        b bVar = getzoomcontrol.d;
        getzoomcontrol.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getZoomControl() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
