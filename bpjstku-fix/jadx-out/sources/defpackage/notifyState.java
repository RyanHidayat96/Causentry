package defpackage;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.dynatrace.android.agent.EventType;

/* JADX INFO: loaded from: classes5.dex */
public final class notifyState extends isServiced {
    final boolean INotificationSideChannelStub;
    final setViewPort RemoteActionCompatParcelizer;
    final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final setViewPort onTransact;

    public static class b {
        String TuitionPaymentFragmentbindingInflater1;
        EventType TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        mergeConfigs asBinder;
        setViewPort asInterface;
        setViewPort b;
        int d;
    }

    /* synthetic */ notifyState(b bVar, byte b2) {
        this(bVar);
    }

    @Override // defpackage.isServiced
    public final StringBuilder b() {
        return new notifyUpdated().TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
    }

    private notifyState(b bVar) {
        super(bVar.TuitionPaymentFragmentbindingInflater1, 15, bVar.asBinder, bVar.d, bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bVar.TuitionPaymentFragmentbindingInflater1, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.b = bVar.asInterface.b;
        this.g = bVar.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.cancelAll = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.RemoteActionCompatParcelizer = bVar.asInterface;
        this.onTransact = bVar.b;
        this.d = true;
        this.INotificationSideChannelStub = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}
