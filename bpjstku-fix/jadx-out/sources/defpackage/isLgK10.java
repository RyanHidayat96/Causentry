package defpackage;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes7.dex */
public abstract class isLgK10<T, R> implements VideoRecordEventPause<T>, autoBuild<R> {
    private OutputTransform TuitionPaymentFragmentbindingInflater1;
    public autoBuild<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final AudioConfig<? super R> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public int b;

    public isLgK10(AudioConfig<? super R> audioConfig) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = audioConfig;
    }

    @Override // defpackage.VideoRecordEventPause, defpackage.AudioConfig
    public final void b(OutputTransform outputTransform) {
        if (SubscriptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, outputTransform)) {
            this.TuitionPaymentFragmentbindingInflater1 = outputTransform;
            if (outputTransform instanceof autoBuild) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (autoBuild) outputTransform;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(this);
        }
    }

    @Override // defpackage.AudioConfig
    public void onError(Throwable th) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(th);
        }
    }

    protected final void TuitionPaymentFragmentbindingInflater1(Throwable th) {
        dumpMediaCodecListForFormat.b(th);
        this.TuitionPaymentFragmentbindingInflater1.b();
        onError(th);
    }

    @Override // defpackage.AudioConfig
    public void onComplete() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onComplete();
    }

    protected final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        autoBuild<T> autobuild = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (autobuild == null || (i & 4) != 0) {
            return 0;
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = autobuild.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 != 0) {
            this.b = iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        return iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.OutputTransform
    public final void b(long j) {
        this.TuitionPaymentFragmentbindingInflater1.b(j);
    }

    @Override // defpackage.OutputTransform
    public final void b() {
        this.TuitionPaymentFragmentbindingInflater1.b();
    }

    @Override // defpackage.AudioSettingsBuilder
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // defpackage.AudioSettingsBuilder
    public final void TuitionPaymentFragmentbindingInflater1() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
    }

    @Override // defpackage.AudioSettingsBuilder
    public final boolean TuitionPaymentFragmentbindingInflater1(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
