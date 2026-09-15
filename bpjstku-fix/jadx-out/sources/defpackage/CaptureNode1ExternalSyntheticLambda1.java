package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class CaptureNode1ExternalSyntheticLambda1 implements lambdaonCaptureProcessProgressed1androidxcameracoreimagecaptureCaptureNode1 {
    @Override // defpackage.lambdaonCaptureProcessProgressed1androidxcameracoreimagecaptureCaptureNode1
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf >= 0) {
            str = str.substring(iLastIndexOf + 1);
        }
        return "Loading ".concat(String.valueOf(str));
    }
}
