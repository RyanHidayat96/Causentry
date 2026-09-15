package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class setHandler extends onSessionEvent<PointF> {
    private PathMeasure TuitionPaymentFragmentbindingInflater1;
    private final float[] asBinder;
    private postToHandler d;
    private final PointF g;

    public setHandler(List<? extends onSkipToNext<PointF>> list) {
        super(list);
        this.g = new PointF();
        this.asBinder = new float[2];
        this.TuitionPaymentFragmentbindingInflater1 = new PathMeasure();
    }

    @Override // defpackage.binderDied
    public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSkipToNext onskiptonext, float f) {
        postToHandler posttohandler = (postToHandler) onskiptonext;
        Path path = posttohandler.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (path == null) {
            return (PointF) onskiptonext.d;
        }
        if (this.b != null) {
            MediaSessionCompatCallbackCallbackHandler<A> mediaSessionCompatCallbackCallbackHandler = this.b;
            float f2 = posttohandler.asInterface;
            Float f3 = posttohandler.TuitionPaymentFragmentbindingInflater1;
            Object obj = posttohandler.d;
            Object obj2 = posttohandler.b;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            b();
            Object obj3 = mediaSessionCompatCallbackCallbackHandler.b;
            PointF pointF = (PointF) mediaSessionCompatCallbackCallbackHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.d != posttohandler) {
            this.TuitionPaymentFragmentbindingInflater1.setPath(path, false);
            this.d = posttohandler;
        }
        PathMeasure pathMeasure = this.TuitionPaymentFragmentbindingInflater1;
        pathMeasure.getPosTan(pathMeasure.getLength() * f, this.asBinder, null);
        PointF pointF2 = this.g;
        float[] fArr = this.asBinder;
        pointF2.set(fArr[0], fArr[1]);
        return this.g;
    }
}
