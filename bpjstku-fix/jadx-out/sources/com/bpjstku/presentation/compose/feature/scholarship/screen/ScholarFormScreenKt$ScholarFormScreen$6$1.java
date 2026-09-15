package com.bpjstku.presentation.compose.feature.scholarship.screen;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import defpackage.PredictiveBackHandlerKt;
import defpackage.StateListDrawableCompat;
import defpackage.lambdaenableTorch1androidxcameracamera2internalTorchControl;
import java.io.File;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarFormScreenKt$ScholarFormScreen$6$1", f = "ScholarFormScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScholarFormScreenKt$ScholarFormScreen$6$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ StateListDrawableCompat $loadingHandler;
    final /* synthetic */ MutableState<Pair<File, PredictiveBackHandlerKt>> $pendingFile$delegate;
    final /* synthetic */ MutableState<String> $photoMimeType$delegate;
    final /* synthetic */ MutableState<Uri> $photoUri$delegate;
    final /* synthetic */ lambdaenableTorch1androidxcameracamera2internalTorchControl $scholarConfirmViewModel;
    final /* synthetic */ CoroutineScope $scope;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Pair<File, PredictiveBackHandlerKt> value = this.$pendingFile$delegate.getValue();
        if (value != null) {
            CoroutineScope coroutineScope = this.$scope;
            StateListDrawableCompat stateListDrawableCompat = this.$loadingHandler;
            MutableState<String> mutableState = this.$photoMimeType$delegate;
            Context context = this.$context;
            MutableState<Uri> mutableState2 = this.$photoUri$delegate;
            lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol = this.$scholarConfirmViewModel;
            MutableState<Pair<File, PredictiveBackHandlerKt>> mutableState3 = this.$pendingFile$delegate;
            b.TuitionPaymentFragmentbindingInflater1(coroutineScope, null, null, new ScholarFormScreenKt$ScholarFormScreen$6$1$1$1(stateListDrawableCompat, value.component1(), mutableState, context, mutableState2, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, value.component2(), null), 3, null);
            mutableState3.setValue(null);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScholarFormScreenKt$ScholarFormScreen$6$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScholarFormScreenKt$ScholarFormScreen$6$1(MutableState<Pair<File, PredictiveBackHandlerKt>> mutableState, CoroutineScope coroutineScope, StateListDrawableCompat stateListDrawableCompat, MutableState<String> mutableState2, Context context, MutableState<Uri> mutableState3, lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, Continuation<? super ScholarFormScreenKt$ScholarFormScreen$6$1> continuation) {
        super(2, continuation);
        this.$pendingFile$delegate = mutableState;
        this.$scope = coroutineScope;
        this.$loadingHandler = stateListDrawableCompat;
        this.$photoMimeType$delegate = mutableState2;
        this.$context = context;
        this.$photoUri$delegate = mutableState3;
        this.$scholarConfirmViewModel = lambdaenabletorch1androidxcameracamera2internaltorchcontrol;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScholarFormScreenKt$ScholarFormScreen$6$1(this.$pendingFile$delegate, this.$scope, this.$loadingHandler, this.$photoMimeType$delegate, this.$context, this.$photoUri$delegate, this.$scholarConfirmViewModel, continuation);
    }
}
