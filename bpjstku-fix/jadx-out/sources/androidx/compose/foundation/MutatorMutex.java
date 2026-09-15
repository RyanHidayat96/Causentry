package androidx.compose.foundation;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import androidx.exifinterface.media.ExifInterface;
import defpackage.VideoEncoderConfig;
import defpackage.VideoMimeInfoBuilder;
import defpackage.toIllegalArgumentException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000bJW\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\t\u001a\u00020\u00052'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0002\b\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0017\u001a\u00020\u00122\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u001c\u0010\u0003R(\u0010\u001f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001dj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0019`\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Landroidx/compose/foundation/MutatorMutex;", "", "<init>", "()V", "R", "Landroidx/compose/foundation/MutatePriority;", "p0", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "p1", "mutate", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "p2", "mutateWith", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tryLock", "()Z", "Lkotlin/Function0;", "", "tryMutate", "(Lkotlin/jvm/functions/Function0;)Z", "Landroidx/compose/foundation/MutatorMutex$Mutator;", "tryMutateOrCancel", "(Landroidx/compose/foundation/MutatorMutex$Mutator;)V", "unlock", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/foundation/TuitionPaymentFragmentbindingInflater1;", "currentMutator", "Ljava/util/concurrent/atomic/AtomicReference;", "LVideoEncoderConfig;", "mutex", "LVideoEncoderConfig;", "Mutator"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutatorMutex {
    public static final int $stable = 0;
    private final AtomicReference<Mutator> currentMutator = new AtomicReference<>(null);
    private final VideoEncoderConfig mutex = toIllegalArgumentException.b(false);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/foundation/MutatorMutex$Mutator;", "", "Landroidx/compose/foundation/MutatePriority;", "p0", "LVideoMimeInfoBuilder;", "p1", "<init>", "(Landroidx/compose/foundation/MutatePriority;LVideoMimeInfoBuilder;)V", "", "canInterrupt", "(Landroidx/compose/foundation/MutatorMutex$Mutator;)Z", "", "cancel", "()V", "job", "LVideoMimeInfoBuilder;", "getJob", "()LVideoMimeInfoBuilder;", "priority", "Landroidx/compose/foundation/MutatePriority;", "getPriority", "()Landroidx/compose/foundation/MutatePriority;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Mutator {
        private final VideoMimeInfoBuilder job;
        private final MutatePriority priority;

        public Mutator(MutatePriority mutatePriority, VideoMimeInfoBuilder videoMimeInfoBuilder) {
            this.priority = mutatePriority;
            this.job = videoMimeInfoBuilder;
        }

        public final VideoMimeInfoBuilder getJob() {
            return this.job;
        }

        public final MutatePriority getPriority() {
            return this.priority;
        }

        public final boolean canInterrupt(Mutator p0) {
            return this.priority.compareTo(p0.priority) >= 0;
        }

        public final void cancel() {
            this.job.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new MutationInterruptedException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryMutateOrCancel(Mutator p0) {
        Mutator mutator;
        do {
            mutator = this.currentMutator.get();
            if (mutator != null && !p0.canInterrupt(mutator)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.currentMutator, mutator, p0));
        if (mutator != null) {
            mutator.cancel();
        }
    }

    public static /* synthetic */ Object mutate$default(MutatorMutex mutatorMutex, MutatePriority mutatePriority, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutate(mutatePriority, function1, continuation);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.compose.foundation.MutatorMutex$mutate$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", i = {0, 0, 1, 1}, l = {214, 126}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class AnonymousClass2<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ Function1<Continuation<? super R>, Object> $block;
        final /* synthetic */ MutatePriority $priority;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ MutatorMutex this$0;

        /* JADX WARN: Type inference failed for: r1v0, types: [VideoEncoderConfig, int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Mutator mutator;
            VideoEncoderConfig videoEncoderConfig;
            Function1<Continuation<? super R>, Object> function1;
            MutatorMutex mutatorMutex;
            Mutator mutator2;
            Throwable th;
            MutatorMutex mutatorMutex2;
            VideoEncoderConfig videoEncoderConfig2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                try {
                    if (r1 == 0) {
                        ResultKt.throwOnFailure(obj);
                        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                        MutatePriority mutatePriority = this.$priority;
                        CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(VideoMimeInfoBuilder.b);
                        Intrinsics.checkNotNull(element);
                        mutator = new Mutator(mutatePriority, (VideoMimeInfoBuilder) element);
                        this.this$0.tryMutateOrCancel(mutator);
                        videoEncoderConfig = this.this$0.mutex;
                        Function1<Continuation<? super R>, Object> function2 = this.$block;
                        MutatorMutex mutatorMutex3 = this.this$0;
                        this.L$0 = mutator;
                        this.L$1 = videoEncoderConfig;
                        this.L$2 = function2;
                        this.L$3 = mutatorMutex3;
                        this.label = 1;
                        if (videoEncoderConfig.lock(null, this) != coroutine_suspended) {
                            function1 = function2;
                            mutatorMutex = mutatorMutex3;
                        }
                        return coroutine_suspended;
                    }
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutatorMutex2 = (MutatorMutex) this.L$2;
                        videoEncoderConfig2 = (VideoEncoderConfig) this.L$1;
                        mutator2 = (Mutator) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex2.currentMutator, mutator2, null);
                            videoEncoderConfig2.unlock(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex2.currentMutator, mutator2, null);
                            throw th;
                        }
                    }
                    mutatorMutex = (MutatorMutex) this.L$3;
                    function1 = (Function1) this.L$2;
                    VideoEncoderConfig videoEncoderConfig3 = (VideoEncoderConfig) this.L$1;
                    Mutator mutator3 = (Mutator) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    videoEncoderConfig = videoEncoderConfig3;
                    mutator = mutator3;
                    this.L$0 = mutator;
                    this.L$1 = videoEncoderConfig;
                    this.L$2 = mutatorMutex;
                    this.L$3 = null;
                    this.label = 2;
                    Object objInvoke = function1.invoke(this);
                    if (objInvoke != coroutine_suspended) {
                        mutatorMutex2 = mutatorMutex;
                        videoEncoderConfig2 = videoEncoderConfig;
                        obj = objInvoke;
                        mutator2 = mutator;
                        PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex2.currentMutator, mutator2, null);
                        videoEncoderConfig2.unlock(null);
                        return obj;
                    }
                    return coroutine_suspended;
                } catch (Throwable th3) {
                    mutator2 = mutator;
                    th = th3;
                    mutatorMutex2 = mutatorMutex;
                    PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex2.currentMutator, mutator2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r1.unlock(null);
                throw th4;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$priority = mutatePriority;
            this.this$0 = mutatorMutex;
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$priority, this.this$0, this.$block, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final <R> Object mutate(MutatePriority mutatePriority, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super R> continuation) {
        return CoroutineScopeKt.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new AnonymousClass2(mutatePriority, this, function1, null), continuation);
    }

    public static /* synthetic */ Object mutateWith$default(MutatorMutex mutatorMutex, Object obj, MutatePriority mutatePriority, Function2 function2, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutateWith(obj, mutatePriority, function2, continuation);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.compose.foundation.MutatorMutex$mutateWith$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", i = {0, 0, 1, 1}, l = {214, 167}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C02682<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ Function2<T, Continuation<? super R>, Object> $block;
        final /* synthetic */ MutatePriority $priority;
        final /* synthetic */ T $receiver;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ MutatorMutex this$0;

        /* JADX WARN: Type inference failed for: r1v0, types: [VideoEncoderConfig, int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Mutator mutator;
            VideoEncoderConfig videoEncoderConfig;
            Object obj2;
            Function2 function2;
            MutatorMutex mutatorMutex;
            Mutator mutator2;
            Throwable th;
            MutatorMutex mutatorMutex2;
            VideoEncoderConfig videoEncoderConfig2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                try {
                    if (r1 == 0) {
                        ResultKt.throwOnFailure(obj);
                        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                        MutatePriority mutatePriority = this.$priority;
                        CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(VideoMimeInfoBuilder.b);
                        Intrinsics.checkNotNull(element);
                        mutator = new Mutator(mutatePriority, (VideoMimeInfoBuilder) element);
                        this.this$0.tryMutateOrCancel(mutator);
                        videoEncoderConfig = this.this$0.mutex;
                        Function2 function3 = this.$block;
                        Object obj3 = this.$receiver;
                        MutatorMutex mutatorMutex3 = this.this$0;
                        this.L$0 = mutator;
                        this.L$1 = videoEncoderConfig;
                        this.L$2 = function3;
                        this.L$3 = obj3;
                        this.L$4 = mutatorMutex3;
                        this.label = 1;
                        if (videoEncoderConfig.lock(null, this) != coroutine_suspended) {
                            obj2 = obj3;
                            function2 = function3;
                            mutatorMutex = mutatorMutex3;
                        }
                        return coroutine_suspended;
                    }
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutatorMutex2 = (MutatorMutex) this.L$2;
                        videoEncoderConfig2 = (VideoEncoderConfig) this.L$1;
                        mutator2 = (Mutator) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex2.currentMutator, mutator2, null);
                            videoEncoderConfig2.unlock(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex2.currentMutator, mutator2, null);
                            throw th;
                        }
                    }
                    mutatorMutex = (MutatorMutex) this.L$4;
                    obj2 = this.L$3;
                    Function2 function4 = (Function2) this.L$2;
                    VideoEncoderConfig videoEncoderConfig3 = (VideoEncoderConfig) this.L$1;
                    Mutator mutator3 = (Mutator) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    videoEncoderConfig = videoEncoderConfig3;
                    function2 = function4;
                    mutator = mutator3;
                    this.L$0 = mutator;
                    this.L$1 = videoEncoderConfig;
                    this.L$2 = mutatorMutex;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 2;
                    Object objInvoke = function2.invoke(obj2, this);
                    if (objInvoke != coroutine_suspended) {
                        mutatorMutex2 = mutatorMutex;
                        videoEncoderConfig2 = videoEncoderConfig;
                        obj = objInvoke;
                        mutator2 = mutator;
                        PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex2.currentMutator, mutator2, null);
                        videoEncoderConfig2.unlock(null);
                        return obj;
                    }
                    return coroutine_suspended;
                } catch (Throwable th3) {
                    mutator2 = mutator;
                    th = th3;
                    mutatorMutex2 = mutatorMutex;
                    PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex2.currentMutator, mutator2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r1.unlock(null);
                throw th4;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02682(MutatePriority mutatePriority, MutatorMutex mutatorMutex, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, T t, Continuation<? super C02682> continuation) {
            super(2, continuation);
            this.$priority = mutatePriority;
            this.this$0 = mutatorMutex;
            this.$block = function2;
            this.$receiver = t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C02682 c02682 = new C02682(this.$priority, this.this$0, this.$block, this.$receiver, continuation);
            c02682.L$0 = obj;
            return c02682;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((C02682) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final <T, R> Object mutateWith(T t, MutatePriority mutatePriority, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        return CoroutineScopeKt.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new C02682(mutatePriority, this, function2, t, null), continuation);
    }

    public final boolean tryMutate(Function0<Unit> p0) {
        boolean zTryLock = tryLock();
        if (!zTryLock) {
            return zTryLock;
        }
        try {
            p0.invoke();
            return zTryLock;
        } finally {
            unlock();
        }
    }

    public final boolean tryLock() {
        return this.mutex.tryLock(null);
    }

    public final void unlock() {
        this.mutex.unlock(null);
    }
}
