package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class lambdastart2androidxcameravideointernalaudioAudioSource<R, T> extends lambdasetAudioSourceCallback6androidxcameravideointernalaudioAudioSource<T, R> {
    private VideoRecordEventFinalizeVideoRecordError<? extends R, ? super T> TuitionPaymentFragmentbindingInflater1;

    public lambdastart2androidxcameravideointernalaudioAudioSource(VideoRecordEvent<T> videoRecordEvent, VideoRecordEventFinalizeVideoRecordError<? extends R, ? super T> videoRecordEventFinalizeVideoRecordError) {
        super(videoRecordEvent);
        this.TuitionPaymentFragmentbindingInflater1 = videoRecordEventFinalizeVideoRecordError;
    }

    @Override // defpackage.VideoRecordEvent
    public final void TuitionPaymentFragmentbindingInflater1(AudioConfig<? super R> audioConfig) {
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(audioConfig));
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
