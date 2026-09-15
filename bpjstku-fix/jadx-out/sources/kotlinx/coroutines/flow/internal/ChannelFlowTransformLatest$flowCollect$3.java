package kotlinx.coroutines.flow.internal;

import defpackage.EncoderImplExternalSyntheticLambda7;
import defpackage.VideoMimeInfoBuilder;
import defpackage.addSignalEosTimeoutIfNeeded;
import defpackage.clampVideoBitrateIfNotSupported;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
public final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ addSignalEosTimeoutIfNeeded<R> $collector;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EncoderImplExternalSyntheticLambda7<T, R> this$0;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            clampVideoBitrateIfNotSupported<S> clampvideobitrateifnotsupported = this.this$0.b;
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(objectRef, coroutineScope, this.this$0, this.$collector);
            this.label = 1;
            if (clampvideobitrateifnotsupported.collect(anonymousClass5, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$5, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5<T> implements addSignalEosTimeoutIfNeeded {
        private /* synthetic */ CoroutineScope TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ Ref.ObjectRef<VideoMimeInfoBuilder> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ addSignalEosTimeoutIfNeeded<R> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ EncoderImplExternalSyntheticLambda7<T, R> b;

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        @Override // defpackage.addSignalEosTimeoutIfNeeded
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            ChannelFlowTransformLatest$flowCollect$3$1$emit$1 channelFlowTransformLatest$flowCollect$3$1$emit$1;
            AnonymousClass5<T> anonymousClass5;
            if (continuation instanceof ChannelFlowTransformLatest$flowCollect$3$1$emit$1) {
                channelFlowTransformLatest$flowCollect$3$1$emit$1 = (ChannelFlowTransformLatest$flowCollect$3$1$emit$1) continuation;
                if ((channelFlowTransformLatest$flowCollect$3$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.label -= Integer.MIN_VALUE;
                } else {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, continuation);
                }
            } else {
                channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, continuation);
            }
            Object obj = channelFlowTransformLatest$flowCollect$3$1$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                VideoMimeInfoBuilder videoMimeInfoBuilder = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.element;
                if (videoMimeInfoBuilder != null) {
                    videoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ChildCancelledException());
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0 = this;
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.L$1 = t;
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.L$2 = videoMimeInfoBuilder;
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.label = 1;
                    if (videoMimeInfoBuilder.a_(channelFlowTransformLatest$flowCollect$3$1$emit$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                anonymousClass5 = this;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t = (T) channelFlowTransformLatest$flowCollect$3$1$emit$1.L$1;
                anonymousClass5 = (AnonymousClass5) channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            anonymousClass5.TuitionPaymentFragmentspecialinlinedviewModeldefault1.element = (T) b.TuitionPaymentFragmentbindingInflater1(anonymousClass5.TuitionPaymentFragmentbindingInflater1, null, CoroutineStart.UNDISPATCHED, new ChannelFlowTransformLatest$flowCollect$3$1$2(anonymousClass5.b, anonymousClass5.TuitionPaymentFragmentspecialinlinedviewModeldefault2, t, null), 1, null);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(Ref.ObjectRef<VideoMimeInfoBuilder> objectRef, CoroutineScope coroutineScope, EncoderImplExternalSyntheticLambda7<T, R> encoderImplExternalSyntheticLambda7, addSignalEosTimeoutIfNeeded<? super R> addsignaleostimeoutifneeded) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = objectRef;
            this.TuitionPaymentFragmentbindingInflater1 = coroutineScope;
            this.b = encoderImplExternalSyntheticLambda7;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = addsignaleostimeoutifneeded;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChannelFlowTransformLatest$flowCollect$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest$flowCollect$3(EncoderImplExternalSyntheticLambda7<T, R> encoderImplExternalSyntheticLambda7, addSignalEosTimeoutIfNeeded<? super R> addsignaleostimeoutifneeded, Continuation<? super ChannelFlowTransformLatest$flowCollect$3> continuation) {
        super(2, continuation);
        this.this$0 = encoderImplExternalSyntheticLambda7;
        this.$collector = addsignaleostimeoutifneeded;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.this$0, this.$collector, continuation);
        channelFlowTransformLatest$flowCollect$3.L$0 = obj;
        return channelFlowTransformLatest$flowCollect$3;
    }
}
