package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutinesInternalError;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AudioConfigUtilExternalSyntheticLambda0<T> extends getSupportedHeightsFor {
    public int b;

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T TuitionPaymentFragmentbindingInflater1(Object obj) {
        return obj;
    }

    public abstract Continuation<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    public void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th) {
    }

    public abstract Object asInterface();

    public AudioConfigUtilExternalSyntheticLambda0(int i) {
        this.b = i;
    }

    public Throwable b(Object obj) {
        isVivoY91i isvivoy91i = obj instanceof isVivoY91i ? (isVivoY91i) obj : null;
        if (isvivoy91i != null) {
            return isvivoy91i.TuitionPaymentFragmentbindingInflater1;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CancellationException cancellationExceptionTuitionPaymentFragmentbindingInflater1;
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        try {
            Continuation<T> continuationTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            Intrinsics.checkNotNull(continuationTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
            EncoderImplByteBufferInputExternalSyntheticLambda4 encoderImplByteBufferInputExternalSyntheticLambda4 = (EncoderImplByteBufferInputExternalSyntheticLambda4) continuationTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Continuation<T> continuation = encoderImplByteBufferInputExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1;
            Object obj = encoderImplByteBufferInputExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            CoroutineContext context = continuation.get$context();
            Object objTuitionPaymentFragmentbindingInflater1 = EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1(context, obj);
            VideoMimeInfoBuilder videoMimeInfoBuilder = null;
            generateCopiedByteInfo<?> generatecopiedbyteinfoTuitionPaymentFragmentspecialinlinedviewModeldefault3 = objTuitionPaymentFragmentbindingInflater1 != EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? VideoEncoderCrashQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Continuation<?>) continuation, context, objTuitionPaymentFragmentbindingInflater1) : null;
            try {
                CoroutineContext context2 = continuation.get$context();
                Object objAsInterface = asInterface();
                Throwable thB = b(objAsInterface);
                if (thB == null && AudioMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b)) {
                    videoMimeInfoBuilder = (VideoMimeInfoBuilder) context2.get(VideoMimeInfoBuilder.b);
                }
                if (videoMimeInfoBuilder != null && !videoMimeInfoBuilder.r_()) {
                    CancellationException cancellationExceptionS_ = videoMimeInfoBuilder.s_();
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(cancellationExceptionS_);
                    Result.Companion companion = Result.INSTANCE;
                    if (!scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault1() || !(continuation instanceof CoroutineStackFrame)) {
                        cancellationExceptionTuitionPaymentFragmentbindingInflater1 = cancellationExceptionS_;
                    } else {
                        cancellationExceptionTuitionPaymentFragmentbindingInflater1 = reachEndData.TuitionPaymentFragmentbindingInflater1(cancellationExceptionS_, (CoroutineStackFrame) continuation);
                    }
                    continuation.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(cancellationExceptionTuitionPaymentFragmentbindingInflater1)));
                } else if (thB != null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    continuation.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(thB)));
                } else {
                    Result.Companion companion3 = Result.INSTANCE;
                    continuation.resumeWith(Result.m8024constructorimpl(TuitionPaymentFragmentbindingInflater1(objAsInterface)));
                }
                Unit unit = Unit.INSTANCE;
            } finally {
                if (generatecopiedbyteinfoTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null || generatecopiedbyteinfoTuitionPaymentFragmentspecialinlinedviewModeldefault3.g()) {
                    EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, objTuitionPaymentFragmentbindingInflater1);
                }
            }
        } catch (Throwable th) {
            b(th);
        }
    }

    public final void b(Throwable th) {
        StringBuilder sb = new StringBuilder("Fatal exception in coroutines machinery for ");
        sb.append(this);
        sb.append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
        AudioConfigUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault2().get$context(), new CoroutinesInternalError(sb.toString(), th));
    }
}
