package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class SurfaceViewNotCroppedByParentQuirk<T> extends SurfaceViewStretchedQuirk<T> {
    private T TuitionPaymentFragmentbindingInflater1;

    public SurfaceViewNotCroppedByParentQuirk(ZoomGestureDetectorZoomEventMove<T> zoomGestureDetectorZoomEventMove) {
        super(zoomGestureDetectorZoomEventMove);
    }

    @Override // defpackage.SurfaceViewStretchedQuirk
    public final <T> T b(ScreenFlashUiInfo screenFlashUiInfo) {
        if (this.TuitionPaymentFragmentbindingInflater1 == null) {
            this.TuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(screenFlashUiInfo);
        }
        T t = this.TuitionPaymentFragmentbindingInflater1;
        if (!(t instanceof Object)) {
            t = null;
        }
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Single instance created couldn't return value".toString());
    }
}
