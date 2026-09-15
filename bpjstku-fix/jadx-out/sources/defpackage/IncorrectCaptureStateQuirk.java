package defpackage;

import androidx.p002lifecycle.Observer;
import com.bpjstku.presentation.vocational.VocationalRegisteredParticipantActivity;
import java.text.ParseException;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class IncorrectCaptureStateQuirk implements Observer {
    private /* synthetic */ VocationalRegisteredParticipantActivity TuitionPaymentFragmentbindingInflater1;

    public /* synthetic */ IncorrectCaptureStateQuirk(VocationalRegisteredParticipantActivity vocationalRegisteredParticipantActivity) {
        this.TuitionPaymentFragmentbindingInflater1 = vocationalRegisteredParticipantActivity;
    }

    @Override // androidx.p002lifecycle.Observer
    public final void onChanged(Object obj) throws ParseException {
        VocationalRegisteredParticipantActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
    }
}
