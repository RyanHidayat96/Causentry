package defpackage;

import com.dynatrace.android.lifecycle.event.ActivityEventType;

/* JADX INFO: loaded from: classes3.dex */
public final class getViewPort {
    private static final String TuitionPaymentFragmentbindingInflater1;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("StoreActionObserver");
        TuitionPaymentFragmentbindingInflater1 = sb.toString();
    }

    public static void b(getInMemoryCallback<ActivityEventType> getinmemorycallback) {
        CaptureNodeIn captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getinmemorycallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null || captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                StringBuilder sb = new StringBuilder("Parent action is not available anymore, discard lifecycle action '");
                sb.append(getinmemorycallback.TuitionPaymentFragmentbindingInflater1());
                sb.append("'");
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
                return;
            }
            return;
        }
        if (provideSurface.b()) {
            new setTargetRotationInternal();
            getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setTargetRotationInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getinmemorycallback, captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1()));
        }
        setCameraCaptureCallback setcameracapturecallbackB = getinmemorycallback.b();
        getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1(setcameracapturecallbackB);
        setcameracapturecallbackB.MediaBrowserCompat();
    }
}
