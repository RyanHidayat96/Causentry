package defpackage;

import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class MediaControllerCompatApi21PlaybackInfo implements toLegacyStreamType {
    public final getVolumeControl TuitionPaymentFragmentbindingInflater1;
    public final MediaControllerCompatTransportControlsBase TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final skipToNext TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final GradientType TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f174a;
    public final boolean asBinder;
    public final ShapeStroke.LineJoinType asInterface;
    public final ShapeStroke.LineCapType b;
    public final getVolumeControl cancelAll;
    public final List<getVolumeControl> d;
    public final float g;
    public final MediaControllerCompatTransportControlsBase notify;
    public final setRating onTransact;

    public MediaControllerCompatApi21PlaybackInfo(String str, GradientType gradientType, skipToNext skiptonext, setRating setrating, MediaControllerCompatTransportControlsBase mediaControllerCompatTransportControlsBase, MediaControllerCompatTransportControlsBase mediaControllerCompatTransportControlsBase2, getVolumeControl getvolumecontrol, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f, List<getVolumeControl> list, getVolumeControl getvolumecontrol2, boolean z) {
        this.f174a = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = gradientType;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = skiptonext;
        this.onTransact = setrating;
        this.notify = mediaControllerCompatTransportControlsBase;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mediaControllerCompatTransportControlsBase2;
        this.cancelAll = getvolumecontrol;
        this.b = lineCapType;
        this.asInterface = lineJoinType;
        this.g = f;
        this.d = list;
        this.TuitionPaymentFragmentbindingInflater1 = getvolumecontrol2;
        this.asBinder = z;
    }

    @Override // defpackage.toLegacyStreamType
    public final setRepeatMode TuitionPaymentFragmentspecialinlinedviewModeldefault2(prepare prepareVar, fromMediaSession frommediasession) {
        return new IMediaSessionStubProxy(prepareVar, frommediasession, this);
    }
}
