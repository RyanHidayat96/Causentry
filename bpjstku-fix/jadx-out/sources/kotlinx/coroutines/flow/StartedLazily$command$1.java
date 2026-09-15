package kotlinx.coroutines.flow;

import defpackage.addSignalEosTimeoutIfNeeded;
import defpackage.stopMediaCodec;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/flow/SharingCommand;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
public final class StartedLazily$command$1 extends SuspendLambda implements Function2<addSignalEosTimeoutIfNeeded<? super SharingCommand>, Continuation<? super Unit>, Object> {
    final /* synthetic */ stopMediaCodec<Integer> $subscriptionCount;
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded = (addSignalEosTimeoutIfNeeded) this.L$0;
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            this.label = 1;
            if (this.$subscriptionCount.collect(new AnonymousClass5(booleanRef, addsignaleostimeoutifneeded), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$5, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5<T> implements addSignalEosTimeoutIfNeeded {
        private /* synthetic */ Ref.BooleanRef TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ addSignalEosTimeoutIfNeeded<SharingCommand> b;

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, Continuation<? super Unit> continuation) {
            StartedLazily$command$1$1$emit$1 startedLazily$command$1$1$emit$1;
            if (continuation instanceof StartedLazily$command$1$1$emit$1) {
                startedLazily$command$1$1$emit$1 = (StartedLazily$command$1$1$emit$1) continuation;
                if ((startedLazily$command$1$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                    startedLazily$command$1$1$emit$1.label -= Integer.MIN_VALUE;
                } else {
                    startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, continuation);
                }
            } else {
                startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, continuation);
            }
            Object obj = startedLazily$command$1$1$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = startedLazily$command$1$1$emit$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (i <= 0 || this.TuitionPaymentFragmentbindingInflater1.element) {
                    return Unit.INSTANCE;
                }
                this.TuitionPaymentFragmentbindingInflater1.element = true;
                addSignalEosTimeoutIfNeeded<SharingCommand> addsignaleostimeoutifneeded = this.b;
                SharingCommand sharingCommand = SharingCommand.START;
                startedLazily$command$1$1$emit$1.label = 1;
                if (addsignaleostimeoutifneeded.emit(sharingCommand, startedLazily$command$1$1$emit$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // defpackage.addSignalEosTimeoutIfNeeded
        public final /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(((Number) obj).intValue(), continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(Ref.BooleanRef booleanRef, addSignalEosTimeoutIfNeeded<? super SharingCommand> addsignaleostimeoutifneeded) {
            this.TuitionPaymentFragmentbindingInflater1 = booleanRef;
            this.b = addsignaleostimeoutifneeded;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(addSignalEosTimeoutIfNeeded<? super SharingCommand> addsignaleostimeoutifneeded, Continuation<? super Unit> continuation) {
        return ((StartedLazily$command$1) create(addsignaleostimeoutifneeded, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(stopMediaCodec<Integer> stopmediacodec, Continuation<? super StartedLazily$command$1> continuation) {
        super(2, continuation);
        this.$subscriptionCount = stopmediacodec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.$subscriptionCount, continuation);
        startedLazily$command$1.L$0 = obj;
        return startedLazily$command$1;
    }
}
