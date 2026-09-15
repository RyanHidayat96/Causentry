package kotlinx.coroutines.channels;

import defpackage.EncodedDataImplExternalSyntheticLambda0;
import defpackage.EncoderSurfaceInputOnSurfaceUpdateListener;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/channels/ChannelResult;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
public final class ChannelsKt__ChannelsKt$trySendBlocking$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EncodedDataImplExternalSyntheticLambda0<? extends Unit>>, Object> {
    final /* synthetic */ E $element;
    final /* synthetic */ EncoderSurfaceInputOnSurfaceUpdateListener<E> $this_trySendBlocking;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8024constructorimpl;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EncoderSurfaceInputOnSurfaceUpdateListener<E> encoderSurfaceInputOnSurfaceUpdateListener = this.$this_trySendBlocking;
                Object obj2 = this.$element;
                Result.Companion companion = Result.INSTANCE;
                this.label = 1;
                if (encoderSurfaceInputOnSurfaceUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM8024constructorimpl = Result.m8024constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8024constructorimpl = Result.m8024constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8031isSuccessimpl(objM8024constructorimpl)) {
            EncodedDataImplExternalSyntheticLambda0.Companion companion3 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = EncodedDataImplExternalSyntheticLambda0.Companion.b(Unit.INSTANCE);
        } else {
            EncodedDataImplExternalSyntheticLambda0.Companion companion4 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Result.m8027exceptionOrNullimpl(objM8024constructorimpl));
        }
        return EncodedDataImplExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(objTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super EncodedDataImplExternalSyntheticLambda0<? extends Unit>> continuation) {
        return ((ChannelsKt__ChannelsKt$trySendBlocking$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__ChannelsKt$trySendBlocking$2(EncoderSurfaceInputOnSurfaceUpdateListener<? super E> encoderSurfaceInputOnSurfaceUpdateListener, E e2, Continuation<? super ChannelsKt__ChannelsKt$trySendBlocking$2> continuation) {
        super(2, continuation);
        this.$this_trySendBlocking = encoderSurfaceInputOnSurfaceUpdateListener;
        this.$element = e2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChannelsKt__ChannelsKt$trySendBlocking$2 channelsKt__ChannelsKt$trySendBlocking$2 = new ChannelsKt__ChannelsKt$trySendBlocking$2(this.$this_trySendBlocking, this.$element, continuation);
        channelsKt__ChannelsKt$trySendBlocking$2.L$0 = obj;
        return channelsKt__ChannelsKt$trySendBlocking$2;
    }
}
