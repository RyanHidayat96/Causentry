package defpackage;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.sync.MutexImpl$onLock$1;
import kotlinx.coroutines.sync.MutexImpl$onLock$2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0002-.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tH\u0016J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0002J\u0018\u0010\u001c\u001a\u00020\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0002\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0082@¢\u0006\u0002\u0010\u001dJ\u0012\u0010\u001f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010 \u001a\u00020\u001b2\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010!\u001a\u00020\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0016J\u001e\u0010(\u001a\u00020\u00152\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0014J\u001e\u0010)\u001a\u0004\u0018\u00010\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\t2\b\u0010*\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010+\u001a\u00020,H\u0016R\u0011\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004R{\u0010\n\u001am\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\f0\fj\u0002`\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R(\u0010\"\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00020#8VX\u0096\u0004¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006/"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "Lkotlinx/coroutines/sync/SemaphoreAndMutexImpl;", "Lkotlinx/coroutines/sync/Mutex;", "locked", "", "<init>", "(Z)V", "owner", "Lkotlinx/atomicfu/AtomicRef;", "", "onSelectCancellationUnlockConstructor", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "Lkotlin/Function3;", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/ParameterName;", "name", "select", "param", "internalResult", "", "Lkotlin/coroutines/CoroutineContext;", "", "Lkotlin/jvm/functions/Function3;", "isLocked", "()Z", "holdsLock", "holdsLockImpl", "", "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lockSuspend", "tryLock", "tryLockImpl", "unlock", "onLock", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnLock$annotations", "()V", "getOnLock", "()Lkotlinx/coroutines/selects/SelectClause2;", "onLockRegFunction", "onLockProcessResult", "result", "toString", "", "CancellableContinuationWithOwner", "SelectInstanceWithOwner", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class VideoEncoderInfo extends dynamicRangeToVideoProfileBitDepth implements VideoEncoderConfig {
    private static final /* synthetic */ AtomicReferenceFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault1 = AtomicReferenceFieldUpdater.newUpdater(VideoEncoderInfo.class, Object.class, "owner$volatile");
    private final Function3<SystemTimeProvider<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private volatile /* synthetic */ Object owner$volatile;

    public VideoEncoderInfo(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : toIllegalArgumentException.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Function3() { // from class: CodecUtil
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return VideoEncoderInfo.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, obj2);
            }
        };
    }

    @Override // defpackage.VideoEncoderConfig
    public boolean isLocked() {
        return b() == 0;
    }

    @Override // defpackage.VideoEncoderConfig
    public boolean holdsLock(Object owner) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(owner) == 1;
    }

    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
        while (isLocked()) {
            Object obj2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(this);
            if (obj2 != toIllegalArgumentException.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    @Override // defpackage.VideoEncoderConfig
    public void unlock(Object owner) {
        while (isLocked()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != toIllegalArgumentException.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                if (obj == owner || owner == null) {
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj, toIllegalArgumentException.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        return;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("This mutex is locked by ");
                    sb.append(obj);
                    sb.append(", but ");
                    sb.append(owner);
                    sb.append(" is expected");
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    @Override // defpackage.VideoEncoderConfig
    public isSizeSupported<Object, VideoEncoderConfig> getOnLock() {
        MutexImpl$onLock$1 mutexImpl$onLock$1 = MutexImpl$onLock$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Intrinsics.checkNotNull(mutexImpl$onLock$1, "");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(mutexImpl$onLock$1, 3);
        MutexImpl$onLock$2 mutexImpl$onLock$2 = MutexImpl$onLock$2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Intrinsics.checkNotNull(mutexImpl$onLock$2, "");
        return new realtimeUs(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(mutexImpl$onLock$2, 3), this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(SystemTimeProvider<?> systemTimeProvider, Object obj) {
        if (obj != null && holdsLock(obj)) {
            systemTimeProvider.b(toIllegalArgumentException.TuitionPaymentFragmentbindingInflater1);
        } else {
            Intrinsics.checkNotNull(systemTimeProvider, "");
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(new b((VideoEncoderConfigBuilder) systemTimeProvider, obj));
        }
    }

    public final Object b(Object obj, Object obj2) {
        if (Intrinsics.areEqual(obj2, toIllegalArgumentException.TuitionPaymentFragmentbindingInflater1)) {
            throw new IllegalStateException("This mutex is already locked by the specified owner: ".concat(String.valueOf(obj)).toString());
        }
        return this;
    }

    final class TuitionPaymentFragmentbindingInflater1 implements MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Unit>, getByteBuffer {
        private CancellableContinuationImpl<Unit> TuitionPaymentFragmentbindingInflater1;
        private Object b;

        @Override // defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk
        public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CoroutineDispatcher coroutineDispatcher, Unit unit) {
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(coroutineDispatcher, unit);
        }

        @Override // defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk
        public final /* synthetic */ Object b(Object obj, Object obj2, Function3 function3) {
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            CancellableContinuationImpl<Unit> cancellableContinuationImpl = this.TuitionPaymentFragmentbindingInflater1;
            final VideoEncoderInfo videoEncoderInfo = VideoEncoderInfo.this;
            Object[] objArr = {cancellableContinuationImpl, (Unit) obj, null, new Function3() { // from class: VideoEncoderInfoImpl
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    return VideoEncoderInfo.TuitionPaymentFragmentbindingInflater1.b(videoEncoderInfo, this);
                }
            }};
            EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0 = (EncoderImplMediaCodecCallbackExternalSyntheticLambda0) CancellableContinuationImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTextOn.TuitionPaymentFragmentbindingInflater1(), 1595944854, getTextOn.TuitionPaymentFragmentbindingInflater1(), objArr, -1595944850, getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1());
            if (encoderImplMediaCodecCallbackExternalSyntheticLambda0 != null) {
                scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                VideoEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(VideoEncoderInfo.this, this.b);
            }
            return encoderImplMediaCodecCallbackExternalSyntheticLambda0;
        }

        @Override // defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk
        public final /* synthetic */ void b(Unit unit, Function1 function1) {
            Unit unit2 = unit;
            CancellableContinuationImpl<Unit> cancellableContinuationImpl = this.TuitionPaymentFragmentbindingInflater1;
            cancellableContinuationImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(unit2, cancellableContinuationImpl.b, function1 != null ? new isVideo(function1) : null);
        }

        @Override // defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk
        public final /* synthetic */ void b(Object obj, Function3 function3) {
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            VideoEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(VideoEncoderInfo.this, this.b);
            CancellableContinuationImpl<Unit> cancellableContinuationImpl = this.TuitionPaymentFragmentbindingInflater1;
            final VideoEncoderInfo videoEncoderInfo = VideoEncoderInfo.this;
            cancellableContinuationImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2((Unit) obj, cancellableContinuationImpl.b, new isVideo(new Function1() { // from class: createCodec
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return VideoEncoderInfo.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(videoEncoderInfo, this);
                }
            }));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TuitionPaymentFragmentbindingInflater1(CancellableContinuationImpl<? super Unit> cancellableContinuationImpl, Object obj) {
            this.TuitionPaymentFragmentbindingInflater1 = cancellableContinuationImpl;
            this.b = obj;
        }

        public static /* synthetic */ Unit b(VideoEncoderInfo videoEncoderInfo, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            VideoEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(videoEncoderInfo, tuitionPaymentFragmentbindingInflater1.b);
            videoEncoderInfo.unlock(tuitionPaymentFragmentbindingInflater1.b);
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(VideoEncoderInfo videoEncoderInfo, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            videoEncoderInfo.unlock(tuitionPaymentFragmentbindingInflater1.b);
            return Unit.INSTANCE;
        }

        @Override // defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk
        public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
            Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1, new isVivoY91i(th, false, 2, null), null, null};
            return (EncoderImplMediaCodecCallbackExternalSyntheticLambda0) CancellableContinuationImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTextOn.TuitionPaymentFragmentbindingInflater1(), 1595944854, getTextOn.TuitionPaymentFragmentbindingInflater1(), objArr, -1595944850, getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1());
        }

        @Override // defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk
        public final boolean TuitionPaymentFragmentbindingInflater1(Throwable th) {
            return this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(th);
        }

        @Override // defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj) {
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj);
        }

        @Override // kotlin.coroutines.Continuation
        /* JADX INFO: renamed from: getContext */
        public final CoroutineContext get$context() {
            return this.TuitionPaymentFragmentbindingInflater1.get$context();
        }

        @Override // defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk
        public final void b(Function1<? super Throwable, Unit> function1) throws Throwable {
            this.TuitionPaymentFragmentbindingInflater1.b(function1);
        }

        @Override // defpackage.getByteBuffer
        public final void b(EncoderImplMediaCodecCallbackExternalSyntheticLambda1<?> encoderImplMediaCodecCallbackExternalSyntheticLambda1, int i) throws Throwable {
            this.TuitionPaymentFragmentbindingInflater1.b(encoderImplMediaCodecCallbackExternalSyntheticLambda1, i);
        }

        @Override // defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk
        public final boolean isActive() {
            return this.TuitionPaymentFragmentbindingInflater1.isActive();
        }

        @Override // defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(Object obj) {
            this.TuitionPaymentFragmentbindingInflater1.resumeWith(obj);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    final class b<Q> implements VideoEncoderConfigBuilder<Q> {
        private VideoEncoderConfigBuilder<Q> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private Object b;

        public b(VideoEncoderConfigBuilder<Q> videoEncoderConfigBuilder, Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = videoEncoderConfigBuilder;
            this.b = obj;
        }

        @Override // defpackage.SystemTimeProvider
        public final boolean TuitionPaymentFragmentbindingInflater1(Object obj, Object obj2) {
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            boolean zTuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(obj, obj2);
            VideoEncoderInfo videoEncoderInfo = VideoEncoderInfo.this;
            if (zTuitionPaymentFragmentbindingInflater1) {
                VideoEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(videoEncoderInfo, this.b);
            }
            return zTuitionPaymentFragmentbindingInflater1;
        }

        @Override // defpackage.SystemTimeProvider
        public final void b(Object obj) {
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            VideoEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(VideoEncoderInfo.this, this.b);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(obj);
        }

        @Override // defpackage.SystemTimeProvider
        public final CoroutineContext TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        @Override // defpackage.getByteBuffer
        public final void b(EncoderImplMediaCodecCallbackExternalSyntheticLambda1<?> encoderImplMediaCodecCallbackExternalSyntheticLambda1, int i) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(encoderImplMediaCodecCallbackExternalSyntheticLambda1, i);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(resolveAudioMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this));
        sb.append("[isLocked=");
        sb.append(isLocked());
        sb.append(",owner=");
        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(this));
        sb.append(']');
        return sb.toString();
    }

    private final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MediaStoreVideoCannotWrite.TuitionPaymentFragmentspecialinlinedviewModeldefault3(IntrinsicsKt.intercepted(continuation));
        try {
            TuitionPaymentFragmentbindingInflater1((MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super Unit>) new TuitionPaymentFragmentbindingInflater1(cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3, obj));
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

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(VideoEncoderInfo videoEncoderInfo, Object obj) {
        videoEncoderInfo.unlock(obj);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Function3 TuitionPaymentFragmentbindingInflater1(final VideoEncoderInfo videoEncoderInfo, final Object obj) {
        return new Function3() { // from class: VideoEncoderDataSpace
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return VideoEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, obj);
            }
        };
    }

    @Override // defpackage.VideoEncoderConfig
    public Object lock(Object obj, Continuation<? super Unit> continuation) {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        return (tryLock(obj) || (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj, continuation)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.VideoEncoderConfig
    public boolean tryLock(Object owner) {
        char c;
        while (true) {
            if (!TuitionPaymentFragmentbindingInflater1()) {
                if (owner != null) {
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(owner);
                    c = 2;
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 1) {
                        break;
                    }
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 2) {
                    }
                }
                c = 1;
                break;
            }
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(this, owner);
            c = 0;
            break;
        }
        if (c == 0) {
            return true;
        }
        if (c == 1) {
            return false;
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: ".concat(String.valueOf(owner)).toString());
    }
}
