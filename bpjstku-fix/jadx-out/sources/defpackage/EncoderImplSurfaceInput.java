package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class EncoderImplSurfaceInput {
    public static final <T, R> Object TuitionPaymentFragmentbindingInflater1(onOutputBufferAvailable<? super T> onoutputbufferavailable, R r, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        Object isvivoy91i;
        Object objAsBinder;
        try {
            isvivoy91i = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(function2, r, onoutputbufferavailable) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, onoutputbufferavailable);
        } catch (Throwable th) {
            isvivoy91i = new isVivoY91i(th, false, 2, null);
        }
        if (isvivoy91i != IntrinsicsKt.getCOROUTINE_SUSPENDED() && (objAsBinder = onoutputbufferavailable.asBinder(isvivoy91i)) != AudioEncoderInfo.TuitionPaymentFragmentbindingInflater1) {
            if (objAsBinder instanceof isVivoY91i) {
                isVivoY91i isvivoy91i2 = (isVivoY91i) objAsBinder;
                Throwable th2 = isvivoy91i2.TuitionPaymentFragmentbindingInflater1;
                Throwable th3 = isvivoy91i2.TuitionPaymentFragmentbindingInflater1;
                Continuation<? super T> continuation = onoutputbufferavailable.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault1() && (continuation instanceof CoroutineStackFrame)) {
                    throw reachEndData.TuitionPaymentFragmentbindingInflater1(th3, (CoroutineStackFrame) continuation);
                }
                throw th3;
            }
            return AudioEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objAsBinder);
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    public static final <T, R> Object b(onOutputBufferAvailable<? super T> onoutputbufferavailable, R r, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) throws Throwable {
        Object isvivoy91i;
        Object objAsBinder;
        try {
            isvivoy91i = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(function2, r, onoutputbufferavailable) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, onoutputbufferavailable);
        } catch (Throwable th) {
            isvivoy91i = new isVivoY91i(th, false, 2, null);
        }
        if (isvivoy91i != IntrinsicsKt.getCOROUTINE_SUSPENDED() && (objAsBinder = onoutputbufferavailable.asBinder(isvivoy91i)) != AudioEncoderInfo.TuitionPaymentFragmentbindingInflater1) {
            if (objAsBinder instanceof isVivoY91i) {
                isVivoY91i isvivoy91i2 = (isVivoY91i) objAsBinder;
                Throwable th2 = isvivoy91i2.TuitionPaymentFragmentbindingInflater1;
                if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).TuitionPaymentFragmentspecialinlinedviewModeldefault2 != onoutputbufferavailable) {
                    Throwable th3 = isvivoy91i2.TuitionPaymentFragmentbindingInflater1;
                    Continuation<? super T> continuation = onoutputbufferavailable.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault1() && (continuation instanceof CoroutineStackFrame)) {
                        throw reachEndData.TuitionPaymentFragmentbindingInflater1(th3, (CoroutineStackFrame) continuation);
                    }
                    throw th3;
                }
                if (isvivoy91i instanceof isVivoY91i) {
                    Throwable th4 = ((isVivoY91i) isvivoy91i).TuitionPaymentFragmentbindingInflater1;
                    Continuation<? super T> continuation2 = onoutputbufferavailable.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault1() && (continuation2 instanceof CoroutineStackFrame)) {
                        throw reachEndData.TuitionPaymentFragmentbindingInflater1(th4, (CoroutineStackFrame) continuation2);
                    }
                    throw th4;
                }
            } else {
                isvivoy91i = AudioEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objAsBinder);
            }
            return isvivoy91i;
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    public static final <R, T> void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> continuation) {
        Continuation continuationProbeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(continuation);
        try {
            CoroutineContext coroutineContext = continuationProbeCoroutineCreated.get$context();
            Object objTuitionPaymentFragmentbindingInflater1 = EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1(coroutineContext, null);
            try {
                DebugProbesKt.probeCoroutineResumed(continuationProbeCoroutineCreated);
                Object objWrapWithContinuationImpl = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(function2, r, continuationProbeCoroutineCreated) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, continuationProbeCoroutineCreated);
                EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineContext, objTuitionPaymentFragmentbindingInflater1);
                if (objWrapWithContinuationImpl != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    Result.Companion companion = Result.INSTANCE;
                    continuationProbeCoroutineCreated.resumeWith(Result.m8024constructorimpl(objWrapWithContinuationImpl));
                }
            } catch (Throwable th) {
                EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineContext, objTuitionPaymentFragmentbindingInflater1);
                throw th;
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            continuationProbeCoroutineCreated.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(th2)));
        }
    }
}
