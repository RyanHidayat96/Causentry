package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0016J)\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u001bj\u0002`\u001a2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u001cJ!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0019\u001a\u00060\u001bj\u0002`\u001aH\u0016¢\u0006\u0002\u0010\u001fJ\u001e\u0010 \u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0016J\b\u0010$\u001a\u00020\u001eH\u0002J\b\u0010%\u001a\u00020\u0006H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006&"}, d2 = {"Lkotlinx/coroutines/internal/MissingMainCoroutineDispatcher;", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "cause", "", "errorHint", "", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "immediate", "getImmediate", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "isDispatchNeeded", "", "context", "Lkotlin/coroutines/CoroutineContext;", "limitedParallelism", "Lkotlinx/coroutines/CoroutineDispatcher;", "parallelism", "", "name", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "block", "Lkotlinx/coroutines/Runnable;", "Ljava/lang/Runnable;", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/DisposableHandle;", "dispatch", "", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)Ljava/lang/Void;", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "missing", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class onInputBufferAvailable extends setInputTimebase implements selectSampleRateOrNearestSupported {
    private final Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final String b;

    public /* synthetic */ onInputBufferAvailable(Throwable th, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? null : str);
    }

    public onInputBufferAvailable(Throwable th, String str) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = th;
        this.b = str;
    }

    @Override // defpackage.setInputTimebase
    public final setInputTimebase TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(CoroutineContext context) {
        b();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.setInputTimebase, kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int parallelism, String name) {
        b();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.selectSampleRateOrNearestSupported
    public final setCompatibleAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, Runnable runnable, CoroutineContext coroutineContext) {
        b();
        throw new KotlinNothingValueException();
    }

    private final Void b() {
        String strConcat;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            StringBuilder sb = new StringBuilder("Module with the Main dispatcher had failed to initialize");
            String str = this.b;
            if (str == null || (strConcat = ". ".concat(String.valueOf(str))) == null) {
                strConcat = "";
            }
            sb.append(strConcat);
            throw new IllegalStateException(sb.toString(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @Override // defpackage.setInputTimebase, kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder("Dispatchers.Main[missing");
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            StringBuilder sb2 = new StringBuilder(", cause=");
            sb2.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            string = sb2.toString();
        } else {
            string = "";
        }
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final /* synthetic */ void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        b();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.selectSampleRateOrNearestSupported
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, MediaFormatMustNotUseFrameRateToFindEncoderQuirk mediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
        b();
        throw new KotlinNothingValueException();
    }
}
