package defpackage;

import androidx.core.os.EnvironmentCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.dynatrace.android.agent.conf.DataCollectionLevel;
import com.dynatrace.android.agent.conf.InstrumentationFlavor;
import com.dynatrace.android.agent.metrics.ConnectionType;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdasetTransformationInfoListener8 {
    private static final String b;
    private final InstrumentationFlavor TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private addUseCase TuitionPaymentFragmentbindingInflater1 = addUseCase.b();
    String TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "";
    private Long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0L;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("BasicSegment");
        b = sb.toString();
    }

    protected lambdasetTransformationInfoListener8(InstrumentationFlavor instrumentationFlavor) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = instrumentationFlavor;
    }

    public static boolean TuitionPaymentFragmentbindingInflater1(SurfaceRequest1 surfaceRequest1) {
        Iterator<String> it = surfaceRequest1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.iterator();
        while (it.hasNext()) {
            if (it.next().contains("&pa=0")) {
                StringBuilder sb = new StringBuilder();
                sb.append(surfaceRequest1.TuitionPaymentFragmentbindingInflater1);
                sb.append("&nu=1");
                surfaceRequest1.TuitionPaymentFragmentbindingInflater1 = sb.toString();
                return true;
            }
        }
        return false;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(boolean z) {
        if (z) {
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1();
        }
        if (SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1() - this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.longValue() <= 5000) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Long.valueOf(SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1());
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public final StringBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault1(mergeConfigs mergeconfigs) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        getSessionConfigCameraCaptureCallbacks getsessionconfigcameracapturecallbacks = this.TuitionPaymentFragmentbindingInflater1.INotificationSideChannelStubProxy;
        sb.append("vv=3&va=");
        sb.append("8.287.1.1006");
        sb.append("&ap=");
        sb.append(lambdaprovideSurface5.b);
        sb.append("&an=");
        sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaprovideSurface5.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        sb.append("&ai=");
        sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1));
        checkEffectTargets checkeffecttargets = this.TuitionPaymentFragmentbindingInflater1.b;
        if (checkeffecttargets == null) {
            sb.append("&vb=0");
        } else {
            sb.append("&vb=");
            sb.append(checkeffecttargets.b);
            if (checkeffecttargets.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(checkeffecttargets.TuitionPaymentFragmentspecialinlinedviewModeldefault2, 50);
                sb.append("&vn=");
                sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strTuitionPaymentFragmentspecialinlinedviewModeldefault3));
            }
        }
        sb.append("&vi=");
        sb.append(mergeconfigs.cancelAll);
        sb.append("&sn=");
        sb.append(mergeconfigs.d);
        sb.append("&ss=");
        sb.append(mergeconfigs.b);
        sb.append("&rm=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1.d);
        sb.append("&cp=");
        sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
        sb.append("&os=");
        sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1.cancel));
        sb.append("&mf=");
        sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1.onTransact != null ? this.TuitionPaymentFragmentbindingInflater1.onTransact : EnvironmentCompat.MEDIA_UNKNOWN, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION)));
        sb.append("&md=");
        sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1.notify));
        sb.append("&rj=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1.INotificationSideChannel ? "r" : "g");
        sb.append("&ul=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1.getInterfaceDescriptor);
        if (getsessionconfigcameracapturecallbacks != null) {
            if (getsessionconfigcameracapturecallbacks.b > getsessionconfigcameracapturecallbacks.TuitionPaymentFragmentbindingInflater1) {
                sb.append("&sw=");
                sb.append(getsessionconfigcameracapturecallbacks.TuitionPaymentFragmentbindingInflater1);
                sb.append("&sh=");
                sb.append(getsessionconfigcameracapturecallbacks.b);
            } else {
                sb.append("&sw=");
                sb.append(getsessionconfigcameracapturecallbacks.b);
                sb.append("&sh=");
                sb.append(getsessionconfigcameracapturecallbacks.TuitionPaymentFragmentbindingInflater1);
            }
            sb.append("&sd=");
            sb.append(getsessionconfigcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        sb.append("&pt=0");
        if (this.TuitionPaymentFragmentbindingInflater1.asBinder == 2) {
            str = "l";
        } else {
            str = this.TuitionPaymentFragmentbindingInflater1.asBinder == 1 ? "p" : null;
        }
        if (str != null) {
            sb.append("&so=");
            sb.append(str);
        }
        if (this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 >= 0) {
            sb.append("&bl=");
            sb.append(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1);
        }
        if (this.TuitionPaymentFragmentbindingInflater1.asInterface != null) {
            sb.append("&fm=");
            sb.append(this.TuitionPaymentFragmentbindingInflater1.asInterface);
        }
        if (this.TuitionPaymentFragmentbindingInflater1.g != null) {
            sb.append("&cr=");
            sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1.g));
        }
        if (this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != ConnectionType.OTHER) {
            sb.append("&ct=");
            sb.append(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.protocolValue);
            if (this.TuitionPaymentFragmentbindingInflater1.cancelAll != null && this.TuitionPaymentFragmentbindingInflater1.cancelAll.length() > 0) {
                sb.append("&np=");
                sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1.cancelAll));
            }
        }
        bindToCamera bindtocamera = mergeconfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (str3 != null && str3.length() > 0 && bindtocamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == DataCollectionLevel.USER_BEHAVIOR) {
            sb.append("&lx=");
            sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
        }
        sb.append("&tt=maandroid&dl=");
        sb.append(bindtocamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.ordinal());
        sb.append("&cl=");
        getAttachedStreamSpec getattachedstreamspec = bindtocamera.TuitionPaymentFragmentbindingInflater1;
        if (!getSecondaryCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            str2 = "0";
        } else {
            str2 = getattachedstreamspec.TuitionPaymentFragmentspecialinlinedviewModeldefault1 ? ExifInterface.GPS_MEASUREMENT_2D : "1";
        }
        sb.append(str2);
        sb.append("&fv=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.protocolValue);
        return sb;
    }

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        public static String TuitionPaymentFragmentbindingInflater1(long j, int i, String str) {
            StringBuilder sb = new StringBuilder("&tv=");
            sb.append(j);
            sb.append("&tx=__tsNow__&mp=");
            if (i < 0) {
                i = 1;
            }
            sb.append(i);
            if (str != null) {
                sb.append("&sr=");
                sb.append(str);
            }
            return sb.toString();
        }
    }
}
