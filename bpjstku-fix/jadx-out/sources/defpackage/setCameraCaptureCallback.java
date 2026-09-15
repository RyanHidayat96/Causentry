package defpackage;

import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.lifecycle.event.ActivityEventType;

/* JADX INFO: loaded from: classes3.dex */
public final class setCameraCaptureCallback extends lambdanew3androidxcameracoreSurfaceRequest {
    getInMemoryCallback<ActivityEventType> INotificationSideChannelDefault;
    getImageProxy INotificationSideChannelStub;

    public setCameraCaptureCallback(String str, CaptureNode2 captureNode2) {
        super(str, EventType.ACTION_MANUAL, captureNode2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface, captureNode2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface(), captureNode2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.d(), false, captureNode2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // defpackage.lambdanew3androidxcameracoreSurfaceRequest, defpackage.isServiced
    public final StringBuilder b() {
        return new StringBuilder();
    }

    @Override // defpackage.lambdanew3androidxcameracoreSurfaceRequest
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolean z) {
        if (cancel()) {
            return;
        }
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(false);
        getImageProxy getimageproxy = this.INotificationSideChannelStub;
        getInMemoryCallback<ActivityEventType> getinmemorycallback = this.INotificationSideChannelDefault;
        if (getinmemorycallback.asInterface().compareAndSet(false, true)) {
            getinmemorycallback.TuitionPaymentFragmentbindingInflater1(getimageproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            getViewPort getviewport = getimageproxy.TuitionPaymentFragmentbindingInflater1;
            getViewPort.b(getinmemorycallback);
        }
    }
}
