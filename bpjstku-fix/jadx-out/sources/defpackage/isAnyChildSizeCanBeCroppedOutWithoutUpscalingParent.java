package defpackage;

import android.os.Bundle;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes4.dex */
public class isAnyChildSizeCanBeCroppedOutWithoutUpscalingParent extends getCameraSupportedHighResolutions {
    public static isAnyChildSizeCanBeCroppedOutWithoutUpscalingParent TuitionPaymentFragmentbindingInflater1(int i, String str) {
        isAnyChildSizeCanBeCroppedOutWithoutUpscalingParent isanychildsizecanbecroppedoutwithoutupscalingparent = new isAnyChildSizeCanBeCroppedOutWithoutUpscalingParent();
        Bundle bundle = new Bundle();
        bundle.putInt("instruction.position", i);
        bundle.putString("instruction.title", str);
        isanychildsizecanbecroppedoutwithoutupscalingparent.setArguments(bundle);
        return isanychildsizecanbecroppedoutwithoutupscalingparent;
    }

    @Override // defpackage.getCameraSupportedHighResolutions
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = getArguments() == null ? 0 : getArguments().getInt("instruction.position");
        if (i == 0) {
            return R.layout.fragment_instruction_bni_atm;
        }
        if (i != 1) {
            return i != 2 ? i : R.layout.fragment_instruction_bni_internet;
        }
        return R.layout.fragment_instruction_bni_mobile;
    }
}
