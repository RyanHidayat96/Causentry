package defpackage;

import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.callback.CallbackCore;
import com.dynatrace.android.callback.CbConstants;
import java.util.WeakHashMap;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.client.methods.HttpRequestBase;

/* JADX INFO: loaded from: classes6.dex */
final class CameraCoordinatorCameraOperatingMode {
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final WeakHashMap<HttpRequest, setScaleType> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    CameraCoordinatorCameraOperatingMode() {
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("HttpClientCallbackCore");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = sb.toString();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new WeakHashMap<>();
    }

    static setScaleType N_(HttpRequestBase httpRequestBase) {
        return M_(httpRequestBase, CameraCoordinatorConcurrentCameraModeListener.I_(httpRequestBase));
    }

    private static setScaleType M_(HttpRequest httpRequest, HttpHost httpHost) {
        SurfaceRequestExternalSyntheticLambda2 surfaceRequestExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (httpRequest == null || !provideSurface.b() || !mergeConfigs.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(EventType.WEB_REQUEST)) {
            return null;
        }
        ViewPortScaleType viewPortScaleTypeH_ = ViewPortScaleType.H_(httpRequest, httpHost);
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Add WR to %s", viewPortScaleTypeH_.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
        }
        if (!CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get()) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("OneAgent not correctly initialized");
            }
            return null;
        }
        if (!CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getExtras) {
            return null;
        }
        isPrimary isprimary = isPrimary.read();
        if (isprimary == null || (surfaceRequestExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdanew2.G_(isprimary, httpRequest)) == null) {
            if (!provideSurface.b() || httpRequest == null || (surfaceRequestExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) == null) {
                surfaceRequestExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            } else {
                httpRequest.setHeader(provideSurface.TuitionPaymentFragmentbindingInflater1(), surfaceRequestExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1.toString());
            }
        }
        if (surfaceRequestExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            return null;
        }
        setScaleType setscaletype = new setScaleType(isprimary, surfaceRequestExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        WeakHashMap<HttpRequest, setScaleType> weakHashMap = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        synchronized (weakHashMap) {
            weakHashMap.put(httpRequest, setscaletype);
        }
        setscaletype.TuitionPaymentFragmentbindingInflater1 = surfaceRequestExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return setscaletype;
    }

    static void TuitionPaymentFragmentbindingInflater1(getImageReaderProxyProvider getimagereaderproxyprovider) {
        if (getimagereaderproxyprovider.b == null || !CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getExtras) {
            return;
        }
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("%s of %s of %s to %s", getimagereaderproxyprovider.onTransact, getimagereaderproxyprovider.notify, getimagereaderproxyprovider.b.getClass().getSimpleName(), getimagereaderproxyprovider.TuitionPaymentFragmentbindingInflater1()));
        }
        WeakHashMap<HttpRequest, setScaleType> weakHashMap = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        setScaleType setscaletypeM_ = weakHashMap.get(getimagereaderproxyprovider.b);
        if (setscaletypeM_ == null) {
            if (CbConstants.WrStates.PRE_EXEC != getimagereaderproxyprovider.onTransact) {
                return;
            } else {
                setscaletypeM_ = M_(getimagereaderproxyprovider.b, getimagereaderproxyprovider.TuitionPaymentFragmentbindingInflater1);
            }
        }
        if (setscaletypeM_ != null) {
            setscaletypeM_.TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdanew2.F_(getimagereaderproxyprovider.b));
            setscaletypeM_.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getimagereaderproxyprovider);
            if (setscaletypeM_.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                synchronized (weakHashMap) {
                    weakHashMap.remove(getimagereaderproxyprovider.b);
                }
                setscaletypeM_.b(getimagereaderproxyprovider);
            }
        }
    }
}
