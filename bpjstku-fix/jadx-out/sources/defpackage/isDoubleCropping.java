package defpackage;

import android.os.Bundle;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes4.dex */
public class isDoubleCropping extends getCameraSupportedHighResolutions {
    public static isDoubleCropping TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, String str) {
        isDoubleCropping isdoublecropping = new isDoubleCropping();
        Bundle bundle = new Bundle();
        bundle.putInt("instruction.position", i);
        bundle.putString("instruction.title", str);
        isdoublecropping.setArguments(bundle);
        return isdoublecropping;
    }

    @Override // defpackage.getCameraSupportedHighResolutions
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = getArguments() == null ? 0 : getArguments().getInt("instruction.position");
        if (i != 0) {
            return i != 1 ? i : R.layout.fragment_instruction_mandiri_internet;
        }
        return R.layout.fragment_instruction_mandiri;
    }
}
