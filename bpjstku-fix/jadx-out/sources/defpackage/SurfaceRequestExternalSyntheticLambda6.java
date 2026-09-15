package defpackage;

import com.dynatrace.android.agent.EventType;

/* JADX INFO: loaded from: classes3.dex */
public final class SurfaceRequestExternalSyntheticLambda6 extends isServiced {
    private long INotificationSideChannelDefault;
    private String INotificationSideChannelStub;
    private long INotificationSideChannelStubProxy;
    private String RemoteActionCompatParcelizer;
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private int getInterfaceDescriptor;
    private boolean onTransact;

    public SurfaceRequestExternalSyntheticLambda6(long j, int i, long j2, long j3, int i2, String str, String str2, long j4, long j5, mergeConfigs mergeconfigs, int i3, String str3) {
        super(str2, EventType.WEB_REQUEST, j, i, j2, j3, mergeconfigs, i3, true);
        this.getInterfaceDescriptor = i2;
        this.RemoteActionCompatParcelizer = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = ViewPort.b();
        this.INotificationSideChannelStubProxy = j4;
        this.INotificationSideChannelDefault = j5;
        this.INotificationSideChannelStub = str3;
        this.onTransact = true;
    }

    @Override // defpackage.isServiced
    public final StringBuilder b() {
        StringBuilder sb = new StringBuilder();
        sb.append("et=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.protocolId);
        sb.append("&na=");
        sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asBinder));
        sb.append("&it=");
        sb.append(Thread.currentThread().getId());
        sb.append("&pa=");
        sb.append(a());
        sb.append("&s0=");
        sb.append(this.b);
        sb.append("&t0=");
        sb.append(onTransact());
        sb.append("&s1=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("&t1=");
        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault3() - onTransact());
        if (this.getInterfaceDescriptor > 0) {
            sb.append("&rc=");
            sb.append(this.getInterfaceDescriptor);
        } else if (this.RemoteActionCompatParcelizer != null) {
            sb.append("&rc=");
            sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.RemoteActionCompatParcelizer));
        }
        if (this.INotificationSideChannelStubProxy >= 0 && this.INotificationSideChannelDefault >= 0) {
            sb.append("&bs=");
            sb.append(this.INotificationSideChannelStubProxy);
            sb.append("&br=");
            sb.append(this.INotificationSideChannelDefault);
        }
        if (this.INotificationSideChannelStub != null) {
            sb.append("&si=");
            sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.INotificationSideChannelStub));
        }
        sb.append("&fw=");
        sb.append(this.onTransact ? "1" : "0");
        return sb;
    }
}
