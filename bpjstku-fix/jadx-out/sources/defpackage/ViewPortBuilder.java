package defpackage;

import android.app.Application;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.dynatrace.android.agent.conf.InstrumentationFlavor;
import com.dynatrace.android.callback.CallbackCore;
import com.dynatrace.android.callback.CbConstants;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewPortBuilder {
    private static final String b;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("Callback");
        b = sb.toString();
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(URLConnection uRLConnection) {
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get() && (uRLConnection instanceof HttpURLConnection)) {
            CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault2((HttpURLConnection) uRLConnection);
        }
    }

    public static InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault2(URLConnection uRLConnection) throws Exception {
        if (uRLConnection instanceof HttpURLConnection) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3((HttpURLConnection) uRLConnection);
        }
        return uRLConnection.getInputStream();
    }

    public static InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault3(HttpURLConnection httpURLConnection) throws Exception {
        if (!SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get()) {
            return httpURLConnection.getInputStream();
        }
        ZoomState zoomState = new ZoomState(httpURLConnection, CbConstants.WrMethod.getInputStream, CbConstants.WrStates.PRE_EXEC);
        try {
            try {
                try {
                    CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zoomState);
                } catch (Exception unused) {
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        ViewPort.TuitionPaymentFragmentbindingInflater1(zoomState.toString());
                    }
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                TuitionPaymentFragmentbindingInflater1(httpURLConnection, zoomState);
                zoomState.onTransact = CbConstants.WrStates.POST_EXEC_OK;
                try {
                    CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zoomState);
                } catch (Exception unused2) {
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        ViewPort.TuitionPaymentFragmentbindingInflater1(zoomState.toString());
                    }
                }
                TuitionPaymentFragmentbindingInflater1(httpURLConnection, zoomState);
                zoomState.onTransact = CbConstants.WrStates.POST_EXEC_ERR;
                try {
                    CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zoomState);
                } catch (Exception unused3) {
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        ViewPort.TuitionPaymentFragmentbindingInflater1(zoomState.toString());
                    }
                }
                return inputStream;
            } catch (Exception e2) {
                zoomState.f79a = e2.toString();
                throw e2;
            }
        } catch (Throwable th) {
            TuitionPaymentFragmentbindingInflater1(httpURLConnection, zoomState);
            zoomState.onTransact = CbConstants.WrStates.POST_EXEC_ERR;
            try {
                CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zoomState);
            } catch (Exception unused4) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.TuitionPaymentFragmentbindingInflater1(zoomState.toString());
                }
            }
            throw th;
        }
    }

    public static OutputStream TuitionPaymentFragmentbindingInflater1(URLConnection uRLConnection) throws Exception {
        if (uRLConnection instanceof HttpURLConnection) {
            return TuitionPaymentFragmentbindingInflater1((HttpURLConnection) uRLConnection);
        }
        return uRLConnection.getOutputStream();
    }

    public static OutputStream TuitionPaymentFragmentbindingInflater1(HttpURLConnection httpURLConnection) throws Exception {
        if (!SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get()) {
            return httpURLConnection.getOutputStream();
        }
        ZoomState zoomState = new ZoomState(httpURLConnection, CbConstants.WrMethod.getOutputStream, CbConstants.WrStates.PRE_EXEC);
        try {
            try {
                try {
                    CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zoomState);
                } catch (Exception unused) {
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        ViewPort.TuitionPaymentFragmentbindingInflater1(zoomState.toString());
                    }
                }
                OutputStream outputStream = httpURLConnection.getOutputStream();
                zoomState.onTransact = CbConstants.WrStates.POST_EXEC_OK;
                try {
                    CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zoomState);
                } catch (Exception unused2) {
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        ViewPort.TuitionPaymentFragmentbindingInflater1(zoomState.toString());
                    }
                }
                zoomState.onTransact = CbConstants.WrStates.POST_EXEC_ERR;
                try {
                    CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zoomState);
                } catch (Exception unused3) {
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        ViewPort.TuitionPaymentFragmentbindingInflater1(zoomState.toString());
                    }
                }
                return outputStream;
            } catch (Exception e2) {
                zoomState.f79a = e2.toString();
                throw e2;
            }
        } catch (Throwable th) {
            zoomState.onTransact = CbConstants.WrStates.POST_EXEC_ERR;
            try {
                CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zoomState);
            } catch (Exception unused4) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.TuitionPaymentFragmentbindingInflater1(zoomState.toString());
                }
            }
            throw th;
        }
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(HttpURLConnection httpURLConnection) throws Exception {
        if (!SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get()) {
            return httpURLConnection.getResponseCode();
        }
        ZoomState zoomState = new ZoomState(httpURLConnection, CbConstants.WrMethod.getResponseCode, CbConstants.WrStates.PRE_EXEC);
        int responseCode = -1;
        try {
            try {
                try {
                    CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zoomState);
                } catch (Exception unused) {
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        ViewPort.TuitionPaymentFragmentbindingInflater1(zoomState.toString());
                    }
                }
                responseCode = httpURLConnection.getResponseCode();
                TuitionPaymentFragmentbindingInflater1(httpURLConnection, zoomState);
                zoomState.onTransact = CbConstants.WrStates.POST_EXEC_OK;
                try {
                    CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zoomState);
                } catch (Exception unused2) {
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        ViewPort.TuitionPaymentFragmentbindingInflater1(zoomState.toString());
                    }
                }
                zoomState.g = responseCode;
                zoomState.onTransact = CbConstants.WrStates.POST_EXEC_ERR;
                try {
                    CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zoomState);
                } catch (Exception unused3) {
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        ViewPort.TuitionPaymentFragmentbindingInflater1(zoomState.toString());
                    }
                }
                return responseCode;
            } catch (Exception e2) {
                zoomState.f79a = e2.toString();
                throw e2;
            }
        } catch (Throwable th) {
            zoomState.g = responseCode;
            zoomState.onTransact = CbConstants.WrStates.POST_EXEC_ERR;
            try {
                CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zoomState);
            } catch (Exception unused4) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.TuitionPaymentFragmentbindingInflater1(zoomState.toString());
                }
            }
            throw th;
        }
    }

    private static int TuitionPaymentFragmentbindingInflater1(HttpURLConnection httpURLConnection, ZoomState zoomState) {
        int responseCode;
        try {
            responseCode = httpURLConnection.getResponseCode();
            try {
                zoomState.f79a = httpURLConnection.getResponseMessage();
            } catch (Exception e2) {
                e = e2;
                if (zoomState.f79a == null) {
                    zoomState.f79a = e.getMessage();
                }
            }
        } catch (Exception e3) {
            e = e3;
            responseCode = -1;
        }
        zoomState.g = responseCode;
        return responseCode;
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(View view) {
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get()) {
            CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CallbackCore.ListenerActionType.Clicked, view);
        }
    }

    public static void b() {
        CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault3(CallbackCore.ListenerActionType.Clicked);
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(View view) {
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get()) {
            CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CallbackCore.ListenerActionType.ItemClicked, view);
        }
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault3(CallbackCore.ListenerActionType.ItemClicked);
    }

    public static void asInterface() {
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get()) {
            CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault2(CallbackCore.ListenerActionType.PageSelected);
        }
    }

    public static void d() {
        CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault3(CallbackCore.ListenerActionType.PageSelected);
    }

    public static void b(View view) {
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get()) {
            CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CallbackCore.ListenerActionType.ItemSelected, view);
        }
    }

    public static void TuitionPaymentFragmentbindingInflater1() {
        CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault3(CallbackCore.ListenerActionType.ItemSelected);
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(MenuItem menuItem) {
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get()) {
            CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault3(CallbackCore.ListenerActionType.MenuItemClick, menuItem);
        }
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault3(CallbackCore.ListenerActionType.MenuItemClick);
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(MenuItem menuItem) {
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get()) {
            CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault3(CallbackCore.ListenerActionType.OptionsItemSelected, menuItem);
        }
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault3(CallbackCore.ListenerActionType.OptionsItemSelected);
    }

    public static void g() {
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get()) {
            CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CallbackCore.ListenerActionType.SwipeToRefresh, CallbackCore.ListenerActionType.SwipeToRefresh.toString());
        }
    }

    public static void asBinder() {
        CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault3(CallbackCore.ListenerActionType.SwipeToRefresh);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00be  */
    /* JADX WARN: Code duplicated, block: B:54:0x0103  */
    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Application application) {
        String strTrim;
        String string;
        String strTrim2;
        InstrumentationFlavor instrumentationFlavor;
        TorchState torchState = new TorchState("19d9aa65-82d4-4e2e-83d7-b4c1d97c47a6", "https://dynatrace-cag.bpjsketenagakerjaan.go.id:443/mbeacon/541e660a-b2fc-41da-89ce-90546c797369");
        String str = torchState.g;
        SurfaceRequestTransformationInfo surfaceRequestTransformationInfo = null;
        if (str != null && torchState.INotificationSideChannelStub != null) {
            if (str != null) {
                strTrim = str.trim();
                if (strTrim.length() <= 0) {
                    strTrim = null;
                }
            } else {
                strTrim = null;
            }
            if (strTrim != null) {
                Matcher matcher = Pattern.compile("^(https?://)?([^\\s/$.?#](?::?[^\\s?]*\\@)?[^\\s/:?]*(?::[\\d]+)?)(?:/|$)([^\\s?]*)").matcher(strTrim);
                matcher.find();
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    String strGroup3 = matcher.group(3);
                    if (strGroup2 == null || strGroup2.isEmpty() || strGroup3 == null || strGroup3.isEmpty()) {
                        string = null;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        if (strGroup == null) {
                            strGroup = "https://";
                        }
                        sb.append(strGroup);
                        sb.append(strGroup2);
                        if (strGroup3 != null && !strGroup3.isEmpty()) {
                            sb.append("/");
                            if (strGroup3.endsWith("/")) {
                                sb.append((CharSequence) strGroup3, 0, strGroup3.length() - 1);
                            } else {
                                sb.append(strGroup3);
                            }
                        }
                        string = sb.toString();
                    }
                } else {
                    string = null;
                }
            } else {
                string = null;
            }
            if (string == null) {
                if (torchState.d) {
                    StringBuilder sb2 = new StringBuilder("invalid value for the beacon url \"");
                    sb2.append(torchState.g);
                    sb2.append("\"");
                    ViewPort.asInterface(sb2.toString());
                    ViewPort.asInterface("discard invalid configuration");
                }
            } else {
                String str2 = torchState.b;
                if (str2 != null) {
                    strTrim2 = str2.trim();
                    if (strTrim2.length() <= 0) {
                        strTrim2 = null;
                    }
                } else {
                    strTrim2 = null;
                }
                if (strTrim2 == null) {
                    if (torchState.d) {
                        StringBuilder sb3 = new StringBuilder("invalid value for application id \"");
                        sb3.append(torchState.b);
                        sb3.append("\"");
                        ViewPort.asInterface(sb3.toString());
                        ViewPort.asInterface("discard invalid configuration");
                    }
                } else {
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strTrim2, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
                    String strReplaceAll = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strTuitionPaymentFragmentspecialinlinedviewModeldefault3).replaceAll("_", "%5F");
                    if (torchState.INotificationSideChannel != InstrumentationFlavor.PLAIN) {
                        instrumentationFlavor = torchState.INotificationSideChannel;
                    } else {
                        AutoValue_Image2JpegBytes_In autoValue_Image2JpegBytes_In = AutoValue_Image2JpegBytes_In.INSTANCE;
                        if (AutoValue_Image2JpegBytes_In.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                            instrumentationFlavor = InstrumentationFlavor.JETPACK_COMPOSE;
                        } else {
                            instrumentationFlavor = torchState.INotificationSideChannel;
                        }
                    }
                    surfaceRequestTransformationInfo = new SurfaceRequestTransformationInfo(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, strReplaceAll, string, torchState.INotificationSideChannelStub, torchState.asInterface, torchState.INotificationSideChannelDefault, torchState.getInterfaceDescriptor, torchState.notify, torchState.getNotifyChildrenChangedOptions, torchState.connect, torchState.read, torchState.TuitionPaymentFragmentspecialinlinedviewModeldefault1, torchState.TuitionPaymentFragmentspecialinlinedviewModeldefault3, torchState.asBinder, torchState.getRoot, torchState.RemoteActionCompatParcelizer, torchState.INotificationSideChannelStubProxy, torchState.cancel, torchState.onTransact, torchState.d, torchState.TuitionPaymentFragmentbindingInflater1, torchState.f231a, torchState.IconCompatParcelizer, torchState.write, instrumentationFlavor, torchState.MediaBrowserCompat, torchState.cancelAll, torchState.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            }
        } else if (torchState.d) {
            ViewPort.asInterface("discard invalid configuration");
        }
        CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault2(application, surfaceRequestTransformationInfo);
    }
}
