package defpackage;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AudioEncoderIgnoresInputTimestampQuirk<T, R> implements AudioSettings<T>, autoBuild<R> {
    public boolean TuitionPaymentFragmentbindingInflater1;
    public final AudioSettings<? super R> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public autoBuild<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private OutputTransform b;

    public AudioEncoderIgnoresInputTimestampQuirk(AudioSettings<? super R> audioSettings) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = audioSettings;
    }

    @Override // defpackage.VideoRecordEventPause, defpackage.AudioConfig
    public final void b(OutputTransform outputTransform) {
        if (SubscriptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, outputTransform)) {
            this.b = outputTransform;
            if (outputTransform instanceof autoBuild) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (autoBuild) outputTransform;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(this);
        }
    }

    @Override // defpackage.AudioConfig
    public void onError(Throwable th) {
        if (this.TuitionPaymentFragmentbindingInflater1) {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        } else {
            this.TuitionPaymentFragmentbindingInflater1 = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
        }
    }

    protected final void b(Throwable th) {
        dumpMediaCodecListForFormat.b(th);
        this.b.b();
        onError(th);
    }

    @Override // defpackage.AudioConfig
    public void onComplete() {
        if (this.TuitionPaymentFragmentbindingInflater1) {
            return;
        }
        this.TuitionPaymentFragmentbindingInflater1 = true;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onComplete();
    }

    protected final int TuitionPaymentFragmentbindingInflater1(int i) {
        autoBuild<T> autobuild = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (autobuild == null || (i & 4) != 0) {
            return 0;
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = autobuild.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 != 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        return iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.OutputTransform
    public final void b(long j) {
        this.b.b(j);
    }

    @Override // defpackage.OutputTransform
    public final void b() {
        this.b.b();
    }

    @Override // defpackage.AudioSettingsBuilder
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // defpackage.AudioSettingsBuilder
    public final void TuitionPaymentFragmentbindingInflater1() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
    }

    @Override // defpackage.AudioSettingsBuilder
    public final boolean TuitionPaymentFragmentbindingInflater1(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
