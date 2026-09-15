package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes5.dex */
public final class MediaControllerCompatApi23TransportControls implements toLegacyStreamType {
    public final MediaControllerCompatApi21<PointF, PointF> TuitionPaymentFragmentbindingInflater1;
    public final getVolumeControl TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MediaControllerCompatTransportControlsBase TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final boolean b;

    public MediaControllerCompatApi23TransportControls(String str, MediaControllerCompatApi21<PointF, PointF> mediaControllerCompatApi21, MediaControllerCompatTransportControlsBase mediaControllerCompatTransportControlsBase, getVolumeControl getvolumecontrol, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.TuitionPaymentFragmentbindingInflater1 = mediaControllerCompatApi21;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mediaControllerCompatTransportControlsBase;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getvolumecontrol;
        this.b = z;
    }

    @Override // defpackage.toLegacyStreamType
    public final setRepeatMode TuitionPaymentFragmentspecialinlinedviewModeldefault2(prepare prepareVar, fromMediaSession frommediasession) {
        return new getTransportControls(prepareVar, frommediasession, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RectangleShape{position=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(", size=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append('}');
        return sb.toString();
    }
}
