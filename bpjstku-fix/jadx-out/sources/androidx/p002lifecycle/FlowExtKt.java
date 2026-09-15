package androidx.p002lifecycle;

import androidx.exifinterface.media.ExifInterface;
import defpackage.EncoderImpl;
import defpackage.addSignalEosTimeoutIfNeeded;
import defpackage.clampVideoBitrateIfNotSupported;
import defpackage.onEncodePaused;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "LclampVideoBitrateIfNotSupported;", "Landroidx/lifecycle/Lifecycle;", "p0", "Landroidx/lifecycle/Lifecycle$State;", "p1", "flowWithLifecycle", "(LclampVideoBitrateIfNotSupported;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;)LclampVideoBitrateIfNotSupported;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FlowExtKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", i = {0}, l = {90}, m = "invokeSuspend", n = {"$this$callbackFlow"}, s = {"L$0"})
    static final class AnonymousClass1<T> extends SuspendLambda implements Function2<onEncodePaused<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Lifecycle $lifecycle;
        final /* synthetic */ Lifecycle.State $minActiveState;
        final /* synthetic */ clampVideoBitrateIfNotSupported<T> $this_flowWithLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
        static final class C01211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ onEncodePaused<T> $$this$callbackFlow;
            final /* synthetic */ clampVideoBitrateIfNotSupported<T> $this_flowWithLifecycle;
            int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    clampVideoBitrateIfNotSupported<T> clampvideobitrateifnotsupported = this.$this_flowWithLifecycle;
                    final onEncodePaused<T> onencodepaused = this.$$this$callbackFlow;
                    this.label = 1;
                    if (clampvideobitrateifnotsupported.collect(new addSignalEosTimeoutIfNeeded() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                        @Override // defpackage.addSignalEosTimeoutIfNeeded
                        public final Object emit(T t, Continuation<? super Unit> continuation) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onencodepaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1(t, continuation);
                            return objTuitionPaymentFragmentspecialinlinedviewModeldefault1 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTuitionPaymentFragmentspecialinlinedviewModeldefault1 : Unit.INSTANCE;
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C01211(clampVideoBitrateIfNotSupported<? extends T> clampvideobitrateifnotsupported, onEncodePaused<? super T> onencodepaused, Continuation<? super C01211> continuation) {
                super(2, continuation);
                this.$this_flowWithLifecycle = clampvideobitrateifnotsupported;
                this.$$this$callbackFlow = onencodepaused;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01211(this.$this_flowWithLifecycle, this.$$this$callbackFlow, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C01211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            onEncodePaused onencodepaused;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                onEncodePaused onencodepaused2 = (onEncodePaused) this.L$0;
                this.L$0 = onencodepaused2;
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(this.$lifecycle, this.$minActiveState, new C01211(this.$this_flowWithLifecycle, onencodepaused2, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                onencodepaused = onencodepaused2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                onencodepaused = (onEncodePaused) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            onencodepaused.a_(null);
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, clampVideoBitrateIfNotSupported<? extends T> clampvideobitrateifnotsupported, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$lifecycle = lifecycle;
            this.$minActiveState = state;
            this.$this_flowWithLifecycle = clampvideobitrateifnotsupported;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(onEncodePaused<? super T> onencodepaused, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(onencodepaused, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static /* synthetic */ clampVideoBitrateIfNotSupported flowWithLifecycle$default(clampVideoBitrateIfNotSupported clampvideobitrateifnotsupported, Lifecycle lifecycle, Lifecycle.State state, int i, Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(clampvideobitrateifnotsupported, lifecycle, state);
    }

    public static final <T> clampVideoBitrateIfNotSupported<T> flowWithLifecycle(clampVideoBitrateIfNotSupported<? extends T> clampvideobitrateifnotsupported, Lifecycle lifecycle, Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(clampvideobitrateifnotsupported, "");
        Intrinsics.checkNotNullParameter(lifecycle, "");
        Intrinsics.checkNotNullParameter(state, "");
        return new EncoderImpl(new AnonymousClass1(lifecycle, state, clampvideobitrateifnotsupported, null), null, 0, null, 14, null);
    }
}
