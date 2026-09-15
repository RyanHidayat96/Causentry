package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraXConfigProvider implements ImageDecoder.OnHeaderDecodedListener {
    private final DecodeFormat TuitionPaymentFragmentbindingInflater1;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final DelegatingImageSavedCallback TuitionPaymentFragmentspecialinlinedviewModeldefault2 = DelegatingImageSavedCallback.TuitionPaymentFragmentbindingInflater1();
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final PreferredColorSpace b;
    private final int d;
    private final DownsampleStrategy g;

    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    public CameraXConfigProvider(int i, int i2, getTargetRotation gettargetrotation) {
        boolean z;
        this.d = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
        isMirroring<DecodeFormat> ismirroring = getLayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.TuitionPaymentFragmentbindingInflater1 = (DecodeFormat) (gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.containsKey(ismirroring) ? gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(ismirroring) : ismirroring.b);
        isMirroring<DownsampleStrategy> ismirroring2 = DownsampleStrategy.asInterface;
        this.g = (DownsampleStrategy) (gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.containsKey(ismirroring2) ? gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(ismirroring2) : ismirroring2.b);
        isMirroring<Boolean> ismirroring3 = getLayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if ((gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.containsKey(ismirroring3) ? gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(ismirroring3) : ismirroring3.b) != null) {
            isMirroring<Boolean> ismirroring4 = getLayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (((Boolean) (gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.containsKey(ismirroring4) ? gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(ismirroring4) : ismirroring4.b)).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
        isMirroring<PreferredColorSpace> ismirroring5 = getLayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.b = (PreferredColorSpace) (gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.containsKey(ismirroring5) ? gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(ismirroring5) : ismirroring5.b);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(this.d, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.TuitionPaymentFragmentbindingInflater1 == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new ImageDecoder.OnPartialImageListener() { // from class: CameraXConfigProvider.3
            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        });
        Size size = imageInfo.getSize();
        int width = this.d;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fTuitionPaymentFragmentbindingInflater1 = this.g.TuitionPaymentFragmentbindingInflater1(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fTuitionPaymentFragmentbindingInflater1);
        int iRound2 = Math.round(size.getHeight() * fTuitionPaymentFragmentbindingInflater1);
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        if (this.b != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((this.b == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (Build.VERSION.SDK_INT >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
