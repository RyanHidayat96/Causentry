package defpackage;

import com.dynatrace.android.lifecycle.event.ActivityEventType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getImageProxy {
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final getViewPort TuitionPaymentFragmentbindingInflater1;
    public final addEffect TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final AutoValue_ProcessingNode_InputPacket TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Map<onImageProxyAvailable, getInMemoryCallback<ActivityEventType>> asBinder = new HashMap();
    private final getRequestId b;
    private final updateSuggestedStreamSpec d;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("LifecycleController");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = sb.toString();
    }

    public getImageProxy(getRequestId getrequestid, updateSuggestedStreamSpec updatesuggestedstreamspec, getViewPort getviewport, addEffect addeffect, AutoValue_ProcessingNode_InputPacket autoValue_ProcessingNode_InputPacket) {
        this.b = getrequestid;
        this.d = updatesuggestedstreamspec;
        this.TuitionPaymentFragmentbindingInflater1 = getviewport;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = addeffect;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = autoValue_ProcessingNode_InputPacket;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(onImageProxyAvailable onimageproxyavailable, ActivityEventType activityEventType) {
        setViewPort setviewportTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        getInMemoryCallback<ActivityEventType> getinmemorycallback = this.asBinder.get(onimageproxyavailable);
        if (getinmemorycallback != null) {
            setviewportTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        } else {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("start activity monitoring for ".concat(String.valueOf(onimageproxyavailable)));
            }
            setViewPort setviewportTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            setViewPort setviewportTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            setViewPort setviewportTuitionPaymentFragmentspecialinlinedviewModeldefault4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            CaptureNode2 captureNode2B = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(onimageproxyavailable.TuitionPaymentFragmentbindingInflater1, setviewportTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            getInMemoryCallback<ActivityEventType> getinmemorycallbackTuitionPaymentFragmentbindingInflater1 = this.b.TuitionPaymentFragmentbindingInflater1(onimageproxyavailable.TuitionPaymentFragmentbindingInflater1, captureNode2B, setviewportTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getinmemorycallbackTuitionPaymentFragmentbindingInflater1, captureNode2B, this);
            this.asBinder.put(onimageproxyavailable, getinmemorycallbackTuitionPaymentFragmentbindingInflater1);
            getinmemorycallback = getinmemorycallbackTuitionPaymentFragmentbindingInflater1;
            setviewportTuitionPaymentFragmentspecialinlinedviewModeldefault1 = setviewportTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        }
        CaptureNodeExternalSyntheticLambda0<T> captureNodeExternalSyntheticLambda0 = new CaptureNodeExternalSyntheticLambda0<>(activityEventType, setviewportTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        synchronized (getinmemorycallback) {
            getinmemorycallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(captureNodeExternalSyntheticLambda0);
        }
    }

    public final void b(onImageProxyAvailable onimageproxyavailable) {
        getInMemoryCallback<ActivityEventType> getinmemorycallbackRemove = this.asBinder.remove(onimageproxyavailable);
        if (getinmemorycallbackRemove != null) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("finish activity monitoring for ".concat(String.valueOf(onimageproxyavailable)));
            }
            if (getinmemorycallbackRemove.asInterface().compareAndSet(false, true)) {
                getinmemorycallbackRemove.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                getViewPort getviewport = this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                getViewPort.b(getinmemorycallbackRemove);
                CaptureNodeIn captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getinmemorycallbackRemove.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                if (captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null || captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                    return;
                }
                captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            }
        }
    }
}
