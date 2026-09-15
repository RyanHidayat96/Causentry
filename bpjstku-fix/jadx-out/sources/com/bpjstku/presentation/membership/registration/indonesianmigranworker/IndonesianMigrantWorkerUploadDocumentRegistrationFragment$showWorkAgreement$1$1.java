package com.bpjstku.presentation.membership.registration.indonesianmigranworker;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bpjstku.databinding.FragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding;
import com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerUploadDocumentRegistrationFragment$showWorkAgreement$1$1;
import com.esafirm.imagepicker.model.Image;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.getIOThreadExecutor;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FileTreeWalk;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerUploadDocumentRegistrationFragment$showWorkAgreement$1$1", f = "IndonesianMigrantWorkerUploadDocumentRegistrationFragment.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
public final class IndonesianMigrantWorkerUploadDocumentRegistrationFragment$showWorkAgreement$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Image $image;
    final /* synthetic */ FragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding $this_apply;
    int label;
    final /* synthetic */ getIOThreadExecutor this$0;

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
            final getIOThreadExecutor getiothreadexecutor = this.this$0;
            final FragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding fragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding = this.$this_apply;
            this.label = 1;
            if (Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(contextRequireContext, str2, new Function1() { // from class: getMainThreadExecutor
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return IndonesianMigrantWorkerUploadDocumentRegistrationFragment$showWorkAgreement$1$1.b(getiothreadexecutor, fragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding, (File) obj2);
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

    public static /* synthetic */ Unit b(getIOThreadExecutor getiothreadexecutor, FragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding fragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding, File file) {
        getIOThreadExecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getiothreadexecutor, file);
        ImageView imageView = fragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding.imgWorkAgreementPhoto;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
        ImageView imageView2 = fragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding.imgWorkAgreementPhoto;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        imageView2.setImageURI(Uri.fromFile((File) getIOThreadExecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1583776921, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{getiothreadexecutor}, -1583776920, iTuitionPaymentFragmentspecialinlinedviewModeldefault2)));
        ConstraintLayout constraintLayout = fragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding.containerWorkAgreement;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        TextView textView = fragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding.tvWorkAgrermentError;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IndonesianMigrantWorkerUploadDocumentRegistrationFragment$showWorkAgreement$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndonesianMigrantWorkerUploadDocumentRegistrationFragment$showWorkAgreement$1$1(getIOThreadExecutor getiothreadexecutor, Image image, FragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding fragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding, Continuation<? super IndonesianMigrantWorkerUploadDocumentRegistrationFragment$showWorkAgreement$1$1> continuation) {
        super(2, continuation);
        this.this$0 = getiothreadexecutor;
        this.$image = image;
        this.$this_apply = fragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IndonesianMigrantWorkerUploadDocumentRegistrationFragment$showWorkAgreement$1$1(this.this$0, this.$image, this.$this_apply, continuation);
    }
}
