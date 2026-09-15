package defpackage;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class MediaControllerCompatTransportControlsApi24 implements MediaControllerCompatApi21<PointF, PointF> {
    private final getVolumeControl TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final getVolumeControl b;

    public MediaControllerCompatTransportControlsApi24(getVolumeControl getvolumecontrol, getVolumeControl getvolumecontrol2) {
        this.b = getvolumecontrol;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getvolumecontrol2;
    }

    @Override // defpackage.MediaControllerCompatApi21
    public final List<onSkipToNext<PointF>> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.MediaControllerCompatApi21
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2() && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    @Override // defpackage.MediaControllerCompatApi21
    public final binderDied<PointF, PointF> TuitionPaymentFragmentbindingInflater1() {
        return new MediaControllerCompatMediaControllerImpl(this.b.TuitionPaymentFragmentbindingInflater1(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1());
    }
}
