package com.bpjstku.presentation.account.setting;

import android.net.Uri;
import android.widget.Button;
import com.bpjstku.presentation.account.setting.ChangeProfilePhotoActivity$takePictureGallery$1$1$1;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.google.android.gms.cloudmessaging.zzu;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
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
@DebugMetadata(c = "com.bpjstku.presentation.account.setting.ChangeProfilePhotoActivity$takePictureGallery$1$1$1", f = "ChangeProfilePhotoActivity.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
public final class ChangeProfilePhotoActivity$takePictureGallery$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Uri $photoUri;
    int label;
    final /* synthetic */ ChangeProfilePhotoActivity this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ChangeProfilePhotoActivity changeProfilePhotoActivity = this.this$0;
            String strValueOf = String.valueOf(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(changeProfilePhotoActivity, this.$photoUri));
            final ChangeProfilePhotoActivity changeProfilePhotoActivity2 = this.this$0;
            this.label = 1;
            if (Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(changeProfilePhotoActivity, strValueOf, new Function1() { // from class: ColorLong
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ChangeProfilePhotoActivity$takePictureGallery$1$1$1.TuitionPaymentFragmentbindingInflater1(changeProfilePhotoActivity2, (File) obj2);
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

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ChangeProfilePhotoActivity changeProfilePhotoActivity, File file) {
        ChangeProfilePhotoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(changeProfilePhotoActivity, file);
        Button button = ChangeProfilePhotoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(changeProfilePhotoActivity).btnSaveChange;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(true);
        RequestManager requestManagerWith = Glide.with(changeProfilePhotoActivity);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        requestManagerWith.b((File) ChangeProfilePhotoActivity.b(zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1810433865, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1810433865, new Object[]{changeProfilePhotoActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault5)).into(ChangeProfilePhotoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(changeProfilePhotoActivity).civProfilePhoto);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChangeProfilePhotoActivity$takePictureGallery$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeProfilePhotoActivity$takePictureGallery$1$1$1(ChangeProfilePhotoActivity changeProfilePhotoActivity, Uri uri, Continuation<? super ChangeProfilePhotoActivity$takePictureGallery$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = changeProfilePhotoActivity;
        this.$photoUri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChangeProfilePhotoActivity$takePictureGallery$1$1$1(this.this$0, this.$photoUri, continuation);
    }
}
