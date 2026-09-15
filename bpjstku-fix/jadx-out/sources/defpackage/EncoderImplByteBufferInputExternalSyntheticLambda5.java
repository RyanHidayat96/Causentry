package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class EncoderImplByteBufferInputExternalSyntheticLambda5 {
    private static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("UNDEFINED");
    public static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 TuitionPaymentFragmentbindingInflater1 = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("REUSABLE_CLAIMED");

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void TuitionPaymentFragmentbindingInflater1(Continuation<? super T> continuation, Object obj) {
        if (!(continuation instanceof EncoderImplByteBufferInputExternalSyntheticLambda4)) {
            continuation.resumeWith(obj);
            return;
        }
        EncoderImplByteBufferInputExternalSyntheticLambda4 encoderImplByteBufferInputExternalSyntheticLambda4 = (EncoderImplByteBufferInputExternalSyntheticLambda4) continuation;
        Throwable thM8027exceptionOrNullimpl = Result.m8027exceptionOrNullimpl(obj);
        Object isvivoy91i = thM8027exceptionOrNullimpl == null ? obj : new isVivoY91i(thM8027exceptionOrNullimpl, false, 2, 0 == true ? 1 : 0);
        if (encoderImplByteBufferInputExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isDispatchNeeded(encoderImplByteBufferInputExternalSyntheticLambda4.get$context())) {
            encoderImplByteBufferInputExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = isvivoy91i;
            encoderImplByteBufferInputExternalSyntheticLambda4.b = 1;
            encoderImplByteBufferInputExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispatch(encoderImplByteBufferInputExternalSyntheticLambda4.get$context(), encoderImplByteBufferInputExternalSyntheticLambda4);
            return;
        }
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        setDataSpace setdataspace = setDataSpace.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        AutoValue_AudioMimeInfoBuilder autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setDataSpace.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder()) {
            encoderImplByteBufferInputExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = isvivoy91i;
            encoderImplByteBufferInputExternalSyntheticLambda4.b = 1;
            EncoderImplByteBufferInputExternalSyntheticLambda4 encoderImplByteBufferInputExternalSyntheticLambda5 = encoderImplByteBufferInputExternalSyntheticLambda4;
            ArrayDeque<AudioConfigUtilExternalSyntheticLambda0<?>> arrayDeque = autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
            if (arrayDeque == null) {
                arrayDeque = new ArrayDeque<>();
                autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.b = arrayDeque;
            }
            arrayDeque.addLast(encoderImplByteBufferInputExternalSyntheticLambda5);
            return;
        }
        EncoderImplByteBufferInputExternalSyntheticLambda4 encoderImplByteBufferInputExternalSyntheticLambda6 = encoderImplByteBufferInputExternalSyntheticLambda4;
        autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(true);
        try {
            VideoMimeInfoBuilder videoMimeInfoBuilder = (VideoMimeInfoBuilder) encoderImplByteBufferInputExternalSyntheticLambda4.get$context().get(VideoMimeInfoBuilder.b);
            if (videoMimeInfoBuilder != null && !videoMimeInfoBuilder.r_()) {
                CancellationException cancellationExceptionS_ = videoMimeInfoBuilder.s_();
                encoderImplByteBufferInputExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cancellationExceptionS_);
                Result.Companion companion = Result.INSTANCE;
                encoderImplByteBufferInputExternalSyntheticLambda4.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(cancellationExceptionS_)));
            } else {
                Continuation<T> continuation2 = encoderImplByteBufferInputExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1;
                Object obj2 = encoderImplByteBufferInputExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                CoroutineContext context = continuation2.get$context();
                Object objTuitionPaymentFragmentbindingInflater1 = EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1(context, obj2);
                generateCopiedByteInfo<?> generatecopiedbyteinfoTuitionPaymentFragmentspecialinlinedviewModeldefault3 = objTuitionPaymentFragmentbindingInflater1 != EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? VideoEncoderCrashQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Continuation<?>) continuation2, context, objTuitionPaymentFragmentbindingInflater1) : null;
                try {
                    encoderImplByteBufferInputExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1.resumeWith(obj);
                    Unit unit = Unit.INSTANCE;
                    if (generatecopiedbyteinfoTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null || generatecopiedbyteinfoTuitionPaymentFragmentspecialinlinedviewModeldefault3.g()) {
                        EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, objTuitionPaymentFragmentbindingInflater1);
                    }
                } catch (Throwable th) {
                    if (generatecopiedbyteinfoTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null || generatecopiedbyteinfoTuitionPaymentFragmentspecialinlinedviewModeldefault3.g()) {
                        EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, objTuitionPaymentFragmentbindingInflater1);
                    }
                    throw th;
                }
            }
            while (autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.d()) {
            }
        } catch (Throwable th2) {
            try {
                encoderImplByteBufferInputExternalSyntheticLambda6.b(th2);
            } finally {
                autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(true);
            }
        }
    }

    public static final boolean b(EncoderImplByteBufferInputExternalSyntheticLambda4<? super Unit> encoderImplByteBufferInputExternalSyntheticLambda4) {
        Unit unit = Unit.INSTANCE;
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        setDataSpace setdataspace = setDataSpace.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        AutoValue_AudioMimeInfoBuilder autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setDataSpace.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        ArrayDeque<AudioConfigUtilExternalSyntheticLambda0<?>> arrayDeque = autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
        if (arrayDeque != null ? arrayDeque.isEmpty() : true) {
            return false;
        }
        if (autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder()) {
            encoderImplByteBufferInputExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = unit;
            encoderImplByteBufferInputExternalSyntheticLambda4.b = 1;
            EncoderImplByteBufferInputExternalSyntheticLambda4<? super Unit> encoderImplByteBufferInputExternalSyntheticLambda5 = encoderImplByteBufferInputExternalSyntheticLambda4;
            ArrayDeque<AudioConfigUtilExternalSyntheticLambda0<?>> arrayDeque2 = autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
            if (arrayDeque2 == null) {
                arrayDeque2 = new ArrayDeque<>();
                autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.b = arrayDeque2;
            }
            arrayDeque2.addLast(encoderImplByteBufferInputExternalSyntheticLambda5);
            return true;
        }
        EncoderImplByteBufferInputExternalSyntheticLambda4<? super Unit> encoderImplByteBufferInputExternalSyntheticLambda6 = encoderImplByteBufferInputExternalSyntheticLambda4;
        autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(true);
        try {
            encoderImplByteBufferInputExternalSyntheticLambda4.run();
            do {
            } while (autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.d());
        } catch (Throwable th) {
            try {
                encoderImplByteBufferInputExternalSyntheticLambda6.b(th);
            } finally {
                autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(true);
            }
        }
        return false;
    }
}
