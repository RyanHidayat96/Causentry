package defpackage;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;

/* JADX INFO: loaded from: classes6.dex */
public final class getFailureType {
    SurfaceTexture TuitionPaymentFragmentbindingInflater1;
    SurfaceHolder TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public getFailureType(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            throw new IllegalArgumentException("surfaceHolder may not be null");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = surfaceHolder;
    }

    public getFailureType(SurfaceTexture surfaceTexture) {
        if (surfaceTexture == null) {
            throw new IllegalArgumentException("surfaceTexture may not be null");
        }
        this.TuitionPaymentFragmentbindingInflater1 = surfaceTexture;
    }
}
