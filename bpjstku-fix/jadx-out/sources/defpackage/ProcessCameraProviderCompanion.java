package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ProcessCameraProviderCompanion implements getInstancelambda0.TuitionPaymentFragmentbindingInflater1 {
    public ProcessCameraProviderExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public AudioSpecChannelCount TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        void b();
    }

    public ProcessCameraProviderCompanion(TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        AudioSpecChannelCount audioSpecChannelCount = new AudioSpecChannelCount();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = audioSpecChannelCount;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ProcessCameraProviderExternalSyntheticLambda1(audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this);
    }

    @Override // getInstancelambda0.TuitionPaymentFragmentbindingInflater1
    public final void b(ProcessCameraProviderCompanionExternalSyntheticLambda0 processCameraProviderCompanionExternalSyntheticLambda0) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = processCameraProviderCompanionExternalSyntheticLambda0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.b();
        }
    }
}
