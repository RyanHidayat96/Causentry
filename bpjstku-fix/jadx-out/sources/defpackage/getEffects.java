package defpackage;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.dynatrace.android.agent.EventType;

/* JADX INFO: loaded from: classes5.dex */
public final class getEffects extends isServiced {
    private int INotificationSideChannelStubProxy;
    private long RemoteActionCompatParcelizer;
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private boolean getInterfaceDescriptor;
    private long onTransact;

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        String TuitionPaymentFragmentbindingInflater1;
        long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f932a;
        mergeConfigs asInterface;
        long b;
        int d;
    }

    /* synthetic */ getEffects(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, byte b) {
        this(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // defpackage.isServiced
    public final StringBuilder b() {
        new UseCaseStateChangeCallback();
        StringBuilder sb = new StringBuilder();
        sb.append("et=");
        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2().protocolId);
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            sb.append("&na=");
            sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asBinder));
        }
        sb.append("&s0=");
        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        sb.append("&t0=");
        sb.append(this.onTransact);
        sb.append("&t1=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("&nt=");
        sb.append(this.INotificationSideChannelStubProxy);
        sb.append("&fw=");
        sb.append(this.getInterfaceDescriptor ? "1" : "0");
        return sb;
    }

    private getEffects(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        super(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1, 16, tuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface, tuitionPaymentFragmentspecialinlinedviewModeldefault3.f932a, tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        this.g = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = EventType.RAGE_TAP;
        this.b = tuitionPaymentFragmentspecialinlinedviewModeldefault3.d;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        this.onTransact = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.RemoteActionCompatParcelizer = tuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
        this.INotificationSideChannelStubProxy = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.d = true;
        this.getInterfaceDescriptor = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }
}
