package defpackage;

import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.selects.TrySelectDetailedResult;

/* JADX INFO: loaded from: classes4.dex */
public final class isSizeSupportedAllowSwapping {
    private static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 TuitionPaymentFragmentbindingInflater1;
    private static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 b;

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("STATE_REG");
        b = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("STATE_COMPLETED");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("STATE_CANCELLED");
        TuitionPaymentFragmentbindingInflater1 = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("NO_RESULT");
        new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("PARAM_CLAUSE_0");
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Function3 {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }
    }

    public static final /* synthetic */ TrySelectDetailedResult TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        if (i == 0) {
            return TrySelectDetailedResult.SUCCESSFUL;
        }
        if (i == 1) {
            return TrySelectDetailedResult.REREGISTER;
        }
        if (i == 2) {
            return TrySelectDetailedResult.CANCELLED;
        }
        if (i == 3) {
            return TrySelectDetailedResult.ALREADY_SELECTED;
        }
        throw new IllegalStateException("Unexpected internal result: ".concat(String.valueOf(i)).toString());
    }
}
