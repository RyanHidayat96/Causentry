package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.text.TextUtils;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
final class createAndSendSurfaceOutput extends SurfaceProcessorInternal implements DefaultSurfaceProcessorExternalSyntheticLambda14<transformSingleOutput<AutoValue_Packet>> {
    int TuitionPaymentFragmentbindingInflater1;
    int b;

    @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda14
    public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Exception exc, transformSingleOutput<AutoValue_Packet> transformsingleoutput) throws Throwable {
        final transformSingleOutput<AutoValue_Packet> transformsingleoutput2 = transformsingleoutput;
        if (exc == null) {
            exc = transformsingleoutput2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        if (exc != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(exc, null);
            return;
        }
        final AutoValue_Packet autoValue_PacketTuitionPaymentFragmentspecialinlinedviewModeldefault1 = transformsingleoutput2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == this) {
            calculateInvertedTextureTransform.TuitionPaymentFragmentbindingInflater1().execute(new Runnable() { // from class: createAndSendSurfaceOutput.4
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v4 */
                /* JADX WARN: Type inference failed for: r0v6 */
                /* JADX WARN: Type inference failed for: r0v7, types: [java.nio.ByteBuffer] */
                /* JADX WARN: Type inference failed for: r0v9 */
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    OutOfMemoryError e2;
                    ByteBuffer byteBuffer;
                    Exception e3;
                    getNumberOfTargets getnumberoftargets;
                    ByteBuffer byteBuffer2;
                    Bitmap bitmap;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = createAndSendSurfaceOutput.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(createAndSendSurfaceOutput.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    createAndSendSurfaceOutput createandsendsurfaceoutput = createAndSendSurfaceOutput.this;
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 != createandsendsurfaceoutput) {
                        AutoValue_Packet autoValue_Packet = autoValue_PacketTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        while (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 0) {
                            AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove());
                        }
                        autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                        return;
                    }
                    ?? r0 = 0;
                    try {
                        try {
                            AutoValue_Packet autoValue_Packet2 = autoValue_PacketTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            if (autoValue_Packet2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0) {
                                byteBuffer = AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            } else {
                                autoValue_Packet2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_Packet2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                ByteBuffer byteBufferRemove = autoValue_Packet2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove();
                                autoValue_Packet2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 -= byteBufferRemove.remaining();
                                byteBuffer = byteBufferRemove;
                            }
                            try {
                                lambdaonOutputSurface1androidxcameracoreprocessingSurfaceProcessorWithExecutor lambdaonoutputsurface1androidxcameracoreprocessingsurfaceprocessorwithexecutor = createAndSendSurfaceOutput.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
                                byte[] bArrArray = byteBuffer.array();
                                int iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
                                int iRemaining = byteBuffer.remaining();
                                int i = createAndSendSurfaceOutput.this.TuitionPaymentFragmentbindingInflater1;
                                int i2 = createAndSendSurfaceOutput.this.b;
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeByteArray(bArrArray, iPosition, iRemaining, options);
                                BitmapFactory.Options optionsB = lambdaonoutputsurface1androidxcameracoreprocessingsurfaceprocessorwithexecutor.b(options, i, i2);
                                Point point = new Point(optionsB.outWidth, optionsB.outHeight);
                                if (createAndSendSurfaceOutput.this.f225a && TextUtils.equals("image/gif", optionsB.outMimeType)) {
                                    getNumberOfTargets getnumberoftargets2 = new getNumberOfTargets(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
                                    bitmap = getnumberoftargets2.b().TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    getnumberoftargets = getnumberoftargets2;
                                    byteBuffer2 = null;
                                } else {
                                    byte[] bArrArray2 = byteBuffer.array();
                                    int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                                    int iRemaining2 = byteBuffer.remaining();
                                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrArray2, iArrayOffset, iRemaining2, optionsB);
                                    Bitmap bitmapTuitionPaymentFragmentbindingInflater1 = bitmapDecodeByteArray == null ? null : lambdaonOutputSurface1androidxcameracoreprocessingSurfaceProcessorWithExecutor.TuitionPaymentFragmentbindingInflater1(bitmapDecodeByteArray, lambdaonInputSurface0androidxcameracoreprocessingSurfaceProcessorWithExecutor.b(bArrArray2, iArrayOffset, iRemaining2));
                                    if (bitmapTuitionPaymentFragmentbindingInflater1 == null) {
                                        throw new Exception("failed to load bitmap");
                                    }
                                    getnumberoftargets = null;
                                    Bitmap bitmap2 = bitmapTuitionPaymentFragmentbindingInflater1;
                                    byteBuffer2 = byteBuffer;
                                    bitmap = bitmap2;
                                }
                                try {
                                    SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2 = new SurfaceProcessorNodeExternalSyntheticLambda2(createAndSendSurfaceOutput.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, optionsB.outMimeType, bitmap, point);
                                    surfaceProcessorNodeExternalSyntheticLambda2.f227a = getnumberoftargets;
                                    surfaceProcessorNodeExternalSyntheticLambda2.notify = transformsingleoutput2.TuitionPaymentFragmentbindingInflater1;
                                    createAndSendSurfaceOutput.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(null, surfaceProcessorNodeExternalSyntheticLambda2);
                                    AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(byteBuffer2);
                                } catch (Exception e4) {
                                    e3 = e4;
                                    byteBuffer = byteBuffer2;
                                    createAndSendSurfaceOutput.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e3, null);
                                    AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(byteBuffer);
                                } catch (OutOfMemoryError e5) {
                                    e2 = e5;
                                    byteBuffer = byteBuffer2;
                                    createAndSendSurfaceOutput.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Exception(e2), null);
                                    AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(byteBuffer);
                                } catch (Throwable th) {
                                    th = th;
                                    r0 = byteBuffer2;
                                    AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3((ByteBuffer) r0);
                                    throw th;
                                }
                            } catch (Exception e6) {
                                e3 = e6;
                            } catch (OutOfMemoryError e7) {
                                e2 = e7;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r0 = createandsendsurfaceoutput;
                        }
                    } catch (Exception e8) {
                        e3 = e8;
                        byteBuffer = null;
                    } catch (OutOfMemoryError e9) {
                        e2 = e9;
                        byteBuffer = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            });
            return;
        }
        while (autoValue_PacketTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 0) {
            AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_PacketTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove());
        }
        autoValue_PacketTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    }

    public createAndSendSurfaceOutput(calculateInvertedTextureTransform calculateinvertedtexturetransform, String str, boolean z, int i, int i2, boolean z2) {
        super(calculateinvertedtexturetransform, str, z, z2);
        this.TuitionPaymentFragmentbindingInflater1 = i;
        this.b = i2;
    }
}
