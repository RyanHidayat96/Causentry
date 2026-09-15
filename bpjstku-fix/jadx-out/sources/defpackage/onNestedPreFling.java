package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentShowBannerDialogBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0012B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0011\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u001a\u0010\u0012\u001a\u00020\u00198\u0015X\u0094D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001c\u001a\u00020\u001e8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b\u0014\u0010 R\u0016\u0010\u001a\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\"R\u0018\u0010\u0016\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0012\u0010$"}, d2 = {"LonNestedPreFling;", "LMediaSessionCompatMediaSessionImplApi181;", "Lkotlin/Function0;", "", "p0", "p1", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentbindingInflater1", "()V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "Lkotlin/jvm/functions/Function0;", "a", "Lcom/bpjstku/databinding/FragmentShowBannerDialogBinding;", "Lcom/bpjstku/databinding/FragmentShowBannerDialogBinding;", "", "asInterface", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()I", "", "Z", "()Z", "", "Ljava/lang/String;", "LonNestedPreFling$b;", "LonNestedPreFling$b;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class onNestedPreFling extends MediaSessionCompatMediaSessionImplApi181 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private FragmentShowBannerDialogBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final int b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public b a;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public interface b {
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    public /* synthetic */ onNestedPreFling(Function0 function0, Function0 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0, (i & 2) != 0 ? null : function1);
    }

    public onNestedPreFling(Function0<Unit> function0, Function0<Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function0;
        this.TuitionPaymentFragmentbindingInflater1 = function1;
        this.b = R.layout.fragment_show_banner_dialog;
        this.asInterface = "";
    }

    /* JADX INFO: renamed from: onNestedPreFling$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LonNestedPreFling$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ onNestedPreFling TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, Function0 function0) {
            Intrinsics.checkNotNullParameter(str, "");
            onNestedPreFling onnestedprefling = new onNestedPreFling(function0, null);
            Bundle bundle = new Bundle();
            bundle.putString("result_dialog_image", str);
            onnestedprefling.setArguments(bundle);
            return onnestedprefling;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final int getB() {
        return this.b;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentShowBannerDialogBinding fragmentShowBannerDialogBindingInflate = FragmentShowBannerDialogBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = fragmentShowBannerDialogBindingInflate;
        if (fragmentShowBannerDialogBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentShowBannerDialogBindingInflate = null;
        }
        FrameLayout root = fragmentShowBannerDialogBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentbindingInflater1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("result_dialog_image");
            if (string == null) {
                string = "";
            }
            this.asInterface = string;
        }
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.asInterface.length() > 0) {
            FragmentShowBannerDialogBinding fragmentShowBannerDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (fragmentShowBannerDialogBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentShowBannerDialogBinding = null;
            }
            ImageView imageView = fragmentShowBannerDialogBinding.imgBannerPopup;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            lambdacreateCameraSelectorById0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageView, contextRequireContext, this.asInterface, R.drawable.ic_placeholder, R.drawable.ic_placeholder);
        }
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void b() {
        FragmentShowBannerDialogBinding fragmentShowBannerDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        FragmentShowBannerDialogBinding fragmentShowBannerDialogBinding2 = null;
        if (fragmentShowBannerDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentShowBannerDialogBinding = null;
        }
        ImageView imageView = fragmentShowBannerDialogBinding.imgBannerPopup;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: onNestedScroll
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onNestedPreFling.b(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
        FragmentShowBannerDialogBinding fragmentShowBannerDialogBinding3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fragmentShowBannerDialogBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentShowBannerDialogBinding2 = fragmentShowBannerDialogBinding3;
        }
        TextView textView = fragmentShowBannerDialogBinding2.tvCloseBanner;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: onNestedFling
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onNestedPreFling.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
    }

    public static /* synthetic */ Unit b(onNestedPreFling onnestedprefling, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0 = onnestedprefling.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (function0 != null) {
            function0.invoke();
        }
        b bVar = onnestedprefling.a;
        onnestedprefling.dismiss();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(onNestedPreFling onnestedprefling, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0 = onnestedprefling.TuitionPaymentFragmentbindingInflater1;
        if (function0 != null) {
            function0.invoke();
        }
        b bVar = onnestedprefling.a;
        onnestedprefling.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public onNestedPreFling() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
