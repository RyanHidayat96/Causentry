package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
final class EncoderCallback<E> extends getConfiguredBitrate<E> implements onEncodePaused<E> {
    @Override // defpackage.isFHDProblematicDevice
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Unit unit) {
        g().a_(null);
    }

    public EncoderCallback(CoroutineContext coroutineContext, Encoder<E> encoder) {
        super(coroutineContext, encoder);
    }

    @Override // defpackage.isFHDProblematicDevice, defpackage.AudioEncoderConfigBuilder, defpackage.VideoMimeInfoBuilder
    public final boolean r_() {
        return super.r_();
    }

    @Override // defpackage.isFHDProblematicDevice
    public final void b(Throwable th, boolean z) {
        if (g().a_(th) || z) {
            return;
        }
        AudioConfigUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault3(get$context(), th);
    }

    @Override // defpackage.onEncodePaused
    public final /* synthetic */ EncoderSurfaceInputOnSurfaceUpdateListener INotificationSideChannelStubProxy() {
        return this;
    }
}
