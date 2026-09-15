package defpackage;

import java.util.Map;
import kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class retrieveOptionWithPriority extends retrieveOption {
    private final char TuitionPaymentFragmentbindingInflater1;
    private final char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final char[][] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    protected abstract char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    protected retrieveOptionWithPriority(Map<Character, String> map, char c, char c2) {
        this(listOptions.TuitionPaymentFragmentbindingInflater1(map), c, c2);
    }

    private retrieveOptionWithPriority(listOptions listoptions, char c, char c2) {
        char[][] cArr = listoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr.length;
        if (c2 < c) {
            c2 = 0;
            c = CharCompanionObject.MAX_VALUE;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = c;
        this.TuitionPaymentFragmentbindingInflater1 = c2;
    }

    @Override // defpackage.retrieveOption, defpackage.getPriorities
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[cCharAt] != null) || cCharAt > this.TuitionPaymentFragmentbindingInflater1 || cCharAt < this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                return TuitionPaymentFragmentbindingInflater1(str, i);
            }
        }
        return str;
    }

    @Override // defpackage.retrieveOption
    protected final char[] b(char c) {
        char[] cArr;
        if (c < this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && (cArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[c]) != null) {
            return cArr;
        }
        if (c < this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 || c > this.TuitionPaymentFragmentbindingInflater1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        return null;
    }
}
