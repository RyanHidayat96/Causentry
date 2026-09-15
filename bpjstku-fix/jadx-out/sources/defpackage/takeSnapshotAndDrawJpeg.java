package defpackage;

import com.koushikdutta.async.AsyncServer;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes4.dex */
public final class takeSnapshotAndDrawJpeg extends getSurfaceEdge {
    boolean TuitionPaymentFragmentbindingInflater1;
    private lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    File TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private AsyncServer asBinder;
    FileChannel b;
    AutoValue_Packet TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AutoValue_Packet();
    private Runnable asInterface = new Runnable() { // from class: takeSnapshotAndDrawJpeg.3
        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (takeSnapshotAndDrawJpeg.this.b == null) {
                    takeSnapshotAndDrawJpeg.this.b = new FileInputStream(takeSnapshotAndDrawJpeg.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2).getChannel();
                }
                if (takeSnapshotAndDrawJpeg.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != 0) {
                    takeSnapshotAndDrawJpeg takesnapshotanddrawjpeg = takeSnapshotAndDrawJpeg.this;
                    lambdainitGlRenderer10androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(takesnapshotanddrawjpeg, takesnapshotanddrawjpeg.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    if (takeSnapshotAndDrawJpeg.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != 0) {
                        return;
                    }
                }
                do {
                    ByteBuffer byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2(8192);
                    if (-1 == takeSnapshotAndDrawJpeg.this.b.read(byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                        takeSnapshotAndDrawJpeg.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(null);
                        return;
                    }
                    byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.flip();
                    takeSnapshotAndDrawJpeg.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    takeSnapshotAndDrawJpeg takesnapshotanddrawjpeg2 = takeSnapshotAndDrawJpeg.this;
                    lambdainitGlRenderer10androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(takesnapshotanddrawjpeg2, takesnapshotanddrawjpeg2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    if (takeSnapshotAndDrawJpeg.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != 0) {
                        return;
                    }
                } while (!takeSnapshotAndDrawJpeg.this.TuitionPaymentFragmentbindingInflater1);
            } catch (Exception e2) {
                takeSnapshotAndDrawJpeg.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
            }
        }
    };

    public takeSnapshotAndDrawJpeg(AsyncServer asyncServer, File file) throws Throwable {
        this.asBinder = asyncServer;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = file;
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault2 = asyncServer.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        this.TuitionPaymentFragmentbindingInflater1 = !zTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (zTuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            this.asBinder.TuitionPaymentFragmentbindingInflater1(this.asInterface, 0L);
        }
    }

    @Override // defpackage.getSurfaceEdge, defpackage.checkReadyToRelease
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessor) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessor;
    }

    @Override // defpackage.getSurfaceEdge, defpackage.checkReadyToRelease
    public final lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor i_() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.checkReadyToRelease
    public final void g_() {
        this.TuitionPaymentFragmentbindingInflater1 = true;
    }

    @Override // defpackage.checkReadyToRelease
    public final void h_() {
        this.TuitionPaymentFragmentbindingInflater1 = false;
        this.asBinder.TuitionPaymentFragmentbindingInflater1(this.asInterface, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.getSurfaceEdge
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Exception exc) {
        SurfaceEdgeExternalSyntheticLambda3.b(this.b);
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(exc);
    }

    @Override // defpackage.checkReadyToRelease
    public final boolean f_() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.checkReadyToRelease
    public final AsyncServer TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.asBinder;
    }

    @Override // defpackage.checkReadyToRelease
    public final void TuitionPaymentFragmentbindingInflater1() {
        try {
            this.b.close();
        } catch (Exception unused) {
        }
    }
}
