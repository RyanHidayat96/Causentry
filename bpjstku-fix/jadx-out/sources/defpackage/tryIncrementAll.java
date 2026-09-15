package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class tryIncrementAll implements canMatchBitDepth {
    public canMatchBitDepth[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private Map<DecodeHintType, ?> b;

    @Override // defpackage.canMatchBitDepth
    public final DynamicRanges TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceListWithTimeout surfacelistwithtimeout) throws NotFoundException {
        TuitionPaymentFragmentbindingInflater1(null);
        return b(surfacelistwithtimeout);
    }

    @Override // defpackage.canMatchBitDepth
    public final DynamicRanges TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceListWithTimeout surfacelistwithtimeout, Map<DecodeHintType, ?> map) throws NotFoundException {
        TuitionPaymentFragmentbindingInflater1(map);
        return b(surfacelistwithtimeout);
    }

    public final void TuitionPaymentFragmentbindingInflater1(Map<DecodeHintType, ?> map) {
        this.b = map;
        boolean z = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            boolean z2 = collection.contains(BarcodeFormat.UPC_A) || collection.contains(BarcodeFormat.UPC_E) || collection.contains(BarcodeFormat.EAN_13) || collection.contains(BarcodeFormat.EAN_8) || collection.contains(BarcodeFormat.CODABAR) || collection.contains(BarcodeFormat.CODE_39) || collection.contains(BarcodeFormat.CODE_93) || collection.contains(BarcodeFormat.CODE_128) || collection.contains(BarcodeFormat.ITF) || collection.contains(BarcodeFormat.RSS_14) || collection.contains(BarcodeFormat.RSS_EXPANDED);
            if (z2 && !z) {
                arrayList.add(new removeOption(map));
            }
            if (collection.contains(BarcodeFormat.QR_CODE)) {
                arrayList.add(new RetryPolicyInternal());
            }
            if (collection.contains(BarcodeFormat.DATA_MATRIX)) {
                arrayList.add(new getTargetAspectRatio());
            }
            if (collection.contains(BarcodeFormat.AZTEC)) {
                arrayList.add(new findAllPossibleMatches());
            }
            if (collection.contains(BarcodeFormat.PDF_417)) {
                arrayList.add(new resolveQuirkName());
            }
            if (collection.contains(BarcodeFormat.MAXICODE)) {
                arrayList.add(new lambdafetchData0androidxcameracoreimplLiveDataObservable());
            }
            if (z2 && z) {
                arrayList.add(new removeOption(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z) {
                arrayList.add(new removeOption(map));
            }
            arrayList.add(new RetryPolicyInternal());
            arrayList.add(new getTargetAspectRatio());
            arrayList.add(new findAllPossibleMatches());
            arrayList.add(new resolveQuirkName());
            arrayList.add(new lambdafetchData0androidxcameracoreimplLiveDataObservable());
            if (z) {
                arrayList.add(new removeOption(map));
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (canMatchBitDepth[]) arrayList.toArray(new canMatchBitDepth[arrayList.size()]);
    }

    @Override // defpackage.canMatchBitDepth
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        canMatchBitDepth[] canmatchbitdepthArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (canmatchbitdepthArr != null) {
            for (canMatchBitDepth canmatchbitdepth : canmatchbitdepthArr) {
                canmatchbitdepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
        }
    }

    public final DynamicRanges b(surfaceListWithTimeout surfacelistwithtimeout) throws NotFoundException {
        canMatchBitDepth[] canmatchbitdepthArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (canmatchbitdepthArr != null) {
            for (canMatchBitDepth canmatchbitdepth : canmatchbitdepthArr) {
                try {
                    return canmatchbitdepth.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfacelistwithtimeout, this.b);
                } catch (ReaderException unused) {
                }
            }
        }
        throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
    }
}
