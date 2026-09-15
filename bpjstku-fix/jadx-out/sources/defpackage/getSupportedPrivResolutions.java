package defpackage;

import android.os.Bundle;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes4.dex */
public class getSupportedPrivResolutions extends getCameraSupportedHighResolutions {
    public static getSupportedPrivResolutions TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, String str) {
        getSupportedPrivResolutions getsupportedprivresolutions = new getSupportedPrivResolutions();
        Bundle bundle = new Bundle();
        bundle.putInt("instruction.position", i);
        bundle.putString("instruction.title", str);
        getsupportedprivresolutions.setArguments(bundle);
        return getsupportedprivresolutions;
    }

    @Override // defpackage.getCameraSupportedHighResolutions
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = getArguments() == null ? 0 : getArguments().getInt("instruction.position");
        if (i == 0) {
            return R.layout.fragment_instruction_bri_atm;
        }
        if (i != 1) {
            return i != 2 ? i : R.layout.fragment_instruction_bri_internet;
        }
        return R.layout.fragment_instruction_bri_mobile;
    }
}
