package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.fragment.app.FragmentActivity;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentChangePhotoAndFileDialogBinding;
import com.google.android.material.button.MaterialButton;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003R\u0016\u0010\u000f\u001a\u00020\u00128\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u00148\u0015X\u0095D¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0010\u001a\u00020\u00188\u0015X\u0095D¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d"}, d2 = {"LActivityResultContractsTakePicture;", "LMediaSessionCompatMediaSessionImplApi181;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/databinding/FragmentChangePhotoAndFileDialogBinding;", "Lcom/bpjstku/databinding/FragmentChangePhotoAndFileDialogBinding;", "", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()I", "", "Z", "d", "()Z", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "asInterface"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ActivityResultContractsTakePicture extends MediaSessionCompatMediaSessionImplApi181 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private FragmentChangePhotoAndFileDialogBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private Function0<Unit> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = R.layout.fragment_change_photo_and_file_dialog;
    private final boolean b = true;

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentbindingInflater1() {
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    /* JADX INFO: renamed from: ActivityResultContractsTakePicture$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"LActivityResultContractsTakePicture$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lkotlin/Function0;", "", "p0", "p1", "LActivityResultContractsTakePicture;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)LActivityResultContractsTakePicture;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static ActivityResultContractsTakePicture TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function0<Unit> p0, Function0<Unit> p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            ActivityResultContractsTakePicture activityResultContractsTakePicture = new ActivityResultContractsTakePicture();
            activityResultContractsTakePicture.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = p0;
            activityResultContractsTakePicture.TuitionPaymentFragmentbindingInflater1 = p1;
            return activityResultContractsTakePicture;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentChangePhotoAndFileDialogBinding fragmentChangePhotoAndFileDialogBindingInflate = FragmentChangePhotoAndFileDialogBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = fragmentChangePhotoAndFileDialogBindingInflate;
        if (fragmentChangePhotoAndFileDialogBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChangePhotoAndFileDialogBindingInflate = null;
        }
        FrameLayout root = fragmentChangePhotoAndFileDialogBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void b() {
        FragmentChangePhotoAndFileDialogBinding fragmentChangePhotoAndFileDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        FragmentChangePhotoAndFileDialogBinding fragmentChangePhotoAndFileDialogBinding2 = null;
        if (fragmentChangePhotoAndFileDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChangePhotoAndFileDialogBinding = null;
        }
        ImageButton imageButton = fragmentChangePhotoAndFileDialogBinding.imgTakeFromPhoto;
        Intrinsics.checkNotNullExpressionValue(imageButton, "");
        imageButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: AnimRes
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityResultContractsTakePicture.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
        FragmentChangePhotoAndFileDialogBinding fragmentChangePhotoAndFileDialogBinding3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fragmentChangePhotoAndFileDialogBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChangePhotoAndFileDialogBinding3 = null;
        }
        ImageButton imageButton2 = fragmentChangePhotoAndFileDialogBinding3.imgTakeFromGallery;
        Intrinsics.checkNotNullExpressionValue(imageButton2, "");
        imageButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: ActivityResultContractsTakeVideo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityResultContractsTakePicture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (View) obj);
            }
        }));
        FragmentChangePhotoAndFileDialogBinding fragmentChangePhotoAndFileDialogBinding4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fragmentChangePhotoAndFileDialogBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentChangePhotoAndFileDialogBinding2 = fragmentChangePhotoAndFileDialogBinding4;
        }
        MaterialButton materialButton = fragmentChangePhotoAndFileDialogBinding2.btnCancel;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: ActivityResultContractsTakePicturePreview
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityResultContractsTakePicture.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityResultContractsTakePicture activityResultContractsTakePicture, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        FragmentActivity activity = activityResultContractsTakePicture.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_change_file", "change_profile_file_from_storage"));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter("change_file_from_storage", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("change_file_from_storage", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("change_file_from_storage", mapMutableMapOf);
        Function0<Unit> function0 = activityResultContractsTakePicture.TuitionPaymentFragmentbindingInflater1;
        if (function0 != null) {
            function0.invoke();
        }
        activityResultContractsTakePicture.dismiss();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivityResultContractsTakePicture activityResultContractsTakePicture, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        FragmentActivity activity = activityResultContractsTakePicture.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_change_photo", "change_photo_from_camera"));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter("change_photo_from_camera", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("change_photo_from_camera", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("change_photo_from_camera", mapMutableMapOf);
        Function0<Unit> function0 = activityResultContractsTakePicture.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (function0 != null) {
            function0.invoke();
        }
        activityResultContractsTakePicture.dismiss();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ActivityResultContractsTakePicture activityResultContractsTakePicture, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        activityResultContractsTakePicture.dismiss();
        return Unit.INSTANCE;
    }
}
