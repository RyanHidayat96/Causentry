package defpackage;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0004j\u0002`\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0012\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0013H\u0016¢\u0006\u0002\u0010\u0015J\r\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fJ\r\u0010 \u001a\u00020!H\u0000¢\u0006\u0002\b\"J\r\u0010#\u001a\u00020!H\u0000¢\u0006\u0002\b$J\u0015\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001aH\u0000¢\u0006\u0002\b&J\u001b\u0010'\u001a\u0004\u0018\u00010(2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030)H\u0000¢\u0006\u0002\b*J\u0015\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020(H\u0000¢\u0006\u0002\b-J\u000f\u0010.\u001a\u0004\u0018\u00010\fH\u0010¢\u0006\u0002\b/J\u001b\u00103\u001a\u00020!2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0016¢\u0006\u0002\u00106J\u001e\u00107\u001a\u00020!2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0080\b¢\u0006\u0004\b8\u00106J\u0018\u00109\u001a\u00020\u001e2\b\u0010:\u001a\u0004\u0018\u00010\fH\u0080\b¢\u0006\u0002\b;J\u001e\u0010<\u001a\u00020!2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0080\b¢\u0006\u0004\b=\u00106J\u001f\u0010>\u001a\u00020!2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00028\u0000H\u0000¢\u0006\u0004\bB\u0010CJ\b\u0010D\u001a\u00020EH\u0016R\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0016\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0018X\u0082\u0004R\u001a\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\t\u0010?\u001a\u00020@X\u0096\u0005¨\u0006F"}, d2 = {"Lkotlinx/coroutines/internal/DispatchedContinuation;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "continuation", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)V", "_state", "", "get_state$kotlinx_coroutines_core$annotations", "()V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getStackTraceElement", "Lkotlinx/coroutines/internal/StackTraceElement;", "Ljava/lang/StackTraceElement;", "()Ljava/lang/StackTraceElement;", "countOrElement", "_reusableCancellableContinuation", "Lkotlinx/atomicfu/AtomicRef;", "reusableCancellableContinuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "getReusableCancellableContinuation", "()Lkotlinx/coroutines/CancellableContinuationImpl;", "isReusable", "", "isReusable$kotlinx_coroutines_core", "awaitReusability", "", "awaitReusability$kotlinx_coroutines_core", "release", "release$kotlinx_coroutines_core", "claimReusableCancellableContinuation", "claimReusableCancellableContinuation$kotlinx_coroutines_core", "tryReleaseClaimedContinuation", "", "Lkotlinx/coroutines/CancellableContinuation;", "tryReleaseClaimedContinuation$kotlinx_coroutines_core", "postponeCancellation", "cause", "postponeCancellation$kotlinx_coroutines_core", "takeState", "takeState$kotlinx_coroutines_core", "delegate", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "resumeCancellableWith", "resumeCancellableWith$kotlinx_coroutines_core", "resumeCancelled", RemoteConfigConstants.ResponseFieldKey.STATE, "resumeCancelled$kotlinx_coroutines_core", "resumeUndispatchedWith", "resumeUndispatchedWith$kotlinx_coroutines_core", "dispatchYield", "context", "Lkotlin/coroutines/CoroutineContext;", "value", "dispatchYield$kotlinx_coroutines_core", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EncoderImplByteBufferInputExternalSyntheticLambda4<T> extends AudioConfigUtilExternalSyntheticLambda0<T> implements CoroutineStackFrame, Continuation<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater asBinder = AtomicReferenceFieldUpdater.newUpdater(EncoderImplByteBufferInputExternalSyntheticLambda4.class, Object.class, "_reusableCancellableContinuation$volatile");
    public final Continuation<T> TuitionPaymentFragmentbindingInflater1;
    public final CoroutineDispatcher TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public Object TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EncoderImplByteBufferInputExternalSyntheticLambda4(CoroutineDispatcher coroutineDispatcher, Continuation<? super T> continuation) {
        super(-1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = coroutineDispatcher;
        this.TuitionPaymentFragmentbindingInflater1 = continuation;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = EncoderImplByteBufferInputExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getContext());
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.TuitionPaymentFragmentbindingInflater1;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // defpackage.AudioConfigUtilExternalSyntheticLambda0
    public final Object asInterface() {
        Object obj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = EncoderImplByteBufferInputExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        return obj;
    }

    @Override // defpackage.AudioConfigUtilExternalSyntheticLambda0
    public final Continuation<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DispatchedContinuation[");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", ");
        sb.append(resolveAudioMimeInfo.TuitionPaymentFragmentbindingInflater1((Continuation<?>) this.TuitionPaymentFragmentbindingInflater1));
        sb.append(']');
        return sb.toString();
    }

    public final CancellableContinuationImpl<?> TuitionPaymentFragmentbindingInflater1() {
        Object obj = asBinder.get(this);
        if (obj instanceof CancellableContinuationImpl) {
            return (CancellableContinuationImpl) obj;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object result) {
        Throwable thM8027exceptionOrNullimpl = Result.m8027exceptionOrNullimpl(result);
        Object isvivoy91i = thM8027exceptionOrNullimpl == null ? result : new isVivoY91i(thM8027exceptionOrNullimpl, false, 2, null);
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isDispatchNeeded(getContext())) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = isvivoy91i;
            this.b = 0;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispatch(getContext(), this);
            return;
        }
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        setDataSpace setdataspace = setDataSpace.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        AutoValue_AudioMimeInfoBuilder autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setDataSpace.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder()) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = isvivoy91i;
            this.b = 0;
            EncoderImplByteBufferInputExternalSyntheticLambda4<T> encoderImplByteBufferInputExternalSyntheticLambda4 = this;
            ArrayDeque<AudioConfigUtilExternalSyntheticLambda0<?>> arrayDeque = autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
            if (arrayDeque == null) {
                arrayDeque = new ArrayDeque<>();
                autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.b = arrayDeque;
            }
            arrayDeque.addLast(encoderImplByteBufferInputExternalSyntheticLambda4);
            return;
        }
        EncoderImplByteBufferInputExternalSyntheticLambda4<T> encoderImplByteBufferInputExternalSyntheticLambda5 = this;
        autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(true);
        try {
            CoroutineContext context = getContext();
            Object objTuitionPaymentFragmentbindingInflater1 = EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1(context, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            try {
                this.TuitionPaymentFragmentbindingInflater1.resumeWith(result);
                Unit unit = Unit.INSTANCE;
                EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, objTuitionPaymentFragmentbindingInflater1);
                while (autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.d()) {
                }
            } catch (Throwable th) {
                EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, objTuitionPaymentFragmentbindingInflater1);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                encoderImplByteBufferInputExternalSyntheticLambda5.b(th2);
            } finally {
                autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(true);
            }
        }
    }

    public final Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault2(MediaFormatMustNotUseFrameRateToFindEncoderQuirk<?> mediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = asBinder;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != EncoderImplByteBufferInputExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(obj)).toString());
                }
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(asBinder, this, obj, null)) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(asBinder, this, EncoderImplByteBufferInputExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1, mediaFormatMustNotUseFrameRateToFindEncoderQuirk));
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.TuitionPaymentFragmentbindingInflater1.getContext();
    }
}
