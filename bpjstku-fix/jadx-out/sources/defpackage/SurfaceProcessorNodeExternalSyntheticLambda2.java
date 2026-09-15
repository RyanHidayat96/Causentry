package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import com.koushikdutta.ion.ResponseServedFrom;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class SurfaceProcessorNodeExternalSyntheticLambda2 {
    public final Bitmap TuitionPaymentFragmentbindingInflater1;
    public File TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public BitmapRegionDecoder TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public getNumberOfTargets f227a;
    public final String asBinder;
    public Exception b;
    public final Point d;
    public final String g;
    public ResponseServedFrom notify;
    public long asInterface = System.currentTimeMillis();
    private SurfaceEdgeSettableSurface cancel = new SurfaceEdgeSettableSurface();

    public SurfaceProcessorNodeExternalSyntheticLambda2(String str, String str2, Bitmap bitmap, Point point) {
        this.d = point;
        this.TuitionPaymentFragmentbindingInflater1 = bitmap;
        this.g = str;
        this.asBinder = str2;
    }

    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        Bitmap bitmap = this.TuitionPaymentFragmentbindingInflater1;
        if (bitmap != null) {
            return bitmap.getRowBytes() * this.TuitionPaymentFragmentbindingInflater1.getHeight();
        }
        getNumberOfTargets getnumberoftargets = this.f227a;
        if (getnumberoftargets != null) {
            return getnumberoftargets.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        return 0;
    }
}
