package defpackage;

import com.dynatrace.android.lifecycle.event.ActivityEventType;

/* JADX INFO: loaded from: classes4.dex */
public final class CaptureNode1 implements AutoValue_ProcessingNode_InputPacket {
    private final lambdaonCaptureProcessProgressed1androidxcameracoreimagecaptureCaptureNode1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public CaptureNode1(lambdaonCaptureProcessProgressed1androidxcameracoreimagecaptureCaptureNode1 lambdaoncaptureprocessprogressed1androidxcameracoreimagecapturecapturenode1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdaoncaptureprocessprogressed1androidxcameracoreimagecapturecapturenode1;
    }

    @Override // defpackage.AutoValue_ProcessingNode_InputPacket
    public final CaptureNode2 b(String str, setViewPort setviewport) {
        return new CaptureNode2(setSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str), setviewport));
    }

    @Override // defpackage.AutoValue_ProcessingNode_InputPacket
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(getInMemoryCallback<ActivityEventType> getinmemorycallback, CaptureNodeIn captureNodeIn, getImageProxy getimageproxy) {
        setCameraCaptureCallback setcameracapturecallbackB = getinmemorycallback.b();
        setcameracapturecallbackB.INotificationSideChannelStub = getimageproxy;
        setcameracapturecallbackB.INotificationSideChannelDefault = getinmemorycallback;
        captureNodeIn.TuitionPaymentFragmentbindingInflater1(setcameracapturecallbackB);
        getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault2(setcameracapturecallbackB);
    }
}
