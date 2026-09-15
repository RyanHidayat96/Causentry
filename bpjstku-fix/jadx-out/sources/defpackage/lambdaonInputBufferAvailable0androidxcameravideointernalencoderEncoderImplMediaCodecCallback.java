package defpackage;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"LlambdaonInputBufferAvailable0androidxcameravideointernalencoderEncoderImplMediaCodecCallback;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "p0", "<init>", "(I)V", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(ILjava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "array", "Ljava/util/concurrent/atomic/AtomicReferenceArray;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdaonInputBufferAvailable0androidxcameravideointernalencoderEncoderImplMediaCodecCallback<T> {
    public volatile AtomicReferenceArray<T> array;

    public lambdaonInputBufferAvailable0androidxcameravideointernalencoderEncoderImplMediaCodecCallback(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int p0, T p1) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (p0 < length) {
            atomicReferenceArray.set(p0, p1);
            return;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(RangesKt.coerceAtLeast(p0 + 1, length * 2));
        for (int i = 0; i < length; i++) {
            atomicReferenceArray2.set(i, atomicReferenceArray.get(i));
        }
        atomicReferenceArray2.set(p0, p1);
        this.array = atomicReferenceArray2;
    }
}
