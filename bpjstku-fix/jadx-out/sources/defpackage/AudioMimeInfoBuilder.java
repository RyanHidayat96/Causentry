package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes4.dex */
public final class AudioMimeInfoBuilder {
    public static final boolean TuitionPaymentFragmentbindingInflater1(int i) {
        return i == 2;
    }

    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        return i == 1 || i == 2;
    }

    public static final <T> void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AudioConfigUtilExternalSyntheticLambda0<? super T> audioConfigUtilExternalSyntheticLambda0, int i) {
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Continuation<? super T> continuationTuitionPaymentFragmentspecialinlinedviewModeldefault2 = audioConfigUtilExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        boolean z = i == 4;
        if (!z && (continuationTuitionPaymentFragmentspecialinlinedviewModeldefault2 instanceof EncoderImplByteBufferInputExternalSyntheticLambda4) && TuitionPaymentFragmentspecialinlinedviewModeldefault3(i) == TuitionPaymentFragmentspecialinlinedviewModeldefault3(audioConfigUtilExternalSyntheticLambda0.b)) {
            EncoderImplByteBufferInputExternalSyntheticLambda4 encoderImplByteBufferInputExternalSyntheticLambda4 = (EncoderImplByteBufferInputExternalSyntheticLambda4) continuationTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            CoroutineDispatcher coroutineDispatcher = encoderImplByteBufferInputExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            CoroutineContext coroutineContext = encoderImplByteBufferInputExternalSyntheticLambda4.get$context();
            if (coroutineDispatcher.isDispatchNeeded(coroutineContext)) {
                coroutineDispatcher.dispatch(coroutineContext, audioConfigUtilExternalSyntheticLambda0);
                return;
            } else {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(audioConfigUtilExternalSyntheticLambda0);
                return;
            }
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(audioConfigUtilExternalSyntheticLambda0, continuationTuitionPaymentFragmentspecialinlinedviewModeldefault2, z);
    }

    private static <T> void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AudioConfigUtilExternalSyntheticLambda0<? super T> audioConfigUtilExternalSyntheticLambda0, Continuation<? super T> continuation, boolean z) {
        Object objTuitionPaymentFragmentbindingInflater1;
        Object objAsInterface = audioConfigUtilExternalSyntheticLambda0.asInterface();
        Throwable thB = audioConfigUtilExternalSyntheticLambda0.b(objAsInterface);
        if (thB != null) {
            Result.Companion companion = Result.INSTANCE;
            objTuitionPaymentFragmentbindingInflater1 = ResultKt.createFailure(thB);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            objTuitionPaymentFragmentbindingInflater1 = audioConfigUtilExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(objAsInterface);
        }
        Object objM8024constructorimpl = Result.m8024constructorimpl(objTuitionPaymentFragmentbindingInflater1);
        if (z) {
            Intrinsics.checkNotNull(continuation, "");
            EncoderImplByteBufferInputExternalSyntheticLambda4 encoderImplByteBufferInputExternalSyntheticLambda4 = (EncoderImplByteBufferInputExternalSyntheticLambda4) continuation;
            Continuation<T> continuation2 = encoderImplByteBufferInputExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1;
            Object obj = encoderImplByteBufferInputExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            CoroutineContext coroutineContext = continuation2.get$context();
            Object objTuitionPaymentFragmentbindingInflater2 = EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1(coroutineContext, obj);
            generateCopiedByteInfo<?> generatecopiedbyteinfoTuitionPaymentFragmentspecialinlinedviewModeldefault3 = objTuitionPaymentFragmentbindingInflater2 != EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? VideoEncoderCrashQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Continuation<?>) continuation2, coroutineContext, objTuitionPaymentFragmentbindingInflater2) : null;
            try {
                encoderImplByteBufferInputExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1.resumeWith(objM8024constructorimpl);
                Unit unit = Unit.INSTANCE;
                if (generatecopiedbyteinfoTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null || generatecopiedbyteinfoTuitionPaymentFragmentspecialinlinedviewModeldefault3.g()) {
                    return;
                } else {
                    return;
                }
            } finally {
                if (generatecopiedbyteinfoTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null || generatecopiedbyteinfoTuitionPaymentFragmentspecialinlinedviewModeldefault3.g()) {
                    EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineContext, objTuitionPaymentFragmentbindingInflater2);
                }
            }
        }
        continuation.resumeWith(objM8024constructorimpl);
    }

    private static final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(AudioConfigUtilExternalSyntheticLambda0<?> audioConfigUtilExternalSyntheticLambda0) {
        setDataSpace setdataspace = setDataSpace.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        AutoValue_AudioMimeInfoBuilder autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setDataSpace.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (!autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder()) {
            autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(true);
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(audioConfigUtilExternalSyntheticLambda0, audioConfigUtilExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), true);
                do {
                } while (autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.d());
            } catch (Throwable th) {
                try {
                    audioConfigUtilExternalSyntheticLambda0.b(th);
                } finally {
                    autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(true);
                }
            }
            return;
        }
        ArrayDeque<AudioConfigUtilExternalSyntheticLambda0<?>> arrayDeque = autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque<>();
            autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.b = arrayDeque;
        }
        arrayDeque.addLast(audioConfigUtilExternalSyntheticLambda0);
    }
}
