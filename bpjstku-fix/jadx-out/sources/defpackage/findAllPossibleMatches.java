package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.aztec.decoder.Decoder;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class findAllPossibleMatches implements canMatchBitDepth {
    @Override // defpackage.canMatchBitDepth
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    @Override // defpackage.canMatchBitDepth
    public final DynamicRanges TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceListWithTimeout surfacelistwithtimeout) throws NotFoundException, FormatException {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfacelistwithtimeout, null);
    }

    @Override // defpackage.canMatchBitDepth
    public final DynamicRanges TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceListWithTimeout surfacelistwithtimeout, Map<DecodeHintType, ?> map) throws Throwable {
        DeferrableSurfaces1[] deferrableSurfaces1Arr;
        DeferrableSurfaces1[] deferrableSurfaces1Arr2;
        NotFoundException notFoundException;
        canMatchEncoding canmatchencoding;
        if (surfacelistwithtimeout.TuitionPaymentFragmentbindingInflater1 == null) {
            surfacelistwithtimeout.TuitionPaymentFragmentbindingInflater1 = surfacelistwithtimeout.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
        }
        getRequiredAudioProfile getrequiredaudioprofile = new getRequiredAudioProfile(surfacelistwithtimeout.TuitionPaymentFragmentbindingInflater1);
        getCaptureBundle getcapturebundleTuitionPaymentFragmentbindingInflater1 = null;
        try {
            canResolveUnderSpecifiedTo canresolveunderspecifiedtoTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getrequiredaudioprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault3(false);
            deferrableSurfaces1Arr = canresolveunderspecifiedtoTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                deferrableSurfaces1Arr2 = deferrableSurfaces1Arr;
                notFoundException = null;
                getcapturebundleTuitionPaymentFragmentbindingInflater1 = new Decoder().TuitionPaymentFragmentbindingInflater1(canresolveunderspecifiedtoTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                e = null;
            } catch (FormatException e2) {
                e = e2;
                deferrableSurfaces1Arr2 = deferrableSurfaces1Arr;
                notFoundException = null;
            } catch (NotFoundException e3) {
                e = e3;
                deferrableSurfaces1Arr2 = deferrableSurfaces1Arr;
                notFoundException = e;
                e = null;
            }
        } catch (FormatException e4) {
            e = e4;
            deferrableSurfaces1Arr = null;
        } catch (NotFoundException e5) {
            e = e5;
            deferrableSurfaces1Arr = null;
        }
        if (getcapturebundleTuitionPaymentFragmentbindingInflater1 == null) {
            try {
                canResolveUnderSpecifiedTo canresolveunderspecifiedtoTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getrequiredaudioprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault3(true);
                deferrableSurfaces1Arr2 = canresolveunderspecifiedtoTuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                getcapturebundleTuitionPaymentFragmentbindingInflater1 = new Decoder().TuitionPaymentFragmentbindingInflater1(canresolveunderspecifiedtoTuitionPaymentFragmentspecialinlinedviewModeldefault4);
            } catch (FormatException | NotFoundException e6) {
                if (notFoundException != null) {
                    throw notFoundException;
                }
                if (e != null) {
                    throw e;
                }
                throw e6;
            }
        }
        DeferrableSurfaces1[] deferrableSurfaces1Arr3 = deferrableSurfaces1Arr2;
        if (map != null && (canmatchencoding = (canMatchEncoding) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK)) != null) {
            for (DeferrableSurfaces1 deferrableSurfaces1 : deferrableSurfaces1Arr3) {
                canmatchencoding.TuitionPaymentFragmentspecialinlinedviewModeldefault1(deferrableSurfaces1);
            }
        }
        DynamicRanges dynamicRanges = new DynamicRanges(getcapturebundleTuitionPaymentFragmentbindingInflater1.d, getcapturebundleTuitionPaymentFragmentbindingInflater1.b, getcapturebundleTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3, deferrableSurfaces1Arr3, BarcodeFormat.AZTEC, System.currentTimeMillis());
        List<byte[]> list = getcapturebundleTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (list != null) {
            dynamicRanges.b(ResultMetadataType.BYTE_SEGMENTS, list);
        }
        String str = getcapturebundleTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (str != null) {
            dynamicRanges.b(ResultMetadataType.ERROR_CORRECTION_LEVEL, str);
        }
        return dynamicRanges;
    }
}
