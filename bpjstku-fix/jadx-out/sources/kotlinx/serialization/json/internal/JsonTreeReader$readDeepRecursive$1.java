package kotlinx.serialization.json.internal;

import defpackage.PreviewView1ExternalSyntheticLambda2;
import defpackage.isTransformationInfoReady;
import defpackage.stopListeningToDisplayChange;
import kotlin.DeepRecursiveScope;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlinx/serialization/json/JsonElement;", "Lkotlin/DeepRecursiveScope;", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
public final class JsonTreeReader$readDeepRecursive$1 extends RestrictedSuspendLambda implements Function3<DeepRecursiveScope<Unit, isTransformationInfoReady>, Unit, Continuation<? super isTransformationInfoReady>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PreviewView1ExternalSyntheticLambda2 this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DeepRecursiveScope deepRecursiveScope = (DeepRecursiveScope) this.L$0;
            byte bINotificationSideChannel = this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel();
            if (bINotificationSideChannel == 1) {
                return this.this$0.b(true);
            }
            if (bINotificationSideChannel == 0) {
                return this.this$0.b(false);
            }
            if (bINotificationSideChannel != 6) {
                if (bINotificationSideChannel == 8) {
                    return this.this$0.b();
                }
                stopListeningToDisplayChange.TuitionPaymentFragmentbindingInflater1(this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault3, "Can't begin reading element, unexpected token", 0, null, 6);
                throw new KotlinNothingValueException();
            }
            this.label = 1;
            obj = PreviewView1ExternalSyntheticLambda2.b(this.this$0, deepRecursiveScope, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return (isTransformationInfoReady) obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ Object invoke(DeepRecursiveScope<Unit, isTransformationInfoReady> deepRecursiveScope, Unit unit, Continuation<? super isTransformationInfoReady> continuation) {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this.this$0, continuation);
        jsonTreeReader$readDeepRecursive$1.L$0 = deepRecursiveScope;
        return jsonTreeReader$readDeepRecursive$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readDeepRecursive$1(PreviewView1ExternalSyntheticLambda2 previewView1ExternalSyntheticLambda2, Continuation<? super JsonTreeReader$readDeepRecursive$1> continuation) {
        super(3, continuation);
        this.this$0 = previewView1ExternalSyntheticLambda2;
    }
}
