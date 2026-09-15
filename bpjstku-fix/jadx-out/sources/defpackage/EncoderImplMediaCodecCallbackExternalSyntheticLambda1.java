package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.EncoderImplMediaCodecCallbackExternalSyntheticLambda1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u0013\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0014J\r\u0010\u0015\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0016J\"\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0006\u0010\u001e\u001a\u00020\u0018R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\t\u0010\u000e\u001a\u00020\u000fX\u0082\u0004R\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/internal/Segment;", ExifInterface.LATITUDE_SOUTH, "Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "Lkotlinx/coroutines/NotCompleted;", "id", "", "prev", "pointers", "", "<init>", "(JLkotlinx/coroutines/internal/Segment;I)V", "numberOfSlots", "getNumberOfSlots", "()I", "cleanedAndPointers", "Lkotlinx/atomicfu/AtomicInt;", "isRemoved", "", "()Z", "tryIncPointers", "tryIncPointers$kotlinx_coroutines_core", "decPointers", "decPointers$kotlinx_coroutines_core", "onCancellation", "", FirebaseAnalytics.Param.INDEX, "cause", "", "context", "Lkotlin/coroutines/CoroutineContext;", "onSlotCleaned", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EncoderImplMediaCodecCallbackExternalSyntheticLambda1<S extends EncoderImplMediaCodecCallbackExternalSyntheticLambda1<S>> extends lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput<S> implements AutoValue_VideoEncoderConfig {
    public static final /* synthetic */ AtomicIntegerFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault2 = AtomicIntegerFieldUpdater.newUpdater(EncoderImplMediaCodecCallbackExternalSyntheticLambda1.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f136a;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public abstract int TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    public abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, CoroutineContext coroutineContext);

    public EncoderImplMediaCodecCallbackExternalSyntheticLambda1(long j, S s, int i) {
        super(s);
        this.f136a = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(this) == TuitionPaymentFragmentspecialinlinedviewModeldefault2() && !TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    public final boolean a() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i == TuitionPaymentFragmentspecialinlinedviewModeldefault2() && !TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
