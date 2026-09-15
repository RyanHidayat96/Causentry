package defpackage;

import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class unregisterAudioRecordingCallback extends appendBackupVideoProfile {
    private static final RxThreadFactory TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    private ThreadFactory TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public unregisterAudioRecordingCallback() {
        this(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    private unregisterAudioRecordingCallback(ThreadFactory threadFactory) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = threadFactory;
    }

    @Override // defpackage.appendBackupVideoProfile
    public final appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new registerAudioRecordingCallback(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }
}
