package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdasendSurfaceOutputs0androidxcameracoreprocessingSurfaceProcessorNode extends SurfaceProcessorInternal implements DefaultSurfaceProcessorExternalSyntheticLambda14<transformSingleOutput<File>> {
    SurfaceEdgeExternalSyntheticLambda5 b;

    public lambdasendSurfaceOutputs0androidxcameracoreprocessingSurfaceProcessorNode(calculateInvertedTextureTransform calculateinvertedtexturetransform, String str, boolean z, SurfaceEdgeExternalSyntheticLambda5 surfaceEdgeExternalSyntheticLambda5) {
        super(calculateinvertedtexturetransform, str, true, z);
        this.b = surfaceEdgeExternalSyntheticLambda5;
    }

    @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda14
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public final void TuitionPaymentFragmentbindingInflater1(Exception exc, final transformSingleOutput<File> transformsingleoutput) {
        if (exc == null) {
            exc = transformsingleoutput.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        if (exc != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(exc, null);
            return;
        }
        final File fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 = transformsingleoutput.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) != this) {
            return;
        }
        calculateInvertedTextureTransform.TuitionPaymentFragmentbindingInflater1().execute(new Runnable() { // from class: lambdasendSurfaceOutputs0androidxcameracoreprocessingSurfaceProcessorNode.3
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                FileInputStream fileInputStream;
                File fileTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                FileInputStream fileInputStream2 = null;
                try {
                    if (lambdasendSurfaceOutputs0androidxcameracoreprocessingSurfaceProcessorNode.this.b != null) {
                        lambdasendSurfaceOutputs0androidxcameracoreprocessingSurfaceProcessorNode.this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdasendSurfaceOutputs0androidxcameracoreprocessingSurfaceProcessorNode.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, fileTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        fileTuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdasendSurfaceOutputs0androidxcameracoreprocessingSurfaceProcessorNode.this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdasendSurfaceOutputs0androidxcameracoreprocessingSurfaceProcessorNode.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    } else {
                        fileTuitionPaymentFragmentspecialinlinedviewModeldefault3 = fileTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    }
                    BitmapFactory.Options optionsTuitionPaymentFragmentbindingInflater1 = lambdasendSurfaceOutputs0androidxcameracoreprocessingSurfaceProcessorNode.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(fileTuitionPaymentFragmentspecialinlinedviewModeldefault3, 0, 0);
                    Point point = new Point(optionsTuitionPaymentFragmentbindingInflater1.outWidth, optionsTuitionPaymentFragmentbindingInflater1.outHeight);
                    if (lambdasendSurfaceOutputs0androidxcameracoreprocessingSurfaceProcessorNode.this.f225a && TextUtils.equals("image/gif", optionsTuitionPaymentFragmentbindingInflater1.outMimeType)) {
                        SurfaceEdgeExternalSyntheticLambda5 surfaceEdgeExternalSyntheticLambda5 = lambdasendSurfaceOutputs0androidxcameracoreprocessingSurfaceProcessorNode.this.b;
                        File fileTuitionPaymentFragmentspecialinlinedviewModeldefault4 = surfaceEdgeExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdasendSurfaceOutputs0androidxcameracoreprocessingSurfaceProcessorNode.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, 0);
                        surfaceEdgeExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(fileTuitionPaymentFragmentspecialinlinedviewModeldefault4.getName());
                        fileTuitionPaymentFragmentspecialinlinedviewModeldefault4.setLastModified(System.currentTimeMillis());
                        fileInputStream = new FileInputStream(fileTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                        try {
                            try {
                                getNumberOfTargets getnumberoftargets = new getNumberOfTargets(ByteBuffer.wrap(SurfaceEdgeExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fileInputStream)));
                                SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2 = new SurfaceProcessorNodeExternalSyntheticLambda2(lambdasendSurfaceOutputs0androidxcameracoreprocessingSurfaceProcessorNode.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, optionsTuitionPaymentFragmentbindingInflater1.outMimeType, getnumberoftargets.b().TuitionPaymentFragmentspecialinlinedviewModeldefault2, point);
                                surfaceProcessorNodeExternalSyntheticLambda2.f227a = getnumberoftargets;
                                lambdasendSurfaceOutputs0androidxcameracoreprocessingSurfaceProcessorNode.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(null, surfaceProcessorNodeExternalSyntheticLambda2);
                                SurfaceEdgeExternalSyntheticLambda3.b(fileInputStream);
                                return;
                            } catch (Exception e2) {
                                e = e2;
                                lambdasendSurfaceOutputs0androidxcameracoreprocessingSurfaceProcessorNode.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e, null);
                                SurfaceEdgeExternalSyntheticLambda3.b(fileInputStream);
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream2 = fileInputStream;
                            SurfaceEdgeExternalSyntheticLambda3.b(fileInputStream2);
                            throw th;
                        }
                    }
                    BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(fileTuitionPaymentFragmentspecialinlinedviewModeldefault3.toString(), false);
                    Bitmap bitmapDecodeRegion = bitmapRegionDecoderNewInstance.decodeRegion(new Rect(0, 0, point.x, point.y), optionsTuitionPaymentFragmentbindingInflater1);
                    if (bitmapDecodeRegion == null) {
                        throw new Exception("unable to load decoder");
                    }
                    SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda3 = new SurfaceProcessorNodeExternalSyntheticLambda2(lambdasendSurfaceOutputs0androidxcameracoreprocessingSurfaceProcessorNode.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, optionsTuitionPaymentFragmentbindingInflater1.outMimeType, bitmapDecodeRegion, point);
                    surfaceProcessorNodeExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bitmapRegionDecoderNewInstance;
                    surfaceProcessorNodeExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = fileTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    surfaceProcessorNodeExternalSyntheticLambda3.notify = transformsingleoutput.TuitionPaymentFragmentbindingInflater1;
                    lambdasendSurfaceOutputs0androidxcameracoreprocessingSurfaceProcessorNode.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(null, surfaceProcessorNodeExternalSyntheticLambda3);
                    SurfaceEdgeExternalSyntheticLambda3.b(null);
                } catch (Exception e3) {
                    e = e3;
                    fileInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    SurfaceEdgeExternalSyntheticLambda3.b(fileInputStream2);
                    throw th;
                }
            }
        });
    }
}
