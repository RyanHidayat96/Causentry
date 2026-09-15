package defpackage;

import com.dynatrace.android.agent.conf.AgentMode;
import com.dynatrace.android.agent.conf.InstrumentationFlavor;
import java.security.KeyStore;
import java.util.Arrays;
import javax.net.ssl.KeyManager;

/* JADX INFO: loaded from: classes3.dex */
public final class SurfaceRequestTransformationInfo {
    public final boolean INotificationSideChannel;
    public final KeyStore INotificationSideChannelDefault;
    public final KeyManager[] INotificationSideChannelStub;
    public final boolean INotificationSideChannelStubProxy;
    public final boolean IconCompatParcelizer;
    public final boolean MediaBrowserCompat;
    public final String[] RemoteActionCompatParcelizer;
    public final boolean TuitionPaymentFragmentbindingInflater1;
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f230a;
    public final boolean asBinder;
    public final boolean asInterface;
    public final boolean b;
    public final boolean cancel;
    public final int cancelAll;
    public final boolean connect;
    public final SurfaceRequestExternalSyntheticLambda3 d;
    public final SurfaceRequest2 g;
    public final boolean getExtras;
    public final AgentMode getInterfaceDescriptor;
    public final int getNotifyChildrenChangedOptions;
    public final boolean getRoot;
    public final InstrumentationFlavor notify;
    public final boolean onTransact;
    public final String[] read;
    public final SurfaceRequestExternalSyntheticLambda0 write;

    public SurfaceRequestTransformationInfo(String str, String str2, String str3, AgentMode agentMode, boolean z, KeyStore keyStore, KeyManager[] keyManagerArr, int i, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String[] strArr, String[] strArr2, boolean z8, boolean z9, boolean z10, boolean z11, SurfaceRequest2 surfaceRequest2, boolean z12, boolean z13, InstrumentationFlavor instrumentationFlavor, SurfaceRequestExternalSyntheticLambda0 surfaceRequestExternalSyntheticLambda0, boolean z14, SurfaceRequestExternalSyntheticLambda3 surfaceRequestExternalSyntheticLambda3) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
        this.f230a = str3;
        this.getInterfaceDescriptor = agentMode;
        this.asInterface = z;
        this.INotificationSideChannelDefault = keyStore;
        this.INotificationSideChannelStub = keyManagerArr;
        this.cancelAll = i;
        this.getNotifyChildrenChangedOptions = i2;
        this.IconCompatParcelizer = z2;
        this.MediaBrowserCompat = z3;
        this.b = z4;
        this.TuitionPaymentFragmentbindingInflater1 = z5;
        this.asBinder = z6;
        this.getExtras = z7;
        this.RemoteActionCompatParcelizer = strArr;
        this.read = strArr2;
        this.cancel = z8;
        this.INotificationSideChannel = z9;
        this.onTransact = z10;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z11;
        this.g = surfaceRequest2;
        this.getRoot = z12;
        this.connect = z13;
        this.notify = instrumentationFlavor;
        this.write = surfaceRequestExternalSyntheticLambda0;
        this.INotificationSideChannelStubProxy = z14;
        this.d = surfaceRequestExternalSyntheticLambda3;
    }

    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj) {
        if (obj == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(obj.getClass().getName());
        sb.append("@");
        sb.append(System.identityHashCode(obj));
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration{applicationId='");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("', appIdEncoded='");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append("', beaconUrl='");
        sb.append(this.f230a);
        sb.append("', mode=");
        sb.append(this.getInterfaceDescriptor);
        sb.append(", certificateValidation=");
        sb.append(this.asInterface);
        sb.append(", keyStore=");
        sb.append(this.INotificationSideChannelDefault);
        sb.append(", keyManagers=");
        sb.append(Arrays.toString(this.INotificationSideChannelStub));
        sb.append(", graceTime=");
        sb.append(this.cancelAll);
        sb.append(", waitTime=");
        sb.append(this.getNotifyChildrenChangedOptions);
        sb.append(", sendEmptyAction=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", namePrivacy=");
        sb.append(this.MediaBrowserCompat);
        sb.append(", applicationMonitoring=");
        sb.append(this.b);
        sb.append(", activityMonitoring=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(", crashReporting=");
        sb.append(this.asBinder);
        sb.append(", webRequestTiming=");
        sb.append(this.getExtras);
        sb.append(", monitoredDomains=");
        sb.append(Arrays.toString(this.RemoteActionCompatParcelizer));
        sb.append(", monitoredHttpsDomains=");
        sb.append(Arrays.toString(this.read));
        sb.append(", hybridApp=");
        sb.append(this.cancel);
        sb.append(", fileDomainCookies=");
        sb.append(this.INotificationSideChannel);
        sb.append(", debugLogLevel=");
        sb.append(this.onTransact);
        sb.append(", autoStart=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", communicationProblemListener=");
        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.g));
        sb.append(", userOptIn=");
        sb.append(this.getRoot);
        sb.append(", startupLoadBalancing=");
        sb.append(this.connect);
        sb.append(", instrumentationFlavor=");
        sb.append(this.notify);
        sb.append(", sessionReplayComponentProvider=");
        sb.append(this.write);
        sb.append(", isRageTapDetectionEnabled=");
        sb.append(this.INotificationSideChannelStubProxy);
        sb.append(", autoUserActionModifier=");
        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.d));
        sb.append('}');
        return sb.toString();
    }
}
