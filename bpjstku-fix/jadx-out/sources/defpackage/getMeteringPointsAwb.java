package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

/* JADX INFO: loaded from: classes3.dex */
public final class getMeteringPointsAwb implements getMirroring.TuitionPaymentFragmentbindingInflater1 {
    private final BitmapPool TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final CameraUnavailableException b;

    public getMeteringPointsAwb(BitmapPool bitmapPool, CameraUnavailableException cameraUnavailableException) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bitmapPool;
        this.b = cameraUnavailableException;
    }

    @Override // getMirroring.TuitionPaymentFragmentbindingInflater1
    public final Bitmap TuitionPaymentFragmentbindingInflater1(int i, int i2, Bitmap.Config config) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(i, i2, config);
    }

    @Override // getMirroring.TuitionPaymentFragmentbindingInflater1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Bitmap bitmap) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(bitmap);
    }

    @Override // getMirroring.TuitionPaymentFragmentbindingInflater1
    public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        CameraUnavailableException cameraUnavailableException = this.b;
        if (cameraUnavailableException == null) {
            return new byte[i];
        }
        return (byte[]) cameraUnavailableException.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, byte[].class);
    }

    @Override // getMirroring.TuitionPaymentFragmentbindingInflater1
    public final void b(byte[] bArr) {
        CameraUnavailableException cameraUnavailableException = this.b;
        if (cameraUnavailableException == null) {
            return;
        }
        cameraUnavailableException.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr);
    }

    @Override // getMirroring.TuitionPaymentFragmentbindingInflater1
    public final int[] b(int i) {
        CameraUnavailableException cameraUnavailableException = this.b;
        if (cameraUnavailableException == null) {
            return new int[i];
        }
        return (int[]) cameraUnavailableException.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, int[].class);
    }

    @Override // getMirroring.TuitionPaymentFragmentbindingInflater1
    public final void b(int[] iArr) {
        CameraUnavailableException cameraUnavailableException = this.b;
        if (cameraUnavailableException == null) {
            return;
        }
        cameraUnavailableException.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iArr);
    }
}
