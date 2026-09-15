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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.LifecycleOwnerKt;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.jht.model.request.CheckPhotoAdminDukRequest;
import com.bpjstku.databinding.FragmentClaimOldDaySecurityDocumentUploadBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityDocumentUploadFragment$bindingInflater$1;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityDocumentUploadFragment$proceedCroppedFamilyCard$1$1;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityDocumentUploadFragment$proceedCroppedIdCard$1$1;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityDocumentUploadFragment$showBpjstkuPhoto$1$1$1;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityDocumentUploadFragment$showPaklaringPhoto$1$1;
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
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J)\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0019\u0010\u0004R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0015\u0010\u001d\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010#\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0014\u0010(\u001a\u00020\n8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010'R.\u0010\u001e\u001a\u001c\u0012\u0004\u0012\u00020*\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00020)8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010,"}, d2 = {"LdeviceOnError;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentClaimOldDaySecurityDocumentUploadBinding;", "<init>", "()V", "", "b_", "cancelAll", "onTransact", "g", "", "p0", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/esafirm/imagepicker/model/Image;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/esafirm/imagepicker/model/Image;I)V", "Landroid/net/Uri;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/net/Uri;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "cancel", "INotificationSideChannel", "Ljava/io/File;", "b", "Ljava/io/File;", "asBinder", "d", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Z", "LCamera2CameraControlImplExternalSyntheticLambda4;", "a", "Lkotlin/Lazy;", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/model/IndividualDataClaim;", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/model/IndividualDataClaim;", "()I", "asInterface", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class deviceOnError extends AutoValue_CameraState_StateError<FragmentClaimOldDaySecurityDocumentUploadBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private File b;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private IndividualDataClaim a;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy asBinder;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private File TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private File TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private File TuitionPaymentFragmentbindingInflater1;

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return R.layout.fragment_claim_old_day_security_document_upload;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void b_() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
    }

    public deviceOnError() {
        final deviceOnError deviceonerror = this;
        this.asBinder = LazyKt.lazy(new Function0<Camera2CameraControlImplExternalSyntheticLambda4>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityDocumentUploadFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [Camera2CameraControlImplExternalSyntheticLambda4, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Camera2CameraControlImplExternalSyntheticLambda4 invoke() {
                LifecycleOwner lifecycleOwner = deviceonerror;
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

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentClaimOldDaySecurityDocumentUploadBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return ClaimOldDaySecurityDocumentUploadFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        Bundle arguments = getArguments();
        this.a = arguments != null ? (IndividualDataClaim) arguments.getParcelable("individual_claim_data") : null;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        final FragmentClaimOldDaySecurityDocumentUploadBinding fragmentClaimOldDaySecurityDocumentUploadBindingAsInterface = asInterface();
        Button button = fragmentClaimOldDaySecurityDocumentUploadBindingAsInterface.btnNext;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: r8lambdaCMENmONtCCSl_oQTlmvEtEjJ0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return deviceOnError.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, fragmentClaimOldDaySecurityDocumentUploadBindingAsInterface, (View) obj);
            }
        }));
        CardView cardView = fragmentClaimOldDaySecurityDocumentUploadBindingAsInterface.cvIdCardUpload;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        cardView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: isErrorHandling
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return deviceOnError.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        CardView cardView2 = fragmentClaimOldDaySecurityDocumentUploadBindingAsInterface.cvBpjstkCardUpload;
        Intrinsics.checkNotNullExpressionValue(cardView2, "");
        cardView2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: Camera2CameraImplErrorTimeoutReopenScheduler
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return deviceOnError.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
        CardView cardView3 = fragmentClaimOldDaySecurityDocumentUploadBindingAsInterface.cvPaklaringUpload;
        Intrinsics.checkNotNullExpressionValue(cardView3, "");
        cardView3.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: Camera2CameraImplErrorTimeoutReopenSchedulerScheduleNode
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return deviceOnError.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        CardView cardView4 = fragmentClaimOldDaySecurityDocumentUploadBindingAsInterface.cvFamilyCardUpload;
        Intrinsics.checkNotNullExpressionValue(cardView4, "");
        cardView4.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: Camera2CameraImplErrorTimeoutReopenSchedulerScheduleNodeExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return deviceOnError.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
    }

    private final void TuitionPaymentFragmentbindingInflater1(Image p0, int p1) {
        String string;
        if (p0 != null) {
            if (p1 == 101) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder("croppedIdCardImage");
                sb.append(jCurrentTimeMillis);
                sb.append(".jpg");
                string = sb.toString();
            } else if (p1 == 201) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder("croppedBpjstkuCardImage");
                sb2.append(jCurrentTimeMillis2);
                sb2.append(".jpg");
                string = sb2.toString();
            } else if (p1 == 301) {
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                StringBuilder sb3 = new StringBuilder("croppedPaklaringImage");
                sb3.append(jCurrentTimeMillis3);
                sb3.append(".jpg");
                string = sb3.toString();
            } else if (p1 != 401) {
                string = "";
            } else {
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                StringBuilder sb4 = new StringBuilder("croppedKartuKeluargaImage");
                sb4.append(jCurrentTimeMillis4);
                sb4.append(".jpg");
                string = sb4.toString();
            }
            FragmentActivity activity = getActivity();
            File file = new File(activity != null ? activity.getCacheDir() : null, string);
            if (file.exists()) {
                file.delete();
            }
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            String str = p0.TuitionPaymentFragmentbindingInflater1;
            Intrinsics.checkNotNullExpressionValue(str, "");
            Uri uriFromFile = Uri.fromFile(file);
            Intrinsics.checkNotNullExpressionValue(uriFromFile, "");
            Camera2CameraControlExternalSyntheticLambda5.b(contextRequireContext, str, uriFromFile, this, 16.0f, 9.0f, p1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Uri p0) {
        FragmentClaimOldDaySecurityDocumentUploadBinding fragmentClaimOldDaySecurityDocumentUploadBindingAsInterface = asInterface();
        if (p0 != null) {
            String path = p0.getPath();
            Intrinsics.checkNotNull(path);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new File(path);
            ImageView imageView = fragmentClaimOldDaySecurityDocumentUploadBindingAsInterface.imgIdPhoto;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            fragmentClaimOldDaySecurityDocumentUploadBindingAsInterface.imgIdPhoto.setImageURI(Uri.fromFile(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            ImageView imageView2 = fragmentClaimOldDaySecurityDocumentUploadBindingAsInterface.imgIdCardUpload;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
            TextView textView = fragmentClaimOldDaySecurityDocumentUploadBindingAsInterface.tvIdCardUploadLabel;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Uri p0) {
        FragmentClaimOldDaySecurityDocumentUploadBinding fragmentClaimOldDaySecurityDocumentUploadBindingAsInterface = asInterface();
        if (p0 != null) {
            String path = p0.getPath();
            Intrinsics.checkNotNull(path);
            this.TuitionPaymentFragmentbindingInflater1 = new File(path);
            ImageView imageView = fragmentClaimOldDaySecurityDocumentUploadBindingAsInterface.imgFamilyCardPhoto;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            fragmentClaimOldDaySecurityDocumentUploadBindingAsInterface.imgFamilyCardPhoto.setImageURI(Uri.fromFile(this.TuitionPaymentFragmentbindingInflater1));
            ImageView imageView2 = fragmentClaimOldDaySecurityDocumentUploadBindingAsInterface.imgFamilyCardUpload;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
            TextView textView = fragmentClaimOldDaySecurityDocumentUploadBindingAsInterface.tvFamilyCardLabel;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(deviceOnError deviceonerror, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        updateFileExif updatefileexif = new updateFileExif();
        deviceOnError deviceonerror2 = deviceonerror;
        Intent intent = new Intent(deviceonerror2.getActivity(), (Class<?>) ImagePickerActivity.class);
        intent.putExtra("CameraOnlyConfig", updatefileexif.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        deviceonerror2.startActivityForResult(intent, 300);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(deviceOnError deviceonerror, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        updateFileExif updatefileexif = new updateFileExif();
        deviceOnError deviceonerror2 = deviceonerror;
        Intent intent = new Intent(deviceonerror2.getActivity(), (Class<?>) ImagePickerActivity.class);
        intent.putExtra("CameraOnlyConfig", updatefileexif.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        deviceonerror2.startActivityForResult(intent, 200);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(deviceOnError deviceonerror) {
        FragmentActivity activity = deviceonerror.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final deviceOnError deviceonerror, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            deviceonerror.IconCompatParcelizer();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            deviceonerror.write();
            boolean zBooleanValue = ((Boolean) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).booleanValue();
            if (zBooleanValue) {
                deviceonerror.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = zBooleanValue;
                String string = deviceonerror.getString(R.string.message_idcard_exist);
                Intrinsics.checkNotNullExpressionValue(string, "");
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string, 0).show();
                return;
            }
            deviceOnError deviceonerror2 = deviceonerror;
            String string2 = deviceonerror.getString(R.string.error_message_verification_selfie_failed);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            Function0 function0 = new Function0() { // from class: Camera2CameraImplErrorTimeoutReopenSchedulerScheduleNodeExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return deviceOnError.b(this.TuitionPaymentFragmentbindingInflater1);
                }
            };
            Intrinsics.checkNotNullParameter(deviceonerror2, "");
            Intrinsics.checkNotNullParameter(string2, "");
            BaseActivity baseActivity = (BaseActivity) deviceonerror2.getContext();
            if (baseActivity != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, string2, function0);
                return;
            }
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            deviceonerror.write();
            deviceOnError deviceonerror3 = deviceonerror;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Intrinsics.checkNotNullParameter(deviceonerror3, "");
            Intrinsics.checkNotNullParameter(strValueOf, "");
            BaseActivity baseActivity2 = (BaseActivity) deviceonerror3.getContext();
            if (baseActivity2 != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity2, strValueOf, null);
            }
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(deviceOnError deviceonerror, FragmentClaimOldDaySecurityDocumentUploadBinding fragmentClaimOldDaySecurityDocumentUploadBinding, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        File file = deviceonerror.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (file == null && deviceonerror.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null && deviceonerror.TuitionPaymentFragmentbindingInflater1 == null) {
            TextView textView = fragmentClaimOldDaySecurityDocumentUploadBinding.tvIdCardError;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            TextView textView2 = fragmentClaimOldDaySecurityDocumentUploadBinding.tvPaklaringError;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
            TextView textView3 = fragmentClaimOldDaySecurityDocumentUploadBinding.tvFamilyCardError;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(0);
        } else if (file == null) {
            TextView textView4 = fragmentClaimOldDaySecurityDocumentUploadBinding.tvIdCardError;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility(0);
        } else {
            File file2 = deviceonerror.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (file2 == null) {
                TextView textView5 = fragmentClaimOldDaySecurityDocumentUploadBinding.tvPaklaringError;
                Intrinsics.checkNotNullExpressionValue(textView5, "");
                textView5.setVisibility(0);
            } else {
                File file3 = deviceonerror.TuitionPaymentFragmentbindingInflater1;
                if (file3 == null) {
                    TextView textView6 = fragmentClaimOldDaySecurityDocumentUploadBinding.tvFamilyCardError;
                    Intrinsics.checkNotNullExpressionValue(textView6, "");
                    textView6.setVisibility(0);
                } else if (file != null && file2 != null && file3 != null) {
                    IndividualDataClaim individualDataClaim = deviceonerror.a;
                    IndividualDataClaim individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = individualDataClaim != null ? IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, deviceonerror.b, file, file2, file3, null, null, null, null, null, deviceonerror.TuitionPaymentFragmentspecialinlinedviewModeldefault2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -34537473, -1, 127, null) : null;
                    lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
                    lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol = new lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1, false, 2, null);
                    Intrinsics.checkNotNullParameter(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol, "");
                    lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(deviceOnError deviceonerror, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        updateFileExif updatefileexif = new updateFileExif();
        deviceOnError deviceonerror2 = deviceonerror;
        Intent intent = new Intent(deviceonerror2.getActivity(), (Class<?>) ImagePickerActivity.class);
        intent.putExtra("CameraOnlyConfig", updatefileexif.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        deviceonerror2.startActivityForResult(intent, 100);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(deviceOnError deviceonerror, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        updateFileExif updatefileexif = new updateFileExif();
        deviceOnError deviceonerror2 = deviceonerror;
        Intent intent = new Intent(deviceonerror2.getActivity(), (Class<?>) ImagePickerActivity.class);
        intent.putExtra("CameraOnlyConfig", updatefileexif.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        deviceonerror2.startActivityForResult(intent, 400);
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.asBinder.getValue()).getInterfaceDescriptor.observe(this, new Observer() { // from class: r8lambdaJtPeCD_jvyqbf0ap80i1_Y4C0Jk
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                deviceOnError.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        final Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4 = (Camera2CameraControlImplExternalSyntheticLambda4) this.asBinder.getValue();
        User userAsBinder = camera2CameraControlImplExternalSyntheticLambda4.IconCompatParcelizer.asBinder();
        if (userAsBinder != null) {
            MutableLiveData<VirtualCameraAdapter1<Boolean>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.getInterfaceDescriptor;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            removeOnPictureInPictureUiStateChangedListener removeonpictureinpictureuistatechangedlistener = camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelDefault;
            String str = userAsBinder.b;
            if (str == null) {
                str = "";
            }
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(removeonpictureinpictureuistatechangedlistener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new CheckPhotoAdminDukRequest(str))));
            final Function1 function1 = new Function1() { // from class: closeCamera
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(camera2CameraControlImplExternalSyntheticLambda4, (Boolean) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: detachUseCases
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: attachUseCases
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Camera2CameraControlImplExternalSyntheticLambda4.asBinder(camera2CameraControlImplExternalSyntheticLambda4, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: tryDetachUseCases
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int p0, int p1, Intent p2) {
        if (p1 != -1 || p2 == null) {
            if (p2 != null) {
                UCrop.getError(p2);
            }
        } else if (p0 != 69 && p0 != 101 && p0 != 201 && p0 != 401) {
            Image imageB = getCaptureNode.b(p2);
            if (p0 == 100) {
                TuitionPaymentFragmentbindingInflater1(imageB, 101);
            } else if (p0 == 200) {
                TuitionPaymentFragmentbindingInflater1(imageB, 201);
            } else if (p0 == 300) {
                b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ClaimOldDaySecurityDocumentUploadFragment$showPaklaringPhoto$1$1(this, imageB, asInterface(), null), 3, null);
            } else if (p0 == 400) {
                TuitionPaymentFragmentbindingInflater1(imageB, TypedValues.CycleType.TYPE_CURVE_FIT);
            }
        } else if (p2 != null) {
            Uri output = UCrop.getOutput(p2);
            if (p0 == 101) {
                if (output != null) {
                    File file = new File(output.getPath());
                    Intrinsics.checkNotNullParameter(file, "");
                    if (new File(file.getPath()).length() / 1024 >= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                        b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ClaimOldDaySecurityDocumentUploadFragment$proceedCroppedIdCard$1$1(this, output, null), 3, null);
                    } else {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3(output);
                    }
                }
                TextView textView = asInterface().tvIdCardError;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(8);
            } else if (p0 == 201) {
                FragmentClaimOldDaySecurityDocumentUploadBinding fragmentClaimOldDaySecurityDocumentUploadBindingAsInterface = asInterface();
                if (output != null) {
                    b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ClaimOldDaySecurityDocumentUploadFragment$showBpjstkuPhoto$1$1$1(this, output, fragmentClaimOldDaySecurityDocumentUploadBindingAsInterface, null), 3, null);
                }
            } else if (p0 == 401) {
                if (output != null) {
                    File file2 = new File(output.getPath());
                    Intrinsics.checkNotNullParameter(file2, "");
                    if (new File(file2.getPath()).length() / 1024 >= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                        b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ClaimOldDaySecurityDocumentUploadFragment$proceedCroppedFamilyCard$1$1(this, output, null), 3, null);
                    } else {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1(output);
                    }
                }
                TextView textView2 = asInterface().tvFamilyCardError;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(8);
            }
        }
        super.onActivityResult(p0, p1, p2);
    }
}
