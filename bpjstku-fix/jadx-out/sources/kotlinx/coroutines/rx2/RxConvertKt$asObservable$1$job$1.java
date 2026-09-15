package kotlinx.coroutines.rx2;

import defpackage.AudioConfigUtil;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.addSignalEosTimeoutIfNeeded;
import defpackage.clampVideoBitrateIfNotSupported;
import defpackage.getDefaultAudioProfile;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1", f = "RxConvert.kt", i = {0}, l = {110}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class RxConvertKt$asObservable$1$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ getDefaultAudioProfile<T> $emitter;
    final /* synthetic */ clampVideoBitrateIfNotSupported<T> $this_asObservable;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Throwable th;
        boolean z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            try {
                clampVideoBitrateIfNotSupported<T> clampvideobitrateifnotsupported = this.$this_asObservable;
                final getDefaultAudioProfile<T> getdefaultaudioprofile = this.$emitter;
                addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded = new addSignalEosTimeoutIfNeeded() { // from class: kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1.2
                    @Override // defpackage.addSignalEosTimeoutIfNeeded
                    public final Object emit(T t, Continuation<? super Unit> continuation) {
                        getdefaultaudioprofile.TuitionPaymentFragmentbindingInflater1(t);
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = coroutineScope2;
                this.label = 1;
                if (clampvideobitrateifnotsupported.collect((addSignalEosTimeoutIfNeeded<? super T>) addsignaleostimeoutifneeded, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
            } catch (Throwable th2) {
                coroutineScope = coroutineScope2;
                th = th2;
                z = th instanceof CancellationException;
                if (!z) {
                    if (!this.$emitter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th)) {
                        CoroutineContext coroutineContext = coroutineScope.getCoroutineContext();
                        if (!z) {
                            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                        }
                    }
                } else {
                    this.$emitter.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                z = th instanceof CancellationException;
                if (!z) {
                    if (!this.$emitter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th)) {
                        CoroutineContext coroutineContext2 = coroutineScope.getCoroutineContext();
                        if (!z) {
                            try {
                                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                            } catch (Throwable th4) {
                                ExceptionsKt.addSuppressed(th, th4);
                                AudioConfigUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineContext2, th);
                            }
                        }
                    }
                } else {
                    this.$emitter.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
            }
        }
        this.$emitter.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RxConvertKt$asObservable$1$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RxConvertKt$asObservable$1$job$1(clampVideoBitrateIfNotSupported<? extends T> clampvideobitrateifnotsupported, getDefaultAudioProfile<T> getdefaultaudioprofile, Continuation<? super RxConvertKt$asObservable$1$job$1> continuation) {
        super(2, continuation);
        this.$this_asObservable = clampvideobitrateifnotsupported;
        this.$emitter = getdefaultaudioprofile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RxConvertKt$asObservable$1$job$1 rxConvertKt$asObservable$1$job$1 = new RxConvertKt$asObservable$1$job$1(this.$this_asObservable, this.$emitter, continuation);
        rxConvertKt$asObservable$1$job$1.L$0 = obj;
        return rxConvertKt$asObservable$1$job$1;
    }
}
