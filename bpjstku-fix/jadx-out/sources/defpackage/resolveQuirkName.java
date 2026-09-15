package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class resolveQuirkName implements canMatchBitDepth {
    @Override // defpackage.canMatchBitDepth
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    @Override // defpackage.canMatchBitDepth
    public final DynamicRanges TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceListWithTimeout surfacelistwithtimeout) throws NotFoundException, ChecksumException, FormatException {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfacelistwithtimeout, null);
    }

    @Override // defpackage.canMatchBitDepth
    public final DynamicRanges TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceListWithTimeout surfacelistwithtimeout, Map<DecodeHintType, ?> map) throws Throwable {
        DynamicRanges dynamicRanges;
        DynamicRanges[] dynamicRangesArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(surfacelistwithtimeout);
        if (dynamicRangesArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null || dynamicRangesArrTuitionPaymentFragmentspecialinlinedviewModeldefault1.length == 0 || (dynamicRanges = dynamicRangesArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[0]) == null) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
        return dynamicRanges;
    }

    private static DynamicRanges[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(surfaceListWithTimeout surfacelistwithtimeout) throws Throwable {
        ArrayList arrayList = new ArrayList();
        RestrictedCameraInfoCameraOperation restrictedCameraInfoCameraOperationTuitionPaymentFragmentbindingInflater1 = RestrictedCameraInfo.TuitionPaymentFragmentbindingInflater1(surfacelistwithtimeout, false);
        for (DeferrableSurfaces1[] deferrableSurfaces1Arr : restrictedCameraInfoCameraOperationTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            getBufferFormat getbufferformat = restrictedCameraInfoCameraOperationTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            DeferrableSurfaces1 deferrableSurfaces1 = deferrableSurfaces1Arr[4];
            DeferrableSurfaces1 deferrableSurfaces2 = deferrableSurfaces1Arr[5];
            DeferrableSurfaces1 deferrableSurfaces3 = deferrableSurfaces1Arr[6];
            DeferrableSurfaces1 deferrableSurfaces4 = deferrableSurfaces1Arr[7];
            DeferrableSurfaces1 deferrableSurfaces5 = deferrableSurfaces1Arr[0];
            int iAbs = (deferrableSurfaces5 == null || deferrableSurfaces1 == null) ? Integer.MAX_VALUE : (int) Math.abs(deferrableSurfaces5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            DeferrableSurfaces1 deferrableSurfaces6 = deferrableSurfaces1Arr[6];
            DeferrableSurfaces1 deferrableSurfaces7 = deferrableSurfaces1Arr[2];
            int iMin = Math.min(iAbs, (((deferrableSurfaces6 == null || deferrableSurfaces7 == null) ? Integer.MAX_VALUE : (int) Math.abs(deferrableSurfaces6.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - deferrableSurfaces7.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) * 17) / 18);
            DeferrableSurfaces1 deferrableSurfaces8 = deferrableSurfaces1Arr[1];
            DeferrableSurfaces1 deferrableSurfaces9 = deferrableSurfaces1Arr[5];
            int iAbs2 = (deferrableSurfaces8 == null || deferrableSurfaces9 == null) ? Integer.MAX_VALUE : (int) Math.abs(deferrableSurfaces8.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - deferrableSurfaces9.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            DeferrableSurfaces1 deferrableSurfaces10 = deferrableSurfaces1Arr[7];
            DeferrableSurfaces1 deferrableSurfaces11 = deferrableSurfaces1Arr[3];
            int iMin2 = Math.min(iMin, Math.min(iAbs2, (((deferrableSurfaces10 == null || deferrableSurfaces11 == null) ? Integer.MAX_VALUE : (int) Math.abs(deferrableSurfaces10.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - deferrableSurfaces11.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) * 17) / 18));
            DeferrableSurfaces1 deferrableSurfaces12 = deferrableSurfaces1Arr[0];
            DeferrableSurfaces1 deferrableSurfaces13 = deferrableSurfaces1Arr[4];
            int iAbs3 = (deferrableSurfaces12 == null || deferrableSurfaces13 == null) ? 0 : (int) Math.abs(deferrableSurfaces12.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - deferrableSurfaces13.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            DeferrableSurfaces1 deferrableSurfaces14 = deferrableSurfaces1Arr[6];
            DeferrableSurfaces1 deferrableSurfaces15 = deferrableSurfaces1Arr[2];
            int iMax = Math.max(iAbs3, (((deferrableSurfaces14 == null || deferrableSurfaces15 == null) ? 0 : (int) Math.abs(deferrableSurfaces14.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - deferrableSurfaces15.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) * 17) / 18);
            DeferrableSurfaces1 deferrableSurfaces16 = deferrableSurfaces1Arr[1];
            DeferrableSurfaces1 deferrableSurfaces17 = deferrableSurfaces1Arr[5];
            int iAbs4 = (deferrableSurfaces16 == null || deferrableSurfaces17 == null) ? 0 : (int) Math.abs(deferrableSurfaces16.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - deferrableSurfaces17.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            DeferrableSurfaces1 deferrableSurfaces18 = deferrableSurfaces1Arr[7];
            DeferrableSurfaces1 deferrableSurfaces19 = deferrableSurfaces1Arr[3];
            getCaptureBundle getcapturebundleTuitionPaymentFragmentspecialinlinedviewModeldefault1 = RequestProcessorCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getbufferformat, deferrableSurfaces1, deferrableSurfaces2, deferrableSurfaces3, deferrableSurfaces4, iMin2, Math.max(iMax, Math.max(iAbs4, (((deferrableSurfaces18 == null || deferrableSurfaces19 == null) ? 0 : (int) Math.abs(deferrableSurfaces18.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - deferrableSurfaces19.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) * 17) / 18)));
            DynamicRanges dynamicRanges = new DynamicRanges(getcapturebundleTuitionPaymentFragmentspecialinlinedviewModeldefault1.d, getcapturebundleTuitionPaymentFragmentspecialinlinedviewModeldefault1.b, deferrableSurfaces1Arr, BarcodeFormat.PDF_417);
            dynamicRanges.b(ResultMetadataType.ERROR_CORRECTION_LEVEL, getcapturebundleTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            QuirkSettingsLoader quirkSettingsLoader = (QuirkSettingsLoader) getcapturebundleTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1;
            if (quirkSettingsLoader != null) {
                dynamicRanges.b(ResultMetadataType.PDF417_EXTRA_METADATA, quirkSettingsLoader);
            }
            arrayList.add(dynamicRanges);
        }
        return (DynamicRanges[]) arrayList.toArray(new DynamicRanges[arrayList.size()]);
    }
}
