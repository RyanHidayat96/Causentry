package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes4.dex */
final class lambdaaddObserver7androidxcameravideointernalencoderEncoderImplByteBufferInput extends lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl<Integer> implements stopMediaCodec<Integer> {
    public lambdaaddObserver7androidxcameravideointernalencoderEncoderImplByteBufferInput(int i) {
        super(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.stopMediaCodec
    /* JADX INFO: renamed from: INotificationSideChannel, reason: merged with bridge method [inline-methods] */
    public Integer TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int iIntValue;
        synchronized (this) {
            iIntValue = asInterface().intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        synchronized (this) {
            zTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer.valueOf(asInterface().intValue() + i));
        }
        return zTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }
}
