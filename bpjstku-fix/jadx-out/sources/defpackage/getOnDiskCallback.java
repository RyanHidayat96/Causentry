package defpackage;

import com.dynatrace.android.lifecycle.event.ActivityEventType;

/* JADX INFO: loaded from: classes4.dex */
public final class getOnDiskCallback implements getRequestId {
    @Override // defpackage.getRequestId
    public final getInMemoryCallback<ActivityEventType> TuitionPaymentFragmentbindingInflater1(String str, CaptureNode2 captureNode2, setViewPort setviewport) {
        AutoValue_TakePictureRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AutoValue_TakePictureRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.b = setviewport;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = captureNode2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new setCameraCaptureCallback(str, captureNode2);
        return new AutoValue_TakePictureRequest(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }
}
