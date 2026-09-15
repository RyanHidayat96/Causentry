package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AutoValue_AudioMimeInfo extends AutoValue_AudioMimeInfoBuilder {
    protected abstract Thread TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    protected final void onTransact() {
        Thread threadTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (Thread.currentThread() != threadTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            LockSupport.unpark(threadTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    }

    protected void TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, AutoValue_AudioMimeInfo1.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        resolveAudioSettings.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(j, tuitionPaymentFragmentbindingInflater1);
    }
}
