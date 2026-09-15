package defpackage;

import androidx.collection.SieveCacheKt;

/* JADX INFO: loaded from: classes4.dex */
final class checkAndSetHasConsumer {

    public interface TuitionPaymentFragmentbindingInflater1 {
        void b(String str, String str2);
    }

    checkAndSetHasConsumer() {
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        int i;
        String strTrim;
        char cCharAt;
        if (str != null) {
            int i2 = 0;
            while (i2 < str.length()) {
                int i3 = i2;
                while (i3 < str.length() && "=,".indexOf(str.charAt(i3)) == -1) {
                    i3++;
                }
                String strTrim2 = str.substring(i2, i3).trim();
                if (i3 == str.length() || str.charAt(i3) == ',') {
                    tuitionPaymentFragmentbindingInflater1.b(strTrim2, null);
                    i2 = i3 + 1;
                } else {
                    while (true) {
                        i3++;
                        if (i3 >= str.length() || ((cCharAt = str.charAt(i3)) != ' ' && cCharAt != '\t')) {
                            break;
                        }
                    }
                    if (i3 < str.length() && str.charAt(i3) == '\"') {
                        int i4 = i3 + 1;
                        int i5 = i4;
                        while (i5 < str.length() && "\"".indexOf(str.charAt(i5)) == -1) {
                            i5++;
                        }
                        strTrim = str.substring(i4, i5);
                        i = i5 + 1;
                    } else {
                        i = i3;
                        while (i < str.length() && ",".indexOf(str.charAt(i)) == -1) {
                            i++;
                        }
                        strTrim = str.substring(i3, i).trim();
                    }
                    tuitionPaymentFragmentbindingInflater1.b(strTrim2, strTrim);
                    i2 = i;
                }
            }
        }
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        try {
            long j = Long.parseLong(str);
            if (j > SieveCacheKt.NodeLinkMask) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
