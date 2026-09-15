package com.bpjstku.presentation.compose.feature.scholarship.screen;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import androidx.p002lifecycle.MutableLiveData;
import com.bpjstku.data.scholarship.model.response.ScholarshipDocumentResponse;
import com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarFormScreenKt$ScholarFormScreen$6$1$1$1;
import defpackage.BufferProviderState;
import defpackage.ContextThemeWrapper;
import defpackage.PredictiveBackHandlerKt;
import defpackage.StateListDrawableCompat;
import defpackage.VirtualCameraAdapter1;
import defpackage.deriveCodec;
import defpackage.lambdaenableTorch1androidxcameracamera2internalTorchControl;
import defpackage.logToString;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.share;
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
@DebugMetadata(c = "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarFormScreenKt$ScholarFormScreen$6$1$1$1", f = "ScholarFormScreen.kt", i = {}, l = {309}, m = "invokeSuspend", n = {}, s = {})
public final class ScholarFormScreenKt$ScholarFormScreen$6$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ File $file;
    final /* synthetic */ StateListDrawableCompat $loadingHandler;
    final /* synthetic */ MutableState<String> $photoMimeType$delegate;
    final /* synthetic */ MutableState<Uri> $photoUri$delegate;
    final /* synthetic */ PredictiveBackHandlerKt $request;
    final /* synthetic */ lambdaenableTorch1androidxcameracamera2internalTorchControl $scholarConfirmViewModel;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.TRUE);
            File file = this.$file;
            String value = this.$photoMimeType$delegate.getValue();
            final StateListDrawableCompat stateListDrawableCompat = this.$loadingHandler;
            final Context context = this.$context;
            final MutableState<Uri> mutableState = this.$photoUri$delegate;
            final MutableState<String> mutableState2 = this.$photoMimeType$delegate;
            this.label = 1;
            obj = ContextThemeWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(file, value, new Function1() { // from class: onPointerCaptureChanged
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ScholarFormScreenKt$ScholarFormScreen$6$1$1$1.TuitionPaymentFragmentbindingInflater1(stateListDrawableCompat, context, mutableState, mutableState2, (String) obj2);
                }
            }, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        File file2 = (File) obj;
        if (file2 != null) {
            final lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol = this.$scholarConfirmViewModel;
            PredictiveBackHandlerKt predictiveBackHandlerKt = this.$request;
            String value2 = this.$photoMimeType$delegate.getValue();
            Intrinsics.checkNotNullParameter(file2, "");
            Intrinsics.checkNotNullParameter(value2, "");
            Intrinsics.checkNotNullParameter(predictiveBackHandlerKt, "");
            MutableLiveData<VirtualCameraAdapter1<ScholarshipDocumentResponse>> mutableLiveData = lambdaenabletorch1androidxcameracamera2internaltorchcontrol.RemoteActionCompatParcelizer;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.b.b(file2, value2, predictiveBackHandlerKt)));
            final Function1 function1 = new Function1() { // from class: getDefaultZoomState
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaenabletorch1androidxcameracamera2internaltorchcontrol, (ScholarshipDocumentResponse) obj2);
                }
            };
            logToString logtostring = new logToString() { // from class: submitCameraZoomRatio
                @Override // defpackage.logToString
                public final void accept(Object obj2) {
                    lambdaenableTorch1androidxcameracamera2internalTorchControl.a(function1, obj2);
                }
            };
            final Function1 function2 = new Function1() { // from class: isAndroidRZoomSupported
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaenabletorch1androidxcameracamera2internaltorchcontrol, (Throwable) obj2);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: updateLiveData
                @Override // defpackage.logToString
                public final void accept(Object obj2) {
                    Object[] objArr = {function2, obj2};
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(1033106560, -1033106557, objArr, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            lambdaenabletorch1androidxcameracamera2internaltorchcontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(StateListDrawableCompat stateListDrawableCompat, Context context, MutableState mutableState, MutableState mutableState2, String str) {
        mutableState.setValue(null);
        mutableState2.setValue("");
        stateListDrawableCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.FALSE);
        Toast.makeText(context, str, 0).show();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScholarFormScreenKt$ScholarFormScreen$6$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScholarFormScreenKt$ScholarFormScreen$6$1$1$1(StateListDrawableCompat stateListDrawableCompat, File file, MutableState<String> mutableState, Context context, MutableState<Uri> mutableState2, lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, PredictiveBackHandlerKt predictiveBackHandlerKt, Continuation<? super ScholarFormScreenKt$ScholarFormScreen$6$1$1$1> continuation) {
        super(2, continuation);
        this.$loadingHandler = stateListDrawableCompat;
        this.$file = file;
        this.$photoMimeType$delegate = mutableState;
        this.$context = context;
        this.$photoUri$delegate = mutableState2;
        this.$scholarConfirmViewModel = lambdaenabletorch1androidxcameracamera2internaltorchcontrol;
        this.$request = predictiveBackHandlerKt;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScholarFormScreenKt$ScholarFormScreen$6$1$1$1(this.$loadingHandler, this.$file, this.$photoMimeType$delegate, this.$context, this.$photoUri$delegate, this.$scholarConfirmViewModel, this.$request, continuation);
    }
}
