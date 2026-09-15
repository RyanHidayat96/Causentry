package defpackage;

import android.content.Intent;
import com.google.zxing.BarcodeFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageAnalysisConfig {
    private static final Map<String, Set<BarcodeFormat>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final Pattern b = Pattern.compile(",");

    static {
        EnumSet enumSetOf = EnumSet.of(BarcodeFormat.QR_CODE);
        EnumSet enumSetOf2 = EnumSet.of(BarcodeFormat.DATA_MATRIX);
        EnumSet enumSetOf3 = EnumSet.of(BarcodeFormat.AZTEC);
        EnumSet enumSetOf4 = EnumSet.of(BarcodeFormat.PDF_417);
        EnumSet enumSetOf5 = EnumSet.of(BarcodeFormat.UPC_A, BarcodeFormat.UPC_E, BarcodeFormat.EAN_13, BarcodeFormat.EAN_8, BarcodeFormat.RSS_14, BarcodeFormat.RSS_EXPANDED);
        EnumSet enumSetOf6 = EnumSet.of(BarcodeFormat.CODE_39, BarcodeFormat.CODE_93, BarcodeFormat.CODE_128, BarcodeFormat.ITF, BarcodeFormat.CODABAR);
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) enumSetOf5);
        enumSetCopyOf.addAll(enumSetOf6);
        HashMap map = new HashMap();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = map;
        map.put("ONE_D_MODE", enumSetCopyOf);
        map.put("PRODUCT_MODE", enumSetOf5);
        map.put("QR_CODE_MODE", enumSetOf);
        map.put("DATA_MATRIX_MODE", enumSetOf2);
        map.put("AZTEC_MODE", enumSetOf3);
        map.put("PDF417_MODE", enumSetOf4);
    }

    public static Set<BarcodeFormat> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Intent intent) {
        String stringExtra = intent.getStringExtra("SCAN_FORMATS");
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(stringExtra != null ? Arrays.asList(b.split(stringExtra)) : null, intent.getStringExtra("SCAN_MODE"));
    }

    private static Set<BarcodeFormat> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Iterable<String> iterable, String str) {
        if (iterable != null) {
            EnumSet enumSetNoneOf = EnumSet.noneOf(BarcodeFormat.class);
            try {
                Iterator<String> it = iterable.iterator();
                while (it.hasNext()) {
                    enumSetNoneOf.add(BarcodeFormat.valueOf(it.next()));
                }
                return enumSetNoneOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str != null) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(str);
        }
        return null;
    }
}
