package defpackage;

import com.dynatrace.android.agent.conf.AgentMode;
import com.dynatrace.android.agent.conf.InstrumentationFlavor;
import java.security.KeyStore;
import javax.net.ssl.KeyManager;

/* JADX INFO: loaded from: classes4.dex */
public class SurfaceRequestTransformationInfoListener {
    private static String getExtras;
    public final InstrumentationFlavor INotificationSideChannel;
    public KeyStore INotificationSideChannelDefault;
    public final AgentMode INotificationSideChannelStub;
    public String[] INotificationSideChannelStubProxy;
    public boolean IconCompatParcelizer;
    public final SurfaceRequestExternalSyntheticLambda0 MediaBrowserCompat;
    public String[] RemoteActionCompatParcelizer;
    public final boolean TuitionPaymentFragmentbindingInflater1;
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public SurfaceRequestExternalSyntheticLambda3 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SurfaceRequest2 f231a;
    public boolean asBinder;
    public boolean asInterface;
    public final String b;
    public boolean cancel;
    public final boolean cancelAll;
    public final boolean connect;
    public boolean d;
    public final String g;
    public KeyManager[] getInterfaceDescriptor;
    public final int getNotifyChildrenChangedOptions;
    public final boolean getRoot;
    public final int notify;
    public boolean onTransact;
    public final boolean read;
    public boolean write;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("ConfigurationBuilder");
        getExtras = sb.toString();
    }

    private SurfaceRequestTransformationInfoListener(AgentMode agentMode, String str, String str2, byte b) {
        this.RemoteActionCompatParcelizer = new String[0];
        this.INotificationSideChannelStubProxy = new String[0];
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        this.INotificationSideChannelStub = agentMode;
        this.b = str;
        this.g = str2;
        onTransformationInfoUpdate.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        this.asInterface = true;
        onTransformationInfoUpdate.a();
        this.cancel = false;
        onTransformationInfoUpdate.g();
        this.onTransact = true;
        onTransformationInfoUpdate.asBinder();
        this.d = true;
        onTransformationInfoUpdate.INotificationSideChannelStubProxy();
        this.IconCompatParcelizer = false;
        String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SurfaceRequestRequestCancelledException.TuitionPaymentFragmentspecialinlinedviewModeldefault1(onTransformationInfoUpdate.INotificationSideChannel());
        if (strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            this.RemoteActionCompatParcelizer = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SurfaceRequestRequestCancelledException.TuitionPaymentFragmentspecialinlinedviewModeldefault1(onTransformationInfoUpdate.cancelAll());
        if (strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            this.INotificationSideChannelStubProxy = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        onTransformationInfoUpdate.INotificationSideChannelStub();
        if (agentMode != AgentMode.APP_MON) {
            this.write = true;
        }
        this.notify = onTransformationInfoUpdate.d();
        this.getNotifyChildrenChangedOptions = onTransformationInfoUpdate.RemoteActionCompatParcelizer();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = onTransformationInfoUpdate.TuitionPaymentFragmentbindingInflater1();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = onTransformationInfoUpdate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        this.getRoot = onTransformationInfoUpdate.connect();
        this.TuitionPaymentFragmentbindingInflater1 = onTransformationInfoUpdate.b();
        this.asBinder = onTransformationInfoUpdate.asInterface();
        this.connect = onTransformationInfoUpdate.getInterfaceDescriptor();
        this.read = onTransformationInfoUpdate.cancel();
        this.f231a = null;
        this.INotificationSideChannelDefault = null;
        this.getInterfaceDescriptor = null;
        this.INotificationSideChannel = onTransformationInfoUpdate.onTransact();
        this.MediaBrowserCompat = onTransformationInfoUpdate.INotificationSideChannelDefault();
        this.cancelAll = onTransformationInfoUpdate.read();
    }

    SurfaceRequestTransformationInfoListener(AgentMode agentMode, String str, String str2) {
        new onTransformationInfoUpdate();
        this(agentMode, str, str2, (byte) 0);
    }
}
