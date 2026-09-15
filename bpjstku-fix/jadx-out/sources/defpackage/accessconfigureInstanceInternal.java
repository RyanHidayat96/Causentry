package defpackage;

import android.view.View;
import com.nbs.validacion.RuleNotApplicableException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class accessconfigureInstanceInternal implements setInactive {
    private final String TuitionPaymentFragmentbindingInflater1;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public accessconfigureInstanceInternal(String str, String str2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentbindingInflater1 = str2;
    }

    @Override // defpackage.setInactive
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.setInactive
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(View view) throws RuleNotApplicableException {
        return Pattern.compile(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3).matcher(accessgetCameraConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view)).matches();
    }
}
