package defpackage;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000e\u000fB\u001d\u0012\u0014\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0086@¢\u0006\u0002\u0010\rR\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\t\u0010\t\u001a\u00020\nX\u0082\u0004¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/AwaitAll;", ExifInterface.GPS_DIRECTION_TRUE, "", "deferreds", "", "Lkotlinx/coroutines/Deferred;", "<init>", "([Lkotlinx/coroutines/Deferred;)V", "[Lkotlinx/coroutines/Deferred;", "notCompletedCount", "Lkotlinx/atomicfu/AtomicInt;", "await", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DisposeHandlersOnCancel", "AwaitAllNode", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class isX230<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault2 = AtomicIntegerFieldUpdater.newUpdater(isX230.class, "notCompletedCount$volatile");
    private final Deferred<T>[] TuitionPaymentFragmentbindingInflater1;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public isX230(Deferred<? extends T>[] deferredArr) {
        this.TuitionPaymentFragmentbindingInflater1 = deferredArr;
        this.notCompletedCount$volatile = deferredArr.length;
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements isAvc {
        private final isX230<T>.TuitionPaymentFragmentspecialinlinedviewModeldefault2[] TuitionPaymentFragmentbindingInflater1;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(isX230<T>.TuitionPaymentFragmentspecialinlinedviewModeldefault2[] tuitionPaymentFragmentspecialinlinedviewModeldefault2Arr) {
            this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2Arr;
        }

        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            for (isX230<T>.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 : this.TuitionPaymentFragmentbindingInflater1) {
                setCompatibleAudioProfile setcompatibleaudioprofile = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (setcompatibleaudioprofile == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    setcompatibleaudioprofile = null;
                }
                setcompatibleaudioprofile.dispose();
            }
        }

        @Override // defpackage.isAvc
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DisposeHandlersOnCancel[");
            sb.append(this.TuitionPaymentFragmentbindingInflater1);
            sb.append(']');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0018\u00010\u000fR\b\u0012\u0004\u0012\u00028\u00000\u00100\u000eX\u0082\u0004R<\u0010\u0012\u001a\u000e\u0018\u00010\u000fR\b\u0012\u0004\u0012\u00028\u00000\u00102\u0012\u0010\u0011\u001a\u000e\u0018\u00010\u000fR\b\u0012\u0004\u0012\u00028\u00000\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "Lkotlinx/coroutines/JobNode;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "<init>", "(Lkotlinx/coroutines/AwaitAll;Lkotlinx/coroutines/CancellableContinuation;)V", "handle", "Lkotlinx/coroutines/DisposableHandle;", "getHandle", "()Lkotlinx/coroutines/DisposableHandle;", "setHandle", "(Lkotlinx/coroutines/DisposableHandle;)V", "_disposer", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "Lkotlinx/coroutines/AwaitAll;", "value", "disposer", "getDisposer", "()Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "setDisposer", "(Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;)V", "onCancelling", "", "getOnCancelling", "()Z", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends getInputTimebase {
        private static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(TuitionPaymentFragmentspecialinlinedviewModeldefault2.class, Object.class, "_disposer$volatile");
        public setCompatibleAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final MediaFormatMustNotUseFrameRateToFindEncoderQuirk<List<? extends T>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private volatile /* synthetic */ Object _disposer$volatile;

        @Override // defpackage.getInputTimebase
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super List<? extends T>> mediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mediaFormatMustNotUseFrameRateToFindEncoderQuirk;
        }

        @Override // defpackage.getInputTimebase
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) {
            if (th != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) b.get(this);
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        return;
                    }
                    return;
                }
                return;
            }
            if (isX230.TuitionPaymentFragmentspecialinlinedviewModeldefault2.decrementAndGet(isX230.this) == 0) {
                MediaFormatMustNotUseFrameRateToFindEncoderQuirk<List<? extends T>> mediaFormatMustNotUseFrameRateToFindEncoderQuirk = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                Deferred[] deferredArr = ((isX230) isX230.this).TuitionPaymentFragmentbindingInflater1;
                ArrayList arrayList = new ArrayList(deferredArr.length);
                for (Deferred deferred : deferredArr) {
                    arrayList.add(deferred.b());
                }
                Result.Companion companion = Result.INSTANCE;
                mediaFormatMustNotUseFrameRateToFindEncoderQuirk.resumeWith(Result.m8024constructorimpl(arrayList));
            }
        }
    }
}
