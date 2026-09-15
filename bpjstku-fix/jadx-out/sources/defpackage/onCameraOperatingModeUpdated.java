package defpackage;

import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.callback.CallbackCore;
import java.io.IOException;
import java.util.WeakHashMap;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
final class onCameraOperatingModeUpdated implements Interceptor {
    private static final String TuitionPaymentFragmentbindingInflater1;
    static WeakHashMap<Request, setScaleType> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    static final onCameraOperatingModeUpdated TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new onCameraOperatingModeUpdated();

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("OkInterceptor");
        TuitionPaymentFragmentbindingInflater1 = sb.toString();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new WeakHashMap<>();
    }

    private onCameraOperatingModeUpdated() {
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Request request;
        SurfaceRequestExternalSyntheticLambda2 surfaceRequestExternalSyntheticLambda2;
        Request requestBuild;
        if (!SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get()) {
            return chain.proceed(chain.request());
        }
        Request request2 = chain.request();
        if (request2 == null) {
            request = null;
            break;
        }
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1.containsKey(request2)) {
            request = request2;
        } else {
            Object objTag = request2.tag();
            request = request2;
            while (true) {
                if (request.equals(objTag) || !(objTag instanceof Request)) {
                    request = null;
                    break;
                }
                request = (Request) objTag;
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault1.containsKey(request)) {
                    break;
                }
                objTag = request.tag();
            }
        }
        setScaleType setscaletype = request == null ? null : TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(request);
        if (setscaletype == null) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("missed request %s - orig hc=%s, cur hc=%s", request2.url().toString(), Integer.valueOf(request != null ? request.hashCode() : 0), Integer.valueOf(request2.hashCode())));
            }
            return chain.proceed(request2);
        }
        String strHeader = request2.header(provideSurface.TuitionPaymentFragmentbindingInflater1());
        if (strHeader == null) {
            if (setscaletype != null) {
                CameraCoordinator cameraCoordinator = (CameraCoordinator) setscaletype.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                SurfaceRequestExternalSyntheticLambda2 surfaceRequestExternalSyntheticLambda3 = setscaletype.TuitionPaymentFragmentbindingInflater1;
                if (surfaceRequestExternalSyntheticLambda3 != null) {
                    requestBuild = request2.newBuilder().header(provideSurface.TuitionPaymentFragmentbindingInflater1(), surfaceRequestExternalSyntheticLambda3.toString()).build();
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Tagged WR %s (hc=%d) with %s", cameraCoordinator.TuitionPaymentFragmentbindingInflater1(), Integer.valueOf(cameraCoordinator.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode()), surfaceRequestExternalSyntheticLambda3));
                    }
                } else {
                    requestBuild = null;
                }
                if (requestBuild != null) {
                    request2 = requestBuild;
                } else {
                    setscaletype.TuitionPaymentFragmentbindingInflater1 = null;
                }
            }
            return chain.proceed(request2);
        }
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Existing %s - linked to hc=%s", strHeader, Integer.valueOf(request != null ? request.hashCode() : 0)));
        }
        synchronized (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(request);
        }
        isPrimary isprimary = setscaletype.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (isprimary != null && (surfaceRequestExternalSyntheticLambda2 = setscaletype.TuitionPaymentFragmentbindingInflater1) != null) {
            isprimary.TuitionPaymentFragmentbindingInflater1(surfaceRequestExternalSyntheticLambda2.b);
        }
        setscaletype.TuitionPaymentFragmentbindingInflater1 = null;
        return chain.proceed(request2);
    }

    static setScaleType TuitionPaymentFragmentspecialinlinedviewModeldefault3(Request request, CameraCoordinator cameraCoordinator) {
        SurfaceRequestExternalSyntheticLambda2 surfaceRequestExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (request == null) {
            return null;
        }
        if (!CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get()) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("OneAgent not correctly initialized");
            }
            return null;
        }
        if (!provideSurface.b() || !mergeConfigs.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(EventType.WEB_REQUEST)) {
            return null;
        }
        if (request.header(provideSurface.TuitionPaymentFragmentbindingInflater1()) != null) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Ignore WR %s to %s (hc=%d)", request.getClass().getName(), cameraCoordinator.TuitionPaymentFragmentbindingInflater1(), Integer.valueOf(cameraCoordinator.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode())));
            }
            return null;
        }
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Add WR %s to %s (hc=%d)", request.getClass().getName(), cameraCoordinator.TuitionPaymentFragmentbindingInflater1(), Integer.valueOf(cameraCoordinator.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode())));
        }
        if (!CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getExtras) {
            return null;
        }
        isPrimary isprimary = isPrimary.read();
        if (isprimary == null || (surfaceRequestExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = isprimary.write()) == null) {
            surfaceRequestExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
        if (surfaceRequestExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            return null;
        }
        setScaleType setscaletype = new setScaleType(isprimary, surfaceRequestExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        setscaletype.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cameraCoordinator;
        setscaletype.TuitionPaymentFragmentbindingInflater1 = surfaceRequestExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        synchronized (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1.put(request, setscaletype);
        }
        return setscaletype;
    }
}
