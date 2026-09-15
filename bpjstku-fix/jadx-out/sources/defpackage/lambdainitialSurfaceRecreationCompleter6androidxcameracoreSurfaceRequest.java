package defpackage;

import com.dynatrace.android.agent.EventType;

/* JADX INFO: loaded from: classes3.dex */
public class lambdainitialSurfaceRecreationCompleter6androidxcameracoreSurfaceRequest extends isServiced {
    protected String INotificationSideChannelDefault;
    protected String INotificationSideChannelStub;
    protected String INotificationSideChannelStubProxy;
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    protected boolean onTransact;

    protected lambdainitialSurfaceRecreationCompleter6androidxcameracoreSurfaceRequest(String str, String str2, String str3, String str4, long j, mergeConfigs mergeconfigs, int i, String str5) {
        this(str, 6, EventType.ERROR_EXCEPTION, str2, str3, str4, j, mergeconfigs, i, str5, true);
    }

    protected lambdainitialSurfaceRecreationCompleter6androidxcameracoreSurfaceRequest(String str, int i, EventType eventType, String str2, String str3, String str4, long j, mergeConfigs mergeconfigs, int i2, String str5, boolean z) {
        super(str, i, eventType, j, mergeconfigs, i2, true);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
        this.INotificationSideChannelStubProxy = str3;
        this.INotificationSideChannelDefault = str4;
        this.INotificationSideChannelStub = str5;
        this.onTransact = true;
    }

    @Override // defpackage.isServiced
    public StringBuilder b() {
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
        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        sb.append("&t0=");
        sb.append(onTransact());
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.INotificationSideChannelStubProxy);
        if (strTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            sb.append("&rs=");
            if (!strTuitionPaymentFragmentspecialinlinedviewModeldefault3.isEmpty()) {
                sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        if (strTuitionPaymentFragmentspecialinlinedviewModeldefault4 != null) {
            sb.append("&ev=");
            if (!strTuitionPaymentFragmentspecialinlinedviewModeldefault4.isEmpty()) {
                sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault4);
            }
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault5 = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.INotificationSideChannelDefault);
        if (strTuitionPaymentFragmentspecialinlinedviewModeldefault5 != null) {
            sb.append("&st=");
            if (!strTuitionPaymentFragmentspecialinlinedviewModeldefault5.isEmpty()) {
                sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault5);
            }
        }
        sb.append("&tt=");
        sb.append(this.INotificationSideChannelStub);
        sb.append("&fw=");
        sb.append(this.onTransact ? "1" : "0");
        return sb;
    }
}
