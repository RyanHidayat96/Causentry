package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim;

import android.content.Context;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityReactivationFragment$onActivityResult$1;
import com.esafirm.imagepicker.model.Image;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.getExposureState;
import java.io.File;
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
@DebugMetadata(c = "com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityReactivationFragment$onActivityResult$1", f = "ClaimOldDaySecurityReactivationFragment.kt", i = {}, l = {773}, m = "invokeSuspend", n = {}, s = {})
public final class ClaimOldDaySecurityReactivationFragment$onActivityResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Image $image;
    int label;
    final /* synthetic */ getExposureState this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            String str = this.$image.TuitionPaymentFragmentbindingInflater1;
            Intrinsics.checkNotNullExpressionValue(str, "");
            final getExposureState getexposurestate = this.this$0;
            this.label = 1;
            if (Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(contextRequireContext, str, new Function1() { // from class: linkWithCameraControl
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ClaimOldDaySecurityReactivationFragment$onActivityResult$1.TuitionPaymentFragmentbindingInflater1(getexposurestate, (File) obj2);
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

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getExposureState getexposurestate, File file) {
        getexposurestate.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = file;
        getexposurestate.TuitionPaymentFragmentspecialinlinedviewModeldefault3(file);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ClaimOldDaySecurityReactivationFragment$onActivityResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClaimOldDaySecurityReactivationFragment$onActivityResult$1(getExposureState getexposurestate, Image image, Continuation<? super ClaimOldDaySecurityReactivationFragment$onActivityResult$1> continuation) {
        super(2, continuation);
        this.this$0 = getexposurestate;
        this.$image = image;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClaimOldDaySecurityReactivationFragment$onActivityResult$1(this.this$0, this.$image, continuation);
    }
}
