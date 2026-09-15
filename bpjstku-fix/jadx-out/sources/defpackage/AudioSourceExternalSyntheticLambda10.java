package defpackage;

import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.BlockingObserver;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSourceExternalSyntheticLambda10 {
    public static <T> void b(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy, deriveMediaType<? super T> derivemediatype) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        BlockingObserver blockingObserver = new BlockingObserver(linkedBlockingQueue);
        derivemediatype.onSubscribe(blockingObserver);
        autoValue_VideoValidatedEncoderProfilesProxy.subscribe(blockingObserver);
        while (!blockingObserver.isDisposed()) {
            Object objPoll = linkedBlockingQueue.poll();
            if (objPoll == null) {
                try {
                    objPoll = linkedBlockingQueue.take();
                } catch (InterruptedException e2) {
                    blockingObserver.dispose();
                    derivemediatype.onError(e2);
                    return;
                }
            }
            if (blockingObserver.isDisposed() || objPoll == BlockingObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2 || NotificationLite.b(objPoll, derivemediatype)) {
                return;
            }
        }
    }

    public static <T> void TuitionPaymentFragmentspecialinlinedviewModeldefault2(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy, logToString<? super T> logtostring, logToString<? super Throwable> logtostring2, formatInterval formatinterval) {
        share.b(logtostring, "onNext is null");
        share.b(logtostring2, "onError is null");
        share.b(formatinterval, "onComplete is null");
        b(autoValue_VideoValidatedEncoderProfilesProxy, new LambdaObserver(logtostring, logtostring2, formatinterval, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3()));
    }
}
