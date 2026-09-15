package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes5.dex */
public final class MediaControllerCompatApi21TransportControls implements toLegacyStreamType {
    public final boolean TuitionPaymentFragmentbindingInflater1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final MediaControllerCompatApi21<PointF, PointF> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MediaControllerCompatTransportControlsBase TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final boolean b;

    public MediaControllerCompatApi21TransportControls(String str, MediaControllerCompatApi21<PointF, PointF> mediaControllerCompatApi21, MediaControllerCompatTransportControlsBase mediaControllerCompatTransportControlsBase, boolean z, boolean z2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mediaControllerCompatApi21;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mediaControllerCompatTransportControlsBase;
        this.TuitionPaymentFragmentbindingInflater1 = z;
        this.b = z2;
    }

    @Override // defpackage.toLegacyStreamType
    public final setRepeatMode TuitionPaymentFragmentspecialinlinedviewModeldefault2(prepare prepareVar, fromMediaSession frommediasession) {
        return new IMediaSessionStub(prepareVar, frommediasession, this);
    }
}
