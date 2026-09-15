package defpackage;

import com.koushikdutta.async.AsyncServer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class getDeferrableSurfaceForTesting extends SurfaceEdgeExternalSyntheticLambda1 {
    private File TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public getDeferrableSurfaceForTesting(AsyncServer asyncServer, File file) {
        super(asyncServer);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = file;
    }

    @Override // defpackage.SurfaceEdgeExternalSyntheticLambda1
    public final OutputStream TuitionPaymentFragmentbindingInflater1() throws IOException {
        OutputStream outputStreamTuitionPaymentFragmentbindingInflater1 = super.TuitionPaymentFragmentbindingInflater1();
        if (outputStreamTuitionPaymentFragmentbindingInflater1 != null) {
            return outputStreamTuitionPaymentFragmentbindingInflater1;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getParentFile().mkdirs();
        FileOutputStream fileOutputStream = new FileOutputStream(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        this.b = fileOutputStream;
        return fileOutputStream;
    }
}
