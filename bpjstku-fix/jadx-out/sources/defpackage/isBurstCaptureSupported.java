package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.data.scholarship.model.request.ScholarshipEducationListRequest;
import com.bpjstku.data.scholarship.model.response.ScholarshipEducationListResponse;
import com.bpjstku.databinding.FragmentScholarBenefitStep2Binding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.scholarship.benefit.ScholarBenefitActivity;
import com.bpjstku.presentation.scholarship.benefit.fragment.ScholarBenefitStep2Fragment$bindingInflater$1;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u000e8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R.\u0010\u001c\u001a\u001c\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u00168UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"LisBurstCaptureSupported;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentScholarBenefitStep2Binding;", "<init>", "()V", "", "INotificationSideChannelDefault", "g", "cancelAll", "INotificationSideChannel", "cancel", "onTransact", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "", "asBinder", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LrefreshPreviewSize;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LrefreshPreviewSize;", "b", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "d", "()Lkotlin/jvm/functions/Function3;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class isBurstCaptureSupported extends AutoValue_ImmutableImageInfo<FragmentScholarBenefitStep2Binding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private refreshPreviewSize b;

    static final /* synthetic */ class TuitionPaymentFragmentbindingInflater1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentbindingInflater1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(obj);
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getINotificationSideChannel() {
        return R.layout.fragment_scholar_benefit_step2;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        TextInputLayout textInputLayout = INotificationSideChannelStub().fragScholarEdustateLay;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentScholarBenefitStep2Binding> d() {
        return ScholarBenefitStep2Fragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "");
        final generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist = (generateUltraHdrSupportedCombinationList) ((ScholarBenefitActivity) fragmentActivityRequireActivity).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        MaterialButton materialButton = INotificationSideChannelStub().fragScholarStep2Next;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: of
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isBurstCaptureSupported.TuitionPaymentFragmentspecialinlinedviewModeldefault1(generateultrahdrsupportedcombinationlist, this, (View) obj);
            }
        }));
        EditText editText = INotificationSideChannelStub().fragScholarEdustateLay.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: captureBurstRequests
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    isBurstCaptureSupported.TuitionPaymentFragmentspecialinlinedviewModeldefault3(generateultrahdrsupportedcombinationlist, this, view);
                }
            });
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "");
        generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist = (generateUltraHdrSupportedCombinationList) ((ScholarBenefitActivity) fragmentActivityRequireActivity).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        generateultrahdrsupportedcombinationlist.asBinder.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: SynchronizedCaptureSession
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isBurstCaptureSupported.TuitionPaymentFragmentbindingInflater1(this.b, (ScholarPersonDetail) obj);
            }
        }));
        generateultrahdrsupportedcombinationlist.cancel.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentbindingInflater1(new captureSingleRequest(this, generateultrahdrsupportedcombinationlist)));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "");
        final generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist = (generateUltraHdrSupportedCombinationList) ((ScholarBenefitActivity) fragmentActivityRequireActivity).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity2, "");
        ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities = (ActivityResultContractsPickVisualMediaMediaCapabilities) ((ScholarBenefitActivity) fragmentActivityRequireActivity2).TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        ScholarPersonDetail value = generateultrahdrsupportedcombinationlist.asBinder.getValue();
        User userAsBinder = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        String str = userAsBinder != null ? userAsBinder.b : null;
        if (str == null) {
            str = "";
        }
        User userAsBinder2 = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        String str2 = userAsBinder2 != null ? userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = value != null ? value.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = value != null ? value.INotificationSideChannelStub : null;
        if (str4 == null) {
            str4 = "";
        }
        ScholarshipEducationListRequest scholarshipEducationListRequest = new ScholarshipEducationListRequest(str, str2, str3, str4);
        Intrinsics.checkNotNullParameter(scholarshipEducationListRequest, "");
        MutableLiveData<VirtualCameraAdapter1<List<ScholarshipEducationListResponse>>> mutableLiveData = generateultrahdrsupportedcombinationlist.cancel;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(generateultrahdrsupportedcombinationlist.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(scholarshipEducationListRequest)));
        final Function1 function1 = new Function1() { // from class: generateSurfaceSizeDefinition
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return generateUltraHdrSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault2(generateultrahdrsupportedcombinationlist, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getUpdatedTargetFramerate
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: updateS720pOrS1440pSizeByFormat
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return generateUltraHdrSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault2(generateultrahdrsupportedcombinationlist, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getMaxSupportedFpsFromAttachedSurfaces
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        generateultrahdrsupportedcombinationlist.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        this.b = new refreshPreviewSize(contextRequireContext);
        RecyclerView recyclerView = INotificationSideChannelStub().fragScholarEdubenefitRecycler;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        refreshPreviewSize refreshpreviewsize = this.b;
        if (refreshpreviewsize == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            refreshpreviewsize = null;
        }
        recyclerView.setAdapter(refreshpreviewsize);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        MaterialButton materialButton = INotificationSideChannelStub().fragScholarStep2Next;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        MaterialButton materialButton = INotificationSideChannelStub().fragScholarStep2Next;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, isBurstCaptureSupported isburstcapturesupported, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            getOrderedSupportedStreamUseCaseSurfaceConfigList.Companion bVar = getOrderedSupportedStreamUseCaseSurfaceConfigList.INSTANCE;
            ScholarPersonDetail value = generateultrahdrsupportedcombinationlist.asBinder.getValue();
            getOrderedSupportedStreamUseCaseSurfaceConfigList getorderedsupportedstreamusecasesurfaceconfiglistTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getOrderedSupportedStreamUseCaseSurfaceConfigList.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Kondisi Akhir", "Cari Kondisi akhir", value != null ? value.MediaBrowserCompat : null, CollectionsKt.arrayListOf(new CodeNamePair("1", "Sedang Menempuh Pendidikan"), new CodeNamePair(ExifInterface.GPS_MEASUREMENT_2D, "Sudah Tidak Sekolah"), new CodeNamePair(ExifInterface.GPS_MEASUREMENT_3D, "Sudah Bekerja")), new Function1() { // from class: getInputSurface
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return isBurstCaptureSupported.TuitionPaymentFragmentspecialinlinedviewModeldefault2(generateultrahdrsupportedcombinationlist, (CodeNamePair) obj);
                }
            });
            FragmentManager childFragmentManager = isburstcapturesupported.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getorderedsupportedstreamusecasesurfaceconfiglistTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getorderedsupportedstreamusecasesurfaceconfiglistTuitionPaymentFragmentspecialinlinedviewModeldefault3.show(childFragmentManager, getorderedsupportedstreamusecasesurfaceconfiglistTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(isBurstCaptureSupported isburstcapturesupported, ScholarPersonDetail scholarPersonDetail) {
        CodeNamePair codeNamePair = scholarPersonDetail.MediaBrowserCompat;
        String str = codeNamePair != null ? codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        if (str == null) {
            str = "";
        }
        if (str.length() > 0) {
            TextInputEditText textInputEditText = isburstcapturesupported.INotificationSideChannelStub().fragScholarEdustate;
            CodeNamePair codeNamePair2 = scholarPersonDetail.MediaBrowserCompat;
            textInputEditText.setText(codeNamePair2 != null ? codeNamePair2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
        }
        isburstcapturesupported.INotificationSideChannelStub().fragScholarNote.setText(scholarPersonDetail.IconCompatParcelizer);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, isBurstCaptureSupported isburstcapturesupported, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ScholarPersonDetail value = generateultrahdrsupportedcombinationlist.asBinder.getValue();
        if (value != null) {
            String strValueOf = String.valueOf(isburstcapturesupported.INotificationSideChannelStub().fragScholarNote.getText());
            Intrinsics.checkNotNullParameter(strValueOf, "");
            value.IconCompatParcelizer = strValueOf;
        }
        generateultrahdrsupportedcombinationlist.asBinder.setValue(value);
        generateultrahdrsupportedcombinationlist.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, CodeNamePair codeNamePair) {
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        ScholarPersonDetail value = generateultrahdrsupportedcombinationlist.asBinder.getValue();
        if (value != null) {
            value.MediaBrowserCompat = codeNamePair;
        }
        generateultrahdrsupportedcombinationlist.asBinder.setValue(value);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(isBurstCaptureSupported isburstcapturesupported, generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            isburstcapturesupported.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            isburstcapturesupported.write();
            generateultrahdrsupportedcombinationlist.asBinder.setValue(generateultrahdrsupportedcombinationlist.asBinder.getValue());
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            isburstcapturesupported.write();
            getCameraState.Companion bVar = getCameraState.INSTANCE;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string = isburstcapturesupported.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string, "");
            getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_alert_red, "", strValueOf, string);
            FragmentManager childFragmentManager = isburstcapturesupported.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        return Unit.INSTANCE;
    }
}
