package defpackage;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import androidx.core.internal.view.SupportMenu;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001a\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001eH\u0005Jb\u0010\u001a\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u001f2\u0006\u0010\u001d\u001a\u0002H\u001f2!\u0010 \u001a\u001d\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00190!2!\u0010$\u001a\u001d\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00160!H\u0083\b¢\u0006\u0002\u0010%J\u001e\u0010&\u001a\u00020\u00162\n\u0010'\u001a\u0006\u0012\u0002\b\u00030(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u0004J\b\u0010*\u001a\u00020\u0003H\u0002J\u0006\u0010+\u001a\u00020\u0016J\b\u0010,\u001a\u00020\u0016H\u0002J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020\u0019H\u0002J\f\u00100\u001a\u00020\u0019*\u00020\u0001H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004R\t\u0010\n\u001a\u00020\u000bX\u0082\u0004R\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004R\t\u0010\r\u001a\u00020\u000bX\u0082\u0004R\t\u0010\u000e\u001a\u00020\u000fX\u0082\u0004R\u0011\u0010\u0010\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R&\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreAndMutexImpl;", "", "permits", "", "acquiredPermits", "<init>", "(II)V", "head", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/sync/SemaphoreSegment;", "deqIdx", "Lkotlinx/atomicfu/AtomicLong;", "tail", "enqIdx", "_availablePermits", "Lkotlinx/atomicfu/AtomicInt;", "availablePermits", "getAvailablePermits", "()I", "onCancellationRelease", "Lkotlin/Function3;", "", "", "Lkotlin/coroutines/CoroutineContext;", "tryAcquire", "", "acquire", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acquireSlowPath", "waiter", "Lkotlinx/coroutines/CancellableContinuation;", ExifInterface.LONGITUDE_WEST, "suspend", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onAcquired", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onAcquireRegFunction", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "ignoredParam", "decPermits", "release", "coerceAvailablePermitsAtMaximum", "addAcquireToQueue", "Lkotlinx/coroutines/Waiter;", "tryResumeNextFromQueue", "tryResumeAcquire", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class dynamicRangeToVideoProfileBitDepth {
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f899a;
    private final Function3<Throwable, Unit, CoroutineContext, Unit> d;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater TuitionPaymentFragmentbindingInflater1 = AtomicReferenceFieldUpdater.newUpdater(dynamicRangeToVideoProfileBitDepth.class, Object.class, "head$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault3 = AtomicLongFieldUpdater.newUpdater(dynamicRangeToVideoProfileBitDepth.class, "deqIdx$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(dynamicRangeToVideoProfileBitDepth.class, Object.class, "tail$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault2 = AtomicLongFieldUpdater.newUpdater(dynamicRangeToVideoProfileBitDepth.class, "enqIdx$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault1 = AtomicIntegerFieldUpdater.newUpdater(dynamicRangeToVideoProfileBitDepth.class, "_availablePermits$volatile");

    public dynamicRangeToVideoProfileBitDepth(int i, int i2) {
        this.f899a = i;
        if (i <= 0) {
            throw new IllegalArgumentException("Semaphore should have at least 1 permit, but had ".concat(String.valueOf(i)).toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..".concat(String.valueOf(i)).toString());
        }
        dynamicRangeToVideoProfileHdrFormats dynamicrangetovideoprofilehdrformats = new dynamicRangeToVideoProfileHdrFormats(0L, null, 2);
        this.head$volatile = dynamicrangetovideoprofilehdrformats;
        this.tail$volatile = dynamicrangetovideoprofilehdrformats;
        this._availablePermits$volatile = i - i2;
        this.d = new Function3() { // from class: DynamicRangeUtil
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return dynamicRangeToVideoProfileBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
            }
        };
    }

    private final Object TuitionPaymentFragmentbindingInflater1(Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MediaStoreVideoCannotWrite.TuitionPaymentFragmentspecialinlinedviewModeldefault3(IntrinsicsKt.intercepted(continuation));
        try {
            if (!TuitionPaymentFragmentspecialinlinedviewModeldefault2(cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                TuitionPaymentFragmentbindingInflater1((MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super Unit>) cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            Object result = cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
        } catch (Throwable th) {
            cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(dynamicRangeToVideoProfileBitDepth dynamicrangetovideoprofilebitdepth) {
        dynamicrangetovideoprofilebitdepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return Unit.INSTANCE;
    }

    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(getByteBuffer getbytebuffer) {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        dynamicRangeToVideoProfileHdrFormats dynamicrangetovideoprofilehdrformats = (dynamicRangeToVideoProfileHdrFormats) atomicReferenceFieldUpdater.get(this);
        long andIncrement = TuitionPaymentFragmentspecialinlinedviewModeldefault2.getAndIncrement(this);
        SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j = andIncrement / ((long) dynamicRangeToCodecProfileLevelForMime.TuitionPaymentFragmentbindingInflater1);
        loop0: while (true) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault1(dynamicrangetovideoprofilehdrformats, j, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (onOutputFormatChanged.b(objTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                break;
            }
            EncoderImplMediaCodecCallbackExternalSyntheticLambda1 encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1 = onOutputFormatChanged.TuitionPaymentFragmentbindingInflater1(objTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            while (true) {
                EncoderImplMediaCodecCallbackExternalSyntheticLambda1 encoderImplMediaCodecCallbackExternalSyntheticLambda1 = (EncoderImplMediaCodecCallbackExternalSyntheticLambda1) atomicReferenceFieldUpdater.get(this);
                if (encoderImplMediaCodecCallbackExternalSyntheticLambda1.f136a >= encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.f136a) {
                    break loop0;
                }
                if (encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.a()) {
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, encoderImplMediaCodecCallbackExternalSyntheticLambda1, encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1)) {
                        if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addAndGet(encoderImplMediaCodecCallbackExternalSyntheticLambda1, SupportMenu.CATEGORY_MASK) != encoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                            break loop0;
                        }
                        Object obj = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1.get(encoderImplMediaCodecCallbackExternalSyntheticLambda1);
                        if ((obj == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? null : (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) obj) == null) {
                            break loop0;
                        }
                        encoderImplMediaCodecCallbackExternalSyntheticLambda1.asInterface();
                        break loop0;
                    }
                    if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addAndGet(encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1, SupportMenu.CATEGORY_MASK) == encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                        Object obj2 = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1.get(encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1);
                        if ((obj2 == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? null : (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) obj2) != null) {
                            encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.asInterface();
                        }
                    }
                }
            }
        }
        dynamicRangeToVideoProfileHdrFormats dynamicrangetovideoprofilehdrformats2 = (dynamicRangeToVideoProfileHdrFormats) onOutputFormatChanged.TuitionPaymentFragmentbindingInflater1(objTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        int i = (int) (andIncrement % ((long) dynamicRangeToCodecProfileLevelForMime.TuitionPaymentFragmentbindingInflater1));
        AtomicReferenceArray atomicReferenceArray = dynamicrangetovideoprofilehdrformats2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        while (!atomicReferenceArray.compareAndSet(i, null, getbytebuffer)) {
            if (atomicReferenceArray.get(i) != null) {
                EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0 = dynamicRangeToCodecProfileLevelForMime.b;
                EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda2 = dynamicRangeToCodecProfileLevelForMime.d;
                AtomicReferenceArray atomicReferenceArray2 = dynamicrangetovideoprofilehdrformats2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                while (!atomicReferenceArray2.compareAndSet(i, encoderImplMediaCodecCallbackExternalSyntheticLambda0, encoderImplMediaCodecCallbackExternalSyntheticLambda2)) {
                    if (atomicReferenceArray2.get(i) != encoderImplMediaCodecCallbackExternalSyntheticLambda0) {
                        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        return false;
                    }
                }
                if (getbytebuffer instanceof MediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
                    Intrinsics.checkNotNull(getbytebuffer, "");
                    ((MediaFormatMustNotUseFrameRateToFindEncoderQuirk) getbytebuffer).b(Unit.INSTANCE, this.d);
                } else if (getbytebuffer instanceof SystemTimeProvider) {
                    ((SystemTimeProvider) getbytebuffer).b(Unit.INSTANCE);
                } else {
                    throw new IllegalStateException("unexpected: ".concat(String.valueOf(getbytebuffer)).toString());
                }
                return true;
            }
        }
        getbytebuffer.b(dynamicrangetovideoprofilehdrformats2, i);
        return true;
    }

    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = TuitionPaymentFragmentbindingInflater1;
        dynamicRangeToVideoProfileHdrFormats dynamicrangetovideoprofilehdrformats = (dynamicRangeToVideoProfileHdrFormats) atomicReferenceFieldUpdater.get(this);
        long andIncrement = TuitionPaymentFragmentspecialinlinedviewModeldefault3.getAndIncrement(this);
        long j = andIncrement / ((long) dynamicRangeToCodecProfileLevelForMime.TuitionPaymentFragmentbindingInflater1);
        SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.b;
        loop0: while (true) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault1(dynamicrangetovideoprofilehdrformats, j, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (onOutputFormatChanged.b(objTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                break;
            }
            EncoderImplMediaCodecCallbackExternalSyntheticLambda1 encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1 = onOutputFormatChanged.TuitionPaymentFragmentbindingInflater1(objTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            while (true) {
                EncoderImplMediaCodecCallbackExternalSyntheticLambda1 encoderImplMediaCodecCallbackExternalSyntheticLambda1 = (EncoderImplMediaCodecCallbackExternalSyntheticLambda1) atomicReferenceFieldUpdater.get(this);
                if (encoderImplMediaCodecCallbackExternalSyntheticLambda1.f136a >= encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.f136a) {
                    break loop0;
                }
                if (encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.a()) {
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, encoderImplMediaCodecCallbackExternalSyntheticLambda1, encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1)) {
                        if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addAndGet(encoderImplMediaCodecCallbackExternalSyntheticLambda1, SupportMenu.CATEGORY_MASK) != encoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                            break loop0;
                        }
                        Object obj = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1.get(encoderImplMediaCodecCallbackExternalSyntheticLambda1);
                        if ((obj == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? null : (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) obj) == null) {
                            break loop0;
                        }
                        encoderImplMediaCodecCallbackExternalSyntheticLambda1.asInterface();
                        break loop0;
                    }
                    if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addAndGet(encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1, SupportMenu.CATEGORY_MASK) == encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                        Object obj2 = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1.get(encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1);
                        if ((obj2 == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? null : (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) obj2) != null) {
                            encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.asInterface();
                        }
                    }
                }
            }
        }
        dynamicRangeToVideoProfileHdrFormats dynamicrangetovideoprofilehdrformats2 = (dynamicRangeToVideoProfileHdrFormats) onOutputFormatChanged.TuitionPaymentFragmentbindingInflater1(objTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(dynamicrangetovideoprofilehdrformats2, null);
        boolean z = false;
        if (dynamicrangetovideoprofilehdrformats2.f136a > j) {
            return false;
        }
        int i = (int) (andIncrement % ((long) dynamicRangeToCodecProfileLevelForMime.TuitionPaymentFragmentbindingInflater1));
        Object andSet = dynamicrangetovideoprofilehdrformats2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAndSet(i, dynamicRangeToCodecProfileLevelForMime.b);
        if (andSet == null) {
            int i2 = dynamicRangeToCodecProfileLevelForMime.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            for (int i3 = 0; i3 < i2; i3++) {
                if (dynamicrangetovideoprofilehdrformats2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i) == dynamicRangeToCodecProfileLevelForMime.d) {
                    return true;
                }
            }
            EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0 = dynamicRangeToCodecProfileLevelForMime.b;
            EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda2 = dynamicRangeToCodecProfileLevelForMime.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            AtomicReferenceArray atomicReferenceArray = dynamicrangetovideoprofilehdrformats2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            while (!atomicReferenceArray.compareAndSet(i, encoderImplMediaCodecCallbackExternalSyntheticLambda0, encoderImplMediaCodecCallbackExternalSyntheticLambda2)) {
                if (atomicReferenceArray.get(i) != encoderImplMediaCodecCallbackExternalSyntheticLambda0) {
                    return !z;
                }
            }
            z = true;
            return !z;
        }
        if (andSet == dynamicRangeToCodecProfileLevelForMime.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return false;
        }
        if (andSet instanceof MediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
            Intrinsics.checkNotNull(andSet, "");
            MediaFormatMustNotUseFrameRateToFindEncoderQuirk mediaFormatMustNotUseFrameRateToFindEncoderQuirk = (MediaFormatMustNotUseFrameRateToFindEncoderQuirk) andSet;
            Object objB = mediaFormatMustNotUseFrameRateToFindEncoderQuirk.b(Unit.INSTANCE, null, this.d);
            if (objB == null) {
                return false;
            }
            mediaFormatMustNotUseFrameRateToFindEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objB);
            return true;
        }
        if (andSet instanceof SystemTimeProvider) {
            return ((SystemTimeProvider) andSet).TuitionPaymentFragmentbindingInflater1(this, Unit.INSTANCE);
        }
        throw new IllegalStateException("unexpected: ".concat(String.valueOf(andSet)).toString());
    }

    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Continuation<? super Unit> continuation) {
        int andDecrement;
        do {
            andDecrement = TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAndDecrement(this);
        } while (andDecrement > this.f899a);
        if (andDecrement > 0) {
            return Unit.INSTANCE;
        }
        Object objTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(continuation);
        return objTuitionPaymentFragmentbindingInflater1 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTuitionPaymentFragmentbindingInflater1 : Unit.INSTANCE;
    }

    protected final void TuitionPaymentFragmentbindingInflater1(MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super Unit> mediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
        while (true) {
            int andDecrement = TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAndDecrement(this);
            if (andDecrement <= this.f899a) {
                if (andDecrement <= 0) {
                    Intrinsics.checkNotNull(mediaFormatMustNotUseFrameRateToFindEncoderQuirk, "");
                    if (TuitionPaymentFragmentspecialinlinedviewModeldefault2((getByteBuffer) mediaFormatMustNotUseFrameRateToFindEncoderQuirk)) {
                        return;
                    }
                } else {
                    mediaFormatMustNotUseFrameRateToFindEncoderQuirk.b(Unit.INSTANCE, this.d);
                    return;
                }
            }
        }
    }

    public final int b() {
        return Math.max(TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(this), 0);
    }

    protected final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(SystemTimeProvider<?> systemTimeProvider) {
        while (true) {
            int andDecrement = TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAndDecrement(this);
            if (andDecrement <= this.f899a) {
                if (andDecrement <= 0) {
                    Intrinsics.checkNotNull(systemTimeProvider, "");
                    if (TuitionPaymentFragmentspecialinlinedviewModeldefault2((getByteBuffer) systemTimeProvider)) {
                        return;
                    }
                } else {
                    systemTimeProvider.b(Unit.INSTANCE);
                    return;
                }
            }
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        int i2;
        do {
            int andIncrement = TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAndIncrement(this);
            if (andIncrement >= this.f899a) {
                do {
                    atomicIntegerFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    i = atomicIntegerFieldUpdater.get(this);
                    i2 = this.f899a;
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                StringBuilder sb = new StringBuilder("The number of released permits cannot be greater than ");
                sb.append(this.f899a);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final boolean TuitionPaymentFragmentbindingInflater1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        int i2;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = atomicIntegerFieldUpdater2.get(this);
            if (i3 > this.f899a) {
                do {
                    atomicIntegerFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    i = atomicIntegerFieldUpdater.get(this);
                    i2 = this.f899a;
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
            } else {
                if (i3 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater2.compareAndSet(this, i3, i3 - 1)) {
                    return true;
                }
            }
        }
    }
}
