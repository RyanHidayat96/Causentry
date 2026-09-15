package defpackage;

import android.graphics.Path;

/* JADX INFO: loaded from: classes5.dex */
public final class MediaControllerCompatApi24TransportControls implements toLegacyStreamType {
    public final Path.FillType TuitionPaymentFragmentbindingInflater1;
    public final setRating TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final getPlaybackType TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final boolean asInterface;
    public final boolean b;

    public MediaControllerCompatApi24TransportControls(String str, boolean z, Path.FillType fillType, getPlaybackType getplaybacktype, setRating setrating, boolean z2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.asInterface = z;
        this.TuitionPaymentFragmentbindingInflater1 = fillType;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getplaybacktype;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = setrating;
        this.b = z2;
    }

    @Override // defpackage.toLegacyStreamType
    public final setRepeatMode TuitionPaymentFragmentspecialinlinedviewModeldefault2(prepare prepareVar, fromMediaSession frommediasession) {
        return new MediaControllerCompat(prepareVar, frommediasession, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeFill{color=, fillEnabled=");
        sb.append(this.asInterface);
        sb.append('}');
        return sb.toString();
    }
}
