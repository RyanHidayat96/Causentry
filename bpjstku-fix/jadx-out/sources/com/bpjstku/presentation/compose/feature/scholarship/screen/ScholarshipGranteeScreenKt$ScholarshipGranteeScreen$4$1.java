package com.bpjstku.presentation.compose.feature.scholarship.screen;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.p002lifecycle.MutableLiveData;
import com.bpjstku.R;
import com.bpjstku.data.scholarship.model.request.Penerima;
import com.bpjstku.data.scholarship.model.response.ScholarshipDataEligible;
import com.bpjstku.data.scholarship.model.response.ScholarshipEducation;
import com.bpjstku.data.scholarship.model.response.ScholarshipEducationListResponse;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$4$1;
import defpackage.StateListDrawableCompat;
import defpackage.VirtualCameraAdapter1;
import defpackage.getRatioByPercentage;
import defpackage.lambdaenableTorch1androidxcameracamera2internalTorchControl;
import defpackage.setArrowHeadLength;
import id.vida.liveness.dto.VidaLivenessResponse;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$4$1", f = "ScholarshipGranteeScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<VirtualCameraAdapter1<List<ScholarshipEducationListResponse>>> $benefitsResult$delegate;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<setArrowHeadLength> $dialogState;
    final /* synthetic */ StateListDrawableCompat $loadingHandler;
    final /* synthetic */ Function4<Integer, ScholarPersonDetail, ScholarPersonDetail, Integer, Unit> $onNavigateToForm;
    final /* synthetic */ lambdaenableTorch1androidxcameracamera2internalTorchControl $scholarConfirmViewModel;
    final /* synthetic */ getRatioByPercentage $scholarSelectViewModel;
    final /* synthetic */ MutableState<List<ScholarPersonDetail>> $scholarshipDetailList$delegate;
    final /* synthetic */ State<List<ScholarshipDataEligible>> $selectedItems$delegate;
    final /* synthetic */ MutableState<VidaLivenessResponse> $vidaLivenessResponse$delegate;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        VirtualCameraAdapter1<List<ScholarshipEducationListResponse>> value = this.$benefitsResult$delegate.getValue();
        if (!(value instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            if (!(value instanceof VirtualCameraAdapter1.asBinder)) {
                if (value instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.FALSE);
                    MutableState<setArrowHeadLength> mutableState = this.$dialogState;
                    VirtualCameraAdapter1<List<ScholarshipEducationListResponse>> value2 = this.$benefitsResult$delegate.getValue();
                    Intrinsics.checkNotNull(value2, "");
                    mutableState.setValue(new setArrowHeadLength.TuitionPaymentFragmentbindingInflater1("", String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) value2).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null, 4, null));
                    MutableLiveData<VirtualCameraAdapter1<List<ScholarshipEducationListResponse>>> mutableLiveData = this.$scholarConfirmViewModel.onTransact;
                    VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                    mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                }
            } else {
                VirtualCameraAdapter1<List<ScholarshipEducationListResponse>> value3 = this.$benefitsResult$delegate.getValue();
                Intrinsics.checkNotNull(value3, "");
                List list = (List) ((VirtualCameraAdapter1.asBinder) value3).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                for (Object obj2 : list) {
                    linkedHashMap.put(((ScholarshipEducationListResponse) obj2).getNikPenerima(), obj2);
                }
                MutableState<List<ScholarPersonDetail>> mutableState2 = this.$scholarshipDetailList$delegate;
                List<ScholarPersonDetail> value4 = mutableState2.getValue();
                MutableState<VidaLivenessResponse> mutableState3 = this.$vidaLivenessResponse$delegate;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value4, 10));
                for (ScholarPersonDetail scholarPersonDetailTuitionPaymentFragmentspecialinlinedviewModeldefault1 : value4) {
                    ScholarshipEducationListResponse scholarshipEducationListResponse = (ScholarshipEducationListResponse) linkedHashMap.get(scholarPersonDetailTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    if (scholarshipEducationListResponse != null) {
                        List<ScholarshipEducation> tingkatPendidikan = scholarshipEducationListResponse.getTingkatPendidikan();
                        ScholarshipEducation scholarshipEducation = tingkatPendidikan != null ? (ScholarshipEducation) CollectionsKt.firstOrNull((List) tingkatPendidikan) : null;
                        String jenisBeasiswa = scholarshipEducation != null ? scholarshipEducation.getJenisBeasiswa() : null;
                        if (jenisBeasiswa == null) {
                            jenisBeasiswa = "";
                        }
                        CodeNamePair codeNamePair = new CodeNamePair("", jenisBeasiswa);
                        String tingkat = scholarshipEducation != null ? scholarshipEducation.getTingkat() : null;
                        String str = tingkat == null ? "" : tingkat;
                        String jenjang = scholarshipEducation != null ? scholarshipEducation.getJenjang() : null;
                        if (jenjang == null) {
                            jenjang = "";
                        }
                        CodeNamePair codeNamePair2 = new CodeNamePair("", jenjang);
                        String lembaga = scholarshipEducation != null ? scholarshipEducation.getLembaga() : null;
                        String str2 = lembaga == null ? "" : lembaga;
                        String manfaat = scholarshipEducation != null ? scholarshipEducation.getManfaat() : null;
                        String str3 = manfaat == null ? "" : manfaat;
                        MutableState<VidaLivenessResponse> mutableState4 = mutableState3;
                        VidaLivenessResponse value5 = mutableState4.getValue();
                        String strValueOf = String.valueOf(value5 != null ? Boxing.boxDouble(value5.getLivenessScore()) : null);
                        VidaLivenessResponse value6 = mutableState4.getValue();
                        scholarPersonDetailTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarPersonDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault1(scholarPersonDetailTuitionPaymentFragmentspecialinlinedviewModeldefault1, String.valueOf(value6 != null ? Boxing.boxDouble(value6.getManipulationScore()) : null), strValueOf, codeNamePair, codeNamePair2, str, str2, str3);
                    }
                    arrayList.add(scholarPersonDetailTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
                mutableState2.setValue(arrayList);
                getRatioByPercentage getratiobypercentage = this.$scholarSelectViewModel;
                List<ScholarPersonDetail> value7 = this.$scholarshipDetailList$delegate.getValue();
                Intrinsics.checkNotNullParameter(value7, "");
                getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(value7);
                this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.FALSE);
                MutableState<setArrowHeadLength> mutableState5 = this.$dialogState;
                String string = this.$context.getString(R.string.message_success_scholarship);
                Intrinsics.checkNotNullExpressionValue(string, "");
                final MutableState<setArrowHeadLength> mutableState6 = this.$dialogState;
                final lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol = this.$scholarConfirmViewModel;
                final Function4<Integer, ScholarPersonDetail, ScholarPersonDetail, Integer, Unit> function4 = this.$onNavigateToForm;
                final MutableState<List<ScholarPersonDetail>> mutableState7 = this.$scholarshipDetailList$delegate;
                final State<List<ScholarshipDataEligible>> state = this.$selectedItems$delegate;
                mutableState5.setValue(new setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(string, new Function0() { // from class: requiresActionButton
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$4$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mutableState6, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, function4, mutableState7, state);
                    }
                }));
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(MutableState mutableState, lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, Function4 function4, MutableState mutableState2, State state) {
        Object next;
        Object next2;
        String str;
        ScholarshipDataEligible scholarshipDataEligible;
        mutableState.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
        MutableState mutableState3 = mutableState2;
        Iterator it = ((List) mutableState3.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((ScholarPersonDetail) next).TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((ScholarshipDataEligible) ((List) state.getValue()).get(0)).getNik()));
        ScholarPersonDetail scholarPersonDetail = (ScholarPersonDetail) next;
        if (scholarPersonDetail == null) {
            scholarPersonDetail = (ScholarPersonDetail) CollectionsKt.first((List) mutableState3.getValue());
        }
        Iterator it2 = ((List) mutableState3.getValue()).iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            str = ((ScholarPersonDetail) next2).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            scholarshipDataEligible = (ScholarshipDataEligible) CollectionsKt.getOrNull((List) state.getValue(), 1);
        } while (!Intrinsics.areEqual(str, scholarshipDataEligible != null ? scholarshipDataEligible.getNik() : null));
        ScholarPersonDetail scholarPersonDetail2 = (ScholarPersonDetail) next2;
        List list = (List) mutableState3.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ScholarPersonDetail scholarPersonDetail3 = (ScholarPersonDetail) obj;
            List list2 = (List) state.getValue();
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.areEqual(((ScholarshipDataEligible) it3.next()).getNik(), scholarPersonDetail3.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        MutableLiveData<VirtualCameraAdapter1<List<ScholarshipEducationListResponse>>> mutableLiveData = lambdaenabletorch1androidxcameracamera2internaltorchcontrol.onTransact;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        lambdaenabletorch1androidxcameracamera2internaltorchcontrol.g.setValue(MapsKt.emptyMap());
        Intrinsics.checkNotNullParameter(arrayList2, "");
        int i = Calendar.getInstance().get(1);
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            ScholarPersonDetail scholarPersonDetail4 = (ScholarPersonDetail) it4.next();
            String str2 = scholarPersonDetail4.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str3 = scholarPersonDetail4.TuitionPaymentFragmentbindingInflater1;
            String str4 = scholarPersonDetail4.asInterface;
            String str5 = scholarPersonDetail4.INotificationSideChannelDefault;
            String str6 = scholarPersonDetail4.INotificationSideChannelStub;
            String str7 = scholarPersonDetail4.connect;
            String str8 = scholarPersonDetail4.getServiceComponent;
            String str9 = scholarPersonDetail4.RemoteActionCompatParcelizer;
            Iterator it5 = it4;
            String str10 = scholarPersonDetail4.getRoot;
            CodeNamePair codeNamePair = scholarPersonDetail4.getExtras;
            String str11 = codeNamePair != null ? codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
            if (str11 == null) {
                str11 = "";
            }
            String string = StringsKt.trim((CharSequence) str11).toString();
            String string2 = StringsKt.trim((CharSequence) scholarPersonDetail4.disconnect).toString();
            String str12 = scholarPersonDetail4.getRoot;
            CodeNamePair codeNamePair2 = scholarPersonDetail4.getExtras;
            String str13 = codeNamePair2 != null ? codeNamePair2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
            if (str13 == null) {
                str13 = "";
            }
            arrayList4.add(new Penerima(str2, str3, str4, str5, str6, str7, str8, "Y", "Y", str9, String.valueOf(i), str10, string, string2, str12, StringsKt.trim((CharSequence) str13).toString(), StringsKt.trim((CharSequence) scholarPersonDetail4.disconnect).toString()));
            it4 = it5;
        }
        ArrayList arrayList5 = arrayList4;
        Intrinsics.checkNotNullParameter(arrayList5, "");
        lambdaenabletorch1androidxcameracamera2internaltorchcontrol.d.setValue(arrayList5);
        function4.invoke(0, scholarPersonDetail, scholarPersonDetail2, Integer.valueOf(((List) state.getValue()).size()));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$4$1(getRatioByPercentage getratiobypercentage, StateListDrawableCompat stateListDrawableCompat, MutableState<setArrowHeadLength> mutableState, Context context, lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, State<? extends VirtualCameraAdapter1<List<ScholarshipEducationListResponse>>> state, MutableState<List<ScholarPersonDetail>> mutableState2, MutableState<VidaLivenessResponse> mutableState3, Function4<? super Integer, ? super ScholarPersonDetail, ? super ScholarPersonDetail, ? super Integer, Unit> function4, State<? extends List<ScholarshipDataEligible>> state2, Continuation<? super ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$4$1> continuation) {
        super(2, continuation);
        this.$scholarSelectViewModel = getratiobypercentage;
        this.$loadingHandler = stateListDrawableCompat;
        this.$dialogState = mutableState;
        this.$context = context;
        this.$scholarConfirmViewModel = lambdaenabletorch1androidxcameracamera2internaltorchcontrol;
        this.$benefitsResult$delegate = state;
        this.$scholarshipDetailList$delegate = mutableState2;
        this.$vidaLivenessResponse$delegate = mutableState3;
        this.$onNavigateToForm = function4;
        this.$selectedItems$delegate = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$4$1(this.$scholarSelectViewModel, this.$loadingHandler, this.$dialogState, this.$context, this.$scholarConfirmViewModel, this.$benefitsResult$delegate, this.$scholarshipDetailList$delegate, this.$vidaLivenessResponse$delegate, this.$onNavigateToForm, this.$selectedItems$delegate, continuation);
    }
}
