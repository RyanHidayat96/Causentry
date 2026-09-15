package defpackage;

import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class MediaControllerCompatMediaControllerImpl extends binderDied<PointF, PointF> {
    private final PointF TuitionPaymentFragmentbindingInflater1;
    private final binderDied<Float, Float> asBinder;
    private final binderDied<Float, Float> g;

    public MediaControllerCompatMediaControllerImpl(binderDied<Float, Float> binderdied, binderDied<Float, Float> binderdied2) {
        super(Collections.emptyList());
        this.TuitionPaymentFragmentbindingInflater1 = new PointF();
        this.g = binderdied;
        this.asBinder = binderdied2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(b());
    }

    @Override // defpackage.binderDied
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(float f) {
        this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2(f);
        this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(f);
        this.TuitionPaymentFragmentbindingInflater1.set(this.g.asInterface().floatValue(), this.asBinder.asInterface().floatValue());
        for (int i = 0; i < this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size(); i++) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }

    @Override // defpackage.binderDied
    public final /* synthetic */ PointF asInterface() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.binderDied
    final /* synthetic */ PointF TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSkipToNext<PointF> onskiptonext, float f) {
        return this.TuitionPaymentFragmentbindingInflater1;
    }
}
