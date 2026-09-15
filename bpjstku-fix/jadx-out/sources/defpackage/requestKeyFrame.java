package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class requestKeyFrame<E> extends EncoderImplMediaCodecCallbackExternalSyntheticLambda1<requestKeyFrame<E>> {
    final /* synthetic */ AtomicReferenceArray TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final EncodeExceptionErrorType<E> b;

    public requestKeyFrame(long j, requestKeyFrame<E> requestkeyframe, EncodeExceptionErrorType<E> encodeExceptionErrorType, int i) {
        super(j, requestkeyframe, i);
        this.b = encodeExceptionErrorType;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AtomicReferenceArray(EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * 2);
    }

    @Override // defpackage.EncoderImplMediaCodecCallbackExternalSyntheticLambda1
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.EncoderImplMediaCodecCallbackExternalSyntheticLambda1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, CoroutineContext coroutineContext) {
        UndeliveredElementException undeliveredElementExceptionB;
        UndeliveredElementException undeliveredElementExceptionB2;
        boolean z = i >= EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (z) {
            i -= EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int i2 = i * 2;
        Object obj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i2);
        while (true) {
            int i3 = i2 + 1;
            Object obj2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i3);
            if ((obj2 instanceof getByteBuffer) || (obj2 instanceof r8lambdaSlAnbggd9lEp59VusripYrYneuw)) {
                EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0 = z ? EncodedData.asInterface : EncodedData.f134a;
                AtomicReferenceArray atomicReferenceArray = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                do {
                    if (atomicReferenceArray.compareAndSet(i3, obj2, encoderImplMediaCodecCallbackExternalSyntheticLambda0)) {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i2, null);
                        if (!z) {
                            EncodeExceptionErrorType<E> encodeExceptionErrorType = this.b;
                            Intrinsics.checkNotNull(encodeExceptionErrorType);
                            encodeExceptionErrorType.TuitionPaymentFragmentspecialinlinedviewModeldefault1((this.f136a * ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) + ((long) i));
                        }
                        if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.incrementAndGet(this) == TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                            asInterface();
                        }
                        if (z) {
                            EncodeExceptionErrorType<E> encodeExceptionErrorType2 = this.b;
                            Intrinsics.checkNotNull(encodeExceptionErrorType2);
                            Function1<E, Unit> function1 = encodeExceptionErrorType2.TuitionPaymentFragmentbindingInflater1;
                            if (function1 == null || (undeliveredElementExceptionB = lambdareachEndData2androidxcameravideointernalencoderEncoderImplMediaCodecCallback.b(function1, obj, null)) == null) {
                                return;
                            }
                            AudioConfigUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineContext, undeliveredElementExceptionB);
                            return;
                        }
                        return;
                    }
                } while (atomicReferenceArray.get(i3) == obj2);
            } else {
                if (obj2 == EncodedData.asInterface || obj2 == EncodedData.f134a) {
                    break;
                }
                if (obj2 != EncodedData.INotificationSideChannelStubProxy && obj2 != EncodedData.INotificationSideChannelDefault) {
                    if (obj2 != EncodedData.d && obj2 != EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && obj2 != EncodedData.INotificationSideChannelDefault()) {
                        throw new IllegalStateException("unexpected state: ".concat(String.valueOf(obj2)).toString());
                    }
                    return;
                }
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i2, null);
        if (z) {
            EncodeExceptionErrorType<E> encodeExceptionErrorType3 = this.b;
            Intrinsics.checkNotNull(encodeExceptionErrorType3);
            Function1<E, Unit> function2 = encodeExceptionErrorType3.TuitionPaymentFragmentbindingInflater1;
            if (function2 == null || (undeliveredElementExceptionB2 = lambdareachEndData2androidxcameravideointernalencoderEncoderImplMediaCodecCallback.b(function2, obj, null)) == null) {
                return;
            }
            AudioConfigUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineContext, undeliveredElementExceptionB2);
        }
    }
}
