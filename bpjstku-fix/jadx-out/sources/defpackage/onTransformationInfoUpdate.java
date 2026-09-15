package defpackage;

import com.dynatrace.android.agent.conf.AgentMode;
import com.dynatrace.android.agent.conf.InstrumentationFlavor;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class onTransformationInfoUpdate {
    public static SurfaceRequestExternalSyntheticLambda0 INotificationSideChannelDefault() {
        return null;
    }

    public static boolean INotificationSideChannelStub() {
        return true;
    }

    public static boolean INotificationSideChannelStubProxy() {
        return false;
    }

    public static int RemoteActionCompatParcelizer() {
        return 60000;
    }

    public static boolean TuitionPaymentFragmentbindingInflater1() {
        return true;
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return true;
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return true;
    }

    public static boolean a() {
        return false;
    }

    public static boolean asBinder() {
        return true;
    }

    public static boolean asInterface() {
        return true;
    }

    public static boolean b() {
        return true;
    }

    public static boolean cancel() {
        return false;
    }

    public static boolean connect() {
        return true;
    }

    public static int d() {
        return 500;
    }

    public static boolean g() {
        return true;
    }

    public static boolean getInterfaceDescriptor() {
        return true;
    }

    public static boolean read() {
        return true;
    }

    static {
        InstrumentationFlavor instrumentationFlavor = InstrumentationFlavor.PLAIN;
    }

    @Deprecated
    public static SurfaceRequestTransformationInfo TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        new onTransformationInfoUpdate();
        return new SurfaceRequestTransformationInfo("", "", "", AgentMode.SAAS, true, null, null, 500, 60000, true, false, true, true, true, true, new String[0], new String[0], false, true, true, true, null, false, true, InstrumentationFlavor.PLAIN, null, true, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigurationPreset{, graceTime=500");
        sb.append(", waitTime=60000");
        sb.append(", applicationMonitoring=true");
        sb.append(", activityMonitoring=true");
        sb.append(", certificateValidation=true");
        sb.append(", sendEmptyActions=true");
        sb.append(", namePrivacy=false");
        sb.append(", crashReporting=true");
        sb.append(", webRequestTiming=true");
        sb.append(", monitoredDomains=");
        sb.append(Arrays.toString(new String[0]));
        sb.append(", monitoredHttpsDomains=");
        sb.append(Arrays.toString(new String[0]));
        sb.append(", hybridApp=false");
        sb.append(", fileDomainCookies=true");
        sb.append(", debugLogLevel=true");
        sb.append(", autoStart=true");
        sb.append(", userOptIn=false");
        sb.append(", startupLoadBalancing=true");
        sb.append(", instrumentationFlavor=");
        sb.append(InstrumentationFlavor.PLAIN);
        sb.append(", sessionReplayComponentProvider=");
        sb.append((Object) null);
        sb.append(", isRageTapDetectionEnabled=true");
        sb.append('}');
        return sb.toString();
    }

    public static InstrumentationFlavor onTransact() {
        return InstrumentationFlavor.PLAIN;
    }

    public static String[] INotificationSideChannel() {
        return new String[0];
    }

    public static String[] cancelAll() {
        return new String[0];
    }
}
