package com.bpjstku.presentation.compose.common;

import androidx.view.compose.ManagedActivityResultLauncher;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.compose.common.PermissionHandlerKt$PermissionHandler$1$1", f = "PermissionHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PermissionHandlerKt$PermissionHandler$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ManagedActivityResultLauncher<String[], Map<String, Boolean>> $launcher;
    final /* synthetic */ String[] $permissions;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$launcher.launch(this.$permissions);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PermissionHandlerKt$PermissionHandler$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionHandlerKt$PermissionHandler$1$1(ManagedActivityResultLauncher<String[], Map<String, Boolean>> managedActivityResultLauncher, String[] strArr, Continuation<? super PermissionHandlerKt$PermissionHandler$1$1> continuation) {
        super(2, continuation);
        this.$launcher = managedActivityResultLauncher;
        this.$permissions = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PermissionHandlerKt$PermissionHandler$1$1(this.$launcher, this.$permissions, continuation);
    }
}
