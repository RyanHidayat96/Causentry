package com.bpjstku.presentation.compose.feature.scholarship.screen;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.bpjstku.R;
import com.bpjstku.data.scholarship.model.response.ConfirmResponse;
import com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarFormScreenKt$ScholarFormScreen$7$1;
import com.bpjstku.presentation.main.MainActivity;
import defpackage.StateListDrawableCompat;
import defpackage.VirtualCameraAdapter1;
import defpackage.getRequiredMaxBitDepth;
import defpackage.lambdaenableTorch1androidxcameracamera2internalTorchControl;
import defpackage.setArrowHeadLength;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarFormScreenKt$ScholarFormScreen$7$1", f = "ScholarFormScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScholarFormScreenKt$ScholarFormScreen$7$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<setArrowHeadLength> $dialogState;
    final /* synthetic */ StateListDrawableCompat $loadingHandler;
    final /* synthetic */ lambdaenableTorch1androidxcameracamera2internalTorchControl $scholarConfirmViewModel;
    final /* synthetic */ State<VirtualCameraAdapter1<ConfirmResponse>> $updateConfirmResult$delegate;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        VirtualCameraAdapter1<ConfirmResponse> value = this.$updateConfirmResult$delegate.getValue();
        if (!(value instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            if (!(value instanceof VirtualCameraAdapter1.asBinder)) {
                if (value instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.FALSE);
                    MutableState<setArrowHeadLength> mutableState = this.$dialogState;
                    VirtualCameraAdapter1<ConfirmResponse> value2 = this.$updateConfirmResult$delegate.getValue();
                    Intrinsics.checkNotNull(value2, "");
                    String str = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) value2).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (str == null) {
                        str = "";
                    }
                    String string = this.$context.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    mutableState.setValue(new setArrowHeadLength.TuitionPaymentFragmentbindingInflater1("", str, string));
                    Object[] objArr = {this.$scholarConfirmViewModel};
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(410001568, -410001563, objArr, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                }
            } else {
                this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.FALSE);
                MutableState<setArrowHeadLength> mutableState2 = this.$dialogState;
                Integer numBoxInt = Boxing.boxInt(R.drawable.ic_success);
                String string2 = this.$context.getString(R.string.label_success);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                String string3 = this.$context.getString(R.string.message_success_scholarship_confirmation);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                String string4 = this.$context.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                final lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol = this.$scholarConfirmViewModel;
                final Context context = this.$context;
                mutableState2.setValue(new setArrowHeadLength.b(numBoxInt, string2, string3, string4, null, new Function0() { // from class: onAttachedToWindow
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ScholarFormScreenKt$ScholarFormScreen$7$1.TuitionPaymentFragmentbindingInflater1(lambdaenabletorch1androidxcameracamera2internaltorchcontrol, context);
                    }
                }, null, 80, null));
            }
        } else {
            this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, Context context) {
        lambdaenabletorch1androidxcameracamera2internaltorchcontrol.b();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(410001568, -410001563, new Object[]{lambdaenabletorch1androidxcameracamera2internaltorchcontrol}, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(335544320);
        context.startActivity(intent);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScholarFormScreenKt$ScholarFormScreen$7$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScholarFormScreenKt$ScholarFormScreen$7$1(StateListDrawableCompat stateListDrawableCompat, MutableState<setArrowHeadLength> mutableState, Context context, lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, State<? extends VirtualCameraAdapter1<ConfirmResponse>> state, Continuation<? super ScholarFormScreenKt$ScholarFormScreen$7$1> continuation) {
        super(2, continuation);
        this.$loadingHandler = stateListDrawableCompat;
        this.$dialogState = mutableState;
        this.$context = context;
        this.$scholarConfirmViewModel = lambdaenabletorch1androidxcameracamera2internaltorchcontrol;
        this.$updateConfirmResult$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScholarFormScreenKt$ScholarFormScreen$7$1(this.$loadingHandler, this.$dialogState, this.$context, this.$scholarConfirmViewModel, this.$updateConfirmResult$delegate, continuation);
    }
}
