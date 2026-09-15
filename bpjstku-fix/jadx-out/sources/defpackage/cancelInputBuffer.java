package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"LcancelInputBuffer;", ExifInterface.GPS_DIRECTION_TRUE, "LaddSignalEosTimeoutIfNeeded;", "LEncoderSurfaceInputOnSurfaceUpdateListener;", "p0", "<init>", "(LEncoderSurfaceInputOnSurfaceUpdateListener;)V", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LEncoderSurfaceInputOnSurfaceUpdateListener;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class cancelInputBuffer<T> implements addSignalEosTimeoutIfNeeded<T> {
    public static int TuitionPaymentFragmentbindingInflater1 = 270396025;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final EncoderSurfaceInputOnSurfaceUpdateListener<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX WARN: Multi-variable type inference failed */
    public cancelInputBuffer(EncoderSurfaceInputOnSurfaceUpdateListener<? super T> encoderSurfaceInputOnSurfaceUpdateListener) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = encoderSurfaceInputOnSurfaceUpdateListener;
    }

    @Override // defpackage.addSignalEosTimeoutIfNeeded
    public final Object emit(T t, Continuation<? super Unit> continuation) {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(t, continuation);
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault1 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTuitionPaymentFragmentspecialinlinedviewModeldefault1 : Unit.INSTANCE;
    }
}
