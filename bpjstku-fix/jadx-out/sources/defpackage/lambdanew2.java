package defpackage;

import com.dynatrace.android.agent.EventType;
import org.apache.http.Header;
import org.apache.http.HttpRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class lambdanew2 {
    public static String F_(HttpRequest httpRequest) {
        if (httpRequest == null) {
            return null;
        }
        try {
            Header lastHeader = httpRequest.getLastHeader(provideSurface.TuitionPaymentFragmentbindingInflater1());
            if (lastHeader != null) {
                return lastHeader.getValue();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static SurfaceRequestExternalSyntheticLambda2 G_(lambdanew3androidxcameracoreSurfaceRequest lambdanew3androidxcameracoresurfacerequest, HttpRequest httpRequest) {
        SurfaceRequestExternalSyntheticLambda2 surfaceRequestExternalSyntheticLambda2INotificationSideChannelDefault;
        if (!lambdanew3androidxcameracoresurfacerequest.INotificationSideChannelStub() || httpRequest == null || !lambdanew3androidxcameracoresurfacerequest.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(EventType.WEB_REQUEST) || (surfaceRequestExternalSyntheticLambda2INotificationSideChannelDefault = lambdanew3androidxcameracoresurfacerequest.INotificationSideChannelDefault()) == null) {
            return null;
        }
        httpRequest.setHeader(provideSurface.TuitionPaymentFragmentbindingInflater1(), surfaceRequestExternalSyntheticLambda2INotificationSideChannelDefault.toString());
        lambdanew3androidxcameracoresurfacerequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new isServiced(surfaceRequestExternalSyntheticLambda2INotificationSideChannelDefault.toString(), 110, EventType.PLACEHOLDER, lambdanew3androidxcameracoresurfacerequest.asInterface, lambdanew3androidxcameracoresurfacerequest.cancel, lambdanew3androidxcameracoresurfacerequest.INotificationSideChannel, true));
        return surfaceRequestExternalSyntheticLambda2INotificationSideChannelDefault;
    }
}
