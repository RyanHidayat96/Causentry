package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim;

import android.content.Context;
import android.net.Uri;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDataSecurityMemberDataVerificationFragment$proceedCropResult$1$2;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.Camera2CameraImplExternalSyntheticLambda10;
import defpackage.getContentPaddingRight;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDataSecurityMemberDataVerificationFragment$proceedCropResult$1$2", f = "ClaimOldDataSecurityMemberDataVerificationFragment.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
public final class ClaimOldDataSecurityMemberDataVerificationFragment$proceedCropResult$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Uri $it;
    int label;
    final /* synthetic */ Camera2CameraImplExternalSyntheticLambda10 this$0;

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
            final Camera2CameraImplExternalSyntheticLambda10 camera2CameraImplExternalSyntheticLambda10 = this.this$0;
            this.label = 1;
            if (Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(contextRequireContext, str, new Function1() { // from class: Camera2CameraImplExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ClaimOldDataSecurityMemberDataVerificationFragment$proceedCropResult$1$2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(camera2CameraImplExternalSyntheticLambda10, (File) obj2);
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

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(Camera2CameraImplExternalSyntheticLambda10 camera2CameraImplExternalSyntheticLambda10, File file) throws IOException {
        camera2CameraImplExternalSyntheticLambda10.b(file);
        if (getContentPaddingRight.TuitionPaymentFragmentbindingInflater1() > 0) {
            Intrinsics.checkNotNullParameter(file, "");
            getContentPaddingRight.b("Compressed file ".concat(String.valueOf(new File(file.getPath()).length() / 1024)), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ClaimOldDataSecurityMemberDataVerificationFragment$proceedCropResult$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClaimOldDataSecurityMemberDataVerificationFragment$proceedCropResult$1$2(Camera2CameraImplExternalSyntheticLambda10 camera2CameraImplExternalSyntheticLambda10, Uri uri, Continuation<? super ClaimOldDataSecurityMemberDataVerificationFragment$proceedCropResult$1$2> continuation) {
        super(2, continuation);
        this.this$0 = camera2CameraImplExternalSyntheticLambda10;
        this.$it = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClaimOldDataSecurityMemberDataVerificationFragment$proceedCropResult$1$2(this.this$0, this.$it, continuation);
    }
}
