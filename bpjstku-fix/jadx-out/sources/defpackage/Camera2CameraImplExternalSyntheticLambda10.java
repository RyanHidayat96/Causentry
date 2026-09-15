package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.LifecycleOwnerKt;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentClaimOldDataSecurityMemberDataVerificationBinding;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDataSecurityMemberDataVerificationFragment$bindingInflater$1;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDataSecurityMemberDataVerificationFragment$proceedCropResult$1$2;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.model.IndividualDataClaim;
import com.esafirm.imagepicker.features.ImagePickerActivity;
import com.esafirm.imagepicker.model.Image;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import com.yalantis.ucrop.UCrop;
import defpackage.Camera2CameraControlImplExternalSyntheticLambda4;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.io.File;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J)\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0015\u0010\u0004R\u0015\u0010\u0019\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\u0012\u001a\u00020\n8\u0015X\u0095D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R.\u0010\u001f\u001a\u001c\u0012\u0004\u0012\u00020&\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00020%8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010)"}, d2 = {"LCamera2CameraImplExternalSyntheticLambda10;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentClaimOldDataSecurityMemberDataVerificationBinding;", "<init>", "()V", "", "b_", "cancelAll", "onTransact", "g", "", "p0", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "Ljava/io/File;", "b", "(Ljava/io/File;)V", "cancel", "INotificationSideChannel", "LCamera2CameraControlImplExternalSyntheticLambda4;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/model/IndividualDataClaim;", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/model/IndividualDataClaim;", "TuitionPaymentFragmentbindingInflater1", "Ljava/io/File;", "", "asInterface", "[B", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "I", "asBinder", "()I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2CameraImplExternalSyntheticLambda10 extends AutoValue_CameraState_StateError<FragmentClaimOldDataSecurityMemberDataVerificationBinding> {
    private File TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final int b = R.layout.fragment_claim_old_data_security_member_data_verification;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private IndividualDataClaim TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.LifecycleCameraRepository
    public final void b_() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
    }

    public Camera2CameraImplExternalSyntheticLambda10() {
        final Camera2CameraImplExternalSyntheticLambda10 camera2CameraImplExternalSyntheticLambda10 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<Camera2CameraControlImplExternalSyntheticLambda4>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDataSecurityMemberDataVerificationFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [Camera2CameraControlImplExternalSyntheticLambda4, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Camera2CameraControlImplExternalSyntheticLambda4 invoke() {
                LifecycleOwner lifecycleOwner = camera2CameraImplExternalSyntheticLambda10;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Camera2CameraControlImplExternalSyntheticLambda4.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getB() {
        return this.b;
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentClaimOldDataSecurityMemberDataVerificationBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return ClaimOldDataSecurityMemberDataVerificationFragment$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        Bundle arguments = getArguments();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = arguments != null ? (IndividualDataClaim) arguments.getParcelable("individual_claim_data") : null;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        CardView cardView = asInterface().cvLivenessCheck;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        cardView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: Camera2CameraImplExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Camera2CameraImplExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (View) obj);
            }
        }));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int p0, int p1, Intent p2) throws IOException {
        if (p0 == 69) {
            Uri output = p2 != null ? UCrop.getOutput(p2) : null;
            if (output != null) {
                File file = new File(output.getPath());
                Intrinsics.checkNotNullParameter(file, "");
                long length = new File(file.getPath()).length() / 1024;
                if (getContentPaddingRight.TuitionPaymentFragmentbindingInflater1() > 0) {
                    getContentPaddingRight.b("File Size ".concat(String.valueOf(length)), new Object[0]);
                }
                if (length >= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                    b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ClaimOldDataSecurityMemberDataVerificationFragment$proceedCropResult$1$2(this, output, null), 3, null);
                } else {
                    String path = output.getPath();
                    Intrinsics.checkNotNull(path);
                    b(new File(path));
                }
            }
        } else if (p1 == -1 && p0 == 553 && p2 != null) {
            Image imageB = getCaptureNode.b(p2);
            FragmentActivity activity = getActivity();
            File cacheDir = activity != null ? activity.getCacheDir() : null;
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder("croppedSelfieImage");
            sb.append(jCurrentTimeMillis);
            sb.append(".jpg");
            File file2 = new File(cacheDir, sb.toString());
            if (file2.exists()) {
                file2.delete();
            }
            if (imageB != null) {
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                String str = imageB.TuitionPaymentFragmentbindingInflater1;
                Intrinsics.checkNotNullExpressionValue(str, "");
                Uri uriFromFile = Uri.fromFile(file2);
                Intrinsics.checkNotNullExpressionValue(uriFromFile, "");
                Camera2CameraControlExternalSyntheticLambda5.b(contextRequireContext, str, uriFromFile, this, 1.0f, 1.0f, 69);
            }
        }
        super.onActivityResult(p0, p1, p2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(File p0) {
        this.TuitionPaymentFragmentbindingInflater1 = p0;
        FragmentClaimOldDataSecurityMemberDataVerificationBinding fragmentClaimOldDataSecurityMemberDataVerificationBindingAsInterface = asInterface();
        ImageView imageView = fragmentClaimOldDataSecurityMemberDataVerificationBindingAsInterface.imgSelfiePhoto;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
        fragmentClaimOldDataSecurityMemberDataVerificationBindingAsInterface.imgSelfiePhoto.setImageURI(Uri.fromFile(this.TuitionPaymentFragmentbindingInflater1));
        ImageView imageView2 = fragmentClaimOldDataSecurityMemberDataVerificationBindingAsInterface.imgLivenessCheck;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(8);
        TextView textView = fragmentClaimOldDataSecurityMemberDataVerificationBindingAsInterface.tvLivenessCheckLabel;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2CameraImplExternalSyntheticLambda10 camera2CameraImplExternalSyntheticLambda10, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        updateFileExif updatefileexif = new updateFileExif();
        Camera2CameraImplExternalSyntheticLambda10 camera2CameraImplExternalSyntheticLambda11 = camera2CameraImplExternalSyntheticLambda10;
        Intent intent = new Intent(camera2CameraImplExternalSyntheticLambda11.getActivity(), (Class<?>) ImagePickerActivity.class);
        intent.putExtra("CameraOnlyConfig", updatefileexif.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        camera2CameraImplExternalSyntheticLambda11.startActivityForResult(intent, 553);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void b(Camera2CameraImplExternalSyntheticLambda10 camera2CameraImplExternalSyntheticLambda10, VirtualCameraAdapter1 virtualCameraAdapter1) {
        IndividualDataClaim individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            camera2CameraImplExternalSyntheticLambda10.IconCompatParcelizer();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            camera2CameraImplExternalSyntheticLambda10.write();
            if (((BaseModel) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getB()) {
                IndividualDataClaim individualDataClaim = camera2CameraImplExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (individualDataClaim != null) {
                    byte[] bArr = camera2CameraImplExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -1048577, -1, 127, null);
                } else {
                    individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                }
                lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
                lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol = new lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1, false, 2, null);
                Intrinsics.checkNotNullParameter(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol, "");
                lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol);
                return;
            }
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            camera2CameraImplExternalSyntheticLambda10.write();
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            getCameraState.Companion companion2 = getCameraState.INSTANCE;
            String string = camera2CameraImplExternalSyntheticLambda10.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string, "");
            getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_document_failed, "", strValueOf, string);
            FragmentManager childFragmentManager = camera2CameraImplExternalSyntheticLambda10.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Camera2CameraImplExternalSyntheticLambda10 camera2CameraImplExternalSyntheticLambda10, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            camera2CameraImplExternalSyntheticLambda10.IconCompatParcelizer();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            camera2CameraImplExternalSyntheticLambda10.write();
            if (((BaseModel) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getB()) {
                lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
                IndividualDataClaim individualDataClaim = camera2CameraImplExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol = new lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl(individualDataClaim != null ? IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, camera2CameraImplExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -1048577, -1, 127, null) : null, false, 2, null);
                Intrinsics.checkNotNullParameter(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol, "");
                lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol);
                return;
            }
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            camera2CameraImplExternalSyntheticLambda10.write();
            Camera2CameraImplExternalSyntheticLambda10 camera2CameraImplExternalSyntheticLambda11 = camera2CameraImplExternalSyntheticLambda10;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Intrinsics.checkNotNullParameter(camera2CameraImplExternalSyntheticLambda11, "");
            Intrinsics.checkNotNullParameter(strValueOf, "");
            BaseActivity baseActivity = (BaseActivity) camera2CameraImplExternalSyntheticLambda11.getContext();
            if (baseActivity != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, null);
            }
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        Camera2CameraImplExternalSyntheticLambda10 camera2CameraImplExternalSyntheticLambda10 = this;
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).g.observe(camera2CameraImplExternalSyntheticLambda10, new Observer() { // from class: Camera2CameraImplExternalSyntheticLambda19
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                Camera2CameraImplExternalSyntheticLambda10.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(camera2CameraImplExternalSyntheticLambda10, new Observer() { // from class: Camera2CameraImplExternalSyntheticLambda18
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                Camera2CameraImplExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
    }
}
