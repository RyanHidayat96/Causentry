package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class SurfaceProcessorNodeExternalSyntheticLambda0 extends lambdaclose1androidxcameracoreprocessingSurfaceEdgeSettableSurface implements DefaultSurfaceProcessorExternalSyntheticLambda14<SurfaceProcessorNodeExternalSyntheticLambda2> {
    ArrayList<SurfaceProcessorWithExecutor> TuitionPaymentFragmentbindingInflater1;
    String b;
    ArrayList<SurfaceProcessorWithExecutorExternalSyntheticLambda0> d;

    @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda14
    public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Exception exc, SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2) {
        final SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda3 = surfaceProcessorNodeExternalSyntheticLambda2;
        if (exc != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(exc, null);
        } else if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == this) {
            calculateInvertedTextureTransform.TuitionPaymentFragmentbindingInflater1().execute(new Runnable() { // from class: SurfaceProcessorNodeExternalSyntheticLambda0.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (SurfaceProcessorNodeExternalSyntheticLambda0.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceProcessorNodeExternalSyntheticLambda0.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == SurfaceProcessorNodeExternalSyntheticLambda0.this) {
                        try {
                            Bitmap bitmapTuitionPaymentFragmentbindingInflater1 = surfaceProcessorNodeExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1;
                            Iterator<SurfaceProcessorWithExecutorExternalSyntheticLambda0> it = SurfaceProcessorNodeExternalSyntheticLambda0.this.d.iterator();
                            while (it.hasNext()) {
                                bitmapTuitionPaymentFragmentbindingInflater1 = it.next().TuitionPaymentFragmentbindingInflater1();
                                if (bitmapTuitionPaymentFragmentbindingInflater1 == null) {
                                    throw new Exception("failed to transform bitmap");
                                }
                            }
                            SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda4 = new SurfaceProcessorNodeExternalSyntheticLambda2(SurfaceProcessorNodeExternalSyntheticLambda0.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, surfaceProcessorNodeExternalSyntheticLambda3.asBinder, bitmapTuitionPaymentFragmentbindingInflater1, surfaceProcessorNodeExternalSyntheticLambda3.d);
                            surfaceProcessorNodeExternalSyntheticLambda4.notify = surfaceProcessorNodeExternalSyntheticLambda3.notify;
                            if (SurfaceProcessorNodeExternalSyntheticLambda0.this.TuitionPaymentFragmentbindingInflater1 != null) {
                                for (SurfaceProcessorWithExecutor surfaceProcessorWithExecutor : SurfaceProcessorNodeExternalSyntheticLambda0.this.TuitionPaymentFragmentbindingInflater1) {
                                }
                            }
                            SurfaceProcessorNodeExternalSyntheticLambda0.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(null, surfaceProcessorNodeExternalSyntheticLambda4);
                        } catch (Exception e2) {
                            SurfaceProcessorNodeExternalSyntheticLambda0.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2, null);
                        } catch (OutOfMemoryError e3) {
                            SurfaceProcessorNodeExternalSyntheticLambda0.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Exception(e3), null);
                        }
                    }
                }
            });
        }
    }

    public SurfaceProcessorNodeExternalSyntheticLambda0(calculateInvertedTextureTransform calculateinvertedtexturetransform, String str, String str2, ArrayList<SurfaceProcessorWithExecutorExternalSyntheticLambda0> arrayList, ArrayList<SurfaceProcessorWithExecutor> arrayList2) {
        super(calculateinvertedtexturetransform, str, true);
        this.d = arrayList;
        this.b = str2;
        this.TuitionPaymentFragmentbindingInflater1 = arrayList2;
    }
}
