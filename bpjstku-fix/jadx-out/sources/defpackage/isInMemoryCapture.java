package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes6.dex */
public final class isInMemoryCapture implements lambdatrackCurrentRequests1androidxcameracoreimagecaptureTakePictureManager {
    public static final isInMemoryCapture TuitionPaymentFragmentbindingInflater1;
    public static final isInMemoryCapture TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    static final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final Set<ProcessingNodeExternalSyntheticLambda7> asInterface;
    final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final String b;

    static {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onFinalResult.TuitionPaymentFragmentspecialinlinedviewModeldefault2("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = onFinalResult.TuitionPaymentFragmentspecialinlinedviewModeldefault2("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = onFinalResult.TuitionPaymentFragmentspecialinlinedviewModeldefault2("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        asInterface = Collections.unmodifiableSet(new HashSet(Arrays.asList(new ProcessingNodeExternalSyntheticLambda7("proto"), new ProcessingNodeExternalSyntheticLambda7("json"))));
        TuitionPaymentFragmentbindingInflater1 = new isInMemoryCapture(strTuitionPaymentFragmentspecialinlinedviewModeldefault2, null);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new isInMemoryCapture(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, strTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    public isInMemoryCapture(String str, String str2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.b = str2;
    }

    @Override // defpackage.getCapturingRequest
    public final String TuitionPaymentFragmentbindingInflater1() {
        return "cct";
    }

    @Override // defpackage.lambdatrackCurrentRequests1androidxcameracoreimagecaptureTakePictureManager
    public final Set<ProcessingNodeExternalSyntheticLambda7> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return asInterface;
    }

    @Override // defpackage.getCapturingRequest
    public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        String str = this.b;
        if (str == null && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            return null;
        }
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName(Hex.DEFAULT_CHARSET_NAME));
    }
}
