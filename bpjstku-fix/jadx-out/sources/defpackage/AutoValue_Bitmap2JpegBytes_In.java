package defpackage;

import com.dynatrace.android.callback.CallbackCore;
import com.dynatrace.android.callback.CbConstants;
import java.io.IOException;
import java.util.List;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoValue_Bitmap2JpegBytes_In {
    private static final String TuitionPaymentFragmentbindingInflater1;

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("OkCallback");
        TuitionPaymentFragmentbindingInflater1 = sb.toString();
    }

    public static void TuitionPaymentFragmentbindingInflater1(OkHttpClient.Builder builder) {
        try {
            List<Interceptor> listInterceptors = builder.interceptors();
            listInterceptors.remove(onCameraOperatingModeUpdated.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            listInterceptors.add(0, onCameraOperatingModeUpdated.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } catch (Exception e2) {
            ViewPort.a(e2.getMessage());
        }
    }

    public static Response TuitionPaymentFragmentspecialinlinedviewModeldefault2(Call call) throws Exception {
        if (!SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get()) {
            return call.execute();
        }
        if (call == null) {
            return null;
        }
        CameraCoordinator cameraCoordinator = new CameraCoordinator(call.request(), CbConstants.WrMethod.execute, CbConstants.WrStates.PRE_EXEC);
        try {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(cameraCoordinator);
            Response responseExecute = call.execute();
            cameraCoordinator.TuitionPaymentFragmentbindingInflater1(responseExecute);
            cameraCoordinator.INotificationSideChannel = new getErrorEdge().TuitionPaymentFragmentspecialinlinedviewModeldefault1(responseExecute.headers("Server-Timing"));
            int iCode = responseExecute.code();
            String strMessage = responseExecute.message();
            CbConstants.WrStates wrStates = CbConstants.WrStates.POST_EXEC_OK;
            cameraCoordinator.g = iCode;
            cameraCoordinator.f79a = strMessage;
            cameraCoordinator.onTransact = wrStates;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(cameraCoordinator);
            return responseExecute;
        } catch (Exception e2) {
            String string = e2.toString();
            CbConstants.WrStates wrStates2 = CbConstants.WrStates.POST_EXEC_ERR;
            cameraCoordinator.g = 0;
            cameraCoordinator.f79a = string;
            cameraCoordinator.onTransact = wrStates2;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(cameraCoordinator);
            throw e2;
        }
    }

    public static void b(Call call, Callback callback) {
        if (!SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get()) {
            call.enqueue(callback);
            return;
        }
        if (call == null) {
            return;
        }
        CameraCoordinator cameraCoordinator = new CameraCoordinator(call.request(), CbConstants.WrMethod.enqueue, CbConstants.WrStates.PRE_EXEC);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(cameraCoordinator);
        try {
            call.enqueue(callback);
        } catch (RuntimeException e2) {
            String string = e2.toString();
            CbConstants.WrStates wrStates = CbConstants.WrStates.POST_EXEC_ERR;
            cameraCoordinator.g = 0;
            cameraCoordinator.f79a = string;
            cameraCoordinator.onTransact = wrStates;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(cameraCoordinator);
            throw e2;
        }
    }

    public static void b(Call call, Response response) {
        setScaleType setscaletype;
        if (!SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get() || call == null || (setscaletype = onCameraOperatingModeUpdated.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(call.request())) == null) {
            return;
        }
        ((CameraCoordinator) setscaletype.TuitionPaymentFragmentspecialinlinedviewModeldefault3).TuitionPaymentFragmentbindingInflater1(response);
        setscaletype.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel = new getErrorEdge().TuitionPaymentFragmentspecialinlinedviewModeldefault1(response.headers("Server-Timing"));
        AutoValue_CaptureNode_In autoValue_CaptureNode_In = setscaletype.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iCode = response.code();
        String strMessage = response.message();
        CbConstants.WrStates wrStates = CbConstants.WrStates.POST_EXEC_OK;
        if (autoValue_CaptureNode_In != null) {
            autoValue_CaptureNode_In.g = iCode;
            autoValue_CaptureNode_In.f79a = strMessage;
            autoValue_CaptureNode_In.onTransact = wrStates;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1((CameraCoordinator) autoValue_CaptureNode_In);
        }
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Call call, IOException iOException) {
        setScaleType setscaletype;
        if (!SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get() || call == null || (setscaletype = onCameraOperatingModeUpdated.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(call.request())) == null) {
            return;
        }
        AutoValue_CaptureNode_In autoValue_CaptureNode_In = setscaletype.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String string = iOException.toString();
        CbConstants.WrStates wrStates = CbConstants.WrStates.POST_EXEC_ERR;
        if (autoValue_CaptureNode_In != null) {
            autoValue_CaptureNode_In.g = 0;
            autoValue_CaptureNode_In.f79a = string;
            autoValue_CaptureNode_In.onTransact = wrStates;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1((CameraCoordinator) autoValue_CaptureNode_In);
        }
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraCoordinator cameraCoordinator) {
        if (cameraCoordinator.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null || !CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getExtras) {
            return;
        }
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("%s of %s of %s to %s (%d)", cameraCoordinator.onTransact, cameraCoordinator.notify, cameraCoordinator.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getClass().getName(), cameraCoordinator.TuitionPaymentFragmentbindingInflater1(), Integer.valueOf(cameraCoordinator.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode())));
        }
        setScaleType setscaletypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = onCameraOperatingModeUpdated.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(cameraCoordinator.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        if (setscaletypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null && CbConstants.WrStates.PRE_EXEC == cameraCoordinator.onTransact) {
            onCameraOperatingModeUpdated oncameraoperatingmodeupdated = onCameraOperatingModeUpdated.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            setscaletypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = onCameraOperatingModeUpdated.TuitionPaymentFragmentspecialinlinedviewModeldefault3(cameraCoordinator.TuitionPaymentFragmentspecialinlinedviewModeldefault3, cameraCoordinator);
        }
        if (setscaletypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            setscaletypeTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cameraCoordinator);
            if (setscaletypeTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                synchronized (onCameraOperatingModeUpdated.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    onCameraOperatingModeUpdated.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(cameraCoordinator.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
                setscaletypeTuitionPaymentFragmentspecialinlinedviewModeldefault3.b(cameraCoordinator);
            }
        }
    }
}
