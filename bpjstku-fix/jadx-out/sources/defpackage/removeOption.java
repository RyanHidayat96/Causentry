package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class removeOption extends insertOption {
    private final insertOption[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public removeOption(Map<DecodeHintType, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        boolean z = (map == null || map.get(DecodeHintType.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.EAN_13) || collection.contains(BarcodeFormat.UPC_A) || collection.contains(BarcodeFormat.EAN_8) || collection.contains(BarcodeFormat.UPC_E)) {
                arrayList.add(new MutableConfig(map));
            }
            if (collection.contains(BarcodeFormat.CODE_39)) {
                arrayList.add(new LiveDataObservableLiveDataObserverAdapter(z));
            }
            if (collection.contains(BarcodeFormat.CODE_93)) {
                arrayList.add(new lambdaonChanged0androidxcameracoreimplLiveDataObservableLiveDataObserverAdapter());
            }
            if (collection.contains(BarcodeFormat.CODE_128)) {
                arrayList.add(new LiveDataObservableExternalSyntheticLambda2());
            }
            if (collection.contains(BarcodeFormat.ITF)) {
                arrayList.add(new MultiValueSet());
            }
            if (collection.contains(BarcodeFormat.CODABAR)) {
                arrayList.add(new LiveDataObservableExternalSyntheticLambda0());
            }
            if (collection.contains(BarcodeFormat.RSS_14)) {
                arrayList.add(new onNewData());
            }
            if (collection.contains(BarcodeFormat.RSS_EXPANDED)) {
                arrayList.add(new withAllQuirksDisabled());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new MutableConfig(map));
            arrayList.add(new LiveDataObservableLiveDataObserverAdapter());
            arrayList.add(new LiveDataObservableExternalSyntheticLambda0());
            arrayList.add(new lambdaonChanged0androidxcameracoreimplLiveDataObservableLiveDataObserverAdapter());
            arrayList.add(new LiveDataObservableExternalSyntheticLambda2());
            arrayList.add(new MultiValueSet());
            arrayList.add(new onNewData());
            arrayList.add(new withAllQuirksDisabled());
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (insertOption[]) arrayList.toArray(new insertOption[arrayList.size()]);
    }

    @Override // defpackage.insertOption
    public final DynamicRanges b(int i, getFlashType getflashtype, Map<DecodeHintType, ?> map) throws NotFoundException {
        for (insertOption insertoption : this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            try {
                return insertoption.b(i, getflashtype, map);
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
    }

    @Override // defpackage.insertOption, defpackage.canMatchBitDepth
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        for (insertOption insertoption : this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            insertoption.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }
}
