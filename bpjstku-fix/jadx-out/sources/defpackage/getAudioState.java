package defpackage;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes5.dex */
public final class getAudioState {
    public AutoValue_AudioSpecBuilder INotificationSideChannel;
    public getErrorCause TuitionPaymentFragmentbindingInflater1;
    public hasError TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public AutoValue_AudioSpec TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AutoValue_FallbackStrategy_RuleStrategy f910a;
    public getFallbackQuality asBinder;
    public hasAudio asInterface;
    public int b;
    public int d;
    public AutoValue_AudioSpec1 g;
    public AutoValue_AudioStats notify;
    public AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal1 onTransact;

    public getAudioState(AudioStats audioStats) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AutoValue_AudioSpec(paint, audioStats);
        this.TuitionPaymentFragmentbindingInflater1 = new getErrorCause(paint, audioStats);
        this.f910a = new AutoValue_FallbackStrategy_RuleStrategy(paint, audioStats);
        this.onTransact = new AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal1(paint, audioStats);
        this.g = new AutoValue_AudioSpec1(paint, audioStats);
        this.asInterface = new hasAudio(paint, audioStats);
        this.INotificationSideChannel = new AutoValue_AudioSpecBuilder(paint, audioStats);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new hasError(paint, audioStats);
        this.notify = new AutoValue_AudioStats(paint, audioStats);
        this.asBinder = new getFallbackQuality(paint, audioStats);
    }
}
