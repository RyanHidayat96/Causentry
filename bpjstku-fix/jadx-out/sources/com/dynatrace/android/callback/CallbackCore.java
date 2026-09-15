package com.dynatrace.android.callback;

import android.app.Application;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.dynatrace.android.agent.EventType;
import defpackage.CameraRequest;
import defpackage.CaptureNode1ExternalSyntheticLambda0;
import defpackage.CaptureNode2;
import defpackage.SurfaceRequestExternalSyntheticLambda1;
import defpackage.SurfaceRequestExternalSyntheticLambda2;
import defpackage.SurfaceRequestExternalSyntheticLambda5;
import defpackage.SurfaceRequestTransformationInfo;
import defpackage.UseCaseGroupBuilder;
import defpackage.ViewPort;
import defpackage.ZoomState;
import defpackage.getDeferrableSurface;
import defpackage.isPrimary;
import defpackage.lambdaprovideSurface5;
import defpackage.lambdareleaseInputResources3;
import defpackage.mergeConfigs;
import defpackage.onTransformationInfoUpdate;
import defpackage.propagatePostviewImage;
import defpackage.provideSurface;
import defpackage.setScaleType;
import defpackage.setViewPort;
import java.net.HttpURLConnection;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class CallbackCore {
    public static boolean TuitionPaymentFragmentbindingInflater1;
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static SurfaceRequestTransformationInfo TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static AtomicBoolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static WeakHashMap<HttpURLConnection, setScaleType> asBinder;
    private static volatile ListenerActionType b;
    private static volatile isPrimary g;

    public enum ListenerActionType {
        Clicked,
        ItemClicked,
        ItemSelected,
        MenuItemClick,
        OptionsItemSelected,
        PageSelected,
        SwipeToRefresh
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("CallbackCore");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = sb.toString();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AtomicBoolean(false);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = onTransformationInfoUpdate.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1 = false;
        asBinder = new WeakHashMap<>();
        g = null;
        b = null;
    }

    public static String b() {
        String property = System.getProperty("http.agent");
        if (property != null) {
            return property;
        }
        StringBuilder sb = new StringBuilder("Java/");
        sb.append(System.getProperty("java.version"));
        return sb.toString();
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, SurfaceRequestTransformationInfo surfaceRequestTransformationInfo) {
        if (context != null) {
            Application application = (Application) context.getApplicationContext();
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault3.getAndSet(true)) {
                return;
            }
            if (lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                surfaceRequestTransformationInfo = lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            } else if (surfaceRequestTransformationInfo == null) {
                return;
            }
            if (surfaceRequestTransformationInfo.onTransact) {
                SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = surfaceRequestTransformationInfo;
            if (!surfaceRequestTransformationInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                StringBuilder sb = new StringBuilder("Runtime properties: ");
                sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
            }
            if (ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Isolated service detected. Monitoring deactivated for this process");
                    return;
                }
                return;
            }
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                provideSurface.TuitionPaymentFragmentbindingInflater1(application, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            if (lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().g == null) {
                lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentspecialinlinedviewModeldefault2, application);
            }
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault2.b) {
                propagatePostviewImage propagatepostviewimageTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                SurfaceRequestExternalSyntheticLambda5 surfaceRequestExternalSyntheticLambda5 = SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (propagatepostviewimageTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                    UseCaseGroupBuilder useCaseGroupBuilder = new UseCaseGroupBuilder(surfaceRequestExternalSyntheticLambda5);
                    setViewPort setviewportTuitionPaymentFragmentspecialinlinedviewModeldefault1 = useCaseGroupBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    setViewPort setviewportTuitionPaymentFragmentspecialinlinedviewModeldefault2 = useCaseGroupBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    String str = lambdaprovideSurface5.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (str == null || str.isEmpty()) {
                        str = "null";
                    }
                    lambdareleaseInputResources3 lambdareleaseinputresources3 = propagatepostviewimageTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    CaptureNode2 captureNode2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdareleaseinputresources3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, setviewportTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    captureNode2TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(5000);
                    CaptureNode1ExternalSyntheticLambda0 captureNode1ExternalSyntheticLambda0 = new CaptureNode1ExternalSyntheticLambda0(str, captureNode2TuitionPaymentFragmentspecialinlinedviewModeldefault1, lambdareleaseinputresources3);
                    lambdareleaseinputresources3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(captureNode1ExternalSyntheticLambda0);
                    CameraRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new CameraRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = setviewportTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1.b = captureNode2TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = captureNode1ExternalSyntheticLambda0;
                    lambdareleaseinputresources3.b = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    lambdareleaseinputresources3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.registerActivityLifecycleCallbacks(lambdareleaseinputresources3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            }
        }
    }

    public static setScaleType TuitionPaymentFragmentspecialinlinedviewModeldefault2(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null && provideSurface.b() && mergeConfigs.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(EventType.WEB_REQUEST)) {
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(httpURLConnection, (byte) 0).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static setScaleType TuitionPaymentFragmentspecialinlinedviewModeldefault3(HttpURLConnection httpURLConnection) {
        SurfaceRequestExternalSyntheticLambda2 surfaceRequestExternalSyntheticLambda2B;
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Add WR %s to %s", httpURLConnection.getClass().getSimpleName(), httpURLConnection.getURL().toString()));
        }
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3.get()) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("OneAgent not correctly initialized");
            }
            return null;
        }
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault2.getExtras) {
            return null;
        }
        isPrimary isprimary = isPrimary.read();
        if (isprimary == null || (surfaceRequestExternalSyntheticLambda2B = isprimary.TuitionPaymentFragmentbindingInflater1(httpURLConnection)) == null) {
            surfaceRequestExternalSyntheticLambda2B = b(httpURLConnection);
        }
        if (surfaceRequestExternalSyntheticLambda2B == null) {
            return null;
        }
        setScaleType setscaletype = new setScaleType(isprimary, surfaceRequestExternalSyntheticLambda2B.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        synchronized (asBinder) {
            asBinder.put(httpURLConnection, setscaletype);
        }
        setscaletype.TuitionPaymentFragmentbindingInflater1 = surfaceRequestExternalSyntheticLambda2B;
        return setscaletype;
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ZoomState zoomState) {
        if (zoomState.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null || !TuitionPaymentFragmentspecialinlinedviewModeldefault2.getExtras) {
            return;
        }
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("%s of %s of %s to %s", zoomState.onTransact, zoomState.notify, zoomState.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getClass().getSimpleName(), zoomState.TuitionPaymentFragmentbindingInflater1()));
        }
        setScaleType setscaletype = asBinder.get(zoomState.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        if (setscaletype != null) {
            if (CbConstants.WrStates.PRE_EXEC == zoomState.onTransact) {
                setscaletype.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SurfaceRequestExternalSyntheticLambda2.TuitionPaymentFragmentbindingInflater1(zoomState.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
            }
            setscaletype.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zoomState);
            if (setscaletype.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                synchronized (asBinder) {
                    asBinder.remove(zoomState.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
                setscaletype.b(zoomState);
            }
        }
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ListenerActionType listenerActionType) {
        StringBuilder sb = new StringBuilder("Initiate ");
        sb.append(listenerActionType.toString());
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(listenerActionType, sb.toString());
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ListenerActionType listenerActionType, String str) {
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("onUA: %s entry=true actionName=%s", listenerActionType, str));
        }
        if (g != null && b != listenerActionType) {
            g.TuitionPaymentFragmentspecialinlinedviewModeldefault2(0);
            g = null;
            b = null;
        }
        if (g == null && SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get()) {
            g = isPrimary.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, mergeConfigs.TuitionPaymentFragmentbindingInflater1(false), lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().notify);
            b = listenerActionType;
        }
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("onUA: %s entry=true", listenerActionType));
        }
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ListenerActionType listenerActionType) {
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            StringBuilder sb = new StringBuilder("onUA: ");
            sb.append(listenerActionType);
            sb.append(" entry=false");
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
        }
        if (g == null || b != listenerActionType) {
            return;
        }
        g.getNotifyChildrenChangedOptions();
        g = null;
        b = null;
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends Thread {
        private static HashSet<Integer> b = new HashSet<>();
        private HttpURLConnection TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1(HttpURLConnection httpURLConnection, byte b2) {
            this(httpURLConnection);
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault1(HttpURLConnection httpURLConnection) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = httpURLConnection;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public setScaleType TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            WeakHashMap weakHashMap;
            setScaleType setscaletypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            try {
                setScaleType setscaletype = (setScaleType) CallbackCore.asBinder.get(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                if (setscaletype != null) {
                    return setscaletype;
                }
                String strTuitionPaymentFragmentbindingInflater1 = SurfaceRequestExternalSyntheticLambda2.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                if (strTuitionPaymentFragmentbindingInflater1 != null) {
                    synchronized (CallbackCore.asBinder) {
                        weakHashMap = new WeakHashMap(CallbackCore.asBinder);
                    }
                    for (Map.Entry entry : weakHashMap.entrySet()) {
                        SurfaceRequestExternalSyntheticLambda2 surfaceRequestExternalSyntheticLambda2 = ((setScaleType) entry.getValue()).TuitionPaymentFragmentbindingInflater1;
                        if (strTuitionPaymentFragmentbindingInflater1 != null && surfaceRequestExternalSyntheticLambda2.toString().equals(strTuitionPaymentFragmentbindingInflater1)) {
                            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                String unused = CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                StringBuilder sb = new StringBuilder();
                                sb.append("replace tracking for tag ");
                                sb.append(strTuitionPaymentFragmentbindingInflater1);
                                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
                            }
                            CallbackCore.asBinder.remove(entry.getKey());
                            CallbackCore.asBinder.put(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (setScaleType) entry.getValue());
                            return (setScaleType) entry.getValue();
                        }
                    }
                    return null;
                }
            } catch (Exception unused2) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    String unused3 = CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    ViewPort.TuitionPaymentFragmentbindingInflater1("can't access tracking state");
                }
            }
            if (b.contains(Integer.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()))) {
                return null;
            }
            b.add(Integer.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()));
            for (int i = 0; i <= 3; i++) {
                try {
                    setscaletypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = CallbackCore.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    break;
                } catch (Exception unused4) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused5) {
                    }
                }
            }
            b.remove(Integer.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()));
            return setscaletypeTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ListenerActionType listenerActionType, MenuItem menuItem) {
        String string;
        if (menuItem == null) {
            StringBuilder sb = new StringBuilder("Initiate ");
            sb.append(listenerActionType.toString());
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(listenerActionType, sb.toString());
            return;
        }
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2.MediaBrowserCompat) {
            StringBuilder sb2 = new StringBuilder("Touch on ");
            sb2.append(menuItem.getClass().getSimpleName());
            string = sb2.toString();
        } else {
            CharSequence title = menuItem.getTitle();
            if (title != null && title.length() > 0) {
                string = "Touch on ".concat(String.valueOf(title));
            } else {
                StringBuilder sb3 = new StringBuilder("Touch on ");
                sb3.append(menuItem.getClass().getSimpleName());
                string = sb3.toString();
            }
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(listenerActionType, string);
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ListenerActionType listenerActionType, View view) {
        String string;
        CharSequence text;
        if (view == null) {
            StringBuilder sb = new StringBuilder("Initiate ");
            sb.append(listenerActionType.toString());
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(listenerActionType, sb.toString());
            return;
        }
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2.MediaBrowserCompat) {
            StringBuilder sb2 = new StringBuilder("Touch on ");
            sb2.append(view.getClass().getSimpleName());
            string = sb2.toString();
        } else {
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null && contentDescription.length() > 0) {
                string = "Touch on ".concat(String.valueOf(contentDescription));
            } else if ((view instanceof TextView) && (text = ((TextView) view).getText()) != null && text.length() > 0) {
                string = "Touch on ".concat(String.valueOf(text));
            } else {
                StringBuilder sb3 = new StringBuilder("Touch on ");
                sb3.append(view.getClass().getSimpleName());
                string = sb3.toString();
            }
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(listenerActionType, string);
    }

    private static SurfaceRequestExternalSyntheticLambda2 b(HttpURLConnection httpURLConnection) {
        SurfaceRequestExternalSyntheticLambda2 surfaceRequestExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (surfaceRequestExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            try {
                httpURLConnection.setRequestProperty(provideSurface.TuitionPaymentFragmentbindingInflater1(), surfaceRequestExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1.toString());
                return surfaceRequestExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            } catch (Exception e2) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.asInterface(e2.toString());
                }
            }
        }
        return surfaceRequestExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }
}
