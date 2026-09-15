package defpackage;

import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.lifecycle.event.ActivityEventType;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class setTargetRotationInternal {
    private static final String b;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("DisplaySegmentFactory");
        b = sb.toString();
    }

    public static unbindFromCamera TuitionPaymentFragmentspecialinlinedviewModeldefault2(getInMemoryCallback<ActivityEventType> getinmemorycallback, mergeConfigs mergeconfigs, int i) {
        unbindFromCamera unbindfromcamera;
        synchronized (getinmemorycallback) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                StringBuilder sb = new StringBuilder("captured lifecycle action: ");
                sb.append(getinmemorycallback);
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
            }
            Map<T, setViewPort> mapTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getinmemorycallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            long j = mergeconfigs.g;
            long j2 = getinmemorycallback.a().TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            setViewPort setviewportA = getinmemorycallback.a();
            setViewPort setviewport = null;
            setViewPort setviewport2 = setviewportA == null ? null : new setViewPort(setviewportA.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - j, setviewportA.b);
            getProcessingRequest getprocessingrequest = new getProcessingRequest();
            unbindFromCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new unbindFromCamera.TuitionPaymentFragmentbindingInflater1();
            tuitionPaymentFragmentbindingInflater1.asInterface = getprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getinmemorycallback.TuitionPaymentFragmentbindingInflater1());
            tuitionPaymentFragmentbindingInflater1.f1420a = mergeconfigs;
            tuitionPaymentFragmentbindingInflater1.g = i;
            tuitionPaymentFragmentbindingInflater1.asBinder = getinmemorycallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1() != null ? getinmemorycallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault2() : 0L;
            tuitionPaymentFragmentbindingInflater1.b = mapTuitionPaymentFragmentspecialinlinedviewModeldefault3.containsKey(ActivityEventType.ON_CREATE) ? EventType.DISPLAY : EventType.REDISPLAY;
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = setviewport2;
            setViewPort setviewport3 = mapTuitionPaymentFragmentspecialinlinedviewModeldefault3.get(ActivityEventType.ON_CREATE);
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = setviewport3 == null ? null : new setViewPort(setviewport3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - j2, setviewport3.b);
            setViewPort setviewport4 = mapTuitionPaymentFragmentspecialinlinedviewModeldefault3.get(ActivityEventType.ON_START);
            tuitionPaymentFragmentbindingInflater1.cancel = setviewport4 == null ? null : new setViewPort(setviewport4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - j2, setviewport4.b);
            setViewPort setviewport5 = mapTuitionPaymentFragmentspecialinlinedviewModeldefault3.get(ActivityEventType.ON_RESUME);
            tuitionPaymentFragmentbindingInflater1.d = setviewport5 == null ? null : new setViewPort(setviewport5.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - j2, setviewport5.b);
            setViewPort setviewportTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getinmemorycallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (setviewportTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                setviewport = new setViewPort(setviewportTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - j2, setviewportTuitionPaymentFragmentspecialinlinedviewModeldefault2.b);
            }
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 = setviewport;
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            unbindfromcamera = new unbindFromCamera(tuitionPaymentFragmentbindingInflater1, (byte) 0);
        }
        return unbindfromcamera;
    }
}
