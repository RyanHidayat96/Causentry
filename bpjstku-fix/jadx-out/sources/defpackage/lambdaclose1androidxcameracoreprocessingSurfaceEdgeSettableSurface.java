package defpackage;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Handler;
import com.koushikdutta.async.AsyncServer;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
abstract class lambdaclose1androidxcameracoreprocessingSurfaceEdgeSettableSurface {
    final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final calculateInvertedTextureTransform TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    protected lambdaclose1androidxcameracoreprocessingSurfaceEdgeSettableSurface(calculateInvertedTextureTransform calculateinvertedtexturetransform, String str, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = calculateinvertedtexturetransform;
        calculateinvertedtexturetransform.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, this);
    }

    protected final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final Exception exc, final SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2) {
        SurfaceEdgeExternalSyntheticLambda5 surfaceEdgeExternalSyntheticLambda5;
        AsyncServer.TuitionPaymentFragmentbindingInflater1(calculateInvertedTextureTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault1, new Runnable() { // from class: lambdaclose1androidxcameracoreprocessingSurfaceEdgeSettableSurface.1
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda3 = surfaceProcessorNodeExternalSyntheticLambda2;
                if (surfaceProcessorNodeExternalSyntheticLambda3 == null) {
                    surfaceProcessorNodeExternalSyntheticLambda3 = new SurfaceProcessorNodeExternalSyntheticLambda2(lambdaclose1androidxcameracoreprocessingSurfaceEdgeSettableSurface.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, null, null, new Point());
                    surfaceProcessorNodeExternalSyntheticLambda3.b = exc;
                    if (!(exc instanceof CancellationException)) {
                        lambdaclose1androidxcameracoreprocessingSurfaceEdgeSettableSurface.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceProcessorNodeExternalSyntheticLambda3);
                    }
                } else if (lambdaclose1androidxcameracoreprocessingSurfaceEdgeSettableSurface.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    lambdaclose1androidxcameracoreprocessingSurfaceEdgeSettableSurface.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceProcessorNodeExternalSyntheticLambda3);
                } else {
                    getProcessor getprocessor = lambdaclose1androidxcameracoreprocessingSurfaceEdgeSettableSurface.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.b;
                    getprocessor.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceProcessorNodeExternalSyntheticLambda3.g, surfaceProcessorNodeExternalSyntheticLambda3);
                }
                ArrayList<DefaultSurfaceProcessorExternalSyntheticLambda14<SurfaceProcessorNodeExternalSyntheticLambda2>> arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdaclose1androidxcameracoreprocessingSurfaceEdgeSettableSurface.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdaclose1androidxcameracoreprocessingSurfaceEdgeSettableSurface.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                if (arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null && arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2.size() != 0) {
                    Iterator<DefaultSurfaceProcessorExternalSyntheticLambda14<SurfaceProcessorNodeExternalSyntheticLambda2>> it = arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2.iterator();
                    while (it.hasNext()) {
                        it.next().TuitionPaymentFragmentbindingInflater1(exc, surfaceProcessorNodeExternalSyntheticLambda3);
                    }
                    calculateInvertedTextureTransform calculateinvertedtexturetransform = lambdaclose1androidxcameracoreprocessingSurfaceEdgeSettableSurface.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Handler handler = calculateInvertedTextureTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    handler.removeCallbacks(calculateinvertedtexturetransform.cancelAll);
                    handler.post(calculateinvertedtexturetransform.cancelAll);
                    return;
                }
                calculateInvertedTextureTransform calculateinvertedtexturetransform2 = lambdaclose1androidxcameracoreprocessingSurfaceEdgeSettableSurface.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Handler handler2 = calculateInvertedTextureTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                handler2.removeCallbacks(calculateinvertedtexturetransform2.cancelAll);
                handler2.post(calculateinvertedtexturetransform2.cancelAll);
            }
        });
        if (surfaceProcessorNodeExternalSyntheticLambda2 == null || surfaceProcessorNodeExternalSyntheticLambda2.d == null || surfaceProcessorNodeExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null || !this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 || surfaceProcessorNodeExternalSyntheticLambda2.TuitionPaymentFragmentbindingInflater1 == null || surfaceProcessorNodeExternalSyntheticLambda2.f227a != null || surfaceProcessorNodeExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault1() > 1048576) {
            return;
        }
        calculateInvertedTextureTransform calculateinvertedtexturetransform = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (surfaceProcessorNodeExternalSyntheticLambda2.TuitionPaymentFragmentbindingInflater1 == null || (surfaceEdgeExternalSyntheticLambda5 = calculateinvertedtexturetransform.INotificationSideChannel.b) == null) {
            return;
        }
        File fileTuitionPaymentFragmentbindingInflater1 = surfaceEdgeExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileTuitionPaymentFragmentbindingInflater1);
            surfaceProcessorNodeExternalSyntheticLambda2.TuitionPaymentFragmentbindingInflater1.compress(surfaceProcessorNodeExternalSyntheticLambda2.TuitionPaymentFragmentbindingInflater1.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
            surfaceEdgeExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceProcessorNodeExternalSyntheticLambda2.g, fileTuitionPaymentFragmentbindingInflater1);
        } catch (Exception unused) {
        } finally {
            fileTuitionPaymentFragmentbindingInflater1.delete();
        }
    }
}
