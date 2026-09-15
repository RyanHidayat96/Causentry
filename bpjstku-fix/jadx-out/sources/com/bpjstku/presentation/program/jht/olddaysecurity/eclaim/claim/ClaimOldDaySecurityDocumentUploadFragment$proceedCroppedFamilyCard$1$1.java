package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim;

import android.content.Context;
import android.net.Uri;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityDocumentUploadFragment$proceedCroppedFamilyCard$1$1;
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
@DebugMetadata(c = "com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityDocumentUploadFragment$proceedCroppedFamilyCard$1$1", f = "ClaimOldDaySecurityDocumentUploadFragment.kt", i = {}, l = {228}, m = "invokeSuspend", n = {}, s = {})
public final class ClaimOldDaySecurityDocumentUploadFragment$proceedCroppedFamilyCard$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Uri $it;
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
            String path = this.$it.getPath();
            String str = path != null ? path : "";
            final deviceOnError deviceonerror = this.this$0;
            this.label = 1;
            if (Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(contextRequireContext, str, new Function1() { // from class: isDone
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ClaimOldDaySecurityDocumentUploadFragment$proceedCroppedFamilyCard$1$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(deviceonerror, (File) obj2);
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

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(deviceOnError deviceonerror, File file) {
        deviceonerror.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Uri.fromFile(file));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ClaimOldDaySecurityDocumentUploadFragment$proceedCroppedFamilyCard$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClaimOldDaySecurityDocumentUploadFragment$proceedCroppedFamilyCard$1$1(deviceOnError deviceonerror, Uri uri, Continuation<? super ClaimOldDaySecurityDocumentUploadFragment$proceedCroppedFamilyCard$1$1> continuation) {
        super(2, continuation);
        this.this$0 = deviceonerror;
        this.$it = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClaimOldDaySecurityDocumentUploadFragment$proceedCroppedFamilyCard$1$1(this.this$0, this.$it, continuation);
    }
}
