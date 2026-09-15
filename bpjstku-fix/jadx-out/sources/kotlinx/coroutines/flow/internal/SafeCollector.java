package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.ExifInterface;
import defpackage.EncoderImplApi23Impl;
import defpackage.EncoderImplByteBufferInput;
import defpackage.EncoderImplExternalSyntheticLambda6;
import defpackage.VideoMimeInfo;
import defpackage.VideoMimeInfoBuilder;
import defpackage.addSignalEosTimeoutIfNeeded;
import defpackage.lambdaaddObserver6;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0015¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", ExifInterface.GPS_DIRECTION_TRUE, "LaddSignalEosTimeoutIfNeeded;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "p0", "Lkotlin/coroutines/CoroutineContext;", "p1", "<init>", "(LaddSignalEosTimeoutIfNeeded;Lkotlin/coroutines/CoroutineContext;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", "", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "releaseIntercepted", "()V", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collector", "LaddSignalEosTimeoutIfNeeded;", "collectContext", "Lkotlin/coroutines/CoroutineContext;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "TuitionPaymentFragmentbindingInflater1", "", "collectContextSize", "I", "lastEmissionContext", "Lkotlin/coroutines/Continuation;", "completion_", "Lkotlin/coroutines/Continuation;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SafeCollector<T> extends ContinuationImpl implements addSignalEosTimeoutIfNeeded<T>, CoroutineStackFrame {
    public final CoroutineContext collectContext;
    public final int collectContextSize;
    public final addSignalEosTimeoutIfNeeded<T> collector;
    private Continuation<? super Unit> completion_;
    private CoroutineContext lastEmissionContext;

    public static /* synthetic */ int b(int i) {
        return i + 1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded, CoroutineContext coroutineContext) {
        super(EncoderImplApi23Impl.INSTANCE, EmptyCoroutineContext.INSTANCE);
        this.collector = addsignaleostimeoutifneeded;
        this.collectContext = coroutineContext;
        this.collectContextSize = ((Number) coroutineContext.fold(0, new EncoderImplByteBufferInput())).intValue();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<? super Unit> continuation = this.completion_;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.lastEmissionContext;
        return coroutineContext == null ? EmptyCoroutineContext.INSTANCE : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object p0) {
        Throwable thM8027exceptionOrNullimpl = Result.m8027exceptionOrNullimpl(p0);
        if (thM8027exceptionOrNullimpl != null) {
            this.lastEmissionContext = new EncoderImplExternalSyntheticLambda6(thM8027exceptionOrNullimpl, getContext());
        }
        Continuation<? super Unit> continuation = this.completion_;
        if (continuation != null) {
            continuation.resumeWith(p0);
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }

    @Override // defpackage.addSignalEosTimeoutIfNeeded
    public final Object emit(T t, Continuation<? super Unit> continuation) {
        try {
            CoroutineContext context = continuation.getContext();
            VideoMimeInfoBuilder videoMimeInfoBuilder = (VideoMimeInfoBuilder) context.get(VideoMimeInfoBuilder.b);
            if (videoMimeInfoBuilder != null) {
                VideoMimeInfo.b(videoMimeInfoBuilder);
            }
            CoroutineContext coroutineContext = this.lastEmissionContext;
            if (coroutineContext != context) {
                if (coroutineContext instanceof EncoderImplExternalSyntheticLambda6) {
                    StringBuilder sb = new StringBuilder("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                    sb.append(((EncoderImplExternalSyntheticLambda6) coroutineContext).TuitionPaymentFragmentbindingInflater1);
                    sb.append(", but then emission attempt of value '");
                    sb.append(t);
                    sb.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                    throw new IllegalStateException(StringsKt.trimIndent(sb.toString()).toString());
                }
                if (((Number) context.fold(0, new Function2() { // from class: setInputSurface
                    /* JADX WARN: Code duplicated, block: B:6:0x001d  */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        SafeCollector safeCollector = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int iIntValue = ((Integer) obj).intValue();
                        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                        CoroutineContext.Key<?> key = element.getKey();
                        CoroutineContext.Element element2 = safeCollector.collectContext.get(key);
                        if (key == VideoMimeInfoBuilder.b) {
                            VideoMimeInfoBuilder videoMimeInfoBuilder2 = (VideoMimeInfoBuilder) element2;
                            Intrinsics.checkNotNull(element, "");
                            VideoMimeInfoBuilder videoMimeInfoBuilderB = (VideoMimeInfoBuilder) element;
                            while (true) {
                                if (videoMimeInfoBuilderB == null) {
                                    videoMimeInfoBuilderB = null;
                                    break;
                                }
                                if (videoMimeInfoBuilderB == videoMimeInfoBuilder2 || !(videoMimeInfoBuilderB instanceof onOutputBufferAvailable)) {
                                    break;
                                }
                                ReportedVideoQualityNotSupportedQuirk reportedVideoQualityNotSupportedQuirkINotificationSideChannelStub = ((onOutputBufferAvailable) videoMimeInfoBuilderB).INotificationSideChannelStub();
                                videoMimeInfoBuilderB = reportedVideoQualityNotSupportedQuirkINotificationSideChannelStub != null ? reportedVideoQualityNotSupportedQuirkINotificationSideChannelStub.b() : null;
                            }
                            if (videoMimeInfoBuilderB != videoMimeInfoBuilder2) {
                                StringBuilder sb2 = new StringBuilder("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ");
                                sb2.append(videoMimeInfoBuilderB);
                                sb2.append(", expected child of ");
                                sb2.append(videoMimeInfoBuilder2);
                                sb2.append(".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'");
                                throw new IllegalStateException(sb2.toString().toString());
                            }
                            if (videoMimeInfoBuilder2 != null) {
                                iIntValue++;
                            }
                        } else if (element != element2) {
                            iIntValue = Integer.MIN_VALUE;
                        } else {
                            iIntValue++;
                        }
                        return Integer.valueOf(iIntValue);
                    }
                })).intValue() == this.collectContextSize) {
                    this.lastEmissionContext = context;
                } else {
                    StringBuilder sb2 = new StringBuilder("Flow invariant is violated:\n\t\tFlow was collected in ");
                    sb2.append(this.collectContext);
                    sb2.append(",\n\t\tbut emission happened in ");
                    sb2.append(context);
                    sb2.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                    throw new IllegalStateException(sb2.toString().toString());
                }
            }
            this.completion_ = continuation;
            Function3 function3 = lambdaaddObserver6.b;
            addSignalEosTimeoutIfNeeded<T> addsignaleostimeoutifneeded = this.collector;
            Intrinsics.checkNotNull(addsignaleostimeoutifneeded, "");
            Intrinsics.checkNotNull(this, "");
            Object objInvoke = function3.invoke(addsignaleostimeoutifneeded, t, this);
            if (!Intrinsics.areEqual(objInvoke, IntrinsicsKt.getCOROUTINE_SUSPENDED())) {
                this.completion_ = null;
            }
            if (objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
        } catch (Throwable th) {
            this.lastEmissionContext = new EncoderImplExternalSyntheticLambda6(th, continuation.getContext());
            throw th;
        }
    }
}
