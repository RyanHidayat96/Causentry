package com.bpjstku.util.utils;

import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.RepeatOnLifecycleKt;
import androidx.view.ComponentActivity;
import defpackage.addSignalEosTimeoutIfNeeded;
import defpackage.setOnImageAvailableListener;
import defpackage.stopMediaCodec;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.util.utils.ObserveExtKt$observeState$1", f = "ObserveExt.kt", i = {}, l = {17}, m = "invokeSuspend", n = {}, s = {})
public final class ObserveExtKt$observeState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Lifecycle.State $lifecycleState;
    final /* synthetic */ Function1<setOnImageAvailableListener<? extends T>, Unit> $onChange;
    final /* synthetic */ stopMediaCodec<setOnImageAvailableListener<T>> $stateFlow;
    final /* synthetic */ ComponentActivity $this_observeState;
    int label;

    /* JADX INFO: renamed from: com.bpjstku.util.utils.ObserveExtKt$observeState$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.bpjstku.util.utils.ObserveExtKt$observeState$1$1", f = "ObserveExt.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<setOnImageAvailableListener<? extends T>, Unit> $onChange;
        final /* synthetic */ stopMediaCodec<setOnImageAvailableListener<T>> $stateFlow;
        int label;

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                stopMediaCodec<setOnImageAvailableListener<T>> stopmediacodec = this.$stateFlow;
                final Function1<setOnImageAvailableListener<? extends T>, Unit> function1 = this.$onChange;
                addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded = new addSignalEosTimeoutIfNeeded() { // from class: com.bpjstku.util.utils.ObserveExtKt.observeState.1.1.4
                    @Override // defpackage.addSignalEosTimeoutIfNeeded
                    public final /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        function1.invoke((setOnImageAvailableListener) obj2);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stopmediacodec.collect((addSignalEosTimeoutIfNeeded<? super setOnImageAvailableListener<T>>) addsignaleostimeoutifneeded, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(stopMediaCodec<? extends setOnImageAvailableListener<? extends T>> stopmediacodec, Function1<? super setOnImageAvailableListener<? extends T>, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$stateFlow = stopmediacodec;
            this.$onChange = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$stateFlow, this.$onChange, continuation);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(this.$this_observeState, this.$lifecycleState, new AnonymousClass1(this.$stateFlow, this.$onChange, null), this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ObserveExtKt$observeState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ObserveExtKt$observeState$1(ComponentActivity componentActivity, Lifecycle.State state, stopMediaCodec<? extends setOnImageAvailableListener<? extends T>> stopmediacodec, Function1<? super setOnImageAvailableListener<? extends T>, Unit> function1, Continuation<? super ObserveExtKt$observeState$1> continuation) {
        super(2, continuation);
        this.$this_observeState = componentActivity;
        this.$lifecycleState = state;
        this.$stateFlow = stopmediacodec;
        this.$onChange = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ObserveExtKt$observeState$1(this.$this_observeState, this.$lifecycleState, this.$stateFlow, this.$onChange, continuation);
    }
}
