package androidx.p002lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.RoomCallableTrackingLiveData;
import defpackage.AudioEncoderConfigAudioProfileResolver;
import defpackage.EncoderImpl;
import defpackage.addSignalEosTimeoutIfNeeded;
import defpackage.clampVideoBitrateIfNotSupported;
import defpackage.getColorFormat;
import defpackage.hasEndOfStreamFlag;
import defpackage.onEncodePaused;
import defpackage.stopMediaCodec;
import java.time.Duration;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\f"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "LclampVideoBitrateIfNotSupported;", "Lkotlin/coroutines/CoroutineContext;", "p0", "", "p1", "Landroidx/lifecycle/LiveData;", "asLiveData", "(LclampVideoBitrateIfNotSupported;Lkotlin/coroutines/CoroutineContext;J)Landroidx/lifecycle/LiveData;", "asFlow", "(Landroidx/lifecycle/LiveData;)LclampVideoBitrateIfNotSupported;", "Ljava/time/Duration;", "(LclampVideoBitrateIfNotSupported;Ljava/time/Duration;Lkotlin/coroutines/CoroutineContext;)Landroidx/lifecycle/LiveData;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FlowLiveDataConversions {
    public static /* synthetic */ LiveData asLiveData$default(clampVideoBitrateIfNotSupported clampvideobitrateifnotsupported, CoroutineContext coroutineContext, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return asLiveData(clampvideobitrateifnotsupported, coroutineContext, j);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveDataScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    static final class C06501<T> extends SuspendLambda implements Function2<LiveDataScope<T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ clampVideoBitrateIfNotSupported<T> $this_asLiveData;
        private /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
                this.label = 1;
                if (this.$this_asLiveData.collect(new addSignalEosTimeoutIfNeeded() { // from class: androidx.lifecycle.FlowLiveDataConversions.asLiveData.1.1
                    @Override // defpackage.addSignalEosTimeoutIfNeeded
                    public final Object emit(T t, Continuation<? super Unit> continuation) {
                        Object objEmit = liveDataScope.emit(t, continuation);
                        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
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
        C06501(clampVideoBitrateIfNotSupported<? extends T> clampvideobitrateifnotsupported, Continuation<? super C06501> continuation) {
            super(2, continuation);
            this.$this_asLiveData = clampvideobitrateifnotsupported;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C06501 c06501 = new C06501(this.$this_asLiveData, continuation);
            c06501.L$0 = obj;
            return c06501;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<T> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C06501) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> LiveData<T> asLiveData(clampVideoBitrateIfNotSupported<? extends T> clampvideobitrateifnotsupported, CoroutineContext coroutineContext, long j) {
        Intrinsics.checkNotNullParameter(clampvideobitrateifnotsupported, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        RoomCallableTrackingLiveData roomCallableTrackingLiveData = (LiveData<T>) CoroutineLiveDataKt.liveData(coroutineContext, j, new C06501(clampvideobitrateifnotsupported, null));
        if (clampvideobitrateifnotsupported instanceof stopMediaCodec) {
            if (ArchTaskExecutor.getInstance().isMainThread()) {
                roomCallableTrackingLiveData.setValue(((stopMediaCodec) clampvideobitrateifnotsupported).TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                return roomCallableTrackingLiveData;
            }
            roomCallableTrackingLiveData.postValue(((stopMediaCodec) clampvideobitrateifnotsupported).TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        }
        return roomCallableTrackingLiveData;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", i = {0, 1}, l = {105, 106, 108}, m = "invokeSuspend", n = {"observer", "observer"}, s = {"L$0", "L$0"})
    static final class AnonymousClass1<T> extends SuspendLambda implements Function2<onEncodePaused<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ LiveData<T> $this_asFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.Observer] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Observer observer;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                if (r1 == 0) {
                    ResultKt.throwOnFailure(obj);
                    final onEncodePaused onencodepaused = (onEncodePaused) this.L$0;
                    Observer observer2 = new Observer() { // from class: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$$ExternalSyntheticLambda0
                        @Override // androidx.p002lifecycle.Observer
                        public final void onChanged(Object obj2) {
                            onencodepaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj2);
                        }
                    };
                    this.L$0 = observer2;
                    this.label = 1;
                    Object objTuitionPaymentFragmentbindingInflater1 = BuildersKt.TuitionPaymentFragmentbindingInflater1(Dispatchers.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new C01231(this.$this_asFlow, observer2, null), this);
                    observer = observer2;
                    if (objTuitionPaymentFragmentbindingInflater1 == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (r1 == 1) {
                    Observer observer3 = (Observer) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    observer = observer3;
                } else {
                    if (r1 != 2) {
                        if (r1 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th = (Throwable) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        throw th;
                    }
                    Observer observer4 = (Observer) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    r1 = observer4;
                }
                throw new KotlinNothingValueException();
                this.L$0 = observer;
                this.label = 2;
                r1 = observer;
                if (AudioEncoderConfigAudioProfileResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th2) {
                this.L$0 = th2;
                this.label = 3;
                if (BuildersKt.TuitionPaymentFragmentbindingInflater1(Dispatchers.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2().plus(getColorFormat.TuitionPaymentFragmentbindingInflater1), new AnonymousClass2(this.$this_asFlow, r1, null), this) != coroutine_suspended) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C01231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Observer<T> $observer;
            final /* synthetic */ LiveData<T> $this_asFlow;
            int label;

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$this_asFlow.observeForever((Observer<? super T>) this.$observer);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01231(LiveData<T> liveData, Observer<T> observer, Continuation<? super C01231> continuation) {
                super(2, continuation);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01231(this.$this_asFlow, this.$observer, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C01231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Observer<T> $observer;
            final /* synthetic */ LiveData<T> $this_asFlow;
            int label;

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$this_asFlow.removeObserver((Observer<? super T>) this.$observer);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(LiveData<T> liveData, Observer<T> observer, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$this_asFlow, this.$observer, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LiveData<T> liveData, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_asFlow = liveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_asFlow, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(onEncodePaused<? super T> onencodepaused, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(onencodepaused, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final <T> clampVideoBitrateIfNotSupported<T> asFlow(LiveData<T> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "");
        return hasEndOfStreamFlag.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new EncoderImpl(new AnonymousClass1(liveData, null), null, 0, null, 14, null), -1, BufferOverflow.SUSPEND);
    }

    public static /* synthetic */ LiveData asLiveData$default(clampVideoBitrateIfNotSupported clampvideobitrateifnotsupported, Duration duration, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 2) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return asLiveData(clampvideobitrateifnotsupported, duration, coroutineContext);
    }

    public static final <T> LiveData<T> asLiveData(clampVideoBitrateIfNotSupported<? extends T> clampvideobitrateifnotsupported, Duration duration, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(clampvideobitrateifnotsupported, "");
        Intrinsics.checkNotNullParameter(duration, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        return asLiveData(clampvideobitrateifnotsupported, coroutineContext, Api26Impl.INSTANCE.toMillis(duration));
    }

    public static final <T> LiveData<T> asLiveData(clampVideoBitrateIfNotSupported<? extends T> clampvideobitrateifnotsupported) {
        Intrinsics.checkNotNullParameter(clampvideobitrateifnotsupported, "");
        return asLiveData$default(clampvideobitrateifnotsupported, (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public static final <T> LiveData<T> asLiveData(clampVideoBitrateIfNotSupported<? extends T> clampvideobitrateifnotsupported, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(clampvideobitrateifnotsupported, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        return asLiveData$default(clampvideobitrateifnotsupported, coroutineContext, 0L, 2, (Object) null);
    }
}
