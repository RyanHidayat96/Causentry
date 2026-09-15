package defpackage;

import android.os.Bundle;
import com.bpjstku.R;
import com.midtrans.sdk.corekit.core.Logger;

/* JADX INFO: loaded from: classes4.dex */
public class getSortedChildSizes extends getCameraSupportedHighResolutions {
    public static getSortedChildSizes TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, String str) {
        getSortedChildSizes getsortedchildsizes = new getSortedChildSizes();
        Bundle bundle = new Bundle();
        bundle.putInt("instruction.position", i);
        bundle.putString("instruction.title", str);
        Logger.d("xtitle", "title:".concat(String.valueOf(str)));
        getsortedchildsizes.setArguments(bundle);
        return getsortedchildsizes;
    }

    @Override // defpackage.getCameraSupportedHighResolutions
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = getArguments() == null ? 0 : getArguments().getInt("instruction.position");
        if (i == 0) {
            return R.layout.fragment_instruction_bca;
        }
        if (i != 1) {
            return i != 2 ? i : R.layout.fragment_instruction_bca_transfer_mbca;
        }
        return R.layout.fragment_bca_tranfer_click_instruction;
    }
}
