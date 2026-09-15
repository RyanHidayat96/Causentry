package defpackage;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import com.bpjstku.R;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.registration.pmi.model.request.CityRequest;
import com.bpjstku.databinding.FragmentVocationalRegionAndTrainingFieldBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.vocation.model.TrainingField;
import com.bpjstku.presentation.vocational.VocationalRegionAndTrainingFieldFragment$bindingInflater$1;
import com.bpjstku.presentation.vocational.model.VocationRegistrationStep;
import com.bpjstku.presentation.vocational.model.VocationalRegistration;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0005J\u000f\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0005R\u0015\u0010\u0016\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u0004\u0018\u00010\f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR*\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001e8\u0017@\u0017X\u0097\f¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0014\u0010\u0014\u001a\u00020!8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R.\u0010\u001c\u001a\u001c\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00020$8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)"}, d2 = {"LisPositivoTwist2Pro;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentVocationalRegionAndTrainingFieldBinding;", "Llambdanew0androidxcameracamera2internalcompatworkaroundRequestMonitorRequestCompleteListener;", "<init>", "()V", "", "cancelAll", "onTransact", "g", "INotificationSideChannel", "cancel", "Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;", "TuitionPaymentFragmentbindingInflater1", "INotificationSideChannelDefault", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "LPreviewDelayWhenVideoCaptureIsBoundQuirk;", "asInterface", "Lkotlin/Lazy;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/domain/vocation/model/TrainingField;", "a", "Lcom/bpjstku/domain/vocation/model/TrainingField;", "Lkotlin/Function2;", "Lcom/bpjstku/presentation/vocational/model/VocationRegistrationStep;", "Lkotlin/jvm/functions/Function2;", "", "asBinder", "()I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "d", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class isPositivoTwist2Pro extends AutoValue_ImmutableImageInfo<FragmentVocationalRegionAndTrainingFieldBinding> implements lambdanew0androidxcameracamera2internalcompatworkaroundRequestMonitorRequestCompleteListener {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public Function2<? super VocationRegistrationStep, ? super VocationalRegistration, Unit> g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private CodeNamePair TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: ImageCaptureWashedOutImageQuirk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return isPositivoTwist2Pro.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private CodeNamePair TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private TrainingField TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy b;

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return R.layout.fragment_vocational_region_and_training_field;
    }

    public isPositivoTwist2Pro() {
        final isPositivoTwist2Pro ispositivotwist2pro = this;
        this.b = LazyKt.lazy(new Function0<PreviewDelayWhenVideoCaptureIsBoundQuirk>() { // from class: com.bpjstku.presentation.vocational.VocationalRegionAndTrainingFieldFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [PreviewDelayWhenVideoCaptureIsBoundQuirk, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ PreviewDelayWhenVideoCaptureIsBoundQuirk invoke() {
                LifecycleOwner lifecycleOwner = ispositivotwist2pro;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PreviewDelayWhenVideoCaptureIsBoundQuirk.class);
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

    /* JADX INFO: renamed from: isPositivoTwist2Pro$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LisPositivoTwist2Pro$b;", "", "<init>", "()V", "Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;", "p0", "LisPositivoTwist2Pro;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;)LisPositivoTwist2Pro;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static isPositivoTwist2Pro TuitionPaymentFragmentspecialinlinedviewModeldefault1(VocationalRegistration p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            isPositivoTwist2Pro ispositivotwist2pro = new isPositivoTwist2Pro();
            Bundle bundle = new Bundle();
            bundle.putParcelable("vocation_registration_data", p0);
            ispositivotwist2pro.setArguments(bundle);
            return ispositivotwist2pro;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentVocationalRegionAndTrainingFieldBinding> d() {
        return VocationalRegionAndTrainingFieldFragment$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        FragmentVocationalRegionAndTrainingFieldBinding fragmentVocationalRegionAndTrainingFieldBindingINotificationSideChannelStub = INotificationSideChannelStub();
        VocationalRegistration vocationalRegistration = (VocationalRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        if (vocationalRegistration != null) {
            TextInputEditText textInputEditText = fragmentVocationalRegionAndTrainingFieldBindingINotificationSideChannelStub.edtProvince;
            CodeNamePair codeNamePair = vocationalRegistration.getInterfaceDescriptor;
            textInputEditText.setText(codeNamePair != null ? codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
            TextInputEditText textInputEditText2 = fragmentVocationalRegionAndTrainingFieldBindingINotificationSideChannelStub.edtCity;
            CodeNamePair codeNamePair2 = vocationalRegistration.INotificationSideChannelStub;
            textInputEditText2.setText(codeNamePair2 != null ? codeNamePair2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
            AutoCompleteTextView autoCompleteTextView = fragmentVocationalRegionAndTrainingFieldBindingINotificationSideChannelStub.edtTrainingField;
            TrainingField trainingField = vocationalRegistration.connect;
            autoCompleteTextView.setText(trainingField != null ? trainingField.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
        }
        INotificationSideChannelStub().tilTrainingProvince.setError(null);
        INotificationSideChannelStub().tilTrainingProvince.setErrorEnabled(false);
        INotificationSideChannelStub().tilTrainingRegion.setError(null);
        INotificationSideChannelStub().tilTrainingRegion.setErrorEnabled(false);
        INotificationSideChannelStub().tilTrainingField.setError(null);
        INotificationSideChannelStub().tilTrainingField.setErrorEnabled(false);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        FragmentVocationalRegionAndTrainingFieldBinding fragmentVocationalRegionAndTrainingFieldBindingINotificationSideChannelStub = INotificationSideChannelStub();
        Button button = fragmentVocationalRegionAndTrainingFieldBindingINotificationSideChannelStub.btnFindTraining;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: isMotoE13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isPositivoTwist2Pro.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        EditText editText = fragmentVocationalRegionAndTrainingFieldBindingINotificationSideChannelStub.tilTrainingField.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: isItelW6004
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    isPositivoTwist2Pro.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, view);
                }
            });
        }
        EditText editText2 = fragmentVocationalRegionAndTrainingFieldBindingINotificationSideChannelStub.tilTrainingRegion.getEditText();
        if (editText2 != null) {
            editText2.setOnClickListener(new View.OnClickListener() { // from class: isSamsungTabA8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    isPositivoTwist2Pro.b(this.TuitionPaymentFragmentbindingInflater1, view);
                }
            });
        }
        EditText editText3 = fragmentVocationalRegionAndTrainingFieldBindingINotificationSideChannelStub.tilTrainingProvince.getEditText();
        if (editText3 != null) {
            editText3.setOnClickListener(new View.OnClickListener() { // from class: ImageCapturePixelHDRPlusQuirk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    isPositivoTwist2Pro.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
                }
            });
        }
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        FragmentVocationalRegionAndTrainingFieldBinding fragmentVocationalRegionAndTrainingFieldBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputLayout textInputLayout = fragmentVocationalRegionAndTrainingFieldBindingINotificationSideChannelStub.tilTrainingProvince;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        TextInputLayout textInputLayout2 = fragmentVocationalRegionAndTrainingFieldBindingINotificationSideChannelStub.tilTrainingRegion;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string2 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string2))));
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        Button button = INotificationSideChannelStub().btnFindTraining;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        Button button = INotificationSideChannelStub().btnFindTraining;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(true);
    }

    public static /* synthetic */ VocationalRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault2(isPositivoTwist2Pro ispositivotwist2pro) {
        Bundle arguments = ispositivotwist2pro.getArguments();
        if (arguments != null) {
            return (VocationalRegistration) arguments.getParcelable("vocation_registration_data");
        }
        return null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(isPositivoTwist2Pro ispositivotwist2pro, CodeNamePair codeNamePair) {
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        ispositivotwist2pro.TuitionPaymentFragmentbindingInflater1 = codeNamePair;
        ispositivotwist2pro.INotificationSideChannelStub().edtProvince.setText(codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        ispositivotwist2pro.INotificationSideChannelStub().tilTrainingRegion.setError(null);
        ispositivotwist2pro.INotificationSideChannelStub().tilTrainingRegion.setErrorEnabled(false);
        ispositivotwist2pro.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        TextInputEditText textInputEditText = ispositivotwist2pro.INotificationSideChannelStub().edtCity;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        TextInputEditText textInputEditText2 = textInputEditText;
        Intrinsics.checkNotNullParameter(textInputEditText2, "");
        textInputEditText2.setText("");
        final PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk = (PreviewDelayWhenVideoCaptureIsBoundQuirk) ispositivotwist2pro.b.getValue();
        String str = codeNamePair.b;
        Intrinsics.checkNotNullParameter(str, "");
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData = previewDelayWhenVideoCaptureIsBoundQuirk.f196a;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(previewDelayWhenVideoCaptureIsBoundQuirk.RemoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new CityRequest(str))));
        final Function1 function1 = new Function1() { // from class: ExtraSupportedSurfaceCombinationsContainer
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(previewDelayWhenVideoCaptureIsBoundQuirk, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: forceOnConfigureFailed
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: onSessionConfigured
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewDelayWhenVideoCaptureIsBoundQuirk.INotificationSideChannel(previewDelayWhenVideoCaptureIsBoundQuirk, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: isFlashAvailable
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        previewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void b(final isPositivoTwist2Pro ispositivotwist2pro, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (ispositivotwist2pro.TuitionPaymentFragmentbindingInflater1 != null) {
                TrustedWebActivityService1.Companion companion = TrustedWebActivityService1.INSTANCE;
                TrustedWebActivityService1 trustedWebActivityService1TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TrustedWebActivityService1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(ispositivotwist2pro.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ispositivotwist2pro.TuitionPaymentFragmentbindingInflater1, new Function1() { // from class: workaroundBySurfaceProcessing
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return isPositivoTwist2Pro.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (CodeNamePair) obj);
                    }
                });
                FragmentManager childFragmentManager = ispositivotwist2pro.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                Intrinsics.checkNotNullParameter(childFragmentManager, "");
                if (childFragmentManager.findFragmentByTag(trustedWebActivityService1TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    trustedWebActivityService1TuitionPaymentFragmentspecialinlinedviewModeldefault2.show(childFragmentManager, trustedWebActivityService1TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final isPositivoTwist2Pro ispositivotwist2pro, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            createServiceIntent.Companion companion = createServiceIntent.INSTANCE;
            createServiceIntent createserviceintentTuitionPaymentFragmentspecialinlinedviewModeldefault1 = createServiceIntent.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(ispositivotwist2pro.TuitionPaymentFragmentbindingInflater1, new Function1() { // from class: isVivo1805
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return isPositivoTwist2Pro.TuitionPaymentFragmentbindingInflater1(this.b, (CodeNamePair) obj);
                }
            });
            FragmentManager childFragmentManager = ispositivotwist2pro.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(createserviceintentTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                createserviceintentTuitionPaymentFragmentspecialinlinedviewModeldefault1.show(childFragmentManager, createserviceintentTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(isPositivoTwist2Pro ispositivotwist2pro, CodeNamePair codeNamePair) {
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        ispositivotwist2pro.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = codeNamePair;
        AutoCompleteTextView autoCompleteTextView = ispositivotwist2pro.INotificationSideChannelStub().edtTrainingField;
        Intrinsics.checkNotNullExpressionValue(autoCompleteTextView, "");
        AutoCompleteTextView autoCompleteTextView2 = autoCompleteTextView;
        Intrinsics.checkNotNullParameter(autoCompleteTextView2, "");
        autoCompleteTextView2.setText("");
        ispositivotwist2pro.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        ispositivotwist2pro.INotificationSideChannelStub().edtCity.setText(codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(isPositivoTwist2Pro ispositivotwist2pro, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function2<? super VocationRegistrationStep, ? super VocationalRegistration, Unit> function2 = ispositivotwist2pro.g;
        if (function2 != null) {
            function2.invoke(VocationRegistrationStep.STEP_3, ispositivotwist2pro.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(isPositivoTwist2Pro ispositivotwist2pro, TrainingField trainingField) {
        Intrinsics.checkNotNullParameter(trainingField, "");
        ispositivotwist2pro.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = trainingField;
        ispositivotwist2pro.INotificationSideChannelStub().edtTrainingField.setText(trainingField.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final isPositivoTwist2Pro ispositivotwist2pro, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            CodeNamePair codeNamePair = ispositivotwist2pro.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (codeNamePair != null) {
                RequestMonitorExternalSyntheticLambda0.Companion bVar = RequestMonitorExternalSyntheticLambda0.INSTANCE;
                RequestMonitorExternalSyntheticLambda0 requestMonitorExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3 = RequestMonitorExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(ispositivotwist2pro.TuitionPaymentFragmentspecialinlinedviewModeldefault2, codeNamePair, new Function1() { // from class: ImageCaptureFlashNotFireQuirk
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return isPositivoTwist2Pro.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (TrainingField) obj);
                    }
                });
                FragmentManager childFragmentManager = ispositivotwist2pro.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                Intrinsics.checkNotNullParameter(childFragmentManager, "");
                if (childFragmentManager.findFragmentByTag(requestMonitorExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    requestMonitorExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.show(childFragmentManager, requestMonitorExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    private VocationalRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        VocationalRegistration vocationalRegistration = (VocationalRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        if (vocationalRegistration != null) {
            CodeNamePair codeNamePair = this.TuitionPaymentFragmentbindingInflater1;
            if (codeNamePair == null) {
                codeNamePair = new CodeNamePair(null, null, 3, null);
            }
            vocationalRegistration.getInterfaceDescriptor = codeNamePair;
            CodeNamePair codeNamePair2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (codeNamePair2 == null) {
                codeNamePair2 = new CodeNamePair(null, null, 3, null);
            }
            vocationalRegistration.INotificationSideChannelStub = codeNamePair2;
            TrainingField trainingField = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (trainingField == null) {
                trainingField = new TrainingField(null, null, 3, null);
            }
            vocationalRegistration.connect = trainingField;
            return vocationalRegistration;
        }
        return new VocationalRegistration(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ViewCompat.MEASURED_SIZE_MASK, null);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        VocationalRegistration vocationalRegistration = (VocationalRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        if (vocationalRegistration != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = vocationalRegistration.INotificationSideChannelStub;
            this.TuitionPaymentFragmentbindingInflater1 = vocationalRegistration.getInterfaceDescriptor;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = vocationalRegistration.connect;
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        final PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk = (PreviewDelayWhenVideoCaptureIsBoundQuirk) this.b.getValue();
        if (previewDelayWhenVideoCaptureIsBoundQuirk.g.getValue() instanceof VirtualCameraAdapter1.asBinder) {
            return;
        }
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData = previewDelayWhenVideoCaptureIsBoundQuirk.g;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(previewDelayWhenVideoCaptureIsBoundQuirk.RemoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new BaseRequest())));
        final Function1 function1 = new Function1() { // from class: MeteringRegionCorrection
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentbindingInflater1(previewDelayWhenVideoCaptureIsBoundQuirk, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: MaxPreviewSize
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final getMaxPreviewResolution getmaxpreviewresolution = new getMaxPreviewResolution(previewDelayWhenVideoCaptureIsBoundQuirk);
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: PreviewPixelHDRnetQuirk
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                getmaxpreviewresolution.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        previewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // defpackage.lambdanew0androidxcameracamera2internalcompatworkaroundRequestMonitorRequestCompleteListener
    public final void TuitionPaymentFragmentbindingInflater1() {
        Function2<? super VocationRegistrationStep, ? super VocationalRegistration, Unit> function2 = this.g;
        if (function2 != null) {
            function2.invoke(VocationRegistrationStep.STEP_1, TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
    }
}
