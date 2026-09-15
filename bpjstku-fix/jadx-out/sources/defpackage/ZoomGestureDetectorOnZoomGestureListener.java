package defpackage;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.koin.core.error.KoinAppAlreadyStartedException;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\f¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"LZoomGestureDetectorOnZoomGestureListener;", "", "<init>", "()V", "LgetFocusX;", "TuitionPaymentFragmentbindingInflater1", "()LgetFocusX;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(LgetFocusX;)V", "b", "LgetFocusX;"}, k = 1, mv = {2, 3, 0})
public final class ZoomGestureDetectorOnZoomGestureListener {
    public static final ZoomGestureDetectorOnZoomGestureListener INSTANCE = new ZoomGestureDetectorOnZoomGestureListener();
    public static getFocusX b;

    private ZoomGestureDetectorOnZoomGestureListener() {
    }

    @JvmStatic
    public static final getFocusX TuitionPaymentFragmentbindingInflater1() {
        getFocusX getfocusx = b;
        if (getfocusx != null) {
            return getfocusx;
        }
        throw new IllegalStateException("KoinApplication has not been started".toString());
    }

    @JvmStatic
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(getFocusX p0) throws KoinAppAlreadyStartedException {
        if (b != null) {
            throw new KoinAppAlreadyStartedException("A Koin Application has already been started");
        }
        b = p0;
    }
}
