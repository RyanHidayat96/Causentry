package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class MutableConfig extends insertOption {
    private final withInitialError[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public MutableConfig(Map<DecodeHintType, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.EAN_13)) {
                arrayList.add(new fromError());
            } else if (collection.contains(BarcodeFormat.UPC_A)) {
                arrayList.add(new getAllItems());
            }
            if (collection.contains(BarcodeFormat.EAN_8)) {
                arrayList.add(new LiveDataObservableLiveDataObserverAdapterExternalSyntheticLambda0());
            }
            if (collection.contains(BarcodeFormat.UPC_E)) {
                arrayList.add(new Observable());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new fromError());
            arrayList.add(new LiveDataObservableLiveDataObserverAdapterExternalSyntheticLambda0());
            arrayList.add(new Observable());
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (withInitialError[]) arrayList.toArray(new withInitialError[arrayList.size()]);
    }

    @Override // defpackage.insertOption
    public final DynamicRanges b(int i, getFlashType getflashtype, Map<DecodeHintType, ?> map) throws Throwable {
        int[] iArrTuitionPaymentFragmentbindingInflater1 = withInitialError.TuitionPaymentFragmentbindingInflater1(getflashtype);
        for (withInitialError withinitialerror : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            try {
                DynamicRanges dynamicRangesTuitionPaymentFragmentspecialinlinedviewModeldefault2 = withinitialerror.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, getflashtype, iArrTuitionPaymentFragmentbindingInflater1, map);
                boolean z = dynamicRangesTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == BarcodeFormat.EAN_13 && dynamicRangesTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
                boolean z2 = collection == null || collection.contains(BarcodeFormat.UPC_A);
                if (!z || !z2) {
                    return dynamicRangesTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
                DynamicRanges dynamicRanges = new DynamicRanges(dynamicRangesTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.substring(1), dynamicRangesTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, dynamicRangesTuitionPaymentFragmentspecialinlinedviewModeldefault2.b, BarcodeFormat.UPC_A);
                Map<ResultMetadataType, Object> map2 = dynamicRangesTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (map2 != null) {
                    Map<ResultMetadataType, Object> map3 = dynamicRanges.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (map3 == null) {
                        dynamicRanges.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = map2;
                    } else {
                        map3.putAll(map2);
                    }
                }
                return dynamicRanges;
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
    }

    @Override // defpackage.insertOption, defpackage.canMatchBitDepth
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        for (withInitialError withinitialerror : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            withinitialerror.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }
}
