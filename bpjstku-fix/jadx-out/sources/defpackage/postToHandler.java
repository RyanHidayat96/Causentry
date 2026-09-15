package defpackage;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes5.dex */
public final class postToHandler extends onSkipToNext<PointF> {
    Path TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final onSkipToNext<PointF> cancel;

    public postToHandler(previous previousVar, onSkipToNext<PointF> onskiptonext) {
        super(previousVar, onskiptonext.d, onskiptonext.b, onskiptonext.asBinder, onskiptonext.asInterface, onskiptonext.TuitionPaymentFragmentbindingInflater1);
        this.cancel = onskiptonext;
        b();
    }

    public final void b() {
        boolean z = (this.b == null || this.d == null || !((PointF) this.d).equals(((PointF) this.b).x, ((PointF) this.b).y)) ? false : true;
        if (this.b == null || z) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = onSkipToPrevious.b((PointF) this.d, (PointF) this.b, this.cancel.f1310a, this.cancel.g);
    }
}
