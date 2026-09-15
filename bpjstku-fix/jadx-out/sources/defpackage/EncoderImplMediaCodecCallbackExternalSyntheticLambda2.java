package defpackage;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class EncoderImplMediaCodecCallbackExternalSyntheticLambda2 {
    public static /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return EncoderImplMediaCodecCallbackExternalSyntheticLambda10.b(str, i, i2, i3);
    }

    public static final int TuitionPaymentFragmentbindingInflater1(String str, int i, int i2, int i3) {
        return (int) EncoderImplMediaCodecCallbackExternalSyntheticLambda10.b(str, i, i2, i3);
    }

    public static final long TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, long j, long j2, long j3) {
        String strTuitionPaymentFragmentbindingInflater1 = EncoderImplMediaCodecCallbackExternalSyntheticLambda10.TuitionPaymentFragmentbindingInflater1(str);
        if (strTuitionPaymentFragmentbindingInflater1 == null) {
            return j;
        }
        Long longOrNull = StringsKt.toLongOrNull(strTuitionPaymentFragmentbindingInflater1);
        if (longOrNull == null) {
            StringBuilder sb = new StringBuilder("System property '");
            sb.append(str);
            sb.append("' has unrecognized value '");
            sb.append(strTuitionPaymentFragmentbindingInflater1);
            sb.append('\'');
            throw new IllegalStateException(sb.toString().toString());
        }
        long jLongValue = longOrNull.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        StringBuilder sb2 = new StringBuilder("System property '");
        sb2.append(str);
        sb2.append("' should be in range ");
        sb2.append(j2);
        sb2.append("..");
        sb2.append(j3);
        sb2.append(", but is '");
        sb2.append(jLongValue);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }
}
