package com.bpjstku.presentation.scholarship.benefit.fragment;

import android.content.Context;
import com.bpjstku.domain.scholarship.model.ScholarDocument;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import com.bpjstku.presentation.scholarship.benefit.fragment.ScholarBenefitStep3Fragment$onActivityResult$1;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.generateUltraHdrSupportedCombinationList;
import defpackage.getContentPaddingRight;
import defpackage.getOpeningBlocker;
import defpackage.retrieveConcurrentCameraIds;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
@DebugMetadata(c = "com.bpjstku.presentation.scholarship.benefit.fragment.ScholarBenefitStep3Fragment$onActivityResult$1", f = "ScholarBenefitStep3Fragment.kt", i = {}, l = {475}, m = "invokeSuspend", n = {}, s = {})
public final class ScholarBenefitStep3Fragment$onActivityResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ File $imageFile;
    final /* synthetic */ ScholarPersonDetail $scholarPerson;
    final /* synthetic */ generateUltraHdrSupportedCombinationList $viewModel;
    int label;
    final /* synthetic */ getOpeningBlocker this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            File file = this.$imageFile;
            final generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist = this.$viewModel;
            final ScholarPersonDetail scholarPersonDetail = this.$scholarPerson;
            final getOpeningBlocker getopeningblocker = this.this$0;
            this.label = 1;
            if (Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contextRequireContext, file, new Function1() { // from class: lambdaonSessionFinished4androidxcameracamera2internalSynchronizedCaptureSessionBaseImpl
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ScholarBenefitStep3Fragment$onActivityResult$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(generateultrahdrsupportedcombinationlist, scholarPersonDetail, getopeningblocker, (File) obj2);
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, ScholarPersonDetail scholarPersonDetail, getOpeningBlocker getopeningblocker, File file) throws IOException {
        if (file.length() <= 2000000) {
            ScholarDocument value = generateultrahdrsupportedcombinationlist.INotificationSideChannel.getValue();
            Intrinsics.checkNotNull(value);
            ScholarDocument scholarDocument = value;
            Intrinsics.checkNotNullParameter("image/*", "");
            scholarDocument.TuitionPaymentFragmentbindingInflater1 = "image/*";
            scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = file;
            generateultrahdrsupportedcombinationlist.asBinder.setValue(scholarPersonDetail);
        } else {
            getContentPaddingRight.b bVarB = getContentPaddingRight.b("docsize");
            Intrinsics.checkExpressionValueIsNotNull(bVarB, "");
            bVarB.TuitionPaymentFragmentbindingInflater1(String.valueOf(file.length()), new Object[0]);
            getOpeningBlocker getopeningblocker2 = getopeningblocker;
            Intrinsics.checkNotNullParameter(getopeningblocker2, "");
            Intrinsics.checkNotNullParameter("File tidak boleh melebihi 2 MB", "");
            BaseActivity baseActivity = (BaseActivity) getopeningblocker2.getContext();
            if (baseActivity != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, "File tidak boleh melebihi 2 MB", null);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScholarBenefitStep3Fragment$onActivityResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScholarBenefitStep3Fragment$onActivityResult$1(getOpeningBlocker getopeningblocker, File file, generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, ScholarPersonDetail scholarPersonDetail, Continuation<? super ScholarBenefitStep3Fragment$onActivityResult$1> continuation) {
        super(2, continuation);
        this.this$0 = getopeningblocker;
        this.$imageFile = file;
        this.$viewModel = generateultrahdrsupportedcombinationlist;
        this.$scholarPerson = scholarPersonDetail;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScholarBenefitStep3Fragment$onActivityResult$1(this.this$0, this.$imageFile, this.$viewModel, this.$scholarPerson, continuation);
    }
}
