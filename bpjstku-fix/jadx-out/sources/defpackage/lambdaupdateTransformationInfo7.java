package defpackage;

import com.dynatrace.android.agent.EventType;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdaupdateTransformationInfo7 extends lambdainitialSurfaceRecreationCompleter6androidxcameracoreSurfaceRequest {
    boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public lambdaupdateTransformationInfo7(String str, String str2, String str3, mergeConfigs mergeconfigs, int i, String str4) {
        super(str, 11, EventType.CRASH, str, str2, str3, 0L, mergeconfigs, i, str4, true);
        ((lambdainitialSurfaceRecreationCompleter6androidxcameracoreSurfaceRequest) this).onTransact = true;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
    }

    @Override // defpackage.lambdainitialSurfaceRecreationCompleter6androidxcameracoreSurfaceRequest, defpackage.isServiced
    public final StringBuilder b() {
        StringBuilder sb = new StringBuilder();
        sb.append("et=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.protocolId);
        sb.append("&na=");
        sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asBinder));
        sb.append("&it=");
        sb.append(Thread.currentThread().getId());
        sb.append("&pa=0&s0=");
        sb.append(this.b);
        sb.append("&t0=");
        sb.append(onTransact());
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.INotificationSideChannelStubProxy);
        if (strTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            sb.append("&rs=");
            if (!strTuitionPaymentFragmentspecialinlinedviewModeldefault3.isEmpty()) {
                sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.INotificationSideChannelDefault);
        if (strTuitionPaymentFragmentspecialinlinedviewModeldefault4 != null) {
            sb.append("&st=");
            if (!strTuitionPaymentFragmentspecialinlinedviewModeldefault4.isEmpty()) {
                sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault4);
            }
        }
        sb.append("&tt=");
        sb.append(this.INotificationSideChannelStub);
        sb.append("&im=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ? "1" : "0");
        sb.append("&fw=");
        sb.append(((lambdainitialSurfaceRecreationCompleter6androidxcameracoreSurfaceRequest) this).onTransact ? "1" : "0");
        return sb;
    }
}
