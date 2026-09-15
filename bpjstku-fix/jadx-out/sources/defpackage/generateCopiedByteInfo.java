package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00110\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"LgenerateCopiedByteInfo;", ExifInterface.GPS_DIRECTION_TRUE, "LonOutputBufferAvailable;", "Lkotlin/coroutines/CoroutineContext;", "p0", "Lkotlin/coroutines/Continuation;", "p1", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "", "g", "()Z", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/Object;)V", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/ThreadLocal;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "threadLocalIsSet", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class generateCopiedByteInfo<T> extends onOutputBufferAvailable<T> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    final ThreadLocal<Pair<CoroutineContext, Object>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    volatile boolean threadLocalIsSet;

    public generateCopiedByteInfo(CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        super(coroutineContext.get(getBufferInfo.INSTANCE) == null ? coroutineContext.plus(getBufferInfo.INSTANCE) : coroutineContext, continuation);
        ThreadLocal<Pair<CoroutineContext, Object>> threadLocal = new ThreadLocal<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = threadLocal;
        if (continuation.getContext().get(ContinuationInterceptor.INSTANCE) instanceof CoroutineDispatcher) {
            return;
        }
        Object objTuitionPaymentFragmentbindingInflater1 = EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1(coroutineContext, null);
        EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineContext, objTuitionPaymentFragmentbindingInflater1);
        this.threadLocalIsSet = true;
        threadLocal.set(TuplesKt.to(coroutineContext, objTuitionPaymentFragmentbindingInflater1));
    }

    public final boolean g() {
        boolean z = this.threadLocalIsSet && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get() == null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remove();
        return !z;
    }

    @Override // defpackage.onOutputBufferAvailable, defpackage.isFHDProblematicDevice
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object p0) {
        if (this.threadLocalIsSet) {
            Pair<CoroutineContext, Object> pair = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get();
            if (pair != null) {
                EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(pair.component1(), pair.component2());
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remove();
        }
        Object objTuitionPaymentFragmentbindingInflater1 = SignalEosOutputBufferNotComeQuirk.TuitionPaymentFragmentbindingInflater1(p0, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Continuation<T> continuation = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        CoroutineContext coroutineContext = continuation.getContext();
        Object objTuitionPaymentFragmentbindingInflater2 = EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1(coroutineContext, null);
        generateCopiedByteInfo<?> generatecopiedbyteinfoTuitionPaymentFragmentspecialinlinedviewModeldefault3 = objTuitionPaymentFragmentbindingInflater2 != EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? VideoEncoderCrashQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Continuation<?>) continuation, coroutineContext, objTuitionPaymentFragmentbindingInflater2) : null;
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.resumeWith(objTuitionPaymentFragmentbindingInflater1);
            Unit unit = Unit.INSTANCE;
            if (generatecopiedbyteinfoTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null || generatecopiedbyteinfoTuitionPaymentFragmentspecialinlinedviewModeldefault3.g()) {
            }
        } finally {
            if (generatecopiedbyteinfoTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null || generatecopiedbyteinfoTuitionPaymentFragmentspecialinlinedviewModeldefault3.g()) {
                EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineContext, objTuitionPaymentFragmentbindingInflater2);
            }
        }
    }
}
