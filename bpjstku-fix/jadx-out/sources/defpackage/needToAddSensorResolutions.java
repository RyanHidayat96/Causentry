package defpackage;

import android.os.Bundle;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes4.dex */
public class needToAddSensorResolutions extends getCameraSupportedHighResolutions {
    public static needToAddSensorResolutions TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, String str) {
        needToAddSensorResolutions needtoaddsensorresolutions = new needToAddSensorResolutions();
        Bundle bundle = new Bundle();
        bundle.putInt("instruction.position", i);
        bundle.putString("instruction.title", str);
        needtoaddsensorresolutions.setArguments(bundle);
        return needtoaddsensorresolutions;
    }

    @Override // defpackage.getCameraSupportedHighResolutions
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = getArguments() == null ? 0 : getArguments().getInt("instruction.position");
        if (i == 0) {
            return R.layout.fragment_instruction_prima;
        }
        if (i != 1) {
            return i != 2 ? i : R.layout.fragment_instruction_alto;
        }
        return R.layout.fragment_instruction_atm_bersama;
    }
}
