package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaControllerCompatApi23 {
    public PointF TuitionPaymentFragmentbindingInflater1;
    public final List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public boolean b;

    public MediaControllerCompatApi23(PointF pointF, boolean z, List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> list) {
        this.TuitionPaymentFragmentbindingInflater1 = pointF;
        this.b = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList(list);
    }

    public MediaControllerCompatApi23() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size());
        sb.append("closed=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
}
