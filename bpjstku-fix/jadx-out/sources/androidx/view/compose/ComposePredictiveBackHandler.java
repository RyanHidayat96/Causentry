package androidx.view.compose;

import androidx.view.BackEventCompat;
import androidx.view.compose.internal.BackHandlerCompat;
import defpackage.EncodedDataImplExternalSyntheticLambda0;
import defpackage.Encoder;
import defpackage.VideoMimeInfoBuilder;
import defpackage.addSignalEosTimeoutIfNeeded;
import defpackage.clampVideoBitrateIfNotSupported;
import defpackage.getInput;
import defpackage.handleEncodeError;
import defpackage.lambdanotifyError11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.b;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014RI\u0010\u001a\u001a)\b\u0001\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000b0\u0016¢\u0006\u0002\b\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00158\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020 8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,"}, d2 = {"Landroidx/activity/compose/ComposePredictiveBackHandler;", "Landroidx/activity/compose/internal/BackHandlerCompat;", "Lkotlinx/coroutines/CoroutineScope;", "p0", "Landroidx/activity/compose/PredictiveBackHandlerInfo;", "p1", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/activity/compose/PredictiveBackHandlerInfo;)V", "", "launchNewGesture", "()V", "Landroidx/activity/BackEventCompat;", "onBackStarted", "(Landroidx/activity/BackEventCompat;)V", "onBackProgressed", "onBackCompleted", "onBackCancelled", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Function2;", "LclampVideoBitrateIfNotSupported;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "currentOnBack", "Lkotlin/jvm/functions/Function2;", "getCurrentOnBack", "()Lkotlin/jvm/functions/Function2;", "setCurrentOnBack", "(Lkotlin/jvm/functions/Function2;)V", "", "isBackEnabled", "()Z", "setBackEnabled", "(Z)V", "LEncoder;", "activeChannel", "LEncoder;", "LVideoMimeInfoBuilder;", "activeJob", "LVideoMimeInfoBuilder;", "isPredictiveBack", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ComposePredictiveBackHandler extends BackHandlerCompat {
    private Encoder<BackEventCompat> activeChannel;
    private VideoMimeInfoBuilder activeJob;
    private Function2<? super clampVideoBitrateIfNotSupported<BackEventCompat>, ? super Continuation<? super Unit>, ? extends Object> currentOnBack;
    private boolean isPredictiveBack;
    private final CoroutineScope scope;

    public final CoroutineScope getScope() {
        return this.scope;
    }

    public ComposePredictiveBackHandler(CoroutineScope coroutineScope, PredictiveBackHandlerInfo predictiveBackHandlerInfo) {
        super(predictiveBackHandlerInfo);
        this.scope = coroutineScope;
        this.currentOnBack = new ComposePredictiveBackHandler$currentOnBack$1(null);
    }

    public final Function2<clampVideoBitrateIfNotSupported<BackEventCompat>, Continuation<? super Unit>, Object> getCurrentOnBack() {
        return this.currentOnBack;
    }

    public final void setCurrentOnBack(Function2<? super clampVideoBitrateIfNotSupported<BackEventCompat>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.currentOnBack = function2;
    }

    @Override // androidx.view.compose.internal.BackHandlerCompat
    public final boolean isBackEnabled() {
        return super.isBackEnabled();
    }

    @Override // androidx.view.compose.internal.BackHandlerCompat
    public final void setBackEnabled(boolean z) {
        VideoMimeInfoBuilder videoMimeInfoBuilder;
        if (!z && super.isBackEnabled() && (videoMimeInfoBuilder = this.activeJob) != null && !videoMimeInfoBuilder.r_()) {
            onBackCancelled();
        }
        super.setBackEnabled(z);
    }

    private final void launchNewGesture() {
        this.activeChannel = getInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2, BufferOverflow.SUSPEND, 4);
        this.activeJob = b.TuitionPaymentFragmentbindingInflater1(this.scope, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1", f = "PredictiveBackHandler.kt", i = {0}, l = {231}, m = "invokeSuspend", n = {"completed"}, s = {"L$0"}, v = 1)
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.BooleanRef booleanRef;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (ComposePredictiveBackHandler.this.isBackEnabled()) {
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    Function2<clampVideoBitrateIfNotSupported<BackEventCompat>, Continuation<? super Unit>, Object> currentOnBack = ComposePredictiveBackHandler.this.getCurrentOnBack();
                    Encoder encoder = ComposePredictiveBackHandler.this.activeChannel;
                    Intrinsics.checkNotNull(encoder);
                    handleEncodeError.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new handleEncodeError.TuitionPaymentFragmentbindingInflater1(lambdanotifyError11.TuitionPaymentFragmentspecialinlinedviewModeldefault3(encoder), new C00061(booleanRef2, null));
                    this.L$0 = booleanRef2;
                    this.label = 1;
                    if (currentOnBack.invoke(tuitionPaymentFragmentbindingInflater1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef2;
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            booleanRef = (Ref.BooleanRef) this.L$0;
            ResultKt.throwOnFailure(obj);
            if (!booleanRef.element) {
                throw new IllegalStateException("You must collect the progress flow".toString());
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/activity/BackEventCompat;", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1$1", f = "PredictiveBackHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class C00061 extends SuspendLambda implements Function3<addSignalEosTimeoutIfNeeded<? super BackEventCompat>, Throwable, Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.BooleanRef $completed;
            int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$completed.element = true;
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00061(Ref.BooleanRef booleanRef, Continuation<? super C00061> continuation) {
                super(3, continuation);
                this.$completed = booleanRef;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(addSignalEosTimeoutIfNeeded<? super BackEventCompat> addsignaleostimeoutifneeded, Throwable th, Continuation<? super Unit> continuation) {
                return new C00061(this.$completed, continuation).invokeSuspend(Unit.INSTANCE);
            }
        }

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ComposePredictiveBackHandler.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // androidx.view.compose.internal.BackHandlerCompat
    public final void onBackStarted(BackEventCompat p0) {
        onBackCancelled();
        if (isBackEnabled()) {
            this.isPredictiveBack = true;
            launchNewGesture();
        }
    }

    @Override // androidx.view.compose.internal.BackHandlerCompat
    public final void onBackProgressed(BackEventCompat p0) {
        Encoder<BackEventCompat> encoder = this.activeChannel;
        if (encoder != null) {
            EncodedDataImplExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(encoder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0));
        }
    }

    @Override // androidx.view.compose.internal.BackHandlerCompat
    public final void onBackCompleted() {
        if (this.activeChannel != null && !this.isPredictiveBack) {
            onBackCancelled();
        }
        if (this.activeChannel == null) {
            this.isPredictiveBack = false;
            launchNewGesture();
        }
        Encoder<BackEventCompat> encoder = this.activeChannel;
        if (encoder != null) {
            encoder.a_(null);
        }
        this.isPredictiveBack = false;
    }

    @Override // androidx.view.compose.internal.BackHandlerCompat
    public final void onBackCancelled() {
        Encoder<BackEventCompat> encoder = this.activeChannel;
        if (encoder != null) {
            encoder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new CancellationException("onBack cancelled"));
        }
        VideoMimeInfoBuilder videoMimeInfoBuilder = this.activeJob;
        if (videoMimeInfoBuilder != null) {
            videoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
        }
        this.activeChannel = null;
        this.activeJob = null;
        this.isPredictiveBack = false;
    }
}
