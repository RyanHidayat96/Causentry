package defpackage;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaControllerCompatTransportControlsApi23 implements MediaControllerCompatApi21<PointF, PointF> {
    private final List<onSkipToNext<PointF>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public MediaControllerCompatTransportControlsApi23() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Collections.singletonList(new onSkipToNext(new PointF(0.0f, 0.0f)));
    }

    public MediaControllerCompatTransportControlsApi23(List<onSkipToNext<PointF>> list) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = list;
    }

    @Override // defpackage.MediaControllerCompatApi21
    public final List<onSkipToNext<PointF>> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.MediaControllerCompatApi21
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() == 1 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(0).asBinder == null;
    }

    @Override // defpackage.MediaControllerCompatApi21
    public final binderDied<PointF, PointF> TuitionPaymentFragmentbindingInflater1() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(0).asBinder == null) {
            return new MediaControllerCompatCallbackMessageHandler(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        return new setHandler(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }
}
