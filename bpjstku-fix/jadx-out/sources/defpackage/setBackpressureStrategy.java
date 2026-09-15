package defpackage;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class setBackpressureStrategy<Z> implements setDefaultResolution<Z> {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private ImageAnalysisBuilder request;

    @Override // defpackage.getDefaultConfig
    public void onDestroy() {
    }

    @Override // defpackage.setDefaultResolution
    public void onLoadCleared(Drawable drawable) {
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
    public void setRequest(ImageAnalysisBuilder imageAnalysisBuilder) {
        this.request = imageAnalysisBuilder;
    }

    @Override // defpackage.setDefaultResolution
    public ImageAnalysisBuilder getRequest() {
        return this.request;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = i % 5128073;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iUptimeMillis;
        return iUptimeMillis;
    }
}
