package defpackage;

import com.bpjstku.data.lib.model.CodeAndNamePairItem;
import com.bpjstku.domain.general.model.CodeNamePair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class onBackPressedInput_delegatelambda0 {
    public static final CodeNamePair TuitionPaymentFragmentspecialinlinedviewModeldefault1(CodeAndNamePairItem codeAndNamePairItem) {
        Intrinsics.checkNotNullParameter(codeAndNamePairItem, "");
        String code = codeAndNamePairItem.getCode();
        if (code == null) {
            code = "";
        }
        String name = codeAndNamePairItem.getName();
        return new CodeNamePair(code, name != null ? name : "");
    }
}
