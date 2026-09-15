package kotlinx.coroutines;

import defpackage.EncoderImplByteBufferInputExternalSyntheticLambda0;
import defpackage.EncoderImplSurfaceInput;
import defpackage.VideoMimeInfo;
import defpackage.VideoMimeInfoBuilder;
import defpackage.getDataSpace;
import defpackage.onOutputBufferAvailable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0001\u001aJ\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r¢\u0006\u0002\b\u0010H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0011\u001a\u000e\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a!\u0010\u0013\u001a\u00020\u0014*\u00020\u00012\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0016¢\u0006\u0002\u0010\u0018\u001a\u001e\u0010\u0013\u001a\u00020\u0014*\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u001b\u001a\n\u0010\u001c\u001a\u00020\u0014*\u00020\u0001\u001a\u000e\u0010\u001d\u001a\u00020\u0003H\u0086H¢\u0006\u0002\u0010\u001e\"\u001b\u0010\u0005\u001a\u00020\u0006*\u00020\u00018F¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\t¨\u0006\u001f"}, d2 = {"plus", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "MainScope", "isActive", "", "isActive$annotations", "(Lkotlinx/coroutines/CoroutineScope;)V", "(Lkotlinx/coroutines/CoroutineScope;)Z", "coroutineScope", "R", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CoroutineScope", "cancel", "", "cause", "Lkotlinx/coroutines/CancellationException;", "Ljava/util/concurrent/CancellationException;", "(Lkotlinx/coroutines/CoroutineScope;Ljava/util/concurrent/CancellationException;)V", "message", "", "", "ensureActive", "currentCoroutineContext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CoroutineScopeKt {
    public static final CoroutineScope TuitionPaymentFragmentspecialinlinedviewModeldefault2(CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        return new EncoderImplByteBufferInputExternalSyntheticLambda0(coroutineScope.getCoroutineContext().plus(coroutineContext));
    }

    public static final CoroutineScope TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new EncoderImplByteBufferInputExternalSyntheticLambda0(new getDataSpace(null).plus(Dispatchers.TuitionPaymentFragmentbindingInflater1()));
    }

    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(CoroutineScope coroutineScope) {
        VideoMimeInfoBuilder videoMimeInfoBuilder = (VideoMimeInfoBuilder) coroutineScope.getCoroutineContext().get(VideoMimeInfoBuilder.b);
        if (videoMimeInfoBuilder != null) {
            return videoMimeInfoBuilder.r_();
        }
        return true;
    }

    public static final <R> Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function2<? super CoroutineScope, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        onOutputBufferAvailable onoutputbufferavailable = new onOutputBufferAvailable(continuation.get$context(), continuation);
        Object objTuitionPaymentFragmentbindingInflater1 = EncoderImplSurfaceInput.TuitionPaymentFragmentbindingInflater1(onoutputbufferavailable, onoutputbufferavailable, function2);
        if (objTuitionPaymentFragmentbindingInflater1 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objTuitionPaymentFragmentbindingInflater1;
    }

    public static final CoroutineScope CoroutineScope(CoroutineContext coroutineContext) {
        if (coroutineContext.get(VideoMimeInfoBuilder.b) == null) {
            coroutineContext = coroutineContext.plus(VideoMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3((VideoMimeInfoBuilder) null));
        }
        return new EncoderImplByteBufferInputExternalSyntheticLambda0(coroutineContext);
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CoroutineScope coroutineScope, CancellationException cancellationException) {
        VideoMimeInfoBuilder videoMimeInfoBuilder = (VideoMimeInfoBuilder) coroutineScope.getCoroutineContext().get(VideoMimeInfoBuilder.b);
        if (videoMimeInfoBuilder == null) {
            throw new IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(String.valueOf(coroutineScope)).toString());
        }
        videoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(cancellationException);
    }

    public static final void b(CoroutineScope coroutineScope) {
        VideoMimeInfoBuilder videoMimeInfoBuilder = (VideoMimeInfoBuilder) coroutineScope.getCoroutineContext().get(VideoMimeInfoBuilder.b);
        if (videoMimeInfoBuilder != null) {
            VideoMimeInfo.b(videoMimeInfoBuilder);
        }
    }

    public static final void b(CoroutineScope coroutineScope, String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(coroutineScope, cancellationException);
    }
}
