package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class createBitmapFromRgbaImage implements canMatchEncoding {
    List<DeferrableSurfaces1> TuitionPaymentFragmentbindingInflater1 = new ArrayList();
    private canMatchBitDepth TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public createBitmapFromRgbaImage(canMatchBitDepth canmatchbitdepth) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = canmatchbitdepth;
    }

    public final DynamicRanges TuitionPaymentFragmentspecialinlinedviewModeldefault2(DeferrableSurfacesExternalSyntheticLambda0 deferrableSurfacesExternalSyntheticLambda0) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentbindingInflater1(deferrableSurfacesExternalSyntheticLambda0));
    }

    protected surfaceListWithTimeout TuitionPaymentFragmentbindingInflater1(DeferrableSurfacesExternalSyntheticLambda0 deferrableSurfacesExternalSyntheticLambda0) {
        return new surfaceListWithTimeout(new ImageFormatConstants(deferrableSurfacesExternalSyntheticLambda0));
    }

    private DynamicRanges TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceListWithTimeout surfacelistwithtimeout) {
        DynamicRanges dynamicRangesTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.TuitionPaymentFragmentbindingInflater1.clear();
        try {
            canMatchBitDepth canmatchbitdepth = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (canmatchbitdepth instanceof tryIncrementAll) {
                tryIncrementAll tryincrementall = (tryIncrementAll) canmatchbitdepth;
                if (tryincrementall.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    tryincrementall.TuitionPaymentFragmentbindingInflater1(null);
                }
                dynamicRangesTuitionPaymentFragmentspecialinlinedviewModeldefault3 = tryincrementall.b(surfacelistwithtimeout);
            } else {
                dynamicRangesTuitionPaymentFragmentspecialinlinedviewModeldefault3 = canmatchbitdepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfacelistwithtimeout);
            }
            return dynamicRangesTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        } catch (Exception unused) {
            return null;
        } finally {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    @Override // defpackage.canMatchEncoding
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeferrableSurfaces1 deferrableSurfaces1) {
        this.TuitionPaymentFragmentbindingInflater1.add(deferrableSurfaces1);
    }
}
