package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class getAllItems extends withInitialError {
    private final withInitialError b = new fromError();

    @Override // defpackage.withInitialError
    public final DynamicRanges TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, getFlashType getflashtype, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, getflashtype, iArr, map));
    }

    @Override // defpackage.withInitialError, defpackage.insertOption
    public final DynamicRanges b(int i, getFlashType getflashtype, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b.b(i, getflashtype, map));
    }

    @Override // defpackage.insertOption, defpackage.canMatchBitDepth
    public final DynamicRanges TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceListWithTimeout surfacelistwithtimeout) throws NotFoundException, FormatException {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfacelistwithtimeout));
    }

    @Override // defpackage.insertOption, defpackage.canMatchBitDepth
    public final DynamicRanges TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceListWithTimeout surfacelistwithtimeout, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfacelistwithtimeout, map));
    }

    @Override // defpackage.withInitialError
    final BarcodeFormat TuitionPaymentFragmentbindingInflater1() {
        return BarcodeFormat.UPC_A;
    }

    @Override // defpackage.withInitialError
    protected final int TuitionPaymentFragmentspecialinlinedviewModeldefault2(getFlashType getflashtype, int[] iArr, StringBuilder sb) throws NotFoundException {
        return this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getflashtype, iArr, sb);
    }

    private static DynamicRanges TuitionPaymentFragmentspecialinlinedviewModeldefault2(DynamicRanges dynamicRanges) throws FormatException {
        String str = dynamicRanges.TuitionPaymentFragmentbindingInflater1;
        if (str.charAt(0) == '0') {
            return new DynamicRanges(str.substring(1), null, dynamicRanges.b, BarcodeFormat.UPC_A);
        }
        throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }
}
