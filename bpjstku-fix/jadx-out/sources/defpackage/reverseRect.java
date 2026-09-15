package defpackage;

import android.os.Bundle;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes4.dex */
public class reverseRect extends getCameraSupportedHighResolutions {
    public static reverseRect TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, String str) {
        reverseRect reverserect = new reverseRect();
        Bundle bundle = new Bundle();
        bundle.putInt("instruction.position", i);
        bundle.putString("instruction.title", str);
        reverserect.setArguments(bundle);
        return reverserect;
    }

    @Override // defpackage.getCameraSupportedHighResolutions
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = getArguments() == null ? 0 : getArguments().getInt("instruction.position");
        if (i != 0) {
            return i != 1 ? i : R.layout.fragment_instruction_alto;
        }
        return R.layout.fragment_instruction_permata;
    }
}
