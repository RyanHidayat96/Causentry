package defpackage;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class MediaControllerCompatCallbackMessageHandler extends onSessionEvent<PointF> {
    private final PointF TuitionPaymentFragmentbindingInflater1;

    public MediaControllerCompatCallbackMessageHandler(List<onSkipToNext<PointF>> list) {
        super(list);
        this.TuitionPaymentFragmentbindingInflater1 = new PointF();
    }

    @Override // defpackage.binderDied
    public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSkipToNext onskiptonext, float f) {
        if (onskiptonext.d == null || onskiptonext.b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) onskiptonext.d;
        PointF pointF2 = (PointF) onskiptonext.b;
        if (this.b != null) {
            MediaSessionCompatCallbackCallbackHandler<A> mediaSessionCompatCallbackCallbackHandler = this.b;
            float f2 = onskiptonext.asInterface;
            Float f3 = onskiptonext.TuitionPaymentFragmentbindingInflater1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            b();
            Object obj = mediaSessionCompatCallbackCallbackHandler.b;
            PointF pointF3 = (PointF) mediaSessionCompatCallbackCallbackHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (pointF3 != null) {
                return pointF3;
            }
        }
        this.TuitionPaymentFragmentbindingInflater1.set(pointF.x + ((pointF2.x - pointF.x) * f), pointF.y + ((pointF2.y - pointF.y) * f));
        return this.TuitionPaymentFragmentbindingInflater1;
    }
}
