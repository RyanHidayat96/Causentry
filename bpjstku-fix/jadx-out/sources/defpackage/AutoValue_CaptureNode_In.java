package defpackage;

import com.dynatrace.android.callback.CbConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AutoValue_CaptureNode_In {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f79a;
    protected String d;
    public CbConstants.WrMethod notify;
    public CbConstants.WrStates onTransact;
    long asInterface = -1;
    long asBinder = -1;
    boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
    String INotificationSideChannel = null;
    int g = 0;

    abstract String TuitionPaymentFragmentbindingInflater1();

    abstract String TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    abstract String TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    abstract String b();

    AutoValue_CaptureNode_In(CbConstants.WrMethod wrMethod, CbConstants.WrStates wrStates, int i) {
        this.notify = wrMethod;
        this.onTransact = wrStates;
    }

    public String toString() {
        return String.format("%s of %s.%s to %s", this.onTransact, TuitionPaymentFragmentspecialinlinedviewModeldefault1(), this.notify, TuitionPaymentFragmentbindingInflater1());
    }
}
