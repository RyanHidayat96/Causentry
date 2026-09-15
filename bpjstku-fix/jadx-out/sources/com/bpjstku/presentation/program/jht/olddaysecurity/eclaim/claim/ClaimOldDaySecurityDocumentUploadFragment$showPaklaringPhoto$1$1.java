package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.bpjstku.databinding.FragmentClaimOldDaySecurityDocumentUploadBinding;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityDocumentUploadFragment$showPaklaringPhoto$1$1;
import com.esafirm.imagepicker.model.Image;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.deviceOnError;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityDocumentUploadFragment$showPaklaringPhoto$1$1", f = "ClaimOldDaySecurityDocumentUploadFragment.kt", i = {}, l = {286}, m = "invokeSuspend", n = {}, s = {})
public final class ClaimOldDaySecurityDocumentUploadFragment$showPaklaringPhoto$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Image $image;
    final /* synthetic */ FragmentClaimOldDaySecurityDocumentUploadBinding $this_with;
    int label;
    final /* synthetic */ deviceOnError this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            Image image = this.$image;
            String str = image != null ? image.TuitionPaymentFragmentbindingInflater1 : null;
            String str2 = str != null ? str : "";
            final deviceOnError deviceonerror = this.this$0;
            final FragmentClaimOldDaySecurityDocumentUploadBinding fragmentClaimOldDaySecurityDocumentUploadBinding = this.$this_with;
            this.label = 1;
            if (Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(contextRequireContext, str2, new Function1() { // from class: cancelScheduledReopen
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ClaimOldDaySecurityDocumentUploadFragment$showPaklaringPhoto$1$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(deviceonerror, fragmentClaimOldDaySecurityDocumentUploadBinding, (File) obj2);
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

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(deviceOnError deviceonerror, FragmentClaimOldDaySecurityDocumentUploadBinding fragmentClaimOldDaySecurityDocumentUploadBinding, File file) {
        deviceonerror.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new File(file.getPath());
        ImageView imageView = fragmentClaimOldDaySecurityDocumentUploadBinding.imgPaklaringPhoto;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
        fragmentClaimOldDaySecurityDocumentUploadBinding.imgPaklaringPhoto.setImageURI(Uri.fromFile(deviceonerror.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
        ImageView imageView2 = fragmentClaimOldDaySecurityDocumentUploadBinding.imgPaklaringUpload;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(8);
        TextView textView = fragmentClaimOldDaySecurityDocumentUploadBinding.tvPaklaringUpload;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        TextView textView2 = fragmentClaimOldDaySecurityDocumentUploadBinding.tvPaklaringError;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ClaimOldDaySecurityDocumentUploadFragment$showPaklaringPhoto$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClaimOldDaySecurityDocumentUploadFragment$showPaklaringPhoto$1$1(deviceOnError deviceonerror, Image image, FragmentClaimOldDaySecurityDocumentUploadBinding fragmentClaimOldDaySecurityDocumentUploadBinding, Continuation<? super ClaimOldDaySecurityDocumentUploadFragment$showPaklaringPhoto$1$1> continuation) {
        super(2, continuation);
        this.this$0 = deviceonerror;
        this.$image = image;
        this.$this_with = fragmentClaimOldDaySecurityDocumentUploadBinding;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClaimOldDaySecurityDocumentUploadFragment$showPaklaringPhoto$1$1(this.this$0, this.$image, this.$this_with, continuation);
    }
}
