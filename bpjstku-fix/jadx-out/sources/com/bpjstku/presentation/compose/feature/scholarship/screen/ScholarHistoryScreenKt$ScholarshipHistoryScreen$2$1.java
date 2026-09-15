package com.bpjstku.presentation.compose.feature.scholarship.screen;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.p002lifecycle.MutableLiveData;
import com.bpjstku.data.scholarship.model.request.ScholarshipHistoryRequest;
import com.bpjstku.data.scholarship.model.response.ScholarshipDataEligible;
import com.bpjstku.domain.scholarship.model.ScholarBenefit;
import com.bpjstku.domain.user.model.User;
import defpackage.BufferProviderState;
import defpackage.VirtualCameraAdapter1;
import defpackage.deriveCodec;
import defpackage.generateUltraHdrSupportedCombinationList;
import defpackage.logToString;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.share;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarHistoryScreenKt$ScholarshipHistoryScreen$2$1", f = "ScholarHistoryScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScholarHistoryScreenKt$ScholarshipHistoryScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ generateUltraHdrSupportedCombinationList $scholarBenefitViewModel;
    final /* synthetic */ State<List<ScholarshipDataEligible>> $selectedItems$delegate;
    final /* synthetic */ MutableState<User> $user$delegate;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        User value = this.$user$delegate.getValue();
        String str = value != null ? value.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        if (str == null) {
            str = "";
        }
        ScholarshipDataEligible scholarshipDataEligible = (ScholarshipDataEligible) CollectionsKt.firstOrNull((List) this.$selectedItems$delegate.getValue());
        String nik = scholarshipDataEligible != null ? scholarshipDataEligible.getNik() : null;
        if (nik == null) {
            nik = "";
        }
        ScholarshipHistoryRequest scholarshipHistoryRequest = new ScholarshipHistoryRequest(str, nik);
        final generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist = this.$scholarBenefitViewModel;
        Intrinsics.checkNotNullParameter(scholarshipHistoryRequest, "");
        MutableLiveData<VirtualCameraAdapter1<List<ScholarBenefit>>> mutableLiveData = generateultrahdrsupportedcombinationlist.notify;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(generateultrahdrsupportedcombinationlist.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(scholarshipHistoryRequest)));
        final Function1 function1 = new Function1() { // from class: getMaxFrameRate
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return generateUltraHdrSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault3(generateultrahdrsupportedcombinationlist, (List) obj2);
            }
        };
        logToString logtostring = new logToString() { // from class: getRangeLength
            @Override // defpackage.logToString
            public final void accept(Object obj2) {
                function1.invoke(obj2);
            }
        };
        final Function1 function2 = new Function1() { // from class: getRangeDistance
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return generateUltraHdrSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault3(generateultrahdrsupportedcombinationlist, (Throwable) obj2);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getSurfaceConfigListAndFpsCeiling
            @Override // defpackage.logToString
            public final void accept(Object obj2) {
                function2.invoke(obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        generateultrahdrsupportedcombinationlist.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScholarHistoryScreenKt$ScholarshipHistoryScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScholarHistoryScreenKt$ScholarshipHistoryScreen$2$1(generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, MutableState<User> mutableState, State<? extends List<ScholarshipDataEligible>> state, Continuation<? super ScholarHistoryScreenKt$ScholarshipHistoryScreen$2$1> continuation) {
        super(2, continuation);
        this.$scholarBenefitViewModel = generateultrahdrsupportedcombinationlist;
        this.$user$delegate = mutableState;
        this.$selectedItems$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScholarHistoryScreenKt$ScholarshipHistoryScreen$2$1(this.$scholarBenefitViewModel, this.$user$delegate, this.$selectedItems$delegate, continuation);
    }
}
