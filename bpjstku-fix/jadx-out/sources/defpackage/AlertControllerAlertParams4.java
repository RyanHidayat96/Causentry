package defpackage;

import com.bpjstku.presentation.asik.active.AsikAccountVerificationActivity;
import com.bpjstku.util.utils.UserLocationComplete;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AlertControllerAlertParams4 implements Function1 {
    private /* synthetic */ AsikAccountVerificationActivity TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public /* synthetic */ AlertControllerAlertParams4(AsikAccountVerificationActivity asikAccountVerificationActivity) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = asikAccountVerificationActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return AsikAccountVerificationActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (UserLocationComplete) obj);
    }
}
