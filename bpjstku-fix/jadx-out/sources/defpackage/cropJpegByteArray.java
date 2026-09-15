package defpackage;

import android.content.Context;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class cropJpegByteArray implements createBitmapFromImageProxy {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Collection<BarcodeFormat> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private Map<DecodeHintType, ?> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private String b;
    private boolean g;

    public cropJpegByteArray() {
    }

    public cropJpegByteArray(Collection<BarcodeFormat> collection, Map<DecodeHintType, ?> map, String str, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = collection;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = map;
        this.b = str;
        this.g = z;
    }

    @Override // defpackage.createBitmapFromImageProxy
    public final createBitmapFromRgbaImage TuitionPaymentFragmentspecialinlinedviewModeldefault2(Map<DecodeHintType, ?> map) {
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        enumMap.putAll(map);
        Map<DecodeHintType, ?> map2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            enumMap.put(DecodeHintType.POSSIBLE_FORMATS, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        if (this.b != null) {
            enumMap.put(DecodeHintType.CHARACTER_SET, this.b);
        }
        tryIncrementAll tryincrementall = new tryIncrementAll();
        tryincrementall.TuitionPaymentFragmentbindingInflater1(enumMap);
        return this.g ? new isAspectRatioValid(tryincrementall) : new createBitmapFromRgbaImage(tryincrementall);
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = i % 9045471;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        TuitionPaymentFragmentbindingInflater1 = i3;
        return i3;
    }
}
