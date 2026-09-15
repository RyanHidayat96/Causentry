package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.model.content.GradientType;

/* JADX INFO: loaded from: classes5.dex */
public final class getLegacyAudioStream implements toLegacyStreamType {
    public final skipToNext TuitionPaymentFragmentbindingInflater1;
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final MediaControllerCompatTransportControlsBase TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final GradientType TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaControllerCompatTransportControlsBase f951a;
    public final String asBinder;
    public final Path.FillType b;
    public final setRating g;
    private final getVolumeControl asInterface = null;
    private final getVolumeControl d = null;

    public getLegacyAudioStream(String str, GradientType gradientType, Path.FillType fillType, skipToNext skiptonext, setRating setrating, MediaControllerCompatTransportControlsBase mediaControllerCompatTransportControlsBase, MediaControllerCompatTransportControlsBase mediaControllerCompatTransportControlsBase2, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = gradientType;
        this.b = fillType;
        this.TuitionPaymentFragmentbindingInflater1 = skiptonext;
        this.g = setrating;
        this.f951a = mediaControllerCompatTransportControlsBase;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mediaControllerCompatTransportControlsBase2;
        this.asBinder = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
    }

    @Override // defpackage.toLegacyStreamType
    public final setRepeatMode TuitionPaymentFragmentspecialinlinedviewModeldefault2(prepare prepareVar, fromMediaSession frommediasession) {
        return new stop(prepareVar, frommediasession, this);
    }
}
