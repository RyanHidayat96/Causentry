package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class getEncodingLabel implements Camera<ParcelFileDescriptor, Bitmap> {
    private final getLayoutSettings b;

    @Override // defpackage.Camera
    public final /* synthetic */ Resource<Bitmap> TuitionPaymentFragmentbindingInflater1(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, getTargetRotation gettargetrotation) throws IOException {
        getLayoutSettings getlayoutsettings = this.b;
        return getlayoutsettings.b(new getEncoding.b(parcelFileDescriptor, getlayoutsettings.f950a, getlayoutsettings.TuitionPaymentFragmentbindingInflater1), i, i2, gettargetrotation, getLayoutSettings.b);
    }

    @Override // defpackage.Camera
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(ParcelFileDescriptor parcelFileDescriptor, getTargetRotation gettargetrotation) throws IOException {
        return (!("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) || "HONOR".equalsIgnoreCase(Build.MANUFACTURER)) || parcelFileDescriptor.getStatSize() <= 536870912) && getLayoutSettings.b();
    }

    public getEncodingLabel(getLayoutSettings getlayoutsettings) {
        this.b = getlayoutsettings;
    }
}
