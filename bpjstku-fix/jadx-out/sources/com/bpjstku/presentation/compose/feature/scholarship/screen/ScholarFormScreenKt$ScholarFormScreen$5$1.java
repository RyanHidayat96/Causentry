package com.bpjstku.presentation.compose.feature.scholarship.screen;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.p002lifecycle.MutableLiveData;
import com.bpjstku.R;
import com.bpjstku.data.scholarship.model.response.ScholarshipDocumentResponse;
import com.bpjstku.domain.scholarship.model.ScholarDocument;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import com.midtrans.sdk.corekit.core.Constants;
import defpackage.StateListDrawableCompat;
import defpackage.VirtualCameraAdapter1;
import defpackage.lambdaenableTorch1androidxcameracamera2internalTorchControl;
import defpackage.setArrowHeadLength;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarFormScreenKt$ScholarFormScreen$5$1", f = "ScholarFormScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScholarFormScreenKt$ScholarFormScreen$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<Integer> $currentPhotoIndex$delegate;
    final /* synthetic */ MutableState<setArrowHeadLength> $dialogState;
    final /* synthetic */ String $identity;
    final /* synthetic */ StateListDrawableCompat $loadingHandler;
    final /* synthetic */ MutableState<String> $photoMimeType$delegate;
    final /* synthetic */ MutableState<Uri> $photoUri$delegate;
    final /* synthetic */ SnapshotStateList<ScholarDocument> $proveDocs;
    final /* synthetic */ lambdaenableTorch1androidxcameracamera2internalTorchControl $scholarConfirmViewModel;
    final /* synthetic */ ScholarPersonDetail $selectedChild;
    final /* synthetic */ State<VirtualCameraAdapter1<ScholarshipDocumentResponse>> $uploadResult$delegate;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayListPlus;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        VirtualCameraAdapter1<ScholarshipDocumentResponse> value = this.$uploadResult$delegate.getValue();
        if (!(value instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            if (value instanceof VirtualCameraAdapter1.asBinder) {
                VirtualCameraAdapter1<ScholarshipDocumentResponse> value2 = this.$uploadResult$delegate.getValue();
                Intrinsics.checkNotNull(value2, "");
                ScholarshipDocumentResponse scholarshipDocumentResponse = (ScholarshipDocumentResponse) ((VirtualCameraAdapter1.asBinder) value2).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (Intrinsics.areEqual(scholarshipDocumentResponse.getStatusCode(), Constants.STATUS_CODE_201)) {
                    SnapshotStateList<ScholarDocument> snapshotStateList = this.$proveDocs;
                    Integer value3 = this.$currentPhotoIndex$delegate.getValue();
                    Intrinsics.checkNotNull(value3);
                    int iIntValue = value3.intValue();
                    SnapshotStateList<ScholarDocument> snapshotStateList2 = this.$proveDocs;
                    Integer value4 = this.$currentPhotoIndex$delegate.getValue();
                    Intrinsics.checkNotNull(value4);
                    ScholarDocument scholarDocument = snapshotStateList2.get(value4.intValue());
                    Uri value5 = this.$photoUri$delegate.getValue();
                    String value6 = this.$photoMimeType$delegate.getValue();
                    String value7 = this.$scholarConfirmViewModel.asInterface.getValue();
                    String str = value7 == null ? "" : value7;
                    ScholarPersonDetail scholarPersonDetail = this.$selectedChild;
                    String str2 = scholarPersonDetail != null ? scholarPersonDetail.INotificationSideChannelDefault : null;
                    String str3 = str2 == null ? "" : str2;
                    String path = scholarshipDocumentResponse.getData().getPath();
                    snapshotStateList.set(iIntValue, ScholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault2(scholarDocument, null, value6, null, value5, "true", path == null ? "" : path, str, str3, 5));
                    lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol = this.$scholarConfirmViewModel;
                    String str4 = this.$identity;
                    SnapshotStateList<ScholarDocument> snapshotStateList3 = this.$proveDocs;
                    Integer value8 = this.$currentPhotoIndex$delegate.getValue();
                    Intrinsics.checkNotNull(value8);
                    ScholarDocument scholarDocument2 = snapshotStateList3.get(value8.intValue());
                    Intrinsics.checkNotNullParameter(str4, "");
                    Intrinsics.checkNotNullParameter(scholarDocument2, "");
                    Map<String, List<ScholarDocument>> value9 = lambdaenabletorch1androidxcameracamera2internaltorchcontrol.g.getValue();
                    if (value9 == null) {
                        value9 = MapsKt.emptyMap();
                    }
                    List<ScholarDocument> listEmptyList = value9.get(str4);
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    List<ScholarDocument> list = listEmptyList;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                arrayListPlus = CollectionsKt.plus((Collection<? extends ScholarDocument>) listEmptyList, scholarDocument2);
                                break;
                            }
                            if (Intrinsics.areEqual(((ScholarDocument) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault3, scholarDocument2.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                for (ScholarDocument scholarDocument3 : list) {
                                    if (Intrinsics.areEqual(scholarDocument3.TuitionPaymentFragmentspecialinlinedviewModeldefault3, scholarDocument2.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                                        scholarDocument3 = scholarDocument2;
                                    }
                                    arrayList.add(scholarDocument3);
                                }
                                arrayListPlus = arrayList;
                                break;
                            }
                        }
                    } else {
                        arrayListPlus = CollectionsKt.plus((Collection<? extends ScholarDocument>) listEmptyList, scholarDocument2);
                        break;
                    }
                    MutableLiveData<Map<String, List<ScholarDocument>>> mutableLiveData = lambdaenabletorch1androidxcameracamera2internaltorchcontrol.g;
                    Map<String, List<ScholarDocument>> mutableMap = MapsKt.toMutableMap(value9);
                    mutableMap.put(str4, arrayListPlus);
                    mutableLiveData.setValue(mutableMap);
                }
                this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.FALSE);
                MutableLiveData<VirtualCameraAdapter1<ScholarshipDocumentResponse>> mutableLiveData2 = this.$scholarConfirmViewModel.RemoteActionCompatParcelizer;
                VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            } else if (value instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.FALSE);
                MutableState<setArrowHeadLength> mutableState = this.$dialogState;
                VirtualCameraAdapter1<ScholarshipDocumentResponse> value10 = this.$uploadResult$delegate.getValue();
                Intrinsics.checkNotNull(value10, "");
                String str5 = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) value10).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str5 == null) {
                    str5 = "";
                }
                String string = this.$context.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string, "");
                mutableState.setValue(new setArrowHeadLength.TuitionPaymentFragmentbindingInflater1("", str5, string));
                MutableLiveData<VirtualCameraAdapter1<ScholarshipDocumentResponse>> mutableLiveData3 = this.$scholarConfirmViewModel.RemoteActionCompatParcelizer;
                VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScholarFormScreenKt$ScholarFormScreen$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScholarFormScreenKt$ScholarFormScreen$5$1(SnapshotStateList<ScholarDocument> snapshotStateList, lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, ScholarPersonDetail scholarPersonDetail, String str, StateListDrawableCompat stateListDrawableCompat, MutableState<setArrowHeadLength> mutableState, Context context, State<? extends VirtualCameraAdapter1<ScholarshipDocumentResponse>> state, MutableState<Integer> mutableState2, MutableState<Uri> mutableState3, MutableState<String> mutableState4, Continuation<? super ScholarFormScreenKt$ScholarFormScreen$5$1> continuation) {
        super(2, continuation);
        this.$proveDocs = snapshotStateList;
        this.$scholarConfirmViewModel = lambdaenabletorch1androidxcameracamera2internaltorchcontrol;
        this.$selectedChild = scholarPersonDetail;
        this.$identity = str;
        this.$loadingHandler = stateListDrawableCompat;
        this.$dialogState = mutableState;
        this.$context = context;
        this.$uploadResult$delegate = state;
        this.$currentPhotoIndex$delegate = mutableState2;
        this.$photoUri$delegate = mutableState3;
        this.$photoMimeType$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScholarFormScreenKt$ScholarFormScreen$5$1(this.$proveDocs, this.$scholarConfirmViewModel, this.$selectedChild, this.$identity, this.$loadingHandler, this.$dialogState, this.$context, this.$uploadResult$delegate, this.$currentPhotoIndex$delegate, this.$photoUri$delegate, this.$photoMimeType$delegate, continuation);
    }
}
