package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.p002lifecycle.LifecycleOwner;
import defpackage.VideoMimeInfoBuilder;
import defpackage.stopMediaCodec;
import java.util.concurrent.CancellationException;
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
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", i = {0}, l = {388}, m = "invokeSuspend", n = {"durationScaleJob"}, s = {"L$0"})
final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Recomposer $recomposer;
    final /* synthetic */ WindowRecomposer_androidKt.AnonymousClass2 $self;
    final /* synthetic */ LifecycleOwner $source;
    final /* synthetic */ Ref.ObjectRef<MotionDurationScaleImpl> $systemDurationScaleSettingConsumer;
    final /* synthetic */ View $this_createLifecycleAwareWindowRecomposer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: Code duplicated, block: B:21:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        VideoMimeInfoBuilder videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1;
        VideoMimeInfoBuilder videoMimeInfoBuilder;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            videoMimeInfoBuilder = (VideoMimeInfoBuilder) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                if (videoMimeInfoBuilder != null) {
                    videoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
                }
                this.$source.getLifecycle().removeObserver(this.$self);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                VideoMimeInfoBuilder videoMimeInfoBuilder2 = videoMimeInfoBuilder;
                th = th;
                videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1 = videoMimeInfoBuilder2;
                if (videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1 != null) {
                    videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
                }
                this.$source.getLifecycle().removeObserver(this.$self);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1 = null;
        try {
            MotionDurationScaleImpl motionDurationScaleImpl = this.$systemDurationScaleSettingConsumer.element;
            if (motionDurationScaleImpl != null) {
                stopMediaCodec animationScaleFlowFor = WindowRecomposer_androidKt.getAnimationScaleFlowFor(this.$this_createLifecycleAwareWindowRecomposer.getContext().getApplicationContext());
                motionDurationScaleImpl.setScaleFactor(((Number) animationScaleFlowFor.TuitionPaymentFragmentspecialinlinedviewModeldefault1()).floatValue());
                videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1 = b.TuitionPaymentFragmentbindingInflater1(coroutineScope, null, null, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(animationScaleFlowFor, motionDurationScaleImpl, null), 3, null);
            }
            try {
                this.L$0 = videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1;
                this.label = 1;
                if (this.$recomposer.runRecomposeAndApplyChanges(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                videoMimeInfoBuilder = videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1;
                if (videoMimeInfoBuilder != null) {
                    videoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
                }
                this.$source.getLifecycle().removeObserver(this.$self);
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                videoMimeInfoBuilder = videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1;
                th = th3;
                VideoMimeInfoBuilder videoMimeInfoBuilder3 = videoMimeInfoBuilder;
                th = th;
                videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1 = videoMimeInfoBuilder3;
                if (videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1 != null) {
                    videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
                }
                this.$source.getLifecycle().removeObserver(this.$self);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        if (videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1 != null) {
            videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
        }
        this.$source.getLifecycle().removeObserver(this.$self);
        throw th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(Ref.ObjectRef<MotionDurationScaleImpl> objectRef, Recomposer recomposer, LifecycleOwner lifecycleOwner, WindowRecomposer_androidKt.AnonymousClass2 anonymousClass2, View view, Continuation<? super WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1> continuation) {
        super(2, continuation);
        this.$systemDurationScaleSettingConsumer = objectRef;
        this.$recomposer = recomposer;
        this.$source = lifecycleOwner;
        this.$self = anonymousClass2;
        this.$this_createLifecycleAwareWindowRecomposer = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 = new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.$systemDurationScaleSettingConsumer, this.$recomposer, this.$source, this.$self, this.$this_createLifecycleAwareWindowRecomposer, continuation);
        windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.L$0 = obj;
        return windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
