package defpackage;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class listOptions {
    private static final char[][] b = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 0, 0);
    final char[][] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public static listOptions TuitionPaymentFragmentbindingInflater1(Map<Character, String> map) {
        return new listOptions(b(map));
    }

    private listOptions(char[][] cArr) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cArr;
    }

    private static char[][] b(Map<Character, String> map) {
        if (map.isEmpty()) {
            return b;
        }
        char[][] cArr = new char[((Character) Collections.max(map.keySet())).charValue() + 1][];
        for (Character ch : map.keySet()) {
            cArr[ch.charValue()] = map.get(ch).toCharArray();
        }
        return cArr;
    }
}
