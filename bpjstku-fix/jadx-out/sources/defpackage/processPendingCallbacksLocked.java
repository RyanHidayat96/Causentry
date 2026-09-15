package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class processPendingCallbacksLocked<K, A> extends binderDied<K, A> {
    private final onSkipToQueueItem<A> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f1328a;

    @Override // defpackage.binderDied
    final float TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return 1.0f;
    }

    public processPendingCallbacksLocked(MediaSessionCompatCallbackCallbackHandler<A> mediaSessionCompatCallbackCallbackHandler) {
        this(mediaSessionCompatCallbackCallbackHandler, null);
    }

    public processPendingCallbacksLocked(MediaSessionCompatCallbackCallbackHandler<A> mediaSessionCompatCallbackCallbackHandler, A a2) {
        super(Collections.emptyList());
        this.TuitionPaymentFragmentbindingInflater1 = new onSkipToQueueItem<>();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaSessionCompatCallbackCallbackHandler);
        this.f1328a = a2;
    }

    @Override // defpackage.binderDied
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(float f) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = f;
    }

    @Override // defpackage.binderDied
    public final void asBinder() {
        if (this.b != null) {
            super.asBinder();
        }
    }

    @Override // defpackage.binderDied
    public final A asInterface() {
        MediaSessionCompatCallbackCallbackHandler<A> mediaSessionCompatCallbackCallbackHandler = this.b;
        b();
        b();
        b();
        onSkipToQueueItem<A> onskiptoqueueitem = mediaSessionCompatCallbackCallbackHandler.b;
        return mediaSessionCompatCallbackCallbackHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.binderDied
    final A TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSkipToNext<K> onskiptonext, float f) {
        MediaSessionCompatCallbackCallbackHandler<A> mediaSessionCompatCallbackCallbackHandler = this.b;
        b();
        b();
        b();
        onSkipToQueueItem<A> onskiptoqueueitem = mediaSessionCompatCallbackCallbackHandler.b;
        return mediaSessionCompatCallbackCallbackHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }
}
