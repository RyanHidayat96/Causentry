package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setCaptureOptionUnpacker<T> implements setDefaultResolution<T> {
    private final int TuitionPaymentFragmentbindingInflater1;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private ImageAnalysisBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // defpackage.getDefaultConfig
    public void onDestroy() {
    }

    @Override // defpackage.setDefaultResolution
    public void onLoadFailed(Drawable drawable) {
    }

    @Override // defpackage.setDefaultResolution
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // defpackage.getDefaultConfig
    public void onStart() {
    }

    @Override // defpackage.getDefaultConfig
    public void onStop() {
    }

    @Override // defpackage.setDefaultResolution
    public final void removeCallback(setHighResolutionDisabled sethighresolutiondisabled) {
    }

    public setCaptureOptionUnpacker() {
        this((byte) 0);
    }

    private setCaptureOptionUnpacker(byte b) {
        if (!getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException(new StringBuilder("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648").toString());
        }
        this.TuitionPaymentFragmentbindingInflater1 = Integer.MIN_VALUE;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Integer.MIN_VALUE;
    }

    @Override // defpackage.setDefaultResolution
    public final void getSize(setHighResolutionDisabled sethighresolutiondisabled) {
        sethighresolutiondisabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // defpackage.setDefaultResolution
    public final void setRequest(ImageAnalysisBuilder imageAnalysisBuilder) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = imageAnalysisBuilder;
    }

    @Override // defpackage.setDefaultResolution
    public final ImageAnalysisBuilder getRequest() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }
}
